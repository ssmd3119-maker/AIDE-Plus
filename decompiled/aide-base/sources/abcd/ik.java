package abcd;

/* loaded from: classes.dex */
public final class ik extends vk {
    private final sp v5;

    public ik(wp wpVar, sp spVar) {
        super(wpVar);
        if (spVar == null) {
            throw new NullPointerException("locals == null");
        }
        this.v5 = spVar;
    }

    @Override // abcd.vk, abcd.zj
    public zj U2(int i) {
        return new ik(EQ(), this.v5.Sf(i));
    }

    @Override // abcd.zj
    public String XL(boolean z) {
        int size = this.v5.size();
        int iRo = this.v5.ro();
        StringBuffer stringBuffer = new StringBuffer((size * 40) + 100);
        stringBuffer.append("local-snapshot");
        for (int i = 0; i < iRo; i++) {
            qp qpVarVy = this.v5.vy(i);
            if (qpVarVy != null) {
                stringBuffer.append("\n  ");
                stringBuffer.append(jk.er(qpVarVy));
            }
        }
        return stringBuffer.toString();
    }

    @Override // abcd.zj
    public zj a8(rp rpVar) {
        return new ik(EQ(), this.v5);
    }

    @Override // abcd.zj
    public String j6() {
        return this.v5.toString();
    }

    public sp rN() {
        return this.v5;
    }
}
