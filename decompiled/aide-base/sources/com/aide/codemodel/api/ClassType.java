package com.aide.codemodel.api;

import abcd.b4;
import abcd.cy;
import abcd.dy;
import abcd.e4;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import abcd.r4;
import abcd.y1;
import com.aide.codemodel.api.abstraction.Language;
import com.aide.codemodel.api.collections.ListOf;
import com.aide.codemodel.api.collections.ListOfInt;
import com.aide.codemodel.api.collections.MapOf;
import com.aide.codemodel.api.collections.MapOfInt;
import com.aide.codemodel.api.collections.SetOf;
import com.aide.codemodel.api.collections.SetOfInt;
import com.aide.codemodel.api.collections.StoreInputStream;
import com.aide.codemodel.api.collections.StoreOutputStream;

@cy(clazz = -3338627136725522824L, container = -3338627136725522824L, user = true)
/* loaded from: classes.dex */
public final class ClassType extends Type {

    @gy
    private static /* synthetic */ boolean BT;

    @fy
    private static /* synthetic */ boolean gW;

    @dy(field = -765892820794594185L)
    private Data data;

    @dy(field = 1109576222143577748L)
    private int declarationNumber;

    @dy(field = -4861399239757904837L)
    private ClassType enclosingClassType;

    @dy(field = -763730407578527325L)
    private FileEntry file;

    @dy(field = -1684859744673511896L)
    private int id;

    @dy(field = 4263414793737678496L)
    private int identifier;

    @dy(field = -4517265455160421992L)
    private boolean isAnonymous;

    @dy(field = -223578293632714640L)
    private boolean isLocal;

    @dy(field = 2325876088593878979L)
    private boolean isModule;

    @dy(field = 2069087381957343528L)
    private Namespace namespace;

    @dy(field = 772090938621332833L)
    private final EntitySpace space;

    @dy(field = 1261548153936978420L)
    private boolean syntaxLoaded;

    @dy(field = -6188538189580512948L)
    private ClassType topLevelClassType;

    @dy(field = -1491810220622799467L)
    private final FileSpace tp;

    @dy(field = 7449520648995332435L)
    private int typeParameterCount;

    @dy(field = 490525003494955275L)
    private final IdentifierSpace we;

    @dy(field = -1011912486429977856L)
    private long yS;

    @cy(clazz = -472964529333721116L, container = -472964529333721116L, user = true)
    private static class Data {

        @fy
        private static /* synthetic */ boolean kQ;

        @gy
        private static /* synthetic */ boolean yO;

        /* renamed from: I_未知, reason: contains not printable characters */
        @dy(field = 2324586377567655269L)
        public MapOfInt<Member> f0I_;

        @dy(field = -823241812622893048L)
        public MapOfInt<Type> OW;

        @dy(field = -542881316556457441L)
        public ListOfInt Qq;

        @dy(field = 5244995057329078008L)
        public MapOfInt<ClassType> XX;

        @dy(field = 1024035533939089672L)
        public int absoluteTypeParameterCount;

        @dy(field = -4616831853843955340L)
        public ListOf<ParameterType> absoluteTypeParameters;

        @dy(field = -1033812996706868392L)
        public MapOfInt<Member> aj;

        @dy(field = -592819818971640325L)
        public MapOfInt<Member> allExplicitMemberMethods;

        @dy(field = 3625968151286409465L)
        public MapOfInt<ClassType> allMemberClasstypes;

        @dy(field = -607625956143049059L)
        public MapOfInt<Member> allMemberFields;

        @dy(field = 5461458952126946828L)
        public MapOfInt<Member> allMemberMethods;

        @dy(field = 103944217044060192L)
        public MapOfInt<Member> allMemberOperators;

        @dy(field = 325559559141163917L)
        public MapOfInt<Type> allMemberTypes;

        @dy(field = -5978572149125126040L)
        public SetOf<ClassType> allSuperClasstypes;

        @dy(field = 1109871676452439116L)
        public SetOf<Type> allSuperTypes;

        @dy(field = 1398377588944645827L)
        public MapOfInt<ClassType> br;

        @dy(field = -326401938660475824L)
        public MapOf<Member, Type> containingTypesOfMembers;

        @dy(field = 584717502698315315L)
        public boolean corruptedSupertypes;

        @dy(field = 4178074703892707800L)
        public boolean cycliclyDefined;

        @dy(field = -3786664687327347896L)
        public Type delegateOrEnumtype;

        /* renamed from: dx_未知, reason: contains not printable characters */
        @dy(field = -1963103071260302217L)
        public SetOf<Member> f1dx_;

        @dy(field = 1692463056341607648L)
        public int endColumn;

        @dy(field = -2023971181588234288L)
        public int endLine;

        @dy(field = -4461283442805602452L)
        public boolean hasDocumentation;

        @dy(field = -663436012706443839L)
        public boolean hasSupertypes;

        @dy(field = -2142337238397889911L)
        public int idEndColumn;

        @dy(field = 1176611036433599644L)
        public int idLine;

        @dy(field = 3612311166042398152L)
        public int idStartColumn;

        @dy(field = -4855812271023593547L)
        public boolean inStaticMethod;

        @dy(field = -4118984496582152625L)
        public ListOf<Member> inheritedMethodPairs;

        @dy(field = -1251528744982055571L)
        public MapOfInt<Member> lp;

        @dy(field = 2611619164328276104L)
        public MapOfInt<ClassType> memberClasstypes;

        @dy(field = 4667802711258770412L)
        public SetOf<Member> memberConstructors;

        @dy(field = 4339122678866979664L)
        public MapOfInt<Member> memberFields;

        @dy(field = -3938575805985030179L)
        public MapOfInt<Member> memberMethods;

        @dy(field = 4889109148424506880L)
        public MapOfInt<Member> memberOperators;

        @dy(field = 2927042640972243697L)
        public MapOfInt<ParameterType> memberParametertypes;

        @dy(field = 3844094752147020224L)
        public int modifierSendColumn;

        @dy(field = -2411784594523405300L)
        public int modifierSendLine;

        @dy(field = -2834772951269005353L)
        public int modifiers;

        @dy(field = -5492032383422817405L)
        public int modifiersStartColumn;

        @dy(field = 343625141528856615L)
        public int modifiersStartLine;

        @dy(field = 3083447488818657357L)
        public int startColumn;

        @dy(field = -170528713549062635L)
        public int startLine;

        @dy(field = -2014767447214453841L)
        public ListOf<ClassType> superClasstypes;

        @dy(field = 7519384662420257792L)
        public boolean superClasstypesLoaded;

        @dy(field = -1588226822900250687L)
        public boolean superClasstypesLoading;

        @dy(field = 752587826691816775L)
        public ListOf<Type> superTypes;

        @dy(field = -5503748678590735596L)
        public boolean superTypesLoaded;

        @dy(field = 2859717273636627425L)
        public boolean superTypesLoading;

        @dy(field = -2502155401099269447L)
        public ListOfInt sy;

        @dy(field = -1755009464642196527L)
        public boolean syntaxLoaded;

        @dy(field = -3507598135284108861L)
        public ListOf<ParameterType> typeParameters;

        @dy(field = -758492086642409835L)
        public boolean typesLoaded;

        /* renamed from: x9_未知, reason: contains not printable characters */
        @dy(field = -561026060531824200L)
        public ListOf<Type> f2x9_;

        static {
            iy.Zo(Data.class);
        }

        @ey(method = -2583592096041520876L)
        private Data() {
            try {
                if (kQ) {
                    iy.gn(841160782149018112L, null);
                }
            } catch (Throwable th) {
                if (yO) {
                    iy.aM(th, 841160782149018112L, null);
                }
                throw th;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = -7637216182673561863L)
        public /* synthetic */ Data(a aVar) {
            this();
            try {
                if (kQ) {
                    iy.tp(4655379214727750085L, null, aVar);
                }
            } catch (Throwable th) {
                if (yO) {
                    iy.j3(th, 4655379214727750085L, null, aVar);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(ClassType.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 547978371659063781L)
    public ClassType(EntitySpace entitySpace, FileSpace fileSpace, IdentifierSpace identifierSpace) {
        super(fileSpace, entitySpace);
        try {
            if (gW) {
                iy.we(1692538651150946431L, null, entitySpace, fileSpace, identifierSpace);
            }
            this.tp = fileSpace;
            this.space = entitySpace;
            this.we = identifierSpace;
        } catch (Throwable th) {
            if (BT) {
                iy.U2(th, 1692538651150946431L, null, entitySpace, fileSpace, identifierSpace);
            }
            throw th;
        }
    }

    @ey(method = 3508304842808532L)
    private boolean AR(Member member, Member member2) {
        try {
            if (gW) {
                iy.EQ(21113912411943600L, this, member, member2);
            }
            return !ct(member, member2);
        } catch (Throwable th) {
            if (BT) {
                iy.Mr(th, 21113912411943600L, this, member, member2);
            }
            throw th;
        }
    }

    @ey(method = 4025948418513882575L)
    private boolean TI(Type type, Member member, Member member2) {
        try {
            if (gW) {
                iy.we(-2275850001030645595L, this, type, member, member2);
            }
            try {
                if (member.oY() != member2.oY()) {
                    return false;
                }
                if (!getLanguage().getTypeSystem().FH()) {
                    int iMin = Math.min(member.hz(type), member2.hz(type));
                    for (int i = 0; i < iMin; i++) {
                        MethodParameterType methodParameterTypeXa = member.Xa(i);
                        MethodParameterType methodParameterTypeXa2 = member2.Xa(i);
                        int iYe = methodParameterTypeXa.ye();
                        if (iYe != methodParameterTypeXa2.ye()) {
                            return false;
                        }
                        for (int i2 = 0; i2 < iYe; i2++) {
                            if (!methodParameterTypeXa.Ev(type, i2).kQ(methodParameterTypeXa2.Ev(type, i2), member, member2)) {
                                return false;
                            }
                        }
                    }
                }
                int iOY = member.oY();
                for (int i3 = 0; i3 < iOY; i3++) {
                    if (member.FN(i3) != member2.FN(i3)) {
                        return false;
                    }
                    Type typeZh = member.zh(type, i3);
                    Type typeZh2 = member2.zh(type, i3);
                    if (!typeZh.kQ(typeZh2, member, member2) && ((typeZh.isParameterizedType() && typeZh2.isParameterizedType()) || (!typeZh.x9().XX(typeZh2.x9()) && !typeZh2.x9().XX(typeZh.x9())))) {
                        return false;
                    }
                }
                return true;
            } catch (e4 unused) {
                return false;
            }
        } catch (Throwable th) {
            if (BT) {
                iy.U2(th, -2275850001030645595L, this, type, member, member2);
            }
            throw th;
        }
    }

    @ey(method = 4353992732863612755L)
    private void b() {
        SetOf<ClassType> allPartialClasstypes;
        MapOfInt<Type> mapOfIntSE;
        SetOf<ClassType> allPartialClasstypes2;
        SetOf<ClassType> allPartialClasstypes3;
        try {
            if (gW) {
                iy.gn(394436195075032293L, this);
            }
            if (getData().allMemberTypes == null) {
                getData().allMemberTypes = new MapOfInt<>(this.space);
            } else {
                getData().allMemberTypes.Hw();
            }
            getData().memberClasstypes.DEFAULT_ITERATOR.DW();
            while (getData().memberClasstypes.DEFAULT_ITERATOR.hasMoreElements()) {
                getData().allMemberTypes.we(getData().memberClasstypes.DEFAULT_ITERATOR.Hw(), ((ClassType) getData().memberClasstypes.DEFAULT_ITERATOR.nextValue()).u9());
            }
            if (Yi() && (allPartialClasstypes3 = getAllPartialClasstypes()) != null) {
                allPartialClasstypes3.DEFAULT_ITERATOR.init();
                while (allPartialClasstypes3.DEFAULT_ITERATOR.hasMoreElements()) {
                    ClassType classType = (ClassType) allPartialClasstypes3.DEFAULT_ITERATOR.nextKey();
                    if (classType != this) {
                        classType.d8();
                        ListOf<Type> listOf = classType.getData().superTypes;
                        if (listOf != null && listOf.EQ() > 0) {
                            try {
                                if (!((Type) listOf.v5(0)).isInterfaceType() && getData().superTypes.EQ() > 0 && !((Type) getData().superTypes.v5(0)).isInterfaceType() && getData().superTypes.v5(0) == this.space.getRootClasstype(getFile(), getLanguage())) {
                                    getData().superTypes.u7(0, listOf.v5(0));
                                }
                            } catch (e4 unused) {
                            }
                            for (int i = 0; i < listOf.EQ(); i++) {
                                if (!getData().superClasstypes.Hw(listOf.v5(i))) {
                                    getData().superTypes.j6(listOf.v5(i));
                                }
                            }
                        }
                    }
                }
            }
            if (getData().allSuperTypes == null) {
                getData().allSuperTypes = new SetOf<>(this.space);
            }
            for (int i2 = 0; i2 < getData().superTypes.EQ(); i2++) {
                Type type = (Type) getData().superTypes.v5(i2);
                if (type.isParameterizedType()) {
                    SetOf<Type> allSuperTypes = ((ParameterizedType) type).getClassType().getAllSuperTypes();
                    allSuperTypes.DEFAULT_ITERATOR.init();
                    while (allSuperTypes.DEFAULT_ITERATOR.hasMoreElements()) {
                        try {
                            getData().allSuperTypes.put(((ParameterizedType) type).replaceType((Type) allSuperTypes.DEFAULT_ITERATOR.nextKey()));
                        } catch (e4 unused2) {
                        }
                    }
                } else if (((ClassType) type).et()) {
                    getData().allSuperTypes.u7(((ClassType) type).fN());
                } else {
                    getData().allSuperTypes.u7(((ClassType) type).getAllSuperTypes());
                }
            }
            getData().allSuperTypes.put(u9());
            if (Yi() && (allPartialClasstypes2 = getAllPartialClasstypes()) != null) {
                allPartialClasstypes2.DEFAULT_ITERATOR.init();
                while (allPartialClasstypes2.DEFAULT_ITERATOR.hasMoreElements()) {
                    ClassType classType2 = (ClassType) allPartialClasstypes2.DEFAULT_ITERATOR.nextKey();
                    if (classType2 != this) {
                        getData().allSuperTypes.put(classType2.u9());
                    }
                }
            }
            getData().allMemberTypes.Hw();
            for (int i3 = 0; i3 < getData().superTypes.EQ(); i3++) {
                Type type2 = (Type) getData().superTypes.v5(i3);
                ClassType classType3 = type2.isParameterizedType() ? ((ParameterizedType) type2).getClassType() : (ClassType) type2;
                MapOfInt<Type> mapOfIntSE2 = classType3.sE();
                mapOfIntSE2.DEFAULT_ITERATOR.DW();
                while (mapOfIntSE2.DEFAULT_ITERATOR.hasMoreElements()) {
                    int iHw = mapOfIntSE2.DEFAULT_ITERATOR.Hw();
                    Type type3 = (Type) mapOfIntSE2.DEFAULT_ITERATOR.nextValue();
                    ClassType classType4 = type3.isParameterizedType() ? ((ParameterizedType) type3).getClassType() : (ClassType) type3;
                    if (!y1.gn(classType3.getModifiers())) {
                        if (type2.isParameterizedType()) {
                            try {
                                getData().allMemberTypes.insert(iHw, ((ParameterizedType) type2).replaceType(type3));
                            } catch (e4 unused3) {
                            }
                        } else if (type3.et()) {
                            getData().allMemberTypes.insert(iHw, type3);
                        } else {
                            getData().allMemberTypes.insert(iHw, classType4);
                        }
                    }
                }
            }
            if (Yi() && (allPartialClasstypes = getAllPartialClasstypes()) != null) {
                allPartialClasstypes.DEFAULT_ITERATOR.init();
                while (allPartialClasstypes.DEFAULT_ITERATOR.hasMoreElements()) {
                    ClassType classType5 = (ClassType) allPartialClasstypes.DEFAULT_ITERATOR.nextKey();
                    if (classType5 != this && (mapOfIntSE = classType5.sE()) != null) {
                        mapOfIntSE.DEFAULT_ITERATOR.DW();
                        while (mapOfIntSE.DEFAULT_ITERATOR.hasMoreElements()) {
                            getData().allMemberTypes.we(mapOfIntSE.DEFAULT_ITERATOR.Hw(), (Type) mapOfIntSE.DEFAULT_ITERATOR.nextValue());
                        }
                    }
                }
            }
            getData().memberClasstypes.DEFAULT_ITERATOR.DW();
            while (getData().memberClasstypes.DEFAULT_ITERATOR.hasMoreElements()) {
                getData().allMemberTypes.we(getData().memberClasstypes.DEFAULT_ITERATOR.Hw(), ((ClassType) getData().memberClasstypes.DEFAULT_ITERATOR.nextValue()).u9());
            }
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 394436195075032293L, this);
            }
            throw th;
        }
    }

    @ey(method = 468257273244068451L)
    private boolean b1(Member member, Member member2) {
        try {
            if (gW) {
                iy.EQ(-619109217623274491L, this, member, member2);
            }
            return !ct(member, member2);
        } catch (Throwable th) {
            if (BT) {
                iy.Mr(th, -619109217623274491L, this, member, member2);
            }
            throw th;
        }
    }

    @ey(method = 5921443155418273635L)
    private boolean ct(Member member, Member member2) {
        try {
            if (gW) {
                iy.EQ(1205119367871156549L, this, member, member2);
            }
            if (member2.getEnclosingClassType().isInterfaceType()) {
                return (member.getEnclosingClassType().isInterfaceType() && y1.u7(member.getModifiers())) ? false : true;
            }
            if (y1.u7(member.getModifiers())) {
                return false;
            }
            return (y1.j6(member2.getModifiers()) || y1.EQ(member2.getModifiers()) || y1.j3(member2.getModifiers())) && (y1.j6(member.getModifiers()) || y1.EQ(member.getModifiers()));
        } catch (Throwable th) {
            if (BT) {
                iy.Mr(th, 1205119367871156549L, this, member, member2);
            }
            throw th;
        }
    }

    @ey(method = 5456649018904690700L)
    private void d8() {
        int i;
        boolean z;
        try {
            if (gW) {
                iy.gn(1389385947469639944L, this);
            }
            wE();
            if (getData().superTypesLoaded) {
                return;
            }
            getData().allSuperClasstypes.DEFAULT_ITERATOR.init();
            while (true) {
                if (getData().allSuperClasstypes.DEFAULT_ITERATOR.hasMoreElements()) {
                    if (((ClassType) getData().allSuperClasstypes.DEFAULT_ITERATOR.nextKey()).getAbsoluteParametertypeCount() > 0) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (z && getData().hasSupertypes) {
                getData().superTypesLoading = true;
                this.space.oy(this);
                getData().superTypesLoading = false;
                getData().superTypesLoaded = true;
            } else {
                getData().superTypesLoaded = true;
                for (i = 0; i < getData().superClasstypes.EQ(); i++) {
                    getData().superTypes.u7(i, getData().superClasstypes.v5(i));
                }
            }
            b();
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 1389385947469639944L, this);
            }
            throw th;
        }
    }

    @ey(method = -2403717886956055921L)
    private void eN() {
        try {
            if (gW) {
                iy.gn(-2115062534478780767L, this);
            }
            loadSyntax();
            if (getData().typesLoaded) {
                return;
            }
            getData().typesLoaded = true;
            d8();
            zf();
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -2115062534478780767L, this);
            }
            throw th;
        }
    }

