package abcd;

import com.aide.common.MessageBox;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.MenuCommand;
import com.aide.ui.q;
import com.aide.ui.u;

@cy(clazz = -644720002288844416L, container = -644720002288844416L, user = true)
/* loaded from: classes.dex */
public class xb implements MenuCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    @cy(clazz = -628666250001396885L, container = -644720002288844416L, user = true)
    class a implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        @dy(field = -8028358013941060235L)
        final /* synthetic */ String WB;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -349370121283137256L)
        public a(xb xbVar, String str) {
            this.WB = str;
        }

        @Override // java.lang.Runnable
        @ey(method = 137733090334772920L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(612187310360278653L, this);
                }
                ServiceContainer.getProjectService().Xa(this.WB);
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 612187310360278653L, this);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(xb.class);
    }

    @ey(method = 1528236692263999337L)
    public xb() {
        try {
            if (j6) {
                iy.gn(999083261433617607L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 999083261433617607L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 2748984087991455340L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.filebrowserMenuRemoveLibrary;
            }
            iy.gn(-4767724571421962724L, this);
            return q.filebrowserMenuRemoveLibrary;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -4767724571421962724L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -1470597585788992896L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(-3430996902607666480L, this);
            }
            return isVisible(false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -3430996902607666480L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuCommand
    @ey(method = -2092210102383516136L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(958475889253361976L, this, z);
            }
            String strFH = ServiceContainer.getFileBrowserService().FH();
            if (strFH != null) {
                if (ServiceContainer.getProjectService().we(strFH)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 958475889253361976L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -2378235934256461708L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-609364104161512348L, this);
            }
            String strFH = ServiceContainer.getFileBrowserService().FH();
            MessageBox.rN(ServiceContainer.getMainActivity(), ServiceContainer.KD(u.command_files_remove_library_from_project, new Object[0]), ServiceContainer.KD(u.dialog_remove_library_message, strFH, ServiceContainer.getProjectService().getCurrentAppHome()), new a(this, strFH), null);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -609364104161512348L, this);
            }
            throw th;
        }
    }
}
