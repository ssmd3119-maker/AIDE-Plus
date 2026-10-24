package abcd;

import com.aide.common.MessageBox;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.MenuCommand;
import com.aide.ui.q;
import com.aide.ui.u;

@cy(clazz = 86708045681377899L, container = 86708045681377899L, user = true)
/* loaded from: classes.dex */
public class h9 implements MenuCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    @cy(clazz = -1189220646211328416L, container = 86708045681377899L, user = true)
    class a implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        @dy(field = 2453235966670505600L)
        final /* synthetic */ String WB;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -7472540496870064088L)
        public a(h9 h9Var, String str) {
            this.WB = str;
        }

        @Override // java.lang.Runnable
        @ey(method = -527660456972033104L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(2669563068590898432L, this);
                }
                ServiceContainer.getOpenFileService().Hw(this.WB);
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 2669563068590898432L, this);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(h9.class);
    }

    @ey(method = -916581491354567880L)
    public h9() {
        try {
            if (j6) {
                iy.gn(1376884223088937673L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1376884223088937673L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -1244672243985340035L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.editorMenuClose;
            }
            iy.gn(2377579153998010299L, this);
            return q.editorMenuClose;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2377579153998010299L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 2138998518187795287L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(-610495631830798875L, this);
            }
            return ServiceContainer.getOpenFileService().j3();
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -610495631830798875L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuCommand
    @ey(method = -1753991153725538283L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(349285953593365035L, this, z);
            }
            if (!z && isEnabled()) {
                if (!ServiceContainer.isTrainerMode()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 349285953593365035L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 1976056353873077049L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(723512440035809655L, this);
            }
            String strU7 = ServiceContainer.getOpenFileService().u7();
            if (ServiceContainer.getOpenFileService().getOpenFileModel(strU7).sG()) {
                MessageBox.a8(ServiceContainer.getMainActivity(), u.dialog_close_file_title, u.dialog_close_file_message, new a(this, strU7), null);
                return true;
            }
            ServiceContainer.getOpenFileService().Hw(strU7);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 723512440035809655L, this);
            }
            throw th;
        }
    }
}
