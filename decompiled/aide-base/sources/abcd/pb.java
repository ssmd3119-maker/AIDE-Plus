package abcd;

import com.aide.ui.ServiceContainer;
import com.aide.ui.command.MenuItemCommand;
import com.aide.ui.q;

@cy(clazz = -4487701007491057224L, container = -4487701007491057224L, user = true)
/* loaded from: classes.dex */
public class pb implements MenuItemCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(pb.class);
    }

    @ey(method = -528266638587355755L)
    public pb() {
        try {
            if (j6) {
                iy.gn(-197006830843590383L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -197006830843590383L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 4283684610318831648L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.editorMenuOpenKeyboard;
            }
            iy.gn(1903863178554101880L, this);
            return q.editorMenuOpenKeyboard;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1903863178554101880L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -3318395360357696496L)
    public boolean isEnabled() {
        try {
            if (!j6) {
                return true;
            }
            iy.gn(3143740754497247140L, this);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3143740754497247140L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 2760960551736894320L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-954252820423248464L, this);
            }
            ServiceContainer.getMainActivity().sh().mb();
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -954252820423248464L, this);
            }
            throw th;
        }
    }
}
