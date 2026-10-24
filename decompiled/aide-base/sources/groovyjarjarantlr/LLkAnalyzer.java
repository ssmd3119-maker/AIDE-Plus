package groovyjarjarantlr;

import groovyjarjarantlr.collections.impl.BitSet;
import java.io.PrintStream;

/* loaded from: classes.dex */
public class LLkAnalyzer implements LLkGrammarAnalyzer {
    private AlternativeBlock DW;
    protected Tool FH;
    protected Grammar Hw;
    CharFormatter Zo;
    public boolean j6;
    protected boolean v5;

    private void j3(BitSet bitSet, AlternativeElement alternativeElement) {
        AlternativeBlock alternativeBlock = this.DW;
        AlternativeElement alternativeElement2 = alternativeBlock.Zo(alternativeBlock.tp).j6;
        if (alternativeElement2 instanceof TreeElement) {
            if (((TreeElement) alternativeElement2).we != alternativeElement) {
                return;
            }
        } else if (alternativeElement != alternativeElement2) {
            return;
        }
        int i = 0;
        while (true) {
            AlternativeBlock alternativeBlock2 = this.DW;
            if (i >= alternativeBlock2.tp) {
                return;
            }
            bitSet.XL(alternativeBlock2.Zo(i).j6.FH(1).WB);
            i++;
        }
    }

