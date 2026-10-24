package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class b8 {
    final byte[] DW;
    final int j6;

    b8(int i, byte[] bArr) {
        this.j6 = i;
        this.DW = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b8)) {
            return false;
        }
        b8 b8Var = (b8) obj;
        return this.j6 == b8Var.j6 && Arrays.equals(this.DW, b8Var.DW);
    }

    public final int hashCode() {
        return ((this.j6 + 527) * 31) + Arrays.hashCode(this.DW);
    }
}
