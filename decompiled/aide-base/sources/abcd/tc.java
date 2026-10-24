package abcd;

import com.aide.ui.ServiceContainer;
import com.aide.ui.command.MenuCommand;
import com.aide.ui.q;

@cy(clazz = 6504730837629551488L, container = 6504730837629551488L, user = true)
/* loaded from: classes.dex */
public class tc implements MenuCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(tc.class);
    }

    @ey(method = 2019519354082585680L)
    public tc() {
        try {
            if (j6) {
                iy.gn(3002122511356135013L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3002122511356135013L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -3650690962813677393L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.mainMenuStepIn;
            }
            iy.gn(2670909175663371580L, this);
            return q.mainMenuStepIn;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2670909175663371580L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -186550571809232463L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(2755796554421299648L, this);
            }
            return ServiceContainer.getDebugger().a8();
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2755796554421299648L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuCommand
    @ey(method = 1905728371335263943L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(-208817731499798904L, this, z);
            }
            if (ServiceContainer.getDebugger().aM()) {
                if (!ServiceContainer.getMainActivity().sh().aq()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -208817731499798904L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 578317619887315067L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-1343757648090660124L, this);
            }
            ServiceContainer.getDebugger().cb();
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1343757648090660124L, this);
            }
            throw th;
        }
    }
}
