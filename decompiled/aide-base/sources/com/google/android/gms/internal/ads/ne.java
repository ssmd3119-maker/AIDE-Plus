package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import javax.annotation.concurrent.GuardedBy;

@jg
@TargetApi(19)
/* loaded from: classes.dex */
public final class ne extends ke {
    private Object AL;

    @GuardedBy("mPopupWindowLock")
    private boolean hK;

    @GuardedBy("mPopupWindowLock")
    private PopupWindow w9;

    ne(Context context, zl zlVar, cv cvVar, je jeVar) {
        super(context, zlVar, cvVar, jeVar);
        this.AL = new Object();
        this.hK = false;
    }

    private final void Zo() {
        synchronized (this.AL) {
            this.hK = true;
            if ((this.mb instanceof Activity) && ((Activity) this.mb).isDestroyed()) {
                this.w9 = null;
            }
            if (this.w9 != null) {
                if (this.w9.isShowing()) {
                    this.w9.dismiss();
                }
                this.w9 = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ce
    protected final void FH(int i) {
        Zo();
        super.FH(i);
    }

    @Override // com.google.android.gms.internal.ads.ce, com.google.android.gms.internal.ads.wn
    public final void cancel() {
        Zo();
        super.cancel();
    }

    @Override // com.google.android.gms.internal.ads.ke
    protected final void v5() {
        Context context = this.mb;
        Window window = context instanceof Activity ? ((Activity) context).getWindow() : null;
        if (window == null || window.getDecorView() == null || ((Activity) this.mb).isDestroyed()) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(this.mb);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView(this.jw.getView(), -1, -1);
        synchronized (this.AL) {
            if (this.hK) {
                return;
            }
            PopupWindow popupWindow = new PopupWindow((View) frameLayout, 1, 1, false);
            this.w9 = popupWindow;
            popupWindow.setOutsideTouchable(true);
            this.w9.setClippingEnabled(false);
            xp.VH("Displaying the 1x1 popup off the screen.");
            try {
                this.w9.showAtLocation(window.getDecorView(), 0, -1, -1);
            } catch (Exception unused) {
                this.w9 = null;
            }
        }
    }
}
