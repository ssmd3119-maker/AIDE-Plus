package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class s40 {
    int DW;
    v40 FH;
    int j6;

    private s40() {
        this.DW = 100;
    }

    public static int P8(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long a8(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static s40 ei(byte[] bArr, int i, int i2) {
        return lg(bArr, i, i2, false);
    }

    static s40 lg(byte[] bArr, int i, int i2, boolean z) {
        u40 u40Var = new u40(bArr, i, i2, z);
        try {
            u40Var.gW(i2);
            return u40Var;
        } catch (y50 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract void BT(int i);

    public abstract float DW();

    public abstract boolean EQ();

    public abstract String FH();

    public abstract <T extends z60> T Hw(k70<T> k70Var, d50 d50Var);

    public abstract i40 J0();

    public abstract int J8();

    public abstract boolean Mr();

    public abstract int QX();

    public abstract int U2();

    public abstract long VH();

    public abstract int Ws();

    public abstract long XL();

    public abstract long Zo();

    public abstract int aM();

    public abstract boolean er(int i);

    public abstract int gW(int i);

    public abstract int gn();

    public abstract long j3();

    public abstract double j6();

    public abstract void rN(int i);

    public abstract int tp();

    public abstract long u7();

    public abstract int v5();

    public abstract void vy(int i);

    public abstract String we();

    public final int yS(int i) {
        if (i >= 0) {
            int i2 = this.DW;
            this.DW = i;
            return i2;
        }
        StringBuilder sb = new StringBuilder(47);
        sb.append("Recursion limit cannot be negative: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
