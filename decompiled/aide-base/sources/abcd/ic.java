package abcd;

import com.aide.ui.ServiceContainer;
import com.aide.ui.command.MenuCommand;
import com.aide.ui.q;
import com.aide.ui.util.FileSystem;

@cy(clazz = -453632352654033387L, container = -453632352654033387L, user = true)
/* loaded from: classes.dex */
public class ic implements MenuCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(ic.class);
    }

    @ey(method = -1215624804467032260L)
    public ic() {
        try {
            if (j6) {
                iy.gn(6210403129055366840L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 6210403129055366840L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 487612066036989483L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.filebrowserMenuSetAndroidJar;
            }
            iy.gn(1438123426384469920L, this);
            return q.filebrowserMenuSetAndroidJar;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1438123426384469920L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 2711400971280571065L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(-236840090287573368L, this);
            }
            return isVisible(false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -236840090287573368L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuCommand
    @ey(method = 86078112920930583L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(-839799634759797400L, this, z);
            }
            String strFH = ServiceContainer.getFileBrowserService().FH();
            if (strFH != null) {
                if (FileSystem.getName(strFH).equals("android.jar")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -839799634759797400L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -2170820179304828065L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(2151287117413257984L, this);
            }
            ServiceContainer.getProjectService().hz(ServiceContainer.getFileBrowserService().FH());
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2151287117413257984L, this);
            }
            throw th;
        }
    }
}
