package com.google.android.gms.internal.ads;

import android.view.View;
import android.widget.FrameLayout;
import androidx.collection.SimpleArrayMap;
import java.util.Arrays;
import java.util.List;

@jg
/* loaded from: classes.dex */
public final class z0 extends c3 implements j1 {
    private h1 AL;
    private final p0 WB;
    private final SimpleArrayMap<String, String> fY;
    private final SimpleArrayMap<String, u0> jw;
    private View k2;
    private final String mb;
    private yx0 qp;
    private final Object zh = new Object();

    public z0(String str, SimpleArrayMap<String, u0> simpleArrayMap, SimpleArrayMap<String, String> simpleArrayMap2, p0 p0Var, yx0 yx0Var, View view) {
        this.mb = str;
        this.jw = simpleArrayMap;
        this.fY = simpleArrayMap2;
        this.WB = p0Var;
        this.qp = yx0Var;
        this.k2 = view;
    }

    static /* synthetic */ h1 CO(z0 z0Var, h1 h1Var) {
        z0Var.AL = null;
        return null;
    }

    @Override // com.google.android.gms.internal.ads.b3
    public final abcd.wu IP() {
        return abcd.xu.sy(this.AL.getContext().getApplicationContext());
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final p0 KX() {
        return this.WB;
    }

    @Override // com.google.android.gms.internal.ads.b3
    public final String NH(String str) {
        return this.fY.get(str);
    }

    @Override // com.google.android.gms.internal.ads.b3
    public final f2 NY(String str) {
        return this.jw.get(str);
    }

    @Override // com.google.android.gms.internal.ads.b3
    public final abcd.wu QX() {
        return abcd.xu.sy(this.AL);
    }

    @Override // com.google.android.gms.internal.ads.b3
    public final void VH() {
        synchronized (this.zh) {
            if (this.AL == null) {
                xp.j6("#002 Attempt to record impression before native ad initialized.");
            } else {
                this.AL.PT(null, null);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final String Vm() {
        return "3";
    }

    @Override // com.google.android.gms.internal.ads.b3
    public final void destroy() {
        bn.gn.post(new b1(this));
        this.qp = null;
        this.k2 = null;
    }

    @Override // com.google.android.gms.internal.ads.b3
    public final yx0 getVideoController() {
        return this.qp;
    }

    @Override // com.google.android.gms.internal.ads.b3
    public final void hr(String str) {
        synchronized (this.zh) {
            if (this.AL == null) {
                xp.j6("#001 Attempt to perform click before app native ad initialized.");
            } else {
                this.AL.AR(null, str, null, null, null, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.b3
    public final boolean mT(abcd.wu wuVar) {
        if (this.AL == null) {
            xp.j6("Attempt to call renderVideoInMediaView before ad initialized.");
            return false;
        }
        if (this.k2 == null) {
            return false;
        }
        a1 a1Var = new a1(this);
        this.AL.GK((FrameLayout) abcd.xu.g3(wuVar), a1Var);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.b3
    public final List<String> n3() {
        String[] strArr = new String[this.jw.size() + this.fY.size()];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.jw.size()) {
            strArr[i3] = this.jw.keyAt(i2);
            i2++;
            i3++;
        }
        while (i < this.fY.size()) {
            strArr[i3] = this.fY.keyAt(i);
            i++;
            i3++;
        }
        return Arrays.asList(strArr);
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final void s5(h1 h1Var) {
        synchronized (this.zh) {
            this.AL = h1Var;
        }
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final View tX() {
        return this.k2;
    }

    @Override // com.google.android.gms.internal.ads.b3
    public final String vy() {
        return this.mb;
    }
}
