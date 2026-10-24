package abcd;

import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.command.MenuCommand;
import com.aide.ui.q;

@cy(clazz = -4638575969049598929L, container = -4638575969049598929L, user = true)
/* loaded from: classes.dex */
public class u9 implements MenuCommand, KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(u9.class);
    }

    @ey(method = 1881260633356263675L)
    public u9() {
        try {
            if (j6) {
                iy.gn(4305526846198057389L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 4305526846198057389L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -1427413712277938511L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(4119864936404274660L, this);
            }
            return new KeyStroke(52, false, true, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 4119864936404274660L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 1576743084443429824L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.editorMenuCut;
            }
            iy.gn(2175513439979211903L, this);
            return q.editorMenuCut;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2175513439979211903L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -2994132037692415872L)
    public String getName() {
        try {
            if (!j6) {
                return "Cut";
            }
            iy.gn(-1085562641442098799L, this);
            return "Cut";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1085562641442098799L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -2495425142483786772L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(-3128853439440723907L, this);
            }
            if (ServiceContainer.getOpenFileService().XL()) {
                return !ServiceContainer.getMainActivity().sh().getCurrentFileSpan().j6();
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -3128853439440723907L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuCommand
    @ey(method = -371181581494445824L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(1220054993709577563L, this, z);
            }
            if (!z) {
                if (isEnabled()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1220054993709577563L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -1675440486512718920L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(293981054605533075L, this);
            }
            ServiceContainer.getMainActivity().sh().kQ();
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 293981054605533075L, this);
            }
            throw th;
        }
    }
}
