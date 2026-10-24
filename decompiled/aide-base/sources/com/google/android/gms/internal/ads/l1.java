package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.measurement.AppMeasurement;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class l1 implements h1 {
    private final i1 DW;
    boolean EQ;
    private final Context FH;
    private final q0 Hw;
    private nl J0;
    private z1 J8;
    private final j1 VH;
    private final nf Zo;
    private final vb0 gn;
    boolean tp;
    private final zzbbi u7;
    private final JSONObject v5;
    private String we;
    private final Object j6 = new Object();
    private boolean Ws = false;
    private long QX = 0;
    private long XL = 0;
    private WeakReference<View> aM = null;

    public l1(Context context, i1 i1Var, nf nfVar, vb0 vb0Var, JSONObject jSONObject, j1 j1Var, zzbbi zzbbiVar, String str) {
        this.FH = context;
        this.DW = i1Var;
        this.Zo = nfVar;
        this.gn = vb0Var;
        this.v5 = jSONObject;
        this.VH = j1Var;
        this.u7 = zzbbiVar;
        this.we = str;
        this.Hw = new q0(nfVar);
    }

    private final void FH(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z) throws JSONException {
        com.google.android.gms.common.internal.p.Hw("Invalid call from a non-UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.v5);
            if (jSONObject2 != null) {
                jSONObject7.put("asset_view_signal", jSONObject2);
            }
            if (jSONObject != null) {
                jSONObject7.put("ad_view_signal", jSONObject);
            }
            if (jSONObject5 != null) {
                jSONObject7.put("click_signal", jSONObject5);
            }
            if (jSONObject3 != null) {
                jSONObject7.put("scroll_view_signal", jSONObject3);
            }
            if (jSONObject4 != null) {
                jSONObject7.put("lock_screen_signal", jSONObject4);
            }
            JSONObject jSONObject8 = new JSONObject();
            long jJ6 = com.google.android.gms.ads.internal.w0.we().j6();
            jSONObject8.put("time_from_last_touch_down", jJ6 - this.XL);
            jSONObject8.put("time_from_last_touch", jJ6 - this.QX);
            jSONObject7.put("touch_signal", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put("asset_id", str);
            jSONObject9.put("template", this.VH.Vm());
            com.google.android.gms.ads.internal.w0.VH();
            jSONObject9.put("is_privileged_process", jn.J0());
            if (((Boolean) cw0.v5().FH(p.dW)).booleanValue() && this.Hw.Hw() != null && this.v5.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject9.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject9.put(AppMeasurement.Param.TIMESTAMP, jJ6);
            jSONObject9.put("has_custom_click_handler", this.DW.Aq(this.VH.vy()) != null);
            if (this.Ws && ct()) {
                jSONObject9.put("custom_click_gesture_eligible", true);
            }
            if (z) {
                jSONObject9.put("is_custom_click_gesture", true);
            }
            jSONObject7.put("has_custom_click_handler", this.DW.Aq(this.VH.vy()) != null);
            try {
                JSONObject jSONObjectOptJSONObject = this.v5.optJSONObject("tracking_urls_and_actions");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                jSONObject9.put("click_signals", this.gn.Zo().j6(this.FH, jSONObjectOptJSONObject.optString("click_string"), view));
            } catch (Exception e) {
                xp.Hw("Exception obtaining click signals", e);
            }
            jSONObject7.put("click", jSONObject9);
            if (jSONObject6 != null) {
                jSONObject7.put("provided_signals", jSONObject6);
            }
            jSONObject7.put("ads_id", this.we);
            hq.j6(this.Zo.DW(jSONObject7), "NativeAdEngineImpl.performClick");
        } catch (JSONException e2) {
            xp.Hw("Unable to create click JSON.", e2);
        }
    }

    private static int[] J0(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    private final JSONObject J8(View view) throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (view == null) {
            return jSONObject2;
        }
        try {
            int[] iArrJ0 = J0(view);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("width", u7(view.getMeasuredWidth()));
            jSONObject3.put("height", u7(view.getMeasuredHeight()));
            jSONObject3.put("x", u7(iArrJ0[0]));
            jSONObject3.put("y", u7(iArrJ0[1]));
            jSONObject3.put("relative_to", "window");
            jSONObject2.put("frame", jSONObject3);
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect)) {
                jSONObject = Zo(rect);
            } else {
                jSONObject = new JSONObject();
                jSONObject.put("width", 0);
                jSONObject.put("height", 0);
                jSONObject.put("x", u7(iArrJ0[0]));
                jSONObject.put("y", u7(iArrJ0[1]));
                jSONObject.put("relative_to", "window");
            }
            jSONObject2.put("visible_bounds", jSONObject);
        } catch (Exception unused) {
            xp.u7("Unable to get native ad view bounding box");
        }
        return jSONObject2;
    }

    private static JSONObject QX(View view) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            com.google.android.gms.ads.internal.w0.v5();
            jSONObject.put("contained_in_scroll_view", bn.Ev(view) != -1);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private final JSONObject XL(View view) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            com.google.android.gms.ads.internal.w0.v5();
            jSONObject.put("can_show_on_lock_screen", bn.ko(view));
            com.google.android.gms.ads.internal.w0.v5();
            jSONObject.put("is_keyguard_locked", bn.cb(this.FH));
        } catch (JSONException unused) {
            xp.u7("Unable to get lock screen information");
        }
        return jSONObject;
    }

    private final JSONObject Zo(Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", u7(rect.right - rect.left));
        jSONObject.put("height", u7(rect.bottom - rect.top));
        jSONObject.put("x", u7(rect.left));
        jSONObject.put("y", u7(rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    private final boolean gn(String str) {
        JSONObject jSONObject = this.v5;
        JSONObject jSONObjectOptJSONObject = jSONObject == null ? null : jSONObject.optJSONObject("allow_pub_event_reporting");
        if (jSONObjectOptJSONObject == null) {
            return false;
        }
        return jSONObjectOptJSONObject.optBoolean(str, false);
    }

    private final JSONObject j6(Map<String, WeakReference<View>> map, View view) {
        JSONObject jSONObjectZo;
        JSONObject jSONObject = new JSONObject();
        if (map == null || view == null) {
            return jSONObject;
        }
        int[] iArrJ0 = J0(view);
        synchronized (map) {
            for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                View view2 = entry.getValue().get();
                if (view2 != null) {
                    int[] iArrJ02 = J0(view2);
                    JSONObject jSONObject2 = new JSONObject();
                    JSONObject jSONObject3 = new JSONObject();
                    try {
                        jSONObject3.put("width", u7(view2.getMeasuredWidth()));
                        jSONObject3.put("height", u7(view2.getMeasuredHeight()));
                        jSONObject3.put("x", u7(iArrJ02[0] - iArrJ0[0]));
                        jSONObject3.put("y", u7(iArrJ02[1] - iArrJ0[1]));
                        jSONObject3.put("relative_to", "ad_view");
                        jSONObject2.put("frame", jSONObject3);
                        Rect rect = new Rect();
                        if (view2.getLocalVisibleRect(rect)) {
                            jSONObjectZo = Zo(rect);
                        } else {
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("width", 0);
                            jSONObject4.put("height", 0);
                            jSONObject4.put("x", u7(iArrJ02[0] - iArrJ0[0]));
                            jSONObject4.put("y", u7(iArrJ02[1] - iArrJ0[1]));
                            jSONObject4.put("relative_to", "ad_view");
                            jSONObjectZo = jSONObject4;
                        }
                        jSONObject2.put("visible_bounds", jSONObjectZo);
                        if (view2 instanceof TextView) {
                            TextView textView = (TextView) view2;
                            jSONObject2.put("text_color", textView.getCurrentTextColor());
                            jSONObject2.put("font_size", textView.getTextSize());
                            jSONObject2.put("text", textView.getText());
                        }
                        jSONObject.put(entry.getKey(), jSONObject2);
                    } catch (JSONException unused) {
                        xp.u7("Unable to get asset views information");
                    }
                }
            }
        }
        return jSONObject;
    }

    private final int u7(int i) {
        cw0.j6();
        return mp.J0(this.FH, i);
    }

    private final boolean v5(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) throws JSONException {
        com.google.android.gms.common.internal.p.Hw("Invalid call from a non-UI thread.");
        if (this.tp) {
            return true;
        }
        this.tp = true;
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.v5);
            jSONObject6.put("ads_id", this.we);
            if (jSONObject2 != null) {
                jSONObject6.put("asset_view_signal", jSONObject2);
            }
            if (jSONObject != null) {
                jSONObject6.put("ad_view_signal", jSONObject);
            }
            if (jSONObject3 != null) {
                jSONObject6.put("scroll_view_signal", jSONObject3);
            }
            if (jSONObject4 != null) {
                jSONObject6.put("lock_screen_signal", jSONObject4);
            }
            if (jSONObject5 != null) {
                jSONObject6.put("provided_signals", jSONObject5);
            }
            hq.j6(this.Zo.Zo(jSONObject6), "NativeAdEngineImpl.recordImpression");
            this.DW.h4(this);
            this.DW.JL();
            ys();
            return true;
        } catch (JSONException e) {
            xp.Hw("Unable to create impression JSON.", e);
            return false;
        }
    }

    private static boolean we(View view) {
        return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
    }

    @Override // com.google.android.gms.internal.ads.h1
    public final void AR(View view, String str, Bundle bundle, Map<String, WeakReference<View>> map, View view2, boolean z) throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObjectJ6 = j6(map, view2);
        JSONObject jSONObjectJ8 = J8(view2);
        JSONObject jSONObjectQX = QX(view2);
        JSONObject jSONObjectXL = XL(view2);
        JSONObject jSONObject3 = null;
        try {
            JSONObject jSONObjectTp = com.google.android.gms.ads.internal.w0.v5().tp(bundle, null);
            jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("click_point", jSONObjectTp);
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
        }
        try {
            jSONObject2.put("asset_id", str);
            jSONObject = jSONObject2;
        } catch (Exception e3) {
            e = e3;
            jSONObject3 = jSONObject2;
            xp.Hw("Error occurred while grabbing click signals.", e);
            jSONObject = jSONObject3;
            FH(view, jSONObjectJ8, jSONObjectJ6, jSONObjectQX, jSONObjectXL, str, jSONObject, null, z);
        }
        FH(view, jSONObjectJ8, jSONObjectJ6, jSONObjectQX, jSONObjectXL, str, jSONObject, null, z);
    }

    @Override // com.google.android.gms.internal.ads.h1
    public void Bx() {
        this.DW.Bx();
    }

    public void DW(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        if (map != null) {
            synchronized (map) {
                Iterator<Map.Entry<String, WeakReference<View>>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    View view2 = it.next().getValue().get();
                    if (view2 != null) {
                        view2.setOnTouchListener(onTouchListener);
                        view2.setClickable(true);
                        view2.setOnClickListener(onClickListener);
                    }
                }
            }
        }
        if (map2 != null) {
            synchronized (map2) {
                Iterator<Map.Entry<String, WeakReference<View>>> it2 = map2.entrySet().iterator();
                while (it2.hasNext()) {
                    View view3 = it2.next().getValue().get();
                    if (view3 != null) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.h1
    public void E4() {
        this.DW.py();
    }

    public final void EQ(View view) {
        this.DW.pM(view);
    }

    @Override // com.google.android.gms.internal.ads.h1
    public void Fd(MotionEvent motionEvent) {
        this.QX = com.google.android.gms.ads.internal.w0.we().j6();
        if (motionEvent.getAction() == 0) {
            this.XL = com.google.android.gms.ads.internal.w0.we().j6();
        }
        this.gn.Hw(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.h1
    public final void GK(View view, f1 f1Var) {
        if (VH(view, f1Var)) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ((FrameLayout) view).removeAllViews();
        j1 j1Var = this.VH;
        if (j1Var instanceof k1) {
            k1 k1Var = (k1) j1Var;
            if (k1Var.DW() == null || k1Var.DW().size() <= 0) {
                return;
            }
            Object obj = k1Var.DW().get(0);
            f2 f2VarMt = obj instanceof IBinder ? g2.Mt((IBinder) obj) : null;
            if (f2VarMt != null) {
                try {
                    abcd.wu wuVarK0 = f2VarMt.K0();
                    if (wuVarK0 != null) {
                        Drawable drawable = (Drawable) abcd.xu.g3(wuVarK0);
                        ImageView imageView = new ImageView(this.FH);
                        imageView.setImageDrawable(drawable);
                        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        ((FrameLayout) view).addView(imageView, layoutParams);
                    }
                } catch (RemoteException unused) {
                    xp.u7("Could not get drawable from image");
                }
            }
        }
    }

    public final void Hw(z1 z1Var) {
        this.J8 = z1Var;
    }

    @Override // com.google.android.gms.internal.ads.h1
    public View Lz(View.OnClickListener onClickListener, boolean z) {
        p0 p0VarKX = this.VH.KX();
        if (p0VarKX == null) {
            return null;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (!z) {
            int iD7 = p0VarKX.d7();
            if (iD7 == 0) {
                layoutParams.addRule(10);
                layoutParams.addRule(9);
            } else if (iD7 == 2) {
                layoutParams.addRule(12);
                layoutParams.addRule(11);
            } else if (iD7 != 3) {
                layoutParams.addRule(10);
                layoutParams.addRule(11);
            } else {
                layoutParams.addRule(12);
                layoutParams.addRule(9);
            }
        }
        s0 s0Var = new s0(this.FH, p0VarKX, layoutParams);
        s0Var.setOnClickListener(onClickListener);
        s0Var.setContentDescription((CharSequence) cw0.v5().FH(p.E4));
        return s0Var;
    }

    @Override // com.google.android.gms.internal.ads.h1
    public void MP() throws JSONException {
        com.google.android.gms.common.internal.p.Hw("Invalid call from a non-UI thread.");
        if (this.EQ) {
            return;
        }
        this.EQ = true;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.v5);
            jSONObject.put("ads_id", this.we);
            hq.j6(this.Zo.v5(jSONObject), "NativeAdEngineImpl.recordDownloadedImpression");
        } catch (JSONException e) {
            xp.Hw("", e);
        }
    }

    public final nl Mr() {
        if (!com.google.android.gms.ads.internal.w0.ei().U2(this.FH)) {
            return null;
        }
        if (this.J0 == null) {
            this.J0 = new nl(this.FH, this.DW.Nh());
        }
        return this.J0;
    }

    @Override // com.google.android.gms.internal.ads.h1
    public void Of(View view) {
        if (((Boolean) cw0.v5().FH(p.dW)).booleanValue()) {
            if (!this.v5.optBoolean("custom_one_point_five_click_enabled", false)) {
                xp.u7("setClickConfirmingView: Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
                return;
            }
            q0 q0Var = this.Hw;
            if (view != null) {
                view.setOnClickListener(q0Var);
                view.setClickable(true);
                q0Var.k2 = new WeakReference<>(view);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.h1
    public void PH() {
        this.Zo.FH();
    }

    @Override // com.google.android.gms.internal.ads.h1
    public void PT(View view, Map<String, WeakReference<View>> map) throws JSONException {
        v5(J8(view), j6(map, view), QX(view), XL(view), null);
    }

    @Override // com.google.android.gms.internal.ads.h1
    public void Pa() throws JSONException {
        if (this.J8 == null) {
            xp.VH("Ad should be associated with an ad view before calling recordCustomClickGesture()");
            return;
        }
        if (!this.Ws) {
            xp.VH("Custom click reporting failed. enableCustomClickGesture is not set.");
        } else if (ct()) {
            AR(this.J8.AR(), "3099", null, this.J8.uD(), this.J8.AR(), true);
        } else {
            xp.VH("Custom click reporting failed. Ad unit id not whitelisted.");
        }
    }

    @Override // com.google.android.gms.internal.ads.h1
    public void Q6() {
        this.Ws = true;
    }

    @Override // com.google.android.gms.internal.ads.h1
    public final View TI() {
        WeakReference<View> weakReference = this.aM;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final boolean VH(View view, f1 f1Var) {
        FrameLayout.LayoutParams layoutParams = ((Boolean) cw0.v5().FH(p.PH)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17);
        View viewTX = this.VH.tX();
        if (viewTX == null) {
            return false;
        }
        ViewParent parent = viewTX.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(viewTX);
        }
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        frameLayout.addView(viewTX, layoutParams);
        this.DW.xg(f1Var);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.h1
    public final void Ws(Bundle bundle) throws JSONException {
        if (bundle == null) {
            xp.VH("Click data is null. No click is reported.");
        } else if (gn("click_reporting")) {
            FH(null, null, null, null, null, bundle.getBundle("click_signal").getString("asset_id"), null, com.google.android.gms.ads.internal.w0.v5().tp(bundle, null), false);
        } else {
            xp.j6("The ad slot cannot handle external click events. You must be whitelisted to be able to report your click events.");
        }
    }

    @Override // com.google.android.gms.internal.ads.h1
    public void XG() {
        if (((Boolean) cw0.v5().FH(p.dW)).booleanValue() && this.v5.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.Hw.j6();
        }
    }

    public cv aM() {
        JSONObject jSONObject = this.v5;
        if (jSONObject == null || jSONObject.optJSONObject("overlay") == null) {
            return null;
        }
        com.google.android.gms.ads.internal.w0.Zo();
        Context context = this.FH;
        zzwf zzwfVarWs = zzwf.Ws(context);
        cv cvVarDW = iv.DW(context, pw.u7(zzwfVarWs), zzwfVarWs.WB, false, false, this.gn, this.u7, null, null, null, pt0.Zo());
        if (cvVarDW != null) {
            cvVarDW.getView().setVisibility(8);
            new n1(cvVarDW).FH(this.Zo);
        }
        return cvVarDW;
    }

    @Override // com.google.android.gms.internal.ads.h1
    public boolean b1() {
        JSONObject jSONObject = this.v5;
        return jSONObject != null && jSONObject.optBoolean("allow_pub_owned_ad_view", false);
    }

    @Override // com.google.android.gms.internal.ads.h1
    public boolean ct() {
        JSONObject jSONObject = this.v5;
        return jSONObject != null && jSONObject.optBoolean("allow_custom_click_gesture", false);
    }

    @Override // com.google.android.gms.internal.ads.h1
    public final void dW(View view) {
        vb0 vb0Var;
        rb0 rb0VarZo;
        if (!((Boolean) cw0.v5().FH(p.AE)).booleanValue() || (vb0Var = this.gn) == null || (rb0VarZo = vb0Var.Zo()) == null) {
            return;
        }
        rb0VarZo.FH(view);
    }

    @Override // com.google.android.gms.internal.ads.h1
    public final Context getContext() {
        return this.FH;
    }

    @Override // com.google.android.gms.internal.ads.h1
    public boolean hp() {
        p0 p0VarKX = this.VH.KX();
        return p0VarKX != null && p0VarKX.nG();
    }

    public final z1 j3() {
        return this.J8;
    }

    @Override // com.google.android.gms.internal.ads.h1
    public final boolean lg(Bundle bundle) {
        if (gn("impression_reporting")) {
            return v5(null, null, null, null, com.google.android.gms.ads.internal.w0.v5().tp(bundle, null));
        }
        xp.j6("The ad slot cannot handle external impression events. You must be whitelisted to whitelisted to be able to report your impression events.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.h1
    public void oa(View view, Map<String, WeakReference<View>> map, Bundle bundle, View view2) throws JSONException {
        com.google.android.gms.common.internal.p.Hw("Invalid call from a non-UI thread.");
        if (map != null) {
            synchronized (map) {
                for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                    if (view.equals(entry.getValue().get())) {
                        AR(view, entry.getKey(), bundle, map, view2, false);
                        return;
                    }
                }
            }
        }
        if ("6".equals(this.VH.Vm())) {
            AR(view, "3099", bundle, map, view2, false);
        } else if ("2".equals(this.VH.Vm())) {
            AR(view, "2099", bundle, map, view2, false);
        } else if ("1".equals(this.VH.Vm())) {
            AR(view, "1099", bundle, map, view2, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.h1
    public void qP(View view, Map<String, WeakReference<View>> map) {
    }

    @Override // com.google.android.gms.internal.ads.h1
    public final void rN(Bundle bundle) {
        if (bundle == null) {
            xp.VH("Touch event data is null. No touch event is reported.");
            return;
        }
        if (!gn("touch_reporting")) {
            xp.j6("The ad slot cannot handle external touch events. You must be whitelisted to be able to report your touch events.");
            return;
        }
        this.gn.Zo().Hw((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
    }

    @Override // com.google.android.gms.internal.ads.h1
    public void sE(y3 y3Var) {
        if (((Boolean) cw0.v5().FH(p.dW)).booleanValue()) {
            if (this.v5.optBoolean("custom_one_point_five_click_enabled", false)) {
                this.Hw.FH(y3Var);
            } else {
                xp.u7("setUnconfirmedClickListener: Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.h1
    public final void sT(View view) {
        this.aM = new WeakReference<>(view);
    }

    public final void tp(Map<String, WeakReference<View>> map) {
        if (this.VH.tX() != null) {
            boolean z = true;
            if ("2".equals(this.VH.Vm())) {
                vm vmVarA8 = com.google.android.gms.ads.internal.w0.u7().a8();
                String strNh = this.DW.Nh();
                String strVm = this.VH.Vm();
                if (map == null || (!map.containsKey("2011") && !map.containsKey("3010"))) {
                    z = false;
                }
                vmVarA8.lg(strNh, strVm, z);
                return;
            }
            if ("1".equals(this.VH.Vm())) {
                vm vmVarA82 = com.google.android.gms.ads.internal.w0.u7().a8();
                String strNh2 = this.DW.Nh();
                String strVm2 = this.VH.Vm();
                if (map == null || (!map.containsKey("1009") && !map.containsKey("3010"))) {
                    z = false;
                }
                vmVarA82.lg(strNh2, strVm2, z);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.h1
    public final void xg(View view, Map<String, WeakReference<View>> map) {
        synchronized (this.j6) {
            if (this.tp) {
                return;
            }
            if (we(view)) {
                PT(view, map);
                return;
            }
            if (((Boolean) cw0.v5().FH(p.GK)).booleanValue() && map != null) {
                synchronized (map) {
                    Iterator<Map.Entry<String, WeakReference<View>>> it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        View view2 = it.next().getValue().get();
                        if (view2 != null && we(view2)) {
                            PT(view, map);
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.h1
    public void ys() {
        this.DW.ys();
    }
}
