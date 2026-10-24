package com.google.android.gms.internal.ads;

import android.net.Uri;

/* loaded from: classes.dex */
public final class pm0 {
    public final long DW;
    private final String FH;
    private int Hw;
    public final long j6;

    public pm0(String str, long j, long j2) {
        this.FH = str == null ? "" : str;
        this.j6 = j;
        this.DW = j2;
    }

    private final String FH(String str) {
        return hp0.FH(str, this.FH);
    }

    public final Uri DW(String str) {
        return Uri.parse(hp0.FH(str, this.FH));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pm0.class == obj.getClass()) {
            pm0 pm0Var = (pm0) obj;
            if (this.j6 == pm0Var.j6 && this.DW == pm0Var.DW && this.FH.equals(pm0Var.FH)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.Hw == 0) {
            this.Hw = ((((((int) this.j6) + 527) * 31) + ((int) this.DW)) * 31) + this.FH.hashCode();
        }
        return this.Hw;
    }

    public final pm0 j6(pm0 pm0Var, String str) {
        String strFH = FH(str);
        if (pm0Var != null && strFH.equals(pm0Var.FH(str))) {
            long j = this.DW;
            if (j != -1) {
                long j2 = this.j6;
                if (j2 + j == pm0Var.j6) {
                    long j3 = pm0Var.DW;
                    return new pm0(strFH, j2, j3 != -1 ? j + j3 : -1L);
                }
            }
            long j4 = pm0Var.DW;
            if (j4 != -1) {
                long j5 = pm0Var.j6;
                if (j5 + j4 == this.j6) {
                    long j6 = this.DW;
                    return new pm0(strFH, j5, j6 != -1 ? j4 + j6 : -1L);
                }
            }
        }
        return null;
    }
}
