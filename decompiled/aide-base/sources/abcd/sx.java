package abcd;

/* loaded from: classes.dex */
public class sx implements Cloneable {
    byte[] AL;
    int fY;
    long hK;
    long jw;
    byte[] k2;
    int w9;
    byte[] zh;
    boolean WB = false;
    private boolean mb = false;
    int qp = 255;
    long cT = 0;

    public void FH(long j) {
    }

    public Object clone() {
        sx sxVar = (sx) super.clone();
        byte[] bArr = sxVar.k2;
        if (bArr != null) {
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            sxVar.k2 = bArr2;
        }
        byte[] bArr3 = sxVar.zh;
        if (bArr3 != null) {
            int length2 = bArr3.length;
            byte[] bArr4 = new byte[length2];
            System.arraycopy(bArr3, 0, bArr4, 0, length2);
            sxVar.zh = bArr4;
        }
        byte[] bArr5 = sxVar.AL;
        if (bArr5 != null) {
            int length3 = bArr5.length;
            byte[] bArr6 = new byte[length3];
            System.arraycopy(bArr5, 0, bArr6, 0, length3);
            sxVar.AL = bArr6;
        }
        return sxVar;
    }

    public void j6(rx rxVar) {
        int i = this.WB ? 1 : 0;
        if (this.mb) {
            i |= 2;
        }
        if (this.k2 != null) {
            i |= 4;
        }
        if (this.zh != null) {
            i |= 8;
        }
        if (this.AL != null) {
            i |= 16;
        }
        int i2 = rxVar.sM;
        int i3 = i2 == 1 ? 4 : i2 == 9 ? 2 : 0;
        rxVar.dx(-29921);
        rxVar.sh((byte) 8);
        rxVar.sh((byte) i);
        rxVar.sh((byte) this.cT);
        rxVar.sh((byte) (this.cT >> 8));
        rxVar.sh((byte) (this.cT >> 16));
        rxVar.sh((byte) (this.cT >> 24));
        rxVar.sh((byte) i3);
        rxVar.sh((byte) this.qp);
        byte[] bArr = this.k2;
        if (bArr != null) {
            rxVar.sh((byte) bArr.length);
            rxVar.sh((byte) (this.k2.length >> 8));
            byte[] bArr2 = this.k2;
            rxVar.cb(bArr2, 0, bArr2.length);
        }
        byte[] bArr3 = this.zh;
        if (bArr3 != null) {
            rxVar.cb(bArr3, 0, bArr3.length);
            rxVar.sh((byte) 0);
        }
        byte[] bArr4 = this.AL;
        if (bArr4 != null) {
            rxVar.cb(bArr4, 0, bArr4.length);
            rxVar.sh((byte) 0);
        }
    }
}
