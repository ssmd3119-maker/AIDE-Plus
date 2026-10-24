package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

@TargetApi(16)
/* loaded from: classes.dex */
public final class ig0 extends bj0 implements vo0 {
    private int OW;
    private final wf0 Qq;
    private long XX;
    private boolean aj;
    private int br;
    private boolean kQ;
    private MediaFormat lp;
    private boolean sy;
    private final pf0 x9;

    public ig0(ej0 ej0Var) {
        this(ej0Var, null, true);
    }

    protected static void XG(int i) {
    }

    protected static void XX(int i, long j, long j2) {
    }

    private final boolean jJ(String str) {
        return this.Qq.P8(str);
    }

    static /* synthetic */ boolean kQ(ig0 ig0Var, boolean z) {
        ig0Var.kQ = true;
        return true;
    }

    protected static void yO() {
    }

    @Override // com.google.android.gms.internal.ads.bj0, com.google.android.gms.internal.ads.he0
    protected final void EQ(long j, boolean z) throws IllegalStateException {
        super.EQ(j, z);
        this.Qq.v5();
        this.XX = j;
        this.kQ = true;
    }

    @Override // com.google.android.gms.internal.ads.vo0
    public final long FH() {
        long jEr = this.Qq.er(ro());
        if (jEr != Long.MIN_VALUE) {
            if (!this.kQ) {
                jEr = Math.max(this.XX, jEr);
            }
            this.XX = jEr;
            this.kQ = false;
        }
        return this.XX;
    }

    @Override // com.google.android.gms.internal.ads.vo0
    public final bf0 Hw(bf0 bf0Var) {
        return this.Qq.EQ(bf0Var);
    }

    @Override // com.google.android.gms.internal.ads.he0, com.google.android.gms.internal.ads.cf0
    public final vo0 I() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.bj0, com.google.android.gms.internal.ads.he0
    protected final void J0(boolean z) throws IllegalStateException {
        super.J0(z);
        this.x9.Hw(this.I);
        int i = Ws().j6;
        if (i != 0) {
            this.Qq.BT(i);
        } else {
            this.Qq.Mr();
        }
    }

