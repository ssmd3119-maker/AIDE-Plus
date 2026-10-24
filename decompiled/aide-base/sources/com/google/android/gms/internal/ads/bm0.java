package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class bm0 {
    public final long DW;
    public final long FH;
    public final boolean j6;

    private bm0(boolean z, long j, long j2) {
        this.j6 = z;
        this.DW = j;
        this.FH = j2;
    }

    public static bm0 j6(om0 om0Var, long j) {
        int i;
        int size = om0Var.FH.size();
        int i2 = 0;
        long jMin = Long.MAX_VALUE;
        int i3 = 0;
        boolean z = false;
        boolean zJ6 = false;
        long jMax = 0;
        while (i3 < size) {
            em0 em0VarEQ = om0Var.FH.get(i3).FH.get(i2).EQ();
            if (em0VarEQ == null) {
                return new bm0(true, 0L, j);
            }
            zJ6 |= em0VarEQ.j6();
            int iFH = em0VarEQ.FH(j);
            if (iFH == 0) {
                i = i3;
                z = true;
                jMax = 0;
                jMin = 0;
            } else if (z) {
                i = i3;
            } else {
                int iV5 = em0VarEQ.v5();
                i = i3;
                jMax = Math.max(jMax, em0VarEQ.Hw(iV5));
                if (iFH != -1) {
                    int i4 = (iV5 + iFH) - 1;
                    jMin = Math.min(jMin, em0VarEQ.Hw(i4) + em0VarEQ.Zo(i4, j));
                }
            }
            i3 = i + 1;
            i2 = 0;
        }
        return new bm0(zJ6, jMax, jMin);
    }
}
