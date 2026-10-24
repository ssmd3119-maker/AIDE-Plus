package abcd;

import java.io.IOException;

/* loaded from: classes.dex */
public class u00 {
    private static h00 u7;
    public short Hw;
    public int VH;
    public int Zo;
    public String gn;
    public short v5;
    public int j6 = 101010256;
    public short DW = 0;
    public short FH = 0;

    public static h00 DW() {
        if (u7 == null) {
            u7 = i00.j6(u00.class.getName());
        }
        return u7;
    }

    public static u00 FH(y00 y00Var) throws IOException {
        if (y00Var.VH() != 101010256) {
            y00Var.EQ(y00Var.FH() - 4);
            return null;
        }
        u00 u00Var = new u00();
        u00Var.j6(y00Var);
        return u00Var;
    }

    private void j6(y00 y00Var) {
        boolean zJ6 = DW().j6();
        short sGn = y00Var.gn();
        this.DW = sGn;
        if (zJ6) {
            u7.Hw(String.format("This disk number: 0x%04x", Short.valueOf(sGn)));
        }
        short sGn2 = y00Var.gn();
        this.FH = sGn2;
        if (zJ6) {
            u7.Hw(String.format("Central dir start disk number: 0x%04x", Short.valueOf(sGn2)));
        }
        short sGn3 = y00Var.gn();
        this.Hw = sGn3;
        if (zJ6) {
            u7.Hw(String.format("Central entries on this disk: 0x%04x", Short.valueOf(sGn3)));
        }
        short sGn4 = y00Var.gn();
        this.v5 = sGn4;
        if (zJ6) {
            u7.Hw(String.format("Total number of central entries: 0x%04x", Short.valueOf(sGn4)));
        }
        int iVH = y00Var.VH();
        this.Zo = iVH;
        if (zJ6) {
            u7.Hw(String.format("Central directory size: 0x%08x", Integer.valueOf(iVH)));
        }
        int iVH2 = y00Var.VH();
        this.VH = iVH2;
        if (zJ6) {
            u7.Hw(String.format("Central directory offset: 0x%08x", Integer.valueOf(iVH2)));
        }
        this.gn = y00Var.u7(y00Var.gn());
        if (zJ6) {
            u7.Hw(".ZIP file comment: " + this.gn);
        }
    }

    public void Hw(a10 a10Var) {
        DW().j6();
        a10Var.VH(this.j6);
        a10Var.gn(this.DW);
        a10Var.gn(this.FH);
        a10Var.gn(this.Hw);
        a10Var.gn(this.v5);
        a10Var.VH(this.Zo);
        a10Var.VH(this.VH);
        a10Var.gn((short) this.gn.length());
        a10Var.u7(this.gn);
    }
}
