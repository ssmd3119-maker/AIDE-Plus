package groovyjarjarantlr;

import groovyjarjarantlr.collections.impl.BitSet;
import groovyjarjarantlr.collections.impl.Vector;

/* loaded from: classes.dex */
public abstract class CodeGenerator {
    protected Grammar DW = null;
    protected Vector FH;
    protected Tool j6;

    public static String j6(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("m");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    public abstract String DW(GrammarAtom grammarAtom, String str);

    public abstract String FH(Vector vector);

    protected String Hw(int i) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("_tokenSet_");
        stringBuffer.append(i);
        return stringBuffer.toString();
    }

    public abstract String VH(String str, ActionTransInfo actionTransInfo);

    public String Zo(String str, int i) {
        GrammarSymbol grammarSymbolDW = this.DW.DW(str);
        if (!(grammarSymbolDW instanceof RuleSymbol)) {
            return null;
        }
        return Hw(gn(this.DW.j6.Zo(i, ((RuleSymbol) grammarSymbolDW).j6().J0).WB));
    }

    protected int gn(BitSet bitSet) {
        for (int i = 0; i < this.FH.gn(); i++) {
            if (bitSet.equals((BitSet) this.FH.FH(i))) {
                return i;
            }
        }
        this.FH.j6(bitSet.clone());
        return this.FH.gn() - 1;
    }

    public String u7(String str) {
        return str;
    }

    public String v5(String str, int i) {
        GrammarSymbol grammarSymbolDW = this.DW.DW(str);
        if (!(grammarSymbolDW instanceof RuleSymbol)) {
            return null;
        }
        return Hw(gn(this.DW.j6.tp(i, ((RuleSymbol) grammarSymbolDW).j6()).WB));
    }
}
