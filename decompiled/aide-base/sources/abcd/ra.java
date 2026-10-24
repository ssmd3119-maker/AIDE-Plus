package abcd;

import com.aide.ui.ServiceContainer;
import com.aide.ui.command.MenuItemCommand;
import com.aide.ui.q;

@cy(clazz = 1041877758306564648L, container = 1041877758306564648L, user = true)
/* loaded from: classes.dex */
public class ra implements MenuItemCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(ra.class);
    }

    @ey(method = 3118343174282149513L)
    public ra() {
        try {
            if (j6) {
                iy.gn(5921828325229258880L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 5921828325229258880L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -4933807943604691440L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.gitMenuDeleteBranch;
            }
            iy.gn(1126194789822568459L, this);
            return q.gitMenuDeleteBranch;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1126194789822568459L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -2464137150875869984L)
    public boolean isEnabled() {
        try {
            if (!j6) {
                return true;
            }
            iy.gn(-3444761462426253951L, this);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -3444761462426253951L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -2462877385838805408L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(2171750093000222575L, this);
            }
            ServiceContainer.QX().yO(ServiceContainer.getFileBrowserService().j6());
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2171750093000222575L, this);
            }
            throw th;
        }
    }
}
