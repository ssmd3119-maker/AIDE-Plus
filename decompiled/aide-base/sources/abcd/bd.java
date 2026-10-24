package abcd;

import com.aide.common.AndroidHelper;
import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.q;

@cy(clazz = 786994372959813825L, container = 786994372959813825L, user = true)
/* loaded from: classes.dex */
public class bd implements KeyStrokeCommand, rf {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(bd.class);
    }

    @ey(method = 2130372641442642275L)
    public bd() {
        try {
            if (j6) {
                iy.gn(-3994745508008425976L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -3994745508008425976L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 7039851942628298425L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(371223705275331405L, this);
            }
            return new KeyStroke(54, false, true, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 371223705275331405L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -2384055626813208080L)
    public String getName() {
        try {
            if (!j6) {
                return "Undo";
            }
            iy.gn(2000226557580372000L, this);
            return "Undo";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2000226557580372000L, this);
            }
            throw th;
        }
    }

    @Override // abcd.rf
    @ey(method = 2817096540030720000L)
    public int gn() {
        try {
            if (!j6) {
                return q.mainMenuUndo;
            }
            iy.gn(-2846782555147825376L, this);
            return q.mainMenuUndo;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2846782555147825376L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -2017377121698585284L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(2200118424322297716L, this);
            }
            return ServiceContainer.getMainActivity().sh().ko();
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2200118424322297716L, this);
            }
            throw th;
        }
    }

    @Override // abcd.rf
    @ey(method = -2143866471168112911L)
    public boolean isVisible() {
        try {
            if (j6) {
                iy.gn(2118473272059304405L, this);
            }
            if (!ServiceContainer.isTrainerMode() && !ServiceContainer.getMainActivity().sh().aq()) {
                if (AndroidHelper.j3(ServiceContainer.getContext())) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2118473272059304405L, this);
            }
            throw th;
        }
    }

    @Override // abcd.rf
    @ey(method = -2300847951219567339L)
    public String j6() {
        try {
            if (!j6) {
                return "Undo";
            }
            iy.gn(714942232248100545L, this);
            return "Undo";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 714942232248100545L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -2405426630758392048L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-1336425057044534952L, this);
            }
            ServiceContainer.getMainActivity().sh().Jl();
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1336425057044534952L, this);
            }
            throw th;
        }
    }
}
