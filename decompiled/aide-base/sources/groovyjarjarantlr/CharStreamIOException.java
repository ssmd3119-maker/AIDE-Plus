package groovyjarjarantlr;

import java.io.IOException;

/* loaded from: classes.dex */
public class CharStreamIOException extends CharStreamException {
    public IOException WB;

    public CharStreamIOException(IOException iOException) {
        super(iOException.getMessage());
        this.WB = iOException;
    }
}
