package abcd;

import com.aide.codemodel.AIDEModel;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.FileSpace;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.SyntaxTreeSpace;
import com.aide.codemodel.api.collections.MapOfIntLong;
import com.aide.codemodel.api.collections.RelationOfIntInt;
import com.aide.codemodel.api.collections.SetOfFileEntry;
import com.aide.codemodel.api.collections.SetOfInt;
import com.aide.codemodel.api.collections.StoreInputStream;
import com.aide.codemodel.api.collections.StoreOutputStream;

@cy(clazz = 1297349722363233176L, container = 1297349722363233176L, user = true)
/* loaded from: classes.dex */
public class k0 {

    @fy
    private static /* synthetic */ boolean J0;

    @gy
    private static /* synthetic */ boolean J8;

    @dy(field = -1824888312831288255L)
    private final SyntaxTreeSpace DW;

    @dy(field = -1323483106049322508L)
    private SetOfInt EQ;

    @dy(field = 4119643123925106336L)
    private final FileSpace FH;

    @dy(field = -298955919399406416L)
    private RelationOfIntInt Hw;

    @dy(field = -2397259705243765245L)
    private SetOfFileEntry VH;

    @dy(field = -3124673556231252740L)
    private RelationOfIntInt Zo;

    @dy(field = -156959413470830321L)
    private SetOfFileEntry gn;

    @dy(field = -2108455099214853825L)
    private final AIDEModel j6;

    @dy(field = 825987321617014395L)
    private int tp;

    @dy(field = -3601689230543890173L)
    private MapOfIntLong u7;

    @dy(field = 3938483058503909864L)
    private RelationOfIntInt v5;

    @dy(field = -3307406502917924937L)
    private SetOfFileEntry we;

    static {
        iy.Zo(k0.class);
    }

    @ey(method = 64940460755672156L)
    public k0(AIDEModel aIDEModel) {
        try {
            if (J0) {
                iy.tp(6950476421857512489L, null, aIDEModel);
            }
            this.j6 = aIDEModel;
            this.DW = aIDEModel.syntaxTreeSpace;
            this.FH = aIDEModel.fileSpace;
            this.Hw = new RelationOfIntInt();
            this.v5 = new RelationOfIntInt();
            this.Zo = new RelationOfIntInt();
            this.VH = new SetOfFileEntry(this.FH);
            this.gn = new SetOfFileEntry(this.FH);
            this.u7 = new MapOfIntLong();
            this.we = new SetOfFileEntry(this.FH);
        } catch (Throwable th) {
            if (J8) {
                iy.j3(th, 6950476421857512489L, null, aIDEModel);
            }
            throw th;
        }
    }

