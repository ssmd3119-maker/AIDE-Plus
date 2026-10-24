package com.aide.codemodel.api;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.codemodel.api.abstraction.CodeModel;
import com.aide.codemodel.api.abstraction.Language;
import com.aide.codemodel.api.callback.OpenFileCallback;
import com.aide.codemodel.api.collections.FunctionOfIntInt;
import com.aide.codemodel.api.collections.ListOfInt;
import com.aide.codemodel.api.collections.MapOfIntInt;
import com.aide.codemodel.api.collections.StoreInputStream;
import com.aide.codemodel.api.collections.StoreOutputStream;
import java.io.CharArrayReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.zip.CRC32;

@cy(clazz = 2498414722610032676L, container = 2498414722610032676L, user = true)
/* loaded from: classes.dex */
public class FileEntry {

    @gy
    private static /* synthetic */ boolean Mr;

    @fy
    private static /* synthetic */ boolean j3;

    @dy(field = -1153648687970114225L)
    private ListOfInt children;

    @dy(field = -2968462626538868163L)
    private long diskVersion;

    @dy(field = 2279125863542383680L)
    private boolean exists;

    @dy(field = -420321718668989984L)
    private final FileSpace fileSpace;

    @dy(field = -985645619307406975L)
    private int id;

    @dy(field = -2203459274126725524L)
    private boolean isArchive;

    @dy(field = -1771885629155794880L)
    private boolean isArchiveEntry;

    @dy(field = -2146910200068330865L)
    private boolean isDirectory;

    @dy(field = -1134658247331791115L)
    private long lastModified;

    @dy(field = -2242915192729683756L)
    private MapOfIntInt myEntries;

    @dy(field = 893744007371506416L)
    private final IdentifierSpace myIdentifiers;

    @dy(field = -1782221487396638925L)
    private boolean myLoaded;

    @dy(field = -2670176756295546192L)
    private int myNameIdentifier;

    @dy(field = -6179657320039467317L)
    private final OpenFileCallback myOpenFileCallback;

    @dy(field = 2173251054408592855L)
    private FileEntry myParentDir;

    @dy(field = -6961868182622775480L)
    private FileEntry parentArchiveFile;

    @dy(field = -1109507984680596925L)
    private String relativeArchiveEntryPath;

    @dy(field = -2067194938766722884L)
    private long version;

    static {
        iy.Zo(FileEntry.class);
    }

    @ey(method = -165970578936775080L)
    public FileEntry(IdentifierSpace identifierSpace, FileSpace fileSpace, OpenFileCallback openFileCallback, int i, FileEntry fileEntry) {
        try {
            if (j3) {
                iy.J8(496103287690214875L, null, identifierSpace, fileSpace, openFileCallback, new Integer(i), fileEntry);
            }
            this.myIdentifiers = identifierSpace;
            this.fileSpace = fileSpace;
            this.myOpenFileCallback = openFileCallback;
            this.myNameIdentifier = i;
            this.myParentDir = fileEntry;
            this.id = fileSpace.declareEntry(this);
            this.version = -1L;
            init();
        } catch (Throwable th) {
            if (Mr) {
                iy.lg(th, 496103287690214875L, null, identifierSpace, fileSpace, openFileCallback, new Integer(i), fileEntry);
            }
            throw th;
        }
    }

    @ey(method = -766478806282087497L)
    private CodeModel P8() {
        try {
            if (j3) {
                iy.gn(224261678421485364L, this);
            }
            return this.fileSpace.getCodeModelWrapper(this);
        } catch (Throwable th) {
            if (Mr) {
                iy.aM(th, 224261678421485364L, this);
            }
            throw th;
        }
    }

    @ey(method = 8078130225696918383L)
    private void addCustomEntry(String str, String str2) {
        try {
            if (j3) {
                iy.EQ(2316103684615683600L, this, str, str2);
            }
            int iIndexOf = str.indexOf(47);
            if (iIndexOf == -1) {
                iIndexOf = str.indexOf(92);
            }
            if (iIndexOf == -1) {
                FileEntry fileEntryAddFile = addFile(str);
                fileEntryAddFile.myLoaded = true;
                fileEntryAddFile.isArchiveEntry = true;
                fileEntryAddFile.relativeArchiveEntryPath = str2;
                fileEntryAddFile.parentArchiveFile = this.parentArchiveFile;
                return;
            }
            String strSubstring = str.substring(0, iIndexOf);
            FileEntry entry = getEntry(strSubstring);
            if (!entry.exists) {
                addDirectory(strSubstring);
            }
            entry.myLoaded = true;
            entry.isArchiveEntry = true;
            entry.parentArchiveFile = this.parentArchiveFile;
            entry.relativeArchiveEntryPath = str2;
            entry.addCustomEntry(str.substring(iIndexOf + 1, str.length()), str2);
        } catch (Throwable th) {
            if (Mr) {
                iy.Mr(th, 2316103684615683600L, this, str, str2);
            }
            throw th;
        }
    }

