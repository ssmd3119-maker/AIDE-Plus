package abcd;

import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.command.MenuItemCommand;
import com.aide.ui.q;

@cy(clazz = 3293585062521864541L, container = 3293585062521864541L, user = true)
/* loaded from: classes.dex */
public class kb implements MenuItemCommand, KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(kb.class);
    }

    @ey(method = -411238241001509788L)
    public kb() {
        try {
            if (j6) {
                iy.gn(-5181600903522880L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -5181600903522880L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 2057985677656842084L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(-5119427983714315425L, this);
            }
            return new KeyStroke(9, false, true, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -5119427983714315425L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -4789851613242658785L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.mainMenuOpenErrorBrowser;
            }
            iy.gn(4689453657226800100L, this);
            return q.mainMenuOpenErrorBrowser;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 4689453657226800100L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -2018518187910329775L)
    public String getName() {
        try {
            if (!j6) {
                return "Show Errors";
            }
            iy.gn(467064237447557280L, this);
            return "Show Errors";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 467064237447557280L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -159150246435665475L)
    public boolean isEnabled() {
        try {
            if (!j6) {
                return true;
            }
            iy.gn(-868114264366123512L, this);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -868114264366123512L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 2543321857245722995L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(2046416676396123020L, this);
            }
            ServiceContainer.getMainActivity().fY();
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2046416676396123020L, this);
            }
            throw th;
        }
    }
}
