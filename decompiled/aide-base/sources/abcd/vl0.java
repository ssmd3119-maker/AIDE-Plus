package abcd;

/* loaded from: classes.dex */
public class vl0 {
    public static final vh0 FH;
    wh0 DW;
    boolean j6;

    static {
        new vh0("2.5.29.9");
        new vh0("2.5.29.14");
        new vh0("2.5.29.15");
        new vh0("2.5.29.16");
        FH = new vh0("2.5.29.17");
        new vh0("2.5.29.18");
        new vh0("2.5.29.19");
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

    public vl0(vh0 vh0Var, kh0 kh0Var, wh0 wh0Var) {
        this(vh0Var, kh0Var.XL(), wh0Var);
    }

    public boolean DW() {
        return this.j6;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof vl0)) {
            return false;
        }
        vl0 vl0Var = (vl0) obj;
        return vl0Var.j6().equals(j6()) && vl0Var.DW() == DW();
    }

    public int hashCode() {
        return DW() ? j6().hashCode() : j6().hashCode() ^ (-1);
    }

    public wh0 j6() {
        return this.DW;
    }

    public vl0(vh0 vh0Var, boolean z, wh0 wh0Var) {
        this.j6 = z;
        this.DW = wh0Var;
    }
}
