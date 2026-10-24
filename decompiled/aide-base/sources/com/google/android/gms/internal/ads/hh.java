package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.c;

@jg
/* loaded from: classes.dex */
public final class hh extends com.google.android.gms.ads.internal.d<nh> {
    public hh(Context context, Looper looper, c.a aVar, c.b bVar) {
        super(gj.FH(context), looper, 8, aVar, bVar, null);
    }

    public final nh Hw() {
        return (nh) super.getService();
    }

    @Override // com.google.android.gms.common.internal.c
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return iInterfaceQueryLocalInterface instanceof nh ? (nh) iInterfaceQueryLocalInterface : new ph(iBinder);
    }

    @Override // com.google.android.gms.common.internal.c
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    @Override // com.google.android.gms.common.internal.c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.START";
    }
}
