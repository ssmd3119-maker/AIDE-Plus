package abcd;

/* loaded from: classes.dex */
public class xl0 extends xi0 {
    public xl0(xi0 xi0Var) {
        super(xi0Var.QX(), xi0Var.j3());
    }

    @Override // abcd.xi0
    public String toString() {
        if (this.WB.length == 1) {
            return "KeyUsage: 0x" + Integer.toHexString(this.WB[0] & 255);
        }
        StringBuilder sb = new StringBuilder("KeyUsage: 0x");
        byte[] bArr = this.WB;
        sb.append(Integer.toHexString((bArr[0] & 255) | ((bArr[1] & 255) << 8)));
        return sb.toString();
    }
}
