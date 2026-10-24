package abcd;

import java.io.Serializable;
import java.text.MessageFormat;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public final class h60 implements Serializable {
    final int WB;
    final int fY;
    final int jw;
    final int k2;
    final int mb;
    final int qp;

    public h60(int i, int i2, int i3, int i4, int i5, int i6) {
        this.WB = i;
        this.mb = i2;
        this.jw = i3;
        this.fY = i4;
        this.qp = i5;
        this.k2 = i6;
    }

    public static final h60 DW(j60 j60Var) {
        return new h60(40, j60Var.WB, j60Var.mb, j60Var.jw, j60Var.fY, j60Var.qp);
    }

    public static int EQ(int i, int i2, int i3) {
        int i4 = (i2 - 1) * 8;
        if (i4 + 8 <= i) {
            return i3;
        }
        if (i <= i4) {
            return 0;
        }
        int i5 = 32 - ((i - i4) * 4);
        return (i3 >>> i5) << i5;
    }

    public static final h60 FH(String str) {
        if (str.length() > 40) {
            throw new IllegalArgumentException(MessageFormat.format(JGitText.DW().invalidId, str));
        }
        byte[] bArrHw = r60.Hw(str);
        return j6(bArrHw, 0, bArrHw.length);
    }

    public static final h60 Hw(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        if (i3 <= 40) {
            return j6(bArr, i, i2);
        }
        throw new IllegalArgumentException(MessageFormat.format(JGitText.DW().invalidIdLength, Integer.valueOf(i3), 40));
    }

    private static final int Zo(byte[] bArr, int i, int i2) {
        if (8 <= i2 - i) {
            return kg0.lg(bArr, i);
        }
        int i3 = 0;
        int iRN = 0;
        while (i3 < 8 && i < i2) {
            iRN = (iRN << 4) | kg0.rN(bArr[i]);
            i3++;
            i++;
        }
        return iRN << ((8 - i3) * 4);
    }

    public static final boolean gn(String str) {
        if (str.length() >= 2 && 40 >= str.length()) {
            for (int i = 0; i < str.length(); i++) {
                try {
                    kg0.rN((byte) str.charAt(i));
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
            return true;
        }
        return false;
    }

    private static final h60 j6(byte[] bArr, int i, int i2) {
        try {
            return new h60(i2 - i, Zo(bArr, i, i2), Zo(bArr, i + 8, i2), Zo(bArr, i + 16, i2), Zo(bArr, i + 24, i2), Zo(bArr, i + 32, i2));
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new l40(bArr, i, i2 - i);
        }
    }

    private int tp(int i, int i2) {
        return EQ(this.WB, i, i2);
    }

    public final int J0(j60 j60Var) {
        int iJ6 = ig0.j6(this.mb, tp(1, j60Var.WB));
        if (iJ6 != 0) {
            return iJ6;
        }
        int iJ62 = ig0.j6(this.jw, tp(2, j60Var.mb));
        if (iJ62 != 0) {
            return iJ62;
        }
        int iJ63 = ig0.j6(this.fY, tp(3, j60Var.jw));
        if (iJ63 != 0) {
            return iJ63;
        }
        int iJ64 = ig0.j6(this.qp, tp(4, j60Var.fY));
        return iJ64 != 0 ? iJ64 : ig0.j6(this.k2, tp(5, j60Var.qp));
    }

    public final int J8(byte[] bArr, int i) {
        int iJ6 = ig0.j6(this.mb, tp(1, ig0.DW(bArr, i)));
        if (iJ6 != 0) {
            return iJ6;
        }
        int iJ62 = ig0.j6(this.jw, tp(2, ig0.DW(bArr, i + 4)));
        if (iJ62 != 0) {
            return iJ62;
        }
        int iJ63 = ig0.j6(this.fY, tp(3, ig0.DW(bArr, i + 8)));
        if (iJ63 != 0) {
            return iJ63;
        }
        int iJ64 = ig0.j6(this.qp, tp(4, ig0.DW(bArr, i + 12)));
        return iJ64 != 0 ? iJ64 : ig0.j6(this.k2, tp(5, ig0.DW(bArr, i + 16)));
    }

    public a70 QX() {
        if (VH()) {
            return new a70(this.mb, this.jw, this.fY, this.qp, this.k2);
        }
        return null;
    }

    public boolean VH() {
        return u7() == 40;
    }

    public final int Ws(int[] iArr, int i) {
        int iJ6 = ig0.j6(this.mb, tp(1, iArr[i]));
        if (iJ6 != 0) {
            return iJ6;
        }
        int iJ62 = ig0.j6(this.jw, tp(2, iArr[i + 1]));
        if (iJ62 != 0) {
            return iJ62;
        }
        int iJ63 = ig0.j6(this.fY, tp(3, iArr[i + 2]));
        if (iJ63 != 0) {
            return iJ63;
        }
        int iJ64 = ig0.j6(this.qp, tp(4, iArr[i + 3]));
        return iJ64 != 0 ? iJ64 : ig0.j6(this.k2, tp(5, iArr[i + 4]));
    }

    public boolean equals(Object obj) {
        if (obj instanceof h60) {
            h60 h60Var = (h60) obj;
            if (this.WB == h60Var.WB && this.mb == h60Var.mb && this.jw == h60Var.jw && this.fY == h60Var.fY && this.qp == h60Var.qp && this.k2 == h60Var.k2) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.jw;
    }

    public String toString() {
        return "AbbreviatedObjectId[" + we() + "]";
    }

    public int u7() {
        return this.WB;
    }

    public final int v5() {
        return this.mb >>> 24;
    }

    public final String we() {
        char[] cArr = new char[40];
        j60.a8(cArr, 0, this.mb);
        if (this.WB <= 8) {
            return new String(cArr, 0, this.WB);
        }
        j60.a8(cArr, 8, this.jw);
        if (this.WB <= 16) {
            return new String(cArr, 0, this.WB);
        }
        j60.a8(cArr, 16, this.fY);
        if (this.WB <= 24) {
            return new String(cArr, 0, this.WB);
        }
        j60.a8(cArr, 24, this.qp);
        if (this.WB <= 32) {
            return new String(cArr, 0, this.WB);
        }
        j60.a8(cArr, 32, this.k2);
        return new String(cArr, 0, this.WB);
    }
}
