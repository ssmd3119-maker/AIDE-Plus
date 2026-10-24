package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.widget.ViewSwitcher;
import com.google.android.gms.internal.ads.cv;
import com.google.android.gms.internal.ads.lp;
import com.google.android.gms.internal.ads.sm;
import com.google.android.gms.internal.ads.zzazc;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class y0 extends ViewSwitcher {
    private final zzazc WB;
    private boolean jw;
    private final lp mb;

    public y0(Context context, String str, String str2, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        super(context);
        zzazc zzazcVar = new zzazc(context);
        this.WB = zzazcVar;
        zzazcVar.j6(str);
        this.WB.we(str2);
        this.jw = true;
        if (context instanceof Activity) {
            this.mb = new lp((Activity) context, this, onGlobalLayoutListener, onScrollChangedListener);
        } else {
            this.mb = new lp(null, this, onGlobalLayoutListener, onScrollChangedListener);
        }
        this.mb.FH();
    }

    public final void DW() {
        sm.we("Disable position monitoring on adFrame.");
        lp lpVar = this.mb;
        if (lpVar != null) {
            lpVar.Hw();
        }
    }

    public final void FH() {
        sm.we("Enable debug gesture detector on adFrame.");
        this.jw = true;
    }

    public final void Hw() {
        sm.we("Disable debug gesture detector on adFrame.");
        this.jw = false;
    }

    public final zzazc j6() {
        return this.WB;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        lp lpVar = this.mb;
        if (lpVar != null) {
            lpVar.j6();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        lp lpVar = this.mb;
        if (lpVar != null) {
            lpVar.DW();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.jw) {
            return false;
        }
        this.WB.EQ(motionEvent);
        return false;
    }

    @Override // android.widget.ViewAnimator, android.view.ViewGroup
    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            KeyEvent.Callback childAt = getChildAt(i2);
            if (childAt != null && (childAt instanceof cv)) {
                arrayList.add((cv) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((cv) obj).destroy();
        }
    }
}
