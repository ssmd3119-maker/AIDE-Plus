package abcd;

import com.aide.codemodel.AIDEModel;
import com.aide.codemodel.api.ClassType;
import com.aide.codemodel.api.Entity;
import com.aide.codemodel.api.EntitySpace;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.FileSpace;
import com.aide.codemodel.api.IdentifierSpace;
import com.aide.codemodel.api.Member;
import com.aide.codemodel.api.Namespace;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.SyntaxTreeSpace;
import com.aide.codemodel.api.collections.MapOf;
import com.aide.codemodel.api.collections.MapOfInt;
import com.aide.codemodel.api.collections.SetOf;
import com.aide.codemodel.api.collections.SetOfFileEntry;
import com.aide.codemodel.api.collections.SetOfInt;
import com.aide.uidesigner.ProxyTextView;
import com.probelytics.api.UserTouchAction;
import java.util.List;

@cy(clazz = -3016709731700446216L, container = -3016709731700446216L, user = true)
/* loaded from: classes.dex */
public class o0 {

    @fy
    private static /* synthetic */ boolean VH;

    @gy
    private static /* synthetic */ boolean gn;

    @dy(field = 2644648921061495536L)
    private final IdentifierSpace DW;

    @dy(field = -1343172542307461888L)
    private final FileSpace FH;

    @dy(field = -2463113707651394304L)
    private final EntitySpace Hw;

    @dy(field = -2870415135227968704L)
    private final k0 Zo;

    @dy(field = -2707496553471308003L)
    private final AIDEModel j6;

    @dy(field = -2424265008827182997L)
    private final SyntaxTreeSpace v5;

    static {
        iy.Zo(o0.class);
    }

    @ey(method = -17593139330841888L)
    public o0(AIDEModel aIDEModel) {
        try {
            if (VH) {
                iy.tp(110209392183785587L, null, aIDEModel);
            }
            this.j6 = aIDEModel;
            this.DW = aIDEModel.identifierSpace;
            this.FH = aIDEModel.fileSpace;
            this.Hw = aIDEModel.entitySpace;
            this.v5 = aIDEModel.syntaxTreeSpace;
            this.Zo = aIDEModel.vy;
        } catch (Throwable th) {
            if (gn) {
                iy.j3(th, 110209392183785587L, null, aIDEModel);
            }
            throw th;
        }
    }

