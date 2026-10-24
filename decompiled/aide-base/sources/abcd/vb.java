package abcd;

import com.aide.common.AndroidHelper;
import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.q;

@cy(clazz = -4080617383337174925L, container = -4080617383337174925L, user = true)
/* loaded from: classes.dex */
public class vb implements KeyStrokeCommand, rf {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(vb.class);
    }

    @ey(method = 2167268737822416067L)
    public vb() {
        try {
            if (j6) {
                iy.gn(658562122696622847L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 658562122696622847L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -6185464294786319231L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(-6976523814446857880L, this);
            }
            return new KeyStroke(53, false, true, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -6976523814446857880L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 2917333863886665860L)
    public String getName() {
        try {
            if (!j6) {
                return "Redo";
            }
            iy.gn(-1044408361947725053L, this);
            return "Redo";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1044408361947725053L, this);
            }
            throw th;
        }
    }

    @Override // abcd.rf
    @ey(method = 7002261670594342352L)
    public int gn() {
        try {
            if (!j6) {
                return q.mainMenuRedo;
            }
            iy.gn(-4166285341909008561L, this);
            return q.mainMenuRedo;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -4166285341909008561L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -3115811326058831232L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(-2632049464709464165L, this);
            }
            return ServiceContainer.getMainActivity().sh().FN();
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2632049464709464165L, this);
            }
            throw th;
        }
    }

    @Override // abcd.rf
    @ey(method = -3245240432658126391L)
    public boolean isVisible() {
        try {
            if (j6) {
                iy.gn(-2757116883921165360L, this);
            }
            if (!ServiceContainer.isTrainerMode() && !ServiceContainer.getMainActivity().sh().aq()) {
                if (AndroidHelper.j3(ServiceContainer.getContext())) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2757116883921165360L, this);
            }
            throw th;
        }
    }

    @Override // abcd.rf
    @ey(method = 1815359094461873745L)
    public String j6() {
        try {
            if (!j6) {
                return "Redo";
            }
            iy.gn(1337389722032264560L, this);
            return "Redo";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1337389722032264560L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 2091665158142260096L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-658131935726239611L, this);
            }
            ServiceContainer.getMainActivity().sh().fY();
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -658131935726239611L, this);
            }
            throw th;
        }
    }
}
