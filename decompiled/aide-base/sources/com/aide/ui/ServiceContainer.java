package com.aide.ui;

import abcd.cy;
import abcd.df;
import abcd.dy;
import abcd.ey;
import abcd.ff;
import abcd.fy;
import abcd.gy;
import abcd.ifif;
import abcd.iy;
import abcd.l8;
import abcd.lf;
import abcd.mf;
import abcd.xe;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Process;
import com.aide.common.AppLog;
import com.aide.engine.service.Native;
import com.aide.ui.build.BuildService;
import com.aide.ui.build.android.SigningService;
import com.aide.ui.debugger.Debugger;
import com.aide.ui.project.AndroidProjectSupport;
import com.aide.ui.project.JavaProjectSupport;
import com.aide.ui.project.JavaScriptProjectSupport;
import com.aide.ui.project.NativeExecutableProjectSupport;
import com.aide.ui.project.PhonegapProjectSupport;
import com.aide.ui.project.WebsiteProjectSupport;
import com.aide.ui.scm.GitService;
import com.aide.ui.services.AssetInstallationService;
import com.aide.ui.services.DownloadService;
import com.aide.ui.services.DropboxService;
import com.aide.ui.services.EngineNotifyService;
import com.aide.ui.services.EngineService;
import com.aide.ui.services.ErrorService;
import com.aide.ui.services.FileBrowserService;
import com.aide.ui.services.KeyBindingService;
import com.aide.ui.services.LicenseService;
import com.aide.ui.services.LogcatService;
import com.aide.ui.services.MavenService;
import com.aide.ui.services.NavigateService;
import com.aide.ui.services.OpenFileService;
import com.aide.ui.services.ProjectService;
import com.aide.ui.services.ProjectSupport;
import com.aide.ui.services.RefactoringService;
import com.aide.ui.services.RunService;
import com.aide.ui.services.SearchService;
import com.aide.ui.services.TemplateService;
import com.aide.ui.services.UpdateNotifyService;
import com.aide.ui.util.FileSystem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@cy(clazz = -453326632858448869L, container = -453326632858448869L, user = true)
/* loaded from: classes.dex */
public class ServiceContainer {

    @dy(field = -3372820038090672000L)
    private static List<Activity> KD;

    @dy(field = 1943489842028215360L)
    public static String P8;

    @dy(field = 4380871484659839593L)
    private static MainActivity SI;

    @dy(field = 1726247625991768176L)
    public static ServiceContainer app;

    @dy(field = -3246854647699443385L)
    private static com.aide.ui.trainer.b cb;

    @dy(field = -774324316550208424L)
    private static Context cn;

    @dy(field = 5029090006422826955L)
    private static boolean dx;

    @gy
    private static /* synthetic */ boolean ef;

    @dy(field = 546635037138674385L)
    private static int ei;

    @dy(field = 52523127174806523L)
    private static Handler ro;

    @fy
    private static /* synthetic */ boolean sG;

    @dy(field = 4833801648473916751L)
    private static Boolean sh;

    @dy(field = -3961808056938946632L)
    private ErrorService DW;

    @dy(field = 4473137951673736360L)
    private SearchService EQ;

    @dy(field = 4780624205219701188L)
    private OpenFileService FH;

    @dy(field = -3111461917917269712L)
    private BuildService Hw;

    @dy(field = -863259961640495489L)
    private KeyBindingService J0;

    @dy(field = -1546433806842545671L)
    private TemplateService J8;

    @dy(field = 1755736819454103911L)
    private LicenseService Mr;

    @dy(field = -3556939785766639160L)
    private GitService QX;

    @dy(field = -693478460253776560L)
    private RunService U2;

    @dy(field = 888610374515373909L)
    private EngineNotifyService VH;

    @dy(field = 678148341651375084L)
    private LogcatService Ws;

    @dy(field = 180904373924144160L)
    private DropboxService XL;

    @dy(field = 364859008330436448L)
    private df Zo;

    @dy(field = 2572624151859227584L)
    private xe a8;

    @dy(field = 1828500298035517684L)
    private SigningService aM;

    @dy(field = 3634773568361273925L)
    private mf er;

    @dy(field = -3113428113398710640L)
    private ifif gW;

    @dy(field = 990678690996903664L)
    private UpdateNotifyService gn;

    @dy(field = -1686967830176055168L)
    private DownloadService j3;

    @dy(field = -2166119677103766860L)
    private EngineService j6;

    @dy(field = 2926501199647604943L)
    private ff lg;

