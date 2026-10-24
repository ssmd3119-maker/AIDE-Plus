package abcd;

import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.command.MenuCommand;
import com.aide.ui.q;

@cy(clazz = 2575926123815778819L, container = 2575926123815778819L, user = true)
/* loaded from: classes.dex */
public class x9 implements rf, KeyStrokeCommand, MenuCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(x9.class);
    }

    @ey(method = -3062077182897312600L)
    public x9() {
        try {
            if (j6) {
                iy.gn(-121569919966439069L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -121569919966439069L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -2498174956502342832L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(3102024004396039640L, this);
            }
            return new KeyStroke(32, false, true, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3102024004396039640L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 4858409252666808561L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.editorMenuPreview;
            }
            iy.gn(1881908017845375377L, this);
            return q.editorMenuPreview;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1881908017845375377L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 529533882330382371L)
    public String getName() {
        try {
            if (!j6) {
                return "Design";
            }
            iy.gn(3057354125074720991L, this);
            return "Design";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3057354125074720991L, this);
            }
            throw th;
        }
    }

    @Override // abcd.rf
    @ey(method = 6785116028272804519L)
    public int gn() {
        try {
            if (!j6) {
                return q.mainMenuPreview;
            }
            iy.gn(1176472735497618223L, this);
            return q.mainMenuPreview;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1176472735497618223L, this);
            }
            throw th;
        }
    }

    @Override // abcd.rf, com.aide.ui.command.KeyStrokeCommand
    @ey(method = 2288422686126280635L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(400029239688446935L, this);
            }
            return ServiceContainer.getProjectService().J8();
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 400029239688446935L, this);
            }
            throw th;
        }
    }

    @Override // abcd.rf
    @ey(method = 2191409029643821912L)
    public boolean isVisible() {
        try {
            if (j6) {
                iy.gn(300273226448969680L, this);
            }
            if (isEnabled() && !ServiceContainer.getMainActivity().sh().aq()) {
                if (!ServiceContainer.getDebugger().aM()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 300273226448969680L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuCommand
    @ey(method = 678311632017110889L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(946717883108831509L, this, z);
            }
            return isVisible();
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 946717883108831509L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // abcd.rf
    @ey(method = 2295253568815595520L)
    public String j6() {
        try {
            if (!j6) {
                return "Design";
            }
            iy.gn(-2004409503053032452L, this);
            return "Design";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2004409503053032452L, this);
            }
            throw th;
        }
    }

    @Override // abcd.rf, com.aide.ui.command.KeyStrokeCommand
    @ey(method = 1365224698265232525L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-1506304257380643275L, this);
            }
            return ServiceContainer.getProjectService().Ev();
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1506304257380643275L, this);
            }
            throw th;
        }
    }
}
