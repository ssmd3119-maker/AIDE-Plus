package abcd;

/* loaded from: classes.dex */
public class wn0 extends sn0 {
    private int Hw;
    private int VH;
    private int Zo;
    private int[] gn = new int[16];
    private int u7;
    private int v5;

    public wn0() {
        DW();
    }

    private int EQ(int i, int i2, int i3) {
        return ((i ^ (-1)) & i3) | (i2 & i);
    }

    private int J0(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    private int J8(int i, int i2, int i3) {
        return (i | (i3 ^ (-1))) ^ i2;
    }

    private void QX(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    private int Ws(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    private int we(int i, int i2, int i3) {
        return (i & i3) | (i2 & (i3 ^ (-1)));
    }

    @Override // abcd.sn0, abcd.on0
    public void DW() {
        super.DW();
        this.Hw = 1732584193;
        this.v5 = -271733879;
        this.Zo = -1732584194;
        this.VH = 271733878;
        this.u7 = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.gn;
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
        QX(this.Hw, bArr, i);
        QX(this.v5, bArr, i + 4);
        QX(this.Zo, bArr, i + 8);
        QX(this.VH, bArr, i + 12);
        DW();
        return 16;
    }

    @Override // abcd.on0
    public int Zo() {
        return 16;
    }

    @Override // abcd.sn0
    public void gn() {
        int i = this.Hw;
        int i2 = this.v5;
        int i3 = this.Zo;
        int i4 = this.VH;
        int iWs = Ws(((i + EQ(i2, i3, i4)) + this.gn[0]) - 680876936, 7) + i2;
        int iWs2 = Ws(((i4 + EQ(iWs, i2, i3)) + this.gn[1]) - 389564586, 12) + iWs;
        int iWs3 = Ws(i3 + EQ(iWs2, iWs, i2) + this.gn[2] + 606105819, 17) + iWs2;
        int iWs4 = Ws(((i2 + EQ(iWs3, iWs2, iWs)) + this.gn[3]) - 1044525330, 22) + iWs3;
        int iWs5 = Ws(((iWs + EQ(iWs4, iWs3, iWs2)) + this.gn[4]) - 176418897, 7) + iWs4;
        int iWs6 = Ws(iWs2 + EQ(iWs5, iWs4, iWs3) + this.gn[5] + 1200080426, 12) + iWs5;
        int iWs7 = Ws(((iWs3 + EQ(iWs6, iWs5, iWs4)) + this.gn[6]) - 1473231341, 17) + iWs6;
        int iWs8 = Ws(((iWs4 + EQ(iWs7, iWs6, iWs5)) + this.gn[7]) - 45705983, 22) + iWs7;
        int iWs9 = Ws(iWs5 + EQ(iWs8, iWs7, iWs6) + this.gn[8] + 1770035416, 7) + iWs8;
        int iWs10 = Ws(((iWs6 + EQ(iWs9, iWs8, iWs7)) + this.gn[9]) - 1958414417, 12) + iWs9;
        int iWs11 = Ws(((iWs7 + EQ(iWs10, iWs9, iWs8)) + this.gn[10]) - 42063, 17) + iWs10;
        int iWs12 = Ws(((iWs8 + EQ(iWs11, iWs10, iWs9)) + this.gn[11]) - 1990404162, 22) + iWs11;
        int iWs13 = Ws(iWs9 + EQ(iWs12, iWs11, iWs10) + this.gn[12] + 1804603682, 7) + iWs12;
        int iWs14 = Ws(((iWs10 + EQ(iWs13, iWs12, iWs11)) + this.gn[13]) - 40341101, 12) + iWs13;
        int iWs15 = Ws(((iWs11 + EQ(iWs14, iWs13, iWs12)) + this.gn[14]) - 1502002290, 17) + iWs14;
        int iWs16 = Ws(iWs12 + EQ(iWs15, iWs14, iWs13) + this.gn[15] + 1236535329, 22) + iWs15;
        int iWs17 = Ws(((iWs13 + we(iWs16, iWs15, iWs14)) + this.gn[1]) - 165796510, 5) + iWs16;
        int iWs18 = Ws(((iWs14 + we(iWs17, iWs16, iWs15)) + this.gn[6]) - 1069501632, 9) + iWs17;
        int iWs19 = Ws(iWs15 + we(iWs18, iWs17, iWs16) + this.gn[11] + 643717713, 14) + iWs18;
        int iWs20 = Ws(((iWs16 + we(iWs19, iWs18, iWs17)) + this.gn[0]) - 373897302, 20) + iWs19;
        int iWs21 = Ws(((iWs17 + we(iWs20, iWs19, iWs18)) + this.gn[5]) - 701558691, 5) + iWs20;
        int iWs22 = Ws(iWs18 + we(iWs21, iWs20, iWs19) + this.gn[10] + 38016083, 9) + iWs21;
        int iWs23 = Ws(((iWs19 + we(iWs22, iWs21, iWs20)) + this.gn[15]) - 660478335, 14) + iWs22;
        int iWs24 = Ws(((iWs20 + we(iWs23, iWs22, iWs21)) + this.gn[4]) - 405537848, 20) + iWs23;
        int iWs25 = Ws(iWs21 + we(iWs24, iWs23, iWs22) + this.gn[9] + 568446438, 5) + iWs24;
        int iWs26 = Ws(((iWs22 + we(iWs25, iWs24, iWs23)) + this.gn[14]) - 1019803690, 9) + iWs25;
        int iWs27 = Ws(((iWs23 + we(iWs26, iWs25, iWs24)) + this.gn[3]) - 187363961, 14) + iWs26;
        int iWs28 = Ws(iWs24 + we(iWs27, iWs26, iWs25) + this.gn[8] + 1163531501, 20) + iWs27;
        int iWs29 = Ws(((iWs25 + we(iWs28, iWs27, iWs26)) + this.gn[13]) - 1444681467, 5) + iWs28;
        int iWs30 = Ws(((iWs26 + we(iWs29, iWs28, iWs27)) + this.gn[2]) - 51403784, 9) + iWs29;
        int iWs31 = Ws(iWs27 + we(iWs30, iWs29, iWs28) + this.gn[7] + 1735328473, 14) + iWs30;
        int iWs32 = Ws(((iWs28 + we(iWs31, iWs30, iWs29)) + this.gn[12]) - 1926607734, 20) + iWs31;
        int iWs33 = Ws(((iWs29 + J0(iWs32, iWs31, iWs30)) + this.gn[5]) - 378558, 4) + iWs32;
        int iWs34 = Ws(((iWs30 + J0(iWs33, iWs32, iWs31)) + this.gn[8]) - 2022574463, 11) + iWs33;
        int iWs35 = Ws(iWs31 + J0(iWs34, iWs33, iWs32) + this.gn[11] + 1839030562, 16) + iWs34;
        int iWs36 = Ws(((iWs32 + J0(iWs35, iWs34, iWs33)) + this.gn[14]) - 35309556, 23) + iWs35;
        int iWs37 = Ws(((iWs33 + J0(iWs36, iWs35, iWs34)) + this.gn[1]) - 1530992060, 4) + iWs36;
        int iWs38 = Ws(iWs34 + J0(iWs37, iWs36, iWs35) + this.gn[4] + 1272893353, 11) + iWs37;
        int iWs39 = Ws(((iWs35 + J0(iWs38, iWs37, iWs36)) + this.gn[7]) - 155497632, 16) + iWs38;
        int iWs40 = Ws(((iWs36 + J0(iWs39, iWs38, iWs37)) + this.gn[10]) - 1094730640, 23) + iWs39;
        int iWs41 = Ws(iWs37 + J0(iWs40, iWs39, iWs38) + this.gn[13] + 681279174, 4) + iWs40;
        int iWs42 = Ws(((iWs38 + J0(iWs41, iWs40, iWs39)) + this.gn[0]) - 358537222, 11) + iWs41;
        int iWs43 = Ws(((iWs39 + J0(iWs42, iWs41, iWs40)) + this.gn[3]) - 722521979, 16) + iWs42;
        int iWs44 = Ws(iWs40 + J0(iWs43, iWs42, iWs41) + this.gn[6] + 76029189, 23) + iWs43;
        int iWs45 = Ws(((iWs41 + J0(iWs44, iWs43, iWs42)) + this.gn[9]) - 640364487, 4) + iWs44;
        int iWs46 = Ws(((iWs42 + J0(iWs45, iWs44, iWs43)) + this.gn[12]) - 421815835, 11) + iWs45;
        int iWs47 = Ws(iWs43 + J0(iWs46, iWs45, iWs44) + this.gn[15] + 530742520, 16) + iWs46;
        int iWs48 = Ws(((iWs44 + J0(iWs47, iWs46, iWs45)) + this.gn[2]) - 995338651, 23) + iWs47;
        int iWs49 = Ws(((iWs45 + J8(iWs48, iWs47, iWs46)) + this.gn[0]) - 198630844, 6) + iWs48;
        int iWs50 = Ws(iWs46 + J8(iWs49, iWs48, iWs47) + this.gn[7] + 1126891415, 10) + iWs49;
        int iWs51 = Ws(((iWs47 + J8(iWs50, iWs49, iWs48)) + this.gn[14]) - 1416354905, 15) + iWs50;
        int iWs52 = Ws(((iWs48 + J8(iWs51, iWs50, iWs49)) + this.gn[5]) - 57434055, 21) + iWs51;
        int iWs53 = Ws(iWs49 + J8(iWs52, iWs51, iWs50) + this.gn[12] + 1700485571, 6) + iWs52;
        int iWs54 = Ws(((iWs50 + J8(iWs53, iWs52, iWs51)) + this.gn[3]) - 1894986606, 10) + iWs53;
        int iWs55 = Ws(((iWs51 + J8(iWs54, iWs53, iWs52)) + this.gn[10]) - 1051523, 15) + iWs54;
        int iWs56 = Ws(((iWs52 + J8(iWs55, iWs54, iWs53)) + this.gn[1]) - 2054922799, 21) + iWs55;
        int iWs57 = Ws(iWs53 + J8(iWs56, iWs55, iWs54) + this.gn[8] + 1873313359, 6) + iWs56;
        int iWs58 = Ws(((iWs54 + J8(iWs57, iWs56, iWs55)) + this.gn[15]) - 30611744, 10) + iWs57;
        int iWs59 = Ws(((iWs55 + J8(iWs58, iWs57, iWs56)) + this.gn[6]) - 1560198380, 15) + iWs58;
        int iWs60 = Ws(iWs56 + J8(iWs59, iWs58, iWs57) + this.gn[13] + 1309151649, 21) + iWs59;
        int iWs61 = Ws(((iWs57 + J8(iWs60, iWs59, iWs58)) + this.gn[4]) - 145523070, 6) + iWs60;
        int iWs62 = Ws(((iWs58 + J8(iWs61, iWs60, iWs59)) + this.gn[11]) - 1120210379, 10) + iWs61;
        int iWs63 = Ws(iWs59 + J8(iWs62, iWs61, iWs60) + this.gn[2] + 718787259, 15) + iWs62;
        int iWs64 = Ws(((iWs60 + J8(iWs63, iWs62, iWs61)) + this.gn[9]) - 343485551, 21) + iWs63;
        this.Hw += iWs61;
        this.v5 += iWs64;
        this.Zo += iWs63;
        this.VH += iWs62;
        this.u7 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = this.gn;
            if (i5 == iArr.length) {
                return;
            }
            iArr[i5] = 0;
            i5++;
        }
    }

    @Override // abcd.sn0
    public void tp(byte[] bArr, int i) {
        int[] iArr = this.gn;
        int i2 = this.u7;
        int i3 = i2 + 1;
        this.u7 = i3;
        iArr[i2] = ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        if (i3 == 16) {
            gn();
        }
    }

    @Override // abcd.sn0
    public void u7(long j) {
        if (this.u7 > 14) {
            gn();
        }
        int[] iArr = this.gn;
        iArr[14] = (int) ((-1) & j);
        iArr[15] = (int) (j >>> 32);
    }

    @Override // abcd.on0
    public String v5() {
        return "MD5";
    }
}
