package abcd;

import com.aide.codemodel.AIDEModel;
import com.aide.codemodel.api.ClassType;
import com.aide.codemodel.api.Entity;
import com.aide.codemodel.api.EntitySpace;
import com.aide.codemodel.api.ErrorTable;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.FileSpace;
import com.aide.codemodel.api.IdentifierSpace;
import com.aide.codemodel.api.Member;
import com.aide.codemodel.api.Namespace;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.SyntaxTreeSpace;
import com.aide.codemodel.api.Type;
import com.aide.codemodel.api.abstraction.Language;
import com.aide.codemodel.api.collections.FunctionOfIntLong;
import com.aide.codemodel.api.collections.ListOfInt;
import com.aide.codemodel.api.collections.MapOfIntInt;
import com.aide.codemodel.api.collections.MapOfIntLong;
import com.aide.codemodel.api.collections.RelationOfIntInt;
import com.aide.codemodel.api.collections.SetOf;
import com.aide.codemodel.api.collections.SetOfFileEntry;
import com.aide.codemodel.api.collections.SetOfInt;
import com.aide.codemodel.api.collections.StoreInputStream;
import com.aide.codemodel.api.collections.StoreOutputStream;
import com.aide.uidesigner.ProxyTextView;
import java.util.Iterator;

@cy(clazz = -2764798690434518407L, container = -2764798690434518407L, user = true)
/* loaded from: classes.dex */
public class f0 {

    @fy
    private static /* synthetic */ boolean dx;

    @gy
    private static /* synthetic */ boolean sG;

    @dy(field = -2095673445710587620L)
    private SetOfFileEntry BT;

    @dy(field = 2227674706062171237L)
    private final IdentifierSpace DW;

    @dy(field = 362267819857522376L)
    private SetOfInt EQ;

    @dy(field = 1950172247387414843L)
    private final EntitySpace FH;

    @dy(field = -2419326358298284633L)
    private final FileSpace Hw;

    @dy(field = -6942891623691339240L)
    private MapOfIntLong J0;

    @dy(field = 171562680406835620L)
    private MapOfIntLong J8;

    @dy(field = -3899519235883766000L)
    private int KD;

    @dy(field = -3118026829476609900L)
    private boolean[] Mr;

    @dy(field = 1938383465211605631L)
    private int P8;

    @dy(field = 3022917457340995081L)
    private SetOf<ClassType> QX;

    @dy(field = -1574065920638360028L)
    private int[] SI;

    @dy(field = -4176997858017428824L)
    private boolean[] U2;

    @dy(field = -1242059307197686245L)
    private SetOfInt VH;

    @dy(field = -189112540360675761L)
    private MapOfIntLong Ws;

    @dy(field = 4710459523363669755L)
    private MapOfIntInt XL;

    @dy(field = 3099814375823237821L)
    private final ErrorTable Zo;

    @dy(field = 6602447151245712624L)
    private boolean[] a8;

    @dy(field = 2983419871742878876L)
    private MapOfIntInt aM;

    @dy(field = -270678561728213259L)
    private ListOfInt cb;

    @dy(field = 4867069830778918160L)
    private int[] cn;

    @dy(field = 2729201529448339360L)
    private int ei;

    @dy(field = 430189038982656744L)
    private FunctionOfIntLong er;

    @dy(field = 725878117846073143L)
    private boolean gW;

    @dy(field = 4287868670749813443L)
    private RelationOfIntInt gn;

    @dy(field = -3582497025307994417L)
    private boolean[] j3;

    @dy(field = 1704378982221636136L)
    private final AIDEModel j6;

    @dy(field = -1217910404292251508L)
    private boolean[] lg;

    @dy(field = 2777284519669804937L)
    private int[] nw;

    @dy(field = 5599397120600647497L)
    private boolean[] rN;

    @dy(field = 1850025722313449247L)
    private int ro;

    @dy(field = 3092760885013850451L)
    private int sh;

    @dy(field = 5299067065241777861L)
    private SetOfInt tp;

    @dy(field = 4588863976308707084L)
    private SetOfInt u7;

    @dy(field = 1997510877084819232L)
    private final SyntaxTreeSpace v5;

    @dy(field = -1348889660272805891L)
    private SetOfFileEntry vy;

    @dy(field = -3939592668553845333L)
    private SetOfInt we;

    @dy(field = 4995400525827914475L)
    private FunctionOfIntLong yS;

    static {
        iy.Zo(f0.class);
    }

    @ey(method = -91584065105834319L)
    public f0(AIDEModel aIDEModel) {
        try {
            if (dx) {
                iy.tp(-788638483463036621L, null, aIDEModel);
            }
            this.j6 = aIDEModel;
            this.DW = aIDEModel.identifierSpace;
            this.FH = aIDEModel.entitySpace;
            this.v5 = aIDEModel.syntaxTreeSpace;
            this.Hw = aIDEModel.fileSpace;
            this.Zo = aIDEModel.errorTable;
            this.QX = new SetOf<>(aIDEModel.entitySpace);
            this.VH = new SetOfInt();
            this.u7 = new SetOfInt();
            this.J0 = new MapOfIntLong();
            this.J8 = new MapOfIntLong();
            this.Ws = new MapOfIntLong();
            this.gn = new RelationOfIntInt();
            this.we = new SetOfInt();
            this.tp = new SetOfInt();
            this.EQ = new SetOfInt();
            this.gW = true;
            this.BT = new SetOfFileEntry(this.Hw);
            this.vy = new SetOfFileEntry(this.Hw);
            this.er = new FunctionOfIntLong();
            this.j3 = new boolean[10000];
            this.Mr = new boolean[10000];
            this.U2 = new boolean[10000];
            this.a8 = new boolean[10000];
            this.lg = new boolean[10000];
            this.rN = new boolean[10000];
            this.P8 = 0;
            this.ei = 0;
            this.nw = new int[9000];
            this.SI = new int[3000];
            this.KD = 0;
            this.ro = 0;
            this.cn = new int[4000];
            this.sh = 0;
            this.cb = new ListOfInt();
            this.yS = new FunctionOfIntLong();
            this.XL = new MapOfIntInt();
            this.aM = new MapOfIntInt();
        } catch (Throwable th) {
            if (sG) {
                iy.j3(th, -788638483463036621L, null, aIDEModel);
            }
            throw th;
        }
    }

    @ey(method = 1669965920450429360L)
    private void DW(SyntaxTree syntaxTree, Entity entity) {
        try {
            if (dx) {
                iy.EQ(1229953259501664075L, this, syntaxTree, entity);
            }
            while (this.sh < this.cb.size() && this.cb.get(this.sh) != -1) {
                this.sh += 2;
            }
            if (this.sh >= this.cb.size()) {
                this.cb.add(this.Hw.getFileEntryLanguageId(syntaxTree.getFile(), syntaxTree.getLanguage()));
                this.cb.add(entity.getId());
            } else {
                this.cb.gn(this.sh, this.Hw.getFileEntryLanguageId(syntaxTree.getFile(), syntaxTree.getLanguage()));
                this.cb.gn(this.sh + 1, entity.getId());
                this.sh += 2;
            }
        } catch (Throwable th) {
            if (sG) {
                iy.Mr(th, 1229953259501664075L, this, syntaxTree, entity);
            }
            throw th;
        }
    }

