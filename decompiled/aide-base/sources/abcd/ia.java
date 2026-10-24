package abcd;

import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.command.MenuCommand;
import com.aide.ui.project.AndroidProjectSupport;
import com.aide.ui.q;

@cy(clazz = -5721927789128675223L, container = -5721927789128675223L, user = true)
/* loaded from: classes.dex */
public class ia implements MenuCommand, KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(ia.class);
    }

    @ey(method = -2048833223328912800L)
    public ia() {
        try {
            if (j6) {
                iy.gn(-1139389240969300895L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1139389240969300895L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -3375205682817957120L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(6521763311014388448L, this);
            }
            return new KeyStroke(31, false, true, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 6521763311014388448L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 334575568774424507L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.logcatMenuFilterCurrent;
            }
            iy.gn(4306515789564637425L, this);
            return q.logcatMenuFilterCurrent;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 4306515789564637425L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 440048486518049889L)
    public String getName() {
        try {
            if (!j6) {
                return "LogCat - Filter current App";
            }
            iy.gn(-2193944947923471757L, this);
            return "LogCat - Filter current App";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2193944947923471757L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 1607947383089618013L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(-2521746738572171733L, this);
            }
            return isVisible(false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2521746738572171733L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuCommand
    @ey(method = -111142239025094845L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(-918283197479591175L, this, z);
            }
            if (ServiceContainer.getProjectService().isOpenProject() && AndroidProjectSupport.iW(ServiceContainer.getProjectService().getCurrentAppHome())) {
                if (!ServiceContainer.P8.equals("com.aide.web")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -918283197479591175L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 1182373156361118855L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-705761253452826963L, this);
            }
            ServiceContainer.getMainActivity().g3().tp();
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -705761253452826963L, this);
            }
            throw th;
        }
    }
}
