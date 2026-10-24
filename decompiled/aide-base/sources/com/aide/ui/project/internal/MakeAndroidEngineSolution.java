package com.aide.ui.project.internal;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import abcd.xd;
import com.aide.engine.EngineSolution;
import com.aide.engine.EngineSolutionProject;
import com.aide.engine.service.CodeModelFactory;
import com.aide.ui.ServiceContainer;
import com.aide.ui.build.android.m;
import com.aide.ui.project.AndroidProjectSupport;
import com.aide.ui.util.ClassPath;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@cy(clazz = 3621191911973819936L, container = 3621191911973819936L, user = true)
/* loaded from: classes.dex */
public class MakeAndroidEngineSolution {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(MakeAndroidEngineSolution.class);
    }

    @ey(method = 1695589189065787203L)
    public MakeAndroidEngineSolution() {
        try {
            if (j6) {
                iy.gn(-2438160249381124352L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2438160249381124352L, null);
            }
            throw th;
        }
    }

    @ey(method = -2676547709069961552L)
    private static void DW(List<EngineSolutionProject> list, String str, String str2, boolean z, boolean z2, Map<String, List<String>> map, Set<String> set) throws Throwable {
        int i;
        try {
            if (j6) {
                iy.QX(-3554198068494221568L, null, new Object[]{list, str, str2, new Boolean(z), new Boolean(z2), map, set});
            }
            if (set.contains(str)) {
                return;
            }
            set.add(str);
            List<ClassPath.Entry> listWc = AndroidProjectSupport.wc(str, str2);
            list.add(Zo(str, str2, z, z2, listWc, map));
            for (ClassPath.Entry entry : listWc) {
                if (entry.isLibKind()) {
                    Iterator<EngineSolutionProject> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().projectName.equals(entry.j6())) {
                                break;
                            }
                        } else {
                            list.add(v5(str, str2, entry, listWc, map));
                            break;
                        }
                    }
                }
            }
            Iterator<String> it2 = map.get(str).iterator();
            while (it2.hasNext()) {
                i = 7;
                try {
                    DW(list, it2.next(), str2, z, true, map, set);
                } catch (Throwable th) {
                    th = th;
                    if (DW) {
                        Object[] objArr = new Object[i];
                        objArr[0] = list;
                        objArr[1] = str;
                        objArr[2] = str2;
                        objArr[3] = new Boolean(z);
                        objArr[4] = new Boolean(z2);
                        objArr[5] = map;
                        objArr[6] = set;
                        iy.rN(th, -3554198068494221568L, null, objArr);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            i = 7;
        }
    }

    @ey(method = 126171699409566249L)
    public static EngineSolution FH() {
        try {
            if (j6) {
                iy.gn(-5580568196744417025L, null);
            }
            String androidJarPath = ServiceContainer.getProjectService().getAndroidJarPath();
            String annotationsJarPath = ServiceContainer.getAssetInstallationService().getAnnotationsJarPath();
            String javaScriptAPIJsPath = ServiceContainer.getAssetInstallationService().getJavaScriptAPIJsPath();
            String buildVariant = ServiceContainer.getProjectService().getBuildVariant();
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (String str : ServiceContainer.getProjectService().yS()) {
                boolean zCb = z | GradleTools.cb(str);
                DW(arrayList, str, buildVariant, zCb, false, ServiceContainer.getProjectService().vy(str), new HashSet());
                z = zCb;
            }
            if (z) {
                arrayList.add(Hw(javaScriptAPIJsPath));
            }
            arrayList.add(j6(androidJarPath, annotationsJarPath));
            return new EngineSolution(arrayList, null, CodeModelFactory.j6(ServiceContainer.Hw()), ServiceContainer.Hw());
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -5580568196744417025L, null);
            }
            throw th;
        }
    }

    @ey(method = -3714556254163433055L)
    private static EngineSolutionProject Hw(String str) {
        try {
            if (j6) {
                iy.tp(2315542744651891555L, null, str);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new EngineSolution.File(str, "JavaScript", null, false, false));
            ArrayList arrayList2 = new ArrayList();
            new ArrayList();
            return new EngineSolutionProject(str, str, str, arrayList, arrayList2, false, "", "", "", "1.5", false, false, false, false, "", new ArrayList(), new ArrayList(), new ArrayList());
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 2315542744651891555L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 1539091646013646824L)
    private static void VH(List<String> list, String str, List<String> list2) {
        try {
            if (j6) {
                iy.we(540066970947011808L, null, list, str, list2);
            }
            for (String str2 : list) {
                if (!list2.contains(str2)) {
                    list2.add(str2);
                }
                for (ClassPath.Entry entry : AndroidProjectSupport.wc(str2, str)) {
                    if (entry.isLibKind()) {
                        list2.add(entry.j6());
                    }
                }
            }
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, 540066970947011808L, null, list, str, list2);
            }
            throw th;
        }
    }

    @ey(method = -5249429752637630560L)
    private static EngineSolutionProject Zo(String str, String str2, boolean z, boolean z2, List<ClassPath.Entry> list, Map<String, List<String>> map) throws Throwable {
        char c;
        char c2;
        try {
            if (j6) {
                iy.QX(1094244564721379448L, null, new Object[]{str, str2, new Boolean(z), new Boolean(z2), list, map});
            }
            ArrayList arrayList = new ArrayList();
            for (ClassPath.Entry entry : list) {
                if (entry.isSrcKind()) {
                    String strVH = entry.VH(str);
                    arrayList.add(new EngineSolution.File(strVH, "Java", null, false, false));
                    arrayList.add(new EngineSolution.File(strVH, "AIDL", null, false, false));
                }
            }
            arrayList.add(new EngineSolution.File(GradleTools.a8(str, str2), "XML", null, false, false));
            String strWe = GradleTools.we(str, str2);
            if (strWe != null) {
                arrayList.add(new EngineSolution.File(strWe, "XML", null, false, false));
            }
            if (GradleTools.isGradleProject(str)) {
                arrayList.add(new EngineSolution.File(GradleTools.Zo(str), "C++", null, false, false));
            }
            String strJ0 = GradleTools.J0(str, str2);
            if (strJ0 != null) {
                arrayList.add(new EngineSolution.File(strJ0, "XML", null, false, false));
            }
            arrayList.add(new EngineSolution.File(GradleTools.yS(str), "XML", null, false, false));
            if (GradleTools.sh(str) && m.Mr()) {
                arrayList.add(new EngineSolution.File(GradleTools.getCppSourcePath(str), "C++", null, false, false));
            }
            if (z) {
                arrayList.add(new EngineSolution.File(GradleTools.rN(str), "Css", null, false, false));
                arrayList.add(new EngineSolution.File(GradleTools.rN(str), "HTML", null, false, false));
                arrayList.add(new EngineSolution.File(GradleTools.rN(str), "JavaScript", null, false, false));
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(str);
            for (ClassPath.Entry entry2 : list) {
                if (entry2.isLibKind()) {
                    arrayList2.add(entry2.j6());
                }
                if (entry2.isConKind()) {
                    arrayList2.add("android.jar");
                }
            }
            ArrayList arrayList3 = new ArrayList();
            VH(xd.FH(str, map), str2, arrayList3);
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList2.add((String) it.next());
            }
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            c = 0;
            c2 = 1;
            try {
                return new EngineSolutionProject(str, str, str, arrayList, arrayList2, !GradleTools.isAarEexplodedPath(str), "", AndroidProjectSupport.et(str, true), AndroidProjectSupport.et(str, false), "1.5", false, false, false, z2, "", arrayList5, arrayList4, arrayList6);
            } catch (Throwable th) {
                th = th;
                if (DW) {
                    Object[] objArr = new Object[6];
                    objArr[c] = str;
                    objArr[c2] = str2;
                    objArr[2] = new Boolean(z);
                    objArr[3] = new Boolean(z2);
                    objArr[4] = list;
                    objArr[5] = map;
                    iy.rN(th, 1094244564721379448L, null, objArr);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c = 0;
            c2 = 1;
        }
    }

    @ey(method = 3109089693407867040L)
    private static EngineSolutionProject j6(String str, String str2) {
        try {
            if (j6) {
                iy.EQ(-2497962023073758880L, null, str, str2);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new EngineSolution.File(str, "Java Binary", "", false, true));
            arrayList.add(new EngineSolution.File(str2, "Java Binary", "", false, true));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("android.jar");
            return new EngineSolutionProject("android.jar", str, "android.jar", arrayList, arrayList2, false, "", "", "", "", false, false, false, false, "", new ArrayList(), new ArrayList(), new ArrayList());
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -2497962023073758880L, null, str, str2);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00f0  */
    @abcd.ey(method = 1488255826601032644L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.aide.engine.EngineSolutionProject v5(java.lang.String r29, java.lang.String r30, com.aide.ui.util.ClassPath.Entry r31, java.util.List<com.aide.ui.util.ClassPath.Entry> r32, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.ui.project.internal.MakeAndroidEngineSolution.v5(java.lang.String, java.lang.String, com.aide.ui.util.ClassPath$Entry, java.util.List, java.util.Map):com.aide.engine.EngineSolutionProject");
    }
}
