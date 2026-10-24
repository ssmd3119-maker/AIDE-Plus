package com.aide.codemodel.api;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.hy;
import abcd.iy;
import abcd.r4;
import com.aide.codemodel.api.abstraction.Language;
import com.aide.codemodel.api.collections.FunctionOfIntInt;
import com.aide.codemodel.api.collections.FunctionOfIntLong;
import com.aide.codemodel.api.collections.HashtableOfInt;
import com.aide.codemodel.api.collections.SetOfFileEntry;
import java.io.CharArrayReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

@cy(clazz = 450430077345822769L, container = 450430077345822769L, user = true)
/* loaded from: classes.dex */
public class SyntaxTreeSpace {

    @dy(field = -1479422210141661975L)
    private static final long EQ;

    @dy(field = -999463908036078407L)
    private static final long J0;

    @fy
    private static /* synthetic */ boolean J8;

    @gy
    private static /* synthetic */ boolean Ws;

    @dy(field = 5473399558579151872L)
    private static final long we;

    @dy(field = -426998729504805980L)
    private final c DW;

    @dy(field = 3968882835573297873L)
    private final b FH;

    @dy(field = -3344239755380668177L)
    private HashtableOfInt<SyntaxTree> Zo;

    @dy(field = -3063086045844236568L)
    private FunctionOfIntInt astlocks;

    @dy(field = -4250899508357292421L)
    private FunctionOfIntLong gn;

    @dy(field = -1016264873513926128L)
    private final SyntaxTree j6;

    @dy(field = 2092906347928244089L)
    private final Model model;

    @dy(field = -4662762260654689201L)
    private long[] tp;

    @dy(field = -3079894790672607709L)
    private int[] u7;

    @dy(field = 2216438127540497049L)
    private HashtableOfInt<SyntaxTree> v5;

