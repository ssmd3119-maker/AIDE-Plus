package abcd;

import com.aide.codemodel.api.ClassType;
import com.aide.codemodel.api.Entity;
import com.aide.codemodel.api.EntitySpace;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.FileSpace;
import com.aide.codemodel.api.IdentifierSpace;
import com.aide.codemodel.api.Member;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.Namespace;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.SyntaxTreeSpace;
import com.aide.codemodel.api.Type;
import com.aide.codemodel.api.Variable;
import com.aide.codemodel.api.callback.CodeCompleterCallback;
import com.aide.codemodel.api.collections.MapOfInt;
import com.aide.codemodel.api.collections.SetOf;
import com.aide.codemodel.api.collections.SetOfInt;
import com.aide.codemodel.language.java.JavaCodeAnalyzer;
import com.aide.codemodel.language.java.JavaLanguage;
import com.aide.codemodel.language.java.JavaTypeSystem;
import java.util.ArrayList;
import java.util.List;

@cy(clazz = -4811606462448804228L, container = -4811606462448804228L, user = true)
/* loaded from: classes.dex */
public class x5 {

    @fy
    private static /* synthetic */ boolean VH;

    @gy
    private static /* synthetic */ boolean gn;

    @dy(field = -536082537777787520L)
    private final IdentifierSpace DW;

    @dy(field = -43043548251421224L)
    private final EntitySpace FH;

    @dy(field = 3304009543680985L)
    private final SyntaxTreeSpace Hw;

    @dy(field = -1081379667508773940L)
    private List<String> Zo;

    @dy(field = -304278964565151485L)
    private final Model j6;

    @dy(field = 3645534827314684384L)
    private final JavaLanguage v5;

    static {
        iy.Zo(x5.class);
    }

    @ey(method = -256043656368297600L)
    public x5(Model model, JavaLanguage javaLanguage) {
        try {
            if (VH) {
                iy.EQ(6040074901108076808L, null, model, javaLanguage);
            }
            this.j6 = model;
            this.DW = model.identifierSpace;
            FileSpace fileSpace = model.fileSpace;
            this.FH = model.entitySpace;
            this.Hw = model.syntaxTreeSpace;
            this.v5 = javaLanguage;
            this.Zo = new ArrayList();
            String[] strArr = {"else", "finally", "catch", "private", "public", "protected"};
            for (int i = 0; i < 6; i++) {
                this.Zo.add(strArr[i]);
            }
        } catch (Throwable th) {
            if (gn) {
                iy.Mr(th, 6040074901108076808L, null, model, javaLanguage);
            }
            throw th;
        }
    }

