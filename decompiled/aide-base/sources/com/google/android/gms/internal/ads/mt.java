package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;

@jg
/* loaded from: classes.dex */
public final class mt implements le0, kk0, qo0<xn0>, vp0 {
    private static int Z1;
    private static int q7;
    private ByteBuffer AL;
    private final Context WB;
    private int cT;
    private tt hK;
    private final cf0 jw;
    private final rs k2;
    private boolean w9;
    private ke0 zh;
    private final lt mb = new lt();
    private final cf0 fY = new ig0(ej0.j6);
    private final ln0 qp = new in0();

    public mt(Context context, rs rsVar) {
        this.WB = context;
        this.k2 = rsVar;
        this.jw = new qp0(this.WB, ej0.j6, 0L, bn.gn, this, -1);
        if (sm.J0()) {
            String strValueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 28);
            sb.append("ExoPlayerAdapter initialize ");
            sb.append(strValueOf);
            sm.we(sb.toString());
        }
        q7++;
        ke0 ke0VarJ6 = oe0.j6(new cf0[]{this.fY, this.jw}, this.qp, this.mb);
        this.zh = ke0VarJ6;
        ke0VarJ6.oy(this);
    }

    public static int BT() {
        return Z1;
    }

    private final yn0 SI(final String str) {
        if (this.w9 && this.AL.limit() > 0) {
            final byte[] bArr = new byte[this.AL.limit()];
            this.AL.get(bArr);
            return new yn0(bArr) { // from class: com.google.android.gms.internal.ads.nt
                private final byte[] j6;

                {
                    this.j6 = bArr;
                }

                @Override // com.google.android.gms.internal.ads.yn0
                public final xn0 zzgs() {
                    return new wn0(this.j6);
                }
            };
        }
        final yn0 yn0Var = new yn0(this, str) { // from class: com.google.android.gms.internal.ads.ot
            private final String DW;
            private final mt j6;

            {
                this.j6 = this;
                this.DW = str;
            }

            @Override // com.google.android.gms.internal.ads.yn0
            public final xn0 zzgs() {
                return this.j6.KD(this.DW);
            }
        };
        if (this.k2.u7) {
            yn0Var = new yn0(this, yn0Var) { // from class: com.google.android.gms.internal.ads.pt
                private final yn0 DW;
                private final mt j6;

                {
                    this.j6 = this;
                    this.DW = yn0Var;
                }

                @Override // com.google.android.gms.internal.ads.yn0
                public final xn0 zzgs() {
                    return this.j6.U2(this.DW);
                }
            };
        }
        if (this.AL.limit() <= 0) {
            return yn0Var;
        }
        final byte[] bArr2 = new byte[this.AL.limit()];
        this.AL.get(bArr2);
        return new yn0(yn0Var, bArr2) { // from class: com.google.android.gms.internal.ads.qt
            private final byte[] DW;
            private final yn0 j6;

            {
                this.j6 = yn0Var;
                this.DW = bArr2;
            }

            @Override // com.google.android.gms.internal.ads.yn0
            public final xn0 zzgs() {
                yn0 yn0Var2 = this.j6;
                byte[] bArr3 = this.DW;
                return new vt(new wn0(bArr3), bArr3.length, yn0Var2.zzgs());
            }
        };
    }

    public static int gW() {
        return q7;
    }

    @Override // com.google.android.gms.internal.ads.vp0
    public final void DW(String str, long j, long j2) {
    }

    @Override // com.google.android.gms.internal.ads.vp0
    public final void EQ(sg0 sg0Var) {
    }

    @Override // com.google.android.gms.internal.ads.le0
    public final void FH(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.qo0
    public final /* synthetic */ void Hw(xn0 xn0Var, bo0 bo0Var) {
        this.cT = 0;
    }

    @Override // com.google.android.gms.internal.ads.le0
    public final void J0(boolean z, int i) {
        tt ttVar = this.hK;
        if (ttVar != null) {
            ttVar.FH(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.le0
    public final void J8(je0 je0Var) {
        tt ttVar = this.hK;
        if (ttVar != null) {
            ttVar.Zo("onPlayerError", je0Var);
        }
    }

    final /* synthetic */ xn0 KD(String str) {
        mt mtVar = this.k2.u7 ? null : this;
        rs rsVar = this.k2;
        return new eo0(str, null, mtVar, rsVar.Hw, rsVar.Zo, true, null);
    }

    public final void Mr() {
        ke0 ke0Var = this.zh;
        if (ke0Var != null) {
            ke0Var.pN(this);
            this.zh.j6();
            this.zh = null;
            Z1--;
        }
    }

    final void P8(boolean z) {
        for (int i = 0; i < this.zh.Jl(); i++) {
            this.qp.Zo(i, !z);
        }
    }

    @Override // com.google.android.gms.internal.ads.vp0
    public final void QX(int i, int i2, int i3, float f) {
        tt ttVar = this.hK;
        if (ttVar != null) {
            ttVar.VH(i, i2);
        }
    }

    final /* synthetic */ xn0 U2(yn0 yn0Var) {
        return new jt(this.WB, yn0Var.zzgs(), this, new kt(this) { // from class: com.google.android.gms.internal.ads.st
            private final mt j6;

            {
                this.j6 = this;
            }

            @Override // com.google.android.gms.internal.ads.kt
            public final void DW(boolean z, long j) {
                this.j6.nw(z, j);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.le0
    public final void VH(gf0 gf0Var, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.vp0
    public final void Ws(Surface surface) {
    }

    @Override // com.google.android.gms.internal.ads.qo0
    public final /* synthetic */ void XL(xn0 xn0Var, int i) {
        this.cT += i;
    }

    @Override // com.google.android.gms.internal.ads.kk0
    public final void Zo(IOException iOException) {
        tt ttVar = this.hK;
        if (ttVar != null) {
            ttVar.Zo("onLoadError", iOException);
        }
    }

    public final void a8(Uri uri, String str) {
        lg(uri, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.le0
    public final void aM(bf0 bf0Var) {
    }

    final void ei(float f, boolean z) {
        ne0 ne0Var = new ne0(this.fY, 2, Float.valueOf(f));
        if (z) {
            this.zh.sg(ne0Var);
        } else {
            this.zh.Gj(ne0Var);
        }
    }

    public final void er(tt ttVar) {
        this.hK = ttVar;
    }

    public final void finalize() {
        q7--;
        if (sm.J0()) {
            String strValueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 26);
            sb.append("ExoPlayerAdapter finalize ");
            sb.append(strValueOf);
            sm.we(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.vp0
    public final void gn(sg0 sg0Var) {
    }

    public final long j3() {
        return this.cT;
    }

    @Override // com.google.android.gms.internal.ads.le0
    public final void j6() {
    }

    public final void lg(Uri uri, String str, ByteBuffer byteBuffer, boolean z) {
        nk0 jk0Var;
        this.AL = byteBuffer;
        this.w9 = z;
        if (this.k2.tp) {
            yn0 yn0VarSI = SI(str);
            jk0Var = new ul0(uri, yn0VarSI, new hm0(yn0VarSI), bn.gn, null);
        } else {
            jk0Var = new jk0(uri, SI(str), rt.j6, -1, bn.gn, this, null, this.k2.VH);
        }
        this.zh.fN(jk0Var);
        Z1++;
    }

    final /* synthetic */ void nw(boolean z, long j) {
        tt ttVar = this.hK;
        if (ttVar != null) {
            ttVar.DW(z, j);
        }
    }

    final void rN(Surface surface, boolean z) {
        ne0 ne0Var = new ne0(this.jw, 1, surface);
        if (z) {
            this.zh.sg(ne0Var);
        } else {
            this.zh.Gj(ne0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.vp0
    public final void tp(zzfs zzfsVar) {
    }

    @Override // com.google.android.gms.internal.ads.vp0
    public final void u7(int i, long j) {
    }

    @Override // com.google.android.gms.internal.ads.qo0
    public final /* bridge */ /* synthetic */ void v5(xn0 xn0Var) {
    }

    public final lt vy() {
        return this.mb;
    }

    @Override // com.google.android.gms.internal.ads.le0
    public final void we(al0 al0Var, qn0 qn0Var) {
    }

    public final ke0 yS() {
        return this.zh;
    }
}