    static {
        try {
            iy.Zo(SyntaxTreeSpace.class);
            if (J8) {
                iy.gn(2744737602280452312L, null);
            }
            EQ = 10000000L;
            we = 5000000L;
            J0 = 5000000L;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, 2744737602280452312L, null);
            }
            throw th;
        }
    }

    @ey(method = 89231105145304364L)
    public SyntaxTreeSpace(Model model) {
        a aVar = null;
        try {
            if (J8) {
                iy.tp(-892647963127541440L, null, model);
            }
            this.DW = new c(this, aVar);
            this.FH = new b(aVar);
            this.model = model;
            this.v5 = new HashtableOfInt<>();
            this.Zo = new HashtableOfInt<>();
            this.astlocks = new FunctionOfIntInt();
            this.gn = new FunctionOfIntLong();
            this.j6 = new SyntaxTree(model);
        } catch (Throwable th) {
            if (Ws) {
                iy.j3(th, -892647963127541440L, null, model);
            }
            throw th;
        }
    }

    @ey(method = -782775174741206955L)
    private void DW(long j) {
        try {
            if (J8) {
                iy.tp(166709039791034848L, this, new Long(j));
            }
            if (j == 0) {
                this.Zo = new HashtableOfInt<>();
                return;
            }
            if (this.u7 == null || this.u7.length < this.Zo.EQ()) {
                this.u7 = new int[this.Zo.EQ()];
                this.tp = new long[this.Zo.EQ()];
            }
            this.Zo.j6.DW();
            int i = 0;
            while (this.Zo.j6.j6()) {
                int iFH = this.Zo.j6.FH();
                long jMemSize = this.Zo.j6.Hw().memSize();
                long jV5 = this.gn.v5(iFH);
                if (jMemSize > 0 && jV5 > 0) {
                    this.u7[i] = iFH;
                    if (this.model.fileSpace.SI(iFH).getCodeAnalyzer() == null) {
                        jV5 += 1000;
                    }
                    this.tp[i] = jV5;
                    i++;
                }
            }
            lg(0, i - 1);
            long jAM = aM();
            for (int i2 = 0; i2 < i && jAM > j; i2++) {
                SyntaxTree syntaxTreeV5 = this.Zo.v5(this.u7[i2]);
                this.Zo.tp(this.u7[i2]);
                jAM -= syntaxTreeV5.memSize();
            }
        } catch (Throwable th) {
            if (Ws) {
                iy.j3(th, 166709039791034848L, this, new Long(j));
            }
            throw th;
        }
    }

    @ey(method = 66683445858783360L)
    private void Hw(FileEntry fileEntry, Map<Language, SyntaxTree> map, boolean z, String str, int i, int i2) {
        try {
            if (J8) {
                iy.QX(7080487249887259233L, this, new Object[]{fileEntry, map, new Boolean(z), str, new Integer(i), new Integer(i2)});
            }
            try {
                if (fileEntry.getCodeModel() != null) {
                    for (Map.Entry<Language, SyntaxTree> entry : map.entrySet()) {
                        SyntaxTree value = entry.getValue();
                        Language key = entry.getKey();
                        value.clear();
                        value.lg(fileEntry, key);
                        value.declareVersion(fileEntry.getSyntaxVersion());
                        if (z) {
                            this.model.errorTable.gW(fileEntry, key);
                        }
                    }
                    Reader reader = fileEntry.getReader();
                    if (str != null) {
                        try {
                            reader = this.FH.DW(reader, str, i, i2);
                        } catch (Throwable th) {
                            reader.close();
                            throw th;
                        }
                    }
                    fileEntry.getCodeModel().fillSyntaxTree(fileEntry, reader, map, z);
                    reader.close();
                }
            } catch (IOException unused) {
            }
        } catch (Throwable th2) {
            if (Ws) {
                iy.rN(th2, 7080487249887259233L, this, new Object[]{fileEntry, map, new Boolean(z), str, new Integer(i), new Integer(i2)});
            }
            throw th2;
        }
    }

    @ey(method = -4802978653882633917L)
    private List<SyntaxTree> XL(FileEntry fileEntry, boolean z) {
        SyntaxTree syntaxTreeJ3;
        try {
            if (J8) {
                iy.EQ(4666236014759250204L, this, fileEntry, new Boolean(z));
            }
            ArrayList arrayList = new ArrayList();
            if (fileEntry.getCodeModel() != null) {
                List<Language> languages = fileEntry.getCodeModel().getLanguages();
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                for (Language language : languages) {
                    if (!z || language.getCodeAnalyzer() != null) {
                        int fileEntryLanguageId = this.model.fileSpace.getFileEntryLanguageId(fileEntry, language);
                        this.gn.put(fileEntryLanguageId, r4.FH());
                        if (this.v5.Hw(fileEntryLanguageId)) {
                            this.astlocks.Zo(fileEntryLanguageId, this.astlocks.get(fileEntryLanguageId) + 1);
                            SyntaxTree syntaxTreeV5 = this.v5.v5(fileEntryLanguageId);
                            if (syntaxTreeV5.isEmpty()) {
                                map.put(language, syntaxTreeV5);
                            } else {
                                map2.put(language, syntaxTreeV5);
                            }
                        } else if (this.Zo.Hw(fileEntryLanguageId)) {
                            SyntaxTree syntaxTreeV52 = this.Zo.v5(fileEntryLanguageId);
                            this.v5.VH(fileEntryLanguageId, syntaxTreeV52);
                            this.astlocks.Zo(fileEntryLanguageId, 1);
                            this.Zo.tp(fileEntryLanguageId);
                            if (syntaxTreeV52.isEmpty()) {
                                map.put(language, syntaxTreeV52);
                            } else {
                                map2.put(language, syntaxTreeV52);
                            }
                        } else {
                            map.put(language, this.DW.j6());
                        }
                    }
                }
                if (!map.isEmpty()) {
                    Hw(fileEntry, map, true, null, 0, 0);
                }
                for (Map.Entry<Language, SyntaxTree> entry : map.entrySet()) {
                    SyntaxTree value = entry.getValue();
                    Language key = entry.getKey();
                    int fileEntryLanguageId2 = this.model.fileSpace.getFileEntryLanguageId(fileEntry, key);
                    if (aM() < we || (syntaxTreeJ3 = j3(value.memSize())) == null) {
                        SyntaxTree syntaxTree = new SyntaxTree(this.model);
                        this.v5.VH(fileEntryLanguageId2, syntaxTree);
                        this.astlocks.Zo(fileEntryLanguageId2, 1);
                        value.u7(syntaxTree);
                        this.DW.DW(value);
                        map2.put(key, syntaxTree);
                    } else {
                        this.Zo.tp(this.model.fileSpace.getFileEntryLanguageId(syntaxTreeJ3.getFile(), syntaxTreeJ3.getLanguage()));
                        this.astlocks.Zo(fileEntryLanguageId2, 1);
                        this.v5.VH(fileEntryLanguageId2, syntaxTreeJ3);
                        value.u7(syntaxTreeJ3);
                        this.DW.DW(value);
                        map2.put(key, syntaxTreeJ3);
                    }
                }
                for (Language language2 : languages) {
                    if (map2.containsKey(language2)) {
                        arrayList.add(map2.get(language2));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            if (Ws) {
                iy.Mr(th, 4666236014759250204L, this, fileEntry, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 1549427916168567420L)
    private SyntaxTree j3(long j) {
        try {
            if (J8) {
                iy.tp(6160443694002442139L, this, new Long(j));
            }
            this.Zo.j6.DW();
            SyntaxTree syntaxTree = null;
            SyntaxTree syntaxTree2 = null;
            while (this.Zo.j6.j6()) {
                SyntaxTree syntaxTreeHw = this.Zo.j6.Hw();
                if (syntaxTreeHw.getLanguage().getSignatureAnalyzer() == null && j < syntaxTreeHw.u9() && (syntaxTree2 == null || syntaxTree2.u9() > syntaxTreeHw.u9())) {
                    syntaxTree2 = syntaxTreeHw;
                }
            }
            if (syntaxTree2 == null) {
                this.Zo.j6.DW();
                while (this.Zo.j6.j6()) {
                    SyntaxTree syntaxTreeHw2 = this.Zo.j6.Hw();
                    if (j < syntaxTreeHw2.u9() && (syntaxTree2 == null || syntaxTree2.u9() > syntaxTreeHw2.u9())) {
                        syntaxTree2 = syntaxTreeHw2;
                    }
                }
            }
            if (syntaxTree2 != null) {
                return syntaxTree2;
            }
            long jU9 = 0;
            this.Zo.j6.DW();
            while (this.Zo.j6.j6()) {
                SyntaxTree syntaxTreeHw3 = this.Zo.j6.Hw();
                if (jU9 < syntaxTreeHw3.u9()) {
                    jU9 = syntaxTreeHw3.u9();
                    syntaxTree = syntaxTreeHw3;
                }
            }
            return syntaxTree;
        } catch (Throwable th) {
            if (Ws) {
                iy.j3(th, 6160443694002442139L, this, new Long(j));
            }
            throw th;
        }
    }

    @ey(method = 1358448934674922620L)
    private void lg(int i, int i2) throws Throwable {
        Throwable th;
        try {
            if (J8) {
                iy.EQ(293617338252483867L, this, new Integer(i), new Integer(i2));
            }
            if (i < i2) {
                long j = this.tp[((i2 - i) / 2) + i];
                int i3 = i;
                int i4 = i2;
                while (i3 <= i4) {
                    while (this.tp[i3] < j) {
                        try {
                            i3++;
                        } catch (Throwable th2) {
                            th = th2;
                            i = i3;
                            i2 = i4;
                            if (!Ws) {
                                throw th;
                            }
                            iy.Mr(th, 293617338252483867L, this, new Integer(i), new Integer(i2));
                            throw th;
                        }
                    }
                    while (j < this.tp[i4]) {
                        i4--;
                    }
                    if (i3 <= i4) {
                        int i5 = this.u7[i4];
                        this.u7[i4] = this.u7[i3];
                        this.u7[i3] = i5;
                        long j2 = this.tp[i4];
                        this.tp[i4] = this.tp[i3];
                        this.tp[i3] = j2;
                        i3++;
                        i4--;
                    }
                }
                lg(i, i4);
                lg(i3, i2);
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @ey(method = 2363945168166319619L)
    public SyntaxTree EQ(FileEntry fileEntry, Language language, int i, int i2, String str, int i3) throws Throwable {
        int i4;
        char c2;
        try {
            if (J8) {
                iy.QX(-682322888970526608L, this, new Object[]{fileEntry, language, new Integer(i), new Integer(i2), str, new Integer(i3)});
            }
            SyntaxTree syntaxTree = getSyntaxTree(fileEntry, language);
            c2 = 0;
            i4 = 6;
            try {
                FH(fileEntry, language, this.j6, false, ";" + str.substring(0, i3 - 1) + "i;", i, i2);
                return syntaxTree.getDeclarationDigest() == this.j6.getDeclarationDigest() ? this.j6 : syntaxTree;
            } catch (Throwable th) {
                th = th;
                if (Ws) {
                    Object[] objArr = new Object[i4];
                    objArr[c2] = fileEntry;
                    objArr[1] = language;
                    objArr[2] = new Integer(i);
                    objArr[3] = new Integer(i2);
                    objArr[4] = str;
                    objArr[5] = new Integer(i3);
                    iy.rN(th, -682322888970526608L, this, objArr);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i4 = 6;
            c2 = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f7  */
    @abcd.ey(method = 7439565105375765072L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void FH(com.aide.codemodel.api.FileEntry r27, com.aide.codemodel.api.abstraction.Language r28, com.aide.codemodel.api.SyntaxTree r29, boolean r30, java.lang.String r31, int r32, int r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.api.SyntaxTreeSpace.FH(com.aide.codemodel.api.FileEntry, com.aide.codemodel.api.abstraction.Language, com.aide.codemodel.api.SyntaxTree, boolean, java.lang.String, int, int):void");
    }

    @ey(method = 8537733845709146100L)
    public List<SyntaxTree> J0(FileEntry fileEntry, int i, int i2, String str) {
        try {
            if (J8) {
                iy.J0(-5247011263008066363L, this, fileEntry, new Integer(i), new Integer(i2), str);
            }
            HashMap map = new HashMap();
            Iterator<Language> it = fileEntry.getCodeModel().getLanguages().iterator();
            while (it.hasNext()) {
                map.put(it.next(), this.DW.j6());
            }
            Hw(fileEntry, map, false, str, i, i2);
            ArrayList arrayList = new ArrayList();
            Iterator<SyntaxTree> it2 = map.values().iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
            return arrayList;
        } catch (Throwable th) {
            if (Ws) {
                iy.a8(th, -5247011263008066363L, this, fileEntry, new Integer(i), new Integer(i2), str);
            }
            throw th;
        }
    }

    @ey(method = -4995241951171505097L)
    public void Mr() {
        try {
            if (J8) {
                iy.gn(-4365457247300835900L, this);
            }
            this.v5.j6.DW();
            while (this.v5.j6.j6()) {
                this.Zo.VH(this.v5.j6.FH(), this.v5.j6.Hw());
            }
            this.astlocks.clear();
            this.v5.FH();
            this.DW.FH();
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -4365457247300835900L, this);
            }
            throw th;
        }
    }

    @ey(method = -1201250392424761052L)
    public List<SyntaxTree> QX(FileEntry fileEntry) {
        try {
            if (J8) {
                iy.tp(1591376884869909693L, this, fileEntry);
            }
            return XL(fileEntry, false);
        } catch (Throwable th) {
            if (Ws) {
                iy.j3(th, 1591376884869909693L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = -527728775130916191L)
    public List<SyntaxTree> VH(FileEntry fileEntry) {
        try {
            if (J8) {
                iy.tp(237851789914145484L, this, fileEntry);
            }
            return XL(fileEntry, true);
        } catch (Throwable th) {
            if (Ws) {
                iy.j3(th, 237851789914145484L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = -3219568759103248424L)
    public SyntaxTree Ws(FileEntry fileEntry, int i, int i2) {
        try {
            if (J8) {
                iy.we(862241605870507965L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            SyntaxTree syntaxTree = null;
            if (fileEntry.getCodeModel() != null) {
                int i3 = Integer.MAX_VALUE;
                List<SyntaxTree> listQX = QX(fileEntry);
                Iterator<SyntaxTree> it = listQX.iterator();
                SyntaxTree syntaxTree2 = null;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    SyntaxTree next = it.next();
                    if (syntaxTree == null) {
                        syntaxTree = next;
                    }
                    int iZa = next.Za(i, i2);
                    if (iZa == 0) {
                        syntaxTree2 = next;
                        break;
                    }
                    if (iZa < i3) {
                        syntaxTree2 = next;
                        i3 = iZa;
                    }
                }
                if (syntaxTree2 != null) {
                    syntaxTree = syntaxTree2;
                }
                for (SyntaxTree syntaxTree3 : listQX) {
                    if (syntaxTree3 != syntaxTree) {
                        releaseSyntaxTree(syntaxTree3);
                    }
                }
            }
            return syntaxTree;
        } catch (Throwable th) {
            if (Ws) {
                iy.U2(th, 862241605870507965L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -1645091470515702643L)
    public SyntaxTree Zo(FileEntry fileEntry, int i, int i2) {
        try {
            if (J8) {
                iy.we(-2574463187719072608L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            SyntaxTree syntaxTree = null;
            if (fileEntry.getCodeModel() != null) {
                int i3 = Integer.MAX_VALUE;
                List<SyntaxTree> listVH = VH(fileEntry);
                Iterator<SyntaxTree> it = listVH.iterator();
                SyntaxTree syntaxTree2 = null;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    SyntaxTree next = it.next();
                    if (syntaxTree == null) {
                        syntaxTree = next;
                    }
                    int iZa = next.Za(i, i2);
                    if (iZa == 0) {
                        syntaxTree2 = next;
                        break;
                    }
                    if (iZa < i3) {
                        syntaxTree2 = next;
                        i3 = iZa;
                    }
                }
                if (syntaxTree2 != null) {
                    syntaxTree = syntaxTree2;
                }
                for (SyntaxTree syntaxTree3 : listVH) {
                    if (syntaxTree3 != syntaxTree) {
                        releaseSyntaxTree(syntaxTree3);
                    }
                }
            }
            return syntaxTree;
        } catch (Throwable th) {
            if (Ws) {
                iy.U2(th, -2574463187719072608L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -1446655490296924904L)
    public void a8() {
        try {
            if (J8) {
                iy.gn(1051616740246523451L, this);
            }
            DW(0L);
            this.DW.Hw();
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, 1051616740246523451L, this);
            }
            throw th;
        }
    }

    @ey(method = -2196174726531326433L)
    public long aM() {
        try {
            if (J8) {
                iy.gn(-938285425419885056L, this);
            }
            long jMemSize = 0;
            this.v5.j6.DW();
            while (this.v5.j6.j6()) {
                jMemSize += this.v5.j6.Hw().memSize();
            }
            this.Zo.j6.DW();
            while (this.Zo.j6.j6()) {
                jMemSize += this.Zo.j6.Hw().memSize();
            }
            return jMemSize;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -938285425419885056L, this);
            }
            throw th;
        }
    }

    @ey(method = -3428741269461537380L)
    public SyntaxTree getSyntaxTree(FileEntry fileEntry, Language language) {
        try {
            if (J8) {
                iy.EQ(-4793985828278224231L, this, fileEntry, language);
            }
            int fileEntryLanguageId = this.model.fileSpace.getFileEntryLanguageId(fileEntry, language);
            this.gn.put(fileEntryLanguageId, r4.FH());
            if (this.v5.Hw(fileEntryLanguageId)) {
                this.astlocks.Zo(fileEntryLanguageId, this.astlocks.get(fileEntryLanguageId) + 1);
                SyntaxTree syntaxTreeV5 = this.v5.v5(fileEntryLanguageId);
                if (syntaxTreeV5.isEmpty()) {
                    FH(fileEntry, language, syntaxTreeV5, true, null, 0, 0);
                }
                return syntaxTreeV5;
            }
            if (this.Zo.Hw(fileEntryLanguageId)) {
                SyntaxTree syntaxTreeV52 = this.Zo.v5(fileEntryLanguageId);
                this.v5.VH(fileEntryLanguageId, syntaxTreeV52);
                this.astlocks.Zo(fileEntryLanguageId, 1);
                this.Zo.tp(fileEntryLanguageId);
                if (syntaxTreeV52.isEmpty()) {
                    FH(fileEntry, language, syntaxTreeV52, true, null, 0, 0);
                }
                return syntaxTreeV52;
            }
            if (aM() >= we) {
                SyntaxTree syntaxTreeJ6 = this.DW.j6();
                FH(fileEntry, language, syntaxTreeJ6, true, null, 0, 0);
                SyntaxTree syntaxTreeJ3 = j3(syntaxTreeJ6.memSize());
                if (syntaxTreeJ3 != null) {
                    int fileEntryLanguageId2 = this.model.fileSpace.getFileEntryLanguageId(syntaxTreeJ3.getFile(), syntaxTreeJ3.getLanguage());
                    syntaxTreeJ6.u7(syntaxTreeJ3);
                    this.DW.DW(syntaxTreeJ6);
                    this.Zo.tp(fileEntryLanguageId2);
                    this.astlocks.Zo(fileEntryLanguageId, 1);
                    this.v5.VH(fileEntryLanguageId, syntaxTreeJ3);
                    return syntaxTreeJ3;
                }
                this.DW.DW(syntaxTreeJ6);
            }
            SyntaxTree syntaxTree = new SyntaxTree(this.model);
            this.v5.VH(fileEntryLanguageId, syntaxTree);
            this.astlocks.Zo(fileEntryLanguageId, 1);
            FH(fileEntry, language, syntaxTree, true, null, 0, 0);
            return syntaxTree;
        } catch (Throwable th) {
            if (Ws) {
                iy.Mr(th, -4793985828278224231L, this, fileEntry, language);
            }
            throw th;
        }
    }

    @ey(method = 2919656986817087616L)
    public SetOfFileEntry gn() {
        try {
            if (J8) {
                iy.gn(-2503622978258649035L, this);
            }
            SetOfFileEntry setOfFileEntry = new SetOfFileEntry(this.model.fileSpace);
            this.Zo.j6.DW();
            while (this.Zo.j6.j6()) {
                setOfFileEntry.gn(this.model.fileSpace.vy(this.Zo.j6.FH()));
            }
            return setOfFileEntry;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -2503622978258649035L, this);
            }
            throw th;
        }
    }

    @ey(method = 1424834774923116128L)
    public void rN() {
        try {
            if (J8) {
                iy.gn(-1892879600221592745L, this);
            }
            this.v5.j6.DW();
            while (this.v5.j6.j6()) {
                int iFH = this.v5.j6.FH();
                SyntaxTree syntaxTreeHw = this.v5.j6.Hw();
                if (this.model.fileSpace.vy(iFH).getSyntaxVersion() != syntaxTreeHw.getVersion()) {
                    syntaxTreeHw.clear();
                } else {
                    syntaxTreeHw.clearAttributes();
                }
            }
            this.Zo.j6.DW();
            while (this.Zo.j6.j6()) {
                int iFH2 = this.Zo.j6.FH();
                SyntaxTree syntaxTreeHw2 = this.Zo.j6.Hw();
                if (this.model.fileSpace.vy(iFH2).getSyntaxVersion() != syntaxTreeHw2.getVersion()) {
                    syntaxTreeHw2.clear();
                } else {
                    syntaxTreeHw2.clearAttributes();
                }
            }
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -1892879600221592745L, this);
            }
            throw th;
        }
    }

    @ey(method = 279621935048339800L)
    public void releaseSyntaxTree(SyntaxTree syntaxTree) {
        try {
            if (J8) {
                iy.tp(-5873985065518278597L, this, syntaxTree);
            }
            int fileEntryLanguageId = this.model.fileSpace.getFileEntryLanguageId(syntaxTree.getFile(), syntaxTree.getLanguage());
            int i = this.astlocks.get(fileEntryLanguageId) - 1;
            if (i > 0) {
                this.astlocks.Zo(fileEntryLanguageId, i);
                return;
            }
            this.astlocks.remove(fileEntryLanguageId);
            this.v5.tp(fileEntryLanguageId);
            if (syntaxTree.memSize() < J0) {
                this.Zo.VH(fileEntryLanguageId, syntaxTree);
            }
            if (aM() > EQ) {
                DW(we);
            }
        } catch (Throwable th) {
            if (Ws) {
                iy.j3(th, -5873985065518278597L, this, syntaxTree);
            }
            throw th;
        }
    }

    @ey(method = 3743280871611514304L)
    public SyntaxTree tp(FileEntry fileEntry, int i, int i2) throws Throwable {
        try {
            if (J8) {
                iy.we(1874755268884868335L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            if (fileEntry.getCodeModel() != null) {
                HashSet hashSet = new HashSet();
                List<Language> languages = fileEntry.getCodeModel().getLanguages();
                for (Language language : languages) {
                    if (language.getTools() != null && language.getTools().Ws() != null) {
                        hashSet.add(language.getTools().Ws());
                    }
                }
                Iterator it = hashSet.iterator();
                SyntaxTree syntaxTree = null;
                int i3 = Integer.MAX_VALUE;
                loop1: while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String str = (String) it.next();
                    HashMap map = new HashMap();
                    for (Language language2 : languages) {
                        if (language2.getTools() != null && str.equals(language2.getTools().Ws())) {
                            map.put(language2, this.DW.j6());
                        }
                    }
                    Hw(fileEntry, map, false, str, i, i2);
                    Iterator<Map.Entry<Language, SyntaxTree>> it2 = map.entrySet().iterator();
                    while (it2.hasNext()) {
                        SyntaxTree value = it2.next().getValue();
                        int iZa = value.Za(i, i2);
                        if (iZa == 0) {
                            syntaxTree = value;
                            break loop1;
                        }
                        if (iZa <= i3 || value.getLanguage().getCodeAnalyzer() != null) {
                            syntaxTree = value;
                            i3 = iZa;
                        }
                    }
                }
                if (syntaxTree != null) {
                    try {
                        SyntaxTree syntaxTree2 = getSyntaxTree(fileEntry, syntaxTree.getLanguage());
                        return syntaxTree2.getDeclarationDigest() == syntaxTree.getDeclarationDigest() ? syntaxTree : syntaxTree2;
                    } catch (Throwable th) {
                        th = th;
                        if (Ws) {
                            iy.U2(th, 1874755268884868335L, this, fileEntry, new Integer(i), new Integer(i2));
                        }
                        throw th;
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @ey(method = -47373481198074488L)
    public SyntaxTree u7(FileEntry fileEntry, Language language, int i, int i2, String str) {
        try {
            if (J8) {
                iy.J8(7030464881230371007L, this, fileEntry, language, new Integer(i), new Integer(i2), str);
            }
            SyntaxTree syntaxTree = getSyntaxTree(fileEntry, language);
            FH(fileEntry, language, this.j6, false, str, i, i2);
            return syntaxTree.getDeclarationDigest() == this.j6.getDeclarationDigest() ? this.j6 : syntaxTree;
        } catch (Throwable th) {
            if (Ws) {
                iy.lg(th, 7030464881230371007L, this, fileEntry, language, new Integer(i), new Integer(i2), str);
            }
            throw th;
        }
    }

    @ey(method = -5647036310207354736L)
    public SyntaxTree v5(FileEntry fileEntry, Language language) {
        try {
            if (J8) {
                iy.EQ(4121405990744990253L, this, fileEntry, language);
            }
            SyntaxTree syntaxTree = null;
            for (SyntaxTree syntaxTree2 : VH(fileEntry)) {
                if (syntaxTree2.getLanguage() != language) {
                    releaseSyntaxTree(syntaxTree2);
                } else {
                    syntaxTree = syntaxTree2;
                }
            }
            return syntaxTree == null ? getSyntaxTree(fileEntry, language) : syntaxTree;
        } catch (Throwable th) {
            if (Ws) {
                iy.Mr(th, 4121405990744990253L, this, fileEntry, language);
            }
            throw th;
        }
    }

    @ey(method = -7430257825263505200L)
    public SyntaxTree we(FileEntry fileEntry, Language language, int i, int i2, String str) {
        try {
            if (J8) {
                iy.J8(2574843130187700141L, this, fileEntry, language, new Integer(i), new Integer(i2), str);
            }
            SyntaxTree syntaxTree = getSyntaxTree(fileEntry, language);
            FH(fileEntry, language, this.j6, false, ";" + str + ";", i, i2);
            return syntaxTree.getDeclarationDigest() == this.j6.getDeclarationDigest() ? this.j6 : syntaxTree;
        } catch (Throwable th) {
            if (Ws) {
                iy.lg(th, 2574843130187700141L, this, fileEntry, language, new Integer(i), new Integer(i2), str);
            }
            throw th;
        }
    }

    @cy(clazz = 1599099166213568064L, container = 1599099166213568064L, user = true)
    private static class b {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = 2352999459637919673L)
        private char[] DW;

        @dy(field = -540691856859650120L)
        private char[] j6;

        static {
            iy.Zo(b.class);
        }

        @ey(method = -1212088455422099563L)
        private b() {
            try {
                if (FH) {
                    iy.gn(-4275006996486662163L, null);
                }
                this.j6 = new char[10000];
                this.DW = new char[10000];
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -4275006996486662163L, null);
                }
                throw th;
            }
        }

        @ey(method = -132559912606894659L)
        private void j6(int i) {
            try {
                if (FH) {
                    iy.u7(1732979179795438008L, this, i);
                }
                if (this.DW.length <= i) {
                    char[] cArr = new char[Math.max(i, (this.DW.length * 2) + 1)];
                    System.arraycopy(this.DW, 0, cArr, 0, this.DW.length);
                    this.DW = cArr;
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, 1732979179795438008L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 8455476845852487808L)
        public Reader DW(Reader reader, String str, int i, int i2) throws Throwable {
            try {
                if (FH) {
                    iy.J0(-2311486427197490625L, this, reader, str, new Integer(i), new Integer(i2));
                }
                int i3 = 0;
                int i4 = 1;
                int i5 = 1;
                while (true) {
                    try {
                        int i6 = reader.read(this.j6);
                        if (i6 == -1) {
                            reader.close();
                            return new CharArrayReader(this.DW, 0, i3);
                        }
                        int i7 = 0;
                        while (i7 < i6) {
                            if (i4 == i && i5 == i2) {
                                j6(str.length() + i3);
                                int i8 = 0;
                                while (i8 < str.length()) {
                                    this.DW[i3] = str.charAt(i8);
                                    i8++;
                                    i3++;
                                }
                            }
                            char c = this.j6[i7];
                            if (c == '\n') {
                                if (i4 == i && i5 < i2) {
                                    int i9 = i2 - i5;
                                    j6(str.length() + i3 + i9);
                                    int i10 = 0;
                                    while (i10 < i9) {
                                        this.DW[i3] = ' ';
                                        i10++;
                                        i3++;
                                    }
                                    int i11 = 0;
                                    while (i11 < str.length()) {
                                        this.DW[i3] = str.charAt(i11);
                                        i11++;
                                        i3++;
                                    }
                                }
                                int i12 = i3 + 1;
                                j6(i12);
                                this.DW[i3] = c;
                                i4++;
                                i3 = i12;
                                i5 = 1;
                            } else if (c != 65534) {
                                int i13 = i3 + 1;
                                j6(i13);
                                this.DW[i3] = c;
                                i5++;
                                i3 = i13;
                            } else {
                                j6(i3 + 10);
                                int i14 = i3 + 1;
                                this.DW[i3] = c;
                                char[] cArr = this.DW;
                                int i15 = i14 + 1;
                                int i16 = i7 + 1;
                                char c2 = this.j6[i7];
                                cArr[i14] = c2;
                                int i17 = (c2 << 24) | 0;
                                char[] cArr2 = this.DW;
                                int i18 = i15 + 1;
                                int i19 = i16 + 1;
                                char c3 = this.j6[i16];
                                cArr2[i15] = c3;
                                int i20 = i17 | (c3 << 16);
                                char[] cArr3 = this.DW;
                                int i21 = i18 + 1;
                                int i22 = i19 + 1;
                                char c4 = this.j6[i19];
                                cArr3[i18] = c4;
                                int i23 = i20 | (c4 << '\b');
                                char[] cArr4 = this.DW;
                                int i24 = i21 + 1;
                                int i25 = i22 + 1;
                                char c5 = this.j6[i22];
                                cArr4[i21] = c5;
                                int i26 = i23 | (c5 << 0);
                                char[] cArr5 = this.DW;
                                int i27 = i24 + 1;
                                int i28 = i25 + 1;
                                char c6 = this.j6[i25];
                                cArr5[i24] = c6;
                                int i29 = (c6 << 24) | 0;
                                char[] cArr6 = this.DW;
                                int i30 = i27 + 1;
                                int i31 = i28 + 1;
                                char c7 = this.j6[i28];
                                cArr6[i27] = c7;
                                int i32 = i29 | (c7 << 16);
                                char[] cArr7 = this.DW;
                                int i33 = i30 + 1;
                                int i34 = i31 + 1;
                                char c8 = this.j6[i31];
                                cArr7[i30] = c8;
                                int i35 = i32 | (c8 << '\b');
                                char[] cArr8 = this.DW;
                                int i36 = i33 + 1;
                                char c9 = this.j6[i34];
                                cArr8[i33] = c9;
                                i5 = i35 | (c9 << 0);
                                i7 = i34 + 1;
                                i4 = i26;
                                i3 = i36;
                            }
                            i7++;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (Hw) {
                            iy.a8(th, -2311486427197490625L, this, reader, str, new Integer(i), new Integer(i2));
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = 2900851891588674576L)
        public /* synthetic */ b(a aVar) {
            this();
            try {
                if (FH) {
                    iy.tp(3075843392578603872L, null, aVar);
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, 3075843392578603872L, null, aVar);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1424145987017804104L, container = -1424145987017804104L, user = true)
    private class c {

        @fy
        private static /* synthetic */ boolean Hw;

        @gy
        private static /* synthetic */ boolean v5;

        @dy(field = 3332190148380737361L)
        private Stack<SyntaxTree> DW;

        @dy(field = 49985113791673920L)
        @hy
        final /* synthetic */ SyntaxTreeSpace FH;

        @dy(field = -859591775228890260L)
        private Stack<SyntaxTree> j6;

        static {
            iy.Zo(c.class);
        }

        @ey(method = 6542369602880993504L)
        private c(SyntaxTreeSpace syntaxTreeSpace) {
            try {
                if (Hw) {
                    iy.tp(-3011016360550909785L, null, syntaxTreeSpace);
                }
                this.FH = syntaxTreeSpace;
                this.j6 = new Stack<>();
                this.DW = new Stack<>();
            } catch (Throwable th) {
                if (v5) {
                    iy.j3(th, -3011016360550909785L, null, syntaxTreeSpace);
                }
                throw th;
            }
        }

        @ey(method = 760928758318018341L)
        public void DW(SyntaxTree syntaxTree) {
            try {
                if (Hw) {
                    iy.tp(462354961321561035L, this, syntaxTree);
                }
                if (this.DW.contains(syntaxTree)) {
                    this.DW.removeElement(syntaxTree);
                    this.j6.push(syntaxTree);
                }
            } catch (Throwable th) {
                if (v5) {
                    iy.j3(th, 462354961321561035L, this, syntaxTree);
                }
                throw th;
            }
        }

        @ey(method = 3959703949133263727L)
        public void FH() {
            try {
                if (Hw) {
                    iy.gn(-2745808604729263743L, this);
                }
                for (int i = 0; i < this.DW.size(); i++) {
                    this.j6.addElement(this.DW.elementAt(i));
                }
                this.DW.setSize(0);
            } catch (Throwable th) {
                if (v5) {
                    iy.aM(th, -2745808604729263743L, this);
                }
                throw th;
            }
        }

        @ey(method = 2483509510558949584L)
        public void Hw() {
            try {
                if (Hw) {
                    iy.gn(-3049155835319882752L, this);
                }
                this.j6 = new Stack<>();
                this.DW = new Stack<>();
            } catch (Throwable th) {
                if (v5) {
                    iy.aM(th, -3049155835319882752L, this);
                }
                throw th;
            }
        }

        @ey(method = 946162677012379875L)
        public SyntaxTree j6() {
            try {
                if (Hw) {
                    iy.gn(-3253763751659493995L, this);
                }
                if (this.j6.isEmpty()) {
                    SyntaxTree syntaxTree = new SyntaxTree(this.FH.model);
                    this.DW.push(syntaxTree);
                    return syntaxTree;
                }
                SyntaxTree syntaxTreePop = this.j6.pop();
                this.DW.push(syntaxTreePop);
                return syntaxTreePop;
            } catch (Throwable th) {
                if (v5) {
                    iy.aM(th, -3253763751659493995L, this);
                }
                throw th;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = -1978358515427070727L)
        public /* synthetic */ c(SyntaxTreeSpace syntaxTreeSpace, a aVar) {
            this(syntaxTreeSpace);
            try {
                if (Hw) {
                    iy.EQ(2151097821852905664L, null, syntaxTreeSpace, aVar);
                }
            } catch (Throwable th) {
                if (v5) {
                    iy.Mr(th, 2151097821852905664L, null, syntaxTreeSpace, aVar);
                }
                throw th;
            }
        }
    }
}
