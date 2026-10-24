package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class mg0 {
    private final int DW;
    private int EQ;
    private final int FH;
    private final int Hw;
    private int Mr;
    private int VH;
    private int XL;
    private final short[] Zo;
    private int a8;
    private int aM;
    private short[] gn;
    private int j3;
    private final int j6;
    private int lg;
    private int rN;
    private short[] tp;
    private int u7;
    private final int v5;
    private short[] we;
    private int J0 = 0;
    private int J8 = 0;
    private int U2 = 0;
    private float Ws = 1.0f;
    private float QX = 1.0f;

    public mg0(int i, int i2) {
        this.j6 = i;
        this.DW = i2;
        this.FH = i / 400;
        int i3 = i / 65;
        this.Hw = i3;
        int i4 = i3 * 2;
        this.v5 = i4;
        this.Zo = new short[i4];
        this.VH = i4;
        this.gn = new short[i4 * i2];
        this.u7 = i4;
        this.tp = new short[i4 * i2];
        this.EQ = i4;
        this.we = new short[i4 * i2];
    }

    private final int DW(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.DW;
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                short s = sArr[i4 + i10];
                short s2 = sArr[i4 + i2 + i10];
                i9 += s >= s2 ? s - s2 : s2 - s;
            }
            if (i9 * i7 < i5 * i2) {
                i7 = i2;
                i5 = i9;
            }
            if (i9 * i6 > i8 * i2) {
                i6 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.lg = i5 / i7;
        this.rN = i8 / i6;
        return i7;
    }

    private final void EQ() {
        int iDW;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.aM;
        float f = this.Ws / this.QX;
        double d = f;
        int i7 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i8 = this.XL;
            if (i8 >= this.v5) {
                int i9 = 0;
                while (true) {
                    int i10 = this.Mr;
                    if (i10 > 0) {
                        int iMin = Math.min(this.v5, i10);
                        Zo(this.gn, i9, iMin);
                        this.Mr -= iMin;
                        i9 += iMin;
                    } else {
                        short[] sArr = this.gn;
                        int i11 = this.j6;
                        int i12 = i11 > 4000 ? i11 / 4000 : 1;
                        if (this.DW == i7 && i12 == i7) {
                            iDW = DW(sArr, i9, this.FH, this.Hw);
                        } else {
                            gn(sArr, i9, i12);
                            int iDW2 = DW(this.Zo, 0, this.FH / i12, this.Hw / i12);
                            if (i12 != i7) {
                                int i13 = iDW2 * i12;
                                int i14 = i12 << 2;
                                int i15 = i13 - i14;
                                int i16 = i13 + i14;
                                int i17 = this.FH;
                                if (i15 < i17) {
                                    i15 = i17;
                                }
                                int i18 = this.Hw;
                                if (i16 > i18) {
                                    i16 = i18;
                                }
                                if (this.DW == i7) {
                                    iDW = DW(sArr, i9, i15, i16);
                                } else {
                                    gn(sArr, i9, i7);
                                    iDW = DW(this.Zo, 0, i15, i16);
                                }
                            } else {
                                iDW = iDW2;
                            }
                        }
                        int i19 = this.lg;
                        int i20 = i19 != 0 && this.U2 != 0 && this.rN <= i19 * 3 && (i19 << 1) > this.a8 * 3 ? this.U2 : iDW;
                        this.a8 = this.lg;
                        this.U2 = iDW;
                        if (d > 1.0d) {
                            short[] sArr2 = this.gn;
                            if (f >= 2.0f) {
                                i2 = (int) (i20 / (f - 1.0f));
                            } else {
                                this.Mr = (int) ((i20 * (2.0f - f)) / (f - 1.0f));
                                i2 = i20;
                            }
                            we(i2);
                            int i21 = i2;
                            Hw(i2, this.DW, this.tp, this.aM, sArr2, i9, sArr2, i9 + i20);
                            this.aM += i21;
                            i9 += i20 + i21;
                        } else {
                            int i22 = i20;
                            short[] sArr3 = this.gn;
                            if (f < 0.5f) {
                                i = (int) ((i22 * f) / (1.0f - f));
                            } else {
                                this.Mr = (int) ((i22 * ((2.0f * f) - 1.0f)) / (1.0f - f));
                                i = i22;
                            }
                            int i23 = i22 + i;
                            we(i23);
                            int i24 = this.DW;
                            System.arraycopy(sArr3, i9 * i24, this.tp, this.aM * i24, i24 * i22);
                            Hw(i, this.DW, this.tp, this.aM + i22, sArr3, i22 + i9, sArr3, i9);
                            this.aM += i23;
                            i9 += i;
                        }
                    }
                    if (this.v5 + i9 > i8) {
                        break;
                    } else {
                        i7 = 1;
                    }
                }
                int i25 = this.XL - i9;
                short[] sArr4 = this.gn;
                int i26 = this.DW;
                System.arraycopy(sArr4, i9 * i26, sArr4, 0, i26 * i25);
                this.XL = i25;
            }
        } else {
            Zo(this.gn, 0, this.XL);
            this.XL = 0;
        }
        float f2 = this.QX;
        if (f2 == 1.0f || this.aM == i6) {
            return;
        }
        int i27 = this.j6;
        int i28 = (int) (i27 / f2);
        while (true) {
            if (i28 <= 16384 && i27 <= 16384) {
                break;
            }
            i28 /= 2;
            i27 /= 2;
        }
        int i29 = this.aM - i6;
        int i30 = this.j3 + i29;
        int i31 = this.EQ;
        if (i30 > i31) {
            int i32 = i31 + (i31 / 2) + i29;
            this.EQ = i32;
            this.we = Arrays.copyOf(this.we, i32 * this.DW);
        }
        short[] sArr5 = this.tp;
        int i33 = this.DW;
        System.arraycopy(sArr5, i6 * i33, this.we, this.j3 * i33, i33 * i29);
        this.aM = i6;
        this.j3 += i29;
        int i34 = 0;
        while (true) {
            i3 = this.j3;
            if (i34 >= i3 - 1) {
                break;
            }
            while (true) {
                i4 = this.J0;
                int i35 = (i4 + 1) * i28;
                i5 = this.J8;
                if (i35 <= i5 * i27) {
                    break;
                }
                we(1);
                int i36 = 0;
                while (true) {
                    int i37 = this.DW;
                    if (i36 < i37) {
                        short[] sArr6 = this.tp;
                        int i38 = (this.aM * i37) + i36;
                        short[] sArr7 = this.we;
                        int i39 = (i34 * i37) + i36;
                        short s = sArr7[i39];
                        short s2 = sArr7[i39 + i37];
                        int i40 = this.J8 * i27;
                        int i41 = this.J0;
                        int i42 = i41 * i28;
                        int i43 = (i41 + 1) * i28;
                        int i44 = i43 - i40;
                        int i45 = i43 - i42;
                        sArr6[i38] = (short) (((s * i44) + ((i45 - i44) * s2)) / i45);
                        i36++;
                    }
                }
                this.J8++;
                this.aM++;
            }
            int i46 = i4 + 1;
            this.J0 = i46;
            if (i46 == i27) {
                this.J0 = 0;
                ro0.Hw(i5 == i28);
                this.J8 = 0;
            }
            i34++;
        }
        int i47 = i3 - 1;
        if (i47 != 0) {
            short[] sArr8 = this.we;
            int i48 = this.DW;
            System.arraycopy(sArr8, i47 * i48, sArr8, 0, (i3 - i47) * i48);
            this.j3 -= i47;
        }
    }

    private static void Hw(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i9] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    private final void J0(int i) {
        int i2 = this.XL + i;
        int i3 = this.VH;
        if (i2 > i3) {
            int i4 = i3 + (i3 / 2) + i;
            this.VH = i4;
            this.gn = Arrays.copyOf(this.gn, i4 * this.DW);
        }
    }

    private final void Zo(short[] sArr, int i, int i2) {
        we(i2);
        int i3 = this.DW;
        System.arraycopy(sArr, i * i3, this.tp, this.aM * i3, i3 * i2);
        this.aM += i2;
    }

    private final void gn(short[] sArr, int i, int i2) {
        int i3 = this.v5 / i2;
        int i4 = this.DW;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.Zo[i7] = (short) (i8 / i5);
        }
    }

    private final void we(int i) {
        int i2 = this.aM + i;
        int i3 = this.u7;
        if (i2 > i3) {
            int i4 = i3 + (i3 / 2) + i;
            this.u7 = i4;
            this.tp = Arrays.copyOf(this.tp, i4 * this.DW);
        }
    }

    public final void FH(float f) {
        this.QX = f;
    }

    public final void VH(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.DW, this.aM);
        shortBuffer.put(this.tp, 0, this.DW * iMin);
        int i = this.aM - iMin;
        this.aM = i;
        short[] sArr = this.tp;
        int i2 = this.DW;
        System.arraycopy(sArr, iMin * i2, sArr, 0, i * i2);
    }

    public final void j6(float f) {
        this.Ws = f;
    }

    public final int tp() {
        return this.aM;
    }

    public final void u7() {
        int i;
        int i2 = this.XL;
        float f = this.Ws;
        float f2 = this.QX;
        int i3 = this.aM + ((int) ((((i2 / (f / f2)) + this.j3) / f2) + 0.5f));
        J0((this.v5 * 2) + i2);
        int i4 = 0;
        while (true) {
            i = this.v5;
            int i5 = this.DW;
            if (i4 >= i * 2 * i5) {
                break;
            }
            this.gn[(i5 * i2) + i4] = 0;
            i4++;
        }
        this.XL += i * 2;
        EQ();
        if (this.aM > i3) {
            this.aM = i3;
        }
        this.XL = 0;
        this.Mr = 0;
        this.j3 = 0;
    }

    public final void v5(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i = this.DW;
        int i2 = iRemaining / i;
        J0(i2);
        shortBuffer.get(this.gn, this.XL * this.DW, ((i * i2) << 1) / 2);
        this.XL += i2;
        EQ();
    }
}
