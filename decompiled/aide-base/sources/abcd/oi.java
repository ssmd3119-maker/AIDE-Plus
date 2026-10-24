package abcd;

/* loaded from: classes.dex */
public class oi implements vi {
    private final os DW;
    private dj EQ;
    private final boolean FH;
    private ar Hw;
    private cj J0;
    private zq VH;
    private zq Zo;
    private hr gn;
    private final String j6;
    private aj tp;
    private xi u7;
    private int v5;
    private li we;

    private static class a implements hr {
        private final os WB;
        private final ar jw;
        private final int mb;

        public a(os osVar, int i, int i2, ar arVar, cj cjVar) {
            if (i2 < 0) {
                throw new IllegalArgumentException("size < 0");
            }
            os osVarAM = osVar.aM(i, (i2 * 2) + i);
            this.WB = osVarAM;
            this.mb = i2;
            this.jw = arVar;
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = i3 * 2;
                try {
                    zq zqVar = (zq) arVar.get(osVarAM.J8(i4));
                    if (cjVar != null) {
                        cjVar.FH(osVarAM, i4, 2, "  " + zqVar);
                    }
                } catch (ClassCastException e) {
                    throw new RuntimeException("bogus class cpi", e);
                }
            }
        }

        @Override // abcd.hr
        public boolean FH() {
            return false;
        }

        @Override // abcd.hr
        public int size() {
            return this.mb;
        }

        @Override // abcd.hr
        public hr tp(fr frVar) {
            throw new UnsupportedOperationException("unsupported");
        }

