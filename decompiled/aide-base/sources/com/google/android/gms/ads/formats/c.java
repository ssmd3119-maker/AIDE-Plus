package com.google.android.gms.ads.formats;

import abcd.wu;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.o2;
import com.google.android.gms.internal.ads.xp;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class c {
    public static WeakHashMap<View, c> FH = new WeakHashMap<>();
    private WeakReference<View> DW;
    private o2 j6;

    private final void FH(wu wuVar) {
        WeakReference<View> weakReference = this.DW;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null) {
            xp.u7("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
            return;
        }
        if (!FH.containsKey(view)) {
            FH.put(view, this);
        }
        o2 o2Var = this.j6;
        if (o2Var != null) {
            try {
                o2Var.aX(wuVar);
            } catch (RemoteException e) {
                xp.Hw("Unable to call setNativeAd on delegate", e);
            }
        }
    }

    public final void DW(g gVar) {
        FH((wu) gVar.EQ());
    }

    public final void j6(a aVar) {
        FH((wu) aVar.j6());
    }
}
