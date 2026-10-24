package abcd;

import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.command.MenuCommand;
import com.aide.ui.q;

@cy(clazz = 1701233262103574145L, container = 1701233262103574145L, user = true)
/* loaded from: classes.dex */
public class tb implements MenuCommand, KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(tb.class);
    }

    @ey(method = -260305736238962077L)
    public tb() {
        try {
            if (j6) {
                iy.gn(-580544728909009428L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -580544728909009428L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 1765445356836962769L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(-6992652625082721675L, this);
            }
            return new KeyStroke(44, false, true, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -6992652625082721675L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -941761263731449832L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.logcatMenuPause;
            }
            iy.gn(-946226704582723248L, this);
            return q.logcatMenuPause;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -946226704582723248L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 3000315434927966580L)
    public String getName() {
        try {
            if (!j6) {
                return "LogCat - Pause";
            }
            iy.gn(1339289423611090400L, this);
            return "LogCat - Pause";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1339289423611090400L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 2566524086763772032L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(3106131210166779620L, this);
            }
            return isVisible(false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3106131210166779620L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuCommand
    @ey(method = -1014657854452950412L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(569828798082817728L, this, z);
            }
            return !ServiceContainer.getMainActivity().g3().XL();
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 569828798082817728L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -1481567884852274280L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(1755149175820842168L, this);
            }
            ServiceContainer.getMainActivity().g3().aM();
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1755149175820842168L, this);
            }
            throw th;
        }
    }
}
