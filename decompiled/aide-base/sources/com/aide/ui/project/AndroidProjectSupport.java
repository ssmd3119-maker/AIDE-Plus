package com.aide.ui.project;

import abcd.be;
import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gd;
import abcd.gy;
import abcd.iy;
import abcd.ld;
import abcd.x8;
import abcd.xd;
import android.content.Context;
import android.content.pm.PackageManager;
import android.widget.Toast;
import com.aide.common.AndroidHelper;
import com.aide.common.AppLog;
import com.aide.common.MessageBox;
import com.aide.common.StreamUtilities;
import com.aide.common.ValueRunnable;
import com.aide.engine.EngineSolution;
import com.aide.engine.SyntaxError;
import com.aide.ui.AppPreferences;
import com.aide.ui.ExtendLibraries;
import com.aide.ui.MainActivity;
import com.aide.ui.R$drawable;
import com.aide.ui.ServiceContainer;
import com.aide.ui.build.BuildServiceCollect;
import com.aide.ui.build.android.m;
import com.aide.ui.htmluidesigner.PhonegapDesignActivity;
import com.aide.ui.project.internal.GradleTools;
import com.aide.ui.project.internal.MakeAndroidEngineSolution;
import com.aide.ui.services.ProjectService;
import com.aide.ui.services.ProjectSupport;
import com.aide.ui.services.TemplateService;
import com.aide.ui.trainer.c;
import com.aide.ui.u;
import com.aide.ui.util.AndroidProprieties;
import com.aide.ui.util.BuildGradle;
import com.aide.ui.util.BuildGradleExt;
import com.aide.ui.util.ClassPath;
import com.aide.ui.util.FileSystem;
import com.aide.uidesigner.XmlLayoutDesignActivity;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@cy(clazz = -7412680626788991448L, container = -7412680626788991448L, user = true)
/* loaded from: classes.dex */
public class AndroidProjectSupport implements ProjectSupport {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    @cy(clazz = 5139924369739322229L, container = -7412680626788991448L, user = true)
    class a implements Runnable {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -36263981012455260L)
        public a(AndroidProjectSupport androidProjectSupport) {
        }

