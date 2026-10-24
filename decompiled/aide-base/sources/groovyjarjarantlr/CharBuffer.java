package groovyjarjarantlr;

import java.io.IOException;
import java.io.Reader;

/* loaded from: classes.dex */
public class CharBuffer extends InputBuffer {
    public transient Reader v5;

    public CharBuffer(Reader reader) {
        this.v5 = reader;
    }

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
