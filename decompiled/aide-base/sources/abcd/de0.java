package abcd;

import java.io.IOException;
import java.io.OutputStream;
import java.text.MessageFormat;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class de0 extends OutputStream {
    private final OutputStream WB;
    private int jw;
    private final byte[] mb;

    public de0(int i, int i2, OutputStream outputStream) {
        if (i <= 0 || i > 255) {
            throw new IllegalArgumentException(MessageFormat.format(JGitText.DW().channelMustBeInRange0_255, Integer.valueOf(i)));
        }
        if (i2 <= 5) {
            throw new IllegalArgumentException(MessageFormat.format(JGitText.DW().packetSizeMustBeAtLeast, Integer.valueOf(i2), 5));
        }
        if (65520 < i2) {
            throw new IllegalArgumentException(MessageFormat.format(JGitText.DW().packetSizeMustBeAtMost, Integer.valueOf(i2), 65520));
        }
        this.WB = outputStream;
        byte[] bArr = new byte[i2];
        this.mb = bArr;
        bArr[4] = (byte) i;
        this.jw = 5;
    }

    private void DW() throws IOException {
        nd0.Hw(this.mb, this.jw);
        this.WB.write(this.mb, 0, this.jw);
        this.jw = 5;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        j6();
        this.WB.flush();
    }

    public void j6() throws IOException {
        if (5 < this.jw) {
            DW();
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        while (i2 > 0) {
            byte[] bArr2 = this.mb;
            int length = bArr2.length;
            int i3 = this.jw;
            int i4 = length - i3;
            if (i3 != 5 || i4 >= i2) {
                if (i4 == 0) {
                    DW();
                }
                int iMin = Math.min(i2, i4);
                System.arraycopy(bArr, i, this.mb, this.jw, iMin);
                this.jw += iMin;
                i += iMin;
                i2 -= iMin;
            } else {
                nd0.Hw(bArr2, bArr2.length);
                this.WB.write(this.mb, 0, 5);
                this.WB.write(bArr, i, i4);
                i += i4;
                i2 -= i4;
            }
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        if (this.jw == this.mb.length) {
            DW();
        }
        byte[] bArr = this.mb;
        int i2 = this.jw;
        this.jw = i2 + 1;
        bArr[i2] = (byte) i;
    }
}
