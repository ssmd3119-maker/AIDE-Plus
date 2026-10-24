package abcd;

import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.command.MenuItemCommand;
import com.aide.ui.q;

@cy(clazz = -1401119370987670173L, container = -1401119370987670173L, user = true)
/* loaded from: classes.dex */
public class ob implements MenuItemCommand, KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(ob.class);
    }

    @ey(method = -409483487561405872L)
    public ob() {
        try {
            if (j6) {
                iy.gn(-584371484952783667L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -584371484952783667L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -2034323519642068512L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(6278032869521920944L, this);
            }
            return new KeyStroke(10, false, true, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 6278032869521920944L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -4076155819997515019L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.mainMenuOpenSearchBrowser;
            }
            iy.gn(1735118752928967147L, this);
            return q.mainMenuOpenSearchBrowser;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1735118752928967147L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -2028301993598762661L)
    public String getName() {
        try {
            if (!j6) {
                return "Show Search Results";
            }
            iy.gn(975461979278795337L, this);
            return "Show Search Results";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 975461979278795337L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 1289822756814679467L)
    public boolean isEnabled() {
        try {
            if (!j6) {
                return true;
            }
            iy.gn(3624096995026951845L, this);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3624096995026951845L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 162841890739369465L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(2364573371752429959L, this);
            }
            ServiceContainer.getMainActivity().hK();
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2364573371752429959L, this);
            }
            throw th;
        }
    }
}
