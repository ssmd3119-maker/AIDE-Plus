package com.aide.ui.views.editor;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;

@cy(clazz = -1387074681965109305L, container = -1387074681965109305L, user = true)
/* loaded from: classes.dex */
public class TextBuffer {

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = -1956739901776658388L)
    protected int DW;

    @dy(field = -1959384356968685160L)
    protected char[] j6;

    static {
        iy.Zo(TextBuffer.class);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @ey(method = -3234523648113087092L)
    public TextBuffer() {
        this(8);
        try {
            if (FH) {
                iy.gn(-1213807812719345060L, null);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -1213807812719345060L, null);
            }
            throw th;
        }
    }

    @ey(method = -124752135297276528L)
    public char DW(int i) {
        try {
            if (FH) {
                iy.u7(323405128204145712L, this, i);
            }
            return this.j6[i];
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 323405128204145712L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 1352549333408226129L)
    public void EQ(char[] cArr, int i) {
        try {
            if (FH) {
                iy.EQ(-837988466895852867L, this, cArr, new Integer(i));
            }
            FH(cArr.length + i);
            if (i > this.DW) {
                for (int i2 = this.DW; i2 < i; i2++) {
                    this.j6[i2] = ' ';
                }
            }
            if (cArr.length + i > this.DW) {
                this.DW = cArr.length + i;
            }
            for (int i3 = 0; i3 < cArr.length; i3++) {
                this.j6[i + i3] = cArr[i3];
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -837988466895852867L, this, cArr, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 731962299301213128L)
    protected void FH(int i) {
        try {
            if (FH) {
                iy.u7(-721263249276454520L, this, i);
            }
            int length = this.j6.length;
            if (length == 0) {
                length = 1;
            }
            while (length < i) {
                length *= 2;
            }
            if (length != this.j6.length) {
                char[] cArr = new char[length];
                System.arraycopy(this.j6, 0, cArr, 0, this.j6.length);
                this.j6 = cArr;
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -721263249276454520L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 459567826997307912L)
    public void Hw(int i, int i2, char[] cArr, int i3) {
        try {
            if (FH) {
                iy.J0(315531791291037808L, this, new Integer(i), new Integer(i2), cArr, new Integer(i3));
            }
            System.arraycopy(this.j6, i, cArr, i3, i2);
        } catch (Throwable th) {
            if (Hw) {
                iy.a8(th, 315531791291037808L, this, new Integer(i), new Integer(i2), cArr, new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 1247548531626430425L)
    public int J0() {
        try {
            if (FH) {
                iy.gn(-1180819762823701691L, this);
            }
            return this.DW;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -1180819762823701691L, this);
            }
            throw th;
        }
    }

    @ey(method = 4442709740692535444L)
    public void VH(char[] cArr, int i) {
        try {
            if (FH) {
                iy.EQ(2101052007481125120L, this, cArr, new Integer(i));
            }
            if (i >= this.DW) {
                EQ(cArr, i);
                return;
            }
            FH(this.DW + cArr.length);
            System.arraycopy(this.j6, i, this.j6, cArr.length + i, this.DW - i);
            System.arraycopy(cArr, 0, this.j6, i, cArr.length);
            this.DW += cArr.length;
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 2101052007481125120L, this, cArr, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -4086056952028583520L)
    public void Zo(char c, int i) {
        try {
            if (FH) {
                iy.EQ(-1311648763299673968L, this, new Character(c), new Integer(i));
            }
            if (i >= this.DW) {
                tp(c, i);
                return;
            }
            FH(this.DW + 1);
            System.arraycopy(this.j6, i, this.j6, i + 1, this.DW - i);
            this.j6[i] = c;
            this.DW++;
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -1311648763299673968L, this, new Character(c), new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -3785451009388181140L)
    public void gn(int i) {
        try {
            if (FH) {
                iy.u7(-3293931018734763200L, this, i);
            }
            System.arraycopy(this.j6, i + 1, this.j6, i, (this.j6.length - i) - 1);
            this.DW--;
            we();
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -3293931018734763200L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 361967082420023848L)
    public void j6(char[] cArr) {
        try {
            if (FH) {
                iy.tp(-82934643534134616L, this, cArr);
            }
            FH(this.DW + cArr.length);
            for (int i = 0; i < cArr.length; i++) {
                this.j6[this.DW + i] = cArr[i];
            }
            this.DW += cArr.length;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -82934643534134616L, this, cArr);
            }
            throw th;
        }
    }

    @ey(method = 1204947273498699645L)
    public void tp(char c, int i) {
        try {
            if (FH) {
                iy.EQ(-957859015917768843L, this, new Character(c), new Integer(i));
            }
            int i2 = i + 1;
            FH(i2);
            if (i == this.DW) {
                this.DW = i2;
            } else if (i > this.DW) {
                for (int i3 = this.DW; i3 < i; i3++) {
                    this.j6[i3] = ' ';
                }
                this.DW = i2;
            }
            this.j6[i] = c;
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -957859015917768843L, this, new Character(c), new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 3528362942474277676L)
    public void u7(int i, int i2) {
        try {
            if (FH) {
                iy.EQ(1280316356218634784L, this, new Integer(i), new Integer(i2));
            }
            int i3 = i2 + i;
            if (i3 <= this.DW) {
                System.arraycopy(this.j6, i3, this.j6, i2, (this.j6.length - i2) - i);
                this.DW -= i;
                we();
                return;
            }
            throw new ArrayIndexOutOfBoundsException("Trying to remove " + i + " characters at position " + i2 + " from a line containing " + this.DW + " characters");
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 1280316356218634784L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -1404723648088250251L)
    public char[] v5() {
        try {
            if (FH) {
                iy.gn(2307418730626148425L, this);
            }
            char[] cArr = new char[this.DW];
            Hw(0, this.DW, cArr, 0);
            return cArr;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 2307418730626148425L, this);
            }
            throw th;
        }
    }

    @ey(method = -889702160574492915L)
    protected void we() {
        try {
            if (FH) {
                iy.gn(-1205030465657484831L, this);
            }
            int length = this.j6.length;
            while (length > 8 && this.DW < length / 4) {
                length /= 2;
                if (length < 8) {
                    length = 8;
                }
            }
            if (length == this.j6.length) {
                return;
            }
            char[] cArr = new char[length];
            System.arraycopy(this.j6, 0, cArr, 0, this.DW);
            this.j6 = cArr;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -1205030465657484831L, this);
            }
            throw th;
        }
    }

    @ey(method = 148479439339798965L)
    public TextBuffer(int i) {
        try {
            if (FH) {
                iy.u7(2602481444527372197L, null, i);
            }
            this.j6 = new char[i];
            this.DW = 0;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 2602481444527372197L, null, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 1955306806711584L)
    public TextBuffer(char[] cArr) {
        try {
            if (FH) {
                iy.tp(-3395930771742966880L, null, cArr);
            }
            this.j6 = cArr;
            this.DW = cArr.length;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -3395930771742966880L, null, cArr);
            }
            throw th;
        }
    }
}
