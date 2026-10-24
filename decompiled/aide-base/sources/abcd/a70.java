package abcd;

import java.io.Serializable;

/* loaded from: classes.dex */
public class a70 extends j60 implements Serializable {
    private static final a70 AL;
    private static final String w9;

    static {
        a70 a70Var = new a70(0, 0, 0, 0, 0);
        AL = a70Var;
        w9 = a70Var.BT();
    }

    public a70(int i, int i2, int i3, int i4, int i5) {
        this.WB = i;
        this.mb = i2;
        this.jw = i3;
        this.fY = i4;
        this.qp = i5;
    }

    public static final String I(a70 a70Var) {
        return a70Var != null ? a70Var.BT() : w9;
    }

    public static final boolean Mz(String str) {
        if (str.length() != 40) {
            return false;
        }
        for (int i = 0; i < 40; i++) {
            try {
                kg0.rN((byte) str.charAt(i));
            } catch (ArrayIndexOutOfBoundsException unused) {
                return false;
            }
        }
        return true;
    }

    public static final a70 Sf(int[] iArr, int i) {
        return new a70(iArr[i], iArr[i + 1], iArr[i + 2], iArr[i + 3], iArr[i + 4]);
    }

    public static final a70 ca() {
        return AL;
    }

    public static boolean cb(byte[] bArr, int i, byte[] bArr2, int i2) {
        return bArr[i] == bArr2[i2] && bArr[i + 1] == bArr2[i2 + 1] && bArr[i + 2] == bArr2[i2 + 2] && bArr[i + 3] == bArr2[i2 + 3] && bArr[i + 4] == bArr2[i2 + 4] && bArr[i + 5] == bArr2[i2 + 5] && bArr[i + 6] == bArr2[i2 + 6] && bArr[i + 7] == bArr2[i2 + 7] && bArr[i + 8] == bArr2[i2 + 8] && bArr[i + 9] == bArr2[i2 + 9] && bArr[i + 10] == bArr2[i2 + 10] && bArr[i + 11] == bArr2[i2 + 11] && bArr[i + 12] == bArr2[i2 + 12] && bArr[i + 13] == bArr2[i2 + 13] && bArr[i + 14] == bArr2[i2 + 14] && bArr[i + 15] == bArr2[i2 + 15] && bArr[i + 16] == bArr2[i2 + 16] && bArr[i + 17] == bArr2[i2 + 17] && bArr[i + 18] == bArr2[i2 + 18] && bArr[i + 19] == bArr2[i2 + 19];
    }

    private static final a70 dx(byte[] bArr, int i) {
        try {
            return new a70(kg0.lg(bArr, i), kg0.lg(bArr, i + 8), kg0.lg(bArr, i + 16), kg0.lg(bArr, i + 24), kg0.lg(bArr, i + 32));
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new l40(bArr, i, 40);
        }
    }

    public static final a70 ef(byte[] bArr, int i) {
        return new a70(ig0.DW(bArr, i), ig0.DW(bArr, i + 4), ig0.DW(bArr, i + 8), ig0.DW(bArr, i + 12), ig0.DW(bArr, i + 16));
    }

    public static final a70 g3(byte[] bArr, int i) {
        return dx(bArr, i);
    }

    public static final a70 sG(byte[] bArr) {
        return ef(bArr, 0);
    }

    public static a70 vJ(String str) {
        if (str.length() == 40) {
            return dx(r60.Hw(str), 0);
        }
        throw new IllegalArgumentException("Invalid id: " + str);
    }

    @Override // abcd.j60
    public a70 cn() {
        return this;
    }

    public a70(j60 j60Var) {
        this.WB = j60Var.WB;
        this.mb = j60Var.mb;
        this.jw = j60Var.jw;
        this.fY = j60Var.fY;
        this.qp = j60Var.qp;
    }
}
