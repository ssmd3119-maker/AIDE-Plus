package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

@TargetApi(16)
/* loaded from: classes.dex */
public abstract class bj0 extends he0 {
    private static final byte[] ca = ip0.QX("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
    private boolean BT;
    private final boolean EQ;
    protected sg0 I;
    private final tg0 J0;
    private final xe0 J8;
    private int KD;
    private MediaCodec Mr;
    private boolean Mz;
    private boolean P8;
    private final MediaCodec.BufferInfo QX;
    private long SI;
    private boolean Sf;
    private aj0 U2;
    private final List<Long> Ws;
    private zzfs XL;
    private boolean a8;
    private wg0<Object> aM;
    private int cb;
    private boolean cn;
    private int dx;
    private boolean ef;
    private ByteBuffer[] ei;
    private boolean er;
    private boolean g3;
    private boolean gW;
    private wg0<Object> j3;
    private boolean lg;
    private ByteBuffer[] nw;
    private boolean rN;
    private int ro;
    private boolean sG;
    private boolean sh;
    private final yg0<Object> tp;
    private final ej0 u7;
    private boolean vJ;
    private boolean vy;
    private final tg0 we;
    private boolean yS;

    public bj0(int i, ej0 ej0Var, yg0<Object> yg0Var, boolean z) {
        super(i);
        ro0.Hw(ip0.j6 >= 16);
        ro0.FH(ej0Var);
        this.u7 = ej0Var;
        this.tp = yg0Var;
        this.EQ = z;
        this.we = new tg0(0);
        this.J0 = new tg0(0);
        this.J8 = new xe0();
        this.Ws = new ArrayList();
        this.QX = new MediaCodec.BufferInfo();
        this.cb = 0;
        this.dx = 0;
    }

    private final boolean BT(long j, long j2) throws je0 {
        boolean zRN;
        boolean z;
        if (this.ro < 0) {
            if (this.gW && this.ef) {
                try {
                    this.ro = this.Mr.dequeueOutputBuffer(this.QX, 0L);
                } catch (IllegalStateException unused) {
                    OW();
                    if (this.vJ) {
                        aj();
                    }
                    return false;
                }
            } else {
                this.ro = this.Mr.dequeueOutputBuffer(this.QX, 0L);
            }
            int i = this.ro;
            if (i < 0) {
                if (i != -2) {
                    if (i == -3) {
                        this.nw = this.Mr.getOutputBuffers();
                        return true;
                    }
                    if (this.er && (this.Sf || this.dx == 2)) {
                        OW();
                    }
                    return false;
                }
                MediaFormat outputFormat = this.Mr.getOutputFormat();
                if (this.rN && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                    this.P8 = true;
                } else {
                    if (this.BT) {
                        outputFormat.setInteger("channel-count", 1);
                    }
                    aM(this.Mr, outputFormat);
                }
                return true;
            }
            if (this.P8) {
                this.P8 = false;
                this.Mr.releaseOutputBuffer(i, false);
                this.ro = -1;
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.QX;
            if ((bufferInfo.flags & 4) != 0) {
                OW();
                this.ro = -1;
                return false;
            }
            ByteBuffer byteBuffer = this.nw[i];
            if (byteBuffer != null) {
                byteBuffer.position(bufferInfo.offset);
                MediaCodec.BufferInfo bufferInfo2 = this.QX;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            long j3 = this.QX.presentationTimeUs;
            int size = this.Ws.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z = false;
                    break;
                }
                if (this.Ws.get(i2).longValue() == j3) {
                    this.Ws.remove(i2);
                    z = true;
                    break;
                }
                i2++;
            }
            this.cn = z;
        }
        if (this.gW && this.ef) {
            try {
                zRN = rN(j, j2, this.Mr, this.nw[this.ro], this.ro, this.QX.flags, this.QX.presentationTimeUs, this.cn);
            } catch (IllegalStateException unused2) {
                OW();
                if (this.vJ) {
                    aj();
                }
                return false;
            }
        } else {
            MediaCodec mediaCodec = this.Mr;
            ByteBuffer[] byteBufferArr = this.nw;
            int i3 = this.ro;
            ByteBuffer byteBuffer2 = byteBufferArr[i3];
            MediaCodec.BufferInfo bufferInfo3 = this.QX;
            zRN = rN(j, j2, mediaCodec, byteBuffer2, i3, bufferInfo3.flags, bufferInfo3.presentationTimeUs, this.cn);
        }
        if (!zRN) {
            return false;
        }
        long j4 = this.QX.presentationTimeUs;
        this.ro = -1;
        return true;
    }

    private final void OW() throws je0 {
        if (this.dx == 2) {
            aj();
            ei();
        } else {
            this.vJ = true;
            vy();
        }
    }

    private final void lg(cj0 cj0Var) throws je0 {
        throw je0.DW(cj0Var, VH());
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean lp() throws android.media.MediaCodec.CryptoException, com.google.android.gms.internal.ads.je0 {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bj0.lp():boolean");
    }

    @Override // com.google.android.gms.internal.ads.ef0
    public final int DW(zzfs zzfsVar) throws je0 {
        try {
            return j3(this.u7, zzfsVar);
        } catch (ij0 e) {
            throw je0.DW(e, VH());
        }
    }

    @Override // com.google.android.gms.internal.ads.he0
    protected void EQ(long j, boolean z) {
        this.Sf = false;
        this.vJ = false;
        if (this.Mr != null) {
            this.SI = -9223372036854775807L;
            this.KD = -1;
            this.ro = -1;
            this.Mz = true;
            this.g3 = false;
            this.cn = false;
            this.Ws.clear();
            this.vy = false;
            this.P8 = false;
            if (this.lg || ((this.yS && this.ef) || this.dx != 0)) {
                aj();
                ei();
            } else {
                this.Mr.flush();
                this.sG = false;
            }
            if (!this.sh || this.XL == null) {
                return;
            }
            this.cb = 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.he0
    protected void J0(boolean z) {
        this.I = new sg0();
    }

    @Override // com.google.android.gms.internal.ads.he0
    protected void J8() {
        this.XL = null;
        try {
            aj();
            try {
                if (this.aM != null) {
                    this.tp.j6(this.aM);
                }
                try {
                    if (this.j3 != null && this.j3 != this.aM) {
                        this.tp.j6(this.j3);
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    if (this.j3 != null && this.j3 != this.aM) {
                        this.tp.j6(this.j3);
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th2) {
            try {
                if (this.aM != null) {
                    this.tp.j6(this.aM);
                }
                try {
                    if (this.j3 != null && this.j3 != this.aM) {
                        this.tp.j6(this.j3);
                    }
                    throw th2;
                } finally {
                }
            } catch (Throwable th3) {
                try {
                    if (this.j3 != null && this.j3 != this.aM) {
                        this.tp.j6(this.j3);
                    }
                    throw th3;
                } finally {
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public boolean KD() {
        if (this.XL == null || this.g3) {
            return false;
        }
        if (QX() || this.ro >= 0) {
            return true;
        }
        return this.SI != -9223372036854775807L && SystemClock.elapsedRealtime() < this.SI;
    }

    protected aj0 Mr(ej0 ej0Var, zzfs zzfsVar, boolean z) {
        return ej0Var.j6(zzfsVar.k2, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void P8(com.google.android.gms.internal.ads.zzfs r5) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzfs r0 = r4.XL
            r4.XL = r5
            com.google.android.gms.internal.ads.zzhp r5 = r5.w9
            r1 = 0
            if (r0 != 0) goto Lb
            r2 = r1
            goto Ld
        Lb:
            com.google.android.gms.internal.ads.zzhp r2 = r0.w9
        Ld:
            boolean r5 = com.google.android.gms.internal.ads.ip0.u7(r5, r2)
            r2 = 1
            r5 = r5 ^ r2
            if (r5 == 0) goto L49
            com.google.android.gms.internal.ads.zzfs r5 = r4.XL
            com.google.android.gms.internal.ads.zzhp r5 = r5.w9
            if (r5 == 0) goto L47
            com.google.android.gms.internal.ads.yg0<java.lang.Object> r5 = r4.tp
            if (r5 == 0) goto L37
            android.os.Looper r1 = android.os.Looper.myLooper()
            com.google.android.gms.internal.ads.zzfs r3 = r4.XL
            com.google.android.gms.internal.ads.zzhp r3 = r3.w9
            com.google.android.gms.internal.ads.wg0 r5 = r5.DW(r1, r3)
            r4.j3 = r5
            com.google.android.gms.internal.ads.wg0<java.lang.Object> r1 = r4.aM
            if (r5 != r1) goto L49
            com.google.android.gms.internal.ads.yg0<java.lang.Object> r1 = r4.tp
            r1.j6(r5)
            goto L49
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Media requires a DrmSessionManager"
            r5.<init>(r0)
            int r0 = r4.VH()
            com.google.android.gms.internal.ads.je0 r5 = com.google.android.gms.internal.ads.je0.DW(r5, r0)
            throw r5
        L47:
            r4.j3 = r1
        L49:
            com.google.android.gms.internal.ads.wg0<java.lang.Object> r5 = r4.j3
            com.google.android.gms.internal.ads.wg0<java.lang.Object> r1 = r4.aM
            if (r5 != r1) goto L7a
            android.media.MediaCodec r5 = r4.Mr
            if (r5 == 0) goto L7a
            com.google.android.gms.internal.ads.aj0 r1 = r4.U2
            boolean r1 = r1.DW
            com.google.android.gms.internal.ads.zzfs r3 = r4.XL
            boolean r5 = r4.er(r5, r1, r0, r3)
            if (r5 == 0) goto L7a
            r4.sh = r2
            r4.cb = r2
            boolean r5 = r4.rN
            if (r5 == 0) goto L76
            com.google.android.gms.internal.ads.zzfs r5 = r4.XL
            int r1 = r5.hK
            int r3 = r0.hK
            if (r1 != r3) goto L76
            int r5 = r5.cT
            int r0 = r0.cT
            if (r5 != r0) goto L76
            goto L77
        L76:
            r2 = 0
        L77:
            r4.vy = r2
            return
        L7a:
            boolean r5 = r4.sG
            if (r5 == 0) goto L81
            r4.dx = r2
            return
        L81:
            r4.aj()
            r4.ei()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bj0.P8(com.google.android.gms.internal.ads.zzfs):void");
    }

    protected final aj0 SI() {
        return this.U2;
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void Sf(long j, long j2) throws je0 {
        if (this.vJ) {
            vy();
            return;
        }
        if (this.XL == null) {
            this.J0.j6();
            int iTp = tp(this.J8, this.J0, true);
            if (iTp != -5) {
                if (iTp == -4) {
                    ro0.Hw(this.J0.Hw());
                    this.Sf = true;
                    OW();
                    return;
                }
                return;
            }
            P8(this.J8.j6);
        }
        ei();
        if (this.Mr != null) {
            gp0.j6("drainAndFeed");
            while (BT(j, j2)) {
            }
            while (lp()) {
            }
            gp0.DW();
        } else {
            XL(j);
            this.J0.j6();
            int iTp2 = tp(this.J8, this.J0, false);
            if (iTp2 == -5) {
                P8(this.J8.j6);
            } else if (iTp2 == -4) {
                ro0.Hw(this.J0.Hw());
                this.Sf = true;
                OW();
            }
        }
        this.I.j6();
    }

    protected void U2(tg0 tg0Var) {
    }

    protected abstract void a8(aj0 aj0Var, MediaCodec mediaCodec, zzfs zzfsVar, MediaCrypto mediaCrypto);

    protected abstract void aM(MediaCodec mediaCodec, MediaFormat mediaFormat);

    protected void aj() {
        this.SI = -9223372036854775807L;
        this.KD = -1;
        this.ro = -1;
        this.g3 = false;
        this.cn = false;
        this.Ws.clear();
        this.ei = null;
        this.nw = null;
        this.U2 = null;
        this.sh = false;
        this.sG = false;
        this.a8 = false;
        this.lg = false;
        this.rN = false;
        this.er = false;
        this.yS = false;
        this.BT = false;
        this.vy = false;
        this.P8 = false;
        this.ef = false;
        this.cb = 0;
        this.dx = 0;
        this.we.FH = null;
        MediaCodec mediaCodec = this.Mr;
        if (mediaCodec != null) {
            this.I.DW++;
            try {
                mediaCodec.stop();
                try {
                    this.Mr.release();
                    this.Mr = null;
                    wg0<Object> wg0Var = this.aM;
                    if (wg0Var == null || this.j3 == wg0Var) {
                        return;
                    }
                    try {
                        this.tp.j6(wg0Var);
                    } finally {
                    }
                } catch (Throwable th) {
                    this.Mr = null;
                    wg0<Object> wg0Var2 = this.aM;
                    if (wg0Var2 != null && this.j3 != wg0Var2) {
                        try {
                            this.tp.j6(wg0Var2);
                        } finally {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    this.Mr.release();
                    this.Mr = null;
                    wg0<Object> wg0Var3 = this.aM;
                    if (wg0Var3 != null && this.j3 != wg0Var3) {
                        try {
                            this.tp.j6(wg0Var3);
                        } finally {
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    this.Mr = null;
                    wg0<Object> wg0Var4 = this.aM;
                    if (wg0Var4 != null && this.j3 != wg0Var4) {
                        try {
                            this.tp.j6(wg0Var4);
                        } finally {
                        }
                    }
                    throw th3;
                }
            }
        }
    }

    protected final void ei() throws je0 {
        zzfs zzfsVar;
        if (this.Mr != null || (zzfsVar = this.XL) == null) {
            return;
        }
        wg0<Object> wg0Var = this.j3;
        this.aM = wg0Var;
        String str = zzfsVar.k2;
        if (wg0Var != null) {
            int iCn = wg0Var.cn();
            if (iCn == 0) {
                throw je0.DW(this.aM.DW(), VH());
            }
            if (iCn == 3 || iCn == 4) {
                this.aM.j6();
                throw new NoSuchMethodError();
            }
            return;
        }
        if (this.U2 == null) {
            try {
                aj0 aj0VarMr = Mr(this.u7, zzfsVar, false);
                this.U2 = aj0VarMr;
                if (aj0VarMr == null) {
                    lg(new cj0(this.XL, (Throwable) null, false, -49999));
                    throw null;
                }
            } catch (ij0 e) {
                lg(new cj0(this.XL, (Throwable) e, false, -49998));
                throw null;
            }
        }
        if (yS(this.U2)) {
            String str2 = this.U2.j6;
            this.a8 = ip0.j6 < 21 && this.XL.AL.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str2);
            int i = ip0.j6;
            this.lg = i < 18 || (i == 18 && ("OMX.SEC.avc.dec".equals(str2) || "OMX.SEC.avc.dec.secure".equals(str2))) || (ip0.j6 == 19 && ip0.Hw.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str2) || "OMX.Exynos.avc.dec.secure".equals(str2)));
            this.rN = ip0.j6 < 24 && ("OMX.Nvidia.h264.decode".equals(str2) || "OMX.Nvidia.h264.decode.secure".equals(str2)) && ("flounder".equals(ip0.DW) || "flounder_lte".equals(ip0.DW) || "grouper".equals(ip0.DW) || "tilapia".equals(ip0.DW));
            this.er = ip0.j6 <= 17 && ("OMX.rk.video_decoder.avc".equals(str2) || "OMX.allwinner.video.decoder.avc".equals(str2));
            this.yS = (ip0.j6 <= 23 && "OMX.google.vorbis.decoder".equals(str2)) || (ip0.j6 <= 19 && "hb2000".equals(ip0.DW) && ("OMX.amlogic.avc.decoder.awesome".equals(str2) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str2)));
            this.gW = ip0.j6 == 21 && "OMX.google.aac.decoder".equals(str2);
            this.BT = ip0.j6 <= 18 && this.XL.iW == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str2);
            try {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                String strValueOf = String.valueOf(str2);
                gp0.j6(strValueOf.length() != 0 ? "createCodec:".concat(strValueOf) : new String("createCodec:"));
                this.Mr = MediaCodec.createByCodecName(str2);
                gp0.DW();
                gp0.j6("configureCodec");
                a8(this.U2, this.Mr, this.XL, null);
                gp0.DW();
                gp0.j6("startCodec");
                this.Mr.start();
                gp0.DW();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                gW(str2, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
                this.ei = this.Mr.getInputBuffers();
                this.nw = this.Mr.getOutputBuffers();
                this.SI = cn() == 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
                this.KD = -1;
                this.ro = -1;
                this.Mz = true;
                this.I.j6++;
            } catch (Exception e2) {
                lg(new cj0(this.XL, (Throwable) e2, false, str2));
                throw null;
            }
        }
    }

    protected boolean er(MediaCodec mediaCodec, boolean z, zzfs zzfsVar, zzfs zzfsVar2) {
        return false;
    }

    protected abstract void gW(String str, long j, long j2);

    @Override // com.google.android.gms.internal.ads.he0
    protected void gn() {
    }

    protected abstract int j3(ej0 ej0Var, zzfs zzfsVar);

    @Override // com.google.android.gms.internal.ads.ef0
    public final int j6() {
        return 4;
    }

    protected final MediaCodec nw() {
        return this.Mr;
    }

    protected abstract boolean rN(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z);

    @Override // com.google.android.gms.internal.ads.cf0
    public boolean ro() {
        return this.vJ;
    }

    @Override // com.google.android.gms.internal.ads.he0
    protected void u7() {
    }

    protected void vy() {
    }

    protected boolean yS(aj0 aj0Var) {
        return true;
    }
}
