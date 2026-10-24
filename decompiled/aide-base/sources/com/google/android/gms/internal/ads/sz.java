package com.google.android.gms.internal.ads;

import com.aide.uidesigner.ProxyTextView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* loaded from: classes.dex */
public final class sz extends j90<sz> {
    private Integer CU;
    private Integer Eq;
    private Integer Xa;
    public Integer g3;
    public Integer oY;
    public Integer sy;
    public Integer vJ;
    public String FH = null;
    public String Hw = null;
    public Long v5 = null;
    private Long Zo = null;
    public Long VH = null;
    public Long gn = null;
    private Long u7 = null;
    private Long tp = null;
    private Long EQ = null;
    private Long we = null;
    private Long J0 = null;
    public Long J8 = null;
    private String Ws = null;
    public Long QX = null;
    public Long XL = null;
    public Long aM = null;
    public Long j3 = null;
    private Long Mr = null;
    private Long U2 = null;
    public Long a8 = null;
    public Long lg = null;
    public Long rN = null;
    public String er = null;
    public String yS = null;
    public Long gW = null;
    public Long BT = null;
    public Long vy = null;
    public String P8 = null;
    public Long ei = null;
    public Long nw = null;
    public Long SI = null;
    private p20 KD = null;
    public Long ro = null;
    public Long cn = null;
    public Long sh = null;
    public Long cb = null;
    public Long dx = null;
    public Long sG = null;
    public String ef = null;
    public String Sf = null;
    public Long Mz = null;
    public Long I = null;
    public Long ca = null;
    private Long x9 = null;
    private Long Qq = null;
    public s00 aj = null;
    public s00[] lp = s00.EQ();
    public p10 OW = null;
    private Long br = null;
    public Long XX = null;
    public Long kQ = null;
    public Long yO = null;
    public Long XG = null;
    public Long jJ = null;
    public String wc = null;
    private Long et = null;
    public n50 hz = null;
    private Long aq = null;
    private Long FN = null;
    public String jO = null;
    public Boolean ko = null;
    private String Ev = null;
    public Long ye = null;
    public n40 WB = null;

    public sz() {
        this.j6 = -1;
    }

