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
import com.aide.codemodel.api.callback.StopCallback;
import com.aide.codemodel.api.collections.FunctionOfIntInt;
import com.aide.codemodel.api.collections.FunctionOfIntLong;
import com.aide.codemodel.api.collections.MapOfIntLong;
import com.aide.codemodel.api.collections.OrderedMapOfIntInt;
import com.aide.codemodel.api.collections.RelationOfIntInt;
import com.aide.codemodel.api.collections.SetOfFileEntry;
import com.aide.codemodel.api.collections.SetOfInt;
import com.aide.codemodel.api.collections.StoreInputStream;
import com.aide.codemodel.api.collections.StoreOutputStream;
import com.aide.ui.util.FilePatternMatcher;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.zip.CRC32;

@cy(clazz = 3901160538888060032L, container = 3901160538888060032L, user = true)
/* loaded from: classes.dex */
public class FileSpace {

    @fy
    private static /* synthetic */ boolean ei;

    @gy
    private static /* synthetic */ boolean nw;

    @dy(field = -657125772233532736L)
    private String J0;

    @dy(field = 3060153012577878240L)
    private HashMap<Integer, Assembly> assemblyMap;

    @dy(field = -2943932834219983437L)
    private OrderedMapOfIntInt assemblyReferences;

    @dy(field = -2740970220685668015L)
    private final BomReaderFactory bomReaderFactory;

    @dy(field = -4742077876610723520L)
    protected byte[] bytes;

    @dy(field = 3908718991345070232L)
    private SetOfInt changedFiles;

    @dy(field = -4705897233642097296L)
    private SetOfInt changedIncludeFiles;

    @dy(field = 2661914019022826516L)
    protected char[] chars;

    @dy(field = -3381981669245318581L)
    private SetOfFileEntry checkedFiles;

    @dy(field = 2302458950772870355L)
    private HashMap<CodeModel, List<String>> codeModelFilePatterns;

    @dy(field = 4199726619169786156L)
    private CodeModel[] codeModels;

    @dy(field = -2439638902703879664L)
    protected CRC32 crc32;

    @dy(field = 1252851349549904929L)
    private FileEntry[] entries;

    @dy(field = -1652528118994556056L)
    private int entryCount;

    @dy(field = -5467967912362444776L)
    private FunctionOfIntInt fileAssembles;

    @dy(field = 128353224802326528L)
    private FunctionOfIntInt fileCodeModels;

    @dy(field = -2786897221064576529L)
    private final IdentifierSpace identifierSpace;

    @dy(field = -7959663836619738472L)
    private MapOfIntLong includedEntryVersions;

    @dy(field = 1650005543860494336L)
    private OrderedMapOfIntInt includes;

    @dy(field = 3448878692980049920L)
    private Language[] languages;

    @dy(field = 4407177610102871136L)
    private final OpenFileCallback openFileCallback;

    @dy(field = 388452028054480191L)
    private boolean packed;

    @dy(field = 1644682493371920885L)
    private RelationOfIntInt references;

    @dy(field = -233968794030637209L)
    private SetOfFileEntry registeredCheckedFiles;

    @dy(field = -527807361482246616L)
    private SetOfFileEntry registeredResourceFiles;

    @dy(field = -477850554506913671L)
    private SetOfFileEntry registeredSolutionFiles;

    @dy(field = -4943638874230992377L)
    private HashMap<Integer, String> resourcePackageNames;

    @dy(field = 4436515643396718581L)
    private SetOfFileEntry solutionFiles;

    @dy(field = -3421896079798091648L)
    private final StopCallback stopCallback;

    @dy(field = -2773666340960946645L)
    private FunctionOfIntLong syntaxVersion;

    @cy(clazz = -551859439963698048L, container = -551859439963698048L, user = true)
    private static class Assembly {

        @fy
        private static /* synthetic */ boolean EQ;

        @dy(field = -6061593152186196915L)
        private boolean VH;

        @dy(field = 2171423886625605888L)
        private String configuration;

        @dy(field = 2168124630788963840L)
        private String debugOutputPath;

        @dy(field = 3227410902224726528L)
        private boolean gn;

        @dy(field = 3942558186120240867L)
        private String projectFilePath;

        @dy(field = -4160718537373871439L)
        private String releaseOutputPath;

        @dy(field = 6163541240307405979L)
        private String rootNamespace;

        @dy(field = -3799266395005893240L)
        private String targetVersion;

        @dy(field = 5538096623203389535L)
        private boolean tp;

        @dy(field = -1474226157720097104L)
        private boolean u7;

        static {
            iy.Zo(Assembly.class);
        }

