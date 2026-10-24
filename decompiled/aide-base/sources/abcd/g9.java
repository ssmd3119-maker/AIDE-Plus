package abcd;

import com.aide.common.MessageBox;
import com.aide.ui.AIDEEditor;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.MenuItemCommand;
import com.aide.ui.q;
import com.aide.ui.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@cy(clazz = 737711429368467645L, container = 737711429368467645L, user = true)
/* loaded from: classes.dex */
public class g9 implements MenuItemCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    @cy(clazz = -5999073147567112L, container = 737711429368467645L, user = true)
    class a implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 443778800123884561L)
        public a() {
        }

        @Override // java.lang.Runnable
        @ey(method = 2776103976460894651L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(3198395420556700356L, this);
                }
                g9.this.tp();
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 3198395420556700356L, this);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(g9.class);
    }

    @ey(method = 869568449717194085L)
    public g9() {
        try {
            if (j6) {
                iy.gn(-919997216995409865L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -919997216995409865L, null);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -3292850577691247115L)
    public void tp() {
        try {
            if (j6) {
                iy.gn(2463767961289454832L, this);
            }
            List<AIDEEditor> fileEditors = ServiceContainer.getMainActivity().sh().getFileEditors();
            ArrayList arrayList = new ArrayList();
            Iterator<AIDEEditor> it = fileEditors.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getFilePath());
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ServiceContainer.getOpenFileService().Hw((String) it2.next());
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2463767961289454832L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -4927228820569879740L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.filetabMenuCloseAll;
            }
            iy.gn(966460528457489099L, this);
            return q.filetabMenuCloseAll;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 966460528457489099L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 2976456549994879840L)
    public boolean isEnabled() {
        try {
            if (!j6) {
                return true;
            }
            iy.gn(-2713305050511557151L, this);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2713305050511557151L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 2192486936433971964L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(490823827207421679L, this);
            }
            boolean z = false;
            Iterator<AIDEEditor> it = ServiceContainer.getMainActivity().sh().getFileEditors().iterator();
            while (it.hasNext()) {
                if (ServiceContainer.getOpenFileService().getOpenFileModel(it.next().getFilePath()).sG()) {
                    z = true;
                }
            }
            if (z) {
                MessageBox.a8(ServiceContainer.getMainActivity(), u.dialog_save_files_title, u.dialog_save_files_message, new a(), null);
            } else {
                tp();
            }
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 490823827207421679L, this);
            }
            throw th;
        }
    }
}
