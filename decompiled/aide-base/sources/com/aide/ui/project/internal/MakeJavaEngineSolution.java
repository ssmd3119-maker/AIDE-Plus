package com.aide.ui.project.internal;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.engine.EngineSolution;
import com.aide.engine.EngineSolutionProject;
import com.aide.engine.service.CodeModelFactory;
import com.aide.ui.ServiceContainer;
import com.aide.ui.project.JavaProjectSupport;
import com.aide.ui.util.ClassPath;
import java.util.ArrayList;
import java.util.List;

@cy(clazz = -4394549883377777704L, container = -4394549883377777704L, user = true)
/* loaded from: classes.dex */
public class MakeJavaEngineSolution {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(MakeJavaEngineSolution.class);
    }

    @ey(method = -558593802566860155L)
    public MakeJavaEngineSolution() {
        try {
            if (j6) {
                iy.gn(1460594642748721585L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1460594642748721585L, null);
            }
            throw th;
        }
    }

    @ey(method = -1082847284246570932L)
    public static EngineSolution DW(String str, String str2, String str3) {
        try {
            if (j6) {
                iy.we(-1244178325034415056L, null, str, str2, str3);
            }
            List<ClassPath.Entry> list = new ClassPath().getConfiguration(JavaProjectSupport.g3(str)).Zo;
            ArrayList arrayList = new ArrayList();
            arrayList.add(Hw(str, list));
            if (str3 != null) {
                arrayList.add(v5(str3));
            } else {
                arrayList.add(j6(str2));
            }
            for (ClassPath.Entry entry : list) {
                if (entry.isLibKind()) {
                    arrayList.add(FH(str, entry, list));
                }
            }
            return new EngineSolution(arrayList, null, CodeModelFactory.j6(ServiceContainer.Hw()), ServiceContainer.Hw());
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, -1244178325034415056L, null, str, str2, str3);
            }
            throw th;
        }
    }

    @ey(method = -473455229547295769L)
    private static EngineSolutionProject FH(String str, ClassPath.Entry entry, List<ClassPath.Entry> list) throws Throwable {
        try {
            if (j6) {
                iy.we(-1398846390683987085L, null, str, entry, list);
            }
            ArrayList arrayList = new ArrayList();
            try {
                String strVH = entry.VH(str);
                arrayList.add(new EngineSolution.File(strVH, "Java Binary", "", false, true));
                ArrayList arrayList2 = new ArrayList();
                for (ClassPath.Entry entry2 : list) {
                    if (entry2.isLibKind()) {
                        arrayList2.add(entry2.j6());
                    }
                }
                arrayList2.add("rt.jar");
                ArrayList arrayList3 = new ArrayList();
                return new EngineSolutionProject(entry.j6(), strVH, strVH, arrayList, arrayList2, false, "", "", "", "", false, false, false, false, "", new ArrayList(), arrayList3, new ArrayList());
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                if (!DW) {
                    throw th2;
                }
                iy.U2(th2, -1398846390683987085L, null, str, entry, list);
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @ey(method = -2322192235315682979L)
    private static EngineSolutionProject Hw(String str, List<ClassPath.Entry> list) {
        try {
            if (j6) {
                iy.EQ(827929349198020377L, null, str, list);
            }
            String strVJ = JavaProjectSupport.vJ(str, true);
            String strVJ2 = JavaProjectSupport.vJ(str, false);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            String str2 = strVJ;
            String str3 = strVJ2;
            for (ClassPath.Entry entry : list) {
                if (entry.isSrcKind()) {
                    arrayList.add(new EngineSolution.File(entry.VH(str), "Java", null, false, false));
                }
                if (entry.isLibKind()) {
                    arrayList2.add(entry.j6());
                }
                if (entry.isOutputIKind()) {
                    String strVH = entry.VH(str);
                    str2 = strVH + "/debug";
                    str3 = strVH + "/release";
                }
            }
            arrayList2.add(str);
            arrayList2.add("rt.jar");
            return new EngineSolutionProject(str, str, str, arrayList, arrayList2, true, "", str2, str3, "1.5", false, false, false, false, "", new ArrayList(), new ArrayList(), new ArrayList());
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 827929349198020377L, null, str, list);
            }
            throw th;
        }
    }

    @ey(method = 2193501588417238576L)
    private static EngineSolutionProject j6(String str) {
        try {
            if (j6) {
                iy.tp(-2260935329694632668L, null, str);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new EngineSolution.File(str + "/java", "Java Binary", "", false, true));
            arrayList.add(new EngineSolution.File(str + "/javax", "Java Binary", "", false, true));
            arrayList.add(new EngineSolution.File(str + "/org", "Java Binary", "", false, true));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("rt.jar");
            return new EngineSolutionProject("rt.jar", str, "rt.jar", arrayList, arrayList2, false, "", "", "", "", false, false, false, false, "", new ArrayList(), new ArrayList(), new ArrayList());
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -2260935329694632668L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -940577755128783744L)
    private static EngineSolutionProject v5(String str) {
        try {
            if (j6) {
                iy.tp(649324728079319740L, null, str);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new EngineSolution.File(str, "Java Binary", "", false, true));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("rt.jar");
            return new EngineSolutionProject("rt.jar", str, "rt.jar", arrayList, arrayList2, false, "", "", "", "", false, false, false, false, "", new ArrayList(), new ArrayList(), new ArrayList());
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 649324728079319740L, null, str);
            }
            throw th;
        }
    }
}