    @dy(field = -2787337810789487176L)
    private MavenService mavenService;

    @dy(field = 911104247984520184L)
    private lf rN;

    @dy(field = 6432244696015584000L)
    private FileBrowserService tp;

    @dy(field = 3542409874839245904L)
    private NavigateService u7;

    @dy(field = 276301549381744563L)
    private ProjectService v5;

    @dy(field = -1593745591986962235L)
    private l8 vy;

    @dy(field = 3060685182108482096L)
    private RefactoringService we;

    @dy(field = 330794045825567436L)
    private AssetInstallationService yS;

    @cy(clazz = 457042280351436384L, container = -453326632858448869L, user = true)
    static class a implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        @dy(field = -286788452827745715L)
        final /* synthetic */ Runnable WB;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 69541232546111008L)
        a(Runnable runnable) {
            this.WB = runnable;
        }

        @Override // java.lang.Runnable
        @ey(method = 745571020612975260L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(-6989045231720881980L, this);
                }
                if (ServiceContainer.vJ()) {
                    return;
                }
                try {
                    this.WB.run();
                } catch (Throwable th) {
                    AppLog.v5(th);
                }
            } catch (Throwable th2) {
                if (jw) {
                    iy.aM(th2, -6989045231720881980L, this);
                }
                throw th2;
            }
        }
    }

    @cy(clazz = 457071312915294115L, container = -453326632858448869L, user = true)
    static class b implements Runnable {

        @fy
        private static /* synthetic */ boolean fY;

        @gy
        private static /* synthetic */ boolean qp;

        @dy(field = 1881056066372401960L)
        final /* synthetic */ Runnable WB;

        @dy(field = -3383057178722038124L)
        final /* synthetic */ Runnable jw;

        @dy(field = 2563235271061252352L)
        final /* synthetic */ ProgressDialog mb;

        @cy(clazz = 58481658203938788L, container = -453326632858448869L, user = true)
        class a implements Runnable {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(a.class);
            }

            @ey(method = 7790865441580416L)
            a() {
            }

            @Override // java.lang.Runnable
            @ey(method = -108329289364888992L)
            public void run() {
                try {
                    if (mb) {
                        iy.gn(-114968441803585188L, this);
                    }
                    b.this.mb.dismiss();
                    if (b.this.jw != null) {
                        b.this.jw.run();
                    }
                } catch (Throwable th) {
                    if (jw) {
                        iy.aM(th, -114968441803585188L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(b.class);
        }

        @ey(method = -1683923208859475793L)
        b(Runnable runnable, ProgressDialog progressDialog, Runnable runnable2) {
            this.WB = runnable;
            this.mb = progressDialog;
            this.jw = runnable2;
        }

        @Override // java.lang.Runnable
        @ey(method = -502197465834385985L)
        public void run() {
            try {
                if (fY) {
                    iy.gn(-116600052537112547L, this);
                }
                try {
                    this.WB.run();
                } finally {
                    ServiceContainer.aj(new a());
                }
            } catch (Throwable th) {
                if (qp) {
                    iy.aM(th, -116600052537112547L, this);
                }
                throw th;
            }
        }
    }

    static {
        try {
            iy.Zo(ServiceContainer.class);
            if (sG) {
                iy.gn(-2315924876083668213L, null);
            }
            P8 = "";
            ei = -1;
            KD = new ArrayList();
            dx = Native.j6.isX86();
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, -2315924876083668213L, null);
            }
            throw th;
        }
    }

    @ey(method = 1987530211760879400L)
    public ServiceContainer() {
        try {
            if (sG) {
                iy.gn(626560913388026540L, null);
            }
            this.j6 = new EngineService();
            this.DW = new ErrorService();
            this.FH = new OpenFileService();
            this.Hw = new BuildService();
            this.v5 = new ProjectService();
            this.Zo = new df();
            this.VH = new EngineNotifyService();
            this.gn = new UpdateNotifyService();
            this.u7 = new NavigateService();
            this.tp = new FileBrowserService();
            this.EQ = new SearchService();
            this.we = new RefactoringService();
            this.J0 = new KeyBindingService();
            this.J8 = new TemplateService();
            this.Ws = new LogcatService();
            this.QX = new GitService();
            this.XL = new DropboxService();
            this.aM = new SigningService();
            this.j3 = new DownloadService();
            this.Mr = new LicenseService();
            this.U2 = new RunService();
            new com.aide.ui.build.android.m();
            this.a8 = new xe();
            this.lg = new ff();
            this.rN = new lf();
            this.er = new mf();
            this.yS = new AssetInstallationService();
            this.gW = new ifif();
            this.mavenService = new MavenService();
            this.vy = new l8();
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, 626560913388026540L, null);
            }
            throw th;
        }
    }

    @ey(method = 620782775947358528L)
    public static l8 DW() {
        try {
            if (sG) {
                iy.gn(-416206381357580881L, null);
            }
            return getApp().vy;
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, -416206381357580881L, null);
            }
            throw th;
        }
    }

    @ey(method = 229070935371745863L)
    public static DropboxService EQ() {
        try {
            if (sG) {
                iy.gn(-6500745203631962624L, null);
            }
            return getApp().XL;
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, -6500745203631962624L, null);
            }
            throw th;
        }
    }

    @ey(method = 1561515847841799283L)
    public static List<String> Hw() {
        try {
            if (sG) {
                iy.gn(2413925646437445048L, null);
            }
            if (!ca() && !P8.endsWith("com.aide.phonegap") && !P8.equals("com.aide.web")) {
                return Arrays.asList("Java", "Java Binary", "XML", "C++", "AIDL");
            }
            return Arrays.asList("Java", "Java Binary", "XML", "HTML", "Css", "JavaScript", "DTD", "C++", "AIDL");
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, 2413925646437445048L, null);
            }
            throw th;
        }
    }

    @ey(method = 4237303630263512620L)
    public static boolean I() {
        try {
            if (sG) {
                iy.gn(3465960056127210453L, null);
            }
            if (!isTrainerMode()) {
                if (!getContext().getSharedPreferences("TrainerMode", 0).getBoolean("ModeDecided", false)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, 3465960056127210453L, null);
            }
            throw th;
        }
    }

    @ey(method = 2318610892494488375L)
    public static ErrorService J0() {
        try {
            if (sG) {
                iy.gn(-1130721285151808912L, null);
            }
            return getApp().DW;
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, -1130721285151808912L, null);
            }
            throw th;
        }
    }

    @ey(method = -5365406920501082403L)
    public static RunService J8() {
        try {
            if (sG) {
                iy.gn(-2590860810947031864L, null);
            }
            return getApp().U2;
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, -2590860810947031864L, null);
            }
            throw th;
        }
    }

    @ey(method = 1651714154042664000L)
    public static String KD(int i, Object... objArr) {
        try {
            if (sG) {
                iy.EQ(753168552585022063L, null, new Integer(i), objArr);
            }
            return getContext().getResources().getString(i, objArr);
        } catch (Throwable th) {
            if (ef) {
                iy.Mr(th, 753168552585022063L, null, new Integer(i), objArr);
            }
            throw th;
        }
    }

    @ey(method = 3015829463151834936L)
    public static KeyBindingService Mr() {
        try {
            if (sG) {
                iy.gn(-7944057087372164591L, null);
            }
            return getApp().J0;
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, -7944057087372164591L, null);
            }
            throw th;
        }
    }

    @ey(method = -2799109389727935900L)
    public static void OW() {
        try {
            if (sG) {
                iy.gn(-475895889843957311L, null);
            }
            if (app != null) {
                AppLog.VH("ServiceContainer.shutdown");
                app.j6.lp();
                app.j6.jJ();
                app.DW.ca();
                app.VH.gn();
                app.Ws.j3();
                app.XL.aj();
                app.Mr.sG();
                app.a8.sy();
                app.lg.Zo();
                app.rN.FH();
                SI = null;
                app = null;
            }
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, -475895889843957311L, null);
            }
            throw th;
        }
    }

    @ey(method = 4107156508893986747L)
    public static GitService QX() {
        try {
            if (sG) {
                iy.gn(-602818893547275724L, null);
            }
            return getApp().QX;
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, -602818893547275724L, null);
            }
            throw th;
        }
    }

    @ey(method = 183328137927527895L)
    public static void Qq(Activity activity) {
        try {
            if (sG) {
                iy.tp(-127760265373970292L, null, activity);
            }
            KD.remove(activity);
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, -127760265373970292L, null, activity);
            }
            throw th;
        }
    }

    @ey(method = -7859422163315831521L)
    public static SearchService SI() {
        try {
            if (sG) {
                iy.gn(3314176449649936L, null);
            }
            return getApp().EQ;
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, 3314176449649936L, null);
            }
            throw th;
        }
    }

    @ey(method = -7647490495806131219L)
    public static boolean Sf() {
        try {
            if (sG) {
                iy.gn(1903786483956113020L, null);
            }
            return dx;
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, 1903786483956113020L, null);
            }
            throw th;
        }
    }

    @ey(method = 1356672197713855688L)
    public static String U2() {
        try {
            if (sG) {
                iy.gn(2759875472171102493L, null);
            }
            return AppPreferences.SI();
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, 2759875472171102493L, null);
            }
            throw th;
        }
    }

    @ey(method = -1464158305221258449L)
    public static xe XL() {
        try {
            if (sG) {
                iy.gn(4079328564851474880L, null);
            }
            return getApp().a8;
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, 4079328564851474880L, null);
            }
            throw th;
        }
    }

    @ey(method = 3317860536151906507L)
    public static BuildService Zo() {
        try {
            if (sG) {
                iy.gn(-93415682068847980L, null);
            }
            return getApp().Hw;
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, -93415682068847980L, null);
            }
            throw th;
        }
    }

    @ey(method = 3561757011161136685L)
    public static boolean aj(Runnable runnable) {
        try {
            if (sG) {
                iy.tp(-1804669439375208L, null, runnable);
            }
            return ro.post(new a(runnable));
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, -1804669439375208L, null, runnable);
            }
            throw th;
        }
    }

    @ey(method = 3080861445309241347L)
    public static boolean ca() {
        try {
            if (!sG) {
                return false;
            }
            iy.gn(-4272219802202713212L, null);
            return false;
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, -4272219802202713212L, null);
            }
            throw th;
        }
    }

    @ey(method = -4258788987959943840L)
    public static void cb(MainActivity mainActivity, String str) {
        try {
            if (sG) {
                iy.EQ(-2100787290259855947L, null, mainActivity, str);
            }
            SI = mainActivity;
            ro = new Handler();
            dx(str);
            app.j6.bindCodeAnalysisEngineService();
        } catch (Throwable th) {
            if (ef) {
                iy.Mr(th, -2100787290259855947L, null, mainActivity, str);
            }
            throw th;
        }
    }

    @ey(method = 6736953671686808276L)
    private static void dx(String str) {
        try {
            if (sG) {
                iy.tp(-6192302614264213447L, null, str);
            }
            if (app == null) {
                AppLog.VH("ServiceContainer.init");
                ServiceContainer serviceContainer = new ServiceContainer();
                app = serviceContainer;
                serviceContainer.Zo.DW();
                app.Hw.gn();
                app.QX.ef();
                app.FH.we();
                app.yS.we();
                app.v5.openProject(str);
                app.VH.v5();
                app.gn.DW();
                app.J0.FH();
                app.XL.nw();
                app.Mr.EQ();
                app.Ws.we();
                app.a8.SI();
                app.lg.Hw();
                app.rN.j6();
                app.er.sG();
                app.vy.FH();
            }
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, -6192302614264213447L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -1679206957604874947L)
    public static boolean ef() {
        try {
            if (!sG) {
                return false;
            }
            iy.gn(1221950805285923292L, null);
            return false;
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, 1221950805285923292L, null);
            }
            throw th;
        }
    }

    @ey(method = 7681789519713066165L)
    public static RefactoringService ei() {
        try {
            if (sG) {
                iy.gn(-3197286284191978440L, null);
            }
            return getApp().we;
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, -3197286284191978440L, null);
            }
            throw th;
        }
    }

    @ey(method = 1551867088502871456L)
    public static boolean g3() {
        try {
            if (sG) {
                iy.gn(527108484000778335L, null);
            }
            return P8.startsWith("com.aide.trainer.");
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, 527108484000778335L, null);
            }
            throw th;
        }
    }

    @ey(method = 276592734163980340L)
    public static ff gW() {
        try {
            if (sG) {
                iy.gn(318882820578744609L, null);
            }
            return getApp().lg;
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, 318882820578744609L, null);
            }
            throw th;
        }
    }

    @ey(method = -1219797565072874847L)
    private static ServiceContainer getApp() {
        try {
            if (sG) {
                iy.gn(1127396213033918180L, null);
            }
            return app;
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, 1127396213033918180L, null);
            }
            throw th;
        }
    }

    @ey(method = 1897893808646372369L)
    public static AssetInstallationService getAssetInstallationService() {
        try {
            if (sG) {
                iy.gn(-1821207048939484920L, null);
            }
            return getApp().yS;
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, -1821207048939484920L, null);
            }
            throw th;
        }
    }

    @ey(method = 3259502485400586405L)
    public static Context getContext() {
        try {
            if (sG) {
                iy.gn(-1343747151785727220L, null);
            }
            return cn;
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, -1343747151785727220L, null);
            }
            throw th;
        }
    }

    @ey(method = -2054106565790248111L)
    public static Debugger getDebugger() {
        try {
            if (sG) {
                iy.gn(-723827381187413616L, null);
            }
            return Debugger.XL(getContext());
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, -723827381187413616L, null);
            }
            throw th;
        }
    }

    @ey(method = -1731203843060338545L)
    public static DownloadService getDownloadService() {
        try {
            if (sG) {
                iy.gn(585321485423347768L, null);
            }
            return getApp().j3;
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, 585321485423347768L, null);
            }
            throw th;
        }
    }

    @ey(method = 937746672058762760L)
    public static EngineService getEngineService() {
        try {
            if (sG) {
                iy.gn(-2563337398425759655L, null);
            }
            return getApp().j6;
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, -2563337398425759655L, null);
            }
            throw th;
        }
    }

    @ey(method = -4659579446960930679L)
    public static FileBrowserService getFileBrowserService() {
        try {
            if (sG) {
                iy.gn(922070888558598240L, null);
            }
            return getApp().tp;
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, 922070888558598240L, null);
            }
            throw th;
        }
    }

    @ey(method = 2144647320709709200L)
    public static LicenseService getLicenseService() {
        try {
            if (sG) {
                iy.gn(-4514109733175595167L, null);
            }
            return getApp().Mr;
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, -4514109733175595167L, null);
            }
            throw th;
        }
    }

    @ey(method = 1243431803818917440L)
    public static MainActivity getMainActivity() {
        try {
            if (sG) {
                iy.gn(-2193640854643281189L, null);
            }
            return SI;
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, -2193640854643281189L, null);
            }
            throw th;
        }
    }

    @ey(method = -3061239597051347835L)
    public static MavenService getMavenService() {
        try {
            if (sG) {
                iy.gn(-767863658106919360L, null);
            }
            return getApp().mavenService;
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, -767863658106919360L, null);
            }
            throw th;
        }
    }

    @ey(method = 4308458004013939611L)
    public static NavigateService getNavigateService() {
        try {
            if (sG) {
                iy.gn(-2380404413299700320L, null);
            }
            return getApp().u7;
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, -2380404413299700320L, null);
            }
            throw th;
        }
    }

    @ey(method = 6563442486435528375L)
    public static OpenFileService getOpenFileService() {
        try {
            if (sG) {
                iy.gn(-4884903268724567016L, null);
            }
            return getApp().FH;
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, -4884903268724567016L, null);
            }
            throw th;
        }
    }

    @ey(method = 344961868856155200L)
    public static ProjectService getProjectService() {
        try {
            if (sG) {
                iy.gn(-6381730441481991523L, null);
            }
            return getApp().v5;
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, -6381730441481991523L, null);
            }
            throw th;
        }
    }

    @ey(method = 1123642311518714288L)
    public static ProjectSupport[] getProjectSupports() {
        try {
            if (sG) {
                iy.gn(1779320412327852261L, null);
            }
            return new ProjectSupport[]{new AndroidProjectSupport(), new WebsiteProjectSupport(), new PhonegapProjectSupport(), new JavaProjectSupport(), new NativeExecutableProjectSupport(), new JavaScriptProjectSupport()};
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, 1779320412327852261L, null);
            }
            throw th;
        }
    }

    @ey(method = -327472544106711720L)
    public static TemplateService getTemplateService() {
        try {
            if (sG) {
                iy.gn(-166450260779499753L, null);
            }
            return getApp().J8;
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, -166450260779499753L, null);
            }
            throw th;
        }
    }

    @ey(method = -1511847996383266243L)
    public static UpdateNotifyService getUpdateNotifyService() {
        try {
            if (sG) {
                iy.gn(-810523373871546336L, null);
            }
            return getApp().gn;
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, -810523373871546336L, null);
            }
            throw th;
        }
    }

    @ey(method = 197472882309299620L)
    public static Activity gn() {
        try {
            if (sG) {
                iy.gn(2549114201340094185L, null);
            }
            return KD.isEmpty() ? SI : KD.get(KD.size() - 1);
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, 2549114201340094185L, null);
            }
            throw th;
        }
    }

    @ey(method = 2125413564570062544L)
    public static boolean isTrainerMode() {
        try {
            if (sG) {
                iy.gn(-2643963061515142961L, null);
            }
            if (g3()) {
                return true;
            }
            if (sh == null) {
                sh = Boolean.valueOf(getContext().getSharedPreferences("TrainerMode", 0).getBoolean("Mode", false));
            }
            return sh.booleanValue();
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, -2643963061515142961L, null);
            }
            throw th;
        }
    }

    @ey(method = 2516751104862951999L)
    public static SigningService j3() {
        try {
            if (sG) {
                iy.gn(4899785342411984832L, null);
            }
            return getApp().aM;
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, 4899785342411984832L, null);
            }
            throw th;
        }
    }

    @ey(method = 2077120652429912400L)
    public static void j6(boolean z) {
        try {
            if (sG) {
                iy.Ws(-3834141684584191589L, null, z);
            }
            SharedPreferences.Editor editorEdit = getContext().getSharedPreferences("TrainerMode", 0).edit();
            editorEdit.putBoolean("Mode", z);
            editorEdit.putBoolean("ModeDecided", true);
            editorEdit.commit();
            sh = Boolean.valueOf(z);
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, -3834141684584191589L, null, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -4201547508486594565L)
    public static LogcatService lg() {
        try {
            if (sG) {
                iy.gn(3797040186092069592L, null);
            }
            return getApp().Ws;
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, 3797040186092069592L, null);
            }
            throw th;
        }
    }

    @ey(method = 119471794295205773L)
    public static void lp(String str) {
        try {
            if (sG) {
                iy.tp(2369099715202311996L, null, str);
            }
            if (str.endsWith(".exp")) {
                str = str.substring(0, str.length() - 4);
            }
            P8 = str;
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, 2369099715202311996L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 6170655787920597168L)
    public static com.aide.ui.trainer.b nw() {
        try {
            if (sG) {
                iy.gn(-5701199427395444123L, null);
            }
            if (cb == null) {
                cb = new com.aide.ui.trainer.b();
            }
            return cb;
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, -5701199427395444123L, null);
            }
            throw th;
        }
    }

    @ey(method = 4425320769296646000L)
    public static mf ro() {
        try {
            if (sG) {
                iy.gn(-2227394844548724921L, null);
            }
            return getApp().er;
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, -2227394844548724921L, null);
            }
            throw th;
        }
    }

    @ey(method = 3015998517937112307L)
    public static void sh(Context context) {
        try {
            if (sG) {
                iy.tp(-5567711709200636604L, null, context);
            }
            int iMyPid = Process.myPid();
            if (ei != iMyPid) {
                ei = iMyPid;
            }
            cn = context;
            FileSystem.P8(context);
            if (dx) {
                AppLog.DW("Using x86 binaries");
            }
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, -5567711709200636604L, null, context);
            }
            throw th;
        }
    }

    @ey(method = 2908523179556280683L)
    public static void sy(Activity activity, String str, Runnable runnable, Runnable runnable2) {
        try {
            if (sG) {
                iy.J0(4090945008118880416L, null, activity, str, runnable, runnable2);
            }
            ProgressDialog progressDialogShow = ProgressDialog.show(activity, null, str, true, false);
            progressDialogShow.getWindow().addFlags(128);
            progressDialogShow.getWindow().clearFlags(2);
            new Thread(new b(runnable, progressDialogShow, runnable2)).start();
        } catch (Throwable th) {
            if (ef) {
                iy.a8(th, 4090945008118880416L, null, activity, str, runnable, runnable2);
            }
            throw th;
        }
    }

    @ey(method = 882760432196582240L)
    public static boolean vJ() {
        try {
            if (sG) {
                iy.gn(-3797399364218239389L, null);
            }
            return app == null;
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, -3797399364218239389L, null);
            }
            throw th;
        }
    }

    @ey(method = -426667962709520805L)
    public static ifif vy() {
        try {
            if (sG) {
                iy.gn(-285295197451833000L, null);
            }
            return getApp().gW;
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, -285295197451833000L, null);
            }
            throw th;
        }
    }

    @ey(method = 3181965813230644047L)
    public static void x9(Activity activity) {
        try {
            if (sG) {
                iy.tp(5637331137191176192L, null, activity);
            }
            int iIndexOf = KD.indexOf(activity);
            if (iIndexOf != -1) {
                KD.remove(iIndexOf);
            }
            KD.add(activity);
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, 5637331137191176192L, null, activity);
            }
            throw th;
        }
    }
}
