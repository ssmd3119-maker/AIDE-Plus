package abcd;

import com.aide.codemodel.AIDEModel;
import com.aide.codemodel.api.ClassType;
import com.aide.codemodel.api.Entity;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.Member;
import com.aide.codemodel.api.Namespace;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.Type;
import com.aide.codemodel.api.collections.ListOfInt;
import com.aide.codemodel.api.collections.MapOf;
import com.aide.codemodel.api.collections.MapOfIntInt;
import com.aide.codemodel.api.collections.SetOf;
import java.util.Hashtable;
import java.util.Iterator;

@cy(clazz = 2953365354535359952L, container = 2953365354535359952L, user = true)
/* loaded from: classes.dex */
public class j0 {

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = 725043148340337125L)
    private f2 DW;

    @dy(field = 19194906755028032L)
    private final AIDEModel j6;

    static {
        iy.Zo(j0.class);
    }

    @ey(method = 116061558850158663L)
    public j0(AIDEModel aIDEModel) {
        try {
            if (FH) {
                iy.tp(-1343217577605610060L, null, aIDEModel);
            }
            this.DW = new f2();
            this.j6 = aIDEModel;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -1343217577605610060L, null, aIDEModel);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    @abcd.ey(method = -760412486258709435L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.aide.codemodel.api.ClassType DW(com.aide.codemodel.api.SyntaxTree r11, int r12, int r13, java.util.Hashtable<java.lang.String, java.lang.String> r14, java.util.Hashtable<java.lang.String, java.lang.String[]> r15) {
        /*
            r10 = this;
            boolean r0 = abcd.j0.FH     // Catch: java.lang.Throwable -> Lca
            if (r0 == 0) goto L1a
            r1 = -2994678078631398200(0xd670c4276a86b4c8, double:-2.4610122970002893E108)
            java.lang.Integer r5 = new java.lang.Integer     // Catch: java.lang.Throwable -> Lca
            r5.<init>(r12)     // Catch: java.lang.Throwable -> Lca
            java.lang.Integer r6 = new java.lang.Integer     // Catch: java.lang.Throwable -> Lca
            r6.<init>(r13)     // Catch: java.lang.Throwable -> Lca
            r3 = r10
            r4 = r11
            r7 = r14
            r8 = r15
            abcd.iy.J8(r1, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lca
        L1a:
            com.aide.codemodel.AIDEModel r0 = r10.j6     // Catch: java.lang.Throwable -> Lca
            com.aide.codemodel.api.EntitySpace r0 = r0.entitySpace     // Catch: java.lang.Throwable -> Lca
            com.aide.codemodel.api.FileEntry r1 = r11.getFile()     // Catch: java.lang.Throwable -> Lca
            com.aide.codemodel.api.abstraction.Language r2 = r11.getLanguage()     // Catch: java.lang.Throwable -> Lca
            com.aide.codemodel.api.collections.MapOf r0 = r0.yO(r12, r13, r1, r2)     // Catch: java.lang.Throwable -> Lca
            int r1 = r0.Mr()     // Catch: java.lang.Throwable -> Lca
            r2 = 1
            r3 = 0
            if (r1 <= r2) goto L9a
            com.aide.codemodel.api.collections.SetOf r1 = new com.aide.codemodel.api.collections.SetOf     // Catch: java.lang.Throwable -> Lca
            com.aide.codemodel.AIDEModel r4 = r10.j6     // Catch: java.lang.Throwable -> Lca
            com.aide.codemodel.api.EntitySpace r4 = r4.entitySpace     // Catch: java.lang.Throwable -> Lca
            r1.<init>(r4)     // Catch: java.lang.Throwable -> Lca
            com.aide.codemodel.api.collections.MapOf<K, V>$b r4 = r0.j6     // Catch: java.lang.Throwable -> Lca
            r4.DW()     // Catch: java.lang.Throwable -> Lca
        L40:
            com.aide.codemodel.api.collections.MapOf<K, V>$b r4 = r0.j6     // Catch: java.lang.Throwable -> Lca
            boolean r4 = r4.j6()     // Catch: java.lang.Throwable -> Lca
            if (r4 == 0) goto L52
            com.aide.codemodel.api.collections.MapOf<K, V>$b r4 = r0.j6     // Catch: java.lang.Throwable -> Lca
            com.aide.codemodel.api.Entity r4 = r4.v5()     // Catch: java.lang.Throwable -> Lca
            r1.put(r4)     // Catch: java.lang.Throwable -> Lca
            goto L40
        L52:
            int r4 = r1.J0()     // Catch: java.lang.Throwable -> Lca
            if (r4 <= r2) goto L9a
            com.aide.codemodel.AIDEModel r2 = r10.j6     // Catch: java.lang.Throwable -> Lca
            com.aide.codemodel.api.IdentifierSpace r2 = r2.identifierSpace     // Catch: java.lang.Throwable -> Lca
            java.lang.String r2 = r2.getString(r12)     // Catch: java.lang.Throwable -> Lca
            boolean r4 = r14.containsKey(r2)     // Catch: java.lang.Throwable -> Lca
            if (r4 == 0) goto L6d
            java.lang.Object r1 = r14.get(r2)     // Catch: java.lang.Throwable -> Lca
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Lca
            goto L9b
        L6d:
            java.util.Vector r0 = new java.util.Vector     // Catch: java.lang.Throwable -> Lca
            r0.<init>()     // Catch: java.lang.Throwable -> Lca
            com.aide.codemodel.api.collections.SetOf$Iterator r4 = r1.DEFAULT_ITERATOR     // Catch: java.lang.Throwable -> Lca
            r4.init()     // Catch: java.lang.Throwable -> Lca
        L77:
            com.aide.codemodel.api.collections.SetOf$Iterator r4 = r1.DEFAULT_ITERATOR     // Catch: java.lang.Throwable -> Lca
            boolean r4 = r4.hasMoreElements()     // Catch: java.lang.Throwable -> Lca
            if (r4 == 0) goto L8d
            com.aide.codemodel.api.collections.SetOf$Iterator r4 = r1.DEFAULT_ITERATOR     // Catch: java.lang.Throwable -> Lca
            com.aide.codemodel.api.Entity r4 = r4.nextKey()     // Catch: java.lang.Throwable -> Lca
            java.lang.String r4 = r4.getFullyQualifiedNameString()     // Catch: java.lang.Throwable -> Lca
            r0.addElement(r4)     // Catch: java.lang.Throwable -> Lca
            goto L77
        L8d:
            int r1 = r0.size()     // Catch: java.lang.Throwable -> Lca
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> Lca
            r0.copyInto(r1)     // Catch: java.lang.Throwable -> Lca
            r15.put(r2, r1)     // Catch: java.lang.Throwable -> Lca
            return r3
        L9a:
            r1 = r3
        L9b:
            int r2 = r0.Mr()     // Catch: java.lang.Throwable -> Lca
            if (r2 <= 0) goto Lc9
            com.aide.codemodel.api.collections.MapOf<K, V>$b r2 = r0.j6     // Catch: java.lang.Throwable -> Lca
            r2.DW()     // Catch: java.lang.Throwable -> Lca
        La6:
            com.aide.codemodel.api.collections.MapOf<K, V>$b r2 = r0.j6     // Catch: java.lang.Throwable -> Lca
            boolean r2 = r2.j6()     // Catch: java.lang.Throwable -> Lca
            if (r2 == 0) goto Lc9
            com.aide.codemodel.api.collections.MapOf<K, V>$b r2 = r0.j6     // Catch: java.lang.Throwable -> Lca
            com.aide.codemodel.api.Entity r2 = r2.Hw()     // Catch: java.lang.Throwable -> Lca
            com.aide.codemodel.api.ClassType r2 = (com.aide.codemodel.api.ClassType) r2     // Catch: java.lang.Throwable -> Lca
            com.aide.codemodel.api.collections.MapOf<K, V>$b r4 = r0.j6     // Catch: java.lang.Throwable -> Lca
            com.aide.codemodel.api.Entity r4 = r4.v5()     // Catch: java.lang.Throwable -> Lca
            if (r1 == 0) goto Lc8
            java.lang.String r4 = r4.getFullyQualifiedNameString()     // Catch: java.lang.Throwable -> Lca
            boolean r4 = r4.equals(r1)     // Catch: java.lang.Throwable -> Lca
            if (r4 == 0) goto La6
        Lc8:
            return r2
        Lc9:
            return r3
        Lca:
            r0 = move-exception
            boolean r1 = abcd.j0.Hw
            if (r1 == 0) goto Le6
            r2 = -2994678078631398200(0xd670c4276a86b4c8, double:-2.4610122970002893E108)
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r12)
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r13)
            r1 = r0
            r4 = r10
            r5 = r11
            r8 = r14
            r9 = r15
            abcd.iy.lg(r1, r2, r4, r5, r6, r7, r8, r9)
        Le6:
            goto Le8
        Le7:
            throw r0
        Le8:
            goto Le7
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.j0.DW(com.aide.codemodel.api.SyntaxTree, int, int, java.util.Hashtable, java.util.Hashtable):com.aide.codemodel.api.ClassType");
    }

    @ey(method = -2250169337535192045L)
    private int FH(String str) {
        try {
            if (FH) {
                iy.tp(-1414554321853225804L, this, str);
            }
            int i = 0;
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (str.charAt(i2) == '\n') {
                    i++;
                }
            }
            return i;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -1414554321853225804L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 5529113220496776540L)
    private void Hw(SyntaxTree syntaxTree, int i, MapOf<ClassType, Entity> mapOf, SetOf<Namespace> setOf, MapOfIntInt mapOfIntInt) {
        try {
            if (FH) {
                iy.J8(-1353732790313587851L, this, syntaxTree, new Integer(i), mapOf, setOf, mapOfIntInt);
            }
            if (syntaxTree.isIdentifierNode(i)) {
                int iSh = syntaxTree.sh(i);
                if (iSh != 0) {
                    if (iSh == 10 || iSh == 17) {
                        ClassType classType = (ClassType) syntaxTree.getAttrReferenceEntity(i);
                        mapOf.QX(classType, classType.getContainer());
                    } else if (iSh == 20) {
                        Member member = (Member) syntaxTree.getAttrReferenceEntity(i);
                        if (member.fN()) {
                            setOf.put(member.getEnclosingClassType().getNamespace());
                        }
                    } else if (iSh == 24 || iSh == 25) {
                        ClassType enclosingClassType = ((Member) syntaxTree.getAttrReferenceEntity(i)).getEnclosingClassType();
                        mapOf.QX(enclosingClassType, enclosingClassType.getContainer());
                    }
                } else if (syntaxTree.Od(i)) {
                    String string = this.j6.identifierSpace.getString(syntaxTree.getIdentifier(i));
                    if (string.length() > 1 || "R".equals(string)) {
                        mapOfIntInt.gn(syntaxTree.getIdentifier(i), syntaxTree.oa(i));
                    }
                }
            }
            int childCount = syntaxTree.getChildCount(i);
            for (int i2 = 0; i2 < childCount; i2++) {
                Hw(syntaxTree, syntaxTree.getChildNode(i, i2), mapOf, setOf, mapOfIntInt);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.lg(th, -1353732790313587851L, this, syntaxTree, new Integer(i), mapOf, setOf, mapOfIntInt);
            }
            throw th;
        }
    }

    @ey(method = -61096913736988445L)
    public void j6(FileEntry fileEntry, Type type) {
        try {
            if (FH) {
                iy.EQ(-2249922553909317064L, this, fileEntry, type);
            }
            this.j6.refactoringCallback.g3();
            Iterator<SyntaxTree> it = this.j6.syntaxTreeSpace.VH(fileEntry).iterator();
            if (it.hasNext()) {
                SyntaxTree next = it.next();
                next.getLanguage().getCodeAnalyzer().Zo(next);
                SetOf<? extends Type> setOf = new SetOf<>(this.j6.entitySpace);
                setOf.put(type);
                String strVJ = next.getLanguage().getTools().vJ(next, 1, 1, setOf);
                if (strVJ.length() > 0) {
                    int importEndLine = next.getImportEndLine();
                    int iWB = next.WB();
                    this.j6.refactoringCallback.nw(fileEntry, importEndLine, iWB, importEndLine, iWB, strVJ);
                    int i = importEndLine + 1;
                    this.j6.refactoringCallback.Sf(fileEntry, i, i);
                }
                this.j6.refactoringCallback.Mr();
                this.j6.syntaxTreeSpace.releaseSyntaxTree(next);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -2249922553909317064L, this, fileEntry, type);
            }
            throw th;
        }
    }

    @ey(method = 507670685774406171L)
    public void v5(FileEntry fileEntry, Hashtable<String, String> hashtable) {
        try {
            if (FH) {
                iy.EQ(-6707376443911558800L, this, fileEntry, hashtable);
            }
            this.j6.refactoringCallback.g3();
            Iterator<SyntaxTree> it = this.j6.syntaxTreeSpace.VH(fileEntry).iterator();
            if (it.hasNext()) {
                SyntaxTree next = it.next();
                next.getLanguage().getCodeAnalyzer().FH(next);
                this.DW.Zo();
                MapOf<ClassType, Entity> mapOf = new MapOf<>(this.j6.entitySpace);
                SetOf<Namespace> setOf = new SetOf<>(this.j6.entitySpace);
                MapOfIntInt mapOfIntInt = new MapOfIntInt();
                Hw(next, next.getRootNode(), mapOf, setOf, mapOfIntInt);
                Hashtable<String, String[]> hashtable2 = new Hashtable<>();
                mapOfIntInt.j6.DW();
                while (mapOfIntInt.j6.j6()) {
                    ClassType classTypeDW = DW(next, mapOfIntInt.j6.Hw(), mapOfIntInt.j6.v5(), hashtable, hashtable2);
                    if (classTypeDW != null) {
                        mapOf.QX(classTypeDW, classTypeDW.getContainer());
                    }
                }
                if (!hashtable2.isEmpty()) {
                    this.j6.syntaxTreeSpace.releaseSyntaxTree(next);
                    this.j6.refactoringCallback.v5(fileEntry.getPathString(), hashtable2);
                    return;
                }
                ListOfInt importNodePairs = next.getImportNodePairs();
                for (int i = 0; i < importNodePairs.size(); i++) {
                    this.DW.DW(next, importNodePairs.get(i));
                }
                int iQp = next.qp();
                int iFY = next.fY();
                String strMz = next.getLanguage().getTools().Mz(next, mapOf, setOf);
                String strEf = next.getLanguage().getTools().ef(next, mapOf);
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
                    this.DW.aM(iQp, iFY, iQp, iFY, strMz);
                    this.j6.refactoringCallback.nw(fileEntry, iQp, iFY, iQp, iFY, strMz);
                }
                for (int size = importNodePairs.size() - 1; size >= 0; size -= 2) {
                    int i2 = importNodePairs.get(size - 1);
                    int i3 = importNodePairs.get(size);
                    this.j6.refactoringCallback.nw(fileEntry, this.DW.EQ(next, i2), this.DW.tp(next, i2), this.DW.u7(next, i3), this.DW.VH(next, i3), "");
                }
                if (strMz.length() > 0) {
                    this.j6.refactoringCallback.Sf(fileEntry, iQp, FH(strMz) + iQp);
                }
                this.j6.refactoringCallback.Mr();
                this.j6.syntaxTreeSpace.releaseSyntaxTree(next);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -6707376443911558800L, this, fileEntry, hashtable);
            }
            throw th;
        }
    }
}
