package groovyjarjarantlr;

import java.io.IOException;

/* loaded from: classes.dex */
public class TokenStreamIOException extends TokenStreamException {
    public TokenStreamIOException(IOException iOException) {
        super(iOException.getMessage());
    }
}
