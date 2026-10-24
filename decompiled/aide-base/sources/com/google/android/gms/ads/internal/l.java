package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.e5;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.ix0;
import com.google.android.gms.internal.ads.j3;
import com.google.android.gms.internal.ads.jg;
import com.google.android.gms.internal.ads.jw0;
import com.google.android.gms.internal.ads.ka;
import com.google.android.gms.internal.ads.m3;
import com.google.android.gms.internal.ads.mw0;
import com.google.android.gms.internal.ads.p3;
import com.google.android.gms.internal.ads.qw0;
import com.google.android.gms.internal.ads.s3;
import com.google.android.gms.internal.ads.v3;
import com.google.android.gms.internal.ads.zzacp;
import com.google.android.gms.internal.ads.zzafz;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzwf;

@jg
/* loaded from: classes.dex */
public final class l extends qw0 {
    private zzwf AL;
    private final zzbbi Jl;
    private final ka Q6;
    private jw0 WB;
    private ix0 Z1;
    private zzafz cT;
    private j3 fY;
    private zzacp hK;
    private final s1 iW;
    private v3 jw;
    private final String kf;
    private g3 mb;
    private final Context n5;
    private e5 q7;
    private PublisherAdViewOptions w9;
    private s3 zh;
    private SimpleArrayMap<String, p3> k2 = new SimpleArrayMap<>();
    private SimpleArrayMap<String, m3> qp = new SimpleArrayMap<>();

    public l(Context context, String str, ka kaVar, zzbbi zzbbiVar, s1 s1Var) {
        this.n5 = context;
        this.kf = str;
        this.Q6 = kaVar;
        this.Jl = zzbbiVar;
        this.iW = s1Var;
    }

    @Override // com.google.android.gms.internal.ads.pw0
    public final void D5(zzacp zzacpVar) {
        this.hK = zzacpVar;
    }

    @Override // com.google.android.gms.internal.ads.pw0
    public final void HU(s3 s3Var, zzwf zzwfVar) {
        this.zh = s3Var;
        this.AL = zzwfVar;
    }

    @Override // com.google.android.gms.internal.ads.pw0
    public final void LA(PublisherAdViewOptions publisherAdViewOptions) {
        this.w9 = publisherAdViewOptions;
    }

    @Override // com.google.android.gms.internal.ads.pw0
    public final void eJ(jw0 jw0Var) {
        this.WB = jw0Var;
    }

    @Override // com.google.android.gms.internal.ads.pw0
    public final void fP(v3 v3Var) {
        this.jw = v3Var;
    }

    @Override // com.google.android.gms.internal.ads.pw0
    public final void ob(ix0 ix0Var) {
        this.Z1 = ix0Var;
    }

    @Override // com.google.android.gms.internal.ads.pw0
    public final void sT(e5 e5Var) {
        this.q7 = e5Var;
    }

    @Override // com.google.android.gms.internal.ads.pw0
    public final mw0 tj() {
        return new i(this.n5, this.kf, this.Q6, this.Jl, this.WB, this.mb, this.jw, this.q7, this.fY, this.k2, this.qp, this.hK, this.cT, this.Z1, this.iW, this.zh, this.AL, this.w9);
    }

    @Override // com.google.android.gms.internal.ads.pw0
    public final void uM(j3 j3Var) {
        this.fY = j3Var;
    }

    @Override // com.google.android.gms.internal.ads.pw0
    public final void wC(String str, p3 p3Var, m3 m3Var) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Custom template ID for native custom template ad is empty. Please provide a valid template id.");
        }
        this.k2.put(str, p3Var);
        this.qp.put(str, m3Var);
    }

    @Override // com.google.android.gms.internal.ads.pw0
    public final void yr(g3 g3Var) {
        this.mb = g3Var;
    }

    @Override // com.google.android.gms.internal.ads.pw0
    public final void yz(zzafz zzafzVar) {
        this.cT = zzafzVar;
    }
}
