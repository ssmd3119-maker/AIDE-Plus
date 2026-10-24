package abcd;

import abcd.a40;
import abcd.d10;
import abcd.i10;
import abcd.n70;
import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class c10 extends m10<k70> {
    private static /* synthetic */ int[] EQ;
    private String FH;
    private boolean Hw;
    private String VH;
    private i10.a Zo;
    private k90 gn;
    private List<String> tp;
    private d10 u7;
    private boolean v5;

    class a extends a40.c {
        private final /* synthetic */ a70 FH;
        private final /* synthetic */ t60 Hw;
        private final /* synthetic */ g70 Zo;
        private final /* synthetic */ File v5;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, a70 a70Var, t60 t60Var, File file, g70 g70Var) {
            super(str);
            this.FH = a70Var;
            this.Hw = t60Var;
            this.v5 = file;
            this.Zo = g70Var;
        }

        @Override // abcd.a40.c
        public void j6(b40 b40Var) throws InterruptedException {
            b40Var.yS(this.FH);
            b40Var.a8(this.Hw);
            try {
                z30.FH(c10.this.j6, new File(this.v5, b40Var.tp()), b40Var, this.Zo);
            } catch (IOException e) {
                throw new o20(MessageFormat.format(JGitText.DW().checkoutConflictWithFile, b40Var.tp()), e);
            }
        }
    }

    public c10(p70 p70Var) {
        super(p70Var);
        this.Hw = false;
        this.v5 = false;
        this.VH = null;
        this.tp = new LinkedList();
    }

    private void EQ() throws m20 {
        if (this.tp.isEmpty()) {
            if (this.FH != null) {
                if (p70.lg("refs/heads/" + this.FH)) {
                    return;
                }
            }
            String str = JGitText.DW().branchNameInvalid;
            Object[] objArr = new Object[1];
            String str2 = this.FH;
            if (str2 == null) {
                str2 = "<null>";
            }
            objArr[0] = str2;
            throw new m20(MessageFormat.format(str, objArr));
        }
    }

    public static /* synthetic */ int[] Hw() {
        int[] iArr = EQ;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[n70.c.valuesCustom().length];
        try {
            iArr2[n70.c.FAST_FORWARD.ordinal()] = 6;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[n70.c.FORCED.ordinal()] = 5;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[n70.c.IO_FAILURE.ordinal()] = 9;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[n70.c.LOCK_FAILURE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[n70.c.NEW.ordinal()] = 4;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[n70.c.NOT_ATTEMPTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[n70.c.NO_CHANGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[n70.c.REJECTED.ordinal()] = 7;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[n70.c.REJECTED_CURRENT_BRANCH.ordinal()] = 8;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[n70.c.RENAMED.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        EQ = iArr2;
        return iArr2;
    }

    private a70 tp() throws v20, e40 {
        k90 k90Var = this.gn;
        if (k90Var != null) {
            k90Var.sy();
            return k90Var;
        }
        try {
            a70 a70VarRo = this.j6.ro(this.VH == null ? "HEAD" : this.VH);
            if (a70VarRo != null) {
                return a70VarRo;
            }
            String str = JGitText.DW().refNotResolved;
            Object[] objArr = new Object[1];
            String str2 = this.VH;
            objArr[0] = str2 != null ? str2 : "HEAD";
            throw new v20(MessageFormat.format(str, objArr));
        } catch (e40 e) {
            throw e;
        }
    }

    private String u7(k70 k70Var) {
        return k70Var.VH().getName().equals(k70Var.getName()) ? k70Var.VH().DW().yS() : p70.sG(k70Var.VH().getName());
    }

    public c10 J0(String str) {
        j6();
        this.FH = str;
        return this;
    }

    public c10 J8(String str) {
        j6();
        this.VH = str;
        this.gn = null;
        return this;
    }

    public c10 VH() {
        t90 t90Var = new t90(this.j6);
        w30 w30VarRN = this.j6.rN();
        try {
            a40 a40VarVH = w30VarRN.VH();
            jf0 jf0Var = new jf0(t90Var.lg());
            boolean z = true;
            jf0Var.KD(true);
            jf0Var.SI(qf0.FH(this.tp));
            if (this.gn != null || this.VH != null) {
                z = false;
            }
            if (z) {
                jf0Var.DW(new c40(w30VarRN));
            } else {
                jf0Var.j6(t90Var.ca(tp()).Eq());
            }
            File fileXL = this.j6.XL();
            g70 g70VarZo = this.j6.J0().Zo();
            while (jf0Var.rN()) {
                try {
                    a40VarVH.VH(new a(jf0Var.J0(), jf0Var.tp(0), jf0Var.gn(0), fileXL, g70VarZo));
                } finally {
                    jf0Var.vy();
                    g70VarZo.XL();
                }
            }
            a40VarVH.j6();
            return this;
        } finally {
            w30VarRN.P8();
            t90Var.lp();
        }
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: Zo, reason: merged with bridge method [inline-methods] */
    public k70 call() throws m20 {
        n70.c cVarVH;
        j6();
        EQ();
        try {
            try {
                k70 k70Var = null;
                if (!this.tp.isEmpty()) {
                    VH();
                    this.u7 = d10.DW;
                    FH(false);
                    return null;
                }
                if (this.v5) {
                    i10 i10VarDW = new l10(this.j6).DW();
                    i10VarDW.gn(this.FH);
                    i10VarDW.u7(tp().BT());
                    if (this.Zo != null) {
                        i10VarDW.tp(this.Zo);
                    }
                    i10VarDW.call();
                }
                k70 k70VarJ8 = this.j6.J8("HEAD");
                String str = "checkout: moving from " + u7(k70VarJ8);
                a70 a70VarRo = this.j6.ro(this.FH);
                if (a70VarRo == null) {
                    throw new v20(MessageFormat.format(JGitText.DW().refNotResolved, this.FH));
                }
                t90 t90Var = new t90(this.j6);
                a70 a70VarDW = k70VarJ8.DW();
                k90 k90VarCa = a70VarDW == null ? null : t90Var.ca(a70VarDW);
                k90 k90VarCa2 = t90Var.ca(a70VarRo);
                z30 z30Var = new z30(this.j6, k90VarCa == null ? null : k90VarCa.Eq(), this.j6.rN(), k90VarCa2.Eq());
                z30Var.j3(true);
                try {
                    z30Var.DW();
                    k70 k70VarJ82 = this.j6.J8(this.FH);
                    if (k70VarJ82 == null || k70VarJ82.getName().startsWith("refs/heads/")) {
                        k70Var = k70VarJ82;
                    }
                    String strSG = p70.sG(this.FH);
                    n70 n70VarSf = this.j6.Sf("HEAD", k70Var == null);
                    n70VarSf.rN(this.Hw);
                    n70VarSf.BT(String.valueOf(str) + " to " + strSG, false);
                    if (k70Var != null) {
                        cVarVH = n70VarSf.j3(k70Var.getName());
                    } else {
                        n70VarSf.er(k90VarCa2);
                        cVarVH = n70VarSf.VH();
                    }
                    FH(false);
                    int i = Hw()[cVarVH.ordinal()];
                    if (!(i == 3 || i == 4 || i == 5 || i == 6)) {
                        throw new o20(MessageFormat.format(JGitText.DW().checkoutUnexpectedResult, cVarVH.name()));
                    }
                    if (z30Var.u7().isEmpty()) {
                        this.u7 = d10.DW;
                    } else {
                        this.u7 = new d10(d10.a.NONDELETED, z30Var.u7());
                    }
                    if (this.u7 == null) {
                        this.u7 = d10.FH;
                    }
                    return k70Var;
                } catch (f40 e) {
                    this.u7 = new d10(d10.a.CONFLICTS, z30Var.gn());
                    throw e;
                }
            } catch (IOException e2) {
                throw new o20(e2.getMessage(), e2);
            }
        } finally {
            if (this.u7 == null) {
                this.u7 = d10.FH;
            }
        }
    }

    public d10 gn() {
        d10 d10Var = this.u7;
        return d10Var == null ? d10.Hw : d10Var;
    }

    public c10 v5(String str) {
        j6();
        this.tp.add(str);
        return this;
    }

    public c10 we(boolean z) {
        j6();
        this.Hw = z;
        return this;
    }
}
