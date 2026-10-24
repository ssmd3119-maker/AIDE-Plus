package abcd;

import com.aide.codemodel.api.ClassType;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.Member;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.collections.SetOf;
import com.aide.codemodel.language.java.JavaLanguage;
import com.aide.codemodel.language.java.JavaTypeSystem;
import com.aide.uidesigner.ProxyTextView;

@cy(clazz = -1595680503914442828L, container = -1595680503914442828L, user = true)
/* loaded from: classes.dex */
public class v5 {

    @gy
    private static /* synthetic */ boolean Zo;

    @fy
    private static /* synthetic */ boolean v5;

    @dy(field = -3417549030329440840L)
    private final JavaLanguage DW;

    @dy(field = 3721802357976431547L)
    private final JavaTypeSystem FH;

    @dy(field = 3334583485697315976L)
    private SetOf<ClassType> Hw;

    @dy(field = 103992830767946611L)
    private final Model j6;

    static {
        iy.Zo(v5.class);
    }

    @ey(method = 337526935299504135L)
    public v5(Model model, JavaLanguage javaLanguage, JavaTypeSystem javaTypeSystem) {
        try {
            if (v5) {
                iy.we(-6383341444506575013L, null, model, javaLanguage, javaTypeSystem);
            }
            this.j6 = model;
            this.DW = javaLanguage;
            this.FH = javaTypeSystem;
        } catch (Throwable th) {
            if (Zo) {
                iy.U2(th, -6383341444506575013L, null, model, javaLanguage, javaTypeSystem);
            }
            throw th;
        }
    }

