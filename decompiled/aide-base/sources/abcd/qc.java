package abcd;

import com.aide.common.MessageBox;
import com.aide.ui.R$drawable;
import com.aide.ui.ServiceContainer;
import com.aide.ui.u;

@cy(clazz = 8255048934892201032L, container = 8255048934892201032L, user = true)
/* loaded from: classes.dex */
public class qc implements tf {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(qc.class);
    }

    @ey(method = 1771138227944847075L)
    public qc() {
        try {
            if (j6) {
                iy.gn(816779665584248033L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 816779665584248033L, null);
            }
            throw th;
        }
    }

    @Override // abcd.tf
    @ey(method = 4510592004168742800L)
    public int VH() {
        try {
            if (!j6) {
                return R$drawable.project_properties;
            }
            iy.gn(-1394311134982885056L, this);
            return R$drawable.project_properties;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1394311134982885056L, this);
            }
            throw th;
        }
    }

    @Override // abcd.tf
    @ey(method = 1253171579062683540L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(1071287583928863640L, this, z);
            }
            return ServiceContainer.getProjectService().getLibraryMapping().containsKey(ServiceContainer.getFileBrowserService().j6());
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1071287583928863640L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // abcd.tf
    @ey(method = 3592118231357854425L)
    public int j6() {
        try {
            if (!j6) {
                return u.command_files_project_properties;
            }
            iy.gn(1457662569137593467L, this);
            return u.command_files_project_properties;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1457662569137593467L, this);
            }
            throw th;
        }
    }

    @Override // abcd.tf
    @ey(method = 525921333600820520L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(641935659444842900L, this);
            }
            MessageBox.gW(ServiceContainer.getMainActivity(), new pd());
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 641935659444842900L, this);
            }
            throw th;
        }
    }
}
