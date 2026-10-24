package abcd;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/* loaded from: classes.dex */
public class ug0 extends Writer {
    private final ByteArrayOutputStream WB = new ByteArrayOutputStream();
    private final OutputStreamWriter mb = new OutputStreamWriter(j6(), r60.Zo);

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }

    public OutputStream j6() {
        return this.WB;
    }

    public String toString() {
        return kg0.VH(this.WB.toByteArray());
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        synchronized (this.WB) {
            this.mb.write(cArr, i, i2);
            this.mb.flush();
        }
    }
}
