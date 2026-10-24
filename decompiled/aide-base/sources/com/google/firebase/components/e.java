package com.google.firebase.components;

/* loaded from: classes.dex */
public final class e {
    private final int DW;
    private final int FH;
    private final Class<?> j6;

    private e(Class<?> cls, int i, int i2) {
        com.google.android.gms.common.internal.p.tp(cls, "Null dependency anInterface.");
        this.j6 = cls;
        this.DW = i;
        this.FH = i2;
    }

    public static e j6(Class<?> cls) {
        return new e(cls, 1, 0);
    }

    public final Class<?> DW() {
        return this.j6;
    }

    public final boolean FH() {
        return this.DW == 1;
    }

    public final boolean Hw() {
        return this.FH == 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.j6 == eVar.j6 && this.DW == eVar.DW && this.FH == eVar.FH) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.j6.hashCode() ^ 1000003) * 1000003) ^ this.DW) * 1000003) ^ this.FH;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.j6);
        sb.append(", required=");
        sb.append(this.DW == 1);
        sb.append(", direct=");
        sb.append(this.FH == 0);
        sb.append("}");
        return sb.toString();
    }
}
