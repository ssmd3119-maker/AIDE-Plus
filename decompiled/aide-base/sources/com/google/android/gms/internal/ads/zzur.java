package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

@jg
/* loaded from: classes.dex */
public final class zzur {
    boolean DW;
    ee0 j6;

    public zzur(Context context, String str, String str2) {
        p.j6(context);
        try {
            this.j6 = (ee0) yp.j6(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", st0.j6);
            abcd.xu.sy(context);
            this.j6.hu(abcd.xu.sy(context), str, null);
            this.DW = true;
        } catch (RemoteException | aq | NullPointerException unused) {
            xp.VH("Cannot dynamite load clearcut");
        }
    }

    public final vt0 j6(byte[] bArr) {
        return new vt0(this, bArr);
    }

    public zzur(Context context) {
        p.j6(context);
        if (((Boolean) cw0.v5().FH(p.RW)).booleanValue()) {
            try {
                this.j6 = (ee0) yp.j6(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", tt0.j6);
                abcd.xu.sy(context);
                this.j6.g0(abcd.xu.sy(context), "GMA_SDK");
                this.DW = true;
            } catch (RemoteException | aq | NullPointerException unused) {
                xp.VH("Cannot dynamite load clearcut");
            }
        }
    }

    public zzur() {
    }
}
