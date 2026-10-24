package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import java.nio.ByteBuffer;

@jg
@TargetApi(16)
/* loaded from: classes.dex */
public final class ys extends zzbdi implements TextureView.SurfaceTextureListener, tt {
    private Surface AL;
    private int Jl;
    private boolean Q6;
    private zzbdx Z1;
    private boolean cT;
    private int e3;
    private int eU;
    private final us fY;
    private String hK;
    private int iW;
    private final ss jw;
    private final rs k2;
    private boolean kf;
    private final boolean n5;
    private int q7;
    private final boolean qp;
    private float sE;
    private mt w9;
    private cs zh;

    public ys(Context context, us usVar, ss ssVar, boolean z, boolean z2, rs rsVar) {
        super(context);
        this.q7 = 1;
        this.qp = z2;
        this.jw = ssVar;
        this.fY = usVar;
        this.n5 = z;
        this.k2 = rsVar;
        setSurfaceTextureListener(this);
        this.fY.Hw(this);
    }

    private final String Mr() {
        return com.google.android.gms.ads.internal.w0.v5().Eq(this.jw.getContext(), this.jw.sy().WB);
    }

    private final boolean U2() {
        return (this.w9 == null || this.cT) ? false : true;
    }

    private final void XL(float f, boolean z) {
        mt mtVar = this.w9;
        if (mtVar != null) {
            mtVar.ei(f, z);
        } else {
            xp.u7("Trying to set volume before player is initalized.");
        }
    }

    private final boolean a8() {
        return U2() && this.q7 != 1;
    }

    private final void aM(Surface surface, boolean z) {
        mt mtVar = this.w9;
        if (mtVar != null) {
            mtVar.rN(surface, z);
        } else {
            xp.u7("Trying to set surface before player is initalized.");
        }
    }

    private final void er() {
        int i = this.iW;
        float f = i > 0 ? this.Jl / i : 1.0f;
        if (this.sE != f) {
            this.sE = f;
            requestLayout();
        }
    }

    private final void gW() {
        mt mtVar = this.w9;
        if (mtVar != null) {
            mtVar.P8(false);
        }
    }

    private final mt j3() {
        return new mt(this.jw.getContext(), this.k2);
    }

    private final void lg() {
        String str;
        if (this.w9 != null || (str = this.hK) == null || this.AL == null) {
            return;
        }
        if (str.startsWith("cache:")) {
            fu fuVarYs = this.jw.ys(this.hK);
            if (fuVarYs instanceof ru) {
                this.w9 = ((ru) fuVarYs).rN();
            } else {
                if (!(fuVarYs instanceof qu)) {
                    String strValueOf = String.valueOf(this.hK);
                    xp.u7(strValueOf.length() != 0 ? "Stream cache miss: ".concat(strValueOf) : new String("Stream cache miss: "));
                    return;
                }
                qu quVar = (qu) fuVarYs;
                String strMr = Mr();
                ByteBuffer byteBufferRN = quVar.rN();
                boolean zGW = quVar.gW();
                String strEr = quVar.er();
                if (strEr == null) {
                    xp.u7("Stream cache URL is null.");
                    return;
                } else {
                    mt mtVarJ3 = j3();
                    this.w9 = mtVarJ3;
                    mtVarJ3.lg(Uri.parse(strEr), strMr, byteBufferRN, zGW);
                }
            }
        } else {
            this.w9 = j3();
            this.w9.a8(Uri.parse(this.hK), Mr());
        }
        this.w9.er(this);
        aM(this.AL, false);
        int iKf = this.w9.yS().kf();
        this.q7 = iKf;
        if (iKf == 3) {
            rN();
        }
    }

