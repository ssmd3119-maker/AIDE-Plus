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

@cy(clazz = 2044827495541960795L, container = 2044827495541960795L, user = true)
/* loaded from: classes.dex */
public final class ParameterizedType extends Type {

    @fy
    private static /* synthetic */ boolean QX;

    @gy
    private static /* synthetic */ boolean XL;

    @dy(field = 324927166149214557L)
    private int EQ;

    @dy(field = -421593244689964536L)
    private int[] J8;

    @dy(field = -4275557115624700021L)
    private SetOf<Type> Ws;

    @dy(field = 49849427697644775L)
    private Type[] absoluteArgumentTypes;

    @dy(field = -3479160711053702220L)
    private ClassType classType;

    @dy(field = 1101166896885892740L)
    private EntitySpace tp;

    static {
        iy.Zo(ParameterizedType.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -153114598204380981L)
    public ParameterizedType(FileSpace fileSpace, EntitySpace entitySpace) {
        super(fileSpace, entitySpace, 16);
        try {
            if (QX) {
                iy.EQ(683293696811849244L, null, fileSpace, entitySpace);
            }
            this.tp = entitySpace;
        } catch (Throwable th) {
            if (XL) {
                iy.Mr(th, 683293696811849244L, null, fileSpace, entitySpace);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Type
    @ey(method = 674400517012813869L)
    public Type ef(int i, boolean z, int i2, Entity entity, FileEntry fileEntry, Language language) throws Throwable {
        int i3;
        try {
            if (QX) {
                iy.QX(1175254001180617215L, this, new Object[]{new Integer(i), new Boolean(z), new Integer(i2), entity, fileEntry, language});
            }
            i3 = 6;
            try {
                Type typeEf = getClassType().ef(i, z, i2, entity, fileEntry, language);
                if (typeEf.isClassType()) {
                    typeEf = ((ClassType) typeEf).u9();
                }
                return replaceType(typeEf);
            } catch (Throwable th) {
                th = th;
                if (XL) {
                    Object[] objArr = new Object[i3];
                    objArr[0] = new Integer(i);
                    objArr[1] = new Boolean(z);
                    objArr[2] = new Integer(i2);
                    objArr[3] = entity;
                    objArr[4] = fileEntry;
                    objArr[5] = language;
                    iy.rN(th, 1175254001180617215L, this, objArr);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i3 = 6;
        }
    }

    @ey(method = -1323066599421570480L)
    public Type[] getAbsoluteArgumentTypes() {
        try {
            if (QX) {
                iy.gn(447209121527528352L, this);
            }
            return this.absoluteArgumentTypes;
        } catch (Throwable th) {
            if (XL) {
                iy.aM(th, 447209121527528352L, this);
            }
            throw th;
        }
    }

    @ey(method = 3136956754229901945L)
    public int[] getAbsoluteArgumentVariances() {
        try {
            if (QX) {
                iy.gn(-863369541110550493L, this);
            }
            return this.J8;
        } catch (Throwable th) {
            if (XL) {
                iy.aM(th, -863369541110550493L, this);
            }
            throw th;
        }
    }

    @ey(method = 6312401196025066052L)
    public SetOf<Type> getAllSuperTypes() {
        try {
            if (QX) {
                iy.gn(-6046996053968485032L, this);
            }
            if (this.Ws == null) {
                this.Ws = new SetOf<>(this.tp);
                SetOf<Type> allSuperTypes = this.classType.getAllSuperTypes();
                allSuperTypes.DEFAULT_ITERATOR.init();
                while (allSuperTypes.DEFAULT_ITERATOR.hasMoreElements()) {
                    try {
                        this.Ws.put(replaceType((Type) allSuperTypes.DEFAULT_ITERATOR.nextKey()));
                    } catch (e4 unused) {
                    }
                }
            }
            return this.Ws;
        } catch (Throwable th) {
            if (XL) {
                iy.aM(th, -6046996053968485032L, this);
            }
            throw th;
        }
    }

    @ey(method = -2447337412169636125L)
    public ClassType getClassType() {
        try {
            if (QX) {
                iy.gn(4222562793916300353L, this);
            }
            return this.classType;
        } catch (Throwable th) {
            if (XL) {
                iy.aM(th, 4222562793916300353L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = -2901994403653467415L)
    public FileEntry getFile() {
        try {
            if (QX) {
                iy.gn(1019333876353066155L, this);
            }
            return getClassType().getFile();
        } catch (Throwable th) {
            if (XL) {
                iy.aM(th, 1019333876353066155L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = -2236590923969939988L)
    public int getId() {
        try {
            if (QX) {
                iy.gn(-1476890507511073256L, this);
            }
            return this.EQ;
        } catch (Throwable th) {
            if (XL) {
                iy.aM(th, -1476890507511073256L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = 4477611719842461601L)
    public Language getLanguage() {
        try {
            if (QX) {
                iy.gn(-1844036319230198229L, this);
            }
            return getClassType().getLanguage();
        } catch (Throwable th) {
            if (XL) {
                iy.aM(th, -1844036319230198229L, this);
            }
            throw th;
        }
    }

    @ey(method = 1593816556500480528L)
    public void invalidate() {
        try {
            if (QX) {
                iy.gn(677386853681253268L, this);
            }
            this.Ws = null;
        } catch (Throwable th) {
            if (XL) {
                iy.aM(th, 677386853681253268L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Type
    @ey(method = -1409768452690049508L)
    public boolean isDelegateType() {
        try {
            if (QX) {
                iy.gn(3245455157874301320L, this);
            }
            return getClassType().isDelegateType();
        } catch (Throwable th) {
            if (XL) {
                iy.aM(th, 3245455157874301320L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Type
    @ey(method = -2651700669257672416L)
    public boolean isEnumType() {
        try {
            if (QX) {
                iy.gn(-2991606036037563936L, this);
            }
            return getClassType().isEnumType();
        } catch (Throwable th) {
            if (XL) {
                iy.aM(th, -2991606036037563936L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Type
    @ey(method = -2187751256025274488L)
    public boolean isInterfaceType() {
        try {
            if (QX) {
                iy.gn(-3046570359089804832L, this);
            }
            return getClassType().isInterfaceType();
        } catch (Throwable th) {
            if (XL) {
                iy.aM(th, -3046570359089804832L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Type
    @ey(method = 4316134374306485323L)
    public boolean isSealedType() {
        try {
            if (QX) {
                iy.gn(706191585040952129L, this);
            }
            return getClassType().isSealedType();
        } catch (Throwable th) {
            if (XL) {
                iy.aM(th, 706191585040952129L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Type, com.aide.codemodel.api.Entity
    @ey(method = 7965273547777125221L)
    public void load(StoreInputStream storeInputStream) {
        try {
            if (QX) {
                iy.tp(3879555966705317703L, this, storeInputStream);
            }
            super.load(storeInputStream);
            this.EQ = storeInputStream.readInt();
            this.classType = (ClassType) this.tp.getEntity(storeInputStream.readInt());
            int i = storeInputStream.readInt();
            this.absoluteArgumentTypes = new Type[i];
            this.J8 = new int[i];
            for (int i2 = 0; i2 < this.absoluteArgumentTypes.length; i2++) {
                this.absoluteArgumentTypes[i2] = (Type) this.tp.getEntity(storeInputStream.readInt());
                this.J8[i2] = storeInputStream.readInt();
            }
            if (storeInputStream.readBoolean()) {
                this.Ws = new SetOf<>(this.tp, storeInputStream);
            }
        } catch (Throwable th) {
            if (XL) {
                iy.j3(th, 3879555966705317703L, this, storeInputStream);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0 A[Catch: all -> 0x015c, TryCatch #1 {all -> 0x015c, blocks: (B:2:0x0000, B:4:0x0004, B:5:0x0011, B:7:0x0017, B:9:0x0030, B:11:0x0037, B:13:0x003c, B:15:0x0044, B:19:0x004d, B:21:0x0053, B:22:0x0068, B:24:0x006b, B:25:0x006e, B:27:0x0073, B:29:0x007b, B:91:0x014a, B:36:0x009c, B:42:0x00aa, B:43:0x00b0, B:45:0x00b8, B:46:0x00bc, B:52:0x00ca, B:53:0x00d0, B:55:0x00d8, B:57:0x00de, B:63:0x00eb, B:64:0x00f0, B:66:0x00f8, B:67:0x00fb, B:73:0x0108, B:74:0x010d, B:75:0x010e, B:77:0x0116, B:79:0x011b, B:80:0x0122, B:86:0x012f, B:87:0x0134, B:88:0x0135, B:89:0x013c, B:90:0x0140, B:92:0x014e), top: B:104:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010e A[Catch: all -> 0x015c, TryCatch #1 {all -> 0x015c, blocks: (B:2:0x0000, B:4:0x0004, B:5:0x0011, B:7:0x0017, B:9:0x0030, B:11:0x0037, B:13:0x003c, B:15:0x0044, B:19:0x004d, B:21:0x0053, B:22:0x0068, B:24:0x006b, B:25:0x006e, B:27:0x0073, B:29:0x007b, B:91:0x014a, B:36:0x009c, B:42:0x00aa, B:43:0x00b0, B:45:0x00b8, B:46:0x00bc, B:52:0x00ca, B:53:0x00d0, B:55:0x00d8, B:57:0x00de, B:63:0x00eb, B:64:0x00f0, B:66:0x00f8, B:67:0x00fb, B:73:0x0108, B:74:0x010d, B:75:0x010e, B:77:0x0116, B:79:0x011b, B:80:0x0122, B:86:0x012f, B:87:0x0134, B:88:0x0135, B:89:0x013c, B:90:0x0140, B:92:0x014e), top: B:104:0x0000 }] */
    @abcd.ey(method = 4232763555999026776L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.aide.codemodel.api.Type mb(com.aide.codemodel.api.Type r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.api.ParameterizedType.mb(com.aide.codemodel.api.Type, boolean):com.aide.codemodel.api.Type");
    }

    @ey(method = -1696741084801239165L)
    public Type replaceType(Type type) {
        try {
            if (QX) {
                iy.tp(2891790517707909693L, this, type);
            }
            return mb(type, true);
        } catch (Throwable th) {
            if (XL) {
                iy.j3(th, 2891790517707909693L, this, type);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Type, com.aide.codemodel.api.Entity
    @ey(method = 4432844187460975405L)
    public void store(StoreOutputStream storeOutputStream) {
        try {
            if (QX) {
                iy.tp(-3523316577537586929L, this, storeOutputStream);
            }
            super.store(storeOutputStream);
            storeOutputStream.writeInt(this.EQ);
            storeOutputStream.writeInt(this.tp.getId(this.classType));
            storeOutputStream.writeInt(this.absoluteArgumentTypes.length);
            for (int i = 0; i < this.absoluteArgumentTypes.length; i++) {
                storeOutputStream.writeInt(this.tp.getId(this.absoluteArgumentTypes[i]));
                storeOutputStream.writeInt(this.J8[i]);
            }
            storeOutputStream.writeBoolean(this.Ws != null);
            if (this.Ws != null) {
                this.Ws.store(storeOutputStream);
            }
        } catch (Throwable th) {
            if (XL) {
                iy.j3(th, -3523316577537586929L, this, storeOutputStream);
            }
            throw th;
        }
    }

    @ey(method = -6294640916139277884L)
    public Type ye(Type[] typeArr, int[] iArr) throws Throwable {
        Type[] typeArr2;
        int i;
        try {
            if (QX) {
                iy.EQ(-44393655986605248L, this, typeArr, iArr);
            }
            ClassType classType = getClassType();
            int iPa = classType.Pa();
            int absoluteParametertypeCount = classType.getAbsoluteParametertypeCount();
            if (iPa < absoluteParametertypeCount) {
                Type[] absoluteArgumentTypes = getAbsoluteArgumentTypes();
                int[] absoluteArgumentVariances = getAbsoluteArgumentVariances();
                typeArr2 = new Type[absoluteParametertypeCount];
                int[] iArr2 = new int[absoluteParametertypeCount];
                int i2 = 0;
                while (true) {
                    i = absoluteParametertypeCount - iPa;
                    if (i2 >= i) {
                        break;
                    }
                    typeArr2[i2] = absoluteArgumentTypes[i2];
                    iArr2[i2] = absoluteArgumentVariances[i2];
                    i2++;
                }
                while (i < absoluteParametertypeCount) {
                    int i3 = (i - absoluteParametertypeCount) + iPa;
                    typeArr2[i] = typeArr[i3];
                    iArr2[i] = iArr[i3];
                    i++;
                }
                try {
                    iArr = this.J8;
                    typeArr = typeArr2;
                } catch (Throwable th) {
                    th = th;
                    int[] iArr3 = iArr;
                    if (XL) {
                        iy.Mr(th, -44393655986605248L, this, typeArr2, iArr3);
                    }
                    throw th;
                }
            }
            return this.tp.AL(classType, typeArr, iArr);
        } catch (Throwable th2) {
            th = th2;
            typeArr2 = typeArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 2612794225739305380L)
    public ParameterizedType(FileSpace fileSpace, EntitySpace entitySpace, ClassType classType, Type[] typeArr, int[] iArr) {
        super(fileSpace, entitySpace, 16);
        try {
            if (QX) {
                iy.J8(5460555889400063375L, null, fileSpace, entitySpace, classType, typeArr, iArr);
            }
            this.tp = entitySpace;
            this.EQ = entitySpace.declareEntity(this);
            this.classType = classType;
            this.absoluteArgumentTypes = typeArr;
            this.J8 = iArr;
            this.Ws = null;
        } catch (Throwable th) {
            if (XL) {
                iy.lg(th, 5460555889400063375L, null, fileSpace, entitySpace, classType, typeArr, iArr);
            }
            throw th;
        }
    }
}
