package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class nm0 {
    public final String DW;
    private final String FH;
    public final String j6;

    public nm0(String str, String str2, String str3) {
        this.j6 = str;
        this.DW = str2;
        this.FH = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nm0.class == obj.getClass()) {
            nm0 nm0Var = (nm0) obj;
            if (ip0.u7(this.j6, nm0Var.j6) && ip0.u7(this.DW, nm0Var.DW) && ip0.u7(this.FH, nm0Var.FH)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.j6;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.DW;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.FH;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
