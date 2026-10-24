package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;

/* loaded from: classes.dex */
public final class o60 implements s70 {
    private static final y60 DW = new p60();
    private final y60 j6;

    public o60() {
        this(new q60(q50.FH(), FH()));
    }

    private static boolean DW(x60 x60Var) {
        return x60Var.FH() == r50.e.u7;
    }

    private static y60 FH() {
        try {
            return (y60) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return DW;
        }
    }

    @Override // com.google.android.gms.internal.ads.s70
    public final <T> r70<T> j6(Class<T> cls) {
        t70.dx(cls);
        x60 x60VarDW = this.j6.DW(cls);
        return x60VarDW.j6() ? r50.class.isAssignableFrom(cls) ? f70.DW(t70.U2(), g50.DW(), x60VarDW.DW()) : f70.DW(t70.j3(), g50.FH(), x60VarDW.DW()) : r50.class.isAssignableFrom(cls) ? DW(x60VarDW) ? d70.U2(cls, x60VarDW, j70.DW(), i60.Hw(), t70.U2(), g50.DW(), w60.DW()) : d70.U2(cls, x60VarDW, j70.DW(), i60.Hw(), t70.U2(), null, w60.DW()) : DW(x60VarDW) ? d70.U2(cls, x60VarDW, j70.j6(), i60.FH(), t70.j3(), g50.FH(), w60.j6()) : d70.U2(cls, x60VarDW, j70.j6(), i60.FH(), t70.Mr(), null, w60.j6());
    }

    private o60(y60 y60Var) {
        t50.Hw(y60Var, "messageInfoFactory");
        this.j6 = y60Var;
    }
}
