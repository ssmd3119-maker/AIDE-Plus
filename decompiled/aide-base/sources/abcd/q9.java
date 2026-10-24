package abcd;

import com.aide.common.MessageBox;
import com.aide.common.ValueRunnable;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.MenuCommand;
import com.aide.ui.q;
import com.aide.ui.u;
import com.aide.ui.util.FileSpan;
import com.aide.ui.util.FileSystem;
import java.io.File;
import java.io.IOException;

@cy(clazz = -149619975250772417L, container = -149619975250772417L, user = true)
/* loaded from: classes.dex */
public class q9 implements MenuCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    @cy(clazz = -469788443675121908L, container = -149619975250772417L, user = true)
    class a implements ValueRunnable<String> {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @dy(field = 359749686946700799L)
        final /* synthetic */ String j6;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 4222534242608511988L)
        public a(q9 q9Var, String str) {
            this.j6 = str;
        }

        @Override // com.aide.common.ValueRunnable
        @ey(method = -5359679873219174468L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public void j6(String str) {
            try {
                if (DW) {
                    iy.tp(247270443696710409L, this, str);
                }
                try {
                    String str2 = this.j6 + File.separator + str;
                    FileSystem.Hw(str2);
                    ServiceContainer.getProjectService().wc();
                    ServiceContainer.getFileBrowserService().v5();
                    ServiceContainer.EQ().vJ(str2);
                    ServiceContainer.getMainActivity().aq(new FileSpan(str2, 1, 1, 1, 1));
                } catch (IOException e) {
                    MessageBox.P8(ServiceContainer.getMainActivity(), "Create File", e);
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, 247270443696710409L, this, str);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(q9.class);
    }

    @ey(method = 2613144643630892625L)
    public q9() {
        try {
            if (j6) {
                iy.gn(653338141658724560L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 653338141658724560L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -1215493011474918352L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.filebrowserMenuNewFile;
            }
            iy.gn(-2321885194573773240L, this);
            return q.filebrowserMenuNewFile;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2321885194573773240L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 401783222355945216L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(-538128461102951040L, this);
            }
            String strJ6 = ServiceContainer.getFileBrowserService().j6();
            if (strJ6 != null && ServiceContainer.getFileBrowserService().FH() == null) {
                if (!FileSystem.sh(strJ6)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -538128461102951040L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuCommand
    @ey(method = 360419081743460072L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(-429239192454032532L, this, z);
            }
            return isEnabled();
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -429239192454032532L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 875897846038005760L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(1304556673993876200L, this);
            }
            MessageBox.XL(ServiceContainer.getMainActivity(), u.command_files_create_new_file, u.dialog_create_message, "", new a(this, ServiceContainer.getFileBrowserService().j6()));
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1304556673993876200L, this);
            }
            throw th;
        }
    }
}
