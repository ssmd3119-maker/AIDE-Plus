package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public abstract class u6<T, B> {
    u6() {
    }

    abstract void DW(B b, int i, u2 u2Var);

    abstract int EQ(T t);

    abstract void FH(B b, int i, T t);

    abstract void Hw(T t, p7 p7Var);

    abstract void J0(B b, int i, int i2);

    abstract void J8(T t, p7 p7Var);

    abstract void QX(Object obj, B b);

    abstract T VH(B b);

    abstract void Ws(Object obj, T t);

    abstract T XL(T t, T t2);

    final boolean Zo(B b, b6 b6Var) throws k4 {
        int iZo = b6Var.Zo();
        int i = iZo >>> 3;
        int i2 = iZo & 7;
        if (i2 == 0) {
            j6(b, i, b6Var.PT());
            return true;
        }
        if (i2 == 1) {
            we(b, i, b6Var.vy());
            return true;
        }
        if (i2 == 2) {
            DW(b, i, b6Var.jJ());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw k4.Zo();
            }
            J0(b, i, b6Var.gW());
            return true;
        }
        B bJ3 = j3();
        int i3 = 4 | (i << 3);
        while (b6Var.gn() != Integer.MAX_VALUE && Zo(bJ3, b6Var)) {
        }
        if (i3 != b6Var.Zo()) {
            throw k4.v5();
        }
        FH(b, i, VH(bJ3));
        return true;
    }

    abstract void aM(Object obj);

    abstract int gn(T t);

    abstract B j3();

    abstract void j6(B b, int i, long j);

    abstract B tp(Object obj);

    abstract T u7(Object obj);

    abstract boolean v5(b6 b6Var);

    abstract void we(B b, int i, long j);
}
