package abcd;

import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.command.MenuItemCommand;
import com.aide.ui.q;
import com.aide.ui.util.FileSpan;

@cy(clazz = -6574963065253411921L, container = -6574963065253411921L, user = true)
/* loaded from: classes.dex */
public class xc implements MenuItemCommand, KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(xc.class);
    }

    @ey(method = -2666167885689276400L)
    public xc() {
        try {
            if (j6) {
                iy.gn(324219766120382225L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 324219766120382225L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 1268775973886827776L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(459706499390140032L, this);
            }
            return new KeyStroke(48, true, true, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 459706499390140032L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 3679023597592767775L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.editorMenuSurroundWithTryCatch;
            }
            iy.gn(-5037800781129436897L, this);
            return q.editorMenuSurroundWithTryCatch;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -5037800781129436897L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -2753084886308595971L)
    public String getName() {
        try {
            if (!j6) {
                return "Surround with try-catch";
            }
            iy.gn(-286256404740877307L, this);
            return "Surround with try-catch";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -286256404740877307L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -3744145286082931359L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(-166407011441868535L, this);
            }
            if (ServiceContainer.getOpenFileService().QX()) {
                if (ServiceContainer.getOpenFileService().XL()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -166407011441868535L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -511118622822290581L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(102300444272021787L, this);
            }
            FileSpan currentFileSpan = ServiceContainer.getMainActivity().sh().getCurrentFileSpan();
            ServiceContainer.getMainActivity().w9();
            ServiceContainer.getEngineService().XX(currentFileSpan.j6, currentFileSpan.DW, currentFileSpan.FH, currentFileSpan.Hw, currentFileSpan.v5);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 102300444272021787L, this);
            }
            throw th;
        }
    }
}
