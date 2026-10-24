package abcd;

import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.text.MessageFormat;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class zg0 extends OutputStream {
    private final OutputStream WB;
    private int jw;
    private final tg0 mb;

    public zg0(OutputStream outputStream, tg0 tg0Var) {
        this.WB = outputStream;
        this.mb = tg0Var;
    }

    private void DW() {
        this.mb.DW();
    }

    private static InterruptedIOException Hw() {
        return new InterruptedIOException(JGitText.DW().writeTimedOut);
    }

    private void j6() {
        this.mb.j6(this.jw);
    }

    public void FH(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(MessageFormat.format(JGitText.DW().invalidTimeout, Integer.valueOf(i)));
        }
        this.jw = i;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            try {
                j6();
                this.WB.close();
            } catch (InterruptedIOException unused) {
                throw Hw();
            }
        } finally {
            DW();
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        try {
            try {
                j6();
                this.WB.flush();
            } catch (InterruptedIOException unused) {
                throw Hw();
            }
        } finally {
            DW();
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        try {
            try {
                j6();
                this.WB.write(i);
            } catch (InterruptedIOException unused) {
                throw Hw();
            }
        } finally {
            DW();
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        try {
            try {
                j6();
                this.WB.write(bArr, i, i2);
            } catch (InterruptedIOException unused) {
                throw Hw();
            }
        } finally {
            DW();
        }
    }
}
