package abcd;

import com.aide.ui.ServiceContainer;
import com.aide.ui.command.MenuCommand;
import com.aide.ui.q;

@cy(clazz = -679309723778702360L, container = -679309723778702360L, user = true)
/* loaded from: classes.dex */
public class ca implements MenuCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(ca.class);
    }

    @ey(method = 2576134131828058875L)
    public ca() {
        try {
            if (j6) {
                iy.gn(-3750146435217108225L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -3750146435217108225L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -262576525023113640L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.mainMenuExpertMode;
            }
            iy.gn(-4148610208697930004L, this);
            return q.mainMenuExpertMode;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -4148610208697930004L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -1058461150240296660L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(3198549259485696688L, this);
            }
            if (ServiceContainer.isTrainerMode()) {
                if (ServiceContainer.ro().Sf()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3198549259485696688L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuCommand
    @ey(method = 572856545013160320L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(-1021337882678995192L, this, z);
            }
            return isEnabled();
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1021337882678995192L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -2356659048812179584L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-1160184403873147500L, this);
            }
            ServiceContainer.getMainActivity().lg();
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1160184403873147500L, this);
            }
            throw th;
        }
    }
}
