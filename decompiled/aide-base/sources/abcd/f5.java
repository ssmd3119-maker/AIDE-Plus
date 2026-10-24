package abcd;

import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.collections.SetOfFileEntry;
import com.aide.codemodel.api.collections.SetOfInt;
import com.aide.codemodel.language.css.CssCodeModel;

@cy(clazz = 24556554504216033L, container = 24556554504216033L, user = true)
/* loaded from: classes.dex */
public class f5 {

    @fy
    private static /* synthetic */ boolean DW;

    @gy
    private static /* synthetic */ boolean FH;

    @dy(field = 707561395900834048L)
    private Model j6;

    static {
        iy.Zo(f5.class);
    }

    @ey(method = -32216546055473465L)
    public f5(Model model) {
        try {
            if (DW) {
                iy.tp(6168137118807463191L, null, model);
            }
            this.j6 = model;
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, 6168137118807463191L, null, model);
            }
            throw th;
        }
    }

    @ey(method = 1548751673207662557L)
    private void DW(SyntaxTree syntaxTree, int i, SetOfInt setOfInt) {
        try {
            if (DW) {
                iy.we(1913502872874353243L, this, syntaxTree, new Integer(i), setOfInt);
            }
            if (syntaxTree.getSyntaxTag(i) == 151) {
                setOfInt.put(syntaxTree.getIdentifier(syntaxTree.getChildNode(i, 1)));
            }
            int childCount = syntaxTree.getChildCount(i);
            for (int i2 = 0; i2 < childCount; i2++) {
                DW(syntaxTree, syntaxTree.getChildNode(i, i2), setOfInt);
            }
        } catch (Throwable th) {
            if (FH) {
                iy.U2(th, 1913502872874353243L, this, syntaxTree, new Integer(i), setOfInt);
            }
            throw th;
        }
    }

    @ey(method = 2778381178430730185L)
    public void j6() {
        try {
            if (DW) {
                iy.gn(3362694469024227131L, this);
            }
            SetOfInt setOfInt = new SetOfInt();
            SetOfFileEntry setOfFileEntryKD = this.j6.fileSpace.KD();
            setOfFileEntryKD.j6.init();
            while (setOfFileEntryKD.j6.hasMoreElements()) {
                FileEntry fileEntryNextKey = setOfFileEntryKD.j6.nextKey();
                if ((fileEntryNextKey.getCodeModel() instanceof CssCodeModel) && !fileEntryNextKey.getFullNameString().endsWith(".min.css")) {
                    SyntaxTree syntaxTree = this.j6.syntaxTreeSpace.getSyntaxTree(fileEntryNextKey, fileEntryNextKey.getCodeModel().getLanguages().get(0));
                    DW(syntaxTree, syntaxTree.getRootNode(), setOfInt);
                    this.j6.syntaxTreeSpace.releaseSyntaxTree(syntaxTree);
                }
            }
            setOfInt.default_Iterator.init();
            while (setOfInt.default_Iterator.hasMoreElements()) {
                this.j6.codeCompleterCallback.DW(this.j6.identifierSpace.getString(setOfInt.default_Iterator.nextKey()));
            }
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, 3362694469024227131L, this);
            }
            throw th;
        }
    }
}
