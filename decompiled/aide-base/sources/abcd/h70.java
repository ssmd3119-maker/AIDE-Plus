package abcd;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public abstract class h70 extends InputStream {

    public static class a extends h70 {
        private final long WB;
        private final InputStream mb;

        public a(int i, long j, InputStream inputStream) {
            this.WB = j;
            this.mb = inputStream;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.mb.available();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.mb.close();
        }

        @Override // abcd.h70
        public long j6() {
            return this.WB;
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            this.mb.mark(i);
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return this.mb.markSupported();
        }

        @Override // java.io.InputStream
        public int read() {
            return this.mb.read();
        }

        @Override // java.io.InputStream
        public void reset() throws IOException {
            this.mb.reset();
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            return this.mb.skip(j);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            return this.mb.read(bArr, i, i2);
        }
    }

    public static class b extends h70 {
        private final byte[] WB;
        private int jw;
        private int mb;

        public b(f70 f70Var) {
            this(f70Var.VH(), f70Var.Hw());
        }

        @Override // java.io.InputStream
        public int available() {
            return this.WB.length - this.mb;
        }

        @Override // abcd.h70
        public long j6() {
            return this.WB.length;
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            this.jw = this.mb;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            int i = this.mb;
            byte[] bArr = this.WB;
            if (i == bArr.length) {
                return -1;
            }
            this.mb = i + 1;
            return bArr[i] & 255;
        }

        @Override // java.io.InputStream
        public void reset() {
            this.mb = this.jw;
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            int iMin = (int) Math.min(available(), Math.max(0L, j));
            this.mb += iMin;
            return iMin;
        }

        public b(int i, byte[] bArr) {
            this.WB = bArr;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            if (this.mb == this.WB.length) {
                return -1;
            }
            int iMin = Math.min(available(), i2);
            System.arraycopy(this.WB, this.mb, bArr, i, iMin);
            this.mb += iMin;
            return iMin;
        }
    }

    public abstract long j6();
}
