package abcd;

import com.aide.codemodel.AIDEModel;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.abstraction.Language;
import com.aide.codemodel.api.collections.SetOfFileEntry;
import com.aide.codemodel.api.collections.SetOfInt;
import java.util.Iterator;
import java.util.List;

@cy(clazz = -4394013955946004260L, container = -4394013955946004260L, user = true)
/* loaded from: classes.dex */
public class e0 {

    @fy
    private static /* synthetic */ boolean Hw;

    @gy
    private static /* synthetic */ boolean v5;

    @dy(field = 915276730804135888L)
    private SyntaxTree DW;

    @dy(field = -2184122241867302100L)
    private SetOfInt FH;

    @dy(field = -1099135362888262967L)
    private final AIDEModel j6;

    @cy(clazz = -247900396304996952L, container = -247900396304996952L, user = true)
    private static class b {

        @gy
        private static /* synthetic */ boolean EQ;

        @fy
        private static /* synthetic */ boolean tp;

        @dy(field = 1895588468213233080L)
        public long DW;

        @dy(field = 734789219028552612L)
        public int FH;

        @dy(field = 1433641502570542983L)
        public int Hw;

        @dy(field = 2937083087813513120L)
        public int VH;

        @dy(field = -310422414602072651L)
        public int Zo;

        @dy(field = -2022278962280783720L)
        public int gn;

        @dy(field = 5731992855718003755L)
        public int j6;

        @dy(field = 1958590585797250755L)
        public int u7;

        @dy(field = -3917187177326461277L)
        public int v5;

        static {
            iy.Zo(b.class);
        }

        @ey(method = 526130845810101104L)
        private b() {
            try {
                if (tp) {
                    iy.gn(321408997486987908L, null);
                }
            } catch (Throwable th) {
                if (EQ) {
                    iy.aM(th, 321408997486987908L, null);
                }
                throw th;
            }
        }

        @ey(method = -3150413414158001915L)
        public void j6(b bVar) {
            try {
                if (tp) {
                    iy.tp(-5741144177731660335L, this, bVar);
                }
                if (bVar != null) {
                    this.j6 += bVar.j6;
                    this.DW += bVar.DW;
                    this.FH += bVar.FH;
                    this.Hw += bVar.Hw;
                    this.v5 += bVar.v5;
                    this.Zo += bVar.Zo;
                    this.VH += bVar.VH;
                    this.gn += bVar.gn;
                    this.u7 += bVar.u7;
                }
            } catch (Throwable th) {
                if (EQ) {
                    iy.j3(th, -5741144177731660335L, this, bVar);
                }
                throw th;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = -948684405191151552L)
        public /* synthetic */ b(a aVar) {
            this();
            try {
                if (tp) {
                    iy.tp(-3461949068781945168L, null, aVar);
                }
            } catch (Throwable th) {
                if (EQ) {
                    iy.j3(th, -3461949068781945168L, null, aVar);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(e0.class);
    }

    @ey(method = -72906669923022184L)
    public e0(AIDEModel aIDEModel) {
        try {
            if (Hw) {
                iy.tp(-12685314121572576L, null, aIDEModel);
            }
            this.j6 = aIDEModel;
            this.DW = new SyntaxTree(aIDEModel);
            this.FH = new SetOfInt();
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, -12685314121572576L, null, aIDEModel);
            }
            throw th;
        }
    }

    @ey(method = 1300264891665636372L)
    private void DW(SyntaxTree syntaxTree, int i, b bVar) {
        try {
            if (Hw) {
                iy.we(1601001079939282560L, this, syntaxTree, new Integer(i), bVar);
            }
            if (syntaxTree.isComment(i)) {
                bVar.j6 += (syntaxTree.getEndLine(i) - syntaxTree.getStartLine(i)) + 1;
            }
            if (syntaxTree.isMethodDeclarationNode(i)) {
                bVar.Hw++;
            }
            if (syntaxTree.isFieldDeclarationNode(i)) {
                bVar.VH++;
            }
            if (syntaxTree.isClassDeclarationNode(i)) {
                bVar.FH++;
            }
            if (syntaxTree.isTokenNode(i) && !syntaxTree.isComment(i)) {
                this.FH.put(syntaxTree.getStartLine(i));
            }
            if (!syntaxTree.isSyntheticNode(i) && syntaxTree.getEndLine(i) > bVar.Zo) {
                bVar.Zo = syntaxTree.getEndLine(i);
            }
            int childCount = syntaxTree.getChildCount(i);
            for (int i2 = 0; i2 < childCount; i2++) {
                DW(syntaxTree, syntaxTree.getChildNode(i, i2), bVar);
            }
        } catch (Throwable th) {
            if (v5) {
                iy.U2(th, 1601001079939282560L, this, syntaxTree, new Integer(i), bVar);
            }
            throw th;
        }
    }

    @ey(method = 3884405697638701371L)
    private void Hw(FileEntry fileEntry, b bVar) {
        try {
            if (Hw) {
                iy.EQ(-2523292741437809175L, this, fileEntry, bVar);
            }
            this.j6.codeMetricsCallback.FH(fileEntry, bVar.DW, bVar.j6, bVar.Zo, bVar.v5, bVar.FH, bVar.Hw, bVar.VH);
        } catch (Throwable th) {
            if (v5) {
                iy.Mr(th, -2523292741437809175L, this, fileEntry, bVar);
            }
            throw th;
        }
    }

    @ey(method = -1276137572874616595L)
    private void Zo(b bVar) {
        try {
            if (Hw) {
                iy.tp(-358794521558441577L, this, bVar);
            }
            this.j6.codeMetricsCallback.j6(bVar.DW, bVar.j6, bVar.Zo, bVar.v5, bVar.FH, bVar.Hw, bVar.VH);
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, -358794521558441577L, this, bVar);
            }
            throw th;
        }
    }

