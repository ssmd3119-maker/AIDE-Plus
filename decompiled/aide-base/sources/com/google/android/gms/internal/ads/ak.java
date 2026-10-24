package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

@jg
/* loaded from: classes.dex */
public final class ak extends abcd.yu<tj> {
    public ak() {
        super("com.google.android.gms.ads.reward.RewardedVideoAdCreatorImpl");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // abcd.yu
    public final /* synthetic */ tj j6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
        return iInterfaceQueryLocalInterface instanceof tj ? (tj) iInterfaceQueryLocalInterface : new vj(iBinder);
    }
}
