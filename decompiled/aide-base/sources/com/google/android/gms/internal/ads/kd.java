package com.google.android.gms.internal.ads;

import abcd.yu;
import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

@jg
/* loaded from: classes.dex */
public final class kd extends abcd.yu<od> {
    public kd() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public final ld FH(Activity activity) {
        try {
            IBinder iBinderGO = DW(activity).gO(abcd.xu.sy(activity));
            if (iBinderGO == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderGO.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return iInterfaceQueryLocalInterface instanceof ld ? (ld) iInterfaceQueryLocalInterface : new nd(iBinderGO);
        } catch (yu.a e) {
            xp.v5("Could not create remote AdOverlay.", e);
            return null;
        } catch (RemoteException e2) {
            xp.v5("Could not create remote AdOverlay.", e2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // abcd.yu
    public final /* synthetic */ od j6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return iInterfaceQueryLocalInterface instanceof od ? (od) iInterfaceQueryLocalInterface : new pd(iBinder);
    }
}
