package abcd;

import com.aide.codemodel.api.ArrayType;
import com.aide.codemodel.api.ClassType;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.Member;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.ParameterizedType;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.Type;
import com.aide.codemodel.api.Variable;
import com.aide.codemodel.api.callback.TemplateEvaluatorCallback;
import com.aide.codemodel.api.collections.ListOf;
import com.aide.codemodel.api.collections.MapOfInt;
import com.aide.codemodel.api.collections.SetOfInt;
import com.aide.codemodel.language.java.JavaCodeAnalyzer;
import com.aide.codemodel.language.java.JavaLanguage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@cy(clazz = 569478349079423408L, container = 569478349079423408L, user = true)
/* loaded from: classes.dex */
public class c6 {

    @fy
    private static /* synthetic */ boolean Hw;

    @gy
    private static /* synthetic */ boolean v5;

    @dy(field = -1814762965619400817L)
    private final JavaLanguage DW;

    @dy(field = -1068829287912789000L)
    private TemplateEvaluatorCallback FH;

    @dy(field = -558908163204205600L)
    private final Model j6;

    static {
        iy.Zo(c6.class);
    }

    @ey(method = -171888689067546627L)
    public c6(Model model, JavaLanguage javaLanguage) {
        try {
            if (Hw) {
                iy.EQ(1317238108434180767L, null, model, javaLanguage);
            }
            this.j6 = model;
            this.DW = javaLanguage;
        } catch (Throwable th) {
            if (v5) {
                iy.Mr(th, 1317238108434180767L, null, model, javaLanguage);
            }
            throw th;
        }
    }

