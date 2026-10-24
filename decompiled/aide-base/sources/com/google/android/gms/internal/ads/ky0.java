package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

@jg
/* loaded from: classes.dex */
public final class ky0 extends abcd.yu<px0> {
    public ky0() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // abcd.yu
    public final /* synthetic */ px0 j6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return iInterfaceQueryLocalInterface instanceof px0 ? (px0) iInterfaceQueryLocalInterface : new qx0(iBinder);
    }
}
