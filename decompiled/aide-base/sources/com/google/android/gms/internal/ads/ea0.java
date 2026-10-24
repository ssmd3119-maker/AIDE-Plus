package com.google.android.gms.internal.ads;

import com.aide.uidesigner.ProxyTextView;

/* loaded from: classes.dex */
public final class ea0 extends j90<ea0> {
    private static volatile ea0[] we;
    public Integer FH = null;
    public String Hw = null;
    public ba0 v5 = null;
    private ca0 Zo = null;
    private Integer VH = null;
    private int[] gn = t90.j6;
    private String u7 = null;
    public Integer tp = null;
    public String[] EQ = t90.FH;

    public ea0() {
        this.DW = null;
        this.j6 = -1;
    }

    private final ea0 EQ(g90 g90Var) throws o90 {
        while (true) {
            int iZo = g90Var.Zo();
            switch (iZo) {
                case 0:
                    return this;
                case 8:
                    this.FH = Integer.valueOf(g90Var.gn());
                    break;
                case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
                    this.Hw = g90Var.FH();
                    break;
                case 26:
                    if (this.v5 == null) {
                        this.v5 = new ba0();
                    }
                    g90Var.v5(this.v5);
                    break;
                case 34:
                    if (this.Zo == null) {
                        this.Zo = new ca0();
                    }
                    g90Var.v5(this.Zo);
                    break;
                case 40:
                    this.VH = Integer.valueOf(g90Var.gn());
                    break;
                case 48:
                    int iJ6 = t90.j6(g90Var, 48);
                    int[] iArr = this.gn;
                    int length = iArr == null ? 0 : iArr.length;
                    int i = iJ6 + length;
                    int[] iArr2 = new int[i];
                    if (length != 0) {
                        System.arraycopy(this.gn, 0, iArr2, 0, length);
                    }
                    while (length < i - 1) {
                        iArr2[length] = g90Var.gn();
                        g90Var.Zo();
                        length++;
                    }
                    iArr2[length] = g90Var.gn();
                    this.gn = iArr2;
                    break;
                case 50:
                    int iJ3 = g90Var.j3(g90Var.tp());
                    int iJ62 = g90Var.j6();
                    int i2 = 0;
                    while (g90Var.QX() > 0) {
                        g90Var.gn();
                        i2++;
                    }
                    g90Var.a8(iJ62);
                    int[] iArr3 = this.gn;
                    int length2 = iArr3 == null ? 0 : iArr3.length;
                    int i3 = i2 + length2;
                    int[] iArr4 = new int[i3];
                    if (length2 != 0) {
                        System.arraycopy(this.gn, 0, iArr4, 0, length2);
                    }
                    while (length2 < i3) {
                        iArr4[length2] = g90Var.gn();
                        length2++;
                    }
                    this.gn = iArr4;
                    g90Var.Mr(iJ3);
                    break;
                case 58:
                    this.u7 = g90Var.FH();
                    break;
                case 64:
                    int iJ63 = g90Var.j6();
                    try {
                        int iGn = g90Var.gn();
                        if (iGn >= 0 && iGn <= 3) {
                            this.tp = Integer.valueOf(iGn);
                            break;
                        } else {
                            StringBuilder sb = new StringBuilder(46);
                            sb.append(iGn);
                            sb.append(" is not a valid enum AdResourceType");
                            throw new IllegalArgumentException(sb.toString());
                            break;
                        }
                    } catch (IllegalArgumentException unused) {
                        g90Var.a8(iJ63);
                        u7(g90Var, iZo);
                        break;
                    }
                    break;
                case 74:
                    int iJ64 = t90.j6(g90Var, 74);
                    String[] strArr = this.EQ;
                    int length3 = strArr == null ? 0 : strArr.length;
                    int i4 = iJ64 + length3;
                    String[] strArr2 = new String[i4];
                    if (length3 != 0) {
                        System.arraycopy(this.EQ, 0, strArr2, 0, length3);
                    }
                    while (length3 < i4 - 1) {
                        strArr2[length3] = g90Var.FH();
                        g90Var.Zo();
                        length3++;
                    }
                    strArr2[length3] = g90Var.FH();
                    this.EQ = strArr2;
                    break;
                default:
                    if (!super.u7(g90Var, iZo)) {
                        return this;
                    }
                    break;
            }
        }
    }

