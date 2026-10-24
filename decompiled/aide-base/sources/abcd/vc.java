package abcd;

import com.aide.ui.ServiceContainer;
import com.aide.ui.command.MenuCommand;
import com.aide.ui.q;

@cy(clazz = 1364190057063971L, container = 1364190057063971L, user = true)
/* loaded from: classes.dex */
public class vc implements MenuCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(vc.class);
    }

    @ey(method = -2292561367714094859L)
    public vc() {
        try {
            if (j6) {
                iy.gn(-4612239745123818567L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -4612239745123818567L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -4751824892094218140L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.mainMenuStepOver;
            }
            iy.gn(4209664394147838543L, this);
            return q.mainMenuStepOver;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 4209664394147838543L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -2173007525297831136L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(-2491029940215663451L, this);
            }
            return ServiceContainer.getDebugger().a8();
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2491029940215663451L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuCommand
    @ey(method = 1374665917969111040L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(157704758762245827L, this, z);
            }
            if (ServiceContainer.getDebugger().aM()) {
                if (!ServiceContainer.getMainActivity().sh().aq()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 157704758762245827L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 2321309905565666268L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(997480146549669939L, this);
            }
            ServiceContainer.getDebugger().sG();
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 997480146549669939L, this);
            }
            throw th;
        }
    }
}
