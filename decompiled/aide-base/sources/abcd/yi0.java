package abcd;

/* loaded from: classes.dex */
public class yi0 extends ai0 {
    private byte[] WB;
    private static final byte[] mb = {-1};
    private static final byte[] jw = new byte[1];
    public static final kh0 fY = new kh0(false);
    public static final kh0 qp = new kh0(true);

    public yi0(byte[] bArr) {
        if (bArr.length != 1) {
            throw new IllegalArgumentException("byte value should have 1 byte in it");
        }
        if (bArr[0] == 0) {
            this.WB = jw;
        } else if (bArr[0] == 255) {
            this.WB = mb;
        } else {
            this.WB = dq0.FH(bArr);
        }
    }

    public static kh0 J8(byte[] bArr) {
        if (bArr.length == 1) {
            return bArr[0] == 0 ? fY : bArr[0] == 255 ? qp : new kh0(bArr);
        }
        throw new IllegalArgumentException("byte value should have 1 byte in it");
    }

    public static kh0 QX(boolean z) {
        return z ? qp : fY;
    }

    public static kh0 Ws(Object obj) {
        if (obj == null || (obj instanceof kh0)) {
            return (kh0) obj;
        }
        if (obj instanceof yi0) {
            return ((yi0) obj).XL() ? qp : fY;
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    @Override // abcd.ai0
    public boolean EQ() {
        return false;
    }

    @Override // abcd.ai0
    public boolean VH(ai0 ai0Var) {
        return ai0Var != null && (ai0Var instanceof yi0) && this.WB[0] == ((yi0) ai0Var).WB[0];
    }

    public boolean XL() {
        return this.WB[0] != 0;
    }

    @Override // abcd.ai0
    public void gn(yh0 yh0Var) {
        yh0Var.VH(1, this.WB);
    }

    @Override // abcd.uh0
    public int hashCode() {
        return this.WB[0];
    }

    public String toString() {
        return this.WB[0] != 0 ? "TRUE" : "FALSE";
    }

    @Override // abcd.ai0
    public int u7() {
        return 3;
    }

    public yi0(boolean z) {
        this.WB = z ? mb : jw;
    }
}
