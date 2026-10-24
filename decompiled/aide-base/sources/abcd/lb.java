package abcd;

import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.command.MenuItemCommand;
import com.aide.ui.q;

@cy(clazz = -2407190103045666315L, container = -2407190103045666315L, user = true)
/* loaded from: classes.dex */
public class lb implements MenuItemCommand, KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(lb.class);
    }

    @ey(method = -2876317212046449472L)
    public lb() {
        try {
            if (j6) {
                iy.gn(4357509962421863205L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 4357509962421863205L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 3747396980748732480L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(503819461581129504L, this);
            }
            return new KeyStroke(8, false, true, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 503819461581129504L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 5119223315309824611L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.mainMenuOpenFileBrowser;
            }
            iy.gn(-4665978269140041447L, this);
            return q.mainMenuOpenFileBrowser;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -4665978269140041447L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -427745169930552359L)
    public String getName() {
        try {
            if (!j6) {
                return "Show Files";
            }
            iy.gn(-2067074102259225153L, this);
            return "Show Files";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2067074102259225153L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -3717220649805239451L)
    public boolean isEnabled() {
        try {
            if (!j6) {
                return true;
            }
            iy.gn(863434907712101655L, this);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 863434907712101655L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -1238670020656164369L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-2364877884936365235L, this);
            }
            ServiceContainer.getMainActivity().k2();
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2364877884936365235L, this);
            }
            throw th;
        }
    }
}
