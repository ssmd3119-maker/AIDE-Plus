package abcd;

import com.aide.ui.ServiceContainer;
import com.aide.ui.command.MenuItemCommand;
import com.aide.ui.q;
import com.aide.ui.util.FileSpan;

@cy(clazz = -2533067735454686824L, container = -2533067735454686824L, user = true)
/* loaded from: classes.dex */
public class ka implements MenuItemCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(ka.class);
    }

    @ey(method = 1189716003026274988L)
    public ka() {
        try {
            if (j6) {
                iy.gn(2140430100437410145L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2140430100437410145L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -2384576518926490845L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.editorMenuFindTextually;
            }
            iy.gn(-2011264677206248464L, this);
            return q.editorMenuFindTextually;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2011264677206248464L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -1631791121809945095L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(-1269718644455026704L, this);
            }
            if (!ServiceContainer.getProjectService().isOpenProject() || !ServiceContainer.getOpenFileService().j3()) {
                return false;
            }
            FileSpan currentFileSpan = ServiceContainer.getMainActivity().sh().getCurrentFileSpan();
            if (currentFileSpan.DW == currentFileSpan.Hw) {
                return currentFileSpan.v5 - currentFileSpan.FH > 2;
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1269718644455026704L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -506414109059161785L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(658942525113157984L, this);
            }
            ServiceContainer.SI().U2(ServiceContainer.getMainActivity().sh().getSelectionContent().trim());
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 658942525113157984L, this);
            }
            throw th;
        }
    }
}