    @ey(method = 30233227119543475L)
    private void fP() {
        SetOf<ClassType> allPartialClasstypes;
        MapOfInt<ClassType> mapOfIntIW;
        SetOf<ClassType> allPartialClasstypes2;
        SetOf<ClassType> allPartialClasstypes3;
        try {
            if (gW) {
                iy.gn(3816307682180803213L, this);
            }
            if (getData().allSuperClasstypes == null) {
                getData().allSuperClasstypes = new SetOf<>(this.space);
            }
            if (getData().allMemberClasstypes == null) {
                getData().allMemberClasstypes = new MapOfInt<>(this.space);
            }
            getData().allMemberClasstypes.Hw();
            getData().memberClasstypes.DEFAULT_ITERATOR.DW();
            while (getData().memberClasstypes.DEFAULT_ITERATOR.hasMoreElements()) {
                getData().allMemberClasstypes.we(getData().memberClasstypes.DEFAULT_ITERATOR.Hw(), (ClassType) getData().memberClasstypes.DEFAULT_ITERATOR.nextValue());
            }
            if (Yi() && (allPartialClasstypes3 = getAllPartialClasstypes()) != null) {
                allPartialClasstypes3.DEFAULT_ITERATOR.init();
                while (allPartialClasstypes3.DEFAULT_ITERATOR.hasMoreElements()) {
                    ClassType classType = (ClassType) allPartialClasstypes3.DEFAULT_ITERATOR.nextKey();
                    if (classType != this) {
                        classType.wE();
                        ListOf<ClassType> listOf = classType.getData().superClasstypes;
                        if (listOf != null && listOf.EQ() > 0) {
                            try {
                                if (!((ClassType) listOf.v5(0)).isInterfaceType() && getData().superClasstypes.EQ() > 0 && getData().superClasstypes.v5(0) == this.space.getRootClasstype(getFile(), getLanguage())) {
                                    getData().superClasstypes.u7(0, listOf.v5(0));
                                }
                            } catch (e4 unused) {
                            }
                            for (int i = 0; i < listOf.EQ(); i++) {
                                if (!getData().superClasstypes.Hw(listOf.v5(i))) {
                                    getData().superClasstypes.j6(listOf.v5(i));
                                }
                            }
                        }
                    }
                }
            }
            for (int i2 = 0; i2 < getData().superClasstypes.EQ(); i2++) {
                getData().allSuperClasstypes.u7(((ClassType) getData().superClasstypes.v5(i2)).fN());
            }
            getData().allSuperClasstypes.put(this);
            if (Yi() && (allPartialClasstypes2 = getAllPartialClasstypes()) != null) {
                allPartialClasstypes2.DEFAULT_ITERATOR.init();
                while (allPartialClasstypes2.DEFAULT_ITERATOR.hasMoreElements()) {
                    ClassType classType2 = (ClassType) allPartialClasstypes2.DEFAULT_ITERATOR.nextKey();
                    if (classType2 != this) {
                        getData().allSuperClasstypes.put(classType2);
                    }
                }
            }
            getData().allMemberClasstypes.Hw();
            for (int i3 = 0; i3 < getData().superClasstypes.EQ(); i3++) {
                MapOfInt<ClassType> mapOfIntIW2 = ((ClassType) getData().superClasstypes.v5(i3)).iW();
                mapOfIntIW2.DEFAULT_ITERATOR.DW();
                while (mapOfIntIW2.DEFAULT_ITERATOR.hasMoreElements()) {
                    int iHw = mapOfIntIW2.DEFAULT_ITERATOR.Hw();
                    ClassType classType3 = (ClassType) mapOfIntIW2.DEFAULT_ITERATOR.nextValue();
                    if (!y1.gn(classType3.getModifiers())) {
                        getData().allMemberClasstypes.insert(iHw, classType3);
                    }
                }
            }
            if (Yi() && (allPartialClasstypes = getAllPartialClasstypes()) != null) {
                allPartialClasstypes.DEFAULT_ITERATOR.init();
                while (allPartialClasstypes.DEFAULT_ITERATOR.hasMoreElements()) {
                    ClassType classType4 = (ClassType) allPartialClasstypes.DEFAULT_ITERATOR.nextKey();
                    if (classType4 != this && (mapOfIntIW = classType4.iW()) != null) {
                        mapOfIntIW.DEFAULT_ITERATOR.DW();
                        while (mapOfIntIW.DEFAULT_ITERATOR.hasMoreElements()) {
                            getData().allMemberClasstypes.we(mapOfIntIW.DEFAULT_ITERATOR.Hw(), (ClassType) mapOfIntIW.DEFAULT_ITERATOR.nextValue());
                        }
                    }
                }
            }
            getData().memberClasstypes.DEFAULT_ITERATOR.DW();
            while (getData().memberClasstypes.DEFAULT_ITERATOR.hasMoreElements()) {
                getData().allMemberClasstypes.we(getData().memberClasstypes.DEFAULT_ITERATOR.Hw(), (ClassType) getData().memberClasstypes.DEFAULT_ITERATOR.nextValue());
            }
            getData().allSuperClasstypes.DEFAULT_ITERATOR.init();
            while (getData().allSuperClasstypes.DEFAULT_ITERATOR.hasMoreElements()) {
                this.space.j3(this.file, getData().allSuperClasstypes.DEFAULT_ITERATOR.nextKey());
            }
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 3816307682180803213L, this);
            }
            throw th;
        }
    }

    @ey(method = -468432199219948544L)
    private Data getData() {
        try {
            if (gW) {
                iy.gn(-1160635640737944776L, this);
            }
            this.yS = r4.FH();
            if (this.data != null) {
                return this.data;
            }
            Data data = new Data(null);
            this.data = data;
            data.inheritedMethodPairs = new ListOf<>(this.space);
            this.data.superClasstypes = new ListOf<>(this.space);
            this.data.superTypes = new ListOf<>(this.space);
            this.data.absoluteTypeParameters = new ListOf<>(this.space);
            this.data.typeParameters = new ListOf<>(this.space);
            this.data.memberParametertypes = new MapOfInt<>(this.space);
            this.data.memberFields = new MapOfInt<>(this.space);
            this.data.memberOperators = new MapOfInt<>(this.space);
            this.data.memberClasstypes = new MapOfInt<>(this.space);
            this.data.memberConstructors = new SetOf<>(this.space);
            this.data.memberMethods = new MapOfInt<>(this.space);
            this.data.containingTypesOfMembers = new MapOf<>(this.space);
            this.data.f0I_ = new MapOfInt<>(this.space);
            this.data.allMemberFields = new MapOfInt<>(this.space);
            this.data.f1dx_ = new SetOf<>(this.space);
            this.data.allMemberMethods = new MapOfInt<>(this.space);
            this.data.allExplicitMemberMethods = new MapOfInt<>(this.space);
            this.data.allMemberOperators = new MapOfInt<>(this.space);
            return this.data;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -1160635640737944776L, this);
            }
            throw th;
        }
    }

    @ey(method = 3155691081715755925L)
    private void loadSyntax() {
        try {
            if (gW) {
                iy.gn(-4146922073115976649L, this);
            }
            if (getData().syntaxLoaded) {
                return;
            }
            getData().syntaxLoaded = true;
            this.space.loadSyntax(getFile(), getLanguage());
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -4146922073115976649L, this);
            }
            throw th;
        }
    }

    @ey(method = 5919170518599242904L)
    private void om() {
        try {
            if (gW) {
                iy.gn(1835321357885092320L, this);
            }
            if (this.declarationNumber == 0) {
                this.space.loadNamespaces();
            } else {
                if (this.syntaxLoaded) {
                    return;
                }
                this.syntaxLoaded = true;
                loadSyntax();
            }
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 1835321357885092320L, this);
            }
            throw th;
        }
    }

    @ey(method = -1846642801975125120L)
    private void wE() {
        try {
            if (gW) {
                iy.gn(2076560245973597040L, this);
            }
            loadSyntax();
            if (getData().superClasstypesLoaded) {
                return;
            }
            if (!getData().hasSupertypes) {
                this.space.loadSuperClasstypes(getFile(), getLanguage(), this);
                return;
            }
            getData().superClasstypesLoading = true;
            this.space.pN(this);
            getData().superClasstypesLoading = false;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 2076560245973597040L, this);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x02cf A[Catch: all -> 0x0986, TryCatch #2 {all -> 0x0986, blocks: (B:3:0x0005, B:5:0x0009, B:6:0x000c, B:7:0x0024, B:9:0x0032, B:11:0x0056, B:13:0x0062, B:15:0x0074, B:17:0x007d, B:18:0x0086, B:20:0x008e, B:21:0x00a4, B:16:0x007b, B:22:0x00a7, B:23:0x00bb, B:25:0x00c9, B:27:0x00ed, B:31:0x0106, B:33:0x010c, B:35:0x011a, B:43:0x0144, B:36:0x0124, B:38:0x012a, B:41:0x0139, B:30:0x00fc, B:44:0x014f, B:46:0x0155, B:48:0x015b, B:49:0x0160, B:51:0x0168, B:53:0x0172, B:54:0x0182, B:56:0x018a, B:58:0x019e, B:60:0x01a8, B:63:0x01b7, B:64:0x01c0, B:66:0x01c6, B:68:0x01d1, B:70:0x01dd, B:72:0x01ef, B:74:0x01fa, B:77:0x0201, B:80:0x020f, B:82:0x0221, B:84:0x022a, B:190:0x0492, B:83:0x0228, B:87:0x0236, B:88:0x0239, B:89:0x0242, B:91:0x024a, B:93:0x0262, B:95:0x026c, B:97:0x0272, B:110:0x02b4, B:98:0x027c, B:100:0x0282, B:102:0x0288, B:103:0x028e, B:105:0x0294, B:107:0x029e, B:109:0x02ab, B:111:0x02be, B:112:0x02c7, B:114:0x02cf, B:116:0x02e7, B:118:0x02f1, B:120:0x02f7, B:133:0x0339, B:134:0x0344, B:136:0x0352, B:139:0x0367, B:141:0x036d, B:143:0x0373, B:145:0x037d, B:147:0x038d, B:148:0x0392, B:149:0x0395, B:151:0x03a3, B:153:0x03ad, B:156:0x03b9, B:158:0x03c5, B:159:0x03d0, B:161:0x03de, B:163:0x03f2, B:165:0x03fc, B:167:0x0402, B:168:0x0407, B:171:0x040f, B:173:0x041b, B:174:0x0426, B:176:0x0434, B:179:0x0446, B:181:0x0450, B:183:0x045c, B:184:0x0467, B:186:0x0475, B:189:0x0487, B:121:0x0301, B:123:0x0307, B:125:0x030d, B:126:0x0313, B:128:0x0319, B:130:0x0323, B:132:0x0330, B:73:0x01f7, B:191:0x0496, B:192:0x04aa, B:194:0x04b8, B:196:0x04d1, B:197:0x04db, B:199:0x04e1, B:201:0x04e7, B:202:0x04ec, B:204:0x04f4, B:206:0x04fe, B:207:0x050e, B:209:0x0516, B:211:0x0524, B:212:0x052f, B:214:0x053d, B:217:0x0552, B:219:0x0561, B:220:0x056b, B:221:0x057f, B:223:0x058d, B:225:0x05ad, B:227:0x05bb, B:235:0x05ee, B:228:0x05c5, B:230:0x05cb, B:232:0x05d9, B:233:0x05e3, B:236:0x05f8, B:238:0x05fe, B:240:0x0604, B:241:0x0609, B:243:0x0611, B:245:0x061b, B:246:0x062b, B:248:0x0633, B:250:0x0647, B:251:0x0650, B:253:0x0656, B:255:0x0661, B:257:0x066d, B:259:0x067f, B:261:0x068a, B:264:0x0691, B:267:0x069f, B:269:0x06b1, B:271:0x06ba, B:270:0x06b8, B:274:0x06c6, B:275:0x06c9, B:276:0x06d2, B:278:0x06da, B:279:0x06e8, B:281:0x06ee, B:283:0x06fc, B:285:0x0710, B:287:0x071a, B:289:0x0724, B:291:0x072a, B:304:0x076c, B:292:0x0734, B:294:0x073a, B:296:0x0740, B:297:0x0746, B:299:0x074c, B:301:0x0756, B:303:0x0763, B:306:0x0777, B:307:0x0780, B:309:0x0788, B:310:0x0796, B:312:0x079c, B:314:0x07aa, B:316:0x07be, B:318:0x07c8, B:320:0x07d2, B:322:0x07d8, B:335:0x081a, B:336:0x0825, B:338:0x0833, B:340:0x0847, B:343:0x084e, B:345:0x0854, B:347:0x085a, B:349:0x0864, B:351:0x0874, B:352:0x0879, B:353:0x087c, B:355:0x088a, B:357:0x0894, B:360:0x08a0, B:362:0x08ac, B:363:0x08b7, B:365:0x08c5, B:367:0x08d9, B:369:0x08df, B:371:0x08e5, B:372:0x08ea, B:375:0x08f2, B:377:0x08fe, B:378:0x0909, B:380:0x0917, B:382:0x0927, B:385:0x092f, B:387:0x0939, B:389:0x0945, B:390:0x0950, B:392:0x095e, B:394:0x096e, B:397:0x0976, B:323:0x07e2, B:325:0x07e8, B:327:0x07ee, B:328:0x07f4, B:330:0x07fa, B:332:0x0804, B:334:0x0811, B:260:0x0687), top: B:420:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x06da A[Catch: all -> 0x0986, TRY_LEAVE, TryCatch #2 {all -> 0x0986, blocks: (B:3:0x0005, B:5:0x0009, B:6:0x000c, B:7:0x0024, B:9:0x0032, B:11:0x0056, B:13:0x0062, B:15:0x0074, B:17:0x007d, B:18:0x0086, B:20:0x008e, B:21:0x00a4, B:16:0x007b, B:22:0x00a7, B:23:0x00bb, B:25:0x00c9, B:27:0x00ed, B:31:0x0106, B:33:0x010c, B:35:0x011a, B:43:0x0144, B:36:0x0124, B:38:0x012a, B:41:0x0139, B:30:0x00fc, B:44:0x014f, B:46:0x0155, B:48:0x015b, B:49:0x0160, B:51:0x0168, B:53:0x0172, B:54:0x0182, B:56:0x018a, B:58:0x019e, B:60:0x01a8, B:63:0x01b7, B:64:0x01c0, B:66:0x01c6, B:68:0x01d1, B:70:0x01dd, B:72:0x01ef, B:74:0x01fa, B:77:0x0201, B:80:0x020f, B:82:0x0221, B:84:0x022a, B:190:0x0492, B:83:0x0228, B:87:0x0236, B:88:0x0239, B:89:0x0242, B:91:0x024a, B:93:0x0262, B:95:0x026c, B:97:0x0272, B:110:0x02b4, B:98:0x027c, B:100:0x0282, B:102:0x0288, B:103:0x028e, B:105:0x0294, B:107:0x029e, B:109:0x02ab, B:111:0x02be, B:112:0x02c7, B:114:0x02cf, B:116:0x02e7, B:118:0x02f1, B:120:0x02f7, B:133:0x0339, B:134:0x0344, B:136:0x0352, B:139:0x0367, B:141:0x036d, B:143:0x0373, B:145:0x037d, B:147:0x038d, B:148:0x0392, B:149:0x0395, B:151:0x03a3, B:153:0x03ad, B:156:0x03b9, B:158:0x03c5, B:159:0x03d0, B:161:0x03de, B:163:0x03f2, B:165:0x03fc, B:167:0x0402, B:168:0x0407, B:171:0x040f, B:173:0x041b, B:174:0x0426, B:176:0x0434, B:179:0x0446, B:181:0x0450, B:183:0x045c, B:184:0x0467, B:186:0x0475, B:189:0x0487, B:121:0x0301, B:123:0x0307, B:125:0x030d, B:126:0x0313, B:128:0x0319, B:130:0x0323, B:132:0x0330, B:73:0x01f7, B:191:0x0496, B:192:0x04aa, B:194:0x04b8, B:196:0x04d1, B:197:0x04db, B:199:0x04e1, B:201:0x04e7, B:202:0x04ec, B:204:0x04f4, B:206:0x04fe, B:207:0x050e, B:209:0x0516, B:211:0x0524, B:212:0x052f, B:214:0x053d, B:217:0x0552, B:219:0x0561, B:220:0x056b, B:221:0x057f, B:223:0x058d, B:225:0x05ad, B:227:0x05bb, B:235:0x05ee, B:228:0x05c5, B:230:0x05cb, B:232:0x05d9, B:233:0x05e3, B:236:0x05f8, B:238:0x05fe, B:240:0x0604, B:241:0x0609, B:243:0x0611, B:245:0x061b, B:246:0x062b, B:248:0x0633, B:250:0x0647, B:251:0x0650, B:253:0x0656, B:255:0x0661, B:257:0x066d, B:259:0x067f, B:261:0x068a, B:264:0x0691, B:267:0x069f, B:269:0x06b1, B:271:0x06ba, B:270:0x06b8, B:274:0x06c6, B:275:0x06c9, B:276:0x06d2, B:278:0x06da, B:279:0x06e8, B:281:0x06ee, B:283:0x06fc, B:285:0x0710, B:287:0x071a, B:289:0x0724, B:291:0x072a, B:304:0x076c, B:292:0x0734, B:294:0x073a, B:296:0x0740, B:297:0x0746, B:299:0x074c, B:301:0x0756, B:303:0x0763, B:306:0x0777, B:307:0x0780, B:309:0x0788, B:310:0x0796, B:312:0x079c, B:314:0x07aa, B:316:0x07be, B:318:0x07c8, B:320:0x07d2, B:322:0x07d8, B:335:0x081a, B:336:0x0825, B:338:0x0833, B:340:0x0847, B:343:0x084e, B:345:0x0854, B:347:0x085a, B:349:0x0864, B:351:0x0874, B:352:0x0879, B:353:0x087c, B:355:0x088a, B:357:0x0894, B:360:0x08a0, B:362:0x08ac, B:363:0x08b7, B:365:0x08c5, B:367:0x08d9, B:369:0x08df, B:371:0x08e5, B:372:0x08ea, B:375:0x08f2, B:377:0x08fe, B:378:0x0909, B:380:0x0917, B:382:0x0927, B:385:0x092f, B:387:0x0939, B:389:0x0945, B:390:0x0950, B:392:0x095e, B:394:0x096e, B:397:0x0976, B:323:0x07e2, B:325:0x07e8, B:327:0x07ee, B:328:0x07f4, B:330:0x07fa, B:332:0x0804, B:334:0x0811, B:260:0x0687), top: B:420:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0788 A[Catch: all -> 0x0986, TRY_LEAVE, TryCatch #2 {all -> 0x0986, blocks: (B:3:0x0005, B:5:0x0009, B:6:0x000c, B:7:0x0024, B:9:0x0032, B:11:0x0056, B:13:0x0062, B:15:0x0074, B:17:0x007d, B:18:0x0086, B:20:0x008e, B:21:0x00a4, B:16:0x007b, B:22:0x00a7, B:23:0x00bb, B:25:0x00c9, B:27:0x00ed, B:31:0x0106, B:33:0x010c, B:35:0x011a, B:43:0x0144, B:36:0x0124, B:38:0x012a, B:41:0x0139, B:30:0x00fc, B:44:0x014f, B:46:0x0155, B:48:0x015b, B:49:0x0160, B:51:0x0168, B:53:0x0172, B:54:0x0182, B:56:0x018a, B:58:0x019e, B:60:0x01a8, B:63:0x01b7, B:64:0x01c0, B:66:0x01c6, B:68:0x01d1, B:70:0x01dd, B:72:0x01ef, B:74:0x01fa, B:77:0x0201, B:80:0x020f, B:82:0x0221, B:84:0x022a, B:190:0x0492, B:83:0x0228, B:87:0x0236, B:88:0x0239, B:89:0x0242, B:91:0x024a, B:93:0x0262, B:95:0x026c, B:97:0x0272, B:110:0x02b4, B:98:0x027c, B:100:0x0282, B:102:0x0288, B:103:0x028e, B:105:0x0294, B:107:0x029e, B:109:0x02ab, B:111:0x02be, B:112:0x02c7, B:114:0x02cf, B:116:0x02e7, B:118:0x02f1, B:120:0x02f7, B:133:0x0339, B:134:0x0344, B:136:0x0352, B:139:0x0367, B:141:0x036d, B:143:0x0373, B:145:0x037d, B:147:0x038d, B:148:0x0392, B:149:0x0395, B:151:0x03a3, B:153:0x03ad, B:156:0x03b9, B:158:0x03c5, B:159:0x03d0, B:161:0x03de, B:163:0x03f2, B:165:0x03fc, B:167:0x0402, B:168:0x0407, B:171:0x040f, B:173:0x041b, B:174:0x0426, B:176:0x0434, B:179:0x0446, B:181:0x0450, B:183:0x045c, B:184:0x0467, B:186:0x0475, B:189:0x0487, B:121:0x0301, B:123:0x0307, B:125:0x030d, B:126:0x0313, B:128:0x0319, B:130:0x0323, B:132:0x0330, B:73:0x01f7, B:191:0x0496, B:192:0x04aa, B:194:0x04b8, B:196:0x04d1, B:197:0x04db, B:199:0x04e1, B:201:0x04e7, B:202:0x04ec, B:204:0x04f4, B:206:0x04fe, B:207:0x050e, B:209:0x0516, B:211:0x0524, B:212:0x052f, B:214:0x053d, B:217:0x0552, B:219:0x0561, B:220:0x056b, B:221:0x057f, B:223:0x058d, B:225:0x05ad, B:227:0x05bb, B:235:0x05ee, B:228:0x05c5, B:230:0x05cb, B:232:0x05d9, B:233:0x05e3, B:236:0x05f8, B:238:0x05fe, B:240:0x0604, B:241:0x0609, B:243:0x0611, B:245:0x061b, B:246:0x062b, B:248:0x0633, B:250:0x0647, B:251:0x0650, B:253:0x0656, B:255:0x0661, B:257:0x066d, B:259:0x067f, B:261:0x068a, B:264:0x0691, B:267:0x069f, B:269:0x06b1, B:271:0x06ba, B:270:0x06b8, B:274:0x06c6, B:275:0x06c9, B:276:0x06d2, B:278:0x06da, B:279:0x06e8, B:281:0x06ee, B:283:0x06fc, B:285:0x0710, B:287:0x071a, B:289:0x0724, B:291:0x072a, B:304:0x076c, B:292:0x0734, B:294:0x073a, B:296:0x0740, B:297:0x0746, B:299:0x074c, B:301:0x0756, B:303:0x0763, B:306:0x0777, B:307:0x0780, B:309:0x0788, B:310:0x0796, B:312:0x079c, B:314:0x07aa, B:316:0x07be, B:318:0x07c8, B:320:0x07d2, B:322:0x07d8, B:335:0x081a, B:336:0x0825, B:338:0x0833, B:340:0x0847, B:343:0x084e, B:345:0x0854, B:347:0x085a, B:349:0x0864, B:351:0x0874, B:352:0x0879, B:353:0x087c, B:355:0x088a, B:357:0x0894, B:360:0x08a0, B:362:0x08ac, B:363:0x08b7, B:365:0x08c5, B:367:0x08d9, B:369:0x08df, B:371:0x08e5, B:372:0x08ea, B:375:0x08f2, B:377:0x08fe, B:378:0x0909, B:380:0x0917, B:382:0x0927, B:385:0x092f, B:387:0x0939, B:389:0x0945, B:390:0x0950, B:392:0x095e, B:394:0x096e, B:397:0x0976, B:323:0x07e2, B:325:0x07e8, B:327:0x07ee, B:328:0x07f4, B:330:0x07fa, B:332:0x0804, B:334:0x0811, B:260:0x0687), top: B:420:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x024a A[Catch: all -> 0x0986, TryCatch #2 {all -> 0x0986, blocks: (B:3:0x0005, B:5:0x0009, B:6:0x000c, B:7:0x0024, B:9:0x0032, B:11:0x0056, B:13:0x0062, B:15:0x0074, B:17:0x007d, B:18:0x0086, B:20:0x008e, B:21:0x00a4, B:16:0x007b, B:22:0x00a7, B:23:0x00bb, B:25:0x00c9, B:27:0x00ed, B:31:0x0106, B:33:0x010c, B:35:0x011a, B:43:0x0144, B:36:0x0124, B:38:0x012a, B:41:0x0139, B:30:0x00fc, B:44:0x014f, B:46:0x0155, B:48:0x015b, B:49:0x0160, B:51:0x0168, B:53:0x0172, B:54:0x0182, B:56:0x018a, B:58:0x019e, B:60:0x01a8, B:63:0x01b7, B:64:0x01c0, B:66:0x01c6, B:68:0x01d1, B:70:0x01dd, B:72:0x01ef, B:74:0x01fa, B:77:0x0201, B:80:0x020f, B:82:0x0221, B:84:0x022a, B:190:0x0492, B:83:0x0228, B:87:0x0236, B:88:0x0239, B:89:0x0242, B:91:0x024a, B:93:0x0262, B:95:0x026c, B:97:0x0272, B:110:0x02b4, B:98:0x027c, B:100:0x0282, B:102:0x0288, B:103:0x028e, B:105:0x0294, B:107:0x029e, B:109:0x02ab, B:111:0x02be, B:112:0x02c7, B:114:0x02cf, B:116:0x02e7, B:118:0x02f1, B:120:0x02f7, B:133:0x0339, B:134:0x0344, B:136:0x0352, B:139:0x0367, B:141:0x036d, B:143:0x0373, B:145:0x037d, B:147:0x038d, B:148:0x0392, B:149:0x0395, B:151:0x03a3, B:153:0x03ad, B:156:0x03b9, B:158:0x03c5, B:159:0x03d0, B:161:0x03de, B:163:0x03f2, B:165:0x03fc, B:167:0x0402, B:168:0x0407, B:171:0x040f, B:173:0x041b, B:174:0x0426, B:176:0x0434, B:179:0x0446, B:181:0x0450, B:183:0x045c, B:184:0x0467, B:186:0x0475, B:189:0x0487, B:121:0x0301, B:123:0x0307, B:125:0x030d, B:126:0x0313, B:128:0x0319, B:130:0x0323, B:132:0x0330, B:73:0x01f7, B:191:0x0496, B:192:0x04aa, B:194:0x04b8, B:196:0x04d1, B:197:0x04db, B:199:0x04e1, B:201:0x04e7, B:202:0x04ec, B:204:0x04f4, B:206:0x04fe, B:207:0x050e, B:209:0x0516, B:211:0x0524, B:212:0x052f, B:214:0x053d, B:217:0x0552, B:219:0x0561, B:220:0x056b, B:221:0x057f, B:223:0x058d, B:225:0x05ad, B:227:0x05bb, B:235:0x05ee, B:228:0x05c5, B:230:0x05cb, B:232:0x05d9, B:233:0x05e3, B:236:0x05f8, B:238:0x05fe, B:240:0x0604, B:241:0x0609, B:243:0x0611, B:245:0x061b, B:246:0x062b, B:248:0x0633, B:250:0x0647, B:251:0x0650, B:253:0x0656, B:255:0x0661, B:257:0x066d, B:259:0x067f, B:261:0x068a, B:264:0x0691, B:267:0x069f, B:269:0x06b1, B:271:0x06ba, B:270:0x06b8, B:274:0x06c6, B:275:0x06c9, B:276:0x06d2, B:278:0x06da, B:279:0x06e8, B:281:0x06ee, B:283:0x06fc, B:285:0x0710, B:287:0x071a, B:289:0x0724, B:291:0x072a, B:304:0x076c, B:292:0x0734, B:294:0x073a, B:296:0x0740, B:297:0x0746, B:299:0x074c, B:301:0x0756, B:303:0x0763, B:306:0x0777, B:307:0x0780, B:309:0x0788, B:310:0x0796, B:312:0x079c, B:314:0x07aa, B:316:0x07be, B:318:0x07c8, B:320:0x07d2, B:322:0x07d8, B:335:0x081a, B:336:0x0825, B:338:0x0833, B:340:0x0847, B:343:0x084e, B:345:0x0854, B:347:0x085a, B:349:0x0864, B:351:0x0874, B:352:0x0879, B:353:0x087c, B:355:0x088a, B:357:0x0894, B:360:0x08a0, B:362:0x08ac, B:363:0x08b7, B:365:0x08c5, B:367:0x08d9, B:369:0x08df, B:371:0x08e5, B:372:0x08ea, B:375:0x08f2, B:377:0x08fe, B:378:0x0909, B:380:0x0917, B:382:0x0927, B:385:0x092f, B:387:0x0939, B:389:0x0945, B:390:0x0950, B:392:0x095e, B:394:0x096e, B:397:0x0976, B:323:0x07e2, B:325:0x07e8, B:327:0x07ee, B:328:0x07f4, B:330:0x07fa, B:332:0x0804, B:334:0x0811, B:260:0x0687), top: B:420:0x0005 }] */
    @abcd.ey(method = -2997789577526525184L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void zf() {
        /*
            Method dump skipped, instructions count: 2449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.api.ClassType.zf():void");
    }

    @ey(method = -2410247195418956800L)
    public int AE() {
        try {
            if (gW) {
                iy.gn(-1128217169271918760L, this);
            }
            eN();
            return getData().inheritedMethodPairs.EQ() / 2;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -1128217169271918760L, this);
            }
            throw th;
        }
    }

    @ey(method = 1629355257176232605L)
    public void Ak() {
        try {
            if (gW) {
                iy.gn(-2482205403603465617L, this);
            }
            this.data = null;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -2482205403603465617L, this);
            }
            throw th;
        }
    }

    @ey(method = 1258842440934254640L)
    public ParameterType An(int i) {
        try {
            if (gW) {
                iy.u7(5836875292481532300L, this, i);
            }
            loadSyntax();
            if (this.typeParameterCount > i) {
                return (ParameterType) getData().typeParameters.v5(i);
            }
            throw new e4();
        } catch (Throwable th) {
            if (BT) {
                iy.j3(th, 5836875292481532300L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -3838859227219792420L)
    public Member BR(int i) {
        try {
            if (gW) {
                iy.u7(2673827818587301520L, this, i);
            }
            return (Member) getData().inheritedMethodPairs.v5((i * 2) + 1);
        } catch (Throwable th) {
            if (BT) {
                iy.j3(th, 2673827818587301520L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 2645311309806431079L)
    public ClassType Bx() {
        try {
            if (gW) {
                iy.gn(-3470020520761720651L, this);
            }
            wE();
            if (isInterfaceType()) {
                throw new e4();
            }
            if (getData().superClasstypes.EQ() != 0) {
                return (ClassType) getData().superClasstypes.v5(0);
            }
            throw new e4();
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -3470020520761720651L, this);
            }
            throw th;
        }
    }

    @ey(method = -838453325753678472L)
    public int Cz() {
        try {
            if (gW) {
                iy.gn(-4322344442286812004L, this);
            }
            return getFile().gn();
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -4322344442286812004L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = -3726741955088535831L)
    public int DW() {
        try {
            if (gW) {
                iy.gn(6890661591299763051L, this);
            }
            return this.declarationNumber;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 6890661591299763051L, this);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.String] */
    @Override // com.aide.codemodel.api.Entity
    @ey(method = 1485669517255793076L)
    public String EQ() {
        long j = 2870858626028203760;
        try {
            if (gW) {
                iy.gn(2870858626028203760L, this);
            }
            String str = "";
            ClassType classType = this;
            while (true) {
                String str2 = classType.gG() + str;
                ClassType enclosingClassType = classType.getEnclosingClassType();
                if (enclosingClassType == classType) {
                    j = getNamespace().getFullyQualifiedNameString().replace('.', '/') + "/" + str2 + ".html";
                    return j;
                }
                str = "." + str2;
                classType = enclosingClassType;
            }
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, j, this);
            }
            throw th;
        }
    }

    @ey(method = -717309618664668753L)
    public boolean Ej(Type type) {
        try {
            if (gW) {
                iy.tp(-3747705673968914139L, this, type);
            }
            if (getData().superClasstypesLoading) {
                return false;
            }
            wE();
            return getData().allSuperClasstypes.contains(type);
        } catch (Throwable th) {
            if (BT) {
                iy.j3(th, -3747705673968914139L, this, type);
            }
            throw th;
        }
    }

    @ey(method = 1406965908027763972L)
    public void Ev() {
        try {
            if (gW) {
                iy.gn(420792680709197568L, this);
            }
            getData().corruptedSupertypes = true;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 420792680709197568L, this);
            }
            throw th;
        }
    }

    @ey(method = 2956836324293700992L)
    public ClassType FN(int i, boolean z, int i2, Entity entity, FileEntry fileEntry, Language language) {
        int iQX;
        int iQX2;
        try {
            if (gW) {
                iy.QX(-251260959540997504L, this, new Object[]{new Integer(i), new Boolean(z), new Integer(i2), entity, fileEntry, language});
            }
            if (getData().superClasstypesLoading) {
                MapOfInt<ClassType> mapOfInt = getData().memberClasstypes;
                if (z) {
                    iQX2 = i;
                } else {
                    if (getData().br == null) {
                        getData().br = new MapOfInt<>(this.space);
                        getData().memberClasstypes.DEFAULT_ITERATOR.DW();
                        while (getData().memberClasstypes.DEFAULT_ITERATOR.hasMoreElements()) {
                            getData().br.insert(this.we.QX(getData().memberClasstypes.DEFAULT_ITERATOR.Hw()), (ClassType) getData().memberClasstypes.DEFAULT_ITERATOR.nextValue());
                        }
                    }
                    iQX2 = this.we.QX(i);
                    mapOfInt = getData().br;
                }
                mapOfInt.DEFAULT_ITERATOR.init(iQX2);
                ClassType classType = null;
                while (mapOfInt.DEFAULT_ITERATOR.hasMoreElements()) {
                    ClassType classType2 = (ClassType) mapOfInt.DEFAULT_ITERATOR.nextValue();
                    if (classType2.cc(entity)) {
                        if (classType != null) {
                            throw new b4();
                        }
                        classType = classType2;
                    }
                }
                if (classType != null) {
                    return classType;
                }
                throw new e4();
            }
            wE();
            MapOfInt<ClassType> mapOfInt2 = getData().allMemberClasstypes;
            if (z) {
                iQX = i;
            } else {
                if (getData().XX == null) {
                    getData().XX = new MapOfInt<>(this.space);
                    getData().allMemberClasstypes.DEFAULT_ITERATOR.DW();
                    while (getData().allMemberClasstypes.DEFAULT_ITERATOR.hasMoreElements()) {
                        getData().XX.insert(this.we.QX(getData().allMemberClasstypes.DEFAULT_ITERATOR.Hw()), (ClassType) getData().allMemberClasstypes.DEFAULT_ITERATOR.nextValue());
                    }
                }
                iQX = this.we.QX(i);
                mapOfInt2 = getData().XX;
            }
            mapOfInt2.DEFAULT_ITERATOR.init(iQX);
            ClassType classType3 = null;
            while (mapOfInt2.DEFAULT_ITERATOR.hasMoreElements()) {
                ClassType classType4 = (ClassType) mapOfInt2.DEFAULT_ITERATOR.nextValue();
                if (classType4.cc(entity)) {
                    if (classType3 != null) {
                        throw new b4();
                    }
                    classType3 = classType4;
                }
            }
            if (classType3 != null) {
                return classType3;
            }
            throw new e4();
        } catch (Throwable th) {
            if (BT) {
                iy.rN(th, -251260959540997504L, this, new Object[]{new Integer(i), new Boolean(z), new Integer(i2), entity, fileEntry, language});
            }
            throw th;
        }
    }

    @ey(method = 757665898460819203L)
    public boolean GK() {
        try {
            if (gW) {
                iy.gn(-1953820752073479615L, this);
            }
            om();
            return this.isLocal;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -1953820752073479615L, this);
            }
            throw th;
        }
    }

    @ey(method = -1866605613568015760L)
    public boolean GT(ClassType classType) {
        try {
            if (gW) {
                iy.tp(4497935107289348896L, this, classType);
            }
            if (getNamespace() == classType.getNamespace() && Yi() && classType.Yi() && isToplevel() && classType.isToplevel() && getIdentifier() == classType.getIdentifier()) {
                return true;
            }
            if (isToplevel()) {
                return false;
            }
            return getEnclosingClassType().GT(classType);
        } catch (Throwable th) {
            if (BT) {
                iy.j3(th, 4497935107289348896L, this, classType);
            }
            throw th;
        }
    }

    @ey(method = -923862286986137397L)
    public Type IS(FileEntry fileEntry) {
        try {
            if (gW) {
                iy.tp(3596599015413176037L, this, fileEntry);
            }
            this.space.e9(getFile(), getLanguage());
            if (getData().delegateOrEnumtype != null) {
                return getData().delegateOrEnumtype;
            }
            throw new e4();
        } catch (Throwable th) {
            if (BT) {
                iy.j3(th, 3596599015413176037L, this, fileEntry);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = 212046777649311488L)
    public int J8() {
        try {
            if (gW) {
                iy.gn(-4788641142744135972L, this);
            }
            this.space.Cz(getFile(), getLanguage());
            return getData().idEndColumn;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -4788641142744135972L, this);
            }
            throw th;
        }
    }

    @ey(method = 3008158468975380875L)
    public MapOfInt<Member> Jl() {
        try {
            if (gW) {
                iy.gn(-1699726761460493079L, this);
            }
            eN();
            return getData().allMemberOperators;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -1699726761460493079L, this);
            }
            throw th;
        }
    }

    @ey(method = -4260104084354890824L)
    public int Jm() {
        try {
            if (gW) {
                iy.gn(-4563308619052051968L, this);
            }
            this.space.Cz(getFile(), getLanguage());
            return getData().startLine;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -4563308619052051968L, this);
            }
            throw th;
        }
    }

    @ey(method = -3386951169581146684L)
    public boolean Lz() {
        try {
            if (gW) {
                iy.gn(-1517682863388462584L, this);
            }
            return y1.j6(getModifiers());
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -1517682863388462584L, this);
            }
            throw th;
        }
    }

    @ey(method = 62393112779586108L)
    public boolean MP() {
        try {
            if (gW) {
                iy.gn(-8363213718406594720L, this);
            }
            wE();
            return getData().corruptedSupertypes;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -8363213718406594720L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = -452296346279634095L)
    public int Mr() {
        try {
            if (gW) {
                iy.gn(3342570899112072067L, this);
            }
            this.space.Cz(getFile(), getLanguage());
            return getData().modifierSendLine;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 3342570899112072067L, this);
            }
            throw th;
        }
    }

    @ey(method = -4712604788599350051L)
    public Member Nh(int i) {
        try {
            if (gW) {
                iy.u7(1885023098287920591L, this, i);
            }
            return (Member) getData().inheritedMethodPairs.v5(i * 2);
        } catch (Throwable th) {
            if (BT) {
                iy.j3(th, 1885023098287920591L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 4382082313520697225L)
    public long Od() {
        try {
            if (gW) {
                iy.gn(437754598246681751L, this);
            }
            return this.yS;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 437754598246681751L, this);
            }
            throw th;
        }
    }

    @ey(method = -2629515380895543080L)
    public boolean Of() {
        try {
            if (gW) {
                iy.gn(4418328411011022140L, this);
            }
            if (!isToplevel() && !pl()) {
                if (!getData().inStaticMethod) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 4418328411011022140L, this);
            }
            throw th;
        }
    }

    @ey(method = 2599065732620362331L)
    public boolean PH() {
        try {
            if (gW) {
                iy.gn(575606771399971445L, this);
            }
            loadSyntax();
            return getData().hasDocumentation;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 575606771399971445L, this);
            }
            throw th;
        }
    }

    @ey(method = 253873197976089651L)
    public boolean PT() {
        try {
            if (gW) {
                iy.gn(-4869112586126749763L, this);
            }
            if (!getLanguage().getTypeSystem().DW()) {
                if (!Of()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -4869112586126749763L, this);
            }
            throw th;
        }
    }

    @ey(method = -29558785084852100L)
    public int Pa() {
        try {
            if (gW) {
                iy.gn(6867039643570681920L, this);
            }
            om();
            if (this.typeParameterCount == -1) {
                loadSyntax();
            }
            return this.typeParameterCount;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 6867039643570681920L, this);
            }
            throw th;
        }
    }

    @ey(method = -808444230443993835L)
    public MapOfInt<Member> QO() {
        try {
            if (gW) {
                iy.gn(-132911673474402077L, this);
            }
            loadSyntax();
            return getData().memberFields;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -132911673474402077L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = -281734440734813923L)
    public int QX() {
        try {
            if (gW) {
                iy.gn(733762535343130447L, this);
            }
            this.space.Cz(getFile(), getLanguage());
            return getData().idStartColumn;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 733762535343130447L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Type
    @ey(method = 2619020924088834528L)
    public Type Sf(FileEntry fileEntry, Language language, int i, boolean z, ClassType classType, SetOf<Member> setOf) {
        try {
            if (gW) {
                iy.QX(910458273525632520L, this, new Object[]{fileEntry, language, new Integer(i), new Boolean(z), classType, setOf});
            }
            eN();
            setOf.clear();
            MapOfInt<Member> mapOfInt = getData().allMemberMethods;
            mapOfInt.DEFAULT_ITERATOR.init(i);
            while (mapOfInt.DEFAULT_ITERATOR.hasMoreElements()) {
                Member member = (Member) mapOfInt.DEFAULT_ITERATOR.nextValue();
                if (member.Nh(this, classType)) {
                    setOf.put(member);
                }
            }
            if (!setOf.v5()) {
                return this;
            }
            if (!z) {
                if (getData().lp == null) {
                    getData().lp = new MapOfInt<>(this.space);
                    getData().allMemberMethods.DEFAULT_ITERATOR.DW();
                    while (getData().allMemberMethods.DEFAULT_ITERATOR.hasMoreElements()) {
                        getData().lp.insert(this.we.QX(getData().allMemberMethods.DEFAULT_ITERATOR.Hw()), (Member) getData().allMemberMethods.DEFAULT_ITERATOR.nextValue());
                    }
                }
                int iQX = this.we.QX(i);
                MapOfInt<Member> mapOfInt2 = getData().lp;
                mapOfInt2.DEFAULT_ITERATOR.init(iQX);
                while (mapOfInt2.DEFAULT_ITERATOR.hasMoreElements()) {
                    Member member2 = (Member) mapOfInt2.DEFAULT_ITERATOR.nextValue();
                    if (member2.Nh(this, classType)) {
                        setOf.put(member2);
                    }
                }
            }
            if (setOf.v5()) {
                return null;
            }
            return this;
        } catch (Throwable th) {
            if (BT) {
                iy.rN(th, 910458273525632520L, this, new Object[]{fileEntry, language, new Integer(i), new Boolean(z), classType, setOf});
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = 525771103385014392L)
    public int U2() {
        try {
            if (gW) {
                iy.gn(281489742796132224L, this);
            }
            this.space.Cz(getFile(), getLanguage());
            return getData().modifiersStartColumn;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 281489742796132224L, this);
            }
            throw th;
        }
    }

    @ey(method = -206690265962124183L)
    public void WB(Type type) {
        try {
            if (gW) {
                iy.tp(7170987337216809711L, this, type);
            }
            getData().delegateOrEnumtype = type;
        } catch (Throwable th) {
            if (BT) {
                iy.j3(th, 7170987337216809711L, this, type);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = -306313892766412531L)
    public int Ws() {
        try {
            if (gW) {
                iy.gn(-6156248834403366741L, this);
            }
            this.space.Cz(getFile(), getLanguage());
            return getData().idLine;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -6156248834403366741L, this);
            }
            throw th;
        }
    }

    @ey(method = -1216445690036122569L)
    public boolean Yi() {
        try {
            if (gW) {
                iy.gn(-1047439974816586719L, this);
            }
            loadSyntax();
            return (getData().modifiers & 2097152) != 0;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -1047439974816586719L, this);
            }
            throw th;
        }
    }

    @ey(method = 3232821323271107496L)
    public boolean Z1(int i, boolean z) {
        int i2;
        int i3;
        try {
            if (gW) {
                iy.EQ(-1517899300288805700L, this, new Integer(i), new Boolean(z));
            }
            if (getData().superClasstypesLoading) {
                MapOfInt<ClassType> mapOfInt = getData().memberClasstypes;
                if (z) {
                    i3 = i;
                } else {
                    if (getData().br == null) {
                        getData().br = new MapOfInt<>(this.space);
                        getData().memberClasstypes.DEFAULT_ITERATOR.DW();
                        while (getData().memberClasstypes.DEFAULT_ITERATOR.hasMoreElements()) {
                            getData().br.insert(this.we.QX(getData().memberClasstypes.DEFAULT_ITERATOR.Hw()), (ClassType) getData().memberClasstypes.DEFAULT_ITERATOR.nextValue());
                        }
                    }
                    int iQX = this.we.QX(i);
                    i3 = iQX;
                    mapOfInt = getData().br;
                }
                return mapOfInt.v5(i3);
            }
            wE();
            MapOfInt<ClassType> mapOfInt2 = getData().allMemberClasstypes;
            if (z) {
                i2 = i;
            } else {
                if (getData().XX == null) {
                    getData().XX = new MapOfInt<>(this.space);
                    getData().allMemberClasstypes.DEFAULT_ITERATOR.DW();
                    while (getData().allMemberClasstypes.DEFAULT_ITERATOR.hasMoreElements()) {
                        getData().XX.insert(this.we.QX(getData().allMemberClasstypes.DEFAULT_ITERATOR.Hw()), (ClassType) getData().allMemberClasstypes.DEFAULT_ITERATOR.nextValue());
                    }
                }
                int iQX2 = this.we.QX(i);
                i2 = iQX2;
                mapOfInt2 = getData().XX;
            }
            return mapOfInt2.v5(i2);
        } catch (Throwable th) {
            if (BT) {
                iy.Mr(th, -1517899300288805700L, this, new Integer(i), new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = -2437835263704056835L)
    public int Zo() {
        try {
            if (gW) {
                iy.gn(-668648409989980305L, this);
            }
            this.space.Cz(getFile(), getLanguage());
            return getData().endLine;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -668648409989980305L, this);
            }
            throw th;
        }
    }

    @ey(method = -4804688904973620975L)
    public Type a5() {
        try {
            if (gW) {
                iy.gn(-2824036238538546165L, this);
            }
            this.space.e9(getFile(), getLanguage());
            if (getData().delegateOrEnumtype != null) {
                return getData().delegateOrEnumtype;
            }
            throw new e4();
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -2824036238538546165L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = 2263596085365169600L)
    public int a8() {
        try {
            if (gW) {
                iy.gn(-388957472258560700L, this);
            }
            this.space.Cz(getFile(), getLanguage());
            return getData().modifiersStartLine;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -388957472258560700L, this);
            }
            throw th;
        }
    }

    @ey(method = -604700447214679035L)
    public SetOf<Member> aX() {
        try {
            if (gW) {
                iy.gn(-100995910774214449L, this);
            }
            loadSyntax();
            return getData().memberConstructors;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -100995910774214449L, this);
            }
            throw th;
        }
    }

    @ey(method = 1436564363626302949L)
    public boolean areSuperClasstypesLoaded() {
        try {
            if (gW) {
                iy.gn(-14095774661675825L, this);
            }
            return getData().superClasstypesLoaded;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -14095774661675825L, this);
            }
            throw th;
        }
    }

    @ey(method = -4472967604317461535L)
    public Type ba(Type[] typeArr, int[] iArr) {
        int i;
        try {
            if (gW) {
                iy.EQ(-3466910345287657797L, this, typeArr, iArr);
            }
            int iPa = Pa();
            int absoluteParametertypeCount = getAbsoluteParametertypeCount();
            if (absoluteParametertypeCount == 0) {
                return this;
            }
            if (iPa < absoluteParametertypeCount) {
                try {
                    Type[] typeArr2 = new Type[absoluteParametertypeCount];
                    int[] iArr2 = new int[absoluteParametertypeCount];
                    int i2 = 0;
                    while (true) {
                        i = absoluteParametertypeCount - iPa;
                        if (i2 >= i) {
                            break;
                        }
                        typeArr2[i2] = n5(i2).x9().x9();
                        iArr2[i2] = 0;
                        i2++;
                    }
                    while (i < absoluteParametertypeCount) {
                        int i3 = (i - absoluteParametertypeCount) + iPa;
                        typeArr2[i] = typeArr[i3];
                        iArr2[i] = iArr[i3];
                        i++;
                    }
                    typeArr = typeArr2;
                    iArr = iArr2;
                } catch (e4 unused) {
                    return this;
                }
            }
            return this.space.AL(this, typeArr, iArr);
        } catch (Throwable th) {
            int[] iArr3 = iArr;
            if (BT) {
                iy.Mr(th, -3466910345287657797L, this, typeArr, iArr3);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0209  */
    @abcd.ey(method = -32837407920308547L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void cT(int r29, int r30, com.aide.codemodel.api.Namespace r31, int r32, int r33, com.aide.codemodel.api.ClassType r34, com.aide.codemodel.api.ClassType r35, boolean r36, boolean r37, boolean r38, boolean r39, boolean r40, boolean r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.api.ClassType.cT(int, int, com.aide.codemodel.api.Namespace, int, int, com.aide.codemodel.api.ClassType, com.aide.codemodel.api.ClassType, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    @ey(method = -782391977223691125L)
    public boolean cc(Entity entity) {
        try {
            if (gW) {
                iy.tp(-1640278512108080987L, this, entity);
            }
            if (this.declarationNumber == 0) {
                return true;
            }
            loadSyntax();
            int modifiers = getModifiers();
            ClassType enclosingClassType = getEnclosingClassType();
            if (y1.J8(modifiers)) {
                return true;
            }
            if (y1.FH(modifiers) && entity.isClassType() && (((ClassType) entity).hp(enclosingClassType) || ((ClassType) entity).GT(enclosingClassType))) {
                return true;
            }
            if (y1.gn(modifiers) && entity.isClassType() && ys() == ((ClassType) entity).ys()) {
                return true;
            }
            if (y1.VH(modifiers)) {
                if (entity.isClassType()) {
                    if (((ClassType) entity).Cz() == Cz() || this.space.v5(Cz(), ((ClassType) entity).Cz())) {
                        return true;
                    }
                } else {
                    if (entity == this.space.getRootNamespace()) {
                        return true;
                    }
                    SetOfInt setOfIntI = ((Namespace) entity).I();
                    setOfIntI.default_Iterator.init();
                    while (setOfIntI.default_Iterator.hasMoreElements()) {
                        int iNextKey = setOfIntI.default_Iterator.nextKey();
                        if (iNextKey == Cz() || this.space.v5(Cz(), iNextKey)) {
                            return true;
                        }
                    }
                }
            }
            if (y1.we(modifiers)) {
                if (entity.isClassType()) {
                    if (((ClassType) entity).getNamespace() == getNamespace()) {
                        return true;
                    }
                } else if (entity == getNamespace()) {
                    return true;
                }
            }
            if (!y1.J0(modifiers)) {
                return false;
            }
            if (entity.isNamespace()) {
                return getNamespace() == entity;
            }
            if (this == entity) {
                return true;
            }
            ClassType enclosingClassType2 = (ClassType) entity;
            ClassType enclosingClassType3 = getEnclosingClassType();
            if (enclosingClassType2.Ej(enclosingClassType3)) {
                return true;
            }
            while (!enclosingClassType2.isToplevel()) {
                enclosingClassType2 = enclosingClassType2.getEnclosingClassType();
                if (enclosingClassType2.Ej(enclosingClassType3)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (BT) {
                iy.j3(th, -1640278512108080987L, this, entity);
            }
            throw th;
        }
    }

    @ey(method = -4194925712541377760L)
    public int ce() {
        try {
            if (gW) {
                iy.gn(3845657848454880276L, this);
            }
            this.space.Cz(getFile(), getLanguage());
            return getData().startColumn;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 3845657848454880276L, this);
            }
            throw th;
        }
    }

    @ey(method = -2970426415914520829L)
    public boolean dW() {
        try {
            if (gW) {
                iy.gn(-1270149145570995691L, this);
            }
            loadSyntax();
            return y1.we(getData().modifiers);
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -1270149145570995691L, this);
            }
            throw th;
        }
    }

    @ey(method = 4944163572384131445L)
    public void declareConstructor(Member member) {
        try {
            if (gW) {
                iy.tp(-5614406352566827389L, this, member);
            }
            getData().memberConstructors.put(member);
        } catch (Throwable th) {
            if (BT) {
                iy.j3(th, -5614406352566827389L, this, member);
            }
            throw th;
        }
    }

    @ey(method = 424445646076521433L)
    public void declareCycliclyDefined() {
        try {
            if (gW) {
                iy.gn(-286112967313623725L, this);
            }
            getData().cycliclyDefined = true;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -286112967313623725L, this);
            }
            throw th;
        }
    }

    @ey(method = -287337353507040573L)
    public void declareSuperClasstypesLoaded() {
        try {
            if (gW) {
                iy.gn(-2154716985668676939L, this);
            }
            getData().superClasstypesLoaded = true;
            getData().superClasstypesLoading = false;
            fP();
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -2154716985668676939L, this);
            }
            throw th;
        }
    }

    @ey(method = -1556444331219724716L)
    public void declareSuperClasstypesLoading() {
        try {
            if (gW) {
                iy.gn(349701369528777200L, this);
            }
            getData().superClasstypesLoaded = false;
            getData().superClasstypesLoading = true;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 349701369528777200L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Type
    @ey(method = -781719333784219203L)
    public Type dx(ClassType classType, SetOf<Member> setOf) {
        try {
            if (gW) {
                iy.EQ(15890573394338463L, this, classType, setOf);
            }
            eN();
            setOf.clear();
            getData().f1dx_.DEFAULT_ITERATOR.init();
            while (getData().f1dx_.DEFAULT_ITERATOR.hasMoreElements()) {
                Member member = (Member) getData().f1dx_.DEFAULT_ITERATOR.nextKey();
                if (member.Nh(classType, classType)) {
                    setOf.put(member);
                }
            }
            if (setOf.v5()) {
                return null;
            }
            return this;
        } catch (Throwable th) {
            if (BT) {
                iy.Mr(th, 15890573394338463L, this, classType, setOf);
            }
            throw th;
        }
    }

    @ey(method = -6366119087174266239L)
    public MapOfInt<Member> e3() {
        try {
            if (gW) {
                iy.gn(-2167714723742600277L, this);
            }
            eN();
            return getData().allMemberMethods;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -2167714723742600277L, this);
            }
            throw th;
        }
    }

    @ey(method = 803403890374914609L)
    public MapOfInt<ClassType> e9() {
        try {
            if (gW) {
                iy.gn(1316793996497127495L, this);
            }
            loadSyntax();
            return getData().memberClasstypes;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 1316793996497127495L, this);
            }
            throw th;
        }
    }

    @ey(method = -5226151264735216808L)
    public MapOfInt<Member> eU() {
        try {
            if (gW) {
                iy.gn(3563091051129174724L, this);
            }
            eN();
            return getData().allMemberFields;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 3563091051129174724L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Type
    @ey(method = 620641631430331500L)
    public Type ef(int i, boolean z, int i2, Entity entity, FileEntry fileEntry, Language language) {
        int iQX;
        try {
            if (gW) {
                iy.QX(7346372759800214536L, this, new Object[]{new Integer(i), new Boolean(z), new Integer(i2), entity, fileEntry, language});
            }
            if (getData().superTypesLoading) {
                return FN(i, z, i2, entity, fileEntry, language);
            }
            d8();
            MapOfInt<Type> mapOfInt = getData().allMemberTypes;
            if (z) {
                iQX = i;
            } else {
                if (getData().OW == null) {
                    getData().OW = new MapOfInt<>(this.space);
                    getData().allMemberTypes.DEFAULT_ITERATOR.DW();
                    while (getData().allMemberTypes.DEFAULT_ITERATOR.hasMoreElements()) {
                        getData().OW.insert(this.we.QX(getData().allMemberTypes.DEFAULT_ITERATOR.Hw()), (Type) getData().allMemberTypes.DEFAULT_ITERATOR.nextValue());
                    }
                }
                iQX = this.we.QX(i);
                mapOfInt = getData().OW;
            }
            Type type = null;
            mapOfInt.DEFAULT_ITERATOR.init(iQX);
            while (mapOfInt.DEFAULT_ITERATOR.hasMoreElements()) {
                Type type2 = (Type) mapOfInt.DEFAULT_ITERATOR.nextValue();
                if ((type2.isParameterizedType() ? ((ParameterizedType) type2).getClassType() : (ClassType) type2).cc(entity)) {
                    if (type != null) {
                        throw new b4();
                    }
                    type = type2;
                }
            }
            if (type != null) {
                return type;
            }
            throw new e4();
        } catch (Throwable th) {
            if (BT) {
                iy.rN(th, 7346372759800214536L, this, new Object[]{new Integer(i), new Boolean(z), new Integer(i2), entity, fileEntry, language});
            }
            throw th;
        }
    }

    @ey(method = 3863149877614422823L)
    public SetOf<ClassType> fN() {
        try {
            if (gW) {
                iy.gn(1110874573057817341L, this);
            }
            wE();
            return getData().allSuperClasstypes;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 1110874573057817341L, this);
            }
            throw th;
        }
    }

    @ey(method = 190961008057794995L)
    public void fY(int i, Member member) {
        try {
            if (gW) {
                iy.EQ(-2652875314234018719L, this, new Integer(i), member);
            }
            getData().memberMethods.insert(i, member);
        } catch (Throwable th) {
            if (BT) {
                iy.Mr(th, -2652875314234018719L, this, new Integer(i), member);
            }
            throw th;
        }
    }

    @ey(method = -8152392462325513216L)
    public String gG() {
        try {
            if (gW) {
                iy.gn(-3786458990357972440L, this);
            }
            om();
            return sT() ? "(anonymous)" : this.we.getString(this.identifier);
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -3786458990357972440L, this);
            }
            throw th;
        }
    }

    @ey(method = -1299588383315398137L)
    public int getAbsoluteParametertypeCount() {
        try {
            if (gW) {
                iy.gn(573063897982630509L, this);
            }
            loadSyntax();
            return getData().absoluteTypeParameterCount;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 573063897982630509L, this);
            }
            throw th;
        }
    }

    @ey(method = -831051109044493281L)
    public SetOf<ClassType> getAllPartialClasstypes() {
        try {
            if (gW) {
                iy.gn(-161318825484223143L, this);
            }
            return getNamespace().sy(getFile(), getLanguage(), getIdentifier());
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -161318825484223143L, this);
            }
            throw th;
        }
    }

    @ey(method = -5445260084908414533L)
    public SetOf<Type> getAllSuperTypes() {
        try {
            if (gW) {
                iy.gn(-3544914343498326831L, this);
            }
            if (getData().superTypesLoading) {
                return new SetOf<>(this.space);
            }
            d8();
            return getData().allSuperTypes;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -3544914343498326831L, this);
            }
            throw th;
        }
    }

    @ey(method = 112042051337553855L)
    public Entity getContainer() {
        try {
            if (gW) {
                iy.gn(-586157586142851583L, this);
            }
            return isToplevel() ? getNamespace() : getEnclosingClassType();
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -586157586142851583L, this);
            }
            throw th;
        }
    }

    @ey(method = 4965923166164506340L)
    public Type getContainingTypeOfMember(Member member) {
        try {
            if (gW) {
                iy.tp(-2362544094856246320L, this, member);
            }
            return getData().containingTypesOfMembers.contains(member) ? (Type) getData().containingTypesOfMembers.get(member) : member.getEnclosingClassType();
        } catch (Throwable th) {
            if (BT) {
                iy.j3(th, -2362544094856246320L, this, member);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = 3183519206842641920L)
    public ClassType getEnclosingClassType() {
        try {
            if (gW) {
                iy.gn(467899782356721656L, this);
            }
            om();
            return this.enclosingClassType;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 467899782356721656L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = -2626055261357924172L)
    public FileEntry getFile() {
        try {
            if (gW) {
                iy.gn(1781922812698181280L, this);
            }
            return this.file;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 1781922812698181280L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = -2569283005558675667L)
    public int getId() {
        try {
            if (gW) {
                iy.gn(1127497648941622551L, this);
            }
            return this.id;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 1127497648941622551L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = -4700741469124971175L)
    public int getIdentifier() {
        try {
            if (gW) {
                iy.gn(4414277515281208311L, this);
            }
            om();
            return this.identifier;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 4414277515281208311L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = 2755960895174177376L)
    public int getModifiers() {
        try {
            if (gW) {
                iy.gn(1818277369057516120L, this);
            }
            loadSyntax();
            return getData().modifiers;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 1818277369057516120L, this);
            }
            throw th;
        }
    }

    @ey(method = 159157775693229815L)
    public Namespace getNamespace() {
        try {
            if (gW) {
                iy.gn(-542386137967732419L, this);
            }
            om();
            return this.namespace;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -542386137967732419L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Type
    @ey(method = -4618519384711523051L)
    public Type getSuperType() {
        try {
            if (gW) {
                iy.gn(-4892596068640284085L, this);
            }
            if (getData().superTypesLoading) {
                throw new e4();
            }
            d8();
            if (isInterfaceType()) {
                throw new e4();
            }
            if (getData().superTypes.EQ() != 0) {
                return (Type) getData().superTypes.v5(0);
            }
            throw new e4();
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -4892596068640284085L, this);
            }
            throw th;
        }
    }

    @ey(method = -1243115429321581875L)
    public void hK(Type type) {
        try {
            if (gW) {
                iy.tp(-4291323329942408025L, this, type);
            }
            if (getData().allSuperClasstypes.contains(type.isParameterizedType() ? ((ParameterizedType) type).getClassType() : (ClassType) type)) {
                getData().superTypes.j6(type);
            }
        } catch (Throwable th) {
            if (BT) {
                iy.j3(th, -4291323329942408025L, this, type);
            }
            throw th;
        }
    }

    @ey(method = -645798433900427799L)
    public boolean hp(ClassType classType) {
        try {
            if (gW) {
                iy.tp(-2531223707691818957L, this, classType);
            }
            if (this == classType) {
                return true;
            }
            if (isToplevel()) {
                return false;
            }
            return getEnclosingClassType().hp(classType);
        } catch (Throwable th) {
            if (BT) {
                iy.j3(th, -2531223707691818957L, this, classType);
            }
            throw th;
        }
    }

    @ey(method = 96473983011145176L)
    public MapOfInt<ClassType> iW() {
        try {
            if (gW) {
                iy.gn(-6930660824637038148L, this);
            }
            wE();
            return getData().allMemberClasstypes;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -6930660824637038148L, this);
            }
            throw th;
        }
    }

    @ey(method = -3447429453093653599L)
    public void invalidate() {
        try {
            if (gW) {
                iy.gn(-1562512557680429369L, this);
            }
            this.syntaxLoaded = false;
            this.data = null;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -1562512557680429369L, this);
            }
            throw th;
        }
    }

    @ey(method = -293060358082117525L)
    public boolean isCycliclyDefined() {
        try {
            if (gW) {
                iy.gn(-6145603592780713527L, this);
            }
            if (getData().superClasstypesLoading) {
                return false;
            }
            wE();
            return getData().cycliclyDefined;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -6145603592780713527L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Type
    @ey(method = -4034411958155453289L)
    public boolean isDelegateType() {
        try {
            if (gW) {
                iy.gn(3941816318049046965L, this);
            }
            loadSyntax();
            return (getData().modifiers & 33554432) != 0;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 3941816318049046965L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Type
    @ey(method = 1763922360831102213L)
    public boolean isEnumType() {
        try {
            if (gW) {
                iy.gn(3134077026631289695L, this);
            }
            loadSyntax();
            return (getData().modifiers & 268435456) != 0;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 3134077026631289695L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Type
    @ey(method = 2515430352155124339L)
    public boolean isInterfaceType() {
        try {
            if (gW) {
                iy.gn(3905207395014285729L, this);
            }
            loadSyntax();
            return (getData().modifiers & 134217728) != 0;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 3905207395014285729L, this);
            }
            throw th;
        }
    }

    @ey(method = 3895390317833714880L)
    public boolean isSealed() {
        try {
            if (gW) {
                iy.gn(3016042932112868392L, this);
            }
            return (getData().modifiers & 128) != 0;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 3016042932112868392L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Type
    @ey(method = -4939575023788843836L)
    public boolean isSealedType() {
        try {
            if (gW) {
                iy.gn(4620150519931952960L, this);
            }
            loadSyntax();
            return (getData().modifiers & 128) != 0;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 4620150519931952960L, this);
            }
            throw th;
        }
    }

    @ey(method = 2312108451956918565L)
    public boolean isToplevel() {
        try {
            if (gW) {
                iy.gn(3636737200126643719L, this);
            }
            return getEnclosingClassType() == this;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 3636737200126643719L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = -4265921603590714655L)
    public int j3() {
        try {
            if (gW) {
                iy.gn(-6461189565674415593L, this);
            }
            this.space.Cz(getFile(), getLanguage());
            return getData().modifierSendColumn;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -6461189565674415593L, this);
            }
            throw th;
        }
    }

    @ey(method = -6241344620143519280L)
    public void jw(int i, ClassType classType) {
        try {
            if (gW) {
                iy.EQ(-3965677595806469104L, this, new Integer(i), classType);
            }
            getData().memberClasstypes.insert(i, classType);
        } catch (Throwable th) {
            if (BT) {
                iy.Mr(th, -3965677595806469104L, this, new Integer(i), classType);
            }
            throw th;
        }
    }

    @ey(method = -6873337307216846765L)
    public void k2(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        try {
            if (gW) {
                iy.QX(-2667122975913764775L, this, new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Integer(i9), new Integer(i10), new Integer(i11)});
            }
            getData().idLine = i;
            getData().idStartColumn = i2;
            getData().idEndColumn = i3;
            getData().modifiersStartLine = i4;
            getData().modifiersStartColumn = i5;
            getData().modifierSendLine = i6;
            getData().modifierSendColumn = i7;
            getData().startLine = i8;
            getData().startColumn = i9;
            getData().endLine = i10;
            getData().endColumn = i11;
        } catch (Throwable th) {
            if (BT) {
                iy.rN(th, -2667122975913764775L, this, new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Integer(i9), new Integer(i10), new Integer(i11)});
            }
            throw th;
        }
    }

    @ey(method = 1190520660229327360L)
    public MapOfInt<Member> kf() {
        try {
            if (gW) {
                iy.gn(293320433309359800L, this);
            }
            eN();
            return getData().allExplicitMemberMethods;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 293320433309359800L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Type, com.aide.codemodel.api.Entity
    @ey(method = 10027595611258176L)
    public void load(StoreInputStream storeInputStream) {
        try {
            if (gW) {
                iy.tp(-1687355033002014528L, this, storeInputStream);
            }
            super.load(storeInputStream);
            this.namespace = (Namespace) this.space.getEntity(storeInputStream.readInt());
            this.id = storeInputStream.readInt();
            this.file = this.tp.getFileEntry(storeInputStream.readInt());
            this.declarationNumber = storeInputStream.readInt();
            this.topLevelClassType = (ClassType) this.space.getEntity(storeInputStream.readInt());
            this.enclosingClassType = (ClassType) this.space.getEntity(storeInputStream.readInt());
            this.identifier = storeInputStream.readInt();
            this.isModule = storeInputStream.readBoolean();
            this.isLocal = storeInputStream.readBoolean();
            this.isAnonymous = storeInputStream.readBoolean();
            this.typeParameterCount = storeInputStream.readInt();
            this.syntaxLoaded = storeInputStream.readBoolean();
            if (storeInputStream.readBoolean()) {
                Data data = new Data(null);
                this.data = data;
                data.syntaxLoaded = storeInputStream.readBoolean();
                this.data.typesLoaded = storeInputStream.readBoolean();
                this.data.modifiersStartLine = storeInputStream.readInt();
                this.data.modifiersStartColumn = storeInputStream.readInt();
                this.data.modifierSendLine = storeInputStream.readInt();
                this.data.modifierSendColumn = storeInputStream.readInt();
                this.data.startLine = storeInputStream.readInt();
                this.data.startColumn = storeInputStream.readInt();
                this.data.endLine = storeInputStream.readInt();
                this.data.endColumn = storeInputStream.readInt();
                this.data.idLine = storeInputStream.readInt();
                this.data.idStartColumn = storeInputStream.readInt();
                this.data.idEndColumn = storeInputStream.readInt();
                this.data.modifiers = storeInputStream.readInt();
                this.data.hasDocumentation = storeInputStream.readBoolean();
                this.data.hasSupertypes = storeInputStream.readBoolean();
                this.data.inStaticMethod = storeInputStream.readBoolean();
                this.data.superClasstypesLoaded = storeInputStream.readBoolean();
                this.data.superClasstypesLoading = storeInputStream.readBoolean();
                this.data.superTypesLoaded = storeInputStream.readBoolean();
                this.data.superTypesLoading = storeInputStream.readBoolean();
                this.data.cycliclyDefined = storeInputStream.readBoolean();
                this.data.corruptedSupertypes = storeInputStream.readBoolean();
                this.data.absoluteTypeParameterCount = storeInputStream.readInt();
                this.data.delegateOrEnumtype = (Type) this.space.getEntity(storeInputStream.readInt());
                if (storeInputStream.readBoolean()) {
                    this.data.superClasstypes = new ListOf<>(this.space, storeInputStream);
                }
                if (storeInputStream.readBoolean()) {
                    this.data.superTypes = new ListOf<>(this.space, storeInputStream);
                }
                if (storeInputStream.readBoolean()) {
                    this.data.allSuperClasstypes = new SetOf<>(this.space, storeInputStream);
                }
                if (storeInputStream.readBoolean()) {
                    this.data.allSuperTypes = new SetOf<>(this.space, storeInputStream);
                }
                if (storeInputStream.readBoolean()) {
                    this.data.allMemberClasstypes = new MapOfInt<>(this.space, storeInputStream);
                }
                if (storeInputStream.readBoolean()) {
                    this.data.allMemberTypes = new MapOfInt<>(this.space, storeInputStream);
                }
                if (storeInputStream.readBoolean()) {
                    this.data.memberClasstypes = new MapOfInt<>(this.space, storeInputStream);
                }
                if (storeInputStream.readBoolean()) {
                    this.data.memberParametertypes = new MapOfInt<>(this.space, storeInputStream);
                }
                if (storeInputStream.readBoolean()) {
                    this.data.typeParameters = new ListOf<>(this.space, storeInputStream);
                }
                if (storeInputStream.readBoolean()) {
                    this.data.absoluteTypeParameters = new ListOf<>(this.space, storeInputStream);
                }
                if (storeInputStream.readBoolean()) {
                    this.data.memberOperators = new MapOfInt<>(this.space, storeInputStream);
                }
                if (storeInputStream.readBoolean()) {
                    this.data.memberFields = new MapOfInt<>(this.space, storeInputStream);
                }
                if (storeInputStream.readBoolean()) {
                    this.data.memberMethods = new MapOfInt<>(this.space, storeInputStream);
                }
                if (storeInputStream.readBoolean()) {
                    this.data.memberConstructors = new SetOf<>(this.space, storeInputStream);
                }
                if (storeInputStream.readBoolean()) {
                    this.data.containingTypesOfMembers = new MapOf<>(this.space, storeInputStream);
                }
                if (storeInputStream.readBoolean()) {
                    this.data.allMemberFields = new MapOfInt<>(this.space, storeInputStream);
                }
                if (storeInputStream.readBoolean()) {
                    this.data.f1dx_ = new SetOf<>(this.space, storeInputStream);
                }
                if (storeInputStream.readBoolean()) {
                    this.data.allMemberMethods = new MapOfInt<>(this.space, storeInputStream);
                }
                if (storeInputStream.readBoolean()) {
                    this.data.allExplicitMemberMethods = new MapOfInt<>(this.space, storeInputStream);
                }
                if (storeInputStream.readBoolean()) {
                    this.data.allMemberOperators = new MapOfInt<>(this.space, storeInputStream);
                }
                if (storeInputStream.readBoolean()) {
                    this.data.f0I_ = new MapOfInt<>(this.space, storeInputStream);
                }
                if (storeInputStream.readBoolean()) {
                    this.data.inheritedMethodPairs = new ListOf<>(this.space, storeInputStream);
                }
                if (storeInputStream.readBoolean()) {
                    this.data.f2x9_ = new ListOf<>(this.space, storeInputStream);
                }
                if (storeInputStream.readBoolean()) {
                    this.data.Qq = new ListOfInt(storeInputStream);
                }
                if (storeInputStream.readBoolean()) {
                    this.data.sy = new ListOfInt(storeInputStream);
                }
            }
        } catch (Throwable th) {
            if (BT) {
                iy.j3(th, -1687355033002014528L, this, storeInputStream);
            }
            throw th;
        }
    }

    @ey(method = 5412967658723628640L)
    public void mb(int i, Member member) {
        try {
            if (gW) {
                iy.EQ(4729557515390472940L, this, new Integer(i), member);
            }
            getData().memberFields.insert(i, member);
        } catch (Throwable th) {
            if (BT) {
                iy.Mr(th, 4729557515390472940L, this, new Integer(i), member);
            }
            throw th;
        }
    }

    @ey(method = -2806967436165062919L)
    public ParameterType n5(int i) {
        try {
            if (gW) {
                iy.u7(-2192716879142298249L, this, i);
            }
            loadSyntax();
            if (getData().absoluteTypeParameterCount > i) {
                return (ParameterType) getData().absoluteTypeParameters.v5(i);
            }
            throw new e4();
        } catch (Throwable th) {
            if (BT) {
                iy.j3(th, -2192716879142298249L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2795895599325207280L)
    public Type oa(int i) {
        try {
            if (gW) {
                iy.u7(2899095865404093072L, this, i);
            }
            d8();
            return (Type) getData().superTypes.v5(i);
        } catch (Throwable th) {
            if (BT) {
                iy.j3(th, 2899095865404093072L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 507362752007605505L)
    public boolean oh() {
        try {
            if (gW) {
                iy.gn(-232485463591417493L, this);
            }
            loadSyntax();
            return (getData().modifiers & 67108864) != 0;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -232485463591417493L, this);
            }
            throw th;
        }
    }

    @ey(method = -3464903389229334268L)
    public boolean pl() {
        try {
            if (gW) {
                iy.gn(-3574064005324947792L, this);
            }
            return (getModifiers() & 64) != 0;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -3574064005324947792L, this);
            }
            throw th;
        }
    }

    @ey(method = -237467244153850992L)
    public void q7(Namespace namespace, int i, boolean z, int i2) {
        try {
            if (gW) {
                iy.J0(3431013666570357360L, this, namespace, new Integer(i), new Boolean(z), new Integer(i2));
            }
            this.identifier = i;
            this.namespace = namespace;
            this.topLevelClassType = this;
            this.enclosingClassType = this;
            this.isModule = z;
            this.typeParameterCount = i2;
        } catch (Throwable th) {
            if (BT) {
                iy.a8(th, 3431013666570357360L, this, namespace, new Integer(i), new Boolean(z), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 5041389069412433920L)
    public int qP() {
        try {
            if (gW) {
                iy.gn(-1292059421723399448L, this);
            }
            if (getData().superTypesLoading) {
                return 0;
            }
            d8();
            return getData().superTypes.EQ();
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -1292059421723399448L, this);
            }
            throw th;
        }
    }

    @ey(method = -430822189701765820L)
    public void qp(int i, int i2, ParameterType parameterType) {
        try {
            if (gW) {
                iy.we(-277123512336264264L, this, new Integer(i), new Integer(i2), parameterType);
            }
            getData().memberParametertypes.we(i2, parameterType);
            getData().typeParameters.u7(i, parameterType);
            getData().absoluteTypeParameters.u7((getData().absoluteTypeParameterCount - Pa()) + i, parameterType);
        } catch (Throwable th) {
            if (BT) {
                iy.U2(th, -277123512336264264L, this, new Integer(i), new Integer(i2), parameterType);
            }
            throw th;
        }
    }

    @ey(method = 5969368598376450000L)
    public MapOfInt<Type> sE() {
        try {
            if (gW) {
                iy.gn(-325431893835467392L, this);
            }
            d8();
            return getData().allMemberTypes;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -325431893835467392L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Type
    @ey(method = 983067299471855981L)
    public Type sG(FileEntry fileEntry, Language language, int i, boolean z, ClassType classType, SetOf<Member> setOf) {
        try {
            if (gW) {
                iy.QX(-6637511306923765653L, this, new Object[]{fileEntry, language, new Integer(i), new Boolean(z), classType, setOf});
            }
            eN();
            setOf.clear();
            MapOfInt<Member> mapOfInt = getData().allMemberFields;
            mapOfInt.DEFAULT_ITERATOR.init(i);
            while (mapOfInt.DEFAULT_ITERATOR.hasMoreElements()) {
                Member member = (Member) mapOfInt.DEFAULT_ITERATOR.nextValue();
                if (member.Nh(this, classType)) {
                    setOf.put(member);
                }
            }
            if (!setOf.v5()) {
                return this;
            }
            if (!z) {
                if (getData().aj == null) {
                    getData().aj = new MapOfInt<>(this.space);
                    getData().allMemberFields.DEFAULT_ITERATOR.DW();
                    while (getData().allMemberFields.DEFAULT_ITERATOR.hasMoreElements()) {
                        getData().aj.insert(this.we.QX(getData().allMemberFields.DEFAULT_ITERATOR.Hw()), (Member) getData().allMemberFields.DEFAULT_ITERATOR.nextValue());
                    }
                }
                int iQX = this.we.QX(i);
                MapOfInt<Member> mapOfInt2 = getData().aj;
                mapOfInt2.DEFAULT_ITERATOR.init(iQX);
                while (mapOfInt2.DEFAULT_ITERATOR.hasMoreElements()) {
                    Member member2 = (Member) mapOfInt2.DEFAULT_ITERATOR.nextValue();
                    if (member2.Nh(this, classType)) {
                        setOf.put(member2);
                    }
                }
            }
            if (setOf.v5()) {
                return null;
            }
            return this;
        } catch (Throwable th) {
            if (BT) {
                iy.rN(th, -6637511306923765653L, this, new Object[]{fileEntry, language, new Integer(i), new Boolean(z), classType, setOf});
            }
            throw th;
        }
    }

    @ey(method = -1120268546699165828L)
    public MapOfInt<Member> sM() {
        try {
            if (gW) {
                iy.gn(185075265921644592L, this);
            }
            loadSyntax();
            return getData().memberMethods;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 185075265921644592L, this);
            }
            throw th;
        }
    }

    @ey(method = -72232008082978961L)
    public boolean sT() {
        try {
            if (gW) {
                iy.gn(-3645258642759066079L, this);
            }
            om();
            return this.isAnonymous;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -3645258642759066079L, this);
            }
            throw th;
        }
    }

    @ey(method = 5927457560631098856L)
    public MapOfInt<Member> sg() {
        try {
            if (gW) {
                iy.gn(-4923938187394605540L, this);
            }
            eN();
            return getData().f0I_;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -4923938187394605540L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Type, com.aide.codemodel.api.Entity
    @ey(method = -7948864945775410740L)
    public void store(StoreOutputStream storeOutputStream) {
        try {
            if (gW) {
                iy.tp(-4902274333787730280L, this, storeOutputStream);
            }
            super.store(storeOutputStream);
            storeOutputStream.writeInt(this.space.getId(this.namespace));
            storeOutputStream.writeInt(this.id);
            storeOutputStream.writeInt(this.file.getId());
            storeOutputStream.writeInt(this.declarationNumber);
            storeOutputStream.writeInt(this.space.getId(this.topLevelClassType));
            storeOutputStream.writeInt(this.space.getId(this.enclosingClassType));
            storeOutputStream.writeInt(this.identifier);
            storeOutputStream.writeBoolean(this.isModule);
            storeOutputStream.writeBoolean(this.isLocal);
            storeOutputStream.writeBoolean(this.isAnonymous);
            storeOutputStream.writeInt(this.typeParameterCount);
            storeOutputStream.writeBoolean(this.syntaxLoaded);
            boolean z = true;
            storeOutputStream.writeBoolean(this.data != null);
            if (this.data != null) {
                storeOutputStream.writeBoolean(this.data.syntaxLoaded);
                storeOutputStream.writeBoolean(this.data.typesLoaded);
                storeOutputStream.writeInt(this.data.modifiersStartLine);
                storeOutputStream.writeInt(this.data.modifiersStartColumn);
                storeOutputStream.writeInt(this.data.modifierSendLine);
                storeOutputStream.writeInt(this.data.modifierSendColumn);
                storeOutputStream.writeInt(this.data.startLine);
                storeOutputStream.writeInt(this.data.startColumn);
                storeOutputStream.writeInt(this.data.endLine);
                storeOutputStream.writeInt(this.data.endColumn);
                storeOutputStream.writeInt(this.data.idLine);
                storeOutputStream.writeInt(this.data.idStartColumn);
                storeOutputStream.writeInt(this.data.idEndColumn);
                storeOutputStream.writeInt(this.data.modifiers);
                storeOutputStream.writeBoolean(this.data.hasDocumentation);
                storeOutputStream.writeBoolean(this.data.hasSupertypes);
                storeOutputStream.writeBoolean(this.data.inStaticMethod);
                storeOutputStream.writeBoolean(this.data.superClasstypesLoaded);
                storeOutputStream.writeBoolean(this.data.superClasstypesLoading);
                storeOutputStream.writeBoolean(this.data.superTypesLoaded);
                storeOutputStream.writeBoolean(this.data.superTypesLoading);
                storeOutputStream.writeBoolean(this.data.cycliclyDefined);
                storeOutputStream.writeBoolean(this.data.corruptedSupertypes);
                storeOutputStream.writeInt(this.data.absoluteTypeParameterCount);
                storeOutputStream.writeInt(this.space.getId(this.data.delegateOrEnumtype));
                storeOutputStream.writeBoolean(this.data.superClasstypes != null);
                if (this.data.superClasstypes != null) {
                    this.data.superClasstypes.store(storeOutputStream);
                }
                storeOutputStream.writeBoolean(this.data.superTypes != null);
                if (this.data.superTypes != null) {
                    this.data.superTypes.store(storeOutputStream);
                }
                storeOutputStream.writeBoolean(this.data.allSuperClasstypes != null);
                if (this.data.allSuperClasstypes != null) {
                    this.data.allSuperClasstypes.store(storeOutputStream);
                }
                storeOutputStream.writeBoolean(this.data.allSuperTypes != null);
                if (this.data.allSuperTypes != null) {
                    this.data.allSuperTypes.store(storeOutputStream);
                }
                storeOutputStream.writeBoolean(this.data.allMemberClasstypes != null);
                if (this.data.allMemberClasstypes != null) {
                    this.data.allMemberClasstypes.store(storeOutputStream);
                }
                storeOutputStream.writeBoolean(this.data.allMemberTypes != null);
                if (this.data.allMemberTypes != null) {
                    this.data.allMemberTypes.store(storeOutputStream);
                }
                storeOutputStream.writeBoolean(this.data.memberClasstypes != null);
                if (this.data.memberClasstypes != null) {
                    this.data.memberClasstypes.store(storeOutputStream);
                }
                storeOutputStream.writeBoolean(this.data.memberParametertypes != null);
                if (this.data.memberParametertypes != null) {
                    this.data.memberParametertypes.store(storeOutputStream);
                }
                storeOutputStream.writeBoolean(this.data.typeParameters != null);
                if (this.data.typeParameters != null) {
                    this.data.typeParameters.store(storeOutputStream);
                }
                storeOutputStream.writeBoolean(this.data.absoluteTypeParameters != null);
                if (this.data.absoluteTypeParameters != null) {
                    this.data.absoluteTypeParameters.store(storeOutputStream);
                }
                storeOutputStream.writeBoolean(this.data.memberOperators != null);
                if (this.data.memberOperators != null) {
                    this.data.memberOperators.store(storeOutputStream);
                }
                storeOutputStream.writeBoolean(this.data.memberFields != null);
                if (this.data.memberFields != null) {
                    this.data.memberFields.store(storeOutputStream);
                }
                storeOutputStream.writeBoolean(this.data.memberMethods != null);
                if (this.data.memberMethods != null) {
                    this.data.memberMethods.store(storeOutputStream);
                }
                storeOutputStream.writeBoolean(this.data.memberConstructors != null);
                if (this.data.memberConstructors != null) {
                    this.data.memberConstructors.store(storeOutputStream);
                }
                storeOutputStream.writeBoolean(this.data.containingTypesOfMembers != null);
                if (this.data.containingTypesOfMembers != null) {
                    this.data.containingTypesOfMembers.store(storeOutputStream);
                }
                storeOutputStream.writeBoolean(this.data.allMemberFields != null);
                if (this.data.allMemberFields != null) {
                    this.data.allMemberFields.store(storeOutputStream);
                }
                storeOutputStream.writeBoolean(this.data.f1dx_ != null);
                if (this.data.f1dx_ != null) {
                    this.data.f1dx_.store(storeOutputStream);
                }
                storeOutputStream.writeBoolean(this.data.allMemberMethods != null);
                if (this.data.allMemberMethods != null) {
                    this.data.allMemberMethods.store(storeOutputStream);
                }
                storeOutputStream.writeBoolean(this.data.allExplicitMemberMethods != null);
                if (this.data.allExplicitMemberMethods != null) {
                    this.data.allExplicitMemberMethods.store(storeOutputStream);
                }
                storeOutputStream.writeBoolean(this.data.allMemberOperators != null);
                if (this.data.allMemberOperators != null) {
                    this.data.allMemberOperators.store(storeOutputStream);
                }
                storeOutputStream.writeBoolean(this.data.f0I_ != null);
                if (this.data.f0I_ != null) {
                    this.data.f0I_.store(storeOutputStream);
                }
                storeOutputStream.writeBoolean(this.data.inheritedMethodPairs != null);
                if (this.data.inheritedMethodPairs != null) {
                    this.data.inheritedMethodPairs.store(storeOutputStream);
                }
                storeOutputStream.writeBoolean(this.data.f2x9_ != null);
                if (this.data.f2x9_ != null) {
                    this.data.f2x9_.store(storeOutputStream);
                }
                storeOutputStream.writeBoolean(this.data.Qq != null);
                if (this.data.Qq != null) {
                    this.data.Qq.store(storeOutputStream);
                }
                if (this.data.sy == null) {
                    z = false;
                }
                storeOutputStream.writeBoolean(z);
                if (this.data.sy != null) {
                    this.data.sy.store(storeOutputStream);
                }
            }
        } catch (Throwable th) {
            if (BT) {
                iy.j3(th, -4902274333787730280L, this, storeOutputStream);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = 1204387020525491040L)
    public String u7() {
        try {
            if (gW) {
                iy.gn(327975544989678720L, this);
            }
            return super.u7();
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 327975544989678720L, this);
            }
            throw th;
        }
    }

    @ey(method = 17992506458379489L)
    public Type u9() {
        try {
            if (gW) {
                iy.gn(53812091040835635L, this);
            }
            int absoluteParametertypeCount = getAbsoluteParametertypeCount();
            if (absoluteParametertypeCount == 0) {
                return this;
            }
            try {
                Type[] typeArr = new Type[absoluteParametertypeCount];
                int[] iArr = new int[absoluteParametertypeCount];
                for (int i = 0; i < absoluteParametertypeCount; i++) {
                    typeArr[i] = n5(i);
                    iArr[i] = 0;
                }
                return this.space.AL(this, typeArr, iArr);
            } catch (e4 unused) {
                return this;
            }
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 53812091040835635L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = 2690556344074989117L)
    public int v5() {
        try {
            if (gW) {
                iy.gn(1761710104288077531L, this);
            }
            this.space.Cz(getFile(), getLanguage());
            return getData().endColumn;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 1761710104288077531L, this);
            }
            throw th;
        }
    }

    @ey(method = -2089736354634028877L)
    public boolean xg() {
        try {
            if (gW) {
                iy.gn(3703485636027864785L, this);
            }
            if (isToplevel()) {
                return false;
            }
            MapOfInt<ClassType> mapOfIntE9 = getEnclosingClassType().e9();
            mapOfIntE9.DEFAULT_ITERATOR.init(getIdentifier());
            while (mapOfIntE9.DEFAULT_ITERATOR.hasMoreElements()) {
                if (mapOfIntE9.DEFAULT_ITERATOR.nextValue() != this) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 3703485636027864785L, this);
            }
            throw th;
        }
    }

    @ey(method = -2900662426469729311L)
    public ClassType ys() {
        try {
            if (gW) {
                iy.gn(-759308814055261877L, this);
            }
            om();
            return this.topLevelClassType;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -759308814055261877L, this);
            }
            throw th;
        }
    }

    @ey(method = -808983824336781072L)
    public void zh(ClassType classType) {
        try {
            if (gW) {
                iy.tp(-423224038328581620L, this, classType);
            }
            getData().superClasstypes.j6(classType);
        } catch (Throwable th) {
            if (BT) {
                iy.j3(th, -423224038328581620L, this, classType);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 1453843281090240261L)
    public ClassType(EntitySpace entitySpace, FileSpace fileSpace, IdentifierSpace identifierSpace, FileEntry fileEntry, Language language, int i, int i2) {
        super(fileSpace, entitySpace, i2);
        try {
            if (gW) {
                iy.QX(476401143243495839L, null, new Object[]{entitySpace, fileSpace, identifierSpace, fileEntry, language, new Integer(i), new Integer(i2)});
            }
            this.tp = fileSpace;
            this.space = entitySpace;
            this.we = identifierSpace;
            this.id = entitySpace.declareEntity(this);
            this.file = fileEntry;
            this.declarationNumber = i;
            j6(language);
        } catch (Throwable th) {
            if (BT) {
                iy.rN(th, 476401143243495839L, null, new Object[]{entitySpace, fileSpace, identifierSpace, fileEntry, language, new Integer(i), new Integer(i2)});
            }
            throw th;
        }
    }
}
