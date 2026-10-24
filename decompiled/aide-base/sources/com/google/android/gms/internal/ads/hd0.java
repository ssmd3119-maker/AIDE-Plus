package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class hd0 extends xd0 {
    public hd0(nc0 nc0Var, String str, String str2, sz szVar, int i, int i2) {
        super(nc0Var, str, str2, szVar, i, 24);
    }

    private final void FH() throws ExecutionException, InterruptedException, TimeoutException {
        AdvertisingIdClient advertisingIdClientLg = this.j6.lg();
        if (advertisingIdClientLg == null) {
            return;
        }
        try {
            AdvertisingIdClient.a aVarFH = advertisingIdClientLg.FH();
            String strZo = uc0.Zo(aVarFH.j6());
            if (strZo != null) {
                synchronized (this.Hw) {
                    this.Hw.jO = strZo;
                    this.Hw.ko = Boolean.valueOf(aVarFH.DW());
                    this.Hw.oY = 5;
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.xd0, java.util.concurrent.Callable
    /* renamed from: DW */
    public final Void call() throws ExecutionException, InterruptedException, TimeoutException {
        if (this.j6.DW()) {
            return super.call();
        }
        if (!this.j6.QX()) {
            return null;
        }
        FH();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.xd0
    protected final void j6() throws ExecutionException, InterruptedException, TimeoutException {
        if (this.j6.QX()) {
            FH();
            return;
        }
        synchronized (this.Hw) {
            this.Hw.jO = (String) this.v5.invoke(null, this.j6.j6());
        }
    }
}
