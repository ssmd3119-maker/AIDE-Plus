package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.p;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzaz implements Runnable {
    private final String packageName;
    private final int status;
    private final zzay zzamn;
    private final Throwable zzamo;
    private final byte[] zzamp;
    private final Map<String, List<String>> zzamq;

    private zzaz(String str, zzay zzayVar, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        p.u7(zzayVar);
        this.zzamn = zzayVar;
        this.status = i;
        this.zzamo = th;
        this.zzamp = bArr;
        this.packageName = str;
        this.zzamq = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzamn.zza(this.packageName, this.status, this.zzamo, this.zzamp, this.zzamq);
    }
}
