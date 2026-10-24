package abcd;

/* loaded from: classes.dex */
public class do0 extends tn0 {
    @Override // abcd.tn0, abcd.on0
    public void DW() {
        super.DW();
        this.v5 = -3766243637369397544L;
        this.Zo = 7105036623409894663L;
        this.VH = -7973340178411365097L;
        this.gn = 1526699215303891257L;
        this.u7 = 7436329637833083697L;
        this.tp = -8163818279084223215L;
        this.EQ = -2662702644619276377L;
        this.we = 5167115440072839076L;
    }

    @Override // abcd.on0
    public int Hw(byte[] bArr, int i) {
        J8();
        uo0.v5(this.v5, bArr, i);
        uo0.v5(this.Zo, bArr, i + 8);
        uo0.v5(this.VH, bArr, i + 16);
        uo0.v5(this.gn, bArr, i + 24);
        uo0.v5(this.u7, bArr, i + 32);
        uo0.v5(this.tp, bArr, i + 40);
        DW();
        return 48;
    }

    @Override // abcd.on0
    public int Zo() {
        return 48;
    }

    @Override // abcd.on0
    public String v5() {
        return "SHA-384";
    }
}
