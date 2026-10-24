package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.c;

@jg
/* loaded from: classes.dex */
public final class at0 extends com.google.android.gms.ads.internal.d<et0> {
    at0(Context context, Looper looper, c.a aVar, c.b bVar) {
        super(gj.FH(context), looper, 123, aVar, bVar, null);
    }

    public final et0 Hw() {
        return (et0) super.getService();
    }

    @Override // com.google.android.gms.common.internal.c
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return iInterfaceQueryLocalInterface instanceof et0 ? (et0) iInterfaceQueryLocalInterface : new ft0(iBinder);
    }

    @Override // com.google.android.gms.common.internal.c
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    @Override // com.google.android.gms.common.internal.c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.CACHE";
    }
}
