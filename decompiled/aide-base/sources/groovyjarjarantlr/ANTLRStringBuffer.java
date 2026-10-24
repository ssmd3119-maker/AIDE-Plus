package groovyjarjarantlr;

/* loaded from: classes.dex */
public class ANTLRStringBuffer {
    protected int DW = 0;
    protected char[] j6;

    public ANTLRStringBuffer() {
        this.j6 = null;
        this.j6 = new char[50];
    }

    public final void DW(String str) {
        for (int i = 0; i < str.length(); i++) {
            j6(str.charAt(i));
        }
    }

    public final char[] FH() {
        return this.j6;
    }

    public final int Hw() {
        return this.DW;
    }

    public final void j6(char c) {
        int i = this.DW;
        char[] cArr = this.j6;
        if (i >= cArr.length) {
            int length = cArr.length;
            while (this.DW >= length) {
                length *= 2;
            }
            char[] cArr2 = new char[length];
            for (int i2 = 0; i2 < this.DW; i2++) {
                cArr2[i2] = this.j6[i2];
            }
            this.j6 = cArr2;
        }
        char[] cArr3 = this.j6;
        int i3 = this.DW;
        cArr3[i3] = c;
        this.DW = i3 + 1;
    }

    public final String toString() {
        return new String(this.j6, 0, this.DW);
    }

    public final void v5(int i) {
        if (i < this.DW) {
            this.DW = i;
        } else {
            while (i > this.DW) {
                j6((char) 0);
            }
        }
    }
}
