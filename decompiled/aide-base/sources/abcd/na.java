package abcd;

import com.aide.ui.ServiceContainer;
import com.aide.ui.command.MenuItemCommand;
import com.aide.ui.q;

@cy(clazz = -1756214784907467157L, container = -1756214784907467157L, user = true)
/* loaded from: classes.dex */
public class na implements MenuItemCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(na.class);
    }

    @ey(method = -612701946049158000L)
    public na() {
        try {
            if (j6) {
                iy.gn(2499008618878001835L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2499008618878001835L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 2119888662621982893L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.gitMenuCheckout;
            }
            iy.gn(-960766187204664687L, this);
            return q.gitMenuCheckout;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -960766187204664687L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 179574930111189459L)
    public boolean isEnabled() {
        try {
            if (!j6) {
                return true;
            }
            iy.gn(3683557029201434055L, this);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3683557029201434055L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 1451762824562197329L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-2098145417621109675L, this);
            }
            ServiceContainer.QX().br(ServiceContainer.getFileBrowserService().j6());
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2098145417621109675L, this);
            }
            throw th;
        }
    }
}
