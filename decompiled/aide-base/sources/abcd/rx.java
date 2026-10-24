package abcd;

import com.aide.uidesigner.ProxyTextView;

/* loaded from: classes.dex */
public final class rx implements Cloneable {
    private static final String[] hp;
    private static final a[] xg;
    byte AL;
    int AR;
    int Bx;
    int Cz;
    int Fd;
    int Gj;
    int IS;
    int Jl;
    short Lz;
    byte[] MP;
    int Of;
    int PT;
    short[] Q6;
    int QO;
    int TI;
    zx WB;
    byte[] Z1;
    int a5;
    int aX;
    int b1;
    int cT;
    int ct;
    int e3;
    int e9;
    int eU;
    int fN;
    int fY;
    int hK;
    int iW;
    byte[] jw;
    int k2;
    short[] kf;
    int mb;
    int n5;
    int oa;
    int oy;
    int pN;
    int pO;
    int q7;
    int qp;
    int sE;
    int sM;
    int sT;
    int sg;
    int w9;
    int ys;
    int zh = 1;
    yx AE = new yx();
    yx Za = new yx();
    yx An = new yx();
    short[] Pa = new short[16];
    short[] ce = new short[16];
    int[] Jm = new int[573];
    byte[] qP = new byte[573];
    sx E4 = null;
    short[] gG = new short[1146];
    short[] Nh = new short[122];
    short[] BR = new short[78];

    static class a {
        int DW;
        int FH;
        int Hw;
        int j6;
        int v5;

        public a(int i, int i2, int i3, int i4, int i5) {
            this.j6 = i;
            this.DW = i2;
            this.FH = i3;
            this.Hw = i4;
            this.v5 = i5;
        }
    }

    static {
        a[] aVarArr = new a[10];
        xg = aVarArr;
        aVarArr[0] = new a(0, 0, 0, 0, 0);
        xg[1] = new a(4, 4, 8, 4, 1);
        xg[2] = new a(4, 5, 16, 8, 1);
        xg[3] = new a(4, 6, 32, 32, 1);
        xg[4] = new a(4, 4, 16, 16, 2);
        xg[5] = new a(8, 16, 32, 32, 2);
        xg[6] = new a(8, 16, 128, 128, 2);
        xg[7] = new a(8, 32, 128, 256, 2);
        xg[8] = new a(32, 128, 258, 1024, 2);
        xg[9] = new a(32, 258, 258, 4096, 2);
        hp = new String[]{"need dictionary", "stream end", "", "file error", "stream error", "data error", "insufficient memory", "buffer error", "incompatible version", ""};
    }

    public rx(zx zxVar) {
        this.WB = zxVar;
    }

    public static boolean I(short[] sArr, int i, int i2, byte[] bArr) {
        short s = sArr[i * 2];
        short s2 = sArr[i2 * 2];
        if (s >= s2) {
            return s == s2 && bArr[i] <= bArr[i2];
        }
        return true;
    }

    private int J8(int i, int i2, int i3, int i4, int i5) {
        int i6;
        this.WB.u7 = null;
        if (i == -1) {
            i = 6;
        }
        if (i3 < 0) {
            i6 = 0;
            i3 = -i3;
        } else if (i3 > 15) {
            i3 -= 16;
            this.WB.J0 = new px();
            i6 = 2;
        } else {
            i6 = 1;
        }
        if (i4 < 1 || i4 > 9 || i2 != 8 || i3 < 9 || i3 > 15 || i < 0 || i > 9 || i5 < 0 || i5 > 2) {
            return -2;
        }
        this.WB.tp = this;
        this.zh = i6;
        this.cT = i3;
        int i7 = 1 << i3;
        this.hK = i7;
        this.q7 = i7 - 1;
        int i8 = i4 + 7;
        this.eU = i8;
        int i9 = 1 << i8;
        this.iW = i9;
        this.e3 = i9 - 1;
        this.sE = ((i8 + 3) - 1) / 3;
        this.Z1 = new byte[i7 * 2];
        this.Q6 = new short[i7];
        this.kf = new short[i9];
        int i10 = 1 << (i4 + 6);
        this.Of = i10;
        this.jw = new byte[i10 * 3];
        this.fY = i10 * 3;
        this.b1 = i10;
        this.MP = new byte[i10];
        this.sM = i;
        this.a5 = i5;
        return Ws();
    }

