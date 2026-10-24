package com.aide.codemodel.language.java;

import abcd.cy;
import abcd.dy;
import abcd.e4;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.h4;
import abcd.iy;
import abcd.y1;
import com.aide.codemodel.api.ArrayType;
import com.aide.codemodel.api.ClassType;
import com.aide.codemodel.api.EntitySpace;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.IdentifierSpace;
import com.aide.codemodel.api.Member;
import com.aide.codemodel.api.MethodParameterType;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.Namespace;
import com.aide.codemodel.api.ParameterType;
import com.aide.codemodel.api.ParameterizedType;
import com.aide.codemodel.api.PrimitiveType;
import com.aide.codemodel.api.Type;
import com.aide.codemodel.api.abstraction.Language;
import com.aide.codemodel.api.abstraction.TypeSystem;
import com.aide.codemodel.api.collections.MapOfIntInt;
import com.aide.codemodel.api.collections.SetOf;
import com.aide.engine.service.Native;
import com.aide.uidesigner.ProxyTextView;
import com.probelytics.api.UserTouchAction;

@cy(clazz = 422897820772727925L, container = 422897820772727925L, user = true)
/* loaded from: classes.dex */
public class JavaTypeSystem implements TypeSystem {

    @gy
    private static /* synthetic */ boolean ef;

    @fy
    private static /* synthetic */ boolean sG;

    @dy(field = -7775995933624677095L)
    private int BT;

    @dy(field = 2370694176864096096L)
    private final IdentifierSpace DW;

    @dy(field = -7926373800154485947L)
    private int EQ;

    @dy(field = 2236676134779574072L)
    private final Language FH;

    @dy(field = -2415889179544105817L)
    private final boolean Hw;

    @dy(field = 354869021199580720L)
    private int J0;

    @dy(field = -676922568627822067L)
    private int J8;

    @dy(field = 3628334777956671033L)
    private int KD;

    @dy(field = -5605704026381645197L)
    private int Mr;

    @dy(field = 2561424524617545691L)
    private int P8;

    @dy(field = -5900086868821676211L)
    private int QX;

    @dy(field = 213071244165734448L)
    private int SI;

    @dy(field = 4360572212610294107L)
    private int U2;

    @dy(field = 4577023956995421280L)
    private int VH;

    @dy(field = -3751563847929237693L)
    private int Ws;

    @dy(field = 2997174933707940533L)
    private int XL;

    @dy(field = 4960938217857425979L)
    private int Zo;

    @dy(field = 2185860116372735328L)
    private int a8;

    @dy(field = 1472900449567109640L)
    private int aM;

    @dy(field = 3623358105285785317L)
    private int cb;

    @dy(field = 4812791696074571373L)
    private int cn;

    @dy(field = 524571899713247664L)
    private int dx;

    @dy(field = 970077208792444395L)
    private int ei;

    @dy(field = 4606573591707494232L)
    private int er;

    @dy(field = -2062318871863901064L)
    private int gW;

    @dy(field = 3855311534835578211L)
    private int gn;

    @dy(field = 8911020497722883L)
    private int j3;

    @dy(field = -355717794143175264L)
    private final EntitySpace j6;

    @dy(field = 5213631969351604393L)
    private int lg;

    @dy(field = 517868100931334548L)
    private int nw;

    @dy(field = -2093976295205012100L)
    private int rN;

    @dy(field = -5008399065669723839L)
    private int ro;

    @dy(field = -6637953879012014895L)
    private int sh;

    @dy(field = -3031619243835197389L)
    private int tp;

    @dy(field = -1168613131478470601L)
    private int u7;

    @dy(field = -6430868340920584356L)
    private final boolean v5;

    @dy(field = 2166855551109944032L)
    private int vy;

    @dy(field = -496776406879928439L)
    private int we;

    @dy(field = 1162511896906227111L)
    private int yS;

    static {
        iy.Zo(JavaTypeSystem.class);
    }

    @ey(method = 64430690125458979L)
    public JavaTypeSystem(Model model, Language language) {
        try {
            if (sG) {
                iy.EQ(947856695163848625L, null, model, language);
            }
            this.Hw = true;
            this.v5 = true;
            this.j6 = model.entitySpace;
            IdentifierSpace identifierSpace = model.identifierSpace;
            this.DW = identifierSpace;
            this.FH = language;
            this.Zo = identifierSpace.get("length");
            this.VH = this.DW.get("clone");
            this.gn = this.DW.get("lang");
            this.DW.get("Array");
            this.u7 = this.DW.get("java");
            this.DW.get("Number");
            this.we = this.DW.get("Boolean");
            this.Ws = this.DW.get("Long");
            this.QX = this.DW.get("Integer");
            this.XL = this.DW.get("Short");
            this.aM = this.DW.get("Character");
            this.j3 = this.DW.get("Override");
            this.Mr = this.DW.get("Byte");
            this.U2 = this.DW.get("Float");
            this.a8 = this.DW.get("Double");
            this.lg = this.DW.get("Void");
            this.rN = this.DW.get("Cloneable");
            this.er = this.DW.get("String");
            this.yS = this.DW.get("Class");
            this.gW = this.DW.get("Exception");
            this.BT = this.DW.get("Throwable");
            this.vy = this.DW.get("RuntimeException");
            this.P8 = this.DW.get("Error");
            this.DW.get("System");
            this.ei = this.DW.get("getClass");
            this.J0 = this.DW.get("Object");
            this.J8 = this.DW.get("Iterable");
            this.tp = this.DW.get("util");
            this.nw = this.DW.get("Enum");
            this.EQ = this.DW.get("Collection");
            this.KD = this.DW.get("io");
            this.SI = this.DW.get("Serializable");
            this.DW.get("Invoke");
            this.DW.get("hashCode");
            this.DW.get("equals");
            this.DW.get("finalize");
            this.DW.get("toString");
            this.ro = this.DW.get("junit");
            this.cn = this.DW.get("framework");
            this.sh = this.DW.get("TestCase");
            this.cb = this.DW.get("package-info");
            this.dx = this.DW.get("AutoCloseable");
        } catch (Throwable th) {
            if (ef) {
                iy.Mr(th, 947856695163848625L, null, model, language);
            }
            throw th;
        }
    }

