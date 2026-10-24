package abcd;

import java.io.InputStream;

/* loaded from: classes.dex */
public abstract class hk0 extends InputStream {
    protected final InputStream WB;
    private int mb;

    public hk0(InputStream inputStream, int i) {
        this.WB = inputStream;
        this.mb = i;
    }

    public void DW(boolean z) {
        InputStream inputStream = this.WB;
        if (inputStream instanceof ek0) {
            ((ek0) inputStream).Hw(z);
        }
    }

    public int j6() {
        return this.mb;
    }
}
