package abcd;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.net.URISyntaxException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class k10 extends c20<k10, bd0> {
    private boolean EQ;
    private he0 J0;
    private List<yd0> VH;
    private String Zo;
    private j70 gn;
    private boolean tp;
    private boolean u7;
    private boolean we;

    public k10(p70 p70Var) {
        super(p70Var);
        this.Zo = AppMeasurementSdk.ConditionalUserProperty.ORIGIN;
        this.gn = x60.j6;
        this.we = true;
        this.VH = new ArrayList(3);
    }

    public k10 EQ(j70 j70Var) {
        j6();
        this.gn = j70Var;
        return this;
    }

    public k10 J0(String str) {
        j6();
        this.Zo = str;
        return this;
    }

    public k10 J8(he0 he0Var) {
        j6();
        this.J0 = he0Var;
        return this;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: tp, reason: merged with bridge method [inline-methods] */
    public bd0 call() {
        j6();
        try {
            le0 le0VarYS = le0.yS(this.j6, this.Zo);
            try {
                le0VarYS.cb(this.u7);
                le0VarYS.Mz(this.tp);
                le0VarYS.sG(this.EQ);
                if (this.J0 != null) {
                    le0VarYS.I(this.J0);
                }
                le0VarYS.ef(this.we);
                v5(le0VarYS);
                return le0VarYS.VH(this.gn, this.VH);
            } finally {
                le0VarYS.Hw();
            }
        } catch (s40 e) {
            throw new n20(MessageFormat.format(JGitText.DW().invalidRemote, this.Zo), e);
        } catch (j50 e2) {
            throw new o20(JGitText.DW().exceptionCaughtDuringExecutionOfFetchCommand, e2);
        } catch (u40 e3) {
            throw new o20(JGitText.DW().exceptionCaughtDuringExecutionOfFetchCommand, e3);
        } catch (URISyntaxException unused) {
            throw new n20(MessageFormat.format(JGitText.DW().invalidRemote, this.Zo));
        }
    }

    public k10 we(List<yd0> list) {
        j6();
        this.VH.clear();
        this.VH.addAll(list);
        return this;
    }
}
