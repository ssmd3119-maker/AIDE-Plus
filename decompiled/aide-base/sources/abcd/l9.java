package abcd;

import com.aide.ui.ServiceContainer;
import com.aide.ui.command.MenuCommand;
import com.aide.ui.q;

@cy(clazz = 5041887407246148000L, container = 5041887407246148000L, user = true)
/* loaded from: classes.dex */
public class l9 implements MenuCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(l9.class);
    }

    @ey(method = 1444737488963166811L)
    public l9() {
        try {
            if (j6) {
                iy.gn(-1390240090186276883L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1390240090186276883L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -3223263176864164280L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.editorMenuCopy;
            }
            iy.gn(-1342948849552423728L, this);
            return q.editorMenuCopy;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1342948849552423728L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 2753808292614897804L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(-2597132864692682656L, this);
            }
            if (ServiceContainer.getOpenFileService().j3()) {
                return !ServiceContainer.getMainActivity().sh().getCurrentFileSpan().j6();
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2597132864692682656L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuCommand
    @ey(method = 293617322774709280L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(-592232941134539592L, this, z);
            }
            if (!z) {
                if (isEnabled()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -592232941134539592L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -788669854667760752L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-1390345614667386720L, this);
            }
            ServiceContainer.getMainActivity().sh().XX();
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1390345614667386720L, this);
            }
            throw th;
        }
    }
}
