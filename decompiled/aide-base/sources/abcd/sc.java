package abcd;

import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;

@cy(clazz = 4839221975418944545L, container = 4839221975418944545L, user = true)
/* loaded from: classes.dex */
public class sc implements KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(sc.class);
    }

    @ey(method = 673121255187090932L)
    public sc() {
        try {
            if (j6) {
                iy.gn(2761894049953643605L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2761894049953643605L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -6542583095249466956L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(-1596218008254015200L, this);
            }
            return new KeyStroke(61, false, false, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1596218008254015200L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -1023579844627991095L)
    public String getName() {
        try {
            if (!j6) {
                return "Code Completion";
            }
            iy.gn(-1443076353377275057L, this);
            return "Code Completion";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1443076353377275057L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 1443587260389504485L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(3075952568390260047L, this);
            }
            return ServiceContainer.getOpenFileService().j3();
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3075952568390260047L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 622418172751197499L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-1908244350440729535L, this);
            }
            ServiceContainer.getMainActivity().sh().Q6();
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1908244350440729535L, this);
            }
            throw th;
        }
    }
}
