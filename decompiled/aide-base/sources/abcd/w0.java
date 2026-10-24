package abcd;

import com.aide.codemodel.AIDEModel;
import com.aide.codemodel.api.ClassType;
import com.aide.codemodel.api.Entity;
import com.aide.codemodel.api.EntitySpace;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.FileSpace;
import com.aide.codemodel.api.IdentifierSpace;
import com.aide.codemodel.api.Member;
import com.aide.codemodel.api.Namespace;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.SyntaxTreeSpace;
import com.aide.codemodel.api.collections.MapOf;
import com.aide.codemodel.api.collections.MapOfInt;
import com.aide.codemodel.api.collections.SetOf;
import com.aide.codemodel.api.collections.SetOfFileEntry;
import com.aide.codemodel.api.collections.SetOfInt;
import com.aide.uidesigner.ProxyTextView;
import com.probelytics.api.UserTouchAction;
import java.util.List;

@cy(clazz = -3695541432370378500L, container = -3695541432370378500L, user = true)
/* loaded from: classes.dex */
public class w0 {

    @fy
    private static /* synthetic */ boolean VH;

    @gy
    private static /* synthetic */ boolean gn;

    @dy(field = -2510360771174809959L)
    private final IdentifierSpace DW;

    @dy(field = -423997826738306905L)
    private final FileSpace FH;

    @dy(field = 3029344579954734835L)
    private final EntitySpace Hw;

    @dy(field = 2617594175814332363L)
    private final k0 Zo;

    @dy(field = 2782695759264673920L)
    private final AIDEModel j6;

    @dy(field = -3025784117481380332L)
    private final SyntaxTreeSpace v5;

    static {
        iy.Zo(w0.class);
    }

    @ey(method = 683924277516877L)
    public w0(AIDEModel aIDEModel) {
        try {
            if (VH) {
                iy.tp(1419535331455730337L, null, aIDEModel);
            }
            this.j6 = aIDEModel;
            this.DW = aIDEModel.identifierSpace;
            this.FH = aIDEModel.fileSpace;
            this.Hw = aIDEModel.entitySpace;
            this.v5 = aIDEModel.syntaxTreeSpace;
            this.Zo = aIDEModel.vy;
        } catch (Throwable th) {
            if (gn) {
                iy.j3(th, 1419535331455730337L, null, aIDEModel);
            }
            throw th;
        }
    }

