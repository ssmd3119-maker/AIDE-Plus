package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.MediaView;
import java.util.WeakHashMap;

@jg
/* loaded from: classes.dex */
public final class f3 implements com.google.android.gms.ads.formats.f {
    private static WeakHashMap<IBinder, f3> FH = new WeakHashMap<>();
    private final MediaView DW;
    private final b3 j6;

    private f3(b3 b3Var) {
        Context context;
        new com.google.android.gms.ads.g();
        this.j6 = b3Var;
        MediaView mediaView = null;
        try {
            context = (Context) abcd.xu.g3(b3Var.IP());
        } catch (RemoteException | NullPointerException e) {
            xp.Hw("", e);
            context = null;
        }
        if (context != null) {
            MediaView mediaView2 = new MediaView(context);
            try {
                if (this.j6.mT(abcd.xu.sy(mediaView2))) {
                    mediaView = mediaView2;
                }
            } catch (RemoteException e2) {
                xp.Hw("", e2);
            }
        }
        this.DW = mediaView;
    }

    public static f3 j6(b3 b3Var) {
        synchronized (FH) {
            f3 f3Var = FH.get(b3Var.asBinder());
            if (f3Var != null) {
                return f3Var;
            }
            f3 f3Var2 = new f3(b3Var);
            FH.put(b3Var.asBinder(), f3Var2);
            return f3Var2;
        }
    }

    public final b3 DW() {
        return this.j6;
    }

    @Override // com.google.android.gms.ads.formats.f
    public final String vy() {
        try {
            return this.j6.vy();
        } catch (RemoteException e) {
            xp.Hw("", e);
            return null;
        }
    }
}
