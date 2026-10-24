package abcd;

import com.aide.engine.EngineSolution;
import com.aide.engine.EngineSolutionProject;
import com.aide.engine.service.CodeModelFactory;
import com.aide.ui.ServiceContainer;
import java.util.ArrayList;

@cy(clazz = -2181373676313666224L, container = -2181373676313666224L, user = true)
/* loaded from: classes.dex */
public class he {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(he.class);
    }

    @ey(method = 686752377257983455L)
    public he() {
        try {
            if (j6) {
                iy.gn(3453680293407141021L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3453680293407141021L, null);
            }
            throw th;
        }
    }

    @ey(method = -4585195665909319899L)
    private static EngineSolutionProject DW(String str) {
        try {
            if (j6) {
                iy.tp(4706752379694474600L, null, str);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new EngineSolution.File(str, "JavaScript", null, false, false));
            ArrayList arrayList2 = new ArrayList();
            new ArrayList();
            return new EngineSolutionProject(str, str, str, arrayList, arrayList2, false, "", "", "", "1.5", false, false, false, false, "", new ArrayList(), new ArrayList(), new ArrayList());
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 4706752379694474600L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -5825155442448798257L)
    private static EngineSolutionProject FH(String str) {
        try {
            if (j6) {
                iy.tp(-6342610622238262680L, null, str);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new EngineSolution.File(str, "JavaScript", null, false, false));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(str);
            return new EngineSolutionProject(str, str, str, arrayList, arrayList2, true, "", "", "", "1.5", false, false, false, false, "", new ArrayList(), new ArrayList(), new ArrayList());
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -6342610622238262680L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 836923319127686076L)
    public static EngineSolution j6(String str, String str2) {
        try {
            if (j6) {
                iy.EQ(-2109515641839074025L, null, str, str2);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(FH(str));
            arrayList.add(DW(str2));
            return new EngineSolution(arrayList, null, CodeModelFactory.j6(ServiceContainer.Hw()), ServiceContainer.Hw());
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -2109515641839074025L, null, str, str2);
            }
            throw th;
        }
    }
}
