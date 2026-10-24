package abcd;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public class vi0 extends ai0 {
    private final boolean WB;
    private final byte[] jw;
    private final int mb;

    public vi0(boolean z, int i, byte[] bArr) {
        this.WB = z;
        this.mb = i;
        this.jw = bArr;
    }

    private byte[] XL(int i, byte[] bArr) {
        int i2;
        if ((bArr[0] & 31) == 31) {
            i2 = 2;
            int i3 = bArr[1] & 255;
            if ((i3 & 127) == 0) {
                throw new zh0("corrupted stream - invalid high tag number found");
            }
            while (i3 >= 0 && (i3 & 128) != 0) {
                i3 = bArr[i2] & 255;
                i2++;
            }
        } else {
            i2 = 1;
        }
        int length = (bArr.length - i2) + 1;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, i2, bArr2, 1, length - 1);
        bArr2[0] = (byte) i;
        return bArr2;
    }

    @Override // abcd.ai0
    public boolean EQ() {
        return this.WB;
    }

    public int J8() {
        return this.mb;
    }

    public ai0 QX(int i) throws IOException {
        if (i >= 31) {
            throw new IOException("unsupported tag number");
        }
        byte[] bArrV5 = v5();
        byte[] bArrXL = XL(i, bArrV5);
        if ((bArrV5[0] & 32) != 0) {
            bArrXL[0] = (byte) (bArrXL[0] | 32);
        }
        return new rh0(bArrXL).we();
    }

    @Override // abcd.ai0
    public boolean VH(ai0 ai0Var) {
        if (!(ai0Var instanceof vi0)) {
            return false;
        }
        vi0 vi0Var = (vi0) ai0Var;
        return this.WB == vi0Var.WB && this.mb == vi0Var.mb && dq0.j6(this.jw, vi0Var.jw);
    }

    public byte[] Ws() {
        return this.jw;
    }

    @Override // abcd.ai0
    public void gn(yh0 yh0Var) throws IOException {
        yh0Var.Zo(this.WB ? 96 : 64, this.mb, this.jw);
    }

    @Override // abcd.uh0
    public int hashCode() {
        boolean z = this.WB;
        return ((z ? 1 : 0) ^ this.mb) ^ dq0.Hw(this.jw);
    }

    @Override // abcd.ai0
    public int u7() {
        return jk0.DW(this.mb) + jk0.j6(this.jw.length) + this.jw.length;
    }

    public vi0(int i, nh0 nh0Var) {
        this.mb = i;
        this.WB = true;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i2 = 0; i2 != nh0Var.FH(); i2++) {
            try {
                byteArrayOutputStream.write(((uh0) nh0Var.DW(i2)).Zo("DER"));
            } catch (IOException e) {
                throw new zh0("malformed object: " + e, e);
            }
        }
        this.jw = byteArrayOutputStream.toByteArray();
    }
}
