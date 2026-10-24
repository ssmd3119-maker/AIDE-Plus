package com.google.android.gms.ads.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.d;
import com.google.android.gms.internal.ads.hy0;
import com.google.android.gms.internal.ads.jg;
import com.google.android.gms.internal.ads.xp;

@jg
/* loaded from: classes.dex */
public final class SearchAdView extends ViewGroup {
    private final hy0 WB;

    public SearchAdView(Context context) {
        super(context);
        this.WB = new hy0(this);
    }

    public final com.google.android.gms.ads.a getAdListener() {
        return this.WB.DW();
    }

    public final d getAdSize() {
        return this.WB.FH();
    }

    public final String getAdUnitId() {
        return this.WB.v5();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i5 = ((i3 - i) - measuredWidth) / 2;
        int i6 = ((i4 - i2) - measuredHeight) / 2;
        childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int iDW;
        int measuredWidth = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            d adSize = null;
            try {
                adSize = getAdSize();
            } catch (NullPointerException e) {
                xp.Hw("Unable to retrieve ad size.", e);
            }
            if (adSize != null) {
                Context context = getContext();
                int iHw = adSize.Hw(context);
                iDW = adSize.DW(context);
                measuredWidth = iHw;
            } else {
                iDW = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            measuredWidth = childAt.getMeasuredWidth();
            iDW = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(measuredWidth, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(iDW, getSuggestedMinimumHeight()), i2));
    }

    public final void setAdListener(com.google.android.gms.ads.a aVar) {
        this.WB.J0(aVar);
    }

    public final void setAdSize(d dVar) {
        this.WB.J8(dVar);
    }

    public final void setAdUnitId(String str) {
        this.WB.Ws(str);
    }

    public SearchAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.WB = new hy0(this, attributeSet, false);
    }

    public SearchAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.WB = new hy0(this, attributeSet, false);
    }
}
