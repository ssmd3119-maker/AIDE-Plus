package abcd;

import com.aide.ui.ServiceContainer;
import com.aide.ui.activities.TrainerCourseActivity;
import com.aide.ui.command.MenuCommand;
import com.aide.ui.q;

@cy(clazz = -7123458150197686377L, container = -7123458150197686377L, user = true)
/* loaded from: classes.dex */
public class gb implements MenuCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(gb.class);
    }

    @ey(method = 2492165808673598473L)
    public gb() {
        try {
            if (j6) {
                iy.gn(4428936755619537064L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 4428936755619537064L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -4881910380879618900L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.mainMenuTrainerMode;
            }
            iy.gn(3322353250765122280L, this);
            return q.mainMenuTrainerMode;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3322353250765122280L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -2416802882105074960L)
    public boolean isEnabled() {
        try {
            if (!j6) {
                return true;
            }
            iy.gn(2328394127741299296L, this);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2328394127741299296L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuCommand
    @ey(method = -1368079627753764728L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(-213963124776481900L, this, z);
            }
            return ServiceContainer.ro().dx();
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -213963124776481900L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 73328679203710036L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(1307096376982046024L, this);
            }
            TrainerCourseActivity.rN(ServiceContainer.getMainActivity());
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1307096376982046024L, this);
            }
            throw th;
        }
    }
}
