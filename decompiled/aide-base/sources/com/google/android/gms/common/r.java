package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class r extends p {
    private static final WeakReference<byte[]> jw = new WeakReference<>(null);
    private WeakReference<byte[]> mb;

    r(byte[] bArr) {
        super(bArr);
        this.mb = jw;
    }

    protected abstract byte[] CU();

    @Override // com.google.android.gms.common.p
    final byte[] g3() {
        byte[] bArrCU;
        synchronized (this) {
            bArrCU = this.mb.get();
            if (bArrCU == null) {
                bArrCU = CU();
                this.mb = new WeakReference<>(bArrCU);
            }
        }
        return bArrCU;
    }
}
