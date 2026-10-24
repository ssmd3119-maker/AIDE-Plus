package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class p90 {
    protected volatile int j6 = -1;

    public static final <T extends p90> T DW(T t, byte[] bArr) throws o90 {
        FH(t, bArr, 0, bArr.length);
        return t;
    }

    private static final <T extends p90> T FH(T t, byte[] bArr, int i, int i2) throws o90 {
        try {
            g90 g90VarLg = g90.lg(bArr, 0, i2);
            t.j6(g90VarLg);
            g90VarLg.XL(0);
            return t;
        } catch (o90 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e2);
        }
    }

    public static final byte[] VH(p90 p90Var) {
        int iV5 = p90Var.v5();
        byte[] bArr = new byte[iV5];
        try {
            h90 h90VarLg = h90.lg(bArr, 0, iV5);
            p90Var.Hw(h90VarLg);
            h90VarLg.Hw();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public void Hw(h90 h90Var) {
    }

    @Override // 
    /* renamed from: Zo, reason: merged with bridge method [inline-methods] */
    public p90 clone() {
        return (p90) super.clone();
    }

    protected int gn() {
        return 0;
    }

    public abstract p90 j6(g90 g90Var);

    public String toString() {
        return r90.DW(this);
    }

    public final int v5() {
        int iGn = gn();
        this.j6 = iGn;
        return iGn;
    }
}