    private short[] er(short[] sArr) {
        int length = sArr.length;
        short[] sArr2 = new short[length];
        System.arraycopy(sArr, 0, sArr2, 0, length);
        return sArr2;
    }

    private byte[] lg(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private int[] rN(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    public synchronized sx BT() {
        if (this.E4 == null) {
            this.E4 = new sx();
        }
        return this.E4;
    }

    public void EQ(int i, int i2, boolean z) {
        gn();
        this.Fd = 8;
        if (z) {
            dx((short) i2);
            dx((short) (i2 ^ (-1)));
        }
        cb(this.Z1, i, i2);
    }

    public void FH(int i, int i2, boolean z) {
        int i3;
        int iU7;
        int i4;
        if (this.sM > 0) {
            if (this.AL == 2) {
                Mz();
            }
            this.AE.DW(this);
            this.Za.DW(this);
            iU7 = u7();
            i3 = ((this.AR + 3) + 7) >>> 3;
            i4 = ((this.TI + 3) + 7) >>> 3;
            if (i4 <= i3) {
                i3 = i4;
            }
        } else {
            i3 = i2 + 5;
            iU7 = 0;
            i4 = i3;
        }
        if (i2 + 4 <= i3 && i != -1) {
            Hw(i, i2, z);
        } else if (i4 == i3) {
            Sf((z ? 1 : 0) + 2, 3);
            tp(xx.Zo, xx.VH);
        } else {
            Sf((z ? 1 : 0) + 4, 3);
            ef(this.AE.DW + 1, this.Za.DW + 1, iU7 + 1);
            tp(this.gG, this.Nh);
        }
        P8();
        if (z) {
            gn();
        }
    }

    public void Hw(int i, int i2, boolean z) {
        Sf((z ? 1 : 0) + 0, 3);
        EQ(i, i2, true);
    }

    public int J0(int i, int i2) {
        return J8(i, 8, i2, 8, 0);
    }

    public void Mz() {
        int i = 0;
        int i2 = 0;
        while (i < 7) {
            i2 += this.gG[i * 2];
            i++;
        }
        int i3 = 0;
        while (i < 128) {
            i3 += this.gG[i * 2];
            i++;
        }
        while (i < 256) {
            i2 += this.gG[i * 2];
            i++;
        }
        this.AL = (byte) (i2 <= (i3 >>> 2) ? 1 : 0);
    }

    public void P8() {
        for (int i = 0; i < 286; i++) {
            this.gG[i * 2] = 0;
        }
        for (int i2 = 0; i2 < 30; i2++) {
            this.Nh[i2 * 2] = 0;
        }
        for (int i3 = 0; i3 < 19; i3++) {
            this.BR[i3 * 2] = 0;
        }
        this.gG[512] = 1;
        this.TI = 0;
        this.AR = 0;
        this.ct = 0;
        this.PT = 0;
    }

    public void SI(short[] sArr, int i) {
        int i2 = this.Jm[i];
        int i3 = i << 1;
        while (true) {
            int i4 = this.Bx;
            if (i3 > i4) {
                break;
            }
            if (i3 < i4) {
                int[] iArr = this.Jm;
                int i5 = i3 + 1;
                if (I(sArr, iArr[i5], iArr[i3], this.qP)) {
                    i3 = i5;
                }
            }
            if (I(sArr, i2, this.Jm[i3], this.qP)) {
                break;
            }
            int[] iArr2 = this.Jm;
            iArr2[i] = iArr2[i3];
            int i6 = i3;
            i3 <<= 1;
            i = i6;
        }
        this.Jm[i] = i2;
    }

    public void Sf(int i, int i2) {
        int i3 = this.sT;
        if (i3 <= 16 - i2) {
            this.Lz = (short) (((i << i3) & 65535) | this.Lz);
            this.sT = i3 + i2;
            return;
        }
        short s = (short) (((i << i3) & 65535) | this.Lz);
        this.Lz = s;
        dx(s);
        int i4 = this.sT;
        this.Lz = (short) (i >>> (16 - i4));
        this.sT = i4 + (i2 - 16);
    }

    public int U2(int i) {
        int i2 = this.fY;
        int i3 = 65535 > i2 + (-5) ? i2 - 5 : 65535;
        while (true) {
            if (this.oy <= 1) {
                yS();
                if (this.oy == 0 && i == 0) {
                    return 0;
                }
                if (this.oy == 0) {
                    gW(i == 4);
                    return this.WB.VH == 0 ? i == 4 ? 2 : 0 : i == 4 ? 3 : 1;
                }
            }
            int i4 = this.Cz + this.oy;
            this.Cz = i4;
            this.oy = 0;
            int i5 = this.sg + i3;
            if (i4 == 0 || i4 >= i5) {
                this.oy = this.Cz - i5;
                this.Cz = i5;
                gW(false);
                if (this.WB.VH == 0) {
                    return 0;
                }
            }
            if (this.Cz - this.sg >= this.hK - 262) {
                gW(false);
                if (this.WB.VH == 0) {
                    return 0;
                }
            }
        }
    }

    public void VH() {
        int i = this.sT;
        if (i == 16) {
            dx(this.Lz);
            this.Lz = (short) 0;
            this.sT = 0;
        } else if (i >= 8) {
            sh((byte) this.Lz);
            this.Lz = (short) (this.Lz >>> 8);
            this.sT -= 8;
        }
    }

    public int Ws() {
        zx zxVar = this.WB;
        zxVar.gn = 0L;
        zxVar.Hw = 0L;
        zxVar.u7 = null;
        zxVar.we = 2;
        this.k2 = 0;
        this.qp = 0;
        int i = this.zh;
        if (i < 0) {
            this.zh = -i;
        }
        this.mb = this.zh == 0 ? ProxyTextView.INPUTTYPE_textPostalAddress : 42;
        this.WB.J0.DW();
        this.w9 = 0;
        ca();
        ei();
        return 0;
    }

    public int XL(int i) {
        boolean zZo;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        while (true) {
            if (this.oy < 262) {
                yS();
                if (this.oy < 262 && i == 0) {
                    return 0;
                }
                if (this.oy == 0) {
                    gW(i == 4);
                    return this.WB.VH == 0 ? i == 4 ? 2 : 0 : i == 4 ? 3 : 1;
                }
            }
            if (this.oy >= 3) {
                int i6 = this.Jl << this.sE;
                byte[] bArr = this.Z1;
                int i7 = this.Cz;
                int i8 = (i6 ^ (bArr[i7 + 2] & 255)) & this.e3;
                this.Jl = i8;
                short[] sArr = this.kf;
                int i9 = sArr[i8] & 65535;
                this.Q6[this.q7 & i7] = sArr[i8];
                sArr[i8] = (short) i7;
                i5 = i9;
            }
            if (i5 != 0 && ((this.Cz - i5) & 65535) <= this.hK - 262 && this.a5 != 2) {
                this.pO = nw(i5);
            }
            int i10 = this.pO;
            if (i10 >= 3) {
                zZo = Zo(this.Cz - this.pN, i10 - 3);
                int i11 = this.oy;
                int i12 = this.pO;
                int i13 = i11 - i12;
                this.oy = i13;
                if (i12 > this.QO || i13 < 3) {
                    int i14 = this.Cz + this.pO;
                    this.Cz = i14;
                    this.pO = 0;
                    byte[] bArr2 = this.Z1;
                    int i15 = bArr2[i14] & 255;
                    this.Jl = i15;
                    this.Jl = ((bArr2[i14 + 1] & 255) ^ (i15 << this.sE)) & this.e3;
                } else {
                    this.pO = i12 - 1;
                    do {
                        i2 = this.Cz + 1;
                        this.Cz = i2;
                        int i16 = ((this.Jl << this.sE) ^ (this.Z1[i2 + 2] & 255)) & this.e3;
                        this.Jl = i16;
                        short[] sArr2 = this.kf;
                        i3 = sArr2[i16] & 65535;
                        this.Q6[this.q7 & i2] = sArr2[i16];
                        sArr2[i16] = (short) i2;
                        i4 = this.pO - 1;
                        this.pO = i4;
                    } while (i4 != 0);
                    this.Cz = i2 + 1;
                    i5 = i3;
                }
            } else {
                zZo = Zo(0, this.Z1[this.Cz] & 255);
                this.oy--;
                this.Cz++;
            }
            if (zZo) {
                gW(false);
                if (this.WB.VH == 0) {
                    return 0;
                }
            }
        }
    }

    public boolean Zo(int i, int i2) {
        byte[] bArr = this.jw;
        int i3 = this.b1;
        int i4 = this.PT;
        bArr[(i4 * 2) + i3] = (byte) (i >>> 8);
        bArr[i3 + (i4 * 2) + 1] = (byte) i;
        this.MP[i4] = (byte) i2;
        this.PT = i4 + 1;
        if (i == 0) {
            short[] sArr = this.gG;
            int i5 = i2 * 2;
            sArr[i5] = (short) (sArr[i5] + 1);
        } else {
            this.ct++;
            short[] sArr2 = this.gG;
            int i6 = (yx.u7[i2] + 256 + 1) * 2;
            sArr2[i6] = (short) (sArr2[i6] + 1);
            short[] sArr3 = this.Nh;
            int iFH = yx.FH(i - 1) * 2;
            sArr3[iFH] = (short) (sArr3[iFH] + 1);
        }
        int i7 = this.PT;
        if ((i7 & 8191) == 0 && this.sM > 2) {
            int i8 = i7 * 8;
            int i9 = this.Cz - this.sg;
            for (int i10 = 0; i10 < 30; i10++) {
                i8 = (int) (i8 + (this.Nh[i10 * 2] * (yx.v5[i10] + 5)));
            }
            int i11 = i8 >>> 3;
            if (this.ct < this.PT / 2 && i11 < i9 / 2) {
                return true;
            }
        }
        return this.PT == this.Of - 1;
    }

    public void ca() {
        yx yxVar = this.AE;
        yxVar.j6 = this.gG;
        yxVar.FH = xx.gn;
        yx yxVar2 = this.Za;
        yxVar2.j6 = this.Nh;
        yxVar2.FH = xx.u7;
        yx yxVar3 = this.An;
        yxVar3.j6 = this.BR;
        yxVar3.FH = xx.tp;
        this.Lz = (short) 0;
        this.sT = 0;
        this.Fd = 8;
        P8();
    }

    public final void cb(byte[] bArr, int i, int i2) {
        System.arraycopy(bArr, i, this.jw, this.k2, i2);
        this.k2 += i2;
    }

    public Object clone() {
        rx rxVar = (rx) super.clone();
        rxVar.jw = lg(rxVar.jw);
        rxVar.b1 = rxVar.b1;
        rxVar.MP = lg(rxVar.MP);
        rxVar.Z1 = lg(rxVar.Z1);
        rxVar.Q6 = er(rxVar.Q6);
        rxVar.kf = er(rxVar.kf);
        rxVar.gG = er(rxVar.gG);
        rxVar.Nh = er(rxVar.Nh);
        rxVar.BR = er(rxVar.BR);
        rxVar.Pa = er(rxVar.Pa);
        rxVar.ce = er(rxVar.ce);
        rxVar.Jm = rN(rxVar.Jm);
        rxVar.qP = lg(rxVar.qP);
        rxVar.AE.j6 = rxVar.gG;
        rxVar.Za.j6 = rxVar.Nh;
        rxVar.An.j6 = rxVar.BR;
        sx sxVar = rxVar.E4;
        if (sxVar != null) {
            rxVar.E4 = (sx) sxVar.clone();
        }
        return rxVar;
    }

    public final void cn(int i) {
        sh((byte) (i >> 8));
        sh((byte) i);
    }

    public final void dx(int i) {
        sh((byte) i);
        sh((byte) (i >>> 8));
    }

    public void ef(int i, int i2, int i3) {
        Sf(i - 257, 5);
        int i4 = i2 - 1;
        Sf(i4, 5);
        Sf(i3 - 4, 4);
        for (int i5 = 0; i5 < i3; i5++) {
            Sf(this.BR[(yx.VH[i5] * 2) + 1], 3);
        }
        g3(this.gG, i - 1);
        g3(this.Nh, i4);
    }

    public void ei() {
        this.n5 = this.hK * 2;
        this.kf[this.iW - 1] = 0;
        for (int i = 0; i < this.iW - 1; i++) {
            this.kf[i] = 0;
        }
        a[] aVarArr = xg;
        int i2 = this.sM;
        this.QO = aVarArr[i2].DW;
        this.ys = aVarArr[i2].j6;
        this.IS = aVarArr[i2].FH;
        this.e9 = aVarArr[i2].Hw;
        this.Cz = 0;
        this.sg = 0;
        this.oy = 0;
        this.aX = 2;
        this.pO = 2;
        this.Gj = 0;
        this.Jl = 0;
    }

    public void g3(short[] sArr, int i) {
        int i2;
        int i3;
        short s = sArr[1];
        if (s == 0) {
            i2 = 138;
            i3 = 3;
        } else {
            i2 = 7;
            i3 = 4;
        }
        int i4 = 0;
        int i5 = 0;
        short s2 = -1;
        while (i4 <= i) {
            i4++;
            short s3 = sArr[(i4 * 2) + 1];
            i5++;
            if (i5 >= i2 || s != s3) {
                if (i5 < i3) {
                    do {
                        vJ(s, this.BR);
                        i5--;
                    } while (i5 != 0);
                } else if (s != 0) {
                    if (s != s2) {
                        vJ(s, this.BR);
                        i5--;
                    }
                    vJ(16, this.BR);
                    Sf(i5 - 3, 2);
                } else if (i5 <= 10) {
                    vJ(17, this.BR);
                    Sf(i5 - 3, 3);
                } else {
                    vJ(18, this.BR);
                    Sf(i5 - 11, 7);
                }
                if (s3 == 0) {
                    s2 = s;
                    i2 = 138;
                } else if (s == s3) {
                    i2 = 6;
                    s2 = s;
                } else {
                    s2 = s;
                    i2 = 7;
                    i3 = 4;
                    i5 = 0;
                }
                i3 = 3;
                i5 = 0;
            }
            s = s3;
        }
    }

    public void gW(boolean z) {
        int i = this.sg;
        if (i < 0) {
            i = -1;
        }
        FH(i, this.Cz - this.sg, z);
        this.sg = this.Cz;
        this.WB.v5();
    }

    public void gn() {
        int i = this.sT;
        if (i > 8) {
            dx(this.Lz);
        } else if (i > 0) {
            sh((byte) this.Lz);
        }
        this.Lz = (short) 0;
        this.sT = 0;
    }

    public int j3(int i) {
        int i2;
        int i3 = 0;
        while (true) {
            if (this.oy < 262) {
                yS();
                if (this.oy < 262 && i == 0) {
                    return 0;
                }
                if (this.oy == 0) {
                    if (this.Gj != 0) {
                        Zo(0, this.Z1[this.Cz - 1] & 255);
                        this.Gj = 0;
                    }
                    gW(i == 4);
                    return this.WB.VH == 0 ? i == 4 ? 2 : 0 : i == 4 ? 3 : 1;
                }
            }
            if (this.oy >= 3) {
                int i4 = this.Jl << this.sE;
                byte[] bArr = this.Z1;
                int i5 = this.Cz;
                int i6 = (i4 ^ (bArr[i5 + 2] & 255)) & this.e3;
                this.Jl = i6;
                short[] sArr = this.kf;
                int i7 = sArr[i6] & 65535;
                this.Q6[this.q7 & i5] = sArr[i6];
                sArr[i6] = (short) i5;
                i3 = i7;
            }
            int i8 = this.pO;
            this.aX = i8;
            this.fN = this.pN;
            this.pO = 2;
            if (i3 != 0 && i8 < this.QO && ((this.Cz - i3) & 65535) <= this.hK - 262) {
                if (this.a5 != 2) {
                    this.pO = nw(i3);
                }
                int i9 = this.pO;
                if (i9 <= 5 && (this.a5 == 1 || (i9 == 3 && this.Cz - this.pN > 4096))) {
                    this.pO = 2;
                }
            }
            int i10 = this.aX;
            if (i10 >= 3 && this.pO <= i10) {
                int i11 = this.Cz;
                int i12 = (this.oy + i11) - 3;
                boolean zZo = Zo((i11 - 1) - this.fN, i10 - 3);
                int i13 = this.oy;
                int i14 = this.aX;
                this.oy = i13 - (i14 - 1);
                this.aX = i14 - 2;
                do {
                    int i15 = this.Cz + 1;
                    this.Cz = i15;
                    if (i15 <= i12) {
                        int i16 = ((this.Jl << this.sE) ^ (this.Z1[i15 + 2] & 255)) & this.e3;
                        this.Jl = i16;
                        short[] sArr2 = this.kf;
                        int i17 = sArr2[i16] & 65535;
                        this.Q6[this.q7 & i15] = sArr2[i16];
                        sArr2[i16] = (short) i15;
                        i3 = i17;
                    }
                    i2 = this.aX - 1;
                    this.aX = i2;
                } while (i2 != 0);
                this.Gj = 0;
                this.pO = 2;
                this.Cz++;
                if (zZo) {
                    gW(false);
                    if (this.WB.VH == 0) {
                        return 0;
                    }
                } else {
                    continue;
                }
            } else if (this.Gj != 0) {
                if (Zo(0, this.Z1[this.Cz - 1] & 255)) {
                    gW(false);
                }
                this.Cz++;
                this.oy--;
                if (this.WB.VH == 0) {
                    return 0;
                }
            } else {
                this.Gj = 1;
                this.Cz++;
                this.oy--;
            }
        }
    }

    public void j6() {
        Sf(2, 3);
        vJ(256, xx.Zo);
        VH();
        if (((this.Fd + 1) + 10) - this.sT < 9) {
            Sf(2, 3);
            vJ(256, xx.Zo);
            VH();
        }
        this.Fd = 7;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3 A[PHI: r1 r2 r7 r9
      0x00c3: PHI (r1v2 int) = (r1v1 int), (r1v1 int), (r1v1 int), (r1v1 int), (r1v11 int) binds: [B:13:0x0037, B:15:0x003d, B:17:0x0043, B:19:0x004d, B:45:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      0x00c3: PHI (r2v2 int) = (r2v1 int), (r2v1 int), (r2v1 int), (r2v1 int), (r2v3 int) binds: [B:13:0x0037, B:15:0x003d, B:17:0x0043, B:19:0x004d, B:45:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      0x00c3: PHI (r7v3 byte) = (r7v2 byte), (r7v2 byte), (r7v2 byte), (r7v2 byte), (r7v4 byte) binds: [B:13:0x0037, B:15:0x003d, B:17:0x0043, B:19:0x004d, B:45:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      0x00c3: PHI (r9v3 byte) = (r9v2 byte), (r9v2 byte), (r9v2 byte), (r9v2 byte), (r9v4 byte) binds: [B:13:0x0037, B:15:0x003d, B:17:0x0043, B:19:0x004d, B:45:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d2 A[EDGE_INSN: B:56:0x00d2->B:50:0x00d2 BREAK  A[LOOP:0: B:12:0x0031->B:59:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int nw(int r14) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.rx.nw(int):int");
    }

    public void sG(short[] sArr, int i) {
        int i2;
        int i3;
        short s = sArr[1];
        if (s == 0) {
            i2 = 138;
            i3 = 3;
        } else {
            i2 = 7;
            i3 = 4;
        }
        short s2 = -1;
        sArr[((i + 1) * 2) + 1] = -1;
        int i4 = 0;
        int i5 = 0;
        while (i4 <= i) {
            i4++;
            short s3 = sArr[(i4 * 2) + 1];
            i5++;
            if (i5 >= i2 || s != s3) {
                if (i5 < i3) {
                    short[] sArr2 = this.BR;
                    int i6 = s * 2;
                    sArr2[i6] = (short) (sArr2[i6] + i5);
                } else if (s != 0) {
                    if (s != s2) {
                        short[] sArr3 = this.BR;
                        int i7 = s * 2;
                        sArr3[i7] = (short) (sArr3[i7] + 1);
                    }
                    short[] sArr4 = this.BR;
                    sArr4[32] = (short) (sArr4[32] + 1);
                } else if (i5 <= 10) {
                    short[] sArr5 = this.BR;
                    sArr5[34] = (short) (sArr5[34] + 1);
                } else {
                    short[] sArr6 = this.BR;
                    sArr6[36] = (short) (sArr6[36] + 1);
                }
                if (s3 == 0) {
                    s2 = s;
                    i2 = 138;
                } else if (s == s3) {
                    i2 = 6;
                    s2 = s;
                } else {
                    s2 = s;
                    i2 = 7;
                    i3 = 4;
                    i5 = 0;
                }
                i3 = 3;
                i5 = 0;
            }
            s = s3;
        }
    }

    public final void sh(byte b) {
        byte[] bArr = this.jw;
        int i = this.k2;
        this.k2 = i + 1;
        bArr[i] = b;
    }

    public void tp(short[] sArr, short[] sArr2) {
        if (this.PT != 0) {
            int i = 0;
            do {
                byte[] bArr = this.jw;
                int i2 = this.b1;
                int i3 = i * 2;
                int i4 = (bArr[i2 + i3 + 1] & 255) | ((bArr[i2 + i3] << 8) & 65280);
                int i5 = this.MP[i] & 255;
                i++;
                if (i4 == 0) {
                    vJ(i5, sArr);
                } else {
                    byte b = yx.u7[i5];
                    vJ(b + 256 + 1, sArr);
                    int i6 = yx.Hw[b];
                    if (i6 != 0) {
                        Sf(i5 - yx.tp[b], i6);
                    }
                    int i7 = i4 - 1;
                    int iFH = yx.FH(i7);
                    vJ(iFH, sArr2);
                    int i8 = yx.v5[iFH];
                    if (i8 != 0) {
                        Sf(i7 - yx.EQ[iFH], i8);
                    }
                }
            } while (i < this.PT);
        }
        vJ(256, sArr);
        this.Fd = sArr[513];
    }

    public int u7() {
        sG(this.gG, this.AE.DW);
        sG(this.Nh, this.Za.DW);
        this.An.DW(this);
        int i = 18;
        while (i >= 3 && this.BR[(yx.VH[i] * 2) + 1] == 0) {
            i--;
        }
        this.AR += ((i + 1) * 3) + 5 + 5 + 4;
        return i;
    }

    public final void vJ(int i, short[] sArr) {
        int i2 = i * 2;
        Sf(sArr[i2] & 65535, sArr[i2 + 1] & 65535);
    }

    public int we(int i) {
        if (i <= 4 && i >= 0) {
            zx zxVar = this.WB;
            if (zxVar.v5 != null && ((zxVar.j6 != null || zxVar.FH == 0) && (this.mb != 666 || i == 4))) {
                zx zxVar2 = this.WB;
                if (zxVar2.VH == 0) {
                    zxVar2.u7 = hp[7];
                    return -5;
                }
                int i2 = this.w9;
                this.w9 = i;
                if (this.mb == 42) {
                    if (this.zh == 2) {
                        BT().j6(this);
                        this.mb = ProxyTextView.INPUTTYPE_textPostalAddress;
                        this.WB.J0.DW();
                    } else {
                        int i3 = (((this.cT - 8) << 4) + 8) << 8;
                        int i4 = ((this.sM - 1) & 255) >> 1;
                        if (i4 > 3) {
                            i4 = 3;
                        }
                        int i5 = i3 | (i4 << 6);
                        if (this.Cz != 0) {
                            i5 |= 32;
                        }
                        this.mb = ProxyTextView.INPUTTYPE_textPostalAddress;
                        cn(i5 + (31 - (i5 % 31)));
                        if (this.Cz != 0) {
                            long value = this.WB.J0.getValue();
                            cn((int) (value >>> 16));
                            cn((int) (value & 65535));
                        }
                        this.WB.J0.DW();
                    }
                }
                if (this.k2 != 0) {
                    this.WB.v5();
                    if (this.WB.VH == 0) {
                        this.w9 = -1;
                        return 0;
                    }
                } else {
                    zx zxVar3 = this.WB;
                    if (zxVar3.FH == 0 && i <= i2 && i != 4) {
                        zxVar3.u7 = hp[7];
                        return -5;
                    }
                }
                if (this.mb == 666) {
                    zx zxVar4 = this.WB;
                    if (zxVar4.FH != 0) {
                        zxVar4.u7 = hp[7];
                        return -5;
                    }
                }
                if (this.WB.FH != 0 || this.oy != 0 || (i != 0 && this.mb != 666)) {
                    int i6 = xg[this.sM].v5;
                    int iJ3 = i6 != 0 ? i6 != 1 ? i6 != 2 ? -1 : j3(i) : XL(i) : U2(i);
                    if (iJ3 == 2 || iJ3 == 3) {
                        this.mb = 666;
                    }
                    if (iJ3 == 0 || iJ3 == 2) {
                        if (this.WB.VH == 0) {
                            this.w9 = -1;
                        }
                        return 0;
                    }
                    if (iJ3 == 1) {
                        if (i == 1) {
                            j6();
                        } else {
                            Hw(0, 0, false);
                            if (i == 3) {
                                for (int i7 = 0; i7 < this.iW; i7++) {
                                    this.kf[i7] = 0;
                                }
                            }
                        }
                        this.WB.v5();
                        if (this.WB.VH == 0) {
                            this.w9 = -1;
                            return 0;
                        }
                    }
                }
                if (i != 4) {
                    return 0;
                }
                int i8 = this.zh;
                if (i8 <= 0) {
                    return 1;
                }
                if (i8 == 2) {
                    long value2 = this.WB.J0.getValue();
                    sh((byte) (value2 & 255));
                    sh((byte) ((value2 >> 8) & 255));
                    sh((byte) ((value2 >> 16) & 255));
                    sh((byte) ((value2 >> 24) & 255));
                    sh((byte) (this.WB.Hw & 255));
                    sh((byte) ((this.WB.Hw >> 8) & 255));
                    sh((byte) ((this.WB.Hw >> 16) & 255));
                    sh((byte) (255 & (this.WB.Hw >> 24)));
                    BT().FH(value2);
                } else {
                    long value3 = this.WB.J0.getValue();
                    cn((int) (value3 >>> 16));
                    cn((int) (value3 & 65535));
                }
                this.WB.v5();
                int i9 = this.zh;
                if (i9 > 0) {
                    this.zh = -i9;
                }
                return this.k2 != 0 ? 0 : 1;
            }
            this.WB.u7 = hp[4];
        }
        return -2;
    }

    public void yS() {
        do {
            int i = this.n5;
            int i2 = this.oy;
            int i3 = this.Cz;
            int i4 = (i - i2) - i3;
            if (i4 == 0 && i3 == 0 && i2 == 0) {
                i4 = this.hK;
            } else if (i4 == -1) {
                i4--;
            } else {
                int i5 = this.Cz;
                int i6 = this.hK;
                if (i5 >= (i6 + i6) - 262) {
                    byte[] bArr = this.Z1;
                    System.arraycopy(bArr, i6, bArr, 0, i6);
                    int i7 = this.pN;
                    int i8 = this.hK;
                    this.pN = i7 - i8;
                    this.Cz -= i8;
                    this.sg -= i8;
                    int i9 = this.iW;
                    int i10 = i9;
                    do {
                        short[] sArr = this.kf;
                        i9--;
                        int i11 = sArr[i9] & 65535;
                        int i12 = this.hK;
                        sArr[i9] = i11 >= i12 ? (short) (i11 - i12) : (short) 0;
                        i10--;
                    } while (i10 != 0);
                    int i13 = this.hK;
                    int i14 = i13;
                    do {
                        short[] sArr2 = this.Q6;
                        i13--;
                        int i15 = sArr2[i13] & 65535;
                        int i16 = this.hK;
                        sArr2[i13] = i15 >= i16 ? (short) (i15 - i16) : (short) 0;
                        i14--;
                    } while (i14 != 0);
                    i4 += this.hK;
                }
            }
            zx zxVar = this.WB;
            if (zxVar.FH == 0) {
                return;
            }
            int iTp = this.oy + zxVar.tp(this.Z1, this.Cz + this.oy, i4);
            this.oy = iTp;
            if (iTp >= 3) {
                byte[] bArr2 = this.Z1;
                int i17 = this.Cz;
                int i18 = bArr2[i17] & 255;
                this.Jl = i18;
                this.Jl = ((bArr2[i17 + 1] & 255) ^ (i18 << this.sE)) & this.e3;
            }
            if (this.oy >= 262) {
                return;
            }
        } while (this.WB.FH != 0);
    }
}
