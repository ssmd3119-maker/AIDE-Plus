package abcd;

/* loaded from: classes.dex */
public final class pj {
    public static int DW;
    public static int FH;
    public static int Hw;
    public static int VH;
    public static int Zo;
    public static int j6;
    public static int v5;

    public static void DW(int i) {
        VH += i;
    }

    public static void FH(up upVar, up upVar2) {
        int iX9 = upVar.DW().x9();
        int iAj = upVar.DW().aj();
        int iX92 = upVar2.DW().x9();
        DW += iX92 - iX9;
        j6 += upVar2.DW().aj() - iAj;
        FH += iX92;
    }

    public static void j6(yj yjVar, yj yjVar2) {
        v5 += yjVar2.Zo().sG() - yjVar.Zo().sG();
        Hw += yjVar2.Zo().vJ() - yjVar.Zo().vJ();
        Zo += yjVar2.Zo().sG();
    }
}
