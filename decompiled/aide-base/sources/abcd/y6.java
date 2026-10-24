package abcd;

import com.aide.codemodel.api.EntitySpace;
import com.aide.codemodel.api.ErrorTable;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.Type;
import com.aide.codemodel.api.collections.FunctionOfIntInt;

@cy(clazz = 485918956305510000L, container = 485918956305510000L, user = true)
/* loaded from: classes.dex */
public class y6 {

    @fy
    private static /* synthetic */ boolean VH;

    @gy
    private static /* synthetic */ boolean gn;

    @dy(field = -3842735782715344928L)
    private final ErrorTable DW;

    @dy(field = 1429886801943384768L)
    private final EntitySpace FH;

    @dy(field = -2348244755399288295L)
    private FunctionOfIntInt Hw;

    @dy(field = -2245791051610091480L)
    private FunctionOfIntInt Zo;

    @dy(field = -2579447644707491371L)
    private boolean j6;

    @dy(field = -2401186238114533473L)
    private FunctionOfIntInt v5;

    static {
        iy.Zo(y6.class);
    }

    @ey(method = -40296253986940644L)
    public y6(Model model) {
        try {
            if (VH) {
                iy.tp(-4437997037129300400L, null, model);
            }
            this.j6 = true;
            this.DW = model.errorTable;
            this.FH = model.entitySpace;
            this.Hw = new FunctionOfIntInt();
            this.v5 = new FunctionOfIntInt();
            this.Zo = new FunctionOfIntInt();
        } catch (Throwable th) {
            if (gn) {
                iy.j3(th, -4437997037129300400L, null, model);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x035c A[Catch: all -> 0x03df, TryCatch #1 {all -> 0x03df, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0017, B:125:0x03ce, B:127:0x03d4, B:16:0x003d, B:18:0x004f, B:20:0x0059, B:26:0x006f, B:28:0x0075, B:34:0x008b, B:36:0x00a3, B:38:0x00ad, B:40:0x00b7, B:41:0x00d8, B:43:0x00de, B:45:0x00e8, B:47:0x00f2, B:30:0x007f, B:32:0x0085, B:22:0x0063, B:24:0x0069, B:48:0x0115, B:50:0x011f, B:52:0x0129, B:54:0x0143, B:56:0x0151, B:58:0x015d, B:60:0x0167, B:62:0x0171, B:64:0x017b, B:66:0x0189, B:67:0x01bd, B:69:0x01c9, B:70:0x01ce, B:72:0x01d8, B:78:0x01ea, B:79:0x022f, B:81:0x023d, B:82:0x0260, B:84:0x028f, B:85:0x02b2, B:86:0x02d7, B:96:0x02ed, B:98:0x0304, B:100:0x030b, B:101:0x032c, B:102:0x033d, B:104:0x0347, B:106:0x0351, B:107:0x035c, B:109:0x0366, B:112:0x0373, B:114:0x037f, B:116:0x0393, B:118:0x039d, B:120:0x03b5, B:122:0x03bb, B:124:0x03c5), top: B:140:0x0006 }] */
    @abcd.ey(method = 600209244446142240L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void FH(com.aide.codemodel.api.SyntaxTree r29, int r30) {
        /*
            Method dump skipped, instructions count: 1017
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.y6.FH(com.aide.codemodel.api.SyntaxTree, int):void");
    }

    @ey(method = -399397224709993620L)
    private Type Hw(SyntaxTree syntaxTree, Type type, int i) {
        try {
            if (VH) {
                iy.we(-7110947338187631896L, this, syntaxTree, type, new Integer(i));
            }
            int childCount = syntaxTree.getChildCount(i);
            if (childCount > 0 && syntaxTree.getSyntaxTag(syntaxTree.getChildNode(i, childCount - 1)) == 108) {
                type = this.FH.hz(type, 1);
                childCount--;
            }
            for (int i2 = childCount - 2; i2 >= 0; i2 -= 3) {
                type = this.FH.hz(type, syntaxTree.getChildCount(syntaxTree.getChildNode(i, i2)) + 1);
            }
            return type;
        } catch (Throwable th) {
            if (gn) {
                iy.U2(th, -7110947338187631896L, this, syntaxTree, type, new Integer(i));
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0076 A[Catch: all -> 0x0081, TRY_LEAVE, TryCatch #0 {all -> 0x0081, blocks: (B:2:0x0000, B:4:0x0004, B:5:0x0011, B:13:0x0023, B:15:0x003f, B:20:0x0070, B:22:0x0076, B:17:0x004a, B:19:0x0067), top: B:33:0x0000 }] */
    @abcd.ey(method = 1710342368561904896L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void j6(com.aide.codemodel.api.SyntaxTree r8, int r9) {
        /*
            r7 = this;
            boolean r0 = abcd.y6.VH     // Catch: java.lang.Throwable -> L81
            if (r0 == 0) goto L11
            r0 = -736942672689919384(0xf5c5da8b2e7d8a68, double:-2.1000565406548622E259)
            java.lang.Integer r2 = new java.lang.Integer     // Catch: java.lang.Throwable -> L81
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L81
            abcd.iy.EQ(r0, r7, r8, r2)     // Catch: java.lang.Throwable -> L81
        L11:
            int r0 = r8.getSyntaxTag(r9)     // Catch: java.lang.Throwable -> L81
            r1 = 124(0x7c, float:1.74E-43)
            r2 = 0
            if (r0 == r1) goto L4a
            r1 = 133(0x85, float:1.86E-43)
            if (r0 == r1) goto L49
            r1 = 194(0xc2, float:2.72E-43)
            if (r0 == r1) goto L23
            goto L70
        L23:
            com.aide.codemodel.api.EntitySpace r0 = r7.FH     // Catch: abcd.e4 -> L70 java.lang.Throwable -> L81
            com.aide.codemodel.api.FileEntry r1 = r8.getFile()     // Catch: abcd.e4 -> L70 java.lang.Throwable -> L81
            com.aide.codemodel.api.abstraction.Language r3 = r8.getLanguage()     // Catch: abcd.e4 -> L70 java.lang.Throwable -> L81
            int r4 = r8.getDeclarationNumber(r9)     // Catch: abcd.e4 -> L70 java.lang.Throwable -> L81
            com.aide.codemodel.api.Member r0 = r0.jw(r1, r3, r4)     // Catch: abcd.e4 -> L70 java.lang.Throwable -> L81
            int r1 = r8.getChildNode(r9, r2)     // Catch: abcd.e4 -> L70 java.lang.Throwable -> L81
            boolean r3 = r0.ro()     // Catch: abcd.e4 -> L70 java.lang.Throwable -> L81
            if (r3 == 0) goto L70
            com.aide.codemodel.api.collections.FunctionOfIntInt r3 = r7.v5     // Catch: abcd.e4 -> L70 java.lang.Throwable -> L81
            int r0 = r0.getId()     // Catch: abcd.e4 -> L70 java.lang.Throwable -> L81
            r3.Zo(r0, r1)     // Catch: abcd.e4 -> L70 java.lang.Throwable -> L81
            goto L70
        L49:
            return
        L4a:
            com.aide.codemodel.api.EntitySpace r0 = r7.FH     // Catch: abcd.e4 -> L70 java.lang.Throwable -> L81
            com.aide.codemodel.api.FileEntry r1 = r8.getFile()     // Catch: abcd.e4 -> L70 java.lang.Throwable -> L81
            com.aide.codemodel.api.abstraction.Language r3 = r8.getLanguage()     // Catch: abcd.e4 -> L70 java.lang.Throwable -> L81
            int r4 = r8.getDeclarationNumber(r9)     // Catch: abcd.e4 -> L70 java.lang.Throwable -> L81
            com.aide.codemodel.api.Member r0 = r0.jw(r1, r3, r4)     // Catch: abcd.e4 -> L70 java.lang.Throwable -> L81
            r1 = 4
            int r1 = r8.getChildNode(r9, r1)     // Catch: abcd.e4 -> L70 java.lang.Throwable -> L81
            boolean r3 = r0.ro()     // Catch: abcd.e4 -> L70 java.lang.Throwable -> L81
            if (r3 == 0) goto L70
            com.aide.codemodel.api.collections.FunctionOfIntInt r3 = r7.Zo     // Catch: abcd.e4 -> L70 java.lang.Throwable -> L81
            int r0 = r0.getId()     // Catch: abcd.e4 -> L70 java.lang.Throwable -> L81
            r3.Zo(r0, r1)     // Catch: abcd.e4 -> L70 java.lang.Throwable -> L81
        L70:
            int r0 = r8.getChildCount(r9)     // Catch: java.lang.Throwable -> L81
        L74:
            if (r2 >= r0) goto L80
            int r1 = r8.getChildNode(r9, r2)     // Catch: java.lang.Throwable -> L81
            r7.j6(r8, r1)     // Catch: java.lang.Throwable -> L81
            int r2 = r2 + 1
            goto L74
        L80:
            return
        L81:
            r0 = move-exception
            boolean r1 = abcd.y6.gn
            if (r1 == 0) goto L96
            r2 = -736942672689919384(0xf5c5da8b2e7d8a68, double:-2.1000565406548622E259)
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r9)
            r1 = r0
            r4 = r7
            r5 = r8
            abcd.iy.Mr(r1, r2, r4, r5, r6)
        L96:
            goto L98
        L97:
            throw r0
        L98:
            goto L97
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.y6.j6(com.aide.codemodel.api.SyntaxTree, int):void");
    }

    @ey(method = -378585731587548260L)
    private void v5(SyntaxTree syntaxTree, int i, String str, int i2) {
        try {
            if (VH) {
                iy.J0(5596413786570324960L, this, syntaxTree, new Integer(i), str, new Integer(i2));
            }
            this.DW.lg(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i), syntaxTree.getEndLine(i), syntaxTree.getEndColumn(i), str, i2);
        } catch (Throwable th) {
            if (gn) {
                iy.a8(th, 5596413786570324960L, this, syntaxTree, new Integer(i), str, new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -4291572334051522503L)
    public void DW(SyntaxTree syntaxTree) {
        try {
            if (VH) {
                iy.tp(-3478503298481956765L, this, syntaxTree);
            }
            if (this.j6) {
                this.v5.clear();
                this.Zo.clear();
                j6(syntaxTree, syntaxTree.getRootNode());
            }
            this.Hw.clear();
            FH(syntaxTree, syntaxTree.getRootNode());
            this.Hw.DEFAULT_ITERATOR.init();
            while (this.Hw.DEFAULT_ITERATOR.hasMoreElements()) {
                int iNextValue = this.Hw.DEFAULT_ITERATOR.nextValue();
                if (syntaxTree.getSyntaxTag(syntaxTree.getParentNode(iNextValue)) == 200) {
                    this.DW.lg(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getStartLine(iNextValue), syntaxTree.getStartColumn(iNextValue), syntaxTree.getEndLine(iNextValue), syntaxTree.getEndColumn(iNextValue), "There is no access to variable </C>" + syntaxTree.getIdentifierString(iNextValue) + "<//C>", 49);
                } else {
                    this.DW.lg(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getStartLine(iNextValue), syntaxTree.getStartColumn(iNextValue), syntaxTree.getEndLine(iNextValue), syntaxTree.getEndColumn(iNextValue), "There is no access to parameter </C>" + syntaxTree.getIdentifierString(iNextValue) + "<//C> in this method", 40);
                }
            }
            if (this.j6) {
                this.Zo.DEFAULT_ITERATOR.init();
                while (this.Zo.DEFAULT_ITERATOR.hasMoreElements()) {
                    int iNextValue2 = this.Zo.DEFAULT_ITERATOR.nextValue();
                    this.DW.lg(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getStartLine(iNextValue2), syntaxTree.getStartColumn(iNextValue2), syntaxTree.getEndLine(iNextValue2), syntaxTree.getEndColumn(iNextValue2), "Method </C>" + syntaxTree.getIdentifierString(iNextValue2) + "<//C> is never used", 41);
                }
                this.v5.DEFAULT_ITERATOR.init();
                while (this.v5.DEFAULT_ITERATOR.hasMoreElements()) {
                    int iNextValue3 = this.v5.DEFAULT_ITERATOR.nextValue();
                    this.DW.lg(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getStartLine(iNextValue3), syntaxTree.getStartColumn(iNextValue3), syntaxTree.getEndLine(iNextValue3), syntaxTree.getEndColumn(iNextValue3), "There is no access to field </C>" + syntaxTree.getIdentifierString(iNextValue3) + "<//C>", 41);
                }
            }
        } catch (Throwable th) {
            if (gn) {
                iy.j3(th, -3478503298481956765L, this, syntaxTree);
            }
            throw th;
        }
    }
}