    @ey(method = 836401061536731327L)
    private void DW(SyntaxTree syntaxTree, int i, FileEntry fileEntry, SetOfInt setOfInt, SetOf<Member> setOf, SetOf<Member> setOf2, SetOf<ClassType> setOf3, boolean z) throws Throwable {
        boolean z2;
        int i2 = i;
        boolean z3 = z;
        try {
            if (VH) {
                iy.QX(-198168995387606751L, this, new Object[]{syntaxTree, new Integer(i2), fileEntry, setOfInt, setOf, setOf2, setOf3, new Boolean(z3)});
            }
            int childCount = syntaxTree.getChildCount(i);
            int i3 = 0;
            while (i3 < childCount) {
                int childNode = syntaxTree.getChildNode(i2, i3);
                int i4 = i3;
                z2 = z3;
                try {
                    DW(syntaxTree, childNode, fileEntry, setOfInt, setOf, setOf2, setOf3, z);
                    i3 = i4 + 1;
                    z3 = z2;
                    i2 = i;
                } catch (Throwable th) {
                    th = th;
                    if (gn) {
                        iy.rN(th, -198168995387606751L, this, new Object[]{syntaxTree, new Integer(i), fileEntry, setOfInt, setOf, setOf2, setOf3, new Boolean(z2)});
                    }
                    throw th;
                }
            }
            boolean z4 = z3;
            if (syntaxTree.isIdentifierNode(i)) {
                int iSh = syntaxTree.sh(i);
                if (iSh == 16) {
                    if (!z4 || syntaxTree.getStartColumn(i) == syntaxTree.getEndColumn(i) || syntaxTree.getAttrReferenceEntity(i).ro() || !setOf2.contains(syntaxTree.getAttrReferenceEntity(i))) {
                        return;
                    }
                    this.j6.usageSearcherCallback.j6(fileEntry, syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i), syntaxTree.getEndLine(i), syntaxTree.getEndColumn(i));
                    return;
                }
                if (iSh != 17) {
                    switch (iSh) {
                        case UserTouchAction.CLICK_KIND /* 7 */:
                        case 8:
                        case 9:
                        case 10:
                            break;
                        default:
                            switch (iSh) {
                                case ProxyTextView.INPUTTYPE_date /* 20 */:
                                    if (!z4 || syntaxTree.getStartColumn(i) == syntaxTree.getEndColumn(i) || syntaxTree.getAttrReferenceEntity(i).ro() || !setOf.contains(syntaxTree.getAttrReferenceEntity(i))) {
                                        return;
                                    }
                                    this.j6.usageSearcherCallback.j6(fileEntry, syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i), syntaxTree.getEndLine(i), syntaxTree.getEndColumn(i));
                                    return;
                                case 21:
                                case 22:
                                case 23:
                                case 24:
                                case 25:
                                    if (z4 && syntaxTree.getStartColumn(i) != syntaxTree.getEndColumn(i) && setOf3.contains(((Member) syntaxTree.getAttrReferenceEntity(i)).getEnclosingClassType())) {
                                        this.j6.usageSearcherCallback.j6(fileEntry, syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i), syntaxTree.getEndLine(i), syntaxTree.getEndColumn(i));
                                        return;
                                    }
                                    return;
                                default:
                                    return;
                            }
                    }
                }
                if (syntaxTree.getStartColumn(i) == syntaxTree.getEndColumn(i) || !setOf3.contains(syntaxTree.getAttrReferenceEntity(i))) {
                    return;
                }
                this.j6.usageSearcherCallback.j6(fileEntry, syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i), syntaxTree.getEndLine(i), syntaxTree.getEndColumn(i));
            }
        } catch (Throwable th2) {
            th = th2;
            z2 = z3;
        }
    }

    @ey(method = -516916026791305500L)
    private void EQ(SyntaxTree syntaxTree, int i, FileEntry fileEntry, int i2, Entity entity) {
        int iSh;
        try {
            if (VH) {
                iy.J8(-2749238941827160296L, this, syntaxTree, new Integer(i), fileEntry, new Integer(i2), entity);
            }
            int childCount = syntaxTree.getChildCount(i);
            for (int i3 = 0; i3 < childCount; i3++) {
                EQ(syntaxTree, syntaxTree.getChildNode(i, i3), fileEntry, i2, entity);
            }
            if (!syntaxTree.isIdentifierNode(i) || (iSh = syntaxTree.sh(i)) == 0 || iSh == 1 || iSh == 2 || iSh == 4 || iSh == 5 || iSh == 19 || iSh == 20 || iSh == 32 || syntaxTree.getStartColumn(i) == syntaxTree.getEndColumn(i) || syntaxTree.getAttrReferenceEntity(i) != entity) {
                return;
            }
            this.j6.usageSearcherCallback.j6(fileEntry, syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i), syntaxTree.getEndLine(i), syntaxTree.getEndColumn(i));
        } catch (Throwable th) {
            if (gn) {
                iy.lg(th, -2749238941827160296L, this, syntaxTree, new Integer(i), fileEntry, new Integer(i2), entity);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    @abcd.ey(method = 103130152261705152L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void FH(com.aide.codemodel.api.SyntaxTree r11, int r12, com.aide.codemodel.api.FileEntry r13, int r14, com.aide.codemodel.api.Entity r15) {
        /*
            r10 = this;
            boolean r0 = abcd.w0.VH     // Catch: java.lang.Throwable -> L5d
            if (r0 == 0) goto L1a
            r1 = -1669440863651619280(0xe8d4f4612c861e30, double:-9.789865323930058E196)
            java.lang.Integer r5 = new java.lang.Integer     // Catch: java.lang.Throwable -> L5d
            r5.<init>(r12)     // Catch: java.lang.Throwable -> L5d
            java.lang.Integer r7 = new java.lang.Integer     // Catch: java.lang.Throwable -> L5d
            r7.<init>(r14)     // Catch: java.lang.Throwable -> L5d
            r3 = r10
            r4 = r11
            r6 = r13
            r8 = r15
            abcd.iy.J8(r1, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L5d
        L1a:
            int r0 = r11.getChildCount(r12)     // Catch: java.lang.Throwable -> L5d
            r1 = 0
        L1f:
            if (r1 >= r0) goto L30
            int r4 = r11.getChildNode(r12, r1)     // Catch: java.lang.Throwable -> L5d
            r2 = r10
            r3 = r11
            r5 = r13
            r6 = r14
            r7 = r15
            r2.FH(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L5d
            int r1 = r1 + 1
            goto L1f
        L30:
            boolean r0 = r11.isIdentifierNode(r12)     // Catch: java.lang.Throwable -> L5d
            if (r0 == 0) goto L5c
            int r0 = r11.sh(r12)     // Catch: java.lang.Throwable -> L5d
            switch(r0) {
                case 21: goto L3e;
                case 22: goto L3e;
                case 23: goto L3e;
                case 24: goto L3e;
                case 25: goto L3e;
                default: goto L3d;
            }     // Catch: java.lang.Throwable -> L5d
        L3d:
            goto L5c
        L3e:
            com.aide.codemodel.api.Entity r0 = r11.getAttrReferenceEntity(r12)     // Catch: java.lang.Throwable -> L5d
            if (r0 != r15) goto L5c
            com.aide.codemodel.AIDEModel r0 = r10.j6     // Catch: java.lang.Throwable -> L5d
            com.aide.codemodel.api.callback.UsageSearcherCallback r1 = r0.usageSearcherCallback     // Catch: java.lang.Throwable -> L5d
            int r3 = r11.getStartLine(r12)     // Catch: java.lang.Throwable -> L5d
            int r4 = r11.getStartColumn(r12)     // Catch: java.lang.Throwable -> L5d
            int r5 = r11.getEndLine(r12)     // Catch: java.lang.Throwable -> L5d
            int r6 = r11.getEndColumn(r12)     // Catch: java.lang.Throwable -> L5d
            r2 = r13
            r1.j6(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L5d
        L5c:
            return
        L5d:
            r0 = move-exception
            boolean r1 = abcd.w0.gn
            if (r1 == 0) goto L79
            r2 = -1669440863651619280(0xe8d4f4612c861e30, double:-9.789865323930058E196)
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r12)
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r14)
            r1 = r0
            r4 = r10
            r5 = r11
            r7 = r13
            r9 = r15
            abcd.iy.lg(r1, r2, r4, r5, r6, r7, r8, r9)
        L79:
            goto L7b
        L7a:
            throw r0
        L7b:
            goto L7a
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.w0.FH(com.aide.codemodel.api.SyntaxTree, int, com.aide.codemodel.api.FileEntry, int, com.aide.codemodel.api.Entity):void");
    }

    @ey(method = 5528714430849301359L)
    private void Hw(SyntaxTree syntaxTree, int i, FileEntry fileEntry, int i2, Member member, boolean z) throws Throwable {
        int i3;
        try {
            if (VH) {
                iy.QX(-1952410732998340775L, this, new Object[]{syntaxTree, new Integer(i), fileEntry, new Integer(i2), member, new Boolean(z)});
            }
            int childCount = syntaxTree.getChildCount(i);
            int i4 = 0;
            while (i4 < childCount) {
                int i5 = i4;
                i3 = 6;
                try {
                    Hw(syntaxTree, syntaxTree.getChildNode(i, i4), fileEntry, i2, member, z);
                    i4 = i5 + 1;
                } catch (Throwable th) {
                    th = th;
                    if (gn) {
                        Object[] objArr = new Object[i3];
                        objArr[0] = syntaxTree;
                        objArr[1] = new Integer(i);
                        objArr[2] = fileEntry;
                        objArr[3] = new Integer(i2);
                        objArr[4] = member;
                        objArr[5] = new Boolean(z);
                        iy.rN(th, -1952410732998340775L, this, objArr);
                    }
                    throw th;
                }
            }
            if (syntaxTree.isIdentifierNode(i)) {
                int iSh = syntaxTree.sh(i);
                if (iSh == 15) {
                    if (syntaxTree.getStartColumn(i) != syntaxTree.getEndColumn(i) && member == syntaxTree.getAttrReferenceEntity(i)) {
                        this.j6.usageSearcherCallback.j6(fileEntry, syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i), syntaxTree.getEndLine(i), syntaxTree.getEndColumn(i));
                        return;
                    } else {
                        if (syntaxTree.getStartColumn(i) != syntaxTree.getEndColumn(i) && z && ((Member) syntaxTree.getAttrReferenceEntity(i)).OW().contains(member)) {
                            this.j6.usageSearcherCallback.j6(fileEntry, syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i), syntaxTree.getEndLine(i), syntaxTree.getEndColumn(i));
                            return;
                        }
                        return;
                    }
                }
                if (iSh != 16) {
                    return;
                }
                if (syntaxTree.getStartColumn(i) != syntaxTree.getEndColumn(i) && member == syntaxTree.getAttrReferenceEntity(i)) {
                    this.j6.usageSearcherCallback.j6(fileEntry, syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i), syntaxTree.getEndLine(i), syntaxTree.getEndColumn(i));
                } else if (z && syntaxTree.getStartColumn(i) != syntaxTree.getEndColumn(i) && member.OW().contains(syntaxTree.getAttrReferenceEntity(i))) {
                    this.j6.usageSearcherCallback.j6(fileEntry, syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i), syntaxTree.getEndLine(i), syntaxTree.getEndColumn(i));
                }
            }
        } catch (Throwable th2) {
            th = th2;
            i3 = 6;
        }
    }

    @ey(method = 1670303111449810152L)
    private void Zo(SyntaxTree syntaxTree, int i, FileEntry fileEntry, int i2, Member member, boolean z) throws Throwable {
        int i3;
        try {
            if (VH) {
                iy.QX(508620998149209264L, this, new Object[]{syntaxTree, new Integer(i), fileEntry, new Integer(i2), member, new Boolean(z)});
            }
            int childCount = syntaxTree.getChildCount(i);
            int i4 = 0;
            while (i4 < childCount) {
                int i5 = i4;
                i3 = 6;
                try {
                    Zo(syntaxTree, syntaxTree.getChildNode(i, i4), fileEntry, i2, member, z);
                    i4 = i5 + 1;
                } catch (Throwable th) {
                    th = th;
                    if (gn) {
                        Object[] objArr = new Object[i3];
                        objArr[0] = syntaxTree;
                        objArr[1] = new Integer(i);
                        objArr[2] = fileEntry;
                        objArr[3] = new Integer(i2);
                        objArr[4] = member;
                        objArr[5] = new Boolean(z);
                        iy.rN(th, 508620998149209264L, this, objArr);
                    }
                    throw th;
                }
            }
            if (syntaxTree.isIdentifierNode(i)) {
                int iSh = syntaxTree.sh(i);
                if (iSh == 19) {
                    if (syntaxTree.getStartColumn(i) != syntaxTree.getEndColumn(i) && member == syntaxTree.getAttrReferenceEntity(i)) {
                        this.j6.usageSearcherCallback.j6(fileEntry, syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i), syntaxTree.getEndLine(i), syntaxTree.getEndColumn(i));
                        return;
                    } else {
                        if (z && syntaxTree.getStartColumn(i) != syntaxTree.getEndColumn(i) && ((Member) syntaxTree.getAttrReferenceEntity(i)).OW().contains(member)) {
                            this.j6.usageSearcherCallback.j6(fileEntry, syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i), syntaxTree.getEndLine(i), syntaxTree.getEndColumn(i));
                            return;
                        }
                        return;
                    }
                }
                if (iSh != 20) {
                    return;
                }
                if (syntaxTree.getStartColumn(i) != syntaxTree.getEndColumn(i) && member == syntaxTree.getAttrReferenceEntity(i)) {
                    this.j6.usageSearcherCallback.j6(fileEntry, syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i), syntaxTree.getEndLine(i), syntaxTree.getEndColumn(i));
                } else if (z && syntaxTree.getStartColumn(i) != syntaxTree.getEndColumn(i) && member.OW().contains(syntaxTree.getAttrReferenceEntity(i))) {
                    this.j6.usageSearcherCallback.j6(fileEntry, syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i), syntaxTree.getEndLine(i), syntaxTree.getEndColumn(i));
                }
            }
        } catch (Throwable th2) {
            th = th2;
            i3 = 6;
        }
    }

    @ey(method = 3527235940601461800L)
    private void j6(Member member) {
        try {
            if (VH) {
                iy.tp(8191243702993794432L, this, member);
            }
            String str = "@+id/" + member.getNameString();
            SetOfFileEntry setOfFileEntryKD = this.j6.fileSpace.KD();
            setOfFileEntryKD.j6.init();
            while (setOfFileEntryKD.j6.hasMoreElements()) {
                FileEntry fileEntryNextKey = setOfFileEntryKD.j6.nextKey();
                if (fileEntryNextKey.getExtensionString().toLowerCase().equals(".xml")) {
                    List<String> listA8 = fileEntryNextKey.a8();
                    for (int i = 1; i < listA8.size(); i++) {
                        int iIndexOf = listA8.get(i).indexOf(str);
                        if (iIndexOf >= 0) {
                            this.j6.usageSearcherCallback.j6(fileEntryNextKey, i, iIndexOf + 1, i, iIndexOf + str.length() + 1);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            if (gn) {
                iy.j3(th, 8191243702993794432L, this, member);
            }
            throw th;
        }
    }

    @ey(method = -3034499359462463916L)
    private void tp(SyntaxTree syntaxTree, int i, int i2, Entity entity, boolean z) throws Throwable {
        try {
            if (VH) {
                iy.J8(1162617686601753984L, this, syntaxTree, new Integer(i), new Integer(i2), entity, new Boolean(z));
            }
            FileEntry file = syntaxTree.getFile();
            switch (i2) {
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                    this.j6.usageSearcherCallback.FH("package " + entity.getFullyQualifiedNameString());
                    for (SyntaxTree syntaxTree2 : this.v5.VH(syntaxTree.getFile())) {
                        syntaxTree2.getLanguage().getCodeAnalyzer().Hw(syntaxTree2, i);
                        EQ(syntaxTree2, syntaxTree2.getRootNode(), file, i, (Namespace) entity);
                    }
                    if (entity.ro()) {
                        return;
                    }
                    this.Zo.we(i);
                    while (true) {
                        FileEntry fileEntryXL = this.Zo.XL();
                        if (fileEntryXL == null) {
                            return;
                        }
                        if (fileEntryXL != file) {
                            if (this.j6.stopCallback.FN()) {
                                return;
                            }
                            for (SyntaxTree syntaxTree3 : this.v5.VH(fileEntryXL)) {
                                syntaxTree3.getLanguage().getCodeAnalyzer().Hw(syntaxTree3, i);
                                EQ(syntaxTree3, syntaxTree3.getRootNode(), fileEntryXL, i, (Namespace) entity);
                                this.v5.releaseSyntaxTree(syntaxTree3);
                            }
                        }
                    }
                case UserTouchAction.CLICK_KIND /* 7 */:
                case 8:
                case 9:
                case 10:
                case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                    this.j6.usageSearcherCallback.FH("class " + entity.getFullyQualifiedNameString());
                    SetOfInt setOfInt = new SetOfInt();
                    SetOf<Member> setOf = new SetOf<>(this.Hw);
                    SetOf<Member> setOf2 = new SetOf<>(this.Hw);
                    SetOf<ClassType> setOf3 = new SetOf<>(this.Hw);
                    ClassType classType = (ClassType) entity;
                    setOf3.put(classType);
                    if (classType.Yi()) {
                        setOf3.u7(classType.getAllPartialClasstypes());
                    }
                    setOfInt.put(i);
                    if (z) {
                        setOf3.DEFAULT_ITERATOR.init();
                        while (setOf3.DEFAULT_ITERATOR.hasMoreElements()) {
                            ClassType classType2 = (ClassType) setOf3.DEFAULT_ITERATOR.nextKey();
                            MapOfInt<Member> mapOfIntSM = classType2.sM();
                            mapOfIntSM.DEFAULT_ITERATOR.DW();
                            while (mapOfIntSM.DEFAULT_ITERATOR.hasMoreElements()) {
                                if (!((Member) mapOfIntSM.DEFAULT_ITERATOR.nextValue()).ro()) {
                                    setOfInt.put(mapOfIntSM.DEFAULT_ITERATOR.Hw());
                                    setOf.put(mapOfIntSM.DEFAULT_ITERATOR.nextValue());
                                }
                            }
                            MapOfInt<Member> mapOfIntQO = classType2.QO();
                            mapOfIntQO.DEFAULT_ITERATOR.DW();
                            while (mapOfIntQO.DEFAULT_ITERATOR.hasMoreElements()) {
                                if (!((Member) mapOfIntQO.DEFAULT_ITERATOR.nextValue()).ro()) {
                                    setOfInt.put(mapOfIntQO.DEFAULT_ITERATOR.Hw());
                                    setOf2.put(mapOfIntQO.DEFAULT_ITERATOR.nextValue());
                                }
                            }
                        }
                    }
                    for (SyntaxTree syntaxTree4 : this.v5.VH(syntaxTree.getFile())) {
                        syntaxTree4.getLanguage().getCodeAnalyzer().analyzeEveryIdentifiers(syntaxTree4, setOfInt);
                        SetOf<ClassType> setOf4 = setOf3;
                        DW(syntaxTree4, syntaxTree4.getRootNode(), file, setOfInt, setOf, setOf2, setOf4, z);
                        setOf3 = setOf4;
                        setOf2 = setOf2;
                        setOf = setOf;
                    }
                    SetOf<ClassType> setOf5 = setOf3;
                    SetOf<Member> setOf6 = setOf2;
                    SetOf<Member> setOf7 = setOf;
                    if (entity.ro()) {
                        return;
                    }
                    this.Zo.J0(setOfInt);
                    while (true) {
                        FileEntry fileEntryXL2 = this.Zo.XL();
                        if (fileEntryXL2 == null) {
                            return;
                        }
                        if (fileEntryXL2 != file) {
                            if (this.j6.stopCallback.FN()) {
                                return;
                            }
                            for (SyntaxTree syntaxTree5 : this.v5.VH(fileEntryXL2)) {
                                syntaxTree5.getLanguage().getCodeAnalyzer().analyzeEveryIdentifiers(syntaxTree5, setOfInt);
                                DW(syntaxTree5, syntaxTree5.getRootNode(), fileEntryXL2, setOfInt, setOf7, setOf6, setOf5, z);
                                this.v5.releaseSyntaxTree(syntaxTree5);
                                fileEntryXL2 = fileEntryXL2;
                            }
                        }
                    }
                case 11:
                case 12:
                case 13:
                case 14:
                    try {
                        this.j6.usageSearcherCallback.FH("parametertype " + entity.getFullyQualifiedNameString());
                        syntaxTree.getLanguage().getCodeAnalyzer().Hw(syntaxTree, i);
                        EQ(syntaxTree, syntaxTree.getRootNode(), file, i, entity);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        break;
                    }
                case 15:
                case 16:
                    this.j6.usageSearcherCallback.FH("field " + entity.getFullyQualifiedNameString());
                    for (SyntaxTree syntaxTree6 : this.v5.VH(syntaxTree.getFile())) {
                        syntaxTree6.getLanguage().getCodeAnalyzer().Hw(syntaxTree6, i);
                        Hw(syntaxTree6, syntaxTree6.getRootNode(), file, i, (Member) entity, z);
                    }
                    if (entity.yS()) {
                        return;
                    }
                    this.Zo.we(i);
                    while (true) {
                        FileEntry fileEntryXL3 = this.Zo.XL();
                        if (fileEntryXL3 != null) {
                            if (fileEntryXL3 != file) {
                                if (!this.j6.stopCallback.FN()) {
                                    for (SyntaxTree syntaxTree7 : this.v5.VH(fileEntryXL3)) {
                                        syntaxTree7.getLanguage().getCodeAnalyzer().Hw(syntaxTree7, i);
                                        Hw(syntaxTree7, syntaxTree7.getRootNode(), fileEntryXL3, i, (Member) entity, z);
                                        this.v5.releaseSyntaxTree(syntaxTree7);
                                    }
                                }
                            }
                        }
                    }
                    if (this.FH.g3(entity.getFile())) {
                        j6((Member) entity);
                        return;
                    }
                    return;
                case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
                default:
                    return;
                case 19:
                case ProxyTextView.INPUTTYPE_date /* 20 */:
                    this.j6.usageSearcherCallback.FH("method " + entity.getFullyQualifiedNameString());
                    for (SyntaxTree syntaxTree8 : this.v5.VH(syntaxTree.getFile())) {
                        syntaxTree8.getLanguage().getCodeAnalyzer().Hw(syntaxTree8, i);
                        Zo(syntaxTree8, syntaxTree8.getRootNode(), file, i, (Member) entity, z);
                    }
                    if (entity.yS()) {
                        return;
                    }
                    this.Zo.we(i);
                    while (true) {
                        FileEntry fileEntryXL4 = this.Zo.XL();
                        if (fileEntryXL4 == null) {
                            return;
                        }
                        if (fileEntryXL4 != file) {
                            if (this.j6.stopCallback.FN()) {
                                return;
                            }
                            for (SyntaxTree syntaxTree9 : this.v5.VH(fileEntryXL4)) {
                                syntaxTree9.getLanguage().getCodeAnalyzer().Hw(syntaxTree9, i);
                                Zo(syntaxTree9, syntaxTree9.getRootNode(), fileEntryXL4, i, (Member) entity, z);
                                this.v5.releaseSyntaxTree(syntaxTree9);
                            }
                        }
                    }
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                    this.j6.usageSearcherCallback.FH("constructor " + entity.getFullyQualifiedNameString());
                    SetOfInt setOfInt2 = new SetOfInt();
                    setOfInt2.put(i);
                    setOfInt2.put(this.DW.get(""));
                    for (SyntaxTree syntaxTree10 : this.v5.VH(syntaxTree.getFile())) {
                        syntaxTree10.getLanguage().getCodeAnalyzer().analyzeEveryIdentifiers(syntaxTree10, setOfInt2);
                        FH(syntaxTree10, syntaxTree10.getRootNode(), file, i, entity);
                    }
                    if (entity.ro()) {
                        return;
                    }
                    this.Zo.we(i);
                    while (true) {
                        FileEntry fileEntryXL5 = this.Zo.XL();
                        if (fileEntryXL5 == null) {
                            return;
                        }
                        if (fileEntryXL5 != file) {
                            if (this.j6.stopCallback.FN()) {
                                return;
                            }
                            for (SyntaxTree syntaxTree11 : this.v5.VH(fileEntryXL5)) {
                                syntaxTree11.getLanguage().getCodeAnalyzer().analyzeEveryIdentifiers(syntaxTree11, setOfInt2);
                                FH(syntaxTree11, syntaxTree11.getRootNode(), fileEntryXL5, i, entity);
                                this.v5.releaseSyntaxTree(syntaxTree11);
                            }
                        }
                    }
            }
        } catch (Throwable th2) {
            th = th2;
        }
        if (gn) {
            iy.lg(th, 1162617686601753984L, this, syntaxTree, new Integer(i), new Integer(i2), entity, new Boolean(z));
        }
        throw th;
    }

    @ey(method = 587009294484419205L)
    private void v5(SyntaxTree syntaxTree, int i, FileEntry fileEntry, int i2, int i3) {
        try {
            if (VH) {
                iy.J8(1687105831564621195L, this, syntaxTree, new Integer(i), fileEntry, new Integer(i2), new Integer(i3));
            }
            int childCount = syntaxTree.getChildCount(i);
            for (int i4 = 0; i4 < childCount; i4++) {
                v5(syntaxTree, syntaxTree.getChildNode(i, i4), fileEntry, i2, i3);
            }
            if (syntaxTree.isIdentifierNode(i)) {
                int iSh = syntaxTree.sh(i);
                if ((iSh == 1 || iSh == 2 || iSh == 3 || iSh == 4 || iSh == 5 || iSh == 32) && syntaxTree.getAttrReferenceNode(i) == i3) {
                    this.j6.usageSearcherCallback.j6(fileEntry, syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i), syntaxTree.getEndLine(i), syntaxTree.getEndColumn(i));
                }
            }
        } catch (Throwable th) {
            if (gn) {
                iy.lg(th, 1687105831564621195L, this, syntaxTree, new Integer(i), fileEntry, new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = -1056379520294885007L)
    public void VH(String str) {
        try {
            if (VH) {
                iy.tp(-2995427577570658285L, this, str);
            }
            str = str.toLowerCase();
            this.j6.usageSearcherCallback.Hw();
            SetOfFileEntry setOfFileEntryKD = this.j6.fileSpace.KD();
            setOfFileEntryKD.j6.init();
            while (setOfFileEntryKD.j6.hasMoreElements()) {
                FileEntry fileEntryNextKey = setOfFileEntryKD.j6.nextKey();
                List<String> listA8 = fileEntryNextKey.a8();
                for (int i = 1; i < listA8.size(); i++) {
                    int iIndexOf = listA8.get(i).toLowerCase().indexOf(str);
                    if (iIndexOf >= 0) {
                        this.j6.usageSearcherCallback.j6(fileEntryNextKey, i, iIndexOf + 1, i, iIndexOf + str.length() + 1);
                    }
                }
            }
            this.j6.usageSearcherCallback.DW();
        } catch (Throwable th) {
            if (gn) {
                iy.j3(th, -2995427577570658285L, this, str);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009b A[Catch: all -> 0x00e6, TryCatch #0 {all -> 0x00e6, blocks: (B:2:0x0000, B:4:0x0004, B:5:0x001d, B:7:0x0033, B:19:0x0058, B:20:0x0064, B:21:0x009b, B:22:0x00d1, B:24:0x00d9), top: B:31:0x0000 }] */
    @abcd.ey(method = 832177074206431537L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void gn(com.aide.codemodel.api.FileEntry r10, int r11, int r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.w0.gn(com.aide.codemodel.api.FileEntry, int, int, boolean):void");
    }

    @ey(method = -3853305341470004845L)
    public void u7(FileEntry fileEntry, boolean z) {
        try {
            if (VH) {
                iy.EQ(2489312791176869345L, this, fileEntry, new Boolean(z));
            }
            this.j6.usageSearcherCallback.Hw();
            MapOf<ClassType, Namespace> toplevelClasstypesOfFile = this.Hw.getToplevelClasstypesOfFile(fileEntry);
            if (toplevelClasstypesOfFile.tp() != null) {
                ClassType classType = (ClassType) toplevelClasstypesOfFile.tp();
                tp(this.v5.getSyntaxTree(classType.getFile(), classType.getLanguage()), fileEntry.getNameIdentifier(), 7, toplevelClasstypesOfFile.tp(), z);
            }
            this.j6.usageSearcherCallback.DW();
        } catch (Throwable th) {
            if (gn) {
                iy.Mr(th, 2489312791176869345L, this, fileEntry, new Boolean(z));
            }
            throw th;
        }
    }
}
