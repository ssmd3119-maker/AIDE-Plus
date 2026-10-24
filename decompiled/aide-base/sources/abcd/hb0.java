package abcd;

import abcd.k70;
import abcd.n70;
import java.io.IOException;

/* loaded from: classes.dex */
public class hb0 extends n70 {
    private static /* synthetic */ int[] J0;
    private final gb0 EQ;
    private sa0 we;

    public hb0(gb0 gb0Var, k70 k70Var) {
        super(k70Var);
        this.EQ = gb0Var;
    }

    public static /* synthetic */ int[] KD() {
        int[] iArr = J0;
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
        J0 = iArr2;
        return iArr2;
    }

    private String cn(n70.c cVar) {
        int i = KD()[cVar.ordinal()];
        if (i == 4) {
            return "created";
        }
        if (i == 5) {
            return "forced-update";
        }
        if (i != 6) {
            return null;
        }
        return "fast forward";
    }

    @Override // abcd.n70
    public n70.c Hw(n70.c cVar) throws IOException {
        if (EQ().v5().j6() != k70.a.NEW) {
            this.EQ.J8(this);
        }
        return cVar;
    }

    @Override // abcd.n70
    public void P8() {
        sa0 sa0Var = this.we;
        if (sa0Var != null) {
            sa0Var.QX();
            this.we = null;
        }
    }

    @Override // abcd.n70
    public p70 Ws() {
        return this.EQ.Mr();
    }

    @Override // abcd.n70
    public n70.c Zo(n70.c cVar) throws IOException {
        String strCn;
        this.we.J0(((pb0) this.EQ.Mr().gn().tp(pb0.Hw)).FH());
        this.we.Ws(true);
        this.we.aM(u7());
        String strJ8 = J8();
        if (strJ8 != null) {
            if (aM() && (strCn = cn(cVar)) != null) {
                if (strJ8.length() > 0) {
                    strJ8 = String.valueOf(strJ8) + ": " + strCn;
                } else {
                    strJ8 = strCn;
                }
            }
            this.EQ.er(this, strJ8, true);
        }
        if (!this.we.Hw()) {
            return n70.c.LOCK_FAILURE;
        }
        this.EQ.sh(this, this.we.Zo());
        return cVar;
    }

    @Override // abcd.n70
    /* renamed from: ro, reason: merged with bridge method [inline-methods] */
    public gb0 we() {
        return this.EQ;
    }

    @Override // abcd.n70
    public n70.c v5(String str) throws IOException {
        this.we.J0(((pb0) this.EQ.Mr().gn().tp(pb0.Hw)).FH());
        this.we.Ws(true);
        this.we.j3(r60.DW("ref: " + str + '\n'));
        String strJ8 = J8();
        if (strJ8 != null) {
            this.EQ.er(this, strJ8, false);
        }
        if (!this.we.Hw()) {
            return n70.c.LOCK_FAILURE;
        }
        this.EQ.cb(this, this.we.Zo(), str);
        return EQ().j6() == k70.a.NEW ? n70.c.NEW : n70.c.FORCED;
    }

    @Override // abcd.n70
    public boolean vy(boolean z) throws IOException {
        k70 k70VarEQ = EQ();
        if (z) {
            k70VarEQ = k70VarEQ.v5();
        }
        String name = k70VarEQ.getName();
        sa0 sa0Var = new sa0(this.EQ.QX(name), Ws().tp());
        this.we = sa0Var;
        if (!sa0Var.u7()) {
            return false;
        }
        k70 k70VarFH = this.EQ.FH(name);
        yS(k70VarFH != null ? k70VarFH.DW() : null);
        return true;
    }
}
