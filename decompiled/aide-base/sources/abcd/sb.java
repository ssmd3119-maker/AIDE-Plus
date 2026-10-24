package abcd;

import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.command.MenuCommand;
import com.aide.ui.q;

@cy(clazz = 5162497300632604368L, container = 5162497300632604368L, user = true)
/* loaded from: classes.dex */
public class sb implements MenuCommand, KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(sb.class);
    }

    @ey(method = 2407722908054815832L)
    public sb() {
        try {
            if (j6) {
                iy.gn(108597299238281211L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 108597299238281211L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 6613686954087041136L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(1591244279807341137L, this);
            }
            return new KeyStroke(50, false, true, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1591244279807341137L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -2031588791312429947L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.editorMenuPaste;
            }
            iy.gn(-3228583808404134640L, this);
            return q.editorMenuPaste;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -3228583808404134640L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 3412497361123379871L)
    public String getName() {
        try {
            if (!j6) {
                return "Paste";
            }
            iy.gn(-2128878873011474844L, this);
            return "Paste";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2128878873011474844L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 961756954726940543L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(2919481932950537280L, this);
            }
            return ServiceContainer.getOpenFileService().XL();
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2919481932950537280L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuCommand
    @ey(method = -478429616449341155L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(-223602969062244524L, this, z);
            }
            if (!z) {
                if (isEnabled()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -223602969062244524L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 152155100823741825L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-1888786814577970560L, this);
            }
            ServiceContainer.getMainActivity().sh().jw();
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1888786814577970560L, this);
            }
            throw th;
        }
    }
}
