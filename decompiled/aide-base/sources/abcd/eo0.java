package abcd;

/* loaded from: classes.dex */
public class eo0 extends tn0 {
    @Override // abcd.tn0, abcd.on0
    public void DW() {
        super.DW();
        this.v5 = 7640891576956012808L;
        this.Zo = -4942790177534073029L;
        this.VH = 4354685564936845355L;
        this.gn = -6534734903238641935L;
        this.u7 = 5840696475078001361L;
        this.tp = -7276294671716946913L;
        this.EQ = 2270897969802886507L;
        this.we = 6620516959819538809L;
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
        uo0.v5(this.EQ, bArr, i + 48);
        uo0.v5(this.we, bArr, i + 56);
        DW();
        return 64;
    }

    @Override // abcd.on0
    public int Zo() {
        return 64;
    }

    @Override // abcd.on0
    public String v5() {
        return "SHA-512";
    }
}
