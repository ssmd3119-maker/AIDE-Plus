package abcd;

/* loaded from: classes.dex */
public final class sp extends gt {
    private int jw;
    private final qp[] mb;

    static {
        new sp(0);
    }

    public sp(int i) {
        super(i != 0);
        this.mb = new qp[i];
        this.jw = 0;
    }

    public qp BT(qp qpVar) {
        int length = this.mb.length;
        for (int i = 0; i < length; i++) {
            qp qpVar2 = this.mb[i];
            if (qpVar2 != null && qpVar.cb(qpVar2)) {
                return qpVar2;
            }
        }
        return null;
    }

    public qp KD(qp qpVar) {
        return vy(qpVar.Mr());
    }

    public sp Sf(int i) {
        int length = this.mb.length;
        sp spVar = new sp(length + i);
        for (int i2 = 0; i2 < length; i2++) {
            qp qpVar = this.mb[i2];
            if (qpVar != null) {
                spVar.dx(qpVar.vJ(i));
            }
        }
        spVar.jw = this.jw;
        if (aM()) {
            spVar.Mr();
        }
        return spVar;
    }

    public sp cb() {
        int length = this.mb.length;
        sp spVar = new sp(length);
        for (int i = 0; i < length; i++) {
            qp qpVar = this.mb[i];
            if (qpVar != null) {
                spVar.dx(qpVar);
            }
        }
        spVar.jw = this.jw;
        return spVar;
    }

    public void cn(sp spVar, boolean z) {
        qp qpVarVy;
        a8();
        qp[] qpVarArr = spVar.mb;
        int length = this.mb.length;
        int iMin = Math.min(length, qpVarArr.length);
        this.jw = -1;
        for (int i = 0; i < iMin; i++) {
            qp qpVar = this.mb[i];
            if (qpVar != null && (qpVarVy = qpVar.vy(qpVarArr[i], z)) != qpVar) {
                this.mb[i] = qpVarVy;
            }
        }
        while (iMin < length) {
            this.mb[iMin] = null;
            iMin++;
        }
    }

    public void dx(qp qpVar) {
        int i;
        qp qpVar2;
        a8();
        if (qpVar == null) {
            throw new NullPointerException("spec == null");
        }
        this.jw = -1;
        try {
            int iMr = qpVar.Mr();
            this.mb[iMr] = qpVar;
            if (iMr > 0 && (qpVar2 = this.mb[iMr - 1]) != null && qpVar2.J0() == 2) {
                this.mb[i] = null;
            }
            if (qpVar.J0() == 2) {
                this.mb[iMr + 1] = null;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("spec.getReg() out of range");
        }
    }

    public void ef(qp qpVar) {
        try {
            this.mb[qpVar.Mr()] = null;
            this.jw = -1;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus reg");
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof sp)) {
            return false;
        }
        sp spVar = (sp) obj;
        qp[] qpVarArr = spVar.mb;
        int length = this.mb.length;
        if (length != qpVarArr.length || size() != spVar.size()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            qp qpVar = this.mb[i];
            Object obj2 = qpVarArr[i];
            if (qpVar != obj2 && (qpVar == null || !qpVar.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int length = this.mb.length;
        int iHashCode = 0;
        for (int i = 0; i < length; i++) {
            qp qpVar = this.mb[i];
            iHashCode = (iHashCode * 31) + (qpVar == null ? 0 : qpVar.hashCode());
        }
        return iHashCode;
    }

    public int ro() {
        return this.mb.length;
    }

    public void sG(sp spVar) {
        int iRo = spVar.ro();
        for (int i = 0; i < iRo; i++) {
            qp qpVarVy = spVar.vy(i);
            if (qpVarVy != null) {
                dx(qpVarVy);
            }
        }
    }

    public qp sh(kp kpVar) {
        int length = this.mb.length;
        for (int i = 0; i < length; i++) {
            qp qpVar = this.mb[i];
            if (qpVar != null && kpVar.equals(qpVar.QX())) {
                return qpVar;
            }
        }
        return null;
    }

    public int size() {
        int i = this.jw;
        if (i >= 0) {
            return i;
        }
        int length = this.mb.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (this.mb[i3] != null) {
                i2++;
            }
        }
        this.jw = i2;
        return i2;
    }

    public String toString() {
        int length = this.mb.length;
        StringBuffer stringBuffer = new StringBuffer(length * 25);
        stringBuffer.append('{');
        boolean z = false;
        for (int i = 0; i < length; i++) {
            qp qpVar = this.mb[i];
            if (qpVar != null) {
                if (z) {
                    stringBuffer.append(", ");
                } else {
                    z = true;
                }
                stringBuffer.append(qpVar);
            }
        }
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public qp vy(int i) {
        try {
            return this.mb[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus reg");
        }
    }
}
