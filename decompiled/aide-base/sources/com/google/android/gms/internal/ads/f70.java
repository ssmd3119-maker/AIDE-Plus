package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class f70<T> implements r70<T> {
    private final j80<?, ?> DW;
    private final boolean FH;
    private final e50<?> Hw;
    private final z60 j6;

    private f70(j80<?, ?> j80Var, e50<?> e50Var, z60 z60Var) {
        this.DW = j80Var;
        this.FH = e50Var.VH(z60Var);
        this.Hw = e50Var;
        this.j6 = z60Var;
    }

    static <T> f70<T> DW(j80<?, ?> j80Var, e50<?> e50Var, z60 z60Var) {
        return new f70<>(j80Var, e50Var, z60Var);
    }

    @Override // com.google.android.gms.internal.ads.r70
    public final void EQ(T t, f90 f90Var) {
        Iterator itV5 = this.Hw.gn(t).v5();
        while (itV5.hasNext()) {
            Map.Entry entry = (Map.Entry) itV5.next();
            j50 j50Var = (j50) entry.getKey();
            if (j50Var.EQ() != e90.MESSAGE || j50Var.Ws() || j50Var.j3()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof d60) {
                f90Var.gW(j50Var.Hw(), ((d60) entry).j6().j6());
            } else {
                f90Var.gW(j50Var.Hw(), entry.getValue());
            }
        }
        j80<?, ?> j80Var = this.DW;
        j80Var.J8(j80Var.gn(t), f90Var);
    }

    @Override // com.google.android.gms.internal.ads.r70
    public final int FH(T t) {
        j80<?, ?> j80Var = this.DW;
        int iTp = j80Var.tp(j80Var.gn(t)) + 0;
        return this.FH ? iTp + this.Hw.gn(t).Ws() : iTp;
    }

    @Override // com.google.android.gms.internal.ads.r70
    public final boolean Hw(T t, T t2) {
        if (!this.DW.gn(t).equals(this.DW.gn(t2))) {
            return false;
        }
        if (this.FH) {
            return this.Hw.gn(t).equals(this.Hw.gn(t2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.r70
    public final int VH(T t) {
        int iHashCode = this.DW.gn(t).hashCode();
        return this.FH ? (iHashCode * 53) + this.Hw.gn(t).hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.ads.r70
    public final boolean Zo(T t) {
        return this.Hw.gn(t).Hw();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0061 A[EDGE_INSN: B:50:0x0061->B:27:0x0061 BREAK  A[LOOP:1: B:14:0x0032->B:53:0x0032], SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.r70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void gn(T r8, byte[] r9, int r10, int r11, com.google.android.gms.internal.ads.f40 r12) throws com.google.android.gms.internal.ads.y50 {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.r50 r8 = (com.google.android.gms.internal.ads.r50) r8
            com.google.android.gms.internal.ads.k80 r0 = r8.zzfpu
            com.google.android.gms.internal.ads.k80 r1 = com.google.android.gms.internal.ads.k80.Zo()
            if (r0 != r1) goto L10
            com.google.android.gms.internal.ads.k80 r0 = com.google.android.gms.internal.ads.k80.VH()
            r8.zzfpu = r0
        L10:
            r8 = r0
        L11:
            if (r10 >= r11) goto L6b
            int r2 = com.google.android.gms.internal.ads.e40.v5(r9, r10, r12)
            int r0 = r12.j6
            r10 = 11
            r1 = 2
            if (r0 == r10) goto L30
            r10 = r0 & 7
            if (r10 != r1) goto L2b
            r1 = r9
            r3 = r11
            r4 = r8
            r5 = r12
            int r10 = com.google.android.gms.internal.ads.e40.FH(r0, r1, r2, r3, r4, r5)
            goto L11
        L2b:
            int r10 = com.google.android.gms.internal.ads.e40.j6(r0, r9, r2, r11, r12)
            goto L11
        L30:
            r10 = 0
            r0 = 0
        L32:
            if (r2 >= r11) goto L61
            int r2 = com.google.android.gms.internal.ads.e40.v5(r9, r2, r12)
            int r3 = r12.j6
            int r4 = r3 >>> 3
            r5 = r3 & 7
            if (r4 == r1) goto L4f
            r6 = 3
            if (r4 == r6) goto L44
            goto L58
        L44:
            if (r5 != r1) goto L58
            int r2 = com.google.android.gms.internal.ads.e40.tp(r9, r2, r12)
            java.lang.Object r0 = r12.FH
            com.google.android.gms.internal.ads.i40 r0 = (com.google.android.gms.internal.ads.i40) r0
            goto L32
        L4f:
            if (r5 != 0) goto L58
            int r2 = com.google.android.gms.internal.ads.e40.v5(r9, r2, r12)
            int r10 = r12.j6
            goto L32
        L58:
            r4 = 12
            if (r3 == r4) goto L61
            int r2 = com.google.android.gms.internal.ads.e40.j6(r3, r9, r2, r11, r12)
            goto L32
        L61:
            if (r0 == 0) goto L69
            int r10 = r10 << 3
            r10 = r10 | r1
            r8.EQ(r10, r0)
        L69:
            r10 = r2
            goto L11
        L6b:
            if (r10 != r11) goto L6e
            return
        L6e:
            com.google.android.gms.internal.ads.y50 r8 = com.google.android.gms.internal.ads.y50.gn()
            goto L74
        L73:
            throw r8
        L74:
            goto L73
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.f70.gn(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.f40):void");
    }

    @Override // com.google.android.gms.internal.ads.r70
    public final void j6(T t, T t2) {
        t70.gn(this.DW, t, t2);
        if (this.FH) {
            t70.Zo(this.Hw, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.ads.r70
    public final void tp(T t, q70 q70Var, d50 d50Var) {
        boolean zBT;
        j80<?, ?> j80Var = this.DW;
        e50<?> e50Var = this.Hw;
        Object objU7 = j80Var.u7(t);
        h50<T> h50VarU7 = e50Var.u7(t);
        while (q70Var.rN() != Integer.MAX_VALUE) {
            try {
                int iZo = q70Var.Zo();
                if (iZo == 11) {
                    int iEi = 0;
                    Object objDW = null;
                    i40 i40VarVy = null;
                    while (q70Var.rN() != Integer.MAX_VALUE) {
                        int iZo2 = q70Var.Zo();
                        if (iZo2 == 16) {
                            iEi = q70Var.ei();
                            objDW = e50Var.DW(d50Var, this.j6, iEi);
                        } else if (iZo2 == 26) {
                            if (objDW != null) {
                                e50Var.v5(q70Var, objDW, d50Var, h50VarU7);
                                throw null;
                            }
                            i40VarVy = q70Var.vy();
                        } else if (!q70Var.BT()) {
                            break;
                        }
                    }
                    if (q70Var.Zo() != 12) {
                        throw y50.v5();
                    }
                    if (i40VarVy != null) {
                        if (objDW != null) {
                            e50Var.Hw(i40VarVy, objDW, d50Var, h50VarU7);
                            throw null;
                        }
                        j80Var.DW(objU7, iEi, i40VarVy);
                    }
                    zBT = true;
                } else if ((iZo & 7) == 2) {
                    Object objDW2 = e50Var.DW(d50Var, this.j6, iZo >>> 3);
                    if (objDW2 != null) {
                        e50Var.v5(q70Var, objDW2, d50Var, h50VarU7);
                        throw null;
                    }
                    zBT = j80Var.Zo(objU7, q70Var);
                } else {
                    zBT = q70Var.BT();
                }
                if (!zBT) {
                    return;
                }
            } finally {
                j80Var.QX(t, objU7);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.r70
    public final void u7(T t) {
        this.DW.aM(t);
        this.Hw.tp(t);
    }

    @Override // com.google.android.gms.internal.ads.r70
    public final T v5() {
        return (T) this.j6.FH().KD();
    }
}
