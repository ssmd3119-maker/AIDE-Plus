package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.hv0;
import com.google.android.gms.internal.ads.hy0;
import com.google.android.gms.internal.ads.xp;

/* loaded from: classes.dex */
public class BaseAdView extends ViewGroup {
    protected final hy0 WB;

    public BaseAdView(Context context, int i) {
        super(context);
        this.WB = new hy0(this, i);
    }

    public void DW(c cVar) {
        this.WB.rN(cVar.j6());
    }

    public void FH() {
        this.WB.EQ();
    }

    public void Hw() {
        this.WB.we();
    }

    public a getAdListener() {
        return this.WB.DW();
    }

    public d getAdSize() {
        return this.WB.FH();
    }

    public String getAdUnitId() {
        return this.WB.v5();
    }

    public String getMediationAdapterClassName() {
        return this.WB.VH();
    }

    public void j6() {
        this.WB.j6();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
    protected void onMeasure(int i, int i2) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(a aVar) {
        this.WB.J0(aVar);
        if (aVar == 0) {
            this.WB.lg(null);
            this.WB.QX(null);
            return;
        }
        if (aVar instanceof hv0) {
            this.WB.lg((hv0) aVar);
        }
        if (aVar instanceof com.google.android.gms.ads.doubleclick.a) {
            this.WB.QX((com.google.android.gms.ads.doubleclick.a) aVar);
        }
    }

    public void setAdSize(d dVar) {
        this.WB.J8(dVar);
    }

    public void setAdUnitId(String str) {
        this.WB.Ws(str);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.WB = new hy0(this, attributeSet, false, i);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.WB = new hy0(this, attributeSet, false, i2);
    }
}
