package abcd;

import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.command.MenuCommand;
import com.aide.ui.q;

@cy(clazz = 2203386268568904600L, container = 2203386268568904600L, user = true)
/* loaded from: classes.dex */
public class ha implements MenuCommand, KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(ha.class);
    }

    @ey(method = -2966251614502726297L)
    public ha() {
        try {
            if (j6) {
                iy.gn(-11234032124783260L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -11234032124783260L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -7303187445713611947L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(4740134079794999620L, this);
            }
            return new KeyStroke(48, false, true, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 4740134079794999620L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -5420559189154575656L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.logcatMenuFilterByTag;
            }
            iy.gn(335344606411645743L, this);
            return q.logcatMenuFilterByTag;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 335344606411645743L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -2784176799794140128L)
    public String getName() {
        try {
            if (!j6) {
                return "LogCat - Filter by Tag";
            }
            iy.gn(-2880007120564959271L, this);
            return "LogCat - Filter by Tag";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2880007120564959271L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -2740010286212555180L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(-2040454105179451131L, this);
            }
            return isVisible(false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2040454105179451131L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuCommand
    @ey(method = 2065962038374859216L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(-249535445193904605L, this, z);
            }
            return !ServiceContainer.P8.equals("com.aide.web");
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -249535445193904605L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -2227864185173936400L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(1506099147118862355L, this);
            }
            ServiceContainer.getMainActivity().g3().J0();
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1506099147118862355L, this);
            }
            throw th;
        }
    }
}
