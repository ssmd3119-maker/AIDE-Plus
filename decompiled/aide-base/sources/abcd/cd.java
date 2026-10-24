package abcd;

import com.aide.ui.ServiceContainer;
import com.aide.ui.command.MenuCommand;
import com.aide.ui.q;
import com.aide.ui.u;

@cy(clazz = 1865841937827309504L, container = 1865841937827309504L, user = true)
/* loaded from: classes.dex */
public class cd implements MenuCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(cd.class);
    }

    @ey(method = 1131158708626037865L)
    public cd() {
        try {
            if (j6) {
                iy.gn(-3596130444026869396L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -3596130444026869396L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 2593041642315509868L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.mainMenuGoPremium;
            }
            iy.gn(-1126182312997574811L, this);
            return q.mainMenuGoPremium;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1126182312997574811L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -555483519029394816L)
    public boolean isEnabled() {
        try {
            if (!j6) {
                return true;
            }
            iy.gn(-519892183379693385L, this);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -519892183379693385L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuCommand
    @ey(method = 1645194716136055832L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(49464320373395621L, this, z);
            }
            if (!ServiceContainer.P8.equals("com.aide.ui") && !ServiceContainer.P8.equals("com.aide.web")) {
                return false;
            }
            return !ServiceContainer.getLicenseService().FH();
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 49464320373395621L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 1441868256367312500L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(433169551518779185L, this);
            }
            ServiceContainer.getLicenseService().ro(ServiceContainer.gn(), u.shop_feature_features_and_lessons, "go_premium_command", false, false);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 433169551518779185L, this);
            }
            throw th;
        }
    }
}
