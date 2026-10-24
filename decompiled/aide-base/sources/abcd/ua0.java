package abcd;

import abcd.ja0;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.security.DigestOutputStream;
import java.security.MessageDigest;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* loaded from: classes.dex */
public class ua0 extends e70 {
    private static /* synthetic */ int[] Zo;
    private final ja0 FH;
    private final pb0 Hw;
    private Deflater v5;

    public ua0(ja0 ja0Var, q60 q60Var) {
        this.FH = ja0Var;
        this.Hw = (pb0) q60Var.tp(pb0.Hw);
    }

    public static /* synthetic */ int[] J0() {
        int[] iArr = Zo;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[ja0.c.valuesCustom().length];
        try {
            iArr2[ja0.c.EXISTS_LOOSE.ordinal()] = 3;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[ja0.c.EXISTS_PACKED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[ja0.c.FAILURE.ordinal()] = 4;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ja0.c.INSERTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        Zo = iArr2;
        return iArr2;
    }

    private a70 Ws(File file, a70 a70Var) throws v40 {
        int i = J0()[this.FH.lg(file, a70Var, false).ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return a70Var;
        }
        throw new v40("Unable to create new object: " + this.FH.u7(a70Var));
    }

    private static EOFException XL(long j) {
        return new EOFException("Input did not match supplied length. " + j + " bytes are missing.");
    }

    private File aM(int i, byte[] bArr, int i2, int i3) throws InterruptedException, IOException {
        File fileQX = QX();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileQX);
            try {
                DeflaterOutputStream deflaterOutputStreamJ8 = J8(this.Hw.DW() ? Channels.newOutputStream(fileOutputStream.getChannel()) : fileOutputStream);
                Mr(deflaterOutputStreamJ8, i, i3);
                deflaterOutputStreamJ8.write(bArr, i2, i3);
                deflaterOutputStreamJ8.finish();
                return fileQX;
            } finally {
                if (this.Hw.DW()) {
                    fileOutputStream.getChannel().force(true);
                }
                fileOutputStream.close();
            }
        } catch (Throwable th) {
            cg0.j6(fileQX);
            throw th;
        }
    }

    private File j3(MessageDigest messageDigest, int i, long j, InputStream inputStream) throws InterruptedException, IOException {
        File fileQX = QX();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileQX);
            try {
                DeflaterOutputStream deflaterOutputStreamJ8 = J8(this.Hw.DW() ? Channels.newOutputStream(fileOutputStream.getChannel()) : fileOutputStream);
                DigestOutputStream digestOutputStream = new DigestOutputStream(deflaterOutputStreamJ8, messageDigest);
                Mr(digestOutputStream, i, j);
                byte[] bArrJ6 = j6();
                while (j > 0) {
                    int i2 = inputStream.read(bArrJ6, 0, (int) Math.min(j, bArrJ6.length));
                    if (i2 <= 0) {
                        throw XL(j);
                    }
                    digestOutputStream.write(bArrJ6, 0, i2);
                    j -= i2;
                }
                digestOutputStream.flush();
                deflaterOutputStreamJ8.finish();
                return fileQX;
            } finally {
                if (this.Hw.DW()) {
                    fileOutputStream.getChannel().force(true);
                }
                fileOutputStream.close();
            }
        } catch (Throwable th) {
            cg0.j6(fileQX);
            throw th;
        }
    }

    @Override // abcd.e70
    public jd0 EQ(InputStream inputStream) {
        return new va0(this.FH, inputStream);
    }

    @Override // abcd.e70
    public void FH() {
    }

    public DeflaterOutputStream J8(OutputStream outputStream) {
        Deflater deflater = this.v5;
        if (deflater == null) {
            this.v5 = new Deflater(this.Hw.j6());
        } else {
            deflater.reset();
        }
        return new DeflaterOutputStream(outputStream, this.v5, 8192);
    }

    public void Mr(OutputStream outputStream, int i, long j) {
        outputStream.write(r60.v5(i));
        outputStream.write(32);
        outputStream.write(r60.FH(j));
        outputStream.write(0);
    }

    public File QX() {
        return File.createTempFile("noz", null, this.FH.we());
    }

    @Override // abcd.e70
    public a70 Zo(int i, long j, InputStream inputStream) throws InterruptedException, IOException {
        if (j <= j6().length) {
            byte[] bArrJ6 = j6();
            return gn(i, bArrJ6, 0, eg0.j6(inputStream, bArrJ6, 0));
        }
        MessageDigest messageDigestDW = DW();
        File fileJ3 = j3(messageDigestDW, i, j, inputStream);
        a70 a70VarSG = a70.sG(messageDigestDW.digest());
        Ws(fileJ3, a70VarSG);
        return a70VarSG;
    }

    @Override // abcd.e70
    public a70 gn(int i, byte[] bArr, int i2, int i3) throws v40 {
        a70 a70VarV5 = v5(i, bArr, i2, i3);
        if (this.FH.FH(a70VarV5)) {
            return a70VarV5;
        }
        Ws(aM(i, bArr, i2, i3), a70VarV5);
        return a70VarV5;
    }

    @Override // abcd.e70
    public void we() {
        Deflater deflater = this.v5;
        if (deflater != null) {
            try {
                deflater.end();
            } finally {
                this.v5 = null;
            }
        }
    }
}
