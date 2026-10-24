package groovyjarjarantlr.debug;

import groovyjarjarantlr.CharScanner;
import groovyjarjarantlr.CharStreamException;
import groovyjarjarantlr.MismatchedCharException;
import groovyjarjarantlr.Token;
import groovyjarjarantlr.collections.impl.BitSet;

/* loaded from: classes.dex */
public abstract class DebuggingCharScanner extends CharScanner implements DebuggingParser {
    private ParserEventSupport EQ;

    @Override // groovyjarjarantlr.CharScanner
    public char DW(int i) {
        char cDW = super.DW(i);
        this.EQ.Hw(i, cDW);
        return cDW;
    }

    @Override // groovyjarjarantlr.CharScanner
    public void Hw() {
        char cDW;
        try {
            cDW = DW(1);
        } catch (CharStreamException unused) {
            cDW = 65437;
        }
        super.Hw();
        this.EQ.j6(cDW);
    }

    @Override // groovyjarjarantlr.CharScanner
    public void J0(BitSet bitSet) throws MismatchedCharException {
        String string = this.j6.toString();
        char cDW = DW(1);
        try {
            super.J0(bitSet);
            this.EQ.VH(cDW, bitSet, string, this.tp.VH);
        } catch (MismatchedCharException e) {
            int i = this.tp.VH;
            if (i == 0) {
                this.EQ.Ws(cDW, bitSet, string, i);
            }
            throw e;
        }
    }

    @Override // groovyjarjarantlr.CharScanner
    public void J8(String str) throws MismatchedCharException {
        StringBuffer stringBuffer = new StringBuffer("");
        int length = str.length();
        for (int i = 1; i <= length; i++) {
            try {
                stringBuffer.append(super.DW(i));
            } catch (Exception unused) {
            }
        }
        try {
            super.J8(str);
            this.EQ.u7(str, this.tp.VH);
        } catch (MismatchedCharException e) {
            if (this.tp.VH == 0) {
                this.EQ.QX(stringBuffer.toString(), str, this.tp.VH);
            }
            throw e;
        }
    }

    @Override // groovyjarjarantlr.CharScanner
    public void QX(char c, char c2) throws MismatchedCharException {
        char cDW = DW(1);
        try {
            super.QX(c, c2);
            ParserEventSupport parserEventSupport = this.EQ;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("");
            stringBuffer.append(c);
            stringBuffer.append(c2);
            parserEventSupport.Zo(cDW, stringBuffer.toString(), this.tp.VH);
        } catch (MismatchedCharException e) {
            if (this.tp.VH == 0) {
                ParserEventSupport parserEventSupport2 = this.EQ;
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("");
                stringBuffer2.append(c);
                stringBuffer2.append(c2);
                parserEventSupport2.J0(cDW, stringBuffer2.toString(), this.tp.VH);
            }
            throw e;
        }
    }

    @Override // groovyjarjarantlr.CharScanner
    public void Ws(char c) throws MismatchedCharException {
        char cDW = DW(1);
        try {
            super.Ws(c);
            this.EQ.tp(cDW, c, this.tp.VH);
        } catch (MismatchedCharException e) {
            int i = this.tp.VH;
            if (i == 0) {
                this.EQ.XL(cDW, c, i);
            }
            throw e;
        }
    }

    @Override // groovyjarjarantlr.CharScanner
    public void XL() {
        super.XL();
        this.EQ.j3(gn());
    }

    @Override // groovyjarjarantlr.CharScanner
    protected Token tp(int i) {
        return super.tp(i);
    }

    @Override // groovyjarjarantlr.CharScanner
    public void we(char c) throws MismatchedCharException {
        char cDW = DW(1);
        try {
            super.we(c);
            this.EQ.v5(c, this.tp.VH);
        } catch (MismatchedCharException e) {
            int i = this.tp.VH;
            if (i == 0) {
                this.EQ.we(cDW, c, i);
            }
            throw e;
        }
    }
}
