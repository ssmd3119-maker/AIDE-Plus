package abcd;

/* loaded from: classes.dex */
public final class th extends gt {
    private int fY;
    private final boolean[] jw;
    private final gr[] mb;

    public th(int i) {
        super(i != 0);
        this.mb = new gr[i];
        this.jw = new boolean[i];
        this.fY = 0;
    }

    private static gr Mz(String str) {
        throw new fi("stack: " + str);
    }

    private static String g3(gr grVar) {
        return grVar == null ? "<invalid>" : grVar.toString();
    }

    public void BT(us usVar) {
        int i = this.fY - 1;
        int i2 = 0;
        while (i2 <= i) {
            usVar.j6("stack[" + (i2 == i ? "top0" : xs.VH(i - i2)) + "]: " + g3(this.mb[i2]));
            i2++;
        }
    }

    public void KD() {
        a8();
        for (int i = 0; i < this.fY; i++) {
            this.mb[i] = null;
            this.jw[i] = false;
        }
        this.fY = 0;
    }

    public void Sf(gr grVar) {
        a8();
        try {
            gr grVarRN = grVar.rN();
            int iTp = grVarRN.j6().tp();
            int i = this.fY;
            int i2 = i + iTp;
            gr[] grVarArr = this.mb;
            if (i2 > grVarArr.length) {
                Mz("overflow");
                throw null;
            }
            if (iTp == 2) {
                grVarArr[i] = null;
                this.fY = i + 1;
            }
            gr[] grVarArr2 = this.mb;
            int i3 = this.fY;
            grVarArr2[i3] = grVarRN;
            this.fY = i3 + 1;
        } catch (NullPointerException unused) {
            throw new NullPointerException("type == null");
        }
    }

    public gr cb(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("n < 0");
        }
        if (i < this.fY) {
            return this.mb[(r0 - i) - 1];
        }
        Mz("underflow");
        throw null;
    }

    public void cn(fr frVar) {
        if (this.fY == 0) {
            return;
        }
        a8();
        fr frVarMr = frVar.Mr();
        for (int i = 0; i < this.fY; i++) {
            gr[] grVarArr = this.mb;
            if (grVarArr[i] == frVar) {
                grVarArr[i] = frVarMr;
            }
        }
    }

    public boolean dx(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("n < 0");
        }
        if (i < this.fY) {
            return this.jw[(r0 - i) - 1];
        }
        throw new fi("stack: underflow");
    }

    public gr ef() {
        a8();
        gr grVarCb = cb(0);
        gr[] grVarArr = this.mb;
        int i = this.fY;
        grVarArr[i - 1] = null;
        this.jw[i - 1] = false;
        this.fY = i - grVarCb.j6().tp();
        return grVarCb;
    }

    public th ro() {
        th thVar = new th(this.mb.length);
        gr[] grVarArr = this.mb;
        System.arraycopy(grVarArr, 0, thVar.mb, 0, grVarArr.length);
        boolean[] zArr = this.jw;
        System.arraycopy(zArr, 0, thVar.jw, 0, zArr.length);
        thVar.fY = this.fY;
        return thVar;
    }

    public fr sG(int i) {
        return cb(i).j6();
    }

    public th sh(th thVar) {
        try {
            return ai.FH(this, thVar);
        } catch (fi e) {
            e.j6("underlay stack:");
            BT(e);
            e.j6("overlay stack:");
            thVar.BT(e);
            throw e;
        }
    }

    public int size() {
        return this.fY;
    }

    public void vJ() {
        a8();
        this.jw[this.fY] = true;
    }

    public void vy(int i, gr grVar) {
        a8();
        try {
            gr grVarRN = grVar.rN();
            int i2 = (this.fY - i) - 1;
            gr grVar2 = this.mb[i2];
            if (grVar2 != null && grVar2.j6().tp() == grVarRN.j6().tp()) {
                this.mb[i2] = grVarRN;
                return;
            }
            Mz("incompatible substitution: " + g3(grVar2) + " -> " + g3(grVarRN));
            throw null;
        } catch (NullPointerException unused) {
            throw new NullPointerException("type == null");
        }
    }
}
