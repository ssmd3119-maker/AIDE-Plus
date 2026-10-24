package abcd;

import com.aide.ui.ServiceContainer;
import com.aide.ui.command.MenuItemCommand;
import com.aide.ui.project.AndroidProjectSupport;
import com.aide.ui.q;
import com.aide.ui.util.FileSpan;

@cy(clazz = 3796383905486922881L, container = 3796383905486922881L, user = true)
/* loaded from: classes.dex */
public class ea implements MenuItemCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(ea.class);
    }

    @ey(method = 1108359791715880875L)
    public ea() {
        try {
            if (j6) {
                iy.gn(-30206436334896560L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -30206436334896560L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 5747138885571231360L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.editorMenuExtractResources;
            }
            iy.gn(198744352014964808L, this);
            return q.editorMenuExtractResources;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 198744352014964808L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -62700839627437248L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(1155095596240976220L, this);
            }
            if (AndroidProjectSupport.iW(ServiceContainer.getProjectService().getCurrentAppHome()) && ServiceContainer.getOpenFileService().Ws()) {
                if (ServiceContainer.getOpenFileService().XL()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1155095596240976220L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 2492926063616417872L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-1589363867224056720L, this);
            }
            FileSpan currentFileSpan = ServiceContainer.getMainActivity().sh().getCurrentFileSpan();
            String strN5 = AndroidProjectSupport.n5(ServiceContainer.getProjectService().getCurrentAppHome());
            ServiceContainer.getMainActivity().w9();
            ServiceContainer.getEngineService().aM(currentFileSpan.j6, strN5, currentFileSpan.DW, currentFileSpan.FH, currentFileSpan.Hw, currentFileSpan.v5);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1589363867224056720L, this);
            }
            throw th;
        }
    }
}
