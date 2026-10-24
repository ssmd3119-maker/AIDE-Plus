package abcd;

import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.q;
import java.util.Arrays;
import java.util.List;

@cy(clazz = -1125690028135099520L, container = -1125690028135099520L, user = true)
/* loaded from: classes.dex */
public class dc implements eg, gg, rf {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(dc.class);
    }

    @ey(method = 801317467946054205L)
    public dc() {
        try {
            if (j6) {
                iy.gn(-2638462132660542075L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2638462132660542075L, null);
            }
            throw th;
        }
    }

    @Override // abcd.gg
    @ey(method = -8302637192170167L)
    public List<KeyStroke> Hw() {
        try {
            if (j6) {
                iy.gn(556447499286812773L, this);
            }
            return Arrays.asList(new KeyStroke(99, false, false, false), new KeyStroke(85, false, false, false));
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 556447499286812773L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -467854576522763625L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(-6894358151434349013L, this);
            }
            return new KeyStroke(33, false, true, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -6894358151434349013L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -31569097604827244L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.mainMenuRun;
            }
            iy.gn(1863889511366854400L, this);
            return q.mainMenuRun;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1863889511366854400L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 3069035956408865624L)
    public String getName() {
        try {
            if (!j6) {
                return "Run";
            }
            iy.gn(-1702832135242633248L, this);
            return "Run";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1702832135242633248L, this);
            }
            throw th;
        }
    }

    @Override // abcd.rf
    @ey(method = 7388896763249733632L)
    public int gn() {
        try {
            if (j6) {
                iy.gn(897958784390176188L, this);
            }
            return getMenuItemId();
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 897958784390176188L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -3794792800973230896L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(-2542090874942896328L, this);
            }
            if (ServiceContainer.isTrainerMode() || !ServiceContainer.getDebugger().aM()) {
                return ServiceContainer.getProjectService().J0();
            }
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2542090874942896328L, this);
            }
            throw th;
        }
    }

    @Override // abcd.rf
    @ey(method = -3932681689752813625L)
    public boolean isVisible() {
        try {
            if (!j6) {
                return true;
            }
            iy.gn(-2665797303696077493L, this);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2665797303696077493L, this);
            }
            throw th;
        }
    }

    @Override // abcd.eg, abcd.rf
    @ey(method = 1888671495371131847L)
    public String j6() {
        try {
            if (j6) {
                iy.gn(629406644637682615L, this);
            }
            if (ServiceContainer.isTrainerMode()) {
                return ServiceContainer.ro().er();
            }
            return null;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 629406644637682615L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -1231227424295352180L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-1310977944150341376L, this);
            }
            if (ServiceContainer.isTrainerMode()) {
                ServiceContainer.ro().br();
                return true;
            }
            if (ServiceContainer.getDebugger().aM()) {
                ServiceContainer.getDebugger().ei();
                return true;
            }
            ServiceContainer.getProjectService().buildProject(false);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1310977944150341376L, this);
            }
            throw th;
        }
    }
}
