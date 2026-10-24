package com.google.android.gms.internal.ads;

import abcd.yu;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

@jg
/* loaded from: classes.dex */
public final class lv0 extends abcd.yu<sw0> {
    public lv0() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    public final pw0 FH(Context context, String str, ka kaVar) {
        try {
            IBinder iBinderFd = DW(context).Fd(abcd.xu.sy(context), str, kaVar, 14300000);
            if (iBinderFd == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderFd.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return iInterfaceQueryLocalInterface instanceof pw0 ? (pw0) iInterfaceQueryLocalInterface : new rw0(iBinderFd);
        } catch (yu.a | RemoteException e) {
            xp.v5("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // abcd.yu
    public final /* synthetic */ sw0 j6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return iInterfaceQueryLocalInterface instanceof sw0 ? (sw0) iInterfaceQueryLocalInterface : new tw0(iBinder);
    }
}
