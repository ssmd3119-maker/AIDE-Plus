package abcd;

import abcd.h70;
import abcd.n40;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public abstract class f70 {

    public static class a extends f70 {
        private final byte[] DW;
        private final int j6;

        public a(int i, byte[] bArr) {
            this.j6 = i;
            this.DW = bArr;
        }

        @Override // abcd.f70
        public byte[] Hw() {
            return this.DW;
        }

        @Override // abcd.f70
        public int VH() {
            return this.j6;
        }

        @Override // abcd.f70
        public long Zo() {
            return Hw().length;
        }

        @Override // abcd.f70
        public boolean gn() {
            return false;
        }

        @Override // abcd.f70
        public h70 u7() {
            return new h70.b(this);
        }
    }

    private static byte[] j6(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public void DW(OutputStream outputStream) throws IOException {
        if (!gn()) {
            outputStream.write(Hw());
            return;
        }
        h70 h70VarU7 = u7();
        try {
            long jJ6 = h70VarU7.j6();
            byte[] bArr = new byte[8192];
            long j = 0;
            while (j < jJ6) {
                int i = h70VarU7.read(bArr);
                if (i < 0) {
                    throw new EOFException();
                }
                outputStream.write(bArr, 0, i);
                j += i;
            }
            if (h70VarU7.read() >= 0) {
                throw new EOFException();
            }
        } finally {
            h70VarU7.close();
        }
    }

    public final byte[] FH(int i) {
        try {
            return j6(v5(i));
        } catch (OutOfMemoryError e) {
            throw new n40.c(e);
        }
    }

    public abstract byte[] Hw();

    public abstract int VH();

    public abstract long Zo();

    public abstract boolean gn();

    public abstract h70 u7();

    public byte[] v5(int i) throws IOException {
        if (!gn()) {
            return Hw();
        }
        h70 h70VarU7 = u7();
        try {
            long jJ6 = h70VarU7.j6();
            long j = i;
            if (j < jJ6) {
                throw new n40.b(j, jJ6);
            }
            if (2147483647L < jJ6) {
                throw new n40.a();
            }
            int i2 = (int) jJ6;
            try {
                byte[] bArr = new byte[i2];
                eg0.DW(h70VarU7, bArr, 0, i2);
                return bArr;
            } catch (OutOfMemoryError e) {
                throw new n40.c(e);
            }
        } finally {
            h70VarU7.close();
        }
    }
}
