package com.aide.engine;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import java.lang.reflect.Array;

@cy(clazz = 86643161135662827L, container = 86643161135662827L, user = true)
/* loaded from: classes.dex */
public class StyleSpan {

    @fy
    private static /* synthetic */ boolean DW;

    @gy
    private static /* synthetic */ boolean FH;

    @dy(field = -3125440392403647185L)
    private byte[][] spans;

    static {
        iy.Zo(StyleSpan.class);
    }

    @ey(method = -2264538670639702228L)
    public StyleSpan() {
        try {
            if (DW) {
                iy.gn(6569109565997957992L, null);
            }
            this.spans = (byte[][]) Array.newInstance((Class<?>) byte.class, 100, 5);
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, 6569109565997957992L, null);
            }
            throw th;
        }
    }

    @ey(method = -46299104196005680L)
    private int Hw(int i) {
        try {
            if (DW) {
                iy.u7(8247287251512644319L, this, i);
            }
            if (i >= this.spans.length) {
                return 0;
            }
            byte[] bArr = this.spans[i];
            if (bArr.length == 0) {
                return 0;
            }
            byte b = bArr[bArr.length - 1];
            for (int length = bArr.length - 2; length >= 0; length--) {
                if (bArr[length] != b) {
                    return length + 2;
                }
            }
            return 0;
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, 8247287251512644319L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 2012375522450652096L)
    private void VH(int i, int i2) {
        try {
            if (DW) {
                iy.EQ(-4076305448697781553L, this, new Integer(i), new Integer(i2));
            }
            int i3 = i + 2;
            if (this.spans.length <= i3) {
                return;
            }
            int i4 = i + 1;
            System.arraycopy(this.spans, i4, this.spans, i3, (this.spans.length - i) - 2);
            byte[] bArr = this.spans[i];
            byte[] bArr2 = new byte[bArr.length];
            this.spans[i4] = bArr2;
            if (bArr.length > i2) {
                byte b = bArr[i2];
                int i5 = 0;
                int i6 = i2;
                while (i6 < bArr.length) {
                    bArr2[i5] = bArr[i6];
                    bArr[i6] = b;
                    i6++;
                    i5++;
                }
            }
        } catch (Throwable th) {
            if (FH) {
                iy.Mr(th, -4076305448697781553L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 1621775776487089755L)
    private void Zo(int i, int i2, int i3) {
        int iHw;
        try {
            if (DW) {
                iy.we(-2449270981601921400L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            if (i3 != 0 && this.spans.length > i && (iHw = Hw(i)) > i2) {
                if (iHw - 1 == i2 && i2 > 0) {
                    DW(i, iHw + 1);
                    byte[] bArr = this.spans[i];
                    byte b = bArr[i2 - 1];
                    if (b == SyntaxStyleType.COMMENT.ordinal() + 1) {
                        bArr[i2] = b;
                        return;
                    }
                }
                DW(i, iHw + i3);
                byte[] bArr2 = this.spans[i];
                int i4 = i2 + i3;
                System.arraycopy(bArr2, i2, bArr2, i4, (bArr2.length - i2) - i3);
                byte b2 = i2 > 0 ? bArr2[i2 - 1] : (byte) 0;
                byte b3 = bArr2[i2];
                byte bOrdinal = b3 >= SyntaxStyleType.SCRIPT.ordinal() + 1 ? (byte) (SyntaxStyleType.SCRIPT.ordinal() + 1) : (byte) 0;
                if (b2 != b3 || b2 == SyntaxStyleType.OPERATOR.ordinal() + 1 || b2 == SyntaxStyleType.SEPARATOR.ordinal() + 1) {
                    b2 = bOrdinal;
                }
                for (int i5 = i2; i5 < i4; i5++) {
                    bArr2[i5] = b2;
                }
            }
        } catch (Throwable th) {
            if (FH) {
                iy.U2(th, -2449270981601921400L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 4345080317187822407L)
    public void DW(int i, int i2) {
        try {
            if (DW) {
                iy.EQ(-1700323982822110464L, this, new Integer(i), new Integer(i2));
            }
            FH(i);
            byte[] bArr = this.spans[i];
            if (bArr.length <= i2) {
                byte b = bArr[bArr.length - 1];
                int i3 = ((i2 * 5) / 4) + 1;
                byte[] bArr2 = new byte[i3];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.spans[i] = bArr2;
                for (int length = bArr.length; length < i3; length++) {
                    bArr2[length] = b;
                }
            }
        } catch (Throwable th) {
            if (FH) {
                iy.Mr(th, -1700323982822110464L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -648753766996557747L)
    public void EQ(int i, StyleSpan styleSpan, int i2) {
        try {
            if (DW) {
                iy.we(2959760420785071920L, this, new Integer(i), styleSpan, new Integer(i2));
            }
            if (styleSpan.spans.length <= i2) {
                return;
            }
            FH(i);
            int length = styleSpan.spans[i2].length;
            byte[] bArr = new byte[length];
            System.arraycopy(styleSpan.spans[i2], 0, bArr, 0, length);
            this.spans[i] = bArr;
        } catch (Throwable th) {
            if (FH) {
                iy.U2(th, 2959760420785071920L, this, new Integer(i), styleSpan, new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 754482066924305288L)
    public void FH(int i) {
        try {
            if (DW) {
                iy.u7(-1263917484823256991L, this, i);
            }
            if (this.spans.length <= i) {
                byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) byte.class, (i * 5) / 4, 5);
                System.arraycopy(this.spans, 0, bArr, 0, this.spans.length);
                this.spans = bArr;
            }
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, -1263917484823256991L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 1607272207097203192L)
    public byte getStyle(int i, int i2) {
        try {
            if (DW) {
                iy.EQ(1088747195166121255L, this, new Integer(i), new Integer(i2));
            }
            if (i >= this.spans.length) {
                return (byte) 0;
            }
            byte[] bArr = this.spans[i];
            return i2 >= bArr.length ? bArr[bArr.length - 1] : bArr[i2];
        } catch (Throwable th) {
            if (FH) {
                iy.Mr(th, 1088747195166121255L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -36111862589038367L)
    public void gn(byte b, int i, int i2, int i3, int i4) {
        int i5;
        try {
            if (DW) {
                iy.J8(5570115083346327700L, this, new Byte(b), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            if (i == i3) {
                DW(i3, i4 + 1);
                byte[] bArr = this.spans[i3];
                for (int i6 = i2; i6 <= i4; i6++) {
                    if (bArr[i6] >= SyntaxStyleType.SCRIPT.ordinal() + 1) {
                        bArr[i6] = (byte) (SyntaxStyleType.values().length + b);
                    } else {
                        bArr[i6] = b;
                    }
                }
                return;
            }
            DW(i, i2 + 1);
            DW(i3, i4 + 1);
            byte[] bArr2 = this.spans[i];
            for (int i7 = i2; i7 < bArr2.length; i7++) {
                if (bArr2[i7] >= SyntaxStyleType.SCRIPT.ordinal() + 1) {
                    bArr2[i7] = (byte) (SyntaxStyleType.values().length + b);
                } else {
                    bArr2[i7] = b;
                }
            }
            int i8 = i + 1;
            while (true) {
                i5 = 0;
                if (i8 >= i3) {
                    break;
                }
                byte[] bArr3 = this.spans[i8];
                while (i5 < bArr3.length) {
                    if (bArr3[i5] >= SyntaxStyleType.SCRIPT.ordinal() + 1) {
                        bArr3[i5] = (byte) (SyntaxStyleType.values().length + b);
                    } else {
                        bArr3[i5] = b;
                    }
                    i5++;
                }
                i8++;
            }
            byte[] bArr4 = this.spans[i3];
            while (i5 <= i4) {
                if (bArr4[i5] >= SyntaxStyleType.SCRIPT.ordinal() + 1) {
                    bArr4[i5] = (byte) (SyntaxStyleType.values().length + b);
                } else {
                    bArr4[i5] = b;
                }
                i5++;
            }
        } catch (Throwable th) {
            if (FH) {
                iy.lg(th, 5570115083346327700L, this, new Byte(b), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = 1386305777658777828L)
    public void insertSpan(int i, int i2, int i3, int i4) {
        try {
            if (DW) {
                iy.J0(-1675067388582708999L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            if (i == i3) {
                Zo(i, i2, (i4 - i2) + 1);
                return;
            }
            for (int i5 = i; i5 < i3; i5++) {
                VH(i, i2);
            }
            Zo(i3, 0, i4 + 1);
        } catch (Throwable th) {
            if (FH) {
                iy.a8(th, -1675067388582708999L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = -2989013991175446689L)
    public void j6() {
        try {
            if (DW) {
                iy.gn(2280343542653472000L, this);
            }
            for (int i = 0; i < this.spans.length; i++) {
                byte[] bArr = this.spans[i];
                for (int i2 = 0; i2 < bArr.length; i2++) {
                    bArr[i2] = 0;
                }
            }
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, 2280343542653472000L, this);
            }
            throw th;
        }
    }

    @ey(method = -245358661042854307L)
    public void removeSpan(int i, int i2, int i3, int i4) {
        try {
            if (DW) {
                iy.J0(1096984178575092096L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            if (i == i3) {
                if (i < this.spans.length) {
                    byte[] bArr = this.spans[i];
                    int i5 = i4 + 1;
                    if (i5 < bArr.length) {
                        System.arraycopy(bArr, i5, bArr, i2, (bArr.length - i4) - 1);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i3 < this.spans.length) {
                DW(i, Hw(i) + Hw(i3));
                byte[] bArr2 = this.spans[i];
                byte[] bArr3 = this.spans[i3];
                int i6 = i4 + 1;
                for (int i7 = i2; i6 < bArr3.length && i7 < bArr2.length; i7++) {
                    bArr2[i7] = bArr3[i6];
                    i6++;
                }
            }
            int i8 = i3 + 1;
            if (i8 < this.spans.length) {
                System.arraycopy(this.spans, i8, this.spans, i + 1, (this.spans.length - i3) - 2);
                int i9 = i3 - i;
                for (int i10 = 0; i10 < i9; i10++) {
                    this.spans[(this.spans.length - i10) - 1] = new byte[5];
                }
            }
        } catch (Throwable th) {
            if (FH) {
                iy.a8(th, 1096984178575092096L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = 1215090291481613608L)
    public void we(SyntaxStyleType[] syntaxStyleTypeArr, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i) {
        try {
            if (DW) {
                iy.QX(-644325777124863017L, this, new Object[]{syntaxStyleTypeArr, iArr, iArr2, iArr3, iArr4, new Integer(i)});
            }
            j6();
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (syntaxStyleTypeArr[i2] != null) {
                    gn((byte) syntaxStyleTypeArr[i2].ordinal(), iArr[i2] - 1, iArr2[i2] - 1, iArr3[i2] - 1, iArr4[i2] - 2);
                }
            }
        } catch (Throwable th) {
            if (FH) {
                iy.rN(th, -644325777124863017L, this, new Object[]{syntaxStyleTypeArr, iArr, iArr2, iArr3, iArr4, new Integer(i)});
            }
            throw th;
        }
    }
}
