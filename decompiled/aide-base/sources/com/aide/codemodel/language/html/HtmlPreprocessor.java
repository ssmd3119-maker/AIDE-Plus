package com.aide.codemodel.language.html;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.abstraction.Preprocessor;
import com.aide.codemodel.api.collections.SetOfInt;
import com.aide.codemodel.language.xml.XmlLanguage;
import com.aide.codemodel.language.xml.XmlSyntax;

@cy(clazz = -2019970601369079480L, container = -2019970601369079480L, user = true)
/* loaded from: classes.dex */
public class HtmlPreprocessor implements Preprocessor {

    @fy
    private static /* synthetic */ boolean Hw;

    @gy
    private static /* synthetic */ boolean v5;

    @dy(field = 935449994287326353L)
    private final XmlLanguage DW;

    @dy(field = 2101243966222931740L)
    private SetOfInt FH;

    @dy(field = 1177013253928286919L)
    private final Model j6;

    static {
        iy.Zo(HtmlPreprocessor.class);
    }

    @ey(method = 130809298467242901L)
    public HtmlPreprocessor(Model model, XmlLanguage xmlLanguage) {
        try {
            if (Hw) {
                iy.EQ(601718832942086825L, null, model, xmlLanguage);
            }
            this.j6 = model;
            this.DW = xmlLanguage;
            if (model != null) {
                SetOfInt setOfInt = new SetOfInt();
                this.FH = setOfInt;
                setOfInt.put(model.identifierSpace.QX(model.identifierSpace.get("onabort")));
                this.FH.put(model.identifierSpace.QX(model.identifierSpace.get("onblur")));
                this.FH.put(model.identifierSpace.QX(model.identifierSpace.get("onchange")));
                this.FH.put(model.identifierSpace.QX(model.identifierSpace.get("onclick")));
                this.FH.put(model.identifierSpace.QX(model.identifierSpace.get("ondblclick")));
                this.FH.put(model.identifierSpace.QX(model.identifierSpace.get("onerror")));
                this.FH.put(model.identifierSpace.QX(model.identifierSpace.get("onfocus")));
                this.FH.put(model.identifierSpace.QX(model.identifierSpace.get("onkeydown")));
                this.FH.put(model.identifierSpace.QX(model.identifierSpace.get("onkeypress")));
                this.FH.put(model.identifierSpace.QX(model.identifierSpace.get("onkeyup")));
                this.FH.put(model.identifierSpace.QX(model.identifierSpace.get("onload")));
                this.FH.put(model.identifierSpace.QX(model.identifierSpace.get("onmousedown")));
                this.FH.put(model.identifierSpace.QX(model.identifierSpace.get("onmousemove")));
                this.FH.put(model.identifierSpace.QX(model.identifierSpace.get("onmouseout")));
                this.FH.put(model.identifierSpace.QX(model.identifierSpace.get("onmouseover")));
                this.FH.put(model.identifierSpace.QX(model.identifierSpace.get("onmouseup")));
                this.FH.put(model.identifierSpace.QX(model.identifierSpace.get("onreset")));
                this.FH.put(model.identifierSpace.QX(model.identifierSpace.get("onselect")));
                this.FH.put(model.identifierSpace.QX(model.identifierSpace.get("onsubmit")));
                this.FH.put(model.identifierSpace.QX(model.identifierSpace.get("onunload")));
                model.identifierSpace.get("HREF");
            }
        } catch (Throwable th) {
            if (v5) {
                iy.Mr(th, 601718832942086825L, null, model, xmlLanguage);
            }
            throw th;
        }
    }

    @ey(method = 722440942727947344L)
    private void DW(SyntaxTree syntaxTree, int i, StringBuffer stringBuffer) {
        try {
            if (Hw) {
                iy.we(-166305648992523525L, this, syntaxTree, new Integer(i), stringBuffer);
            }
            stringBuffer.append(" onclick=\"document.title='code:");
            stringBuffer.append(syntaxTree.getStartLine(i));
            stringBuffer.append(":");
            stringBuffer.append(syntaxTree.getStartColumn(i));
            stringBuffer.append(":");
            stringBuffer.append(syntaxTree.getEndLine(i));
            stringBuffer.append(":");
            stringBuffer.append(syntaxTree.getEndColumn(i));
            stringBuffer.append("';return true;\" ");
        } catch (Throwable th) {
            if (v5) {
                iy.U2(th, -166305648992523525L, this, syntaxTree, new Integer(i), stringBuffer);
            }
            throw th;
        }
    }

