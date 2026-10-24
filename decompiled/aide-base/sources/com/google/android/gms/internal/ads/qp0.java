package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;

@TargetApi(16)
/* loaded from: classes.dex */
public final class qp0 extends bj0 {
    private static final int[] AL = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private long CU;
    private int Eq;
    private int Ev;
    private int FN;
    private final boolean OW;
    private final zzqs Qq;
    private int WB;
    private Surface XG;
    private zzfs[] XX;
    private int Xa;
    private final long aj;
    private float aq;
    private final long[] br;
    private long et;
    private int fY;
    private int hz;
    private int jJ;
    private int jO;
    private boolean jw;
    private long k2;
    private sp0 kQ;
    private float ko;
    private final int lp;
    private float mb;
    private int oY;
    tp0 qp;
    private final wp0 sy;
    private boolean wc;
    private final Context x9;
    private Surface yO;
    private int ye;
    private int zh;

    public qp0(Context context, ej0 ej0Var, long j, Handler handler, vp0 vp0Var, int i) {
        this(context, ej0Var, 0L, null, false, handler, vp0Var, -1);
    }

    private final void Eq() {
        if (this.Ev == this.FN && this.ye == this.jO && this.WB == this.oY && this.mb == this.ko) {
            return;
        }
        this.sy.DW(this.FN, this.jO, this.oY, this.ko);
        this.Ev = this.FN;
        this.ye = this.jO;
        this.WB = this.oY;
        this.mb = this.ko;
    }

    private static int FN(zzfs zzfsVar) {
        int i = zzfsVar.zh;
        return i != -1 ? i : br(zzfsVar.k2, zzfsVar.hK, zzfsVar.cT);
    }

    private static boolean XG(long j) {
        return j < -30000;
    }

