package abcd;

import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.command.MenuItemCommand;
import com.aide.ui.q;
import com.aide.ui.util.FileSpan;

@cy(clazz = 1383477999349039455L, container = 1383477999349039455L, user = true)
/* loaded from: classes.dex */
public class da implements MenuItemCommand, KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(da.class);
    }

    @ey(method = -1795447630989031824L)
    public da() {
        try {
            if (j6) {
                iy.gn(-5257108180500863505L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -5257108180500863505L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 141760792487190240L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(-1833314099865848040L, this);
            }
            return new KeyStroke(41, true, true, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1833314099865848040L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -1708497352804577993L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.editorMenuExtractMethod;
            }
            iy.gn(-1919099203794918167L, this);
            return q.editorMenuExtractMethod;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1919099203794918167L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -2535710727850381611L)
    public String getName() {
        try {
            if (!j6) {
                return "Extract Method";
            }
            iy.gn(1646496174255303267L, this);
            return "Extract Method";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1646496174255303267L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -1853501618239333335L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(-1886567579053952517L, this);
            }
            if (ServiceContainer.getOpenFileService().QX()) {
                if (ServiceContainer.getOpenFileService().XL()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1886567579053952517L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 2314297309002214051L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-582816060370787339L, this);
            }
            FileSpan currentFileSpan = ServiceContainer.getMainActivity().sh().getCurrentFileSpan();
            ServiceContainer.getMainActivity().w9();
            ServiceContainer.getEngineService().XL(currentFileSpan.j6, currentFileSpan.DW, currentFileSpan.FH, currentFileSpan.Hw, currentFileSpan.v5);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -582816060370787339L, this);
            }
            throw th;
        }
    }
}