    private final void rN() {
        if (this.Q6) {
            return;
        }
        this.Q6 = true;
        bn.gn.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zs
            private final ys WB;

            {
                this.WB = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.WB.SI();
            }
        });
        j6();
        this.fY.Zo();
        if (this.kf) {
            v5();
        }
    }

    private final void yS() {
        mt mtVar = this.w9;
        if (mtVar != null) {
            mtVar.P8(true);
        }
    }

    final /* synthetic */ void BT() {
        cs csVar = this.zh;
        if (csVar != null) {
            csVar.VH();
        }
    }

    @Override // com.google.android.gms.internal.ads.tt
    public final void DW(final boolean z, final long j) {
        if (this.jw != null) {
            ar.j6.execute(new Runnable(this, z, j) { // from class: com.google.android.gms.internal.ads.it
                private final ys WB;
                private final long jw;
                private final boolean mb;

                {
                    this.WB = this;
                    this.mb = z;
                    this.jw = j;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.WB.KD(this.mb, this.jw);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdi
    public final void EQ(cs csVar) {
        this.zh = csVar;
    }

    @Override // com.google.android.gms.internal.ads.tt
    public final void FH(int i) {
        if (this.q7 != i) {
            this.q7 = i;
            if (i == 3) {
                rN();
                return;
            }
            if (i != 4) {
                return;
            }
            if (this.k2.j6) {
                gW();
            }
            this.fY.FH();
            this.mb.v5();
            bn.gn.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.at
                private final ys WB;

                {
                    this.WB = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.WB.nw();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdi
    public final void Hw() {
        if (a8()) {
            if (this.k2.j6) {
                gW();
            }
            this.w9.yS().e3(false);
            this.fY.FH();
            this.mb.v5();
            bn.gn.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.dt
                private final ys WB;

                {
                    this.WB = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.WB.P8();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdi
    public final void J0(int i) {
        mt mtVar = this.w9;
        if (mtVar != null) {
            mtVar.vy().tp(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdi
    public final void J8(int i) {
        mt mtVar = this.w9;
        if (mtVar != null) {
            mtVar.vy().EQ(i);
        }
    }

    final /* synthetic */ void KD(boolean z, long j) {
        this.jw.a5(z, j);
    }

    final /* synthetic */ void P8() {
        cs csVar = this.zh;
        if (csVar != null) {
            csVar.DW();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdi
    public final void QX(int i) {
        mt mtVar = this.w9;
        if (mtVar != null) {
            mtVar.vy().u7(i);
        }
    }

    final /* synthetic */ void SI() {
        cs csVar = this.zh;
        if (csVar != null) {
            csVar.j6();
        }
    }

    @Override // com.google.android.gms.internal.ads.tt
    public final void VH(int i, int i2) {
        this.Jl = i;
        this.iW = i2;
        er();
    }

    @Override // com.google.android.gms.internal.ads.zzbdi
    public final void Ws(int i) {
        mt mtVar = this.w9;
        if (mtVar != null) {
            mtVar.vy().gn(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.tt
    public final void Zo(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(canonicalName).length() + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        final String string = sb.toString();
        String strValueOf = String.valueOf(string);
        xp.u7(strValueOf.length() != 0 ? "ExoPlayerAdapter error: ".concat(strValueOf) : new String("ExoPlayerAdapter error: "));
        this.cT = true;
        if (this.k2.j6) {
            gW();
        }
        bn.gn.post(new Runnable(this, string) { // from class: com.google.android.gms.internal.ads.bt
            private final ys WB;
            private final String mb;

            {
                this.WB = this;
                this.mb = string;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.WB.cn(this.mb);
            }
        });
    }

    final /* synthetic */ void cn(String str) {
        cs csVar = this.zh;
        if (csVar != null) {
            csVar.v5("ExoPlayerAdapter error", str);
        }
    }

    final /* synthetic */ void ei() {
        cs csVar = this.zh;
        if (csVar != null) {
            csVar.Hw();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdi
    public final int getCurrentPosition() {
        if (a8()) {
            return (int) this.w9.yS().eU();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbdi
    public final int getDuration() {
        if (a8()) {
            return (int) this.w9.yS().Cz();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbdi
    public final int getVideoHeight() {
        return this.iW;
    }

    @Override // com.google.android.gms.internal.ads.zzbdi
    public final int getVideoWidth() {
        return this.Jl;
    }

    @Override // com.google.android.gms.internal.ads.zzbdi
    public final void gn(int i) {
        if (a8()) {
            this.w9.yS().iW(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdi, com.google.android.gms.internal.ads.xs
    public final void j6() {
        XL(this.mb.j6(), false);
    }

    final /* synthetic */ void nw() {
        cs csVar = this.zh;
        if (csVar != null) {
            csVar.Zo();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.sE;
        if (f != 0.0f && this.Z1 == null) {
            float f2 = measuredWidth;
            float f3 = f2 / measuredHeight;
            if (f > f3) {
                measuredHeight = (int) (f2 / f);
            }
            float f4 = this.sE;
            if (f4 < f3) {
                measuredWidth = (int) (measuredHeight * f4);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzbdx zzbdxVar = this.Z1;
        if (zzbdxVar != null) {
            zzbdxVar.J8(measuredWidth, measuredHeight);
        }
        if (Build.VERSION.SDK_INT == 16) {
            int i4 = this.eU;
            if (((i4 > 0 && i4 != measuredWidth) || ((i3 = this.e3) > 0 && i3 != measuredHeight)) && this.qp && U2()) {
                ke0 ke0VarYS = this.w9.yS();
                if (ke0VarYS.eU() > 0 && !ke0VarYS.pO()) {
                    XL(0.0f, true);
                    ke0VarYS.e3(true);
                    long jEU = ke0VarYS.eU();
                    long jJ6 = com.google.android.gms.ads.internal.w0.we().j6();
                    while (U2() && ke0VarYS.eU() == jEU && com.google.android.gms.ads.internal.w0.we().j6() - jJ6 <= 250) {
                    }
                    ke0VarYS.e3(false);
                    j6();
                }
            }
            this.eU = measuredWidth;
            this.e3 = measuredHeight;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) throws InterruptedException {
        if (this.n5) {
            zzbdx zzbdxVar = new zzbdx(getContext());
            this.Z1 = zzbdxVar;
            zzbdxVar.DW(surfaceTexture, i, i2);
            this.Z1.start();
            SurfaceTexture surfaceTextureGn = this.Z1.gn();
            if (surfaceTextureGn != null) {
                surfaceTexture = surfaceTextureGn;
            } else {
                this.Z1.VH();
                this.Z1 = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.AL = surface;
        if (this.w9 == null) {
            lg();
        } else {
            aM(surface, true);
            if (!this.k2.j6) {
                yS();
            }
        }
        er();
        bn.gn.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.et
            private final ys WB;

            {
                this.WB = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.WB.vy();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Hw();
        zzbdx zzbdxVar = this.Z1;
        if (zzbdxVar != null) {
            zzbdxVar.VH();
            this.Z1 = null;
        }
        if (this.w9 != null) {
            gW();
            Surface surface = this.AL;
            if (surface != null) {
                surface.release();
            }
            this.AL = null;
            aM(null, true);
        }
        bn.gn.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.gt
            private final ys WB;

            {
                this.WB = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.WB.BT();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i, final int i2) {
        zzbdx zzbdxVar = this.Z1;
        if (zzbdxVar != null) {
            zzbdxVar.J8(i, i2);
        }
        bn.gn.post(new Runnable(this, i, i2) { // from class: com.google.android.gms.internal.ads.ft
            private final ys WB;
            private final int jw;
            private final int mb;

            {
                this.WB = this;
                this.mb = i;
                this.jw = i2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.WB.sh(this.mb, this.jw);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.fY.v5(this);
        this.WB.j6(surfaceTexture, this.zh);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdExoPlayerView3 window visibility changed to ");
        sb.append(i);
        sm.we(sb.toString());
        bn.gn.post(new Runnable(this, i) { // from class: com.google.android.gms.internal.ads.ht
            private final ys WB;
            private final int mb;

            {
                this.WB = this;
                this.mb = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.WB.ro(this.mb);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    final /* synthetic */ void ro(int i) {
        cs csVar = this.zh;
        if (csVar != null) {
            csVar.onWindowVisibilityChanged(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdi
    public final void setVideoPath(String str) {
        if (str != null) {
            this.hK = str;
            lg();
        }
    }

    final /* synthetic */ void sh(int i, int i2) {
        cs csVar = this.zh;
        if (csVar != null) {
            csVar.u7(i, i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdi
    public final void tp(float f, float f2) {
        zzbdx zzbdxVar = this.Z1;
        if (zzbdxVar != null) {
            zzbdxVar.tp(f, f2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdi
    public final void u7() {
        if (U2()) {
            this.w9.yS().stop();
            if (this.w9 != null) {
                aM(null, true);
                mt mtVar = this.w9;
                if (mtVar != null) {
                    mtVar.er(null);
                    this.w9.Mr();
                    this.w9 = null;
                }
                this.q7 = 1;
                this.cT = false;
                this.Q6 = false;
                this.kf = false;
            }
        }
        this.fY.FH();
        this.mb.v5();
        this.fY.j6();
    }

    @Override // com.google.android.gms.internal.ads.zzbdi
    public final void v5() {
        if (!a8()) {
            this.kf = true;
            return;
        }
        if (this.k2.j6) {
            yS();
        }
        this.w9.yS().e3(true);
        this.fY.DW();
        this.mb.Hw();
        this.WB.DW();
        bn.gn.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.ct
            private final ys WB;

            {
                this.WB = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.WB.ei();
            }
        });
    }

    final /* synthetic */ void vy() {
        cs csVar = this.zh;
        if (csVar != null) {
            csVar.FH();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdi
    public final String we() {
        String str = this.n5 ? " spherical" : "";
        return str.length() != 0 ? "ExoPlayer/3".concat(str) : new String("ExoPlayer/3");
    }
}
