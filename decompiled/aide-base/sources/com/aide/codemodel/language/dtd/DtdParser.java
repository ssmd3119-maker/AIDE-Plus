package com.aide.codemodel.language.dtd;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.codemodel.api.EntitySpace;
import com.aide.codemodel.api.ErrorTable;
import com.aide.codemodel.api.IdentifierSpace;
import com.aide.codemodel.api.Parser;
import com.aide.codemodel.api.collections.SetOfInt;
import com.aide.uidesigner.ProxyTextView;

@cy(clazz = -1162469639836569625L, container = -1162469639836569625L, user = true)
/* loaded from: classes.dex */
public class DtdParser extends Parser {

    @fy
    private static /* synthetic */ boolean P8;

    @gy
    private static /* synthetic */ boolean ei;

    @dy(field = -2248016811088733157L)
    private final int BT;

    @dy(field = -1440653098181724729L)
    private final int a8;

    @dy(field = 3917364331980763825L)
    private final int er;

    @dy(field = 3529751355260297068L)
    private final int gW;

    @dy(field = 3324027051133583808L)
    private final int lg;

    @dy(field = -4657868300651290483L)
    private final int rN;

    @dy(field = 915668033622266419L)
    private SetOfInt vy;

    @dy(field = -1218745523569517055L)
    private final int yS;

