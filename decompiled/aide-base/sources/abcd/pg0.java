package abcd;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public abstract class pg0 extends OutputStream {
    private ArrayList<a> WB;
    private OutputStream jw;
    private int mb;

    public static class c extends pg0 {
        public c(int i) {
            super(i);
        }

        @Override // abcd.pg0
        public OutputStream tp() throws IOException {
            throw new IOException(JGitText.DW().inMemoryBufferLimitExceeded);
        }
    }

    public static class d extends pg0 {
        private final File fY;
        private File qp;

        public d() {
            this(null, 1048576);
        }

        @Override // abcd.pg0
        public void FH() {
            super.FH();
            File file = this.qp;
            if (file != null) {
                try {
                    if (!file.delete()) {
                        this.qp.deleteOnExit();
                    }
                } finally {
                    this.qp = null;
                }
            }
        }

        @Override // abcd.pg0
        public byte[] J8() throws IOException {
            if (this.qp == null) {
                return super.J8();
            }
            long jGn = gn();
            if (2147483647L < jGn) {
                throw new OutOfMemoryError(JGitText.DW().lengthExceedsMaximumArraySize);
            }
            int i = (int) jGn;
            byte[] bArr = new byte[i];
            FileInputStream fileInputStream = new FileInputStream(this.qp);
            try {
                eg0.DW(fileInputStream, bArr, 0, i);
                return bArr;
            } finally {
                fileInputStream.close();
            }
        }

        @Override // abcd.pg0
        public void Ws(OutputStream outputStream, j70 j70Var) throws IOException {
            if (this.qp == null) {
                super.Ws(outputStream, j70Var);
                return;
            }
            if (j70Var == null) {
                j70Var = x60.j6;
            }
            FileInputStream fileInputStream = new FileInputStream(this.qp);
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i < 0) {
                        return;
                    }
                    outputStream.write(bArr, 0, i);
                    j70Var.v5(i / 1024);
                }
            } finally {
                fileInputStream.close();
            }
        }

        @Override // abcd.pg0
        public long gn() {
            File file = this.qp;
            return file == null ? super.gn() : file.length();
        }

        @Override // abcd.pg0
        public OutputStream tp() {
            this.qp = File.createTempFile("jgit_", ".buf", this.fY);
            return new FileOutputStream(this.qp);
        }

        @Override // abcd.pg0
        public InputStream u7() {
            return this.qp == null ? super.u7() : new FileInputStream(this.qp);
        }

        public d(File file, int i) {
            super(i);
            this.fY = file;
        }
    }

    public pg0(int i) {
        this.mb = i;
        we();
    }

    private boolean EQ() throws IOException {
        if (Hw() < this.mb) {
            return false;
        }
        J0();
        return true;
    }

    private long Hw() {
        return ((this.WB.size() - 1) * 8192) + Zo().DW;
    }

    private void J0() throws IOException {
        this.jw = tp();
        a aVarRemove = this.WB.remove(r0.size() - 1);
        Iterator<a> it = this.WB.iterator();
        while (it.hasNext()) {
            a next = it.next();
            this.jw.write(next.j6, 0, next.DW);
        }
        this.WB = null;
        vg0 vg0Var = new vg0(this.jw, 8192);
        this.jw = vg0Var;
        vg0Var.write(aVarRemove.j6, 0, aVarRemove.DW);
    }

    private a Zo() {
        return this.WB.get(r0.size() - 1);
    }

    public void DW(InputStream inputStream) {
        if (this.WB != null) {
            while (true) {
                a aVarZo = Zo();
                if (aVarZo.j6()) {
                    if (EQ()) {
                        break;
                    }
                    aVarZo = new a();
                    this.WB.add(aVarZo);
                }
                byte[] bArr = aVarZo.j6;
                int i = aVarZo.DW;
                int i2 = inputStream.read(bArr, i, bArr.length - i);
                if (i2 < 1) {
                    return;
                } else {
                    aVarZo.DW += i2;
                }
            }
        }
        byte[] bArr2 = new byte[8192];
        while (true) {
            int i3 = inputStream.read(bArr2);
            if (i3 <= 0) {
                return;
            } else {
                this.jw.write(bArr2, 0, i3);
            }
        }
    }

    public void FH() {
        this.WB = null;
        OutputStream outputStream = this.jw;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
            } catch (Throwable th) {
                this.jw = null;
                throw th;
            }
            this.jw = null;
        }
    }

    public byte[] J8() {
        long jGn = gn();
        if (2147483647L < jGn) {
            throw new OutOfMemoryError(JGitText.DW().lengthExceedsMaximumArraySize);
        }
        byte[] bArr = new byte[(int) jGn];
        Iterator<a> it = this.WB.iterator();
        int i = 0;
        while (it.hasNext()) {
            a next = it.next();
            System.arraycopy(next.j6, 0, bArr, i, next.DW);
            i += next.DW;
        }
        return bArr;
    }

    public void Ws(OutputStream outputStream, j70 j70Var) throws IOException {
        if (j70Var == null) {
            j70Var = x60.j6;
        }
        Iterator<a> it = this.WB.iterator();
        while (it.hasNext()) {
            a next = it.next();
            outputStream.write(next.j6, 0, next.DW);
            j70Var.v5(next.DW / 1024);
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        OutputStream outputStream = this.jw;
        if (outputStream != null) {
            try {
                outputStream.close();
            } finally {
                this.jw = null;
            }
        }
    }

    public long gn() {
        return Hw();
    }

    public abstract OutputStream tp();

    public InputStream u7() {
        return new b();
    }

    public void we() {
        if (this.jw != null) {
            FH();
        }
        if (this.mb < 8192) {
            ArrayList<a> arrayList = new ArrayList<>(1);
            this.WB = arrayList;
            arrayList.add(new a(this.mb));
        } else {
            ArrayList<a> arrayList2 = new ArrayList<>(this.mb / 8192);
            this.WB = arrayList2;
            arrayList2.add(new a());
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        OutputStream outputStream = this.jw;
        if (outputStream != null) {
            outputStream.write(i);
            return;
        }
        a aVarZo = Zo();
        if (aVarZo.j6()) {
            if (EQ()) {
                this.jw.write(i);
                return;
            } else {
                aVarZo = new a();
                this.WB.add(aVarZo);
            }
        }
        byte[] bArr = aVarZo.j6;
        int i2 = aVarZo.DW;
        aVarZo.DW = i2 + 1;
        bArr[i2] = (byte) i;
    }

    static class a {
        int DW;
        final byte[] j6;

        public a() {
            this.j6 = new byte[8192];
        }

        public boolean j6() {
            return this.DW == this.j6.length;
        }

        public a(int i) {
            this.j6 = new byte[i];
        }
    }

    private class b extends InputStream {
        private byte[] WB;
        private int fY;
        private a jw;
        private int mb;

        public b() {
            this.jw = (a) pg0.this.WB.get(this.mb);
        }

        private boolean j6() {
            int i = this.mb + 1;
            this.mb = i;
            if (i >= pg0.this.WB.size()) {
                return false;
            }
            this.jw = (a) pg0.this.WB.get(this.mb);
            this.fY = 0;
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.WB == null) {
                this.WB = new byte[1];
            }
            if (read(this.WB) == 1) {
                return this.WB[0] & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            long j2 = 0;
            while (0 < j) {
                int iMin = (int) Math.min(this.jw.DW - this.fY, j);
                if (iMin <= 0) {
                    if (!j6()) {
                        break;
                    }
                } else {
                    this.fY += iMin;
                    long j3 = iMin;
                    j2 += j3;
                    j -= j3;
                }
            }
            return j2;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            int i3 = 0;
            if (i2 == 0) {
                return 0;
            }
            while (i2 > 0) {
                int iMin = Math.min(this.jw.DW - this.fY, i2);
                if (iMin > 0) {
                    System.arraycopy(this.jw.j6, this.fY, bArr, i, iMin);
                    this.fY += iMin;
                    i += iMin;
                    i2 -= iMin;
                    i3 += iMin;
                } else if (!j6()) {
                    break;
                }
            }
            if (i3 > 0) {
                return i3;
            }
            return -1;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.jw == null) {
            while (i2 > 0) {
                a aVarZo = Zo();
                if (aVarZo.j6()) {
                    if (EQ()) {
                        break;
                    }
                    aVarZo = new a();
                    this.WB.add(aVarZo);
                }
                int iMin = Math.min(aVarZo.j6.length - aVarZo.DW, i2);
                System.arraycopy(bArr, i, aVarZo.j6, aVarZo.DW, iMin);
                aVarZo.DW += iMin;
                i2 -= iMin;
                i += iMin;
            }
        }
        if (i2 > 0) {
            this.jw.write(bArr, i, i2);
        }
    }
}
