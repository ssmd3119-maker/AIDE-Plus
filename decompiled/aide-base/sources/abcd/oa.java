package abcd;

import com.aide.common.MessageBox;
import com.aide.ui.R$drawable;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.MenuCommand;
import com.aide.ui.q;
import com.aide.ui.u;

@cy(clazz = 2630694363011710872L, container = 2630694363011710872L, user = true)
/* loaded from: classes.dex */
public class oa implements MenuCommand, tf {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(oa.class);
    }

    @ey(method = -1392015842765231251L)
    public oa() {
        try {
            if (j6) {
                iy.gn(168284205488361021L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 168284205488361021L, null);
            }
            throw th;
        }
    }

    @Override // abcd.tf
    @ey(method = -3901087982080942380L)
    public int VH() {
        try {
            if (!j6) {
                return R$drawable.browser_git;
            }
            iy.gn(3118783328059726176L, this);
            return R$drawable.browser_git;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3118783328059726176L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -4041065251684278208L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.filebrowserMenuGitCloneRepository;
            }
            iy.gn(4603131334955324952L, this);
            return q.filebrowserMenuGitCloneRepository;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 4603131334955324952L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -2970095240530407080L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(2441415246104139236L, this);
            }
            return isVisible(false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2441415246104139236L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuCommand
    @ey(method = 1435934508883714632L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(1330872661737909808L, this, z);
            }
            if (ServiceContainer.getFileBrowserService().FH() == null) {
                if (ServiceContainer.QX().vJ(ServiceContainer.getFileBrowserService().j6())) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1330872661737909808L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // abcd.tf
    @ey(method = -1263594025637390925L)
    public int j6() {
        try {
            if (!j6) {
                return u.command_files_clone_git_repository;
            }
            iy.gn(3174000399138395657L, this);
            return u.command_files_clone_git_repository;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3174000399138395657L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 614087930236330944L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-2188123930104935920L, this);
            }
            MessageBox.gW(ServiceContainer.getMainActivity(), new md(ServiceContainer.getFileBrowserService().j6()));
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2188123930104935920L, this);
            }
            throw th;
        }
    }
}
