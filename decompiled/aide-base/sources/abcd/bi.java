package abcd;

/* loaded from: classes.dex */
public class bi extends xh {
    private final gr[] mb;

    public bi(int i) {
        super(i != 0);
        this.mb = new gr[i];
    }

    private static gr I(int i, String str) {
        throw new fi("local " + xs.VH(i) + ": " + str);
    }

    @Override // abcd.xh
    public void BT(us usVar) {
        int i = 0;
        while (true) {
            gr[] grVarArr = this.mb;
            if (i >= grVarArr.length) {
                return;
            }
            gr grVar = grVarArr[i];
            usVar.j6("locals[" + xs.VH(i) + "]: " + (grVar == null ? "<invalid>" : grVar.toString()));
            i++;
        }
    }

    @Override // abcd.xh
    public gr KD(int i) {
        gr grVar = this.mb[i];
        if (grVar != null) {
            return grVar;
        }
        I(i, "invalid");
        throw null;
    }

    public bi Mz(bi biVar) {
        try {
            return ai.DW(this, biVar);
        } catch (fi e) {
            e.j6("underlay locals:");
            BT(e);
            e.j6("overlay locals:");
            biVar.BT(e);
            throw e;
        }
    }

    public int Sf() {
        return this.mb.length;
    }

    @Override // abcd.kt
    public String Zo() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            gr[] grVarArr = this.mb;
            if (i >= grVarArr.length) {
                return sb.toString();
            }
            gr grVar = grVarArr[i];
            sb.append("locals[" + xs.VH(i) + "]: " + (grVar == null ? "<invalid>" : grVar.toString()) + "\n");
            i++;
        }
    }

    @Override // abcd.xh
    public yh cb(xh xhVar, int i) {
        return new yh(Sf()).cb(xhVar, i);
    }

    @Override // abcd.xh
    public void cn(fr frVar) {
        int length = this.mb.length;
        if (length == 0) {
            return;
        }
        a8();
        fr frVarMr = frVar.Mr();
        for (int i = 0; i < length; i++) {
            gr[] grVarArr = this.mb;
            if (grVarArr[i] == frVar) {
                grVarArr[i] = frVarMr;
            }
        }
    }

    @Override // abcd.xh
    public void dx(int i, gr grVar) {
        int i2;
        gr grVar2;
        a8();
        try {
            gr grVarRN = grVar.rN();
            if (i < 0) {
                throw new IndexOutOfBoundsException("idx < 0");
            }
            if (grVarRN.j6().cn()) {
                this.mb[i + 1] = null;
            }
            gr[] grVarArr = this.mb;
            grVarArr[i] = grVarRN;
            if (i == 0 || (grVar2 = grVarArr[i - 1]) == null || !grVar2.j6().cn()) {
                return;
            }
            this.mb[i2] = null;
        } catch (NullPointerException unused) {
            throw new NullPointerException("type == null");
        }
    }

    @Override // abcd.xh
    /* renamed from: ef, reason: merged with bridge method [inline-methods] */
    public bi vy() {
        bi biVar = new bi(this.mb.length);
        gr[] grVarArr = this.mb;
        System.arraycopy(grVarArr, 0, biVar.mb, 0, grVarArr.length);
        return biVar;
    }

    public void g3(int i) {
        a8();
        this.mb[i] = null;
    }

    @Override // abcd.xh
    public bi ro() {
        return this;
    }

    @Override // abcd.xh
    public void sG(qp qpVar) {
        dx(qpVar.Mr(), qpVar);
    }

    @Override // abcd.xh
    public xh sh(xh xhVar) {
        return xhVar instanceof bi ? Mz((bi) xhVar) : xhVar.sh(this);
    }

    public gr vJ(int i) {
        return this.mb[i];
    }
}
