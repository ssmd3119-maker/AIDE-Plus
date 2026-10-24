package abcd;

import com.aide.codemodel.api.Model;
import java.io.CharArrayReader;
import java.io.Reader;

@cy(clazz = -852481163335970448L, container = -852481163335970448L, user = true)
/* loaded from: classes.dex */
public class m4 {

    @gy
    private static /* synthetic */ boolean Zo;

    @fy
    private static /* synthetic */ boolean v5;

    @dy(field = -1567882820142547216L)
    protected char[] DW;

    @dy(field = -1564011502060302592L)
    protected int FH;

    @dy(field = -5085882770732288448L)
    protected int Hw;

    @dy(field = -1163465277969364720L)
    private final Model j6;

    static {
        iy.Zo(m4.class);
    }

    @ey(method = 144908444520287427L)
    public m4(Model model) {
        try {
            if (v5) {
                iy.tp(1229876428548785625L, null, model);
            }
            this.DW = new char[100];
            this.FH = 0;
            this.Hw = 0;
            this.j6 = model;
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, 1229876428548785625L, null, model);
            }
            throw th;
        }
    }

    @ey(method = 6683053301011153143L)
    public void DW(m4 m4Var) {
        try {
            if (v5) {
                iy.tp(3944732640918947187L, this, m4Var);
            }
            EQ(m4Var.FH);
            System.arraycopy(m4Var.DW, 0, this.DW, this.FH, m4Var.FH);
            this.FH += m4Var.FH;
            this.Hw += m4Var.Hw;
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, 3944732640918947187L, this, m4Var);
            }
            throw th;
        }
    }

    @ey(method = 58544816190744289L)
    public final void EQ(int i) {
        try {
            if (v5) {
                iy.u7(-5255461686612134251L, this, i);
            }
            if (this.FH + i >= this.DW.length) {
                int length = this.DW.length;
                do {
                    length *= 2;
                } while (this.FH + i >= length);
                char[] cArr = new char[length];
                System.arraycopy(this.DW, 0, cArr, 0, this.FH);
                this.DW = cArr;
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, -5255461686612134251L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -1156472112590849655L)
    public void FH(m4 m4Var, int i, int i2) {
        try {
            if (v5) {
                iy.we(-715750175023512399L, this, m4Var, new Integer(i), new Integer(i2));
            }
            EQ(i2);
            System.arraycopy(m4Var.DW, i, this.DW, this.FH, i2);
            int i3 = this.FH + i2;
            int i4 = this.FH;
            while (i4 < i3) {
                if (this.DW[i4] == 65534) {
                    i4 += 8;
                } else {
                    this.Hw++;
                }
                i4++;
            }
            this.FH = i3;
        } catch (Throwable th) {
            if (Zo) {
                iy.U2(th, -715750175023512399L, this, m4Var, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 667900592760337668L)
    public void Hw(String str) {
        try {
            if (v5) {
                iy.tp(-103440080495285136L, this, str);
            }
            EQ(str.length());
            for (int i = 0; i < str.length(); i++) {
                char[] cArr = this.DW;
                int i2 = this.FH;
                this.FH = i2 + 1;
                cArr[i2] = str.charAt(i);
                this.Hw++;
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, -103440080495285136L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -3350303794289219085L)
    public Reader J0() {
        try {
            if (v5) {
                iy.gn(-216273785863105581L, this);
            }
            return new CharArrayReader(this.DW, 0, this.FH);
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, -216273785863105581L, this);
            }
            throw th;
        }
    }

    @ey(method = 1960627690676954675L)
    public boolean J8(String str, int i) {
        try {
            if (v5) {
                iy.EQ(1441655871692487527L, this, str, new Integer(i));
            }
            if (str.length() + i > this.FH) {
                return false;
            }
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (this.DW[i + i2] != str.charAt(i2)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (Zo) {
                iy.Mr(th, 1441655871692487527L, this, str, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 1801298388760344576L)
    public int QX() {
        try {
            if (v5) {
                iy.gn(2220572928664209460L, this);
            }
            return this.FH;
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, 2220572928664209460L, this);
            }
            throw th;
        }
    }

    @ey(method = 598453259733632000L)
    public void VH() {
        try {
            if (v5) {
                iy.gn(25152940034563500L, this);
            }
            gn(0, 0);
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, 25152940034563500L, this);
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        r3 = r3 + 1;
     */
    @abcd.ey(method = 817080341066184287L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int Ws(java.lang.String r8) {
        /*
            r7 = this;
            r0 = -582745585163359761(0xf7e9abfa51e929ef, double:-4.2382079309258894E269)
            boolean r2 = abcd.m4.v5     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto Lc
            abcd.iy.tp(r0, r7, r8)     // Catch: java.lang.Throwable -> L33
        Lc:
            r2 = 0
            r3 = 0
        Le:
            int r4 = r7.FH     // Catch: java.lang.Throwable -> L33
            int r5 = r8.length()     // Catch: java.lang.Throwable -> L33
            int r4 = r4 - r5
            if (r3 > r4) goto L31
            r4 = 0
        L18:
            int r5 = r8.length()     // Catch: java.lang.Throwable -> L33
            if (r4 >= r5) goto L30
            char[] r5 = r7.DW     // Catch: java.lang.Throwable -> L33
            int r6 = r3 + r4
            char r5 = r5[r6]     // Catch: java.lang.Throwable -> L33
            char r6 = r8.charAt(r4)     // Catch: java.lang.Throwable -> L33
            if (r5 == r6) goto L2d
            int r3 = r3 + 1
            goto Le
        L2d:
            int r4 = r4 + 1
            goto L18
        L30:
            return r3
        L31:
            r8 = -1
            return r8
        L33:
            r2 = move-exception
            boolean r3 = abcd.m4.Zo
            if (r3 == 0) goto L3b
            abcd.iy.j3(r2, r0, r7, r8)
        L3b:
            goto L3d
        L3c:
            throw r2
        L3d:
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.m4.Ws(java.lang.String):int");
    }

    @ey(method = -2347761779818143923L)
    public void XL() {
        try {
            if (v5) {
                iy.gn(4257971017659738489L, this);
            }
            int i = 0;
            while (i < this.FH) {
                char c = this.DW[i];
                if (c == 65534) {
                    i += 8;
                } else {
                    this.DW[i] = Character.toUpperCase(c);
                }
                i++;
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, 4257971017659738489L, this);
            }
            throw th;
        }
    }

    @ey(method = -2674664337026788028L)
    public void Zo(int i) {
        try {
            if (v5) {
                iy.u7(265524541951657952L, this, i);
            }
            int iTp = this.j6.identifierSpace.tp(i);
            EQ(iTp);
            this.j6.identifierSpace.Zo(i, this.DW, this.FH);
            this.FH += iTp;
            this.Hw += iTp;
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, 265524541951657952L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -3119646504898390425L)
    public void gn(int i, int i2) {
        try {
            if (v5) {
                iy.EQ(2302798679034330499L, this, new Integer(i), new Integer(i2));
            }
            EQ(9);
            char[] cArr = this.DW;
            int i3 = this.FH;
            int i4 = i3 + 1;
            this.FH = i4;
            cArr[i3] = 65534;
            char[] cArr2 = this.DW;
            int i5 = i4 + 1;
            this.FH = i5;
            cArr2[i4] = (char) ((i >>> 24) & 255);
            char[] cArr3 = this.DW;
            int i6 = i5 + 1;
            this.FH = i6;
            cArr3[i5] = (char) ((i >>> 16) & 255);
            char[] cArr4 = this.DW;
            int i7 = i6 + 1;
            this.FH = i7;
            cArr4[i6] = (char) ((i >>> 8) & 255);
            char[] cArr5 = this.DW;
            int i8 = i7 + 1;
            this.FH = i8;
            cArr5[i7] = (char) ((i >>> 0) & 255);
            char[] cArr6 = this.DW;
            int i9 = i8 + 1;
            this.FH = i9;
            cArr6[i8] = (char) ((i2 >>> 24) & 255);
            char[] cArr7 = this.DW;
            int i10 = i9 + 1;
            this.FH = i10;
            cArr7[i9] = (char) ((i2 >>> 16) & 255);
            char[] cArr8 = this.DW;
            int i11 = i10 + 1;
            this.FH = i11;
            cArr8[i10] = (char) ((i2 >>> 8) & 255);
            char[] cArr9 = this.DW;
            this.FH = i11 + 1;
            cArr9[i11] = (char) ((i2 >>> 0) & 255);
        } catch (Throwable th) {
            if (Zo) {
                iy.Mr(th, 2302798679034330499L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 299246631378341965L)
    public void j6(char c) {
        try {
            if (v5) {
                iy.tp(4794298806826596921L, this, new Character(c));
            }
            EQ(1);
            char[] cArr = this.DW;
            int i = this.FH;
            this.FH = i + 1;
            cArr[i] = c;
            this.Hw++;
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, 4794298806826596921L, this, new Character(c));
            }
            throw th;
        }
    }

    @ey(method = 3099134231820431920L)
    public String toString() {
        try {
            if (v5) {
                iy.gn(-2266833613108730400L, this);
            }
            StringBuffer stringBuffer = new StringBuffer(this.FH);
            int i = 0;
            while (i < this.FH) {
                char c = this.DW[i];
                if (c == 65534) {
                    int i2 = i + 1;
                    stringBuffer.append("#[");
                    int i3 = (this.DW[i2] << 24) | (this.DW[i2 + 1] << 16) | (this.DW[i2 + 2] << '\b') | this.DW[i2 + 3];
                    int i4 = (this.DW[i2 + 4] << 24) | (this.DW[i2 + 5] << 16) | (this.DW[i2 + 6] << '\b');
                    i = i2 + 7;
                    int i5 = i4 | this.DW[i];
                    stringBuffer.append(i3);
                    stringBuffer.append(", ");
                    stringBuffer.append(i5);
                    stringBuffer.append("]");
                } else {
                    stringBuffer.append(c);
                }
                i++;
            }
            return stringBuffer.toString();
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, -2266833613108730400L, this);
            }
            throw th;
        }
    }

    @ey(method = -6792004330688031725L)
    public int tp() {
        try {
            if (v5) {
                iy.gn(-4041256069273710253L, this);
            }
            return this.j6.identifierSpace.v5(this.DW, 0, this.FH);
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, -4041256069273710253L, this);
            }
            throw th;
        }
    }

    @ey(method = -1270508210132579477L)
    public void u7() {
        try {
            if (v5) {
                iy.gn(1135715074626110139L, this);
            }
            this.FH = 0;
            this.Hw = 0;
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, 1135715074626110139L, this);
            }
            throw th;
        }
    }

    @ey(method = -1341171671390830636L)
    public void v5(char[] cArr, int i, int i2) {
        try {
            if (v5) {
                iy.we(190738705975047104L, this, cArr, new Integer(i), new Integer(i2));
            }
            EQ(i2);
            int i3 = i + i2;
            for (int i4 = i; i4 < i3; i4++) {
                char[] cArr2 = this.DW;
                int i5 = this.FH;
                this.FH = i5 + 1;
                cArr2[i5] = cArr[i4];
                this.Hw++;
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.U2(th, 190738705975047104L, this, cArr, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 1303215103948909376L)
    public boolean we(String str) {
        try {
            if (v5) {
                iy.tp(-95016601307592300L, this, str);
            }
            if (str.length() != this.FH) {
                return false;
            }
            for (int i = 0; i < this.FH; i++) {
                if (this.DW[i] != str.charAt(i)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, -95016601307592300L, this, str);
            }
            throw th;
        }
    }
}
