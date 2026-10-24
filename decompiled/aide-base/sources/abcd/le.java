package abcd;

import com.aide.engine.EngineSolution;
import com.aide.engine.EngineSolutionProject;
import com.aide.engine.service.CodeModelFactory;
import com.aide.ui.ServiceContainer;
import java.util.ArrayList;

@cy(clazz = 3309655002029669520L, container = 3309655002029669520L, user = true)
/* loaded from: classes.dex */
public class le {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(le.class);
    }

    @ey(method = 2791301784481313603L)
    public le() {
        try {
            if (j6) {
                iy.gn(-5636063504657802657L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -5636063504657802657L, null);
            }
            throw th;
        }
    }

    @ey(method = 4587320037454825469L)
    private static EngineSolutionProject DW(String str) {
        try {
            if (j6) {
                iy.tp(4182834223979280184L, null, str);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new EngineSolution.File(str, "JavaScript", null, false, false));
            ArrayList arrayList2 = new ArrayList();
            new ArrayList();
            return new EngineSolutionProject(str, str, str, arrayList, arrayList2, false, "", "", "", "1.5", false, false, false, false, "", new ArrayList(), new ArrayList(), new ArrayList());
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 4182834223979280184L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -388625393276553905L)
    private static EngineSolutionProject FH(String str) {
        try {
            if (j6) {
                iy.tp(3766844746116943904L, null, str);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new EngineSolution.File(Hw(str), "Css", null, false, false));
            arrayList.add(new EngineSolution.File(Hw(str), "HTML", null, false, false));
            arrayList.add(new EngineSolution.File(Hw(str), "JavaScript", null, false, false));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(str);
            return new EngineSolutionProject(str, str, str, arrayList, arrayList2, true, "", "", "", "1.5", false, false, false, false, "", new ArrayList(), new ArrayList(), new ArrayList());
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 3766844746116943904L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 1360858180508472217L)
    private static String Hw(String str) {
        try {
            if (j6) {
                iy.tp(1325459068363646400L, null, str);
            }
            return str + "/www";
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1325459068363646400L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -3438301585032772032L)
    public static EngineSolution j6(String str, String str2) {
        try {
            if (j6) {
                iy.EQ(-65258910459178605L, null, str, str2);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(FH(str));
            arrayList.add(DW(str2));
            return new EngineSolution(arrayList, null, CodeModelFactory.j6(ServiceContainer.Hw()), ServiceContainer.Hw());
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -65258910459178605L, null, str, str2);
            }
            throw th;
        }
    }
}
