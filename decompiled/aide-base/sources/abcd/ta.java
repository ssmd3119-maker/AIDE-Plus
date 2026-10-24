package abcd;

import com.aide.ui.ServiceContainer;
import com.aide.ui.command.MenuItemCommand;
import com.aide.ui.q;

@cy(clazz = 697695876754620840L, container = 697695876754620840L, user = true)
/* loaded from: classes.dex */
public class ta implements MenuItemCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(ta.class);
    }

    @ey(method = -2236471485259542696L)
    public ta() {
        try {
            if (j6) {
                iy.gn(-596061221172241965L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -596061221172241965L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -3299286181816737999L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.gitMenuPull;
            }
            iy.gn(-4767759095579717616L, this);
            return q.gitMenuPull;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -4767759095579717616L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 2820908232911140875L)
    public boolean isEnabled() {
        try {
            if (!j6) {
                return true;
            }
            iy.gn(3559694178345063264L, this);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3559694178345063264L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -655453143451505747L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-1497371014758217536L, this);
            }
            ServiceContainer.QX().sy(ServiceContainer.getFileBrowserService().j6());
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1497371014758217536L, this);
            }
            throw th;
        }
    }
}
