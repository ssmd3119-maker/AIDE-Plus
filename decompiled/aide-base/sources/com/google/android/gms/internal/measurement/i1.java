package com.google.android.gms.internal.measurement;

import com.aide.uidesigner.ProxyTextView;
import com.google.android.gms.internal.measurement.r0;

/* loaded from: classes.dex */
public final class i1 extends t7<i1> {
    private static volatile i1[] g3;
    public Integer FH = null;
    public f1[] Hw = f1.gn();
    public l1[] v5 = l1.gn();
    public Long Zo = null;
    public Long VH = null;
    public Long gn = null;
    public Long u7 = null;
    public Long tp = null;
    public String EQ = null;
    public String we = null;
    public String J0 = null;
    public String J8 = null;
    public Integer Ws = null;
    public String QX = null;
    public String XL = null;
    public String aM = null;
    public Long j3 = null;
    public Long Mr = null;
    public String U2 = null;
    public Boolean a8 = null;
    public String lg = null;
    public Long rN = null;
    public Integer er = null;
    public String yS = null;
    public String gW = null;
    public Boolean BT = null;
    public d1[] vy = d1.gn();
    public String P8 = null;
    public Integer ei = null;
    private Integer nw = null;
    private Integer SI = null;
    public String KD = null;
    public Long ro = null;
    public Long cn = null;
    public String sh = null;
    private String cb = null;
    public Integer dx = null;
    public String sG = null;
    public r0 ef = null;
    public int[] Sf = c8.j6;
    private Long vJ = null;

    public i1() {
        this.DW = null;
        this.j6 = -1;
    }

    public static i1[] gn() {
        if (g3 == null) {
            synchronized (x7.DW) {
                if (g3 == null) {
                    g3 = new i1[0];
                }
            }
        }
        return g3;
    }

