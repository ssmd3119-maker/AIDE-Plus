package abcd;

import com.aide.common.MessageBox;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.MenuCommand;
import com.aide.ui.q;
import com.aide.ui.u;

@cy(clazz = 520981224168838091L, container = 520981224168838091L, user = true)
/* loaded from: classes.dex */
public class z8 implements MenuCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    @cy(clazz = -499928403321327552L, container = 520981224168838091L, user = true)
    class a implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        @dy(field = -2621268277274376720L)
        final /* synthetic */ String WB;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 8536617311909184L)
        public a(z8 z8Var, String str) {
            this.WB = str;
        }

        @Override // java.lang.Runnable
        @ey(method = -1354218025666012059L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(2348582978422633701L, this);
                }
                ServiceContainer.getProjectService().v5(this.WB);
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 2348582978422633701L, this);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(z8.class);
    }

    @ey(method = 3122128302199746056L)
    public z8() {
        try {
            if (j6) {
                iy.gn(-5376741292876873136L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -5376741292876873136L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 1046010280966836925L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.filebrowserMenuAddLibrary;
            }
            iy.gn(3961593081048412144L, this);
            return q.filebrowserMenuAddLibrary;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3961593081048412144L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -3040994433490211161L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(-1468443072317536896L, this);
            }
            return isVisible(false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1468443072317536896L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuCommand
    @ey(method = -848085652446510075L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(-687107275644048760L, this, z);
            }
            String strFH = ServiceContainer.getFileBrowserService().FH();
            if (strFH != null) {
                if (ServiceContainer.getProjectService().gn(strFH)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -687107275644048760L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -1375616677675744423L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-397042473885469888L, this);
            }
            String strFH = ServiceContainer.getFileBrowserService().FH();
            MessageBox.rN(ServiceContainer.getMainActivity(), ServiceContainer.KD(u.command_files_add_library_to_project, new Object[0]), ServiceContainer.KD(u.dialog_add_library_message, strFH, ServiceContainer.getProjectService().getCurrentAppHome()), new a(this, strFH), null);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -397042473885469888L, this);
            }
            throw th;
        }
    }
}
