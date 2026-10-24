package abcd;

/* loaded from: classes.dex */
public abstract class qi {
    private final zq DW;
    private final int FH;
    private final li Hw;
    private cj Zo;
    private final oi j6;
    private int v5;

    public qi(oi oiVar, zq zqVar, int i, li liVar) {
        if (oiVar == null) {
            throw new NullPointerException("cf == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("offset < 0");
        }
        if (liVar == null) {
            throw new NullPointerException("attributeFactory == null");
        }
        this.j6 = oiVar;
        this.DW = zqVar;
        this.FH = i;
        this.Hw = liVar;
        this.v5 = -1;
    }

    private void VH() {
        int i;
        int i2;
        cq cqVar;
        int iJ6 = j6();
        int iDW = DW();
        int iJ62 = this.FH + 2;
        os osVarHw = this.j6.Hw();
        cq cqVarV5 = this.j6.v5();
        cj cjVar = this.Zo;
        if (cjVar != null) {
            cjVar.FH(osVarHw, this.FH, 2, Zo() + "s_count: " + xs.VH(iDW));
        }
        int i3 = 0;
        while (i3 < iDW) {
            try {
                int iJ8 = osVarHw.J8(iJ62);
                int i4 = iJ62 + 2;
                int iJ82 = osVarHw.J8(i4);
                int i5 = iJ62 + 4;
                int iJ83 = osVarHw.J8(i5);
                yq yqVar = (yq) cqVarV5.get(iJ82);
                yq yqVar2 = (yq) cqVarV5.get(iJ83);
                if (this.Zo != null) {
                    i2 = iDW;
                    cqVar = cqVarV5;
                    this.Zo.j6(osVarHw, iJ62, yqVar.J0(), yqVar2.J0());
                    this.Zo.FH(osVarHw, iJ62, 0, "\n" + Zo() + "s[" + i3 + "]:\n");
                    this.Zo.DW(1);
                    cj cjVar2 = this.Zo;
                    StringBuilder sb = new StringBuilder();
                    sb.append("access_flags: ");
                    sb.append(v5(iJ8));
                    cjVar2.FH(osVarHw, iJ62, 2, sb.toString());
                    this.Zo.FH(osVarHw, i4, 2, "name: " + yqVar.Zo());
                    this.Zo.FH(osVarHw, i5, 2, "descriptor: " + yqVar2.Zo());
                } else {
                    i2 = iDW;
                    cqVar = cqVarV5;
                }
                mi miVar = new mi(this.j6, iJ6, iJ62 + 6, this.Hw);
                miVar.v5(this.Zo);
                iJ62 = miVar.j6();
                dj djVarDW = miVar.DW();
                djVarDW.Mr();
                yi yiVarU7 = u7(i3, iJ8, new wq(yqVar, yqVar2), djVarDW);
                if (this.Zo != null) {
                    this.Zo.DW(-1);
                    this.Zo.FH(osVarHw, iJ62, 0, "end " + Zo() + "s[" + i3 + "]\n");
                    i = i3;
                    try {
                        this.Zo.Hw(osVarHw, iJ62, yqVar.J0(), yqVar2.J0(), yiVarU7);
                    } catch (bj e) {
                        e = e;
                        e.j6("...while parsing " + Zo() + "s[" + i + "]");
                        throw e;
                    } catch (RuntimeException e2) {
                        e = e2;
                        bj bjVar = new bj(e);
                        bjVar.j6("...while parsing " + Zo() + "s[" + i + "]");
                        throw bjVar;
                    }
                } else {
                    i = i3;
                }
                i3 = i + 1;
                iDW = i2;
                cqVarV5 = cqVar;
            } catch (bj e3) {
                e = e3;
                i = i3;
            } catch (RuntimeException e4) {
                e = e4;
                i = i3;
            }
        }
        this.v5 = iJ62;
    }

    public final int DW() {
        return this.j6.Hw().J8(this.FH);
    }

    public final zq FH() {
        return this.DW;
    }

    public int Hw() {
        gn();
        return this.v5;
    }

    public abstract String Zo();

    public final void gn() {
        if (this.v5 < 0) {
            VH();
        }
    }

    public abstract int j6();

    public final void tp(cj cjVar) {
        this.Zo = cjVar;
    }

    public abstract yi u7(int i, int i2, wq wqVar, ui uiVar);

    public abstract String v5(int i);
}
