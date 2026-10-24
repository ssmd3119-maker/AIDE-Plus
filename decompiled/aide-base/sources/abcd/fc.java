package abcd;

import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.command.MenuCommand;
import com.aide.ui.q;

@cy(clazz = -3564350986955831475L, container = -3564350986955831475L, user = true)
/* loaded from: classes.dex */
public class fc implements MenuCommand, KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(fc.class);
    }

    @ey(method = 847005950542572960L)
    public fc() {
        try {
            if (j6) {
                iy.gn(5152622014504857664L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 5152622014504857664L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -3888332247404279808L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(6798978600493561233L, this);
            }
            return new KeyStroke(34, false, true, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 6798978600493561233L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 1361551041894906291L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.mainMenuSearch;
            }
            iy.gn(556762516305291736L, this);
            return q.mainMenuSearch;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 556762516305291736L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 3428006717754141465L)
    public String getName() {
        try {
            if (!j6) {
                return "Search";
            }
            iy.gn(2426493303535552272L, this);
            return "Search";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2426493303535552272L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 1537343003010711429L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(2783498064244896972L, this);
            }
            return ServiceContainer.getOpenFileService().j3();
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2783498064244896972L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuCommand
    @ey(method = 2216463269646786699L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(42713257541599040L, this, z);
            }
            return !ServiceContainer.getMainActivity().yO();
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 42713257541599040L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -2525239089128489825L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-1253465533311664192L, this);
            }
            ServiceContainer.getMainActivity().cT();
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1253465533311664192L, this);
            }
            throw th;
        }
    }
}
