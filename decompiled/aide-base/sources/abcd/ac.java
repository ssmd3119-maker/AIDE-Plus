package abcd;

import com.aide.common.KeyStroke;
import com.aide.common.MessageBox;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.command.MenuItemCommand;
import com.aide.ui.q;

@cy(clazz = 3768662974146744001L, container = 3768662974146744001L, user = true)
/* loaded from: classes.dex */
public class ac implements MenuItemCommand, KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(ac.class);
    }

    @ey(method = 509329925868254856L)
    public ac() {
        try {
            if (j6) {
                iy.gn(3478849021179419672L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3478849021179419672L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -4926751944615708552L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(-4708938231800857997L, this);
            }
            return new KeyStroke(34, false, true, true);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -4708938231800857997L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 484377987041241205L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.editorMenuReplace;
            }
            iy.gn(-4237083777339414064L, this);
            return q.editorMenuReplace;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -4237083777339414064L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 564957431826266259L)
    public String getName() {
        try {
            if (!j6) {
                return "Replace Textually";
            }
            iy.gn(-1018100248882208840L, this);
            return "Replace Textually";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1018100248882208840L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 24979576595122323L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(-1856498839824296896L, this);
            }
            return ServiceContainer.getOpenFileService().XL();
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1856498839824296896L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -2089403373733345495L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-497156937938196000L, this);
            }
            MessageBox.gW(ServiceContainer.getMainActivity(), new qd());
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -497156937938196000L, this);
            }
            throw th;
        }
    }
}
