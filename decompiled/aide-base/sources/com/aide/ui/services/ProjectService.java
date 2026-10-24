package com.aide.ui.services;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import abcd.xd;
import android.content.SharedPreferences;
import android.widget.Toast;
import com.aide.common.MessageBox;
import com.aide.common.ValueRunnable;
import com.aide.engine.EngineSolution;
import com.aide.engine.service.CodeModelFactory;
import com.aide.ui.AppPreferences;
import com.aide.ui.ServiceContainer;
import com.aide.ui.firebase.FireBaseLogEvent;
import com.aide.ui.project.AndroidProjectSupport;
import com.aide.ui.u;
import com.aide.ui.util.FileSystem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

@cy(clazz = -8061245974084835088L, container = -8061245974084835088L, user = true)
/* loaded from: classes.dex */
public class ProjectService {

    @gy
    private static /* synthetic */ boolean VH;

    @fy
    private static /* synthetic */ boolean Zo;

    @dy(field = -1577160821126137227L)
    private List<String> Hw;

    @dy(field = 5559310445213730275L)
    private String currentAppHome;

    @dy(field = 4037317727639421675L)
    private Map<String, List<String>> libraryMapping;

    @dy(field = -2807433242458730292L)
    private ProjectSupport pojectSupport;

    @dy(field = 2732902873124185344L)
    private boolean v5;

    @cy(clazz = 759705135868991625L, container = -8061245974084835088L, user = true)
    class a implements ValueRunnable<String> {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -2014166539538173944L)
        public a() {
        }