        @Override // abcd.hr
        public fr v5(int i) {
            return ((zq) this.jw.get(this.WB.J8(i * 2))).J0();
        }
    }

    public oi(os osVar, String str, boolean z) {
        if (osVar == null) {
            throw new NullPointerException("bytes == null");
        }
        if (str == null) {
            throw new NullPointerException("filePath == null");
        }
        this.j6 = str;
        this.DW = osVar;
        this.FH = z;
        this.v5 = -1;
    }

    private void Mr() {
        if (this.v5 == -1) {
            XL();
        }
    }

    private boolean Ws(int i, int i2, int i3) {
        if (i != -889275714 || i2 < 0) {
            return false;
        }
        return i3 == 50 ? i2 <= 0 : i3 < 50 && i3 >= 45;
    }

    private void XL() {
        try {
            aM();
        } catch (bj e) {
            e.j6("...while parsing " + this.j6);
            throw e;
        } catch (RuntimeException e2) {
            bj bjVar = new bj(e2);
            bjVar.j6("...while parsing " + this.j6);
            throw bjVar;
        }
    }

    public static String a8(Object obj) {
        return obj == null ? "(none)" : obj.toString();
    }

    private void aM() {
        if (this.DW.XL() < 10) {
            throw new bj("severely truncated class file");
        }
        cj cjVar = this.J0;
        if (cjVar != null) {
            cjVar.FH(this.DW, 0, 0, "begin classfile");
            this.J0.FH(this.DW, 0, 4, "magic: " + xs.tp(u7()));
            this.J0.FH(this.DW, 4, 2, "minor_version: " + xs.VH(we()));
            this.J0.FH(this.DW, 6, 2, "major_version: " + xs.VH(tp()));
        }
        if (this.FH && !Ws(u7(), we(), tp())) {
            throw new bj("bad class file magic (" + xs.tp(u7()) + ") or version (" + xs.VH(tp()) + "." + xs.VH(we()) + ")");
        }
        ji jiVar = new ji(this.DW);
        jiVar.gn(this.J0);
        ar arVarFH = jiVar.FH();
        this.Hw = arVarFH;
        arVarFH.Mr();
        int iDW = jiVar.DW();
        int iJ8 = this.DW.J8(iDW);
        int i = iDW + 2;
        this.Zo = (zq) this.Hw.get(this.DW.J8(i));
        int i2 = iDW + 4;
        this.VH = (zq) this.Hw.QX(this.DW.J8(i2));
        int i3 = iDW + 6;
        int iJ82 = this.DW.J8(i3);
        cj cjVar2 = this.J0;
        if (cjVar2 != null) {
            cjVar2.FH(this.DW, iDW, 2, "access_flags: " + bp.j6(iJ8));
            this.J0.FH(this.DW, i, 2, "this_class: " + this.Zo);
            this.J0.FH(this.DW, i2, 2, "super_class: " + a8(this.VH));
            this.J0.FH(this.DW, i3, 2, "interfaces_count: " + xs.VH(iJ82));
            if (iJ82 != 0) {
                this.J0.FH(this.DW, iDW + 8, 0, "interfaces:");
            }
        }
        int i4 = iDW + 8;
        this.gn = QX(i4, iJ82);
        int i5 = i4 + (iJ82 * 2);
        if (this.FH) {
            String strWe = this.Zo.J0().we();
            if (!this.j6.endsWith(".class") || !this.j6.startsWith(strWe) || this.j6.length() != strWe.length() + 6) {
                throw new bj("class name (" + strWe + ") does not match path (" + this.j6 + ")");
            }
        }
        this.v5 = iJ8;
        pi piVar = new pi(this, this.Zo, i5, this.we);
        piVar.tp(this.J0);
        this.u7 = piVar.EQ();
        ri riVar = new ri(this, this.Zo, piVar.Hw(), this.we);
        riVar.tp(this.J0);
        this.tp = riVar.EQ();
        mi miVar = new mi(this, 0, riVar.Hw(), this.we);
        miVar.v5(this.J0);
        dj djVarDW = miVar.DW();
        this.EQ = djVarDW;
        djVarDW.Mr();
        int iJ6 = miVar.j6();
        if (iJ6 != this.DW.XL()) {
            throw new bj("extra bytes at end of class file, at offset " + xs.tp(iJ6));
        }
        cj cjVar3 = this.J0;
        if (cjVar3 != null) {
            cjVar3.FH(this.DW, iJ6, 0, "end classfile");
        }
    }

    private void j3() {
        if (this.EQ == null) {
            XL();
        }
    }

    @Override // abcd.vi
    public yq DW() {
        ti tiVarJ0 = FH().J0("SourceFile");
        if (tiVarJ0 instanceof dh) {
            return ((dh) tiVarJ0).j6();
        }
        return null;
    }

    public aj EQ() {
        j3();
        return this.tp;
    }

    public ui FH() {
        j3();
        return this.EQ;
    }

    public os Hw() {
        return this.DW;
    }

    public zq J0() {
        Mr();
        return this.VH;
    }

    public zq J8() {
        Mr();
        return this.Zo;
    }

    public hr QX(int i, int i2) {
        if (i2 == 0) {
            return er.jw;
        }
        ar arVar = this.Hw;
        if (arVar != null) {
            return new a(this.DW, i, i2, arVar, this.J0);
        }
        throw new IllegalStateException("pool not yet initialized");
    }

    public void U2(li liVar) {
        if (liVar == null) {
            throw new NullPointerException("attributeFactory == null");
        }
        this.we = liVar;
    }

    public hr VH() {
        Mr();
        return this.gn;
    }

    public xi Zo() {
        j3();
        return this.u7;
    }

    public int gn() {
        Mr();
        return u7();
    }

    @Override // abcd.vi
    public int j6() {
        Mr();
        return this.v5;
    }

    public int tp() {
        return this.DW.J8(6);
    }

    public int u7() {
        return this.DW.u7(0);
    }

    public cq v5() {
        Mr();
        return this.Hw;
    }

    public int we() {
        return this.DW.J8(4);
    }

    public oi(byte[] bArr, String str, boolean z) {
        this(new os(bArr), str, z);
    }
}