    static {
        iy.Zo(DtdParser.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 2849350945506680340L)
    public DtdParser(IdentifierSpace identifierSpace, ErrorTable errorTable, EntitySpace entitySpace, DtdSyntax dtdSyntax) {
        super(identifierSpace, errorTable, entitySpace, dtdSyntax, 218, 0);
        try {
            if (P8) {
                iy.J0(-8058989206047541657L, null, identifierSpace, errorTable, entitySpace, dtdSyntax);
            }
            this.vy = new SetOfInt();
            this.a8 = identifierSpace.get("O");
            this.lg = identifierSpace.get("ANY");
            this.rN = identifierSpace.get("EMPTY");
            this.er = identifierSpace.get("PUBLIC");
            this.yS = identifierSpace.get("SYSTEM");
            this.gW = identifierSpace.get("NOTATION");
            this.BT = identifierSpace.get("CDATA");
            this.vy.put(identifierSpace.get("CDATA"));
            this.vy.put(identifierSpace.get("IDREF"));
            this.vy.put(identifierSpace.get("IDREFS"));
            this.vy.put(identifierSpace.get("ENTITY"));
            this.vy.put(identifierSpace.get("ENTITIES"));
            this.vy.put(identifierSpace.get("NMTOKEN"));
            this.vy.put(identifierSpace.get("ID"));
            this.vy.put(identifierSpace.get("NAME"));
            this.vy.put(identifierSpace.get("NUMBER"));
        } catch (Throwable th) {
            if (ei) {
                iy.a8(th, -8058989206047541657L, null, identifierSpace, errorTable, entitySpace, dtdSyntax);
            }
            throw th;
        }
    }

    @ey(method = -515931611578075017L)
    private void BT() {
        try {
            if (P8) {
                iy.gn(1357810587812067907L, this);
            }
            J0(15);
            int i = 1;
            while (this.u7 == 16) {
                we();
                i++;
            }
            J0(17);
            QX(220, i + 1);
        } catch (Throwable th) {
            if (ei) {
                iy.aM(th, 1357810587812067907L, this);
            }
            throw th;
        }
    }

    @ey(method = 1802532959432121504L)
    private void KD(String str) {
        try {
            if (P8) {
                iy.tp(3949953896239379280L, this, str);
            }
            if (this.VH) {
                int i = this.J8[this.tp];
                int i2 = this.J8[this.tp];
                this.DW.j3(this.gn.getFile(), this.gn.getLanguage(), i, this.QX[this.tp], i2, this.XL[this.tp], str, 0);
            }
        } catch (Throwable th) {
            if (ei) {
                iy.j3(th, 3949953896239379280L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -6155619613212503168L)
    private void P8() {
        boolean z;
        try {
            if (P8) {
                iy.gn(-4557485793605034528L, this);
            }
            we();
            sG();
            int i = this.u7;
            if (i == 30) {
                we();
            } else {
                if (i != 34) {
                    Hw();
                    throw new Parser.a();
                }
                gW();
            }
            sG();
            int i2 = 2;
            if ((Sf(0, this.a8) || this.u7 == 22) && U2(1) == 10 && ((Sf(2, this.a8) || U2(2) == 22) && U2(3) == 10)) {
                we();
                sG();
                we();
                i2 = 4;
                sG();
                z = true;
            } else {
                z = false;
            }
            if (Sf(0, this.rN) || Sf(0, this.lg)) {
                we();
            } else {
                yS();
            }
            int i3 = i2 + 1;
            sG();
            if (this.u7 == 37 || this.u7 == 22) {
                we();
                yS();
                i3 = i3 + 1 + 1;
            }
            J0(26);
            QX(z ? 208 : 207, i3 + 1);
        } catch (Throwable th) {
            if (ei) {
                iy.aM(th, -4557485793605034528L, this);
            }
            throw th;
        }
    }

    @ey(method = 5440333129732992592L)
    private void SI() {
        try {
            if (P8) {
                iy.gn(1323998637114718752L, this);
            }
            we();
            sG();
            int i = 1;
            while (this.u7 == 30) {
                we();
                int i2 = i + 1;
                sG();
                if (this.u7 != 33) {
                    J0(35);
                    QX(217, i2 + 1);
                    return;
                } else {
                    we();
                    i = i2 + 1;
                    sG();
                }
            }
            Hw();
            throw new Parser.a();
        } catch (Throwable th) {
            if (ei) {
                iy.aM(th, 1323998637114718752L, this);
            }
            throw th;
        }
    }

    @ey(method = 2694733702110792640L)
    private boolean Sf(int i, int i2) {
        try {
            if (P8) {
                iy.EQ(-5804986549094447616L, this, new Integer(i), new Integer(i2));
            }
            if (U2(i) == 30) {
                if (ro(VH(i), i2)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (ei) {
                iy.Mr(th, -5804986549094447616L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 1534202321774897516L)
    private void cb() {
        try {
            if (P8) {
                iy.gn(4766417325132142212L, this);
            }
            Hw();
            throw new Parser.a();
        } catch (Throwable th) {
            if (ei) {
                iy.aM(th, 4766417325132142212L, this);
            }
            throw th;
        }
    }

    @ey(method = -4793535860373445135L)
    private void cn() {
        try {
            if (P8) {
                iy.gn(5003457991137630381L, this);
            }
            we();
            sG();
            J0(47);
            int i = 3;
            while (this.u7 == 49) {
                we();
                i++;
            }
            J0(48);
            QX(214, i + 1);
        } catch (Throwable th) {
            if (ei) {
                iy.aM(th, 5003457991137630381L, this);
            }
            throw th;
        }
    }

    @ey(method = -2778684717554249361L)
    private void dx() {
        try {
            if (P8) {
                iy.gn(-6320811692344004141L, this);
            }
            we();
            sG();
            nw();
            sG();
            if (this.u7 != 18 && this.u7 != 19) {
                QX(205, 2);
                return;
            }
            nw();
            QX(205, 3);
        } catch (Throwable th) {
            if (ei) {
                iy.aM(th, -6320811692344004141L, this);
            }
            throw th;
        }
    }

    @ey(method = -889084695346750925L)
    private void ef() {
        try {
            if (P8) {
                iy.gn(-4451397497817043521L, this);
            }
            we();
            sG();
            nw();
            QX(206, 2);
        } catch (Throwable th) {
            if (ei) {
                iy.aM(th, -4451397497817043521L, this);
            }
            throw th;
        }
    }

    @ey(method = 4467129504798036319L)
    private void ei() {
        int i;
        boolean z;
        try {
            if (P8) {
                iy.gn(994603492328944779L, this);
            }
            we();
            sG();
            if (this.u7 == 20) {
                we();
                i = 2;
                sG();
                z = true;
            } else {
                i = 1;
                z = false;
            }
            if (this.u7 != 30) {
                Hw();
                throw new Parser.a();
            }
            we();
            int i2 = i + 1;
            sG();
            if (Sf(0, this.er)) {
                dx();
            } else if (Sf(0, this.yS)) {
                ef();
            } else if (Sf(0, this.BT)) {
                we();
                i2++;
                sG();
                nw();
            } else {
                nw();
            }
            int i3 = i2 + 1;
            sG();
            J0(26);
            QX(z ? 202 : 203, i3 + 1);
        } catch (Throwable th) {
            if (ei) {
                iy.aM(th, 994603492328944779L, this);
            }
            throw th;
        }
    }

    @ey(method = -3933722471949007703L)
    private void er() {
        try {
            if (P8) {
                iy.gn(4263465028481309525L, this);
            }
            we();
            sG();
            int i = this.u7;
            if (i == 30) {
                int iQX = this.FH.QX(Zo());
                if (iQX == this.gW) {
                    cb();
                    throw null;
                }
                if (this.vy.contains(iQX)) {
                    we();
                } else {
                    KD("Unknown type: " + this.FH.getString(iQX));
                    we();
                }
            } else {
                if (i != 34) {
                    Hw();
                    throw new Parser.a();
                }
                SI();
            }
            sG();
            int i2 = this.u7;
            int i3 = 3;
            if (i2 == 18 || i2 == 19) {
                nw();
            } else if (i2 == 30) {
                we();
            } else if (i2 != 41) {
                if (i2 != 38 && i2 != 39) {
                    Hw();
                    throw new Parser.a();
                }
                we();
            } else {
                we();
                sG();
                nw();
                i3 = 4;
            }
            QX(216, i3);
        } catch (Throwable th) {
            if (ei) {
                iy.aM(th, 4263465028481309525L, this);
            }
            throw th;
        }
    }

    @ey(method = -478832114477811835L)
    private void gW() {
        try {
            if (P8) {
                iy.gn(1985591033963033121L, this);
            }
            J0(34);
            char c = 0;
            int i = 1;
            while (true) {
                sG();
                int i2 = this.u7;
                if (i2 != 30 && i2 != 34 && i2 != 40) {
                    Hw();
                    throw new Parser.a();
                }
                yS();
                int i3 = i + 1;
                sG();
                int i4 = this.u7;
                if (i4 == 33) {
                    we();
                    if (c <= 0 || c == '!') {
                        c = '!';
                    } else {
                        DW("Unexpected |");
                    }
                } else {
                    if (i4 == 35) {
                        J0(35);
                        int i5 = i3 + 1;
                        if (c == '!') {
                            QX(210, i5);
                            return;
                        } else if (c != '2') {
                            QX(211, i5);
                            return;
                        } else {
                            QX(212, i5);
                            return;
                        }
                    }
                    if (i4 == 42) {
                        we();
                        if (c <= 0 || c == '*') {
                            c = '*';
                        } else {
                            DW("Unexpected ,");
                        }
                    } else {
                        if (i4 != 50) {
                            Hw();
                            throw new Parser.a();
                        }
                        we();
                        if (c <= 0 || c == '2') {
                            c = '2';
                        } else {
                            DW("Unexpected &");
                        }
                    }
                }
                i = i3 + 1;
            }
        } catch (Throwable th) {
            if (ei) {
                iy.aM(th, 1985591033963033121L, this);
            }
            throw th;
        }
    }

    @ey(method = 3153983164325013900L)
    private void nw() {
        try {
            if (P8) {
                iy.gn(-3628487493762260012L, this);
            }
            if (this.u7 != 18 && this.u7 != 19) {
                Hw();
                throw new Parser.a();
            }
            int i = this.u7;
            we();
            int i2 = 1;
            while (this.u7 != i) {
                switch (this.u7) {
                    case 27:
                    case 28:
                    case 29:
                    case 31:
                        we();
                        i2++;
                    case 30:
                    default:
                        Hw();
                        throw new Parser.a();
                }
            }
            J0(i);
            QX(204, i2 + 1);
        } catch (Throwable th) {
            if (ei) {
                iy.aM(th, -3628487493762260012L, this);
            }
            throw th;
        }
    }

    @ey(method = 2379350995277557257L)
    private void rN() {
        try {
            if (P8) {
                iy.gn(4074149799219839517L, this);
            }
            we();
            sG();
            int i = this.u7;
            if (i == 30) {
                we();
            } else {
                if (i != 34) {
                    Hw();
                    throw new Parser.a();
                }
                gW();
            }
            int i2 = 2;
            sG();
            while (this.u7 == 30) {
                er();
                i2++;
                sG();
            }
            J0(26);
            QX(215, i2 + 1);
        } catch (Throwable th) {
            if (ei) {
                iy.aM(th, 4074149799219839517L, this);
            }
            throw th;
        }
    }

    @ey(method = -197092533987665820L)
    private boolean ro(int i, int i2) {
        try {
            if (P8) {
                iy.EQ(934109331240808892L, this, new Integer(i), new Integer(i2));
            }
            return this.FH.QX(i) == i2;
        } catch (Throwable th) {
            if (ei) {
                iy.Mr(th, 934109331240808892L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 5868027777078191325L)
    private void sG() {
        try {
            if (P8) {
                iy.gn(1692425397205761057L, this);
            }
            while (true) {
                int i = this.u7;
                if (i != 10) {
                    switch (i) {
                        case 15:
                        case 16:
                        case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                            break;
                        default:
                            return;
                    }
                }
                J8();
            }
        } catch (Throwable th) {
            if (ei) {
                iy.aM(th, 1692425397205761057L, this);
            }
            throw th;
        }
    }

    @ey(method = -494052386418624975L)
    private void sh() {
        try {
            if (P8) {
                iy.gn(-4651426713394058675L, this);
            }
            we();
            sG();
            J0(47);
            vy(true);
            J0(48);
            QX(213, 5);
        } catch (Throwable th) {
            if (ei) {
                iy.aM(th, -4651426713394058675L, this);
            }
            throw th;
        }
    }

    @ey(method = 108733680810615875L)
    private void vJ() {
        int i;
        try {
            if (P8) {
                iy.gn(1987200264179205591L, this);
            }
            we();
            if (this.u7 == 53) {
                we();
                i = 2;
            } else {
                i = 1;
            }
            J0(54);
            QX(219, i + 1);
        } catch (Throwable th) {
            if (ei) {
                iy.aM(th, 1987200264179205591L, this);
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x006a, code lost:
    
        QX(201, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        return;
     */
    @abcd.ey(method = -1409818063489501952L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void vy(boolean r7) {
        /*
            r6 = this;
            r0 = -1384314595600941472(0xecc9ed35afd13e60, double:-1.1172040032886242E216)
            boolean r2 = com.aide.codemodel.language.dtd.DtdParser.P8     // Catch: java.lang.Throwable -> L71
            if (r2 == 0) goto Lc
            abcd.iy.Ws(r0, r6, r7)     // Catch: java.lang.Throwable -> L71
        Lc:
            r2 = 0
        Ld:
            int r3 = r6.j3     // Catch: java.lang.Throwable -> L71
            int r4 = r6.u7     // Catch: com.aide.codemodel.api.Parser.a -> L6e java.lang.Throwable -> L71
            if (r4 == 0) goto L68
            r5 = 46
            if (r4 == r5) goto L48
            r5 = 48
            if (r4 == r5) goto L3e
            switch(r4) {
                case 10: goto L3a;
                case 11: goto L34;
                case 12: goto L30;
                case 13: goto L2c;
                default: goto L1e;
            }     // Catch: com.aide.codemodel.api.Parser.a -> L6e java.lang.Throwable -> L71
        L1e:
            switch(r4) {
                case 15: goto L28;
                case 16: goto L3a;
                case 17: goto L3a;
                default: goto L21;
            }     // Catch: com.aide.codemodel.api.Parser.a -> L6e java.lang.Throwable -> L71
        L21:
            r6.Hw()     // Catch: com.aide.codemodel.api.Parser.a -> L6e java.lang.Throwable -> L71
            r6.J8()     // Catch: com.aide.codemodel.api.Parser.a -> L6e java.lang.Throwable -> L71
            goto Ld
        L28:
            r6.BT()     // Catch: com.aide.codemodel.api.Parser.a -> L6e java.lang.Throwable -> L71
            goto L37
        L2c:
            r6.rN()     // Catch: com.aide.codemodel.api.Parser.a -> L6e java.lang.Throwable -> L71
            goto L37
        L30:
            r6.P8()     // Catch: com.aide.codemodel.api.Parser.a -> L6e java.lang.Throwable -> L71
            goto L37
        L34:
            r6.ei()     // Catch: com.aide.codemodel.api.Parser.a -> L6e java.lang.Throwable -> L71
        L37:
            int r2 = r2 + 1
            goto Ld
        L3a:
            r6.J8()     // Catch: com.aide.codemodel.api.Parser.a -> L6e java.lang.Throwable -> L71
            goto Ld
        L3e:
            if (r7 == 0) goto L41
            goto L68
        L41:
            r6.Hw()     // Catch: com.aide.codemodel.api.Parser.a -> L6e java.lang.Throwable -> L71
            r6.J8()     // Catch: com.aide.codemodel.api.Parser.a -> L6e java.lang.Throwable -> L71
            goto Ld
        L48:
            r6.we()     // Catch: com.aide.codemodel.api.Parser.a -> L6e java.lang.Throwable -> L71
            r6.sG()     // Catch: com.aide.codemodel.api.Parser.a -> L6e java.lang.Throwable -> L71
            int r4 = r6.u7     // Catch: com.aide.codemodel.api.Parser.a -> L6e java.lang.Throwable -> L71
            r5 = 45
            if (r4 != r5) goto L58
            r6.cn()     // Catch: com.aide.codemodel.api.Parser.a -> L6e java.lang.Throwable -> L71
            goto L37
        L58:
            int r4 = r6.u7     // Catch: com.aide.codemodel.api.Parser.a -> L6e java.lang.Throwable -> L71
            r5 = 44
            if (r4 != r5) goto L62
            r6.sh()     // Catch: com.aide.codemodel.api.Parser.a -> L6e java.lang.Throwable -> L71
            goto L37
        L62:
            com.aide.codemodel.api.Parser$a r4 = new com.aide.codemodel.api.Parser$a     // Catch: com.aide.codemodel.api.Parser.a -> L6e java.lang.Throwable -> L71
            r4.<init>()     // Catch: com.aide.codemodel.api.Parser.a -> L6e java.lang.Throwable -> L71
            throw r4     // Catch: com.aide.codemodel.api.Parser.a -> L6e java.lang.Throwable -> L71
        L68:
            r3 = 201(0xc9, float:2.82E-43)
            r6.QX(r3, r2)     // Catch: java.lang.Throwable -> L71
            return
        L6e:
            r6.j3 = r3     // Catch: java.lang.Throwable -> L71
            goto Ld
        L71:
            r2 = move-exception
            boolean r3 = com.aide.codemodel.language.dtd.DtdParser.ei
            if (r3 == 0) goto L7e
            java.lang.Boolean r3 = new java.lang.Boolean
            r3.<init>(r7)
            abcd.iy.j3(r2, r0, r6, r3)
        L7e:
            goto L80
        L7f:
            throw r2
        L80:
            goto L7f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.dtd.DtdParser.vy(boolean):void");
    }

    @ey(method = -320657646644313137L)
    private void yS() {
        try {
            if (P8) {
                iy.gn(3466367566179406931L, this);
            }
            sG();
            int i = this.u7;
            if (i == 30) {
                we();
            } else if (i == 34) {
                gW();
            } else {
                if (i != 40) {
                    Hw();
                    throw new Parser.a();
                }
                we();
            }
            sG();
            int i2 = this.u7;
            int i3 = 2;
            if ((i2 != 36 && i2 != 37 && i2 != 43) || U2(1) == 34 || (U2(1) == 10 && U2(2) == 34)) {
                i3 = 1;
            } else {
                we();
            }
            QX(ProxyTextView.INPUTTYPE_textWebEmailAddress, i3);
        } catch (Throwable th) {
            if (ei) {
                iy.aM(th, 3466367566179406931L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Parser
    @ey(method = -1208871995845916325L)
    public void j6() {
        int i;
        try {
            if (P8) {
                iy.gn(-4904110584900707193L, this);
            }
            while (this.u7 == 10) {
                J8();
            }
            if (this.u7 == 55) {
                vJ();
                i = 1;
            } else {
                i = 0;
            }
            vy(false);
            QX(218, i + 1);
        } catch (Throwable th) {
            if (ei) {
                iy.aM(th, -4904110584900707193L, this);
            }
            throw th;
        }
    }
}
