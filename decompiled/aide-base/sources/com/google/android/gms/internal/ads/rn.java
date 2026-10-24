package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebSettings;

@TargetApi(16)
/* loaded from: classes.dex */
public class rn extends on {
    @Override // com.google.android.gms.internal.ads.jn
    public final void FH(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    @Override // com.google.android.gms.internal.ads.jn
    public final void gn(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    @Override // com.google.android.gms.internal.ads.mn, com.google.android.gms.internal.ads.jn
    public boolean tp(Context context, WebSettings webSettings) {
        super.tp(context, webSettings);
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
        return true;
    }
}
