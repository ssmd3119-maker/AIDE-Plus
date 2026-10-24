package abcd;

/* loaded from: classes.dex */
public class yn0 extends sn0 {
    private int Hw;
    private int VH;
    private int Zo;
    private int gn;
    private int tp;
    private int[] u7 = new int[16];
    private int v5;

    public yn0() {
        DW();
    }

    private int EQ(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    private int J0(int i, int i2, int i3) {
        return ((i ^ (-1)) & i3) | (i2 & i);
    }

    private int J8(int i, int i2, int i3) {
        return (i | (i2 ^ (-1))) ^ i3;
    }

    private int QX(int i, int i2, int i3) {
        return i ^ (i2 | (i3 ^ (-1)));
    }

    private int Ws(int i, int i2, int i3) {
        return (i & i3) | (i2 & (i3 ^ (-1)));
    }

    private void XL(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    private int we(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    @Override // abcd.sn0, abcd.on0
    public void DW() {
        super.DW();
        this.Hw = 1732584193;
        this.v5 = -271733879;
        this.Zo = -1732584194;
        this.VH = 271733878;
        this.gn = -1009589776;
        this.tp = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.u7;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    @Override // abcd.on0
    public int Hw(byte[] bArr, int i) {
        VH();
        XL(this.Hw, bArr, i);
        XL(this.v5, bArr, i + 4);
        XL(this.Zo, bArr, i + 8);
        XL(this.VH, bArr, i + 12);
        XL(this.gn, bArr, i + 16);
        DW();
        return 20;
    }

    @Override // abcd.on0
    public int Zo() {
        return 20;
    }

    @Override // abcd.sn0
    public void gn() {
        int i = this.Hw;
        int i2 = this.v5;
        int i3 = this.Zo;
        int i4 = this.VH;
        int i5 = this.gn;
        int iEQ = EQ(we(i2, i3, i4) + i + this.u7[0], 11) + i5;
        int iEQ2 = EQ(i3, 10);
        int iEQ3 = EQ(we(iEQ, i2, iEQ2) + i5 + this.u7[1], 14) + i4;
        int iEQ4 = EQ(i2, 10);
        int iEQ5 = EQ(we(iEQ3, iEQ, iEQ4) + i4 + this.u7[2], 15) + iEQ2;
        int iEQ6 = EQ(iEQ, 10);
        int iEQ7 = EQ(iEQ2 + we(iEQ5, iEQ3, iEQ6) + this.u7[3], 12) + iEQ4;
        int iEQ8 = EQ(iEQ3, 10);
        int iEQ9 = EQ(iEQ4 + we(iEQ7, iEQ5, iEQ8) + this.u7[4], 5) + iEQ6;
        int iEQ10 = EQ(iEQ5, 10);
        int iEQ11 = EQ(iEQ6 + we(iEQ9, iEQ7, iEQ10) + this.u7[5], 8) + iEQ8;
        int iEQ12 = EQ(iEQ7, 10);
        int iEQ13 = EQ(iEQ8 + we(iEQ11, iEQ9, iEQ12) + this.u7[6], 7) + iEQ10;
        int iEQ14 = EQ(iEQ9, 10);
        int iEQ15 = EQ(iEQ10 + we(iEQ13, iEQ11, iEQ14) + this.u7[7], 9) + iEQ12;
        int iEQ16 = EQ(iEQ11, 10);
        int iEQ17 = EQ(iEQ12 + we(iEQ15, iEQ13, iEQ16) + this.u7[8], 11) + iEQ14;
        int iEQ18 = EQ(iEQ13, 10);
        int iEQ19 = EQ(iEQ14 + we(iEQ17, iEQ15, iEQ18) + this.u7[9], 13) + iEQ16;
        int iEQ20 = EQ(iEQ15, 10);
        int iEQ21 = EQ(iEQ16 + we(iEQ19, iEQ17, iEQ20) + this.u7[10], 14) + iEQ18;
        int iEQ22 = EQ(iEQ17, 10);
        int iEQ23 = EQ(iEQ18 + we(iEQ21, iEQ19, iEQ22) + this.u7[11], 15) + iEQ20;
        int iEQ24 = EQ(iEQ19, 10);
        int iEQ25 = EQ(iEQ20 + we(iEQ23, iEQ21, iEQ24) + this.u7[12], 6) + iEQ22;
        int iEQ26 = EQ(iEQ21, 10);
        int iEQ27 = EQ(iEQ22 + we(iEQ25, iEQ23, iEQ26) + this.u7[13], 7) + iEQ24;
        int iEQ28 = EQ(iEQ23, 10);
        int iEQ29 = EQ(iEQ24 + we(iEQ27, iEQ25, iEQ28) + this.u7[14], 9) + iEQ26;
        int iEQ30 = EQ(iEQ25, 10);
        int iEQ31 = EQ(iEQ26 + we(iEQ29, iEQ27, iEQ30) + this.u7[15], 8) + iEQ28;
        int iEQ32 = EQ(iEQ27, 10);
        int iEQ33 = EQ(i + QX(i2, i3, i4) + this.u7[5] + 1352829926, 8) + i5;
        int iEQ34 = EQ(i3, 10);
        int iEQ35 = EQ(i5 + QX(iEQ33, i2, iEQ34) + this.u7[14] + 1352829926, 9) + i4;
        int iEQ36 = EQ(i2, 10);
        int iEQ37 = EQ(i4 + QX(iEQ35, iEQ33, iEQ36) + this.u7[7] + 1352829926, 9) + iEQ34;
        int iEQ38 = EQ(iEQ33, 10);
        int iEQ39 = EQ(iEQ34 + QX(iEQ37, iEQ35, iEQ38) + this.u7[0] + 1352829926, 11) + iEQ36;
        int iEQ40 = EQ(iEQ35, 10);
        int iEQ41 = EQ(iEQ36 + QX(iEQ39, iEQ37, iEQ40) + this.u7[9] + 1352829926, 13) + iEQ38;
        int iEQ42 = EQ(iEQ37, 10);
        int iEQ43 = EQ(iEQ38 + QX(iEQ41, iEQ39, iEQ42) + this.u7[2] + 1352829926, 15) + iEQ40;
        int iEQ44 = EQ(iEQ39, 10);
        int iEQ45 = EQ(iEQ40 + QX(iEQ43, iEQ41, iEQ44) + this.u7[11] + 1352829926, 15) + iEQ42;
        int iEQ46 = EQ(iEQ41, 10);
        int iEQ47 = EQ(iEQ42 + QX(iEQ45, iEQ43, iEQ46) + this.u7[4] + 1352829926, 5) + iEQ44;
        int iEQ48 = EQ(iEQ43, 10);
        int iEQ49 = EQ(iEQ44 + QX(iEQ47, iEQ45, iEQ48) + this.u7[13] + 1352829926, 7) + iEQ46;
        int iEQ50 = EQ(iEQ45, 10);
        int iEQ51 = EQ(iEQ46 + QX(iEQ49, iEQ47, iEQ50) + this.u7[6] + 1352829926, 7) + iEQ48;
        int iEQ52 = EQ(iEQ47, 10);
        int iEQ53 = EQ(iEQ48 + QX(iEQ51, iEQ49, iEQ52) + this.u7[15] + 1352829926, 8) + iEQ50;
        int iEQ54 = EQ(iEQ49, 10);
        int iEQ55 = EQ(iEQ50 + QX(iEQ53, iEQ51, iEQ54) + this.u7[8] + 1352829926, 11) + iEQ52;
        int iEQ56 = EQ(iEQ51, 10);
        int iEQ57 = EQ(iEQ52 + QX(iEQ55, iEQ53, iEQ56) + this.u7[1] + 1352829926, 14) + iEQ54;
        int iEQ58 = EQ(iEQ53, 10);
        int iEQ59 = EQ(iEQ54 + QX(iEQ57, iEQ55, iEQ58) + this.u7[10] + 1352829926, 14) + iEQ56;
        int iEQ60 = EQ(iEQ55, 10);
        int iEQ61 = EQ(iEQ56 + QX(iEQ59, iEQ57, iEQ60) + this.u7[3] + 1352829926, 12) + iEQ58;
        int iEQ62 = EQ(iEQ57, 10);
        int iEQ63 = EQ(iEQ58 + QX(iEQ61, iEQ59, iEQ62) + this.u7[12] + 1352829926, 6) + iEQ60;
        int iEQ64 = EQ(iEQ59, 10);
        int iEQ65 = EQ(iEQ28 + J0(iEQ31, iEQ29, iEQ32) + this.u7[7] + 1518500249, 7) + iEQ30;
        int iEQ66 = EQ(iEQ29, 10);
        int iEQ67 = EQ(iEQ30 + J0(iEQ65, iEQ31, iEQ66) + this.u7[4] + 1518500249, 6) + iEQ32;
        int iEQ68 = EQ(iEQ31, 10);
        int iEQ69 = EQ(iEQ32 + J0(iEQ67, iEQ65, iEQ68) + this.u7[13] + 1518500249, 8) + iEQ66;
        int iEQ70 = EQ(iEQ65, 10);
        int iEQ71 = EQ(iEQ66 + J0(iEQ69, iEQ67, iEQ70) + this.u7[1] + 1518500249, 13) + iEQ68;
        int iEQ72 = EQ(iEQ67, 10);
        int iEQ73 = EQ(iEQ68 + J0(iEQ71, iEQ69, iEQ72) + this.u7[10] + 1518500249, 11) + iEQ70;
        int iEQ74 = EQ(iEQ69, 10);
        int iEQ75 = EQ(iEQ70 + J0(iEQ73, iEQ71, iEQ74) + this.u7[6] + 1518500249, 9) + iEQ72;
        int iEQ76 = EQ(iEQ71, 10);
        int iEQ77 = EQ(iEQ72 + J0(iEQ75, iEQ73, iEQ76) + this.u7[15] + 1518500249, 7) + iEQ74;
        int iEQ78 = EQ(iEQ73, 10);
        int iEQ79 = EQ(iEQ74 + J0(iEQ77, iEQ75, iEQ78) + this.u7[3] + 1518500249, 15) + iEQ76;
        int iEQ80 = EQ(iEQ75, 10);
        int iEQ81 = EQ(iEQ76 + J0(iEQ79, iEQ77, iEQ80) + this.u7[12] + 1518500249, 7) + iEQ78;
        int iEQ82 = EQ(iEQ77, 10);
        int iEQ83 = EQ(iEQ78 + J0(iEQ81, iEQ79, iEQ82) + this.u7[0] + 1518500249, 12) + iEQ80;
        int iEQ84 = EQ(iEQ79, 10);
        int iEQ85 = EQ(iEQ80 + J0(iEQ83, iEQ81, iEQ84) + this.u7[9] + 1518500249, 15) + iEQ82;
        int iEQ86 = EQ(iEQ81, 10);
        int iEQ87 = EQ(iEQ82 + J0(iEQ85, iEQ83, iEQ86) + this.u7[5] + 1518500249, 9) + iEQ84;
        int iEQ88 = EQ(iEQ83, 10);
        int iEQ89 = EQ(iEQ84 + J0(iEQ87, iEQ85, iEQ88) + this.u7[2] + 1518500249, 11) + iEQ86;
        int iEQ90 = EQ(iEQ85, 10);
        int iEQ91 = EQ(iEQ86 + J0(iEQ89, iEQ87, iEQ90) + this.u7[14] + 1518500249, 7) + iEQ88;
        int iEQ92 = EQ(iEQ87, 10);
        int iEQ93 = EQ(iEQ88 + J0(iEQ91, iEQ89, iEQ92) + this.u7[11] + 1518500249, 13) + iEQ90;
        int iEQ94 = EQ(iEQ89, 10);
        int iEQ95 = EQ(iEQ90 + J0(iEQ93, iEQ91, iEQ94) + this.u7[8] + 1518500249, 12) + iEQ92;
        int iEQ96 = EQ(iEQ91, 10);
        int iEQ97 = EQ(iEQ60 + Ws(iEQ63, iEQ61, iEQ64) + this.u7[6] + 1548603684, 9) + iEQ62;
        int iEQ98 = EQ(iEQ61, 10);
        int iEQ99 = EQ(iEQ62 + Ws(iEQ97, iEQ63, iEQ98) + this.u7[11] + 1548603684, 13) + iEQ64;
        int iEQ100 = EQ(iEQ63, 10);
        int iEQ101 = EQ(iEQ64 + Ws(iEQ99, iEQ97, iEQ100) + this.u7[3] + 1548603684, 15) + iEQ98;
        int iEQ102 = EQ(iEQ97, 10);
        int iEQ103 = EQ(iEQ98 + Ws(iEQ101, iEQ99, iEQ102) + this.u7[7] + 1548603684, 7) + iEQ100;
        int iEQ104 = EQ(iEQ99, 10);
        int iEQ105 = EQ(iEQ100 + Ws(iEQ103, iEQ101, iEQ104) + this.u7[0] + 1548603684, 12) + iEQ102;
        int iEQ106 = EQ(iEQ101, 10);
        int iEQ107 = EQ(iEQ102 + Ws(iEQ105, iEQ103, iEQ106) + this.u7[13] + 1548603684, 8) + iEQ104;
        int iEQ108 = EQ(iEQ103, 10);
        int iEQ109 = EQ(iEQ104 + Ws(iEQ107, iEQ105, iEQ108) + this.u7[5] + 1548603684, 9) + iEQ106;
        int iEQ110 = EQ(iEQ105, 10);
        int iEQ111 = EQ(iEQ106 + Ws(iEQ109, iEQ107, iEQ110) + this.u7[10] + 1548603684, 11) + iEQ108;
        int iEQ112 = EQ(iEQ107, 10);
        int iEQ113 = EQ(iEQ108 + Ws(iEQ111, iEQ109, iEQ112) + this.u7[14] + 1548603684, 7) + iEQ110;
        int iEQ114 = EQ(iEQ109, 10);
        int iEQ115 = EQ(iEQ110 + Ws(iEQ113, iEQ111, iEQ114) + this.u7[15] + 1548603684, 7) + iEQ112;
        int iEQ116 = EQ(iEQ111, 10);
        int iEQ117 = EQ(iEQ112 + Ws(iEQ115, iEQ113, iEQ116) + this.u7[8] + 1548603684, 12) + iEQ114;
        int iEQ118 = EQ(iEQ113, 10);
        int iEQ119 = EQ(iEQ114 + Ws(iEQ117, iEQ115, iEQ118) + this.u7[12] + 1548603684, 7) + iEQ116;
        int iEQ120 = EQ(iEQ115, 10);
        int iEQ121 = EQ(iEQ116 + Ws(iEQ119, iEQ117, iEQ120) + this.u7[4] + 1548603684, 6) + iEQ118;
        int iEQ122 = EQ(iEQ117, 10);
        int iEQ123 = EQ(iEQ118 + Ws(iEQ121, iEQ119, iEQ122) + this.u7[9] + 1548603684, 15) + iEQ120;
        int iEQ124 = EQ(iEQ119, 10);
        int iEQ125 = EQ(iEQ120 + Ws(iEQ123, iEQ121, iEQ124) + this.u7[1] + 1548603684, 13) + iEQ122;
        int iEQ126 = EQ(iEQ121, 10);
        int iEQ127 = EQ(iEQ122 + Ws(iEQ125, iEQ123, iEQ126) + this.u7[2] + 1548603684, 11) + iEQ124;
        int iEQ128 = EQ(iEQ123, 10);
        int iEQ129 = EQ(iEQ92 + J8(iEQ95, iEQ93, iEQ96) + this.u7[3] + 1859775393, 11) + iEQ94;
        int iEQ130 = EQ(iEQ93, 10);
        int iEQ131 = EQ(iEQ94 + J8(iEQ129, iEQ95, iEQ130) + this.u7[10] + 1859775393, 13) + iEQ96;
        int iEQ132 = EQ(iEQ95, 10);
        int iEQ133 = EQ(iEQ96 + J8(iEQ131, iEQ129, iEQ132) + this.u7[14] + 1859775393, 6) + iEQ130;
        int iEQ134 = EQ(iEQ129, 10);
        int iEQ135 = EQ(iEQ130 + J8(iEQ133, iEQ131, iEQ134) + this.u7[4] + 1859775393, 7) + iEQ132;
        int iEQ136 = EQ(iEQ131, 10);
        int iEQ137 = EQ(iEQ132 + J8(iEQ135, iEQ133, iEQ136) + this.u7[9] + 1859775393, 14) + iEQ134;
        int iEQ138 = EQ(iEQ133, 10);
        int iEQ139 = EQ(iEQ134 + J8(iEQ137, iEQ135, iEQ138) + this.u7[15] + 1859775393, 9) + iEQ136;
        int iEQ140 = EQ(iEQ135, 10);
        int iEQ141 = EQ(iEQ136 + J8(iEQ139, iEQ137, iEQ140) + this.u7[8] + 1859775393, 13) + iEQ138;
        int iEQ142 = EQ(iEQ137, 10);
        int iEQ143 = EQ(iEQ138 + J8(iEQ141, iEQ139, iEQ142) + this.u7[1] + 1859775393, 15) + iEQ140;
        int iEQ144 = EQ(iEQ139, 10);
        int iEQ145 = EQ(iEQ140 + J8(iEQ143, iEQ141, iEQ144) + this.u7[2] + 1859775393, 14) + iEQ142;
        int iEQ146 = EQ(iEQ141, 10);
        int iEQ147 = EQ(iEQ142 + J8(iEQ145, iEQ143, iEQ146) + this.u7[7] + 1859775393, 8) + iEQ144;
        int iEQ148 = EQ(iEQ143, 10);
        int iEQ149 = EQ(iEQ144 + J8(iEQ147, iEQ145, iEQ148) + this.u7[0] + 1859775393, 13) + iEQ146;
        int iEQ150 = EQ(iEQ145, 10);
        int iEQ151 = EQ(iEQ146 + J8(iEQ149, iEQ147, iEQ150) + this.u7[6] + 1859775393, 6) + iEQ148;
        int iEQ152 = EQ(iEQ147, 10);
        int iEQ153 = EQ(iEQ148 + J8(iEQ151, iEQ149, iEQ152) + this.u7[13] + 1859775393, 5) + iEQ150;
        int iEQ154 = EQ(iEQ149, 10);
        int iEQ155 = EQ(iEQ150 + J8(iEQ153, iEQ151, iEQ154) + this.u7[11] + 1859775393, 12) + iEQ152;
        int iEQ156 = EQ(iEQ151, 10);
        int iEQ157 = EQ(iEQ152 + J8(iEQ155, iEQ153, iEQ156) + this.u7[5] + 1859775393, 7) + iEQ154;
        int iEQ158 = EQ(iEQ153, 10);
        int iEQ159 = EQ(iEQ154 + J8(iEQ157, iEQ155, iEQ158) + this.u7[12] + 1859775393, 5) + iEQ156;
        int iEQ160 = EQ(iEQ155, 10);
        int iEQ161 = EQ(iEQ124 + J8(iEQ127, iEQ125, iEQ128) + this.u7[15] + 1836072691, 9) + iEQ126;
        int iEQ162 = EQ(iEQ125, 10);
        int iEQ163 = EQ(iEQ126 + J8(iEQ161, iEQ127, iEQ162) + this.u7[5] + 1836072691, 7) + iEQ128;
        int iEQ164 = EQ(iEQ127, 10);
        int iEQ165 = EQ(iEQ128 + J8(iEQ163, iEQ161, iEQ164) + this.u7[1] + 1836072691, 15) + iEQ162;
        int iEQ166 = EQ(iEQ161, 10);
        int iEQ167 = EQ(iEQ162 + J8(iEQ165, iEQ163, iEQ166) + this.u7[3] + 1836072691, 11) + iEQ164;
        int iEQ168 = EQ(iEQ163, 10);
        int iEQ169 = EQ(iEQ164 + J8(iEQ167, iEQ165, iEQ168) + this.u7[7] + 1836072691, 8) + iEQ166;
        int iEQ170 = EQ(iEQ165, 10);
        int iEQ171 = EQ(iEQ166 + J8(iEQ169, iEQ167, iEQ170) + this.u7[14] + 1836072691, 6) + iEQ168;
        int iEQ172 = EQ(iEQ167, 10);
        int iEQ173 = EQ(iEQ168 + J8(iEQ171, iEQ169, iEQ172) + this.u7[6] + 1836072691, 6) + iEQ170;
        int iEQ174 = EQ(iEQ169, 10);
        int iEQ175 = EQ(iEQ170 + J8(iEQ173, iEQ171, iEQ174) + this.u7[9] + 1836072691, 14) + iEQ172;
        int iEQ176 = EQ(iEQ171, 10);
        int iEQ177 = EQ(iEQ172 + J8(iEQ175, iEQ173, iEQ176) + this.u7[11] + 1836072691, 12) + iEQ174;
        int iEQ178 = EQ(iEQ173, 10);
        int iEQ179 = EQ(iEQ174 + J8(iEQ177, iEQ175, iEQ178) + this.u7[8] + 1836072691, 13) + iEQ176;
        int iEQ180 = EQ(iEQ175, 10);
        int iEQ181 = EQ(iEQ176 + J8(iEQ179, iEQ177, iEQ180) + this.u7[12] + 1836072691, 5) + iEQ178;
        int iEQ182 = EQ(iEQ177, 10);
        int iEQ183 = EQ(iEQ178 + J8(iEQ181, iEQ179, iEQ182) + this.u7[2] + 1836072691, 14) + iEQ180;
        int iEQ184 = EQ(iEQ179, 10);
        int iEQ185 = EQ(iEQ180 + J8(iEQ183, iEQ181, iEQ184) + this.u7[10] + 1836072691, 13) + iEQ182;
        int iEQ186 = EQ(iEQ181, 10);
        int iEQ187 = EQ(iEQ182 + J8(iEQ185, iEQ183, iEQ186) + this.u7[0] + 1836072691, 13) + iEQ184;
        int iEQ188 = EQ(iEQ183, 10);
        int iEQ189 = EQ(iEQ184 + J8(iEQ187, iEQ185, iEQ188) + this.u7[4] + 1836072691, 7) + iEQ186;
        int iEQ190 = EQ(iEQ185, 10);
        int iEQ191 = EQ(iEQ186 + J8(iEQ189, iEQ187, iEQ190) + this.u7[13] + 1836072691, 5) + iEQ188;
        int iEQ192 = EQ(iEQ187, 10);
        int iEQ193 = EQ(((iEQ156 + Ws(iEQ159, iEQ157, iEQ160)) + this.u7[1]) - 1894007588, 11) + iEQ158;
        int iEQ194 = EQ(iEQ157, 10);
        int iEQ195 = EQ(((iEQ158 + Ws(iEQ193, iEQ159, iEQ194)) + this.u7[9]) - 1894007588, 12) + iEQ160;
        int iEQ196 = EQ(iEQ159, 10);
        int iEQ197 = EQ(((iEQ160 + Ws(iEQ195, iEQ193, iEQ196)) + this.u7[11]) - 1894007588, 14) + iEQ194;
        int iEQ198 = EQ(iEQ193, 10);
        int iEQ199 = EQ(((iEQ194 + Ws(iEQ197, iEQ195, iEQ198)) + this.u7[10]) - 1894007588, 15) + iEQ196;
        int iEQ200 = EQ(iEQ195, 10);
        int iEQ201 = EQ(((iEQ196 + Ws(iEQ199, iEQ197, iEQ200)) + this.u7[0]) - 1894007588, 14) + iEQ198;
        int iEQ202 = EQ(iEQ197, 10);
        int iEQ203 = EQ(((iEQ198 + Ws(iEQ201, iEQ199, iEQ202)) + this.u7[8]) - 1894007588, 15) + iEQ200;
        int iEQ204 = EQ(iEQ199, 10);
        int iEQ205 = EQ(((iEQ200 + Ws(iEQ203, iEQ201, iEQ204)) + this.u7[12]) - 1894007588, 9) + iEQ202;
        int iEQ206 = EQ(iEQ201, 10);
        int iEQ207 = EQ(((iEQ202 + Ws(iEQ205, iEQ203, iEQ206)) + this.u7[4]) - 1894007588, 8) + iEQ204;
        int iEQ208 = EQ(iEQ203, 10);
        int iEQ209 = EQ(((iEQ204 + Ws(iEQ207, iEQ205, iEQ208)) + this.u7[13]) - 1894007588, 9) + iEQ206;
        int iEQ210 = EQ(iEQ205, 10);
        int iEQ211 = EQ(((iEQ206 + Ws(iEQ209, iEQ207, iEQ210)) + this.u7[3]) - 1894007588, 14) + iEQ208;
        int iEQ212 = EQ(iEQ207, 10);
        int iEQ213 = EQ(((iEQ208 + Ws(iEQ211, iEQ209, iEQ212)) + this.u7[7]) - 1894007588, 5) + iEQ210;
        int iEQ214 = EQ(iEQ209, 10);
        int iEQ215 = EQ(((iEQ210 + Ws(iEQ213, iEQ211, iEQ214)) + this.u7[15]) - 1894007588, 6) + iEQ212;
        int iEQ216 = EQ(iEQ211, 10);
        int iEQ217 = EQ(((iEQ212 + Ws(iEQ215, iEQ213, iEQ216)) + this.u7[14]) - 1894007588, 8) + iEQ214;
        int iEQ218 = EQ(iEQ213, 10);
        int iEQ219 = EQ(((iEQ214 + Ws(iEQ217, iEQ215, iEQ218)) + this.u7[5]) - 1894007588, 6) + iEQ216;
        int iEQ220 = EQ(iEQ215, 10);
        int iEQ221 = EQ(((iEQ216 + Ws(iEQ219, iEQ217, iEQ220)) + this.u7[6]) - 1894007588, 5) + iEQ218;
        int iEQ222 = EQ(iEQ217, 10);
        int iEQ223 = EQ(((iEQ218 + Ws(iEQ221, iEQ219, iEQ222)) + this.u7[2]) - 1894007588, 12) + iEQ220;
        int iEQ224 = EQ(iEQ219, 10);
        int iEQ225 = EQ(iEQ188 + J0(iEQ191, iEQ189, iEQ192) + this.u7[8] + 2053994217, 15) + iEQ190;
        int iEQ226 = EQ(iEQ189, 10);
        int iEQ227 = EQ(iEQ190 + J0(iEQ225, iEQ191, iEQ226) + this.u7[6] + 2053994217, 5) + iEQ192;
        int iEQ228 = EQ(iEQ191, 10);
        int iEQ229 = EQ(iEQ192 + J0(iEQ227, iEQ225, iEQ228) + this.u7[4] + 2053994217, 8) + iEQ226;
        int iEQ230 = EQ(iEQ225, 10);
        int iEQ231 = EQ(iEQ226 + J0(iEQ229, iEQ227, iEQ230) + this.u7[1] + 2053994217, 11) + iEQ228;
        int iEQ232 = EQ(iEQ227, 10);
        int iEQ233 = EQ(iEQ228 + J0(iEQ231, iEQ229, iEQ232) + this.u7[3] + 2053994217, 14) + iEQ230;
        int iEQ234 = EQ(iEQ229, 10);
        int iEQ235 = EQ(iEQ230 + J0(iEQ233, iEQ231, iEQ234) + this.u7[11] + 2053994217, 14) + iEQ232;
        int iEQ236 = EQ(iEQ231, 10);
        int iEQ237 = EQ(iEQ232 + J0(iEQ235, iEQ233, iEQ236) + this.u7[15] + 2053994217, 6) + iEQ234;
        int iEQ238 = EQ(iEQ233, 10);
        int iEQ239 = EQ(iEQ234 + J0(iEQ237, iEQ235, iEQ238) + this.u7[0] + 2053994217, 14) + iEQ236;
        int iEQ240 = EQ(iEQ235, 10);
        int iEQ241 = EQ(iEQ236 + J0(iEQ239, iEQ237, iEQ240) + this.u7[5] + 2053994217, 6) + iEQ238;
        int iEQ242 = EQ(iEQ237, 10);
        int iEQ243 = EQ(iEQ238 + J0(iEQ241, iEQ239, iEQ242) + this.u7[12] + 2053994217, 9) + iEQ240;
        int iEQ244 = EQ(iEQ239, 10);
        int iEQ245 = EQ(iEQ240 + J0(iEQ243, iEQ241, iEQ244) + this.u7[2] + 2053994217, 12) + iEQ242;
        int iEQ246 = EQ(iEQ241, 10);
        int iEQ247 = EQ(iEQ242 + J0(iEQ245, iEQ243, iEQ246) + this.u7[13] + 2053994217, 9) + iEQ244;
        int iEQ248 = EQ(iEQ243, 10);
        int iEQ249 = EQ(iEQ244 + J0(iEQ247, iEQ245, iEQ248) + this.u7[9] + 2053994217, 12) + iEQ246;
        int iEQ250 = EQ(iEQ245, 10);
        int iEQ251 = EQ(iEQ246 + J0(iEQ249, iEQ247, iEQ250) + this.u7[7] + 2053994217, 5) + iEQ248;
        int iEQ252 = EQ(iEQ247, 10);
        int iEQ253 = EQ(iEQ248 + J0(iEQ251, iEQ249, iEQ252) + this.u7[10] + 2053994217, 15) + iEQ250;
        int iEQ254 = EQ(iEQ249, 10);
        int iEQ255 = EQ(iEQ250 + J0(iEQ253, iEQ251, iEQ254) + this.u7[14] + 2053994217, 8) + iEQ252;
        int iEQ256 = EQ(iEQ251, 10);
        int iEQ257 = EQ(((iEQ220 + QX(iEQ223, iEQ221, iEQ224)) + this.u7[4]) - 1454113458, 9) + iEQ222;
        int iEQ258 = EQ(iEQ221, 10);
        int iEQ259 = EQ(((iEQ222 + QX(iEQ257, iEQ223, iEQ258)) + this.u7[0]) - 1454113458, 15) + iEQ224;
        int iEQ260 = EQ(iEQ223, 10);
        int iEQ261 = EQ(((iEQ224 + QX(iEQ259, iEQ257, iEQ260)) + this.u7[5]) - 1454113458, 5) + iEQ258;
        int iEQ262 = EQ(iEQ257, 10);
        int iEQ263 = EQ(((iEQ258 + QX(iEQ261, iEQ259, iEQ262)) + this.u7[9]) - 1454113458, 11) + iEQ260;
        int iEQ264 = EQ(iEQ259, 10);
        int iEQ265 = EQ(((iEQ260 + QX(iEQ263, iEQ261, iEQ264)) + this.u7[7]) - 1454113458, 6) + iEQ262;
        int iEQ266 = EQ(iEQ261, 10);
        int iEQ267 = EQ(((iEQ262 + QX(iEQ265, iEQ263, iEQ266)) + this.u7[12]) - 1454113458, 8) + iEQ264;
        int iEQ268 = EQ(iEQ263, 10);
        int iEQ269 = EQ(((iEQ264 + QX(iEQ267, iEQ265, iEQ268)) + this.u7[2]) - 1454113458, 13) + iEQ266;
        int iEQ270 = EQ(iEQ265, 10);
        int iEQ271 = EQ(((iEQ266 + QX(iEQ269, iEQ267, iEQ270)) + this.u7[10]) - 1454113458, 12) + iEQ268;
        int iEQ272 = EQ(iEQ267, 10);
        int iEQ273 = EQ(((iEQ268 + QX(iEQ271, iEQ269, iEQ272)) + this.u7[14]) - 1454113458, 5) + iEQ270;
        int iEQ274 = EQ(iEQ269, 10);
        int iEQ275 = EQ(((iEQ270 + QX(iEQ273, iEQ271, iEQ274)) + this.u7[1]) - 1454113458, 12) + iEQ272;
        int iEQ276 = EQ(iEQ271, 10);
        int iEQ277 = EQ(((iEQ272 + QX(iEQ275, iEQ273, iEQ276)) + this.u7[3]) - 1454113458, 13) + iEQ274;
        int iEQ278 = EQ(iEQ273, 10);
        int iEQ279 = EQ(((iEQ274 + QX(iEQ277, iEQ275, iEQ278)) + this.u7[8]) - 1454113458, 14) + iEQ276;
        int iEQ280 = EQ(iEQ275, 10);
        int iEQ281 = EQ(((iEQ276 + QX(iEQ279, iEQ277, iEQ280)) + this.u7[11]) - 1454113458, 11) + iEQ278;
        int iEQ282 = EQ(iEQ277, 10);
        int iEQ283 = EQ(((iEQ278 + QX(iEQ281, iEQ279, iEQ282)) + this.u7[6]) - 1454113458, 8) + iEQ280;
        int iEQ284 = EQ(iEQ279, 10);
        int iEQ285 = EQ(((iEQ280 + QX(iEQ283, iEQ281, iEQ284)) + this.u7[15]) - 1454113458, 5) + iEQ282;
        int iEQ286 = EQ(iEQ281, 10);
        int iEQ287 = EQ(((iEQ282 + QX(iEQ285, iEQ283, iEQ286)) + this.u7[13]) - 1454113458, 6) + iEQ284;
        int iEQ288 = EQ(iEQ283, 10);
        int iEQ289 = EQ(iEQ252 + we(iEQ255, iEQ253, iEQ256) + this.u7[12], 8) + iEQ254;
        int iEQ290 = EQ(iEQ253, 10);
        int iEQ291 = EQ(iEQ254 + we(iEQ289, iEQ255, iEQ290) + this.u7[15], 5) + iEQ256;
        int iEQ292 = EQ(iEQ255, 10);
        int iEQ293 = EQ(iEQ256 + we(iEQ291, iEQ289, iEQ292) + this.u7[10], 12) + iEQ290;
        int iEQ294 = EQ(iEQ289, 10);
        int iEQ295 = EQ(iEQ290 + we(iEQ293, iEQ291, iEQ294) + this.u7[4], 9) + iEQ292;
        int iEQ296 = EQ(iEQ291, 10);
        int iEQ297 = EQ(iEQ292 + we(iEQ295, iEQ293, iEQ296) + this.u7[1], 12) + iEQ294;
        int iEQ298 = EQ(iEQ293, 10);
        int iEQ299 = EQ(iEQ294 + we(iEQ297, iEQ295, iEQ298) + this.u7[5], 5) + iEQ296;
        int iEQ300 = EQ(iEQ295, 10);
        int iEQ301 = EQ(iEQ296 + we(iEQ299, iEQ297, iEQ300) + this.u7[8], 14) + iEQ298;
        int iEQ302 = EQ(iEQ297, 10);
        int iEQ303 = EQ(iEQ298 + we(iEQ301, iEQ299, iEQ302) + this.u7[7], 6) + iEQ300;
        int iEQ304 = EQ(iEQ299, 10);
        int iEQ305 = EQ(iEQ300 + we(iEQ303, iEQ301, iEQ304) + this.u7[6], 8) + iEQ302;
        int iEQ306 = EQ(iEQ301, 10);
        int iEQ307 = EQ(iEQ302 + we(iEQ305, iEQ303, iEQ306) + this.u7[2], 13) + iEQ304;
        int iEQ308 = EQ(iEQ303, 10);
        int iEQ309 = EQ(iEQ304 + we(iEQ307, iEQ305, iEQ308) + this.u7[13], 6) + iEQ306;
        int iEQ310 = EQ(iEQ305, 10);
        int iEQ311 = EQ(iEQ306 + we(iEQ309, iEQ307, iEQ310) + this.u7[14], 5) + iEQ308;
        int iEQ312 = EQ(iEQ307, 10);
        int iEQ313 = EQ(iEQ308 + we(iEQ311, iEQ309, iEQ312) + this.u7[0], 15) + iEQ310;
        int iEQ314 = EQ(iEQ309, 10);
        int iEQ315 = EQ(iEQ310 + we(iEQ313, iEQ311, iEQ314) + this.u7[3], 13) + iEQ312;
        int iEQ316 = EQ(iEQ311, 10);
        int iEQ317 = EQ(iEQ312 + we(iEQ315, iEQ313, iEQ316) + this.u7[9], 11) + iEQ314;
        int iEQ318 = EQ(iEQ313, 10);
        int iEQ319 = EQ(iEQ314 + we(iEQ317, iEQ315, iEQ318) + this.u7[11], 11) + iEQ316;
        int iEQ320 = EQ(iEQ315, 10) + iEQ285 + this.v5;
        this.v5 = this.Zo + iEQ288 + iEQ318;
        this.Zo = this.VH + iEQ286 + iEQ316;
        this.VH = this.gn + iEQ284 + iEQ319;
        this.gn = this.Hw + iEQ287 + iEQ317;
        this.Hw = iEQ320;
        this.tp = 0;
        int i6 = 0;
        while (true) {
            int[] iArr = this.u7;
            if (i6 == iArr.length) {
                return;
            }
            iArr[i6] = 0;
            i6++;
        }
    }

    @Override // abcd.sn0
    public void tp(byte[] bArr, int i) {
        int[] iArr = this.u7;
        int i2 = this.tp;
        int i3 = i2 + 1;
        this.tp = i3;
        iArr[i2] = ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        if (i3 == 16) {
            gn();
        }
    }

    @Override // abcd.sn0
    public void u7(long j) {
        if (this.tp > 14) {
            gn();
        }
        int[] iArr = this.u7;
        iArr[14] = (int) ((-1) & j);
        iArr[15] = (int) (j >>> 32);
    }

    @Override // abcd.on0
    public String v5() {
        return "RIPEMD160";
    }
}
