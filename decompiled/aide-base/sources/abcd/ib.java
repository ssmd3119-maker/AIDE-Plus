package abcd;

import com.aide.ui.ServiceContainer;
import com.aide.ui.command.MenuCommand;
import com.aide.ui.q;

@cy(clazz = -406891414349159904L, container = -406891414349159904L, user = true)
/* loaded from: classes.dex */
public class ib implements MenuCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(ib.class);
    }

    @ey(method = -2368933842574108800L)
    public ib() {
        try {
            if (j6) {
                iy.gn(5091492293488307728L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 5091492293488307728L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 1810043603273074965L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.filebrowserShowProjects;
            }
            iy.gn(1560034947901991625L, this);
            return q.filebrowserShowProjects;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1560034947901991625L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 2295411865137466887L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(-3443874539975018357L, this);
            }
            if (ServiceContainer.getFileBrowserService().FH() == null) {
                if (!ServiceContainer.getFileBrowserService().DW().equals(ServiceContainer.getFileBrowserService().j6())) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -3443874539975018357L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuCommand
    @ey(method = 1266010741856399733L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(-247169531932488183L, this, z);
            }
            return isEnabled();
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -247169531932488183L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -2418136908134465375L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-421737792662913675L, this);
            }
            ServiceContainer.getFileBrowserService().Hw(ServiceContainer.getFileBrowserService().DW());
            ServiceContainer.getMainActivity().k2();
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -421737792662913675L, this);
            }
            throw th;
        }
    }
}
