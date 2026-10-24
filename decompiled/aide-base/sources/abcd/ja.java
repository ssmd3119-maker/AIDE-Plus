package abcd;

import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.command.MenuItemCommand;
import com.aide.ui.q;
import com.aide.ui.util.FileSpan;

@cy(clazz = -4581574782419649491L, container = -4581574782419649491L, user = true)
/* loaded from: classes.dex */
public class ja implements MenuItemCommand, KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(ja.class);
    }

    @ey(method = -1925656819496894165L)
    public ja() {
        try {
            if (j6) {
                iy.gn(987002696787161172L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 987002696787161172L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -1871924422793019855L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(-3878072313257155637L, this);
            }
            return new KeyStroke(35, true, true, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -3878072313257155637L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 1068532894763366728L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.editorMenuFindExtendedUsages;
            }
            iy.gn(-127111603786457316L, this);
            return q.editorMenuFindExtendedUsages;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -127111603786457316L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -3199918574106350768L)
    public String getName() {
        try {
            if (!j6) {
                return "Find Extended Usages";
            }
            iy.gn(-622765853186689128L, this);
            return "Find Extended Usages";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -622765853186689128L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 2780228304489719276L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(-151631260611581096L, this);
            }
            if (ServiceContainer.getOpenFileService().Ws()) {
                if (ServiceContainer.getMainActivity().sh().getCurrentFileSpan().FH()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -151631260611581096L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -1713268008288169776L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(34912683848900820L, this);
            }
            FileSpan currentFileSpan = ServiceContainer.getMainActivity().sh().getCurrentFileSpan();
            ServiceContainer.SI().J8(currentFileSpan.j6, currentFileSpan.DW, currentFileSpan.FH, currentFileSpan.Hw, currentFileSpan.v5);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 34912683848900820L, this);
            }
            throw th;
        }
    }
}
