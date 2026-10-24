package com.aide.ui.project;

import abcd.c0;
import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import abcd.je;
import com.aide.common.ValueRunnable;
import com.aide.engine.EngineSolution;
import com.aide.ui.ServiceContainer;
import com.aide.ui.build.BuildServiceCollect;
import com.aide.ui.build.android.m;
import com.aide.ui.services.ProjectSupport;
import com.aide.ui.services.TemplateService;
import com.aide.ui.trainer.c;
import com.aide.ui.u;
import com.aide.ui.util.FileSystem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@cy(clazz = 3479916978222473536L, container = 3479916978222473536L, user = true)
/* loaded from: classes.dex */
public class NativeExecutableProjectSupport implements ProjectSupport {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(NativeExecutableProjectSupport.class);
    }

    @ey(method = -844650304822044860L)
    public NativeExecutableProjectSupport() {
        try {
            if (j6) {
                iy.gn(-3933557451191856880L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -3933557451191856880L, null);
            }
            throw th;
        }
    }

    @ey(method = -93852368085280329L)
    private int cb() {
        try {
            if (!j6) {
                return 2;
            }
            iy.gn(-492163189615336480L, this);
            return 2;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -492163189615336480L, this);
            }
            throw th;
        }
    }

    @ey(method = 3880087572353968000L)
    private boolean dx() {
        try {
            if (j6) {
                iy.gn(-28727118747835827L, this);
            }
            int iJ8 = 0;
            for (String str : JavaProjectSupport.dx(ServiceContainer.getProjectService().getCurrentAppHome())) {
                iJ8 += FileSystem.J8(str, cb(), ".c", ".cc", ".cpp");
                if (iJ8 >= cb()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -28727118747835827L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 7140241249174868499L)
    public boolean FH(String str) {
        try {
            if (!j6) {
                return false;
            }
            iy.tp(1794096205292162736L, this, str);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1794096205292162736L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 241510005867452775L)
    public boolean Hw() {
        try {
            if (j6) {
                iy.gn(8783972447976012000L, this);
            }
            if (m.Mr()) {
                return false;
            }
            ServiceContainer.getDownloadService().ca(ServiceContainer.gn(), "This project contains native code. ");
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 8783972447976012000L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 138662828461126035L)
    public void J0(String str) {
        try {
            if (j6) {
                iy.tp(11204000198173440L, this, str);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 11204000198173440L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 4235906181402993935L)
    public boolean J8() {
        try {
            if (!j6) {
                return false;
            }
            iy.gn(7646254993136324928L, this);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 7646254993136324928L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -618512677565168792L)
    public void Mr() {
        try {
            if (j6) {
                iy.gn(-269662912350143253L, this);
            }
            ServiceContainer.getLicenseService().cn(ServiceContainer.getMainActivity(), u.shop_feature_premium_projects, "large_project");
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -269662912350143253L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -1593926088793409409L)
    public void P8(String str, String str2) {
        try {
            if (j6) {
                iy.EQ(-1118244502794442816L, this, str, str2);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -1118244502794442816L, this, str, str2);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -4410813540341851335L)
    public void SI(String str, ValueRunnable<String> valueRunnable) {
        try {
            if (j6) {
                iy.EQ(-584480400821525376L, this, str, valueRunnable);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -584480400821525376L, this, str, valueRunnable);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 368032665214295485L)
    public void U2(String str, Map<String, List<String>> map, List<String> list) {
        try {
            if (j6) {
                iy.we(5914387114922526480L, this, str, map, list);
            }
            map.put(str, new ArrayList());
            list.add(str);
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, 5914387114922526480L, this, str, map, list);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 3051948042942957315L)
    public TemplateService.TemplateGroup[] VH() {
        try {
            if (j6) {
                iy.gn(-3630117687617614752L, this);
            }
            return new TemplateService.TemplateGroup[]{new TemplateService.TemplateGroup("Console Application", new TemplateService.Template(this, 3, "C/C++ Application", "C/C++", "MyNativeExecutable", false, false, "com.aide.ui", "JAVA", "course_cpp", ServiceContainer.ca() || ServiceContainer.P8.equals("com.aide.ui")), 2131165304, "CppHelloWorld.zip", new String[]{"hello.cpp"}, null)};
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -3630117687617614752L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 2020526814052333856L)
    public List<c.C0094c> XL() {
        try {
            if (!j6) {
                return null;
            }
            iy.gn(-1439948699406534765L, this);
            return null;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1439948699406534765L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -1172409367699154640L)
    public boolean Zo(String str) {
        try {
            if (!j6) {
                return false;
            }
            iy.tp(-788599921612402095L, this, str);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -788599921612402095L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 1908793633141206459L)
    public boolean a8(String str) {
        try {
            if (!j6) {
                return false;
            }
            iy.tp(-2377458499891207800L, this, str);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -2377458499891207800L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 2802067800361555515L)
    public boolean aM(String str) {
        try {
            if (j6) {
                iy.tp(2488396121679808600L, this, str);
            }
            Iterator<String> it = ServiceContainer.getProjectService().getLibraryMapping().keySet().iterator();
            while (it.hasNext()) {
                if (FileSystem.nw(it.next(), str)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 2488396121679808600L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 7199274722451806260L)
    public void buildProject(boolean z) {
        try {
            if (j6) {
                iy.Ws(-4215498558038961115L, this, z);
            }
            BuildServiceCollect.nativeProjectBuildService.XL(z);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -4215498558038961115L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 52709014090420404L)
    public void cn(List<String> list, boolean z) {
        try {
            if (j6) {
                iy.EQ(3345306342708981167L, this, list, new Boolean(z));
            }
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 3345306342708981167L, this, list, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 592992493704457380L)
    public void ei(String str) {
        try {
            if (j6) {
                iy.tp(2345178910769054005L, this, str);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 2345178910769054005L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 19654696590292179L)
    public boolean gW() {
        try {
            if (!j6) {
                return false;
            }
            iy.gn(85911347214662760L, this);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 85911347214662760L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 3188680937123040336L)
    public int getOpenProjectNameStringId(String str) {
        try {
            if (!j6) {
                return u.command_files_open_nativeexecutable_project;
            }
            iy.tp(2809582387346548813L, this, str);
            return u.command_files_open_nativeexecutable_project;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 2809582387346548813L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 2262522662235636255L)
    public List<String> getProductFlavors(String str) {
        try {
            if (!j6) {
                return null;
            }
            iy.tp(-270057147029181928L, this, str);
            return null;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -270057147029181928L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -1495710410626662888L)
    public String getProjectAttributeHtmlString() {
        try {
            if (j6) {
                iy.gn(-1159359065214056037L, this);
            }
            return "<b>Native Executable Project Home:</b><br/><br/>" + ServiceContainer.getProjectService().getCurrentAppHome();
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1159359065214056037L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -596853116976374880L)
    public void gn() {
        try {
            if (j6) {
                iy.gn(-258483428200115559L, this);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -258483428200115559L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -759566242138213888L)
    public boolean isPremium() {
        try {
            if (j6) {
                iy.gn(-359862739354345915L, this);
            }
            if (ServiceContainer.ca() || ServiceContainer.getLicenseService().Ws()) {
                return false;
            }
            if (c0.J8(ServiceContainer.getMainActivity(), "AllowSavingOneNativeExecutableFileInNonPremium")) {
                return dx();
            }
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -359862739354345915L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -8139130895120024800L)
    public boolean isSupport(String str) {
        try {
            if (j6) {
                iy.tp(-513880152476765737L, this, str);
            }
            return FileSystem.ef("^\\s*include\\s*\\$\\(\\s*BUILD_EXECUTABLE\\s*\\)\\s*$", str + "/jni/Android.mk");
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -513880152476765737L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 843190468782048288L)
    public boolean j3(String str) {
        try {
            if (j6) {
                iy.tp(-5931199811375066999L, this, str);
            }
            if (!ServiceContainer.ca()) {
                if (!ServiceContainer.P8.equals("com.aide.ui")) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -5931199811375066999L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -619390713877474725L)
    public void j6() {
        try {
            if (j6) {
                iy.gn(3093677244802823680L, this);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3093677244802823680L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -2204486187347567699L)
    public boolean lg() {
        try {
            if (!j6) {
                return true;
            }
            iy.gn(6715885762988153856L, this);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 6715885762988153856L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -6956869965042487920L)
    public EngineSolution makeEngineSolution() {
        try {
            if (j6) {
                iy.gn(-5611236005204277493L, this);
            }
            return je.j6(ServiceContainer.getProjectService().getCurrentAppHome());
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -5611236005204277493L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 511034552476933719L)
    public void nw(String str) {
        try {
            if (j6) {
                iy.tp(511663723303981152L, this, str);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 511663723303981152L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -1273957699741553188L)
    public int rN(String str) {
        try {
            if (!j6) {
                return -1;
            }
            iy.tp(1610420835295623561L, this, str);
            return -1;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1610420835295623561L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -1984023308555777995L)
    public List<String> ro(String str) {
        try {
            if (j6) {
                iy.tp(3522007299789142680L, this, str);
            }
            return Collections.emptyList();
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 3522007299789142680L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -153940413970338952L)
    public String sh(String str) {
        try {
            if (!j6) {
                return null;
            }
            iy.tp(-4242730515234834077L, this, str);
            return null;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -4242730515234834077L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -1187723621411021808L)
    public String tp(String str) {
        try {
            if (j6) {
                iy.tp(766817256100886731L, this, str);
            }
            if (j3(str)) {
                return null;
            }
            return "com.aide.ui";
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 766817256100886731L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -2002918198381141248L)
    public boolean u7(String str) {
        try {
            if (!j6) {
                return false;
            }
            iy.tp(-2815878669515358685L, this, str);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -2815878669515358685L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 4399161107210254000L)
    public String v5(String str) {
        try {
            if (!j6) {
                return null;
            }
            iy.tp(-619889121937558509L, this, str);
            return null;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -619889121937558509L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -1886978958908312320L)
    public boolean vy(String str) {
        try {
            if (!j6) {
                return true;
            }
            iy.tp(135885587786540721L, this, str);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 135885587786540721L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 3377776311687809253L)
    public int we(String str) {
        try {
            if (!j6) {
                return -1;
            }
            iy.tp(-4123321486216604112L, this, str);
            return -1;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -4123321486216604112L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 20112267143660924L)
    public String yS() {
        try {
            if (!j6) {
                return null;
            }
            iy.gn(2100586030077318345L, this);
            return null;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2100586030077318345L, this);
            }
            throw th;
        }
    }
}