    private final sz tp(g90 g90Var) throws o90 {
        while (true) {
            int iZo = g90Var.Zo();
            switch (iZo) {
                case 0:
                    return this;
                case 10:
                    this.FH = g90Var.FH();
                    break;
                case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
                    this.Hw = g90Var.FH();
                    break;
                case 24:
                    this.v5 = Long.valueOf(g90Var.EQ());
                    break;
                case 32:
                    this.Zo = Long.valueOf(g90Var.EQ());
                    break;
                case 40:
                    this.VH = Long.valueOf(g90Var.EQ());
                    break;
                case 48:
                    this.gn = Long.valueOf(g90Var.EQ());
                    break;
                case 56:
                    this.u7 = Long.valueOf(g90Var.EQ());
                    break;
                case 64:
                    this.tp = Long.valueOf(g90Var.EQ());
                    break;
                case 72:
                    this.EQ = Long.valueOf(g90Var.EQ());
                    break;
                case 80:
                    this.we = Long.valueOf(g90Var.EQ());
                    break;
                case 88:
                    this.J0 = Long.valueOf(g90Var.EQ());
                    break;
                case 96:
                    this.J8 = Long.valueOf(g90Var.EQ());
                    break;
                case 106:
                    this.Ws = g90Var.FH();
                    break;
                case 112:
                    this.QX = Long.valueOf(g90Var.EQ());
                    break;
                case 120:
                    this.XL = Long.valueOf(g90Var.EQ());
                    break;
                case 128:
                    this.aM = Long.valueOf(g90Var.EQ());
                    break;
                case 136:
                    this.j3 = Long.valueOf(g90Var.EQ());
                    break;
                case 144:
                    this.Mr = Long.valueOf(g90Var.EQ());
                    break;
                case 152:
                    this.U2 = Long.valueOf(g90Var.EQ());
                    break;
                case 160:
                    this.a8 = Long.valueOf(g90Var.EQ());
                    break;
                case 168:
                    this.FN = Long.valueOf(g90Var.EQ());
                    break;
                case 176:
                    this.lg = Long.valueOf(g90Var.EQ());
                    break;
                case 184:
                    this.rN = Long.valueOf(g90Var.EQ());
                    break;
                case 194:
                    this.jO = g90Var.FH();
                    break;
                case 200:
                    this.ye = Long.valueOf(g90Var.EQ());
                    break;
                case 208:
                    int iJ6 = g90Var.j6();
                    try {
                        int iTp = g90Var.tp();
                        if (iTp >= 0 && iTp <= 6) {
                            this.oY = Integer.valueOf(iTp);
                            break;
                        } else {
                            StringBuilder sb = new StringBuilder(44);
                            sb.append(iTp);
                            sb.append(" is not a valid enum DeviceIdType");
                            throw new IllegalArgumentException(sb.toString());
                            break;
                        }
                    } catch (IllegalArgumentException unused) {
                        g90Var.a8(iJ6);
                        u7(g90Var, iZo);
                        break;
                    }
                    break;
                case 218:
                    this.er = g90Var.FH();
                    break;
                case 224:
                    this.ko = Boolean.valueOf(g90Var.u7());
                    break;
                case 234:
                    this.yS = g90Var.FH();
                    break;
                case 242:
                    this.Ev = g90Var.FH();
                    break;
                case 248:
                    this.gW = Long.valueOf(g90Var.EQ());
                    break;
                case 256:
                    this.BT = Long.valueOf(g90Var.EQ());
                    break;
                case 264:
                    this.vy = Long.valueOf(g90Var.EQ());
                    break;
                case 274:
                    this.P8 = g90Var.FH();
                    break;
                case 280:
                    this.ei = Long.valueOf(g90Var.EQ());
                    break;
                case 288:
                    this.nw = Long.valueOf(g90Var.EQ());
                    break;
                case 296:
                    this.SI = Long.valueOf(g90Var.EQ());
                    break;
                case 306:
                    if (this.KD == null) {
                        this.KD = new p20();
                    }
                    g90Var.v5(this.KD);
                    break;
                case 312:
                    this.ro = Long.valueOf(g90Var.EQ());
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 320 */:
                    this.cn = Long.valueOf(g90Var.EQ());
                    break;
                case 328:
                    this.sh = Long.valueOf(g90Var.EQ());
                    break;
                case 336:
                    this.cb = Long.valueOf(g90Var.EQ());
                    break;
                case 346:
                    int iJ62 = t90.j6(g90Var, 346);
                    s00[] s00VarArr = this.lp;
                    int length = s00VarArr == null ? 0 : s00VarArr.length;
                    int i = iJ62 + length;
                    s00[] s00VarArr2 = new s00[i];
                    if (length != 0) {
                        System.arraycopy(this.lp, 0, s00VarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        s00VarArr2[length] = new s00();
                        g90Var.v5(s00VarArr2[length]);
                        g90Var.Zo();
                        length++;
                    }
                    s00VarArr2[length] = new s00();
                    g90Var.v5(s00VarArr2[length]);
                    this.lp = s00VarArr2;
                    break;
                case 352:
                    this.dx = Long.valueOf(g90Var.EQ());
                    break;
                case 360:
                    this.sG = Long.valueOf(g90Var.EQ());
                    break;
                case 370:
                    this.ef = g90Var.FH();
                    break;
                case 378:
                    this.Sf = g90Var.FH();
                    break;
                case 384:
                    int iJ63 = g90Var.j6();
                    try {
                        int iTp2 = g90Var.tp();
                        ry.j6(iTp2);
                        this.vJ = Integer.valueOf(iTp2);
                        break;
                    } catch (IllegalArgumentException unused2) {
                        g90Var.a8(iJ63);
                        u7(g90Var, iZo);
                        break;
                    }
                case 392:
                    int iJ64 = g90Var.j6();
                    try {
                        int iTp3 = g90Var.tp();
                        ry.j6(iTp3);
                        this.g3 = Integer.valueOf(iTp3);
                        break;
                    } catch (IllegalArgumentException unused3) {
                        g90Var.a8(iJ64);
                        u7(g90Var, iZo);
                        break;
                    }
                case 402:
                    if (this.aj == null) {
                        this.aj = new s00();
                    }
                    g90Var.v5(this.aj);
                    break;
                case 408:
                    this.Mz = Long.valueOf(g90Var.EQ());
                    break;
                case 416:
                    this.I = Long.valueOf(g90Var.EQ());
                    break;
                case 424:
                    this.ca = Long.valueOf(g90Var.EQ());
                    break;
                case 432:
                    this.x9 = Long.valueOf(g90Var.EQ());
                    break;
                case 440:
                    this.Qq = Long.valueOf(g90Var.EQ());
                    break;
                case 448:
                    int iJ65 = g90Var.j6();
                    try {
                        int iTp4 = g90Var.tp();
                        ry.j6(iTp4);
                        this.sy = Integer.valueOf(iTp4);
                        break;
                    } catch (IllegalArgumentException unused4) {
                        g90Var.a8(iJ65);
                        u7(g90Var, iZo);
                        break;
                    }
                case 458:
                    if (this.OW == null) {
                        this.OW = new p10();
                    }
                    g90Var.v5(this.OW);
                    break;
                case 464:
                    this.br = Long.valueOf(g90Var.EQ());
                    break;
                case 472:
                    this.XX = Long.valueOf(g90Var.EQ());
                    break;
                case 480:
                    this.kQ = Long.valueOf(g90Var.EQ());
                    break;
                case 488:
                    this.yO = Long.valueOf(g90Var.EQ());
                    break;
                case 496:
                    this.XG = Long.valueOf(g90Var.EQ());
                    break;
                case 504:
                    this.jJ = Long.valueOf(g90Var.EQ());
                    break;
                case 512:
                    this.et = Long.valueOf(g90Var.EQ());
                    break;
                case 520:
                    int iJ66 = g90Var.j6();
                    try {
                        int iTp5 = g90Var.tp();
                        ry.FH(iTp5);
                        this.CU = Integer.valueOf(iTp5);
                        break;
                    } catch (IllegalArgumentException unused5) {
                        g90Var.a8(iJ66);
                        u7(g90Var, iZo);
                        break;
                    }
                case 528:
                    int iJ67 = g90Var.j6();
                    try {
                        int iTp6 = g90Var.tp();
                        ry.DW(iTp6);
                        this.Xa = Integer.valueOf(iTp6);
                        break;
                    } catch (IllegalArgumentException unused6) {
                        g90Var.a8(iJ67);
                        u7(g90Var, iZo);
                        break;
                    }
                case 538:
                    this.wc = g90Var.FH();
                    break;
                case 544:
                    int iJ68 = g90Var.j6();
                    try {
                        int iTp7 = g90Var.tp();
                        if (iTp7 >= 0 && iTp7 <= 3) {
                            this.Eq = Integer.valueOf(iTp7);
                            break;
                        } else {
                            StringBuilder sb2 = new StringBuilder(45);
                            sb2.append(iTp7);
                            sb2.append(" is not a valid enum DebuggerState");
                            throw new IllegalArgumentException(sb2.toString());
                            break;
                        }
                    } catch (IllegalArgumentException unused7) {
                        g90Var.a8(iJ68);
                        u7(g90Var, iZo);
                        break;
                    }
                case 554:
                    if (this.hz == null) {
                        this.hz = new n50();
                    }
                    g90Var.v5(this.hz);
                    break;
                case 560:
                    this.aq = Long.valueOf(g90Var.EQ());
                    break;
                case 1610:
                    if (this.WB == null) {
                        this.WB = new n40();
                    }
                    g90Var.v5(this.WB);
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
        String str = this.FH;
        if (str != null) {
            h90Var.EQ(1, str);
        }
        String str2 = this.Hw;
        if (str2 != null) {
            h90Var.EQ(2, str2);
        }
        Long l = this.v5;
        if (l != null) {
            h90Var.rN(3, l.longValue());
        }
        Long l2 = this.Zo;
        if (l2 != null) {
            h90Var.rN(4, l2.longValue());
        }
        Long l3 = this.VH;
        if (l3 != null) {
            h90Var.rN(5, l3.longValue());
        }
        Long l4 = this.gn;
        if (l4 != null) {
            h90Var.rN(6, l4.longValue());
        }
        Long l5 = this.u7;
        if (l5 != null) {
            h90Var.rN(7, l5.longValue());
        }
        Long l6 = this.tp;
        if (l6 != null) {
            h90Var.rN(8, l6.longValue());
        }
        Long l7 = this.EQ;
        if (l7 != null) {
            h90Var.rN(9, l7.longValue());
        }
        Long l8 = this.we;
        if (l8 != null) {
            h90Var.rN(10, l8.longValue());
        }
        Long l9 = this.J0;
        if (l9 != null) {
            h90Var.rN(11, l9.longValue());
        }
        Long l10 = this.J8;
        if (l10 != null) {
            h90Var.rN(12, l10.longValue());
        }
        String str3 = this.Ws;
        if (str3 != null) {
            h90Var.EQ(13, str3);
        }
        Long l11 = this.QX;
        if (l11 != null) {
            h90Var.rN(14, l11.longValue());
        }
        Long l12 = this.XL;
        if (l12 != null) {
            h90Var.rN(15, l12.longValue());
        }
        Long l13 = this.aM;
        if (l13 != null) {
            h90Var.rN(16, l13.longValue());
        }
        Long l14 = this.j3;
        if (l14 != null) {
            h90Var.rN(17, l14.longValue());
        }
        Long l15 = this.Mr;
        if (l15 != null) {
            h90Var.rN(18, l15.longValue());
        }
        Long l16 = this.U2;
        if (l16 != null) {
            h90Var.rN(19, l16.longValue());
        }
        Long l17 = this.a8;
        if (l17 != null) {
            h90Var.rN(20, l17.longValue());
        }
        Long l18 = this.FN;
        if (l18 != null) {
            h90Var.rN(21, l18.longValue());
        }
        Long l19 = this.lg;
        if (l19 != null) {
            h90Var.rN(22, l19.longValue());
        }
        Long l20 = this.rN;
        if (l20 != null) {
            h90Var.rN(23, l20.longValue());
        }
        String str4 = this.jO;
        if (str4 != null) {
            h90Var.EQ(24, str4);
        }
        Long l21 = this.ye;
        if (l21 != null) {
            h90Var.rN(25, l21.longValue());
        }
        Integer num = this.oY;
        if (num != null) {
            h90Var.yS(26, num.intValue());
        }
        String str5 = this.er;
        if (str5 != null) {
            h90Var.EQ(27, str5);
        }
        Boolean bool = this.ko;
        if (bool != null) {
            h90Var.Mr(28, bool.booleanValue());
        }
        String str6 = this.yS;
        if (str6 != null) {
            h90Var.EQ(29, str6);
        }
        String str7 = this.Ev;
        if (str7 != null) {
            h90Var.EQ(30, str7);
        }
        Long l22 = this.gW;
        if (l22 != null) {
            h90Var.rN(31, l22.longValue());
        }
        Long l23 = this.BT;
        if (l23 != null) {
            h90Var.rN(32, l23.longValue());
        }
        Long l24 = this.vy;
        if (l24 != null) {
            h90Var.rN(33, l24.longValue());
        }
        String str8 = this.P8;
        if (str8 != null) {
            h90Var.EQ(34, str8);
        }
        Long l25 = this.ei;
        if (l25 != null) {
            h90Var.rN(35, l25.longValue());
        }
        Long l26 = this.nw;
        if (l26 != null) {
            h90Var.rN(36, l26.longValue());
        }
        Long l27 = this.SI;
        if (l27 != null) {
            h90Var.rN(37, l27.longValue());
        }
        p20 p20Var = this.KD;
        if (p20Var != null) {
            h90Var.DW(38, p20Var);
        }
        Long l28 = this.ro;
        if (l28 != null) {
            h90Var.rN(39, l28.longValue());
        }
        Long l29 = this.cn;
        if (l29 != null) {
            h90Var.rN(40, l29.longValue());
        }
        Long l30 = this.sh;
        if (l30 != null) {
            h90Var.rN(41, l30.longValue());
        }
        Long l31 = this.cb;
        if (l31 != null) {
            h90Var.rN(42, l31.longValue());
        }
        s00[] s00VarArr = this.lp;
        if (s00VarArr != null && s00VarArr.length > 0) {
            int i = 0;
            while (true) {
                s00[] s00VarArr2 = this.lp;
                if (i >= s00VarArr2.length) {
                    break;
                }
                s00 s00Var = s00VarArr2[i];
                if (s00Var != null) {
                    h90Var.DW(43, s00Var);
                }
                i++;
            }
        }
        Long l32 = this.dx;
        if (l32 != null) {
            h90Var.rN(44, l32.longValue());
        }
        Long l33 = this.sG;
        if (l33 != null) {
            h90Var.rN(45, l33.longValue());
        }
        String str9 = this.ef;
        if (str9 != null) {
            h90Var.EQ(46, str9);
        }
        String str10 = this.Sf;
        if (str10 != null) {
            h90Var.EQ(47, str10);
        }
        Integer num2 = this.vJ;
        if (num2 != null) {
            h90Var.yS(48, num2.intValue());
        }
        Integer num3 = this.g3;
        if (num3 != null) {
            h90Var.yS(49, num3.intValue());
        }
        s00 s00Var2 = this.aj;
        if (s00Var2 != null) {
            h90Var.DW(50, s00Var2);
        }
        Long l34 = this.Mz;
        if (l34 != null) {
            h90Var.rN(51, l34.longValue());
        }
        Long l35 = this.I;
        if (l35 != null) {
            h90Var.rN(52, l35.longValue());
        }
        Long l36 = this.ca;
        if (l36 != null) {
            h90Var.rN(53, l36.longValue());
        }
        Long l37 = this.x9;
        if (l37 != null) {
            h90Var.rN(54, l37.longValue());
        }
        Long l38 = this.Qq;
        if (l38 != null) {
            h90Var.rN(55, l38.longValue());
        }
        Integer num4 = this.sy;
        if (num4 != null) {
            h90Var.yS(56, num4.intValue());
        }
        p10 p10Var = this.OW;
        if (p10Var != null) {
            h90Var.DW(57, p10Var);
        }
        Long l39 = this.br;
        if (l39 != null) {
            h90Var.rN(58, l39.longValue());
        }
        Long l40 = this.XX;
        if (l40 != null) {
            h90Var.rN(59, l40.longValue());
        }
        Long l41 = this.kQ;
        if (l41 != null) {
            h90Var.rN(60, l41.longValue());
        }
        Long l42 = this.yO;
        if (l42 != null) {
            h90Var.rN(61, l42.longValue());
        }
        Long l43 = this.XG;
        if (l43 != null) {
            h90Var.rN(62, l43.longValue());
        }
        Long l44 = this.jJ;
        if (l44 != null) {
            h90Var.rN(63, l44.longValue());
        }
        Long l45 = this.et;
        if (l45 != null) {
            h90Var.rN(64, l45.longValue());
        }
        Integer num5 = this.CU;
        if (num5 != null) {
            h90Var.yS(65, num5.intValue());
        }
        Integer num6 = this.Xa;
        if (num6 != null) {
            h90Var.yS(66, num6.intValue());
        }
        String str11 = this.wc;
        if (str11 != null) {
            h90Var.EQ(67, str11);
        }
        Integer num7 = this.Eq;
        if (num7 != null) {
            h90Var.yS(68, num7.intValue());
        }
        n50 n50Var = this.hz;
        if (n50Var != null) {
            h90Var.DW(69, n50Var);
        }
        Long l46 = this.aq;
        if (l46 != null) {
            h90Var.rN(70, l46.longValue());
        }
        n40 n40Var = this.WB;
        if (n40Var != null) {
            h90Var.DW(201, n40Var);
        }
        super.Hw(h90Var);
    }

    @Override // com.google.android.gms.internal.ads.j90, com.google.android.gms.internal.ads.p90
    protected final int gn() {
        int iGn = super.gn();
        String str = this.FH;
        if (str != null) {
            iGn += h90.QX(1, str);
        }
        String str2 = this.Hw;
        if (str2 != null) {
            iGn += h90.QX(2, str2);
        }
        Long l = this.v5;
        if (l != null) {
            iGn += h90.U2(3, l.longValue());
        }
        Long l2 = this.Zo;
        if (l2 != null) {
            iGn += h90.U2(4, l2.longValue());
        }
        Long l3 = this.VH;
        if (l3 != null) {
            iGn += h90.U2(5, l3.longValue());
        }
        Long l4 = this.gn;
        if (l4 != null) {
            iGn += h90.U2(6, l4.longValue());
        }
        Long l5 = this.u7;
        if (l5 != null) {
            iGn += h90.U2(7, l5.longValue());
        }
        Long l6 = this.tp;
        if (l6 != null) {
            iGn += h90.U2(8, l6.longValue());
        }
        Long l7 = this.EQ;
        if (l7 != null) {
            iGn += h90.U2(9, l7.longValue());
        }
        Long l8 = this.we;
        if (l8 != null) {
            iGn += h90.U2(10, l8.longValue());
        }
        Long l9 = this.J0;
        if (l9 != null) {
            iGn += h90.U2(11, l9.longValue());
        }
        Long l10 = this.J8;
        if (l10 != null) {
            iGn += h90.U2(12, l10.longValue());
        }
        String str3 = this.Ws;
        if (str3 != null) {
            iGn += h90.QX(13, str3);
        }
        Long l11 = this.QX;
        if (l11 != null) {
            iGn += h90.U2(14, l11.longValue());
        }
        Long l12 = this.XL;
        if (l12 != null) {
            iGn += h90.U2(15, l12.longValue());
        }
        Long l13 = this.aM;
        if (l13 != null) {
            iGn += h90.U2(16, l13.longValue());
        }
        Long l14 = this.j3;
        if (l14 != null) {
            iGn += h90.U2(17, l14.longValue());
        }
        Long l15 = this.Mr;
        if (l15 != null) {
            iGn += h90.U2(18, l15.longValue());
        }
        Long l16 = this.U2;
        if (l16 != null) {
            iGn += h90.U2(19, l16.longValue());
        }
        Long l17 = this.a8;
        if (l17 != null) {
            iGn += h90.U2(20, l17.longValue());
        }
        Long l18 = this.FN;
        if (l18 != null) {
            iGn += h90.U2(21, l18.longValue());
        }
        Long l19 = this.lg;
        if (l19 != null) {
            iGn += h90.U2(22, l19.longValue());
        }
        Long l20 = this.rN;
        if (l20 != null) {
            iGn += h90.U2(23, l20.longValue());
        }
        String str4 = this.jO;
        if (str4 != null) {
            iGn += h90.QX(24, str4);
        }
        Long l21 = this.ye;
        if (l21 != null) {
            iGn += h90.U2(25, l21.longValue());
        }
        Integer num = this.oY;
        if (num != null) {
            iGn += h90.vy(26, num.intValue());
        }
        String str5 = this.er;
        if (str5 != null) {
            iGn += h90.QX(27, str5);
        }
        Boolean bool = this.ko;
        if (bool != null) {
            bool.booleanValue();
            iGn += h90.we(28) + 1;
        }
        String str6 = this.yS;
        if (str6 != null) {
            iGn += h90.QX(29, str6);
        }
        String str7 = this.Ev;
        if (str7 != null) {
            iGn += h90.QX(30, str7);
        }
        Long l22 = this.gW;
        if (l22 != null) {
            iGn += h90.U2(31, l22.longValue());
        }
        Long l23 = this.BT;
        if (l23 != null) {
            iGn += h90.U2(32, l23.longValue());
        }
        Long l24 = this.vy;
        if (l24 != null) {
            iGn += h90.U2(33, l24.longValue());
        }
        String str8 = this.P8;
        if (str8 != null) {
            iGn += h90.QX(34, str8);
        }
        Long l25 = this.ei;
        if (l25 != null) {
            iGn += h90.U2(35, l25.longValue());
        }
        Long l26 = this.nw;
        if (l26 != null) {
            iGn += h90.U2(36, l26.longValue());
        }
        Long l27 = this.SI;
        if (l27 != null) {
            iGn += h90.U2(37, l27.longValue());
        }
        p20 p20Var = this.KD;
        if (p20Var != null) {
            iGn += h90.v5(38, p20Var);
        }
        Long l28 = this.ro;
        if (l28 != null) {
            iGn += h90.U2(39, l28.longValue());
        }
        Long l29 = this.cn;
        if (l29 != null) {
            iGn += h90.U2(40, l29.longValue());
        }
        Long l30 = this.sh;
        if (l30 != null) {
            iGn += h90.U2(41, l30.longValue());
        }
        Long l31 = this.cb;
        if (l31 != null) {
            iGn += h90.U2(42, l31.longValue());
        }
        s00[] s00VarArr = this.lp;
        if (s00VarArr != null && s00VarArr.length > 0) {
            int i = 0;
            while (true) {
                s00[] s00VarArr2 = this.lp;
                if (i >= s00VarArr2.length) {
                    break;
                }
                s00 s00Var = s00VarArr2[i];
                if (s00Var != null) {
                    iGn += h90.v5(43, s00Var);
                }
                i++;
            }
        }
        Long l32 = this.dx;
        if (l32 != null) {
            iGn += h90.U2(44, l32.longValue());
        }
        Long l33 = this.sG;
        if (l33 != null) {
            iGn += h90.U2(45, l33.longValue());
        }
        String str9 = this.ef;
        if (str9 != null) {
            iGn += h90.QX(46, str9);
        }
        String str10 = this.Sf;
        if (str10 != null) {
            iGn += h90.QX(47, str10);
        }
        Integer num2 = this.vJ;
        if (num2 != null) {
            iGn += h90.vy(48, num2.intValue());
        }
        Integer num3 = this.g3;
        if (num3 != null) {
            iGn += h90.vy(49, num3.intValue());
        }
        s00 s00Var2 = this.aj;
        if (s00Var2 != null) {
            iGn += h90.v5(50, s00Var2);
        }
        Long l34 = this.Mz;
        if (l34 != null) {
            iGn += h90.U2(51, l34.longValue());
        }
        Long l35 = this.I;
        if (l35 != null) {
            iGn += h90.U2(52, l35.longValue());
        }
        Long l36 = this.ca;
        if (l36 != null) {
            iGn += h90.U2(53, l36.longValue());
        }
        Long l37 = this.x9;
        if (l37 != null) {
            iGn += h90.U2(54, l37.longValue());
        }
        Long l38 = this.Qq;
        if (l38 != null) {
            iGn += h90.U2(55, l38.longValue());
        }
        Integer num4 = this.sy;
        if (num4 != null) {
            iGn += h90.vy(56, num4.intValue());
        }
        p10 p10Var = this.OW;
        if (p10Var != null) {
            iGn += h90.v5(57, p10Var);
        }
        Long l39 = this.br;
        if (l39 != null) {
            iGn += h90.U2(58, l39.longValue());
        }
        Long l40 = this.XX;
        if (l40 != null) {
            iGn += h90.U2(59, l40.longValue());
        }
        Long l41 = this.kQ;
        if (l41 != null) {
            iGn += h90.U2(60, l41.longValue());
        }
        Long l42 = this.yO;
        if (l42 != null) {
            iGn += h90.U2(61, l42.longValue());
        }
        Long l43 = this.XG;
        if (l43 != null) {
            iGn += h90.U2(62, l43.longValue());
        }
        Long l44 = this.jJ;
        if (l44 != null) {
            iGn += h90.U2(63, l44.longValue());
        }
        Long l45 = this.et;
        if (l45 != null) {
            iGn += h90.U2(64, l45.longValue());
        }
        Integer num5 = this.CU;
        if (num5 != null) {
            iGn += h90.vy(65, num5.intValue());
        }
        Integer num6 = this.Xa;
        if (num6 != null) {
            iGn += h90.vy(66, num6.intValue());
        }
        String str11 = this.wc;
        if (str11 != null) {
            iGn += h90.QX(67, str11);
        }
        Integer num7 = this.Eq;
        if (num7 != null) {
            iGn += h90.vy(68, num7.intValue());
        }
        n50 n50Var = this.hz;
        if (n50Var != null) {
            iGn += h90.v5(69, n50Var);
        }
        Long l46 = this.aq;
        if (l46 != null) {
            iGn += h90.U2(70, l46.longValue());
        }
        n40 n40Var = this.WB;
        return n40Var != null ? iGn + h90.v5(201, n40Var) : iGn;
    }

    @Override // com.google.android.gms.internal.ads.p90
    public final /* synthetic */ p90 j6(g90 g90Var) throws o90 {
        tp(g90Var);
        return this;
    }
}
