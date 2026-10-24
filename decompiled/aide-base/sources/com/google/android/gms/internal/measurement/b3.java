package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class b3 {
    private final byte[] DW;
    private final k3 j6;

    private b3(int i) {
        byte[] bArr = new byte[i];
        this.DW = bArr;
        this.j6 = k3.AL(bArr);
    }

    public final k3 DW() {
        return this.j6;
    }

    public final u2 j6() {
        if (this.j6.Q6() == 0) {
            return new d3(this.DW);
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    /* synthetic */ b3(int i, v2 v2Var) {
        this(i);
    }
}
