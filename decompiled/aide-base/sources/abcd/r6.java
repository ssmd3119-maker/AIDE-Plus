package abcd;

import com.aide.codemodel.api.ClassType;
import com.aide.codemodel.api.EntitySpace;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.IdentifierSpace;
import com.aide.codemodel.api.Member;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.SyntaxTreeSpace;
import com.aide.codemodel.api.Type;
import com.aide.codemodel.api.collections.ListOfInt;
import com.aide.codemodel.api.collections.SetOf;
import com.aide.codemodel.api.collections.SetOfInt;
import com.aide.codemodel.language.java.JavaCodeAnalyzer;
import com.aide.codemodel.language.java.JavaLanguage;
import com.aide.codemodel.language.java.JavaSyntax;

@cy(clazz = 48203605658979936L, container = 48203605658979936L, user = true)
/* loaded from: classes.dex */
public class r6 {

    @fy
    private static /* synthetic */ boolean VH;

    @gy
    private static /* synthetic */ boolean gn;

    @dy(field = 1204595371401331840L)
    private final SyntaxTreeSpace DW;

    @dy(field = 1158738881381620307L)
    private final EntitySpace FH;

    @dy(field = -3056027295716288211L)
    private final IdentifierSpace Hw;

    @dy(field = -2779747041163300455L)
    private final JavaLanguage Zo;

    @dy(field = 912916529807335960L)
    private final Model j6;

    @dy(field = 1762758078765832980L)
    private final a v5;

