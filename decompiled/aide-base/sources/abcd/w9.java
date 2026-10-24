package abcd;

import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;

@cy(clazz = 663196512047996880L, container = 663196512047996880L, user = true)
/* loaded from: classes.dex */
public class w9 implements KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(w9.class);
    }

    @ey(method = 423206879956345600L)
    public w9() {
        try {
            if (j6) {
                iy.gn(-384660451030216088L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -384660451030216088L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -3392170049134077120L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(-5270626636123681320L, this);
            }
            return new KeyStroke(45, false, true, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -5270626636123681320L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -2376292257044387355L)
    public String getName() {
        try {
            if (!j6) {
                return "Delete Line";
            }
            iy.gn(-366306107656078569L, this);
            return "Delete Line";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -366306107656078569L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -3277644368665892375L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(563015586693882855L, this);
            }
            return ServiceContainer.getOpenFileService().j3();
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 563015586693882855L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 674993021978774747L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(2009184651568146913L, this);
            }
            ServiceContainer.getMainActivity().sh().yO();
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2009184651568146913L, this);
            }
            throw th;
        }
    }
}
