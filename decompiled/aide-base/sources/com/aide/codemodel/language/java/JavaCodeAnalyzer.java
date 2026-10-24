package com.aide.codemodel.language.java;

import abcd.b4;
import abcd.c4;
import abcd.cy;
import abcd.dy;
import abcd.e4;
import abcd.ey;
import abcd.f3;
import abcd.fy;
import abcd.g3;
import abcd.gy;
import abcd.hy;
import abcd.iy;
import abcd.o6;
import abcd.y1;
import abcd.y3;
import abcd.y6;
import com.aide.codemodel.api.ArrayType;
import com.aide.codemodel.api.ClassType;
import com.aide.codemodel.api.Entity;
import com.aide.codemodel.api.EntitySpace;
import com.aide.codemodel.api.ErrorTable;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.FileSpace;
import com.aide.codemodel.api.IdentifierSpace;
import com.aide.codemodel.api.Member;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.Namespace;
import com.aide.codemodel.api.ParameterType;
import com.aide.codemodel.api.ParameterizedType;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.SyntaxTreeSpace;
import com.aide.codemodel.api.Type;
import com.aide.codemodel.api.abstraction.CodeAnalyzer;
import com.aide.codemodel.api.collections.FunctionOfIntInt;
import com.aide.codemodel.api.collections.ListOf;
import com.aide.codemodel.api.collections.ListOfInt;
import com.aide.codemodel.api.collections.MapOf;
import com.aide.codemodel.api.collections.MapOfInt;
import com.aide.codemodel.api.collections.MapOfIntLong;
import com.aide.codemodel.api.collections.SetOf;
import com.aide.codemodel.api.collections.SetOfInt;
import com.aide.uidesigner.ProxyTextView;
import com.probelytics.api.UserTouchAction;
import java.util.Stack;

@cy(clazz = -4027166562323497863L, container = -4027166562323497863L, user = true)
/* loaded from: classes.dex */
public class JavaCodeAnalyzer implements CodeAnalyzer {

    @fy
    private static /* synthetic */ boolean J8;

    @gy
    private static /* synthetic */ boolean Ws;

    @dy(field = 5655848007569484375L)
    private final boolean DW;

    @dy(field = 5402078856186600288L)
    private final boolean FH;

    @dy(field = -1542431479365200067L)
    private SetOfInt Hw;

    @dy(field = 4654857755461072617L)
    private final y6 J0;

    @dy(field = -2622799722952554915L)
    private final EntitySpace entitySpace;

    @dy(field = -958081271134746785L)
    private final ErrorTable errorTable;

    @dy(field = 2039808308676083745L)
    private final FileSpace fileSpace;

    @dy(field = 2888635584947594375L)
    private final IdentifierSpace identifierSpace;

    @dy(field = 3746343305452389139L)
    private Stack<a> j6;

    @dy(field = -2868127628714014304L)
    private final Model model;

    @dy(field = -2584060302972689816L)
    private final SyntaxTreeSpace syntaxTreeSpace;

    @dy(field = 2990478844173709680L)
    private final JavaTypeSystem u7;

    @dy(field = 1006780615456054181L)
    private final o6 we;

    @cy(clazz = 2285414926350484395L, container = 2285414926350484395L, user = true)
    private static class a {

        @gy
        private static /* synthetic */ boolean gW;

        @fy
        private static /* synthetic */ boolean yS;

        @dy(field = -1145505720291524480L)
        private JavaCodeAnalyzer DW;

        @dy(field = -1228333286314638603L)
        private SetOf<Member> EQ;

        @dy(field = 2678494157708047380L)
        private EntitySpace FH;

        @dy(field = -3331406921084818443L)
        private JavaTypeSystem Hw;

        @dy(field = 5527532429029550155L)
        private SetOf<Member> J0;

        @dy(field = 5681124982833877360L)
        private SetOf<Member> J8;

        @dy(field = -2132027981397858827L)
        private boolean Mr;

        @dy(field = 4727915932681254555L)
        private int[] QX;

        @dy(field = -1228978905215313579L)
        private boolean U2;

        @dy(field = -983202110916363255L)
        private FunctionOfIntInt VH;

        @dy(field = -950168680457268064L)
        private Type[] Ws;

        @dy(field = 4533865965350039171L)
        private int XL;

        @dy(field = -2939037995467894005L)
        private int Zo;

        @dy(field = 2964995121547413045L)
        private boolean a8;

        @dy(field = 3335597745218983040L)
        private y3 aM;

        @dy(field = -53621889650278540L)
        private boolean er;

        @dy(field = -405123056935975925L)
        private C0041a gn;

        @dy(field = 2489175050938277976L)
        private SetOfInt j3;

        @dy(field = 1567760017133472960L)
        private ErrorTable j6;

        @dy(field = -1010076460167805803L)
        private int lg;

        @dy(field = 2641174915982566671L)
        private Type[] rN;

        @dy(field = -209564196232456260L)
        private SetOf<Member> tp;

        @dy(field = -1796872792442643552L)
        private Stack<SetOf<Member>> u7;

        @dy(field = 1352156860139451300L)
        private SyntaxTree v5;

        @dy(field = -1457417110781315025L)
        private SetOf<Member> we;

        @cy(clazz = -1564176742309341560L, container = -1564176742309341560L, user = true)
        /* renamed from: com.aide.codemodel.language.java.JavaCodeAnalyzer$a$a, reason: collision with other inner class name */
        private class C0041a {

            @fy
            private static /* synthetic */ boolean BT;

            @gy
            private static /* synthetic */ boolean vy;

            @dy(field = -719746151452721397L)
            private ClassType DW;

            @dy(field = 2614913195571865880L)
            private ListOf<ClassType> EQ;

            @dy(field = -5227445181033235655L)
            private ClassType FH;

            @dy(field = -4553185899389044056L)
            private int Hw;

            @dy(field = 1113830021579489700L)
            private ListOf<ClassType> J0;

            @dy(field = 367431420342724864L)
            private MapOfInt<ClassType> J8;

            @dy(field = -306829971303727188L)
            private ListOfInt Mr;

            @dy(field = 2291049916927379237L)
            private ListOfInt QX;

            @dy(field = 4434417802928956715L)
            private ListOfInt U2;

            @dy(field = 3836419521362260560L)
            private g3 VH;

            @dy(field = -3378059944173191785L)
            private ListOfInt Ws;

            @dy(field = -5198268191601520944L)
            private ListOf<ClassType> XL;

            @dy(field = -1227321047572467008L)
            private f3<Type> Zo;

            @dy(field = -1681526680245131775L)
            private int a8;

            @dy(field = -7646679264175030000L)
            private ListOf<ClassType> aM;

            @dy(field = -1596118992079922527L)
            private int er;

            @dy(field = -2128006785148765707L)
            @hy
            final /* synthetic */ a gW;

            @dy(field = -2544776624222264185L)
            private MapOfIntLong gn;

            @dy(field = 1294797450041383176L)
            private ListOf<Type> j3;

            @dy(field = 807282656759467756L)
            private Namespace j6;

            @dy(field = 2147863063762852055L)
            private ListOfInt lg;

            @dy(field = 324712879533432075L)
            private int rN;

            @dy(field = 2513424471376475280L)
            private ListOf<Namespace> tp;

            @dy(field = 5227042777505249837L)
            private MapOfInt<ClassType> u7;

            @dy(field = -165304581045937164L)
            private g3 v5;

            @dy(field = -2960440019161067056L)
            private MapOfInt<Entity> we;

            @dy(field = 1239807157731635705L)
            private ListOfInt yS;

            static {
                iy.Zo(C0041a.class);
            }

            @ey(method = 1099401946930767555L)
            public C0041a(a aVar, EntitySpace entitySpace) {
                try {
                    if (BT) {
                        iy.EQ(2194239165051114501L, null, aVar, entitySpace);
                    }
                    this.gW = aVar;
                    this.v5 = new g3();
                    this.VH = new g3();
                    this.gn = new MapOfIntLong();
                    this.Ws = new ListOfInt();
                    this.QX = new ListOfInt();
                    this.Mr = new ListOfInt();
                    this.U2 = new ListOfInt();
                    this.lg = new ListOfInt();
                    this.yS = new ListOfInt();
                    this.Zo = new f3<>(entitySpace);
                    this.Zo = new f3<>(entitySpace);
                    this.u7 = new MapOfInt<>(entitySpace);
                    this.tp = new ListOf<>(entitySpace);
                    this.EQ = new ListOf<>(entitySpace);
                    this.we = new MapOfInt<>(entitySpace);
                    this.J0 = new ListOf<>(entitySpace);
                    this.J8 = new MapOfInt<>(entitySpace);
                    this.XL = new ListOf<>(entitySpace);
                    this.aM = new ListOf<>(entitySpace);
                    this.j3 = new ListOf<>(entitySpace);
                    this.Mr = new ListOfInt();
                } catch (Throwable th) {
                    if (vy) {
                        iy.Mr(th, 2194239165051114501L, null, aVar, entitySpace);
                    }
                    throw th;
                }
            }

            @ey(method = -193335974598384317L)
            private int DW() {
                try {
                    if (BT) {
                        iy.gn(1293951080676380544L, this);
                    }
                    if (this.rN + 1 > this.er) {
                        this.er = this.rN + 1;
                    }
                    int i = this.rN;
                    this.rN = i + 1;
                    return i;
                } catch (Throwable th) {
                    if (vy) {
                        iy.aM(th, 1293951080676380544L, this);
                    }
                    throw th;
                }
            }

