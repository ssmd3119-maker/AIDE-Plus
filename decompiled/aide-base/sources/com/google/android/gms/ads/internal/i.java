package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.RemoteException;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.bn;
import com.google.android.gms.internal.ads.cw0;
import com.google.android.gms.internal.ads.e5;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.ix0;
import com.google.android.gms.internal.ads.j3;
import com.google.android.gms.internal.ads.jg;
import com.google.android.gms.internal.ads.jw0;
import com.google.android.gms.internal.ads.ka;
import com.google.android.gms.internal.ads.m3;
import com.google.android.gms.internal.ads.nw0;
import com.google.android.gms.internal.ads.p3;
import com.google.android.gms.internal.ads.s3;
import com.google.android.gms.internal.ads.v3;
import com.google.android.gms.internal.ads.xp;
import com.google.android.gms.internal.ads.zzacp;
import com.google.android.gms.internal.ads.zzafz;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzwb;
import com.google.android.gms.internal.ads.zzwf;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class i extends nw0 {
    private final s3 AL;
    private final zzbbi Jl;
    private final ix0 Q6;
    private final Context WB;
    private final zzacp Z1;
    private final SimpleArrayMap<String, p3> cT;
    private final Object e3 = new Object();
    private final s1 eU;
    private final g3 fY;
    private final PublisherAdViewOptions hK;
    private WeakReference<z0> iW;
    private final ka jw;
    private final e5 k2;
    private final String kf;
    private final jw0 mb;
    private final zzafz n5;
    private final SimpleArrayMap<String, m3> q7;
    private final v3 qp;
    private final zzwf w9;
    private final j3 zh;

    i(Context context, String str, ka kaVar, zzbbi zzbbiVar, jw0 jw0Var, g3 g3Var, v3 v3Var, e5 e5Var, j3 j3Var, SimpleArrayMap<String, p3> simpleArrayMap, SimpleArrayMap<String, m3> simpleArrayMap2, zzacp zzacpVar, zzafz zzafzVar, ix0 ix0Var, s1 s1Var, s3 s3Var, zzwf zzwfVar, PublisherAdViewOptions publisherAdViewOptions) {
        this.WB = context;
        this.kf = str;
        this.jw = kaVar;
        this.Jl = zzbbiVar;
        this.mb = jw0Var;
        this.zh = j3Var;
        this.fY = g3Var;
        this.qp = v3Var;
        this.k2 = e5Var;
        this.cT = simpleArrayMap;
        this.q7 = simpleArrayMap2;
        this.Z1 = zzacpVar;
        this.n5 = zzafzVar;
        this.Q6 = ix0Var;
        this.eU = s1Var;
        this.AL = s3Var;
        this.w9 = zzwfVar;
        this.hK = publisherAdViewOptions;
        com.google.android.gms.internal.ads.p.j6(context);
    }

    private final boolean HS() {
        if (this.fY != null || this.zh != null || this.qp != null) {
            return true;
        }
        SimpleArrayMap<String, p3> simpleArrayMap = this.cT;
        return simpleArrayMap != null && simpleArrayMap.size() > 0;
    }

    private static void Mt(Runnable runnable) {
        bn.gn.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UE(zzwb zzwbVar, int i) {
        if (!((Boolean) cw0.v5().FH(com.google.android.gms.internal.ads.p.Yi)).booleanValue() && this.qp != null) {
            d7(0);
            return;
        }
        if (!((Boolean) cw0.v5().FH(com.google.android.gms.internal.ads.p.GT)).booleanValue() && this.k2 != null) {
            d7(0);
            return;
        }
        Context context = this.WB;
        c0 c0Var = new c0(context, this.eU, zzwf.Ws(context), this.kf, this.jw, this.Jl);
        this.iW = new WeakReference<>(c0Var);
        g3 g3Var = this.fY;
        com.google.android.gms.common.internal.p.Hw("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
        c0Var.k2.iW = g3Var;
        v3 v3Var = this.qp;
        com.google.android.gms.common.internal.p.Hw("setOnUnifiedNativeAdLoadedListener must be called on the main UI thread.");
        c0Var.k2.e3 = v3Var;
        e5 e5Var = this.k2;
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.: setInstreamAdLoadCallback");
        c0Var.k2.sE = e5Var;
        j3 j3Var = this.zh;
        com.google.android.gms.common.internal.p.Hw("setOnContentAdLoadedListener must be called on the main UI thread.");
        c0Var.k2.eU = j3Var;
        SimpleArrayMap<String, p3> simpleArrayMap = this.cT;
        com.google.android.gms.common.internal.p.Hw("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        c0Var.k2.pO = simpleArrayMap;
        c0Var.xt(this.mb);
        SimpleArrayMap<String, m3> simpleArrayMap2 = this.q7;
        com.google.android.gms.common.internal.p.Hw("setOnCustomClickListener must be called on the main UI thread.");
        c0Var.k2.sg = simpleArrayMap2;
        c0Var.qg(xr());
        zzacp zzacpVar = this.Z1;
        com.google.android.gms.common.internal.p.Hw("setNativeAdOptions must be called on the main UI thread.");
        c0Var.k2.fN = zzacpVar;
        zzafz zzafzVar = this.n5;
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.: setInstreamAdConfiguration");
        c0Var.k2.Cz = zzafzVar;
        c0Var.ek(this.Q6);
        c0Var.Iz(i);
        c0Var.p8(zzwbVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean Yb() {
        return this.k2 == null && this.AL != null;
    }

    private final void d7(int i) {
        jw0 jw0Var = this.mb;
        if (jw0Var != null) {
            try {
                jw0Var.Gj(0);
            } catch (RemoteException e) {
                xp.v5("Failed calling onAdFailedToLoad.", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void nG(zzwb zzwbVar) {
        if (!((Boolean) cw0.v5().FH(com.google.android.gms.internal.ads.p.Yi)).booleanValue() && this.qp != null) {
            d7(0);
            return;
        }
        m1 m1Var = new m1(this.WB, this.eU, this.w9, this.kf, this.jw, this.Jl);
        this.iW = new WeakReference<>(m1Var);
        s3 s3Var = this.AL;
        com.google.android.gms.common.internal.p.Hw("setOnPublisherAdViewLoadedListener must be called on the main UI thread.");
        m1Var.k2.oy = s3Var;
        PublisherAdViewOptions publisherAdViewOptions = this.hK;
        if (publisherAdViewOptions != null) {
            if (publisherAdViewOptions.EQ() != null) {
                m1Var.lR(this.hK.EQ());
            }
            m1Var.ir(this.hK.gn());
        }
        g3 g3Var = this.fY;
        com.google.android.gms.common.internal.p.Hw("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
        m1Var.k2.iW = g3Var;
        v3 v3Var = this.qp;
        com.google.android.gms.common.internal.p.Hw("setOnUnifiedNativeAdLoadedListener must be called on the main UI thread.");
        m1Var.k2.e3 = v3Var;
        j3 j3Var = this.zh;
        com.google.android.gms.common.internal.p.Hw("setOnContentAdLoadedListener must be called on the main UI thread.");
        m1Var.k2.eU = j3Var;
        SimpleArrayMap<String, p3> simpleArrayMap = this.cT;
        com.google.android.gms.common.internal.p.Hw("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        m1Var.k2.pO = simpleArrayMap;
        SimpleArrayMap<String, m3> simpleArrayMap2 = this.q7;
        com.google.android.gms.common.internal.p.Hw("setOnCustomClickListener must be called on the main UI thread.");
        m1Var.k2.sg = simpleArrayMap2;
        zzacp zzacpVar = this.Z1;
        com.google.android.gms.common.internal.p.Hw("setNativeAdOptions must be called on the main UI thread.");
        m1Var.k2.fN = zzacpVar;
        m1Var.G5(xr());
        m1Var.xt(this.mb);
        m1Var.ek(this.Q6);
        ArrayList arrayList = new ArrayList();
        if (HS()) {
            arrayList.add(1);
        }
        if (this.AL != null) {
            arrayList.add(2);
        }
        m1Var.zs(arrayList);
        if (HS()) {
            zzwbVar.jw.putBoolean("ina", true);
        }
        if (this.AL != null) {
            zzwbVar.jw.putBoolean("iba", true);
        }
        m1Var.p8(zzwbVar);
    }

    private final List<String> xr() {
        ArrayList arrayList = new ArrayList();
        if (this.zh != null) {
            arrayList.add("1");
        }
        if (this.fY != null) {
            arrayList.add("2");
        }
        if (this.qp != null) {
            arrayList.add("6");
        }
        if (this.cT.size() > 0) {
            arrayList.add("3");
        }
        if (this.k2 != null) {
            arrayList.add("2");
            arrayList.add("1");
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.mw0
    public final String Jl() {
        synchronized (this.e3) {
            if (this.iW == null) {
                return null;
            }
            z0 z0Var = this.iW.get();
            return z0Var != null ? z0Var.Jl() : null;
        }
    }

    @Override // com.google.android.gms.internal.ads.mw0
    public final boolean cT() {
        synchronized (this.e3) {
            if (this.iW == null) {
                return false;
            }
            z0 z0Var = this.iW.get();
            return z0Var != null ? z0Var.cT() : false;
        }
    }

    @Override // com.google.android.gms.internal.ads.mw0
    public final void eT(zzwb zzwbVar, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Number of ads has to be more than 0");
        }
        Mt(new k(this, zzwbVar, i));
    }

    @Override // com.google.android.gms.internal.ads.mw0
    public final void p4(zzwb zzwbVar) {
        Mt(new j(this, zzwbVar));
    }

    @Override // com.google.android.gms.internal.ads.mw0
    public final String u7() {
        synchronized (this.e3) {
            if (this.iW == null) {
                return null;
            }
            z0 z0Var = this.iW.get();
            return z0Var != null ? z0Var.u7() : null;
        }
    }
}
