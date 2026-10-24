package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;

@jg
/* loaded from: classes.dex */
public final class nr {
    public static void DW(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        new pr(view, onScrollChangedListener).j6();
    }

    public static void j6(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        new or(view, onGlobalLayoutListener).j6();
    }
}
