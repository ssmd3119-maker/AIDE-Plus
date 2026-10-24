package abcd;

import com.aide.common.MessageBox;
import com.aide.common.ValueRunnable;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.MenuCommand;
import com.aide.ui.q;
import com.aide.ui.u;
import com.aide.ui.util.FileSystem;
import java.io.File;
import java.io.IOException;

@cy(clazz = 15619952688868320L, container = 15619952688868320L, user = true)
/* loaded from: classes.dex */
public class p9 implements MenuCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    @cy(clazz = -451953873500706243L, container = 15619952688868320L, user = true)
    class a implements ValueRunnable<String> {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @dy(field = 4408372362631090436L)
        final /* synthetic */ String j6;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -3850075658969141112L)
        public a(p9 p9Var, String str) {
            this.j6 = str;
        }

        @Override // com.aide.common.ValueRunnable
        @ey(method = -2719962413022367179L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public void j6(String str) {
            try {
                if (DW) {
                    iy.tp(97256053174108275L, this, str);
                }
                try {
                    String str2 = this.j6 + File.separator + str;
                    FileSystem.FH(str2);
                    ServiceContainer.getProjectService().wc();
                    ServiceContainer.getFileBrowserService().v5();
                    ServiceContainer.EQ().vJ(str2);
                } catch (IOException e) {
                    MessageBox.P8(ServiceContainer.getMainActivity(), "Create Folder", e);
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, 97256053174108275L, this, str);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(p9.class);
    }

    @ey(method = -1618966243159949497L)
    public p9() {
        try {
            if (j6) {
                iy.gn(-130237279968681675L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -130237279968681675L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -681374554346494096L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.filebrowserMenuNewDir;
            }
            iy.gn(2255977628877400524L, this);
            return q.filebrowserMenuNewDir;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2255977628877400524L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -2320628074473460080L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(1308001628393593672L, this);
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
                iy.aM(th, 1308001628393593672L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuCommand
    @ey(method = -1897627847418584164L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(-272541300764199984L, this, z);
            }
            return isEnabled();
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -272541300764199984L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -1518516251732169024L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(1704462616814390148L, this);
            }
            MessageBox.XL(ServiceContainer.getMainActivity(), u.command_files_create_new_folder, u.dialog_create_message, "", new a(this, ServiceContainer.getFileBrowserService().j6()));
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1704462616814390148L, this);
            }
            throw th;
        }
    }
}
