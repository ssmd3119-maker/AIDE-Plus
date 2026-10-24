package abcd;

import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.command.MenuItemCommand;
import com.aide.ui.q;

@cy(clazz = 926477883106650063L, container = 926477883106650063L, user = true)
/* loaded from: classes.dex */
public class pc implements MenuItemCommand, KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(pc.class);
    }

    @ey(method = 1827338452077257023L)
    public pc() {
        try {
            if (j6) {
                iy.gn(-2670528689579761528L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2670528689579761528L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 5195518687829536605L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(2485275893876114493L, this);
            }
            return new KeyStroke(68, false, true, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2485275893876114493L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -1464918019088844376L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.mainMenuShowOpenFiles;
            }
            iy.gn(-2163123358791437792L, this);
            return q.mainMenuShowOpenFiles;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2163123358791437792L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -1359767398444281696L)
    public String getName() {
        try {
            if (!j6) {
                return "Show Open Files";
            }
            iy.gn(-698845538126639232L, this);
            return "Show Open Files";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -698845538126639232L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -2574416400699180380L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(215048875293994836L, this);
            }
            return ServiceContainer.getOpenFileService().aM();
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 215048875293994836L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -1132104585958943168L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-1300945710357612088L, this);
            }
            ServiceContainer.getMainActivity().e9();
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1300945710357612088L, this);
            }
            throw th;
        }
    }
}
