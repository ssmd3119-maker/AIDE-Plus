package com.aide.ui.project.internal;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.ui.util.FileSystem;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@cy(clazz = 5055569416012248315L, container = 5055569416012248315L, user = true)
/* loaded from: classes.dex */
public class GradleTools {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(GradleTools.class);
    }

    @ey(method = -2746829644629080871L)
    public GradleTools() {
        try {
            if (j6) {
                iy.gn(329814685272620568L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 329814685272620568L, null);
            }
            throw th;
        }
    }

    @ey(method = 1337490519228718881L)
    public static String BT(String str) {
        try {
            if (j6) {
                iy.tp(-2544859504808429856L, null, str);
            }
            return FileSystem.aM() + "/apk/" + FileSystem.getName(str) + ".apk";
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -2544859504808429856L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 1021319146108111072L)
    public static String DW(String str) {
        try {
            if (j6) {
                iy.tp(1165870240618862163L, null, str);
            }
            return FileSystem.getName(str) + ".apk";
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1165870240618862163L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -655757880434760112L)
    public static String EQ(String str) {
        try {
            if (j6) {
                iy.tp(24795661799075881L, null, str);
            }
            return Hw(str) + "/exploded-aar";
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 24795661799075881L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 5299441812555281607L)
    public static List<String> FH(String str, String str2, String str3) {
        try {
            if (j6) {
                iy.we(5091541062928197408L, null, str, str2, str3);
            }
            if (!isGradleProject(str)) {
                return Collections.singletonList(U2(str));
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(U2(str));
            if (str3 != null && !"main".equals(str3)) {
                arrayList.add(str + "/src/" + str3 + "/assets");
            }
            if (str2 != null) {
                arrayList.add(str + "/src/" + str2 + "/assets");
            }
            return arrayList;
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, 5091541062928197408L, null, str, str2, str3);
            }
            throw th;
        }
    }

    @ey(method = 3261126412797577584L)
    public static String Hw(String str) {
        try {
            if (j6) {
                iy.tp(-229172250814450911L, null, str);
            }
            if (isGradleProject(str)) {
                return str + "/build/bin";
            }
            return str + "/bin";
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -229172250814450911L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 3616478081290032L)
    public static String J0(String str, String str2) {
        try {
            if (j6) {
                iy.EQ(2525556916911377917L, null, str, str2);
            }
            if (isGradleProject(str) && str2 != null && !"main".equals(str2)) {
                String str3 = str + "/src/" + str2 + "/res";
                if (FileSystem.isDirectory(str3)) {
                    return str3;
                }
            }
            return null;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 2525556916911377917L, null, str, str2);
            }
            throw th;
        }
    }

    @ey(method = -2010563693572571495L)
    public static String J8(String str) {
        try {
            if (j6) {
                iy.tp(2923344691364490576L, null, str);
            }
            if (isGradleProject(str)) {
                return str + "/build/gen";
            }
            return str + "/gen";
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 2923344691364490576L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 55857002621040105L)
    public static String Mr(String str) {
        try {
            if (j6) {
                iy.tp(-2143162816375976616L, null, str);
            }
            if (isAarEexplodedPath(str)) {
                return str + "/libs";
            }
            if (isGradleProject(str)) {
                return str + "/libs";
            }
            return str + "/libs";
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -2143162816375976616L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -7315831205860313488L)
    public static String P8(String str) {
        try {
            if (j6) {
                iy.tp(7236813190115014173L, null, str);
            }
            return FileSystem.Qq(str, "../build.gradle");
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 7236813190115014173L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 353658387465895099L)
    public static String QX(String str) {
        try {
            if (j6) {
                iy.tp(1277078547273840624L, null, str);
            }
            return Hw(str) + "/injected/AndroidManifest.xml";
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1277078547273840624L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 25823367571262619L)
    public static String U2(String str) {
        try {
            if (j6) {
                iy.tp(-1483645710251643276L, null, str);
            }
            if (isGradleProject(str)) {
                return str + "/src/main/assets";
            }
            return str + "/assets";
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1483645710251643276L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -33912775131369204L)
    public static String VH(String str) {
        try {
            if (j6) {
                iy.tp(8147758450608217111L, null, str);
            }
            return Hw(str);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 8147758450608217111L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 1397656539040602456L)
    public static String Ws(String str) {
        try {
            if (j6) {
                iy.tp(-339943079727375475L, null, str);
            }
            if (!isGradleProject(str)) {
                return null;
            }
            return Hw(str) + "/generated";
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -339943079727375475L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 1150311299387222464L)
    public static String XL(String str) {
        try {
            if (j6) {
                iy.tp(-70864024740859473L, null, str);
            }
            return Hw(str) + "/jardex";
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -70864024740859473L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -168757717452118877L)
    public static String Zo(String str) {
        try {
            if (j6) {
                iy.tp(643150827880796484L, null, str);
            }
            return str + "/build.gradle";
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 643150827880796484L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 333278616578380375L)
    public static String a8(String str, String str2) {
        try {
            if (j6) {
                iy.EQ(-5867559191916800280L, null, str, str2);
            }
            if (isGradleProject(str)) {
                return str + "/src/main/AndroidManifest.xml";
            }
            if (str2 != null && !"main".equals(str2)) {
                String str3 = str + "/flavors/" + str2 + "/AndroidManifest.xml";
                if (FileSystem.isFileAndNotZip(str3)) {
                    return str3;
                }
            }
            return str + "/AndroidManifest.xml";
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -5867559191916800280L, null, str, str2);
            }
            throw th;
        }
    }

    @ey(method = 441700784036517303L)
    public static List<String> aM(String str, String str2, String str3) {
        try {
            if (j6) {
                iy.we(-2705127839778416768L, null, str, str2, str3);
            }
            if (isAarEexplodedPath(str)) {
                return Collections.singletonList(str + "/jni");
            }
            if (!isGradleProject(str)) {
                return Collections.singletonList(str + "/libs");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(str + "/src/main/jniLibs");
            if (str3 != null && !"main".equals(str3)) {
                arrayList.add(str + "/src/" + str3 + "/jniLibs");
            }
            if (str2 != null) {
                arrayList.add(str + "/src/" + str2 + "/jniLibs");
            }
            return arrayList;
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, -2705127839778416768L, null, str, str2, str3);
            }
            throw th;
        }
    }

    @ey(method = -828567314079558555L)
    public static boolean cb(String str) {
        try {
            if (j6) {
                iy.tp(-1879071983851456608L, null, str);
            }
            if (nw(str)) {
                if (FileSystem.exists(rN(str))) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1879071983851456608L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -958043168284638213L)
    public static String[] gW(String str, String str2) {
        try {
            if (j6) {
                iy.EQ(-190303033313080408L, null, str, str2);
            }
            if (!isGradleProject(str)) {
                return new String[]{str + "/src"};
            }
            if (str2 != null && !"main".equals(str2)) {
                String str3 = str + "/src/" + str2 + "/java";
                if (FileSystem.isDirectory(str3)) {
                    return new String[]{str + "/src/main/java", str + "/src/main/aidl", str3};
                }
            }
            return new String[]{str + "/src/main/java", str + "/src/main/aidl"};
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -190303033313080408L, null, str, str2);
            }
            throw th;
        }
    }

    @ey(method = -2240853136297844991L)
    public static String getCppSourcePath(String str) {
        try {
            if (j6) {
                iy.tp(-1721378713251393040L, null, str);
            }
            if (isGradleProject(str)) {
                return str + "/src/main/jni";
            }
            return str + "/jni";
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1721378713251393040L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 117369853506687936L)
    public static String getProjectProperties(String str) {
        try {
            if (j6) {
                iy.tp(-5103387868992549331L, null, str);
            }
            if (isGradleProject(str)) {
                return "";
            }
            return str + "/project.properties";
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -5103387868992549331L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -646906257065111445L)
    public static String getSettingsGradlePath(String str) {
        try {
            if (j6) {
                iy.tp(-1066898492866624120L, null, str);
            }
            return FileSystem.Qq(str, "../settings.gradle");
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1066898492866624120L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -66863009208285521L)
    public static String gn(String str) {
        try {
            if (j6) {
                iy.tp(-8223220009466489156L, null, str);
            }
            if (isGradleProject(str)) {
                return "";
            }
            return str + "/.classpath";
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -8223220009466489156L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 9500144567062080L)
    public static boolean isAarEexplodedPath(String str) {
        try {
            if (j6) {
                iy.tp(-1498082708627040741L, null, str);
            }
            if (FileSystem.exists(j6(str))) {
                if (FileSystem.exists(a8(str, null))) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1498082708627040741L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 1187046122809283061L)
    public static boolean isAndroidProject(String str) {
        try {
            if (j6) {
                iy.tp(1932078902069940876L, null, str);
            }
            if (new File(str + "/AndroidManifest.xml").exists()) {
                if (!isInsideGradleProject(str)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1932078902069940876L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 597287778549131195L)
    public static boolean isGradleProject(String str) {
        try {
            if (j6) {
                iy.tp(-908934281112909600L, null, str);
            }
            if (new File(str + "/src").exists()) {
                if (new File(str + "/build.gradle").exists()) {
                    if (!isAndroidProject(str)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -908934281112909600L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -322999388407107720L)
    private static boolean isInsideGradleProject(String str) {
        try {
            if (j6) {
                iy.tp(3200180194929264755L, null, str);
            }
            if ("src".equals(FileSystem.getName(FileSystem.getParent(str)))) {
                if (isGradleProject(FileSystem.getParent(FileSystem.getParent(str)))) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 3200180194929264755L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -3963442482895129647L)
    public static String j6(String str) {
        try {
            if (j6) {
                iy.tp(-7988407728649668984L, null, str);
            }
            return str + "/classes.jar";
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -7988407728649668984L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 291631321996582785L)
    public static String lg(String str) {
        try {
            if (j6) {
                iy.tp(-290462525071335900L, null, str);
            }
            return Hw(str) + "/merged/AndroidManifest.xml";
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -290462525071335900L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 4763181167407726219L)
    public static boolean nw(String str) {
        try {
            if (j6) {
                iy.tp(4896364450023516960L, null, str);
            }
            if (!isAndroidProject(str)) {
                if (!isGradleProject(str)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 4896364450023516960L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 696660510040861608L)
    public static String rN(String str) {
        try {
            if (j6) {
                iy.tp(-17700344372257197L, null, str);
            }
            return U2(str) + "/www";
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -17700344372257197L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 2624883019095671925L)
    public static boolean sh(String str) {
        try {
            if (j6) {
                iy.tp(-1814780239257932280L, null, str);
            }
            if (isGradleProject(str)) {
                return false;
            }
            return FileSystem.isFileAndNotZip(str + "/jni/Android.mk");
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1814780239257932280L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 3003472507983836000L)
    public static List<String> tp(String str) {
        try {
            if (j6) {
                iy.tp(2151865509126595915L, null, str);
            }
            if (FileSystem.isDirectory(str + "/flavors")) {
                try {
                    ArrayList arrayList = new ArrayList();
                    for (String str2 : FileSystem.J0(str + "/flavors")) {
                        if (FileSystem.KD(str2 + "/AndroidManifest.xml")) {
                            arrayList.add(FileSystem.getName(str2));
                        }
                    }
                    if (arrayList.size() > 0) {
                        return arrayList;
                    }
                } catch (IOException unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 2151865509126595915L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 4086758386955887032L)
    public static String u7(String str, boolean z) {
        try {
            if (j6) {
                iy.EQ(-425360667011199651L, null, str, new Boolean(z));
            }
            if (z) {
                return Hw(str) + "/classesdebug";
            }
            return Hw(str) + "/classesrelease";
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -425360667011199651L, null, str, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 874401604928226293L)
    public static String v5(String str) {
        try {
            if (j6) {
                iy.tp(-802055225629460440L, null, str);
            }
            return Hw(str) + "/res";
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -802055225629460440L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -2744657450497666676L)
    public static String vy(String str) {
        try {
            if (j6) {
                iy.tp(985099596843497631L, null, str);
            }
            return Hw(str) + "/resources.ap_";
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 985099596843497631L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 1521775742238204115L)
    public static String we(String str, String str2) {
        try {
            if (j6) {
                iy.EQ(1013853298467179160L, null, str, str2);
            }
            if (isGradleProject(str) && str2 != null && !"main".equals(str2)) {
                String str3 = str + "/src/" + str2 + "/AndroidManifest.xml";
                if (FileSystem.isFileAndNotZip(str3)) {
                    return str3;
                }
            }
            return null;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 1013853298467179160L, null, str, str2);
            }
            throw th;
        }
    }

    @ey(method = 2248435439880355260L)
    public static String yS(String str) {
        try {
            if (j6) {
                iy.tp(2229986576859501127L, null, str);
            }
            if (isGradleProject(str)) {
                return str + "/src/main/res";
            }
            return str + "/res";
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 2229986576859501127L, null, str);
            }
            throw th;
        }
    }
}
