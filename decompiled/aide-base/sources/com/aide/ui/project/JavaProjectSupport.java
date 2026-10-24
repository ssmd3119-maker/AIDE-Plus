package com.aide.ui.project;

import abcd.c0;
import abcd.cy;
import abcd.ey;
import abcd.fe;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.common.ValueRunnable;
import com.aide.engine.EngineSolution;
import com.aide.ui.R$drawable;
import com.aide.ui.ServiceContainer;
import com.aide.ui.build.BuildServiceCollect;
import com.aide.ui.project.internal.MakeJavaEngineSolution;
import com.aide.ui.services.ProjectSupport;
import com.aide.ui.services.TemplateService;
import com.aide.ui.trainer.c;
import com.aide.ui.u;
import com.aide.ui.util.ClassPath;
import com.aide.ui.util.FileSystem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@cy(clazz = 2793693412414817632L, container = 2793693412414817632L, user = true)
/* loaded from: classes.dex */
public class JavaProjectSupport implements ProjectSupport {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(JavaProjectSupport.class);
    }

    @ey(method = 825214525633549800L)
    public JavaProjectSupport() {
        try {
            if (j6) {
                iy.gn(391666163359204104L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 391666163359204104L, null);
            }
            throw th;
        }
    }

    @ey(method = -1232158009758640033L)
    public static String I(String str, String str2) {
        try {
            if (j6) {
                iy.EQ(-1773787202765954299L, null, str, str2);
            }
            for (String str3 : dx(str)) {
                if (FileSystem.nw(str3, str2)) {
                    return FileSystem.BT(str3, str2).replace('/', '.');
                }
            }
            return null;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -1773787202765954299L, null, str, str2);
            }
            throw th;
        }
    }

    @ey(method = -232277570221021000L)
    public static String Mz(String str, boolean z) {
        try {
            if (j6) {
                iy.EQ(551602789501091844L, null, str, new Boolean(z));
            }
            return vJ(str, z) + "/dex/jars";
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 551602789501091844L, null, str, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -1614000723129821520L)
    private boolean Qq() {
        try {
            if (j6) {
                iy.gn(1033257694606972960L, this);
            }
            int iJ8 = 0;
            for (String str : dx(ServiceContainer.getProjectService().getCurrentAppHome())) {
                iJ8 += FileSystem.J8(str, x9(), ".java");
                if (iJ8 >= x9()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1033257694606972960L, this);
            }
            throw th;
        }
    }

    @ey(method = -5099425147315256304L)
    public static String Sf(String str, boolean z) {
        try {
            if (j6) {
                iy.EQ(6940714751171552300L, null, str, new Boolean(z));
            }
            return vJ(str, z) + "/dex/classes.dex.zip";
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 6940714751171552300L, null, str, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 3030592237722467200L)
    public static String ca(Map<String, List<String>> map, String str) {
        try {
            if (j6) {
                iy.EQ(-671951478432254660L, null, map, str);
            }
            for (String str2 : sG(map)) {
                if (FileSystem.nw(str2, str)) {
                    return FileSystem.BT(str2, str).replace('/', '.');
                }
            }
            return null;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -671951478432254660L, null, map, str);
            }
            throw th;
        }
    }

    @ey(method = -3518927663961977092L)
    public static String[] cb(String str) {
        try {
            if (j6) {
                iy.tp(2300870452191153304L, null, str);
            }
            ArrayList arrayList = new ArrayList();
            for (ClassPath.Entry entry : new ClassPath().getConfiguration(g3(str)).Zo) {
                if (entry.isLibKind()) {
                    arrayList.add(entry.VH(str));
                }
            }
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 2300870452191153304L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -78934457821712405L)
    public static String[] dx(String str) {
        try {
            if (j6) {
                iy.tp(-5284948926816338715L, null, str);
            }
            ArrayList arrayList = new ArrayList();
            for (ClassPath.Entry entry : new ClassPath().getConfiguration(g3(str)).Zo) {
                if (entry.isSrcKind()) {
                    arrayList.add(entry.VH(str));
                }
            }
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -5284948926816338715L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -1949508141307515464L)
    public static String ef(String str, boolean z) {
        try {
            if (j6) {
                iy.EQ(-4341413986724372964L, null, str, new Boolean(z));
            }
            return vJ(str, z) + "/dex";
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -4341413986724372964L, null, str, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 8755896817411124560L)
    public static String g3(String str) {
        try {
            if (j6) {
                iy.tp(2547595195144711764L, null, str);
            }
            return str + "/.classpath";
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 2547595195144711764L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 4648406669837999944L)
    public static String[] sG(Map<String, List<String>> map) {
        try {
            if (j6) {
                iy.tp(932316593701375520L, null, map);
            }
            ArrayList arrayList = new ArrayList();
            for (String str : map.keySet()) {
                for (ClassPath.Entry entry : new ClassPath().getConfiguration(g3(str)).Zo) {
                    if (entry.isSrcKind()) {
                        arrayList.add(entry.VH(str));
                    }
                }
            }
            String[] strArr = new String[arrayList.size()];
            arrayList.toArray(strArr);
            return strArr;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 932316593701375520L, null, map);
            }
            throw th;
        }
    }

    @ey(method = -4153953601361983419L)
    public static String vJ(String str, boolean z) {
        try {
            if (j6) {
                iy.EQ(1367789976640152271L, null, str, new Boolean(z));
            }
            for (ClassPath.Entry entry : new ClassPath().getConfiguration(g3(str)).Zo) {
                if (entry.isOutputIKind()) {
                    String strVH = entry.VH(str);
                    if (z) {
                        return strVH + "/debug";
                    }
                    return strVH + "/release";
                }
            }
            if (z) {
                return str + "/bin/debug";
            }
            return str + "/bin/release";
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 1367789976640152271L, null, str, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -1587184037009814155L)
    private int x9() {
        try {
            if (!j6) {
                return 2;
            }
            iy.gn(335761148619763803L, this);
            return 2;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 335761148619763803L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 889606723063076857L)
    public boolean FH(String str) {
        try {
            if (j6) {
                iy.tp(-2007612208033038345L, this, str);
            }
            if (str.toLowerCase().endsWith(".jar")) {
                if (!Arrays.asList(cb(ServiceContainer.getProjectService().getCurrentAppHome())).contains(str)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -2007612208033038345L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -142575311183543395L)
    public boolean Hw() {
        try {
            if (!j6) {
                return false;
            }
            iy.gn(-7089856552801447365L, this);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -7089856552801447365L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 823499853340058705L)
    public void J0(String str) {
        try {
            if (j6) {
                iy.tp(1981618901340942695L, this, str);
            }
            String currentAppHome = ServiceContainer.getProjectService().getCurrentAppHome();
            List<ClassPath.Entry> list = new ClassPath().getConfiguration(g3(currentAppHome)).Zo;
            Iterator<ClassPath.Entry> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ClassPath.Entry next = it.next();
                if (next.isLibKind() && next.VH(currentAppHome).equals(str)) {
                    list.remove(next);
                    break;
                }
            }
            ClassPath.Hw(g3(currentAppHome), list);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1981618901340942695L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -6443555734859431011L)
    public boolean J8() {
        try {
            if (!j6) {
                return false;
            }
            iy.gn(6117126614163032755L, this);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 6117126614163032755L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -440288102385704928L)
    public void Mr() {
        try {
            if (j6) {
                iy.gn(-15643471048435296L, this);
            }
            ServiceContainer.getLicenseService().cn(ServiceContainer.getMainActivity(), u.shop_feature_premium_projects, "large_project");
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -15643471048435296L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -3588802356686619115L)
    public void P8(String str, String str2) {
        try {
            if (j6) {
                iy.EQ(294812127363169395L, this, str, str2);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 294812127363169395L, this, str, str2);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 1503419889918348787L)
    public void SI(String str, ValueRunnable<String> valueRunnable) {
        try {
            if (j6) {
                iy.EQ(-1855678251007064891L, this, str, valueRunnable);
            }
            fe.DW(str, valueRunnable);
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -1855678251007064891L, this, str, valueRunnable);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 2602308603967916175L)
    public void U2(String str, Map<String, List<String>> map, List<String> list) {
        try {
            if (j6) {
                iy.we(-6129825337551654335L, this, str, map, list);
            }
            map.put(str, new ArrayList());
            list.add(str);
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, -6129825337551654335L, this, str, map, list);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -1255404153364128255L)
    public TemplateService.TemplateGroup[] VH() {
        try {
            if (j6) {
                iy.gn(1131067569338544863L, this);
            }
            return new TemplateService.TemplateGroup[]{new TemplateService.TemplateGroup("Java Application", new TemplateService.Template(this, 3, "Java Application", "Java", "MyJavaConsoleApp", false, false, "com.aide.ui", "JAVA", "course_java", ServiceContainer.ca() || ServiceContainer.P8.equals("com.aide.ui")), R$drawable.ic_launcher_java, "JavaConsole.zip", new String[]{"Main.java"}, null)};
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1131067569338544863L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 2950406777596539456L)
    public List<c.C0094c> XL() {
        try {
            if (j6) {
                iy.gn(-1751453124824682264L, this);
            }
            return Arrays.asList(new c.C0094c("course_java", 1, new String[]{"com.aide.ui", "com.aide.trainer.java"}));
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1751453124824682264L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -5448397745718363264L)
    public boolean Zo(String str) {
        try {
            if (j6) {
                iy.tp(2727107145079476664L, this, str);
            }
            return fe.j6(str);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 2727107145079476664L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -3130973725782187887L)
    public boolean a8(String str) {
        try {
            if (j6) {
                iy.tp(-1658865502523695353L, this, str);
            }
            return Arrays.asList(cb(ServiceContainer.getProjectService().getCurrentAppHome())).contains(str);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1658865502523695353L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -1348480900015018075L)
    public boolean aM(String str) {
        try {
            if (j6) {
                iy.tp(-1502946952403260497L, this, str);
            }
            Iterator<String> it = ServiceContainer.getProjectService().getLibraryMapping().keySet().iterator();
            while (it.hasNext()) {
                if (FileSystem.nw(it.next(), str)) {
                    return true;
                }
            }
            for (String str2 : dx(ServiceContainer.getProjectService().getCurrentAppHome())) {
                if (FileSystem.nw(str2, str)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1502946952403260497L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 2609982001950720552L)
    public void buildProject(boolean z) {
        try {
            if (j6) {
                iy.Ws(6551052663397932620L, this, z);
            }
            BuildServiceCollect.javaProjectBuildService.XL(z, ServiceContainer.getProjectService().er());
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 6551052663397932620L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 34310010300078232L)
    public void cn(List<String> list, boolean z) {
        try {
            if (j6) {
                iy.EQ(4288878217891909980L, this, list, new Boolean(z));
            }
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 4288878217891909980L, this, list, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 3584963242686687232L)
    public void ei(String str) {
        try {
            if (j6) {
                iy.tp(-3465622584135908980L, this, str);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -3465622584135908980L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 207667827863841625L)
    public boolean gW() {
        try {
            if (!j6) {
                return false;
            }
            iy.gn(311964585125593823L, this);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 311964585125593823L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -864283519017835288L)
    public int getOpenProjectNameStringId(String str) {
        try {
            if (!j6) {
                return u.command_files_open_java_project;
            }
            iy.tp(-1082840353118477184L, this, str);
            return u.command_files_open_java_project;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1082840353118477184L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -1379907216978699111L)
    public List<String> getProductFlavors(String str) {
        try {
            if (!j6) {
                return null;
            }
            iy.tp(384500213864065539L, this, str);
            return null;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 384500213864065539L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -1039601680179618204L)
    public String getProjectAttributeHtmlString() {
        try {
            if (j6) {
                iy.gn(1496832615736448696L, this);
            }
            String str = ("<b>Java Project:</b><br/><br/>" + ServiceContainer.getProjectService().getCurrentAppHome() + "<br/><br/>") + "<i>Library JARs:</i><br/><br/>";
            String[] strArrCb = cb(ServiceContainer.getProjectService().getCurrentAppHome());
            if (strArrCb.length == 0) {
                return str + "&lt;none&gt;<br/><br/>";
            }
            for (String str2 : strArrCb) {
                if (!FileSystem.exists(str2)) {
                    str = str + "(NOT FOUND) ";
                }
                str = str + str2 + "<br/><br/>";
            }
            return str;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1496832615736448696L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -417465410313150680L)
    public void gn() {
        try {
            if (j6) {
                iy.gn(-3585970868152192L, this);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -3585970868152192L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -570152165363486784L)
    public boolean isPremium() {
        try {
            if (j6) {
                iy.gn(-69811361997947040L, this);
            }
            if (ServiceContainer.ca() || ServiceContainer.getLicenseService().Ws()) {
                return false;
            }
            if (c0.Ws(ServiceContainer.getMainActivity(), "AllowSavingOneJavaFileInNonPremium", 1.0d, 0.0d)) {
                return Qq();
            }
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -69811361997947040L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 7129499176044610200L)
    public boolean isSupport(String str) {
        try {
            if (j6) {
                iy.tp(1013175581687134208L, this, str);
            }
            if (FileSystem.exists(g3(str))) {
                if (!FileSystem.exists(str + "/AndroidManifest.xml")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1013175581687134208L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 5050030786987684784L)
    public boolean j3(String str) {
        try {
            if (j6) {
                iy.tp(-4833072011717200944L, this, str);
            }
            if (!ServiceContainer.ca() && !ServiceContainer.P8.equals("com.aide.ui")) {
                if (!ServiceContainer.P8.equals("com.aide.trainer.java")) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -4833072011717200944L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 6506233914607290985L)
    public void j6() {
        try {
            if (j6) {
                iy.gn(1581057273621888879L, this);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1581057273621888879L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -4696716385342169281L)
    public boolean lg() {
        try {
            if (!j6) {
                return true;
            }
            iy.gn(4081838800878329337L, this);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 4081838800878329337L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -1468446800406435000L)
    public EngineSolution makeEngineSolution() {
        try {
            if (j6) {
                iy.gn(-3872239307417140704L, this);
            }
            return MakeJavaEngineSolution.DW(ServiceContainer.getProjectService().getCurrentAppHome(), ServiceContainer.getProjectService().getAndroidJarPath(), null);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -3872239307417140704L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -3641730026299000867L)
    public void nw(String str) {
        try {
            if (j6) {
                iy.tp(-3427879366614745133L, this, str);
            }
            String currentAppHome = ServiceContainer.getProjectService().getCurrentAppHome();
            List<ClassPath.Entry> list = new ClassPath().getConfiguration(g3(currentAppHome)).Zo;
            list.add(new ClassPath.Entry("lib", FileSystem.lp(currentAppHome, str), false));
            ClassPath.Hw(g3(currentAppHome), list);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -3427879366614745133L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -359481658356851144L)
    public int rN(String str) {
        try {
            if (j6) {
                iy.tp(-100285065325905132L, this, str);
            }
            return fe.Hw(str);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -100285065325905132L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -4074485849944653473L)
    public List<String> ro(String str) {
        try {
            if (!j6) {
                return null;
            }
            iy.tp(-2610082531592807255L, this, str);
            return null;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -2610082531592807255L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -82167400608941088L)
    public String sh(String str) {
        try {
            if (j6) {
                iy.tp(-7013994048444584208L, this, str);
            }
            String[] strArrSG = sG(ServiceContainer.getProjectService().getLibraryMapping());
            if (!str.startsWith("/")) {
                str = "/" + str;
            }
            for (String str2 : strArrSG) {
                String str3 = str2 + str;
                if (FileSystem.exists(str3)) {
                    return str3;
                }
            }
            return null;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -7013994048444584208L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 642355415680964120L)
    public String tp(String str) {
        try {
            if (j6) {
                iy.tp(-1557429322153859008L, this, str);
            }
            if (j3(str)) {
                return null;
            }
            return "com.aide.ui";
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1557429322153859008L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 4688557158630911056L)
    public boolean u7(String str) {
        try {
            if (!j6) {
                return false;
            }
            iy.tp(3903443620038632736L, this, str);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 3903443620038632736L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -1781888940704881800L)
    public String v5(String str) {
        try {
            if (j6) {
                iy.tp(-4328879974228677312L, this, str);
            }
            String strCa = ca(ServiceContainer.getProjectService().getLibraryMapping(), FileSystem.getParent(str));
            if (strCa == null) {
                return str;
            }
            return strCa.replace('.', '/') + "/" + FileSystem.getName(str);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -4328879974228677312L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 1003945709493297000L)
    public boolean vy(String str) {
        try {
            if (!j6) {
                return false;
            }
            iy.tp(1738458739672370240L, this, str);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1738458739672370240L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -1775220633938098065L)
    public int we(String str) {
        try {
            if (j6) {
                iy.tp(1676999377948974401L, this, str);
            }
            return fe.FH(str);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1676999377948974401L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -18331867418089656L)
    public String yS() {
        try {
            if (!j6) {
                return "com.aide.ui";
            }
            iy.gn(6669876335521596692L, this);
            return "com.aide.ui";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 6669876335521596692L, this);
            }
            throw th;
        }
    }
}
