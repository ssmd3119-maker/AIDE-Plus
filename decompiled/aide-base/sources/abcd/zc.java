package abcd;

import com.aide.ui.ServiceContainer;
import com.aide.ui.command.MenuCommand;
import com.aide.ui.q;

@cy(clazz = 4648849901644894920L, container = 4648849901644894920L, user = true)
/* loaded from: classes.dex */
public class zc implements MenuCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(zc.class);
    }

    @ey(method = -3232419196221853281L)
    public zc() {
        try {
            if (j6) {
                iy.gn(14177674493869557L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 14177674493869557L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 910645224894719400L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.editorMenuToggleBreakpoint;
            }
            iy.gn(3425507492959697872L, this);
            return q.editorMenuToggleBreakpoint;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3425507492959697872L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -2471374239634480668L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(3393093812982730272L, this);
            }
            if (ServiceContainer.getOpenFileService().QX()) {
                if (ServiceContainer.getDebugger().Mr()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3393093812982730272L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuCommand
    @ey(method = 938565350676946032L)
    public boolean isVisible(boolean z) {
        try {
            if (!j6) {
                return true;
            }
            iy.Ws(-1050467730206890492L, this, z);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1050467730206890492L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 1960914655854616000L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-237006552448467584L, this);
            }
            ServiceContainer.getMainActivity().sh().kf(ServiceContainer.getMainActivity().sh().getCurrentFileSpan().DW);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -237006552448467584L, this);
            }
            throw th;
        }
    }
}
