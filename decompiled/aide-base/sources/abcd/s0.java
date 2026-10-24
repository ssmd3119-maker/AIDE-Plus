package abcd;

import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.collections.ListOfInt;

@cy(clazz = 338777008358252480L, container = 338777008358252480L, user = true)
/* loaded from: classes.dex */
public class s0 {

    @fy
    private static /* synthetic */ boolean DW;

    @gy
    private static /* synthetic */ boolean FH;

    @dy(field = -2629703684433993931L)
    private Model j6;

    static {
        iy.Zo(s0.class);
    }

    @ey(method = 145379221967127444L)
    public s0(Model model) {
        try {
            if (DW) {
                iy.tp(906191662210492545L, null, model);
            }
            this.j6 = model;
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, 906191662210492545L, null, model);
            }
            throw th;
        }
    }

    @ey(method = 4443519696166566928L)
    public void DW(FileEntry fileEntry, int i, int i2, int i3, int i4, boolean z) throws Throwable {
        char c;
        int startLine = i;
        int startColumn = i2;
        int endLine = i3;
        int endColumn = i4;
        try {
            if (DW) {
                iy.QX(305171349722469351L, this, new Object[]{fileEntry, new Integer(startLine), new Integer(startColumn), new Integer(endLine), new Integer(endColumn), new Boolean(z)});
            }
            SyntaxTree syntaxTreeWs = this.j6.syntaxTreeSpace.Ws(fileEntry, startLine, startColumn);
            if (z) {
                int iNh = syntaxTreeWs.Nh(startLine, startColumn, endLine, endColumn);
                int blockNodeAt = syntaxTreeWs.getBlockNodeAt(startLine, startColumn, endLine, endColumn);
                if (iNh == -1 || iNh == blockNodeAt) {
                    ListOfInt listOfIntQq = syntaxTreeWs.Qq(startLine, startColumn, endLine, endColumn);
                    if (listOfIntQq != null) {
                        startLine = syntaxTreeWs.getStartLine(listOfIntQq.get(0));
                        startColumn = syntaxTreeWs.getStartColumn(listOfIntQq.get(0));
                        endLine = syntaxTreeWs.getEndLine(listOfIntQq.get(listOfIntQq.size() - 1));
                        endColumn = syntaxTreeWs.getEndColumn(listOfIntQq.get(listOfIntQq.size() - 1));
                    }
                } else {
                    startLine = syntaxTreeWs.getStartLine(iNh);
                    startColumn = syntaxTreeWs.getStartColumn(iNh);
                    endLine = syntaxTreeWs.getEndLine(iNh);
                    endColumn = syntaxTreeWs.getEndColumn(iNh);
                }
            }
            int i5 = startLine;
            int i6 = startColumn;
            int i7 = endLine;
            int i8 = endColumn;
            try {
                c = 0;
                try {
                    this.j6.tp.j6(syntaxTreeWs.getLanguage(), i5, i6, i7, i8, z);
                } catch (Throwable th) {
                    th = th;
                    startLine = i5;
                    startColumn = i6;
                    endLine = i7;
                    endColumn = i8;
                    if (FH) {
                        Object[] objArr = new Object[6];
                        objArr[c] = fileEntry;
                        objArr[1] = new Integer(startLine);
                        objArr[2] = new Integer(startColumn);
                        objArr[3] = new Integer(endLine);
                        objArr[4] = new Integer(endColumn);
                        objArr[5] = new Boolean(z);
                        iy.rN(th, 305171349722469351L, this, objArr);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                c = 0;
            }
        } catch (Throwable th3) {
            th = th3;
            c = 0;
        }
    }

    @ey(method = -110722057876750320L)
    public void FH(FileEntry fileEntry, int i, int i2) {
        try {
            if (DW) {
                iy.we(-1617122597604489955L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            SyntaxTree syntaxTreeWs = this.j6.syntaxTreeSpace.Ws(fileEntry, i, i2);
            if (syntaxTreeWs.getLanguage().getTools() != null) {
                syntaxTreeWs.getLanguage().getTools().Sf(syntaxTreeWs, i, i2);
            } else {
                this.j6.syntaxTreeSpace.releaseSyntaxTree(syntaxTreeWs);
            }
        } catch (Throwable th) {
            if (FH) {
                iy.U2(th, -1617122597604489955L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -977197932706033456L)
    public void Hw(FileEntry fileEntry, int i, int i2) {
        try {
            if (DW) {
                iy.we(2186034738134534861L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            this.j6.refactoringCallback.g3();
            SyntaxTree syntaxTreeWs = this.j6.syntaxTreeSpace.Ws(fileEntry, i, 1);
            if (syntaxTreeWs != null && syntaxTreeWs.getLanguage().getTools() != null) {
                syntaxTreeWs.getLanguage().getTools().DW(fileEntry, i, i2);
            }
            this.j6.refactoringCallback.vJ();
        } catch (Throwable th) {
            if (FH) {
                iy.U2(th, 2186034738134534861L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ce A[Catch: all -> 0x010b, TryCatch #0 {all -> 0x010b, blocks: (B:3:0x000c, B:5:0x0010, B:10:0x003e, B:12:0x0045, B:14:0x0054, B:16:0x005a, B:18:0x0060, B:20:0x0066, B:30:0x0084, B:32:0x008a, B:33:0x008f, B:35:0x0095, B:37:0x009b, B:39:0x00a1, B:41:0x00a7, B:43:0x00ad, B:52:0x00e8, B:54:0x00f3, B:22:0x006c, B:24:0x0072, B:26:0x0078, B:28:0x007e, B:44:0x00c5, B:46:0x00ce), top: B:63:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dc  */
    @abcd.ey(method = 608457292704106304L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j6(com.aide.codemodel.api.FileEntry r18, int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.s0.j6(com.aide.codemodel.api.FileEntry, int, int, int, int):void");
    }

    @ey(method = -7218260847583639653L)
    public void v5(FileEntry fileEntry, int i, int i2) {
        try {
            if (DW) {
                iy.we(1272073315417155072L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            this.j6.refactoringCallback.g3();
            SyntaxTree syntaxTreeWs = this.j6.syntaxTreeSpace.Ws(fileEntry, i, 1);
            if (syntaxTreeWs != null && syntaxTreeWs.getLanguage().getTools() != null) {
                syntaxTreeWs.getLanguage().getTools().cn(fileEntry, i, i2);
            }
            this.j6.refactoringCallback.vJ();
        } catch (Throwable th) {
            if (FH) {
                iy.U2(th, 1272073315417155072L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }
}
