package com.google.android.gms.internal.ads;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.PowerManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.gms.measurement.AppMeasurement;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class iq0 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    private final KeyguardManager AL;
    private boolean Q6;
    private boolean cT;
    protected final gq0 fY;
    private pq0 hK;
    private bp iW;
    private final tr0 jw;
    private final WindowManager k2;
    private BroadcastReceiver kf;
    private WeakReference<ViewTreeObserver> mb;
    private boolean n5;
    private final Context qp;
    private final lq0 sE;
    private float sg;
    private final DisplayMetrics w9;
    private final PowerManager zh;
    private final Object WB = new Object();
    private boolean q7 = false;
    private boolean Z1 = false;
    private final HashSet<fq0> Jl = new HashSet<>();
    private final HashSet<er0> eU = new HashSet<>();
    private final Rect e3 = new Rect();

    public iq0(Context context, zzwf zzwfVar, yl ylVar, zzbbi zzbbiVar, tr0 tr0Var) {
        new WeakReference(ylVar);
        this.jw = tr0Var;
        this.mb = new WeakReference<>(null);
        this.n5 = true;
        this.Q6 = false;
        this.iW = new bp(200L);
        this.fY = new gq0(UUID.randomUUID().toString(), zzbbiVar, zzwfVar.WB, ylVar.EQ, ylVar.j6(), zzwfVar.AL);
        this.k2 = (WindowManager) context.getSystemService("window");
        this.zh = (PowerManager) context.getApplicationContext().getSystemService("power");
        this.AL = (KeyguardManager) context.getSystemService("keyguard");
        this.qp = context;
        this.sE = new lq0(this, new Handler());
        this.qp.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.sE);
        this.w9 = context.getResources().getDisplayMetrics();
        Display defaultDisplay = this.k2.getDefaultDisplay();
        this.e3.right = defaultDisplay.getWidth();
        this.e3.bottom = defaultDisplay.getHeight();
        XL();
    }

    private final void EQ(JSONObject jSONObject, boolean z) {
        try {
            JSONObject jSONObjectVH = VH(jSONObject);
            ArrayList arrayList = new ArrayList(this.eU);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((er0) obj).DW(jSONObjectVH, z);
            }
        } catch (Throwable th) {
            xp.Hw("Skipping active view message.", th);
        }
    }

    private final void U2() {
        ViewTreeObserver viewTreeObserver = this.mb.get();
        if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this);
        viewTreeObserver.removeGlobalOnLayoutListener(this);
    }

    private static JSONObject VH(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }

    private final JSONObject Zo(View view, Boolean bool) throws JSONException {
        if (view == null) {
            return a8().put("isAttachedToWindow", false).put("isScreenOn", j6()).put("isVisible", false);
        }
        boolean zDW = com.google.android.gms.ads.internal.w0.VH().DW(view);
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        try {
            view.getLocationOnScreen(iArr);
            view.getLocationInWindow(iArr2);
        } catch (Exception e) {
            xp.Hw("Failure getting view location.", e);
        }
        Rect rect = new Rect();
        int i = iArr[0];
        rect.left = i;
        rect.top = iArr[1];
        rect.right = i + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        Rect rect2 = new Rect();
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect2, null);
        Rect rect3 = new Rect();
        boolean localVisibleRect = view.getLocalVisibleRect(rect3);
        Rect rect4 = new Rect();
        view.getHitRect(rect4);
        JSONObject jSONObjectA8 = a8();
        jSONObjectA8.put("windowVisibility", view.getWindowVisibility()).put("isAttachedToWindow", zDW).put("viewBox", new JSONObject().put("top", v5(this.e3.top, this.w9)).put("bottom", v5(this.e3.bottom, this.w9)).put("left", v5(this.e3.left, this.w9)).put("right", v5(this.e3.right, this.w9))).put("adBox", new JSONObject().put("top", v5(rect.top, this.w9)).put("bottom", v5(rect.bottom, this.w9)).put("left", v5(rect.left, this.w9)).put("right", v5(rect.right, this.w9))).put("globalVisibleBox", new JSONObject().put("top", v5(rect2.top, this.w9)).put("bottom", v5(rect2.bottom, this.w9)).put("left", v5(rect2.left, this.w9)).put("right", v5(rect2.right, this.w9))).put("globalVisibleBoxVisible", globalVisibleRect).put("localVisibleBox", new JSONObject().put("top", v5(rect3.top, this.w9)).put("bottom", v5(rect3.bottom, this.w9)).put("left", v5(rect3.left, this.w9)).put("right", v5(rect3.right, this.w9))).put("localVisibleBoxVisible", localVisibleRect).put("hitBox", new JSONObject().put("top", v5(rect4.top, this.w9)).put("bottom", v5(rect4.bottom, this.w9)).put("left", v5(rect4.left, this.w9)).put("right", v5(rect4.right, this.w9))).put("screenDensity", this.w9.density);
        jSONObjectA8.put("isVisible", (bool == null ? Boolean.valueOf(com.google.android.gms.ads.internal.w0.v5().lg(view, this.zh, this.AL)) : bool).booleanValue());
        return jSONObjectA8;
    }

    private final JSONObject a8() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("afmaVersion", this.fY.DW()).put("activeViewJSON", this.fY.FH()).put(AppMeasurement.Param.TIMESTAMP, com.google.android.gms.ads.internal.w0.we().DW()).put("adFormat", this.fY.j6()).put("hashCode", this.fY.Hw()).put("isMraid", this.fY.v5()).put("isStopped", this.Z1).put("isPaused", this.q7).put("isNative", this.fY.Zo()).put("isScreenOn", j6()).put("appMuted", com.google.android.gms.ads.internal.w0.tp().Zo()).put("appVolume", com.google.android.gms.ads.internal.w0.tp().v5()).put("deviceVolume", this.sg);
        return jSONObject;
    }

    private final void j3() {
        pq0 pq0Var = this.hK;
        if (pq0Var != null) {
            pq0Var.j6(this);
        }
    }

    private final boolean j6() {
        return Build.VERSION.SDK_INT >= 20 ? this.zh.isInteractive() : this.zh.isScreenOn();
    }

    private static int v5(int i, DisplayMetrics displayMetrics) {
        return (int) (i / displayMetrics.density);
    }

    public final void DW() {
        synchronized (this.WB) {
            this.q7 = true;
            J0(3);
        }
    }

    public final void FH() {
        synchronized (this.WB) {
            this.q7 = false;
            J0(3);
        }
    }

    public final void Hw() {
        synchronized (this.WB) {
            this.Z1 = true;
            J0(3);
        }
    }

    protected final void J0(int i) {
        boolean z;
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        synchronized (this.WB) {
            Iterator<er0> it = this.eU.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                } else if (it.next().j6()) {
                    z = true;
                    break;
                }
            }
            if (z && this.n5) {
                View viewFH = this.jw.FH();
                boolean z2 = viewFH != null && com.google.android.gms.ads.internal.w0.v5().lg(viewFH, this.zh, this.AL);
                boolean z3 = viewFH != null && z2 && viewFH.getGlobalVisibleRect(new Rect(), null);
                if (this.jw.DW()) {
                    aM();
                    return;
                }
                if (i == 1 && !this.iW.j6() && z3 == this.Q6) {
                    return;
                }
                if (z3 || this.Q6 || i != 1) {
                    try {
                        EQ(Zo(viewFH, Boolean.valueOf(z2)), false);
                        this.Q6 = z3;
                    } catch (RuntimeException | JSONException e) {
                        xp.FH("Active view update failed.", e);
                    }
                    View viewFH2 = this.jw.j6().FH();
                    if (viewFH2 != null && (viewTreeObserver2 = viewFH2.getViewTreeObserver()) != (viewTreeObserver = this.mb.get())) {
                        U2();
                        if (!this.cT || (viewTreeObserver != null && viewTreeObserver.isAlive())) {
                            this.cT = true;
                            viewTreeObserver2.addOnScrollChangedListener(this);
                            viewTreeObserver2.addOnGlobalLayoutListener(this);
                        }
                        this.mb = new WeakReference<>(viewTreeObserver2);
                    }
                    j3();
                }
            }
        }
    }

    final boolean J8(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        String str = map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(this.fY.Hw());
    }

    public final boolean Mr() {
        boolean z;
        synchronized (this.WB) {
            z = this.n5;
        }
        return z;
    }

    final void QX(Map<String, String> map) {
        if (map.containsKey("isVisible")) {
            boolean z = "1".equals(map.get("isVisible")) || "true".equals(map.get("isVisible"));
            Iterator<fq0> it = this.Jl.iterator();
            while (it.hasNext()) {
                it.next().j6(this, z);
            }
        }
    }

    final void Ws(Map<String, String> map) {
        J0(3);
    }

    public final void XL() {
        this.sg = vn.Hw(this.qp);
    }

    public final void aM() {
        synchronized (this.WB) {
            if (this.n5) {
                try {
                    JSONObject jSONObjectA8 = a8();
                    jSONObjectA8.put("doneReasonCode", "u");
                    EQ(jSONObjectA8, true);
                } catch (RuntimeException e) {
                    xp.Hw("Failure while processing active view data.", e);
                } catch (JSONException e2) {
                    xp.Hw("JSON failure while processing active view data.", e2);
                }
                String strValueOf = String.valueOf(this.fY.Hw());
                xp.VH(strValueOf.length() != 0 ? "Untracking ad unit: ".concat(strValueOf) : new String("Untracking ad unit: "));
            }
        }
    }

    public final void gn(pq0 pq0Var) {
        synchronized (this.WB) {
            this.hK = pq0Var;
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        J0(2);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        J0(1);
    }

    final void tp(er0 er0Var, Map<String, String> map) {
        String strValueOf = String.valueOf(this.fY.Hw());
        xp.VH(strValueOf.length() != 0 ? "Received request to untrack: ".concat(strValueOf) : new String("Received request to untrack: "));
        we(er0Var);
    }

    public final void u7(er0 er0Var) {
        if (this.eU.isEmpty()) {
            synchronized (this.WB) {
                if (this.kf == null) {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.SCREEN_ON");
                    intentFilter.addAction("android.intent.action.SCREEN_OFF");
                    this.kf = new jq0(this);
                    com.google.android.gms.ads.internal.w0.BT().FH(this.qp, this.kf, intentFilter);
                }
            }
            J0(3);
        }
        this.eU.add(er0Var);
        try {
            er0Var.DW(VH(Zo(this.jw.FH(), null)), false);
        } catch (JSONException e) {
            xp.Hw("Skipping measurement update for new client.", e);
        }
    }

    public final void we(er0 er0Var) {
        this.eU.remove(er0Var);
        er0Var.FH();
        if (this.eU.isEmpty()) {
            synchronized (this.WB) {
                U2();
                synchronized (this.WB) {
                    if (this.kf != null) {
                        try {
                            com.google.android.gms.ads.internal.w0.BT().DW(this.qp, this.kf);
                        } catch (IllegalStateException e) {
                            xp.Hw("Failed trying to unregister the receiver", e);
                        } catch (Exception e2) {
                            com.google.android.gms.ads.internal.w0.u7().v5(e2, "ActiveViewUnit.stopScreenStatusMonitoring");
                        }
                        this.kf = null;
                    }
                }
                this.qp.getContentResolver().unregisterContentObserver(this.sE);
                int i = 0;
                this.n5 = false;
                j3();
                ArrayList arrayList = new ArrayList(this.eU);
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    we((er0) obj);
                }
            }
        }
    }
}
