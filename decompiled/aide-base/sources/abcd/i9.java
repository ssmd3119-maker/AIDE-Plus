package abcd;

import com.aide.ui.AIDEEditor;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.MenuItemCommand;
import com.aide.ui.q;
import java.util.ArrayList;
import java.util.Iterator;

@cy(clazz = 3502858092960141216L, container = 3502858092960141216L, user = true)
/* loaded from: classes.dex */
public class i9 implements MenuItemCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(i9.class);
    }

    @ey(method = 2227533119556657920L)
    public i9() {
        try {
            if (j6) {
                iy.gn(4863501208272756864L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 4863501208272756864L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -4887491334085122965L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.filetabMenuCloseOthers;
            }
            iy.gn(3426088369228650125L, this);
            return q.filetabMenuCloseOthers;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3426088369228650125L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 3137201737731269061L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(-1692970671634570789L, this);
            }
            return ServiceContainer.getOpenFileService().j3();
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1692970671634570789L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 1552295454282723015L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(1606574540714792801L, this);
            }
            String strU7 = ServiceContainer.getOpenFileService().u7();
            ArrayList arrayList = new ArrayList();
            Iterator<AIDEEditor> it = ServiceContainer.getMainActivity().sh().getFileEditors().iterator();
            while (it.hasNext()) {
                String filePath = it.next().getFilePath();
                if (!strU7.equals(filePath) && !ServiceContainer.getOpenFileService().getOpenFileModel(filePath).sG()) {
                    arrayList.add(filePath);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ServiceContainer.getOpenFileService().Hw((String) it2.next());
            }
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1606574540714792801L, this);
            }
            throw th;
        }
    }
}