    @ey(method = -2411576413956416L)
    private List<String> DW(String[] strArr) {
        try {
            if (Hw) {
                iy.tp(-608975056513214600L, this, strArr);
            }
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                arrayList.add(str);
            }
            return arrayList;
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, -608975056513214600L, this, strArr);
            }
            throw th;
        }
    }

    @ey(method = -2289592980471802368L)
    private ListOf<Member> Hw(SyntaxTree syntaxTree, int i, int i2, List<String> list) {
        try {
            if (Hw) {
                iy.J0(-859609438130991536L, this, syntaxTree, new Integer(i), new Integer(i2), list);
            }
            ListOf<Member> listOf = new ListOf<>(this.j6.entitySpace);
            int iSy = syntaxTree.sy(i, i2, i, i2);
            int iMz = syntaxTree.Mz(i, i2, i, i2);
            if (iMz != -1) {
                iSy = iMz;
            }
            if (iSy != -1) {
                ((JavaCodeAnalyzer) syntaxTree.getLanguage().getCodeAnalyzer()).VH(syntaxTree, iSy);
            } else {
                ((JavaCodeAnalyzer) syntaxTree.getLanguage().getCodeAnalyzer()).Zo(syntaxTree);
            }
            SetOfInt setOfInt = new SetOfInt();
            while (iSy != -1) {
                if (syntaxTree.getSyntaxTag(iSy) == 122) {
                    try {
                        MapOfInt<Member> mapOfIntEU = this.j6.entitySpace.getClasstype(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getDeclarationNumber(syntaxTree.getParentNode(iSy))).eU();
                        mapOfIntEU.DEFAULT_ITERATOR.DW();
                        while (mapOfIntEU.DEFAULT_ITERATOR.hasMoreElements()) {
                            if (!setOfInt.contains(mapOfIntEU.DEFAULT_ITERATOR.Hw())) {
                                Member member = (Member) mapOfIntEU.DEFAULT_ITERATOR.nextValue();
                                if ((member.getFile() != syntaxTree.getFile() || member.Ws() != i || member.QX() > i2 || member.J8() < i2) && member.getFile().vJ() && VH(member.WB(), list)) {
                                    listOf.j6(member);
                                }
                                setOfInt.put(mapOfIntEU.DEFAULT_ITERATOR.Hw());
                            }
                        }
                    } catch (e4 unused) {
                    }
                }
                iSy = syntaxTree.getParentNode(iSy);
                if (iSy == syntaxTree.getRootNode()) {
                    iSy = -1;
                }
            }
            return listOf;
        } catch (Throwable th) {
            if (v5) {
                iy.a8(th, -859609438130991536L, this, syntaxTree, new Integer(i), new Integer(i2), list);
            }
            throw th;
        }
    }

    @ey(method = -3514698882000756863L)
    private boolean VH(Type type, List<String> list) {
        try {
            if (Hw) {
                iy.EQ(3238075086499228787L, this, type, list);
            }
            if (list.size() < 1) {
                return true;
            }
            for (String str : list) {
                if (str.equals("[]") && type.isArrayType()) {
                    return true;
                }
                if (type.x9().getFullyQualifiedNameString().equals(str)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (v5) {
                iy.Mr(th, 3238075086499228787L, this, type, list);
            }
            throw th;
        }
    }

    @ey(method = -2573750943146933865L)
    private Type Zo(FileEntry fileEntry, int i, int i2, String str) {
        try {
            if (Hw) {
                iy.J0(-183746927828611383L, this, fileEntry, new Integer(i), new Integer(i2), str);
            }
            ClassType rootClasstype = this.j6.entitySpace.getRootClasstype(fileEntry, this.DW);
            SyntaxTree syntaxTreeWe = this.j6.syntaxTreeSpace.we(fileEntry, this.DW, i, i2, str);
            int expressionNodeAt = syntaxTreeWe.getExpressionNodeAt(i, i2);
            if (expressionNodeAt == -1) {
                return rootClasstype;
            }
            syntaxTreeWe.getLanguage().getCodeAnalyzer().VH(syntaxTreeWe, expressionNodeAt);
            if (!syntaxTreeWe.hasAttrType(expressionNodeAt)) {
                return rootClasstype;
            }
            Type attrType = syntaxTreeWe.getAttrType(expressionNodeAt);
            if (attrType.isArrayType()) {
                return ((ArrayType) attrType).getElementType();
            }
            if (attrType.isParameterizedType()) {
                return ((ParameterizedType) attrType).getAbsoluteArgumentTypes()[0];
            }
            if (!attrType.isClassType()) {
                return rootClasstype;
            }
            MapOfInt<Member> mapOfIntSM = ((ClassType) attrType).sM();
            mapOfIntSM.DEFAULT_ITERATOR.init(this.j6.identifierSpace.get("get"));
            while (mapOfIntSM.DEFAULT_ITERATOR.hasMoreElements()) {
                try {
                    return ((Member) mapOfIntSM.DEFAULT_ITERATOR.nextValue()).WB();
                } catch (e4 unused) {
                }
            }
            return rootClasstype;
        } catch (Throwable th) {
            if (v5) {
                iy.a8(th, -183746927828611383L, this, fileEntry, new Integer(i), new Integer(i2), str);
            }
            throw th;
        }
    }

    @ey(method = 1537836665372784000L)
    private void gn(FileEntry fileEntry, int i, int i2, List<String> list) {
        try {
            if (Hw) {
                iy.J0(925401073298326688L, this, fileEntry, new Integer(i), new Integer(i2), list);
            }
            SyntaxTree syntaxTree = this.j6.syntaxTreeSpace.getSyntaxTree(fileEntry, this.DW);
            Iterator<Variable> it = v5(syntaxTree, i, i2, list).iterator();
            while (it.hasNext()) {
                this.FH.v5(it.next());
            }
            ListOf<Member> listOfHw = Hw(syntaxTree, i, i2, list);
            for (int i3 = 0; i3 < listOfHw.EQ(); i3++) {
                this.FH.DW(listOfHw.v5(i3));
            }
            this.j6.syntaxTreeSpace.releaseSyntaxTree(syntaxTree);
        } catch (Throwable th) {
            if (v5) {
                iy.a8(th, 925401073298326688L, this, fileEntry, new Integer(i), new Integer(i2), list);
            }
            throw th;
        }
    }

    @ey(method = -1331139156898362516L)
    private void j6(Type type) {
        try {
            if (Hw) {
                iy.tp(-724059104535346344L, this, type);
            }
            this.FH.DW(type);
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, -724059104535346344L, this, type);
            }
            throw th;
        }
    }

    @ey(method = 320538809722896125L)
    private void tp(FileEntry fileEntry, int i, int i2, List<String> list) {
        try {
            if (Hw) {
                iy.J0(-3844137595549056585L, this, fileEntry, new Integer(i), new Integer(i2), list);
            }
            List<Variable> listV5 = v5(this.j6.syntaxTreeSpace.u7(fileEntry, this.DW, i, i2, "i;"), i, i2, Collections.EMPTY_LIST);
            for (String str : list) {
                Iterator<Variable> it = listV5.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().getIdentifier() == this.j6.identifierSpace.get(str)) {
                            break;
                        }
                    } else {
                        this.FH.Hw(str);
                        break;
                    }
                }
            }
        } catch (Throwable th) {
            if (v5) {
                iy.a8(th, -3844137595549056585L, this, fileEntry, new Integer(i), new Integer(i2), list);
            }
            throw th;
        }
    }

    @ey(method = -32338451182289355L)
    private void u7(FileEntry fileEntry, int i, int i2) {
        try {
            if (Hw) {
                iy.we(6245229288608129507L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            SyntaxTree syntaxTree = this.j6.syntaxTreeSpace.getSyntaxTree(fileEntry, this.DW);
            int iEt = syntaxTree.et(i, i2);
            if (iEt != -1 && syntaxTree.getSyntaxTag(iEt) == 172 && syntaxTree.getSyntaxTag(syntaxTree.getChildNode(iEt, 1)) == 17) {
                ((JavaCodeAnalyzer) syntaxTree.getLanguage().getCodeAnalyzer()).VH(syntaxTree, iEt);
                int childNode = syntaxTree.getChildNode(iEt, 0);
                int childNode2 = syntaxTree.getChildNode(iEt, 1);
                int childNode3 = syntaxTree.getChildNode(iEt, 2);
                if (!syntaxTree.hasAttrType(childNode)) {
                    this.j6.codeCompleterCallback.EQ(fileEntry, i, i2);
                    this.j6.syntaxTreeSpace.releaseSyntaxTree(syntaxTree);
                    return;
                } else {
                    j6(syntaxTree.getAttrType(childNode));
                    this.j6.codeCompleterCallback.u7(fileEntry, i, i2, new int[]{syntaxTree.getEndLine(childNode2), syntaxTree.getEndLine(childNode3)}, new int[]{syntaxTree.getEndColumn(childNode2) - 1, syntaxTree.getEndColumn(childNode3)});
                    this.j6.syntaxTreeSpace.releaseSyntaxTree(syntaxTree);
                    return;
                }
            }
            int syntaxTagNodeAt = syntaxTree.getSyntaxTagNodeAt(200, i, i2, i, i2);
            if (syntaxTagNodeAt == -1 || syntaxTree.getChildCount(syntaxTagNodeAt) != 4) {
                this.j6.codeCompleterCallback.EQ(fileEntry, i, i2);
                this.j6.syntaxTreeSpace.releaseSyntaxTree(syntaxTree);
                return;
            }
            ((JavaCodeAnalyzer) syntaxTree.getLanguage().getCodeAnalyzer()).VH(syntaxTree, syntaxTagNodeAt);
            int childNode4 = syntaxTree.getChildNode(syntaxTagNodeAt, 0);
            int childNode5 = syntaxTree.getChildNode(syntaxTagNodeAt, 2);
            int childNode6 = syntaxTree.getChildNode(syntaxTagNodeAt, 3);
            if (!syntaxTree.hasAttrType(childNode4)) {
                this.j6.codeCompleterCallback.EQ(fileEntry, i, i2);
                this.j6.syntaxTreeSpace.releaseSyntaxTree(syntaxTree);
            } else {
                j6(syntaxTree.getAttrType(childNode4));
                this.j6.codeCompleterCallback.u7(fileEntry, i, i2, new int[]{syntaxTree.getStartLine(childNode5), syntaxTree.getEndLine(childNode6)}, new int[]{syntaxTree.getStartColumn(childNode5), syntaxTree.getEndColumn(childNode6)});
                this.j6.syntaxTreeSpace.releaseSyntaxTree(syntaxTree);
            }
        } catch (Throwable th) {
            if (v5) {
                iy.U2(th, 6245229288608129507L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 70138051894242976L)
    private List<Variable> v5(SyntaxTree syntaxTree, int i, int i2, List<String> list) {
        try {
            if (Hw) {
                iy.J0(4966980817382674668L, this, syntaxTree, new Integer(i), new Integer(i2), list);
            }
            ArrayList arrayList = new ArrayList();
            int iSy = syntaxTree.sy(i, i2, i, i2);
            int iMz = syntaxTree.Mz(i, i2, i, i2);
            if (iMz != -1) {
                iSy = iMz;
            }
            if (iSy != -1) {
                ((JavaCodeAnalyzer) syntaxTree.getLanguage().getCodeAnalyzer()).VH(syntaxTree, iSy);
            } else {
                ((JavaCodeAnalyzer) syntaxTree.getLanguage().getCodeAnalyzer()).Zo(syntaxTree);
            }
            SetOfInt setOfInt = new SetOfInt();
            int i3 = iSy;
            for (int i4 = -1; iSy != i4; i4 = -1) {
                int i5 = 151;
                int i6 = 0;
                if (syntaxTree.getSyntaxTag(iSy) == 133) {
                    int childCount = syntaxTree.getChildCount(iSy) - 1;
                    while (childCount >= 0 && syntaxTree.getChildNode(iSy, childCount) != i3) {
                        childCount--;
                    }
                    int i7 = childCount - 1;
                    while (i7 >= 0) {
                        int childNode = syntaxTree.getChildNode(iSy, i7);
                        if (syntaxTree.getSyntaxTag(childNode) == i5) {
                            int childCount2 = syntaxTree.getChildCount(childNode);
                            int i8 = 3;
                            while (i8 < childCount2) {
                                int childNode2 = syntaxTree.getChildNode(syntaxTree.getChildNode(childNode, i8), i6);
                                int identifier = syntaxTree.getIdentifier(childNode2);
                                if (!setOfInt.contains(identifier) && syntaxTree.hasAttrType(childNode2) && (syntaxTree.getStartLine(childNode2) != i || syntaxTree.getStartColumn(childNode2) > i2 || syntaxTree.getEndColumn(childNode2) < i2)) {
                                    Type attrType = syntaxTree.getAttrType(childNode2);
                                    if (VH(attrType, list)) {
                                        arrayList.add(new Variable(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getStartLine(childNode2), syntaxTree.getStartColumn(childNode2), syntaxTree.getEndColumn(childNode2), identifier, attrType));
                                    }
                                }
                                i8 += 2;
                                i6 = 0;
                            }
                        }
                        i7--;
                        i5 = 151;
                        i6 = 0;
                    }
                } else {
                    int i9 = 16;
                    if (syntaxTree.getSyntaxTag(iSy) == 124) {
                        int childNode3 = syntaxTree.getChildNode(iSy, 5);
                        int childCount3 = syntaxTree.getChildCount(childNode3);
                        int i10 = 1;
                        while (i10 < childCount3 - 1) {
                            int childNode4 = syntaxTree.getChildNode(childNode3, i10);
                            if (syntaxTree.getSyntaxTag(childNode4) != i9) {
                                int childNode5 = syntaxTree.getChildNode(childNode4, 3);
                                int identifier2 = syntaxTree.getIdentifier(childNode5);
                                if (!setOfInt.contains(identifier2) && syntaxTree.hasAttrType(childNode5)) {
                                    Type attrType2 = syntaxTree.getAttrType(childNode5);
                                    if (VH(attrType2, list)) {
                                        arrayList.add(new Variable(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getStartLine(childNode5), syntaxTree.getStartColumn(childNode5), syntaxTree.getEndColumn(childNode5), identifier2, attrType2));
                                    }
                                }
                            }
                            i10 += 2;
                            i9 = 16;
                        }
                    } else if (syntaxTree.getSyntaxTag(iSy) == 123) {
                        int i11 = 3;
                        int childNode6 = syntaxTree.getChildNode(iSy, 3);
                        int childCount4 = syntaxTree.getChildCount(childNode6);
                        int i12 = 1;
                        while (i12 < childCount4 - 1) {
                            int childNode7 = syntaxTree.getChildNode(childNode6, i12);
                            int childNode8 = syntaxTree.getChildNode(childNode7, i11);
                            if (syntaxTree.getSyntaxTag(childNode7) != 16) {
                                int identifier3 = syntaxTree.getIdentifier(childNode8);
                                if (!setOfInt.contains(identifier3) && syntaxTree.hasAttrType(childNode8)) {
                                    Type attrType3 = syntaxTree.getAttrType(childNode8);
                                    if (VH(attrType3, list)) {
                                        arrayList.add(new Variable(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getStartLine(childNode8), syntaxTree.getStartColumn(childNode8), syntaxTree.getEndColumn(childNode8), identifier3, attrType3));
                                    }
                                }
                            }
                            i12 += 2;
                            i11 = 3;
                        }
                    } else if (syntaxTree.getSyntaxTag(iSy) == 204 && syntaxTree.getChildCount(iSy) == 7) {
                        int childNode9 = syntaxTree.getChildNode(iSy, 4);
                        int identifier4 = syntaxTree.getIdentifier(childNode9);
                        if (!setOfInt.contains(identifier4) && syntaxTree.hasAttrType(childNode9)) {
                            Type attrType4 = syntaxTree.getAttrType(childNode9);
                            if (VH(attrType4, list)) {
                                arrayList.add(new Variable(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getStartLine(childNode9), syntaxTree.getStartColumn(childNode9), syntaxTree.getEndColumn(childNode9), identifier4, attrType4));
                            }
                        }
                    } else if (syntaxTree.getSyntaxTag(iSy) == 211) {
                        int childNode10 = syntaxTree.getChildNode(iSy, 5);
                        int identifier5 = syntaxTree.getIdentifier(childNode10);
                        if (!setOfInt.contains(identifier5) && syntaxTree.hasAttrType(childNode10)) {
                            Type attrType5 = syntaxTree.getAttrType(childNode10);
                            if (VH(attrType5, list)) {
                                arrayList.add(new Variable(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getStartLine(childNode10), syntaxTree.getStartColumn(childNode10), syntaxTree.getEndColumn(childNode10), identifier5, attrType5));
                            }
                        }
                    } else if (syntaxTree.getSyntaxTag(iSy) == 149) {
                        int childNode11 = syntaxTree.getChildNode(syntaxTree.getChildNode(iSy, 2), 0);
                        if (syntaxTree.getSyntaxTag(childNode11) == 151) {
                            int childCount5 = syntaxTree.getChildCount(childNode11);
                            for (int i13 = 3; i13 < childCount5; i13 += 2) {
                                int childNode12 = syntaxTree.getChildNode(syntaxTree.getChildNode(childNode11, i13), 0);
                                int identifier6 = syntaxTree.getIdentifier(childNode12);
                                if (!setOfInt.contains(identifier6) && syntaxTree.hasAttrType(childNode12)) {
                                    Type attrType6 = syntaxTree.getAttrType(childNode12);
                                    if (VH(attrType6, list)) {
                                        arrayList.add(new Variable(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getStartLine(childNode12), syntaxTree.getStartColumn(childNode12), syntaxTree.getEndColumn(childNode12), identifier6, attrType6));
                                    }
                                }
                            }
                        }
                    }
                }
                int parentNode = syntaxTree.getParentNode(iSy);
                if (parentNode == syntaxTree.getRootNode()) {
                    i3 = iSy;
                    iSy = -1;
                } else {
                    i3 = iSy;
                    iSy = parentNode;
                }
            }
            return arrayList;
        } catch (Throwable th) {
            if (v5) {
                iy.a8(th, 4966980817382674668L, this, syntaxTree, new Integer(i), new Integer(i2), list);
            }
            throw th;
        }
    }

    @ey(method = 464948612436863781L)
    public void FH(TemplateEvaluatorCallback templateEvaluatorCallback, FileEntry fileEntry, int i, int i2, String str, List<String> list) {
        try {
            if (Hw) {
                iy.QX(3411873788958262135L, this, new Object[]{templateEvaluatorCallback, fileEntry, new Integer(i), new Integer(i2), str, list});
            }
            this.FH = templateEvaluatorCallback;
            templateEvaluatorCallback.j6();
            if (str.equals("SELECT")) {
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    templateEvaluatorCallback.Hw(it.next());
                }
            }
            if (str.equals("SELECT_VARIABLE")) {
                gn(fileEntry, i, i2, list);
            }
            if (str.equals("SUGGEST_NAME")) {
                tp(fileEntry, i, i2, DW(new String[]{"v", "f", "t"}));
            }
            if (str.equals("SUGGEST_TYPE")) {
                u7(fileEntry, i, i2);
            }
            if (str.equals("SUGGEST_ELEMENT_NAME")) {
                if (list.size() == 1) {
                    String str2 = list.get(0);
                    if (str2.endsWith("s")) {
                        tp(fileEntry, i, i2, DW(new String[]{str2.substring(0, str2.length() - 1)}));
                    }
                }
                tp(fileEntry, i, i2, DW(new String[]{"e", "m", "a"}));
            }
            if (str.equals("SUGGEST_INDEX_NAME")) {
                tp(fileEntry, i, i2, DW(new String[]{"i", "j", "k", "n", "z", "l"}));
            }
            if (str.equals("SUGGEST_EXCEPTION_NAME")) {
                tp(fileEntry, i, i2, DW(new String[]{"e", "ex", "e2", "e3", "e4"}));
            }
            if (str.equals("GET_ELEMENT_TYPE") && list.size() == 1) {
                try {
                    templateEvaluatorCallback.DW(Zo(fileEntry, i, i2, list.get(0)));
                } catch (e4 unused) {
                }
            }
            templateEvaluatorCallback.FH();
        } catch (Throwable th) {
            if (v5) {
                iy.rN(th, 3411873788958262135L, this, new Object[]{templateEvaluatorCallback, fileEntry, new Integer(i), new Integer(i2), str, list});
            }
            throw th;
        }
    }
}
