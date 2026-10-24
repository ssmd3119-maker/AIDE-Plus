package abcd;

/* loaded from: classes.dex */
public final class jk extends vk {
    private final qp v5;

    public jk(wp wpVar, qp qpVar) {
        super(wpVar);
        if (qpVar == null) {
            throw new NullPointerException("local == null");
        }
        this.v5 = qpVar;
    }

    public static String er(qp qpVar) {
        return qpVar.dx() + ' ' + qpVar.QX().toString() + ": " + qpVar.a8().Zo();
    }

    @Override // abcd.vk, abcd.zj
    public zj U2(int i) {
        return new jk(EQ(), this.v5.vJ(i));
    }

    @Override // abcd.zj
    public String XL(boolean z) {
        return "local-start " + er(this.v5);
    }

    @Override // abcd.zj
    public zj a8(rp rpVar) {
        return new jk(EQ(), this.v5);
    }

    @Override // abcd.zj
    public String j6() {
        return this.v5.toString();
    }

    public qp rN() {
        return this.v5;
    }
}