    @Override // com.google.android.gms.internal.measurement.t7, com.google.android.gms.internal.measurement.z7
    public final void DW(r7 r7Var) throws s7, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        Integer num = this.FH;
        if (num != null) {
            r7Var.Mr(1, num.intValue());
        }
        f1[] f1VarArr = this.Hw;
        if (f1VarArr != null && f1VarArr.length > 0) {
            int i = 0;
            while (true) {
                f1[] f1VarArr2 = this.Hw;
                if (i >= f1VarArr2.length) {
                    break;
                }
                f1 f1Var = f1VarArr2[i];
                if (f1Var != null) {
                    r7Var.v5(2, f1Var);
                }
                i++;
            }
        }
        l1[] l1VarArr = this.v5;
        if (l1VarArr != null && l1VarArr.length > 0) {
            int i2 = 0;
            while (true) {
                l1[] l1VarArr2 = this.v5;
                if (i2 >= l1VarArr2.length) {
                    break;
                }
                l1 l1Var = l1VarArr2[i2];
                if (l1Var != null) {
                    r7Var.v5(3, l1Var);
                }
                i2++;
            }
        }
        Long l = this.Zo;
        if (l != null) {
            r7Var.er(4, l.longValue());
        }
        Long l2 = this.VH;
        if (l2 != null) {
            r7Var.er(5, l2.longValue());
        }
        Long l3 = this.gn;
        if (l3 != null) {
            r7Var.er(6, l3.longValue());
        }
        Long l4 = this.tp;
        if (l4 != null) {
            r7Var.er(7, l4.longValue());
        }
        String str = this.EQ;
        if (str != null) {
            r7Var.VH(8, str);
        }
        String str2 = this.we;
        if (str2 != null) {
            r7Var.VH(9, str2);
        }
        String str3 = this.J0;
        if (str3 != null) {
            r7Var.VH(10, str3);
        }
        String str4 = this.J8;
        if (str4 != null) {
            r7Var.VH(11, str4);
        }
        Integer num2 = this.Ws;
        if (num2 != null) {
            r7Var.Mr(12, num2.intValue());
        }
        String str5 = this.QX;
        if (str5 != null) {
            r7Var.VH(13, str5);
        }
        String str6 = this.XL;
        if (str6 != null) {
            r7Var.VH(14, str6);
        }
        String str7 = this.aM;
        if (str7 != null) {
            r7Var.VH(16, str7);
        }
        Long l5 = this.j3;
        if (l5 != null) {
            r7Var.er(17, l5.longValue());
        }
        Long l6 = this.Mr;
        if (l6 != null) {
            r7Var.er(18, l6.longValue());
        }
        String str8 = this.U2;
        if (str8 != null) {
            r7Var.VH(19, str8);
        }
        Boolean bool = this.a8;
        if (bool != null) {
            r7Var.gn(20, bool.booleanValue());
        }
        String str9 = this.lg;
        if (str9 != null) {
            r7Var.VH(21, str9);
        }
        Long l7 = this.rN;
        if (l7 != null) {
            r7Var.er(22, l7.longValue());
        }
        Integer num3 = this.er;
        if (num3 != null) {
            r7Var.Mr(23, num3.intValue());
        }
        String str10 = this.yS;
        if (str10 != null) {
            r7Var.VH(24, str10);
        }
        String str11 = this.gW;
        if (str11 != null) {
            r7Var.VH(25, str11);
        }
        Long l8 = this.u7;
        if (l8 != null) {
            r7Var.er(26, l8.longValue());
        }
        Boolean bool2 = this.BT;
        if (bool2 != null) {
            r7Var.gn(28, bool2.booleanValue());
        }
        d1[] d1VarArr = this.vy;
        if (d1VarArr != null && d1VarArr.length > 0) {
            int i3 = 0;
            while (true) {
                d1[] d1VarArr2 = this.vy;
                if (i3 >= d1VarArr2.length) {
                    break;
                }
                d1 d1Var = d1VarArr2[i3];
                if (d1Var != null) {
                    r7Var.v5(29, d1Var);
                }
                i3++;
            }
        }
        String str12 = this.P8;
        if (str12 != null) {
            r7Var.VH(30, str12);
        }
        Integer num4 = this.ei;
        if (num4 != null) {
            r7Var.Mr(31, num4.intValue());
        }
        Integer num5 = this.nw;
        if (num5 != null) {
            r7Var.Mr(32, num5.intValue());
        }
        Integer num6 = this.SI;
        if (num6 != null) {
            r7Var.Mr(33, num6.intValue());
        }
        String str13 = this.KD;
        if (str13 != null) {
            r7Var.VH(34, str13);
        }
        Long l9 = this.ro;
        if (l9 != null) {
            r7Var.er(35, l9.longValue());
        }
        Long l10 = this.cn;
        if (l10 != null) {
            r7Var.er(36, l10.longValue());
        }
        String str14 = this.sh;
        if (str14 != null) {
            r7Var.VH(37, str14);
        }
        String str15 = this.cb;
        if (str15 != null) {
            r7Var.VH(38, str15);
        }
        Integer num7 = this.dx;
        if (num7 != null) {
            r7Var.Mr(39, num7.intValue());
        }
        String str16 = this.sG;
        if (str16 != null) {
            r7Var.VH(41, str16);
        }
        r0 r0Var = this.ef;
        if (r0Var != null) {
            r7Var.a8(44, r0Var);
        }
        int[] iArr = this.Sf;
        if (iArr != null && iArr.length > 0) {
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.Sf;
                if (i4 >= iArr2.length) {
                    break;
                }
                int i5 = iArr2[i4];
                r7Var.QX(45, 0);
                r7Var.aM(i5);
                i4++;
            }
        }
        Long l11 = this.vJ;
        if (l11 != null) {
            r7Var.er(46, l11.longValue());
        }
        super.DW(r7Var);
    }

    @Override // com.google.android.gms.internal.measurement.t7, com.google.android.gms.internal.measurement.z7
    protected final int FH() {
        int[] iArr;
        int iFH = super.FH();
        Integer num = this.FH;
        if (num != null) {
            iFH += r7.rN(1, num.intValue());
        }
        f1[] f1VarArr = this.Hw;
        int i = 0;
        if (f1VarArr != null && f1VarArr.length > 0) {
            int i2 = 0;
            while (true) {
                f1[] f1VarArr2 = this.Hw;
                if (i2 >= f1VarArr2.length) {
                    break;
                }
                f1 f1Var = f1VarArr2[i2];
                if (f1Var != null) {
                    iFH += r7.Zo(2, f1Var);
                }
                i2++;
            }
        }
        l1[] l1VarArr = this.v5;
        if (l1VarArr != null && l1VarArr.length > 0) {
            int i3 = 0;
            while (true) {
                l1[] l1VarArr2 = this.v5;
                if (i3 >= l1VarArr2.length) {
                    break;
                }
                l1 l1Var = l1VarArr2[i3];
                if (l1Var != null) {
                    iFH += r7.Zo(3, l1Var);
                }
                i3++;
            }
        }
        Long l = this.Zo;
        if (l != null) {
            iFH += r7.j3(4, l.longValue());
        }
        Long l2 = this.VH;
        if (l2 != null) {
            iFH += r7.j3(5, l2.longValue());
        }
        Long l3 = this.gn;
        if (l3 != null) {
            iFH += r7.j3(6, l3.longValue());
        }
        Long l4 = this.tp;
        if (l4 != null) {
            iFH += r7.j3(7, l4.longValue());
        }
        String str = this.EQ;
        if (str != null) {
            iFH += r7.Ws(8, str);
        }
        String str2 = this.we;
        if (str2 != null) {
            iFH += r7.Ws(9, str2);
        }
        String str3 = this.J0;
        if (str3 != null) {
            iFH += r7.Ws(10, str3);
        }
        String str4 = this.J8;
        if (str4 != null) {
            iFH += r7.Ws(11, str4);
        }
        Integer num2 = this.Ws;
        if (num2 != null) {
            iFH += r7.rN(12, num2.intValue());
        }
        String str5 = this.QX;
        if (str5 != null) {
            iFH += r7.Ws(13, str5);
        }
        String str6 = this.XL;
        if (str6 != null) {
            iFH += r7.Ws(14, str6);
        }
        String str7 = this.aM;
        if (str7 != null) {
            iFH += r7.Ws(16, str7);
        }
        Long l5 = this.j3;
        if (l5 != null) {
            iFH += r7.j3(17, l5.longValue());
        }
        Long l6 = this.Mr;
        if (l6 != null) {
            iFH += r7.j3(18, l6.longValue());
        }
        String str8 = this.U2;
        if (str8 != null) {
            iFH += r7.Ws(19, str8);
        }
        Boolean bool = this.a8;
        if (bool != null) {
            bool.booleanValue();
            iFH += r7.tp(20) + 1;
        }
        String str9 = this.lg;
        if (str9 != null) {
            iFH += r7.Ws(21, str9);
        }
        Long l7 = this.rN;
        if (l7 != null) {
            iFH += r7.j3(22, l7.longValue());
        }
        Integer num3 = this.er;
        if (num3 != null) {
            iFH += r7.rN(23, num3.intValue());
        }
        String str10 = this.yS;
        if (str10 != null) {
            iFH += r7.Ws(24, str10);
        }
        String str11 = this.gW;
        if (str11 != null) {
            iFH += r7.Ws(25, str11);
        }
        Long l8 = this.u7;
        if (l8 != null) {
            iFH += r7.j3(26, l8.longValue());
        }
        Boolean bool2 = this.BT;
        if (bool2 != null) {
            bool2.booleanValue();
            iFH += r7.tp(28) + 1;
        }
        d1[] d1VarArr = this.vy;
        if (d1VarArr != null && d1VarArr.length > 0) {
            int i4 = 0;
            while (true) {
                d1[] d1VarArr2 = this.vy;
                if (i4 >= d1VarArr2.length) {
                    break;
                }
                d1 d1Var = d1VarArr2[i4];
                if (d1Var != null) {
                    iFH += r7.Zo(29, d1Var);
                }
                i4++;
            }
        }
        String str12 = this.P8;
        if (str12 != null) {
            iFH += r7.Ws(30, str12);
        }
        Integer num4 = this.ei;
        if (num4 != null) {
            iFH += r7.rN(31, num4.intValue());
        }
        Integer num5 = this.nw;
        if (num5 != null) {
            iFH += r7.rN(32, num5.intValue());
        }
        Integer num6 = this.SI;
        if (num6 != null) {
            iFH += r7.rN(33, num6.intValue());
        }
        String str13 = this.KD;
        if (str13 != null) {
            iFH += r7.Ws(34, str13);
        }
        Long l9 = this.ro;
        if (l9 != null) {
            iFH += r7.j3(35, l9.longValue());
        }
        Long l10 = this.cn;
        if (l10 != null) {
            iFH += r7.j3(36, l10.longValue());
        }
        String str14 = this.sh;
        if (str14 != null) {
            iFH += r7.Ws(37, str14);
        }
        String str15 = this.cb;
        if (str15 != null) {
            iFH += r7.Ws(38, str15);
        }
        Integer num7 = this.dx;
        if (num7 != null) {
            iFH += r7.rN(39, num7.intValue());
        }
        String str16 = this.sG;
        if (str16 != null) {
            iFH += r7.Ws(41, str16);
        }
        r0 r0Var = this.ef;
        if (r0Var != null) {
            iFH += k3.br(44, r0Var);
        }
        int[] iArr2 = this.Sf;
        if (iArr2 != null && iArr2.length > 0) {
            int iJ8 = 0;
            while (true) {
                iArr = this.Sf;
                if (i >= iArr.length) {
                    break;
                }
                iJ8 += r7.J8(iArr[i]);
                i++;
            }
            iFH = iFH + iJ8 + (iArr.length * 2);
        }
        Long l11 = this.vJ;
        return l11 != null ? iFH + r7.j3(46, l11.longValue()) : iFH;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        Integer num = this.FH;
        if (num == null) {
            if (i1Var.FH != null) {
                return false;
            }
        } else if (!num.equals(i1Var.FH)) {
            return false;
        }
        if (!x7.FH(this.Hw, i1Var.Hw) || !x7.FH(this.v5, i1Var.v5)) {
            return false;
        }
        Long l = this.Zo;
        if (l == null) {
            if (i1Var.Zo != null) {
                return false;
            }
        } else if (!l.equals(i1Var.Zo)) {
            return false;
        }
        Long l2 = this.VH;
        if (l2 == null) {
            if (i1Var.VH != null) {
                return false;
            }
        } else if (!l2.equals(i1Var.VH)) {
            return false;
        }
        Long l3 = this.gn;
        if (l3 == null) {
            if (i1Var.gn != null) {
                return false;
            }
        } else if (!l3.equals(i1Var.gn)) {
            return false;
        }
        Long l4 = this.u7;
        if (l4 == null) {
            if (i1Var.u7 != null) {
                return false;
            }
        } else if (!l4.equals(i1Var.u7)) {
            return false;
        }
        Long l5 = this.tp;
        if (l5 == null) {
            if (i1Var.tp != null) {
                return false;
            }
        } else if (!l5.equals(i1Var.tp)) {
            return false;
        }
        String str = this.EQ;
        if (str == null) {
            if (i1Var.EQ != null) {
                return false;
            }
        } else if (!str.equals(i1Var.EQ)) {
            return false;
        }
        String str2 = this.we;
        if (str2 == null) {
            if (i1Var.we != null) {
                return false;
            }
        } else if (!str2.equals(i1Var.we)) {
            return false;
        }
        String str3 = this.J0;
        if (str3 == null) {
            if (i1Var.J0 != null) {
                return false;
            }
        } else if (!str3.equals(i1Var.J0)) {
            return false;
        }
        String str4 = this.J8;
        if (str4 == null) {
            if (i1Var.J8 != null) {
                return false;
            }
        } else if (!str4.equals(i1Var.J8)) {
            return false;
        }
        Integer num2 = this.Ws;
        if (num2 == null) {
            if (i1Var.Ws != null) {
                return false;
            }
        } else if (!num2.equals(i1Var.Ws)) {
            return false;
        }
        String str5 = this.QX;
        if (str5 == null) {
            if (i1Var.QX != null) {
                return false;
            }
        } else if (!str5.equals(i1Var.QX)) {
            return false;
        }
        String str6 = this.XL;
        if (str6 == null) {
            if (i1Var.XL != null) {
                return false;
            }
        } else if (!str6.equals(i1Var.XL)) {
            return false;
        }
        String str7 = this.aM;
        if (str7 == null) {
            if (i1Var.aM != null) {
                return false;
            }
        } else if (!str7.equals(i1Var.aM)) {
            return false;
        }
        Long l6 = this.j3;
        if (l6 == null) {
            if (i1Var.j3 != null) {
                return false;
            }
        } else if (!l6.equals(i1Var.j3)) {
            return false;
        }
        Long l7 = this.Mr;
        if (l7 == null) {
            if (i1Var.Mr != null) {
                return false;
            }
        } else if (!l7.equals(i1Var.Mr)) {
            return false;
        }
        String str8 = this.U2;
        if (str8 == null) {
            if (i1Var.U2 != null) {
                return false;
            }
        } else if (!str8.equals(i1Var.U2)) {
            return false;
        }
        Boolean bool = this.a8;
        if (bool == null) {
            if (i1Var.a8 != null) {
                return false;
            }
        } else if (!bool.equals(i1Var.a8)) {
            return false;
        }
        String str9 = this.lg;
        if (str9 == null) {
            if (i1Var.lg != null) {
                return false;
            }
        } else if (!str9.equals(i1Var.lg)) {
            return false;
        }
        Long l8 = this.rN;
        if (l8 == null) {
            if (i1Var.rN != null) {
                return false;
            }
        } else if (!l8.equals(i1Var.rN)) {
            return false;
        }
        Integer num3 = this.er;
        if (num3 == null) {
            if (i1Var.er != null) {
                return false;
            }
        } else if (!num3.equals(i1Var.er)) {
            return false;
        }
        String str10 = this.yS;
        if (str10 == null) {
            if (i1Var.yS != null) {
                return false;
            }
        } else if (!str10.equals(i1Var.yS)) {
            return false;
        }
        String str11 = this.gW;
        if (str11 == null) {
            if (i1Var.gW != null) {
                return false;
            }
        } else if (!str11.equals(i1Var.gW)) {
            return false;
        }
        Boolean bool2 = this.BT;
        if (bool2 == null) {
            if (i1Var.BT != null) {
                return false;
            }
        } else if (!bool2.equals(i1Var.BT)) {
            return false;
        }
        if (!x7.FH(this.vy, i1Var.vy)) {
            return false;
        }
        String str12 = this.P8;
        if (str12 == null) {
            if (i1Var.P8 != null) {
                return false;
            }
        } else if (!str12.equals(i1Var.P8)) {
            return false;
        }
        Integer num4 = this.ei;
        if (num4 == null) {
            if (i1Var.ei != null) {
                return false;
            }
        } else if (!num4.equals(i1Var.ei)) {
            return false;
        }
        Integer num5 = this.nw;
        if (num5 == null) {
            if (i1Var.nw != null) {
                return false;
            }
        } else if (!num5.equals(i1Var.nw)) {
            return false;
        }
        Integer num6 = this.SI;
        if (num6 == null) {
            if (i1Var.SI != null) {
                return false;
            }
        } else if (!num6.equals(i1Var.SI)) {
            return false;
        }
        String str13 = this.KD;
        if (str13 == null) {
            if (i1Var.KD != null) {
                return false;
            }
        } else if (!str13.equals(i1Var.KD)) {
            return false;
        }
        Long l9 = this.ro;
        if (l9 == null) {
            if (i1Var.ro != null) {
                return false;
            }
        } else if (!l9.equals(i1Var.ro)) {
            return false;
        }
        Long l10 = this.cn;
        if (l10 == null) {
            if (i1Var.cn != null) {
                return false;
            }
        } else if (!l10.equals(i1Var.cn)) {
            return false;
        }
        String str14 = this.sh;
        if (str14 == null) {
            if (i1Var.sh != null) {
                return false;
            }
        } else if (!str14.equals(i1Var.sh)) {
            return false;
        }
        String str15 = this.cb;
        if (str15 == null) {
            if (i1Var.cb != null) {
                return false;
            }
        } else if (!str15.equals(i1Var.cb)) {
            return false;
        }
        Integer num7 = this.dx;
        if (num7 == null) {
            if (i1Var.dx != null) {
                return false;
            }
        } else if (!num7.equals(i1Var.dx)) {
            return false;
        }
        String str16 = this.sG;
        if (str16 == null) {
            if (i1Var.sG != null) {
                return false;
            }
        } else if (!str16.equals(i1Var.sG)) {
            return false;
        }
        r0 r0Var = this.ef;
        if (r0Var == null) {
            if (i1Var.ef != null) {
                return false;
            }
        } else if (!r0Var.equals(i1Var.ef)) {
            return false;
        }
        if (!x7.j6(this.Sf, i1Var.Sf)) {
            return false;
        }
        Long l11 = this.vJ;
        if (l11 == null) {
            if (i1Var.vJ != null) {
                return false;
            }
        } else if (!l11.equals(i1Var.vJ)) {
            return false;
        }
        v7 v7Var = this.DW;
        if (v7Var != null && !v7Var.FH()) {
            return this.DW.equals(i1Var.DW);
        }
        v7 v7Var2 = i1Var.DW;
        return v7Var2 == null || v7Var2.FH();
    }

    public final int hashCode() {
        int iHashCode = (i1.class.getName().hashCode() + 527) * 31;
        Integer num = this.FH;
        int iHashCode2 = 0;
        int iHashCode3 = (((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + x7.Zo(this.Hw)) * 31) + x7.Zo(this.v5)) * 31;
        Long l = this.Zo;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.VH;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.gn;
        int iHashCode6 = (iHashCode5 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.u7;
        int iHashCode7 = (iHashCode6 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.tp;
        int iHashCode8 = (iHashCode7 + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str = this.EQ;
        int iHashCode9 = (iHashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.we;
        int iHashCode10 = (iHashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.J0;
        int iHashCode11 = (iHashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.J8;
        int iHashCode12 = (iHashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.Ws;
        int iHashCode13 = (iHashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.QX;
        int iHashCode14 = (iHashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.XL;
        int iHashCode15 = (iHashCode14 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.aM;
        int iHashCode16 = (iHashCode15 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l6 = this.j3;
        int iHashCode17 = (iHashCode16 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Long l7 = this.Mr;
        int iHashCode18 = (iHashCode17 + (l7 == null ? 0 : l7.hashCode())) * 31;
        String str8 = this.U2;
        int iHashCode19 = (iHashCode18 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool = this.a8;
        int iHashCode20 = (iHashCode19 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str9 = this.lg;
        int iHashCode21 = (iHashCode20 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Long l8 = this.rN;
        int iHashCode22 = (iHashCode21 + (l8 == null ? 0 : l8.hashCode())) * 31;
        Integer num3 = this.er;
        int iHashCode23 = (iHashCode22 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str10 = this.yS;
        int iHashCode24 = (iHashCode23 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.gW;
        int iHashCode25 = (iHashCode24 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Boolean bool2 = this.BT;
        int iHashCode26 = (((iHashCode25 + (bool2 == null ? 0 : bool2.hashCode())) * 31) + x7.Zo(this.vy)) * 31;
        String str12 = this.P8;
        int iHashCode27 = (iHashCode26 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num4 = this.ei;
        int iHashCode28 = (iHashCode27 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.nw;
        int iHashCode29 = (iHashCode28 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.SI;
        int iHashCode30 = (iHashCode29 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str13 = this.KD;
        int iHashCode31 = (iHashCode30 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Long l9 = this.ro;
        int iHashCode32 = (iHashCode31 + (l9 == null ? 0 : l9.hashCode())) * 31;
        Long l10 = this.cn;
        int iHashCode33 = (iHashCode32 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str14 = this.sh;
        int iHashCode34 = (iHashCode33 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.cb;
        int iHashCode35 = (iHashCode34 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Integer num7 = this.dx;
        int iHashCode36 = (iHashCode35 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str16 = this.sG;
        int iHashCode37 = iHashCode36 + (str16 == null ? 0 : str16.hashCode());
        r0 r0Var = this.ef;
        int iHashCode38 = ((((iHashCode37 * 31) + (r0Var == null ? 0 : r0Var.hashCode())) * 31) + x7.Hw(this.Sf)) * 31;
        Long l11 = this.vJ;
        int iHashCode39 = (iHashCode38 + (l11 == null ? 0 : l11.hashCode())) * 31;
        v7 v7Var = this.DW;
        if (v7Var != null && !v7Var.FH()) {
            iHashCode2 = this.DW.hashCode();
        }
        return iHashCode39 + iHashCode2;
    }

    @Override // com.google.android.gms.internal.measurement.z7
    public final /* synthetic */ z7 j6(q7 q7Var) throws y7 {
        while (true) {
            int iJ8 = q7Var.J8();
            switch (iJ8) {
                case 0:
                    return this;
                case 8:
                    this.FH = Integer.valueOf(q7Var.QX());
                    break;
                case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
                    int iJ6 = c8.j6(q7Var, 18);
                    f1[] f1VarArr = this.Hw;
                    int length = f1VarArr == null ? 0 : f1VarArr.length;
                    int i = iJ6 + length;
                    f1[] f1VarArr2 = new f1[i];
                    if (length != 0) {
                        System.arraycopy(this.Hw, 0, f1VarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        f1VarArr2[length] = new f1();
                        q7Var.Hw(f1VarArr2[length]);
                        q7Var.J8();
                        length++;
                    }
                    f1VarArr2[length] = new f1();
                    q7Var.Hw(f1VarArr2[length]);
                    this.Hw = f1VarArr2;
                    break;
                case 26:
                    int iJ62 = c8.j6(q7Var, 26);
                    l1[] l1VarArr = this.v5;
                    int length2 = l1VarArr == null ? 0 : l1VarArr.length;
                    int i2 = iJ62 + length2;
                    l1[] l1VarArr2 = new l1[i2];
                    if (length2 != 0) {
                        System.arraycopy(this.v5, 0, l1VarArr2, 0, length2);
                    }
                    while (length2 < i2 - 1) {
                        l1VarArr2[length2] = new l1();
                        q7Var.Hw(l1VarArr2[length2]);
                        q7Var.J8();
                        length2++;
                    }
                    l1VarArr2[length2] = new l1();
                    q7Var.Hw(l1VarArr2[length2]);
                    this.v5 = l1VarArr2;
                    break;
                case 32:
                    this.Zo = Long.valueOf(q7Var.XL());
                    break;
                case 40:
                    this.VH = Long.valueOf(q7Var.XL());
                    break;
                case 48:
                    this.gn = Long.valueOf(q7Var.XL());
                    break;
                case 56:
                    this.tp = Long.valueOf(q7Var.XL());
                    break;
                case 66:
                    this.EQ = q7Var.DW();
                    break;
                case 74:
                    this.we = q7Var.DW();
                    break;
                case 82:
                    this.J0 = q7Var.DW();
                    break;
                case 90:
                    this.J8 = q7Var.DW();
                    break;
                case 96:
                    this.Ws = Integer.valueOf(q7Var.QX());
                    break;
                case 106:
                    this.QX = q7Var.DW();
                    break;
                case 114:
                    this.XL = q7Var.DW();
                    break;
                case 130:
                    this.aM = q7Var.DW();
                    break;
                case 136:
                    this.j3 = Long.valueOf(q7Var.XL());
                    break;
                case 144:
                    this.Mr = Long.valueOf(q7Var.XL());
                    break;
                case 154:
                    this.U2 = q7Var.DW();
                    break;
                case 160:
                    this.a8 = Boolean.valueOf(q7Var.Ws());
                    break;
                case 170:
                    this.lg = q7Var.DW();
                    break;
                case 176:
                    this.rN = Long.valueOf(q7Var.XL());
                    break;
                case 184:
                    this.er = Integer.valueOf(q7Var.QX());
                    break;
                case 194:
                    this.yS = q7Var.DW();
                    break;
                case 202:
                    this.gW = q7Var.DW();
                    break;
                case 208:
                    this.u7 = Long.valueOf(q7Var.XL());
                    break;
                case 224:
                    this.BT = Boolean.valueOf(q7Var.Ws());
                    break;
                case 234:
                    int iJ63 = c8.j6(q7Var, 234);
                    d1[] d1VarArr = this.vy;
                    int length3 = d1VarArr == null ? 0 : d1VarArr.length;
                    int i3 = iJ63 + length3;
                    d1[] d1VarArr2 = new d1[i3];
                    if (length3 != 0) {
                        System.arraycopy(this.vy, 0, d1VarArr2, 0, length3);
                    }
                    while (length3 < i3 - 1) {
                        d1VarArr2[length3] = new d1();
                        q7Var.Hw(d1VarArr2[length3]);
                        q7Var.J8();
                        length3++;
                    }
                    d1VarArr2[length3] = new d1();
                    q7Var.Hw(d1VarArr2[length3]);
                    this.vy = d1VarArr2;
                    break;
                case 242:
                    this.P8 = q7Var.DW();
                    break;
                case 248:
                    this.ei = Integer.valueOf(q7Var.QX());
                    break;
                case 256:
                    this.nw = Integer.valueOf(q7Var.QX());
                    break;
                case 264:
                    this.SI = Integer.valueOf(q7Var.QX());
                    break;
                case 274:
                    this.KD = q7Var.DW();
                    break;
                case 280:
                    this.ro = Long.valueOf(q7Var.XL());
                    break;
                case 288:
                    this.cn = Long.valueOf(q7Var.XL());
                    break;
                case 298:
                    this.sh = q7Var.DW();
                    break;
                case 306:
                    this.cb = q7Var.DW();
                    break;
                case 312:
                    this.dx = Integer.valueOf(q7Var.QX());
                    break;
                case 330:
                    this.sG = q7Var.DW();
                    break;
                case 354:
                    r0 r0Var = (r0) q7Var.FH(r0.U2());
                    r0 r0Var2 = this.ef;
                    if (r0Var2 != null) {
                        r0.a aVarJ3 = r0Var2.j3();
                        aVarJ3.tp(r0Var);
                        r0Var = (r0) ((e4) aVarJ3.DW());
                    }
                    this.ef = r0Var;
                    break;
                case 360:
                    int iJ64 = c8.j6(q7Var, 360);
                    int[] iArr = this.Sf;
                    int length4 = iArr == null ? 0 : iArr.length;
                    int i4 = iJ64 + length4;
                    int[] iArr2 = new int[i4];
                    if (length4 != 0) {
                        System.arraycopy(this.Sf, 0, iArr2, 0, length4);
                    }
                    while (length4 < i4 - 1) {
                        iArr2[length4] = q7Var.QX();
                        q7Var.J8();
                        length4++;
                    }
                    iArr2[length4] = q7Var.QX();
                    this.Sf = iArr2;
                    break;
                case 362:
                    int iVH = q7Var.VH(q7Var.QX());
                    int iJ65 = q7Var.j6();
                    int i5 = 0;
                    while (q7Var.lg() > 0) {
                        q7Var.QX();
                        i5++;
                    }
                    q7Var.tp(iJ65);
                    int[] iArr3 = this.Sf;
                    int length5 = iArr3 == null ? 0 : iArr3.length;
                    int i6 = i5 + length5;
                    int[] iArr4 = new int[i6];
                    if (length5 != 0) {
                        System.arraycopy(this.Sf, 0, iArr4, 0, length5);
                    }
                    while (length5 < i6) {
                        iArr4[length5] = q7Var.QX();
                        length5++;
                    }
                    this.Sf = iArr4;
                    q7Var.gn(iVH);
                    break;
                case 368:
                    this.vJ = Long.valueOf(q7Var.XL());
                    break;
                default:
                    if (!super.VH(q7Var, iJ8)) {
                        return this;
                    }
                    break;
            }
        }
    }
}
