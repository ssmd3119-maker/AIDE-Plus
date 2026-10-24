package abcd;

/* loaded from: classes.dex */
public class vn0 extends sn0 {
    private int Hw;
    private int VH;
    private int Zo;
    private int[] gn = new int[16];
    private int u7;
    private int v5;

    public vn0() {
        DW();
    }

    private int EQ(int i, int i2, int i3) {
        return ((i ^ (-1)) & i3) | (i2 & i);
    }

    private int J0(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    private int J8(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    private void Ws(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    private int we(int i, int i2, int i3) {
        return (i & i3) | (i & i2) | (i2 & i3);
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
        Ws(this.Hw, bArr, i);
        Ws(this.v5, bArr, i + 4);
        Ws(this.Zo, bArr, i + 8);
        Ws(this.VH, bArr, i + 12);
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
        int iJ8 = J8(i + EQ(i2, i3, i4) + this.gn[0], 3);
        int iJ82 = J8(i4 + EQ(iJ8, i2, i3) + this.gn[1], 7);
        int iJ83 = J8(i3 + EQ(iJ82, iJ8, i2) + this.gn[2], 11);
        int iJ84 = J8(i2 + EQ(iJ83, iJ82, iJ8) + this.gn[3], 19);
        int iJ85 = J8(iJ8 + EQ(iJ84, iJ83, iJ82) + this.gn[4], 3);
        int iJ86 = J8(iJ82 + EQ(iJ85, iJ84, iJ83) + this.gn[5], 7);
        int iJ87 = J8(iJ83 + EQ(iJ86, iJ85, iJ84) + this.gn[6], 11);
        int iJ88 = J8(iJ84 + EQ(iJ87, iJ86, iJ85) + this.gn[7], 19);
        int iJ89 = J8(iJ85 + EQ(iJ88, iJ87, iJ86) + this.gn[8], 3);
        int iJ810 = J8(iJ86 + EQ(iJ89, iJ88, iJ87) + this.gn[9], 7);
        int iJ811 = J8(iJ87 + EQ(iJ810, iJ89, iJ88) + this.gn[10], 11);
        int iJ812 = J8(iJ88 + EQ(iJ811, iJ810, iJ89) + this.gn[11], 19);
        int iJ813 = J8(iJ89 + EQ(iJ812, iJ811, iJ810) + this.gn[12], 3);
        int iJ814 = J8(iJ810 + EQ(iJ813, iJ812, iJ811) + this.gn[13], 7);
        int iJ815 = J8(iJ811 + EQ(iJ814, iJ813, iJ812) + this.gn[14], 11);
        int iJ816 = J8(iJ812 + EQ(iJ815, iJ814, iJ813) + this.gn[15], 19);
        int iJ817 = J8(iJ813 + we(iJ816, iJ815, iJ814) + this.gn[0] + 1518500249, 3);
        int iJ818 = J8(iJ814 + we(iJ817, iJ816, iJ815) + this.gn[4] + 1518500249, 5);
        int iJ819 = J8(iJ815 + we(iJ818, iJ817, iJ816) + this.gn[8] + 1518500249, 9);
        int iJ820 = J8(iJ816 + we(iJ819, iJ818, iJ817) + this.gn[12] + 1518500249, 13);
        int iJ821 = J8(iJ817 + we(iJ820, iJ819, iJ818) + this.gn[1] + 1518500249, 3);
        int iJ822 = J8(iJ818 + we(iJ821, iJ820, iJ819) + this.gn[5] + 1518500249, 5);
        int iJ823 = J8(iJ819 + we(iJ822, iJ821, iJ820) + this.gn[9] + 1518500249, 9);
        int iJ824 = J8(iJ820 + we(iJ823, iJ822, iJ821) + this.gn[13] + 1518500249, 13);
        int iJ825 = J8(iJ821 + we(iJ824, iJ823, iJ822) + this.gn[2] + 1518500249, 3);
        int iJ826 = J8(iJ822 + we(iJ825, iJ824, iJ823) + this.gn[6] + 1518500249, 5);
        int iJ827 = J8(iJ823 + we(iJ826, iJ825, iJ824) + this.gn[10] + 1518500249, 9);
        int iJ828 = J8(iJ824 + we(iJ827, iJ826, iJ825) + this.gn[14] + 1518500249, 13);
        int iJ829 = J8(iJ825 + we(iJ828, iJ827, iJ826) + this.gn[3] + 1518500249, 3);
        int iJ830 = J8(iJ826 + we(iJ829, iJ828, iJ827) + this.gn[7] + 1518500249, 5);
        int iJ831 = J8(iJ827 + we(iJ830, iJ829, iJ828) + this.gn[11] + 1518500249, 9);
        int iJ832 = J8(iJ828 + we(iJ831, iJ830, iJ829) + this.gn[15] + 1518500249, 13);
        int iJ833 = J8(iJ829 + J0(iJ832, iJ831, iJ830) + this.gn[0] + 1859775393, 3);
        int iJ834 = J8(iJ830 + J0(iJ833, iJ832, iJ831) + this.gn[8] + 1859775393, 9);
        int iJ835 = J8(iJ831 + J0(iJ834, iJ833, iJ832) + this.gn[4] + 1859775393, 11);
        int iJ836 = J8(iJ832 + J0(iJ835, iJ834, iJ833) + this.gn[12] + 1859775393, 15);
        int iJ837 = J8(iJ833 + J0(iJ836, iJ835, iJ834) + this.gn[2] + 1859775393, 3);
        int iJ838 = J8(iJ834 + J0(iJ837, iJ836, iJ835) + this.gn[10] + 1859775393, 9);
        int iJ839 = J8(iJ835 + J0(iJ838, iJ837, iJ836) + this.gn[6] + 1859775393, 11);
        int iJ840 = J8(iJ836 + J0(iJ839, iJ838, iJ837) + this.gn[14] + 1859775393, 15);
        int iJ841 = J8(iJ837 + J0(iJ840, iJ839, iJ838) + this.gn[1] + 1859775393, 3);
        int iJ842 = J8(iJ838 + J0(iJ841, iJ840, iJ839) + this.gn[9] + 1859775393, 9);
        int iJ843 = J8(iJ839 + J0(iJ842, iJ841, iJ840) + this.gn[5] + 1859775393, 11);
        int iJ844 = J8(iJ840 + J0(iJ843, iJ842, iJ841) + this.gn[13] + 1859775393, 15);
        int iJ845 = J8(iJ841 + J0(iJ844, iJ843, iJ842) + this.gn[3] + 1859775393, 3);
        int iJ846 = J8(iJ842 + J0(iJ845, iJ844, iJ843) + this.gn[11] + 1859775393, 9);
        int iJ847 = J8(iJ843 + J0(iJ846, iJ845, iJ844) + this.gn[7] + 1859775393, 11);
        int iJ848 = J8(iJ844 + J0(iJ847, iJ846, iJ845) + this.gn[15] + 1859775393, 15);
        this.Hw += iJ845;
        this.v5 += iJ848;
        this.Zo += iJ847;
        this.VH += iJ846;
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
        return "MD4";
    }
}
