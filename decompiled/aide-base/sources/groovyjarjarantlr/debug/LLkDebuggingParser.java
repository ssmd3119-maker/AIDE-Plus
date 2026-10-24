package groovyjarjarantlr.debug;

import groovyjarjarantlr.LLkParser;
import groovyjarjarantlr.MismatchedTokenException;
import groovyjarjarantlr.collections.impl.BitSet;

/* loaded from: classes.dex */
public class LLkDebuggingParser extends LLkParser implements DebuggingParser {
    protected ParserEventSupport Zo;

    @Override // groovyjarjarantlr.Parser
    public void EQ(int i) throws MismatchedTokenException {
        String strJ6 = DW(1).j6();
        int iJ6 = j6(1);
        try {
            super.EQ(i);
            this.Zo.EQ(iJ6, i, strJ6, this.j6.DW);
        } catch (MismatchedTokenException e) {
            int i2 = this.j6.DW;
            if (i2 == 0) {
                this.Zo.aM(iJ6, i, strJ6, i2);
            }
            throw e;
        }
    }

    @Override // groovyjarjarantlr.LLkParser, groovyjarjarantlr.Parser
    public void FH() {
        int iJ6 = j6(1);
        super.FH();
        this.Zo.j6(iJ6);
    }

    @Override // groovyjarjarantlr.LLkParser, groovyjarjarantlr.Parser
    public int j6(int i) {
        int iJ6 = super.j6(i);
        this.Zo.Hw(i, iJ6);
        return iJ6;
    }

    @Override // groovyjarjarantlr.Parser
    public void tp(BitSet bitSet) throws MismatchedTokenException {
        String strJ6 = DW(1).j6();
        int iJ6 = j6(1);
        try {
            super.tp(bitSet);
            this.Zo.VH(iJ6, bitSet, strJ6, this.j6.DW);
        } catch (MismatchedTokenException e) {
            int i = this.j6.DW;
            if (i == 0) {
                this.Zo.Ws(iJ6, bitSet, strJ6, i);
            }
            throw e;
        }
    }

    @Override // groovyjarjarantlr.Parser
    public void u7(int i) throws MismatchedTokenException {
        String strJ6 = DW(1).j6();
        int iJ6 = j6(1);
        try {
            super.u7(i);
            this.Zo.gn(i, strJ6, this.j6.DW);
        } catch (MismatchedTokenException e) {
            int i2 = this.j6.DW;
            if (i2 == 0) {
                this.Zo.J8(iJ6, i, strJ6, i2);
            }
            throw e;
        }
    }
}
