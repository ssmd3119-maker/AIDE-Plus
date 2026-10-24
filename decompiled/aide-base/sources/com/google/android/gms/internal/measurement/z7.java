package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public abstract class z7 {
    protected volatile int j6 = -1;

    public void DW(r7 r7Var) {
    }

    protected int FH() {
        return 0;
    }

    public final int Hw() {
        int iFH = FH();
        this.j6 = iFH;
        return iFH;
    }

    public final int Zo() {
        if (this.j6 < 0) {
            Hw();
        }
        return this.j6;
    }

    public abstract z7 j6(q7 q7Var);

    public String toString() {
        return a8.DW(this);
    }

    @Override // 
    /* renamed from: v5, reason: merged with bridge method [inline-methods] */
    public z7 clone() {
        return (z7) super.clone();
    }
}
