package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class es extends FrameLayout implements cs {
    private boolean AL;
    private ImageView Q6;
    private final ss WB;
    private String Z1;
    private long cT;
    private final vs fY;
    private boolean hK;
    private final d0 jw;
    private zzbdi k2;
    private boolean kf;
    private final FrameLayout mb;
    private Bitmap n5;
    private long q7;
    private final long qp;
    private boolean w9;
    private boolean zh;

    public es(Context context, ss ssVar, int i, boolean z, d0 d0Var, rs rsVar) {
        super(context);
        this.WB = ssVar;
        this.jw = d0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.mb = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        com.google.android.gms.common.internal.p.u7(ssVar.fY());
        zzbdi zzbdiVarJ6 = ssVar.fY().DW.j6(context, ssVar, i, z, d0Var, rsVar);
        this.k2 = zzbdiVarJ6;
        if (zzbdiVarJ6 != null) {
            this.mb.addView(zzbdiVarJ6, new FrameLayout.LayoutParams(-1, -1, 17));
            if (((Boolean) cw0.v5().FH(p.lg)).booleanValue()) {
                Mr();
            }
        }
        this.Q6 = new ImageView(context);
        this.qp = ((Long) cw0.v5().FH(p.gW)).longValue();
        boolean zBooleanValue = ((Boolean) cw0.v5().FH(p.er)).booleanValue();
        this.hK = zBooleanValue;
        d0 d0Var2 = this.jw;
        if (d0Var2 != null) {
            d0Var2.Zo("spinner_used", zBooleanValue ? "1" : "0");
        }
        this.fY = new vs(this);
        zzbdi zzbdiVar = this.k2;
        if (zzbdiVar != null) {
            zzbdiVar.EQ(this);
        }
        if (this.k2 == null) {
            v5("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    public static void QX(ss ssVar, String str) {
        HashMap map = new HashMap();
        map.put("event", "decoderProps");
        map.put("error", str);
        ssVar.v5("onVideoEvent", map);
    }

    public static void XL(ss ssVar, Map<String, List<Map<String, Object>>> map) {
        HashMap map2 = new HashMap();
        map2.put("event", "decoderProps");
        map2.put("mimeTypes", map);
        ssVar.v5("onVideoEvent", map2);
    }

    private final boolean a8() {
        return this.Q6.getParent() != null;
    }

    public static void er(ss ssVar) {
        HashMap map = new HashMap();
        map.put("event", "no_video_view");
        ssVar.v5("onVideoEvent", map);
    }

    private final void lg() {
        if (this.WB.dx() == null || !this.AL || this.w9) {
            return;
        }
        this.WB.dx().getWindow().clearFlags(128);
        this.AL = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void yS(String str, String... strArr) {
        HashMap map = new HashMap();
        map.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                map.put(str2, str3);
                str2 = null;
            }
        }
        this.WB.v5("onVideoEvent", map);
    }

    public final void BT(int i, int i2, int i3, int i4) {
        if (i3 == 0 || i4 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        layoutParams.setMargins(i, i2, 0, 0);
        this.mb.setLayoutParams(layoutParams);
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.cs
    public final void DW() {
        yS("pause", new String[0]);
        lg();
        this.zh = false;
    }

    public final void EQ() {
        zzbdi zzbdiVar = this.k2;
        if (zzbdiVar == null) {
            return;
        }
        zzbdiVar.Hw();
    }

    @Override // com.google.android.gms.internal.ads.cs
    public final void FH() {
        this.fY.DW();
        bn.gn.post(new hs(this));
    }

    @Override // com.google.android.gms.internal.ads.cs
    public final void Hw() {
        if (this.WB.dx() != null && !this.AL) {
            boolean z = (this.WB.dx().getWindow().getAttributes().flags & 128) != 0;
            this.w9 = z;
            if (!z) {
                this.WB.dx().getWindow().addFlags(128);
                this.AL = true;
            }
        }
        this.zh = true;
    }

    public final void J0(int i) {
        zzbdi zzbdiVar = this.k2;
        if (zzbdiVar == null) {
            return;
        }
        zzbdiVar.gn(i);
    }

    public final void J8(float f, float f2) {
        zzbdi zzbdiVar = this.k2;
        if (zzbdiVar != null) {
            zzbdiVar.tp(f, f2);
        }
    }

    public final void KD() {
        if (this.k2 == null) {
            return;
        }
        if (TextUtils.isEmpty(this.Z1)) {
            yS("no_src", new String[0]);
        } else {
            this.k2.setVideoPath(this.Z1);
        }
    }

    @TargetApi(14)
    public final void Mr() {
        zzbdi zzbdiVar = this.k2;
        if (zzbdiVar == null) {
            return;
        }
        TextView textView = new TextView(zzbdiVar.getContext());
        String strValueOf = String.valueOf(this.k2.we());
        textView.setText(strValueOf.length() != 0 ? "AdMob - ".concat(strValueOf) : new String("AdMob - "));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        this.mb.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.mb.bringChildToFront(textView);
    }

    public final void P8(int i) {
        this.k2.Ws(i);
    }

    @TargetApi(14)
    public final void SI(MotionEvent motionEvent) {
        zzbdi zzbdiVar = this.k2;
        if (zzbdiVar == null) {
            return;
        }
        zzbdiVar.dispatchTouchEvent(motionEvent);
    }

    final void U2() {
        zzbdi zzbdiVar = this.k2;
        if (zzbdiVar == null) {
            return;
        }
        long currentPosition = zzbdiVar.getCurrentPosition();
        if (this.cT == currentPosition || currentPosition <= 0) {
            return;
        }
        yS("timeupdate", "time", String.valueOf(currentPosition / 1000.0f));
        this.cT = currentPosition;
    }

    @Override // com.google.android.gms.internal.ads.cs
    public final void VH() {
        if (this.kf && this.n5 != null && !a8()) {
            this.Q6.setImageBitmap(this.n5);
            this.Q6.invalidate();
            this.mb.addView(this.Q6, new FrameLayout.LayoutParams(-1, -1));
            this.mb.bringChildToFront(this.Q6);
        }
        this.fY.j6();
        this.q7 = this.cT;
        bn.gn.post(new is(this));
    }

    @Override // com.google.android.gms.internal.ads.cs
    public final void Zo() {
        yS("ended", new String[0]);
        lg();
    }

    public final void aM() {
        zzbdi zzbdiVar = this.k2;
        if (zzbdiVar == null) {
            return;
        }
        zzbdiVar.mb.DW(true);
        zzbdiVar.j6();
    }

    public final void ei(int i) {
        this.k2.QX(i);
    }

    public final void finalize() throws Throwable {
        try {
            this.fY.j6();
            if (this.k2 != null) {
                zzbdi zzbdiVar = this.k2;
                Executor executor = ar.j6;
                zzbdiVar.getClass();
                executor.execute(fs.j6(zzbdiVar));
            }
        } finally {
            super.finalize();
        }
    }

    public final void gW(int i) {
        this.k2.J0(i);
    }

    @Override // com.google.android.gms.internal.ads.cs
    public final void gn() {
        if (this.zh && a8()) {
            this.mb.removeView(this.Q6);
        }
        if (this.n5 != null) {
            long jDW = com.google.android.gms.ads.internal.w0.we().DW();
            if (this.k2.getBitmap(this.n5) != null) {
                this.kf = true;
            }
            long jDW2 = com.google.android.gms.ads.internal.w0.we().DW() - jDW;
            if (sm.J0()) {
                StringBuilder sb = new StringBuilder(46);
                sb.append("Spinner frame grab took ");
                sb.append(jDW2);
                sb.append("ms");
                sm.we(sb.toString());
            }
            if (jDW2 > this.qp) {
                xp.u7("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.hK = false;
                this.n5 = null;
                d0 d0Var = this.jw;
                if (d0Var != null) {
                    d0Var.Zo("spinner_jank", Long.toString(jDW2));
                }
            }
        }
    }

    public final void j3() {
        zzbdi zzbdiVar = this.k2;
        if (zzbdiVar == null) {
            return;
        }
        zzbdiVar.mb.DW(false);
        zzbdiVar.j6();
    }

    @Override // com.google.android.gms.internal.ads.cs
    public final void j6() {
        if (this.k2 != null && this.q7 == 0) {
            yS("canplaythrough", "duration", String.valueOf(r0.getDuration() / 1000.0f), "videoWidth", String.valueOf(this.k2.getVideoWidth()), "videoHeight", String.valueOf(this.k2.getVideoHeight()));
        }
    }

    public final void nw(String str) {
        this.Z1 = str;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.fY.DW();
        } else {
            this.fY.j6();
            this.q7 = this.cT;
        }
        bn.gn.post(new Runnable(this, z) { // from class: com.google.android.gms.internal.ads.gs
            private final es WB;
            private final boolean mb;

            {
                this.WB = this;
                this.mb = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.WB.rN(this.mb);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.cs
    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.fY.DW();
            z = true;
        } else {
            this.fY.j6();
            this.q7 = this.cT;
            z = false;
        }
        bn.gn.post(new js(this, z));
    }

    final /* synthetic */ void rN(boolean z) {
        yS("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }

    public final void setVolume(float f) {
        zzbdi zzbdiVar = this.k2;
        if (zzbdiVar == null) {
            return;
        }
        zzbdiVar.mb.FH(f);
        zzbdiVar.j6();
    }

    public final void tp() {
        this.fY.j6();
        zzbdi zzbdiVar = this.k2;
        if (zzbdiVar != null) {
            zzbdiVar.u7();
        }
        lg();
    }

    @Override // com.google.android.gms.internal.ads.cs
    public final void u7(int i, int i2) {
        if (this.hK) {
            int iMax = Math.max(i / ((Integer) cw0.v5().FH(p.yS)).intValue(), 1);
            int iMax2 = Math.max(i2 / ((Integer) cw0.v5().FH(p.yS)).intValue(), 1);
            Bitmap bitmap = this.n5;
            if (bitmap != null && bitmap.getWidth() == iMax && this.n5.getHeight() == iMax2) {
                return;
            }
            this.n5 = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            this.kf = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.cs
    public final void v5(String str, String str2) {
        yS("error", "what", str, "extra", str2);
    }

    public final void vy(int i) {
        this.k2.J8(i);
    }

    public final void we() {
        zzbdi zzbdiVar = this.k2;
        if (zzbdiVar == null) {
            return;
        }
        zzbdiVar.v5();
    }
}
