package abcd;

import com.aide.common.MessageBox;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.MenuItemCommand;
import com.aide.ui.q;
import com.aide.ui.u;

@cy(clazz = -584009951590093592L, container = -584009951590093592L, user = true)
/* loaded from: classes.dex */
public class bc implements MenuItemCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    @cy(clazz = 1050127944726011333L, container = -584009951590093592L, user = true)
    class a implements Runnable {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -210927570550882367L)
        public a(bc bcVar) {
        }

        @Override // java.lang.Runnable
        @ey(method = 789667106509396075L)
        public void run() {
            try {
                if (WB) {
                    iy.gn(2976566699261770304L, this);
                }
                ServiceContainer.ro().aj();
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, 2976566699261770304L, this);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(bc.class);
    }

    @ey(method = 2462039500811092372L)
    public bc() {
        try {
            if (j6) {
                iy.gn(-7001303921579882340L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -7001303921579882340L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -1437983858358844305L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.mainMenuLessonRestart;
            }
            iy.gn(-478032998206317281L, this);
            return q.mainMenuLessonRestart;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -478032998206317281L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 1705959859694595445L)
    public boolean isEnabled() {
        try {
            if (!j6) {
                return true;
            }
            iy.gn(-655989284465008431L, this);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -655989284465008431L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -2045161433610275085L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(1361841817023279243L, this);
            }
            MessageBox.a8(ServiceContainer.getMainActivity(), u.trainer_restart_lesson, u.trainer_restart_lesson_message, new a(this), null);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1361841817023279243L, this);
            }
            throw th;
        }
    }
}
