package abcd;

import android.widget.Toast;
import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.command.MenuItemCommand;
import com.aide.ui.q;
import com.aide.ui.u;

@cy(clazz = -2759745551108874640L, container = -2759745551108874640L, user = true)
/* loaded from: classes.dex */
public class ec implements MenuItemCommand, KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(ec.class);
    }

    @ey(method = 2861574623042658496L)
    public ec() {
        try {
            if (j6) {
                iy.gn(-2939852458714599913L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2939852458714599913L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 363096262763433600L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(-7616044302918727215L, this);
            }
            return new KeyStroke(47, false, true, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -7616044302918727215L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 1178923086439403227L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.mainMenuSave;
            }
            iy.gn(-1777107101505119448L, this);
            return q.mainMenuSave;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1777107101505119448L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 429522780940007697L)
    public String getName() {
        try {
            if (!j6) {
                return "Save Files";
            }
            iy.gn(-604220783648218160L, this);
            return "Save Files";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -604220783648218160L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -1836077227463982195L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(1854330598794059628L, this);
            }
            return ServiceContainer.getOpenFileService().U2();
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1854330598794059628L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -2032099210159811705L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(392793400537119600L, this);
            }
            if (ServiceContainer.getOpenFileService().Mr()) {
                ServiceContainer.getProjectService().br();
            } else {
                ServiceContainer.getOpenFileService().KD(true, true);
                Toast.makeText(ServiceContainer.getContext(), u.view_toast_files_saved, 0).show();
            }
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 392793400537119600L, this);
            }
            throw th;
        }
    }
}
