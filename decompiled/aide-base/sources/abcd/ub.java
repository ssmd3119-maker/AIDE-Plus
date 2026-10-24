package abcd;

import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.command.MenuItemCommand;
import com.aide.ui.q;

@cy(clazz = 2554169852272236331L, container = 2554169852272236331L, user = true)
/* loaded from: classes.dex */
public class ub implements MenuItemCommand, KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(ub.class);
    }

    @ey(method = 2862834782742445980L)
    public ub() {
        try {
            if (j6) {
                iy.gn(6402906745458348383L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 6402906745458348383L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -3059036853121410084L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(-1098150818439884000L, this);
            }
            return new KeyStroke(44, true, true, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1098150818439884000L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 1726733578378520235L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.mainMenuPublishProject;
            }
            iy.gn(1508908154068003821L, this);
            return q.mainMenuPublishProject;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1508908154068003821L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 2213737515163631445L)
    public String getName() {
        try {
            if (!j6) {
                return "Publish Project";
            }
            iy.gn(-785249752542297581L, this);
            return "Publish Project";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -785249752542297581L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 2967460429716997257L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(1578851017842995283L, this);
            }
            return ServiceContainer.getProjectService().EQ();
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1578851017842995283L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -849803329088742593L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-2177515492884592623L, this);
            }
            ServiceContainer.getProjectService().XG();
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2177515492884592623L, this);
            }
            throw th;
        }
    }
}