    @ey(method = 1651834009356838281L)
    private FileEntry addDirectory(String str) {
        try {
            if (j3) {
                iy.tp(2956631444901307116L, this, str);
            }
            FileEntry entry = getEntry(str);
            entry.isDirectory = true;
            entry.exists = true;
            if (this.children == null) {
                this.children = new ListOfInt();
            }
            this.children.add(entry.getId());
            return entry;
        } catch (Throwable th) {
            if (Mr) {
                iy.j3(th, 2956631444901307116L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 831660704050758912L)
    private FileEntry addFile(String str) {
        try {
            if (j3) {
                iy.tp(294041077736232395L, this, str);
            }
            FileEntry entry = getEntry(str);
            entry.isDirectory = false;
            entry.exists = true;
            if (this.children == null) {
                this.children = new ListOfInt();
            }
            this.children.add(entry.getId());
            return entry;
        } catch (Throwable th) {
            if (Mr) {
                iy.j3(th, 294041077736232395L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 3194056493560414796L)
    private long fetchDiskVersion() {
        try {
            if (j3) {
                iy.gn(1235517321074967513L, this);
            }
            if (!exists()) {
                return 0L;
            }
            if (this.isArchive) {
                return getCodeModel().getArchiveVersion(getPathString());
            }
            if (this.isArchiveEntry) {
                return this.parentArchiveFile.getVersion();
            }
            if (!isRootDirectory() || System.getProperty("os.name").toUpperCase(Locale.US).indexOf("WINDOWS") == -1) {
                return fetchFileDiskVersion();
            }
            return 0L;
        } catch (Throwable th) {
            if (Mr) {
                iy.aM(th, 1235517321074967513L, this);
            }
            throw th;
        }
    }

    @ey(method = 1375578962497052100L)
    private long fetchFileDiskVersion() {
        try {
            if (j3) {
                iy.gn(6427644460360690349L, this);
            }
            File file = new File(getPathString());
            if (file.isDirectory()) {
                return file.lastModified();
            }
            if (!file.isFile()) {
                return 0L;
            }
            long jLastModified = file.lastModified();
            if (this.lastModified == -1 || this.lastModified != jLastModified) {
                this.lastModified = jLastModified;
                try {
                    CRC32 crc32 = this.fileSpace.crc32;
                    byte[] bArr = this.fileSpace.bytes;
                    crc32.reset();
                    FileInputStream fileInputStream = new FileInputStream(file);
                    while (true) {
                        try {
                            int i = fileInputStream.read(bArr);
                            if (i == -1) {
                                break;
                            }
                            crc32.update(bArr, 0, i);
                        } catch (Throwable th) {
                            fileInputStream.close();
                            throw th;
                        }
                    }
                    fileInputStream.close();
                    long value = crc32.getValue();
                    this.diskVersion = value;
                    if (value == 0) {
                        this.diskVersion = 4294967296L;
                    }
                } catch (IOException unused) {
                }
            }
            return this.diskVersion;
        } catch (Throwable th2) {
            if (Mr) {
                iy.aM(th2, 6427644460360690349L, this);
            }
            throw th2;
        }
    }

    @ey(method = 273797371942041261L)
    private void init() {
        try {
            if (j3) {
                iy.gn(-2444764254617954192L, this);
            }
            this.myLoaded = false;
            this.parentArchiveFile = null;
            this.relativeArchiveEntryPath = null;
            this.isArchiveEntry = false;
            this.isDirectory = false;
            this.isArchive = false;
            this.exists = false;
        } catch (Throwable th) {
            if (Mr) {
                iy.aM(th, -2444764254617954192L, this);
            }
            throw th;
        }
    }

    @ey(method = 277226930707599015L)
    private void load() {
        try {
            if (j3) {
                iy.gn(-2439187932876123984L, this);
            }
            if (this.myLoaded) {
                return;
            }
            if (this.myParentDir != null) {
                this.myParentDir.load();
            }
            if (this.myLoaded) {
                return;
            }
            this.myLoaded = true;
            try {
                String pathString = getPathString();
                if (isRootDirectory() && System.getProperty("os.name").toUpperCase(Locale.US).indexOf("WINDOWS") != -1) {
                    for (char c = 'A'; c <= 'Z'; c = (char) (c + 1)) {
                        addDirectory(c + ":");
                    }
                    this.exists = true;
                    return;
                }
                int i = 0;
                if (P8() != null && P8().isSupportArchiveFile()) {
                    this.isArchive = true;
                    try {
                        this.version = P8().getArchiveVersion(pathString);
                        String[] archiveEntries = P8().getArchiveEntries(pathString);
                        if (archiveEntries != null) {
                            this.parentArchiveFile = this;
                            this.isDirectory = true;
                            int length = archiveEntries.length;
                            while (i < length) {
                                String str = archiveEntries[i];
                                if (str != null) {
                                    addCustomEntry(str, str);
                                }
                                i++;
                            }
                        }
                    } catch (IOException unused) {
                    }
                    this.exists = true;
                    return;
                }
                if (new File(pathString).isDirectory()) {
                    String[] list = new File(pathString + File.separatorChar).list();
                    if (list != null) {
                        while (i < list.length) {
                            if (new File(pathString + File.separatorChar + list[i]).isDirectory()) {
                                addDirectory(list[i]);
                            } else {
                                addFile(list[i]);
                            }
                            i++;
                        }
                    }
                    this.exists = true;
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable th) {
            if (Mr) {
                iy.aM(th, -2439187932876123984L, this);
            }
            throw th;
        }
    }

    @ey(method = 4826822936496774784L)
    public boolean I() {
        try {
            if (j3) {
                iy.gn(2133596324805806133L, this);
            }
            return this.fileSpace.aj(this);
        } catch (Throwable th) {
            if (Mr) {
                iy.aM(th, 2133596324805806133L, this);
            }
            throw th;
        }
    }

    @ey(method = -290724972890283033L)
    public String Mr(int i, int i2) {
        try {
            if (j3) {
                iy.EQ(-922937757469198144L, this, new Integer(i), new Integer(i2));
            }
            StringBuffer stringBuffer = new StringBuffer();
            try {
                Reader reader = getReader();
                try {
                    char[] cArr = this.fileSpace.chars;
                    int i3 = 1;
                    int i4 = 1;
                    while (true) {
                        int i5 = reader.read(cArr);
                        if (i5 == -1) {
                            break;
                        }
                        for (int i6 = 0; i6 < i5; i6++) {
                            char c = cArr[i6];
                            if (c != '\n') {
                                if (i3 == i && i4 < i2) {
                                    stringBuffer.append(c);
                                }
                                i4++;
                            } else {
                                i3++;
                                i4 = 1;
                            }
                        }
                    }
                    reader.close();
                } catch (Throwable th) {
                    reader.close();
                    throw th;
                }
            } catch (IOException unused) {
            }
            return stringBuffer.toString();
        } catch (Throwable th2) {
            if (Mr) {
                iy.Mr(th2, -922937757469198144L, this, new Integer(i), new Integer(i2));
            }
            throw th2;
        }
    }

    @ey(method = -427299648061526020L)
    public int QX() {
        try {
            if (j3) {
                iy.gn(4420273482279462027L, this);
            }
            return this.myNameIdentifier;
        } catch (Throwable th) {
            if (Mr) {
                iy.aM(th, 4420273482279462027L, this);
            }
            throw th;
        }
    }

    @ey(method = 285247894416667988L)
    public String U2(int i, int i2) {
        try {
            if (j3) {
                iy.EQ(-522966096795470307L, this, new Integer(i), new Integer(i2));
            }
            StringBuffer stringBuffer = new StringBuffer();
            try {
                Reader reader = getReader();
                try {
                    char[] cArr = this.fileSpace.chars;
                    int i3 = 1;
                    int i4 = 1;
                    while (true) {
                        int i5 = reader.read(cArr);
                        if (i5 == -1) {
                            break;
                        }
                        for (int i6 = 0; i6 < i5; i6++) {
                            char c = cArr[i6];
                            if (c != '\n') {
                                if (i3 == i && i4 >= i2) {
                                    stringBuffer.append(c);
                                }
                                i4++;
                            } else {
                                i3++;
                                i4 = 1;
                            }
                        }
                    }
                    reader.close();
                } catch (Throwable th) {
                    reader.close();
                    throw th;
                }
            } catch (IOException unused) {
            }
            return stringBuffer.toString();
        } catch (Throwable th2) {
            if (Mr) {
                iy.Mr(th2, -522966096795470307L, this, new Integer(i), new Integer(i2));
            }
            throw th2;
        }
    }

    @ey(method = 3384235949724203355L)
    public List<String> a8() {
        try {
            if (j3) {
                iy.gn(-2862617040598774868L, this);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add("");
            try {
                Reader reader = getReader();
                try {
                    StringBuffer stringBuffer = new StringBuffer();
                    char[] cArr = this.fileSpace.chars;
                    while (true) {
                        int i = reader.read(cArr);
                        if (i == -1) {
                            break;
                        }
                        for (int i2 = 0; i2 < i; i2++) {
                            char c = cArr[i2];
                            if (c != '\n') {
                                stringBuffer.append(c);
                            } else {
                                arrayList.add(stringBuffer.toString());
                                stringBuffer.setLength(0);
                            }
                        }
                    }
                    reader.close();
                } catch (Throwable th) {
                    reader.close();
                    throw th;
                }
            } catch (IOException unused) {
            }
            return arrayList;
        } catch (Throwable th2) {
            if (Mr) {
                iy.aM(th2, -2862617040598774868L, this);
            }
            throw th2;
        }
    }

    @ey(method = 906324183718595900L)
    public boolean canCodeAnalyzer() {
        try {
            if (j3) {
                iy.gn(1035275973119537121L, this);
            }
            if (getCodeModel() == null) {
                return false;
            }
            Iterator<Language> it = getCodeModel().getLanguages().iterator();
            while (it.hasNext()) {
                if (it.next().getCodeAnalyzer() != null) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (Mr) {
                iy.aM(th, 1035275973119537121L, this);
            }
            throw th;
        }
    }

    @ey(method = 374336464754713705L)
    public boolean equals(Object obj) {
        try {
            if (j3) {
                iy.tp(-108409150634798100L, this, obj);
            }
            if (obj instanceof FileEntry) {
                return ((FileEntry) obj).getId() == this.id;
            }
            return false;
        } catch (Throwable th) {
            if (Mr) {
                iy.j3(th, -108409150634798100L, this, obj);
            }
            throw th;
        }
    }

    @ey(method = -588241794041388723L)
    public boolean exists() {
        try {
            if (j3) {
                iy.gn(-2772179996724754496L, this);
            }
            load();
            return this.exists;
        } catch (Throwable th) {
            if (Mr) {
                iy.aM(th, -2772179996724754496L, this);
            }
            throw th;
        }
    }

    @ey(method = -6597768026930037215L)
    public long getArchiveVersion() {
        try {
            if (j3) {
                iy.gn(2966404874425391712L, this);
            }
            if (isArchiveEntry()) {
                return getParentArchive().getSyntaxVersion();
            }
            return 0L;
        } catch (Throwable th) {
            if (Mr) {
                iy.aM(th, 2966404874425391712L, this);
            }
            throw th;
        }
    }

    @ey(method = 3978688514979044552L)
    public int getChildCount() {
        try {
            if (j3) {
                iy.gn(659776510639462025L, this);
            }
            load();
            if (this.children == null) {
                return 0;
            }
            return this.children.size();
        } catch (Throwable th) {
            if (Mr) {
                iy.aM(th, 659776510639462025L, this);
            }
            throw th;
        }
    }

    @ey(method = -4048008246976593148L)
    public FileEntry getChildEntry(int i) {
        try {
            if (j3) {
                iy.u7(-1662104188619811563L, this, i);
            }
            return this.fileSpace.getFileEntry(this.children.get(i));
        } catch (Throwable th) {
            if (Mr) {
                iy.j3(th, -1662104188619811563L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -426812632587133989L)
    public CodeModel getCodeModel() {
        try {
            if (j3) {
                iy.gn(5074544171273786544L, this);
            }
            return this.fileSpace.getCodeModel(this);
        } catch (Throwable th) {
            if (Mr) {
                iy.aM(th, 5074544171273786544L, this);
            }
            throw th;
        }
    }

    @ey(method = 2356792863285729360L)
    public long getDiskVersion() {
        try {
            if (j3) {
                iy.gn(-104835136273177065L, this);
            }
            load();
            return isOpen() ? fetchDiskVersion() : getVersion();
        } catch (Throwable th) {
            if (Mr) {
                iy.aM(th, -104835136273177065L, this);
            }
            throw th;
        }
    }

    @ey(method = 308018504156488125L)
    public FileEntry getEntry(String str) {
        try {
            if (j3) {
                iy.tp(-217009609765557932L, this, str);
            }
            if (this.myEntries == null) {
                this.myEntries = new MapOfIntInt();
            }
            int i = this.myIdentifiers.get(str);
            if (!this.myEntries.v5(i)) {
                this.myEntries.gn(i, new FileEntry(this.myIdentifiers, this.fileSpace, this.myOpenFileCallback, i, this).getId());
            }
            return this.fileSpace.getFileEntry(this.myEntries.VH(i));
        } catch (Throwable th) {
            if (Mr) {
                iy.j3(th, -217009609765557932L, this, str);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    @ey(method = 5138555532475180767L)
    public String getExtensionString() {
        long jSubstring = -2259415113590980200;
        try {
            if (j3) {
                iy.gn(-2259415113590980200L, this);
            }
            String fullNameString = getFullNameString();
            if (fullNameString.lastIndexOf(46) <= 0) {
                return "";
            }
            jSubstring = fullNameString.substring(fullNameString.lastIndexOf(46), fullNameString.length());
            return jSubstring;
        } catch (Throwable th) {
            if (Mr) {
                iy.aM(th, jSubstring, this);
            }
            throw th;
        }
    }

    @ey(method = -4064189968213810348L)
    public String getFullNameString() {
        try {
            if (j3) {
                iy.gn(5275710222700398551L, this);
            }
            return this.myIdentifiers.getString(this.myNameIdentifier);
        } catch (Throwable th) {
            if (Mr) {
                iy.aM(th, 5275710222700398551L, this);
            }
            throw th;
        }
    }

    @ey(method = 2986843694483988328L)
    public int getId() {
        try {
            if (j3) {
                iy.gn(-1933641660562046751L, this);
            }
            return this.id;
        } catch (Throwable th) {
            if (Mr) {
                iy.aM(th, -1933641660562046751L, this);
            }
            throw th;
        }
    }

    @ey(method = 4390735424790291675L)
    public int getNameIdentifier() {
        try {
            if (j3) {
                iy.gn(72340162344168368L, this);
            }
            String fullNameString = getFullNameString();
            if (!isDirectory() && fullNameString.lastIndexOf(46) > 0) {
                fullNameString = fullNameString.substring(0, fullNameString.lastIndexOf(46));
            }
            return this.myIdentifiers.get(fullNameString);
        } catch (Throwable th) {
            if (Mr) {
                iy.aM(th, 72340162344168368L, this);
            }
            throw th;
        }
    }

    @ey(method = -2270618091186360993L)
    public FileEntry getParentArchive() {
        try {
            if (j3) {
                iy.gn(-3788345496668867288L, this);
            }
            return this.parentArchiveFile;
        } catch (Throwable th) {
            if (Mr) {
                iy.aM(th, -3788345496668867288L, this);
            }
            throw th;
        }
    }

    @ey(method = 3352686949586184540L)
    public FileEntry getParentDirectory() {
        try {
            if (j3) {
                iy.gn(-3850024799201559055L, this);
            }
            return this.myParentDir;
        } catch (Throwable th) {
            if (Mr) {
                iy.aM(th, -3850024799201559055L, this);
            }
            throw th;
        }
    }

    @ey(method = -2130692667452094683L)
    public String getPathString() {
        try {
            if (j3) {
                iy.gn(-4923519631291221096L, this);
            }
            if (this.myParentDir == null) {
                return "";
            }
            if (this.myParentDir.myParentDir == null) {
                return getFullNameString();
            }
            return this.myParentDir.getPathString() + File.separator + getFullNameString();
        } catch (Throwable th) {
            if (Mr) {
                iy.aM(th, -4923519631291221096L, this);
            }
            throw th;
        }
    }

    @ey(method = -1421527428679291724L)
    public Reader getReader() {
        try {
            if (j3) {
                iy.gn(-3702816406202117193L, this);
            }
            load();
            if (isOpen()) {
                return this.fileSpace.J0(this.myOpenFileCallback.j6(this));
            }
            if (!exists()) {
                return new CharArrayReader(new char[0]);
            }
            if (!isSynchronized()) {
                System.out.println("File not synchronized " + getPathString());
            }
            try {
                if (!this.isArchiveEntry) {
                    return this.fileSpace.J0(this.fileSpace.createBomReader(new FileInputStream(getPathString()), this.fileSpace.getEncoding()));
                }
                return this.fileSpace.J0(getCodeModel().getArchiveEntryReader(this.parentArchiveFile.getPathString(), getRelativeArchivePath(), this.fileSpace.getEncoding()));
            } catch (IOException unused) {
                return new CharArrayReader(new char[0]);
            }
        } catch (Throwable th) {
            if (Mr) {
                iy.aM(th, -3702816406202117193L, this);
            }
            throw th;
        }
    }

    @ey(method = -75044158574516956L)
    public String getRelativeArchivePath() {
        try {
            if (j3) {
                iy.gn(-2705648750944135875L, this);
            }
            return this.relativeArchiveEntryPath;
        } catch (Throwable th) {
            if (Mr) {
                iy.aM(th, -2705648750944135875L, this);
            }
            throw th;
        }
    }

    @ey(method = 1552392781644625896L)
    public long getSize() {
        try {
            if (j3) {
                iy.gn(2546589310526624677L, this);
            }
            load();
            if (isOpen()) {
                return this.myOpenFileCallback.getOpenFileSize(this);
            }
            String pathString = getPathString();
            if (new File(pathString).exists()) {
                return new File(pathString).length();
            }
            return 0L;
        } catch (Throwable th) {
            if (Mr) {
                iy.aM(th, 2546589310526624677L, this);
            }
            throw th;
        }
    }

    @ey(method = 1210653465640920027L)
    public FileEntry getSuccessorFile() {
        try {
            if (j3) {
                iy.gn(-597270639028124208L, this);
            }
            FileEntry parentDirectory = getParentDirectory();
            int childCount = parentDirectory.getChildCount();
            for (int i = 0; i < childCount - 1; i++) {
                if (parentDirectory.getChildEntry(i) == this) {
                    return parentDirectory.getChildEntry(i + 1);
                }
            }
            return null;
        } catch (Throwable th) {
            if (Mr) {
                iy.aM(th, -597270639028124208L, this);
            }
            throw th;
        }
    }

    @ey(method = -1063101505161497904L)
    public long getSyntaxVersion() {
        try {
            if (j3) {
                iy.gn(-5001536258541085567L, this);
            }
            return this.fileSpace.getSyntaxVersion(this);
        } catch (Throwable th) {
            if (Mr) {
                iy.aM(th, -5001536258541085567L, this);
            }
            throw th;
        }
    }

    @ey(method = 3948424809311310849L)
    public long getVersion() {
        try {
            if (j3) {
                iy.gn(2834021777894808380L, this);
            }
            load();
            if (!this.isArchiveEntry && isOpen()) {
                this.version = -1L;
                return this.myOpenFileCallback.DW(this);
            }
            if (this.version == -1) {
                this.version = fetchDiskVersion();
            }
            return this.version;
        } catch (Throwable th) {
            if (Mr) {
                iy.aM(th, 2834021777894808380L, this);
            }
            throw th;
        }
    }

    @ey(method = 2349505992413036345L)
    public int gn() {
        try {
            if (j3) {
                iy.gn(4096743012350925840L, this);
            }
            return this.fileSpace.getAssembly(this);
        } catch (Throwable th) {
            if (Mr) {
                iy.aM(th, 4096743012350925840L, this);
            }
            throw th;
        }
    }

    @ey(method = -3139361280642363800L)
    public int hashCode() {
        try {
            if (j3) {
                iy.gn(1790813727665521007L, this);
            }
            return this.id;
        } catch (Throwable th) {
            if (Mr) {
                iy.aM(th, 1790813727665521007L, this);
            }
            throw th;
        }
    }

    @ey(method = -2065269588258763537L)
    public boolean isArchive() {
        try {
            if (j3) {
                iy.gn(3181658584941592452L, this);
            }
            return this.isArchive;
        } catch (Throwable th) {
            if (Mr) {
                iy.aM(th, 3181658584941592452L, this);
            }
            throw th;
        }
    }

    @ey(method = -3986305772645614645L)
    public boolean isArchiveEntry() {
        try {
            if (j3) {
                iy.gn(4827603790915307824L, this);
            }
            return this.isArchiveEntry;
        } catch (Throwable th) {
            if (Mr) {
                iy.aM(th, 4827603790915307824L, this);
            }
            throw th;
        }
    }

    @ey(method = 4808822293826591040L)
    public boolean isDirectory() {
        try {
            if (j3) {
                iy.gn(-2386341712694554125L, this);
            }
            load();
            return this.isDirectory;
        } catch (Throwable th) {
            if (Mr) {
                iy.aM(th, -2386341712694554125L, this);
            }
            throw th;
        }
    }

    @ey(method = -1636500890916218463L)
    public boolean isEnclosingDir(FileEntry fileEntry) {
        try {
            if (j3) {
                iy.tp(-1772249522226942976L, this, fileEntry);
            }
            while (!fileEntry.isRootDirectory()) {
                if (fileEntry == this) {
                    return true;
                }
                fileEntry = fileEntry.getParentDirectory();
            }
            return false;
        } catch (Throwable th) {
            if (Mr) {
                iy.j3(th, -1772249522226942976L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = -1991591908451132625L)
    public boolean isOpen() {
        try {
            if (j3) {
                iy.gn(1865582721013916352L, this);
            }
            if (this.myOpenFileCallback != null) {
                if (this.myOpenFileCallback.isOpenFile(this)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (Mr) {
                iy.aM(th, 1865582721013916352L, this);
            }
            throw th;
        }
    }

    @ey(method = 5027727610445135280L)
    public boolean isReferable(FileEntry fileEntry) {
        try {
            if (j3) {
                iy.tp(2244499262788174525L, this, fileEntry);
            }
            return this.fileSpace.isReferableFrom(this, fileEntry);
        } catch (Throwable th) {
            if (Mr) {
                iy.j3(th, 2244499262788174525L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = -74403727234033224L)
    public boolean isRootDirectory() {
        try {
            if (j3) {
                iy.gn(5462399107937672825L, this);
            }
            return this.myParentDir == null;
        } catch (Throwable th) {
            if (Mr) {
                iy.aM(th, 5462399107937672825L, this);
            }
            throw th;
        }
    }

    @ey(method = 4803640267781447099L)
    public boolean isSynchronized() {
        try {
            if (j3) {
                iy.gn(2106895479415807256L, this);
            }
            if (isOpen() || this.version == -1) {
                return true;
            }
            return this.isArchive ? this.version == fetchDiskVersion() : this.isDirectory || this.isArchiveEntry || this.version == fetchFileDiskVersion();
        } catch (Throwable th) {
            if (Mr) {
                iy.aM(th, 2106895479415807256L, this);
            }
            throw th;
        }
    }

    @ey(method = 1485008781609779847L)
    public String j3(int i) {
        try {
            if (j3) {
                iy.u7(1523547582574346784L, this, i);
            }
            return U2(i, 1);
        } catch (Throwable th) {
            if (Mr) {
                iy.j3(th, 1523547582574346784L, this, new Integer(i));
            }
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0038: MOVE (r2 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:26:0x0038 */
    @ey(method = -303785879738803056L)
    public int lg() {
        int i;
        Throwable th;
        try {
            if (j3) {
                iy.gn(-64396051913850825L, this);
            }
            int i2 = 0;
            try {
                try {
                    Reader reader = getReader();
                    try {
                        char[] cArr = this.fileSpace.chars;
                        int i3 = 0;
                        while (true) {
                            try {
                                int i4 = reader.read(cArr);
                                if (i4 == -1) {
                                    reader.close();
                                    return i3;
                                }
                                for (int i5 = 0; i5 < i4; i5++) {
                                    if (cArr[i5] == '\n') {
                                        i3++;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                reader.close();
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (IOException unused) {
                    return i2;
                }
            } catch (IOException unused2) {
                i2 = i;
                return i2;
            }
        } catch (Throwable th4) {
            if (Mr) {
                iy.aM(th4, -64396051913850825L, this);
            }
            throw th4;
        }
    }

    @ey(method = -4465129433595904905L)
    public void load(StoreInputStream storeInputStream) {
        try {
            if (j3) {
                iy.tp(2430808919279648520L, this, storeInputStream);
            }
            this.id = storeInputStream.readInt();
            this.myNameIdentifier = storeInputStream.readInt();
            this.myParentDir = this.fileSpace.getFileEntry(storeInputStream.readInt());
            if (storeInputStream.readBoolean()) {
                this.myEntries = new MapOfIntInt(storeInputStream);
            }
            this.version = storeInputStream.readLong();
            this.isArchiveEntry = storeInputStream.readBoolean();
            this.diskVersion = storeInputStream.readLong();
            this.lastModified = storeInputStream.readLong();
        } catch (Throwable th) {
            if (Mr) {
                iy.j3(th, 2430808919279648520L, this, storeInputStream);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.String] */
    @ey(method = -591895694308809780L)
    public String nw(FileEntry fileEntry) {
        try {
            if (j3) {
                iy.tp(9378762236941875L, this, fileEntry);
            }
            if (!fileEntry.isEnclosingDir(this)) {
                return "";
            }
            String pathString = getPathString();
            fileEntry = pathString.substring(fileEntry.getPathString().length(), pathString.length());
            return fileEntry;
        } catch (Throwable th) {
            if (Mr) {
                iy.j3(th, 9378762236941875L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = -8052452313080665536L)
    public FunctionOfIntInt rN(int i) {
        try {
            if (j3) {
                iy.u7(7054396588345960435L, this, i);
            }
            FunctionOfIntInt functionOfIntInt = new FunctionOfIntInt();
            try {
                Reader reader = getReader();
                try {
                    char[] cArr = this.fileSpace.chars;
                    int i2 = 1;
                    int i3 = 0;
                    while (true) {
                        int i4 = reader.read(cArr);
                        if (i4 == -1) {
                            break;
                        }
                        for (int i5 = 0; i5 < i4; i5++) {
                            char c = cArr[i5];
                            if (c == '\t') {
                                i3 = ((i3 + i) / i) * i;
                            } else if (c == '\n') {
                                if (!functionOfIntInt.Hw(i2)) {
                                    functionOfIntInt.Zo(i2, i3);
                                }
                                i2++;
                                i3 = 0;
                            } else if (c == ' ') {
                                i3++;
                            } else if (!functionOfIntInt.Hw(i2)) {
                                functionOfIntInt.Zo(i2, i3);
                            }
                        }
                    }
                    reader.close();
                } catch (Throwable th) {
                    reader.close();
                    throw th;
                }
            } catch (IOException unused) {
            }
            return functionOfIntInt;
        } catch (Throwable th2) {
            if (Mr) {
                iy.j3(th2, 7054396588345960435L, this, new Integer(i));
            }
            throw th2;
        }
    }

    @ey(method = -8023658345229709125L)
    public void store(StoreOutputStream storeOutputStream) {
        try {
            if (j3) {
                iy.tp(-7225142662543189248L, this, storeOutputStream);
            }
            storeOutputStream.writeInt(this.id);
            storeOutputStream.writeInt(this.myNameIdentifier);
            storeOutputStream.writeInt(this.fileSpace.getId(this.myParentDir));
            storeOutputStream.writeBoolean(this.myEntries != null);
            if (this.myEntries != null) {
                this.myEntries.store(storeOutputStream);
            }
            storeOutputStream.writeLong(this.version);
            storeOutputStream.writeBoolean(this.isArchiveEntry);
            storeOutputStream.writeLong(this.diskVersion);
            storeOutputStream.writeLong(this.lastModified);
        } catch (Throwable th) {
            if (Mr) {
                iy.j3(th, -7225142662543189248L, this, storeOutputStream);
            }
            throw th;
        }
    }

    @ey(method = -3908099463320117855L)
    public void synchronize() {
        try {
            if (j3) {
                iy.gn(-1534792337971546248L, this);
            }
            if (this.myParentDir != null) {
                this.myParentDir.myLoaded = false;
            }
            if (this.parentArchiveFile != null) {
                this.parentArchiveFile.myLoaded = false;
                for (FileEntry fileEntry = this.myParentDir; fileEntry != null && fileEntry != this.parentArchiveFile; fileEntry = fileEntry.myParentDir) {
                    fileEntry.myLoaded = false;
                }
            }
            if (this.children != null) {
                this.children.clear();
            }
            if (this.isDirectory || this.isArchiveEntry || this.isArchive || this.version == -1) {
                this.version = -1L;
            } else {
                this.version = fetchFileDiskVersion();
            }
            init();
        } catch (Throwable th) {
            if (Mr) {
                iy.aM(th, -1534792337971546248L, this);
            }
            throw th;
        }
    }

    @ey(method = -2323130530393764069L)
    public String toString() {
        try {
            if (j3) {
                iy.gn(2565266211728459280L, this);
            }
            return getPathString();
        } catch (Throwable th) {
            if (Mr) {
                iy.aM(th, 2565266211728459280L, this);
            }
            throw th;
        }
    }

    @ey(method = -497793899605051584L)
    public boolean vJ() {
        try {
            if (j3) {
                iy.gn(-3442399323983673135L, this);
            }
            return this.fileSpace.isCheckedSolutionFile(this);
        } catch (Throwable th) {
            if (Mr) {
                iy.aM(th, -3442399323983673135L, this);
            }
            throw th;
        }
    }

    @ey(method = -910588974932062072L)
    public FileEntry(IdentifierSpace identifierSpace, FileSpace fileSpace, OpenFileCallback openFileCallback) {
        try {
            if (j3) {
                iy.we(324600661448411601L, null, identifierSpace, fileSpace, openFileCallback);
            }
            this.myIdentifiers = identifierSpace;
            this.fileSpace = fileSpace;
            this.myOpenFileCallback = openFileCallback;
            this.version = -1L;
            init();
        } catch (Throwable th) {
            if (Mr) {
                iy.U2(th, 324600661448411601L, null, identifierSpace, fileSpace, openFileCallback);
            }
            throw th;
        }
    }
}
