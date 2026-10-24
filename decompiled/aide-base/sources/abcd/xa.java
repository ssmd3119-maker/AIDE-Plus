package abcd;

import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.activities.GotoBrowserActivity;
import com.aide.ui.command.KeyStrokeCommand;

@cy(clazz = -304691514043388616L, container = -304691514043388616L, user = true)
/* loaded from: classes.dex */
public class xa implements KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(xa.class);
    }

    @ey(method = -2328931768637801080L)
    public xa() {
        try {
            if (j6) {
                iy.gn(3633100044930591429L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3633100044930591429L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -2881621587533922504L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(6310846846060474499L, this);
            }
            return new KeyStroke(48, false, true, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 6310846846060474499L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -711572347105540713L)
    public String getName() {
        try {
            if (!j6) {
                return "GoTo Class";
            }
            iy.gn(-1188143076614577832L, this);
            return "GoTo Class";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1188143076614577832L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -2338498239245691329L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(775188184129202624L, this);
            }
            return ServiceContainer.getProjectService().isOpenProject();
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 775188184129202624L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -1720318867327762995L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(839777026620694304L, this);
            }
            GotoBrowserActivity.EQ(ServiceContainer.getMainActivity(), false, 12);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 839777026620694304L, this);
            }
            throw th;
        }
    }
}
