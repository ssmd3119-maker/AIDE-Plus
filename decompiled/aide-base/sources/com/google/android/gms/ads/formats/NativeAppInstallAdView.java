package com.google.android.gms.ads.formats;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.internal.ads.xp;

@Deprecated
/* loaded from: classes.dex */
public final class NativeAppInstallAdView extends NativeAdView {
    public NativeAppInstallAdView(Context context) {
        super(context);
    }

    public final View getBodyView() {
        return super.DW("2004");
    }

    public final View getCallToActionView() {
        return super.DW("2002");
    }

    public final View getHeadlineView() {
        return super.DW("2001");
    }

    public final View getIconView() {
        return super.DW("2003");
    }

    public final View getImageView() {
        return super.DW("2007");
    }

    public final MediaView getMediaView() {
        View viewDW = super.DW("2011");
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
        return super.DW("2006");
    }

    public final View getStarRatingView() {
        return super.DW("2008");
    }

    public final View getStoreView() {
        return super.DW("2005");
    }

    public final void setBodyView(View view) {
        super.j6("2004", view);
    }

    public final void setCallToActionView(View view) {
        super.j6("2002", view);
    }

    public final void setHeadlineView(View view) {
        super.j6("2001", view);
    }

    public final void setIconView(View view) {
        super.j6("2003", view);
    }

    public final void setImageView(View view) {
        super.j6("2007", view);
    }

    public final void setMediaView(MediaView mediaView) {
        super.j6("2011", mediaView);
    }

    public final void setPriceView(View view) {
        super.j6("2006", view);
    }

    public final void setStarRatingView(View view) {
        super.j6("2008", view);
    }

    public final void setStoreView(View view) {
        super.j6("2005", view);
    }

    public NativeAppInstallAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NativeAppInstallAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
