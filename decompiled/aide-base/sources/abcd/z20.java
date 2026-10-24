package abcd;

import abcd.d30;

/* loaded from: classes.dex */
public abstract class z20 {
    private static /* synthetic */ int[] DW;
    private static /* synthetic */ int[] j6;

    public enum a {
        MYERS,
        HISTOGRAM;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] aVarArrValuesCustom = values();
            int length = aVarArrValuesCustom.length;
            a[] aVarArr = new a[length];
            System.arraycopy(aVarArrValuesCustom, 0, aVarArr, 0, length);
            return aVarArr;
        }
    }

    public static /* synthetic */ int[] DW() {
        int[] iArr = DW;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[d30.a.valuesCustom().length];
        try {
            iArr2[d30.a.DELETE.ordinal()] = 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[d30.a.EMPTY.ordinal()] = 4;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[d30.a.INSERT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[d30.a.REPLACE.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        DW = iArr2;
        return iArr2;
    }

    private static <S extends p30> d30 FH(S s, S s2) {
        return new d30(0, s.j6(), 0, s2.j6());
    }

    public static z20 Zo(a aVar) {
        int i = j6()[aVar.ordinal()];
        if (i == 1) {
            return l30.Zo;
        }
        if (i == 2) {
            return new i30();
        }
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ int[] j6() {
        int[] iArr = j6;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[a.valuesCustom().length];
        try {
            iArr2[a.HISTOGRAM.ordinal()] = 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[a.MYERS.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        j6 = iArr2;
        return iArr2;
    }

    public <S extends p30> e30 Hw(q30<? super S> q30Var, S s, S s2) {
        d30 d30VarFH = q30Var.FH(s, s2, FH(s, s2));
        int i = DW()[d30VarFH.tp().ordinal()];
        if (i == 1 || i == 2) {
            return e30.j6(d30VarFH);
        }
        if (i != 3) {
            if (i == 4) {
                return new e30(0);
            }
            throw new IllegalStateException();
        }
        u30 u30Var = new u30(q30Var);
        t30 t30VarDW = t30.DW(s, d30VarFH);
        t30 t30VarFH = t30.FH(s2, d30VarFH);
        e30 e30VarV5 = v5(u30Var, t30VarDW, t30VarFH);
        t30.Hw(e30VarV5, t30VarDW, t30VarFH);
        d30 d30Var = e30VarV5.get(e30VarV5.size() - 1);
        if (d30Var.tp() == d30.a.INSERT) {
            while (d30Var.Hw < s2.j6() && q30Var.j6(s2, d30Var.FH, s2, d30Var.Hw)) {
                d30Var.j6++;
                d30Var.DW++;
                d30Var.FH++;
                d30Var.Hw++;
            }
        }
        return e30VarV5;
    }

    public abstract <S extends p30> e30 v5(q30<? super S> q30Var, S s, S s2);
}
