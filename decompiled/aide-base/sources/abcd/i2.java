package abcd;

import com.aide.codemodel.api.SyntaxTreeStyles;
import java.util.ArrayList;
import java.util.List;

@cy(clazz = 194263197534240451L, container = 194263197534240451L, user = true)
/* loaded from: classes.dex */
public class i2 {

    @gy
    private static /* synthetic */ boolean Hw;

    @fy
    private static /* synthetic */ boolean clear;

    @dy(field = 1693061698741961180L)
    private int size;

    @dy(field = -2696649783064052893L)
    private List<SyntaxTreeStyles> syntaxTreeStylesList;

    static {
        iy.Zo(i2.class);
    }

    @ey(method = -2242123349507704592L)
    public i2() {
        try {
            if (clear) {
                iy.gn(1562215453158520237L, null);
            }
            this.syntaxTreeStylesList = new ArrayList();
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 1562215453158520237L, null);
            }
            throw th;
        }
    }

    @ey(method = 816718980247228087L)
    public void DW(SyntaxTreeStyles syntaxTreeStyles) {
        int iIndexOf;
        try {
            if (clear) {
                iy.tp(-650273815977840081L, this, syntaxTreeStyles);
            }
            if (this.size == 0) {
                return;
            }
            if (this.syntaxTreeStylesList.get(this.size - 1) != syntaxTreeStyles && (iIndexOf = this.syntaxTreeStylesList.indexOf(syntaxTreeStyles)) < this.size) {
                this.syntaxTreeStylesList.set(iIndexOf, this.syntaxTreeStylesList.get(this.size - 1));
                this.syntaxTreeStylesList.set(this.size - 1, syntaxTreeStyles);
            }
            this.size--;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -650273815977840081L, this, syntaxTreeStyles);
            }
            throw th;
        }
    }

    @ey(method = -2828991106010388544L)
    public void FH() {
        try {
            if (clear) {
                iy.gn(-1350132719847053308L, this);
            }
            this.size = 0;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -1350132719847053308L, this);
            }
            throw th;
        }
    }

    @ey(method = 123128041706176313L)
    public void createSyntaxTreeStylesList() {
        try {
            if (clear) {
                iy.gn(204149820666787325L, this);
            }
            this.syntaxTreeStylesList = new ArrayList();
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 204149820666787325L, this);
            }
            throw th;
        }
    }

    @ey(method = 1655291701001287872L)
    public SyntaxTreeStyles makeSyntaxTreeStyles() {
        try {
            if (clear) {
                iy.gn(-1159943479191456264L, this);
            }
            if (this.size == this.syntaxTreeStylesList.size()) {
                this.syntaxTreeStylesList.add(new SyntaxTreeStyles());
            }
            List<SyntaxTreeStyles> list = this.syntaxTreeStylesList;
            int i = this.size;
            this.size = i + 1;
            SyntaxTreeStyles syntaxTreeStyles = list.get(i);
            syntaxTreeStyles.DW();
            return syntaxTreeStyles;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -1159943479191456264L, this);
            }
            throw th;
        }
    }
}
