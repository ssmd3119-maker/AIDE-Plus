package bin.mt.file.content;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract.Document;
import android.provider.DocumentsContract.Root;
import android.provider.DocumentsProvider;
import android.system.ErrnoException;
import android.system.Os;
import android.system.StructStat;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 * MT Manager's document provider: lets MT Manager browse this app's data
 * directory and its Android/data and Android/obb directories.
 * <p>
 * Document ids are "&lt;package&gt;/data/...", "&lt;package&gt;/android_data/..."
 * and "&lt;package&gt;/android_obb/..."; the package name alone is the root.
 */
public class MTDataFilesProvider extends DocumentsProvider {

    private static final String[] DEFAULT_ROOT_PROJECTION = {
        Root.COLUMN_ROOT_ID,
        Root.COLUMN_MIME_TYPES,
        Root.COLUMN_FLAGS,
        Root.COLUMN_ICON,
        Root.COLUMN_TITLE,
        Root.COLUMN_SUMMARY,
        Root.COLUMN_DOCUMENT_ID,
    };

    private static final String[] DEFAULT_DOCUMENT_PROJECTION = {
        Document.COLUMN_DOCUMENT_ID,
        Document.COLUMN_MIME_TYPE,
        Document.COLUMN_DISPLAY_NAME,
        Document.COLUMN_LAST_MODIFIED,
        Document.COLUMN_FLAGS,
        Document.COLUMN_SIZE,
        "mt_extras",
    };

    // S_IFMT and S_IFLNK
    private static final int S_IFMT = 0170000;
    private static final int S_IFLNK = 0120000;

    private String packageName;
    private File dataDir;
    private File androidDataDir;
    private File androidObbDir;

    @Override
    public final void attachInfo(Context context, ProviderInfo info) {
        super.attachInfo(context, info);
        packageName = context.getPackageName();
        dataDir = context.getFilesDir().getParentFile();
        androidDataDir = new File(Environment.getExternalStorageDirectory(), "Android/data/" + packageName);
        androidObbDir = new File(Environment.getExternalStorageDirectory(), "Android/obb/" + packageName);
    }

    @Override
    public final boolean onCreate() {
        return true;
    }

    @Override
    public final Cursor queryRoots(String[] projection) {
        ApplicationInfo appInfo = getContext().getApplicationInfo();
        String title = appInfo.loadLabel(getContext().getPackageManager()).toString();
        MatrixCursor cursor = new MatrixCursor(projection != null ? projection : DEFAULT_ROOT_PROJECTION);
        MatrixCursor.RowBuilder row = cursor.newRow();
        row.add(Root.COLUMN_ROOT_ID, packageName);
        row.add(Root.COLUMN_DOCUMENT_ID, packageName);
        row.add(Root.COLUMN_SUMMARY, packageName);
        row.add(Root.COLUMN_FLAGS, Root.FLAG_SUPPORTS_CREATE | Root.FLAG_SUPPORTS_IS_CHILD);
        row.add(Root.COLUMN_TITLE, title);
        row.add(Root.COLUMN_MIME_TYPES, "*/*");
        row.add(Root.COLUMN_ICON, appInfo.icon);
        return cursor;
    }

    @Override
    public final Cursor queryDocument(String documentId, String[] projection) throws FileNotFoundException {
        MatrixCursor cursor = new MatrixCursor(projection != null ? projection : DEFAULT_DOCUMENT_PROJECTION);
        includeFile(cursor, documentId, null);
        return cursor;
    }

    @Override
    public final Cursor queryChildDocuments(String parentDocumentId, String[] projection, String sortOrder) throws FileNotFoundException {
        if (parentDocumentId.endsWith("/")) {
            parentDocumentId = parentDocumentId.substring(0, parentDocumentId.length() - 1);
        }
        MatrixCursor cursor = new MatrixCursor(projection != null ? projection : DEFAULT_DOCUMENT_PROJECTION);
        File parent = getFileForDocId(parentDocumentId, true);
        if (parent == null) {
            // the root: list the three directories
            includeFile(cursor, parentDocumentId.concat("/data"), dataDir);
            if (androidDataDir.exists()) {
                includeFile(cursor, parentDocumentId.concat("/android_data"), androidDataDir);
            }
            if (androidObbDir.exists()) {
                includeFile(cursor, parentDocumentId.concat("/android_obb"), androidObbDir);
            }
        } else {
            File[] children = parent.listFiles();
            if (children != null) {
                for (File child : children) {
                    includeFile(cursor, parentDocumentId + "/" + child.getName(), child);
                }
            }
        }
        return cursor;
    }

    @Override
    public final ParcelFileDescriptor openDocument(String documentId, String mode, CancellationSignal signal) throws FileNotFoundException {
        File file = getFileForDocId(documentId, false);
        if (file == null) {
            throw new FileNotFoundException(documentId.concat(" not found"));
        }
        return ParcelFileDescriptor.open(file, ParcelFileDescriptor.parseMode(mode));
    }

