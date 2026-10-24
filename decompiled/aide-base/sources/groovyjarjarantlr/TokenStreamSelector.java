package groovyjarjarantlr;

import groovyjarjarantlr.ASdebug.IASDebugStream;
import groovyjarjarantlr.collections.impl.LList;
import java.util.Hashtable;

/* loaded from: classes.dex */
public class TokenStreamSelector implements TokenStream, IASDebugStream {
    protected TokenStream j6;

    public TokenStreamSelector() {
        new LList();
        new Hashtable();
    }

    @Override // groovyjarjarantlr.TokenStream
    public Token j6() {
        while (true) {
            try {
                return this.j6.j6();
            } catch (TokenStreamRetryException unused) {
            }
        }
    }
}
