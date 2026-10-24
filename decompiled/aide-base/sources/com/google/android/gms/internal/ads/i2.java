package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.a;

@jg
/* loaded from: classes.dex */
public final class i2 extends a.b {
    private final Drawable DW;
    private final Uri FH;
    private final double Hw;
    private final f2 j6;

    public i2(f2 f2Var) {
        abcd.wu wuVarK0;
        this.j6 = f2Var;
        Uri uriJm = null;
        try {
            wuVarK0 = f2Var.K0();
        } catch (RemoteException e) {
            xp.Hw("", e);
        }
        Drawable drawable = wuVarK0 != null ? (Drawable) abcd.xu.g3(wuVarK0) : null;
        this.DW = drawable;
        try {
            uriJm = this.j6.Jm();
        } catch (RemoteException e2) {
            xp.Hw("", e2);
        }
        this.FH = uriJm;
        double dPA = 1.0d;
        try {
            dPA = this.j6.PA();
        } catch (RemoteException e3) {
            xp.Hw("", e3);
        }
        this.Hw = dPA;
    }

    @Override // com.google.android.gms.ads.formats.a.b
    public final double DW() {
        return this.Hw;
    }

    @Override // com.google.android.gms.ads.formats.a.b
    public final Uri FH() {
        return this.FH;
    }

    @Override // com.google.android.gms.ads.formats.a.b
    public final Drawable j6() {
        return this.DW;
    }
}
