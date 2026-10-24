package abcd;

import com.aide.ui.ServiceContainer;
import com.aide.ui.command.MenuItemCommand;
import com.aide.ui.q;

@cy(clazz = -138265473182211495L, container = -138265473182211495L, user = true)
/* loaded from: classes.dex */
public class rc implements MenuItemCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(rc.class);
    }

    @ey(method = 135779420644220320L)
    public rc() {
        try {
            if (j6) {
                iy.gn(4671910387416105992L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 4671910387416105992L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 1252368533911335411L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.mainMenuSettings;
            }
            iy.gn(4585085413692478632L, this);
            return q.mainMenuSettings;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 4585085413692478632L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -91546057441487075L)
    public boolean isEnabled() {
        try {
            if (!j6) {
                return true;
            }
            iy.gn(-1694846669634707732L, this);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1694846669634707732L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 2323465407671911983L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(1124392668700198128L, this);
            }
            ServiceContainer.getMainActivity().ys();
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1124392668700198128L, this);
            }
            throw th;
        }
    }
}
