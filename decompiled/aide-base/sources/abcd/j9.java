package abcd;

import com.aide.common.MessageBox;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.MenuItemCommand;
import com.aide.ui.q;
import com.aide.ui.u;

@cy(clazz = 345764202926190576L, container = 345764202926190576L, user = true)
/* loaded from: classes.dex */
public class j9 implements MenuItemCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    @cy(clazz = 2225921851922964629L, container = 345764202926190576L, user = true)
    class a implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -2409291139817402201L)
        public a() {
        }

        @Override // java.lang.Runnable
        @ey(method = 79995377932394961L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(1351678646815208195L, this);
                }
                ServiceContainer.getOpenFileService().KD(false, false);
                j9.this.EQ();
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 1351678646815208195L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 2226010332680855552L, container = 345764202926190576L, user = true)
    class b implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(b.class);
        }

        @ey(method = -7280160990754220271L)
        public b() {
        }

        @Override // java.lang.Runnable
        @ey(method = -1303438752489792121L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(1355215073354199288L, this);
                }
                j9.this.EQ();
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 1355215073354199288L, this);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(j9.class);
    }

    @ey(method = -2983356929146175241L)
    public j9() {
        try {
            if (j6) {
                iy.gn(-1422772237241851632L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1422772237241851632L, null);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 695521536049082655L)
    public void EQ() {
        try {
            if (j6) {
                iy.gn(-3739472669569955400L, this);
            }
            ServiceContainer.getProjectService().Ws();
            ServiceContainer.getFileBrowserService().v5();
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -3739472669569955400L, this);
            }
            throw th;
        }
    }

    @ey(method = -422623229047143220L)
    private void tp() {
        try {
            if (j6) {
                iy.gn(-1397127865004406171L, this);
            }
            if (ServiceContainer.getOpenFileService().U2()) {
                MessageBox.a8(ServiceContainer.getMainActivity(), u.dialog_save_files_title, u.dialog_save_files_message, new a(), new b());
            } else {
                EQ();
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1397127865004406171L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -4952893026232799544L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.mainMenuCloseProject;
            }
            iy.gn(237209124506780685L, this);
            return q.mainMenuCloseProject;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 237209124506780685L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 1905662184987699072L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(3271255988121347303L, this);
            }
            return ServiceContainer.getProjectService().isOpenProject();
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3271255988121347303L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -868565617616165272L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-1869928374972043575L, this);
            }
            tp();
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1869928374972043575L, this);
            }
            throw th;
        }
    }
}
