package abcd;

import com.aide.common.AndroidHelper;
import com.aide.ui.ServiceContainer;
import com.aide.ui.q;

@cy(clazz = 1995836930907972873L, container = 1995836930907972873L, user = true)
/* loaded from: classes.dex */
public class y9 implements rf {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(y9.class);
    }

    @ey(method = -652067200322759665L)
    public y9() {
        try {
            if (j6) {
                iy.gn(-4434104615141828816L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -4434104615141828816L, null);
            }
            throw th;
        }
    }

    @Override // abcd.rf
    @ey(method = 4236376464443611800L)
    public int gn() {
        try {
            if (!j6) {
                return q.mainMenuEditMode;
            }
            iy.gn(3299850194603128336L, this);
            return q.mainMenuEditMode;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3299850194603128336L, this);
            }
            throw th;
        }
    }

    @Override // abcd.rf, com.aide.ui.command.KeyStrokeCommand
    @ey(method = -4129831557432301904L)
    public boolean isEnabled() {
        try {
            if (!j6) {
                return true;
            }
            iy.gn(-504296538159130140L, this);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -504296538159130140L, this);
            }
            throw th;
        }
    }

    @Override // abcd.rf
    @ey(method = 4049452818832424829L)
    public boolean isVisible() {
        try {
            if (j6) {
                iy.gn(-611463832373783587L, this);
            }
            if (ServiceContainer.getMainActivity().et() && !ServiceContainer.getMainActivity().sh().aq()) {
                if (AndroidHelper.j3(ServiceContainer.getContext())) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -611463832373783587L, this);
            }
            throw th;
        }
    }

    @Override // abcd.rf
    @ey(method = 2605519121020882845L)
    public String j6() {
        try {
            if (!j6) {
                return "Edit mode";
            }
            iy.gn(-235426994016869655L, this);
            return "Edit mode";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -235426994016869655L, this);
            }
            throw th;
        }
    }

    @Override // abcd.rf, com.aide.ui.command.KeyStrokeCommand
    @ey(method = 550125405724848912L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-573002421294433704L, this);
            }
            ServiceContainer.getMainActivity().a8();
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -573002421294433704L, this);
            }
            throw th;
        }
    }
}
