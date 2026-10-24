package abcd;

import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.command.MenuCommand;
import com.aide.ui.q;
import com.aide.ui.util.FileSpan;

@cy(clazz = -3150568700139783819L, container = -3150568700139783819L, user = true)
/* loaded from: classes.dex */
public class ba implements MenuCommand, KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(ba.class);
    }

    @ey(method = 159438002187369943L)
    public ba() {
        try {
            if (j6) {
                iy.gn(7401997464301107184L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 7401997464301107184L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 5399925875422727605L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(-3976593394790534043L, this);
            }
            return new KeyStroke(51, false, true, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -3976593394790534043L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -4540981505593821120L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.editorMenuExpandSelection;
            }
            iy.gn(-3265528060298953632L, this);
            return q.editorMenuExpandSelection;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -3265528060298953632L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 2923364247706990400L)
    public String getName() {
        try {
            if (!j6) {
                return "Expand Selection";
            }
            iy.gn(2714898762657494784L, this);
            return "Expand Selection";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2714898762657494784L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -459486610987970204L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(-3100071135991647356L, this);
            }
            return ServiceContainer.getOpenFileService().j3();
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -3100071135991647356L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuCommand
    @ey(method = 677644791759277056L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(681312581751053568L, this, z);
            }
            if (!z) {
                if (isEnabled()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 681312581751053568L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -1067948290491531384L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(1738480477814329512L, this);
            }
            ServiceContainer.getMainActivity().w9();
            FileSpan currentFileSpan = ServiceContainer.getMainActivity().sh().getCurrentFileSpan();
            ServiceContainer.getEngineService().QX(currentFileSpan.j6, currentFileSpan.DW, currentFileSpan.FH, currentFileSpan.Hw, currentFileSpan.v5);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1738480477814329512L, this);
            }
            throw th;
        }
    }
}