        @Override // java.lang.Runnable
        @ey(method = 1369623595233373975L)
        public void run() {
            try {
                if (WB) {
                    iy.gn(4577506844748129121L, this);
                }
                ServiceContainer.getMavenService().resetDepPathMap();
                ServiceContainer.getProjectService().reloadingProject();
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, 4577506844748129121L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 5140003389656603480L, container = -7412680626788991448L, user = true)
    class b implements Runnable {

        @fy
        private static /* synthetic */ boolean fY;

        @gy
        private static /* synthetic */ boolean qp;

        @dy(field = 1285472984948465459L)
        final /* synthetic */ String WB;

        @dy(field = -2868732435967542900L)
        final /* synthetic */ String mb;

        static {
            iy.Zo(b.class);
        }

        @ey(method = 1380462639847908425L)
        public b(String str, String str2) {
            this.WB = str;
            this.mb = str2;
        }

        @Override // java.lang.Runnable
        @ey(method = 1843886310640949108L)
        public void run() {
            try {
                if (fY) {
                    iy.gn(-388308912335778629L, this);
                }
                if (!GradleTools.isGradleProject(this.WB)) {
                    AndroidProjectSupport.this.e9(this.mb);
                    return;
                }
                new BuildGradle().getConfiguration(GradleTools.Zo(this.WB)).addMavenDependency(this.mb);
                ServiceContainer.getProjectService().reloadingProject();
                Toast.makeText(ServiceContainer.getMainActivity(), "Library has been added", 0).show();
            } catch (Throwable th) {
                if (qp) {
                    iy.aM(th, -388308912335778629L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 5140082409577948025L, container = -7412680626788991448L, user = true)
    class c implements ValueRunnable<String> {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @dy(field = -2198109323525149083L)
        final /* synthetic */ String j6;

        static {
            iy.Zo(c.class);
        }

        @ey(method = -177108686559489875L)
        public c(AndroidProjectSupport androidProjectSupport, String str) {
            this.j6 = str;
        }

        @Override // com.aide.common.ValueRunnable
        @ey(method = -1703603405729806516L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public void j6(String str) {
            try {
                if (DW) {
                    iy.tp(3626311272802510863L, this, str);
                }
                new BuildGradle().getConfiguration(GradleTools.Zo(this.j6)).addProjectDependency(str);
                ServiceContainer.getProjectService().reloadingProject();
                Toast.makeText(ServiceContainer.getMainActivity(), "Library has been added", 0).show();
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, 3626311272802510863L, this, str);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 5140161429503355864L, container = -7412680626788991448L, user = true)
    class d implements ValueRunnable<String> {

        @fy
        private static /* synthetic */ boolean Hw;

        @gy
        private static /* synthetic */ boolean v5;

        @dy(field = 1436710636115807460L)
        final /* synthetic */ TemplateService.TemplateGroup DW;

        @dy(field = -4751140139427895000L)
        final /* synthetic */ String j6;

        @cy(clazz = 911427921499406493L, container = -7412680626788991448L, user = true)
        class a implements Runnable {

            @fy
            private static /* synthetic */ boolean fY;

            @gy
            private static /* synthetic */ boolean qp;

            @dy(field = 335952896616419495L)
            final /* synthetic */ String WB;

            @dy(field = -279925735181898208L)
            final /* synthetic */ String mb;

            @cy(clazz = -2514084231089790720L, container = -7412680626788991448L, user = true)
            /* renamed from: com.aide.ui.project.AndroidProjectSupport$d$a$a, reason: collision with other inner class name */
            class RunnableC0073a implements Runnable {

                @gy
                private static /* synthetic */ boolean fY;

                @fy
                private static /* synthetic */ boolean jw;

                @dy(field = 5076949876502803975L)
                final /* synthetic */ List WB;

                static {
                    iy.Zo(RunnableC0073a.class);
                }

                @ey(method = 2333619580092819868L)
                public RunnableC0073a(List list) {
                    this.WB = list;
                }

                @Override // java.lang.Runnable
                @ey(method = -1102392851317197092L)
                public void run() {
                    try {
                        if (jw) {
                            iy.gn(1676311398177522407L, this);
                        }
                        ServiceContainer.getOpenFileService().er(this.WB);
                        new BuildGradle().getConfiguration(GradleTools.Zo(d.this.j6)).addProductFlavor(a.this.mb);
                        ServiceContainer.getProjectService().ko();
                        Toast.makeText(ServiceContainer.getMainActivity(), "Build flavor has been added", 0).show();
                    } catch (Throwable th) {
                        if (fY) {
                            iy.aM(th, 1676311398177522407L, this);
                        }
                        throw th;
                    }
                }
            }

            static {
                iy.Zo(a.class);
            }

            @ey(method = -2728236819511854048L)
            public a(String str, String str2) {
                this.WB = str;
                this.mb = str2;
            }

            @Override // java.lang.Runnable
            @ey(method = 855661049542289073L)
            public void run() {
                try {
                    if (fY) {
                        iy.gn(1674759885876821880L, this);
                    }
                    ServiceContainer.aj(new RunnableC0073a(ServiceContainer.getTemplateService().j6(d.this.j6, "", this.WB, this.mb, d.this.DW)));
                } catch (Throwable th) {
                    if (qp) {
                        iy.aM(th, 1674759885876821880L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(d.class);
        }

        @ey(method = -2441476587497226840L)
        public d(String str, TemplateService.TemplateGroup templateGroup) {
            this.j6 = str;
            this.DW = templateGroup;
        }

        @Override // com.aide.common.ValueRunnable
        @ey(method = -4427230522680178245L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public void j6(String str) {
            try {
                if (Hw) {
                    iy.tp(-1417034728637937475L, this, str);
                }
                String strReplace = str.replace(" ", "");
                if (strReplace.length() != 0 && !"main".equals(strReplace)) {
                    List<String> productFlavors = AndroidProjectSupport.this.getProductFlavors(this.j6);
                    if (productFlavors == null || !productFlavors.contains(strReplace)) {
                        ServiceContainer.sy(ServiceContainer.getMainActivity(), "Creating Flavor ...", new a(AndroidProjectSupport.getProjectPackageName(this.j6, null), strReplace), null);
                    }
                }
            } catch (Throwable th) {
                if (v5) {
                    iy.j3(th, -1417034728637937475L, this, str);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 5140240449432826997L, container = -7412680626788991448L, user = true)
    class e implements ValueRunnable<String> {

        @gy
        private static /* synthetic */ boolean DW;

        @fy
        private static /* synthetic */ boolean j6;

        static {
            iy.Zo(e.class);
        }

        @ey(method = -13845813105668544L)
        public e(AndroidProjectSupport androidProjectSupport) {
        }

        @Override // com.aide.common.ValueRunnable
        @ey(method = -6800669457797170407L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public void j6(String str) {
            try {
                if (j6) {
                    iy.tp(-536274590869482891L, this, str);
                }
                MessageBox.gW(ServiceContainer.getMainActivity(), new ld(str.equals("main") ? null : str));
            } catch (Throwable th) {
                if (DW) {
                    iy.j3(th, -536274590869482891L, this, str);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(AndroidProjectSupport.class);
    }

    @ey(method = -1461292911883725093L)
    public AndroidProjectSupport() {
        try {
            if (j6) {
                iy.gn(2793003771819911800L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2793003771819911800L, null);
            }
            throw th;
        }
    }

    @ey(method = -168034687836158696L)
    public static List<String> AL(String str, String str2) {
        try {
            if (j6) {
                iy.EQ(-2912055080641150728L, null, str, str2);
            }
            ArrayList arrayList = new ArrayList();
            for (ClassPath.Entry entry : wc(str, str2)) {
                if (entry.isSrcKind()) {
                    arrayList.add(entry.VH(str));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -2912055080641150728L, null, str, str2);
            }
            throw th;
        }
    }

    @ey(method = 5814450889955846669L)
    private static String CU(String str) {
        try {
            if (j6) {
                iy.tp(1444778105777029825L, null, str);
            }
            List<String> listYS = ServiceContainer.getProjectService().yS();
            if (listYS.size() == 2 && listYS.get(1).equals(str)) {
                return listYS.get(0);
            }
            return null;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1444778105777029825L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 1204636859010878400L)
    private boolean Cz(String str) {
        String strSI;
        try {
            if (j6) {
                iy.tp(1592877543976923120L, this, str);
            }
            if (!str.endsWith(".xml") || (strSI = ServiceContainer.getProjectService().SI(str)) == null) {
                return false;
            }
            return ServiceContainer.getProjectService().getLibraryMapping().keySet().contains(strSI);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1592877543976923120L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 2624473722638312375L)
    public static String Eq(String str) {
        try {
            if (j6) {
                iy.tp(-1767082247104938125L, null, str);
            }
            return GradleTools.J8(str);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1767082247104938125L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 2096583353867048475L)
    public static String Ev(Map<String, List<String>> map, String str, String str2) {
        try {
            if (j6) {
                iy.we(-551497572471332521L, null, map, str, str2);
            }
            for (String str3 : aj(map, str)) {
                if (FileSystem.nw(str3, str2)) {
                    return FileSystem.BT(str3, str2).replace('/', '.');
                }
            }
            return null;
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, -551497572471332521L, null, map, str, str2);
            }
            throw th;
        }
    }

    @ey(method = 2315156860646639820L)
    public static Map<String, String> FN(Map<String, List<String>> map, String str) {
        try {
            if (j6) {
                iy.EQ(1659032822676777380L, null, map, str);
            }
            HashMap map2 = new HashMap();
            Iterator<Map.Entry<String, List<String>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                String key = it.next().getKey();
                if (GradleTools.isGradleProject(key)) {
                    map2.put(GradleTools.J8(key), GradleTools.lg(key));
                }
            }
            return map2;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 1659032822676777380L, null, map, str);
            }
            throw th;
        }
    }

    @ey(method = 453421136823337812L)
    private boolean Gj(String str) {
        try {
            if (j6) {
                iy.tp(2257219431962075708L, this, str);
            }
            return ServiceContainer.getProjectService().getLibraryMapping().get(ServiceContainer.getProjectService().getCurrentAppHome()).contains(str);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 2257219431962075708L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -93022078703494720L)
    private boolean I() {
        try {
            if (j6) {
                iy.gn(37881285625090048L, this);
            }
            if (m.Mr()) {
                return false;
            }
            Iterator<String> it = ServiceContainer.getProjectService().P8().iterator();
            while (it.hasNext()) {
                if (vy(it.next())) {
                    ServiceContainer.getDownloadService().ca(ServiceContainer.gn(), "This project contains native code.");
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 37881285625090048L, this);
            }
            throw th;
        }
    }

    @ey(method = -794968119170430268L)
    private boolean Jl(String str) {
        String strSI;
        try {
            if (j6) {
                iy.tp(658092026953462524L, this, str);
            }
            if (!str.endsWith(".aidl") || (strSI = ServiceContainer.getProjectService().SI(str)) == null) {
                return false;
            }
            return ServiceContainer.getProjectService().getLibraryMapping().keySet().contains(strSI);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 658092026953462524L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 914065212978889604L)
    private boolean Mz() {
        try {
            if (j6) {
                iy.gn(1426339988567847628L, this);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(qp());
            if (arrayList.isEmpty()) {
                return I();
            }
            ServiceContainer.getDownloadService().a8(ServiceContainer.gn(), arrayList, WB(ServiceContainer.getProjectService().getCurrentAppHome()), new a(this));
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1426339988567847628L, this);
            }
            throw th;
        }
    }

    @ey(method = -143088613891556081L)
    public static String[] OW(Map<String, List<String>> map, String str, String str2) {
        try {
            if (j6) {
                iy.we(2347662174777702123L, null, map, str, str2);
            }
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext()) {
                arrayList.addAll(GradleTools.aM(it.next(), ProjectService.KD(str), str2));
            }
            String[] strArr = new String[arrayList.size()];
            arrayList.toArray(strArr);
            return strArr;
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, 2347662174777702123L, null, map, str, str2);
            }
            throw th;
        }
    }

    @ey(method = -2275440309849685017L)
    public static String Q6(String str) {
        try {
            if (j6) {
                iy.tp(-3997672375602014685L, null, str);
            }
            String strCU = CU(str);
            return strCU != null ? x8.DW(GradleTools.Ws(strCU)) : GradleTools.BT(str);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -3997672375602014685L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 561266874444175008L)
    public static void Qq(Map<String, List<String>> map, String str) {
        try {
            if (j6) {
                iy.EQ(-6823988713756507440L, null, map, str);
            }
            Iterator<Map.Entry<String, List<String>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                String key = it.next().getKey();
                if (GradleTools.isGradleProject(key)) {
                    BuildGradle configuration = new BuildGradle().getConfiguration(GradleTools.Zo(key));
                    if (configuration.wearAppProject != null) {
                        String projectDependencyPath = configuration.wearAppProject.getProjectDependencyPath(key, new BuildGradleExt().getConfiguration(GradleTools.getSettingsGradlePath(key)));
                        if (FileSystem.isDirectory(projectDependencyPath)) {
                            WearAppProjectSupport.v5(GradleTools.a8(projectDependencyPath, str), GradleTools.Ws(key), GradleTools.isGradleProject(projectDependencyPath) ? new BuildGradle().getConfiguration(GradleTools.Zo(projectDependencyPath)) : null, str);
                        }
                    }
                    new com.aide.ui.build.android.d().Zo(key, getProjectPackageName(key, str), GradleTools.Ws(key));
                }
            }
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -6823988713756507440L, null, map, str);
            }
            throw th;
        }
    }

    @ey(method = -1479517626085952952L)
    private void Sf(String str) {
        try {
            if (j6) {
                iy.tp(261526259782934792L, this, str);
            }
            MessageBox.gW(ServiceContainer.getMainActivity(), new gd(FileSystem.getParent(str), new TemplateService.TemplateGroup("Library", new TemplateService.Template(this, 1, "Android Library", "Gradle/Android SDK/Java/Xml", "library", true, true, "com.aide.ui", "ANDROID", "course_android", ServiceContainer.ca() || ServiceContainer.P8.equals("com.aide.ui")), 2131165304, "GradleLibrary.zip", new String[]{"AndroidManifest.xml", "LibraryActivity.java"}, ""), new c(this, str)));
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 261526259782934792L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 77357146421944692L)
    private List<BuildGradle.RemoteRepository> WB(String str) {
        try {
            if (j6) {
                iy.tp(236882526581087532L, this, str);
            }
            ArrayList arrayList = new ArrayList();
            if (GradleTools.isGradleProject(str)) {
                for (BuildGradle.Repository repository : new BuildGradle().getConfiguration(GradleTools.Zo(str)).curProjectsRepositorys) {
                    if (repository instanceof BuildGradle.RemoteRepository) {
                        arrayList.add((BuildGradle.RemoteRepository) repository);
                    }
                }
                String strP8 = GradleTools.P8(str);
                if (FileSystem.isFileAndNotZip(strP8)) {
                    BuildGradle configuration = new BuildGradle().getConfiguration(strP8);
                    for (BuildGradle.Repository repository2 : configuration.allProjectsRepositorys) {
                        if (repository2 instanceof BuildGradle.RemoteRepository) {
                            arrayList.add((BuildGradle.RemoteRepository) repository2);
                        }
                    }
                    for (BuildGradle.Repository repository3 : configuration.subProjectsRepositorys) {
                        if (repository3 instanceof BuildGradle.RemoteRepository) {
                            arrayList.add((BuildGradle.RemoteRepository) repository3);
                        }
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 236882526581087532L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -1418262042694262200L)
    public static String XG(String str) {
        try {
            if (j6) {
                iy.tp(3608711081973234600L, null, str);
            }
            return GradleTools.Hw(str);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 3608711081973234600L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 3955997592842140608L)
    public static int XX(String str, String str2) {
        try {
            if (j6) {
                iy.EQ(-1907573176717187728L, null, str, str2);
            }
            return WearAppProjectSupport.Zo(GradleTools.a8(str, str2), GradleTools.isGradleProject(str) ? new BuildGradle().getConfiguration(GradleTools.Zo(str)) : null, str2);
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -1907573176717187728L, null, str, str2);
            }
            throw th;
        }
    }

    @ey(method = 76105294430407836L)
    public static Map<String, String> Z1(Map<String, List<String>> map, String str) {
        try {
            if (j6) {
                iy.EQ(343945883981808180L, null, map, str);
            }
            HashMap map2 = new HashMap();
            Iterator<Map.Entry<String, List<String>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                String key = it.next().getKey();
                if (GradleTools.isGradleProject(key)) {
                    map2.put(GradleTools.a8(key, str), GradleTools.QX(key));
                }
            }
            return map2;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 343945883981808180L, null, map, str);
            }
            throw th;
        }
    }

    @ey(method = -1573309113299661099L)
    public static boolean aX(String str, String str2) {
        try {
            if (j6) {
                iy.EQ(-1145592775593011823L, null, str, str2);
            }
            if (XX(str, str2) >= 21) {
                return true;
            }
            return new BuildGradle().getConfiguration(GradleTools.Zo(str)).isMultiDexEnabled(str2);
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -1145592775593011823L, null, str, str2);
            }
            throw th;
        }
    }

    @ey(method = 1684628239184816695L)
    public static String[] aj(Map<String, List<String>> map, String str) {
        try {
            if (j6) {
                iy.EQ(-3524926640346883317L, null, map, str);
            }
            ArrayList arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                if (!GradleTools.isAarEexplodedPath(str2)) {
                    for (ClassPath.Entry entry : wc(str2, str)) {
                        if (entry.isSrcKind()) {
                            arrayList.add(entry.VH(str2));
                        }
                    }
                }
            }
            String[] strArr = new String[arrayList.size()];
            arrayList.toArray(strArr);
            return strArr;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -3524926640346883317L, null, map, str);
            }
            throw th;
        }
    }

    @ey(method = -3285833601592581600L)
    public static Map<String, String> aq(String str, Map<String, List<String>> map, String str2) {
        try {
            if (j6) {
                iy.we(6119669242689035776L, null, str, map, str2);
            }
            HashMap map2 = new HashMap();
            Iterator<Map.Entry<String, List<String>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                String key = it.next().getKey();
                if (iW(key)) {
                    if (GradleTools.isAarEexplodedPath(key)) {
                        String strA8 = GradleTools.a8(key, str2);
                        String strQX = GradleTools.QX(key);
                        if (WearAppProjectSupport.J0(strA8, strQX, null, getProjectPackageName(str, str2), str2)) {
                            map2.put(GradleTools.J8(key), strQX);
                        } else {
                            map2.put(GradleTools.J8(key), strA8);
                        }
                    } else if (GradleTools.isGradleProject(key)) {
                        BuildGradle configuration = new BuildGradle().getConfiguration(GradleTools.Zo(key));
                        String strA82 = GradleTools.a8(key, str2);
                        String strQX2 = GradleTools.QX(key);
                        if (WearAppProjectSupport.J0(strA82, strQX2, configuration, getProjectPackageName(str, str2), str2)) {
                            map2.put(GradleTools.J8(key), strQX2);
                        } else {
                            map2.put(GradleTools.J8(key), strA82);
                        }
                    } else {
                        map2.put(GradleTools.J8(key), GradleTools.a8(key, str2));
                    }
                }
            }
            return map2;
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, 6119669242689035776L, null, str, map, str2);
            }
            throw th;
        }
    }

    @ey(method = -2157472348861346888L)
    public static String br(String str) {
        try {
            if (j6) {
                iy.tp(-697873328656380328L, null, str);
            }
            return GradleTools.DW(str);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -697873328656380328L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 50140741417126800L)
    public static Map<String, String> cT(Map<String, List<String>> map, String str) {
        try {
            if (j6) {
                iy.EQ(-248225312114061088L, null, map, str);
            }
            HashMap map2 = new HashMap();
            Iterator<Map.Entry<String, List<String>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                String key = it.next().getKey();
                if (iW(key)) {
                    map2.put(GradleTools.yS(key), GradleTools.v5(key));
                    String strWs = GradleTools.Ws(key);
                    if (strWs != null) {
                        map2.put(strWs, GradleTools.v5(key));
                    }
                    String strJ0 = GradleTools.J0(key, str);
                    if (strJ0 != null) {
                        map2.put(strJ0, GradleTools.v5(key));
                    }
                }
            }
            return map2;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -248225312114061088L, null, map, str);
            }
            throw th;
        }
    }

    @ey(method = -979504340916545475L)
    private void ca(String str, HashSet<String> hashSet) {
        try {
            if (j6) {
                iy.EQ(-1324259272659998927L, this, str, hashSet);
            }
            if (hashSet.contains(hashSet)) {
                return;
            }
            hashSet.add(str);
            if (GradleTools.isGradleProject(str)) {
                for (BuildGradle.Dependency dependency : getProjectMavenDependencyList(str)) {
                    if (dependency instanceof BuildGradle.MavenDependency) {
                        ServiceContainer.getMavenService().resolvingMavenDependency((BuildGradle.MavenDependency) dependency);
                    }
                }
                for (BuildGradle.Dependency dependency2 : getProjectMavenDependencyList(str)) {
                    if (dependency2 instanceof BuildGradle.ProjectDependency) {
                        String projectDependencyPath = ((BuildGradle.ProjectDependency) dependency2).getProjectDependencyPath(str, new BuildGradleExt().getConfiguration(GradleTools.getSettingsGradlePath(str)));
                        if (FileSystem.isDirectory(projectDependencyPath)) {
                            ca(projectDependencyPath, hashSet);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -1324259272659998927L, this, str, hashSet);
            }
            throw th;
        }
    }

    @ey(method = -1011388354450489668L)
    private static void dx(List<ClassPath.Entry> list) {
        try {
            if (j6) {
                iy.tp(30635270447348580L, null, list);
            }
            Iterator<ClassPath.Entry> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().isConKind()) {
                    return;
                }
            }
            list.add(ClassPath.Entry.v5);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 30635270447348580L, null, list);
            }
            throw th;
        }
    }

    @ey(method = 192918529456175765L)
    public static boolean e3() {
        try {
            if (j6) {
                iy.gn(-220613832062512575L, null);
            }
            return ServiceContainer.getProjectService().yS().size() == 2;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -220613832062512575L, null);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 1782198420832338299L)
    public void e9(String str) {
        try {
            if (j6) {
                iy.tp(-461890410999912657L, this, str);
            }
            String[] strArrSplit = str.split(":");
            if (strArrSplit.length >= 3) {
                BuildGradle.MavenDependency mavenDependency = new BuildGradle.MavenDependency(1);
                mavenDependency.groupId = strArrSplit[0];
                mavenDependency.artifactId = strArrSplit[1];
                mavenDependency.version = strArrSplit[2];
                String strU7 = ServiceContainer.getMavenService().u7(mavenDependency);
                if (strU7 != null && strU7.endsWith(".jar")) {
                    try {
                        File file = new File(GradleTools.Mr(ServiceContainer.getProjectService().getCurrentAppHome()));
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        StreamUtilities.Zo(new FileInputStream(strU7), new FileOutputStream(new File(file, FileSystem.getName(strU7))));
                    } catch (IOException e2) {
                        AppLog.v5(e2);
                    }
                    ServiceContainer.getProjectService().reloadingProject();
                } else if (strU7 != null && strU7.endsWith(".aar")) {
                    ServiceContainer.getProjectService().v5(strU7);
                }
                Toast.makeText(ServiceContainer.getMainActivity(), "Library has been added", 0).show();
            }
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -461890410999912657L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -3068502944350571473L)
    private boolean eU() {
        try {
            if (j6) {
                iy.gn(-923133069080280773L, this);
            }
            if (ServiceContainer.getProjectService().getLibraryMapping().size() > 1) {
                return true;
            }
            int iJ8 = 0;
            for (String str : aj(ServiceContainer.getProjectService().getLibraryMapping(), null)) {
                iJ8 += FileSystem.J8(str, mb(), ".java");
                if (iJ8 >= mb()) {
                    return true;
                }
            }
            if (m.Mr()) {
                for (String str2 : ServiceContainer.getProjectService().P8()) {
                    if (vy(str2) && (iJ8 = iJ8 + FileSystem.J8(str2, mb(), ".c", ".cpp", ".cc", ".h", ".hpp")) >= mb()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -923133069080280773L, this);
            }
            throw th;
        }
    }

    @ey(method = -5130725207667624300L)
    private void ef(String str) {
        try {
            if (j6) {
                iy.tp(-7918044897779598260L, this, str);
            }
            MessageBox.XL(ServiceContainer.getMainActivity(), u.dialog_add_to_project_new_product_flavor, u.dialog_create_message, "flavor", new d(str, new TemplateService.TemplateGroup("Flavor", new TemplateService.Template(this, 1, "Android Flavor", "Gradle/Android SDK/Java/Xml", "flavor", true, true, "com.aide.ui", "ANDROID", "course_android", ServiceContainer.ca() || ServiceContainer.P8.equals("com.aide.ui")), 2131165304, "GradleFlavor.zip", new String[]{"AndroidManifest.xml", "strings.xml"}, "")));
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -7918044897779598260L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -757312037659788576L)
    public static String et(String str, boolean z) {
        try {
            if (j6) {
                iy.EQ(-889735075763873680L, null, str, new Boolean(z));
            }
            return GradleTools.u7(str, z);
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -889735075763873680L, null, str, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 89918871487573704L)
    private static boolean fN(String str, String str2) {
        try {
            if (j6) {
                iy.EQ(1931767644748921000L, null, str, str2);
            }
            for (ClassPath.Entry entry : wc(str, null)) {
                if (entry.isLibKind() && entry.VH(str).equals(str2)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 1931767644748921000L, null, str, str2);
            }
            throw th;
        }
    }

    @ey(method = -288161974215339768L)
    public static List<String> fY(String str, String str2) {
        String strWe;
        try {
            if (j6) {
                iy.EQ(-459456521630296080L, null, str, str2);
            }
            ArrayList arrayList = new ArrayList();
            if (GradleTools.nw(str) && (strWe = GradleTools.we(str, str2)) != null) {
                arrayList.add(strWe);
            }
            return arrayList;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -459456521630296080L, null, str, str2);
            }
            throw th;
        }
    }

    @ey(method = -4052264112394768129L)
    private boolean g3() {
        try {
            if (j6) {
                iy.gn(-3501544061732625741L, this);
            }
            return Mz();
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -3501544061732625741L, this);
            }
            throw th;
        }
    }

    @ey(method = 461234334962320168L)
    private static Map<String, String> getFlatRepositoryPathMap(String str) {
        try {
            if (j6) {
                iy.tp(-1512580198140442200L, null, str);
            }
            HashMap map = new HashMap();
            for (BuildGradle.Repository repository : new BuildGradle().getConfiguration(GradleTools.Zo(str)).curProjectsRepositorys) {
                if (repository instanceof BuildGradle.FlatLocalRepository) {
                    map.put(((BuildGradle.FlatLocalRepository) repository).getFlatDir(str), GradleTools.EQ(str));
                }
            }
            return map;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1512580198140442200L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 226718068265500104L)
    private static List<BuildGradle.Dependency> getProjectMavenDependencyList(String str) {
        try {
            if (j6) {
                iy.tp(311781667430083752L, null, str);
            }
            BuildGradle configuration = new BuildGradle().getConfiguration(GradleTools.Zo(str));
            String strP8 = GradleTools.P8(str);
            if (FileSystem.isFileAndNotZip(strP8)) {
                BuildGradle configuration2 = new BuildGradle().getConfiguration(strP8);
                if (configuration2.subProjectsDependencies.size() > 0 || configuration2.allProjectsDependencies.size() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (BuildGradle.Dependency dependency : configuration2.subProjectsDependencies) {
                        if (dependency instanceof BuildGradle.MavenDependency) {
                            arrayList.add(dependency);
                        }
                    }
                    for (BuildGradle.Dependency dependency2 : configuration2.allProjectsDependencies) {
                        if (dependency2 instanceof BuildGradle.MavenDependency) {
                            arrayList.add(dependency2);
                        }
                    }
                    arrayList.addAll(configuration.dependencies);
                    return arrayList;
                }
            }
            return configuration.dependencies;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 311781667430083752L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -475300604418447160L)
    public static String getProjectPackageName(String str, String str2) {
        try {
            if (j6) {
                iy.EQ(1815749921793188520L, null, str, str2);
            }
            return WearAppProjectSupport.gn(GradleTools.a8(str, str2), GradleTools.isGradleProject(str) ? new BuildGradle().getConfiguration(GradleTools.Zo(str)) : null, str2);
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 1815749921793188520L, null, str, str2);
            }
            throw th;
        }
    }

    @ey(method = 3239979424570573531L)
    private static void hK(List<String> list, String str, List<String> list2) {
        try {
            if (j6) {
                iy.we(-3650618387818877385L, null, list, str, list2);
            }
            for (String str2 : list) {
                String strWs = GradleTools.Ws(str2);
                if (strWs != null) {
                    list2.add(strWs);
                }
                String strJ0 = GradleTools.J0(str2, str);
                if (strJ0 != null) {
                    list2.add(strJ0);
                }
                list2.add(GradleTools.yS(str2));
            }
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, -3650618387818877385L, null, list, str, list2);
            }
            throw th;
        }
    }

