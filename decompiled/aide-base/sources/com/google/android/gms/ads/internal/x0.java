package com.google.android.gms.ads.internal;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.bp;
import com.google.android.gms.internal.ads.cv;
import com.google.android.gms.internal.ads.cw0;
import com.google.android.gms.internal.ads.cx0;
import com.google.android.gms.internal.ads.e5;
import com.google.android.gms.internal.ads.fw0;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.ix0;
import com.google.android.gms.internal.ads.j3;
import com.google.android.gms.internal.ads.jg;
import com.google.android.gms.internal.ads.jw0;
import com.google.android.gms.internal.ads.lm;
import com.google.android.gms.internal.ads.m3;
import com.google.android.gms.internal.ads.mp;
import com.google.android.gms.internal.ads.na;
import com.google.android.gms.internal.ads.oj;
import com.google.android.gms.internal.ads.om;
import com.google.android.gms.internal.ads.p3;
import com.google.android.gms.internal.ads.rb0;
import com.google.android.gms.internal.ads.s3;
import com.google.android.gms.internal.ads.v3;
import com.google.android.gms.internal.ads.vb0;
import com.google.android.gms.internal.ads.wj;
import com.google.android.gms.internal.ads.wn;
import com.google.android.gms.internal.ads.xp;
import com.google.android.gms.internal.ads.yl;
import com.google.android.gms.internal.ads.zl;
import com.google.android.gms.internal.ads.zw0;
import com.google.android.gms.internal.ads.zzacp;
import com.google.android.gms.internal.ads.zzafz;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzwf;
import com.google.android.gms.internal.ads.zzyv;
import com.google.android.gms.internal.ads.zzzw;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class x0 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    boolean AE;
    public wn AL;
    private int An;
    public int BR;
    private boolean Bx;
    zzafz Cz;
    zzzw Gj;
    List<String> IS;
    ix0 Jl;
    private boolean Jm;
    View Nh;
    private int Pa;
    cx0 Q6;
    wj QO;
    final String WB;
    fw0 Z1;
    private HashSet<am> Za;
    public String a5;
    List<Integer> aX;
    public zl cT;
    private bp ce;
    v3 e3;
    com.google.android.gms.internal.ads.j0 e9;
    j3 eU;
    zzacp fN;
    final vb0 fY;
    public lm gG;
    public yl hK;
    g3 iW;
    public final Context jw;
    y0 k2;
    zw0 kf;
    public String mb;
    jw0 n5;
    private boolean oa;
    s3 oy;
    zzyv pN;
    SimpleArrayMap<String, p3> pO;
    public am q7;
    public final zzbbi qp;
    e5 sE;
    oj sM;
    SimpleArrayMap<String, m3> sg;
    public zzwf w9;
    public String ys;
    public om zh;

    public x0(Context context, zzwf zzwfVar, String str, zzbbi zzbbiVar) {
        this(context, zzwfVar, str, zzbbiVar, null);
    }

    private final void u7(boolean z) {
        yl ylVar;
        cv cvVar;
        View viewFindViewById;
        if (this.k2 == null || (ylVar = this.hK) == null || (cvVar = ylVar.DW) == null || cvVar.AF() == null) {
            return;
        }
        if (!z || this.ce.j6()) {
            if (this.hK.DW.AF().XL()) {
                int[] iArr = new int[2];
                this.k2.getLocationOnScreen(iArr);
                cw0.j6();
                int iJ0 = mp.J0(this.jw, iArr[0]);
                cw0.j6();
                int iJ02 = mp.J0(this.jw, iArr[1]);
                if (iJ0 != this.An || iJ02 != this.Pa) {
                    this.An = iJ0;
                    this.Pa = iJ02;
                    this.hK.DW.AF().EQ(this.An, this.Pa, !z);
                }
            }
            y0 y0Var = this.k2;
            if (y0Var == null || (viewFindViewById = y0Var.getRootView().findViewById(R.id.content)) == null) {
                return;
            }
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            this.k2.getGlobalVisibleRect(rect);
            viewFindViewById.getGlobalVisibleRect(rect2);
            if (rect.top != rect2.top) {
                this.Jm = false;
            }
            if (rect.bottom != rect2.bottom) {
                this.Bx = false;
            }
        }
    }

    final void DW(View view) {
        rb0 rb0VarZo;
        if (((Boolean) cw0.v5().FH(com.google.android.gms.internal.ads.p.AE)).booleanValue() && (rb0VarZo = this.fY.Zo()) != null) {
            rb0VarZo.FH(view);
        }
    }

    public final HashSet<am> FH() {
        return this.Za;
    }

    public final void Hw() {
        cv cvVar;
        yl ylVar = this.hK;
        if (ylVar == null || (cvVar = ylVar.DW) == null) {
            return;
        }
        cvVar.destroy();
    }

    public final boolean VH() {
        return this.BR == 1;
    }

    public final boolean Zo() {
        return this.BR == 0;
    }

    public final String gn() {
        return (this.Jm && this.Bx) ? "" : this.Jm ? this.oa ? "top-scrollable" : "top-locked" : this.Bx ? this.oa ? "bottom-scrollable" : "bottom-locked" : "";
    }

    public final void j6(HashSet<am> hashSet) {
        this.Za = hashSet;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        u7(false);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        u7(true);
        this.oa = true;
    }

    public final void tp(boolean z) {
        yl ylVar;
        cv cvVar;
        if (this.BR == 0 && (ylVar = this.hK) != null && (cvVar = ylVar.DW) != null) {
            cvVar.stopLoading();
        }
        om omVar = this.zh;
        if (omVar != null) {
            omVar.cancel();
        }
        wn wnVar = this.AL;
        if (wnVar != null) {
            wnVar.cancel();
        }
        if (z) {
            this.hK = null;
        }
    }

    public final void v5() {
        na naVar;
        yl ylVar = this.hK;
        if (ylVar == null || (naVar = ylVar.XL) == null) {
            return;
        }
        try {
            naVar.destroy();
        } catch (RemoteException unused) {
            xp.u7("Could not destroy mediation adapter.");
        }
    }

    private x0(Context context, zzwf zzwfVar, String str, zzbbi zzbbiVar, vb0 vb0Var) {
        this.gG = null;
        this.Nh = null;
        this.BR = 0;
        this.AE = false;
        this.Za = null;
        this.An = -1;
        this.Pa = -1;
        this.Jm = true;
        this.Bx = true;
        this.oa = false;
        com.google.android.gms.internal.ads.p.j6(context);
        if (w0.u7().J0() != null) {
            List<String> listHw = com.google.android.gms.internal.ads.p.Hw();
            int i = zzbbiVar.mb;
            if (i != 0) {
                listHw.add(Integer.toString(i));
            }
            w0.u7().J0().Zo(listHw);
        }
        this.WB = UUID.randomUUID().toString();
        if (zzwfVar.fY || zzwfVar.AL) {
            this.k2 = null;
        } else {
            y0 y0Var = new y0(context, str, zzbbiVar.WB, this, this);
            this.k2 = y0Var;
            y0Var.setMinimumWidth(zzwfVar.k2);
            this.k2.setMinimumHeight(zzwfVar.jw);
            this.k2.setVisibility(4);
        }
        this.w9 = zzwfVar;
        this.mb = str;
        this.jw = context;
        this.qp = zzbbiVar;
        this.fY = new vb0(new h(this));
        this.ce = new bp(200L);
        this.pO = new SimpleArrayMap<>();
    }
}
