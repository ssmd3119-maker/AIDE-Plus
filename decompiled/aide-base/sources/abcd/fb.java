package abcd;

import com.aide.common.MessageBox;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.MenuItemCommand;
import com.aide.ui.q;

@cy(clazz = -3096042151719793395L, container = -3096042151719793395L, user = true)
/* loaded from: classes.dex */
public class fb implements MenuItemCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    @cy(clazz = 3303715462261183200L, container = -3096042151719793395L, user = true)
    class a implements Runnable {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 35025980290134288L)
        public a(fb fbVar) {
        }

        @Override // java.lang.Runnable
        @ey(method = -1969364958955204672L)
        public void run() {
            try {
                if (WB) {
                    iy.gn(1773365321265752539L, this);
                }
                if (ServiceContainer.getLicenseService().VH(ServiceContainer.getMainActivity(), "learn_code_style")) {
                    ServiceContainer.getEngineService().rN(ServiceContainer.getOpenFileService().u7(), ServiceContainer.getMainActivity().sh().getTabSize());
                }
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, 1773365321265752539L, this);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(fb.class);
    }

    @ey(method = -2294977981977359289L)
    public fb() {
        try {
            if (j6) {
                iy.gn(-4779444381087987688L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -4779444381087987688L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 3700598313311151144L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.editorMenuLearnCodeStyle;
            }
            iy.gn(-4702552837091906336L, this);
            return q.editorMenuLearnCodeStyle;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -4702552837091906336L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 2866798539302860800L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(1599937511350268116L, this);
            }
            return ServiceContainer.getOpenFileService().Ws();
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1599937511350268116L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 1229151393418387080L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(2396930022608496392L, this);
            }
            MessageBox.rN(ServiceContainer.getMainActivity(), "Learn Code Style", "AIDE will learn the code style from this file and update the settings to match the formatting of the code in this file. Continue?", new a(this), null);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2396930022608496392L, this);
            }
            throw th;
        }
    }
}
