package abcd;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.LinkedList;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class b10 extends m10<w30> {
    private Collection<String> FH;
    private kf0 Hw;
    private boolean v5;

    public b10(p70 p70Var) {
        super(p70Var);
        this.v5 = false;
        this.FH = new LinkedList();
    }

    public b10 Hw(String str) {
        j6();
        this.FH.add(str);
        return this;
    }

    public b10 Zo(boolean z) {
        this.v5 = z;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    /* renamed from: v5, reason: merged with bridge method [inline-methods] */
    public w30 call() throws Throwable {
        w30 w30VarRN;
        if (this.FH.isEmpty()) {
            throw new q20(JGitText.DW().atLeastOnePatternIsRequired);
        }
        j6();
        boolean zContains = this.FH.contains(".");
        e70 e70VarEr = this.j6.er();
        w30 w30Var = null;
        try {
            try {
                w30VarRN = this.j6.rN();
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
        }
        try {
            y30 y30VarJ6 = w30VarRN.j6();
            jf0 jf0Var = new jf0(this.j6);
            jf0Var.DW(new x30(y30VarJ6));
            if (this.Hw == null) {
                this.Hw = new hf0(this.j6);
            }
            jf0Var.DW(this.Hw);
            jf0Var.KD(true);
            if (!zContains) {
                jf0Var.SI(qf0.FH(this.FH));
            }
            while (jf0Var.rN()) {
                String strJ0 = jf0Var.J0();
                kf0 kf0Var = (kf0) jf0Var.QX(1, kf0.class);
                if (jf0Var.QX(0, c40.class) != null || kf0Var == null || !kf0Var.aj()) {
                    if (!strJ0.equals(w30Var) && (!this.v5 || jf0Var.QX(0, c40.class) != null)) {
                        c40 c40Var = (c40) jf0Var.QX(0, c40.class);
                        if (kf0Var != null) {
                            long jSG = kf0Var.sG();
                            b40 b40Var = new b40(strJ0);
                            if (c40Var == null || c40Var.vy() == null || !c40Var.vy().Ws()) {
                                t60 t60VarSf = kf0Var.Sf(c40Var);
                                b40Var.a8(t60VarSf);
                                if (t60.gn != t60VarSf) {
                                    b40Var.er(jSG);
                                    b40Var.lg(kf0Var.dx());
                                    InputStream inputStreamKQ = kf0Var.kQ();
                                    try {
                                        b40Var.yS(e70VarEr.Zo(3, jSG, inputStreamKQ));
                                        inputStreamKQ.close();
                                        y30VarJ6.VH(b40Var);
                                    } catch (Throwable th2) {
                                        inputStreamKQ.close();
                                        throw th2;
                                    }
                                } else {
                                    a70 a70VarRo = l10.J0(new File(this.j6.XL(), strJ0)).u7().ro("HEAD");
                                    if (a70VarRo != null) {
                                        b40Var.yS(a70VarRo);
                                        y30VarJ6.VH(b40Var);
                                    }
                                }
                                w30Var = strJ0;
                            } else {
                                y30VarJ6.VH(c40Var.vy());
                            }
                        } else if (!this.v5) {
                            y30VarJ6.VH(c40Var.vy());
                        }
                    }
                }
            }
            e70VarEr.FH();
            y30VarJ6.j6();
            FH(false);
            e70VarEr.we();
            if (w30VarRN != null) {
                w30VarRN.P8();
            }
            return w30VarRN;
        } catch (IOException e2) {
            e = e2;
            throw new o20(JGitText.DW().exceptionCaughtDuringExecutionOfAddCommand, e);
        } catch (Throwable th3) {
            th = th3;
            w30Var = w30VarRN;
            e70VarEr.we();
            if (w30Var != null) {
                w30Var.P8();
            }
            throw th;
        }
    }
}
