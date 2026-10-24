package abcd;

import android.util.Pair;
import com.aide.common.KeyStroke;
import com.aide.engine.SyntaxError;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.util.FileSpan;

@cy(clazz = -1792555411471710677L, container = -1792555411471710677L, user = true)
/* loaded from: classes.dex */
public class bb implements KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(bb.class);
    }

    @ey(method = 1373421235830787371L)
    public bb() {
        try {
            if (j6) {
                iy.gn(-2462845866148342480L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2462845866148342480L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 1746908455177621097L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(-3004259814420298875L, this);
            }
            return new KeyStroke(19, false, true, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -3004259814420298875L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -1804246093876820060L)
    public String getName() {
        try {
            if (!j6) {
                return "GoTo Previous Error";
            }
            iy.gn(-2227990903919340736L, this);
            return "GoTo Previous Error";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2227990903919340736L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -2288485441031225280L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(2923254023821113972L, this);
            }
            return ServiceContainer.J0().gW() > 0;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2923254023821113972L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 1529797712404430040L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(2100863771654072544L, this);
            }
            FileSpan currentFileSpan = ServiceContainer.getMainActivity().sh().getCurrentFileSpan();
            Pair<FileSpan, SyntaxError> pairCb = ServiceContainer.J0().cb(currentFileSpan.j6, currentFileSpan.DW, currentFileSpan.FH);
            if (pairCb == null) {
                return true;
            }
            ServiceContainer.getMainActivity().aq((FileSpan) pairCb.first);
            ServiceContainer.J0().I((SyntaxError) pairCb.second);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2100863771654072544L, this);
            }
            throw th;
        }
    }
}
