package abcd;

import com.aide.ui.R$drawable;
import com.aide.ui.ServiceContainer;
import com.aide.ui.u;

@cy(clazz = -241550343877356144L, container = -241550343877356144L, user = true)
/* loaded from: classes.dex */
public class yc implements tf {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(yc.class);
    }

    @ey(method = 961862959208285769L)
    public yc() {
        try {
            if (j6) {
                iy.gn(-6623270420943088377L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -6623270420943088377L, null);
            }
            throw th;
        }
    }

    @Override // abcd.tf
    @ey(method = 2967726483839008320L)
    public int VH() {
        try {
            if (!j6) {
                return R$drawable.dropbox;
            }
            iy.gn(-326051909977477112L, this);
            return R$drawable.dropbox;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -326051909977477112L, this);
            }
            throw th;
        }
    }

    @Override // abcd.tf
    @ey(method = 1514500640177698032L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(746959257843225568L, this, z);
            }
            return ServiceContainer.EQ().cb(ServiceContainer.getFileBrowserService().j6());
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 746959257843225568L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // abcd.tf
    @ey(method = -3278790022335728973L)
    public int j6() {
        try {
            if (!j6) {
                return u.command_files_sync_dropbox_folder;
            }
            iy.gn(2190099706452556605L, this);
            return u.command_files_sync_dropbox_folder;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2190099706452556605L, this);
            }
            throw th;
        }
    }

    @Override // abcd.tf
    @ey(method = -1864324033903448908L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-1467592708852324752L, this);
            }
            ServiceContainer.EQ().OW(ServiceContainer.getFileBrowserService().j6(), true);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1467592708852324752L, this);
            }
            throw th;
        }
    }
}
