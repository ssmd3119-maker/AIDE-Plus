package com.aide.codemodel.language.java;

import abcd.c6;
import abcd.cy;
import abcd.dy;
import abcd.e4;
import abcd.ey;
import abcd.f2;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import abcd.p6;
import abcd.r6;
import abcd.v5;
import abcd.x5;
import abcd.y5;
import abcd.z5;
import com.aide.codemodel.api.ArrayType;
import com.aide.codemodel.api.ClassType;
import com.aide.codemodel.api.Entity;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.Member;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.Namespace;
import com.aide.codemodel.api.ParameterizedType;
import com.aide.codemodel.api.PointerType;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.Type;
import com.aide.codemodel.api.abstraction.FormatOption;
import com.aide.codemodel.api.abstraction.Language;
import com.aide.codemodel.api.abstraction.Tools;
import com.aide.codemodel.api.callback.TemplateEvaluatorCallback;
import com.aide.codemodel.api.collections.FunctionOfIntInt;
import com.aide.codemodel.api.collections.HashtableOfInt;
import com.aide.codemodel.api.collections.ListOf;
import com.aide.codemodel.api.collections.ListOfInt;
import com.aide.codemodel.api.collections.MapOf;
import com.aide.codemodel.api.collections.SetOf;
import java.util.List;
import java.util.Set;

@cy(clazz = -1440577446589560725L, container = -1440577446589560725L, user = true)
/* loaded from: classes.dex */
public class JavaTools implements Tools {

    @gy
    private static /* synthetic */ boolean EQ;

    @fy
    private static /* synthetic */ boolean tp;

    @dy(field = 3552814727137117431L)
    private final x5 DW;

    @dy(field = -3229405962125986244L)
    private final z5 FH;

    @dy(field = -2170315350823661415L)
    private final c6 Hw;

    @dy(field = -1267776673388164847L)
    private final p6 VH;

    @dy(field = 1232123091873354824L)
    private final y5 Zo;

    @dy(field = 3672682154558279460L)
    private final JavaLanguage gn;

    @dy(field = 2086538405956054113L)
    private final Model j6;

    @dy(field = 1167817649399259936L)
    private final v5 u7;

    @dy(field = 1548959526640081395L)
    private final r6 v5;

    static {
        iy.Zo(JavaTools.class);
    }

