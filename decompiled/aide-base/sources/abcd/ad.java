package abcd;

import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.command.MenuItemCommand;
import com.aide.ui.q;
import com.aide.ui.util.FileSpan;

@cy(clazz = -63093609330207125L, container = -63093609330207125L, user = true)
/* loaded from: classes.dex */
public class ad implements MenuItemCommand, KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(ad.class);
    }

    @ey(method = -1975480015082030468L)
    public ad() {
        try {
            if (j6) {
                iy.gn(5360787163189271835L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 5360787163189271835L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -2045982912527240788L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(1792609239713366760L, this);
            }
            return new KeyStroke(76, true, true, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1792609239713366760L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -361182808081610229L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.editorMenuUnComment;
            }
            iy.gn(-912314057651627791L, this);
            return q.editorMenuUnComment;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -912314057651627791L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -1919262689749533795L)
    public String getName() {
        try {
            if (!j6) {
                return "Un-Outcomment Code";
            }
            iy.gn(517456708936845327L, this);
            return "Un-Outcomment Code";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 517456708936845327L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -1857843725509862383L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(1629169068555462375L, this);
            }
            if (ServiceContainer.getOpenFileService().Ws()) {
                if (ServiceContainer.getOpenFileService().XL()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1629169068555462375L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -2225225575298865585L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(1751927387498415925L, this);
            }
            FileSpan currentFileSpan = ServiceContainer.getMainActivity().sh().getCurrentFileSpan();
            ServiceContainer.getMainActivity().w9();
            ServiceContainer.getEngineService().XG(currentFileSpan.j6, currentFileSpan.DW, currentFileSpan.Hw);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1751927387498415925L, this);
            }
            throw th;
        }
    }
}
