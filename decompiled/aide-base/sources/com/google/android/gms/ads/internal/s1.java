package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.internal.ads.ds;
import com.google.android.gms.internal.ads.fl;
import com.google.android.gms.internal.ads.gl;
import com.google.android.gms.internal.ads.jg;
import com.google.android.gms.internal.ads.kl;
import com.google.android.gms.internal.ads.ls;
import com.google.android.gms.internal.ads.mu;
import com.google.android.gms.internal.ads.yt;
import com.google.android.gms.internal.ads.zzur;

@jg
/* loaded from: classes.dex */
public final class s1 {
    public final ds DW;
    public final kl FH;
    public final zzur Hw;
    public final mu j6;

    private s1(mu muVar, ds dsVar, kl klVar, zzur zzurVar) {
        this.j6 = muVar;
        this.DW = dsVar;
        this.FH = klVar;
        this.Hw = zzurVar;
    }

    public static s1 j6(Context context) {
        return new s1(new yt(), new ls(), new fl(new gl()), new zzur(context));
    }
}