    @Override // groovyjarjarantlr.LLkGrammarAnalyzer
    public Lookahead DW(int i, TokenRangeElement tokenRangeElement) {
        if (this.j6) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("lookTokenRange(");
            stringBuffer.append(i);
            stringBuffer.append(",");
            stringBuffer.append(tokenRangeElement);
            stringBuffer.append(")");
            printStream.println(stringBuffer.toString());
        }
        if (i > 1) {
            return tokenRangeElement.Hw.FH(i - 1);
        }
        BitSet bitSetWe = BitSet.we(tokenRangeElement.gn);
        for (int i2 = tokenRangeElement.gn + 1; i2 <= tokenRangeElement.u7; i2++) {
            bitSetWe.j6(i2);
        }
        return new Lookahead(bitSetWe);
    }

    @Override // groovyjarjarantlr.LLkGrammarAnalyzer
    public Lookahead EQ(int i, CharRangeElement charRangeElement) {
        if (this.j6) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("lookCharRange(");
            stringBuffer.append(i);
            stringBuffer.append(",");
            stringBuffer.append(charRangeElement);
            stringBuffer.append(")");
            printStream.println(stringBuffer.toString());
        }
        if (i > 1) {
            return charRangeElement.Hw.FH(i - 1);
        }
        BitSet bitSetWe = BitSet.we(charRangeElement.gn);
        for (int i2 = charRangeElement.gn + 1; i2 <= charRangeElement.u7; i2++) {
            bitSetWe.j6(i2);
        }
        return new Lookahead(bitSetWe);
    }

    @Override // groovyjarjarantlr.LLkGrammarAnalyzer
    public Lookahead FH(int i, BlockEndElement blockEndElement) {
        Lookahead lookaheadHw;
        if (this.j6) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("lookBlockEnd(");
            stringBuffer.append(i);
            stringBuffer.append(", ");
            stringBuffer.append(blockEndElement.gn);
            stringBuffer.append("); lock is ");
            stringBuffer.append(blockEndElement.VH[i]);
            printStream.println(stringBuffer.toString());
        }
        if (blockEndElement.VH[i]) {
            return new Lookahead();
        }
        AlternativeBlock alternativeBlock = blockEndElement.gn;
        if ((alternativeBlock instanceof ZeroOrMoreBlock) || (alternativeBlock instanceof OneOrMoreBlock)) {
            blockEndElement.VH[i] = true;
            lookaheadHw = Hw(i, blockEndElement.gn);
            blockEndElement.VH[i] = false;
        } else {
            lookaheadHw = new Lookahead();
        }
        AlternativeBlock alternativeBlock2 = blockEndElement.gn;
        if (alternativeBlock2 instanceof TreeElement) {
            lookaheadHw.j6(Lookahead.Hw(3));
        } else if (alternativeBlock2 instanceof SynPredBlock) {
            lookaheadHw.VH();
        } else {
            lookaheadHw.j6(alternativeBlock2.Hw.FH(i));
        }
        return lookaheadHw;
    }

    @Override // groovyjarjarantlr.LLkGrammarAnalyzer
    public Lookahead Hw(int i, AlternativeBlock alternativeBlock) {
        if (this.j6) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("lookAltBlk(");
            stringBuffer.append(i);
            stringBuffer.append(",");
            stringBuffer.append(alternativeBlock);
            stringBuffer.append(")");
            printStream.println(stringBuffer.toString());
        }
        AlternativeBlock alternativeBlock2 = this.DW;
        this.DW = alternativeBlock;
        Lookahead lookahead = new Lookahead();
        for (int i2 = 0; i2 < alternativeBlock.gn.gn(); i2++) {
            if (this.j6) {
                PrintStream printStream2 = System.out;
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("alt ");
                stringBuffer2.append(i2);
                stringBuffer2.append(" of ");
                stringBuffer2.append(alternativeBlock);
                printStream2.println(stringBuffer2.toString());
            }
            this.DW.tp = i2;
            Alternative alternativeZo = alternativeBlock.Zo(i2);
            AlternativeElement alternativeElement = alternativeZo.j6;
            if (this.j6 && alternativeElement == alternativeZo.DW) {
                PrintStream printStream3 = System.out;
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("alt ");
                stringBuffer3.append(i2);
                stringBuffer3.append(" is empty");
                printStream3.println(stringBuffer3.toString());
            }
            lookahead.j6(alternativeElement.FH(i));
        }
        if (i == 1 && alternativeBlock.EQ && Mr(alternativeBlock, this.v5)) {
            if (this.v5) {
                BitSet bitSet = (BitSet) ((LexerGrammar) this.Hw).gn.clone();
                for (int i3 : lookahead.WB.j3()) {
                    bitSet.J8(i3);
                }
                lookahead.WB = bitSet;
            } else {
                lookahead.WB.tp(4, this.Hw.Hw.FH());
            }
        }
        this.DW = alternativeBlock2;
        return lookahead;
    }

    @Override // groovyjarjarantlr.LLkGrammarAnalyzer
    public Lookahead J0(int i, ActionElement actionElement) {
        if (this.j6) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("lookAction(");
            stringBuffer.append(i);
            stringBuffer.append(",");
            stringBuffer.append(actionElement);
            stringBuffer.append(")");
            printStream.println(stringBuffer.toString());
        }
        return actionElement.Hw.FH(i);
    }

    @Override // groovyjarjarantlr.LLkGrammarAnalyzer
    public Lookahead J8(int i, CharLiteralElement charLiteralElement) {
        if (this.j6) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("lookCharLiteral(");
            stringBuffer.append(i);
            stringBuffer.append(",");
            stringBuffer.append(charLiteralElement);
            stringBuffer.append(")");
            printStream.println(stringBuffer.toString());
        }
        if (i > 1) {
            return charLiteralElement.Hw.FH(i - 1);
        }
        if (!this.v5) {
            this.FH.Hw("Character literal reference found in parser");
            throw null;
        }
        if (!charLiteralElement.tp) {
            return Lookahead.Hw(charLiteralElement.gn());
        }
        BitSet bitSet = (BitSet) ((LexerGrammar) this.Hw).gn.clone();
        if (this.j6) {
            PrintStream printStream2 = System.out;
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("charVocab is ");
            stringBuffer2.append(bitSet.toString());
            printStream2.println(stringBuffer2.toString());
        }
        j3(bitSet, charLiteralElement);
        if (this.j6) {
            PrintStream printStream3 = System.out;
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("charVocab after removal of prior alt lookahead ");
            stringBuffer3.append(bitSet.toString());
            printStream3.println(stringBuffer3.toString());
        }
        bitSet.Hw(charLiteralElement.gn());
        return new Lookahead(bitSet);
    }

    public boolean Mr(AlternativeBlock alternativeBlock, boolean z) {
        if ((alternativeBlock instanceof ZeroOrMoreBlock) || (alternativeBlock instanceof OneOrMoreBlock) || (alternativeBlock instanceof SynPredBlock) || alternativeBlock.gn.gn() == 0) {
            return false;
        }
        for (int i = 0; i < alternativeBlock.gn.gn(); i++) {
            Alternative alternativeZo = alternativeBlock.Zo(i);
            if (alternativeZo.FH == null && alternativeZo.Hw == null && alternativeZo.v5 == null) {
                AlternativeElement alternativeElement = alternativeZo.j6;
                if (((alternativeElement instanceof CharLiteralElement) || (alternativeElement instanceof TokenRefElement) || (alternativeElement instanceof CharRangeElement) || (alternativeElement instanceof TokenRangeElement) || ((alternativeElement instanceof StringLiteralElement) && !z)) && (alternativeElement.Hw instanceof BlockEndElement) && alternativeElement.Hw() == 1) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // groovyjarjarantlr.LLkGrammarAnalyzer
    public Lookahead QX(int i, ZeroOrMoreBlock zeroOrMoreBlock) {
        if (this.j6) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("look*(");
            stringBuffer.append(i);
            stringBuffer.append(",");
            stringBuffer.append(zeroOrMoreBlock);
            stringBuffer.append(")");
            printStream.println(stringBuffer.toString());
        }
        Lookahead lookaheadHw = Hw(i, zeroOrMoreBlock);
        lookaheadHw.j6(zeroOrMoreBlock.Hw.FH(i));
        return lookaheadHw;
    }

    @Override // groovyjarjarantlr.LLkGrammarAnalyzer
    public Lookahead VH(int i, RuleRefElement ruleRefElement) {
        if (this.j6) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("lookRuleRef(");
            stringBuffer.append(i);
            stringBuffer.append(",");
            stringBuffer.append(ruleRefElement);
            stringBuffer.append(")");
            printStream.println(stringBuffer.toString());
        }
        RuleSymbol ruleSymbol = (RuleSymbol) this.Hw.DW(ruleRefElement.VH);
        if (ruleSymbol == null || !ruleSymbol.FH) {
            Tool tool = this.FH;
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("no definition of rule ");
            stringBuffer2.append(ruleRefElement.VH);
            tool.DW(stringBuffer2.toString(), this.Hw.j6(), ruleRefElement.DW(), ruleRefElement.j6());
            return new Lookahead();
        }
        RuleEndElement ruleEndElement = ruleSymbol.j6().J0;
        boolean z = ruleEndElement.tp;
        ruleEndElement.tp = true;
        Lookahead lookaheadAM = aM(i, ruleRefElement.VH);
        if (this.j6) {
            PrintStream printStream2 = System.out;
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("back from rule ref to ");
            stringBuffer3.append(ruleRefElement.VH);
            printStream2.println(stringBuffer3.toString());
        }
        ruleEndElement.tp = z;
        if (lookaheadAM.mb != null) {
            Tool tool2 = this.FH;
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append("infinite recursion to rule ");
            stringBuffer4.append(lookaheadAM.mb);
            stringBuffer4.append(" from rule ");
            stringBuffer4.append(ruleRefElement.Zo);
            tool2.DW(stringBuffer4.toString(), this.Hw.j6(), ruleRefElement.DW(), ruleRefElement.j6());
        }
        if (lookaheadAM.FH()) {
            if (this.j6) {
                PrintStream printStream3 = System.out;
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("rule ref to ");
                stringBuffer5.append(ruleRefElement.VH);
                stringBuffer5.append(" has eps, depth: ");
                stringBuffer5.append(lookaheadAM.jw);
                printStream3.println(stringBuffer5.toString());
            }
            lookaheadAM.Zo();
            int[] iArrJ3 = lookaheadAM.jw.j3();
            lookaheadAM.jw = null;
            for (int i2 : iArrJ3) {
                lookaheadAM.j6(ruleRefElement.Hw.FH(i - (i - i2)));
            }
        }
        return lookaheadAM;
    }

    @Override // groovyjarjarantlr.LLkGrammarAnalyzer
    public Lookahead Ws(int i, RuleEndElement ruleEndElement) {
        if (this.j6) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("lookRuleBlockEnd(");
            stringBuffer.append(i);
            stringBuffer.append("); noFOLLOW=");
            stringBuffer.append(ruleEndElement.tp);
            stringBuffer.append("; lock is ");
            stringBuffer.append(ruleEndElement.VH[i]);
            printStream.println(stringBuffer.toString());
        }
        if (!ruleEndElement.tp) {
            return Zo(i, ruleEndElement);
        }
        Lookahead lookahead = new Lookahead();
        lookahead.VH();
        lookahead.jw = BitSet.we(i);
        return lookahead;
    }

    @Override // groovyjarjarantlr.LLkGrammarAnalyzer
    public Lookahead XL(int i, StringLiteralElement stringLiteralElement) {
        if (this.j6) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("lookStringLiteral(");
            stringBuffer.append(i);
            stringBuffer.append(",");
            stringBuffer.append(stringLiteralElement);
            stringBuffer.append(")");
            printStream.println(stringBuffer.toString());
        }
        if (this.v5) {
            return i > stringLiteralElement.we.length() ? stringLiteralElement.Hw.FH(i - stringLiteralElement.we.length()) : Lookahead.Hw(stringLiteralElement.we.charAt(i - 1));
        }
        if (i > 1) {
            return stringLiteralElement.Hw.FH(i - 1);
        }
        Lookahead lookaheadHw = Lookahead.Hw(stringLiteralElement.gn());
        if (stringLiteralElement.tp) {
            lookaheadHw.WB.tp(4, this.Hw.Hw.FH());
        }
        return lookaheadHw;
    }

    @Override // groovyjarjarantlr.LLkGrammarAnalyzer
    public Lookahead Zo(int i, RuleEndElement ruleEndElement) {
        Object obj;
        RuleBlock ruleBlock = (RuleBlock) ruleEndElement.gn;
        String strJ6 = this.v5 ? CodeGenerator.j6(ruleBlock.VH()) : ruleBlock.VH();
        if (this.j6) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("FOLLOW(");
            stringBuffer.append(i);
            stringBuffer.append(",");
            stringBuffer.append(strJ6);
            stringBuffer.append(")");
            printStream.println(stringBuffer.toString());
        }
        boolean[] zArr = ruleEndElement.VH;
        if (zArr[i]) {
            if (this.j6) {
                PrintStream printStream2 = System.out;
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("FOLLOW cycle to ");
                stringBuffer2.append(strJ6);
                printStream2.println(stringBuffer2.toString());
            }
            return new Lookahead(strJ6);
        }
        if (ruleEndElement.u7[i] != null) {
            if (this.j6) {
                PrintStream printStream3 = System.out;
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("cache entry FOLLOW(");
                stringBuffer3.append(i);
                stringBuffer3.append(") for ");
                stringBuffer3.append(strJ6);
                stringBuffer3.append(": ");
                stringBuffer3.append(ruleEndElement.u7[i].u7(",", this.Zo, this.Hw));
                printStream3.println(stringBuffer3.toString());
            }
            Lookahead[] lookaheadArr = ruleEndElement.u7;
            if (lookaheadArr[i].mb == null) {
                return (Lookahead) lookaheadArr[i].clone();
            }
            RuleEndElement ruleEndElement2 = ((RuleSymbol) this.Hw.DW(lookaheadArr[i].mb)).j6().J0;
            if (ruleEndElement2.u7[i] == null) {
                return (Lookahead) ruleEndElement.u7[i].clone();
            }
            if (this.j6) {
                PrintStream printStream4 = System.out;
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("combining FOLLOW(");
                stringBuffer4.append(i);
                stringBuffer4.append(") for ");
                stringBuffer4.append(strJ6);
                stringBuffer4.append(": from ");
                stringBuffer4.append(ruleEndElement.u7[i].u7(",", this.Zo, this.Hw));
                stringBuffer4.append(" with FOLLOW for ");
                stringBuffer4.append(((RuleBlock) ruleEndElement2.gn).VH());
                stringBuffer4.append(": ");
                stringBuffer4.append(ruleEndElement2.u7[i].u7(",", this.Zo, this.Hw));
                printStream4.println(stringBuffer4.toString());
            }
            Lookahead[] lookaheadArr2 = ruleEndElement2.u7;
            if (lookaheadArr2[i].mb == null) {
                ruleEndElement.u7[i].j6(lookaheadArr2[i]);
                ruleEndElement.u7[i].mb = null;
            } else {
                Lookahead lookaheadZo = Zo(i, ruleEndElement2);
                ruleEndElement.u7[i].j6(lookaheadZo);
                ruleEndElement.u7[i].mb = lookaheadZo.mb;
            }
            if (this.j6) {
                PrintStream printStream5 = System.out;
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("saving FOLLOW(");
                stringBuffer5.append(i);
                stringBuffer5.append(") for ");
                stringBuffer5.append(strJ6);
                stringBuffer5.append(": from ");
                stringBuffer5.append(ruleEndElement.u7[i].u7(",", this.Zo, this.Hw));
                printStream5.println(stringBuffer5.toString());
            }
            return (Lookahead) ruleEndElement.u7[i].clone();
        }
        zArr[i] = true;
        Lookahead lookahead = new Lookahead();
        RuleSymbol ruleSymbol = (RuleSymbol) this.Hw.DW(strJ6);
        for (int i2 = 0; i2 < ruleSymbol.FH(); i2++) {
            RuleRefElement ruleRefElementDW = ruleSymbol.DW(i2);
            if (this.j6) {
                PrintStream printStream6 = System.out;
                StringBuffer stringBuffer6 = new StringBuffer();
                stringBuffer6.append("next[");
                stringBuffer6.append(strJ6);
                stringBuffer6.append("] is ");
                stringBuffer6.append(ruleRefElementDW.Hw.toString());
                printStream6.println(stringBuffer6.toString());
            }
            Lookahead lookaheadFH = ruleRefElementDW.Hw.FH(i);
            if (this.j6) {
                PrintStream printStream7 = System.out;
                StringBuffer stringBuffer7 = new StringBuffer();
                stringBuffer7.append("FIRST of next[");
                stringBuffer7.append(strJ6);
                stringBuffer7.append("] ptr is ");
                stringBuffer7.append(lookaheadFH.toString());
                printStream7.println(stringBuffer7.toString());
            }
            String str = lookaheadFH.mb;
            if (str == null || !str.equals(strJ6)) {
                obj = null;
            } else {
                obj = null;
                lookaheadFH.mb = null;
            }
            lookahead.j6(lookaheadFH);
            if (this.j6) {
                PrintStream printStream8 = System.out;
                StringBuffer stringBuffer8 = new StringBuffer();
                stringBuffer8.append("combined FOLLOW[");
                stringBuffer8.append(strJ6);
                stringBuffer8.append("] is ");
                stringBuffer8.append(lookahead.toString());
                printStream8.println(stringBuffer8.toString());
            }
        }
        ruleEndElement.VH[i] = false;
        if (lookahead.WB.u7() && lookahead.mb == null) {
            Grammar grammar = this.Hw;
            if (grammar instanceof TreeWalkerGrammar) {
                lookahead.WB.j6(3);
            } else if (grammar instanceof LexerGrammar) {
                lookahead.VH();
            } else {
                lookahead.WB.j6(1);
            }
        }
        if (this.j6) {
            PrintStream printStream9 = System.out;
            StringBuffer stringBuffer9 = new StringBuffer();
            stringBuffer9.append("saving FOLLOW(");
            stringBuffer9.append(i);
            stringBuffer9.append(") for ");
            stringBuffer9.append(strJ6);
            stringBuffer9.append(": ");
            stringBuffer9.append(lookahead.u7(",", this.Zo, this.Hw));
            printStream9.println(stringBuffer9.toString());
        }
        ruleEndElement.u7[i] = (Lookahead) lookahead.clone();
        return lookahead;
    }

    public Lookahead aM(int i, String str) {
        if (this.j6) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("lookRuleName(");
            stringBuffer.append(i);
            stringBuffer.append(",");
            stringBuffer.append(str);
            stringBuffer.append(")");
            printStream.println(stringBuffer.toString());
        }
        RuleBlock ruleBlockJ6 = ((RuleSymbol) this.Hw.DW(str)).j6();
        boolean[] zArr = ruleBlockJ6.Ws;
        if (zArr[i]) {
            if (this.j6) {
                PrintStream printStream2 = System.out;
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("infinite recursion to rule ");
                stringBuffer2.append(ruleBlockJ6.VH());
                printStream2.println(stringBuffer2.toString());
            }
            return new Lookahead(str);
        }
        if (ruleBlockJ6.QX[i] != null) {
            if (this.j6) {
                PrintStream printStream3 = System.out;
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("found depth ");
                stringBuffer3.append(i);
                stringBuffer3.append(" result in FIRST ");
                stringBuffer3.append(str);
                stringBuffer3.append(" cache: ");
                stringBuffer3.append(ruleBlockJ6.QX[i].u7(",", this.Zo, this.Hw));
                printStream3.println(stringBuffer3.toString());
            }
            return (Lookahead) ruleBlockJ6.QX[i].clone();
        }
        zArr[i] = true;
        Lookahead lookaheadTp = tp(i, ruleBlockJ6);
        ruleBlockJ6.Ws[i] = false;
        ruleBlockJ6.QX[i] = (Lookahead) lookaheadTp.clone();
        if (this.j6) {
            PrintStream printStream4 = System.out;
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append("saving depth ");
            stringBuffer4.append(i);
            stringBuffer4.append(" result in FIRST ");
            stringBuffer4.append(str);
            stringBuffer4.append(" cache: ");
            stringBuffer4.append(ruleBlockJ6.QX[i].u7(",", this.Zo, this.Hw));
            printStream4.println(stringBuffer4.toString());
        }
        return lookaheadTp;
    }

    @Override // groovyjarjarantlr.LLkGrammarAnalyzer
    public Lookahead gn(int i, GrammarAtom grammarAtom) {
        if (this.j6) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("look(");
            stringBuffer.append(i);
            stringBuffer.append(",");
            stringBuffer.append(grammarAtom);
            stringBuffer.append("[");
            stringBuffer.append(grammarAtom.gn());
            stringBuffer.append("])");
            printStream.println(stringBuffer.toString());
        }
        if (this.v5) {
            this.FH.Hw("token reference found in lexer");
            throw null;
        }
        if (i > 1) {
            return grammarAtom.Hw.FH(i - 1);
        }
        Lookahead lookaheadHw = Lookahead.Hw(grammarAtom.gn());
        if (grammarAtom.tp) {
            lookaheadHw.WB.tp(4, this.Hw.Hw.FH());
            j3(lookaheadHw.WB, grammarAtom);
        }
        return lookaheadHw;
    }

    @Override // groovyjarjarantlr.LLkGrammarAnalyzer
    public Lookahead j6(int i, TreeElement treeElement) {
        if (this.j6) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("look(");
            stringBuffer.append(i);
            stringBuffer.append(",");
            stringBuffer.append(treeElement.we);
            stringBuffer.append("[");
            stringBuffer.append(treeElement.we.gn());
            stringBuffer.append("])");
            printStream.println(stringBuffer.toString());
        }
        if (i > 1) {
            return treeElement.Hw.FH(i - 1);
        }
        GrammarAtom grammarAtom = treeElement.we;
        if (grammarAtom instanceof WildcardElement) {
            return grammarAtom.FH(1);
        }
        Lookahead lookaheadHw = Lookahead.Hw(grammarAtom.gn());
        if (!treeElement.we.tp) {
            return lookaheadHw;
        }
        lookaheadHw.WB.tp(4, this.Hw.Hw.FH());
        return lookaheadHw;
    }

    @Override // groovyjarjarantlr.LLkGrammarAnalyzer
    public Lookahead tp(int i, RuleBlock ruleBlock) {
        if (this.j6) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("lookRuleBlk(");
            stringBuffer.append(i);
            stringBuffer.append(",");
            stringBuffer.append(ruleBlock);
            stringBuffer.append(")");
            printStream.println(stringBuffer.toString());
        }
        return Hw(i, ruleBlock);
    }

    @Override // groovyjarjarantlr.LLkGrammarAnalyzer
    public Lookahead u7(int i, OneOrMoreBlock oneOrMoreBlock) {
        if (this.j6) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("look+");
            stringBuffer.append(i);
            stringBuffer.append(",");
            stringBuffer.append(oneOrMoreBlock);
            stringBuffer.append(")");
            printStream.println(stringBuffer.toString());
        }
        return Hw(i, oneOrMoreBlock);
    }

    @Override // groovyjarjarantlr.LLkGrammarAnalyzer
    public Lookahead v5(int i, SynPredBlock synPredBlock) {
        if (this.j6) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("look=>(");
            stringBuffer.append(i);
            stringBuffer.append(",");
            stringBuffer.append(synPredBlock);
            stringBuffer.append(")");
            printStream.println(stringBuffer.toString());
        }
        return synPredBlock.Hw.FH(i);
    }

    @Override // groovyjarjarantlr.LLkGrammarAnalyzer
    public Lookahead we(int i, WildcardElement wildcardElement) {
        BitSet bitSet;
        if (this.j6) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("look(");
            stringBuffer.append(i);
            stringBuffer.append(",");
            stringBuffer.append(wildcardElement);
            stringBuffer.append(")");
            printStream.println(stringBuffer.toString());
        }
        if (i > 1) {
            return wildcardElement.Hw.FH(i - 1);
        }
        if (this.v5) {
            bitSet = (BitSet) ((LexerGrammar) this.Hw).gn.clone();
        } else {
            BitSet bitSet2 = new BitSet(1);
            bitSet2.tp(4, this.Hw.Hw.FH());
            if (this.j6) {
                PrintStream printStream2 = System.out;
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("look(");
                stringBuffer2.append(i);
                stringBuffer2.append(",");
                stringBuffer2.append(wildcardElement);
                stringBuffer2.append(") after not: ");
                stringBuffer2.append(bitSet2);
                printStream2.println(stringBuffer2.toString());
            }
            bitSet = bitSet2;
        }
        return new Lookahead(bitSet);
    }
}
