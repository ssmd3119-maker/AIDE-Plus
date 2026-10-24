package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class nh0 {
    public final byte[] DW;
    public final int j6 = 1;

    public nh0(int i, byte[] bArr) {
        this.DW = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nh0.class == obj.getClass()) {
            nh0 nh0Var = (nh0) obj;
            if (this.j6 == nh0Var.j6 && Arrays.equals(this.DW, nh0Var.DW)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.j6 * 31) + Arrays.hashCode(this.DW);
    }
}