        @ey(method = 2971580939040164440L)
        public Assembly(String str, String str2, String str3, String str4, String str5, List<String> list, List<String> list2, List<String> list3, String str6, String str7, String str8, boolean z, boolean z2, boolean z3, boolean z4) {
            if (EQ) {
                iy.QX(8460522851617299267L, null, new Object[]{str, str2, str3, str4, str5, list, list2, list3, str6, str7, str8, new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4)});
            }
            this.projectFilePath = str2;
            this.rootNamespace = str3;
            this.configuration = str4;
            this.debugOutputPath = str6;
            this.releaseOutputPath = str7;
            this.targetVersion = str8;
            this.VH = z;
            this.gn = z2;
            this.u7 = z3;
            this.tp = z4;
        }
    }

    @cy(clazz = -6024540791197450033L, container = -6024540791197450033L, user = true)
    private static class b extends Reader {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = -3166249769761437141L)
        private Reader WB;

        @dy(field = -2812436872752464467L)
        private boolean mb;

        static {
            iy.Zo(b.class);
        }

        @ey(method = -7487069144710998705L)
        public b(Reader reader) {
            try {
                if (jw) {
                    iy.tp(398744014966710336L, null, reader);
                }
                this.WB = reader;
                this.mb = false;
            } catch (Throwable th) {
                if (fY) {
                    iy.j3(th, 398744014966710336L, null, reader);
                }
                throw th;
            }
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        @ey(method = 2954941124230807991L)
        public void close() {
            try {
                if (jw) {
                    iy.gn(-514237724767439911L, this);
                }
                if (this.WB != null) {
                    this.WB.close();
                    this.WB = null;
                }
            } catch (Throwable th) {
                if (fY) {
                    iy.aM(th, -514237724767439911L, this);
                }
                throw th;
            }
        }

        @Override // java.io.Reader
        @ey(method = 181601287631218171L)
        public int read(char[] cArr, int i, int i2) {
            int i3;
            try {
                if (jw) {
                    iy.we(6762178425075865233L, this, cArr, new Integer(i), new Integer(i2));
                }
                int i4 = this.WB.read(cArr, i, i2);
                if (i4 == -1) {
                    return -1;
                }
                boolean z = this.mb;
                int i5 = i4 + i;
                int i6 = i;
                int i7 = i6;
                while (i6 < i5) {
                    int i8 = i6 + 1;
                    char c = cArr[i6];
                    if (c == '\n') {
                        if (!z) {
                            i3 = i7 + 1;
                            cArr[i7] = '\n';
                        }
                        z = false;
                        i6 = i8;
                    } else if (c != '\r') {
                        i3 = i7 + 1;
                        cArr[i7] = c;
                    } else {
                        cArr[i7] = '\n';
                        i7++;
                        z = true;
                        i6 = i8;
                    }
                    i7 = i3;
                    z = false;
                    i6 = i8;
                }
                this.mb = z;
                return i7 - i;
            } catch (Throwable th) {
                if (fY) {
                    iy.U2(th, 6762178425075865233L, this, cArr, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(FileSpace.class);
    }

    @ey(method = 3014220877455453131L)
    public FileSpace(IdentifierSpace identifierSpace, OpenFileCallback openFileCallback, StopCallback stopCallback, BomReaderFactory bomReaderFactory) {
        try {
            if (ei) {
                iy.J0(-7707530899833450400L, null, identifierSpace, openFileCallback, stopCallback, bomReaderFactory);
            }
            this.chars = new char[10000];
            this.bytes = new byte[10000];
            this.crc32 = new CRC32();
            this.changedIncludeFiles = new SetOfInt();
            this.changedFiles = new SetOfInt();
            this.identifierSpace = identifierSpace;
            this.openFileCallback = openFileCallback;
            this.stopCallback = stopCallback;
            this.bomReaderFactory = bomReaderFactory;
            FileEntry[] fileEntryArr = new FileEntry[1000];
            this.entries = fileEntryArr;
            fileEntryArr[0] = new FileEntry(identifierSpace, this, openFileCallback, identifierSpace.get(""), null);
            this.entryCount = 1;
            this.syntaxVersion = new FunctionOfIntLong();
            this.includedEntryVersions = new MapOfIntLong();
            this.includes = new OrderedMapOfIntInt();
            this.fileCodeModels = new FunctionOfIntInt();
            this.fileAssembles = new FunctionOfIntInt();
            this.references = new RelationOfIntInt();
            this.assemblyReferences = new OrderedMapOfIntInt();
            this.registeredCheckedFiles = new SetOfFileEntry(this);
            this.registeredSolutionFiles = new SetOfFileEntry(this);
            this.registeredResourceFiles = new SetOfFileEntry(this);
            this.checkedFiles = new SetOfFileEntry(this);
            this.solutionFiles = new SetOfFileEntry(this);
            this.assemblyMap = new HashMap<>();
            this.resourcePackageNames = new HashMap<>();
            this.codeModelFilePatterns = new HashMap<>();
        } catch (Throwable th) {
            if (nw) {
                iy.a8(th, -7707530899833450400L, null, identifierSpace, openFileCallback, stopCallback, bomReaderFactory);
            }
            throw th;
        }
    }

    @ey(method = 818846486444602452L)
    private void kQ(FileEntry fileEntry, int i, int i2, SetOfFileEntry setOfFileEntry) {
        try {
            if (ei) {
                iy.J0(1309093143161258871L, this, fileEntry, new Integer(i), new Integer(i2), setOfFileEntry);
            }
            if (!fileEntry.isDirectory()) {
                this.fileAssembles.Zo(fileEntry.getId(), i);
                this.fileCodeModels.Zo(fileEntry.getId(), i2);
                setOfFileEntry.gn(fileEntry);
            } else {
                int childCount = fileEntry.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    kQ(fileEntry.getChildEntry(i3), i, i2, setOfFileEntry);
                }
            }
        } catch (Throwable th) {
            if (nw) {
                iy.a8(th, 1309093143161258871L, this, fileEntry, new Integer(i), new Integer(i2), setOfFileEntry);
            }
            throw th;
        }
    }

    @ey(method = -399007560061223365L)
    private void pack() {
        try {
            if (ei) {
                iy.gn(1954958112844318200L, this);
            }
            if (this.packed) {
                return;
            }
            this.packed = true;
            this.registeredCheckedFiles.j6.init();
            while (this.registeredCheckedFiles.j6.hasMoreElements()) {
                FileEntry fileEntryNextKey = this.registeredCheckedFiles.j6.nextKey();
                kQ(fileEntryNextKey, this.fileAssembles.get(fileEntryNextKey.getId()), this.fileCodeModels.get(fileEntryNextKey.getId()), this.checkedFiles);
            }
            this.registeredSolutionFiles.j6.init();
            while (this.registeredSolutionFiles.j6.hasMoreElements()) {
                FileEntry fileEntryNextKey2 = this.registeredSolutionFiles.j6.nextKey();
                kQ(fileEntryNextKey2, this.fileAssembles.get(fileEntryNextKey2.getId()), this.fileCodeModels.get(fileEntryNextKey2.getId()), this.solutionFiles);
            }
        } catch (Throwable th) {
            if (nw) {
                iy.aM(th, 1954958112844318200L, this);
            }
            throw th;
        }
    }

    @ey(method = 2105774149731053232L)
    private void synchronize() {
        try {
            if (ei) {
                iy.gn(2983038655812845067L, this);
            }
            for (FileEntry fileEntry : this.entries) {
                if (fileEntry != null) {
                    fileEntry.synchronize();
                }
            }
            this.packed = false;
        } catch (Throwable th) {
            if (nw) {
                iy.aM(th, 2983038655812845067L, this);
            }
            throw th;
        }
    }

    @ey(method = 3560624685754905411L)
    public void FH(int i, String str, String str2, String str3, String str4, String str5, List<String> list, List<String> list2, List<String> list3, String str6, String str7, String str8, boolean z, boolean z2, boolean z3, boolean z4) {
        try {
            if (ei) {
                iy.QX(-453252841575270912L, this, new Object[]{new Integer(i), str, str2, str3, str4, str5, list, list2, list3, str6, str7, str8, new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4)});
            }
            this.assemblyMap.put(Integer.valueOf(i), new Assembly(str, str2, str3, str4, str5, list3, list, list2, str6, str7, str8, z, z2, z3, z4));
        } catch (Throwable th) {
            if (nw) {
                iy.rN(th, -453252841575270912L, this, new Object[]{new Integer(i), str, str2, str3, str4, str5, list, list2, list3, str6, str7, str8, new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4)});
            }
            throw th;
        }
    }

    @ey(method = -3345691666826880L)
    public boolean I(FileEntry fileEntry) {
        try {
            if (ei) {
                iy.tp(-3703273305246108209L, this, fileEntry);
            }
            if (getDebugOutputPath(fileEntry) == null) {
                if (getReleaseOutputPath(fileEntry) == null) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (nw) {
                iy.j3(th, -3703273305246108209L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = -4333996375116498249L)
    public Reader J0(Reader reader) {
        try {
            if (ei) {
                iy.tp(-6354874702660937024L, this, reader);
            }
            return new b(reader);
        } catch (Throwable th) {
            if (nw) {
                iy.j3(th, -6354874702660937024L, this, reader);
            }
            throw th;
        }
    }

    @ey(method = 1810834668456824192L)
    public SetOfFileEntry KD() {
        try {
            if (ei) {
                iy.gn(2764346946254300585L, this);
            }
            pack();
            return this.checkedFiles;
        } catch (Throwable th) {
            if (nw) {
                iy.aM(th, 2764346946254300585L, this);
            }
            throw th;
        }
    }

    @ey(method = 1838188818127524483L)
    public boolean Mz(FileEntry fileEntry) {
        try {
            if (ei) {
                iy.tp(4390247616695821296L, this, fileEntry);
            }
            if (this.assemblyMap.containsKey(Integer.valueOf(getAssembly(fileEntry)))) {
                return this.assemblyMap.get(Integer.valueOf(getAssembly(fileEntry))).VH;
            }
            return false;
        } catch (Throwable th) {
            if (nw) {
                iy.j3(th, 4390247616695821296L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = -4857766936698363224L)
    public FileEntry QX(int i) {
        try {
            if (ei) {
                iy.u7(-1179401460701382301L, this, i);
            }
            return lg(this.assemblyMap.get(Integer.valueOf(i)).rootNamespace);
        } catch (Throwable th) {
            if (nw) {
                iy.j3(th, -1179401460701382301L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -5395542762082156284L)
    public boolean Qq(int i, int i2) {
        try {
            if (ei) {
                iy.EQ(-6347405277638916865L, this, new Integer(i), new Integer(i2));
            }
            pack();
            return this.references.contains(i2, i);
        } catch (Throwable th) {
            if (nw) {
                iy.Mr(th, -6347405277638916865L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -2717600400363437149L)
    public Language SI(int i) {
        try {
            if (ei) {
                iy.u7(4340345100984889216L, this, i);
            }
            return getLanguage(i & 255);
        } catch (Throwable th) {
            if (nw) {
                iy.j3(th, 4340345100984889216L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2849716933326367880L)
    public boolean Sf(FileEntry fileEntry, FileEntry fileEntry2, FileEntry fileEntry3) {
        try {
            if (ei) {
                iy.we(-4717458000905235795L, this, fileEntry, fileEntry2, fileEntry3);
            }
            int i = this.fileAssembles.get(fileEntry2.getId());
            int i2 = this.fileAssembles.get(fileEntry3.getId());
            this.assemblyReferences.default_Iterator.FH(this.fileAssembles.get(fileEntry.getId()));
            while (this.assemblyReferences.default_Iterator.hasMoreElements()) {
                int iNextValue = this.assemblyReferences.default_Iterator.nextValue();
                if (iNextValue == i) {
                    return true;
                }
                if (iNextValue == i2) {
                    break;
                }
            }
            return false;
        } catch (Throwable th) {
            if (nw) {
                iy.U2(th, -4717458000905235795L, this, fileEntry, fileEntry2, fileEntry3);
            }
            throw th;
        }
    }

    @ey(method = 5308389524315791824L)
    public void VH(FileEntry fileEntry, CodeModel codeModel) {
        try {
            if (ei) {
                iy.EQ(2091663418913299495L, this, fileEntry, codeModel);
            }
            this.fileCodeModels.Zo(fileEntry.getId(), gW(codeModel));
        } catch (Throwable th) {
            if (nw) {
                iy.Mr(th, 2091663418913299495L, this, fileEntry, codeModel);
            }
            throw th;
        }
    }

    @ey(method = -596153857578496008L)
    public String XL(int i) {
        try {
            if (ei) {
                iy.u7(-2337479767059153L, this, i);
            }
            return !this.assemblyMap.containsKey(Integer.valueOf(i)) ? "" : this.assemblyMap.get(Integer.valueOf(i)).projectFilePath;
        } catch (Throwable th) {
            if (nw) {
                iy.j3(th, -2337479767059153L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 3067975819440486024L)
    public void Zo(FileEntry fileEntry, int i, CodeModel codeModel, boolean z) {
        try {
            if (ei) {
                iy.J0(-2039385794632185721L, this, fileEntry, new Integer(i), codeModel, new Boolean(z));
            }
            this.fileCodeModels.Zo(fileEntry.getId(), gW(codeModel));
            this.fileAssembles.Zo(fileEntry.getId(), i);
            if (z) {
                this.registeredCheckedFiles.gn(fileEntry);
            }
            this.registeredSolutionFiles.gn(fileEntry);
        } catch (Throwable th) {
            if (nw) {
                iy.a8(th, -2039385794632185721L, this, fileEntry, new Integer(i), codeModel, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 252569650958413945L)
    public String aM(int i) {
        try {
            if (ei) {
                iy.u7(4739395908812760300L, this, i);
            }
            return this.assemblyMap.get(Integer.valueOf(i)).configuration;
        } catch (Throwable th) {
            if (nw) {
                iy.j3(th, 4739395908812760300L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 114681700695488256L)
    public boolean aj(FileEntry fileEntry) {
        try {
            if (ei) {
                iy.tp(3075341858873771787L, this, fileEntry);
            }
            pack();
            return this.solutionFiles.contains(fileEntry);
        } catch (Throwable th) {
            if (nw) {
                iy.j3(th, 3075341858873771787L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = 4194572135205274192L)
    public boolean ca(FileEntry fileEntry) {
        try {
            if (ei) {
                iy.tp(665255737585309475L, this, fileEntry);
            }
            if (!I(fileEntry) && this.assemblyMap.containsKey(Integer.valueOf(getAssembly(fileEntry)))) {
                return this.assemblyMap.get(Integer.valueOf(getAssembly(fileEntry))).u7;
            }
            return false;
        } catch (Throwable th) {
            if (nw) {
                iy.j3(th, 665255737585309475L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = -2464959829515015807L)
    public FileEntry cb() {
        try {
            if (ei) {
                iy.gn(-2606451096052317540L, this);
            }
            return this.entries[0];
        } catch (Throwable th) {
            if (nw) {
                iy.aM(th, -2606451096052317540L, this);
            }
            throw th;
        }
    }

    @ey(method = -1767734629628947160L)
    public void close() {
        try {
            if (ei) {
                iy.gn(1280848333380671665L, this);
            }
            for (CodeModel codeModel : this.codeModels) {
                if (codeModel != null && codeModel.isSupportArchiveFile()) {
                    codeModel.closeArchive();
                }
            }
        } catch (Throwable th) {
            if (nw) {
                iy.aM(th, 1280848333380671665L, this);
            }
            throw th;
        }
    }

    @ey(method = 3851111195396871387L)
    public void configure() {
        try {
            if (ei) {
                iy.gn(5559664764016909168L, this);
            }
            this.fileAssembles.clear();
            this.references.clear();
            this.assemblyReferences.clear();
            this.registeredCheckedFiles.clear();
            this.registeredSolutionFiles.clear();
            this.registeredResourceFiles.clear();
            this.checkedFiles.clear();
            this.solutionFiles.clear();
            this.assemblyMap.clear();
            this.resourcePackageNames.clear();
            this.codeModelFilePatterns.clear();
            synchronize();
        } catch (Throwable th) {
            if (nw) {
                iy.aM(th, 5559664764016909168L, this);
            }
            throw th;
        }
    }

    @ey(method = -748477194385198756L)
    public void configureCodeModelFilePatterns(CodeModel codeModel, List<String> list) {
        try {
            if (ei) {
                iy.EQ(3336387742674299937L, this, codeModel, list);
            }
            this.codeModelFilePatterns.put(codeModel, list);
        } catch (Throwable th) {
            if (nw) {
                iy.Mr(th, 3336387742674299937L, this, codeModel, list);
            }
            throw th;
        }
    }

    @ey(method = 16037669226266885L)
    public void configureCodeModels(CodeModel[] codeModelArr) {
        try {
            if (ei) {
                iy.tp(560647232297779712L, this, codeModelArr);
            }
            this.codeModels = codeModelArr;
            ArrayList arrayList = new ArrayList();
            for (CodeModel codeModel : codeModelArr) {
                for (Language language : codeModel.getLanguages()) {
                    if (!arrayList.contains(language)) {
                        arrayList.add(language);
                    }
                }
            }
            Language[] languageArr = new Language[arrayList.size()];
            this.languages = languageArr;
            arrayList.toArray(languageArr);
        } catch (Throwable th) {
            if (nw) {
                iy.j3(th, 560647232297779712L, this, codeModelArr);
            }
            throw th;
        }
    }

    @ey(method = -1810936890747391332L)
    public Reader createBomReader(InputStream inputStream, String str) {
        try {
            if (ei) {
                iy.EQ(2312129664652135185L, this, inputStream, str);
            }
            return this.bomReaderFactory.createBomReader(inputStream, str);
        } catch (Throwable th) {
            if (nw) {
                iy.Mr(th, 2312129664652135185L, this, inputStream, str);
            }
            throw th;
        }
    }

    @ey(method = 3884854945228078437L)
    public int declareEntry(FileEntry fileEntry) {
        try {
            if (ei) {
                iy.tp(-2270564102954903404L, this, fileEntry);
            }
            if (this.entryCount >= this.entries.length) {
                FileEntry[] fileEntryArr = new FileEntry[(this.entries.length * 2) + 1];
                System.arraycopy(this.entries, 0, fileEntryArr, 0, this.entries.length);
                this.entries = fileEntryArr;
            }
            this.entries[this.entryCount] = fileEntry;
            int i = this.entryCount;
            this.entryCount = i + 1;
            return i;
        } catch (Throwable th) {
            if (nw) {
                iy.j3(th, -2270564102954903404L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = -5183635565676493904L)
    public boolean g3(FileEntry fileEntry) {
        try {
            if (ei) {
                iy.tp(1838158743656153015L, this, fileEntry);
            }
            return fileEntry.getNameIdentifier() == this.identifierSpace.get("R");
        } catch (Throwable th) {
            if (nw) {
                iy.j3(th, 1838158743656153015L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = 3218822727935119760L)
    public int gW(CodeModel codeModel) {
        try {
            if (ei) {
                iy.tp(-4152784164330015227L, this, codeModel);
            }
            for (int i = 0; i < this.codeModels.length; i++) {
                if (codeModel == this.codeModels[i]) {
                    return i;
                }
            }
            return -1;
        } catch (Throwable th) {
            if (nw) {
                iy.j3(th, -4152784164330015227L, this, codeModel);
            }
            throw th;
        }
    }

    @ey(method = 2384273099110102473L)
    public int getAssembly(FileEntry fileEntry) {
        try {
            if (ei) {
                iy.tp(1565175461372627560L, this, fileEntry);
            }
            pack();
            return this.fileAssembles.get(fileEntry.getId());
        } catch (Throwable th) {
            if (nw) {
                iy.j3(th, 1565175461372627560L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = -604730361975966369L)
    public CodeModel getCodeModel(int i) {
        try {
            if (ei) {
                iy.u7(2402400123797340408L, this, i);
            }
            if (i < 0) {
                return null;
            }
            return this.codeModels[i];
        } catch (Throwable th) {
            if (nw) {
                iy.j3(th, 2402400123797340408L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 4529579119055656587L)
    public CodeModel getCodeModel(FileEntry fileEntry) {
        try {
            if (ei) {
                iy.tp(-3159623823846184448L, this, fileEntry);
            }
            if (this.fileCodeModels.Hw(fileEntry.getId())) {
                return getCodeModel(this.fileCodeModels.get(fileEntry.getId()));
            }
            pack();
            CodeModel codeModel = getCodeModel(this.fileCodeModels.get(fileEntry.getId()));
            if (codeModel != null) {
                return codeModel;
            }
            String fullNameString = fileEntry.getFullNameString();
            for (CodeModel codeModel2 : this.codeModels) {
                if (this.codeModelFilePatterns.containsKey(codeModel2)) {
                    for (String str : this.codeModelFilePatterns.get(codeModel2)) {
                        if (FilePatternMatcher.j6() != null && FilePatternMatcher.j6().DW(fullNameString, str)) {
                            this.fileCodeModels.Zo(fileEntry.getId(), gW(codeModel2));
                            return codeModel2;
                        }
                    }
                }
            }
            this.fileCodeModels.Zo(fileEntry.getId(), -1);
            return null;
        } catch (Throwable th) {
            if (nw) {
                iy.j3(th, -3159623823846184448L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = -149887509948389817L)
    public CodeModel getCodeModelWrapper(FileEntry fileEntry) {
        try {
            if (ei) {
                iy.tp(1617247216980608724L, this, fileEntry);
            }
            return getCodeModel(this.fileCodeModels.get(fileEntry.getId()));
        } catch (Throwable th) {
            if (nw) {
                iy.j3(th, 1617247216980608724L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = -3567655746690969725L)
    public CodeModel[] getCodeModels() {
        try {
            if (ei) {
                iy.gn(-3615833570103320632L, this);
            }
            return this.codeModels;
        } catch (Throwable th) {
            if (nw) {
                iy.aM(th, -3615833570103320632L, this);
            }
            throw th;
        }
    }

    @ey(method = -2363875339013319681L)
    public String getDebugOutputPath(FileEntry fileEntry) {
        try {
            if (ei) {
                iy.tp(-44378321939110908L, this, fileEntry);
            }
            if (this.assemblyMap.containsKey(Integer.valueOf(getAssembly(fileEntry)))) {
                return this.assemblyMap.get(Integer.valueOf(getAssembly(fileEntry))).debugOutputPath;
            }
            return null;
        } catch (Throwable th) {
            if (nw) {
                iy.j3(th, -44378321939110908L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = -893219411458017123L)
    public String getEncoding() {
        try {
            if (ei) {
                iy.gn(241466000622598040L, this);
            }
            return this.J0;
        } catch (Throwable th) {
            if (nw) {
                iy.aM(th, 241466000622598040L, this);
            }
            throw th;
        }
    }

    @ey(method = -42248023020450819L)
    public FileEntry getFileEntry(int i) {
        try {
            if (ei) {
                iy.u7(-383407120762340688L, this, i);
            }
            if (i == -1) {
                return null;
            }
            return this.entries[i];
        } catch (Throwable th) {
            if (nw) {
                iy.j3(th, -383407120762340688L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2358420800537773944L)
    public int getFileEntryLanguageId(FileEntry fileEntry, Language language) {
        try {
            if (ei) {
                iy.EQ(-2984859541212799449L, this, fileEntry, language);
            }
            return getLanguageId(language) | (fileEntry.getId() << 8);
        } catch (Throwable th) {
            if (nw) {
                iy.Mr(th, -2984859541212799449L, this, fileEntry, language);
            }
            throw th;
        }
    }

    @ey(method = -8839602054455928L)
    public int getId(FileEntry fileEntry) {
        try {
            if (ei) {
                iy.tp(-8315551511295425943L, this, fileEntry);
            }
            if (fileEntry == null) {
                return -1;
            }
            return fileEntry.getId();
        } catch (Throwable th) {
            if (nw) {
                iy.j3(th, -8315551511295425943L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = 871680122304198227L)
    public Language getLanguage(int i) {
        try {
            if (ei) {
                iy.u7(-2044531701755640032L, this, i);
            }
            return this.languages[i];
        } catch (Throwable th) {
            if (nw) {
                iy.j3(th, -2044531701755640032L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 1947705121790557104L)
    public int getLanguageId(Language language) {
        try {
            if (ei) {
                iy.tp(3252889944552631215L, this, language);
            }
            for (int i = 0; i < this.languages.length; i++) {
                if (language == this.languages[i]) {
                    return i;
                }
            }
            return -1;
        } catch (Throwable th) {
            if (nw) {
                iy.j3(th, 3252889944552631215L, this, language);
            }
            throw th;
        }
    }

    @ey(method = -2473166393039868495L)
    public String getReleaseOutputPath(FileEntry fileEntry) {
        try {
            if (ei) {
                iy.tp(-163128722855263704L, this, fileEntry);
            }
            if (this.assemblyMap.containsKey(Integer.valueOf(getAssembly(fileEntry)))) {
                return this.assemblyMap.get(Integer.valueOf(getAssembly(fileEntry))).releaseOutputPath;
            }
            return null;
        } catch (Throwable th) {
            if (nw) {
                iy.j3(th, -163128722855263704L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = 5315793024528761289L)
    public SetOfFileEntry getResourceFiles() {
        try {
            if (ei) {
                iy.gn(4560519782339854080L, this);
            }
            pack();
            return this.registeredResourceFiles;
        } catch (Throwable th) {
            if (nw) {
                iy.aM(th, 4560519782339854080L, this);
            }
            throw th;
        }
    }

    @ey(method = 5881411707982103424L)
    public SetOfFileEntry getSolutionFiles() {
        try {
            if (ei) {
                iy.gn(5081917329873262027L, this);
            }
            pack();
            return this.solutionFiles;
        } catch (Throwable th) {
            if (nw) {
                iy.aM(th, 5081917329873262027L, this);
            }
            throw th;
        }
    }

    @ey(method = 2768023223748827952L)
    public long getSyntaxVersion(FileEntry fileEntry) {
        try {
            if (ei) {
                iy.tp(413756217569408265L, this, fileEntry);
            }
            if (fileEntry.getCodeModel() == null) {
                return fileEntry.getVersion();
            }
            if (this.syntaxVersion.Hw(fileEntry.getId())) {
                return this.syntaxVersion.v5(fileEntry.getId());
            }
            if (!this.includes.v5(fileEntry.getId())) {
                this.includes.gn(fileEntry.getId(), fileEntry.getId());
                this.includedEntryVersions.VH(fileEntry.getId(), fileEntry.getVersion());
                Iterator<Language> it = fileEntry.getCodeModel().getLanguages().iterator();
                while (it.hasNext()) {
                    fileEntry.getCodeModel().processVersion(fileEntry, it.next());
                }
            }
            long version = 0;
            this.includes.default_Iterator.FH(fileEntry.getId());
            while (this.includes.default_Iterator.hasMoreElements()) {
                version = (version * 37) ^ getFileEntry(this.includes.default_Iterator.nextValue()).getVersion();
            }
            this.syntaxVersion.put(fileEntry.getId(), version);
            return version;
        } catch (Throwable th) {
            if (nw) {
                iy.j3(th, 413756217569408265L, this, fileEntry);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.String] */
    @ey(method = 795527186230555536L)
    public String getTargetVersion(FileEntry fileEntry) {
        try {
            if (ei) {
                iy.tp(5894063050373368245L, this, fileEntry);
            }
            if (!this.assemblyMap.containsKey(Integer.valueOf(getAssembly(fileEntry)))) {
                return "";
            }
            fileEntry = this.assemblyMap.get(Integer.valueOf(getAssembly(fileEntry))).targetVersion;
            return fileEntry;
        } catch (Throwable th) {
            if (nw) {
                iy.j3(th, 5894063050373368245L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = 3262604106285942144L)
    public boolean isCheckedSolutionFile(FileEntry fileEntry) {
        try {
            if (ei) {
                iy.tp(-2822884259589017559L, this, fileEntry);
            }
            pack();
            return this.checkedFiles.contains(fileEntry);
        } catch (Throwable th) {
            if (nw) {
                iy.j3(th, -2822884259589017559L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = -4634546308575058064L)
    public boolean isReferableFrom(FileEntry fileEntry, FileEntry fileEntry2) {
        try {
            if (ei) {
                iy.EQ(3699589343540672485L, this, fileEntry, fileEntry2);
            }
            pack();
            return this.references.contains(this.fileAssembles.get(fileEntry2.getId()), this.fileAssembles.get(fileEntry.getId()));
        } catch (Throwable th) {
            if (nw) {
                iy.Mr(th, 3699589343540672485L, this, fileEntry, fileEntry2);
            }
            throw th;
        }
    }

    @ey(method = 677962646817687120L)
    public boolean j6() {
        try {
            if (ei) {
                iy.gn(2610719290079862045L, this);
            }
            for (int i = 0; i < this.entryCount; i++) {
                FileEntry fileEntry = this.entries[i];
                if (!fileEntry.isSynchronized() && fileEntry.getCodeModel() != null) {
                    return false;
                }
                if (this.stopCallback.Eq()) {
                    throw new InterruptedException();
                }
            }
            return true;
        } catch (Throwable th) {
            if (nw) {
                iy.aM(th, 2610719290079862045L, this);
            }
            throw th;
        }
    }

    @ey(method = 1277693096379047144L)
    public FileEntry lg(String str) {
        int i;
        try {
            if (ei) {
                iy.tp(-368531800269440093L, this, str);
            }
            while (true) {
                i = 0;
                if (!str.endsWith(File.separator)) {
                    break;
                }
                str = str.substring(0, str.length() - 1);
            }
            FileEntry fileEntryCb = cb();
            int iIndexOf = str.indexOf(File.separatorChar, 0);
            boolean z = false;
            while (iIndexOf != -1) {
                String strSubstring = str.substring(i, iIndexOf);
                if (strSubstring.equals(".")) {
                    z = true;
                } else {
                    if (strSubstring.equals("..") && cb() != fileEntryCb) {
                        fileEntryCb = fileEntryCb.getParentDirectory();
                    } else if (!strSubstring.equals("")) {
                        fileEntryCb = fileEntryCb.getEntry(strSubstring);
                    } else if (!z) {
                        fileEntryCb = fileEntryCb.getEntry(strSubstring);
                    }
                    z = true;
                }
                i = iIndexOf + 1;
                iIndexOf = str.indexOf(File.separatorChar, i);
            }
            return fileEntryCb.getEntry(str.substring(i, str.length()));
        } catch (Throwable th) {
            if (nw) {
                iy.j3(th, -368531800269440093L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -1684455282693765140L)
    public void load(StoreInputStream storeInputStream) {
        try {
            if (ei) {
                iy.tp(-5475025141465019895L, this, storeInputStream);
            }
            for (int i = 0; i < this.entryCount; i++) {
                this.entries[i].load(storeInputStream);
                if (storeInputStream.readChar() != 'E') {
                    throw new IOException();
                }
            }
            this.includedEntryVersions = new MapOfIntLong(storeInputStream);
            this.includes = new OrderedMapOfIntInt(storeInputStream);
            this.fileCodeModels = new FunctionOfIntInt(storeInputStream);
        } catch (Throwable th) {
            if (nw) {
                iy.j3(th, -5475025141465019895L, this, storeInputStream);
            }
            throw th;
        }
    }

    @ey(method = -1703752684810562304L)
    public void loadEntries(StoreInputStream storeInputStream) {
        try {
            if (ei) {
                iy.tp(-1693171284508753425L, this, storeInputStream);
            }
            int i = storeInputStream.readInt();
            this.entryCount = i;
            this.entries = new FileEntry[i * 2];
            for (int i2 = 0; i2 < this.entryCount; i2++) {
                this.entries[i2] = new FileEntry(this.identifierSpace, this, this.openFileCallback);
            }
        } catch (Throwable th) {
            if (nw) {
                iy.j3(th, -1693171284508753425L, this, storeInputStream);
            }
            throw th;
        }
    }

    @ey(method = 1004586874570156591L)
    public boolean lp(FileEntry fileEntry) {
        try {
            if (ei) {
                iy.tp(-116891058850753904L, this, fileEntry);
            }
            if (this.assemblyMap.containsKey(Integer.valueOf(getAssembly(fileEntry)))) {
                return this.assemblyMap.get(Integer.valueOf(getAssembly(fileEntry))).gn;
            }
            return false;
        } catch (Throwable th) {
            if (nw) {
                iy.j3(th, -116891058850753904L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = -1242887056297341536L)
    public String sh(FileEntry fileEntry) {
        try {
            if (ei) {
                iy.tp(1023500751594116225L, this, fileEntry);
            }
            if (this.resourcePackageNames.containsKey(Integer.valueOf(fileEntry.getId()))) {
                return this.resourcePackageNames.get(Integer.valueOf(fileEntry.getId()));
            }
            return null;
        } catch (Throwable th) {
            if (nw) {
                iy.j3(th, 1023500751594116225L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = 7939207055152783600L)
    public void store(StoreOutputStream storeOutputStream) {
        try {
            if (ei) {
                iy.tp(-636154746440259311L, this, storeOutputStream);
            }
            for (int i = 0; i < this.entryCount; i++) {
                this.entries[i].store(storeOutputStream);
                storeOutputStream.writeChar(69);
            }
            this.includedEntryVersions.store(storeOutputStream);
            this.includes.store(storeOutputStream);
            this.fileCodeModels.store(storeOutputStream);
        } catch (Throwable th) {
            if (nw) {
                iy.j3(th, -636154746440259311L, this, storeOutputStream);
            }
            throw th;
        }
    }

    @ey(method = 1281799012083502484L)
    public void storeEntries(StoreOutputStream storeOutputStream) {
        try {
            if (ei) {
                iy.tp(-2057419412178823515L, this, storeOutputStream);
            }
            storeOutputStream.writeInt(this.entryCount);
        } catch (Throwable th) {
            if (nw) {
                iy.j3(th, -2057419412178823515L, this, storeOutputStream);
            }
            throw th;
        }
    }

    @ey(method = 3560766198755709768L)
    public void tp(FileEntry fileEntry, int i, String str) {
        try {
            if (ei) {
                iy.we(-375242722166157965L, this, fileEntry, new Integer(i), str);
            }
            this.fileAssembles.Zo(fileEntry.getId(), i);
            if (str != null) {
                this.resourcePackageNames.put(Integer.valueOf(fileEntry.getId()), str);
            }
            this.registeredResourceFiles.gn(fileEntry);
        } catch (Throwable th) {
            if (nw) {
                iy.U2(th, -375242722166157965L, this, fileEntry, new Integer(i), str);
            }
            throw th;
        }
    }

    @ey(method = 546656931703383483L)
    public void u7(int i, int i2) {
        try {
            if (ei) {
                iy.EQ(89671386696338416L, this, new Integer(i), new Integer(i2));
            }
            this.references.v5(i, i2);
            this.assemblyReferences.VH(i, i2);
        } catch (Throwable th) {
            if (nw) {
                iy.Mr(th, 89671386696338416L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 396318123645122656L)
    public void update(boolean z) {
        try {
            if (ei) {
                iy.Ws(1906279345926389465L, this, z);
            }
            if (z) {
                synchronize();
            }
            this.changedIncludeFiles.clear();
            this.includedEntryVersions.default_Iterator.init();
            while (this.includedEntryVersions.default_Iterator.hasMoreElements()) {
                FileEntry fileEntry = getFileEntry(this.includedEntryVersions.default_Iterator.nextKey());
                if (this.includedEntryVersions.default_Iterator.nextValue() != fileEntry.getVersion()) {
                    this.changedIncludeFiles.put(fileEntry.getId());
                }
            }
            this.changedIncludeFiles.default_Iterator.init();
            while (this.changedIncludeFiles.default_Iterator.hasMoreElements()) {
                this.includedEntryVersions.remove(this.changedIncludeFiles.default_Iterator.nextKey());
            }
            this.changedFiles.clear();
            this.includes.default_Iterator.init();
            while (this.includes.default_Iterator.hasMoreElements()) {
                FileEntry fileEntry2 = getFileEntry(this.includes.default_Iterator.nextValue());
                FileEntry fileEntry3 = getFileEntry(this.includes.default_Iterator.nextKey());
                if (this.changedIncludeFiles.contains(fileEntry2.getId())) {
                    this.changedFiles.put(fileEntry3.getId());
                }
            }
            this.changedFiles.default_Iterator.init();
            while (this.changedFiles.default_Iterator.hasMoreElements()) {
                int iNextKey = this.changedFiles.default_Iterator.nextKey();
                this.includes.remove(iNextKey);
                this.syntaxVersion.remove(iNextKey);
            }
        } catch (Throwable th) {
            if (nw) {
                iy.j3(th, 1906279345926389465L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 5173394351855274125L)
    public void v5(String str) {
        try {
            if (ei) {
                iy.tp(2578970095810438008L, this, str);
            }
            this.J0 = str;
        } catch (Throwable th) {
            if (nw) {
                iy.j3(th, 2578970095810438008L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -558206870963170755L)
    public boolean vJ(FileEntry fileEntry) {
        try {
            if (ei) {
                iy.tp(1208140254175289584L, this, fileEntry);
            }
            if (g3(fileEntry) && this.assemblyMap.containsKey(Integer.valueOf(getAssembly(fileEntry)))) {
                return this.assemblyMap.get(Integer.valueOf(getAssembly(fileEntry))).tp;
            }
            return false;
        } catch (Throwable th) {
            if (nw) {
                iy.j3(th, 1208140254175289584L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = -3967510608095987493L)
    public FileEntry vy(int i) {
        try {
            if (ei) {
                iy.u7(-484718178876047064L, this, i);
            }
            return getFileEntry(i >> 8);
        } catch (Throwable th) {
            if (nw) {
                iy.j3(th, -484718178876047064L, this, new Integer(i));
            }
            throw th;
        }
    }
}
