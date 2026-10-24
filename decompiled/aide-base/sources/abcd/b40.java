package abcd;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.text.MessageFormat;
import java.util.Arrays;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class b40 {
    private static final byte[] v5 = new byte[8];
    private final int DW;
    final byte[] FH;
    private byte Hw;
    private final byte[] j6;

    public b40(byte[] bArr, hg0 hg0Var, InputStream inputStream, MessageDigest messageDigest) throws IOException {
        this.j6 = bArr;
        int i = hg0Var.j6;
        this.DW = i;
        int i2 = 62;
        eg0.DW(inputStream, bArr, i, 62);
        int i3 = 1;
        if (QX()) {
            eg0.DW(inputStream, this.j6, this.DW + 62, 2);
            if ((Hw() & (-1610612737)) != 0) {
                throw new IOException(MessageFormat.format(JGitText.DW().DIRCUnrecognizedExtendedFlags, String.valueOf(Hw())));
            }
            i2 = 64;
        }
        hg0Var.j6 += i2;
        messageDigest.update(this.j6, this.DW, i2);
        int iFH = ig0.FH(this.j6, this.DW + 60) & 4095;
        if (iFH < 4095) {
            byte[] bArr2 = new byte[iFH];
            this.FH = bArr2;
            eg0.DW(inputStream, bArr2, 0, iFH);
            messageDigest.update(this.FH, 0, iFH);
            i3 = 0;
        } else {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr3 = new byte[4095];
            eg0.DW(inputStream, bArr3, 0, 4095);
            byteArrayOutputStream.write(bArr3);
            while (true) {
                int i4 = inputStream.read();
                if (i4 < 0) {
                    throw new EOFException(JGitText.DW().shortReadOfBlock);
                }
                if (i4 == 0) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    this.FH = byteArray;
                    int length = byteArray.length;
                    messageDigest.update(byteArray, 0, length);
                    messageDigest.update((byte) 0);
                    iFH = length;
                    break;
                }
                byteArrayOutputStream.write(i4);
            }
        }
        int i5 = i2 + iFH;
        int i6 = (((i5 + 8) & (-8)) - i5) - i3;
        if (i6 > 0) {
            eg0.VH(inputStream, i6);
            messageDigest.update(v5, 0, i6);
        }
    }

    private long DW(int i) {
        int i2 = this.DW + i;
        return (ig0.DW(this.j6, i2) * 1000) + (ig0.DW(this.j6, i2 + 4) / 1000000);
    }

    private void FH(int i, long j) {
        int i2 = this.DW + i;
        ig0.VH(this.j6, i2, (int) (j / 1000));
        ig0.VH(this.j6, i2 + 4, ((int) (j % 1000)) * 1000000);
    }

    private int Hw() {
        if (QX()) {
            return ig0.FH(this.j6, this.DW + 62) << 16;
        }
        return 0;
    }

    public static boolean Mr(byte[] bArr) {
        if (bArr.length == 0) {
            return false;
        }
        boolean z = false;
        for (byte b : bArr) {
            if (b != 0) {
                if (b != 47) {
                    z = true;
                } else if (z) {
                    z = false;
                }
            }
            return false;
        }
        return z;
    }

    public static int gn(boolean z) {
        return z ? 64 : 62;
    }

    private static String vy(byte[] bArr) {
        return r60.Zo.decode(ByteBuffer.wrap(bArr)).toString();
    }

    public final void BT() {
        int i = this.DW + 36;
        Arrays.fill(this.j6, i, i + 4, (byte) 0);
    }

    public int EQ() {
        return ig0.DW(this.j6, this.DW + 24);
    }

    public final byte[] J0() {
        return this.j6;
    }

    public final int J8() {
        return this.DW + 40;
    }

    public void P8(OutputStream outputStream) throws IOException {
        int i = QX() ? 64 : 62;
        int length = this.FH.length;
        outputStream.write(this.j6, this.DW, i);
        outputStream.write(this.FH, 0, length);
        int i2 = i + length;
        int i3 = (i2 + 8) & (-8);
        if (i2 != i3) {
            outputStream.write(v5, 0, i3 - i2);
        }
    }

    public boolean QX() {
        return (this.j6[this.DW + 60] & 64) != 0;
    }

    public final boolean U2(int i, int i2) {
        int i3 = this.DW + 8;
        return i == ig0.DW(this.j6, i3) && i2 <= ig0.DW(this.j6, i3 + 4);
    }

    public int VH() {
        return ig0.DW(this.j6, this.DW + 36);
    }

    public boolean Ws() {
        return (this.j6[this.DW + 60] & 128) != 0;
    }

    public boolean XL() {
        return (Hw() & 1073741824) != 0;
    }

    public long Zo() {
        return DW(8);
    }

    public void a8(t60 t60Var) {
        int iZo = t60Var.Zo() & 61440;
        if (iZo == 0 || iZo == 16384) {
            throw new IllegalArgumentException(MessageFormat.format(JGitText.DW().invalidModeForPath, t60Var, tp()));
        }
        ig0.VH(this.j6, this.DW + 24, t60Var.Zo());
    }

    public final boolean aM() {
        return VH() == 0 && r60.VH.FH(this.j6, this.DW + 40) != 0;
    }

    public void er(long j) {
        if (2147483647L <= j) {
            throw new IllegalArgumentException(MessageFormat.format(JGitText.DW().sizeExceeds2GB, tp(), Long.valueOf(j)));
        }
        rN((int) j);
    }

    public void gW(byte[] bArr, int i) {
        System.arraycopy(bArr, i, J0(), J8(), 20);
    }

    public boolean j3() {
        return (this.Hw & 1) != 0;
    }

    public void j6(b40 b40Var) {
        int iFH = ig0.FH(this.j6, this.DW + 60) & 4095;
        System.arraycopy(b40Var.j6, b40Var.DW, this.j6, this.DW, 62);
        byte[] bArr = this.j6;
        int i = this.DW;
        ig0.Zo(bArr, i + 60, iFH | (ig0.FH(bArr, i + 60) & (-4096)));
    }

    public void lg(long j) {
        FH(8, j);
    }

    public void rN(int i) {
        ig0.VH(this.j6, this.DW + 36, i);
    }

    public String toString() {
        return v5() + " " + VH() + " " + Zo() + " " + u7() + " " + we() + " " + tp() + "\n";
    }

    public String tp() {
        return vy(this.FH);
    }

    public a70 u7() {
        return a70.ef(J0(), J8());
    }

    public t60 v5() {
        return t60.v5(EQ());
    }

    public int we() {
        return (this.j6[this.DW + 60] >>> 4) & 3;
    }

    public void yS(j60 j60Var) {
        j60Var.tp(J0(), J8());
    }

    public b40(String str) {
        this(r60.DW(str));
    }

    public b40(String str, int i) {
        this(r60.DW(str), i);
    }

    public b40(byte[] bArr) {
        this(bArr, 0);
    }

    public b40(byte[] bArr, int i) {
        if (!Mr(bArr)) {
            throw new IllegalArgumentException(MessageFormat.format(JGitText.DW().invalidPath, vy(bArr)));
        }
        if (i >= 0 && 3 >= i) {
            this.j6 = new byte[62];
            this.DW = 0;
            this.FH = bArr;
            int i2 = (i & 3) << 12;
            ig0.Zo(this.j6, this.DW + 60, bArr.length < 4095 ? bArr.length | i2 : i2 | 4095);
            return;
        }
        throw new IllegalArgumentException(MessageFormat.format(JGitText.DW().invalidStageForPath, Integer.valueOf(i), vy(bArr)));
    }
}
