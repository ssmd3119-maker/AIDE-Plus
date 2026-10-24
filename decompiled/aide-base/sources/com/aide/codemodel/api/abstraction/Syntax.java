package com.aide.codemodel.api.abstraction;

import abcd.cy;
import abcd.ey;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.collections.ListOfInt;

@cy(clazz = 7292202604294243185L, container = 7292202604294243185L, user = true)
/* loaded from: classes.dex */
public interface Syntax {
    @ey(method = 80164250025644411L)
    int EQ(SyntaxTree syntaxTree, int i);

    @ey(method = -2585299803590138247L)
    int FH(SyntaxTree syntaxTree, int i);

    @ey(method = -213263561168560871L)
    boolean I(int i);

    @ey(method = 840719078424069520L)
    boolean KD(int i);

    @ey(method = -49586568602250800L)
    int Mr(SyntaxTree syntaxTree, int i);

    @ey(method = -1396751190560945591L)
    int OW(SyntaxTree syntaxTree, int i);

    @ey(method = -4833233535538269972L)
    boolean QX(SyntaxTree syntaxTree, int i);

    @ey(method = 4149927713057643659L)
    boolean Sf(SyntaxTree syntaxTree, int i);

    @ey(method = 601992937774393671L)
    boolean U2(SyntaxTree syntaxTree, int i);

    @ey(method = -2707063422612636624L)
    boolean VH(int i);

    @ey(method = -1311597148972508655L)
    int Ws(SyntaxTree syntaxTree, int i);

    @ey(method = -6556326112655156544L)
    int XG(SyntaxTree syntaxTree);

    @ey(method = -3185668384433391844L)
    int XL(SyntaxTree syntaxTree, int i);

    @ey(method = -1052894020647458899L)
    boolean Zo(SyntaxTree syntaxTree, int i);

    @ey(method = 6969645372487865151L)
    int br(SyntaxTree syntaxTree, int i, int i2);

    @ey(method = 450501874718833528L)
    boolean ca(SyntaxTree syntaxTree, int i);

    @ey(method = 213537515251134136L)
    String cb(SyntaxTree syntaxTree, int i);

    @ey(method = 7127023850029335684L)
    boolean ef(SyntaxTree syntaxTree, int i);

    @ey(method = 2911879733488491039L)
    int er(SyntaxTree syntaxTree, int i, int i2);

    @ey(method = -83248107435881067L)
    boolean g3(int i);

    @ey(method = -3745834583740364379L)
    int getImportEndLine(SyntaxTree syntaxTree);

    @ey(method = -7402222701140173933L)
    ListOfInt getImportNodePairs(SyntaxTree syntaxTree);

    @ey(method = 446091705800334325L)
    ListOfInt getNamespaceNodePairs(SyntaxTree syntaxTree);

    @ey(method = 1444122565222916640L)
    String getString(int i);

    @ey(method = 97981583658029104L)
    int getTokenLength(int i);

    @ey(method = 150768228293073556L)
    int gn(SyntaxTree syntaxTree);

    @ey(method = -121018899875922477L)
    boolean hasAttrDAIndex(int i);

    @ey(method = 1211190994129134249L)
    boolean hasAttrTarget(int i);

    @ey(method = 754459007981822176L)
    boolean hasAttrType(int i);

    @ey(method = 2814554674581330087L)
    boolean hasAttrValue(int i);

    @ey(method = -5654179910891187468L)
    boolean hasAttrVariableSlot(int i);

    @ey(method = 815857940949204029L)
    boolean isArguments(int i);

    @ey(method = -350234855723736024L)
    boolean isBlock(int i);

    @ey(method = 1820403386587677699L)
    boolean isBooleanLiteral(int i);

    @ey(method = 6370392439470318816L)
    boolean isChangedExpressionNode(SyntaxTree syntaxTree, int i);

    @ey(method = 1669466057237582175L)
    boolean isClassBody(int i);

    @ey(method = 4687092326817155541L)
    boolean isClassDeclaration(int i);

    @ey(method = -1106911341630490171L)
    boolean isComment(int i);

    @ey(method = -2044625609973521747L)
    boolean isDocComment(int i);

    @ey(method = -506921149335855021L)
    boolean isExpression(int i);

    @ey(method = -97221820856541771L)
    boolean isFieldDeclaration(int i);

    @ey(method = -3330053576293419092L)
    boolean isIdentifier(int i);

    @ey(method = 1092651780491660160L)
    boolean isLiteral(int i);

    @ey(method = 2887371981869695983L)
    boolean isMemberDeclaration(int i);

    @ey(method = -1977191537158323152L)
    boolean isMethodDeclaration(int i);

    @ey(method = 924087798032226048L)
    boolean isOperator(int i);

    @ey(method = -1514224430217971787L)
    boolean isParameters(int i);

    @ey(method = 2831962642958484321L)
    boolean isSeparator(int i);

    @ey(method = 1703141088515977313L)
    boolean isToken(int i);

    @ey(method = -5389923185934943320L)
    boolean isTypeIdentifier(int i);

    @ey(method = 5075816643699557985L)
    int lg(SyntaxTree syntaxTree);

    @ey(method = -365344318841559961L)
    int ro(SyntaxTree syntaxTree, int i);

    @ey(method = 202789949010691965L)
    String sh(SyntaxTree syntaxTree, int i);

    @ey(method = 142696521710147808L)
    boolean tp(int i);

    @ey(method = 1388106519262781075L)
    int vy(SyntaxTree syntaxTree, int i);

    @ey(method = -1208307677567594877L)
    int we(SyntaxTree syntaxTree, int i);

    @ey(method = 2354662465886413209L)
    boolean x9(SyntaxTree syntaxTree, int i);

    @ey(method = -1962376888378921600L)
    boolean yS(int i);
}
