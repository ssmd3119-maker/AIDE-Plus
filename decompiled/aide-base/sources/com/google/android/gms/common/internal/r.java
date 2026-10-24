package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.api.a;

/* loaded from: classes.dex */
public class r<T extends IInterface> extends g<T> {
    private final a.h<T> FH;

    @Override // com.google.android.gms.common.internal.c
    protected T createServiceInterface(IBinder iBinder) {
        return (T) this.FH.createServiceInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.g, com.google.android.gms.common.internal.c, com.google.android.gms.common.api.a.f
    public int getMinApkVersion() {
        return super.getMinApkVersion();
    }

    @Override // com.google.android.gms.common.internal.c
    protected String getServiceDescriptor() {
        return this.FH.getServiceDescriptor();
    }

    @Override // com.google.android.gms.common.internal.c
    protected String getStartServiceAction() {
        return this.FH.getStartServiceAction();
    }

    public a.h<T> gn() {
        return this.FH;
    }

    @Override // com.google.android.gms.common.internal.c
    protected void onSetConnectState(int i, T t) {
        this.FH.j6(i, t);
    }
}
