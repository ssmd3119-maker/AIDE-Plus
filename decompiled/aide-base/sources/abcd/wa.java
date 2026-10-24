package abcd;

import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.command.MenuItemCommand;
import com.aide.ui.q;

@cy(clazz = 177483367288333392L, container = 177483367288333392L, user = true)
/* loaded from: classes.dex */
public class wa implements MenuItemCommand, KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(wa.class);
    }

    @ey(method = -294271070185226843L)
    public wa() {
        try {
            if (j6) {
                iy.gn(4093418266680763551L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 4093418266680763551L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -990590473757919489L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(-1975742060315104963L, this);
            }
            return new KeyStroke(22, false, false, true);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1975742060315104963L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -4389875398365058140L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.mainMenuForward;
            }
            iy.gn(-3307134470543043840L, this);
            return q.mainMenuForward;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -3307134470543043840L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 1051118119015025824L)
    public String getName() {
        try {
            if (!j6) {
                return "Go Forward";
            }
            iy.gn(2024233599580374028L, this);
            return "Go Forward";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2024233599580374028L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 1805873462654607688L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(-3323263396346365296L, this);
            }
            return ServiceContainer.getNavigateService().FH();
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -3323263396346365296L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -1168745237797594548L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-1099270386195144336L, this);
            }
            ServiceContainer.getMainActivity().hz();
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1099270386195144336L, this);
            }
            throw th;
        }
    }
}
