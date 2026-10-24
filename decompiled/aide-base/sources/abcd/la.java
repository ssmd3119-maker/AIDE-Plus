package abcd;

import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.command.MenuItemCommand;
import com.aide.ui.q;
import com.aide.ui.util.FileSpan;

@cy(clazz = 394462289480061900L, container = 394462289480061900L, user = true)
/* loaded from: classes.dex */
public class la implements MenuItemCommand, KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(la.class);
    }

    @ey(method = 2051316586481559600L)
    public la() {
        try {
            if (j6) {
                iy.gn(-475795120755355401L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -475795120755355401L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -5773870794775668000L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(1159943194247200917L, this);
            }
            return new KeyStroke(35, true, true, true);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1159943194247200917L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 1144861525433725575L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.editorMenuFindUsage;
            }
            iy.gn(3514564698261065928L, this);
            return q.editorMenuFindUsage;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3514564698261065928L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 2956327174984900741L)
    public String getName() {
        try {
            if (!j6) {
                return "Find Usages";
            }
            iy.gn(1322836169400386940L, this);
            return "Find Usages";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1322836169400386940L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -3484743320275017479L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(-1054755299525455872L, this);
            }
            if (ServiceContainer.getOpenFileService().Ws()) {
                if (ServiceContainer.getMainActivity().sh().getCurrentFileSpan().FH()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1054755299525455872L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 926947151537317875L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(1523906350673050600L, this);
            }
            FileSpan currentFileSpan = ServiceContainer.getMainActivity().sh().getCurrentFileSpan();
            ServiceContainer.SI().Ws(currentFileSpan.j6, currentFileSpan.DW, currentFileSpan.FH, currentFileSpan.Hw, currentFileSpan.v5);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1523906350673050600L, this);
            }
            throw th;
        }
    }
}