    @Override
    public final boolean isChildDocument(String parentDocumentId, String documentId) {
        return documentId.startsWith(parentDocumentId);
    }

    @Override
    public final String getDocumentType(String documentId) throws FileNotFoundException {
        File file = getFileForDocId(documentId, true);
        return file == null ? Document.MIME_TYPE_DIR : getMimeType(file);
    }

    @Override
    public final String createDocument(String parentDocumentId, String mimeType, String displayName) throws FileNotFoundException {
        File parent = getFileForDocId(parentDocumentId, true);
        if (parent != null) {
            File file = new File(parent, displayName);
            int number = 2;
            while (file.exists()) {
                file = new File(parent, displayName + " (" + number + ")");
                number++;
            }
            try {
                boolean created = Document.MIME_TYPE_DIR.equals(mimeType) ? file.mkdir() : file.createNewFile();
                if (created) {
                    return parentDocumentId.endsWith("/")
                        ? parentDocumentId + file.getName()
                        : parentDocumentId + "/" + file.getName();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        throw new FileNotFoundException("Failed to create document in " + parentDocumentId + " with name " + displayName);
    }

    @Override
    public final void deleteDocument(String documentId) throws FileNotFoundException {
        File file = getFileForDocId(documentId, true);
        if (file == null || !deleteRecursively(file)) {
            throw new FileNotFoundException("Failed to delete document ".concat(documentId));
        }
    }

    @Override
    public final void removeDocument(String documentId, String parentDocumentId) throws FileNotFoundException {
        deleteDocument(documentId);
    }

    @Override
    public final String renameDocument(String documentId, String displayName) throws FileNotFoundException {
        File file = getFileForDocId(documentId, true);
        if (file != null && file.renameTo(new File(file.getParentFile(), displayName))) {
            int slash = documentId.lastIndexOf('/', documentId.length() - 2);
            return documentId.substring(0, slash) + "/" + displayName;
        }
        throw new FileNotFoundException("Failed to rename document " + documentId + " to " + displayName);
    }

    @Override
    public final String moveDocument(String sourceDocumentId, String sourceParentDocumentId, String targetParentDocumentId) throws FileNotFoundException {
        File source = getFileForDocId(sourceDocumentId, true);
        File targetParent = getFileForDocId(targetParentDocumentId, true);
        if (source != null && targetParent != null) {
            File target = new File(targetParent, source.getName());
            if (!target.exists() && source.renameTo(target)) {
                return targetParentDocumentId.endsWith("/")
                    ? targetParentDocumentId + target.getName()
                    : targetParentDocumentId + "/" + target.getName();
            }
        }
        throw new FileNotFoundException("Filed to move document " + sourceDocumentId + " to " + targetParentDocumentId);
    }

    /** MT Manager's extra calls: set the modified time, change permissions, create a symlink. */
    @Override
    public final Bundle call(String method, String arg, Bundle extras) {
        Bundle result = super.call(method, arg, extras);
        if (result != null) {
            return result;
        }
        if (!method.startsWith("mt:")) {
            return null;
        }
        Bundle out = new Bundle();
        try {
            List<String> segments = ((Uri) extras.getParcelable("uri")).getPathSegments();
            String documentId = segments.size() >= 4 ? segments.get(3) : segments.get(1);
            switch (method) {
                case "mt:setLastModified": {
                    File file = getFileForDocId(documentId, true);
                    if (file == null) {
                        out.putBoolean("result", false);
                    } else {
                        out.putBoolean("result", file.setLastModified(extras.getLong("time")));
                    }
                    break;
                }
                case "mt:setPermissions": {
                    File file = getFileForDocId(documentId, true);
                    if (file == null) {
                        out.putBoolean("result", false);
                        break;
                    }
                    try {
                        Os.chmod(file.getPath(), extras.getInt("permissions"));
                        out.putBoolean("result", true);
                    } catch (ErrnoException e) {
                        out.putBoolean("result", false);
                        out.putString("message", e.getMessage());
                    }
                    break;
                }
                case "mt:createSymlink": {
                    File file = getFileForDocId(documentId, false);
                    if (file == null) {
                        out.putBoolean("result", false);
                        break;
                    }
                    try {
                        Os.symlink(extras.getString("path"), file.getPath());
                        out.putBoolean("result", true);
                    } catch (ErrnoException e) {
                        out.putBoolean("result", false);
                        out.putString("message", e.getMessage());
                    }
                    break;
                }
                default:
                    out.putBoolean("result", false);
                    out.putString("message", "Unsupported method: ".concat(method));
                    break;
            }
        } catch (Exception e) {
            out.putBoolean("result", false);
            out.putString("message", e.toString());
        }
        return out;
    }

    /** Adds a row for the file, or for the root when the id has no file. */
    private void includeFile(MatrixCursor cursor, String documentId, File file) throws FileNotFoundException {
        if (file == null) {
            file = getFileForDocId(documentId, true);
        }
        if (file == null) {
            MatrixCursor.RowBuilder row = cursor.newRow();
            row.add(Document.COLUMN_DOCUMENT_ID, packageName);
            row.add(Document.COLUMN_DISPLAY_NAME, packageName);
            row.add(Document.COLUMN_SIZE, 0L);
            row.add(Document.COLUMN_MIME_TYPE, Document.MIME_TYPE_DIR);
            row.add(Document.COLUMN_LAST_MODIFIED, 0);
            row.add(Document.COLUMN_FLAGS, 0);
            return;
        }

        int flags;
        if (file.isDirectory()) {
            flags = file.canWrite() ? Document.FLAG_DIR_SUPPORTS_CREATE : 0;
        } else {
            flags = file.canWrite() ? Document.FLAG_SUPPORTS_WRITE : 0;
        }
        if (file.getParentFile().canWrite()) {
            flags |= Document.FLAG_SUPPORTS_DELETE | Document.FLAG_SUPPORTS_RENAME;
        }

        String path = file.getPath();
        String displayName;
        boolean addExtras;
        if (path.equals(dataDir.getPath())) {
            displayName = "data";
            addExtras = false;
        } else if (path.equals(androidDataDir.getPath())) {
            displayName = "android_data";
            addExtras = false;
        } else if (path.equals(androidObbDir.getPath())) {
            displayName = "android_obb";
            addExtras = false;
        } else {
            displayName = file.getName();
            addExtras = true;
        }

        MatrixCursor.RowBuilder row = cursor.newRow();
        row.add(Document.COLUMN_DOCUMENT_ID, documentId);
        row.add(Document.COLUMN_DISPLAY_NAME, displayName);
        row.add(Document.COLUMN_SIZE, file.length());
        row.add(Document.COLUMN_MIME_TYPE, getMimeType(file));
        row.add(Document.COLUMN_LAST_MODIFIED, file.lastModified());
        row.add(Document.COLUMN_FLAGS, flags);
        row.add("mt_path", file.getAbsolutePath());

        if (addExtras) {
            // "mode|uid|gid", plus "|target" for a symlink
            try {
                StringBuilder sb = new StringBuilder();
                StructStat stat = Os.lstat(path);
                sb.append(stat.st_mode).append('|').append(stat.st_uid).append('|').append(stat.st_gid);
                if ((stat.st_mode & S_IFMT) == S_IFLNK) {
                    sb.append('|').append(Os.readlink(path));
                }
                row.add("mt_extras", sb.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * The file of a document id, or null for the root.
     *
     * @param checkExists throw if the file (or symlink) does not exist
     */
    private File getFileForDocId(String documentId, boolean checkExists) throws FileNotFoundException {
        if (!documentId.startsWith(packageName)) {
            throw new FileNotFoundException(documentId.concat(" not found"));
        }
        String path = documentId.substring(packageName.length());
        if (path.startsWith("/")) {
            path = path.substring(1);
        }
        if (path.isEmpty()) {
            return null;
        }

        int slash = path.indexOf('/');
        String type;
        String subPath;
        if (slash == -1) {
            type = path;
            subPath = "";
        } else {
            type = path.substring(0, slash);
            subPath = path.substring(slash + 1);
        }

        File file = null;
        if (type.equalsIgnoreCase("data")) {
            file = new File(dataDir, subPath);
        } else if (type.equalsIgnoreCase("android_data")) {
            file = new File(androidDataDir, subPath);
        } else if (type.equalsIgnoreCase("android_obb")) {
            file = new File(androidObbDir, subPath);
        }
        if (file == null) {
            throw new FileNotFoundException(documentId.concat(" not found"));
        }
        if (checkExists) {
            try {
                Os.lstat(file.getPath());
            } catch (Exception e) {
                throw new FileNotFoundException(documentId.concat(" not found"));
            }
        }
        return file;
    }

    /** Deletes a file or directory tree; symlinks to directories are deleted, not followed. */
    private static boolean deleteRecursively(File file) {
        if (file.isDirectory()) {
            boolean symlink;
            try {
                symlink = (Os.lstat(file.getPath()).st_mode & S_IFMT) == S_IFLNK;
            } catch (ErrnoException e) {
                e.printStackTrace();
                symlink = false;
            }
            if (!symlink) {
                File[] children = file.listFiles();
                if (children != null) {
                    for (File child : children) {
                        if (!deleteRecursively(child)) {
                            return false;
                        }
                    }
                }
            }
        }
        return file.delete();
    }

    private static String getMimeType(File file) {
        if (file.isDirectory()) {
            return Document.MIME_TYPE_DIR;
        }
        String name = file.getName();
        int dot = name.lastIndexOf('.');
        if (dot >= 0) {
            String mime = MimeTypeMap.getSingleton().getMimeTypeFromExtension(name.substring(dot + 1).toLowerCase());
            if (mime != null) {
                return mime;
            }
        }
        return "application/octet-stream";
    }
}
