package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class w1 extends p2 implements View.OnClickListener, View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, z1 {
    static final String[] cT = {"2011", "1009", "3010"};

    @GuardedBy("mLock")
    private h1 k2;
    private final WeakReference<View> mb;
    private View zh;
    private final Object WB = new Object();
    private final Map<String, WeakReference<View>> jw = new HashMap();
    private final Map<String, WeakReference<View>> fY = new HashMap();
    private final Map<String, WeakReference<View>> qp = new HashMap();
    private Point AL = new Point();
    private Point w9 = new Point();
    private WeakReference<fr0> hK = new WeakReference<>(null);

    public w1(View view, HashMap<String, View> map, HashMap<String, View> map2) {
        com.google.android.gms.ads.internal.w0.P8();
        nr.j6(view, this);
        com.google.android.gms.ads.internal.w0.P8();
        nr.DW(view, this);
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        this.mb = new WeakReference<>(view);
        for (Map.Entry<String, View> entry : map.entrySet()) {
            String key = entry.getKey();
            View value = entry.getValue();
            if (value != null) {
                this.jw.put(key, new WeakReference<>(value));
                if (!"1098".equals(key) && !"3011".equals(key)) {
                    value.setOnTouchListener(this);
                    value.setClickable(true);
                    value.setOnClickListener(this);
                }
            }
        }
        this.qp.putAll(this.jw);
        for (Map.Entry<String, View> entry2 : map2.entrySet()) {
            View value2 = entry2.getValue();
            if (value2 != null) {
                this.fY.put(entry2.getKey(), new WeakReference<>(value2));
                value2.setOnTouchListener(this);
            }
        }
        this.qp.putAll(this.fY);
        p.j6(view.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean UE(String[] strArr) {
        for (String str : strArr) {
            if (this.jw.get(str) != null) {
                return true;
            }
        }
        for (String str2 : strArr) {
            if (this.fY.get(str2) != null) {
                return false;
            }
        }
        return false;
    }

    private final void d7(View view) {
        synchronized (this.WB) {
            if (this.k2 != null) {
                h1 h1VarGW = this.k2 instanceof g1 ? ((g1) this.k2).gW() : this.k2;
                if (h1VarGW != null) {
                    h1VarGW.sT(view);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k6(l1 l1Var) {
        View view;
        synchronized (this.WB) {
            String[] strArr = cT;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    view = null;
                    break;
                }
                WeakReference<View> weakReference = this.qp.get(strArr[i]);
                if (weakReference != null) {
                    view = weakReference.get();
                    break;
                }
                i++;
            }
            if (!(view instanceof FrameLayout)) {
                l1Var.E4();
                return;
            }
            y1 y1Var = new y1(this, view);
            if (l1Var instanceof g1) {
                l1Var.VH(view, y1Var);
            } else {
                l1Var.GK(view, y1Var);
            }
        }
    }

    private final int tc(int i) {
        int iJ0;
        synchronized (this.WB) {
            cw0.j6();
            iJ0 = mp.J0(this.k2.getContext(), i);
        }
        return iJ0;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final View AR() {
        return this.mb.get();
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final void Za(abcd.wu wuVar) {
        synchronized (this.WB) {
            this.k2.Of((View) abcd.xu.g3(wuVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final void aX(abcd.wu wuVar) {
        int i;
        KeyEvent.Callback callback;
        synchronized (this.WB) {
            d7(null);
            Object objG3 = abcd.xu.g3(wuVar);
            if (!(objG3 instanceof l1)) {
                xp.u7("Not an instance of native engine. This is most likely a transient error");
                return;
            }
            l1 l1Var = (l1) objG3;
            if (!l1Var.b1()) {
                xp.j6("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
                return;
            }
            View view = this.mb.get();
            if (this.k2 != null && view != null) {
                this.k2.qP(view, this.qp);
            }
            synchronized (this.WB) {
                i = 0;
                if (this.k2 instanceof l1) {
                    l1 l1Var2 = (l1) this.k2;
                    View view2 = this.mb.get();
                    if (l1Var2 != null && l1Var2.getContext() != null && view2 != null && com.google.android.gms.ads.internal.w0.ei().U2(view2.getContext())) {
                        nl nlVarMr = l1Var2.Mr();
                        if (nlVarMr != null) {
                            nlVarMr.DW(false);
                        }
                        fr0 fr0Var = this.hK.get();
                        if (fr0Var != null && nlVarMr != null) {
                            fr0Var.Zo(nlVarMr);
                        }
                    }
                }
            }
            if ((this.k2 instanceof g1) && ((g1) this.k2).yS()) {
                ((g1) this.k2).a8(l1Var);
            } else {
                this.k2 = l1Var;
                if (l1Var instanceof g1) {
                    ((g1) l1Var).a8(null);
                }
            }
            String[] strArr = {"1098", "3011"};
            while (true) {
                if (i >= 2) {
                    callback = null;
                    break;
                }
                WeakReference<View> weakReference = this.qp.get(strArr[i]);
                if (weakReference != null) {
                    callback = (View) weakReference.get();
                    break;
                }
                i++;
            }
            if (callback == null) {
                xp.u7("Ad choices asset view is not provided.");
            } else {
                ViewGroup viewGroup = callback instanceof ViewGroup ? (ViewGroup) callback : null;
                if (viewGroup != null) {
                    View viewLz = l1Var.Lz(this, true);
                    this.zh = viewLz;
                    if (viewLz != null) {
                        this.qp.put("1007", new WeakReference<>(this.zh));
                        this.jw.put("1007", new WeakReference<>(this.zh));
                        viewGroup.removeAllViews();
                        viewGroup.addView(this.zh);
                    }
                }
            }
            l1Var.DW(view, this.jw, this.fY, this, this);
            bn.gn.post(new x1(this, l1Var));
            d7(view);
            this.k2.dW(view);
            synchronized (this.WB) {
                if (this.k2 instanceof l1) {
                    l1 l1Var3 = (l1) this.k2;
                    View view3 = this.mb.get();
                    if (l1Var3 != null && l1Var3.getContext() != null && view3 != null && com.google.android.gms.ads.internal.w0.ei().U2(view3.getContext())) {
                        fr0 fr0Var2 = this.hK.get();
                        if (fr0Var2 == null) {
                            fr0Var2 = new fr0(view3.getContext(), view3);
                            this.hK = new WeakReference<>(fr0Var2);
                        }
                        fr0Var2.Hw(l1Var3.Mr());
                    }
                }
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        synchronized (this.WB) {
            if (this.k2 == null) {
                return;
            }
            View view2 = this.mb.get();
            if (view2 == null) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("x", tc(this.AL.x));
            bundle.putFloat("y", tc(this.AL.y));
            bundle.putFloat("start_x", tc(this.w9.x));
            bundle.putFloat("start_y", tc(this.w9.y));
            if (this.zh == null || !this.zh.equals(view)) {
                this.k2.oa(view, this.qp, bundle, view2);
            } else if (!(this.k2 instanceof g1)) {
                this.k2.AR(view, "1007", bundle, this.qp, view2, false);
            } else if (((g1) this.k2).gW() != null) {
                ((g1) this.k2).gW().AR(view, "1007", bundle, this.qp, view2, false);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view;
        synchronized (this.WB) {
            if (this.k2 != null && (view = this.mb.get()) != null) {
                this.k2.xg(view, this.qp);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        View view;
        synchronized (this.WB) {
            if (this.k2 != null && (view = this.mb.get()) != null) {
                this.k2.xg(view, this.qp);
            }
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        synchronized (this.WB) {
            if (this.k2 == null) {
                return false;
            }
            View view2 = this.mb.get();
            if (view2 == null) {
                return false;
            }
            view2.getLocationOnScreen(new int[2]);
            Point point = new Point((int) (motionEvent.getRawX() - r2[0]), (int) (motionEvent.getRawY() - r2[1]));
            this.AL = point;
            if (motionEvent.getAction() == 0) {
                this.w9 = point;
            }
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setLocation(point.x, point.y);
            this.k2.Fd(motionEventObtain);
            motionEventObtain.recycle();
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final void sJ() {
        synchronized (this.WB) {
            this.zh = null;
            this.k2 = null;
            this.AL = null;
            this.w9 = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final synchronized Map<String, WeakReference<View>> uD() {
        return this.qp;
    }
}
