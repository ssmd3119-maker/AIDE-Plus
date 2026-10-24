package abcd;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.security.DigestOutputStream;
import java.text.MessageFormat;
import java.util.Iterator;
import java.util.List;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public abstract class ab0 {
    protected static final byte[] v5 = {-1, 116, 79, 99};
    protected final byte[] DW;
    protected List<? extends ld0> FH;
    protected byte[] Hw;
    protected final DigestOutputStream j6;

    public ab0(OutputStream outputStream) {
        this.j6 = new DigestOutputStream(outputStream instanceof BufferedOutputStream ? outputStream : new vg0(outputStream), r60.Zo());
        this.DW = new byte[24];
    }

    public static ab0 DW(OutputStream outputStream, int i) {
        if (i == 1) {
            return new bb0(outputStream);
        }
        if (i == 2) {
            return new cb0(outputStream);
        }
        throw new IllegalArgumentException(MessageFormat.format(JGitText.DW().unsupportedPackIndexVersion, Integer.valueOf(i)));
    }

    public static ab0 j6(OutputStream outputStream, List<? extends ld0> list) {
        int i;
        Iterator<? extends ld0> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                i = 1;
                break;
            }
            if (!bb0.gn(it.next())) {
                i = 2;
                break;
            }
        }
        return DW(outputStream, i);
    }

    public void FH(List<? extends ld0> list, byte[] bArr) {
        this.FH = list;
        this.Hw = bArr;
        Zo();
        this.j6.flush();
    }

    public void Hw() {
        this.j6.write(this.Hw);
        this.j6.on(false);
        DigestOutputStream digestOutputStream = this.j6;
        digestOutputStream.write(digestOutputStream.getMessageDigest().digest());
    }

    public void VH(int i) {
        this.j6.write(v5);
        ig0.VH(this.DW, 0, i);
        this.j6.write(this.DW, 0, 4);
    }

    public abstract void Zo();

    public void v5() {
        int i;
        int[] iArr = new int[256];
        Iterator<? extends ld0> it = this.FH.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int iRN = it.next().rN() & 255;
            iArr[iRN] = iArr[iRN] + 1;
        }
        for (i = 1; i < 256; i++) {
            iArr[i] = iArr[i] + iArr[i - 1];
        }
        for (int i2 = 0; i2 < 256; i2++) {
            ig0.VH(this.DW, 0, iArr[i2]);
            this.j6.write(this.DW, 0, 4);
        }
    }
}
