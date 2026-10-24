package com.aide.codemodel.api;

import abcd.cy;
import abcd.dy;
import abcd.e4;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import abcd.y1;
import com.aide.codemodel.api.abstraction.Language;
import com.aide.codemodel.api.collections.FunctionOfIntInt;
import com.aide.codemodel.api.collections.ListOf;
import com.aide.codemodel.api.collections.ListOfInt;
import com.aide.codemodel.api.collections.MapOf;
import com.aide.codemodel.api.collections.MapOfInt;
import com.aide.codemodel.api.collections.SetOf;
import com.aide.codemodel.api.collections.StoreInputStream;
import com.aide.codemodel.api.collections.StoreOutputStream;

@cy(clazz = -2000027952479709936L, container = -2000027952479709936L, user = true)
/* loaded from: classes.dex */
public final class Member extends Entity {

    @fy
    private static /* synthetic */ boolean J8;

    @gy
    private static /* synthetic */ boolean Ws;

    @dy(field = 5345692730123272256L)
    private int EQ;

    @dy(field = -943464037870286889L)
    private Data data;

    @dy(field = -1161499768717632903L)
    private final EntitySpace entitySpace;

    @dy(field = -941751374530998493L)
    private FileEntry file;

    @dy(field = -2877416737231197435L)
    private final FileSpace fileSpace;

    @dy(field = 944775712567989864L)
    private int id;

    @dy(field = 4563703717203699151L)
    private final IdentifierSpace identifierSpace;

    @dy(field = -369248334865864695L)
    private ClassType we;

    @cy(clazz = 6054862146502191120L, container = 6054862146502191120L, user = true)
    private static class Data {

        @fy
        private static /* synthetic */ boolean dx;

        @gy
        private static /* synthetic */ boolean sG;

        @dy(field = 2427507583517812719L)
        public int EQ;

        @dy(field = 1374955971858186368L)
        public boolean FH;

        @dy(field = 120021583313225088L)
        public boolean Hw;

        @dy(field = -4071151842190017404L)
        public int J0;

        @dy(field = 183998807153588855L)
        public int J8;

        @dy(field = 256840331493877092L)
        public String KD;

        @dy(field = 3324745556688517632L)
        public ListOf<Type> Mr;

        @dy(field = 477540871951513903L)
        public int P8;

        @dy(field = -2737196651623557792L)
        public int QX;

        @dy(field = 3290788844348791287L)
        public boolean SI;

        @dy(field = -449875142450083315L)
        public ListOfInt U2;

        @dy(field = -171688705810564064L)
        public int VH;

        @dy(field = -478827674025276845L)
        public int Ws;

        @dy(field = 993503489946822360L)
        public boolean XL;

        @dy(field = -3535808751555627421L)
        public int Zo;

        @dy(field = 5030044260021096691L)
        public ListOfInt a8;

        @dy(field = 3714372802550385888L)
        public boolean aM;

        @dy(field = 4462569625754586225L)
        public ListOfInt cb;

        @dy(field = -1597642852091569504L)
        public boolean cn;

        @dy(field = 1961229937465479681L)
        public int ei;

        @dy(field = -2243615848266087005L)
        public SetOf<MethodParameterType> er;

        @dy(field = -287199260949901704L)
        public Type gW;

        @dy(field = -1361525548847680204L)
        public int gn;

        @dy(field = 2238066207098245440L)
        public ListOf<Type> j3;

        @dy(field = 1143920417156542752L)
        public int j6;

        @dy(field = 691301428008217119L)
        public SetOf<Member> lg;

        @dy(field = 2788233985669318936L)
        public int modifierFlags;

        @dy(field = 2605735580417130315L)
        public long nw;

        @dy(field = -6904134698443970640L)
        public MapOfInt<MethodParameterType> rN;

        @dy(field = -4129218045671696532L)
        public boolean ro;

        @dy(field = -1460943538065903760L)
        public ListOf<Type> sh;

        @dy(field = -821024349735661576L)
        public boolean syntaxLoaded;

        @dy(field = 980925886717828800L)
        public int tp;

        @dy(field = -4673182818529586165L)
        public int u7;

        @dy(field = -2844205889440674213L)
        public int v5;

        @dy(field = 3677615330198673208L)
        public boolean vy;

        @dy(field = -2579753682753909760L)
        public int we;

        @dy(field = -2243726760627188096L)
        public ListOf<MethodParameterType> yS;

        static {
            iy.Zo(Data.class);
        }

