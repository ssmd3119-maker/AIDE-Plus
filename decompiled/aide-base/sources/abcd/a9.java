package abcd;

import com.aide.common.MessageBox;
import com.aide.common.ValueRunnable;
import com.aide.ui.R$drawable;
import com.aide.ui.ServiceContainer;
import com.aide.ui.u;
import java.util.List;

@cy(clazz = 1986559502886368768L, container = 1986559502886368768L, user = true)
/* loaded from: classes.dex */
public class a9 implements tf {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    @cy(clazz = -2124776537896290509L, container = 1986559502886368768L, user = true)
    class a implements ValueRunnable<String> {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @dy(field = 6014666100928721184L)
        final /* synthetic */ String j6;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -353871053180556795L)
        public a(a9 a9Var, String str) {
            this.j6 = str;
        }

        @Override // com.aide.common.ValueRunnable
        @ey(method = 3635983685387176700L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public void j6(String str) {
            try {
                if (DW) {
                    iy.tp(-97664565784170000L, this, str);
                }
                ServiceContainer.getProjectService().Zo(this.j6, str);
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, -97664565784170000L, this, str);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(a9.class);
    }

    @ey(method = 2783018278540239152L)
    public a9() {
        try {
            if (j6) {
                iy.gn(3998965295504733128L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3998965295504733128L, null);
            }
            throw th;
        }
    }

    @Override // abcd.tf
    @ey(method = -2827855459881289209L)
    public int VH() {
        try {
            if (!j6) {
                return R$drawable.project_new;
            }
            iy.gn(1362387932622438521L, this);
            return R$drawable.project_new;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1362387932622438521L, this);
            }
            throw th;
        }
    }

    @Override // abcd.tf
    @ey(method = -733311470909900859L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(-805809597548481945L, this, z);
            }
            String strJ6 = ServiceContainer.getFileBrowserService().j6();
            if (ServiceContainer.getProjectService().getLibraryMapping().containsKey(strJ6)) {
                if (ServiceContainer.getProjectService().nw(strJ6) != null) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -805809597548481945L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // abcd.tf
    @ey(method = 1058475703836649788L)
    public int j6() {
        try {
            if (!j6) {
                return u.command_files_add_to_project;
            }
            iy.gn(50446141198324920L, this);
            return u.command_files_add_to_project;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 50446141198324920L, this);
            }
            throw th;
        }
    }

    @Override // abcd.tf
    @ey(method = 2243538796450437837L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-1692203956298764353L, this);
            }
            String strJ6 = ServiceContainer.getFileBrowserService().j6();
            List<String> listNw = ServiceContainer.getProjectService().nw(strJ6);
            if (listNw == null) {
                return true;
            }
            MessageBox.VH(ServiceContainer.getMainActivity(), ServiceContainer.KD(u.command_files_add_to_project, new Object[0]), listNw, new a(this, strJ6));
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1692203956298764353L, this);
            }
            throw th;
        }
    }
}
