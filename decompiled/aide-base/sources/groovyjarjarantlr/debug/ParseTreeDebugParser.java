package groovyjarjarantlr.debug;

import groovyjarjarantlr.CommonToken;
import groovyjarjarantlr.LLkParser;
import groovyjarjarantlr.MismatchedTokenException;
import groovyjarjarantlr.ParseTreeRule;
import groovyjarjarantlr.ParseTreeToken;
import groovyjarjarantlr.collections.impl.BitSet;
import java.util.Stack;

/* loaded from: classes.dex */
public class ParseTreeDebugParser extends LLkParser {
    protected Stack Zo;

    @Override // groovyjarjarantlr.Parser
    public void EQ(int i) throws MismatchedTokenException {
        J8();
        super.EQ(i);
    }

    protected void J8() {
        if (this.j6.DW > 0) {
            return;
        }
        ((ParseTreeRule) this.Zo.peek()).we(j6(1) == 1 ? new ParseTreeToken(new CommonToken("EOF")) : new ParseTreeToken(DW(1)));
    }

    @Override // groovyjarjarantlr.Parser
    public void tp(BitSet bitSet) throws MismatchedTokenException {
        J8();
        super.tp(bitSet);
    }

    @Override // groovyjarjarantlr.Parser
    public void u7(int i) throws MismatchedTokenException {
        J8();
        super.u7(i);
    }
}
