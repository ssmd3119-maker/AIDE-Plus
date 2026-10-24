package abcd;

import java.io.FilterWriter;
import java.io.Writer;

/* loaded from: classes.dex */
public final class ys extends FilterWriter {
    private final String WB;
    private int fY;
    private final int jw;
    private int k2;
    private final int mb;
    private boolean qp;

    public ys(Writer writer, int i, String str) {
        super(writer);
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("width < 0");
        }
        if (str == null) {
            throw new NullPointerException("prefix == null");
        }
        this.mb = i != 0 ? i : Integer.MAX_VALUE;
        this.jw = i >> 1;
        this.WB = str.length() == 0 ? null : str;
        j6();
    }

    private void j6() {
        this.fY = 0;
        this.qp = this.jw != 0;
        this.k2 = 0;
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(int i) {
        synchronized (((FilterWriter) this).lock) {
            if (this.qp) {
                if (i == 32) {
                    int i2 = this.k2 + 1;
                    this.k2 = i2;
                    if (i2 >= this.jw) {
                        this.k2 = this.jw;
                        this.qp = false;
                    }
                } else {
                    this.qp = false;
                }
            }
            if (this.fY == this.mb && i != 10) {
                ((FilterWriter) this).out.write(10);
                this.fY = 0;
            }
            if (this.fY == 0) {
                if (this.WB != null) {
                    ((FilterWriter) this).out.write(this.WB);
                }
                if (!this.qp) {
                    for (int i3 = 0; i3 < this.k2; i3++) {
                        ((FilterWriter) this).out.write(32);
                    }
                    this.fY = this.k2;
                }
            }
            ((FilterWriter) this).out.write(i);
            if (i == 10) {
                j6();
            } else {
                this.fY++;
            }
        }
    }

    public ys(Writer writer, int i) {
        this(writer, i, "");
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        synchronized (((FilterWriter) this).lock) {
            while (i2 > 0) {
                write(cArr[i]);
                i++;
                i2--;
            }
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(String str, int i, int i2) {
        synchronized (((FilterWriter) this).lock) {
            while (i2 > 0) {
                write(str.charAt(i));
                i++;
                i2--;
            }
        }
    }
}
