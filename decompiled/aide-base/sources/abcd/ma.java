package abcd;

import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.command.MenuItemCommand;
import com.aide.ui.q;
import com.aide.ui.util.FileSpan;

@cy(clazz = -148039404769295333L, container = -148039404769295333L, user = true)
/* loaded from: classes.dex */
public class ma implements MenuItemCommand, KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(ma.class);
    }

    @ey(method = -2447708120277152265L)
    public ma() {
        try {
            if (j6) {
                iy.gn(5161745667439982812L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 5161745667439982812L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 5881063899013990461L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(3157510093374461357L, this);
            }
            return new KeyStroke(34, true, true, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3157510093374461357L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 3966279958653319680L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.editorMenuFormatCode;
            }
            iy.gn(-1088638305527505432L, this);
            return q.editorMenuFormatCode;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1088638305527505432L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -34220131099253748L)
    public String getName() {
        try {
            if (!j6) {
                return "Format Code";
            }
            iy.gn(334512780032364896L, this);
            return "Format Code";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 334512780032364896L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -663150953506259312L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(2084340733165808708L, this);
            }
            if (ServiceContainer.getOpenFileService().Ws()) {
                if (ServiceContainer.getOpenFileService().XL()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2084340733165808708L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -1289757273847845264L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-1409560049513724736L, this);
            }
            FileSpan currentFileSpan = ServiceContainer.getMainActivity().sh().getCurrentFileSpan();
            ServiceContainer.getMainActivity().w9();
            int i = currentFileSpan.DW;
            int currentFileLineCount = currentFileSpan.Hw;
            if (i == currentFileLineCount) {
                currentFileLineCount = ServiceContainer.getMainActivity().sh().getCurrentFileLineCount();
                i = 1;
            }
            ServiceContainer.getEngineService().Hw(ServiceContainer.getOpenFileService().u7(), i, currentFileLineCount, ServiceContainer.getMainActivity().sh().getTabSize());
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1409560049513724736L, this);
            }
            throw th;
        }
    }
}
