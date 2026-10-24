package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import java.util.Map;
import org.json.JSONException;

@jg
/* loaded from: classes.dex */
public final class wc extends gd {
    private final Object EQ;
    private String FH;
    private boolean Hw;
    private final Activity J0;
    private pw J8;
    private ViewGroup Mr;
    private LinearLayout QX;
    private int VH;
    private ImageView Ws;
    private hd XL;
    private int Zo;
    private PopupWindow aM;
    private int gn;
    private RelativeLayout j3;
    private int tp;
    private int u7;
    private int v5;
    private final cv we;

    static {
        com.google.android.gms.common.util.f.VH("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
    }

    public wc(cv cvVar, hd hdVar) {
        super(cvVar, "resize");
        this.FH = "top-right";
        this.Hw = true;
        this.v5 = 0;
        this.Zo = 0;
        this.VH = -1;
        this.gn = 0;
        this.u7 = 0;
        this.tp = -1;
        this.EQ = new Object();
        this.we = cvVar;
        this.J0 = cvVar.dx();
        this.XL = hdVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0122 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int[] EQ() {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wc.EQ():int[]");
    }

    private final void gn(int i, int i2) throws JSONException {
        DW(i, i2 - com.google.android.gms.ads.internal.w0.v5().et(this.J0)[0], this.tp, this.VH);
    }

    public final void J0(boolean z) {
        synchronized (this.EQ) {
            if (this.aM != null) {
                this.aM.dismiss();
                this.j3.removeView(this.we.getView());
                if (this.Mr != null) {
                    this.Mr.removeView(this.Ws);
                    this.Mr.addView(this.we.getView());
                    this.we.ba(this.J8);
                }
                if (z) {
                    Zo("default");
                    if (this.XL != null) {
                        this.XL.hG();
                    }
                }
                this.aM = null;
                this.j3 = null;
                this.Mr = null;
                this.QX = null;
            }
        }
    }

    public final void VH(int i, int i2, boolean z) {
        synchronized (this.EQ) {
            this.v5 = i;
            this.Zo = i2;
            if (this.aM != null && z) {
                int[] iArrEQ = EQ();
                if (iArrEQ != null) {
                    PopupWindow popupWindow = this.aM;
                    cw0.j6();
                    int iJ6 = mp.j6(this.J0, iArrEQ[0]);
                    cw0.j6();
                    popupWindow.update(iJ6, mp.j6(this.J0, iArrEQ[1]), this.aM.getWidth(), this.aM.getHeight());
                    gn(iArrEQ[0], iArrEQ[1]);
                } else {
                    J0(true);
                }
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void tp(Map<String, String> map) {
        synchronized (this.EQ) {
            if (this.J0 == null) {
                Hw("Not an activity context. Cannot resize.");
                return;
            }
            if (this.we.aq() == null) {
                Hw("Webview is not yet available, size is not set.");
                return;
            }
            if (this.we.aq().v5()) {
                Hw("Is interstitial. Cannot resize an interstitial.");
                return;
            }
            if (this.we.BR()) {
                Hw("Cannot resize an expanded banner.");
                return;
            }
            if (!TextUtils.isEmpty(map.get("width"))) {
                com.google.android.gms.ads.internal.w0.v5();
                this.tp = bn.sy(map.get("width"));
            }
            if (!TextUtils.isEmpty(map.get("height"))) {
                com.google.android.gms.ads.internal.w0.v5();
                this.VH = bn.sy(map.get("height"));
            }
            if (!TextUtils.isEmpty(map.get("offsetX"))) {
                com.google.android.gms.ads.internal.w0.v5();
                this.gn = bn.sy(map.get("offsetX"));
            }
            if (!TextUtils.isEmpty(map.get("offsetY"))) {
                com.google.android.gms.ads.internal.w0.v5();
                this.u7 = bn.sy(map.get("offsetY"));
            }
            if (!TextUtils.isEmpty(map.get("allowOffscreen"))) {
                this.Hw = Boolean.parseBoolean(map.get("allowOffscreen"));
            }
            String str = map.get("customClosePosition");
            if (!TextUtils.isEmpty(str)) {
                this.FH = str;
            }
            if (!(this.tp >= 0 && this.VH >= 0)) {
                Hw("Invalid width and height options. Cannot resize.");
                return;
            }
            Window window = this.J0.getWindow();
            if (window != null && window.getDecorView() != null) {
                int[] iArrEQ = EQ();
                if (iArrEQ == null) {
                    Hw("Resize location out of screen or close button is not visible.");
                    return;
                }
                cw0.j6();
                int iJ6 = mp.j6(this.J0, this.tp);
                cw0.j6();
                int iJ62 = mp.j6(this.J0, this.VH);
                ViewParent parent = this.we.getView().getParent();
                if (parent == null || !(parent instanceof ViewGroup)) {
                    Hw("Webview is detached, probably in the middle of a resize or expand.");
                    return;
                }
                ((ViewGroup) parent).removeView(this.we.getView());
                if (this.aM == null) {
                    this.Mr = (ViewGroup) parent;
                    com.google.android.gms.ads.internal.w0.v5();
                    Bitmap bitmapAq = bn.aq(this.we.getView());
                    ImageView imageView = new ImageView(this.J0);
                    this.Ws = imageView;
                    imageView.setImageBitmap(bitmapAq);
                    this.J8 = this.we.aq();
                    this.Mr.addView(this.Ws);
                } else {
                    this.aM.dismiss();
                }
                RelativeLayout relativeLayout = new RelativeLayout(this.J0);
                this.j3 = relativeLayout;
                relativeLayout.setBackgroundColor(0);
                this.j3.setLayoutParams(new ViewGroup.LayoutParams(iJ6, iJ62));
                com.google.android.gms.ads.internal.w0.v5();
                PopupWindow popupWindowHw = bn.Hw(this.j3, iJ6, iJ62, false);
                this.aM = popupWindowHw;
                popupWindowHw.setOutsideTouchable(true);
                this.aM.setTouchable(true);
                this.aM.setClippingEnabled(!this.Hw);
                char c = 65535;
                this.j3.addView(this.we.getView(), -1, -1);
                this.QX = new LinearLayout(this.J0);
                cw0.j6();
                int iJ63 = mp.j6(this.J0, 50);
                cw0.j6();
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iJ63, mp.j6(this.J0, 50));
                String str2 = this.FH;
                switch (str2.hashCode()) {
                    case -1364013995:
                        if (str2.equals("center")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1012429441:
                        if (str2.equals("top-left")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -655373719:
                        if (str2.equals("bottom-left")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1163912186:
                        if (str2.equals("bottom-right")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 1288627767:
                        if (str2.equals("bottom-center")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 1755462605:
                        if (str2.equals("top-center")) {
                            c = 1;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    layoutParams.addRule(10);
                    layoutParams.addRule(9);
                } else if (c == 1) {
                    layoutParams.addRule(10);
                    layoutParams.addRule(14);
                } else if (c == 2) {
                    layoutParams.addRule(13);
                } else if (c == 3) {
                    layoutParams.addRule(12);
                    layoutParams.addRule(9);
                } else if (c == 4) {
                    layoutParams.addRule(12);
                    layoutParams.addRule(14);
                } else if (c != 5) {
                    layoutParams.addRule(10);
                    layoutParams.addRule(11);
                } else {
                    layoutParams.addRule(12);
                    layoutParams.addRule(11);
                }
                this.QX.setOnClickListener(new xc(this));
                this.QX.setContentDescription("Close button");
                this.j3.addView(this.QX, layoutParams);
                try {
                    PopupWindow popupWindow = this.aM;
                    View decorView = window.getDecorView();
                    cw0.j6();
                    int iJ64 = mp.j6(this.J0, iArrEQ[0]);
                    cw0.j6();
                    popupWindow.showAtLocation(decorView, 0, iJ64, mp.j6(this.J0, iArrEQ[1]));
                    int i = iArrEQ[0];
                    int i2 = iArrEQ[1];
                    if (this.XL != null) {
                        this.XL.c0(i, i2, this.tp, this.VH);
                    }
                    this.we.ba(pw.tp(iJ6, iJ62));
                    gn(iArrEQ[0], iArrEQ[1]);
                    Zo("resized");
                    return;
                } catch (RuntimeException e) {
                    String strValueOf = String.valueOf(e.getMessage());
                    Hw(strValueOf.length() != 0 ? "Cannot show popup window: ".concat(strValueOf) : new String("Cannot show popup window: "));
                    this.j3.removeView(this.we.getView());
                    if (this.Mr != null) {
                        this.Mr.removeView(this.Ws);
                        this.Mr.addView(this.we.getView());
                        this.we.ba(this.J8);
                    }
                    return;
                }
            }
            Hw("Activity context is not ready, cannot get window or decor view.");
        }
    }

    public final void u7(int i, int i2) {
        this.v5 = i;
        this.Zo = i2;
    }

    public final boolean we() {
        boolean z;
        synchronized (this.EQ) {
            z = this.aM != null;
        }
        return z;
    }
}
