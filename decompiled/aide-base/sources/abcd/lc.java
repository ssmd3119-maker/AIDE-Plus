package abcd;

import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;

@cy(clazz = -2269373409063179565L, container = -2269373409063179565L, user = true)
/* loaded from: classes.dex */
public class lc implements KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(lc.class);
    }

    @ey(method = -1062636210101846380L)
    public lc() {
        try {
            if (j6) {
                iy.gn(1535242822505217675L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1535242822505217675L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 3659448561495317604L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(1964941164477894096L, this);
            }
            return new KeyStroke(100, false, false, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1964941164477894096L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -2814813604818979383L)
    public String getName() {
        try {
            if (!j6) {
                return "Open Editor Context Action Bar";
            }
            iy.gn(2335515124950207351L, this);
            return "Open Editor Context Action Bar";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2335515124950207351L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -635695467217909259L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(297514611282607551L, this);
            }
            return ServiceContainer.getOpenFileService().j3();
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 297514611282607551L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -589565007872966541L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-577008988752466411L, this);
            }
            ServiceContainer.getMainActivity().sh().ye();
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -577008988752466411L, this);
            }
            throw th;
        }
    }
}