            @ey(method = -189280772429744352L)
            private boolean x9(int i, boolean z) {
                try {
                    if (BT) {
                        iy.EQ(6568938578423739375L, this, new Integer(i), new Boolean(z));
                    }
                    int identifier = this.gW.v5.getIdentifier(i);
                    for (int iEQ = this.j3.EQ() - 1; iEQ >= 0; iEQ--) {
                        if (((Type) this.j3.v5(iEQ)) == null) {
                            int i2 = this.Mr.get(iEQ);
                            if (this.VH.DW(identifier, i2)) {
                                int iZo = this.VH.Zo(identifier, i2);
                                if (!this.gW.v5.hasAttrType(iZo)) {
                                    if (this.gW.Mr) {
                                        this.gW.sy(i, "Unknown type of variable </C>" + this.gW.v5.getIdentifierString(i) + "<//C>");
                                    }
                                    return false;
                                }
                                Type attrType = this.gW.v5.getAttrType(iZo);
                                if (i2 == this.Hw) {
                                    this.gW.v5.declareAttrReferenceKind(i, 2, iZo);
                                    if (this.gW.Mr) {
                                        this.gW.v5.declareAttrVariableSlot(i, this.gW.v5.getAttrVariableSlot(iZo));
                                    }
                                    this.gW.v5.declareAttrDAIndex(i, this.gW.v5.getAttribute(iZo));
                                } else {
                                    this.gW.v5.declareAttrReferenceKind(i, 3, iZo);
                                    this.gW.v5.declareAttrDAIndex(i, this.gW.v5.getAttribute(iZo));
                                    if (this.gW.Mr && !((JavaSyntax) this.gW.v5.getLanguage().getSyntax()).jO(this.gW.v5, iZo)) {
                                        this.gW.Qq(i, "This variable must be final to be used in a local class");
                                        this.gW.ef(iZo);
                                    }
                                }
                                this.gW.v5.declareAttrType(i, attrType);
                                return true;
                            }
                        } else {
                            this.gW.EQ.clear();
                            if (((ClassType) this.aM.v5(iEQ)).sG(this.gW.v5.getFile(), this.gW.v5.getLanguage(), identifier, true, U2(), this.gW.EQ) != null) {
                                if (this.gW.EQ.J0() != 1) {
                                    this.gW.sy(i, "Ambiguous field </C>" + this.gW.v5.getIdentifierString(i) + "<//C>");
                                    return false;
                                }
                                Member member = (Member) this.gW.EQ.Zo();
                                this.gW.v5.declareAttrReferenceKind(i, 16, member);
                                this.gW.v5.declareAttrInvocationType(i, (Type) this.j3.v5(iEQ));
                                if (member.getEnclosingClassType() == this.DW && (((!member.gG() && cn()) || (member.gG() && cb())) && member.kf())) {
                                    this.gW.v5.declareAttrDAIndex(i, this.gW.v5.getAttribute(this.gW.VH.get(member.getId())));
                                }
                                try {
                                    Type typeFY = member.fY((Type) this.j3.v5(iEQ), z);
                                    this.gW.qp(i, typeFY);
                                    this.gW.v5.declareAttrType(i, typeFY);
                                } catch (e4 unused) {
                                    String identifierString = this.gW.v5.getIdentifierString(i);
                                    this.gW.sy(i, "Unknown type of field </C>" + identifierString + "<//C>");
                                }
                                if (this.gW.Mr && !member.gG() && !gW((Type) this.aM.v5(iEQ))) {
                                    this.gW.Qq(i, "This field can not be referenced from a static-context");
                                }
                                return true;
                            }
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    if (vy) {
                        iy.Mr(th, 6568938578423739375L, this, new Integer(i), new Boolean(z));
                    }
                    throw th;
                }
            }

            @ey(method = -5406980057525763199L)
            public boolean BT(Type type) {
                try {
                    if (BT) {
                        iy.tp(1344543540190645704L, this, type);
                    }
                    try {
                        type = type.x9();
                    } catch (e4 unused) {
                    }
                    if (this.U2.size() > 0 && y1.aM(this.U2.peek())) {
                        return false;
                    }
                    if (type == U2()) {
                        return true;
                    }
                    return this.gW.Hw.jw(this.gW.v5.getFile(), (ClassType) type, U2());
                } catch (Throwable th) {
                    if (vy) {
                        iy.j3(th, 1344543540190645704L, this, type);
                    }
                    throw th;
                }
            }

            @ey(method = 4067147165432560715L)
            public void EQ(int i, long j) {
                try {
                    if (BT) {
                        iy.EQ(1300134197703268720L, this, new Integer(i), new Long(j));
                    }
                    this.gn.VH(i, j);
                } catch (Throwable th) {
                    if (vy) {
                        iy.Mr(th, 1300134197703268720L, this, new Integer(i), new Long(j));
                    }
                    throw th;
                }
            }

            @ey(method = 56292009655359093L)
            public int FH(int i) {
                try {
                    if (BT) {
                        iy.u7(-245851712276136432L, this, i);
                    }
                    int iDW = DW();
                    for (int i2 = 1; i2 < i; i2++) {
                        DW();
                    }
                    return iDW;
                } catch (Throwable th) {
                    if (vy) {
                        iy.j3(th, -245851712276136432L, this, new Integer(i));
                    }
                    throw th;
                }
            }

            @ey(method = 294323991414729848L)
            public void Hw(int i) {
                try {
                    if (BT) {
                        iy.u7(-4091993421344613979L, this, i);
                    }
                    this.gW.v5.declareAttrVariableSlot(i, DW());
                } catch (Throwable th) {
                    if (vy) {
                        iy.j3(th, -4091993421344613979L, this, new Integer(i));
                    }
                    throw th;
                }
            }

            @ey(method = -1932712220039340925L)
            public void I() {
                try {
                    if (BT) {
                        iy.gn(-1900333708798112560L, this);
                    }
                    this.Mr.pop();
                    this.aM.VH();
                    this.j3.VH();
                    this.Hw--;
                    sG();
                } catch (Throwable th) {
                    if (vy) {
                        iy.aM(th, -1900333708798112560L, this);
                    }
                    throw th;
                }
            }

            @ey(method = 968274997639853341L)
            public void J0(ClassType classType) {
                try {
                    if (BT) {
                        iy.tp(-3184568546544709200L, this, classType);
                    }
                    this.yS.push(this.rN);
                    this.rN = 0;
                    this.lg.push(this.a8);
                    this.FH = null;
                    this.DW = classType;
                    this.aM.gn(classType);
                    this.j3.gn(classType.u9());
                    this.Mr.push(-1);
                    this.VH.v5();
                } catch (Throwable th) {
                    if (vy) {
                        iy.j3(th, -3184568546544709200L, this, classType);
                    }
                    throw th;
                }
            }

            @ey(method = 896831793114470304L)
            public void J8(ClassType classType) {
                try {
                    if (BT) {
                        iy.tp(-326835608147338521L, this, classType);
                    }
                    this.FH = classType;
                    this.U2.push(0);
                } catch (Throwable th) {
                    if (vy) {
                        iy.j3(th, -326835608147338521L, this, classType);
                    }
                    throw th;
                }
            }

            @ey(method = 1364450095296831147L)
            public void KD(int i, Entity entity) {
                try {
                    if (BT) {
                        iy.EQ(-75784909134123588L, this, new Integer(i), entity);
                    }
                    if (this.J8.v5(i)) {
                        throw new c4();
                    }
                    if (!this.we.v5(i)) {
                        this.we.we(i, entity);
                    } else if (this.we.gn(i) != entity) {
                        throw new c4();
                    }
                } catch (Throwable th) {
                    if (vy) {
                        iy.Mr(th, -75784909134123588L, this, new Integer(i), entity);
                    }
                    throw th;
                }
            }

            @ey(method = 7454939715273971844L)
            public void Mr() {
                try {
                    if (BT) {
                        iy.gn(7104034993663530261L, this);
                    }
                    we();
                    this.aM.gn(null);
                    this.j3.gn(null);
                    ListOfInt listOfInt = this.Mr;
                    int i = this.Hw + 1;
                    this.Hw = i;
                    listOfInt.push(i);
                } catch (Throwable th) {
                    if (vy) {
                        iy.aM(th, 7104034993663530261L, this);
                    }
                    throw th;
                }
            }

            @ey(method = -7366223221841457745L)
            public void Mz() {
                try {
                    if (BT) {
                        iy.gn(-5851626393191799360L, this);
                    }
                    this.v5.VH();
                } catch (Throwable th) {
                    if (vy) {
                        iy.aM(th, -5851626393191799360L, this);
                    }
                    throw th;
                }
            }

            @ey(method = 840171525086462805L)
            public void P8(int i, ClassType classType) {
                try {
                    if (BT) {
                        iy.EQ(6620815904247732468L, this, new Integer(i), classType);
                    }
                    if (this.we.v5(i)) {
                        throw new c4();
                    }
                    if (!this.J8.v5(i)) {
                        this.J8.we(i, classType);
                    } else if (this.J8.gn(i) != classType) {
                        throw new c4();
                    }
                } catch (Throwable th) {
                    if (vy) {
                        iy.Mr(th, 6620815904247732468L, this, new Integer(i), classType);
                    }
                    throw th;
                }
            }

            @ey(method = -582281517794604264L)
            public void QX() {
                try {
                    if (BT) {
                        iy.gn(1493781351072565121L, this);
                    }
                    this.XL.gn(U2());
                } catch (Throwable th) {
                    if (vy) {
                        iy.aM(th, 1493781351072565121L, this);
                    }
                    throw th;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:102:0x0340  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
            /* JADX WARN: Type inference failed for: r0v4, types: [com.aide.codemodel.api.SyntaxTree] */
            /* JADX WARN: Type inference failed for: r15v0, types: [int] */
            /* JADX WARN: Type inference failed for: r15v1 */
            /* JADX WARN: Type inference failed for: r15v13 */
            /* JADX WARN: Type inference failed for: r15v2 */
            /* JADX WARN: Type inference failed for: r1v29, types: [com.aide.codemodel.api.ClassType] */
            /* JADX WARN: Type inference failed for: r1v58, types: [com.aide.codemodel.api.ClassType] */
            /* JADX WARN: Type inference failed for: r3v0 */
            /* JADX WARN: Type inference failed for: r3v1, types: [int] */
            /* JADX WARN: Type inference failed for: r3v10 */
            /* JADX WARN: Type inference failed for: r3v11 */
            /* JADX WARN: Type inference failed for: r3v13 */
            /* JADX WARN: Type inference failed for: r3v14 */
            /* JADX WARN: Type inference failed for: r3v15 */
            /* JADX WARN: Type inference failed for: r3v7, types: [com.aide.codemodel.api.abstraction.Language] */
            /* JADX WARN: Type inference failed for: r3v8 */
            /* JADX WARN: Type inference failed for: r7v16, types: [com.aide.codemodel.api.collections.SetOf] */
            /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.Object] */
            @abcd.ey(method = 194914889951009517L)
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void Qq(int r20, int r21, int r22, com.aide.codemodel.api.Type r23) throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 870
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.java.JavaCodeAnalyzer.a.C0041a.Qq(int, int, int, com.aide.codemodel.api.Type):void");
            }

            @ey(method = -312551946550397840L)
            public void SI(ClassType classType) {
                try {
                    if (BT) {
                        iy.tp(-757371947091406479L, this, classType);
                    }
                    this.J0.j6(classType);
                } catch (Throwable th) {
                    if (vy) {
                        iy.j3(th, -757371947091406479L, this, classType);
                    }
                    throw th;
                }
            }

            @ey(method = 3161377286788518360L)
            public void Sf() {
                try {
                    if (BT) {
                        iy.gn(4278983880142632291L, this);
                    }
                    this.U2.pop();
                } catch (Throwable th) {
                    if (vy) {
                        iy.aM(th, 4278983880142632291L, this);
                    }
                    throw th;
                }
            }

            @ey(method = -4369353971476796448L)
            public ClassType U2() {
                try {
                    if (BT) {
                        iy.gn(-2964065403549208585L, this);
                    }
                    return this.DW;
                } catch (Throwable th) {
                    if (vy) {
                        iy.aM(th, -2964065403549208585L, this);
                    }
                    throw th;
                }
            }

            @ey(method = -2665427530647872375L)
            public void VH(int i, ClassType classType) {
                try {
                    if (BT) {
                        iy.EQ(3436881064916589900L, this, new Integer(i), classType);
                    }
                    if (this.Zo.DW(i, this.Hw)) {
                        throw new c4();
                    }
                    this.Zo.FH(i, classType.u9(), this.Hw);
                } catch (Throwable th) {
                    if (vy) {
                        iy.Mr(th, 3436881064916589900L, this, new Integer(i), classType);
                    }
                    throw th;
                }
            }

            @ey(method = -2404545983526443712L)
            public void Ws(int i, boolean z, boolean z2) {
                try {
                    if (BT) {
                        iy.we(71762211542602057L, this, new Integer(i), new Boolean(z), new Boolean(z2));
                    }
                    we();
                    int i2 = 1;
                    if (!y1.aM(i)) {
                        FH(1);
                    }
                    this.aM.gn(null);
                    this.j3.gn(null);
                    ListOfInt listOfInt = this.Mr;
                    int i3 = this.Hw + 1;
                    this.Hw = i3;
                    listOfInt.push(i3);
                    this.U2.push(i);
                    this.Ws.push(z ? 1 : 0);
                    ListOfInt listOfInt2 = this.QX;
                    if (!z2) {
                        i2 = 0;
                    }
                    listOfInt2.push(i2);
                } catch (Throwable th) {
                    if (vy) {
                        iy.U2(th, 71762211542602057L, this, new Integer(i), new Boolean(z), new Boolean(z2));
                    }
                    throw th;
                }
            }

            @ey(method = -1023804694410754536L)
            public void XL() {
                try {
                    if (BT) {
                        iy.gn(-147105907138888237L, this);
                    }
                    this.a8 = 0;
                    this.lg.clear();
                    this.gW.VH.clear();
                    this.rN = 0;
                    this.er = 0;
                    this.yS.clear();
                    this.Hw = 0;
                    this.DW = null;
                    this.j6 = null;
                    this.u7.Hw();
                    this.J8.Hw();
                    this.tp.FH();
                    this.EQ.FH();
                    this.we.Hw();
                    this.J0.FH();
                    this.Mr.clear();
                    this.aM.FH();
                    this.XL.FH();
                    this.j3.FH();
                    this.U2.clear();
                    this.v5.j6();
                    this.Zo.j6();
                    this.VH.j6();
                    this.gn.FH();
                } catch (Throwable th) {
                    if (vy) {
                        iy.aM(th, -147105907138888237L, this);
                    }
                    throw th;
                }
            }

            @ey(method = -474240209859649744L)
            public void Zo(int i, int i2) {
                try {
                    if (BT) {
                        iy.EQ(793828153646356629L, this, new Integer(i), new Integer(i2));
                    }
                    if (this.v5.DW(i, this.Hw)) {
                        throw new c4();
                    }
                    this.v5.FH(i, i2, this.Hw);
                } catch (Throwable th) {
                    if (vy) {
                        iy.Mr(th, 793828153646356629L, this, new Integer(i), new Integer(i2));
                    }
                    throw th;
                }
            }

            @ey(method = 3845170065372273493L)
            public Entity a8() {
                try {
                    if (BT) {
                        iy.gn(-596588114373217560L, this);
                    }
                    return this.DW != null ? this.DW : this.j6;
                } catch (Throwable th) {
                    if (vy) {
                        iy.aM(th, -596588114373217560L, this);
                    }
                    throw th;
                }
            }

            @ey(method = -3584403946221388480L)
            public void aM() {
                try {
                    if (BT) {
                        iy.gn(5729838415620791255L, this);
                    }
                    this.rN = this.er;
                } catch (Throwable th) {
                    if (vy) {
                        iy.aM(th, 5729838415620791255L, this);
                    }
                    throw th;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:61:0x021f  */
            @abcd.ey(method = -4197855112226763552L)
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void aj(int r21, com.aide.codemodel.api.Type r22, boolean r23) {
                /*
                    Method dump skipped, instructions count: 569
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.java.JavaCodeAnalyzer.a.C0041a.aj(int, com.aide.codemodel.api.Type, boolean):void");
            }

            @ey(method = 4700378653302844256L)
            public void ca(int i, int i2, Type type) {
                try {
                    if (BT) {
                        iy.we(-4201837199629271721L, this, new Integer(i), new Integer(i2), type);
                    }
                    if (x9(i, true)) {
                        return;
                    }
                    try {
                        Entity entitySy = sy(i, i2, true, type);
                        if (entitySy.isNamespace()) {
                            return;
                        }
                        this.gW.v5.declareAttrType(i, (Type) entitySy);
                    } catch (e4 unused) {
                    }
                } catch (Throwable th) {
                    if (vy) {
                        iy.U2(th, -4201837199629271721L, this, new Integer(i), new Integer(i2), type);
                    }
                    throw th;
                }
            }

            @ey(method = -946771277631024773L)
            public boolean cb() {
                try {
                    if (BT) {
                        iy.gn(-954523955233347504L, this);
                    }
                    if (this.Ws.peek() > 0 && this.U2.size() > 0) {
                        if (y1.aM(this.U2.peek())) {
                            return true;
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    if (vy) {
                        iy.aM(th, -954523955233347504L, this);
                    }
                    throw th;
                }
            }

            @ey(method = 2301536040880991696L)
            public boolean cn() {
                try {
                    if (BT) {
                        iy.gn(-106455292202497483L, this);
                    }
                    if (this.Ws.peek() <= 0) {
                        if (this.QX.peek() <= 0) {
                            return false;
                        }
                    }
                    return true;
                } catch (Throwable th) {
                    if (vy) {
                        iy.aM(th, -106455292202497483L, this);
                    }
                    throw th;
                }
            }

            @ey(method = 3669944043592910117L)
            public boolean dx(int i) {
                try {
                    if (BT) {
                        iy.u7(-2049874613626193772L, this, i);
                    }
                    return this.gn.Hw(i);
                } catch (Throwable th) {
                    if (vy) {
                        iy.j3(th, -2049874613626193772L, this, new Integer(i));
                    }
                    throw th;
                }
            }

            @ey(method = 4758378336505624455L)
            public void ef() {
                try {
                    if (BT) {
                        iy.gn(-3435575477962445100L, this);
                    }
                    this.rN = this.yS.pop();
                    this.a8 = this.lg.pop();
                    this.Mr.pop();
                    this.aM.VH();
                    this.j3.VH();
                    int iEQ = this.aM.EQ() - 1;
                    while (iEQ >= 0 && this.aM.v5(iEQ) == null) {
                        iEQ--;
                    }
                    if (iEQ >= 0) {
                        this.DW = (ClassType) this.aM.v5(iEQ);
                    } else {
                        this.DW = null;
                    }
                    this.VH.VH();
                } catch (Throwable th) {
                    if (vy) {
                        iy.aM(th, -3435575477962445100L, this);
                    }
                    throw th;
                }
            }

            @ey(method = -1548690733650019200L)
            public void ei(ClassType classType) {
                try {
                    if (BT) {
                        iy.tp(1136544049538203435L, this, classType);
                    }
                    this.EQ.j6(classType);
                } catch (Throwable th) {
                    if (vy) {
                        iy.j3(th, 1136544049538203435L, this, classType);
                    }
                    throw th;
                }
            }

            @ey(method = -1246137240868202595L)
            public int er(int i) {
                try {
                    if (BT) {
                        iy.u7(898858431831778132L, this, i);
                    }
                    if (this.v5.DW(i, this.Hw)) {
                        return this.v5.Zo(i, this.Hw);
                    }
                    throw new e4();
                } catch (Throwable th) {
                    if (vy) {
                        iy.j3(th, 898858431831778132L, this, new Integer(i));
                    }
                    throw th;
                }
            }

            @ey(method = -2210849094408043705L)
            public void g3() {
                try {
                    if (BT) {
                        iy.gn(79717700038959220L, this);
                    }
                    this.XL.VH();
                } catch (Throwable th) {
                    if (vy) {
                        iy.aM(th, 79717700038959220L, this);
                    }
                    throw th;
                }
            }

            @ey(method = 473702140626951005L)
            public boolean gW(Type type) {
                try {
                    if (BT) {
                        iy.tp(-120472079676718680L, this, type);
                    }
                    try {
                        type = type.x9();
                    } catch (e4 unused) {
                    }
                    if (this.U2.size() <= 0 || !y1.aM(this.U2.peek())) {
                        return type == U2() ? this.XL.Zo() != type : this.gW.Hw.jw(this.gW.v5.getFile(), (ClassType) type, U2());
                    }
                    return false;
                } catch (Throwable th) {
                    if (vy) {
                        iy.j3(th, -120472079676718680L, this, type);
                    }
                    throw th;
                }
            }

            @ey(method = -4487615101001115480L)
            public void gn(Namespace namespace) {
                try {
                    if (BT) {
                        iy.tp(1262167958266027935L, this, namespace);
                    }
                    this.j6 = namespace;
                } catch (Throwable th) {
                    if (vy) {
                        iy.j3(th, 1262167958266027935L, this, namespace);
                    }
                    throw th;
                }
            }

            @ey(method = -2411450984061076932L)
            public void j3() {
                try {
                    if (BT) {
                        iy.gn(-1084857413308785263L, this);
                    }
                    this.v5.Hw();
                } catch (Throwable th) {
                    if (vy) {
                        iy.aM(th, -1084857413308785263L, this);
                    }
                    throw th;
                }
            }

            @ey(method = 737636008872504889L)
            public int j6() {
                try {
                    if (BT) {
                        iy.gn(-683662869494749144L, this);
                    }
                    if (this.a8 + 1 > this.gW.Zo) {
                        this.gW.Zo = this.a8 + 1;
                    }
                    int i = this.a8;
                    this.a8 = i + 1;
                    return i;
                } catch (Throwable th) {
                    if (vy) {
                        iy.aM(th, -683662869494749144L, this);
                    }
                    throw th;
                }
            }

            @ey(method = 2182577707120243272L)
            public Namespace lg() {
                try {
                    if (BT) {
                        iy.gn(2046135542415611919L, this);
                    }
                    return this.j6;
                } catch (Throwable th) {
                    if (vy) {
                        iy.aM(th, 2046135542415611919L, this);
                    }
                    throw th;
                }
            }

            @ey(method = 164758523160090007L)
            public void nw(Namespace namespace) {
                try {
                    if (BT) {
                        iy.tp(237828576787626720L, this, namespace);
                    }
                    this.tp.j6(namespace);
                } catch (Throwable th) {
                    if (vy) {
                        iy.j3(th, 237828576787626720L, this, namespace);
                    }
                    throw th;
                }
            }

            @ey(method = 6485496135878949216L)
            public Type rN() {
                try {
                    if (BT) {
                        iy.gn(5647375699191213525L, this);
                    }
                    return this.DW.u9();
                } catch (Throwable th) {
                    if (vy) {
                        iy.aM(th, 5647375699191213525L, this);
                    }
                    throw th;
                }
            }

            @ey(method = 544036004074985941L)
            public boolean ro() {
                try {
                    if (BT) {
                        iy.gn(1294362537777348480L, this);
                    }
                    return this.Ws.peek() > 0;
                } catch (Throwable th) {
                    if (vy) {
                        iy.aM(th, 1294362537777348480L, this);
                    }
                    throw th;
                }
            }

            @ey(method = -1133490195122264820L)
            public void sG() {
                try {
                    if (BT) {
                        iy.gn(741388629228157995L, this);
                    }
                    this.rN = this.yS.pop();
                    this.a8 = this.lg.pop();
                    this.v5.VH();
                    this.Zo.Zo();
                    this.VH.VH();
                } catch (Throwable th) {
                    if (vy) {
                        iy.aM(th, 741388629228157995L, this);
                    }
                    throw th;
                }
            }

            @ey(method = 2110778573391237120L)
            public boolean sh() {
                try {
                    if (BT) {
                        iy.gn(-2391799888531840605L, this);
                    }
                    return y1.aM(this.U2.peek());
                } catch (Throwable th) {
                    if (vy) {
                        iy.aM(th, -2391799888531840605L, this);
                    }
                    throw th;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:135:0x042a  */
            @abcd.ey(method = 8721195630313675L)
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.aide.codemodel.api.Entity sy(int r21, int r22, boolean r23, com.aide.codemodel.api.Type r24) throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 1440
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.java.JavaCodeAnalyzer.a.C0041a.sy(int, int, boolean, com.aide.codemodel.api.Type):com.aide.codemodel.api.Entity");
            }

            @ey(method = -3826897176300838752L)
            public void tp(int i, int i2, Type type) {
                try {
                    if (BT) {
                        iy.we(2620603348753573699L, this, new Integer(i), new Integer(i2), type);
                    }
                    this.gW.v5.declareAttrDAIndex(i2, j6());
                    boolean zDW = this.VH.DW(i, this.Hw);
                    this.VH.FH(i, i2, this.Hw);
                    int iDW = DW();
                    if (type == this.gW.Hw.CU() || type == this.gW.Hw.SI()) {
                        DW();
                    }
                    if (this.gW.Mr) {
                        this.gW.v5.declareAttrVariableSlot(i2, iDW);
                    }
                    if (zDW) {
                        throw new c4();
                    }
                } catch (Throwable th) {
                    if (vy) {
                        iy.U2(th, 2620603348753573699L, this, new Integer(i), new Integer(i2), type);
                    }
                    throw th;
                }
            }

            @ey(method = -3245888463666404048L)
            public void u7(int i, Type type) {
                try {
                    if (BT) {
                        iy.EQ(2873194783701619997L, this, new Integer(i), type);
                    }
                    if (this.Zo.DW(i, this.Hw)) {
                        throw new c4();
                    }
                    this.Zo.FH(i, type, this.Hw);
                } catch (Throwable th) {
                    if (vy) {
                        iy.Mr(th, 2873194783701619997L, this, new Integer(i), type);
                    }
                    throw th;
                }
            }

            @ey(method = 2076797558650712576L)
            public void v5(int i, Member member) {
                try {
                    if (BT) {
                        iy.EQ(-2552586464549174535L, this, new Integer(i), member);
                    }
                    this.gW.v5.declareAttrDAIndex(i, j6());
                    this.gW.VH.Zo(member.getId(), i);
                } catch (Throwable th) {
                    if (vy) {
                        iy.Mr(th, -2552586464549174535L, this, new Integer(i), member);
                    }
                    throw th;
                }
            }

            @ey(method = 505939457533779780L)
            public void vJ() {
                try {
                    if (BT) {
                        iy.gn(1292759760989708973L, this);
                    }
                    this.Mr.pop();
                    this.aM.VH();
                    this.j3.VH();
                    this.U2.pop();
                    this.Hw--;
                    sG();
                    this.Ws.pop();
                    this.QX.pop();
                } catch (Throwable th) {
                    if (vy) {
                        iy.aM(th, 1292759760989708973L, this);
                    }
                    throw th;
                }
            }

            @ey(method = 4727477871588634375L)
            public boolean vy(Type type) {
                try {
                    if (BT) {
                        iy.tp(-2408541402794481040L, this, type);
                    }
                    try {
                        type = type.x9();
                    } catch (e4 unused) {
                    }
                    if (this.U2.size() <= 0 || !y1.aM(this.U2.peek())) {
                        return type == U2() ? this.XL.Zo() != type : this.gW.Hw.fY(this.gW.v5.getFile(), (ClassType) type, U2());
                    }
                    return false;
                } catch (Throwable th) {
                    if (vy) {
                        iy.j3(th, -2408541402794481040L, this, type);
                    }
                    throw th;
                }
            }

            @ey(method = 1644869863400257269L)
            public void we() {
                try {
                    if (BT) {
                        iy.gn(3375240521783436624L, this);
                    }
                    this.yS.push(this.rN);
                    this.lg.push(this.a8);
                    this.v5.Hw();
                    this.Zo.Hw();
                    this.VH.Hw();
                } catch (Throwable th) {
                    if (vy) {
                        iy.aM(th, 3375240521783436624L, this);
                    }
                    throw th;
                }
            }

            @ey(method = 4024480700011508120L)
            public long yS(int i) {
                try {
                    if (BT) {
                        iy.u7(-878292944040225625L, this, i);
                    }
                    return this.gn.v5(i);
                } catch (Throwable th) {
                    if (vy) {
                        iy.j3(th, -878292944040225625L, this, new Integer(i));
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(a.class);
        }

        @ey(method = -332901298426483549L)
        public a(EntitySpace entitySpace) {
            try {
                if (yS) {
                    iy.tp(-4023703846395324L, null, entitySpace);
                }
                this.gn = new C0041a(this, entitySpace);
                this.VH = new FunctionOfIntInt();
                this.u7 = new Stack<>();
                this.tp = new SetOf<>(entitySpace);
                this.EQ = new SetOf<>(entitySpace);
                this.we = new SetOf<>(entitySpace);
                this.J0 = new SetOf<>(entitySpace);
                this.J8 = new SetOf<>(entitySpace);
                this.Ws = new Type[1000];
                this.QX = new int[1000];
                this.aM = new y3();
                this.j3 = new SetOfInt();
                this.rN = new Type[1000];
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, -4023703846395324L, null, entitySpace);
                }
                throw th;
            }
        }

        @ey(method = 3114120604865409764L)
        private void AE(int i) {
            try {
                if (yS) {
                    iy.u7(4051175546051100365L, this, i);
                }
                if (this.Mr) {
                    try {
                        ClassType classtype = this.FH.getClasstype(this.v5.getFile(), this.v5.getLanguage(), this.v5.getDeclarationNumber(this.v5.getParentNode(i)));
                        if (classtype.isEnumType()) {
                            return;
                        }
                        MapOfInt<Member> mapOfIntE3 = classtype.e3();
                        mapOfIntE3.DEFAULT_ITERATOR.DW();
                        boolean z = false;
                        while (mapOfIntE3.DEFAULT_ITERATOR.hasMoreElements()) {
                            Member member = (Member) mapOfIntE3.DEFAULT_ITERATOR.nextValue();
                            if (y1.j6(member.getModifiers()) && member.getEnclosingClassType() == classtype) {
                                Qq(this.v5.getChildNode(this.v5.getParentNode(i), 0), "This class must be declared abstract since it declares the abstract method </C>" + member.getFullyQualifiedNameString() + "<//C>");
                                sG(this.v5.getChildNode(this.v5.getParentNode(i), 0), "abstract ");
                                z = true;
                            }
                        }
                        if (z) {
                            return;
                        }
                        mapOfIntE3.DEFAULT_ITERATOR.DW();
                        boolean z2 = false;
                        while (mapOfIntE3.DEFAULT_ITERATOR.hasMoreElements()) {
                            Member member2 = (Member) mapOfIntE3.DEFAULT_ITERATOR.nextValue();
                            if (y1.j6(member2.getModifiers()) && member2.getEnclosingClassType() != classtype) {
                                Qq(this.v5.getChildNode(i, 0), "This class must implement the abstract method </C>" + member2.getFullyQualifiedNameString() + "<//C>");
                                z2 = true;
                            }
                        }
                        if (z2) {
                            dx(this.v5.getChildNode(i, 0), classtype);
                        }
                    } catch (e4 unused) {
                    }
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, 4051175546051100365L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -1994874807252403091L)
        private int AL(int i) {
            try {
                if (yS) {
                    iy.u7(417289586934686628L, this, i);
                }
                return ys(i, 5965, false, true, true, false, true);
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, 417289586934686628L, this, new Integer(i));
                }
                throw th;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:67:0x0295  */
        @abcd.ey(method = 677848358439761652L)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void AR(int r19) {
            /*
                Method dump skipped, instructions count: 677
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.java.JavaCodeAnalyzer.a.AR(int):void");
        }

        @ey(method = -1465738276916536857L)
        private void An(int i, Member member) {
            try {
                if (yS) {
                    iy.EQ(-312271899269781480L, this, new Integer(i), member);
                }
                if (member.cT()) {
                    return;
                }
                int childCount = this.v5.getChildCount(i);
                for (int i2 = 0; i2 < childCount; i2++) {
                    int childNode = this.v5.getChildNode(i, i2);
                    if (this.v5.getSyntaxTag(childNode) == 231) {
                        try {
                            int childNode2 = this.v5.getChildNode(childNode, 1);
                            if (Od(childNode2) == this.Hw.OW(this.v5.getFile())) {
                                Qq(childNode2, "Method " + member.getNameString() + " does not override method from its superclass");
                                return;
                            }
                            return;
                        } catch (e4 unused) {
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.Mr(th, -312271899269781480L, this, new Integer(i), member);
                }
                throw th;
            }
        }

        @ey(method = -94529401053171819L)
        private void BR(int i) {
            try {
                if (yS) {
                    iy.u7(249389564553745684L, this, i);
                }
                ys(i, 24653, true, false, true, false, false);
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, 249389564553745684L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 37334660853224544L)
        private void Bx(int i, Type type) {
            try {
                if (yS) {
                    iy.EQ(-989704858693213011L, this, new Integer(i), type);
                }
                if (type == null || type == this.Hw.WB()) {
                    fY(this.v5.getChildNode(i, 0), this.Hw.ro());
                } else {
                    fY(this.v5.getChildNode(i, 0), type);
                }
                if (this.Mr) {
                    a5(this.v5.getChildNode(i, 0), false);
                }
                if (this.v5.hasAttrType(this.v5.getChildNode(i, 0))) {
                    Type attrType = this.v5.getAttrType(this.v5.getChildNode(i, 0));
                    try {
                        this.v5.declareAttrType(i, this.Hw.Ev(this.v5.getFile(), ((JavaSyntax) this.v5.getLanguage().getSyntax()).et(this.v5.getSyntaxTag(this.v5.getChildNode(i, 1))), attrType));
                    } catch (e4 unused) {
                        sy(i, "The </C>" + this.v5.getLanguage().getSyntax().getString(this.v5.getSyntaxTag(this.v5.getChildNode(i, 1))) + "<//C> operator can not be applied to an instance of type </C>" + attrType.getFullyQualifiedNameString() + "<//C>");
                    }
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.Mr(th, -989704858693213011L, this, new Integer(i), type);
                }
                throw th;
            }
        }

        @ey(method = -2879464101642882379L)
        private Type CU(Type type, int i) {
            try {
                if (yS) {
                    iy.EQ(1858123708188676656L, this, type, new Integer(i));
                }
                int childCount = this.v5.getChildCount(i);
                if (childCount > 0) {
                    int i2 = childCount - 1;
                    if (this.v5.getSyntaxTag(this.v5.getChildNode(i, i2)) == 108) {
                        if (this.Mr && (this.v5.getSyntaxTag(this.v5.getParentNode(i)) != 191 || this.v5.getChildNode(this.v5.getParentNode(i), 2) != i)) {
                            Qq(this.v5.getChildNode(i, i2), "Unexpected </C>...<//C>");
                        }
                        type = this.FH.hz(type, 1);
                        childCount--;
                    }
                }
                for (int i3 = childCount - 2; i3 >= 0; i3 -= 3) {
                    if (type.isParameterizedType()) {
                        int[] absoluteArgumentVariances = ((ParameterizedType) type).getAbsoluteArgumentVariances();
                        for (int i4 = 0; i4 < absoluteArgumentVariances.length && absoluteArgumentVariances[i4] == 1; i4++) {
                        }
                    }
                    int childCount2 = this.v5.getChildCount(this.v5.getChildNode(i, i3)) + 1;
                    if (childCount2 > 1) {
                        Qq(i, "Rectangular arrays are not supported by this language");
                    }
                    type = this.FH.hz(type, childCount2);
                }
                return type;
            } catch (Throwable th) {
                Type type2 = type;
                if (gW) {
                    iy.Mr(th, 1858123708188676656L, this, type2, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 5085289041452271008L)
        private void Cz(int i) {
            try {
                if (yS) {
                    iy.u7(-8119025935440733761L, this, i);
                }
                this.v5.declareAttrType(i, this.Hw.CU());
                if (this.a8) {
                    try {
                        this.v5.j3(i, this.Hw.QO(this.v5.getLiteralString(i)));
                        if (this.Mr) {
                            if (this.v5.getLiteralString(i).equals("9223372036854775808L") || this.v5.getLiteralString(i).equals("9223372036854775808l")) {
                                if (this.v5.getSyntaxTag(this.v5.getParentNode(i)) == 170 && this.v5.getSyntaxTag(this.v5.getChildNode(this.v5.getParentNode(i), 0)) == 27) {
                                    return;
                                }
                                aj(i, "Invalid literal");
                            }
                        }
                    } catch (e4 unused) {
                        if (this.Mr) {
                            aj(i, "Invalid literal");
                        }
                    }
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, -8119025935440733761L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -2706122348973744204L)
        private void E4(int i) {
            int childNode;
            int childNode2;
            int childNode3;
            boolean z;
            int i2;
            try {
                if (yS) {
                    iy.u7(-580865169097888099L, this, i);
                }
                if (this.Mr) {
                    int parentNode = this.v5.getParentNode(this.v5.getParentNode(i));
                    if (this.v5.getSyntaxTag(parentNode) != 133 || this.v5.getChildNode(this.v5.getChildNode(parentNode, 1), 0) != i || this.v5.getSyntaxTag(this.v5.getParentNode(parentNode)) != 123) {
                        Qq(i, "Unexpected constructor invocation");
                        ro(i);
                    }
                }
                this.gn.QX();
                Type type = null;
                if (this.v5.getChildCount(i) > 4) {
                    fY(this.v5.getChildNode(i, 0), null);
                    childNode = this.v5.getChildNode(i, 4);
                    childNode2 = this.v5.getChildNode(i, 5);
                    childNode3 = this.v5.getChildNode(i, 2);
                } else {
                    childNode = this.v5.getChildNode(i, 2);
                    childNode2 = this.v5.getChildNode(i, 3);
                    childNode3 = this.v5.getChildNode(i, 0);
                }
                int i3 = childNode2;
                int childCount = this.v5.getChildCount(childNode);
                if (childCount > 2) {
                    int i4 = 1;
                    boolean z2 = true;
                    int i5 = 0;
                    while (i4 < childCount) {
                        fY(this.v5.getChildNode(childNode, i4), type);
                        if (this.v5.hasAttrType(this.v5.getChildNode(childNode, i4))) {
                            if (this.Ws.length <= this.XL) {
                                Type[] typeArr = new Type[(this.Ws.length * 2) + 1];
                                System.arraycopy(this.Ws, 0, typeArr, 0, this.Ws.length);
                                this.Ws = typeArr;
                            }
                            this.Ws[this.XL] = this.v5.getAttrType(this.v5.getChildNode(childNode, i4));
                        } else {
                            z2 = false;
                        }
                        i5++;
                        this.XL++;
                        i4 += 2;
                        type = null;
                    }
                    z = z2;
                    i2 = i5;
                } else {
                    z = true;
                    i2 = 0;
                }
                this.gn.g3();
                if (z) {
                    try {
                        Member memberEv = Ev(i, childNode, childNode3, i2, this.gn.U2().Bx(), i3, false);
                        qP(this.gn.U2().getSuperType(), memberEv, childNode, z, i2);
                        if (this.Mr) {
                            if (this.v5.getChildCount(i) > 4) {
                                ClassType enclosingClassType = memberEv.getEnclosingClassType();
                                if (enclosingClassType.isToplevel() || enclosingClassType.pl()) {
                                    Qq(this.v5.getChildNode(i, 0), "A reference to an enclosing class is not required");
                                    cn(this.v5.getChildNode(i, 0), this.v5.getChildNode(i, 1));
                                } else if (this.v5.hasAttrType(this.v5.getChildNode(i, 0)) && !this.v5.getAttrType(this.v5.getChildNode(i, 0)).isImplicitConvertibleTo(this.v5.getFile(), this.v5.getLanguage(), enclosingClassType.getEnclosingClassType())) {
                                    Qq(this.v5.getChildNode(i, 0), "A reference to an enclosing class is required");
                                }
                            } else {
                                ClassType enclosingClassType2 = memberEv.getEnclosingClassType();
                                if (enclosingClassType2.Of()) {
                                    if (!this.gn.vy(enclosingClassType2.getEnclosingClassType())) {
                                        Qq(i, "A reference to an enclosing class is required");
                                    }
                                }
                            }
                        }
                    } catch (e4 unused) {
                    }
                }
                this.XL -= i2;
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, -580865169097888099L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 329936237029441152L)
        public static /* synthetic */ int EQ(a aVar) {
            int i = aVar.XL;
            aVar.XL = i + 1;
            return i;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0128  */
        @abcd.ey(method = 2654742275099619975L)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private com.aide.codemodel.api.Entity Ej(int r12, int r13, com.aide.codemodel.api.Entity r14) {
            /*
                Method dump skipped, instructions count: 318
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.java.JavaCodeAnalyzer.a.Ej(int, int, com.aide.codemodel.api.Entity):com.aide.codemodel.api.Entity");
        }

        /* JADX WARN: Removed duplicated region for block: B:73:0x0123 A[Catch: all -> 0x0177, TryCatch #0 {all -> 0x0177, blocks: (B:3:0x0005, B:5:0x0009, B:6:0x000c, B:9:0x0018, B:11:0x001c, B:13:0x0026, B:16:0x0035, B:19:0x0044, B:21:0x004d, B:22:0x0053, B:24:0x0077, B:29:0x0085, B:31:0x0089, B:33:0x0093, B:36:0x00a2, B:44:0x00c4, B:39:0x00b1, B:41:0x00b9, B:43:0x00c1, B:46:0x00c9, B:48:0x00cd, B:50:0x00d7, B:53:0x00e6, B:68:0x010f, B:70:0x0117, B:72:0x011f, B:73:0x0123, B:75:0x012b, B:77:0x0133, B:78:0x0137, B:80:0x013f, B:82:0x0147, B:83:0x014b, B:85:0x0153, B:87:0x015b, B:88:0x015f, B:90:0x0167, B:92:0x016f), top: B:103:0x0005 }] */
        @abcd.ey(method = -372151305620297099L)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void Eq(int r14) {
            /*
                Method dump skipped, instructions count: 391
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.java.JavaCodeAnalyzer.a.Eq(int):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:142:0x03de  */
        @abcd.ey(method = 1646660181675642948L)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private com.aide.codemodel.api.Member Ev(int r33, int r34, int r35, int r36, com.aide.codemodel.api.Type r37, int r38, boolean r39) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 1054
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.java.JavaCodeAnalyzer.a.Ev(int, int, int, int, com.aide.codemodel.api.Type, int, boolean):com.aide.codemodel.api.Member");
        }

        @ey(method = 8158499485914897100L)
        private void FN(int i) {
            try {
                if (yS) {
                    iy.u7(-5067571878977318085L, this, i);
                }
                this.v5.declareAttrType(i, this.Hw.vy());
                if (this.a8) {
                    this.v5.j3(i, this.Hw.pN(this.v5.getLiteralString(i)));
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, -5067571878977318085L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 1744530985525994939L)
        private String Fd(SyntaxTree syntaxTree, int i) {
            try {
                if (yS) {
                    iy.EQ(-326719145010641024L, this, syntaxTree, new Integer(i));
                }
                if (syntaxTree.hasAttrValue(i)) {
                    long attrValue = syntaxTree.getAttrValue(i);
                    int semantic = syntaxTree.getAttrType(i).getSemantic();
                    if (semantic == 3 || semantic == 5 || semantic == 7) {
                        return Integer.toString(this.FH.I(attrValue));
                    }
                    if (semantic == 9) {
                        this.FH.ca(attrValue);
                        return String.valueOf(attrValue);
                    }
                    switch (semantic) {
                        case 11:
                            return String.valueOf(this.FH.vJ(attrValue));
                        case 12:
                            return String.valueOf((char) this.FH.I(attrValue));
                        case 13:
                            return String.valueOf(this.FH.Mz(attrValue));
                        case 14:
                            return String.valueOf(this.FH.g3(attrValue));
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
                    return Fd(syntaxTree, syntaxTree.getChildNode(i, 1));
                }
                if (syntaxTag != 172) {
                    if (syntaxTag != 178) {
                        return null;
                    }
                    StringBuffer stringBuffer = new StringBuffer();
                    int childCount = syntaxTree.getChildCount(i);
                    for (int i2 = 0; i2 < childCount; i2 += 2) {
                        stringBuffer.append(Fd(syntaxTree, syntaxTree.getChildNode(i, i2)));
                    }
                    return stringBuffer.toString();
                }
                if (syntaxTree.getSyntaxTag(syntaxTree.getChildNode(i, 1)) == 21) {
                    String strFd = Fd(syntaxTree, syntaxTree.getChildNode(i, 0));
                    String strFd2 = Fd(syntaxTree, syntaxTree.getChildNode(i, 2));
                    if (strFd != null && strFd2 != null) {
                        return strFd + strFd2;
                    }
                }
                return null;
            } catch (Throwable th) {
                if (gW) {
                    iy.Mr(th, -326719145010641024L, this, syntaxTree, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 2136800631077904183L)
        private void GK(int i) {
            boolean z;
            int i2;
            try {
                if (yS) {
                    iy.u7(-863785994547188544L, this, i);
                }
                if (this.Mr) {
                    int parentNode = this.v5.getParentNode(this.v5.getParentNode(i));
                    if (this.v5.getSyntaxTag(parentNode) != 133 || this.v5.getChildNode(this.v5.getChildNode(parentNode, 1), 0) != i || this.v5.getSyntaxTag(this.v5.getParentNode(parentNode)) != 123) {
                        Qq(i, "Unexpected constructor invocation");
                        ro(i);
                    }
                }
                this.gn.QX();
                int childNode = this.v5.getChildNode(i, 2);
                int childCount = this.v5.getChildCount(childNode);
                if (childCount > 2) {
                    boolean z2 = true;
                    int i3 = 0;
                    for (int i4 = 1; i4 < childCount; i4 += 2) {
                        fY(this.v5.getChildNode(childNode, i4), null);
                        if (this.v5.hasAttrType(this.v5.getChildNode(childNode, i4))) {
                            if (this.Ws.length <= this.XL) {
                                Type[] typeArr = new Type[(this.Ws.length * 2) + 1];
                                System.arraycopy(this.Ws, 0, typeArr, 0, this.Ws.length);
                                this.Ws = typeArr;
                            }
                            this.Ws[this.XL] = this.v5.getAttrType(this.v5.getChildNode(childNode, i4));
                        } else {
                            z2 = false;
                        }
                        i3++;
                        this.XL++;
                    }
                    z = z2;
                    i2 = i3;
                } else {
                    z = true;
                    i2 = 0;
                }
                this.gn.g3();
                if (z) {
                    try {
                        Member memberEv = Ev(i, childNode, this.v5.getChildNode(i, 0), i2, this.gn.U2(), this.v5.getChildNode(i, 3), false);
                        qP(this.gn.rN(), memberEv, childNode, z, i2);
                        if (this.Mr) {
                            int parentNode2 = this.v5.getParentNode(this.v5.getParentNode(i));
                            if (this.v5.getSyntaxTag(this.v5.getParentNode(parentNode2)) == 123 && memberEv == this.FH.jw(this.v5.getFile(), this.v5.getLanguage(), this.v5.getDeclarationNumber(this.v5.getParentNode(parentNode2)))) {
                                Qq(i, "Recursive constructor invoaction");
                            }
                        }
                    } catch (e4 unused) {
                    }
                }
                this.XL -= i2;
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, -863785994547188544L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 5040578500744872339L)
        private int GT(int i, boolean z) {
            try {
                if (yS) {
                    iy.EQ(308758128715738732L, this, new Integer(i), new Boolean(z));
                }
                return ys(i, 24705, true, false, false, z, false);
            } catch (Throwable th) {
                if (gW) {
                    iy.Mr(th, 308758128715738732L, this, new Integer(i), new Boolean(z));
                }
                throw th;
            }
        }

        @ey(method = -269672625019309929L)
        private void Gj(int i) {
            try {
                if (yS) {
                    iy.u7(5504634988044106068L, this, i);
                }
                ys(i, 16384, true, false, false, false, false);
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, 5504634988044106068L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -238333707687486096L)
        private void Hl(int i, boolean z) {
            try {
                if (yS) {
                    iy.EQ(-987480672754139525L, this, new Integer(i), new Boolean(z));
                }
                ys(i, 24577, true, false, false, z, false);
            } catch (Throwable th) {
                if (gW) {
                    iy.Mr(th, -987480672754139525L, this, new Integer(i), new Boolean(z));
                }
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @ey(method = 93494242408983339L)
        public void I(int i) {
            try {
                if (yS) {
                    iy.u7(102348613376698920L, this, i);
                }
                if (this.Mr) {
                    int identifier = this.v5.getIdentifier(i);
                    MapOf<ClassType, Entity> mapOfYO = this.FH.yO(identifier, 0, this.v5.getFile(), this.v5.getLanguage());
                    if (mapOfYO.Mr() > 0) {
                        this.j6.EQ(this.v5.getFile(), this.v5.getLanguage(), "Fix imports");
                        SetOf setOf = new SetOf(this.FH);
                        mapOfYO.j6.DW();
                        while (mapOfYO.j6.j6()) {
                            ClassType classType = (ClassType) mapOfYO.j6.Hw();
                            Entity entityV5 = mapOfYO.j6.v5();
                            if (!setOf.contains(entityV5)) {
                                setOf.put(entityV5);
                                this.j6.tp(this.v5.getFile(), this.v5.getLanguage(), classType, "Add 'import " + classType.getFullyQualifiedNameString() + "'");
                            }
                        }
                    }
                    FileEntry parentDirectory = this.v5.getFile().getParentDirectory();
                    this.j6.Zo(this.v5.getFile(), this.v5.getLanguage(), parentDirectory, identifier, "Create class " + this.v5.getIdentifierString(i) + " in " + parentDirectory.getPathString());
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, 102348613376698920L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -5527948298096769552L)
        private void IS(int i, Type type) {
            int childNode;
            try {
                if (yS) {
                    iy.EQ(2831307923059427217L, this, new Integer(i), type);
                }
                int childCount = this.v5.getChildCount(i);
                if (childCount == 1) {
                    childNode = this.v5.getChildNode(i, 0);
                    this.gn.aj(childNode, type, this.v5.N0(i));
                    if (this.v5.hasAttrType(childNode)) {
                        this.v5.declareAttrType(i, this.v5.getAttrType(childNode));
                    }
                    if (this.Mr && this.gn.ro() && this.v5.sh(childNode) == 16) {
                        Member member = (Member) this.v5.getAttrReferenceEntity(childNode);
                        if (member.getEnclosingClassType() == this.gn.U2() && member.gG() == this.gn.sh() && ((member.Ws() > this.v5.getStartLine(i) || (member.Ws() == this.v5.getStartLine(i) && member.QX() > this.v5.getStartColumn(i))) && (this.v5.getSyntaxTag(this.v5.getParentNode(i)) != 172 || this.v5.getChildNode(this.v5.getParentNode(i), 0) != i || this.v5.getSyntaxTag(this.v5.getChildNode(this.v5.getParentNode(i), 1)) != 17))) {
                            Qq(i, "Illegal forward reference");
                        }
                    }
                } else {
                    XX(i, childCount, type, this.v5.N0(i));
                    childNode = this.v5.getChildNode(i, this.v5.getChildCount(i) - 1);
                    int iSh = this.v5.sh(childNode);
                    if (iSh != 0 && iSh != 16 && iSh != 20 && iSh != 27) {
                        Qq(childNode, "Unknown field");
                    } else if (this.v5.hasAttrType(childNode)) {
                        this.v5.declareAttrType(i, this.v5.getAttrType(childNode));
                    }
                }
                if (this.a8) {
                    int iSh2 = this.v5.sh(childNode);
                    if (iSh2 == 2 || iSh2 == 3) {
                        int attrReferenceNode = this.v5.getAttrReferenceNode(childNode);
                        if (this.gn.dx(attrReferenceNode)) {
                            this.v5.j3(i, this.gn.yS(attrReferenceNode));
                            return;
                        }
                        return;
                    }
                    if (iSh2 != 16) {
                        return;
                    }
                    Member member2 = (Member) this.v5.getAttrReferenceEntity(childNode);
                    if (member2.w9()) {
                        this.v5.j3(i, member2.br());
                    }
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.Mr(th, 2831307923059427217L, this, new Integer(i), type);
                }
                throw th;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x003c A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:3:0x0005, B:5:0x0009, B:6:0x000c, B:14:0x002f, B:15:0x0032, B:17:0x0046, B:16:0x003c), top: B:24:0x0005 }] */
        @abcd.ey(method = 602233258434952485L)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void Jl(int r7) {
            /*
                r6 = this;
                r0 = 4898754408306025656(0x43fbdf2dfcf5a4b8, double:3.213399237290803E19)
                boolean r2 = com.aide.codemodel.language.java.JavaCodeAnalyzer.a.yS     // Catch: java.lang.Throwable -> L60
                if (r2 == 0) goto Lc
                abcd.iy.u7(r0, r6, r7)     // Catch: java.lang.Throwable -> L60
            Lc:
                com.aide.codemodel.api.SyntaxTree r2 = r6.v5     // Catch: java.lang.Throwable -> L60
                com.aide.codemodel.api.SyntaxTree r3 = r6.v5     // Catch: java.lang.Throwable -> L60
                com.aide.codemodel.api.SyntaxTree r4 = r6.v5     // Catch: java.lang.Throwable -> L60
                int r4 = r4.getParentNode(r7)     // Catch: java.lang.Throwable -> L60
                int r3 = r3.getParentNode(r4)     // Catch: java.lang.Throwable -> L60
                int r2 = r2.getSyntaxTag(r3)     // Catch: java.lang.Throwable -> L60
                r3 = 120(0x78, float:1.68E-43)
                r4 = 0
                if (r2 == r3) goto L3c
                r3 = 128(0x80, float:1.8E-43)
                if (r2 == r3) goto L3c
                r3 = 177(0xb1, float:2.48E-43)
                if (r2 == r3) goto L3c
                r3 = 227(0xe3, float:3.18E-43)
                if (r2 == r3) goto L3c
                switch(r2) {
                    case 220: goto L3c;
                    case 221: goto L3c;
                    case 222: goto L3c;
                    default: goto L32;
                }     // Catch: java.lang.Throwable -> L60
            L32:
                java.lang.String r2 = "Unexpected initializer"
                r6.aj(r7, r2)     // Catch: java.lang.Throwable -> L60
                r6.ro(r7)     // Catch: java.lang.Throwable -> L60
                r2 = 0
                goto L46
            L3c:
                com.aide.codemodel.api.SyntaxTree r2 = r6.v5     // Catch: java.lang.Throwable -> L60
                int r2 = r2.getChildNode(r7, r4)     // Catch: java.lang.Throwable -> L60
                int r2 = r6.kf(r2)     // Catch: java.lang.Throwable -> L60
            L46:
                com.aide.codemodel.language.java.JavaCodeAnalyzer$a$a r3 = r6.gn     // Catch: java.lang.Throwable -> L60
                r5 = 1
                r3.Ws(r2, r5, r4)     // Catch: java.lang.Throwable -> L60
                com.aide.codemodel.language.java.JavaCodeAnalyzer$a$a r2 = r6.gn     // Catch: java.lang.Throwable -> L60
                r2.Hw(r7)     // Catch: java.lang.Throwable -> L60
                com.aide.codemodel.api.SyntaxTree r2 = r6.v5     // Catch: java.lang.Throwable -> L60
                int r2 = r2.getChildNode(r7, r5)     // Catch: java.lang.Throwable -> L60
                r6.b1(r2)     // Catch: java.lang.Throwable -> L60
                com.aide.codemodel.language.java.JavaCodeAnalyzer$a$a r2 = r6.gn     // Catch: java.lang.Throwable -> L60
                r2.vJ()     // Catch: java.lang.Throwable -> L60
                return
            L60:
                r2 = move-exception
                boolean r3 = com.aide.codemodel.language.java.JavaCodeAnalyzer.a.gW
                if (r3 == 0) goto L6d
                java.lang.Integer r3 = new java.lang.Integer
                r3.<init>(r7)
                abcd.iy.j3(r2, r0, r6, r3)
            L6d:
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.java.JavaCodeAnalyzer.a.Jl(int):void");
        }

        @ey(method = -1041399471726482575L)
        private void Jm(int i, Type type) {
            try {
                if (yS) {
                    iy.EQ(-4222493552124574976L, this, new Integer(i), type);
                }
                fY(this.v5.getChildNode(i, 1), type);
                if (this.v5.hasAttrType(this.v5.getChildNode(i, 1))) {
                    this.v5.declareAttrType(i, this.v5.getAttrType(this.v5.getChildNode(i, 1)));
                }
                if (this.a8 && this.v5.hasAttrValue(this.v5.getChildNode(i, 1))) {
                    this.v5.j3(i, this.v5.getAttrValue(this.v5.getChildNode(i, 1)));
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.Mr(th, -4222493552124574976L, this, new Integer(i), type);
                }
                throw th;
            }
        }

        @ey(method = -638884674195157125L)
        private void KD(int i, Type type, Type type2) {
            try {
                if (yS) {
                    iy.we(-1392170553549719944L, this, new Integer(i), type, type2);
                }
                if (this.Mr && type2.yO(this.v5.getFile(), this.v5.getLanguage(), type)) {
                    this.j6.Ws(this.v5.getFile(), this.v5.getLanguage(), this.v5.getStartLine(i), this.v5.getStartColumn(i), this.v5.getStartLine(i), this.v5.getStartColumn(i), "(" + type.getNameString() + ") ", "Insert cast");
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.U2(th, -1392170553549719944L, this, new Integer(i), type, type2);
                }
                throw th;
            }
        }

        @ey(method = -1694764899053990577L)
        private void Lz(int i) {
            try {
                if (yS) {
                    iy.u7(1257299312288787488L, this, i);
                }
                try {
                    int childCount = this.v5.getChildCount(i);
                    for (int i2 = 0; i2 < childCount; i2 += 2) {
                        fY(this.v5.getChildNode(i, i2), null);
                    }
                    this.v5.declareAttrType(i, this.Hw.oY(this.v5.getFile()));
                } catch (e4 unused) {
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, 1257299312288787488L, this, new Integer(i));
                }
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @ey(method = -718787411435910783L)
        public void MP(int i, Entity entity) {
            try {
                if (yS) {
                    iy.EQ(1046912870196860112L, this, new Integer(i), entity);
                }
                if (entity.isClassType()) {
                    this.v5.declareAttrReferenceKind(i, 8, entity);
                    return;
                }
                if (entity.isNamespace()) {
                    this.v5.declareAttrReferenceKind(i, 6, entity);
                    return;
                }
                if (entity.isParameterizedType()) {
                    this.v5.declareAttrReferenceKind(i, 8, ((ParameterizedType) entity).getClassType());
                } else if (entity.isParameterType()) {
                    this.v5.declareAttrReferenceKind(i, 12, entity);
                } else if (entity.isMethodParameterType()) {
                    this.v5.declareAttrReferenceKind(i, 14, entity);
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.Mr(th, 1046912870196860112L, this, new Integer(i), entity);
                }
                throw th;
            }
        }

        @ey(method = 3629053860092786363L)
        private void Mz(int i, String str) {
            try {
                if (yS) {
                    iy.EQ(1841953659558847884L, this, new Integer(i), str);
                }
                if (this.Mr) {
                    this.j6.Ws(this.v5.getFile(), this.v5.getLanguage(), this.v5.getStartLine(i), this.v5.getStartColumn(i), this.v5.getEndLine(i), this.v5.getEndColumn(i), str, "Replace with '" + str.trim() + "'");
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.Mr(th, 1841953659558847884L, this, new Integer(i), str);
                }
                throw th;
            }
        }

        @ey(method = 425501204184620168L)
        private void N0(int i, int i2, String str, int i3) {
            try {
                if (yS) {
                    iy.J0(-3151537752587631013L, this, new Integer(i), new Integer(i2), str, new Integer(i3));
                }
                if (this.U2) {
                    this.j6.lg(this.v5.getFile(), this.v5.getLanguage(), this.v5.getStartLine(i), this.v5.getStartColumn(i), this.v5.getEndLine(i2), this.v5.getEndColumn(i2), str, i3);
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.a8(th, -3151537752587631013L, this, new Integer(i), new Integer(i2), str, new Integer(i3));
                }
                throw th;
            }
        }

        @ey(method = -2026430958585698764L)
        private int Nh(int i) {
            try {
                if (yS) {
                    iy.u7(-699907732038855835L, this, i);
                }
                return ys(i, 24781, true, false, true, false, false);
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, -699907732038855835L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -279008462857774500L)
        private void OW(int i, String str) {
            try {
                if (yS) {
                    iy.EQ(-6167855418641556621L, this, new Integer(i), str);
                }
                eN(i, str, 47);
            } catch (Throwable th) {
                if (gW) {
                    iy.Mr(th, -6167855418641556621L, this, new Integer(i), str);
                }
                throw th;
            }
        }

        @ey(method = -3016330406308332936L)
        private Type Od(int i) {
            try {
                if (yS) {
                    iy.u7(-448629579026028309L, this, i);
                }
                int childNode = this.v5.getChildNode(i, 0);
                try {
                    Entity entityT6 = T6(this.gn.sy(childNode, this.v5.getChildNode(i, 1), false, null), this.v5.getChildNode(i, 1));
                    int childCount = this.v5.getChildCount(i);
                    for (int i2 = 3; i2 < childCount; i2 += 3) {
                        entityT6 = Ej(this.v5.getChildNode(i, i2), this.v5.getChildNode(i, i2 + 1), entityT6);
                    }
                    if (!entityT6.isNamespace()) {
                        this.v5.declareAttrType(i, (Type) entityT6);
                        return (Type) entityT6;
                    }
                    sy(childNode, "Unknown type </C>" + this.v5.getIdentifierString(childNode) + "<//C>");
                    throw new e4();
                } catch (e4 e) {
                    cc(this.v5.getChildNode(i, 1));
                    throw e;
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, -448629579026028309L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 2002439568902821776L)
        private void Of(int i) {
            try {
                if (yS) {
                    iy.u7(-1478415975728924701L, this, i);
                }
                Type typeWB = null;
                if (this.Mr) {
                    int parentNode = i;
                    while (true) {
                        if (parentNode == this.v5.getRootNode()) {
                            break;
                        }
                        int syntaxTag = this.v5.getSyntaxTag(parentNode);
                        if (syntaxTag != 123) {
                            if (syntaxTag == 124) {
                                try {
                                    typeWB = this.FH.jw(this.v5.getFile(), this.v5.getLanguage(), this.v5.getDeclarationNumber(parentNode)).WB();
                                    break;
                                } catch (e4 unused) {
                                }
                            } else {
                                if (syntaxTag == 127) {
                                    Qq(i, "An initializer may not contain a return statement");
                                    ro(i);
                                    break;
                                }
                                parentNode = this.v5.getParentNode(parentNode);
                            }
                        } else if (this.v5.getChildCount(i) > 2) {
                            Qq(this.v5.getChildNode(i, 1), "A constructor can not return a value");
                            ro(this.v5.getChildNode(i, 1));
                        }
                    }
                }
                fY(this.v5.getChildNode(i, 1), typeWB);
                if (this.Mr) {
                    if (this.v5.getChildCount(i) <= 2) {
                        if (typeWB == null || typeWB == this.Hw.WB()) {
                            return;
                        }
                        Qq(this.v5.getChildNode(i, 1), "This method must return a value of type </C>" + typeWB.getFullyQualifiedNameString() + "<//C>");
                        return;
                    }
                    if (typeWB == null || !this.v5.hasAttrType(this.v5.getChildNode(i, 1))) {
                        return;
                    }
                    if (typeWB == this.Hw.WB()) {
                        Qq(this.v5.getChildNode(i, 1), "A void method can not return a value");
                        ro(this.v5.getChildNode(i, 1));
                        return;
                    }
                    Type attrType = this.v5.getAttrType(this.v5.getChildNode(i, 1));
                    try {
                        if (this.v5.hasAttrValue(this.v5.getChildNode(i, 1))) {
                            this.Hw.yS(this.v5.getFile(), 22, typeWB, attrType, this.v5.getAttrValue(this.v5.getChildNode(i, 1)));
                        } else {
                            this.Hw.er(this.v5.getFile(), 22, typeWB, attrType);
                        }
                    } catch (e4 unused2) {
                        Qq(this.v5.getChildNode(i, 1), "An instance of type </C>" + attrType.getFullyQualifiedNameString() + "<//C> can not be returned by a method of type </C>" + typeWB.getFullyQualifiedNameString() + "<//C>");
                    }
                    if (this.U2 && this.Hw.pO(this.v5.getFile(), attrType, typeWB)) {
                        OW(this.v5.getChildNode(i, 1), "Returning this value is unsafe because an instance of type </C>" + attrType.getFullyQualifiedNameString() + "<//C> may not be of type </C>" + typeWB.getFullyQualifiedNameString() + "<//C>");
                        cb();
                    }
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, -1478415975728924701L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 58535824307512416L)
        private void PH(int i) {
            int i2;
            int i3;
            try {
                if (yS) {
                    iy.u7(-5364046264312218495L, this, i);
                }
                fY(this.v5.getChildNode(i, 2), this.Hw.ro());
                b1(this.v5.getChildNode(i, 4));
                if (this.Mr) {
                    int childNode = this.v5.getChildNode(i, 4);
                    int syntaxTag = this.v5.getSyntaxTag(this.v5.getChildNode(childNode, 1));
                    int i4 = 143;
                    int i5 = 0;
                    if (syntaxTag != 9 && syntaxTag != 143 && syntaxTag != 144) {
                        int childNode2 = this.v5.getChildNode(this.v5.getChildNode(i, 4), 0);
                        aj(childNode2, "Missing </C>case<//C> or </C>default<//C>");
                        sG(childNode2, "default:");
                    }
                    if (this.v5.hasAttrType(this.v5.getChildNode(i, 2))) {
                        Type attrType = this.v5.getAttrType(this.v5.getChildNode(i, 2));
                        try {
                            if (this.Hw.zh(this.v5.getFile(), attrType)) {
                                attrType = this.Hw.ye(this.v5.getFile(), attrType);
                            }
                        } catch (e4 unused) {
                        }
                        int semantic = attrType.getSemantic();
                        if (semantic != 3 && semantic != 4 && semantic != 5 && semantic != 7 && semantic != 12) {
                            try {
                                if (attrType == this.Hw.yO(this.v5.getFile())) {
                                    this.v5.declareAttrVariableSlot(i, this.gn.FH(1));
                                    return;
                                }
                                if (attrType.isClassType() && attrType.isEnumType()) {
                                    this.v5.declareAttrVariableSlot(i, this.gn.FH(1));
                                    this.aM.j6();
                                    int childCount = this.v5.getChildCount(childNode);
                                    boolean z = false;
                                    while (i5 < childCount) {
                                        int childNode3 = this.v5.getChildNode(childNode, i5);
                                        if (this.v5.getSyntaxTag(childNode3) == i4) {
                                            int childNode4 = this.v5.getChildNode(childNode3, 1);
                                            if (this.v5.getSyntaxTag(childNode4) == 161 && this.v5.sh(this.v5.getChildNode(childNode4, this.v5.getChildCount(childNode4) - 1)) == 16) {
                                                Entity attrReferenceEntity = this.v5.getAttrReferenceEntity(this.v5.getChildNode(childNode4, this.v5.getChildCount(childNode4) - 1));
                                                i3 = i5;
                                                if (this.aM.DW(this.FH.getId(attrReferenceEntity))) {
                                                    Qq(childNode3, "Duplicate case");
                                                    ro(childNode3);
                                                }
                                                this.aM.FH(this.FH.getId(attrReferenceEntity));
                                            } else {
                                                i3 = i5;
                                            }
                                        } else {
                                            i3 = i5;
                                            if (this.v5.getSyntaxTag(childNode3) == 144) {
                                                if (z) {
                                                    Qq(childNode3, "Duplicate default case");
                                                    ro(childNode3);
                                                }
                                                z = true;
                                            }
                                        }
                                        i5 = i3 + 1;
                                        i4 = 143;
                                    }
                                    return;
                                }
                                Qq(this.v5.getChildNode(i, 2), "Invalid type of switch expression");
                                return;
                            } catch (e4 unused2) {
                                return;
                            }
                        }
                        this.aM.j6();
                        int childCount2 = this.v5.getChildCount(childNode);
                        boolean z2 = false;
                        boolean z3 = false;
                        boolean z4 = false;
                        while (i5 < childCount2) {
                            int childNode5 = this.v5.getChildNode(childNode, i5);
                            if (this.v5.getSyntaxTag(childNode5) != 143) {
                                i2 = i5;
                                if (this.v5.getSyntaxTag(childNode5) == 144) {
                                    if (z2) {
                                        Qq(childNode5, "Duplicate default case");
                                        ro(childNode5);
                                    }
                                    z2 = true;
                                }
                            } else if (this.v5.hasAttrValue(this.v5.getChildNode(childNode5, 1))) {
                                i2 = i5;
                                int I = this.FH.I(this.v5.getAttrValue(this.v5.getChildNode(childNode5, 1)));
                                if (I == Integer.MAX_VALUE) {
                                    if (z3) {
                                        Qq(childNode5, "Duplicate case </C>2147483647<//C>");
                                        ro(childNode5);
                                    }
                                    z3 = true;
                                } else if (I == Integer.MIN_VALUE) {
                                    if (z4) {
                                        Qq(childNode5, "Duplicate case </C>-2147483648<//C>");
                                        ro(childNode5);
                                    }
                                    z4 = true;
                                } else {
                                    long j = I;
                                    if (this.aM.DW(j)) {
                                        Qq(childNode5, "Duplicate case </C>" + I + "<//C>");
                                        ro(childNode5);
                                    }
                                    this.aM.FH(j);
                                }
                            } else {
                                i2 = i5;
                            }
                            i5 = i2 + 1;
                        }
                    }
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, -5364046264312218495L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 3349159677826173660L)
        private void PT(int i, Type type) {
            try {
                if (yS) {
                    iy.EQ(2876589069761272459L, this, new Integer(i), type);
                }
                fY(i, type);
                if (this.Mr) {
                    int syntaxTag = this.v5.getSyntaxTag(i);
                    if (syntaxTag == 163 || syntaxTag == 164 || syntaxTag == 176 || syntaxTag == 177) {
                        return;
                    }
                    switch (syntaxTag) {
                        case 155:
                        case 156:
                        case 157:
                            return;
                        default:
                            switch (syntaxTag) {
                                case 170:
                                    int syntaxTag2 = this.v5.getSyntaxTag(this.v5.getChildNode(i, 0));
                                    if (syntaxTag2 == 22 || syntaxTag2 == 28) {
                                        return;
                                    }
                                    aj(i, "This expression is not a valid statement");
                                    ro(i);
                                    return;
                                case 171:
                                    return;
                                case 172:
                                    int syntaxTag3 = this.v5.getSyntaxTag(this.v5.getChildNode(i, 1));
                                    if (syntaxTag3 == 17 || syntaxTag3 == 20 || syntaxTag3 == 23 || syntaxTag3 == 29 || syntaxTag3 == 31 || syntaxTag3 == 33 || syntaxTag3 == 37 || syntaxTag3 == 40 || syntaxTag3 == 43 || syntaxTag3 == 47 || syntaxTag3 == 52 || syntaxTag3 == 53) {
                                        return;
                                    }
                                    aj(i, "This expression is not a valid statement");
                                    ro(i);
                                    return;
                                default:
                                    aj(i, "This expression is not a valid statement");
                                    ro(i);
                                    return;
                            }
                    }
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.Mr(th, 2876589069761272459L, this, new Integer(i), type);
                }
                throw th;
            }
        }

        @ey(method = -2905778415028552375L)
        private void Pa(int i) {
            try {
                if (yS) {
                    iy.u7(305450552173939608L, this, i);
                }
                Namespace namespaceNw = this.Hw.nw();
                int childCount = this.v5.getChildCount(i);
                for (int i2 = 2; i2 < childCount; i2 += 2) {
                    int childNode = this.v5.getChildNode(i, i2);
                    namespaceNw = namespaceNw.OW(this.v5.getIdentifier(childNode));
                    this.v5.declareAttrReferenceKind(childNode, 6, namespaceNw);
                }
                this.gn.gn(namespaceNw);
                if (this.er) {
                    FileEntry parentDirectory = this.v5.getFile().getParentDirectory();
                    while (namespaceNw != this.Hw.nw()) {
                        if (parentDirectory.getNameIdentifier() != namespaceNw.getIdentifier()) {
                            Qq(i, "Invalid package declaration");
                            return;
                        } else {
                            parentDirectory = parentDirectory.getParentDirectory();
                            namespaceNw = namespaceNw.aj();
                        }
                    }
                }
                if (childCount > 0) {
                    int childNode2 = this.v5.getChildNode(i, 0);
                    int childCount2 = this.v5.getChildCount(childNode2);
                    if (childCount2 > 0 && this.v5.getFile().getNameIdentifier() != this.Hw.hz()) {
                        Qq(childNode2, "Package-level annotations must be in package-info.java");
                        return;
                    }
                    for (int i3 = 0; i3 < childCount2; i3++) {
                        try {
                            kQ(this.v5.getChildNode(childNode2, i3));
                        } catch (e4 unused) {
                        }
                    }
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, 305450552173939608L, this, new Integer(i));
                }
                throw th;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:148:0x052f  */
        @abcd.ey(method = -704115521980016359L)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void Q6(int r26) {
            /*
                Method dump skipped, instructions count: 1341
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.java.JavaCodeAnalyzer.a.Q6(int):void");
        }

        @ey(method = -3615053136444815105L)
        private Type QO(int i) {
            try {
                if (yS) {
                    iy.u7(1242787971949858408L, this, i);
                }
                if (this.v5.getSyntaxTag(this.v5.getChildNode(i, 0)) != 69) {
                    return om(i);
                }
                this.v5.declareAttrType(i, this.Hw.WB());
                return this.Hw.WB();
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, 1242787971949858408L, this, new Integer(i));
                }
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @ey(method = -1542389207940676576L)
        public void Qq(int i, String str) {
            try {
                if (yS) {
                    iy.EQ(-813612246190832551L, this, new Integer(i), str);
                }
                nw(i, str, 11);
            } catch (Throwable th) {
                if (gW) {
                    iy.Mr(th, -813612246190832551L, this, new Integer(i), str);
                }
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @ey(method = 1777931600203611096L)
        public void SI(int i, Type type) {
            try {
                if (yS) {
                    iy.EQ(-5713704898562402995L, this, new Integer(i), type);
                }
                if (this.Mr) {
                    I(i);
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.Mr(th, -5713704898562402995L, this, new Integer(i), type);
                }
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:122:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x020a A[Catch: all -> 0x0326, e4 -> 0x0330, TryCatch #2 {all -> 0x0326, blocks: (B:37:0x00f2, B:40:0x00fb, B:42:0x0105, B:43:0x0113, B:45:0x011b, B:47:0x0125, B:51:0x0141, B:52:0x0152, B:55:0x0189, B:58:0x01a5, B:60:0x01a9, B:61:0x01c3, B:62:0x01c8, B:63:0x01f1, B:65:0x020a, B:67:0x0210, B:69:0x0233, B:71:0x0251, B:73:0x0263, B:75:0x026b, B:77:0x0273, B:79:0x0294, B:82:0x02a5, B:83:0x02c6, B:85:0x02cc, B:92:0x02e1, B:94:0x02eb, B:97:0x02f8, B:98:0x0303, B:99:0x030c, B:68:0x0222), top: B:122:0x00f2 }] */
        /* JADX WARN: Removed duplicated region for block: B:70:0x024f  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0263 A[Catch: all -> 0x0326, e4 -> 0x0330, TryCatch #2 {all -> 0x0326, blocks: (B:37:0x00f2, B:40:0x00fb, B:42:0x0105, B:43:0x0113, B:45:0x011b, B:47:0x0125, B:51:0x0141, B:52:0x0152, B:55:0x0189, B:58:0x01a5, B:60:0x01a9, B:61:0x01c3, B:62:0x01c8, B:63:0x01f1, B:65:0x020a, B:67:0x0210, B:69:0x0233, B:71:0x0251, B:73:0x0263, B:75:0x026b, B:77:0x0273, B:79:0x0294, B:82:0x02a5, B:83:0x02c6, B:85:0x02cc, B:92:0x02e1, B:94:0x02eb, B:97:0x02f8, B:98:0x0303, B:99:0x030c, B:68:0x0222), top: B:122:0x00f2 }] */
        @abcd.ey(method = 2016850125311011975L)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void Sf(int r32, int r33, boolean r34, com.aide.codemodel.api.Type r35, com.aide.codemodel.api.Type r36, com.aide.codemodel.api.Type[] r37, int r38, int r39) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 892
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.java.JavaCodeAnalyzer.a.Sf(int, int, boolean, com.aide.codemodel.api.Type, com.aide.codemodel.api.Type, com.aide.codemodel.api.Type[], int, int):void");
        }

        @ey(method = -612271877121806200L)
        private Entity T6(Entity entity, int i) {
            int i2;
            ParameterType parameterType;
            Entity entity2 = entity;
            try {
                if (yS) {
                    iy.EQ(-3375333163016412829L, this, entity2, new Integer(i));
                }
                if (entity.isParameterizedType()) {
                    ClassType classType = ((ParameterizedType) entity2).getClassType();
                    if (!classType.isToplevel() && !classType.Of()) {
                        entity2 = classType;
                    }
                }
                int childCount = this.v5.getChildCount(i);
                if (childCount == 0) {
                    if (!entity2.isParameterizedType()) {
                        return entity2;
                    }
                    ClassType classType2 = ((ParameterizedType) entity2).getClassType();
                    return classType2.Pa() == 0 ? entity2 : classType2;
                }
                if (!this.DW.DW) {
                    Qq(i, "Generic types are not supported by this language");
                    return entity2;
                }
                if (childCount == 2) {
                    if (!this.DW.FH || this.v5.getSyntaxTag(this.v5.getParentNode(this.v5.getParentNode(i))) != 176) {
                        Qq(i, "Missing generic type arguments");
                    }
                    return entity2;
                }
                if (!entity2.isClassType() && !entity2.isParameterizedType()) {
                    Qq(i, "</C>" + entity2.getFullyQualifiedNameString() + "<//C> is not a generic classtype");
                    ro(i);
                    return entity2;
                }
                int i3 = (childCount - 1) / 4;
                ClassType classType3 = entity2.isParameterizedType() ? ((ParameterizedType) entity2).getClassType() : (ClassType) entity2;
                int i4 = 1;
                if (i3 != classType3.Pa()) {
                    if (classType3.Pa() == 0) {
                        Qq(i, "</C>" + classType3.getFullyQualifiedNameString() + "<//C> is not a generic type");
                        ro(i);
                    } else if (classType3.Pa() == 1) {
                        Qq(i, "</C>" + classType3.getFullyQualifiedNameString() + "<//C> has </C>1<//C> type parameter");
                    } else {
                        Qq(i, "</C>" + classType3.getFullyQualifiedNameString() + "<//C> has </C>" + classType3.Pa() + "<//C> type parameters");
                    }
                    return entity2;
                }
                Type[] typeArr = new Type[i3];
                int[] iArr = new int[i3];
                int i5 = 1;
                int i6 = 0;
                while (i5 < childCount) {
                    try {
                        int i7 = i5 + 1;
                        typeArr[i6] = CU(om(this.v5.getChildNode(i, i7)), this.v5.getChildNode(i, i5 + 2));
                        iArr[i6] = 0;
                        int childNode = this.v5.getChildNode(i, i5);
                        if (this.v5.getChildCount(childNode) > 0) {
                            if (!this.DW.DW) {
                                Qq(childNode, "Wildcards are not supported by this language");
                            } else if (this.v5.getChildCount(childNode) == 1) {
                                iArr[i6] = 1;
                                typeArr[i6] = classType3.An(i6).x9().x9();
                            } else {
                                int syntaxTag = this.v5.getSyntaxTag(this.v5.getChildNode(childNode, 1));
                                if (syntaxTag == 78) {
                                    iArr[i6] = 3;
                                    if (classType3.An(i6).x9() == typeArr[i6]) {
                                        iArr[i6] = 0;
                                    }
                                } else if (syntaxTag == 91) {
                                    iArr[i6] = 2;
                                    if (classType3.An(i6).x9() == typeArr[i6]) {
                                        iArr[i6] = 1;
                                    }
                                }
                            }
                        }
                        if (!this.Hw.iW(typeArr[i6])) {
                            Qq(this.v5.getChildNode(i, i7), "An argument type must be a reference type");
                            return entity2;
                        }
                        i5 += 4;
                        i6++;
                    } catch (e4 unused) {
                        return entity2;
                    }
                }
                ParameterizedType parameterizedType = entity2.isClassType() ? (ParameterizedType) ((ClassType) entity2).ba(typeArr, iArr) : (ParameterizedType) ((ParameterizedType) entity2).ye(typeArr, iArr);
                int i8 = 0;
                while (i4 < childCount) {
                    try {
                        ParameterType parameterTypeAn = classType3.An(i8);
                        int iYe = parameterTypeAn.ye();
                        int i9 = 0;
                        while (true) {
                            if (i9 >= iYe) {
                                i2 = childCount;
                                break;
                            }
                            Type typeReplaceType = parameterizedType.replaceType(parameterTypeAn.Ev(i9));
                            if (iArr[i8] == 0) {
                                i2 = childCount;
                                parameterType = parameterTypeAn;
                                if (!typeArr[i8].isImplicitConvertibleTo(this.v5.getFile(), this.v5.getLanguage(), typeReplaceType)) {
                                    Qq(this.v5.getChildNode(i, i4 + 1), "This argument type is not within its bounds");
                                    break;
                                }
                                i9++;
                                childCount = i2;
                                parameterTypeAn = parameterType;
                            } else {
                                i2 = childCount;
                                parameterType = parameterTypeAn;
                                if (iArr[i8] != 2) {
                                    if (iArr[i8] != 3) {
                                        continue;
                                    } else {
                                        if (!typeArr[i8].isParameterType() && !typeArr[i8].isMethodParameterType()) {
                                            if (!typeArr[i8].isImplicitConvertibleTo(this.v5.getFile(), this.v5.getLanguage(), typeReplaceType)) {
                                                Qq(this.v5.getChildNode(i, i4 + 1), "This argument type is not within its bounds");
                                                break;
                                            }
                                        }
                                        if (!typeArr[i8].x9().yO(this.v5.getFile(), this.v5.getLanguage(), typeReplaceType)) {
                                            Qq(this.v5.getChildNode(i, i4 + 1), "This argument type is not within its bounds");
                                            break;
                                        }
                                    }
                                    i9++;
                                    childCount = i2;
                                    parameterTypeAn = parameterType;
                                } else {
                                    if (!typeArr[i8].yO(this.v5.getFile(), this.v5.getLanguage(), typeReplaceType)) {
                                        Qq(this.v5.getChildNode(i, i4 + 1), "This argument type is not within its bounds");
                                        break;
                                    }
                                    i9++;
                                    childCount = i2;
                                    parameterTypeAn = parameterType;
                                }
                            }
                        }
                        i4 += 4;
                        i8++;
                        childCount = i2;
                    } catch (e4 unused2) {
                        return entity2;
                    }
                }
                return parameterizedType;
            } catch (Throwable th) {
                if (gW) {
                    iy.Mr(th, -3375333163016412829L, this, entity2, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 3842078971212093408L)
        private void TI(int i) {
            try {
                if (yS) {
                    iy.u7(4742994545848887625L, this, i);
                }
                if (!this.DW.DW) {
                    Qq(i, "Static imports are not supported by this language");
                    return;
                }
                Entity entityNw = this.Hw.nw();
                int childCount = this.v5.getChildCount(i);
                for (int i2 = 2; i2 < childCount - 2; i2 += 2) {
                    int childNode = this.v5.getChildNode(i, i2);
                    int identifier = this.v5.getIdentifier(childNode);
                    try {
                        try {
                            entityNw = entityNw.isClassType() ? ((ClassType) entityNw).FN(identifier, true, 0, this.gn.lg(), this.v5.getFile(), this.v5.getLanguage()) : ((Namespace) entityNw).dx(this.v5.getFile(), this.v5.getLanguage(), identifier, true, 0, (Namespace) entityNw);
                            MP(childNode, entityNw);
                        } catch (b4 unused) {
                            sy(childNode, "Ambiguous type </C>" + this.v5.getIdentifierString(childNode) + "<//C>");
                            return;
                        }
                    } catch (e4 unused2) {
                        sy(childNode, "Unknown type or package </C>" + this.v5.getIdentifierString(childNode) + "<//C>");
                        if (entityNw.isNamespace()) {
                            vJ(childNode, (Namespace) entityNw);
                            return;
                        }
                        return;
                    }
                }
                if (entityNw.isClassType()) {
                    this.gn.SI((ClassType) entityNw);
                    return;
                }
                int childNode2 = this.v5.getChildNode(i, this.v5.getChildCount(i) - 4);
                sy(childNode2, "Unknown type </C>" + this.v5.getIdentifierString(childNode2) + "<//C>");
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, 4742994545848887625L, this, new Integer(i));
                }
                throw th;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x004e A[Catch: all -> 0x0286, TryCatch #2 {all -> 0x0286, blocks: (B:3:0x0009, B:5:0x000d, B:6:0x0010, B:9:0x0017, B:17:0x0039, B:18:0x003c, B:19:0x0045, B:20:0x004e, B:22:0x0074, B:23:0x00b2, B:25:0x00cf, B:27:0x00d5, B:29:0x0109, B:31:0x010f, B:32:0x011a, B:34:0x0129, B:35:0x013b, B:36:0x0153, B:38:0x0160, B:42:0x018b, B:45:0x019a, B:47:0x01aa, B:50:0x01b1, B:53:0x01b9, B:55:0x01bf, B:57:0x01c8, B:59:0x01d0, B:60:0x01d6, B:61:0x01dc, B:64:0x01ea, B:65:0x0206, B:67:0x020c, B:69:0x022a, B:71:0x0230, B:74:0x0241, B:76:0x026b, B:78:0x0280, B:77:0x0277), top: B:94:0x0009 }] */
        @abcd.ey(method = 56730067257504907L)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void WB(int r17) {
            /*
                Method dump skipped, instructions count: 678
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.java.JavaCodeAnalyzer.a.WB(int):void");
        }

        @ey(method = -1230972531112867961L)
        private void XG(int i) {
            try {
                if (yS) {
                    iy.u7(-5300561097995041260L, this, i);
                }
                int childCount = this.v5.getChildCount(i);
                if (childCount > 2) {
                    for (int i2 = 1; i2 < childCount; i2 += 2) {
                        fY(this.v5.getChildNode(i, i2), null);
                    }
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, -5300561097995041260L, this, new Integer(i));
                }
                throw th;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x00a8 A[Catch: all -> 0x01cc, TryCatch #1 {all -> 0x01cc, blocks: (B:3:0x0008, B:5:0x000c, B:6:0x0027, B:8:0x003f, B:10:0x0047, B:25:0x0069, B:27:0x006e, B:30:0x0077, B:32:0x0089, B:33:0x0099, B:34:0x00a8, B:36:0x00b8, B:38:0x00d2, B:40:0x00d6, B:42:0x00de, B:44:0x00ec, B:45:0x00f1, B:47:0x00f9, B:37:0x00c6, B:49:0x0103, B:50:0x010f, B:52:0x0136, B:53:0x013e, B:55:0x0142, B:57:0x0174, B:59:0x017c, B:61:0x018c, B:63:0x01b6, B:65:0x01c0, B:62:0x01a3), top: B:78:0x0008, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0174 A[Catch: all -> 0x01cc, TryCatch #1 {all -> 0x01cc, blocks: (B:3:0x0008, B:5:0x000c, B:6:0x0027, B:8:0x003f, B:10:0x0047, B:25:0x0069, B:27:0x006e, B:30:0x0077, B:32:0x0089, B:33:0x0099, B:34:0x00a8, B:36:0x00b8, B:38:0x00d2, B:40:0x00d6, B:42:0x00de, B:44:0x00ec, B:45:0x00f1, B:47:0x00f9, B:37:0x00c6, B:49:0x0103, B:50:0x010f, B:52:0x0136, B:53:0x013e, B:55:0x0142, B:57:0x0174, B:59:0x017c, B:61:0x018c, B:63:0x01b6, B:65:0x01c0, B:62:0x01a3), top: B:78:0x0008, inners: #0 }] */
        @abcd.ey(method = 3793745261131261376L)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void XX(int r19, int r20, com.aide.codemodel.api.Type r21, boolean r22) {
            /*
                Method dump skipped, instructions count: 506
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.java.JavaCodeAnalyzer.a.XX(int, int, com.aide.codemodel.api.Type, boolean):void");
        }

        @ey(method = -1471840917896093420L)
        private void Xa(int i, Type type) {
            try {
                if (yS) {
                    iy.EQ(1961503145519096277L, this, new Integer(i), type);
                }
                int syntaxTag = this.v5.getSyntaxTag(i);
                if (syntaxTag == 196) {
                    this.gn.Ws(64, true, false);
                    et(i, type);
                    this.gn.vJ();
                    return;
                }
                if (syntaxTag == 231) {
                    if (kQ(i).isImplicitConvertibleTo(this.v5.getFile(), this.v5.getLanguage(), type)) {
                        return;
                    }
                    Qq(i, "Illegal attribute value");
                    return;
                }
                if (type.isArrayType()) {
                    type = ((ArrayType) type).getElementType();
                }
                if (this.Hw.oY(this.v5.getFile()) == type) {
                    this.gn.Ws(64, true, false);
                    fY(i, null);
                    this.gn.vJ();
                    if (this.v5.hasAttrType(i)) {
                        if (this.Hw.oY(this.v5.getFile()) != this.v5.getAttrType(i)) {
                            Qq(i, "Illegal attribute value");
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.gn.Ws(64, true, false);
                fY(i, null);
                this.gn.vJ();
                if (this.v5.hasAttrType(i)) {
                    Type attrType = this.v5.getAttrType(i);
                    if (!attrType.isImplicitConvertibleTo(this.v5.getFile(), this.v5.getLanguage(), type)) {
                        Qq(i, "Illegal attribute value");
                    }
                    if (!this.Hw.Jl(attrType) || this.v5.hasAttrValue(i)) {
                        return;
                    }
                    Qq(i, "Attribute value must be constant");
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.Mr(th, 1961503145519096277L, this, new Integer(i), type);
                }
                throw th;
            }
        }

        @ey(method = -284634581548888599L)
        private void Yi(int i) {
            try {
                if (yS) {
                    iy.u7(243140502047831136L, this, i);
                }
                int childCount = this.v5.getChildCount(i);
                for (int i2 = 1; i2 < childCount; i2 += 2) {
                    try {
                        Type typeOm = om(this.v5.getChildNode(i, i2));
                        if (this.Mr && !this.Hw.e3(this.v5.getFile(), typeOm)) {
                            Qq(this.v5.getChildNode(i, i2), "Only subtypes of </C>Throwable<//C> can be thrown");
                        }
                    } catch (e4 unused) {
                    }
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, 243140502047831136L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -2242388747834151912L)
        private void Z1(int i) {
            try {
                if (yS) {
                    iy.u7(-3011463636717615741L, this, i);
                }
                Entity entityNw = this.Hw.nw();
                int childCount = this.v5.getChildCount(i);
                for (int i2 = 1; i2 < childCount; i2 += 2) {
                    int childNode = this.v5.getChildNode(i, i2);
                    int identifier = this.v5.getIdentifier(childNode);
                    try {
                        try {
                            entityNw = entityNw.isClassType() ? ((ClassType) entityNw).FN(identifier, true, 0, this.gn.lg(), this.v5.getFile(), this.v5.getLanguage()) : ((Namespace) entityNw).dx(this.v5.getFile(), this.v5.getLanguage(), identifier, true, 0, (Namespace) entityNw);
                            MP(childNode, entityNw);
                        } catch (b4 unused) {
                            sy(childNode, "Ambiguous type </C>" + this.v5.getIdentifierString(childNode) + "<//C>");
                            return;
                        }
                    } catch (e4 unused2) {
                        sy(childNode, "Unknown type or package </C>" + this.v5.getIdentifierString(childNode) + "<//C>");
                        if (entityNw.isNamespace()) {
                            vJ(childNode, (Namespace) entityNw);
                            return;
                        }
                        return;
                    }
                }
                if (!entityNw.isClassType()) {
                    int childNode2 = this.v5.getChildNode(i, this.v5.getChildCount(i) - 2);
                    sy(childNode2, "Unknown type </C>" + this.v5.getIdentifierString(childNode2) + "<//C>");
                    return;
                }
                int childNode3 = this.v5.getChildNode(i, this.v5.getChildCount(i) - 2);
                try {
                    this.gn.P8(this.v5.getIdentifier(childNode3), (ClassType) entityNw);
                } catch (c4 unused3) {
                    sy(childNode3, "A type named </C>" + this.v5.getIdentifierString(childNode3) + "<//C> has already been imported");
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, -3011463636717615741L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 451744261942685005L)
        private void Za(int i) {
            int i2;
            boolean z;
            try {
                if (yS) {
                    iy.u7(5127857699008186896L, this, i);
                }
                int childNode = this.v5.getChildCount(i) == 6 ? this.v5.getChildNode(i, 5) : this.v5.getChildNode(i, 3);
                int childCount = this.v5.getChildCount(childNode);
                if (childCount > 2) {
                    i2 = 0;
                    z = true;
                    for (int i3 = 1; i3 < childCount; i3 += 2) {
                        fY(this.v5.getChildNode(childNode, i3), null);
                        if (this.v5.hasAttrType(this.v5.getChildNode(childNode, i3))) {
                            if (this.Ws.length <= this.XL) {
                                Type[] typeArr = new Type[(this.Ws.length * 2) + 1];
                                System.arraycopy(this.Ws, 0, typeArr, 0, this.Ws.length);
                                this.Ws = typeArr;
                            }
                            this.Ws[this.XL] = this.v5.getAttrType(this.v5.getChildNode(childNode, i3));
                        } else {
                            z = false;
                        }
                        i2++;
                        this.XL++;
                    }
                } else {
                    i2 = 0;
                    z = true;
                }
                try {
                    if (this.v5.getChildCount(i) == 6) {
                        fY(this.v5.getChildNode(i, 0), null);
                        if (this.v5.hasAttrType(this.v5.getChildNode(i, 0))) {
                            int childNode2 = this.v5.getChildNode(i, 4);
                            if (this.v5.getChildCount(childNode2) > 2) {
                                Qq(childNode2, "Invalid type");
                            } else {
                                Entity entityEj = Ej(this.v5.getChildNode(childNode2, 0), this.v5.getChildNode(childNode2, 1), this.v5.getAttrType(this.v5.getChildNode(i, 0)));
                                if (!entityEj.isNamespace()) {
                                    Type type = (Type) entityEj;
                                    if (this.Mr) {
                                        if (type.isClassType() && ((ClassType) type).pl()) {
                                            Qq(this.v5.getChildNode(i, 0), "A reference to an enclosing class is not required");
                                            cn(this.v5.getChildNode(i, 0), this.v5.getChildNode(i, 1));
                                        }
                                        if (type.isInterfaceType() || (type.isEnumType() && !this.gn.U2().isEnumType())) {
                                            Qq(childNode2, "Expected a class");
                                        }
                                        if (type.wc()) {
                                            Qq(childNode2, "The type of a created instance can only be invariant");
                                        }
                                    }
                                    this.v5.declareAttrType(i, type);
                                    this.v5.declareAttrType(childNode2, type);
                                    if (z) {
                                        int childNode3 = this.v5.getChildNode(childNode2, this.v5.getChildCount(childNode2) - 2);
                                        this.v5.declareAttrInvocationType(childNode3, type);
                                        Ev(i, childNode, this.v5.getChildNode(i, 3), i2, type, childNode3, false);
                                    }
                                }
                            }
                        }
                    } else {
                        int childNode4 = this.v5.getChildNode(i, 2);
                        Type typeOd = Od(childNode4);
                        this.v5.declareAttrType(i, typeOd);
                        if (!typeOd.isDelegateType()) {
                            if (this.Mr) {
                                ClassType classType = typeOd.isClassType() ? (ClassType) typeOd : (ClassType) typeOd.x9();
                                if (classType.Of()) {
                                    if (!this.gn.vy(classType.getEnclosingClassType())) {
                                        Qq(i, "A reference to an enclosing class is required");
                                    }
                                }
                                if (y1.j6(classType.getModifiers())) {
                                    Qq(i, "An instance of an abstract class can not be created");
                                }
                                if (typeOd.isInterfaceType() || (typeOd.isEnumType() && !this.gn.U2().isEnumType())) {
                                    Qq(childNode4, "Expected a class");
                                }
                                if (typeOd.wc()) {
                                    Qq(childNode4, "The type of a created instance can only be invariant");
                                }
                            }
                            if (z) {
                                int childNode5 = this.v5.getChildNode(childNode4, this.v5.getChildCount(childNode4) - 2);
                                this.v5.declareAttrInvocationType(childNode5, typeOd);
                                qP(typeOd, Ev(i, childNode, this.v5.getChildNode(i, 1), i2, typeOd, childNode5, false), childNode, z, i2);
                            }
                        }
                    }
                } catch (e4 unused) {
                }
                this.XL -= i2;
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, 5127857699008186896L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 350857735239110616L)
        private void a5(int i, boolean z) {
            try {
                if (yS) {
                    iy.EQ(12666482614296353L, this, new Integer(i), new Boolean(z));
                }
                int syntaxTag = this.v5.getSyntaxTag(i);
                if (syntaxTag != 159) {
                    if (syntaxTag == 165) {
                        return;
                    }
                    if (syntaxTag == 168) {
                        a5(this.v5.getChildNode(i, 1), z);
                        return;
                    } else if (syntaxTag != 161 && syntaxTag != 162) {
                        aj(i, "This is not a variable");
                        return;
                    }
                }
                int childNode = this.v5.getChildNode(i, this.v5.getChildCount(i) - 1);
                int iSh = this.v5.sh(childNode);
                if (iSh == 2) {
                    if (((JavaSyntax) this.v5.getLanguage().getSyntax()).oY(this.v5, this.v5.getAttrReferenceNode(childNode))) {
                        Qq(childNode, "This variable is final and can not be modified");
                        return;
                    }
                    return;
                }
                if (iSh == 3) {
                    Qq(childNode, "This variable can not be modified");
                    return;
                }
                if (iSh != 16) {
                    if (iSh != 27) {
                        return;
                    }
                    aj(childNode, "The length of an array can not be modified");
                    return;
                }
                Member member = (Member) this.v5.getAttrReferenceEntity(childNode);
                if (!member.Jl()) {
                    if (!member.kf()) {
                        return;
                    }
                    if (this.gn.cn() && z && member.getEnclosingClassType() == this.gn.U2() && (!member.gG() || this.gn.cb())) {
                        return;
                    }
                }
                Qq(childNode, "This field is final and can not be modified");
            } catch (Throwable th) {
                if (gW) {
                    iy.Mr(th, 12666482614296353L, this, new Integer(i), new Boolean(z));
                }
                throw th;
            }
        }

        @ey(method = 2415401623153204224L)
        private int aX(int i) {
            try {
                if (yS) {
                    iy.u7(-878737484461043703L, this, i);
                }
                return ys(i, 551117, false, false, true, false, false);
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, -878737484461043703L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -4397376045903678189L)
        private void aj(int i, String str) {
            try {
                if (yS) {
                    iy.EQ(4636584584290975848L, this, new Integer(i), str);
                }
                nw(i, str, 10);
            } catch (Throwable th) {
                if (gW) {
                    iy.Mr(th, 4636584584290975848L, this, new Integer(i), str);
                }
                throw th;
            }
        }

        @ey(method = 4415274832390066320L)
        private void aq(int i, Type type) {
            try {
                if (yS) {
                    iy.EQ(-6271333111698927051L, this, new Integer(i), type);
                }
                fY(this.v5.getChildNode(i, 4), type);
                try {
                    Type typeCU = CU(om(this.v5.getChildNode(i, 1)), this.v5.getChildNode(i, 2));
                    this.v5.declareAttrType(i, typeCU);
                    if (this.v5.hasAttrType(this.v5.getChildNode(i, 4))) {
                        Type attrType = this.v5.getAttrType(this.v5.getChildNode(i, 4));
                        if (this.Mr || this.U2) {
                            if (!attrType.yO(this.v5.getFile(), this.v5.getLanguage(), typeCU)) {
                                sy(i, "An instance of type </C>" + this.v5.getAttrType(this.v5.getChildNode(i, 4)).getFullyQualifiedNameString() + "<//C> can not be of type </C>" + typeCU.getFullyQualifiedNameString() + "<//C>");
                            } else if (this.Hw.sg(this.v5.getFile(), attrType, typeCU)) {
                                lp(this.v5.getChildNode(i, 0), this.v5.getChildNode(i, 3), "This cast is unsafe because it is not possible to check at runtime wether an instance of type </C>" + attrType.getFullyQualifiedNameString() + "<//C> is of type </C>" + typeCU.getFullyQualifiedNameString() + "<//C>");
                            }
                        }
                        if (this.a8 && this.v5.hasAttrValue(this.v5.getChildNode(i, 4))) {
                            this.v5.j3(i, this.FH.XX(this.v5.getFile(), this.v5.getLanguage(), this.v5.getAttrValue(this.v5.getChildNode(i, 4)), attrType, typeCU));
                        }
                    }
                } catch (e4 unused) {
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.Mr(th, -6271333111698927051L, this, new Integer(i), type);
                }
                throw th;
            }
        }

        @ey(method = 503133591639702992L)
        private void b1(int i) {
            try {
                if (yS) {
                    iy.u7(-3665239824245165325L, this, i);
                }
                int syntaxTag = this.v5.getSyntaxTag(i);
                if (syntaxTag != 128 && syntaxTag != 129) {
                    if (syntaxTag == 151) {
                        d8(i);
                        return;
                    }
                    if (syntaxTag != 222) {
                        if (this.j3.empty() || this.j3.contains(i)) {
                            int syntaxTag2 = this.v5.getSyntaxTag(i);
                            if (syntaxTag2 == 133) {
                                this.gn.we();
                                int childCount = this.v5.getChildCount(i);
                                for (int i2 = 0; i2 < childCount; i2++) {
                                    b1(this.v5.getChildNode(i, i2));
                                }
                                this.gn.sG();
                                return;
                            }
                            if (syntaxTag2 == 209) {
                                fY(this.v5.getChildNode(i, 1), this.Hw.gW());
                                if (this.v5.getChildCount(i) > 3) {
                                    fY(this.v5.getChildNode(i, 3), null);
                                }
                                if (!this.v5.hasAttrType(this.v5.getChildNode(i, 1)) || this.v5.getAttrType(this.v5.getChildNode(i, 1)).getSemantic() == 11) {
                                    return;
                                }
                                Qq(this.v5.getChildNode(i, 1), "A condition must be of type </C>boolean<//C>");
                                return;
                            }
                            if (syntaxTag2 == 211) {
                                q7(i);
                                return;
                            }
                            if (syntaxTag2 == 212) {
                                oh(i);
                                return;
                            }
                            try {
                                switch (syntaxTag2) {
                                    case 135:
                                        fY(this.v5.getChildNode(i, 2), this.Hw.gW());
                                        b1(this.v5.getChildNode(i, 4));
                                        if (this.v5.hasAttrType(this.v5.getChildNode(i, 2)) && this.v5.getAttrType(this.v5.getChildNode(i, 2)).getSemantic() != 11 && this.v5.getAttrType(this.v5.getChildNode(i, 2)) != this.Hw.dx(this.v5.getFile())) {
                                            Qq(this.v5.getChildNode(i, 2), "A condition must be of type </C>boolean<//C>");
                                        }
                                        return;
                                    case 136:
                                        fY(this.v5.getChildNode(i, 2), this.Hw.gW());
                                        b1(this.v5.getChildNode(i, 4));
                                        b1(this.v5.getChildNode(i, 6));
                                        if (this.v5.hasAttrType(this.v5.getChildNode(i, 2)) && this.v5.getAttrType(this.v5.getChildNode(i, 2)).getSemantic() != 11 && this.v5.getAttrType(this.v5.getChildNode(i, 2)) != this.Hw.dx(this.v5.getFile())) {
                                            Qq(this.v5.getChildNode(i, 2), "A condition must be of type </C>boolean<//C>");
                                        }
                                        return;
                                    case 137:
                                        fY(this.v5.getChildNode(i, 2), this.Hw.gW());
                                        b1(this.v5.getChildNode(i, 4));
                                        if (this.v5.hasAttrType(this.v5.getChildNode(i, 2)) && this.v5.getAttrType(this.v5.getChildNode(i, 2)).getSemantic() != 11 && this.v5.getAttrType(this.v5.getChildNode(i, 2)) != this.Hw.dx(this.v5.getFile())) {
                                            Qq(this.v5.getChildNode(i, 2), "A condition must be of type </C>boolean<//C>");
                                        }
                                        return;
                                    case 138:
                                        if (this.v5.getChildCount(i) == 3) {
                                            try {
                                                int iEr = this.gn.er(this.v5.getIdentifier(this.v5.getChildNode(i, 1)));
                                                this.v5.declareAttrReferenceKind(this.v5.getChildNode(i, 1), 5, iEr);
                                                this.v5.declareAttrTarget(i, iEr);
                                                return;
                                            } catch (e4 unused) {
                                                sy(this.v5.getChildNode(i, 1), "Unknown label </C>" + this.v5.getIdentifierString(this.v5.getChildNode(i, 1)) + "<//C>");
                                                return;
                                            }
                                        }
                                        int parentNode = i;
                                        while (parentNode != this.v5.getRootNode()) {
                                            int syntaxTag3 = this.v5.getSyntaxTag(parentNode);
                                            if (syntaxTag3 == 123 || syntaxTag3 == 124 || syntaxTag3 == 127) {
                                                aj(i, "A </C>break<//C> statement must be contained in a </C>do<//C>, </C>while<//C>, </C>for<//C> or </C>switch<//C> statement");
                                                ro(i);
                                                return;
                                            } else {
                                                if (syntaxTag3 == 137 || syntaxTag3 == 145 || syntaxTag3 == 147 || syntaxTag3 == 149 || syntaxTag3 == 211) {
                                                    this.v5.declareAttrTarget(i, parentNode);
                                                    return;
                                                }
                                                parentNode = this.v5.getParentNode(parentNode);
                                            }
                                        }
                                        return;
                                    case 139:
                                        if (this.v5.getChildCount(i) != 3) {
                                            int parentNode2 = i;
                                            while (parentNode2 != this.v5.getRootNode()) {
                                                int syntaxTag4 = this.v5.getSyntaxTag(parentNode2);
                                                if (syntaxTag4 == 123 || syntaxTag4 == 124 || syntaxTag4 == 127) {
                                                    aj(i, "A </C>continue<//C> statement must be contained in a </C>do<//C>, </C>while<//C> or </C>for<//C> statement");
                                                    ro(i);
                                                    return;
                                                } else {
                                                    if (syntaxTag4 == 137 || syntaxTag4 == 145 || syntaxTag4 == 149 || syntaxTag4 == 211) {
                                                        this.v5.declareAttrTarget(i, parentNode2);
                                                        return;
                                                    }
                                                    parentNode2 = this.v5.getParentNode(parentNode2);
                                                }
                                            }
                                            return;
                                        }
                                        try {
                                            int iEr2 = this.gn.er(this.v5.getIdentifier(this.v5.getChildNode(i, 1)));
                                            this.v5.declareAttrReferenceKind(this.v5.getChildNode(i, 1), 5, iEr2);
                                            while (this.v5.getSyntaxTag(iEr2) == 148) {
                                                iEr2 = this.v5.getChildNode(iEr2, 2);
                                            }
                                            int syntaxTag5 = this.v5.getSyntaxTag(iEr2);
                                            if (syntaxTag5 == 137 || syntaxTag5 == 145 || syntaxTag5 == 149 || syntaxTag5 == 211) {
                                                this.v5.declareAttrTarget(i, iEr2);
                                                return;
                                            } else {
                                                aj(i, "A </C>continue<//C> statement must be contained in a </C>do<//C>, </C>while<//C> or </C>for<//C> statement");
                                                ro(i);
                                                return;
                                            }
                                        } catch (e4 unused2) {
                                            sy(this.v5.getChildNode(i, 1), "Unknown label </C>" + this.v5.getIdentifierString(this.v5.getChildNode(i, 1)) + "<//C>");
                                            return;
                                        }
                                    case 140:
                                        this.gn.we();
                                        if (this.Mr) {
                                            this.v5.declareAttrVariableSlot(i, this.gn.FH(2));
                                        }
                                        try {
                                            fY(this.v5.getChildNode(i, 2), this.Hw.Eq(this.v5.getFile()));
                                        } catch (e4 unused3) {
                                        }
                                        if (this.Mr && this.v5.hasAttrType(this.v5.getChildNode(i, 2)) && !this.Hw.iW(this.v5.getAttrType(this.v5.getChildNode(i, 2)))) {
                                            Qq(this.v5.getChildNode(i, 2), "Reference type required");
                                        }
                                        b1(this.v5.getChildNode(i, 4));
                                        this.gn.sG();
                                        return;
                                    case 141:
                                        Of(i);
                                        return;
                                    case 142:
                                        fY(this.v5.getChildNode(i, 1), this.Hw.XG(this.v5.getFile()));
                                        if (this.v5.hasAttrType(this.v5.getChildNode(i, 1))) {
                                            Type attrType = this.v5.getAttrType(this.v5.getChildNode(i, 1));
                                            if (this.Mr && !this.Hw.e3(this.v5.getFile(), attrType)) {
                                                Qq(this.v5.getChildNode(i, 1), "Only subtypes of </C>Throwable<//C> can be thrown");
                                            }
                                        }
                                        return;
                                    case 143:
                                        hz(i);
                                        return;
                                    case 144:
                                        if (this.v5.getSyntaxTag(this.v5.getParentNode(this.v5.getParentNode(i))) != 147) {
                                            Qq(i, "Unexpected </C>default<//C>");
                                            ro(i);
                                            return;
                                        }
                                        return;
                                    case ProxyTextView.INPUTTYPE_textVisiblePassword /* 145 */:
                                        b1(this.v5.getChildNode(i, 1));
                                        fY(this.v5.getChildNode(i, 4), this.Hw.gW());
                                        if (this.v5.hasAttrType(this.v5.getChildNode(i, 4)) && this.v5.getAttrType(this.v5.getChildNode(i, 4)).getSemantic() != 11 && this.v5.getAttrType(this.v5.getChildNode(i, 4)) != this.Hw.dx(this.v5.getFile())) {
                                            Qq(this.v5.getChildNode(i, 4), "A condition must be of type </C>boolean<//C>");
                                        }
                                        return;
                                    case 146:
                                        PT(this.v5.getChildNode(i, 0), this.Hw.WB());
                                        return;
                                    case 147:
                                        PH(i);
                                        return;
                                    case 148:
                                        this.gn.j3();
                                        try {
                                            this.gn.Zo(this.v5.getIdentifier(this.v5.getChildNode(i, 0)), i);
                                        } catch (c4 unused4) {
                                            int childNode = this.v5.getChildNode(i, 0);
                                            sy(childNode, "There already is another label named </C>" + this.v5.getIdentifierString(childNode) + "<//C>");
                                        }
                                        this.v5.declareAttrReferenceKind(this.v5.getChildNode(i, 0), 4, i);
                                        b1(this.v5.getChildNode(i, 2));
                                        this.gn.Mz();
                                        return;
                                    case 149:
                                        cT(i);
                                        return;
                                    case 150:
                                        pl(i);
                                        return;
                                    default:
                                        return;
                                }
                            } catch (e4 unused5) {
                                return;
                            }
                        }
                        return;
                    }
                }
                if (this.Mr && this.v5.getSyntaxTag(this.v5.getParentNode(i)) != 133) {
                    aj(i, "Unexpected class declaration");
                    ro(i);
                }
                try {
                    ClassType classtype = this.FH.getClasstype(this.v5.getFile(), this.v5.getLanguage(), this.v5.getDeclarationNumber(i));
                    int childNode2 = this.v5.getChildNode(i, 2);
                    try {
                        this.gn.VH(this.v5.getIdentifier(childNode2), classtype);
                    } catch (c4 unused6) {
                        sy(childNode2, "There already is another type named </C>" + this.v5.getIdentifierString(childNode2) + "<//C>");
                    }
                    oY(i);
                } catch (e4 unused7) {
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, -3665239824245165325L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 3604921704102518163L)
        private void br(int i, int i2, int i3, Type type, Type type2) {
            int iMax;
            try {
                if (yS) {
                    iy.J8(-1632681000718192272L, this, new Integer(i), new Integer(i2), new Integer(i3), type, type2);
                }
                if (k2(i, i2, type, false, false, type2, true, false)) {
                    return;
                }
                if (i3 != -1) {
                    try {
                        try {
                            iMax = Math.max(0, (this.v5.getChildCount(i3) - 2) / 3);
                        } catch (e4 unused) {
                            sy(i2, "Unknown member </C>" + this.v5.getIdentifierString(i2) + "<//C> of </C>" + type.getFullyQualifiedNameString() + "<//C>");
                            sh(i2, true, type, type2);
                            return;
                        }
                    } catch (b4 unused2) {
                        sy(i2, "Ambiguous member </C>" + this.v5.getIdentifierString(i2) + "<//C> of </C>" + type.getFullyQualifiedNameString() + "<//C>");
                        return;
                    }
                } else {
                    iMax = 0;
                }
                Type typeEf = type.ef(this.v5.getIdentifier(i2), true, iMax, this.gn.a8(), this.v5.getFile(), this.v5.getLanguage());
                MP(i2, typeEf);
                if (typeEf.isParameterizedType()) {
                    this.v5.declareAttrType(i, ((ParameterizedType) typeEf).getClassType());
                } else {
                    this.v5.declareAttrType(i, typeEf);
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.lg(th, -1632681000718192272L, this, new Integer(i), new Integer(i2), new Integer(i3), type, type2);
                }
                throw th;
            }
        }

        @ey(method = -209795384779222209L)
        private void cT(int i) {
            try {
                if (yS) {
                    iy.u7(206843261948191080L, this, i);
                }
                this.gn.we();
                int childNode = this.v5.getChildNode(i, 2);
                if (this.v5.getChildCount(childNode) > 0 && this.v5.getSyntaxTag(this.v5.getChildNode(childNode, 0)) == 151) {
                    b1(this.v5.getChildNode(childNode, 0));
                } else if (this.v5.getChildCount(childNode) <= 0 || this.v5.getSyntaxTag(this.v5.getChildNode(childNode, 0)) != 14) {
                    int childCount = this.v5.getChildCount(childNode);
                    for (int i2 = 0; i2 < childCount; i2 += 2) {
                        PT(this.v5.getChildNode(childNode, i2), null);
                    }
                }
                int childNode2 = this.v5.getChildNode(i, 3);
                if (this.v5.getChildCount(childNode2) > 1) {
                    int childNode3 = this.v5.getChildNode(childNode2, 0);
                    fY(childNode3, this.Hw.gW());
                    if (this.v5.hasAttrType(childNode3) && this.v5.getAttrType(childNode3).getSemantic() != 11) {
                        Qq(childNode3, "A condition must be of type </C>boolean<//C>");
                    }
                }
                int childNode4 = this.v5.getChildNode(i, 4);
                int childCount2 = this.v5.getChildCount(childNode4);
                for (int i3 = 0; i3 < childCount2; i3 += 2) {
                    PT(this.v5.getChildNode(childNode4, i3), null);
                }
                b1(this.v5.getChildNode(i, 6));
                this.gn.sG();
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, 206843261948191080L, this, new Integer(i));
                }
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @ey(method = -707629056502505727L)
        public void ca(int i, Type type) {
            try {
                if (yS) {
                    iy.EQ(-1266922768991144580L, this, new Integer(i), type);
                }
                if (!this.Mr || type == null || type == this.Hw.Xa() || type == this.Hw.WB()) {
                    return;
                }
                if (type.isClassType() && ((ClassType) type).sT()) {
                    try {
                        type = ((ClassType) type).Bx();
                    } catch (e4 unused) {
                    }
                }
                int iX9 = this.v5.x9(this.v5.getStartLine(i), this.v5.getStartColumn(i), this.v5.getEndLine(i), this.v5.getEndColumn(i));
                if (iX9 != -1) {
                    String str = "Create variable '" + type.getNameString() + " " + this.v5.getIdentifierString(i) + "'";
                    int identifier = this.v5.getIdentifier(i);
                    if (this.v5.getChildCount(iX9) > 0) {
                        int childNode = this.v5.getChildNode(iX9, 0);
                        this.j6.XL(this.v5.getFile(), this.v5.getLanguage(), this.v5.getStartLine(iX9), this.v5.getStartColumn(iX9), (this.v5.getSyntaxTag(this.v5.getParentNode(childNode)) == 146 && this.v5.getSyntaxTag(childNode) == 172 && this.v5.getSyntaxTag(this.v5.getChildNode(childNode, 1)) == 17 && this.v5.getChildNode(childNode, 0) == this.v5.getParentNode(i)) ? -1 : identifier, type, str);
                    }
                }
            } catch (Throwable th) {
                Type type2 = type;
                if (gW) {
                    iy.Mr(th, -1266922768991144580L, this, new Integer(i), type2);
                }
                throw th;
            }
        }

        @ey(method = -3270822215840272169L)
        private void cb() {
            try {
                if (yS) {
                    iy.gn(-3329708400832843020L, this);
                }
                if (this.Mr) {
                    this.j6.gn(this.v5.getFile(), this.v5.getLanguage(), "Generify the whole project");
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.aM(th, -3329708400832843020L, this);
                }
                throw th;
            }
        }

        @ey(method = 1336318341244427559L)
        private void cc(int i) {
            try {
                if (yS) {
                    iy.u7(-519398484305996352L, this, i);
                }
                int childCount = this.v5.getChildCount(i);
                if (childCount > 2) {
                    for (int i2 = 1; i2 < childCount; i2 += 4) {
                        try {
                            int i3 = i2 + 1;
                            if (!this.Hw.iW(om(this.v5.getChildNode(i, i3)))) {
                                Qq(this.v5.getChildNode(i, i3), "An argument type must be a reference type");
                            }
                        } catch (e4 unused) {
                        }
                    }
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, -519398484305996352L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -6311598995056186845L)
        private void ce(int i) {
            try {
                if (yS) {
                    iy.u7(-2255462745848730744L, this, i);
                }
                int childCount = this.v5.getChildCount(i);
                if (childCount > 2) {
                    for (int i2 = 1; i2 < childCount - 1; i2 += 2) {
                        int childNode = this.v5.getChildNode(i, i2);
                        if (this.v5.getSyntaxTag(childNode) != 16) {
                            int childNode2 = this.v5.getChildNode(childNode, 3);
                            Type typeCU = null;
                            try {
                                wE(this.v5.getChildNode(childNode, 0));
                                typeCU = CU(CU(om(this.v5.getChildNode(childNode, 1)), this.v5.getChildNode(childNode, 2)), this.v5.getChildNode(childNode, 4));
                                this.v5.declareAttrType(childNode2, typeCU);
                                this.v5.declareAttrReferenceKind(childNode2, 32, childNode2);
                            } catch (e4 unused) {
                            }
                            try {
                                this.gn.tp(this.v5.getIdentifier(childNode2), childNode2, typeCU);
                            } catch (c4 unused2) {
                                sy(childNode2, "There already is another parameter named </C>" + this.v5.getIdentifierString(childNode2) + "<//C>");
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, -2255462745848730744L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 394600384480123455L)
        private void cn(int i, int i2) {
            try {
                if (yS) {
                    iy.EQ(-1885143782509588380L, this, new Integer(i), new Integer(i2));
                }
                if (this.Mr) {
                    this.j6.Ws(this.v5.getFile(), this.v5.getLanguage(), this.v5.getStartLine(i), this.v5.getStartColumn(i), this.v5.getEndLine(i2), this.v5.getEndColumn(i2), "", "Delete");
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.Mr(th, -1885143782509588380L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @ey(method = 732494242604830980L)
        private void ct(int i, boolean z, boolean z2) {
            try {
                if (yS) {
                    iy.we(124633870543031535L, this, new Integer(i), new Boolean(z), new Boolean(z2));
                }
                int parentNode = this.v5.getParentNode(this.v5.getParentNode(this.v5.getParentNode(i)));
                if (!z) {
                    parentNode = this.v5.getParentNode(parentNode);
                }
                if (z2) {
                    int parentNode2 = this.v5.getParentNode(i);
                    int childCount = this.v5.getChildCount(parentNode2);
                    for (int i2 = 0; i2 < childCount; i2++) {
                        if (this.v5.getSyntaxTag(this.v5.getChildNode(parentNode2, i2)) == 75) {
                            return;
                        }
                    }
                }
                int syntaxTag = this.v5.getSyntaxTag(parentNode);
                if (syntaxTag == 128 || syntaxTag == 177) {
                    if (z) {
                        aj(i, "Unexpected </C>interface<//C>");
                        ro(parentNode);
                        return;
                    } else {
                        aj(i, "Unexpected modifier");
                        ro(i);
                        return;
                    }
                }
                if (syntaxTag != 227) {
                    return;
                }
                try {
                    if (!this.FH.getClasstype(this.v5.getFile(), this.v5.getLanguage(), this.v5.getDeclarationNumber(parentNode)).pl()) {
                        if (z) {
                            aj(i, "Unexpected </C>interface<//C>");
                            ro(parentNode);
                        } else {
                            aj(i, "Unexpected modifier");
                            ro(i);
                        }
                    }
                } catch (e4 unused) {
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.U2(th, 124633870543031535L, this, new Integer(i), new Boolean(z), new Boolean(z2));
                }
                throw th;
            }
        }

        @ey(method = -3788224848618153504L)
        private void d8(int i) {
            Type typeCU;
            Type typeCU2;
            Type type;
            int syntaxTag;
            try {
                if (yS) {
                    iy.u7(6765859692681808919L, this, i);
                }
                int i2 = 212;
                if (this.Mr && (syntaxTag = this.v5.getSyntaxTag(this.v5.getParentNode(i))) != 133 && syntaxTag != 201 && syntaxTag != 212) {
                    aj(i, "Unexpected variable declaration");
                    ro(i);
                }
                int i3 = 0;
                int iWE = wE(this.v5.getChildNode(i, 0));
                int i4 = 2;
                int i5 = 1;
                try {
                    typeCU = CU(om(this.v5.getChildNode(i, 1)), this.v5.getChildNode(i, 2));
                } catch (e4 unused) {
                    typeCU = null;
                }
                int childCount = this.v5.getChildCount(i);
                int i6 = 3;
                while (i6 < childCount) {
                    int childNode = this.v5.getChildNode(i, i6);
                    int childNode2 = this.v5.getChildNode(childNode, i3);
                    if (typeCU != null) {
                        typeCU2 = CU(typeCU, this.v5.getChildNode(childNode, i5));
                        this.v5.declareAttrReferenceKind(childNode2, i5, childNode2);
                        this.v5.declareAttrType(childNode2, typeCU2);
                        try {
                            if (this.v5.getSyntaxTag(this.v5.getParentNode(i)) == i2 && !typeCU.isImplicitConvertibleTo(this.v5.getFile(), this.v5.getLanguage(), this.Hw.cb(this.v5.getFile()))) {
                                Qq(this.v5.getChildNode(i, i5), "Resource must implement java.lang.AutoCloseable");
                            }
                        } catch (e4 unused2) {
                        }
                    } else {
                        typeCU2 = null;
                    }
                    try {
                        this.gn.tp(this.v5.getIdentifier(childNode2), childNode2, typeCU2);
                    } catch (c4 unused3) {
                        sy(childNode2, "There already is another variable named </C>" + this.v5.getIdentifierString(childNode2) + "<//C>");
                    }
                    if (this.v5.getChildCount(childNode) > i4) {
                        int childNode3 = this.v5.getChildNode(childNode, 3);
                        if (typeCU2 == null || this.v5.getSyntaxTag(childNode3) != 196) {
                            fY(childNode3, typeCU2);
                            if (typeCU2 != null && this.v5.hasAttrType(childNode3)) {
                                Type attrType = this.v5.getAttrType(childNode3);
                                try {
                                    if (this.v5.hasAttrValue(childNode3)) {
                                        this.Hw.yS(this.v5.getFile(), 22, typeCU2, attrType, this.v5.getAttrValue(childNode3));
                                        if (this.a8 && y1.Hw(iWE)) {
                                            type = typeCU;
                                            try {
                                                this.gn.EQ(childNode2, this.FH.XX(this.v5.getFile(), this.v5.getLanguage(), this.v5.getAttrValue(childNode3), attrType, typeCU2));
                                            } catch (e4 unused4) {
                                                sy(childNode, "An instance of type </C>" + attrType.getFullyQualifiedNameString() + "<//C> can not be assigned to a variable of type </C>" + typeCU2.getFullyQualifiedNameString() + "<//C>");
                                                KD(childNode3, typeCU2, attrType);
                                                i6 += 2;
                                                typeCU = type;
                                                i2 = 212;
                                                i3 = 0;
                                                i4 = 2;
                                                i5 = 1;
                                            }
                                        } else {
                                            type = typeCU;
                                        }
                                    } else {
                                        type = typeCU;
                                        this.Hw.er(this.v5.getFile(), 22, typeCU2, attrType);
                                    }
                                    if (this.U2 && !((JavaSyntax) this.v5.getLanguage().getSyntax()).FN(this.v5, childNode3) && this.Hw.pO(this.v5.getFile(), attrType, typeCU2)) {
                                        OW(childNode, "This assignment is unsafe because an instance of type </C>" + attrType.getFullyQualifiedNameString() + "<//C> may not be of type </C>" + typeCU2.getFullyQualifiedNameString() + "<//C>");
                                        cb();
                                    }
                                } catch (e4 unused5) {
                                    type = typeCU;
                                }
                            }
                        } else {
                            et(childNode3, typeCU2);
                        }
                        type = typeCU;
                    } else {
                        type = typeCU;
                    }
                    i6 += 2;
                    typeCU = type;
                    i2 = 212;
                    i3 = 0;
                    i4 = 2;
                    i5 = 1;
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, 6765859692681808919L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -4540100816740050760L)
        private void dW(int i) {
            try {
                if (yS) {
                    iy.u7(-55380774175922115L, this, i);
                }
                if (this.v5.getChildCount(i) <= 1) {
                    this.v5.declareAttrType(i, this.gn.U2().u9());
                    if (!this.Mr || this.gn.gW(this.gn.U2())) {
                        return;
                    }
                    Qq(i, "There is no such reference available here");
                    return;
                }
                try {
                    Type typeX9 = om(this.v5.getChildNode(i, 0)).x9();
                    if (typeX9.isClassType()) {
                        this.v5.declareAttrType(i, ((ClassType) typeX9).u9());
                        if (this.Mr && !this.gn.gW(typeX9)) {
                            Qq(i, "There is no such reference available here");
                        }
                    } else {
                        Qq(this.v5.getChildNode(i, 0), "Invalid type");
                    }
                } catch (e4 unused) {
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, -55380774175922115L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -1409333668752727575L)
        private void dx(int i, ClassType classType) {
            try {
                if (yS) {
                    iy.EQ(1631714150571418440L, this, new Integer(i), classType);
                }
                if (this.Mr) {
                    this.j6.u7(this.v5.getFile(), this.v5.getLanguage(), this.v5.getEndLine(i), this.v5.getEndColumn(i), "Implement all abstract methods");
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.Mr(th, 1631714150571418440L, this, new Integer(i), classType);
                }
                throw th;
            }
        }

        @ey(method = -114569405515996224L)
        private int e3(int i) {
            try {
                if (yS) {
                    iy.u7(9008064133115033413L, this, i);
                }
                return ys(i, 833, false, true, true, false, true) | 1 | 512 | 256 | 64;
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, 9008064133115033413L, this, new Integer(i));
                }
                throw th;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:199:0x01ee A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0067 A[Catch: all -> 0x04fe, TryCatch #8 {all -> 0x04fe, blocks: (B:3:0x0009, B:5:0x000d, B:6:0x0010, B:16:0x003c, B:18:0x0054, B:30:0x00c3, B:32:0x00cc, B:34:0x010c, B:36:0x011e, B:38:0x0124, B:39:0x0137, B:42:0x0145, B:44:0x014f, B:46:0x015b, B:48:0x0161, B:50:0x0171, B:52:0x018d, B:53:0x019a, B:55:0x01a2, B:57:0x01aa, B:58:0x01b7, B:60:0x01bf, B:71:0x01ee, B:63:0x01cf, B:65:0x01d5, B:74:0x0223, B:77:0x0229, B:80:0x0237, B:81:0x0242, B:83:0x024a, B:85:0x0275, B:87:0x0287, B:88:0x02a1, B:90:0x02af, B:91:0x02ba, B:93:0x02c2, B:95:0x02ec, B:97:0x02fd, B:98:0x0317, B:100:0x0325, B:101:0x032f, B:103:0x0337, B:105:0x0361, B:107:0x0372, B:108:0x038c, B:110:0x0390, B:112:0x0396, B:113:0x03a2, B:115:0x03aa, B:117:0x03b9, B:118:0x03cb, B:119:0x03e3, B:121:0x03f0, B:125:0x0416, B:128:0x0425, B:130:0x0435, B:133:0x043c, B:136:0x0443, B:138:0x0449, B:140:0x0452, B:142:0x045a, B:143:0x0460, B:144:0x0466, B:146:0x046c, B:148:0x0472, B:151:0x047f, B:153:0x048d, B:154:0x0492, B:157:0x04a9, B:167:0x04f8, B:163:0x04db, B:164:0x04e9, B:166:0x04ed, B:19:0x0067, B:21:0x0077, B:24:0x007e, B:26:0x008c, B:27:0x00a3, B:29:0x00b1), top: B:195:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:73:0x021f  */
        @abcd.ey(method = 4808280135903726976L)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void e9(int r18) {
            /*
                Method dump skipped, instructions count: 1310
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.java.JavaCodeAnalyzer.a.e9(int):void");
        }

        @ey(method = -2571914944002000275L)
        private void eN(int i, String str, int i2) {
            try {
                if (yS) {
                    iy.we(1879271125059938016L, this, new Integer(i), str, new Integer(i2));
                }
                if (this.U2) {
                    int endColumn = this.v5.getEndColumn(i);
                    if ((this.v5.getSyntaxTag(i) == 8 || (!this.v5.getLanguage().getSyntax().tp(this.v5.getSyntaxTag(i)) && this.v5.getChildCount(i) == 0)) && this.v5.getStartLine(i) == this.v5.getEndLine(i) && endColumn <= this.v5.getStartColumn(i) + 1) {
                        endColumn = this.v5.getStartColumn(i) + 2;
                    }
                    if (this.v5.getStartLine(i) == this.v5.getEndLine(i) && endColumn <= this.v5.getStartColumn(i) + 1) {
                        endColumn = this.v5.getStartColumn(i) + 1;
                    }
                    this.j6.lg(this.v5.getFile(), this.v5.getLanguage(), this.v5.getStartLine(i), this.v5.getStartColumn(i), this.v5.getEndLine(i), endColumn, str, i2);
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.U2(th, 1879271125059938016L, this, new Integer(i), str, new Integer(i2));
                }
                throw th;
            }
        }

        @ey(method = 2760077314714157089L)
        private void eU(int i) {
            try {
                if (yS) {
                    iy.u7(6305973654633550656L, this, i);
                }
                this.v5.declareAttrType(i, this.Hw.ro());
                if (this.a8) {
                    try {
                        this.v5.j3(i, this.Hw.e9(this.v5.getLiteralString(i)));
                        if (this.Mr && this.v5.getLiteralString(i).equals("2147483648")) {
                            if (this.v5.getSyntaxTag(this.v5.getParentNode(i)) == 170 && this.v5.getSyntaxTag(this.v5.getChildNode(this.v5.getParentNode(i), 0)) == 27) {
                                return;
                            }
                            aj(i, "Invalid literal");
                        }
                    } catch (e4 unused) {
                        if (this.Mr) {
                            aj(i, "Invalid literal");
                        }
                    }
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, 6305973654633550656L, this, new Integer(i));
                }
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @ey(method = 3312976551215461577L)
        public void ef(int i) {
            int startLine;
            int startColumn;
            try {
                if (yS) {
                    iy.u7(-477966827846133864L, this, i);
                }
                if (this.Mr) {
                    if (this.v5.getSyntaxTag(this.v5.getParentNode(i)) == 200) {
                        startLine = this.v5.getStartLine(this.v5.getParentNode(this.v5.getParentNode(i)));
                        startColumn = this.v5.getStartColumn(this.v5.getParentNode(this.v5.getParentNode(i)));
                    } else if (this.v5.getSyntaxTag(this.v5.getParentNode(i)) == 211) {
                        startLine = this.v5.getStartLine(this.v5.getChildNode(this.v5.getParentNode(i), 3));
                        startColumn = this.v5.getStartColumn(this.v5.getChildNode(this.v5.getParentNode(i), 3));
                    } else {
                        startLine = this.v5.getStartLine(this.v5.getParentNode(i));
                        startColumn = this.v5.getStartColumn(this.v5.getParentNode(i));
                    }
                    int i2 = startLine;
                    int i3 = startColumn;
                    this.j6.Ws(this.v5.getFile(), this.v5.getLanguage(), i2, i3, i2, i3, "final ", "Make final");
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, -477966827846133864L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -4121696175834449875L)
        private SetOf<Member> ei() {
            try {
                if (yS) {
                    iy.gn(4059149204811804432L, this);
                }
                return this.u7.empty() ? new SetOf<>(this.FH) : this.u7.pop();
            } catch (Throwable th) {
                if (gW) {
                    iy.aM(th, 4059149204811804432L, this);
                }
                throw th;
            }
        }

        @ey(method = -3938093898767813824L)
        private void et(int i, Type type) {
            try {
                if (yS) {
                    iy.EQ(2221266391024108559L, this, new Integer(i), type);
                }
                int childCount = this.v5.getChildCount(i);
                if (!type.isArrayType()) {
                    Qq(i, "Unexpected array");
                    return;
                }
                Type elementType = ((ArrayType) type).getElementType();
                for (int i2 = 1; i2 < childCount; i2 += 2) {
                    int childNode = this.v5.getChildNode(i, i2);
                    if (this.v5.getSyntaxTag(childNode) == 196) {
                        et(childNode, elementType);
                    } else if (this.v5.getSyntaxTag(childNode) == 231) {
                        try {
                            try {
                                this.Hw.er(this.v5.getFile(), 22, elementType, kQ(childNode));
                            } catch (e4 unused) {
                                Qq(childNode, "Illegal array element");
                            }
                        } catch (e4 unused2) {
                        }
                    } else if (this.v5.getSyntaxTag(childNode) != 9) {
                        fY(childNode, elementType);
                        if (this.Mr && this.v5.hasAttrType(childNode)) {
                            try {
                                if (this.v5.hasAttrValue(childNode)) {
                                    this.Hw.yS(this.v5.getFile(), 22, elementType, this.v5.getAttrType(childNode), this.v5.getAttrValue(childNode));
                                } else {
                                    this.Hw.er(this.v5.getFile(), 22, elementType, this.v5.getAttrType(childNode));
                                }
                            } catch (e4 unused3) {
                                Qq(childNode, "Illegal array element");
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.Mr(th, 2221266391024108559L, this, new Integer(i), type);
                }
                throw th;
            }
        }

        @ey(method = 1267228886222774760L)
        private int fN(int i) {
            try {
                if (yS) {
                    iy.u7(-5281292049909443675L, this, i);
                }
                return ys(i, 24704, true, false, false, false, false);
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, -5281292049909443675L, this, new Integer(i));
                }
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @ey(method = 817418712575108205L)
        public void fY(int i, Type type) {
            try {
                if (yS) {
                    iy.EQ(-1929850270494806508L, this, new Integer(i), type);
                }
                int syntaxTag = this.v5.getSyntaxTag(i);
                if (syntaxTag == 66) {
                    this.v5.declareAttrType(i, this.Hw.Xa());
                    return;
                }
                if (syntaxTag == 68) {
                    this.v5.declareAttrType(i, this.Hw.gW());
                    if (this.a8) {
                        this.v5.j3(i, this.FH.x9(true));
                        return;
                    }
                    return;
                }
                if (syntaxTag == 74) {
                    this.v5.declareAttrType(i, this.Hw.gW());
                    if (this.a8) {
                        this.v5.j3(i, this.FH.x9(false));
                        return;
                    }
                    return;
                }
                if (syntaxTag == 159) {
                    zh(i, type);
                    return;
                }
                switch (syntaxTag) {
                    case 2:
                        sT(i);
                        return;
                    case 3:
                        FN(i);
                        return;
                    case 4:
                        eU(i);
                        return;
                    case 5:
                        Cz(i);
                        return;
                    case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                        hK(i);
                        return;
                    case UserTouchAction.CLICK_KIND /* 7 */:
                        jw(i);
                        return;
                    default:
                        switch (syntaxTag) {
                            case 155:
                                oy(i, type);
                                return;
                            case 156:
                                gG(i, type);
                                return;
                            case 157:
                                hp(i, type);
                                return;
                            default:
                                switch (syntaxTag) {
                                    case ProxyTextView.INPUTTYPE_textWebEditText /* 161 */:
                                        IS(i, type);
                                        return;
                                    case 162:
                                        xg(i, type);
                                        return;
                                    case 163:
                                        GK(i);
                                        return;
                                    case 164:
                                        E4(i);
                                        return;
                                    case 165:
                                        jJ(i, type);
                                        return;
                                    case 166:
                                        dW(i);
                                        return;
                                    case 167:
                                        jO(i);
                                        return;
                                    case 168:
                                        Jm(i, type);
                                        return;
                                    case 169:
                                        aq(i, type);
                                        return;
                                    case 170:
                                        oa(i, type);
                                        return;
                                    case 171:
                                        Bx(i, type);
                                        return;
                                    case 172:
                                        Q6(i);
                                        return;
                                    case 173:
                                        iW(i);
                                        return;
                                    default:
                                        switch (syntaxTag) {
                                            case 175:
                                                wc(i);
                                                return;
                                            case 176:
                                                Za(i);
                                                return;
                                            case ProxyTextView.INPUTTYPE_textFilter /* 177 */:
                                                yO(i);
                                                return;
                                            case 178:
                                                Lz(i);
                                                return;
                                            default:
                                                return;
                                        }
                                }
                        }
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.Mr(th, -1929850270494806508L, this, new Integer(i), type);
                }
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @ey(method = -4253193266909751296L)
        public void g3(int i, Type type) {
            try {
                if (yS) {
                    iy.EQ(2923820611238572815L, this, new Integer(i), type);
                }
                if (!this.Mr || type == null || type.getSemantic() == 1 || type.getSemantic() == 2) {
                    return;
                }
                int iX9 = this.v5.x9(this.v5.getStartLine(i), this.v5.getStartColumn(i), this.v5.getEndLine(i), this.v5.getEndColumn(i));
                int methodNodeAt = this.v5.getMethodNodeAt(this.v5.getStartLine(i), this.v5.getStartColumn(i), this.v5.getEndLine(i), this.v5.getEndColumn(i));
                if (iX9 == -1 || methodNodeAt == -1) {
                    return;
                }
                this.j6.J0(this.v5.getFile(), this.v5.getLanguage(), this.v5.getStartLine(iX9), this.v5.getStartColumn(iX9), this.v5.getIdentifier(i), type, "Create parameter '" + type.getNameString() + " " + this.v5.getIdentifierString(i) + "'");
            } catch (Throwable th) {
                if (gW) {
                    iy.Mr(th, 2923820611238572815L, this, new Integer(i), type);
                }
                throw th;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
        @abcd.ey(method = -2726737688264664583L)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void gG(int r16, com.aide.codemodel.api.Type r17) {
            /*
                Method dump skipped, instructions count: 284
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.java.JavaCodeAnalyzer.a.gG(int, com.aide.codemodel.api.Type):void");
        }

        @ey(method = -404674883334764620L)
        private void hK(int i) {
            try {
                if (yS) {
                    iy.u7(66441917469360901L, this, i);
                }
                this.v5.declareAttrType(i, this.Hw.KD());
                if (this.a8) {
                    try {
                        this.v5.j3(i, this.Hw.aX(this.v5.getLiteralString(i)));
                    } catch (e4 unused) {
                        if (this.Mr) {
                            aj(i, "Invalid literal");
                        }
                    }
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, 66441917469360901L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 3306678753762455477L)
        private void hp(int i, Type type) throws Throwable {
            int i2;
            Type typeX9;
            int childNode;
            try {
                if (yS) {
                    try {
                        iy.EQ(-1090369284797359512L, this, new Integer(i), type);
                    } catch (Throwable th) {
                        th = th;
                        if (gW) {
                            iy.Mr(th, -1090369284797359512L, this, new Integer(i), type);
                        }
                        throw th;
                    }
                }
                if (this.v5.getChildCount(i) <= 5) {
                    int childNode2 = this.v5.getChildNode(i, 3);
                    pN(i, childNode2, this.v5.getChildNode(i, 4), this.v5.getChildNode(i, 2), this.gn.rN(), true, false, type);
                    if (this.Mr && this.v5.sh(childNode2) == 20 && y1.j6(this.v5.getAttrReferenceEntity(childNode2).getModifiers())) {
                        Qq(i, "Illegal call of abstract method");
                    }
                    if (!this.Mr || this.gn.gW(this.gn.U2())) {
                        return;
                    }
                    Qq(this.v5.getChildNode(i, 0), "There is no such reference available here");
                    return;
                }
                try {
                    typeX9 = om(this.v5.getChildNode(i, 0)).x9();
                    childNode = this.v5.getChildNode(i, 5);
                    i2 = 0;
                } catch (e4 unused) {
                    i2 = 0;
                }
                try {
                    pN(i, childNode, this.v5.getChildNode(i, 6), this.v5.getChildNode(i, 4), ((ClassType) typeX9).u9(), true, false, type);
                    if (this.Mr && this.v5.sh(childNode) == 20 && y1.j6(this.v5.getAttrReferenceEntity(childNode).getModifiers())) {
                        Qq(i, "Illegal call of abstract method");
                    }
                    if (!this.Mr || this.gn.gW(typeX9)) {
                        return;
                    }
                    Qq(this.v5.getChildNode(i, 0), "There is no such reference available here");
                } catch (e4 unused2) {
                    if (this.Mr) {
                        Qq(this.v5.getChildNode(i, i2), "There is no such reference available here");
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @ey(method = -1150647070049541565L)
        private void hz(int i) {
            try {
                if (yS) {
                    iy.u7(892173086069015100L, this, i);
                }
                int parentNode = this.v5.getParentNode(this.v5.getParentNode(i));
                if (this.v5.getSyntaxTag(parentNode) != 147) {
                    Qq(this.v5.getChildNode(i, 0), "Unexpected </C>case<//C>");
                    ro(i);
                    return;
                }
                if (this.v5.hasAttrType(this.v5.getChildNode(parentNode, 2))) {
                    Type attrType = this.v5.getAttrType(this.v5.getChildNode(parentNode, 2));
                    try {
                        if (attrType == this.Hw.yO(this.v5.getFile())) {
                            fY(this.v5.getChildNode(i, 1), this.Hw.yO(this.v5.getFile()));
                            int childNode = this.v5.getChildNode(i, 1);
                            while (this.v5.getSyntaxTag(childNode) == 168) {
                                childNode = this.v5.getChildNode(childNode, 1);
                            }
                            if (this.v5.getSyntaxTag(childNode) == 2) {
                                return;
                            }
                            if (this.v5.getSyntaxTag(childNode) != 161) {
                                Qq(this.v5.getChildNode(i, 1), "This is not a valid case");
                                return;
                            }
                            int childNode2 = this.v5.getChildNode(childNode, this.v5.getChildCount(childNode) - 1);
                            if (this.v5.sh(childNode2) == 16 && ((Member) this.v5.getAttrReferenceEntity(childNode2)).q7()) {
                                return;
                            }
                            Qq(this.v5.getChildNode(i, 1), "This is not a valid case");
                            return;
                        }
                        if (attrType.isEnumType()) {
                            int childNode3 = this.v5.getChildNode(i, 1);
                            while (this.v5.getSyntaxTag(childNode3) == 168) {
                                childNode3 = this.v5.getChildNode(childNode3, 1);
                            }
                            if (this.v5.getSyntaxTag(childNode3) != 161 || this.v5.getChildCount(childNode3) != 1) {
                                Qq(this.v5.getChildNode(i, 1), "This is not a valid case");
                                return;
                            } else {
                                k2(this.v5.getChildNode(i, 1), this.v5.getChildNode(childNode3, 0), attrType, false, true, attrType, true, true);
                                return;
                            }
                        }
                        fY(this.v5.getChildNode(i, 1), this.Hw.ro());
                        if (this.Mr && this.v5.hasAttrType(this.v5.getChildNode(i, 1))) {
                            Type attrType2 = this.v5.getAttrType(this.v5.getChildNode(i, 1));
                            if (!this.v5.hasAttrValue(this.v5.getChildNode(i, 1))) {
                                Qq(this.v5.getChildNode(i, 1), "A case must be constant");
                                return;
                            }
                            try {
                                this.Hw.yS(this.v5.getFile(), 22, attrType, attrType2, this.v5.getAttrValue(this.v5.getChildNode(i, 1)));
                            } catch (e4 unused) {
                                Qq(this.v5.getChildNode(i, 1), "This is not a valid case");
                            }
                        }
                    } catch (e4 unused2) {
                    }
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, 892173086069015100L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 6410979377831008531L)
        private void iW(int i) {
            try {
                if (yS) {
                    iy.u7(-6169892959029308896L, this, i);
                }
                fY(this.v5.getChildNode(i, 0), null);
                try {
                    Type typeCU = CU(om(this.v5.getChildNode(i, 2)), this.v5.getChildNode(i, 3));
                    if (this.v5.hasAttrType(this.v5.getChildNode(i, 0))) {
                        Type attrType = this.v5.getAttrType(this.v5.getChildNode(i, 0));
                        if (!attrType.yO(this.v5.getFile(), this.v5.getLanguage(), typeCU)) {
                            sy(i, "An instance of type </C>" + this.v5.getAttrType(this.v5.getChildNode(i, 0)).getFullyQualifiedNameString() + "<//C> can not be of type </C>" + typeCU.getFullyQualifiedNameString() + "<//C>");
                        } else if (this.Hw.sg(this.v5.getFile(), attrType, typeCU)) {
                            lp(this.v5.getChildNode(i, 0), this.v5.getChildNode(i, 3), "It is not possible to check at runtime wether an instance of type </C>" + attrType.getFullyQualifiedNameString() + "<//C> is of type </C>" + typeCU.getFullyQualifiedNameString() + "<//C>");
                        }
                    }
                } catch (e4 unused) {
                }
                this.v5.declareAttrType(i, this.Hw.gW());
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, -6169892959029308896L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 2049786221732450688L)
        private void jJ(int i, Type type) {
            int semantic;
            try {
                if (yS) {
                    iy.EQ(-689944127048513095L, this, new Integer(i), type);
                }
                if (!this.Mr || type == null) {
                    fY(this.v5.getChildNode(i, 0), null);
                } else {
                    fY(this.v5.getChildNode(i, 0), this.FH.hz(type, 1));
                }
                if (this.v5.hasAttrType(this.v5.getChildNode(i, 0))) {
                    Type attrType = this.v5.getAttrType(this.v5.getChildNode(i, 0));
                    if (!attrType.isArrayType()) {
                        Qq(i, "</C>" + this.v5.getAttrType(this.v5.getChildNode(i, 0)).getFullyQualifiedNameString() + "<//C> is not an array type");
                        cn(this.v5.getChildNode(i, 1), this.v5.getChildNode(i, 3));
                        return;
                    }
                    this.v5.declareAttrType(i, ((ArrayType) attrType).getElementType());
                    int childCount = this.v5.getChildCount(i);
                    if (this.Mr) {
                        int i2 = (childCount - 2) / 2;
                        if (i2 > 1) {
                            Qq(i, "Rectangular arrays are not supported by this language");
                        }
                        if (i2 != ((ArrayType) attrType).jO()) {
                            Qq(i, "</C>" + attrType.getFullyQualifiedNameString() + "<//C> has " + ((ArrayType) attrType).jO() + " dimensions");
                        }
                    }
                    for (int i3 = 2; i3 < childCount; i3 += 2) {
                        fY(this.v5.getChildNode(i, i3), this.Hw.ro());
                        if (this.v5.hasAttrType(this.v5.getChildNode(i, i3)) && (semantic = this.v5.getAttrType(this.v5.getChildNode(i, i3)).getSemantic()) != 3 && semantic != 4 && semantic != 5 && semantic != 7 && semantic != 12 && !this.Hw.sE(this.v5.getFile(), this.v5.getAttrType(this.v5.getChildNode(i, i3)), this.Hw.ro())) {
                            Qq(this.v5.getChildNode(i, i3), "An index must be of type </C>int<//C>");
                        }
                    }
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.Mr(th, -689944127048513095L, this, new Integer(i), type);
                }
                throw th;
            }
        }

        @ey(method = 273848192993230908L)
        private void jO(int i) {
            try {
                if (yS) {
                    iy.u7(-21576015497239791L, this, i);
                }
                try {
                    if (this.Mr) {
                        this.v5.declareAttrVariableSlot(i, this.gn.FH(1));
                    }
                    Type typeCU = CU(QO(this.v5.getChildNode(i, 0)), this.v5.getChildNode(i, 1));
                    if (typeCU.isMethodParameterType() || typeCU.isParameterType()) {
                        Qq(this.v5.getChildNode(i, 0), "Cannot take class literal from a type variable");
                    }
                    try {
                        int semantic = typeCU.getSemantic();
                        if (semantic == 1) {
                            typeCU = this.Hw.jJ(this.v5.getFile());
                        } else if (semantic == 3) {
                            typeCU = this.Hw.sG(this.v5.getFile());
                        } else if (semantic == 5) {
                            typeCU = this.Hw.kQ(this.v5.getFile());
                        } else if (semantic == 7) {
                            typeCU = this.Hw.Qq(this.v5.getFile());
                        } else if (semantic != 9) {
                            switch (semantic) {
                                case 11:
                                    typeCU = this.Hw.dx(this.v5.getFile());
                                    break;
                                case 12:
                                    typeCU = this.Hw.ef(this.v5.getFile());
                                    break;
                                case 13:
                                    typeCU = this.Hw.x9(this.v5.getFile());
                                    break;
                                case 14:
                                    typeCU = this.Hw.g3(this.v5.getFile());
                                    break;
                            }
                        } else {
                            typeCU = this.Hw.aj(this.v5.getFile());
                        }
                    } catch (e4 unused) {
                    }
                    this.v5.declareAttrType(i, this.Hw.Sf(this.v5.getFile()).ba(new Type[]{typeCU}, new int[]{0}));
                } catch (e4 unused2) {
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, -21576015497239791L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 590287192698175557L)
        private void jw(int i) {
            try {
                if (yS) {
                    iy.u7(-800337341260212288L, this, i);
                }
                this.v5.declareAttrType(i, this.Hw.SI());
                if (this.a8) {
                    try {
                        this.v5.j3(i, this.Hw.oy(this.v5.getLiteralString(i)));
                    } catch (e4 unused) {
                        if (this.Mr) {
                            aj(i, "Invalid literal");
                        }
                    }
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, -800337341260212288L, this, new Integer(i));
                }
                throw th;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:57:0x01d5  */
        /* JADX WARN: Type inference failed for: r22v0 */
        /* JADX WARN: Type inference failed for: r22v1 */
        /* JADX WARN: Type inference failed for: r22v3 */
        /* JADX WARN: Type inference failed for: r22v4 */
        /* JADX WARN: Type inference failed for: r22v6 */
        /* JADX WARN: Type inference failed for: r22v7, types: [boolean] */
        /* JADX WARN: Type inference failed for: r22v8 */
        @abcd.ey(method = -6343320044400670080L)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private boolean k2(int r28, int r29, com.aide.codemodel.api.Type r30, boolean r31, boolean r32, com.aide.codemodel.api.Type r33, boolean r34, boolean r35) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 531
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.java.JavaCodeAnalyzer.a.k2(int, int, com.aide.codemodel.api.Type, boolean, boolean, com.aide.codemodel.api.Type, boolean, boolean):boolean");
        }

        @ey(method = 1936953591866746492L)
        private Type kQ(int i) {
            try {
                if (yS) {
                    iy.u7(5589586927274825057L, this, i);
                }
                Type typeOd = Od(this.v5.getChildNode(i, 1));
                if (typeOd.isClassType() && this.Hw.qp(typeOd)) {
                    MapOfInt<Member> mapOfIntSM = ((ClassType) typeOd).sM();
                    int childCount = this.v5.getChildCount(i);
                    if (childCount >= 5) {
                        for (int i2 = 3; i2 < childCount; i2 += 4) {
                            int childNode = this.v5.getChildNode(i, i2);
                            int identifier = this.v5.getIdentifier(childNode);
                            if (mapOfIntSM.Zo(identifier) != 1) {
                                Qq(childNode, "Unknown attribute " + this.v5.getIdentifierString(childNode));
                            } else {
                                Member member = (Member) mapOfIntSM.gn(identifier);
                                Type typeWB = member.WB();
                                this.v5.declareAttrReferenceKind(childNode, 20, member);
                                Xa(this.v5.getChildNode(i, i2 + 2), typeWB);
                            }
                        }
                    }
                } else {
                    Qq(this.v5.getChildNode(i, 1), "Expected an annotation type");
                }
                return typeOd;
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, 5589586927274825057L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -4774082828047848635L)
        private int kf(int i) {
            try {
                if (yS) {
                    iy.u7(-3221087725998860748L, this, i);
                }
                return ys(i, 64, true, false, true, false, false);
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, -3221087725998860748L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 24506848034293968L)
        private void ko(int i) {
            try {
                if (yS) {
                    iy.u7(-5025659207126311611L, this, i);
                }
                Pa(this.v5.getChildNode(i, 0));
                int childCount = this.v5.getChildCount(i);
                for (int i2 = 1; i2 < childCount; i2++) {
                    int childNode = this.v5.getChildNode(i, i2);
                    int syntaxTag = this.v5.getSyntaxTag(childNode);
                    if (syntaxTag == 213) {
                        AR(childNode);
                    } else if (syntaxTag == 214) {
                        TI(childNode);
                    } else if (syntaxTag == 225) {
                        Z1(childNode);
                    } else if (syntaxTag == 226) {
                        n5(childNode);
                    }
                }
                for (int i3 = 1; i3 < childCount; i3++) {
                    int childNode2 = this.v5.getChildNode(i, i3);
                    if (this.v5.getSyntaxTag(childNode2) == 120 || this.v5.getSyntaxTag(childNode2) == 121 || this.v5.getSyntaxTag(childNode2) == 220) {
                        oY(this.v5.getChildNode(i, i3));
                    } else if (this.v5.getSyntaxTag(childNode2) == 245) {
                        mb(this.v5.getChildNode(i, i3));
                    }
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, -5025659207126311611L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -3715346238709638423L)
        private void lp(int i, int i2, String str) {
            try {
                if (yS) {
                    iy.we(2964416136579095904L, this, new Integer(i), new Integer(i2), str);
                }
                N0(i, i2, str, 47);
            } catch (Throwable th) {
                if (gW) {
                    iy.U2(th, 2964416136579095904L, this, new Integer(i), new Integer(i2), str);
                }
                throw th;
            }
        }

        @ey(method = 2635595894299638232L)
        private void mb(int i) {
            try {
                if (yS) {
                    iy.u7(4845699272036910403L, this, i);
                }
                try {
                    ClassType classtype = this.FH.getClasstype(this.v5.getFile(), this.v5.getLanguage(), this.v5.getDeclarationNumber(i));
                    this.gn.J0(classtype);
                    this.v5.declareAttrReferenceKind(this.v5.getChildNode(i, 4), 7, classtype);
                    QO(this.v5.getChildNode(i, 2));
                    this.gn.Ws(0, false, false);
                    ce(this.v5.getChildNode(i, 5));
                    this.gn.vJ();
                    this.gn.ef();
                } catch (e4 unused) {
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, 4845699272036910403L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 1216156434736986656L)
        private void n5(int i) {
            try {
                if (yS) {
                    iy.u7(-247652593526944125L, this, i);
                }
                Entity entityNw = this.Hw.nw();
                int childCount = this.v5.getChildCount(i);
                for (int i2 = 1; i2 < childCount - 2; i2 += 2) {
                    int childNode = this.v5.getChildNode(i, i2);
                    int identifier = this.v5.getIdentifier(childNode);
                    try {
                        entityNw = entityNw.isClassType() ? ((ClassType) entityNw).FN(identifier, true, 0, this.gn.lg(), this.v5.getFile(), this.v5.getLanguage()) : ((Namespace) entityNw).dx(this.v5.getFile(), this.v5.getLanguage(), identifier, true, 0, (Namespace) entityNw);
                        MP(childNode, entityNw);
                    } catch (b4 unused) {
                        sy(childNode, "Ambiguous type </C>" + this.v5.getIdentifierString(childNode) + "<//C>");
                        return;
                    } catch (e4 unused2) {
                        sy(childNode, "Unknown type or package </C>" + this.v5.getIdentifierString(childNode) + "<//C>");
                        if (entityNw.isNamespace()) {
                            vJ(childNode, (Namespace) entityNw);
                            return;
                        }
                        return;
                    }
                }
                if (entityNw.isClassType()) {
                    this.gn.ei((ClassType) entityNw);
                } else {
                    this.gn.nw((Namespace) entityNw);
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, -247652593526944125L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 1271038858317470389L)
        private void nw(int i, String str, int i2) {
            try {
                if (yS) {
                    iy.we(-281296330880893160L, this, new Integer(i), str, new Integer(i2));
                }
                if (this.Mr) {
                    int endColumn = this.v5.getEndColumn(i);
                    if ((this.v5.getSyntaxTag(i) == 8 || (!this.v5.getLanguage().getSyntax().tp(this.v5.getSyntaxTag(i)) && this.v5.getChildCount(i) == 0)) && this.v5.getStartLine(i) == this.v5.getEndLine(i) && endColumn <= this.v5.getStartColumn(i) + 1) {
                        endColumn = this.v5.getStartColumn(i) + 2;
                    }
                    if (this.v5.getStartLine(i) == this.v5.getEndLine(i) && endColumn <= this.v5.getStartColumn(i) + 1) {
                        endColumn = this.v5.getStartColumn(i) + 1;
                    }
                    int i3 = endColumn;
                    if (i2 == 20) {
                        this.j6.Mr(this.v5.getFile(), this.v5.getLanguage(), this.v5.getStartLine(i), this.v5.getStartColumn(i), this.v5.getEndLine(i), i3, str, i2);
                    } else {
                        this.j6.Hw(this.v5.getFile(), this.v5.getLanguage(), this.v5.getStartLine(i), this.v5.getStartColumn(i), this.v5.getEndLine(i), i3, str, i2);
                    }
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.U2(th, -281296330880893160L, this, new Integer(i), str, new Integer(i2));
                }
                throw th;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:327:0x067f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00d6 A[Catch: e4 -> 0x0738, all -> 0x0739, TryCatch #1 {e4 -> 0x0738, blocks: (B:6:0x0010, B:9:0x0043, B:14:0x0050, B:16:0x0056, B:17:0x007d, B:27:0x00a0, B:64:0x01a7, B:68:0x01bf, B:69:0x01c8, B:71:0x01d0, B:73:0x01d8, B:74:0x01e1, B:76:0x01e9, B:87:0x0219, B:79:0x01f8, B:81:0x01fe, B:89:0x023e, B:91:0x0243, B:93:0x024a, B:96:0x025e, B:97:0x028f, B:99:0x029d, B:100:0x02ce, B:102:0x02dc, B:103:0x030d, B:104:0x0318, B:106:0x032b, B:108:0x033a, B:116:0x0395, B:145:0x0412, B:148:0x042b, B:150:0x0435, B:153:0x0441, B:155:0x044b, B:157:0x0455, B:160:0x0461, B:182:0x04d7, B:278:0x06ed, B:280:0x06f1, B:282:0x0703, B:283:0x070f, B:285:0x071c, B:288:0x072e, B:287:0x0724, B:187:0x04f7, B:192:0x0512, B:217:0x0594, B:219:0x05a2, B:253:0x0670, B:142:0x03ff, B:144:0x040d, B:29:0x00a5, B:34:0x00c8, B:35:0x00cb, B:36:0x00d6, B:37:0x00e1, B:42:0x00fb, B:43:0x00fe, B:45:0x0113, B:47:0x0119, B:44:0x0109, B:48:0x012b, B:49:0x0136, B:51:0x0146, B:52:0x0157, B:56:0x016a, B:57:0x0174, B:61:0x0187, B:63:0x0197), top: B:310:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00e1 A[Catch: e4 -> 0x0738, all -> 0x0739, TryCatch #1 {e4 -> 0x0738, blocks: (B:6:0x0010, B:9:0x0043, B:14:0x0050, B:16:0x0056, B:17:0x007d, B:27:0x00a0, B:64:0x01a7, B:68:0x01bf, B:69:0x01c8, B:71:0x01d0, B:73:0x01d8, B:74:0x01e1, B:76:0x01e9, B:87:0x0219, B:79:0x01f8, B:81:0x01fe, B:89:0x023e, B:91:0x0243, B:93:0x024a, B:96:0x025e, B:97:0x028f, B:99:0x029d, B:100:0x02ce, B:102:0x02dc, B:103:0x030d, B:104:0x0318, B:106:0x032b, B:108:0x033a, B:116:0x0395, B:145:0x0412, B:148:0x042b, B:150:0x0435, B:153:0x0441, B:155:0x044b, B:157:0x0455, B:160:0x0461, B:182:0x04d7, B:278:0x06ed, B:280:0x06f1, B:282:0x0703, B:283:0x070f, B:285:0x071c, B:288:0x072e, B:287:0x0724, B:187:0x04f7, B:192:0x0512, B:217:0x0594, B:219:0x05a2, B:253:0x0670, B:142:0x03ff, B:144:0x040d, B:29:0x00a5, B:34:0x00c8, B:35:0x00cb, B:36:0x00d6, B:37:0x00e1, B:42:0x00fb, B:43:0x00fe, B:45:0x0113, B:47:0x0119, B:44:0x0109, B:48:0x012b, B:49:0x0136, B:51:0x0146, B:52:0x0157, B:56:0x016a, B:57:0x0174, B:61:0x0187, B:63:0x0197), top: B:310:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0109 A[Catch: e4 -> 0x0738, all -> 0x0739, TryCatch #1 {e4 -> 0x0738, blocks: (B:6:0x0010, B:9:0x0043, B:14:0x0050, B:16:0x0056, B:17:0x007d, B:27:0x00a0, B:64:0x01a7, B:68:0x01bf, B:69:0x01c8, B:71:0x01d0, B:73:0x01d8, B:74:0x01e1, B:76:0x01e9, B:87:0x0219, B:79:0x01f8, B:81:0x01fe, B:89:0x023e, B:91:0x0243, B:93:0x024a, B:96:0x025e, B:97:0x028f, B:99:0x029d, B:100:0x02ce, B:102:0x02dc, B:103:0x030d, B:104:0x0318, B:106:0x032b, B:108:0x033a, B:116:0x0395, B:145:0x0412, B:148:0x042b, B:150:0x0435, B:153:0x0441, B:155:0x044b, B:157:0x0455, B:160:0x0461, B:182:0x04d7, B:278:0x06ed, B:280:0x06f1, B:282:0x0703, B:283:0x070f, B:285:0x071c, B:288:0x072e, B:287:0x0724, B:187:0x04f7, B:192:0x0512, B:217:0x0594, B:219:0x05a2, B:253:0x0670, B:142:0x03ff, B:144:0x040d, B:29:0x00a5, B:34:0x00c8, B:35:0x00cb, B:36:0x00d6, B:37:0x00e1, B:42:0x00fb, B:43:0x00fe, B:45:0x0113, B:47:0x0119, B:44:0x0109, B:48:0x012b, B:49:0x0136, B:51:0x0146, B:52:0x0157, B:56:0x016a, B:57:0x0174, B:61:0x0187, B:63:0x0197), top: B:310:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0119 A[Catch: e4 -> 0x0738, all -> 0x0739, TryCatch #1 {e4 -> 0x0738, blocks: (B:6:0x0010, B:9:0x0043, B:14:0x0050, B:16:0x0056, B:17:0x007d, B:27:0x00a0, B:64:0x01a7, B:68:0x01bf, B:69:0x01c8, B:71:0x01d0, B:73:0x01d8, B:74:0x01e1, B:76:0x01e9, B:87:0x0219, B:79:0x01f8, B:81:0x01fe, B:89:0x023e, B:91:0x0243, B:93:0x024a, B:96:0x025e, B:97:0x028f, B:99:0x029d, B:100:0x02ce, B:102:0x02dc, B:103:0x030d, B:104:0x0318, B:106:0x032b, B:108:0x033a, B:116:0x0395, B:145:0x0412, B:148:0x042b, B:150:0x0435, B:153:0x0441, B:155:0x044b, B:157:0x0455, B:160:0x0461, B:182:0x04d7, B:278:0x06ed, B:280:0x06f1, B:282:0x0703, B:283:0x070f, B:285:0x071c, B:288:0x072e, B:287:0x0724, B:187:0x04f7, B:192:0x0512, B:217:0x0594, B:219:0x05a2, B:253:0x0670, B:142:0x03ff, B:144:0x040d, B:29:0x00a5, B:34:0x00c8, B:35:0x00cb, B:36:0x00d6, B:37:0x00e1, B:42:0x00fb, B:43:0x00fe, B:45:0x0113, B:47:0x0119, B:44:0x0109, B:48:0x012b, B:49:0x0136, B:51:0x0146, B:52:0x0157, B:56:0x016a, B:57:0x0174, B:61:0x0187, B:63:0x0197), top: B:310:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0136 A[Catch: e4 -> 0x0738, all -> 0x0739, TryCatch #1 {e4 -> 0x0738, blocks: (B:6:0x0010, B:9:0x0043, B:14:0x0050, B:16:0x0056, B:17:0x007d, B:27:0x00a0, B:64:0x01a7, B:68:0x01bf, B:69:0x01c8, B:71:0x01d0, B:73:0x01d8, B:74:0x01e1, B:76:0x01e9, B:87:0x0219, B:79:0x01f8, B:81:0x01fe, B:89:0x023e, B:91:0x0243, B:93:0x024a, B:96:0x025e, B:97:0x028f, B:99:0x029d, B:100:0x02ce, B:102:0x02dc, B:103:0x030d, B:104:0x0318, B:106:0x032b, B:108:0x033a, B:116:0x0395, B:145:0x0412, B:148:0x042b, B:150:0x0435, B:153:0x0441, B:155:0x044b, B:157:0x0455, B:160:0x0461, B:182:0x04d7, B:278:0x06ed, B:280:0x06f1, B:282:0x0703, B:283:0x070f, B:285:0x071c, B:288:0x072e, B:287:0x0724, B:187:0x04f7, B:192:0x0512, B:217:0x0594, B:219:0x05a2, B:253:0x0670, B:142:0x03ff, B:144:0x040d, B:29:0x00a5, B:34:0x00c8, B:35:0x00cb, B:36:0x00d6, B:37:0x00e1, B:42:0x00fb, B:43:0x00fe, B:45:0x0113, B:47:0x0119, B:44:0x0109, B:48:0x012b, B:49:0x0136, B:51:0x0146, B:52:0x0157, B:56:0x016a, B:57:0x0174, B:61:0x0187, B:63:0x0197), top: B:310:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0174 A[Catch: e4 -> 0x0738, all -> 0x0739, TryCatch #1 {e4 -> 0x0738, blocks: (B:6:0x0010, B:9:0x0043, B:14:0x0050, B:16:0x0056, B:17:0x007d, B:27:0x00a0, B:64:0x01a7, B:68:0x01bf, B:69:0x01c8, B:71:0x01d0, B:73:0x01d8, B:74:0x01e1, B:76:0x01e9, B:87:0x0219, B:79:0x01f8, B:81:0x01fe, B:89:0x023e, B:91:0x0243, B:93:0x024a, B:96:0x025e, B:97:0x028f, B:99:0x029d, B:100:0x02ce, B:102:0x02dc, B:103:0x030d, B:104:0x0318, B:106:0x032b, B:108:0x033a, B:116:0x0395, B:145:0x0412, B:148:0x042b, B:150:0x0435, B:153:0x0441, B:155:0x044b, B:157:0x0455, B:160:0x0461, B:182:0x04d7, B:278:0x06ed, B:280:0x06f1, B:282:0x0703, B:283:0x070f, B:285:0x071c, B:288:0x072e, B:287:0x0724, B:187:0x04f7, B:192:0x0512, B:217:0x0594, B:219:0x05a2, B:253:0x0670, B:142:0x03ff, B:144:0x040d, B:29:0x00a5, B:34:0x00c8, B:35:0x00cb, B:36:0x00d6, B:37:0x00e1, B:42:0x00fb, B:43:0x00fe, B:45:0x0113, B:47:0x0119, B:44:0x0109, B:48:0x012b, B:49:0x0136, B:51:0x0146, B:52:0x0157, B:56:0x016a, B:57:0x0174, B:61:0x0187, B:63:0x0197), top: B:310:0x0010 }] */
        @abcd.ey(method = -3605364155516801871L)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void oY(int r18) {
            /*
                Method dump skipped, instructions count: 1900
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.java.JavaCodeAnalyzer.a.oY(int):void");
        }

        @ey(method = 379928226499493681L)
        private void oa(int i, Type type) {
            int syntaxTag;
            try {
                if (yS) {
                    iy.EQ(-8795722488500374560L, this, new Integer(i), type);
                }
                if (type == null || type == this.Hw.WB()) {
                    fY(this.v5.getChildNode(i, 1), this.Hw.ro());
                } else {
                    fY(this.v5.getChildNode(i, 1), type);
                }
                if (this.Mr && ((syntaxTag = this.v5.getSyntaxTag(this.v5.getChildNode(i, 0))) == 22 || syntaxTag == 28)) {
                    a5(this.v5.getChildNode(i, 1), false);
                }
                if (this.v5.hasAttrType(this.v5.getChildNode(i, 1))) {
                    Type attrType = this.v5.getAttrType(this.v5.getChildNode(i, 1));
                    try {
                        this.v5.declareAttrType(i, this.Hw.Ev(this.v5.getFile(), ((JavaSyntax) this.v5.getLanguage().getSyntax()).et(this.v5.getSyntaxTag(this.v5.getChildNode(i, 0))), attrType));
                        if (this.a8) {
                            if (this.v5.hasAttrValue(this.v5.getChildNode(i, 1))) {
                                try {
                                    this.v5.j3(i, this.FH.kQ(this.v5.getFile(), ((JavaSyntax) this.v5.getLanguage().getSyntax()).et(this.v5.getSyntaxTag(this.v5.getChildNode(i, 0))), this.v5.getAttrValue(this.v5.getChildNode(i, 1)), attrType));
                                } catch (e4 unused) {
                                }
                            }
                        }
                    } catch (e4 unused2) {
                        sy(i, "The </C>" + this.v5.getLanguage().getSyntax().getString(this.v5.getSyntaxTag(this.v5.getChildNode(i, 0))) + "<//C> operator can not be applied to an instance of type </C>" + attrType.getFullyQualifiedNameString() + "<//C>");
                    }
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.Mr(th, -8795722488500374560L, this, new Integer(i), type);
                }
                throw th;
            }
        }

        @ey(method = 711239963387108475L)
        private void oh(int i) {
            try {
                if (yS) {
                    iy.u7(-1740776009010958384L, this, i);
                }
                if (!this.DW.FH) {
                    Qq(i, "try-with statements are not supported");
                }
                this.gn.we();
                this.v5.declareAttrVariableSlot(i, this.gn.FH(2));
                int childCount = this.v5.getChildCount(i);
                for (int i2 = 2; i2 < childCount - 2; i2++) {
                    d8(this.v5.getChildNode(i, i2));
                }
                b1(this.v5.getChildNode(i, childCount - 1));
                this.gn.sG();
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, -1740776009010958384L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -975149648436139647L)
        private Type om(int i) {
            try {
                if (yS) {
                    iy.u7(-3617463396178524900L, this, i);
                }
                int syntaxTag = this.v5.getSyntaxTag(this.v5.getChildNode(i, 0));
                if (syntaxTag == 57) {
                    this.v5.declareAttrType(i, this.Hw.ro());
                    return this.Hw.ro();
                }
                if (syntaxTag == 60) {
                    this.v5.declareAttrType(i, this.Hw.BT());
                    return this.Hw.BT();
                }
                if (syntaxTag == 62) {
                    this.v5.declareAttrType(i, this.Hw.vy());
                    return this.Hw.vy();
                }
                if (syntaxTag == 65) {
                    this.v5.declareAttrType(i, this.Hw.CU());
                    return this.Hw.CU();
                }
                if (syntaxTag == 69) {
                    aj(i, "Unexpected </C>void<//C>");
                    throw new e4();
                }
                if (syntaxTag == 81) {
                    this.v5.declareAttrType(i, this.Hw.SI());
                    return this.Hw.SI();
                }
                if (syntaxTag == 89) {
                    this.v5.declareAttrType(i, this.Hw.gW());
                    return this.Hw.gW();
                }
                if (syntaxTag == 114) {
                    this.v5.declareAttrType(i, this.Hw.ko());
                    return this.Hw.ko();
                }
                if (syntaxTag == 76) {
                    this.v5.declareAttrType(i, this.Hw.KD());
                    return this.Hw.KD();
                }
                if (syntaxTag != 77) {
                    return Od(i);
                }
                this.v5.declareAttrType(i, this.Hw.jO());
                return this.Hw.jO();
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, -3617463396178524900L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 194930892377003016L)
        private void oy(int i, Type type) {
            try {
                if (yS) {
                    iy.EQ(8821092625038510935L, this, new Integer(i), type);
                }
                fY(this.v5.getChildNode(i, 0), null);
                if (this.v5.hasAttrType(this.v5.getChildNode(i, 0))) {
                    pN(i, this.v5.getChildNode(i, 3), this.v5.getChildNode(i, 4), this.v5.getChildNode(i, 2), this.v5.getAttrType(this.v5.getChildNode(i, 0)), false, false, type);
                } else {
                    XG(this.v5.getChildNode(i, 4));
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.Mr(th, 8821092625038510935L, this, new Integer(i), type);
                }
                throw th;
            }
        }

        /*  JADX ERROR: Type inference failed
            jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
            */
        /* JADX INFO: Access modifiers changed from: private */
        @abcd.ey(method = -2506024684189659285L)
        public void pN(int r44, int r45, int r46, int r47, com.aide.codemodel.api.Type r48, boolean r49, boolean r50, com.aide.codemodel.api.Type r51) {
            /*
                Method dump skipped, instructions count: 2533
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.java.JavaCodeAnalyzer.a.pN(int, int, int, int, com.aide.codemodel.api.Type, boolean, boolean, com.aide.codemodel.api.Type):void");
        }

        @ey(method = -1025713668750384368L)
        private void pO(int i) {
            try {
                if (yS) {
                    iy.u7(-83643260088890691L, this, i);
                }
                ys(i, 24641, true, false, true, false, false);
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, -83643260088890691L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 111778458508175777L)
        private void pl(int i) {
            try {
                if (yS) {
                    iy.u7(-176851099154216448L, this, i);
                }
                if (this.v5.getSyntaxTag(this.v5.getChildNode(i, this.v5.getChildCount(i) - 1)) == 205) {
                    int childNode = this.v5.getChildNode(i, this.v5.getChildCount(i) - 1);
                    if (this.Mr) {
                        this.v5.declareAttrVariableSlot(childNode, this.gn.FH(4));
                    }
                }
                b1(this.v5.getChildNode(i, 1));
                int childCount = this.v5.getChildCount(i);
                if (this.Mr && childCount == 2) {
                    int childNode2 = this.v5.getChildNode(i, 1);
                    aj(this.v5.getChildNode(childNode2, this.v5.getChildCount(childNode2) - 1), "Missing </C>catch<//C> or </C>finally<//C>");
                }
                for (int i2 = 2; i2 < childCount; i2++) {
                    if (this.v5.getSyntaxTag(this.v5.getChildNode(i, i2)) == 204) {
                        int childNode3 = this.v5.getChildNode(i, i2);
                        Type typeXG = null;
                        int childNode4 = this.v5.getChildNode(childNode3, 3);
                        int childCount2 = this.v5.getChildCount(childNode4);
                        for (int i3 = 0; i3 < childCount2; i3 += 2) {
                            int childNode5 = this.v5.getChildNode(childNode4, i3);
                            try {
                                Type typeOm = om(childNode5);
                                typeXG = typeXG == null ? typeOm : typeXG.ca(this.v5.getFile(), this.v5.getLanguage(), typeOm);
                                if (this.Mr && !this.Hw.e3(this.v5.getFile(), typeXG)) {
                                    Qq(childNode5, "Only subtypes of </C>Throwable<//C> can be caught");
                                }
                            } catch (e4 unused) {
                            }
                        }
                        if (typeXG == null) {
                            try {
                                typeXG = this.Hw.XG(this.v5.getFile());
                            } catch (e4 unused2) {
                            }
                        }
                        this.gn.we();
                        wE(this.v5.getChildNode(childNode3, 2));
                        int childNode6 = this.v5.getChildNode(childNode3, 4);
                        this.v5.declareAttrReferenceKind(childNode6, 1, childNode6);
                        this.v5.declareAttrType(childNode6, typeXG);
                        try {
                            this.gn.tp(this.v5.getIdentifier(childNode6), childNode6, typeXG);
                        } catch (c4 unused3) {
                            sy(childNode6, "There already is another variable named </C>" + this.v5.getIdentifierString(childNode6) + "<//C>");
                        }
                        b1(this.v5.getChildNode(childNode3, 6));
                        this.gn.sG();
                    } else {
                        int childNode7 = this.v5.getChildNode(i, i2);
                        this.gn.we();
                        this.gn.aM();
                        b1(this.v5.getChildNode(childNode7, 1));
                        this.gn.sG();
                    }
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, -176851099154216448L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -2025915956156416671L)
        private void q7(int i) {
            try {
                if (yS) {
                    iy.u7(469208622774050432L, this, i);
                }
                if (!this.DW.DW) {
                    Qq(i, "Foreach statements are not supported by this language");
                    return;
                }
                if (this.Mr) {
                    this.v5.declareAttrVariableSlot(i, this.gn.FH(2));
                }
                try {
                    fY(this.v5.getChildNode(i, 8), this.Hw.wc(this.v5.getFile()));
                } catch (e4 unused) {
                }
                this.gn.we();
                try {
                    Type typeCU = CU(CU(om(this.v5.getChildNode(i, 3)), this.v5.getChildNode(i, 4)), this.v5.getChildNode(i, 6));
                    int childNode = this.v5.getChildNode(i, 5);
                    this.v5.declareAttrReferenceKind(childNode, 1, childNode);
                    this.v5.declareAttrType(childNode, typeCU);
                    try {
                        this.gn.tp(this.v5.getIdentifier(childNode), childNode, typeCU);
                    } catch (c4 unused2) {
                        sy(childNode, "There already is another variable named </C>" + this.v5.getIdentifierString(childNode) + "<//C>");
                    }
                    if (this.Mr && this.v5.hasAttrType(this.v5.getChildNode(i, 8))) {
                        Type attrType = this.v5.getAttrType(this.v5.getChildNode(i, 8));
                        if (attrType.isArrayType()) {
                            if (!this.Hw.Z1(this.v5.getFile(), ((ArrayType) attrType).getElementType(), typeCU, false)) {
                                Qq(this.v5.getChildNode(i, 3), "Invalid type of iteration variable");
                            }
                        } else if (this.Hw.a8(this.v5.getFile()) && attrType.isImplicitConvertibleTo(this.v5.getFile(), this.v5.getLanguage(), this.Hw.wc(this.v5.getFile()))) {
                            if (this.DW.DW) {
                                if (!attrType.et() || typeCU == this.Hw.Eq(this.v5.getFile())) {
                                    if (attrType.isParameterizedType() || attrType.isClassType()) {
                                        SetOf<Type> allSuperTypes = attrType.isClassType() ? ((ClassType) attrType).getAllSuperTypes() : ((ParameterizedType) attrType).getAllSuperTypes();
                                        allSuperTypes.DEFAULT_ITERATOR.init();
                                        while (allSuperTypes.DEFAULT_ITERATOR.hasMoreElements()) {
                                            Type type = (Type) allSuperTypes.DEFAULT_ITERATOR.nextKey();
                                            if (type.isParameterizedType() && ((ParameterizedType) type).getClassType() == this.Hw.wc(this.v5.getFile())) {
                                                Type type2 = ((ParameterizedType) type).getAbsoluteArgumentTypes()[0];
                                                if ((((ParameterizedType) type).getAbsoluteArgumentVariances()[0] == 3 && typeCU != this.Hw.Eq(this.v5.getFile())) || !type2.isImplicitConvertibleTo(this.v5.getFile(), this.v5.getLanguage(), typeCU)) {
                                                    Qq(this.v5.getChildNode(i, 3), "Invalid type of iteration variable");
                                                }
                                            }
                                        }
                                    }
                                } else if (this.U2) {
                                    OW(this.v5.getChildNode(i, 3), "The assignment to the iteration variable is unsafe");
                                    cb();
                                }
                            }
                        } else if (!this.Hw.U2(this.v5.getFile()) || !attrType.isImplicitConvertibleTo(this.v5.getFile(), this.v5.getLanguage(), this.Hw.sy(this.v5.getFile()))) {
                            Qq(this.v5.getChildNode(i, 8), "Expected a collection or an array");
                        } else if (this.DW.DW) {
                            if (!attrType.et() || typeCU == this.Hw.Eq(this.v5.getFile())) {
                                if (attrType.isParameterizedType() || attrType.isClassType()) {
                                    SetOf<Type> allSuperTypes2 = attrType.isClassType() ? ((ClassType) attrType).getAllSuperTypes() : ((ParameterizedType) attrType).getAllSuperTypes();
                                    allSuperTypes2.DEFAULT_ITERATOR.init();
                                    while (allSuperTypes2.DEFAULT_ITERATOR.hasMoreElements()) {
                                        Type type3 = (Type) allSuperTypes2.DEFAULT_ITERATOR.nextKey();
                                        if (type3.isParameterizedType() && ((ParameterizedType) type3).getClassType() == this.Hw.wc(this.v5.getFile())) {
                                            Type type4 = ((ParameterizedType) type3).getAbsoluteArgumentTypes()[0];
                                            if ((((ParameterizedType) type3).getAbsoluteArgumentVariances()[0] == 3 && typeCU != this.Hw.Eq(this.v5.getFile())) || !type4.isImplicitConvertibleTo(this.v5.getFile(), this.v5.getLanguage(), typeCU)) {
                                                Qq(this.v5.getChildNode(i, 3), "Invalid type of iteration variable");
                                            }
                                        }
                                    }
                                }
                            } else if (this.U2) {
                                OW(this.v5.getChildNode(i, 3), "The assignment to the iteration variable is unsafe");
                                cb();
                            }
                        }
                    }
                } catch (e4 unused3) {
                }
                b1(this.v5.getChildNode(i, 10));
                this.gn.sG();
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, 469208622774050432L, this, new Integer(i));
                }
                throw th;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x00de  */
        @abcd.ey(method = 3485318115760278200L)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void qP(com.aide.codemodel.api.Type r24, com.aide.codemodel.api.Member r25, int r26, boolean r27, int r28) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 258
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.java.JavaCodeAnalyzer.a.qP(com.aide.codemodel.api.Type, com.aide.codemodel.api.Member, int, boolean, int):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        @ey(method = -381257460726005888L)
        public void qp(int i, Type type) {
            try {
                if (yS) {
                    iy.EQ(466220577639400005L, this, new Integer(i), type);
                }
                if (!this.Mr || type.isReferable(this.v5.getFile(), this.v5.getLanguage())) {
                    return;
                }
                Qq(i, "The type </C>" + type.getFullyQualifiedNameString() + "<//C> is defined in an assembly that is not referenced.");
            } catch (Throwable th) {
                if (gW) {
                    iy.Mr(th, 466220577639400005L, this, new Integer(i), type);
                }
                throw th;
            }
        }

        @ey(method = 840322878124739976L)
        private void ro(int i) {
            try {
                if (yS) {
                    iy.u7(25535632065650435L, this, i);
                }
                cn(i, i);
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, 25535632065650435L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -231334368400208117L)
        private int sE(int i) {
            try {
                if (yS) {
                    iy.u7(160141972957607208L, this, i);
                }
                return ys(i, ProxyTextView.INPUTTYPE_textCapSentences, true, false, true, false, false) | 1 | 16384;
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, 160141972957607208L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 1355340482012440108L)
        private void sG(int i, String str) {
            try {
                if (yS) {
                    iy.EQ(1614055370470471161L, this, new Integer(i), str);
                }
                if (this.Mr) {
                    this.j6.Ws(this.v5.getFile(), this.v5.getLanguage(), this.v5.getStartLine(i), this.v5.getStartColumn(i), this.v5.getStartLine(i), this.v5.getStartColumn(i), str, "Insert '" + str.trim() + "'");
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.Mr(th, 1614055370470471161L, this, new Integer(i), str);
                }
                throw th;
            }
        }

        @ey(method = 2661498310294320640L)
        private void sM(int i) {
            try {
                if (yS) {
                    iy.u7(-4293018878851541605L, this, i);
                }
                this.lg = 0;
                int childCount = this.v5.getChildCount(i);
                for (int i2 = 1; i2 < childCount; i2 += 4) {
                    try {
                        int i3 = i2 + 1;
                        Type typeOm = om(this.v5.getChildNode(i, i3));
                        Type[] typeArr = this.rN;
                        int i4 = this.lg;
                        this.lg = i4 + 1;
                        typeArr[i4] = typeOm;
                        if (!this.Hw.iW(typeOm)) {
                            Qq(this.v5.getChildNode(i, i3), "An argument type must be a reference type");
                        }
                        int childNode = this.v5.getChildNode(i, i2);
                        if (this.v5.getChildCount(childNode) > 0) {
                            Qq(childNode, "Unexpected variance");
                        }
                    } catch (e4 unused) {
                    }
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, -4293018878851541605L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 464604560515260633L)
        private void sT(int i) {
            try {
                if (yS) {
                    iy.u7(940112705488461128L, this, i);
                }
                try {
                    this.v5.declareAttrType(i, this.Hw.oY(this.v5.getFile()));
                } catch (e4 unused) {
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, 940112705488461128L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -5762953550613742813L)
        private int sg(int i) {
            try {
                if (yS) {
                    iy.u7(1446932020483011344L, this, i);
                }
                return ys(i, 24769, true, false, true, false, false);
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, 1446932020483011344L, this, new Integer(i));
                }
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @ey(method = 387503964348672160L)
        public void sh(int i, boolean z, Type type, Type type2) throws Throwable {
            Type type3;
            String str;
            String str2;
            String str3;
            Type typeBx = type2;
            try {
                if (yS) {
                    iy.J0(-288787788590455109L, this, new Integer(i), new Boolean(z), type, type2);
                }
                if (this.Mr) {
                    try {
                        Type typeX9 = type.x9();
                        if (typeBx != null) {
                            try {
                                if (typeBx == this.Hw.WB() || typeBx == this.Hw.Xa() || !typeX9.isClassType() || !typeX9.getFile().vJ()) {
                                    return;
                                }
                                if (type2.isClassType() && ((ClassType) typeBx).sT()) {
                                    try {
                                        typeBx = ((ClassType) typeBx).Bx();
                                    } catch (e4 unused) {
                                    }
                                }
                                int i2 = typeX9 == this.gn.U2() ? 4 : 1;
                                if (z) {
                                    i2 |= 64;
                                }
                                if (typeX9.isInterfaceType()) {
                                    i2 |= 512;
                                }
                                String str4 = "Create field '" + this.v5.getLanguage().getCodeRenderer().getModifiersString(i2) + typeBx.getNameString() + " " + this.v5.getIdentifierString(i) + "'";
                                String str5 = " in class ";
                                if (typeX9 != this.gn.U2()) {
                                    if (typeX9.isInterfaceType()) {
                                        str3 = str4 + " in interface ";
                                    } else {
                                        str3 = str4 + " in class ";
                                    }
                                    str4 = str3 + "'" + typeX9.getNameString() + "'";
                                }
                                String str6 = str4;
                                int identifier = this.v5.getIdentifier(i);
                                FileEntry file = typeX9.getFile();
                                if (typeX9.getLanguage() instanceof JavaLanguage) {
                                    SyntaxTree syntaxTree = this.DW.syntaxTreeSpace.getSyntaxTree(file, typeX9.getLanguage());
                                    int childNode = syntaxTree.getChildNode(syntaxTree.getClassDeclarationNode(typeX9.DW()), syntaxTree.getChildCount(r15) - 1);
                                    int i3 = 0;
                                    int endLine = 0;
                                    int endColumn = 0;
                                    while (true) {
                                        if (i3 >= syntaxTree.getChildCount(childNode)) {
                                            str = str5;
                                            break;
                                        }
                                        int childNode2 = syntaxTree.getChildNode(childNode, i3);
                                        int i4 = childNode;
                                        int syntaxTag = syntaxTree.getSyntaxTag(childNode2);
                                        str = str5;
                                        if (syntaxTag != 8 && syntaxTag != 126) {
                                            break;
                                        }
                                        endLine = syntaxTree.getEndLine(childNode2);
                                        endColumn = syntaxTree.getEndColumn(childNode2);
                                        i3++;
                                        childNode = i4;
                                        str5 = str;
                                    }
                                    this.DW.syntaxTreeSpace.releaseSyntaxTree(syntaxTree);
                                    this.j6.VH(file, typeX9.getLanguage(), endLine, endColumn, i2, identifier, typeBx, str6);
                                    if (y1.Hw(i2) || !this.Hw.Jl(typeBx)) {
                                        return;
                                    }
                                    int i5 = i2 | 576;
                                    String str7 = "Create field '" + this.v5.getLanguage().getCodeRenderer().getModifiersString(i5) + typeBx.getNameString() + " " + this.v5.getIdentifierString(i) + "'";
                                    if (typeX9 != this.gn.U2()) {
                                        if (typeX9.isInterfaceType()) {
                                            str2 = str7 + " in interface ";
                                        } else {
                                            str2 = str7 + str;
                                        }
                                        str7 = str2 + "'" + typeX9.getNameString() + "'";
                                    }
                                    this.j6.VH(file, typeX9.getLanguage(), endLine, endColumn, i5, identifier, typeBx, str7);
                                }
                            } catch (Throwable th) {
                                th = th;
                                type3 = typeX9;
                                if (gW) {
                                    iy.a8(th, -288787788590455109L, this, new Integer(i), new Boolean(z), type3, typeBx);
                                }
                                throw th;
                            }
                        }
                    } catch (e4 unused2) {
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                type3 = type;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @ey(method = -610673236870996992L)
        public void sy(int i, String str) {
            try {
                if (yS) {
                    iy.EQ(1621691220497487915L, this, new Integer(i), str);
                }
                nw(i, str, 20);
            } catch (Throwable th) {
                if (gW) {
                    iy.Mr(th, 1621691220497487915L, this, new Integer(i), str);
                }
                throw th;
            }
        }

        @ey(method = -3555311335975868949L)
        private void vJ(int i, Namespace namespace) {
            try {
                if (yS) {
                    iy.EQ(968971085519992480L, this, new Integer(i), namespace);
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.Mr(th, 968971085519992480L, this, new Integer(i), namespace);
                }
                throw th;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0041 A[Catch: all -> 0x0241, TryCatch #0 {all -> 0x0241, blocks: (B:3:0x0009, B:5:0x000d, B:6:0x0010, B:14:0x0033, B:15:0x0036, B:17:0x004b, B:19:0x0055, B:22:0x0065, B:23:0x0079, B:25:0x0081, B:73:0x0232, B:27:0x0089, B:29:0x00b0, B:30:0x00b9, B:33:0x00bf, B:35:0x00c5, B:36:0x00e2, B:38:0x00ea, B:40:0x00fa, B:41:0x0103, B:43:0x0112, B:44:0x011c, B:46:0x0124, B:48:0x0141, B:50:0x014d, B:64:0x01b7, B:66:0x01bb, B:68:0x01cf, B:70:0x01dd, B:52:0x016b, B:54:0x017b, B:56:0x0189, B:58:0x0198, B:60:0x019e, B:62:0x01a6, B:63:0x01ac, B:72:0x0208, B:16:0x0041), top: B:86:0x0009 }] */
        @abcd.ey(method = -5386868419000871520L)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void w9(int r24) {
            /*
                Method dump skipped, instructions count: 608
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.java.JavaCodeAnalyzer.a.w9(int):void");
        }

        @ey(method = -4050840543457509165L)
        private int wE(int i) {
            try {
                if (yS) {
                    iy.u7(-933326009900979200L, this, i);
                }
                return ys(i, 768, false, false, false, false, true);
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, -933326009900979200L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 1276176184633045335L)
        private void wc(int i) {
            int semantic;
            try {
                if (yS) {
                    iy.u7(-392068186804516512L, this, i);
                }
                int childCount = this.v5.getChildCount(i);
                int i2 = 3;
                int i3 = 0;
                boolean z = false;
                while (i2 < childCount) {
                    int childNode = this.v5.getChildNode(i, i2);
                    i3++;
                    if (this.v5.getSyntaxTag(childNode) == 11) {
                        if (this.Mr && i2 == 3 && this.v5.getSyntaxTag(this.v5.getChildNode(i, this.v5.getChildCount(i) - 1)) != 196) {
                            aj(childNode, "Missing array dimension");
                        }
                        i2 += 2;
                    } else if (this.v5.getSyntaxTag(childNode) == 230) {
                        if (this.Mr && i2 == 3 && this.v5.getSyntaxTag(this.v5.getChildNode(i, this.v5.getChildCount(i) - 1)) != 196) {
                            aj(childNode, "Missing array dimension");
                        }
                        i2 += 3;
                    } else {
                        fY(childNode, this.Hw.ro());
                        if (this.Mr) {
                            if (this.v5.getSyntaxTag(this.v5.getChildNode(i, this.v5.getChildCount(i) - 1)) == 196 || z) {
                                aj(childNode, "Unexpected array dimension");
                                ro(childNode);
                            } else if (this.v5.hasAttrType(childNode) && (semantic = this.v5.getAttrType(childNode).getSemantic()) != 3 && semantic != 4 && semantic != 5 && semantic != 7 && semantic != 12) {
                                Qq(childNode, "An array size must be of type </C>int<//C>");
                            }
                        }
                        i2 += 3;
                    }
                    z = true;
                }
                try {
                    Type typeOm = om(this.v5.getChildNode(i, 1));
                    if (this.U2 && (typeOm.isMethodParameterType() || typeOm.isParameterType() || (typeOm.isParameterizedType() && !typeOm.lp()))) {
                        Qq(this.v5.getChildNode(i, 1), "This array creation is not allowed because the created array is actually of type </C>" + typeOm.x9().getFullyQualifiedNameString() + "<//C>");
                    }
                    for (int i4 = 0; i4 < i3; i4++) {
                        typeOm = this.FH.hz(typeOm, 1);
                    }
                    this.v5.declareAttrType(i, typeOm);
                    if (this.v5.getSyntaxTag(this.v5.getChildNode(i, this.v5.getChildCount(i) - 1)) == 196) {
                        et(this.v5.getChildNode(i, this.v5.getChildCount(i) - 1), typeOm);
                    }
                } catch (e4 unused) {
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, -392068186804516512L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 3459101585571592807L)
        private void x9(SetOf<Member> setOf) {
            try {
                if (yS) {
                    iy.tp(386239128717846040L, this, setOf);
                }
                this.u7.push(setOf);
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, 386239128717846040L, this, setOf);
                }
                throw th;
            }
        }

        @ey(method = -4042427553575766576L)
        private void xg(int i, Type type) {
            try {
                if (yS) {
                    iy.EQ(-686325887768875277L, this, new Integer(i), type);
                }
                if (this.v5.getChildCount(i) > 3) {
                    try {
                        k2(i, this.v5.getChildNode(i, 4), om(this.v5.getChildNode(i, 0)).x9(), true, false, type, this.v5.N0(i), true);
                        return;
                    } catch (e4 unused) {
                        return;
                    }
                }
                Type typeRN = this.gn.rN();
                int childNode = this.v5.getChildNode(i, 2);
                k2(i, childNode, typeRN, true, false, type, this.v5.N0(i), true);
                this.v5.declareAttrInvocationType(childNode, this.gn.U2());
                if (!this.Mr || this.gn.gW(this.gn.U2())) {
                    return;
                }
                Qq(this.v5.getChildNode(i, 0), "There is no such reference available here");
            } catch (Throwable th) {
                if (gW) {
                    iy.Mr(th, -686325887768875277L, this, new Integer(i), type);
                }
                throw th;
            }
        }

        @ey(method = 1630122346218220515L)
        private void yO(int i) {
            int i2;
            boolean z;
            try {
                if (yS) {
                    iy.u7(244154115115290696L, this, i);
                }
                int childNode = this.v5.getChildCount(i) == 7 ? this.v5.getChildNode(i, 5) : this.v5.getChildNode(i, 3);
                int childCount = this.v5.getChildCount(childNode);
                Type typeOm = null;
                if (childCount > 2) {
                    i2 = 0;
                    z = true;
                    for (int i3 = 1; i3 < childCount; i3 += 2) {
                        fY(this.v5.getChildNode(childNode, i3), null);
                        if (this.v5.hasAttrType(this.v5.getChildNode(childNode, i3))) {
                            this.Ws[this.XL] = this.v5.getAttrType(this.v5.getChildNode(childNode, i3));
                        } else {
                            z = false;
                        }
                        i2++;
                        this.XL++;
                    }
                } else {
                    i2 = 0;
                    z = true;
                }
                try {
                    if (this.v5.getChildCount(i) == 7) {
                        fY(this.v5.getChildNode(i, 0), null);
                        int childNode2 = this.v5.getChildNode(i, 4);
                        if (this.v5.hasAttrType(this.v5.getChildNode(i, 0))) {
                            if (this.v5.getChildCount(childNode2) > 2) {
                                Qq(childNode2, "Invalid type");
                            } else {
                                try {
                                    Entity entityEj = Ej(this.v5.getChildNode(childNode2, 0), this.v5.getChildNode(childNode2, 1), this.v5.getAttrType(this.v5.getChildNode(i, 0)));
                                    if (entityEj.isNamespace()) {
                                        this.v5.declareAttrType(childNode2, typeOm);
                                    } else {
                                        Type type = (Type) entityEj;
                                        try {
                                            if (this.Mr) {
                                                if (type.isClassType() && ((ClassType) type).pl()) {
                                                    Qq(this.v5.getChildNode(i, 0), "A reference to an enclosing class is not required");
                                                    cn(this.v5.getChildNode(i, 0), this.v5.getChildNode(i, 1));
                                                }
                                                if (type.isEnumType() && !this.gn.U2().isEnumType()) {
                                                    Qq(childNode2, "Expected a class or interface");
                                                }
                                                if (type.wc()) {
                                                    Qq(childNode2, "The type of a created instance can only be invariant");
                                                }
                                            }
                                            typeOm = type;
                                            this.v5.declareAttrType(childNode2, typeOm);
                                        } catch (e4 unused) {
                                            typeOm = type;
                                        }
                                    }
                                } catch (e4 unused2) {
                                }
                            }
                        }
                        Type type2 = typeOm;
                        ClassType classtype = this.FH.getClasstype(this.v5.getFile(), this.v5.getLanguage(), this.v5.getDeclarationNumber(i));
                        this.v5.declareAttrType(i, classtype);
                        this.gn.J0(classtype);
                        if (z && type2 != null) {
                            int childNode3 = this.v5.getChildNode(childNode2, this.v5.getChildCount(childNode2) - 2);
                            this.v5.declareAttrInvocationType(childNode3, classtype);
                            try {
                                Ev(i, childNode, this.v5.getChildNode(i, 3), i2, type2, childNode3, true);
                            } catch (e4 unused3) {
                            }
                        }
                        AE(this.v5.getChildNode(i, 6));
                        Eq(this.v5.getChildNode(i, 6));
                        this.gn.ef();
                    } else {
                        int childNode4 = this.v5.getChildNode(i, 2);
                        try {
                            typeOm = om(childNode4);
                            if (this.Mr) {
                                ClassType classType = (ClassType) typeOm.x9();
                                if (classType.isSealed()) {
                                    Qq(childNode4, "The final class </C>" + classType.getFullyQualifiedNameString() + "<//C> can not be subclassed");
                                }
                                if (classType.Of()) {
                                    if (!this.gn.vy(classType.getEnclosingClassType())) {
                                        Qq(childNode4, "A reference to an enclosing class is required");
                                    }
                                }
                                if (typeOm.isEnumType() && !this.gn.U2().isEnumType()) {
                                    Qq(childNode4, "Expected a class or interface");
                                }
                                if (typeOm.wc()) {
                                    Qq(childNode4, "The type of a created instance can only be invariant");
                                }
                            }
                        } catch (e4 unused4) {
                        }
                        Type type3 = typeOm;
                        ClassType classtype2 = this.FH.getClasstype(this.v5.getFile(), this.v5.getLanguage(), this.v5.getDeclarationNumber(i));
                        this.v5.declareAttrType(i, classtype2);
                        this.gn.J0(classtype2);
                        if (z && type3 != null) {
                            int childNode5 = this.v5.getChildNode(childNode4, this.v5.getChildCount(childNode4) - 2);
                            this.v5.declareAttrInvocationType(childNode5, classtype2);
                            try {
                                Ev(i, childNode, this.v5.getChildNode(i, 1), i2, type3, childNode5, true);
                            } catch (e4 unused5) {
                            }
                        }
                        AE(this.v5.getChildNode(i, 4));
                        Eq(this.v5.getChildNode(i, 4));
                        this.gn.ef();
                    }
                } catch (e4 unused6) {
                }
                this.XL -= i2;
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, 244154115115290696L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -920903555615368545L)
        private int ye(int i) {
            try {
                if (yS) {
                    iy.u7(395169966641865600L, this, i);
                }
                return ys(i, 2061, false, false, false, false, false);
            } catch (Throwable th) {
                if (gW) {
                    iy.j3(th, 395169966641865600L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -316378251810183255L)
        private int ys(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            try {
                if (yS) {
                    iy.QX(-193671276104274416L, this, new Object[]{new Integer(i), new Integer(i2), new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4), new Boolean(z5)});
                }
                int childCount = this.v5.getChildCount(i);
                int i3 = 0;
                for (int i4 = 0; i4 < childCount; i4++) {
                    int childNode = this.v5.getChildNode(i, i4);
                    int syntaxTag = this.v5.getSyntaxTag(childNode);
                    int i5 = 524288;
                    if (syntaxTag == 75) {
                        if ((i3 & 16384) != 0 || (i3 & 1024) != 0) {
                            aj(childNode, "Unexpected modifier");
                            ro(childNode);
                        }
                        i5 = z5 ? 768 : 0;
                    } else if (syntaxTag == 86) {
                        if (z || (i3 & 16384) == 0) {
                            i5 = 64;
                        } else {
                            aj(childNode, "Unexpected modifier");
                            ro(childNode);
                            i5 = 0;
                        }
                        if (z3) {
                            ct(childNode, false, z2);
                        }
                    } else if (syntaxTag != 104) {
                        if (syntaxTag == 231) {
                            try {
                                kQ(childNode);
                            } catch (e4 unused) {
                            }
                        } else if (syntaxTag != 83) {
                            if (syntaxTag == 84) {
                                if (z4 && this.er) {
                                    aj(childNode, "This class should not be </C>public<//C> since the class name does not match the file name");
                                    ro(childNode);
                                }
                                if ((i3 & 4) == 0 && (i3 & 8) == 0) {
                                    i5 = 1;
                                } else {
                                    aj(childNode, "Unexpected modifier");
                                    ro(childNode);
                                }
                            } else if (syntaxTag != 94) {
                                if (syntaxTag != 95) {
                                    if (syntaxTag == 97) {
                                        i5 = 8192;
                                    } else if (syntaxTag != 98) {
                                        if (syntaxTag != 100) {
                                            if (syntaxTag == 101) {
                                                i5 = 4096;
                                            }
                                        } else if ((i3 & 1) == 0 && (i3 & 4) == 0) {
                                            i5 = 8;
                                        } else {
                                            aj(childNode, "Unexpected modifier");
                                            ro(childNode);
                                        }
                                    } else if ((i3 & 512) != 0) {
                                        aj(childNode, "Unexpected modifier");
                                        ro(childNode);
                                    } else {
                                        i5 = 1024;
                                    }
                                } else if (!z && (i3 & 64) != 0) {
                                    aj(childNode, "Unexpected modifier");
                                    ro(childNode);
                                } else if ((!z && (i3 & 2048) != 0) || (i3 & 128) != 0 || (i3 & 524288) != 0) {
                                    aj(childNode, "Unexpected modifier");
                                    ro(childNode);
                                } else if (z || (i3 & 4) == 0) {
                                    i5 = 16384;
                                } else {
                                    aj(childNode, "Unexpected modifier");
                                    ro(childNode);
                                }
                            } else if ((i3 & 1) != 0 || (i3 & 8) != 0) {
                                aj(childNode, "Unexpected modifier");
                                ro(childNode);
                            } else if (z || (i3 & 16384) == 0) {
                                i5 = 4;
                            } else {
                                aj(childNode, "Unexpected modifier");
                                ro(childNode);
                            }
                        } else if ((i3 & 16384) != 0) {
                            aj(childNode, "Unexpected modifier");
                            ro(childNode);
                        }
                    } else if (z || (i3 & 16384) == 0) {
                        i5 = 2048;
                    } else {
                        aj(childNode, "Unexpected modifier");
                        ro(childNode);
                    }
                    if ((i3 & i5) != 0) {
                        aj(childNode, "Duplicate modifier");
                        ro(childNode);
                    } else if (i5 == 0 || (i5 & i2) != 0) {
                        i3 |= i5;
                    } else {
                        aj(childNode, "Unexpected modifier");
                        ro(childNode);
                    }
                }
                return i3;
            } catch (Throwable th) {
                if (gW) {
                    iy.rN(th, -193671276104274416L, this, new Object[]{new Integer(i), new Integer(i2), new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4), new Boolean(z5)});
                }
                throw th;
            }
        }

        @ey(method = 3047496161583926343L)
        private void zh(int i, Type type) {
            try {
                if (yS) {
                    iy.EQ(275181009807223872L, this, new Integer(i), type);
                }
                fY(this.v5.getChildNode(i, 0), null);
                if (this.v5.hasAttrType(this.v5.getChildNode(i, 0))) {
                    int childNode = this.v5.getChildNode(i, 2);
                    Type attrType = this.v5.getAttrType(this.v5.getChildNode(i, 0));
                    k2(i, childNode, attrType, false, false, type, this.v5.N0(i), true);
                    this.v5.declareAttrInvocationType(childNode, attrType);
                }
            } catch (Throwable th) {
                if (gW) {
                    iy.Mr(th, 275181009807223872L, this, new Integer(i), type);
                }
                throw th;
            }
        }

        @ey(method = 189539765250178035L)
        public void P8(JavaCodeAnalyzer javaCodeAnalyzer, ErrorTable errorTable, EntitySpace entitySpace, JavaTypeSystem javaTypeSystem, SyntaxTree syntaxTree, SetOfInt setOfInt, boolean z, boolean z2, boolean z3) {
            try {
                if (yS) {
                    iy.QX(5497424660004555072L, this, new Object[]{javaCodeAnalyzer, errorTable, entitySpace, javaTypeSystem, syntaxTree, setOfInt, new Boolean(z), new Boolean(z2), new Boolean(z3)});
                }
                this.j6 = errorTable;
                this.DW = javaCodeAnalyzer;
                this.j3.clear();
                if (setOfInt != null) {
                    this.j3.VH(setOfInt);
                }
                this.FH = entitySpace;
                this.Hw = javaTypeSystem;
                this.v5 = syntaxTree;
                this.Mr = z;
                this.U2 = z2;
                this.a8 = z3;
                this.Zo = 0;
                this.er = true;
                this.gn.XL();
                ko(syntaxTree.getRootNode());
                syntaxTree.declareAttrDAIndexCount(this.Zo);
                this.v5 = null;
            } catch (Throwable th) {
                if (gW) {
                    iy.rN(th, 5497424660004555072L, this, new Object[]{javaCodeAnalyzer, errorTable, entitySpace, javaTypeSystem, syntaxTree, setOfInt, new Boolean(z), new Boolean(z2), new Boolean(z3)});
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(JavaCodeAnalyzer.class);
    }

    @ey(method = 286392374097264965L)
    public JavaCodeAnalyzer(Model model, JavaLanguage javaLanguage) {
        try {
            if (J8) {
                iy.EQ(-2364534485754711469L, null, model, javaLanguage);
            }
            this.DW = true;
            this.FH = true;
            this.model = model;
            this.fileSpace = model.fileSpace;
            this.identifierSpace = model.identifierSpace;
            this.errorTable = model.errorTable;
            this.entitySpace = model.entitySpace;
            this.u7 = javaLanguage.getTypeSystem();
            this.syntaxTreeSpace = model.syntaxTreeSpace;
            this.j6 = new Stack<>();
            this.Hw = new SetOfInt();
            this.we = new o6(model, this.u7, true);
            this.J0 = new y6(model);
        } catch (Throwable th) {
            if (Ws) {
                iy.Mr(th, -2364534485754711469L, null, model, javaLanguage);
            }
            throw th;
        }
    }

    @ey(method = 3394664937731570720L)
    private a Mr() {
        try {
            if (J8) {
                iy.gn(-174270450288220803L, this);
            }
            return this.j6.size() > 0 ? this.j6.pop() : new a(this.entitySpace);
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -174270450288220803L, this);
            }
            throw th;
        }
    }

    @ey(method = -1100253321816400320L)
    private void QX(SyntaxTree syntaxTree, int i, int i2, SetOfInt setOfInt) {
        try {
            if (J8) {
                iy.J0(3741966150038748051L, this, syntaxTree, new Integer(i), new Integer(i2), setOfInt);
            }
            int childCount = syntaxTree.getChildCount(i);
            for (int i3 = 0; i3 < childCount; i3++) {
                QX(syntaxTree, syntaxTree.getChildNode(i, i3), i2, setOfInt);
            }
            if (syntaxTree.getSyntaxTag(i) == 1 && syntaxTree.getIdentifier(i) == i2) {
                aM(syntaxTree, i, setOfInt);
            }
        } catch (Throwable th) {
            if (Ws) {
                iy.a8(th, 3741966150038748051L, this, syntaxTree, new Integer(i), new Integer(i2), setOfInt);
            }
            throw th;
        }
    }

    @ey(method = 1920807372754372476L)
    private void XL(SyntaxTree syntaxTree, int i, SetOfInt setOfInt, SetOfInt setOfInt2) {
        try {
            if (J8) {
                iy.J0(833034246987819463L, this, syntaxTree, new Integer(i), setOfInt, setOfInt2);
            }
            int childCount = syntaxTree.getChildCount(i);
            for (int i2 = 0; i2 < childCount; i2++) {
                XL(syntaxTree, syntaxTree.getChildNode(i, i2), setOfInt, setOfInt2);
            }
            if (syntaxTree.getSyntaxTag(i) == 1 && setOfInt.contains(syntaxTree.getIdentifier(i))) {
                aM(syntaxTree, i, setOfInt2);
            }
        } catch (Throwable th) {
            if (Ws) {
                iy.a8(th, 833034246987819463L, this, syntaxTree, new Integer(i), setOfInt, setOfInt2);
            }
            throw th;
        }
    }

    @ey(method = -1057558051307338464L)
    private void a8(a aVar) {
        try {
            if (J8) {
                iy.tp(-1495784125199438779L, this, aVar);
            }
            if (this.j6.size() < 10) {
                this.j6.push(aVar);
            }
        } catch (Throwable th) {
            if (Ws) {
                iy.j3(th, -1495784125199438779L, this, aVar);
            }
            throw th;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:200)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:124)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @abcd.ey(method = -1951535695341831195L)
    private void aM(com.aide.codemodel.api.SyntaxTree r9, int r10, com.aide.codemodel.api.collections.SetOfInt r11) {
        /*
            r8 = this;
            boolean r0 = com.aide.codemodel.language.java.JavaCodeAnalyzer.J8     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L14
            r1 = -1202020468228826400(0xef5190c0b278dae0, double:-1.6644692324342748E228)
            java.lang.Integer r5 = new java.lang.Integer     // Catch: java.lang.Throwable -> L69
            r5.<init>(r10)     // Catch: java.lang.Throwable -> L69
            r3 = r8
            r4 = r9
            r6 = r11
            abcd.iy.we(r1, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L69
        L14:
            r0 = r10
        L15:
            int r1 = r9.getRootNode()     // Catch: java.lang.Throwable -> L69
            if (r0 == r1) goto L68
            int r1 = r9.getSyntaxTag(r0)     // Catch: java.lang.Throwable -> L69
            r2 = 120(0x78, float:1.68E-43)
            if (r1 == r2) goto L60
            r2 = 121(0x79, float:1.7E-43)
            if (r1 == r2) goto L60
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L60
            r2 = 124(0x7c, float:1.74E-43)
            if (r1 == r2) goto L60
            r2 = 133(0x85, float:1.86E-43)
            if (r1 == r2) goto L60
            r2 = 194(0xc2, float:2.72E-43)
            if (r1 == r2) goto L60
            r2 = 209(0xd1, float:2.93E-43)
            if (r1 == r2) goto L60
            r2 = 211(0xd3, float:2.96E-43)
            if (r1 == r2) goto L60
            r2 = 212(0xd4, float:2.97E-43)
            if (r1 == r2) goto L60
            r2 = 227(0xe3, float:3.18E-43)
            if (r1 == r2) goto L60
            r2 = 228(0xe4, float:3.2E-43)
            if (r1 == r2) goto L60
            r2 = 245(0xf5, float:3.43E-43)
            if (r1 == r2) goto L60
            r2 = 246(0xf6, float:3.45E-43)
            if (r1 == r2) goto L60
            switch(r1) {
                case 126: goto L60;
                case 127: goto L60;
                case 128: goto L60;
                case 129: goto L60;
                default: goto L56;
            }     // Catch: java.lang.Throwable -> L69
        L56:
            switch(r1) {
                case 135: goto L60;
                case 136: goto L60;
                case 137: goto L60;
                case 138: goto L60;
                case 139: goto L60;
                case 140: goto L60;
                case 141: goto L60;
                case 142: goto L60;
                case 143: goto L60;
                default: goto L59;
            }     // Catch: java.lang.Throwable -> L69
        L59:
            switch(r1) {
                case 145: goto L60;
                case 146: goto L60;
                case 147: goto L60;
                case 148: goto L60;
                case 149: goto L60;
                case 150: goto L60;
                default: goto L5c;
            }     // Catch: java.lang.Throwable -> L69
        L5c:
            switch(r1) {
                case 220: goto L60;
                case 221: goto L60;
                case 222: goto L60;
                default: goto L5f;
            }     // Catch: java.lang.Throwable -> L69
        L5f:
            goto L63
        L60:
            r11.put(r0)     // Catch: java.lang.Throwable -> L69
        L63:
            int r0 = r9.getParentNode(r0)     // Catch: java.lang.Throwable -> L69
            goto L15
        L68:
            return
        L69:
            r0 = move-exception
            boolean r1 = com.aide.codemodel.language.java.JavaCodeAnalyzer.Ws
            if (r1 == 0) goto L7f
            r2 = -1202020468228826400(0xef5190c0b278dae0, double:-1.6644692324342748E228)
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r10)
            r1 = r0
            r4 = r8
            r5 = r9
            r7 = r11
            abcd.iy.U2(r1, r2, r4, r5, r6, r7)
        L7f:
            goto L81
        L80:
            throw r0
        L81:
            goto L80
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.java.JavaCodeAnalyzer.aM(com.aide.codemodel.api.SyntaxTree, int, com.aide.codemodel.api.collections.SetOfInt):void");
    }

    @ey(method = -4623411669849428960L)
    private void j3(SyntaxTree syntaxTree, int i, SetOfInt setOfInt) {
        try {
            if (J8) {
                iy.we(3116651910238826157L, this, syntaxTree, new Integer(i), setOfInt);
            }
            setOfInt.put(i);
            int childCount = syntaxTree.getChildCount(i);
            for (int i2 = 0; i2 < childCount; i2++) {
                j3(syntaxTree, syntaxTree.getChildNode(i, i2), setOfInt);
            }
        } catch (Throwable th) {
            if (Ws) {
                iy.U2(th, 3116651910238826157L, this, syntaxTree, new Integer(i), setOfInt);
            }
            throw th;
        }
    }

    @ey(method = -1263759915982132289L)
    public static /* synthetic */ boolean u7(JavaCodeAnalyzer javaCodeAnalyzer) {
        return javaCodeAnalyzer.DW;
    }

    @Override // com.aide.codemodel.api.abstraction.CodeAnalyzer
    @ey(method = 23812001188047927L)
    public void FH(SyntaxTree syntaxTree) {
        try {
            if (J8) {
                iy.tp(7766630932703750728L, this, syntaxTree);
            }
            a aVarMr = Mr();
            aVarMr.P8(this, this.errorTable, this.entitySpace, this.u7, syntaxTree, null, false, false, false);
            a8(aVarMr);
        } catch (Throwable th) {
            if (Ws) {
                iy.j3(th, 7766630932703750728L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeAnalyzer
    @ey(method = -6086297041943824076L)
    public void Hw(SyntaxTree syntaxTree, int i) {
        try {
            if (J8) {
                iy.EQ(354001668004733955L, this, syntaxTree, new Integer(i));
            }
            SetOfInt setOfInt = new SetOfInt();
            QX(syntaxTree, syntaxTree.getRootNode(), i, setOfInt);
            a aVarMr = Mr();
            aVarMr.P8(this, this.errorTable, this.entitySpace, this.u7, syntaxTree, setOfInt, false, false, false);
            a8(aVarMr);
        } catch (Throwable th) {
            if (Ws) {
                iy.Mr(th, 354001668004733955L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -1991340424002652775L)
    public void U2(Member member) {
        try {
            if (J8) {
                iy.tp(660712044715657560L, this, member);
            }
            member.getFile();
            SyntaxTree syntaxTree = this.syntaxTreeSpace.getSyntaxTree(member.getFile(), member.getLanguage());
            int memberDeclarationNode = syntaxTree.getMemberDeclarationNode(member.DW());
            this.Hw.clear();
            aM(syntaxTree, memberDeclarationNode, this.Hw);
            a aVarMr = Mr();
            aVarMr.P8(this, this.errorTable, this.entitySpace, this.u7, syntaxTree, this.Hw, false, false, true);
            a8(aVarMr);
            this.syntaxTreeSpace.releaseSyntaxTree(syntaxTree);
        } catch (Throwable th) {
            if (Ws) {
                iy.j3(th, 660712044715657560L, this, member);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeAnalyzer
    @ey(method = -3260828599176608900L)
    public void VH(SyntaxTree syntaxTree, int i) {
        try {
            if (J8) {
                iy.EQ(2280765728995812501L, this, syntaxTree, new Integer(i));
            }
            SetOfInt setOfInt = new SetOfInt();
            aM(syntaxTree, i, setOfInt);
            a aVarMr = Mr();
            aVarMr.P8(this, this.errorTable, this.entitySpace, this.u7, syntaxTree, setOfInt, false, false, false);
            a8(aVarMr);
        } catch (Throwable th) {
            if (Ws) {
                iy.Mr(th, 2280765728995812501L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -5881754528308751769L)
    public void Ws(SyntaxTree syntaxTree, int i) {
        try {
            if (J8) {
                iy.EQ(-1399095868973200272L, this, syntaxTree, new Integer(i));
            }
            SetOfInt setOfInt = new SetOfInt();
            j3(syntaxTree, i, setOfInt);
            aM(syntaxTree, i, setOfInt);
            a aVarMr = Mr();
            aVarMr.P8(this, this.errorTable, this.entitySpace, this.u7, syntaxTree, setOfInt, false, false, false);
            a8(aVarMr);
        } catch (Throwable th) {
            if (Ws) {
                iy.Mr(th, -1399095868973200272L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeAnalyzer
    @ey(method = -1584351192589692835L)
    public void Zo(SyntaxTree syntaxTree) {
        try {
            if (J8) {
                iy.tp(-4328190808926628980L, this, syntaxTree);
            }
            SetOfInt setOfInt = new SetOfInt();
            a aVarMr = Mr();
            aVarMr.P8(this, this.errorTable, this.entitySpace, this.u7, syntaxTree, setOfInt, false, false, false);
            a8(aVarMr);
        } catch (Throwable th) {
            if (Ws) {
                iy.j3(th, -4328190808926628980L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeAnalyzer
    @ey(method = -2987921108799285477L)
    public void analyzeEveryIdentifiers(SyntaxTree syntaxTree, SetOfInt setOfInt) {
        try {
            if (J8) {
                iy.EQ(-2790589843169983260L, this, syntaxTree, setOfInt);
            }
            SetOfInt setOfInt2 = new SetOfInt();
            XL(syntaxTree, syntaxTree.getRootNode(), setOfInt, setOfInt2);
            a aVarMr = Mr();
            aVarMr.P8(this, this.errorTable, this.entitySpace, this.u7, syntaxTree, setOfInt2, false, false, false);
            a8(aVarMr);
        } catch (Throwable th) {
            if (Ws) {
                iy.Mr(th, -2790589843169983260L, this, syntaxTree, setOfInt);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeAnalyzer
    @ey(method = 3165255662173161344L)
    public Type analyzeTypeName(SyntaxTree syntaxTree, int i, int i2, String str) {
        try {
            if (J8) {
                iy.J0(-1459695082015791885L, this, syntaxTree, new Integer(i), new Integer(i2), str);
            }
            if (str.equals("boolean")) {
                return this.u7.gW();
            }
            if (str.equals("byte")) {
                return this.u7.BT();
            }
            if (str.equals("short")) {
                return this.u7.jO();
            }
            if (str.equals("int")) {
                return this.u7.ro();
            }
            if (str.equals("char")) {
                return this.u7.vy();
            }
            if (str.equals("long")) {
                return this.u7.CU();
            }
            if (str.equals("float")) {
                return this.u7.KD();
            }
            if (str.equals("double")) {
                return this.u7.SI();
            }
            MapOf<ClassType, Entity> mapOfCU = this.entitySpace.CU(this.identifierSpace.get(str), 0, syntaxTree.getFile(), syntaxTree.getLanguage());
            if (mapOfCU.Mr() == 1) {
                return (Type) mapOfCU.tp();
            }
            throw new e4();
        } catch (Throwable th) {
            if (Ws) {
                iy.a8(th, -1459695082015791885L, this, syntaxTree, new Integer(i), new Integer(i2), str);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeAnalyzer
    @ey(method = 2507799702514758740L)
    public void j6(SyntaxTree syntaxTree, int i) {
        try {
            if (J8) {
                iy.EQ(-2096692003830308031L, this, syntaxTree, new Integer(i));
            }
            SetOfInt setOfInt = new SetOfInt();
            aM(syntaxTree, i, setOfInt);
            a aVarMr = Mr();
            aVarMr.P8(this, this.errorTable, this.entitySpace, this.u7, syntaxTree, setOfInt, false, false, true);
            a8(aVarMr);
        } catch (Throwable th) {
            if (Ws) {
                iy.Mr(th, -2096692003830308031L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 2004653011742482703L)
    public void lg() {
        try {
            if (J8) {
                iy.gn(-3020349366601958820L, this);
            }
            this.j6 = new Stack<>();
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -3020349366601958820L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeAnalyzer
    @ey(method = -2928652777244275200L)
    public void v5(SyntaxTree syntaxTree) {
        try {
            if (J8) {
                iy.tp(4181826857025824391L, this, syntaxTree);
            }
            a aVarMr = Mr();
            aVarMr.P8(this, this.errorTable, this.entitySpace, this.u7, syntaxTree, null, true, true, true);
            a8(aVarMr);
            this.we.gn(syntaxTree);
            this.we.we(syntaxTree);
            this.we.tp(syntaxTree);
            this.J0.DW(syntaxTree);
        } catch (Throwable th) {
            if (Ws) {
                iy.j3(th, 4181826857025824391L, this, syntaxTree);
            }
            throw th;
        }
    }
}
