package com.aide.codemodel.language.java;

import abcd.cy;
import abcd.dy;
import abcd.e4;
import abcd.ey;
import abcd.f0;
import abcd.fy;
import abcd.g3;
import abcd.gy;
import abcd.iy;
import abcd.j6;
import abcd.k6;
import abcd.y1;
import com.aide.codemodel.AIDEModel;
import com.aide.codemodel.api.ArrayType;
import com.aide.codemodel.api.ClassType;
import com.aide.codemodel.api.Entity;
import com.aide.codemodel.api.EntitySpace;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.FileSpace;
import com.aide.codemodel.api.IdentifierSpace;
import com.aide.codemodel.api.Member;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.Namespace;
import com.aide.codemodel.api.ParameterType;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.Type;
import com.aide.codemodel.api.abstraction.CodeModel;
import com.aide.codemodel.api.abstraction.Compiler;
import com.aide.codemodel.api.abstraction.DebuggerResourceProvider;
import com.aide.codemodel.api.collections.ListOfInt;
import com.aide.codemodel.api.collections.MapOf;
import com.aide.codemodel.api.collections.MapOfInt;
import com.aide.codemodel.api.collections.MapOfIntInt;
import com.aide.codemodel.api.collections.OrderedMapOfIntInt;
import com.aide.codemodel.api.collections.SetOf;
import com.aide.codemodel.api.collections.SetOfFileEntry;
import com.aide.uidesigner.ProxyTextView;
import com.probelytics.api.UserTouchAction;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

@cy(clazz = -32605687714546725L, container = -32605687714546725L, user = true)
/* loaded from: classes.dex */
public class JavaCompiler implements Compiler {

    @fy
    private static /* synthetic */ boolean kQ;

    @gy
    private static /* synthetic */ boolean yO;

    @dy(field = 1772435869779203300L)
    private MapOfIntInt BT;

    @dy(field = 3641033772501115155L)
    private final IdentifierSpace DW;

    @dy(field = -1539791081387819601L)
    private SetOf<Entity> EQ;

    @dy(field = 1367110766095719885L)
    private final FileSpace FH;

    @dy(field = 2626255669151280673L)
    private boolean I;

    @dy(field = -1101556606177468416L)
    private MapOfIntInt J0;

    @dy(field = -1865066103856027584L)
    private OrderedMapOfIntInt J8;

    @dy(field = -1082310171708215403L)
    private ListOfInt KD;

    @dy(field = -3935575991854722936L)
    private Type Mr;

    @dy(field = 4083179942029066488L)
    private boolean Mz;

    @dy(field = 4634416153557690892L)
    private int OW;

    @dy(field = -3050422631865260808L)
    private ListOfInt P8;

    @dy(field = -244337914738509728L)
    private int QX;

    @dy(field = 6755698193636537193L)
    private boolean Qq;

    @dy(field = 3080632186047769680L)
    private ListOfInt SI;

    @dy(field = -2268067683020171956L)
    private SetOf<Member> Sf;

    @dy(field = -299167264739575688L)
    private int U2;

    @dy(field = 3967230943080905377L)
    private j6 VH;

    @dy(field = 5534738274271421975L)
    private g3 Ws;

    @dy(field = -3106667573701812289L)
    private ClassType XL;

    @dy(field = 442632426140779457L)
    private char[] a8;

    @dy(field = -1476838198451924385L)
    private boolean aM;

    @dy(field = -7902610182617072067L)
    private boolean aj;

    @dy(field = -1399791735153414564L)
    private int br;

    @dy(field = -4061092711035763369L)
    private boolean ca;

    @dy(field = 6919227884643156121L)
    private SetOf<Member> cb;

    @dy(field = -3043452768720604416L)
    private MapOfIntInt cn;

    @dy(field = 5152699274498796864L)
    private String debuggerHostPackageName;

    @dy(field = -640157213769216695L)
    private SetOf<ClassType> dx;

    @dy(field = 5794790589932008000L)
    private int ef;

    @dy(field = -3496433321499471696L)
    private ListOfInt ei;

    @dy(field = -3019315453511601127L)
    private final EntitySpace entitySpace;

    @dy(field = 1413815704484494696L)
    private int er;

    @dy(field = 5959190453004519071L)
    private boolean g3;

    @dy(field = -2106870748104601985L)
    private int gW;

    @dy(field = 1186902167802196560L)
    private ListOfInt gn;

    @dy(field = -452433646995756808L)
    private boolean j3;

    @dy(field = -2667054714709598800L)
    private final JavaTypeSystem j6;

    @dy(field = -3228217261090780245L)
    private final JavaLanguage javaLanguage;

    @dy(field = 442645047450715808L)
    private char[] lg;

    @dy(field = -4500345074410573296L)
    private boolean lp;

    @dy(field = 3083113437000164480L)
    private final Model model;

    @dy(field = 672586860173550131L)
    private ListOfInt nw;

    @dy(field = 1413747594518460645L)
    private int rN;

    @dy(field = -736713455184500131L)
    private ListOfInt ro;

    @dy(field = 1633600035556814480L)
    private boolean sG;

    @dy(field = 4254945708996559104L)
    private SetOf<Member> sh;

    @dy(field = -880165889118121052L)
    private boolean sy;

    @dy(field = -1235040209152445472L)
    private MapOfIntInt tp;

    @dy(field = 1498745723950549089L)
    private SetOf<ClassType> u7;

    @dy(field = -3407815286412336085L)
    private boolean vJ;

    @dy(field = -5020208197242947820L)
    private MapOfIntInt vy;

    @dy(field = 3549624088959536889L)
    private MapOfIntInt we;

    @dy(field = -1214660775623809860L)
    private boolean x9;

    @dy(field = 385689864748785223L)
    private char[] yS;

    static {
        iy.Zo(JavaCompiler.class);
    }

