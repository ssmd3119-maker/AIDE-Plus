package com.aide.codemodel.api;

import abcd.cy;
import abcd.dy;
import abcd.e4;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.codemodel.api.abstraction.CodeModel;
import com.aide.codemodel.api.abstraction.Language;
import com.aide.codemodel.api.collections.MapOfInt;
import com.aide.codemodel.api.collections.SetOf;
import com.aide.codemodel.api.collections.SetOfFileEntry;
import com.aide.codemodel.api.collections.SetOfInt;
import com.aide.codemodel.api.collections.StoreInputStream;
import com.aide.codemodel.api.collections.StoreOutputStream;

@cy(clazz = -1808839852619906655L, container = -1808839852619906655L, user = true)
/* loaded from: classes.dex */
public final class Namespace extends Entity {

    @fy
    private static /* synthetic */ boolean aM;

    @gy
    private static /* synthetic */ boolean j3;

    @dy(field = 3084986887278264471L)
    private final EntitySpace VH;

    @dy(field = 2203828116064230155L)
    private MapOfInt<ClassType> XL;

    @dy(field = -612546316871931035L)
    private SetOfInt assemblies;

    @dy(field = -2475562431044650800L)
    private Namespace enclosingNamespace;

    @dy(field = -465497410576648272L)
    private int entity;

    @dy(field = -16090884944530011L)
    private boolean exists;

    @dy(field = -4119059095642871627L)
    private final IdentifierSpace gn;

    @dy(field = 2893508862043027228L)
    private int identifier;

    @dy(field = 1722195303356044440L)
    private MapOfInt<ClassType> memberClasstypes;

    @dy(field = -4640830646363749556L)
    private SetOfFileEntry memberFiles;

    @dy(field = 3617731720210022355L)
    private MapOfInt<Namespace> memberNamespaces;

    @dy(field = 162069524128752459L)
    private final FileSpace u7;

