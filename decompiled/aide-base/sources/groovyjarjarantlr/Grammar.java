package groovyjarjarantlr;

import groovyjarjarantlr.collections.impl.Vector;
import java.util.Enumeration;
import java.util.Hashtable;

/* loaded from: classes.dex */
public abstract class Grammar {
    protected Hashtable DW;
    protected boolean FH;
    protected TokenManager Hw;
    protected int VH;
    protected String Zo;
    protected LLkGrammarAnalyzer j6;
    protected Vector v5;

    public GrammarSymbol DW(String str) {
        return (GrammarSymbol) this.DW.get(str);
    }

    public String j6() {
        return this.Zo;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(20000);
        Enumeration enumerationHw = this.v5.Hw();
        while (enumerationHw.hasMoreElements()) {
            RuleSymbol ruleSymbol = (RuleSymbol) enumerationHw.nextElement();
            if (!ruleSymbol.j6.equals("mnextToken")) {
                stringBuffer.append(ruleSymbol.j6().toString());
                stringBuffer.append("\n\n");
            }
        }
        return stringBuffer.toString();
    }
}
