package abcd;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class mq0 {
    private static int j6 = 512;

    public static byte[] DW(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        j6(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static int FH(InputStream inputStream, byte[] bArr) {
        return Hw(inputStream, bArr, 0, bArr.length);
    }

    public static int Hw(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int i4 = inputStream.read(bArr, i + i3, i2 - i3);
            if (i4 < 0) {
                break;
            }
            i3 += i4;
        }
        return i3;
    }

    public static void j6(InputStream inputStream, OutputStream outputStream) throws IOException {
        int i = j6;
        byte[] bArr = new byte[i];
        while (true) {
            int i2 = inputStream.read(bArr, 0, i);
            if (i2 < 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i2);
            }
        }
    }
}
