package abcd;

import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.util.zip.CRC32;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public final class fc0 extends OutputStream {
    private byte[] AL;
    private final j70 WB;
    private final gc0 jw;
    private long k2;
    private final OutputStream mb;
    private final CRC32 fY = new CRC32();
    private final MessageDigest qp = r60.Zo();
    private byte[] zh = new byte[32];
    private long w9 = 131072;

    public fc0(j70 j70Var, OutputStream outputStream, gc0 gc0Var) {
        this.WB = j70Var;
        this.mb = outputStream;
        this.jw = gc0Var;
    }

    private int j6(int i, long j) {
        long j2 = j >>> 4;
        this.zh[0] = (byte) ((j & 15) | (i << 4) | (j2 > 0 ? 128 : 0));
        int i2 = 1;
        while (j2 > 0) {
            long j3 = j2 >>> 7;
            int i3 = i2 + 1;
            this.zh[i2] = (byte) ((j2 & 127) | (j3 > 0 ? 128 : 0));
            j2 = j3;
            i2 = i3;
        }
        return i2;
    }

    public void DW() {
        this.WB.v5(1);
    }

    public void EQ(dc0 dc0Var, long j) {
        dc0 dc0VarXX;
        if (!dc0Var.et()) {
            write(this.zh, 0, j6(dc0Var.jJ(), j));
            return;
        }
        if (!this.jw.aM() || (dc0VarXX = dc0Var.XX()) == null || !dc0VarXX.hz()) {
            int iJ6 = j6(7, j);
            dc0Var.kQ().tp(this.zh, iJ6);
            write(this.zh, 0, iJ6 + 20);
            return;
        }
        long j2 = this.k2;
        write(this.zh, 0, j6(6, j));
        long jQq = j2 - dc0VarXX.Qq();
        byte[] bArr = this.zh;
        int length = bArr.length - 1;
        bArr[length] = (byte) (jQq & 127);
        while (true) {
            long j3 = jQq >> 7;
            if (j3 <= 0) {
                byte[] bArr2 = this.zh;
                write(bArr2, length, bArr2.length - length);
                return;
            } else {
                length--;
                this.zh[length] = (byte) (128 | (r0 & 127));
                jQq = j3 - 1;
            }
        }
    }

    public int FH() {
        return (int) this.fY.getValue();
    }

    public byte[] Hw() {
        if (this.AL == null) {
            this.AL = new byte[16384];
        }
        return this.AL;
    }

    public byte[] Zo() {
        return this.qp.digest();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.mb.flush();
    }

    public long gn() {
        return this.k2;
    }

    public void tp(int i, long j) {
        System.arraycopy(r60.v5, 0, this.zh, 0, 4);
        ig0.VH(this.zh, 4, i);
        ig0.VH(this.zh, 8, (int) j);
        write(this.zh, 0, 12);
    }

    public void u7() {
        this.fY.reset();
    }

    public void we(dc0 dc0Var) {
        this.jw.g3(this, dc0Var);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.k2++;
        this.mb.write(i);
        this.fY.update(i);
        this.qp.update((byte) i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            int iMin = Math.min(i2, 131072);
            long j = this.k2 + iMin;
            this.k2 = j;
            if (this.w9 <= j) {
                if (!this.WB.isCancelled()) {
                    this.w9 = this.k2 + 131072;
                } else {
                    throw new IOException(JGitText.DW().packingCancelledDuringObjectsWriting);
                }
            }
            this.mb.write(bArr, i, iMin);
            this.fY.update(bArr, i, iMin);
            this.qp.update(bArr, i, iMin);
            i += iMin;
            i2 -= iMin;
        }
    }
}