    @ey(method = 5016253434558866148L)
    private boolean Cz(FileEntry fileEntry, Type type, Type type2) {
        try {
            if (sG) {
                iy.we(-1401901710813751939L, this, fileEntry, type, type2);
            }
            if (!type.containsVariable() && !type2.containsVariable()) {
                return false;
            }
            MapOfIntInt mapOfIntInt = new MapOfIntInt();
            if (type.isParameterizedType() && type2.isParameterizedType() && q7(fileEntry, type, type2, mapOfIntInt)) {
                return true;
            }
            if (type.isParameterizedType()) {
                SetOf<Type> allSuperTypes = ((ParameterizedType) type).getAllSuperTypes();
                allSuperTypes.DEFAULT_ITERATOR.init();
                while (allSuperTypes.DEFAULT_ITERATOR.hasMoreElements()) {
                    Type type3 = (Type) allSuperTypes.DEFAULT_ITERATOR.nextKey();
                    mapOfIntInt.clear();
                    if (type3.isParameterizedType() && type2.isParameterizedType() && q7(fileEntry, type3, type2, mapOfIntInt)) {
                        return true;
                    }
                }
            }
            if (type.isClassType()) {
                SetOf<Type> allSuperTypes2 = ((ClassType) type).getAllSuperTypes();
                allSuperTypes2.DEFAULT_ITERATOR.init();
                while (allSuperTypes2.DEFAULT_ITERATOR.hasMoreElements()) {
                    Type type4 = (Type) allSuperTypes2.DEFAULT_ITERATOR.nextKey();
                    mapOfIntInt.clear();
                    if (type4.isParameterizedType() && type2.isParameterizedType() && q7(fileEntry, type4, type2, mapOfIntInt)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            if (ef) {
                iy.U2(th, -1401901710813751939L, this, fileEntry, type, type2);
            }
            throw th;
        }
    }

    @ey(method = 6437528051975317125L)
    private int FN(int i, int i2) {
        try {
            if (sG) {
                iy.EQ(2297892959900356500L, this, new Integer(i), new Integer(i2));
            }
            return Native.j6.a(i, i2);
        } catch (Throwable th) {
            if (ef) {
                iy.Mr(th, 2297892959900356500L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -101723486906108151L)
    private Type aq(Type type, Type type2) {
        try {
            if (sG) {
                iy.EQ(-3277141962448918464L, this, type, type2);
            }
            int semantic = type.getSemantic();
            int semantic2 = type2.getSemantic();
            int iFN = FN(semantic, semantic2);
            if (iFN == 7) {
                return ro();
            }
            if (iFN == semantic) {
                return type;
            }
            if (iFN == semantic2) {
                return type2;
            }
            throw new e4();
        } catch (Throwable th) {
            if (ef) {
                iy.Mr(th, -3277141962448918464L, this, type, type2);
            }
            throw th;
        }
    }

    @ey(method = -2821424207543381720L)
    private boolean fN(FileEntry fileEntry, Type type, Type type2) {
        try {
            if (sG) {
                iy.we(-1567721693838191187L, this, fileEntry, type, type2);
            }
            if (type2.isParameterizedType()) {
                if (type.isClassType()) {
                    return !type.isSubTypeOf(fileEntry, this.FH, type2);
                }
                if (type.isParameterizedType()) {
                    ClassType classType = ((ParameterizedType) type).getClassType();
                    ClassType classType2 = ((ParameterizedType) type2).getClassType();
                    SetOf<Type> allSuperTypes = classType2.getAllSuperTypes();
                    allSuperTypes.DEFAULT_ITERATOR.init();
                    while (allSuperTypes.DEFAULT_ITERATOR.hasMoreElements()) {
                        Type type3 = (Type) allSuperTypes.DEFAULT_ITERATOR.nextKey();
                        if (type3.isParameterizedType() && ((ParameterizedType) type3).getClassType() == classType) {
                            int iPa = classType2.Pa();
                            for (int i = 0; i < iPa; i++) {
                                if (!type3.containsType(classType2.An(i))) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            if (ef) {
                iy.U2(th, -1567721693838191187L, this, fileEntry, type, type2);
            }
            throw th;
        }
    }

    @ey(method = -5919804066568158044L)
    private boolean kf(FileEntry fileEntry, Type type, Type type2) {
        try {
            if (sG) {
                iy.we(4107478050691590159L, this, fileEntry, type, type2);
            }
            return Native.j6.b(type.getSemantic(), type2.getSemantic());
        } catch (Throwable th) {
            if (ef) {
                iy.U2(th, 4107478050691590159L, this, fileEntry, type, type2);
            }
            throw th;
        }
    }

    @ey(method = 454533514552411896L)
    private boolean q7(FileEntry fileEntry, Type type, Type type2, MapOfIntInt mapOfIntInt) {
        try {
            if (sG) {
                iy.J0(-314246750511830741L, this, fileEntry, type, type2, mapOfIntInt);
            }
            if (type.isMethodParameterTypeVariable()) {
                if (type == type2) {
                    return true;
                }
                if (mapOfIntInt.v5(type.getId()) && mapOfIntInt.VH(type.getId()) != type2.getId()) {
                    return false;
                }
                mapOfIntInt.tp(type.getId(), type2.getId());
                return true;
            }
            if (type2.isMethodParameterTypeVariable()) {
                if (type == type2) {
                    return true;
                }
                if (mapOfIntInt.v5(type2.getId()) && mapOfIntInt.VH(type2.getId()) != type.getId()) {
                    return false;
                }
                mapOfIntInt.tp(type2.getId(), type.getId());
                return true;
            }
            if (type.isArrayType() && type2.isArrayType()) {
                return q7(fileEntry, ((ArrayType) type).getElementType(), ((ArrayType) type2).getElementType(), mapOfIntInt);
            }
            if (!type.isParameterizedType() || !type2.isParameterizedType()) {
                return type.isImplicitConvertibleTo(fileEntry, this.FH, type2);
            }
            if (((ParameterizedType) type).getClassType() != ((ParameterizedType) type2).getClassType()) {
                return false;
            }
            int[] absoluteArgumentVariances = ((ParameterizedType) type).getAbsoluteArgumentVariances();
            int[] absoluteArgumentVariances2 = ((ParameterizedType) type2).getAbsoluteArgumentVariances();
            Type[] absoluteArgumentTypes = ((ParameterizedType) type).getAbsoluteArgumentTypes();
            Type[] absoluteArgumentTypes2 = ((ParameterizedType) type2).getAbsoluteArgumentTypes();
            for (int i = 0; i < absoluteArgumentVariances2.length; i++) {
                int i2 = absoluteArgumentVariances[i];
                if (i2 == 0) {
                    int i3 = absoluteArgumentVariances2[i];
                    if (i3 == 0) {
                        if (!q7(fileEntry, absoluteArgumentTypes[i], absoluteArgumentTypes2[i], mapOfIntInt)) {
                            return false;
                        }
                    } else if (i3 == 1 || i3 == 2) {
                        if (!q7(fileEntry, absoluteArgumentTypes[i], absoluteArgumentTypes2[i], mapOfIntInt)) {
                            return false;
                        }
                    } else if (i3 == 3 && !q7(fileEntry, absoluteArgumentTypes2[i], absoluteArgumentTypes[i], mapOfIntInt)) {
                        return false;
                    }
                } else {
                    if (i2 == 1 || i2 == 2) {
                        int i4 = absoluteArgumentVariances2[i];
                        if (i4 != 0) {
                            if (i4 != 1 && i4 != 2) {
                                if (i4 == 3) {
                                    return false;
                                }
                            } else if (!q7(fileEntry, absoluteArgumentTypes[i], absoluteArgumentTypes2[i], mapOfIntInt)) {
                            }
                        }
                        return false;
                    }
                    if (i2 == 3) {
                        int i5 = absoluteArgumentVariances2[i];
                        if (i5 == 0) {
                            return false;
                        }
                        if (i5 == 1 || i5 == 2) {
                            try {
                                return absoluteArgumentTypes2[i] == Eq(fileEntry);
                            } catch (e4 unused) {
                                continue;
                            }
                        } else if (i5 == 3 && !q7(fileEntry, absoluteArgumentTypes2[i], absoluteArgumentTypes[i], mapOfIntInt)) {
                            return false;
                        }
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            if (ef) {
                iy.a8(th, -314246750511830741L, this, fileEntry, type, type2, mapOfIntInt);
            }
            throw th;
        }
    }

    @ey(method = 2831809058291934840L)
    private void rN(FileEntry fileEntry, SetOf<Member> setOf, Type type, Type[] typeArr, int i, int i2, Type[] typeArr2, int i3, int i4, boolean z, boolean z2, SetOf<Member> setOf2) throws Throwable {
        SetOf<Member> setOf3;
        SetOf<Member> setOf4 = setOf2;
        try {
            if (sG) {
                iy.QX(4789692264060366025L, this, new Object[]{fileEntry, setOf, type, typeArr, new Integer(i), new Integer(i2), typeArr2, new Integer(i3), new Integer(i4), new Boolean(z), new Boolean(z2), setOf4});
            }
            setOf2.clear();
            setOf.DEFAULT_ITERATOR.init();
            while (setOf.DEFAULT_ITERATOR.hasMoreElements()) {
                Member member = (Member) setOf.DEFAULT_ITERATOR.nextKey();
                setOf3 = setOf4;
                try {
                    if (k2(fileEntry, member, type, typeArr, i, i2, typeArr2, i3, i4, z, z2)) {
                        setOf3.put(member);
                    }
                    setOf4 = setOf3;
                } catch (Throwable th) {
                    th = th;
                    if (ef) {
                        iy.rN(th, 4789692264060366025L, this, new Object[]{fileEntry, setOf, type, typeArr, new Integer(i), new Integer(i2), typeArr2, new Integer(i3), new Integer(i4), new Boolean(z), new Boolean(z2), setOf3});
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            setOf3 = setOf4;
        }
    }

    @ey(method = -184364574011714157L)
    public boolean AL(FileEntry fileEntry, Type type, Type type2) {
        try {
            if (sG) {
                iy.we(-5689588592900839400L, this, fileEntry, type, type2);
            }
            try {
                if (Jl(type) && iW(type2)) {
                    return Hw(fileEntry, type).isImplicitConvertibleTo(fileEntry, this.FH, type2);
                }
                return false;
            } catch (e4 unused) {
                return false;
            }
        } catch (Throwable th) {
            if (ef) {
                iy.U2(th, -5689588592900839400L, this, fileEntry, type, type2);
            }
            throw th;
        }
    }

    @ey(method = -3746655704011560615L)
    public PrimitiveType BT() {
        try {
            if (sG) {
                iy.gn(3676900032286353368L, this);
            }
            return this.j6.hK(this.FH, 1);
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, 3676900032286353368L, this);
            }
            throw th;
        }
    }

    @ey(method = 1154966582846007425L)
    public PrimitiveType CU() {
        try {
            if (sG) {
                iy.gn(-431355372832652352L, this);
            }
            return this.j6.hK(this.FH, 5);
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, -431355372832652352L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.TypeSystem
    @ey(method = -32759043790889592L)
    public boolean DW() {
        try {
            if (!sG) {
                return false;
            }
            iy.gn(148891811601863737L, this);
            return false;
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, 148891811601863737L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.TypeSystem
    @ey(method = -501515859238214240L)
    public ClassType EQ(FileEntry fileEntry) {
        try {
            if (sG) {
                iy.tp(100574493778771967L, this, fileEntry);
            }
            return Eq(fileEntry);
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, 100574493778771967L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = -5688062034037912749L)
    public ClassType Eq(FileEntry fileEntry) {
        try {
            if (sG) {
                iy.tp(183262513288536416L, this, fileEntry);
            }
            return br(fileEntry).sG(fileEntry, this.FH, this.J0, true, 0, nw());
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, 183262513288536416L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = -327947658930702127L)
    public Type Ev(FileEntry fileEntry, int i, Type type) {
        try {
            if (sG) {
                iy.we(423096548385537792L, this, fileEntry, new Integer(i), type);
            }
            if (this.Hw && iW(type)) {
                type = ye(fileEntry, type);
            }
            if (i == 1 || i == 2) {
                int semantic = type.getSemantic();
                if (semantic != 3 && semantic != 4 && semantic != 5 && semantic != 7) {
                    if (semantic != 9) {
                        switch (semantic) {
                            case 12:
                                break;
                            case 13:
                            case 14:
                                break;
                            default:
                                throw new e4();
                        }
                    }
                    return type;
                }
                return ro();
            }
            if (i == 20) {
                int semantic2 = type.getSemantic();
                if (semantic2 != 3 && semantic2 != 4 && semantic2 != 5 && semantic2 != 7) {
                    if (semantic2 == 9) {
                        return type;
                    }
                    if (semantic2 != 12) {
                        throw new e4();
                    }
                }
                return ro();
            }
            if (i == 21) {
                if (type.getSemantic() == 11) {
                    return type;
                }
                throw new e4();
            }
            if (i != 23 && i != 24) {
                throw new e4();
            }
            int semantic3 = type.getSemantic();
            if (semantic3 != 3 && semantic3 != 4 && semantic3 != 5 && semantic3 != 7 && semantic3 != 9) {
                switch (semantic3) {
                    case 12:
                    case 13:
                    case 14:
                        break;
                    default:
                        throw new e4();
                }
            }
            return type;
        } catch (Throwable th) {
            if (ef) {
                iy.U2(th, 423096548385537792L, this, fileEntry, new Integer(i), type);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.TypeSystem
    @ey(method = -6057516136719448320L)
    public boolean FH() {
        try {
            if (!sG) {
                return false;
            }
            iy.gn(5325639814368072081L, this);
            return false;
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, 5325639814368072081L, this);
            }
            throw th;
        }
    }

    @ey(method = -1457932590911418711L)
    public boolean Gj(Member member) {
        Type typeQp;
        try {
            if (sG) {
                iy.tp(172849194591025960L, this, member);
            }
            if (member.gG()) {
                return false;
            }
            int iOY = member.oY();
            for (int i = 0; i < iOY; i++) {
                try {
                    typeQp = member.qp(i);
                } catch (e4 unused) {
                }
                if (typeQp.x9() != typeQp) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, 172849194591025960L, this, member);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.TypeSystem
    @ey(method = -3515133762305087652L)
    public Type Hw(FileEntry fileEntry, Type type) {
        try {
            if (sG) {
                iy.EQ(-1342773364141417823L, this, fileEntry, type);
            }
            int semantic = type.getSemantic();
            if (semantic == 3) {
                return sG(fileEntry);
            }
            if (semantic == 5) {
                return kQ(fileEntry);
            }
            if (semantic == 7) {
                return Qq(fileEntry);
            }
            if (semantic == 9) {
                return aj(fileEntry);
            }
            switch (semantic) {
                case 11:
                    return dx(fileEntry);
                case 12:
                    return ef(fileEntry);
                case 13:
                    return x9(fileEntry);
                case 14:
                    return g3(fileEntry);
                default:
                    throw new e4();
            }
        } catch (Throwable th) {
            if (ef) {
                iy.Mr(th, -1342773364141417823L, this, fileEntry, type);
            }
            throw th;
        }
    }

    @ey(method = -2603565029872071900L)
    public ClassType I(FileEntry fileEntry) {
        try {
            if (sG) {
                iy.tp(-77143216730564001L, this, fileEntry);
            }
            return br(fileEntry).sG(fileEntry, this.FH, this.P8, true, 0, br(fileEntry));
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, -77143216730564001L, this, fileEntry);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.TypeSystem
    @ey(method = 3460964683737231196L)
    public boolean J0() {
        try {
            if (sG) {
                iy.gn(-7479949753656937375L, this);
            }
            return this.Hw;
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, -7479949753656937375L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.TypeSystem
    @ey(method = -260741410172361552L)
    public boolean J8(FileEntry fileEntry, Type type, Type type2) {
        try {
            if (sG) {
                iy.we(337264750858714867L, this, fileEntry, type, type2);
            }
            if (this.Hw && sE(fileEntry, type, type2)) {
                return true;
            }
            if (this.Hw && AL(fileEntry, type, type2)) {
                return true;
            }
            if (type2.XX(type)) {
                return true;
            }
            switch (type.getSemantic()) {
                case 1:
                case 11:
                    return false;
                case 2:
                    return iW(type2);
                case 3:
                case 4:
                case 5:
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                case UserTouchAction.CLICK_KIND /* 7 */:
                case 8:
                case 9:
                case 10:
                case 12:
                case 13:
                case 14:
                    switch (type2.getSemantic()) {
                        case 3:
                        case 4:
                        case 5:
                        case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                        case UserTouchAction.CLICK_KIND /* 7 */:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 13:
                        case 14:
                            return true;
                        case 11:
                        default:
                            return false;
                    }
                default:
                    if (!iW(type2)) {
                        return false;
                    }
                    if (type.containsVariable()) {
                        type = type.Qq();
                    }
                    if (type2 == Eq(fileEntry)) {
                        return true;
                    }
                    if (type.isInterfaceType() && (type2.isInterfaceType() || !type2.isSealedType())) {
                        return true;
                    }
                    if (type2.isInterfaceType() && !type.isSealedType()) {
                        return true;
                    }
                    if (!type.isClassType()) {
                        if (type.isParameterizedType()) {
                            if (type2.isClassType()) {
                                return J8(fileEntry, type.x9(), type2);
                            }
                            if (type2.isParameterizedType()) {
                                return J8(fileEntry, type.x9(), type2.x9());
                            }
                            return true;
                        }
                        if (type.isArrayType()) {
                            if (type2.isClassType()) {
                                if (type2 == vJ(fileEntry) || type2 == sh(fileEntry)) {
                                    return true;
                                }
                            } else {
                                if (type2.isParameterizedType()) {
                                    return false;
                                }
                                if (type2.isArrayType()) {
                                    Type elementType = ((ArrayType) type).getElementType();
                                    if (!iW(elementType)) {
                                        return false;
                                    }
                                    Type elementType2 = ((ArrayType) type2).getElementType();
                                    if (iW(elementType2)) {
                                        return J8(fileEntry, elementType, elementType2);
                                    }
                                    return false;
                                }
                            }
                        }
                        return true;
                    }
                    if (type == Eq(fileEntry)) {
                        return true;
                    }
                    if (type2.isClassType()) {
                        if (((ClassType) type).Ej((ClassType) type2) || ((ClassType) type2).Ej((ClassType) type)) {
                            return true;
                        }
                    } else {
                        if (!type2.isArrayType()) {
                            if (type2.isParameterizedType()) {
                                return J8(fileEntry, type, type2.x9());
                            }
                            return true;
                        }
                        if (type == vJ(fileEntry) || type == sh(fileEntry)) {
                            return true;
                        }
                    }
                    return false;
            }
        } catch (Throwable th) {
            if (ef) {
                iy.U2(th, 337264750858714867L, this, fileEntry, type, type2);
            }
            throw th;
        }
    }

    @ey(method = 5791157260171049228L)
    public boolean Jl(Type type) {
        try {
            if (sG) {
                iy.tp(670826870382682035L, this, type);
            }
            int semantic = type.getSemantic();
            return (semantic == 1 || semantic == 2 || semantic == 16) ? false : true;
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, 670826870382682035L, this, type);
            }
            throw th;
        }
    }

    @ey(method = -3967798242543161949L)
    public PrimitiveType KD() {
        try {
            if (sG) {
                iy.gn(2729335772747195904L, this);
            }
            return this.j6.hK(this.FH, 6);
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, 2729335772747195904L, this);
            }
            throw th;
        }
    }

    @ey(method = 2765220824649076765L)
    public boolean Mr(FileEntry fileEntry, Member member) {
        try {
            if (sG) {
                iy.EQ(-233395373154865260L, this, fileEntry, member);
            }
            ClassType enclosingClassType = member.getEnclosingClassType();
            SetOf<Member> setOfJO = member.jO();
            setOfJO.DEFAULT_ITERATOR.init();
            while (setOfJO.DEFAULT_ITERATOR.hasMoreElements()) {
                if (!j3(fileEntry, enclosingClassType, member, (Member) setOfJO.DEFAULT_ITERATOR.nextKey())) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (ef) {
                iy.Mr(th, -233395373154865260L, this, fileEntry, member);
            }
            throw th;
        }
    }

    @ey(method = 295875625281344383L)
    public ClassType Mz(FileEntry fileEntry) {
        try {
            if (sG) {
                iy.tp(383658446940704160L, this, fileEntry);
            }
            return br(fileEntry).sG(fileEntry, this.FH, this.nw, true, 0, br(fileEntry));
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, 383658446940704160L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = 684551808785785080L)
    public ClassType OW(FileEntry fileEntry) {
        try {
            if (sG) {
                iy.tp(-100680621250083425L, this, fileEntry);
            }
            return br(fileEntry).sG(fileEntry, this.FH, this.j3, true, 0, br(fileEntry));
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, -100680621250083425L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = -2489326733859890041L)
    public int P8() {
        try {
            if (sG) {
                iy.gn(-5047044231176646360L, this);
            }
            return this.VH;
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, -5047044231176646360L, this);
            }
            throw th;
        }
    }

    @ey(method = 849241401265022596L)
    public boolean Q6(FileEntry fileEntry, Type type, Type type2) {
        try {
            if (sG) {
                iy.we(-1439883094543351217L, this, fileEntry, type, type2);
            }
            if (Jl(type) && Jl(type2)) {
                return true;
            }
            if (!this.Hw) {
                return false;
            }
            if (!Jl(type) && !Jl(type2)) {
                return false;
            }
            try {
                if (this.Hw && iW(type)) {
                    type = ye(fileEntry, type);
                }
                if (this.Hw && iW(type2)) {
                    ye(fileEntry, type2);
                }
                return true;
            } catch (e4 unused) {
                return false;
            }
        } catch (Throwable th) {
            Type type3 = type;
            if (ef) {
                iy.U2(th, -1439883094543351217L, this, fileEntry, type3, type2);
            }
            throw th;
        }
    }

    @ey(method = 1739978980827362072L)
    public long QO(String str) {
        long j;
        try {
            if (sG) {
                iy.tp(114249266945786133L, this, str);
            }
            if (str.contains("_")) {
                str = str.replace("_", "");
            }
            int i = 2;
            long j2 = 0;
            if (str.startsWith("0x") || str.startsWith("0X")) {
                while (i < str.length() - 1) {
                    int i2 = i + 1;
                    int iDigit = Character.digit(str.charAt(i), 16);
                    if (iDigit < 0) {
                        throw new e4();
                    }
                    j2 = (j2 * 16) + iDigit;
                    i = i2;
                }
            } else if (str.startsWith("0b") || str.startsWith("0B")) {
                int i3 = 2;
                while (i3 < str.length() - 1) {
                    int i4 = i3 + 1;
                    int iDigit2 = Character.digit(str.charAt(i3), 2);
                    if (iDigit2 < 0) {
                        throw new e4();
                    }
                    j2 = (j2 * 2) + iDigit2;
                    i3 = i4;
                }
            } else {
                if (str.startsWith("0") && str.length() > 1) {
                    j = 0;
                    int i5 = 1;
                    while (i5 < str.length() - 1) {
                        int i6 = i5 + 1;
                        int iDigit3 = Character.digit(str.charAt(i5), 8);
                        if (iDigit3 < 0) {
                            throw new e4();
                        }
                        if (((-2305843009213693952L) & j) != 0) {
                            throw new e4();
                        }
                        j = (j * 8) + iDigit3;
                        i5 = i6;
                    }
                    this.j6.lp(j);
                    return j;
                }
                if (str.length() <= 0) {
                    throw new e4();
                }
                int i7 = 0;
                while (i7 < str.length() - 1) {
                    int i8 = i7 + 1;
                    int iDigit4 = Character.digit(str.charAt(i7), 10);
                    if (iDigit4 < 0) {
                        throw new e4();
                    }
                    if (j2 > 922337203685477580L) {
                        throw new e4();
                    }
                    if (j2 == 922337203685477580L && iDigit4 == 9) {
                        throw new e4();
                    }
                    j2 = (j2 * 10) + iDigit4;
                    i7 = i8;
                }
            }
            j = j2;
            this.j6.lp(j);
            return j;
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, 114249266945786133L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -18105266201796536L)
    public boolean QX(FileEntry fileEntry, Member member) {
        try {
            if (sG) {
                iy.EQ(517636193792481605L, this, fileEntry, member);
            }
            ClassType enclosingClassType = member.getEnclosingClassType();
            SetOf<Member> setOfJO = member.jO();
            setOfJO.DEFAULT_ITERATOR.init();
            while (setOfJO.DEFAULT_ITERATOR.hasMoreElements()) {
                if (!Ws(fileEntry, enclosingClassType, member, (Member) setOfJO.DEFAULT_ITERATOR.nextKey())) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (ef) {
                iy.Mr(th, 517636193792481605L, this, fileEntry, member);
            }
            throw th;
        }
    }

    @ey(method = 1892968028619797496L)
    public ClassType Qq(FileEntry fileEntry) {
        try {
            if (sG) {
                iy.tp(-723890293947959535L, this, fileEntry);
            }
            return br(fileEntry).sG(fileEntry, this.FH, this.QX, true, 0, br(fileEntry));
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, -723890293947959535L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = 1423300525495391220L)
    public PrimitiveType SI() {
        try {
            if (sG) {
                iy.gn(4475491407319704247L, this);
            }
            return this.j6.hK(this.FH, 7);
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, 4475491407319704247L, this);
            }
            throw th;
        }
    }

    @ey(method = 2982316971577001420L)
    public ClassType Sf(FileEntry fileEntry) {
        try {
            if (sG) {
                iy.tp(-2474784181664443309L, this, fileEntry);
            }
            return br(fileEntry).sG(fileEntry, this.FH, this.yS, true, 0, br(fileEntry));
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, -2474784181664443309L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = 325786443378463080L)
    public boolean U2(FileEntry fileEntry) {
        try {
            if (sG) {
                iy.tp(3136904564310717485L, this, fileEntry);
            }
            try {
                return br(fileEntry).Mz(fileEntry, this.FH, this.J8, true, 0, br(fileEntry));
            } catch (e4 unused) {
                return false;
            }
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, 3136904564310717485L, this, fileEntry);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.TypeSystem
    @ey(method = 23180383307792305L)
    public boolean VH(FileEntry fileEntry, Type type, Type type2) {
        try {
            if (sG) {
                iy.we(446489800724943360L, this, fileEntry, type, type2);
            }
            if (this.Hw && AL(fileEntry, type, type2)) {
                return true;
            }
            if ((this.Hw && sE(fileEntry, type, type2)) || type2.XX(type) || kf(fileEntry, type, type2)) {
                return true;
            }
            if (type.getSemantic() == 2) {
                return iW(type2);
            }
            try {
                if (type2 == Eq(fileEntry)) {
                    if (iW(type)) {
                        return true;
                    }
                }
            } catch (e4 unused) {
            }
            if (type.isArrayType()) {
                if (type2 == vJ(fileEntry)) {
                    return true;
                }
                if (type2 == sh(fileEntry)) {
                    return true;
                }
                if (!type2.isArrayType() || ((ArrayType) type).jO() != ((ArrayType) type2).jO()) {
                    return false;
                }
                Type elementType = ((ArrayType) type).getElementType();
                Type elementType2 = ((ArrayType) type2).getElementType();
                if (elementType2.XX(elementType)) {
                    return true;
                }
                if (iW(elementType) && iW(elementType2)) {
                    return elementType.isImplicitConvertibleTo(fileEntry, this.FH, elementType2);
                }
                return false;
            }
            if (type.isClassType()) {
                if (!type2.isClassType()) {
                    if (type2.isParameterizedType()) {
                        if (type == ((ParameterizedType) type2).getClassType() || type.isSubTypeOf(fileEntry, this.FH, type2) || type.isSubTypeOf(fileEntry, this.FH, ((ParameterizedType) type2).getClassType())) {
                            return true;
                        }
                        if (type.et() && ((ClassType) type).Ej(((ParameterizedType) type2).getClassType())) {
                            return true;
                        }
                        return Cz(fileEntry, type, type2);
                    }
                    if (type2.isMethodParameterTypeVariable()) {
                        return true;
                    }
                } else if (((ClassType) type).Ej((ClassType) type2)) {
                    return true;
                }
            } else if (!type.isParameterizedType()) {
                try {
                    if (type.isParameterType()) {
                        int iYe = ((ParameterType) type).ye();
                        for (int i = 0; i < iYe; i++) {
                            if (((ParameterType) type).Ev(i).isImplicitConvertibleTo(fileEntry, this.FH, type2)) {
                                return true;
                            }
                        }
                    } else if (type.isMethodParameterType()) {
                        int iYe2 = ((MethodParameterType) type).ye();
                        for (int i2 = 0; i2 < iYe2; i2++) {
                            if (((MethodParameterType) type).ko(i2).isImplicitConvertibleTo(fileEntry, this.FH, type2)) {
                                return true;
                            }
                        }
                    } else if (type.isMethodParameterTypeVariable()) {
                        return iW(type2);
                    }
                } catch (e4 unused2) {
                }
            } else if (type2.isClassType()) {
                ClassType classType = ((ParameterizedType) type).getClassType();
                if (classType == type2 || classType.fN().contains(type2)) {
                    return true;
                }
            } else {
                if (type2.isParameterizedType()) {
                    if (type.isSubTypeOf(fileEntry, this.FH, type2)) {
                        return true;
                    }
                    return Cz(fileEntry, type, type2);
                }
                if (type2.isMethodParameterTypeVariable()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (ef) {
                iy.U2(th, 446489800724943360L, this, fileEntry, type, type2);
            }
            throw th;
        }
    }

    @ey(method = -1371653689469637041L)
    public PrimitiveType WB() {
        try {
            if (sG) {
                iy.gn(-2614238087263873056L, this);
            }
            return this.j6.hK(this.FH, 8);
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, -2614238087263873056L, this);
            }
            throw th;
        }
    }

    @ey(method = 154647195563725776L)
    public boolean Ws(FileEntry fileEntry, ClassType classType, Member member, Member member2) {
        try {
            if (sG) {
                iy.J0(2600089995632751621L, this, fileEntry, classType, member, member2);
            }
            try {
                Type typeU9 = classType.u9();
                int iXG = member.XG();
                int iXG2 = member2.XG();
                for (int i = 0; i < iXG; i++) {
                    Type typeXX = member.XX(i);
                    if (w9(fileEntry, typeXX)) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= iXG2) {
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= iXG2) {
                                        if (this.Hw) {
                                            for (int i4 = 0; i4 < iXG2; i4++) {
                                                if (typeXX.kQ(member2.kQ(i4, typeU9), member, member2)) {
                                                    break;
                                                }
                                            }
                                        }
                                        return false;
                                    }
                                    if (typeXX.isImplicitConvertibleTo(fileEntry, this.FH, member2.kQ(i3, typeU9))) {
                                        break;
                                    }
                                    i3++;
                                }
                            } else {
                                if (typeXX == member2.kQ(i2, typeU9)) {
                                    break;
                                }
                                i2++;
                            }
                        }
                    }
                }
                return true;
            } catch (e4 unused) {
                return true;
            }
        } catch (Throwable th) {
            if (ef) {
                iy.a8(th, 2600089995632751621L, this, fileEntry, classType, member, member2);
            }
            throw th;
        }
    }

    @ey(method = 7015548310787602904L)
    public ClassType XG(FileEntry fileEntry) {
        try {
            if (sG) {
                iy.tp(-4255699955177550399L, this, fileEntry);
            }
            return br(fileEntry).sG(fileEntry, this.FH, this.BT, true, 0, br(fileEntry));
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, -4255699955177550399L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = -4036748537412786789L)
    public boolean XL(Member member) {
        try {
            if (sG) {
                iy.tp(4852037308337956972L, this, member);
            }
            SetOf<Member> setOfJO = member.jO();
            setOfJO.DEFAULT_ITERATOR.init();
            while (setOfJO.DEFAULT_ITERATOR.hasMoreElements()) {
                if (!aM(member, (Member) setOfJO.DEFAULT_ITERATOR.nextKey())) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, 4852037308337956972L, this, member);
            }
            throw th;
        }
    }

    @ey(method = 2812376538436461867L)
    public ClassType XX(FileEntry fileEntry) {
        try {
            if (sG) {
                iy.tp(2307048071158434960L, this, fileEntry);
            }
            return br(fileEntry).sG(fileEntry, this.FH, this.vy, true, 0, br(fileEntry));
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, 2307048071158434960L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = 3219190582809782672L)
    public PrimitiveType Xa() {
        try {
            if (sG) {
                iy.gn(1347988151330109225L, this);
            }
            return this.j6.hK(this.FH, 9);
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, 1347988151330109225L, this);
            }
            throw th;
        }
    }

    @ey(method = -1842461479495621888L)
    public boolean Z1(FileEntry fileEntry, Type type, Type type2, boolean z) {
        try {
            if (sG) {
                iy.J0(4782067981148819979L, this, fileEntry, type, type2, new Boolean(z));
            }
            if (!z || Jl(type2) == Jl(type)) {
                return type.isImplicitConvertibleTo(fileEntry, this.FH, type2);
            }
            return false;
        } catch (Throwable th) {
            if (ef) {
                iy.a8(th, 4782067981148819979L, this, fileEntry, type, type2, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.TypeSystem
    @ey(method = 6402880557273391680L)
    public ClassType Zo(FileEntry fileEntry) {
        try {
            if (sG) {
                iy.tp(-2775294244048774175L, this, fileEntry);
            }
            return Eq(fileEntry);
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, -2775294244048774175L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = -2010935543210507672L)
    public boolean a8(FileEntry fileEntry) {
        try {
            if (sG) {
                iy.tp(-572956165732160595L, this, fileEntry);
            }
            try {
                return nw().ef(fileEntry, this.u7, true).ef(fileEntry, this.tp, true).Mz(fileEntry, this.FH, this.EQ, true, 0, br(fileEntry));
            } catch (e4 unused) {
                return false;
            }
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, -572956165732160595L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = -53245068366023860L)
    public boolean aM(Member member, Member member2) {
        try {
            if (sG) {
                iy.EQ(-5708438154857869325L, this, member, member2);
            }
            int modifiers = member2.getModifiers();
            int modifiers2 = member.getModifiers();
            if (y1.XL(modifiers) || y1.aM(modifiers) != y1.aM(modifiers2)) {
                return false;
            }
            if (y1.J8(modifiers)) {
                return y1.J8(modifiers2);
            }
            if (y1.gn(modifiers)) {
                return true;
            }
            return y1.J0(modifiers) ? y1.J8(modifiers2) || y1.J0(modifiers2) : !y1.gn(modifiers2);
        } catch (Throwable th) {
            if (ef) {
                iy.Mr(th, -5708438154857869325L, this, member, member2);
            }
            throw th;
        }
    }

    @ey(method = -153183390859381320L)
    public long aX(String str) {
        try {
            if (sG) {
                iy.tp(-1830947503020064065L, this, str);
            }
            try {
                if (str.contains("_")) {
                    str = str.replace("_", "");
                }
                return this.j6.sy(h4.j6() != null ? h4.j6().DW(str) : (float) Double.parseDouble(str));
            } catch (NumberFormatException unused) {
                throw new e4();
            }
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, -1830947503020064065L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -81534451187108520L)
    public ClassType aj(FileEntry fileEntry) {
        try {
            if (sG) {
                iy.tp(140840785115382719L, this, fileEntry);
            }
            return br(fileEntry).sG(fileEntry, this.FH, this.Ws, true, 0, br(fileEntry));
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, 140840785115382719L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = 6420886908546106752L)
    public Namespace br(FileEntry fileEntry) {
        try {
            if (sG) {
                iy.tp(-3625422009915968381L, this, fileEntry);
            }
            return nw().ef(fileEntry, this.u7, true).ef(fileEntry, this.gn, true);
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, -3625422009915968381L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = 2892078056997536627L)
    public boolean cT(Member member, Type type, Type[] typeArr, int i, int i2) {
        Type containingTypeOfMember;
        try {
            if (sG) {
                iy.J8(568845868685567352L, this, member, type, typeArr, new Integer(i), new Integer(i2));
            }
            if (!type.isClassType()) {
                if (type.isParameterizedType()) {
                    containingTypeOfMember = ((ParameterizedType) type).getClassType().getContainingTypeOfMember(member);
                }
                return false;
            }
            containingTypeOfMember = ((ClassType) type).getContainingTypeOfMember(member);
            int iOY = member.oY();
            for (int i3 = 0; i3 < iOY; i3++) {
                try {
                    Type typeQp = member.qp(i3);
                    if (typeQp.isParameterType() && containingTypeOfMember.isParameterizedType() && type.isParameterizedType()) {
                        Type typeMb = ((ParameterizedType) containingTypeOfMember).mb(typeQp, false);
                        if (typeMb.isParameterType() && ((ParameterType) typeMb).WB() == ((ParameterizedType) type).getClassType() && ((((ParameterizedType) type).getAbsoluteArgumentVariances()[((ParameterType) typeMb).ko()] == 2 || ((ParameterizedType) type).getAbsoluteArgumentVariances()[((ParameterType) typeMb).ko()] == 1) && i2 > i3 && typeArr[i + i3].getSemantic() != 2)) {
                            return true;
                        }
                    }
                } catch (e4 unused) {
                }
            }
            return false;
        } catch (Throwable th) {
            if (ef) {
                iy.lg(th, 568845868685567352L, this, member, type, typeArr, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -7271027705405708721L)
    public ClassType ca(FileEntry fileEntry) {
        try {
            if (sG) {
                iy.tp(-2830472899996781756L, this, fileEntry);
            }
            return br(fileEntry).sG(fileEntry, this.FH, this.gW, true, 0, br(fileEntry));
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, -2830472899996781756L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = 274234397431558815L)
    public ClassType cb(FileEntry fileEntry) {
        try {
            if (sG) {
                iy.tp(293746845690287716L, this, fileEntry);
            }
            return br(fileEntry).sG(fileEntry, this.FH, this.dx, true, 0, br(fileEntry));
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, 293746845690287716L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = -281453212110264356L)
    public ClassType cn(FileEntry fileEntry) {
        try {
            if (sG) {
                iy.tp(-150917889851504357L, this, fileEntry);
            }
            return nw().ef(fileEntry, this.ro, true).ef(fileEntry, this.cn, true).sG(fileEntry, this.FH, this.sh, true, 0, nw());
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, -150917889851504357L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = 3611270444700210440L)
    public ClassType dx(FileEntry fileEntry) {
        try {
            if (sG) {
                iy.tp(629401065901844737L, this, fileEntry);
            }
            return br(fileEntry).sG(fileEntry, this.FH, this.we, true, 0, br(fileEntry));
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, 629401065901844737L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = 2780428954218080L)
    public boolean e3(FileEntry fileEntry, Type type) {
        try {
            if (sG) {
                iy.EQ(-7647613301286101929L, this, fileEntry, type);
            }
            try {
                return type.isImplicitConvertibleTo(fileEntry, this.FH, XG(fileEntry));
            } catch (e4 unused) {
                return false;
            }
        } catch (Throwable th) {
            if (ef) {
                iy.Mr(th, -7647613301286101929L, this, fileEntry, type);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0079 A[Catch: all -> 0x0103, TryCatch #0 {all -> 0x0103, blocks: (B:3:0x0007, B:5:0x000b, B:6:0x000e, B:8:0x0014, B:9:0x001a, B:11:0x0024, B:14:0x002e, B:16:0x0036, B:19:0x0040, B:21:0x0048, B:23:0x004f, B:25:0x0055, B:27:0x0063, B:29:0x0068, B:30:0x006d, B:31:0x0072, B:32:0x0073, B:33:0x0078, B:72:0x00fc, B:34:0x0079, B:37:0x0080, B:39:0x0086, B:47:0x00a0, B:48:0x00a5, B:49:0x00a6, B:50:0x00ab, B:51:0x00b0, B:52:0x00b1, B:53:0x00b6, B:55:0x00b9, B:56:0x00be, B:58:0x00c0, B:60:0x00c6, B:62:0x00d2, B:63:0x00d7, B:64:0x00dc, B:65:0x00dd, B:67:0x00e3, B:69:0x00f1, B:70:0x00f6, B:71:0x00fb), top: B:81:0x0007 }] */
    @abcd.ey(method = 1852914879932729919L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long e9(java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.java.JavaTypeSystem.e9(java.lang.String):long");
    }

    @ey(method = -4884593833969050465L)
    public boolean eU(FileEntry fileEntry, Member member, Member member2, Type type, int i) {
        try {
            if (sG) {
                iy.J8(111886137971088064L, this, fileEntry, member, member2, type, new Integer(i));
            }
            return this.Hw ? n5(fileEntry, member, member2, type, i) && !n5(fileEntry, member2, member, type, i) : n5(fileEntry, member, member2, type, i);
        } catch (Throwable th) {
            if (ef) {
                iy.lg(th, 111886137971088064L, this, fileEntry, member, member2, type, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -432627284052348801L)
    public ClassType ef(FileEntry fileEntry) {
        try {
            if (sG) {
                iy.tp(2705714331141893280L, this, fileEntry);
            }
            return br(fileEntry).sG(fileEntry, this.FH, this.aM, true, 0, br(fileEntry));
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, 2705714331141893280L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = 5887631548173294360L)
    public Type ei(FileEntry fileEntry, Type type, Type type2, long j) {
        try {
            if (sG) {
                iy.J0(-435982975228674863L, this, fileEntry, type, type2, new Long(j));
            }
            if (type2.getSemantic() == 7) {
                int semantic = type.getSemantic();
                if (semantic != 3) {
                    if (semantic != 4) {
                        if (semantic != 5) {
                            if (semantic == 12 && this.j6.I(j) >= 0 && this.j6.I(j) <= 65535) {
                                return vy();
                            }
                        } else if (this.j6.I(j) >= -32768 && this.j6.I(j) <= 32767) {
                            return jO();
                        }
                    } else if (this.j6.I(j) >= 0 && this.j6.I(j) <= 255) {
                        return BT();
                    }
                } else if (this.j6.I(j) >= -128 && this.j6.I(j) <= 127) {
                    return BT();
                }
            }
            return gn(fileEntry, type, type2);
        } catch (Throwable th) {
            if (ef) {
                iy.a8(th, -435982975228674863L, this, fileEntry, type, type2, new Long(j));
            }
            throw th;
        }
    }

    @ey(method = 2645605395830868021L)
    public Type er(FileEntry fileEntry, int i, Type type, Type type2) {
        try {
            if (sG) {
                iy.J0(3898847118397774920L, this, fileEntry, new Integer(i), type, type2);
            }
            switch (i) {
                case 1:
                    return (type != oY(fileEntry) || type2.getSemantic() == 1) ? (type2 != oY(fileEntry) || type.getSemantic() == 1) ? tp(fileEntry, i, type, type2) : type2 : type;
                case 2:
                case 3:
                case 4:
                case 5:
                    return tp(fileEntry, i, type, type2);
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                case UserTouchAction.CLICK_KIND /* 7 */:
                case 8:
                    if (this.Hw && iW(type)) {
                        type = ye(fileEntry, type);
                    }
                    if (this.Hw && iW(type2)) {
                        type2 = ye(fileEntry, type2);
                    }
                    if (type.getSemantic() == 11) {
                        if (type2.getSemantic() == 11) {
                            return gW();
                        }
                        throw new e4();
                    }
                    if (type2.getSemantic() == 11) {
                        if (type.getSemantic() == 11) {
                            return gW();
                        }
                        throw new e4();
                    }
                    Type typeTp = tp(fileEntry, i, type, type2);
                    if (typeTp.getSemantic() == 13) {
                        throw new e4();
                    }
                    if (typeTp.getSemantic() != 14) {
                        return typeTp;
                    }
                    throw new e4();
                case 9:
                case 10:
                    if (Jl(type) != Jl(type2)) {
                        if (!this.Hw) {
                            throw new e4();
                        }
                        try {
                            if (!Jl(type)) {
                                type = ye(fileEntry, type);
                            }
                            if (!Jl(type2)) {
                                type2 = ye(fileEntry, type2);
                            }
                            return er(fileEntry, i, type, type2);
                        } catch (e4 unused) {
                        }
                    }
                    if (!type.yO(fileEntry, this.FH, type2) && !type2.yO(fileEntry, this.FH, type) && !type.x9().yO(fileEntry, this.FH, type2.x9()) && !type2.x9().yO(fileEntry, this.FH, type.x9())) {
                        throw new e4();
                    }
                    return gW();
                case 11:
                case 12:
                case 13:
                case 14:
                    tp(fileEntry, i, type, type2);
                    return gW();
                case 15:
                case 16:
                    if (this.Hw && iW(type)) {
                        type = ye(fileEntry, type);
                    }
                    if (this.Hw && iW(type2)) {
                        type2 = ye(fileEntry, type2);
                    }
                    if (type.getSemantic() != 11) {
                        throw new e4();
                    }
                    if (type2.getSemantic() == 11) {
                        return gW();
                    }
                    throw new e4();
                case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
                case 19:
                    if (this.Hw && iW(type)) {
                        type = ye(fileEntry, type);
                    }
                    if (this.Hw && iW(type2)) {
                        type2 = ye(fileEntry, type2);
                    }
                    int semantic = type2.getSemantic();
                    if (semantic == 3 || semantic == 4 || semantic == 5 || semantic == 7 || semantic == 9 || semantic == 12) {
                        int semantic2 = type.getSemantic();
                        if (semantic2 != 3 && semantic2 != 4 && semantic2 != 5 && semantic2 != 7) {
                            if (semantic2 == 9) {
                                return type;
                            }
                            if (semantic2 == 12) {
                            }
                        }
                        return ro();
                    }
                    throw new e4();
                case ProxyTextView.INPUTTYPE_date /* 20 */:
                case 21:
                case 23:
                case 24:
                default:
                    throw new e4();
                case 22:
                    if (type2.isImplicitConvertibleTo(fileEntry, this.FH, type)) {
                        return type;
                    }
                    throw new e4();
                case 25:
                case 26:
                case 27:
                case 28:
                    if (er(fileEntry, 3, type, type2).yO(fileEntry, this.FH, type)) {
                        return type;
                    }
                    throw new e4();
                case 29:
                    if (er(fileEntry, 1, type, type2).yO(fileEntry, this.FH, type)) {
                        return type;
                    }
                    throw new e4();
                case 30:
                case 31:
                case 32:
                    if (er(fileEntry, 7, type, type2).yO(fileEntry, this.FH, type)) {
                        return type;
                    }
                    throw new e4();
                case ProxyTextView.INPUTTYPE_textEmailAddress /* 33 */:
                case 34:
                case 35:
                    if (er(fileEntry, 17, type, type2).yO(fileEntry, this.FH, type)) {
                        return type;
                    }
                    throw new e4();
            }
        } catch (Throwable th) {
            if (ef) {
                iy.a8(th, 3898847118397774920L, this, fileEntry, new Integer(i), type, type2);
            }
            throw th;
        }
    }

    @ey(method = -1749136967061254100L)
    public int et() {
        try {
            if (sG) {
                iy.gn(5028736898365951803L, this);
            }
            return this.Zo;
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, 5028736898365951803L, this);
            }
            throw th;
        }
    }

    @ey(method = -4649859609383282540L)
    public boolean fY(FileEntry fileEntry, ClassType classType, ClassType classType2) {
        try {
            if (sG) {
                iy.we(-6273399176372828739L, this, fileEntry, classType, classType2);
            }
            if (classType == classType2 || classType2.Ej(classType)) {
                return true;
            }
            if (classType2.Of()) {
                return fY(fileEntry, classType, classType2.getEnclosingClassType());
            }
            return false;
        } catch (Throwable th) {
            if (ef) {
                iy.U2(th, -6273399176372828739L, this, fileEntry, classType, classType2);
            }
            throw th;
        }
    }

    @ey(method = -4991707370742912599L)
    public ClassType g3(FileEntry fileEntry) {
        try {
            if (sG) {
                iy.tp(-201717445479253172L, this, fileEntry);
            }
            return br(fileEntry).sG(fileEntry, this.FH, this.a8, true, 0, br(fileEntry));
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, -201717445479253172L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = 5860446467222775901L)
    public PrimitiveType gW() {
        try {
            if (sG) {
                iy.gn(-1194237711927369948L, this);
            }
            return this.j6.hK(this.FH, 0);
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, -1194237711927369948L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.TypeSystem
    @ey(method = -3427477897304495925L)
    public Type gn(FileEntry fileEntry, Type type, Type type2) {
        try {
            if (sG) {
                iy.we(1086344541115759692L, this, fileEntry, type, type2);
            }
            if (type.XX(type2)) {
                return type;
            }
            if (this.Hw && type.getSemantic() == 2 && Jl(type2)) {
                return Hw(fileEntry, type2);
            }
            if (this.Hw && type2.getSemantic() == 2 && Jl(type)) {
                return Hw(fileEntry, type);
            }
            int semantic = type.getSemantic();
            if (semantic == 3 || semantic == 4) {
                int semantic2 = type2.getSemantic();
                return semantic2 != 5 ? semantic2 != 12 ? tp(fileEntry, 9, type, type2) : BT() : jO();
            }
            if (semantic == 5) {
                int semantic3 = type2.getSemantic();
                return (semantic3 == 3 || semantic3 == 4 || semantic3 == 12) ? jO() : tp(fileEntry, 9, type, type2);
            }
            if (semantic != 7 && semantic != 9) {
                switch (semantic) {
                    case 12:
                        int semantic4 = type2.getSemantic();
                        return (semantic4 == 3 || semantic4 == 4) ? BT() : semantic4 != 5 ? tp(fileEntry, 9, type, type2) : jO();
                    case 13:
                    case 14:
                        break;
                    default:
                        if (type.getSemantic() == 2 && iW(type2)) {
                            return type2;
                        }
                        if (type2.getSemantic() == 2 && iW(type)) {
                            return type;
                        }
                        if (type.isImplicitConvertibleTo(fileEntry, this.FH, type2)) {
                            return type2;
                        }
                        if (type2.isImplicitConvertibleTo(fileEntry, this.FH, type)) {
                            return type;
                        }
                        if (this.Hw) {
                            Type typeYe = iW(type) ? ye(fileEntry, type) : type;
                            Type typeYe2 = iW(type2) ? ye(fileEntry, type2) : type2;
                            if (typeYe.isImplicitConvertibleTo(fileEntry, this.FH, typeYe2)) {
                                return typeYe2;
                            }
                            if (typeYe2.isImplicitConvertibleTo(fileEntry, this.FH, typeYe)) {
                                return typeYe;
                            }
                        }
                        if (this.Hw && ((type.isClassType() || type.isParameterizedType()) && ((type2.isClassType() || type2.isParameterizedType()) && type.x9() == Sf(fileEntry) && type2.x9() == Sf(fileEntry)))) {
                            return Sf(fileEntry).ba(new Type[]{Eq(fileEntry)}, new int[]{1});
                        }
                        if (this.Hw && iW(type) && iW(type2)) {
                            return type.ca(fileEntry, this.FH, type2);
                        }
                        if (this.Hw && iW(type) && Jl(type2)) {
                            return type.ca(fileEntry, this.FH, Hw(fileEntry, type2));
                        }
                        if (this.Hw && Jl(type) && iW(type2)) {
                            return Hw(fileEntry, type).ca(fileEntry, this.FH, type2);
                        }
                        throw new e4();
                }
            }
            return tp(fileEntry, 9, type, type2);
        } catch (Throwable th) {
            if (ef) {
                iy.U2(th, 1086344541115759692L, this, fileEntry, type, type2);
            }
            throw th;
        }
    }

    @ey(method = -4325047719727333344L)
    public boolean hK(Member member) {
        try {
            if (sG) {
                iy.tp(-102616576541091063L, this, member);
            }
            if (member.getIdentifier() == this.VH) {
                if (member.oY() == 0) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, -102616576541091063L, this, member);
            }
            throw th;
        }
    }

    @ey(method = 462197650311334640L)
    public int hz() {
        try {
            if (sG) {
                iy.gn(63702468435394733L, this);
            }
            return this.cb;
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, 63702468435394733L, this);
            }
            throw th;
        }
    }

    @ey(method = 4229321107706808144L)
    public boolean iW(Type type) {
        try {
            if (sG) {
                iy.tp(-511265486403527975L, this, type);
            }
            return type.getSemantic() == 16;
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, -511265486403527975L, this, type);
            }
            throw th;
        }
    }

    @ey(method = -40350659696257755L)
    public boolean j3(FileEntry fileEntry, ClassType classType, Member member, Member member2) {
        try {
            if (sG) {
                iy.J0(2619159873134866640L, this, fileEntry, classType, member, member2);
            }
            try {
                Type typeU9 = classType.u9();
                if (!this.Hw) {
                    return member2.WB().XX(member.WB());
                }
                if (member2.WB() == member.WB()) {
                    return true;
                }
                Type typeJw = member.jw(typeU9);
                Type typeJw2 = member2.jw(typeU9);
                if (typeJw.kQ(typeJw2, member, member2)) {
                    return true;
                }
                if (iW(typeJw)) {
                    return typeJw.et() ? typeJw.x9().isImplicitConvertibleTo(fileEntry, this.FH, typeJw2.x9()) : typeJw.isImplicitConvertibleTo(fileEntry, this.FH, typeJw2);
                }
                return false;
            } catch (e4 unused) {
                return true;
            }
        } catch (Throwable th) {
            if (ef) {
                iy.a8(th, 2619159873134866640L, this, fileEntry, classType, member, member2);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.TypeSystem
    @ey(method = 16845195950570680L)
    public int j6(int i) {
        try {
            if (sG) {
                iy.u7(6795501511661500239L, this, i);
            }
            return Native.j6.c(i);
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, 6795501511661500239L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 3485405968965984348L)
    public ClassType jJ(FileEntry fileEntry) {
        try {
            if (sG) {
                iy.tp(-2301312434828420431L, this, fileEntry);
            }
            return br(fileEntry).sG(fileEntry, this.FH, this.lg, true, 0, br(fileEntry));
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, -2301312434828420431L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = 2257504172940665073L)
    public PrimitiveType jO() {
        try {
            if (sG) {
                iy.gn(-851875001801430468L, this);
            }
            return this.j6.hK(this.FH, 2);
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, -851875001801430468L, this);
            }
            throw th;
        }
    }

    @ey(method = 2468286968190203220L)
    public boolean jw(FileEntry fileEntry, ClassType classType, ClassType classType2) {
        try {
            if (sG) {
                iy.we(-471089297573884425L, this, fileEntry, classType, classType2);
            }
            if (classType == classType2) {
                return true;
            }
            if (classType2.Of()) {
                return jw(fileEntry, classType, classType2.getEnclosingClassType());
            }
            return false;
        } catch (Throwable th) {
            if (ef) {
                iy.U2(th, -471089297573884425L, this, fileEntry, classType, classType2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0095, code lost:
    
        if (r31.Z1() == false) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d7  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object[]] */
    @abcd.ey(method = -2728859484657894251L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean k2(com.aide.codemodel.api.FileEntry r30, com.aide.codemodel.api.Member r31, com.aide.codemodel.api.Type r32, com.aide.codemodel.api.Type[] r33, int r34, int r35, com.aide.codemodel.api.Type[] r36, int r37, int r38, boolean r39, boolean r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.java.JavaTypeSystem.k2(com.aide.codemodel.api.FileEntry, com.aide.codemodel.api.Member, com.aide.codemodel.api.Type, com.aide.codemodel.api.Type[], int, int, com.aide.codemodel.api.Type[], int, int, boolean, boolean):boolean");
    }

    @ey(method = 2183477190619242008L)
    public ClassType kQ(FileEntry fileEntry) {
        try {
            if (sG) {
                iy.tp(-3191057488582873267L, this, fileEntry);
            }
            return br(fileEntry).sG(fileEntry, this.FH, this.XL, true, 0, br(fileEntry));
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, -3191057488582873267L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = 5035168816554766920L)
    public PrimitiveType ko() {
        try {
            if (sG) {
                iy.gn(1581031148865909999L, this);
            }
            return this.j6.hK(this.FH, 10);
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, 1581031148865909999L, this);
            }
            throw th;
        }
    }

    @ey(method = 1025848056517114601L)
    public void lg(FileEntry fileEntry, SetOf<Member> setOf, Type type, Type[] typeArr, int i, int i2, Type[] typeArr2, int i3, int i4, boolean z, SetOf<Member> setOf2) throws Throwable {
        int i5;
        try {
            if (sG) {
                iy.QX(-1556709956865746676L, this, new Object[]{fileEntry, setOf, type, typeArr, new Integer(i), new Integer(i2), typeArr2, new Integer(i3), new Integer(i4), new Boolean(z), setOf2});
            }
            i5 = i2;
            try {
                rN(fileEntry, setOf, type, typeArr, i, i2, typeArr2, i3, i4, true, true, setOf2);
                if (setOf2.J0() == 0) {
                    rN(fileEntry, setOf, type, typeArr, i, i2, typeArr2, i3, i4, false, true, setOf2);
                }
                if (z) {
                    return;
                }
                if (setOf2.J0() == 0) {
                    rN(fileEntry, setOf, type, typeArr, i, i2, typeArr2, i3, i4, true, false, setOf2);
                }
                if (setOf2.J0() == 0) {
                    rN(fileEntry, setOf, type, typeArr, i, i2, typeArr2, i3, i4, false, false, setOf2);
                }
            } catch (Throwable th) {
                th = th;
                if (ef) {
                    iy.rN(th, -1556709956865746676L, this, new Object[]{fileEntry, setOf, type, typeArr, new Integer(i), new Integer(i5), typeArr2, new Integer(i3), new Integer(i4), new Boolean(z), setOf2});
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i5 = i2;
        }
    }

    @ey(method = -4359139310009593993L)
    public ClassType lp(FileEntry fileEntry) {
        try {
            if (sG) {
                iy.tp(252591299745998400L, this, fileEntry);
            }
            return br(fileEntry).sG(fileEntry, this.FH, this.J0, true, 0, nw());
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, 252591299745998400L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = 5352600778435283900L)
    public int mb() {
        try {
            if (sG) {
                iy.gn(6258289192686507659L, this);
            }
            return this.ei;
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, 6258289192686507659L, this);
            }
            throw th;
        }
    }

    @ey(method = 3822893799813898347L)
    public boolean n5(FileEntry fileEntry, Member member, Member member2, Type type, int i) {
        try {
            if (sG) {
                iy.J8(-3355525528615597444L, this, fileEntry, member, member2, type, new Integer(i));
            }
            try {
                int iOY = member.oY();
                int iOY2 = member2.oY();
                int i2 = 0;
                while (i2 < i) {
                    Type typeZh = i2 >= iOY ? member.zh(type, iOY - 1) : member.zh(type, i2);
                    Type typeZh2 = i2 >= iOY2 ? member2.zh(type, iOY2 - 1) : member2.zh(type, i2);
                    if ((typeZh.isMethodParameterType() || !typeZh2.isMethodParameterType()) && !typeZh.hz(typeZh2, member, member2)) {
                        if (i2 >= iOY - 1 && member.Z1() && typeZh.isArrayType()) {
                            typeZh = ((ArrayType) typeZh).getElementType();
                        }
                        if (i2 >= iOY2 - 1 && member2.Z1() && typeZh2.isArrayType()) {
                            typeZh2 = ((ArrayType) typeZh2).getElementType();
                        }
                        if (!Z1(fileEntry, typeZh, typeZh2, false)) {
                            return false;
                        }
                    }
                    i2++;
                }
                if (this.Hw) {
                    return true;
                }
                return member.getEnclosingClassType().isImplicitConvertibleTo(fileEntry, this.FH, member2.getEnclosingClassType());
            } catch (e4 unused) {
                return false;
            }
        } catch (Throwable th) {
            if (ef) {
                iy.lg(th, -3355525528615597444L, this, fileEntry, member, member2, type, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -6638233921777393803L)
    public Namespace nw() {
        try {
            if (sG) {
                iy.gn(632518917573756248L, this);
            }
            return this.j6.getRootNamespace();
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, 632518917573756248L, this);
            }
            throw th;
        }
    }

    @ey(method = 6586921082091931681L)
    public ClassType oY(FileEntry fileEntry) {
        try {
            if (sG) {
                iy.tp(-4072931506610024676L, this, fileEntry);
            }
            return br(fileEntry).sG(fileEntry, this.FH, this.er, true, 0, br(fileEntry));
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, -4072931506610024676L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = 3388580247900452507L)
    public long oy(String str) {
        try {
            if (sG) {
                iy.tp(-1646296287944574500L, this, str);
            }
            try {
                if (str.contains("_")) {
                    str = str.replace("_", "");
                }
                return this.j6.Qq(Double.parseDouble(str));
            } catch (NumberFormatException unused) {
                throw new e4();
            }
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, -1646296287944574500L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -917836552467824528L)
    public long pN(String str) {
        try {
            if (sG) {
                iy.tp(-1426544508690298467L, this, str);
            }
            return this.j6.aj(str.charAt(1));
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, -1426544508690298467L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -10288574714280192L)
    public boolean pO(FileEntry fileEntry, Type type, Type type2) {
        try {
            if (sG) {
                iy.we(459257003538281931L, this, fileEntry, type, type2);
            }
            if (!type2.isParameterizedType() || !type.isClassType()) {
                return false;
            }
            if (type.et()) {
                return true;
            }
            return !type.isSubTypeOf(fileEntry, this.FH, type2);
        } catch (Throwable th) {
            if (ef) {
                iy.U2(th, 459257003538281931L, this, fileEntry, type, type2);
            }
            throw th;
        }
    }

    @ey(method = 718726402473370200L)
    public boolean qp(Type type) {
        try {
            if (sG) {
                iy.tp(4510619099607252291L, this, type);
            }
            return (type.getModifiers() & 536870912) != 0;
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, 4510619099607252291L, this, type);
            }
            throw th;
        }
    }

    @ey(method = 1479682224248380800L)
    public PrimitiveType ro() {
        try {
            if (sG) {
                iy.gn(-1014366696405269025L, this);
            }
            return this.j6.hK(this.FH, 4);
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, -1014366696405269025L, this);
            }
            throw th;
        }
    }

    @ey(method = 667704414896679104L)
    public boolean sE(FileEntry fileEntry, Type type, Type type2) {
        try {
            if (sG) {
                iy.we(791522069855529015L, this, fileEntry, type, type2);
            }
            try {
                if (!Jl(type2) || !iW(type)) {
                    return false;
                }
                if (this.v5 && type == lp(fileEntry)) {
                    return true;
                }
                return ye(fileEntry, type).isImplicitConvertibleTo(fileEntry, this.FH, type2);
            } catch (e4 unused) {
                return false;
            }
        } catch (Throwable th) {
            if (ef) {
                iy.U2(th, 791522069855529015L, this, fileEntry, type, type2);
            }
            throw th;
        }
    }

    @ey(method = -3362298292903704000L)
    public ClassType sG(FileEntry fileEntry) {
        try {
            if (sG) {
                iy.tp(-1955764027069214361L, this, fileEntry);
            }
            return br(fileEntry).sG(fileEntry, this.FH, this.Mr, true, 0, br(fileEntry));
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, -1955764027069214361L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = 3033364876917914041L)
    public boolean sg(FileEntry fileEntry, Type type, Type type2) {
        try {
            if (sG) {
                iy.we(-2259116821872606752L, this, fileEntry, type, type2);
            }
            if (!type2.isMethodParameterType() && !type2.isParameterType()) {
                if (!fN(fileEntry, type, type2)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (ef) {
                iy.U2(th, -2259116821872606752L, this, fileEntry, type, type2);
            }
            throw th;
        }
    }

    @ey(method = -4818499290850565875L)
    public ClassType sh(FileEntry fileEntry) {
        try {
            if (sG) {
                iy.tp(1580907649352842944L, this, fileEntry);
            }
            return nw().ef(fileEntry, this.u7, true).ef(fileEntry, this.KD, true).sG(fileEntry, this.FH, this.SI, true, 0, br(fileEntry));
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, 1580907649352842944L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = 5178627953575480640L)
    public ClassType sy(FileEntry fileEntry) {
        try {
            if (sG) {
                iy.tp(3497072737124753433L, this, fileEntry);
            }
            return br(fileEntry).sG(fileEntry, this.FH, this.J8, true, 0, br(fileEntry));
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, 3497072737124753433L, this, fileEntry);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.TypeSystem
    @ey(method = 503215862066031328L)
    public Type tp(FileEntry fileEntry, int i, Type type, Type type2) {
        try {
            if (sG) {
                iy.J0(-5525979960234323457L, this, fileEntry, new Integer(i), type, type2);
            }
            if (this.Hw && iW(type)) {
                type = ye(fileEntry, type);
            }
            if (this.Hw && iW(type2)) {
                type2 = ye(fileEntry, type2);
            }
            return aq(type, type2);
        } catch (Throwable th) {
            Type type3 = type;
            Type type4 = type2;
            if (ef) {
                iy.a8(th, -5525979960234323457L, this, fileEntry, new Integer(i), type3, type4);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.TypeSystem
    @ey(method = 1076828511302427735L)
    public int u7(Namespace namespace, int i) {
        try {
            if (!sG) {
                return 16;
            }
            iy.EQ(-489125864656042688L, this, namespace, new Integer(i));
            return 16;
        } catch (Throwable th) {
            if (ef) {
                iy.Mr(th, -489125864656042688L, this, namespace, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.TypeSystem
    @ey(method = 2432591282337489167L)
    public SetOf<Type> v5(FileEntry fileEntry, ArrayType arrayType) {
        try {
            if (!sG) {
                return null;
            }
            iy.EQ(271797098705915512L, this, fileEntry, arrayType);
            return null;
        } catch (Throwable th) {
            if (ef) {
                iy.Mr(th, 271797098705915512L, this, fileEntry, arrayType);
            }
            throw th;
        }
    }

    @ey(method = -4778948635700173643L)
    public ClassType vJ(FileEntry fileEntry) {
        try {
            if (sG) {
                iy.tp(-854734630643648640L, this, fileEntry);
            }
            return br(fileEntry).sG(fileEntry, this.FH, this.rN, true, 0, br(fileEntry));
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, -854734630643648640L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = 4362431673515883841L)
    public PrimitiveType vy() {
        try {
            if (sG) {
                iy.gn(2341789914925480240L, this);
            }
            return this.j6.hK(this.FH, 3);
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, 2341789914925480240L, this);
            }
            throw th;
        }
    }

    @ey(method = 6829593879238630824L)
    public boolean w9(FileEntry fileEntry, Type type) {
        try {
            if (sG) {
                iy.EQ(-1816087593783843765L, this, fileEntry, type);
            }
            try {
                if (type.isImplicitConvertibleTo(fileEntry, this.FH, I(fileEntry))) {
                    return false;
                }
                return !type.isImplicitConvertibleTo(fileEntry, this.FH, XX(fileEntry));
            } catch (e4 unused) {
                return false;
            }
        } catch (Throwable th) {
            if (ef) {
                iy.Mr(th, -1816087593783843765L, this, fileEntry, type);
            }
            throw th;
        }
    }

    @ey(method = -6747896371629289920L)
    public ClassType wc(FileEntry fileEntry) {
        try {
            if (sG) {
                iy.tp(188291633364736153L, this, fileEntry);
            }
            return nw().ef(fileEntry, this.u7, true).ef(fileEntry, this.tp, true).sG(fileEntry, this.FH, this.EQ, true, 0, br(fileEntry));
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, 188291633364736153L, this, fileEntry);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.TypeSystem
    @ey(method = 378388021952015775L)
    public boolean we() {
        try {
            if (!sG) {
                return true;
            }
            iy.gn(-202835989354801500L, this);
            return true;
        } catch (Throwable th) {
            if (ef) {
                iy.aM(th, -202835989354801500L, this);
            }
            throw th;
        }
    }

    @ey(method = -667779596557984620L)
    public ClassType x9(FileEntry fileEntry) {
        try {
            if (sG) {
                iy.tp(1241282171875150071L, this, fileEntry);
            }
            return br(fileEntry).sG(fileEntry, this.FH, this.U2, true, 0, br(fileEntry));
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, 1241282171875150071L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = 3290673031458615693L)
    public ClassType yO(FileEntry fileEntry) {
        try {
            if (sG) {
                iy.tp(-2063283123764537020L, this, fileEntry);
            }
            return br(fileEntry).sG(fileEntry, this.FH, this.er, true, 0, br(fileEntry));
        } catch (Throwable th) {
            if (ef) {
                iy.j3(th, -2063283123764537020L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = 2268604770347947440L)
    public Type yS(FileEntry fileEntry, int i, Type type, Type type2, long j) {
        int semantic;
        int semantic2;
        try {
            if (sG) {
                iy.J8(-7251632342198880837L, this, fileEntry, new Integer(i), type, type2, new Long(j));
            }
            if (i != 22) {
                return er(fileEntry, i, type, type2);
            }
            int semantic3 = type.getSemantic();
            if (semantic3 == 3) {
                int semantic4 = type2.getSemantic();
                if (semantic4 == 3 || semantic4 == 4 || semantic4 == 5 || semantic4 == 7 || semantic4 == 12) {
                    if (this.j6.I(j) > 127 || this.j6.I(j) < -128) {
                        throw new e4();
                    }
                    return type;
                }
            } else if (semantic3 == 4) {
                int semantic5 = type2.getSemantic();
                if (semantic5 == 3 || semantic5 == 4 || semantic5 == 5 || semantic5 == 7 || semantic5 == 12) {
                    if (this.j6.I(j) > 255 || this.j6.I(j) < 0) {
                        throw new e4();
                    }
                    return type;
                }
            } else if (semantic3 == 5) {
                int semantic6 = type2.getSemantic();
                if (semantic6 == 3 || semantic6 == 4 || semantic6 == 5 || semantic6 == 7 || semantic6 == 12) {
                    if (this.j6.I(j) > 32767 || this.j6.I(j) < -32768) {
                        throw new e4();
                    }
                    return type;
                }
            } else if (semantic3 == 12 && ((semantic2 = type2.getSemantic()) == 3 || semantic2 == 4 || semantic2 == 5 || semantic2 == 7 || semantic2 == 12)) {
                if (this.j6.I(j) > 65535 || this.j6.I(j) < 0) {
                    throw new e4();
                }
                return type;
            }
            if (type2.isImplicitConvertibleTo(fileEntry, this.FH, type)) {
                return type;
            }
            if (this.Hw) {
                if (AL(fileEntry, type2, type)) {
                    return type;
                }
                try {
                    if (type == ef(fileEntry)) {
                        int semantic7 = type2.getSemantic();
                        if (semantic7 == 3 || semantic7 == 4 || semantic7 == 5 || semantic7 == 7 || semantic7 == 12) {
                            if (this.j6.I(j) > 65535 || this.j6.I(j) < 0) {
                                throw new e4();
                            }
                            return type;
                        }
                    } else if (type == ef(fileEntry)) {
                        int semantic8 = type2.getSemantic();
                        if (semantic8 == 3 || semantic8 == 4 || semantic8 == 5 || semantic8 == 7 || semantic8 == 12) {
                            if (this.j6.I(j) > 32767 || this.j6.I(j) < -32768) {
                                throw new e4();
                            }
                            return type;
                        }
                    } else if (type == sG(fileEntry)) {
                        int semantic9 = type2.getSemantic();
                        if (semantic9 == 3 || semantic9 == 4 || semantic9 == 5 || semantic9 == 7 || semantic9 == 12) {
                            if (this.j6.I(j) > 127 || this.j6.I(j) < -128) {
                                throw new e4();
                            }
                            return type;
                        }
                    } else if (type == kQ(fileEntry) && ((semantic = type2.getSemantic()) == 3 || semantic == 4 || semantic == 5 || semantic == 7 || semantic == 12)) {
                        if (this.j6.I(j) > 32767 || this.j6.I(j) < -32768) {
                            throw new e4();
                        }
                        return type;
                    }
                } catch (e4 unused) {
                }
            }
            throw new e4();
        } catch (Throwable th) {
            if (ef) {
                iy.lg(th, -7251632342198880837L, this, fileEntry, new Integer(i), type, type2, new Long(j));
            }
            throw th;
        }
    }

    @ey(method = 2177316082475156427L)
    public Type ye(FileEntry fileEntry, Type type) {
        try {
            if (sG) {
                iy.EQ(6202582094188052496L, this, fileEntry, type);
            }
            if (type == dx(fileEntry)) {
                return gW();
            }
            if (type == sG(fileEntry)) {
                return BT();
            }
            if (type == ef(fileEntry)) {
                return vy();
            }
            if (type == kQ(fileEntry)) {
                return jO();
            }
            if (type == Qq(fileEntry)) {
                return ro();
            }
            if (type == aj(fileEntry)) {
                return CU();
            }
            if (type == x9(fileEntry)) {
                return KD();
            }
            if (type == g3(fileEntry)) {
                return SI();
            }
            throw new e4();
        } catch (Throwable th) {
            if (ef) {
                iy.Mr(th, 6202582094188052496L, this, fileEntry, type);
            }
            throw th;
        }
    }

    @ey(method = -1743374408402001928L)
    public boolean zh(FileEntry fileEntry, Type type) {
        try {
            if (sG) {
                iy.EQ(-173981183415309095L, this, fileEntry, type);
            }
            if (type == sG(fileEntry) || type == ef(fileEntry) || type == kQ(fileEntry) || type == Qq(fileEntry)) {
                return true;
            }
            return type == aj(fileEntry);
        } catch (Throwable th) {
            if (ef) {
                iy.Mr(th, -173981183415309095L, this, fileEntry, type);
            }
            throw th;
        }
    }
}
