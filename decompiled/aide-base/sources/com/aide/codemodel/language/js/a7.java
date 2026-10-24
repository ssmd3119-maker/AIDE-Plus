package com.aide.codemodel.language.js;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import abcd.z6;
import com.aide.codemodel.api.ClassType;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.Member;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.Variable;
import com.aide.codemodel.api.collections.ListOf;
import com.aide.codemodel.api.collections.MapOfInt;
import com.aide.codemodel.api.collections.SetOf;
import com.aide.codemodel.api.collections.SetOfInt;
import java.util.Iterator;
import java.util.List;

@cy(clazz = -13326450155824256L, container = -13326450155824256L, user = true)
/* loaded from: classes.dex */
public class a7 {

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = -2175855682828454601L)
    private final JavaScriptLanguage DW;

    @dy(field = 148542952510409100L)
    private final Model j6;

    static {
        iy.Zo(a7.class);
    }

    @ey(method = -299226496553657415L)
    public a7(Model model, JavaScriptLanguage javaScriptLanguage) {
        try {
            if (FH) {
                iy.EQ(3973954146608694375L, null, model, javaScriptLanguage);
            }
            this.j6 = model;
            this.DW = javaScriptLanguage;
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 3973954146608694375L, null, model, javaScriptLanguage);
            }
            throw th;
        }
    }

    @ey(method = 23913978028589077L)
    private void DW() {
        try {
            if (FH) {
                iy.gn(1819521326466143740L, this);
            }
            this.j6.codeCompleterCallback.Zo("console.log(");
            this.j6.codeCompleterCallback.Zo("break");
            this.j6.codeCompleterCallback.Zo("case");
            this.j6.codeCompleterCallback.Zo("catch");
            this.j6.codeCompleterCallback.Zo("continue");
            this.j6.codeCompleterCallback.Zo("default");
            this.j6.codeCompleterCallback.Zo("do");
            this.j6.codeCompleterCallback.Zo("else");
            this.j6.codeCompleterCallback.Zo("false");
            this.j6.codeCompleterCallback.Zo("finally");
            this.j6.codeCompleterCallback.Zo("for");
            this.j6.codeCompleterCallback.Zo("if");
            this.j6.codeCompleterCallback.Zo("instanceof");
            this.j6.codeCompleterCallback.Zo("new");
            this.j6.codeCompleterCallback.Zo("null");
            this.j6.codeCompleterCallback.Zo("return");
            this.j6.codeCompleterCallback.Zo("switch");
            this.j6.codeCompleterCallback.Zo("this");
            this.j6.codeCompleterCallback.Zo("throw");
            this.j6.codeCompleterCallback.Zo("true");
            this.j6.codeCompleterCallback.Zo("try");
            this.j6.codeCompleterCallback.Zo("void");
            this.j6.codeCompleterCallback.Zo("while");
            this.j6.codeCompleterCallback.Zo("with");
            this.j6.codeCompleterCallback.Zo("function");
            this.j6.codeCompleterCallback.Zo("var");
            this.j6.codeCompleterCallback.Zo("in");
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 1819521326466143740L, this);
            }
            throw th;
        }
    }

    @ey(method = 4417126975194446664L)
    private void FH(SyntaxTree syntaxTree, int i, int i2) {
        try {
            if (FH) {
                iy.we(1485264865358728775L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            int iSy = syntaxTree.sy(i, i2, i, i2);
            int iMz = syntaxTree.Mz(i, i2, i, i2);
            if (iMz != -1) {
                iSy = iMz;
            }
            if (iSy == -1) {
                iSy = syntaxTree.getRootNode();
            }
            new SetOfInt();
            while (iSy != -1) {
                if (syntaxTree.getSyntaxTag(iSy) == 124 || syntaxTree.getSyntaxTag(iSy) == 125) {
                    Hw(syntaxTree, syntaxTree.getChildNode(iSy, syntaxTree.getChildCount(iSy) - 1));
                    Hw(syntaxTree, syntaxTree.getChildNode(iSy, syntaxTree.getChildCount(iSy) - 2));
                } else if (syntaxTree.getSyntaxTag(iSy) == 223) {
                    Hw(syntaxTree, iSy);
                }
                if (iSy == syntaxTree.getRootNode()) {
                    break;
                } else {
                    iSy = syntaxTree.getParentNode(iSy);
                }
            }
            j6(syntaxTree);
            DW();
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, 1485264865358728775L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -3120061320266198320L)
    private void Hw(SyntaxTree syntaxTree, int i) {
        try {
            if (FH) {
                iy.EQ(-1724759549334848019L, this, syntaxTree, new Integer(i));
            }
            int syntaxTag = syntaxTree.getSyntaxTag(i);
            if (syntaxTag == 124) {
                if (syntaxTree.getChildCount(i) == 4) {
                    int childNode = syntaxTree.getChildNode(i, 1);
                    this.j6.codeCompleterCallback.J0(new Variable(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getStartLine(childNode), syntaxTree.getStartColumn(childNode), syntaxTree.getEndColumn(childNode), syntaxTree.getIdentifier(childNode), null));
                    return;
                }
                return;
            }
            if (syntaxTag != 125) {
                if (syntaxTag == 191 || syntaxTag == 200) {
                    int childNode2 = syntaxTree.getChildNode(i, 0);
                    this.j6.codeCompleterCallback.J0(new Variable(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getStartLine(childNode2), syntaxTree.getStartColumn(childNode2), syntaxTree.getEndColumn(childNode2), syntaxTree.getIdentifier(childNode2), null));
                }
                int childCount = syntaxTree.getChildCount(i);
                for (int i2 = 0; i2 < childCount; i2++) {
                    Hw(syntaxTree, syntaxTree.getChildNode(i, i2));
                }
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -1724759549334848019L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 2713954183676451072L)
    private String VH(String str) {
        try {
            if (FH) {
                iy.tp(1701849944522789325L, this, str);
            }
            int length = str.length() - 1;
            while (length >= 0 && Character.isJavaIdentifierPart(str.charAt(length))) {
                length--;
            }
            return length == str.length() + (-1) ? "" : str.substring(length + 1, str.length());
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 1701849944522789325L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -3677562136448748660L)
    private int Zo(FileEntry fileEntry, int i, int i2) {
        try {
            if (FH) {
                iy.we(-2177098085547638451L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            String strMr = fileEntry.Mr(i, i2);
            int length = strMr.length() + 1;
            while (true) {
                int i3 = length - 2;
                if (i3 < 0 || !Character.isJavaIdentifierPart(strMr.charAt(i3))) {
                    break;
                }
                length--;
            }
            return length;
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, -2177098085547638451L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -3070645812057030240L)
    private void j6(SyntaxTree syntaxTree) {
        try {
            if (FH) {
                iy.tp(473693317031940733L, this, syntaxTree);
            }
            SetOf setOf = new SetOf(this.j6.entitySpace);
            ListOf<ClassType> listOfWe = ((z6) syntaxTree.getLanguage().getCodeAnalyzer()).we(syntaxTree);
            for (int i = 0; i < listOfWe.EQ(); i++) {
                ClassType classType = (ClassType) listOfWe.v5(i);
                MapOfInt<Member> mapOfIntE3 = classType.e3();
                mapOfIntE3.DEFAULT_ITERATOR.DW();
                while (mapOfIntE3.DEFAULT_ITERATOR.hasMoreElements()) {
                    Member member = (Member) mapOfIntE3.DEFAULT_ITERATOR.nextValue();
                    if (!setOf.contains(member)) {
                        this.j6.codeCompleterCallback.j3(member, false);
                        setOf.put(member);
                    }
                }
                MapOfInt<Member> mapOfIntEU = classType.eU();
                mapOfIntEU.DEFAULT_ITERATOR.DW();
                while (mapOfIntEU.DEFAULT_ITERATOR.hasMoreElements()) {
                    Member member2 = (Member) mapOfIntEU.DEFAULT_ITERATOR.nextValue();
                    if (!setOf.contains(member2)) {
                        this.j6.codeCompleterCallback.j3(member2, false);
                        setOf.put(member2);
                    }
                }
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 473693317031940733L, this, syntaxTree);
            }
            throw th;
        }
    }

    @ey(method = 3244660044982655520L)
    private void u7(SyntaxTree syntaxTree, int i, int i2) {
        try {
            if (FH) {
                iy.we(-219725882934281237L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            String strJ3 = syntaxTree.getFile().j3(i);
            int i3 = i2 - 1;
            if (strJ3.length() < i3) {
                return;
            }
            String strSubstring = strJ3.substring(0, i3);
            String strSubstring2 = strJ3.substring(i3, strJ3.length());
            if (strSubstring.length() > 0) {
                char cCharAt = strSubstring.charAt(strSubstring.length() - 1);
                if (cCharAt == '.' || Character.isJavaIdentifierPart(cCharAt)) {
                    if (strSubstring2.length() > 0 && Character.isJavaIdentifierPart(cCharAt) && Character.isJavaIdentifierPart(strSubstring2.charAt(0))) {
                        return;
                    }
                    String strVH = VH(strSubstring);
                    if (strVH.endsWith("else")) {
                        return;
                    }
                    if (strVH.length() <= 0 || Character.isJavaIdentifierStart(strVH.charAt(0))) {
                        gn(syntaxTree, i, i2);
                    }
                }
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, -219725882934281237L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 189065087705368479L)
    private void v5(SyntaxTree syntaxTree, int i, int i2) {
        try {
            if (FH) {
                iy.we(-4972134916329738096L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            FileEntry file = syntaxTree.getFile();
            this.j6.codeCompleterCallback.j6();
            int iJO = syntaxTree.jO(i, i2);
            if (iJO != -1) {
                int parentNode = syntaxTree.getParentNode(iJO);
                int syntaxTag = syntaxTree.getSyntaxTag(parentNode);
                if (syntaxTag == 159) {
                    if (syntaxTree.getFile().I()) {
                        this.j6.codeCompleterCallback.gn("Members");
                        int childNode = syntaxTree.getChildNode(parentNode, 0);
                        this.j6.a8.lg(syntaxTree, childNode);
                        SetOfInt setOfInt = new SetOfInt();
                        ListOf<Member> listOfWe = this.j6.a8.we(syntaxTree, childNode);
                        for (int i3 = 0; i3 < listOfWe.EQ(); i3++) {
                            Member member = (Member) listOfWe.v5(i3);
                            setOfInt.put(member.getIdentifier());
                            this.j6.codeCompleterCallback.Mr(member);
                        }
                        for (Variable variable : this.j6.a8.J0(syntaxTree, childNode)) {
                            if (!setOfInt.contains(variable.getIdentifier())) {
                                this.j6.codeCompleterCallback.J0(variable);
                            }
                        }
                        this.j6.a8.rN(syntaxTree);
                        this.j6.codeCompleterCallback.J8(file, this.DW, i, i2, Zo(file, i, i2), false, false);
                        return;
                    }
                    return;
                }
                if (syntaxTag == 161) {
                    if (syntaxTree.getChildNode(parentNode, 0) == iJO) {
                        FH(syntaxTree, i, i2);
                    }
                    this.j6.codeCompleterCallback.J8(file, this.DW, i, i2, Zo(file, i, i2), false, false);
                    return;
                }
            }
            int iPa = syntaxTree.Pa(i, i2);
            if (iPa == -1 || syntaxTree.getSyntaxTag(iPa) != 2) {
                FH(syntaxTree, i, i2);
                this.j6.codeCompleterCallback.J8(file, this.DW, i, i2, Zo(file, i, i2), false, false);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, -4972134916329738096L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -2396198525599076775L)
    public void EQ(FileEntry fileEntry, int i, int i2) {
        try {
            if (FH) {
                iy.we(128440704983445200L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            String strMr = fileEntry.Mr(i, i2);
            if (strMr.length() > 0) {
                char cCharAt = strMr.charAt(strMr.length() - 1);
                if (cCharAt == '(' || cCharAt == ',') {
                    tp(fileEntry, i, i2);
                }
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, 128440704983445200L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 700705270719899896L)
    public void gn(SyntaxTree syntaxTree, int i, int i2) {
        try {
            if (FH) {
                iy.we(-13223930697390563L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            v5(syntaxTree, i, i2);
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, -13223930697390563L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 706364692752519711L)
    public void tp(FileEntry fileEntry, int i, int i2) {
        int argumentsNodeAt;
        try {
            if (FH) {
                iy.we(191908388477412480L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            SyntaxTree syntaxTree = this.j6.syntaxTreeSpace.getSyntaxTree(fileEntry, this.DW);
            if (!syntaxTree.getFile().I() || (argumentsNodeAt = syntaxTree.getArgumentsNodeAt(i, i2)) == -1) {
                return;
            }
            int childNode = syntaxTree.getChildNode(syntaxTree.getParentNode(argumentsNodeAt), 0);
            this.j6.a8.lg(syntaxTree, childNode);
            Iterator<Member> it = this.j6.a8.XL(syntaxTree, childNode).iterator();
            while (it.hasNext()) {
                this.j6.codeCompleterCallback.we(it.next(), null);
            }
            Iterator<List<Variable>> it2 = this.j6.a8.aM(syntaxTree, childNode).iterator();
            while (it2.hasNext()) {
                this.j6.codeCompleterCallback.v5(it2.next());
            }
            this.j6.a8.rN(syntaxTree);
            int i3 = 2;
            int childCount = (syntaxTree.getChildCount(argumentsNodeAt) - 1) / 2;
            if (childCount != 0) {
                i3 = childCount + 1;
            }
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < syntaxTree.getChildCount(argumentsNodeAt) - 1; i5 += 2) {
                int childNode2 = syntaxTree.getChildNode(argumentsNodeAt, i5);
                iArr[i4] = syntaxTree.getStartLine(childNode2);
                iArr2[i4] = syntaxTree.getStartColumn(childNode2);
                i4++;
            }
            iArr[i4] = syntaxTree.getStartLine(syntaxTree.getChildNode(argumentsNodeAt, syntaxTree.getChildCount(argumentsNodeAt) - 1));
            iArr2[i4] = syntaxTree.getStartColumn(syntaxTree.getChildNode(argumentsNodeAt, syntaxTree.getChildCount(argumentsNodeAt) - 1));
            if (iArr[i4] == 0) {
                int i6 = i4 - 1;
                iArr[i4] = iArr[i6];
                iArr2[i4] = iArr2[i6] + 1;
            }
            this.j6.codeCompleterCallback.u7(fileEntry, i, i2, iArr, iArr2);
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, 191908388477412480L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 8259117663995976647L)
    public void we(SyntaxTree syntaxTree, int i, int i2, int i3, boolean z) {
        try {
            if (FH) {
                iy.J8(2332195363615297744L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z));
            }
            if (i3 == -1) {
                u7(syntaxTree, i, i2);
                return;
            }
            String strJ3 = syntaxTree.getFile().j3(i);
            int i4 = i2 - 1;
            if (strJ3.length() < i4) {
                return;
            }
            if (strJ3.substring(0, i4).endsWith("else")) {
                this.j6.codeCompleterCallback.QX(syntaxTree.getFile());
                return;
            }
            for (int i5 = i3 - 1; i5 < strJ3.length(); i5++) {
                if (!Character.isJavaIdentifierPart(strJ3.charAt(i5))) {
                    if (i5 + 1 < i2) {
                        this.j6.codeCompleterCallback.QX(syntaxTree.getFile());
                        u7(syntaxTree, i, i2);
                        return;
                    }
                    return;
                }
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.lg(th, 2332195363615297744L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z));
            }
            throw th;
        }
    }
}
