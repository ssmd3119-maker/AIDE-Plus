package abcd;

import com.aide.ui.ServiceContainer;
import com.aide.ui.command.MenuItemCommand;
import com.aide.ui.q;

@cy(clazz = -396358534484956308L, container = -396358534484956308L, user = true)
/* loaded from: classes.dex */
public class pa implements MenuItemCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(pa.class);
    }

    @ey(method = -779448821847812480L)
    public pa() {
        try {
            if (j6) {
                iy.gn(-6059104367131167304L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -6059104367131167304L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 2476087466922116815L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.gitMenuCommit;
            }
            iy.gn(-90676765773540649L, this);
            return q.gitMenuCommit;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -90676765773540649L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 2893533663431901497L)
    public boolean isEnabled() {
        try {
            if (!j6) {
                return true;
            }
            iy.gn(1369464439039979925L, this);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1369464439039979925L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 428720155609349835L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-703103872229021845L, this);
            }
            ServiceContainer.QX().XX(ServiceContainer.getFileBrowserService().j6());
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -703103872229021845L, this);
            }
            throw th;
        }
    }
}
