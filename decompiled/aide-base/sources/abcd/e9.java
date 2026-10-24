package abcd;

import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.command.MenuCommand;
import com.aide.ui.q;

@cy(clazz = -5809336682391829623L, container = -5809336682391829623L, user = true)
/* loaded from: classes.dex */
public class e9 implements MenuCommand, KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(e9.class);
    }

    @ey(method = -2247111611860067968L)
    public e9() {
        try {
            if (j6) {
                iy.gn(-914083468661168057L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -914083468661168057L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 2321494530110164368L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(-930859728129450180L, this);
            }
            return new KeyStroke(52, false, true, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -930859728129450180L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 4281251014283247363L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.logcatMenuClear;
            }
            iy.gn(-3320202311068004509L, this);
            return q.logcatMenuClear;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -3320202311068004509L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -639933580981547087L)
    public String getName() {
        try {
            if (!j6) {
                return "LogCat - Clear";
            }
            iy.gn(-820084190919976443L, this);
            return "LogCat - Clear";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -820084190919976443L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -3847970707756172739L)
    public boolean isEnabled() {
        try {
            if (!j6) {
                return true;
            }
            iy.gn(79835759472715209L, this);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 79835759472715209L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuCommand
    @ey(method = 185746820541116195L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(-1210535529441446649L, this, z);
            }
            return !ServiceContainer.P8.equals("com.aide.web");
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1210535529441446649L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -1114737539532906465L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-2150727455361082265L, this);
            }
            ServiceContainer.getMainActivity().g3().Zo();
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2150727455361082265L, this);
            }
            throw th;
        }
    }
}
