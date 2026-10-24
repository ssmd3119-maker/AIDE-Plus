package abcd;

import com.aide.common.AIDEHelpActivityStarter;
import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.activities.a;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.command.MenuCommand;
import com.aide.ui.q;
import com.aide.ui.util.FileSpan;

@cy(clazz = 465002612051996932L, container = 465002612051996932L, user = true)
/* loaded from: classes.dex */
public class jc implements MenuCommand, KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(jc.class);
    }

    @ey(method = -943684357939882839L)
    public jc() {
        try {
            if (j6) {
                iy.gn(-6724311519772629792L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -6724311519772629792L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -3387252841710519341L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(2129451210664709552L, this);
            }
            return new KeyStroke(36, false, true, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2129451210664709552L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -2786525725894088256L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.editorMenuHelp;
            }
            iy.gn(-535864780643306395L, this);
            return q.editorMenuHelp;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -535864780643306395L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -891596581829854032L)
    public String getName() {
        try {
            if (!j6) {
                return "Show Code Help";
            }
            iy.gn(1930219337727044351L, this);
            return "Show Code Help";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1930219337727044351L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 2496414290930456824L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(171969855117068575L, this);
            }
            if (!ServiceContainer.getOpenFileService().aM()) {
                return true;
            }
            if (ServiceContainer.getOpenFileService().Ws()) {
                if (ServiceContainer.getMainActivity().sh().getCurrentFileSpan().FH()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 171969855117068575L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuCommand
    @ey(method = 139307686817388816L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(-116693011462793795L, this, z);
            }
            return isEnabled();
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -116693011462793795L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 2254815441454745664L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-597019694372421663L, this);
            }
            if (!ServiceContainer.getOpenFileService().aM()) {
                AIDEHelpActivityStarter.DW(ServiceContainer.getMainActivity(), null, a.Zo().toString());
                return true;
            }
            FileSpan currentFileSpan = ServiceContainer.getMainActivity().sh().getCurrentFileSpan();
            ServiceContainer.SI().lg(currentFileSpan.j6, currentFileSpan.DW, currentFileSpan.FH, currentFileSpan.Hw, currentFileSpan.v5);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -597019694372421663L, this);
            }
            throw th;
        }
    }
}
