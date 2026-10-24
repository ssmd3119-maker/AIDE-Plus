package abcd;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.text.MessageFormat;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class yg0 extends FilterInputStream {
    private final tg0 WB;
    private int mb;

    public yg0(InputStream inputStream, tg0 tg0Var) {
        super(inputStream);
        this.WB = tg0Var;
    }

    private void DW() {
        this.WB.DW();
    }

    private static InterruptedIOException Hw() {
        return new InterruptedIOException(JGitText.DW().readTimedOut);
    }

    private void j6() {
        this.WB.j6(this.mb);
    }

    public int FH() {
        return this.mb;
    }

    public void Zo(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(MessageFormat.format(JGitText.DW().invalidTimeout, Integer.valueOf(i)));
        }
        this.mb = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        try {
            try {
                j6();
                return super.read();
            } catch (InterruptedIOException unused) {
                throw Hw();
            }
        } finally {
            DW();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        try {
            try {
                j6();
                return super.skip(j);
            } catch (InterruptedIOException unused) {
                throw Hw();
            }
        } finally {
            DW();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        try {
            try {
                j6();
                return super.read(bArr, i, i2);
            } catch (InterruptedIOException unused) {
                throw Hw();
            }
        } finally {
            DW();
        }
    }
}
