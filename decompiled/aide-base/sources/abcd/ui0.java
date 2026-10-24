package abcd;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class ui0 extends InputStream {
    private final fi0 WB;
    private InputStream jw;
    private boolean mb = true;

    public ui0(fi0 fi0Var) {
        this.WB = fi0Var;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        xh0 xh0Var;
        int i3 = 0;
        if (this.jw == null) {
            if (!this.mb || (xh0Var = (xh0) this.WB.DW()) == null) {
                return -1;
            }
            this.mb = false;
            this.jw = xh0Var.j6();
        }
        while (true) {
            int i4 = this.jw.read(bArr, i + i3, i2 - i3);
            if (i4 >= 0) {
                i3 += i4;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                xh0 xh0Var2 = (xh0) this.WB.DW();
                if (xh0Var2 == null) {
                    this.jw = null;
                    if (i3 < 1) {
                        return -1;
                    }
                    return i3;
                }
                this.jw = xh0Var2.j6();
            }
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        xh0 xh0Var;
        if (this.jw == null) {
            if (!this.mb || (xh0Var = (xh0) this.WB.DW()) == null) {
                return -1;
            }
            this.mb = false;
            this.jw = xh0Var.j6();
        }
        while (true) {
            int i = this.jw.read();
            if (i >= 0) {
                return i;
            }
            xh0 xh0Var2 = (xh0) this.WB.DW();
            if (xh0Var2 == null) {
                this.jw = null;
                return -1;
            }
            this.jw = xh0Var2.j6();
        }
    }
}