        @Override // com.aide.common.ValueRunnable
        @ey(method = -577181437980655697L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public void j6(String str) {
            try {
                if (DW) {
                    iy.tp(-714668744083132197L, this, str);
                }
                if (!"debug-aide".equals(ProjectService.j3(str)) || ServiceContainer.getLicenseService().v5(ServiceContainer.getMainActivity())) {
                    ProjectService.this.switchBuildVariant(str);
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, -714668744083132197L, this, str);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 759833672598526312L, container = -8061245974084835088L, user = true)
    class b implements Runnable {

        @fy
        private static /* synthetic */ boolean fY;

        @gy
        private static /* synthetic */ boolean qp;

        @dy(field = -123681434945049344L)
        final /* synthetic */ String WB;

        @dy(field = -300812212706098539L)
        final /* synthetic */ String mb;

        static {
            iy.Zo(b.class);
        }

        @ey(method = 554797477166224820L)
        public b(String str, String str2) {
            this.WB = str;
            this.mb = str2;
        }

        @Override // java.lang.Runnable
        @ey(method = 329806216574510199L)
        public void run() {
            try {
                if (fY) {
                    iy.gn(1043940177324664215L, this);
                }
                ProjectService.this.yO(this.WB);
                try {
                    ServiceContainer.getOpenFileService().lg(this.mb, true);
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                if (qp) {
                    iy.aM(th, 1043940177324664215L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 759962209332124293L, container = -8061245974084835088L, user = true)
    class c implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(c.class);
        }

        @ey(method = -3001566141588781047L)
        public c() {
        }

        @Override // java.lang.Runnable
        @ey(method = -1636157618600901864L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(-1971442315100342656L, this);
                }
                ProjectService.this.init();
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, -1971442315100342656L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 760090746069785568L, container = -8061245974084835088L, user = true)
    class d implements Runnable {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = 280722793413094755L)
        final /* synthetic */ boolean WB;

        static {
            iy.Zo(d.class);
        }

        @ey(method = -6263537650430595240L)
        public d(boolean z) {
            this.WB = z;
        }

        @Override // java.lang.Runnable
        @ey(method = 1327531638297752384L)
        public void run() {
            try {
                if (jw) {
                    iy.gn(-1968069596456577159L, this);
                }
                ProjectService.this.jJ();
                ServiceContainer.getDebugger().P8(ProjectService.this.pojectSupport.yS(), false);
                if (this.WB) {
                    ProjectService.this.et(null, false);
                }
                ServiceContainer.EQ().ca(ProjectService.this.P8());
                ServiceContainer.getMainActivity().q7();
                ServiceContainer.getFileBrowserService().v5();
                ProjectService.this.sG();
            } catch (Throwable th) {
                if (fY) {
                    iy.aM(th, -1968069596456577159L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 760219282811510137L, container = -8061245974084835088L, user = true)
    class e implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(e.class);
        }

        @ey(method = 3370817073230267445L)
        public e() {
        }

        @Override // java.lang.Runnable
        @ey(method = -1910749845844493424L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(25172049163842875L, this);
                }
                ProjectService.this.init();
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 25172049163842875L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 760347819557298000L, container = -8061245974084835088L, user = true)
    class f implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(f.class);
        }

        @ey(method = -4980181340107502217L)
        public f() {
        }

        @Override // java.lang.Runnable
        @ey(method = 1100316530481840640L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(25668660232874720L, this);
                }
                ProjectService.this.jJ();
                ServiceContainer.getFileBrowserService().v5();
                ProjectService.this.et(null, false);
                ServiceContainer.getMainActivity().kf();
                ProjectService.this.sG();
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 25668660232874720L, this);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(ProjectService.class);
    }

    @ey(method = 565560558177653241L)
    public ProjectService() {
        try {
            if (Zo) {
                iy.gn(-2382173340504915675L, null);
            }
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -2382173340504915675L, null);
            }
            throw th;
        }
    }

    @ey(method = -1273168545277243923L)
    private void FN(String str) {
        try {
            if (Zo) {
                iy.tp(887456182767660957L, this, str);
            }
            if (this.currentAppHome != null) {
                ServiceContainer.getContext().getSharedPreferences("ProjectService", 0).edit().putString("BuildVariant_" + this.currentAppHome, str).commit();
            }
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 887456182767660957L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -8161572944899534248L)
    public static String KD(String str) {
        try {
            if (Zo) {
                iy.tp(5899873950325593160L, null, str);
            }
            if (str == null) {
                return null;
            }
            char c2 = 65535;
            int iHashCode = str.hashCode();
            if (iHashCode != -1886964253) {
                if (iHashCode != 95458899) {
                    if (iHashCode == 1090594823 && str.equals("release")) {
                        c2 = 0;
                    }
                } else if (str.equals("debug")) {
                    c2 = 1;
                }
            } else if (str.equals("debug-aide")) {
                c2 = 2;
            }
            return c2 != 0 ? "debug" : "release";
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 5899873950325593160L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 6026010427097000787L)
    private ProjectSupport getProjectSupport(String str) {
        try {
            if (Zo) {
                iy.tp(1518958727664245875L, this, str);
            }
            if (str == null) {
                return null;
            }
            for (ProjectSupport projectSupport : ServiceContainer.getProjectSupports()) {
                if (projectSupport.isSupport(str)) {
                    return projectSupport;
                }
            }
            return null;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 1518958727664245875L, this, str);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 2666878262908131121L)
    public void init() {
        try {
            if (Zo) {
                iy.gn(-4059245137445733503L, this);
            }
            this.Hw = new ArrayList();
            HashMap map = new HashMap();
            this.libraryMapping = map;
            if (this.currentAppHome != null) {
                this.pojectSupport.U2(this.currentAppHome, map, this.Hw);
            }
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -4059245137445733503L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 19972929142758720L)
    public static String j3(String str) {
        try {
            if (Zo) {
                iy.tp(3863473146047596000L, null, str);
            }
            String[] strArrSplit = str.split(" ");
            if (strArrSplit.length >= 1) {
                return strArrSplit[strArrSplit.length - 1];
            }
            return null;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 3863473146047596000L, null, str);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 4108770960147403200L)
    public void jJ() {
        try {
            if (Zo) {
                iy.gn(-4824585592582923680L, this);
            }
            if (this.currentAppHome == null || this.pojectSupport == null) {
                ServiceContainer.getEngineService().er(new EngineSolution(new ArrayList(), null, CodeModelFactory.j6(ServiceContainer.Hw()), ServiceContainer.Hw()));
            } else {
                ServiceContainer.getEngineService().er(this.pojectSupport.makeEngineSolution());
            }
            ServiceContainer.getEngineService().ef();
            ServiceContainer.getEngineService().ei();
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -4824585592582923680L, this);
            }
            throw th;
        }
    }

    @ey(method = 6326551089815932960L)
    private void saveCurrentAppHome(String str) {
        try {
            if (Zo) {
                iy.tp(-3482704925138385472L, this, str);
            }
            this.currentAppHome = str;
            SharedPreferences.Editor editorEdit = ServiceContainer.getContext().getSharedPreferences("ProjectService", 0).edit();
            editorEdit.putString("CurrentAppHome", str);
            editorEdit.commit();
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -3482704925138385472L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -7638808182986252025L)
    private void ye() {
        try {
            if (Zo) {
                iy.gn(-2145916920446227977L, this);
            }
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -2145916920446227977L, this);
            }
            throw th;
        }
    }

    @ey(method = 183752147958074100L)
    public boolean EQ() {
        try {
            if (Zo) {
                iy.gn(271137455803007316L, this);
            }
            if (u7() && this.pojectSupport != null) {
                if (this.pojectSupport.gW()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 271137455803007316L, this);
            }
            throw th;
        }
    }

    @ey(method = -25568773785861285L)
    public boolean Ev() {
        String strSI;
        try {
            if (Zo) {
                iy.gn(869119721943040075L, this);
            }
            String strU7 = ServiceContainer.getOpenFileService().u7();
            if (strU7 == null || (strSI = SI(strU7)) == null) {
                return false;
            }
            ServiceContainer.getOpenFileService().KD(true, false);
            ServiceContainer.getMainActivity().sh().Eq();
            getProjectSupport(strSI).ei(strU7);
            return true;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 869119721943040075L, this);
            }
            throw th;
        }
    }

    @ey(method = -230927928920274052L)
    public boolean J0() {
        try {
            if (Zo) {
                iy.gn(-3819494747190928292L, this);
            }
            if (u7() && this.pojectSupport != null) {
                if (this.pojectSupport.lg()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -3819494747190928292L, this);
            }
            throw th;
        }
    }

    @ey(method = 790815948993524013L)
    public boolean J8() {
        String strSI;
        try {
            if (Zo) {
                iy.gn(3510671084018159325L, this);
            }
            String strU7 = ServiceContainer.getOpenFileService().u7();
            if (strU7 == null || (strSI = SI(strU7)) == null) {
                return false;
            }
            if (!ServiceContainer.isTrainerMode() || ServiceContainer.ro().CU(strU7)) {
                return getProjectSupport(strSI).u7(strU7);
            }
            return false;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 3510671084018159325L, this);
            }
            throw th;
        }
    }

    @ey(method = -3675698443277519197L)
    public List<String> Mr() {
        try {
            if (Zo) {
                iy.gn(-1199098342882209165L, this);
            }
            if (this.currentAppHome == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add("release");
            arrayList.add("debug");
            arrayList.add("debug-aide");
            List<String> productFlavors = this.pojectSupport.getProductFlavors(getCurrentAppHome());
            if (productFlavors != null) {
                for (String str : productFlavors) {
                    arrayList.add(str + " release");
                    arrayList.add(str + " debug");
                    arrayList.add(str + " debug-aide");
                }
            }
            return arrayList;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -1199098342882209165L, this);
            }
            throw th;
        }
    }

    @ey(method = -1152731873986198528L)
    public boolean Mz(String str) {
        try {
            if (Zo) {
                iy.tp(4782243159373282880L, this, str);
            }
            return getProjectSupport(str) != null;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 4782243159373282880L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -6053598158468104539L)
    public void OW() {
        try {
            if (Zo) {
                iy.gn(6983608691437058309L, this);
            }
            if (ServiceContainer.isTrainerMode()) {
                ServiceContainer.nw().J8();
            } else {
                if (this.pojectSupport == null || !this.v5) {
                    return;
                }
                this.v5 = false;
                this.pojectSupport.gn();
            }
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 6983608691437058309L, this);
            }
            throw th;
        }
    }

    @ey(method = -1585487252610508620L)
    public List<String> P8() {
        try {
            if (Zo) {
                iy.gn(-912561763897109036L, this);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(getCurrentAppHome());
            HashSet hashSet = new HashSet(this.libraryMapping.keySet());
            hashSet.remove(getCurrentAppHome());
            arrayList.addAll(hashSet);
            return arrayList;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -912561763897109036L, this);
            }
            throw th;
        }
    }

    @ey(method = 1202471386089822363L)
    public void QX(String str, ValueRunnable<String> valueRunnable) {
        try {
            if (Zo) {
                iy.EQ(-881301638471749509L, this, str, valueRunnable);
            }
            this.pojectSupport.SI(str, valueRunnable);
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, -881301638471749509L, this, str, valueRunnable);
            }
            throw th;
        }
    }

    @ey(method = 354637741010871192L)
    public String SI(String str) {
        try {
            if (Zo) {
                iy.tp(-906248565229061496L, this, str);
            }
            if (FileSystem.cb(str)) {
                return null;
            }
            while (!FileSystem.Sf(str)) {
                if (getProjectSupport(str) != null) {
                    return str;
                }
                str = FileSystem.getParent(str);
            }
            return null;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -906248565229061496L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 2744906758952564520L)
    public boolean Sf(String str) {
        try {
            if (Zo) {
                iy.tp(1131068104562442488L, this, str);
            }
            if (this.pojectSupport != null) {
                if (this.pojectSupport.aM(str)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 1131068104562442488L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 1400477098819089837L)
    public int U2(String str) {
        try {
            if (Zo) {
                iy.tp(-91030233404512675L, this, str);
            }
            return this.pojectSupport.we(str);
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -91030233404512675L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -1651891637878294496L)
    public void VH(String str) {
        String strSI;
        try {
            if (Zo) {
                iy.tp(483545176023419328L, this, str);
            }
            if (Sf(str) || (strSI = SI(str)) == null) {
                return;
            }
            MessageBox.rN(ServiceContainer.getMainActivity(), ServiceContainer.KD(u.dialog_open_project_title, new Object[0]), ServiceContainer.KD(u.dialog_open_project_message, strSI), new b(strSI, str), null);
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 483545176023419328L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -1952422391378705000L)
    public void Ws() {
        try {
            if (Zo) {
                iy.gn(-903356770592154456L, this);
            }
            if (this.currentAppHome != null) {
                saveCurrentAppHome(null);
                ye();
                ServiceContainer.J0().aM();
                ServiceContainer.getNavigateService().Hw();
                ServiceContainer.getOpenFileService().Zo();
                this.pojectSupport = null;
                this.libraryMapping = new HashMap();
                ServiceContainer.getDebugger().v5();
                ServiceContainer.getMainActivity().q7();
                jJ();
            }
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -903356770592154456L, this);
            }
            throw th;
        }
    }

    @ey(method = -38988286962902604L)
    public void XG() {
        try {
            if (Zo) {
                iy.gn(-3899046423914606316L, this);
            }
            this.pojectSupport.j6();
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -3899046423914606316L, this);
            }
            throw th;
        }
    }

    @ey(method = 3713059769788670064L)
    public void XX(String str) {
        try {
            if (Zo) {
                iy.tp(-3355195788006222432L, this, str);
            }
            kQ(str, true);
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -3355195788006222432L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 80441077773865728L)
    public void Xa(String str) {
        try {
            if (Zo) {
                iy.tp(-3083412232993272960L, this, str);
            }
            this.pojectSupport.J0(str);
            reloadingProject();
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -3083412232993272960L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 3223869246503121069L)
    public void Zo(String str, String str2) {
        try {
            if (Zo) {
                iy.EQ(3940653092578028557L, this, str, str2);
            }
            this.pojectSupport.P8(str, str2);
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, 3940653092578028557L, this, str, str2);
            }
            throw th;
        }
    }

    @ey(method = -1650763964301190128L)
    public int a8(String str) {
        try {
            if (Zo) {
                iy.tp(1241454175710987008L, this, str);
            }
            return this.pojectSupport.rN(str);
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 1241454175710987008L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 3973759517569730448L)
    public List<String> aM() {
        try {
            if (Zo) {
                iy.gn(-5547925765679293920L, this);
            }
            if (this.currentAppHome == null) {
                return null;
            }
            return this.pojectSupport.getProductFlavors(getCurrentAppHome());
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -5547925765679293920L, this);
            }
            throw th;
        }
    }

    @ey(method = 520210818286350027L)
    public String aj(String str) {
        try {
            if (Zo) {
                iy.tp(6759872802985947L, this, str);
            }
            if (this.pojectSupport == null) {
                return null;
            }
            return this.pojectSupport.sh(str);
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 6759872802985947L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -285976946548945821L)
    public void br() {
        try {
            if (Zo) {
                iy.gn(827393935361282867L, this);
            }
            this.pojectSupport.Mr();
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 827393935361282867L, this);
            }
            throw th;
        }
    }

    @ey(method = -4332140166207436671L)
    public void buildProject(boolean z) {
        try {
            if (Zo) {
                iy.Ws(2296922460084943041L, this, z);
            }
            if (z) {
                wc();
            }
            if (J0()) {
                this.v5 = true;
                this.pojectSupport.buildProject(z);
            } else if (z) {
                ServiceContainer.getEngineService().vy();
            }
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 2296922460084943041L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 4331737317653327552L)
    public String[] cn(String str) {
        try {
            if (Zo) {
                iy.tp(-3409552205770714608L, this, str);
            }
            List<String> list = this.libraryMapping.get(str);
            if (list == null) {
                return new String[0];
            }
            String[] strArr = new String[list.size()];
            list.toArray(strArr);
            return strArr;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -3409552205770714608L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -2499890776087534739L)
    public void dx() {
        try {
            if (Zo) {
                iy.gn(3124596026214908685L, this);
            }
            jJ();
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 3124596026214908685L, this);
            }
            throw th;
        }
    }

    @ey(method = -267042740652703379L)
    public boolean ef(String str) {
        try {
            if (Zo) {
                iy.tp(-2720295604977672883L, this, str);
            }
            ProjectSupport projectSupport = getProjectSupport(str);
            if (projectSupport != null) {
                return projectSupport.j3(str);
            }
            return false;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -2720295604977672883L, this, str);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    @ey(method = 1131999745104139163L)
    public String ei() {
        long projectAttributeHtmlString = 14875035873500811;
        try {
            if (Zo) {
                iy.gn(14875035873500811L, this);
            }
            if (this.pojectSupport == null) {
                return "";
            }
            projectAttributeHtmlString = this.pojectSupport.getProjectAttributeHtmlString();
            return projectAttributeHtmlString;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, projectAttributeHtmlString, this);
            }
            throw th;
        }
    }

    @ey(method = 2025241038735040479L)
    public String er() {
        try {
            if (Zo) {
                iy.gn(-1434222098368715217L, this);
            }
            return j3(lg());
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -1434222098368715217L, this);
            }
            throw th;
        }
    }

    @ey(method = 3703254837554466924L)
    public void et(List<String> list, boolean z) {
        try {
            if (Zo) {
                iy.EQ(-1064425621880724340L, this, list, new Boolean(z));
            }
            if (this.pojectSupport != null) {
                this.pojectSupport.cn(list, z);
            }
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, -1064425621880724340L, this, list, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 1356553061567162069L)
    public boolean g3(String str) {
        try {
            if (Zo) {
                iy.tp(1071910327664708661L, this, str);
            }
            if (this.pojectSupport != null) {
                if (this.pojectSupport.vy(str)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 1071910327664708661L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 1314833374287190800L)
    public String getAndroidJarPath() {
        try {
            if (Zo) {
                iy.gn(3704763573539393248L, this);
            }
            String userAndroidJar = AppPreferences.getUserAndroidJar();
            return FileSystem.exists(userAndroidJar) ? userAndroidJar : ServiceContainer.getAssetInstallationService().Hw();
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 3704763573539393248L, this);
            }
            throw th;
        }
    }

    @ey(method = 2385582686663500171L)
    public String getBuildVariant() {
        try {
            if (Zo) {
                iy.gn(507252140888673019L, this);
            }
            String[] strArrSplit = lg().split(" ");
            if (strArrSplit.length == 2) {
                return strArrSplit[0];
            }
            return null;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 507252140888673019L, this);
            }
            throw th;
        }
    }

    @ey(method = -522706533505062725L)
    public String getCurrentAppHome() {
        try {
            if (Zo) {
                iy.gn(751721934180813995L, this);
            }
            return this.currentAppHome;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 751721934180813995L, this);
            }
            throw th;
        }
    }

    @ey(method = -387995669271375312L)
    public Map<String, List<String>> getLibraryMapping() {
        try {
            if (Zo) {
                iy.gn(-462204135503730256L, this);
            }
            return this.libraryMapping;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -462204135503730256L, this);
            }
            throw th;
        }
    }

    @ey(method = 261764880599672177L)
    public boolean gn(String str) {
        try {
            if (Zo) {
                iy.tp(-2692660267116489407L, this, str);
            }
            if (this.pojectSupport != null) {
                if (this.pojectSupport.FH(str)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -2692660267116489407L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 1319673882519438960L)
    public void hz(String str) {
        try {
            if (Zo) {
                iy.tp(-2598799904126168400L, this, str);
            }
            if (FileSystem.exists(str)) {
                AppPreferences.saveUserAndroidJar(str);
                jJ();
            }
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -2598799904126168400L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -4597621842465354152L)
    public boolean isOpenProject() {
        try {
            if (Zo) {
                iy.gn(4094684098358750280L, this);
            }
            return this.currentAppHome != null;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 4094684098358750280L, this);
            }
            throw th;
        }
    }

    @ey(method = -5795381007623941760L)
    public boolean isPremium() {
        try {
            if (Zo) {
                iy.gn(-2962999036658341392L, this);
            }
            if (isOpenProject() && !ServiceContainer.isTrainerMode()) {
                if (this.pojectSupport.isPremium()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -2962999036658341392L, this);
            }
            throw th;
        }
    }

    @ey(method = 84794903361451872L)
    public void jO(String str) {
        String str2;
        try {
            if (Zo) {
                iy.tp(5365972511710753536L, this, str);
            }
            String buildVariant = getBuildVariant();
            if (buildVariant != null) {
                str2 = buildVariant + " " + str;
            } else {
                str2 = str;
            }
            switchBuildVariant(str2);
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 5365972511710753536L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 592884514458059697L)
    public void kQ(String str, boolean z) {
        try {
            if (Zo) {
                iy.EQ(1988636870405400561L, this, str, new Boolean(z));
            }
            if (!ef(str) || str == null || str.equals(getCurrentAppHome())) {
                return;
            }
            saveCurrentAppHome(str);
            ye();
            ServiceContainer.J0().aM();
            ServiceContainer.getNavigateService().Hw();
            ServiceContainer.getOpenFileService().Zo();
            ServiceContainer.Zo().QX();
            ServiceContainer.getMavenService().resetDepPathMap();
            this.pojectSupport = getProjectSupport(str);
            ServiceContainer.sy(ServiceContainer.getMainActivity(), "Opening project...", new c(), new d(z));
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, 1988636870405400561L, this, str, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -2413738735621112828L)
    public void ko() {
        try {
            if (Zo) {
                iy.gn(2777945406619223076L, this);
            }
            MessageBox.QX(ServiceContainer.getMainActivity(), ServiceContainer.KD(u.dialog_variants_title, new Object[0]), Mr(), lg(), new a());
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 2777945406619223076L, this);
            }
            throw th;
        }
    }

    @ey(method = 220178510625180335L)
    public String lg() {
        try {
            if (Zo) {
                iy.gn(-4791029522100934433L, this);
            }
            if (this.currentAppHome == null) {
                return "";
            }
            return ServiceContainer.getContext().getSharedPreferences("ProjectService", 0).getString("BuildVariant_" + this.currentAppHome, "debug");
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -4791029522100934433L, this);
            }
            throw th;
        }
    }

    @ey(method = -5502498640511870249L)
    public String lp(String str) {
        try {
            if (Zo) {
                iy.tp(-6224985091426817961L, this, str);
            }
            if (this.pojectSupport == null) {
                return null;
            }
            return this.pojectSupport.v5(str);
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -6224985091426817961L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 1857503842034080784L)
    public List<String> nw(String str) {
        try {
            if (Zo) {
                iy.tp(2793557493527432544L, this, str);
            }
            if (this.pojectSupport == null) {
                return null;
            }
            return this.pojectSupport.ro(str);
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 2793557493527432544L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -1518766839143705L)
    public void openProject(String str) {
        try {
            if (Zo) {
                iy.tp(-7689472675009447593L, this, str);
            }
            SharedPreferences sharedPreferences = ServiceContainer.getContext().getSharedPreferences("ProjectService", 0);
            if (!ServiceContainer.isTrainerMode() && ServiceContainer.getMainActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE")) {
                if (str != null) {
                    FireBaseLogEvent.tp("App init: From intent");
                    saveCurrentAppHome(SI(str));
                } else {
                    String string = sharedPreferences.getString("CurrentAppHome", null);
                    this.currentAppHome = string;
                    if (string != null && getProjectSupport(string) == null) {
                        this.currentAppHome = null;
                    }
                }
            }
            this.pojectSupport = getProjectSupport(this.currentAppHome);
            init();
            if (this.pojectSupport != null) {
                ServiceContainer.getDebugger().P8(this.pojectSupport.yS(), true);
            }
            if (this.currentAppHome != null) {
                FireBaseLogEvent.tp("App init: Opened existing project");
                ye();
                et(null, false);
                sy("init");
            }
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -7689472675009447593L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 922058924451576853L)
    public void reloadingProject() {
        try {
            if (Zo) {
                iy.gn(-3339093473334731723L, this);
            }
            if (this.currentAppHome != null && getProjectSupport(this.currentAppHome) == null) {
                Ws();
            }
            ServiceContainer.getDebugger().ef();
            if (this.currentAppHome != null) {
                ServiceContainer.sy(ServiceContainer.getMainActivity(), "Reloading project...", new e(), new f());
            } else {
                init();
                jJ();
            }
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -3339093473334731723L, this);
            }
            throw th;
        }
    }

    @ey(method = 3179815071060604617L)
    public int ro(String str) {
        try {
            if (Zo) {
                iy.tp(1522453859998231625L, this, str);
            }
            return getProjectSupport(str).getOpenProjectNameStringId(str);
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 1522453859998231625L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -591527843679192084L)
    public boolean sG() {
        try {
            if (Zo) {
                iy.gn(5675126715919091692L, this);
            }
            if (this.pojectSupport != null) {
                return this.pojectSupport.Hw();
            }
            return false;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 5675126715919091692L, this);
            }
            throw th;
        }
    }

    @ey(method = 1472894313438304020L)
    public void switchBuildVariant(String str) {
        try {
            if (Zo) {
                iy.tp(1869396883276581620L, this, str);
            }
            if (this.currentAppHome == null || str.equals(lg())) {
                return;
            }
            if (ServiceContainer.Zo().tp()) {
                Toast.makeText(ServiceContainer.getMainActivity(), ServiceContainer.KD(u.view_toast_cannot_switch_variant, new Object[0]), 0).show();
                return;
            }
            Toast.makeText(ServiceContainer.getMainActivity(), ServiceContainer.KD(u.view_toast_switched_variant, str), 0).show();
            FN(str);
            ServiceContainer.getDebugger().g3(this.pojectSupport.yS());
            ServiceContainer.Zo().XL();
            reloadingProject();
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 1869396883276581620L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 4997613319019062313L)
    public void sy(String str) {
        try {
            if (Zo) {
                iy.tp(-2909647131119937431L, this, str);
            }
            HashMap map = new HashMap();
            map.put("isPremium", Boolean.toString(isPremium()));
            map.put("libraryCount", Integer.toString(this.libraryMapping.size()));
            map.put("referrer", str);
            if (AndroidProjectSupport.iW(getCurrentAppHome())) {
                map.put("package", AndroidProjectSupport.getProjectPackageName(getCurrentAppHome(), null));
            }
            FireBaseLogEvent.EQ("Project opened", map);
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -2909647131119937431L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -767707587698712496L)
    public boolean tp(String str) {
        try {
            if (Zo) {
                iy.tp(270920001954221664L, this, str);
            }
            if (isOpenProject() && this.pojectSupport != null) {
                if (this.pojectSupport.Zo(str)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 270920001954221664L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 328221919845662791L)
    public boolean u7() {
        try {
            if (Zo) {
                iy.gn(-1437092493407831113L, this);
            }
            if (isOpenProject()) {
                if (!ServiceContainer.Zo().tp()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -1437092493407831113L, this);
            }
            throw th;
        }
    }

    @ey(method = 1997081804930258751L)
    public void v5(String str) {
        try {
            if (Zo) {
                iy.tp(-980468576272611825L, this, str);
            }
            this.pojectSupport.nw(str);
            reloadingProject();
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -980468576272611825L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 515424493019213776L)
    public boolean vJ(String str) {
        try {
            if (Zo) {
                iy.tp(1014183343352128464L, this, str);
            }
            return SI(str) != null;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 1014183343352128464L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 216706420587946744L)
    public Map<String, List<String>> vy(String str) {
        try {
            if (Zo) {
                iy.tp(-877705586190917880L, this, str);
            }
            return xd.j6(str, this.libraryMapping);
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -877705586190917880L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -3309374214588667656L)
    public void wc() {
        try {
            if (Zo) {
                iy.gn(-699920592258047832L, this);
            }
            if (this.currentAppHome != null && getProjectSupport(this.currentAppHome) == null) {
                Ws();
            }
            if (this.currentAppHome != null) {
                init();
            }
            jJ();
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -699920592258047832L, this);
            }
            throw th;
        }
    }

    @ey(method = -4231423066059802800L)
    public boolean we(String str) {
        try {
            if (Zo) {
                iy.tp(2050637378074025664L, this, str);
            }
            if (this.pojectSupport != null) {
                if (this.pojectSupport.a8(str)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 2050637378074025664L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -1732940211894398612L)
    public boolean x9() {
        try {
            if (Zo) {
                iy.gn(868075045964082540L, this);
            }
            if (this.pojectSupport == null) {
                return false;
            }
            return this.pojectSupport.J8();
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 868075045964082540L, this);
            }
            throw th;
        }
    }

    @ey(method = 1271396942529141465L)
    public void yO(String str) {
        try {
            if (Zo) {
                iy.tp(1701212675942497257L, this, str);
            }
            ProjectSupport projectSupport = getProjectSupport(str);
            if (projectSupport != null) {
                String strTp = projectSupport.tp(str);
                if (strTp != null) {
                    ServiceContainer.getLicenseService().cb(ServiceContainer.getMainActivity(), strTp, "open_project");
                } else {
                    XX(str);
                    sy("openProjectUser");
                }
            }
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 1701212675942497257L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 377544862601399913L)
    public List<String> yS() {
        try {
            if (Zo) {
                iy.gn(-1635664609308324055L, this);
            }
            return this.Hw;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -1635664609308324055L, this);
            }
            throw th;
        }
    }
}
