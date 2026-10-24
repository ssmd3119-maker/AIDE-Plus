package com.aide.codemodel.api;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;

@cy(clazz = -2092753086169783275L, container = -2092753086169783275L, user = true)
/* loaded from: classes.dex */
public final class SyntaxTreeStyles {

    @gy
    private static /* synthetic */ boolean EQ;

    @fy
    private static /* synthetic */ boolean tp;

    @dy(field = 2534651742652025304L)
    public int[] DW;

    @dy(field = -3424940849955908096L)
    public char[] VH;

    @dy(field = 237337550087479920L)
    public int[] endColumns;

    @dy(field = 2406868240619595888L)
    public int[] endLines;

    @dy(field = -490762255481624631L)
    public int gn;

    @dy(field = 3173779708069781999L)
    public int size;

    @dy(field = -464103750735689745L)
    public int[] startColumns;

    @dy(field = 2595473407374937943L)
    public int[] startLines;

    @dy(field = -2464548752273936280L)
    public int[] syntaxTags;

    static {
        iy.Zo(SyntaxTreeStyles.class);
    }

    @ey(method = -2628753759629747361L)
    public SyntaxTreeStyles() {
        try {
            if (tp) {
                iy.gn(81724473711662424L, null);
            }
            this.syntaxTags = new int[10000];
            this.DW = new int[10000];
            this.startLines = new int[10000];
            this.endLines = new int[10000];
            this.startColumns = new int[10000];
            this.endColumns = new int[10000];
            this.VH = new char[1000];
            this.gn = 1;
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, 81724473711662424L, null);
            }
            throw th;
        }
    }

    @ey(method = 358001782829863424L)
    public void DW() {
        try {
            if (tp) {
                iy.gn(347892484435237000L, this);
            }
            this.size = 0;
            this.gn = 1;
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, 347892484435237000L, this);
            }
            throw th;
        }
    }

    @ey(method = 1685533003392600376L)
    public int FH(char[] cArr, int i, int i2) {
        try {
            if (tp) {
                iy.we(-1458680118336398608L, this, cArr, new Integer(i), new Integer(i2));
            }
            if (this.gn + i2 + 1 >= this.VH.length) {
                char[] cArr2 = new char[Math.max((this.VH.length * 2) + 1, this.gn + i2 + 1)];
                System.arraycopy(this.VH, 0, cArr2, 0, this.VH.length);
                this.VH = cArr2;
            }
            int i3 = this.gn;
            char[] cArr3 = this.VH;
            int i4 = this.gn;
            int i5 = i4 + 1;
            this.gn = i5;
            cArr3[i4] = (char) i2;
            System.arraycopy(cArr, i, this.VH, i5, i2);
            this.gn += i2;
            return i3;
        } catch (Throwable th) {
            if (EQ) {
                iy.U2(th, -1458680118336398608L, this, cArr, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 2451327804590191555L)
    public void Hw(int i) {
        try {
            if (tp) {
                iy.u7(553389122902284791L, this, i);
            }
            int length = this.syntaxTags.length;
            if (i >= length) {
                while (i >= length) {
                    length = this.syntaxTags.length * 2;
                }
                int[] iArr = new int[length];
                System.arraycopy(this.syntaxTags, 0, iArr, 0, this.syntaxTags.length);
                this.syntaxTags = iArr;
                int[] iArr2 = new int[length];
                System.arraycopy(this.DW, 0, iArr2, 0, this.DW.length);
                this.DW = iArr2;
                int[] iArr3 = new int[length];
                System.arraycopy(this.startLines, 0, iArr3, 0, this.startLines.length);
                this.startLines = iArr3;
                int[] iArr4 = new int[length];
                System.arraycopy(this.startColumns, 0, iArr4, 0, this.startColumns.length);
                this.startColumns = iArr4;
                int[] iArr5 = new int[length];
                System.arraycopy(this.endLines, 0, iArr5, 0, this.endLines.length);
                this.endLines = iArr5;
                int[] iArr6 = new int[length];
                System.arraycopy(this.endColumns, 0, iArr6, 0, this.endColumns.length);
                this.endColumns = iArr6;
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, 553389122902284791L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -1203787953914671112L)
    public String VH(int i) {
        try {
            if (tp) {
                iy.u7(5367050059670448912L, this, i);
            }
            return new String(this.VH, Zo(i), v5(i));
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, 5367050059670448912L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 255256113002648576L)
    public int Zo(int i) {
        try {
            if (tp) {
                iy.u7(-613108329232434912L, this, i);
            }
            return i + 1;
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, -613108329232434912L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -232406909981477356L)
    public void j6(int i, int i2, int i3, int i4, int i5, int i6) {
        try {
            if (tp) {
                iy.QX(2792690499386444560L, this, new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
            }
            int i7 = this.size;
            Hw(i7 + 1);
            this.syntaxTags[i7] = i;
            this.DW[i7] = i2;
            this.startLines[i7] = i3;
            this.startColumns[i7] = i4;
            this.endLines[i7] = i5;
            this.endColumns[i7] = i6;
            this.size++;
        } catch (Throwable th) {
            if (EQ) {
                iy.rN(th, 2792690499386444560L, this, new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
            }
            throw th;
        }
    }

    @ey(method = 243479259175436592L)
    public int v5(int i) {
        try {
            if (tp) {
                iy.u7(-625053990202362900L, this, i);
            }
            return this.VH[i];
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, -625053990202362900L, this, new Integer(i));
            }
            throw th;
        }
    }
}
