package abcd;

import com.aide.common.KeyStroke;
import com.aide.common.MessageBox;
import com.aide.common.ValueRunnable;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.command.MenuCommand;
import com.aide.ui.q;
import com.aide.ui.u;
import com.aide.ui.util.FileSystem;

@cy(clazz = 641597747308316425L, container = 641597747308316425L, user = true)
/* loaded from: classes.dex */
public class zb implements MenuCommand, KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    @cy(clazz = 1098255753979043376L, container = 641597747308316425L, user = true)
    class a implements ValueRunnable<String> {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @dy(field = -3602859888034847239L)
        final /* synthetic */ String j6;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -132415194480966356L)
        public a(zb zbVar, String str) {
            this.j6 = str;
        }

        @Override // com.aide.common.ValueRunnable
        @ey(method = 6300118483691882733L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public void j6(String str) {
            try {
                if (DW) {
                    iy.tp(-951774649037688024L, this, str);
                }
                ServiceContainer.getMainActivity().w9();
                ServiceContainer.getEngineService().SI(this.j6, str);
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, -951774649037688024L, this, str);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(zb.class);
    }

    @ey(method = 3084124522834574600L)
    public zb() {
        try {
            if (j6) {
                iy.gn(6972302479026548991L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 6972302479026548991L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -5338572161730633792L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(-4348418219021977396L, this);
            }
            return new KeyStroke(46, false, true, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -4348418219021977396L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -2645861192149535235L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.filebrowserMenuRename;
            }
            iy.gn(300146183409024315L, this);
            return q.filebrowserMenuRename;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 300146183409024315L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 2643462498660189879L)
    public String getName() {
        try {
            if (!j6) {
                return "Files - Rename";
            }
            iy.gn(442153721520189197L, this);
            return "Files - Rename";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 442153721520189197L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 3436232572160428775L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(1805405620064007585L, this);
            }
            return isVisible(false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1805405620064007585L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuCommand
    @ey(method = -1095952598457587899L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(819097272672281247L, this, z);
            }
            String strFH = ServiceContainer.getFileBrowserService().FH();
            if (strFH != null) {
                if (!FileSystem.sh(strFH)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 819097272672281247L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -1917889937547497319L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(1500352841004309439L, this);
            }
            String strFH = ServiceContainer.getFileBrowserService().FH();
            MessageBox.XL(ServiceContainer.getMainActivity(), u.dialog_rename_title, u.dialog_rename_message, FileSystem.getName(strFH), new a(this, strFH));
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1500352841004309439L, this);
            }
            throw th;
        }
    }
}
