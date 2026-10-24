package abcd;

import com.aide.common.ValueRunnable;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.MenuCommand;
import com.aide.ui.q;
import com.aide.ui.util.FileSpan;
import com.aide.ui.util.FileSystem;

@cy(clazz = 3605670354921822675L, container = 3605670354921822675L, user = true)
/* loaded from: classes.dex */
public class s9 implements MenuCommand, tf {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    @cy(clazz = 879553407212038048L, container = 3605670354921822675L, user = true)
    class a implements ValueRunnable<String> {

        @gy
        private static /* synthetic */ boolean DW;

        @fy
        private static /* synthetic */ boolean j6;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 124519251967651128L)
        public a(s9 s9Var) {
        }

        @Override // com.aide.common.ValueRunnable
        @ey(method = -5624784751671955367L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public void j6(String str) {
            try {
                if (j6) {
                    iy.tp(1264946281582966253L, this, str);
                }
                ServiceContainer.getProjectService().wc();
                ServiceContainer.getFileBrowserService().v5();
                ServiceContainer.EQ().vJ(str);
                ServiceContainer.getProjectService().et(null, false);
                ServiceContainer.getMainActivity().aq(new FileSpan(str, 1, 1, 1, 1));
            } catch (Throwable th) {
                if (DW) {
                    iy.j3(th, 1264946281582966253L, this, str);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(s9.class);
    }

    @ey(method = -433198596591321421L)
    public s9() {
        try {
            if (j6) {
                iy.gn(-9208167997293360L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -9208167997293360L, null);
            }
            throw th;
        }
    }

    @Override // abcd.tf
    @ey(method = -1601969583395806800L)
    public int VH() {
        try {
            if (j6) {
                iy.gn(3333039836069500200L, this);
            }
            return ServiceContainer.getProjectService().U2(ServiceContainer.getFileBrowserService().j6());
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3333039836069500200L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -819654018674911672L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.filebrowserMenuNewItem;
            }
            iy.gn(2141619464297853056L, this);
            return q.filebrowserMenuNewItem;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2141619464297853056L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 3014837262813764384L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(3427381809302749700L, this);
            }
            return isVisible(false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3427381809302749700L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuCommand
    @ey(method = -1113740349447399436L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(487516887747462144L, this, z);
            }
            String strJ6 = ServiceContainer.getFileBrowserService().j6();
            if (strJ6 != null && ServiceContainer.getFileBrowserService().FH() == null && !FileSystem.sh(strJ6)) {
                if (ServiceContainer.getProjectService().tp(strJ6)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 487516887747462144L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // abcd.tf
    @ey(method = -1483153536116227991L)
    public int j6() {
        try {
            if (j6) {
                iy.gn(2111878051370150761L, this);
            }
            return ServiceContainer.getProjectService().a8(ServiceContainer.getFileBrowserService().j6());
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2111878051370150761L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 1006884408570610920L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(1188659047871457800L, this);
            }
            ServiceContainer.getProjectService().QX(ServiceContainer.getFileBrowserService().j6(), new a(this));
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1188659047871457800L, this);
            }
            throw th;
        }
    }
}
