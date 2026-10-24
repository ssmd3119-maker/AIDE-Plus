package abcd;

import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;

@cy(clazz = 3508023783170159463L, container = 3508023783170159463L, user = true)
/* loaded from: classes.dex */
public class mc implements KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(mc.class);
    }

    @ey(method = 2502664472059939965L)
    public mc() {
        try {
            if (j6) {
                iy.gn(-2319710295432828936L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2319710295432828936L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 5018365666407073535L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(-1664015300450697363L, this);
            }
            return new KeyStroke(66, false, false, true);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1664015300450697363L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -2689355258073220800L)
    public String getName() {
        try {
            if (!j6) {
                return "Open Editor Context Menu";
            }
            iy.gn(-1905346370623079220L, this);
            return "Open Editor Context Menu";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1905346370623079220L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -71685447277372752L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(-1222249760969910912L, this);
            }
            return ServiceContainer.getOpenFileService().j3();
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1222249760969910912L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 1036142522870007440L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(114874262999255992L, this);
            }
            ServiceContainer.getMainActivity().sh().WB();
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 114874262999255992L, this);
            }
            throw th;
        }
    }
}