    @ey(method = -6738623334079951724L)
    public static Map<String, List<String>> hz(Map<String, List<String>> map, String str) {
        try {
            if (j6) {
                iy.EQ(-3920495467653063396L, null, map, str);
            }
            HashMap map2 = new HashMap();
            for (String str2 : map.keySet()) {
                if (iW(str2)) {
                    List<String> listAL = AL(str2, str);
                    if (!listAL.isEmpty()) {
                        map2.put(GradleTools.J8(str2), listAL);
                    }
                }
            }
            return map2;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -3920495467653063396L, null, map, str);
            }
            throw th;
        }
    }

    @ey(method = 2301984790879520760L)
    public static boolean iW(String str) {
        try {
            if (j6) {
                iy.tp(2522822438349039640L, null, str);
            }
            return GradleTools.nw(str);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 2522822438349039640L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 370127993874029616L)
    public static String jJ(String str) {
        try {
            if (j6) {
                iy.tp(126918741993575400L, null, str);
            }
            return GradleTools.VH(str);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 126918741993575400L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 651003724537948180L)
    public static Map<String, String> jO(Map<String, List<String>> map, String str) {
        try {
            if (j6) {
                iy.EQ(3127780750093082220L, null, map, str);
            }
            HashMap map2 = new HashMap();
            for (String str2 : map.keySet()) {
                if (iW(str2)) {
                    map2.put(GradleTools.J8(str2), getProjectPackageName(str2, str));
                }
            }
            return map2;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 3127780750093082220L, null, map, str);
            }
            throw th;
        }
    }

    @ey(method = -78609314619080L)
    public static List<String> jw(String str) {
        try {
            if (j6) {
                iy.tp(1676879258125261240L, null, str);
            }
            ArrayList arrayList = new ArrayList();
            if (GradleTools.isGradleProject(str)) {
                for (String str2 : ServiceContainer.getProjectService().getLibraryMapping().get(str)) {
                    if (GradleTools.isGradleProject(str2) || GradleTools.isAarEexplodedPath(str2)) {
                        arrayList.add(GradleTools.J8(str2));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1676879258125261240L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -3005094590391061448L)
    public static String kf(String str) {
        try {
            if (j6) {
                iy.tp(-2068284352529854272L, null, str);
            }
            return GradleTools.vy(str);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -2068284352529854272L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -4610834421897385460L)
    public static String ko(String str) {
        try {
            if (j6) {
                iy.tp(3631197539518665156L, null, str);
            }
            return GradleTools.XL(str);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 3631197539518665156L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -793751327096437944L)
    public static String[] lp(Map<String, List<String>> map, boolean z) {
        try {
            if (j6) {
                iy.EQ(-1367387541841433712L, null, map, new Boolean(z));
            }
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext()) {
                arrayList.add(GradleTools.u7(it.next(), z));
            }
            String[] strArr = new String[arrayList.size()];
            arrayList.toArray(strArr);
            return strArr;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -1367387541841433712L, null, map, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -1126529071755779712L)
    public static String n5(String str) {
        try {
            if (j6) {
                iy.tp(-517301005137339280L, null, str);
            }
            return GradleTools.yS(str) + "/values/strings.xml";
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -517301005137339280L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -5196106472920040076L)
    public static Map<String, List<String>> oY(Map<String, List<String>> map, String str) {
        try {
            if (j6) {
                iy.EQ(-2041815973874266916L, null, map, str);
            }
            HashMap map2 = new HashMap();
            Iterator<Map.Entry<String, List<String>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                String key = it.next().getKey();
                if (iW(key)) {
                    ArrayList arrayList = new ArrayList();
                    hK(xd.FH(key, map), str, arrayList);
                    map2.put(GradleTools.J8(key), arrayList);
                }
            }
            return map2;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -2041815973874266916L, null, map, str);
            }
            throw th;
        }
    }

    @ey(method = -2153818021347388265L)
    private static void oy(String str, Map<String, List<String>> map) {
        try {
            if (j6) {
                iy.EQ(490187689529152251L, null, str, map);
            }
            List<String> list = map.get(str);
            if (GradleTools.isAarEexplodedPath(str)) {
                for (String str2 : ServiceContainer.getMavenService().J0(str)) {
                    if (str2.endsWith(".aar") && !str.equals(str2) && !list.contains(str2)) {
                        list.add(str2);
                    }
                }
                return;
            }
            if (!GradleTools.isGradleProject(str)) {
                Iterator<AndroidProprieties.a> it = new AndroidProprieties().getConfiguration(GradleTools.getProjectProperties(str)).Zo.iterator();
                while (it.hasNext()) {
                    String strJ6 = it.next().j6(str);
                    if (FileSystem.isDirectory(strJ6) && !list.contains(strJ6)) {
                        list.add(strJ6);
                    }
                }
                if (FileSystem.exists(GradleTools.gn(str))) {
                    for (ClassPath.Entry entry : new ClassPath().getConfiguration(GradleTools.gn(str)).Zo) {
                        if (entry.v5()) {
                            String strVH = entry.VH(str);
                            if (FileSystem.isDirectory(strVH) && !list.contains(strVH)) {
                                list.add(strVH);
                            }
                        }
                    }
                    return;
                }
                return;
            }
            ArrayList<String> arrayList = new ArrayList();
            for (BuildGradle.Dependency dependency : getProjectMavenDependencyList(str)) {
                if (dependency instanceof BuildGradle.MavenDependency) {
                    Map<String, String> flatRepositoryPathMap = getFlatRepositoryPathMap(str);
                    for (String str3 : ServiceContainer.getMavenService().resolveFullDependencyTree(flatRepositoryPathMap, (BuildGradle.MavenDependency) dependency)) {
                        if (str3.endsWith(".aar") && !list.contains(str3)) {
                            list.add(str3);
                            Iterator<String> it2 = flatRepositoryPathMap.values().iterator();
                            while (it2.hasNext()) {
                                if (FileSystem.nw(it2.next(), str3)) {
                                    arrayList.add(str3);
                                }
                            }
                        }
                    }
                } else if (dependency instanceof BuildGradle.ProjectDependency) {
                    String projectDependencyPath = ((BuildGradle.ProjectDependency) dependency).getProjectDependencyPath(str, new BuildGradleExt().getConfiguration(GradleTools.getSettingsGradlePath(str)));
                    if (FileSystem.isDirectory(projectDependencyPath) && !list.contains(projectDependencyPath)) {
                        list.add(projectDependencyPath);
                    }
                }
            }
            for (String str4 : arrayList) {
                if (!map.containsKey(str4)) {
                    map.put(str4, new ArrayList());
                }
                for (String str5 : arrayList) {
                    if (!str4.equals(str5) && !map.get(str4).contains(str5)) {
                        map.get(str4).add(str5);
                    }
                }
            }
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 490187689529152251L, null, str, map);
            }
            throw th;
        }
    }

    @ey(method = 1434820825404510096L)
    private void pN(String str, Map<String, List<String>> map, List<String> list) {
        try {
            if (j6) {
                iy.we(-625702349923734912L, this, str, map, list);
            }
            if (map.containsKey(str)) {
                return;
            }
            map.put(str, new ArrayList());
            oy(str, map);
            Iterator<String> it = map.get(str).iterator();
            while (it.hasNext()) {
                pN(it.next(), map, list);
            }
            for (String str2 : w9(str)) {
                list.add(str2);
                pN(str2, map, list);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, -625702349923734912L, this, str, map, list);
            }
            throw th;
        }
    }

    @ey(method = 2780720680954411512L)
    private boolean pO(String str) {
        try {
            if (j6) {
                iy.tp(-3807226918510872840L, this, str);
            }
            if (!ServiceContainer.getProjectService().isOpenProject()) {
                return false;
            }
            if (FileSystem.getName(str).equals(".classpath") || FileSystem.getName(str).equals("project.properties")) {
                return true;
            }
            return FileSystem.getName(str).equals("build.gradle");
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -3807226918510872840L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 3254252102483190200L)
    public static BuildGradle.SigningConfig q7(String str, String str2, String str3) {
        try {
            if (j6) {
                iy.we(-873918421586204200L, null, str, str2, str3);
            }
            return new BuildGradle().getConfiguration(GradleTools.Zo(str)).getSigningConfig(ProjectService.KD(str2));
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, -873918421586204200L, null, str, str2, str3);
            }
            throw th;
        }
    }

    @ey(method = -614113329613871600L)
    private static boolean sE(Context context, String str, String str2) {
        try {
            if (j6) {
                iy.we(6868101329841265056L, null, context, str, str2);
            }
            try {
                context.getPackageManager().getPackageInfo(getProjectPackageName(str, str2), 128);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, 6868101329841265056L, null, context, str, str2);
            }
            throw th;
        }
    }

    @ey(method = 5531937757461158176L)
    private static void sG(String str, String str2, List<ClassPath.Entry> list, boolean z) {
        try {
            if (j6) {
                iy.J0(-3937517446862853504L, null, str, str2, list, new Boolean(z));
            }
            if (FileSystem.XL(str).equals("jar")) {
                Iterator<ClassPath.Entry> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().VH(str2).equals(str)) {
                        return;
                    }
                }
                list.add(new ClassPath.Entry("lib", str, false, true, z));
                return;
            }
            if (FileSystem.isDirectory(str)) {
                try {
                    List<String> listJ0 = FileSystem.J0(str);
                    Collections.sort(listJ0);
                    Iterator<String> it2 = listJ0.iterator();
                    while (it2.hasNext()) {
                        sG(it2.next(), str2, list, z);
                    }
                } catch (IOException e2) {
                    AppLog.v5(e2);
                }
            }
        } catch (Throwable th) {
            if (DW) {
                iy.a8(th, -3937517446862853504L, null, str, str2, list, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 6087275929190163123L)
    public static boolean sg(String str) {
        try {
            if (j6) {
                iy.tp(1658834080289069423L, null, str);
            }
            return GradleTools.cb(str);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1658834080289069423L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -1361361391153483552L)
    public static String[] sy(Map<String, List<String>> map) {
        try {
            if (j6) {
                iy.tp(-3667659321630616880L, null, map);
            }
            HashMap map2 = new HashMap();
            for (String str : map.keySet()) {
                for (ClassPath.Entry entry : wc(str, null)) {
                    if (entry.isLibKind() && !map2.containsKey(entry.j6())) {
                        map2.put(entry.j6(), entry.VH(str));
                    }
                }
            }
            String[] strArr = new String[map2.size()];
            map2.values().toArray(strArr);
            return strArr;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -3667659321630616880L, null, map);
            }
            throw th;
        }
    }

    @ey(method = -635241634156787472L)
    private static void vJ(String str, List<ClassPath.Entry> list) {
        try {
            if (j6) {
                iy.EQ(-3415075472693557920L, null, str, list);
            }
            Iterator<AndroidProprieties.a> it = new AndroidProprieties().getConfiguration(GradleTools.getProjectProperties(str)).VH.iterator();
            while (it.hasNext()) {
                String strJ6 = it.next().j6(str);
                if (FileSystem.isDirectory(strJ6)) {
                    list.add(new ClassPath.Entry("src", strJ6, false));
                }
            }
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -3415075472693557920L, null, str, list);
            }
            throw th;
        }
    }

    @ey(method = -1165144152368134187L)
    private static List<String> w9(String str) {
        try {
            if (j6) {
                iy.tp(926507501989784569L, null, str);
            }
            ArrayList arrayList = new ArrayList();
            if (GradleTools.isGradleProject(str)) {
                BuildGradle configuration = new BuildGradle().getConfiguration(GradleTools.Zo(str));
                if (configuration.wearAppProject != null) {
                    String projectDependencyPath = configuration.wearAppProject.getProjectDependencyPath(str, new BuildGradleExt().getConfiguration(GradleTools.getSettingsGradlePath(str)));
                    if (FileSystem.isDirectory(projectDependencyPath)) {
                        arrayList.add(projectDependencyPath);
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 926507501989784569L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -252486743349152073L)
    public static List<ClassPath.Entry> wc(String str, String str2) {
        try {
            if (j6) {
                iy.EQ(1764865383536423555L, null, str, str2);
            }
            ArrayList arrayList = new ArrayList();
            boolean z = true;
            if (GradleTools.isAarEexplodedPath(str)) {
                arrayList.add(new ClassPath.Entry("lib", GradleTools.j6(str), false, true, true));
                sG(GradleTools.Mr(str), str, arrayList, true);
                for (String str3 : ServiceContainer.getMavenService().J0(str)) {
                    if (str3.endsWith(".jar")) {
                        arrayList.add(new ClassPath.Entry("lib", str3, false, true));
                    }
                }
                dx(arrayList);
            } else if (FileSystem.exists(GradleTools.gn(str))) {
                arrayList.addAll(new ClassPath().getConfiguration(GradleTools.gn(str)).Zo);
                if (iW(str)) {
                    sG(GradleTools.Mr(str), str, arrayList, false);
                }
                dx(arrayList);
                String strLp = FileSystem.lp(str, GradleTools.J8(str));
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    ClassPath.Entry entry = (ClassPath.Entry) it.next();
                    if (entry.isSrcKind() && entry.path != null && entry.path.equals(strLp)) {
                        break;
                    }
                }
                if (!z) {
                    arrayList.add(new ClassPath.Entry("src", FileSystem.lp(str, GradleTools.J8(str)), false));
                }
            } else if (GradleTools.isGradleProject(str)) {
                for (String str4 : GradleTools.gW(str, str2)) {
                    arrayList.add(new ClassPath.Entry("src", FileSystem.lp(str, str4), false));
                }
                arrayList.add(new ClassPath.Entry("src", FileSystem.lp(str, GradleTools.J8(str)), false));
                arrayList.add(ClassPath.Entry.v5);
                arrayList.add(ClassPath.Entry.Zo);
                for (BuildGradle.Dependency dependency : getProjectMavenDependencyList(str)) {
                    if (dependency instanceof BuildGradle.MavenDependency) {
                        for (String str5 : ServiceContainer.getMavenService().resolveFullDependencyTree(getFlatRepositoryPathMap(str), (BuildGradle.MavenDependency) dependency)) {
                            if (str5.endsWith(".jar")) {
                                arrayList.add(new ClassPath.Entry("lib", str5, false, true));
                            }
                        }
                    } else if (dependency instanceof BuildGradle.FileTreeDependency) {
                        String dirPath = ((BuildGradle.FileTreeDependency) dependency).getDirPath(str);
                        if (dirPath != null) {
                            sG(dirPath, str, arrayList, false);
                        }
                    } else if (dependency instanceof BuildGradle.FilesDependency) {
                        arrayList.add(new ClassPath.Entry("lib", ((BuildGradle.FilesDependency) dependency).getFilesPath(str), false, true));
                    }
                }
                arrayList.add(new ClassPath.Entry("output", FileSystem.lp(str, GradleTools.Hw(str)), false));
            } else {
                vJ(str, arrayList);
                for (String str6 : GradleTools.gW(str, str2)) {
                    arrayList.add(new ClassPath.Entry("src", FileSystem.lp(str, str6), false));
                }
                arrayList.add(new ClassPath.Entry("src", FileSystem.lp(str, GradleTools.J8(str)), false));
                arrayList.add(ClassPath.Entry.v5);
                arrayList.add(ClassPath.Entry.Zo);
                arrayList.add(new ClassPath.Entry("output", FileSystem.lp(str, GradleTools.Hw(str)), false));
                sG(GradleTools.Mr(str), str, arrayList, false);
            }
            return arrayList;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 1764865383536423555L, null, str, str2);
            }
            throw th;
        }
    }

    @ey(method = -182149726130150959L)
    public static void x9() {
        try {
            if (j6) {
                iy.gn(2116988425167894429L, null);
            }
            HashMap map = new HashMap();
            String currentAppHome = ServiceContainer.getProjectService().getCurrentAppHome();
            if (GradleTools.isGradleProject(currentAppHome)) {
                String strP8 = GradleTools.P8(currentAppHome);
                if (FileSystem.isFileAndNotZip(strP8)) {
                    BuildGradle configuration = new BuildGradle().getConfiguration(strP8);
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(configuration.allProjectsDependencies);
                    arrayList.addAll(configuration.subProjectsDependencies);
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        BuildGradle.Dependency dependency = (BuildGradle.Dependency) it.next();
                        if (dependency instanceof BuildGradle.MavenDependency) {
                            BuildGradle.MavenDependency mavenDependency = (BuildGradle.MavenDependency) dependency;
                            if (!ServiceContainer.getMavenService().existsLocalMavenCache(getFlatRepositoryPathMap(currentAppHome), mavenDependency)) {
                                SyntaxError syntaxError = new SyntaxError();
                                syntaxError.jw = mavenDependency.line;
                                syntaxError.fY = 1;
                                syntaxError.qp = mavenDependency.line;
                                syntaxError.k2 = 1000;
                                syntaxError.zh = "Dependency '" + mavenDependency.coords + "' not found";
                                arrayList2.add(syntaxError);
                            }
                        } else {
                            SyntaxError syntaxError2 = new SyntaxError();
                            syntaxError2.jw = dependency.line;
                            syntaxError2.fY = 1;
                            syntaxError2.qp = dependency.line;
                            syntaxError2.k2 = 1000;
                            syntaxError2.zh = "Unexpected dependency";
                            arrayList2.add(syntaxError2);
                        }
                    }
                    if (arrayList2.size() > 0) {
                        map.put(strP8, arrayList2);
                    }
                }
            }
            for (String str : ServiceContainer.getProjectService().getLibraryMapping().keySet()) {
                if (GradleTools.isGradleProject(str)) {
                    ArrayList arrayList3 = new ArrayList();
                    String strZo = GradleTools.Zo(str);
                    for (BuildGradle.Dependency dependency2 : new BuildGradle().getConfiguration(strZo).dependencies) {
                        if (dependency2 instanceof BuildGradle.MavenDependency) {
                            BuildGradle.MavenDependency mavenDependency2 = (BuildGradle.MavenDependency) dependency2;
                            if (!ServiceContainer.getMavenService().existsLocalMavenCache(getFlatRepositoryPathMap(str), mavenDependency2)) {
                                SyntaxError syntaxError3 = new SyntaxError();
                                syntaxError3.jw = mavenDependency2.line;
                                syntaxError3.fY = 1;
                                syntaxError3.qp = mavenDependency2.line;
                                syntaxError3.k2 = 1000;
                                syntaxError3.zh = "Dependency '" + mavenDependency2.coords + "' not found";
                                arrayList3.add(syntaxError3);
                            }
                        }
                        if (dependency2 instanceof BuildGradle.FilesDependency) {
                            BuildGradle.FilesDependency filesDependency = (BuildGradle.FilesDependency) dependency2;
                            if (!FileSystem.exists(filesDependency.getFilesPath(str))) {
                                SyntaxError syntaxError4 = new SyntaxError();
                                syntaxError4.jw = filesDependency.line;
                                syntaxError4.fY = 1;
                                syntaxError4.qp = filesDependency.line;
                                syntaxError4.k2 = 1000;
                                syntaxError4.zh = "File dependency '" + filesDependency.filesPath + "' not found";
                                arrayList3.add(syntaxError4);
                            }
                        }
                        if (dependency2 instanceof BuildGradle.ProjectDependency) {
                            BuildGradle.ProjectDependency projectDependency = (BuildGradle.ProjectDependency) dependency2;
                            if (!GradleTools.isGradleProject(projectDependency.getProjectDependencyPath(str, new BuildGradleExt().getConfiguration(GradleTools.getSettingsGradlePath(str))))) {
                                SyntaxError syntaxError5 = new SyntaxError();
                                syntaxError5.jw = projectDependency.line;
                                syntaxError5.fY = 1;
                                syntaxError5.qp = projectDependency.line;
                                syntaxError5.k2 = 1000;
                                syntaxError5.zh = "Project dependency '" + projectDependency.projectName + "' not found";
                                arrayList3.add(syntaxError5);
                            }
                        }
                        if (dependency2 instanceof BuildGradle.l) {
                            SyntaxError syntaxError6 = new SyntaxError();
                            syntaxError6.jw = dependency2.line;
                            syntaxError6.fY = 1;
                            syntaxError6.qp = dependency2.line;
                            syntaxError6.k2 = 1000;
                            syntaxError6.zh = "Unknown dependency";
                            arrayList3.add(syntaxError6);
                        }
                    }
                    if (arrayList3.size() > 0) {
                        map.put(strZo, arrayList3);
                    }
                }
            }
            ServiceContainer.J0().EQ("Gradle", map);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2116988425167894429L, null);
            }
            throw th;
        }
    }

    @ey(method = 4146112386852922605L)
    public static List<String> yO(String str, String str2, String str3) {
        try {
            if (j6) {
                iy.we(-7766124646813522935L, null, str, str2, str3);
            }
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = xd.FH(str, ServiceContainer.getProjectService().getLibraryMapping()).iterator();
            while (it.hasNext()) {
                arrayList.addAll(GradleTools.FH(it.next(), ProjectService.KD(str2), str3));
            }
            return arrayList;
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, -7766124646813522935L, null, str, str2, str3);
            }
            throw th;
        }
    }

    @ey(method = 273686225634606265L)
    public static String ye(String str, String str2) {
        try {
            if (j6) {
                iy.EQ(-8032570443738111795L, null, str, str2);
            }
            return GradleTools.a8(str, str2);
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -8032570443738111795L, null, str, str2);
            }
            throw th;
        }
    }

    @ey(method = 556647552724116875L)
    public static String[] zh(String str) {
        try {
            if (j6) {
                iy.tp(-1683925498489752905L, null, str);
            }
            HashMap map = new HashMap();
            List<ClassPath.Entry> listWc = wc(str, null);
            if (listWc != null) {
                for (ClassPath.Entry entry : listWc) {
                    if (entry.isLibKind() && !map.containsKey(entry.j6())) {
                        map.put(entry.j6(), entry.VH(str));
                    }
                }
            }
            String[] strArr = new String[map.size()];
            map.values().toArray(strArr);
            return strArr;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1683925498489752905L, null, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 2944843072371353640L)
    public boolean FH(String str) {
        try {
            if (j6) {
                iy.tp(-6392146546224895288L, this, str);
            }
            String currentAppHome = ServiceContainer.getProjectService().getCurrentAppHome();
            if (!str.toLowerCase().endsWith(".jar") || fN(currentAppHome, str)) {
                if (GradleTools.nw(str) && !currentAppHome.equals(str)) {
                    if (!Gj(str)) {
                    }
                }
                return false;
            }
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -6392146546224895288L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -348867141688692120L)
    public boolean Hw() {
        try {
            if (j6) {
                iy.gn(3522266770337160L, this);
            }
            return g3();
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3522266770337160L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -385330199031771360L)
    public void J0(String str) {
        try {
            if (j6) {
                iy.tp(252246673454282928L, this, str);
            }
            String currentAppHome = ServiceContainer.getProjectService().getCurrentAppHome();
            if (GradleTools.isGradleProject(currentAppHome)) {
                return;
            }
            if (!str.toLowerCase().endsWith(".jar")) {
                if (FileSystem.exists(GradleTools.getProjectProperties(currentAppHome))) {
                    AndroidProprieties.Zo(GradleTools.getProjectProperties(currentAppHome), currentAppHome, str);
                    return;
                }
                return;
            }
            List<ClassPath.Entry> listWc = wc(currentAppHome, null);
            Iterator<ClassPath.Entry> it = listWc.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ClassPath.Entry next = it.next();
                if (next.isLibKind() && next.VH(currentAppHome).equals(str)) {
                    listWc.remove(next);
                    break;
                }
            }
            ClassPath.Hw(GradleTools.gn(currentAppHome), listWc);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 252246673454282928L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -3946108193930217552L)
    public boolean J8() {
        try {
            if (j6) {
                iy.gn(-1361070734312021504L, this);
            }
            if (ServiceContainer.getProjectService().isOpenProject() && eU()) {
                return !getProjectPackageName(ServiceContainer.getProjectService().getCurrentAppHome(), null).contains(".mycompany.");
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1361070734312021504L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 298364207089529781L)
    public void Mr() {
        try {
            if (j6) {
                iy.gn(-483366452293175807L, this);
            }
            ServiceContainer.getLicenseService().cn(ServiceContainer.getMainActivity(), u.shop_feature_premium_projects, "large_project");
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -483366452293175807L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 2359478953402478248L)
    public void P8(String str, String str2) {
        try {
            if (j6) {
                iy.EQ(-3173394997653941304L, this, str, str2);
            }
            if (ServiceContainer.KD(u.dialog_add_to_project_existing_jar_file, new Object[0]).equals(str2)) {
                ServiceContainer.getMainActivity().k2();
                MessageBox.ei(ServiceContainer.getMainActivity(), ServiceContainer.KD(u.dialog_add_to_project_existing_jar_file, new Object[0]), ServiceContainer.KD(u.dialog_add_to_project_existing_jar_file_message, new Object[0]), null);
                return;
            }
            if (ServiceContainer.KD(u.dialog_add_to_project_new_library_project, new Object[0]).endsWith(str2)) {
                Sf(str);
                return;
            }
            if (ServiceContainer.KD(u.dialog_add_to_project_existing_library_project, new Object[0]).endsWith(str2)) {
                ServiceContainer.getMainActivity().k2();
                MessageBox.ei(ServiceContainer.getMainActivity(), ServiceContainer.KD(u.dialog_add_to_project_existing_library_project, new Object[0]), ServiceContainer.KD(u.dialog_add_to_project_existing_library_project_message, new Object[0]), null);
            } else if (ServiceContainer.KD(u.dialog_add_to_project_new_product_flavor, new Object[0]).endsWith(str2)) {
                ef(str);
            } else {
                MessageBox.rN(ServiceContainer.getMainActivity(), ServiceContainer.KD(u.dialog_add_to_project_new_library, new Object[0]), ServiceContainer.KD(u.dialog_add_to_project_new_library_message, str2), new b(str, str2), null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -3173394997653941304L, this, str, str2);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -4020662385954533304L)
    public void SI(String str, ValueRunnable<String> valueRunnable) {
        try {
            if (j6) {
                iy.EQ(3372967256320292616L, this, str, valueRunnable);
            }
            be.DW(str, valueRunnable);
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 3372967256320292616L, this, str, valueRunnable);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -84795245711833140L)
    public void U2(String str, Map<String, List<String>> map, List<String> list) {
        try {
            if (j6) {
                iy.we(256350188746024212L, this, str, map, list);
            }
            ServiceContainer.getMavenService().resetDepMap();
            ca(str, new HashSet<>());
            list.add(str);
            pN(str, map, list);
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, 256350188746024212L, this, str, map, list);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 1000208939425780500L)
    public TemplateService.TemplateGroup[] VH() {
        try {
            if (j6) {
                iy.gn(3245968583050305772L, this);
            }
            TemplateService.Template template = new TemplateService.Template(this, 1, "Android App", "Gradle/Android SDK/Java/Xml", "MyApp", true, false, "com.aide.ui", "ANDROID", "course_android", ServiceContainer.ca() || ServiceContainer.P8.equals("com.aide.ui"));
            new TemplateService.Template(this, 1, "Android App", "Eclipse/Android SDK/Java/Xml", "MyApp", true, false, "com.aide.ui", "ANDROID", "course_android", ServiceContainer.ca() || ServiceContainer.P8.equals("com.aide.ui"));
            new TemplateService.Template(this, 1, "Wearable App", "Gradle/Android SDK/Java/Xml", "MyWearApp", true, false, "com.aide.ui", "ANDROID", "course_wear", ServiceContainer.ca() || ServiceContainer.P8.equals("com.aide.ui"));
            TemplateService.Template template2 = new TemplateService.Template(this, 2, "Mobile Game", "libGDX/Java", "MyGame", true, false, "com.aide.ui", "GAME", "course_game", ServiceContainer.ca() || ServiceContainer.P8.equals("com.aide.ui"));
            TemplateService.Template template3 = new TemplateService.Template(this, 4, "Native Android App", "Android NDK/C/Java/Xml", "MyNDKApp", true, false, "com.aide.ui", "ANDROID_NATIVE", "course_ndk", ServiceContainer.ca() || ServiceContainer.P8.equals("com.aide.ui"));
            TemplateService.Template template4 = new TemplateService.Template(this, 5, "PhoneGap App", "PhoneGap/Html/Css/JavaScript", "MyPhoneGapApp", true, false, "com.aide.phonegap", "PHONEGAP", null, ServiceContainer.ca() || ServiceContainer.P8.equals("com.aide.phonegap"));
            new TemplateService.Template(this, 6, "Hybrid App", "Html/Css/JavaScript + Java/Xml", "MyHybridApp", true, false, "com.aide.phonegap", "PHONEGAP_PLUGIN", null, ServiceContainer.ca() || ServiceContainer.P8.equals("com.aide.phonegap"));
            return new TemplateService.TemplateGroup[]{new TemplateService.TemplateGroup("Android App", template, 2131165304, "GradleApp.zip", new String[]{"main.xml", "MainActivity.java"}, "app"), new TemplateService.TemplateGroup("Mobile Game", template2, R$drawable.ic_launcher_game, "course_game_libgdx_project.zip", new String[]{"MyGdxGame.java"}, "gdx-game-android"), new TemplateService.TemplateGroup("Native Android App", template3, 2131165304, "JniHelloWorld.zip", new String[]{"HelloJni.java", "hello-jni.c"}, null), new TemplateService.TemplateGroup("PhoneGap App", template4, R$drawable.ic_launcher_phonegap, "PhoneGapAppNew.zip", new String[]{"index.html", "index.js", "index.css"}, "app")};
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3245968583050305772L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 4164345321151469685L)
    public List<c.C0094c> XL() {
        try {
            if (j6) {
                iy.gn(1476680708902233681L, this);
            }
            return Arrays.asList(new c.C0094c("course_android", 30, new String[]{"com.aide.ui"}), new c.C0094c("course_game", 31, new String[]{"com.aide.ui"}), new c.C0094c("course_ndk", 33, new String[]{"com.aide.ui"}));
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1476680708902233681L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 7135889418647944543L)
    public boolean Zo(String str) {
        try {
            if (j6) {
                iy.tp(-5042333492534327165L, this, str);
            }
            return be.j6(str);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -5042333492534327165L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -3902355737868053020L)
    public boolean a8(String str) {
        try {
            if (j6) {
                iy.tp(-1637568905956236372L, this, str);
            }
            if (!Gj(str)) {
                if (!fN(ServiceContainer.getProjectService().getCurrentAppHome(), str)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1637568905956236372L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -4712531685569747360L)
    public boolean aM(String str) {
        try {
            if (j6) {
                iy.tp(-3558432115583005200L, this, str);
            }
            Map<String, List<String>> libraryMapping = ServiceContainer.getProjectService().getLibraryMapping();
            Iterator<String> it = libraryMapping.keySet().iterator();
            while (it.hasNext()) {
                if (FileSystem.nw(it.next(), str)) {
                    return true;
                }
            }
            for (String str2 : aj(libraryMapping, ServiceContainer.getProjectService().getBuildVariant())) {
                if (FileSystem.nw(str2, str)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -3558432115583005200L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 748461664880452131L)
    public void buildProject(boolean z) {
        try {
            if (j6) {
                iy.Ws(-1390059560095506441L, this, z);
            }
            BuildServiceCollect.androidProjectBuildService.ca(z, ServiceContainer.getProjectService().er(), ServiceContainer.getProjectService().getBuildVariant());
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1390059560095506441L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 327571111852695289L)
    public void cn(List<String> list, boolean z) {
        boolean z2;
        try {
            if (j6) {
                iy.EQ(-5409954152272182795L, this, list, new Boolean(z));
            }
            ArrayList arrayList = null;
            boolean z3 = false;
            if (list == null) {
                z2 = true;
            } else {
                arrayList = new ArrayList();
                z2 = false;
                for (String str : list) {
                    if (pO(str)) {
                        z3 = true;
                    } else {
                        if (Jl(str)) {
                            arrayList.add(str);
                        } else if (Cz(str)) {
                        }
                        z2 = true;
                    }
                }
            }
            if (!z3) {
                if (z2) {
                    BuildServiceCollect.androidProjectBuildService.yO(true, arrayList);
                }
            } else if (z) {
                ServiceContainer.getProjectService().reloadingProject();
            } else {
                ServiceContainer.getProjectService().wc();
                BuildServiceCollect.androidProjectBuildService.yO(true, arrayList);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -5409954152272182795L, this, list, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 2715029276868766539L)
    public void ei(String str) {
        try {
            if (j6) {
                iy.tp(3316848578539587887L, this, str);
            }
            if ((ServiceContainer.ca() || ServiceContainer.P8.equals("com.aide.phonegap")) && str.toLowerCase().endsWith(".html")) {
                PhonegapDesignActivity.FH(ServiceContainer.getMainActivity(), FileSystem.Ws(str, "www"), str);
                return;
            }
            if ((ServiceContainer.ca() || ServiceContainer.P8.equals("com.aide.ui")) && str.toLowerCase().endsWith(".xml")) {
                boolean z = true;
                if (!ServiceContainer.isTrainerMode()) {
                    MainActivity mainActivity = ServiceContainer.getMainActivity();
                    String strU2 = ServiceContainer.U2();
                    if (ServiceContainer.getLicenseService().Mr()) {
                        z = false;
                    }
                    XmlLayoutDesignActivity.sG(mainActivity, strU2, str, z, false);
                    return;
                }
                c.b bVarJ3 = ServiceContainer.ro().j3();
                XmlLayoutDesignActivity.Sf(ServiceContainer.getMainActivity(), ServiceContainer.U2(), str, 13, bVarJ3.XL(), ServiceContainer.ro().Mr().VH(), ServiceContainer.ro().Mr().FH(), ServiceContainer.ro().vy(), ServiceContainer.ro().a8(), ServiceContainer.ro().er(), ServiceContainer.ro().Mr().QX() && AppPreferences.Ws(), AppPreferences.J8());
            }
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 3316848578539587887L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 1143014891320374996L)
    public boolean gW() {
        try {
            if (!j6) {
                return true;
            }
            iy.gn(35469866012275644L, this);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 35469866012275644L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -4120169078278274105L)
    public int getOpenProjectNameStringId(String str) {
        try {
            if (j6) {
                iy.tp(-3044075985756270237L, this, str);
            }
            return GradleTools.cb(str) ? u.command_files_open_phonegap_project : u.command_files_open_android_project;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -3044075985756270237L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -2449996393780020624L)
    public List<String> getProductFlavors(String str) {
        try {
            if (j6) {
                iy.tp(-880667221285324800L, this, str);
            }
            if (GradleTools.isAndroidProject(str)) {
                return GradleTools.tp(str);
            }
            if (!GradleTools.isGradleProject(str)) {
                return null;
            }
            ArrayList arrayList = new ArrayList(new BuildGradle().getConfiguration(GradleTools.Zo(str)).productFlavorMap.keySet());
            if (arrayList.size() > 0) {
                return arrayList;
            }
            return null;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -880667221285324800L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -349461011424798063L)
    public String getProjectAttributeHtmlString() {
        try {
            if (j6) {
                iy.gn(538376332193594405L, this);
            }
            List<String> listP8 = ServiceContainer.getProjectService().P8();
            List<String> listYS = ServiceContainer.getProjectService().yS();
            String str = "";
            for (String str2 : listP8) {
                if (!str2.endsWith(".aar")) {
                    String str3 = (listYS.contains(str2) ? str + "<b>App " + str2 + "</b><br/><br/>" : str + "<b>Library " + str2 + "</b><br/><br/>") + "<i>Library Projects:</i><br/><br/>";
                    String[] strArrCn = ServiceContainer.getProjectService().cn(str2);
                    boolean z = false;
                    for (String str4 : strArrCn) {
                        if (!str4.endsWith(".aar")) {
                            if (!FileSystem.exists(str4)) {
                                str3 = str3 + "(NOT FOUND) ";
                            }
                            str3 = str3 + str4 + "<br/><br/>";
                            z = true;
                        }
                    }
                    if (!z) {
                        str3 = str3 + "&lt;none&gt;<br/><br/>";
                    }
                    String str5 = str3 + "<i>Libraries:</i><br/><br/>";
                    String[] strArrZh = zh(str2);
                    int length = strArrZh.length;
                    int i = 0;
                    boolean z2 = false;
                    while (i < length) {
                        String str6 = strArrZh[i];
                        if (!FileSystem.exists(str6)) {
                            str5 = str5 + "(NOT FOUND) ";
                        }
                        str5 = str5 + str6 + "<br/><br/>";
                        i++;
                        z2 = true;
                    }
                    for (String str7 : strArrCn) {
                        if (str7.endsWith(".aar")) {
                            if (!FileSystem.exists(str7)) {
                                str5 = str5 + "(NOT FOUND) ";
                            }
                            if (str7.endsWith(".exploded.aar")) {
                                str7 = str7.substring(0, str7.length() - 13) + ".aar";
                            }
                            str5 = str5 + str7 + "<br/><br/>";
                            z2 = true;
                        }
                    }
                    if (!z2) {
                        str5 = str5 + "&lt;none&gt;<br/><br/>";
                    }
                    str = str5 + "<br/>";
                }
            }
            return str;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 538376332193594405L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 331752059875429635L)
    public void gn() {
        try {
            if (j6) {
                iy.gn(-466267520924526753L, this);
            }
            if ((ServiceContainer.P8.equals("com.aide.phonegap") || !(ServiceContainer.getLicenseService().QX() || ServiceContainer.getLicenseService().Ws() || AndroidHelper.er())) && sE(ServiceContainer.getContext(), ServiceContainer.getProjectService().getCurrentAppHome(), null)) {
                ServiceContainer.getMainActivity().sM(ServiceContainer.KD(u.dialog_community_rate_title, new Object[0]), ServiceContainer.KD(u.dialog_community_rate_app_message, new Object[0]), null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -466267520924526753L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 186044112001938135L)
    public boolean isPremium() {
        try {
            if (j6) {
                iy.gn(-605134159755959485L, this);
            }
            if (ServiceContainer.P8.equals("com.aide.phonegap") || ServiceContainer.ca() || ServiceContainer.getLicenseService().Ws()) {
                return false;
            }
            return eU();
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -605134159755959485L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 101969433209361069L)
    public boolean isSupport(String str) {
        try {
            if (j6) {
                iy.tp(304702087366185297L, this, str);
            }
            return iW(str);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 304702087366185297L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 1812571651228730475L)
    public boolean j3(String str) {
        try {
            if (j6) {
                iy.tp(3132888485110851735L, this, str);
            }
            if (ServiceContainer.ca() || ServiceContainer.P8.equals("com.aide.ui")) {
                return true;
            }
            if (ServiceContainer.P8.equals("com.aide.phonegap")) {
                return sg(str);
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 3132888485110851735L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -38716668001295600L)
    public void j6() {
        try {
            if (j6) {
                iy.gn(-6178928680579029120L, this);
            }
            if (ServiceContainer.getLicenseService().VH(ServiceContainer.gn(), "export_apk")) {
                ServiceContainer.getOpenFileService().KD(false, false);
                List<String> listAM = ServiceContainer.getProjectService().aM();
                if (listAM == null) {
                    MessageBox.gW(ServiceContainer.getMainActivity(), new ld(null));
                    return;
                }
                ArrayList arrayList = new ArrayList(listAM);
                arrayList.add(0, "main");
                MessageBox.VH(ServiceContainer.getMainActivity(), "Choose Flavor", arrayList, new e(this));
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -6178928680579029120L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -1416929137452415664L)
    public boolean lg() {
        try {
            if (j6) {
                iy.gn(-3906025038095433120L, this);
            }
            return GradleTools.nw(ServiceContainer.getProjectService().getCurrentAppHome());
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -3906025038095433120L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -63606293710927935L)
    public EngineSolution makeEngineSolution() {
        try {
            if (j6) {
                iy.gn(6581359833217148805L, this);
            }
            return MakeAndroidEngineSolution.FH();
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 6581359833217148805L, this);
            }
            throw th;
        }
    }

    @ey(method = -525238425658528288L)
    public int mb() {
        try {
            if (j6) {
                iy.gn(809383447001400528L, this);
            }
            return ServiceContainer.getMainActivity().Sf() <= 103 ? 25 : 5;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 809383447001400528L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 4436825800335049836L)
    public void nw(String str) {
        try {
            if (j6) {
                iy.tp(4415309393941823348L, this, str);
            }
            String currentAppHome = ServiceContainer.getProjectService().getCurrentAppHome();
            if (GradleTools.isGradleProject(currentAppHome)) {
                if (str.toLowerCase().endsWith(".jar")) {
                    return;
                }
                new BuildGradle().getConfiguration(GradleTools.Zo(currentAppHome)).addProjectDependency(str);
                ServiceContainer.getProjectService().reloadingProject();
                Toast.makeText(ServiceContainer.getMainActivity(), "Library has been added", 0).show();
                return;
            }
            if (!str.toLowerCase().endsWith(".jar")) {
                AndroidProprieties.FH(GradleTools.getProjectProperties(currentAppHome), currentAppHome, str);
                return;
            }
            List<ClassPath.Entry> listWc = wc(currentAppHome, null);
            listWc.add(new ClassPath.Entry("lib", FileSystem.lp(currentAppHome, str), false));
            ClassPath.Hw(GradleTools.gn(currentAppHome), listWc);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 4415309393941823348L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 2323217503012462848L)
    public List<BuildGradle.MavenDependency> qp() {
        try {
            if (j6) {
                iy.gn(-3453035255653609696L, this);
            }
            ArrayList arrayList = new ArrayList();
            for (String str : ServiceContainer.getProjectService().getLibraryMapping().keySet()) {
                if (GradleTools.isGradleProject(str)) {
                    for (BuildGradle.Dependency dependency : getProjectMavenDependencyList(str)) {
                        if (dependency instanceof BuildGradle.MavenDependency) {
                            Iterator<BuildGradle.MavenDependency> it = ServiceContainer.getMavenService().getNotExistsLocalCache(getFlatRepositoryPathMap(str), (BuildGradle.MavenDependency) dependency).iterator();
                            while (it.hasNext()) {
                                arrayList.add(it.next());
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -3453035255653609696L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 161298056877423871L)
    public int rN(String str) {
        try {
            if (j6) {
                iy.tp(3162817633458367555L, this, str);
            }
            return be.Hw(str);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 3162817633458367555L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -217633008777316740L)
    public List<String> ro(String str) {
        try {
            if (j6) {
                iy.tp(-3589643529546906700L, this, str);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(ServiceContainer.KD(u.dialog_add_to_project_existing_library_project, new Object[0]));
            arrayList.add(ServiceContainer.KD(u.dialog_add_to_project_existing_jar_file, new Object[0]));
            if (GradleTools.isGradleProject(str)) {
                arrayList.add(ServiceContainer.KD(u.dialog_add_to_project_new_library_project, new Object[0]));
                arrayList.add(ServiceContainer.KD(u.dialog_add_to_project_new_product_flavor, new Object[0]));
                arrayList.addAll(ExtendLibraries.j6());
            }
            return arrayList;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -3589643529546906700L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 79777320595557821L)
    public String sh(String str) {
        try {
            if (j6) {
                iy.tp(47357686918402345L, this, str);
            }
            String[] strArrAj = aj(ServiceContainer.getProjectService().getLibraryMapping(), ServiceContainer.getProjectService().getBuildVariant());
            if (!str.startsWith("/")) {
                str = "/" + str;
            }
            for (String str2 : strArrAj) {
                String str3 = str2 + str;
                if (FileSystem.exists(str3)) {
                    return str3;
                }
            }
            return null;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 47357686918402345L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -3181768532406319695L)
    public String tp(String str) {
        try {
            if (j6) {
                iy.tp(-724229644800263275L, this, str);
            }
            if (ServiceContainer.ca()) {
                return null;
            }
            if (!j3(str)) {
                return sg(str) ? "com.aide.phonegap" : "com.aide.ui";
            }
            if (ServiceContainer.P8.equals("com.aide.ui") && sg(str)) {
                return "com.aide.phonegap";
            }
            return null;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -724229644800263275L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 5341180985485387649L)
    public boolean u7(String str) {
        try {
            if (j6) {
                iy.tp(2464040403881543541L, this, str);
            }
            return ((ServiceContainer.ca() || ServiceContainer.P8.equals("com.aide.phonegap")) && str.toLowerCase().endsWith(".html")) ? FileSystem.Ws(str, "www") != null : (ServiceContainer.ca() || ServiceContainer.P8.equals("com.aide.ui")) && str.toLowerCase().endsWith(".xml") && FileSystem.getName(FileSystem.getParent(str)).startsWith("layout") && FileSystem.Ws(str, "res") != null;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 2464040403881543541L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 91771761754253305L)
    public String v5(String str) {
        try {
            if (j6) {
                iy.tp(5793691505508976797L, this, str);
            }
            String strEv = Ev(ServiceContainer.getProjectService().getLibraryMapping(), ServiceContainer.getProjectService().getBuildVariant(), FileSystem.getParent(str));
            if (strEv == null) {
                return str;
            }
            return strEv.replace('.', '/') + "/" + FileSystem.getName(str);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 5793691505508976797L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -37838271294969093L)
    public boolean vy(String str) {
        try {
            if (j6) {
                iy.tp(882468121244024023L, this, str);
            }
            return GradleTools.sh(str);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 882468121244024023L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 3519144431017426760L)
    public int we(String str) {
        try {
            if (j6) {
                iy.tp(-3707665909519997240L, this, str);
            }
            return be.FH(str);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -3707665909519997240L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 200421073141268815L)
    public String yS() {
        try {
            if (j6) {
                iy.gn(-8093949261440340237L, this);
            }
            return getProjectPackageName(ServiceContainer.getProjectService().getCurrentAppHome(), ServiceContainer.getProjectService().getBuildVariant());
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -8093949261440340237L, this);
            }
            throw th;
        }
    }
}
