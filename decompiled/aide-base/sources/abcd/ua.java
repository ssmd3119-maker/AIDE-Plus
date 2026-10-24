package abcd;

import com.aide.ui.ServiceContainer;
import com.aide.ui.command.MenuItemCommand;
import com.aide.ui.q;

@cy(clazz = 7181015597967059041L, container = 7181015597967059041L, user = true)
/* loaded from: classes.dex */
public class ua implements MenuItemCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(ua.class);
    }

    @ey(method = -3395705459576113203L)
    public ua() {
        try {
            if (j6) {
                iy.gn(5333345784949713780L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 5333345784949713780L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -1094563592487084896L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.gitMenuPush;
            }
            iy.gn(-2927924224769517240L, this);
            return q.gitMenuPush;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2927924224769517240L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -3617997596325713720L)
    public boolean isEnabled() {
        try {
            if (!j6) {
                return true;
            }
            iy.gn(-2211153557887457396L, this);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2211153557887457396L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -2100376406715720192L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-805175612518740336L, this);
            }
            if (!ServiceContainer.getLicenseService().VH(ServiceContainer.gn(), "git_push")) {
                return true;
            }
            ServiceContainer.QX().aj(ServiceContainer.getFileBrowserService().j6());
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -805175612518740336L, this);
            }
            throw th;
        }
    }
}
