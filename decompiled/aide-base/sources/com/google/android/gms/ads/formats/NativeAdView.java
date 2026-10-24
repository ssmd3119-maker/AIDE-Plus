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

@Deprecated
/* loaded from: classes.dex */
public class NativeAdView extends FrameLayout {
    private final FrameLayout WB;
    private final j2 mb;

    public NativeAdView(Context context) {
        super(context);
        this.WB = FH(context);
        this.mb = Hw();
    }

    private final FrameLayout FH(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    private final j2 Hw() {
        p.tp(this.WB, "createDelegate must be called after mOverlayFrame has been created");
        if (isInEditMode()) {
            return null;
        }
        return cw0.DW().j6(this.WB.getContext(), this, this.WB);
    }

    protected final View DW(String str) {
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

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.WB);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.WB;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public AdChoicesView getAdChoicesView() {
        View viewDW = DW("1098");
        if (viewDW instanceof AdChoicesView) {
            return (AdChoicesView) viewDW;
        }
        return null;
    }

    protected final void j6(String str, View view) {
        try {
            this.mb.St(str, xu.sy(view));
        } catch (RemoteException e) {
            xp.Hw("Unable to call setAssetView on delegate", e);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
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
    public void removeAllViews() {
        super.removeAllViews();
        super.addView(this.WB);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.WB == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(AdChoicesView adChoicesView) {
        j6("1098", adChoicesView);
    }

    public void setNativeAd(a aVar) {
        try {
            this.mb.aX((wu) aVar.j6());
        } catch (RemoteException e) {
            xp.Hw("Unable to call setNativeAd on delegate", e);
        }
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.WB = FH(context);
        this.mb = Hw();
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.WB = FH(context);
        this.mb = Hw();
    }
}