    @ey(method = -169937010409645273L)
    private void FH(StringBuffer stringBuffer) {
        try {
            if (Hw) {
                iy.tp(127316862432720896L, this, stringBuffer);
            }
            stringBuffer.append(" style=\"cursor:hand\" ");
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, 127316862432720896L, this, stringBuffer);
            }
            throw th;
        }
    }

    @ey(method = -4630142349548749779L)
    private String Hw(SyntaxTree syntaxTree, int i) {
        try {
            if (Hw) {
                iy.EQ(-2884639756574163200L, this, syntaxTree, new Integer(i));
            }
            int childNode = syntaxTree.getChildNode(i, 0);
            for (int i2 = 2; i2 < syntaxTree.getChildCount(childNode); i2++) {
                int childNode2 = syntaxTree.getChildNode(childNode, i2);
                if (this.j6.identifierSpace.getString(this.j6.identifierSpace.QX(syntaxTree.getIdentifier(syntaxTree.getChildNode(childNode2, 0)))).equals("TEXT")) {
                    int childNode3 = syntaxTree.getChildNode(childNode2, syntaxTree.getChildCount(childNode2) - 1);
                    if (syntaxTree.getChildCount(childNode3) == 3 && syntaxTree.getSyntaxTag(syntaxTree.getChildNode(childNode3, 1)) == 18) {
                        return syntaxTree.getLiteralString(syntaxTree.getChildNode(childNode3, 1));
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            if (v5) {
                iy.Mr(th, -2884639756574163200L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 3554071836196703311L)
    private void v5(SyntaxTree syntaxTree, int i, StringBuffer stringBuffer) {
        try {
            if (Hw) {
                iy.we(-3887614787154578256L, this, syntaxTree, new Integer(i), stringBuffer);
            }
            int i2 = 0;
            if (syntaxTree.isLiteralNode(i)) {
                if (syntaxTree.getSyntaxTag(i) == 14 || syntaxTree.getSyntaxTag(i) == 15) {
                    char[] literalChars = syntaxTree.getLiteralChars(i);
                    int literalOff = syntaxTree.getLiteralOff(i);
                    int literalLen = syntaxTree.getLiteralLen(i);
                    while (i2 < literalLen) {
                        if (Character.isJavaIdentifierPart(literalChars[literalOff + i2])) {
                            stringBuffer.append("<span ");
                            DW(syntaxTree, i, stringBuffer);
                            FH(stringBuffer);
                            stringBuffer.append(">");
                            stringBuffer.append(literalChars, literalOff, literalLen);
                            stringBuffer.append("</span>");
                            return;
                        }
                        i2++;
                    }
                }
                stringBuffer.append(syntaxTree.getLiteralChars(i), syntaxTree.getLiteralOff(i), syntaxTree.getLiteralLen(i));
                return;
            }
            if (syntaxTree.isIdentifierNode(i)) {
                stringBuffer.append(syntaxTree.getIdentifierString(i));
                return;
            }
            if (syntaxTree.isTokenNode(i)) {
                stringBuffer.append(syntaxTree.getLanguage().getSyntax().getString(syntaxTree.getSyntaxTag(i)));
                return;
            }
            int syntaxTag = syntaxTree.getSyntaxTag(i);
            if (syntaxTag == 203) {
                if (this.FH.contains(XmlSyntax.wc(syntaxTree, i))) {
                    return;
                }
                stringBuffer.append(" ");
                int childCount = syntaxTree.getChildCount(i);
                while (i2 < childCount) {
                    v5(syntaxTree, syntaxTree.getChildNode(i, i2), stringBuffer);
                    i2++;
                }
                stringBuffer.append(" ");
                return;
            }
            if (syntaxTag != 210) {
                if (syntaxTag != 320) {
                    switch (syntaxTag) {
                        case 300:
                        case 304:
                        case 305:
                            return;
                        case 301:
                        case 302:
                        case 303:
                            if (syntaxTree.getSyntaxTag(syntaxTree.getParentNode(i)) == 211) {
                                stringBuffer.append("<span style=\"font-size: 12; color: red; font-family: sans-serif\"");
                                DW(syntaxTree, i, stringBuffer);
                                FH(stringBuffer);
                                stringBuffer.append(">");
                                stringBuffer.append("&lt;% ... %&gt;");
                                stringBuffer.append("</span>");
                                return;
                            }
                            return;
                        default:
                            int childCount2 = syntaxTree.getChildCount(i);
                            while (i2 < childCount2) {
                                v5(syntaxTree, syntaxTree.getChildNode(i, i2), stringBuffer);
                                i2++;
                            }
                            return;
                    }
                }
                return;
            }
            String string = this.j6.identifierSpace.getString(this.j6.identifierSpace.QX(syntaxTree.getIdentifier(syntaxTree.getChildNode(syntaxTree.getChildNode(i, 0), 1))));
            if ((syntaxTree.getChildCount(syntaxTree.getChildNode(i, 1)) == 0 || syntaxTree.getSyntaxTag(syntaxTree.getChildNode(syntaxTree.getChildNode(i, 1), 0)) != 46) && !string.equals("META")) {
                if (string.indexOf(":") == -1) {
                    if (string.equals("A")) {
                        stringBuffer.append("<a href=\"$LINK_TO_ME$\"");
                        DW(syntaxTree, i, stringBuffer);
                        stringBuffer.append(">");
                        v5(syntaxTree, syntaxTree.getChildNode(i, 1), stringBuffer);
                        stringBuffer.append("</a>");
                        return;
                    }
                    if (!string.equals("INPUT")) {
                        if (!syntaxTree.isSyntheticNode(syntaxTree.getChildNode(i, 0))) {
                            v5(syntaxTree, syntaxTree.getChildNode(i, 0), stringBuffer);
                        }
                        v5(syntaxTree, syntaxTree.getChildNode(i, 1), stringBuffer);
                        if (syntaxTree.isSyntheticNode(syntaxTree.getChildNode(i, 2))) {
                            return;
                        }
                        v5(syntaxTree, syntaxTree.getChildNode(i, 2), stringBuffer);
                        return;
                    }
                    stringBuffer.append("<input");
                    DW(syntaxTree, i, stringBuffer);
                    FH(stringBuffer);
                    int childNode = syntaxTree.getChildNode(i, 0);
                    for (int i3 = 2; i3 < syntaxTree.getChildCount(childNode) - 1; i3++) {
                        v5(syntaxTree, syntaxTree.getChildNode(childNode, i3), stringBuffer);
                    }
                    stringBuffer.append(">");
                    v5(syntaxTree, syntaxTree.getChildNode(i, 1), stringBuffer);
                    stringBuffer.append("</input>");
                    return;
                }
                if (string.equals("ASP:BUTTON")) {
                    stringBuffer.append("<button ");
                    DW(syntaxTree, i, stringBuffer);
                    FH(stringBuffer);
                    stringBuffer.append(">");
                    String strHw = Hw(syntaxTree, i);
                    if (strHw == null) {
                        strHw = "asp:button";
                    }
                    stringBuffer.append(strHw);
                    stringBuffer.append("</button>");
                    return;
                }
                if (string.equals("ASP:LINKBUTTON")) {
                    stringBuffer.append("<button ");
                    DW(syntaxTree, i, stringBuffer);
                    FH(stringBuffer);
                    stringBuffer.append(">");
                    String strHw2 = Hw(syntaxTree, i);
                    if (strHw2 == null) {
                        v5(syntaxTree, syntaxTree.getChildNode(i, 1), stringBuffer);
                    } else {
                        stringBuffer.append(strHw2);
                    }
                    stringBuffer.append("</button>");
                    return;
                }
                if (string.equals("ASP:LABEL")) {
                    stringBuffer.append("<span ");
                    DW(syntaxTree, i, stringBuffer);
                    FH(stringBuffer);
                    stringBuffer.append(">");
                    String strHw3 = Hw(syntaxTree, i);
                    if (strHw3 == null) {
                        strHw3 = "asp:label";
                    }
                    stringBuffer.append(strHw3);
                    stringBuffer.append("</span>");
                    return;
                }
                if (string.equals("ASP:HYPERLINK")) {
                    stringBuffer.append("<a ");
                    stringBuffer.append(">");
                    v5(syntaxTree, syntaxTree.getChildNode(i, 1), stringBuffer);
                    stringBuffer.append("</a>");
                    return;
                }
                if (string.equals("ASP:TEXTBOX")) {
                    stringBuffer.append("<input ");
                    DW(syntaxTree, i, stringBuffer);
                    FH(stringBuffer);
                    stringBuffer.append(">");
                    stringBuffer.append("</input>");
                    return;
                }
                if (string.equals("ASP:DROPDOWNLIST")) {
                    stringBuffer.append("<select ");
                    DW(syntaxTree, i, stringBuffer);
                    FH(stringBuffer);
                    stringBuffer.append(">");
                    stringBuffer.append("</select>");
                    return;
                }
                if (!string.equals("ASP:CHECKBOX")) {
                    v5(syntaxTree, syntaxTree.getChildNode(i, 1), stringBuffer);
                    return;
                }
                stringBuffer.append("<input type=checkbox ");
                DW(syntaxTree, i, stringBuffer);
                FH(stringBuffer);
                stringBuffer.append(">");
                String strHw4 = Hw(syntaxTree, i);
                if (strHw4 == null) {
                    strHw4 = "asp:checkbox";
                }
                stringBuffer.append(strHw4);
                stringBuffer.append("</input>");
            }
        } catch (Throwable th) {
            if (v5) {
                iy.U2(th, -3887614787154578256L, this, syntaxTree, new Integer(i), stringBuffer);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Preprocessor
    @ey(method = 1179747512829512796L)
    public void j6(FileEntry fileEntry) {
        try {
            if (Hw) {
                iy.tp(1094095098327674777L, this, fileEntry);
            }
            StringBuffer stringBuffer = new StringBuffer();
            SyntaxTree syntaxTree = this.j6.syntaxTreeSpace.getSyntaxTree(fileEntry, this.DW);
            v5(syntaxTree, syntaxTree.getRootNode(), stringBuffer);
            this.j6.syntaxTreeSpace.releaseSyntaxTree(syntaxTree);
            this.j6.J8.j6(fileEntry, stringBuffer.toString());
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, 1094095098327674777L, this, fileEntry);
            }
            throw th;
        }
    }
}
