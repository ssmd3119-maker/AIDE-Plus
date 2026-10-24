package abcd;

import com.aide.engine.EngineSolution;
import com.aide.engine.EngineSolutionProject;
import com.aide.engine.service.CodeModelFactory;
import com.aide.ui.ServiceContainer;
import java.util.ArrayList;

@cy(clazz = 5531562394700995328L, container = 5531562394700995328L, user = true)
/* loaded from: classes.dex */
public class je {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(je.class);
    }

    @ey(method = -192775221930657281L)
    public je() {
        try {
            if (j6) {
                iy.gn(1911039512398473105L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1911039512398473105L, null);
            }
            throw th;
        }
    }

    @ey(method = -170490128409866685L)
    private static EngineSolutionProject DW(String str) {
        try {
            if (j6) {
                iy.tp(-1789172338563227552L, null, str);
            }
            String str2 = str + "/bin";
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            arrayList.add(new EngineSolution.File(str + "/jni", "C++", null, false, false));
            return new EngineSolutionProject(str, str, str, arrayList, arrayList2, true, "", str2, str2, "1.5", false, false, false, false, "", new ArrayList(), new ArrayList(), new ArrayList());
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1789172338563227552L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 169712175218644344L)
    public static EngineSolution j6(String str) {
        try {
            if (j6) {
                iy.tp(-947437862087354149L, null, str);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(DW(str));
            return new EngineSolution(arrayList, null, CodeModelFactory.j6(ServiceContainer.Hw()), ServiceContainer.Hw());
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -947437862087354149L, null, str);
            }
            throw th;
        }
    }
}
