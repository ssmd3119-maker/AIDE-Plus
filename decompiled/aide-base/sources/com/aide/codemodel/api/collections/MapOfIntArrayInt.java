package com.aide.codemodel.api.collections;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.uidesigner.ProxyTextView;

@cy(clazz = 30717209212082835L, container = 30717209212082835L, user = true)
/* loaded from: classes.dex */
public class MapOfIntArrayInt {

    @gy
    private static /* synthetic */ boolean EQ;

    @fy
    private static /* synthetic */ boolean tp;

    @dy(field = 41347381820705317L)
    private static final int[] u7;

    @dy(field = -1740943664598758720L)
    private int DW;

    @dy(field = 2408824838078374560L)
    private int[] FH;

    @dy(field = -2599006275127982181L)
    private int[] Hw;

    @dy(field = 3082726183384112697L)
    private int VH;

    @dy(field = 747565675296007008L)
    private int Zo;

    @dy(field = -2594694057391598385L)
    private int[] gn;

    @dy(field = 2558317741010154933L)
    private int[] j6;

    @dy(field = 1401348054059239888L)
    private int v5;

    static {
        try {
            iy.Zo(MapOfIntArrayInt.class);
            if (tp) {
                iy.gn(-2125784050070869956L, null);
            }
            u7 = new int[]{5, 11, 17, 37, 67, 131, 257, 521, 1031, 2053, 4099, 8209, 16411, 32771, ProxyTextView.INPUTTYPE_textAutoComplete, 131101, 262147, 524309, 1048583, 2097169, 4194319, 8388617, 16777259, 33554467, 67108879, 134217757, 268435459, 536870923, 1073741827, 2147383649};
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, -2125784050070869956L, null);
            }
            throw th;
        }
    }

    @ey(method = 1623445748084973056L)
    public MapOfIntArrayInt() {
        try {
            if (tp) {
                iy.gn(-2731326174239369112L, null);
            }
            this.VH = 0;
            this.FH = new int[u7[0]];
            this.Hw = new int[u7[0]];
            this.j6 = new int[10];
            this.DW = 1;
            this.v5 = 0;
            this.Zo = 0;
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, -2731326174239369112L, null);
            }
            throw th;
        }
    }

    @ey(method = 2516941107689935045L)
    private void gn() {
        try {
            if (tp) {
                iy.gn(264760601564290281L, this);
            }
            int i = this.VH + 1;
            this.VH = i;
            int i2 = u7[i];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[u7[i]];
            int i3 = 0;
            for (int i4 = 0; i4 < this.FH.length; i4++) {
                int i5 = this.FH[i4];
                if (i5 != 0 && i5 != Integer.MIN_VALUE) {
                    int iV5 = v5(this.j6, i5 + 1, this.j6[i5]);
                    int i6 = iV5 % i2;
                    int i7 = (iV5 % (i2 - 2)) + 1;
                    while (iArr[i6] != 0) {
                        i6 = (i6 + i7) % i2;
                    }
                    iArr[i6] = i5;
                    iArr2[i6] = this.Hw[i4];
                    i3++;
                }
            }
            this.FH = iArr;
            this.Hw = iArr2;
            this.v5 = i3;
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, 264760601564290281L, this);
            }
            throw th;
        }
    }

    @ey(method = 3804513888865510953L)
    private int v5(int[] iArr, int i, int i2) {
        try {
            if (tp) {
                iy.we(-659394407513054579L, this, iArr, new Integer(i), new Integer(i2));
            }
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                i3 ^= iArr[i4 + i];
            }
            if (i3 == 0) {
                i3 = Integer.MAX_VALUE;
            }
            return Integer.MAX_VALUE & i3;
        } catch (Throwable th) {
            if (EQ) {
                iy.U2(th, -659394407513054579L, this, iArr, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        return false;
     */
    @abcd.ey(method = 1732077257003657100L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean DW(int[] r9, int r10, int r11) {
        /*
            r8 = this;
            boolean r0 = com.aide.codemodel.api.collections.MapOfIntArrayInt.tp     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto L18
            r1 = 2665953759176881668(0x24ff5ed1b35af604, double:1.7678351743358767E-130)
            java.lang.Integer r5 = new java.lang.Integer     // Catch: java.lang.Throwable -> L5b
            r5.<init>(r10)     // Catch: java.lang.Throwable -> L5b
            java.lang.Integer r6 = new java.lang.Integer     // Catch: java.lang.Throwable -> L5b
            r6.<init>(r11)     // Catch: java.lang.Throwable -> L5b
            r3 = r8
            r4 = r9
            abcd.iy.we(r1, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L5b
        L18:
            int r0 = r8.v5(r9, r10, r11)     // Catch: java.lang.Throwable -> L5b
            int[] r1 = r8.FH     // Catch: java.lang.Throwable -> L5b
            int r1 = r1.length     // Catch: java.lang.Throwable -> L5b
            int r1 = r0 % r1
            int[] r2 = r8.FH     // Catch: java.lang.Throwable -> L5b
            int r2 = r2.length     // Catch: java.lang.Throwable -> L5b
            int r2 = r2 + (-2)
            int r0 = r0 % r2
            r2 = 1
            int r0 = r0 + r2
            int[] r3 = r8.FH     // Catch: java.lang.Throwable -> L5b
            r3 = r3[r1]     // Catch: java.lang.Throwable -> L5b
        L2d:
            r4 = 0
            if (r3 == 0) goto L5a
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r5) goto L5a
            int[] r5 = r8.j6     // Catch: java.lang.Throwable -> L5b
            r5 = r5[r3]     // Catch: java.lang.Throwable -> L5b
            if (r5 != r11) goto L50
            int r3 = r3 + 1
        L3c:
            if (r4 >= r11) goto L4f
            int[] r5 = r8.j6     // Catch: java.lang.Throwable -> L5b
            int r6 = r3 + 1
            r3 = r5[r3]     // Catch: java.lang.Throwable -> L5b
            int r5 = r10 + r4
            r5 = r9[r5]     // Catch: java.lang.Throwable -> L5b
            if (r3 == r5) goto L4b
            goto L50
        L4b:
            int r4 = r4 + 1
            r3 = r6
            goto L3c
        L4f:
            return r2
        L50:
            int r1 = r1 + r0
            int[] r3 = r8.FH     // Catch: java.lang.Throwable -> L5b
            int r3 = r3.length     // Catch: java.lang.Throwable -> L5b
            int r1 = r1 % r3
            int[] r3 = r8.FH     // Catch: java.lang.Throwable -> L5b
            r3 = r3[r1]     // Catch: java.lang.Throwable -> L5b
            goto L2d
        L5a:
            return r4
        L5b:
            r0 = move-exception
            boolean r1 = com.aide.codemodel.api.collections.MapOfIntArrayInt.EQ
            if (r1 == 0) goto L75
            r2 = 2665953759176881668(0x24ff5ed1b35af604, double:1.7678351743358767E-130)
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r10)
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r11)
            r1 = r0
            r4 = r8
            r5 = r9
            abcd.iy.U2(r1, r2, r4, r5, r6, r7)
        L75:
            goto L77
        L76:
            throw r0
        L77:
            goto L76
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.api.collections.MapOfIntArrayInt.DW(int[], int, int):boolean");
    }

    @ey(method = 2488767016468534275L)
    public int FH(int i, int[] iArr, int[] iArr2, int i2, int i3) {
        try {
            if (tp) {
                iy.J8(-2828003442192993537L, this, new Integer(i), iArr, iArr2, new Integer(i2), new Integer(i3));
            }
            int i4 = (i3 * 2) + 1;
            if (this.gn == null || this.gn.length <= i4) {
                this.gn = new int[i4];
            }
            this.gn[0] = i;
            System.arraycopy(iArr, i2, this.gn, 1, i3);
            System.arraycopy(iArr2, i2, this.gn, i3 + 1, i3);
            return Hw(this.gn, 0, i4);
        } catch (Throwable th) {
            if (EQ) {
                iy.lg(th, -2828003442192993537L, this, new Integer(i), iArr, iArr2, new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int[]] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    @ey(method = -33176895525012993L)
    public int Hw(int[] iArr, int i, int i2) {
        try {
            if (tp) {
                iy.we(-1716786471069664269L, this, iArr, new Integer(i), new Integer(i2));
            }
            int iV5 = v5(iArr, i, i2);
            int length = iV5 % this.FH.length;
            int length2 = (iV5 % (this.FH.length - 2)) + 1;
            int i3 = this.FH[length];
            while (i3 != 0 && i3 != Integer.MIN_VALUE) {
                if (this.j6[i3] == i2) {
                    int i4 = i3 + 1;
                    int i5 = 0;
                    while (i5 < i2) {
                        int i6 = i4 + 1;
                        if (this.j6[i4] != iArr[i + i5]) {
                            break;
                        }
                        i5++;
                        i4 = i6;
                    }
                    iArr = this.Hw[length];
                    return iArr;
                }
                length = (length + length2) % this.FH.length;
                i3 = this.FH[length];
            }
            return -1;
        } catch (Throwable th) {
            if (EQ) {
                iy.U2(th, -1716786471069664269L, this, iArr, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        r9.FH[r1] = r9.DW;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
    
        if (((r9.DW + r12) + 1) < r9.j6.length) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        r0 = new int[java.lang.Math.max((r9.j6.length + r12) + 1, (r9.j6.length * 2) + 1)];
        java.lang.System.arraycopy(r9.j6, 0, r0, 0, r9.j6.length);
        r9.j6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0090, code lost:
    
        r0 = r9.j6;
        r5 = r9.DW;
        r9.DW = r5 + 1;
        r0[r5] = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009a, code lost:
    
        if (r4 >= r12) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009c, code lost:
    
        r0 = r9.j6;
        r5 = r9.DW;
        r9.DW = r5 + 1;
        r0[r5] = r10[r11 + r4];
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ad, code lost:
    
        r9.Hw[r1] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b1, code lost:
    
        if (r2 == Integer.MIN_VALUE) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b3, code lost:
    
        r9.v5++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b9, code lost:
    
        r9.Zo++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c6, code lost:
    
        if ((r9.v5 * 2) <= r9.FH.length) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c8, code lost:
    
        gn();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cb, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        return;
     */
    @abcd.ey(method = -1028444996434371939L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void VH(int[] r10, int r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.api.collections.MapOfIntArrayInt.VH(int[], int, int, int):void");
    }

    @ey(method = 3812523561511268967L)
    public void Zo(int i, int[] iArr, int[] iArr2, int i2, int i3, int i4) {
        try {
            if (tp) {
                iy.QX(-635802111660573L, this, new Object[]{new Integer(i), iArr, iArr2, new Integer(i2), new Integer(i3), new Integer(i4)});
            }
            int i5 = (i3 * 2) + 1;
            if (this.gn == null || this.gn.length <= i5) {
                this.gn = new int[i5];
            }
            this.gn[0] = i;
            System.arraycopy(iArr, i2, this.gn, 1, i3);
            System.arraycopy(iArr2, i2, this.gn, i3 + 1, i3);
            VH(this.gn, 0, i5, i4);
        } catch (Throwable th) {
            if (EQ) {
                iy.rN(th, -635802111660573L, this, new Object[]{new Integer(i), iArr, iArr2, new Integer(i2), new Integer(i3), new Integer(i4)});
            }
            throw th;
        }
    }

    @ey(method = -349851894465480624L)
    public boolean j6(int i, int[] iArr, int[] iArr2, int i2, int i3) {
        try {
            if (tp) {
                iy.J8(5926346260535450600L, this, new Integer(i), iArr, iArr2, new Integer(i2), new Integer(i3));
            }
            int i4 = (i3 * 2) + 1;
            if (this.gn == null || this.gn.length <= i4) {
                this.gn = new int[i4];
            }
            this.gn[0] = i;
            System.arraycopy(iArr, i2, this.gn, 1, i3);
            System.arraycopy(iArr2, i2, this.gn, i3 + 1, i3);
            return DW(this.gn, 0, i4);
        } catch (Throwable th) {
            if (EQ) {
                iy.lg(th, 5926346260535450600L, this, new Integer(i), iArr, iArr2, new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 5712951365983900500L)
    public void store(StoreOutputStream storeOutputStream) {
        try {
            if (tp) {
                iy.tp(-7423424447459465236L, this, storeOutputStream);
            }
            storeOutputStream.writeInt(this.Zo);
            storeOutputStream.writeInt(this.v5);
            storeOutputStream.writeInt(this.VH);
            for (int i = 0; i < this.FH.length; i++) {
                storeOutputStream.writeInt(this.FH[i]);
            }
            for (int i2 = 0; i2 < this.Hw.length; i2++) {
                storeOutputStream.writeInt(this.Hw[i2]);
            }
            storeOutputStream.writeInt(this.DW);
            storeOutputStream.writeInt(this.j6.length);
            for (int i3 = 0; i3 < this.DW; i3++) {
                storeOutputStream.writeInt(this.j6[i3]);
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, -7423424447459465236L, this, storeOutputStream);
            }
            throw th;
        }
    }

    @ey(method = 3231336648389968760L)
    public String toString() {
        try {
            if (tp) {
                iy.gn(1890622685958199240L, this);
            }
            return getClass().getName() + "[Size=" + this.Zo + "]";
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, 1890622685958199240L, this);
            }
            throw th;
        }
    }

    @ey(method = -567255357972977940L)
    public MapOfIntArrayInt(StoreInputStream storeInputStream) {
        try {
            if (tp) {
                iy.tp(-2229565801241763432L, null, storeInputStream);
            }
            this.Zo = storeInputStream.readInt();
            this.v5 = storeInputStream.readInt();
            int i = storeInputStream.readInt();
            this.VH = i;
            this.FH = new int[u7[i]];
            for (int i2 = 0; i2 < this.FH.length; i2++) {
                this.FH[i2] = storeInputStream.readInt();
            }
            this.Hw = new int[u7[this.VH]];
            for (int i3 = 0; i3 < this.Hw.length; i3++) {
                this.Hw[i3] = storeInputStream.readInt();
            }
            this.DW = storeInputStream.readInt();
            this.j6 = new int[storeInputStream.readInt()];
            for (int i4 = 0; i4 < this.DW; i4++) {
                this.j6[i4] = storeInputStream.readInt();
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, -2229565801241763432L, null, storeInputStream);
            }
            throw th;
        }
    }
}
