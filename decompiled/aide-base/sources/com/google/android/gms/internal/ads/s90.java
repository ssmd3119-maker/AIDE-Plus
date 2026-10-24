package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class s90 {
    final byte[] DW;
    final int j6;

    s90(int i, byte[] bArr) {
        this.j6 = i;
        this.DW = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s90)) {
            return false;
        }
        s90 s90Var = (s90) obj;
        return this.j6 == s90Var.j6 && Arrays.equals(this.DW, s90Var.DW);
    }

    public final int hashCode() {
        return ((this.j6 + 527) * 31) + Arrays.hashCode(this.DW);
    }
}
