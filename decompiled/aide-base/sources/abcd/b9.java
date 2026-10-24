package abcd;

import com.aide.common.AndroidHelper;
import com.aide.common.SocialDialog;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.MenuCommand;
import com.aide.ui.q;
import com.aide.ui.u;

@cy(clazz = 3561167537800483905L, container = 3561167537800483905L, user = true)
/* loaded from: classes.dex */
public class b9 implements MenuCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(b9.class);
    }

    @ey(method = 2595003236816114319L)
    public b9() {
        try {
            if (j6) {
                iy.gn(754886520886046252L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 754886520886046252L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -3794654550731896600L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.mainMenuTrainerQuestion;
            }
            iy.gn(2728775436454287616L, this);
            return q.mainMenuTrainerQuestion;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2728775436454287616L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 2785478078220370176L)
    public boolean isEnabled() {
        try {
            if (!j6) {
                return true;
            }
            iy.gn(2665271430565793280L, this);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2665271430565793280L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuCommand
    @ey(method = -1796257810153960260L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(764265888624026432L, this, z);
            }
            return !AndroidHelper.U2(ServiceContainer.getContext());
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 764265888624026432L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 1365452262150673480L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-1792770258543577040L, this);
            }
            SocialDialog.vJ(ServiceContainer.getMainActivity(), ServiceContainer.getContext().getString(u.trainer_ask_a_question), ServiceContainer.getContext().getString(u.trainer_ask_a_question_message), null);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1792770258543577040L, this);
            }
            throw th;
        }
    }
}
