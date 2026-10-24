package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public class s4 {
    private volatile u2 DW;
    private volatile l5 j6;

    static {
        r3.Hw();
    }

    private final l5 j6(l5 l5Var) {
        if (this.j6 == null) {
            synchronized (this) {
                if (this.j6 == null) {
                    try {
                        this.j6 = l5Var;
                        this.DW = u2.mb;
                    } catch (k4 unused) {
                        this.j6 = l5Var;
                        this.DW = u2.mb;
                    }
                }
            }
        }
        return this.j6;
    }

    public final l5 DW(l5 l5Var) {
        l5 l5Var2 = this.j6;
        this.DW = null;
        this.j6 = l5Var;
        return l5Var2;
    }

    public final u2 FH() {
        if (this.DW != null) {
            return this.DW;
        }
        synchronized (this) {
            if (this.DW != null) {
                return this.DW;
            }
            if (this.j6 == null) {
                this.DW = u2.mb;
            } else {
                this.DW = this.j6.Hw();
            }
            return this.DW;
        }
    }

    public final int Hw() {
        if (this.DW != null) {
            return this.DW.size();
        }
        if (this.j6 != null) {
            return this.j6.Zo();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4)) {
            return false;
        }
        s4 s4Var = (s4) obj;
        l5 l5Var = this.j6;
        l5 l5Var2 = s4Var.j6;
        return (l5Var == null && l5Var2 == null) ? FH().equals(s4Var.FH()) : (l5Var == null || l5Var2 == null) ? l5Var != null ? l5Var.equals(s4Var.j6(l5Var.gn())) : j6(l5Var2.gn()).equals(l5Var2) : l5Var.equals(l5Var2);
    }

    public int hashCode() {
        return 1;
    }
}
