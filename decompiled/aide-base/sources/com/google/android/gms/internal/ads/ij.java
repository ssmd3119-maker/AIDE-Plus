package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import org.json.JSONException;
import org.json.JSONObject;

@jg
/* loaded from: classes.dex */
public final class ij extends com.google.android.gms.ads.internal.z0 implements kk {
    private static ij iW;
    private final ej Jl;
    private boolean Q6;
    private final nl kf;

    public ij(Context context, com.google.android.gms.ads.internal.s1 s1Var, zzwf zzwfVar, ka kaVar, zzbbi zzbbiVar) {
        super(context, zzwfVar, null, kaVar, zzbbiVar, s1Var);
        iW = this;
        this.kf = new nl(context, null);
        this.Jl = new ej(this.k2, this.Z1, this, this, this);
    }

    public static ij CZ() {
        return iW;
    }

    private static zl Iy(zl zlVar) throws JSONException {
        sm.we("Creating mediation ad response for non-mediated rewarded ad.");
        try {
            JSONObject jSONObjectZo = qi.Zo(zlVar.DW);
            jSONObjectZo.remove("impression_urls");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, zlVar.j6.qp);
            return new zl(zlVar.j6, zlVar.DW, new u9(Arrays.asList(new t9(jSONObjectZo.toString(), null, Arrays.asList("com.google.ads.mediation.admob.AdMobAdapter"), null, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), jSONObject.toString(), null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, null, null, null, Collections.emptyList(), null, -1L)), ((Long) cw0.v5().FH(p.ys)).longValue(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), false, "", -1L, 0, 1, null, 0, -1, -1L, false), zlVar.Hw, zlVar.v5, zlVar.Zo, zlVar.VH, zlVar.gn, zlVar.u7, null);
        } catch (JSONException e) {
            xp.Hw("Unable to generate ad state for non-mediated rewarded video.", e);
            return new zl(zlVar.j6, zlVar.DW, null, zlVar.Hw, 0, zlVar.Zo, zlVar.VH, zlVar.gn, zlVar.u7, null);
        }
    }

    public final void BF(Context context) {
        this.Jl.DW(context);
    }

    @Override // com.google.android.gms.internal.ads.kk
    public final void Dr() {
        EQ();
    }

    public final void G5() {
        com.google.android.gms.common.internal.p.Hw("showAd must be called on the main UI thread.");
        if (kJ()) {
            this.Jl.Zo(this.Q6);
        } else {
            xp.u7("The reward video has not loaded.");
        }
    }

    @Override // com.google.android.gms.internal.ads.kk
    public final void MP(zzawd zzawdVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        zzawd zzawdVarVH = this.Jl.VH(zzawdVar);
        if (com.google.android.gms.ads.internal.w0.ei().U2(this.k2.jw) && zzawdVarVH != null) {
            com.google.android.gms.ads.internal.w0.ei().FH(this.k2.jw, com.google.android.gms.ads.internal.w0.ei().er(this.k2.jw), this.k2.mb, zzawdVarVH.WB, zzawdVarVH.mb);
        }
        CO(zzawdVarVH);
    }

    @Override // com.google.android.gms.ads.internal.a
    public final void MU(zl zlVar, d0 d0Var) {
        if (zlVar.v5 != -2) {
            bn.gn.post(new kj(this, zlVar));
            return;
        }
        com.google.android.gms.ads.internal.x0 x0Var = this.k2;
        x0Var.cT = zlVar;
        if (zlVar.FH == null) {
            x0Var.cT = Iy(zlVar);
        }
        this.Jl.EQ();
    }

    @Override // com.google.android.gms.ads.internal.z0, com.google.android.gms.ads.internal.a, com.google.android.gms.internal.ads.uw0
    public final void Mr() {
        this.Jl.FH();
    }

    @Override // com.google.android.gms.internal.ads.kk
    public final void Mz() {
        if (com.google.android.gms.ads.internal.w0.ei().U2(this.k2.jw)) {
            this.kf.DW(false);
        }
        is();
    }

    @Override // com.google.android.gms.internal.ads.kk
    public final void P8() {
        this.Jl.we();
        yP();
    }

    @Override // com.google.android.gms.ads.internal.z0
    protected final boolean S3(zzwb zzwbVar, yl ylVar, boolean z) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.kk
    public final void SI() {
        Dn();
    }

    @Override // com.google.android.gms.ads.internal.z0, com.google.android.gms.ads.internal.a, com.google.android.gms.internal.ads.uw0
    public final void XL() {
        this.Jl.Hw();
    }

    public final void YM(zzavh zzavhVar) {
        com.google.android.gms.common.internal.p.Hw("loadAd must be called on the main UI thread.");
        if (TextUtils.isEmpty(zzavhVar.mb)) {
            xp.u7("Invalid ad unit id. Aborting.");
            bn.gn.post(new jj(this));
            return;
        }
        com.google.android.gms.ads.internal.x0 x0Var = this.k2;
        String str = zzavhVar.mb;
        x0Var.mb = str;
        this.kf.j6(str);
        super.p8(zzavhVar.WB);
    }

    @Override // com.google.android.gms.internal.ads.kk
    public final void ca() {
        if (com.google.android.gms.ads.internal.w0.ei().U2(this.k2.jw)) {
            this.kf.DW(true);
        }
        BH(this.k2.hK, false);
        ag();
    }

    @Override // com.google.android.gms.ads.internal.a, com.google.android.gms.internal.ads.uw0
    public final void destroy() {
        this.Jl.j6();
        super.destroy();
    }

    @Override // com.google.android.gms.internal.ads.kk
    public final void ei() {
        this.Jl.J0();
        na();
    }

    @Override // com.google.android.gms.ads.internal.a
    protected final void is() {
        this.k2.hK = null;
        super.is();
    }

    public final boolean kJ() {
        com.google.android.gms.common.internal.p.Hw("isLoaded must be called on the main UI thread.");
        com.google.android.gms.ads.internal.x0 x0Var = this.k2;
        return x0Var.zh == null && x0Var.AL == null && x0Var.hK != null;
    }

    @Override // com.google.android.gms.ads.internal.a, com.google.android.gms.internal.ads.uw0
    public final void sG(boolean z) {
        com.google.android.gms.common.internal.p.Hw("setImmersiveMode must be called on the main UI thread.");
        this.Q6 = z;
    }

    public final rk se(String str) {
        return this.Jl.gn(str);
    }

    @Override // com.google.android.gms.ads.internal.z0, com.google.android.gms.ads.internal.a
    public final boolean tc(yl ylVar, yl ylVar2) {
        bd(ylVar2, false);
        return ej.v5(ylVar, ylVar2);
    }
}
