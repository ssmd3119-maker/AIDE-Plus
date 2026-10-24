package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class j80<T, B> {
    j80() {
    }

    abstract void DW(B b, int i, i40 i40Var);

    abstract B EQ();

    abstract void FH(B b, int i, T t);

    abstract void Hw(T t, f90 f90Var);

    abstract void J0(B b, int i, int i2);

    abstract void J8(T t, f90 f90Var);

    abstract void QX(Object obj, B b);

    abstract int VH(T t);

    abstract void Ws(Object obj, T t);

    abstract T XL(T t, T t2);

    final boolean Zo(B b, q70 q70Var) throws y50 {
        int iZo = q70Var.Zo();
        int i = iZo >>> 3;
        int i2 = iZo & 7;
        if (i2 == 0) {
            j6(b, i, q70Var.U2());
            return true;
        }
        if (i2 == 1) {
            we(b, i, q70Var.lg());
            return true;
        }
        if (i2 == 2) {
            DW(b, i, q70Var.vy());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw y50.Zo();
            }
            J0(b, i, q70Var.yS());
            return true;
        }
        B bEQ = EQ();
        int i3 = 4 | (i << 3);
        while (q70Var.rN() != Integer.MAX_VALUE && Zo(bEQ, q70Var)) {
        }
        if (i3 != q70Var.Zo()) {
            throw y50.v5();
        }
        FH(b, i, j3(bEQ));
        return true;
    }

    abstract void aM(Object obj);

    abstract T gn(Object obj);

    abstract T j3(B b);

    abstract void j6(B b, int i, long j);

    abstract int tp(T t);

    abstract B u7(Object obj);

    abstract boolean v5(q70 q70Var);

    abstract void we(B b, int i, long j);
}
