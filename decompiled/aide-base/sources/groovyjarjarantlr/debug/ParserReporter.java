package groovyjarjarantlr.debug;

import java.io.PrintStream;

/* loaded from: classes.dex */
public class ParserReporter extends Tracer implements ParserListener {
    @Override // groovyjarjarantlr.debug.ParserMatchListener
    public void BT(ParserMatchEvent parserMatchEvent) {
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.WB);
        stringBuffer.append(parserMatchEvent);
        printStream.println(stringBuffer.toString());
    }

    @Override // groovyjarjarantlr.debug.ParserMatchListener
    public void J8(ParserMatchEvent parserMatchEvent) {
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.WB);
        stringBuffer.append(parserMatchEvent);
        printStream.println(stringBuffer.toString());
    }

    @Override // groovyjarjarantlr.debug.ParserTokenListener
    public void U2(ParserTokenEvent parserTokenEvent) {
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.WB);
        stringBuffer.append(parserTokenEvent);
        printStream.println(stringBuffer.toString());
    }

    @Override // groovyjarjarantlr.debug.SyntacticPredicateListener
    public void Ws(SyntacticPredicateEvent syntacticPredicateEvent) {
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.WB);
        stringBuffer.append(syntacticPredicateEvent);
        printStream.println(stringBuffer.toString());
    }

    @Override // groovyjarjarantlr.debug.ParserMatchListener
    public void XL(ParserMatchEvent parserMatchEvent) {
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.WB);
        stringBuffer.append(parserMatchEvent);
        printStream.println(stringBuffer.toString());
    }

    @Override // groovyjarjarantlr.debug.SyntacticPredicateListener
    public void er(SyntacticPredicateEvent syntacticPredicateEvent) {
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.WB);
        stringBuffer.append(syntacticPredicateEvent);
        printStream.println(stringBuffer.toString());
    }

    @Override // groovyjarjarantlr.debug.MessageListener
    public void gW(MessageEvent messageEvent) {
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.WB);
        stringBuffer.append(messageEvent);
        printStream.println(stringBuffer.toString());
    }

    @Override // groovyjarjarantlr.debug.SemanticPredicateListener
    public void j6(SemanticPredicateEvent semanticPredicateEvent) {
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.WB);
        stringBuffer.append(semanticPredicateEvent);
        printStream.println(stringBuffer.toString());
    }

    @Override // groovyjarjarantlr.debug.MessageListener
    public void tp(MessageEvent messageEvent) {
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.WB);
        stringBuffer.append(messageEvent);
        printStream.println(stringBuffer.toString());
    }

    @Override // groovyjarjarantlr.debug.SyntacticPredicateListener
    public void u7(SyntacticPredicateEvent syntacticPredicateEvent) {
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.WB);
        stringBuffer.append(syntacticPredicateEvent);
        printStream.println(stringBuffer.toString());
    }

    @Override // groovyjarjarantlr.debug.ParserTokenListener
    public void vy(ParserTokenEvent parserTokenEvent) {
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.WB);
        stringBuffer.append(parserTokenEvent);
        printStream.println(stringBuffer.toString());
    }

    @Override // groovyjarjarantlr.debug.ParserMatchListener
    public void we(ParserMatchEvent parserMatchEvent) {
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.WB);
        stringBuffer.append(parserMatchEvent);
        printStream.println(stringBuffer.toString());
    }
}
