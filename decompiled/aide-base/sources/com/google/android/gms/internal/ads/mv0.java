package com.google.android.gms.internal.ads;

import abcd.yu;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

@jg
/* loaded from: classes.dex */
public final class mv0 extends abcd.yu<xw0> {
    public mv0() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    public final uw0 FH(Context context, zzwf zzwfVar, String str, ka kaVar, int i) {
        try {
            IBinder iBinderRt = DW(context).Rt(abcd.xu.sy(context), zzwfVar, str, kaVar, 14300000, i);
            if (iBinderRt == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderRt.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return iInterfaceQueryLocalInterface instanceof uw0 ? (uw0) iInterfaceQueryLocalInterface : new ww0(iBinderRt);
        } catch (yu.a | RemoteException e) {
            xp.FH("Could not create remote AdManager.", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // abcd.yu
    public final /* synthetic */ xw0 j6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return iInterfaceQueryLocalInterface instanceof xw0 ? (xw0) iInterfaceQueryLocalInterface : new yw0(iBinder);
    }
}
