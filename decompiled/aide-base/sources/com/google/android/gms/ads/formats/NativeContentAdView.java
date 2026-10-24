package com.google.android.gms.ads.formats;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.internal.ads.xp;

@Deprecated
/* loaded from: classes.dex */
public final class NativeContentAdView extends NativeAdView {
    public NativeContentAdView(Context context) {
        super(context);
    }

    public final View getAdvertiserView() {
        return super.DW("1004");
    }

    public final View getBodyView() {
        return super.DW("1002");
    }

    public final View getCallToActionView() {
        return super.DW("1003");
    }

    public final View getHeadlineView() {
        return super.DW("1001");
    }

    public final View getImageView() {
        return super.DW("1005");
    }

    public final View getLogoView() {
        return super.DW("1006");
    }

    public final MediaView getMediaView() {
        View viewDW = super.DW("1009");
        if (viewDW instanceof MediaView) {
            return (MediaView) viewDW;
        }
        if (viewDW == null) {
            return null;
        }
        xp.VH("View is not an instance of MediaView");
        return null;
    }

    public final void setAdvertiserView(View view) {
        super.j6("1004", view);
    }

    public final void setBodyView(View view) {
        super.j6("1002", view);
    }

    public final void setCallToActionView(View view) {
        super.j6("1003", view);
    }

    public final void setHeadlineView(View view) {
        super.j6("1001", view);
    }

    public final void setImageView(View view) {
        super.j6("1005", view);
    }

    public final void setLogoView(View view) {
        super.j6("1006", view);
    }

    public final void setMediaView(MediaView mediaView) {
        super.j6("1009", mediaView);
    }

    public NativeContentAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NativeContentAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
