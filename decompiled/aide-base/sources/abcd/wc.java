package abcd;

import com.aide.ui.ServiceContainer;
import com.aide.ui.command.MenuCommand;
import com.aide.ui.q;

@cy(clazz = 1089654115760624015L, container = 1089654115760624015L, user = true)
/* loaded from: classes.dex */
public class wc implements MenuCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(wc.class);
    }

    @ey(method = 2011486657235489705L)
    public wc() {
        try {
            if (j6) {
                iy.gn(1915486065682524588L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1915486065682524588L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 4675600367224675772L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.mainMenuStopDebugging;
            }
            iy.gn(-3562132123617887852L, this);
            return q.mainMenuStopDebugging;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -3562132123617887852L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 412517500168123896L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(-3414523651501711752L, this);
            }
            return ServiceContainer.getDebugger().aM();
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -3414523651501711752L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuCommand
    @ey(method = 1032437181624358576L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(1141720365849151400L, this, z);
            }
            return isEnabled();
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1141720365849151400L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 450814287191362164L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(1274319610700715836L, this);
            }
            ServiceContainer.getDebugger().ef();
            ServiceContainer.getMainActivity().QX();
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1274319610700715836L, this);
            }
            throw th;
        }
    }
}