    @ey(method = -193117507440804825L)
    public JavaCompiler(Model model, JavaLanguage javaLanguage) {
        try {
            if (kQ) {
                iy.EQ(763113948687199125L, null, model, javaLanguage);
            }
            this.gn = new ListOfInt();
            this.tp = new MapOfIntInt();
            this.we = new MapOfIntInt();
            this.J0 = new MapOfIntInt();
            this.J8 = new OrderedMapOfIntInt();
            this.Ws = new g3();
            this.a8 = new char[1000];
            this.lg = new char[1000];
            this.yS = new char[1000];
            this.BT = new MapOfIntInt();
            this.vy = new MapOfIntInt();
            this.P8 = new ListOfInt();
            this.ei = new ListOfInt();
            this.nw = new ListOfInt();
            this.SI = new ListOfInt();
            this.KD = new ListOfInt();
            this.ro = new ListOfInt();
            this.cn = new MapOfIntInt();
            this.DW = model.identifierSpace;
            this.FH = model.fileSpace;
            this.entitySpace = model.entitySpace;
            this.model = model;
            this.javaLanguage = javaLanguage;
            this.VH = new j6();
            this.j6 = javaLanguage.getTypeSystem();
            this.Sf = new SetOf<>(this.entitySpace);
            this.dx = new SetOf<>(this.entitySpace);
            this.u7 = new SetOf<>(this.entitySpace);
            this.EQ = new SetOf<>(this.entitySpace);
            this.sh = new SetOf<>(this.entitySpace);
            this.cb = new SetOf<>(this.entitySpace);
            this.debuggerHostPackageName = DebuggerResourceProvider.getDefProvider().getHostPackageName();
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, 763113948687199125L, null, model, javaLanguage);
            }
            throw th;
        }
    }

    @ey(method = 268024351360194933L)
    private void AE(SyntaxTree syntaxTree, int i, int i2, Type type) {
        try {
            if (kQ) {
                iy.J0(1717276926074845600L, this, syntaxTree, new Integer(i), new Integer(i2), type);
            }
        } catch (Throwable th) {
            if (yO) {
                iy.a8(th, 1717276926074845600L, this, syntaxTree, new Integer(i), new Integer(i2), type);
            }
            throw th;
        }
    }

    @ey(method = 3394888383224729565L)
    private void AL(SyntaxTree syntaxTree, int i, int i2) {
        try {
            if (kQ) {
                iy.we(-2540778171510102368L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (yO) {
                iy.U2(th, -2540778171510102368L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -4399957853757504675L)
    private void AR(Entity entity) {
        try {
            if (kQ) {
                iy.tp(250199794883656672L, this, entity);
            }
            while (true) {
                int iN0 = N0(entity, this.a8, 0);
                this.rN = iN0;
                if (iN0 != -1) {
                    return;
                } else {
                    this.a8 = new char[(this.a8.length * 2) + 1];
                }
            }
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, 250199794883656672L, this, entity);
            }
            throw th;
        }
    }

    @ey(method = 2159626585346597016L)
    private boolean Ak(ClassType classType) {
        try {
            if (kQ) {
                iy.tp(-1436635327923882625L, this, classType);
            }
            int i = this.model.identifierSpace.get("BroadcastReceiver");
            SetOf<ClassType> setOfFN = classType.fN();
            setOfFN.DEFAULT_ITERATOR.init();
            while (setOfFN.DEFAULT_ITERATOR.hasMoreElements()) {
                ClassType classType2 = (ClassType) setOfFN.DEFAULT_ITERATOR.nextKey();
                if (classType2.getIdentifier() == i && classType2.getNamespace().getFullyQualifiedNameString().equals("android.content")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, -1436635327923882625L, this, classType);
            }
            throw th;
        }
    }

    @ey(method = -857195507728183368L)
    private void An(int i, Type type, boolean z) {
        try {
            if (kQ) {
                iy.we(4376291598364023051L, this, new Integer(i), type, new Boolean(z));
            }
            int semantic = type.getSemantic();
            if (semantic != 3 && semantic != 5 && semantic != 7) {
                if (semantic == 9) {
                    if (!z) {
                        this.VH.hK();
                    }
                    this.VH.BN(i);
                    return;
                }
                switch (semantic) {
                    case 11:
                        if (!z) {
                            this.VH.w9();
                        }
                        this.VH.DY(i);
                        return;
                    case 12:
                        break;
                    case 13:
                        if (!z) {
                            this.VH.w9();
                        }
                        this.VH.oy(i);
                        return;
                    case 14:
                        if (!z) {
                            this.VH.hK();
                        }
                        this.VH.zh(i);
                        return;
                    default:
                        if (!z) {
                            this.VH.w9();
                        }
                        this.VH.XG(i);
                        return;
                }
            }
            if (!z) {
                this.VH.w9();
            }
            this.VH.DY(i);
        } catch (Throwable th) {
            if (yO) {
                iy.U2(th, 4376291598364023051L, this, new Integer(i), type, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 2864441829469278804L)
    private void BR(SyntaxTree syntaxTree, int i) {
        try {
            if (kQ) {
                iy.EQ(872527190064128385L, this, syntaxTree, new Integer(i));
            }
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, 872527190064128385L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -3099182789436772641L)
    private void BT(boolean z, boolean z2, SyntaxTree syntaxTree, int i) {
        try {
            if (kQ) {
                iy.J0(-631425538285251352L, this, new Boolean(z), new Boolean(z2), syntaxTree, new Integer(i));
            }
            OutputStream outputStreamEi = this.model.j3.ei(this.XL, Hl(this.XL) + ".class", GT(this.XL), z, z2);
            if (outputStreamEi != null) {
                int iE4 = E4(this.XL, false);
                if ((iE4 & 4) != 0) {
                    iE4 = (iE4 & (-5)) | 1;
                }
                if (this.XL.isEnumType()) {
                    MapOfInt<Member> mapOfIntE3 = this.XL.e3();
                    mapOfIntE3.DEFAULT_ITERATOR.DW();
                    while (mapOfIntE3.DEFAULT_ITERATOR.hasMoreElements()) {
                        Member member = (Member) mapOfIntE3.DEFAULT_ITERATOR.nextValue();
                        if (y1.j6(member.getModifiers()) && member.getEnclosingClassType() == this.XL) {
                            iE4 |= 1024;
                        }
                    }
                }
                oa(this.XL, false);
                this.VH.j6(syntaxTree.getFile().getFullNameString(), iE4, this.a8, 0, this.rN, GT(this.XL), this.br, this.OW);
                if (tj(this.XL)) {
                    Bx(this.XL);
                    this.VH.DW(this.a8, 0, this.rN);
                }
                this.dx.clear();
                Eq(this.XL);
                P8(syntaxTree, i);
                this.vy.clear();
                this.BT.clear();
                this.P8.clear();
                this.ei.clear();
                this.SI.clear();
                this.KD.clear();
                this.ro.clear();
                this.cn.clear();
                vy(syntaxTree, syntaxTree.getChildNode(i, syntaxTree.getChildCount(i) - 1));
                this.VH.oC();
                J8(syntaxTree, syntaxTree.getChildNode(i, 0));
                if (RW()) {
                    return;
                }
                this.VH.oP(outputStreamEi);
                outputStreamEi.close();
            }
        } catch (Throwable th) {
            if (yO) {
                iy.a8(th, -631425538285251352L, this, new Boolean(z), new Boolean(z2), syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 3074336314251108347L)
    private void Bx(ClassType classType) {
        try {
            if (kQ) {
                iy.tp(-5881399232853588288L, this, classType);
            }
            while (true) {
                int iST = sT(classType, this.a8, 0);
                this.rN = iST;
                if (iST != -1) {
                    return;
                } else {
                    this.a8 = new char[(this.a8.length * 2) + 1];
                }
            }
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, -5881399232853588288L, this, classType);
            }
            throw th;
        }
    }

    @ey(method = 207021868727719892L)
    private void CU(SyntaxTree syntaxTree, Type type, Type type2) {
        try {
            if (kQ) {
                iy.we(-7601536018229196615L, this, syntaxTree, type, type2);
            }
            if (!type.isParameterType() && !type.isMethodParameterType()) {
                if (!type.isArrayType()) {
                    return;
                }
                if (!((ArrayType) type).FN().isParameterType() && !((ArrayType) type).FN().isMethodParameterType()) {
                    return;
                }
            }
            if (type2 == this.j6.Eq(syntaxTree.getFile()) || type2.getSemantic() == 2 || type2.isMethodParameterTypeVariable()) {
                return;
            }
            oa(type2, false);
            this.VH.hz(this.a8, 0, this.rN);
        } catch (Throwable th) {
            if (yO) {
                iy.U2(th, -7601536018229196615L, this, syntaxTree, type, type2);
            }
            throw th;
        }
    }

    @ey(method = 3553853129024527133L)
    private void Cz(SyntaxTree syntaxTree, Type type) {
        try {
            if (kQ) {
                iy.EQ(720544036825635264L, this, syntaxTree, type);
            }
            int semantic = type.getSemantic();
            if (semantic == 3 || semantic == 5 || semantic == 7) {
                this.VH.oT("java/lang/StringBuffer", "append", "(I)Ljava/lang/StringBuffer;");
                return;
            }
            if (semantic == 9) {
                this.VH.oT("java/lang/StringBuffer", "append", "(J)Ljava/lang/StringBuffer;");
                return;
            }
            switch (semantic) {
                case 11:
                    this.VH.oT("java/lang/StringBuffer", "append", "(Z)Ljava/lang/StringBuffer;");
                    return;
                case 12:
                    this.VH.oT("java/lang/StringBuffer", "append", "(C)Ljava/lang/StringBuffer;");
                    return;
                case 13:
                    this.VH.oT("java/lang/StringBuffer", "append", "(F)Ljava/lang/StringBuffer;");
                    return;
                case 14:
                    this.VH.oT("java/lang/StringBuffer", "append", "(D)Ljava/lang/StringBuffer;");
                    return;
                default:
                    if (type == this.j6.oY(syntaxTree.getFile())) {
                        this.VH.oT("java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;");
                        return;
                    } else {
                        this.VH.oT("java/lang/StringBuffer", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuffer;");
                        return;
                    }
            }
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, 720544036825635264L, this, syntaxTree, type);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.String] */
    @ey(method = -1005045125156550345L)
    private String DY(FileEntry fileEntry) {
        try {
            if (kQ) {
                iy.tp(-1045557151117617576L, this, fileEntry);
            }
            MapOf<ClassType, Namespace> toplevelClasstypesOfFile = this.model.entitySpace.getToplevelClasstypesOfFile(fileEntry);
            if (toplevelClasstypesOfFile.Mr() <= 0) {
                return "";
            }
            fileEntry = ((ClassType) toplevelClasstypesOfFile.tp()).getNamespace().getFullyQualifiedNameString().replace('.', '/') + "/" + fileEntry.getFullNameString();
            return fileEntry;
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, -1045557151117617576L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = 4702883770125561600L)
    private int E4(Entity entity, boolean z) {
        try {
            if (kQ) {
                iy.EQ(860981512256877473L, this, entity, new Boolean(z));
            }
            int modifiers = entity.isClassType() ? ((ClassType) entity).getModifiers() : 0;
            if (entity.isMember()) {
                modifiers = ((Member) entity).getModifiers();
            }
            int i = y1.J8(modifiers) ? 1 : 0;
            if (z && y1.gn(modifiers)) {
                i |= 2;
            }
            if (y1.J0(modifiers)) {
                i |= 4;
            }
            if (z && y1.aM(modifiers)) {
                i |= 8;
            }
            if (y1.XL(modifiers)) {
                i |= 16;
            }
            if (y1.Hw(modifiers)) {
                i |= 16;
            }
            if (y1.Ws(modifiers)) {
                i |= 16;
            }
            if (y1.j6(modifiers)) {
                i |= 1024;
            }
            if (y1.Zo(modifiers)) {
                i |= 256;
            }
            if ((modifiers & 2048) != 0) {
                i |= 32;
            }
            if ((modifiers & 4096) != 0) {
                i |= 128;
            }
            if ((modifiers & 1024) != 0) {
                i |= 64;
            }
            if ((modifiers & 8192) != 0) {
                i |= 2048;
            }
            if (entity.isType()) {
                i = ((Type) entity).isInterfaceType() ? i | 512 : i | 32;
            }
            if (!this.ca) {
                return i;
            }
            if (entity.isType() && ((Type) entity).isEnumType()) {
                i |= 16384;
            }
            return entity.isType() ? this.j6.qp((Type) entity) ? i | 8192 : i : i;
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, 860981512256877473L, this, entity, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -3967747148940724913L)
    private void EQ(SyntaxTree syntaxTree, int i) {
        try {
            if (kQ) {
                iy.EQ(-2829253090822620000L, this, syntaxTree, new Integer(i));
            }
            this.VH.HE(syntaxTree.getFile().getId());
            this.VH.BJ(GT(this.XL));
            this.VH.iK("adrt/ADRT", "onClassLoad", "(JLjava/lang/String;)V");
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, -2829253090822620000L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 4298925485694540540L)
    private String Ej(Member member) {
        try {
            if (kQ) {
                iy.tp(2225688106275976935L, this, member);
            }
            if (member.ro()) {
                return "access$S" + member.DW();
            }
            return "access$S" + x6(member.getEnclosingClassType().getFullyQualifiedNameString()) + "$" + member.DW();
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, 2225688106275976935L, this, member);
            }
            throw th;
        }
    }

    @ey(method = 534665386156530909L)
    private void Eq(Type type) {
        Type typeFN = type;
        try {
            if (kQ) {
                iy.tp(-36227107989627904L, this, typeFN);
            }
            if (type.isArrayType()) {
                typeFN = ((ArrayType) typeFN).FN();
            }
            if (!typeFN.isClassType() || ((ClassType) typeFN).isToplevel() || this.dx.contains(typeFN)) {
                return;
            }
            this.dx.put((ClassType) typeFN);
            oa(typeFN, false);
            qP(typeFN.getEnclosingClassType(), false);
            int iPn = pn(typeFN.getIdentifier(), typeFN);
            int iE4 = E4(typeFN, true);
            b1(iPn);
            this.VH.vy(this.a8, 0, this.rN, this.lg, 0, this.er, this.yS, 0, this.gW, iE4);
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, -36227107989627904L, this, typeFN);
            }
            throw th;
        }
    }

    @ey(method = 1989238962486790476L)
    private void Ev(SyntaxTree syntaxTree, int i, Member member) {
        try {
            if (kQ) {
                iy.we(-3806447739258220561L, this, syntaxTree, new Integer(i), member);
            }
        } catch (Throwable th) {
            if (yO) {
                iy.U2(th, -3806447739258220561L, this, syntaxTree, new Integer(i), member);
            }
            throw th;
        }
    }

    @ey(method = -1551529605476619744L)
    private void FH(Member member) {
        try {
            if (kQ) {
                iy.tp(-1511825912709645885L, this, member);
            }
            SetOf<Member> setOfJO = member.jO();
            setOfJO.DEFAULT_ITERATOR.init();
            while (setOfJO.DEFAULT_ITERATOR.hasMoreElements()) {
                Member member2 = (Member) setOfJO.DEFAULT_ITERATOR.nextKey();
                try {
                    if (!ba(member2, member)) {
                        this.sh.put(member2);
                    }
                    if (member2.getEnclosingClassType().isInterfaceType()) {
                        FH(member2);
                    }
                } catch (e4 unused) {
                }
            }
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, -1511825912709645885L, this, member);
            }
            throw th;
        }
    }

    @ey(method = -5332147414626412988L)
    private void FN(SyntaxTree syntaxTree, int i) {
        int i2;
        boolean z;
        try {
            if (kQ) {
                iy.EQ(3240202347602344475L, this, syntaxTree, new Integer(i));
            }
            Member memberJw = this.entitySpace.jw(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getDeclarationNumber(i));
            this.Mr = memberJw.WB();
            this.U2 = syntaxTree.getAttrVariableSlot(i);
            oa(memberJw, false);
            int iE4 = E4(memberJw, true);
            if ((this.XL.getModifiers() & 8192) != 0) {
                iE4 |= 2048;
            }
            int iPn = pn(memberJw.getIdentifier(), memberJw);
            if (!memberJw.Z1()) {
                i2 = iE4;
                z = false;
            } else if (this.ca) {
                iE4 |= 128;
                i2 = iE4;
                z = false;
            } else {
                i2 = iE4;
                z = true;
            }
            b1(iPn);
            this.VH.I(i2, this.yS, 0, this.gW, this.a8, 0, this.rN, false, z, syntaxTree.getSyntaxTag(syntaxTree.getChildNode(i, 8)) == 133);
            if (tj(memberJw)) {
                AR(memberJw);
                this.VH.Qq(this.a8, 0, this.rN);
            }
            jw(syntaxTree, memberJw);
            J8(syntaxTree, syntaxTree.getChildNode(i, 0));
            if (syntaxTree.getSyntaxTag(syntaxTree.getChildNode(i, 8)) == 133) {
                if (this.g3) {
                    tp(memberJw);
                }
                if (!this.g3 && !this.Sf.contains(memberJw)) {
                    we(memberJw);
                    e9();
                    oa(this.XL, false);
                    this.VH.a5(this.a8, 0, this.rN, PH(memberJw), "Z");
                    int iCN = this.VH.CN();
                    this.VH.Of(iCN, false);
                    if (!memberJw.gG()) {
                        this.VH.XX(0);
                    }
                    int iOY = memberJw.oY();
                    int i3 = !memberJw.gG() ? 1 : 0;
                    for (int i4 = 0; i4 < iOY; i4++) {
                        Type typeQp = memberJw.qp(i4);
                        Za(i3, typeQp);
                        int semantic = typeQp.getSemantic();
                        i3 = (semantic == 9 || semantic == 14) ? i3 + 2 : i3 + 1;
                    }
                    if (memberJw.gG()) {
                        oa(memberJw, false);
                    } else {
                        this.er = 0;
                        char[] cArr = this.lg;
                        this.er = 0 + 1;
                        cArr[0] = '(';
                        VH(this.XL, true);
                        this.rN = this.er - 1;
                        Zo(memberJw, false);
                        System.arraycopy(this.lg, 0, this.a8, 0, this.er);
                    }
                    PT(this.XL);
                    this.VH.sv(this.lg, 0, this.er, xg(memberJw), this.a8, 0, this.rN);
                    sE(this.Mr);
                    this.VH.sy(iCN);
                }
                this.QX = this.VH.CN();
                if (!memberJw.gG()) {
                    QO();
                }
                eU(syntaxTree, syntaxTree.getChildNode(i, 5), true, memberJw);
                a5(memberJw);
                sg(syntaxTree, syntaxTree.getChildNode(i, 8));
                this.VH.sy(this.QX);
                if (this.Mr.getSemantic() == 1) {
                    this.VH.IM();
                } else {
                    this.VH.gG();
                }
                if (!this.g3 && !this.Sf.contains(memberJw)) {
                    hz();
                }
            } else {
                eU(syntaxTree, syntaxTree.getChildNode(i, 5), false, memberJw);
            }
            if (syntaxTree.getSyntaxTag(syntaxTree.getChildNode(i, 8)) == 232) {
                vJ(syntaxTree, syntaxTree.getChildNode(syntaxTree.getChildNode(i, 8), 1), this.Mr);
            }
            if (this.EQ.contains(memberJw)) {
                jO(syntaxTree, memberJw.getEnclosingClassType(), memberJw, false);
            }
            ko(syntaxTree, memberJw, Lz(memberJw));
            syntaxTree.getSyntaxTag(syntaxTree.getChildNode(i, 8));
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, 3240202347602344475L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -4889936010063820072L)
    private String Fd(int i) {
        try {
            if (kQ) {
                iy.u7(2851002001471717733L, this, i);
            }
            return "block$" + i;
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, 2851002001471717733L, this, new Integer(i));
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x016d A[Catch: all -> 0x02a2, TryCatch #4 {all -> 0x02a2, blocks: (B:2:0x0000, B:4:0x0004, B:5:0x0019, B:7:0x0021, B:11:0x002a, B:14:0x002e, B:16:0x0032, B:18:0x0038, B:20:0x0044, B:22:0x004a, B:30:0x0065, B:32:0x006b, B:34:0x0077, B:36:0x007d, B:38:0x0089, B:40:0x0091, B:43:0x009a, B:46:0x00a8, B:49:0x00ac, B:54:0x00b9, B:58:0x00ca, B:60:0x00d1, B:62:0x00d6, B:70:0x00e7, B:73:0x00ed, B:75:0x00f1, B:77:0x00fd, B:92:0x0122, B:100:0x012f, B:102:0x0133, B:104:0x013f, B:116:0x015d, B:123:0x0167, B:125:0x016d, B:127:0x017d, B:164:0x0200, B:130:0x0186, B:133:0x018d, B:140:0x019e, B:143:0x01a9, B:158:0x01ea, B:171:0x020a, B:173:0x0210, B:175:0x0219, B:187:0x0246, B:189:0x024c, B:192:0x0257, B:193:0x025a, B:206:0x0286, B:208:0x028c, B:210:0x0295), top: B:226:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019e A[Catch: all -> 0x02a2, TRY_ENTER, TryCatch #4 {all -> 0x02a2, blocks: (B:2:0x0000, B:4:0x0004, B:5:0x0019, B:7:0x0021, B:11:0x002a, B:14:0x002e, B:16:0x0032, B:18:0x0038, B:20:0x0044, B:22:0x004a, B:30:0x0065, B:32:0x006b, B:34:0x0077, B:36:0x007d, B:38:0x0089, B:40:0x0091, B:43:0x009a, B:46:0x00a8, B:49:0x00ac, B:54:0x00b9, B:58:0x00ca, B:60:0x00d1, B:62:0x00d6, B:70:0x00e7, B:73:0x00ed, B:75:0x00f1, B:77:0x00fd, B:92:0x0122, B:100:0x012f, B:102:0x0133, B:104:0x013f, B:116:0x015d, B:123:0x0167, B:125:0x016d, B:127:0x017d, B:164:0x0200, B:130:0x0186, B:133:0x018d, B:140:0x019e, B:143:0x01a9, B:158:0x01ea, B:171:0x020a, B:173:0x0210, B:175:0x0219, B:187:0x0246, B:189:0x024c, B:192:0x0257, B:193:0x025a, B:206:0x0286, B:208:0x028c, B:210:0x0295), top: B:226:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:236:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r12v52 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.aide.codemodel.language.java.JavaCompiler, java.lang.Object] */
    @abcd.ey(method = 2347260329808912960L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int GK(com.aide.codemodel.api.Entity r10, char[] r11, int r12, boolean r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 705
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.java.JavaCompiler.GK(com.aide.codemodel.api.Entity, char[], int, boolean):int");
    }

    @ey(method = -943177676243148192L)
    private void Gj(SyntaxTree syntaxTree, int i) {
        try {
            if (kQ) {
                iy.EQ(-52295989031645023L, this, syntaxTree, new Integer(i));
            }
            boolean z = (this.g3 || this.XL.isInterfaceType()) ? false : true;
            if (this.u7.contains(this.XL)) {
                z = true;
                break loop0;
            }
            int childCount = syntaxTree.getChildCount(i);
            loop0: for (int i2 = 0; i2 < childCount; i2++) {
                int childNode = syntaxTree.getChildNode(i, i2);
                if (syntaxTree.getSyntaxTag(childNode) != 126) {
                    if (syntaxTree.getSyntaxTag(childNode) == 127 && syntaxTree.getChildCount(syntaxTree.getChildNode(childNode, 0)) != 0) {
                        z = true;
                        break loop0;
                    }
                } else {
                    int childCount2 = syntaxTree.getChildCount(childNode);
                    for (int i3 = 3; i3 < childCount2; i3 += 2) {
                        int childNode2 = syntaxTree.getChildNode(childNode, i3);
                        if (syntaxTree.getChildCount(childNode2) > 2) {
                            Member memberJw = this.entitySpace.jw(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getDeclarationNumber(childNode2));
                            if (memberJw.gG() && !memberJw.w9() && !memberJw.q7()) {
                                z = true;
                                break loop0;
                            }
                        }
                    }
                }
            }
            if (z) {
                this.VH.Mz(24, "<clinit>", "()V".toCharArray(), 0, 3, false, false, true);
                if (!this.g3 && !this.XL.isInterfaceType()) {
                    EQ(syntaxTree, i);
                }
                if (this.u7.contains(this.XL)) {
                    ei(this.XL, 0);
                    this.VH.oT("java/lang/Class", "desiredAssertionStatus", "()Z");
                    int iCN = this.VH.CN();
                    int iCN2 = this.VH.CN();
                    this.VH.Of(iCN, true);
                    this.VH.qP(1);
                    this.VH.IS(iCN2);
                    this.VH.sy(iCN);
                    this.VH.qP(0);
                    this.VH.sy(iCN2);
                    oa(this.XL, false);
                    this.VH.N2(new String(this.a8, 0, this.rN), TI(), "Z");
                }
                this.VH.CN();
                IS(syntaxTree, i);
                this.VH.IM();
            }
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, -52295989031645023L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -4451366402282938471L)
    private boolean HO(Entity entity) {
        try {
            if (kQ) {
                iy.tp(4261675299197728660L, this, entity);
            }
            if (entity.getFile() == null || !this.model.fileSpace.ca(entity.getFile()) || y1.Zo(entity.getModifiers())) {
                return false;
            }
            if (entity.ro()) {
                return true;
            }
            if (entity.isMember() && ((Member) entity).e9()) {
                return false;
            }
            for (ClassType enclosingClassType = entity.isClassType() ? (ClassType) entity : entity.getEnclosingClassType(); !enclosingClassType.isToplevel(); enclosingClassType = enclosingClassType.getEnclosingClassType()) {
                if (enclosingClassType.ro()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, 4261675299197728660L, this, entity);
            }
            throw th;
        }
    }

    @ey(method = 1422789253104541653L)
    private boolean HT(Member member, ClassType classType) {
        try {
            if (kQ) {
                iy.EQ(284058434759674592L, this, member, classType);
            }
            if (member.ro()) {
                if (member.getEnclosingClassType() != classType) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, 284058434759674592L, this, member, classType);
            }
            throw th;
        }
    }

    @ey(method = 619056112785315968L)
    private String Hl(ClassType classType) {
        try {
            if (kQ) {
                iy.tp(-310292972585607165L, this, classType);
            }
            if (classType.isToplevel()) {
                return this.DW.getString(classType.getIdentifier());
            }
            if (!classType.GK()) {
                return Hl(classType.getEnclosingClassType()) + '$' + this.DW.getString(pn(classType.getIdentifier(), classType));
            }
            return Hl(classType.getEnclosingClassType()) + '$' + classType.DW() + "$" + this.DW.getString(pn(classType.getIdentifier(), classType));
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, -310292972585607165L, this, classType);
            }
            throw th;
        }
    }

    @ey(method = 1146115336617914289L)
    private void Hw(SyntaxTree syntaxTree) {
        try {
            if (kQ) {
                iy.tp(-6985276320220507740L, this, syntaxTree);
            }
            this.Sf.clear();
            this.gn.clear();
            this.EQ.clear();
            this.we.clear();
            this.J0.clear();
            this.J8.clear();
            this.tp.clear();
            this.XL = null;
            this.Ws.j6();
            this.u7.clear();
            v5(syntaxTree, syntaxTree.getRootNode());
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, -6985276320220507740L, this, syntaxTree);
            }
            throw th;
        }
    }

    @ey(method = 472604197862361184L)
    private void I() {
        try {
            if (kQ) {
                iy.gn(5078587207672293507L, this);
            }
            this.VH.XX(0);
            ClassType enclosingClassType = this.XL.getEnclosingClassType();
            oa(this.XL, false);
            qP(enclosingClassType, true);
            this.VH.e9(this.a8, 0, this.rN, wE(), this.lg, 0, this.er);
        } catch (Throwable th) {
            if (yO) {
                iy.aM(th, 5078587207672293507L, this);
            }
            throw th;
        }
    }

    @ey(method = 208797436759281213L)
    private void IS(SyntaxTree syntaxTree, int i) {
        try {
            if (kQ) {
                iy.EQ(203098966068857056L, this, syntaxTree, new Integer(i));
            }
            int childCount = syntaxTree.getChildCount(i);
            for (int i2 = 0; i2 < childCount; i2++) {
                int childNode = syntaxTree.getChildNode(i, i2);
                if (syntaxTree.getSyntaxTag(childNode) == 126) {
                    int childCount2 = syntaxTree.getChildCount(childNode);
                    for (int i3 = 3; i3 < childCount2; i3 += 2) {
                        int childNode2 = syntaxTree.getChildNode(childNode, i3);
                        if (syntaxTree.getChildCount(childNode2) > 2) {
                            Member memberJw = this.entitySpace.jw(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getDeclarationNumber(childNode2));
                            if (memberJw.gG() && !memberJw.w9() && !memberJw.q7()) {
                                int childNode3 = syntaxTree.getChildNode(childNode2, 3);
                                Type typeWB = memberJw.WB();
                                if (syntaxTree.getSyntaxTag(childNode3) == 196) {
                                    aM(syntaxTree, childNode3, typeWB);
                                } else {
                                    sy(syntaxTree, childNode3, false);
                                    dx(syntaxTree, syntaxTree.getAttrType(childNode3), typeWB);
                                }
                                wc(syntaxTree, memberJw, null, true);
                            }
                        }
                    }
                } else if (syntaxTree.getSyntaxTag(childNode) == 127 && syntaxTree.getChildCount(syntaxTree.getChildNode(childNode, 0)) != 0) {
                    sg(syntaxTree, syntaxTree.getChildNode(childNode, 1));
                }
            }
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, 203098966068857056L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -239239771251618176L)
    private void J0(SyntaxTree syntaxTree, int i) {
        try {
            if (kQ) {
                iy.EQ(-7181475081350652225L, this, syntaxTree, new Integer(i));
            }
            oa(syntaxTree.getAttrType(syntaxTree.getChildNode(i, 1)), true);
            int childCount = syntaxTree.getChildCount(i);
            this.VH.vJ(this.a8, 0, this.rN, (childCount - 3) / 4);
            if (childCount >= 5) {
                for (int i2 = 3; i2 < childCount; i2 += 4) {
                    int childNode = syntaxTree.getChildNode(i, i2);
                    int identifier = syntaxTree.getIdentifier(childNode);
                    int childNode2 = syntaxTree.getChildNode(i, i2 + 2);
                    if (syntaxTree.sh(childNode) == 20) {
                        Type typeWB = ((Member) syntaxTree.getAttrReferenceEntity(childNode)).WB();
                        b1(identifier);
                        this.VH.KD(this.yS, 0, this.gW);
                        a8(syntaxTree, childNode2, typeWB);
                    }
                }
            }
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, -7181475081350652225L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -1128385683735498735L)
    private void J8(SyntaxTree syntaxTree, int i) {
        try {
            if (kQ) {
                iy.EQ(-203897786167412620L, this, syntaxTree, new Integer(i));
            }
            int childCount = syntaxTree.getChildCount(i);
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                if (syntaxTree.getSyntaxTag(syntaxTree.getChildNode(i, i3)) == 231) {
                    i2++;
                }
            }
            if (i2 > 0) {
                this.VH.Sf(i2);
                int childCount2 = syntaxTree.getChildCount(i);
                for (int i4 = 0; i4 < childCount2; i4++) {
                    int childNode = syntaxTree.getChildNode(i, i4);
                    if (syntaxTree.getSyntaxTag(childNode) == 231) {
                        J0(syntaxTree, childNode);
                    }
                }
            }
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, -203897786167412620L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -7494793096982247199L)
    private void Jl(SyntaxTree syntaxTree, ClassType classType) {
        try {
            if (kQ) {
                iy.EQ(4744323830035953360L, this, syntaxTree, classType);
            }
            if (this.J8.v5(classType.getId())) {
                int i = this.ef;
                this.J8.default_Iterator.FH(classType.getId());
                while (this.J8.default_Iterator.hasMoreElements()) {
                    int iNextValue = this.J8.default_Iterator.nextValue();
                    Type attrType = syntaxTree.getAttrType(iNextValue);
                    int attrVariableSlot = syntaxTree.getAttrVariableSlot(iNextValue);
                    if (!this.J8.Zo(this.XL.getId(), iNextValue)) {
                        Za(attrVariableSlot, attrType);
                    } else if (this.sG) {
                        Za(i, attrType);
                        int semantic = attrType.getSemantic();
                        i = (semantic == 9 || semantic == 14) ? i + 2 : i + 1;
                    } else {
                        this.VH.XX(0);
                        kf(syntaxTree, iNextValue);
                    }
                }
            }
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, 4744323830035953360L, this, syntaxTree, classType);
            }
            throw th;
        }
    }

    @ey(method = -2461770880329380420L)
    private void Jm(boolean z, boolean z2, String[][] strArr) {
        try {
            if (kQ) {
                iy.we(805377766307832613L, this, new Boolean(z), new Boolean(z2), strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                String str = strArr[i][0];
                String str2 = strArr[i][1];
                OutputStream outputStreamNw = this.model.j3.nw(this.XL.getFile(), "", str, z, z2);
                if (outputStreamNw != null) {
                    for (int i2 = 0; i2 < str2.length(); i2++) {
                        outputStreamNw.write((byte) (str2.charAt(i2) - 512));
                    }
                    outputStreamNw.close();
                }
            }
        } catch (Throwable th) {
            if (yO) {
                iy.U2(th, 805377766307832613L, this, new Boolean(z), new Boolean(z2), strArr);
            }
            throw th;
        }
    }

    @ey(method = 5077078737069384111L)
    private void KD(SyntaxTree syntaxTree, int i, int i2, boolean z) {
        try {
            if (kQ) {
                iy.J0(-693539415294853288L, this, syntaxTree, new Integer(i), new Integer(i2), new Boolean(z));
            }
            if (syntaxTree.hasAttrValue(i)) {
                if (this.entitySpace.vJ(syntaxTree.getAttrValue(i)) == z) {
                    this.VH.IS(i2);
                    return;
                }
                return;
            }
            int syntaxTag = syntaxTree.getSyntaxTag(i);
            boolean z2 = true;
            if (syntaxTag == 168) {
                SI(syntaxTree, syntaxTree.getChildNode(i, 1), i2, z);
                return;
            }
            if (syntaxTag == 170) {
                if (syntaxTree.getSyntaxTag(syntaxTree.getChildNode(i, 0)) == 34) {
                    int childNode = syntaxTree.getChildNode(i, 1);
                    if (z) {
                        z2 = false;
                    }
                    SI(syntaxTree, childNode, i2, z2);
                    return;
                }
                return;
            }
            if (syntaxTag != 172) {
                OW(syntaxTree, i, false);
                if (this.j6.iW(syntaxTree.getAttrType(i))) {
                    ys(syntaxTree, syntaxTree.getAttrType(i));
                }
                this.VH.Of(i2, z);
                return;
            }
            int childNode2 = syntaxTree.getChildNode(i, 0);
            Type attrType = syntaxTree.getAttrType(childNode2);
            int childNode3 = syntaxTree.getChildNode(i, 2);
            Type attrType2 = syntaxTree.getAttrType(childNode3);
            int syntaxTag2 = syntaxTree.getSyntaxTag(syntaxTree.getChildNode(i, 1));
            if (syntaxTag2 == 18) {
                if ((attrType.getSemantic() != 11 && attrType != this.j6.dx(syntaxTree.getFile())) || (attrType2.getSemantic() != 11 && attrType2 != this.j6.dx(syntaxTree.getFile()))) {
                    if (this.j6.Q6(syntaxTree.getFile(), attrType, attrType2)) {
                        Type typeTp = this.j6.tp(syntaxTree.getFile(), 9, attrType, attrType2);
                        sy(syntaxTree, childNode2, false);
                        dx(syntaxTree, attrType, typeTp);
                        sy(syntaxTree, childNode3, false);
                        dx(syntaxTree, attrType2, typeTp);
                        Z1(syntaxTree.getSyntaxTag(syntaxTree.getChildNode(i, 1)), typeTp, i2, z);
                        return;
                    }
                    if (this.j6.iW(attrType) || attrType.getSemantic() == 2) {
                        if (syntaxTree.getSyntaxTag(childNode2) == 66) {
                            sy(syntaxTree, childNode3, false);
                            this.VH.PT(i2, z);
                            return;
                        }
                        if (syntaxTree.getSyntaxTag(childNode3) == 66) {
                            sy(syntaxTree, childNode2, false);
                            this.VH.PT(i2, z);
                            return;
                        }
                        sy(syntaxTree, childNode2, false);
                        if (this.j6.Jl(attrType)) {
                            gW(attrType);
                        }
                        sy(syntaxTree, childNode3, false);
                        if (this.j6.Jl(attrType2)) {
                            gW(attrType2);
                        }
                        this.VH.b1(i2, z);
                        return;
                    }
                    return;
                }
                int iCN = this.VH.CN();
                int iCN2 = this.VH.CN();
                SI(syntaxTree, childNode2, iCN, true);
                if (z) {
                    z2 = false;
                }
                SI(syntaxTree, childNode3, i2, z2);
                this.VH.IS(iCN2);
                this.VH.sy(iCN);
                SI(syntaxTree, childNode3, i2, z);
                this.VH.sy(iCN2);
                return;
            }
            if (syntaxTag2 != 35) {
                if (syntaxTag2 == 39) {
                    if (z) {
                        SI(syntaxTree, childNode2, i2, true);
                        SI(syntaxTree, childNode3, i2, true);
                        return;
                    } else {
                        int iCN3 = this.VH.CN();
                        SI(syntaxTree, childNode2, iCN3, true);
                        SI(syntaxTree, childNode3, i2, false);
                        this.VH.sy(iCN3);
                        return;
                    }
                }
                if (syntaxTag2 == 42) {
                    if (!z) {
                        SI(syntaxTree, childNode2, i2, false);
                        SI(syntaxTree, childNode3, i2, false);
                        return;
                    } else {
                        int iCN4 = this.VH.CN();
                        SI(syntaxTree, childNode2, iCN4, false);
                        SI(syntaxTree, childNode3, i2, true);
                        this.VH.sy(iCN4);
                        return;
                    }
                }
                if (syntaxTag2 == 210) {
                    int iCN5 = this.VH.CN();
                    int iCN6 = this.VH.CN();
                    SI(syntaxTree, childNode2, iCN5, false);
                    SI(syntaxTree, syntaxTree.getChildNode(syntaxTree.getChildNode(i, 1), 1), i2, z);
                    this.VH.IS(iCN6);
                    this.VH.sy(iCN5);
                    SI(syntaxTree, childNode3, i2, z);
                    this.VH.sy(iCN6);
                    return;
                }
                if (syntaxTag2 != 44 && syntaxTag2 != 45 && syntaxTag2 != 48 && syntaxTag2 != 49) {
                    OW(syntaxTree, i, false);
                    if (this.j6.iW(syntaxTree.getAttrType(i))) {
                        ys(syntaxTree, syntaxTree.getAttrType(i));
                    }
                    this.VH.Of(i2, z);
                    return;
                }
                Type typeTp2 = this.j6.tp(syntaxTree.getFile(), 13, attrType, attrType2);
                sy(syntaxTree, childNode2, false);
                dx(syntaxTree, attrType, typeTp2);
                sy(syntaxTree, childNode3, false);
                dx(syntaxTree, attrType2, typeTp2);
                Z1(syntaxTree.getSyntaxTag(syntaxTree.getChildNode(i, 1)), typeTp2, i2, z);
                return;
            }
            if ((attrType.getSemantic() != 11 && attrType != this.j6.dx(syntaxTree.getFile())) || (attrType2.getSemantic() != 11 && attrType2 != this.j6.dx(syntaxTree.getFile()))) {
                if (this.j6.Q6(syntaxTree.getFile(), attrType, attrType2)) {
                    Type typeTp3 = this.j6.tp(syntaxTree.getFile(), 10, attrType, attrType2);
                    sy(syntaxTree, childNode2, false);
                    dx(syntaxTree, attrType, typeTp3);
                    sy(syntaxTree, childNode3, false);
                    dx(syntaxTree, attrType2, typeTp3);
                    Z1(syntaxTree.getSyntaxTag(syntaxTree.getChildNode(i, 1)), typeTp3, i2, z);
                    return;
                }
                if (this.j6.iW(attrType) || attrType.getSemantic() == 2) {
                    if (syntaxTree.getSyntaxTag(childNode2) == 66) {
                        sy(syntaxTree, childNode3, false);
                        j6 j6Var = this.VH;
                        if (z) {
                            z2 = false;
                        }
                        j6Var.PT(i2, z2);
                        return;
                    }
                    if (syntaxTree.getSyntaxTag(childNode3) == 66) {
                        sy(syntaxTree, childNode2, false);
                        j6 j6Var2 = this.VH;
                        if (z) {
                            z2 = false;
                        }
                        j6Var2.PT(i2, z2);
                        return;
                    }
                    sy(syntaxTree, childNode2, false);
                    if (this.j6.Jl(attrType)) {
                        gW(attrType);
                    }
                    sy(syntaxTree, childNode3, false);
                    if (this.j6.Jl(attrType2)) {
                        gW(attrType2);
                    }
                    this.VH.AR(i2, z);
                    return;
                }
                return;
            }
            int iCN7 = this.VH.CN();
            int iCN8 = this.VH.CN();
            SI(syntaxTree, childNode2, iCN7, true);
            SI(syntaxTree, childNode3, i2, z);
            this.VH.IS(iCN8);
            this.VH.sy(iCN7);
            if (z) {
                z2 = false;
            }
            SI(syntaxTree, childNode3, i2, z2);
            this.VH.sy(iCN8);
        } catch (Throwable th) {
            if (yO) {
                iy.a8(th, -693539415294853288L, this, syntaxTree, new Integer(i), new Integer(i2), new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -153776508639591320L)
    private SetOf<Member> Lz(Member member) {
        try {
            if (kQ) {
                iy.tp(-3233840028100469169L, this, member);
            }
            if (member.gG() || member.getEnclosingClassType().isInterfaceType()) {
                return null;
            }
            SetOf<Member> setOfJO = member.jO();
            if (setOfJO.J0() == 0) {
                return null;
            }
            this.sh.clear();
            setOfJO.DEFAULT_ITERATOR.init();
            while (setOfJO.DEFAULT_ITERATOR.hasMoreElements()) {
                Member member2 = (Member) setOfJO.DEFAULT_ITERATOR.nextKey();
                try {
                    if (!ba(member, member2)) {
                        this.sh.put(member2);
                    }
                    if (member2.getEnclosingClassType().isInterfaceType()) {
                        FH(member2);
                    }
                } catch (e4 unused) {
                }
            }
            this.cb.clear();
            this.sh.DEFAULT_ITERATOR.init();
            while (this.sh.DEFAULT_ITERATOR.hasMoreElements()) {
                Member member3 = (Member) this.sh.DEFAULT_ITERATOR.nextKey();
                if (!b(member3, member)) {
                    this.cb.DEFAULT_ITERATOR.init();
                    while (true) {
                        if (!this.cb.DEFAULT_ITERATOR.hasMoreElements()) {
                            this.cb.put(member3);
                            break;
                        }
                        if (b(member3, (Member) this.cb.DEFAULT_ITERATOR.nextKey())) {
                            break;
                        }
                    }
                }
            }
            return this.cb;
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, -3233840028100469169L, this, member);
            }
            throw th;
        }
    }

    @ey(method = 7615926775641529040L)
    private void MP(SyntaxTree syntaxTree, ClassType classType) {
        try {
            if (kQ) {
                iy.EQ(3576756818781778359L, this, syntaxTree, classType);
            }
            oa(classType, false);
            this.er = 0;
            char[] cArr = this.lg;
            this.er = 0 + 1;
            cArr[0] = '(';
            if (classType.Of()) {
                VH(classType.getEnclosingClassType(), true);
            }
            if (this.J8.v5(classType.getId())) {
                this.J8.default_Iterator.FH(classType.getId());
                while (this.J8.default_Iterator.hasMoreElements()) {
                    VH(syntaxTree.getAttrType(this.J8.default_Iterator.nextValue()), true);
                }
            }
            char[] cArr2 = this.lg;
            int i = this.er;
            int i2 = i + 1;
            this.er = i2;
            cArr2[i] = ')';
            char[] cArr3 = this.lg;
            this.er = i2 + 1;
            cArr3[i2] = 'V';
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, 3576756818781778359L, this, syntaxTree, classType);
            }
            throw th;
        }
    }

    @ey(method = 3280265699847662617L)
    private void Mr(SyntaxTree syntaxTree, Type type, Type type2, boolean z) {
        try {
            if (kQ) {
                iy.J0(2411161566895222400L, this, syntaxTree, type, type2, new Boolean(z));
            }
            int semantic = type.getSemantic();
            if (semantic == 3) {
                dx(syntaxTree, type2, type);
                if (!z) {
                    this.VH.n5();
                }
            } else if (semantic == 5) {
                dx(syntaxTree, type2, type);
                if (!z) {
                    this.VH.n5();
                }
            } else if (semantic == 7) {
                dx(syntaxTree, type2, type);
                if (!z) {
                    this.VH.n5();
                }
            } else if (semantic != 9) {
                switch (semantic) {
                    case 11:
                        dx(syntaxTree, type2, type);
                        if (!z) {
                            this.VH.n5();
                            break;
                        }
                        break;
                    case 12:
                        dx(syntaxTree, type2, type);
                        if (!z) {
                            this.VH.n5();
                            break;
                        }
                        break;
                    case 13:
                        dx(syntaxTree, type2, type);
                        if (!z) {
                            this.VH.n5();
                            break;
                        }
                        break;
                    case 14:
                        dx(syntaxTree, type2, type);
                        if (!z) {
                            this.VH.q7();
                            break;
                        }
                        break;
                    default:
                        dx(syntaxTree, type2, type);
                        if (!z) {
                            this.VH.n5();
                            break;
                        }
                        break;
                }
            } else {
                dx(syntaxTree, type2, type);
                if (!z) {
                    this.VH.q7();
                }
            }
            U2(type);
        } catch (Throwable th) {
            if (yO) {
                iy.a8(th, 2411161566895222400L, this, syntaxTree, type, type2, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 4199029919512027341L)
    private void Mz(ClassType classType) {
        try {
            if (kQ) {
                iy.tp(2207446403243098016L, this, classType);
            }
            if (classType.Of()) {
                boolean z = this.x9;
                boolean z2 = this.ca;
                ClassType enclosingClassType = classType.getEnclosingClassType();
                oa(enclosingClassType, true);
                this.VH.a8(18, wE(), this.a8, 0, this.rN, z, false);
                String strD8 = d8();
                this.er = 0;
                char[] cArr = this.lg;
                this.er = 0 + 1;
                cArr[0] = '(';
                VH(classType, true);
                char[] cArr2 = this.lg;
                int i = this.er;
                this.er = i + 1;
                cArr2[i] = ')';
                VH(enclosingClassType, true);
                this.VH.Mz(8, strD8, this.lg, 0, this.er, z, false, true);
                I();
                this.VH.kQ();
            }
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, 2207446403243098016L, this, classType);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:176:? A[SYNTHETIC] */
    @abcd.ey(method = 510980698976897880L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int N0(com.aide.codemodel.api.Entity r10, char[] r11, int r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.java.JavaCompiler.N0(com.aide.codemodel.api.Entity, char[], int):int");
    }

    @ey(method = 685733748019853847L)
    private void Nh(SyntaxTree syntaxTree, int i, int i2, Type type) {
        try {
            if (kQ) {
                iy.J0(-2807654648012304744L, this, syntaxTree, new Integer(i), new Integer(i2), type);
            }
            if (this.vJ) {
                this.VH.XX(this.U2);
                this.VH.BJ(this.DW.getString(syntaxTree.getIdentifier(i)));
                this.VH.qP(i2);
                int semantic = type.getSemantic();
                if (semantic == 3) {
                    this.VH.oT("adrt/ADRTThread", "onByteVariableDeclare", "(Ljava/lang/String;I)V");
                    return;
                }
                if (semantic == 5) {
                    this.VH.oT("adrt/ADRTThread", "onShortVariableDeclare", "(Ljava/lang/String;I)V");
                    return;
                }
                if (semantic == 7) {
                    this.VH.oT("adrt/ADRTThread", "onIntVariableDeclare", "(Ljava/lang/String;I)V");
                    return;
                }
                if (semantic == 9) {
                    this.VH.oT("adrt/ADRTThread", "onLongVariableDeclare", "(Ljava/lang/String;I)V");
                    return;
                }
                switch (semantic) {
                    case 11:
                        this.VH.oT("adrt/ADRTThread", "onBoolVariableDeclare", "(Ljava/lang/String;I)V");
                        return;
                    case 12:
                        this.VH.oT("adrt/ADRTThread", "onCharVariableDeclare", "(Ljava/lang/String;I)V");
                        return;
                    case 13:
                        this.VH.oT("adrt/ADRTThread", "onFloatVariableDeclare", "(Ljava/lang/String;I)V");
                        return;
                    case 14:
                        this.VH.oT("adrt/ADRTThread", "onDoubleVariableDeclare", "(Ljava/lang/String;I)V");
                        return;
                    default:
                        this.VH.oT("adrt/ADRTThread", "onObjectVariableDeclare", "(Ljava/lang/String;I)V");
                        return;
                }
            }
        } catch (Throwable th) {
            if (yO) {
                iy.a8(th, -2807654648012304744L, this, syntaxTree, new Integer(i), new Integer(i2), type);
            }
            throw th;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0257 A[Catch: all -> 0x0a5f, TryCatch #1 {all -> 0x0a5f, blocks: (B:3:0x0008, B:5:0x000c, B:6:0x0022, B:8:0x002f, B:10:0x0035, B:15:0x0045, B:17:0x004a, B:18:0x005b, B:19:0x006c, B:21:0x0078, B:22:0x007f, B:23:0x0086, B:24:0x0096, B:25:0x00a7, B:27:0x00ad, B:28:0x00b4, B:34:0x00c3, B:36:0x00cd, B:37:0x00d0, B:39:0x00d5, B:40:0x00e0, B:41:0x00e5, B:43:0x00eb, B:45:0x00fd, B:46:0x0102, B:48:0x011f, B:49:0x0126, B:51:0x0139, B:52:0x013c, B:53:0x0144, B:55:0x0156, B:56:0x015b, B:58:0x018c, B:59:0x018f, B:60:0x0197, B:62:0x01a8, B:63:0x01ba, B:65:0x01c5, B:68:0x01d2, B:71:0x01db, B:72:0x01e3, B:73:0x01f1, B:75:0x0205, B:76:0x020e, B:77:0x0226, B:82:0x024c, B:83:0x024f, B:84:0x0252, B:86:0x0257, B:87:0x025c, B:89:0x0262, B:90:0x0267, B:92:0x026d, B:102:0x02ed, B:104:0x02f5, B:106:0x02fb, B:108:0x0307, B:93:0x0284, B:95:0x0297, B:97:0x02a7, B:99:0x02b3, B:101:0x02d4, B:109:0x0314, B:110:0x0352, B:112:0x035a, B:113:0x0362, B:117:0x036f, B:116:0x0368, B:118:0x0388, B:119:0x039d, B:121:0x03a3, B:122:0x03a8, B:123:0x03ae, B:128:0x03c3, B:129:0x03d7, B:132:0x03e2, B:134:0x03e8, B:143:0x0498, B:145:0x04a0, B:147:0x04a6, B:149:0x04b2, B:135:0x041e, B:131:0x03dc, B:136:0x0440, B:138:0x0446, B:139:0x0476, B:141:0x0480, B:142:0x0485, B:150:0x04bf, B:151:0x04c4, B:153:0x04ca, B:154:0x04cf, B:156:0x04d9, B:158:0x04fa, B:162:0x0506, B:163:0x050c, B:164:0x0511, B:197:0x05c0, B:199:0x05c8, B:201:0x05ce, B:203:0x05da, B:165:0x0526, B:167:0x052e, B:169:0x0534, B:171:0x0540, B:173:0x0547, B:175:0x0551, B:176:0x0554, B:180:0x0563, B:181:0x0569, B:184:0x057b, B:188:0x0587, B:189:0x058d, B:190:0x0593, B:194:0x059f, B:195:0x05a5, B:196:0x05aa, B:204:0x05e7, B:216:0x0608, B:222:0x062f, B:223:0x0636, B:224:0x063d, B:225:0x0644, B:226:0x064b, B:227:0x0655, B:229:0x0674, B:230:0x0682, B:231:0x068f, B:232:0x0693, B:234:0x0699, B:235:0x069e, B:237:0x06a8, B:239:0x06e8, B:243:0x071d, B:245:0x0725, B:247:0x072b, B:249:0x0737, B:240:0x06f0, B:242:0x0716, B:250:0x0744, B:251:0x074e, B:253:0x0762, B:254:0x076f, B:256:0x077f, B:257:0x0784, B:258:0x0793, B:259:0x079d, B:261:0x07b2, B:262:0x07bb, B:263:0x07c4, B:265:0x07ca, B:266:0x07d2, B:267:0x07e0, B:269:0x0800, B:270:0x080b, B:271:0x0814, B:273:0x081c, B:275:0x0826, B:277:0x083c, B:278:0x0843, B:280:0x0857, B:281:0x085a, B:288:0x089e, B:282:0x0861, B:284:0x086b, B:286:0x0895, B:287:0x0898, B:290:0x08a6, B:292:0x08b7, B:294:0x08c3, B:295:0x08d4, B:296:0x08dd, B:298:0x08f4, B:300:0x08fa, B:301:0x0922, B:302:0x0950, B:303:0x098d, B:305:0x09a4, B:307:0x09ab, B:309:0x09bf, B:308:0x09b7, B:310:0x09c2, B:311:0x09ea, B:313:0x0a01, B:315:0x0a1a, B:314:0x0a0f, B:316:0x0a3d, B:317:0x0a44, B:318:0x0a4a), top: B:329:0x0008 }] */
    @abcd.ey(method = 2148214112355863415L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void OW(com.aide.codemodel.api.SyntaxTree r23, int r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 2862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.java.JavaCompiler.OW(com.aide.codemodel.api.SyntaxTree, int, boolean):void");
    }

    @ey(method = 3248219706576492373L)
    private void Of(SyntaxTree syntaxTree, Member member, ClassType classType) {
        try {
            if (kQ) {
                iy.we(1143269382570639896L, this, syntaxTree, member, classType);
            }
            qP(member, false);
            if (classType.Of()) {
                oa(classType.getEnclosingClassType(), true);
                System.arraycopy(this.lg, 1, this.lg, this.rN + 1, this.er);
                System.arraycopy(this.a8, 0, this.lg, 1, this.rN);
                this.er += this.rN;
            }
            if (this.J8.v5(classType.getId())) {
                this.rN = 0;
                this.J8.default_Iterator.FH(classType.getId());
                while (this.J8.default_Iterator.hasMoreElements()) {
                    Zo(syntaxTree.getAttrType(this.J8.default_Iterator.nextValue()), true);
                }
                System.arraycopy(this.lg, this.er - 2, this.lg, (this.er + this.rN) - 2, 2);
                System.arraycopy(this.a8, 0, this.lg, this.er - 2, this.rN);
                this.er += this.rN;
            }
        } catch (Throwable th) {
            if (yO) {
                iy.U2(th, 1143269382570639896L, this, syntaxTree, member, classType);
            }
            throw th;
        }
    }

    @ey(method = -1692753537368310600L)
    private void P8(SyntaxTree syntaxTree, int i) {
        try {
            if (kQ) {
                iy.EQ(8901225939860538763L, this, syntaxTree, new Integer(i));
            }
            if (syntaxTree.getSyntaxTag(i) == 177) {
                Type attrType = syntaxTree.getAttrType(syntaxTree.getChildNode(i, syntaxTree.getChildCount(i) - 3));
                oa(attrType, false);
                if (attrType.isInterfaceType()) {
                    this.VH.Z3("java/lang/Object");
                    this.VH.P8(this.a8, 0, this.rN);
                } else {
                    this.VH.mu(this.a8, 0, this.rN);
                }
                XL(syntaxTree, i);
                return;
            }
            if (this.XL.isInterfaceType()) {
                this.VH.Z3("java/lang/Object");
                int childNode = syntaxTree.getChildNode(i, 4);
                int childCount = syntaxTree.getChildCount(childNode);
                for (int i2 = 1; i2 < childCount; i2 += 2) {
                    oa(syntaxTree.getAttrType(syntaxTree.getChildNode(childNode, i2)), false);
                    this.VH.P8(this.a8, 0, this.rN);
                }
            } else {
                try {
                    oa(this.XL.Bx(), false);
                    this.VH.mu(this.a8, 0, this.rN);
                } catch (e4 unused) {
                }
            }
            int childNode2 = syntaxTree.getChildNode(i, 5);
            int childCount2 = syntaxTree.getChildCount(childNode2);
            for (int i3 = 1; i3 < childCount2; i3 += 2) {
                oa(syntaxTree.getAttrType(syntaxTree.getChildNode(childNode2, i3)), false);
                this.VH.P8(this.a8, 0, this.rN);
            }
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, 8901225939860538763L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -46440244200974160L)
    private void PT(Entity entity) {
        try {
            if (kQ) {
                iy.tp(-4344314624800258279L, this, entity);
            }
            while (true) {
                int iYi = Yi(entity, this.lg, 0);
                this.er = iYi;
                if (iYi != -1) {
                    return;
                } else {
                    this.lg = new char[(this.lg.length * 2) + 1];
                }
            }
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, -4344314624800258279L, this, entity);
            }
            throw th;
        }
    }

    @ey(method = -2769009191759159440L)
    private void Pa(SyntaxTree syntaxTree, int i, int i2, Type type) {
        try {
            if (kQ) {
                iy.J0(6332040660251175897L, this, syntaxTree, new Integer(i), new Integer(i2), type);
            }
            if (this.vJ) {
                this.VH.XX(this.U2);
                this.VH.qP(i2);
                Za(i2, type);
                int semantic = type.getSemantic();
                if (semantic == 3) {
                    this.VH.oT("adrt/ADRTThread", "onVariableWrite", "(IB)V");
                    return;
                }
                if (semantic == 5) {
                    this.VH.oT("adrt/ADRTThread", "onVariableWrite", "(IS)V");
                    return;
                }
                if (semantic == 7) {
                    this.VH.oT("adrt/ADRTThread", "onVariableWrite", "(II)V");
                    return;
                }
                if (semantic == 9) {
                    this.VH.oT("adrt/ADRTThread", "onVariableWrite", "(IJ)V");
                    return;
                }
                switch (semantic) {
                    case 11:
                        this.VH.oT("adrt/ADRTThread", "onVariableWrite", "(IZ)V");
                        return;
                    case 12:
                        this.VH.oT("adrt/ADRTThread", "onVariableWrite", "(IC)V");
                        return;
                    case 13:
                        this.VH.oT("adrt/ADRTThread", "onVariableWrite", "(IF)V");
                        return;
                    case 14:
                        this.VH.oT("adrt/ADRTThread", "onVariableWrite", "(ID)V");
                        return;
                    default:
                        this.VH.oT("adrt/ADRTThread", "onVariableWrite", "(ILjava/lang/Object;)V");
                        return;
                }
            }
        } catch (Throwable th) {
            if (yO) {
                iy.a8(th, 6332040660251175897L, this, syntaxTree, new Integer(i), new Integer(i2), type);
            }
            throw th;
        }
    }

    @ey(method = 5269199315171195709L)
    private void Q6(SyntaxTree syntaxTree, ClassType classType, int i) {
        try {
            if (kQ) {
                iy.we(3001696597341289056L, this, syntaxTree, classType, new Integer(i));
            }
            oa(classType, false);
            this.J8.default_Iterator.FH(classType.getId());
            while (this.J8.default_Iterator.hasMoreElements()) {
                int iNextValue = this.J8.default_Iterator.nextValue();
                Type attrType = syntaxTree.getAttrType(iNextValue);
                this.VH.XX(0);
                Za(i, attrType);
                int semantic = attrType.getSemantic();
                i = (semantic == 9 || semantic == 14) ? i + 2 : i + 1;
                String strOm = om(syntaxTree.getIdentifierString(iNextValue));
                qP(attrType, true);
                this.VH.zg(this.a8, 0, this.rN, strOm, this.lg, 0, this.er);
            }
        } finally {
        }
    }

    @ey(method = 3482027749109713583L)
    private void QO() {
        try {
            if (kQ) {
                iy.gn(-4130004240966673920L, this);
            }
            oa(this.XL, true);
            if (this.lp) {
                this.VH.aj(this.QX, 0, "this".toCharArray(), 0, 4, this.a8, 0, this.rN);
            }
        } catch (Throwable th) {
            if (yO) {
                iy.aM(th, -4130004240966673920L, this);
            }
            throw th;
        }
    }

    @ey(method = 1966682319932192577L)
    private void QX(SyntaxTree syntaxTree, int i, boolean z) {
        try {
            if (kQ) {
                iy.we(115754445194278560L, this, syntaxTree, new Integer(i), new Boolean(z));
            }
            Type attrType = syntaxTree.getAttrType(i);
            oa(attrType, false);
            this.VH.g0(this.a8, 0, this.rN);
            if (!z) {
                this.VH.w9();
            }
            int childNode = syntaxTree.getChildNode(syntaxTree.getChildNode(i, syntaxTree.getChildCount(i) - 3), syntaxTree.getChildCount(r2) - 2);
            Entity attrReferenceEntity = syntaxTree.getAttrReferenceEntity(childNode);
            ClassType enclosingClassType = (attrReferenceEntity.isMember() && ((Member) attrReferenceEntity).e9()) ? ((Member) attrReferenceEntity).getEnclosingClassType() : (ClassType) attrReferenceEntity;
            if (((ClassType) attrType).Of()) {
                x9(syntaxTree, attrType.getEnclosingClassType());
            }
            if (syntaxTree.getChildCount(i) != 5) {
                sy(syntaxTree, syntaxTree.getChildNode(i, 0), false);
            } else if (enclosingClassType.Of()) {
                x9(syntaxTree, enclosingClassType.getEnclosingClassType());
            }
            if (attrReferenceEntity.isMember() && ((Member) attrReferenceEntity).e9()) {
                oY(syntaxTree, childNode, syntaxTree.getChildNode(i, syntaxTree.getChildCount(i) - 2), (Member) attrReferenceEntity);
                Jl(syntaxTree, (ClassType) attrType);
                Of(syntaxTree, (Member) attrReferenceEntity, (ClassType) attrType);
                oa(attrType, false);
                this.VH.ti(this.a8, 0, this.rN, "<init>", this.lg, 0, this.er);
            } else {
                Jl(syntaxTree, (ClassType) attrType);
                MP(syntaxTree, (ClassType) attrType);
                this.VH.ti(this.a8, 0, this.rN, "<init>", this.lg, 0, this.er);
            }
            Ws(syntaxTree, syntaxTree.getChildNode(i, syntaxTree.getChildCount(i) - 1));
        } catch (Throwable th) {
            if (yO) {
                iy.U2(th, 115754445194278560L, this, syntaxTree, new Integer(i), new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 4533384759654121800L)
    private void Qq(Type type) {
        try {
            if (kQ) {
                iy.tp(2412963327748290213L, this, type);
            }
            if (type == this.XL) {
                this.VH.XX(0);
                return;
            }
            if (this.sG) {
                this.VH.XX(1);
            } else if (this.Mz) {
                this.VH.XX(0);
                g3(this.XL);
            } else {
                I();
            }
            for (ClassType enclosingClassType = this.XL.getEnclosingClassType(); enclosingClassType != type && !enclosingClassType.isToplevel(); enclosingClassType = enclosingClassType.getEnclosingClassType()) {
                g3(enclosingClassType);
            }
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, 2412963327748290213L, this, type);
            }
            throw th;
        }
    }

    @ey(method = 1740850028210552800L)
    private boolean RW() {
        try {
            if (kQ) {
                iy.gn(-573525238355250843L, this);
            }
            if (this.model.stopCallback != null) {
                if (this.model.stopCallback.CU()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (yO) {
                iy.aM(th, -573525238355250843L, this);
            }
            throw th;
        }
    }

    @ey(method = -254725670121284688L)
    private void SI(SyntaxTree syntaxTree, int i, int i2, boolean z) {
        try {
            if (kQ) {
                iy.J0(687584149903311241L, this, syntaxTree, new Integer(i), new Integer(i2), new Boolean(z));
            }
            if (!this.vJ) {
                KD(syntaxTree, i, i2, z);
                return;
            }
            int syntaxTag = syntaxTree.getSyntaxTag(i);
            if (syntaxTag == 68 || syntaxTag == 74) {
                KD(syntaxTree, i, i2, z);
                ro(syntaxTree, i, this.entitySpace.vJ(syntaxTree.getAttrValue(i)));
                return;
            }
            if (syntaxTag == 168) {
                KD(syntaxTree, i, i2, z);
                return;
            }
            if (syntaxTag != 172) {
                int iCN = this.VH.CN();
                KD(syntaxTree, i, iCN, !z);
                er(syntaxTree, i, z);
                this.VH.IS(i2);
                this.VH.sy(iCN);
                er(syntaxTree, i, z ? false : true);
                return;
            }
            int syntaxTag2 = syntaxTree.getSyntaxTag(syntaxTree.getChildNode(i, 1));
            if (syntaxTag2 == 39 || syntaxTag2 == 42 || syntaxTag2 == 210) {
                KD(syntaxTree, i, i2, z);
                return;
            }
            int iCN2 = this.VH.CN();
            KD(syntaxTree, i, iCN2, !z);
            er(syntaxTree, i, z);
            this.VH.IS(i2);
            this.VH.sy(iCN2);
            er(syntaxTree, i, z ? false : true);
        } catch (Throwable th) {
            if (yO) {
                iy.a8(th, 687584149903311241L, this, syntaxTree, new Integer(i), new Integer(i2), new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -4666521886414185168L)
    private void Sf(SyntaxTree syntaxTree, int i) {
        int i2;
        Type type;
        try {
            if (kQ) {
                iy.EQ(-3739275742652972401L, this, syntaxTree, new Integer(i));
            }
            int childCount = syntaxTree.getChildCount(i);
            if (childCount > 2) {
                boolean z = true;
                int i3 = 1;
                while (i3 < childCount - 1) {
                    int childNode = syntaxTree.getChildNode(i, i3);
                    if (syntaxTree.getSyntaxTag(childNode) == 191) {
                        int childNode2 = syntaxTree.getChildNode(childNode, 3);
                        int identifier = syntaxTree.getIdentifier(childNode2);
                        int attrVariableSlot = syntaxTree.getAttrVariableSlot(childNode2);
                        Type attrType = syntaxTree.getAttrType(childNode2);
                        oa(attrType, z);
                        b1(identifier);
                        if (this.lp) {
                            i2 = attrVariableSlot;
                            this.VH.aj(this.QX, attrVariableSlot, this.yS, 0, this.gW, this.a8, 0, this.rN);
                            type = attrType;
                        } else {
                            i2 = attrVariableSlot;
                            type = attrType;
                        }
                        Eq(type);
                        iW(syntaxTree, childNode2, i2, type);
                        Pa(syntaxTree, childNode, i2, type);
                    }
                    i3 += 2;
                    z = true;
                }
            }
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, -3739275742652972401L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @ey(method = -3427455932225442376L)
    private Type T6(SyntaxTree syntaxTree, Type type) {
        try {
            if (kQ) {
                iy.EQ(1690426352051289261L, this, syntaxTree, type);
            }
            int semantic = type.getSemantic();
            if (semantic != 3 && semantic != 5) {
                if (semantic != 7 && semantic != 9) {
                    switch (semantic) {
                        case 11:
                        case 13:
                        case 14:
                            break;
                        case 12:
                            break;
                        default:
                            try {
                                Type typeYe = this.j6.ye(syntaxTree.getFile(), type);
                                int semantic2 = typeYe.getSemantic();
                                if (semantic2 != 3 && semantic2 != 5) {
                                    if (semantic2 != 7 && semantic2 != 9) {
                                        switch (semantic2) {
                                        }
                                    }
                                    return typeYe;
                                }
                                return this.j6.ro();
                            } catch (e4 unused) {
                                break;
                            }
                    }
                }
                return type;
            }
            return this.j6.ro();
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, 1690426352051289261L, this, syntaxTree, type);
            }
            throw th;
        }
    }

    @ey(method = 28576305235071432L)
    private String TI() {
        try {
            if (!kQ) {
                return "$assertionsDisabled";
            }
            iy.gn(3085779103049764887L, this);
            return "$assertionsDisabled";
        } catch (Throwable th) {
            if (yO) {
                iy.aM(th, 3085779103049764887L, this);
            }
            throw th;
        }
    }

    @ey(method = -499731668609520753L)
    private void U2(Type type) {
        try {
            if (kQ) {
                iy.tp(6517782046586779776L, this, type);
            }
            int semantic = type.getSemantic();
            if (semantic == 3) {
                this.VH.et();
                return;
            }
            if (semantic == 5) {
                this.VH.eQ();
                return;
            }
            if (semantic == 7) {
                this.VH.oa();
                return;
            }
            if (semantic == 9) {
                this.VH.uD();
                return;
            }
            switch (semantic) {
                case 11:
                    this.VH.et();
                    return;
                case 12:
                    this.VH.Xa();
                    return;
                case 13:
                    this.VH.e3();
                    return;
                case 14:
                    this.VH.Ev();
                    return;
                default:
                    this.VH.OW();
                    return;
            }
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, 6517782046586779776L, this, type);
            }
            throw th;
        }
    }

    @ey(method = -261683017975738145L)
    private void VH(Entity entity, boolean z) {
        try {
            if (kQ) {
                iy.EQ(-7651410266808702804L, this, entity, new Boolean(z));
            }
            int i = this.er;
            while (true) {
                int iGK = GK(entity, this.lg, i, z);
                this.er = iGK;
                if (iGK != -1) {
                    return;
                } else {
                    this.lg = new char[(this.lg.length * 2) + 1];
                }
            }
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, -7651410266808702804L, this, entity, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -488975859247445025L)
    private void WB(SyntaxTree syntaxTree, int i) {
        try {
            if (kQ) {
                iy.EQ(1052036435634936096L, this, syntaxTree, new Integer(i));
            }
            if (this.vJ) {
                fN(syntaxTree, syntaxTree.getChildNode(i, syntaxTree.getChildCount(i) - 1));
            }
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, 1052036435634936096L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -1232912734774943145L)
    private void Ws(SyntaxTree syntaxTree, int i) {
        try {
            if (kQ) {
                iy.EQ(-2711358477579377568L, this, syntaxTree, new Integer(i));
            }
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, -2711358477579377568L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -5201975509022236473L)
    private void XG(SyntaxTree syntaxTree, int i) {
        try {
            if (kQ) {
                iy.EQ(-1247757385805077060L, this, syntaxTree, new Integer(i));
            }
            int childNode = syntaxTree.getChildNode(i, syntaxTree.getChildCount(i) - 1);
            if (syntaxTree.sh(childNode) == 27) {
                this.VH.yO();
                return;
            }
            if (syntaxTree.getSyntaxTag(i) != 161) {
                yO(syntaxTree, (Member) syntaxTree.getAttrReferenceEntity(childNode), syntaxTree.getAttrInvocationType(childNode), syntaxTree.getAttrType(i));
            } else if (syntaxTree.getChildCount(i) == 1 && syntaxTree.sh(childNode) == 2) {
                Za(syntaxTree.getAttrVariableSlot(childNode), syntaxTree.getAttrType(childNode));
            } else {
                if (syntaxTree.getChildCount(i) == 1 && syntaxTree.sh(childNode) == 3) {
                    kf(syntaxTree, syntaxTree.getAttrReferenceNode(childNode));
                    return;
                }
                yO(syntaxTree, (Member) syntaxTree.getAttrReferenceEntity(childNode), syntaxTree.getAttrInvocationType(childNode), syntaxTree.getAttrType(childNode));
            }
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, -1247757385805077060L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -1884302126034146091L)
    private void XL(SyntaxTree syntaxTree, int i) {
        try {
            if (kQ) {
                iy.EQ(-806384380592961888L, this, syntaxTree, new Integer(i));
            }
            Type attrType = syntaxTree.getAttrType(i);
            int childNode = syntaxTree.getChildNode(i, syntaxTree.getChildCount(i) - 3);
            int i2 = 2;
            Entity attrReferenceEntity = syntaxTree.getAttrReferenceEntity(syntaxTree.getChildNode(childNode, syntaxTree.getChildCount(childNode) - 2));
            if (!attrReferenceEntity.isMember() || !((Member) attrReferenceEntity).e9()) {
                MP(syntaxTree, (ClassType) attrType);
                this.VH.Mz(0, "<init>", this.lg, 0, this.er, false, false, true);
                this.VH.XX(0);
                this.VH.nl("java/lang/Object", "<init>", "()V");
                if (((ClassType) attrType).Of()) {
                    ca((ClassType) attrType, 1);
                }
                if (!((ClassType) attrType).Of()) {
                    i2 = 1;
                }
                Q6(syntaxTree, (ClassType) attrType, i2);
                kQ(syntaxTree, syntaxTree.getChildNode(i, syntaxTree.getChildCount(i) - 1));
                this.VH.IM();
                return;
            }
            ClassType enclosingClassType = ((Member) attrReferenceEntity).getEnclosingClassType();
            Of(syntaxTree, (Member) attrReferenceEntity, (ClassType) attrType);
            this.VH.Mz(0, "<init>", this.lg, 0, this.er, false, false, true);
            if (!this.aj) {
                this.sG = true;
                this.VH.XX(0);
                int i3 = ((ClassType) attrType).Of() ? 2 : 1;
                if (enclosingClassType.Of()) {
                    this.VH.XX(i3);
                    i3++;
                }
                int iOY = ((Member) attrReferenceEntity).oY();
                for (int i4 = 0; i4 < iOY; i4++) {
                    Type typeQp = ((Member) attrReferenceEntity).qp(i4);
                    Za(i3, typeQp);
                    int semantic = typeQp.getSemantic();
                    i3 = (semantic == 9 || semantic == 14) ? i3 + 2 : i3 + 1;
                }
                if (this.J8.v5(enclosingClassType.getId())) {
                    Jl(syntaxTree, enclosingClassType);
                }
                cb(syntaxTree, (Member) attrReferenceEntity);
                this.sG = false;
            }
            if (((ClassType) attrType).Of()) {
                ca((ClassType) attrType, 1);
            }
            int iOY2 = ((Member) attrReferenceEntity).oY();
            int i5 = ((ClassType) attrType).Of() ? 2 : 1;
            if (enclosingClassType.Of()) {
                this.VH.XX(i5);
                i5++;
            }
            for (int i6 = 0; i6 < iOY2; i6++) {
                int semantic2 = ((Member) attrReferenceEntity).qp(i6).getSemantic();
                i5 = (semantic2 == 9 || semantic2 == 14) ? i5 + 2 : i5 + 1;
            }
            Q6(syntaxTree, (ClassType) attrType, i5);
            if (this.aj) {
                this.sG = true;
                this.VH.XX(0);
                if (!((ClassType) attrType).Of()) {
                    i2 = 1;
                }
                if (enclosingClassType.Of()) {
                    this.VH.XX(i2);
                    i2++;
                }
                int iOY3 = ((Member) attrReferenceEntity).oY();
                for (int i7 = 0; i7 < iOY3; i7++) {
                    Type typeQp2 = ((Member) attrReferenceEntity).qp(i7);
                    Za(i2, typeQp2);
                    int semantic3 = typeQp2.getSemantic();
                    i2 = (semantic3 == 9 || semantic3 == 14) ? i2 + 2 : i2 + 1;
                }
                if (this.J8.v5(enclosingClassType.getId())) {
                    Jl(syntaxTree, enclosingClassType);
                }
                cb(syntaxTree, (Member) attrReferenceEntity);
                this.sG = false;
            }
            kQ(syntaxTree, syntaxTree.getChildNode(i, syntaxTree.getChildCount(i) - 1));
            this.VH.IM();
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, -806384380592961888L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 2295191196006631368L)
    private void XX(SyntaxTree syntaxTree, ClassType classType, Member member) {
        try {
            if (kQ) {
                iy.we(-532004664200177175L, this, syntaxTree, classType, member);
            }
            boolean z = this.x9;
            int i = this.ca ? 4104 : 8;
            String strOh = oh(member);
            int i2 = 0;
            this.er = 0;
            char[] cArr = this.lg;
            this.er = 0 + 1;
            cArr[0] = '(';
            if (!member.gG()) {
                VH(classType, true);
            }
            char[] cArr2 = this.lg;
            int i3 = this.er;
            this.er = i3 + 1;
            cArr2[i3] = ')';
            VH(member, false);
            this.VH.Mz(i, strOh, this.lg, 0, this.er, z, false, true);
            if (!member.gG()) {
                this.VH.XX(0);
            }
            yO(syntaxTree, member, null, this.j6.Eq(syntaxTree.getFile()));
            sE(member.WB());
            if (member.ys()) {
                return;
            }
            String strEj = Ej(member);
            this.er = 0;
            char[] cArr3 = this.lg;
            this.er = 0 + 1;
            cArr3[0] = '(';
            if (!member.gG()) {
                VH(classType, true);
            }
            VH(member, false);
            char[] cArr4 = this.lg;
            int i4 = this.er;
            int i5 = i4 + 1;
            this.er = i5;
            cArr4[i4] = ')';
            char[] cArr5 = this.lg;
            int i6 = i5 + 1;
            this.er = i6;
            cArr5[i5] = 'V';
            this.VH.Mz(i, strEj, this.lg, 0, i6, z, false, true);
            if (!member.gG()) {
                this.VH.XX(0);
            }
            if (!member.gG()) {
                i2 = 1;
            }
            Za(i2, member.WB());
            wc(syntaxTree, member, null, true);
            this.VH.IM();
        } catch (Throwable th) {
            if (yO) {
                iy.U2(th, -532004664200177175L, this, syntaxTree, classType, member);
            }
            throw th;
        }
    }

    @ey(method = -597136616570747535L)
    private void Xa(int i, Type type) {
        try {
            if (kQ) {
                iy.EQ(4672234637600916432L, this, new Integer(i), type);
            }
            int i2 = i == 28 ? -1 : 1;
            int semantic = type.getSemantic();
            if (semantic == 9) {
                this.VH.HE(i2);
                return;
            }
            if (semantic == 13) {
                this.VH.sE(i2);
            } else if (semantic != 14) {
                this.VH.qP(i2);
            } else {
                this.VH.ye(i2);
            }
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, 4672234637600916432L, this, new Integer(i), type);
            }
            throw th;
        }
    }

    @ey(method = -6496667146239818688L)
    private int Yi(Entity entity, char[] cArr, int i) throws Throwable {
        Throwable th;
        try {
            if (kQ) {
                iy.we(-1058300438984717487L, this, entity, cArr, new Integer(i));
            }
            int i2 = 0;
            i = GK(entity, cArr, i, false);
            if (i == -1) {
                return -1;
            }
            if (i + 8 >= cArr.length) {
                return -1;
            }
            while (i2 < 8) {
                int i3 = i + 1;
                try {
                    cArr[i] = "$0$debug".charAt(i2);
                    i2++;
                    i = i3;
                } catch (Throwable th2) {
                    th = th2;
                    i = i3;
                    if (!yO) {
                        throw th;
                    }
                    iy.U2(th, -1058300438984717487L, this, entity, cArr, new Integer(i));
                    throw th;
                }
            }
            return i;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @ey(method = -151362867371766804L)
    private void Z1(int i, Type type, int i2, boolean z) {
        try {
            if (kQ) {
                iy.J0(479455341281761565L, this, new Integer(i), type, new Integer(i2), new Boolean(z));
            }
            if (i == 18) {
                int semantic = type.getSemantic();
                if (semantic != 3 && semantic != 5 && semantic != 7) {
                    if (semantic == 9) {
                        this.VH.cc(i2, z);
                        return;
                    }
                    switch (semantic) {
                        case 12:
                            break;
                        case 13:
                            this.VH.xg(i2, z);
                            return;
                        case 14:
                            this.VH.TI(i2, z);
                            return;
                        default:
                            return;
                    }
                }
                this.VH.GT(i2, z);
                return;
            }
            if (i == 35) {
                int semantic2 = type.getSemantic();
                if (semantic2 != 3 && semantic2 != 5 && semantic2 != 7) {
                    if (semantic2 == 9) {
                        this.VH.N0(i2, z);
                        return;
                    }
                    switch (semantic2) {
                        case 12:
                            break;
                        case 13:
                            this.VH.Yi(i2, z);
                            return;
                        case 14:
                            this.VH.E4(i2, z);
                            return;
                        default:
                            return;
                    }
                }
                this.VH.T6(i2, z);
                return;
            }
            if (i == 44) {
                int semantic3 = type.getSemantic();
                if (semantic3 != 3 && semantic3 != 5 && semantic3 != 7) {
                    if (semantic3 == 9) {
                        this.VH.d8(i2, z);
                        return;
                    }
                    switch (semantic3) {
                        case 12:
                            break;
                        case 13:
                            this.VH.dW(i2, z);
                            return;
                        case 14:
                            this.VH.sT(i2, z);
                            return;
                        default:
                            return;
                    }
                }
                this.VH.Ej(i2, z);
                return;
            }
            if (i == 45) {
                int semantic4 = type.getSemantic();
                if (semantic4 != 3 && semantic4 != 5 && semantic4 != 7) {
                    if (semantic4 == 9) {
                        this.VH.wE(i2, z);
                        return;
                    }
                    switch (semantic4) {
                        case 12:
                            break;
                        case 13:
                            this.VH.GK(i2, z);
                            return;
                        case 14:
                            this.VH.Lz(i2, z);
                            return;
                        default:
                            return;
                    }
                }
                this.VH.oh(i2, z);
                return;
            }
            if (i == 48) {
                int semantic5 = type.getSemantic();
                if (semantic5 != 3 && semantic5 != 5 && semantic5 != 7) {
                    if (semantic5 == 9) {
                        this.VH.om(i2, z);
                        return;
                    }
                    switch (semantic5) {
                        case 12:
                            break;
                        case 13:
                            this.VH.PH(i2, z);
                            return;
                        case 14:
                            this.VH.Fd(i2, z);
                            return;
                        default:
                            return;
                    }
                }
                this.VH.pl(i2, z);
                return;
            }
            if (i != 49) {
                return;
            }
            int semantic6 = type.getSemantic();
            if (semantic6 != 3 && semantic6 != 5 && semantic6 != 7) {
                if (semantic6 == 9) {
                    this.VH.Od(i2, z);
                    return;
                }
                switch (semantic6) {
                    case 12:
                        break;
                    case 13:
                        this.VH.hp(i2, z);
                        return;
                    case 14:
                        this.VH.ct(i2, z);
                        return;
                    default:
                        return;
                }
            }
            this.VH.Hl(i2, z);
        } catch (Throwable th) {
            if (yO) {
                iy.a8(th, 479455341281761565L, this, new Integer(i), type, new Integer(i2), new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 3138735386099916992L)
    private void Za(int i, Type type) {
        try {
            if (kQ) {
                iy.EQ(538169520203630217L, this, new Integer(i), type);
            }
            int semantic = type.getSemantic();
            if (semantic != 3 && semantic != 5 && semantic != 7) {
                if (semantic == 9) {
                    this.VH.gy(i);
                    return;
                }
                switch (semantic) {
                    case 11:
                    case 12:
                        break;
                    case 13:
                        this.VH.pO(i);
                        return;
                    case 14:
                        this.VH.mb(i);
                        return;
                    default:
                        this.VH.XX(i);
                        return;
                }
            }
            this.VH.zf(i);
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, 538169520203630217L, this, new Integer(i), type);
            }
            throw th;
        }
    }

    @ey(method = -888308564048370900L)
    private void Zo(Entity entity, boolean z) {
        try {
            if (kQ) {
                iy.EQ(3202579602735011359L, this, entity, new Boolean(z));
            }
            int i = this.rN;
            while (true) {
                int iGK = GK(entity, this.a8, i, z);
                this.rN = iGK;
                if (iGK != -1) {
                    return;
                } else {
                    this.a8 = new char[(this.a8.length * 2) + 1];
                }
            }
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, 3202579602735011359L, this, entity, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 2370272928304339875L)
    private void a5(Member member) {
        try {
            if (kQ) {
                iy.tp(982797028735831892L, this, member);
            }
            if (ti(member) && member.getIdentifier() == this.model.identifierSpace.get("onCreate") && member.getEnclosingClassType().getNamespace().getFullyQualifiedNameString().startsWith("com.aide.trainer.")) {
                this.VH.XX(0);
                this.VH.BJ(this.debuggerHostPackageName);
                this.VH.iK("TrainerRuntime", "broadcastRun", "(Landroid/content/Context;Ljava/lang/String;)V");
            }
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, 982797028735831892L, this, member);
            }
            throw th;
        }
    }

    @ey(method = 2743539367949861760L)
    private void a8(SyntaxTree syntaxTree, int i, Type type) {
        try {
            if (kQ) {
                iy.we(-880882964852396577L, this, syntaxTree, new Integer(i), type);
            }
            if (this.j6.qp(type) && syntaxTree.getSyntaxTag(i) == 231) {
                this.VH.nw();
                J0(syntaxTree, i);
                return;
            }
            char c = 0;
            int i2 = 0;
            if (type.isArrayType() && syntaxTree.getSyntaxTag(i) == 196) {
                Type elementType = ((ArrayType) type).getElementType();
                int childCount = syntaxTree.getChildCount(i);
                for (int i3 = 1; i3 < childCount; i3 += 2) {
                    if (syntaxTree.getSyntaxTag(syntaxTree.getChildNode(i, i3)) != 9) {
                        i2++;
                    }
                }
                this.VH.SI(i2);
                for (int i4 = 1; i4 < childCount; i4 += 2) {
                    int childNode = syntaxTree.getChildNode(i, i4);
                    if (syntaxTree.getSyntaxTag(childNode) != 9) {
                        a8(syntaxTree, childNode, elementType);
                    }
                }
                return;
            }
            if (!syntaxTree.hasAttrType(i) || !this.j6.Jl(type) || !this.j6.Jl(syntaxTree.getAttrType(i)) || !syntaxTree.hasAttrValue(i)) {
                if (syntaxTree.hasAttrType(i) && syntaxTree.getAttrType(i).isEnumType() && syntaxTree.getAttrType(i).isClassType() && syntaxTree.getSyntaxTag(i) == 161 && syntaxTree.sh(syntaxTree.getChildNode(i, syntaxTree.getChildCount(i) - 1)) == 16) {
                    Member member = (Member) syntaxTree.getAttrReferenceEntity(syntaxTree.getChildNode(i, syntaxTree.getChildCount(i) - 1));
                    oa(member.getEnclosingClassType(), true);
                    this.VH.ef(this.a8, 0, this.rN, member.getNameString());
                    return;
                }
                String str = "";
                if (syntaxTree.hasAttrType(i) && this.j6.oY(syntaxTree.getFile()) == syntaxTree.getAttrType(i)) {
                    String strZf = zf(syntaxTree, i);
                    if (strZf != null) {
                        str = strZf;
                    }
                    this.VH.dx(str);
                    return;
                }
                if (!syntaxTree.hasAttrType(i) || syntaxTree.getSyntaxTag(i) != 167 || !syntaxTree.hasAttrType(syntaxTree.getChildNode(i, 0))) {
                    this.VH.dx("");
                    return;
                } else {
                    oa(syntaxTree.getAttrType(syntaxTree.getChildNode(i, 0)), true);
                    this.VH.sG(this.a8, 0, this.rN);
                    return;
                }
            }
            int semantic = type.getSemantic();
            if (semantic == 3) {
                c = 'B';
            } else if (semantic == 5) {
                c = 'S';
            } else if (semantic == 7) {
                c = 'I';
            } else if (semantic != 9) {
                switch (semantic) {
                    case 11:
                        c = 'Z';
                        break;
                    case 12:
                        c = 'C';
                        break;
                    case 13:
                        c = 'F';
                        break;
                    case 14:
                        c = 'D';
                        break;
                }
            } else {
                c = 'J';
            }
            long jXX = this.entitySpace.XX(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getAttrValue(i), syntaxTree.getAttrType(i), type);
            int semantic2 = type.getSemantic();
            if (semantic2 != 3 && semantic2 != 5 && semantic2 != 7) {
                if (semantic2 == 9) {
                    j6 j6Var = this.VH;
                    this.entitySpace.ca(jXX);
                    j6Var.cb(c, jXX);
                    return;
                } else {
                    switch (semantic2) {
                        case 11:
                        case 12:
                            break;
                        case 13:
                            this.VH.cn(c, this.entitySpace.Mz(jXX));
                            return;
                        case 14:
                            this.VH.ro(c, this.entitySpace.g3(jXX));
                            return;
                        default:
                            return;
                    }
                }
            }
            this.VH.sh(c, this.entitySpace.I(jXX));
        } catch (Throwable th) {
            if (yO) {
                iy.U2(th, -880882964852396577L, this, syntaxTree, new Integer(i), type);
            }
            throw th;
        }
    }

    @ey(method = 1224178699549479048L)
    private void aM(SyntaxTree syntaxTree, int i, Type type) {
        try {
            if (kQ) {
                iy.we(5319720752236705215L, this, syntaxTree, new Integer(i), type);
            }
            int childCount = syntaxTree.getChildCount(i);
            int i2 = 0;
            for (int i3 = 1; i3 < childCount; i3 += 2) {
                int childNode = syntaxTree.getChildNode(i, i3);
                if (syntaxTree.getSyntaxTag(childNode) == 196 || syntaxTree.getSyntaxTag(childNode) != 9) {
                    i2++;
                }
            }
            this.VH.qP(i2);
            oa(type, false);
            this.VH.Lx(this.a8, 0, this.rN, 1);
            int i4 = 0;
            for (int i5 = 1; i5 < childCount; i5 += 2) {
                int childNode2 = syntaxTree.getChildNode(i, i5);
                Type elementType = ((ArrayType) type).getElementType();
                if (syntaxTree.getSyntaxTag(childNode2) == 196) {
                    this.VH.w9();
                    this.VH.qP(i4);
                    aM(syntaxTree, childNode2, elementType);
                    this.VH.OW();
                } else if (syntaxTree.getSyntaxTag(childNode2) != 9) {
                    this.VH.w9();
                    this.VH.qP(i4);
                    sy(syntaxTree, childNode2, false);
                    Mr(syntaxTree, elementType, syntaxTree.getAttrType(childNode2), true);
                }
                i4++;
            }
        } catch (Throwable th) {
            if (yO) {
                iy.U2(th, 5319720752236705215L, this, syntaxTree, new Integer(i), type);
            }
            throw th;
        }
    }

    @ey(method = 1344920967588569968L)
    private void aX(SyntaxTree syntaxTree, int i) throws Throwable {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        try {
            if (kQ) {
                iy.EQ(216886746218861433L, this, syntaxTree, new Integer(i7));
            }
            aq(syntaxTree.getStartLine(i));
            fN(syntaxTree, syntaxTree.getChildNode(i7, 0));
            sy(syntaxTree, syntaxTree.getChildNode(i7, 2), false);
            Type attrType = syntaxTree.getAttrType(syntaxTree.getChildNode(i7, 2));
            if (this.j6.zh(syntaxTree.getFile(), attrType)) {
                ys(syntaxTree, attrType);
                attrType = this.j6.ye(syntaxTree.getFile(), attrType);
            }
            int i8 = 1;
            if (this.vJ) {
                int childNode = syntaxTree.getChildNode(i7, 4);
                int childCount = syntaxTree.getChildCount(childNode);
                for (int i9 = 1; i9 < childCount - 1; i9++) {
                    int childNode2 = syntaxTree.getChildNode(childNode, i9);
                    if (syntaxTree.getSyntaxTag(childNode2) == 151) {
                        BR(syntaxTree, childNode2);
                    }
                }
            }
            if (!this.j6.Jl(attrType)) {
                int i10 = 9;
                if (attrType != this.j6.yO(syntaxTree.getFile())) {
                    int attrVariableSlot = syntaxTree.getAttrVariableSlot(i);
                    this.VH.XG(attrVariableSlot);
                    int iCN = this.VH.CN();
                    int iCN2 = this.VH.CN();
                    int iCN3 = this.VH.CN();
                    this.VH.IS(iCN3);
                    this.BT.tp(i7, iCN);
                    int childNode3 = syntaxTree.getChildNode(i7, 4);
                    int childCount2 = syntaxTree.getChildCount(childNode3);
                    boolean z = false;
                    for (int i11 = 1; i11 < childCount2; i11++) {
                        int childNode4 = syntaxTree.getChildNode(childNode3, i11);
                        int syntaxTag = syntaxTree.getSyntaxTag(childNode4);
                        if (syntaxTag == 9) {
                            this.VH.IS(iCN);
                        } else if (syntaxTag == 143) {
                            int iCN4 = this.VH.CN();
                            this.VH.IS(iCN4);
                            this.VH.sy(iCN3);
                            this.VH.XX(attrVariableSlot);
                            OW(syntaxTree, syntaxTree.getChildNode(childNode4, 1), false);
                            iCN3 = this.VH.CN();
                            this.VH.AR(iCN3, true);
                            fN(syntaxTree, syntaxTree.getChildNode(childNode4, 0));
                            this.VH.sy(iCN4);
                        } else if (syntaxTag != 144) {
                            sg(syntaxTree, childNode4);
                        } else {
                            int iCN5 = this.VH.CN();
                            this.VH.IS(iCN5);
                            this.VH.sy(iCN2);
                            fN(syntaxTree, syntaxTree.getChildNode(childNode4, 0));
                            this.VH.sy(iCN5);
                            z = true;
                        }
                    }
                    this.VH.sy(iCN3);
                    if (z) {
                        this.VH.IS(iCN2);
                    }
                    this.BT.we(i7);
                    this.VH.sy(iCN);
                    return;
                }
                int attrVariableSlot2 = syntaxTree.getAttrVariableSlot(i);
                this.VH.XG(attrVariableSlot2);
                int iCN6 = this.VH.CN();
                int iCN7 = this.VH.CN();
                int iCN8 = this.VH.CN();
                this.VH.IS(iCN8);
                this.BT.tp(i7, iCN6);
                int childNode5 = syntaxTree.getChildNode(i7, 4);
                int childCount3 = syntaxTree.getChildCount(childNode5);
                boolean z2 = false;
                int i12 = 1;
                while (i12 < childCount3) {
                    int childNode6 = syntaxTree.getChildNode(childNode5, i12);
                    int syntaxTag2 = syntaxTree.getSyntaxTag(childNode6);
                    if (syntaxTag2 == i10) {
                        i2 = attrVariableSlot2;
                        this.VH.IS(iCN6);
                    } else if (syntaxTag2 == 143) {
                        int iCN9 = this.VH.CN();
                        this.VH.IS(iCN9);
                        this.VH.sy(iCN8);
                        this.VH.XX(attrVariableSlot2);
                        OW(syntaxTree, syntaxTree.getChildNode(childNode6, 1), false);
                        iCN8 = this.VH.CN();
                        i2 = attrVariableSlot2;
                        this.VH.oT("java/lang/String", "equals", "(Ljava/lang/Object;)Z");
                        this.VH.qP(1);
                        this.VH.T6(iCN8, true);
                        fN(syntaxTree, syntaxTree.getChildNode(childNode6, 0));
                        this.VH.sy(iCN9);
                    } else if (syntaxTag2 != 144) {
                        sg(syntaxTree, childNode6);
                        i2 = attrVariableSlot2;
                    } else {
                        int iCN10 = this.VH.CN();
                        this.VH.IS(iCN10);
                        this.VH.sy(iCN7);
                        fN(syntaxTree, syntaxTree.getChildNode(childNode6, 0));
                        this.VH.sy(iCN10);
                        i2 = attrVariableSlot2;
                        z2 = true;
                    }
                    i12++;
                    attrVariableSlot2 = i2;
                    i10 = 9;
                }
                this.VH.sy(iCN8);
                if (z2) {
                    this.VH.IS(iCN7);
                }
                this.BT.we(i7);
                this.VH.sy(iCN6);
                return;
            }
            ListOfInt listOfInt = new ListOfInt();
            MapOfIntInt mapOfIntInt = new MapOfIntInt();
            listOfInt.clear();
            int childNode7 = syntaxTree.getChildNode(i7, 4);
            int childCount4 = syntaxTree.getChildCount(childNode7);
            int i13 = 1;
            while (true) {
                i3 = childCount4 - 1;
                if (i13 >= i3) {
                    break;
                }
                int childNode8 = syntaxTree.getChildNode(childNode7, i13);
                if (syntaxTree.getSyntaxTag(childNode8) == 143) {
                    listOfInt.add(this.entitySpace.I(syntaxTree.getAttrValue(syntaxTree.getChildNode(childNode8, i8))));
                }
                i13++;
                i8 = 1;
            }
            listOfInt.sort();
            int iCN11 = this.VH.CN();
            int iCN12 = this.VH.CN();
            int i14 = Integer.MAX_VALUE;
            if (listOfInt.size() * 2 >= (listOfInt.peek() - listOfInt.get(0)) + 1) {
                mapOfIntInt.clear();
                this.VH.UF(iCN12, listOfInt.get(0), listOfInt.peek());
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                for (int i18 = listOfInt.get(0); i18 <= listOfInt.peek(); i18++) {
                    if (listOfInt.get(i15) == i18) {
                        int iCN13 = this.VH.CN();
                        if (listOfInt.get(i15) == Integer.MIN_VALUE) {
                            i16 = iCN13;
                        } else if (listOfInt.get(i15) == Integer.MAX_VALUE) {
                            i17 = iCN13;
                        } else {
                            mapOfIntInt.tp(listOfInt.get(i15), iCN13);
                        }
                        this.VH.rB(iCN13);
                        i15++;
                    } else {
                        this.VH.rB(iCN12);
                    }
                    if (i18 == Integer.MAX_VALUE) {
                        break;
                    }
                }
                i4 = i16;
                i5 = i17;
            } else {
                mapOfIntInt.clear();
                this.VH.tv(iCN12, listOfInt.size());
                int i19 = 0;
                i4 = 0;
                i5 = 0;
                while (i19 < listOfInt.size()) {
                    int iCN14 = this.VH.CN();
                    if (listOfInt.get(i19) == Integer.MIN_VALUE) {
                        i4 = iCN14;
                    } else if (listOfInt.get(i19) == i14) {
                        i5 = iCN14;
                    } else {
                        mapOfIntInt.tp(listOfInt.get(i19), iCN14);
                    }
                    this.VH.gM(listOfInt.get(i19), iCN14);
                    i19++;
                    i14 = Integer.MAX_VALUE;
                }
            }
            this.BT.tp(i7, iCN11);
            int i20 = 1;
            boolean z3 = false;
            int iCN15 = -1;
            while (i20 < i3) {
                try {
                    int childNode9 = syntaxTree.getChildNode(childNode7, i20);
                    int syntaxTag3 = syntaxTree.getSyntaxTag(childNode9);
                    if (syntaxTag3 == 143) {
                        if (this.vJ) {
                            if (iCN15 == -1) {
                                iCN15 = this.VH.CN();
                            }
                            this.VH.IS(iCN15);
                        }
                        i6 = iCN15;
                        int I = this.entitySpace.I(syntaxTree.getAttrValue(syntaxTree.getChildNode(childNode9, 1)));
                        if (I == Integer.MIN_VALUE) {
                            this.VH.sy(i4);
                        } else if (I == Integer.MAX_VALUE) {
                            this.VH.sy(i5);
                        } else {
                            this.VH.sy(mapOfIntInt.VH(I));
                        }
                        fN(syntaxTree, syntaxTree.getChildNode(childNode9, 0));
                    } else if (syntaxTag3 != 144) {
                        if (this.vJ && iCN15 != -1) {
                            this.VH.sy(iCN15);
                            iCN15 = -1;
                        }
                        sg(syntaxTree, childNode9);
                        i6 = iCN15;
                    } else {
                        if (this.vJ) {
                            if (iCN15 == -1) {
                                iCN15 = this.VH.CN();
                            }
                            this.VH.IS(iCN15);
                        }
                        this.VH.sy(iCN12);
                        fN(syntaxTree, syntaxTree.getChildNode(childNode9, 0));
                        i6 = iCN15;
                        z3 = true;
                    }
                    i20++;
                    iCN15 = i6;
                } catch (Throwable th) {
                    th = th;
                    i7 = i;
                    if (yO) {
                        iy.Mr(th, 216886746218861433L, this, syntaxTree, new Integer(i7));
                    }
                    throw th;
                }
            }
            if (this.vJ && iCN15 != -1) {
                this.VH.sy(iCN15);
            }
            if (!z3) {
                this.VH.sy(iCN12);
            }
            this.BT.we(i);
            this.VH.sy(iCN11);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @ey(method = -31697152617764573L)
    private void aj(SyntaxTree syntaxTree, int i) {
        try {
            if (kQ) {
                iy.EQ(4959416901147014968L, this, syntaxTree, new Integer(i));
            }
            if (this.vJ) {
                this.VH.XX(this.U2);
                this.VH.qP(syntaxTree.getStartLine(i));
                this.VH.oT("adrt/ADRTThread", "onStatementStart", "(I)V");
            }
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, 4959416901147014968L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 2793964678634786272L)
    private void aq(int i) {
        try {
            if (kQ) {
                iy.u7(666994065529906725L, this, i);
            }
            this.VH.ei(i);
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, 666994065529906725L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2680431691396013892L)
    private boolean b(Entity entity, Entity entity2) {
        int iGK;
        int iGK2;
        try {
            if (kQ) {
                iy.EQ(1786504574452426725L, this, entity, entity2);
            }
            if (entity == entity2) {
                return true;
            }
            char[] cArr = new char[10];
            char[] cArr2 = new char[10];
            while (true) {
                try {
                    iGK = GK(entity, cArr, 0, true);
                    if (iGK != -1) {
                        break;
                    }
                    cArr = new char[(cArr.length * 2) + 1];
                } catch (e4 unused) {
                }
            }
            while (true) {
                iGK2 = GK(entity2, cArr2, 0, true);
                if (iGK2 != -1) {
                    break;
                }
                cArr2 = new char[(cArr2.length * 2) + 1];
            }
            if (iGK != iGK2) {
                return false;
            }
            for (int i = 0; i < iGK; i++) {
                if (cArr[i] != cArr2[i]) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, 1786504574452426725L, this, entity, entity2);
            }
            throw th;
        }
    }

    @ey(method = 1306628391335538687L)
    private void b1(int i) {
        try {
            if (kQ) {
                iy.u7(-3464521902208788240L, this, i);
            }
            while (true) {
                int iZo = this.DW.Zo(i, this.yS, 0);
                this.gW = iZo;
                if (iZo != -1) {
                    return;
                } else {
                    this.yS = new char[(this.yS.length * 2) + 1];
                }
            }
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, -3464521902208788240L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 559956088063317495L)
    private boolean ba(Member member, Member member2) {
        try {
            if (kQ) {
                iy.EQ(169198520912310240L, this, member, member2);
            }
            if (!b(member.WB(), member2.WB())) {
                return false;
            }
            int iOY = member.oY();
            for (int i = 0; i < iOY; i++) {
                if (!b(member.qp(i), member2.qp(i))) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, 169198520912310240L, this, member, member2);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c9 A[Catch: all -> 0x00e8, TryCatch #0 {all -> 0x00e8, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0017, B:8:0x006a, B:10:0x0078, B:18:0x008d, B:19:0x0090, B:20:0x009a, B:21:0x00aa, B:22:0x00ba, B:23:0x00c9, B:24:0x00d8, B:26:0x00e0), top: B:33:0x0006 }] */
    @abcd.ey(method = 3310896700851234845L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void br(com.aide.codemodel.api.SyntaxTree r19, int r20) {
        /*
            r18 = this;
            r7 = r18
            r5 = r19
            r1 = r20
            boolean r0 = com.aide.codemodel.language.java.JavaCompiler.kQ     // Catch: java.lang.Throwable -> Le8
            if (r0 == 0) goto L17
            r2 = -1375517880547183296(0xece92dc683c97540, double:-4.3399238207355264E216)
            java.lang.Integer r0 = new java.lang.Integer     // Catch: java.lang.Throwable -> Le8
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Le8
            abcd.iy.EQ(r2, r7, r5, r0)     // Catch: java.lang.Throwable -> Le8
        L17:
            com.aide.codemodel.api.EntitySpace r0 = r7.entitySpace     // Catch: java.lang.Throwable -> Le8
            com.aide.codemodel.api.FileEntry r2 = r19.getFile()     // Catch: java.lang.Throwable -> Le8
            com.aide.codemodel.api.abstraction.Language r3 = r19.getLanguage()     // Catch: java.lang.Throwable -> Le8
            int r4 = r19.getDeclarationNumber(r20)     // Catch: java.lang.Throwable -> Le8
            com.aide.codemodel.api.Member r0 = r0.jw(r2, r3, r4)     // Catch: java.lang.Throwable -> Le8
            r2 = 0
            r7.oa(r0, r2)     // Catch: java.lang.Throwable -> Le8
            r3 = 1
            int r9 = r7.E4(r0, r3)     // Catch: java.lang.Throwable -> Le8
            int r3 = r0.getIdentifier()     // Catch: java.lang.Throwable -> Le8
            int r3 = r7.pn(r3, r0)     // Catch: java.lang.Throwable -> Le8
            boolean r4 = r0.w9()     // Catch: java.lang.Throwable -> Le8
            boolean r6 = r0.q7()     // Catch: java.lang.Throwable -> Le8
            r4 = r4 | r6
            r7.b1(r3)     // Catch: java.lang.Throwable -> Le8
            abcd.j6 r8 = r7.VH     // Catch: java.lang.Throwable -> Le8
            char[] r10 = r7.yS     // Catch: java.lang.Throwable -> Le8
            r11 = 0
            int r12 = r7.gW     // Catch: java.lang.Throwable -> Le8
            char[] r13 = r7.a8     // Catch: java.lang.Throwable -> Le8
            r14 = 0
            int r15 = r7.rN     // Catch: java.lang.Throwable -> Le8
            r16 = 0
            r17 = r4
            r8.lg(r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> Le8
            int r3 = r19.getParentNode(r20)     // Catch: java.lang.Throwable -> Le8
            int r3 = r5.getChildNode(r3, r2)     // Catch: java.lang.Throwable -> Le8
            r7.J8(r5, r3)     // Catch: java.lang.Throwable -> Le8
            boolean r3 = r7.tj(r0)     // Catch: java.lang.Throwable -> Le8
            if (r3 == 0) goto L76
            r7.AR(r0)     // Catch: java.lang.Throwable -> Le8
            abcd.j6 r3 = r7.VH     // Catch: java.lang.Throwable -> Le8
            char[] r6 = r7.a8     // Catch: java.lang.Throwable -> Le8
            int r8 = r7.rN     // Catch: java.lang.Throwable -> Le8
            r3.Qq(r6, r2, r8)     // Catch: java.lang.Throwable -> Le8
        L76:
            if (r4 == 0) goto Ld8
            com.aide.codemodel.api.Type r2 = r0.WB()     // Catch: java.lang.Throwable -> Le8
            int r2 = r2.getSemantic()     // Catch: java.lang.Throwable -> Le8
            r3 = 3
            if (r2 == r3) goto Lc9
            r3 = 5
            if (r2 == r3) goto Lc9
            r3 = 7
            if (r2 == r3) goto Lc9
            r3 = 9
            if (r2 == r3) goto Lba
            switch(r2) {
                case 11: goto Lc9;
                case 12: goto Lc9;
                case 13: goto Laa;
                case 14: goto L9a;
                default: goto L90;
            }     // Catch: java.lang.Throwable -> Le8
        L90:
            abcd.j6 r2 = r7.VH     // Catch: java.lang.Throwable -> Le8
            java.lang.String r3 = r0.ye()     // Catch: java.lang.Throwable -> Le8
            r2.BT(r3)     // Catch: java.lang.Throwable -> Le8
            goto Ld8
        L9a:
            abcd.j6 r2 = r7.VH     // Catch: java.lang.Throwable -> Le8
            com.aide.codemodel.api.EntitySpace r3 = r7.entitySpace     // Catch: java.lang.Throwable -> Le8
            long r8 = r0.br()     // Catch: java.lang.Throwable -> Le8
            double r3 = r3.g3(r8)     // Catch: java.lang.Throwable -> Le8
            r2.rN(r3)     // Catch: java.lang.Throwable -> Le8
            goto Ld8
        Laa:
            abcd.j6 r2 = r7.VH     // Catch: java.lang.Throwable -> Le8
            com.aide.codemodel.api.EntitySpace r3 = r7.entitySpace     // Catch: java.lang.Throwable -> Le8
            long r8 = r0.br()     // Catch: java.lang.Throwable -> Le8
            float r3 = r3.Mz(r8)     // Catch: java.lang.Throwable -> Le8
            r2.er(r3)     // Catch: java.lang.Throwable -> Le8
            goto Ld8
        Lba:
            abcd.j6 r2 = r7.VH     // Catch: java.lang.Throwable -> Le8
            com.aide.codemodel.api.EntitySpace r3 = r7.entitySpace     // Catch: java.lang.Throwable -> Le8
            long r8 = r0.br()     // Catch: java.lang.Throwable -> Le8
            r3.ca(r8)     // Catch: java.lang.Throwable -> Le8
            r2.gW(r8)     // Catch: java.lang.Throwable -> Le8
            goto Ld8
        Lc9:
            abcd.j6 r2 = r7.VH     // Catch: java.lang.Throwable -> Le8
            com.aide.codemodel.api.EntitySpace r3 = r7.entitySpace     // Catch: java.lang.Throwable -> Le8
            long r8 = r0.br()     // Catch: java.lang.Throwable -> Le8
            int r3 = r3.I(r8)     // Catch: java.lang.Throwable -> Le8
            r2.yS(r3)     // Catch: java.lang.Throwable -> Le8
        Ld8:
            com.aide.codemodel.api.collections.SetOf<com.aide.codemodel.api.Entity> r2 = r7.EQ     // Catch: java.lang.Throwable -> Le8
            boolean r2 = r2.contains(r0)     // Catch: java.lang.Throwable -> Le8
            if (r2 == 0) goto Le7
            com.aide.codemodel.api.ClassType r2 = r0.getEnclosingClassType()     // Catch: java.lang.Throwable -> Le8
            r7.XX(r5, r2, r0)     // Catch: java.lang.Throwable -> Le8
        Le7:
            return
        Le8:
            r0 = move-exception
            boolean r2 = com.aide.codemodel.language.java.JavaCompiler.yO
            if (r2 == 0) goto Lff
            r2 = -1375517880547183296(0xece92dc683c97540, double:-4.3399238207355264E216)
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r1)
            r1 = r0
            r4 = r18
            r5 = r19
            abcd.iy.Mr(r1, r2, r4, r5, r6)
        Lff:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.java.JavaCompiler.br(com.aide.codemodel.api.SyntaxTree, int):void");
    }

    @ey(method = 2728904264353275096L)
    private void cT(SyntaxTree syntaxTree, int i) {
        try {
            if (kQ) {
                iy.EQ(730401603873600189L, this, syntaxTree, new Integer(i));
            }
            int childCount = syntaxTree.getChildCount(i);
            for (int i2 = 2; i2 < childCount - 2; i2++) {
                int childNode = syntaxTree.getChildNode(i, i2);
                int childCount2 = syntaxTree.getChildCount(childNode);
                for (int i3 = 3; i3 < childCount2; i3 += 2) {
                    int attrVariableSlot = syntaxTree.getAttrVariableSlot(syntaxTree.getChildNode(syntaxTree.getChildNode(childNode, i3), 0));
                    this.VH.br();
                    this.VH.XG(attrVariableSlot);
                }
            }
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, 730401603873600189L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 572256649881725523L)
    private void ca(ClassType classType, int i) {
        try {
            if (kQ) {
                iy.EQ(-6361229010502850608L, this, classType, new Integer(i));
            }
            this.VH.XX(0);
            this.VH.XX(i);
            ClassType enclosingClassType = classType.getEnclosingClassType();
            oa(this.XL, false);
            qP(enclosingClassType, true);
            this.VH.zg(this.a8, 0, this.rN, wE(), this.lg, 0, this.er);
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, -6361229010502850608L, this, classType, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 1123508877277889935L)
    private void cb(SyntaxTree syntaxTree, Member member) {
        try {
            if (kQ) {
                iy.EQ(-158273232159120372L, this, syntaxTree, member);
            }
            ClassType enclosingClassType = member.getEnclosingClassType();
            if (this.J8.v5(enclosingClassType.getId())) {
                oa(enclosingClassType, false);
                qP(member, false);
                this.er -= 2;
                this.J8.default_Iterator.FH(enclosingClassType.getId());
                while (this.J8.default_Iterator.hasMoreElements()) {
                    VH(syntaxTree.getAttrType(this.J8.default_Iterator.nextValue()), true);
                }
                char[] cArr = this.lg;
                int i = this.er;
                int i2 = i + 1;
                this.er = i2;
                cArr[i] = ')';
                char[] cArr2 = this.lg;
                this.er = i2 + 1;
                cArr2[i2] = 'V';
            } else {
                oa(enclosingClassType, false);
                qP(member, false);
            }
            this.VH.ti(this.a8, 0, this.rN, "<init>", this.lg, 0, this.er);
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, -158273232159120372L, this, syntaxTree, member);
            }
            throw th;
        }
    }

    @ey(method = -1442059134346548984L)
    private String cc(Member member) {
        try {
            if (kQ) {
                iy.tp(282427480607468469L, this, member);
            }
            if (member.ro()) {
                return "access$" + member.DW();
            }
            return "access$" + x6(member.getEnclosingClassType().getFullyQualifiedNameString()) + "$" + member.DW();
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, 282427480607468469L, this, member);
            }
            throw th;
        }
    }

    @ey(method = 1133012639921989193L)
    private void ce(boolean z, boolean z2, String str, String[] strArr) {
        try {
            if (kQ) {
                iy.J0(-2762911123210505368L, this, new Boolean(z), new Boolean(z2), str, strArr);
            }
            for (String str2 : strArr) {
                OutputStream outputStreamNw = this.model.j3.nw(this.XL.getFile(), str, str2, z, z2);
                if (outputStreamNw != null) {
                    try {
                        InputStream resourceInputStream = DebuggerResourceProvider.getDefProvider().getResourceInputStream(str + str2 + ".class");
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int i = resourceInputStream.read(bArr);
                            if (i == -1) {
                                break;
                            } else {
                                outputStreamNw.write(bArr, 0, i);
                            }
                        }
                        outputStreamNw.close();
                        resourceInputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (Throwable th) {
            if (yO) {
                iy.a8(th, -2762911123210505368L, this, new Boolean(z), new Boolean(z2), str, strArr);
            }
            throw th;
        }
    }

    @ey(method = 2379819537318603863L)
    private void cn(SyntaxTree syntaxTree, int i) {
        int i2;
        boolean z;
        try {
            if (kQ) {
                iy.EQ(442832957997357280L, this, syntaxTree, new Integer(i));
            }
            Member memberJw = this.entitySpace.jw(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getDeclarationNumber(i));
            this.U2 = syntaxTree.getAttrVariableSlot(i);
            ClassType enclosingClassType = memberJw.getEnclosingClassType();
            oa(memberJw, false);
            this.rN -= 2;
            this.J8.default_Iterator.FH(enclosingClassType.getId());
            while (this.J8.default_Iterator.hasMoreElements()) {
                Zo(syntaxTree.getAttrType(this.J8.default_Iterator.nextValue()), true);
            }
            char[] cArr = this.a8;
            int i3 = this.rN;
            int i4 = i3 + 1;
            this.rN = i4;
            cArr[i3] = ')';
            char[] cArr2 = this.a8;
            this.rN = i4 + 1;
            cArr2[i4] = 'V';
            int iE4 = E4(memberJw, true) & (-3);
            if (!memberJw.Z1()) {
                i2 = iE4;
                z = false;
            } else if (this.ca) {
                iE4 |= 128;
                i2 = iE4;
                z = false;
            } else {
                i2 = iE4;
                z = true;
            }
            this.VH.Mz(i2, "<init>", this.a8, 0, this.rN, false, z, true);
            int childNode = syntaxTree.getChildNode(i, 4);
            int childCount = syntaxTree.getChildCount(childNode);
            for (int i5 = 1; i5 < childCount; i5 += 2) {
                Type attrType = syntaxTree.getAttrType(syntaxTree.getChildNode(childNode, i5));
                if (this.j6.w9(syntaxTree.getFile(), attrType)) {
                    oa(attrType, false);
                    this.VH.ca(this.a8, 0, this.rN);
                }
            }
            if (tj(memberJw)) {
                AR(memberJw);
                this.VH.Qq(this.a8, 0, this.rN);
            }
            int iCN = this.VH.CN();
            if (!this.g3) {
                e9();
                oa(this.XL, false);
                this.VH.a5(this.a8, 0, this.rN, PH(memberJw), "Z");
                this.VH.Of(iCN, true);
            }
            this.QX = this.VH.CN();
            QO();
            eU(syntaxTree, syntaxTree.getChildNode(i, 3), true, memberJw);
            sh(syntaxTree, syntaxTree.getChildNode(i, 5), memberJw);
            this.VH.sy(this.QX);
            this.VH.IM();
            if (this.g3) {
                return;
            }
            e9();
            this.vJ = true;
            this.VH.sy(iCN);
            int iCN2 = this.VH.CN();
            int iCN3 = this.VH.CN();
            k2(syntaxTree, i);
            this.VH.sy(iCN2);
            this.QX = this.VH.CN();
            QO();
            Sf(syntaxTree, syntaxTree.getChildNode(i, 3));
            sh(syntaxTree, syntaxTree.getChildNode(i, 5), memberJw);
            this.VH.sy(this.QX);
            WB(syntaxTree, syntaxTree.getChildNode(i, 5));
            ye(syntaxTree, i);
            this.VH.IM();
            this.VH.sy(iCN3);
            this.VH.j3(iCN2, iCN3);
            mb(syntaxTree, i);
            this.VH.jJ();
            this.vJ = false;
            hz();
            if (this.VH.Dm() > 32000) {
                this.VH.FH();
                this.QX = this.VH.CN();
                QO();
                eU(syntaxTree, syntaxTree.getChildNode(i, 3), true, memberJw);
                sh(syntaxTree, syntaxTree.getChildNode(i, 5), memberJw);
                this.VH.sy(this.QX);
                this.VH.IM();
            }
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, 442832957997357280L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 4079652214019884608L)
    private Type ct(SyntaxTree syntaxTree, int i, Type type, Type type2) {
        try {
            if (kQ) {
                iy.J0(-2288009626978434075L, this, syntaxTree, new Integer(i), type, type2);
            }
            int i2 = 21;
            if (i == 20) {
                i2 = 3;
            } else if (i == 23) {
                i2 = 1;
            } else if (i == 29) {
                i2 = 2;
            } else if (i == 31) {
                i2 = 5;
            } else if (i == 33) {
                i2 = 4;
            } else if (i == 37) {
                i2 = 8;
            } else if (i == 40) {
                i2 = 6;
            } else if (i == 43) {
                i2 = 7;
            } else if (i == 47) {
                i2 = 17;
            } else if (i == 52) {
                i2 = 18;
            } else if (i == 53) {
                i2 = 19;
            }
            return this.j6.er(syntaxTree.getFile(), i2, type, type2);
        } catch (Throwable th) {
            if (yO) {
                iy.a8(th, -2288009626978434075L, this, syntaxTree, new Integer(i), type, type2);
            }
            throw th;
        }
    }

    @ey(method = 2975471089369479155L)
    private String d8() {
        try {
            if (!kQ) {
                return "access$0";
            }
            iy.gn(503805299238932664L, this);
            return "access$0";
        } catch (Throwable th) {
            if (yO) {
                iy.aM(th, 503805299238932664L, this);
            }
            throw th;
        }
    }

    @ey(method = 6640485358728690720L)
    private char dW(Entity entity) {
        try {
            if (kQ) {
                iy.tp(2076440902133099535L, this, entity);
            }
            switch (((Type) entity).getSemantic()) {
                case 1:
                    return 'V';
                case 2:
                    return 'N';
                case 3:
                    return 'B';
                case 4:
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                case 8:
                case 10:
                default:
                    return (char) 0;
                case 5:
                    return 'S';
                case UserTouchAction.CLICK_KIND /* 7 */:
                    return 'I';
                case 9:
                    return 'J';
                case 11:
                    return 'Z';
                case 12:
                    return 'C';
                case 13:
                    return 'F';
                case 14:
                    return 'D';
            }
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, 2076440902133099535L, this, entity);
            }
            throw th;
        }
    }

    @ey(method = 584979687474623840L)
    private void dx(SyntaxTree syntaxTree, Type type, Type type2) {
        try {
            if (kQ) {
                iy.we(-2559878518981339205L, this, syntaxTree, type, type2);
            }
            if (type == type2) {
                return;
            }
            if (type.isArrayType() && type2.isArrayType() && ((ArrayType) type).FN().isMethodParameterTypeVariable()) {
                oa(type2, false);
                this.VH.hz(this.a8, 0, this.rN);
                return;
            }
            if (type.isMethodParameterTypeVariable()) {
                if (type2 != this.j6.Eq(syntaxTree.getFile())) {
                    oa(type2, false);
                    this.VH.hz(this.a8, 0, this.rN);
                    return;
                }
                return;
            }
            if (this.j6.Jl(type) && this.j6.iW(type2)) {
                if (type2 == this.j6.Eq(syntaxTree.getFile())) {
                    gW(type);
                    return;
                }
                try {
                    Type typeYe = this.j6.ye(syntaxTree.getFile(), type2);
                    e3(type, typeYe);
                    gW(typeYe);
                    return;
                } catch (e4 unused) {
                    gW(type);
                    return;
                }
            }
            if (this.j6.Jl(type2) && this.j6.iW(type)) {
                if (type == this.j6.lp(syntaxTree.getFile())) {
                    ys(syntaxTree, this.j6.Hw(syntaxTree.getFile(), type2));
                    return;
                } else {
                    ys(syntaxTree, type);
                    e3(this.j6.ye(syntaxTree.getFile(), type), type2);
                    return;
                }
            }
            if (type.getSemantic() != 2) {
                e3(type, type2);
            } else {
                oa(type2, false);
                this.VH.hz(this.a8, 0, this.rN);
            }
        } catch (Throwable th) {
            if (yO) {
                iy.U2(th, -2559878518981339205L, this, syntaxTree, type, type2);
            }
            throw th;
        }
    }

    @ey(method = -478719028209783240L)
    private void e3(Type type, Type type2) {
        try {
            if (kQ) {
                iy.EQ(-96200935813341205L, this, type, type2);
            }
            if (type == type2) {
                return;
            }
            int semantic = type.getSemantic();
            if (semantic == 3) {
                int semantic2 = type2.getSemantic();
                if (semantic2 == 5) {
                    this.VH.Pa();
                    return;
                }
                if (semantic2 == 9) {
                    this.VH.An();
                    return;
                }
                switch (semantic2) {
                    case 12:
                        this.VH.BR();
                        return;
                    case 13:
                        this.VH.Za();
                        return;
                    case 14:
                        this.VH.AE();
                        return;
                    default:
                        return;
                }
            }
            if (semantic == 5) {
                int semantic3 = type2.getSemantic();
                if (semantic3 == 3) {
                    this.VH.Nh();
                    return;
                }
                if (semantic3 == 9) {
                    this.VH.An();
                    return;
                }
                switch (semantic3) {
                    case 12:
                        this.VH.BR();
                        return;
                    case 13:
                        this.VH.Za();
                        return;
                    case 14:
                        this.VH.AE();
                        return;
                    default:
                        return;
                }
            }
            if (semantic == 7) {
                int semantic4 = type2.getSemantic();
                if (semantic4 == 3) {
                    this.VH.Nh();
                    return;
                }
                if (semantic4 == 5) {
                    this.VH.Pa();
                    return;
                }
                if (semantic4 == 9) {
                    this.VH.An();
                    return;
                }
                switch (semantic4) {
                    case 12:
                        this.VH.BR();
                        return;
                    case 13:
                        this.VH.Za();
                        return;
                    case 14:
                        this.VH.AE();
                        return;
                    default:
                        return;
                }
            }
            if (semantic == 9) {
                int semantic5 = type2.getSemantic();
                if (semantic5 == 3) {
                    this.VH.Vq();
                    this.VH.Nh();
                    return;
                }
                if (semantic5 == 5) {
                    this.VH.Vq();
                    this.VH.Pa();
                    return;
                }
                if (semantic5 == 7) {
                    this.VH.Vq();
                    return;
                }
                switch (semantic5) {
                    case 12:
                        this.VH.Vq();
                        this.VH.BR();
                        return;
                    case 13:
                        this.VH.RW();
                        return;
                    case 14:
                        this.VH.k4();
                        return;
                    default:
                        return;
                }
            }
            switch (semantic) {
                case 12:
                    int semantic6 = type2.getSemantic();
                    if (semantic6 == 3) {
                        this.VH.Nh();
                        return;
                    }
                    if (semantic6 == 5) {
                        this.VH.Pa();
                        return;
                    }
                    if (semantic6 == 9) {
                        this.VH.An();
                        return;
                    } else if (semantic6 == 13) {
                        this.VH.Za();
                        return;
                    } else {
                        if (semantic6 != 14) {
                            return;
                        }
                        this.VH.AE();
                        return;
                    }
                case 13:
                    int semantic7 = type2.getSemantic();
                    if (semantic7 == 3) {
                        this.VH.kf();
                        this.VH.Nh();
                        return;
                    }
                    if (semantic7 == 5) {
                        this.VH.kf();
                        this.VH.Pa();
                        return;
                    }
                    if (semantic7 == 7) {
                        this.VH.kf();
                        return;
                    }
                    if (semantic7 == 9) {
                        this.VH.Jl();
                        return;
                    }
                    if (semantic7 == 12) {
                        this.VH.kf();
                        this.VH.BR();
                        return;
                    } else {
                        if (semantic7 != 14) {
                            return;
                        }
                        this.VH.Q6();
                        return;
                    }
                case 14:
                    int semantic8 = type2.getSemantic();
                    if (semantic8 == 3) {
                        this.VH.FN();
                        this.VH.Nh();
                        return;
                    }
                    if (semantic8 == 5) {
                        this.VH.FN();
                        this.VH.Pa();
                        return;
                    }
                    if (semantic8 == 7) {
                        this.VH.FN();
                        return;
                    }
                    if (semantic8 == 9) {
                        this.VH.jO();
                        return;
                    }
                    if (semantic8 == 12) {
                        this.VH.FN();
                        this.VH.BR();
                        return;
                    } else {
                        if (semantic8 != 13) {
                            return;
                        }
                        this.VH.aq();
                        return;
                    }
                default:
                    return;
            }
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, -96200935813341205L, this, type, type2);
            }
            throw th;
        }
    }

    @ey(method = 4335459005159019913L)
    private void e9() {
        try {
            if (kQ) {
                iy.gn(2062648762287908864L, this);
            }
        } catch (Throwable th) {
            if (yO) {
                iy.aM(th, 2062648762287908864L, this);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x010a  */
    @abcd.ey(method = 1978096006859143455L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int eN(com.aide.codemodel.api.ParameterizedType r15, com.aide.codemodel.api.ClassType r16, int r17, char[] r18, int r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.java.JavaCompiler.eN(com.aide.codemodel.api.ParameterizedType, com.aide.codemodel.api.ClassType, int, char[], int):int");
    }

    @ey(method = -1934973482372606821L)
    private void eU(SyntaxTree syntaxTree, int i, boolean z, Member member) throws Throwable {
        try {
            if (kQ) {
                iy.J0(-1102328224231598320L, this, syntaxTree, new Integer(i), new Boolean(z), member);
            }
            int childCount = syntaxTree.getChildCount(i);
            if (childCount > 2) {
                for (int i2 = 1; i2 < childCount - 1; i2 += 2) {
                    int childNode = syntaxTree.getChildNode(i, i2);
                    if (syntaxTree.getSyntaxTag(childNode) == 191) {
                        int childNode2 = syntaxTree.getChildNode(childNode, 3);
                        int identifier = syntaxTree.getIdentifier(childNode2);
                        int attrVariableSlot = syntaxTree.getAttrVariableSlot(childNode2);
                        Type attrType = syntaxTree.getAttrType(childNode2);
                        oa(attrType, true);
                        b1(identifier);
                        if (this.lp && z) {
                            this.VH.aj(this.QX, attrVariableSlot, this.yS, 0, this.gW, this.a8, 0, this.rN);
                        } else {
                            try {
                                if (!HO(member)) {
                                    this.VH.x9(attrVariableSlot, this.yS, 0, this.gW, this.a8, 0, this.rN);
                                }
                            } catch (Throwable th) {
                                th = th;
                                if (yO) {
                                    iy.a8(th, -1102328224231598320L, this, syntaxTree, new Integer(i), new Boolean(z), member);
                                }
                                throw th;
                            }
                        }
                        Eq(attrType);
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ad A[Catch: all -> 0x012e, TryCatch #0 {all -> 0x012e, blocks: (B:2:0x0000, B:4:0x0004, B:5:0x0011, B:7:0x0037, B:9:0x005d, B:11:0x0065, B:17:0x0075, B:19:0x00ad, B:20:0x00b3, B:21:0x00c6, B:23:0x00ca, B:24:0x00d4, B:26:0x00e9, B:28:0x00f4, B:30:0x0110, B:32:0x0122, B:33:0x0128, B:27:0x00ef, B:8:0x005a), top: B:42:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ca A[Catch: all -> 0x012e, LOOP:0: B:21:0x00c6->B:23:0x00ca, LOOP_END, TryCatch #0 {all -> 0x012e, blocks: (B:2:0x0000, B:4:0x0004, B:5:0x0011, B:7:0x0037, B:9:0x005d, B:11:0x0065, B:17:0x0075, B:19:0x00ad, B:20:0x00b3, B:21:0x00c6, B:23:0x00ca, B:24:0x00d4, B:26:0x00e9, B:28:0x00f4, B:30:0x0110, B:32:0x0122, B:33:0x0128, B:27:0x00ef, B:8:0x005a), top: B:42:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e9 A[Catch: all -> 0x012e, TryCatch #0 {all -> 0x012e, blocks: (B:2:0x0000, B:4:0x0004, B:5:0x0011, B:7:0x0037, B:9:0x005d, B:11:0x0065, B:17:0x0075, B:19:0x00ad, B:20:0x00b3, B:21:0x00c6, B:23:0x00ca, B:24:0x00d4, B:26:0x00e9, B:28:0x00f4, B:30:0x0110, B:32:0x0122, B:33:0x0128, B:27:0x00ef, B:8:0x005a), top: B:42:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ef A[Catch: all -> 0x012e, TryCatch #0 {all -> 0x012e, blocks: (B:2:0x0000, B:4:0x0004, B:5:0x0011, B:7:0x0037, B:9:0x005d, B:11:0x0065, B:17:0x0075, B:19:0x00ad, B:20:0x00b3, B:21:0x00c6, B:23:0x00ca, B:24:0x00d4, B:26:0x00e9, B:28:0x00f4, B:30:0x0110, B:32:0x0122, B:33:0x0128, B:27:0x00ef, B:8:0x005a), top: B:42:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0110 A[Catch: all -> 0x012e, TryCatch #0 {all -> 0x012e, blocks: (B:2:0x0000, B:4:0x0004, B:5:0x0011, B:7:0x0037, B:9:0x005d, B:11:0x0065, B:17:0x0075, B:19:0x00ad, B:20:0x00b3, B:21:0x00c6, B:23:0x00ca, B:24:0x00d4, B:26:0x00e9, B:28:0x00f4, B:30:0x0110, B:32:0x0122, B:33:0x0128, B:27:0x00ef, B:8:0x005a), top: B:42:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @abcd.ey(method = -670081024128458577L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void ef(com.aide.codemodel.api.SyntaxTree r14, int r15) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.java.JavaCompiler.ef(com.aide.codemodel.api.SyntaxTree, int):void");
    }

    @ey(method = -3449427631416202667L)
    private void ei(Type type, int i) {
        try {
            if (kQ) {
                iy.EQ(852178879891671776L, this, type, new Integer(i));
            }
            if (!this.j6.Jl(type) && type.getSemantic() != 1) {
                int iCN = this.VH.CN();
                int iCN2 = this.VH.CN();
                int iCN3 = this.VH.CN();
                this.VH.sy(iCN);
                oa(type, false);
                for (int i2 = 0; i2 < this.rN; i2++) {
                    if (this.a8[i2] == '/') {
                        this.a8[i2] = '.';
                    }
                }
                this.VH.Sc(this.a8, 0, this.rN);
                this.VH.iK("java/lang/Class", "forName", "(Ljava/lang/String;)Ljava/lang/Class;");
                this.VH.sy(iCN2);
                this.VH.IS(iCN3);
                this.VH.Mr(iCN, iCN2, "java/lang/ClassNotFoundException".toCharArray(), 0, 32);
                this.VH.XG(i);
                this.VH.Qs("java/lang/NoClassDefFoundError");
                this.VH.w9();
                this.VH.XX(i);
                this.VH.oT("java/lang/Throwable", "getMessage", "()Ljava/lang/String;");
                this.VH.nl("java/lang/NoClassDefFoundError", "<init>", "(Ljava/lang/String;)V");
                this.VH.jJ();
                this.VH.sy(iCN3);
                return;
            }
            int semantic = type.getSemantic();
            if (semantic == 1) {
                this.VH.sM("java/lang/Void", "TYPE", "Ljava/lang/Class;");
                return;
            }
            if (semantic == 3) {
                this.VH.sM("java/lang/Byte", "TYPE", "Ljava/lang/Class;");
                return;
            }
            if (semantic == 5) {
                this.VH.sM("java/lang/Short", "TYPE", "Ljava/lang/Class;");
                return;
            }
            if (semantic == 7) {
                this.VH.sM("java/lang/Integer", "TYPE", "Ljava/lang/Class;");
                return;
            }
            if (semantic == 9) {
                this.VH.sM("java/lang/Long", "TYPE", "Ljava/lang/Class;");
                return;
            }
            switch (semantic) {
                case 11:
                    this.VH.sM("java/lang/Boolean", "TYPE", "Ljava/lang/Class;");
                    return;
                case 12:
                    this.VH.sM("java/lang/Character", "TYPE", "Ljava/lang/Class;");
                    return;
                case 13:
                    this.VH.sM("java/lang/Float", "TYPE", "Ljava/lang/Class;");
                    return;
                case 14:
                    this.VH.sM("java/lang/Double", "TYPE", "Ljava/lang/Class;");
                    return;
                default:
                    return;
            }
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, 852178879891671776L, this, type, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2746519140536058384L)
    private boolean ep(FileEntry fileEntry, Type type, Type type2) {
        try {
            if (kQ) {
                iy.we(600570559103453823L, this, fileEntry, type, type2);
            }
            if (type.isArrayType() && type2.isArrayType()) {
                if (this.j6.Z1(fileEntry, type, type2, false)) {
                    return true;
                }
                if (((ArrayType) type2).getElementType().isMethodParameterType()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (yO) {
                iy.U2(th, 600570559103453823L, this, fileEntry, type, type2);
            }
            throw th;
        }
    }

    @ey(method = -4097412078071492808L)
    private void er(SyntaxTree syntaxTree, int i, boolean z) {
        try {
            if (kQ) {
                iy.we(-102123385777473247L, this, syntaxTree, new Integer(i), new Boolean(z));
            }
        } catch (Throwable th) {
            if (yO) {
                iy.U2(th, -102123385777473247L, this, syntaxTree, new Integer(i), new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 4734660793329315135L)
    private void et(SyntaxTree syntaxTree, int i, boolean z) {
        try {
            if (kQ) {
                iy.we(-2808612170876461956L, this, syntaxTree, new Integer(i), new Boolean(z));
            }
            int childNode = syntaxTree.getChildNode(i, syntaxTree.getChildCount(i) - 1);
            int syntaxTag = syntaxTree.getSyntaxTag(i);
            if (syntaxTag != 159) {
                if (syntaxTag == 161) {
                    if (syntaxTree.getChildCount(i) == 1 && syntaxTree.sh(childNode) == 2) {
                        An(syntaxTree.getAttrVariableSlot(syntaxTree.getChildNode(i, 0)), syntaxTree.getAttrType(i), z);
                        return;
                    } else {
                        wc(syntaxTree, (Member) syntaxTree.getAttrReferenceEntity(childNode), syntaxTree.getAttrInvocationType(childNode), z);
                        return;
                    }
                }
                if (syntaxTag != 162) {
                    return;
                }
            }
            wc(syntaxTree, (Member) syntaxTree.getAttrReferenceEntity(childNode), syntaxTree.getAttrInvocationType(childNode), z);
        } catch (Throwable th) {
            if (yO) {
                iy.U2(th, -2808612170876461956L, this, syntaxTree, new Integer(i), new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 1767373515360585035L)
    private void fN(SyntaxTree syntaxTree, int i) {
        try {
            if (kQ) {
                iy.EQ(-2090532064179906648L, this, syntaxTree, new Integer(i));
            }
            if (this.vJ) {
                this.VH.XX(this.U2);
                this.VH.qP(syntaxTree.getStartLine(i));
                this.VH.oT("adrt/ADRTThread", "onStatementStart", "(I)V");
            }
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, -2090532064179906648L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2397695739286202745L)
    private String fP(Member member) {
        try {
            if (kQ) {
                iy.tp(234537761988673800L, this, member);
            }
            return "access$S" + x6(member.getEnclosingClassType().getFullyQualifiedNameString()) + "$" + member.DW();
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, 234537761988673800L, this, member);
            }
            throw th;
        }
    }

    @ey(method = -27570770382141405L)
    private void fY(SyntaxTree syntaxTree, Member member, Type type, Type type2, boolean z, boolean z2, boolean z3) {
        int semantic;
        try {
            if (kQ) {
                iy.QX(-2896147231300376172L, this, new Object[]{syntaxTree, member, type, type2, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            }
            Eq(member.getEnclosingClassType());
            qP(member, false);
            int iPn = pn(member.getIdentifier(), member);
            if (z2) {
                ClassType classType = (ClassType) type.x9();
                String strFP = fP(member);
                if (member.gG()) {
                    qP(member, false);
                } else {
                    this.rN = 0;
                    char[] cArr = this.a8;
                    this.rN = 0 + 1;
                    cArr[0] = '(';
                    Zo(classType, true);
                    this.er = this.rN - 1;
                    VH(member, false);
                    System.arraycopy(this.a8, 0, this.lg, 0, this.rN);
                }
                oa(classType, false);
                this.VH.sv(this.a8, 0, this.rN, strFP, this.lg, 0, this.er);
            } else if (z && this.Mz) {
                ClassType classType2 = this.XL;
                String strFP2 = fP(member);
                if (member.gG()) {
                    qP(member, false);
                } else {
                    this.rN = 0;
                    char[] cArr2 = this.a8;
                    this.rN = 0 + 1;
                    cArr2[0] = '(';
                    Zo(classType2, true);
                    this.er = this.rN - 1;
                    VH(member, false);
                    System.arraycopy(this.a8, 0, this.lg, 0, this.rN);
                }
                oa(classType2, false);
                this.VH.sv(this.a8, 0, this.rN, strFP2, this.lg, 0, this.er);
            } else if (z) {
                oa(member.getEnclosingClassType(), false);
                b1(iPn);
                this.VH.k1(this.a8, 0, this.rN, this.yS, 0, this.gW, this.lg, 0, this.er);
            } else if ((this.Mz && sv(member, type, this.XL)) || qU(syntaxTree, member, type, this.XL)) {
                ClassType classType3 = (ClassType) type.x9();
                String strCc = cc(member);
                if (member.gG()) {
                    qP(member, false);
                } else {
                    this.rN = 0;
                    char[] cArr3 = this.a8;
                    this.rN = 0 + 1;
                    cArr3[0] = '(';
                    Zo(classType3, true);
                    this.er = this.rN - 1;
                    VH(member, false);
                    System.arraycopy(this.a8, 0, this.lg, 0, this.rN);
                }
                oa(classType3, false);
                this.VH.sv(this.a8, 0, this.rN, strCc, this.lg, 0, this.er);
            } else if ((this.Mz && iK(member, this.XL)) || oT(member, this.XL)) {
                ClassType classType4 = (ClassType) type.x9();
                String strCc2 = cc(member);
                if (member.gG()) {
                    qP(member, false);
                } else {
                    this.rN = 0;
                    char[] cArr4 = this.a8;
                    this.rN = 0 + 1;
                    cArr4[0] = '(';
                    Zo(classType4, true);
                    this.er = this.rN - 1;
                    VH(member, false);
                    System.arraycopy(this.a8, 0, this.lg, 0, this.rN);
                }
                oa(classType4, false);
                this.VH.sv(this.a8, 0, this.rN, strCc2, this.lg, 0, this.er);
            } else if (member.gG()) {
                oa(member.getEnclosingClassType(), false);
                b1(iPn);
                this.VH.HT(this.a8, 0, this.rN, this.yS, 0, this.gW, this.lg, 0, this.er);
            } else if (member.ro()) {
                oa(member.getEnclosingClassType(), false);
                b1(iPn);
                this.VH.k1(this.a8, 0, this.rN, this.yS, 0, this.gW, this.lg, 0, this.er);
            } else if (type == null) {
                oa(member.getEnclosingClassType(), false);
                b1(iPn);
                this.VH.hx(this.a8, 0, this.rN, this.yS, 0, this.gW, this.lg, 0, this.er);
            } else if (type.x9().isInterfaceType() && !member.getEnclosingClassType().isInterfaceType()) {
                oa(member.getEnclosingClassType(), false);
                b1(iPn);
                this.VH.hx(this.a8, 0, this.rN, this.yS, 0, this.gW, this.lg, 0, this.er);
            } else if (type.x9().isInterfaceType()) {
                oa(type.x9(), false);
                b1(iPn);
                this.VH.Ak(this.a8, 0, this.rN, this.yS, 0, this.gW, this.lg, 0, this.er);
            } else if (this.sy) {
                oa(member.getEnclosingClassType(), false);
                b1(iPn);
                this.VH.hx(this.a8, 0, this.rN, this.yS, 0, this.gW, this.lg, 0, this.er);
            } else {
                oa(type.x9(), false);
                b1(iPn);
                this.VH.hx(this.a8, 0, this.rN, this.yS, 0, this.gW, this.lg, 0, this.er);
            }
            if (!z3) {
                CU(syntaxTree, member.WB(), type2);
                if (this.j6.hK(member) && type2.isArrayType()) {
                    oa(type2, false);
                    this.VH.hz(this.a8, 0, this.rN);
                }
            }
            if (!z3 || (semantic = member.WB().getSemantic()) == 1) {
                return;
            }
            if (semantic == 9 || semantic == 14) {
                this.VH.s0();
            } else {
                this.VH.hG();
            }
        } catch (Throwable th) {
            if (yO) {
                iy.rN(th, -2896147231300376172L, this, new Object[]{syntaxTree, member, type, type2, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            }
            throw th;
        }
    }

    @ey(method = 1860591450910455279L)
    private boolean fh(Member member, Type type, ClassType classType) {
        try {
            if (kQ) {
                iy.we(3271723813084372880L, this, member, type, classType);
            }
            if (type != null && y1.J0(member.getModifiers())) {
                return member.getEnclosingClassType().getNamespace() != classType.getNamespace();
            }
            return false;
        } catch (Throwable th) {
            if (yO) {
                iy.U2(th, 3271723813084372880L, this, member, type, classType);
            }
            throw th;
        }
    }

    @ey(method = -542166994531435437L)
    private void g3(ClassType classType) {
        try {
            if (kQ) {
                iy.tp(3205770798715557684L, this, classType);
            }
            String strD8 = d8();
            oa(classType, false);
            this.er = 0;
            char[] cArr = this.lg;
            this.er = 0 + 1;
            cArr[0] = '(';
            VH(classType, true);
            char[] cArr2 = this.lg;
            int i = this.er;
            this.er = i + 1;
            cArr2[i] = ')';
            VH(classType.getEnclosingClassType(), true);
            this.VH.sv(this.a8, 0, this.rN, strD8, this.lg, 0, this.er);
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, 3205770798715557684L, this, classType);
            }
            throw th;
        }
    }

    @ey(method = -5224114237544035064L)
    private void gG(SyntaxTree syntaxTree, int i) {
        try {
            if (kQ) {
                iy.EQ(-1293323489073919791L, this, syntaxTree, new Integer(i));
            }
            int childCount = syntaxTree.getChildCount(i);
            for (int i2 = 3; i2 < childCount; i2 += 2) {
                int childNode = syntaxTree.getChildNode(syntaxTree.getChildNode(i, i2), 0);
                Nh(syntaxTree, childNode, syntaxTree.getAttrVariableSlot(childNode), syntaxTree.getAttrType(childNode));
            }
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, -1293323489073919791L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -1415641570489432044L)
    private void gW(Type type) {
        try {
            if (kQ) {
                iy.tp(-410069710129864589L, this, type);
            }
            int semantic = type.getSemantic();
            if (semantic == 3) {
                this.VH.Qs("java/lang/Byte");
                this.VH.Z1();
                this.VH.jD();
                this.VH.nl("java/lang/Byte", "<init>", "(B)V");
                return;
            }
            if (semantic == 5) {
                this.VH.Qs("java/lang/Short");
                this.VH.Z1();
                this.VH.jD();
                this.VH.nl("java/lang/Short", "<init>", "(S)V");
                return;
            }
            if (semantic == 7) {
                this.VH.Qs("java/lang/Integer");
                this.VH.Z1();
                this.VH.jD();
                this.VH.nl("java/lang/Integer", "<init>", "(I)V");
                return;
            }
            if (semantic == 9) {
                this.VH.Qs("java/lang/Long");
                this.VH.n5();
                this.VH.n5();
                this.VH.hG();
                this.VH.nl("java/lang/Long", "<init>", "(J)V");
                return;
            }
            switch (semantic) {
                case 11:
                    this.VH.Qs("java/lang/Boolean");
                    this.VH.Z1();
                    this.VH.jD();
                    this.VH.nl("java/lang/Boolean", "<init>", "(Z)V");
                    return;
                case 12:
                    this.VH.Qs("java/lang/Character");
                    this.VH.Z1();
                    this.VH.jD();
                    this.VH.nl("java/lang/Character", "<init>", "(C)V");
                    return;
                case 13:
                    this.VH.Qs("java/lang/Float");
                    this.VH.Z1();
                    this.VH.jD();
                    this.VH.nl("java/lang/Float", "<init>", "(F)V");
                    return;
                case 14:
                    this.VH.Qs("java/lang/Double");
                    this.VH.n5();
                    this.VH.n5();
                    this.VH.hG();
                    this.VH.nl("java/lang/Double", "<init>", "(D)V");
                    return;
                default:
                    return;
            }
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, -410069710129864589L, this, type);
            }
            throw th;
        }
    }

    @ey(method = -260906915442687723L)
    private void gn(SyntaxTree syntaxTree, boolean z) {
        try {
            if (kQ) {
                iy.EQ(-3396184553778584104L, this, syntaxTree, new Boolean(z));
            }
            try {
                String targetVersion = this.model.fileSpace.getTargetVersion(syntaxTree.getFile());
                boolean z2 = true;
                if (targetVersion.equals("1.5")) {
                    this.I = false;
                    this.ca = true;
                    this.x9 = false;
                    this.Qq = false;
                    this.sy = false;
                    this.aj = false;
                    this.OW = 0;
                    this.br = 49;
                } else if (targetVersion.equals("1.4")) {
                    this.I = true;
                    this.ca = false;
                    this.x9 = true;
                    this.Qq = false;
                    this.sy = false;
                    this.aj = false;
                    this.OW = 0;
                    this.br = 48;
                } else if (targetVersion.equals("1.3")) {
                    this.I = true;
                    this.ca = false;
                    this.x9 = true;
                    this.Qq = false;
                    this.sy = false;
                    this.aj = true;
                    this.OW = 0;
                    this.br = 46;
                } else {
                    this.I = true;
                    this.ca = false;
                    this.x9 = true;
                    this.Qq = true;
                    this.sy = true;
                    this.aj = true;
                    this.OW = 3;
                    this.br = 45;
                }
                if (this.model.fileSpace.Mz(syntaxTree.getFile())) {
                    z2 = false;
                } else {
                    z = false;
                }
                this.lp = this.model.fileSpace.lp(syntaxTree.getFile());
                u7(syntaxTree, z, z2, false);
            } catch (Exception e) {
                System.out.println(syntaxTree.getFile().getPathString());
                e.printStackTrace(System.out);
            }
        } finally {
        }
    }

    @ey(method = -6558119739097704864L)
    private void hK() {
        try {
            if (kQ) {
                iy.gn(4483243042056945621L, this);
            }
        } catch (Throwable th) {
            if (yO) {
                iy.aM(th, 4483243042056945621L, this);
            }
            throw th;
        }
    }

    @ey(method = -5215992639562825113L)
    private boolean hx(SyntaxTree syntaxTree, Member member, Type type, ClassType classType) {
        try {
            if (kQ) {
                iy.J0(-1780857479210561220L, this, syntaxTree, member, type, classType);
            }
            if (type == null || !y1.J0(member.getModifiers())) {
                return false;
            }
            type = type.x9();
            if (!type.isClassType() || member.getEnclosingClassType().getNamespace() == classType.getNamespace() || classType == type || classType.Ej(type)) {
                return false;
            }
            return classType.hp((ClassType) type);
        } catch (Throwable th) {
            Type type2 = type;
            if (yO) {
                iy.a8(th, -1780857479210561220L, this, syntaxTree, member, type2, classType);
            }
            throw th;
        }
    }

    @ey(method = -314079987302613195L)
    private void hz() {
        try {
            if (kQ) {
                iy.gn(-3453365435261163648L, this);
            }
            this.VH.wC();
            this.VH.wC();
            this.VH.wC();
        } catch (Throwable th) {
            if (yO) {
                iy.aM(th, -3453365435261163648L, this);
            }
            throw th;
        }
    }

    @ey(method = -453165184617596423L)
    private boolean iK(Member member, ClassType classType) {
        try {
            if (kQ) {
                iy.EQ(1551440417405828360L, this, member, classType);
            }
            return member.ro();
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, 1551440417405828360L, this, member, classType);
            }
            throw th;
        }
    }

    @ey(method = -293467299570280479L)
    private void iW(SyntaxTree syntaxTree, int i, int i2, Type type) {
        try {
            if (kQ) {
                iy.J0(1482074360722846464L, this, syntaxTree, new Integer(i), new Integer(i2), type);
            }
            if (this.vJ) {
                Nh(syntaxTree, i, i2, type);
            }
        } catch (Throwable th) {
            if (yO) {
                iy.a8(th, 1482074360722846464L, this, syntaxTree, new Integer(i), new Integer(i2), type);
            }
            throw th;
        }
    }

    @ey(method = 3757241100714217280L)
    private void j3(Type type) {
        try {
            if (kQ) {
                iy.tp(-137641961042099475L, this, type);
            }
            int semantic = type.getSemantic();
            if (semantic == 3) {
                this.VH.wc();
                return;
            }
            if (semantic == 5) {
                this.VH.jg();
                return;
            }
            if (semantic == 7) {
                this.VH.Jm();
                return;
            }
            if (semantic == 9) {
                this.VH.ya();
                return;
            }
            switch (semantic) {
                case 11:
                    this.VH.wc();
                    return;
                case 12:
                    this.VH.CU();
                    return;
                case 13:
                    this.VH.eU();
                    return;
                case 14:
                    this.VH.ko();
                    return;
                default:
                    this.VH.lp();
                    return;
            }
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, -137641961042099475L, this, type);
            }
            throw th;
        }
    }

    @ey(method = -4687295839208900205L)
    private boolean jJ(SyntaxTree syntaxTree, int i, boolean z) {
        try {
            if (kQ) {
                iy.we(-108467480301365360L, this, syntaxTree, new Integer(i), new Boolean(z));
            }
            int childNode = syntaxTree.getChildNode(i, syntaxTree.getChildCount(i) - 1);
            if (syntaxTree.sh(childNode) == 27) {
                int syntaxTag = syntaxTree.getSyntaxTag(i);
                if (syntaxTag == 159) {
                    sy(syntaxTree, syntaxTree.getChildNode(i, 0), false);
                } else if (syntaxTag == 161) {
                    w9(syntaxTree, i, syntaxTree.getChildCount(i) - 3);
                }
                return true;
            }
            int syntaxTag2 = syntaxTree.getSyntaxTag(i);
            if (syntaxTag2 == 159) {
                Member member = (Member) syntaxTree.getAttrReferenceEntity(childNode);
                sy(syntaxTree, syntaxTree.getChildNode(i, 0), false);
                if (member.gG()) {
                    this.VH.hG();
                } else if (z) {
                    this.VH.w9();
                }
                return !member.gG();
            }
            if (syntaxTag2 != 161) {
                if (syntaxTag2 != 162) {
                    return false;
                }
                if (!((Member) syntaxTree.getAttrReferenceEntity(childNode)).gG()) {
                    if (syntaxTree.getChildCount(i) == 3) {
                        this.VH.XX(0);
                    } else {
                        Qq(syntaxTree.getAttrType(syntaxTree.getChildNode(i, 0)).x9());
                    }
                    if (z) {
                        this.VH.w9();
                    }
                }
                return !r0.gG();
            }
            if (syntaxTree.getChildCount(i) == 1 && syntaxTree.sh(childNode) == 2) {
                return false;
            }
            if (syntaxTree.getChildCount(i) == 1 && syntaxTree.sh(childNode) == 3) {
                this.VH.XX(0);
                return true;
            }
            if (syntaxTree.getChildCount(i) > 1) {
                if (!((Member) syntaxTree.getAttrReferenceEntity(childNode)).gG()) {
                    w9(syntaxTree, i, syntaxTree.getChildCount(i) - 3);
                    if (z) {
                        this.VH.w9();
                    }
                }
                return !r0.gG();
            }
            if (!((Member) syntaxTree.getAttrReferenceEntity(childNode)).gG()) {
                x9(syntaxTree, syntaxTree.getAttrInvocationType(childNode).x9());
                if (z) {
                    this.VH.w9();
                }
            }
            return !r2.gG();
        } catch (Throwable th) {
            if (yO) {
                iy.U2(th, -108467480301365360L, this, syntaxTree, new Integer(i), new Boolean(z));
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00e5  */
    @abcd.ey(method = 109435183024377457L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void jO(com.aide.codemodel.api.SyntaxTree r22, com.aide.codemodel.api.ClassType r23, com.aide.codemodel.api.Member r24, boolean r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.java.JavaCompiler.jO(com.aide.codemodel.api.SyntaxTree, com.aide.codemodel.api.ClassType, com.aide.codemodel.api.Member, boolean):void");
    }

    @ey(method = 3913961363680251600L)
    private void jw(SyntaxTree syntaxTree, Member member) {
        try {
            if (kQ) {
                iy.EQ(977134568935332339L, this, syntaxTree, member);
            }
            int iXG = member.XG();
            for (int i = 0; i < iXG; i++) {
                Type typeXX = member.XX(i);
                if (this.j6.w9(syntaxTree.getFile(), typeXX)) {
                    oa(typeXX, false);
                    this.VH.ca(this.a8, 0, this.rN);
                    Eq(typeXX);
                }
            }
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, 977134568935332339L, this, syntaxTree, member);
            }
            throw th;
        }
    }

    @ey(method = -287220734646096900L)
    private boolean k1(Member member, ClassType classType) {
        try {
            if (kQ) {
                iy.EQ(-3520935718198216315L, this, member, classType);
            }
            return member.ro();
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, -3520935718198216315L, this, member, classType);
            }
            throw th;
        }
    }

    @ey(method = 1715623812179713857L)
    private void k2(SyntaxTree syntaxTree, int i) {
        try {
            if (kQ) {
                iy.EQ(-6859436516094011496L, this, syntaxTree, new Integer(i));
            }
            if (this.vJ) {
                this.VH.HE(syntaxTree.getFile().getId());
                this.VH.iK("adrt/ADRT", "onMethodEnter", "(J)Ladrt/ADRTThread;");
                this.VH.XG(syntaxTree.getAttrVariableSlot(i));
            }
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, -6859436516094011496L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2847714818170206432L)
    private void kQ(SyntaxTree syntaxTree, int i) {
        try {
            if (kQ) {
                iy.EQ(-4116439261726819243L, this, syntaxTree, new Integer(i));
            }
            int childCount = syntaxTree.getChildCount(i);
            for (int i2 = 0; i2 < childCount; i2++) {
                int childNode = syntaxTree.getChildNode(i, i2);
                if (syntaxTree.getSyntaxTag(childNode) == 126) {
                    int childCount2 = syntaxTree.getChildCount(childNode);
                    for (int i3 = 3; i3 < childCount2; i3 += 2) {
                        int childNode2 = syntaxTree.getChildNode(childNode, i3);
                        if (syntaxTree.getChildCount(childNode2) > 2) {
                            Member memberJw = this.entitySpace.jw(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getDeclarationNumber(childNode2));
                            if (!memberJw.gG()) {
                                this.VH.XX(0);
                                int childNode3 = syntaxTree.getChildNode(childNode2, 3);
                                Type typeWB = memberJw.WB();
                                if (syntaxTree.getSyntaxTag(childNode3) == 196) {
                                    aM(syntaxTree, childNode3, typeWB);
                                } else {
                                    sy(syntaxTree, childNode3, false);
                                    dx(syntaxTree, syntaxTree.getAttrType(childNode3), typeWB);
                                }
                                wc(syntaxTree, memberJw, null, true);
                            }
                        }
                    }
                } else if (syntaxTree.getSyntaxTag(childNode) == 127 && syntaxTree.getChildCount(syntaxTree.getChildNode(childNode, 0)) == 0) {
                    this.VH.XX(0);
                    oa(this.XL, false);
                    this.VH.nl(new String(this.a8, 0, this.rN), Fd(childNode), "()V");
                }
            }
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, -4116439261726819243L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -6392411417664131400L)
    private void kf(SyntaxTree syntaxTree, int i) {
        try {
            if (kQ) {
                iy.EQ(-1246920977424569551L, this, syntaxTree, new Integer(i));
            }
            Type attrType = syntaxTree.getAttrType(i);
            String strOm = om(syntaxTree.getIdentifierString(i));
            qP(attrType, true);
            oa(this.XL, false);
            this.VH.e9(this.a8, 0, this.rN, strOm, this.lg, 0, this.er);
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, -1246920977424569551L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -121479172320217771L)
    private void ko(SyntaxTree syntaxTree, Member member, SetOf<Member> setOf) {
        try {
            if (kQ) {
                iy.we(3765264778713926616L, this, syntaxTree, member, setOf);
            }
            if (setOf != null) {
                setOf.DEFAULT_ITERATOR.init();
                while (setOf.DEFAULT_ITERATOR.hasMoreElements()) {
                    Member member2 = (Member) setOf.DEFAULT_ITERATOR.nextKey();
                    oa(member, false);
                    qP(member2, false);
                    int i = 1;
                    int iE4 = E4(member, true) & (-1025);
                    if (this.ca) {
                        iE4 |= 64;
                    }
                    int i2 = iE4;
                    int iPn = pn(member.getIdentifier(), member);
                    boolean z = this.x9;
                    b1(iPn);
                    this.VH.I(i2, this.yS, 0, this.gW, this.lg, 0, this.er, z, false, true);
                    jw(syntaxTree, member);
                    Type typeU9 = this.XL.u9();
                    this.VH.XX(0);
                    int iOY = member2.oY();
                    for (int i3 = 0; i3 < iOY; i3++) {
                        Type typeQp = member2.qp(i3);
                        Type typeZh = member.zh(typeU9, i3);
                        Za(i, typeQp);
                        CU(syntaxTree, typeQp, typeZh);
                        int semantic = typeQp.getSemantic();
                        i = (semantic == 9 || semantic == 14) ? i + 2 : i + 1;
                    }
                    fY(syntaxTree, member, null, this.j6.Eq(syntaxTree.getFile()), false, false, false);
                    dx(syntaxTree, member2.jw(typeU9), member2.WB());
                    sE(member2.WB());
                }
            }
        } catch (Throwable th) {
            if (yO) {
                iy.U2(th, 3765264778713926616L, this, syntaxTree, member, setOf);
            }
            throw th;
        }
    }

    @ey(method = -959110134148263664L)
    private void lg(SyntaxTree syntaxTree, int i) {
        try {
            if (kQ) {
                iy.EQ(3121547160512043985L, this, syntaxTree, new Integer(i));
            }
            int childCount = syntaxTree.getChildCount(i);
            for (int i2 = 2; i2 < childCount - 2; i2++) {
                int childNode = syntaxTree.getChildNode(i, i2);
                int childCount2 = syntaxTree.getChildCount(childNode);
                for (int i3 = 3; i3 < childCount2; i3 += 2) {
                    int attrVariableSlot = syntaxTree.getAttrVariableSlot(syntaxTree.getChildNode(syntaxTree.getChildNode(childNode, i3), 0));
                    int iCN = this.VH.CN();
                    this.VH.XX(attrVariableSlot);
                    this.VH.PT(iCN, true);
                    this.VH.XX(attrVariableSlot);
                    this.VH.u9("java/lang/AutoCloseable", "close", "()V");
                    this.VH.sy(iCN);
                }
            }
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, 3121547160512043985L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2178520837883831760L)
    private void lp(SyntaxTree syntaxTree, int i, int i2) {
        try {
            if (kQ) {
                iy.we(-9112646906636501697L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            if (this.vJ) {
                this.VH.XX(this.U2);
                this.VH.qP(syntaxTree.getStartLine(i));
                this.VH.oT("adrt/ADRTThread", "onStatementStart", "(I)V");
            }
        } catch (Throwable th) {
            if (yO) {
                iy.U2(th, -9112646906636501697L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -576413581053409563L)
    private void mb(SyntaxTree syntaxTree, int i) {
        try {
            if (kQ) {
                iy.EQ(313162549195921116L, this, syntaxTree, new Integer(i));
            }
            if (this.vJ) {
                this.VH.XX(this.U2);
                this.VH.oT("adrt/ADRTThread", "onMethodExit", "()V");
            }
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, 313162549195921116L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 2672354675106313040L)
    private void n5(SyntaxTree syntaxTree, ClassType classType) {
        try {
            if (kQ) {
                iy.EQ(3998126702746685943L, this, syntaxTree, classType);
            }
            this.J8.default_Iterator.FH(classType.getId());
            while (this.J8.default_Iterator.hasMoreElements()) {
                int iNextValue = this.J8.default_Iterator.nextValue();
                oa(syntaxTree.getAttrType(iNextValue), true);
                String strOm = om(syntaxTree.getIdentifierString(iNextValue));
                if (this.g3) {
                    this.VH.a8(18, strOm, this.a8, 0, this.rN, true, false);
                } else {
                    this.VH.a8(16, strOm, this.a8, 0, this.rN, true, false);
                }
            }
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, 3998126702746685943L, this, syntaxTree, classType);
            }
            throw th;
        }
    }

    @ey(method = -2439478669873210329L)
    private boolean nl(ClassType classType) {
        try {
            if (kQ) {
                iy.tp(-2221989821898826936L, this, classType);
            }
            int i = this.model.identifierSpace.get("Context");
            SetOf<ClassType> setOfFN = classType.fN();
            setOfFN.DEFAULT_ITERATOR.init();
            while (setOfFN.DEFAULT_ITERATOR.hasMoreElements()) {
                ClassType classType2 = (ClassType) setOfFN.DEFAULT_ITERATOR.nextKey();
                if (classType2.getIdentifier() == i && classType2.getNamespace().getFullyQualifiedNameString().equals("android.content")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, -2221989821898826936L, this, classType);
            }
            throw th;
        }
    }

    @ey(method = 927940018682643447L)
    private void nw(SyntaxTree syntaxTree, int i) {
        try {
            if (kQ) {
                iy.EQ(3638468784263092432L, this, syntaxTree, new Integer(i));
            }
            int syntaxTag = syntaxTree.getSyntaxTag(i);
            if (syntaxTag == 123) {
                cn(syntaxTree, i);
                return;
            }
            if (syntaxTag == 124) {
                FN(syntaxTree, i);
                return;
            }
            if (syntaxTag == 126) {
                int childCount = syntaxTree.getChildCount(i);
                for (int i2 = 3; i2 < childCount; i2 += 2) {
                    br(syntaxTree, syntaxTree.getChildNode(i, i2));
                }
                return;
            }
            if (syntaxTag != 127) {
                if (syntaxTag == 221 || syntaxTag == 227 || syntaxTag == 228) {
                    Eq(this.entitySpace.getClasstype(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getDeclarationNumber(i)));
                    return;
                }
                return;
            }
            if (syntaxTree.getChildCount(syntaxTree.getChildNode(i, 0)) == 0) {
                this.vJ = false;
                this.VH.g3(2, Fd(i), "()V", true, false, true);
                this.QX = this.VH.CN();
                QO();
                sg(syntaxTree, syntaxTree.getChildNode(i, 1));
                this.VH.sy(this.QX);
                this.VH.IM();
            }
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, 3638468784263092432L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2781449034626605080L)
    private boolean oT(Member member, ClassType classType) {
        try {
            if (kQ) {
                iy.EQ(-1729638471533628555L, this, member, classType);
            }
            if (member.ro()) {
                if (member.getEnclosingClassType() != classType) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, -1729638471533628555L, this, member, classType);
            }
            throw th;
        }
    }

    @ey(method = 2065741143477238464L)
    private void oY(SyntaxTree syntaxTree, int i, int i2, Member member) {
        int i3;
        try {
            if (kQ) {
                iy.J0(-1755496370917637805L, this, syntaxTree, new Integer(i), new Integer(i2), member);
            }
            int childCount = (syntaxTree.getChildCount(i2) - 1) / 2;
            int iOY = member.oY();
            int childCount2 = syntaxTree.getChildCount(i2);
            Type attrInvocationType = syntaxTree.getAttrInvocationType(i);
            if (!member.Z1() || (iOY == childCount && ep(syntaxTree.getFile(), syntaxTree.getAttrType(syntaxTree.getChildNode(i2, childCount2 - 2)), member.zh(attrInvocationType, iOY - 1)))) {
                int i4 = 1;
                int i5 = 0;
                while (i4 < childCount2 - 1) {
                    int childNode = syntaxTree.getChildNode(i2, i4);
                    Type typeQp = (attrInvocationType == null || !(attrInvocationType.isClassType() || attrInvocationType.isParameterizedType())) ? member.qp(i5) : member.zh(attrInvocationType, i5);
                    Type attrType = syntaxTree.getAttrType(childNode);
                    sy(syntaxTree, childNode, false);
                    dx(syntaxTree, attrType, typeQp);
                    i4 += 2;
                    i5++;
                }
                return;
            }
            int i6 = 0;
            int i7 = 1;
            while (true) {
                i3 = iOY - 1;
                if (i6 >= i3) {
                    break;
                }
                int childNode2 = syntaxTree.getChildNode(i2, i7);
                Type typeQp2 = member.qp(i6);
                Type attrType2 = syntaxTree.getAttrType(childNode2);
                sy(syntaxTree, childNode2, false);
                dx(syntaxTree, attrType2, typeQp2);
                i7 += 2;
                i6++;
            }
            Type typeZh = member.zh(attrInvocationType, i3);
            Type elementType = ((ArrayType) typeZh).getElementType();
            this.VH.qP((childCount - iOY) + 1);
            oa(typeZh, false);
            this.VH.Lx(this.a8, 0, this.rN, 1);
            int i8 = 0;
            while (i7 < childCount2 - 1) {
                int childNode3 = syntaxTree.getChildNode(i2, i7);
                Type attrType3 = syntaxTree.getAttrType(childNode3);
                this.VH.w9();
                this.VH.qP(i8);
                sy(syntaxTree, childNode3, false);
                dx(syntaxTree, attrType3, elementType);
                U2(elementType);
                i7 += 2;
                i8++;
            }
        } catch (Throwable th) {
            if (yO) {
                iy.a8(th, -1755496370917637805L, this, syntaxTree, new Integer(i), new Integer(i2), member);
            }
            throw th;
        }
    }

    @ey(method = -6284352982343505457L)
    private void oa(Entity entity, boolean z) {
        try {
            if (kQ) {
                iy.EQ(5489070946079684400L, this, entity, new Boolean(z));
            }
            while (true) {
                int iGK = GK(entity, this.a8, 0, z);
                this.rN = iGK;
                if (iGK != -1) {
                    return;
                } else {
                    this.a8 = new char[(this.a8.length * 2) + 1];
                }
            }
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, 5489070946079684400L, this, entity, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -20509622151628065L)
    private String oh(Member member) {
        try {
            if (kQ) {
                iy.tp(-549082793644503120L, this, member);
            }
            if (member.ro()) {
                return "access$L" + member.DW();
            }
            return "access$L" + x6(member.getEnclosingClassType().getFullyQualifiedNameString()) + "$" + member.DW();
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, -549082793644503120L, this, member);
            }
            throw th;
        }
    }

    @ey(method = -2641101608680323600L)
    private String om(String str) {
        try {
            if (kQ) {
                iy.tp(-2241571174017976287L, this, str);
            }
            return "val$" + str;
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, -2241571174017976287L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 276009907215409075L)
    private void oy() {
        try {
            if (kQ) {
                iy.gn(8476250201172417168L, this);
            }
            this.VH.oT("java/lang/StringBuffer", "toString", "()Ljava/lang/String;");
        } catch (Throwable th) {
            if (yO) {
                iy.aM(th, 8476250201172417168L, this);
            }
            throw th;
        }
    }

    @ey(method = -992138439698595093L)
    private void pN() {
        try {
            if (kQ) {
                iy.gn(-177623292419350072L, this);
            }
            this.VH.Qs("java/lang/StringBuffer");
            this.VH.w9();
            this.VH.nl("java/lang/StringBuffer", "<init>", "()V");
        } catch (Throwable th) {
            if (yO) {
                iy.aM(th, -177623292419350072L, this);
            }
            throw th;
        }
    }

    @ey(method = -2775114215182658440L)
    private void pO(SyntaxTree syntaxTree, int i) {
        try {
            if (kQ) {
                iy.EQ(-835646295850651845L, this, syntaxTree, new Integer(i));
            }
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, -835646295850651845L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 2631793071398631360L)
    private int pn(int i, Entity entity) {
        try {
            if (kQ) {
                iy.EQ(-341108277305563851L, this, new Integer(i), entity);
            }
            if (!HO(entity)) {
                return i;
            }
            return this.DW.get("$$" + entity.DW());
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, -341108277305563851L, this, new Integer(i), entity);
            }
            throw th;
        }
    }

    @ey(method = -1868926503359124L)
    private void q7(int i, Type type) {
        try {
            if (kQ) {
                iy.EQ(2981157610087717005L, this, new Integer(i), type);
            }
            switch (i) {
                case 19:
                case ProxyTextView.INPUTTYPE_date /* 20 */:
                    int semantic = type.getSemantic();
                    if (semantic == 9) {
                        this.VH.h2();
                        return;
                    }
                    if (semantic == 13) {
                        this.VH.sg();
                        return;
                    } else if (semantic != 14) {
                        this.VH.MP();
                        return;
                    } else {
                        this.VH.WB();
                        return;
                    }
                case 21:
                case 23:
                    int semantic2 = type.getSemantic();
                    if (semantic2 == 9) {
                        this.VH.cX();
                        return;
                    }
                    if (semantic2 == 13) {
                        this.VH.iW();
                        return;
                    } else if (semantic2 != 14) {
                        this.VH.ce();
                        return;
                    } else {
                        this.VH.oY();
                        return;
                    }
                case 22:
                case 24:
                case 25:
                case 26:
                case 28:
                case 34:
                case 35:
                case 39:
                case 42:
                case 44:
                case 45:
                case 48:
                case ProxyTextView.INPUTTYPE_textEmailSubject /* 49 */:
                default:
                    return;
                case 27:
                case 29:
                    int semantic3 = type.getSemantic();
                    if (semantic3 == 9) {
                        this.VH.jn();
                        return;
                    }
                    if (semantic3 == 13) {
                        this.VH.aX();
                        return;
                    } else if (semantic3 != 14) {
                        this.VH.tj();
                        return;
                    } else {
                        this.VH.AL();
                        return;
                    }
                case 30:
                case 31:
                    int semantic4 = type.getSemantic();
                    if (semantic4 == 9) {
                        this.VH.F3();
                        return;
                    }
                    if (semantic4 == 13) {
                        this.VH.fN();
                        return;
                    } else if (semantic4 != 14) {
                        this.VH.fP();
                        return;
                    } else {
                        this.VH.jw();
                        return;
                    }
                case 32:
                case ProxyTextView.INPUTTYPE_textEmailAddress /* 33 */:
                    int semantic5 = type.getSemantic();
                    if (semantic5 == 9) {
                        this.VH.ji();
                        return;
                    }
                    if (semantic5 == 13) {
                        this.VH.Cz();
                        return;
                    } else if (semantic5 != 14) {
                        this.VH.uC();
                        return;
                    } else {
                        this.VH.qp();
                        return;
                    }
                case ProxyTextView.INPUTTYPE_time /* 36 */:
                case 37:
                    if (type.getSemantic() != 9) {
                        this.VH.x6();
                        return;
                    } else {
                        this.VH.ee();
                        return;
                    }
                case 38:
                case 40:
                    if (type.getSemantic() != 9) {
                        this.VH.qU();
                        return;
                    } else {
                        this.VH.tR();
                        return;
                    }
                case 41:
                case 43:
                    if (type.getSemantic() != 9) {
                        this.VH.Bx();
                        return;
                    } else {
                        this.VH.ir();
                        return;
                    }
                case 46:
                case 47:
                    if (type.getSemantic() != 9) {
                        this.VH.HO();
                        return;
                    } else {
                        this.VH.C();
                        return;
                    }
                case 50:
                case 52:
                    if (type.getSemantic() != 9) {
                        this.VH.qI();
                        return;
                    } else {
                        this.VH.dH();
                        return;
                    }
                case 51:
                case 53:
                    if (type.getSemantic() != 9) {
                        this.VH.pn();
                        return;
                    } else {
                        this.VH.DP();
                        return;
                    }
            }
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, 2981157610087717005L, this, new Integer(i), type);
            }
            throw th;
        }
    }

    @ey(method = 1115980704480432856L)
    private boolean qI(Type type) {
        try {
            if (kQ) {
                iy.tp(-2500933015599881655L, this, type);
            }
            if (!this.j6.Jl(type) && !type.isClassType()) {
                if (type.isArrayType()) {
                    if (qI(((ArrayType) type).getElementType())) {
                    }
                }
                return false;
            }
            return true;
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, -2500933015599881655L, this, type);
            }
            throw th;
        }
    }

    @ey(method = -707386083992134308L)
    private void qP(Entity entity, boolean z) {
        try {
            if (kQ) {
                iy.EQ(-2854562273763094825L, this, entity, new Boolean(z));
            }
            while (true) {
                int iGK = GK(entity, this.lg, 0, z);
                this.er = iGK;
                if (iGK != -1) {
                    return;
                } else {
                    this.lg = new char[(this.lg.length * 2) + 1];
                }
            }
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, -2854562273763094825L, this, entity, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 36826463303025216L)
    private boolean qU(SyntaxTree syntaxTree, Member member, Type type, ClassType classType) {
        try {
            if (kQ) {
                iy.J0(5456859808132837605L, this, syntaxTree, member, type, classType);
            }
            if (type == null || !y1.J0(member.getModifiers())) {
                return false;
            }
            type = type.x9();
            if (!type.isClassType() || member.getEnclosingClassType().getNamespace() == classType.getNamespace() || classType == type || classType.Ej(type)) {
                return false;
            }
            return classType.hp((ClassType) type);
        } catch (Throwable th) {
            Type type2 = type;
            if (yO) {
                iy.a8(th, 5456859808132837605L, this, syntaxTree, member, type2, classType);
            }
            throw th;
        }
    }

    @ey(method = 694578013325718912L)
    private void qp(SyntaxTree syntaxTree, int i) {
        try {
            if (kQ) {
                iy.EQ(-7275522441279591905L, this, syntaxTree, new Integer(i));
            }
            if (this.vJ) {
                this.VH.XX(this.U2);
                this.VH.oT("adrt/ADRTThread", "onMethodExit", "()V");
            }
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, -7275522441279591905L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 318902591464418648L)
    private void rN(SyntaxTree syntaxTree, int i, boolean z) {
        try {
            if (kQ) {
                iy.we(3530731610928567405L, this, syntaxTree, new Integer(i), new Boolean(z));
            }
            int iCN = this.VH.CN();
            int iCN2 = this.VH.CN();
            SI(syntaxTree, i, iCN, z);
            this.VH.qP(0);
            this.VH.IS(iCN2);
            this.VH.sy(iCN);
            this.VH.qP(1);
            this.VH.sy(iCN2);
        } catch (Throwable th) {
            if (yO) {
                iy.U2(th, 3530731610928567405L, this, syntaxTree, new Integer(i), new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -3362283017044419840L)
    private void ro(SyntaxTree syntaxTree, int i, boolean z) {
        try {
            if (kQ) {
                iy.we(-2856060581823215585L, this, syntaxTree, new Integer(i), new Boolean(z));
            }
        } catch (Throwable th) {
            if (yO) {
                iy.U2(th, -2856060581823215585L, this, syntaxTree, new Integer(i), new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 2604658152478251171L)
    private void sE(Type type) {
        try {
            if (kQ) {
                iy.tp(-2436734234182989440L, this, type);
            }
            int semantic = type.getSemantic();
            if (semantic == 1) {
                this.VH.IM();
                return;
            }
            if (semantic != 3 && semantic != 5 && semantic != 7) {
                if (semantic == 9) {
                    this.VH.ME();
                    return;
                }
                switch (semantic) {
                    case 11:
                    case 12:
                        break;
                    case 13:
                        this.VH.pN();
                        return;
                    case 14:
                        this.VH.k2();
                        return;
                    default:
                        this.VH.kQ();
                        return;
                }
            }
            this.VH.ep();
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, -2436734234182989440L, this, type);
            }
            throw th;
        }
    }

    @ey(method = -637676972684390208L)
    private void sG(SyntaxTree syntaxTree, int i) {
        try {
            if (kQ) {
                iy.EQ(-2162529777569735385L, this, syntaxTree, new Integer(i));
            }
            int childCount = syntaxTree.getChildCount(i);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (RW()) {
                    return;
                }
                int childNode = syntaxTree.getChildNode(i, i2);
                if (syntaxTree.getSyntaxTag(childNode) == 124 && syntaxTree.getSyntaxTag(syntaxTree.getChildNode(childNode, 8)) == 133) {
                    ef(syntaxTree, childNode);
                }
            }
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, -2162529777569735385L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -89754381407074080L)
    private void sM(SyntaxTree syntaxTree, int i) {
        try {
            if (kQ) {
                iy.EQ(24267166585118819L, this, syntaxTree, new Integer(i));
            }
            if (this.vJ) {
                this.VH.XX(this.U2);
                this.VH.XX(0);
                this.VH.oT("adrt/ADRTThread", "onThisAvailable", "(Ljava/lang/Object;)V");
            }
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, 24267166585118819L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -6243008065894570752L)
    private int sT(ClassType classType, char[] cArr, int i) throws Throwable {
        Throwable th;
        try {
            if (kQ) {
                iy.we(-3908277405433164373L, this, classType, cArr, new Integer(i));
            }
            if (classType.Pa() > 0) {
                if (i >= cArr.length) {
                    return -1;
                }
                int i2 = i + 1;
                try {
                    cArr[i] = '<';
                    int iPa = classType.Pa();
                    int i3 = 0;
                    while (i3 < iPa) {
                        ParameterType parameterTypeAn = classType.An(i3);
                        int iZo = this.DW.Zo(parameterTypeAn.getIdentifier(), cArr, i2);
                        if (iZo == -1 || iZo >= cArr.length) {
                            return -1;
                        }
                        int iN0 = iZo + 1;
                        try {
                            cArr[iZo] = ':';
                            int iYe = parameterTypeAn.ye();
                            for (int i4 = 0; i4 < iYe; i4++) {
                                iN0 = N0(parameterTypeAn.Ev(i4), cArr, iN0);
                                if (iN0 == -1) {
                                    return -1;
                                }
                            }
                            i3++;
                            i2 = iN0;
                        } catch (Throwable th2) {
                            th = th2;
                            i = iN0;
                            if (!yO) {
                                throw th;
                            }
                            iy.U2(th, -3908277405433164373L, this, classType, cArr, new Integer(i));
                            throw th;
                        }
                    }
                    if (i2 >= cArr.length) {
                        return -1;
                    }
                    i = i2 + 1;
                    cArr[i2] = '>';
                } catch (Throwable th3) {
                    th = th3;
                    i = i2;
                }
            }
            for (int i5 = 0; i5 < classType.qP(); i5++) {
                i = N0(classType.oa(i5), cArr, i);
                if (i == -1) {
                    return -1;
                }
            }
            return i;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v15 */
    @ey(method = 208032736988800976L)
    private void sg(SyntaxTree syntaxTree, int i) throws Throwable {
        int syntaxTag;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Type type;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = i;
        try {
            if (kQ) {
                iy.EQ(-4391864023565577625L, this, syntaxTree, new Integer(i14));
            }
            syntaxTag = syntaxTree.getSyntaxTag(i);
        } catch (Throwable th) {
            th = th;
        }
        if (syntaxTag == 133) {
            int i15 = this.QX;
            this.QX = this.VH.CN();
            int childCount = syntaxTree.getChildCount(i);
            for (int i16 = 1; i16 < childCount - 1; i16++) {
                sg(syntaxTree, syntaxTree.getChildNode(i14, i16));
            }
            this.VH.sy(this.QX);
            this.QX = i15;
            return;
        }
        int i17 = 3;
        ?? r13 = 0;
        if (syntaxTag == 209) {
            fN(syntaxTree, syntaxTree.getChildNode(i14, 0));
            int iCN = this.VH.CN();
            if (this.Mz) {
                oa(this.XL, false);
                this.VH.fh(this.a8, 0, this.rN, TI(), "()Z");
            } else {
                oa(this.XL, false);
                this.VH.a5(this.a8, 0, this.rN, TI(), "Z");
            }
            this.VH.Of(iCN, true);
            aq(syntaxTree.getStartLine(i));
            SI(syntaxTree, syntaxTree.getChildNode(i14, 1), iCN, true);
            this.VH.Qs("java/lang/AssertionError");
            this.VH.w9();
            if (syntaxTree.getChildCount(i) == 3) {
                this.VH.nl("java/lang/AssertionError", "<init>", "()V");
            } else {
                sy(syntaxTree, syntaxTree.getChildNode(i14, 3), false);
                int semantic = syntaxTree.getAttrType(syntaxTree.getChildNode(i14, 3)).getSemantic();
                if (semantic == 3 || semantic == 5 || semantic == 7) {
                    this.VH.nl("java/lang/AssertionError", "<init>", "(I)V");
                } else if (semantic != 9) {
                    switch (semantic) {
                        case 11:
                            this.VH.nl("java/lang/AssertionError", "<init>", "(Z)V");
                            break;
                        case 12:
                            this.VH.nl("java/lang/AssertionError", "<init>", "(C)V");
                            break;
                        case 13:
                            this.VH.nl("java/lang/AssertionError", "<init>", "(F)V");
                            break;
                        case 14:
                            this.VH.nl("java/lang/AssertionError", "<init>", "(D)V");
                            break;
                        default:
                            this.VH.nl("java/lang/AssertionError", "<init>", "(Ljava/lang/Object;)V");
                            break;
                    }
                } else {
                    this.VH.nl("java/lang/AssertionError", "<init>", "(J)V");
                }
            }
            this.VH.jJ();
            this.VH.sy(iCN);
            return;
        }
        if (syntaxTag == 211) {
            aq(syntaxTree.getStartLine(i));
            fN(syntaxTree, syntaxTree.getChildNode(i14, 0));
            int i18 = this.QX;
            int iCN2 = this.VH.CN();
            int iCN3 = this.VH.CN();
            int iCN4 = this.VH.CN();
            int iCN5 = this.VH.CN();
            this.QX = iCN2;
            Type attrType = syntaxTree.getAttrType(syntaxTree.getChildNode(i14, 8));
            Type attrType2 = syntaxTree.getAttrType(syntaxTree.getChildNode(i14, 5));
            int attrVariableSlot = syntaxTree.getAttrVariableSlot(syntaxTree.getChildNode(i14, 5));
            int childNode = syntaxTree.getChildNode(i14, 5);
            int identifier = syntaxTree.getIdentifier(childNode);
            int attrVariableSlot2 = syntaxTree.getAttrVariableSlot(i);
            if (attrType.isArrayType()) {
                Type elementType = ((ArrayType) attrType).getElementType();
                sy(syntaxTree, syntaxTree.getChildNode(i14, 8), false);
                this.VH.XG(attrVariableSlot2);
                this.VH.qP(0);
                int i19 = attrVariableSlot2 + 1;
                this.VH.DY(i19);
                this.VH.IS(iCN3);
                this.VH.sy(iCN5);
                oa(attrType2, true);
                b1(identifier);
                if (this.lp) {
                    try {
                        i3 = iCN5;
                        i4 = iCN3;
                        i5 = childNode;
                        this.VH.aj(this.QX, attrVariableSlot, this.yS, 0, this.gW, this.a8, 0, this.rN);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    i5 = childNode;
                    i4 = iCN3;
                    i3 = iCN5;
                }
                this.vy.tp(i14, iCN4);
                this.BT.tp(i14, iCN2);
                this.VH.XX(attrVariableSlot2);
                this.VH.zf(i19);
                j3(elementType);
                dx(syntaxTree, elementType, attrType2);
                An(attrVariableSlot, attrType2, true);
                Nh(syntaxTree, i5, attrVariableSlot, attrType2);
                Pa(syntaxTree, i14, attrVariableSlot, attrType2);
                AE(syntaxTree, syntaxTree.getChildNode(i14, 5), attrVariableSlot, attrType2);
                sg(syntaxTree, syntaxTree.getChildNode(i14, 10));
                this.vy.we(i14);
                this.BT.we(i14);
                this.VH.sy(iCN4);
                this.VH.eN(i19, 1);
                this.VH.sy(i4);
                this.VH.zf(i19);
                this.VH.XX(attrVariableSlot2);
                this.VH.yO();
                this.VH.Ej(i3, true);
                i2 = iCN2;
            } else if (attrType.isImplicitConvertibleTo(syntaxTree.getFile(), syntaxTree.getLanguage(), this.j6.wc(syntaxTree.getFile()))) {
                sy(syntaxTree, syntaxTree.getChildNode(i14, 8), false);
                this.VH.Eq("java/util/Collection");
                this.VH.u9("java/util/Collection", "iterator", "()Ljava/util/Iterator;");
                this.VH.XG(attrVariableSlot2);
                this.VH.IS(iCN3);
                this.VH.sy(iCN5);
                oa(attrType2, true);
                b1(identifier);
                if (this.lp) {
                    this.VH.aj(this.QX, attrVariableSlot, this.yS, 0, this.gW, this.a8, 0, this.rN);
                }
                this.vy.tp(i14, iCN3);
                i2 = iCN2;
                this.BT.tp(i14, i2);
                this.VH.XX(attrVariableSlot2);
                this.VH.u9("java/util/Iterator", "next", "()Ljava/lang/Object;");
                if (this.j6.Jl(attrType2)) {
                    dx(syntaxTree, this.j6.Hw(syntaxTree.getFile(), attrType2), attrType2);
                } else {
                    oa(attrType2, false);
                    this.VH.hz(this.a8, 0, this.rN);
                }
                An(attrVariableSlot, attrType2, true);
                Nh(syntaxTree, childNode, attrVariableSlot, attrType2);
                Pa(syntaxTree, i14, attrVariableSlot, attrType2);
                AE(syntaxTree, syntaxTree.getChildNode(i14, 5), attrVariableSlot, attrType2);
                sg(syntaxTree, syntaxTree.getChildNode(i14, 10));
                this.vy.we(i14);
                this.BT.we(i14);
                this.VH.sy(iCN3);
                this.VH.XX(attrVariableSlot2);
                this.VH.u9("java/util/Iterator", "hasNext", "()Z");
                this.VH.Of(iCN5, true);
            } else {
                i2 = iCN2;
                if (this.I) {
                    sy(syntaxTree, syntaxTree.getChildNode(i14, 8), false);
                    this.VH.Eq("javalangIterable");
                    this.VH.u9("javalangIterable", "iterator", "()Ljava/util/Iterator;");
                    this.VH.XG(attrVariableSlot2);
                    this.VH.IS(iCN3);
                    this.VH.sy(iCN5);
                    this.vy.tp(i14, iCN3);
                    this.BT.tp(i14, i2);
                    this.VH.XX(attrVariableSlot2);
                    this.VH.u9("java/util/Iterator", "next", "()Ljava/lang/Object;");
                    if (this.j6.Jl(attrType2)) {
                        dx(syntaxTree, this.j6.Hw(syntaxTree.getFile(), attrType2), attrType2);
                    } else {
                        oa(attrType2, false);
                        this.VH.hz(this.a8, 0, this.rN);
                    }
                    An(attrVariableSlot, attrType2, true);
                    Pa(syntaxTree, i14, attrVariableSlot, attrType2);
                    AE(syntaxTree, syntaxTree.getChildNode(i14, 5), attrVariableSlot, attrType2);
                    sg(syntaxTree, syntaxTree.getChildNode(i14, 10));
                    this.vy.we(i14);
                    this.BT.we(i14);
                    this.VH.sy(iCN3);
                    this.VH.XX(attrVariableSlot2);
                    this.VH.u9("java/util/Iterator", "hasNext", "()Z");
                    this.VH.Of(iCN5, true);
                } else {
                    sy(syntaxTree, syntaxTree.getChildNode(i14, 8), false);
                    this.VH.Eq("java/lang/Iterable");
                    this.VH.u9("java/lang/Iterable", "iterator", "()Ljava/util/Iterator;");
                    this.VH.XG(attrVariableSlot2);
                    this.VH.IS(iCN3);
                    this.VH.sy(iCN5);
                    this.vy.tp(i14, iCN3);
                    this.BT.tp(i14, i2);
                    this.VH.XX(attrVariableSlot2);
                    this.VH.u9("java/util/Iterator", "next", "()Ljava/lang/Object;");
                    if (this.j6.Jl(attrType2)) {
                        dx(syntaxTree, this.j6.Hw(syntaxTree.getFile(), attrType2), attrType2);
                    } else {
                        oa(attrType2, false);
                        this.VH.hz(this.a8, 0, this.rN);
                    }
                    An(attrVariableSlot, attrType2, true);
                    Nh(syntaxTree, childNode, attrVariableSlot, attrType2);
                    Pa(syntaxTree, i14, attrVariableSlot, attrType2);
                    AE(syntaxTree, syntaxTree.getChildNode(i14, 5), attrVariableSlot, attrType2);
                    sg(syntaxTree, syntaxTree.getChildNode(i14, 10));
                    this.vy.we(i14);
                    this.BT.we(i14);
                    this.VH.sy(iCN3);
                    this.VH.XX(attrVariableSlot2);
                    this.VH.u9("java/util/Iterator", "hasNext", "()Z");
                    this.VH.Of(iCN5, true);
                }
            }
            this.VH.sy(i2);
            this.QX = i18;
            return;
        }
        int i20 = 2;
        if (syntaxTag == 212) {
            int iCN6 = this.VH.CN();
            int iCN7 = this.VH.CN();
            int iCN8 = this.VH.CN();
            int iCN9 = this.VH.CN();
            int iCN10 = this.VH.CN();
            this.VH.sy(iCN9);
            int attrVariableSlot3 = syntaxTree.getAttrVariableSlot(i);
            this.VH.br();
            this.VH.XG(attrVariableSlot3);
            cT(syntaxTree, i);
            int childCount2 = syntaxTree.getChildCount(i);
            for (int i21 = 2; i21 < childCount2 - 2; i21++) {
                sg(syntaxTree, syntaxTree.getChildNode(i14, i21));
            }
            this.nw.add(i14);
            this.VH.sy(iCN6);
            sg(syntaxTree, syntaxTree.getChildNode(i14, syntaxTree.getChildCount(i) - 1));
            this.nw.pop();
            lg(syntaxTree, i);
            this.VH.IS(iCN8);
            this.VH.sy(iCN7);
            this.VH.j3(iCN6, iCN7);
            this.VH.XG(attrVariableSlot3);
            lg(syntaxTree, i);
            this.VH.XX(attrVariableSlot3);
            this.VH.jJ();
            int i22 = attrVariableSlot3 + 1;
            int iCN11 = this.VH.CN();
            int iCN12 = this.VH.CN();
            this.VH.sy(iCN10);
            this.VH.j3(iCN9, iCN10);
            this.VH.XG(i22);
            this.VH.XX(attrVariableSlot3);
            this.VH.PT(iCN11, false);
            this.VH.XX(i22);
            this.VH.XG(attrVariableSlot3);
            this.VH.IS(iCN12);
            this.VH.sy(iCN11);
            this.VH.XX(attrVariableSlot3);
            this.VH.XX(i22);
            this.VH.b1(iCN12, true);
            this.VH.XX(attrVariableSlot3);
            this.VH.XX(i22);
            this.VH.oT("java/lang/Throwable", "addSuppressed", "(Ljava/lang/Throwable;)V");
            this.VH.sy(iCN12);
            this.VH.XX(attrVariableSlot3);
            this.VH.jJ();
            this.VH.sy(iCN8);
            return;
        }
        switch (syntaxTag) {
            case 135:
                int childNode2 = syntaxTree.getChildNode(i14, 2);
                if (!syntaxTree.hasAttrValue(childNode2) || this.entitySpace.vJ(syntaxTree.getAttrValue(childNode2))) {
                    int iCN13 = this.VH.CN();
                    aq(syntaxTree.getStartLine(i));
                    fN(syntaxTree, syntaxTree.getChildNode(i14, 0));
                    SI(syntaxTree, childNode2, iCN13, false);
                    sg(syntaxTree, syntaxTree.getChildNode(i14, 4));
                    this.VH.sy(iCN13);
                    return;
                }
                if (this.vJ) {
                    int iCN14 = this.VH.CN();
                    aq(syntaxTree.getStartLine(i));
                    fN(syntaxTree, syntaxTree.getChildNode(i14, 0));
                    SI(syntaxTree, childNode2, iCN14, false);
                    this.VH.sy(iCN14);
                    return;
                }
                return;
            case 136:
                int iCN15 = this.VH.CN();
                int iCN16 = this.VH.CN();
                aq(syntaxTree.getStartLine(i));
                fN(syntaxTree, syntaxTree.getChildNode(i14, 0));
                SI(syntaxTree, syntaxTree.getChildNode(i14, 2), iCN16, false);
                sg(syntaxTree, syntaxTree.getChildNode(i14, 4));
                this.VH.IS(iCN15);
                this.VH.sy(iCN16);
                sg(syntaxTree, syntaxTree.getChildNode(i14, 6));
                this.VH.sy(iCN15);
                return;
            case 137:
                int iCN17 = this.VH.CN();
                int iCN18 = this.VH.CN();
                int iCN19 = this.VH.CN();
                fN(syntaxTree, syntaxTree.getChildNode(i14, 0));
                this.VH.IS(iCN17);
                this.VH.sy(iCN18);
                this.vy.tp(i14, iCN17);
                this.BT.tp(i14, iCN19);
                sg(syntaxTree, syntaxTree.getChildNode(i14, 4));
                this.vy.we(i14);
                this.BT.we(i14);
                this.VH.sy(iCN17);
                aq(syntaxTree.getStartLine(i));
                SI(syntaxTree, syntaxTree.getChildNode(i14, 2), iCN18, true);
                this.VH.sy(iCN19);
                return;
            case 138:
                aq(syntaxTree.getStartLine(i));
                fN(syntaxTree, syntaxTree.getChildNode(i14, 0));
                zh(syntaxTree, i);
                this.VH.IS(this.BT.VH(syntaxTree.getAttrTarget(i)));
                return;
            case 139:
                aq(syntaxTree.getStartLine(i));
                fN(syntaxTree, syntaxTree.getChildNode(i14, 0));
                zh(syntaxTree, i);
                this.VH.IS(this.vy.VH(syntaxTree.getAttrTarget(i)));
                return;
            case 140:
                int attrVariableSlot4 = syntaxTree.getAttrVariableSlot(i);
                int i23 = attrVariableSlot4 + 1;
                this.P8.push(attrVariableSlot4);
                this.ei.push(i14);
                int iCN20 = this.VH.CN();
                int iCN21 = this.VH.CN();
                int iCN22 = this.VH.CN();
                aq(syntaxTree.getStartLine(i));
                fN(syntaxTree, syntaxTree.getChildNode(i14, 0));
                sy(syntaxTree, syntaxTree.getChildNode(i14, 2), false);
                this.VH.XG(attrVariableSlot4);
                this.VH.XX(attrVariableSlot4);
                this.VH.K3();
                this.VH.sy(iCN20);
                sg(syntaxTree, syntaxTree.getChildNode(i14, 4));
                this.VH.sy(iCN21);
                this.VH.XX(attrVariableSlot4);
                this.VH.OM();
                this.VH.IS(iCN22);
                this.VH.j3(iCN20, iCN21);
                this.VH.XG(i23);
                this.VH.XX(attrVariableSlot4);
                this.VH.OM();
                this.VH.XX(i23);
                this.VH.jJ();
                this.VH.sy(iCN22);
                this.P8.pop();
                this.ei.pop();
                return;
            case 141:
                aq(syntaxTree.getStartLine(i));
                aj(syntaxTree, i);
                if (syntaxTree.getChildCount(i) == 2) {
                    zh(syntaxTree, i);
                    ye(syntaxTree, i);
                    this.VH.IM();
                    return;
                }
                OW(syntaxTree, syntaxTree.getChildNode(i14, 1), false);
                dx(syntaxTree, syntaxTree.getAttrType(syntaxTree.getChildNode(i14, 1)), this.Mr);
                if (this.KD.size() > 0) {
                    An(this.ro.peek(), this.Mr, true);
                    zh(syntaxTree, i);
                    Za(this.ro.peek(), this.Mr);
                } else {
                    zh(syntaxTree, i);
                }
                qp(syntaxTree, syntaxTree.getChildNode(i14, 1));
                sE(this.Mr);
                return;
            case 142:
                aq(syntaxTree.getStartLine(i));
                aj(syntaxTree, i);
                sy(syntaxTree, syntaxTree.getChildNode(i14, 1), false);
                pO(syntaxTree, syntaxTree.getChildNode(i14, 0));
                this.VH.jJ();
                return;
            default:
                switch (syntaxTag) {
                    case ProxyTextView.INPUTTYPE_textVisiblePassword /* 145 */:
                        int iCN23 = this.VH.CN();
                        int iCN24 = this.VH.CN();
                        int iCN25 = this.VH.CN();
                        fN(syntaxTree, syntaxTree.getChildNode(i14, 0));
                        this.VH.sy(iCN24);
                        this.vy.tp(i14, iCN23);
                        this.BT.tp(i14, iCN25);
                        sg(syntaxTree, syntaxTree.getChildNode(i14, 1));
                        this.vy.we(i14);
                        this.BT.we(i14);
                        this.VH.sy(iCN23);
                        aq(syntaxTree.getStartLine(i));
                        SI(syntaxTree, syntaxTree.getChildNode(i14, 4), iCN24, true);
                        this.VH.sy(iCN25);
                        return;
                    case 146:
                        int syntaxTag2 = syntaxTree.getSyntaxTag(syntaxTree.getChildNode(i14, 0));
                        if (syntaxTag2 == 163 || syntaxTag2 == 164) {
                            aq(syntaxTree.getStartLine(i));
                            aj(syntaxTree, i);
                            sy(syntaxTree, syntaxTree.getChildNode(i14, 0), true);
                            return;
                        } else {
                            aq(syntaxTree.getStartLine(i));
                            int iCN26 = this.VH.CN();
                            lp(syntaxTree, i14, iCN26);
                            sy(syntaxTree, syntaxTree.getChildNode(i14, 0), true);
                            this.VH.sy(iCN26);
                            return;
                        }
                    case 147:
                        aX(syntaxTree, i);
                        return;
                    case 148:
                        int iCN27 = this.VH.CN();
                        this.BT.tp(i14, iCN27);
                        sg(syntaxTree, syntaxTree.getChildNode(i14, 2));
                        this.VH.sy(iCN27);
                        return;
                    case 149:
                        aq(syntaxTree.getStartLine(i));
                        fN(syntaxTree, syntaxTree.getChildNode(i14, 0));
                        int i24 = this.QX;
                        int iCN28 = this.VH.CN();
                        this.QX = iCN28;
                        int iCN29 = this.VH.CN();
                        int iCN30 = this.VH.CN();
                        int iCN31 = this.VH.CN();
                        int childNode3 = syntaxTree.getChildNode(i14, 2);
                        if (syntaxTree.getSyntaxTag(syntaxTree.getChildNode(childNode3, 0)) != 14) {
                            int childCount3 = syntaxTree.getChildCount(childNode3);
                            for (int i25 = 0; i25 < childCount3; i25 += 2) {
                                if (syntaxTree.getSyntaxTag(syntaxTree.getChildNode(childNode3, i25)) == 151) {
                                    sg(syntaxTree, syntaxTree.getChildNode(childNode3, i25));
                                } else if (this.vJ) {
                                    int iCN32 = this.VH.CN();
                                    lp(syntaxTree, syntaxTree.getChildNode(childNode3, i25), iCN32);
                                    sy(syntaxTree, syntaxTree.getChildNode(childNode3, i25), true);
                                    this.VH.sy(iCN32);
                                } else {
                                    aj(syntaxTree, syntaxTree.getChildNode(childNode3, i25));
                                    sy(syntaxTree, syntaxTree.getChildNode(childNode3, i25), true);
                                }
                            }
                        }
                        this.VH.IS(iCN29);
                        this.VH.sy(iCN31);
                        this.vy.tp(i14, iCN30);
                        this.BT.tp(i14, iCN28);
                        sg(syntaxTree, syntaxTree.getChildNode(i14, 6));
                        this.vy.we(i14);
                        this.BT.we(i14);
                        this.VH.sy(iCN30);
                        int childNode4 = syntaxTree.getChildNode(i14, 4);
                        if (syntaxTree.getChildCount(childNode4) > 0) {
                            int childCount4 = syntaxTree.getChildCount(childNode4);
                            for (int i26 = 0; i26 < childCount4; i26 += 2) {
                                aq(syntaxTree.getStartLine(childNode4));
                                if (this.vJ) {
                                    int iCN33 = this.VH.CN();
                                    lp(syntaxTree, childNode4, iCN33);
                                    sy(syntaxTree, syntaxTree.getChildNode(childNode4, i26), true);
                                    this.VH.sy(iCN33);
                                } else {
                                    sy(syntaxTree, syntaxTree.getChildNode(childNode4, i26), true);
                                }
                            }
                        }
                        this.VH.sy(iCN29);
                        int childNode5 = syntaxTree.getChildNode(i14, 3);
                        if (syntaxTree.getSyntaxTag(syntaxTree.getChildNode(childNode5, 0)) != 14) {
                            SI(syntaxTree, syntaxTree.getChildNode(childNode5, 0), iCN31, true);
                        } else {
                            this.VH.IS(iCN31);
                        }
                        this.VH.sy(iCN28);
                        this.QX = i24;
                        return;
                    case 150:
                        fN(syntaxTree, syntaxTree.getChildNode(i14, 0));
                        int iCN34 = this.VH.CN();
                        int iCN35 = this.VH.CN();
                        int iCN36 = this.VH.CN();
                        int iCN37 = this.VH.CN();
                        int childNode6 = syntaxTree.getChildNode(i14, syntaxTree.getChildCount(i) - 1);
                        boolean z = syntaxTree.getSyntaxTag(childNode6) == 205;
                        if (z) {
                            this.SI.add(i14);
                            this.KD.push(childNode6);
                            this.ro.push(syntaxTree.getAttrVariableSlot(childNode6) + 2);
                        }
                        this.VH.sy(iCN34);
                        sg(syntaxTree, syntaxTree.getChildNode(i14, 1));
                        this.VH.sy(iCN35);
                        this.VH.IS(iCN36);
                        if (z) {
                            this.SI.pop();
                            this.KD.pop();
                            this.ro.pop();
                        }
                        int childCount5 = syntaxTree.getChildCount(i);
                        int i27 = 2;
                        while (i27 < childCount5) {
                            int childNode7 = syntaxTree.getChildNode(i14, i27);
                            if (syntaxTree.getSyntaxTag(childNode7) == 204) {
                                int childNode8 = syntaxTree.getChildNode(childNode7, 3);
                                int childCount6 = syntaxTree.getChildCount(childNode8);
                                int i28 = 0;
                                while (i28 < childCount6) {
                                    Type attrType3 = syntaxTree.getAttrType(syntaxTree.getChildNode(childNode8, i28));
                                    oa(attrType3, false);
                                    this.VH.Mr(iCN34, iCN35, this.a8, 0, this.rN);
                                    Eq(attrType3);
                                    i28 += 2;
                                    childNode7 = childNode7;
                                    i27 = i27;
                                    childCount5 = childCount5;
                                    childCount6 = childCount6;
                                    childNode8 = childNode8;
                                    iCN35 = iCN35;
                                }
                                i9 = iCN35;
                                int i29 = childNode7;
                                i10 = i27;
                                i11 = childCount5;
                                int i30 = this.QX;
                                this.QX = this.VH.CN();
                                int childNode9 = syntaxTree.getChildNode(i29, 4);
                                int identifier2 = syntaxTree.getIdentifier(childNode9);
                                Type attrType4 = syntaxTree.getAttrType(childNode9);
                                int attrVariableSlot5 = syntaxTree.getAttrVariableSlot(syntaxTree.getChildNode(i29, 4));
                                this.VH.XG(attrVariableSlot5);
                                oa(attrType4, true);
                                b1(identifier2);
                                if (this.lp) {
                                    i8 = iCN34;
                                    i12 = iCN37;
                                    i13 = i30;
                                    this.VH.aj(this.QX, attrVariableSlot5, this.yS, 0, this.gW, this.a8, 0, this.rN);
                                } else {
                                    i8 = iCN34;
                                    i13 = i30;
                                    i12 = iCN37;
                                }
                                Nh(syntaxTree, childNode9, attrVariableSlot5, attrType4);
                                Pa(syntaxTree, childNode9, attrVariableSlot5, attrType4);
                                AE(syntaxTree, childNode9, attrVariableSlot5, attrType4);
                                Eq(attrType4);
                                fN(syntaxTree, syntaxTree.getChildNode(i29, 0));
                                if (z) {
                                    this.SI.push(i14);
                                    this.KD.push(childNode6);
                                    this.ro.push(syntaxTree.getAttrVariableSlot(childNode6) + 2);
                                }
                                sg(syntaxTree, syntaxTree.getChildNode(i29, syntaxTree.getChildCount(i29) - 1));
                                if (z) {
                                    this.SI.pop();
                                    this.KD.pop();
                                    this.ro.pop();
                                }
                                this.VH.IS(iCN36);
                                this.VH.sy(this.QX);
                                this.QX = i13;
                            } else {
                                i8 = iCN34;
                                i9 = iCN35;
                                i10 = i27;
                                i11 = childCount5;
                                i12 = iCN37;
                            }
                            i27 = i10 + 1;
                            iCN34 = i8;
                            childCount5 = i11;
                            iCN37 = i12;
                            iCN35 = i9;
                        }
                        int i31 = iCN34;
                        int i32 = iCN37;
                        this.VH.sy(i32);
                        if (z) {
                            this.VH.j3(i31, i32);
                            int attrVariableSlot6 = syntaxTree.getAttrVariableSlot(childNode6);
                            this.VH.XG(attrVariableSlot6);
                            sg(syntaxTree, syntaxTree.getChildNode(childNode6, syntaxTree.getChildCount(childNode6) - 1));
                            this.VH.XX(attrVariableSlot6);
                            this.VH.jJ();
                        }
                        this.VH.sy(iCN36);
                        if (z) {
                            sg(syntaxTree, syntaxTree.getChildNode(childNode6, syntaxTree.getChildCount(childNode6) - 1));
                            return;
                        }
                        return;
                    case 151:
                        try {
                            aq(syntaxTree.getStartLine(i));
                            int iCN38 = -1;
                            if (this.vJ) {
                                BR(syntaxTree, i);
                                iCN38 = this.VH.CN();
                                lp(syntaxTree, i14, iCN38);
                                gG(syntaxTree, i);
                            }
                            int childCount7 = syntaxTree.getChildCount(i);
                            int i33 = 3;
                            while (i33 < childCount7) {
                                int childNode10 = syntaxTree.getChildNode(i14, i33);
                                int childNode11 = syntaxTree.getChildNode(childNode10, r13);
                                int identifier3 = syntaxTree.getIdentifier(childNode11);
                                int attrVariableSlot7 = syntaxTree.getAttrVariableSlot(childNode11);
                                Type attrType5 = syntaxTree.getAttrType(childNode11);
                                if (syntaxTree.getChildCount(childNode10) > i20) {
                                    int childNode12 = syntaxTree.getChildNode(childNode10, i17);
                                    if (syntaxTree.getSyntaxTag(childNode12) == 196) {
                                        aM(syntaxTree, childNode12, attrType5);
                                    } else {
                                        sy(syntaxTree, childNode12, r13);
                                        dx(syntaxTree, syntaxTree.getAttrType(childNode12), attrType5);
                                    }
                                    An(attrVariableSlot7, attrType5, true);
                                    oa(attrType5, true);
                                    b1(identifier3);
                                    if (this.lp) {
                                        i6 = childCount7;
                                        type = attrType5;
                                        i7 = attrVariableSlot7;
                                        this.VH.aj(this.QX, i7, this.yS, 0, this.gW, this.a8, 0, this.rN);
                                    } else {
                                        i6 = childCount7;
                                        type = attrType5;
                                        i7 = attrVariableSlot7;
                                    }
                                    Pa(syntaxTree, childNode12, i7, type);
                                    AE(syntaxTree, childNode10, i7, type);
                                } else {
                                    i6 = childCount7;
                                    type = attrType5;
                                    this.cn.tp(childNode11, this.QX);
                                }
                                Eq(type);
                                i33 += 2;
                                i14 = i;
                                childCount7 = i6;
                                i20 = 2;
                                i17 = 3;
                                r13 = 0;
                            }
                            if (this.vJ) {
                                this.VH.sy(iCN38);
                                return;
                            }
                            return;
                        } catch (Throwable th3) {
                            th = th3;
                            i14 = i;
                            break;
                        }
                    default:
                        return;
                }
        }
        Throwable th4 = th;
        if (!yO) {
            throw th4;
        }
        iy.Mr(th4, -4391864023565577625L, this, syntaxTree, new Integer(i14));
        throw th4;
    }

    @ey(method = 1371082781149713221L)
    private void sh(SyntaxTree syntaxTree, int i, Member member) {
        try {
            if (kQ) {
                iy.we(-3909811118581009008L, this, syntaxTree, new Integer(i), member);
            }
            if (!this.aj) {
                sg(syntaxTree, syntaxTree.getChildNode(i, 1));
            }
            if (syntaxTree.getSyntaxTag(syntaxTree.getChildNode(syntaxTree.getChildNode(i, 1), 0)) != 163) {
                ClassType enclosingClassType = member.getEnclosingClassType();
                this.ef = 1;
                int iOY = member.oY();
                if (enclosingClassType.Of()) {
                    this.ef++;
                }
                for (int i2 = 0; i2 < iOY; i2++) {
                    int semantic = member.qp(i2).getSemantic();
                    if (semantic == 9 || semantic == 14) {
                        this.ef += 2;
                    } else {
                        this.ef++;
                    }
                }
                if (enclosingClassType.Of()) {
                    ca(enclosingClassType, 1);
                }
                if (this.J8.v5(enclosingClassType.getId())) {
                    Q6(syntaxTree, enclosingClassType, this.ef);
                }
            }
            if (this.aj) {
                sg(syntaxTree, syntaxTree.getChildNode(i, 1));
            }
            sM(syntaxTree, i);
            if (syntaxTree.getSyntaxTag(syntaxTree.getChildNode(syntaxTree.getChildNode(i, 1), 0)) != 163) {
                kQ(syntaxTree, syntaxTree.getParentNode(syntaxTree.getParentNode(i)));
            }
            int childCount = syntaxTree.getChildCount(i);
            for (int i3 = 2; i3 < childCount - 1; i3++) {
                sg(syntaxTree, syntaxTree.getChildNode(i, i3));
            }
        } catch (Throwable th) {
            if (yO) {
                iy.U2(th, -3909811118581009008L, this, syntaxTree, new Integer(i), member);
            }
            throw th;
        }
    }

    @ey(method = 2134868632666176384L)
    private boolean sv(Member member, Type type, ClassType classType) {
        try {
            if (kQ) {
                iy.we(845788454032097731L, this, member, type, classType);
            }
            if (type == null || !y1.J0(member.getModifiers()) || this.j6.hK(member)) {
                return false;
            }
            return member.getEnclosingClassType().getNamespace() != classType.getNamespace();
        } catch (Throwable th) {
            if (yO) {
                iy.U2(th, 845788454032097731L, this, member, type, classType);
            }
            throw th;
        }
    }

    @ey(method = -2628289002550671720L)
    private void sy(SyntaxTree syntaxTree, int i, boolean z) {
        try {
            if (kQ) {
                iy.we(-1641412727379042585L, this, syntaxTree, new Integer(i), new Boolean(z));
            }
            OW(syntaxTree, i, z);
        } catch (Throwable th) {
            if (yO) {
                iy.U2(th, -1641412727379042585L, this, syntaxTree, new Integer(i), new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 1333795554253511424L)
    private boolean ti(Member member) {
        try {
            if (kQ) {
                iy.tp(22296908496627205L, this, member);
            }
            if (this.aM && !y1.aM(member.getModifiers())) {
                if (!y1.gn(member.getModifiers())) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, 22296908496627205L, this, member);
            }
            throw th;
        }
    }

    @ey(method = -4823530373483570304L)
    private boolean tj(Entity entity) {
        try {
            if (kQ) {
                iy.tp(38491689924708475L, this, entity);
            }
            try {
                if (entity.isClassType()) {
                    if (((ClassType) entity).Pa() > 0) {
                        return true;
                    }
                    int iQP = ((ClassType) entity).qP();
                    for (int i = 0; i < iQP; i++) {
                        if (!qI(((ClassType) entity).oa(i))) {
                            return true;
                        }
                    }
                } else if (entity.isMember() && ((Member) entity).e9()) {
                    if (((Member) entity).Eq() > 0) {
                        return true;
                    }
                    if (!((Member) entity).iW() && !qI(((Member) entity).WB())) {
                        return true;
                    }
                    int iOY = ((Member) entity).oY();
                    for (int i2 = 0; i2 < iOY; i2++) {
                        if (!qI(((Member) entity).qp(i2))) {
                            return true;
                        }
                    }
                    int iXG = ((Member) entity).XG();
                    for (int i3 = 0; i3 < iXG; i3++) {
                        if (!qI(((Member) entity).XX(i3))) {
                            return true;
                        }
                    }
                } else if (entity.isMember() && ((Member) entity).Gj()) {
                    return !qI(((Member) entity).WB());
                }
            } catch (e4 unused) {
            }
            return false;
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, 38491689924708475L, this, entity);
            }
            throw th;
        }
    }

    @ey(method = -3427368935358625659L)
    private void tp(Member member) {
        try {
            if (kQ) {
                iy.tp(-664424108107405952L, this, member);
            }
            if (member.getIdentifier() == this.model.identifierSpace.get("onCreate") && ti(member)) {
                this.VH.XX(0);
                this.VH.BJ(this.debuggerHostPackageName);
                this.VH.iK("adrt/ADRTLogCatReader", "onContext", "(Landroid/content/Context;Ljava/lang/String;)V");
            }
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, -664424108107405952L, this, member);
            }
            throw th;
        }
    }

    @ey(method = -176423986855146825L)
    private void u7(SyntaxTree syntaxTree, boolean z, boolean z2, boolean z3) {
        String str;
        int i;
        String str2;
        char c;
        try {
            if (kQ) {
                iy.J0(-5094852991977455024L, this, syntaxTree, new Boolean(z), new Boolean(z2), new Boolean(z3));
            }
            syntaxTree.getFile().getPathString();
            this.g3 = true;
            Hw(syntaxTree);
            int i2 = 0;
            while (true) {
                str = "adrt/";
                if (i2 >= this.gn.size()) {
                    break;
                }
                int i3 = this.gn.get(i2);
                ClassType classtype = this.entitySpace.getClasstype(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getDeclarationNumber(i3));
                this.XL = classtype;
                this.aM = nl(classtype);
                this.j3 = Ak(this.XL);
                this.vJ = false;
                this.Mz = false;
                BT(z3, false, syntaxTree, i3);
                ce(z3, false, "adrt/", new String[]{"ADRTLogCatReader", "ADRTSender"});
                if (this.I) {
                    Jm(z3, false, k6.j6);
                }
                if (this.XL.getNamespace().getFullyQualifiedNameString().startsWith("com.aide.trainer.")) {
                    Jm(z3, false, k6.DW);
                }
                i2++;
            }
            this.g3 = false;
            Hw(syntaxTree);
            int i4 = 0;
            while (i4 < this.gn.size()) {
                int i5 = this.gn.get(i4);
                ClassType classtype2 = this.entitySpace.getClasstype(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getDeclarationNumber(i5));
                this.XL = classtype2;
                this.aM = nl(classtype2);
                if (this.XL.isInterfaceType()) {
                    i = i5;
                    str2 = str;
                    c = 2;
                } else {
                    this.vJ = true;
                    this.Mz = true;
                    str2 = str;
                    c = 2;
                    OutputStream outputStreamEi = this.model.j3.ei(this.XL, Hl(this.XL) + "$0$debug.class", GT(this.XL) + "$0$debug", z3, true);
                    if (outputStreamEi != null) {
                        PT(this.XL);
                        this.VH.j6(syntaxTree.getFile().getFullNameString(), 1, this.lg, 0, this.er, GT(this.XL) + "$0$debug", this.br, this.OW);
                        this.dx.clear();
                        this.vy.clear();
                        this.BT.clear();
                        this.P8.clear();
                        this.ei.clear();
                        this.SI.clear();
                        this.KD.clear();
                        this.ro.clear();
                        this.cn.clear();
                        this.VH.Z3("java/lang/Object");
                        i = i5;
                        sG(syntaxTree, syntaxTree.getChildNode(i, syntaxTree.getChildCount(i) - 1));
                        this.VH.oP(outputStreamEi);
                        outputStreamEi.close();
                    } else {
                        i = i5;
                    }
                }
                this.vJ = false;
                this.Mz = false;
                BT(z3, true, syntaxTree, i);
                String[] strArr = new String[9];
                strArr[0] = "ADRT";
                strArr[1] = "ADRTLogCatReader";
                strArr[c] = "ADRTReceiver";
                strArr[3] = "ADRTReflector";
                strArr[4] = "ADRTSender";
                strArr[5] = "ADRTThread";
                strArr[6] = "ADRTThreadLocal";
                strArr[7] = "ADRTLongMap";
                strArr[8] = "ADRTLongSet";
                ce(z3, true, str2, strArr);
                if (this.I) {
                    Jm(z3, true, k6.j6);
                }
                if (this.XL.getNamespace().getFullyQualifiedNameString().startsWith("com.aide.trainer.")) {
                    Jm(z3, true, k6.DW);
                }
                i4++;
                str = str2;
            }
        } catch (Throwable th) {
            if (yO) {
                iy.a8(th, -5094852991977455024L, this, syntaxTree, new Boolean(z), new Boolean(z2), new Boolean(z3));
            }
            throw th;
        }
    }

    @ey(method = 319535226827886069L)
    private boolean u9(Member member) {
        try {
            if (kQ) {
                iy.tp(-352476452353939128L, this, member);
            }
            try {
                if (this.j3 && !y1.aM(member.getModifiers()) && !y1.gn(member.getModifiers()) && member.getIdentifier() == this.model.identifierSpace.get("onReceive") && member.oY() == 2) {
                    return member.qp(0).getFullyQualifiedNameString().equals("android.content.Context");
                }
                return false;
            } catch (e4 unused) {
                return false;
            }
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, -352476452353939128L, this, member);
            }
            throw th;
        }
    }

    @ey(method = 2087958891694990383L)
    private boolean uC(SyntaxTree syntaxTree, int i) {
        try {
            if (kQ) {
                iy.EQ(14039032116011136L, this, syntaxTree, new Integer(i));
            }
            if (syntaxTree.getSyntaxTag(i) != 161) {
                return false;
            }
            int childNode = syntaxTree.getChildNode(i, syntaxTree.getChildCount(i) - 1);
            if (syntaxTree.sh(childNode) != 16) {
                return false;
            }
            return this.FH.vJ(((Member) syntaxTree.getAttrReferenceEntity(childNode)).getFile());
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, 14039032116011136L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -116657890358045648L)
    private void v5(SyntaxTree syntaxTree, int i) {
        try {
            if (kQ) {
                iy.EQ(-2354215322943062239L, this, syntaxTree, new Integer(i));
            }
            int syntaxTag = syntaxTree.getSyntaxTag(i);
            int i2 = 0;
            if (syntaxTag == 1) {
                int iSh = syntaxTree.sh(i);
                if (iSh == 3) {
                    this.J8.VH(this.XL.getId(), syntaxTree.getAttrReferenceNode(i));
                    return;
                }
                if (iSh != 16) {
                    if (iSh != 20) {
                        return;
                    }
                    Member member = (Member) syntaxTree.getAttrReferenceEntity(i);
                    if (syntaxTree.getSyntaxTag(syntaxTree.getParentNode(i)) == 157 && syntaxTree.getChildCount(syntaxTree.getParentNode(i)) > 5) {
                        this.J0.gn(((ClassType) syntaxTree.getAttrType(syntaxTree.getChildNode(syntaxTree.getParentNode(i), 0))).getId(), member.getId());
                        return;
                    }
                    if (!this.g3 && syntaxTree.getSyntaxTag(syntaxTree.getParentNode(i)) == 157) {
                        this.J0.gn(this.XL.getId(), member.getId());
                        return;
                    }
                    if (oT(member, this.XL)) {
                        this.EQ.put(member);
                        return;
                    }
                    if (!this.g3 && iK(member, this.XL)) {
                        this.EQ.put(member);
                        return;
                    }
                    if (qU(syntaxTree, member, syntaxTree.getAttrInvocationType(i), this.XL)) {
                        this.we.gn(((ClassType) syntaxTree.getAttrInvocationType(i).x9()).getId(), member.getId());
                        return;
                    } else {
                        if (this.g3 || !sv(member, syntaxTree.getAttrInvocationType(i), this.XL)) {
                            return;
                        }
                        this.we.gn(((ClassType) syntaxTree.getAttrInvocationType(i).x9()).getId(), member.getId());
                        return;
                    }
                }
                Member member2 = (Member) syntaxTree.getAttrReferenceEntity(i);
                if (HT(member2, this.XL)) {
                    this.EQ.put(member2);
                } else if (!this.g3 && k1(member2, this.XL)) {
                    this.EQ.put(member2);
                } else if (hx(syntaxTree, member2, syntaxTree.getAttrInvocationType(i), this.XL)) {
                    this.we.gn(((ClassType) syntaxTree.getAttrInvocationType(i).x9()).getId(), member2.getId());
                } else if (fh(member2, syntaxTree.getAttrInvocationType(i), this.XL)) {
                    this.we.gn(((ClassType) syntaxTree.getAttrInvocationType(i).x9()).getId(), member2.getId());
                }
                if (this.g3 || member2.getEnclosingClassType() != this.XL || member2.gG()) {
                    return;
                }
                int parentNode = syntaxTree.getParentNode(syntaxTree.getParentNode(i));
                if (syntaxTree.getSyntaxTag(parentNode) == 172) {
                    int childNode = syntaxTree.getChildNode(parentNode, 0);
                    int childNode2 = syntaxTree.getChildNode(parentNode, 2);
                    if (syntaxTree.getSyntaxTag(syntaxTree.getChildNode(parentNode, 1)) == 17) {
                        if ((syntaxTree.getSyntaxTag(childNode) == 159 && syntaxTree.getSyntaxTag(syntaxTree.getChildNode(childNode, 0)) == 166) || (syntaxTree.getSyntaxTag(childNode) == 161 && syntaxTree.getChildCount(childNode) == 1)) {
                            if ((syntaxTree.getSyntaxTag(childNode2) == 159 && syntaxTree.getSyntaxTag(syntaxTree.getChildNode(childNode2, 0)) == 166) || (syntaxTree.getSyntaxTag(childNode2) == 161 && syntaxTree.getChildCount(childNode2) == 1)) {
                                int childNode3 = syntaxTree.getChildNode(childNode2, syntaxTree.getChildCount(childNode2) - 1);
                                if (syntaxTree.sh(childNode3) == 2 && syntaxTree.getSyntaxTag(syntaxTree.getParentNode(syntaxTree.getAttrReferenceNode(childNode3))) == 191) {
                                    int semantic = member2.WB().getSemantic();
                                    if (semantic != 3 && semantic != 5 && semantic != 7 && semantic != 9) {
                                        switch (semantic) {
                                            case 11:
                                            case 12:
                                            case 13:
                                            case 14:
                                                break;
                                            default:
                                                if (member2.WB() != this.j6.oY(syntaxTree.getFile())) {
                                                    return;
                                                }
                                                break;
                                        }
                                    }
                                    this.tp.gn(this.XL.getId(), member2.getId());
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (syntaxTag == 151) {
                int childCount = syntaxTree.getChildCount(i);
                for (int i3 = 3; i3 < childCount; i3 += 2) {
                    this.Ws.FH(syntaxTree.getChildNode(syntaxTree.getChildNode(i, i3), 0), 0, this.XL.getId());
                }
                while (i2 < childCount) {
                    v5(syntaxTree, syntaxTree.getChildNode(i, i2));
                    i2++;
                }
                return;
            }
            if (syntaxTag != 177) {
                if (syntaxTag == 191) {
                    this.Ws.FH(syntaxTree.getChildNode(i, 3), 0, this.XL.getId());
                    return;
                }
                if (syntaxTag == 204) {
                    this.Ws.FH(syntaxTree.getChildNode(i, 4), 0, this.XL.getId());
                    int childCount2 = syntaxTree.getChildCount(i);
                    while (i2 < childCount2) {
                        v5(syntaxTree, syntaxTree.getChildNode(i, i2));
                        i2++;
                    }
                    return;
                }
                if (syntaxTag == 209) {
                    this.u7.put(this.XL);
                    int childCount3 = syntaxTree.getChildCount(i);
                    while (i2 < childCount3) {
                        v5(syntaxTree, syntaxTree.getChildNode(i, i2));
                        i2++;
                    }
                    return;
                }
                if (syntaxTag == 211) {
                    this.Ws.FH(syntaxTree.getChildNode(i, 5), 0, this.XL.getId());
                    int childCount4 = syntaxTree.getChildCount(i);
                    while (i2 < childCount4) {
                        v5(syntaxTree, syntaxTree.getChildNode(i, i2));
                        i2++;
                    }
                    return;
                }
                if (syntaxTag != 120 && syntaxTag != 121 && syntaxTag != 128 && syntaxTag != 129 && syntaxTag != 227 && syntaxTag != 228) {
                    switch (syntaxTag) {
                        case 220:
                        case 221:
                        case 222:
                            break;
                        default:
                            int childCount5 = syntaxTree.getChildCount(i);
                            while (i2 < childCount5) {
                                v5(syntaxTree, syntaxTree.getChildNode(i, i2));
                                i2++;
                            }
                            return;
                    }
                }
            }
            this.Ws.Hw();
            this.gn.add(i);
            ClassType classType = this.XL;
            this.XL = this.entitySpace.getClasstype(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getDeclarationNumber(i));
            int childCount6 = syntaxTree.getChildCount(i);
            for (int i4 = 0; i4 < childCount6; i4++) {
                v5(syntaxTree, syntaxTree.getChildNode(i, i4));
            }
            ListOfInt listOfInt = new ListOfInt();
            SetOf<ClassType> setOfFN = this.XL.fN();
            setOfFN.DEFAULT_ITERATOR.init();
            while (setOfFN.DEFAULT_ITERATOR.hasMoreElements()) {
                ClassType classType2 = (ClassType) setOfFN.DEFAULT_ITERATOR.nextKey();
                if (this.J8.v5(classType2.getId())) {
                    this.J8.default_Iterator.FH(classType2.getId());
                    while (this.J8.default_Iterator.hasMoreElements()) {
                        int iNextValue = this.J8.default_Iterator.nextValue();
                        if (!this.Ws.DW(iNextValue, this.XL.getId())) {
                            listOfInt.add(iNextValue);
                        }
                    }
                }
                for (int i5 = 0; i5 < listOfInt.size(); i5++) {
                    this.J8.VH(this.XL.getId(), listOfInt.get(i5));
                }
            }
            if (classType != null && this.J8.v5(this.XL.getId())) {
                ListOfInt listOfInt2 = new ListOfInt();
                this.J8.default_Iterator.FH(this.XL.getId());
                while (this.J8.default_Iterator.hasMoreElements()) {
                    int iNextValue2 = this.J8.default_Iterator.nextValue();
                    if (!this.Ws.DW(iNextValue2, classType.getId())) {
                        listOfInt2.add(iNextValue2);
                    }
                }
                while (i2 < listOfInt2.size()) {
                    this.J8.VH(classType.getId(), listOfInt2.get(i2));
                    i2++;
                }
            }
            this.XL = classType;
            this.Ws.VH();
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, -2354215322943062239L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 271861124089623211L)
    private void vJ(SyntaxTree syntaxTree, int i, Type type) {
        try {
            if (kQ) {
                iy.we(-369631127601030640L, this, syntaxTree, new Integer(i), type);
            }
            this.VH.aM();
            a8(syntaxTree, i, type);
        } catch (Throwable th) {
            if (yO) {
                iy.U2(th, -369631127601030640L, this, syntaxTree, new Integer(i), type);
            }
            throw th;
        }
    }

    @ey(method = 2375642232350108413L)
    private void vy(SyntaxTree syntaxTree, int i) {
        try {
            if (kQ) {
                iy.EQ(6915853763437644864L, this, syntaxTree, new Integer(i));
            }
            int childCount = syntaxTree.getChildCount(i);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (RW()) {
                    return;
                }
                nw(syntaxTree, syntaxTree.getChildNode(i, i2));
            }
            if (this.Qq) {
                MapOfInt<Member> mapOfIntE3 = this.XL.e3();
                mapOfIntE3.DEFAULT_ITERATOR.DW();
                while (mapOfIntE3.DEFAULT_ITERATOR.hasMoreElements()) {
                    Member member = (Member) mapOfIntE3.DEFAULT_ITERATOR.nextValue();
                    if (member.getEnclosingClassType() != this.XL && member.isAbstract()) {
                        try {
                            oa(member, false);
                            int iE4 = E4(member, true);
                            b1(pn(member.getIdentifier(), member));
                            this.VH.I(iE4, this.yS, 0, this.gW, this.a8, 0, this.rN, true, false, false);
                            jw(syntaxTree, member);
                        } catch (e4 unused) {
                        }
                    }
                }
            }
            Gj(syntaxTree, i);
            Mz(this.XL);
            n5(syntaxTree, this.XL);
            this.we.j6.FH(this.XL.getId());
            while (this.we.j6.j6()) {
                Entity entity = this.entitySpace.getEntity(this.we.j6.v5());
                if (entity.isMember() && ((Member) entity).Gj()) {
                    XX(syntaxTree, this.XL, (Member) entity);
                } else {
                    jO(syntaxTree, this.XL, (Member) entity, false);
                }
            }
            this.J0.j6.FH(this.XL.getId());
            while (this.J0.j6.j6()) {
                jO(syntaxTree, this.XL, (Member) this.entitySpace.getEntity(this.J0.j6.v5()), true);
            }
            if (this.u7.contains(this.XL)) {
                oa(this.XL, false);
                this.VH.U2(10, TI(), "Z", true, false);
                if (!this.g3) {
                    this.VH.g3(8, TI(), "()Z", true, false, true);
                    oa(this.XL, false);
                    this.VH.a5(this.a8, 0, this.rN, TI(), "Z");
                    this.VH.ep();
                }
            }
            if (this.g3 || this.XL.isInterfaceType()) {
                return;
            }
            this.VH.U2(10, PH(this.XL), "Z", true, false);
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, 6915853763437644864L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -3462373735399929735L)
    private void w9(SyntaxTree syntaxTree, int i, int i2) {
        try {
            if (kQ) {
                iy.we(-1489972931117987520L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            int childNode = syntaxTree.getChildNode(i, i2);
            if (i2 == 0 && syntaxTree.sh(childNode) == 2) {
                Za(syntaxTree.getAttrVariableSlot(childNode), syntaxTree.getAttrType(childNode));
            } else if (i2 == 0 && syntaxTree.sh(childNode) == 3) {
                this.VH.XX(0);
                kf(syntaxTree, syntaxTree.getAttrReferenceNode(childNode));
            } else if (i2 != 0) {
                Member member = (Member) syntaxTree.getAttrReferenceEntity(childNode);
                if (!member.gG()) {
                    w9(syntaxTree, i, i2 - 2);
                }
                yO(syntaxTree, member, syntaxTree.getAttrInvocationType(childNode), syntaxTree.getAttrType(childNode));
            } else {
                Member member2 = (Member) syntaxTree.getAttrReferenceEntity(childNode);
                if (!member2.gG()) {
                    x9(syntaxTree, syntaxTree.getAttrInvocationType(childNode).x9());
                }
                yO(syntaxTree, member2, syntaxTree.getAttrInvocationType(childNode), syntaxTree.getAttrType(childNode));
            }
            AL(syntaxTree, i, childNode);
        } catch (Throwable th) {
            if (yO) {
                iy.U2(th, -1489972931117987520L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -1580312215651942728L)
    private String wE() {
        try {
            if (!kQ) {
                return "this$0";
            }
            iy.gn(701870211213285245L, this);
            return "this$0";
        } catch (Throwable th) {
            if (yO) {
                iy.aM(th, 701870211213285245L, this);
            }
            throw th;
        }
    }

    @ey(method = -1215519479799043575L)
    private void wc(SyntaxTree syntaxTree, Member member, Type type, boolean z) throws Throwable {
        try {
            if (kQ) {
                iy.J0(-308488905650545632L, this, syntaxTree, member, type, new Boolean(z));
            }
            ClassType enclosingClassType = member.getEnclosingClassType();
            Eq(enclosingClassType);
            oa(enclosingClassType, false);
            qP(member, false);
            int iPn = pn(member.getIdentifier(), member);
            if (!z) {
                int semantic = member.WB().getSemantic();
                if (semantic == 9 || semantic == 14) {
                    if (member.gG()) {
                        this.VH.hK();
                    } else {
                        this.VH.cT();
                    }
                } else if (member.gG()) {
                    this.VH.w9();
                } else {
                    this.VH.Z1();
                }
            }
            if (!this.Mz || !fh(member, type, this.XL)) {
                try {
                    if (!hx(syntaxTree, member, type, this.XL)) {
                        if ((!this.Mz || !k1(member, this.XL)) && !HT(member, this.XL)) {
                            if (member.gG()) {
                                b1(iPn);
                                this.VH.NZ(this.a8, 0, this.rN, this.yS, 0, this.gW, this.lg, 0, this.er);
                                return;
                            } else {
                                b1(iPn);
                                this.VH.J1(this.a8, 0, this.rN, this.yS, 0, this.gW, this.lg, 0, this.er);
                                return;
                            }
                        }
                        String strEj = Ej(member);
                        this.er = 0;
                        char[] cArr = this.lg;
                        this.er = 0 + 1;
                        cArr[0] = '(';
                        if (!member.gG()) {
                            VH(enclosingClassType, true);
                        }
                        VH(member, false);
                        char[] cArr2 = this.lg;
                        int i = this.er;
                        int i2 = i + 1;
                        this.er = i2;
                        cArr2[i] = ')';
                        char[] cArr3 = this.lg;
                        int i3 = i2 + 1;
                        this.er = i3;
                        cArr3[i2] = 'V';
                        this.VH.sv(this.a8, 0, this.rN, strEj, this.lg, 0, i3);
                        return;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (yO) {
                        iy.a8(th, -308488905650545632L, this, syntaxTree, member, type, new Boolean(z));
                    }
                    throw th;
                }
            }
            ClassType classType = (ClassType) type.x9();
            oa(classType, false);
            String strEj2 = Ej(member);
            this.er = 0;
            char[] cArr4 = this.lg;
            this.er = 0 + 1;
            cArr4[0] = '(';
            if (!member.gG()) {
                VH(classType, true);
            }
            VH(member, false);
            char[] cArr5 = this.lg;
            int i4 = this.er;
            int i5 = i4 + 1;
            this.er = i5;
            cArr5[i4] = ')';
            char[] cArr6 = this.lg;
            int i6 = i5 + 1;
            this.er = i6;
            cArr6[i5] = 'V';
            this.VH.sv(this.a8, 0, this.rN, strEj2, this.lg, 0, i6);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @ey(method = 180426130433722437L)
    private void we(Member member) {
        try {
            if (kQ) {
                iy.tp(5141632183129939420L, this, member);
            }
            if (this.g3 || this.Mz) {
                return;
            }
            if (ti(member)) {
                this.VH.XX(0);
                this.VH.BJ(this.debuggerHostPackageName);
                this.VH.iK("adrt/ADRT", "onContext", "(Landroid/content/Context;Ljava/lang/String;)V");
            } else if (u9(member)) {
                this.VH.XX(1);
                this.VH.BJ(this.debuggerHostPackageName);
                this.VH.iK("adrt/ADRTLogCatReader", "onContext", "(Landroid/content/Context;Ljava/lang/String;)V");
            }
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, 5141632183129939420L, this, member);
            }
            throw th;
        }
    }

    @ey(method = 2673399089188286640L)
    private String x6(String str) {
        try {
            if (kQ) {
                iy.tp(-1620676979380939041L, this, str);
            }
            return str.replace('.', '$');
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, -1620676979380939041L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -4107934636325349363L)
    private void x9(SyntaxTree syntaxTree, Type type) {
        try {
            if (kQ) {
                iy.EQ(-2482645295412139424L, this, syntaxTree, type);
            }
            if (type != this.XL && !this.XL.Ej(type)) {
                if (this.sG) {
                    this.VH.XX(1);
                } else if (this.Mz) {
                    this.VH.XX(0);
                    g3(this.XL);
                } else {
                    I();
                }
                for (ClassType enclosingClassType = this.XL.getEnclosingClassType(); enclosingClassType != type && !enclosingClassType.Ej(type) && !enclosingClassType.isToplevel(); enclosingClassType = enclosingClassType.getEnclosingClassType()) {
                    g3(enclosingClassType);
                }
                return;
            }
            this.VH.XX(0);
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, -2482645295412139424L, this, syntaxTree, type);
            }
            throw th;
        }
    }

    @ey(method = 4256104963830243844L)
    private String xg(Member member) {
        try {
            if (kQ) {
                iy.tp(-4633665205981030079L, this, member);
            }
            if (!member.gG()) {
                return member.getNameString();
            }
            return member.getNameString() + "$";
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, -4633665205981030079L, this, member);
            }
            throw th;
        }
    }

    @ey(method = -5752736367381793443L)
    private void yO(SyntaxTree syntaxTree, Member member, Type type, Type type2) throws Throwable {
        try {
            if (kQ) {
                iy.J0(-2708722534488205320L, this, syntaxTree, member, type, type2);
            }
            ClassType enclosingClassType = member.getEnclosingClassType();
            Eq(enclosingClassType);
            oa(enclosingClassType, false);
            qP(member, false);
            int iPn = pn(member.getIdentifier(), member);
            if ((this.Mz && fh(member, type, this.XL)) || hx(syntaxTree, member, type, this.XL)) {
                ClassType classType = (ClassType) type.x9();
                oa(classType, false);
                String strOh = oh(member);
                this.er = 0;
                char[] cArr = this.lg;
                this.er = 0 + 1;
                cArr[0] = '(';
                if (!member.gG()) {
                    VH(classType, true);
                }
                char[] cArr2 = this.lg;
                int i = this.er;
                this.er = i + 1;
                cArr2[i] = ')';
                VH(member, false);
                this.VH.sv(this.a8, 0, this.rN, strOh, this.lg, 0, this.er);
            } else if ((this.Mz && k1(member, this.XL)) || HT(member, this.XL)) {
                String strOh2 = oh(member);
                this.er = 0;
                char[] cArr3 = this.lg;
                this.er = 0 + 1;
                cArr3[0] = '(';
                if (!member.gG()) {
                    VH(enclosingClassType, true);
                }
                char[] cArr4 = this.lg;
                int i2 = this.er;
                this.er = i2 + 1;
                cArr4[i2] = ')';
                VH(member, false);
                this.VH.sv(this.a8, 0, this.rN, strOh2, this.lg, 0, this.er);
            } else if (member.gG()) {
                b1(iPn);
                this.VH.ys(this.a8, 0, this.rN, this.yS, 0, this.gW, this.lg, 0, this.er);
            } else {
                b1(iPn);
                this.VH.QO(this.a8, 0, this.rN, this.yS, 0, this.gW, this.lg, 0, this.er);
            }
            try {
                CU(syntaxTree, member.WB(), type2);
            } catch (Throwable th) {
                th = th;
                if (yO) {
                    iy.a8(th, -2708722534488205320L, this, syntaxTree, member, type, type2);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @ey(method = -181090574188498585L)
    private void yS(SyntaxTree syntaxTree, int i, boolean z) {
        try {
            if (kQ) {
                iy.we(2151230469507569964L, this, syntaxTree, new Integer(i), new Boolean(z));
            }
            int iCN = this.VH.CN();
            int iCN2 = this.VH.CN();
            KD(syntaxTree, i, iCN, z);
            this.VH.qP(0);
            this.VH.IS(iCN2);
            this.VH.sy(iCN);
            this.VH.qP(1);
            this.VH.sy(iCN2);
        } catch (Throwable th) {
            if (yO) {
                iy.U2(th, 2151230469507569964L, this, syntaxTree, new Integer(i), new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -6970500247717638720L)
    private void ye(SyntaxTree syntaxTree, int i) {
        try {
            if (kQ) {
                iy.EQ(-4811693747870813945L, this, syntaxTree, new Integer(i));
            }
            if (this.vJ) {
                this.VH.XX(this.U2);
                this.VH.oT("adrt/ADRTThread", "onMethodExit", "()V");
            }
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, -4811693747870813945L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -55297696078144260L)
    private void ys(SyntaxTree syntaxTree, Type type) {
        try {
            if (kQ) {
                iy.EQ(1914391009431984165L, this, syntaxTree, type);
            }
            try {
                if (type == this.j6.Qq(syntaxTree.getFile())) {
                    this.VH.Eq("java/lang/Integer");
                    this.VH.oT("java/lang/Integer", "intValue", "()I");
                    return;
                }
                if (type == this.j6.sG(syntaxTree.getFile())) {
                    this.VH.Eq("java/lang/Byte");
                    this.VH.oT("java/lang/Byte", "byteValue", "()B");
                    return;
                }
                if (type == this.j6.kQ(syntaxTree.getFile())) {
                    this.VH.Eq("java/lang/Short");
                    this.VH.oT("java/lang/Short", "shortValue", "()S");
                    return;
                }
                if (type == this.j6.aj(syntaxTree.getFile())) {
                    this.VH.Eq("java/lang/Long");
                    this.VH.oT("java/lang/Long", "longValue", "()J");
                    return;
                }
                if (type == this.j6.x9(syntaxTree.getFile())) {
                    this.VH.Eq("java/lang/Float");
                    this.VH.oT("java/lang/Float", "floatValue", "()F");
                    return;
                }
                if (type == this.j6.g3(syntaxTree.getFile())) {
                    this.VH.Eq("java/lang/Double");
                    this.VH.oT("java/lang/Double", "doubleValue", "()D");
                } else if (type == this.j6.ef(syntaxTree.getFile())) {
                    this.VH.Eq("java/lang/Character");
                    this.VH.oT("java/lang/Character", "charValue", "()C");
                    this.VH.BR();
                } else if (type == this.j6.dx(syntaxTree.getFile())) {
                    this.VH.Eq("java/lang/Boolean");
                    this.VH.oT("java/lang/Boolean", "booleanValue", "()Z");
                }
            } catch (e4 unused) {
            }
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, 1914391009431984165L, this, syntaxTree, type);
            }
            throw th;
        }
    }

    @ey(method = 732798902719825107L)
    private String zf(SyntaxTree syntaxTree, int i) {
        try {
            if (kQ) {
                iy.EQ(-389837612401200096L, this, syntaxTree, new Integer(i));
            }
            if (syntaxTree.hasAttrValue(i)) {
                long attrValue = syntaxTree.getAttrValue(i);
                int semantic = syntaxTree.getAttrType(i).getSemantic();
                if (semantic == 3 || semantic == 5 || semantic == 7) {
                    return Integer.toString(this.entitySpace.I(attrValue));
                }
                if (semantic == 9) {
                    this.entitySpace.ca(attrValue);
                    return String.valueOf(attrValue);
                }
                switch (semantic) {
                    case 11:
                        return String.valueOf(this.entitySpace.vJ(attrValue));
                    case 12:
                        return String.valueOf((char) this.entitySpace.I(attrValue));
                    case 13:
                        return String.valueOf(this.entitySpace.Mz(attrValue));
                    case 14:
                        return String.valueOf(this.entitySpace.g3(attrValue));
                }
            }
            int syntaxTag = syntaxTree.getSyntaxTag(i);
            if (syntaxTag == 2) {
                String literalString = syntaxTree.getLiteralString(i);
                return literalString.substring(1, literalString.length() - 1);
            }
            if (syntaxTag == 66) {
                return "null";
            }
            if (syntaxTag == 161) {
                int childNode = syntaxTree.getChildNode(i, syntaxTree.getChildCount(i) - 1);
                Member member = (Member) syntaxTree.getAttrReferenceEntity(childNode);
                if (syntaxTree.sh(childNode) == 16 && member.q7()) {
                    return member.ye();
                }
                return null;
            }
            if (syntaxTag == 168) {
                return zf(syntaxTree, syntaxTree.getChildNode(i, 1));
            }
            if (syntaxTag != 172) {
                if (syntaxTag != 178) {
                    return null;
                }
                StringBuffer stringBuffer = new StringBuffer();
                int childCount = syntaxTree.getChildCount(i);
                for (int i2 = 0; i2 < childCount; i2 += 2) {
                    stringBuffer.append(zf(syntaxTree, syntaxTree.getChildNode(i, i2)));
                }
                return stringBuffer.toString();
            }
            if (syntaxTree.getSyntaxTag(syntaxTree.getChildNode(i, 1)) == 21) {
                String strZf = zf(syntaxTree, syntaxTree.getChildNode(i, 0));
                String strZf2 = zf(syntaxTree, syntaxTree.getChildNode(i, 2));
                if (strZf != null && strZf2 != null) {
                    return strZf + strZf2;
                }
            }
            return null;
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, -389837612401200096L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    @abcd.ey(method = -2484969194230858701L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void zh(com.aide.codemodel.api.SyntaxTree r8, int r9) {
        /*
            r7 = this;
            boolean r0 = com.aide.codemodel.language.java.JavaCompiler.kQ     // Catch: java.lang.Throwable -> Ld0
            if (r0 == 0) goto L11
            r0 = -838921634439292744(0xf45b8d37e0db18b8, double:-3.1561943826155727E252)
            java.lang.Integer r2 = new java.lang.Integer     // Catch: java.lang.Throwable -> Ld0
            r2.<init>(r9)     // Catch: java.lang.Throwable -> Ld0
            abcd.iy.EQ(r0, r7, r8, r2)     // Catch: java.lang.Throwable -> Ld0
        L11:
            com.aide.codemodel.api.collections.ListOfInt r0 = r7.ei     // Catch: java.lang.Throwable -> Ld0
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Ld0
            if (r0 != 0) goto L2a
            com.aide.codemodel.api.collections.ListOfInt r0 = r7.SI     // Catch: java.lang.Throwable -> Ld0
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Ld0
            if (r0 != 0) goto L2a
            com.aide.codemodel.api.collections.ListOfInt r0 = r7.nw     // Catch: java.lang.Throwable -> Ld0
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Ld0
            if (r0 != 0) goto L2a
            return
        L2a:
            r0 = 0
            int r1 = r8.getSyntaxTag(r9)     // Catch: java.lang.Throwable -> Ld0
            r2 = 138(0x8a, float:1.93E-43)
            if (r1 == r2) goto L38
            r2 = 139(0x8b, float:1.95E-43)
            if (r1 == r2) goto L38
            goto L3c
        L38:
            int r0 = r8.getAttrTarget(r9)     // Catch: java.lang.Throwable -> Ld0
        L3c:
            com.aide.codemodel.api.collections.ListOfInt r1 = r7.SI     // Catch: java.lang.Throwable -> Ld0
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Ld0
            int r1 = r1 + (-1)
            com.aide.codemodel.api.collections.ListOfInt r2 = r7.ei     // Catch: java.lang.Throwable -> Ld0
            int r2 = r2.size()     // Catch: java.lang.Throwable -> Ld0
            int r2 = r2 + (-1)
            com.aide.codemodel.api.collections.ListOfInt r3 = r7.nw     // Catch: java.lang.Throwable -> Ld0
            int r3 = r3.size()     // Catch: java.lang.Throwable -> Ld0
            int r3 = r3 + (-1)
            r4 = r9
        L55:
            if (r2 < 0) goto L72
            com.aide.codemodel.api.collections.ListOfInt r5 = r7.ei     // Catch: java.lang.Throwable -> Ld0
            int r5 = r5.get(r2)     // Catch: java.lang.Throwable -> Ld0
            if (r4 != r5) goto L72
            abcd.j6 r5 = r7.VH     // Catch: java.lang.Throwable -> Ld0
            com.aide.codemodel.api.collections.ListOfInt r6 = r7.P8     // Catch: java.lang.Throwable -> Ld0
            int r6 = r6.get(r2)     // Catch: java.lang.Throwable -> Ld0
            r5.XX(r6)     // Catch: java.lang.Throwable -> Ld0
            abcd.j6 r5 = r7.VH     // Catch: java.lang.Throwable -> Ld0
            r5.OM()     // Catch: java.lang.Throwable -> Ld0
            int r2 = r2 + (-1)
            goto Lb3
        L72:
            if (r1 < 0) goto La4
            com.aide.codemodel.api.collections.ListOfInt r5 = r7.SI     // Catch: java.lang.Throwable -> Ld0
            int r5 = r5.get(r1)     // Catch: java.lang.Throwable -> Ld0
            if (r4 != r5) goto La4
            com.aide.codemodel.api.collections.ListOfInt r5 = r7.KD     // Catch: java.lang.Throwable -> Ld0
            int r5 = r5.get(r1)     // Catch: java.lang.Throwable -> Ld0
            boolean r5 = r8.isEnclosingNode(r5, r9)     // Catch: java.lang.Throwable -> Ld0
            if (r5 != 0) goto La1
            com.aide.codemodel.api.collections.ListOfInt r5 = r7.KD     // Catch: java.lang.Throwable -> Ld0
            int r5 = r5.get(r1)     // Catch: java.lang.Throwable -> Ld0
            com.aide.codemodel.api.collections.ListOfInt r6 = r7.KD     // Catch: java.lang.Throwable -> Ld0
            int r6 = r6.get(r1)     // Catch: java.lang.Throwable -> Ld0
            int r6 = r8.getChildCount(r6)     // Catch: java.lang.Throwable -> Ld0
            int r6 = r6 + (-1)
            int r5 = r8.getChildNode(r5, r6)     // Catch: java.lang.Throwable -> Ld0
            r7.sg(r8, r5)     // Catch: java.lang.Throwable -> Ld0
        La1:
            int r1 = r1 + (-1)
            goto Lb3
        La4:
            if (r3 < 0) goto Lb3
            com.aide.codemodel.api.collections.ListOfInt r5 = r7.nw     // Catch: java.lang.Throwable -> Ld0
            int r5 = r5.get(r3)     // Catch: java.lang.Throwable -> Ld0
            if (r4 != r5) goto Lb3
            r7.lg(r8, r4)     // Catch: java.lang.Throwable -> Ld0
            int r3 = r3 + (-1)
        Lb3:
            if (r4 != r0) goto Lb6
            return
        Lb6:
            int r5 = r8.getSyntaxTag(r4)     // Catch: java.lang.Throwable -> Ld0
            r6 = 123(0x7b, float:1.72E-43)
            if (r5 == r6) goto Lcf
            r6 = 124(0x7c, float:1.74E-43)
            if (r5 == r6) goto Lcf
            r6 = 127(0x7f, float:1.78E-43)
            if (r5 == r6) goto Lcf
            r6 = 194(0xc2, float:2.72E-43)
            if (r5 == r6) goto Lcf
            int r4 = r8.getParentNode(r4)     // Catch: java.lang.Throwable -> Ld0
            goto L55
        Lcf:
            return
        Ld0:
            r0 = move-exception
            boolean r1 = com.aide.codemodel.language.java.JavaCompiler.yO
            if (r1 == 0) goto Le5
            r2 = -838921634439292744(0xf45b8d37e0db18b8, double:-3.1561943826155727E252)
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r9)
            r1 = r0
            r4 = r7
            r5 = r8
            abcd.iy.Mr(r1, r2, r4, r5, r6)
        Le5:
            goto Le7
        Le6:
            throw r0
        Le7:
            goto Le6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.java.JavaCompiler.zh(com.aide.codemodel.api.SyntaxTree, int):void");
    }

    @ey(method = 1133816838227399068L)
    public String GT(ClassType classType) {
        try {
            if (kQ) {
                iy.tp(401273786003100309L, this, classType);
            }
            char[] cArr = new char[10];
            int iGK = 0;
            while (true) {
                try {
                    iGK = GK(classType, cArr, 0, false);
                    if (iGK != -1) {
                        break;
                    }
                    cArr = new char[(cArr.length * 2) + 1];
                } catch (e4 unused) {
                }
            }
            for (int i = 0; i < iGK; i++) {
                if (cArr[i] == '/') {
                    cArr[i] = '.';
                }
            }
            return new String(cArr, 0, iGK);
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, 401273786003100309L, this, classType);
            }
            throw th;
        }
    }

    @ey(method = 3030769967553570915L)
    public String Od(Entity entity) {
        try {
            if (kQ) {
                iy.tp(743586472706808328L, this, entity);
            }
            if (entity.isMember() && ((Member) entity).iW()) {
                return "<init>";
            }
            if (!HO(entity)) {
                return entity.getNameString();
            }
            return "$$" + entity.DW();
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, 743586472706808328L, this, entity);
            }
            throw th;
        }
    }

    @ey(method = -1556291879106621461L)
    public String PH(Entity entity) {
        try {
            if (!kQ) {
                return "adrt$enabled";
            }
            iy.tp(570609583745445272L, this, entity);
            return "adrt$enabled";
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, 570609583745445272L, this, entity);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Compiler
    @ey(method = 876356601553755280L)
    public void compile(List<SyntaxTree> list, boolean z) {
        try {
            if (kQ) {
                iy.EQ(4776796233409392609L, this, list, new Boolean(z));
            }
            for (SyntaxTree syntaxTree : list) {
                if (syntaxTree.getLanguage() == this.javaLanguage) {
                    gn(syntaxTree, z);
                    return;
                }
            }
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, 4776796233409392609L, this, list, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -4767736230638035095L)
    public String hp(Entity entity) {
        try {
            if (kQ) {
                iy.tp(661352012518603256L, this, entity);
            }
            return entity.isClassType() ? GT((ClassType) entity) : GT(((Member) entity).getEnclosingClassType());
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, 661352012518603256L, this, entity);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Compiler
    @ey(method = 166660073369198048L)
    public void init(CodeModel codeModel) {
        try {
            if (kQ) {
                iy.tp(3051708219280499025L, this, codeModel);
            }
            if ((this.model instanceof AIDEModel) && (codeModel instanceof JavaCodeModel)) {
                f0 f0Var = ((AIDEModel) this.model).P8;
                MapOfIntInt mapOfIntInt = new MapOfIntInt();
                ListOfInt listOfInt = new ListOfInt();
                SetOfFileEntry setOfFileEntryKD = this.FH.KD();
                setOfFileEntryKD.j6.init();
                while (setOfFileEntryKD.j6.hasMoreElements()) {
                    FileEntry fileEntryNextKey = setOfFileEntryKD.j6.nextKey();
                    if (fileEntryNextKey.getCodeModel() == codeModel) {
                        listOfInt.add(fileEntryNextKey.getId());
                        mapOfIntInt.tp(fileEntryNextKey.gn(), fileEntryNextKey.getId());
                    }
                }
                listOfInt.sort();
                mapOfIntInt.j6.DW();
                while (mapOfIntInt.j6.j6()) {
                    try {
                        OutputStream outputStreamNw = this.model.j3.nw(this.FH.getFileEntry(mapOfIntInt.j6.v5()), "adrt/", "ADRTMetadata", false, true);
                        if (outputStreamNw != null) {
                            this.VH.j6("ADRTMetadata.java", 1, "adrt/ADRTMetadata".toCharArray(), 0, 17, "adrt.ADRTMetadata", 49, 0);
                            this.VH.Z3("java/lang/Object");
                            this.VH.U2(9, "FILE_IDS", "[I", true, false);
                            this.VH.U2(9, "FILE_NAMES", "[Ljava/lang/String;", true, false);
                            this.VH.U2(9, "FILE_CALLED_FILES", "[[I", true, false);
                            this.VH.U2(9, "FILE_CALLING_FILES", "[[I", true, false);
                            this.VH.Mz(24, "<clinit>", "()V".toCharArray(), 0, 3, false, false, true);
                            this.VH.qP(listOfInt.size());
                            this.VH.fd("[I", 1);
                            for (int i = 0; i < listOfInt.size(); i++) {
                                this.VH.w9();
                                this.VH.qP(i);
                                this.VH.qP(listOfInt.get(i));
                                this.VH.oa();
                            }
                            this.VH.N2("adrt/ADRTMetadata", "FILE_IDS", "[I");
                            this.VH.qP(listOfInt.size());
                            this.VH.fd("[Ljava/lang/String;", 1);
                            for (int i2 = 0; i2 < listOfInt.size(); i2++) {
                                FileEntry fileEntry = this.FH.getFileEntry(listOfInt.get(i2));
                                this.VH.w9();
                                this.VH.qP(i2);
                                this.VH.BJ(DY(fileEntry));
                                this.VH.OW();
                            }
                            this.VH.N2("adrt/ADRTMetadata", "FILE_NAMES", "[Ljava/lang/String;");
                            this.VH.qP(listOfInt.size());
                            this.VH.fd("[[I", 1);
                            ListOfInt listOfInt2 = new ListOfInt();
                            for (int i3 = 0; i3 < listOfInt.size(); i3++) {
                                FileEntry fileEntry2 = this.FH.getFileEntry(listOfInt.get(i3));
                                listOfInt2.clear();
                                f0Var.QX(fileEntry2, listOfInt2);
                                listOfInt2.sort();
                                if (listOfInt2.size() > 0) {
                                    this.VH.w9();
                                    this.VH.qP(i3);
                                    this.VH.qP(listOfInt2.size());
                                    this.VH.fd("[I", 1);
                                    for (int i4 = 0; i4 < listOfInt2.size(); i4++) {
                                        this.VH.w9();
                                        this.VH.qP(i4);
                                        this.VH.qP(listOfInt2.get(i4));
                                        this.VH.oa();
                                    }
                                    this.VH.OW();
                                }
                            }
                            this.VH.N2("adrt/ADRTMetadata", "FILE_CALLED_FILES", "[[I");
                            this.VH.qP(listOfInt.size());
                            this.VH.fd("[[I", 1);
                            for (int i5 = 0; i5 < listOfInt.size(); i5++) {
                                FileEntry fileEntry3 = this.FH.getFileEntry(listOfInt.get(i5));
                                listOfInt2.clear();
                                f0Var.XL(fileEntry3, listOfInt2);
                                listOfInt2.sort();
                                if (listOfInt2.size() > 0) {
                                    this.VH.w9();
                                    this.VH.qP(i5);
                                    this.VH.qP(listOfInt2.size());
                                    this.VH.fd("[I", 1);
                                    for (int i6 = 0; i6 < listOfInt2.size(); i6++) {
                                        this.VH.w9();
                                        this.VH.qP(i6);
                                        this.VH.qP(listOfInt2.get(i6));
                                        this.VH.oa();
                                    }
                                    this.VH.OW();
                                }
                            }
                            this.VH.N2("adrt/ADRTMetadata", "FILE_CALLING_FILES", "[[I");
                            this.VH.IM();
                            this.VH.oP(outputStreamNw);
                            outputStreamNw.close();
                        }
                    } catch (IOException unused) {
                    }
                }
            }
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, 3051708219280499025L, this, codeModel);
            }
            throw th;
        }
    }

    @ey(method = -1263229722952595307L)
    public void k4() {
        try {
            if (kQ) {
                iy.gn(2440416886484274464L, this);
            }
            this.VH = new j6();
        } catch (Throwable th) {
            if (yO) {
                iy.aM(th, 2440416886484274464L, this);
            }
            throw th;
        }
    }

    @ey(method = -3409754990691393291L)
    public String pl(Entity entity) {
        try {
            if (kQ) {
                iy.tp(3369190187734034560L, this, entity);
            }
            char[] cArr = new char[10];
            int iGK = 0;
            while (true) {
                try {
                    iGK = GK(entity, cArr, 0, false);
                    if (iGK != -1) {
                        break;
                    }
                    cArr = new char[(cArr.length * 2) + 1];
                } catch (e4 unused) {
                }
            }
            return new String(cArr, 0, iGK);
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, 3369190187734034560L, this, entity);
            }
            throw th;
        }
    }
}