    @ey(method = -68368980147328903L)
    private b j6(FileEntry fileEntry, SetOfFileEntry setOfFileEntry) {
        try {
            if (Hw) {
                iy.EQ(3258031066110533375L, this, fileEntry, setOfFileEntry);
            }
            a aVar = null;
            if (!fileEntry.isDirectory() || !setOfFileEntry.contains(fileEntry)) {
                if (fileEntry.getCodeModel() == null || !fileEntry.vJ()) {
                    return null;
                }
                this.FH.clear();
                b bVar = new b(aVar);
                Iterator<Language> it = fileEntry.getCodeModel().getLanguages().iterator();
                while (it.hasNext()) {
                    this.j6.syntaxTreeSpace.FH(fileEntry, it.next(), this.DW, false, null, 0, 0);
                    bVar.Zo = Math.max(this.DW.getEndLine(this.DW.getRootNode()), bVar.Zo);
                    DW(this.DW, this.DW.getRootNode(), bVar);
                }
                bVar.DW = fileEntry.getSize();
                bVar.v5 = this.FH.size();
                v5(fileEntry, bVar);
                return bVar;
            }
            int childCount = fileEntry.getChildCount();
            b bVar2 = new b(aVar);
            for (int i = 0; i < childCount; i++) {
                if (this.j6.stopCallback.Xa()) {
                    return null;
                }
                FileEntry childEntry = fileEntry.getChildEntry(i);
                if (childEntry.isDirectory()) {
                    bVar2.j6(j6(childEntry, setOfFileEntry));
                }
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                if (this.j6.stopCallback.Xa()) {
                    return null;
                }
                FileEntry childEntry2 = fileEntry.getChildEntry(i2);
                if (!childEntry2.isDirectory()) {
                    bVar2.j6(j6(childEntry2, setOfFileEntry));
                }
            }
            if (bVar2.DW > 0) {
                Hw(fileEntry, bVar2);
            }
            return bVar2;
        } catch (Throwable th) {
            if (v5) {
                iy.Mr(th, 3258031066110533375L, this, fileEntry, setOfFileEntry);
            }
            throw th;
        }
    }

    @ey(method = -1676245656227827416L)
    private void v5(FileEntry fileEntry, b bVar) {
        try {
            if (Hw) {
                iy.EQ(2047309047624422400L, this, fileEntry, bVar);
            }
            this.j6.codeMetricsCallback.Hw(fileEntry, bVar.DW, bVar.j6, bVar.Zo, bVar.v5, bVar.FH, bVar.Hw, bVar.VH);
        } catch (Throwable th) {
            if (v5) {
                iy.Mr(th, 2047309047624422400L, this, fileEntry, bVar);
            }
            throw th;
        }
    }

    @ey(method = -463122297275409904L)
    public void FH(List<String> list) {
        try {
            if (Hw) {
                iy.tp(111949149708462528L, this, list);
            }
            SetOfFileEntry setOfFileEntry = new SetOfFileEntry(this.j6.fileSpace);
            setOfFileEntry.u7(this.j6.fileSpace.KD());
            SetOfFileEntry setOfFileEntry2 = new SetOfFileEntry(this.j6.fileSpace);
            setOfFileEntry.j6.init();
            while (setOfFileEntry.j6.hasMoreElements()) {
                for (FileEntry parentDirectory = setOfFileEntry.j6.nextKey().getParentDirectory(); !parentDirectory.isRootDirectory(); parentDirectory = parentDirectory.getParentDirectory()) {
                    setOfFileEntry2.gn(parentDirectory);
                }
            }
            b bVar = new b(null);
            for (int i = 0; i < list.size(); i++) {
                bVar.j6(j6(this.j6.fileSpace.lg(list.get(i)), setOfFileEntry2));
            }
            Zo(bVar);
            this.j6.codeMetricsCallback.DW();
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, 111949149708462528L, this, list);
            }
            throw th;
        }
    }
}
