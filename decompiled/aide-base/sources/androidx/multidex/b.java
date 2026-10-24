package androidx.multidex;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* loaded from: classes.dex */
public final class b implements Closeable {
    private final File WB;
    private final RandomAccessFile fY;
    private final File jw;
    private final FileLock k2;
    private final long mb;
    private final FileChannel qp;

    class a implements FileFilter {
        a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return !file.getName().equals("MultiDex.lock");
        }
    }

    /* renamed from: androidx.multidex.b$b, reason: collision with other inner class name */
    private static class C0035b extends File {
        public long WB;

        public C0035b(File file, String str) {
            super(file, str);
            this.WB = -1L;
        }
    }

    b(File file, File file2) throws Throwable {
        Log.i("MultiDex", "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")");
        this.WB = file;
        this.jw = file2;
        this.mb = gn(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.fY = randomAccessFile;
        try {
            this.qp = randomAccessFile.getChannel();
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.k2 = this.qp.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e) {
                e = e;
                DW(this.qp);
                throw e;
            } catch (Error e2) {
                e = e2;
                DW(this.qp);
                throw e;
            } catch (RuntimeException e3) {
                e = e3;
                DW(this.qp);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e4) {
            DW(this.fY);
            throw e4;
        }
    }

    private static void DW(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("MultiDex", "Failed to close resource", e);
        }
    }

    private List<C0035b> EQ(Context context, String str) throws IOException {
        Log.i("MultiDex", "loading existing secondary dex files");
        String str2 = this.WB.getName() + ".classes";
        SharedPreferences sharedPreferencesHw = Hw(context);
        int i = sharedPreferencesHw.getInt(str + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i + (-1));
        int i2 = 2;
        while (i2 <= i) {
            C0035b c0035b = new C0035b(this.jw, str2 + i2 + ".zip");
            if (!c0035b.isFile()) {
                throw new IOException("Missing extracted secondary dex file '" + c0035b.getPath() + "'");
            }
            c0035b.WB = gn(c0035b);
            long j = sharedPreferencesHw.getLong(str + "dex.crc." + i2, -1L);
            long j2 = sharedPreferencesHw.getLong(str + "dex.time." + i2, -1L);
            long jLastModified = c0035b.lastModified();
            if (j2 == jLastModified) {
                String str3 = str2;
                SharedPreferences sharedPreferences = sharedPreferencesHw;
                if (j == c0035b.WB) {
                    arrayList.add(c0035b);
                    i2++;
                    sharedPreferencesHw = sharedPreferences;
                    str2 = str3;
                }
            }
            throw new IOException("Invalid extracted dex: " + c0035b + " (key \"" + str + "\"), expected modification time: " + j2 + ", modification time: " + jLastModified + ", expected crc: " + j + ", file crc: " + c0035b.WB);
        }
        return arrayList;
    }

    private static void FH(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File fileCreateTempFile = File.createTempFile("tmp-" + str, ".zip", file.getParentFile());
        Log.i("MultiDex", "Extracting " + fileCreateTempFile.getPath());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(fileCreateTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                for (int i = inputStream.read(bArr); i != -1; i = inputStream.read(bArr)) {
                    zipOutputStream.write(bArr, 0, i);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (!fileCreateTempFile.setReadOnly()) {
                    throw new IOException("Failed to mark readonly \"" + fileCreateTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
                }
                Log.i("MultiDex", "Renaming to " + file.getPath());
                if (fileCreateTempFile.renameTo(file)) {
                    return;
                }
                throw new IOException("Failed to rename \"" + fileCreateTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            } catch (Throwable th) {
                zipOutputStream.close();
                throw th;
            }
        } finally {
            DW(inputStream);
            fileCreateTempFile.delete();
        }
    }

    private static SharedPreferences Hw(Context context) {
        return context.getSharedPreferences("multidex.version", Build.VERSION.SDK_INT < 11 ? 0 : 4);
    }

    private static void J0(Context context, String str, long j, long j2, List<C0035b> list) {
        SharedPreferences.Editor editorEdit = Hw(context).edit();
        editorEdit.putLong(str + AppMeasurement.Param.TIMESTAMP, j);
        editorEdit.putLong(str + "crc", j2);
        editorEdit.putInt(str + "dex.number", list.size() + 1);
        int i = 2;
        for (C0035b c0035b : list) {
            editorEdit.putLong(str + "dex.crc." + i, c0035b.WB);
            editorEdit.putLong(str + "dex.time." + i, c0035b.lastModified());
            i++;
        }
        editorEdit.commit();
    }

    private static long Zo(File file) {
        long jLastModified = file.lastModified();
        return jLastModified == -1 ? jLastModified - 1 : jLastModified;
    }

    private static long gn(File file) throws IOException {
        long jFH = c.FH(file);
        return jFH == -1 ? jFH - 1 : jFH;
    }

    private void j6() {
        File[] fileArrListFiles = this.jw.listFiles(new a());
        if (fileArrListFiles == null) {
            Log.w("MultiDex", "Failed to list secondary dex dir content (" + this.jw.getPath() + ").");
            return;
        }
        for (File file : fileArrListFiles) {
            Log.i("MultiDex", "Trying to delete old file " + file.getPath() + " of size " + file.length());
            if (file.delete()) {
                Log.i("MultiDex", "Deleted old file " + file.getPath());
            } else {
                Log.w("MultiDex", "Failed to delete old file " + file.getPath());
            }
        }
    }

    private static boolean u7(Context context, File file, long j, String str) {
        SharedPreferences sharedPreferencesHw = Hw(context);
        if (sharedPreferencesHw.getLong(str + AppMeasurement.Param.TIMESTAMP, -1L) == Zo(file)) {
            if (sharedPreferencesHw.getLong(str + "crc", -1L) == j) {
                return false;
            }
        }
        return true;
    }

    private List<C0035b> we() throws IOException {
        boolean z;
        String str = this.WB.getName() + ".classes";
        j6();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.WB);
        try {
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            int i = 2;
            while (entry != null) {
                C0035b c0035b = new C0035b(this.jw, str + i + ".zip");
                arrayList.add(c0035b);
                Log.i("MultiDex", "Extraction is needed for file " + c0035b);
                int i2 = 0;
                boolean z2 = false;
                while (i2 < 3 && !z2) {
                    int i3 = i2 + 1;
                    FH(zipFile, entry, c0035b, str);
                    try {
                        c0035b.WB = gn(c0035b);
                        z = true;
                    } catch (IOException e) {
                        Log.w("MultiDex", "Failed to read crc from " + c0035b.getAbsolutePath(), e);
                        z = false;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Extraction ");
                    sb.append(z ? "succeeded" : "failed");
                    sb.append(" '");
                    sb.append(c0035b.getAbsolutePath());
                    sb.append("': length ");
                    sb.append(c0035b.length());
                    sb.append(" - crc: ");
                    sb.append(c0035b.WB);
                    Log.i("MultiDex", sb.toString());
                    if (!z) {
                        c0035b.delete();
                        if (c0035b.exists()) {
                            Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + c0035b.getPath() + "'");
                        }
                    }
                    z2 = z;
                    i2 = i3;
                }
                if (!z2) {
                    throw new IOException("Could not create zip file " + c0035b.getAbsolutePath() + " for secondary dex (" + i + ")");
                }
                i++;
                entry = zipFile.getEntry("classes" + i + ".dex");
            }
            try {
                zipFile.close();
            } catch (IOException e2) {
                Log.w("MultiDex", "Failed to close resource", e2);
            }
            return arrayList;
        } finally {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.k2.release();
        this.qp.close();
        this.fY.close();
    }

    List<? extends File> tp(Context context, String str, boolean z) throws IOException {
        List<C0035b> listWe;
        List<C0035b> listEQ;
        Log.i("MultiDex", "MultiDexExtractor.load(" + this.WB.getPath() + ", " + z + ", " + str + ")");
        if (!this.k2.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        if (!z && !u7(context, this.WB, this.mb, str)) {
            try {
                listEQ = EQ(context, str);
            } catch (IOException e) {
                Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e);
                listWe = we();
                J0(context, str, Zo(this.WB), this.mb, listWe);
            }
            Log.i("MultiDex", "load found " + listEQ.size() + " secondary dex files");
            return listEQ;
        }
        if (z) {
            Log.i("MultiDex", "Forced extraction must be performed.");
        } else {
            Log.i("MultiDex", "Detected that extraction must be performed.");
        }
        listWe = we();
        J0(context, str, Zo(this.WB), this.mb, listWe);
        listEQ = listWe;
        Log.i("MultiDex", "load found " + listEQ.size() + " secondary dex files");
        return listEQ;
    }
}
