package com.google.android.gms.common;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class q extends p {
    private final byte[] mb;

    q(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.mb = bArr;
    }

    @Override // com.google.android.gms.common.p
    final byte[] g3() {
        return this.mb;
    }
}
