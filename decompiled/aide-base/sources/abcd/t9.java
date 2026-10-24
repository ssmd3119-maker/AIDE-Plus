package abcd;

import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.command.MenuItemCommand;
import com.aide.ui.q;
import com.aide.ui.util.FileSpan;

@cy(clazz = 1694969611553078631L, container = 1694969611553078631L, user = true)
/* loaded from: classes.dex */
public class t9 implements MenuItemCommand, KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(t9.class);
    }

    @ey(method = 1017718620959808096L)
    public t9() {
        try {
            if (j6) {
                iy.gn(-571438820365683281L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -571438820365683281L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 2056409844007912440L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(5402708704394929592L, this);
            }
            return new KeyStroke(47, true, true, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 5402708704394929592L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -1910027634039097475L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.editorMenuCreateSetters;
            }
            iy.gn(5025082082208859125L, this);
            return q.editorMenuCreateSetters;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 5025082082208859125L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -1051126317188912625L)
    public String getName() {
        try {
            if (!j6) {
                return "Create Setters & Getters";
            }
            iy.gn(-2873268154653466025L, this);
            return "Create Setters & Getters";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2873268154653466025L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -1751949228573125841L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(1928229664466001575L, this);
            }
            if (ServiceContainer.getOpenFileService().QX()) {
                if (ServiceContainer.getOpenFileService().XL()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1928229664466001575L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -138361236176817911L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(2237362495858707969L, this);
            }
            FileSpan currentFileSpan = ServiceContainer.getMainActivity().sh().getCurrentFileSpan();
            ServiceContainer.getMainActivity().w9();
            ServiceContainer.getEngineService().J0(currentFileSpan.j6, currentFileSpan.DW, currentFileSpan.FH, currentFileSpan.Hw, currentFileSpan.v5);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2237362495858707969L, this);
            }
            throw th;
        }
    }
}
