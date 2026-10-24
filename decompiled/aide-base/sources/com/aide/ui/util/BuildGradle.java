package com.aide.ui.util;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.hy;
import abcd.iy;
import com.aide.common.AppLog;
import groovyjarjarantlr.collections.AST;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.codehaus.groovy.antlr.SourceBuffer;
import org.codehaus.groovy.antlr.UnicodeEscapingReader;
import org.codehaus.groovy.antlr.parser.GroovyLexer;
import org.codehaus.groovy.antlr.parser.GroovyRecognizer;

@cy(clazz = 1286736540757565680L, container = 1286736540757565680L, user = true)
/* loaded from: classes.dex */
public class BuildGradle extends Configuration<BuildGradle> {

    @gy
    private static /* synthetic */ boolean Mr;

    @fy
    private static /* synthetic */ boolean j3;

    @dy(field = -666742376267472363L)
    public List<Dependency> allProjectsDependencies;

    @dy(field = 647339687738883360L)
    public List<Repository> allProjectsRepositorys;

    @dy(field = 4991359737912521752L)
    public int curAndroidNodeLine;

    @dy(field = -288505322156643480L)
    public int curDependenciesNodeLine;

    @dy(field = -1032184679770151044L)
    public int curFlavorsNodeLine;

    @dy(field = -546480544318341633L)
    public List<Repository> curProjectsRepositorys;

    @dy(field = 2110230604058104672L)
    public ProductFlavor defaultConfigProductFlavor;

    @dy(field = 3543642495247814088L)
    public List<Dependency> dependencies;

    @dy(field = -79182995759738220L)
    public SortedMap<String, ProductFlavor> productFlavorMap;

    @dy(field = 2795742233006500379L)
    public Map<String, SigningConfig> signingConfigMap;

    @dy(field = -545848074732442272L)
    public List<Dependency> subProjectsDependencies;

    @dy(field = 848416149759892253L)
    public List<Repository> subProjectsRepositorys;

    @dy(field = -3540990467969256368L)
    public ProjectDependency wearAppProject;

    @cy(clazz = -4143679928279952933L, container = -4143679928279952933L, user = true)
    public static abstract class Dependency extends LineNumber {

        @fy
        private static /* synthetic */ boolean Hw;

        @gy
        private static /* synthetic */ boolean v5;