    @ey(method = -2926815803575908321L)
    private void DW(Member member, int i) {
        try {
            if (VH) {
                iy.EQ(1204266156630883056L, this, member, new Integer(i));
            }
            MapOfInt<Member> mapOfIntEU = member.getEnclosingClassType().eU();
            if (mapOfIntEU.v5(i)) {
                Member member2 = (Member) mapOfIntEU.gn(i);
                j6("There already is a field with that name.", member2.getFile(), member2.Ws(), member2.QX());
            }
        } catch (Throwable th) {
            if (gn) {
                iy.Mr(th, 1204266156630883056L, this, member, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2115749506793914140L)
    private SetOf<Member> EQ(Member member) {
        try {
            if (VH) {
                iy.tp(-1051601328490278665L, this, member);
            }
            SetOf<Member> setOfVH = VH(member.getIdentifier());
            SetOf setOf = new SetOf(this.Hw);
            setOf.put(member);
            SetOf<Member> setOf2 = new SetOf<>(this.Hw);
            while (true) {
                setOf.DEFAULT_ITERATOR.init();
                while (setOf.DEFAULT_ITERATOR.hasMoreElements()) {
                    Member member2 = (Member) setOf.DEFAULT_ITERATOR.nextKey();
                    setOf2.put(member2);
                    setOf2.u7(member2.jO());
                    setOfVH.DEFAULT_ITERATOR.init();
                    while (setOfVH.DEFAULT_ITERATOR.hasMoreElements()) {
                        Member member3 = (Member) setOfVH.DEFAULT_ITERATOR.nextKey();
                        if (member3.OW().contains(member2)) {
                            setOf2.put(member3);
                        }
                        if (member3.getEnclosingClassType() == member2.getEnclosingClassType()) {
                            setOf2.put(member3);
                        }
                    }
                }
                if (setOf.J0() == setOf2.J0()) {
                    return setOf2;
                }
                setOf.clear();
                setOf.u7(setOf2);
            }
        } catch (Throwable th) {
            if (gn) {
                iy.j3(th, -1051601328490278665L, this, member);
            }
            throw th;
        }
    }

    @ey(method = -6974869949530114856L)
    private void FH(SetOf<Member> setOf, SetOfFileEntry setOfFileEntry, int i) {
        try {
            if (VH) {
                iy.we(-4571428018819357557L, this, setOf, setOfFileEntry, new Integer(i));
            }
            if (setOf.J0() == 1) {
                DW((Member) setOf.Zo(), i);
            }
        } catch (Throwable th) {
            if (gn) {
                iy.U2(th, -4571428018819357557L, this, setOf, setOfFileEntry, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 6010979337143734377L)
    private void Hw(SetOf<Member> setOf, SetOfFileEntry setOfFileEntry, int i) {
        try {
            if (VH) {
                iy.we(1047895658438179752L, this, setOf, setOfFileEntry, new Integer(i));
            }
            setOf.DEFAULT_ITERATOR.init();
            while (setOf.DEFAULT_ITERATOR.hasMoreElements()) {
                Member member = (Member) setOf.DEFAULT_ITERATOR.nextKey();
                if (!setOfFileEntry.contains(member.getFile())) {
                    j6("There is an overridden method, which is defined outside the project.", member.getFile(), member.Ws(), member.QX());
                }
                MapOfInt<Member> mapOfIntE3 = member.getEnclosingClassType().e3();
                mapOfIntE3.DEFAULT_ITERATOR.init(i);
                while (mapOfIntE3.DEFAULT_ITERATOR.hasMoreElements()) {
                    Member member2 = (Member) mapOfIntE3.DEFAULT_ITERATOR.nextValue();
                    if (member2.oY() == member.oY()) {
                        j6("There already is a method with that name.", member2.getFile(), member2.Ws(), member2.QX());
                    }
                }
            }
        } catch (Throwable th) {
            if (gn) {
                iy.U2(th, 1047895658438179752L, this, setOf, setOfFileEntry, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 3139234081344364715L)
    private Namespace J0(FileEntry fileEntry) {
        try {
            if (VH) {
                iy.tp(2553371106625047744L, this, fileEntry);
            }
            SetOfFileEntry setOfFileEntry = new SetOfFileEntry(this.FH);
            setOfFileEntry.u7(this.j6.fileSpace.KD());
            setOfFileEntry.j6.init();
            while (setOfFileEntry.j6.hasMoreElements()) {
                FileEntry fileEntryNextKey = setOfFileEntry.j6.nextKey();
                if (fileEntry == fileEntryNextKey.getParentDirectory()) {
                    MapOf<ClassType, Namespace> toplevelClasstypesOfFile = this.Hw.getToplevelClasstypesOfFile(fileEntryNextKey);
                    toplevelClasstypesOfFile.j6.DW();
                    while (toplevelClasstypesOfFile.j6.j6()) {
                        fileEntryNextKey.getParentDirectory().getFullNameString().equals(((ClassType) toplevelClasstypesOfFile.j6.Hw()).getNamespace().getFullyQualifiedNameString());
                    }
                }
            }
            setOfFileEntry.j6.init();
            while (setOfFileEntry.j6.hasMoreElements()) {
                FileEntry fileEntryNextKey2 = setOfFileEntry.j6.nextKey();
                if (fileEntry.isEnclosingDir(fileEntryNextKey2)) {
                    MapOf<ClassType, Namespace> toplevelClasstypesOfFile2 = this.Hw.getToplevelClasstypesOfFile(fileEntryNextKey2);
                    toplevelClasstypesOfFile2.j6.DW();
                    while (toplevelClasstypesOfFile2.j6.j6()) {
                        FileEntry parentDirectory = fileEntryNextKey2.getParentDirectory();
                        for (Namespace namespace = ((ClassType) toplevelClasstypesOfFile2.j6.Hw()).getNamespace(); namespace != this.Hw.getRootNamespace() && parentDirectory.getNameIdentifier() == namespace.getIdentifier(); namespace = namespace.aj()) {
                            if (parentDirectory == fileEntry) {
                                return namespace;
                            }
                            parentDirectory = parentDirectory.getParentDirectory();
                        }
                    }
                }
            }
            throw new e4();
        } catch (Throwable th) {
            if (gn) {
                iy.j3(th, 2553371106625047744L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = 3245952812667909084L)
    private void Mr(SyntaxTree syntaxTree, int i, FileEntry fileEntry, int i2, int i3, String str) throws Throwable {
        char c;
        char c2;
        int i4;
        try {
            if (VH) {
                iy.QX(-1574854560121390647L, this, new Object[]{syntaxTree, new Integer(i), fileEntry, new Integer(i2), new Integer(i3), str});
            }
            for (int childCount = syntaxTree.getChildCount(i) - 1; childCount >= 0; childCount--) {
                c = 4;
                c2 = 5;
                i4 = 6;
                try {
                    Mr(syntaxTree, syntaxTree.getChildNode(i, childCount), fileEntry, i2, i3, str);
                } catch (Throwable th) {
                    th = th;
                    if (gn) {
                        Object[] objArr = new Object[i4];
                        objArr[0] = syntaxTree;
                        objArr[1] = new Integer(i);
                        objArr[2] = fileEntry;
                        objArr[3] = new Integer(i2);
                        objArr[c] = new Integer(i3);
                        objArr[c2] = str;
                        iy.rN(th, -1574854560121390647L, this, objArr);
                    }
                    throw th;
                }
            }
            c = 4;
            c2 = 5;
            i4 = 6;
            if (!syntaxTree.isIdentifierNode(i) || syntaxTree.isSyntheticNode(i)) {
                return;
            }
            int iSh = syntaxTree.sh(i);
            if ((iSh == 4 || iSh == 5) && i3 == syntaxTree.getAttrReferenceNode(i) && syntaxTree.getStartLine(i) > 0) {
                this.j6.refactoringCallback.nw(fileEntry, syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i), syntaxTree.getEndLine(i), syntaxTree.getEndColumn(i), str);
            }
        } catch (Throwable th2) {
            th = th2;
            c = 4;
            c2 = 5;
            i4 = 6;
        }
    }

    @ey(method = -1595496527552675475L)
    private void QX(int i, ClassType classType, int i2, boolean z) {
        try {
            if (VH) {
                iy.J0(934133657129038080L, this, new Integer(i), classType, new Integer(i2), new Boolean(z));
            }
            f2 f2Var = new f2();
            SetOf<ClassType> setOf = new SetOf<>(this.Hw);
            setOf.put(classType);
            if (classType.Yi()) {
                setOf.u7(classType.getAllPartialClasstypes());
            }
            List<SyntaxTree> listVH = this.v5.VH(classType.getFile());
            f2Var.Zo();
            f2Var.v5(listVH);
            for (SyntaxTree syntaxTree : listVH) {
                syntaxTree.getLanguage().getCodeAnalyzer().Hw(syntaxTree, i);
                Ws(syntaxTree, f2Var, syntaxTree.getRootNode(), classType.getFile(), i, setOf, i2);
                this.v5.releaseSyntaxTree(syntaxTree);
            }
            if (!classType.yS()) {
                this.Zo.we(i);
                while (true) {
                    FileEntry fileEntryXL = this.Zo.XL();
                    if (fileEntryXL == null) {
                        break;
                    }
                    if (fileEntryXL != classType.getFile()) {
                        if (this.j6.stopCallback.et()) {
                            break;
                        }
                        List<SyntaxTree> listVH2 = this.v5.VH(fileEntryXL);
                        f2Var.Zo();
                        f2Var.v5(listVH2);
                        for (SyntaxTree syntaxTree2 : listVH2) {
                            syntaxTree2.getLanguage().getCodeAnalyzer().Hw(syntaxTree2, i);
                            Ws(syntaxTree2, f2Var, syntaxTree2.getRootNode(), fileEntryXL, i, setOf, i2);
                            this.v5.releaseSyntaxTree(syntaxTree2);
                            f2Var = f2Var;
                        }
                    }
                }
            }
            if (!classType.isToplevel()) {
                if (classType.getEnclosingClassType().iW().v5(i2)) {
                    ClassType classType2 = (ClassType) classType.getEnclosingClassType().iW().gn(i2);
                    j6("There already is a class with that name.", classType2.getFile(), classType2.Ws(), classType2.QX());
                    return;
                }
                return;
            }
            if (i == classType.getFile().getNameIdentifier()) {
                this.j6.refactoringCallback.sG(classType.getFile(), this.DW.getString(i2) + classType.getFile().getExtensionString());
            }
        } catch (Throwable th) {
            if (gn) {
                iy.a8(th, 934133657129038080L, this, new Integer(i), classType, new Integer(i2), new Boolean(z));
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x011f  */
    @abcd.ey(method = -990861870832280656L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void U2(com.aide.codemodel.api.SyntaxTree r23, abcd.f2 r24, int r25, com.aide.codemodel.api.FileEntry r26, int r27, com.aide.codemodel.api.collections.SetOf<? extends com.aide.codemodel.api.Entity> r28, boolean r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.o0.U2(com.aide.codemodel.api.SyntaxTree, abcd.f2, int, com.aide.codemodel.api.FileEntry, int, com.aide.codemodel.api.collections.SetOf, boolean):void");
    }

    @ey(method = 2442893127394666167L)
    private SetOf<Member> VH(int i) {
        try {
            if (VH) {
                iy.u7(1939825719499318848L, this, i);
            }
            SetOf<Member> setOf = new SetOf<>(this.Hw);
            this.Zo.J8(i);
            while (true) {
                FileEntry fileEntryAM = this.Zo.aM();
                if (fileEntryAM == null || this.j6.stopCallback.et()) {
                    break;
                }
                for (SyntaxTree syntaxTree : this.v5.VH(fileEntryAM)) {
                    gn(syntaxTree, syntaxTree.getRootNode(), i, setOf);
                    this.v5.releaseSyntaxTree(syntaxTree);
                }
            }
            return setOf;
        } catch (Throwable th) {
            if (gn) {
                iy.j3(th, 1939825719499318848L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 1807496850597759656L)
    private void Ws(SyntaxTree syntaxTree, f2 f2Var, int i, FileEntry fileEntry, int i2, SetOf<ClassType> setOf, int i3) throws Throwable {
        char c;
        try {
            if (VH) {
                iy.QX(-5200664936545937915L, this, new Object[]{syntaxTree, f2Var, new Integer(i), fileEntry, new Integer(i2), setOf, new Integer(i3)});
            }
            for (int childCount = syntaxTree.getChildCount(i) - 1; childCount >= 0; childCount--) {
                c = 1;
                try {
                    Ws(syntaxTree, f2Var, syntaxTree.getChildNode(i, childCount), fileEntry, i2, setOf, i3);
                } catch (Throwable th) {
                    th = th;
                    if (gn) {
                        Object[] objArr = new Object[7];
                        objArr[0] = syntaxTree;
                        objArr[c] = f2Var;
                        objArr[2] = new Integer(i);
                        objArr[3] = fileEntry;
                        objArr[4] = new Integer(i2);
                        objArr[5] = setOf;
                        objArr[6] = new Integer(i3);
                        iy.rN(th, -5200664936545937915L, this, objArr);
                    }
                    throw th;
                }
            }
            if (!syntaxTree.isIdentifierNode(i) || syntaxTree.isSyntheticNode(i)) {
                return;
            }
            int iSh = syntaxTree.sh(i);
            if (iSh != 17) {
                switch (iSh) {
                    case UserTouchAction.CLICK_KIND /* 7 */:
                    case 8:
                    case 9:
                    case 10:
                        break;
                    default:
                        switch (iSh) {
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                                if (setOf.contains(((Member) syntaxTree.getAttrReferenceEntity(i)).getEnclosingClassType())) {
                                    if (syntaxTree.getStartLine(i) == 0) {
                                        j6("Code in included files will not be changed.", syntaxTree.getFile(), 1, 1);
                                        return;
                                    } else {
                                        this.j6.refactoringCallback.nw(fileEntry, f2Var.EQ(syntaxTree, i), f2Var.tp(syntaxTree, i), f2Var.u7(syntaxTree, i), f2Var.VH(syntaxTree, i), this.DW.getString(i3));
                                        f2Var.aM(f2Var.EQ(syntaxTree, i), f2Var.tp(syntaxTree, i), f2Var.u7(syntaxTree, i), f2Var.VH(syntaxTree, i), this.DW.getString(i3));
                                        return;
                                    }
                                }
                                return;
                            default:
                                return;
                        }
                }
            }
            if (setOf.contains(syntaxTree.getAttrReferenceEntity(i))) {
                if (syntaxTree.getStartLine(i) == 0) {
                    j6("Code in included files will not be changed.", syntaxTree.getFile(), 1, 1);
                } else {
                    this.j6.refactoringCallback.nw(fileEntry, f2Var.EQ(syntaxTree, i), f2Var.tp(syntaxTree, i), f2Var.u7(syntaxTree, i), f2Var.VH(syntaxTree, i), this.DW.getString(i3));
                    f2Var.aM(f2Var.EQ(syntaxTree, i), f2Var.tp(syntaxTree, i), f2Var.u7(syntaxTree, i), f2Var.VH(syntaxTree, i), this.DW.getString(i3));
                }
            }
        } catch (Throwable th2) {
            th = th2;
            c = 1;
        }
    }

    @ey(method = -517692306950973525L)
    private void XL(FileEntry fileEntry, String str, SetOfFileEntry setOfFileEntry) {
        try {
            if (VH) {
                iy.we(-3949393217719300036L, this, fileEntry, str, setOfFileEntry);
            }
            setOfFileEntry.j6.init();
            while (setOfFileEntry.j6.hasMoreElements()) {
                if (setOfFileEntry.j6.nextKey().isEnclosingDir(fileEntry)) {
                    return;
                }
            }
            this.j6.refactoringCallback.sG(fileEntry, str);
        } catch (Throwable th) {
            if (gn) {
                iy.U2(th, -3949393217719300036L, this, fileEntry, str, setOfFileEntry);
            }
            throw th;
        }
    }

    @ey(method = -6001186462241320728L)
    private void a8(int i, Member member, int i2, boolean z) {
        try {
            if (VH) {
                iy.J0(-5274924216984542593L, this, new Integer(i), member, new Integer(i2), new Boolean(z));
            }
            f2 f2Var = new f2();
            SetOfFileEntry setOfFileEntry = new SetOfFileEntry(this.FH);
            setOfFileEntry.u7(this.FH.KD());
            SetOf<Member> setOfWe = we(member);
            Hw(setOfWe, setOfFileEntry, i2);
            FileEntry file = member.getFile();
            List<SyntaxTree> listVH = this.v5.VH(file);
            f2Var.Zo();
            f2Var.v5(listVH);
            for (SyntaxTree syntaxTree : listVH) {
                syntaxTree.getLanguage().getCodeAnalyzer().Hw(syntaxTree, i);
                U2(syntaxTree, f2Var, syntaxTree.getRootNode(), file, i2, setOfWe, z);
                this.v5.releaseSyntaxTree(syntaxTree);
            }
            if (member.yS()) {
                return;
            }
            this.Zo.we(i);
            while (true) {
                FileEntry fileEntryXL = this.Zo.XL();
                if (fileEntryXL == null) {
                    return;
                }
                if (fileEntryXL != member.getFile()) {
                    if (this.j6.stopCallback.et()) {
                        return;
                    }
                    List<SyntaxTree> listVH2 = this.v5.VH(fileEntryXL);
                    f2Var.Zo();
                    f2Var.v5(listVH2);
                    for (SyntaxTree syntaxTree2 : listVH2) {
                        syntaxTree2.getLanguage().getCodeAnalyzer().Hw(syntaxTree2, i);
                        f2 f2Var2 = f2Var;
                        U2(syntaxTree2, f2Var, syntaxTree2.getRootNode(), fileEntryXL, i2, setOfWe, z);
                        this.v5.releaseSyntaxTree(syntaxTree2);
                        f2Var = f2Var2;
                    }
                }
            }
        } catch (Throwable th) {
            if (gn) {
                iy.a8(th, -5274924216984542593L, this, new Integer(i), member, new Integer(i2), new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -3449342678769741312L)
    private void aM(Namespace namespace, Namespace namespace2, int i, SetOfFileEntry setOfFileEntry) {
        try {
            if (VH) {
                iy.J0(-3130946130739982797L, this, namespace, namespace2, new Integer(i), setOfFileEntry);
            }
            SetOfFileEntry setOfFileEntryX9 = namespace.x9();
            setOfFileEntryX9.j6.init();
            while (setOfFileEntryX9.j6.hasMoreElements()) {
                FileEntry fileEntryNextKey = setOfFileEntryX9.j6.nextKey();
                if (fileEntryNextKey.vJ()) {
                    MapOf<ClassType, Namespace> toplevelClasstypesOfFile = this.Hw.getToplevelClasstypesOfFile(fileEntryNextKey);
                    toplevelClasstypesOfFile.j6.DW();
                    while (toplevelClasstypesOfFile.j6.j6()) {
                        Namespace namespace3 = ((ClassType) toplevelClasstypesOfFile.j6.Hw()).getNamespace();
                        FileEntry parentDirectory = fileEntryNextKey.getParentDirectory();
                        if (!setOfFileEntry.contains(parentDirectory) && parentDirectory.getFullNameString().equals(namespace3.getFullyQualifiedNameString())) {
                            String str = "";
                            while (namespace3 != namespace2 && namespace3 != this.Hw.getRootNamespace()) {
                                str = '.' + this.DW.getString(namespace3.getIdentifier()) + str;
                                namespace3 = namespace3.aj();
                            }
                            String fullyQualifiedNameString = namespace2.aj().getFullyQualifiedNameString();
                            if (fullyQualifiedNameString.length() != 0) {
                                fullyQualifiedNameString = fullyQualifiedNameString + '.';
                            }
                            String str2 = fullyQualifiedNameString + this.DW.getString(i) + str;
                            if (!str2.equals(parentDirectory.getFullNameString())) {
                                XL(parentDirectory, str2, setOfFileEntry);
                            }
                            setOfFileEntry.gn(parentDirectory);
                        }
                        while (true) {
                            if (namespace3 == this.Hw.getRootNamespace() || parentDirectory.getNameIdentifier() != namespace3.getIdentifier()) {
                                break;
                            }
                            if (namespace3 != namespace2) {
                                parentDirectory = parentDirectory.getParentDirectory();
                                namespace3 = namespace3.aj();
                            } else if (!setOfFileEntry.contains(parentDirectory)) {
                                XL(parentDirectory, this.DW.getString(i), setOfFileEntry);
                                setOfFileEntry.gn(parentDirectory);
                            }
                        }
                    }
                }
            }
            SetOf<Namespace> setOfQq = namespace.Qq();
            setOfQq.DEFAULT_ITERATOR.init();
            while (setOfQq.DEFAULT_ITERATOR.hasMoreElements()) {
                aM((Namespace) setOfQq.DEFAULT_ITERATOR.nextKey(), namespace2, i, setOfFileEntry);
            }
        } catch (Throwable th) {
            if (gn) {
                iy.a8(th, -3130946130739982797L, this, namespace, namespace2, new Integer(i), setOfFileEntry);
            }
            throw th;
        }
    }

    @ey(method = -2892896213819360640L)
    private void er(SyntaxTree syntaxTree, f2 f2Var, int i, FileEntry fileEntry, int i2, Entity entity, int i3) throws Throwable {
        char c;
        try {
            if (VH) {
                iy.QX(-2454646644910326815L, this, new Object[]{syntaxTree, f2Var, new Integer(i), fileEntry, new Integer(i2), entity, new Integer(i3)});
            }
            for (int childCount = syntaxTree.getChildCount(i) - 1; childCount >= 0; childCount--) {
                c = 1;
                try {
                    er(syntaxTree, f2Var, syntaxTree.getChildNode(i, childCount), fileEntry, i2, entity, i3);
                } catch (Throwable th) {
                    th = th;
                    if (gn) {
                        Object[] objArr = new Object[7];
                        objArr[0] = syntaxTree;
                        objArr[c] = f2Var;
                        objArr[2] = new Integer(i);
                        objArr[3] = fileEntry;
                        objArr[4] = new Integer(i2);
                        objArr[5] = entity;
                        objArr[6] = new Integer(i3);
                        iy.rN(th, -2454646644910326815L, this, objArr);
                    }
                    throw th;
                }
            }
            if (!syntaxTree.isIdentifierNode(i) || syntaxTree.isSyntheticNode(i)) {
                return;
            }
            int iSh = syntaxTree.sh(i);
            if (iSh != 17) {
                switch (iSh) {
                    case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                    case UserTouchAction.CLICK_KIND /* 7 */:
                    case 8:
                    case 9:
                    case 10:
                        break;
                    default:
                        return;
                }
            }
            if (entity == syntaxTree.getAttrReferenceEntity(i)) {
                if (syntaxTree.getStartLine(i) == 0) {
                    j6("Code in included files will not be changed.", syntaxTree.getFile(), 1, 1);
                } else {
                    this.j6.refactoringCallback.nw(fileEntry, f2Var.EQ(syntaxTree, i), f2Var.tp(syntaxTree, i), f2Var.u7(syntaxTree, i), f2Var.VH(syntaxTree, i), this.DW.getString(i3));
                    f2Var.aM(f2Var.EQ(syntaxTree, i), f2Var.tp(syntaxTree, i), f2Var.u7(syntaxTree, i), f2Var.VH(syntaxTree, i), this.DW.getString(i3));
                }
            }
        } catch (Throwable th2) {
            th = th2;
            c = 1;
        }
    }

    @ey(method = -1150412542530181920L)
    private void gW(SyntaxTree syntaxTree, int i, FileEntry fileEntry, int i2, int i3, String str) throws Throwable {
        char c;
        char c2;
        char c3;
        try {
            if (VH) {
                iy.QX(1805165275782020229L, this, new Object[]{syntaxTree, new Integer(i), fileEntry, new Integer(i2), new Integer(i3), str});
            }
            for (int childCount = syntaxTree.getChildCount(i) - 1; childCount >= 0; childCount--) {
                c = 1;
                c2 = 2;
                c3 = 3;
                try {
                    gW(syntaxTree, syntaxTree.getChildNode(i, childCount), fileEntry, i2, i3, str);
                } catch (Throwable th) {
                    th = th;
                    if (gn) {
                        Object[] objArr = new Object[6];
                        objArr[0] = syntaxTree;
                        objArr[c] = new Integer(i);
                        objArr[c2] = fileEntry;
                        objArr[c3] = new Integer(i2);
                        objArr[4] = new Integer(i3);
                        objArr[5] = str;
                        iy.rN(th, 1805165275782020229L, this, objArr);
                    }
                    throw th;
                }
            }
            c = 1;
            c2 = 2;
            c3 = 3;
            if (!syntaxTree.isIdentifierNode(i) || syntaxTree.isSyntheticNode(i)) {
                return;
            }
            int iSh = syntaxTree.sh(i);
            if ((iSh == 1 || iSh == 2 || iSh == 3 || iSh == 32) && i3 == syntaxTree.getAttrReferenceNode(i) && syntaxTree.getStartLine(i) > 0) {
                this.j6.refactoringCallback.nw(fileEntry, syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i), syntaxTree.getEndLine(i), syntaxTree.getEndColumn(i), str);
            }
        } catch (Throwable th2) {
            th = th2;
            c = 1;
            c2 = 2;
            c3 = 3;
        }
    }

    @ey(method = -2150025497857020000L)
    private void gn(SyntaxTree syntaxTree, int i, int i2, SetOf<Member> setOf) {
        try {
            if (VH) {
                iy.J0(1976010710430879201L, this, syntaxTree, new Integer(i), new Integer(i2), setOf);
            }
            int childCount = syntaxTree.getChildCount(i);
            for (int i3 = 0; i3 < childCount; i3++) {
                gn(syntaxTree, syntaxTree.getChildNode(i, i3), i2, setOf);
            }
            if (syntaxTree.isFieldDeclarationNode(i)) {
                try {
                    Member memberJw = this.Hw.jw(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getDeclarationNumber(i));
                    if (this.j6.identifierSpace.QX(memberJw.getIdentifier()) == this.j6.identifierSpace.QX(i2)) {
                        setOf.put(memberJw);
                    }
                } catch (e4 unused) {
                }
            }
        } catch (Throwable th) {
            if (gn) {
                iy.a8(th, 1976010710430879201L, this, syntaxTree, new Integer(i), new Integer(i2), setOf);
            }
            throw th;
        }
    }

    @ey(method = 171056836496832573L)
    private void j3(int i, Member member, int i2, boolean z) {
        try {
            if (VH) {
                iy.J0(3452442308380303848L, this, new Integer(i), member, new Integer(i2), new Boolean(z));
            }
            f2 f2Var = new f2();
            SetOfFileEntry setOfFileEntry = new SetOfFileEntry(this.FH);
            setOfFileEntry.u7(this.FH.KD());
            SetOf<Member> setOfEQ = EQ(member);
            FH(setOfEQ, setOfFileEntry, i2);
            FileEntry file = member.getFile();
            List<SyntaxTree> listVH = this.v5.VH(file);
            f2Var.Zo();
            f2Var.v5(listVH);
            for (SyntaxTree syntaxTree : listVH) {
                syntaxTree.getLanguage().getCodeAnalyzer().Hw(syntaxTree, i);
                U2(syntaxTree, f2Var, syntaxTree.getRootNode(), file, i2, setOfEQ, z);
                this.v5.releaseSyntaxTree(syntaxTree);
            }
            if (member.yS()) {
                return;
            }
            this.Zo.we(i);
            while (true) {
                FileEntry fileEntryXL = this.Zo.XL();
                if (fileEntryXL == null) {
                    return;
                }
                if (fileEntryXL != member.getFile()) {
                    if (this.j6.stopCallback.et()) {
                        return;
                    }
                    List<SyntaxTree> listVH2 = this.v5.VH(fileEntryXL);
                    f2Var.Zo();
                    f2Var.v5(listVH2);
                    for (SyntaxTree syntaxTree2 : listVH2) {
                        syntaxTree2.getLanguage().getCodeAnalyzer().Hw(syntaxTree2, i);
                        f2 f2Var2 = f2Var;
                        U2(syntaxTree2, f2Var, syntaxTree2.getRootNode(), fileEntryXL, i2, setOfEQ, z);
                        this.v5.releaseSyntaxTree(syntaxTree2);
                        f2Var = f2Var2;
                    }
                }
            }
        } catch (Throwable th) {
            if (gn) {
                iy.a8(th, 3452442308380303848L, this, new Integer(i), member, new Integer(i2), new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -2805088652793115465L)
    private void j6(String str, FileEntry fileEntry, int i, int i2) {
        try {
            if (VH) {
                iy.J0(616343678028656708L, this, str, fileEntry, new Integer(i), new Integer(i2));
            }
            this.j6.refactoringCallback.er(fileEntry.getPathString() + ":" + i + ":" + i2 + "\n    " + str);
        } catch (Throwable th) {
            if (gn) {
                iy.a8(th, 616343678028656708L, this, str, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 450586088611556211L)
    private void lg(int i, Namespace namespace, int i2) {
        try {
            if (VH) {
                iy.we(-33078359149185636L, this, new Integer(i), namespace, new Integer(i2));
            }
            f2 f2Var = new f2();
            this.Zo.we(i);
            while (true) {
                FileEntry fileEntryXL = this.Zo.XL();
                if (fileEntryXL == null || this.j6.stopCallback.et()) {
                    break;
                }
                List<SyntaxTree> listVH = this.v5.VH(fileEntryXL);
                f2Var.Zo();
                f2Var.v5(listVH);
                for (SyntaxTree syntaxTree : listVH) {
                    syntaxTree.getLanguage().getCodeAnalyzer().Hw(syntaxTree, i);
                    er(syntaxTree, f2Var, syntaxTree.getRootNode(), fileEntryXL, i, namespace, i2);
                    this.v5.releaseSyntaxTree(syntaxTree);
                }
            }
            aM(namespace, namespace, i2, new SetOfFileEntry(this.FH));
        } catch (Throwable th) {
            if (gn) {
                iy.U2(th, -33078359149185636L, this, new Integer(i), namespace, new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 3731666472329328897L)
    private void rN(SyntaxTree syntaxTree, int i, FileEntry fileEntry, int i2, Entity entity, String str) throws Throwable {
        int i3;
        try {
            if (VH) {
                iy.QX(-1537347331518964096L, this, new Object[]{syntaxTree, new Integer(i), fileEntry, new Integer(i2), entity, str});
            }
            for (int childCount = syntaxTree.getChildCount(i) - 1; childCount >= 0; childCount--) {
                i3 = 6;
                try {
                    rN(syntaxTree, syntaxTree.getChildNode(i, childCount), fileEntry, i2, entity, str);
                } catch (Throwable th) {
                    th = th;
                }
            }
            i3 = 6;
        } catch (Throwable th2) {
            th = th2;
            i3 = 6;
        }
        if (!syntaxTree.isIdentifierNode(i) || syntaxTree.isSyntheticNode(i)) {
            return;
        }
        switch (syntaxTree.sh(i)) {
            case 11:
            case 12:
            case 13:
            case 14:
                if (entity != syntaxTree.getAttrReferenceEntity(i) || syntaxTree.getStartLine(i) <= 0) {
                    return;
                }
                this.j6.refactoringCallback.nw(fileEntry, syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i), syntaxTree.getEndLine(i), syntaxTree.getEndColumn(i), str);
                return;
            default:
                return;
        }
        th = th;
        if (gn) {
            Object[] objArr = new Object[i3];
            objArr[0] = syntaxTree;
            objArr[1] = new Integer(i);
            objArr[2] = fileEntry;
            objArr[3] = new Integer(i2);
            objArr[4] = entity;
            objArr[5] = str;
            iy.rN(th, -1537347331518964096L, this, objArr);
        }
        throw th;
    }

    @ey(method = -32365756371883200L)
    private void tp(SyntaxTree syntaxTree, int i, int i2, int i3, SetOf<Member> setOf) {
        try {
            if (VH) {
                iy.J8(-6312547643029278327L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3), setOf);
            }
            int childCount = syntaxTree.getChildCount(i);
            for (int i4 = 0; i4 < childCount; i4++) {
                tp(syntaxTree, syntaxTree.getChildNode(i, i4), i2, i3, setOf);
            }
            if (syntaxTree.isMethodDeclarationNode(i)) {
                try {
                    Member memberJw = this.Hw.jw(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getDeclarationNumber(i));
                    if (!memberJw.iW() && this.j6.identifierSpace.QX(memberJw.getIdentifier()) == this.j6.identifierSpace.QX(i2) && memberJw.oY() == i3) {
                        setOf.put(memberJw);
                    }
                } catch (e4 unused) {
                }
            }
        } catch (Throwable th) {
            if (gn) {
                iy.lg(th, -6312547643029278327L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3), setOf);
            }
            throw th;
        }
    }

    @ey(method = -3562793537348445153L)
    private SetOf<Member> u7(int i, int i2) {
        try {
            if (VH) {
                iy.EQ(-5073339462082796268L, this, new Integer(i), new Integer(i2));
            }
            SetOf<Member> setOf = new SetOf<>(this.Hw);
            this.Zo.J8(i);
            while (true) {
                FileEntry fileEntryAM = this.Zo.aM();
                if (fileEntryAM == null || this.j6.stopCallback.et()) {
                    break;
                }
                for (SyntaxTree syntaxTree : this.v5.VH(fileEntryAM)) {
                    tp(syntaxTree, syntaxTree.getRootNode(), i, i2, setOf);
                    this.v5.releaseSyntaxTree(syntaxTree);
                }
            }
            return setOf;
        } catch (Throwable th) {
            if (gn) {
                iy.Mr(th, -5073339462082796268L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -2222760893421294975L)
    private SetOf<Member> we(Member member) {
        try {
            if (VH) {
                iy.tp(176240833546099020L, this, member);
            }
            SetOf<Member> setOfU7 = u7(member.getIdentifier(), member.oY());
            SetOf setOf = new SetOf(this.Hw);
            setOf.put(member);
            SetOf<Member> setOf2 = new SetOf<>(this.Hw);
            while (true) {
                setOf.DEFAULT_ITERATOR.init();
                while (setOf.DEFAULT_ITERATOR.hasMoreElements()) {
                    Member member2 = (Member) setOf.DEFAULT_ITERATOR.nextKey();
                    setOf2.put(member2);
                    setOf2.u7(member2.jO());
                    setOfU7.DEFAULT_ITERATOR.init();
                    while (setOfU7.DEFAULT_ITERATOR.hasMoreElements()) {
                        Member member3 = (Member) setOfU7.DEFAULT_ITERATOR.nextKey();
                        if (member3.OW().contains(member2)) {
                            setOf2.put(member3);
                        }
                    }
                }
                if (setOf.J0() == setOf2.J0()) {
                    return setOf2;
                }
                setOf.clear();
                setOf.u7(setOf2);
            }
        } catch (Throwable th) {
            if (gn) {
                iy.j3(th, 176240833546099020L, this, member);
            }
            throw th;
        }
    }

    @ey(method = 300534673061798175L)
    private void yS(SyntaxTree syntaxTree, int i, int i2, int i3) {
        try {
            if (VH) {
                iy.J0(-1141255140741817728L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3));
            }
            SetOfInt setOfInt = new SetOfInt();
            setOfInt.put(i);
            setOfInt.put(i3);
            syntaxTree.getLanguage().getCodeAnalyzer().analyzeEveryIdentifiers(syntaxTree, setOfInt);
            gW(syntaxTree, syntaxTree.getRootNode(), syntaxTree.getFile(), i, i2, this.DW.getString(i3));
        } catch (Throwable th) {
            if (gn) {
                iy.a8(th, -1141255140741817728L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0069 A[Catch: all -> 0x00d5, TryCatch #1 {all -> 0x00d5, blocks: (B:11:0x0051, B:13:0x0069, B:15:0x0079, B:17:0x007f), top: B:39:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e2  */
    @abcd.ey(method = -1516711935829867020L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void BT(com.aide.codemodel.api.FileEntry r27, int r28, int r29, int r30, int r31, java.lang.String r32, java.lang.String r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.o0.BT(com.aide.codemodel.api.FileEntry, int, int, int, int, java.lang.String, java.lang.String):void");
    }

    @ey(method = -2352275583043200000L)
    public void J8(FileEntry fileEntry, int i, int i2) {
        try {
            if (VH) {
                iy.we(-5977193940788635125L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            SetOfFileEntry setOfFileEntry = new SetOfFileEntry(this.FH);
            setOfFileEntry.u7(this.FH.KD());
            SyntaxTree syntaxTreeZo = this.j6.syntaxTreeSpace.Zo(fileEntry, i, i2);
            int iJO = syntaxTreeZo.jO(i, i2);
            if (iJO == -1) {
                this.j6.refactoringCallback.gn("Select a symbol in the code to be renamed.");
                this.v5.releaseSyntaxTree(syntaxTreeZo);
                return;
            }
            int identifier = syntaxTreeZo.getIdentifier(iJO);
            syntaxTreeZo.getLanguage().getCodeAnalyzer().VH(syntaxTreeZo, iJO);
            int iSh = syntaxTreeZo.sh(iJO);
            if (iSh != 32) {
                switch (iSh) {
                    case 1:
                    case 2:
                    case 3:
                        break;
                    case 4:
                    case 5:
                        this.j6.refactoringCallback.j6("label " + this.DW.getString(identifier), this.DW.getString(identifier), true, fileEntry.getPathString(), syntaxTreeZo.getStartLine(iJO), syntaxTreeZo.getStartColumn(iJO), syntaxTreeZo.getEndColumn(iJO));
                        return;
                    case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                        Entity attrReferenceEntity = syntaxTreeZo.getAttrReferenceEntity(iJO);
                        this.j6.refactoringCallback.j6("package " + attrReferenceEntity.getFullyQualifiedNameString(), this.DW.getString(identifier), false, fileEntry.getPathString(), syntaxTreeZo.getStartLine(iJO), syntaxTreeZo.getStartColumn(iJO), syntaxTreeZo.getEndColumn(iJO));
                        return;
                    case UserTouchAction.CLICK_KIND /* 7 */:
                    case 8:
                    case 9:
                    case 10:
                    case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                        Entity attrReferenceEntity2 = syntaxTreeZo.getAttrReferenceEntity(iJO);
                        if (!setOfFileEntry.contains(attrReferenceEntity2.getFile()) && attrReferenceEntity2.getFile() != fileEntry) {
                            this.j6.refactoringCallback.gn("This class is defined outside of the project.");
                            return;
                        }
                        this.j6.refactoringCallback.j6("class " + attrReferenceEntity2.getFullyQualifiedNameString(), this.DW.getString(identifier), false, fileEntry.getPathString(), syntaxTreeZo.getStartLine(iJO), syntaxTreeZo.getStartColumn(iJO), syntaxTreeZo.getEndColumn(iJO));
                        return;
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                        Entity attrReferenceEntity3 = syntaxTreeZo.getAttrReferenceEntity(iJO);
                        this.j6.refactoringCallback.j6("parametertype " + attrReferenceEntity3.getFullyQualifiedNameString(), this.DW.getString(identifier), true, fileEntry.getPathString(), syntaxTreeZo.getStartLine(iJO), syntaxTreeZo.getStartColumn(iJO), syntaxTreeZo.getEndColumn(iJO));
                        return;
                    case 15:
                    case 16:
                        Entity attrReferenceEntity4 = syntaxTreeZo.getAttrReferenceEntity(iJO);
                        if (!setOfFileEntry.contains(attrReferenceEntity4.getFile()) && attrReferenceEntity4.getFile() != fileEntry) {
                            this.j6.refactoringCallback.gn("This field is defined outside of the project.");
                            return;
                        }
                        this.j6.refactoringCallback.j6("field " + attrReferenceEntity4.getFullyQualifiedNameString(), this.DW.getString(identifier), ((Member) attrReferenceEntity4).yS(), fileEntry.getPathString(), syntaxTreeZo.getStartLine(iJO), syntaxTreeZo.getStartColumn(iJO), syntaxTreeZo.getEndColumn(iJO));
                        return;
                    default:
                        switch (iSh) {
                            case 19:
                            case ProxyTextView.INPUTTYPE_date /* 20 */:
                                Entity attrReferenceEntity5 = syntaxTreeZo.getAttrReferenceEntity(iJO);
                                if (!setOfFileEntry.contains(attrReferenceEntity5.getFile()) && fileEntry != attrReferenceEntity5.getFile()) {
                                    this.j6.refactoringCallback.gn("This method is defined outside of the project.");
                                    return;
                                }
                                this.j6.refactoringCallback.j6("method " + attrReferenceEntity5.getFullyQualifiedNameString(), this.DW.getString(identifier), ((Member) attrReferenceEntity5).yS(), fileEntry.getPathString(), syntaxTreeZo.getStartLine(iJO), syntaxTreeZo.getStartColumn(iJO), syntaxTreeZo.getEndColumn(iJO));
                                return;
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                                Entity attrReferenceEntity6 = syntaxTreeZo.getAttrReferenceEntity(iJO);
                                if (!setOfFileEntry.contains(attrReferenceEntity6.getFile()) && attrReferenceEntity6.getFile() != fileEntry) {
                                    this.j6.refactoringCallback.gn("This class is defined outside of the project.");
                                    return;
                                }
                                this.j6.refactoringCallback.j6("class " + ((Member) attrReferenceEntity6).getEnclosingClassType().getFullyQualifiedNameString(), this.DW.getString(identifier), false, fileEntry.getPathString(), syntaxTreeZo.getStartLine(iJO), syntaxTreeZo.getStartColumn(iJO), syntaxTreeZo.getEndColumn(iJO));
                                return;
                            default:
                                this.j6.refactoringCallback.gn("Select a symbol in the code to be renamed.");
                                return;
                        }
                }
            }
            this.j6.refactoringCallback.j6("variable " + this.DW.getString(identifier), this.DW.getString(identifier), true, fileEntry.getPathString(), syntaxTreeZo.getStartLine(iJO), syntaxTreeZo.getStartColumn(iJO), syntaxTreeZo.getEndColumn(iJO));
        } catch (Throwable th) {
            if (gn) {
                iy.U2(th, -5977193940788635125L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -1551741171852775365L)
    public void Zo(FileEntry fileEntry, String str) {
        try {
            if (VH) {
                iy.EQ(506104089765650064L, this, fileEntry, str);
            }
            this.j6.refactoringCallback.g3();
            if (fileEntry.isDirectory()) {
                try {
                    lg(fileEntry.getNameIdentifier(), J0(fileEntry), this.DW.get(str));
                } catch (e4 unused) {
                    this.j6.refactoringCallback.sG(fileEntry, str);
                }
            } else if (fileEntry.I()) {
                ClassType classType = null;
                MapOf<ClassType, Namespace> toplevelClasstypesOfFile = this.j6.entitySpace.getToplevelClasstypesOfFile(fileEntry);
                toplevelClasstypesOfFile.j6.DW();
                while (true) {
                    if (!toplevelClasstypesOfFile.j6.j6()) {
                        break;
                    }
                    ClassType classType2 = (ClassType) toplevelClasstypesOfFile.j6.Hw();
                    if (classType2.getIdentifier() == fileEntry.getNameIdentifier()) {
                        classType = classType2;
                        break;
                    }
                }
                if (classType != null) {
                    if (str.lastIndexOf(46) > 0) {
                        str = str.substring(0, str.lastIndexOf(46));
                    }
                    QX(fileEntry.getNameIdentifier(), classType, this.DW.get(str), false);
                } else {
                    this.j6.refactoringCallback.sG(fileEntry, str);
                }
            } else {
                this.j6.refactoringCallback.sG(fileEntry, str);
            }
            this.j6.refactoringCallback.cn();
        } catch (Throwable th) {
            String str2 = str;
            if (gn) {
                iy.Mr(th, 506104089765650064L, this, fileEntry, str2);
            }
            throw th;
        }
    }

    @ey(method = 1085553862682433617L)
    public void v5(FileEntry fileEntry, int i, int i2, String str) {
        try {
            if (VH) {
                iy.J0(388729327969521152L, this, fileEntry, new Integer(i), new Integer(i2), str);
            }
            SyntaxTree syntaxTreeZo = this.j6.syntaxTreeSpace.Zo(fileEntry, i, i2);
            int iJO = syntaxTreeZo.jO(i, i2);
            if (iJO == -1) {
                this.v5.releaseSyntaxTree(syntaxTreeZo);
                return;
            }
            this.j6.refactoringCallback.g3();
            int identifier = syntaxTreeZo.getIdentifier(iJO);
            syntaxTreeZo.getLanguage().getCodeAnalyzer().VH(syntaxTreeZo, iJO);
            int iSh = syntaxTreeZo.sh(iJO);
            if (iSh != 32) {
                switch (iSh) {
                    case 1:
                    case 2:
                    case 3:
                        break;
                    case 4:
                    case 5:
                        int attrReferenceNode = syntaxTreeZo.getAttrReferenceNode(iJO);
                        syntaxTreeZo.getLanguage().getCodeAnalyzer().Hw(syntaxTreeZo, identifier);
                        Mr(syntaxTreeZo, syntaxTreeZo.getRootNode(), fileEntry, identifier, attrReferenceNode, str);
                        this.j6.refactoringCallback.cn();
                        return;
                    case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                        lg(identifier, (Namespace) syntaxTreeZo.getAttrReferenceEntity(iJO), this.DW.get(str));
                        this.j6.refactoringCallback.cn();
                        return;
                    case UserTouchAction.CLICK_KIND /* 7 */:
                    case 8:
                    case 9:
                    case 10:
                    case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                        QX(identifier, (ClassType) syntaxTreeZo.getAttrReferenceEntity(iJO), this.DW.get(str), true);
                        this.j6.refactoringCallback.cn();
                        return;
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                        Entity attrReferenceEntity = syntaxTreeZo.getAttrReferenceEntity(iJO);
                        syntaxTreeZo.getLanguage().getCodeAnalyzer().Hw(syntaxTreeZo, identifier);
                        rN(syntaxTreeZo, syntaxTreeZo.getRootNode(), fileEntry, identifier, attrReferenceEntity, str);
                        this.j6.refactoringCallback.cn();
                        return;
                    case 15:
                    case 16:
                        j3(identifier, (Member) syntaxTreeZo.getAttrReferenceEntity(iJO), this.DW.get(str), false);
                        this.j6.refactoringCallback.cn();
                        return;
                    default:
                        switch (iSh) {
                            case 19:
                            case ProxyTextView.INPUTTYPE_date /* 20 */:
                                a8(identifier, (Member) syntaxTreeZo.getAttrReferenceEntity(iJO), this.DW.get(str), false);
                                this.j6.refactoringCallback.cn();
                                return;
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                                QX(identifier, ((Member) syntaxTreeZo.getAttrReferenceEntity(iJO)).getEnclosingClassType(), this.DW.get(str), true);
                                this.j6.refactoringCallback.cn();
                                return;
                            default:
                                return;
                        }
                }
            }
            yS(syntaxTreeZo, identifier, syntaxTreeZo.getAttrReferenceNode(iJO), this.DW.get(str));
            this.j6.refactoringCallback.cn();
        } catch (Throwable th) {
            if (gn) {
                iy.a8(th, 388729327969521152L, this, fileEntry, new Integer(i), new Integer(i2), str);
            }
            throw th;
        }
    }
}
