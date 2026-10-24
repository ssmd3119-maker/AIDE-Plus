package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.e4;

/* loaded from: classes.dex */
public final class a5 implements d6 {
    private static final k5 DW = new b5();
    private final k5 j6;

    public a5() {
        this(new c5(d4.FH(), FH()));
    }

    private static boolean DW(j5 j5Var) {
        return j5Var.FH() == e4.e.u7;
    }

    private static k5 FH() {
        try {
            return (k5) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return DW;
        }
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public final <T> c6<T> j6(Class<T> cls) {
        e6.KD(cls);
        j5 j5VarDW = this.j6.DW(cls);
        return j5VarDW.DW() ? e4.class.isAssignableFrom(cls) ? r5.tp(e6.lp(), u3.DW(), j5VarDW.j6()) : r5.tp(e6.sy(), u3.FH(), j5VarDW.j6()) : e4.class.isAssignableFrom(cls) ? DW(j5VarDW) ? p5.EQ(cls, j5VarDW, v5.DW(), v4.v5(), e6.lp(), u3.DW(), i5.DW()) : p5.EQ(cls, j5VarDW, v5.DW(), v4.v5(), e6.lp(), null, i5.DW()) : DW(j5VarDW) ? p5.EQ(cls, j5VarDW, v5.j6(), v4.Hw(), e6.sy(), u3.FH(), i5.j6()) : p5.EQ(cls, j5VarDW, v5.j6(), v4.Hw(), e6.aj(), null, i5.j6());
    }

    private a5(k5 k5Var) {
        g4.Hw(k5Var, "messageInfoFactory");
        this.j6 = k5Var;
    }
}
