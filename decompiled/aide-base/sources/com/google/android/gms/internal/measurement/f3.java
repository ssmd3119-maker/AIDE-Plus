package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public abstract class f3 {
    int DW;
    i3 FH;
    int j6;

    private f3() {
        this.DW = 100;
    }

    static f3 Hw(byte[] bArr, int i, int i2, boolean z) {
        h3 h3Var = new h3(bArr, i, i2, false);
        try {
            h3Var.u7(i2);
            return h3Var;
        } catch (k4 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static f3 we(byte[] bArr, int i, int i2) {
        return Hw(bArr, i, i2, false);
    }

    public abstract boolean BT();

    public abstract float DW();

    public abstract void EQ(int i);

    public abstract String FH();

    public abstract int J0();

    public abstract long J8();

    public abstract String Mr();

    public abstract int QX();

    public abstract u2 U2();

    public abstract boolean VH(int i);

    public abstract long Ws();

    public abstract long XL();

    public abstract void Zo(int i);

    public abstract int a8();

    public abstract int aM();

    public abstract long er();

    public abstract long gW();

    public final int gn(int i) {
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

    public abstract boolean j3();

    public abstract double j6();

    public abstract int lg();

    public abstract int rN();

    public abstract void tp(int i);

    public abstract int u7(int i);

    public abstract <T extends l5> T v5(w5<T> w5Var, r3 r3Var);

    public abstract int vy();

    public abstract int yS();
}
