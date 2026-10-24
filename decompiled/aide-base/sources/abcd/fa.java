package abcd;

import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.command.MenuCommand;
import com.aide.ui.q;

@cy(clazz = -1731045703583694120L, container = -1731045703583694120L, user = true)
/* loaded from: classes.dex */
public class fa implements MenuCommand, KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(fa.class);
    }

    @ey(method = -1463632481323048383L)
    public fa() {
        try {
            if (j6) {
                iy.gn(1718673264230117328L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1718673264230117328L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -4730235196182361173L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(5319139224818067428L, this);
            }
            return new KeyStroke(44, false, true, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 5319139224818067428L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 4591861799509326832L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.logcatMenuFilterByPrio;
            }
            iy.gn(38158322321765727L, this);
            return q.logcatMenuFilterByPrio;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 38158322321765727L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 1347733128013702920L)
    public String getName() {
        try {
            if (!j6) {
                return "LogCat - Filter by Priority";
            }
            iy.gn(-564364448397371631L, this);
            return "LogCat - Filter by Priority";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -564364448397371631L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -2091846225754143840L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(-3366034832185236995L, this);
            }
            return isVisible(false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -3366034832185236995L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuCommand
    @ey(method = -1975254958937312344L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(556923110184581019L, this, z);
            }
            return !ServiceContainer.P8.equals("com.aide.web");
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 556923110184581019L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -1268898523619866880L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-654892213879300941L, this);
            }
            ServiceContainer.getMainActivity().g3().EQ();
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -654892213879300941L, this);
            }
            throw th;
        }
    }
}
