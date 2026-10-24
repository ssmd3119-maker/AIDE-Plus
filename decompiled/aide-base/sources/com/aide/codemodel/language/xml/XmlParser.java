package com.aide.codemodel.language.xml;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.codemodel.api.EntitySpace;
import com.aide.codemodel.api.ErrorTable;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.IdentifierSpace;
import com.aide.codemodel.api.Parser;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.SyntaxTreeStyles;
import com.aide.codemodel.api.collections.MapOfIntInt;
import com.aide.uidesigner.ProxyTextView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

@cy(clazz = 2696428590087455179L, container = 2696428590087455179L, user = true)
/* loaded from: classes.dex */
public class XmlParser extends Parser {

    @gy
    private static /* synthetic */ boolean KD;

    @fy
    private static /* synthetic */ boolean SI;

    @dy(field = -873092328741712624L)
    private int[] BT;

    @dy(field = 2476953408972858905L)
    private boolean P8;

    @dy(field = 299627670920894732L)
    private final IdentifierSpace a8;

    @dy(field = -5652248516190801072L)
    private MapOfIntInt ei;

    @dy(field = -5168631366583819885L)
    private XmlCodeAnalyzer er;

    @dy(field = -253996847833957045L)
    private int[] gW;

    @dy(field = -4395402725631823584L)
    private final ErrorTable lg;

    @dy(field = -1205933645060729321L)
    private MapOfIntInt nw;

    @dy(field = 2807000347218565205L)
    private final XmlSyntax rN;

    @dy(field = 2123274564022500024L)
    private int vy;

    @dy(field = 19999675408803419L)
    private final boolean yS;

