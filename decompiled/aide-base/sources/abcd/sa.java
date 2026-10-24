package abcd;

import com.aide.ui.ServiceContainer;
import com.aide.ui.command.MenuItemCommand;
import com.aide.ui.q;

@cy(clazz = -158175183034963935L, container = -158175183034963935L, user = true)
/* loaded from: classes.dex */
public class sa implements MenuItemCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(sa.class);
    }

    @ey(method = 2516623989635724597L)
    public sa() {
        try {
            if (j6) {
                iy.gn(4013880388292156039L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 4013880388292156039L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 1763776692297499232L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.gitMenuMergeBranch;
            }
            iy.gn(2546436628555977495L, this);
            return q.gitMenuMergeBranch;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2546436628555977495L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 3548118089026219312L)
    public boolean isEnabled() {
        try {
            if (!j6) {
                return true;
            }
            iy.gn(2322419363338130845L, this);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2322419363338130845L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 1020460320404304368L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(2173440777958003995L, this);
            }
            if (!ServiceContainer.getLicenseService().VH(ServiceContainer.gn(), "git_merge_branch")) {
                return true;
            }
            ServiceContainer.QX().XG(ServiceContainer.getFileBrowserService().j6());
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2173440777958003995L, this);
            }
            throw th;
        }
    }
}
