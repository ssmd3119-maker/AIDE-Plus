package abcd;

import com.aide.ui.ServiceContainer;
import com.aide.ui.command.MenuItemCommand;
import com.aide.ui.q;

@cy(clazz = 529689759120075996L, container = 529689759120075996L, user = true)
/* loaded from: classes.dex */
public class n9 implements MenuItemCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(n9.class);
    }

    @ey(method = 901530408733378872L)
    public n9() {
        try {
            if (j6) {
                iy.gn(1212671781126320389L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1212671781126320389L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 3261020594749795305L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.logcatMenuCopy;
            }
            iy.gn(200569225568229380L, this);
            return q.logcatMenuCopy;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 200569225568229380L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 3316061782657157423L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(2387618958744099344L, this);
            }
            return !ServiceContainer.P8.equals("com.aide.web");
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2387618958744099344L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -251614557662913523L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-1782494481166040356L, this);
            }
            ServiceContainer.getMainActivity().g3().u7();
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1782494481166040356L, this);
            }
            throw th;
        }
    }
}