    @cy(clazz = 4916411650684359655L, container = 4916411650684359655L, user = true)
    private static class a {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @dy(field = -1936413467153648725L)
        private final EntitySpace j6;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 122909760150894760L)
        public a(EntitySpace entitySpace) {
            try {
                if (DW) {
                    iy.tp(-477732507556649503L, null, entitySpace);
                }
                this.j6 = entitySpace;
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, -477732507556649503L, null, entitySpace);
                }
                throw th;
            }
        }

        @ey(method = 1801216663677519576L)
        private SetOfInt DW(SyntaxTree syntaxTree, ListOfInt listOfInt) {
            try {
                if (DW) {
                    iy.EQ(659024979776985024L, this, syntaxTree, listOfInt);
                }
                SetOfInt setOfInt = new SetOfInt();
                for (int i = 0; i < listOfInt.size(); i++) {
                    FH(syntaxTree, listOfInt.get(i), setOfInt);
                }
                return setOfInt;
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, 659024979776985024L, this, syntaxTree, listOfInt);
                }
                throw th;
            }
        }

        @ey(method = 493659593886552912L)
        private void FH(SyntaxTree syntaxTree, int i, SetOfInt setOfInt) {
            try {
                if (DW) {
                    iy.we(-158161632283604256L, this, syntaxTree, new Integer(i), setOfInt);
                }
                int childCount = syntaxTree.getChildCount(i);
                for (int i2 = 0; i2 < childCount; i2++) {
                    FH(syntaxTree, syntaxTree.getChildNode(i, i2), setOfInt);
                }
                if (syntaxTree.getSyntaxTag(i) == 1 && syntaxTree.sh(i) == 2 && syntaxTree.getChildCount(syntaxTree.getParentNode(i)) == 2 && syntaxTree.isChangedExpressionNode(syntaxTree.getParentNode(i))) {
                    setOfInt.put(syntaxTree.getAttrReferenceNode(i));
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.U2(th, -158161632283604256L, this, syntaxTree, new Integer(i), setOfInt);
                }
                throw th;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:119:? A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:89:0x01e6  */
        /* JADX WARN: Type inference failed for: r14v0, types: [boolean] */
        /* JADX WARN: Type inference failed for: r14v1 */
        /* JADX WARN: Type inference failed for: r14v16 */
        /* JADX WARN: Type inference failed for: r14v3 */
        /* JADX WARN: Type inference failed for: r14v7 */
        /* JADX WARN: Type inference failed for: r14v8 */
        @abcd.ey(method = -24827115780099100L)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void J0(com.aide.codemodel.api.SyntaxTree r27, int r28, com.aide.codemodel.api.collections.ListOfInt r29, com.aide.codemodel.api.collections.SetOfInt r30, boolean r31, boolean r32, com.aide.codemodel.api.collections.SetOfInt r33) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 529
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: abcd.r6.a.J0(com.aide.codemodel.api.SyntaxTree, int, com.aide.codemodel.api.collections.ListOfInt, com.aide.codemodel.api.collections.SetOfInt, boolean, boolean, com.aide.codemodel.api.collections.SetOfInt):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @ey(method = -6464059263494777263L)
        private void J8(SetOf<ClassType> setOf, ClassType classType) {
            try {
                if (DW) {
                    iy.EQ(-575042923812000861L, this, setOf, classType);
                }
                SetOf<? extends E> setOf2 = 0;
                setOf.DEFAULT_ITERATOR.init();
                while (setOf.DEFAULT_ITERATOR.hasMoreElements()) {
                    if (((ClassType) setOf.DEFAULT_ITERATOR.nextKey()).Ej(classType)) {
                        if (setOf2 == 0) {
                            setOf2 = new SetOf<>(this.j6);
                        }
                        setOf2.put(setOf.DEFAULT_ITERATOR.nextKey());
                    }
                }
                if (setOf2 != 0) {
                    setOf.we(setOf2);
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, -575042923812000861L, this, setOf, classType);
                }
                throw th;
            }
        }

        @ey(method = -1179735116510020161L)
        private void VH(SyntaxTree syntaxTree, int i, int i2, SetOfInt setOfInt) {
            try {
                if (DW) {
                    iy.J0(762905060805809877L, this, syntaxTree, new Integer(i), new Integer(i2), setOfInt);
                }
                int syntaxTag = syntaxTree.getSyntaxTag(i);
                if (syntaxTag == 85) {
                    setOfInt.put(i);
                    return;
                }
                if (syntaxTag != 122) {
                    if (syntaxTag != 138 && syntaxTag != 139) {
                        int childCount = syntaxTree.getChildCount(i);
                        for (int i3 = 0; i3 < childCount; i3++) {
                            VH(syntaxTree, syntaxTree.getChildNode(i, i3), i2, setOfInt);
                        }
                        return;
                    }
                    if (syntaxTree.getChildCount(i) == 2) {
                        int parentNode = i;
                        while (parentNode != i2) {
                            int syntaxTag2 = syntaxTree.getSyntaxTag(parentNode);
                            if (syntaxTag2 == 137 || syntaxTag2 == 145 || syntaxTag2 == 147 || syntaxTag2 == 149 || syntaxTag2 == 211) {
                                return;
                            } else {
                                parentNode = syntaxTree.getParentNode(parentNode);
                            }
                        }
                    } else {
                        int identifier = syntaxTree.getIdentifier(syntaxTree.getChildNode(i, 1));
                        int parentNode2 = i;
                        while (parentNode2 != i2) {
                            if (syntaxTree.getSyntaxTag(parentNode2) == 148 && syntaxTree.getIdentifier(syntaxTree.getChildNode(parentNode2, 0)) == identifier) {
                                return;
                            }
                            parentNode2 = syntaxTree.getParentNode(parentNode2);
                        }
                    }
                    setOfInt.put(i);
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.a8(th, 762905060805809877L, this, syntaxTree, new Integer(i), new Integer(i2), setOfInt);
                }
                throw th;
            }
        }

        @ey(method = -343791228666874768L)
        private void j6(SetOf<ClassType> setOf, ClassType classType) {
            try {
                if (DW) {
                    iy.EQ(3379587512549849568L, this, setOf, classType);
                }
                boolean z = false;
                setOf.DEFAULT_ITERATOR.init();
                while (true) {
                    if (!setOf.DEFAULT_ITERATOR.hasMoreElements()) {
                        break;
                    } else if (classType.Ej((Type) setOf.DEFAULT_ITERATOR.nextKey())) {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    return;
                }
                J8(setOf, classType);
                setOf.put(classType);
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, 3379587512549849568L, this, setOf, classType);
                }
                throw th;
            }
        }

        @ey(method = 2674677212529085413L)
        private void tp(SyntaxTree syntaxTree, int i, SetOf<ClassType> setOf) {
            try {
                if (DW) {
                    iy.we(-1182848950197208941L, this, syntaxTree, new Integer(i), setOf);
                }
                int i2 = 0;
                if (syntaxTree.getSyntaxTag(i) == 1) {
                    if (syntaxTree.sh(i) == 20) {
                        Member member = (Member) syntaxTree.getAttrReferenceEntity(i);
                        int iXG = member.XG();
                        for (int i3 = 0; i3 < iXG; i3++) {
                            try {
                                Type typeXX = member.XX(i3);
                                if (typeXX.isClassType()) {
                                    j6(setOf, (ClassType) typeXX);
                                }
                            } catch (e4 unused) {
                            }
                        }
                    }
                    if (syntaxTree.sh(i) == 22 || syntaxTree.sh(i) == 25 || syntaxTree.sh(i) == 24 || syntaxTree.sh(i) == 23) {
                        Member member2 = (Member) syntaxTree.getAttrReferenceEntity(i);
                        int iXG2 = member2.XG();
                        while (i2 < iXG2) {
                            try {
                                Type typeXX2 = member2.XX(i2);
                                if (typeXX2.isClassType()) {
                                    j6(setOf, (ClassType) typeXX2);
                                }
                            } catch (e4 unused2) {
                            }
                            i2++;
                        }
                        return;
                    }
                    return;
                }
                if (syntaxTree.getSyntaxTag(i) == 142) {
                    int childCount = syntaxTree.getChildCount(i);
                    while (i2 < childCount) {
                        tp(syntaxTree, syntaxTree.getChildNode(i, i2), setOf);
                        i2++;
                    }
                    if (syntaxTree.hasAttrType(syntaxTree.getChildNode(i, 1))) {
                        Type attrType = syntaxTree.getAttrType(syntaxTree.getChildNode(i, 1));
                        if (attrType.isClassType()) {
                            j6(setOf, (ClassType) attrType);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (syntaxTree.getSyntaxTag(i) != 150) {
                    if (syntaxTree.getSyntaxTag(i) == 122) {
                        return;
                    }
                    int childCount2 = syntaxTree.getChildCount(i);
                    while (i2 < childCount2) {
                        tp(syntaxTree, syntaxTree.getChildNode(i, i2), setOf);
                        i2++;
                    }
                    return;
                }
                SetOf<ClassType> setOf2 = new SetOf<>(this.j6);
                tp(syntaxTree, syntaxTree.getChildNode(i, 1), setOf2);
                int childCount3 = syntaxTree.getChildCount(i);
                for (int i4 = 2; i4 < childCount3; i4++) {
                    int childNode = syntaxTree.getChildNode(i, i4);
                    if (syntaxTree.getSyntaxTag(childNode) == 204) {
                        int childNode2 = syntaxTree.getChildNode(childNode, 3);
                        int childCount4 = syntaxTree.getChildCount(childNode2);
                        for (int i5 = 0; i5 < childCount4; i5 += 2) {
                            int childNode3 = syntaxTree.getChildNode(childNode2, i5);
                            if (syntaxTree.hasAttrType(childNode3)) {
                                Type attrType2 = syntaxTree.getAttrType(childNode3);
                                if (attrType2.isClassType()) {
                                    J8(setOf2, (ClassType) attrType2);
                                }
                            }
                        }
                    }
                }
                setOf.u7(setOf2);
                for (int i6 = 2; i6 < childCount3; i6++) {
                    tp(syntaxTree, syntaxTree.getChildNode(i, i6), setOf);
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.U2(th, -1182848950197208941L, this, syntaxTree, new Integer(i), setOf);
                }
                throw th;
            }
        }

        @ey(method = 796255118361559872L)
        private void v5(SyntaxTree syntaxTree, int i, SetOfInt setOfInt) {
            try {
                if (DW) {
                    iy.we(-5375369611188408252L, this, syntaxTree, new Integer(i), setOfInt);
                }
                int childCount = syntaxTree.getChildCount(i);
                for (int i2 = 0; i2 < childCount; i2++) {
                    v5(syntaxTree, syntaxTree.getChildNode(i, i2), setOfInt);
                }
                if (syntaxTree.getSyntaxTag(i) == 1) {
                    if (syntaxTree.sh(i) == 1 || syntaxTree.sh(i) == 32) {
                        setOfInt.put(syntaxTree.getAttrReferenceNode(i));
                    }
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.U2(th, -5375369611188408252L, this, syntaxTree, new Integer(i), setOfInt);
                }
                throw th;
            }
        }

        @ey(method = -1720491483606844748L)
        private void we(SyntaxTree syntaxTree, int i, int i2, SetOfInt setOfInt, ListOfInt listOfInt) {
            try {
                if (DW) {
                    iy.J8(3580065255011588824L, this, syntaxTree, new Integer(i), new Integer(i2), setOfInt, listOfInt);
                }
                int childCount = syntaxTree.getChildCount(i);
                for (int i3 = 0; i3 < childCount; i3++) {
                    we(syntaxTree, syntaxTree.getChildNode(i, i3), i2, setOfInt, listOfInt);
                }
                if (syntaxTree.getSyntaxTag(i) == 1 && syntaxTree.sh(i) == 2) {
                    int attrReferenceNode = syntaxTree.getAttrReferenceNode(i);
                    if (setOfInt.contains(attrReferenceNode)) {
                        return;
                    }
                    setOfInt.put(attrReferenceNode);
                    listOfInt.add(attrReferenceNode);
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.lg(th, 3580065255011588824L, this, syntaxTree, new Integer(i), new Integer(i2), setOfInt, listOfInt);
                }
                throw th;
            }
        }

        @ey(method = 482936818683517731L)
        public ListOfInt EQ(SyntaxTree syntaxTree, ListOfInt listOfInt) {
            try {
                if (DW) {
                    iy.EQ(7763109996025824657L, this, syntaxTree, listOfInt);
                }
                SetOfInt setOfInt = new SetOfInt();
                ListOfInt listOfInt2 = new ListOfInt();
                for (int i = 0; i < listOfInt.size(); i++) {
                    we(syntaxTree, listOfInt.get(i), syntaxTree.getParentNode(listOfInt.get(0)), setOfInt, listOfInt2);
                }
                return listOfInt2;
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, 7763109996025824657L, this, syntaxTree, listOfInt);
                }
                throw th;
            }
        }

        @ey(method = -41956786516355436L)
        public SetOfInt Hw(SyntaxTree syntaxTree, ListOfInt listOfInt) {
            try {
                if (DW) {
                    iy.EQ(-527432443776606480L, this, syntaxTree, listOfInt);
                }
                SetOfInt setOfInt = new SetOfInt();
                for (int i = 0; i < listOfInt.size(); i++) {
                    v5(syntaxTree, listOfInt.get(i), setOfInt);
                }
                return setOfInt;
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, -527432443776606480L, this, syntaxTree, listOfInt);
                }
                throw th;
            }
        }

        @ey(method = -1830686177248696688L)
        public SetOfInt Zo(SyntaxTree syntaxTree, ListOfInt listOfInt) {
            try {
                if (DW) {
                    iy.EQ(2724200428051053756L, this, syntaxTree, listOfInt);
                }
                SetOfInt setOfInt = new SetOfInt();
                for (int i = 0; i < listOfInt.size(); i++) {
                    VH(syntaxTree, listOfInt.get(i), syntaxTree.getParentNode(listOfInt.get(0)), setOfInt);
                }
                return setOfInt;
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, 2724200428051053756L, this, syntaxTree, listOfInt);
                }
                throw th;
            }
        }

        @ey(method = -322110535837976279L)
        public SetOfInt gn(SyntaxTree syntaxTree, ListOfInt listOfInt) {
            try {
                if (DW) {
                    iy.EQ(-397568575174454741L, this, syntaxTree, listOfInt);
                }
                SetOfInt setOfInt = new SetOfInt();
                SetOfInt setOfInt2 = new SetOfInt();
                int parentNode = listOfInt.get(0);
                int i = parentNode;
                while (parentNode != syntaxTree.getRootNode()) {
                    setOfInt2.put(parentNode);
                    int syntaxTag = syntaxTree.getSyntaxTag(parentNode);
                    if (syntaxTag == 123 || syntaxTag == 124) {
                        i = parentNode;
                    }
                    parentNode = syntaxTree.getParentNode(parentNode);
                }
                J0(syntaxTree, i, listOfInt, setOfInt2, false, true, setOfInt);
                SetOfInt setOfInt3 = new SetOfInt();
                SetOfInt setOfIntDW = DW(syntaxTree, listOfInt);
                SetOfInt setOfIntHw = Hw(syntaxTree, listOfInt);
                setOfInt.default_Iterator.init();
                while (setOfInt.default_Iterator.hasMoreElements()) {
                    int iNextKey = setOfInt.default_Iterator.nextKey();
                    if (setOfIntHw.contains(iNextKey) || setOfIntDW.contains(iNextKey)) {
                        setOfInt3.put(iNextKey);
                    }
                }
                return setOfInt3;
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, -397568575174454741L, this, syntaxTree, listOfInt);
                }
                throw th;
            }
        }

        @ey(method = -2296409724389639859L)
        public SetOf<ClassType> u7(SyntaxTree syntaxTree, ListOfInt listOfInt) {
            try {
                if (DW) {
                    iy.EQ(884137766980255515L, this, syntaxTree, listOfInt);
                }
                SetOf<ClassType> setOf = new SetOf<>(this.j6);
                for (int i = 0; i < listOfInt.size(); i++) {
                    tp(syntaxTree, listOfInt.get(i), setOf);
                }
                return setOf;
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, 884137766980255515L, this, syntaxTree, listOfInt);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(r6.class);
    }

    @ey(method = 58204116028010823L)
    public r6(Model model, JavaLanguage javaLanguage) {
        try {
            if (VH) {
                iy.EQ(-2251316687280107979L, null, model, javaLanguage);
            }
            this.j6 = model;
            this.DW = model.syntaxTreeSpace;
            this.FH = model.entitySpace;
            this.Zo = javaLanguage;
            this.Hw = model.identifierSpace;
            this.v5 = new a(this.FH);
        } catch (Throwable th) {
            if (gn) {
                iy.Mr(th, -2251316687280107979L, null, model, javaLanguage);
            }
            throw th;
        }
    }

    @ey(method = -343852949480759835L)
    private void Hw(SyntaxTree syntaxTree, int i, int i2, int i3) {
        try {
            if (VH) {
                iy.J0(1993195017107261895L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3));
            }
            for (int childCount = syntaxTree.getChildCount(i) - 1; childCount >= 0; childCount--) {
                Hw(syntaxTree, syntaxTree.getChildNode(i, childCount), i2, i3);
            }
            if (syntaxTree.getSyntaxTag(i) == 1 && syntaxTree.sh(i) == 2 && i2 == syntaxTree.getAttrReferenceNode(i) && !syntaxTree.isEnclosingNode(i3, i)) {
                boolean zGn = gn(syntaxTree, i3, i);
                if (zGn) {
                    this.j6.refactoringCallback.nw(syntaxTree.getFile(), syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i), syntaxTree.getEndLine(i), syntaxTree.getEndColumn(i), ")");
                } else {
                    this.j6.refactoringCallback.nw(syntaxTree.getFile(), syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i), syntaxTree.getEndLine(i), syntaxTree.getEndColumn(i), "");
                }
                this.j6.refactoringCallback.vy(syntaxTree.getFile(), syntaxTree.getStartLine(i3), syntaxTree.getStartColumn(i3), syntaxTree.getEndLine(i3), syntaxTree.getEndColumn(i3), syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i));
                if (zGn) {
                    this.j6.refactoringCallback.nw(syntaxTree.getFile(), syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i), syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i), "(");
                }
            }
        } catch (Throwable th) {
            if (gn) {
                iy.a8(th, 1993195017107261895L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 1043842444899058204L)
    private boolean VH(SyntaxTree syntaxTree, int i) {
        try {
            if (VH) {
                iy.EQ(-7968397318994112L, this, syntaxTree, new Integer(i));
            }
            int childCount = syntaxTree.getChildCount(i);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (syntaxTree.getSyntaxTag(syntaxTree.getChildNode(i, i2)) == 86) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (gn) {
                iy.Mr(th, -7968397318994112L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -3956053703509947023L)
    private boolean Zo(SyntaxTree syntaxTree, int i, int i2) {
        try {
            if (VH) {
                iy.we(-940549630004067985L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            for (int childCount = syntaxTree.getChildCount(i) - 1; childCount >= 0; childCount--) {
                if (Zo(syntaxTree, syntaxTree.getChildNode(i, childCount), i2)) {
                    return true;
                }
            }
            if (syntaxTree.getSyntaxTag(i) == 1 && syntaxTree.sh(i) == 2 && i2 == syntaxTree.getAttrReferenceNode(i) && syntaxTree.getChildCount(syntaxTree.getParentNode(i)) == 2) {
                return syntaxTree.isChangedExpressionNode(syntaxTree.getParentNode(i));
            }
            return false;
        } catch (Throwable th) {
            if (gn) {
                iy.U2(th, -940549630004067985L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 5734370051010838800L)
    private boolean gn(SyntaxTree syntaxTree, int i, int i2) {
        try {
            if (VH) {
                iy.we(-2740217214220342728L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            int syntaxTag = syntaxTree.getSyntaxTag(i);
            return syntaxTag == 169 || syntaxTag == 172;
        } catch (Throwable th) {
            if (gn) {
                iy.U2(th, -2740217214220342728L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 366312287112476525L)
    public void DW(FileEntry fileEntry, int i, int i2, int i3, int i4) {
        String str;
        String str2;
        String str3;
        SetOfInt setOfInt;
        try {
            if (VH) {
                iy.J8(2428784832148446135L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            this.j6.refactoringCallback.g3();
            SyntaxTree syntaxTree = this.DW.getSyntaxTree(fileEntry, this.Zo);
            int blockNodeAt = syntaxTree.getBlockNodeAt(i, i2, i3, i4);
            int methodNodeAt = syntaxTree.getMethodNodeAt(i, i2, i3, i4);
            ListOfInt listOfIntQq = syntaxTree.Qq(i, i2, i3, i4);
            if (blockNodeAt != -1 && methodNodeAt != -1 && listOfIntQq != null) {
                if (this.v5.Zo(syntaxTree, listOfIntQq).size() != 0) {
                    this.j6.refactoringCallback.SI("These statements contain return, break or continue statements.");
                    this.DW.releaseSyntaxTree(syntaxTree);
                    return;
                }
                int startLine = syntaxTree.getStartLine(listOfIntQq.get(0));
                int startColumn = syntaxTree.getStartColumn(listOfIntQq.get(0));
                int endLine = syntaxTree.getEndLine(listOfIntQq.get(listOfIntQq.size() - 1));
                int endColumn = syntaxTree.getEndColumn(listOfIntQq.get(listOfIntQq.size() - 1));
                int endLine2 = syntaxTree.getEndLine(methodNodeAt);
                int endColumn2 = syntaxTree.getEndColumn(methodNodeAt);
                ((JavaCodeAnalyzer) syntaxTree.getLanguage().getCodeAnalyzer()).Ws(syntaxTree, methodNodeAt);
                SetOfInt setOfIntHw = this.v5.Hw(syntaxTree, listOfIntQq);
                ListOfInt listOfIntEQ = this.v5.EQ(syntaxTree, listOfIntQq);
                SetOfInt setOfIntGn = this.v5.gn(syntaxTree, listOfIntQq);
                String str4 = "";
                if (setOfIntGn.size() > 1) {
                    setOfIntGn.default_Iterator.init();
                    String str5 = "";
                    while (setOfIntGn.default_Iterator.hasMoreElements()) {
                        if (str5.length() > 0) {
                            str5 = str5 + " and ";
                        }
                        str5 = str5 + syntaxTree.getIdentifierString(setOfIntGn.default_Iterator.nextKey());
                    }
                    this.j6.refactoringCallback.SI("The variables " + str5 + " might be modified in those statements.");
                    this.DW.releaseSyntaxTree(syntaxTree);
                    return;
                }
                int iV5 = setOfIntGn.size() == 1 ? setOfIntGn.v5() : -1;
                String str6 = VH(syntaxTree, syntaxTree.getChildNode(methodNodeAt, 0)) ? "private static " : "private ";
                String str7 = str6 + "void ";
                String str8 = "method(";
                String str9 = "method(";
                if (iV5 != -1) {
                    String strAq = ((JavaSyntax) syntaxTree.getLanguage().getSyntax()).aq(syntaxTree, iV5);
                    str = str9;
                    String str10 = str6 + strAq + " ";
                    String str11 = "return " + syntaxTree.getIdentifierString(iV5) + ";\n";
                    String str12 = syntaxTree.getIdentifierString(iV5) + " = ";
                    if (setOfIntHw.contains(iV5)) {
                        str12 = strAq + " " + str12;
                    }
                    str3 = str10;
                    str4 = str12;
                    str2 = str11;
                } else {
                    str = str9;
                    str2 = "";
                    str3 = str7;
                }
                int i5 = iV5;
                String str13 = str;
                int i6 = 0;
                boolean z = true;
                while (i6 < listOfIntEQ.size()) {
                    int i7 = listOfIntEQ.get(i6);
                    if (setOfIntHw.contains(i7)) {
                        setOfInt = setOfIntHw;
                    } else {
                        if (z) {
                            setOfInt = setOfIntHw;
                        } else {
                            setOfInt = setOfIntHw;
                            str8 = str8 + ", ";
                            str13 = str13 + ", ";
                        }
                        String str14 = str8 + ((JavaSyntax) syntaxTree.getLanguage().getSyntax()).aq(syntaxTree, i7) + " " + syntaxTree.getIdentifierString(i7);
                        str13 = str13 + syntaxTree.getIdentifierString(i7);
                        str8 = str14;
                        z = false;
                    }
                    i6++;
                    setOfIntHw = setOfInt;
                }
                String str15 = str8 + ")";
                String str16 = str13 + ");";
                SetOf<ClassType> setOfU7 = this.v5.u7(syntaxTree, listOfIntQq);
                if (setOfU7.J0() > 0) {
                    str15 = str15 + " throws ";
                    setOfU7.DEFAULT_ITERATOR.init();
                    while (setOfU7.DEFAULT_ITERATOR.hasMoreElements()) {
                        if (!str15.endsWith(" ")) {
                            str15 = str15 + ", ";
                        }
                        str15 = str15 + syntaxTree.getLanguage().getTools().cb(syntaxTree, endLine2, endColumn2, (Type) setOfU7.DEFAULT_ITERATOR.nextKey());
                    }
                }
                this.j6.refactoringCallback.nw(fileEntry, endLine2, endColumn2, endLine2, endColumn2, "\n{\n\n" + str2 + "}");
                this.j6.refactoringCallback.nw(fileEntry, endLine2, endColumn2, endLine2, endColumn2, str3);
                this.j6.refactoringCallback.nw(fileEntry, endLine2, endColumn2 + str3.length(), endLine2, endColumn2 + str3.length(), str15);
                this.j6.refactoringCallback.sh(fileEntry, endLine2, endColumn2 + str3.length(), endLine2, str3.length() + endColumn2 + 6);
                this.j6.refactoringCallback.nw(fileEntry, endLine2, endColumn2, endLine2, endColumn2, "\n\n");
                int i8 = endLine - startLine;
                this.j6.refactoringCallback.U2(fileEntry, startLine, startColumn, endLine, endColumn, (endLine2 + 4) - i8, 1);
                this.j6.refactoringCallback.nw(fileEntry, startLine, startColumn, startLine, startColumn, str4);
                this.j6.refactoringCallback.nw(fileEntry, startLine, startColumn + str4.length(), startLine, startColumn + str4.length(), str16);
                this.j6.refactoringCallback.sh(fileEntry, startLine, startColumn + str4.length(), startLine, startColumn + str4.length() + 6);
                this.j6.refactoringCallback.Sf(fileEntry, (endLine2 - i8) + 2, endLine2 + 3 + 2 + (i5 == -1 ? 0 : 1));
                this.DW.releaseSyntaxTree(syntaxTree);
                this.j6.refactoringCallback.J8();
                return;
            }
            this.j6.refactoringCallback.SI("Select some statements to be extracted.");
            this.DW.releaseSyntaxTree(syntaxTree);
        } catch (Throwable th) {
            if (gn) {
                iy.lg(th, 2428784832148446135L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = 237081017174474532L)
    public void FH(FileEntry fileEntry, int i, int i2) {
        try {
            if (VH) {
                iy.we(-586534641315262400L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            this.j6.refactoringCallback.g3();
            SyntaxTree syntaxTree = this.DW.getSyntaxTree(fileEntry, this.Zo);
            int iJO = syntaxTree.jO(i, i2);
            if (iJO != -1) {
                ((JavaCodeAnalyzer) syntaxTree.getLanguage().getCodeAnalyzer()).Hw(syntaxTree, syntaxTree.getIdentifier(iJO));
                int iSh = syntaxTree.sh(iJO);
                if (iSh == 1 || iSh == 2) {
                    int attrReferenceNode = syntaxTree.getAttrReferenceNode(iJO);
                    if (syntaxTree.sh(attrReferenceNode) == 1 && syntaxTree.getChildCount(syntaxTree.getParentNode(attrReferenceNode)) == 4) {
                        if (Zo(syntaxTree, syntaxTree.getRootNode(), attrReferenceNode)) {
                            this.j6.refactoringCallback.QX("This variable is modified and can not be inlined.");
                            return;
                        }
                        Hw(syntaxTree, syntaxTree.getRootNode(), attrReferenceNode, syntaxTree.getChildNode(syntaxTree.getParentNode(attrReferenceNode), 3));
                        this.DW.releaseSyntaxTree(syntaxTree);
                        int parentNode = syntaxTree.getParentNode(syntaxTree.getParentNode(attrReferenceNode));
                        this.j6.refactoringCallback.nw(syntaxTree.getFile(), syntaxTree.getEndLine(syntaxTree.getLeftSisterNode(parentNode)), syntaxTree.getEndColumn(syntaxTree.getLeftSisterNode(parentNode)), syntaxTree.getEndLine(parentNode), syntaxTree.getEndColumn(parentNode), "");
                        this.j6.refactoringCallback.x9();
                        return;
                    }
                }
            }
            this.j6.refactoringCallback.QX("Select an initialized variable.");
            this.DW.releaseSyntaxTree(syntaxTree);
        } catch (Throwable th) {
            if (gn) {
                iy.U2(th, -586534641315262400L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 3284982457378090599L)
    public void j6(FileEntry fileEntry, int i, int i2, int i3, int i4) throws Throwable {
        try {
            if (VH) {
                iy.J8(-2303609839164342231L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            this.j6.refactoringCallback.g3();
            try {
                SyntaxTree syntaxTree = this.DW.getSyntaxTree(fileEntry, this.Zo);
                int blockNodeAt = syntaxTree.getBlockNodeAt(i, i2, i3, i4);
                int methodNodeAt = syntaxTree.getMethodNodeAt(i, i2, i3, i4);
                ListOfInt listOfIntQq = syntaxTree.Qq(i, i2, i3, i4);
                if (blockNodeAt == -1 || methodNodeAt == -1 || listOfIntQq == null) {
                    this.j6.refactoringCallback.tp("Select some statements which throw an execption.");
                    this.DW.releaseSyntaxTree(syntaxTree);
                    return;
                }
                if (syntaxTree.getSyntaxTag(methodNodeAt) != 124 && syntaxTree.getSyntaxTag(methodNodeAt) != 123) {
                    this.j6.refactoringCallback.tp("Select some statements inside a method which throw an execption.");
                    this.DW.releaseSyntaxTree(syntaxTree);
                    return;
                }
                int endLine = syntaxTree.getEndLine(listOfIntQq.get(listOfIntQq.size() - 1));
                int endColumn = syntaxTree.getEndColumn(listOfIntQq.get(listOfIntQq.size() - 1));
                syntaxTree.getLanguage().getCodeAnalyzer().FH(syntaxTree);
                SetOf<ClassType> setOfU7 = this.v5.u7(syntaxTree, listOfIntQq);
                if (setOfU7.J0() == 0) {
                    this.j6.refactoringCallback.tp("Select some statements which throw an execption.");
                    this.DW.releaseSyntaxTree(syntaxTree);
                    return;
                }
                int childNode = syntaxTree.getChildNode(methodNodeAt, syntaxTree.getChildCount(methodNodeAt) - 2);
                int childCount = syntaxTree.getChildCount(childNode);
                for (int i5 = 1; i5 < childCount; i5 += 2) {
                    int childNode2 = syntaxTree.getChildNode(childNode, i5);
                    if (syntaxTree.hasAttrType(childNode2)) {
                        setOfU7.EQ(syntaxTree.getAttrType(childNode2));
                    }
                }
                String str = "";
                if (setOfU7.J0() > 0) {
                    setOfU7.DEFAULT_ITERATOR.init();
                    while (setOfU7.DEFAULT_ITERATOR.hasMoreElements()) {
                        if (str.length() > 0) {
                            str = str + ", ";
                        }
                        str = str + syntaxTree.getLanguage().getTools().cb(syntaxTree, endLine, endColumn, (Type) setOfU7.DEFAULT_ITERATOR.nextKey());
                    }
                }
                this.j6.refactoringCallback.nw(fileEntry, syntaxTree.getEndLine(childNode), syntaxTree.getEndColumn(childNode), syntaxTree.getEndLine(childNode), syntaxTree.getEndColumn(childNode), syntaxTree.getChildCount(childNode) == 0 ? " throws " + str : ", " + str);
                String strVJ = syntaxTree.getLanguage().getTools().vJ(syntaxTree, 1, 1, setOfU7);
                if (strVJ.length() > 0) {
                    int importEndLine = syntaxTree.getImportEndLine();
                    int iWB = syntaxTree.WB();
                    this.j6.refactoringCallback.nw(fileEntry, importEndLine, iWB, importEndLine, iWB, strVJ);
                }
                this.DW.releaseSyntaxTree(syntaxTree);
                this.j6.refactoringCallback.aM();
            } catch (Throwable th) {
                th = th;
                if (gn) {
                    iy.lg(th, -2303609839164342231L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @ey(method = -4909747726756348315L)
    public void u7(FileEntry fileEntry, int i, int i2, int i3, int i4) {
        String str;
        try {
            if (VH) {
                iy.J8(-939655965704529213L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            this.j6.refactoringCallback.g3();
            SyntaxTree syntaxTree = this.DW.getSyntaxTree(fileEntry, this.Zo);
            int blockNodeAt = syntaxTree.getBlockNodeAt(i, i2, i3, i4);
            int methodNodeAt = syntaxTree.getMethodNodeAt(i, i2, i3, i4);
            ListOfInt listOfIntQq = syntaxTree.Qq(i, i2, i3, i4);
            if (blockNodeAt == -1 || methodNodeAt == -1 || listOfIntQq == null) {
                this.j6.refactoringCallback.tp("Select some statements which throw an execption.");
                this.DW.releaseSyntaxTree(syntaxTree);
                return;
            }
            int startLine = syntaxTree.getStartLine(listOfIntQq.get(0));
            int startColumn = syntaxTree.getStartColumn(listOfIntQq.get(0));
            int endLine = syntaxTree.getEndLine(listOfIntQq.get(listOfIntQq.size() - 1));
            int endColumn = syntaxTree.getEndColumn(listOfIntQq.get(listOfIntQq.size() - 1));
            syntaxTree.getLanguage().getCodeAnalyzer().FH(syntaxTree);
            SetOf<ClassType> setOfU7 = this.v5.u7(syntaxTree, listOfIntQq);
            if (setOfU7.J0() == 0) {
                this.j6.refactoringCallback.tp("Select some statements which throw an execption.");
                this.DW.releaseSyntaxTree(syntaxTree);
                return;
            }
            String str2 = "\n}";
            if (setOfU7.J0() > 0) {
                setOfU7.DEFAULT_ITERATOR.init();
                while (setOfU7.DEFAULT_ITERATOR.hasMoreElements()) {
                    if (this.j6.Ws().Zo) {
                        str = str2 + " ";
                    } else {
                        str = str2 + "\n";
                    }
                    str2 = ((str + "catch (") + syntaxTree.getLanguage().getTools().cb(syntaxTree, endLine, endColumn, (Type) setOfU7.DEFAULT_ITERATOR.nextKey())) + " e) {}";
                }
            }
            String str3 = str2;
            String str4 = this.j6.Ws().Zo ? "try {\n" : "try\n{\n";
            this.j6.refactoringCallback.nw(fileEntry, endLine, endColumn, endLine, endColumn, str3);
            this.j6.refactoringCallback.nw(fileEntry, startLine, startColumn, startLine, startColumn, str4);
            this.j6.refactoringCallback.Sf(fileEntry, startLine, endLine + 4 + setOfU7.J0());
            String strVJ = syntaxTree.getLanguage().getTools().vJ(syntaxTree, 1, 1, setOfU7);
            if (strVJ.length() > 0) {
                int importEndLine = syntaxTree.getImportEndLine();
                int iWB = syntaxTree.WB();
                this.j6.refactoringCallback.nw(fileEntry, importEndLine, iWB, importEndLine, iWB, strVJ);
            }
            this.DW.releaseSyntaxTree(syntaxTree);
            this.j6.refactoringCallback.aM();
        } catch (Throwable th) {
            if (gn) {
                iy.lg(th, -939655965704529213L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = 6351228923960592700L)
    public void v5(FileEntry fileEntry, int i, int i2, int i3, int i4) throws Throwable {
        int i5;
        try {
            if (VH) {
                iy.J8(-1033326628565268032L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            this.j6.refactoringCallback.g3();
            SyntaxTree syntaxTree = this.DW.getSyntaxTree(fileEntry, this.Zo);
            int readExpressionNodeAt = syntaxTree.getReadExpressionNodeAt(i, i2, i3, i4);
            int iX9 = syntaxTree.x9(i, i2, i3, i4);
            if (readExpressionNodeAt == -1) {
                this.DW.releaseSyntaxTree(syntaxTree);
                this.j6.refactoringCallback.QX("Select an expression to be extracted.");
                return;
            }
            if (iX9 == -1) {
                this.DW.releaseSyntaxTree(syntaxTree);
                this.j6.refactoringCallback.QX("Select an expression inside a block to be extracted.");
                return;
            }
            if (syntaxTree.getSyntaxTag(syntaxTree.getParentNode(readExpressionNodeAt)) == 146) {
                this.DW.releaseSyntaxTree(syntaxTree);
                this.j6.refactoringCallback.QX("Select an expression to be extracted.");
                return;
            }
            ((JavaCodeAnalyzer) syntaxTree.getLanguage().getCodeAnalyzer()).VH(syntaxTree, readExpressionNodeAt);
            if (!syntaxTree.hasAttrType(readExpressionNodeAt)) {
                this.DW.releaseSyntaxTree(syntaxTree);
                this.j6.refactoringCallback.QX("The type of this expression is unknown.");
                return;
            }
            int iXa = ((JavaSyntax) syntaxTree.getLanguage().getSyntax()).Xa(syntaxTree, readExpressionNodeAt);
            String string = iXa != -1 ? this.Hw.getString(iXa) : "v";
            ((JavaCodeAnalyzer) syntaxTree.getLanguage().getCodeAnalyzer()).VH(syntaxTree, readExpressionNodeAt);
            Type attrType = syntaxTree.getAttrType(readExpressionNodeAt);
            String strCb = syntaxTree.getLanguage().getTools().cb(syntaxTree, syntaxTree.getStartLine(iX9), syntaxTree.getStartColumn(iX9), attrType);
            this.j6.refactoringCallback.nw(fileEntry, syntaxTree.getEndLine(readExpressionNodeAt), syntaxTree.getEndColumn(readExpressionNodeAt), syntaxTree.getEndLine(readExpressionNodeAt), syntaxTree.getEndColumn(readExpressionNodeAt), ";\n");
            this.j6.refactoringCallback.nw(fileEntry, syntaxTree.getStartLine(readExpressionNodeAt), syntaxTree.getStartColumn(readExpressionNodeAt), syntaxTree.getStartLine(readExpressionNodeAt), syntaxTree.getStartColumn(readExpressionNodeAt), string);
            this.j6.refactoringCallback.sh(fileEntry, syntaxTree.getStartLine(readExpressionNodeAt), syntaxTree.getStartColumn(readExpressionNodeAt), syntaxTree.getStartLine(readExpressionNodeAt), string.length() + syntaxTree.getStartColumn(readExpressionNodeAt));
            try {
                this.j6.refactoringCallback.U2(fileEntry, syntaxTree.getStartLine(readExpressionNodeAt), string.length() + syntaxTree.getStartColumn(readExpressionNodeAt), syntaxTree.getEndLine(readExpressionNodeAt) + 1, 1, syntaxTree.getStartLine(iX9), syntaxTree.getStartColumn(iX9));
                this.j6.refactoringCallback.nw(fileEntry, syntaxTree.getStartLine(iX9), syntaxTree.getStartColumn(iX9), syntaxTree.getStartLine(iX9), syntaxTree.getStartColumn(iX9), strCb + " " + string + " = ");
                this.j6.refactoringCallback.sh(fileEntry, syntaxTree.getStartLine(iX9), syntaxTree.getStartColumn(iX9) + strCb.length() + 1, syntaxTree.getStartLine(iX9), syntaxTree.getStartColumn(iX9) + strCb.length() + string.length() + 1);
                this.j6.refactoringCallback.Sf(fileEntry, syntaxTree.getStartLine(iX9), syntaxTree.getEndLine(readExpressionNodeAt) + 1);
                SetOf<? extends Type> setOf = new SetOf<>(this.FH);
                setOf.put(attrType);
                i5 = i;
                try {
                    String strVJ = syntaxTree.getLanguage().getTools().vJ(syntaxTree, i5, i2, setOf);
                    if (strVJ.length() > 0) {
                        int importEndLine = syntaxTree.getImportEndLine();
                        int iWB = syntaxTree.WB();
                        this.j6.refactoringCallback.nw(fileEntry, importEndLine, iWB, importEndLine, iWB, strVJ);
                    }
                    this.DW.releaseSyntaxTree(syntaxTree);
                    this.j6.refactoringCallback.J0();
                } catch (Throwable th) {
                    th = th;
                    if (gn) {
                        iy.lg(th, -1033326628565268032L, this, fileEntry, new Integer(i5), new Integer(i2), new Integer(i3), new Integer(i4));
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                i5 = i;
            }
        } catch (Throwable th3) {
            th = th3;
            i5 = i;
        }
    }
}
