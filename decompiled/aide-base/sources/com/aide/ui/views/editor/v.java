package com.aide.ui.views.editor;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;

@cy(clazz = 3836745710645965440L, container = 3836745710645965440L, user = true)
/* loaded from: classes.dex */
public abstract class v {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    @cy(clazz = -1193744675980683023L, container = -1193744675980683023L, user = true)
    public interface a {
        @ey(method = -1610639786305971232L)
        boolean DW(int i, char[] cArr, int i2, int i3);

        @ey(method = -2983832074064975200L)
        void FH(int i, char[] cArr, int i2, int i3);

        @ey(method = -1399269345458400528L)
        void j6(String str);
    }

    static {
        iy.Zo(v.class);
    }

    @ey(method = -3053294660075071555L)
    public v() {
        try {
            if (j6) {
                iy.gn(-953159144135997120L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -953159144135997120L, null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0071, code lost:
    
        if (r7 != 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0074, code lost:
    
        if (r8 != r14.length) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0076, code lost:
    
        r1 = new char[r14.length * 2];
        java.lang.System.arraycopy(r14, 0, r1, 0, r14.length);
        r1 = r14.length;
        r14 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0084, code lost:
    
        if (r7 >= r8) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
    
        r8 = r8 - r7;
        java.lang.System.arraycopy(r14, r7, r14, 0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008a, code lost:
    
        r1 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008c, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008e, code lost:
    
        if (r1 == 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0090, code lost:
    
        r13.FH(r2, r14, 0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0093, code lost:
    
        return r14;
     */
    @abcd.ey(method = -271926438009854448L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static char[] j6(java.io.Reader r12, com.aide.ui.views.editor.v.a r13, char[] r14) {
        /*
            boolean r0 = com.aide.ui.views.editor.v.j6     // Catch: java.lang.Throwable -> L94
            if (r0 == 0) goto L10
            r1 = -754261635788803180(0xf5885309db1a7394, double:-1.4609248852694311E258)
            r3 = 0
            r4 = r12
            r5 = r13
            r6 = r14
            abcd.iy.we(r1, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L94
        L10:
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
        L15:
            int r5 = r14.length     // Catch: java.lang.Throwable -> L94
            int r5 = r5 - r1
            int r5 = r12.read(r14, r1, r5)     // Catch: java.lang.Throwable -> L94
            r6 = -1
            if (r5 == r6) goto L8e
            r6 = r1
            r7 = 0
        L20:
            int r8 = r1 + r5
            if (r6 >= r8) goto L71
            char r8 = r14[r6]     // Catch: java.lang.Throwable -> L94
            r9 = 10
            r10 = 1
            if (r8 == r9) goto L49
            r9 = 13
            if (r8 == r9) goto L3a
            if (r3 == 0) goto L57
            if (r4 != 0) goto L57
            java.lang.String r3 = "\r"
            r13.j6(r3)     // Catch: java.lang.Throwable -> L94
            r4 = 1
            goto L57
        L3a:
            int r3 = r6 - r7
            boolean r3 = r13.DW(r2, r14, r7, r3)     // Catch: java.lang.Throwable -> L94
            if (r3 != 0) goto L43
            return r14
        L43:
            int r2 = r2 + 1
            int r7 = r6 + 1
            r3 = 1
            goto L6e
        L49:
            if (r3 == 0) goto L59
            int r7 = r7 + 1
            if (r4 != 0) goto L57
            java.lang.String r3 = "\r\n"
            r13.j6(r3)     // Catch: java.lang.Throwable -> L94
            r3 = 0
            r4 = 1
            goto L6e
        L57:
            r3 = 0
            goto L6e
        L59:
            if (r4 != 0) goto L61
            java.lang.String r4 = "\n"
            r13.j6(r4)     // Catch: java.lang.Throwable -> L94
            r4 = 1
        L61:
            int r8 = r6 - r7
            boolean r7 = r13.DW(r2, r14, r7, r8)     // Catch: java.lang.Throwable -> L94
            if (r7 != 0) goto L6a
            return r14
        L6a:
            int r2 = r2 + 1
            int r7 = r6 + 1
        L6e:
            int r6 = r6 + 1
            goto L20
        L71:
            if (r7 != 0) goto L84
            int r1 = r14.length     // Catch: java.lang.Throwable -> L94
            if (r8 != r1) goto L8a
            int r1 = r14.length     // Catch: java.lang.Throwable -> L94
            int r1 = r1 * 2
            char[] r1 = new char[r1]     // Catch: java.lang.Throwable -> L94
            int r5 = r14.length     // Catch: java.lang.Throwable -> L94
            java.lang.System.arraycopy(r14, r0, r1, r0, r5)     // Catch: java.lang.Throwable -> L94
            int r14 = r14.length     // Catch: java.lang.Throwable -> L94
            r11 = r1
            r1 = r14
            r14 = r11
            goto L15
        L84:
            if (r7 >= r8) goto L8c
            int r8 = r8 - r7
            java.lang.System.arraycopy(r14, r7, r14, r0, r8)     // Catch: java.lang.Throwable -> L94
        L8a:
            r1 = r8
            goto L15
        L8c:
            r1 = 0
            goto L15
        L8e:
            if (r1 == 0) goto L93
            r13.FH(r2, r14, r0, r1)     // Catch: java.lang.Throwable -> L94
        L93:
            return r14
        L94:
            r0 = move-exception
            r7 = r14
            boolean r14 = com.aide.ui.views.editor.v.DW
            if (r14 == 0) goto La6
            r2 = -754261635788803180(0xf5885309db1a7394, double:-1.4609248852694311E258)
            r4 = 0
            r1 = r0
            r5 = r12
            r6 = r13
            abcd.iy.U2(r1, r2, r4, r5, r6, r7)
        La6:
            goto La8
        La7:
            throw r0
        La8:
            goto La7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.ui.views.editor.v.j6(java.io.Reader, com.aide.ui.views.editor.v$a, char[]):char[]");
    }
}
