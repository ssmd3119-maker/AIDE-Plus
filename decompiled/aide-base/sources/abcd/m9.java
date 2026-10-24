package abcd;

import android.content.ClipboardManager;
import android.widget.Toast;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.MenuCommand;
import com.aide.ui.q;
import com.aide.ui.u;

@cy(clazz = 721890227032694433L, container = 721890227032694433L, user = true)
/* loaded from: classes.dex */
public class m9 implements MenuCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(m9.class);
    }

    @ey(method = 2051229486418983000L)
    public m9() {
        try {
            if (j6) {
                iy.gn(-1569966905609893543L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1569966905609893543L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -1052225956568924475L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.filebrowserMenuCopyPath;
            }
            iy.gn(4224985518147712281L, this);
            return q.filebrowserMenuCopyPath;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 4224985518147712281L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 3783215718554567103L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(694700708403868543L, this);
            }
            return isVisible(false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 694700708403868543L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuCommand
    @ey(method = 266267415113982045L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(-767979704190966723L, this, z);
            }
            return ServiceContainer.getFileBrowserService().FH() != null;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -767979704190966723L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -736088637328165951L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(1567142991442636797L, this);
            }
            String strFH = ServiceContainer.getFileBrowserService().FH();
            if (strFH == null) {
                return true;
            }
            ((ClipboardManager) ServiceContainer.getContext().getSystemService("clipboard")).setText(strFH);
            Toast.makeText(ServiceContainer.getContext(), u.view_toast_copied_to_clipboard, 0).show();
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1567142991442636797L, this);
            }
            throw th;
        }
    }
}
