package abcd;

import com.aide.ui.ServiceContainer;
import com.aide.ui.command.MenuCommand;
import com.aide.ui.q;

@cy(clazz = 1128548177819271783L, container = 1128548177819271783L, user = true)
/* loaded from: classes.dex */
public class uc implements MenuCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(uc.class);
    }

    @ey(method = 2310224082327626541L)
    public uc() {
        try {
            if (j6) {
                iy.gn(120354395215336191L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 120354395215336191L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 1012293135173149760L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.mainMenuStepOut;
            }
            iy.gn(4166999088937542369L, this);
            return q.mainMenuStepOut;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 4166999088937542369L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 3827229098429124304L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(-1147675684233186405L, this);
            }
            return ServiceContainer.getDebugger().a8();
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1147675684233186405L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuCommand
    @ey(method = 1481176968111304288L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(1397116386274247721L, this, z);
            }
            if (ServiceContainer.getDebugger().aM()) {
                if (!ServiceContainer.getMainActivity().sh().aq()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1397116386274247721L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 1447703419169180880L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-2105316431819181411L, this);
            }
            ServiceContainer.getDebugger().dx();
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2105316431819181411L, this);
            }
            throw th;
        }
    }
}