    @ey(method = 229983596541304725L)
    private void FH(SyntaxTree syntaxTree, int i, String str) {
        try {
            if (v5) {
                iy.we(-39093188860916325L, this, syntaxTree, new Integer(i), str);
            }
            this.j6.refactoringCallback.nw(syntaxTree.getFile(), syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i), syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i), str);
        } catch (Throwable th) {
            if (Zo) {
                iy.U2(th, -39093188860916325L, this, syntaxTree, new Integer(i), str);
            }
            throw th;
        }
    }

    @ey(method = -571247119242875160L)
    private void Hw(SyntaxTree syntaxTree, int i, String str) {
        try {
            if (v5) {
                iy.we(221222261530273200L, this, syntaxTree, new Integer(i), str);
            }
            this.j6.refactoringCallback.nw(syntaxTree.getFile(), syntaxTree.getEndLine(i), syntaxTree.getEndColumn(i), syntaxTree.getEndLine(i), syntaxTree.getEndColumn(i), str);
        } catch (Throwable th) {
            if (Zo) {
                iy.U2(th, 221222261530273200L, this, syntaxTree, new Integer(i), str);
            }
            throw th;
        }
    }

    @ey(method = 1441794305857159056L)
    private void VH(SyntaxTree syntaxTree, int i, String str) {
        try {
            if (v5) {
                iy.we(7613045680373985816L, this, syntaxTree, new Integer(i), str);
            }
            if (syntaxTree.getStartLine(i) != syntaxTree.getEndLine(i) || syntaxTree.getStartColumn(i) != syntaxTree.getEndColumn(i)) {
                str = str.trim();
            }
            Zo(syntaxTree, i, str);
        } catch (Throwable th) {
            String str2 = str;
            if (Zo) {
                iy.U2(th, 7613045680373985816L, this, syntaxTree, new Integer(i), str2);
            }
            throw th;
        }
    }

    @ey(method = -770624755709990699L)
    private void Zo(SyntaxTree syntaxTree, int i, String str) {
        try {
            if (v5) {
                iy.we(8316019787100711L, this, syntaxTree, new Integer(i), str);
            }
            if (syntaxTree.isSyntheticNode(i)) {
                return;
            }
            this.j6.refactoringCallback.nw(syntaxTree.getFile(), syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i), syntaxTree.getEndLine(i), syntaxTree.getEndColumn(i), str);
        } catch (Throwable th) {
            if (Zo) {
                iy.U2(th, 8316019787100711L, this, syntaxTree, new Integer(i), str);
            }
            throw th;
        }
    }

    @ey(method = 165640401617673800L)
    private void j6(SyntaxTree syntaxTree, int i) {
        String str;
        try {
            if (v5) {
                iy.EQ(244532469758567316L, this, syntaxTree, new Integer(i));
            }
            str = "";
            try {
                switch (syntaxTree.getSyntaxTag(i)) {
                    case 1:
                        if (syntaxTree.sh(i) == 27 && syntaxTree.getIdentifier(i) == this.j6.identifierSpace.get("length")) {
                            Zo(syntaxTree, i, "Length");
                            return;
                        }
                        if (syntaxTree.getIdentifier(i) == this.j6.identifierSpace.get("out")) {
                            Zo(syntaxTree, i, "@out");
                            return;
                        }
                        if (syntaxTree.getIdentifier(i) == this.j6.identifierSpace.get("in")) {
                            Zo(syntaxTree, i, "@in");
                            return;
                        }
                        if (syntaxTree.getIdentifier(i) == this.j6.identifierSpace.get("namespace")) {
                            Zo(syntaxTree, i, "@namespace");
                            return;
                        }
                        if (syntaxTree.getIdentifier(i) == this.j6.identifierSpace.get("operator")) {
                            Zo(syntaxTree, i, "@operator");
                            return;
                        }
                        if (syntaxTree.getIdentifier(i) == this.j6.identifierSpace.get("lock")) {
                            Zo(syntaxTree, i, "@lock");
                            return;
                        }
                        if (syntaxTree.getIdentifier(i) == this.j6.identifierSpace.get("string")) {
                            Zo(syntaxTree, i, "str");
                            return;
                        }
                        if ((syntaxTree.sh(i) != 8 && syntaxTree.sh(i) != 9 && syntaxTree.sh(i) != 10 && syntaxTree.sh(i) != 17 && syntaxTree.sh(i) != 22 && syntaxTree.sh(i) != 23 && syntaxTree.sh(i) != 24 && syntaxTree.sh(i) != 25) || syntaxTree.getAttrReferenceEntity(i).getFile().vJ()) {
                            if (syntaxTree.sh(i) != 20 && syntaxTree.sh(i) != 19) {
                                if (syntaxTree.sh(i) == 16) {
                                    Member member = (Member) syntaxTree.getAttrReferenceEntity(i);
                                    if (member.gG()) {
                                        ClassType enclosingClassType = member.getEnclosingClassType();
                                        if (this.Hw.contains(enclosingClassType)) {
                                            FH(syntaxTree, i, enclosingClassType.getNameString() + ".");
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            String string = this.j6.identifierSpace.getString(syntaxTree.getIdentifier(i));
                            if (string.length() > 0) {
                                String str2 = Character.toUpperCase(string.charAt(0)) + string.substring(1, string.length());
                                if (string.equals(str2)) {
                                    return;
                                }
                                Zo(syntaxTree, i, str2);
                                return;
                            }
                            return;
                        }
                        if (syntaxTree.getIdentifier(i) == this.j6.identifierSpace.get("Reader")) {
                            Zo(syntaxTree, i, "TextReader");
                            return;
                        }
                        if (syntaxTree.getIdentifier(i) == this.j6.identifierSpace.get("ArrayList")) {
                            Zo(syntaxTree, i, "List");
                            return;
                        }
                        if (syntaxTree.getIdentifier(i) == this.j6.identifierSpace.get("Vector")) {
                            Zo(syntaxTree, i, "List");
                            return;
                        }
                        if (syntaxTree.getIdentifier(i) == this.j6.identifierSpace.get("Map")) {
                            Zo(syntaxTree, i, "Dictionary");
                            return;
                        }
                        if (syntaxTree.getIdentifier(i) == this.j6.identifierSpace.get("HashMap")) {
                            Zo(syntaxTree, i, "Dictionary");
                            return;
                        }
                        if (syntaxTree.getIdentifier(i) == this.j6.identifierSpace.get("File")) {
                            Zo(syntaxTree, i, "Path");
                            return;
                        }
                        if (syntaxTree.getIdentifier(i) == this.j6.identifierSpace.get("Long")) {
                            Zo(syntaxTree, i, "long");
                            return;
                        }
                        if (syntaxTree.getIdentifier(i) == this.j6.identifierSpace.get("Integer")) {
                            Zo(syntaxTree, i, "int");
                            return;
                        } else if (syntaxTree.getIdentifier(i) == this.j6.identifierSpace.get("StringBuffer")) {
                            Zo(syntaxTree, i, "StringBuilder");
                            return;
                        } else {
                            if (syntaxTree.getIdentifier(i) == this.j6.identifierSpace.get("InputStream")) {
                                Zo(syntaxTree, i, "Stream");
                                return;
                            }
                            return;
                        }
                    case 60:
                        Zo(syntaxTree, i, "sbyte");
                        return;
                    case 78:
                        if (syntaxTree.isSyntheticNode(i)) {
                            return;
                        }
                        Zo(syntaxTree, i, "base");
                        return;
                    case 89:
                        Zo(syntaxTree, i, "bool");
                        return;
                    case 103:
                        Zo(syntaxTree, i, "is");
                        return;
                    case 104:
                        Zo(syntaxTree, i, "lock");
                        return;
                    case 120:
                    case 227:
                        ClassType classtype = this.j6.entitySpace.getClasstype(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getDeclarationNumber(i));
                        j6(syntaxTree, syntaxTree.getChildNode(i, syntaxTree.getChildCount(i) - 1));
                        int childNode = syntaxTree.getChildNode(i, 5);
                        int childNode2 = syntaxTree.getChildNode(i, 4);
                        if (syntaxTree.getChildCount(childNode2) > 0) {
                            if (syntaxTree.getChildCount(childNode) > 0) {
                                Zo(syntaxTree, syntaxTree.getChildNode(childNode, 0), ",");
                            }
                            Zo(syntaxTree, syntaxTree.getChildNode(childNode2, 0), ":");
                        } else if (syntaxTree.getChildCount(childNode) > 0) {
                            Zo(syntaxTree, syntaxTree.getChildNode(childNode, 0), ":");
                        }
                        j6(syntaxTree, syntaxTree.getChildNode(i, 3));
                        str = y1.J8(classtype.getModifiers()) ? "public " : "";
                        if (y1.J0(classtype.getModifiers())) {
                            str = str + "public ";
                        }
                        if (y1.XL(classtype.getModifiers())) {
                            str = str + "sealed ";
                        }
                        VH(syntaxTree, syntaxTree.getChildNode(i, 0), str);
                        return;
                    case 124:
                        Member memberJw = this.j6.entitySpace.jw(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getDeclarationNumber(i));
                        for (int childCount = syntaxTree.getChildCount(i) - 1; childCount >= 1; childCount--) {
                            j6(syntaxTree, syntaxTree.getChildNode(i, childCount));
                        }
                        if (!memberJw.getEnclosingClassType().isInterfaceType()) {
                            str = y1.J0(memberJw.getModifiers()) ? "protected " : "";
                            if (y1.gn(memberJw.getModifiers())) {
                                str = str + "private ";
                            }
                            if (y1.J8(memberJw.getModifiers())) {
                                str = str + "public ";
                            }
                            if (y1.we(memberJw.getModifiers())) {
                                str = str + "internal ";
                            }
                            if (y1.aM(memberJw.getModifiers())) {
                                str = str + "static ";
                            }
                            if (y1.j6(memberJw.getModifiers())) {
                                str = str + "abstract ";
                            } else if (memberJw.hK()) {
                                str = str + "override ";
                            } else if (!y1.XL(memberJw.getModifiers()) && !y1.aM(memberJw.getModifiers()) && !y1.gn(memberJw.getModifiers())) {
                                str = str + "virtual ";
                            }
                        }
                        VH(syntaxTree, syntaxTree.getChildNode(i, 0), str);
                        return;
                    case 126:
                        Member memberJw2 = this.j6.entitySpace.jw(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getDeclarationNumber(syntaxTree.getChildNode(i, 3)));
                        for (int childCount2 = syntaxTree.getChildCount(i) - 1; childCount2 >= 1; childCount2--) {
                            j6(syntaxTree, syntaxTree.getChildNode(i, childCount2));
                        }
                        str = y1.J0(memberJw2.getModifiers()) ? "protected " : "";
                        if (y1.gn(memberJw2.getModifiers())) {
                            str = str + "private ";
                        }
                        if (y1.J8(memberJw2.getModifiers())) {
                            str = str + "public ";
                        }
                        if (y1.we(memberJw2.getModifiers())) {
                            str = str + "internal ";
                        }
                        if (y1.Hw(memberJw2.getModifiers()) && y1.aM(memberJw2.getModifiers())) {
                            str = str + "const ";
                        } else if (y1.Hw(memberJw2.getModifiers()) && !y1.aM(memberJw2.getModifiers())) {
                            str = str + "readonly ";
                        } else if (y1.aM(memberJw2.getModifiers())) {
                            str = str + "static ";
                        }
                        VH(syntaxTree, syntaxTree.getChildNode(i, 0), str);
                        return;
                    case 180:
                        if (syntaxTree.hasAttrType(i) && syntaxTree.getAttrType(i) == this.FH.oY(syntaxTree.getFile())) {
                            Zo(syntaxTree, i, "string");
                            return;
                        }
                        for (int childCount3 = syntaxTree.getChildCount(i) - 1; childCount3 >= 0; childCount3--) {
                            j6(syntaxTree, syntaxTree.getChildNode(i, childCount3));
                        }
                        return;
                    case 195:
                        Zo(syntaxTree, i, "");
                        return;
                    case 208:
                        if (syntaxTree.getChildCount(i) > 1) {
                            v5(syntaxTree, syntaxTree.getChildNode(i, 1), syntaxTree.getChildNode(i, syntaxTree.getChildCount(i) - 1), "");
                            return;
                        }
                        return;
                    case 211:
                        j6(syntaxTree, syntaxTree.getChildNode(i, syntaxTree.getChildCount(i) - 1));
                        j6(syntaxTree, syntaxTree.getChildNode(i, syntaxTree.getChildCount(i) - 3));
                        Zo(syntaxTree, syntaxTree.getChildNode(i, syntaxTree.getChildCount(i) - 4), "in");
                        for (int childCount4 = syntaxTree.getChildCount(i) - 5; childCount4 >= 1; childCount4--) {
                            j6(syntaxTree, syntaxTree.getChildNode(i, childCount4));
                        }
                        Zo(syntaxTree, syntaxTree.getChildNode(i, 0), "foreach");
                        return;
                    case 213:
                    case 214:
                        Zo(syntaxTree, i, "");
                        return;
                    case ProxyTextView.INPUTTYPE_textWebPassword /* 225 */:
                        if (syntaxTree.isSyntheticNode(i)) {
                            return;
                        }
                        Zo(syntaxTree, syntaxTree.getChildNode(i, 0), "using");
                        return;
                    case 226:
                        if (syntaxTree.isSyntheticNode(i)) {
                            return;
                        }
                        v5(syntaxTree, syntaxTree.getChildNode(i, syntaxTree.getChildCount(i) - 3), syntaxTree.getChildNode(i, syntaxTree.getChildCount(i) - 2), "");
                        Zo(syntaxTree, syntaxTree.getChildNode(i, 0), "using");
                        return;
                    case 230:
                        Zo(syntaxTree, i, "");
                        return;
                    default:
                        for (int childCount5 = syntaxTree.getChildCount(i) - 1; childCount5 >= 0; childCount5--) {
                            j6(syntaxTree, syntaxTree.getChildNode(i, childCount5));
                        }
                        return;
                }
            } catch (e4 unused) {
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.Mr(th, 244532469758567316L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 69694953771841384L)
    private void v5(SyntaxTree syntaxTree, int i, int i2, String str) {
        try {
            if (v5) {
                iy.J0(8106363743677126164L, this, syntaxTree, new Integer(i), new Integer(i2), str);
            }
            this.j6.refactoringCallback.nw(syntaxTree.getFile(), syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i), syntaxTree.getEndLine(i2), syntaxTree.getEndColumn(i2), str);
        } catch (Throwable th) {
            if (Zo) {
                iy.a8(th, 8106363743677126164L, this, syntaxTree, new Integer(i), new Integer(i2), str);
            }
            throw th;
        }
    }

    @ey(method = 4129784383875446873L)
    public void DW(FileEntry fileEntry, String str) {
        try {
            if (v5) {
                iy.EQ(-3381069999300397497L, this, fileEntry, str);
            }
            SyntaxTree syntaxTree = this.j6.syntaxTreeSpace.getSyntaxTree(fileEntry, this.DW);
            this.DW.getCodeAnalyzer().FH(syntaxTree);
            this.Hw = new SetOf<>(this.j6.entitySpace);
            int childCount = syntaxTree.getChildCount(syntaxTree.getRootNode());
            for (int i = 0; i < childCount; i++) {
                int childNode = syntaxTree.getChildNode(syntaxTree.getRootNode(), i);
                if (syntaxTree.getSyntaxTag(childNode) == 214) {
                    int childNode2 = syntaxTree.getChildNode(childNode, syntaxTree.getChildCount(childNode) - 4);
                    if (syntaxTree.sh(childNode2) == 8) {
                        this.Hw.put((ClassType) syntaxTree.getAttrReferenceEntity(childNode2));
                    }
                }
            }
            int childNode3 = syntaxTree.getChildNode(syntaxTree.getRootNode(), 0);
            if (syntaxTree.getChildCount(childNode3) > 0) {
                Hw(syntaxTree, syntaxTree.getRootNode(), "\n}");
            }
            j6(syntaxTree, syntaxTree.getRootNode());
            if (syntaxTree.getChildCount(childNode3) > 0) {
                Hw(syntaxTree, childNode3, " {\nusing System;\nusing System.IO;\nusing System.Text;\nusing System.Collections.Generic;\n");
                Zo(syntaxTree, syntaxTree.getChildNode(childNode3, syntaxTree.getChildCount(childNode3) - 1), "");
                Zo(syntaxTree, syntaxTree.getChildNode(childNode3, 1), "namespace");
            }
            this.j6.syntaxTreeSpace.releaseSyntaxTree(syntaxTree);
        } catch (Throwable th) {
            if (Zo) {
                iy.Mr(th, -3381069999300397497L, this, fileEntry, str);
            }
            throw th;
        }
    }
}
