package groovyjarjarantlr;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class ByteBuffer extends InputBuffer {
    public transient InputStream v5;

    @Override // groovyjarjarantlr.InputBuffer
    public void FH(int i) throws CharStreamIOException {
        try {
            Zo();
            while (this.Hw.Hw < this.DW + i) {
                this.Hw.j6((char) this.v5.read());
            }
        } catch (IOException e) {
            throw new CharStreamIOException(e);
        }
    }
}
