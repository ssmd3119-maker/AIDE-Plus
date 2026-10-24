package com.aide.codemodel.api;

import abcd.cy;
import abcd.dy;
import abcd.e4;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import abcd.k3;
import abcd.y1;
import com.aide.codemodel.api.Member;
import com.aide.codemodel.api.abstraction.Language;
import com.aide.codemodel.api.callback.StopCallback;
import com.aide.codemodel.api.collections.ArrayOf;
import com.aide.codemodel.api.collections.FunctionOfIntInt;
import com.aide.codemodel.api.collections.ListOfInt;
import com.aide.codemodel.api.collections.MapOf;
import com.aide.codemodel.api.collections.MapOfInt;
import com.aide.codemodel.api.collections.MapOfIntArrayInt;
import com.aide.codemodel.api.collections.MapOfIntInt;
import com.aide.codemodel.api.collections.MapOfIntLong;
import com.aide.codemodel.api.collections.MapOfLongInt;
import com.aide.codemodel.api.collections.RelationOfIntInt;
import com.aide.codemodel.api.collections.SetOf;
import com.aide.codemodel.api.collections.SetOfFileEntry;
import com.aide.codemodel.api.collections.SetOfInt;
import com.aide.codemodel.api.collections.StoreInputStream;
import com.aide.codemodel.api.collections.StoreOutputStream;
import com.probelytics.api.UserTouchAction;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@cy(clazz = -936235974561285803L, container = -936235974561285803L, user = true)
/* loaded from: classes.dex */
public class EntitySpace {

    @fy
    private static /* synthetic */ boolean BT;

    @dy(field = 3142215765990677536L)
    private static final long gW;

    @gy
    private static /* synthetic */ boolean vy;

    @dy(field = 1097971001580951861L)
    private static final long yS;

    @dy(field = -539677222986216825L)
    private final StopCallback Hw;

    @dy(field = -1607660469188950352L)
    private RelationOfIntInt U2;

    @dy(field = -2306074568957809580L)
    private MapOfInt<ClassType> allClassTypes;

    @dy(field = 1576363344963620940L)
    private MapOfLongInt arrayTypes;

    @dy(field = -1981205742601863657L)
    private Entity[] entities;

    @dy(field = 339430211508300000L)
    private int entityCount;

    @dy(field = -2959609446768816776L)
    private int er;

    @dy(field = 2056753189208502060L)
    private ArrayOf<FileInfo> fileInfoArray;

    @dy(field = 2237543048111728136L)
    private RelationOfIntInt fileInheritanceDependencies;

    @dy(field = 425413420581170900L)
    private final FileSpace fileSpace;

    @dy(field = 1337819371890117865L)
    private ListOfInt gn;

    @dy(field = -1471947604655840208L)
    private final IdentifierSpace identifiers;

    @dy(field = 2390499120069633580L)
    public Member.InferAlgorithm inferAlgorithm;

    @dy(field = -6362980079591123408L)
    private int[] j3;

    @dy(field = 5682936613671164815L)
    private Map<FileEntry, String> lg;

    @dy(field = -2867738212617385149L)
    private FunctionOfIntInt methodParameterTypeVariables;

    @dy(field = -6478601846165780121L)
    private boolean namespacesLoaded;

    @dy(field = -1707653647973248280L)
    private MapOfIntArrayInt parameterizedTypes;

    @dy(field = 1645296731405968816L)
    private FunctionOfIntInt pointerTypes;

    @dy(field = -209319498786196992L)
    private MapOfLongInt primitiveTypes;

    @dy(field = 2317499610383089813L)
    private Namespace rootNamespace;

    @dy(field = -3230007531251217993L)
    private ListOfInt superClassTypeAnalyzedClasses;

    @dy(field = 2850640515822251815L)
    private final SyntaxTreeSpace syntaxTreeSpace;

    @dy(field = -1299911104209395400L)
    private k3 u7;

    @dy(field = 3314134586136297408L)
    private MapOfIntLong usedDirectories;

    static {
        try {
            iy.Zo(EntitySpace.class);
            if (BT) {
                iy.gn(969733469511050115L, null);
            }
            yS = 4000000L;
            gW = 2000000L;
        } catch (Throwable th) {
            if (vy) {
                iy.aM(th, 969733469511050115L, null);
            }
            throw th;
        }
    }

    @ey(method = -3608585752896595877L)
    public EntitySpace(IdentifierSpace identifierSpace, FileSpace fileSpace, SyntaxTreeSpace syntaxTreeSpace, StopCallback stopCallback) {
        try {
            if (BT) {
                iy.J0(1531522722215285640L, null, identifierSpace, fileSpace, syntaxTreeSpace, stopCallback);
            }
            this.superClassTypeAnalyzedClasses = new ListOfInt();
            this.gn = new ListOfInt();
            this.u7 = new k3();
            this.j3 = new int[1000];
            this.inferAlgorithm = new Member.InferAlgorithm(this);
            this.identifiers = identifierSpace;
            this.fileSpace = fileSpace;
            this.syntaxTreeSpace = syntaxTreeSpace;
            this.Hw = stopCallback;
            this.usedDirectories = new MapOfIntLong();
            this.fileInheritanceDependencies = new RelationOfIntInt();
            this.fileInfoArray = new ArrayOf<>();
            this.entityCount = 30;
            this.entities = new Entity[1000];
            this.arrayTypes = new MapOfLongInt();
            this.primitiveTypes = new MapOfLongInt();
            this.pointerTypes = new FunctionOfIntInt();
            this.methodParameterTypeVariables = new FunctionOfIntInt();
            this.parameterizedTypes = new MapOfIntArrayInt();
            this.U2 = new RelationOfIntInt();
            this.lg = new HashMap();
        } catch (Throwable th) {
            if (vy) {
                iy.a8(th, 1531522722215285640L, null, identifierSpace, fileSpace, syntaxTreeSpace, stopCallback);
            }
            throw th;
        }
    }

    @ey(method = 2368011781816869507L)
    private void et(Namespace namespace, FileEntry fileEntry, MapOfInt<ClassType> mapOfInt) {
        try {
            if (BT) {
                iy.we(-2838472023003032787L, this, namespace, fileEntry, mapOfInt);
            }
            MapOfInt<ClassType> mapOfIntCa = namespace.ca();
            mapOfIntCa.DEFAULT_ITERATOR.DW();
            while (mapOfIntCa.DEFAULT_ITERATOR.hasMoreElements()) {
                MapOfInt<ClassType> mapOfIntE9 = ((ClassType) mapOfIntCa.DEFAULT_ITERATOR.nextValue()).e9();
                mapOfIntE9.DEFAULT_ITERATOR.DW();
                while (mapOfIntE9.DEFAULT_ITERATOR.hasMoreElements()) {
                    ClassType classType = (ClassType) mapOfIntE9.DEFAULT_ITERATOR.nextValue();
                    if (y1.J8(classType.getModifiers())) {
                        mapOfInt.we(classType.getIdentifier(), classType);
                    }
                }
            }
        } catch (Throwable th) {
            if (vy) {
                iy.U2(th, -2838472023003032787L, this, namespace, fileEntry, mapOfInt);
            }
            throw th;
        }
    }