    @ey(method = 3318097880963208168L)
    private void DW(FileEntry fileEntry) {
        try {
            if (J0) {
                iy.tp(-6933986962263153639L, this, fileEntry);
            }
            if (this.gn.contains(fileEntry)) {
                return;
            }
            this.gn.gn(fileEntry);
            this.u7.VH(fileEntry.getId(), fileEntry.getSyntaxVersion());
            for (SyntaxTree syntaxTree : this.DW.VH(fileEntry)) {
                a8(syntaxTree, fileEntry, syntaxTree.getRootNode());
                this.j6.syntaxTreeSpace.releaseSyntaxTree(syntaxTree);
            }
        } catch (Throwable th) {
            if (J8) {
                iy.j3(th, -6933986962263153639L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = 584123183241672195L)
    private void U2(SyntaxTree syntaxTree, FileEntry fileEntry, int i) {
        try {
            if (J0) {
                iy.we(618739665290071992L, this, syntaxTree, fileEntry, new Integer(i));
            }
            if (syntaxTree.GK(i)) {
                u7(fileEntry, this.j6.identifierSpace.QX(syntaxTree.getIdentifier(i)));
                gn(fileEntry, this.j6.identifierSpace.QX(syntaxTree.getIdentifier(i)));
            } else if (syntaxTree.isIdentifierNode(i)) {
                gn(fileEntry, this.j6.identifierSpace.QX(syntaxTree.getIdentifier(i)));
            }
            int childCount = syntaxTree.getChildCount(i);
            for (int i2 = 0; i2 < childCount; i2++) {
                U2(syntaxTree, fileEntry, syntaxTree.getChildNode(i, i2));
            }
        } catch (Throwable th) {
            if (J8) {
                iy.U2(th, 618739665290071992L, this, syntaxTree, fileEntry, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -1064938257119647040L)
    private void a8(SyntaxTree syntaxTree, FileEntry fileEntry, int i) {
        try {
            if (J0) {
                iy.we(-654726679301752441L, this, syntaxTree, fileEntry, new Integer(i));
            }
            if (syntaxTree.wE(i)) {
                tp(fileEntry, this.j6.identifierSpace.QX(syntaxTree.getIdentifier(i)));
            }
            if (syntaxTree.isBlockNode(i)) {
                return;
            }
            int childCount = syntaxTree.getChildCount(i);
            for (int i2 = 0; i2 < childCount; i2++) {
                a8(syntaxTree, fileEntry, syntaxTree.getChildNode(i, i2));
            }
        } catch (Throwable th) {
            if (J8) {
                iy.U2(th, -654726679301752441L, this, syntaxTree, fileEntry, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 1317763460656374593L)
    private void gn(FileEntry fileEntry, int i) {
        try {
            if (J0) {
                iy.EQ(-386076780208252280L, this, fileEntry, new Integer(i));
            }
            this.Hw.v5(fileEntry.getId(), i);
        } catch (Throwable th) {
            if (J8) {
                iy.Mr(th, -386076780208252280L, this, fileEntry, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -249717758532394845L)
    private void tp(FileEntry fileEntry, int i) {
        try {
            if (J0) {
                iy.EQ(6774460044245523600L, this, fileEntry, new Integer(i));
            }
            this.Zo.v5(fileEntry.getId(), i);
        } catch (Throwable th) {
            if (J8) {
                iy.Mr(th, 6774460044245523600L, this, fileEntry, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2370090071604647049L)
    private void u7(FileEntry fileEntry, int i) {
        try {
            if (J0) {
                iy.EQ(911623623657693908L, this, fileEntry, new Integer(i));
            }
            this.v5.v5(fileEntry.getId(), i);
        } catch (Throwable th) {
            if (J8) {
                iy.Mr(th, 911623623657693908L, this, fileEntry, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -585081087008058420L)
    public void EQ(SetOfInt setOfInt) {
        try {
            if (J0) {
                iy.tp(1754104042396484603L, this, setOfInt);
            }
            this.we.clear();
            this.we.u7(this.FH.KD());
            this.we.j6.init();
            while (this.we.j6.hasMoreElements()) {
                j6(this.we.j6.nextKey());
            }
            this.v5.j6.DW();
            while (this.v5.j6.j6()) {
                setOfInt.put(this.v5.j6.Hw());
            }
        } catch (Throwable th) {
            if (J8) {
                iy.j3(th, 1754104042396484603L, this, setOfInt);
            }
            throw th;
        }
    }

    @ey(method = -2372139943051606320L)
    public boolean FH(FileEntry fileEntry, int i) {
        try {
            if (J0) {
                iy.EQ(-148897104898593037L, this, fileEntry, new Integer(i));
            }
            j6(fileEntry);
            return this.Hw.contains(fileEntry.getId(), this.j6.identifierSpace.QX(i));
        } catch (Throwable th) {
            if (J8) {
                iy.Mr(th, -148897104898593037L, this, fileEntry, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -1113251962329358824L)
    public boolean Hw(FileEntry fileEntry, SetOfInt setOfInt) {
        try {
            if (J0) {
                iy.EQ(-168632285753542611L, this, fileEntry, setOfInt);
            }
            j6(fileEntry);
            setOfInt.default_Iterator.init();
            while (setOfInt.default_Iterator.hasMoreElements()) {
                if (this.Hw.contains(fileEntry.getId(), this.j6.identifierSpace.QX(setOfInt.default_Iterator.nextKey()))) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (J8) {
                iy.Mr(th, -168632285753542611L, this, fileEntry, setOfInt);
            }
            throw th;
        }
    }

    @ey(method = 1614701985246359163L)
    public void J0(SetOfInt setOfInt) {
        try {
            if (J0) {
                iy.tp(451372573947995580L, this, setOfInt);
            }
            this.we.clear();
            this.we.u7(this.FH.KD());
            this.we.j6.init();
            this.EQ = new SetOfInt();
            setOfInt.default_Iterator.init();
            while (setOfInt.default_Iterator.hasMoreElements()) {
                this.EQ.put(this.j6.identifierSpace.QX(setOfInt.default_Iterator.nextKey()));
            }
        } catch (Throwable th) {
            if (J8) {
                iy.j3(th, 451372573947995580L, this, setOfInt);
            }
            throw th;
        }
    }

    @ey(method = -252417187508184628L)
    public void J8(int i) {
        try {
            if (J0) {
                iy.u7(121296110685083L, this, i);
            }
            this.we.clear();
            this.we.u7(this.FH.KD());
            this.we.j6.init();
            this.EQ = null;
            this.tp = this.j6.identifierSpace.QX(i);
        } catch (Throwable th) {
            if (J8) {
                iy.j3(th, 121296110685083L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -3318674145367123176L)
    public void Mr() {
        try {
            if (J0) {
                iy.gn(183314449313245605L, this);
            }
            this.u7.default_Iterator.init();
            while (this.u7.default_Iterator.hasMoreElements()) {
                FileEntry fileEntry = this.FH.getFileEntry(this.u7.default_Iterator.nextKey());
                if (this.VH.contains(fileEntry)) {
                    if (fileEntry.getSyntaxVersion() != this.u7.default_Iterator.nextValue()) {
                        this.VH.EQ(fileEntry);
                        this.Hw.u7(fileEntry.getId());
                        this.v5.u7(fileEntry.getId());
                    }
                }
                if (this.gn.contains(fileEntry)) {
                    if (fileEntry.getSyntaxVersion() != this.u7.default_Iterator.nextValue()) {
                        this.gn.EQ(fileEntry);
                        this.Zo.u7(fileEntry.getId());
                    }
                }
            }
        } catch (Throwable th) {
            if (J8) {
                iy.aM(th, 183314449313245605L, this);
            }
            throw th;
        }
    }

    @ey(method = 43149593652427584L)
    public boolean VH(FileEntry fileEntry, SetOfInt setOfInt) {
        try {
            if (J0) {
                iy.EQ(-250893090622408209L, this, fileEntry, setOfInt);
            }
            DW(fileEntry);
            setOfInt.default_Iterator.init();
            while (setOfInt.default_Iterator.hasMoreElements()) {
                if (this.Zo.contains(fileEntry.getId(), this.j6.identifierSpace.QX(setOfInt.default_Iterator.nextKey()))) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (J8) {
                iy.Mr(th, -250893090622408209L, this, fileEntry, setOfInt);
            }
            throw th;
        }
    }

    @ey(method = -1022606688696318716L)
    public void Ws(SetOfInt setOfInt) {
        try {
            if (J0) {
                iy.tp(-270680448870543035L, this, setOfInt);
            }
            this.we.clear();
            this.we.u7(this.FH.KD());
            this.we.j6.init();
            this.EQ = new SetOfInt();
            setOfInt.default_Iterator.init();
            while (setOfInt.default_Iterator.hasMoreElements()) {
                this.EQ.put(this.j6.identifierSpace.QX(setOfInt.default_Iterator.nextKey()));
            }
        } catch (Throwable th) {
            if (J8) {
                iy.j3(th, -270680448870543035L, this, setOfInt);
            }
            throw th;
        }
    }

    @ey(method = 6768299088427237504L)
    public FileEntry XL() {
        try {
            if (J0) {
                iy.gn(-5743831715329918665L, this);
            }
            while (this.we.j6.hasMoreElements()) {
                FileEntry fileEntryNextKey = this.we.j6.nextKey();
                j6(fileEntryNextKey);
                if (this.EQ != null) {
                    this.EQ.default_Iterator.init();
                    while (this.EQ.default_Iterator.hasMoreElements()) {
                        if (this.Hw.contains(fileEntryNextKey.getId(), this.EQ.default_Iterator.nextKey())) {
                            return fileEntryNextKey;
                        }
                    }
                } else if (this.Hw.contains(fileEntryNextKey.getId(), this.tp)) {
                    return fileEntryNextKey;
                }
            }
            return null;
        } catch (Throwable th) {
            if (J8) {
                iy.aM(th, -5743831715329918665L, this);
            }
            throw th;
        }
    }

    @ey(method = -316365027496009416L)
    public boolean Zo(FileEntry fileEntry, int i) {
        try {
            if (J0) {
                iy.EQ(-3858103116925135143L, this, fileEntry, new Integer(i));
            }
            DW(fileEntry);
            return this.Zo.contains(fileEntry.getId(), this.j6.identifierSpace.QX(i));
        } catch (Throwable th) {
            if (J8) {
                iy.Mr(th, -3858103116925135143L, this, fileEntry, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -6411040022301435081L)
    public FileEntry aM() {
        try {
            if (J0) {
                iy.gn(-814821606293312376L, this);
            }
            while (this.we.j6.hasMoreElements()) {
                FileEntry fileEntryNextKey = this.we.j6.nextKey();
                j6(fileEntryNextKey);
                if (this.EQ != null) {
                    this.EQ.default_Iterator.init();
                    while (this.EQ.default_Iterator.hasMoreElements()) {
                        if (this.v5.contains(fileEntryNextKey.getId(), this.EQ.default_Iterator.nextKey())) {
                            return fileEntryNextKey;
                        }
                    }
                } else if (this.v5.contains(fileEntryNextKey.getId(), this.tp)) {
                    return fileEntryNextKey;
                }
            }
            return null;
        } catch (Throwable th) {
            if (J8) {
                iy.aM(th, -814821606293312376L, this);
            }
            throw th;
        }
    }

    @ey(method = 2856571198759309353L)
    public void j6(FileEntry fileEntry) {
        try {
            if (J0) {
                iy.tp(3266931159640714860L, this, fileEntry);
            }
            DW(fileEntry);
            if (this.VH.contains(fileEntry)) {
                return;
            }
            this.VH.gn(fileEntry);
            this.u7.VH(fileEntry.getId(), fileEntry.getSyntaxVersion());
            for (SyntaxTree syntaxTree : this.DW.VH(fileEntry)) {
                U2(syntaxTree, fileEntry, syntaxTree.getRootNode());
                this.j6.syntaxTreeSpace.releaseSyntaxTree(syntaxTree);
            }
        } catch (Throwable th) {
            if (J8) {
                iy.j3(th, 3266931159640714860L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = -5524482696061692895L)
    public void load(StoreInputStream storeInputStream) {
        try {
            if (J0) {
                iy.tp(-1316919827761269648L, this, storeInputStream);
            }
            this.Hw = new RelationOfIntInt(storeInputStream);
            this.v5 = new RelationOfIntInt(storeInputStream);
            this.Zo = new RelationOfIntInt(storeInputStream);
            this.VH = new SetOfFileEntry(this.FH, storeInputStream);
            this.gn = new SetOfFileEntry(this.FH, storeInputStream);
            this.u7 = new MapOfIntLong(storeInputStream);
        } catch (Throwable th) {
            if (J8) {
                iy.j3(th, -1316919827761269648L, this, storeInputStream);
            }
            throw th;
        }
    }

    @ey(method = 3858539199239393165L)
    public void store(StoreOutputStream storeOutputStream) {
        try {
            if (J0) {
                iy.tp(4245701427136901396L, this, storeOutputStream);
            }
            this.Hw.store(storeOutputStream);
            this.v5.store(storeOutputStream);
            this.Zo.store(storeOutputStream);
            this.VH.store(storeOutputStream);
            this.gn.store(storeOutputStream);
            this.u7.store(storeOutputStream);
        } catch (Throwable th) {
            if (J8) {
                iy.j3(th, 4245701427136901396L, this, storeOutputStream);
            }
            throw th;
        }
    }

    @ey(method = -6183270233003943988L)
    public boolean v5(FileEntry fileEntry, int i) {
        try {
            if (J0) {
                iy.EQ(-3734565320285162375L, this, fileEntry, new Integer(i));
            }
            j6(fileEntry);
            return this.v5.contains(fileEntry.getId(), this.j6.identifierSpace.QX(i));
        } catch (Throwable th) {
            if (J8) {
                iy.Mr(th, -3734565320285162375L, this, fileEntry, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -1087668346882562643L)
    public void we(int i) {
        try {
            if (J0) {
                iy.u7(-340226275527353820L, this, i);
            }
            this.we.clear();
            this.we.u7(this.FH.KD());
            this.we.j6.init();
            this.tp = this.j6.identifierSpace.QX(i);
            this.EQ = null;
        } catch (Throwable th) {
            if (J8) {
                iy.j3(th, -340226275527353820L, this, new Integer(i));
            }
            throw th;
        }
    }
}
