package abcd;

import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.command.MenuItemCommand;
import com.aide.ui.q;
import com.aide.ui.util.FileSpan;

@cy(clazz = -1364065646680128192L, container = -1364065646680128192L, user = true)
/* loaded from: classes.dex */
public class rb implements MenuItemCommand, KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(rb.class);
    }

    @ey(method = -1202394179115481440L)
    public rb() {
        try {
            if (j6) {
                iy.gn(4256950439674170333L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 4256950439674170333L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 52206243249326080L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(3903115379809932979L, this);
            }
            return new KeyStroke(76, false, true, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3903115379809932979L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 624197316919384035L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.editorMenuComment;
            }
            iy.gn(-446797790681401188L, this);
            return q.editorMenuComment;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -446797790681401188L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -3043162914514774135L)
    public String getName() {
        try {
            if (!j6) {
                return "Outcomment Code";
            }
            iy.gn(2286047069014708400L, this);
            return "Outcomment Code";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2286047069014708400L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 2302354915665459285L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(-1944606009084342272L, this);
            }
            if (ServiceContainer.getOpenFileService().Ws()) {
                if (ServiceContainer.getOpenFileService().XL()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1944606009084342272L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 702220566522284687L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(1749259897062498180L, this);
            }
            FileSpan currentFileSpan = ServiceContainer.getMainActivity().sh().getCurrentFileSpan();
            ServiceContainer.getMainActivity().w9();
            ServiceContainer.getEngineService().gW(currentFileSpan.j6, currentFileSpan.DW, currentFileSpan.Hw);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1749259897062498180L, this);
            }
            throw th;
        }
    }
}