    static {
        iy.Zo(XmlParser.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 876033543918092760L)
    public XmlParser(XmlCodeAnalyzer xmlCodeAnalyzer, IdentifierSpace identifierSpace, ErrorTable errorTable, EntitySpace entitySpace, XmlSyntax xmlSyntax, boolean z) throws Throwable {
        char c;
        int i;
        super(identifierSpace, errorTable, entitySpace, xmlSyntax, 206, 0);
        try {
            if (SI) {
                iy.QX(1333569799875153720L, null, new Object[]{xmlCodeAnalyzer, identifierSpace, errorTable, entitySpace, xmlSyntax, new Boolean(z)});
            }
            c = 4;
            i = 6;
            try {
                this.gW = new int[10000];
                this.BT = new int[10000];
                this.ei = new MapOfIntInt();
                this.nw = new MapOfIntInt();
                this.er = xmlCodeAnalyzer;
                this.a8 = identifierSpace;
                this.lg = errorTable;
                this.rN = xmlSyntax;
                this.yS = z;
                this.ei.tp(identifierSpace.get("BR"), 12);
                this.ei.tp(identifierSpace.get("AREA"), 12);
                this.ei.tp(identifierSpace.get("LINK"), 12);
                this.ei.tp(identifierSpace.get("IMG"), 12);
                this.ei.tp(identifierSpace.get("LINK"), 12);
                this.ei.tp(identifierSpace.get("PARAM"), 12);
                this.ei.tp(identifierSpace.get("HR"), 12);
                this.ei.tp(identifierSpace.get("P"), 4);
                this.ei.tp(identifierSpace.get("DT"), 4);
                this.ei.tp(identifierSpace.get("DD"), 4);
                this.ei.tp(identifierSpace.get("LI"), 4);
                this.ei.tp(identifierSpace.get("INPUT"), 12);
                this.ei.tp(identifierSpace.get("OPTION"), 4);
                this.ei.tp(identifierSpace.get("THEAD"), 4);
                this.ei.tp(identifierSpace.get("TFOOT"), 4);
                this.ei.tp(identifierSpace.get("COLGROUP"), 4);
                this.ei.tp(identifierSpace.get("COL"), 12);
                this.ei.tp(identifierSpace.get("TR"), 4);
                this.ei.tp(identifierSpace.get("TH"), 4);
                this.ei.tp(identifierSpace.get("TD"), 4);
                this.ei.tp(identifierSpace.get("BASE"), 12);
                this.ei.tp(identifierSpace.get("META"), 12);
                this.ei.tp(identifierSpace.get("BODY"), 4);
                this.ei.tp(identifierSpace.get("TBODY"), 4);
                this.ei.tp(identifierSpace.get("HEAD"), 4);
                this.ei.tp(identifierSpace.get("HTML"), 4);
                this.ei.j6.DW();
                while (this.ei.j6.j6()) {
                    this.nw.tp(this.ei.j6.Hw(), this.ei.j6.v5());
                }
                this.nw.tp(identifierSpace.get("BASEFONT"), 12);
                this.nw.tp(identifierSpace.get("FRAME"), 12);
                this.nw.tp(identifierSpace.get("ISINDEX"), 12);
                new XmlCodeAnalyzer(errorTable, identifierSpace);
            } catch (Throwable th) {
                th = th;
                if (KD) {
                    Object[] objArr = new Object[i];
                    objArr[0] = xmlCodeAnalyzer;
                    objArr[1] = identifierSpace;
                    objArr[2] = errorTable;
                    objArr[3] = entitySpace;
                    objArr[c] = xmlSyntax;
                    objArr[5] = new Boolean(z);
                    iy.rN(th, 1333569799875153720L, null, objArr);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c = 4;
            i = 6;
        }
    }

    @ey(method = -479623824004049076L)
    private void BT() {
        try {
            if (SI) {
                iy.gn(-4427080287675678524L, this);
            }
            we();
            if (this.u7 == 2) {
                J8();
            }
            int i = 0;
            if (this.u7 == 25) {
                we();
                i = 1;
            }
            while (true) {
                int i2 = this.u7;
                if (i2 == 2) {
                    J8();
                } else if (i2 != 26) {
                    J0(76);
                    QX(300, i + 2);
                    return;
                } else {
                    vy();
                    i++;
                }
            }
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, -4427080287675678524L, this);
            }
            throw th;
        }
    }

    @ey(method = -1614880530507905271L)
    private boolean CU() {
        try {
            if (SI) {
                iy.gn(-2973454859323713667L, this);
            }
            int i = 0;
            while (true) {
                int iU2 = U2(i);
                if (iU2 != 2) {
                    if (iU2 == 13) {
                        return true;
                    }
                    if (iU2 != 100 && iU2 != 44 && iU2 != 45 && iU2 != 70 && iU2 != 71) {
                        switch (iU2) {
                            case 40:
                            case 41:
                            case 42:
                                continue;
                            default:
                                switch (iU2) {
                                    case 75:
                                    case 76:
                                    case 77:
                                        break;
                                    default:
                                        return false;
                                }
                        }
                    }
                }
                i++;
            }
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, -2973454859323713667L, this);
            }
            throw th;
        }
    }

    @ey(method = 2100082160186763276L)
    private void Eq() {
        try {
            if (SI) {
                iy.gn(1961464005460496100L, this);
            }
            int i = this.vy - 1;
            this.vy = i;
            if (i >= -1) {
            } else {
                throw new InternalError("tag stack corruption");
            }
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, 1961464005460496100L, this);
            }
            throw th;
        }
    }

    @ey(method = -747911321154254943L)
    private void FN() {
        try {
            if (SI) {
                iy.gn(-474720042319093419L, this);
            }
            J8();
            if (this.u7 == 33) {
                J8();
            } else {
                FH(33);
            }
            Ws(32);
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, -474720042319093419L, this);
            }
            throw th;
        }
    }

    @ey(method = -336666737155665973L)
    private void I() {
        try {
            if (SI) {
                iy.gn(-1802753764231956697L, this);
            }
            oY("Missing entity name");
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, -1802753764231956697L, this);
            }
            throw th;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:39:0x006b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f A[Catch: all -> 0x00a3, TryCatch #0 {all -> 0x00a3, blocks: (B:3:0x0005, B:5:0x0009, B:6:0x000c, B:20:0x002d, B:22:0x0037, B:24:0x003e, B:26:0x0045, B:28:0x004c, B:30:0x0053, B:31:0x0059, B:33:0x005d, B:39:0x006b, B:40:0x006e, B:41:0x0071, B:42:0x0075, B:44:0x007c, B:43:0x0079, B:45:0x007f, B:46:0x0083, B:48:0x008b, B:49:0x008f, B:50:0x0096, B:51:0x009a), top: B:60:0x0005 }] */
    @abcd.ey(method = -5016388748517073648L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void KD() {
        /*
            r8 = this;
            r0 = 4292650597932965280(0x3b928ef9b2a99da0, double:9.824786817645297E-22)
            boolean r2 = com.aide.codemodel.language.xml.XmlParser.SI     // Catch: java.lang.Throwable -> La3
            if (r2 == 0) goto Lc
            abcd.iy.gn(r0, r8)     // Catch: java.lang.Throwable -> La3
        Lc:
            int r2 = r8.u7     // Catch: java.lang.Throwable -> La3
            r3 = 16
            r4 = 204(0xcc, float:2.86E-43)
            r5 = 1
            if (r2 == r3) goto L53
            r3 = 17
            if (r2 == r3) goto L53
            r3 = 26
            if (r2 == r3) goto L4c
            r3 = 50
            if (r2 == r3) goto L4c
            r3 = 72
            if (r2 == r3) goto L45
            r3 = 74
            if (r2 == r3) goto L3e
            r3 = 303(0x12f, float:4.25E-43)
            if (r2 == r3) goto L37
            r8.lp()     // Catch: java.lang.Throwable -> La3
            r8.QX(r4, r5)     // Catch: java.lang.Throwable -> La3
            r8.vJ()     // Catch: java.lang.Throwable -> La3
            return
        L37:
            r8.gW()     // Catch: java.lang.Throwable -> La3
            r8.QX(r4, r5)     // Catch: java.lang.Throwable -> La3
            return
        L3e:
            r8.ei()     // Catch: java.lang.Throwable -> La3
            r8.QX(r4, r5)     // Catch: java.lang.Throwable -> La3
            return
        L45:
            r8.er()     // Catch: java.lang.Throwable -> La3
            r8.QX(r4, r5)     // Catch: java.lang.Throwable -> La3
            return
        L4c:
            r8.aq()     // Catch: java.lang.Throwable -> La3
            r8.QX(r4, r5)     // Catch: java.lang.Throwable -> La3
            return
        L53:
            int r2 = r8.u7     // Catch: java.lang.Throwable -> La3
            r8.we()     // Catch: java.lang.Throwable -> La3
            r3 = 0
        L59:
            int r6 = r8.u7     // Catch: java.lang.Throwable -> La3
            if (r6 == 0) goto L9a
            int r6 = r8.u7     // Catch: java.lang.Throwable -> La3
            r7 = 20
            if (r6 == r7) goto L96
            r7 = 22
            if (r6 == r7) goto L83
            r7 = 100
            if (r6 == r7) goto L7f
            switch(r6) {
                case 16: goto L9a;
                case 17: goto L9a;
                case 18: goto L79;
                default: goto L6e;
            }     // Catch: java.lang.Throwable -> La3
        L6e:
            switch(r6) {
                case 70: goto L7f;
                case 71: goto L7f;
                case 72: goto L7f;
                case 73: goto L7f;
                case 74: goto L75;
                case 75: goto L7f;
                default: goto L71;
            }     // Catch: java.lang.Throwable -> La3
        L71:
            r8.Hw()     // Catch: java.lang.Throwable -> La3
            goto L9a
        L75:
            r8.ei()     // Catch: java.lang.Throwable -> La3
            goto L7c
        L79:
            r8.we()     // Catch: java.lang.Throwable -> La3
        L7c:
            int r3 = r3 + 1
            goto L59
        L7f:
            r8.yS()     // Catch: java.lang.Throwable -> La3
            goto L7c
        L83:
            int r6 = r8.U2(r5)     // Catch: java.lang.Throwable -> La3
            r7 = 21
            if (r6 != r7) goto L8f
            r8.SI()     // Catch: java.lang.Throwable -> La3
            goto L7c
        L8f:
            r8.I()     // Catch: java.lang.Throwable -> La3
            r8.J8()     // Catch: java.lang.Throwable -> La3
            goto L59
        L96:
            r8.we()     // Catch: java.lang.Throwable -> La3
            goto L7c
        L9a:
            r8.J0(r2)     // Catch: java.lang.Throwable -> La3
            int r3 = r3 + 2
            r8.QX(r4, r3)     // Catch: java.lang.Throwable -> La3
            return
        La3:
            r2 = move-exception
            boolean r3 = com.aide.codemodel.language.xml.XmlParser.KD
            if (r3 == 0) goto Lab
            abcd.iy.aM(r2, r0, r8)
        Lab:
            goto Lad
        Lac:
            throw r2
        Lad:
            goto Lac
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.xml.XmlParser.KD():void");
    }

    @ey(method = -2167170908170414208L)
    private void Mz() {
        try {
            if (SI) {
                iy.gn(404030174872094400L, this);
            }
            DW("Missing DOCTYPE literal");
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, 404030174872094400L, this);
            }
            throw th;
        }
    }

    @ey(method = -3812376229139812155L)
    private void OW() {
        try {
            if (SI) {
                iy.gn(-4137885996064603935L, this);
            }
            EQ(211, 0);
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, -4137885996064603935L, this);
            }
            throw th;
        }
    }

    @ey(method = -206533744219250973L)
    private void P8() {
        try {
            if (SI) {
                iy.gn(1686065605880339255L, this);
            }
            int i = this.u7;
            if (i != 16 && i != 17) {
                if (i == 26) {
                    we();
                    QX(305, 1);
                    return;
                } else {
                    aj();
                    QX(305, 1);
                    vJ();
                    return;
                }
            }
            int i2 = this.u7;
            we();
            int i3 = 0;
            while (this.u7 != 0 && this.u7 == 18) {
                we();
                i3++;
            }
            J0(i2);
            QX(305, i3 + 2);
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, 1686065605880339255L, this);
            }
            throw th;
        }
    }

    @ey(method = 635766177258176640L)
    private void Qq() {
        try {
            if (SI) {
                iy.gn(1808972345005612344L, this);
            }
            we();
            Ws(2);
            we();
            int i = this.aM[this.j3];
            if (!jJ() && sh(this.gn.getLiteralChars(i), this.gn.getLiteralOff(i), this.gn.getLiteralLen(i), "XHTML")) {
                this.P8 = true;
            }
            if (this.u7 == 2) {
                J8();
            }
            if (this.u7 != 37) {
                QX(215, 2);
            } else {
                we();
                QX(215, 3);
            }
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, 1808972345005612344L, this);
            }
            throw th;
        }
    }

    @ey(method = -278829639512454171L)
    private void SI() {
        try {
            if (SI) {
                iy.gn(-272628408630211271L, this);
            }
            we();
            we();
            if (this.u7 == 23) {
                we();
            } else {
                lg(23);
                gn(23);
            }
            QX(205, 3);
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, -272628408630211271L, this);
            }
            throw th;
        }
    }

    @ey(method = -4617834369079632575L)
    private void Sf() {
        try {
            if (SI) {
                iy.gn(3860216808666997933L, this);
            }
            we();
            we();
            J0(28);
            QX(205, 3);
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, 3860216808666997933L, this);
            }
            throw th;
        }
    }

    @ey(method = -3685190568893848735L)
    private boolean XG() {
        try {
            if (!SI) {
                return false;
            }
            iy.gn(7703329555308962253L, this);
            return false;
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, 7703329555308962253L, this);
            }
            throw th;
        }
    }

    @ey(method = 2017468052794212480L)
    private void XX(int i) {
        try {
            if (SI) {
                iy.u7(1125695056493717080L, this, i);
            }
            boolean z = false;
            if (this.tp > 0 && this.we[this.tp - 1] == 15) {
                this.tp--;
                z = true;
            }
            gn(11);
            tp(25, this.a8.get(""));
            gn(49);
            tp(25, i);
            EQ(217, 3);
            gn(8);
            EQ(208, 3);
            if (z) {
                this.tp++;
            }
        } catch (Throwable th) {
            if (KD) {
                iy.j3(th, 1125695056493717080L, this, new Integer(i));
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0029 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:3:0x0005, B:5:0x0009, B:7:0x000d, B:15:0x001e, B:18:0x0024, B:22:0x0030, B:20:0x0029, B:21:0x002d, B:23:0x0033), top: B:32:0x0005 }] */
    @abcd.ey(method = -3270535570670136316L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int Xa(boolean r6) {
        /*
            r5 = this;
            r0 = 45079695959964732(0xa027bea046bc3c, double:1.150292158577764E-305)
            boolean r2 = com.aide.codemodel.language.xml.XmlParser.SI     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto Lc
            abcd.iy.Ws(r0, r5, r6)     // Catch: java.lang.Throwable -> L37
        Lc:
            r2 = 0
        Ld:
            int r3 = r5.u7     // Catch: java.lang.Throwable -> L37
            r4 = 2
            if (r3 == r4) goto L33
            r4 = 40
            if (r3 == r4) goto L2d
            r4 = 75
            if (r3 == r4) goto L29
            r4 = 100
            if (r3 == r4) goto L29
            switch(r3) {
                case 70: goto L29;
                case 71: goto L29;
                case 72: goto L22;
                case 73: goto L22;
                default: goto L21;
            }     // Catch: java.lang.Throwable -> L37
        L21:
            goto L28
        L22:
            if (r6 == 0) goto L28
            r5.yS()     // Catch: java.lang.Throwable -> L37
            goto L30
        L28:
            return r2
        L29:
            r5.yS()     // Catch: java.lang.Throwable -> L37
            goto L30
        L2d:
            r5.cb()     // Catch: java.lang.Throwable -> L37
        L30:
            int r2 = r2 + 1
            goto Ld
        L33:
            r5.J8()     // Catch: java.lang.Throwable -> L37
            goto Ld
        L37:
            r2 = move-exception
            boolean r3 = com.aide.codemodel.language.xml.XmlParser.KD
            if (r3 == 0) goto L44
            java.lang.Boolean r3 = new java.lang.Boolean
            r3.<init>(r6)
            abcd.iy.j3(r2, r0, r5, r3)
        L44:
            goto L46
        L45:
            throw r2
        L46:
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.xml.XmlParser.Xa(boolean):int");
    }

    @ey(method = 104254998471910720L)
    private void aj() {
        try {
            if (SI) {
                iy.gn(-83869335575872000L, this);
            }
            tp(26, this.a8.get(""));
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, -83869335575872000L, this);
            }
            throw th;
        }
    }

    @ey(method = -55306226279532800L)
    private void aq() {
        try {
            if (SI) {
                iy.gn(3018598428864255040L, this);
            }
            if (U2(1) == 49) {
                Zo();
                we();
                J0(49);
                Zo();
                we();
            } else {
                tp(26, this.a8.get(""));
                gn(49);
                Zo();
                we();
            }
            QX(218, 3);
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, 3018598428864255040L, this);
            }
            throw th;
        }
    }

    @ey(method = 1318012910322962607L)
    private void br(int i, int i2) {
        try {
            if (SI) {
                iy.EQ(353168381969270227L, this, new Integer(i), new Integer(i2));
            }
            boolean z = false;
            if (this.tp > 0 && this.we[this.tp - 1] == 15) {
                this.tp--;
                z = true;
            }
            gn(11);
            tp(25, i);
            gn(49);
            tp(25, i2);
            EQ(217, 3);
            gn(8);
            EQ(207, 3);
            if (z) {
                this.tp++;
            }
        } catch (Throwable th) {
            if (KD) {
                iy.Mr(th, 353168381969270227L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 2630684488426727328L)
    private void ca() {
        try {
            if (SI) {
                iy.gn(5982573566176813056L, this);
            }
            DW("Missing tag name");
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, 5982573566176813056L, this);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    @abcd.ey(method = -225668675932866820L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void cb() {
        /*
            r5 = this;
            r0 = -487941828752970556(0xf93a7b7df21fecc4, double:-9.168815448787473E275)
            boolean r2 = com.aide.codemodel.language.xml.XmlParser.SI     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto Lc
            abcd.iy.gn(r0, r5)     // Catch: java.lang.Throwable -> L46
        Lc:
            r5.we()     // Catch: java.lang.Throwable -> L46
            r2 = 0
        L10:
            int r3 = r5.u7     // Catch: java.lang.Throwable -> L46
            r4 = 41
            if (r3 == r4) goto L40
            r4 = 42
            if (r3 == r4) goto L40
            r4 = 75
            if (r3 == r4) goto L3c
            r4 = 100
            if (r3 == r4) goto L3c
            switch(r3) {
                case 70: goto L3c;
                case 71: goto L3c;
                case 72: goto L3c;
                case 73: goto L3c;
                default: goto L25;
            }     // Catch: java.lang.Throwable -> L46
        L25:
            int r3 = r5.u7     // Catch: java.lang.Throwable -> L46
            r4 = 45
            if (r3 != r4) goto L2f
            r5.we()     // Catch: java.lang.Throwable -> L46
            goto L34
        L2f:
            r3 = 44
            r5.J0(r3)     // Catch: java.lang.Throwable -> L46
        L34:
            r3 = 216(0xd8, float:3.03E-43)
            int r2 = r2 + 2
            r5.QX(r3, r2)     // Catch: java.lang.Throwable -> L46
            return
        L3c:
            r5.yS()     // Catch: java.lang.Throwable -> L46
            goto L43
        L40:
            r5.we()     // Catch: java.lang.Throwable -> L46
        L43:
            int r2 = r2 + 1
            goto L10
        L46:
            r2 = move-exception
            boolean r3 = com.aide.codemodel.language.xml.XmlParser.KD
            if (r3 == 0) goto L4e
            abcd.iy.aM(r2, r0, r5)
        L4e:
            goto L50
        L4f:
            throw r2
        L50:
            goto L4f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.xml.XmlParser.cb():void");
    }

    @ey(method = 2503338296119588783L)
    private void cn() {
        try {
            if (SI) {
                iy.gn(-1765797397332424725L, this);
            }
            we();
            if (this.u7 != 6) {
                J0(5);
                QX(ProxyTextView.INPUTTYPE_textWebEmailAddress, 2);
            } else {
                we();
                J0(5);
                QX(ProxyTextView.INPUTTYPE_textWebEmailAddress, 3);
            }
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, -1765797397332424725L, this);
            }
            throw th;
        }
    }

    @ey(method = 1236514551446537955L)
    private void dx(boolean z) {
        int iVH;
        int iVH2;
        try {
            if (SI) {
                iy.Ws(5405929383823743L, this, z);
            }
            int i = 0;
            while (this.u7 != 0) {
                int i2 = this.u7;
                if (i2 == 4) {
                    cn();
                } else if (i2 == 7) {
                    ef();
                } else {
                    if (i2 == 11) {
                        if (U2(1) == 25) {
                            if (U2(2) == 49) {
                                iVH = VH(1);
                                iVH2 = VH(3);
                            } else {
                                iVH = this.a8.get("");
                                iVH2 = VH(1);
                            }
                            if (z) {
                                kQ(iVH, iVH2);
                                OW();
                                x9();
                                QX(210, 3);
                            } else {
                                if (!jO(this.a8.QX(iVH), this.a8.QX(iVH2))) {
                                    kQ(iVH, iVH2);
                                    OW();
                                    x9();
                                    QX(210, 3);
                                }
                            }
                        } else if (z) {
                            J8();
                            ca();
                        }
                        QX(211, i);
                    }
                    if (i2 == 24) {
                        we();
                    } else if (i2 != 34) {
                        if (i2 != 40) {
                            if (i2 != 75 && i2 != 100) {
                                if (i2 == 14 || i2 == 15) {
                                    we();
                                } else if (i2 != 27) {
                                    if (i2 == 28) {
                                        we();
                                    } else if (i2 == 30) {
                                        ko();
                                    } else if (i2 != 31) {
                                        switch (i2) {
                                            case 46:
                                            case 48:
                                                we();
                                                break;
                                            case 47:
                                                we();
                                                break;
                                            default:
                                                switch (i2) {
                                                    case 70:
                                                    case 71:
                                                    case 72:
                                                    case 73:
                                                        break;
                                                    default:
                                                        Hw();
                                                        J8();
                                                        continue;
                                                }
                                        }
                                    } else {
                                        FN();
                                    }
                                } else if (U2(1) == 29) {
                                    Sf();
                                } else {
                                    we();
                                }
                            }
                            yS();
                        } else {
                            cb();
                        }
                    } else if (et()) {
                        sG();
                    } else {
                        Hw();
                        J8();
                    }
                }
                i++;
            }
            QX(211, i);
        } catch (Throwable th) {
            if (KD) {
                iy.j3(th, 5405929383823743L, this, new Boolean(z));
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0166 A[Catch: all -> 0x0176, TryCatch #0 {all -> 0x0176, blocks: (B:3:0x0007, B:5:0x000b, B:6:0x000e, B:9:0x001d, B:11:0x0023, B:14:0x0061, B:15:0x0075, B:27:0x008e, B:28:0x0091, B:32:0x009e, B:33:0x00aa, B:34:0x00b3, B:36:0x00c4, B:38:0x00ca, B:63:0x0150, B:39:0x00d2, B:41:0x00dc, B:43:0x00e2, B:44:0x00e5, B:62:0x014d, B:45:0x00e9, B:47:0x00ef, B:48:0x010a, B:50:0x0110, B:52:0x0123, B:55:0x0133, B:56:0x0137, B:58:0x013d, B:60:0x0143, B:61:0x014a, B:65:0x0156, B:66:0x015d, B:51:0x0119, B:67:0x015e, B:70:0x0169, B:68:0x0162, B:69:0x0166, B:71:0x016c, B:12:0x0035, B:13:0x0049), top: B:80:0x0007 }] */
    @abcd.ey(method = 1321864341692128215L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void ef() {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.xml.XmlParser.ef():void");
    }

    @ey(method = -598140290476783152L)
    private void ei() {
        try {
            if (SI) {
                iy.gn(318734335971974656L, this);
            }
            we();
            J0(78);
            J0(76);
            QX(306, 3);
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, 318734335971974656L, this);
            }
            throw th;
        }
    }

    @ey(method = -571991942200170084L)
    private void er() {
        try {
            if (SI) {
                iy.gn(-34832790989287116L, this);
            }
            we();
            if (this.u7 != 77) {
                J0(76);
                QX(302, 2);
            } else {
                we();
                J0(76);
                QX(302, 3);
            }
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, -34832790989287116L, this);
            }
            throw th;
        }
    }

    @ey(method = -5847020503116374661L)
    private boolean et() {
        try {
            if (SI) {
                iy.gn(602106912744337215L, this);
            }
            if (U2(0) == 34 && U2(1) == 2) {
                return U2(2) == 38;
            }
            return false;
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, 602106912744337215L, this);
            }
            throw th;
        }
    }

    @ey(method = 2582153735453504512L)
    private void g3(int i, int i2) {
        int i3;
        int i4;
        String str;
        try {
            if (SI) {
                iy.EQ(5864449322446462032L, this, new Integer(i), new Integer(i2));
            }
            if (this.tp > 0) {
                i3 = this.Ws[this.tp - 1];
                i4 = this.XL[this.tp - 1];
            } else {
                i3 = this.J8[this.tp];
                i4 = this.QX[this.tp];
            }
            int i5 = i3;
            int i6 = i4;
            if (i == this.a8.get("")) {
                str = "</" + this.a8.getString(i2) + ">";
            } else {
                str = "</" + this.a8.getString(i) + ":" + this.a8.getString(i2) + ">";
            }
            String str2 = str;
            DW("Expected " + str2);
            if (this.VH) {
                this.lg.Ws(this.gn.getFile(), this.gn.getLanguage(), i5, i6, i5, i6, str2, "Insert " + str2);
            }
        } catch (Throwable th) {
            if (KD) {
                iy.Mr(th, 5864449322446462032L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -709435003496642304L)
    private void gW() {
        try {
            if (SI) {
                iy.gn(-375451614685429776L, this);
            }
            we();
            if (this.u7 != 77) {
                J0(76);
                QX(303, 2);
            } else {
                we();
                J0(76);
                QX(303, 3);
            }
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, -375451614685429776L, this);
            }
            throw th;
        }
    }

    @ey(method = 453864645101318031L)
    private void hz(int i, int i2) {
        try {
            if (SI) {
                iy.EQ(-217027098242920589L, this, new Integer(i), new Integer(i2));
            }
            int i3 = this.vy + 1;
            this.vy = i3;
            if (i3 >= this.BT.length) {
                int[] iArr = new int[(this.BT.length * 2) + 1];
                System.arraycopy(this.BT, 0, iArr, 0, this.BT.length);
                this.BT = iArr;
                int[] iArr2 = new int[(this.gW.length * 2) + 1];
                System.arraycopy(this.gW, 0, iArr2, 0, this.gW.length);
                this.gW = iArr2;
            }
            this.BT[this.vy] = i2;
            this.gW[this.vy] = i;
        } catch (Throwable th) {
            if (KD) {
                iy.Mr(th, -217027098242920589L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -2329592476199817801L)
    private boolean jJ() {
        try {
            if (SI) {
                iy.gn(-3600743194614054325L, this);
            }
            if (!this.yS) {
                if (!this.P8) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, -3600743194614054325L, this);
            }
            throw th;
        }
    }

    @ey(method = -132461058858353900L)
    private boolean jO(int i, int i2) {
        try {
            if (SI) {
                iy.EQ(-907071535982540180L, this, new Integer(i), new Integer(i2));
            }
            for (int i3 = 0; i3 <= this.vy; i3++) {
                if (this.BT[i3] == i2 && this.gW[i3] == i) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (KD) {
                iy.Mr(th, -907071535982540180L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 3539972932719341200L)
    private void kQ(int i, int i2) {
        try {
            if (SI) {
                iy.EQ(5443692474207081600L, this, new Integer(i), new Integer(i2));
            }
            gn(7);
            tp(25, i);
            gn(49);
            tp(25, i2);
            EQ(217, 3);
            gn(8);
            EQ(200, 3);
        } catch (Throwable th) {
            if (KD) {
                iy.Mr(th, 5443692474207081600L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 977010856115937600L)
    private void ko() {
        try {
            if (SI) {
                iy.gn(-84727185843536848L, this);
            }
            this.P8 = true;
            we();
            if (this.u7 != 33) {
                J0(32);
                QX(212, 2);
            } else {
                we();
                J0(32);
                QX(212, 3);
            }
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, -84727185843536848L, this);
            }
            throw th;
        }
    }

    @ey(method = 932070319418425808L)
    private void lp() {
        try {
            if (SI) {
                iy.gn(-1257497241168487104L, this);
            }
            tp(26, this.a8.get(""));
            tp(49, this.a8.get(""));
            tp(26, this.a8.get(""));
            EQ(218, 3);
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, -1257497241168487104L, this);
            }
            throw th;
        }
    }

    @ey(method = -2764687439684604291L)
    private void nw() {
        int iZo;
        int iZo2;
        try {
            if (SI) {
                iy.gn(2451154229618410153L, this);
            }
            if (U2(1) == 49) {
                iZo = Zo();
                we();
                J0(49);
                iZo2 = Zo();
                we();
            } else {
                iZo = this.a8.get("");
                tp(26, iZo);
                gn(49);
                iZo2 = Zo();
                we();
            }
            QX(218, 3);
            int iXa = CU() ? Xa(true) + 0 : 0;
            if (this.u7 == 13) {
                J0(13);
                int iXa2 = iXa + Xa(false);
                KD();
                QX(203, iXa2 + 3);
                return;
            }
            gn(13);
            tp(26, iZo);
            gn(49);
            tp(26, iZo2);
            EQ(218, 3);
            EQ(204, 1);
            QX(203, 3);
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, 2451154229618410153L, this);
            }
            throw th;
        }
    }

    @ey(method = 3806929098110415555L)
    private void rN() {
        try {
            if (SI) {
                iy.gn(-3175365506678172353L, this);
            }
            we();
            if (this.u7 != 77) {
                J0(76);
                QX(301, 2);
            } else {
                we();
                J0(76);
                QX(301, 3);
            }
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, -3175365506678172353L, this);
            }
            throw th;
        }
    }

    @ey(method = -1719549147889339129L)
    private boolean ro(int i, int i2) {
        try {
            if (SI) {
                iy.EQ(486345633620564635L, this, new Integer(i), new Integer(i2));
            }
            if (jJ() || i != this.a8.get("")) {
                return false;
            }
            MapOfIntInt mapOfIntInt = XG() ? this.ei : this.nw;
            if (mapOfIntInt.v5(i2)) {
                return (mapOfIntInt.VH(i2) & 4) != 0;
            }
            return false;
        } catch (Throwable th) {
            if (KD) {
                iy.Mr(th, 486345633620564635L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 2118506138460182625L)
    private void sG() {
        try {
            if (SI) {
                iy.gn(329419703417923229L, this);
            }
            we();
            Ws(2);
            we();
            if (this.u7 == 2) {
                J8();
            }
            boolean z = false;
            int i = this.u7;
            if (i != 8) {
                if (i == 39) {
                    J8();
                    if (this.u7 == 2) {
                        J8();
                    }
                    J0(8);
                    QX(213, 3);
                    return;
                }
                if (i != 35) {
                    if (i != 36) {
                        Hw();
                    } else if (U2(2) == 37) {
                        Qq();
                        z = true;
                    } else {
                        Mz();
                        J8();
                    }
                } else if (U2(2) == 37) {
                    sy();
                    z = true;
                } else {
                    Mz();
                    J8();
                }
            }
            if (this.u7 == 2) {
                J8();
            }
            if (this.u7 == 39) {
                J8();
                if (this.u7 == 2) {
                    J8();
                }
            }
            J0(8);
            QX(213, z ? 4 : 3);
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, 329419703417923229L, this);
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        r1 = r1 + 1;
     */
    @abcd.ey(method = -430922552309027889L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean sh(char[] r10, int r11, int r12, java.lang.String r13) {
        /*
            r9 = this;
            boolean r0 = com.aide.codemodel.language.xml.XmlParser.SI     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L19
            r1 = 769511385396704675(0xaadda87293075a3, double:3.1066389830888083E-257)
            java.lang.Integer r5 = new java.lang.Integer     // Catch: java.lang.Throwable -> L42
            r5.<init>(r11)     // Catch: java.lang.Throwable -> L42
            java.lang.Integer r6 = new java.lang.Integer     // Catch: java.lang.Throwable -> L42
            r6.<init>(r12)     // Catch: java.lang.Throwable -> L42
            r3 = r9
            r4 = r10
            r7 = r13
            abcd.iy.J0(r1, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L42
        L19:
            r0 = 0
            r1 = 0
        L1b:
            int r2 = r13.length()     // Catch: java.lang.Throwable -> L42
            int r2 = r12 - r2
            if (r1 >= r2) goto L41
            r2 = 0
        L24:
            int r3 = r13.length()     // Catch: java.lang.Throwable -> L42
            if (r2 >= r3) goto L3f
            int r3 = r11 + r1
            int r3 = r3 + r2
            char r3 = r10[r3]     // Catch: java.lang.Throwable -> L42
            char r3 = java.lang.Character.toUpperCase(r3)     // Catch: java.lang.Throwable -> L42
            char r4 = r13.charAt(r2)     // Catch: java.lang.Throwable -> L42
            if (r3 == r4) goto L3c
            int r1 = r1 + 1
            goto L1b
        L3c:
            int r2 = r2 + 1
            goto L24
        L3f:
            r10 = 1
            return r10
        L41:
            return r0
        L42:
            r0 = move-exception
            boolean r1 = com.aide.codemodel.language.xml.XmlParser.KD
            if (r1 == 0) goto L5d
            r2 = 769511385396704675(0xaadda87293075a3, double:3.1066389830888083E-257)
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r11)
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r12)
            r1 = r0
            r4 = r9
            r5 = r10
            r8 = r13
            abcd.iy.a8(r1, r2, r4, r5, r6, r7, r8)
        L5d:
            goto L5f
        L5e:
            throw r0
        L5f:
            goto L5e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.xml.XmlParser.sh(char[], int, int, java.lang.String):boolean");
    }

    @ey(method = -394461868347411848L)
    private void sy() {
        try {
            if (SI) {
                iy.gn(884180032201906200L, this);
            }
            we();
            Ws(2);
            we();
            QX(214, 2);
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, 884180032201906200L, this);
            }
            throw th;
        }
    }

    @ey(method = -759018113577647560L)
    private void vJ() {
        try {
            if (SI) {
                iy.gn(1658975754984091768L, this);
            }
            DW("Attribute value expected");
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, 1658975754984091768L, this);
            }
            throw th;
        }
    }

    @ey(method = -453814113285509648L)
    private void vy() {
        try {
            if (SI) {
                iy.gn(-5709696301283242536L, this);
            }
            we();
            if (this.u7 == 2) {
                J8();
            }
            if (this.u7 != 13) {
                QX(304, 1);
                return;
            }
            J0(13);
            if (this.u7 == 2) {
                J8();
            }
            P8();
            QX(304, 3);
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, -5709696301283242536L, this);
            }
            throw th;
        }
    }

    @ey(method = 520094756709608256L)
    private void wc() {
        try {
            if (SI) {
                iy.gn(29321400142394304L, this);
            }
            we();
            if (this.u7 != 77) {
                J0(76);
                QX(ModuleDescriptor.MODULE_VERSION, 2);
            } else {
                we();
                J0(76);
                QX(ModuleDescriptor.MODULE_VERSION, 3);
            }
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, 29321400142394304L, this);
            }
            throw th;
        }
    }

    @ey(method = 155193003450460976L)
    private void x9() {
        try {
            if (SI) {
                iy.gn(490496885142451200L, this);
            }
            J0(11);
            if (U2(1) == 49) {
                we();
                we();
                we();
            } else {
                tp(25, this.a8.get(""));
                gn(49);
                we();
            }
            QX(217, 3);
            int iXa = Xa(true);
            J0(8);
            QX(207, iXa + 3);
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, 490496885142451200L, this);
            }
            throw th;
        }
    }

    @ey(method = -516739911278363088L)
    private boolean yO(int i) {
        try {
            if (SI) {
                iy.u7(2306659841560672L, this, i);
            }
            if (jJ()) {
                return false;
            }
            MapOfIntInt mapOfIntInt = XG() ? this.ei : this.nw;
            if (mapOfIntInt.v5(i)) {
                return (mapOfIntInt.VH(i) & 8) != 0;
            }
            return false;
        } catch (Throwable th) {
            if (KD) {
                iy.j3(th, 2306659841560672L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 2003991096871996024L)
    private void yS() {
        try {
            if (SI) {
                iy.gn(-934639821420569712L, this);
            }
            int i = this.u7;
            if (i == 75) {
                we();
                return;
            }
            if (i == 100) {
                wc();
                return;
            }
            switch (i) {
                case 70:
                    BT();
                    return;
                case 71:
                    rN();
                    return;
                case 72:
                    er();
                    return;
                case 73:
                    gW();
                    return;
                default:
                    throw new RuntimeException("Expeted ASP content token");
            }
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, -934639821420569712L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Parser
    @ey(method = -541726490486978500L)
    public void DW(String str) {
        try {
            if (SI) {
                iy.tp(-3833289294958571100L, this, str);
            }
            if (this.VH) {
                int i = this.tp;
                while (i > 0) {
                    i--;
                    if (this.we[i] != 2) {
                        break;
                    }
                }
                int i2 = this.Ws[i];
                int i3 = this.XL[i] - 1;
                this.lg.j3(this.gn.getFile(), this.gn.getLanguage(), i2, i3, i2, i3 + 2, str, 0);
            }
        } catch (Throwable th) {
            if (KD) {
                iy.j3(th, -3833289294958571100L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Parser
    @ey(method = -1566810862231898483L)
    public void FH(int i) {
        try {
            if (SI) {
                iy.u7(-1068866878698152487L, this, i);
            }
            if (this.VH) {
                int i2 = this.tp;
                while (i2 > 0) {
                    i2--;
                    if (this.we[i2] != 2) {
                        break;
                    }
                }
                int i3 = this.Ws[i2];
                int i4 = this.XL[i2] - 1;
                String string = this.rN.getString(i);
                this.lg.j3(this.gn.getFile(), this.gn.getLanguage(), i3, i4, i3, i4 + 2, "Missing </C>" + string + "<//C>", 0);
                int i5 = i4 + 1;
                this.lg.Ws(this.gn.getFile(), this.gn.getLanguage(), i3, i5, i3, i5, string, "Insert '" + string + "'");
            }
        } catch (Throwable th) {
            if (KD) {
                iy.j3(th, -1068866878698152487L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Parser
    @ey(method = -720323764815924984L)
    public void j6() {
        try {
            if (SI) {
                iy.gn(-4409876803959209360L, this);
            }
            this.P8 = false;
            dx(true);
            QX(206, 1);
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, -4409876803959209360L, this);
            }
            throw th;
        }
    }

    @ey(method = -584985485661317604L)
    public void oY(String str) {
        try {
            if (SI) {
                iy.tp(-3306963461962627500L, this, str);
            }
            if (this.VH) {
                int i = this.tp;
                while (i > 0) {
                    i--;
                    if (this.we[i] != 2) {
                        break;
                    }
                }
                int i2 = this.Ws[i];
                int i3 = this.XL[i] - 1;
                this.lg.j3(this.gn.getFile(), this.gn.getLanguage(), i2, i3, i2, i3 + 2, str, 1);
            }
        } catch (Throwable th) {
            if (KD) {
                iy.j3(th, -3306963461962627500L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Parser
    @ey(method = 1301861483714732508L)
    public void v5(SyntaxTreeStyles syntaxTreeStyles, FileEntry fileEntry, boolean z, SyntaxTree syntaxTree) {
        try {
            if (SI) {
                iy.J0(-220726349220359820L, this, syntaxTreeStyles, fileEntry, new Boolean(z), syntaxTree);
            }
            super.v5(syntaxTreeStyles, fileEntry, z, syntaxTree);
            this.er.Ws(syntaxTree);
            if (z) {
                this.er.XL(syntaxTree, jJ());
            }
        } catch (Throwable th) {
            if (KD) {
                iy.a8(th, -220726349220359820L, this, syntaxTreeStyles, fileEntry, new Boolean(z), syntaxTree);
            }
            throw th;
        }
    }
}
