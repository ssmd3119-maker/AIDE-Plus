package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

@jg
/* loaded from: classes.dex */
public final class g4 extends abcd.yu<r2> {
    public g4() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // abcd.yu
    public final /* synthetic */ r2 j6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof r2 ? (r2) iInterfaceQueryLocalInterface : new s2(iBinder);
    }
}
