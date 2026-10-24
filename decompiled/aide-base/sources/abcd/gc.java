package abcd;

import com.aide.common.KeyStroke;
import com.aide.common.MessageBox;
import com.aide.common.ValueRunnable;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.command.MenuItemCommand;
import com.aide.ui.q;
import com.aide.ui.u;
import com.aide.ui.util.FileSpan;

@cy(clazz = -3511601904516789279L, container = -3511601904516789279L, user = true)
/* loaded from: classes.dex */
public class gc implements MenuItemCommand, KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    @cy(clazz = -2215661466223810440L, container = -3511601904516789279L, user = true)
    class a implements ValueRunnable<String> {

        @gy
        private static /* synthetic */ boolean DW;

        @fy
        private static /* synthetic */ boolean j6;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -98918900434564352L)
        public a(gc gcVar) {
        }

        @Override // com.aide.common.ValueRunnable
        @ey(method = 6422125364388371899L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public void j6(String str) {
            try {
                if (j6) {
                    iy.tp(-1310756906246094661L, this, str);
                }
                if (str.length() > 2) {
                    ServiceContainer.SI().U2(str);
                }
            } catch (Throwable th) {
                if (DW) {
                    iy.j3(th, -1310756906246094661L, this, str);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(gc.class);
    }

    @ey(method = 2204662535804404305L)
    public gc() {
        try {
            if (j6) {
                iy.gn(-2724034679585653720L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2724034679585653720L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -5607852168331077925L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(6443888545457741615L, this);
            }
            return new KeyStroke(36, true, true, true);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 6443888545457741615L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -4340320643256474576L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.mainMenuSearchInProject;
            }
            iy.gn(3742043693768240960L, this);
            return q.mainMenuSearchInProject;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3742043693768240960L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 102936657005582568L)
    public String getName() {
        try {
            if (!j6) {
                return "Search in Project";
            }
            iy.gn(-771125815232666240L, this);
            return "Search in Project";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -771125815232666240L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 2604030589421402400L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(2730593939572450704L, this);
            }
            return ServiceContainer.getProjectService().isOpenProject();
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2730593939572450704L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 157048453005607872L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-1893097773283912112L, this);
            }
            FileSpan currentFileSpan = ServiceContainer.getMainActivity().sh().getCurrentFileSpan();
            MessageBox.XL(ServiceContainer.getMainActivity(), u.command_find_in_project, u.dialog_search_message, currentFileSpan.DW == currentFileSpan.Hw ? ServiceContainer.getMainActivity().sh().getSelectionContent().trim() : "", new a(this));
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1893097773283912112L, this);
            }
            throw th;
        }
    }
}
