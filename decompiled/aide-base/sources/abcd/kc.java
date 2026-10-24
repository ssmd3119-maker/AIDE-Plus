package abcd;

import com.aide.common.AndroidHelper;
import com.aide.common.SocialDialog;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.MenuCommand;
import com.aide.ui.q;

@cy(clazz = 2466200591875626211L, container = 2466200591875626211L, user = true)
/* loaded from: classes.dex */
public class kc implements MenuCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(kc.class);
    }

    @ey(method = 2725707401127521568L)
    public kc() {
        try {
            if (j6) {
                iy.gn(-4441865446335553112L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -4441865446335553112L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -2537180119442193555L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.mainMenuCommunity;
            }
            iy.gn(-1075704527410664592L, this);
            return q.mainMenuCommunity;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1075704527410664592L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -3452877097397164701L)
    public boolean isEnabled() {
        try {
            if (!j6) {
                return true;
            }
            iy.gn(1291243204464814788L, this);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1291243204464814788L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuCommand
    @ey(method = -759845311580841375L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(344121394033761344L, this, z);
            }
            return !AndroidHelper.U2(ServiceContainer.getContext());
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 344121394033761344L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -2500159671584994447L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(2009152469703015000L, this);
            }
            SocialDialog.sG(ServiceContainer.getMainActivity());
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2009152469703015000L, this);
            }
            throw th;
        }
    }
}
