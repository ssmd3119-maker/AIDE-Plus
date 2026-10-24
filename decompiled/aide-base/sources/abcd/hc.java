package abcd;

import com.aide.ui.ServiceContainer;
import com.aide.ui.command.MenuItemCommand;
import com.aide.ui.q;

@cy(clazz = -4714901312091323052L, container = -4714901312091323052L, user = true)
/* loaded from: classes.dex */
public class hc implements MenuItemCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(hc.class);
    }

    @ey(method = 1381827482863228209L)
    public hc() {
        try {
            if (j6) {
                iy.gn(-1093710659259666480L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1093710659259666480L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -4787120934118278164L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.mainMenuSelectBuildVariant;
            }
            iy.gn(-4939152180957907861L, this);
            return q.mainMenuSelectBuildVariant;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -4939152180957907861L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 2214862808287128184L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(-2487628880497653255L, this);
            }
            return ServiceContainer.getProjectService().isOpenProject();
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2487628880497653255L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 843952397118954116L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-518352898668950625L, this);
            }
            ServiceContainer.getProjectService().ko();
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -518352898668950625L, this);
            }
            throw th;
        }
    }
}
