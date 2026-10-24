package abcd;

import com.aide.common.AndroidHelper;
import com.aide.ui.ServiceContainer;
import com.aide.ui.q;

@cy(clazz = -5917317832120763184L, container = -5917317832120763184L, user = true)
/* loaded from: classes.dex */
public class z9 implements rf {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(z9.class);
    }

    @ey(method = 2486321198274475341L)
    public z9() {
        try {
            if (j6) {
                iy.gn(-1011360072227752105L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1011360072227752105L, null);
            }
            throw th;
        }
    }

    @Override // abcd.rf
    @ey(method = -5883505337890472784L)
    public int gn() {
        try {
            if (!j6) {
                return q.mainMenuNavigateMode;
            }
            iy.gn(-3066070289746956704L, this);
            return q.mainMenuNavigateMode;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -3066070289746956704L, this);
            }
            throw th;
        }
    }

    @Override // abcd.rf, com.aide.ui.command.KeyStrokeCommand
    @ey(method = 561507594255781320L)
    public boolean isEnabled() {
        try {
            if (!j6) {
                return true;
            }
            iy.gn(2534074811492618240L, this);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2534074811492618240L, this);
            }
            throw th;
        }
    }

    @Override // abcd.rf
    @ey(method = 451778077373427495L)
    public boolean isVisible() {
        try {
            if (j6) {
                iy.gn(2444365520385050571L, this);
            }
            if (!ServiceContainer.getMainActivity().et() && !ServiceContainer.getMainActivity().sh().aq()) {
                if (AndroidHelper.j3(ServiceContainer.getContext())) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2444365520385050571L, this);
            }
            throw th;
        }
    }

    @Override // abcd.rf
    @ey(method = 1521363877380441743L)
    public String j6() {
        try {
            if (!j6) {
                return "Navigate mode";
            }
            iy.gn(1729120278393615147L, this);
            return "Navigate mode";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1729120278393615147L, this);
            }
            throw th;
        }
    }

    @Override // abcd.rf, com.aide.ui.command.KeyStrokeCommand
    @ey(method = -1583516843556202020L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(1911141277751525876L, this);
            }
            ServiceContainer.getMainActivity().rN();
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1911141277751525876L, this);
            }
            throw th;
        }
    }
}
