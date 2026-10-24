package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.internal.ads.jg;
import com.google.android.gms.internal.ads.zzazc;

@jg
/* loaded from: classes.dex */
public final class g extends RelativeLayout {
    private zzazc WB;
    boolean mb;

    public g(Context context, String str, String str2) {
        super(context);
        zzazc zzazcVar = new zzazc(context, str);
        this.WB = zzazcVar;
        zzazcVar.we(str2);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.mb) {
            return false;
        }
        this.WB.EQ(motionEvent);
        return false;
    }
}
