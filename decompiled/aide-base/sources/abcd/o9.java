package abcd;

import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.command.MenuItemCommand;
import com.aide.ui.q;
import com.aide.ui.util.FileSpan;

@cy(clazz = -1619458810673187915L, container = -1619458810673187915L, user = true)
/* loaded from: classes.dex */
public class o9 implements MenuItemCommand, KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(o9.class);
    }

    @ey(method = 2554096285410772825L)
    public o9() {
        try {
            if (j6) {
                iy.gn(-331156989405986500L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -331156989405986500L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -3737118372044755149L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(557581486104066765L, this);
            }
            return new KeyStroke(31, true, true, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 557581486104066765L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 3049159178138871760L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.editorMenuCreateConstructor;
            }
            iy.gn(3082277452532868832L, this);
            return q.editorMenuCreateConstructor;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3082277452532868832L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -1633229434873297800L)
    public String getName() {
        try {
            if (!j6) {
                return "Create Constructor";
            }
            iy.gn(-1606067931205857876L, this);
            return "Create Constructor";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1606067931205857876L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 2518271851346472576L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(2177633309727990992L, this);
            }
            if (ServiceContainer.getOpenFileService().QX()) {
                if (ServiceContainer.getOpenFileService().XL()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2177633309727990992L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -1214496699721063584L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(1986205005873880976L, this);
            }
            FileSpan currentFileSpan = ServiceContainer.getMainActivity().sh().getCurrentFileSpan();
            ServiceContainer.getMainActivity().w9();
            ServiceContainer.getEngineService().we(currentFileSpan.j6, currentFileSpan.DW, currentFileSpan.FH, currentFileSpan.Hw, currentFileSpan.v5);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1986205005873880976L, this);
            }
            throw th;
        }
    }
}
