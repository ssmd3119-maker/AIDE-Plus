package abcd;

import com.aide.common.MessageBox;
import com.aide.ui.R$drawable;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.MenuCommand;
import com.aide.ui.q;
import com.aide.ui.u;

@cy(clazz = -1969594061014847400L, container = -1969594061014847400L, user = true)
/* loaded from: classes.dex */
public class r9 implements MenuCommand, tf {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(r9.class);
    }

    @ey(method = -490288958132222220L)
    public r9() {
        try {
            if (j6) {
                iy.gn(72543078096461469L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 72543078096461469L, null);
            }
            throw th;
        }
    }

    @Override // abcd.tf
    @ey(method = 3163632464993378997L)
    public int VH() {
        try {
            if (!j6) {
                return R$drawable.project_new;
            }
            iy.gn(850355616196444088L, this);
            return R$drawable.project_new;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 850355616196444088L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 3981290482810520295L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.filebrowserMenuNewProject;
            }
            iy.gn(-1048883525252206296L, this);
            return q.filebrowserMenuNewProject;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1048883525252206296L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -3697071191589626955L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(-3841361673370107904L, this);
            }
            return isVisible(false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -3841361673370107904L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuCommand
    @ey(method = 871060329677572755L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(-1694376740423679588L, this, z);
            }
            if (ServiceContainer.getFileBrowserService().FH() == null) {
                if (ServiceContainer.getTemplateService().VH(ServiceContainer.getFileBrowserService().j6())) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1694376740423679588L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // abcd.tf
    @ey(method = 2874328476352154400L)
    public int j6() {
        try {
            if (!j6) {
                return u.command_files_create_new_project;
            }
            iy.gn(1071907572276055541L, this);
            return u.command_files_create_new_project;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1071907572276055541L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -505122633785339813L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-2124374486515547640L, this);
            }
            MessageBox.gW(ServiceContainer.getMainActivity(), new fd(ServiceContainer.getFileBrowserService().j6(), false));
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2124374486515547640L, this);
            }
            throw th;
        }
    }
}
