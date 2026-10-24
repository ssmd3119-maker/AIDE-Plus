package abcd;

import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.command.MenuItemCommand;
import com.aide.ui.q;
import com.aide.ui.util.FileSpan;

@cy(clazz = -676281659499087616L, container = -676281659499087616L, user = true)
/* loaded from: classes.dex */
public class eb implements MenuItemCommand, KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(eb.class);
    }

    @ey(method = -2822143023857775200L)
    public eb() {
        try {
            if (j6) {
                iy.gn(186951913374035493L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 186951913374035493L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 7871485701766311688L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(-4007043234498025867L, this);
            }
            return new KeyStroke(40, false, true, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -4007043234498025867L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 3898090133562336129L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.editorMenuIntroduceVariable;
            }
            iy.gn(4143196189380454944L, this);
            return q.editorMenuIntroduceVariable;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 4143196189380454944L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 3442278143391872827L)
    public String getName() {
        try {
            if (!j6) {
                return "Introduce Variable";
            }
            iy.gn(-1390414736888200320L, this);
            return "Introduce Variable";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1390414736888200320L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -812617857689529437L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(927866146661248356L, this);
            }
            if (ServiceContainer.getOpenFileService().Ws()) {
                if (ServiceContainer.getOpenFileService().XL()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 927866146661248356L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 2514034836607481325L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-1226188753045821656L, this);
            }
            FileSpan currentFileSpan = ServiceContainer.getMainActivity().sh().getCurrentFileSpan();
            ServiceContainer.getMainActivity().w9();
            ServiceContainer.getEngineService().lg(currentFileSpan.j6, currentFileSpan.DW, currentFileSpan.FH, currentFileSpan.Hw, currentFileSpan.v5);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1226188753045821656L, this);
            }
            throw th;
        }
    }
}