        @ey(method = -846894057236842025L)
        private Data() {
            try {
                if (dx) {
                    iy.gn(1092868739956440425L, null);
                }
            } catch (Throwable th) {
                if (sG) {
                    iy.aM(th, 1092868739956440425L, null);
                }
                throw th;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = -65753778886795275L)
        public /* synthetic */ Data(a aVar) {
            this();
            try {
                if (dx) {
                    iy.tp(921403415086019635L, null, aVar);
                }
            } catch (Throwable th) {
                if (sG) {
                    iy.j3(th, 921403415086019635L, null, aVar);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 3406119899327453499L, container = 3406119899327453499L, user = true)
    protected static class InferAlgorithm {

        @gy
        private static /* synthetic */ boolean J0;

        @fy
        private static /* synthetic */ boolean we;

        @dy(field = -37920940597133253L)
        private SetOf<MethodParameterType> DW;

        @dy(field = -3366108188337394644L)
        private boolean EQ;

        @dy(field = 6374672124843157343L)
        private FunctionOfIntInt FH;

        @dy(field = -3643315403233956585L)
        private MapOf<MethodParameterType, Type> Hw;

        @dy(field = -5194297545218901504L)
        private MapOf<MethodParameterType, Type> VH;

        @dy(field = 5664681589127702925L)
        private MapOf<MethodParameterType, Type> Zo;

        @dy(field = 4397969208127735328L)
        private MapOf<MethodParameterType, Type> gn;

        @dy(field = -1614416748804144564L)
        private EntitySpace j6;

        @dy(field = 1118213526176711980L)
        private Language tp;

        @dy(field = 826218108907236060L)
        private FileEntry u7;

        @dy(field = 2184083441142093792L)
        private FunctionOfIntInt v5;

        static {
            iy.Zo(InferAlgorithm.class);
        }

        @ey(method = 25218144069032997L)
        public InferAlgorithm(EntitySpace entitySpace) {
            try {
                if (we) {
                    iy.tp(585510178329887225L, null, entitySpace);
                }
                this.v5 = new FunctionOfIntInt();
                this.j6 = entitySpace;
                this.FH = new FunctionOfIntInt();
                this.Hw = new MapOf<>(entitySpace);
                this.Zo = new MapOf<>(entitySpace);
                this.VH = new MapOf<>(entitySpace);
                this.gn = new MapOf<>(entitySpace);
            } catch (Throwable th) {
                if (J0) {
                    iy.j3(th, 585510178329887225L, null, entitySpace);
                }
                throw th;
            }
        }

        @ey(method = 5673167033162457504L)
        private boolean DW(Type type, Type type2) {
            Type typeKo;
            Type typeEv;
            try {
                if (we) {
                    iy.EQ(310151543915196345L, this, type, type2);
                }
                if (type.getSemantic() == 2 || type == type2) {
                    return true;
                }
                if (type2.isMethodParameterType()) {
                    return this.DW.contains(type2) ? J8((MethodParameterType) type2, type) : u7(this.u7, this.tp, type, type2, this.EQ);
                }
                if (!type2.isParameterizedType()) {
                    if (!type2.isArrayType()) {
                        return u7(this.u7, this.tp, type, type2, this.EQ);
                    }
                    if (!type.isArrayType()) {
                        return false;
                    }
                    Type elementType = ((ArrayType) type).getElementType();
                    Type elementType2 = ((ArrayType) type2).getElementType();
                    if (!elementType.isPrimitiveType() || elementType2.isPrimitiveType()) {
                        return DW(elementType, elementType2);
                    }
                    return false;
                }
                if (!type.isParameterizedType()) {
                    if (type.isClassType()) {
                        if (type == ((ParameterizedType) type2).getClassType() || type.isSubTypeOf(this.u7, this.tp, type2) || type.isSubTypeOf(this.u7, this.tp, ((ParameterizedType) type2).getClassType())) {
                            return true;
                        }
                        if (type.et() && ((ClassType) type).Ej(((ParameterizedType) type2).getClassType())) {
                            return true;
                        }
                        SetOf<Type> allSuperTypes = ((ClassType) type).getAllSuperTypes();
                        allSuperTypes.DEFAULT_ITERATOR.init();
                        while (allSuperTypes.DEFAULT_ITERATOR.hasMoreElements()) {
                            Type type3 = (Type) allSuperTypes.DEFAULT_ITERATOR.nextKey();
                            if (type3 == type2) {
                                return true;
                            }
                            if (type3.isParameterizedType() && ((ParameterizedType) type3).getClassType() == ((ParameterizedType) type2).getClassType()) {
                                return DW(type3, type2);
                            }
                        }
                        return u7(this.u7, this.tp, type, type2, this.EQ);
                    }
                    if (type.isParameterType()) {
                        int iYe = ((ParameterType) type).ye();
                        for (int i = 0; i < iYe; i++) {
                            try {
                                typeEv = ((ParameterType) type).Ev(i);
                            } catch (e4 unused) {
                            }
                            if (u7(this.u7, this.tp, typeEv.x9(), type2.x9(), this.EQ)) {
                                return DW(typeEv, type2);
                            }
                            continue;
                        }
                        return u7(this.u7, this.tp, type, type2, this.EQ);
                    }
                    if (type.isMethodParameterType()) {
                        int iYe2 = ((MethodParameterType) type).ye();
                        for (int i2 = 0; i2 < iYe2; i2++) {
                            try {
                                typeKo = ((MethodParameterType) type).ko(i2);
                            } catch (e4 unused2) {
                            }
                            if (u7(this.u7, this.tp, typeKo.x9(), type2.x9(), this.EQ)) {
                                return DW(typeKo, type2);
                            }
                            continue;
                        }
                        return false;
                    }
                    if (!type.isArrayType()) {
                        return u7(this.u7, this.tp, type, type2, this.EQ);
                    }
                    SetOf<Type> setOfEq = this.j6.Eq(this.u7, this.tp, (ArrayType) type);
                    if (setOfEq == null) {
                        return u7(this.u7, this.tp, type, type2, this.EQ);
                    }
                    setOfEq.DEFAULT_ITERATOR.init();
                    while (setOfEq.DEFAULT_ITERATOR.hasMoreElements()) {
                        if (!DW((Type) setOfEq.DEFAULT_ITERATOR.nextKey(), type2)) {
                            return false;
                        }
                    }
                    return true;
                }
                ClassType classType = ((ParameterizedType) type2).getClassType();
                if (classType != ((ParameterizedType) type).getClassType()) {
                    SetOf<Type> allSuperTypes2 = ((ParameterizedType) type).getAllSuperTypes();
                    allSuperTypes2.DEFAULT_ITERATOR.init();
                    while (allSuperTypes2.DEFAULT_ITERATOR.hasMoreElements()) {
                        Type type4 = (Type) allSuperTypes2.DEFAULT_ITERATOR.nextKey();
                        if (type4 == type2) {
                            return true;
                        }
                        if (type4.isClassType()) {
                            if (type4 == classType) {
                                return true;
                            }
                        } else if (((ParameterizedType) type4).getClassType() == classType) {
                            try {
                                return DW(((ParameterizedType) type).replaceType(type4), type2);
                            } catch (e4 unused3) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                    return u7(this.u7, this.tp, type, type2, this.EQ);
                }
                Type[] absoluteArgumentTypes = ((ParameterizedType) type2).getAbsoluteArgumentTypes();
                Type[] absoluteArgumentTypes2 = ((ParameterizedType) type).getAbsoluteArgumentTypes();
                int[] absoluteArgumentVariances = ((ParameterizedType) type2).getAbsoluteArgumentVariances();
                int[] absoluteArgumentVariances2 = ((ParameterizedType) type).getAbsoluteArgumentVariances();
                for (int i3 = 0; i3 < absoluteArgumentTypes.length; i3++) {
                    int i4 = absoluteArgumentVariances2[i3];
                    if (i4 == 0) {
                        int i5 = absoluteArgumentVariances[i3];
                        if (i5 == 0) {
                            if (!j6(absoluteArgumentTypes2[i3], absoluteArgumentTypes[i3])) {
                                return false;
                            }
                        } else if (i5 == 1 || i5 == 2) {
                            if (!DW(absoluteArgumentTypes2[i3], absoluteArgumentTypes[i3])) {
                                return false;
                            }
                        } else if (i5 == 3 && !FH(absoluteArgumentTypes2[i3], absoluteArgumentTypes[i3])) {
                            return false;
                        }
                    } else if (i4 == 1 || i4 == 2) {
                        int i6 = absoluteArgumentVariances[i3];
                        if (i6 == 0) {
                            if (absoluteArgumentTypes[i3].isMethodParameterType() && this.DW.contains(absoluteArgumentTypes[i3]) && Ws(absoluteArgumentTypes[i3], absoluteArgumentVariances2[i3])) {
                                return we((MethodParameterType) absoluteArgumentTypes[i3], absoluteArgumentTypes2[i3]);
                            }
                            return false;
                        }
                        if (i6 == 1 || i6 == 2) {
                            if (!DW(absoluteArgumentTypes2[i3], absoluteArgumentTypes[i3])) {
                                return false;
                            }
                        } else if (i6 == 3) {
                            return false;
                        }
                    } else if (i4 == 3) {
                        int i7 = absoluteArgumentVariances[i3];
                        if (i7 == 0) {
                            if (absoluteArgumentTypes[i3].isMethodParameterType() && this.DW.contains(absoluteArgumentTypes[i3]) && Ws(absoluteArgumentTypes[i3], absoluteArgumentVariances2[i3])) {
                                return we((MethodParameterType) absoluteArgumentTypes[i3], absoluteArgumentTypes2[i3]);
                            }
                            return false;
                        }
                        if (i7 == 1 || i7 == 2) {
                            try {
                                return absoluteArgumentTypes[i3] == this.j6.getRootClasstype(this.u7, this.tp);
                            } catch (e4 unused4) {
                                continue;
                            }
                        } else if (i7 == 3 && !FH(absoluteArgumentTypes2[i3], absoluteArgumentTypes[i3])) {
                            return false;
                        }
                    }
                }
                return true;
            } catch (Throwable th) {
                if (J0) {
                    iy.Mr(th, 310151543915196345L, this, type, type2);
                }
                throw th;
            }
        }

        @ey(method = -289239391096265376L)
        private boolean EQ(Member member, Type type, MethodParameterType methodParameterType, Type type2) {
            try {
                if (we) {
                    iy.J0(997154807199754729L, this, member, type, methodParameterType, type2);
                }
                try {
                    int iYe = methodParameterType.ye();
                    for (int i = 0; i < iYe; i++) {
                        if (!u7(this.u7, this.tp, type2, XL(methodParameterType.Ev(type, i)), this.EQ)) {
                            return false;
                        }
                    }
                    return true;
                } catch (e4 unused) {
                    return true;
                }
            } catch (Throwable th) {
                if (J0) {
                    iy.a8(th, 997154807199754729L, this, member, type, methodParameterType, type2);
                }
                throw th;
            }
        }

        @ey(method = 5614163771903691637L)
        private boolean FH(Type type, Type type2) {
            try {
                if (we) {
                    iy.EQ(-7480364679176843548L, this, type, type2);
                }
                if (type.getSemantic() == 2 || type == type2) {
                    return true;
                }
                if (type2.isMethodParameterType()) {
                    return this.DW.contains(type2) ? J0((MethodParameterType) type2, type) : u7(this.u7, this.tp, type2, type, this.EQ);
                }
                if (!type2.isParameterizedType()) {
                    if (!type2.isArrayType()) {
                        return u7(this.u7, this.tp, type2, type, this.EQ);
                    }
                    if (!type.isArrayType()) {
                        return u7(this.u7, this.tp, type2, type, this.EQ);
                    }
                    Type elementType = ((ArrayType) type).getElementType();
                    Type elementType2 = ((ArrayType) type2).getElementType();
                    if (!elementType.isPrimitiveType() || elementType2.isPrimitiveType()) {
                        return FH(elementType, elementType2);
                    }
                    return false;
                }
                if (!type.isParameterizedType()) {
                    if (!type.isClassType()) {
                        return u7(this.u7, this.tp, type2, type, this.EQ);
                    }
                    if (type == ((ParameterizedType) type2).getClassType()) {
                        return true;
                    }
                    SetOf<Type> allSuperTypes = ((ParameterizedType) type2).getAllSuperTypes();
                    allSuperTypes.DEFAULT_ITERATOR.init();
                    while (allSuperTypes.DEFAULT_ITERATOR.hasMoreElements()) {
                        Type type3 = (Type) allSuperTypes.DEFAULT_ITERATOR.nextKey();
                        if (type3 == type) {
                            return true;
                        }
                        if (type3.isClassType()) {
                            if (type3 == type) {
                                return true;
                            }
                        } else if (((ParameterizedType) type3).getClassType() == type) {
                            try {
                                return FH(type, ((ParameterizedType) type2).replaceType(type3));
                            } catch (e4 unused) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                    return u7(this.u7, this.tp, type2, type, this.EQ);
                }
                ClassType classType = ((ParameterizedType) type2).getClassType();
                ClassType classType2 = ((ParameterizedType) type).getClassType();
                if (classType != classType2) {
                    SetOf<Type> allSuperTypes2 = ((ParameterizedType) type2).getAllSuperTypes();
                    allSuperTypes2.DEFAULT_ITERATOR.init();
                    while (allSuperTypes2.DEFAULT_ITERATOR.hasMoreElements()) {
                        Type type4 = (Type) allSuperTypes2.DEFAULT_ITERATOR.nextKey();
                        if (type4 == type) {
                            return true;
                        }
                        if (type4.isClassType()) {
                            if (type4 == classType2) {
                                return true;
                            }
                        } else if (((ParameterizedType) type4).getClassType() == classType2) {
                            try {
                                return FH(type, ((ParameterizedType) type2).replaceType(type4));
                            } catch (e4 unused2) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                    return u7(this.u7, this.tp, type2, type, this.EQ);
                }
                Type[] absoluteArgumentTypes = ((ParameterizedType) type2).getAbsoluteArgumentTypes();
                Type[] absoluteArgumentTypes2 = ((ParameterizedType) type).getAbsoluteArgumentTypes();
                int[] absoluteArgumentVariances = ((ParameterizedType) type2).getAbsoluteArgumentVariances();
                int[] absoluteArgumentVariances2 = ((ParameterizedType) type).getAbsoluteArgumentVariances();
                for (int i = 0; i < absoluteArgumentTypes.length; i++) {
                    int i2 = absoluteArgumentVariances[i];
                    if (i2 == 0) {
                        int i3 = absoluteArgumentVariances2[i];
                        if (i3 == 0) {
                            if (!j6(absoluteArgumentTypes2[i], absoluteArgumentTypes[i])) {
                                return false;
                            }
                        } else if (i3 == 1 || i3 == 2) {
                            if (!FH(absoluteArgumentTypes2[i], absoluteArgumentTypes[i])) {
                                return false;
                            }
                        } else if (i3 == 3 && !DW(absoluteArgumentTypes2[i], absoluteArgumentTypes[i])) {
                            return false;
                        }
                    } else {
                        if (i2 == 1 || i2 == 2) {
                            int i4 = absoluteArgumentVariances2[i];
                            if (i4 != 0) {
                                if (i4 == 1 || i4 == 2) {
                                    if (!FH(absoluteArgumentTypes2[i], absoluteArgumentTypes[i])) {
                                    }
                                } else if (i4 != 3) {
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
                                    return absoluteArgumentTypes2[i] == this.j6.getRootClasstype(this.u7, this.tp);
                                } catch (e4 unused3) {
                                    continue;
                                }
                            } else if (i5 == 3 && !DW(absoluteArgumentTypes2[i], absoluteArgumentTypes[i])) {
                                return false;
                            }
                        }
                    }
                }
                return true;
            } catch (Throwable th) {
                if (J0) {
                    iy.Mr(th, -7480364679176843548L, this, type, type2);
                }
                throw th;
            }
        }

        @ey(method = 4289314158256655253L)
        private boolean J0(MethodParameterType methodParameterType, Type type) {
            try {
                if (we) {
                    iy.EQ(-5808860083545445856L, this, methodParameterType, type);
                }
                if (type.getSemantic() == 2) {
                    return true;
                }
                if (type.isPrimitiveType()) {
                    try {
                        type = this.tp.getTypeSystem().Hw(this.u7, type);
                    } catch (e4 unused) {
                    }
                }
                if (this.gn.contains(methodParameterType)) {
                    return u7(this.u7, this.tp, (Type) this.gn.get(methodParameterType), type, this.EQ);
                }
                this.Zo.j6.FH(methodParameterType);
                while (this.Zo.j6.j6()) {
                    if (!u7(this.u7, this.tp, (Type) this.Zo.j6.v5(), type, this.EQ)) {
                        return false;
                    }
                }
                this.VH.insert(methodParameterType, type);
                return true;
            } catch (Throwable th) {
                if (J0) {
                    iy.Mr(th, -5808860083545445856L, this, methodParameterType, type);
                }
                throw th;
            }
        }

        @ey(method = 106645167220272156L)
        private boolean J8(MethodParameterType methodParameterType, Type type) {
            try {
                if (we) {
                    iy.EQ(907209392319052011L, this, methodParameterType, type);
                }
                if (type.getSemantic() == 2) {
                    return true;
                }
                if (type.isPrimitiveType()) {
                    try {
                        type = this.tp.getTypeSystem().Hw(this.u7, type);
                    } catch (e4 unused) {
                    }
                }
                if (this.gn.contains(methodParameterType)) {
                    return u7(this.u7, this.tp, type, (Type) this.gn.get(methodParameterType), this.EQ);
                }
                this.VH.j6.FH(methodParameterType);
                while (this.VH.j6.j6()) {
                    if (!u7(this.u7, this.tp, type, (Type) this.VH.j6.v5(), this.EQ)) {
                        return false;
                    }
                }
                this.Zo.insert(methodParameterType, type);
                return true;
            } catch (Throwable th) {
                if (J0) {
                    iy.Mr(th, 907209392319052011L, this, methodParameterType, type);
                }
                throw th;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:71:0x0196  */
        @abcd.ey(method = 5567933139725159880L)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private boolean QX() {
            /*
                Method dump skipped, instructions count: 441
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.api.Member.InferAlgorithm.QX():boolean");
        }

        @ey(method = 146341166620206312L)
        private boolean Ws(Type type, int i) {
            try {
                if (we) {
                    iy.EQ(495886318566629265L, this, type, new Integer(i));
                }
                if (!this.FH.Hw(type.getId())) {
                    return false;
                }
                if (this.v5.Hw(type.getId()) && this.v5.get(type.getId()) != i) {
                    return false;
                }
                this.v5.Zo(type.getId(), i);
                return true;
            } catch (Throwable th) {
                if (J0) {
                    iy.Mr(th, 495886318566629265L, this, type, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 1938517225019263665L)
        private Type XL(Type type) {
            try {
                if (we) {
                    iy.tp(2969212144020827088L, this, type);
                }
                if (type.isMethodParameterType()) {
                    return this.Hw.contains((MethodParameterType) type) ? (Type) this.Hw.get((MethodParameterType) type) : type;
                }
                if (!type.isParameterizedType()) {
                    return type.isArrayType() ? this.j6.hz(XL(((ArrayType) type).getElementType()), 1) : type;
                }
                Type[] absoluteArgumentTypes = ((ParameterizedType) type).getAbsoluteArgumentTypes();
                Type[] typeArr = new Type[absoluteArgumentTypes.length];
                int[] absoluteArgumentVariances = ((ParameterizedType) type).getAbsoluteArgumentVariances();
                int[] iArr = new int[absoluteArgumentTypes.length];
                for (int i = 0; i < absoluteArgumentTypes.length; i++) {
                    typeArr[i] = XL(absoluteArgumentTypes[i]);
                    iArr[i] = absoluteArgumentVariances[i];
                    if (this.v5.Hw(absoluteArgumentTypes[i].getId())) {
                        iArr[i] = this.v5.get(absoluteArgumentTypes[i].getId());
                    }
                }
                return this.j6.AL(((ParameterizedType) type).getClassType(), typeArr, iArr);
            } catch (Throwable th) {
                if (J0) {
                    iy.j3(th, 2969212144020827088L, this, type);
                }
                throw th;
            }
        }

        @ey(method = -2966005374563592024L)
        private boolean j6(Type type, Type type2) {
            try {
                if (we) {
                    iy.EQ(123011777460376755L, this, type, type2);
                }
                if (type.getSemantic() == 2 || type == type2) {
                    return true;
                }
                if (type2.isMethodParameterType()) {
                    return this.DW.contains(type2) ? we((MethodParameterType) type2, type) : type == type2;
                }
                if (type2.isArrayType()) {
                    if (type.isArrayType()) {
                        return j6(((ArrayType) type).getElementType(), ((ArrayType) type2).getElementType());
                    }
                    return false;
                }
                if (!type2.isParameterizedType()) {
                    return type == type2;
                }
                if (!type.isParameterizedType() || ((ParameterizedType) type2).getClassType() != ((ParameterizedType) type).getClassType()) {
                    return false;
                }
                Type[] absoluteArgumentTypes = ((ParameterizedType) type2).getAbsoluteArgumentTypes();
                Type[] absoluteArgumentTypes2 = ((ParameterizedType) type).getAbsoluteArgumentTypes();
                int[] absoluteArgumentVariances = ((ParameterizedType) type2).getAbsoluteArgumentVariances();
                int[] absoluteArgumentVariances2 = ((ParameterizedType) type).getAbsoluteArgumentVariances();
                for (int i = 0; i < absoluteArgumentTypes2.length; i++) {
                    if (absoluteArgumentVariances[i] != absoluteArgumentVariances2[i] || !j6(absoluteArgumentTypes2[i], absoluteArgumentTypes[i])) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                if (J0) {
                    iy.Mr(th, 123011777460376755L, this, type, type2);
                }
                throw th;
            }
        }

        @ey(method = 189615642652146960L)
        private boolean tp(Member member, Type type) {
            try {
                if (we) {
                    iy.EQ(2969470565006014707L, this, member, type);
                }
                this.Hw.j6.DW();
                while (this.Hw.j6.j6()) {
                    if (!EQ(member, type, (MethodParameterType) this.Hw.j6.Hw(), (Type) this.Hw.j6.v5())) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                if (J0) {
                    iy.Mr(th, 2969470565006014707L, this, member, type);
                }
                throw th;
            }
        }

        @ey(method = -704136921522239232L)
        private boolean u7(FileEntry fileEntry, Language language, Type type, Type type2, boolean z) {
            try {
                if (we) {
                    iy.J8(-8576357606784801915L, this, fileEntry, language, type, type2, new Boolean(z));
                }
                return type.isImplicitConvertibleTo(fileEntry, language, type2);
            } catch (Throwable th) {
                if (J0) {
                    iy.lg(th, -8576357606784801915L, this, fileEntry, language, type, type2, new Boolean(z));
                }
                throw th;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v8, types: [com.aide.codemodel.api.collections.FunctionOfIntInt] */
        /* JADX WARN: Type inference failed for: r8v13, types: [int] */
        /* JADX WARN: Type inference failed for: r8v14 */
        /* JADX WARN: Type inference failed for: r8v20 */
        @ey(method = 4579559353842061455L)
        private boolean v5(Member member, Type type, Type[] typeArr, int i, int i2, Type[] typeArr2, int i3, int i4) throws Throwable {
            char c = 0;
            z = false;
            boolean z = false;
            try {
                if (we) {
                    iy.QX(-2289767990238469056L, this, new Object[]{member, type, typeArr, new Integer(i), new Integer(i2), typeArr2, new Integer(i3), new Integer(i4)});
                }
                if (i4 > 0 && member.Eq() != i4) {
                    return false;
                }
                this.v5.clear();
                if (i4 > 0) {
                    this.DW = member.aq();
                    this.Hw.clear();
                    for (int i5 = 0; i5 < i4; i5++) {
                        int i6 = i3 + i5;
                        if (typeArr2[i6] != null) {
                            this.Hw.QX(member.Xa(i5), typeArr2[i6]);
                        }
                    }
                    return tp(member, type);
                }
                try {
                    this.DW = member.aq();
                    this.Zo.clear();
                    this.VH.clear();
                    this.gn.clear();
                    this.FH.clear();
                    int iOY = member.oY();
                    this.DW.DEFAULT_ITERATOR.init();
                    while (this.DW.DEFAULT_ITERATOR.hasMoreElements()) {
                        MethodParameterType methodParameterType = (MethodParameterType) this.DW.DEFAULT_ITERATOR.nextKey();
                        int i7 = 0;
                        while (i7 < iOY) {
                            Type typeZh = member.zh(type, i7);
                            if (typeZh.isParameterizedType()) {
                                Type[] absoluteArgumentTypes = ((ParameterizedType) typeZh).getAbsoluteArgumentTypes();
                                int i8 = 0;
                                ?? r8 = z;
                                while (i8 < absoluteArgumentTypes.length) {
                                    if (methodParameterType == absoluteArgumentTypes[i8]) {
                                        if (!this.FH.Hw(methodParameterType.getId())) {
                                            this.FH.Zo(methodParameterType.getId(), r8);
                                        }
                                        try {
                                            try {
                                                this.FH.Zo(methodParameterType.getId(), this.FH.get(methodParameterType.getId()) + 1);
                                            } catch (e4 unused) {
                                                return false;
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            c = 0;
                                            if (J0) {
                                                Object[] objArr = new Object[8];
                                                objArr[c] = member;
                                                objArr[1] = type;
                                                objArr[2] = typeArr;
                                                objArr[3] = new Integer(i);
                                                objArr[4] = new Integer(i2);
                                                objArr[5] = typeArr2;
                                                objArr[6] = new Integer(i3);
                                                objArr[7] = new Integer(i4);
                                                iy.rN(th, -2289767990238469056L, this, objArr);
                                            }
                                            throw th;
                                        }
                                    }
                                    i8++;
                                    r8 = 0;
                                }
                            } else if (typeZh.containsType(methodParameterType)) {
                                this.FH.Zo(methodParameterType.getId(), 2);
                            }
                            i7++;
                            z = false;
                        }
                    }
                    for (int i9 = 0; i9 < iOY; i9++) {
                        Type typeZh2 = member.zh(type, i9);
                        int i10 = i9 + i2;
                        if (typeArr[i10] != null && !DW(typeArr[i10].Qq(), typeZh2)) {
                            return false;
                        }
                    }
                    if (QX()) {
                        if (tp(member, type)) {
                            return true;
                        }
                    }
                    return false;
                } catch (e4 unused2) {
                    return z;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @ey(method = -4337678870641217697L)
        private boolean we(MethodParameterType methodParameterType, Type type) {
            try {
                if (we) {
                    iy.EQ(2241967791865680900L, this, methodParameterType, type);
                }
                if (type.getSemantic() == 2) {
                    return true;
                }
                if (type.isPrimitiveType()) {
                    try {
                        type = this.tp.getTypeSystem().Hw(this.u7, type);
                    } catch (e4 unused) {
                    }
                }
                if (this.gn.contains(methodParameterType)) {
                    return this.gn.get(methodParameterType) == type;
                }
                this.Zo.j6.FH(methodParameterType);
                while (this.Zo.j6.j6()) {
                    if (!u7(this.u7, this.tp, (Type) this.Zo.j6.v5(), type, this.EQ)) {
                        return false;
                    }
                }
                this.Zo.j3(methodParameterType);
                this.VH.j6.FH(methodParameterType);
                while (this.VH.j6.j6()) {
                    if (!u7(this.u7, this.tp, type, (Type) this.VH.j6.v5(), this.EQ)) {
                        return false;
                    }
                }
                this.VH.j3(methodParameterType);
                this.gn.QX(methodParameterType, type);
                return true;
            } catch (Throwable th) {
                if (J0) {
                    iy.Mr(th, 2241967791865680900L, this, methodParameterType, type);
                }
                throw th;
            }
        }

        @ey(method = -2103436789509265952L)
        public Type Hw(FileEntry fileEntry, Language language, Member member, int i, Type type, Type[] typeArr, int i2, int i3, Type[] typeArr2, int i4, int i5) throws Throwable {
            int i6 = i3;
            try {
                if (we) {
                    iy.QX(1240946227805037369L, this, new Object[]{fileEntry, language, member, new Integer(i), type, typeArr, new Integer(i2), new Integer(i6), typeArr2, new Integer(i4), new Integer(i5)});
                }
                this.u7 = fileEntry;
                this.tp = language;
                this.EQ = false;
            } catch (Throwable th) {
                th = th;
                i6 = 11;
            }
            try {
                if (i6 != member.oY()) {
                    throw new e4();
                }
                if (v5(member, type, typeArr, i3, i2, typeArr2, i4, i5)) {
                    return XL(member.kQ(i, type));
                }
                throw new e4();
            } catch (Throwable th2) {
                th = th2;
                if (J0) {
                    Object[] objArr = new Object[i6];
                    objArr[0] = fileEntry;
                    objArr[1] = language;
                    objArr[2] = member;
                    objArr[3] = new Integer(i);
                    objArr[4] = type;
                    objArr[5] = typeArr;
                    objArr[6] = new Integer(i2);
                    objArr[7] = new Integer(i3);
                    objArr[8] = typeArr2;
                    objArr[9] = new Integer(i4);
                    objArr[10] = new Integer(i5);
                    iy.rN(th, 1240946227805037369L, this, objArr);
                }
                throw th;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @ey(method = -93507161976904208L)
        public Type VH(FileEntry fileEntry, Language language, Member member, int i, Type type, Type[] typeArr, int i2, int i3, Type[] typeArr2, int i4, int i5) throws Throwable {
            int i6;
            Language language2 = language;
            try {
                if (we) {
                    iy.QX(-4295632759794626595L, this, new Object[]{fileEntry, language2, member, new Integer(i), type, typeArr, new Integer(i2), new Integer(i3), typeArr2, new Integer(i4), new Integer(i5)});
                }
                this.u7 = fileEntry;
                this.tp = language2;
                this.EQ = false;
            } catch (Throwable th) {
                th = th;
                i6 = 11;
            }
            try {
                if (i3 != member.oY()) {
                    throw new e4();
                }
                if (v5(member, type, typeArr, i3, i2, typeArr2, i4, i5)) {
                    return XL(member.zh(type, i));
                }
                throw new e4();
            } catch (Throwable th2) {
                th = th2;
                i6 = language2;
                if (J0) {
                    Object[] objArr = new Object[i6];
                    objArr[0] = fileEntry;
                    objArr[1] = language;
                    objArr[2] = member;
                    objArr[3] = new Integer(i);
                    objArr[4] = type;
                    objArr[5] = typeArr;
                    objArr[6] = new Integer(i2);
                    objArr[7] = new Integer(i3);
                    objArr[8] = typeArr2;
                    objArr[9] = new Integer(i4);
                    objArr[10] = new Integer(i5);
                    iy.rN(th, -4295632759794626595L, this, objArr);
                }
                throw th;
            }
        }

        @ey(method = -2631577850962990520L)
        public Type Zo(FileEntry fileEntry, Language language, Member member, Type type, Type[] typeArr, int i, int i2, Type[] typeArr2, int i3, int i4) throws Throwable {
            int i5 = i3;
            try {
                if (we) {
                    iy.QX(3380534853494128379L, this, new Object[]{fileEntry, language, member, type, typeArr, new Integer(i), new Integer(i2), typeArr2, new Integer(i5), new Integer(i4)});
                }
                this.u7 = fileEntry;
                this.tp = language;
                this.EQ = false;
                try {
                    if (i2 != member.oY()) {
                        throw new e4();
                    }
                    if (v5(member, type, typeArr, i2, i, typeArr2, i3, i4)) {
                        return XL(member.jw(type));
                    }
                    throw new e4();
                } catch (Throwable th) {
                    th = th;
                    if (J0) {
                        Object[] objArr = new Object[i5];
                        objArr[0] = fileEntry;
                        objArr[1] = language;
                        objArr[2] = member;
                        objArr[3] = type;
                        objArr[4] = typeArr;
                        objArr[5] = new Integer(i);
                        objArr[6] = new Integer(i2);
                        objArr[7] = typeArr2;
                        objArr[8] = new Integer(i3);
                        objArr[9] = new Integer(i4);
                        iy.rN(th, 3380534853494128379L, this, objArr);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                i5 = 10;
            }
        }

        @ey(method = -6252396453373903896L)
        public boolean gn(FileEntry fileEntry, Language language, Member member, Type type, Type[] typeArr, int i, int i2, Type[] typeArr2, int i3, int i4) throws Throwable {
            int i5;
            int i6;
            char c;
            try {
                if (we) {
                    iy.QX(-3495407731797173043L, this, new Object[]{fileEntry, language, member, type, typeArr, new Integer(i), new Integer(i2), typeArr2, new Integer(i3), new Integer(i4)});
                }
                try {
                    this.u7 = fileEntry;
                    this.tp = language;
                    this.EQ = false;
                    if (i2 != member.oY()) {
                        return false;
                    }
                    c = 0;
                    i5 = i4;
                    i6 = i2;
                    try {
                        if (!v5(member, type, typeArr, i2, i, typeArr2, i3, i4)) {
                            return false;
                        }
                        if (i5 == 0) {
                            return true;
                        }
                        for (int i7 = 0; i7 < i6; i7++) {
                            Type typeXL = XL(member.zh(type, i7));
                            int i8 = i7 + i;
                            if (typeArr[i8] != null && !u7(fileEntry, language, typeArr[i8].Qq(), typeXL, this.EQ)) {
                                return false;
                            }
                        }
                        return true;
                    } catch (e4 unused) {
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        if (J0) {
                            Object[] objArr = new Object[10];
                            objArr[c] = fileEntry;
                            objArr[1] = language;
                            objArr[2] = member;
                            objArr[3] = type;
                            objArr[4] = typeArr;
                            objArr[5] = new Integer(i);
                            objArr[6] = new Integer(i6);
                            objArr[7] = typeArr2;
                            objArr[8] = new Integer(i3);
                            objArr[9] = new Integer(i5);
                            iy.rN(th, -3495407731797173043L, this, objArr);
                        }
                        throw th;
                    }
                } catch (e4 unused2) {
                    return false;
                }
            } catch (Throwable th2) {
                th = th2;
                i5 = i4;
                i6 = i2;
                c = 0;
            }
        }
    }

    static {
        iy.Zo(Member.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -809701514344607625L)
    public Member(EntitySpace entitySpace, IdentifierSpace identifierSpace, FileSpace fileSpace) {
        super(fileSpace, entitySpace);
        try {
            if (J8) {
                iy.we(-145125862204051559L, null, entitySpace, identifierSpace, fileSpace);
            }
            this.entitySpace = entitySpace;
            this.identifierSpace = identifierSpace;
            this.fileSpace = fileSpace;
        } catch (Throwable th) {
            if (Ws) {
                iy.U2(th, -145125862204051559L, null, entitySpace, identifierSpace, fileSpace);
            }
            throw th;
        }
    }

    @ey(method = -47594446668108379L)
    private void AE() {
        try {
            if (J8) {
                iy.gn(-2711369668343499695L, this);
            }
            loadSyntax();
            if (data().FH) {
                return;
            }
            data().FH = true;
            this.entitySpace.e9(getFile(), getLanguage());
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -2711369668343499695L, this);
            }
            throw th;
        }
    }

    @ey(method = -1805282417375432031L)
    private boolean QO(FileEntry fileEntry, Language language, Type type, Type type2) {
        try {
            if (J8) {
                iy.J0(1959279309786642717L, this, fileEntry, language, type, type2);
            }
            if (!type.isArrayType() || !type2.isArrayType()) {
                return false;
            }
            if (type.isImplicitConvertibleTo(fileEntry, language, type2)) {
                return true;
            }
            return ((ArrayType) type2).getElementType().isMethodParameterType();
        } catch (Throwable th) {
            if (Ws) {
                iy.a8(th, 1959279309786642717L, this, fileEntry, language, type, type2);
            }
            throw th;
        }
    }

    @ey(method = 2471310004617380872L)
    private Data data() {
        try {
            if (J8) {
                iy.gn(2467455125587725528L, this);
            }
            if (this.data != null) {
                return this.data;
            }
            Data data = new Data(null);
            this.data = data;
            return data;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, 2467455125587725528L, this);
            }
            throw th;
        }
    }

    @ey(method = 819771234649665903L)
    private boolean dx(Member member, Member member2) {
        try {
            if (J8) {
                iy.EQ(-1467104895906031917L, this, member, member2);
            }
            if (member.oY() != member2.oY() || member.Eq() != member2.Eq()) {
                return false;
            }
            int iOY = member.oY();
            for (int i = 0; i < iOY; i++) {
                if (member.FN(i) != member2.FN(i) || member.qp(i) != member2.qp(i)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (Ws) {
                iy.Mr(th, -1467104895906031917L, this, member, member2);
            }
            throw th;
        }
    }

    @ey(method = -3431063061658460877L)
    private void loadSyntax() {
        try {
            if (J8) {
                iy.gn(992348519093424015L, this);
            }
            if (data().syntaxLoaded) {
                return;
            }
            data().syntaxLoaded = true;
            this.entitySpace.loadSyntax(getFile(), getLanguage());
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, 992348519093424015L, this);
            }
            throw th;
        }
    }

    @ey(method = 1435268630273578920L)
    public int AL() {
        try {
            if (J8) {
                iy.gn(-2858773461719534184L, this);
            }
            loadSyntax();
            return data().j6;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -2858773461719534184L, this);
            }
            throw th;
        }
    }

    @ey(method = 869408275534771508L)
    public int CU(int i) {
        try {
            if (J8) {
                iy.u7(753747211361321100L, this, i);
            }
            loadSyntax();
            if (data().a8.get(i) != 0) {
                return data().a8.get(i);
            }
            return this.identifierSpace.get("p" + i);
        } catch (Throwable th) {
            if (Ws) {
                iy.j3(th, 753747211361321100L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 1956133661312479683L)
    public boolean Cz() {
        try {
            if (J8) {
                iy.gn(1726236139704151591L, this);
            }
            loadSyntax();
            if ((data().ei & 4) != 0) {
                return true;
            }
            SetOf<Member> setOfJO = jO();
            setOfJO.DEFAULT_ITERATOR.init();
            while (setOfJO.DEFAULT_ITERATOR.hasMoreElements()) {
                if (((Member) setOfJO.DEFAULT_ITERATOR.nextKey()).Cz()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, 1726236139704151591L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = -5495343268736208513L)
    public int DW() {
        try {
            if (J8) {
                iy.gn(-2326872572193652245L, this);
            }
            return this.EQ;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -2326872572193652245L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = 3876393624493930792L)
    public String EQ() {
        try {
            if (J8) {
                iy.gn(-490315802025083952L, this);
            }
            try {
                String str = "";
                if (e9()) {
                    String str2 = "(";
                    for (int i = 0; i < oY(); i++) {
                        if (i > 0) {
                            str2 = str2 + ", ";
                        }
                        str2 = str2 + qp(i).getFullyQualifiedNameString();
                    }
                    str = str2 + ")";
                }
                return getEnclosingClassType().EQ() + "#" + getNameString() + str;
            } catch (e4 unused) {
                return null;
            }
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -490315802025083952L, this);
            }
            throw th;
        }
    }

    @ey(method = 2243707437268613133L)
    public int Eq() {
        try {
            if (J8) {
                iy.gn(-2290273318649352455L, this);
            }
            loadSyntax();
            if (data().yS == null) {
                return 0;
            }
            return data().yS.EQ();
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -2290273318649352455L, this);
            }
            throw th;
        }
    }

    @ey(method = -2671967061912770028L)
    public int Ev() {
        try {
            if (J8) {
                iy.gn(3120324774342989628L, this);
            }
            this.entitySpace.Cz(getFile(), getLanguage());
            return data().we;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, 3120324774342989628L, this);
            }
            throw th;
        }
    }

    @ey(method = -1642872367678490387L)
    public int FN(int i) {
        try {
            if (J8) {
                iy.u7(787341520411453929L, this, i);
            }
            loadSyntax();
            return data().U2.get(i);
        } catch (Throwable th) {
            if (Ws) {
                iy.j3(th, 787341520411453929L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2998896209316311168L)
    public boolean Gj() {
        try {
            if (J8) {
                iy.gn(-1977022648518672912L, this);
            }
            loadSyntax();
            return (data().ei & 32) != 0;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -1977022648518672912L, this);
            }
            throw th;
        }
    }

    @ey(method = 1658399782794020261L)
    public void I(ClassType classType, int i, int i2, int i3, boolean z, boolean z2, int i4, int i5, boolean z3, boolean z4, boolean z5, int i6) {
        try {
            if (J8) {
                iy.QX(-3079919977416680895L, this, new Object[]{classType, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z), new Boolean(z2), new Integer(i4), new Integer(i5), new Boolean(z3), new Boolean(z4), new Boolean(z5), new Integer(i6)});
            }
            this.we = classType;
            data().FH = false;
            data().XL = z;
            data().aM = z2;
            data().modifierFlags = i;
            data().P8 = i5;
            data().QX = i4;
            data().ei = 0;
            data().ei |= 64;
            if (z5) {
                data().ei |= 128;
            }
            if (z3) {
                data().ei |= 8;
            }
            if (z4) {
                data().ei |= 16;
            }
            if (data().j3 != null) {
                data().j3.setSize(i6);
                for (int i7 = 0; i7 < i6; i7++) {
                    data().j3.u7(i7, null);
                }
            } else if (i6 > 0) {
                data().j3 = new ListOf<>(this.entitySpace, i6);
                for (int i8 = 0; i8 < i6; i8++) {
                    data().j3.u7(i8, null);
                }
            }
            if (data().U2 != null) {
                data().U2.u7(i3);
                for (int i9 = 0; i9 < i3; i9++) {
                    data().U2.gn(i9, 0);
                }
            } else if (i3 > 0) {
                data().U2 = new ListOfInt(i3);
                for (int i10 = 0; i10 < i3; i10++) {
                    data().U2.gn(i10, 0);
                }
            }
            if (data().a8 != null) {
                data().a8.u7(i3);
                for (int i11 = 0; i11 < i3; i11++) {
                    data().a8.gn(i11, 0);
                }
            } else if (i3 > 0) {
                data().a8 = new ListOfInt(i3);
                for (int i12 = 0; i12 < i3; i12++) {
                    data().a8.gn(i12, 0);
                }
            }
            if (data().Mr != null) {
                data().Mr.setSize(i3);
                for (int i13 = 0; i13 < i3; i13++) {
                    data().Mr.u7(i13, null);
                }
            } else if (i3 > 0) {
                data().Mr = new ListOf<>(this.entitySpace, i3);
                for (int i14 = 0; i14 < i3; i14++) {
                    data().Mr.u7(i14, null);
                }
            }
            if (data().rN == null) {
                data().rN = new MapOfInt<>(this.entitySpace);
            } else {
                data().rN.Hw();
            }
            if (i2 == 0) {
                data().er = null;
            } else {
                data().er = new SetOf<>(this.entitySpace);
            }
            if (i2 == 0) {
                data().yS = null;
            } else {
                data().yS = new ListOf<>(this.entitySpace, i2);
            }
        } catch (Throwable th) {
            if (Ws) {
                iy.rN(th, -3079919977416680895L, this, new Object[]{classType, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z), new Boolean(z2), new Integer(i4), new Integer(i5), new Boolean(z3), new Boolean(z4), new Boolean(z5), new Integer(i6)});
            }
            throw th;
        }
    }

    @ey(method = -5037484506998100789L)
    public boolean IS() {
        try {
            if (J8) {
                iy.gn(-4987540625155653217L, this);
            }
            loadSyntax();
            if ((data().ei & 2) != 0) {
                return true;
            }
            SetOf<Member> setOfJO = jO();
            setOfJO.DEFAULT_ITERATOR.init();
            while (setOfJO.DEFAULT_ITERATOR.hasMoreElements()) {
                if (((Member) setOfJO.DEFAULT_ITERATOR.nextKey()).IS()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -4987540625155653217L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = -17442944172031776L)
    public int J8() {
        try {
            if (J8) {
                iy.gn(-8571265361574950160L, this);
            }
            this.entitySpace.Cz(getFile(), getLanguage());
            return data().VH;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -8571265361574950160L, this);
            }
            throw th;
        }
    }

    @ey(method = -3139009102880676927L)
    public boolean Jl() {
        try {
            if (J8) {
                iy.gn(-2107702800931594075L, this);
            }
            loadSyntax();
            if ((data().modifierFlags & 512) != 0) {
                if (data().vy) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -2107702800931594075L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = -5055339245579067685L)
    public int Mr() {
        try {
            if (J8) {
                iy.gn(5017514858397633375L, this);
            }
            this.entitySpace.Cz(getFile(), getLanguage());
            return data().u7;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, 5017514858397633375L, this);
            }
            throw th;
        }
    }

    @ey(method = 554092940968899192L)
    public void Mz(String str) {
        try {
            if (J8) {
                iy.tp(7409204832535580880L, this, str);
            }
            data().KD = str;
            data().ro = true;
            data().Hw = true;
        } catch (Throwable th) {
            if (Ws) {
                iy.j3(th, 7409204832535580880L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -2029864142538749104L)
    public boolean Nh(ClassType classType, ClassType classType2) {
        try {
            if (J8) {
                iy.EQ(1135212312545736672L, this, classType, classType2);
            }
            int modifiers = getModifiers();
            ClassType enclosingClassType = getEnclosingClassType();
            if (y1.J8(modifiers)) {
                return true;
            }
            if (y1.FH(modifiers) && (classType2.hp(enclosingClassType) || classType2.GT(enclosingClassType))) {
                return true;
            }
            if (y1.gn(modifiers) && enclosingClassType.ys() == classType2.ys()) {
                return true;
            }
            if (y1.VH(modifiers) && (classType2.Cz() == enclosingClassType.Cz() || this.entitySpace.v5(enclosingClassType.Cz(), classType2.Cz()))) {
                return true;
            }
            if (y1.we(modifiers) && classType2.getNamespace() == enclosingClassType.getNamespace()) {
                return true;
            }
            if (y1.J0(modifiers)) {
                if (enclosingClassType == classType2) {
                    return true;
                }
                if (enclosingClassType.getNamespace() == classType2.getNamespace() && enclosingClassType.getIdentifier() == classType2.getIdentifier() && enclosingClassType.Yi() && classType2.Yi()) {
                    return true;
                }
                if (classType2.Ej(enclosingClassType)) {
                    return y1.aM(modifiers) || classType.Ej(classType2);
                }
                while (!classType2.isToplevel()) {
                    classType2 = classType2.getEnclosingClassType();
                    if (classType2.Ej(enclosingClassType)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            if (Ws) {
                iy.Mr(th, 1135212312545736672L, this, classType, classType2);
            }
            throw th;
        }
    }

    @ey(method = -371787774548044324L)
    public SetOf<Member> OW() {
        try {
            if (J8) {
                iy.gn(-166266486889957740L, this);
            }
            SetOf<Member> setOf = new SetOf<>(this.entitySpace);
            SetOf setOf2 = new SetOf(this.entitySpace);
            setOf2.put(this);
            while (true) {
                setOf2.DEFAULT_ITERATOR.init();
                while (setOf2.DEFAULT_ITERATOR.hasMoreElements()) {
                    Member member = (Member) setOf2.DEFAULT_ITERATOR.nextKey();
                    setOf.put(member);
                    setOf.u7(member.jO());
                }
                if (setOf2.J0() == setOf.J0()) {
                    return setOf;
                }
                setOf2.clear();
                setOf2.u7(setOf);
            }
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -166266486889957740L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = -543825990549010373L)
    public int QX() {
        try {
            if (J8) {
                iy.gn(-462254836050515625L, this);
            }
            this.entitySpace.Cz(getFile(), getLanguage());
            return data().Zo;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -462254836050515625L, this);
            }
            throw th;
        }
    }

    @ey(method = 1929958219845929560L)
    public void Qq(Type type) {
        try {
            if (J8) {
                iy.tp(476774273333512992L, this, type);
            }
            data().gW = type;
        } catch (Throwable th) {
            if (Ws) {
                iy.j3(th, 476774273333512992L, this, type);
            }
            throw th;
        }
    }

    @ey(method = 141279064802648280L)
    public void Sf(int i, int i2, MethodParameterType methodParameterType) {
        try {
            if (J8) {
                iy.we(-6808996718173573344L, this, new Integer(i), new Integer(i2), methodParameterType);
            }
            data().rN.we(i2, methodParameterType);
            data().er.put(methodParameterType);
            data().yS.u7(i, methodParameterType);
        } catch (Throwable th) {
            if (Ws) {
                iy.U2(th, -6808996718173573344L, this, new Integer(i), new Integer(i2), methodParameterType);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = -192457990337570404L)
    public int U2() {
        try {
            if (J8) {
                iy.gn(-84846092364230604L, this);
            }
            this.entitySpace.Cz(getFile(), getLanguage());
            return data().tp;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -84846092364230604L, this);
            }
            throw th;
        }
    }

    @ey(method = 1235716168205194728L)
    public Type WB() {
        try {
            if (J8) {
                iy.gn(2036031304339052920L, this);
            }
            AE();
            if (data().gW != null) {
                return data().gW;
            }
            throw new e4();
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, 2036031304339052920L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = 6309231114484901659L)
    public int Ws() {
        try {
            if (J8) {
                iy.gn(-4304520847096064217L, this);
            }
            this.entitySpace.Cz(getFile(), getLanguage());
            return data().v5;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -4304520847096064217L, this);
            }
            throw th;
        }
    }

    @ey(method = 6398803361224522064L)
    public int XG() {
        try {
            if (J8) {
                iy.gn(-4263778346577875944L, this);
            }
            if (data().j3 == null) {
                return 0;
            }
            return data().j3.EQ();
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -4263778346577875944L, this);
            }
            throw th;
        }
    }

    @ey(method = 1619568683387233280L)
    public Type XX(int i) {
        try {
            if (J8) {
                iy.u7(92406135090873696L, this, i);
            }
            AE();
            if (data().j3.v5(i) != null) {
                return (Type) data().j3.v5(i);
            }
            throw new e4();
        } catch (Throwable th) {
            if (Ws) {
                iy.j3(th, 92406135090873696L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -1225195403954032217L)
    public MethodParameterType Xa(int i) {
        try {
            if (J8) {
                iy.u7(647502983821125675L, this, i);
            }
            return (MethodParameterType) data().yS.v5(i);
        } catch (Throwable th) {
            if (Ws) {
                iy.j3(th, 647502983821125675L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -4289699611470740440L)
    public boolean Z1() {
        try {
            if (J8) {
                iy.gn(156588536983927800L, this);
            }
            loadSyntax();
            return data().XL;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, 156588536983927800L, this);
            }
            throw th;
        }
    }

    @ey(method = -3053753759725672997L)
    public void Za() {
        try {
            if (J8) {
                iy.gn(1162422186106235447L, this);
            }
            this.data = null;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, 1162422186106235447L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = 185346507117762331L)
    public int Zo() {
        try {
            if (J8) {
                iy.gn(-4009148199723316425L, this);
            }
            this.entitySpace.Cz(getFile(), getLanguage());
            return data().J8;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -4009148199723316425L, this);
            }
            throw th;
        }
    }

    @ey(method = 5488419513193772860L)
    public boolean a5() {
        try {
            if (J8) {
                iy.gn(1237200756936961572L, this);
            }
            loadSyntax();
            return (data().ei & 128) != 0;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, 1237200756936961572L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = -8361957504875801120L)
    public int a8() {
        try {
            if (J8) {
                iy.gn(5020674926028653136L, this);
            }
            this.entitySpace.Cz(getFile(), getLanguage());
            return data().gn;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, 5020674926028653136L, this);
            }
            throw th;
        }
    }

    @ey(method = -1356851352499011660L)
    public boolean aX() {
        try {
            if (!J8) {
                return false;
            }
            iy.gn(4344403453524933804L, this);
            return false;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, 4344403453524933804L, this);
            }
            throw th;
        }
    }

    @ey(method = 2081122949937791736L)
    public void aj(long j) {
        try {
            if (J8) {
                iy.tp(1118735748394980656L, this, new Long(j));
            }
            data().nw = j;
            data().SI = true;
            data().Hw = true;
        } catch (Throwable th) {
            if (Ws) {
                iy.j3(th, 1118735748394980656L, this, new Long(j));
            }
            throw th;
        }
    }

    @ey(method = 292551006315594459L)
    public SetOf<MethodParameterType> aq() {
        try {
            if (J8) {
                iy.gn(196202876399097975L, this);
            }
            return Eq() == 0 ? new SetOf<>(this.entitySpace) : data().er;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, 196202876399097975L, this);
            }
            throw th;
        }
    }

    @ey(method = 1215090340119451377L)
    public long br() {
        try {
            if (J8) {
                iy.gn(-2856682457545217723L, this);
            }
            if (w9()) {
                return data().nw;
            }
            return 0L;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -2856682457545217723L, this);
            }
            throw th;
        }
    }

    @ey(method = 4609916323248183035L)
    public boolean cT() {
        try {
            if (J8) {
                iy.gn(7485356120879502847L, this);
            }
            getEnclosingClassType().e3();
            if (data().lg != null) {
                return data().lg.J0() != 0;
            }
            return false;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, 7485356120879502847L, this);
            }
            throw th;
        }
    }

    @ey(method = -5518836603659182144L)
    public void ca(ClassType classType, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        try {
            if (J8) {
                iy.QX(371701562359198240L, this, new Object[]{classType, new Integer(i), new Integer(i2), new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4)});
            }
            this.we = classType;
            data().vy = z;
            data().modifierFlags = i;
            data().P8 = i2;
            data().ei = 0;
            data().ei |= 32;
            if (z2) {
                data().ei |= 1;
            }
            if (z3) {
                data().ei |= 4;
            }
            if (z4) {
                data().ei |= 2;
            }
        } catch (Throwable th) {
            if (Ws) {
                iy.rN(th, 371701562359198240L, this, new Object[]{classType, new Integer(i), new Integer(i2), new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4)});
            }
            throw th;
        }
    }

    @ey(method = 6077376607038001136L)
    public boolean e3() {
        try {
            if (J8) {
                iy.gn(-4556021430815345304L, this);
            }
            if (iW()) {
                SetOf<Member> setOfAX = getEnclosingClassType().aX();
                setOfAX.DEFAULT_ITERATOR.init();
                while (setOfAX.DEFAULT_ITERATOR.hasMoreElements()) {
                    Member member = (Member) setOfAX.DEFAULT_ITERATOR.nextKey();
                    if (member != this && dx(this, member)) {
                        return true;
                    }
                }
                return false;
            }
            if (sg()) {
                return false;
            }
            MapOfInt<Member> mapOfIntSM = getEnclosingClassType().sM();
            mapOfIntSM.DEFAULT_ITERATOR.init(getIdentifier());
            while (mapOfIntSM.DEFAULT_ITERATOR.hasMoreElements()) {
                Member member2 = (Member) mapOfIntSM.DEFAULT_ITERATOR.nextValue();
                if (member2 != this && !member2.sg() && dx(this, member2)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -4556021430815345304L, this);
            }
            throw th;
        }
    }

    @ey(method = 2161837156304216391L)
    public boolean e9() {
        try {
            if (J8) {
                iy.gn(1972930597899950475L, this);
            }
            loadSyntax();
            return (data().ei & 64) != 0;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, 1972930597899950475L, this);
            }
            throw th;
        }
    }

    @ey(method = 5115303978400172807L)
    public boolean eU() {
        try {
            if (J8) {
                iy.gn(920728263211671395L, this);
            }
            if (sg()) {
                return false;
            }
            MapOfInt<Member> mapOfIntQO = getEnclosingClassType().QO();
            mapOfIntQO.DEFAULT_ITERATOR.init(getIdentifier());
            while (mapOfIntQO.DEFAULT_ITERATOR.hasMoreElements()) {
                Member member = (Member) mapOfIntQO.DEFAULT_ITERATOR.nextValue();
                if (member != this && !member.sg()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, 920728263211671395L, this);
            }
            throw th;
        }
    }

    @ey(method = -123562342446483220L)
    public void ef(Type type, int i) {
        try {
            if (J8) {
                iy.EQ(6904717995152942580L, this, type, new Integer(i));
            }
            data().j3.u7(i, type);
        } catch (Throwable th) {
            if (Ws) {
                iy.Mr(th, 6904717995152942580L, this, type, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -820538466309716457L)
    public Type et(int i) {
        try {
            if (J8) {
                iy.u7(-1072749879359410941L, this, i);
            }
            AE();
            return (Type) data().sh.v5(i);
        } catch (Throwable th) {
            if (Ws) {
                iy.j3(th, -1072749879359410941L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 3116074474809614252L)
    public boolean fN() {
        try {
            if (J8) {
                iy.gn(6176412516118802580L, this);
            }
            loadSyntax();
            return data().aM;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, 6176412516118802580L, this);
            }
            throw th;
        }
    }

    @ey(method = -384626720787671615L)
    public Type fY(Type type, boolean z) {
        try {
            if (J8) {
                iy.EQ(-289483535787216155L, this, type, new Boolean(z));
            }
            Type typeWB = WB();
            Type containingTypeOfMember = type.isClassType() ? ((ClassType) type).getContainingTypeOfMember(this) : ((ParameterizedType) type).getClassType().getContainingTypeOfMember(this);
            if (z) {
                if (typeWB.isParameterType() && containingTypeOfMember.isParameterizedType() && type.isParameterizedType()) {
                    Type typeMb = ((ParameterizedType) containingTypeOfMember).mb(typeWB, true);
                    if (typeMb.isParameterType() && ((ParameterType) typeMb).WB() == ((ParameterizedType) type).getClassType() && ((ParameterizedType) type).getAbsoluteArgumentVariances()[((ParameterType) typeMb).ko()] == 3) {
                        return typeWB.x9();
                    }
                }
            } else if (typeWB.isParameterType() && containingTypeOfMember.isParameterizedType() && type.isParameterizedType()) {
                Type typeMb2 = ((ParameterizedType) containingTypeOfMember).mb(typeWB, true);
                if (typeMb2.isParameterType() && ((((ParameterType) typeMb2).WB() == ((ParameterizedType) type).getClassType() && ((ParameterizedType) type).getAbsoluteArgumentVariances()[((ParameterType) typeMb2).ko()] == 2) || ((ParameterizedType) type).getAbsoluteArgumentVariances()[((ParameterType) typeMb2).ko()] == 1)) {
                    throw new e4();
                }
            }
            return type.isClassType() ? ((type.et() || containingTypeOfMember.et()) && !gG()) ? typeWB.x9() : containingTypeOfMember.isParameterizedType() ? ((ParameterizedType) containingTypeOfMember).mb(typeWB, z) : typeWB : ((type.et() || containingTypeOfMember.et()) && !gG()) ? ((ParameterizedType) type).mb(typeWB.x9(), z) : !containingTypeOfMember.isParameterizedType() ? ((ParameterizedType) type).mb(typeWB, z) : ((ParameterizedType) type).mb(((ParameterizedType) containingTypeOfMember).mb(typeWB, z), z);
        } catch (Throwable th) {
            if (Ws) {
                iy.Mr(th, -289483535787216155L, this, type, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -392892745937376403L)
    public void g3(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        try {
            if (J8) {
                iy.QX(1431176394442269825L, this, new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Integer(i9), new Integer(i10), new Integer(i11)});
            }
            data().v5 = i;
            data().Zo = i2;
            data().VH = i3;
            data().gn = i4;
            data().tp = i5;
            data().u7 = i6;
            data().EQ = i7;
            data().we = i8;
            data().J0 = i9;
            data().J8 = i10;
            data().Ws = i11;
        } catch (Throwable th) {
            if (Ws) {
                iy.rN(th, 1431176394442269825L, this, new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Integer(i9), new Integer(i10), new Integer(i11)});
            }
            throw th;
        }
    }

    @ey(method = -2932132762109508264L)
    public boolean gG() {
        try {
            if (J8) {
                iy.gn(-2863596859284172160L, this);
            }
            loadSyntax();
            return (data().modifierFlags & 64) != 0;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -2863596859284172160L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = -7482844715181157552L)
    public ClassType getEnclosingClassType() {
        try {
            if (J8) {
                iy.gn(5876665065889837200L, this);
            }
            if (this.we == null) {
                loadSyntax();
            }
            return this.we;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, 5876665065889837200L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = 1208142381402642624L)
    public FileEntry getFile() {
        try {
            if (J8) {
                iy.gn(2005580222915968632L, this);
            }
            return this.file;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, 2005580222915968632L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = -1354906951002200681L)
    public int getId() {
        try {
            if (J8) {
                iy.gn(-1888056629728817285L, this);
            }
            return this.id;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -1888056629728817285L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = -3307770426474306225L)
    public int getIdentifier() {
        try {
            if (J8) {
                iy.gn(-3325758031173434357L, this);
            }
            loadSyntax();
            return data().P8;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -3325758031173434357L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = 3954077210488232560L)
    public int getModifiers() {
        try {
            if (J8) {
                iy.gn(-313900970792677200L, this);
            }
            loadSyntax();
            return data().modifierFlags;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -313900970792677200L, this);
            }
            throw th;
        }
    }

    @ey(method = -5467513289699491096L)
    public boolean hK() {
        try {
            if (J8) {
                iy.gn(4671408684456210840L, this);
            }
            getEnclosingClassType().e3();
            if (data().lg == null) {
                return false;
            }
            data().lg.DEFAULT_ITERATOR.init();
            while (data().lg.DEFAULT_ITERATOR.hasMoreElements()) {
                if (!((Member) data().lg.DEFAULT_ITERATOR.nextKey()).getEnclosingClassType().isInterfaceType()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, 4671408684456210840L, this);
            }
            throw th;
        }
    }

    @ey(method = 2896579286778602801L)
    public int hz(Type type) {
        try {
            if (J8) {
                iy.tp(-1129720687451790459L, this, type);
            }
            loadSyntax();
            if (((type.isClassType() ? ((ClassType) type).getContainingTypeOfMember(this) : ((ParameterizedType) type).getClassType().getContainingTypeOfMember(this)).et() || type.et()) && !gG()) {
                return 0;
            }
            return Eq();
        } catch (Throwable th) {
            if (Ws) {
                iy.j3(th, -1129720687451790459L, this, type);
            }
            throw th;
        }
    }

    @ey(method = -1264927910740524952L)
    public boolean iW() {
        try {
            if (J8) {
                iy.gn(-1367092083276049928L, this);
            }
            loadSyntax();
            return (data().ei & 8) != 0;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -1367092083276049928L, this);
            }
            throw th;
        }
    }

    @ey(method = -734274417701574685L)
    public void invalidate() {
        try {
            if (J8) {
                iy.gn(3579545978184859431L, this);
            }
            this.we = null;
            this.data = null;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, 3579545978184859431L, this);
            }
            throw th;
        }
    }

    @ey(method = -694764711209245600L)
    public boolean isAbstract() {
        try {
            if (J8) {
                iy.gn(3583849629351912216L, this);
            }
            return (getModifiers() & 16384) != 0;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, 3583849629351912216L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = 2998802709970541295L)
    public int j3() {
        try {
            if (J8) {
                iy.gn(-1062836393138785125L, this);
            }
            this.entitySpace.Cz(getFile(), getLanguage());
            return data().EQ;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -1062836393138785125L, this);
            }
            throw th;
        }
    }

    @ey(method = -106899186662261895L)
    public int jJ() {
        try {
            if (J8) {
                iy.gn(-1202529403416099691L, this);
            }
            AE();
            if (data().sh == null) {
                return 0;
            }
            return data().sh.EQ();
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -1202529403416099691L, this);
            }
            throw th;
        }
    }

    @ey(method = -5874553301643091949L)
    public SetOf<Member> jO() {
        try {
            if (J8) {
                iy.gn(-2676017501984780185L, this);
            }
            getEnclosingClassType().e3();
            return data().lg == null ? new SetOf<>(this.entitySpace) : data().lg;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -2676017501984780185L, this);
            }
            throw th;
        }
    }

    @ey(method = -1000718381539385912L)
    public Type jw(Type type) {
        try {
            if (J8) {
                iy.tp(-526731077727355200L, this, type);
            }
            Type typeWB = WB();
            Type containingTypeOfMember = type.isClassType() ? ((ClassType) type).getContainingTypeOfMember(this) : ((ParameterizedType) type).getClassType().getContainingTypeOfMember(this);
            if (typeWB.isParameterType() && containingTypeOfMember.isParameterizedType() && type.isParameterizedType()) {
                Type typeMb = ((ParameterizedType) containingTypeOfMember).mb(typeWB, true);
                if (typeMb.isParameterType() && ((ParameterType) typeMb).WB() == ((ParameterizedType) type).getClassType() && ((ParameterizedType) type).getAbsoluteArgumentVariances()[((ParameterType) typeMb).ko()] == 3) {
                    return typeWB.x9();
                }
            }
            return type.isClassType() ? ((type.et() || containingTypeOfMember.et()) && !gG()) ? typeWB.x9() : containingTypeOfMember.isParameterizedType() ? ((ParameterizedType) containingTypeOfMember).replaceType(typeWB) : typeWB : ((type.et() || containingTypeOfMember.et()) && !gG()) ? ((ParameterizedType) type).replaceType(typeWB.x9()) : !containingTypeOfMember.isParameterizedType() ? ((ParameterizedType) type).replaceType(typeWB) : ((ParameterizedType) type).replaceType(((ParameterizedType) containingTypeOfMember).replaceType(typeWB));
        } catch (Throwable th) {
            if (Ws) {
                iy.j3(th, -526731077727355200L, this, type);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7  */
    @abcd.ey(method = 1330820768593863807L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.aide.codemodel.api.Type k2(com.aide.codemodel.api.FileEntry r27, com.aide.codemodel.api.abstraction.Language r28, int r29, com.aide.codemodel.api.Type r30, com.aide.codemodel.api.Type[] r31, int r32, int r33, com.aide.codemodel.api.Type[] r34, int r35, int r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.api.Member.k2(com.aide.codemodel.api.FileEntry, com.aide.codemodel.api.abstraction.Language, int, com.aide.codemodel.api.Type, com.aide.codemodel.api.Type[], int, int, com.aide.codemodel.api.Type[], int, int):com.aide.codemodel.api.Type");
    }

    @ey(method = 5329078237261942060L)
    public Type kQ(int i, Type type) {
        try {
            if (J8) {
                iy.EQ(-2995779828057234444L, this, new Integer(i), type);
            }
            Type typeXX = XX(i);
            if (type.isClassType()) {
                Type containingTypeOfMember = ((ClassType) type).getContainingTypeOfMember(this);
                return ((type.et() || containingTypeOfMember.et()) && !gG()) ? typeXX.x9() : containingTypeOfMember.isParameterizedType() ? ((ParameterizedType) containingTypeOfMember).replaceType(typeXX) : typeXX;
            }
            Type containingTypeOfMember2 = ((ParameterizedType) type).getClassType().getContainingTypeOfMember(this);
            return ((type.et() || containingTypeOfMember2.et()) && !gG()) ? ((ParameterizedType) type).replaceType(typeXX.x9()) : !containingTypeOfMember2.isParameterizedType() ? ((ParameterizedType) type).replaceType(typeXX) : ((ParameterizedType) type).replaceType(((ParameterizedType) containingTypeOfMember2).replaceType(typeXX));
        } catch (Throwable th) {
            if (Ws) {
                iy.Mr(th, -2995779828057234444L, this, new Integer(i), type);
            }
            throw th;
        }
    }

    @ey(method = 4951379070392886768L)
    public boolean kf() {
        try {
            if (J8) {
                iy.gn(-5695905530656418576L, this);
            }
            loadSyntax();
            if ((data().modifierFlags & 256) != 0) {
                if (!data().vy) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -5695905530656418576L, this);
            }
            throw th;
        }
    }

    @ey(method = -1100095196759420400L)
    public int ko() {
        try {
            if (J8) {
                iy.gn(5143935002213563040L, this);
            }
            this.entitySpace.Cz(getFile(), getLanguage());
            return data().J0;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, 5143935002213563040L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = 3804626712940606572L)
    public void load(StoreInputStream storeInputStream) {
        try {
            if (J8) {
                iy.tp(3111933831701808148L, this, storeInputStream);
            }
            super.load(storeInputStream);
            this.id = storeInputStream.readInt();
            this.file = this.fileSpace.getFileEntry(storeInputStream.readInt());
            this.EQ = storeInputStream.readInt();
            this.we = (ClassType) this.entitySpace.getEntity(storeInputStream.readInt());
            if (storeInputStream.readBoolean()) {
                Data data = new Data(null);
                this.data = data;
                data.gn = storeInputStream.readInt();
                this.data.tp = storeInputStream.readInt();
                this.data.u7 = storeInputStream.readInt();
                this.data.EQ = storeInputStream.readInt();
                this.data.we = storeInputStream.readInt();
                this.data.J0 = storeInputStream.readInt();
                this.data.J8 = storeInputStream.readInt();
                this.data.Ws = storeInputStream.readInt();
                this.data.v5 = storeInputStream.readInt();
                this.data.Zo = storeInputStream.readInt();
                this.data.VH = storeInputStream.readInt();
                this.data.gW = (Type) this.entitySpace.getEntity(storeInputStream.readInt());
                this.data.modifierFlags = storeInputStream.readInt();
                this.data.vy = storeInputStream.readBoolean();
                this.data.FH = storeInputStream.readBoolean();
                this.data.syntaxLoaded = storeInputStream.readBoolean();
                this.data.P8 = storeInputStream.readInt();
                if (storeInputStream.readBoolean()) {
                    this.data.KD = storeInputStream.readUTF();
                }
                this.data.ro = storeInputStream.readBoolean();
                this.data.nw = storeInputStream.readLong();
                this.data.SI = storeInputStream.readBoolean();
                this.data.Hw = storeInputStream.readBoolean();
                this.data.cn = storeInputStream.readBoolean();
                if (storeInputStream.readBoolean()) {
                    this.data.sh = new ListOf<>(this.entitySpace, storeInputStream);
                    this.data.cb = new ListOfInt(storeInputStream);
                }
                this.data.ei = storeInputStream.readInt();
                this.data.QX = storeInputStream.readInt();
                this.data.XL = storeInputStream.readBoolean();
                this.data.aM = storeInputStream.readBoolean();
                if (storeInputStream.readBoolean()) {
                    this.data.Mr = new ListOf<>(this.entitySpace, storeInputStream);
                }
                if (storeInputStream.readBoolean()) {
                    this.data.U2 = new ListOfInt(storeInputStream);
                }
                if (storeInputStream.readBoolean()) {
                    this.data.a8 = new ListOfInt(storeInputStream);
                }
                if (storeInputStream.readBoolean()) {
                    this.data.j3 = new ListOf<>(this.entitySpace, storeInputStream);
                }
                if (storeInputStream.readBoolean()) {
                    this.data.lg = new SetOf<>(this.entitySpace, storeInputStream);
                }
                if (storeInputStream.readBoolean()) {
                    this.data.rN = new MapOfInt<>(this.entitySpace, storeInputStream);
                }
                if (storeInputStream.readBoolean()) {
                    this.data.er = new SetOf<>(this.entitySpace, storeInputStream);
                }
                if (storeInputStream.readBoolean()) {
                    this.data.yS = new ListOf<>(this.entitySpace, storeInputStream);
                }
            }
        } catch (Throwable th) {
            if (Ws) {
                iy.j3(th, 3111933831701808148L, this, storeInputStream);
            }
            throw th;
        }
    }

    @ey(method = 2575654175947815963L)
    public void lp(int i) {
        try {
            if (J8) {
                iy.u7(302006264039925879L, this, i);
            }
            data().j6 = i;
        } catch (Throwable th) {
            if (Ws) {
                iy.j3(th, 302006264039925879L, this, new Integer(i));
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008e, code lost:
    
        if (QO(r26, r27, r29[r0], qp(r0)) != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00db  */
    @abcd.ey(method = -4198597521505833600L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.aide.codemodel.api.Type mb(com.aide.codemodel.api.FileEntry r26, com.aide.codemodel.api.abstraction.Language r27, com.aide.codemodel.api.Type r28, com.aide.codemodel.api.Type[] r29, int r30, int r31, com.aide.codemodel.api.Type[] r32, int r33, int r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.api.Member.mb(com.aide.codemodel.api.FileEntry, com.aide.codemodel.api.abstraction.Language, com.aide.codemodel.api.Type, com.aide.codemodel.api.Type[], int, int, com.aide.codemodel.api.Type[], int, int):com.aide.codemodel.api.Type");
    }

    @ey(method = -572541567257445552L)
    public int oY() {
        try {
            if (J8) {
                iy.gn(2588038774760349328L, this);
            }
            loadSyntax();
            if (data().Mr == null) {
                return 0;
            }
            return data().Mr.EQ();
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, 2588038774760349328L, this);
            }
            throw th;
        }
    }

    @ey(method = -853190537823072468L)
    public boolean oy(FileEntry fileEntry, Language language, Type type, Type[] typeArr, int i, int i2, Type[] typeArr2, int i3, int i4) throws Throwable {
        int i5;
        try {
            if (J8) {
                iy.QX(-2282469673094295916L, this, new Object[]{fileEntry, language, type, typeArr, new Integer(i), new Integer(i2), typeArr2, new Integer(i3), new Integer(i4)});
            }
            i5 = 9;
            try {
                return this.entitySpace.inferAlgorithm.gn(fileEntry, language, this, type, typeArr, i, i2, typeArr2, i3, i4);
            } catch (Throwable th) {
                th = th;
                if (Ws) {
                    Object[] objArr = new Object[i5];
                    objArr[0] = fileEntry;
                    objArr[1] = language;
                    objArr[2] = type;
                    objArr[3] = typeArr;
                    objArr[4] = new Integer(i);
                    objArr[5] = new Integer(i2);
                    objArr[6] = typeArr2;
                    objArr[7] = new Integer(i3);
                    objArr[8] = new Integer(i4);
                    iy.rN(th, -2282469673094295916L, this, objArr);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i5 = 9;
        }
    }

    @ey(method = -1004143863620811419L)
    public boolean pN() {
        try {
            if (J8) {
                iy.gn(-3614131173700435015L, this);
            }
            loadSyntax();
            return (data().ei & 16) != 0;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -3614131173700435015L, this);
            }
            throw th;
        }
    }

    @ey(method = -3037972364518137471L)
    public boolean pO() {
        try {
            if (J8) {
                iy.gn(-5632800406804275003L, this);
            }
            AE();
            return data().cn;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -5632800406804275003L, this);
            }
            throw th;
        }
    }

    @ey(method = 25726513489394648L)
    public boolean q7() {
        try {
            if (J8) {
                iy.gn(-2207241783543614840L, this);
            }
            if (!Jl()) {
                return false;
            }
            if (!data().Hw) {
                data().Hw = true;
                this.entitySpace.sg(this);
            }
            return data().ro;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -2207241783543614840L, this);
            }
            throw th;
        }
    }

    @ey(method = -1032266302486142583L)
    public Type qp(int i) {
        try {
            if (J8) {
                iy.u7(1128604939153816245L, this, i);
            }
            AE();
            if (data().Mr.v5(i) != null) {
                return (Type) data().Mr.v5(i);
            }
            throw new e4();
        } catch (Throwable th) {
            if (Ws) {
                iy.j3(th, 1128604939153816245L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -3034341203999801896L)
    public boolean sE() {
        try {
            if (J8) {
                iy.gn(-2008579072978533208L, this);
            }
            return y1.v5(getModifiers());
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -2008579072978533208L, this);
            }
            throw th;
        }
    }

    @ey(method = 2194156204069088607L)
    public boolean sM() {
        try {
            if (J8) {
                iy.gn(-2147829695271334733L, this);
            }
            loadSyntax();
            return (data().ei & 1) != 0;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -2147829695271334733L, this);
            }
            throw th;
        }
    }

    @ey(method = -463244602320247311L)
    public boolean sg() {
        try {
            if (J8) {
                iy.gn(2581517521371435525L, this);
            }
            AE();
            if (data().sh != null) {
                if (data().sh.EQ() > 0) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, 2581517521371435525L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = 2438514889165343888L)
    public void store(StoreOutputStream storeOutputStream) {
        try {
            if (J8) {
                iy.tp(2889495934643432664L, this, storeOutputStream);
            }
            super.store(storeOutputStream);
            storeOutputStream.writeInt(this.id);
            storeOutputStream.writeInt(this.file.getId());
            storeOutputStream.writeInt(this.EQ);
            storeOutputStream.writeInt(this.entitySpace.getId(this.we));
            boolean z = true;
            storeOutputStream.writeBoolean(this.data != null);
            if (this.data != null) {
                storeOutputStream.writeInt(this.data.gn);
                storeOutputStream.writeInt(this.data.tp);
                storeOutputStream.writeInt(this.data.u7);
                storeOutputStream.writeInt(this.data.EQ);
                storeOutputStream.writeInt(this.data.we);
                storeOutputStream.writeInt(this.data.J0);
                storeOutputStream.writeInt(this.data.J8);
                storeOutputStream.writeInt(this.data.Ws);
                storeOutputStream.writeInt(this.data.v5);
                storeOutputStream.writeInt(this.data.Zo);
                storeOutputStream.writeInt(this.data.VH);
                storeOutputStream.writeInt(this.entitySpace.getId(this.data.gW));
                storeOutputStream.writeInt(this.data.modifierFlags);
                storeOutputStream.writeBoolean(this.data.vy);
                storeOutputStream.writeBoolean(this.data.FH);
                storeOutputStream.writeBoolean(this.data.syntaxLoaded);
                storeOutputStream.writeInt(this.data.P8);
                storeOutputStream.writeBoolean(this.data.KD != null);
                if (this.data.KD != null) {
                    storeOutputStream.writeUTF(this.data.KD);
                }
                storeOutputStream.writeBoolean(this.data.ro);
                storeOutputStream.writeLong(this.data.nw);
                storeOutputStream.writeBoolean(this.data.SI);
                storeOutputStream.writeBoolean(this.data.Hw);
                storeOutputStream.writeBoolean(this.data.cn);
                storeOutputStream.writeBoolean(this.data.sh != null);
                if (this.data.sh != null) {
                    this.data.sh.store(storeOutputStream);
                    this.data.cb.store(storeOutputStream);
                }
                storeOutputStream.writeInt(this.data.ei);
                storeOutputStream.writeInt(this.data.QX);
                storeOutputStream.writeBoolean(this.data.XL);
                storeOutputStream.writeBoolean(this.data.aM);
                storeOutputStream.writeBoolean(this.data.Mr != null);
                if (this.data.Mr != null) {
                    this.data.Mr.store(storeOutputStream);
                }
                storeOutputStream.writeBoolean(this.data.U2 != null);
                if (this.data.U2 != null) {
                    this.data.U2.store(storeOutputStream);
                }
                storeOutputStream.writeBoolean(this.data.a8 != null);
                if (this.data.a8 != null) {
                    this.data.a8.store(storeOutputStream);
                }
                storeOutputStream.writeBoolean(this.data.j3 != null);
                if (this.data.j3 != null) {
                    this.data.j3.store(storeOutputStream);
                }
                storeOutputStream.writeBoolean(this.data.lg != null);
                if (this.data.lg != null) {
                    this.data.lg.store(storeOutputStream);
                }
                storeOutputStream.writeBoolean(this.data.rN != null);
                if (this.data.rN != null) {
                    this.data.rN.store(storeOutputStream);
                }
                storeOutputStream.writeBoolean(this.data.er != null);
                if (this.data.er != null) {
                    this.data.er.store(storeOutputStream);
                }
                if (this.data.yS == null) {
                    z = false;
                }
                storeOutputStream.writeBoolean(z);
                if (this.data.yS != null) {
                    this.data.yS.store(storeOutputStream);
                }
            }
        } catch (Throwable th) {
            if (Ws) {
                iy.j3(th, 2889495934643432664L, this, storeOutputStream);
            }
            throw th;
        }
    }

    @ey(method = -3664691735790167371L)
    public void sy(Type type, int i) {
        try {
            if (J8) {
                iy.EQ(-5611914834697443959L, this, type, new Integer(i));
            }
            data().Mr.u7(i, type);
        } catch (Throwable th) {
            if (Ws) {
                iy.Mr(th, -5611914834697443959L, this, type, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = 381968630399305720L)
    public String u7() {
        try {
            if (J8) {
                iy.gn(-610629850453631736L, this);
            }
            return super.u7();
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -610629850453631736L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = 3883312802023981935L)
    public int v5() {
        try {
            if (J8) {
                iy.gn(-356919364698624525L, this);
            }
            this.entitySpace.Cz(getFile(), getLanguage());
            return data().Ws;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -356919364698624525L, this);
            }
            throw th;
        }
    }

    @ey(method = -1453666990070987695L)
    public void vJ(Member member) {
        try {
            if (J8) {
                iy.tp(-1272945070096241283L, this, member);
            }
            if (member != this) {
                if (data().lg == null) {
                    data().lg = new SetOf<>(this.entitySpace);
                }
                data().lg.put(member);
            }
        } catch (Throwable th) {
            if (Ws) {
                iy.j3(th, -1272945070096241283L, this, member);
            }
            throw th;
        }
    }

    @ey(method = -6205549483128418399L)
    public boolean w9() {
        try {
            if (J8) {
                iy.gn(2759757873497426085L, this);
            }
            if (!Jl()) {
                return false;
            }
            if (!data().Hw) {
                data().Hw = true;
                this.entitySpace.sg(this);
            }
            return data().SI;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, 2759757873497426085L, this);
            }
            throw th;
        }
    }

    @ey(method = -544430165589382400L)
    public int wc(int i) {
        try {
            if (J8) {
                iy.u7(197132939461117760L, this, i);
            }
            AE();
            return data().cb.get(i);
        } catch (Throwable th) {
            if (Ws) {
                iy.j3(th, 197132939461117760L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 4377803040346183808L)
    public void x9(int i, int i2, int i3) {
        try {
            if (J8) {
                iy.we(-4883390612140234320L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            data().U2.gn(i3, i);
            data().a8.gn(i3, i2);
        } catch (Throwable th) {
            if (Ws) {
                iy.U2(th, -4883390612140234320L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @abcd.ey(method = 3849267020488353180L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.aide.codemodel.api.Type yO(com.aide.codemodel.api.FileEntry r27, com.aide.codemodel.api.abstraction.Language r28, int r29, com.aide.codemodel.api.Type r30, com.aide.codemodel.api.Type[] r31, int r32, int r33, com.aide.codemodel.api.Type[] r34, int r35, int r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.api.Member.yO(com.aide.codemodel.api.FileEntry, com.aide.codemodel.api.abstraction.Language, int, com.aide.codemodel.api.Type, com.aide.codemodel.api.Type[], int, int, com.aide.codemodel.api.Type[], int, int):com.aide.codemodel.api.Type");
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = -2343011925502680639L)
    public boolean yS() {
        try {
            if (J8) {
                iy.gn(-2399267059656459915L, this);
            }
            if (getEnclosingClassType().Yi() || cT()) {
                return false;
            }
            if (ro()) {
                return true;
            }
            for (ClassType enclosingClassType = getEnclosingClassType(); !enclosingClassType.isToplevel(); enclosingClassType = enclosingClassType.getEnclosingClassType()) {
                if (enclosingClassType.ro()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -2399267059656459915L, this);
            }
            throw th;
        }
    }

    @ey(method = -2916467344742026096L)
    public String ye() {
        try {
            if (J8) {
                iy.gn(3407421641063829696L, this);
            }
            if (q7()) {
                return data().KD;
            }
            return null;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, 3407421641063829696L, this);
            }
            throw th;
        }
    }

    @ey(method = 1402831623460888788L)
    public boolean ys() {
        try {
            if (J8) {
                iy.gn(-2874395498936769684L, this);
            }
            return (data().modifierFlags & 256) != 0;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -2874395498936769684L, this);
            }
            throw th;
        }
    }

    @ey(method = 134458400440446753L)
    public Type zh(Type type, int i) {
        try {
            if (J8) {
                iy.EQ(696816184945647141L, this, type, new Integer(i));
            }
            if (type == null) {
                type = getEnclosingClassType();
            }
            if (i >= oY()) {
                throw new e4();
            }
            Type typeQp = qp(i);
            if (type.isClassType()) {
                Type containingTypeOfMember = ((ClassType) type).getContainingTypeOfMember(this);
                return ((type.et() || containingTypeOfMember.et()) && !gG()) ? typeQp.x9() : containingTypeOfMember.isParameterizedType() ? ((ParameterizedType) containingTypeOfMember).replaceType(typeQp) : typeQp;
            }
            Type containingTypeOfMember2 = ((ParameterizedType) type).getClassType().getContainingTypeOfMember(this);
            return ((type.et() || containingTypeOfMember2.et()) && !gG()) ? ((ParameterizedType) type).replaceType(typeQp.x9()) : !containingTypeOfMember2.isParameterizedType() ? ((ParameterizedType) type).replaceType(typeQp) : ((ParameterizedType) type).replaceType(((ParameterizedType) containingTypeOfMember2).replaceType(typeQp));
        } catch (Throwable th) {
            if (Ws) {
                iy.Mr(th, 696816184945647141L, this, type, new Integer(i));
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -966715973302692688L)
    public Member(EntitySpace entitySpace, IdentifierSpace identifierSpace, FileSpace fileSpace, FileEntry fileEntry, Language language, int i) {
        super(fileSpace, entitySpace);
        try {
            if (J8) {
                iy.QX(3483344534987785668L, null, new Object[]{entitySpace, identifierSpace, fileSpace, fileEntry, language, new Integer(i)});
            }
            this.entitySpace = entitySpace;
            this.identifierSpace = identifierSpace;
            this.fileSpace = fileSpace;
            this.id = entitySpace.declareEntity(this);
            this.file = fileEntry;
            this.EQ = i;
            j6(language);
        } catch (Throwable th) {
            if (Ws) {
                iy.rN(th, 3483344534987785668L, null, new Object[]{entitySpace, identifierSpace, fileSpace, fileEntry, language, new Integer(i)});
            }
            throw th;
        }
    }
}