    public static ea0[] tp() {
        if (we == null) {
            synchronized (n90.DW) {
                if (we == null) {
                    we = new ea0[0];
                }
            }
        }
        return we;
    }

    @Override // com.google.android.gms.internal.ads.j90, com.google.android.gms.internal.ads.p90
    public final void Hw(h90 h90Var) throws i90 {
        h90Var.yS(1, this.FH.intValue());
        String str = this.Hw;
        if (str != null) {
            h90Var.EQ(2, str);
        }
        ba0 ba0Var = this.v5;
        if (ba0Var != null) {
            h90Var.DW(3, ba0Var);
        }
        ca0 ca0Var = this.Zo;
        if (ca0Var != null) {
            h90Var.DW(4, ca0Var);
        }
        Integer num = this.VH;
        if (num != null) {
            h90Var.yS(5, num.intValue());
        }
        int[] iArr = this.gn;
        int i = 0;
        if (iArr != null && iArr.length > 0) {
            int i2 = 0;
            while (true) {
                int[] iArr2 = this.gn;
                if (i2 >= iArr2.length) {
                    break;
                }
                h90Var.yS(6, iArr2[i2]);
                i2++;
            }
        }
        String str2 = this.u7;
        if (str2 != null) {
            h90Var.EQ(7, str2);
        }
        Integer num2 = this.tp;
        if (num2 != null) {
            h90Var.yS(8, num2.intValue());
        }
        String[] strArr = this.EQ;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.EQ;
                if (i >= strArr2.length) {
                    break;
                }
                String str3 = strArr2[i];
                if (str3 != null) {
                    h90Var.EQ(9, str3);
                }
                i++;
            }
        }
        super.Hw(h90Var);
    }

    @Override // com.google.android.gms.internal.ads.j90, com.google.android.gms.internal.ads.p90
    protected final int gn() {
        int[] iArr;
        int iGn = super.gn() + h90.vy(1, this.FH.intValue());
        String str = this.Hw;
        if (str != null) {
            iGn += h90.QX(2, str);
        }
        ba0 ba0Var = this.v5;
        if (ba0Var != null) {
            iGn += h90.v5(3, ba0Var);
        }
        ca0 ca0Var = this.Zo;
        if (ca0Var != null) {
            iGn += h90.v5(4, ca0Var);
        }
        Integer num = this.VH;
        if (num != null) {
            iGn += h90.vy(5, num.intValue());
        }
        int[] iArr2 = this.gn;
        int i = 0;
        if (iArr2 != null && iArr2.length > 0) {
            int i2 = 0;
            int iJ0 = 0;
            while (true) {
                iArr = this.gn;
                if (i2 >= iArr.length) {
                    break;
                }
                iJ0 += h90.J0(iArr[i2]);
                i2++;
            }
            iGn = iGn + iJ0 + (iArr.length * 1);
        }
        String str2 = this.u7;
        if (str2 != null) {
            iGn += h90.QX(7, str2);
        }
        Integer num2 = this.tp;
        if (num2 != null) {
            iGn += h90.vy(8, num2.intValue());
        }
        String[] strArr = this.EQ;
        if (strArr == null || strArr.length <= 0) {
            return iGn;
        }
        int iWs = 0;
        int i3 = 0;
        while (true) {
            String[] strArr2 = this.EQ;
            if (i >= strArr2.length) {
                return iGn + iWs + (i3 * 1);
            }
            String str3 = strArr2[i];
            if (str3 != null) {
                i3++;
                iWs += h90.Ws(str3);
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.p90
    public final /* synthetic */ p90 j6(g90 g90Var) throws o90 {
        EQ(g90Var);
        return this;
    }
}
