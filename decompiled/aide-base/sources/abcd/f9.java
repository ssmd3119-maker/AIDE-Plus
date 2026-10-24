package abcd;

import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.command.MenuCommand;
import com.aide.ui.q;

@cy(clazz = -2617458321604875216L, container = -2617458321604875216L, user = true)
/* loaded from: classes.dex */
public class f9 implements MenuCommand, KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(f9.class);
    }

    @ey(method = -2672415627036241581L)
    public f9() {
        try {
            if (j6) {
                iy.gn(-460474796801084535L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -460474796801084535L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 3241589751953525505L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(-6667495459720058763L, this);
            }
            return new KeyStroke(35, false, true, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -6667495459720058763L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -2311943101882613752L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.logcatMenuClearFilter;
            }
            iy.gn(-2567530291767848248L, this);
            return q.logcatMenuClearFilter;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2567530291767848248L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 3104859659135065428L)
    public String getName() {
        try {
            if (!j6) {
                return "LogCat - Clear Filter";
            }
            iy.gn(-398127257651957700L, this);
            return "LogCat - Clear Filter";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -398127257651957700L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -2008285787725220192L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(-1564417540248698880L, this);
            }
            return ServiceContainer.getMainActivity().g3().QX();
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1564417540248698880L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuCommand
    @ey(method = 1148519532505371956L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(-1512961560537132548L, this, z);
            }
            return !ServiceContainer.P8.equals("com.aide.web");
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1512961560537132548L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 1996454262773173544L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-347219446373773336L, this);
            }
            ServiceContainer.getMainActivity().g3().VH();
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -347219446373773336L, this);
            }
            throw th;
        }
    }
}
