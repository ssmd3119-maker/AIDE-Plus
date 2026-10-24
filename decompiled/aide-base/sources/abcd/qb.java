package abcd;

import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.command.MenuItemCommand;
import com.aide.ui.q;
import java.util.Hashtable;

@cy(clazz = -2636757006992616960L, container = -2636757006992616960L, user = true)
/* loaded from: classes.dex */
public class qb implements MenuItemCommand, KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(qb.class);
    }

    @ey(method = 1737799759605337856L)
    public qb() {
        try {
            if (j6) {
                iy.gn(-455097972512812629L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -455097972512812629L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -7370324586624280160L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(-539148444469165047L, this);
            }
            return new KeyStroke(43, false, true, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -539148444469165047L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 4795792475376140679L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.editorMenuOrganizeImports;
            }
            iy.gn(1966275430226869720L, this);
            return q.editorMenuOrganizeImports;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1966275430226869720L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -540995331099226179L)
    public String getName() {
        try {
            if (!j6) {
                return "Organize Imports";
            }
            iy.gn(-3100185794547637020L, this);
            return "Organize Imports";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -3100185794547637020L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 2861888996350133265L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(1877506555689493824L, this);
            }
            if (ServiceContainer.getOpenFileService().QX()) {
                if (ServiceContainer.getOpenFileService().XL()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1877506555689493824L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 1988482231293159875L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-1534878061815036200L, this);
            }
            ServiceContainer.getMainActivity().w9();
            ServiceContainer.getEngineService().yS(ServiceContainer.getOpenFileService().u7(), new Hashtable<>());
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1534878061815036200L, this);
            }
            throw th;
        }
    }
}
