package abcd;

import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.activities.GotoBrowserActivity;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.command.MenuItemCommand;
import com.aide.ui.q;

@cy(clazz = -705504967078967784L, container = -705504967078967784L, user = true)
/* loaded from: classes.dex */
public class cb implements MenuItemCommand, KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(cb.class);
    }

    @ey(method = -208972372072608179L)
    public cb() {
        try {
            if (j6) {
                iy.gn(4854646396753910568L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 4854646396753910568L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 1381855110888447039L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(-4262452799780428280L, this);
            }
            return new KeyStroke(35, false, true, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -4262452799780428280L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 3286012582292266080L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.mainMenuGoto;
            }
            iy.gn(-3781179392106130875L, this);
            return q.mainMenuGoto;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -3781179392106130875L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -2692078161482013224L)
    public String getName() {
        try {
            if (!j6) {
                return "GoTo Symbol";
            }
            iy.gn(-1317034566560717229L, this);
            return "GoTo Symbol";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1317034566560717229L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 2398760749331009128L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(-65605793341367405L, this);
            }
            return ServiceContainer.getProjectService().isOpenProject();
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -65605793341367405L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 541785240259624448L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-1067545270157890407L, this);
            }
            GotoBrowserActivity.EQ(ServiceContainer.getMainActivity(), true, 12);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1067545270157890407L, this);
            }
            throw th;
        }
    }
}
