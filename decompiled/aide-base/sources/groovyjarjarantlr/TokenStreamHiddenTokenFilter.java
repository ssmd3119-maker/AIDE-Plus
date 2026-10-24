package groovyjarjarantlr;

import groovyjarjarantlr.collections.impl.BitSet;

/* loaded from: classes.dex */
public class TokenStreamHiddenTokenFilter extends TokenStreamBasicFilter implements TokenStream {
    protected BitSet FH;
    protected CommonHiddenStreamToken Hw;
    protected CommonHiddenStreamToken Zo;
    protected CommonHiddenStreamToken v5;

    private void Hw() {
        FH();
        CommonHiddenStreamToken commonHiddenStreamTokenDW = null;
        while (true) {
            if (!this.FH.gn(DW(1).Hw()) && !this.j6.gn(DW(1).Hw())) {
                return;
            }
            if (this.FH.gn(DW(1).Hw())) {
                if (commonHiddenStreamTokenDW == null) {
                    commonHiddenStreamTokenDW = DW(1);
                } else {
                    commonHiddenStreamTokenDW.J0(DW(1));
                    DW(1).J8(commonHiddenStreamTokenDW);
                    commonHiddenStreamTokenDW = DW(1);
                }
                this.v5 = commonHiddenStreamTokenDW;
                if (this.Zo == null) {
                    this.Zo = commonHiddenStreamTokenDW;
                }
            }
            FH();
        }
    }

    protected CommonHiddenStreamToken DW(int i) {
        return this.Hw;
    }

    protected void FH() {
        this.Hw = (CommonHiddenStreamToken) this.DW.j6();
    }

    @Override // groovyjarjarantlr.TokenStreamBasicFilter, groovyjarjarantlr.TokenStream
    public Token j6() {
        if (DW(1) == null) {
            Hw();
        }
        CommonHiddenStreamToken commonHiddenStreamTokenDW = DW(1);
        commonHiddenStreamTokenDW.J8(this.v5);
        this.v5 = null;
        FH();
        CommonHiddenStreamToken commonHiddenStreamTokenDW2 = commonHiddenStreamTokenDW;
        while (true) {
            if (!this.FH.gn(DW(1).Hw()) && !this.j6.gn(DW(1).Hw())) {
                return commonHiddenStreamTokenDW;
            }
            if (this.FH.gn(DW(1).Hw())) {
                commonHiddenStreamTokenDW2.J0(DW(1));
                if (commonHiddenStreamTokenDW2 != commonHiddenStreamTokenDW) {
                    DW(1).J8(commonHiddenStreamTokenDW2);
                }
                commonHiddenStreamTokenDW2 = DW(1);
                this.v5 = commonHiddenStreamTokenDW2;
            }
            FH();
        }
    }
}
