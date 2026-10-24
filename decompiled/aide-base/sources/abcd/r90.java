package abcd;

/* loaded from: classes.dex */
public class r90 extends o90 {
    private o90 q7;

    public r90(j60 j60Var) {
        super(j60Var);
    }

    @Override // abcd.o90
    public void OW(t90 t90Var) {
        XX(t90Var, t90Var.Mr(this));
    }

    public void XX(t90 t90Var, byte[] bArr) {
        hg0 hg0Var = new hg0();
        hg0Var.j6 = 53;
        int iJ6 = r60.j6(this, bArr, (byte) 10, hg0Var);
        t90Var.jw.Sf(bArr, 7);
        this.q7 = t90Var.SI(t90Var.jw, iJ6);
        int i = hg0Var.j6 + 4;
        hg0Var.j6 = i;
        kg0.Zo(r60.Zo, bArr, i, kg0.aM(bArr, i) - 1);
        t90Var.nw();
        this.cT |= 1;
    }

    @Override // abcd.o90
    public final int aj() {
        return 4;
    }

    public final o90 br() {
        return this.q7;
    }
}
