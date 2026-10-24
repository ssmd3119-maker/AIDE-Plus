package com.google.android.gms.internal.ads;

import abcd.yu;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;

@jg
/* loaded from: classes.dex */
public final class f4 extends abcd.yu<m2> {
    public f4() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    public final j2 FH(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder iBinderKj = DW(context).kj(abcd.xu.sy(context), abcd.xu.sy(frameLayout), abcd.xu.sy(frameLayout2), 14300000);
            if (iBinderKj == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderKj.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return iInterfaceQueryLocalInterface instanceof j2 ? (j2) iInterfaceQueryLocalInterface : new l2(iBinderKj);
        } catch (yu.a | RemoteException e) {
            xp.v5("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // abcd.yu
    public final /* synthetic */ m2 j6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof m2 ? (m2) iInterfaceQueryLocalInterface : new n2(iBinder);
    }
}
