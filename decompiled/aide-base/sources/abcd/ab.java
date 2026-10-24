package abcd;

import android.util.Pair;
import com.aide.common.KeyStroke;
import com.aide.engine.SyntaxError;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.util.FileSpan;

@cy(clazz = -2875682728765704007L, container = -2875682728765704007L, user = true)
/* loaded from: classes.dex */
public class ab implements KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(ab.class);
    }

    @ey(method = 3260270837945757564L)
    public ab() {
        try {
            if (j6) {
                iy.gn(-7869206010785017103L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -7869206010785017103L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 4178183395209450972L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(-621678695506500024L, this);
            }
            return new KeyStroke(20, false, true, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -621678695506500024L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 660035310173470565L)
    public String getName() {
        try {
            if (!j6) {
                return "GoTo Next Error";
            }
            iy.gn(-545029132435493753L, this);
            return "GoTo Next Error";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -545029132435493753L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 3433970293650620889L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(-897836266743728625L, this);
            }
            return ServiceContainer.J0().gW() > 0;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -897836266743728625L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -322206327471529569L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(221574841966148685L, this);
            }
            FileSpan currentFileSpan = ServiceContainer.getMainActivity().sh().getCurrentFileSpan();
            Pair<FileSpan, SyntaxError> pairKD = ServiceContainer.J0().KD(currentFileSpan.j6, currentFileSpan.DW, currentFileSpan.FH);
            if (pairKD == null) {
                return true;
            }
            ServiceContainer.getMainActivity().aq((FileSpan) pairKD.first);
            ServiceContainer.J0().I((SyntaxError) pairKD.second);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 221574841966148685L, this);
            }
            throw th;
        }
    }
}
