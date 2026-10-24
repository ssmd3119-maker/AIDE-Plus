package abcd;

import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.command.MenuCommand;
import com.aide.ui.q;

@cy(clazz = -910164129508867716L, container = -910164129508867716L, user = true)
/* loaded from: classes.dex */
public class jb implements MenuCommand, KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(jb.class);
    }

    @ey(method = 1341617740781292647L)
    public jb() {
        try {
            if (j6) {
                iy.gn(-7164619847835594720L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -7164619847835594720L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -4698420183900054267L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(2381651377620148840L, this);
            }
            return new KeyStroke(11, false, true, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2381651377620148840L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 3138290477734845520L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.mainMenuOpenDebugBrowser;
            }
            iy.gn(15370098516937801L, this);
            return q.mainMenuOpenDebugBrowser;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 15370098516937801L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 3212195076795938400L)
    public String getName() {
        try {
            if (!j6) {
                return "Show Debugger";
            }
            iy.gn(3065083594782239251L, this);
            return "Show Debugger";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3065083594782239251L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -3207045428687814332L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(178094128426028811L, this);
            }
            return !ServiceContainer.P8.equals("com.aide.web");
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 178094128426028811L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuCommand
    @ey(method = -186454395974979520L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(225446196100615305L, this, z);
            }
            return !ServiceContainer.P8.equals("com.aide.web");
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 225446196100615305L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 2363619521119356408L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(2215637762285604085L, this);
            }
            ServiceContainer.getMainActivity().mb();
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2215637762285604085L, this);
            }
            throw th;
        }
    }
}
