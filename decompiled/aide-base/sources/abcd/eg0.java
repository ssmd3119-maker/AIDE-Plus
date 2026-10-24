package abcd;

import abcd.pg0;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.text.MessageFormat;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class eg0 {
    public static void DW(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        while (i2 > 0) {
            int i3 = inputStream.read(bArr, i, i2);
            if (i3 <= 0) {
                throw new EOFException(JGitText.DW().shortReadOfBlock);
            }
            i += i3;
            i2 -= i3;
        }
    }

    public static final byte[] FH(File file) {
        return Hw(file, Integer.MAX_VALUE);
    }

    public static final byte[] Hw(File file, int i) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long size = fileInputStream.getChannel().size();
            if (size > i) {
                throw new IOException(MessageFormat.format(JGitText.DW().fileIsTooLarge, file));
            }
            byte[] bArr = new byte[(int) size];
            int iJ6 = j6(fileInputStream, bArr, 0);
            if (iJ6 != size) {
                try {
                    fileInputStream.close();
                } catch (IOException unused) {
                }
                return bArr;
            }
            byte[] bArr2 = new byte[iJ6];
            System.arraycopy(bArr, 0, bArr2, 0, iJ6);
            return bArr2;
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException unused2) {
            }
        }
    }

    public static void VH(InputStream inputStream, long j) throws IOException {
        while (j > 0) {
            long jSkip = inputStream.skip(j);
            if (jSkip <= 0) {
                throw new EOFException(JGitText.DW().shortSkipOfBlock);
            }
            j -= jSkip;
        }
    }

    public static ByteBuffer Zo(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                return ByteBuffer.wrap(bArr, 0, i2);
            }
            i2 += i3;
        }
        int i4 = inputStream.read();
        if (i4 < 0) {
            return ByteBuffer.wrap(bArr, 0, i2);
        }
        pg0.c cVar = new pg0.c(Integer.MAX_VALUE);
        cVar.write(bArr);
        cVar.write(i4);
        cVar.DW(inputStream);
        return ByteBuffer.wrap(cVar.J8());
    }

    public static int j6(InputStream inputStream, byte[] bArr, int i) throws IOException {
        int i2 = 0;
        while (true) {
            int i3 = inputStream.read(bArr, i, bArr.length - i);
            if (i3 < 0 || i2 >= bArr.length) {
                break;
            }
            i += i3;
            i2 += i3;
        }
        return i2;
    }

    public static final byte[] v5(File file, int i) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (true) {
                int i3 = fileInputStream.read(bArr, i2, i - i2);
                if (i3 <= 0) {
                    break;
                }
                i2 += i3;
            }
            if (i2 == i) {
                try {
                    fileInputStream.close();
                } catch (IOException unused) {
                }
                return bArr;
            }
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, 0, bArr2, 0, i2);
            try {
                fileInputStream.close();
            } catch (IOException unused2) {
            }
            return bArr2;
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (IOException unused3) {
            }
            throw th;
        }
    }
}
