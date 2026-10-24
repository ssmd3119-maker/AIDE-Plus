package abcd;

import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.command.MenuCommand;
import com.aide.ui.q;

@cy(clazz = -748939391378982480L, container = -748939391378982480L, user = true)
/* loaded from: classes.dex */
public class cc implements MenuCommand, KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(cc.class);
    }

    @ey(method = -1511800169496004360L)
    public cc() {
        try {
            if (j6) {
                iy.gn(-2413369227690174263L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2413369227690174263L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -681100882117126808L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(-4038153591663674211L, this);
            }
            return new KeyStroke(46, false, true, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -4038153591663674211L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 1741737395835216461L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.logcatMenuResume;
            }
            iy.gn(4397025399800597640L, this);
            return q.logcatMenuResume;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 4397025399800597640L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 2891142883468368475L)
    public String getName() {
        try {
            if (!j6) {
                return "LogCat - Resume";
            }
            iy.gn(-1513934999977906740L, this);
            return "LogCat - Resume";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1513934999977906740L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -3924499383887728789L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(-3623591842070391168L, this);
            }
            return isVisible(false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -3623591842070391168L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuCommand
    @ey(method = 905751281910217945L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(231770123229137100L, this, z);
            }
            return ServiceContainer.getMainActivity().g3().XL();
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 231770123229137100L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -851654137875438975L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-2092465176344470872L, this);
            }
            ServiceContainer.getMainActivity().g3().j3();
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2092465176344470872L, this);
            }
            throw th;
        }
    }
}
