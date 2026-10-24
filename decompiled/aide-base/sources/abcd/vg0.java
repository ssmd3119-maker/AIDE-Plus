package abcd;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class vg0 extends BufferedOutputStream {
    public vg0(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            flush();
        } finally {
            super.close();
        }
    }

    public vg0(OutputStream outputStream, int i) {
        super(outputStream);
    }
}
