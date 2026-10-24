package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.c;

@jg
/* loaded from: classes.dex */
public final class m4 extends com.google.android.gms.ads.internal.d<r4> {
    m4(Context context, Looper looper, c.a aVar, c.b bVar) {
        super(gj.FH(context), looper, 166, aVar, bVar, null);
    }

    public final r4 Hw() {
        return (r4) super.getService();
    }

    @Override // com.google.android.gms.common.internal.c
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        return iInterfaceQueryLocalInterface instanceof r4 ? (r4) iInterfaceQueryLocalInterface : new s4(iBinder);
    }

    @Override // com.google.android.gms.common.internal.c
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    @Override // com.google.android.gms.common.internal.c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.HTTP";
    }
}
