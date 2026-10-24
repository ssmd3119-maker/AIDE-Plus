package com.aide.codemodel.api;

import abcd.cy;
import abcd.dy;
import abcd.e4;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.codemodel.api.abstraction.Language;
import com.aide.codemodel.api.collections.SetOf;
import com.aide.codemodel.api.collections.StoreInputStream;
import com.aide.codemodel.api.collections.StoreOutputStream;

@cy(clazz = -4577603281820369208L, container = -4577603281820369208L, user = true)
/* loaded from: classes.dex */
public class Type extends Entity {

    @fy
    private static /* synthetic */ boolean gn;

    @gy
    private static /* synthetic */ boolean u7;

    @dy(field = 108073525200960352L)
    private int semantic;

    @dy(field = -1541761228820740032L)
    private final EntitySpace space;

    static {
        iy.Zo(Type.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 1136331645086119440L)
    public Type(FileSpace fileSpace, EntitySpace entitySpace, int i) {
        super(fileSpace, entitySpace);
        try {
            if (gn) {
                iy.we(396193940350913493L, null, fileSpace, entitySpace, new Integer(i));
            }
            this.space = entitySpace;
            this.semantic = i;
        } catch (Throwable th) {
            if (u7) {
                iy.U2(th, 396193940350913493L, null, fileSpace, entitySpace, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 621949055352558272L)
    public Type Qq() {
        try {
            if (gn) {
                iy.gn(962144518704111269L, this);
            }
            if (!containsVariable()) {
                return this;
            }
            if (isMethodParameterTypeVariable()) {
                return ((MethodParameterTypeVariable) this).FN().x9();
            }
            if (isArrayType()) {
                return this.space.hz(((ArrayType) this).getElementType().Qq(), ((ArrayType) this).jO());
            }
            if (!isParameterizedType()) {
                return this;
            }
            Type[] absoluteArgumentTypes = ((ParameterizedType) this).getAbsoluteArgumentTypes();
            int[] absoluteArgumentVariances = ((ParameterizedType) this).getAbsoluteArgumentVariances();
            Type[] typeArr = new Type[absoluteArgumentTypes.length];
            for (int i = 0; i < absoluteArgumentTypes.length; i++) {
                typeArr[i] = absoluteArgumentTypes[i].Qq();
            }
            return this.space.AL(((ParameterizedType) this).getClassType(), typeArr, absoluteArgumentVariances);
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, 962144518704111269L, this);
            }
            throw th;
        }
    }

    @ey(method = 675263013904733705L)
    public Type Sf(FileEntry fileEntry, Language language, int i, boolean z, ClassType classType, SetOf<Member> setOf) throws Throwable {
        Type typeSf;
        Type typeSf2;
        char c = 5;
        int i2 = 4;
        try {
            if (gn) {
                iy.QX(-1037000693900011832L, this, new Object[]{fileEntry, language, new Integer(i), new Boolean(z), classType, setOf});
            }
            setOf.clear();
            try {
                if (isParameterizedType()) {
                    if (((ParameterizedType) this).getClassType().Sf(fileEntry, language, i, z, classType, setOf) == null) {
                        return null;
                    }
                    return this;
                }
                if (isArrayType()) {
                    ClassType classTypeXa = this.space.Xa(fileEntry, language);
                    return classTypeXa.Sf(fileEntry, language, i, z, classTypeXa, setOf);
                }
                if (isParameterType()) {
                    if (((ParameterType) this).ye() == 1) {
                        return x9().Sf(fileEntry, language, i, z, classType, setOf);
                    }
                    for (int i3 = 0; i3 < ((ParameterType) this).ye(); i3++) {
                        try {
                            typeSf2 = ((ParameterType) this).Ev(i3).Sf(fileEntry, language, i, z, classType, setOf);
                        } catch (e4 unused) {
                        }
                        if (typeSf2 != null) {
                            return typeSf2;
                        }
                    }
                } else if (isMethodParameterType()) {
                    if (((MethodParameterType) this).ye() == 1) {
                        return x9().Sf(fileEntry, language, i, z, classType, setOf);
                    }
                    for (int i4 = 0; i4 < ((MethodParameterType) this).ye(); i4++) {
                        try {
                            typeSf = ((MethodParameterType) this).ko(i4).Sf(fileEntry, language, i, z, classType, setOf);
                        } catch (e4 unused2) {
                        }
                        if (typeSf != null) {
                            return typeSf;
                        }
                    }
                } else if (isMethodParameterTypeVariable()) {
                    return ((MethodParameterTypeVariable) this).FN().Sf(fileEntry, language, i, z, classType, setOf);
                }
                return null;
            } catch (Throwable th) {
                th = th;
                if (u7) {
                    Object[] objArr = new Object[i2];
                    objArr[0] = fileEntry;
                    objArr[c] = language;
                    objArr[2] = new Integer(i);
                    objArr[3] = new Boolean(z);
                    objArr[4] = classType;
                    objArr[5] = setOf;
                    iy.rN(th, -1037000693900011832L, this, objArr);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c = 1;
            i2 = 6;
        }
    }

    @ey(method = 1756554033535852584L)
    public boolean XX(Type type) {
        try {
            if (gn) {
                iy.tp(-1047988397835713675L, this, type);
            }
            if (this == type) {
                return true;
            }
            if (getSemantic() != 16 && getSemantic() == type.getSemantic()) {
                return true;
            }
            if (!isArrayType() || !type.isArrayType()) {
                return false;
            }
            ArrayType arrayType = (ArrayType) this;
            ArrayType arrayType2 = (ArrayType) type;
            if (arrayType.jO() == arrayType2.jO()) {
                return arrayType.getElementType().XX(arrayType2.getElementType());
            }
            return false;
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -1047988397835713675L, this, type);
            }
            throw th;
        }
    }

    @ey(method = 3126903759130441907L)
    public Type aq(Member member, Member member2) {
        try {
            if (gn) {
                iy.EQ(-3643506772391069280L, this, member, member2);
            }
            if (isMethodParameterType()) {
                MethodParameterType methodParameterType = (MethodParameterType) this;
                if (methodParameterType.WB() == member2) {
                    return methodParameterType.fY(member);
                }
            } else {
                if (isArrayType()) {
                    return this.space.hz(((ArrayType) this).getElementType().aq(member, member2), ((ArrayType) this).jO());
                }
                if (isParameterizedType()) {
                    Type[] absoluteArgumentTypes = ((ParameterizedType) this).getAbsoluteArgumentTypes();
                    int[] absoluteArgumentVariances = ((ParameterizedType) this).getAbsoluteArgumentVariances();
                    Type[] typeArr = new Type[absoluteArgumentTypes.length];
                    for (int i = 0; i < absoluteArgumentTypes.length; i++) {
                        typeArr[i] = absoluteArgumentTypes[i].aq(member, member2);
                    }
                    return this.space.AL(((ParameterizedType) this).getClassType(), typeArr, absoluteArgumentVariances);
                }
            }
            return this;
        } catch (Throwable th) {
            if (u7) {
                iy.Mr(th, -3643506772391069280L, this, member, member2);
            }
            throw th;
        }
    }

    @ey(method = -3893212884401208011L)
    public Type ca(FileEntry fileEntry, Language language, Type type) {
        try {
            if (gn) {
                iy.we(-2010235859923054200L, this, fileEntry, language, type);
            }
            if ((!isClassType() && !isParameterizedType()) || (!type.isClassType() && !type.isParameterizedType())) {
                return this.space.getRootClasstype(fileEntry, language);
            }
            ClassType rootClasstype = this.space.getRootClasstype(fileEntry, language);
            SetOf<ClassType> setOfFN = ((ClassType) x9()).fN();
            SetOf<ClassType> setOfFN2 = ((ClassType) type.x9()).fN();
            setOfFN.DEFAULT_ITERATOR.init();
            Type type2 = rootClasstype;
            while (setOfFN.DEFAULT_ITERATOR.hasMoreElements()) {
                ClassType classType = (ClassType) setOfFN.DEFAULT_ITERATOR.nextKey();
                if (setOfFN2.contains(classType) && (classType.fN().contains(type2) || (type2.isInterfaceType() && !classType.isInterfaceType() && classType != rootClasstype))) {
                    type2 = classType;
                }
            }
            SetOf<Type> allSuperTypes = isParameterizedType() ? ((ParameterizedType) this).getAllSuperTypes() : ((ClassType) this).getAllSuperTypes();
            SetOf<Type> allSuperTypes2 = isParameterizedType() ? ((ParameterizedType) this).getAllSuperTypes() : ((ClassType) this).getAllSuperTypes();
            allSuperTypes.DEFAULT_ITERATOR.init();
            while (allSuperTypes.DEFAULT_ITERATOR.hasMoreElements()) {
                Type type3 = (Type) allSuperTypes.DEFAULT_ITERATOR.nextKey();
                if (type3.x9() == type2 && type.isImplicitConvertibleTo(fileEntry, language, type3)) {
                    type2 = type3;
                }
            }
            allSuperTypes2.DEFAULT_ITERATOR.init();
            while (allSuperTypes2.DEFAULT_ITERATOR.hasMoreElements()) {
                Type type4 = (Type) allSuperTypes2.DEFAULT_ITERATOR.nextKey();
                if (type4.x9() == type2 && isImplicitConvertibleTo(fileEntry, language, type4)) {
                    type2 = type4;
                }
            }
            return (isParameterizedType() && type.isParameterizedType() && type2.isClassType() && ((ClassType) type2).Pa() > 0) ? this.space.getRootClasstype(fileEntry, language) : type2;
        } catch (Throwable th) {
            if (u7) {
                iy.U2(th, -2010235859923054200L, this, fileEntry, language, type);
            }
            throw th;
        }
    }

    @ey(method = 1483337711402494500L)
    public boolean containsType(Type type) {
        try {
            if (gn) {
                iy.tp(-2954892805335229759L, this, type);
            }
            if (this == type) {
                return true;
            }
            if (isArrayType()) {
                return ((ArrayType) this).getElementType().containsType(type);
            }
            if (isParameterizedType()) {
                for (Type type2 : ((ParameterizedType) this).getAbsoluteArgumentTypes()) {
                    if (type2.containsType(type)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -2954892805335229759L, this, type);
            }
            throw th;
        }
    }

    @ey(method = -5273815689835234368L)
    public boolean containsVariable() {
        try {
            if (gn) {
                iy.gn(4564526607867477375L, this);
            }
            if (isMethodParameterTypeVariable()) {
                return true;
            }
            if (isArrayType()) {
                return ((ArrayType) this).getElementType().containsVariable();
            }
            if (isParameterizedType()) {
                for (Type type : ((ParameterizedType) this).getAbsoluteArgumentTypes()) {
                    if (type.containsVariable()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, 4564526607867477375L, this);
            }
            throw th;
        }
    }

    @ey(method = -843555020340795024L)
    public Type dx(ClassType classType, SetOf<Member> setOf) {
        try {
            if (gn) {
                iy.EQ(328285255180400935L, this, classType, setOf);
            }
            if (!isParameterizedType()) {
                return null;
            }
            if (((ParameterizedType) this).getClassType().dx(classType, setOf) == null) {
                return null;
            }
            return this;
        } catch (Throwable th) {
            if (u7) {
                iy.Mr(th, 328285255180400935L, this, classType, setOf);
            }
            throw th;
        }
    }

    @ey(method = -110796714866836999L)
    public Type ef(int i, boolean z, int i2, Entity entity, FileEntry fileEntry, Language language) throws Throwable {
        char c = 5;
        int i3 = 4;
        try {
            if (gn) {
                iy.QX(-7894368560949483272L, this, new Object[]{new Integer(i), new Boolean(z), new Integer(i2), entity, fileEntry, language});
            }
            try {
                if (isClassType()) {
                    return ((ClassType) this).FN(i, z, i2, entity, fileEntry, language);
                }
                if (isParameterizedType()) {
                    return ((ParameterizedType) this).ef(i, z, i2, entity, fileEntry, language);
                }
                if (isParameterType()) {
                    return ((ParameterType) this).ye() == 1 ? x9().ef(i, z, i2, entity, fileEntry, language) : this.space.getRootClasstype(fileEntry, language).ef(i, z, i2, entity, fileEntry, language);
                }
                if (isMethodParameterType()) {
                    return ((MethodParameterType) this).ye() == 1 ? x9().ef(i, z, i2, entity, fileEntry, language) : this.space.getRootClasstype(fileEntry, language).ef(i, z, i2, entity, fileEntry, language);
                }
                throw new e4();
            } catch (Throwable th) {
                th = th;
                if (u7) {
                    Object[] objArr = new Object[i3];
                    objArr[0] = new Integer(i);
                    objArr[c] = new Boolean(z);
                    objArr[2] = new Integer(i2);
                    objArr[3] = entity;
                    objArr[4] = fileEntry;
                    objArr[5] = language;
                    iy.rN(th, -7894368560949483272L, this, objArr);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c = 1;
            i3 = 6;
        }
    }

    @ey(method = 1007173858718143779L)
    public boolean et() {
        try {
            if (gn) {
                iy.gn(3786484008820160320L, this);
            }
            if (isClassType()) {
                if (((ClassType) this).Pa() > 0) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, 3786484008820160320L, this);
            }
            throw th;
        }
    }

    @ey(method = -3581308057267786432L)
    public Type g3(FileEntry fileEntry, Language language, int i, boolean z, ClassType classType, SetOf<Member> setOf) throws Throwable {
        int i2;
        Type superType;
        try {
            if (gn) {
                iy.QX(-2011361891969323907L, this, new Object[]{fileEntry, language, new Integer(i), new Boolean(z), classType, setOf});
            }
            try {
                superType = getSuperType();
                i2 = 6;
            } catch (e4 unused) {
            }
            try {
                superType.Sf(fileEntry, language, i, z, (ClassType) superType.x9(), setOf);
                return this;
            } catch (Throwable th) {
                th = th;
                if (u7) {
                    Object[] objArr = new Object[i2];
                    objArr[0] = fileEntry;
                    objArr[1] = language;
                    objArr[2] = new Integer(i);
                    objArr[3] = new Boolean(z);
                    objArr[4] = classType;
                    objArr[5] = setOf;
                    iy.rN(th, -2011361891969323907L, this, objArr);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i2 = 6;
        }
    }

    @ey(method = -792878854484583693L)
    public int getSemantic() {
        try {
            if (gn) {
                iy.gn(2793893587266670400L, this);
            }
            return this.semantic;
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, 2793893587266670400L, this);
            }
            throw th;
        }
    }

    @ey(method = -2708267011003750664L)
    public Type getSuperType() {
        try {
            if (gn) {
                iy.gn(-2240802841791857409L, this);
            }
            if (isParameterizedType()) {
                return ((ParameterizedType) this).replaceType(((ParameterizedType) this).getClassType().getSuperType());
            }
            throw new e4();
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, -2240802841791857409L, this);
            }
            throw th;
        }
    }

    @ey(method = -361804487936549360L)
    public boolean hz(Type type, Member member, Member member2) {
        try {
            if (gn) {
                iy.we(-2980722199022127L, this, type, member, member2);
            }
            if (this == type) {
                return true;
            }
            if (!isMethodParameterType() || !type.isMethodParameterType()) {
                if (isArrayType() && type.isArrayType()) {
                    if (((ArrayType) this).jO() != ((ArrayType) type).jO()) {
                        return false;
                    }
                    return ((ArrayType) this).getElementType().hz(((ArrayType) type).getElementType(), member, member2);
                }
                if (!isParameterizedType() || !type.isParameterizedType() || !((ParameterizedType) this).getClassType().Ej(((ParameterizedType) type).getClassType())) {
                    return false;
                }
                Type[] absoluteArgumentTypes = ((ParameterizedType) this).getAbsoluteArgumentTypes();
                Type[] absoluteArgumentTypes2 = ((ParameterizedType) type).getAbsoluteArgumentTypes();
                for (int i = 0; i < absoluteArgumentTypes.length; i++) {
                    if (!absoluteArgumentTypes[i].kQ(absoluteArgumentTypes2[i], member, member2)) {
                        return false;
                    }
                }
                return true;
            }
            if (((MethodParameterType) this).WB() == member && ((MethodParameterType) type).WB() == member2 && ((MethodParameterType) this).mb() == ((MethodParameterType) type).mb()) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            if (u7) {
                iy.U2(th, -2980722199022127L, this, type, member, member2);
            }
            throw th;
        }
    }

    @ey(method = 4535635469398770048L)
    public boolean isDelegateType() {
        try {
            if (!gn) {
                return false;
            }
            iy.gn(18459360761337573L, this);
            return false;
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, 18459360761337573L, this);
            }
            throw th;
        }
    }

    @ey(method = 2650569874833915640L)
    public boolean isEnumType() {
        try {
            if (!gn) {
                return false;
            }
            iy.gn(2671559309092425915L, this);
            return false;
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, 2671559309092425915L, this);
            }
            throw th;
        }
    }

    @ey(method = -1638742249982741000L)
    public boolean isImplicitConvertibleTo(FileEntry fileEntry, Language language, Type type) {
        try {
            if (gn) {
                iy.we(-73380670447637785L, this, fileEntry, language, type);
            }
            return this.space.iW(fileEntry, language, this, type);
        } catch (Throwable th) {
            if (u7) {
                iy.U2(th, -73380670447637785L, this, fileEntry, language, type);
            }
            throw th;
        }
    }

    @ey(method = -4946880971237828896L)
    public boolean isInterfaceType() {
        try {
            if (!gn) {
                return false;
            }
            iy.gn(5573383900168181461L, this);
            return false;
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, 5573383900168181461L, this);
            }
            throw th;
        }
    }

    @ey(method = 4882576225621755975L)
    public boolean isReferable(FileEntry fileEntry, Language language) {
        try {
            if (gn) {
                iy.EQ(2903552185441332528L, this, fileEntry, language);
            }
            if (getFile() != null) {
                return getFile().isReferable(fileEntry);
            }
            return true;
        } catch (Throwable th) {
            if (u7) {
                iy.Mr(th, 2903552185441332528L, this, fileEntry, language);
            }
            throw th;
        }
    }

    @ey(method = -3019031292008390209L)
    public boolean isSealedType() {
        try {
            if (!gn) {
                return false;
            }
            iy.gn(-2544422229701644464L, this);
            return false;
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, -2544422229701644464L, this);
            }
            throw th;
        }
    }

    @ey(method = 8647158677775948432L)
    public boolean isSubTypeOf(FileEntry fileEntry, Language language, Type type) {
        try {
            if (gn) {
                iy.we(-4624206117923033733L, this, fileEntry, language, type);
            }
            SetOf<Type> allSuperTypes = isClassType() ? ((ClassType) this).getAllSuperTypes() : ((ParameterizedType) this).getAllSuperTypes();
            if (allSuperTypes.contains(type)) {
                return true;
            }
            allSuperTypes.DEFAULT_ITERATOR.init();
            while (allSuperTypes.DEFAULT_ITERATOR.hasMoreElements()) {
                try {
                    Type type2 = (Type) allSuperTypes.DEFAULT_ITERATOR.nextKey();
                    if (type2.isParameterizedType() && type.isParameterizedType() && ((ParameterizedType) type2).getClassType() == ((ParameterizedType) type).getClassType()) {
                        int[] absoluteArgumentVariances = ((ParameterizedType) type2).getAbsoluteArgumentVariances();
                        int[] absoluteArgumentVariances2 = ((ParameterizedType) type).getAbsoluteArgumentVariances();
                        Type[] absoluteArgumentTypes = ((ParameterizedType) type2).getAbsoluteArgumentTypes();
                        Type[] absoluteArgumentTypes2 = ((ParameterizedType) type).getAbsoluteArgumentTypes();
                        for (int i = 0; i < absoluteArgumentVariances2.length; i++) {
                            int i2 = absoluteArgumentVariances[i];
                            if (i2 == 0) {
                                int i3 = absoluteArgumentVariances2[i];
                                if (i3 == 0) {
                                    if (!absoluteArgumentTypes[i].XX(absoluteArgumentTypes2[i])) {
                                        return false;
                                    }
                                } else if (i3 == 1 || i3 == 2) {
                                    if (!absoluteArgumentTypes[i].isImplicitConvertibleTo(fileEntry, language, absoluteArgumentTypes2[i])) {
                                        return false;
                                    }
                                } else if (i3 == 3 && !absoluteArgumentTypes2[i].isImplicitConvertibleTo(fileEntry, language, absoluteArgumentTypes[i])) {
                                    return false;
                                }
                            } else {
                                if (i2 == 1) {
                                    int i4 = absoluteArgumentVariances2[i];
                                    if (i4 != 0) {
                                        if (i4 != 2) {
                                            if (i4 == 3) {
                                                return false;
                                            }
                                        } else if (!absoluteArgumentTypes[i].isImplicitConvertibleTo(fileEntry, language, absoluteArgumentTypes2[i])) {
                                        }
                                    }
                                    return false;
                                }
                                if (i2 == 2) {
                                    int i5 = absoluteArgumentVariances2[i];
                                    if (i5 != 0) {
                                        if (i5 != 1 && i5 != 2) {
                                            if (i5 == 3) {
                                                return false;
                                            }
                                        } else if (!absoluteArgumentTypes[i].isImplicitConvertibleTo(fileEntry, language, absoluteArgumentTypes2[i])) {
                                        }
                                    }
                                    return false;
                                }
                                if (i2 == 3) {
                                    int i6 = absoluteArgumentVariances2[i];
                                    if (i6 != 0) {
                                        if (i6 == 1 || i6 == 2) {
                                            if (absoluteArgumentTypes2[i] != this.space.getRootClasstype(fileEntry, language)) {
                                            }
                                        } else if (i6 == 3 && !absoluteArgumentTypes2[i].isImplicitConvertibleTo(fileEntry, language, absoluteArgumentTypes[i])) {
                                            return false;
                                        }
                                    }
                                    return false;
                                }
                            }
                        }
                        return true;
                    }
                } catch (e4 unused) {
                }
            }
            return false;
        } catch (Throwable th) {
            if (u7) {
                iy.U2(th, -4624206117923033733L, this, fileEntry, language, type);
            }
            throw th;
        }
    }

    @ey(method = 6250304973454746552L)
    public boolean kQ(Type type, Member member, Member member2) {
        try {
            if (gn) {
                iy.we(-2150863138186846175L, this, type, member, member2);
            }
            if (XX(type)) {
                return true;
            }
            if (!isMethodParameterType() || !type.isMethodParameterType()) {
                if (isArrayType() && type.isArrayType()) {
                    return ((ArrayType) this).getElementType().kQ(((ArrayType) type).getElementType(), member, member2);
                }
                if (!isParameterizedType() || !type.isParameterizedType() || ((ParameterizedType) this).getClassType() != ((ParameterizedType) type).getClassType()) {
                    return false;
                }
                Type[] absoluteArgumentTypes = ((ParameterizedType) this).getAbsoluteArgumentTypes();
                Type[] absoluteArgumentTypes2 = ((ParameterizedType) type).getAbsoluteArgumentTypes();
                for (int i = 0; i < absoluteArgumentTypes.length; i++) {
                    if (!absoluteArgumentTypes[i].kQ(absoluteArgumentTypes2[i], member, member2)) {
                        return false;
                    }
                }
                return true;
            }
            if (((MethodParameterType) this).WB() == member && ((MethodParameterType) type).WB() == member2 && ((MethodParameterType) this).mb() == ((MethodParameterType) type).mb()) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            if (u7) {
                iy.U2(th, -2150863138186846175L, this, type, member, member2);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = 6550923602133858605L)
    public void load(StoreInputStream storeInputStream) {
        try {
            if (gn) {
                iy.tp(-4110764438232284324L, this, storeInputStream);
            }
            super.load(storeInputStream);
            this.semantic = storeInputStream.readInt();
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -4110764438232284324L, this, storeInputStream);
            }
            throw th;
        }
    }

    @ey(method = -4826531260348664685L)
    public boolean lp() {
        try {
            if (gn) {
                iy.gn(5689566381993643940L, this);
            }
            if (!isParameterizedType()) {
                return false;
            }
            for (int i : ((ParameterizedType) this).getAbsoluteArgumentVariances()) {
                if (i != 1) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, 5689566381993643940L, this);
            }
            throw th;
        }
    }

    @ey(method = -16210040275732704L)
    public Type sG(FileEntry fileEntry, Language language, int i, boolean z, ClassType classType, SetOf<Member> setOf) throws Throwable {
        Type typeSG;
        Type typeSG2;
        char c = 5;
        int i2 = 4;
        try {
            if (gn) {
                iy.QX(7621775829524722255L, this, new Object[]{fileEntry, language, new Integer(i), new Boolean(z), classType, setOf});
            }
            setOf.clear();
            try {
                if (isParameterizedType()) {
                    if (((ParameterizedType) this).getClassType().sG(fileEntry, language, i, z, classType, setOf) == null) {
                        return null;
                    }
                    return this;
                }
                if (isArrayType()) {
                    ClassType classTypeXa = this.space.Xa(fileEntry, language);
                    return classTypeXa.sG(fileEntry, language, i, z, classTypeXa, setOf);
                }
                if (isParameterType()) {
                    if (((ParameterType) this).ye() == 1) {
                        return x9().sG(fileEntry, language, i, z, classType, setOf);
                    }
                    for (int i3 = 0; i3 < ((ParameterType) this).ye(); i3++) {
                        try {
                            typeSG2 = ((ParameterType) this).Ev(i3).sG(fileEntry, language, i, z, classType, setOf);
                        } catch (e4 unused) {
                        }
                        if (typeSG2 != null) {
                            return typeSG2;
                        }
                    }
                } else if (isMethodParameterType()) {
                    if (((MethodParameterType) this).ye() == 1) {
                        return x9().sG(fileEntry, language, i, z, classType, setOf);
                    }
                    for (int i4 = 0; i4 < ((MethodParameterType) this).ye(); i4++) {
                        try {
                            typeSG = ((MethodParameterType) this).ko(i4).sG(fileEntry, language, i, z, classType, setOf);
                        } catch (e4 unused2) {
                        }
                        if (typeSG != null) {
                            return typeSG;
                        }
                    }
                } else if (isMethodParameterTypeVariable()) {
                    return ((MethodParameterTypeVariable) this).FN().sG(fileEntry, language, i, z, classType, setOf);
                }
                return null;
            } catch (Throwable th) {
                th = th;
                if (u7) {
                    Object[] objArr = new Object[i2];
                    objArr[0] = fileEntry;
                    objArr[c] = language;
                    objArr[2] = new Integer(i);
                    objArr[3] = new Boolean(z);
                    objArr[4] = classType;
                    objArr[5] = setOf;
                    iy.rN(th, 7621775829524722255L, this, objArr);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c = 1;
            i2 = 6;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = 7553165345952777625L)
    public void store(StoreOutputStream storeOutputStream) {
        try {
            if (gn) {
                iy.tp(-4439326592595176344L, this, storeOutputStream);
            }
            super.store(storeOutputStream);
            storeOutputStream.writeInt(this.semantic);
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -4439326592595176344L, this, storeOutputStream);
            }
            throw th;
        }
    }

    @ey(method = -3552191037621579615L)
    public String toString() {
        try {
            if (gn) {
                iy.gn(1657582695435195636L, this);
            }
            return getFullyQualifiedNameString();
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, 1657582695435195636L, this);
            }
            throw th;
        }
    }

    @ey(method = 1031290569970314005L)
    public Type vJ(FileEntry fileEntry, Language language, int i, boolean z, ClassType classType, SetOf<Member> setOf) throws Throwable {
        int i2;
        Type superType;
        try {
            if (gn) {
                iy.QX(101381141870867136L, this, new Object[]{fileEntry, language, new Integer(i), new Boolean(z), classType, setOf});
            }
            try {
                superType = getSuperType();
                i2 = 6;
            } catch (e4 unused) {
            }
            try {
                superType.sG(fileEntry, language, i, z, (ClassType) superType.x9(), setOf);
                return this;
            } catch (Throwable th) {
                th = th;
                if (u7) {
                    Object[] objArr = new Object[i2];
                    objArr[0] = fileEntry;
                    objArr[1] = language;
                    objArr[2] = new Integer(i);
                    objArr[3] = new Boolean(z);
                    objArr[4] = classType;
                    objArr[5] = setOf;
                    iy.rN(th, 101381141870867136L, this, objArr);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i2 = 6;
        }
    }

    @ey(method = 2605921816002247904L)
    public boolean wc() {
        try {
            if (gn) {
                iy.gn(-5547227514440503725L, this);
            }
            if (isParameterizedType()) {
                for (int i : ((ParameterizedType) this).getAbsoluteArgumentVariances()) {
                    if (i != 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, -5547227514440503725L, this);
            }
            throw th;
        }
    }

    @ey(method = 1722090731601986683L)
    public Type x9() {
        try {
            if (gn) {
                iy.gn(3913092196837904212L, this);
            }
            return isParameterizedType() ? ((ParameterizedType) this).getClassType() : isParameterType() ? ((ParameterType) this).x9().x9() : isMethodParameterType() ? ((MethodParameterType) this).x9().x9() : isMethodParameterTypeVariable() ? ((MethodParameterTypeVariable) this).FN().x9() : isArrayType() ? this.space.hz(((ArrayType) this).getElementType().x9(), ((ArrayType) this).jO()) : this;
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, 3913092196837904212L, this);
            }
            throw th;
        }
    }

    @ey(method = -1274549073906522635L)
    public boolean yO(FileEntry fileEntry, Language language, Type type) {
        try {
            if (gn) {
                iy.we(282574458505998252L, this, fileEntry, language, type);
            }
            return this.space.Jl(fileEntry, language, this, type);
        } catch (Throwable th) {
            if (u7) {
                iy.U2(th, 282574458505998252L, this, fileEntry, language, type);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -1386101709857685L)
    public Type(FileSpace fileSpace, EntitySpace entitySpace) {
        super(fileSpace, entitySpace);
        try {
            if (gn) {
                iy.EQ(1450301756344583936L, null, fileSpace, entitySpace);
            }
            this.space = entitySpace;
        } catch (Throwable th) {
            if (u7) {
                iy.Mr(th, 1450301756344583936L, null, fileSpace, entitySpace);
            }
            throw th;
        }
    }
}
