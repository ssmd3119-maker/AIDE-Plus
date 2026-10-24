package com.aide.codemodel.api;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import java.io.Reader;

@cy(clazz = 3029094188873400095L, container = 3029094188873400095L, user = true)
/* loaded from: classes.dex */
public final class PositionalReader extends Reader {

    @gy
    private static /* synthetic */ boolean Q6;

    @fy
    private static /* synthetic */ boolean n5;

    @dy(field = -1747669195909045504L)
    private int AL;

    @dy(field = 1223981471092438224L)
    private Reader WB;

    @dy(field = -4169784818957103495L)
    private boolean Z1;

    @dy(field = -7378995248337726376L)
    private int cT;

    @dy(field = -4339679485673802368L)
    private int fY;

    @dy(field = 20759376291682560L)
    private int hK;

    @dy(field = -4057650634066717695L)
    private int jw;

    @dy(field = 2133767135118013304L)
    private int k2;

    @dy(field = 1791917173016709680L)
    private char[] mb;

    @dy(field = 40755095542000200L)
    private int q7;

    @dy(field = 2129210516147708133L)
    private int qp;

    @dy(field = -3901488013810570605L)
    private int w9;

    @dy(field = 3277389036248364532L)
    private int zh;

    static {
        iy.Zo(PositionalReader.class);
    }

    @ey(method = -2462510076258371200L)
    public PositionalReader() {
        try {
            if (n5) {
                iy.gn(3033754888632851289L, null);
            }
            this.mb = new char[16384];
            this.zh = 1;
            this.AL = 1;
            this.w9 = -1;
            this.hK = -1;
        } catch (Throwable th) {
            if (Q6) {
                iy.aM(th, 3033754888632851289L, null);
            }
            throw th;
        }
    }

    @ey(method = 2757400930519688256L)
    private void DW() {
        int i;
        try {
            if (n5) {
                iy.gn(-871699983253226772L, this);
            }
            if (this.jw + 10 >= this.mb.length) {
                if (this.qp > 10) {
                    System.arraycopy(this.mb, this.qp, this.mb, 0, this.jw - this.qp);
                    this.jw -= this.qp;
                    this.fY -= this.qp;
                    this.w9 -= this.qp;
                    this.qp = 0;
                } else {
                    char[] cArr = new char[this.mb.length * 2];
                    System.arraycopy(this.mb, 0, cArr, 0, this.jw);
                    this.mb = cArr;
                }
            }
            do {
                i = this.WB.read(this.mb, this.jw, (this.mb.length - this.jw) - 10);
            } while (i == 0);
            if (i < 0) {
                this.Z1 = true;
            } else {
                this.jw += i;
            }
        } catch (Throwable th) {
            if (Q6) {
                iy.aM(th, -871699983253226772L, this);
            }
            throw th;
        }
    }

    @ey(method = -2334286517715510193L)
    private void j6(int i, boolean z) {
        try {
            if (n5) {
                iy.EQ(-3395974040566592215L, this, new Integer(i), new Boolean(z));
            }
            if (i < this.k2) {
                throw new IllegalArgumentException("getLine(), getColumn() must be called for monotonically increasing values");
            }
            if ((this.qp + i) - this.k2 == this.jw + 1) {
                i--;
            }
            if ((this.qp + i) - this.k2 > this.jw) {
                throw new IllegalArgumentException("Trying to advance to position not yet read");
            }
            int i2 = this.qp;
            int i3 = this.k2;
            while (i3 < i) {
                int i4 = i2 + 1;
                char c = this.mb[i2];
                if (c != '\n') {
                    if (c == 65534) {
                        int i5 = i4 + 7;
                        if (i5 >= this.jw) {
                            throw new RuntimeException("Incomplete buffer while reading position");
                        }
                        this.zh = (this.mb[i4] << 24) | (this.mb[i4 + 1] << 16) | (this.mb[i4 + 2] << '\b') | this.mb[i4 + 3];
                        this.AL = this.mb[i5] | (this.mb[i4 + 4] << 24) | (this.mb[i4 + 5] << 16) | (this.mb[i4 + 6] << '\b');
                        i4 += 8;
                        i3--;
                    } else if (this.zh > 0) {
                        this.AL++;
                    }
                } else if (this.zh > 0) {
                    this.zh++;
                    this.AL = 1;
                }
                i2 = i4;
                i3++;
            }
            this.k2 = i;
            this.qp = i2;
            if (!z || this.hK == i) {
                return;
            }
            this.hK = i;
            this.cT = this.zh;
            this.q7 = this.AL;
            this.w9 = i2;
            while (true) {
                if (this.w9 >= this.jw) {
                    if (this.Z1) {
                        return;
                    }
                    DW();
                    if (this.Z1) {
                        return;
                    }
                }
                if (this.mb[this.w9] != 65534) {
                    return;
                }
                int i6 = this.w9 + 1;
                this.w9 = i6;
                if (i6 + 7 >= this.jw) {
                    throw new RuntimeException("Incomplete buffer while reading position");
                }
                this.cT = (this.mb[i6] << 24) | (this.mb[i6 + 1] << 16) | (this.mb[i6 + 2] << '\b') | this.mb[i6 + 3];
                this.q7 = (this.mb[i6 + 4] << 24) | (this.mb[i6 + 5] << 16) | (this.mb[i6 + 6] << '\b') | this.mb[i6 + 7];
                this.w9 = i6 + 8;
            }
        } finally {
        }
    }