    @ey(method = 1200419072141137329L)
    private void EQ(SyntaxTree syntaxTree) {
        SetOf<ClassType> allPartialClasstypes;
        try {
            if (dx) {
                iy.tp(-2768501484230525792L, this, syntaxTree);
            }
            FileEntry file = syntaxTree.getFile();
            Language language = syntaxTree.getLanguage();
            this.QX.clear();
            we(syntaxTree, syntaxTree.getRootNode());
            this.QX.DEFAULT_ITERATOR.init();
            while (this.QX.DEFAULT_ITERATOR.hasMoreElements()) {
                ClassType classType = (ClassType) this.QX.DEFAULT_ITERATOR.nextKey();
                SetOf<ClassType> setOfFN = classType.fN();
                setOfFN.DEFAULT_ITERATOR.init();
                while (setOfFN.DEFAULT_ITERATOR.hasMoreElements()) {
                    ClassType classType2 = (ClassType) setOfFN.DEFAULT_ITERATOR.nextKey();
                    FileEntry file2 = classType2.getFile();
                    if (file2.isArchiveEntry()) {
                        file2 = file2.getParentArchive();
                    }
                    J8(file, language, file2, classType2.getLanguage());
                }
                if (classType.Yi() && (allPartialClasstypes = classType.getAllPartialClasstypes()) != null) {
                    while (allPartialClasstypes.DEFAULT_ITERATOR.hasMoreElements()) {
                        ClassType classType3 = (ClassType) allPartialClasstypes.DEFAULT_ITERATOR.nextKey();
                        FileEntry file3 = classType3.getFile();
                        if (file3.isArchiveEntry()) {
                            file3 = file3.getParentArchive();
                        }
                        J8(file, language, file3, classType3.getLanguage());
                    }
                }
            }
        } catch (Throwable th) {
            if (sG) {
                iy.j3(th, -2768501484230525792L, this, syntaxTree);
            }
            throw th;
        }
    }

    @ey(method = 14211279467144420L)
    private void FH(ClassType classType) {
        try {
            if (dx) {
                iy.tp(1162306922510510205L, this, classType);
            }
            this.QX.put(classType);
        } catch (Throwable th) {
            if (sG) {
                iy.j3(th, 1162306922510510205L, this, classType);
            }
            throw th;
        }
    }

    @ey(method = -1111298788463949767L)
    private void Hw(Namespace namespace) {
        try {
            if (dx) {
                iy.tp(95931227852061312L, this, namespace);
            }
        } catch (Throwable th) {
            if (sG) {
                iy.j3(th, 95931227852061312L, this, namespace);
            }
            throw th;
        }
    }

    @ey(method = -4669832563902439301L)
    private void J8(FileEntry fileEntry, Language language, FileEntry fileEntry2, Language language2) {
        try {
            if (dx) {
                iy.J0(-953284475811976256L, this, fileEntry, language, fileEntry2, language2);
            }
            if (fileEntry2.isArchiveEntry()) {
                fileEntry2 = fileEntry2.getParentArchive();
            }
            int fileEntryLanguageId = this.Hw.getFileEntryLanguageId(fileEntry, language);
            int fileEntryLanguageId2 = this.Hw.getFileEntryLanguageId(fileEntry2, language2);
            this.gn.v5(fileEntryLanguageId, fileEntryLanguageId2);
            this.u7.put(fileEntryLanguageId2);
            if (this.J0.Hw(fileEntryLanguageId2)) {
                return;
            }
            this.J0.VH(fileEntryLanguageId2, fileEntry2.getSyntaxVersion());
        } catch (Throwable th) {
            FileEntry fileEntry3 = fileEntry2;
            if (sG) {
                iy.a8(th, -953284475811976256L, this, fileEntry, language, fileEntry3, language2);
            }
            throw th;
        }
    }

