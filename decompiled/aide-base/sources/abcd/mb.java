package abcd;

import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.command.MenuCommand;
import com.aide.ui.q;

@cy(clazz = 2660487008674075053L, container = 2660487008674075053L, user = true)
/* loaded from: classes.dex */
public class mb implements MenuCommand, KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(mb.class);
    }

    @ey(method = 1451181408566444144L)
    public mb() {
        try {
            if (j6) {
                iy.gn(-361879320493099227L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -361879320493099227L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 7999425297853035552L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(838821478486645296L, this);
            }
            return new KeyStroke(12, false, true, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 838821478486645296L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -2238072884160745641L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.mainMenuOpenLogCatBrowser;
            }
            iy.gn(3516195656931544125L, this);
            return q.mainMenuOpenLogCatBrowser;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3516195656931544125L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 529850017593455829L)
    public String getName() {
        try {
            if (!j6) {
                return "Show LogCat";
            }
            iy.gn(-936971101488625593L, this);
            return "Show LogCat";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -936971101488625593L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 3380177254166299497L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(2208801801148696919L, this);
            }
            return !ServiceContainer.P8.equals("com.aide.web");
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2208801801148696919L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuCommand
    @ey(method = -2227953046797999073L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(946606905768799125L, this, z);
            }
            return !ServiceContainer.P8.equals("com.aide.web");
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 946606905768799125L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 2093442172169724035L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-1962363737263927431L, this);
            }
            ServiceContainer.getMainActivity().AL();
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1962363737263927431L, this);
            }
            throw th;
        }
    }
}
