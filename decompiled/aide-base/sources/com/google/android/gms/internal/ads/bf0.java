package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class bf0 {
    public static final bf0 Hw = new bf0(1.0f, 1.0f);
    public final float DW;
    private final int FH;
    public final float j6;

    public bf0(float f, float f2) {
        this.j6 = f;
        this.DW = f2;
        this.FH = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bf0.class == obj.getClass()) {
            bf0 bf0Var = (bf0) obj;
            if (this.j6 == bf0Var.j6 && this.DW == bf0Var.DW) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.j6) + 527) * 31) + Float.floatToRawIntBits(this.DW);
    }

    public final long j6(long j) {
        return j * this.FH;
    }
}
