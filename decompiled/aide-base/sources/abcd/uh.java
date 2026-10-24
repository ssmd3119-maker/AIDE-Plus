package abcd;

/* loaded from: classes.dex */
public final class uh {
    private final th DW;
    private final at FH;
    private final xh j6;

    private uh(xh xhVar, th thVar) {
        this(xhVar, thVar, at.qp);
    }

    private at EQ(at atVar) {
        if (this.FH.equals(atVar)) {
            return this.FH;
        }
        at atVar2 = new at();
        int size = this.FH.size();
        int size2 = atVar.size();
        for (int i = 0; i < size && i < size2 && this.FH.ro(i) == atVar.ro(i); i++) {
            atVar2.BT(i);
        }
        atVar2.Mr();
        return atVar2;
    }

    private static xh j6(xh xhVar, at atVar) {
        if (!(xhVar instanceof yh)) {
            return xhVar;
        }
        yh yhVar = (yh) xhVar;
        return atVar.size() == 0 ? yhVar.ro() : yhVar;
    }

    public void DW(us usVar) {
        this.j6.BT(usVar);
        this.DW.BT(usVar);
    }

    public uh FH() {
        return new uh(this.j6.vy(), this.DW.ro(), this.FH);
    }

    public xh Hw() {
        return this.j6;
    }

    public uh J0(uh uhVar, int i, int i2) {
        at atVar;
        yh yhVarCb = Hw().cb(uhVar.Hw(), i2);
        th thVarSh = v5().sh(uhVar.v5());
        at atVarEf = uhVar.FH.ef();
        atVarEf.BT(i);
        atVarEf.Mr();
        if (yhVarCb == Hw() && thVarSh == v5() && this.FH.equals(atVarEf)) {
            return this;
        }
        if (this.FH.equals(atVarEf)) {
            atVarEf = this.FH;
        } else {
            if (this.FH.size() > atVarEf.size()) {
                atVar = atVarEf;
                atVarEf = this.FH;
            } else {
                atVar = this.FH;
            }
            int size = atVarEf.size();
            int size2 = atVar.size();
            for (int i3 = size2 - 1; i3 >= 0; i3--) {
                if (atVar.ro(i3) != atVarEf.ro((size - size2) + i3)) {
                    throw new RuntimeException("Incompatible merged subroutines");
                }
            }
        }
        return new uh(yhVarCb, thVarSh, atVarEf);
    }

    public void J8() {
        this.j6.Mr();
        this.DW.Mr();
    }

    public void VH(er erVar) {
        int size = erVar.size();
        int iTp = 0;
        for (int i = 0; i < size; i++) {
            fr frVarSf = erVar.Sf(i);
            this.j6.dx(iTp, frVarSf);
            iTp += frVarSf.tp();
        }
    }

    public uh Ws(int i, int i2) {
        xh xhVar = this.j6;
        xh xhVarI = xhVar instanceof yh ? ((yh) xhVar).I(i2) : null;
        try {
            at atVarEf = this.FH.ef();
            if (atVarEf.Sf() != i) {
                throw new RuntimeException("returning from invalid subroutine");
            }
            atVarEf.Mr();
            if (xhVarI == null) {
                return null;
            }
            return new uh(xhVarI, this.DW, atVarEf);
        } catch (IndexOutOfBoundsException unused) {
            throw new RuntimeException("returning from invalid subroutine");
        } catch (NullPointerException unused2) {
            throw new NullPointerException("can't return from non-subroutine");
        }
    }

    public at Zo() {
        return this.FH;
    }

    public uh gn(zq zqVar) {
        th thVarRo = v5().ro();
        thVarRo.KD();
        thVarRo.Sf(zqVar);
        return new uh(Hw(), thVarRo, this.FH);
    }

    public uh tp(int i, int i2) {
        this.FH.ef().BT(i);
        return new uh(this.j6.ro(), this.DW, at.dx(i)).J0(this, i, i2);
    }

    public void u7(fr frVar) {
        this.j6.cn(frVar);
        this.DW.cn(frVar);
    }

    public th v5() {
        return this.DW;
    }

    public uh we(uh uhVar) {
        xh xhVarSh = Hw().sh(uhVar.Hw());
        th thVarSh = v5().sh(uhVar.v5());
        at atVarEQ = EQ(uhVar.FH);
        xh xhVarJ6 = j6(xhVarSh, atVarEQ);
        return (xhVarJ6 == Hw() && thVarSh == v5() && this.FH == atVarEQ) ? this : new uh(xhVarJ6, thVarSh, atVarEQ);
    }

    private uh(xh xhVar, th thVar, at atVar) {
        if (xhVar == null) {
            throw new NullPointerException("locals == null");
        }
        if (thVar == null) {
            throw new NullPointerException("stack == null");
        }
        atVar.yS();
        this.j6 = xhVar;
        this.DW = thVar;
        this.FH = atVar;
    }

    public uh(int i, int i2) {
        this(new bi(i), new th(i2));
    }
}
