package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class f60 {
    private volatile i40 DW;
    private volatile z60 j6;

    static {
        d50.Hw();
    }

    private final z60 FH(z60 z60Var) {
        if (this.j6 == null) {
            synchronized (this) {
                if (this.j6 == null) {
                    try {
                        this.j6 = z60Var;
                        this.DW = i40.mb;
                    } catch (y50 unused) {
                        this.j6 = z60Var;
                        this.DW = i40.mb;
                    }
                }
            }
        }
        return this.j6;
    }

    public final int DW() {
        if (this.DW != null) {
            return this.DW.size();
        }
        if (this.j6 != null) {
            return this.j6.u7();
        }
        return 0;
    }

    public final z60 Hw(z60 z60Var) {
        z60 z60Var2 = this.j6;
        this.DW = null;
        this.j6 = z60Var;
        return z60Var2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f60)) {
            return false;
        }
        f60 f60Var = (f60) obj;
        z60 z60Var = this.j6;
        z60 z60Var2 = f60Var.j6;
        return (z60Var == null && z60Var2 == null) ? j6().equals(f60Var.j6()) : (z60Var == null || z60Var2 == null) ? z60Var != null ? z60Var.equals(f60Var.FH(z60Var.Zo())) : FH(z60Var2.Zo()).equals(z60Var2) : z60Var.equals(z60Var2);
    }

    public int hashCode() {
        return 1;
    }

    public final i40 j6() {
        if (this.DW != null) {
            return this.DW;
        }
        synchronized (this) {
            if (this.DW != null) {
                return this.DW;
            }
            if (this.j6 == null) {
                this.DW = i40.mb;
            } else {
                this.DW = this.j6.Hw();
            }
            return this.DW;
        }
    }
}
