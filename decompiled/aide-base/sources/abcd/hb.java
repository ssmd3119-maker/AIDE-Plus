package abcd;

import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.command.MenuCommand;
import com.aide.ui.q;
import com.aide.ui.util.FileSystem;

@cy(clazz = 16858224954955104L, container = 16858224954955104L, user = true)
/* loaded from: classes.dex */
public class hb implements MenuCommand, KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(hb.class);
    }

    @ey(method = -2373041398084826508L)
    public hb() {
        try {
            if (j6) {
                iy.gn(1970771859849813620L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1970771859849813620L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -5659624019810556716L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(-1347936357372841764L, this);
            }
            return new KeyStroke(40, true, true, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1347936357372841764L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -1267570745651795865L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.filebrowserShowCurrent;
            }
            iy.gn(3508173617166415659L, this);
            return q.filebrowserShowCurrent;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3508173617166415659L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -3508812184405995975L)
    public String getName() {
        try {
            if (!j6) {
                return "Show Current File";
            }
            iy.gn(2646831432893531605L, this);
            return "Show Current File";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2646831432893531605L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -482376078238315179L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(-3381864813153783L, this);
            }
            if (ServiceContainer.getFileBrowserService().FH() == null && ServiceContainer.getOpenFileService().j3()) {
                if (!FileSystem.getParent(ServiceContainer.getOpenFileService().u7()).equals(ServiceContainer.getFileBrowserService().j6())) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -3381864813153783L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuCommand
    @ey(method = -42716674919985485L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(-329701303089707673L, this, z);
            }
            if (isEnabled()) {
                if (!ServiceContainer.P8.equals("com.aide.web")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -329701303089707673L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -2374202062398235237L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(1392507947551685055L, this);
            }
            String strU7 = ServiceContainer.getOpenFileService().u7();
            if (strU7 == null) {
                return true;
            }
            ServiceContainer.getFileBrowserService().Hw(FileSystem.getParent(strU7));
            ServiceContainer.getMainActivity().k2();
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1392507947551685055L, this);
            }
            throw th;
        }
    }
}
