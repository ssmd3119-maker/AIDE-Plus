package com.google.android.gms.ads.formats;

import abcd.wu;
import abcd.xu;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.internal.ads.cw0;
import com.google.android.gms.internal.ads.j2;
import com.google.android.gms.internal.ads.xp;

/* loaded from: classes.dex */
public final class UnifiedNativeAdView extends FrameLayout {
    private final FrameLayout WB;
    private final j2 mb;

    public UnifiedNativeAdView(Context context) {
        super(context);
        this.WB = FH(context);
        this.mb = Hw();
    }

    private final View DW(String str) {
        try {
            wu wuVarIk = this.mb.ik(str);
            if (wuVarIk != null) {
                return (View) xu.g3(wuVarIk);
            }
            return null;
        } catch (RemoteException e) {
            xp.Hw("Unable to call getAssetView on delegate", e);
            return null;
        }
    }

    private final FrameLayout FH(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    private final j2 Hw() {
        p.tp(this.WB, "createDelegate must be called after overlayFrame has been created");
        if (isInEditMode()) {
            return null;
        }
        return cw0.DW().j6(this.WB.getContext(), this, this.WB);
    }

    private final void j6(String str, View view) {
        try {
            this.mb.St(str, xu.sy(view));
        } catch (RemoteException e) {
            xp.Hw("Unable to call setAssetView on delegate", e);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.WB);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.WB;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public final AdChoicesView getAdChoicesView() {
        View viewDW = DW("3011");
        if (viewDW instanceof AdChoicesView) {
            return (AdChoicesView) viewDW;
        }
        return null;
    }

    public final View getAdvertiserView() {
        return DW("3005");
    }

    public final View getBodyView() {
        return DW("3004");
    }

    public final View getCallToActionView() {
        return DW("3002");
    }

    public final View getHeadlineView() {
        return DW("3001");
    }

    public final View getIconView() {
        return DW("3003");
    }

    public final View getImageView() {
        return DW("3008");
    }

    public final MediaView getMediaView() {
        View viewDW = DW("3010");
        if (viewDW instanceof MediaView) {
            return (MediaView) viewDW;
        }
        if (viewDW == null) {
            return null;
        }
        xp.VH("View is not an instance of MediaView");
        return null;
    }

    public final View getPriceView() {
        return DW("3007");
    }

    public final View getStarRatingView() {
        return DW("3009");
    }

    public final View getStoreView() {
        return DW("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        j2 j2Var = this.mb;
        if (j2Var != null) {
            try {
                j2Var.TG(xu.sy(view), i);
            } catch (RemoteException e) {
                xp.Hw("Unable to call onVisibilityChanged on delegate", e);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.WB);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.WB == view) {
            return;
        }
        super.removeView(view);
    }

    public final void setAdChoicesView(AdChoicesView adChoicesView) {
        j6("3011", adChoicesView);
    }

    public final void setAdvertiserView(View view) {
        j6("3005", view);
    }

    public final void setBodyView(View view) {
        j6("3004", view);
    }

    public final void setCallToActionView(View view) {
        j6("3002", view);
    }

    public final void setClickConfirmingView(View view) {
        try {
            this.mb.Za(xu.sy(view));
        } catch (RemoteException e) {
            xp.Hw("Unable to call setClickConfirmingView on delegate", e);
        }
    }

    public final void setHeadlineView(View view) {
        j6("3001", view);
    }

    public final void setIconView(View view) {
        j6("3003", view);
    }

    public final void setImageView(View view) {
        j6("3008", view);
    }

    public final void setMediaView(MediaView mediaView) {
        j6("3010", mediaView);
    }

    public final void setNativeAd(g gVar) {
        try {
            this.mb.aX((wu) gVar.EQ());
        } catch (RemoteException e) {
            xp.Hw("Unable to call setNativeAd on delegate", e);
        }
    }

    public final void setPriceView(View view) {
        j6("3007", view);
    }

    public final void setStarRatingView(View view) {
        j6("3009", view);
    }

    public final void setStoreView(View view) {
        j6("3006", view);
    }

    public UnifiedNativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.WB = FH(context);
        this.mb = Hw();
    }

    public UnifiedNativeAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.WB = FH(context);
        this.mb = Hw();
    }
}