    @ey(method = 457727435204635179L)
    private SetOfInt Mr(int i) {
        try {
            if (dx) {
                iy.u7(-401699288106587028L, this, i);
            }
            this.VH.clear();
            this.we.default_Iterator.init();
            while (this.we.default_Iterator.hasMoreElements()) {
                if (this.gn.contains(this.we.default_Iterator.nextKey(), i)) {
                    this.VH.put(this.we.default_Iterator.nextKey());
                }
            }
            return this.VH;
        } catch (Throwable th) {
            if (sG) {
                iy.j3(th, -401699288106587028L, this, new Integer(i));
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048 A[Catch: all -> 0x02da, TryCatch #2 {all -> 0x02da, blocks: (B:2:0x0000, B:4:0x0004, B:5:0x0014, B:7:0x0019, B:9:0x001f, B:15:0x002f, B:16:0x0032, B:18:0x0036, B:19:0x003f, B:20:0x0048, B:21:0x0050, B:23:0x005a, B:24:0x0063, B:25:0x006b, B:28:0x0073, B:30:0x008d, B:32:0x0091, B:33:0x00b1, B:35:0x00b5, B:36:0x00bc, B:37:0x00c8, B:39:0x00d0, B:41:0x00e6, B:42:0x00ef, B:44:0x00f7, B:45:0x0101, B:47:0x0107, B:48:0x010b, B:49:0x0114, B:51:0x011c, B:52:0x0126, B:54:0x012c, B:56:0x0130, B:58:0x0134, B:60:0x013a, B:62:0x0154, B:64:0x015e, B:65:0x016f, B:67:0x0177, B:68:0x0181, B:70:0x0187, B:71:0x018a, B:72:0x018d, B:74:0x019e, B:75:0x01af, B:77:0x01b7, B:78:0x01c1, B:80:0x01c7, B:82:0x01cd, B:84:0x01d3, B:86:0x01eb, B:87:0x01f2, B:89:0x01f9, B:91:0x01ff, B:93:0x0209, B:94:0x0213, B:95:0x0220, B:97:0x0228, B:99:0x0237, B:100:0x0241, B:102:0x0247, B:104:0x024d, B:105:0x0257, B:106:0x0260, B:108:0x0268, B:110:0x027e, B:111:0x0287, B:113:0x028f, B:114:0x0299, B:116:0x029f, B:117:0x02a3, B:118:0x02ac, B:120:0x02b4, B:121:0x02be, B:123:0x02c4, B:126:0x02c9, B:128:0x02cf), top: B:144:0x0000 }] */
    /* JADX WARN: Type inference failed for: r12v2, types: [com.aide.codemodel.api.Entity, com.aide.codemodel.api.Member] */
    /* JADX WARN: Type inference failed for: r12v3, types: [com.aide.codemodel.api.Entity, com.aide.codemodel.api.Member] */
    @abcd.ey(method = -2578493968495761712L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void VH(com.aide.codemodel.api.SyntaxTree r10, int r11, com.aide.codemodel.api.Entity r12) {
        /*
            Method dump skipped, instructions count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.f0.VH(com.aide.codemodel.api.SyntaxTree, int, com.aide.codemodel.api.Entity):void");
    }

    @ey(method = 6151892926726950592L)
    private void Zo(SyntaxTree syntaxTree, Entity entity, Entity entity2, int i) {
        try {
            if (dx) {
                iy.J0(396589011585234813L, this, syntaxTree, entity, entity2, new Integer(i));
            }
            if (entity != null && this.vy.contains(entity2.getFile()) && this.vy.contains(entity.getFile())) {
                while (this.P8 < this.ei && this.nw[this.P8] != -1) {
                    this.P8 += 3;
                }
                if (this.P8 < this.ei) {
                    this.nw[this.P8] = this.Hw.getFileEntryLanguageId(syntaxTree.getFile(), syntaxTree.getLanguage());
                    this.nw[this.P8 + 1] = entity.getId();
                    this.nw[this.P8 + 2] = entity2.getId();
                    this.SI[this.P8 / 3] = i;
                    this.P8 += 3;
                    return;
                }
                if (this.ei + 3 >= this.nw.length) {
                    int[] iArr = new int[(((this.nw.length * 2) / 3) * 3) + 3];
                    System.arraycopy(this.nw, 0, iArr, 0, this.nw.length);
                    this.nw = iArr;
                    int[] iArr2 = new int[(iArr.length / 3) + 1];
                    System.arraycopy(this.SI, 0, iArr2, 0, this.SI.length);
                    this.SI = iArr2;
                }
                this.nw[this.ei] = this.Hw.getFileEntryLanguageId(syntaxTree.getFile(), syntaxTree.getLanguage());
                this.nw[this.ei + 1] = entity.getId();
                this.nw[this.ei + 2] = entity2.getId();
                this.SI[this.ei / 3] = i;
                this.ei += 3;
            }
        } catch (Throwable th) {
            if (sG) {
                iy.a8(th, 396589011585234813L, this, syntaxTree, entity, entity2, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -725812823287659419L)
    private void gW(SetOfInt setOfInt, SetOfInt setOfInt2) {
        try {
            if (dx) {
                iy.EQ(678202021797063400L, this, setOfInt, setOfInt2);
            }
            this.vy.clear();
            this.vy.u7(this.Hw.KD());
            if (setOfInt2.size() > 0) {
                this.gW = true;
                setOfInt2.default_Iterator.init();
                while (setOfInt2.default_Iterator.hasMoreElements()) {
                    this.BT.gn(this.Hw.vy(setOfInt2.default_Iterator.nextKey()));
                }
            }
            if (setOfInt.size() > 0) {
                this.gW = true;
                for (int i = 0; i < this.ei; i += 3) {
                    if (setOfInt.contains(this.nw[i])) {
                        if (this.P8 > i) {
                            this.P8 = i;
                        }
                        this.nw[i] = -1;
                    }
                }
                for (int i2 = 0; i2 < this.ro; i2 += 4) {
                    if (setOfInt.contains(this.cn[i2])) {
                        if (this.KD > i2) {
                            this.KD = i2;
                        }
                        this.cn[i2] = -1;
                    }
                }
                for (int i3 = 0; i3 < this.cb.size(); i3 += 2) {
                    int i4 = this.cb.get(i3);
                    if (setOfInt.contains(i4) || !this.vy.contains(this.Hw.vy(i4))) {
                        if (this.sh > i3) {
                            this.sh = i3;
                        }
                        this.cb.gn(i3, -1);
                    }
                }
            }
        } catch (Throwable th) {
            if (sG) {
                iy.Mr(th, 678202021797063400L, this, setOfInt, setOfInt2);
            }
            throw th;
        }
    }

    @ey(method = -2298741424419151125L)
    private void j6(ClassType classType) {
        try {
            if (dx) {
                iy.tp(-538240131689698440L, this, classType);
            }
            this.QX.put(classType);
        } catch (Throwable th) {
            if (sG) {
                iy.j3(th, -538240131689698440L, this, classType);
            }
            throw th;
        }
    }

    @ey(method = 3623794578672213285L)
    private void tp(int i, SyntaxTree syntaxTree, int i2) {
        try {
            if (dx) {
                iy.we(-914771171093718120L, this, new Integer(i), syntaxTree, new Integer(i2));
            }
            if (syntaxTree.isClassDeclarationNode(i2)) {
                try {
                    ClassType classtype = this.FH.getClasstype(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getDeclarationNumber(i2));
                    for (int i3 = 0; i3 < classtype.qP(); i3++) {
                        Type typeX9 = classtype.oa(i3).x9();
                        if (typeX9.isClassType()) {
                            FileEntry file = ((ClassType) typeX9).getFile();
                            if (file.vJ() && file != syntaxTree.getFile()) {
                                this.aM.gn(i, file.getId());
                            }
                        }
                    }
                } catch (e4 unused) {
                }
            }
            if (syntaxTree.isIdentifierNode(i2)) {
                switch (syntaxTree.sh(i2)) {
                    case ProxyTextView.INPUTTYPE_date /* 20 */:
                        FileEntry file2 = ((Member) syntaxTree.getAttrReferenceEntity(i2)).getFile();
                        if (file2.vJ() && file2 != syntaxTree.getFile()) {
                            this.XL.gn(i, file2.getId());
                            break;
                        }
                        break;
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                        FileEntry file3 = ((Member) syntaxTree.getAttrReferenceEntity(i2)).getFile();
                        if (file3.vJ() && file3 != syntaxTree.getFile()) {
                            this.XL.gn(i, file3.getId());
                            break;
                        }
                        break;
                }
            }
            int childCount = syntaxTree.getChildCount(i2);
            for (int i4 = 0; i4 < childCount; i4++) {
                tp(i, syntaxTree, syntaxTree.getChildNode(i2, i4));
            }
        } catch (Throwable th) {
            if (sG) {
                iy.U2(th, -914771171093718120L, this, new Integer(i), syntaxTree, new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -1566892039258833459L)
    private void u7(SyntaxTree syntaxTree) {
        try {
            if (dx) {
                iy.tp(-3901127913397209088L, this, syntaxTree);
            }
            VH(syntaxTree, syntaxTree.getRootNode(), null);
        } catch (Throwable th) {
            if (sG) {
                iy.j3(th, -3901127913397209088L, this, syntaxTree);
            }
            throw th;
        }
    }

    @ey(method = 2152520186757325117L)
    private void v5(SyntaxTree syntaxTree, Entity entity, Entity entity2, Entity entity3) {
        try {
            if (dx) {
                iy.J0(424737503629724132L, this, syntaxTree, entity, entity2, entity3);
            }
            if (entity == null || entity == entity2 || !this.vy.contains(entity2.getFile()) || !this.vy.contains(entity.getFile())) {
                return;
            }
            while (this.KD < this.ro && this.cn[this.KD] != -1) {
                this.KD += 4;
            }
            if (this.KD < this.ro) {
                this.cn[this.KD] = this.Hw.getFileEntryLanguageId(syntaxTree.getFile(), syntaxTree.getLanguage());
                this.cn[this.KD + 1] = entity.getId();
                this.cn[this.KD + 2] = entity2.getId();
                this.cn[this.KD + 3] = entity3.getId();
                this.KD += 4;
                return;
            }
            if (this.ro + 4 >= this.cn.length) {
                int[] iArr = new int[(((this.cn.length * 2) / 4) * 4) + 4];
                System.arraycopy(this.cn, 0, iArr, 0, this.cn.length);
                this.cn = iArr;
            }
            this.cn[this.ro] = this.Hw.getFileEntryLanguageId(syntaxTree.getFile(), syntaxTree.getLanguage());
            this.cn[this.ro + 1] = entity.getId();
            this.cn[this.ro + 2] = entity2.getId();
            this.cn[this.ro + 3] = entity3.getId();
            this.ro += 4;
        } catch (Throwable th) {
            if (sG) {
                iy.a8(th, 424737503629724132L, this, syntaxTree, entity, entity2, entity3);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054 A[Catch: all -> 0x00a2, TryCatch #0 {all -> 0x00a2, blocks: (B:2:0x0000, B:4:0x0004, B:5:0x0011, B:7:0x0017, B:13:0x0027, B:14:0x002a, B:16:0x002e, B:17:0x003c, B:18:0x0046, B:19:0x0054, B:20:0x005e, B:21:0x006b, B:23:0x0071, B:25:0x007b, B:26:0x0081, B:28:0x0087, B:29:0x0090, B:31:0x0097), top: B:41:0x0000 }] */
    @abcd.ey(method = -749896110112321648L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void we(com.aide.codemodel.api.SyntaxTree r8, int r9) {
        /*
            r7 = this;
            boolean r0 = abcd.f0.dx     // Catch: java.lang.Throwable -> La2
            if (r0 == 0) goto L11
            r0 = -1278368724171071015(0xee42526b1fd061d9, double:-1.3245807186823677E223)
            java.lang.Integer r2 = new java.lang.Integer     // Catch: java.lang.Throwable -> La2
            r2.<init>(r9)     // Catch: java.lang.Throwable -> La2
            abcd.iy.EQ(r0, r7, r8, r2)     // Catch: java.lang.Throwable -> La2
        L11:
            boolean r0 = r8.isIdentifierNode(r9)     // Catch: java.lang.Throwable -> La2
            if (r0 == 0) goto L6b
            int r0 = r8.sh(r9)     // Catch: java.lang.Throwable -> La2
            r1 = 16
            if (r0 == r1) goto L5e
            r1 = 17
            if (r0 == r1) goto L54
            r1 = 20
            if (r0 == r1) goto L46
            switch(r0) {
                case 6: goto L3c;
                case 7: goto L54;
                case 8: goto L54;
                case 9: goto L54;
                case 10: goto L54;
                default: goto L2a;
            }     // Catch: java.lang.Throwable -> La2
        L2a:
            switch(r0) {
                case 22: goto L2e;
                case 23: goto L2e;
                case 24: goto L2e;
                case 25: goto L2e;
                default: goto L2d;
            }     // Catch: java.lang.Throwable -> La2
        L2d:
            goto L6b
        L2e:
            com.aide.codemodel.api.Entity r0 = r8.getAttrReferenceEntity(r9)     // Catch: java.lang.Throwable -> La2
            com.aide.codemodel.api.Member r0 = (com.aide.codemodel.api.Member) r0     // Catch: java.lang.Throwable -> La2
            com.aide.codemodel.api.ClassType r0 = r0.getEnclosingClassType()     // Catch: java.lang.Throwable -> La2
            r7.j6(r0)     // Catch: java.lang.Throwable -> La2
            goto L6b
        L3c:
            com.aide.codemodel.api.Entity r0 = r8.getAttrReferenceEntity(r9)     // Catch: java.lang.Throwable -> La2
            com.aide.codemodel.api.Namespace r0 = (com.aide.codemodel.api.Namespace) r0     // Catch: java.lang.Throwable -> La2
            r7.Hw(r0)     // Catch: java.lang.Throwable -> La2
            goto L6b
        L46:
            com.aide.codemodel.api.Entity r0 = r8.getAttrReferenceEntity(r9)     // Catch: java.lang.Throwable -> La2
            com.aide.codemodel.api.Member r0 = (com.aide.codemodel.api.Member) r0     // Catch: java.lang.Throwable -> La2
            com.aide.codemodel.api.ClassType r0 = r0.getEnclosingClassType()     // Catch: java.lang.Throwable -> La2
            r7.FH(r0)     // Catch: java.lang.Throwable -> La2
            goto L6b
        L54:
            com.aide.codemodel.api.Entity r0 = r8.getAttrReferenceEntity(r9)     // Catch: java.lang.Throwable -> La2
            com.aide.codemodel.api.ClassType r0 = (com.aide.codemodel.api.ClassType) r0     // Catch: java.lang.Throwable -> La2
            r7.FH(r0)     // Catch: java.lang.Throwable -> La2
            goto L6b
        L5e:
            com.aide.codemodel.api.Entity r0 = r8.getAttrReferenceEntity(r9)     // Catch: java.lang.Throwable -> La2
            com.aide.codemodel.api.Member r0 = (com.aide.codemodel.api.Member) r0     // Catch: java.lang.Throwable -> La2
            com.aide.codemodel.api.ClassType r0 = r0.getEnclosingClassType()     // Catch: java.lang.Throwable -> La2
            r7.FH(r0)     // Catch: java.lang.Throwable -> La2
        L6b:
            boolean r0 = r8.hasAttrType(r9)     // Catch: java.lang.Throwable -> La2
            if (r0 == 0) goto L90
            com.aide.codemodel.api.Type r0 = r8.getAttrType(r9)     // Catch: java.lang.Throwable -> La2
            boolean r1 = r0.isClassType()     // Catch: java.lang.Throwable -> La2
            if (r1 == 0) goto L81
            com.aide.codemodel.api.ClassType r0 = (com.aide.codemodel.api.ClassType) r0     // Catch: java.lang.Throwable -> La2
            r7.FH(r0)     // Catch: java.lang.Throwable -> La2
            goto L90
        L81:
            boolean r1 = r0.isParameterizedType()     // Catch: java.lang.Throwable -> La2
            if (r1 == 0) goto L90
            com.aide.codemodel.api.ParameterizedType r0 = (com.aide.codemodel.api.ParameterizedType) r0     // Catch: java.lang.Throwable -> La2
            com.aide.codemodel.api.ClassType r0 = r0.getClassType()     // Catch: java.lang.Throwable -> La2
            r7.FH(r0)     // Catch: java.lang.Throwable -> La2
        L90:
            int r0 = r8.getChildCount(r9)     // Catch: java.lang.Throwable -> La2
            r1 = 0
        L95:
            if (r1 >= r0) goto La1
            int r2 = r8.getChildNode(r9, r1)     // Catch: java.lang.Throwable -> La2
            r7.we(r8, r2)     // Catch: java.lang.Throwable -> La2
            int r1 = r1 + 1
            goto L95
        La1:
            return
        La2:
            r0 = move-exception
            boolean r1 = abcd.f0.sG
            if (r1 == 0) goto Lb7
            r2 = -1278368724171071015(0xee42526b1fd061d9, double:-1.3245807186823677E223)
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r9)
            r1 = r0
            r4 = r7
            r5 = r8
            abcd.iy.Mr(r1, r2, r4, r5, r6)
        Lb7:
            goto Lb9
        Lb8:
            throw r0
        Lb9:
            goto Lb8
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.f0.we(com.aide.codemodel.api.SyntaxTree, int):void");
    }

    @ey(method = -7369440368250787776L)
    public SetOfFileEntry J0() {
        long j;
        MapOfIntInt mapOfIntInt;
        MapOfIntInt mapOfIntInt2;
        try {
            if (dx) {
                iy.gn(-870766925332578183L, this);
            }
            if (!this.gW) {
                return null;
            }
            int i = 0;
            for (int i2 = 0; i2 < this.ei; i2 += 3) {
                int i3 = i2 + 1;
                if (this.nw[i3] > i) {
                    i = this.nw[i3];
                }
                int i4 = i2 + 2;
                if (this.nw[i4] > i) {
                    i = this.nw[i4];
                }
            }
            for (int i5 = 0; i5 < this.ro; i5 += 4) {
                int i6 = i5 + 1;
                if (this.cn[i6] > i) {
                    i = this.cn[i6];
                }
                int i7 = i5 + 2;
                if (this.cn[i7] > i) {
                    i = this.cn[i7];
                }
                int i8 = i5 + 3;
                if (this.cn[i8] > i) {
                    i = this.cn[i8];
                }
            }
            for (int i9 = 0; i9 < this.cb.size(); i9 += 2) {
                if (this.cb.get(i9) != -1) {
                    int i10 = i9 + 1;
                    if (this.cb.get(i10) > i) {
                        i = this.cb.get(i10);
                    }
                }
            }
            if (i >= this.j3.length) {
                this.j3 = new boolean[(i * 3) / 2];
            }
            if (i >= this.Mr.length) {
                this.Mr = new boolean[(i * 3) / 2];
            }
            if (i >= this.U2.length) {
                this.U2 = new boolean[(i * 3) / 2];
            }
            if (i >= this.a8.length) {
                this.a8 = new boolean[(i * 3) / 2];
            }
            if (i >= this.lg.length) {
                this.lg = new boolean[(i * 3) / 2];
            }
            if (i >= this.rN.length) {
                this.rN = new boolean[(i * 3) / 2];
            }
            for (int i11 = 0; i11 < this.j3.length; i11++) {
                this.j3[i11] = false;
            }
            for (int i12 = 0; i12 < this.Mr.length; i12++) {
                this.Mr[i12] = false;
            }
            for (int i13 = 0; i13 < this.U2.length; i13++) {
                this.U2[i13] = false;
            }
            for (int i14 = 0; i14 < this.a8.length; i14++) {
                this.a8[i14] = false;
            }
            for (int i15 = 0; i15 < this.lg.length; i15++) {
                this.lg[i15] = false;
            }
            for (int i16 = 0; i16 < this.rN.length; i16++) {
                this.rN[i16] = false;
            }
            if (f4.j6) {
                int i17 = 0;
                int i18 = 0;
                while (i17 < this.ei) {
                    if (this.nw[i17] != -1) {
                        int i19 = i17 + 2;
                        if (!this.Mr[this.nw[i19]] && this.SI[i18] != 2) {
                            this.Mr[this.nw[i19]] = true;
                        }
                    }
                    i17 += 3;
                    i18++;
                }
                for (int i20 = 0; i20 < this.ro; i20 += 4) {
                    if (this.cn[i20] != -1) {
                        int i21 = i20 + 3;
                        if (!this.Mr[this.cn[i21]]) {
                            this.Mr[this.cn[i21]] = true;
                        }
                    }
                }
                for (int i22 = 0; i22 < this.cb.size(); i22 += 2) {
                    if (this.cb.get(i22) != -1) {
                        int i23 = i22 + 1;
                        if (!this.Mr[this.cb.get(i23)]) {
                            this.j3[this.FH.getEntity(this.cb.get(i23)).getId()] = true;
                        }
                    }
                }
                if (this.j6.stopCallback.jO()) {
                    return null;
                }
                for (int i24 = 0; i24 < this.j3.length; i24++) {
                    if (this.j3[i24]) {
                        this.lg[i24] = true;
                    }
                }
            }
            for (int i25 = 0; i25 < this.ro; i25 += 4) {
                if (this.cn[i25] != -1) {
                    this.rN[this.cn[i25 + 1]] = true;
                }
            }
            if (this.j6.stopCallback.jO()) {
                return null;
            }
            this.er.clear();
            int i26 = 0;
            while (true) {
                j = 37;
                if (i26 >= this.rN.length) {
                    break;
                }
                if (this.rN[i26]) {
                    FileEntry file = this.FH.getEntity(i26).getFile();
                    if (!this.er.Hw(file.getId())) {
                        this.er.put(file.getId(), 0L);
                    }
                    this.er.put(file.getId(), (i26 + 1) ^ (this.er.v5(file.getId()) * 37));
                }
                i26++;
            }
            if (f4.j6) {
                for (int i27 = 0; i27 < this.U2.length; i27++) {
                    if (this.U2[i27]) {
                        FileEntry file2 = this.FH.getEntity(i27).getFile();
                        if (!this.er.Hw(file2.getId())) {
                            this.er.put(file2.getId(), 0L);
                        }
                        this.er.put(file2.getId(), (i27 + 3) ^ (this.er.v5(file2.getId()) * 37));
                    }
                }
                for (int i28 = 0; i28 < this.a8.length; i28++) {
                    if (this.a8[i28]) {
                        FileEntry file3 = this.FH.getEntity(i28).getFile();
                        if (!this.er.Hw(file3.getId())) {
                            this.er.put(file3.getId(), 0L);
                        }
                        this.er.put(file3.getId(), (i28 + 5) ^ (this.er.v5(file3.getId()) * 37));
                    }
                }
                int i29 = 0;
                while (i29 < this.lg.length) {
                    if (this.lg[i29]) {
                        FileEntry file4 = this.FH.getEntity(i29).getFile();
                        if (!this.er.Hw(file4.getId())) {
                            this.er.put(file4.getId(), 0L);
                        }
                        this.er.put(file4.getId(), (i29 + 7) ^ (this.er.v5(file4.getId()) * j));
                    }
                    i29++;
                    j = 37;
                }
                this.er.j6.DW();
                while (this.er.j6.j6()) {
                    FileEntry fileEntry = this.Hw.getFileEntry(this.er.j6.FH());
                    long jHw = this.er.j6.Hw();
                    if (!this.yS.Hw(fileEntry.getId()) || this.yS.v5(fileEntry.getId()) != jHw) {
                        this.BT.gn(fileEntry);
                    }
                }
                this.yS.j6.DW();
                while (this.yS.j6.j6()) {
                    FileEntry fileEntry2 = this.Hw.getFileEntry(this.yS.j6.FH());
                    long jHw2 = this.yS.j6.Hw();
                    if (!this.er.Hw(fileEntry2.getId()) || this.er.v5(fileEntry2.getId()) != jHw2) {
                        this.BT.gn(fileEntry2);
                    }
                }
            }
            MapOfIntInt mapOfIntInt3 = new MapOfIntInt();
            MapOfIntInt mapOfIntInt4 = new MapOfIntInt();
            MapOfIntInt mapOfIntInt5 = new MapOfIntInt();
            MapOfIntInt mapOfIntInt6 = new MapOfIntInt();
            for (int i30 = 0; i30 < this.rN.length; i30++) {
                if (this.rN[i30]) {
                    FileEntry file5 = this.FH.getEntity(i30).getFile();
                    if (this.BT.contains(file5)) {
                        mapOfIntInt6.gn(file5.getId(), i30);
                    }
                }
            }
            if (f4.j6) {
                for (int i31 = 0; i31 < this.U2.length; i31++) {
                    if (this.U2[i31]) {
                        FileEntry file6 = this.FH.getEntity(i31).getFile();
                        if (this.BT.contains(file6)) {
                            mapOfIntInt5.gn(file6.getId(), i31);
                        }
                    }
                }
                for (int i32 = 0; i32 < this.a8.length; i32++) {
                    if (this.a8[i32]) {
                        FileEntry file7 = this.FH.getEntity(i32).getFile();
                        if (this.BT.contains(file7)) {
                            mapOfIntInt4.gn(file7.getId(), i32);
                        }
                    }
                }
                for (int i33 = 0; i33 < this.lg.length; i33++) {
                    if (this.lg[i33]) {
                        FileEntry file8 = this.FH.getEntity(i33).getFile();
                        if (this.BT.contains(file8)) {
                            mapOfIntInt3.gn(file8.getId(), i33);
                        }
                    }
                }
            }
            if (this.j6.stopCallback.jO()) {
                return null;
            }
            int i34 = this.DW.get("main");
            int i35 = this.DW.get("Main");
            this.BT.j6.init();
            while (this.BT.j6.hasMoreElements()) {
                FileEntry fileEntryNextKey = this.BT.j6.nextKey();
                this.Zo.er(fileEntryNextKey);
                mapOfIntInt6.j6.FH(fileEntryNextKey.getId());
                while (mapOfIntInt6.j6.j6()) {
                    Entity entity = this.FH.getEntity(mapOfIntInt6.j6.v5());
                    int iWs = entity.Ws();
                    int iQX = entity.QX();
                    int iJ8 = entity.J8();
                    if (iQX != iJ8) {
                        this.Zo.aM(fileEntryNextKey, iWs, iQX, iWs, iJ8, "", 90);
                    }
                }
                if (f4.j6) {
                    mapOfIntInt3.j6.FH(fileEntryNextKey.getId());
                    while (mapOfIntInt3.j6.j6()) {
                        Entity entity2 = this.FH.getEntity(mapOfIntInt3.j6.v5());
                        int iWs2 = entity2.Ws();
                        int iQX2 = entity2.QX();
                        int iJ82 = entity2.J8();
                        String nameString = entity2.getNameString();
                        if (iQX2 != iJ82) {
                            if (entity2.isMember() && ((Member) entity2).Gj()) {
                                this.Zo.aM(fileEntryNextKey, iWs2, iQX2, iWs2, iJ82, "There is no read access to field </C>" + nameString + "<//C> which can be reached from the project's entry points", 81);
                            } else if (entity2.isClassType()) {
                                this.Zo.aM(fileEntryNextKey, iWs2, iQX2, iWs2, iJ82, "There is no usage of class </C>" + nameString + "<//C> which can be reached from the project's entry points", 80);
                            } else if (entity2.isMember() && ((Member) entity2).iW()) {
                                if (!entity2.ro() || ((Member) entity2).oY() != 0) {
                                    this.Zo.aM(fileEntryNextKey, iWs2, iQX2, iWs2, iJ82, "This constructor can not be reached from the project's entry points", 81);
                                }
                            } else if (entity2.isMember() && ((Member) entity2).e9() && !((Member) entity2).iW() && ((Member) entity2).getIdentifier() != i34 && ((Member) entity2).getIdentifier() != i35) {
                                this.Zo.aM(fileEntryNextKey, iWs2, iQX2, iWs2, iJ82, "Method </C>" + nameString + "<//C> can not be reached from the project's entry points", 81);
                            }
                        }
                    }
                    mapOfIntInt4.j6.FH(fileEntryNextKey.getId());
                    while (mapOfIntInt4.j6.j6()) {
                        Entity entity3 = this.FH.getEntity(mapOfIntInt4.j6.v5());
                        int iA8 = entity3.a8();
                        int iMr = entity3.Mr();
                        int iU2 = entity3.U2();
                        int iJ3 = entity3.j3();
                        String nameString2 = entity3.getNameString();
                        MapOfIntInt mapOfIntInt7 = mapOfIntInt3;
                        MapOfIntInt mapOfIntInt8 = mapOfIntInt4;
                        if (entity3.QX() != entity3.J8()) {
                            if (entity3.isMember() && ((Member) entity3).Gj()) {
                                String str = "Field </C>" + nameString2 + "<//C> can be private. There is no access outside of this class";
                                if (iA8 == iMr && iU2 == iJ3) {
                                    this.Zo.aM(fileEntryNextKey, iA8, iU2, iMr, iJ3 + 2, str, 83);
                                } else {
                                    this.Zo.aM(fileEntryNextKey, iA8, iU2, iMr, iJ3, str, 83);
                                }
                            } else if (entity3.isClassType()) {
                                String str2 = "Class </C>" + nameString2 + "<//C> can be private. There is no usage outside of this class";
                                if (iA8 == iMr && iU2 == iJ3) {
                                    this.Zo.aM(fileEntryNextKey, iA8, iU2, iMr, iJ3 + 2, str2, 82);
                                } else {
                                    this.Zo.aM(fileEntryNextKey, iA8, iU2, iMr, iJ3, str2, 82);
                                }
                            } else if (entity3.isMember() && ((Member) entity3).e9() && !((Member) entity3).iW()) {
                                String str3 = "Method </C>" + nameString2 + "<//C> can be private. There is no call outside of this class";
                                if (iA8 == iMr && iU2 == iJ3) {
                                    this.Zo.aM(fileEntryNextKey, iA8, iU2, iMr, iJ3 + 2, str3, 83);
                                } else {
                                    this.Zo.aM(fileEntryNextKey, iA8, iU2, iMr, iJ3, str3, 83);
                                }
                            } else if (entity3.isMember() && ((Member) entity3).iW() && entity3.QX() != entity3.J8()) {
                                if (iA8 == iMr && iU2 == iJ3) {
                                    this.Zo.aM(fileEntryNextKey, iA8, iU2, iMr, iJ3 + 2, "This constructor can be private. There is no call outside of this class", 83);
                                } else {
                                    this.Zo.aM(fileEntryNextKey, iA8, iU2, iMr, iJ3, "This constructor can be private. There is no call outside of this class", 83);
                                }
                            }
                        }
                        mapOfIntInt3 = mapOfIntInt7;
                        mapOfIntInt4 = mapOfIntInt8;
                    }
                    mapOfIntInt = mapOfIntInt3;
                    mapOfIntInt2 = mapOfIntInt4;
                    mapOfIntInt5.j6.FH(fileEntryNextKey.getId());
                    while (mapOfIntInt5.j6.j6()) {
                        Entity entity4 = this.FH.getEntity(mapOfIntInt5.j6.v5());
                        int iWs3 = entity4.Ws();
                        if (entity4.QX() != entity4.J8()) {
                            this.Zo.aM(fileEntryNextKey, iWs3, entity4.QX() - 1, iWs3, entity4.QX() + 1, "Method </C>" + entity4.getNameString() + "<//C> can be void. The returned value is never used in the project", 84);
                        }
                    }
                } else {
                    mapOfIntInt = mapOfIntInt3;
                    mapOfIntInt2 = mapOfIntInt4;
                }
                mapOfIntInt3 = mapOfIntInt;
                mapOfIntInt4 = mapOfIntInt2;
            }
            SetOfFileEntry setOfFileEntry = new SetOfFileEntry(this.Hw);
            setOfFileEntry.u7(this.BT);
            this.BT.clear();
            this.gW = false;
            this.yS.clear();
            this.yS.put(this.er);
            return setOfFileEntry;
        } finally {
        }
    }

    @ey(method = 6704152865904275955L)
    public void QX(FileEntry fileEntry, ListOfInt listOfInt) {
        try {
            if (dx) {
                iy.EQ(-3630327007428954280L, this, fileEntry, listOfInt);
            }
            Iterator<Language> it = fileEntry.getCodeModel().getLanguages().iterator();
            while (it.hasNext()) {
                this.XL.j6.FH(this.Hw.getFileEntryLanguageId(fileEntry, it.next()));
                while (this.XL.j6.j6()) {
                    listOfInt.add(this.XL.j6.v5());
                }
            }
        } catch (Throwable th) {
            if (sG) {
                iy.Mr(th, -3630327007428954280L, this, fileEntry, listOfInt);
            }
            throw th;
        }
    }

    @ey(method = -2271942040038142423L)
    public void U2() {
        try {
            if (dx) {
                iy.gn(-3958671481398637832L, this);
            }
            this.EQ.clear();
        } catch (Throwable th) {
            if (sG) {
                iy.aM(th, -3958671481398637832L, this);
            }
            throw th;
        }
    }

    @ey(method = -1922082272501194517L)
    public SetOf<Entity> Ws() {
        try {
            if (dx) {
                iy.gn(-4768014797790198408L, this);
            }
            return new SetOf<>(this.FH);
        } catch (Throwable th) {
            if (sG) {
                iy.aM(th, -4768014797790198408L, this);
            }
            throw th;
        }
    }

    @ey(method = -4315406499077664972L)
    public void XL(FileEntry fileEntry, ListOfInt listOfInt) {
        try {
            if (dx) {
                iy.EQ(-4430189683946086929L, this, fileEntry, listOfInt);
            }
            Iterator<Language> it = fileEntry.getCodeModel().getLanguages().iterator();
            while (it.hasNext()) {
                this.aM.j6.FH(this.Hw.getFileEntryLanguageId(fileEntry, it.next()));
                while (this.aM.j6.j6()) {
                    listOfInt.add(this.aM.j6.v5());
                }
            }
        } catch (Throwable th) {
            if (sG) {
                iy.Mr(th, -4430189683946086929L, this, fileEntry, listOfInt);
            }
            throw th;
        }
    }

    @ey(method = 2252751303875036677L)
    public boolean a8(FileEntry fileEntry) {
        try {
            if (dx) {
                iy.tp(450065347464963360L, this, fileEntry);
            }
            if (fileEntry.getCodeModel() == null) {
                return true;
            }
            Iterator<Language> it = fileEntry.getCodeModel().getLanguages().iterator();
            while (it.hasNext()) {
                int fileEntryLanguageId = this.Hw.getFileEntryLanguageId(fileEntry, it.next());
                if (!this.we.contains(fileEntryLanguageId)) {
                    return false;
                }
                if (this.tp.contains(fileEntryLanguageId) && !this.EQ.contains(fileEntryLanguageId)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (sG) {
                iy.j3(th, 450065347464963360L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = 6233065382539214973L)
    public SetOf<Entity> aM(SetOf<Entity> setOf, int i) {
        int iJ0;
        int i2;
        try {
            if (dx) {
                iy.EQ(5527535181642795600L, this, setOf, new Integer(i));
            }
            SetOf setOf2 = new SetOf(this.FH);
            SetOf<Entity> setOf3 = new SetOf<>(this.FH);
            setOf2.u7(setOf);
            do {
                int iJ02 = setOf2.J0();
                setOf3.clear();
                int i3 = 0;
                int i4 = 0;
                while (i3 < this.ei) {
                    if (this.nw[i3] != -1 && setOf2.contains(this.FH.getEntity(this.nw[i3 + 1])) && ((i2 = this.SI[i4]) == 3 || i2 == 4 || i2 == 5)) {
                        int i5 = i3 + 2;
                        if (this.FH.getEntity(this.nw[i5]).isMember()) {
                            setOf3.put(this.FH.getEntity(this.nw[i5]));
                        }
                    }
                    i3 += 3;
                    i4++;
                }
                do {
                    iJ0 = setOf3.J0();
                    for (int i6 = 0; i6 < this.ro; i6 += 4) {
                        if (this.cn[i6] != -1 && setOf2.contains(this.FH.getEntity(this.cn[i6 + 1]))) {
                            setOf3.put(this.FH.getEntity(this.cn[i6 + 3]));
                        }
                    }
                } while (iJ0 != setOf3.J0());
                setOf2.u7(setOf3);
                i--;
                if (iJ02 == setOf2.J0()) {
                    break;
                }
            } while (i > 0);
            setOf3.clear();
            setOf2.DEFAULT_ITERATOR.init();
            while (setOf2.DEFAULT_ITERATOR.hasMoreElements()) {
                setOf3.put(setOf2.DEFAULT_ITERATOR.nextKey());
            }
            return setOf3;
        } finally {
        }
    }

    @ey(method = -660121154888002472L)
    public void gn(SyntaxTree syntaxTree) {
        try {
            if (dx) {
                iy.tp(3160120583909017975L, this, syntaxTree);
            }
            if (a8(syntaxTree.getFile())) {
                return;
            }
            FileEntry file = syntaxTree.getFile();
            int fileEntryLanguageId = this.Hw.getFileEntryLanguageId(file, syntaxTree.getLanguage());
            this.J8.VH(fileEntryLanguageId, syntaxTree.getPublicDeclarationDigest());
            this.Ws.VH(fileEntryLanguageId, syntaxTree.aq());
            if (!this.J0.Hw(fileEntryLanguageId)) {
                this.J0.VH(fileEntryLanguageId, file.getSyntaxVersion());
            }
            this.we.put(fileEntryLanguageId);
            this.tp.u7(fileEntryLanguageId);
            EQ(syntaxTree);
            this.XL.we(fileEntryLanguageId);
            this.aM.we(fileEntryLanguageId);
            tp(fileEntryLanguageId, syntaxTree, syntaxTree.getRootNode());
            u7(syntaxTree);
            if (this.j6.errorTable.ei(file, syntaxTree.getLanguage())) {
                this.tp.put(fileEntryLanguageId);
                this.EQ.put(fileEntryLanguageId);
            }
        } catch (Throwable th) {
            if (sG) {
                iy.j3(th, 3160120583909017975L, this, syntaxTree);
            }
            throw th;
        }
    }

    @ey(method = -5307368235144655992L)
    public SetOf<Entity> j3(SetOf<Entity> setOf, int i) {
        int iJ0;
        int i2;
        try {
            if (dx) {
                iy.EQ(-1768553112217647663L, this, setOf, new Integer(i));
            }
            SetOf setOf2 = new SetOf(this.FH);
            SetOf<Entity> setOf3 = new SetOf<>(this.FH);
            setOf2.u7(setOf);
            do {
                int iJ02 = setOf2.J0();
                setOf3.clear();
                int i3 = 0;
                int i4 = 0;
                while (i3 < this.ei) {
                    if (this.nw[i3] != -1 && setOf2.contains(this.FH.getEntity(this.nw[i3 + 2])) && ((i2 = this.SI[i4]) == 3 || i2 == 4 || i2 == 5)) {
                        int i5 = i3 + 1;
                        if (this.FH.getEntity(this.nw[i5]).isMember()) {
                            setOf3.put(this.FH.getEntity(this.nw[i5]));
                        }
                    }
                    i3 += 3;
                    i4++;
                }
                do {
                    iJ0 = setOf3.J0();
                    for (int i6 = 0; i6 < this.ro; i6 += 4) {
                        if (this.cn[i6] != -1 && setOf2.contains(this.FH.getEntity(this.cn[i6 + 3]))) {
                            setOf3.put(this.FH.getEntity(this.cn[i6 + 1]));
                        }
                    }
                } while (iJ0 != setOf3.J0());
                setOf2.u7(setOf3);
                i--;
                if (iJ02 == setOf2.J0()) {
                    break;
                }
            } while (i > 0);
            setOf3.clear();
            setOf2.DEFAULT_ITERATOR.init();
            while (setOf2.DEFAULT_ITERATOR.hasMoreElements()) {
                setOf3.put(setOf2.DEFAULT_ITERATOR.nextKey());
            }
            return setOf3;
        } finally {
        }
    }

    @ey(method = 3405087124265496376L)
    public void load(StoreInputStream storeInputStream) {
        try {
            if (dx) {
                iy.tp(-7844204933502602075L, this, storeInputStream);
            }
            this.u7 = new SetOfInt(storeInputStream);
            this.J0 = new MapOfIntLong(storeInputStream);
            this.J8 = new MapOfIntLong(storeInputStream);
            this.Ws = new MapOfIntLong(storeInputStream);
            this.gn = new RelationOfIntInt(storeInputStream);
            this.we = new SetOfInt(storeInputStream);
            this.tp = new SetOfInt(storeInputStream);
            this.EQ = new SetOfInt(storeInputStream);
            this.P8 = 0;
            int i = storeInputStream.readInt();
            this.ei = i;
            this.nw = new int[(((i * 5) / 4) / 3) * 3];
            for (int i2 = 0; i2 < this.ei; i2++) {
                this.nw[i2] = storeInputStream.readInt();
            }
            this.SI = new int[((this.ei * 5) / 4) / 3];
            for (int i3 = 0; i3 < this.ei / 3; i3++) {
                this.SI[i3] = storeInputStream.readInt();
            }
            this.KD = 0;
            int i4 = storeInputStream.readInt();
            this.ro = i4;
            this.cn = new int[i4];
            for (int i5 = 0; i5 < this.cn.length; i5++) {
                this.cn[i5] = storeInputStream.readInt();
            }
            this.sh = 0;
            this.cb = new ListOfInt(storeInputStream);
            this.yS = new FunctionOfIntLong(storeInputStream);
            this.XL = new MapOfIntInt(storeInputStream);
            this.aM = new MapOfIntInt(storeInputStream);
        } catch (Throwable th) {
            if (sG) {
                iy.j3(th, -7844204933502602075L, this, storeInputStream);
            }
            throw th;
        }
    }

    @ey(method = 2982427100723541909L)
    public void rN() {
        try {
            if (dx) {
                iy.gn(3132288761694668240L, this);
            }
            if ((this.ei * 5) / 4 < this.nw.length) {
                int[] iArr = new int[(((this.ei * 5) / 4) / 3) * 3];
                System.arraycopy(this.nw, 0, iArr, 0, this.ei);
                this.nw = iArr;
                int[] iArr2 = new int[((this.ei * 5) / 4) / 3];
                System.arraycopy(this.SI, 0, iArr2, 0, this.ei / 3);
                this.SI = iArr2;
            }
        } catch (Throwable th) {
            if (sG) {
                iy.aM(th, 3132288761694668240L, this);
            }
            throw th;
        }
    }

    @ey(method = 7566029468237981184L)
    public void store(StoreOutputStream storeOutputStream) {
        try {
            if (dx) {
                iy.tp(1470286376159309157L, this, storeOutputStream);
            }
            this.u7.store(storeOutputStream);
            this.J0.store(storeOutputStream);
            this.J8.store(storeOutputStream);
            this.Ws.store(storeOutputStream);
            this.gn.store(storeOutputStream);
            this.we.store(storeOutputStream);
            this.tp.store(storeOutputStream);
            this.EQ.store(storeOutputStream);
            storeOutputStream.writeInt(this.ei);
            for (int i = 0; i < this.ei; i++) {
                storeOutputStream.writeInt(this.nw[i]);
            }
            for (int i2 = 0; i2 < this.ei / 3; i2++) {
                storeOutputStream.writeInt(this.SI[i2]);
            }
            storeOutputStream.writeInt(this.ro);
            for (int i3 = 0; i3 < this.ro; i3++) {
                storeOutputStream.writeInt(this.cn[i3]);
            }
            this.cb.store(storeOutputStream);
            this.yS.store(storeOutputStream);
            this.XL.store(storeOutputStream);
            this.aM.store(storeOutputStream);
        } catch (Throwable th) {
            if (sG) {
                iy.j3(th, 1470286376159309157L, this, storeOutputStream);
            }
            throw th;
        }
    }

    @ey(method = -597099668303590863L)
    public void yS() {
        try {
            if (dx) {
                iy.gn(-282171863290029336L, this);
            }
            SetOfInt setOfInt = new SetOfInt();
            this.J0.default_Iterator.init();
            boolean z = false;
            boolean z2 = false;
            while (this.J0.default_Iterator.hasMoreElements()) {
                if (this.j6.stopCallback != null && this.j6.stopCallback.hz() && setOfInt.size() == 0) {
                    return;
                }
                int iNextKey = this.J0.default_Iterator.nextKey();
                Language languageSI = this.Hw.SI(iNextKey);
                FileEntry fileEntryVy = this.Hw.vy(iNextKey);
                if (fileEntryVy.getSyntaxVersion() != this.J0.default_Iterator.nextValue()) {
                    if (this.J8.Hw(iNextKey)) {
                        SyntaxTree syntaxTreeV5 = this.v5.v5(fileEntryVy, languageSI);
                        if (this.J8.v5(iNextKey) != syntaxTreeV5.getPublicDeclarationDigest()) {
                            setOfInt.VH(Mr(iNextKey));
                            setOfInt.put(iNextKey);
                            this.J8.VH(iNextKey, syntaxTreeV5.getPublicDeclarationDigest());
                            z = true;
                        }
                        this.v5.releaseSyntaxTree(syntaxTreeV5);
                    } else {
                        setOfInt.VH(Mr(iNextKey));
                        setOfInt.put(iNextKey);
                        z = true;
                    }
                    if (this.Ws.Hw(iNextKey)) {
                        SyntaxTree syntaxTree = this.v5.getSyntaxTree(fileEntryVy, languageSI);
                        if (this.Ws.v5(iNextKey) != syntaxTree.aq()) {
                            this.Ws.VH(iNextKey, syntaxTree.aq());
                            z2 = true;
                        }
                        this.v5.releaseSyntaxTree(syntaxTree);
                    }
                }
            }
            SetOfInt setOfInt2 = new SetOfInt();
            this.we.default_Iterator.init();
            while (this.we.default_Iterator.hasMoreElements()) {
                int iNextKey2 = this.we.default_Iterator.nextKey();
                FileEntry fileEntryVy2 = this.Hw.vy(iNextKey2);
                this.Hw.SI(iNextKey2);
                if (!this.J0.Hw(iNextKey2) || fileEntryVy2.getSyntaxVersion() != this.J0.v5(iNextKey2)) {
                    setOfInt2.put(iNextKey2);
                    setOfInt.put(iNextKey2);
                }
                if (!fileEntryVy2.I()) {
                    setOfInt2.put(iNextKey2);
                    setOfInt.VH(Mr(iNextKey2));
                    setOfInt.put(iNextKey2);
                    z = true;
                }
            }
            if (z2) {
                setOfInt.VH(this.we);
            }
            if (z) {
                this.EQ.clear();
                setOfInt.VH(this.tp);
            }
            setOfInt.default_Iterator.init();
            while (setOfInt.default_Iterator.hasMoreElements()) {
                int iNextKey3 = setOfInt.default_Iterator.nextKey();
                this.Hw.SI(iNextKey3);
                FileEntry fileEntryVy3 = this.Hw.vy(iNextKey3);
                this.we.u7(iNextKey3);
                this.J0.VH(iNextKey3, fileEntryVy3.getSyntaxVersion());
            }
            this.gn.EQ(setOfInt);
            gW(setOfInt, setOfInt2);
        } catch (Throwable th) {
            if (sG) {
                iy.aM(th, -282171863290029336L, this);
            }
            throw th;
        }
    }
}
