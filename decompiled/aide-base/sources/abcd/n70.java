package abcd;

import java.io.IOException;
import java.text.MessageFormat;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public abstract class n70 {
    private boolean DW;
    private i70 FH;
    private a70 VH;
    private a70 Zo;
    private a70 j6;
    private boolean tp;
    private final k70 u7;
    private boolean v5;
    private c gn = c.NOT_ATTEMPTED;
    private String Hw = "";

    class a extends d {
        public a() {
            super(n70.this, null);
        }

        @Override // abcd.n70.d
        public c j6(c cVar) {
            return cVar == c.NO_CHANGE ? cVar : n70.this.Zo(cVar);
        }
    }

    class b extends d {
        public b() {
            super(n70.this, null);
        }

        @Override // abcd.n70.d
        public c j6(c cVar) {
            n70.this.Hw(cVar);
            return cVar;
        }
    }

    public enum c {
        NOT_ATTEMPTED,
        LOCK_FAILURE,
        NO_CHANGE,
        NEW,
        FORCED,
        FAST_FORWARD,
        REJECTED,
        REJECTED_CURRENT_BRANCH,
        IO_FAILURE,
        RENAMED;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            c[] cVarArrValuesCustom = values();
            int length = cVarArrValuesCustom.length;
            c[] cVarArr = new c[length];
            System.arraycopy(cVarArrValuesCustom, 0, cVarArr, 0, length);
            return cVarArr;
        }
    }

    private abstract class d {
        private d(n70 n70Var) {
        }

        public abstract c j6(c cVar);

        public /* synthetic */ d(n70 n70Var, d dVar) {
            this(n70Var);
        }
    }

    public n70(k70 k70Var) {
        this.u7 = k70Var;
        this.Zo = k70Var.DW();
    }

    private void Mr() {
        if (this.j6 == null) {
            throw new IllegalStateException(JGitText.DW().aNewObjectIdIsRequired);
        }
    }

    private c SI(t90 t90Var, d dVar) {
        if (we().v5(gn())) {
            return c.LOCK_FAILURE;
        }
        try {
            if (!vy(true)) {
                return c.LOCK_FAILURE;
            }
            if (this.VH != null) {
                if (!j60.Mr(this.VH, this.Zo != null ? this.Zo : a70.ca())) {
                    return c.LOCK_FAILURE;
                }
            }
            if (this.Zo == null) {
                return dVar.j6(c.NEW);
            }
            o90 o90VarU2 = U2(t90Var, this.j6);
            o90 o90VarU22 = U2(t90Var, this.Zo);
            return (o90VarU2 != o90VarU22 || this.tp) ? ((o90VarU2 instanceof k90) && (o90VarU22 instanceof k90) && t90Var.P8((k90) o90VarU22, (k90) o90VarU2)) ? dVar.j6(c.FAST_FORWARD) : XL() ? dVar.j6(c.FORCED) : c.REJECTED : dVar.j6(c.NO_CHANGE);
        } finally {
            P8();
        }
    }

    private static o90 U2(t90 t90Var, j60 j60Var) {
        if (j60Var == null) {
            return null;
        }
        try {
            return t90Var.I(j60Var);
        } catch (q40 unused) {
            return null;
        }
    }

    public void BT(String str, boolean z) {
        if (str == null && !z) {
            FH();
            return;
        }
        if (str == null && z) {
            this.Hw = "";
            this.v5 = true;
        } else {
            this.Hw = str;
            this.v5 = z;
        }
    }

    public c DW(t90 t90Var) {
        String name = EQ().v5().getName();
        if (name.startsWith("refs/heads/")) {
            k70 k70VarFH = we().FH("HEAD");
            while (k70VarFH.gn()) {
                k70VarFH = k70VarFH.VH();
                if (name.equals(k70VarFH.getName())) {
                    c cVar = c.REJECTED_CURRENT_BRANCH;
                    this.gn = cVar;
                    return cVar;
                }
            }
        }
        try {
            c cVarSI = SI(t90Var, new b());
            this.gn = cVarSI;
            return cVarSI;
        } catch (IOException e) {
            this.gn = c.IO_FAILURE;
            throw e;
        }
    }

    public k70 EQ() {
        return this.u7;
    }

    public void FH() {
        this.Hw = null;
        this.v5 = false;
    }

    public abstract c Hw(c cVar);

    public i70 J0() {
        return this.FH;
    }

    public String J8() {
        return this.Hw;
    }

    public abstract void P8();

    public c QX() {
        return this.gn;
    }

    public c VH() {
        this.DW = true;
        return ei();
    }

    public abstract p70 Ws();

    public boolean XL() {
        return this.DW;
    }

    public abstract c Zo(c cVar);

    public void a8() {
        this.tp = true;
    }

    public boolean aM() {
        return this.v5;
    }

    public c ei() {
        t90 t90Var = new t90(Ws());
        try {
            return nw(t90Var);
        } finally {
            t90Var.lp();
        }
    }

    public void er(j60 j60Var) {
        this.j6 = j60Var.Zo();
    }

    public void gW(i70 i70Var) {
        this.FH = i70Var;
    }

    public String gn() {
        return EQ().getName();
    }

    public c j3(String str) {
        if (!str.startsWith("refs/")) {
            throw new IllegalArgumentException(MessageFormat.format(JGitText.DW().illegalArgumentNotA, "refs/"));
        }
        try {
            if (we().v5(gn())) {
                return c.LOCK_FAILURE;
            }
            try {
                if (!vy(false)) {
                    return c.LOCK_FAILURE;
                }
                k70 k70VarFH = we().FH(gn());
                if (k70VarFH != null && k70VarFH.gn() && str.equals(k70VarFH.VH().getName())) {
                    c cVar = c.NO_CHANGE;
                    this.gn = cVar;
                    return cVar;
                }
                if (k70VarFH != null && k70VarFH.DW() != null) {
                    yS(k70VarFH.DW());
                }
                k70 k70VarFH2 = we().FH(str);
                if (k70VarFH2 != null && k70VarFH2.DW() != null) {
                    er(k70VarFH2.DW());
                }
                c cVarV5 = v5(str);
                this.gn = cVarV5;
                return cVarV5;
            } catch (IOException e) {
                this.gn = c.IO_FAILURE;
                throw e;
            }
        } finally {
            P8();
        }
    }

    public c j6() {
        t90 t90Var = new t90(Ws());
        try {
            return DW(t90Var);
        } finally {
            t90Var.lp();
        }
    }

    public void lg(j60 j60Var) {
        this.VH = j60Var != null ? j60Var.cn() : null;
    }

    public c nw(t90 t90Var) {
        Mr();
        try {
            c cVarSI = SI(t90Var, new a());
            this.gn = cVarSI;
            return cVarSI;
        } catch (IOException e) {
            this.gn = c.IO_FAILURE;
            throw e;
        }
    }

    public void rN(boolean z) {
        this.DW = z;
    }

    public a70 tp() {
        return this.Zo;
    }

    public a70 u7() {
        return this.j6;
    }

    public abstract c v5(String str);

    public abstract boolean vy(boolean z);

    public abstract m70 we();

    public void yS(a70 a70Var) {
        this.Zo = a70Var;
    }
}
