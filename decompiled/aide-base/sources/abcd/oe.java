package abcd;

import com.aide.engine.EngineSolution;
import com.aide.engine.EngineSolutionProject;
import com.aide.engine.service.CodeModelFactory;
import com.aide.ui.ServiceContainer;
import java.util.ArrayList;

@cy(clazz = -2094746474642943688L, container = -2094746474642943688L, user = true)
/* loaded from: classes.dex */
public class oe {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(oe.class);
    }

    @ey(method = 203712573763382675L)
    public oe() {
        try {
            if (j6) {
                iy.gn(-5000843992681656395L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -5000843992681656395L, null);
            }
            throw th;
        }
    }

    @ey(method = 4465314351817745153L)
    private static EngineSolutionProject DW(String str) {
        try {
            if (j6) {
                iy.tp(-1168798580448813216L, null, str);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new EngineSolution.File(str, "JavaScript", null, false, false));
            ArrayList arrayList2 = new ArrayList();
            new ArrayList();
            return new EngineSolutionProject(str, str, str, arrayList, arrayList2, false, "", "", "", "1.5", false, false, false, false, "", new ArrayList(), new ArrayList(), new ArrayList());
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1168798580448813216L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -7872746451374164013L)
    private static EngineSolutionProject FH(String str) {
        try {
            if (j6) {
                iy.tp(-2767380692528819808L, null, str);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new EngineSolution.File(str, "Css", null, false, false));
            arrayList.add(new EngineSolution.File(str, "HTML", null, false, false));
            arrayList.add(new EngineSolution.File(str, "JavaScript", null, false, false));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(str);
            return new EngineSolutionProject(str, str, str, arrayList, arrayList2, true, "", "", "", "1.5", false, false, false, false, "", new ArrayList(), new ArrayList(), new ArrayList());
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -2767380692528819808L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -3495438556181391820L)
    public static EngineSolution j6(String str, String str2) {
        try {
            if (j6) {
                iy.EQ(-256140995430312345L, null, str, str2);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(FH(str));
            arrayList.add(DW(str2));
            return new EngineSolution(arrayList, null, CodeModelFactory.j6(ServiceContainer.Hw()), ServiceContainer.Hw());
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -256140995430312345L, null, str, str2);
            }
            throw th;
        }
    }
}