        static {
            iy.Zo(Dependency.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = -207179245020002352L)
        public Dependency(int i) {
            super(i);
            try {
                if (Hw) {
                    iy.u7(270184301417492539L, null, i);
                }
            } catch (Throwable th) {
                if (v5) {
                    iy.j3(th, 270184301417492539L, null, new Integer(i));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -623531114526608755L, container = -623531114526608755L, user = true)
    public static class FileTreeDependency extends Dependency {

        @fy
        private static /* synthetic */ boolean VH;

        @gy
        private static /* synthetic */ boolean gn;

        @dy(field = -7056963548293217L)
        public String dirPath;

        static {
            iy.Zo(FileTreeDependency.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = 552426778315335948L)
        public FileTreeDependency(int i) {
            super(i);
            try {
                if (VH) {
                    iy.u7(-2516510158544292485L, null, i);
                }
            } catch (Throwable th) {
                if (gn) {
                    iy.j3(th, -2516510158544292485L, null, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -2935316426079902472L)
        public String getDirPath(String str) {
            try {
                if (VH) {
                    iy.tp(2517891740060147048L, this, str);
                }
                if (this.dirPath == null) {
                    return null;
                }
                return FileSystem.Qq(str, this.dirPath);
            } catch (Throwable th) {
                if (gn) {
                    iy.j3(th, 2517891740060147048L, this, str);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 31424070432103911L, container = 31424070432103911L, user = true)
    public static class FilesDependency extends Dependency {

        @fy
        private static /* synthetic */ boolean VH;

        @gy
        private static /* synthetic */ boolean gn;

        @dy(field = 525677804239949559L)
        public String filesPath;

        static {
            iy.Zo(FilesDependency.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = -2958317415860654955L)
        public FilesDependency(int i) {
            super(i);
            try {
                if (VH) {
                    iy.u7(-1365430300804738289L, null, i);
                }
            } catch (Throwable th) {
                if (gn) {
                    iy.j3(th, -1365430300804738289L, null, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -2749361127180088149L)
        public String getFilesPath(String str) {
            try {
                if (VH) {
                    iy.tp(-93095401323740544L, this, str);
                }
                if (this.filesPath == null) {
                    return null;
                }
                return FileSystem.Qq(str, this.filesPath);
            } catch (Throwable th) {
                if (gn) {
                    iy.j3(th, -93095401323740544L, this, str);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 2890643331385433200L, container = 2890643331385433200L, user = true)
    public static class FlatLocalRepository extends Repository {

        @fy
        private static /* synthetic */ boolean VH;

        @gy
        private static /* synthetic */ boolean gn;

        @dy(field = 967512858705610263L)
        public String flatDir;

        static {
            iy.Zo(FlatLocalRepository.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = -129190733493713424L)
        public FlatLocalRepository(int i) {
            super(i);
            try {
                if (VH) {
                    iy.u7(190653905838385840L, null, i);
                }
            } catch (Throwable th) {
                if (gn) {
                    iy.j3(th, 190653905838385840L, null, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 2051540129702330052L)
        public String getFlatDir(String str) {
            try {
                if (VH) {
                    iy.tp(1533854226629754332L, this, str);
                }
                return FileSystem.Qq(str, this.flatDir);
            } catch (Throwable th) {
                if (gn) {
                    iy.j3(th, 1533854226629754332L, this, str);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 4084750446085420179L, container = 4084750446085420179L, user = true)
    public static abstract class LineNumber {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @dy(field = 1682669044670296320L)
        public final int line;

        static {
            iy.Zo(LineNumber.class);
        }

        @ey(method = 193229714957560568L)
        public LineNumber(int i) {
            try {
                if (DW) {
                    iy.u7(-2993961079286589840L, null, i);
                }
                this.line = i;
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, -2993961079286589840L, null, new Integer(i));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 5106420208944380596L, container = 5106420208944380596L, user = true)
    public class ProductFlavor {

        @fy
        private static /* synthetic */ boolean VH;

        @gy
        private static /* synthetic */ boolean gn;

        @dy(field = 4194498103001994620L)
        public String applicationId;

        @dy(field = 2189010511984245557L)
        public String minSdkVersion;

        @dy(field = 3326235458119332024L)
        public String multiDexEnabled;

        @dy(field = -5622907696766889512L)
        public String targetSdkVersion;

        @dy(field = -584266397020576544L)
        public String versionCode;

        @dy(field = -561854318274964008L)
        public String versionName;

        static {
            iy.Zo(ProductFlavor.class);
        }

        @ey(method = 255499988501238523L)
        public ProductFlavor(BuildGradle buildGradle) {
            try {
                if (VH) {
                    iy.tp(-1617378437766414001L, null, buildGradle);
                }
            } catch (Throwable th) {
                if (gn) {
                    iy.j3(th, -1617378437766414001L, null, buildGradle);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -42401395434935228L, container = -42401395434935228L, user = true)
    public static class ProjectDependency extends Dependency {

        @fy
        private static /* synthetic */ boolean VH;

        @gy
        private static /* synthetic */ boolean gn;

        @dy(field = -4536501223569214583L)
        public String projectName;

        static {
            iy.Zo(ProjectDependency.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = 158128683186297735L)
        public ProjectDependency(int i) {
            super(i);
            try {
                if (VH) {
                    iy.u7(2601114563630301444L, null, i);
                }
            } catch (Throwable th) {
                if (gn) {
                    iy.j3(th, 2601114563630301444L, null, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -537220118798622125L)
        public String getProjectDependencyPath(String str, BuildGradleExt buildGradleExt) {
            try {
                if (VH) {
                    iy.EQ(-7178238830550564140L, this, str, buildGradleExt);
                }
                return buildGradleExt.Ws(str, this.projectName);
            } catch (Throwable th) {
                if (gn) {
                    iy.Mr(th, -7178238830550564140L, this, str, buildGradleExt);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -459771541640449581L, container = -459771541640449581L, user = true)
    public static class RemoteRepository extends Repository {

        @fy
        private static /* synthetic */ boolean VH;

        @gy
        private static /* synthetic */ boolean gn;

        @dy(field = -1962034889460983748L)
        public String repositorieURL;

        static {
            iy.Zo(RemoteRepository.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = -5110119031216366049L)
        public RemoteRepository(int i, String str) {
            super(i);
            try {
                if (VH) {
                    iy.EQ(2398678632362552995L, null, new Integer(i), str);
                }
                this.repositorieURL = str;
            } catch (Throwable th) {
                if (gn) {
                    iy.Mr(th, 2398678632362552995L, null, new Integer(i), str);
                }
                throw th;
            }
        }

        @ey(method = 169549809157895040L)
        public boolean equals(Object obj) {
            try {
                if (VH) {
                    iy.tp(38685007665744525L, this, obj);
                }
                if (obj instanceof RemoteRepository) {
                    return this.repositorieURL.equals(((RemoteRepository) obj).repositorieURL);
                }
                return false;
            } catch (Throwable th) {
                if (gn) {
                    iy.j3(th, 38685007665744525L, this, obj);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 742813974162732472L, container = 742813974162732472L, user = true)
    public static abstract class Repository extends LineNumber {

        @fy
        private static /* synthetic */ boolean Hw;

        @gy
        private static /* synthetic */ boolean v5;

        static {
            iy.Zo(Repository.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = 104878304362335072L)
        public Repository(int i) {
            super(i);
            try {
                if (Hw) {
                    iy.u7(12403010354478320L, null, i);
                }
            } catch (Throwable th) {
                if (v5) {
                    iy.j3(th, 12403010354478320L, null, new Integer(i));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1619696761456734831L, container = 1619696761456734831L, user = true)
    public class SigningConfig {

        @gy
        private static /* synthetic */ boolean VH;

        @fy
        private static /* synthetic */ boolean Zo;

        @dy(field = 2426966447791751808L)
        @hy
        final /* synthetic */ BuildGradle buildGradle;

        @dy(field = -959449003502502457L)
        public String keyAlias;

        @dy(field = 1347690485466222464L)
        public String keyPassword;

        @dy(field = 3572955734396288019L)
        public String storeFilePath;

        @dy(field = 4821753889686923280L)
        public String storePassword;

        static {
            iy.Zo(SigningConfig.class);
        }

        @ey(method = -63988307109927552L)
        public SigningConfig(BuildGradle buildGradle) {
            try {
                if (Zo) {
                    iy.tp(-2047864970191742275L, null, buildGradle);
                }
                this.buildGradle = buildGradle;
                this.storeFilePath = "";
                this.keyAlias = "";
                this.keyPassword = "";
                this.storePassword = "";
            } catch (Throwable th) {
                if (VH) {
                    iy.j3(th, -2047864970191742275L, null, buildGradle);
                }
                throw th;
            }
        }

        @ey(method = 2757298902406771648L)
        public String getStoreFilePath() {
            try {
                if (Zo) {
                    iy.gn(2248348190133264L, this);
                }
                return FileSystem.Qq(FileSystem.getParent(this.buildGradle.configurationPath), this.storeFilePath);
            } catch (Throwable th) {
                if (VH) {
                    iy.aM(th, 2248348190133264L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 2000263789109823669L, container = 2000263789109823669L, user = true)
    public static class k extends Dependency {

        @gy
        private static /* synthetic */ boolean VH;

        @fy
        private static /* synthetic */ boolean Zo;

        static {
            iy.Zo(k.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = 414207068650976452L)
        public k(int i) {
            super(i);
            try {
                if (Zo) {
                    iy.u7(3575376432646579617L, null, i);
                }
            } catch (Throwable th) {
                if (VH) {
                    iy.j3(th, 3575376432646579617L, null, new Integer(i));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -2778988359321004501L, container = -2778988359321004501L, user = true)
    public static class l extends Dependency {

        @gy
        private static /* synthetic */ boolean VH;

        @fy
        private static /* synthetic */ boolean Zo;

        static {
            iy.Zo(l.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = 143870121304387139L)
        public l(int i) {
            super(i);
            try {
                if (Zo) {
                    iy.u7(-2874288245464115491L, null, i);
                }
            } catch (Throwable th) {
                if (VH) {
                    iy.j3(th, -2874288245464115491L, null, new Integer(i));
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(BuildGradle.class);
    }

    @ey(method = -1227019157847557340L)
    public BuildGradle() {
        try {
            if (j3) {
                iy.gn(4295612260233985280L, null);
            }
            this.defaultConfigProductFlavor = new ProductFlavor(this);
            this.curAndroidNodeLine = -1;
            this.curFlavorsNodeLine = -1;
            this.productFlavorMap = new TreeMap();
            this.curProjectsRepositorys = new ArrayList();
            this.allProjectsRepositorys = new ArrayList();
            this.subProjectsRepositorys = new ArrayList();
            this.curDependenciesNodeLine = -1;
            this.dependencies = new ArrayList();
            this.subProjectsDependencies = new ArrayList();
            this.allProjectsDependencies = new ArrayList();
            this.signingConfigMap = new HashMap();
        } catch (Throwable th) {
            if (Mr) {
                iy.aM(th, 4295612260233985280L, null);
            }
            throw th;
        }
    }

    @ey(method = 619002590164349040L)
    private boolean BT(String str, String str2) {
        try {
            if (j3) {
                iy.EQ(360695396428775855L, this, str, str2);
            }
            return str.startsWith(str2 + ".");
        } catch (Throwable th) {
            if (Mr) {
                iy.Mr(th, 360695396428775855L, this, str, str2);
            }
            throw th;
        }
    }

    @ey(method = 6059247112536834789L)
    private String EQ(AST ast, String str) {
        try {
            if (j3) {
                iy.EQ(3295877861031193600L, this, ast, str);
            }
            AST astXL = XL(Ws(Ws(ast)));
            if (rN(astXL) != 33 || rN(Ws(astXL)) != 27 || !str.equals(lg(Ws(Ws(astXL))))) {
                return null;
            }
            AST astWs = Ws(XL(Ws(Ws(astXL))));
            if (rN(astWs) == 28) {
                return lg(Ws(astWs));
            }
            return null;
        } catch (Throwable th) {
            if (Mr) {
                iy.Mr(th, 3295877861031193600L, this, ast, str);
            }
            throw th;
        }
    }

    @ey(method = 4597366328078322465L)
    private void FH(String str, String str2, int i) {
        try {
            if (j3) {
                iy.we(-1919821800456425772L, this, str, str2, new Integer(i));
            }
            try {
                ArrayList arrayList = new ArrayList();
                BufferedReader bufferedReader = new BufferedReader(new FileReader(this.configurationPath));
                int i2 = 1;
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    arrayList.add(line);
                    if (i2 == i) {
                        arrayList.add(str);
                    }
                    i2++;
                }
                if (i < 0) {
                    arrayList.add(str2 + " {");
                    arrayList.add(str);
                    arrayList.add("}");
                }
                bufferedReader.close();
                FileWriter fileWriter = new FileWriter(this.configurationPath);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    fileWriter.write((String) it.next());
                    fileWriter.write("\n");
                }
                fileWriter.close();
            } catch (IOException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Mr) {
                iy.U2(th, -1919821800456425772L, this, str, str2, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 4656644305554862080L)
    private void Hw(String str) {
        try {
            if (j3) {
                iy.tp(-94593132100887129L, this, str);
            }
            FH("\t" + str, "dependencies", this.curDependenciesNodeLine);
        } catch (Throwable th) {
            if (Mr) {
                iy.j3(th, -94593132100887129L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -1646303968781143888L)
    private String J0(AST ast) {
        try {
            if (j3) {
                iy.tp(231631582846535895L, this, ast);
            }
            if (rN(ast) != 28) {
                return null;
            }
            if (rN(Ws(ast)) == 27 || rN(Ws(ast)) == 124) {
                return aM(Ws(Ws(ast)));
            }
            return null;
        } catch (Throwable th) {
            if (Mr) {
                iy.j3(th, 231631582846535895L, this, ast);
            }
            throw th;
        }
    }

    @ey(method = 158827010830106073L)
    private String J8(AST ast) {
        try {
            if (j3) {
                iy.tp(-5866436128366238416L, this, ast);
            }
            AST astXL = XL(Ws(Ws(ast)));
            if (rN(astXL) != 88 && rN(astXL) != 199) {
                if (rN(astXL) == 33) {
                    return rN(Ws(astXL)) == 28 ? lg(Ws(Ws(astXL))) : lg(Ws(astXL));
                }
                return null;
            }
            return lg(astXL);
        } catch (Throwable th) {
            if (Mr) {
                iy.j3(th, -5866436128366238416L, this, ast);
            }
            throw th;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @ey(method = -843716835962748865L)
    private void KD(AST ast, String str, List<Repository> list) {
        try {
            if (j3) {
                iy.we(5378452948754511368L, this, ast, str, list);
            }
            list.add(new RemoteRepository(ast.getLine(), "https://dl.google.com/dl/android/maven2"));
            char c = 65535;
            switch (str.hashCode()) {
                case -1844260212:
                    if (str.equals("maven.url")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1777904321:
                    if (str.equals("jcenter")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1349030688:
                    if (str.equals("flatDir.dirs")) {
                        c = 2;
                        break;
                    }
                    break;
                case -138026646:
                    if (str.equals("mavenCentral")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                list.add(new RemoteRepository(ast.getLine(), "http://repo.maven.apache.org/maven2"));
                return;
            }
            if (c == 1) {
                list.add(new RemoteRepository(ast.getLine(), "https://jcenter.bintray.com"));
                return;
            }
            if (c != 2) {
                if (c != 3) {
                    return;
                }
                list.add(new RemoteRepository(ast.getLine(), J8(ast)));
            } else {
                FlatLocalRepository flatLocalRepository = new FlatLocalRepository(ast.getLine());
                flatLocalRepository.flatDir = J8(ast);
                list.add(flatLocalRepository);
            }
        } catch (Throwable th) {
            if (Mr) {
                iy.U2(th, 5378452948754511368L, this, ast, str, list);
            }
            throw th;
        }
    }

    @ey(method = -1354111218991793795L)
    private String Mr(String str, int i) {
        try {
            if (j3) {
                iy.EQ(569395112634206592L, this, str, new Integer(i));
            }
            String[] strArrSplit = str.split("\\.");
            if (strArrSplit.length <= i) {
                return null;
            }
            String str2 = "";
            for (int i2 = i; i2 < strArrSplit.length; i2++) {
                if (str2.length() > 0) {
                    str2 = str2 + ".";
                }
                str2 = str2 + strArrSplit[i2];
            }
            return str2;
        } catch (Throwable th) {
            if (Mr) {
                iy.Mr(th, 569395112634206592L, this, str, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 420219240647807157L)
    private void P8(AST ast, String str, ProductFlavor productFlavor) {
        try {
            if (j3) {
                iy.we(3793982689365377336L, this, ast, str, productFlavor);
            }
            switch (str) {
                case "minSdkVersion":
                case "minSdkVersion.apiLevel":
                    productFlavor.minSdkVersion = J8(ast);
                    return;
                case "targetSdkVersion":
                case "targetSdkVersion.apiLevel":
                    productFlavor.targetSdkVersion = J8(ast);
                    return;
                case "versionCode":
                    productFlavor.versionCode = J8(ast);
                    return;
                case "versionName":
                    productFlavor.versionName = J8(ast);
                    return;
                case "packageName":
                    productFlavor.applicationId = J8(ast);
                    return;
                case "applicationId":
                    productFlavor.applicationId = J8(ast);
                    return;
                case "multiDexEnabled":
                    productFlavor.multiDexEnabled = J8(ast);
                    return;
                default:
                    return;
            }
        } catch (Throwable th) {
            if (Mr) {
                iy.U2(th, 3793982689365377336L, this, ast, str, productFlavor);
            }
            throw th;
        }
    }

    @ey(method = 125017814798993571L)
    private void SI(AST ast, String str, int i) {
        try {
            if (j3) {
                iy.we(6367764524688151200L, this, ast, str, new Integer(i));
            }
            String strJ3 = j3(str, i);
            if (!this.productFlavorMap.containsKey(strJ3)) {
                this.productFlavorMap.put(strJ3, new ProductFlavor(this));
            }
            String strMr = Mr(str, i + 1);
            if (strMr != null) {
                P8(ast, strMr, this.productFlavorMap.get(strJ3));
            }
        } catch (Throwable th) {
            if (Mr) {
                iy.U2(th, 6367764524688151200L, this, ast, str, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 3184165110682800923L)
    private static AST Ws(AST ast) {
        try {
            if (j3) {
                iy.tp(2418502154847056660L, null, ast);
            }
            if (ast == null) {
                return null;
            }
            return ast.getFirstChild();
        } catch (Throwable th) {
            if (Mr) {
                iy.j3(th, 2418502154847056660L, null, ast);
            }
            throw th;
        }
    }

    @ey(method = 3889559935012124376L)
    private static AST XL(AST ast) {
        try {
            if (j3) {
                iy.tp(3204003455159863735L, null, ast);
            }
            if (ast == null) {
                return null;
            }
            return ast.getNextSibling();
        } catch (Throwable th) {
            if (Mr) {
                iy.j3(th, 3204003455159863735L, null, ast);
            }
            throw th;
        }
    }

    @ey(method = -1936096713192763212L)
    private String aM(AST ast) {
        try {
            if (j3) {
                iy.tp(-4327957185510312655L, this, ast);
            }
            if (rN(ast) != 90) {
                return lg(ast);
            }
            AST astWs = Ws(ast);
            return aM(astWs) + "." + lg(XL(astWs));
        } catch (Throwable th) {
            if (Mr) {
                iy.j3(th, -4327957185510312655L, this, ast);
            }
            throw th;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @ey(method = 500282480585286583L)
    private void cn(AST ast, String str, SigningConfig signingConfig) {
        try {
            if (j3) {
                iy.we(-4378578537138425604L, this, ast, str, signingConfig);
            }
            char c = 65535;
            switch (str.hashCode()) {
                case -996366692:
                    if (str.equals("storePassword")) {
                        c = 3;
                        break;
                    }
                    break;
                case -45289958:
                    if (str.equals("keyPassword")) {
                        c = 2;
                        break;
                    }
                    break;
                case 473180977:
                    if (str.equals("keyAlias")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1691552253:
                    if (str.equals("storeFile")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                signingConfig.storeFilePath = EQ(ast, "file");
                return;
            }
            if (c == 1) {
                signingConfig.keyAlias = J8(ast);
            } else if (c == 2) {
                signingConfig.keyPassword = J8(ast);
            } else {
                if (c != 3) {
                    return;
                }
                signingConfig.storePassword = J8(ast);
            }
        } catch (Throwable th) {
            if (Mr) {
                iy.U2(th, -4378578537138425604L, this, ast, str, signingConfig);
            }
            throw th;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @ey(method = 2385861603729716480L)
    private void ei(AST ast, String str, List<Dependency> list) {
        Map<String, String> mapWe;
        try {
            if (j3) {
                iy.we(-5517500361644114175L, this, ast, str, list);
            }
            char c = 65535;
            switch (str.hashCode()) {
                case -1913967790:
                    if (str.equals("androidTestCompile")) {
                        c = 2;
                        break;
                    }
                    break;
                case 96794:
                    if (str.equals("api")) {
                        c = 4;
                        break;
                    }
                    break;
                case 557892929:
                    if (str.equals("testCompile")) {
                        c = 1;
                        break;
                    }
                    break;
                case 950491699:
                    if (str.equals("compile")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1223343650:
                    if (str.equals("wearApp")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1683336114:
                    if (str.equals("implementation")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                String strEQ = EQ(ast, "project");
                if (strEQ == null && (mapWe = we(ast, "project")) != null && mapWe.containsKey("path")) {
                    strEQ = mapWe.get("path");
                }
                if (strEQ == null) {
                    list.add(new l(ast.getLine()));
                    return;
                }
                ProjectDependency projectDependency = new ProjectDependency(ast.getLine());
                this.wearAppProject = projectDependency;
                projectDependency.projectName = strEQ;
                return;
            }
            if (c == 1 || c == 2) {
                list.add(new k(ast.getLine()));
                return;
            }
            if (c != 3 && c != 4 && c != 5) {
                list.add(new l(ast.getLine()));
                return;
            }
            String strEQ2 = EQ(ast, "project");
            if (strEQ2 != null) {
                ProjectDependency projectDependency2 = new ProjectDependency(ast.getLine());
                list.add(projectDependency2);
                projectDependency2.projectName = strEQ2;
                return;
            }
            String strEQ3 = EQ(ast, "files");
            if (strEQ3 != null) {
                FilesDependency filesDependency = new FilesDependency(ast.getLine());
                list.add(filesDependency);
                filesDependency.filesPath = strEQ3;
                return;
            }
            Map<String, String> mapWe2 = we(ast, "fileTree");
            if (mapWe2 != null) {
                FileTreeDependency fileTreeDependency = new FileTreeDependency(ast.getLine());
                list.add(fileTreeDependency);
                fileTreeDependency.dirPath = mapWe2.get("dir");
                mapWe2.get("include");
                return;
            }
            String strJ8 = J8(ast);
            if (strJ8 == null) {
                list.add(new l(ast.getLine()));
                return;
            }
            MavenDependency mavenDependency = new MavenDependency(ast.getLine());
            list.add(mavenDependency);
            mavenDependency.coords = strJ8;
            String[] strArrSplit = strJ8.split(":");
            if (strArrSplit.length > 0) {
                mavenDependency.groupId = strArrSplit[0];
            }
            if (strArrSplit.length > 1) {
                mavenDependency.artifactId = strArrSplit[1];
            }
            if (strArrSplit.length > 2) {
                String str2 = strArrSplit[2];
                if (str2.indexOf("@") < 0) {
                    mavenDependency.version = str2;
                } else {
                    mavenDependency.version = str2.substring(0, str2.indexOf("@"));
                    mavenDependency.packaging = str2.substring(str2.indexOf("@") + 1);
                }
            }
        } catch (Throwable th) {
            if (Mr) {
                iy.U2(th, -5517500361644114175L, this, ast, str, list);
            }
            throw th;
        }
    }

    @ey(method = -3620299408080907057L)
    private String j3(String str, int i) {
        try {
            if (j3) {
                iy.EQ(-2348781690214816884L, this, str, new Integer(i));
            }
            String[] strArrSplit = str.split("\\.");
            if (strArrSplit.length > i) {
                return strArrSplit[i];
            }
            return null;
        } catch (Throwable th) {
            if (Mr) {
                iy.Mr(th, -2348781690214816884L, this, str, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 326642875763936100L)
    private static String lg(AST ast) {
        try {
            if (j3) {
                iy.tp(-7055095270116926989L, null, ast);
            }
            if (ast == null) {
                return null;
            }
            return ast.getText();
        } catch (Throwable th) {
            if (Mr) {
                iy.j3(th, -7055095270116926989L, null, ast);
            }
            throw th;
        }
    }

    @ey(method = 8822841499678421313L)
    private void nw(AST ast, String str) {
        try {
            if (j3) {
                iy.EQ(618915073926966824L, this, ast, str);
            }
            String strJ0 = J0(ast);
            if (strJ0 == null) {
                return;
            }
            if (str.length() != 0) {
                strJ0 = str + "." + strJ0;
            }
            switch (strJ0) {
                case "android":
                case "model.android":
                    this.curAndroidNodeLine = tp(ast);
                    break;
                case "android.compileSdkVersion":
                case "model.android.compileSdkVersion":
                    J8(ast);
                    break;
                case "android.productFlavors":
                case "model.android.productFlavors":
                    this.curFlavorsNodeLine = tp(ast);
                    break;
                case "dependencies":
                    this.curDependenciesNodeLine = tp(ast);
                    break;
                default:
                    if (!BT(strJ0, "android.defaultConfig")) {
                        if (!BT(strJ0, "model.android.defaultConfig")) {
                            if (!BT(strJ0, "model.android.defaultConfig.with")) {
                                if (!BT(strJ0, "android.productFlavors")) {
                                    if (!BT(strJ0, "model.android.productFlavors")) {
                                        if (!BT(strJ0, "android.signingConfigs")) {
                                            if (!BT(strJ0, "model.android.signingConfigs")) {
                                                if (!BT(strJ0, "dependencies")) {
                                                    if (!BT(strJ0, "subprojects.dependencies")) {
                                                        if (!BT(strJ0, "allprojects.dependencies")) {
                                                            if (!BT(strJ0, "repositories")) {
                                                                if (!BT(strJ0, "subprojects.repositories")) {
                                                                    if (BT(strJ0, "allprojects.repositories")) {
                                                                        KD(ast, Mr(strJ0, 2), this.allProjectsRepositorys);
                                                                        break;
                                                                    }
                                                                } else {
                                                                    KD(ast, Mr(strJ0, 2), this.subProjectsRepositorys);
                                                                    break;
                                                                }
                                                            } else {
                                                                KD(ast, Mr(strJ0, 1), this.curProjectsRepositorys);
                                                                break;
                                                            }
                                                        } else {
                                                            ei(ast, Mr(strJ0, 2), this.allProjectsDependencies);
                                                            break;
                                                        }
                                                    } else {
                                                        ei(ast, Mr(strJ0, 2), this.subProjectsDependencies);
                                                        break;
                                                    }
                                                } else {
                                                    ei(ast, Mr(strJ0, 1), this.dependencies);
                                                    break;
                                                }
                                            } else {
                                                ro(ast, strJ0, 3);
                                                break;
                                            }
                                        } else {
                                            ro(ast, strJ0, 2);
                                            break;
                                        }
                                    } else {
                                        SI(ast, strJ0, 3);
                                        break;
                                    }
                                } else {
                                    SI(ast, strJ0, 2);
                                    break;
                                }
                            } else {
                                P8(ast, Mr(strJ0, 4), this.defaultConfigProductFlavor);
                                break;
                            }
                        } else {
                            P8(ast, Mr(strJ0, 3), this.defaultConfigProductFlavor);
                            break;
                        }
                    } else {
                        P8(ast, Mr(strJ0, 2), this.defaultConfigProductFlavor);
                        break;
                    }
                    break;
            }
            Iterator<AST> it = u7(ast).iterator();
            while (it.hasNext()) {
                nw(it.next(), strJ0);
            }
        } catch (Throwable th) {
            if (Mr) {
                iy.Mr(th, 618915073926966824L, this, ast, str);
            }
            throw th;
        }
    }

    @ey(method = -481899317211900245L)
    private static int rN(AST ast) {
        try {
            if (j3) {
                iy.tp(2929658879113422528L, null, ast);
            }
            if (ast == null) {
                return 0;
            }
            return ast.getType();
        } catch (Throwable th) {
            if (Mr) {
                iy.j3(th, 2929658879113422528L, null, ast);
            }
            throw th;
        }
    }

    @ey(method = -1006810929411975240L)
    private void ro(AST ast, String str, int i) {
        try {
            if (j3) {
                iy.we(-706228985396337313L, this, ast, str, new Integer(i));
            }
            String strJ3 = j3(str, i);
            if (!this.signingConfigMap.containsKey(strJ3)) {
                this.signingConfigMap.put(strJ3, new SigningConfig(this));
            }
            String strMr = Mr(str, i + 1);
            if (strMr != null) {
                cn(ast, strMr, this.signingConfigMap.get(strJ3));
            }
        } catch (Throwable th) {
            if (Mr) {
                iy.U2(th, -706228985396337313L, this, ast, str, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -7179625226708456205L)
    private int tp(AST ast) {
        try {
            if (j3) {
                iy.tp(-5329485076578877016L, this, ast);
            }
            AST astXL = XL(Ws(Ws(ast)));
            return astXL == null ? ast.getLine() : astXL.getLine();
        } catch (Throwable th) {
            if (Mr) {
                iy.j3(th, -5329485076578877016L, this, ast);
            }
            throw th;
        }
    }

    @ey(method = -4304460119280255676L)
    private List<AST> u7(AST ast) {
        try {
            if (j3) {
                iy.tp(4000950265450891585L, this, ast);
            }
            ArrayList arrayList = new ArrayList();
            for (AST astWs = Ws(XL(Ws(Ws(ast)))); astWs != null; astWs = XL(astWs)) {
                if (rN(astWs) == 28) {
                    arrayList.add(astWs);
                }
            }
            return arrayList;
        } catch (Throwable th) {
            if (Mr) {
                iy.j3(th, 4000950265450891585L, this, ast);
            }
            throw th;
        }
    }

    @ey(method = -51819695781453060L)
    private Map<String, String> we(AST ast, String str) {
        try {
            if (j3) {
                iy.EQ(-7706120763755659553L, this, ast, str);
            }
            AST astXL = XL(Ws(Ws(ast)));
            if (rN(astXL) != 33 || rN(Ws(astXL)) != 27 || !str.equals(lg(Ws(Ws(astXL))))) {
                return null;
            }
            HashMap map = new HashMap();
            for (AST astWs = Ws(XL(Ws(Ws(astXL)))); astWs != null; astWs = XL(astWs)) {
                if (rN(astWs) == 54) {
                    String strLg = lg(Ws(astWs));
                    AST astWs2 = Ws(XL(Ws(astWs)));
                    if (rN(astWs2) == 57) {
                        map.put(strLg, lg(Ws(Ws(Ws(astWs2)))));
                    } else {
                        map.put(strLg, lg(astWs2));
                    }
                }
            }
            return map;
        } catch (Throwable th) {
            if (Mr) {
                iy.Mr(th, -7706120763755659553L, this, ast, str);
            }
            throw th;
        }
    }

    @ey(method = -533679530222884365L)
    public void addMavenDependency(String str) {
        try {
            if (j3) {
                iy.tp(6030914371349911640L, this, str);
            }
            Hw("api '" + str + "'");
        } catch (Throwable th) {
            if (Mr) {
                iy.j3(th, 6030914371349911640L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -1379492350846733376L)
    public void addProductFlavor(String str) {
        try {
            if (j3) {
                iy.tp(-419629430739220605L, this, str);
            }
            String str2 = "\t\t" + str + " {\n\t\t}";
            if (this.curFlavorsNodeLine != -1) {
                FH(str2, "", this.curFlavorsNodeLine);
                return;
            }
            FH("\tproductFlavors {\n" + str2 + "\n\t}\n", "android", this.curAndroidNodeLine);
        } catch (Throwable th) {
            if (Mr) {
                iy.j3(th, -419629430739220605L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 4214431242666333624L)
    public void addProjectDependency(String str) {
        try {
            if (j3) {
                iy.tp(-2676146857279896627L, this, str);
            }
            Hw("api project('" + (":" + FileSystem.BT(FileSystem.getParent(FileSystem.getParent(this.configurationPath)), str).replace("/", ":")) + "')");
        } catch (Throwable th) {
            if (Mr) {
                iy.j3(th, -2676146857279896627L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 3338846830507195293L)
    public String getFlavorApplicationId(String str) {
        try {
            if (j3) {
                iy.tp(3564388611711902876L, this, str);
            }
            return (str == null || !this.productFlavorMap.containsKey(str) || this.productFlavorMap.get(str).applicationId == null) ? this.defaultConfigProductFlavor.applicationId : this.productFlavorMap.get(str).applicationId;
        } catch (Throwable th) {
            if (Mr) {
                iy.j3(th, 3564388611711902876L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -5985521818088904672L)
    public String getMinSdkVersion(String str) {
        try {
            if (j3) {
                iy.tp(-4314136344502868299L, this, str);
            }
            return (str == null || !this.productFlavorMap.containsKey(str) || this.productFlavorMap.get(str).minSdkVersion == null) ? this.defaultConfigProductFlavor.minSdkVersion : this.productFlavorMap.get(str).minSdkVersion;
        } catch (Throwable th) {
            if (Mr) {
                iy.j3(th, -4314136344502868299L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 6041453276347810949L)
    public SigningConfig getSigningConfig(String str) {
        try {
            if (j3) {
                iy.tp(5849870081758724140L, this, str);
            }
            if (str == null) {
                return null;
            }
            return this.signingConfigMap.get(str);
        } catch (Throwable th) {
            if (Mr) {
                iy.j3(th, 5849870081758724140L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -260600330802903175L)
    public String getTargetSdkVersion(String str) {
        try {
            if (j3) {
                iy.tp(3477512129983491552L, this, str);
            }
            return (str == null || !this.productFlavorMap.containsKey(str) || this.productFlavorMap.get(str).targetSdkVersion == null) ? this.defaultConfigProductFlavor.targetSdkVersion : this.productFlavorMap.get(str).targetSdkVersion;
        } catch (Throwable th) {
            if (Mr) {
                iy.j3(th, 3477512129983491552L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 3293492391554464203L)
    public String getVersionCode(String str) {
        try {
            if (j3) {
                iy.tp(73518745279428840L, this, str);
            }
            return (str == null || !this.productFlavorMap.containsKey(str) || this.productFlavorMap.get(str).versionCode == null) ? this.defaultConfigProductFlavor.versionCode : this.productFlavorMap.get(str).versionCode;
        } catch (Throwable th) {
            if (Mr) {
                iy.j3(th, 73518745279428840L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -2671332960076943973L)
    public String getVersionName(String str) {
        try {
            if (j3) {
                iy.tp(-4814713408812496720L, this, str);
            }
            return (str == null || !this.productFlavorMap.containsKey(str) || this.productFlavorMap.get(str).versionName == null) ? this.defaultConfigProductFlavor.versionName : this.productFlavorMap.get(str).versionName;
        } catch (Throwable th) {
            if (Mr) {
                iy.j3(th, -4814713408812496720L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -2351107092794929735L)
    public boolean isMultiDexEnabled(String str) {
        try {
            if (j3) {
                iy.tp(-4021315468514186808L, this, str);
            }
            return (str == null || !this.productFlavorMap.containsKey(str) || this.productFlavorMap.get(str).multiDexEnabled == null) ? "true".equals(this.defaultConfigProductFlavor.multiDexEnabled) : "true".equals(this.productFlavorMap.get(str).multiDexEnabled);
        } catch (Throwable th) {
            if (Mr) {
                iy.j3(th, -4021315468514186808L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.util.Configuration
    @ey(method = 223896890801975035L)
    /* renamed from: vy, reason: merged with bridge method [inline-methods] */
    public BuildGradle makeConfiguration(String str) {
        try {
            if (j3) {
                iy.tp(-6829940143184617536L, this, str);
            }
            return new BuildGradle(str);
        } catch (Throwable th) {
            if (Mr) {
                iy.j3(th, -6829940143184617536L, this, str);
            }
            throw th;
        }
    }

    @cy(clazz = -2008949414407267840L, container = -2008949414407267840L, user = true)
    public static class MavenDependency extends Dependency {

        @fy
        private static /* synthetic */ boolean EQ;

        @gy
        private static /* synthetic */ boolean we;

        @dy(field = -2666133708320136600L)
        public String artifactId;

        @dy(field = -2668523400165617652L)
        public String coords;

        @dy(field = 2430830052864966556L)
        public String groupId;

        @dy(field = -1074738349227021820L)
        public String packaging;

        @dy(field = 479733083154389437L)
        public String version;

        static {
            iy.Zo(MavenDependency.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = 113913698089348527L)
        public MavenDependency(int i) {
            super(i);
            try {
                if (EQ) {
                    iy.u7(-4980028418955078155L, null, i);
                }
                this.groupId = "";
                this.artifactId = "";
                this.version = "+";
                this.packaging = "";
            } catch (Throwable th) {
                if (we) {
                    iy.j3(th, -4980028418955078155L, null, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -433500171742124472L)
        public boolean equals(Object obj) {
            try {
                if (EQ) {
                    iy.tp(-219591331431235680L, this, obj);
                }
                if (!(obj instanceof MavenDependency)) {
                    return false;
                }
                MavenDependency mavenDependency = (MavenDependency) obj;
                if (mavenDependency.groupId.equals(this.groupId) && mavenDependency.artifactId.equals(this.artifactId) && mavenDependency.version.equals(this.version)) {
                    return mavenDependency.packaging.equals(this.packaging);
                }
                return false;
            } catch (Throwable th) {
                if (we) {
                    iy.j3(th, -219591331431235680L, this, obj);
                }
                throw th;
            }
        }

        @ey(method = -1740403733081332491L)
        public String getGroupIdArtifactId() {
            try {
                if (EQ) {
                    iy.gn(-1506372577483390727L, this);
                }
                return this.groupId + ":" + this.artifactId;
            } catch (Throwable th) {
                if (we) {
                    iy.aM(th, -1506372577483390727L, this);
                }
                throw th;
            }
        }

        @ey(method = -3140714999396078787L)
        public int hashCode() {
            try {
                if (EQ) {
                    iy.gn(1062998868325404097L, this);
                }
                return this.groupId.hashCode() + this.artifactId.hashCode();
            } catch (Throwable th) {
                if (we) {
                    iy.aM(th, 1062998868325404097L, this);
                }
                throw th;
            }
        }

        @ey(method = -2323516431546815660L)
        public String toString() {
            try {
                if (EQ) {
                    iy.gn(1872211631215363680L, this);
                }
                return this.groupId + ":" + this.artifactId + ":" + this.version;
            } catch (Throwable th) {
                if (we) {
                    iy.aM(th, 1872211631215363680L, this);
                }
                throw th;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = -156192097335268239L)
        public MavenDependency(MavenDependency mavenDependency, String str) {
            super(mavenDependency.line);
            try {
                if (EQ) {
                    iy.EQ(-1295578929449820525L, null, mavenDependency, str);
                }
                this.groupId = "";
                this.artifactId = "";
                this.version = "+";
                this.packaging = "";
                this.version = str;
                this.groupId = mavenDependency.groupId;
                this.artifactId = mavenDependency.artifactId;
                this.packaging = mavenDependency.packaging;
            } catch (Throwable th) {
                if (we) {
                    iy.Mr(th, -1295578929449820525L, null, mavenDependency, str);
                }
                throw th;
            }
        }
    }

    @ey(method = -100839688189588600L)
    private BuildGradle(String str) {
        try {
            if (j3) {
                iy.tp(-2071928834764619200L, null, str);
            }
            this.defaultConfigProductFlavor = new ProductFlavor(this);
            this.curAndroidNodeLine = -1;
            this.curFlavorsNodeLine = -1;
            this.productFlavorMap = new TreeMap();
            this.curProjectsRepositorys = new ArrayList();
            this.allProjectsRepositorys = new ArrayList();
            this.subProjectsRepositorys = new ArrayList();
            this.curDependenciesNodeLine = -1;
            this.dependencies = new ArrayList();
            this.subProjectsDependencies = new ArrayList();
            this.allProjectsDependencies = new ArrayList();
            this.signingConfigMap = new HashMap();
            try {
                FileReader fileReader = new FileReader(str);
                SourceBuffer sourceBuffer = new SourceBuffer();
                UnicodeEscapingReader unicodeEscapingReader = new UnicodeEscapingReader(fileReader, sourceBuffer);
                GroovyLexer groovyLexer = new GroovyLexer(unicodeEscapingReader);
                unicodeEscapingReader.setLexer(groovyLexer);
                GroovyRecognizer groovyRecognizerMake = GroovyRecognizer.make(groovyLexer);
                groovyRecognizerMake.setSourceBuffer(sourceBuffer);
                groovyRecognizerMake.compilationUnit();
                fileReader.close();
                for (AST ast = groovyRecognizerMake.getAST(); ast != null; ast = XL(ast)) {
                    nw(ast, "");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Throwable th) {
            if (Mr) {
                iy.j3(th, -2071928834764619200L, null, str);
            }
            throw th;
        }
    }
}
