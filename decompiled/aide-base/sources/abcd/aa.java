package abcd;

import com.aide.ui.ServiceContainer;
import com.aide.ui.command.MenuItemCommand;
import com.aide.ui.q;

@cy(clazz = 822434286047457699L, container = 822434286047457699L, user = true)
/* loaded from: classes.dex */
public class aa implements MenuItemCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(aa.class);
    }

    @ey(method = -3170108569925513532L)
    public aa() {
        try {
            if (j6) {
                iy.gn(17448753741992001L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 17448753741992001L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 4001026192617777455L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.mainMenuExit;
            }
            iy.gn(-2166214369910658093L, this);
            return q.mainMenuExit;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2166214369910658093L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 184475433772226429L)
    public boolean isEnabled() {
        try {
            if (!j6) {
                return true;
            }
            iy.gn(-126373416554491623L, this);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -126373416554491623L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -1934786834770646493L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-611232472490858985L, this);
            }
            ServiceContainer.getMainActivity().BT();
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -611232472490858985L, this);
            }
            throw th;
        }
    }
}
