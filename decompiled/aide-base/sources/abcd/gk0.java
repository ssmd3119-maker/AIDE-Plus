package abcd;

import java.util.Enumeration;

/* loaded from: classes.dex */
public class gk0 extends bi0 {
    private byte[] mb;

    public gk0(byte[] bArr) {
        this.mb = bArr;
    }

    private void U2() {
        fk0 fk0Var = new fk0(this.mb);
        while (fk0Var.hasMoreElements()) {
            this.WB.addElement(fk0Var.nextElement());
        }
        this.mb = null;
    }

    @Override // abcd.bi0, abcd.ai0
    public ai0 J0() {
        if (this.mb != null) {
            U2();
        }
        return super.J0();
    }

    @Override // abcd.bi0
    public synchronized mh0 XL(int i) {
        if (this.mb != null) {
            U2();
        }
        return super.XL(i);
    }

    @Override // abcd.bi0
    public synchronized Enumeration aM() {
        if (this.mb == null) {
            return super.aM();
        }
        return new fk0(this.mb);
    }

    @Override // abcd.ai0
    public void gn(yh0 yh0Var) {
        byte[] bArr = this.mb;
        if (bArr != null) {
            yh0Var.VH(48, bArr);
        } else {
            super.J0().gn(yh0Var);
        }
    }

    @Override // abcd.bi0
    public synchronized int j3() {
        if (this.mb != null) {
            U2();
        }
        return super.j3();
    }

    @Override // abcd.ai0
    public int u7() {
        byte[] bArr = this.mb;
        return bArr != null ? jk0.j6(bArr.length) + 1 + this.mb.length : super.J0().u7();
    }

    @Override // abcd.bi0, abcd.ai0
    public ai0 we() {
        if (this.mb != null) {
            U2();
        }
        return super.we();
    }
}