    @Override // com.google.android.gms.internal.ads.bj0, com.google.android.gms.internal.ads.he0
    protected final void J8() {
        try {
            this.Qq.Hw();
            try {
                super.J8();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.J8();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.bj0, com.google.android.gms.internal.ads.cf0
    public final boolean KD() {
        return this.Qq.aM() || super.KD();
    }

    @Override // com.google.android.gms.internal.ads.bj0
    protected final aj0 Mr(ej0 ej0Var, zzfs zzfsVar, boolean z) {
        aj0 aj0VarDW;
        if (!jJ(zzfsVar.k2) || (aj0VarDW = ej0Var.DW()) == null) {
            this.sy = false;
            return super.Mr(ej0Var, zzfsVar, z);
        }
        this.sy = true;
        return aj0VarDW;
    }

    @Override // com.google.android.gms.internal.ads.bj0
    protected final void P8(zzfs zzfsVar) {
        super.P8(zzfsVar);
        this.x9.v5(zzfsVar);
        this.OW = "audio/raw".equals(zzfsVar.k2) ? zzfsVar.e3 : 2;
        this.br = zzfsVar.iW;
    }

    @Override // com.google.android.gms.internal.ads.he0, com.google.android.gms.internal.ads.me0
    public final void Zo(int i, Object obj) throws IllegalStateException {
        if (i == 2) {
            this.Qq.VH(((Float) obj).floatValue());
        } else if (i != 3) {
            super.Zo(i, obj);
        } else {
            this.Qq.Zo(((Integer) obj).intValue());
        }
    }

    @Override // com.google.android.gms.internal.ads.bj0
    protected final void a8(aj0 aj0Var, MediaCodec mediaCodec, zzfs zzfsVar, MediaCrypto mediaCrypto) {
        this.aj = ip0.j6 < 24 && "OMX.SEC.aac.dec".equals(aj0Var.j6) && "samsung".equals(ip0.FH) && (ip0.DW.startsWith("zeroflte") || ip0.DW.startsWith("herolte") || ip0.DW.startsWith("heroqlte"));
        if (!this.sy) {
            mediaCodec.configure(zzfsVar.j3(), (Surface) null, (MediaCrypto) null, 0);
            this.lp = null;
            return;
        }
        MediaFormat mediaFormatJ3 = zzfsVar.j3();
        this.lp = mediaFormatJ3;
        mediaFormatJ3.setString("mime", "audio/raw");
        mediaCodec.configure(this.lp, (Surface) null, (MediaCrypto) null, 0);
        this.lp.setString("mime", zzfsVar.k2);
    }

    @Override // com.google.android.gms.internal.ads.bj0
    protected final void aM(MediaCodec mediaCodec, MediaFormat mediaFormat) throws IllegalStateException, je0 {
        int[] iArr;
        int i;
        boolean z = this.lp != null;
        String string = z ? this.lp.getString("mime") : "audio/raw";
        if (z) {
            mediaFormat = this.lp;
        }
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.aj && integer == 6 && (i = this.br) < 6) {
            iArr = new int[i];
            for (int i2 = 0; i2 < this.br; i2++) {
                iArr[i2] = i2;
            }
        } else {
            iArr = null;
        }
        try {
            this.Qq.u7(string, integer, integer2, this.OW, 0, iArr);
        } catch (ag0 e) {
            throw je0.DW(e, VH());
        }
    }

    @Override // com.google.android.gms.internal.ads.bj0
    protected final void gW(String str, long j, long j2) {
        this.x9.FH(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.bj0, com.google.android.gms.internal.ads.he0
    protected final void gn() throws IllegalStateException {
        super.gn();
        this.Qq.FH();
    }

    @Override // com.google.android.gms.internal.ads.bj0
    protected final int j3(ej0 ej0Var, zzfs zzfsVar) {
        int i;
        int i2;
        String str = zzfsVar.k2;
        boolean z = false;
        if (!wo0.j6(str)) {
            return 0;
        }
        int i3 = ip0.j6 >= 21 ? 16 : 0;
        if (jJ(str) && ej0Var.DW() != null) {
            return i3 | 4 | 3;
        }
        aj0 aj0VarJ6 = ej0Var.j6(str, false);
        if (aj0VarJ6 == null) {
            return 1;
        }
        if (ip0.j6 < 21 || (((i = zzfsVar.eU) == -1 || aj0VarJ6.Hw(i)) && ((i2 = zzfsVar.iW) == -1 || aj0VarJ6.v5(i2)))) {
            z = true;
        }
        return i3 | 4 | (z ? 3 : 2);
    }

    @Override // com.google.android.gms.internal.ads.bj0
    protected final boolean rN(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws je0 {
        if (this.sy && (i2 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        }
        if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.I.v5++;
            this.Qq.Ws();
            return true;
        }
        try {
            if (!this.Qq.tp(byteBuffer, j3)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i, false);
            this.I.Hw++;
            return true;
        } catch (bg0 | fg0 e) {
            throw je0.DW(e, VH());
        }
    }

    @Override // com.google.android.gms.internal.ads.bj0, com.google.android.gms.internal.ads.cf0
    public final boolean ro() {
        return super.ro() && this.Qq.J0();
    }

    @Override // com.google.android.gms.internal.ads.bj0, com.google.android.gms.internal.ads.he0
    protected final void u7() {
        this.Qq.DW();
        super.u7();
    }

    @Override // com.google.android.gms.internal.ads.vo0
    public final bf0 v5() {
        return this.Qq.j3();
    }

    @Override // com.google.android.gms.internal.ads.bj0
    protected final void vy() throws je0 {
        try {
            this.Qq.QX();
        } catch (fg0 e) {
            throw je0.DW(e, VH());
        }
    }

    private ig0(ej0 ej0Var, yg0<Object> yg0Var, boolean z) {
        this(ej0Var, null, true, null, null);
    }

    private ig0(ej0 ej0Var, yg0<Object> yg0Var, boolean z, Handler handler, of0 of0Var) {
        this(ej0Var, null, true, null, null, null, new mf0[0]);
    }

    private ig0(ej0 ej0Var, yg0<Object> yg0Var, boolean z, Handler handler, of0 of0Var, lf0 lf0Var, mf0... mf0VarArr) {
        super(1, ej0Var, yg0Var, z);
        this.Qq = new wf0(null, mf0VarArr, new kg0(this));
        this.x9 = new pf0(null, null);
    }
}
