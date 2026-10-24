package abcd;

import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import java.util.Arrays;
import java.util.List;

@cy(clazz = -1715340921930816664L, container = -1715340921930816664L, user = true)
/* loaded from: classes.dex */
public class nc implements gg {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(nc.class);
    }

    @ey(method = 2771554746051570773L)
    public nc() {
        try {
            if (j6) {
                iy.gn(-3596485110093511845L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -3596485110093511845L, null);
            }
            throw th;
        }
    }

    @Override // abcd.gg
    @ey(method = 218212810704557905L)
    public List<KeyStroke> Hw() {
        try {
            if (j6) {
                iy.gn(-296570423580104947L, this);
            }
            return Arrays.asList(new KeyStroke(100, false, false, false));
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -296570423580104947L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -6314762003535689665L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(-2230236819848731245L, this);
            }
            return new KeyStroke(66, false, false, true);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2230236819848731245L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -2606269388259786040L)
    public String getName() {
        try {
            if (!j6) {
                return "Files - Open Context Menu";
            }
            iy.gn(-3093791374289369424L, this);
            return "Files - Open Context Menu";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -3093791374289369424L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 557322159421574096L)
    public boolean isEnabled() {
        try {
            if (!j6) {
                return true;
            }
            iy.gn(-1231647817897824392L, this);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1231647817897824392L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 2129169434976156700L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-491102756582862528L, this);
            }
            ServiceContainer.getMainActivity().sG().J0();
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -491102756582862528L, this);
            }
            throw th;
        }
    }
}