    @ey(method = 7476922960890047955L)
    private void BT(FileEntry fileEntry, int i, int i2, String str, int i3) {
        try {
            if (VH) {
                iy.J8(2894786124949464463L, this, fileEntry, new Integer(i), new Integer(i2), str, new Integer(i3));
            }
            int i4 = i3 - 2;
            if (str.length() <= i4 || i4 < 0) {
                return;
            }
            char cCharAt = str.charAt(i4);
            if (cCharAt == '.' || Character.isJavaIdentifierPart(cCharAt)) {
                gW(fileEntry, i, i2, str, i3);
            }
        } catch (Throwable th) {
            if (gn) {
                iy.lg(th, 2894786124949464463L, this, fileEntry, new Integer(i), new Integer(i2), str, new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = -2342614120156116936L)
    private void DW(SyntaxTree syntaxTree, Type type, Type type2, ClassType classType, boolean z) {
        try {
            if (VH) {
                iy.J8(-1151475964319359696L, this, syntaxTree, type, type2, classType, new Boolean(z));
            }
            try {
                if (type.isClassType()) {
                    v5(syntaxTree, (ClassType) type, type2, classType);
                    if (z) {
                        we(syntaxTree, (ClassType) type, type2, classType);
                        return;
                    }
                    return;
                }
                if (!type.isArrayType()) {
                    if (type.x9() != type) {
                        DW(syntaxTree, type.x9(), type2, classType, z);
                    }
                } else {
                    v5(syntaxTree, ((JavaTypeSystem) syntaxTree.getLanguage().getTypeSystem()).Eq(syntaxTree.getFile()), type2, classType);
                    if (z) {
                        we(syntaxTree, ((JavaTypeSystem) syntaxTree.getLanguage().getTypeSystem()).Eq(syntaxTree.getFile()), type2, classType);
                    }
                    this.j6.codeCompleterCallback.Zo("length");
                }
            } catch (e4 unused) {
            }
        } catch (Throwable th) {
            if (gn) {
                iy.lg(th, -1151475964319359696L, this, syntaxTree, type, type2, classType, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -3953758727365272891L)
    private void EQ(SyntaxTree syntaxTree) {
        try {
            if (VH) {
                iy.tp(2179241151642780225L, this, syntaxTree);
            }
            int rootNode = syntaxTree.getRootNode();
            SetOf setOf = new SetOf(this.FH);
            int childCount = syntaxTree.getChildCount(rootNode);
            for (int i = 0; i < childCount; i++) {
                int childNode = syntaxTree.getChildNode(rootNode, i);
                if (syntaxTree.getSyntaxTag(childNode) == 213) {
                    int childNode2 = syntaxTree.getChildNode(childNode, syntaxTree.getChildCount(childNode) - 2);
                    if (syntaxTree.sh(childNode2) == 20 || syntaxTree.sh(childNode2) == 16) {
                        Entity attrReferenceEntity = syntaxTree.getAttrReferenceEntity(childNode2);
                        if (!setOf.contains(attrReferenceEntity)) {
                            this.j6.codeCompleterCallback.j3(attrReferenceEntity, true);
                            setOf.put(attrReferenceEntity);
                        }
                    }
                }
            }
            int childCount2 = syntaxTree.getChildCount(rootNode);
            for (int i2 = 0; i2 < childCount2; i2++) {
                int childNode3 = syntaxTree.getChildNode(rootNode, i2);
                if (syntaxTree.getSyntaxTag(childNode3) == 214) {
                    int childNode4 = syntaxTree.getChildNode(childNode3, syntaxTree.getChildCount(childNode3) - 4);
                    if (syntaxTree.sh(childNode4) == 8) {
                        Entity attrReferenceEntity2 = syntaxTree.getAttrReferenceEntity(childNode4);
                        MapOfInt<Member> mapOfIntE3 = ((ClassType) attrReferenceEntity2).e3();
                        mapOfIntE3.DEFAULT_ITERATOR.DW();
                        while (mapOfIntE3.DEFAULT_ITERATOR.hasMoreElements()) {
                            Member member = (Member) mapOfIntE3.DEFAULT_ITERATOR.nextValue();
                            if (!setOf.contains(member) && member.gG()) {
                                this.j6.codeCompleterCallback.j3(member, true);
                            }
                        }
                        mapOfIntE3.DEFAULT_ITERATOR.DW();
                        while (mapOfIntE3.DEFAULT_ITERATOR.hasMoreElements()) {
                            setOf.put(mapOfIntE3.DEFAULT_ITERATOR.nextValue());
                        }
                        MapOfInt<Member> mapOfIntEU = ((ClassType) attrReferenceEntity2).eU();
                        mapOfIntEU.DEFAULT_ITERATOR.DW();
                        while (mapOfIntEU.DEFAULT_ITERATOR.hasMoreElements()) {
                            Member member2 = (Member) mapOfIntEU.DEFAULT_ITERATOR.nextValue();
                            if (!setOf.contains(member2) && member2.gG()) {
                                this.j6.codeCompleterCallback.j3(member2, true);
                                setOf.put(member2);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            if (gn) {
                iy.j3(th, 2179241151642780225L, this, syntaxTree);
            }
            throw th;
        }
    }

    @ey(method = 441998005932617799L)
    private void FH(ClassType classType, Type type, ClassType classType2) {
        try {
            if (VH) {
                iy.we(2871663734796579611L, this, classType, type, classType2);
            }
            SetOf<Member> setOfAX = classType.aX();
            setOfAX.DEFAULT_ITERATOR.init();
            while (setOfAX.DEFAULT_ITERATOR.hasMoreElements()) {
                Member member = (Member) setOfAX.DEFAULT_ITERATOR.nextKey();
                if (member.Nh(classType2, classType2)) {
                    this.j6.codeCompleterCallback.we(member, type);
                }
            }
        } catch (Throwable th) {
            if (gn) {
                iy.U2(th, 2871663734796579611L, this, classType, type, classType2);
            }
            throw th;
        }
    }

    @ey(method = -404404346158529101L)
    private void Hw(SyntaxTree syntaxTree, int i, int i2, int i3, boolean z) {
        try {
            if (VH) {
                iy.J8(-926350464393072657L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z));
            }
            int iSh = syntaxTree.sh(i);
            if (iSh == 2 || iSh == 3) {
                if (!syntaxTree.hasAttrType(i)) {
                    tp(syntaxTree, i2, i3, z);
                    return;
                }
                ClassType classTypeU2 = U2(syntaxTree, i);
                Type attrType = syntaxTree.getAttrType(i);
                this.j6.codeCompleterCallback.U2(attrType);
                DW(syntaxTree, attrType, attrType, classTypeU2, true);
                if (z) {
                    XL(syntaxTree, syntaxTree.getRootNode(), i2, i3, new SetOfInt());
                    return;
                }
                return;
            }
            if (iSh == 6) {
                Namespace namespace = (Namespace) syntaxTree.getAttrReferenceEntity(i);
                this.j6.codeCompleterCallback.U2(namespace);
                gn(syntaxTree, namespace, this.FH.getRootNamespace());
                return;
            }
            if (iSh == 16) {
                if (!syntaxTree.hasAttrType(i)) {
                    tp(syntaxTree, i2, i3, z);
                    return;
                }
                ClassType classTypeU22 = U2(syntaxTree, i);
                Type attrType2 = syntaxTree.getAttrType(i);
                this.j6.codeCompleterCallback.U2(attrType2);
                DW(syntaxTree, attrType2, attrType2, classTypeU22, true);
                if (z) {
                    XL(syntaxTree, syntaxTree.getRootNode(), i2, i3, new SetOfInt());
                    return;
                }
                return;
            }
            if (iSh != 17) {
                switch (iSh) {
                    case 8:
                    case 9:
                    case 10:
                        break;
                    default:
                        tp(syntaxTree, i2, i3, z);
                        return;
                }
            }
            ClassType classTypeU23 = U2(syntaxTree, i);
            ClassType classType = (ClassType) syntaxTree.getAttrReferenceEntity(i);
            if (classTypeU23 == null || !classType.isClassType()) {
                return;
            }
            this.j6.codeCompleterCallback.U2(classType);
            we(syntaxTree, classType, classType, classTypeU23);
        } catch (Throwable th) {
            if (gn) {
                iy.lg(th, -926350464393072657L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -3486785791016647607L)
    private void J0(SyntaxTree syntaxTree, int i) {
        try {
            if (VH) {
                iy.EQ(-7063643515113950355L, this, syntaxTree, new Integer(i));
            }
            syntaxTree.getLanguage().getCodeAnalyzer().Zo(syntaxTree);
            try {
                ClassType classtype = this.FH.getClasstype(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getDeclarationNumber(syntaxTree.getParentNode(i)));
                MapOfInt<Member> mapOfIntE3 = classtype.e3();
                mapOfIntE3.DEFAULT_ITERATOR.DW();
                while (mapOfIntE3.DEFAULT_ITERATOR.hasMoreElements()) {
                    Member member = (Member) mapOfIntE3.DEFAULT_ITERATOR.nextValue();
                    if (y1.j3(member.getModifiers()) || y1.EQ(member.getModifiers()) || y1.j6(member.getModifiers())) {
                        if (member.getEnclosingClassType() != classtype) {
                            this.j6.codeCompleterCallback.tp(member, classtype.u9());
                        }
                    }
                }
                SetOf<Member> setOfAX = classtype.Bx().aX();
                setOfAX.DEFAULT_ITERATOR.init();
                while (setOfAX.DEFAULT_ITERATOR.hasMoreElements()) {
                    ((Member) setOfAX.DEFAULT_ITERATOR.nextKey()).ro();
                }
            } catch (e4 unused) {
            }
        } catch (Throwable th) {
            if (gn) {
                iy.Mr(th, -7063643515113950355L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -367813573305899392L)
    private void J8(SyntaxTree syntaxTree, Type type, int i, ClassType classType) {
        try {
            if (VH) {
                iy.J0(-105645056196076800L, this, syntaxTree, type, new Integer(i), classType);
            }
            try {
                if (type.isArrayType()) {
                    type = this.FH.Xa(syntaxTree.getFile(), syntaxTree.getLanguage());
                }
                if (type.x9().isClassType()) {
                    MapOfInt<Member> mapOfIntE3 = ((ClassType) type.x9()).e3();
                    mapOfIntE3.DEFAULT_ITERATOR.init(i);
                    while (mapOfIntE3.DEFAULT_ITERATOR.hasMoreElements()) {
                        Member member = (Member) mapOfIntE3.DEFAULT_ITERATOR.nextValue();
                        if (member.Nh(classType, classType)) {
                            this.j6.codeCompleterCallback.we(member, type);
                        }
                    }
                }
            } catch (e4 unused) {
            }
        } catch (Throwable th) {
            Type type2 = type;
            if (gn) {
                iy.a8(th, -105645056196076800L, this, syntaxTree, type2, new Integer(i), classType);
            }
            throw th;
        }
    }

    @ey(method = 90458429567527993L)
    private int Mr(String str, int i) {
        try {
            if (VH) {
                iy.EQ(-7653042522573806059L, this, str, new Integer(i));
            }
            int i2 = i;
            while (true) {
                int i3 = i2 - 2;
                if (i3 < 0 || !Character.isJavaIdentifierPart(str.charAt(i3))) {
                    break;
                }
                i2--;
            }
            return i2;
        } catch (Throwable th) {
            if (gn) {
                iy.Mr(th, -7653042522573806059L, this, str, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -719640919315768065L)
    private void QX(Type type) {
        try {
            if (VH) {
                iy.tp(-123126275036923373L, this, type);
            }
            this.j6.codeCompleterCallback.Hw(type);
        } catch (Throwable th) {
            if (gn) {
                iy.j3(th, -123126275036923373L, this, type);
            }
            throw th;
        }
    }

    @ey(method = -1278943900800967921L)
    private ClassType U2(SyntaxTree syntaxTree, int i) {
        try {
            if (VH) {
                iy.EQ(-1838025200664952773L, this, syntaxTree, new Integer(i));
            }
            while (i != syntaxTree.getRootNode()) {
                if (syntaxTree.getSyntaxTag(i) == 122) {
                    try {
                        return this.FH.getClasstype(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getDeclarationNumber(syntaxTree.getParentNode(i)));
                    } catch (e4 unused) {
                        continue;
                    }
                }
                i = syntaxTree.getParentNode(i);
            }
            return null;
        } finally {
        }
    }

    @ey(method = 76238399288560916L)
    private void VH(SyntaxTree syntaxTree, ClassType classType, int i) {
        try {
            if (VH) {
                iy.we(1376881147466056444L, this, syntaxTree, classType, new Integer(i));
            }
            SetOf<Entity> setOf = new SetOf<>(this.FH);
            while (i != -1) {
                try {
                    MapOfInt<ClassType> mapOfIntIW = this.FH.getClasstype(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getDeclarationNumber(syntaxTree.getParentNode(i))).iW();
                    mapOfIntIW.DEFAULT_ITERATOR.DW();
                    while (mapOfIntIW.DEFAULT_ITERATOR.hasMoreElements()) {
                        if (!setOf.contains(mapOfIntIW.DEFAULT_ITERATOR.nextValue())) {
                            this.j6.codeCompleterCallback.Mr(mapOfIntIW.DEFAULT_ITERATOR.nextValue());
                            setOf.put(mapOfIntIW.DEFAULT_ITERATOR.nextValue());
                        }
                    }
                } catch (e4 unused) {
                }
                do {
                    i = syntaxTree.getParentNode(i);
                    if (i == syntaxTree.getRootNode()) {
                        i = -1;
                    }
                    if (i != -1) {
                    }
                } while (syntaxTree.getSyntaxTag(i) != 122);
            }
            Ws(syntaxTree, setOf);
        } finally {
        }
    }

    @ey(method = 652842346684440315L)
    private void Ws(SyntaxTree syntaxTree, SetOf<Entity> setOf) {
        try {
            if (VH) {
                iy.EQ(-552644572357280889L, this, syntaxTree, setOf);
            }
            Namespace rootNamespace = this.FH.getRootNamespace();
            int childNode = syntaxTree.getChildNode(syntaxTree.getRootNode(), 0);
            if (syntaxTree.getChildCount(childNode) > 0) {
                rootNamespace = (Namespace) syntaxTree.getAttrReferenceEntity(syntaxTree.getChildNode(childNode, syntaxTree.getChildCount(childNode) - 2));
            }
            u7(syntaxTree, rootNamespace, rootNamespace, setOf);
            int childCount = syntaxTree.getChildCount(syntaxTree.getRootNode());
            for (int i = 0; i < childCount; i++) {
                int childNode2 = syntaxTree.getChildNode(syntaxTree.getRootNode(), i);
                if (syntaxTree.getSyntaxTag(childNode2) == 225) {
                    int childNode3 = syntaxTree.getChildNode(childNode2, syntaxTree.getChildCount(childNode2) - 2);
                    if (syntaxTree.sh(childNode3) == 8 || syntaxTree.sh(childNode3) == 17) {
                        Entity attrReferenceEntity = syntaxTree.getAttrReferenceEntity(childNode3);
                        if (!setOf.contains(attrReferenceEntity)) {
                            this.j6.codeCompleterCallback.Mr(attrReferenceEntity);
                            setOf.put(attrReferenceEntity);
                        }
                    }
                }
            }
            int childCount2 = syntaxTree.getChildCount(syntaxTree.getRootNode());
            for (int i2 = 0; i2 < childCount2; i2++) {
                int childNode4 = syntaxTree.getChildNode(syntaxTree.getRootNode(), i2);
                if (syntaxTree.getSyntaxTag(childNode4) == 226) {
                    int childNode5 = syntaxTree.getChildNode(childNode4, syntaxTree.getChildCount(childNode4) - 4);
                    if (syntaxTree.sh(childNode5) == 6) {
                        Namespace namespace = (Namespace) syntaxTree.getAttrReferenceEntity(childNode5);
                        u7(syntaxTree, namespace, namespace, setOf);
                    } else if (syntaxTree.sh(childNode5) == 8 || syntaxTree.sh(childNode5) == 17) {
                        MapOfInt<ClassType> mapOfIntIW = ((ClassType) syntaxTree.getAttrReferenceEntity(childNode5)).iW();
                        mapOfIntIW.DEFAULT_ITERATOR.DW();
                        while (mapOfIntIW.DEFAULT_ITERATOR.hasMoreElements()) {
                            ClassType classType = (ClassType) mapOfIntIW.DEFAULT_ITERATOR.nextValue();
                            if (!setOf.contains(classType)) {
                                this.j6.codeCompleterCallback.Mr(classType);
                                setOf.put(classType);
                            }
                        }
                    }
                }
            }
            SetOf<Namespace> setOfQq = this.FH.getRootNamespace().Qq();
            setOfQq.DEFAULT_ITERATOR.init();
            while (setOfQq.DEFAULT_ITERATOR.hasMoreElements()) {
                this.j6.codeCompleterCallback.Mr((Namespace) setOfQq.DEFAULT_ITERATOR.nextKey());
            }
            MapOfInt<ClassType> allClasstypes = this.FH.getAllClasstypes(syntaxTree.getFile(), this.v5);
            allClasstypes.DEFAULT_ITERATOR.DW();
            while (allClasstypes.DEFAULT_ITERATOR.hasMoreElements()) {
                ClassType classType2 = (ClassType) allClasstypes.DEFAULT_ITERATOR.nextValue();
                if (!setOf.contains(classType2)) {
                    if (lg(this.DW.getString(allClasstypes.DEFAULT_ITERATOR.Hw()))) {
                        this.j6.codeCompleterCallback.Ws(classType2);
                    }
                }
            }
        } catch (Throwable th) {
            if (gn) {
                iy.Mr(th, -552644572357280889L, this, syntaxTree, setOf);
            }
            throw th;
        }
    }

    @ey(method = 5059063080392566997L)
    private void XL(SyntaxTree syntaxTree, int i, int i2, int i3, SetOfInt setOfInt) {
        try {
            if (VH) {
                iy.J8(337412410787352625L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3), setOfInt);
            }
            int childCount = syntaxTree.getChildCount(i);
            for (int i4 = 0; i4 < childCount; i4++) {
                XL(syntaxTree, syntaxTree.getChildNode(i, i4), i2, i3, setOfInt);
            }
            if (syntaxTree.getSyntaxTag(i) != 1 || syntaxTree.sh(i) != 0 || setOfInt.contains(syntaxTree.getIdentifier(i)) || syntaxTree.isSyntheticNode(i) || syntaxTree.getStartLine(i) == i2) {
                return;
            }
            this.j6.codeCompleterCallback.DW(syntaxTree.getIdentifierString(i));
            setOfInt.put(syntaxTree.getIdentifier(i));
        } catch (Throwable th) {
            if (gn) {
                iy.lg(th, 337412410787352625L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3), setOfInt);
            }
            throw th;
        }
    }

    @ey(method = 2594694595484596188L)
    private void Zo() {
        try {
            if (VH) {
                iy.gn(4325720863520332500L, this);
            }
            this.j6.codeCompleterCallback.Zo("System.out.println(");
            this.j6.codeCompleterCallback.Zo("assert");
            this.j6.codeCompleterCallback.Zo("abstract");
            this.j6.codeCompleterCallback.Zo("boolean");
            this.j6.codeCompleterCallback.Zo("break");
            this.j6.codeCompleterCallback.Zo("byte");
            this.j6.codeCompleterCallback.Zo("case");
            this.j6.codeCompleterCallback.Zo("catch");
            this.j6.codeCompleterCallback.Zo("char");
            this.j6.codeCompleterCallback.Zo("class");
            this.j6.codeCompleterCallback.Zo("continue");
            this.j6.codeCompleterCallback.Zo("default");
            this.j6.codeCompleterCallback.Zo("do");
            this.j6.codeCompleterCallback.Zo("double");
            this.j6.codeCompleterCallback.Zo("else");
            this.j6.codeCompleterCallback.Zo("enum");
            this.j6.codeCompleterCallback.Zo("extends");
            this.j6.codeCompleterCallback.Zo("false");
            this.j6.codeCompleterCallback.Zo("final");
            this.j6.codeCompleterCallback.Zo("finally");
            this.j6.codeCompleterCallback.Zo("float");
            this.j6.codeCompleterCallback.Zo("for");
            this.j6.codeCompleterCallback.Zo("if");
            this.j6.codeCompleterCallback.Zo("import");
            this.j6.codeCompleterCallback.Zo("implements");
            this.j6.codeCompleterCallback.Zo("instanceof");
            this.j6.codeCompleterCallback.Zo("int");
            this.j6.codeCompleterCallback.Zo("interface");
            this.j6.codeCompleterCallback.Zo("long");
            this.j6.codeCompleterCallback.Zo("native");
            this.j6.codeCompleterCallback.Zo("new");
            this.j6.codeCompleterCallback.Zo("null");
            this.j6.codeCompleterCallback.Zo("package");
            this.j6.codeCompleterCallback.Zo("private");
            this.j6.codeCompleterCallback.Zo("protected");
            this.j6.codeCompleterCallback.Zo("public");
            this.j6.codeCompleterCallback.Zo("return");
            this.j6.codeCompleterCallback.Zo("short");
            this.j6.codeCompleterCallback.Zo("static");
            this.j6.codeCompleterCallback.Zo("strictfp");
            this.j6.codeCompleterCallback.Zo("super");
            this.j6.codeCompleterCallback.Zo("switch");
            this.j6.codeCompleterCallback.Zo("synchronized");
            this.j6.codeCompleterCallback.Zo("this");
            this.j6.codeCompleterCallback.Zo("throw");
            this.j6.codeCompleterCallback.Zo("throws");
            this.j6.codeCompleterCallback.Zo("transient");
            this.j6.codeCompleterCallback.Zo("true");
            this.j6.codeCompleterCallback.Zo("try");
            this.j6.codeCompleterCallback.Zo("void");
            this.j6.codeCompleterCallback.Zo("volatile");
            this.j6.codeCompleterCallback.Zo("while");
        } catch (Throwable th) {
            if (gn) {
                iy.aM(th, 4325720863520332500L, this);
            }
            throw th;
        }
    }

    @ey(method = -3384400074867552195L)
    private String a8(String str) {
        try {
            if (VH) {
                iy.tp(573757254066711561L, this, str);
            }
            int length = str.length() - 1;
            while (length >= 0 && Character.isJavaIdentifierPart(str.charAt(length))) {
                length--;
            }
            return length == str.length() + (-1) ? "" : str.substring(length + 1, str.length());
        } catch (Throwable th) {
            if (gn) {
                iy.j3(th, 573757254066711561L, this, str);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:164:0x030f  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v31, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v7, types: [int] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v0, types: [int] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v40, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @abcd.ey(method = 1306149496837401775L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void aM(com.aide.codemodel.api.SyntaxTree r19, int r20, int r21, int r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 817
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.x5.aM(com.aide.codemodel.api.SyntaxTree, int, int, int):void");
    }

    @ey(method = 445543915153212252L)
    private void gn(SyntaxTree syntaxTree, Namespace namespace, Namespace namespace2) {
        try {
            if (VH) {
                iy.we(-1735226706320852444L, this, syntaxTree, namespace, namespace2);
            }
            SetOf setOf = new SetOf(this.FH);
            MapOfInt<ClassType> mapOfIntCa = namespace.ca();
            mapOfIntCa.DEFAULT_ITERATOR.DW();
            while (mapOfIntCa.DEFAULT_ITERATOR.hasMoreElements()) {
                if (!setOf.contains(mapOfIntCa.DEFAULT_ITERATOR.nextValue())) {
                    ClassType classType = (ClassType) mapOfIntCa.DEFAULT_ITERATOR.nextValue();
                    setOf.put(classType);
                    if (classType.isReferable(syntaxTree.getFile(), syntaxTree.getLanguage())) {
                        this.j6.codeCompleterCallback.Mr(classType);
                    }
                }
            }
            SetOf<Namespace> setOfQq = namespace.Qq();
            setOfQq.DEFAULT_ITERATOR.init();
            while (setOfQq.DEFAULT_ITERATOR.hasMoreElements()) {
                this.j6.codeCompleterCallback.Mr(setOfQq.DEFAULT_ITERATOR.nextKey());
            }
        } catch (Throwable th) {
            if (gn) {
                iy.U2(th, -1735226706320852444L, this, syntaxTree, namespace, namespace2);
            }
            throw th;
        }
    }

    @ey(method = 5071689851531735325L)
    private int j3(FileEntry fileEntry, int i, int i2) {
        try {
            if (VH) {
                iy.we(-1482673804595095839L, this, fileEntry, new Integer(i), new Integer(i2));
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
            if (gn) {
                iy.U2(th, -1482673804595095839L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 151780009208218384L)
    private void j6(SyntaxTree syntaxTree, int i) {
        try {
            if (VH) {
                iy.EQ(196265625716101144L, this, syntaxTree, new Integer(i));
            }
            SetOfInt setOfInt = new SetOfInt();
            SetOfInt setOfInt2 = new SetOfInt();
            int parentNode = i;
            while (parentNode != syntaxTree.getRootNode()) {
                if (syntaxTree.getSyntaxTag(parentNode) == 122) {
                    try {
                        ClassType classtype = this.FH.getClasstype(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getDeclarationNumber(syntaxTree.getParentNode(parentNode)));
                        MapOfInt<Member> mapOfIntEU = classtype.eU();
                        mapOfIntEU.DEFAULT_ITERATOR.DW();
                        while (true) {
                            boolean z = true;
                            if (!mapOfIntEU.DEFAULT_ITERATOR.hasMoreElements()) {
                                break;
                            }
                            if (!setOfInt2.contains(mapOfIntEU.DEFAULT_ITERATOR.Hw())) {
                                Member member = (Member) mapOfIntEU.DEFAULT_ITERATOR.nextValue();
                                CodeCompleterCallback codeCompleterCallback = this.j6.codeCompleterCallback;
                                Type typeU9 = classtype.u9();
                                if (member.getEnclosingClassType() == classtype) {
                                    z = false;
                                }
                                codeCompleterCallback.XL(member, typeU9, z);
                                setOfInt2.put(mapOfIntEU.DEFAULT_ITERATOR.Hw());
                            }
                        }
                        MapOfInt<Member> mapOfIntE3 = classtype.e3();
                        mapOfIntE3.DEFAULT_ITERATOR.DW();
                        while (mapOfIntE3.DEFAULT_ITERATOR.hasMoreElements()) {
                            Member member2 = (Member) mapOfIntE3.DEFAULT_ITERATOR.nextValue();
                            if (!setOfInt.contains(mapOfIntE3.DEFAULT_ITERATOR.Hw()) && !member2.pN()) {
                                this.j6.codeCompleterCallback.XL(member2, classtype.u9(), member2.getEnclosingClassType() != classtype);
                            }
                        }
                        mapOfIntE3.DEFAULT_ITERATOR.DW();
                        while (mapOfIntE3.DEFAULT_ITERATOR.hasMoreElements()) {
                            setOfInt.put(mapOfIntE3.DEFAULT_ITERATOR.Hw());
                        }
                    } catch (e4 unused) {
                    }
                }
                parentNode = syntaxTree.getParentNode(parentNode);
            }
            EQ(syntaxTree);
        } catch (Throwable th) {
            if (gn) {
                iy.Mr(th, 196265625716101144L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -3159779081088343552L)
    private boolean lg(String str) {
        try {
            if (VH) {
                iy.tp(327992017619686464L, this, str);
            }
            if (str.length() == 0 || !Character.isJavaIdentifierStart(str.charAt(0))) {
                return false;
            }
            for (int i = 1; i < str.length(); i++) {
                if (!Character.isJavaIdentifierPart(str.charAt(i))) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (gn) {
                iy.j3(th, 327992017619686464L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -936826991706810952L)
    private void tp(SyntaxTree syntaxTree, int i, int i2, boolean z) {
        int i3;
        int i4;
        try {
            if (VH) {
                iy.J0(8217900085385004360L, this, syntaxTree, new Integer(i), new Integer(i2), new Boolean(z));
            }
            int iSy = syntaxTree.sy(i, i2, i, i2);
            int iMz = syntaxTree.Mz(i, i2, i, i2);
            int i5 = -1;
            if (iMz == -1) {
                iMz = iSy;
            }
            if (iMz != -1) {
                ((JavaCodeAnalyzer) syntaxTree.getLanguage().getCodeAnalyzer()).VH(syntaxTree, iMz);
            } else {
                ((JavaCodeAnalyzer) syntaxTree.getLanguage().getCodeAnalyzer()).Zo(syntaxTree);
            }
            SetOfInt setOfInt = new SetOfInt();
            int i6 = iMz;
            while (iMz != i5) {
                int i7 = 151;
                int i8 = 0;
                if (syntaxTree.getSyntaxTag(iMz) == 133) {
                    int childCount = syntaxTree.getChildCount(iMz);
                    int i9 = 0;
                    while (i9 < childCount) {
                        int childNode = syntaxTree.getChildNode(iMz, i9);
                        if (childNode == i6) {
                            break;
                        }
                        if (syntaxTree.getSyntaxTag(childNode) == i7) {
                            int childCount2 = syntaxTree.getChildCount(childNode);
                            int i10 = 3;
                            while (i10 < childCount2) {
                                int childNode2 = syntaxTree.getChildNode(syntaxTree.getChildNode(childNode, i10), i8);
                                int identifier = syntaxTree.getIdentifier(childNode2);
                                if (setOfInt.contains(identifier) || !syntaxTree.hasAttrType(childNode2)) {
                                    i3 = i6;
                                } else {
                                    i3 = i6;
                                    if (syntaxTree.getStartLine(childNode2) != i || syntaxTree.getStartColumn(childNode2) > i2 || syntaxTree.getEndColumn(childNode2) < i2) {
                                        i4 = childCount;
                                        this.j6.codeCompleterCallback.J0(new Variable(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getStartLine(childNode2), syntaxTree.getStartColumn(childNode2), syntaxTree.getEndColumn(childNode2), identifier, syntaxTree.getAttrType(childNode2)));
                                    }
                                    i10 += 2;
                                    i6 = i3;
                                    childCount = i4;
                                    i8 = 0;
                                }
                                i4 = childCount;
                                i10 += 2;
                                i6 = i3;
                                childCount = i4;
                                i8 = 0;
                            }
                        }
                        i9++;
                        i6 = i6;
                        childCount = childCount;
                        i7 = 151;
                        i8 = 0;
                    }
                } else {
                    int i11 = 16;
                    if (syntaxTree.getSyntaxTag(iMz) == 124) {
                        int childNode3 = syntaxTree.getChildNode(iMz, 5);
                        int childCount3 = syntaxTree.getChildCount(childNode3);
                        int i12 = 1;
                        while (i12 < childCount3 - 1) {
                            int childNode4 = syntaxTree.getChildNode(childNode3, i12);
                            if (syntaxTree.getSyntaxTag(childNode4) != i11) {
                                int childNode5 = syntaxTree.getChildNode(childNode4, 3);
                                int identifier2 = syntaxTree.getIdentifier(childNode5);
                                if (!setOfInt.contains(identifier2) && syntaxTree.hasAttrType(childNode5)) {
                                    this.j6.codeCompleterCallback.J0(new Variable(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getStartLine(childNode5), syntaxTree.getStartColumn(childNode5), syntaxTree.getEndColumn(childNode5), identifier2, syntaxTree.getAttrType(childNode5)));
                                }
                            }
                            i12 += 2;
                            i11 = 16;
                        }
                    } else if (syntaxTree.getSyntaxTag(iMz) == 123) {
                        int i13 = 3;
                        int childNode6 = syntaxTree.getChildNode(iMz, 3);
                        int childCount4 = syntaxTree.getChildCount(childNode6);
                        int i14 = 1;
                        while (i14 < childCount4 - 1) {
                            int childNode7 = syntaxTree.getChildNode(childNode6, i14);
                            int childNode8 = syntaxTree.getChildNode(childNode7, i13);
                            if (syntaxTree.getSyntaxTag(childNode7) != 16) {
                                int identifier3 = syntaxTree.getIdentifier(childNode8);
                                if (!setOfInt.contains(identifier3) && syntaxTree.hasAttrType(childNode8)) {
                                    this.j6.codeCompleterCallback.J0(new Variable(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getStartLine(childNode8), syntaxTree.getStartColumn(childNode8), syntaxTree.getEndColumn(childNode8), identifier3, syntaxTree.getAttrType(childNode8)));
                                }
                            }
                            i14 += 2;
                            i13 = 3;
                        }
                    } else if (syntaxTree.getSyntaxTag(iMz) == 204 && syntaxTree.getChildCount(iMz) == 7) {
                        int childNode9 = syntaxTree.getChildNode(iMz, 4);
                        int identifier4 = syntaxTree.getIdentifier(childNode9);
                        if (!setOfInt.contains(identifier4) && syntaxTree.hasAttrType(childNode9)) {
                            this.j6.codeCompleterCallback.J0(new Variable(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getStartLine(childNode9), syntaxTree.getStartColumn(childNode9), syntaxTree.getEndColumn(childNode9), identifier4, syntaxTree.getAttrType(childNode9)));
                        }
                    } else if (syntaxTree.getSyntaxTag(iMz) == 211) {
                        int childNode10 = syntaxTree.getChildNode(iMz, 5);
                        int identifier5 = syntaxTree.getIdentifier(childNode10);
                        if (!setOfInt.contains(identifier5) && syntaxTree.hasAttrType(childNode10)) {
                            this.j6.codeCompleterCallback.J0(new Variable(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getStartLine(childNode10), syntaxTree.getStartColumn(childNode10), syntaxTree.getEndColumn(childNode10), identifier5, syntaxTree.getAttrType(childNode10)));
                        }
                    } else if (syntaxTree.getSyntaxTag(iMz) == 149) {
                        int childNode11 = syntaxTree.getChildNode(syntaxTree.getChildNode(iMz, 2), 0);
                        if (syntaxTree.getSyntaxTag(childNode11) == 151) {
                            int childCount5 = syntaxTree.getChildCount(childNode11);
                            for (int i15 = 3; i15 < childCount5; i15 += 2) {
                                int childNode12 = syntaxTree.getChildNode(syntaxTree.getChildNode(childNode11, i15), 0);
                                int identifier6 = syntaxTree.getIdentifier(childNode12);
                                if (!setOfInt.contains(identifier6) && syntaxTree.hasAttrType(childNode12)) {
                                    this.j6.codeCompleterCallback.J0(new Variable(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getStartLine(childNode12), syntaxTree.getStartColumn(childNode12), syntaxTree.getEndColumn(childNode12), identifier6, syntaxTree.getAttrType(childNode12)));
                                }
                            }
                        }
                    }
                }
                int parentNode = syntaxTree.getParentNode(iMz);
                if (parentNode == syntaxTree.getRootNode()) {
                    i6 = iMz;
                    iMz = -1;
                    i5 = -1;
                } else {
                    i5 = -1;
                    i6 = iMz;
                    iMz = parentNode;
                }
            }
            if (z) {
                XL(syntaxTree, syntaxTree.getRootNode(), i, i2, new SetOfInt());
            }
            Zo();
            try {
                if (iSy == -1) {
                    Ws(syntaxTree, new SetOf<>(this.FH));
                    return;
                }
                ClassType classtype = this.FH.getClasstype(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getDeclarationNumber(syntaxTree.getParentNode(iSy)));
                if (syntaxTree.getBlockNodeAt(i, i2, i, i2) == -1) {
                    J0(syntaxTree, iSy);
                } else if (this.j6.codeCompleterCallback.VH(syntaxTree, classtype)) {
                    j6(syntaxTree, iSy);
                }
                if (this.j6.codeCompleterCallback.FH(syntaxTree, classtype)) {
                    VH(syntaxTree, classtype, iSy);
                }
            } catch (e4 unused) {
            }
        } catch (Throwable th) {
            if (gn) {
                iy.a8(th, 8217900085385004360L, this, syntaxTree, new Integer(i), new Integer(i2), new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 1347363305049198801L)
    private void u7(SyntaxTree syntaxTree, Namespace namespace, Namespace namespace2, SetOf<Entity> setOf) {
        try {
            if (VH) {
                iy.J0(2605093596217147133L, this, syntaxTree, namespace, namespace2, setOf);
            }
            MapOfInt<ClassType> mapOfIntCa = namespace.ca();
            mapOfIntCa.DEFAULT_ITERATOR.DW();
            while (mapOfIntCa.DEFAULT_ITERATOR.hasMoreElements()) {
                if (!setOf.contains(mapOfIntCa.DEFAULT_ITERATOR.nextValue())) {
                    ClassType classType = (ClassType) mapOfIntCa.DEFAULT_ITERATOR.nextValue();
                    setOf.put(classType);
                    if (classType.isReferable(syntaxTree.getFile(), syntaxTree.getLanguage())) {
                        this.j6.codeCompleterCallback.Mr(classType);
                    }
                }
            }
        } catch (Throwable th) {
            if (gn) {
                iy.a8(th, 2605093596217147133L, this, syntaxTree, namespace, namespace2, setOf);
            }
            throw th;
        }
    }

    @ey(method = 4137682364124817445L)
    private void v5(SyntaxTree syntaxTree, ClassType classType, Type type, ClassType classType2) {
        try {
            if (VH) {
                iy.J0(-2743905702996719415L, this, syntaxTree, classType, type, classType2);
            }
            MapOfInt<Member> mapOfIntEU = classType.eU();
            mapOfIntEU.DEFAULT_ITERATOR.DW();
            while (true) {
                boolean z = true;
                if (!mapOfIntEU.DEFAULT_ITERATOR.hasMoreElements()) {
                    break;
                }
                Member member = (Member) mapOfIntEU.DEFAULT_ITERATOR.nextValue();
                if (member.Nh(classType2, classType2) && !y1.aM(member.getModifiers())) {
                    CodeCompleterCallback codeCompleterCallback = this.j6.codeCompleterCallback;
                    if (member.getEnclosingClassType() == classType) {
                        z = false;
                    }
                    codeCompleterCallback.XL(member, type, z);
                }
            }
            MapOfInt<Member> mapOfIntE3 = classType.e3();
            mapOfIntE3.DEFAULT_ITERATOR.DW();
            while (mapOfIntE3.DEFAULT_ITERATOR.hasMoreElements()) {
                Member member2 = (Member) mapOfIntE3.DEFAULT_ITERATOR.nextValue();
                if (member2.Nh(classType2, classType2) && !member2.pN() && !y1.aM(member2.getModifiers())) {
                    this.j6.codeCompleterCallback.XL(member2, type, member2.getEnclosingClassType() != classType);
                }
            }
        } catch (Throwable th) {
            if (gn) {
                iy.a8(th, -2743905702996719415L, this, syntaxTree, classType, type, classType2);
            }
            throw th;
        }
    }

    @ey(method = 282553190439533076L)
    private void we(SyntaxTree syntaxTree, ClassType classType, Type type, ClassType classType2) {
        try {
            if (VH) {
                iy.J0(-1681924426792976996L, this, syntaxTree, classType, type, classType2);
            }
            MapOfInt<ClassType> mapOfIntIW = classType.iW();
            mapOfIntIW.DEFAULT_ITERATOR.DW();
            while (mapOfIntIW.DEFAULT_ITERATOR.hasMoreElements()) {
                ClassType classType3 = (ClassType) mapOfIntIW.DEFAULT_ITERATOR.nextValue();
                if (classType3.cc(classType2) && classType3.isReferable(syntaxTree.getFile(), syntaxTree.getLanguage())) {
                    this.j6.codeCompleterCallback.Mr(classType3);
                }
            }
            MapOfInt<Member> mapOfIntEU = classType.eU();
            mapOfIntEU.DEFAULT_ITERATOR.DW();
            while (true) {
                boolean z = true;
                if (!mapOfIntEU.DEFAULT_ITERATOR.hasMoreElements()) {
                    break;
                }
                Member member = (Member) mapOfIntEU.DEFAULT_ITERATOR.nextValue();
                if (y1.aM(member.getModifiers()) && member.Nh(classType2, classType2)) {
                    CodeCompleterCallback codeCompleterCallback = this.j6.codeCompleterCallback;
                    if (member.getEnclosingClassType() == classType) {
                        z = false;
                    }
                    codeCompleterCallback.XL(member, type, z);
                }
            }
            MapOfInt<Member> mapOfIntE3 = classType.e3();
            mapOfIntE3.DEFAULT_ITERATOR.DW();
            while (mapOfIntE3.DEFAULT_ITERATOR.hasMoreElements()) {
                Member member2 = (Member) mapOfIntE3.DEFAULT_ITERATOR.nextValue();
                if (y1.aM(member2.getModifiers()) && !member2.pN() && member2.Nh(classType2, classType2)) {
                    this.j6.codeCompleterCallback.XL(member2, type, member2.getEnclosingClassType() != classType);
                }
            }
        } catch (Throwable th) {
            if (gn) {
                iy.a8(th, -1681924426792976996L, this, syntaxTree, classType, type, classType2);
            }
            throw th;
        }
    }

    @ey(method = 2383459355666726395L)
    private void yS(SyntaxTree syntaxTree, int i, int i2) {
        try {
            if (VH) {
                iy.we(-2226953044364641137L, this, syntaxTree, new Integer(i), new Integer(i2));
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
                    String strA8 = a8(strSubstring);
                    if (this.Zo.contains(strA8)) {
                        return;
                    }
                    if (strA8.length() <= 0 || Character.isJavaIdentifierStart(strA8.charAt(0))) {
                        er(syntaxTree, i, i2);
                    }
                }
            }
        } catch (Throwable th) {
            if (gn) {
                iy.U2(th, -2226953044364641137L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -3945701215540617680L)
    public void P8(FileEntry fileEntry, int i, int i2) {
        try {
            if (VH) {
                iy.we(-658249666390688040L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            String strMr = fileEntry.Mr(i, i2);
            if (strMr.length() > 0) {
                char cCharAt = strMr.charAt(strMr.length() - 1);
                if (cCharAt == '(' || cCharAt == ',' || cCharAt == '=') {
                    vy(fileEntry, i, i2);
                }
            }
        } catch (Throwable th) {
            if (gn) {
                iy.U2(th, -658249666390688040L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -1307010716754233472L)
    public void SI(FileEntry fileEntry, int i, int i2, String str, int i3, int i4, boolean z) {
        try {
            if (VH) {
                iy.QX(1488858076288144480L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), str, new Integer(i3), new Integer(i4), new Boolean(z)});
            }
            if (i4 == -1) {
                BT(fileEntry, i, i2, str, i3);
                return;
            }
            if (str.length() < i3 - 1) {
                return;
            }
            for (int i5 = i4 - 1; i5 < str.length(); i5++) {
                if (!Character.isJavaIdentifierPart(str.charAt(i5))) {
                    if (i5 + 1 < i3) {
                        this.j6.codeCompleterCallback.QX(fileEntry);
                        BT(fileEntry, i, i2, str, i3);
                        return;
                    }
                    return;
                }
            }
        } catch (Throwable th) {
            if (gn) {
                iy.rN(th, 1488858076288144480L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), str, new Integer(i3), new Integer(i4), new Boolean(z)});
            }
            throw th;
        }
    }

    @ey(method = 1123641162735278560L)
    public void ei(FileEntry fileEntry, int i, int i2) {
        try {
            if (VH) {
                iy.we(-331655737564894704L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            this.j6.codeCompleterCallback.j6();
            SyntaxTree syntaxTree = this.Hw.getSyntaxTree(fileEntry, this.v5);
            int iSy = syntaxTree.sy(i, i2, i, i2);
            if (iSy != -1) {
                J0(syntaxTree, iSy);
            }
            this.j6.codeCompleterCallback.J8(fileEntry, this.v5, i, i2, j3(fileEntry, i, i2), true, false);
        } catch (Throwable th) {
            if (gn) {
                iy.U2(th, -331655737564894704L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -575898397310799283L)
    public void er(SyntaxTree syntaxTree, int i, int i2) {
        try {
            if (VH) {
                iy.we(422276539038190873L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            aM(syntaxTree, i, i2, j3(syntaxTree.getFile(), i, i2));
        } catch (Throwable th) {
            if (gn) {
                iy.U2(th, 422276539038190873L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 2085348430806327900L)
    public void gW(FileEntry fileEntry, int i, int i2, String str, int i3) {
        try {
            if (VH) {
                iy.J8(-53261972531565644L, this, fileEntry, new Integer(i), new Integer(i2), str, new Integer(i3));
            }
            aM(this.Hw.EQ(fileEntry, this.v5, i, i2, str, i3), i, i2 + i3, Mr(str, i3));
        } catch (Throwable th) {
            if (gn) {
                iy.lg(th, -53261972531565644L, this, fileEntry, new Integer(i), new Integer(i2), str, new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 1219837163743981468L)
    public void nw(SyntaxTree syntaxTree, int i, int i2, int i3, boolean z) {
        try {
            if (VH) {
                iy.J8(1770341562493276500L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z));
            }
            if (i3 == -1) {
                yS(syntaxTree, i, i2);
                return;
            }
            String strJ3 = syntaxTree.getFile().j3(i);
            int i4 = i2 - 1;
            if (strJ3.length() < i4) {
                return;
            }
            if (this.Zo.contains(a8(strJ3.substring(0, i4)))) {
                this.j6.codeCompleterCallback.QX(syntaxTree.getFile());
                return;
            }
            for (int i5 = i3 - 1; i5 < strJ3.length(); i5++) {
                if (!Character.isJavaIdentifierPart(strJ3.charAt(i5))) {
                    if (i5 + 1 < i2) {
                        this.j6.codeCompleterCallback.QX(syntaxTree.getFile());
                        yS(syntaxTree, i, i2);
                        return;
                    }
                    return;
                }
            }
        } catch (Throwable th) {
            if (gn) {
                iy.lg(th, 1770341562493276500L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -2848746814290832599L)
    public void rN(FileEntry fileEntry, int i, int i2) {
        try {
            if (VH) {
                iy.we(-1736538737400988203L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            this.j6.codeCompleterCallback.j6();
            MapOfInt<ClassType> allClasstypes = this.FH.getAllClasstypes(fileEntry, this.v5);
            allClasstypes.DEFAULT_ITERATOR.DW();
            while (allClasstypes.DEFAULT_ITERATOR.hasMoreElements()) {
                ClassType classType = (ClassType) allClasstypes.DEFAULT_ITERATOR.nextValue();
                if (lg(this.DW.getString(allClasstypes.DEFAULT_ITERATOR.Hw()))) {
                    this.j6.codeCompleterCallback.Mr(classType);
                }
            }
            this.j6.codeCompleterCallback.J8(fileEntry, this.v5, i, i2, j3(fileEntry, i, i2), false, true);
        } catch (Throwable th) {
            if (gn) {
                iy.U2(th, -1736538737400988203L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0186 A[Catch: all -> 0x02d7, TryCatch #1 {all -> 0x02d7, blocks: (B:3:0x0008, B:5:0x000c, B:6:0x0022, B:8:0x0037, B:10:0x003d, B:12:0x0045, B:14:0x004f, B:16:0x006e, B:17:0x00a2, B:18:0x00ab, B:20:0x00bc, B:22:0x00c3, B:24:0x00e2, B:25:0x0115, B:26:0x011e, B:27:0x0127, B:79:0x026c, B:83:0x0278, B:84:0x027d, B:86:0x0284, B:87:0x029a, B:89:0x02bd, B:90:0x02c9, B:82:0x0276, B:36:0x014e, B:38:0x0161, B:39:0x0164, B:41:0x0169, B:43:0x017d, B:44:0x0186, B:46:0x0196, B:47:0x019f, B:49:0x01a5, B:51:0x01b3, B:52:0x01d3, B:54:0x01db, B:58:0x01f5, B:62:0x0202, B:65:0x020c, B:70:0x022b, B:72:0x022f, B:73:0x023d, B:75:0x0243, B:76:0x024f, B:78:0x0259), top: B:102:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x022f A[Catch: all -> 0x02d7, TryCatch #1 {all -> 0x02d7, blocks: (B:3:0x0008, B:5:0x000c, B:6:0x0022, B:8:0x0037, B:10:0x003d, B:12:0x0045, B:14:0x004f, B:16:0x006e, B:17:0x00a2, B:18:0x00ab, B:20:0x00bc, B:22:0x00c3, B:24:0x00e2, B:25:0x0115, B:26:0x011e, B:27:0x0127, B:79:0x026c, B:83:0x0278, B:84:0x027d, B:86:0x0284, B:87:0x029a, B:89:0x02bd, B:90:0x02c9, B:82:0x0276, B:36:0x014e, B:38:0x0161, B:39:0x0164, B:41:0x0169, B:43:0x017d, B:44:0x0186, B:46:0x0196, B:47:0x019f, B:49:0x01a5, B:51:0x01b3, B:52:0x01d3, B:54:0x01db, B:58:0x01f5, B:62:0x0202, B:65:0x020c, B:70:0x022b, B:72:0x022f, B:73:0x023d, B:75:0x0243, B:76:0x024f, B:78:0x0259), top: B:102:0x0008 }] */
    @abcd.ey(method = -330857801611212800L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void vy(com.aide.codemodel.api.FileEntry r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.x5.vy(com.aide.codemodel.api.FileEntry, int, int):void");
    }
}
