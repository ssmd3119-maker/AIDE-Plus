package abcd;

import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.command.MenuItemCommand;
import com.aide.ui.q;
import com.aide.ui.util.FileSpan;

@cy(clazz = 3620363743889067609L, container = 3620363743889067609L, user = true)
/* loaded from: classes.dex */
public class yb implements MenuItemCommand, KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(yb.class);
    }

    @ey(method = 1347640717477164720L)
    public yb() {
        try {
            if (j6) {
                iy.gn(3098317765174341801L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3098317765174341801L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -389272612798931904L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(-458602341358638800L, this);
            }
            return new KeyStroke(46, false, true, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -458602341358638800L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -405022147368867595L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.editorMenuRename;
            }
            iy.gn(4488318282287144025L, this);
            return q.editorMenuRename;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 4488318282287144025L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -206909722196566917L)
    public String getName() {
        try {
            if (!j6) {
                return "Rename in Code";
            }
            iy.gn(-1472060985942867717L, this);
            return "Rename in Code";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1472060985942867717L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -265182397007426421L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(-3289249237379368221L, this);
            }
            if (ServiceContainer.getOpenFileService().Ws() && ServiceContainer.getMainActivity().sh().getCurrentFileSpan().FH()) {
                if (ServiceContainer.getOpenFileService().XL()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -3289249237379368221L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -135591944608515015L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(2103746896135738869L, this);
            }
            FileSpan currentFileSpan = ServiceContainer.getMainActivity().sh().getCurrentFileSpan();
            ServiceContainer.getMainActivity().w9();
            ServiceContainer.getEngineService().U2(currentFileSpan.j6, currentFileSpan.DW, currentFileSpan.FH);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2103746896135738869L, this);
            }
            throw th;
        }
    }
}