    @ey(method = -171582727494034800L)
    public int FH(int i, boolean z) {
        try {
            if (n5) {
                iy.EQ(1046429192824092328L, this, new Integer(i), new Boolean(z));
            }
            j6(i, z);
            return z ? this.q7 : this.AL;
        } catch (Throwable th) {
            if (Q6) {
                iy.Mr(th, 1046429192824092328L, this, new Integer(i), new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 632334610241590100L)
    public int Hw(int i, boolean z) {
        try {
            if (n5) {
                iy.EQ(2540021048482679160L, this, new Integer(i), new Boolean(z));
            }
            j6(i, z);
            return z ? this.cT : this.zh;
        } catch (Throwable th) {
            if (Q6) {
                iy.Mr(th, 2540021048482679160L, this, new Integer(i), new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 1309598593683765825L)
    public void Zo(Reader reader) {
        try {
            if (n5) {
                iy.tp(483606290191106647L, this, reader);
            }
            this.WB = reader;
            this.jw = 0;
            this.fY = 0;
            this.qp = 0;
            this.k2 = 0;
            this.zh = 1;
            this.AL = 1;
            this.hK = -1;
            this.Z1 = false;
        } catch (Throwable th) {
            if (Q6) {
                iy.j3(th, 483606290191106647L, this, reader);
            }
            throw th;
        }
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    @ey(method = 336303003257328160L)
    public void close() {
        try {
            if (n5) {
                iy.gn(-1680727992679029448L, this);
            }
            this.WB = null;
        } catch (Throwable th) {
            if (Q6) {
                iy.aM(th, -1680727992679029448L, this);
            }
            throw th;
        }
    }

    @ey(method = 3144136000406091327L)
    public void gn() {
        try {
            if (n5) {
                iy.gn(6603622254896705L, this);
            }
            this.zh = 0;
            this.AL = 0;
        } catch (Throwable th) {
            if (Q6) {
                iy.aM(th, 6603622254896705L, this);
            }
            throw th;
        }
    }

    @Override // java.io.Reader
    @ey(method = -143076910430328740L)
    public int read(char[] cArr, int i, int i2) {
        try {
            if (n5) {
                iy.we(7073394677899606328L, this, cArr, new Integer(i), new Integer(i2));
            }
            if (this.Z1) {
                return -1;
            }
            if (this.fY == this.jw) {
                DW();
                if (this.Z1) {
                    return -1;
                }
            }
            char[] cArr2 = this.mb;
            int i3 = this.fY;
            int iMin = this.fY + Math.min(this.jw - this.fY, i2);
            int i4 = i;
            while (i3 < iMin) {
                char c = cArr2[i3];
                if (c != 65534) {
                    cArr[i4] = c;
                    i4++;
                } else {
                    i3 += 8;
                    if (i3 >= this.jw) {
                        int i5 = (i3 - this.jw) + 1;
                        for (int i6 = 0; i6 < i5; i6++) {
                            int i7 = this.WB.read();
                            if (i7 < 0) {
                                throw new RuntimeException("EOF encountered while reading position");
                            }
                            int i8 = this.jw;
                            this.jw = i8 + 1;
                            cArr2[i8] = (char) i7;
                        }
                    }
                    if (i3 >= iMin) {
                        iMin = i3 + 1;
                    }
                }
                i3++;
            }
            this.fY = iMin;
            return i4 == i ? read(cArr, i, i2) : i4 - i;
        } catch (Throwable th) {
            if (Q6) {
                iy.U2(th, 7073394677899606328L, this, cArr, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }
}
