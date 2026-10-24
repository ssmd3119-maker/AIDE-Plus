package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.cv;
import com.google.android.gms.internal.ads.jg;

@jg
/* loaded from: classes.dex */
public final class h {
    public final ViewGroup.LayoutParams DW;
    public final ViewGroup FH;
    public final Context Hw;
    public final int j6;

    public h(cv cvVar) throws f {
        this.DW = cvVar.getLayoutParams();
        ViewParent parent = cvVar.getParent();
        this.Hw = cvVar.fF();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new f("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.FH = viewGroup;
        this.j6 = viewGroup.indexOfChild(cvVar.getView());
        this.FH.removeView(cvVar.getView());
        cvVar.dH(true);
    }
}
