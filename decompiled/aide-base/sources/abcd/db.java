package abcd;

import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.command.MenuItemCommand;
import com.aide.ui.q;
import com.aide.ui.util.FileSpan;

@cy(clazz = -1434288903426854760L, container = -1434288903426854760L, user = true)
/* loaded from: classes.dex */
public class db implements MenuItemCommand, KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(db.class);
    }

    @ey(method = 504215823174350352L)
    public db() {
        try {
            if (j6) {
                iy.gn(-6231637067481734931L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -6231637067481734931L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 3709022698495438688L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(-7251554887775532963L, this);
            }
            return new KeyStroke(37, false, true, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -7251554887775532963L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -3360640903741083633L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.editorMenuInlineVariable;
            }
            iy.gn(-1013633331515124000L, this);
            return q.editorMenuInlineVariable;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1013633331515124000L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 526815343038134269L)
    public String getName() {
        try {
            if (!j6) {
                return "Inline Variable";
            }
            iy.gn(1904698104159257856L, this);
            return "Inline Variable";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1904698104159257856L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 3250077761056637889L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(2070903977368702740L, this);
            }
            if (ServiceContainer.getOpenFileService().Ws() && ServiceContainer.getMainActivity().sh().getCurrentFileSpan().FH()) {
                if (ServiceContainer.getOpenFileService().XL()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2070903977368702740L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 401666042959255675L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-589203122574573944L, this);
            }
            FileSpan currentFileSpan = ServiceContainer.getMainActivity().sh().getCurrentFileSpan();
            ServiceContainer.getMainActivity().w9();
            ServiceContainer.getEngineService().a8(currentFileSpan.j6, currentFileSpan.DW, currentFileSpan.FH);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -589203122574573944L, this);
            }
            throw th;
        }
    }
}