    static {
        iy.Zo(Namespace.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -1505977871351287005L)
    public Namespace(EntitySpace entitySpace, IdentifierSpace identifierSpace, FileSpace fileSpace) {
        super(fileSpace, entitySpace);
        try {
            if (aM) {
                iy.we(-3939947467521063260L, null, entitySpace, identifierSpace, fileSpace);
            }
            this.VH = entitySpace;
            this.gn = identifierSpace;
            this.u7 = fileSpace;
        } catch (Throwable th) {
            if (j3) {
                iy.U2(th, -3939947467521063260L, null, entitySpace, identifierSpace, fileSpace);
            }
            throw th;
        }
    }

    @ey(method = -4296034448209752835L)
    private Language lp() {
        try {
            if (aM) {
                iy.gn(1080899092397112107L, this);
            }
            this.VH.loadNamespaces();
            if (this.memberFiles != null && this.memberFiles.we() > 0 && this.memberFiles.Zo().getCodeModel() != null && this.memberFiles.Zo().getCodeModel().getLanguages().size() > 0) {
                return this.memberFiles.Zo().getCodeModel().getLanguages().get(0);
            }
            if (this.memberNamespaces == null || this.memberNamespaces.J8() <= 0) {
                return null;
            }
            this.memberNamespaces.DEFAULT_ITERATOR.DW();
            while (this.memberNamespaces.DEFAULT_ITERATOR.hasMoreElements()) {
                Language languageLp = ((Namespace) this.memberNamespaces.DEFAULT_ITERATOR.nextValue()).lp();
                if (languageLp != null) {
                    return languageLp;
                }
            }
            return null;
        } catch (Throwable th) {
            if (j3) {
                iy.aM(th, 1080899092397112107L, this);
            }
            throw th;
        }
    }

    @ey(method = -157499838087973632L)
    private ClassType yO(FileEntry fileEntry, Language language, int i, boolean z, int i2, Namespace namespace) {
        int iQX;
        try {
            if (aM) {
                iy.QX(-526899071609975888L, this, new Object[]{fileEntry, language, new Integer(i), new Boolean(z), new Integer(i2), namespace});
            }
            ClassType classType = null;
            if (this.memberClasstypes == null) {
                return null;
            }
            MapOfInt<ClassType> mapOfInt = this.memberClasstypes;
            if (z) {
                iQX = i;
            } else {
                if (this.XL == null) {
                    this.XL = new MapOfInt<>(this.VH);
                    this.memberClasstypes.DEFAULT_ITERATOR.DW();
                    while (this.memberClasstypes.DEFAULT_ITERATOR.hasMoreElements()) {
                        this.XL.insert(this.gn.QX(this.memberClasstypes.DEFAULT_ITERATOR.Hw()), (ClassType) this.memberClasstypes.DEFAULT_ITERATOR.nextValue());
                    }
                }
                iQX = this.gn.QX(i);
                mapOfInt = this.XL;
            }
            if (mapOfInt.v5(iQX)) {
                mapOfInt.DEFAULT_ITERATOR.init(iQX);
                while (mapOfInt.DEFAULT_ITERATOR.hasMoreElements()) {
                    ClassType classType2 = (ClassType) mapOfInt.DEFAULT_ITERATOR.nextValue();
                    if (classType2.cc(namespace) && classType2.isReferable(fileEntry, language) && (classType == null || (!this.u7.Sf(fileEntry, classType.getFile(), classType2.getFile()) && this.u7.Sf(fileEntry, classType2.getFile(), classType.getFile())))) {
                        classType = classType2;
                    }
                }
            }
            return classType;
        } catch (Throwable th) {
            if (j3) {
                iy.rN(th, -526899071609975888L, this, new Object[]{fileEntry, language, new Integer(i), new Boolean(z), new Integer(i2), namespace});
            }
            throw th;
        }
    }

    @ey(method = 6533927888735460295L)
    public SetOfInt I() {
        try {
            if (aM) {
                iy.gn(-1573541735139543827L, this);
            }
            return this.assemblies == null ? new SetOfInt() : this.assemblies;
        } catch (Throwable th) {
            if (j3) {
                iy.aM(th, -1573541735139543827L, this);
            }
            throw th;
        }
    }

    @ey(method = 2751697255351068559L)
    public boolean Mz(FileEntry fileEntry, Language language, int i, boolean z, int i2, Namespace namespace) {
        int iQX;
        try {
            if (aM) {
                iy.QX(-1218702374231905915L, this, new Object[]{fileEntry, language, new Integer(i), new Boolean(z), new Integer(i2), namespace});
            }
            this.VH.loadNamespaces();
            if (this.memberClasstypes == null) {
                return false;
            }
            MapOfInt<ClassType> mapOfInt = this.memberClasstypes;
            if (z) {
                iQX = i;
            } else {
                if (this.XL == null) {
                    this.XL = new MapOfInt<>(this.VH);
                    this.memberClasstypes.DEFAULT_ITERATOR.DW();
                    while (this.memberClasstypes.DEFAULT_ITERATOR.hasMoreElements()) {
                        this.XL.insert(this.gn.QX(this.memberClasstypes.DEFAULT_ITERATOR.Hw()), (ClassType) this.memberClasstypes.DEFAULT_ITERATOR.nextValue());
                    }
                }
                iQX = this.gn.QX(i);
                mapOfInt = this.XL;
            }
            if (mapOfInt.v5(iQX)) {
                mapOfInt.DEFAULT_ITERATOR.init(iQX);
                while (mapOfInt.DEFAULT_ITERATOR.hasMoreElements()) {
                    ClassType classType = (ClassType) mapOfInt.DEFAULT_ITERATOR.nextValue();
                    if (classType.cc(namespace) && classType.isReferable(fileEntry, language)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            if (j3) {
                iy.rN(th, -1218702374231905915L, this, new Object[]{fileEntry, language, new Integer(i), new Boolean(z), new Integer(i2), namespace});
            }
            throw th;
        }
    }

    @ey(method = 2100513709999356512L)
    public Namespace OW(int i) {
        try {
            if (aM) {
                iy.u7(-4481708531565875688L, this, i);
            }
            if (this.memberNamespaces == null) {
                this.memberNamespaces = new MapOfInt<>(this.VH);
            }
            if (this.memberNamespaces.v5(i)) {
                return (Namespace) this.memberNamespaces.gn(i);
            }
            Namespace namespace = new Namespace(this.VH, this.gn, this.u7, i, this);
            this.memberNamespaces.we(i, namespace);
            return namespace;
        } catch (Throwable th) {
            if (j3) {
                iy.j3(th, -4481708531565875688L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -212863256660349547L)
    public SetOf<Namespace> Qq() {
        try {
            if (aM) {
                iy.gn(1156570063431591627L, this);
            }
            this.VH.loadNamespaces();
            SetOf<Namespace> setOf = new SetOf<>(this.VH);
            if (this.memberNamespaces != null) {
                this.memberNamespaces.DEFAULT_ITERATOR.DW();
                while (this.memberNamespaces.DEFAULT_ITERATOR.hasMoreElements()) {
                    Namespace namespace = (Namespace) this.memberNamespaces.DEFAULT_ITERATOR.nextValue();
                    if (namespace.exists) {
                        setOf.put(namespace);
                    }
                }
            }
            return setOf;
        } catch (Throwable th) {
            if (j3) {
                iy.aM(th, 1156570063431591627L, this);
            }
            throw th;
        }
    }

    @ey(method = -698429622801042041L)
    public void Sf(FileEntry fileEntry) {
        try {
            if (aM) {
                iy.tp(-2153327159650080555L, this, fileEntry);
            }
            int iGn = fileEntry.gn();
            for (Namespace namespace = this.enclosingNamespace; namespace != null; namespace = namespace.enclosingNamespace) {
                namespace.exists = true;
                if (namespace.assemblies == null) {
                    namespace.assemblies = new SetOfInt();
                }
                namespace.assemblies.put(iGn);
            }
            if (this.memberFiles == null) {
                this.memberFiles = new SetOfFileEntry(this.u7);
            }
            this.memberFiles.gn(fileEntry);
            if (this.assemblies == null) {
                this.assemblies = new SetOfInt();
            }
            this.assemblies.put(iGn);
            this.exists = true;
        } catch (Throwable th) {
            if (j3) {
                iy.j3(th, -2153327159650080555L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = -7114559214398275640L)
    public void XX() {
        try {
            if (aM) {
                iy.gn(-725119892067435820L, this);
            }
        } catch (Throwable th) {
            if (j3) {
                iy.aM(th, -725119892067435820L, this);
            }
            throw th;
        }
    }

    @ey(method = -1245271778442568431L)
    public Namespace aj() {
        try {
            if (aM) {
                iy.gn(7424778230477291775L, this);
            }
            return this.enclosingNamespace;
        } catch (Throwable th) {
            if (j3) {
                iy.aM(th, 7424778230477291775L, this);
            }
            throw th;
        }
    }

    @ey(method = -318778837550318316L)
    public MapOfInt<ClassType> ca() {
        try {
            if (aM) {
                iy.gn(-1344098451393752328L, this);
            }
            this.VH.loadNamespaces();
            if (this.memberClasstypes == null) {
                this.memberClasstypes = new MapOfInt<>(this.VH);
            }
            return this.memberClasstypes;
        } catch (Throwable th) {
            if (j3) {
                iy.aM(th, -1344098451393752328L, this);
            }
            throw th;
        }
    }

    @ey(method = -703115000490634515L)
    public Entity dx(FileEntry fileEntry, Language language, int i, boolean z, int i2, Namespace namespace) {
        try {
            if (aM) {
                iy.QX(354291912125683059L, this, new Object[]{fileEntry, language, new Integer(i), new Boolean(z), new Integer(i2), namespace});
            }
            this.VH.loadNamespaces();
            ClassType classTypeYO = yO(fileEntry, language, i, z, i2, namespace);
            return classTypeYO != null ? classTypeYO : ef(fileEntry, i, z);
        } catch (Throwable th) {
            if (j3) {
                iy.rN(th, 354291912125683059L, this, new Object[]{fileEntry, language, new Integer(i), new Boolean(z), new Integer(i2), namespace});
            }
            throw th;
        }
    }

    @ey(method = 853877373795018288L)
    public Namespace ef(FileEntry fileEntry, int i, boolean z) {
        try {
            if (aM) {
                iy.we(-1379846415650486488L, this, fileEntry, new Integer(i), new Boolean(z));
            }
            this.VH.loadNamespaces();
            if (z) {
                if (this.memberNamespaces != null && this.memberNamespaces.v5(i)) {
                    Namespace namespace = (Namespace) this.memberNamespaces.gn(i);
                    if (namespace.exists) {
                        SetOfInt setOfIntI = namespace.I();
                        setOfIntI.default_Iterator.init();
                        while (setOfIntI.default_Iterator.hasMoreElements()) {
                            if (this.u7.Qq(setOfIntI.default_Iterator.nextKey(), fileEntry.gn())) {
                                return namespace;
                            }
                        }
                    }
                }
                throw new e4();
            }
            if (this.memberNamespaces != null) {
                int iQX = this.gn.QX(i);
                this.memberNamespaces.DEFAULT_ITERATOR.DW();
                while (this.memberNamespaces.DEFAULT_ITERATOR.hasMoreElements()) {
                    Namespace namespace2 = (Namespace) this.memberNamespaces.DEFAULT_ITERATOR.nextValue();
                    if (namespace2.exists && this.gn.QX(namespace2.getIdentifier()) == iQX) {
                        SetOfInt setOfIntI2 = namespace2.I();
                        setOfIntI2.default_Iterator.init();
                        while (setOfIntI2.default_Iterator.hasMoreElements()) {
                            if (this.u7.Qq(setOfIntI2.default_Iterator.nextKey(), fileEntry.gn())) {
                                return namespace2;
                            }
                        }
                    }
                }
            }
            throw new e4();
        } catch (Throwable th) {
            if (j3) {
                iy.U2(th, -1379846415650486488L, this, fileEntry, new Integer(i), new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -4707309043036924284L)
    public boolean g3(int i, boolean z) {
        int iQX;
        try {
            if (aM) {
                iy.EQ(2234808729419286472L, this, new Integer(i), new Boolean(z));
            }
            this.VH.loadNamespaces();
            if (this.memberClasstypes == null) {
                return false;
            }
            MapOfInt<ClassType> mapOfInt = this.memberClasstypes;
            if (z) {
                iQX = i;
            } else {
                if (this.XL == null) {
                    this.XL = new MapOfInt<>(this.VH);
                    this.memberClasstypes.DEFAULT_ITERATOR.DW();
                    while (this.memberClasstypes.DEFAULT_ITERATOR.hasMoreElements()) {
                        this.XL.insert(this.gn.QX(this.memberClasstypes.DEFAULT_ITERATOR.Hw()), (ClassType) this.memberClasstypes.DEFAULT_ITERATOR.nextValue());
                    }
                }
                iQX = this.gn.QX(i);
                mapOfInt = this.XL;
            }
            return mapOfInt.v5(iQX);
        } catch (Throwable th) {
            if (j3) {
                iy.Mr(th, 2234808729419286472L, this, new Integer(i), new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = -575908568222521052L)
    public String getFullyQualifiedNameString() {
        try {
            if (aM) {
                iy.gn(606656094918310856L, this);
            }
            String fullyQualifiedNameString = super.getFullyQualifiedNameString();
            if (fullyQualifiedNameString.length() != 0) {
                return fullyQualifiedNameString;
            }
            if (kQ()) {
                return "";
            }
            if (aj().kQ()) {
                return this.gn.getString(getIdentifier());
            }
            return aj().getFullyQualifiedNameString() + "." + this.gn.getString(getIdentifier());
        } catch (Throwable th) {
            if (j3) {
                iy.aM(th, 606656094918310856L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = -235239666657715533L)
    public int getId() {
        try {
            if (aM) {
                iy.gn(-926084661309430875L, this);
            }
            return this.entity;
        } catch (Throwable th) {
            if (j3) {
                iy.aM(th, -926084661309430875L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = 2841555086374068235L)
    public int getIdentifier() {
        try {
            if (aM) {
                iy.gn(-4904786713078570527L, this);
            }
            return this.identifier;
        } catch (Throwable th) {
            if (j3) {
                iy.aM(th, -4904786713078570527L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = -4948016364814078264L)
    public Language getLanguage() {
        try {
            if (aM) {
                iy.gn(-924145742177967388L, this);
            }
            Language languageLp = lp();
            if (languageLp != null) {
                return languageLp;
            }
            for (CodeModel codeModel : this.u7.getCodeModels()) {
                if (codeModel.getLanguages().size() > 0) {
                    return codeModel.getLanguages().get(0);
                }
            }
            return null;
        } catch (Throwable th) {
            if (j3) {
                iy.aM(th, -924145742177967388L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = -5351951940827616160L)
    public String getNameString() {
        try {
            if (aM) {
                iy.gn(-1888156432957259212L, this);
            }
            String nameString = super.getNameString();
            return nameString.length() == 0 ? this.gn.getString(getIdentifier()) : nameString;
        } catch (Throwable th) {
            if (j3) {
                iy.aM(th, -1888156432957259212L, this);
            }
            throw th;
        }
    }

    @ey(method = 4650191479991332243L)
    public void invalidate() {
        try {
            if (aM) {
                iy.gn(-4290389088141151975L, this);
            }
            if (this.memberFiles != null) {
                this.memberFiles.clear();
            }
            if (this.memberClasstypes != null) {
                this.memberClasstypes.Hw();
            }
            if (this.assemblies != null) {
                this.assemblies.clear();
            }
            this.exists = false;
            this.XL = null;
        } catch (Throwable th) {
            if (j3) {
                iy.aM(th, -4290389088141151975L, this);
            }
            throw th;
        }
    }

    @ey(method = 2600014882054320632L)
    public boolean kQ() {
        try {
            if (aM) {
                iy.gn(-2833426265038343788L, this);
            }
            return this.enclosingNamespace == null;
        } catch (Throwable th) {
            if (j3) {
                iy.aM(th, -2833426265038343788L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = 6855338883245451008L)
    public void load(StoreInputStream storeInputStream) {
        try {
            if (aM) {
                iy.tp(-61531481579424880L, this, storeInputStream);
            }
            super.load(storeInputStream);
            this.identifier = storeInputStream.readInt();
            this.entity = storeInputStream.readInt();
            this.enclosingNamespace = (Namespace) this.VH.getEntity(storeInputStream.readInt());
            this.exists = storeInputStream.readBoolean();
            if (storeInputStream.readBoolean()) {
                this.memberNamespaces = new MapOfInt<>(this.VH, storeInputStream);
            }
            if (storeInputStream.readBoolean()) {
                this.memberClasstypes = new MapOfInt<>(this.VH, storeInputStream);
            }
            if (storeInputStream.readBoolean()) {
                this.memberFiles = new SetOfFileEntry(this.u7, storeInputStream);
            }
            if (storeInputStream.readBoolean()) {
                this.assemblies = new SetOfInt(storeInputStream);
            }
        } catch (Throwable th) {
            if (j3) {
                iy.j3(th, -61531481579424880L, this, storeInputStream);
            }
            throw th;
        }
    }

    @ey(method = 2614259164363808889L)
    public ClassType sG(FileEntry fileEntry, Language language, int i, boolean z, int i2, Namespace namespace) {
        try {
            if (aM) {
                iy.QX(-594602499633094861L, this, new Object[]{fileEntry, language, new Integer(i), new Boolean(z), new Integer(i2), namespace});
            }
            this.VH.loadNamespaces();
            ClassType classTypeYO = yO(fileEntry, language, i, z, i2, namespace);
            if (classTypeYO != null) {
                return classTypeYO;
            }
            throw new e4();
        } catch (Throwable th) {
            if (j3) {
                iy.rN(th, -594602499633094861L, this, new Object[]{fileEntry, language, new Integer(i), new Boolean(z), new Integer(i2), namespace});
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = -3219602846970930840L)
    public void store(StoreOutputStream storeOutputStream) {
        try {
            if (aM) {
                iy.tp(6687769573408370460L, this, storeOutputStream);
            }
            super.store(storeOutputStream);
            storeOutputStream.writeInt(this.identifier);
            storeOutputStream.writeInt(this.entity);
            storeOutputStream.writeInt(this.VH.getId(this.enclosingNamespace));
            storeOutputStream.writeBoolean(this.exists);
            boolean z = true;
            storeOutputStream.writeBoolean(this.memberNamespaces != null);
            if (this.memberNamespaces != null) {
                this.memberNamespaces.store(storeOutputStream);
            }
            storeOutputStream.writeBoolean(this.memberClasstypes != null);
            if (this.memberClasstypes != null) {
                this.memberClasstypes.store(storeOutputStream);
            }
            storeOutputStream.writeBoolean(this.memberFiles != null);
            if (this.memberFiles != null) {
                this.memberFiles.store(storeOutputStream);
            }
            if (this.assemblies == null) {
                z = false;
            }
            storeOutputStream.writeBoolean(z);
            if (this.assemblies != null) {
                this.assemblies.store(storeOutputStream);
            }
        } catch (Throwable th) {
            if (j3) {
                iy.j3(th, 6687769573408370460L, this, storeOutputStream);
            }
            throw th;
        }
    }

    @ey(method = -5822983901126807028L)
    public SetOf<ClassType> sy(FileEntry fileEntry, Language language, int i) {
        SetOf<ClassType> setOf;
        try {
            if (aM) {
                iy.we(1065558889086166560L, this, fileEntry, language, new Integer(i));
            }
            this.VH.loadNamespaces();
            boolean z = false;
            SetOf<ClassType> setOf2 = null;
            if (this.memberClasstypes != null) {
                this.memberClasstypes.DEFAULT_ITERATOR.init(i);
                setOf = null;
                while (this.memberClasstypes.DEFAULT_ITERATOR.hasMoreElements()) {
                    ClassType classType = (ClassType) this.memberClasstypes.DEFAULT_ITERATOR.nextValue();
                    if (classType.Yi() && classType.isReferable(fileEntry, language)) {
                        if (classType.PH()) {
                            z = true;
                        }
                        if (classType.getFile() == fileEntry) {
                            if (setOf == null) {
                                setOf = new SetOf<>(this.VH);
                            }
                            setOf.put(classType);
                        }
                        if (setOf2 == null) {
                            setOf2 = new SetOf<>(this.VH);
                        }
                        setOf2.put(classType);
                    }
                }
            } else {
                setOf = null;
            }
            return z ? setOf : setOf2;
        } catch (Throwable th) {
            if (j3) {
                iy.U2(th, 1065558889086166560L, this, fileEntry, language, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2633425546702113184L)
    public void vJ(int i, ClassType classType) {
        try {
            if (aM) {
                iy.EQ(1146834200425444736L, this, new Integer(i), classType);
            }
            if (this.memberClasstypes == null) {
                this.memberClasstypes = new MapOfInt<>(this.VH);
            }
            this.memberClasstypes.insert(i, classType);
        } catch (Throwable th) {
            if (j3) {
                iy.Mr(th, 1146834200425444736L, this, new Integer(i), classType);
            }
            throw th;
        }
    }

    @ey(method = 4788591672676181472L)
    public SetOfFileEntry x9() {
        try {
            if (aM) {
                iy.gn(-3243803529289839204L, this);
            }
            this.VH.loadNamespaces();
            return this.memberFiles == null ? new SetOfFileEntry(this.u7) : this.memberFiles;
        } catch (Throwable th) {
            if (j3) {
                iy.aM(th, -3243803529289839204L, this);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -2500905203894644404L)
    public Namespace(EntitySpace entitySpace, IdentifierSpace identifierSpace, FileSpace fileSpace, int i, Namespace namespace) {
        super(fileSpace, entitySpace);
        try {
            if (aM) {
                iy.J8(-587592184838141721L, null, entitySpace, identifierSpace, fileSpace, new Integer(i), namespace);
            }
            this.VH = entitySpace;
            this.gn = identifierSpace;
            this.u7 = fileSpace;
            this.identifier = i;
            this.entity = entitySpace.declareEntity(this);
            this.enclosingNamespace = namespace;
            this.exists = namespace == null;
        } catch (Throwable th) {
            if (j3) {
                iy.lg(th, -587592184838141721L, null, entitySpace, identifierSpace, fileSpace, new Integer(i), namespace);
            }
            throw th;
        }
    }
}
