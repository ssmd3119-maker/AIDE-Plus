package groovyjarjarantlr;

import groovyjarjarantlr.ASdebug.IASDebugStream;
import groovyjarjarantlr.collections.impl.BitSet;

/* loaded from: classes.dex */
public class TokenStreamBasicFilter implements TokenStream, IASDebugStream {
    protected TokenStream DW;
    protected BitSet j6;

    @Override // groovyjarjarantlr.TokenStream
    public Token j6() {
        Token tokenJ6 = this.DW.j6();
        while (tokenJ6 != null && this.j6.gn(tokenJ6.Hw())) {
            tokenJ6 = this.DW.j6();
        }
        return tokenJ6;
    }
}
