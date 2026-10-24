package abcd;

import com.aide.common.KeyStroke;
import com.aide.common.MessageBox;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.command.MenuCommand;
import com.aide.ui.q;
import com.aide.ui.u;

@cy(clazz = 1478525518883894936L, container = 1478525518883894936L, user = true)
/* loaded from: classes.dex */
public class wb implements MenuCommand, KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    @cy(clazz = -1951183240277728403L, container = 1478525518883894936L, user = true)
    class a implements Runnable {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -15921295901854455L)
        public a(wb wbVar) {
        }

        @Override // java.lang.Runnable
        @ey(method = -2395931054893062841L)
        public void run() {
            try {
                if (WB) {
                    iy.gn(329751366624909504L, this);
                }
                ServiceContainer.getProjectService().buildProject(true);
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, 329751366624909504L, this);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(wb.class);
    }

    @ey(method = -2077857059610532347L)
    public wb() {
        try {
            if (j6) {
                iy.gn(5566572771117756480L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 5566572771117756480L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -6324690311347472065L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(-2993521335100583728L, this);
            }
            return new KeyStroke(33, true, true, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2993521335100583728L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 3906497280465498756L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.mainMenuRebuild;
            }
            iy.gn(-2233887961686240557L, this);
            return q.mainMenuRebuild;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2233887961686240557L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -398190910331009872L)
    public String getName() {
        try {
            if (!j6) {
                return "Refresh Build";
            }
            iy.gn(3156408382519110033L, this);
            return "Refresh Build";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3156408382519110033L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -3205137516908039592L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(1818031904395696509L, this);
            }
            return ServiceContainer.getProjectService().u7();
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1818031904395696509L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuCommand
    @ey(method = 152368378402405560L)
    public boolean isVisible(boolean z) {
        try {
            if (!j6) {
                return true;
            }
            iy.Ws(1170833250611144099L, this, z);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1170833250611144099L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -1558056545312634676L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(1758239089243411983L, this);
            }
            MessageBox.a8(ServiceContainer.getMainActivity(), u.command_refresh_build, u.dialog_refresh_build_message, new a(this), null);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1758239089243411983L, this);
            }
            throw th;
        }
    }
}
