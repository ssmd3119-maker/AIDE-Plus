package abcd;

import com.aide.ui.ServiceContainer;
import com.aide.ui.command.MenuItemCommand;
import com.aide.ui.q;

@cy(clazz = 262560835921562703L, container = 262560835921562703L, user = true)
/* loaded from: classes.dex */
public class qa implements MenuItemCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(qa.class);
    }

    @ey(method = 638282190114628592L)
    public qa() {
        try {
            if (j6) {
                iy.gn(-1652116500071005205L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1652116500071005205L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -4105876767121868115L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.gitMenuBranch;
            }
            iy.gn(-1105760209587387291L, this);
            return q.gitMenuBranch;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1105760209587387291L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 3107134384585998767L)
    public boolean isEnabled() {
        try {
            if (!j6) {
                return true;
            }
            iy.gn(2401170878567225347L, this);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2401170878567225347L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 2475856113281459609L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-502124537674817767L, this);
            }
            if (!ServiceContainer.getLicenseService().VH(ServiceContainer.gn(), "git_create_branch")) {
                return true;
            }
            ServiceContainer.QX().kQ(ServiceContainer.getFileBrowserService().j6());
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -502124537674817767L, this);
            }
            throw th;
        }
    }
}
