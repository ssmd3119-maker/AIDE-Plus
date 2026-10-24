package abcd;

import abcd.le0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.net.URISyntaxException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class u10 extends c20<u10, Iterable<td0>> {
    private boolean EQ;
    private final List<yd0> VH;
    private String Zo;
    private j70 gn;
    private boolean tp;
    private String u7;
    private boolean we;

    public u10(p70 p70Var) {
        super(p70Var);
        this.Zo = AppMeasurementSdk.ConditionalUserProperty.ORIGIN;
        this.gn = x60.j6;
        this.u7 = "git-receive-pack";
        this.we = false;
        this.VH = new ArrayList(3);
    }

    public String EQ() {
        return this.Zo;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: tp, reason: merged with bridge method [inline-methods] */
    public Iterable<td0> call() throws n20 {
        k70 k70VarJ8;
        j6();
        ArrayList arrayList = new ArrayList(3);
        try {
            if (this.VH.isEmpty()) {
                this.VH.addAll(new zd0(this.j6.gn(), EQ()).v5());
            }
            if (this.VH.isEmpty() && (k70VarJ8 = this.j6.J8("HEAD")) != null && k70VarJ8.gn()) {
                this.VH.add(new yd0(k70VarJ8.v5().getName()));
            }
            if (this.EQ) {
                for (int i = 0; i < this.VH.size(); i++) {
                    this.VH.set(i, this.VH.get(i).XL(true));
                }
            }
            Iterator<le0> it = le0.P8(this.j6, this.Zo, le0.a.PUSH).iterator();
            while (it.hasNext()) {
                le0 next = it.next();
                next.g3(this.we);
                if (this.u7 != null) {
                    next.Sf(this.u7);
                }
                next.sG(this.tp);
                v5(next);
                try {
                    try {
                        arrayList.add(next.KD(this.gn, next.gn(this.VH)));
                    } catch (j50 e) {
                        throw new o20(JGitText.DW().exceptionCaughtDuringExecutionOfPushCommand, e);
                    }
                } finally {
                }
            }
            return arrayList;
        } catch (u40 e2) {
            throw new o20(JGitText.DW().exceptionCaughtDuringExecutionOfPushCommand, e2);
        } catch (IOException e3) {
            throw new o20(JGitText.DW().exceptionCaughtDuringExecutionOfPushCommand, e3);
        } catch (URISyntaxException unused) {
            throw new n20(MessageFormat.format(JGitText.DW().invalidRemote, this.Zo));
        }
    }

    public u10 we(j70 j70Var) {
        j6();
        this.gn = j70Var;
        return this;
    }
}