    private final void XX(MediaCodec mediaCodec, int i, long j) {
        gp0.j6("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        gp0.DW();
        this.I.v5++;
    }

    private final void Xa() {
        this.Ev = -1;
        this.ye = -1;
        this.mb = -1.0f;
        this.WB = -1;
    }

    private final void aq() {
        if (this.Xa > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.sy.gn(this.Xa, jElapsedRealtime - this.CU);
            this.Xa = 0;
            this.CU = jElapsedRealtime;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int br(java.lang.String r7, int r8, int r9) {
        /*
            r0 = -1
            if (r8 == r0) goto L86
            if (r9 != r0) goto L7
            goto L86
        L7:
            int r1 = r7.hashCode()
            r2 = 5
            r3 = 1
            r4 = 3
            r5 = 4
            r6 = 2
            switch(r1) {
                case -1664118616: goto L46;
                case -1662541442: goto L3c;
                case 1187890754: goto L32;
                case 1331836730: goto L28;
                case 1599127256: goto L1e;
                case 1599127257: goto L14;
                default: goto L13;
            }
        L13:
            goto L50
        L14:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L50
            r7 = 5
            goto L51
        L1e:
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L50
            r7 = 3
            goto L51
        L28:
            java.lang.String r1 = "video/avc"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L50
            r7 = 2
            goto L51
        L32:
            java.lang.String r1 = "video/mp4v-es"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L50
            r7 = 1
            goto L51
        L3c:
            java.lang.String r1 = "video/hevc"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L50
            r7 = 4
            goto L51
        L46:
            java.lang.String r1 = "video/3gpp"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L50
            r7 = 0
            goto L51
        L50:
            r7 = -1
        L51:
            if (r7 == 0) goto L7d
            if (r7 == r3) goto L7d
            if (r7 == r6) goto L61
            if (r7 == r4) goto L7d
            if (r7 == r5) goto L5e
            if (r7 == r2) goto L5e
            return r0
        L5e:
            int r8 = r8 * r9
            goto L80
        L61:
            java.lang.String r7 = com.google.android.gms.internal.ads.ip0.Hw
            java.lang.String r1 = "BRAVIA 4K 2015"
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L6c
            return r0
        L6c:
            r7 = 16
            int r8 = com.google.android.gms.internal.ads.ip0.U2(r8, r7)
            int r7 = com.google.android.gms.internal.ads.ip0.U2(r9, r7)
            int r8 = r8 * r7
            int r7 = r8 << 4
            int r8 = r7 << 4
            goto L7f
        L7d:
            int r8 = r8 * r9
        L7f:
            r5 = 2
        L80:
            int r8 = r8 * 3
            int r5 = r5 * 2
            int r8 = r8 / r5
            return r8
        L86:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qp0.br(java.lang.String, int, int):int");
    }

    private final void et() {
        MediaCodec mediaCodecNw;
        this.wc = false;
        if (ip0.j6 < 23 || !this.jw || (mediaCodecNw = nw()) == null) {
            return;
        }
        this.qp = new tp0(this, mediaCodecNw);
    }

    private final void hz() {
        if (this.Ev == -1 && this.ye == -1) {
            return;
        }
        this.sy.DW(this.FN, this.jO, this.oY, this.ko);
    }

    private final void jJ(MediaCodec mediaCodec, int i, long j) {
        Eq();
        gp0.j6("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        gp0.DW();
        this.I.Hw++;
        this.Eq = 0;
        CU();
    }

    private static int jO(zzfs zzfsVar) {
        int i = zzfsVar.Z1;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    @TargetApi(21)
    private final void kQ(MediaCodec mediaCodec, int i, long j, long j2) {
        Eq();
        gp0.j6("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j2);
        gp0.DW();
        this.I.Hw++;
        this.Eq = 0;
        CU();
    }

    private final boolean oY(boolean z) {
        if (ip0.j6 < 23 || this.jw) {
            return false;
        }
        return !z || zzqk.j6(this.x9);
    }

    private final void wc() {
        this.et = this.aj > 0 ? SystemClock.elapsedRealtime() + this.aj : -9223372036854775807L;
    }

    private static boolean yO(boolean z, zzfs zzfsVar, zzfs zzfsVar2) {
        if (!zzfsVar.k2.equals(zzfsVar2.k2) || jO(zzfsVar) != jO(zzfsVar2)) {
            return false;
        }
        if (z) {
            return true;
        }
        return zzfsVar.hK == zzfsVar2.hK && zzfsVar.cT == zzfsVar2.cT;
    }

    final void CU() {
        if (this.wc) {
            return;
        }
        this.wc = true;
        this.sy.FH(this.yO);
    }

    @Override // com.google.android.gms.internal.ads.bj0, com.google.android.gms.internal.ads.he0
    protected final void EQ(long j, boolean z) {
        super.EQ(j, z);
        et();
        this.Eq = 0;
        int i = this.zh;
        if (i != 0) {
            this.k2 = this.br[i - 1];
            this.zh = 0;
        }
        if (z) {
            wc();
        } else {
            this.et = -9223372036854775807L;
        }
    }

    @Override // com.google.android.gms.internal.ads.bj0, com.google.android.gms.internal.ads.he0
    protected final void J0(boolean z) {
        super.J0(z);
        int i = Ws().j6;
        this.fY = i;
        this.jw = i != 0;
        this.sy.v5(this.I);
        this.Qq.DW();
    }

    @Override // com.google.android.gms.internal.ads.bj0, com.google.android.gms.internal.ads.he0
    protected final void J8() {
        this.FN = -1;
        this.jO = -1;
        this.ko = -1.0f;
        this.aq = -1.0f;
        this.k2 = -9223372036854775807L;
        this.zh = 0;
        Xa();
        et();
        this.Qq.j6();
        this.qp = null;
        this.jw = false;
        try {
            super.J8();
        } finally {
            this.I.j6();
            this.sy.VH(this.I);
        }
    }

    @Override // com.google.android.gms.internal.ads.bj0, com.google.android.gms.internal.ads.cf0
    public final boolean KD() {
        Surface surface;
        if (super.KD() && (this.wc || (((surface = this.XG) != null && this.yO == surface) || nw() == null))) {
            this.et = -9223372036854775807L;
            return true;
        }
        if (this.et == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.et) {
            return true;
        }
        this.et = -9223372036854775807L;
        return false;
    }

    @Override // com.google.android.gms.internal.ads.bj0
    protected final void P8(zzfs zzfsVar) {
        super.P8(zzfsVar);
        this.sy.Zo(zzfsVar);
        float f = zzfsVar.n5;
        if (f == -1.0f) {
            f = 1.0f;
        }
        this.aq = f;
        this.hz = jO(zzfsVar);
    }

    @Override // com.google.android.gms.internal.ads.bj0
    protected final void U2(tg0 tg0Var) {
        if (ip0.j6 >= 23 || !this.jw) {
            return;
        }
        CU();
    }

    @Override // com.google.android.gms.internal.ads.he0, com.google.android.gms.internal.ads.me0
    public final void Zo(int i, Object obj) throws je0 {
        if (i != 1) {
            if (i != 4) {
                super.Zo(i, obj);
                return;
            }
            this.jJ = ((Integer) obj).intValue();
            MediaCodec mediaCodecNw = nw();
            if (mediaCodecNw != null) {
                mediaCodecNw.setVideoScalingMode(this.jJ);
                return;
            }
            return;
        }
        Surface surfaceDW = (Surface) obj;
        if (surfaceDW == null) {
            Surface surface = this.XG;
            if (surface != null) {
                surfaceDW = surface;
            } else {
                aj0 aj0VarSI = SI();
                if (aj0VarSI != null && oY(aj0VarSI.Hw)) {
                    surfaceDW = zzqk.DW(this.x9, aj0VarSI.Hw);
                    this.XG = surfaceDW;
                }
            }
        }
        if (this.yO == surfaceDW) {
            if (surfaceDW == null || surfaceDW == this.XG) {
                return;
            }
            hz();
            if (this.wc) {
                this.sy.FH(this.yO);
                return;
            }
            return;
        }
        this.yO = surfaceDW;
        int iCn = cn();
        if (iCn == 1 || iCn == 2) {
            MediaCodec mediaCodecNw2 = nw();
            if (ip0.j6 < 23 || mediaCodecNw2 == null || surfaceDW == null) {
                aj();
                ei();
            } else {
                mediaCodecNw2.setOutputSurface(surfaceDW);
            }
        }
        if (surfaceDW == null || surfaceDW == this.XG) {
            Xa();
            et();
            return;
        }
        hz();
        et();
        if (iCn == 2) {
            wc();
        }
    }

    @Override // com.google.android.gms.internal.ads.bj0
    protected final void a8(aj0 aj0Var, MediaCodec mediaCodec, zzfs zzfsVar, MediaCrypto mediaCrypto) {
        sp0 sp0Var;
        Point point;
        zzfs[] zzfsVarArr = this.XX;
        int iMax = zzfsVar.hK;
        int iMax2 = zzfsVar.cT;
        int iFN = FN(zzfsVar);
        if (zzfsVarArr.length == 1) {
            sp0Var = new sp0(iMax, iMax2, iFN);
        } else {
            boolean z = false;
            for (zzfs zzfsVar2 : zzfsVarArr) {
                if (yO(aj0Var.DW, zzfsVar, zzfsVar2)) {
                    z |= zzfsVar2.hK == -1 || zzfsVar2.cT == -1;
                    iMax = Math.max(iMax, zzfsVar2.hK);
                    iMax2 = Math.max(iMax2, zzfsVar2.cT);
                    iFN = Math.max(iFN, FN(zzfsVar2));
                }
            }
            if (z) {
                StringBuilder sb = new StringBuilder(66);
                sb.append("Resolutions unknown. Codec max resolution: ");
                sb.append(iMax);
                sb.append("x");
                sb.append(iMax2);
                Log.w("MediaCodecVideoRenderer", sb.toString());
                boolean z2 = zzfsVar.cT > zzfsVar.hK;
                int i = z2 ? zzfsVar.cT : zzfsVar.hK;
                int i2 = z2 ? zzfsVar.hK : zzfsVar.cT;
                float f = i2 / i;
                int[] iArr = AL;
                int length = iArr.length;
                int i3 = 0;
                while (i3 < length) {
                    int i4 = length;
                    int i5 = iArr[i3];
                    int[] iArr2 = iArr;
                    int i6 = (int) (i5 * f);
                    if (i5 <= i || i6 <= i2) {
                        break;
                    }
                    int i7 = i;
                    int i8 = i2;
                    if (ip0.j6 >= 21) {
                        int i9 = z2 ? i6 : i5;
                        if (!z2) {
                            i5 = i6;
                        }
                        Point pointZo = aj0Var.Zo(i9, i5);
                        if (aj0Var.DW(pointZo.x, pointZo.y, zzfsVar.q7)) {
                            point = pointZo;
                            break;
                        }
                        i3++;
                        length = i4;
                        iArr = iArr2;
                        i = i7;
                        i2 = i8;
                    } else {
                        int iU2 = ip0.U2(i5, 16) << 4;
                        int iU22 = ip0.U2(i6, 16) << 4;
                        if (iU2 * iU22 <= gj0.Zo()) {
                            int i10 = z2 ? iU22 : iU2;
                            if (!z2) {
                                iU2 = iU22;
                            }
                            point = new Point(i10, iU2);
                        } else {
                            i3++;
                            length = i4;
                            iArr = iArr2;
                            i = i7;
                            i2 = i8;
                        }
                    }
                }
                point = null;
                if (point != null) {
                    iMax = Math.max(iMax, point.x);
                    iMax2 = Math.max(iMax2, point.y);
                    iFN = Math.max(iFN, br(zzfsVar.k2, iMax, iMax2));
                    StringBuilder sb2 = new StringBuilder(57);
                    sb2.append("Codec max resolution adjusted to: ");
                    sb2.append(iMax);
                    sb2.append("x");
                    sb2.append(iMax2);
                    Log.w("MediaCodecVideoRenderer", sb2.toString());
                }
            }
            sp0Var = new sp0(iMax, iMax2, iFN);
        }
        this.kQ = sp0Var;
        boolean z3 = this.OW;
        int i11 = this.fY;
        MediaFormat mediaFormatJ3 = zzfsVar.j3();
        mediaFormatJ3.setInteger("max-width", sp0Var.j6);
        mediaFormatJ3.setInteger("max-height", sp0Var.DW);
        int i12 = sp0Var.FH;
        if (i12 != -1) {
            mediaFormatJ3.setInteger("max-input-size", i12);
        }
        if (z3) {
            mediaFormatJ3.setInteger("auto-frc", 0);
        }
        if (i11 != 0) {
            mediaFormatJ3.setFeatureEnabled("tunneled-playback", true);
            mediaFormatJ3.setInteger("audio-session-id", i11);
        }
        if (this.yO == null) {
            ro0.Hw(oY(aj0Var.Hw));
            if (this.XG == null) {
                this.XG = zzqk.DW(this.x9, aj0Var.Hw);
            }
            this.yO = this.XG;
        }
        mediaCodec.configure(mediaFormatJ3, this.yO, (MediaCrypto) null, 0);
        if (ip0.j6 < 23 || !this.jw) {
            return;
        }
        this.qp = new tp0(this, mediaCodec);
    }

    @Override // com.google.android.gms.internal.ads.bj0
    protected final void aM(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        this.FN = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        this.jO = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        this.ko = this.aq;
        if (ip0.j6 >= 21) {
            int i = this.hz;
            if (i == 90 || i == 270) {
                int i2 = this.FN;
                this.FN = this.jO;
                this.jO = i2;
                this.ko = 1.0f / this.ko;
            }
        } else {
            this.oY = this.hz;
        }
        mediaCodec.setVideoScalingMode(this.jJ);
    }

    @Override // com.google.android.gms.internal.ads.bj0
    protected final void aj() {
        try {
            super.aj();
        } finally {
            Surface surface = this.XG;
            if (surface != null) {
                if (this.yO == surface) {
                    this.yO = null;
                }
                this.XG.release();
                this.XG = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.bj0
    protected final boolean er(MediaCodec mediaCodec, boolean z, zzfs zzfsVar, zzfs zzfsVar2) {
        if (!yO(z, zzfsVar, zzfsVar2)) {
            return false;
        }
        int i = zzfsVar2.hK;
        sp0 sp0Var = this.kQ;
        return i <= sp0Var.j6 && zzfsVar2.cT <= sp0Var.DW && zzfsVar2.zh <= sp0Var.FH;
    }

    @Override // com.google.android.gms.internal.ads.bj0
    protected final void gW(String str, long j, long j2) {
        this.sy.Hw(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.bj0, com.google.android.gms.internal.ads.he0
    protected final void gn() {
        super.gn();
        this.Xa = 0;
        this.CU = SystemClock.elapsedRealtime();
        this.et = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.bj0
    protected final int j3(ej0 ej0Var, zzfs zzfsVar) {
        boolean z;
        int i;
        int i2;
        String str = zzfsVar.k2;
        if (!wo0.DW(str)) {
            return 0;
        }
        zzhp zzhpVar = zzfsVar.w9;
        if (zzhpVar != null) {
            z = false;
            for (int i3 = 0; i3 < zzhpVar.jw; i3++) {
                z |= zzhpVar.j6(i3).qp;
            }
        } else {
            z = false;
        }
        aj0 aj0VarJ6 = ej0Var.j6(str, z);
        if (aj0VarJ6 == null) {
            return 1;
        }
        boolean zU7 = aj0VarJ6.u7(zzfsVar.jw);
        if (zU7 && (i = zzfsVar.hK) > 0 && (i2 = zzfsVar.cT) > 0) {
            if (ip0.j6 >= 21) {
                zU7 = aj0VarJ6.DW(i, i2, zzfsVar.q7);
            } else {
                boolean z2 = i * i2 <= gj0.Zo();
                if (!z2) {
                    int i4 = zzfsVar.hK;
                    int i5 = zzfsVar.cT;
                    String str2 = ip0.v5;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 56);
                    sb.append("FalseCheck [legacyFrameSize, ");
                    sb.append(i4);
                    sb.append("x");
                    sb.append(i5);
                    sb.append("] [");
                    sb.append(str2);
                    sb.append("]");
                    Log.d("MediaCodecVideoRenderer", sb.toString());
                }
                zU7 = z2;
            }
        }
        return (zU7 ? 3 : 2) | (aj0VarJ6.DW ? 8 : 4) | (aj0VarJ6.FH ? 16 : 0);
    }

    @Override // com.google.android.gms.internal.ads.bj0
    protected final boolean rN(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws InterruptedException {
        while (true) {
            int i3 = this.zh;
            if (i3 == 0) {
                break;
            }
            long[] jArr = this.br;
            if (j3 < jArr[0]) {
                break;
            }
            this.k2 = jArr[0];
            int i4 = i3 - 1;
            this.zh = i4;
            System.arraycopy(jArr, 1, jArr, 0, i4);
        }
        long j4 = j3 - this.k2;
        if (z) {
            XX(mediaCodec, i, j4);
            return true;
        }
        long j5 = j3 - j;
        if (this.yO == this.XG) {
            if (!XG(j5)) {
                return false;
            }
            XX(mediaCodec, i, j4);
            return true;
        }
        if (!this.wc) {
            if (ip0.j6 >= 21) {
                kQ(mediaCodec, i, j4, System.nanoTime());
            } else {
                jJ(mediaCodec, i, j4);
            }
            return true;
        }
        if (cn() != 2) {
            return false;
        }
        long jElapsedRealtime = j5 - ((SystemClock.elapsedRealtime() * 1000) - j2);
        long jNanoTime = System.nanoTime();
        long jFH = this.Qq.FH(j3, (jElapsedRealtime * 1000) + jNanoTime);
        long j6 = (jFH - jNanoTime) / 1000;
        if (!XG(j6)) {
            if (ip0.j6 >= 21) {
                if (j6 < 50000) {
                    kQ(mediaCodec, i, j4, jFH);
                    return true;
                }
            } else if (j6 < 30000) {
                if (j6 > 11000) {
                    try {
                        Thread.sleep((j6 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                jJ(mediaCodec, i, j4);
                return true;
            }
            return false;
        }
        gp0.j6("dropVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        gp0.DW();
        sg0 sg0Var = this.I;
        sg0Var.Zo++;
        this.Xa++;
        int i5 = this.Eq + 1;
        this.Eq = i5;
        sg0Var.VH = Math.max(i5, sg0Var.VH);
        if (this.Xa == this.lp) {
            aq();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.bj0, com.google.android.gms.internal.ads.he0
    protected final void u7() {
        aq();
        super.u7();
    }

    @Override // com.google.android.gms.internal.ads.he0
    protected final void we(zzfs[] zzfsVarArr, long j) {
        this.XX = zzfsVarArr;
        if (this.k2 == -9223372036854775807L) {
            this.k2 = j;
        } else {
            int i = this.zh;
            long[] jArr = this.br;
            if (i == jArr.length) {
                long j2 = jArr[i - 1];
                StringBuilder sb = new StringBuilder(65);
                sb.append("Too many stream changes, so dropping offset: ");
                sb.append(j2);
                Log.w("MediaCodecVideoRenderer", sb.toString());
            } else {
                this.zh = i + 1;
            }
            this.br[this.zh - 1] = j;
        }
        super.we(zzfsVarArr, j);
    }

    @Override // com.google.android.gms.internal.ads.bj0
    protected final boolean yS(aj0 aj0Var) {
        return this.yO != null || oY(aj0Var.Hw);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private qp0(Context context, ej0 ej0Var, long j, yg0<Object> yg0Var, boolean z, Handler handler, vp0 vp0Var, int i) {
        super(2, ej0Var, null, false);
        boolean z2 = false;
        this.aj = 0L;
        this.lp = -1;
        this.x9 = context.getApplicationContext();
        this.Qq = new zzqs(context);
        this.sy = new wp0(handler, vp0Var);
        if (ip0.j6 <= 22 && "foster".equals(ip0.DW) && "NVIDIA".equals(ip0.FH)) {
            z2 = true;
        }
        this.OW = z2;
        this.br = new long[10];
        this.k2 = -9223372036854775807L;
        this.et = -9223372036854775807L;
        this.FN = -1;
        this.jO = -1;
        this.ko = -1.0f;
        this.aq = -1.0f;
        this.jJ = 1;
        Xa();
    }
}
