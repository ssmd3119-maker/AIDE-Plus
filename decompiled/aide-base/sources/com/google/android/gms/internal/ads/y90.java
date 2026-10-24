package com.google.android.gms.internal.ads;

import com.aide.uidesigner.ProxyTextView;

/* loaded from: classes.dex */
public final class y90 extends j90<y90> {
    private String[] J0;
    private String J8;
    public String[] Mr;
    private Boolean QX;
    private Boolean Ws;
    private byte[] XL;
    public fa0 aM;
    public String[] j3;
    public Integer FH = null;
    private u90 Hw = null;
    public String v5 = null;
    public String Zo = null;
    private String VH = null;
    public z90 gn = null;
    public ea0[] u7 = ea0.tp();
    public String tp = null;
    public da0 EQ = null;
    private Boolean we = null;

    public y90() {
        String[] strArr = t90.FH;
        this.J0 = strArr;
        this.J8 = null;
        this.Ws = null;
        this.QX = null;
        this.XL = null;
        this.aM = null;
        this.j3 = strArr;
        this.Mr = strArr;
        this.DW = null;
        this.j6 = -1;
    }

    private final y90 tp(g90 g90Var) throws o90 {
        while (true) {
            int iZo = g90Var.Zo();
            switch (iZo) {
                case 0:
                    return this;
                case 10:
                    this.v5 = g90Var.FH();
                    break;
                case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
                    this.Zo = g90Var.FH();
                    break;
                case 26:
                    this.VH = g90Var.FH();
                    break;
                case 34:
                    int iJ6 = t90.j6(g90Var, 34);
                    ea0[] ea0VarArr = this.u7;
                    int length = ea0VarArr == null ? 0 : ea0VarArr.length;
                    int i = iJ6 + length;
                    ea0[] ea0VarArr2 = new ea0[i];
                    if (length != 0) {
                        System.arraycopy(this.u7, 0, ea0VarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        ea0VarArr2[length] = new ea0();
                        g90Var.v5(ea0VarArr2[length]);
                        g90Var.Zo();
                        length++;
                    }
                    ea0VarArr2[length] = new ea0();
                    g90Var.v5(ea0VarArr2[length]);
                    this.u7 = ea0VarArr2;
                    break;
                case 40:
                    this.we = Boolean.valueOf(g90Var.u7());
                    break;
                case 50:
                    int iJ62 = t90.j6(g90Var, 50);
                    String[] strArr = this.J0;
                    int length2 = strArr == null ? 0 : strArr.length;
                    int i2 = iJ62 + length2;
                    String[] strArr2 = new String[i2];
                    if (length2 != 0) {
                        System.arraycopy(this.J0, 0, strArr2, 0, length2);
                    }
                    while (length2 < i2 - 1) {
                        strArr2[length2] = g90Var.FH();
                        g90Var.Zo();
                        length2++;
                    }
                    strArr2[length2] = g90Var.FH();
                    this.J0 = strArr2;
                    break;
                case 58:
                    this.J8 = g90Var.FH();
                    break;
                case 64:
                    this.Ws = Boolean.valueOf(g90Var.u7());
                    break;
                case 72:
                    this.QX = Boolean.valueOf(g90Var.u7());
                    break;
                case 80:
                    int iJ63 = g90Var.j6();
                    try {
                        int iGn = g90Var.gn();
                        if (iGn >= 0 && iGn <= 9) {
                            this.FH = Integer.valueOf(iGn);
                            break;
                        } else {
                            StringBuilder sb = new StringBuilder(42);
                            sb.append(iGn);
                            sb.append(" is not a valid enum ReportType");
                            throw new IllegalArgumentException(sb.toString());
                            break;
                        }
                    } catch (IllegalArgumentException unused) {
                        g90Var.a8(iJ63);
                        u7(g90Var, iZo);
                        break;
                    }
                    break;
                case 88:
                    int iJ64 = g90Var.j6();
                    int iGn2 = g90Var.gn();
                    if (iGn2 != 0 && iGn2 != 1 && iGn2 != 2 && iGn2 != 3 && iGn2 != 4) {
                        g90Var.a8(iJ64);
                        u7(g90Var, iZo);
                        break;
                    } else {
                        this.Hw = u90.j6(iGn2);
                        break;
                    }
                case 98:
                    if (this.gn == null) {
                        this.gn = new z90();
                    }
                    g90Var.v5(this.gn);
                    break;
                case 106:
                    this.tp = g90Var.FH();
                    break;
                case 114:
                    if (this.EQ == null) {
                        this.EQ = new da0();
                    }
                    g90Var.v5(this.EQ);
                    break;
                case 122:
                    this.XL = g90Var.DW();
                    break;
                case 138:
                    if (this.aM == null) {
                        this.aM = new fa0();
                    }
                    g90Var.v5(this.aM);
                    break;
                case 162:
                    int iJ65 = t90.j6(g90Var, 162);
                    String[] strArr3 = this.j3;
                    int length3 = strArr3 == null ? 0 : strArr3.length;
                    int i3 = iJ65 + length3;
                    String[] strArr4 = new String[i3];
                    if (length3 != 0) {
                        System.arraycopy(this.j3, 0, strArr4, 0, length3);
                    }
                    while (length3 < i3 - 1) {
                        strArr4[length3] = g90Var.FH();
                        g90Var.Zo();
                        length3++;
                    }
                    strArr4[length3] = g90Var.FH();
                    this.j3 = strArr4;
                    break;
                case 170:
                    int iJ66 = t90.j6(g90Var, 170);
                    String[] strArr5 = this.Mr;
                    int length4 = strArr5 == null ? 0 : strArr5.length;
                    int i4 = iJ66 + length4;
                    String[] strArr6 = new String[i4];
                    if (length4 != 0) {
                        System.arraycopy(this.Mr, 0, strArr6, 0, length4);
                    }
                    while (length4 < i4 - 1) {
                        strArr6[length4] = g90Var.FH();
                        g90Var.Zo();
                        length4++;
                    }
                    strArr6[length4] = g90Var.FH();
                    this.Mr = strArr6;
                    break;
                default:
                    if (!super.u7(g90Var, iZo)) {
                        return this;
                    }
                    break;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.j90, com.google.android.gms.internal.ads.p90
    public final void Hw(h90 h90Var) throws i90 {
        String str = this.v5;
        if (str != null) {
            h90Var.EQ(1, str);
        }
        String str2 = this.Zo;
        if (str2 != null) {
            h90Var.EQ(2, str2);
        }
        String str3 = this.VH;
        if (str3 != null) {
            h90Var.EQ(3, str3);
        }
        ea0[] ea0VarArr = this.u7;
        int i = 0;
        if (ea0VarArr != null && ea0VarArr.length > 0) {
            int i2 = 0;
            while (true) {
                ea0[] ea0VarArr2 = this.u7;
                if (i2 >= ea0VarArr2.length) {
                    break;
                }
                ea0 ea0Var = ea0VarArr2[i2];
                if (ea0Var != null) {
                    h90Var.DW(4, ea0Var);
                }
                i2++;
            }
        }
        Boolean bool = this.we;
        if (bool != null) {
            h90Var.Mr(5, bool.booleanValue());
        }
        String[] strArr = this.J0;
        if (strArr != null && strArr.length > 0) {
            int i3 = 0;
            while (true) {
                String[] strArr2 = this.J0;
                if (i3 >= strArr2.length) {
                    break;
                }
                String str4 = strArr2[i3];
                if (str4 != null) {
                    h90Var.EQ(6, str4);
                }
                i3++;
            }
        }
        String str5 = this.J8;
        if (str5 != null) {
            h90Var.EQ(7, str5);
        }
        Boolean bool2 = this.Ws;
        if (bool2 != null) {
            h90Var.Mr(8, bool2.booleanValue());
        }
        Boolean bool3 = this.QX;
        if (bool3 != null) {
            h90Var.Mr(9, bool3.booleanValue());
        }
        Integer num = this.FH;
        if (num != null) {
            h90Var.yS(10, num.intValue());
        }
        u90 u90Var = this.Hw;
        if (u90Var != null && u90Var != null) {
            h90Var.yS(11, u90Var.Hw());
        }
        z90 z90Var = this.gn;
        if (z90Var != null) {
            h90Var.DW(12, z90Var);
        }
        String str6 = this.tp;
        if (str6 != null) {
            h90Var.EQ(13, str6);
        }
        da0 da0Var = this.EQ;
        if (da0Var != null) {
            h90Var.DW(14, da0Var);
        }
        byte[] bArr = this.XL;
        if (bArr != null) {
            h90Var.FH(15, bArr);
        }
        fa0 fa0Var = this.aM;
        if (fa0Var != null) {
            h90Var.DW(17, fa0Var);
        }
        String[] strArr3 = this.j3;
        if (strArr3 != null && strArr3.length > 0) {
            int i4 = 0;
            while (true) {
                String[] strArr4 = this.j3;
                if (i4 >= strArr4.length) {
                    break;
                }
                String str7 = strArr4[i4];
                if (str7 != null) {
                    h90Var.EQ(20, str7);
                }
                i4++;
            }
        }
        String[] strArr5 = this.Mr;
        if (strArr5 != null && strArr5.length > 0) {
            while (true) {
                String[] strArr6 = this.Mr;
                if (i >= strArr6.length) {
                    break;
                }
                String str8 = strArr6[i];
                if (str8 != null) {
                    h90Var.EQ(21, str8);
                }
                i++;
            }
        }
        super.Hw(h90Var);
    }

    @Override // com.google.android.gms.internal.ads.j90, com.google.android.gms.internal.ads.p90
    protected final int gn() {
        int iGn = super.gn();
        String str = this.v5;
        if (str != null) {
            iGn += h90.QX(1, str);
        }
        String str2 = this.Zo;
        if (str2 != null) {
            iGn += h90.QX(2, str2);
        }
        String str3 = this.VH;
        if (str3 != null) {
            iGn += h90.QX(3, str3);
        }
        ea0[] ea0VarArr = this.u7;
        int i = 0;
        if (ea0VarArr != null && ea0VarArr.length > 0) {
            int i2 = 0;
            while (true) {
                ea0[] ea0VarArr2 = this.u7;
                if (i2 >= ea0VarArr2.length) {
                    break;
                }
                ea0 ea0Var = ea0VarArr2[i2];
                if (ea0Var != null) {
                    iGn += h90.v5(4, ea0Var);
                }
                i2++;
            }
        }
        Boolean bool = this.we;
        if (bool != null) {
            bool.booleanValue();
            iGn += h90.we(5) + 1;
        }
        String[] strArr = this.J0;
        if (strArr != null && strArr.length > 0) {
            int i3 = 0;
            int iWs = 0;
            int i4 = 0;
            while (true) {
                String[] strArr2 = this.J0;
                if (i3 >= strArr2.length) {
                    break;
                }
                String str4 = strArr2[i3];
                if (str4 != null) {
                    i4++;
                    iWs += h90.Ws(str4);
                }
                i3++;
            }
            iGn = iGn + iWs + (i4 * 1);
        }
        String str5 = this.J8;
        if (str5 != null) {
            iGn += h90.QX(7, str5);
        }
        Boolean bool2 = this.Ws;
        if (bool2 != null) {
            bool2.booleanValue();
            iGn += h90.we(8) + 1;
        }
        Boolean bool3 = this.QX;
        if (bool3 != null) {
            bool3.booleanValue();
            iGn += h90.we(9) + 1;
        }
        Integer num = this.FH;
        if (num != null) {
            iGn += h90.vy(10, num.intValue());
        }
        u90 u90Var = this.Hw;
        if (u90Var != null && u90Var != null) {
            iGn += h90.vy(11, u90Var.Hw());
        }
        z90 z90Var = this.gn;
        if (z90Var != null) {
            iGn += h90.v5(12, z90Var);
        }
        String str6 = this.tp;
        if (str6 != null) {
            iGn += h90.QX(13, str6);
        }
        da0 da0Var = this.EQ;
        if (da0Var != null) {
            iGn += h90.v5(14, da0Var);
        }
        byte[] bArr = this.XL;
        if (bArr != null) {
            iGn += h90.Zo(15, bArr);
        }
        fa0 fa0Var = this.aM;
        if (fa0Var != null) {
            iGn += h90.v5(17, fa0Var);
        }
        String[] strArr3 = this.j3;
        if (strArr3 != null && strArr3.length > 0) {
            int i5 = 0;
            int iWs2 = 0;
            int i6 = 0;
            while (true) {
                String[] strArr4 = this.j3;
                if (i5 >= strArr4.length) {
                    break;
                }
                String str7 = strArr4[i5];
                if (str7 != null) {
                    i6++;
                    iWs2 += h90.Ws(str7);
                }
                i5++;
            }
            iGn = iGn + iWs2 + (i6 * 2);
        }
        String[] strArr5 = this.Mr;
        if (strArr5 == null || strArr5.length <= 0) {
            return iGn;
        }
        int iWs3 = 0;
        int i7 = 0;
        while (true) {
            String[] strArr6 = this.Mr;
            if (i >= strArr6.length) {
                return iGn + iWs3 + (i7 * 2);
            }
            String str8 = strArr6[i];
            if (str8 != null) {
                i7++;
                iWs3 += h90.Ws(str8);
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.p90
    public final /* synthetic */ p90 j6(g90 g90Var) throws o90 {
        tp(g90Var);
        return this;
    }
}
