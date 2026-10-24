package abcd;

import com.aide.ui.ServiceContainer;
import com.aide.ui.command.MenuItemCommand;
import com.aide.ui.q;

@cy(clazz = 1480971950371133479L, container = 1480971950371133479L, user = true)
/* loaded from: classes.dex */
public class k9 implements MenuItemCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(k9.class);
    }

    @ey(method = -1253679534599875131L)
    public k9() {
        try {
            if (j6) {
                iy.gn(667478408546609289L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 667478408546609289L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -148066755458395968L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.editorMenuConfigureCodeStyle;
            }
            iy.gn(-4809786781548532377L, this);
            return q.editorMenuConfigureCodeStyle;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -4809786781548532377L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -2079812523831122048L)
    public boolean isEnabled() {
        try {
            if (!j6) {
                return true;
            }
            iy.gn(-524554371374719371L, this);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -524554371374719371L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -487079800209578640L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(1983507832127144539L, this);
            }
            ServiceContainer.getMainActivity().IS(2);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1983507832127144539L, this);
            }
            throw th;
        }
    }
}
