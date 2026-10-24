package abcd;

import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.command.MenuCommand;
import com.aide.ui.q;

@cy(clazz = 2397962029714200101L, container = 2397962029714200101L, user = true)
/* loaded from: classes.dex */
public class ga implements MenuCommand, KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(ga.class);
    }

    @ey(method = 424384892704116825L)
    public ga() {
        try {
            if (j6) {
                iy.gn(-832772384792246976L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -832772384792246976L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -969311177542809645L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(1817243934918193125L, this);
            }
            return new KeyStroke(34, false, true, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1817243934918193125L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 2830391098124965200L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.logcatMenuFilterByProcess;
            }
            iy.gn(-4661642295206537760L, this);
            return q.logcatMenuFilterByProcess;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -4661642295206537760L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -2713273667363226968L)
    public String getName() {
        try {
            if (!j6) {
                return "LogCat - Filter by Process";
            }
            iy.gn(-2728868209644465152L, this);
            return "LogCat - Filter by Process";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2728868209644465152L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 150313274645987376L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(531183703994843780L, this);
            }
            return isVisible(false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 531183703994843780L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuCommand
    @ey(method = -1488414560744181240L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(1113400936222936320L, this, z);
            }
            return !ServiceContainer.P8.equals("com.aide.web");
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1113400936222936320L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -2231963921771460480L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-1306491938306740440L, this);
            }
            ServiceContainer.getMainActivity().g3().we();
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1306491938306740440L, this);
            }
            throw th;
        }
    }
}
