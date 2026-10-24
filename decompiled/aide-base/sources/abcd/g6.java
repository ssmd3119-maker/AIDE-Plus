package abcd;

import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.SyntaxTreeStyles;

@cy(clazz = -5564382537054054784L, container = -5564382537054054784L, user = true)
/* loaded from: classes.dex */
public class g6 {

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = 902637302880787968L)
    private final Model DW;

    @dy(field = 946275383582972736L)
    private int[] j6;

    static {
        iy.Zo(g6.class);
    }

    @ey(method = 178214197381501183L)
    public g6(Model model) {
        try {
            if (FH) {
                iy.tp(-1095510792867191783L, null, model);
            }
            this.j6 = new int[10000];
            this.DW = model;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -1095510792867191783L, null, model);
            }
            throw th;
        }
    }

    @ey(method = 1521821438585887075L)
    public void j6(SyntaxTreeStyles syntaxTreeStyles, FileEntry fileEntry, boolean z, SyntaxTree syntaxTree) throws Throwable {
        SyntaxTree syntaxTree2 = syntaxTree;
        try {
            if (FH) {
                iy.J0(-909219274576662465L, this, syntaxTreeStyles, fileEntry, new Boolean(z), syntaxTree);
            }
            syntaxTree2.Fd(syntaxTreeStyles);
            int[] iArr = syntaxTreeStyles.syntaxTags;
            int[] iArr2 = syntaxTreeStyles.DW;
            int[] iArr3 = syntaxTreeStyles.startLines;
            int[] iArr4 = syntaxTreeStyles.endLines;
            int[] iArr5 = syntaxTreeStyles.startColumns;
            int[] iArr6 = syntaxTreeStyles.endColumns;
            int i = syntaxTreeStyles.size;
            int i2 = 0;
            while (true) {
                int i3 = i2;
                int i4 = 0;
                while (i4 < i) {
                    if (iArr[i4] == 0) {
                        break;
                    }
                    int i5 = iArr[i4];
                    int i6 = iArr2[i4];
                    int i7 = iArr3[i4];
                    int i8 = i4;
                    int i9 = i3;
                    int[] iArr7 = iArr3;
                    SyntaxTree syntaxTree3 = syntaxTree2;
                    try {
                        int iDeclareNode = syntaxTree.declareNode(i5, false, i6, i7, iArr5[i4], iArr4[i4], iArr6[i4]);
                        if (i9 >= this.j6.length) {
                            int[] iArr8 = new int[this.j6.length * 2];
                            System.arraycopy(this.j6, 0, iArr8, 0, this.j6.length);
                            this.j6 = iArr8;
                        }
                        i3 = i9 + 1;
                        this.j6[i9] = iDeclareNode;
                        i4 = i8 + 1;
                        syntaxTree2 = syntaxTree3;
                        iArr3 = iArr7;
                    } catch (Throwable th) {
                        th = th;
                        if (Hw) {
                            iy.a8(th, -909219274576662465L, this, syntaxTreeStyles, fileEntry, new Boolean(z), syntaxTree);
                        }
                        throw th;
                    }
                }
                int[] iArr9 = iArr3;
                int i10 = i3;
                SyntaxTree syntaxTree4 = syntaxTree2;
                if (iArr[iArr.length - 1] == 0) {
                    syntaxTree4.U2(syntaxTree.declareNode(10, false, this.j6, 0, i10, 1, 1));
                    return;
                } else {
                    syntaxTree2 = syntaxTree4;
                    i2 = i10;
                    iArr3 = iArr9;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
