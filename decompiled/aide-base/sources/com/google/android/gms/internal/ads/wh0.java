package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class wh0 {
    public float BT;
    public int DW;
    public int EQ;
    public int FH;
    public int Hw;
    public int J0;
    public int J8;
    public int KD;
    public int Mr;
    public float P8;
    public int QX;
    public int SI;
    public int Sf;
    public int U2;
    public nh0 VH;
    public byte[] Ws;
    public boolean XL;
    public byte[] Zo;
    public int a8;
    public int aM;
    public boolean cb;
    public long cn;
    public boolean dx;
    public mh0 ef;
    public float ei;
    public float er;
    public float gW;
    public byte[] gn;
    public int j3;
    public String j6;
    public float lg;
    public float nw;
    public float rN;
    public int ro;
    private String sG;
    public long sh;
    public int tp;
    public zzhp u7;
    public boolean v5;
    public float vy;
    public int we;
    public float yS;

    private wh0() {
        this.tp = -1;
        this.EQ = -1;
        this.we = -1;
        this.J0 = -1;
        this.J8 = 0;
        this.Ws = null;
        this.QX = -1;
        this.XL = false;
        this.aM = -1;
        this.j3 = -1;
        this.Mr = -1;
        this.U2 = 1000;
        this.a8 = 200;
        this.lg = -1.0f;
        this.rN = -1.0f;
        this.er = -1.0f;
        this.yS = -1.0f;
        this.gW = -1.0f;
        this.BT = -1.0f;
        this.vy = -1.0f;
        this.P8 = -1.0f;
        this.ei = -1.0f;
        this.nw = -1.0f;
        this.SI = 1;
        this.KD = -1;
        this.ro = 8000;
        this.cn = 0L;
        this.sh = 0L;
        this.dx = true;
        this.sG = "eng";
    }

    private static List<byte[]> DW(ap0 ap0Var) throws af0 {
        try {
            ap0Var.J0(16);
            if (ap0Var.Mr() != 826496599) {
                return null;
            }
            byte[] bArr = ap0Var.j6;
            for (int iDW = ap0Var.DW() + 20; iDW < bArr.length - 4; iDW++) {
                if (bArr[iDW] == 0 && bArr[iDW + 1] == 0 && bArr[iDW + 2] == 1 && bArr[iDW + 3] == 15) {
                    return Collections.singletonList(Arrays.copyOfRange(bArr, iDW, bArr.length));
                }
            }
            throw new af0("Failed to find FourCC VC1 initialization data");
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new af0("Error parsing FourCC VC1 codec private");
        }
    }

    private static boolean Hw(ap0 ap0Var) throws af0 {
        try {
            int iAM = ap0Var.aM();
            if (iAM == 1) {
                return true;
            }
            if (iAM == 65534) {
                ap0Var.EQ(24);
                if (ap0Var.v5() == th0.br.getMostSignificantBits()) {
                    if (ap0Var.v5() == th0.br.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new af0("Error parsing MS/ACM codec private");
        }
    }

    private static List<byte[]> v5(byte[] bArr) throws af0 {
        try {
            if (bArr[0] != 2) {
                throw new af0("Error parsing vorbis codec private");
            }
            int i = 1;
            int i2 = 0;
            while (bArr[i] == -1) {
                i2 += 255;
                i++;
            }
            int i3 = i + 1;
            int i4 = i2 + bArr[i];
            int i5 = 0;
            while (bArr[i3] == -1) {
                i5 += 255;
                i3++;
            }
            int i6 = i3 + 1;
            int i7 = i5 + bArr[i3];
            if (bArr[i6] != 1) {
                throw new af0("Error parsing vorbis codec private");
            }
            byte[] bArr2 = new byte[i4];
            System.arraycopy(bArr, i6, bArr2, 0, i4);
            int i8 = i6 + i4;
            if (bArr[i8] != 3) {
                throw new af0("Error parsing vorbis codec private");
            }
            int i9 = i8 + i7;
            if (bArr[i9] != 5) {
                throw new af0("Error parsing vorbis codec private");
            }
            byte[] bArr3 = new byte[bArr.length - i9];
            System.arraycopy(bArr, i9, bArr3, 0, bArr.length - i9);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new af0("Error parsing vorbis codec private");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:149:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FH(com.google.android.gms.internal.ads.gh0 r43, int r44) throws com.google.android.gms.internal.ads.af0 {
        /*
            Method dump skipped, instructions count: 1422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wh0.FH(com.google.android.gms.internal.ads.gh0, int):void");
    }

    /* synthetic */ wh0(uh0 uh0Var) {
        this();
    }
}
