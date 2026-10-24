package abcd;

import com.aide.ui.R$drawable;
import com.aide.ui.ServiceContainer;
import com.aide.ui.u;

@cy(clazz = -406703487907979968L, container = -406703487907979968L, user = true)
/* loaded from: classes.dex */
public class oc implements tf {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(oc.class);
    }

    @ey(method = 2055338177388081135L)
    public oc() {
        try {
            if (j6) {
                iy.gn(650921307424364160L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 650921307424364160L, null);
            }
            throw th;
        }
    }

    @Override // abcd.tf
    @ey(method = -2629603308329099424L)
    public int VH() {
        try {
            if (!j6) {
                return R$drawable.browser_git;
            }
            iy.gn(-2906520870597403329L, this);
            return R$drawable.browser_git;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2906520870597403329L, this);
            }
            throw th;
        }
    }

    @Override // abcd.tf
    @ey(method = -2071422179501202900L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(415421968755960573L, this, z);
            }
            return ServiceContainer.QX().aM(ServiceContainer.getFileBrowserService().j6());
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 415421968755960573L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // abcd.tf
    @ey(method = 1847208921093773021L)
    public int j6() {
        try {
            if (!j6) {
                return u.command_files_git;
            }
            iy.gn(-1745211607835346900L, this);
            return u.command_files_git;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1745211607835346900L, this);
            }
            throw th;
        }
    }

    @Override // abcd.tf
    @ey(method = 113835991863109360L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(300668380369660485L, this);
            }
            ServiceContainer.getMainActivity().sG().Ws();
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 300668380369660485L, this);
            }
            throw th;
        }
    }
}
