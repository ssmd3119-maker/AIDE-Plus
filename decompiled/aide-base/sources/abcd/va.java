package abcd;

import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;

@cy(clazz = 7295873739008133400L, container = 7295873739008133400L, user = true)
/* loaded from: classes.dex */
public class va implements KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(va.class);
    }

    @ey(method = 3354060330598180527L)
    public va() {
        try {
            if (j6) {
                iy.gn(1525176467697106665L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1525176467697106665L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 8175858198784810365L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(534371390552681561L, this);
            }
            return new KeyStroke(21, false, false, true);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 534371390552681561L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -3015129213651365600L)
    public String getName() {
        try {
            if (!j6) {
                return "Go Back";
            }
            iy.gn(-2428232282268382396L, this);
            return "Go Back";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2428232282268382396L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 1537246074899942292L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(2327129037639218400L, this);
            }
            return ServiceContainer.getNavigateService().DW();
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2327129037639218400L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 542835452516635736L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(87091372115942280L, this);
            }
            ServiceContainer.getMainActivity().Eq();
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 87091372115942280L, this);
            }
            throw th;
        }
    }
}
