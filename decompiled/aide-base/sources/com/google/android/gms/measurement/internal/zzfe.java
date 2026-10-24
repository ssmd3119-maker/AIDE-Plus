package com.google.android.gms.measurement.internal;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class zzfe extends zzy {
    private final /* synthetic */ zzfd zzatd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfe(zzfd zzfdVar, zzct zzctVar) {
        super(zzctVar);
        this.zzatd = zzfdVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzy
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.zzatd.zzlo();
    }
}
