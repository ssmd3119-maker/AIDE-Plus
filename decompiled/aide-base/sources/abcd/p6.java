package abcd;

import com.aide.codemodel.api.EntitySpace;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.FileSpace;
import com.aide.codemodel.api.IdentifierSpace;
import com.aide.codemodel.api.Member;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.SyntaxTreeSpace;
import com.aide.codemodel.api.collections.ListOfInt;
import com.aide.codemodel.language.java.JavaLanguage;

@cy(clazz = -2404188134513920355L, container = -2404188134513920355L, user = true)
/* loaded from: classes.dex */
public class p6 {

    @fy
    private static /* synthetic */ boolean Hw;

    @gy
    private static /* synthetic */ boolean v5;

    @dy(field = -2742293649480668720L)
    private final SyntaxTreeSpace DW;

    @dy(field = -2071681405668989625L)
    private final JavaLanguage FH;

    @dy(field = 2950546815978744012L)
    private final Model j6;

    static {
        iy.Zo(p6.class);
    }

    @ey(method = 1381662237770325L)
    public p6(Model model, JavaLanguage javaLanguage) {
        try {
            if (Hw) {
                iy.EQ(304012719104885823L, null, model, javaLanguage);
            }
            this.j6 = model;
            this.FH = javaLanguage;
            IdentifierSpace identifierSpace = model.identifierSpace;
            FileSpace fileSpace = model.fileSpace;
            EntitySpace entitySpace = model.entitySpace;
            this.DW = model.syntaxTreeSpace;
        } catch (Throwable th) {
            if (v5) {
                iy.Mr(th, 304012719104885823L, null, model, javaLanguage);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0140  */
    @abcd.ey(method = -886498790103718497L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void DW(com.aide.codemodel.api.SyntaxTree r26, int r27, int r28, int r29, com.aide.codemodel.api.ClassType r30, com.aide.codemodel.api.collections.ListOfInt r31, com.aide.codemodel.api.collections.ListOfInt r32, com.aide.codemodel.api.collections.ListOfInt r33, com.aide.codemodel.api.collections.ListOfInt r34, com.aide.codemodel.api.collections.ListOfInt r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.p6.DW(com.aide.codemodel.api.SyntaxTree, int, int, int, com.aide.codemodel.api.ClassType, com.aide.codemodel.api.collections.ListOfInt, com.aide.codemodel.api.collections.ListOfInt, com.aide.codemodel.api.collections.ListOfInt, com.aide.codemodel.api.collections.ListOfInt, com.aide.codemodel.api.collections.ListOfInt):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x02c6  */
    @abcd.ey(method = 6038897205450945024L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void Hw(com.aide.codemodel.api.SyntaxTree r35, int r36, com.aide.codemodel.api.Member r37, int r38, com.aide.codemodel.api.collections.ListOfInt r39, com.aide.codemodel.api.collections.ListOfInt r40, com.aide.codemodel.api.collections.ListOfInt r41, com.aide.codemodel.api.collections.ListOfInt r42, com.aide.codemodel.api.collections.ListOfInt r43) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 755
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.p6.Hw(com.aide.codemodel.api.SyntaxTree, int, com.aide.codemodel.api.Member, int, com.aide.codemodel.api.collections.ListOfInt, com.aide.codemodel.api.collections.ListOfInt, com.aide.codemodel.api.collections.ListOfInt, com.aide.codemodel.api.collections.ListOfInt, com.aide.codemodel.api.collections.ListOfInt):void");
    }

    @ey(method = 334789861916298900L)
    private void j6(SyntaxTree syntaxTree, int i, int i2, int i3, ListOfInt listOfInt, ListOfInt listOfInt2, ListOfInt listOfInt3, ListOfInt listOfInt4, ListOfInt listOfInt5) {
        try {
            if (Hw) {
                iy.QX(340221024919095837L, this, new Object[]{syntaxTree, new Integer(i), new Integer(i2), new Integer(i3), listOfInt, listOfInt2, listOfInt3, listOfInt4, listOfInt5});
            }
            int startLine = syntaxTree.getStartLine(i) - syntaxTree.getStartLine(i2);
            int startColumn = syntaxTree.getStartColumn(i);
            if (startLine == 0) {
                startColumn -= syntaxTree.getStartColumn(i2);
            }
            int endLine = syntaxTree.getEndLine(i) - syntaxTree.getStartLine(i2);
            int endColumn = syntaxTree.getEndColumn(i);
            if (endLine == 0) {
                endColumn -= syntaxTree.getStartColumn(i2);
            }
            listOfInt.add(i3);
            listOfInt2.add(startLine);
            listOfInt3.add(startColumn);
            listOfInt4.add(endLine);
            listOfInt5.add(endColumn);
        } catch (Throwable th) {
            if (v5) {
                iy.rN(th, 340221024919095837L, this, new Object[]{syntaxTree, new Integer(i), new Integer(i2), new Integer(i3), listOfInt, listOfInt2, listOfInt3, listOfInt4, listOfInt5});
            }
            throw th;
        }
    }

    @ey(method = 6700411465681292880L)
    public void FH(FileEntry fileEntry, Member member, ListOfInt listOfInt, ListOfInt listOfInt2, ListOfInt listOfInt3, ListOfInt listOfInt4, ListOfInt listOfInt5) throws Throwable {
        int i;
        try {
            if (Hw) {
                iy.QX(-5910329506558251443L, this, new Object[]{fileEntry, member, listOfInt, listOfInt2, listOfInt3, listOfInt4, listOfInt5});
            }
            SyntaxTree syntaxTree = this.DW.getSyntaxTree(fileEntry, this.FH);
            syntaxTree.getLanguage().getCodeAnalyzer().Hw(syntaxTree, member.getIdentifier());
            i = 7;
            try {
                Hw(syntaxTree, syntaxTree.getRootNode(), member, member.getIdentifier(), listOfInt, listOfInt2, listOfInt3, listOfInt4, listOfInt5);
                this.DW.releaseSyntaxTree(syntaxTree);
            } catch (Throwable th) {
                th = th;
                if (v5) {
                    Object[] objArr = new Object[i];
                    objArr[0] = fileEntry;
                    objArr[1] = member;
                    objArr[2] = listOfInt;
                    objArr[3] = listOfInt2;
                    objArr[4] = listOfInt3;
                    objArr[5] = listOfInt4;
                    objArr[6] = listOfInt5;
                    iy.rN(th, -5910329506558251443L, this, objArr);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i = 7;
        }
    }

    @ey(method = -3242942434157443488L)
    public boolean v5(Member member, ListOfInt listOfInt, ListOfInt listOfInt2, ListOfInt listOfInt3, ListOfInt listOfInt4, ListOfInt listOfInt5) throws Throwable {
        int childNode;
        int i;
        int childNode2;
        int i2;
        try {
            if (Hw) {
                iy.QX(-4756295515637950713L, this, new Object[]{member, listOfInt, listOfInt2, listOfInt3, listOfInt4, listOfInt5});
            }
            FileEntry file = member.getFile();
            SyntaxTree syntaxTree = this.DW.getSyntaxTree(file, this.FH);
            syntaxTree.getLanguage().getCodeAnalyzer().FH(syntaxTree);
            int memberDeclarationNode = syntaxTree.getMemberDeclarationNode(member.DW());
            int childNode3 = syntaxTree.getChildNode(memberDeclarationNode, 5);
            int childNode4 = syntaxTree.getChildNode(memberDeclarationNode, syntaxTree.getChildCount(memberDeclarationNode) - 1);
            if (syntaxTree.getChildCount(childNode4) == 3 && syntaxTree.getSyntaxTag(syntaxTree.getChildNode(childNode4, 1)) == 141 && syntaxTree.getChildCount(syntaxTree.getChildNode(childNode4, 1)) == 3) {
                childNode = syntaxTree.getChildNode(syntaxTree.getChildNode(childNode4, 1), 1);
                i = childNode;
            } else {
                childNode = -1;
                i = -1;
            }
            if (syntaxTree.getChildCount(childNode4) == 3 && syntaxTree.getSyntaxTag(syntaxTree.getChildNode(childNode4, 1)) == 146 && syntaxTree.getChildCount(syntaxTree.getChildNode(childNode4, 1)) == 2) {
                childNode2 = syntaxTree.getChildNode(syntaxTree.getChildNode(childNode4, 1), 0);
                i2 = childNode2;
            } else {
                int i3 = i;
                childNode2 = childNode;
                i2 = i3;
            }
            try {
                if (childNode2 == -1 || i2 == -1) {
                    this.j6.refactoringCallback.DW("Cannot inline this method.");
                    this.DW.releaseSyntaxTree(syntaxTree);
                    return false;
                }
                this.j6.refactoringCallback.I(file, syntaxTree.getStartLine(childNode2), syntaxTree.getStartColumn(childNode2), syntaxTree.getEndLine(i2), syntaxTree.getEndColumn(i2));
                DW(syntaxTree, childNode4, childNode3, childNode2, member.getEnclosingClassType(), listOfInt, listOfInt2, listOfInt3, listOfInt4, listOfInt5);
                this.DW.releaseSyntaxTree(syntaxTree);
                return true;
            } catch (Throwable th) {
                th = th;
                if (v5) {
                    iy.rN(th, -4756295515637950713L, this, new Object[]{member, listOfInt, listOfInt2, listOfInt3, listOfInt4, listOfInt5});
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
