package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class wf0 {
    private long BT;
    private final gg0 DW;
    private int EQ;
    private final ng0 FH;
    private final mf0[] Hw;
    private ByteBuffer I;
    private int J0;
    private int J8;
    private long KD;
    private bf0 Mr;
    private ByteBuffer[] Mz;
    private int OW;
    private long P8;
    private boolean QX;
    private int Qq;
    private long SI;
    private long Sf;
    private long U2;
    private final long[] VH;
    private int Ws;
    private int XL;
    private boolean XX;
    private long a8;
    private long aM;
    private boolean aj;
    private boolean br;
    private ByteBuffer ca;
    private int cb;
    private long cn;
    private int dx;
    private long ef;
    private Method ei;
    private int er;
    private mf0[] g3;
    private long gW;
    private final yf0 gn;
    private bf0 j3;
    private long kQ;
    private ByteBuffer lg;
    private boolean lp;
    private int nw;
    private int rN;
    private int ro;
    private long sG;
    private long sh;
    private int sy;
    private AudioTrack tp;
    private final LinkedList<dg0> u7;
    private final cg0 v5;
    private float vJ;
    private boolean vy;
    private int we;
    private byte[] x9;
    private int yS;
    private final lf0 j6 = null;
    private final ConditionVariable Zo = new ConditionVariable(true);

    public wf0(lf0 lf0Var, mf0[] mf0VarArr, cg0 cg0Var) {
        xf0 xf0Var = null;
        this.v5 = cg0Var;
        if (ip0.j6 >= 18) {
            try {
                this.ei = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (ip0.j6 >= 19) {
            this.gn = new zf0();
        } else {
            this.gn = new yf0(xf0Var);
        }
        this.DW = new gg0();
        this.FH = new ng0();
        mf0[] mf0VarArr2 = new mf0[mf0VarArr.length + 3];
        this.Hw = mf0VarArr2;
        mf0VarArr2[0] = new lg0();
        mf0[] mf0VarArr3 = this.Hw;
        mf0VarArr3[1] = this.DW;
        System.arraycopy(mf0VarArr, 0, mf0VarArr3, 2, mf0VarArr.length);
        this.Hw[mf0VarArr.length + 2] = this.FH;
        this.VH = new long[10];
        this.vJ = 1.0f;
        this.dx = 0;
        this.Ws = 3;
        this.OW = 0;
        this.Mr = bf0.Hw;
        this.sy = -1;
        this.g3 = new mf0[0];
        this.Mz = new ByteBuffer[0];
        this.u7 = new LinkedList<>();
    }

    private final void J8() {
        ArrayList arrayList = new ArrayList();
        for (mf0 mf0Var : this.Hw) {
            if (mf0Var.Zo()) {
                arrayList.add(mf0Var);
            } else {
                mf0Var.flush();
            }
        }
        int size = arrayList.size();
        this.g3 = (mf0[]) arrayList.toArray(new mf0[size]);
        this.Mz = new ByteBuffer[size];
        for (int i = 0; i < size; i++) {
            mf0 mf0Var2 = this.g3[i];
            mf0Var2.flush();
            this.Mz[i] = mf0Var2.Hw();
        }
    }

    private final void U2() {
        if (j6()) {
            if (ip0.j6 >= 21) {
                this.tp.setVolume(this.vJ);
                return;
            }
            AudioTrack audioTrack = this.tp;
            float f = this.vJ;
            audioTrack.setStereoVolume(f, f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0032 -> B:9:0x0012). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean XL() throws com.google.android.gms.internal.ads.fg0 {
        /*
            r9 = this;
            int r0 = r9.sy
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L14
            boolean r0 = r9.QX
            if (r0 == 0) goto Lf
            com.google.android.gms.internal.ads.mf0[] r0 = r9.g3
            int r0 = r0.length
            goto L10
        Lf:
            r0 = 0
        L10:
            r9.sy = r0
        L12:
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            int r4 = r9.sy
            com.google.android.gms.internal.ads.mf0[] r5 = r9.g3
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L38
            r4 = r5[r4]
            if (r0 == 0) goto L28
            r4.gn()
        L28:
            r9.yS(r7)
            boolean r0 = r4.ro()
            if (r0 != 0) goto L32
            return r3
        L32:
            int r0 = r9.sy
            int r0 = r0 + r2
            r9.sy = r0
            goto L12
        L38:
            java.nio.ByteBuffer r0 = r9.ca
            if (r0 == 0) goto L44
            r9.we(r0, r7)
            java.nio.ByteBuffer r0 = r9.ca
            if (r0 == 0) goto L44
            return r3
        L44:
            r9.sy = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wf0.XL():boolean");
    }

    private final long a8() {
        return this.QX ? this.sh : this.cn / this.ro;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int ei(java.lang.String r5) {
        /*
            int r0 = r5.hashCode()
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1095064472: goto L2a;
                case 187078296: goto L20;
                case 1504578661: goto L16;
                case 1505942594: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L34
        Lc:
            java.lang.String r0 = "audio/vnd.dts.hd"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L34
            r5 = 3
            goto L35
        L16:
            java.lang.String r0 = "audio/eac3"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L34
            r5 = 1
            goto L35
        L20:
            java.lang.String r0 = "audio/ac3"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L34
            r5 = 0
            goto L35
        L2a:
            java.lang.String r0 = "audio/vnd.dts"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L34
            r5 = 2
            goto L35
        L34:
            r5 = -1
        L35:
            if (r5 == 0) goto L45
            if (r5 == r4) goto L43
            if (r5 == r3) goto L41
            if (r5 == r2) goto L3e
            return r1
        L3e:
            r5 = 8
            return r5
        L41:
            r5 = 7
            return r5
        L43:
            r5 = 6
            return r5
        L45:
            r5 = 5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wf0.ei(java.lang.String):int");
    }

    private final long gW(long j) {
        return (j * 1000000) / this.EQ;
    }

    private final boolean j6() {
        return this.tp != null;
    }

    private final void lg() {
        this.gW = 0L;
        this.yS = 0;
        this.er = 0;
        this.BT = 0L;
        this.vy = false;
        this.P8 = 0L;
    }

    private final boolean rN() {
        if (ip0.j6 >= 23) {
            return false;
        }
        int i = this.J8;
        return i == 5 || i == 6;
    }

    private final long vy(long j) {
        return (j * this.EQ) / 1000000;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean we(java.nio.ByteBuffer r9, long r10) throws com.google.android.gms.internal.ads.fg0 {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wf0.we(java.nio.ByteBuffer, long):boolean");
    }

    private final void yS(long j) throws fg0 {
        ByteBuffer byteBuffer;
        int length = this.g3.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.Mz[i - 1];
            } else {
                byteBuffer = this.I;
                if (byteBuffer == null) {
                    byteBuffer = mf0.j6;
                }
            }
            if (i == length) {
                we(byteBuffer, j);
            } else {
                mf0 mf0Var = this.g3[i];
                mf0Var.u7(byteBuffer);
                ByteBuffer byteBufferHw = mf0Var.Hw();
                this.Mz[i] = byteBufferHw;
                if (byteBufferHw.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i--;
            }
        }
    }

    public final void BT(int i) throws IllegalStateException {
        ro0.Hw(ip0.j6 >= 21);
        if (this.br && this.OW == i) {
            return;
        }
        this.br = true;
        this.OW = i;
        v5();
    }

    public final void DW() {
        this.lp = false;
        if (j6()) {
            lg();
            this.gn.j6();
        }
    }

    public final bf0 EQ(bf0 bf0Var) {
        if (this.QX) {
            bf0 bf0Var2 = bf0.Hw;
            this.Mr = bf0Var2;
            return bf0Var2;
        }
        float fJ6 = this.FH.j6(bf0Var.j6);
        ng0 ng0Var = this.FH;
        float f = bf0Var.DW;
        ng0Var.tp(f);
        bf0 bf0Var3 = new bf0(fJ6, f);
        bf0 bf0Var4 = this.j3;
        if (bf0Var4 == null) {
            bf0Var4 = !this.u7.isEmpty() ? this.u7.getLast().j6 : this.Mr;
        }
        if (!bf0Var3.equals(bf0Var4)) {
            if (j6()) {
                this.j3 = bf0Var3;
            } else {
                this.Mr = bf0Var3;
            }
        }
        return this.Mr;
    }

    public final void FH() throws IllegalStateException {
        this.lp = true;
        if (j6()) {
            this.ef = System.nanoTime() / 1000;
            this.tp.play();
        }
    }

    public final void Hw() throws IllegalStateException {
        v5();
        for (mf0 mf0Var : this.Hw) {
            mf0Var.DW();
        }
        this.OW = 0;
        this.lp = false;
    }

    public final boolean J0() {
        if (j6()) {
            return this.aj && !aM();
        }
        return true;
    }

    public final void Mr() throws IllegalStateException {
        if (this.br) {
            this.br = false;
            this.OW = 0;
            v5();
        }
    }

    public final boolean P8(String str) {
        lf0 lf0Var = this.j6;
        if (lf0Var == null) {
            return false;
        }
        lf0Var.j6(ei(str));
        throw null;
    }

    public final void QX() {
        if (!this.aj && j6() && XL()) {
            this.gn.gn(a8());
            this.rN = 0;
            this.aj = true;
        }
    }

    public final void VH(float f) {
        if (this.vJ != f) {
            this.vJ = f;
            U2();
        }
    }

    public final void Ws() {
        if (this.dx == 1) {
            this.dx = 2;
        }
    }

    public final void Zo(int i) throws IllegalStateException {
        if (this.Ws == i) {
            return;
        }
        this.Ws = i;
        if (this.br) {
            return;
        }
        v5();
        this.OW = 0;
    }

    public final boolean aM() {
        if (j6()) {
            if (a8() <= this.gn.FH()) {
                if (rN() && this.tp.getPlayState() == 2 && this.tp.getPlaybackHeadPosition() == 0) {
                }
            }
            return true;
        }
        return false;
    }

    public final long er(boolean z) {
        long jHw;
        long j;
        long jHw2;
        long j2;
        if (!(j6() && this.dx != 0)) {
            return Long.MIN_VALUE;
        }
        if (this.tp.getPlayState() == 3) {
            long jHw3 = this.gn.Hw();
            if (jHw3 != 0) {
                long jNanoTime = System.nanoTime() / 1000;
                if (jNanoTime - this.BT >= 30000) {
                    long[] jArr = this.VH;
                    int i = this.er;
                    jArr[i] = jHw3 - jNanoTime;
                    this.er = (i + 1) % 10;
                    int i2 = this.yS;
                    if (i2 < 10) {
                        this.yS = i2 + 1;
                    }
                    this.BT = jNanoTime;
                    this.gW = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.yS;
                        if (i3 >= i4) {
                            break;
                        }
                        this.gW += this.VH[i3] / i4;
                        i3++;
                    }
                }
                if (!rN() && jNanoTime - this.P8 >= 500000) {
                    boolean zV5 = this.gn.v5();
                    this.vy = zV5;
                    if (zV5) {
                        long jZo = this.gn.Zo() / 1000;
                        long jVH = this.gn.VH();
                        if (jZo < this.ef) {
                            this.vy = false;
                        } else if (Math.abs(jZo - jNanoTime) > 5000000) {
                            StringBuilder sb = new StringBuilder(136);
                            sb.append("Spurious audio timestamp (system clock mismatch): ");
                            sb.append(jVH);
                            sb.append(", ");
                            sb.append(jZo);
                            sb.append(", ");
                            sb.append(jNanoTime);
                            sb.append(", ");
                            sb.append(jHw3);
                            Log.w("AudioTrack", sb.toString());
                            this.vy = false;
                        } else if (Math.abs(gW(jVH) - jHw3) > 5000000) {
                            StringBuilder sb2 = new StringBuilder(138);
                            sb2.append("Spurious audio timestamp (frame position mismatch): ");
                            sb2.append(jVH);
                            sb2.append(", ");
                            sb2.append(jZo);
                            sb2.append(", ");
                            sb2.append(jNanoTime);
                            sb2.append(", ");
                            sb2.append(jHw3);
                            Log.w("AudioTrack", sb2.toString());
                            this.vy = false;
                        }
                    }
                    if (this.ei != null && !this.QX) {
                        try {
                            long jIntValue = (((Integer) r1.invoke(this.tp, null)).intValue() * 1000) - this.aM;
                            this.Sf = jIntValue;
                            long jMax = Math.max(jIntValue, 0L);
                            this.Sf = jMax;
                            if (jMax > 5000000) {
                                StringBuilder sb3 = new StringBuilder(61);
                                sb3.append("Ignoring impossibly large audio latency: ");
                                sb3.append(jMax);
                                Log.w("AudioTrack", sb3.toString());
                                this.Sf = 0L;
                            }
                        } catch (Exception unused) {
                            this.ei = null;
                        }
                    }
                    this.P8 = jNanoTime;
                }
            }
        }
        long jNanoTime2 = System.nanoTime() / 1000;
        if (this.vy) {
            jHw = gW(this.gn.VH() + vy(jNanoTime2 - (this.gn.Zo() / 1000)));
        } else {
            jHw = this.yS == 0 ? this.gn.Hw() : jNanoTime2 + this.gW;
            if (!z) {
                jHw -= this.Sf;
            }
        }
        long j3 = this.sG;
        while (!this.u7.isEmpty() && jHw >= this.u7.getFirst().FH) {
            dg0 dg0VarRemove = this.u7.remove();
            this.Mr = dg0VarRemove.j6;
            this.a8 = dg0VarRemove.FH;
            this.U2 = dg0VarRemove.DW - this.sG;
        }
        if (this.Mr.j6 == 1.0f) {
            j2 = (jHw + this.U2) - this.a8;
        } else {
            if (!this.u7.isEmpty() || this.FH.we() < 1024) {
                j = this.U2;
                double d = this.Mr.j6;
                double d2 = jHw - this.a8;
                Double.isNaN(d);
                Double.isNaN(d2);
                jHw2 = (long) (d * d2);
            } else {
                j = this.U2;
                jHw2 = ip0.Hw(jHw - this.a8, this.FH.EQ(), this.FH.we());
            }
            j2 = jHw2 + j;
        }
        return j3 + j2;
    }

    public final bf0 j3() {
        return this.Mr;
    }

    public final boolean tp(ByteBuffer byteBuffer, long j) throws fg0, IllegalStateException, bg0 {
        int i;
        int iJ6;
        ByteBuffer byteBuffer2 = this.I;
        ro0.j6(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (!j6()) {
            this.Zo.block();
            if (this.br) {
                this.tp = new AudioTrack(new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(16).build(), new AudioFormat.Builder().setChannelMask(this.we).setEncoding(this.J8).setSampleRate(this.EQ).build(), this.XL, 1, this.OW);
            } else if (this.OW == 0) {
                this.tp = new AudioTrack(this.Ws, this.EQ, this.we, this.J8, this.XL, 1);
            } else {
                this.tp = new AudioTrack(this.Ws, this.EQ, this.we, this.J8, this.XL, 1, this.OW);
            }
            int state = this.tp.getState();
            if (state != 1) {
                try {
                    this.tp.release();
                } catch (Exception unused) {
                } finally {
                    this.tp = null;
                }
                throw new bg0(state, this.EQ, this.we, this.XL);
            }
            int audioSessionId = this.tp.getAudioSessionId();
            if (this.OW != audioSessionId) {
                this.OW = audioSessionId;
                this.v5.DW(audioSessionId);
            }
            this.gn.DW(this.tp, rN());
            U2();
            this.XX = false;
            if (this.lp) {
                FH();
            }
        }
        if (rN()) {
            if (this.tp.getPlayState() == 2) {
                this.XX = false;
                return false;
            }
            if (this.tp.getPlayState() == 1 && this.gn.FH() != 0) {
                return false;
            }
        }
        boolean z = this.XX;
        boolean zAM = aM();
        this.XX = zAM;
        if (z && !zAM && this.tp.getPlayState() != 1) {
            this.v5.FH(this.XL, ie0.j6(this.aM), SystemClock.elapsedRealtime() - this.kQ);
        }
        if (this.I == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.QX && this.cb == 0) {
                int i2 = this.J8;
                if (i2 == 7 || i2 == 8) {
                    iJ6 = hg0.j6(byteBuffer);
                } else if (i2 == 5) {
                    iJ6 = kf0.FH();
                } else {
                    if (i2 != 6) {
                        StringBuilder sb = new StringBuilder(38);
                        sb.append("Unexpected audio encoding: ");
                        sb.append(i2);
                        throw new IllegalStateException(sb.toString());
                    }
                    iJ6 = kf0.Hw(byteBuffer);
                }
                this.cb = iJ6;
            }
            if (this.j3 != null) {
                if (!XL()) {
                    return false;
                }
                this.u7.add(new dg0(this.j3, Math.max(0L, j), gW(a8()), null));
                this.j3 = null;
                J8();
            }
            if (this.dx == 0) {
                this.sG = Math.max(0L, j);
                this.dx = 1;
            } else {
                long jGW = this.sG + gW(this.QX ? this.KD : this.SI / this.nw);
                if (this.dx != 1 || Math.abs(jGW - j) <= 200000) {
                    i = 2;
                } else {
                    StringBuilder sb2 = new StringBuilder(80);
                    sb2.append("Discontinuity detected [expected ");
                    sb2.append(jGW);
                    sb2.append(", got ");
                    sb2.append(j);
                    sb2.append("]");
                    Log.e("AudioTrack", sb2.toString());
                    i = 2;
                    this.dx = 2;
                }
                if (this.dx == i) {
                    this.sG += j - jGW;
                    this.dx = 1;
                    this.v5.j6();
                }
            }
            if (this.QX) {
                this.KD += this.cb;
            } else {
                this.SI += byteBuffer.remaining();
            }
            this.I = byteBuffer;
        }
        if (this.QX) {
            we(this.I, j);
        } else {
            yS(j);
        }
        if (this.I.hasRemaining()) {
            return false;
        }
        this.I = null;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u7(java.lang.String r8, int r9, int r10, int r11, int r12, int[] r13) throws java.lang.IllegalStateException, com.google.android.gms.internal.ads.ag0 {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wf0.u7(java.lang.String, int, int, int, int, int[]):void");
    }

    public final void v5() throws IllegalStateException {
        if (j6()) {
            this.SI = 0L;
            this.KD = 0L;
            this.cn = 0L;
            this.sh = 0L;
            this.cb = 0;
            bf0 bf0Var = this.j3;
            if (bf0Var != null) {
                this.Mr = bf0Var;
                this.j3 = null;
            } else if (!this.u7.isEmpty()) {
                this.Mr = this.u7.getLast().j6;
            }
            this.u7.clear();
            this.U2 = 0L;
            this.a8 = 0L;
            this.I = null;
            this.ca = null;
            int i = 0;
            while (true) {
                mf0[] mf0VarArr = this.g3;
                if (i >= mf0VarArr.length) {
                    break;
                }
                mf0 mf0Var = mf0VarArr[i];
                mf0Var.flush();
                this.Mz[i] = mf0Var.Hw();
                i++;
            }
            this.aj = false;
            this.sy = -1;
            this.lg = null;
            this.rN = 0;
            this.dx = 0;
            this.Sf = 0L;
            lg();
            if (this.tp.getPlayState() == 3) {
                this.tp.pause();
            }
            AudioTrack audioTrack = this.tp;
            this.tp = null;
            this.gn.DW(null, false);
            this.Zo.close();
            new xf0(this, audioTrack).start();
        }
    }
}