    @ey(method = -295311869269409792L)
    public JavaTools(Model model, JavaLanguage javaLanguage) {
        try {
            if (tp) {
                iy.EQ(2286323732839680L, null, model, javaLanguage);
            }
            this.j6 = model;
            this.gn = javaLanguage;
            this.v5 = new r6(model, javaLanguage);
            this.Zo = new y5(model, javaLanguage);
            this.VH = new p6(model, javaLanguage);
            this.DW = new x5(model, javaLanguage);
            this.FH = new z5(model, javaLanguage);
            this.Hw = new c6(model, javaLanguage);
            this.u7 = new v5(model, javaLanguage, javaLanguage.getTypeSystem());
        } catch (Throwable th) {
            if (EQ) {
                iy.Mr(th, 2286323732839680L, null, model, javaLanguage);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b7  */
    /* JADX WARN: Type inference failed for: r32v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    @abcd.ey(method = 942152979597456903L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String Qq(com.aide.codemodel.api.SyntaxTree r26, int r27, int r28, com.aide.codemodel.api.Type r29, java.lang.String r30, com.aide.codemodel.api.collections.SetOf<com.aide.codemodel.api.Entity> r31, int r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.java.JavaTools.Qq(com.aide.codemodel.api.SyntaxTree, int, int, com.aide.codemodel.api.Type, java.lang.String, com.aide.codemodel.api.collections.SetOf, int):java.lang.String");
    }

    @ey(method = 198080285613967539L)
    private void XX(String[] strArr, int i, int i2) throws Throwable {
        Throwable th;
        try {
            if (tp) {
                iy.we(8493325337709374960L, this, strArr, new Integer(i), new Integer(i2));
            }
            if (i < i2) {
                String str = strArr[((i2 - i) / 2) + i];
                int i3 = i;
                int i4 = i2;
                while (i3 <= i4) {
                    while (strArr[i3].compareTo(str) < 0) {
                        try {
                            i3++;
                        } catch (Throwable th2) {
                            th = th2;
                            i = i3;
                            i2 = i4;
                            if (!EQ) {
                                throw th;
                            }
                            iy.U2(th, 8493325337709374960L, this, strArr, new Integer(i), new Integer(i2));
                            throw th;
                        }
                    }
                    while (str.compareTo(strArr[i4]) < 0) {
                        i4--;
                    }
                    if (i3 <= i4) {
                        String str2 = strArr[i4];
                        strArr[i4] = strArr[i3];
                        strArr[i3] = str2;
                        i3++;
                        i4--;
                    }
                }
                XX(strArr, i, i4);
                XX(strArr, i3, i2);
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @ey(method = 1401103704759347168L)
    private boolean aj(SyntaxTree syntaxTree, int i, int i2, ClassType classType) {
        try {
            if (tp) {
                iy.J0(-666878488094305887L, this, syntaxTree, new Integer(i), new Integer(i2), classType);
            }
            int rootNode = syntaxTree.getRootNode();
            int childCount = syntaxTree.getChildCount(rootNode);
            for (int i3 = 0; i3 < childCount; i3++) {
                int childNode = syntaxTree.getChildNode(rootNode, i3);
                if (syntaxTree.getSyntaxTag(childNode) == 224 && syntaxTree.getChildCount(childNode) > 0) {
                    int childNode2 = syntaxTree.getChildNode(childNode, syntaxTree.getChildCount(childNode) - 2);
                    if (syntaxTree.sh(childNode2) == 6 && classType.isToplevel() && syntaxTree.getAttrReferenceEntity(childNode2) == classType.getNamespace()) {
                        return true;
                    }
                } else if (syntaxTree.getSyntaxTag(childNode) == 225) {
                    int childNode3 = syntaxTree.getChildNode(childNode, syntaxTree.getChildCount(childNode) - 2);
                    if (syntaxTree.sh(childNode3) == 8 && syntaxTree.getAttrReferenceEntity(childNode3) == classType) {
                        return true;
                    }
                } else if (syntaxTree.getSyntaxTag(childNode) == 226) {
                    int childNode4 = syntaxTree.getChildNode(childNode, syntaxTree.getChildCount(childNode) - 4);
                    if (syntaxTree.sh(childNode4) == 6 && classType.isToplevel() && syntaxTree.getAttrReferenceEntity(childNode4) == classType.getNamespace()) {
                        return true;
                    }
                    if (syntaxTree.sh(childNode4) == 8 && !classType.isToplevel() && syntaxTree.getAttrReferenceEntity(childNode4) == classType.getEnclosingClassType()) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
            return false;
        } catch (Throwable th) {
            if (EQ) {
                iy.a8(th, -666878488094305887L, this, syntaxTree, new Integer(i), new Integer(i2), classType);
            }
            throw th;
        }
    }

    @ey(method = -2646329714365125600L)
    private void br(SyntaxTree syntaxTree, int i, int i2) {
        try {
            if (tp) {
                iy.we(-516397451911471063L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            if (syntaxTree.isSyntheticNode(i) || syntaxTree.isSyntheticNode(i2)) {
                return;
            }
            this.j6.tp.DW(syntaxTree.getFile(), syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i), syntaxTree.getEndLine(i), syntaxTree.getEndColumn(i), syntaxTree.getStartLine(i2), syntaxTree.getStartColumn(i2), syntaxTree.getEndLine(i2), syntaxTree.getEndColumn(i2));
        } catch (Throwable th) {
            if (EQ) {
                iy.U2(th, -516397451911471063L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 1629667825878112945L)
    private boolean sy(SyntaxTree syntaxTree, ClassType classType) {
        try {
            if (tp) {
                iy.EQ(-1642193747154384864L, this, syntaxTree, classType);
            }
            int rootNode = syntaxTree.getRootNode();
            int childCount = syntaxTree.getChildCount(rootNode);
            int identifier = classType.getIdentifier();
            int i = 0;
            for (int i2 = 0; i2 < childCount; i2++) {
                int childNode = syntaxTree.getChildNode(rootNode, i2);
                if (syntaxTree.getSyntaxTag(childNode) == 225) {
                    int childNode2 = syntaxTree.getChildNode(childNode, syntaxTree.getChildCount(childNode) - 2);
                    if (syntaxTree.getIdentifier(childNode2) == identifier && syntaxTree.sh(childNode2) == 8 && syntaxTree.getAttrReferenceEntity(childNode2) != classType) {
                        return true;
                    }
                }
                if (syntaxTree.getSyntaxTag(childNode) == 225) {
                    int childNode3 = syntaxTree.getChildNode(childNode, syntaxTree.getChildCount(childNode) - 2);
                    if (syntaxTree.getIdentifier(childNode3) == identifier && syntaxTree.sh(childNode3) == 8 && syntaxTree.getAttrReferenceEntity(childNode3) == classType) {
                        return false;
                    }
                }
                if (syntaxTree.getSyntaxTag(childNode) == 226) {
                    int childNode4 = syntaxTree.getChildNode(childNode, syntaxTree.getChildCount(childNode) - 4);
                    if (syntaxTree.sh(childNode4) == 6 && ((Namespace) syntaxTree.getAttrReferenceEntity(childNode4)).g3(identifier, true)) {
                        i++;
                    }
                }
            }
            return i >= 2;
        } catch (Throwable th) {
            if (EQ) {
                iy.Mr(th, -1642193747154384864L, this, syntaxTree, classType);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -2141506827535788612L)
    public void BT(FileEntry fileEntry, int i, int i2, int i3, int i4, Type type, int[] iArr, Type[] typeArr, int[] iArr2) throws Throwable {
        int i5;
        try {
            if (tp) {
                iy.QX(-1611922666331005881L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), type, iArr, typeArr, iArr2});
            }
            i5 = 9;
            try {
                this.Zo.EQ(fileEntry, i, i2, i3, i4, type, iArr, typeArr, iArr2);
            } catch (Throwable th) {
                th = th;
                if (EQ) {
                    Object[] objArr = new Object[i5];
                    objArr[0] = fileEntry;
                    objArr[1] = new Integer(i);
                    objArr[2] = new Integer(i2);
                    objArr[3] = new Integer(i3);
                    objArr[4] = new Integer(i4);
                    objArr[5] = type;
                    objArr[6] = iArr;
                    objArr[7] = typeArr;
                    objArr[8] = iArr2;
                    iy.rN(th, -1611922666331005881L, this, objArr);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i5 = 9;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 4256092698832331784L)
    public void DW(FileEntry fileEntry, int i, int i2) {
        try {
            if (tp) {
                iy.we(3847643235358299361L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            for (int i3 = i; i3 <= i2; i3++) {
                this.j6.refactoringCallback.nw(fileEntry, i3, 1, i3, 1, "//");
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.U2(th, 3847643235358299361L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 1598929898380092344L)
    public String EQ(Namespace namespace) {
        try {
            if (tp) {
                iy.tp(-2462317598675826297L, this, namespace);
            }
            if (namespace.kQ()) {
                return "";
            }
            return "package " + namespace.getFullyQualifiedNameString() + ";";
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, -2462317598675826297L, this, namespace);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -1462087868891217297L)
    public boolean FH(String str) {
        try {
            if (!tp) {
                return true;
            }
            iy.tp(-371214594068503320L, this, str);
            return true;
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, -371214594068503320L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 552209858617559037L)
    public void Hw(FileEntry fileEntry, int i, int i2, boolean z) {
        try {
            if (tp) {
                iy.J0(-5993567729380795304L, this, fileEntry, new Integer(i), new Integer(i2), new Boolean(z));
            }
            this.DW.P8(fileEntry, i, i2);
        } catch (Throwable th) {
            if (EQ) {
                iy.a8(th, -5993567729380795304L, this, fileEntry, new Integer(i), new Integer(i2), new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 1275679520563985169L)
    public void I(FileEntry fileEntry, int i, int i2, int i3, int i4) {
        try {
            if (tp) {
                iy.J8(-1158200151389613664L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            this.Zo.J0(fileEntry, i, i2, i3, i4);
        } catch (Throwable th) {
            if (EQ) {
                iy.lg(th, -1158200151389613664L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 4005376273805161644L)
    public void J0(FileEntry fileEntry, int i, int i2) {
        try {
            if (tp) {
                iy.we(-4387616661567019569L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            this.v5.j6(fileEntry, i, i2, i, i2);
        } catch (Throwable th) {
            if (EQ) {
                iy.U2(th, -4387616661567019569L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 7593731483345617776L)
    public void J8(SyntaxTree syntaxTree, f2 f2Var, int i, int i2) {
        try {
            if (tp) {
                iy.J0(6739079611089385985L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            this.FH.Zo(syntaxTree, f2Var, i, i2);
        } catch (Throwable th) {
            if (EQ) {
                iy.a8(th, 6739079611089385985L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 101553297513658416L)
    public String KD(Namespace namespace) {
        try {
            if (!tp) {
                return "";
            }
            iy.tp(-567776684980841829L, this, namespace);
            return "";
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, -567776684980841829L, this, namespace);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 1696777464782361401L)
    public void Mr(FileEntry fileEntry, int i, int i2) {
        try {
            if (tp) {
                iy.we(-1203270648858075068L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            this.v5.FH(fileEntry, i, i2);
        } catch (Throwable th) {
            if (EQ) {
                iy.U2(th, -1203270648858075068L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -245795899238280307L)
    public String Mz(SyntaxTree syntaxTree, MapOf<ClassType, Entity> mapOf, SetOf<Namespace> setOf) {
        int i;
        try {
            if (tp) {
                iy.we(-1811366438183237856L, this, syntaxTree, mapOf, setOf);
            }
            FunctionOfIntInt functionOfIntInt = new FunctionOfIntInt();
            mapOf.j6.DW();
            while (mapOf.j6.j6()) {
                Entity entityV5 = mapOf.j6.v5();
                if (functionOfIntInt.Hw(entityV5.getId())) {
                    functionOfIntInt.Zo(entityV5.getId(), functionOfIntInt.get(entityV5.getId()) + 1);
                } else {
                    functionOfIntInt.Zo(entityV5.getId(), 1);
                }
            }
            SetOf setOf2 = new SetOf(this.j6.entitySpace);
            SetOf setOf3 = new SetOf(this.j6.entitySpace);
            mapOf.j6.DW();
            while (mapOf.j6.j6()) {
                ClassType classType = (ClassType) mapOf.j6.Hw();
                Entity entityV52 = mapOf.j6.v5();
                try {
                    if (entityV52 != this.gn.getTypeSystem().br(syntaxTree.getFile()) && entityV52 != this.gn.getTypeSystem().nw()) {
                        if (functionOfIntInt.get(entityV52.getId()) <= this.j6.Ws().v5) {
                            setOf2.put(classType);
                        } else {
                            setOf3.put(entityV52);
                        }
                    }
                } catch (e4 unused) {
                }
            }
            SetOf setOf4 = new SetOf(this.j6.entitySpace);
            mapOf.j6.DW();
            Namespace namespace = null;
            MapOf<ClassType, Namespace> toplevelClasstypesOfFile = this.j6.entitySpace.getToplevelClasstypesOfFile(syntaxTree.getFile());
            if (toplevelClasstypesOfFile.Mr() > 0) {
                toplevelClasstypesOfFile.j6.DW();
                toplevelClasstypesOfFile.j6.j6();
                toplevelClasstypesOfFile.j6.Hw();
                namespace = (Namespace) toplevelClasstypesOfFile.j6.v5();
            }
            while (true) {
                i = 0;
                if (!mapOf.j6.j6()) {
                    break;
                }
                ClassType classType2 = (ClassType) mapOf.j6.Hw();
                if (!setOf2.contains(classType2)) {
                    Entity container = classType2.getContainer();
                    int identifier = classType2.getIdentifier();
                    setOf3.DEFAULT_ITERATOR.init();
                    while (setOf3.DEFAULT_ITERATOR.hasMoreElements()) {
                        Entity entityNextKey = setOf3.DEFAULT_ITERATOR.nextKey();
                        if (entityNextKey != container) {
                            if (entityNextKey.isNamespace() && ((Namespace) entityNextKey).g3(identifier, true)) {
                                setOf4.put(classType2);
                            } else if (entityNextKey.isClassType() && ((ClassType) entityNextKey).Z1(identifier, true)) {
                                setOf4.put(classType2);
                            }
                            i = 1;
                            break;
                        }
                    }
                    if (i == 0) {
                        try {
                            if (container != this.gn.getTypeSystem().br(syntaxTree.getFile()) && this.gn.getTypeSystem().br(syntaxTree.getFile()).g3(identifier, true)) {
                                setOf4.put(classType2);
                                i = 1;
                            }
                        } catch (e4 unused2) {
                        }
                    }
                    if (i == 0 && namespace != null && namespace != container && namespace.g3(identifier, true)) {
                        setOf4.put(classType2);
                    }
                }
            }
            setOf2.u7(setOf4);
            int iJ0 = setOf2.J0();
            String[] strArr = new String[iJ0];
            setOf2.DEFAULT_ITERATOR.init();
            int i2 = 0;
            while (setOf2.DEFAULT_ITERATOR.hasMoreElements()) {
                ClassType classType3 = (ClassType) setOf2.DEFAULT_ITERATOR.nextKey();
                Entity container2 = classType3.getContainer();
                if (mapOf.contains(classType3)) {
                    container2 = mapOf.get(classType3);
                }
                strArr[i2] = container2.getFullyQualifiedNameString() + "." + classType3.gG();
                i2++;
            }
            XX(strArr, 0, iJ0 - 1);
            int iJ02 = setOf3.J0();
            String[] strArr2 = new String[iJ02];
            setOf3.DEFAULT_ITERATOR.init();
            int i3 = 0;
            while (setOf3.DEFAULT_ITERATOR.hasMoreElements()) {
                strArr2[i3] = setOf3.DEFAULT_ITERATOR.nextKey().getFullyQualifiedNameString();
                i3++;
            }
            XX(strArr2, 0, iJ02 - 1);
            String str = "";
            for (int i4 = 0; i4 < iJ02; i4++) {
                String strLp = lp(strArr2[i4]);
                if (strLp.length() > 0) {
                    if (str.length() > 0) {
                        str = str + "\n";
                    }
                    str = str + strLp;
                }
            }
            if (iJ0 > 0) {
                if (str.length() > 0) {
                    str = str + "\n";
                }
                while (i < iJ0) {
                    String strOW = OW(strArr[i]);
                    if (strOW.length() > 0) {
                        if (str.length() > 0) {
                            str = str + "\n";
                        }
                        str = str + strOW;
                    }
                    i++;
                }
            }
            return str;
        } catch (Throwable th) {
            if (EQ) {
                iy.U2(th, -1811366438183237856L, this, syntaxTree, mapOf, setOf);
            }
            throw th;
        }
    }

    @ey(method = 2187101688156096032L)
    public String OW(String str) {
        try {
            if (tp) {
                iy.tp(-1918418158487066361L, this, str);
            }
            return "import " + str + ";";
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, -1918418158487066361L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 6120591845729406408L)
    public void P8(FileEntry fileEntry, int i, int i2) {
        try {
            if (tp) {
                iy.we(295103785951909683L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            this.Zo.tp(fileEntry, i, i2);
        } catch (Throwable th) {
            if (EQ) {
                iy.U2(th, 295103785951909683L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -1470710425855562880L)
    public boolean QX(FileEntry fileEntry, int i, int i2) {
        try {
            if (tp) {
                iy.we(-612862228298372675L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            this.DW.vy(fileEntry, i, i2);
            return true;
        } catch (Throwable th) {
            if (EQ) {
                iy.U2(th, -612862228298372675L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 3210954904512195415L)
    public void SI(FileEntry fileEntry, int i, int i2, int i3, int i4) {
        try {
            if (tp) {
                iy.J8(1687821874703368668L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            this.v5.v5(fileEntry, i, i2, i3, i4);
        } catch (Throwable th) {
            if (EQ) {
                iy.lg(th, 1687821874703368668L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 2211112206825159840L)
    public void Sf(SyntaxTree syntaxTree, int i, int i2) {
        try {
            if (tp) {
                iy.we(4055402214544330423L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            int iPa = syntaxTree.Pa(i, i2 - 1);
            if (iPa != -1) {
                int syntaxTag = syntaxTree.getSyntaxTag(iPa);
                if (syntaxTag != 54 && syntaxTag != 55 && syntaxTag != 63 && syntaxTag != 80) {
                    switch (syntaxTag) {
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            int parentNode = syntaxTree.getParentNode(iPa);
                            int syntaxTag2 = syntaxTree.getSyntaxTag(parentNode);
                            if (syntaxTag2 != 122 && syntaxTag2 != 133) {
                                if (syntaxTag2 != 140) {
                                    if (syntaxTag2 == 145) {
                                        br(syntaxTree, syntaxTree.getChildNode(parentNode, 3), syntaxTree.getChildNode(parentNode, 5));
                                        return;
                                    }
                                    if (syntaxTag2 == 149) {
                                        br(syntaxTree, syntaxTree.getChildNode(parentNode, 1), syntaxTree.getChildNode(parentNode, 5));
                                        return;
                                    }
                                    if (syntaxTag2 != 190 && syntaxTag2 != 197) {
                                        if (syntaxTag2 == 211) {
                                            br(syntaxTree, syntaxTree.getChildNode(parentNode, 1), syntaxTree.getChildNode(parentNode, 9));
                                            return;
                                        } else if (syntaxTag2 == 168) {
                                            br(syntaxTree, syntaxTree.getChildNode(parentNode, 0), syntaxTree.getChildNode(parentNode, 2));
                                            return;
                                        } else {
                                            if (syntaxTag2 == 169) {
                                                br(syntaxTree, syntaxTree.getChildNode(parentNode, 0), syntaxTree.getChildNode(parentNode, 3));
                                                return;
                                            }
                                            switch (syntaxTag2) {
                                            }
                                        }
                                    }
                                }
                                br(syntaxTree, syntaxTree.getChildNode(parentNode, 1), syntaxTree.getChildNode(parentNode, 3));
                                return;
                            }
                            br(syntaxTree, syntaxTree.getChildNode(parentNode, 0), syntaxTree.getChildNode(parentNode, syntaxTree.getChildCount(parentNode) - 1));
                            return;
                    }
                }
                int parentNode2 = syntaxTree.getParentNode(iPa);
                int syntaxTag3 = syntaxTree.getSyntaxTag(parentNode2);
                if (syntaxTag3 == 136) {
                    br(syntaxTree, syntaxTree.getChildNode(parentNode2, 0), syntaxTree.getChildNode(parentNode2, 5));
                    return;
                } else if (syntaxTag3 == 145) {
                    br(syntaxTree, syntaxTree.getChildNode(parentNode2, 0), syntaxTree.getChildNode(parentNode2, 2));
                    return;
                }
            }
            this.j6.tp.FH(syntaxTree.getFile());
        } catch (Throwable th) {
            if (EQ) {
                iy.U2(th, 4055402214544330423L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -3287183026350067391L)
    public boolean U2(Member member, ListOfInt listOfInt, ListOfInt listOfInt2, ListOfInt listOfInt3, ListOfInt listOfInt4, ListOfInt listOfInt5) {
        try {
            if (tp) {
                iy.QX(567447545027550528L, this, new Object[]{member, listOfInt, listOfInt2, listOfInt3, listOfInt4, listOfInt5});
            }
            return this.VH.v5(member, listOfInt, listOfInt2, listOfInt3, listOfInt4, listOfInt5);
        } catch (Throwable th) {
            if (EQ) {
                iy.rN(th, 567447545027550528L, this, new Object[]{member, listOfInt, listOfInt2, listOfInt3, listOfInt4, listOfInt5});
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 3572432109023786829L)
    public void VH(FileEntry fileEntry) {
        try {
            if (tp) {
                iy.tp(2217272214778410688L, this, fileEntry);
            }
            this.Zo.Zo(fileEntry);
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, 2217272214778410688L, this, fileEntry);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -523176776243093565L)
    public String Ws() {
        try {
            if (!tp) {
                return "i;";
            }
            iy.gn(-693112798444260760L, this);
            return "i;";
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, -693112798444260760L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -778323992206334224L)
    public HashtableOfInt<Tools.a> XL(SyntaxTree syntaxTree, f2 f2Var, int i, int i2, int i3) {
        try {
            if (tp) {
                iy.J8(-130620423735465701L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            return this.FH.J0(syntaxTree, f2Var, i, i2, i3);
        } catch (Throwable th) {
            if (EQ) {
                iy.lg(th, -130620423735465701L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -545122642305993525L)
    public void Zo(FileEntry fileEntry, int i, int i2) {
        try {
            if (tp) {
                iy.we(-3825102007053682432L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            this.Zo.VH(fileEntry, i, i2);
        } catch (Throwable th) {
            if (EQ) {
                iy.U2(th, -3825102007053682432L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 2348360763703124889L)
    public void a8(FileEntry fileEntry, int i, int i2, int i3, Type type) {
        try {
            if (tp) {
                iy.J8(327577917140204184L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), type);
            }
            this.Zo.J8(fileEntry, i, i2, i3, type);
        } catch (Throwable th) {
            if (EQ) {
                iy.lg(th, 327577917140204184L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), type);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -4232419813000330608L)
    public String aM(SyntaxTree syntaxTree, int i, int i2, SetOf<? extends Type> setOf, SetOf<Entity> setOf2) {
        try {
            if (tp) {
                iy.J8(442962687881113961L, this, syntaxTree, new Integer(i), new Integer(i2), setOf, setOf2);
            }
            setOf.DEFAULT_ITERATOR.init();
            String strQq = "";
            while (setOf.DEFAULT_ITERATOR.hasMoreElements()) {
                strQq = Qq(syntaxTree, i, i2, (Type) setOf.DEFAULT_ITERATOR.nextKey(), strQq, setOf2, this.j6.Ws().v5);
            }
            if (strQq.length() <= 0) {
                return strQq;
            }
            return "\n" + strQq;
        } catch (Throwable th) {
            if (EQ) {
                iy.lg(th, 442962687881113961L, this, syntaxTree, new Integer(i), new Integer(i2), setOf, setOf2);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 558965407147684103L)
    public String ca(Namespace namespace) {
        try {
            if (!tp) {
                return "";
            }
            iy.tp(-168180717913963584L, this, namespace);
            return "";
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, -168180717913963584L, this, namespace);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -402256286511652861L)
    public String cb(SyntaxTree syntaxTree, int i, int i2, Type type) {
        try {
            if (tp) {
                iy.J0(-627183427563843744L, this, syntaxTree, new Integer(i), new Integer(i2), type);
            }
            if (type.isClassType()) {
                return sy(syntaxTree, (ClassType) type) ? type.getFullyQualifiedNameString() : type.getNameString();
            }
            if (type.isPointerType()) {
                return cb(syntaxTree, i, i2, ((PointerType) type).FN()) + "*";
            }
            String str = "";
            if (type.isArrayType()) {
                Type elementType = type;
                while (elementType.isArrayType()) {
                    String str2 = str + "[";
                    for (int i3 = 1; i3 < ((ArrayType) elementType).jO(); i3++) {
                        str2 = str2 + ",";
                    }
                    str = str2 + "]";
                    elementType = ((ArrayType) elementType).getElementType();
                }
                return cb(syntaxTree, i, i2, elementType) + str;
            }
            if (!type.isParameterizedType()) {
                return type.getFullyQualifiedNameString();
            }
            ClassType classType = ((ParameterizedType) type).getClassType();
            Type[] absoluteArgumentTypes = ((ParameterizedType) type).getAbsoluteArgumentTypes();
            int[] absoluteArgumentVariances = ((ParameterizedType) type).getAbsoluteArgumentVariances();
            int absoluteParametertypeCount = classType.getAbsoluteParametertypeCount() - 1;
            boolean z = true;
            while (true) {
                int iPa = classType.Pa();
                if (z && iPa > 0) {
                    int i4 = iPa - 1;
                    for (int i5 = i4; i5 >= 0; i5--) {
                        String strCb = cb(syntaxTree, i, i2, absoluteArgumentTypes[absoluteParametertypeCount]);
                        if (absoluteArgumentVariances[absoluteParametertypeCount] == 2) {
                            strCb = "? extends " + strCb;
                        }
                        if (absoluteArgumentVariances[absoluteParametertypeCount] == 3) {
                            strCb = "? super " + strCb;
                        }
                        if (absoluteArgumentVariances[absoluteParametertypeCount] == 1) {
                            strCb = "?";
                        }
                        str = i5 < i4 ? strCb + ", " + str : strCb + ">" + str;
                        absoluteParametertypeCount--;
                    }
                    str = "<" + str;
                }
                String str3 = classType.gG() + str;
                if (!classType.PT()) {
                    z = false;
                }
                ClassType enclosingClassType = classType.getEnclosingClassType();
                if (enclosingClassType == classType) {
                    return str3;
                }
                str = "." + str3;
                classType = enclosingClassType;
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.a8(th, -627183427563843744L, this, syntaxTree, new Integer(i), new Integer(i2), type);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 3824436763158964869L)
    public void cn(FileEntry fileEntry, int i, int i2) {
        try {
            if (tp) {
                iy.we(-6425604164010388264L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            List<String> listA8 = fileEntry.a8();
            for (int i3 = i; i3 <= Math.min(listA8.size() - 1, i2); i3++) {
                String str = listA8.get(i3);
                if (str.trim().startsWith("//")) {
                    int iIndexOf = str.indexOf("//") + 1;
                    this.j6.refactoringCallback.nw(fileEntry, i3, iIndexOf, i3, iIndexOf + 2, "");
                }
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.U2(th, -6425604164010388264L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 137428260530898584L)
    public void dx(TemplateEvaluatorCallback templateEvaluatorCallback, FileEntry fileEntry, int i, int i2, String str, List<String> list) throws Throwable {
        int i3;
        try {
            if (tp) {
                iy.QX(-205954546124775525L, this, new Object[]{templateEvaluatorCallback, fileEntry, new Integer(i), new Integer(i2), str, list});
            }
            i3 = 6;
            try {
                this.Hw.FH(templateEvaluatorCallback, fileEntry, i, i2, str, list);
            } catch (Throwable th) {
                th = th;
                if (EQ) {
                    Object[] objArr = new Object[i3];
                    objArr[0] = templateEvaluatorCallback;
                    objArr[1] = fileEntry;
                    objArr[2] = new Integer(i);
                    objArr[3] = new Integer(i2);
                    objArr[4] = str;
                    objArr[5] = list;
                    iy.rN(th, -205954546124775525L, this, objArr);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i3 = 6;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -1020046549822087779L)
    public String ef(SyntaxTree syntaxTree, MapOf<ClassType, Entity> mapOf) {
        String str;
        try {
            if (tp) {
                iy.EQ(-139335460932725280L, this, syntaxTree, mapOf);
            }
            ListOf listOf = new ListOf(this.j6.entitySpace);
            ListOf listOf2 = new ListOf(this.j6.entitySpace);
            int childCount = syntaxTree.getChildCount(syntaxTree.getRootNode());
            for (int i = 1; i < childCount; i++) {
                int childNode = syntaxTree.getChildNode(syntaxTree.getRootNode(), i);
                int syntaxTag = syntaxTree.getSyntaxTag(childNode);
                if (syntaxTag == 213) {
                    int childNode2 = syntaxTree.getChildNode(childNode, syntaxTree.getChildCount(childNode) - 2);
                    if (syntaxTree.sh(childNode2) != 0) {
                        listOf2.j6(syntaxTree.getAttrReferenceEntity(childNode2));
                    }
                } else if (syntaxTag == 214) {
                    int childNode3 = syntaxTree.getChildNode(childNode, syntaxTree.getChildCount(childNode) - 4);
                    if (syntaxTree.sh(childNode3) == 8) {
                        listOf.j6((ClassType) syntaxTree.getAttrReferenceEntity(childNode3));
                    }
                }
            }
            String str2 = "";
            if (listOf.EQ() > 0) {
                for (int i2 = 0; i2 < listOf.EQ(); i2++) {
                    if (str2.length() > 0) {
                        str2 = str2 + "\n";
                    }
                    ClassType classType = (ClassType) listOf.v5(i2);
                    Entity namespace = classType.getNamespace();
                    if (mapOf.contains(classType)) {
                        namespace = mapOf.get(classType);
                    }
                    str2 = str2 + "import static " + (namespace.getFullyQualifiedNameString() + "." + classType.gG()) + ".*;";
                }
            }
            if (listOf2.EQ() > 0) {
                for (int i3 = 0; i3 < listOf2.EQ(); i3++) {
                    if (str2.length() > 0) {
                        str2 = str2 + "\n";
                    }
                    Entity entityV5 = listOf2.v5(i3);
                    if (entityV5.isMember()) {
                        ClassType enclosingClassType = ((Member) entityV5).getEnclosingClassType();
                        Entity namespace2 = enclosingClassType.getNamespace();
                        if (mapOf.contains(enclosingClassType)) {
                            namespace2 = mapOf.get(enclosingClassType);
                        }
                        str = str2 + "import static " + (namespace2.getFullyQualifiedNameString() + "." + enclosingClassType.gG() + "." + this.j6.identifierSpace.getString(((Member) entityV5).getIdentifier())) + ";";
                    } else if (entityV5.isClassType()) {
                        ClassType classType2 = (ClassType) entityV5;
                        Entity namespace3 = classType2.getNamespace();
                        if (mapOf.contains(classType2)) {
                            namespace3 = mapOf.get(classType2);
                        }
                        str = str2 + "import static " + (namespace3.getFullyQualifiedNameString() + "." + classType2.getNameString()) + ";";
                    }
                    str2 = str;
                }
            }
            return str2;
        } catch (Throwable th) {
            if (EQ) {
                iy.Mr(th, -139335460932725280L, this, syntaxTree, mapOf);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 380372094119391660L)
    public String ei(String str, String str2) {
        try {
            if (tp) {
                iy.EQ(436372609551875727L, this, str, str2);
            }
            return str + " " + str2;
        } catch (Throwable th) {
            if (EQ) {
                iy.Mr(th, 436372609551875727L, this, str, str2);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -1495140426597665925L)
    public void er(SyntaxTree syntaxTree, FileEntry fileEntry, Language language, int i, int i2) {
        try {
            if (tp) {
                iy.J8(5403084937912324544L, this, syntaxTree, fileEntry, language, new Integer(i), new Integer(i2));
            }
            this.DW.er(syntaxTree, i, i2);
        } catch (Throwable th) {
            if (EQ) {
                iy.lg(th, 5403084937912324544L, this, syntaxTree, fileEntry, language, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -1490561009778922880L)
    public void g3(FileEntry fileEntry, int i, int i2) {
        try {
            if (tp) {
                iy.we(1374655929107656135L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            this.DW.ei(fileEntry, i, i2);
        } catch (Throwable th) {
            if (EQ) {
                iy.U2(th, 1374655929107656135L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 2289286624220443435L)
    public void gW(FileEntry fileEntry, int i, int i2, Member member) {
        try {
            if (tp) {
                iy.J0(34797823961729224L, this, fileEntry, new Integer(i), new Integer(i2), member);
            }
            this.Zo.we(fileEntry, i, i2, member);
        } catch (Throwable th) {
            if (EQ) {
                iy.a8(th, 34797823961729224L, this, fileEntry, new Integer(i), new Integer(i2), member);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -1010890976037754560L)
    public void gn(FileEntry fileEntry, int i, int i2, String str, int i3, int i4, boolean z) throws Throwable {
        int i5;
        try {
            if (tp) {
                iy.QX(5661636575619861837L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), str, new Integer(i3), new Integer(i4), new Boolean(z)});
            }
            i5 = 7;
            try {
                this.DW.SI(fileEntry, i, i2, str, i3, i4, z);
            } catch (Throwable th) {
                th = th;
                if (EQ) {
                    Object[] objArr = new Object[i5];
                    objArr[0] = fileEntry;
                    objArr[1] = new Integer(i);
                    objArr[2] = new Integer(i2);
                    objArr[3] = str;
                    objArr[4] = new Integer(i3);
                    objArr[5] = new Integer(i4);
                    objArr[6] = new Boolean(z);
                    iy.rN(th, 5661636575619861837L, this, objArr);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i5 = 7;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 7495181466888338435L)
    public Set<? extends FormatOption> j3(SyntaxTree syntaxTree, int i) {
        try {
            if (tp) {
                iy.EQ(-6263314467676623520L, this, syntaxTree, new Integer(i));
            }
            return this.FH.QX(syntaxTree, i);
        } catch (Throwable th) {
            if (EQ) {
                iy.Mr(th, -6263314467676623520L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -1464870095785136780L)
    public HashtableOfInt<Tools.a> j6(SyntaxTree syntaxTree, f2 f2Var, int i, int i2, int i3) {
        try {
            if (tp) {
                iy.J8(4180348933745079963L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            return this.FH.J0(syntaxTree, f2Var, i, i2, i3);
        } catch (Throwable th) {
            if (EQ) {
                iy.lg(th, 4180348933745079963L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -3324436594070816340L)
    public void lg(SyntaxTree syntaxTree, f2 f2Var, int i, int i2) {
        try {
            if (tp) {
                iy.J0(4783438608148176655L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            this.FH.gn(syntaxTree, f2Var, i);
        } catch (Throwable th) {
            if (EQ) {
                iy.a8(th, 4783438608148176655L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -697909061970587840L)
    public String lp(String str) {
        try {
            if (tp) {
                iy.tp(332046962550145953L, this, str);
            }
            return "import " + str + ".*;";
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, 332046962550145953L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 1268002643208226553L)
    public HashtableOfInt<Tools.a> nw(SyntaxTree syntaxTree, f2 f2Var, int i, int i2, int i3) {
        try {
            if (tp) {
                iy.J8(-890635217579554392L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            return this.FH.J8(syntaxTree, f2Var, i, i2, i3);
        } catch (Throwable th) {
            if (EQ) {
                iy.lg(th, -890635217579554392L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -964371314762926785L)
    public void rN(FileEntry fileEntry, FileEntry fileEntry2, int i, int i2, int i3, int i4) {
        try {
            if (tp) {
                iy.QX(72526475634775736L, this, new Object[]{fileEntry, fileEntry2, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.rN(th, 72526475634775736L, this, new Object[]{fileEntry, fileEntry2, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -4997377578010019787L)
    public void ro(FileEntry fileEntry, int i, int i2, String str, int i3) {
        try {
            if (tp) {
                iy.J8(4923088795774421184L, this, fileEntry, new Integer(i), new Integer(i2), str, new Integer(i3));
            }
            this.DW.gW(fileEntry, i, i2, str, i3);
        } catch (Throwable th) {
            if (EQ) {
                iy.lg(th, 4923088795774421184L, this, fileEntry, new Integer(i), new Integer(i2), str, new Integer(i3));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 3203326551320286720L)
    public void sG(FileEntry fileEntry, String str) {
        try {
            if (tp) {
                iy.EQ(5234913306011674535L, this, fileEntry, str);
            }
            this.u7.DW(fileEntry, str);
        } catch (Throwable th) {
            if (EQ) {
                iy.Mr(th, 5234913306011674535L, this, fileEntry, str);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -1361772400686363600L)
    public void sh(FileEntry fileEntry, int i, int i2, int i3, int i4, Type type) throws Throwable {
        int i5;
        try {
            if (tp) {
                iy.QX(1761029309404506097L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), type});
            }
            i5 = 6;
            try {
                this.Zo.u7(fileEntry, i, i2, i3, i4, type);
            } catch (Throwable th) {
                th = th;
                if (EQ) {
                    Object[] objArr = new Object[i5];
                    objArr[0] = fileEntry;
                    objArr[1] = new Integer(i);
                    objArr[2] = new Integer(i2);
                    objArr[3] = new Integer(i3);
                    objArr[4] = new Integer(i4);
                    objArr[5] = type;
                    iy.rN(th, 1761029309404506097L, this, objArr);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i5 = 6;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -998087288358760768L)
    public void tp(FileEntry fileEntry, int i, int i2, int i3, int i4) {
        try {
            if (tp) {
                iy.J8(3394048182204740781L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            this.v5.u7(fileEntry, i, i2, i3, i4);
        } catch (Throwable th) {
            if (EQ) {
                iy.lg(th, 3394048182204740781L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 291668946099463944L)
    public void u7(FileEntry fileEntry, int i, int i2, int i3, int i4) {
        try {
            if (tp) {
                iy.J8(-331188524117541299L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            this.v5.DW(fileEntry, i, i2, i3, i4);
        } catch (Throwable th) {
            if (EQ) {
                iy.lg(th, -331188524117541299L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -475017118672603080L)
    public int[] v5(SyntaxTree syntaxTree, f2 f2Var, int i, int i2) {
        try {
            if (tp) {
                iy.J0(3316189564169009439L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            return this.FH.VH(syntaxTree, f2Var, i, i2);
        } catch (Throwable th) {
            if (EQ) {
                iy.a8(th, 3316189564169009439L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 2193711055294592085L)
    public String vJ(SyntaxTree syntaxTree, int i, int i2, SetOf<? extends Type> setOf) {
        try {
            if (tp) {
                iy.J0(-6962221396025993428L, this, syntaxTree, new Integer(i), new Integer(i2), setOf);
            }
            return aM(syntaxTree, i, i2, setOf, new SetOf<>(this.j6.entitySpace));
        } catch (Throwable th) {
            if (EQ) {
                iy.a8(th, -6962221396025993428L, this, syntaxTree, new Integer(i), new Integer(i2), setOf);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -1436589117655052693L)
    public void vy(FileEntry fileEntry, Member member, ListOfInt listOfInt, ListOfInt listOfInt2, ListOfInt listOfInt3, ListOfInt listOfInt4, ListOfInt listOfInt5) throws Throwable {
        int i;
        try {
            if (tp) {
                iy.QX(-5515396042217214720L, this, new Object[]{fileEntry, member, listOfInt, listOfInt2, listOfInt3, listOfInt4, listOfInt5});
            }
            i = 7;
            try {
                this.VH.FH(fileEntry, member, listOfInt, listOfInt2, listOfInt3, listOfInt4, listOfInt5);
            } catch (Throwable th) {
                th = th;
                if (EQ) {
                    Object[] objArr = new Object[i];
                    objArr[0] = fileEntry;
                    objArr[1] = member;
                    objArr[2] = listOfInt;
                    objArr[3] = listOfInt2;
                    objArr[4] = listOfInt3;
                    objArr[5] = listOfInt4;
                    objArr[6] = listOfInt5;
                    iy.rN(th, -5515396042217214720L, this, objArr);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i = 7;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -538489867567481027L)
    public void we(FileEntry fileEntry, int i, int i2) {
        try {
            if (tp) {
                iy.we(-2513361303232168452L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            this.DW.rN(fileEntry, i, i2);
        } catch (Throwable th) {
            if (EQ) {
                iy.U2(th, -2513361303232168452L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -165160917511305660L)
    public void x9(FileEntry fileEntry, int i, int i2, int i3, int i4) {
        try {
            if (tp) {
                iy.J8(7088221094485915811L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            this.Zo.v5(fileEntry, i, i2, i3, i4);
        } catch (Throwable th) {
            if (EQ) {
                iy.lg(th, 7088221094485915811L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 318153423348903700L)
    public void yS(SyntaxTree syntaxTree, int i, int i2, int i3, boolean z) {
        try {
            if (tp) {
                iy.J8(5032380046037986713L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z));
            }
            this.DW.nw(syntaxTree, i, i2, i3, z);
        } catch (Throwable th) {
            if (EQ) {
                iy.lg(th, 5032380046037986713L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z));
            }
            throw th;
        }
    }
}
