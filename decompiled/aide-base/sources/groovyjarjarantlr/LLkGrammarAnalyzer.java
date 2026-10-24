package groovyjarjarantlr;

/* loaded from: classes.dex */
public interface LLkGrammarAnalyzer extends GrammarAnalyzer {
    Lookahead DW(int i, TokenRangeElement tokenRangeElement);

    Lookahead EQ(int i, CharRangeElement charRangeElement);

    Lookahead FH(int i, BlockEndElement blockEndElement);

    Lookahead Hw(int i, AlternativeBlock alternativeBlock);

    Lookahead J0(int i, ActionElement actionElement);

    Lookahead J8(int i, CharLiteralElement charLiteralElement);

    Lookahead QX(int i, ZeroOrMoreBlock zeroOrMoreBlock);

    Lookahead VH(int i, RuleRefElement ruleRefElement);

    Lookahead Ws(int i, RuleEndElement ruleEndElement);

    Lookahead XL(int i, StringLiteralElement stringLiteralElement);

    Lookahead Zo(int i, RuleEndElement ruleEndElement);

    Lookahead gn(int i, GrammarAtom grammarAtom);

    Lookahead j6(int i, TreeElement treeElement);

    Lookahead tp(int i, RuleBlock ruleBlock);

    Lookahead u7(int i, OneOrMoreBlock oneOrMoreBlock);

    Lookahead v5(int i, SynPredBlock synPredBlock);

    Lookahead we(int i, WildcardElement wildcardElement);
}
