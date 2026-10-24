package abcd;

import com.aide.codemodel.AIDEModel;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.FileSpace;
import com.aide.codemodel.api.IdentifierSpace;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.SyntaxTreeSpace;
import com.aide.codemodel.api.SyntaxTreeStyles;
import com.aide.codemodel.api.abstraction.Language;
import com.aide.codemodel.api.collections.FunctionOfIntLong;
import com.aide.codemodel.api.collections.SetOfInt;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@cy(clazz = 3321522275905155357L, container = 3321522275905155357L, user = true)
/* loaded from: classes.dex */
public class h0 {

    @gy
    private static /* synthetic */ boolean Zo;

    @fy
    private static /* synthetic */ boolean v5;

    @dy(field = -1138952034180905021L)
    private final SyntaxTreeSpace DW;

    @dy(field = 2187816937745621444L)
    private FunctionOfIntLong FH;

    @dy(field = -1616406578181263840L)
    private FunctionOfIntLong Hw;

    @dy(field = -1437956867866896059L)
    private final AIDEModel j6;

    static {
        iy.Zo(h0.class);
    }

    @ey(method = -298535774495436540L)
    public h0(AIDEModel aIDEModel) {
        try {
            if (v5) {
                iy.tp(-1385435712333234924L, null, aIDEModel);
            }
            this.j6 = aIDEModel;
            IdentifierSpace identifierSpace = aIDEModel.identifierSpace;
            FileSpace fileSpace = aIDEModel.fileSpace;
            this.DW = aIDEModel.syntaxTreeSpace;
            this.FH = new FunctionOfIntLong();
            this.Hw = new FunctionOfIntLong();
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, -1385435712333234924L, null, aIDEModel);
            }
            throw th;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ef A[Catch: all -> 0x0148, TryCatch #0 {all -> 0x0148, blocks: (B:2:0x0000, B:4:0x0004, B:5:0x0011, B:7:0x0017, B:13:0x0025, B:14:0x0028, B:16:0x002d, B:17:0x004a, B:19:0x0050, B:20:0x006d, B:22:0x0073, B:24:0x007d, B:25:0x009a, B:26:0x00b7, B:27:0x00d3, B:28:0x00ef, B:29:0x010b, B:31:0x0111, B:33:0x011b, B:34:0x0136, B:36:0x013d), top: B:46:0x0000 }] */
    @abcd.ey(method = -5482746047239628167L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void v5(com.aide.codemodel.api.SyntaxTree r8, int r9) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.h0.v5(com.aide.codemodel.api.SyntaxTree, int):void");
    }

    @ey(method = 444104543869545240L)
    public void DW(FileEntry fileEntry, List<SyntaxTree> list) {
        try {
            if (v5) {
                iy.EQ(-421737898246165505L, this, fileEntry, list);
            }
            if (fileEntry.getCodeModel() == null || this.FH.v5(fileEntry.getId()) == fileEntry.getVersion()) {
                return;
            }
            this.FH.put(fileEntry.getId(), fileEntry.getVersion());
            this.j6.highlighterCallback.releaseSyntaxTree();
            for (SyntaxTree syntaxTree : list) {
                v5(syntaxTree, syntaxTree.getRootNode());
                this.DW.releaseSyntaxTree(syntaxTree);
            }
            this.j6.highlighterCallback.fileFinished(fileEntry);
        } catch (Throwable th) {
            if (Zo) {
                iy.Mr(th, -421737898246165505L, this, fileEntry, list);
            }
            throw th;
        }
    }

    @ey(method = -2348302788896099308L)
    public void FH(FileEntry fileEntry) {
        try {
            if (v5) {
                iy.tp(-626161890197894205L, this, fileEntry);
            }
            if (fileEntry.getCodeModel() == null || this.Hw.v5(fileEntry.getId()) == fileEntry.getVersion()) {
                return;
            }
            this.Hw.put(fileEntry.getId(), fileEntry.getVersion());
            Hw(fileEntry, 0, null);
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, -626161890197894205L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = -2651647148507730152L)
    public void Hw(FileEntry fileEntry, int i, Reader reader) {
        try {
            if (v5) {
                iy.we(775704901166289971L, this, fileEntry, new Integer(i), reader);
            }
            System.currentTimeMillis();
            this.j6.highlighterCallback.j6();
            Map<Language, SyntaxTreeStyles> map = new HashMap<>();
            List<Language> languages = fileEntry.getCodeModel().getLanguages();
            Iterator<Language> it = languages.iterator();
            while (it.hasNext()) {
                map.put(it.next(), this.j6.U2.makeSyntaxTreeStyles());
            }
            if (reader == null) {
                try {
                    reader = fileEntry.getReader();
                    try {
                        fileEntry.getCodeModel().fillSyntaxTree(fileEntry, reader, map);
                        reader.close();
                    } catch (Throwable th) {
                        reader.close();
                        throw th;
                    }
                } catch (IOException unused) {
                }
            } else {
                fileEntry.getCodeModel().fillSyntaxTree(fileEntry, reader, map);
                reader.close();
            }
            for (Language language : languages) {
                SyntaxTreeStyles syntaxTreeStyles = map.get(language);
                this.j6.highlighterCallback.addSyntaxTreeStyles(language, syntaxTreeStyles);
                this.j6.U2.DW(syntaxTreeStyles);
            }
            this.j6.highlighterCallback.unifedLineFound(fileEntry, i);
        } catch (Throwable th2) {
            if (Zo) {
                iy.U2(th2, 775704901166289971L, this, fileEntry, new Integer(i), reader);
            }
            throw th2;
        }
    }

    @ey(method = 1797285333042813648L)
    public void Zo() {
        try {
            if (v5) {
                iy.gn(-1689662287577539803L, this);
            }
            SetOfInt setOfInt = new SetOfInt();
            this.FH.j6.DW();
            while (this.FH.j6.j6()) {
                int iFH = this.FH.j6.FH();
                if (!this.j6.fileSpace.getFileEntry(iFH).isOpen()) {
                    setOfInt.put(iFH);
                }
            }
            this.Hw.j6.DW();
            while (this.Hw.j6.j6()) {
                int iFH2 = this.Hw.j6.FH();
                if (!this.j6.fileSpace.getFileEntry(iFH2).isOpen()) {
                    setOfInt.put(iFH2);
                }
            }
            setOfInt.default_Iterator.init();
            while (setOfInt.default_Iterator.hasMoreElements()) {
                this.FH.remove(setOfInt.default_Iterator.nextKey());
                this.Hw.remove(setOfInt.default_Iterator.nextKey());
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, -1689662287577539803L, this);
            }
            throw th;
        }
    }

    @ey(method = 4594330045483403520L)
    public void j6(FileEntry fileEntry) {
        try {
            if (v5) {
                iy.tp(-2279362581168314335L, this, fileEntry);
            }
            if (fileEntry.getCodeModel() == null || this.FH.v5(fileEntry.getId()) == fileEntry.getVersion()) {
                return;
            }
            this.FH.put(fileEntry.getId(), fileEntry.getVersion());
            this.j6.highlighterCallback.releaseSyntaxTree();
            for (SyntaxTree syntaxTree : this.DW.VH(fileEntry)) {
                syntaxTree.getLanguage().getCodeAnalyzer().v5(syntaxTree);
                v5(syntaxTree, syntaxTree.getRootNode());
                this.DW.releaseSyntaxTree(syntaxTree);
            }
            this.j6.highlighterCallback.fileFinished(fileEntry);
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, -2279362581168314335L, this, fileEntry);
            }
            throw th;
        }
    }
}
