package abcd;

import abcd.no;

/* loaded from: classes.dex */
public final class ao {
    private final int DW;
    private final int FH;
    private final int Hw;
    private final int VH;
    private final int Zo;
    private final int gn;
    private final co j6;
    private final int tp;
    private final int u7;
    private final int v5;

    public ao(co coVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.j6 = coVar;
        this.DW = i;
        this.FH = i2;
        this.Hw = i3;
        this.v5 = i4;
        this.Zo = i5;
        this.VH = i6;
        this.gn = i7;
        this.u7 = i8;
        this.tp = i9;
    }

    public int DW() {
        return this.gn;
    }

    public int FH() {
        return this.u7;
    }

    public int Hw() {
        return this.Zo;
    }

    public int VH() {
        return this.tp;
    }

    public int Zo() {
        return this.VH;
    }

    public int gn() {
        return this.v5;
    }

    public int j6() {
        return this.Hw;
    }

    public String toString() {
        if (this.j6 == null) {
            return this.FH + " " + this.v5;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.j6.j3().get(this.FH));
        if (this.v5 != -1) {
            sb.append(" extends ");
            sb.append(this.j6.j3().get(this.v5));
        }
        return sb.toString();
    }

    public void tp(no.b bVar) {
        bVar.Mr();
        bVar.writeInt(u7());
        bVar.writeInt(j6());
        bVar.writeInt(gn());
        bVar.writeInt(Hw());
        bVar.writeInt(Zo());
        bVar.writeInt(DW());
        bVar.writeInt(FH());
        bVar.writeInt(VH());
    }

    public int u7() {
        return this.FH;
    }

    public int v5() {
        return this.DW;
    }
}
