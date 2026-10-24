package abcd;

import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.command.MenuCommand;
import com.aide.ui.q;
import com.aide.ui.util.FileSpan;

@cy(clazz = -2146700596797251949L, container = -2146700596797251949L, user = true)
/* loaded from: classes.dex */
public class ya implements MenuCommand, KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(ya.class);
    }

    @ey(method = -1006314407851436052L)
    public ya() {
        try {
            if (j6) {
                iy.gn(-6111366829181711715L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -6111366829181711715L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -4739214654258972852L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(3131566647231675172L, this);
            }
            return new KeyStroke(66, false, true, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3131566647231675172L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -2202439882712742717L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.editorMenuGotoDefinition;
            }
            iy.gn(-1691847768269719761L, this);
            return q.editorMenuGotoDefinition;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1691847768269719761L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -1613066482526710227L)
    public String getName() {
        try {
            if (!j6) {
                return "GoTo Definition";
            }
            iy.gn(1918895741741378193L, this);
            return "GoTo Definition";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1918895741741378193L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -841796359870830031L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(3860166885746565981L, this);
            }
            if (ServiceContainer.getOpenFileService().Ws()) {
                if (ServiceContainer.getMainActivity().sh().getCurrentFileSpan().FH()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3860166885746565981L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuCommand
    @ey(method = -390207895332771313L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(1299418966125918267L, this, z);
            }
            return isEnabled();
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1299418966125918267L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 1309399158831674295L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(642690637274827875L, this);
            }
            FileSpan currentFileSpan = ServiceContainer.getMainActivity().sh().getCurrentFileSpan();
            ServiceContainer.SI().aM(currentFileSpan.j6, currentFileSpan.DW, currentFileSpan.FH, currentFileSpan.Hw, currentFileSpan.v5, null);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 642690637274827875L, this);
            }
            throw th;
        }
    }
}
