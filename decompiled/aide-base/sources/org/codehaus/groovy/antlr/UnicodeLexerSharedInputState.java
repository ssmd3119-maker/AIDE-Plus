package org.codehaus.groovy.antlr;

import groovyjarjarantlr.LexerSharedInputState;

/* loaded from: classes.dex */
public class UnicodeLexerSharedInputState extends LexerSharedInputState {
    private final UnicodeEscapingReader gn;
    private int u7;

    @Override // groovyjarjarantlr.LexerSharedInputState
    public int FH() {
        int iFH;
        int iDW;
        if (this.DW == this.Hw) {
            iFH = super.FH();
            iDW = this.gn.DW();
        } else {
            iFH = super.FH();
            iDW = this.u7;
        }
        return iFH + iDW;
    }

    @Override // groovyjarjarantlr.LexerSharedInputState
    public int j6() {
        this.u7 = this.gn.DW();
        return super.j6() + this.u7;
    }
}
