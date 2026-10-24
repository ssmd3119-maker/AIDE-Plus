package abcd;

import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.command.MenuCommand;
import com.aide.ui.q;

@cy(clazz = 159627396122716900L, container = 159627396122716900L, user = true)
/* loaded from: classes.dex */
public class za implements MenuCommand, KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(za.class);
    }

    @ey(method = -763684682957666976L)
    public za() {
        try {
            if (j6) {
                iy.gn(3777433522515034380L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3777433522515034380L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 7849912846119408016L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(-1315197207611726208L, this);
            }
            return new KeyStroke(42, false, true, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1315197207611726208L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -4284091356496482951L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.mainMenuGotoLine;
            }
            iy.gn(4511260786745788677L, this);
            return q.mainMenuGotoLine;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 4511260786745788677L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 577462102948752975L)
    public String getName() {
        try {
            if (!j6) {
                return "GoTo Line";
            }
            iy.gn(1970667451257564235L, this);
            return "GoTo Line";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1970667451257564235L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 3932936746284570183L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(-342945233979105285L, this);
            }
            return ServiceContainer.getOpenFileService().j3();
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -342945233979105285L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuCommand
    @ey(method = 977666140317885525L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(-801918321579619911L, this, z);
            }
            return !ServiceContainer.getMainActivity().yO();
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -801918321579619911L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -504837578198720243L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(1409053148001329289L, this);
            }
            ServiceContainer.getMainActivity().zh();
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1409053148001329289L, this);
            }
            throw th;
        }
    }
}
