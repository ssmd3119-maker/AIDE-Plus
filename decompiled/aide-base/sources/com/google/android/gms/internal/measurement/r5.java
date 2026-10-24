package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class r5<T> implements c6<T> {
    private final u6<?, ?> DW;
    private final boolean FH;
    private final s3<?> Hw;
    private final l5 j6;

    private r5(u6<?, ?> u6Var, s3<?> s3Var, l5 l5Var) {
        this.DW = u6Var;
        this.FH = s3Var.VH(l5Var);
        this.Hw = s3Var;
        this.j6 = l5Var;
    }

    static <T> r5<T> tp(u6<?, ?> u6Var, s3<?> s3Var, l5 l5Var) {
        return new r5<>(u6Var, s3Var, l5Var);
    }

    @Override // com.google.android.gms.internal.measurement.c6
    public final void DW(T t, p7 p7Var) {
        Iterator itV5 = this.Hw.gn(t).v5();
        while (itV5.hasNext()) {
            Map.Entry entry = (Map.Entry) itV5.next();
            x3 x3Var = (x3) entry.getKey();
            if (x3Var.VH() != o7.MESSAGE || x3Var.nw() || x3Var.gW()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof q4) {
                p7Var.Zo(x3Var.J8(), ((q4) entry).j6().FH());
            } else {
                p7Var.Zo(x3Var.J8(), entry.getValue());
            }
        }
        u6<?, ?> u6Var = this.DW;
        u6Var.J8(u6Var.u7(t), p7Var);
    }

    @Override // com.google.android.gms.internal.measurement.c6
    public final void FH(T t) {
        this.DW.aM(t);
        this.Hw.tp(t);
    }

    @Override // com.google.android.gms.internal.measurement.c6
    public final boolean Hw(T t, T t2) {
        if (!this.DW.u7(t).equals(this.DW.u7(t2))) {
            return false;
        }
        if (this.FH) {
            return this.Hw.gn(t).equals(this.Hw.gn(t2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.c6
    public final int VH(T t) {
        int iHashCode = this.DW.u7(t).hashCode();
        return this.FH ? (iHashCode * 53) + this.Hw.gn(t).hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.measurement.c6
    public final int Zo(T t) {
        u6<?, ?> u6Var = this.DW;
        int iEQ = u6Var.EQ(u6Var.u7(t)) + 0;
        return this.FH ? iEQ + this.Hw.gn(t).Mr() : iEQ;
    }

    @Override // com.google.android.gms.internal.measurement.c6
    public final boolean gn(T t) {
        return this.Hw.gn(t).Hw();
    }

    @Override // com.google.android.gms.internal.measurement.c6
    public final void j6(T t, T t2) {
        e6.gn(this.DW, t, t2);
        if (this.FH) {
            e6.Zo(this.Hw, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.c6
    public final void u7(T t, b6 b6Var, r3 r3Var) {
        boolean zQO;
        u6<?, ?> u6Var = this.DW;
        s3<?> s3Var = this.Hw;
        Object objTp = u6Var.tp(t);
        v3<T> v3VarU7 = s3Var.u7(t);
        while (b6Var.gn() != Integer.MAX_VALUE) {
            try {
                int iZo = b6Var.Zo();
                if (iZo == 11) {
                    int iJ8 = 0;
                    Object objJ6 = null;
                    u2 u2VarJJ = null;
                    while (b6Var.gn() != Integer.MAX_VALUE) {
                        int iZo2 = b6Var.Zo();
                        if (iZo2 == 16) {
                            iJ8 = b6Var.J8();
                            objJ6 = s3Var.j6(r3Var, this.j6, iJ8);
                        } else if (iZo2 == 26) {
                            if (objJ6 != null) {
                                s3Var.Hw(b6Var, objJ6, r3Var, v3VarU7);
                                throw null;
                            }
                            u2VarJJ = b6Var.jJ();
                        } else if (!b6Var.QO()) {
                            break;
                        }
                    }
                    if (b6Var.Zo() != 12) {
                        throw k4.v5();
                    }
                    if (u2VarJJ != null) {
                        if (objJ6 != null) {
                            s3Var.FH(u2VarJJ, objJ6, r3Var, v3VarU7);
                            throw null;
                        }
                        u6Var.DW(objTp, iJ8, u2VarJJ);
                    }
                    zQO = true;
                } else if ((iZo & 7) == 2) {
                    Object objJ62 = s3Var.j6(r3Var, this.j6, iZo >>> 3);
                    if (objJ62 != null) {
                        s3Var.Hw(b6Var, objJ62, r3Var, v3VarU7);
                        throw null;
                    }
                    zQO = u6Var.Zo(objTp, b6Var);
                } else {
                    zQO = b6Var.QO();
                }
                if (!zQO) {
                    return;
                }
            } finally {
                u6Var.QX(t, objTp);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.c6
    public final T v5() {
        return (T) this.j6.VH().a8();
    }
}
