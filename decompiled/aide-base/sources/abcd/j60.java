package abcd;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

/* loaded from: classes.dex */
public abstract class j60 implements Comparable {
    private static final byte[] k2 = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    private static final char[] zh = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    int WB;
    int fY;
    int jw;
    int mb;
    int qp;

    private void KD(char[] cArr) {
        a8(cArr, 0, this.WB);
        a8(cArr, 8, this.mb);
        a8(cArr, 16, this.jw);
        a8(cArr, 24, this.fY);
        a8(cArr, 32, this.qp);
    }

    public static boolean Mr(j60 j60Var, j60 j60Var2) {
        if (j60Var == j60Var2) {
            return true;
        }
        return j60Var.mb == j60Var2.mb && j60Var.jw == j60Var2.jw && j60Var.fY == j60Var2.fY && j60Var.qp == j60Var2.qp && j60Var.WB == j60Var2.WB;
    }

    private static void U2(byte[] bArr, int i, int i2) {
        int i3 = i + 7;
        while (i3 >= i && i2 != 0) {
            bArr[i3] = k2[i2 & 15];
            i2 >>>= 4;
            i3--;
        }
        while (i3 >= i) {
            bArr[i3] = 48;
            i3--;
        }
    }

    public static void a8(char[] cArr, int i, int i2) {
        int i3 = i + 7;
        while (i3 >= i && i2 != 0) {
            cArr[i3] = zh[i2 & 15];
            i2 >>>= 4;
            i3--;
        }
        while (i3 >= i) {
            cArr[i3] = '0';
            i3--;
        }
    }

    private char[] ro() {
        char[] cArr = new char[40];
        KD(cArr);
        return cArr;
    }

    private static void sh(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i >>> 24);
        outputStream.write(i >>> 16);
        outputStream.write(i >>> 8);
        outputStream.write(i);
    }

    private byte[] vy() {
        byte[] bArr = new byte[40];
        U2(bArr, 0, this.WB);
        U2(bArr, 8, this.mb);
        U2(bArr, 16, this.jw);
        U2(bArr, 24, this.fY);
        U2(bArr, 32, this.qp);
        return bArr;
    }

    public final String BT() {
        return new String(ro());
    }

    public final int DW(j60 j60Var) {
        if (this == j60Var) {
            return 0;
        }
        int iJ6 = ig0.j6(this.WB, j60Var.WB);
        if (iJ6 != 0) {
            return iJ6;
        }
        int iJ62 = ig0.j6(this.mb, j60Var.mb);
        if (iJ62 != 0) {
            return iJ62;
        }
        int iJ63 = ig0.j6(this.jw, j60Var.jw);
        if (iJ63 != 0) {
            return iJ63;
        }
        int iJ64 = ig0.j6(this.fY, j60Var.fY);
        return iJ64 != 0 ? iJ64 : ig0.j6(this.qp, j60Var.qp);
    }

    public final int FH(byte[] bArr, int i) {
        int iJ6 = ig0.j6(this.WB, ig0.DW(bArr, i));
        if (iJ6 != 0) {
            return iJ6;
        }
        int iJ62 = ig0.j6(this.mb, ig0.DW(bArr, i + 4));
        if (iJ62 != 0) {
            return iJ62;
        }
        int iJ63 = ig0.j6(this.jw, ig0.DW(bArr, i + 8));
        if (iJ63 != 0) {
            return iJ63;
        }
        int iJ64 = ig0.j6(this.fY, ig0.DW(bArr, i + 12));
        return iJ64 != 0 ? iJ64 : ig0.j6(this.qp, ig0.DW(bArr, i + 16));
    }

    public void J0(byte[] bArr, int i) {
        U2(bArr, i + 0, this.WB);
        U2(bArr, i + 8, this.mb);
        U2(bArr, i + 16, this.jw);
        U2(bArr, i + 24, this.fY);
        U2(bArr, i + 32, this.qp);
    }

    public void QX(char[] cArr, Writer writer) throws IOException {
        KD(cArr);
        writer.write(cArr, 0, 40);
    }

    public void XL(char[] cArr, StringBuilder sb) {
        KD(cArr);
        sb.append(cArr, 0, 40);
    }

    public final a70 Zo() {
        return getClass() == a70.class ? (a70) this : new a70(this);
    }

    public final boolean aM(j60 j60Var) {
        if (j60Var != null) {
            return Mr(this, j60Var);
        }
        return false;
    }

    public abstract a70 cn();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return DW((j60) obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j60) {
            return aM((j60) obj);
        }
        return false;
    }

    public final int hashCode() {
        return this.mb;
    }

    public h60 j6(int i) {
        return new h60(i, h60.EQ(i, 1, this.WB), h60.EQ(i, 2, this.mb), h60.EQ(i, 3, this.jw), h60.EQ(i, 4, this.fY), h60.EQ(i, 5, this.qp));
    }

    public final int rN() {
        return this.WB >>> 24;
    }

    public String toString() {
        return "AnyObjectId[" + BT() + "]";
    }

    public void tp(byte[] bArr, int i) {
        ig0.VH(bArr, i, this.WB);
        ig0.VH(bArr, i + 4, this.mb);
        ig0.VH(bArr, i + 8, this.jw);
        ig0.VH(bArr, i + 12, this.fY);
        ig0.VH(bArr, i + 16, this.qp);
    }

    public void u7(OutputStream outputStream) throws IOException {
        sh(outputStream, this.WB);
        sh(outputStream, this.mb);
        sh(outputStream, this.jw);
        sh(outputStream, this.fY);
        sh(outputStream, this.qp);
    }

    public final int v5(int[] iArr, int i) {
        int iJ6 = ig0.j6(this.WB, iArr[i]);
        if (iJ6 != 0) {
            return iJ6;
        }
        int iJ62 = ig0.j6(this.mb, iArr[i + 1]);
        if (iJ62 != 0) {
            return iJ62;
        }
        int iJ63 = ig0.j6(this.jw, iArr[i + 2]);
        if (iJ63 != 0) {
            return iJ63;
        }
        int iJ64 = ig0.j6(this.fY, iArr[i + 3]);
        return iJ64 != 0 ? iJ64 : ig0.j6(this.qp, iArr[i + 4]);
    }

    public void we(OutputStream outputStream) throws IOException {
        outputStream.write(vy());
    }

    public final String yS() {
        return BT();
    }
}
