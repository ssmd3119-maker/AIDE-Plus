package com.aide.codemodel.api;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.codemodel.api.abstraction.Language;
import java.io.Reader;

@cy(clazz = -1523130923842275969L, container = -1523130923842275969L, user = true)
/* loaded from: classes.dex */
public class LexerHelper {

    @fy
    private static /* synthetic */ boolean gn;

    @gy
    private static /* synthetic */ boolean u7;

    @dy(field = 412597463123805500L)
    private final IdentifierSpace DW;

    @dy(field = 1052885379401477136L)
    private final ErrorTable FH;

    @dy(field = -3151373742285270144L)
    private final Lexer Hw;

    @dy(field = -2583777834695272480L)
    private FileEntry VH;

    @dy(field = 3111995503253418183L)
    private boolean Zo;

    @dy(field = 2445724180285365048L)
    private final Language j6;

    @dy(field = 293788141132421697L)
    private final PositionalReader v5;

    static {
        iy.Zo(LexerHelper.class);
    }

    @ey(method = -2120910296948472105L)
    public LexerHelper(IdentifierSpace identifierSpace, ErrorTable errorTable, Language language, Lexer lexer) {
        try {
            if (gn) {
                iy.J0(2171680094150917625L, null, identifierSpace, errorTable, language, lexer);
            }
            this.DW = identifierSpace;
            this.FH = errorTable;
            this.Hw = lexer;
            this.j6 = language;
            this.v5 = new PositionalReader();
        } catch (Throwable th) {
            if (u7) {
                iy.a8(th, 2171680094150917625L, null, identifierSpace, errorTable, language, lexer);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @ey(method = 1474558242476814536L)
    private void j6(int i, int i2, int i3) throws Throwable {
        ?? r1;
        int i4;
        try {
            if (gn) {
                r1 = -544229907677816325;
                iy.we(-544229907677816325L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            if (!this.Zo || this.VH == null) {
                return;
            }
            try {
                if (i3 == -1) {
                    r1 = i3;
                    i4 = i2;
                    this.FH.j3(this.VH, this.j6, i, i2, i, i2 + 1, "Unexpected end of file", 0);
                } else {
                    int i5 = i3;
                    i4 = i2;
                    int i6 = i4 + 1;
                    this.FH.j3(this.VH, this.j6, i, i2, i, i6, "Unexpected " + (i5 == true ? (char) 1 : (char) 0), 0);
                    this.FH.Ws(this.VH, this.j6, i, i2, i, i6, "", "Delete");
                    r1 = i5;
                }
            } catch (Throwable th) {
                th = th;
                if (u7) {
                    iy.U2(th, -544229907677816325L, this, new Integer(i), new Integer(i4), new Integer((int) r1));
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            r1 = i3;
            i4 = i2;
        }
    }

    @ey(method = -1708526184811043248L)
    public void DW(FileEntry fileEntry, Reader reader, boolean z, boolean z2, SyntaxTreeStyles syntaxTreeStyles) {
        try {
            if (gn) {
                iy.J8(104868493953982065L, this, fileEntry, reader, new Boolean(z), new Boolean(z2), syntaxTreeStyles);
            }
            FH(fileEntry, reader, z, z2, syntaxTreeStyles, false, Integer.MAX_VALUE);
        } catch (Throwable th) {
            if (u7) {
                iy.lg(th, 104868493953982065L, this, fileEntry, reader, new Boolean(z), new Boolean(z2), syntaxTreeStyles);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0136  */
    @abcd.ey(method = -320107433852737440L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void FH(com.aide.codemodel.api.FileEntry r25, java.io.Reader r26, boolean r27, boolean r28, com.aide.codemodel.api.SyntaxTreeStyles r29, boolean r30, int r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.api.LexerHelper.FH(com.aide.codemodel.api.FileEntry, java.io.Reader, boolean, boolean, com.aide.codemodel.api.SyntaxTreeStyles, boolean, int):void");
    }
}
