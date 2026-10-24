package abcd;

import java.io.IOException;

/* loaded from: classes.dex */
public class em0 {
    public static final vh0 FH;
    public static final vh0 Hw;
    wh0 DW;
    boolean j6;

    static {
        new vh0("2.5.29.9");
        new vh0("2.5.29.14");
        FH = new vh0("2.5.29.15");
        new vh0("2.5.29.16");
        new vh0("2.5.29.17");
        new vh0("2.5.29.18");
        Hw = new vh0("2.5.29.19");
        new vh0("2.5.29.20");
        new vh0("2.5.29.21");
        new vh0("2.5.29.23");
        new vh0("2.5.29.24");
        new vh0("2.5.29.27");
        new vh0("2.5.29.28");
        new vh0("2.5.29.29");
        new vh0("2.5.29.30");
        new vh0("2.5.29.31");
        new vh0("2.5.29.32");
        new vh0("2.5.29.33");
        new vh0("2.5.29.35");
        new vh0("2.5.29.36");
        new vh0("2.5.29.37");
        new vh0("2.5.29.46");
        new vh0("2.5.29.54");
        new vh0("1.3.6.1.5.5.7.1.1");
        new vh0("1.3.6.1.5.5.7.1.11");
        new vh0("1.3.6.1.5.5.7.1.12");
        new vh0("1.3.6.1.5.5.7.1.2");
        new vh0("1.3.6.1.5.5.7.1.3");
        new vh0("1.3.6.1.5.5.7.1.4");
        new vh0("2.5.29.56");
        new vh0("2.5.29.55");
    }

    public em0(yi0 yi0Var, wh0 wh0Var) {
        this.j6 = yi0Var.XL();
        this.DW = wh0Var;
    }

    public static ai0 j6(em0 em0Var) {
        try {
            return ai0.tp(em0Var.DW().Ws());
        } catch (IOException e) {
            throw new IllegalArgumentException("can't convert extension: " + e);
        }
    }

    public wh0 DW() {
        return this.DW;
    }

    public boolean FH() {
        return this.j6;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof em0)) {
            return false;
        }
        em0 em0Var = (em0) obj;
        return em0Var.DW().equals(DW()) && em0Var.FH() == FH();
    }

    public int hashCode() {
        return FH() ? DW().hashCode() : DW().hashCode() ^ (-1);
    }

    public em0(boolean z, wh0 wh0Var) {
        this.j6 = z;
        this.DW = wh0Var;
    }
}