    @ey(method = 1911793000506011712L)
    private void gG(int i, int i2) throws Throwable {
        Throwable th;
        try {
            if (BT) {
                iy.EQ(13056737674971092L, this, new Integer(i), new Integer(i2));
            }
            if (i < i2) {
                long jFH = this.u7.FH(((i2 - i) / 2) + i);
                int i3 = i;
                int i4 = i2;
                while (i3 <= i4) {
                    while (this.u7.FH(i3) < jFH) {
                        try {
                            i3++;
                        } catch (Throwable th2) {
                            th = th2;
                            i = i3;
                            i2 = i4;
                            if (!vy) {
                                throw th;
                            }
                            iy.Mr(th, 13056737674971092L, this, new Integer(i), new Integer(i2));
                            throw th;
                        }
                    }
                    while (jFH < this.u7.FH(i4)) {
                        i4--;
                    }
                    if (i3 <= i4) {
                        int i5 = this.gn.get(i4);
                        this.gn.gn(i4, this.gn.get(i3));
                        this.gn.gn(i3, i5);
                        long jFH2 = this.u7.FH(i4);
                        this.u7.Hw(i4, this.u7.FH(i3));
                        this.u7.Hw(i3, jFH2);
                        i3++;
                        i4--;
                    }
                }
                gG(i, i4);
                gG(i3, i2);
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @ey(method = -2557126310011524688L)
    private FileInfo getFileInfo(FileEntry fileEntry, Language language) {
        try {
            if (BT) {
                iy.EQ(-4329871857179664600L, this, fileEntry, language);
            }
            int fileEntryLanguageId = this.fileSpace.getFileEntryLanguageId(fileEntry, language);
            if (this.fileInfoArray.FH(fileEntryLanguageId)) {
                return this.fileInfoArray.Hw(fileEntryLanguageId);
            }
            FileInfo fileInfo = new FileInfo(this.fileSpace, this, fileEntry, language);
            this.fileInfoArray.Zo(fileEntryLanguageId, fileInfo);
            return fileInfo;
        } catch (Throwable th) {
            if (vy) {
                iy.Mr(th, -4329871857179664600L, this, fileEntry, language);
            }
            throw th;
        }
    }

    @ey(method = 244209498822363845L)
    private int jO(SyntaxTree syntaxTree, int i, int i2, int i3) {
        try {
            if (BT) {
                iy.J0(4477199753574016119L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3));
            }
            int i4 = (!syntaxTree.getLanguage().getSyntax().Sf(syntaxTree, i) || syntaxTree.getEndLine(i) >= i2 || syntaxTree.getEndLine(i) < i2 + (-10)) ? -1 : i;
            int childCount = syntaxTree.getChildCount(i);
            for (int i5 = 0; i5 < childCount; i5++) {
                int iJO = jO(syntaxTree, syntaxTree.getChildNode(i, i5), i2, i3);
                if (iJO != -1 && (i4 == -1 || syntaxTree.getEndLine(iJO) > syntaxTree.getEndLine(i4))) {
                    i4 = iJO;
                }
            }
            return i4;
        } catch (Throwable th) {
            if (vy) {
                iy.a8(th, 4477199753574016119L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 6607295593840152777L)
    private void loadAllClasstypes() {
        try {
            if (BT) {
                iy.gn(3667197649520615231L, this);
            }
            if (this.allClassTypes == null) {
                loadNamespaces();
                this.allClassTypes = new MapOfInt<>(this);
                SetOfFileEntry solutionFiles = this.fileSpace.getSolutionFiles();
                solutionFiles.j6.init();
                while (solutionFiles.j6.hasMoreElements()) {
                    FileEntry fileEntryNextKey = solutionFiles.j6.nextKey();
                    if (fileEntryNextKey.exists()) {
                        MapOf<ClassType, Namespace> toplevelClasstypesOfFile = getToplevelClasstypesOfFile(fileEntryNextKey);
                        toplevelClasstypesOfFile.j6.DW();
                        while (toplevelClasstypesOfFile.j6.j6()) {
                            ClassType classType = (ClassType) toplevelClasstypesOfFile.j6.Hw();
                            this.allClassTypes.insert(getFileInfo(fileEntryNextKey, classType.getLanguage()).aM(classType), classType);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            if (vy) {
                iy.aM(th, 3667197649520615231L, this);
            }
            throw th;
        }
    }

    @ey(method = -129960194139126252L)
    private ClassType mb(FileEntry fileEntry) {
        try {
            if (BT) {
                iy.tp(-970540870252177176L, this, fileEntry);
            }
            if (fileEntry.getCodeModel() == null) {
                return null;
            }
            for (Language language : fileEntry.getCodeModel().getLanguages()) {
                if (language.getSignatureAnalyzer() != null) {
                    try {
                        return getFileInfo(fileEntry, language).U2();
                    } catch (e4 unused) {
                        continue;
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            if (vy) {
                iy.j3(th, -970540870252177176L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = 1124060612887813376L)
    private void wc(Namespace namespace, int i, int i2, FileEntry fileEntry, MapOf<ClassType, Entity> mapOf) {
        try {
            if (BT) {
                iy.J8(117598607058417648L, this, namespace, new Integer(i), new Integer(i2), fileEntry, mapOf);
            }
            MapOfInt<ClassType> mapOfIntCa = namespace.ca();
            mapOfIntCa.DEFAULT_ITERATOR.DW();
            while (mapOfIntCa.DEFAULT_ITERATOR.hasMoreElements()) {
                ClassType classType = (ClassType) mapOfIntCa.DEFAULT_ITERATOR.nextValue();
                MapOfInt<ClassType> mapOfIntE9 = classType.e9();
                mapOfIntE9.DEFAULT_ITERATOR.init(i);
                while (mapOfIntE9.DEFAULT_ITERATOR.hasMoreElements()) {
                    ClassType classType2 = (ClassType) mapOfIntE9.DEFAULT_ITERATOR.nextValue();
                    if (y1.J8(classType2.getModifiers())) {
                        mapOf.insert(classType2, classType);
                    }
                }
            }
        } catch (Throwable th) {
            if (vy) {
                iy.lg(th, 117598607058417648L, this, namespace, new Integer(i), new Integer(i2), fileEntry, mapOf);
            }
            throw th;
        }
    }

    @ey(method = 807501708849789675L)
    public Type AL(ClassType classType, Type[] typeArr, int[] iArr) {
        int i;
        try {
            if (BT) {
                iy.we(-272602146013245195L, this, classType, typeArr, iArr);
            }
            int absoluteParametertypeCount = classType.getAbsoluteParametertypeCount();
            ClassType classType2 = classType;
            while (true) {
                absoluteParametertypeCount -= classType2.Pa();
                if (classType2.PT()) {
                    ClassType enclosingClassType = classType2.getEnclosingClassType();
                    if (enclosingClassType == classType2) {
                        break;
                    }
                    classType2 = enclosingClassType;
                } else {
                    for (int i2 = 0; i2 < absoluteParametertypeCount; i2++) {
                        try {
                            typeArr[i2] = classType.n5(i2);
                        } catch (e4 unused) {
                        }
                        iArr[i2] = -1;
                    }
                }
            }
            int absoluteParametertypeCount2 = classType.getAbsoluteParametertypeCount();
            for (int i3 = 0; i3 < absoluteParametertypeCount2; i3++) {
                if (iArr[i3] != -1) {
                    for (int i4 = 0; i4 < absoluteParametertypeCount2; i4++) {
                        if (iArr[i4] == -1) {
                            iArr[i4] = 0;
                            try {
                                typeArr[i4] = getRootClasstype(classType.getFile(), classType.getLanguage());
                            } catch (e4 unused2) {
                            }
                        }
                    }
                    for (i = 0; i < absoluteParametertypeCount2; i++) {
                        this.j3[i] = typeArr[i].getId();
                    }
                    if (this.parameterizedTypes.j6(classType.getId(), this.j3, iArr, 0, absoluteParametertypeCount2)) {
                        return (ParameterizedType) getEntity(this.parameterizedTypes.FH(classType.getId(), this.j3, iArr, 0, absoluteParametertypeCount2));
                    }
                    ParameterizedType parameterizedType = new ParameterizedType(this.fileSpace, this, classType, typeArr, iArr);
                    this.parameterizedTypes.Zo(classType.getId(), this.j3, iArr, 0, absoluteParametertypeCount2, parameterizedType.getId());
                    return parameterizedType;
                }
            }
            return classType;
        } catch (Throwable th) {
            if (vy) {
                iy.U2(th, -272602146013245195L, this, classType, typeArr, iArr);
            }
            throw th;
        }
    }

    @ey(method = -2583741716497233641L)
    public void BR(StoreOutputStream storeOutputStream) {
        try {
            if (BT) {
                iy.tp(-316199503736855235L, this, storeOutputStream);
            }
            storeOutputStream.writeInt(this.entityCount);
            for (int i = 0; i < this.entityCount; i++) {
                if (this.entities[i] == null) {
                    storeOutputStream.writeByte(0);
                } else if (getEntity(i).isMember()) {
                    storeOutputStream.writeByte(1);
                } else if (getEntity(i).isClassType()) {
                    storeOutputStream.writeByte(3);
                } else if (getEntity(i).isArrayType()) {
                    storeOutputStream.writeByte(4);
                } else if (getEntity(i).isNamespace()) {
                    storeOutputStream.writeByte(6);
                } else if (getEntity(i).isMethodParameterType()) {
                    storeOutputStream.writeByte(7);
                } else if (getEntity(i).isParameterType()) {
                    storeOutputStream.writeByte(8);
                } else if (getEntity(i).isParameterizedType()) {
                    storeOutputStream.writeByte(9);
                } else if (getEntity(i).isMethodParameterTypeVariable()) {
                    storeOutputStream.writeByte(10);
                } else if (getEntity(i).isPointerType()) {
                    storeOutputStream.writeByte(11);
                } else if (getEntity(i).isPrimitiveType()) {
                    storeOutputStream.writeByte(12);
                } else {
                    storeOutputStream.writeByte(0);
                }
            }
        } catch (Throwable th) {
            if (vy) {
                iy.j3(th, -316199503736855235L, this, storeOutputStream);
            }
            throw th;
        }
    }

    @ey(method = 813876513151754336L)
    public void BT(FileEntry fileEntry, Language language, int i, ClassType classType, int i2, int i3) {
        try {
            if (BT) {
                iy.QX(5947212850279039108L, this, new Object[]{fileEntry, language, new Integer(i), classType, new Integer(i2), new Integer(i3)});
            }
            ParameterType parameterTypeU7 = getFileInfo(fileEntry, language).u7(i);
            parameterTypeU7.oY(i3, classType, i2);
            classType.qp(i2, i3, parameterTypeU7);
        } catch (Throwable th) {
            if (vy) {
                iy.rN(th, 5947212850279039108L, this, new Object[]{fileEntry, language, new Integer(i), classType, new Integer(i2), new Integer(i3)});
            }
            throw th;
        }
    }

    @ey(method = -1990661241166029504L)
    public MapOf<ClassType, Entity> CU(int i, int i2, FileEntry fileEntry, Language language) {
        try {
            if (BT) {
                iy.J0(1896342868912570848L, this, new Integer(i), new Integer(i2), fileEntry, language);
            }
            loadAllClasstypes();
            MapOf<ClassType, Entity> mapOf = new MapOf<>(this);
            this.allClassTypes.DEFAULT_ITERATOR.init(i);
            while (this.allClassTypes.DEFAULT_ITERATOR.hasMoreElements()) {
                ClassType classType = (ClassType) this.allClassTypes.DEFAULT_ITERATOR.nextValue();
                if (classType.isReferable(fileEntry, language)) {
                    mapOf.insert(classType, classType.getNamespace());
                }
            }
            return mapOf;
        } catch (Throwable th) {
            if (vy) {
                iy.a8(th, 1896342868912570848L, this, new Integer(i), new Integer(i2), fileEntry, language);
            }
            throw th;
        }
    }

    @ey(method = -4909384060653287169L)
    public void Cz(FileEntry fileEntry, Language language) {
        try {
            if (BT) {
                iy.EQ(5684106997806763309L, this, fileEntry, language);
            }
            getFileInfo(fileEntry, language).loadPositions();
        } catch (Throwable th) {
            if (vy) {
                iy.Mr(th, 5684106997806763309L, this, fileEntry, language);
            }
            throw th;
        }
    }

    @ey(method = -3094225572090830775L)
    public void EQ(ClassType classType, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        try {
            if (BT) {
                iy.QX(-3618322044443386701L, this, new Object[]{classType, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Integer(i9), new Integer(i10), new Integer(i11)});
            }
            classType.k2(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11);
        } catch (Throwable th) {
            if (vy) {
                iy.rN(th, -3618322044443386701L, this, new Object[]{classType, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Integer(i9), new Integer(i10), new Integer(i11)});
            }
            throw th;
        }
    }

    @ey(method = 161887234040676000L)
    public SetOf<Type> Eq(FileEntry fileEntry, Language language, ArrayType arrayType) {
        try {
            if (BT) {
                iy.we(-4846106443488561000L, this, fileEntry, language, arrayType);
            }
            return language.getTypeSystem().v5(fileEntry, arrayType);
        } catch (Throwable th) {
            if (vy) {
                iy.U2(th, -4846106443488561000L, this, fileEntry, language, arrayType);
            }
            throw th;
        }
    }

    @ey(method = 1547181818311902400L)
    public String Ev(Entity entity) {
        String strSh;
        try {
            if (BT) {
                iy.tp(496654639565066584L, this, entity);
            }
            FileEntry file = entity.getFile();
            if (file == null) {
                return "";
            }
            for (SyntaxTree syntaxTree : this.syntaxTreeSpace.QX(file)) {
                int iJO = jO(syntaxTree, syntaxTree.getRootNode(), entity.Ws(), entity.QX());
                if (iJO != -1 && (strSh = syntaxTree.getLanguage().getSyntax().sh(syntaxTree, iJO)) != null) {
                    return strSh;
                }
                this.syntaxTreeSpace.releaseSyntaxTree(syntaxTree);
            }
            return "";
        } catch (Throwable th) {
            if (vy) {
                iy.j3(th, 496654639565066584L, this, entity);
            }
            throw th;
        }
    }

    @ey(method = -2196291959013803736L)
    public SetOf<Entity> FN(FileEntry fileEntry) {
        try {
            if (BT) {
                iy.tp(-2439307650541653876L, this, fileEntry);
            }
            SetOf<Entity> setOf = new SetOf<>(this);
            if (fileEntry.getCodeModel() != null) {
                for (Language language : fileEntry.getCodeModel().getLanguages()) {
                    if (language.getSignatureAnalyzer() != null) {
                        setOf.u7(getFileInfo(fileEntry, language).getAllDeclarations());
                    }
                }
            }
            return setOf;
        } catch (Throwable th) {
            if (vy) {
                iy.j3(th, -2439307650541653876L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = -2078313825374934539L)
    public void Hw(int i) {
        try {
            if (BT) {
                iy.u7(-482896138242843925L, this, i);
            }
            this.er += i;
        } catch (Throwable th) {
            if (vy) {
                iy.j3(th, -482896138242843925L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 1519949240185052325L)
    public int I(long j) {
        try {
            if (BT) {
                iy.tp(-1454116414870441465L, this, new Long(j));
            }
            return (int) j;
        } catch (Throwable th) {
            if (vy) {
                iy.j3(th, -1454116414870441465L, this, new Long(j));
            }
            throw th;
        }
    }

    @ey(method = 4802690906966343312L)
    public void IS() {
        try {
            if (BT) {
                iy.gn(1964624742009131580L, this);
            }
            if (this.er > yS) {
                System.out.println("Shrink incremental: " + this.er);
                ys(gW);
            }
        } catch (Throwable th) {
            if (vy) {
                iy.aM(th, 1964624742009131580L, this);
            }
            throw th;
        }
    }

    @ey(method = 3950189500732384532L)
    public void J0(ClassType classType) {
        try {
            if (BT) {
                iy.tp(2366690554485275480L, this, classType);
            }
            classType.Ev();
            aM(classType.getFile(), classType.getLanguage());
        } catch (Throwable th) {
            if (vy) {
                iy.j3(th, 2366690554485275480L, this, classType);
            }
            throw th;
        }
    }

    @ey(method = 1861659098585248355L)
    public boolean Jl(FileEntry fileEntry, Language language, Type type, Type type2) {
        try {
            if (BT) {
                iy.J0(-922634060149354363L, this, fileEntry, language, type, type2);
            }
            return language.getTypeSystem().J8(fileEntry, type, type2);
        } catch (Throwable th) {
            if (vy) {
                iy.a8(th, -922634060149354363L, this, fileEntry, language, type, type2);
            }
            throw th;
        }
    }

    @ey(method = 123542461639683195L)
    public void KD(ClassType classType, Type type) {
        try {
            if (BT) {
                iy.EQ(-8338904533590010655L, this, classType, type);
            }
            classType.hK(type);
        } catch (Throwable th) {
            if (vy) {
                iy.Mr(th, -8338904533590010655L, this, classType, type);
            }
            throw th;
        }
    }

    @ey(method = 2785899343770424639L)
    public ClassType Mr(FileEntry fileEntry, Language language, int i, Namespace namespace, int i2, ClassType classType, int i3, int i4, boolean z, boolean z2) throws Throwable {
        int i5;
        ClassType classType2;
        try {
            if (BT) {
                iy.QX(132793317259823213L, this, new Object[]{fileEntry, language, new Integer(i), namespace, new Integer(i2), classType, new Integer(i3), new Integer(i4), new Boolean(z), new Boolean(z2)});
            }
            ClassType classTypeV5 = getFileInfo(fileEntry, language).v5(i, namespace, i4);
            i5 = i4;
            try {
                classTypeV5.cT(i5, i3, namespace, i2, 0, classType.ys(), classType, z2, false, true, z, false, false);
                classType2 = classType;
                try {
                    classType2.jw(i5, classTypeV5);
                    return classTypeV5;
                } catch (Throwable th) {
                    th = th;
                    if (vy) {
                        iy.rN(th, 132793317259823213L, this, new Object[]{fileEntry, language, new Integer(i), namespace, new Integer(i2), classType2, new Integer(i3), new Integer(i5), new Boolean(z), new Boolean(z2)});
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                classType2 = classType;
                i5 = i4;
            }
        } catch (Throwable th3) {
            th = th3;
            i5 = i4;
            classType2 = classType;
        }
    }

    @ey(method = 2728648895112816620L)
    public float Mz(long j) {
        try {
            if (BT) {
                iy.tp(-825481924912411560L, this, new Long(j));
            }
            return Float.intBitsToFloat((int) j);
        } catch (Throwable th) {
            if (vy) {
                iy.j3(th, -825481924912411560L, this, new Long(j));
            }
            throw th;
        }
    }

    @ey(method = 5815409739064998579L)
    public void Nh(StoreOutputStream storeOutputStream) {
        try {
            if (BT) {
                iy.tp(-5882632017892785935L, this, storeOutputStream);
            }
            storeOutputStream.writeInt(getId(this.rootNamespace));
            this.usedDirectories.store(storeOutputStream);
            this.fileInheritanceDependencies.store(storeOutputStream);
            storeOutputStream.writeInt(this.fileInfoArray.u7());
            this.fileInfoArray.j6.DW();
            while (this.fileInfoArray.j6.j6()) {
                int iFH = this.fileInfoArray.j6.FH();
                FileInfo fileInfoHw = this.fileInfoArray.j6.Hw();
                storeOutputStream.writeInt(iFH);
                fileInfoHw.store(storeOutputStream);
                storeOutputStream.writeChar(83);
            }
            this.arrayTypes.store(storeOutputStream);
            this.primitiveTypes.store(storeOutputStream);
            this.pointerTypes.store(storeOutputStream);
            this.methodParameterTypeVariables.store(storeOutputStream);
            this.parameterizedTypes.store(storeOutputStream);
            for (int i = 0; i < this.entityCount; i++) {
                if (this.entities[i] != null) {
                    this.entities[i].store(storeOutputStream);
                    storeOutputStream.writeChar(69);
                }
            }
            this.U2.store(storeOutputStream);
            storeOutputStream.writeInt(this.lg.size());
            for (Map.Entry<FileEntry, String> entry : this.lg.entrySet()) {
                storeOutputStream.writeInt(entry.getKey().getId());
                storeOutputStream.writeUTF(entry.getValue());
            }
        } catch (Throwable th) {
            if (vy) {
                iy.j3(th, -5882632017892785935L, this, storeOutputStream);
            }
            throw th;
        }
    }

    /*  JADX ERROR: Types fix failed
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0880: MOVE (r13 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:407:0x0880 */
    @abcd.ey(method = 2314587199120855457L)
    public long OW(com.aide.codemodel.api.FileEntry r24, com.aide.codemodel.api.abstraction.Language r25, int r26, long r27, long r29, com.aide.codemodel.api.Type r31, com.aide.codemodel.api.Type r32) {
        /*
            Method dump skipped, instructions count: 2548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.api.EntitySpace.OW(com.aide.codemodel.api.FileEntry, com.aide.codemodel.api.abstraction.Language, int, long, long, com.aide.codemodel.api.Type, com.aide.codemodel.api.Type):long");
    }

    @ey(method = 996622071224553711L)
    public void P8(Member member, String str) {
        try {
            if (BT) {
                iy.EQ(3972757782131092997L, this, member, str);
            }
            member.Mz(str);
        } catch (Throwable th) {
            if (vy) {
                iy.Mr(th, 3972757782131092997L, this, member, str);
            }
            throw th;
        }
    }

    @ey(method = 743717111380879104L)
    public void QO() {
        try {
            if (BT) {
                iy.gn(-1780794259583720304L, this);
            }
            if (this.namespacesLoaded) {
                return;
            }
            this.namespacesLoaded = true;
            SetOfFileEntry solutionFiles = this.fileSpace.getSolutionFiles();
            solutionFiles.j6.init();
            while (solutionFiles.j6.hasMoreElements()) {
                FileEntry fileEntryNextKey = solutionFiles.j6.nextKey();
                if (fileEntryNextKey.exists() && fileEntryNextKey.getCodeModel() != null) {
                    for (Language language : fileEntryNextKey.getCodeModel().getLanguages()) {
                        if (language.getSignatureAnalyzer() != null) {
                            getFileInfo(fileEntryNextKey, language).nw();
                            if (this.Hw != null && this.Hw.hz()) {
                                this.namespacesLoaded = false;
                                return;
                            }
                        }
                    }
                }
            }
            SetOfFileEntry solutionFiles2 = this.fileSpace.getSolutionFiles();
            solutionFiles2.j6.init();
            while (solutionFiles2.j6.hasMoreElements()) {
                FileEntry fileEntryNextKey2 = solutionFiles2.j6.nextKey();
                if (fileEntryNextKey2.exists() && fileEntryNextKey2.getCodeModel() != null) {
                    for (Language language2 : fileEntryNextKey2.getCodeModel().getLanguages()) {
                        if (language2.getSignatureAnalyzer() != null) {
                            SetOf<Namespace> setOfRN = getFileInfo(fileEntryNextKey2, language2).rN();
                            setOfRN.DEFAULT_ITERATOR.init();
                            while (setOfRN.DEFAULT_ITERATOR.hasMoreElements()) {
                                gW((Namespace) setOfRN.DEFAULT_ITERATOR.nextKey(), fileEntryNextKey2, language2);
                            }
                            MapOf<ClassType, Namespace> mapOfYS = getFileInfo(fileEntryNextKey2, language2).yS();
                            mapOfYS.j6.DW();
                            while (mapOfYS.j6.j6()) {
                                ClassType classType = (ClassType) mapOfYS.j6.Hw();
                                ((Namespace) mapOfYS.j6.v5()).vJ(getFileInfo(fileEntryNextKey2, language2).aM(classType), classType);
                            }
                        }
                    }
                }
            }
            SetOfFileEntry solutionFiles3 = this.fileSpace.getSolutionFiles();
            solutionFiles3.j6.init();
            while (solutionFiles3.j6.hasMoreElements()) {
                FileEntry fileEntryNextKey3 = solutionFiles3.j6.nextKey();
                if (fileEntryNextKey3.exists() && fileEntryNextKey3.getCodeModel() != null) {
                    for (Language language3 : fileEntryNextKey3.getCodeModel().getLanguages()) {
                        if (language3.getSignatureAnalyzer() != null) {
                            SetOfInt setOfIntJ3 = getFileInfo(fileEntryNextKey3, language3).j3();
                            setOfIntJ3.default_Iterator.init();
                            while (setOfIntJ3.default_Iterator.hasMoreElements()) {
                                this.U2.v5(fileEntryNextKey3.gn(), setOfIntJ3.default_Iterator.nextKey());
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            if (vy) {
                iy.aM(th, -1780794259583720304L, this);
            }
            throw th;
        }
    }

    @ey(method = -559091861184020115L)
    public Member QX(FileEntry fileEntry, Language language, int i, ClassType classType, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4) throws Throwable {
        int i4;
        try {
            if (BT) {
                iy.QX(-73896516325790105L, this, new Object[]{fileEntry, language, new Integer(i), classType, new Integer(i2), new Integer(i3), new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4)});
            }
            Member member = getFileInfo(fileEntry, language).getMember(i);
            classType.mb(i3, member);
            i4 = 10;
            try {
                member.ca(classType, i2, i3, z, z2, z3, z4);
                return member;
            } catch (Throwable th) {
                th = th;
                if (vy) {
                    Object[] objArr = new Object[i4];
                    objArr[0] = fileEntry;
                    objArr[1] = language;
                    objArr[2] = new Integer(i);
                    objArr[3] = classType;
                    objArr[4] = new Integer(i2);
                    objArr[5] = new Integer(i3);
                    objArr[6] = new Boolean(z);
                    objArr[7] = new Boolean(z2);
                    objArr[8] = new Boolean(z3);
                    objArr[9] = new Boolean(z4);
                    iy.rN(th, -73896516325790105L, this, objArr);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i4 = 10;
        }
    }

    @ey(method = -740436888780603480L)
    public long Qq(double d) {
        try {
            if (BT) {
                iy.tp(1015425435989413892L, this, new Double(d));
            }
            return Double.doubleToLongBits(d);
        } catch (Throwable th) {
            if (vy) {
                iy.j3(th, 1015425435989413892L, this, new Double(d));
            }
            throw th;
        }
    }

    @ey(method = -768298497927887808L)
    public void SI(ClassType classType) {
        try {
            if (BT) {
                iy.tp(1210143470959241244L, this, classType);
            }
            this.superClassTypeAnalyzedClasses.pop();
            if (classType.areSuperClasstypesLoaded()) {
                return;
            }
            classType.declareSuperClasstypesLoaded();
        } catch (Throwable th) {
            if (vy) {
                iy.j3(th, 1210143470959241244L, this, classType);
            }
            throw th;
        }
    }

    @ey(method = 6925883427139818219L)
    public void Sf(Member member, int i) {
        try {
            if (BT) {
                iy.EQ(-4411736113053795075L, this, member, new Integer(i));
            }
            member.lp(i);
        } catch (Throwable th) {
            if (vy) {
                iy.Mr(th, -4411736113053795075L, this, member, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -471560852858502205L)
    public ClassType U2(FileEntry fileEntry, Language language, int i, Namespace namespace, int i2, ClassType classType, int i3, int i4, boolean z) throws Throwable {
        int i5;
        ClassType classType2;
        try {
            if (BT) {
                iy.QX(351782685678920797L, this, new Object[]{fileEntry, language, new Integer(i), namespace, new Integer(i2), classType, new Integer(i3), new Integer(i4), new Boolean(z)});
            }
            ClassType classTypeV5 = getFileInfo(fileEntry, language).v5(i, namespace, i4);
            i5 = i4;
            try {
                classTypeV5.cT(i5, i3, namespace, i2, 0, classType.ys(), classType, z, false, false, false, false, false);
                classType2 = classType;
                try {
                    classType2.jw(i5, classTypeV5);
                    return classTypeV5;
                } catch (Throwable th) {
                    th = th;
                    if (vy) {
                        iy.rN(th, 351782685678920797L, this, new Object[]{fileEntry, language, new Integer(i), namespace, new Integer(i2), classType2, new Integer(i3), new Integer(i5), new Boolean(z)});
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                classType2 = classType;
                i5 = i4;
            }
        } catch (Throwable th3) {
            th = th3;
            i5 = i4;
            classType2 = classType;
        }
    }

    @ey(method = 54596538517504224L)
    public boolean VH(FileEntry fileEntry, Language language) {
        try {
            if (BT) {
                iy.EQ(7890801442218713600L, this, fileEntry, language);
            }
            return getFileInfo(fileEntry, language).canDeclareSyntax();
        } catch (Throwable th) {
            if (vy) {
                iy.Mr(th, 7890801442218713600L, this, fileEntry, language);
            }
            throw th;
        }
    }

    @ey(method = 6257684522687777240L)
    public String WB(FileEntry fileEntry) {
        try {
            if (BT) {
                iy.tp(-3611170154982188596L, this, fileEntry);
            }
            if (this.lg.containsKey(fileEntry)) {
                return this.lg.get(fileEntry);
            }
            ClassType classTypeMb = mb(fileEntry);
            String fullyQualifiedNameString = classTypeMb == null ? "" : classTypeMb.getFullyQualifiedNameString();
            this.lg.put(fileEntry, fullyQualifiedNameString);
            return fullyQualifiedNameString;
        } catch (Throwable th) {
            if (vy) {
                iy.j3(th, -3611170154982188596L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = -6445334969015142964L)
    public void Ws(Member member, Type type, int i) {
        try {
            if (BT) {
                iy.we(-4318591546067146120L, this, member, type, new Integer(i));
            }
            member.ef(type, i);
        } catch (Throwable th) {
            if (vy) {
                iy.U2(th, -4318591546067146120L, this, member, type, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 4569225446316018345L)
    public MapOfInt<ClassType> XG() {
        try {
            if (BT) {
                iy.gn(1766371596400773411L, this);
            }
            loadAllClasstypes();
            return this.allClassTypes;
        } catch (Throwable th) {
            if (vy) {
                iy.aM(th, 1766371596400773411L, this);
            }
            throw th;
        }
    }

    @ey(method = -69312404637926928L)
    public void XL(FileEntry fileEntry, Language language, Namespace namespace, int i, boolean z, int i2) {
        try {
            if (BT) {
                iy.QX(-2295042557355710372L, this, new Object[]{fileEntry, language, namespace, new Integer(i), new Boolean(z), new Integer(i2)});
            }
            try {
                ClassType classTypeWs = getFileInfo(fileEntry, language).Ws(0, namespace, i);
                namespace.vJ(i, classTypeWs);
                classTypeWs.q7(namespace, i, z, i2);
                gW(namespace, fileEntry, language);
                getFileInfo(fileEntry, language).tp(namespace, classTypeWs, i);
            } catch (e4 unused) {
            }
        } catch (Throwable th) {
            if (vy) {
                iy.rN(th, -2295042557355710372L, this, new Object[]{fileEntry, language, namespace, new Integer(i), new Boolean(z), new Integer(i2)});
            }
            throw th;
        }
    }

    @ey(method = -527058476339242617L)
    public long XX(FileEntry fileEntry, Language language, long j, Type type, Type type2) {
        try {
            if (BT) {
                iy.J8(645926482926768637L, this, fileEntry, language, new Long(j), type, type2);
            }
            if (type.XX(type2)) {
                return j;
            }
            if (type.isEnumType()) {
                return XX(fileEntry, language, j, ((ClassType) type.x9()).IS(fileEntry), type2);
            }
            if (type2.isEnumType()) {
                return XX(fileEntry, language, j, type, ((ClassType) type2.x9()).IS(fileEntry));
            }
            switch (type2.getSemantic()) {
                case 3:
                case 4:
                    switch (type.getSemantic()) {
                        case 3:
                        case 4:
                        case 5:
                        case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                        case UserTouchAction.CLICK_KIND /* 7 */:
                        case 8:
                        case 12:
                            return aj((byte) I(j));
                        case 9:
                        case 10:
                            ca(j);
                            return aj((byte) j);
                        case 13:
                            return aj((byte) Mz(j));
                        case 14:
                            return aj((byte) g3(j));
                    }
                case 5:
                    switch (type.getSemantic()) {
                        case 3:
                        case 4:
                        case 5:
                        case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                        case UserTouchAction.CLICK_KIND /* 7 */:
                        case 8:
                        case 12:
                            return aj((short) I(j));
                        case 9:
                        case 10:
                            ca(j);
                            return aj((short) j);
                        case 13:
                            return aj((short) Mz(j));
                        case 14:
                            return aj((short) g3(j));
                    }
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                case 12:
                    switch (type.getSemantic()) {
                        case 3:
                        case 4:
                        case 5:
                        case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                        case UserTouchAction.CLICK_KIND /* 7 */:
                        case 8:
                        case 12:
                            return aj((char) I(j));
                        case 9:
                        case 10:
                            ca(j);
                            return aj((char) j);
                        case 13:
                            return aj((char) Mz(j));
                        case 14:
                            return aj((char) g3(j));
                    }
                case UserTouchAction.CLICK_KIND /* 7 */:
                case 8:
                    switch (type.getSemantic()) {
                        case 3:
                        case 4:
                        case 5:
                        case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                        case UserTouchAction.CLICK_KIND /* 7 */:
                        case 8:
                        case 12:
                            return j;
                        case 9:
                        case 10:
                            ca(j);
                            return aj((int) j);
                        case 13:
                            return aj((int) Mz(j));
                        case 14:
                            return aj((int) g3(j));
                    }
                case 9:
                case 10:
                    switch (type.getSemantic()) {
                        case 3:
                        case 4:
                        case 5:
                        case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                        case UserTouchAction.CLICK_KIND /* 7 */:
                        case 8:
                        case 12:
                            long jI = I(j);
                            lp(jI);
                            return jI;
                        case 13:
                            long jMz = (long) Mz(j);
                            lp(jMz);
                            return jMz;
                        case 14:
                            long jG3 = (long) g3(j);
                            lp(jG3);
                            return jG3;
                    }
                case 13:
                    switch (type.getSemantic()) {
                        case 3:
                        case 4:
                        case 5:
                        case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                        case UserTouchAction.CLICK_KIND /* 7 */:
                        case 8:
                        case 12:
                            return sy(I(j));
                        case 9:
                        case 10:
                            ca(j);
                            return sy(j);
                        case 14:
                            return sy((float) g3(j));
                    }
                case 14:
                    switch (type.getSemantic()) {
                        case 3:
                        case 4:
                        case 5:
                        case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                        case UserTouchAction.CLICK_KIND /* 7 */:
                        case 8:
                        case 12:
                            return Qq(I(j));
                        case 9:
                        case 10:
                            ca(j);
                            return Qq(j);
                        case 13:
                            return Qq(Mz(j));
                    }
            }
            throw new e4();
        } catch (Throwable th) {
            if (vy) {
                iy.lg(th, 645926482926768637L, this, fileEntry, language, new Long(j), type, type2);
            }
            throw th;
        }
    }

    @ey(method = 5185762423311886475L)
    public ClassType Xa(FileEntry fileEntry, Language language) {
        try {
            if (BT) {
                iy.EQ(1201569153482922129L, this, fileEntry, language);
            }
            return language.getTypeSystem().EQ(fileEntry);
        } catch (Throwable th) {
            if (vy) {
                iy.Mr(th, 1201569153482922129L, this, fileEntry, language);
            }
            throw th;
        }
    }

    @ey(method = -1450441026422390272L)
    public void a5() {
        try {
            if (BT) {
                iy.gn(-2618578457761974592L, this);
            }
            ys(0L);
        } catch (Throwable th) {
            if (vy) {
                iy.aM(th, -2618578457761974592L, this);
            }
            throw th;
        }
    }

    @ey(method = 5783293296515965160L)
    public ClassType a8(FileEntry fileEntry, Language language, int i, Namespace namespace, int i2, ClassType classType, int i3, int i4, int i5) throws Throwable {
        int i6;
        ClassType classType2;
        try {
            if (BT) {
                iy.QX(1372334126365543708L, this, new Object[]{fileEntry, language, new Integer(i), namespace, new Integer(i2), classType, new Integer(i3), new Integer(i4), new Integer(i5)});
            }
            ClassType classTypeV5 = getFileInfo(fileEntry, language).v5(i, namespace, i4);
            i6 = i4;
            try {
                classTypeV5.cT(i6, i3, namespace, i2, i5, classType.ys(), classType, false, false, false, false, false, false);
                classType2 = classType;
                try {
                    classType2.jw(i6, classTypeV5);
                    return classTypeV5;
                } catch (Throwable th) {
                    th = th;
                    if (vy) {
                        iy.rN(th, 1372334126365543708L, this, new Object[]{fileEntry, language, new Integer(i), namespace, new Integer(i2), classType2, new Integer(i3), new Integer(i6), new Integer(i5)});
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                classType2 = classType;
                i6 = i4;
            }
        } catch (Throwable th3) {
            th = th3;
            i6 = i4;
            classType2 = classType;
        }
    }

    @ey(method = 3400660367192454061L)
    public void aM(FileEntry fileEntry, Language language) {
        try {
            if (BT) {
                iy.EQ(1787564167974987615L, this, fileEntry, language);
            }
            getFileInfo(fileEntry, language).dx();
        } catch (Throwable th) {
            if (vy) {
                iy.Mr(th, 1787564167974987615L, this, fileEntry, language);
            }
            throw th;
        }
    }

    @ey(method = -450682521145189641L)
    public long aj(int i) {
        try {
            if (BT) {
                iy.u7(1058273776116945101L, this, i);
            }
            return i;
        } catch (Throwable th) {
            if (vy) {
                iy.j3(th, 1058273776116945101L, this, new Integer(i));
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.aide.codemodel.api.EntitySpace, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1 */
    @ey(method = -406284856210800904L)
    public long br(FileEntry fileEntry, Language language, long j, long j2, long j3, Type type, Type type2) throws Throwable {
        int i = this;
        try {
            if (BT) {
                iy.QX(3641532079678039476L, i, new Object[]{fileEntry, language, new Long(j), new Long(j2), new Long(j3), type, type2});
            }
            Type typeGn = language.getTypeSystem().gn(fileEntry, type, type2);
            try {
                return i.vJ(j) ? XX(fileEntry, language, j2, type, typeGn) : XX(fileEntry, language, j3, type2, typeGn);
            } catch (Throwable th) {
                th = th;
                if (vy) {
                    Object[] objArr = new Object[i];
                    objArr[0] = fileEntry;
                    objArr[1] = language;
                    objArr[2] = new Long(j);
                    objArr[3] = new Long(j2);
                    objArr[4] = new Long(j3);
                    objArr[5] = type;
                    objArr[6] = type2;
                    iy.rN(th, 3641532079678039476L, this, objArr);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i = 7;
        }
    }

    @ey(method = 635348307778101208L)
    public long ca(long j) {
        try {
            if (BT) {
                iy.tp(1899150790398567888L, this, new Long(j));
            }
            return j;
        } catch (Throwable th) {
            if (vy) {
                iy.j3(th, 1899150790398567888L, this, new Long(j));
            }
            throw th;
        }
    }

    @ey(method = 280938755000421093L)
    public boolean canDeclareOtherSuperClasstypes() {
        try {
            if (BT) {
                iy.gn(2530040371646524243L, this);
            }
            return this.superClassTypeAnalyzedClasses.size() == 0;
        } catch (Throwable th) {
            if (vy) {
                iy.aM(th, 2530040371646524243L, this);
            }
            throw th;
        }
    }

    @ey(method = -4610651604745978220L)
    public void cb(ClassType classType, Type type) {
        try {
            if (BT) {
                iy.EQ(-1550370431468990600L, this, classType, type);
            }
            classType.WB(type);
        } catch (Throwable th) {
            if (vy) {
                iy.Mr(th, -1550370431468990600L, this, classType, type);
            }
            throw th;
        }
    }

    @ey(method = -2265584307925613453L)
    public ClassType cn(FileEntry fileEntry, Language language, int i, Namespace namespace, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) throws Throwable {
        int i5;
        Namespace namespace2;
        try {
            if (BT) {
                iy.QX(753777309092641065L, this, new Object[]{fileEntry, language, new Integer(i), namespace, new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z), new Boolean(z2), new Boolean(z3)});
            }
            ClassType classTypeV5 = getFileInfo(fileEntry, language).v5(i, namespace, i4);
            try {
                classTypeV5.cT(i4, i3, namespace, i2, 0, classTypeV5, classTypeV5, z, false, false, false, z2, z3);
                namespace2 = namespace;
                i5 = i4;
                try {
                    getFileInfo(fileEntry, language).tp(namespace2, classTypeV5, i5);
                    return classTypeV5;
                } catch (Throwable th) {
                    th = th;
                    if (vy) {
                        iy.rN(th, 753777309092641065L, this, new Object[]{fileEntry, language, new Integer(i), namespace2, new Integer(i2), new Integer(i3), new Integer(i5), new Boolean(z), new Boolean(z2), new Boolean(z3)});
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                namespace2 = namespace;
                i5 = i4;
            }
        } catch (Throwable th3) {
            th = th3;
            i5 = i4;
            namespace2 = namespace;
        }
    }

    @ey(method = 4053295473220659129L)
    public int declareEntity(Entity entity) {
        try {
            if (BT) {
                iy.tp(3327586297060364031L, this, entity);
            }
            if (this.entityCount >= this.entities.length) {
                Entity[] entityArr = new Entity[(this.entities.length * 2) + 1];
                System.arraycopy(this.entities, 0, entityArr, 0, this.entities.length);
                this.entities = entityArr;
            }
            this.entities[this.entityCount] = entity;
            int i = this.entityCount;
            this.entityCount = i + 1;
            return i;
        } catch (Throwable th) {
            if (vy) {
                iy.j3(th, 3327586297060364031L, this, entity);
            }
            throw th;
        }
    }

    @ey(method = -1094987671243308112L)
    public void declareSuperClasstype(ClassType classType, ClassType classType2) {
        try {
            if (BT) {
                iy.EQ(-1684185029598863124L, this, classType, classType2);
            }
            j3(classType.getFile(), classType2);
            if (classType.areSuperClasstypesLoaded()) {
                return;
            }
            for (int i = 0; i < this.superClassTypeAnalyzedClasses.size(); i++) {
                if (classType2.hp((ClassType) getEntity(this.superClassTypeAnalyzedClasses.get(i)))) {
                    classType.declareCycliclyDefined();
                    classType2.declareCycliclyDefined();
                    aM(classType.getFile(), classType.getLanguage());
                    return;
                }
            }
            if (classType2.MP()) {
                classType.Ev();
                aM(classType.getFile(), classType.getLanguage());
            }
            if (!classType2.isCycliclyDefined()) {
                classType.zh(classType2);
            } else {
                classType.declareCycliclyDefined();
                aM(classType.getFile(), classType.getLanguage());
            }
        } catch (Throwable th) {
            if (vy) {
                iy.Mr(th, -1684185029598863124L, this, classType, classType2);
            }
            throw th;
        }
    }

    @ey(method = -3232429153813228953L)
    public void dx(Member member, Type type) {
        try {
            if (BT) {
                iy.EQ(2553367337676540677L, this, member, type);
            }
            member.Qq(type);
        } catch (Throwable th) {
            if (vy) {
                iy.Mr(th, 2553367337676540677L, this, member, type);
            }
            throw th;
        }
    }

    @ey(method = -1450545439559020800L)
    public void e9(FileEntry fileEntry, Language language) {
        try {
            if (BT) {
                iy.EQ(-1821317241389790840L, this, fileEntry, language);
            }
            getFileInfo(fileEntry, language).loadTypes();
        } catch (Throwable th) {
            if (vy) {
                iy.Mr(th, -1821317241389790840L, this, fileEntry, language);
            }
            throw th;
        }
    }

    @ey(method = 818797095970549905L)
    public void ef(Member member, long j) {
        try {
            if (BT) {
                iy.EQ(-10348700688073865L, this, member, new Long(j));
            }
            member.aj(j);
        } catch (Throwable th) {
            if (vy) {
                iy.Mr(th, -10348700688073865L, this, member, new Long(j));
            }
            throw th;
        }
    }

    @ey(method = 3584896677083503665L)
    public void er(FileEntry fileEntry, Language language, int i, Member member, int i2, int i3) {
        try {
            if (BT) {
                iy.QX(-1810612366348446725L, this, new Object[]{fileEntry, language, new Integer(i), member, new Integer(i2), new Integer(i3)});
            }
            MethodParameterType methodParameterTypeVH = getFileInfo(fileEntry, language).VH(i);
            methodParameterTypeVH.oY(i3, member, i2);
            member.Sf(i2, i3, methodParameterTypeVH);
        } catch (Throwable th) {
            if (vy) {
                iy.rN(th, -1810612366348446725L, this, new Object[]{fileEntry, language, new Integer(i), member, new Integer(i2), new Integer(i3)});
            }
            throw th;
        }
    }

    @ey(method = -3034837819948298576L)
    public MethodParameterType fY(FileEntry fileEntry, Language language, int i) {
        try {
            if (BT) {
                iy.we(-750046834604430440L, this, fileEntry, language, new Integer(i));
            }
            return getFileInfo(fileEntry, language).lg(i);
        } catch (Throwable th) {
            if (vy) {
                iy.U2(th, -750046834604430440L, this, fileEntry, language, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -3941000533010128909L)
    public double g3(long j) {
        try {
            if (BT) {
                iy.tp(-3301039291899870351L, this, new Long(j));
            }
            return Double.longBitsToDouble(j);
        } catch (Throwable th) {
            if (vy) {
                iy.j3(th, -3301039291899870351L, this, new Long(j));
            }
            throw th;
        }
    }

    @ey(method = 573340606545477744L)
    public Namespace gW(Namespace namespace, FileEntry fileEntry, Language language) {
        try {
            if (BT) {
                iy.we(-109445730207391172L, this, namespace, fileEntry, language);
            }
            namespace.Sf(fileEntry);
            getFileInfo(fileEntry, language).gn(namespace);
            return namespace;
        } catch (Throwable th) {
            if (vy) {
                iy.U2(th, -109445730207391172L, this, namespace, fileEntry, language);
            }
            throw th;
        }
    }

    @ey(method = -538655285333193693L)
    public MapOfInt<ClassType> getAllClasstypes(FileEntry fileEntry, Language language) {
        try {
            if (BT) {
                iy.EQ(-1694626713111563955L, this, fileEntry, language);
            }
            loadAllClasstypes();
            MapOfInt<ClassType> mapOfInt = new MapOfInt<>(this);
            this.allClassTypes.DEFAULT_ITERATOR.DW();
            while (this.allClassTypes.DEFAULT_ITERATOR.hasMoreElements()) {
                int iHw = this.allClassTypes.DEFAULT_ITERATOR.Hw();
                ClassType classType = (ClassType) this.allClassTypes.DEFAULT_ITERATOR.nextValue();
                if (classType.isReferable(fileEntry, language)) {
                    mapOfInt.insert(iHw, classType);
                }
            }
            et(zh("android", "view"), fileEntry, mapOfInt);
            et(zh("android", "widget"), fileEntry, mapOfInt);
            return mapOfInt;
        } catch (Throwable th) {
            if (vy) {
                iy.Mr(th, -1694626713111563955L, this, fileEntry, language);
            }
            throw th;
        }
    }

    @ey(method = -1223530427872956224L)
    public ClassType getClasstype(FileEntry fileEntry, Language language, int i) {
        try {
            if (BT) {
                iy.we(6321149786471012976L, this, fileEntry, language, new Integer(i));
            }
            return getFileInfo(fileEntry, language).J8(i);
        } catch (Throwable th) {
            if (vy) {
                iy.U2(th, 6321149786471012976L, this, fileEntry, language, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -637366269538443861L)
    public Entity getEntity(int i) {
        try {
            if (BT) {
                iy.u7(1023921883110642857L, this, i);
            }
            if (i == -1) {
                return null;
            }
            return this.entities[i];
        } catch (Throwable th) {
            if (vy) {
                iy.j3(th, 1023921883110642857L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 1796902786375784453L)
    public int getId(Entity entity) {
        try {
            if (BT) {
                iy.tp(-4312133694343440213L, this, entity);
            }
            if (entity == null) {
                return -1;
            }
            return entity.getId();
        } catch (Throwable th) {
            if (vy) {
                iy.j3(th, -4312133694343440213L, this, entity);
            }
            throw th;
        }
    }

    @ey(method = 70400930516099205L)
    public ClassType getRootClasstype(FileEntry fileEntry, Language language) {
        try {
            if (BT) {
                iy.EQ(7780890913107938703L, this, fileEntry, language);
            }
            return language.getTypeSystem().Zo(fileEntry);
        } catch (Throwable th) {
            if (vy) {
                iy.Mr(th, 7780890913107938703L, this, fileEntry, language);
            }
            throw th;
        }
    }

    @ey(method = -3166532456807478980L)
    public Namespace getRootNamespace() {
        try {
            if (BT) {
                iy.gn(-5384242485287903808L, this);
            }
            if (this.rootNamespace == null) {
                this.rootNamespace = new Namespace(this, this.identifiers, this.fileSpace, this.identifiers.get(""), null);
            }
            return this.rootNamespace;
        } catch (Throwable th) {
            if (vy) {
                iy.aM(th, -5384242485287903808L, this);
            }
            throw th;
        }
    }

    @ey(method = 3537363439500728173L)
    public MapOf<ClassType, Namespace> getToplevelClasstypesOfFile(FileEntry fileEntry) {
        try {
            if (BT) {
                iy.tp(-626380532712627065L, this, fileEntry);
            }
            MapOf<ClassType, Namespace> mapOf = new MapOf<>(this);
            if (fileEntry.getCodeModel() != null) {
                for (Language language : fileEntry.getCodeModel().getLanguages()) {
                    if (language.getSignatureAnalyzer() != null) {
                        mapOf.J8(getFileInfo(fileEntry, language).yS());
                    }
                }
            }
            return mapOf;
        } catch (Throwable th) {
            if (vy) {
                iy.j3(th, -626380532712627065L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = 1235235790867179444L)
    public ClassType gn(FileEntry fileEntry, Language language, int i, Namespace namespace, ClassType classType, boolean z, boolean z2) {
        try {
            if (BT) {
                iy.QX(171089976245748944L, this, new Object[]{fileEntry, language, new Integer(i), namespace, classType, new Boolean(z), new Boolean(z2)});
            }
            int i2 = this.identifiers.get(i + "");
            ClassType classTypeV5 = getFileInfo(fileEntry, language).v5(i, namespace, i2);
            classTypeV5.cT(i2, 0, namespace, 0, 0, classType.ys(), classType, z2, true, false, z, false, false);
            return classTypeV5;
        } catch (Throwable th) {
            if (vy) {
                iy.rN(th, 171089976245748944L, this, new Object[]{fileEntry, language, new Integer(i), namespace, classType, new Boolean(z), new Boolean(z2)});
            }
            throw th;
        }
    }

    @ey(method = -34444747532356920L)
    public PrimitiveType hK(Language language, int i) {
        try {
            if (BT) {
                iy.EQ(4786369639161559008L, this, language, new Integer(i));
            }
            long languageId = (this.fileSpace.getLanguageId(language) << 32) | i;
            if (this.primitiveTypes.FH(languageId)) {
                return (PrimitiveType) getEntity(this.primitiveTypes.v5(languageId));
            }
            PrimitiveType primitiveType = new PrimitiveType(this, this.fileSpace, language.getTypeSystem().j6(i), language);
            this.primitiveTypes.gn(languageId, primitiveType.getId());
            return primitiveType;
        } catch (Throwable th) {
            if (vy) {
                iy.Mr(th, 4786369639161559008L, this, language, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -4400145894158501737L)
    public ArrayType hz(Type type, int i) {
        try {
            if (BT) {
                iy.EQ(-1761694391190523395L, this, type, new Integer(i));
            }
            long id = (type.getId() << 32) | i;
            if (this.arrayTypes.FH(id)) {
                return (ArrayType) getEntity(this.arrayTypes.v5(id));
            }
            ArrayType arrayType = new ArrayType(this.fileSpace, this, type, i);
            this.arrayTypes.gn(id, arrayType.getId());
            return arrayType;
        } catch (Throwable th) {
            if (vy) {
                iy.Mr(th, -1761694391190523395L, this, type, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 2325639624596239600L)
    public boolean iW(FileEntry fileEntry, Language language, Type type, Type type2) {
        try {
            if (BT) {
                iy.J0(-595983637764141440L, this, fileEntry, language, type, type2);
            }
            return language.getTypeSystem().VH(fileEntry, type, type2);
        } catch (Throwable th) {
            if (vy) {
                iy.a8(th, -595983637764141440L, this, fileEntry, language, type, type2);
            }
            throw th;
        }
    }

    @ey(method = -504083334909982359L)
    public void invalidateAll() {
        try {
            if (BT) {
                iy.gn(-204635157423769613L, this);
            }
            this.namespacesLoaded = false;
            this.U2.clear();
            for (int i = 0; i < this.entities.length; i++) {
                if (getEntity(i) instanceof Namespace) {
                    ((Namespace) getEntity(i)).invalidate();
                }
            }
            for (int i2 = 0; i2 < this.entities.length; i2++) {
                if (getEntity(i2) instanceof ParameterizedType) {
                    ((ParameterizedType) getEntity(i2)).invalidate();
                }
            }
            this.allClassTypes = null;
            this.fileInfoArray.j6.DW();
            while (this.fileInfoArray.j6.j6()) {
                this.fileInfoArray.j6.Hw().invalidate();
            }
            this.fileInheritanceDependencies.clear();
        } catch (Throwable th) {
            if (vy) {
                iy.aM(th, -204635157423769613L, this);
            }
            throw th;
        }
    }

    @ey(method = -1776840157358884980L)
    public void j3(FileEntry fileEntry, Entity entity) {
        try {
            if (BT) {
                iy.EQ(-845594811543129096L, this, fileEntry, entity);
            }
            if (entity.isClassType()) {
                FileEntry file = entity.getFile();
                if (file.isArchiveEntry()) {
                    file = file.getParentArchive();
                }
                if (fileEntry != file) {
                    this.fileInheritanceDependencies.v5(fileEntry.getId(), file.getId());
                    return;
                }
                return;
            }
            if (entity.isParameterizedType()) {
                FileEntry file2 = ((ParameterizedType) entity).getClassType().getFile();
                if (file2.isArchiveEntry()) {
                    file2 = file2.getParentArchive();
                }
                if (fileEntry != file2) {
                    this.fileInheritanceDependencies.v5(fileEntry.getId(), file2.getId());
                }
            }
        } catch (Throwable th) {
            if (vy) {
                iy.Mr(th, -845594811543129096L, this, fileEntry, entity);
            }
            throw th;
        }
    }

    @ey(method = 5348902876302735360L)
    public Member jw(FileEntry fileEntry, Language language, int i) {
        try {
            if (BT) {
                iy.we(5036332420191440752L, this, fileEntry, language, new Integer(i));
            }
            return getFileInfo(fileEntry, language).a8(i);
        } catch (Throwable th) {
            if (vy) {
                iy.U2(th, 5036332420191440752L, this, fileEntry, language, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -573575558003271065L)
    public SetOfInt k2(int i, int i2, FileEntry fileEntry, Language language) {
        try {
            if (BT) {
                iy.J0(740486942640970525L, this, new Integer(i), new Integer(i2), fileEntry, language);
            }
            loadAllClasstypes();
            SetOfInt setOfInt = new SetOfInt();
            this.allClassTypes.DEFAULT_ITERATOR.init(i);
            while (this.allClassTypes.DEFAULT_ITERATOR.hasMoreElements()) {
                ClassType classType = (ClassType) this.allClassTypes.DEFAULT_ITERATOR.nextValue();
                if (!classType.isReferable(fileEntry, language)) {
                    setOfInt.put(classType.getFile().gn());
                }
            }
            return setOfInt;
        } catch (Throwable th) {
            if (vy) {
                iy.a8(th, 740486942640970525L, this, new Integer(i), new Integer(i2), fileEntry, language);
            }
            throw th;
        }
    }

    @ey(method = -544942130900097719L)
    public long kQ(FileEntry fileEntry, int i, long j, Type type) {
        try {
            if (BT) {
                iy.J0(4263234155383232907L, this, fileEntry, new Integer(i), new Long(j), type);
            }
            boolean z = true;
            if (i == 1) {
                return j;
            }
            if (i == 2) {
                int semantic = type.getSemantic();
                if (semantic != 3 && semantic != 5 && semantic != 7) {
                    if (semantic != 9) {
                        switch (semantic) {
                            case 13:
                                return sy(-Mz(j));
                            case 14:
                                return Qq(-g3(j));
                        }
                    }
                    ca(j);
                    long j2 = -j;
                    lp(j2);
                    return j2;
                }
                return aj(-I(j));
            }
            if (i == 20) {
                int semantic2 = type.getSemantic();
                if (semantic2 != 12) {
                    switch (semantic2) {
                        case 9:
                            ca(j);
                            long j3 = (-1) ^ j;
                            lp(j3);
                            return j3;
                    }
                }
                return aj(I(j) ^ (-1));
            }
            if (i == 21) {
                if (vJ(j)) {
                    z = false;
                }
                return x9(z);
            }
            throw new e4();
        } catch (Throwable th) {
            if (vy) {
                iy.a8(th, 4263234155383232907L, this, fileEntry, new Integer(i), new Long(j), type);
            }
            throw th;
        }
    }

    @ey(method = 8256821119563003516L)
    public void kf() {
        try {
            if (BT) {
                iy.gn(7835370097256463968L, this);
            }
            this.namespacesLoaded = false;
            this.U2.clear();
            for (int i = 0; i < this.entities.length; i++) {
                if (getEntity(i) instanceof Namespace) {
                    ((Namespace) getEntity(i)).invalidate();
                }
            }
            for (int i2 = 0; i2 < this.entities.length; i2++) {
                if (getEntity(i2) instanceof ParameterizedType) {
                    ((ParameterizedType) getEntity(i2)).invalidate();
                }
            }
        } catch (Throwable th) {
            if (vy) {
                iy.aM(th, 7835370097256463968L, this);
            }
            throw th;
        }
    }

    @ey(method = -1240451977893834713L)
    public void lg(Member member, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        try {
            if (BT) {
                iy.QX(945672355370641873L, this, new Object[]{member, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Integer(i9), new Integer(i10), new Integer(i11)});
            }
            member.g3(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11);
        } catch (Throwable th) {
            if (vy) {
                iy.rN(th, 945672355370641873L, this, new Object[]{member, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Integer(i9), new Integer(i10), new Integer(i11)});
            }
            throw th;
        }
    }

    @ey(method = 1925689268333010587L)
    public void load(StoreInputStream storeInputStream) {
        try {
            if (BT) {
                iy.tp(-4182470358498169871L, this, storeInputStream);
            }
            this.rootNamespace = (Namespace) getEntity(storeInputStream.readInt());
            this.usedDirectories = new MapOfIntLong(storeInputStream);
            this.fileInheritanceDependencies = new RelationOfIntInt(storeInputStream);
            this.fileInfoArray = new ArrayOf<>();
            int i = storeInputStream.readInt();
            for (int i2 = 0; i2 < i; i2++) {
                this.fileInfoArray.Zo(storeInputStream.readInt(), new FileInfo(this.fileSpace, this, storeInputStream));
                if (storeInputStream.readChar() != 'S') {
                    throw new IOException("Corrupted file ");
                }
            }
            this.arrayTypes = new MapOfLongInt(storeInputStream);
            this.primitiveTypes = new MapOfLongInt(storeInputStream);
            this.pointerTypes = new FunctionOfIntInt(storeInputStream);
            this.methodParameterTypeVariables = new FunctionOfIntInt(storeInputStream);
            this.parameterizedTypes = new MapOfIntArrayInt(storeInputStream);
            for (int i3 = 0; i3 < this.entityCount; i3++) {
                if (this.entities[i3] != null) {
                    this.entities[i3].load(storeInputStream);
                    if (storeInputStream.readChar() != 'E') {
                        throw new IOException("Corrupted file " + this.entities[i3]);
                    }
                }
            }
            this.U2 = new RelationOfIntInt(storeInputStream);
            int i4 = storeInputStream.readInt();
            for (int i5 = 0; i5 < i4; i5++) {
                this.lg.put(this.fileSpace.getFileEntry(storeInputStream.readInt()), storeInputStream.readUTF());
            }
        } catch (Throwable th) {
            if (vy) {
                iy.j3(th, -4182470358498169871L, this, storeInputStream);
            }
            throw th;
        }
    }

    @ey(method = -478880552137579263L)
    public void loadEntries(StoreInputStream storeInputStream) {
        try {
            if (BT) {
                iy.tp(2528305075792053975L, this, storeInputStream);
            }
            int i = storeInputStream.readInt();
            this.entityCount = i;
            this.entities = new Entity[i * 2];
            for (int i2 = 0; i2 < this.entityCount; i2++) {
                switch (storeInputStream.readByte()) {
                    case 1:
                        this.entities[i2] = new Member(this, this.identifiers, this.fileSpace);
                        break;
                    case 3:
                        this.entities[i2] = new ClassType(this, this.fileSpace, this.identifiers);
                        break;
                    case 4:
                        this.entities[i2] = new ArrayType(this.fileSpace, this);
                        break;
                    case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                        this.entities[i2] = new Namespace(this, this.identifiers, this.fileSpace);
                        break;
                    case UserTouchAction.CLICK_KIND /* 7 */:
                        this.entities[i2] = new MethodParameterType(this, this.identifiers, this.fileSpace);
                        break;
                    case 8:
                        this.entities[i2] = new ParameterType(this, this.identifiers, this.fileSpace);
                        break;
                    case 9:
                        this.entities[i2] = new ParameterizedType(this.fileSpace, this);
                        break;
                    case 10:
                        this.entities[i2] = new MethodParameterTypeVariable(this.fileSpace, this);
                        break;
                    case 11:
                        this.entities[i2] = new PointerType(this.fileSpace, this);
                        break;
                    case 12:
                        this.entities[i2] = new PrimitiveType(this, this.fileSpace);
                        break;
                }
            }
        } catch (Throwable th) {
            if (vy) {
                iy.j3(th, 2528305075792053975L, this, storeInputStream);
            }
            throw th;
        }
    }

    @ey(method = -3783664675180779085L)
    public void loadNamespaces() {
        try {
            if (BT) {
                iy.gn(4976855651209299285L, this);
            }
        } catch (Throwable th) {
            if (vy) {
                iy.aM(th, 4976855651209299285L, this);
            }
            throw th;
        }
    }

    @ey(method = -539083011585521425L)
    public void loadSuperClasstypes(FileEntry fileEntry, Language language, ClassType classType) {
        try {
            if (BT) {
                iy.we(-2592609782563185075L, this, fileEntry, language, classType);
            }
            if (language.getSignatureAnalyzer() != null) {
                language.getSignatureAnalyzer().doLoadSuperClassTypes(classType);
            }
        } catch (Throwable th) {
            if (vy) {
                iy.U2(th, -2592609782563185075L, this, fileEntry, language, classType);
            }
            throw th;
        }
    }

    @ey(method = -3891885805736081580L)
    public void loadSyntax(FileEntry fileEntry, Language language) {
        try {
            if (BT) {
                iy.EQ(2332870718255955208L, this, fileEntry, language);
            }
            getFileInfo(fileEntry, language).loadSyntax();
        } catch (Throwable th) {
            if (vy) {
                iy.Mr(th, 2332870718255955208L, this, fileEntry, language);
            }
            throw th;
        }
    }

    @ey(method = 1292330112718871052L)
    public long lp(long j) {
        try {
            if (BT) {
                iy.tp(-2278508390829081720L, this, new Long(j));
            }
            return j;
        } catch (Throwable th) {
            if (vy) {
                iy.j3(th, -2278508390829081720L, this, new Long(j));
            }
            throw th;
        }
    }

    @ey(method = 4908856561268373832L)
    public void nw(ClassType classType) {
        try {
            if (BT) {
                iy.tp(-4061833673673506016L, this, classType);
            }
            if (!classType.isToplevel() && classType.getEnclosingClassType().isCycliclyDefined()) {
                classType.declareCycliclyDefined();
            }
            this.superClassTypeAnalyzedClasses.push(classType.getId());
            if (classType.areSuperClasstypesLoaded()) {
                return;
            }
            classType.declareSuperClasstypesLoading();
        } catch (Throwable th) {
            if (vy) {
                iy.j3(th, -4061833673673506016L, this, classType);
            }
            throw th;
        }
    }

    @ey(method = 480880077877071565L)
    public String oY(Entity entity) {
        String strCb;
        try {
            if (BT) {
                iy.tp(-785468906078296401L, this, entity);
            }
            FileEntry file = entity.getFile();
            if (file == null) {
                return "";
            }
            for (SyntaxTree syntaxTree : this.syntaxTreeSpace.QX(file)) {
                int iJO = jO(syntaxTree, syntaxTree.getRootNode(), entity.Ws(), entity.QX());
                if (iJO != -1 && (strCb = syntaxTree.getLanguage().getSyntax().cb(syntaxTree, iJO)) != null) {
                    return strCb;
                }
                this.syntaxTreeSpace.releaseSyntaxTree(syntaxTree);
            }
            return "";
        } catch (Throwable th) {
            if (vy) {
                iy.j3(th, -785468906078296401L, this, entity);
            }
            throw th;
        }
    }

    @ey(method = 3101221341683972316L)
    public void oy(ClassType classType) {
        try {
            if (BT) {
                iy.tp(520003194432136272L, this, classType);
            }
            if (classType.getLanguage().getSignatureAnalyzer() != null) {
                classType.getLanguage().getSignatureAnalyzer().EQ(classType);
            }
        } catch (Throwable th) {
            if (vy) {
                iy.j3(th, 520003194432136272L, this, classType);
            }
            throw th;
        }
    }

    @ey(method = 3687510903566399760L)
    public void pN(ClassType classType) {
        try {
            if (BT) {
                iy.tp(-2739437282291390040L, this, classType);
            }
            if (classType.getLanguage().getSignatureAnalyzer() != null) {
                classType.getLanguage().getSignatureAnalyzer().DW(classType);
            }
        } catch (Throwable th) {
            if (vy) {
                iy.j3(th, -2739437282291390040L, this, classType);
            }
            throw th;
        }
    }

    @ey(method = -2026789345866578304L)
    public MethodParameterTypeVariable qp(MethodParameterType methodParameterType) {
        try {
            if (BT) {
                iy.tp(-473401860508183616L, this, methodParameterType);
            }
            if (!this.methodParameterTypeVariables.Hw(methodParameterType.getId())) {
                this.methodParameterTypeVariables.Zo(methodParameterType.getId(), new MethodParameterTypeVariable(this.fileSpace, this, methodParameterType).getId());
            }
            return (MethodParameterTypeVariable) getEntity(this.methodParameterTypeVariables.get(methodParameterType.getId()));
        } catch (Throwable th) {
            if (vy) {
                iy.j3(th, -473401860508183616L, this, methodParameterType);
            }
            throw th;
        }
    }

    @ey(method = 3475039321902572815L)
    public Member rN(FileEntry fileEntry, Language language, int i, ClassType classType, int i2, int i3, int i4, int i5, boolean z, boolean z2, int i6) {
        try {
            if (BT) {
                iy.QX(-1367997037355589003L, this, new Object[]{fileEntry, language, new Integer(i), classType, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Boolean(z), new Boolean(z2), new Integer(i6)});
            }
            Member member = getFileInfo(fileEntry, language).getMember(i);
            classType.fY(i3, member);
            member.I(classType, i2, i4, i5, z, z2, 0, i3, false, false, false, i6);
            return member;
        } catch (Throwable th) {
            if (vy) {
                iy.rN(th, -1367997037355589003L, this, new Object[]{fileEntry, language, new Integer(i), classType, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Boolean(z), new Boolean(z2), new Integer(i6)});
            }
            throw th;
        }
    }

    @ey(method = 3361380435359567187L)
    public void ro(Member member, int i, int i2, int i3) {
        try {
            if (BT) {
                iy.J0(-5385528770558359727L, this, member, new Integer(i), new Integer(i2), new Integer(i3));
            }
            member.x9(i, i2, i3);
        } catch (Throwable th) {
            if (vy) {
                iy.a8(th, -5385528770558359727L, this, member, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = -1052499222116468247L)
    public void sE(ClassType classType) {
        try {
            if (BT) {
                iy.tp(-2984470646690755061L, this, classType);
            }
            if (classType.getLanguage().getSignatureAnalyzer() != null) {
                classType.getLanguage().getSignatureAnalyzer().Hw(classType);
            }
        } catch (Throwable th) {
            if (vy) {
                iy.j3(th, -2984470646690755061L, this, classType);
            }
            throw th;
        }
    }

    @ey(method = -799781811882777243L)
    public void sG(Member member, Type type, int i) {
        try {
            if (BT) {
                iy.we(2235990742665066783L, this, member, type, new Integer(i));
            }
            member.sy(type, i);
        } catch (Throwable th) {
            if (vy) {
                iy.U2(th, 2235990742665066783L, this, member, type, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -1837525446974619316L)
    public void sM(int i) {
        try {
            if (BT) {
                iy.u7(-1604209540252994080L, this, i);
            }
            this.er -= i;
        } catch (Throwable th) {
            if (vy) {
                iy.j3(th, -1604209540252994080L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 2331091934605836960L)
    public void sg(Member member) {
        try {
            if (BT) {
                iy.tp(1735029981641675104L, this, member);
            }
            if (member.getLanguage().getSignatureAnalyzer() != null) {
                member.getLanguage().getSignatureAnalyzer().Zo(member);
            }
        } catch (Throwable th) {
            if (vy) {
                iy.j3(th, 1735029981641675104L, this, member);
            }
            throw th;
        }
    }

    @ey(method = 632940785044695864L)
    public ClassType sh(FileEntry fileEntry, Language language, int i, Namespace namespace, int i2, int i3, int i4, int i5) throws Throwable {
        int i6;
        Namespace namespace2;
        try {
            if (BT) {
                iy.QX(1198186026938927936L, this, new Object[]{fileEntry, language, new Integer(i), namespace, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            }
            ClassType classTypeV5 = getFileInfo(fileEntry, language).v5(i, namespace, i4);
            try {
                classTypeV5.cT(i4, i3, namespace, i2, i5, classTypeV5, classTypeV5, false, false, false, false, false, false);
                namespace2 = namespace;
                i6 = i4;
                try {
                    getFileInfo(fileEntry, language).tp(namespace2, classTypeV5, i6);
                    return classTypeV5;
                } catch (Throwable th) {
                    th = th;
                    if (vy) {
                        iy.rN(th, 1198186026938927936L, this, new Object[]{fileEntry, language, new Integer(i), namespace2, new Integer(i2), new Integer(i3), new Integer(i6), new Integer(i5)});
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                namespace2 = namespace;
                i6 = i4;
            }
        } catch (Throwable th3) {
            th = th3;
            i6 = i4;
            namespace2 = namespace;
        }
    }

    @ey(method = 1195351360393167276L)
    public long sy(float f) {
        try {
            if (BT) {
                iy.tp(2465211235775125032L, this, new Float(f));
            }
            return Float.floatToIntBits(f);
        } catch (Throwable th) {
            if (vy) {
                iy.j3(th, 2465211235775125032L, this, new Float(f));
            }
            throw th;
        }
    }

    @ey(method = 314080542312988968L)
    public void tp(ParameterType parameterType, Type type) {
        try {
            if (BT) {
                iy.EQ(-5684486093282163824L, this, parameterType, type);
            }
            parameterType.FN(type);
        } catch (Throwable th) {
            if (vy) {
                iy.Mr(th, -5684486093282163824L, this, parameterType, type);
            }
            throw th;
        }
    }

    @ey(method = -59597561363711949L)
    public void u7(MethodParameterType methodParameterType, Type type) {
        try {
            if (BT) {
                iy.EQ(1492007455640297L, this, methodParameterType, type);
            }
            methodParameterType.FN(type);
        } catch (Throwable th) {
            if (vy) {
                iy.Mr(th, 1492007455640297L, this, methodParameterType, type);
            }
            throw th;
        }
    }

    @ey(method = 1641451295830381056L)
    public void update() {
        try {
            if (BT) {
                iy.gn(130510826588867592L, this);
            }
            SetOfFileEntry setOfFileEntry = new SetOfFileEntry(this.fileSpace);
            SetOfFileEntry setOfFileEntry2 = new SetOfFileEntry(this.fileSpace);
            this.fileInfoArray.j6.DW();
            while (this.fileInfoArray.j6.j6()) {
                if (this.Hw != null && this.Hw.hz() && setOfFileEntry.we() == 0 && setOfFileEntry2.we() == 0) {
                    return;
                }
                FileInfo fileInfoHw = this.fileInfoArray.j6.Hw();
                Language language = fileInfoHw.getLanguage();
                FileEntry fileEntryXL = fileInfoHw.XL();
                long syntaxVersion = fileEntryXL.getSyntaxVersion();
                long version = fileInfoHw.getVersion();
                if (syntaxVersion != version && version != -1) {
                    this.lg.remove(fileEntryXL);
                    fileInfoHw.invalidatePositions();
                    SyntaxTree syntaxTreeV5 = this.syntaxTreeSpace.v5(fileEntryXL, language);
                    long declarationDigest = syntaxTreeV5.getDeclarationDigest();
                    if (declarationDigest != fileInfoHw.getDeclarationDigest() && fileInfoHw.getDeclarationDigest() != -1) {
                        fileInfoHw.sG(declarationDigest);
                        setOfFileEntry.gn(fileEntryXL);
                    }
                    long classDeclarationDigest = syntaxTreeV5.getClassDeclarationDigest();
                    if (classDeclarationDigest != fileInfoHw.getClassDeclarationDigest() && fileInfoHw.getClassDeclarationDigest() != -1) {
                        fileInfoHw.cb(classDeclarationDigest);
                        setOfFileEntry2.gn(fileEntryXL);
                    }
                    if (fileEntryXL.getArchiveVersion() != fileInfoHw.getArchiveVersion()) {
                        setOfFileEntry2.gn(fileEntryXL);
                    }
                    fileInfoHw.ef(syntaxVersion);
                    this.syntaxTreeSpace.releaseSyntaxTree(syntaxTreeV5);
                }
            }
            if (setOfFileEntry.we() > 0) {
                for (int i = 0; i < this.entities.length; i++) {
                    if (getEntity(i) instanceof Namespace) {
                        ((Namespace) getEntity(i)).XX();
                    }
                }
            }
            if (setOfFileEntry2.we() > 0) {
                this.fileInfoArray.j6.DW();
                while (this.fileInfoArray.j6.j6()) {
                    FileInfo fileInfoHw2 = this.fileInfoArray.j6.Hw();
                    if (setOfFileEntry2.contains(fileInfoHw2.fileEntry)) {
                        fileInfoHw2.invalidate();
                        fileInfoHw2.invalidateNamespaces();
                    }
                }
                invalidateAll();
                return;
            }
            if (setOfFileEntry.we() > 0) {
                for (int i2 = 0; i2 < this.entities.length; i2++) {
                    if (getEntity(i2) instanceof ParameterizedType) {
                        ((ParameterizedType) getEntity(i2)).invalidate();
                    }
                }
            }
            SetOfFileEntry setOfFileEntry3 = new SetOfFileEntry(this.fileSpace);
            this.fileInfoArray.j6.DW();
            while (this.fileInfoArray.j6.j6()) {
                FileInfo fileInfoHw3 = this.fileInfoArray.j6.Hw();
                FileEntry fileEntry = fileInfoHw3.fileEntry;
                if (!setOfFileEntry.contains(fileEntry)) {
                    setOfFileEntry.j6.init();
                    while (true) {
                        if (!setOfFileEntry.j6.hasMoreElements()) {
                            break;
                        }
                        if (this.fileInheritanceDependencies.contains(fileEntry.getId(), setOfFileEntry.j6.nextKey().getId())) {
                            setOfFileEntry3.gn(fileEntry);
                            fileInfoHw3.invalidate();
                            break;
                        }
                    }
                } else {
                    setOfFileEntry3.gn(fileEntry);
                    fileInfoHw3.invalidate();
                }
            }
            this.fileInheritanceDependencies.tp(setOfFileEntry3);
        } catch (Throwable th) {
            if (vy) {
                iy.aM(th, 130510826588867592L, this);
            }
            throw th;
        }
    }

    @ey(method = 3146255278942256152L)
    public boolean v5(int i, int i2) {
        try {
            if (BT) {
                iy.EQ(1573514387323540080L, this, new Integer(i), new Integer(i2));
            }
            return this.U2.contains(i, i2);
        } catch (Throwable th) {
            if (vy) {
                iy.Mr(th, 1573514387323540080L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 2083075342916595768L)
    public boolean vJ(long j) {
        try {
            if (BT) {
                iy.tp(-200330970782002368L, this, new Long(j));
            }
            return j == 1;
        } catch (Throwable th) {
            if (vy) {
                iy.j3(th, -200330970782002368L, this, new Long(j));
            }
            throw th;
        }
    }

    @ey(method = 6870539029322506252L)
    public void vy(ParameterType parameterType, int i, int i2, int i3) {
        try {
            if (BT) {
                iy.J0(-3902923984208216800L, this, parameterType, new Integer(i), new Integer(i2), new Integer(i3));
            }
            parameterType.jO(i, i2, i3);
        } catch (Throwable th) {
            if (vy) {
                iy.a8(th, -3902923984208216800L, this, parameterType, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 2588555224110435905L)
    public ParameterType w9(FileEntry fileEntry, Language language, int i) {
        try {
            if (BT) {
                iy.we(1415124843603846167L, this, fileEntry, language, new Integer(i));
            }
            return getFileInfo(fileEntry, language).er(i);
        } catch (Throwable th) {
            if (vy) {
                iy.U2(th, 1415124843603846167L, this, fileEntry, language, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2859083720130612L)
    public Member we(FileEntry fileEntry, Language language, int i, ClassType classType, int i2, int i3, int i4, boolean z, int i5) {
        try {
            if (BT) {
                iy.QX(5486375191895998768L, this, new Object[]{fileEntry, language, new Integer(i), classType, new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z), new Integer(i5)});
            }
            Member member = getFileInfo(fileEntry, language).getMember(i);
            classType.declareConstructor(member);
            member.I(classType, i2, i3, i4, z, false, 0, classType.getIdentifier(), true, false, false, i5);
            return member;
        } catch (Throwable th) {
            if (vy) {
                iy.rN(th, 5486375191895998768L, this, new Object[]{fileEntry, language, new Integer(i), classType, new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z), new Integer(i5)});
            }
            throw th;
        }
    }

    @ey(method = -2687681549163703036L)
    public long x9(boolean z) {
        try {
            if (BT) {
                iy.Ws(-2291043872373431440L, this, z);
            }
            return z ? 1L : 0L;
        } catch (Throwable th) {
            if (vy) {
                iy.j3(th, -2291043872373431440L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 2120207909581383029L)
    public MapOf<ClassType, Entity> yO(int i, int i2, FileEntry fileEntry, Language language) {
        try {
            if (BT) {
                iy.J0(2936257818110768491L, this, new Integer(i), new Integer(i2), fileEntry, language);
            }
            MapOf<ClassType, Entity> mapOfCU = CU(i, i2, fileEntry, language);
            if (mapOfCU.Mr() == 0) {
                wc(zh("android", "view"), i, i2, fileEntry, mapOfCU);
                wc(zh("android", "widget"), i, i2, fileEntry, mapOfCU);
            }
            return mapOfCU;
        } catch (Throwable th) {
            if (vy) {
                iy.a8(th, 2936257818110768491L, this, new Integer(i), new Integer(i2), fileEntry, language);
            }
            throw th;
        }
    }

    @ey(method = -617695176632220684L)
    public void yS(MethodParameterType methodParameterType, int i, int i2, int i3) {
        try {
            if (BT) {
                iy.J0(5587183027833951312L, this, methodParameterType, new Integer(i), new Integer(i2), new Integer(i3));
            }
            methodParameterType.jO(i, i2, i3);
        } catch (Throwable th) {
            if (vy) {
                iy.a8(th, 5587183027833951312L, this, methodParameterType, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = -339646211989036035L)
    public void ys(long j) {
        try {
            if (BT) {
                iy.tp(216405034906327083L, this, new Long(j));
            }
            if (this.er > j) {
                this.gn.clear();
                this.u7.DW();
                this.fileInfoArray.j6.DW();
                while (this.fileInfoArray.j6.j6()) {
                    int iFH = this.fileInfoArray.j6.FH();
                    FileInfo fileInfoHw = this.fileInfoArray.j6.Hw();
                    if (fileInfoHw.cn() > 0) {
                        this.gn.add(iFH);
                        this.u7.j6(fileInfoHw.ei());
                    }
                }
                gG(0, this.gn.size() - 1);
                for (int i = 0; i < this.gn.size() && this.er > j; i++) {
                    this.fileInfoArray.Hw(this.gn.get(i)).Sf();
                }
                for (int i2 = 0; i2 < this.entities.length; i2++) {
                    if (getEntity(i2) instanceof ParameterizedType) {
                        ((ParameterizedType) getEntity(i2)).invalidate();
                    }
                }
            }
        } catch (Throwable th) {
            if (vy) {
                iy.j3(th, 216405034906327083L, this, new Long(j));
            }
            throw th;
        }
    }

    @ey(method = 1212963907497719616L)
    public Namespace zh(String... strArr) {
        try {
            if (BT) {
                iy.tp(2568345923019884592L, this, strArr);
            }
            Namespace rootNamespace = getRootNamespace();
            for (String str : strArr) {
                rootNamespace = rootNamespace.OW(this.identifiers.get(str));
            }
            return rootNamespace;
        } catch (Throwable th) {
            if (vy) {
                iy.j3(th, 2568345923019884592L, this, strArr);
            }
            throw th;
        }
    }

    @cy(clazz = 1853201653349856904L, container = 1853201653349856904L, user = true)
    private static final class FileInfo {

        @fy
        private static /* synthetic */ boolean BT;

        @gy
        private static /* synthetic */ boolean vy;

        @dy(field = 3014511215368588504L)
        private long archiveVersion;

        @dy(field = 4996670099037687064L)
        private long classdecldigest;

        @dy(field = -2307174184859820255L)
        private FunctionOfIntInt classtypes;

        @dy(field = 4323038379656341068L)
        private SetOfInt classtypesExist;

        @dy(field = 114766986893259240L)
        private boolean corrupted;

        @dy(field = -1906127280816209080L)
        private long decldigest;

        @dy(field = 2762664290162920660L)
        private final EntitySpace entitySpace;

        @dy(field = 2027213667482248004L)
        private FileEntry fileEntry;

        @dy(field = 2198425559783450860L)
        private final FileSpace fileSpace;

        @dy(field = 2327431713841459824L)
        private int gW;

        @dy(field = 3718142569651299273L)
        private int languageId;

        @dy(field = -15076868617917675L)
        private ClassType mainClassType;

        @dy(field = 2354279187002204231L)
        private FunctionOfIntInt members;

        @dy(field = 4478145137904907944L)
        private SetOfInt membersExist;

        @dy(field = -4746642197411726627L)
        private FunctionOfIntInt methodparametertypes;

        @dy(field = -1634777808345109756L)
        private SetOfInt methodparametertypesExist;

        @dy(field = -1070990073193770564L)
        private SetOf<Namespace> namespaces;

        @dy(field = -160305487768115865L)
        private boolean packageLoaded;

        @dy(field = -1535036590208026296L)
        private FunctionOfIntInt parametertypes;

        @dy(field = 625915112547844065L)
        private SetOfInt parametertypesExist;

        @dy(field = 3081928074949433655L)
        private boolean positionsLoaded;

        @dy(field = 3461564316219694972L)
        private boolean syntaxloaded;

        @dy(field = -2191829753501617355L)
        private MapOfIntInt toplevelclasstypeIdentifiers;

        @dy(field = 7334112144555175496L)
        private MapOf<ClassType, Namespace> toplevelclasstypes;

        @dy(field = -859443897133868904L)
        private boolean typesLoaded;

        @dy(field = 158853282733956032L)
        private long version;

        @dy(field = 695907513579198568L)
        private SetOfInt yS;

        static {
            iy.Zo(FileInfo.class);
        }

        @ey(method = 1105569973199300247L)
        public FileInfo(FileSpace fileSpace, EntitySpace entitySpace, FileEntry fileEntry, Language language) {
            try {
                if (BT) {
                    iy.J0(632035320588475273L, null, fileSpace, entitySpace, fileEntry, language);
                }
                this.entitySpace = entitySpace;
                this.fileSpace = fileSpace;
                this.fileEntry = fileEntry;
                int languageId = fileSpace.getLanguageId(language);
                this.languageId = languageId;
                if (languageId == -1) {
                    System.out.println(languageId);
                }
                this.classdecldigest = -1L;
                this.decldigest = -1L;
                this.version = -1L;
                this.namespaces = new SetOf<>(entitySpace);
                this.toplevelclasstypes = new MapOf<>(entitySpace);
                this.toplevelclasstypeIdentifiers = new MapOfIntInt();
                this.yS = new SetOfInt();
            } catch (Throwable th) {
                if (vy) {
                    iy.a8(th, 632035320588475273L, null, fileSpace, entitySpace, fileEntry, language);
                }
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @ey(method = -3217484812200789780L)
        public void loadTypes() {
            try {
                if (BT) {
                    iy.gn(-2186380641162312205L, this);
                }
                if (this.typesLoaded) {
                    return;
                }
                this.typesLoaded = true;
                if (getLanguage().getSignatureAnalyzer() != null) {
                    getLanguage().getSignatureAnalyzer().doLoadTypes(this.fileEntry);
                }
            } catch (Throwable th) {
                if (vy) {
                    iy.aM(th, -2186380641162312205L, this);
                }
                throw th;
            }
        }

        @ey(method = -952812006364722807L)
        public void FH(int i) {
            try {
                if (BT) {
                    iy.u7(-1503709972468966296L, this, i);
                }
                this.gW += i;
                this.entitySpace.Hw(i);
            } catch (Throwable th) {
                if (vy) {
                    iy.j3(th, -1503709972468966296L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -3726590061974326128L)
        public ClassType J8(int i) {
            try {
                if (BT) {
                    iy.u7(2154491928208682873L, this, i);
                }
                loadSyntax();
                if (this.classtypes == null) {
                    throw new e4();
                }
                if (!this.classtypes.Hw(i)) {
                    throw new e4();
                }
                if (this.classtypesExist.contains(i)) {
                    return (ClassType) this.entitySpace.getEntity(this.classtypes.get(i));
                }
                throw new e4();
            } catch (Throwable th) {
                if (vy) {
                    iy.j3(th, 2154491928208682873L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -1701681301640834208L)
        public void Sf() {
            try {
                if (BT) {
                    iy.gn(1053173069275557841L, this);
                }
                this.corrupted = false;
                this.typesLoaded = false;
                this.syntaxloaded = false;
                if (this.membersExist != null) {
                    sh(this.membersExist.size() * 200);
                    this.membersExist.clear();
                }
                if (this.parametertypesExist != null) {
                    this.parametertypesExist.clear();
                }
                if (this.methodparametertypesExist != null) {
                    this.methodparametertypesExist.clear();
                }
                if (this.classtypesExist != null) {
                    sh(this.classtypesExist.size() * 500);
                    this.classtypesExist.clear();
                }
                if (this.members != null) {
                    this.members.DEFAULT_ITERATOR.init();
                    while (this.members.DEFAULT_ITERATOR.hasMoreElements()) {
                        ((Member) this.entitySpace.getEntity(this.members.DEFAULT_ITERATOR.nextValue())).Za();
                    }
                }
                if (this.parametertypes != null) {
                    this.parametertypes.DEFAULT_ITERATOR.init();
                    while (this.parametertypes.DEFAULT_ITERATOR.hasMoreElements()) {
                        ((ParameterType) this.entitySpace.getEntity(this.parametertypes.DEFAULT_ITERATOR.nextValue())).invalidate();
                    }
                }
                if (this.methodparametertypes != null) {
                    this.methodparametertypes.DEFAULT_ITERATOR.init();
                    while (this.methodparametertypes.DEFAULT_ITERATOR.hasMoreElements()) {
                        ((MethodParameterType) this.entitySpace.getEntity(this.methodparametertypes.DEFAULT_ITERATOR.nextValue())).invalidate();
                    }
                }
                if (this.classtypes != null) {
                    this.classtypes.DEFAULT_ITERATOR.init();
                    while (this.classtypes.DEFAULT_ITERATOR.hasMoreElements()) {
                        ((ClassType) this.entitySpace.getEntity(this.classtypes.DEFAULT_ITERATOR.nextValue())).Ak();
                    }
                }
            } catch (Throwable th) {
                if (vy) {
                    iy.aM(th, 1053173069275557841L, this);
                }
                throw th;
            }
        }

        @ey(method = 3282817136209450556L)
        public ClassType U2() {
            try {
                if (BT) {
                    iy.gn(-4626093338141673135L, this);
                }
                this.entitySpace.loadNamespaces();
                if (this.mainClassType != null) {
                    return this.mainClassType;
                }
                throw new e4();
            } catch (Throwable th) {
                if (vy) {
                    iy.aM(th, -4626093338141673135L, this);
                }
                throw th;
            }
        }

        @ey(method = -1729859484521612920L)
        public MethodParameterType VH(int i) {
            try {
                if (BT) {
                    iy.u7(3938783483805368385L, this, i);
                }
                if (this.methodparametertypes == null) {
                    this.methodparametertypes = new FunctionOfIntInt();
                }
                if (this.methodparametertypesExist == null) {
                    this.methodparametertypesExist = new SetOfInt();
                }
                this.methodparametertypesExist.put(i);
                if (!this.methodparametertypes.Hw(i)) {
                    this.methodparametertypes.Zo(i, new MethodParameterType(this.entitySpace, this.entitySpace.identifiers, this.entitySpace.fileSpace, this.fileEntry, getLanguage(), i).getId());
                }
                return (MethodParameterType) this.entitySpace.getEntity(this.methodparametertypes.get(i));
            } catch (Throwable th) {
                if (vy) {
                    iy.j3(th, 3938783483805368385L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 31466949586112735L)
        public ClassType Ws(int i, Namespace namespace, int i2) {
            try {
                if (BT) {
                    iy.we(4877662465435245024L, this, new Integer(i), namespace, new Integer(i2));
                }
                if (i == 0) {
                    return v5(0, namespace, i2);
                }
                loadSyntax();
                if (this.classtypes == null) {
                    throw new e4();
                }
                if (!this.classtypes.Hw(i)) {
                    throw new e4();
                }
                if (this.classtypesExist.contains(i)) {
                    return (ClassType) this.entitySpace.getEntity(this.classtypes.get(i));
                }
                throw new e4();
            } catch (Throwable th) {
                if (vy) {
                    iy.U2(th, 4877662465435245024L, this, new Integer(i), namespace, new Integer(i2));
                }
                throw th;
            }
        }

        @ey(method = -3368546452163373429L)
        public FileEntry XL() {
            try {
                if (BT) {
                    iy.gn(256944013447657344L, this);
                }
                return this.fileEntry;
            } catch (Throwable th) {
                if (vy) {
                    iy.aM(th, 256944013447657344L, this);
                }
                throw th;
            }
        }

        @ey(method = -1285647548328108120L)
        public Member a8(int i) {
            try {
                if (BT) {
                    iy.u7(582002094451982763L, this, i);
                }
                loadSyntax();
                if (this.members == null) {
                    throw new e4();
                }
                if (!this.members.Hw(i)) {
                    throw new e4();
                }
                if (this.membersExist.contains(i)) {
                    return (Member) this.entitySpace.getEntity(this.members.get(i));
                }
                throw new e4();
            } catch (Throwable th) {
                if (vy) {
                    iy.j3(th, 582002094451982763L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -2216405253999295348L)
        public int aM(ClassType classType) {
            try {
                if (BT) {
                    iy.tp(700775096654019355L, this, classType);
                }
                return this.toplevelclasstypeIdentifiers.VH(classType.getId());
            } catch (Throwable th) {
                if (vy) {
                    iy.j3(th, 700775096654019355L, this, classType);
                }
                throw th;
            }
        }

        @ey(method = -621237671400091976L)
        public boolean canDeclareSyntax() {
            try {
                if (BT) {
                    iy.gn(3965562607952100483L, this);
                }
                return !this.syntaxloaded;
            } catch (Throwable th) {
                if (vy) {
                    iy.aM(th, 3965562607952100483L, this);
                }
                throw th;
            }
        }

        @ey(method = -4122258597739512720L)
        public void cb(long j) {
            try {
                if (BT) {
                    iy.tp(1600245726267967899L, this, new Long(j));
                }
                this.classdecldigest = j;
            } catch (Throwable th) {
                if (vy) {
                    iy.j3(th, 1600245726267967899L, this, new Long(j));
                }
                throw th;
            }
        }

        @ey(method = -604111011634488235L)
        public int cn() {
            try {
                if (BT) {
                    iy.gn(2755048399290887688L, this);
                }
                return this.gW;
            } catch (Throwable th) {
                if (vy) {
                    iy.aM(th, 2755048399290887688L, this);
                }
                throw th;
            }
        }

        @ey(method = -1406743953288546225L)
        public void dx() {
            try {
                if (BT) {
                    iy.gn(-3411786963406639464L, this);
                }
                this.corrupted = true;
            } catch (Throwable th) {
                if (vy) {
                    iy.aM(th, -3411786963406639464L, this);
                }
                throw th;
            }
        }

        @ey(method = 2764567514419373124L)
        public void ef(long j) {
            try {
                if (BT) {
                    iy.tp(715854444798580285L, this, new Long(j));
                }
                this.version = j;
            } catch (Throwable th) {
                if (vy) {
                    iy.j3(th, 715854444798580285L, this, new Long(j));
                }
                throw th;
            }
        }

        @ey(method = -4345136825463758940L)
        public long ei() {
            try {
                if (BT) {
                    iy.gn(4900273593014403765L, this);
                }
                long j = 0;
                if (this.classtypes != null) {
                    this.classtypes.DEFAULT_ITERATOR.init();
                    while (this.classtypes.DEFAULT_ITERATOR.hasMoreElements()) {
                        long jOd = ((ClassType) this.entitySpace.getEntity(this.classtypes.DEFAULT_ITERATOR.nextValue())).Od();
                        if (jOd >= j) {
                            j = jOd;
                        }
                    }
                }
                return j;
            } catch (Throwable th) {
                if (vy) {
                    iy.aM(th, 4900273593014403765L, this);
                }
                throw th;
            }
        }

        @ey(method = 3818380705097404833L)
        public ParameterType er(int i) {
            try {
                if (BT) {
                    iy.u7(-983512988434950264L, this, i);
                }
                loadSyntax();
                if (this.parametertypes == null) {
                    throw new e4();
                }
                if (!this.parametertypes.Hw(i)) {
                    throw new e4();
                }
                if (this.parametertypesExist.contains(i)) {
                    return (ParameterType) this.entitySpace.getEntity(this.parametertypes.get(i));
                }
                throw new e4();
            } catch (Throwable th) {
                if (vy) {
                    iy.j3(th, -983512988434950264L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -3264221757833529317L)
        public SetOf<Entity> getAllDeclarations() {
            try {
                if (BT) {
                    iy.gn(2905854619801557480L, this);
                }
                SetOf<Entity> setOf = new SetOf<>(this.entitySpace);
                loadSyntax();
                if (this.members != null) {
                    this.members.DEFAULT_ITERATOR.init();
                    while (this.members.DEFAULT_ITERATOR.hasMoreElements()) {
                        if (this.membersExist.contains(this.members.DEFAULT_ITERATOR.nextKey())) {
                            setOf.put(this.entitySpace.getEntity(this.members.DEFAULT_ITERATOR.nextValue()));
                        }
                    }
                }
                if (this.classtypes != null) {
                    this.classtypes.DEFAULT_ITERATOR.init();
                    while (this.classtypes.DEFAULT_ITERATOR.hasMoreElements()) {
                        if (this.classtypesExist.contains(this.classtypes.DEFAULT_ITERATOR.nextKey())) {
                            setOf.put(this.entitySpace.getEntity(this.classtypes.DEFAULT_ITERATOR.nextValue()));
                        }
                    }
                }
                return setOf;
            } catch (Throwable th) {
                if (vy) {
                    iy.aM(th, 2905854619801557480L, this);
                }
                throw th;
            }
        }

        @ey(method = 378603489807364017L)
        public long getArchiveVersion() {
            try {
                if (BT) {
                    iy.gn(-5372012551900035184L, this);
                }
                return this.archiveVersion;
            } catch (Throwable th) {
                if (vy) {
                    iy.aM(th, -5372012551900035184L, this);
                }
                throw th;
            }
        }

        @ey(method = 161405149538140997L)
        public long getClassDeclarationDigest() {
            try {
                if (BT) {
                    iy.gn(144330975766061992L, this);
                }
                return this.classdecldigest;
            } catch (Throwable th) {
                if (vy) {
                    iy.aM(th, 144330975766061992L, this);
                }
                throw th;
            }
        }

        @ey(method = 4194166789332511827L)
        public long getDeclarationDigest() {
            try {
                if (BT) {
                    iy.gn(5784804577157319648L, this);
                }
                return this.decldigest;
            } catch (Throwable th) {
                if (vy) {
                    iy.aM(th, 5784804577157319648L, this);
                }
                throw th;
            }
        }

        @ey(method = -3602015948787646101L)
        public Language getLanguage() {
            try {
                if (BT) {
                    iy.gn(-3358404975911747664L, this);
                }
                if (this.languageId == -1) {
                    System.out.println(this.languageId);
                }
                return this.fileSpace.getLanguage(this.languageId);
            } catch (Throwable th) {
                if (vy) {
                    iy.aM(th, -3358404975911747664L, this);
                }
                throw th;
            }
        }

        @ey(method = 3132812814667116352L)
        public Member getMember(int i) {
            try {
                if (BT) {
                    iy.u7(3079116002611184143L, this, i);
                }
                if (this.members == null) {
                    this.members = new FunctionOfIntInt();
                }
                if (this.membersExist == null) {
                    this.membersExist = new SetOfInt();
                }
                if (!this.membersExist.contains(i)) {
                    FH(200);
                }
                this.membersExist.put(i);
                if (!this.members.Hw(i)) {
                    this.members.Zo(i, new Member(this.entitySpace, this.entitySpace.identifiers, this.entitySpace.fileSpace, this.fileEntry, getLanguage(), i).getId());
                }
                return (Member) this.entitySpace.getEntity(this.members.get(i));
            } catch (Throwable th) {
                if (vy) {
                    iy.j3(th, 3079116002611184143L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 2569149500010594165L)
        public long getVersion() {
            try {
                if (BT) {
                    iy.gn(2602720246504996772L, this);
                }
                return this.version;
            } catch (Throwable th) {
                if (vy) {
                    iy.aM(th, 2602720246504996772L, this);
                }
                throw th;
            }
        }

        @ey(method = -5515071433725626472L)
        public void gn(Namespace namespace) {
            try {
                if (BT) {
                    iy.tp(2142971566284762785L, this, namespace);
                }
                this.namespaces.put(namespace);
            } catch (Throwable th) {
                if (vy) {
                    iy.j3(th, 2142971566284762785L, this, namespace);
                }
                throw th;
            }
        }

        @ey(method = 401758726678767652L)
        public void invalidate() {
            try {
                if (BT) {
                    iy.gn(627556993722171277L, this);
                }
                this.corrupted = false;
                this.typesLoaded = false;
                this.syntaxloaded = false;
                if (this.membersExist != null) {
                    sh(this.membersExist.size() * 200);
                    this.membersExist.clear();
                }
                if (this.parametertypesExist != null) {
                    this.parametertypesExist.clear();
                }
                if (this.methodparametertypesExist != null) {
                    this.methodparametertypesExist.clear();
                }
                if (this.classtypesExist != null) {
                    sh(this.classtypesExist.size() * 500);
                    this.classtypesExist.clear();
                }
                if (this.members != null) {
                    this.members.DEFAULT_ITERATOR.init();
                    while (this.members.DEFAULT_ITERATOR.hasMoreElements()) {
                        ((Member) this.entitySpace.getEntity(this.members.DEFAULT_ITERATOR.nextValue())).invalidate();
                    }
                }
                if (this.parametertypes != null) {
                    this.parametertypes.DEFAULT_ITERATOR.init();
                    while (this.parametertypes.DEFAULT_ITERATOR.hasMoreElements()) {
                        ((ParameterType) this.entitySpace.getEntity(this.parametertypes.DEFAULT_ITERATOR.nextValue())).invalidate();
                    }
                }
                if (this.methodparametertypes != null) {
                    this.methodparametertypes.DEFAULT_ITERATOR.init();
                    while (this.methodparametertypes.DEFAULT_ITERATOR.hasMoreElements()) {
                        ((MethodParameterType) this.entitySpace.getEntity(this.methodparametertypes.DEFAULT_ITERATOR.nextValue())).invalidate();
                    }
                }
                if (this.classtypes != null) {
                    this.classtypes.DEFAULT_ITERATOR.init();
                    while (this.classtypes.DEFAULT_ITERATOR.hasMoreElements()) {
                        ((ClassType) this.entitySpace.getEntity(this.classtypes.DEFAULT_ITERATOR.nextValue())).invalidate();
                    }
                }
            } catch (Throwable th) {
                if (vy) {
                    iy.aM(th, 627556993722171277L, this);
                }
                throw th;
            }
        }

        @ey(method = 4168548792885367572L)
        public void invalidateNamespaces() {
            try {
                if (BT) {
                    iy.gn(5784303110206238325L, this);
                }
                this.archiveVersion = 0L;
                this.packageLoaded = false;
                this.namespaces.clear();
                this.toplevelclasstypes.clear();
                this.mainClassType = null;
                this.toplevelclasstypeIdentifiers.clear();
                this.yS.clear();
            } catch (Throwable th) {
                if (vy) {
                    iy.aM(th, 5784303110206238325L, this);
                }
                throw th;
            }
        }

        @ey(method = -2556884585084086404L)
        public void invalidatePositions() {
            try {
                if (BT) {
                    iy.gn(3449199775462538115L, this);
                }
                this.positionsLoaded = false;
            } catch (Throwable th) {
                if (vy) {
                    iy.aM(th, 3449199775462538115L, this);
                }
                throw th;
            }
        }

        @ey(method = -1409387028617572775L)
        public SetOfInt j3() {
            try {
                if (BT) {
                    iy.gn(-2542173639124279496L, this);
                }
                return this.yS;
            } catch (Throwable th) {
                if (vy) {
                    iy.aM(th, -2542173639124279496L, this);
                }
                throw th;
            }
        }

        @ey(method = 1259324087306868048L)
        public MethodParameterType lg(int i) {
            try {
                if (BT) {
                    iy.u7(738077726645987157L, this, i);
                }
                loadSyntax();
                if (this.methodparametertypes == null) {
                    throw new e4();
                }
                if (!this.methodparametertypes.Hw(i)) {
                    throw new e4();
                }
                if (this.methodparametertypesExist.contains(i)) {
                    return (MethodParameterType) this.entitySpace.getEntity(this.methodparametertypes.get(i));
                }
                throw new e4();
            } catch (Throwable th) {
                if (vy) {
                    iy.j3(th, 738077726645987157L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 1747765449439789593L)
        public void loadPositions() {
            try {
                if (BT) {
                    iy.gn(2207807224250357840L, this);
                }
                loadSyntax();
                if (this.positionsLoaded) {
                    return;
                }
                this.positionsLoaded = true;
                if (getLanguage().getSignatureAnalyzer() != null) {
                    getLanguage().getSignatureAnalyzer().doLoadPositions(this.fileEntry);
                }
            } catch (Throwable th) {
                if (vy) {
                    iy.aM(th, 2207807224250357840L, this);
                }
                throw th;
            }
        }

        @ey(method = -2300742210228021216L)
        public void loadSyntax() {
            try {
                if (BT) {
                    iy.gn(-1837694420731810151L, this);
                }
                if (this.syntaxloaded) {
                    return;
                }
                this.syntaxloaded = true;
                this.positionsLoaded = true;
                if (getLanguage().getSignatureAnalyzer() != null) {
                    getLanguage().getSignatureAnalyzer().doLoadSyntax(this.fileEntry);
                }
                SyntaxTree syntaxTree = this.entitySpace.syntaxTreeSpace.getSyntaxTree(this.fileEntry, getLanguage());
                this.version = syntaxTree.getVersion();
                this.classdecldigest = syntaxTree.getClassDeclarationDigest();
                this.decldigest = syntaxTree.getDeclarationDigest();
                this.entitySpace.syntaxTreeSpace.releaseSyntaxTree(syntaxTree);
            } catch (Throwable th) {
                if (vy) {
                    iy.aM(th, -1837694420731810151L, this);
                }
                throw th;
            }
        }

        @ey(method = 1798689976277950255L)
        public void nw() {
            try {
                if (BT) {
                    iy.gn(-180656325468752800L, this);
                }
                if (this.packageLoaded) {
                    return;
                }
                this.packageLoaded = true;
                this.version = this.fileEntry.getSyntaxVersion();
                this.archiveVersion = this.fileEntry.getArchiveVersion();
                this.classdecldigest = 0L;
                this.decldigest = 0L;
                if (getLanguage().getSignatureAnalyzer() != null) {
                    getLanguage().getSignatureAnalyzer().tp(this.fileEntry);
                }
            } catch (Throwable th) {
                if (vy) {
                    iy.aM(th, -180656325468752800L, this);
                }
                throw th;
            }
        }

        @ey(method = -4067414749254834529L)
        public SetOf<Namespace> rN() {
            try {
                if (BT) {
                    iy.gn(-3154642995694424640L, this);
                }
                this.entitySpace.loadNamespaces();
                return this.namespaces;
            } catch (Throwable th) {
                if (vy) {
                    iy.aM(th, -3154642995694424640L, this);
                }
                throw th;
            }
        }

        @ey(method = -431283339166391712L)
        public void sG(long j) {
            try {
                if (BT) {
                    iy.tp(-5330921498537574537L, this, new Long(j));
                }
                this.decldigest = j;
            } catch (Throwable th) {
                if (vy) {
                    iy.j3(th, -5330921498537574537L, this, new Long(j));
                }
                throw th;
            }
        }

        @ey(method = 4481403255200042532L)
        public void sh(int i) {
            try {
                if (BT) {
                    iy.u7(-3591556833035406963L, this, i);
                }
                this.gW -= i;
                this.entitySpace.sM(i);
            } catch (Throwable th) {
                if (vy) {
                    iy.j3(th, -3591556833035406963L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -3589826518202631329L)
        public void store(StoreOutputStream storeOutputStream) {
            try {
                if (BT) {
                    iy.tp(3904380714400796960L, this, storeOutputStream);
                }
                storeOutputStream.writeInt(this.fileEntry.getId());
                storeOutputStream.writeInt(this.languageId);
                boolean z = true;
                storeOutputStream.writeBoolean(this.members != null);
                if (this.members != null) {
                    this.members.store(storeOutputStream);
                }
                storeOutputStream.writeBoolean(this.parametertypes != null);
                if (this.parametertypes != null) {
                    this.parametertypes.store(storeOutputStream);
                }
                storeOutputStream.writeBoolean(this.methodparametertypes != null);
                if (this.methodparametertypes != null) {
                    this.methodparametertypes.store(storeOutputStream);
                }
                storeOutputStream.writeBoolean(this.classtypes != null);
                if (this.classtypes != null) {
                    this.classtypes.store(storeOutputStream);
                }
                storeOutputStream.writeBoolean(this.packageLoaded);
                this.namespaces.store(storeOutputStream);
                this.toplevelclasstypes.store(storeOutputStream);
                this.toplevelclasstypeIdentifiers.store(storeOutputStream);
                if (this.mainClassType == null) {
                    storeOutputStream.writeInt(0);
                } else {
                    storeOutputStream.writeInt(this.mainClassType.getId());
                }
                storeOutputStream.writeLong(this.classdecldigest);
                storeOutputStream.writeLong(this.decldigest);
                storeOutputStream.writeLong(this.version);
                storeOutputStream.writeLong(this.archiveVersion);
                storeOutputStream.writeBoolean(this.syntaxloaded);
                storeOutputStream.writeBoolean(this.typesLoaded);
                storeOutputStream.writeBoolean(this.positionsLoaded);
                storeOutputStream.writeBoolean(this.corrupted);
                this.yS.store(storeOutputStream);
                storeOutputStream.writeBoolean(this.membersExist != null);
                if (this.membersExist != null) {
                    this.membersExist.store(storeOutputStream);
                }
                storeOutputStream.writeBoolean(this.parametertypesExist != null);
                if (this.parametertypesExist != null) {
                    this.parametertypesExist.store(storeOutputStream);
                }
                storeOutputStream.writeBoolean(this.methodparametertypesExist != null);
                if (this.methodparametertypesExist != null) {
                    this.methodparametertypesExist.store(storeOutputStream);
                }
                if (this.classtypesExist == null) {
                    z = false;
                }
                storeOutputStream.writeBoolean(z);
                if (this.classtypesExist != null) {
                    this.classtypesExist.store(storeOutputStream);
                }
            } catch (Throwable th) {
                if (vy) {
                    iy.j3(th, 3904380714400796960L, this, storeOutputStream);
                }
                throw th;
            }
        }

        @ey(method = 3636719083819465200L)
        public void tp(Namespace namespace, ClassType classType, int i) {
            try {
                if (BT) {
                    iy.we(-3337606874166663301L, this, namespace, classType, new Integer(i));
                }
                if (this.mainClassType == null) {
                    this.mainClassType = classType;
                } else if (this.mainClassType.getIdentifier() != this.fileEntry.getNameIdentifier() && classType.getIdentifier() == this.fileEntry.getNameIdentifier()) {
                    this.mainClassType = classType;
                }
                this.toplevelclasstypes.QX(classType, namespace);
                this.toplevelclasstypeIdentifiers.tp(classType.getId(), i);
            } catch (Throwable th) {
                if (vy) {
                    iy.U2(th, -3337606874166663301L, this, namespace, classType, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 67545968515746429L)
        public ParameterType u7(int i) {
            try {
                if (BT) {
                    iy.u7(1166015605964069016L, this, i);
                }
                if (this.parametertypes == null) {
                    this.parametertypes = new FunctionOfIntInt();
                }
                if (this.parametertypesExist == null) {
                    this.parametertypesExist = new SetOfInt();
                }
                this.parametertypesExist.put(i);
                if (!this.parametertypes.Hw(i)) {
                    this.parametertypes.Zo(i, new ParameterType(this.entitySpace, this.entitySpace.identifiers, this.entitySpace.fileSpace, this.fileEntry, getLanguage(), i).getId());
                }
                return (ParameterType) this.entitySpace.getEntity(this.parametertypes.get(i));
            } catch (Throwable th) {
                if (vy) {
                    iy.j3(th, 1166015605964069016L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -2708799753354059397L)
        public ClassType v5(int i, Namespace namespace, int i2) {
            try {
                if (BT) {
                    iy.we(-531928651989900880L, this, new Integer(i), namespace, new Integer(i2));
                }
                if (this.classtypes == null) {
                    this.classtypes = new FunctionOfIntInt();
                }
                if (this.classtypesExist == null) {
                    this.classtypesExist = new SetOfInt();
                }
                if (!this.classtypesExist.contains(i)) {
                    FH(500);
                }
                this.classtypesExist.put(i);
                if (!this.classtypes.Hw(i)) {
                    this.classtypes.Zo(i, new ClassType(this.entitySpace, this.entitySpace.fileSpace, this.entitySpace.identifiers, this.fileEntry, getLanguage(), i, getLanguage().getTypeSystem().u7(namespace, i2)).getId());
                }
                return (ClassType) this.entitySpace.getEntity(this.classtypes.get(i));
            } catch (Throwable th) {
                if (vy) {
                    iy.U2(th, -531928651989900880L, this, new Integer(i), namespace, new Integer(i2));
                }
                throw th;
            }
        }

        @ey(method = 7176567419078124089L)
        public MapOf<ClassType, Namespace> yS() {
            try {
                if (BT) {
                    iy.gn(1336308785413724760L, this);
                }
                this.entitySpace.loadNamespaces();
                return this.toplevelclasstypes;
            } catch (Throwable th) {
                if (vy) {
                    iy.aM(th, 1336308785413724760L, this);
                }
                throw th;
            }
        }

        @ey(method = 1807892577285434289L)
        public FileInfo(FileSpace fileSpace, EntitySpace entitySpace, StoreInputStream storeInputStream) {
            try {
                if (BT) {
                    iy.we(6942693875370828183L, null, fileSpace, entitySpace, storeInputStream);
                }
                this.entitySpace = entitySpace;
                this.fileSpace = fileSpace;
                this.fileEntry = entitySpace.fileSpace.getFileEntry(storeInputStream.readInt());
                this.languageId = storeInputStream.readInt();
                if (storeInputStream.readBoolean()) {
                    this.members = new FunctionOfIntInt(storeInputStream);
                }
                if (storeInputStream.readBoolean()) {
                    this.parametertypes = new FunctionOfIntInt(storeInputStream);
                }
                if (storeInputStream.readBoolean()) {
                    this.methodparametertypes = new FunctionOfIntInt(storeInputStream);
                }
                if (storeInputStream.readBoolean()) {
                    this.classtypes = new FunctionOfIntInt(storeInputStream);
                }
                this.packageLoaded = storeInputStream.readBoolean();
                this.namespaces = new SetOf<>(entitySpace, storeInputStream);
                this.toplevelclasstypes = new MapOf<>(entitySpace, storeInputStream);
                this.toplevelclasstypeIdentifiers = new MapOfIntInt(storeInputStream);
                int i = storeInputStream.readInt();
                if (i != 0) {
                    this.mainClassType = (ClassType) entitySpace.getEntity(i);
                }
                this.classdecldigest = storeInputStream.readLong();
                this.decldigest = storeInputStream.readLong();
                this.version = storeInputStream.readLong();
                this.archiveVersion = storeInputStream.readLong();
                this.syntaxloaded = storeInputStream.readBoolean();
                this.typesLoaded = storeInputStream.readBoolean();
                this.positionsLoaded = storeInputStream.readBoolean();
                this.corrupted = storeInputStream.readBoolean();
                this.yS = new SetOfInt(storeInputStream);
                if (storeInputStream.readBoolean()) {
                    this.membersExist = new SetOfInt(storeInputStream);
                }
                if (storeInputStream.readBoolean()) {
                    this.parametertypesExist = new SetOfInt(storeInputStream);
                }
                if (storeInputStream.readBoolean()) {
                    this.methodparametertypesExist = new SetOfInt(storeInputStream);
                }
                if (storeInputStream.readBoolean()) {
                    this.classtypesExist = new SetOfInt(storeInputStream);
                }
                if (this.membersExist != null) {
                    FH(this.membersExist.size() * 200);
                }
                if (this.classtypesExist != null) {
                    FH(this.classtypesExist.size() * 500);
                }
            } catch (Throwable th) {
                if (vy) {
                    iy.U2(th, 6942693875370828183L, null, fileSpace, entitySpace, storeInputStream);
                }
                throw th;
            }
        }
    }
}
