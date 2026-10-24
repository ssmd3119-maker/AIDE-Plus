package abcd;

import com.aide.codemodel.AIDEModel;
import com.aide.codemodel.api.ClassType;
import com.aide.codemodel.api.Entity;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.Member;
import com.aide.codemodel.api.Namespace;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.collections.ListOfInt;
import com.aide.codemodel.api.collections.MapOf;
import com.aide.codemodel.api.collections.MapOfInt;
import com.aide.codemodel.api.collections.SetOf;
import com.aide.codemodel.api.collections.SetOfFileEntry;
import com.aide.codemodel.api.collections.SetOfInt;
import com.probelytics.api.UserTouchAction;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

@cy(clazz = 1536589538377802355L, container = 1536589538377802355L, user = true)
/* loaded from: classes.dex */
public class m0 {

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = 599024862505020264L)
    private f2 DW;

    @dy(field = 1553239129911793567L)
    private final AIDEModel j6;

    static {
        iy.Zo(m0.class);
    }

    @ey(method = 173955657862426440L)
    public m0(AIDEModel aIDEModel) {
        try {
            if (FH) {
                iy.tp(4228790278083603681L, null, aIDEModel);
            }
            this.DW = new f2();
            this.j6 = aIDEModel;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 4228790278083603681L, null, aIDEModel);
            }
            throw th;
        }
    }

    @ey(method = -1203532400134981512L)
    private void DW(Namespace namespace, Namespace namespace2, MapOf<ClassType, Namespace> mapOf) {
        try {
            if (FH) {
                iy.we(64075828159691612L, this, namespace, namespace2, mapOf);
            }
            MapOfInt<ClassType> mapOfIntCa = namespace.ca();
            mapOfIntCa.DEFAULT_ITERATOR.DW();
            while (mapOfIntCa.DEFAULT_ITERATOR.hasMoreElements()) {
                mapOf.QX((ClassType) mapOfIntCa.DEFAULT_ITERATOR.nextValue(), namespace2);
            }
            SetOf<Namespace> setOfQq = namespace.Qq();
            setOfQq.DEFAULT_ITERATOR.init();
            while (setOfQq.DEFAULT_ITERATOR.hasMoreElements()) {
                Namespace namespace3 = (Namespace) setOfQq.DEFAULT_ITERATOR.nextKey();
                DW(namespace3, namespace2.OW(namespace3.getIdentifier()), mapOf);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, 64075828159691612L, this, namespace, namespace2, mapOf);
            }
            throw th;
        }
    }

    @ey(method = 232382133978004269L)
    private void FH(FileEntry fileEntry, SetOfFileEntry setOfFileEntry) {
        try {
            if (FH) {
                iy.EQ(-633648634136176141L, this, fileEntry, setOfFileEntry);
            }
            if (fileEntry.vJ()) {
                setOfFileEntry.gn(fileEntry);
                return;
            }
            if (fileEntry.isDirectory()) {
                int childCount = fileEntry.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    FH(fileEntry.getChildEntry(i), setOfFileEntry);
                }
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -633648634136176141L, this, fileEntry, setOfFileEntry);
            }
            throw th;
        }
    }

    @ey(method = -337342011861085920L)
    private Namespace Hw(FileEntry fileEntry) {
        FileEntry fileEntryZo;
        try {
            if (FH) {
                iy.tp(-196626980928887232L, this, fileEntry);
            }
            SetOfFileEntry setOfFileEntryKD = this.j6.fileSpace.KD();
            setOfFileEntryKD.j6.init();
            while (setOfFileEntryKD.j6.hasMoreElements()) {
                try {
                    fileEntryZo = Zo(setOfFileEntryKD.j6.nextKey());
                } catch (e4 unused) {
                }
                if (fileEntryZo.isEnclosingDir(fileEntry)) {
                    String str = "";
                    while (fileEntry != fileEntryZo) {
                        if (str.length() > 0) {
                            str = "." + str;
                        }
                        str = fileEntry.getFullNameString() + str;
                        fileEntry = fileEntry.getParentDirectory();
                    }
                    return v5(str);
                }
                continue;
            }
            throw new e4();
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -196626980928887232L, this, fileEntry);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v23, types: [com.aide.codemodel.api.Entity] */
    /* JADX WARN: Type inference failed for: r2v29, types: [com.aide.codemodel.api.Entity] */
    @ey(method = -3214890740569322997L)
    private void J0(FileEntry fileEntry, boolean z, MapOf<ClassType, Namespace> mapOf) {
        ListOfInt listOfInt;
        int i;
        try {
            if (FH) {
                iy.we(-5547506201926931539L, this, fileEntry, new Boolean(z), mapOf);
            }
            Iterator<SyntaxTree> it = this.j6.syntaxTreeSpace.VH(fileEntry).iterator();
            if (it.hasNext()) {
                SyntaxTree next = it.next();
                next.getLanguage().getCodeAnalyzer().FH(next);
                this.DW.Zo();
                MapOf<ClassType, Entity> mapOf2 = new MapOf<>(this.j6.entitySpace);
                SetOf<Namespace> setOf = new SetOf<>(this.j6.entitySpace);
                boolean zVH = VH(next, next.getRootNode(), z, mapOf, mapOf2, setOf);
                MapOfInt mapOfInt = new MapOfInt(this.j6.entitySpace);
                MapOf<ClassType, Namespace> toplevelClasstypesOfFile = this.j6.entitySpace.getToplevelClasstypesOfFile(fileEntry);
                toplevelClasstypesOfFile.j6.DW();
                while (toplevelClasstypesOfFile.j6.j6()) {
                    ClassType classType = (ClassType) toplevelClasstypesOfFile.j6.Hw();
                    if (classType.getLanguage() == next.getLanguage() && next.getClassDeclarationNode(classType.DW()) != -1 && next.getStartLine(next.getClassDeclarationNode(classType.DW())) > 0) {
                        mapOfInt.we(next.getClassDeclarationNode(classType.DW()), classType);
                    }
                }
                mapOfInt.DEFAULT_ITERATOR.DW();
                while (mapOfInt.DEFAULT_ITERATOR.hasMoreElements()) {
                    this.DW.DW(next, mapOfInt.DEFAULT_ITERATOR.Hw());
                }
                ListOfInt namespaceNodePairs = next.getNamespaceNodePairs();
                for (int i2 = 0; i2 < namespaceNodePairs.size(); i2++) {
                    this.DW.DW(next, namespaceNodePairs.get(i2));
                }
                ListOfInt importNodePairs = next.getImportNodePairs();
                for (int i3 = 0; i3 < importNodePairs.size(); i3++) {
                    this.DW.DW(next, importNodePairs.get(i3));
                }
                J8(next, next.getRootNode(), mapOf);
                if (z || zVH) {
                    int iQp = next.qp();
                    int iFY = next.fY();
                    String strMz = next.getLanguage().getTools().Mz(next, mapOf2, setOf);
                    String strEf = next.getLanguage().getTools().ef(next, mapOf2);
                    if (strEf.length() > 0) {
                        if (strMz.length() > 0) {
                            strMz = strMz + "\n\n";
                        }
                        strMz = strMz + strEf;
                    }
                    if (strMz.length() > 0) {
                        if (importNodePairs.size() == 0) {
                            strMz = strMz + "\n\n";
                        }
                        String str = strMz;
                        this.DW.aM(iQp, iFY, iQp, iFY, str);
                        i = 1;
                        listOfInt = importNodePairs;
                        this.j6.refactoringCallback.nw(fileEntry, iQp, iFY, iQp, iFY, str);
                    } else {
                        listOfInt = importNodePairs;
                        i = 1;
                    }
                    int size = listOfInt.size() - i;
                    while (size >= 0) {
                        ListOfInt listOfInt2 = listOfInt;
                        int i4 = listOfInt2.get(size - 1);
                        int i5 = listOfInt2.get(size);
                        int iEQ = this.DW.EQ(next, i4);
                        int iTp = this.DW.tp(next, i4);
                        int iU7 = this.DW.u7(next, i5);
                        int iVH = this.DW.VH(next, i5);
                        this.DW.XL(iEQ, iTp, iU7, iVH);
                        this.j6.refactoringCallback.nw(fileEntry, iEQ, iTp, iU7, iVH, "");
                        size -= 2;
                        listOfInt = listOfInt2;
                    }
                } else {
                    i = 1;
                }
                if (z) {
                    for (int size2 = namespaceNodePairs.size() - i; size2 >= 0; size2 -= 2) {
                        int i6 = namespaceNodePairs.get(size2 - 1);
                        int i7 = namespaceNodePairs.get(size2);
                        int iEQ2 = this.DW.EQ(next, i6);
                        int iTp2 = this.DW.tp(next, i6);
                        int iU72 = this.DW.u7(next, i7);
                        int iVH2 = this.DW.VH(next, i7);
                        this.DW.XL(iEQ2, iTp2, iU72, iVH2);
                        this.j6.refactoringCallback.nw(fileEntry, iEQ2, iTp2, iU72, iVH2, "");
                    }
                    mapOfInt.DEFAULT_ITERATOR.DW();
                    while (true) {
                        if (!mapOfInt.DEFAULT_ITERATOR.hasMoreElements()) {
                            break;
                        }
                        int iHw = mapOfInt.DEFAULT_ITERATOR.Hw();
                        ClassType classType2 = (ClassType) mapOfInt.DEFAULT_ITERATOR.nextValue();
                        Namespace container = classType2.getContainer();
                        if (mapOf.contains(classType2)) {
                            container = mapOf.get(classType2);
                        }
                        if (container.isNamespace()) {
                            String strKD = next.getLanguage().getTools().KD(container);
                            String strCa = next.getLanguage().getTools().ca(container);
                            if (strKD.length() <= 0 && strCa.length() <= 0) {
                                String strEQ = next.getLanguage().getTools().EQ(container);
                                if (strEQ.length() > 0) {
                                    this.j6.refactoringCallback.nw(fileEntry, 1, 1, 1, 1, strEQ);
                                    break;
                                }
                            } else {
                                int iEQ3 = this.DW.EQ(next, iHw);
                                int iTp3 = this.DW.tp(next, iHw);
                                this.DW.aM(iEQ3, iTp3, iEQ3, iTp3, strKD);
                                this.j6.refactoringCallback.nw(fileEntry, iEQ3, iTp3, iEQ3, iTp3, strKD);
                                int iU73 = this.DW.u7(next, iHw);
                                int iVH3 = this.DW.VH(next, iHw);
                                this.DW.aM(iU73, iVH3, iU73, iVH3, strCa);
                                this.j6.refactoringCallback.nw(fileEntry, iU73, iVH3, iU73, iVH3, strCa);
                            }
                        }
                    }
                    this.j6.refactoringCallback.Sf(fileEntry, i, 100000);
                }
                this.j6.syntaxTreeSpace.releaseSyntaxTree(next);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, -5547506201926931539L, this, fileEntry, new Boolean(z), mapOf);
            }
            throw th;
        }
    }

    @ey(method = -1568962870652688145L)
    private void J8(SyntaxTree syntaxTree, int i, MapOf<ClassType, Namespace> mapOf) {
        try {
            if (FH) {
                iy.we(1453044110920230473L, this, syntaxTree, new Integer(i), mapOf);
            }
            if (syntaxTree.isIdentifierNode(i) && syntaxTree.sh(i) == 8 && mapOf.contains((ClassType) syntaxTree.getAttrReferenceEntity(i)) && syntaxTree.d8(i)) {
                int iE9 = syntaxTree.e9(i);
                int iEQ = this.DW.EQ(syntaxTree, iE9);
                int iTp = this.DW.tp(syntaxTree, iE9);
                int iEQ2 = this.DW.EQ(syntaxTree, i);
                int iTp2 = this.DW.tp(syntaxTree, i);
                this.DW.XL(iEQ, iTp, iEQ2, iTp2);
                this.j6.refactoringCallback.nw(syntaxTree.getFile(), iEQ, iTp, iEQ2, iTp2, "");
            }
            int childCount = syntaxTree.getChildCount(i);
            for (int i2 = 0; i2 < childCount; i2++) {
                J8(syntaxTree, syntaxTree.getChildNode(i, i2), mapOf);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, 1453044110920230473L, this, syntaxTree, new Integer(i), mapOf);
            }
            throw th;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0050. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0053. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fd A[Catch: all -> 0x014b, TryCatch #1 {all -> 0x014b, blocks: (B:3:0x001f, B:5:0x0023, B:6:0x003e, B:8:0x0044, B:12:0x0050, B:13:0x0053, B:15:0x0058, B:17:0x0068, B:44:0x0119, B:46:0x0120, B:18:0x0070, B:19:0x0079, B:21:0x0089, B:23:0x0093, B:24:0x009c, B:26:0x00a8, B:28:0x00b2, B:29:0x00ba, B:31:0x00c6, B:33:0x00cf, B:35:0x00db, B:37:0x00e5, B:38:0x00f1, B:39:0x00fd, B:41:0x0109, B:42:0x0111), top: B:63:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0120 A[Catch: all -> 0x014b, TRY_LEAVE, TryCatch #1 {all -> 0x014b, blocks: (B:3:0x001f, B:5:0x0023, B:6:0x003e, B:8:0x0044, B:12:0x0050, B:13:0x0053, B:15:0x0058, B:17:0x0068, B:44:0x0119, B:46:0x0120, B:18:0x0070, B:19:0x0079, B:21:0x0089, B:23:0x0093, B:24:0x009c, B:26:0x00a8, B:28:0x00b2, B:29:0x00ba, B:31:0x00c6, B:33:0x00cf, B:35:0x00db, B:37:0x00e5, B:38:0x00f1, B:39:0x00fd, B:41:0x0109, B:42:0x0111), top: B:63:0x001f }] */
    @abcd.ey(method = -7820206358859946255L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean VH(com.aide.codemodel.api.SyntaxTree r24, int r25, boolean r26, com.aide.codemodel.api.collections.MapOf<com.aide.codemodel.api.ClassType, com.aide.codemodel.api.Namespace> r27, com.aide.codemodel.api.collections.MapOf<com.aide.codemodel.api.ClassType, com.aide.codemodel.api.Entity> r28, com.aide.codemodel.api.collections.SetOf<com.aide.codemodel.api.Namespace> r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.m0.VH(com.aide.codemodel.api.SyntaxTree, int, boolean, com.aide.codemodel.api.collections.MapOf, com.aide.codemodel.api.collections.MapOf, com.aide.codemodel.api.collections.SetOf):boolean");
    }

    @ey(method = 2080643332016328944L)
    private void Ws(MapOf<ClassType, Namespace> mapOf) {
        try {
            if (FH) {
                iy.tp(559612268758833620L, this, mapOf);
            }
            SetOfInt setOfInt = new SetOfInt();
            SetOfFileEntry setOfFileEntry = new SetOfFileEntry(this.j6.fileSpace);
            mapOf.j6.DW();
            while (mapOf.j6.j6()) {
                ClassType classType = (ClassType) mapOf.j6.Hw();
                setOfFileEntry.gn(classType.getFile());
                setOfInt.put(classType.getIdentifier());
            }
            this.j6.vy.J0(setOfInt);
            while (true) {
                FileEntry fileEntryXL = this.j6.vy.XL();
                if (fileEntryXL == null) {
                    break;
                } else if (!setOfFileEntry.contains(fileEntryXL)) {
                    J0(fileEntryXL, false, mapOf);
                }
            }
            setOfFileEntry.j6.init();
            while (setOfFileEntry.j6.hasMoreElements()) {
                J0(setOfFileEntry.j6.nextKey(), true, mapOf);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 559612268758833620L, this, mapOf);
            }
            throw th;
        }
    }

    @ey(method = -204487295331608592L)
    private void XL(Map<FileEntry, FileEntry> map) {
        try {
            if (FH) {
                iy.tp(84677781315767200L, this, map);
            }
            for (Map.Entry<FileEntry, FileEntry> entry : map.entrySet()) {
                this.j6.refactoringCallback.lg(entry.getKey(), entry.getValue());
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 84677781315767200L, this, map);
            }
            throw th;
        }
    }

    @ey(method = 1629797425924338380L)
    private FileEntry Zo(FileEntry fileEntry) {
        try {
            if (FH) {
                iy.tp(-569160056184883240L, this, fileEntry);
            }
            MapOf<ClassType, Namespace> toplevelClasstypesOfFile = this.j6.entitySpace.getToplevelClasstypesOfFile(fileEntry);
            toplevelClasstypesOfFile.j6.DW();
            while (toplevelClasstypesOfFile.j6.j6()) {
                Namespace namespace = ((ClassType) toplevelClasstypesOfFile.j6.Hw()).getNamespace();
                FileEntry parentDirectory = fileEntry.getParentDirectory();
                if (parentDirectory.getFullNameString().equals(namespace.getFullyQualifiedNameString())) {
                    return parentDirectory.getParentDirectory();
                }
                while (parentDirectory.getNameIdentifier() == namespace.getIdentifier()) {
                    parentDirectory = parentDirectory.getParentDirectory();
                    namespace = namespace.aj();
                    if (parentDirectory == this.j6.fileSpace.cb()) {
                        break;
                    }
                    if (namespace == this.j6.entitySpace.getRootNamespace()) {
                        return parentDirectory;
                    }
                }
            }
            throw new e4();
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -569160056184883240L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = -2989551753306352355L)
    private MapOf<ClassType, Namespace> gn(List<FileEntry> list, FileEntry fileEntry) {
        Namespace namespaceOW;
        try {
            if (FH) {
                iy.EQ(1735149143231147291L, this, list, fileEntry);
            }
            MapOf<ClassType, Namespace> mapOf = new MapOf<>(this.j6.entitySpace);
            try {
                Namespace namespaceHw = Hw(fileEntry);
                for (int i = 0; i < list.size(); i++) {
                    SetOfFileEntry setOfFileEntry = new SetOfFileEntry(this.j6.fileSpace);
                    FileEntry fileEntry2 = list.get(i);
                    FH(fileEntry2, setOfFileEntry);
                    setOfFileEntry.j6.init();
                    while (setOfFileEntry.j6.hasMoreElements()) {
                        FileEntry fileEntryNextKey = setOfFileEntry.j6.nextKey();
                        if (fileEntry2.isDirectory()) {
                            ListOfInt listOfInt = new ListOfInt();
                            FileEntry parentDirectory = fileEntryNextKey.getParentDirectory();
                            while (parentDirectory != fileEntry2) {
                                listOfInt.add(parentDirectory.QX());
                                parentDirectory = parentDirectory.getParentDirectory();
                            }
                            listOfInt.add(parentDirectory.QX());
                            namespaceOW = namespaceHw;
                            for (int size = listOfInt.size() - 1; size >= 0; size--) {
                                namespaceOW = namespaceOW.OW(listOfInt.get(size));
                            }
                        } else {
                            namespaceOW = namespaceHw;
                        }
                        MapOf<ClassType, Namespace> toplevelClasstypesOfFile = this.j6.entitySpace.getToplevelClasstypesOfFile(fileEntryNextKey);
                        toplevelClasstypesOfFile.j6.DW();
                        while (toplevelClasstypesOfFile.j6.j6()) {
                            mapOf.QX(toplevelClasstypesOfFile.j6.Hw(), namespaceOW);
                        }
                    }
                }
            } catch (e4 unused) {
            }
            return mapOf;
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 1735149143231147291L, this, list, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = -204788159415620025L)
    private Map<FileEntry, FileEntry> tp(Map<FileEntry, FileEntry> map) {
        try {
            if (FH) {
                iy.tp(259199413373197665L, this, map);
            }
            return new HashMap();
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 259199413373197665L, this, map);
            }
            throw th;
        }
    }

    @ey(method = 4776932595641744760L)
    private Map<FileEntry, FileEntry> u7(MapOf<ClassType, Namespace> mapOf) {
        try {
            if (FH) {
                iy.tp(3674823577208015360L, this, mapOf);
            }
            HashMap map = new HashMap();
            mapOf.j6.DW();
            while (mapOf.j6.j6()) {
                ClassType classType = (ClassType) mapOf.j6.Hw();
                Namespace namespace = (Namespace) mapOf.j6.v5();
                FileEntry file = classType.getFile();
                if (file.vJ() && file.getNameIdentifier() == classType.getIdentifier()) {
                    boolean zWe = false;
                    FileEntry parentDirectory = null;
                    try {
                        parentDirectory = Zo(file);
                        zWe = we(file);
                    } catch (e4 unused) {
                        if (classType.getNamespace().kQ()) {
                            parentDirectory = file.getParentDirectory();
                        }
                    }
                    if (parentDirectory != null) {
                        String fullyQualifiedNameString = namespace.getFullyQualifiedNameString();
                        if (!zWe) {
                            fullyQualifiedNameString = fullyQualifiedNameString.replace('.', File.separatorChar);
                        }
                        map.put(file, this.j6.fileSpace.lg(parentDirectory.getPathString() + File.separator + fullyQualifiedNameString));
                    }
                }
            }
            return map;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 3674823577208015360L, this, mapOf);
            }
            throw th;
        }
    }

    @ey(method = -84923276977446985L)
    private Namespace v5(String str) {
        try {
            if (FH) {
                iy.tp(-98398305706868695L, this, str);
            }
            Namespace rootNamespace = this.j6.entitySpace.getRootNamespace();
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            while (stringTokenizer.hasMoreElements()) {
                rootNamespace = rootNamespace.OW(this.j6.identifierSpace.get(stringTokenizer.nextToken()));
            }
            return rootNamespace;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -98398305706868695L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -6683728583737977885L)
    private boolean we(FileEntry fileEntry) {
        try {
            if (FH) {
                iy.tp(-5221825873873167427L, this, fileEntry);
            }
            MapOf<ClassType, Namespace> toplevelClasstypesOfFile = this.j6.entitySpace.getToplevelClasstypesOfFile(fileEntry);
            toplevelClasstypesOfFile.j6.DW();
            loop0: while (toplevelClasstypesOfFile.j6.j6()) {
                Namespace namespace = ((ClassType) toplevelClasstypesOfFile.j6.Hw()).getNamespace();
                FileEntry parentDirectory = fileEntry.getParentDirectory();
                if (parentDirectory.getFullNameString().indexOf(46) != -1 && parentDirectory.getFullNameString().equals(namespace.getFullyQualifiedNameString())) {
                    return true;
                }
                while (parentDirectory.getNameIdentifier() == namespace.getIdentifier()) {
                    parentDirectory = parentDirectory.getParentDirectory();
                    namespace = namespace.aj();
                    if (parentDirectory == this.j6.fileSpace.cb()) {
                        break;
                    }
                    if (namespace == this.j6.entitySpace.getRootNamespace()) {
                        break loop0;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -5221825873873167427L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = 2801923270939406227L)
    public void EQ(FileEntry fileEntry, int i, int i2) {
        try {
            if (FH) {
                iy.we(4339940653076643581L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            SetOfFileEntry setOfFileEntry = new SetOfFileEntry(this.j6.fileSpace);
            setOfFileEntry.u7(this.j6.fileSpace.KD());
            SyntaxTree syntaxTreeZo = this.j6.syntaxTreeSpace.Zo(fileEntry, i, i2);
            int iJO = syntaxTreeZo.jO(i, i2);
            if (iJO == -1) {
                this.j6.syntaxTreeSpace.releaseSyntaxTree(syntaxTreeZo);
                this.j6.refactoringCallback.u7("Select a class or namespace identifier in the code to be moved.");
                return;
            }
            syntaxTreeZo.getLanguage().getCodeAnalyzer().VH(syntaxTreeZo, iJO);
            int iSh = syntaxTreeZo.sh(iJO);
            if (iSh != 17) {
                switch (iSh) {
                    case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                        Namespace namespace = (Namespace) syntaxTreeZo.getAttrReferenceEntity(iJO);
                        this.j6.refactoringCallback.FH("All classes of namespace " + namespace.getFullyQualifiedNameString() + " will be moved to the new namespace and all references will be updated.", namespace.getFullyQualifiedNameString());
                        return;
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
                                ClassType enclosingClassType = ((Member) syntaxTreeZo.getAttrReferenceEntity(iJO)).getEnclosingClassType();
                                if (!setOfFileEntry.contains(enclosingClassType.getFile()) || !enclosingClassType.isToplevel()) {
                                    this.j6.refactoringCallback.u7("This class is defined outside of the project.");
                                    return;
                                }
                                this.j6.refactoringCallback.FH("Class " + enclosingClassType.getFullyQualifiedNameString() + " will be moved to the new namespace and all references will be updated.", enclosingClassType.getNamespace().getFullyQualifiedNameString());
                                return;
                            default:
                                this.j6.refactoringCallback.u7("Select a class or namespace identifier in the code to be moved.");
                                return;
                        }
                }
            }
            ClassType classType = (ClassType) syntaxTreeZo.getAttrReferenceEntity(iJO);
            if (!setOfFileEntry.contains(classType.getFile()) || !classType.isToplevel()) {
                this.j6.refactoringCallback.u7("This class is defined outside of the project.");
                return;
            }
            this.j6.refactoringCallback.FH("Class " + classType.getFullyQualifiedNameString() + " will be moved to the new namespace and all references will be updated.", classType.getNamespace().getFullyQualifiedNameString());
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, 4339940653076643581L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 3967722032583344295L)
    public void QX(List<FileEntry> list, FileEntry fileEntry) {
        try {
            if (FH) {
                iy.EQ(-2226191876058677103L, this, list, fileEntry);
            }
            this.j6.refactoringCallback.g3();
            MapOf<ClassType, Namespace> mapOfGn = gn(list, fileEntry);
            if (mapOfGn.Mr() > 0) {
                Ws(mapOfGn);
            }
            Iterator<FileEntry> it = list.iterator();
            while (it.hasNext()) {
                this.j6.refactoringCallback.lg(it.next(), fileEntry);
            }
            this.j6.refactoringCallback.rN();
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -2226191876058677103L, this, list, fileEntry);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0092 A[Catch: e4 -> 0x00bd, all -> 0x00c5, TryCatch #0 {all -> 0x00c5, blocks: (B:2:0x0000, B:4:0x0004, B:5:0x0019, B:6:0x0020, B:8:0x0033, B:10:0x0046, B:11:0x0049, B:16:0x00ae, B:13:0x004d, B:14:0x006e, B:15:0x0092, B:18:0x00b6, B:19:0x00bd), top: B:27:0x0000 }] */
    @abcd.ey(method = -224573054962703936L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j6(com.aide.codemodel.api.FileEntry r10, int r11, int r12, java.lang.String r13) {
        /*
            r9 = this;
            boolean r0 = abcd.m0.FH     // Catch: java.lang.Throwable -> Lc5
            if (r0 == 0) goto L19
            r1 = -7563026407696043620(0x970abb8d8660f19c, double:-1.1175694373969895E-197)
            java.lang.Integer r5 = new java.lang.Integer     // Catch: java.lang.Throwable -> Lc5
            r5.<init>(r11)     // Catch: java.lang.Throwable -> Lc5
            java.lang.Integer r6 = new java.lang.Integer     // Catch: java.lang.Throwable -> Lc5
            r6.<init>(r12)     // Catch: java.lang.Throwable -> Lc5
            r3 = r9
            r4 = r10
            r7 = r13
            abcd.iy.J0(r1, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Lc5
        L19:
            com.aide.codemodel.AIDEModel r0 = r9.j6     // Catch: java.lang.Throwable -> Lc5
            com.aide.codemodel.api.callback.RefactoringCallback r0 = r0.refactoringCallback     // Catch: java.lang.Throwable -> Lc5
            r0.g3()     // Catch: java.lang.Throwable -> Lc5
            com.aide.codemodel.api.Namespace r0 = r9.v5(r13)     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
            com.aide.codemodel.AIDEModel r1 = r9.j6     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
            com.aide.codemodel.api.SyntaxTreeSpace r1 = r1.syntaxTreeSpace     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
            com.aide.codemodel.api.SyntaxTree r1 = r1.Zo(r10, r11, r12)     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
            int r2 = r1.jO(r11, r12)     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
            r3 = -1
            if (r2 == r3) goto Lb6
            com.aide.codemodel.api.abstraction.Language r3 = r1.getLanguage()     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
            com.aide.codemodel.api.abstraction.CodeAnalyzer r3 = r3.getCodeAnalyzer()     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
            r3.VH(r1, r2)     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
            int r3 = r1.sh(r2)     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
            r4 = 17
            if (r3 == r4) goto L92
            switch(r3) {
                case 6: goto L6e;
                case 7: goto L92;
                case 8: goto L92;
                case 9: goto L92;
                case 10: goto L92;
                default: goto L49;
            }     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
        L49:
            switch(r3) {
                case 21: goto L4d;
                case 22: goto L4d;
                case 23: goto L4d;
                case 24: goto L4d;
                case 25: goto L4d;
                default: goto L4c;
            }     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
        L4c:
            goto Lae
        L4d:
            com.aide.codemodel.api.Entity r1 = r1.getAttrReferenceEntity(r2)     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
            com.aide.codemodel.api.Member r1 = (com.aide.codemodel.api.Member) r1     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
            com.aide.codemodel.api.ClassType r1 = r1.getEnclosingClassType()     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
            com.aide.codemodel.api.collections.MapOf r2 = new com.aide.codemodel.api.collections.MapOf     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
            com.aide.codemodel.AIDEModel r3 = r9.j6     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
            com.aide.codemodel.api.EntitySpace r3 = r3.entitySpace     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
            r2.<init>(r3)     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
            r2.QX(r1, r0)     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
            r9.Ws(r2)     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
            java.util.Map r0 = r9.u7(r2)     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
            r9.XL(r0)     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
            goto Lae
        L6e:
            com.aide.codemodel.api.Entity r1 = r1.getAttrReferenceEntity(r2)     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
            com.aide.codemodel.api.Namespace r1 = (com.aide.codemodel.api.Namespace) r1     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
            com.aide.codemodel.api.collections.MapOf r2 = new com.aide.codemodel.api.collections.MapOf     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
            com.aide.codemodel.AIDEModel r3 = r9.j6     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
            com.aide.codemodel.api.EntitySpace r3 = r3.entitySpace     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
            r2.<init>(r3)     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
            r9.DW(r1, r0, r2)     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
            r9.Ws(r2)     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
            java.util.Map r0 = r9.u7(r2)     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
            r9.XL(r0)     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
            java.util.Map r0 = r9.tp(r0)     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
            r9.XL(r0)     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
            goto Lae
        L92:
            com.aide.codemodel.api.Entity r1 = r1.getAttrReferenceEntity(r2)     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
            com.aide.codemodel.api.ClassType r1 = (com.aide.codemodel.api.ClassType) r1     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
            com.aide.codemodel.api.collections.MapOf r2 = new com.aide.codemodel.api.collections.MapOf     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
            com.aide.codemodel.AIDEModel r3 = r9.j6     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
            com.aide.codemodel.api.EntitySpace r3 = r3.entitySpace     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
            r2.<init>(r3)     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
            r2.QX(r1, r0)     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
            r9.Ws(r2)     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
            java.util.Map r0 = r9.u7(r2)     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
            r9.XL(r0)     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
        Lae:
            com.aide.codemodel.AIDEModel r0 = r9.j6     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
            com.aide.codemodel.api.callback.RefactoringCallback r0 = r0.refactoringCallback     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
            r0.rN()     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
            return
        Lb6:
            com.aide.codemodel.AIDEModel r0 = r9.j6     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
            com.aide.codemodel.api.SyntaxTreeSpace r0 = r0.syntaxTreeSpace     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
            r0.releaseSyntaxTree(r1)     // Catch: abcd.e4 -> Lbd java.lang.Throwable -> Lc5
        Lbd:
            com.aide.codemodel.AIDEModel r0 = r9.j6     // Catch: java.lang.Throwable -> Lc5
            com.aide.codemodel.api.callback.RefactoringCallback r0 = r0.refactoringCallback     // Catch: java.lang.Throwable -> Lc5
            r0.rN()     // Catch: java.lang.Throwable -> Lc5
            return
        Lc5:
            r0 = move-exception
            boolean r1 = abcd.m0.Hw
            if (r1 == 0) goto Le0
            r2 = -7563026407696043620(0x970abb8d8660f19c, double:-1.1175694373969895E-197)
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r11)
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r12)
            r1 = r0
            r4 = r9
            r5 = r10
            r8 = r13
            abcd.iy.a8(r1, r2, r4, r5, r6, r7, r8)
        Le0:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.m0.j6(com.aide.codemodel.api.FileEntry, int, int, java.lang.String):void");
    }
}
