package com.aide.codemodel.language.java;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import abcd.y1;
import com.aide.codemodel.api.EntitySpace;
import com.aide.codemodel.api.ErrorTable;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.IdentifierSpace;
import com.aide.codemodel.api.Parser;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.SyntaxTreeStyles;
import com.aide.uidesigner.ProxyTextView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.probelytics.api.UserTouchAction;

@cy(clazz = 277617187986446665L, container = 277617187986446665L, user = true)
/* loaded from: classes.dex */
public class JavaParser extends Parser {

    @gy
    private static /* synthetic */ boolean KD;

    @fy
    private static /* synthetic */ boolean SI;

    @dy(field = 946447519380039103L)
    private int BT;

    @dy(field = -1950271001052347673L)
    private int P8;

    @dy(field = -1696882216662126824L)
    private final JavaSyntax a8;

    @dy(field = 2086522813858354893L)
    private int ei;

    @dy(field = -16078950737832696L)
    private int er;

    @dy(field = -6918732029585617056L)
    private int gW;

    @dy(field = 2406033534835030017L)
    private final IdentifierSpace lg;

    @dy(field = 922787716145191247L)
    private int nw;

    @dy(field = 5922760972586565200L)
    private final boolean rN;

    @dy(field = -2908697561775152004L)
    private int[] vy;

    @dy(field = 2114795296967345517L)
    private int yS;

    @cy(clazz = 1515949889822405856L, container = 1515949889822405856L, user = true)
    private static class b extends Parser.a {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        static {
            iy.Zo(b.class);
        }

        @ey(method = 564721993015995780L)
        private b() {
            try {
                if (jw) {
                    iy.gn(1062119150043951664L, null);
                }
            } catch (Throwable th) {
                if (fY) {
                    iy.aM(th, 1062119150043951664L, null);
                }
                throw th;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = -5451238792705634344L)
        public /* synthetic */ b(a aVar) {
            this();
            try {
                if (jw) {
                    iy.tp(16776875537009868L, null, aVar);
                }
            } catch (Throwable th) {
                if (fY) {
                    iy.j3(th, 16776875537009868L, null, aVar);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(JavaParser.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -728662837833175856L)
    public JavaParser(IdentifierSpace identifierSpace, ErrorTable errorTable, EntitySpace entitySpace, JavaSyntax javaSyntax, boolean z) {
        super(identifierSpace, errorTable, entitySpace, javaSyntax, 223, 0);
        try {
            if (SI) {
                iy.J8(744195345605966711L, null, identifierSpace, errorTable, entitySpace, javaSyntax, new Boolean(z));
            }
            this.vy = new int[1000];
            this.P8 = 0;
            this.lg = identifierSpace;
            this.a8 = javaSyntax;
            this.rN = z;
            this.nw = identifierSpace.get("enum");
        } catch (Throwable th) {
            if (KD) {
                iy.lg(th, 744195345605966711L, null, identifierSpace, errorTable, entitySpace, javaSyntax, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -5552019638076652631L)
    private void AL() {
        try {
            if (SI) {
                iy.gn(-2562189612274064773L, this);
            }
            if (this.u7 != 1) {
                throw new Parser.a();
            }
            we();
            if (this.u7 != 91) {
                Ev(208, false, 1, false);
                return;
            }
            int i = 3;
            we();
            cn();
            while (this.u7 == 41) {
                we();
                cn();
                i += 2;
            }
            Ev(208, false, i, false);
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, -2562189612274064773L, this);
            }
            throw th;
        }
    }

    @ey(method = -876581708949802145L)
    private void BT() {
        try {
            if (SI) {
                iy.gn(663286020550934165L, this);
            }
            J0(8);
            int i = 2;
            if (this.u7 == 9) {
                we();
                QX(196, 2);
                return;
            }
            do {
                if (this.u7 != 8) {
                    Qq();
                } else {
                    BT();
                }
                i++;
                if (this.u7 != 15) {
                    break;
                }
                we();
                i++;
            } while (this.u7 != 9);
            J0(9);
            QX(196, i);
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, 663286020550934165L, this);
            }
            throw th;
        }
    }

    @ey(method = -1293865170788439645L)
    private boolean CU() {
        try {
            if (SI) {
                iy.gn(4777857888378173865L, this);
            }
            this.ei = 0;
            int i = 0;
            do {
                int i2 = this.ei;
                this.ei = i2 + 1;
                if (U2(i2) != 21) {
                    return false;
                }
                int i3 = this.ei;
                this.ei = i3 + 1;
                if (U2(i3) != 2) {
                    return false;
                }
                i++;
            } while (U2(this.ei) == 21);
            return i >= 100;
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, 4777857888378173865L, this);
            }
            throw th;
        }
    }

    @ey(method = -128509606035414276L)
    private boolean Eq() {
        try {
            if (SI) {
                iy.gn(2221904993577665400L, this);
            }
            int iU2 = U2(this.ei);
            if (iU2 != 1) {
                if (iU2 != 57 && iU2 != 60 && iU2 != 62 && iU2 != 65 && iU2 != 69 && iU2 != 81 && iU2 != 89 && iU2 != 114 && iU2 != 76 && iU2 != 77) {
                    return false;
                }
                this.ei++;
                while (U2(this.ei) == 10) {
                    this.ei++;
                    while (U2(this.ei) == 15) {
                        this.ei++;
                    }
                    if (U2(this.ei) != 11) {
                        return false;
                    }
                    this.ei++;
                }
                return true;
            }
            while (U2(this.ei) == 1) {
                int i = this.ei + 1;
                this.ei = i;
                if (U2(i) == 44 && !hz()) {
                    return false;
                }
                int iU22 = U2(this.ei);
                if (iU22 == 10) {
                    while (U2(this.ei) == 10) {
                        this.ei++;
                        while (U2(this.ei) == 15) {
                            this.ei++;
                        }
                        if (U2(this.ei) != 11) {
                            return false;
                        }
                        this.ei++;
                    }
                    return true;
                }
                if (iU22 != 16) {
                    return true;
                }
                this.ei++;
            }
            return false;
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, 2221904993577665400L, this);
            }
            throw th;
        }
    }

    @ey(method = 532632915878541664L)
    private void Ev(int i, boolean z, int i2, boolean z2) {
        try {
            if (SI) {
                iy.J0(-6317993549927158528L, this, new Integer(i), new Boolean(z), new Integer(i2), new Boolean(z2));
            }
            if (this.a8.isMemberDeclaration(i)) {
                if (z2) {
                    int i3 = this.yS;
                    this.yS = i3 + 1;
                    j3(i, z, i2, i3);
                    return;
                } else {
                    int i4 = this.er;
                    this.er = i4 + 1;
                    j3(i, z, i2, i4);
                    return;
                }
            }
            if (!this.a8.isClassDeclaration(i)) {
                aM(i, z, i2);
                return;
            }
            if (i == 128 || i == 129 || i == 177 || i == 222) {
                int i5 = this.BT;
                this.BT = i5 + 1;
                j3(i, z, i2, i5);
            } else {
                int i6 = this.gW;
                this.gW = i6 + 1;
                j3(i, z, i2, i6);
            }
        } catch (Throwable th) {
            if (KD) {
                iy.a8(th, -6317993549927158528L, this, new Integer(i), new Boolean(z), new Integer(i2), new Boolean(z2));
            }
            throw th;
        }
    }

    @ey(method = 8601706439218500L)
    private void FN(boolean z, boolean z2) {
        try {
            if (SI) {
                iy.EQ(-8657167527436880L, this, new Boolean(z), new Boolean(z2));
            }
            int iOY = oY();
            boolean z3 = true;
            switch (this.u7) {
                case 1:
                    if (Zo() == this.nw) {
                        sh(false, true, (iOY & 536870912) != 0);
                        return;
                    }
                    if (U2(1) != 12) {
                        if (!jJ()) {
                            zh();
                            vy();
                            if (this.u7 != 1) {
                                throw new Parser.a();
                            }
                            sy(y1.gn(iOY) || z2);
                            return;
                        }
                        QX(207, 0);
                        zh();
                        vy();
                        if (this.u7 != 1) {
                            throw new Parser.a();
                        }
                        jO(y1.gn(iOY) || z2);
                        return;
                    }
                    QX(207, 0);
                    we();
                    if (z) {
                        vJ();
                    } else {
                        WB();
                    }
                    qp();
                    if (this.u7 == 14) {
                        we();
                    } else {
                        if (this.u7 != 8) {
                            throw new Parser.a();
                        }
                        cb(z);
                    }
                    if (!y1.gn(iOY) && !z2) {
                        z3 = false;
                    }
                    Ev(123, false, 6, z3);
                    return;
                case 8:
                    nw();
                    Ev(127, false, 2, true);
                    return;
                case 44:
                    w9();
                    if (this.u7 != 1 || U2(1) != 12) {
                        zh();
                        vy();
                        if (this.u7 != 1) {
                            throw new Parser.a();
                        }
                        jO(y1.gn(iOY) || z2);
                        return;
                    }
                    we();
                    if (z) {
                        vJ();
                    } else {
                        WB();
                    }
                    qp();
                    if (this.u7 == 14) {
                        we();
                    } else {
                        if (this.u7 != 8) {
                            throw new Parser.a();
                        }
                        cb(z);
                    }
                    if (!y1.gn(iOY) && !z2) {
                        z3 = false;
                    }
                    Ev(123, false, 6, z3);
                    return;
                case 57:
                case 60:
                case 62:
                case ProxyTextView.INPUTTYPE_textShortMessage /* 65 */:
                case 69:
                case 76:
                case 77:
                case ProxyTextView.INPUTTYPE_textLongMessage /* 81 */:
                case 89:
                case 114:
                    if (!jJ()) {
                        zh();
                        vy();
                        if (this.u7 != 1) {
                            throw new Parser.a();
                        }
                        sy(y1.gn(iOY) || z2);
                        return;
                    }
                    QX(207, 0);
                    zh();
                    vy();
                    if (this.u7 != 1) {
                        throw new Parser.a();
                    }
                    jO(y1.gn(iOY) || z2);
                    return;
                case 72:
                case 99:
                case 107:
                    sh(false, true, (iOY & 536870912) != 0);
                    return;
                case 118:
                    sG(true);
                    return;
                case 119:
                    J8();
                    sG(true);
                    return;
                default:
                    throw new Parser.a();
            }
        } catch (Throwable th) {
            if (KD) {
                iy.Mr(th, -8657167527436880L, this, new Boolean(z), new Boolean(z2));
            }
            throw th;
        }
    }

    @ey(method = -3802598320733010855L)
    private void I() {
        try {
            if (SI) {
                iy.gn(793209033671432711L, this);
            }
            DW("Unexpected end of import");
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, 793209033671432711L, this);
            }
            throw th;
        }
    }

    @ey(method = -2124704030308968516L)
    private void KD(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        try {
            if (SI) {
                iy.QX(993423432125094344L, this, new Object[]{new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4), new Boolean(z5), new Integer(i)});
            }
            we();
            int iEf = z5 ? ef(i) + 2 : 2;
            boolean z6 = false;
            while (true) {
                if (this.u7 == 14) {
                    J8();
                } else {
                    int i2 = this.u7;
                    if (i2 == 0) {
                        g3();
                        if (!z6 && !z2 && !z4) {
                            OW(i, z5, z3);
                            iEf++;
                        }
                        J0(9);
                        QX(122, iEf);
                        return;
                    }
                    if (i2 != 9) {
                        int i3 = this.tp;
                        int i4 = this.j3;
                        try {
                            FN(z5, z2 || z3);
                            if (this.gn.getSyntaxTag(this.aM[this.j3]) == 123) {
                                z6 = true;
                            }
                            iEf++;
                        } catch (Parser.a unused) {
                            g3();
                            this.j3 = i4;
                        }
                        if (this.tp == i3) {
                            J8();
                        }
                    } else {
                        if (!z || Xa()) {
                            break;
                        }
                        Hw();
                        J8();
                    }
                    while (this.u7 == 14) {
                        J8();
                    }
                }
            }
            if (!z6 && !z2 && !z4) {
                OW(i, z5, z3);
                iEf++;
            }
            we();
            QX(122, iEf);
        } catch (Throwable th) {
            if (KD) {
                iy.rN(th, 993423432125094344L, this, new Object[]{new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4), new Boolean(z5), new Integer(i)});
            }
            throw th;
        }
    }

    @ey(method = 2393899361795304132L)
    private void Mz() {
        try {
            if (SI) {
                iy.gn(-1921885820597681688L, this);
            }
            DW("Unexpected end of expression");
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, -1921885820597681688L, this);
            }
            throw th;
        }
    }

    @ey(method = 2925455495307172289L)
    private void OW(int i, boolean z, boolean z2) {
        try {
            if (SI) {
                iy.we(1588800861007449243L, this, new Integer(i), new Boolean(z), new Boolean(z2));
            }
            if (!z) {
                gn(84);
                EQ(199, 1);
                EQ(207, 0);
                XX(i);
                gn(12);
                gn(13);
                EQ(190, 2);
                EQ(195, 0);
                gn(8);
                EQ(206, 0);
                gn(78);
                gn(12);
                gn(13);
                EQ(197, 2);
                br();
                EQ(164, 4);
                gn(14);
                EQ(146, 2);
                gn(9);
                EQ(133, 3);
                Ev(123, true, 6, z2);
                return;
            }
            gn(84);
            EQ(199, 1);
            EQ(207, 0);
            XX(i);
            gn(12);
            EQ(199, 0);
            XX(this.lg.get("String"));
            EQ(206, 0);
            EQ(180, 2);
            EQ(198, 0);
            XX(this.lg.get("$name"));
            EQ(198, 0);
            EQ(191, 5);
            gn(15);
            EQ(199, 0);
            gn(57);
            EQ(180, 1);
            EQ(198, 0);
            XX(this.lg.get("$ordinal"));
            EQ(198, 0);
            EQ(191, 5);
            gn(13);
            EQ(190, 5);
            EQ(195, 0);
            gn(8);
            EQ(206, 0);
            gn(78);
            gn(12);
            XX(this.lg.get("$name"));
            EQ(ProxyTextView.INPUTTYPE_textWebEditText, 1);
            gn(15);
            XX(this.lg.get("$ordinal"));
            EQ(ProxyTextView.INPUTTYPE_textWebEditText, 1);
            gn(13);
            EQ(197, 5);
            br();
            EQ(164, 4);
            gn(14);
            EQ(146, 2);
            gn(9);
            EQ(133, 3);
            Ev(123, true, 6, z2);
        } catch (Throwable th) {
            if (KD) {
                iy.U2(th, 1588800861007449243L, this, new Integer(i), new Boolean(z), new Boolean(z2));
            }
            throw th;
        }
    }

    @ey(method = 458665429311085424L)
    private void P8() {
        try {
            if (SI) {
                iy.gn(-2429819084893907700L, this);
            }
            int i = 0;
            while (this.u7 == 15) {
                we();
                i++;
            }
            QX(240, i);
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, -2429819084893907700L, this);
            }
            throw th;
        }
    }

    @ey(method = 4190776133480007600L)
    private void Qq() {
        try {
            if (SI) {
                iy.gn(2762746196233328280L, this);
            }
            hK();
            mb();
            aj();
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, 2762746196233328280L, this);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x010e A[Catch: all -> 0x0174, FALL_THROUGH, TryCatch #1 {all -> 0x0174, blocks: (B:6:0x000d, B:8:0x0013, B:27:0x003d, B:29:0x0044, B:73:0x0158, B:75:0x015c, B:33:0x004d, B:35:0x0052, B:37:0x0059, B:39:0x005e, B:45:0x007a, B:46:0x007d, B:47:0x0080, B:48:0x0083, B:71:0x013c, B:50:0x0088, B:52:0x0094, B:54:0x00a0, B:56:0x00ae, B:58:0x00c2, B:60:0x00cc, B:61:0x00de, B:70:0x013a, B:62:0x00e5, B:64:0x00ef, B:65:0x0101, B:66:0x010e, B:68:0x0118, B:69:0x012a, B:72:0x0145, B:36:0x0056, B:77:0x0166, B:79:0x016d), top: B:93:0x000d, inners: #0 }] */
    @abcd.ey(method = -1654796464935681424L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void SI(int r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.java.JavaParser.SI(int):void");
    }

    @ey(method = -62695594692864495L)
    private void Sf() {
        try {
            if (SI) {
                iy.gn(2296329360506266875L, this);
            }
            gn(84);
            gn(86);
            gn(75);
            int i = 3;
            while (true) {
                int i2 = this.u7;
                if (i2 != 75 && i2 != 86 && i2 != 104) {
                    if (i2 == 115) {
                        we();
                        i++;
                        yS();
                    } else if (i2 != 83 && i2 != 84 && i2 != 94 && i2 != 95 && i2 != 97 && i2 != 98 && i2 != 100 && i2 != 101) {
                        Mr(199, false, i);
                        return;
                    }
                }
                we();
                i++;
            }
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, 2296329360506266875L, this);
            }
            throw th;
        }
    }

    @ey(method = -2392231897887714880L)
    private void WB() {
        try {
            if (SI) {
                iy.gn(-2972453656314406628L, this);
            }
            we();
            int i = 2;
            if (this.u7 == 13) {
                we();
                QX(190, 2);
                return;
            }
            while (true) {
                jw();
                zh();
                vy();
                if (this.u7 != 1) {
                    throw new Parser.a();
                }
                we();
                vy();
                QX(191, 5);
                int i2 = i + 1;
                int i3 = this.u7;
                if (i3 == 13) {
                    we();
                    QX(190, i2);
                    return;
                } else if (i3 != 15) {
                    J0(13);
                    QX(190, i2);
                    return;
                } else {
                    we();
                    i = i2 + 1;
                }
            }
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, -2972453656314406628L, this);
            }
            throw th;
        }
    }

    @ey(method = 100512887942456144L)
    private boolean XG() {
        try {
            if (SI) {
                iy.gn(-123843248274489600L, this);
            }
            this.ei = 0;
            if (U2(0) == 75) {
                this.ei++;
            }
            if (!Eq() || U2(this.ei) != 1) {
                return false;
            }
            this.ei++;
            while (U2(this.ei) == 10) {
                int i = this.ei + 1;
                this.ei = i;
                if (U2(i) != 11) {
                    return false;
                }
                this.ei++;
            }
            return U2(this.ei) == 26;
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, -123843248274489600L, this);
            }
            throw th;
        }
    }

    @ey(method = -4505630396703671697L)
    private void XX(int i) {
        try {
            if (SI) {
                iy.u7(-4402275378258328711L, this, i);
            }
            tp(1, i);
        } catch (Throwable th) {
            if (KD) {
                iy.j3(th, -4402275378258328711L, this, new Integer(i));
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    @ey(method = -119967971830161687L)
    private boolean Xa() {
        long j = 778568379022940015;
        try {
            if (SI) {
                iy.gn(778568379022940015L, this);
            }
            this.ei = 1;
            if (U2(1) == 115 || U2(1) == 14) {
                return true;
            }
            while (true) {
                int iU2 = U2(this.ei);
                if (iU2 != 75 && iU2 != 84 && iU2 != 95) {
                    break;
                }
                this.ei++;
            }
            int iU22 = U2(this.ei);
            if (iU22 == 0) {
                return true;
            }
            if (iU22 != 1) {
                return iU22 == 72 || iU22 == 99 || iU22 == 107 || iU22 == 115 || iU22 == 118 || iU22 == 119;
            }
            int iVH = VH(this.ei);
            j = this.nw;
            return iVH == j;
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, j, this);
            }
            throw th;
        }
    }

    @ey(method = 173384695799399800L)
    private void aj() {
        try {
            if (SI) {
                iy.gn(3432620278663082964L, this);
            }
            int i = this.P8;
            int i2 = 0;
            while (true) {
                try {
                    switch (this.u7) {
                        case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                        case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
                        case 19:
                        case ProxyTextView.INPUTTYPE_date /* 20 */:
                        case 21:
                        case 23:
                        case 25:
                        case 27:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case ProxyTextView.INPUTTYPE_textEmailAddress /* 33 */:
                        case 35:
                        case ProxyTextView.INPUTTYPE_time /* 36 */:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case ProxyTextView.INPUTTYPE_textEmailSubject /* 49 */:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                            if (this.P8 >= this.vy.length) {
                                int[] iArr = new int[(this.vy.length * 2) + 1];
                                System.arraycopy(this.vy, 0, iArr, 0, this.vy.length);
                                this.vy = iArr;
                            }
                            this.vy[this.P8] = this.u7;
                            this.P8++;
                            i2++;
                            if (this.u7 == 25) {
                                we();
                                Qq();
                                J0(26);
                                QX(210, 3);
                                hK();
                            } else if (this.u7 == 17) {
                                we();
                                int i3 = this.j3;
                                try {
                                    hK();
                                } catch (Parser.a unused) {
                                    this.j3 = i3;
                                    gn(66);
                                    this.P8--;
                                    i2--;
                                    QX(172, 3);
                                    Mz();
                                }
                            } else {
                                we();
                                hK();
                            }
                            mb();
                            switch (this.u7) {
                                case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                                case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
                                case 19:
                                case ProxyTextView.INPUTTYPE_date /* 20 */:
                                case 21:
                                case 23:
                                case 25:
                                case 27:
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                case ProxyTextView.INPUTTYPE_textEmailAddress /* 33 */:
                                case 35:
                                case ProxyTextView.INPUTTYPE_time /* 36 */:
                                case 37:
                                case 38:
                                case 39:
                                case 40:
                                case 41:
                                case 42:
                                case 43:
                                case 44:
                                case 45:
                                case 46:
                                case 47:
                                case 48:
                                case ProxyTextView.INPUTTYPE_textEmailSubject /* 49 */:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                    while (i2 > 0) {
                                        if (this.a8.CU(this.vy[this.P8 - 1]) == this.a8.CU(this.u7)) {
                                            switch (this.u7) {
                                                case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                                                case ProxyTextView.INPUTTYPE_date /* 20 */:
                                                case 23:
                                                case 25:
                                                case 29:
                                                case 31:
                                                case ProxyTextView.INPUTTYPE_textEmailAddress /* 33 */:
                                                case 37:
                                                case 40:
                                                case 43:
                                                case 47:
                                                case 52:
                                                case 53:
                                                    break;
                                                default:
                                                    this.P8--;
                                                    i2--;
                                                    QX(172, 3);
                                            }
                                        } else if (this.a8.CU(this.vy[this.P8 - 1]) <= this.a8.CU(this.u7)) {
                                            this.P8--;
                                            i2--;
                                            QX(172, 3);
                                        }
                                    }
                                    break;
                            }
                            break;
                        case 22:
                        case 24:
                        case 26:
                        case 28:
                        case 34:
                        default:
                            for (int i4 = 0; i4 < i2; i4++) {
                                this.P8--;
                                QX(172, 3);
                            }
                            return;
                    }
                } catch (Parser.a e) {
                    this.P8 = i;
                    throw e;
                }
            }
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, 3432620278663082964L, this);
            }
            throw th;
        }
    }

    @ey(method = -2435937727682904064L)
    private boolean aq() {
        try {
            if (SI) {
                iy.gn(281266808461263408L, this);
            }
            this.ei = 0;
            if (!Eq() || U2(this.ei) != 1) {
                return false;
            }
            int iU2 = U2(this.ei + 1);
            return iU2 == 14 || iU2 == 17 || iU2 == 15 || iU2 == 10;
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, 281266808461263408L, this);
            }
            throw th;
        }
    }

    @ey(method = -4403877573339863685L)
    private void br() {
        try {
            if (SI) {
                iy.gn(-114178272724183335L, this);
            }
            tp(1, this.lg.get(""));
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, -114178272724183335L, this);
            }
            throw th;
        }
    }

    @ey(method = -3326427228964181405L)
    private void cT(boolean z) {
        try {
            if (SI) {
                iy.Ws(-7157686034584457751L, this, z);
            }
            jw();
            zh();
            vy();
            q7(z);
        } catch (Throwable th) {
            if (KD) {
                iy.j3(th, -7157686034584457751L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -610657614383829360L)
    private void ca() {
        try {
            if (SI) {
                iy.gn(2500851335219758300L, this);
            }
            DW("Unexpected end of package declaration");
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, 2500851335219758300L, this);
            }
            throw th;
        }
    }

    @ey(method = 2115993663460835824L)
    private void cb(boolean z) {
        try {
            if (SI) {
                iy.Ws(1201807773023073768L, this, z);
            }
            we();
            if (!yO()) {
                EQ(206, 0);
                gn(78);
                if (z) {
                    gn(12);
                    XX(this.lg.get("$name"));
                    EQ(ProxyTextView.INPUTTYPE_textWebEditText, 1);
                    gn(15);
                    XX(this.lg.get("$ordinal"));
                    EQ(ProxyTextView.INPUTTYPE_textWebEditText, 1);
                    gn(13);
                    EQ(197, 5);
                } else {
                    gn(12);
                    gn(13);
                    EQ(197, 2);
                }
                br();
                EQ(164, 4);
                gn(14);
                EQ(146, 2);
                SI(3);
                return;
            }
            if (!z || this.u7 != 67 || U2(1) != 12) {
                SI(2);
                return;
            }
            QX(206, 0);
            we();
            we();
            XX(this.lg.get("$name"));
            QX(ProxyTextView.INPUTTYPE_textWebEditText, 1);
            gn(15);
            XX(this.lg.get("$ordinal"));
            QX(ProxyTextView.INPUTTYPE_textWebEditText, 1);
            if (this.u7 == 13) {
                we();
                QX(197, 5);
            } else {
                gn(15);
                int i = 7;
                int i2 = this.j3;
                try {
                    Qq();
                } catch (Parser.a unused) {
                    this.j3 = i2;
                    gn(66);
                    Mz();
                }
                while (this.u7 == 15) {
                    we();
                    int i3 = this.j3;
                    try {
                        Qq();
                    } catch (Parser.a unused2) {
                        this.j3 = i3;
                        gn(66);
                        Mz();
                    }
                    i += 2;
                }
                J0(13);
                QX(197, i);
            }
            br();
            QX(163, 4);
            J0(14);
            QX(146, 2);
            SI(3);
        } catch (Throwable th) {
            if (KD) {
                iy.j3(th, 1201807773023073768L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -1794212023883728035L)
    private void cn() {
        try {
            if (SI) {
                iy.gn(763874096969067147L, this);
            }
            if (this.u7 != 1) {
                throw new Parser.a();
            }
            we();
            k2();
            int i = 2;
            while (this.u7 == 16) {
                we();
                if (this.u7 != 1) {
                    throw new Parser.a();
                }
                we();
                k2();
                i += 3;
            }
            QX(180, i);
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, 763874096969067147L, this);
            }
            throw th;
        }
    }

    @ey(method = 2656224958311300717L)
    private void dx() {
        try {
            if (SI) {
                iy.gn(1557105241011491075L, this);
            }
            we();
            int i = this.u7;
            int i2 = 2;
            if (i == 1) {
                cn();
                int i3 = this.u7;
                if (i3 == 10) {
                    while (this.u7 == 10) {
                        we();
                        int i4 = i2 + 1;
                        if (this.u7 != 11) {
                            Qq();
                            J0(11);
                            i2 = i4 + 1 + 1;
                        } else {
                            we();
                            i2 = i4 + 1;
                        }
                    }
                    if (this.u7 == 8) {
                        BT();
                        i2++;
                    }
                    QX(175, i2);
                    return;
                }
                if (i3 != 12) {
                    x9();
                    XL(206, 1, 0);
                    gn(12);
                    gn(13);
                    QX(197, 2);
                    QX(176, 4);
                    return;
                }
                XL(206, 1, 0);
                gW();
                if (this.u7 != 8) {
                    QX(176, 4);
                    return;
                } else {
                    KD(false, true, false, false, false, 0);
                    Ev(ProxyTextView.INPUTTYPE_textFilter, false, 5, false);
                    return;
                }
            }
            if (i == 44) {
                k2();
                cn();
                if (this.u7 != 12) {
                    x9();
                    XL(206, 1, 0);
                    gn(12);
                    gn(13);
                    QX(197, 2);
                    QX(176, 4);
                    return;
                }
                gW();
                if (this.u7 != 8) {
                    QX(176, 4);
                    return;
                } else {
                    KD(false, true, false, false, false, 0);
                    Ev(ProxyTextView.INPUTTYPE_textFilter, false, 5, false);
                    return;
                }
            }
            if (i != 57 && i != 60 && i != 62 && i != 65 && i != 69 && i != 81 && i != 89 && i != 114 && i != 76 && i != 77) {
                throw new Parser.a();
            }
            we();
            QX(180, 1);
            if (this.u7 != 10) {
                throw new Parser.a();
            }
            while (this.u7 == 10) {
                we();
                int i5 = i2 + 1;
                if (this.u7 != 11) {
                    Qq();
                    J0(11);
                    i2 = i5 + 1 + 1;
                } else {
                    we();
                    i2 = i5 + 1;
                }
            }
            if (this.u7 == 8) {
                BT();
                i2++;
            }
            QX(175, i2);
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, 1557105241011491075L, this);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0249 A[Catch: all -> 0x04bf, LOOP:1: B:67:0x0241->B:69:0x0249, LOOP_END, TryCatch #6 {all -> 0x04bf, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0012, B:8:0x002a, B:10:0x002e, B:13:0x0037, B:15:0x003e, B:18:0x0073, B:20:0x00be, B:36:0x015d, B:40:0x017f, B:42:0x0193, B:66:0x01fe, B:67:0x0241, B:69:0x0249, B:70:0x025c, B:45:0x01ab, B:48:0x01b0, B:50:0x01b6, B:53:0x01be, B:57:0x01d6, B:58:0x01db, B:65:0x01f9, B:41:0x0189, B:21:0x00c8, B:22:0x00ce, B:25:0x00dc, B:27:0x00e0, B:28:0x00e5, B:31:0x00f3, B:30:0x00e9, B:32:0x00f6, B:24:0x00d2, B:35:0x010d, B:59:0x01dc, B:60:0x01e5), top: B:92:0x0006 }] */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v4 */
    @abcd.ey(method = -1904767449677594493L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int ef(int r24) {
        /*
            Method dump skipped, instructions count: 1236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.java.JavaParser.ef(int):int");
    }

    @ey(method = 399557154822248608L)
    private void ei() {
        try {
            if (SI) {
                iy.gn(-3688922368045698592L, this);
            }
            int i = this.u7;
            int i2 = 67;
            if (i == 44) {
                k2();
                int i3 = this.u7;
                if (i3 == 67) {
                    we();
                    if (this.u7 != 12) {
                        throw new Parser.a();
                    }
                    gW();
                    br();
                    QX(163, 4);
                    return;
                }
                if (i3 != 78) {
                    throw new Parser.a();
                }
                we();
                if (this.u7 != 12) {
                    throw new Parser.a();
                }
                gW();
                br();
                QX(164, 4);
                return;
            }
            int i4 = 1;
            if (i != 60 && i != 62) {
                if (i != 74) {
                    if (i != 81 && i != 89 && i != 114 && i != 57) {
                        if (i == 58) {
                            dx();
                            return;
                        }
                        switch (i) {
                            case 1:
                                if (!et()) {
                                    we();
                                    int i5 = 1;
                                    while (this.u7 == 16) {
                                        we();
                                        int i6 = this.u7;
                                        if (i6 == 1) {
                                            if (U2(1) == 12) {
                                                QX(206, 0);
                                                i5++;
                                            }
                                            we();
                                        } else {
                                            if (i6 != 44) {
                                                if (i6 != 58) {
                                                    throw new Parser.a();
                                                }
                                                XL(ProxyTextView.INPUTTYPE_textWebEditText, 1, i5);
                                                ro();
                                                return;
                                            }
                                            k2();
                                            i5++;
                                            if (this.u7 != 1) {
                                                throw new Parser.a();
                                            }
                                            we();
                                            if (this.u7 != 12) {
                                                throw new Parser.a();
                                            }
                                        }
                                        i5 += 2;
                                    }
                                    if (this.u7 != 12) {
                                        QX(ProxyTextView.INPUTTYPE_textWebEditText, i5);
                                        return;
                                    } else {
                                        gW();
                                        QX(156, i5 + 1);
                                        return;
                                    }
                                }
                                we();
                                QX(206, 0);
                                int i7 = 2;
                                while (this.u7 == 16) {
                                    we();
                                    int i8 = this.u7;
                                    if (i8 == 1) {
                                        we();
                                        QX(206, 0);
                                        i7 += 3;
                                    } else {
                                        if (i8 == i2) {
                                            we();
                                            XL(180, 2, i7);
                                            QX(166, 3);
                                            return;
                                        }
                                        if (i8 == 72) {
                                            we();
                                            XL(180, 2, i7);
                                            XL(198, 2, 0);
                                            QX(167, 4);
                                            return;
                                        }
                                        if (i8 == 78) {
                                            we();
                                            XL(180, 2, i7);
                                            J0(16);
                                            if (U2(1) == 12) {
                                                k2();
                                            }
                                            if (this.u7 != 1) {
                                                throw new Parser.a();
                                            }
                                            we();
                                            if (this.u7 != 12) {
                                                QX(162, 5);
                                                return;
                                            } else {
                                                gW();
                                                QX(157, 7);
                                                return;
                                            }
                                        }
                                    }
                                    i2 = 67;
                                }
                                QX(180, i7);
                                if (this.u7 != 10) {
                                    throw new Parser.a();
                                }
                                vy();
                                J0(16);
                                J0(72);
                                QX(167, 4);
                                return;
                            case 2:
                                we();
                                if (CU()) {
                                    while (this.u7 == 21) {
                                        we();
                                        we();
                                        i4 += 2;
                                    }
                                    QX(178, i4);
                                    return;
                                }
                                return;
                            default:
                                switch (i) {
                                    case ProxyTextView.INPUTTYPE_textShortMessage /* 65 */:
                                    case 69:
                                        break;
                                    case 66:
                                    case 68:
                                        break;
                                    case 67:
                                        if (U2(1) == 12) {
                                            Mr(206, false, 0);
                                        }
                                        we();
                                        if (this.u7 != 12) {
                                            QX(166, 1);
                                            return;
                                        }
                                        gW();
                                        br();
                                        QX(163, 4);
                                        return;
                                    default:
                                        switch (i) {
                                            case 76:
                                            case 77:
                                                break;
                                            case 78:
                                                if (U2(1) == 12) {
                                                    Mr(206, false, 0);
                                                }
                                                we();
                                                if (this.u7 == 12) {
                                                    gW();
                                                    br();
                                                    QX(164, 4);
                                                    return;
                                                } else {
                                                    if (this.u7 != 16) {
                                                        throw new Parser.a();
                                                    }
                                                    we();
                                                    if (U2(1) == 12) {
                                                        k2();
                                                    }
                                                    if (this.u7 != 1) {
                                                        throw new Parser.a();
                                                    }
                                                    we();
                                                    if (this.u7 != 12) {
                                                        QX(162, 3);
                                                        return;
                                                    } else {
                                                        gW();
                                                        QX(157, 5);
                                                        return;
                                                    }
                                                }
                                            default:
                                                throw new Parser.a();
                                        }
                                }
                            case 3:
                            case 4:
                            case 5:
                            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                            case UserTouchAction.CLICK_KIND /* 7 */:
                                we();
                                return;
                        }
                    }
                }
                we();
                return;
            }
            we();
            QX(180, 1);
            vy();
            J0(16);
            J0(72);
            QX(167, 4);
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, -3688922368045698592L, this);
            }
            throw th;
        }
    }

    @ey(method = -3443616099300585080L)
    private void er() {
        try {
            if (SI) {
                iy.gn(4182095312344793712L, this);
            }
            J0(8);
            int i = 2;
            if (this.u7 == 9) {
                we();
                QX(196, 2);
                return;
            }
            do {
                int i2 = this.u7;
                if (i2 == 8) {
                    er();
                } else if (i2 != 115) {
                    Qq();
                } else {
                    we();
                    yS();
                }
                i++;
                if (this.u7 != 15) {
                    break;
                }
                we();
                i++;
            } while (this.u7 != 9);
            J0(9);
            QX(196, i);
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, 4182095312344793712L, this);
            }
            throw th;
        }
    }

    @ey(method = 302380482476699121L)
    private boolean et() {
        try {
            if (SI) {
                iy.gn(67245984787185479L, this);
            }
            this.ei = 0;
            if (U2(0) != 1) {
                return false;
            }
            this.ei++;
            while (U2(this.ei) == 16) {
                int i = this.ei + 1;
                this.ei = i;
                int iU2 = U2(i);
                if (iU2 == 1) {
                    this.ei++;
                } else if (iU2 == 67 || iU2 == 72 || iU2 == 78) {
                    return true;
                }
            }
            if (U2(this.ei) != 10) {
                return false;
            }
            while (U2(this.ei) == 10) {
                int i2 = this.ei + 1;
                this.ei = i2;
                if (U2(i2) != 11) {
                    return false;
                }
                this.ei++;
            }
            if (U2(this.ei) != 16) {
                return false;
            }
            int i3 = this.ei + 1;
            this.ei = i3;
            return U2(i3) == 72;
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, 67245984787185479L, this);
            }
            throw th;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @ey(method = 2398062348730397671L)
    private void fY() {
        try {
            if (SI) {
                iy.gn(-759865962108590775L, this);
            }
            int i = this.u7;
            int i2 = 1;
            if (i != 21 && i != 22 && i != 27 && i != 28 && i != 89) {
                if (i == 90) {
                    we();
                    J0(26);
                    QX(144, 2);
                    return;
                }
                if (i != 95) {
                    if (i == 96) {
                        we();
                        if (this.u7 != 1) {
                            J0(14);
                            QX(139, 2);
                            return;
                        } else {
                            we();
                            J0(14);
                            QX(139, 3);
                            return;
                        }
                    }
                    int i3 = 5;
                    if (i == 104) {
                        we();
                        J0(12);
                        Qq();
                        J0(13);
                        if (this.u7 != 8) {
                            throw new Parser.a();
                        }
                        nw();
                        QX(140, 5);
                        return;
                    }
                    if (i == 105) {
                        we();
                        Qq();
                        if (this.u7 != 26) {
                            J0(14);
                            QX(ProxyTextView.INPUTTYPE_textWebEmailAddress, 3);
                            return;
                        } else {
                            we();
                            Qq();
                            J0(14);
                            QX(ProxyTextView.INPUTTYPE_textWebEmailAddress, 5);
                            return;
                        }
                    }
                    if (i != 114) {
                        if (i != 115) {
                            switch (i) {
                                case 1:
                                    if (Zo() == this.nw && U2(1) == 1) {
                                        Mr(199, false, 0);
                                        sh(true, false, false);
                                        return;
                                    }
                                    if (U2(1) == 26) {
                                        we();
                                        we();
                                        fY();
                                        QX(148, 3);
                                        return;
                                    }
                                    if (aq()) {
                                        cT(true);
                                        return;
                                    }
                                    Qq();
                                    J0(14);
                                    QX(146, 2);
                                    return;
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                                case UserTouchAction.CLICK_KIND /* 7 */:
                                    break;
                                case 8:
                                    nw();
                                    return;
                                default:
                                    switch (i) {
                                        case 12:
                                        case 24:
                                        case 34:
                                        case 44:
                                        case 57:
                                        case 58:
                                        case 60:
                                        case 62:
                                            break;
                                        case 14:
                                            we();
                                            QX(134, 1);
                                            return;
                                        case 54:
                                            we();
                                            fY();
                                            if (this.u7 != 80) {
                                                throw new Parser.a();
                                            }
                                            we();
                                            J0(12);
                                            Qq();
                                            J0(13);
                                            J0(14);
                                            QX(ProxyTextView.INPUTTYPE_textVisiblePassword, 7);
                                            return;
                                        case 55:
                                            we();
                                            J0(12);
                                            Qq();
                                            J0(13);
                                            fY();
                                            if (this.u7 != 63) {
                                                QX(135, 5);
                                                return;
                                            }
                                            we();
                                            fY();
                                            QX(136, 7);
                                            return;
                                        case 56:
                                            we();
                                            J0(12);
                                            if (this.u7 == 14) {
                                                we();
                                                QX(201, 1);
                                            } else {
                                                if (XG()) {
                                                    jw();
                                                    zh();
                                                    vy();
                                                    if (this.u7 != 1) {
                                                        throw new Parser.a();
                                                    }
                                                    we();
                                                    vy();
                                                    J0(26);
                                                    Qq();
                                                    J0(13);
                                                    fY();
                                                    QX(211, 11);
                                                    return;
                                                }
                                                if (this.u7 == 75 || aq()) {
                                                    cT(true);
                                                    QX(201, 1);
                                                } else {
                                                    Qq();
                                                    int i4 = 2;
                                                    while (this.u7 == 15) {
                                                        we();
                                                        Qq();
                                                        i4 += 2;
                                                    }
                                                    J0(14);
                                                    QX(201, i4);
                                                }
                                            }
                                            if (this.u7 == 14) {
                                                we();
                                                QX(203, 1);
                                            } else {
                                                Qq();
                                                J0(14);
                                                QX(203, 2);
                                            }
                                            if (this.u7 == 13) {
                                                QX(202, 0);
                                            } else {
                                                Qq();
                                                while (this.u7 == 15) {
                                                    we();
                                                    Qq();
                                                    i2 += 2;
                                                }
                                                QX(202, i2);
                                            }
                                            J0(13);
                                            fY();
                                            QX(149, 7);
                                            return;
                                        case 59:
                                            we();
                                            if (this.u7 == 12) {
                                                we();
                                                cT(false);
                                                while (aq()) {
                                                    cT(false);
                                                    i3++;
                                                }
                                                J0(13);
                                                nw();
                                                QX(212, i3);
                                                return;
                                            }
                                            if (this.u7 != 8) {
                                                throw new Parser.a();
                                            }
                                            nw();
                                            int i5 = 2;
                                            while (this.u7 == 71) {
                                                we();
                                                J0(12);
                                                jw();
                                                if (this.u7 != 1) {
                                                    throw new Parser.a();
                                                }
                                                cn();
                                                int i6 = 1;
                                                while (this.u7 == 38) {
                                                    we();
                                                    cn();
                                                    i6 += 2;
                                                }
                                                QX(216, i6);
                                                if (this.u7 != 1) {
                                                    throw new Parser.a();
                                                }
                                                we();
                                                J0(13);
                                                if (this.u7 != 8) {
                                                    throw new Parser.a();
                                                }
                                                nw();
                                                QX(204, 7);
                                                i5++;
                                            }
                                            if (this.u7 == 92) {
                                                we();
                                                if (this.u7 != 8) {
                                                    throw new Parser.a();
                                                }
                                                nw();
                                                QX(205, 2);
                                                i5++;
                                            }
                                            QX(150, i5);
                                            return;
                                        case 61:
                                            we();
                                            Qq();
                                            J0(26);
                                            QX(143, 3);
                                            return;
                                        case 72:
                                        case 99:
                                        case 107:
                                            Mr(199, false, 0);
                                            sh(true, false, false);
                                            return;
                                        case 85:
                                            we();
                                            if (this.u7 == 14) {
                                                we();
                                                QX(141, 2);
                                                return;
                                            } else {
                                                Qq();
                                                J0(14);
                                                QX(141, 3);
                                                return;
                                            }
                                        case 87:
                                            we();
                                            J0(12);
                                            Qq();
                                            J0(13);
                                            if (this.u7 != 8) {
                                                throw new Parser.a();
                                            }
                                            nw();
                                            QX(147, 5);
                                            return;
                                        default:
                                            switch (i) {
                                                case ProxyTextView.INPUTTYPE_textShortMessage /* 65 */:
                                                case 66:
                                                case 67:
                                                case 68:
                                                case 69:
                                                    break;
                                                case 70:
                                                    we();
                                                    if (this.u7 != 1) {
                                                        J0(14);
                                                        QX(138, 2);
                                                        return;
                                                    } else {
                                                        we();
                                                        J0(14);
                                                        QX(138, 3);
                                                        return;
                                                    }
                                                default:
                                                    switch (i) {
                                                        case 74:
                                                        case 76:
                                                        case 77:
                                                        case 78:
                                                        case ProxyTextView.INPUTTYPE_textLongMessage /* 81 */:
                                                            break;
                                                        case 75:
                                                            break;
                                                        case 79:
                                                            we();
                                                            Qq();
                                                            J0(14);
                                                            QX(142, 3);
                                                            return;
                                                        case 80:
                                                            we();
                                                            J0(12);
                                                            Qq();
                                                            J0(13);
                                                            fY();
                                                            QX(137, 5);
                                                            return;
                                                        default:
                                                            throw new b(null);
                                                    }
                                            }
                                    }
                            }
                        }
                    }
                }
                jw();
                int i7 = this.u7;
                if (i7 == 1) {
                    if (Zo() == this.nw) {
                        Mr(199, false, 0);
                        sh(true, false, false);
                        return;
                    } else {
                        zh();
                        vy();
                        q7(true);
                        return;
                    }
                }
                if (i7 == 72 || i7 == 99 || i7 == 107) {
                    sh(true, false, false);
                    return;
                }
                zh();
                vy();
                q7(true);
                return;
            }
            if (aq()) {
                cT(true);
                return;
            }
            Qq();
            J0(14);
            QX(146, 2);
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, -759865962108590775L, this);
            }
            throw th;
        }
    }

    @ey(method = -597913365873825000L)
    private void g3() {
        try {
            if (SI) {
                iy.gn(-1987035373696308060L, this);
            }
            DW("Unexpected end of declaration");
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, -1987035373696308060L, this);
            }
            throw th;
        }
    }

    @ey(method = -2972192816927663424L)
    private void gW() {
        try {
            if (SI) {
                iy.gn(1835998371495299392L, this);
            }
            we();
            if (this.u7 == 13) {
                we();
                QX(197, 2);
                return;
            }
            int i = 3;
            int i2 = this.j3;
            try {
                Qq();
            } catch (Parser.a unused) {
                this.j3 = i2;
                gn(66);
                Mz();
            }
            while (this.u7 == 15) {
                we();
                int i3 = this.j3;
                try {
                    Qq();
                } catch (Parser.a unused2) {
                    this.j3 = i3;
                    gn(66);
                    Mz();
                }
                i += 2;
            }
            J0(13);
            QX(197, i);
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, 1835998371495299392L, this);
            }
            throw th;
        }
    }

    @ey(method = -6365792064835667067L)
    private void hK() {
        try {
            if (SI) {
                iy.gn(1632780866703727527L, this);
            }
            int i = 0;
            while (true) {
                int i2 = this.u7;
                if (i2 != 21 && i2 != 22 && i2 != 24 && i2 != 34 && i2 != 27 && i2 != 28) {
                    break;
                }
                we();
                i++;
            }
            if (this.u7 != 12) {
                ei();
                int i3 = this.u7;
                if (i3 == 10 || i3 == 16) {
                    rN();
                }
            } else {
                we();
                int i4 = this.u7;
                if (i4 != 1 && i4 != 57 && i4 != 60 && i4 != 62 && i4 != 65 && i4 != 69 && i4 != 81 && i4 != 89 && i4 != 114 && i4 != 76 && i4 != 77) {
                    Qq();
                    J0(13);
                    QX(168, 3);
                    int i5 = this.u7;
                    if (i5 == 10 || i5 == 16) {
                        rN();
                    }
                } else if (kQ()) {
                    zh();
                    vy();
                    J0(13);
                    hK();
                    while (true) {
                        int i6 = this.u7;
                        if (i6 != 22 && i6 != 28) {
                            break;
                        }
                        we();
                        QX(171, 2);
                    }
                    QX(169, 5);
                } else {
                    Qq();
                    J0(13);
                    QX(168, 3);
                    int i7 = this.u7;
                    if (i7 == 10 || i7 == 16) {
                        rN();
                    }
                }
            }
            for (int i8 = 0; i8 < i; i8++) {
                QX(170, 2);
            }
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, 1632780866703727527L, this);
            }
            throw th;
        }
    }

    @ey(method = -122628701751967528L)
    private boolean hz() {
        try {
            if (SI) {
                iy.gn(1849541421039797364L, this);
            }
            if (U2(this.ei) != 44) {
                return false;
            }
            int i = this.ei + 1;
            this.ei = i;
            if (U2(i) == 25) {
                int i2 = this.ei + 1;
                this.ei = i2;
                int iU2 = U2(i2);
                if (iU2 == 78 || iU2 == 91) {
                    this.ei++;
                    if (!Eq()) {
                        return false;
                    }
                }
            } else if (!Eq()) {
                return false;
            }
            while (U2(this.ei) == 15) {
                int i3 = this.ei + 1;
                this.ei = i3;
                if (U2(i3) == 25) {
                    int i4 = this.ei + 1;
                    this.ei = i4;
                    int iU22 = U2(i4);
                    if (iU22 == 78 || iU22 == 91) {
                        this.ei++;
                        if (!Eq()) {
                            return false;
                        }
                    }
                } else if (!Eq()) {
                    return false;
                }
            }
            int iU23 = U2(this.ei);
            if (iU23 == 48 || iU23 == 50 || iU23 == 51) {
                this.ei++;
            }
            return true;
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, 1849541421039797364L, this);
            }
            throw th;
        }
    }

    @ey(method = 2811216559099762671L)
    private boolean jJ() {
        try {
            if (SI) {
                iy.gn(-1503582098884607239L, this);
            }
            this.ei = 0;
            if (Eq() && U2(this.ei) == 1) {
                return U2(this.ei + 1) == 12;
            }
            return false;
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, -1503582098884607239L, this);
            }
            throw th;
        }
    }

    @ey(method = 134969535707023688L)
    private void jO(boolean z) {
        try {
            if (SI) {
                iy.Ws(8063566739295387540L, this, z);
            }
            we();
            if (this.u7 != 12) {
                throw new Parser.a();
            }
            WB();
            vy();
            qp();
            int i = this.u7;
            if (i == 8) {
                nw();
                Ev(124, false, 9, z);
                return;
            }
            if (i == 14) {
                we();
                Ev(124, false, 9, z);
                return;
            }
            if (i != 90) {
                gn(14);
                Ev(124, false, 9, z);
                return;
            }
            we();
            int i2 = this.u7;
            if (i2 == 8) {
                BT();
            } else if (i2 != 115) {
                Qq();
            } else {
                we();
                yS();
            }
            J0(14);
            QX(232, 3);
            Ev(124, false, 9, z);
        } catch (Throwable th) {
            if (KD) {
                iy.j3(th, 8063566739295387540L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -4199302559273015103L)
    private void jw() {
        try {
            if (SI) {
                iy.gn(561077543980632035L, this);
            }
            int i = 0;
            while (true) {
                int i2 = this.u7;
                if (i2 == 75 || i2 == 95) {
                    we();
                    i++;
                } else if (i2 != 115) {
                    Mr(199, false, i);
                    return;
                } else {
                    we();
                    i++;
                    yS();
                }
            }
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, 561077543980632035L, this);
            }
            throw th;
        }
    }

    @ey(method = -3311436943616479000L)
    private void k2() {
        try {
            if (SI) {
                iy.gn(-570472762237462188L, this);
            }
            if (this.u7 != 44) {
                QX(206, 0);
                return;
            }
            we();
            if (this.u7 == 48) {
                we();
                QX(206, 2);
                return;
            }
            if (this.u7 != 25) {
                QX(230, 0);
                zh();
                vy();
            } else {
                we();
                int i = this.u7;
                if (i == 78 || i == 91) {
                    we();
                    QX(230, 2);
                    zh();
                    vy();
                } else {
                    QX(230, 1);
                    XX(this.lg.get("Object"));
                    QX(206, 0);
                    QX(180, 2);
                    QX(198, 0);
                }
            }
            int i2 = 5;
            while (this.u7 == 15) {
                we();
                if (this.u7 != 25) {
                    QX(230, 0);
                    zh();
                    vy();
                } else {
                    we();
                    int i3 = this.u7;
                    if (i3 == 78 || i3 == 91) {
                        we();
                        QX(230, 2);
                        zh();
                        vy();
                    } else {
                        QX(230, 1);
                        XX(this.lg.get("Object"));
                        QX(206, 0);
                        QX(180, 2);
                        QX(198, 0);
                    }
                }
                i2 += 4;
            }
            int i4 = this.u7;
            if (i4 == 48) {
                we();
            } else if (i4 == 50) {
                gn(48);
                this.u7 = 48;
                int[] iArr = this.QX;
                int i5 = this.tp;
                iArr[i5] = iArr[i5] + 1;
            } else {
                if (i4 != 51) {
                    throw new Parser.a();
                }
                gn(48);
                this.u7 = 50;
                int[] iArr2 = this.QX;
                int i6 = this.tp;
                iArr2[i6] = iArr2[i6] + 1;
            }
            QX(206, i2);
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, -570472762237462188L, this);
            }
            throw th;
        }
    }

    @ey(method = -170137650945362261L)
    private boolean kQ() {
        try {
            if (SI) {
                iy.gn(2177068661559644753L, this);
            }
            this.ei = 0;
            int iU2 = U2(0);
            if (iU2 == 1) {
                while (U2(this.ei) == 1) {
                    int i = this.ei + 1;
                    this.ei = i;
                    if (U2(i) == 44 && !hz()) {
                        return false;
                    }
                    int iU22 = U2(this.ei);
                    if (iU22 == 10) {
                        while (U2(this.ei) == 10) {
                            int i2 = this.ei + 1;
                            this.ei = i2;
                            if (U2(i2) != 11) {
                                return false;
                            }
                            this.ei++;
                        }
                    } else if (iU22 == 16) {
                        this.ei++;
                    }
                    if (U2(this.ei) != 13) {
                        return false;
                    }
                    int i3 = this.ei + 1;
                    this.ei = i3;
                    int iU23 = U2(i3);
                    if (iU23 != 12 && iU23 != 24 && iU23 != 34 && iU23 != 58 && iU23 != 74 && iU23 != 78) {
                        switch (iU23) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                            case UserTouchAction.CLICK_KIND /* 7 */:
                                break;
                            default:
                                switch (iU23) {
                                }
                        }
                    }
                    return true;
                }
            }
            if (iU2 == 57 || iU2 == 60 || iU2 == 62 || iU2 == 65 || iU2 == 69 || iU2 == 81 || iU2 == 89 || iU2 == 114 || iU2 == 76 || iU2 == 77) {
                this.ei++;
                while (U2(this.ei) == 10) {
                    int i4 = this.ei + 1;
                    this.ei = i4;
                    if (U2(i4) != 11) {
                        return false;
                    }
                    this.ei++;
                }
                if (U2(this.ei) != 13) {
                    return false;
                }
                int i5 = this.ei + 1;
                this.ei = i5;
                int iU24 = U2(i5);
                if (iU24 != 12 && iU24 != 24 && iU24 != 34 && iU24 != 58 && iU24 != 74 && iU24 != 78 && iU24 != 21 && iU24 != 22 && iU24 != 27 && iU24 != 28) {
                    switch (iU24) {
                        default:
                            switch (iU24) {
                            }
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                        case UserTouchAction.CLICK_KIND /* 7 */:
                            return true;
                    }
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, 2177068661559644753L, this);
            }
            throw th;
        }
    }

    @ey(method = 160539668053445840L)
    private void ko() {
        try {
            if (SI) {
                iy.gn(-160090348387206336L, this);
            }
            int i = 0;
            while (this.u7 == 115) {
                we();
                i++;
                if (this.u7 != 1) {
                    Mr(199, false, i);
                    return;
                }
                yS();
            }
            Mr(199, false, i);
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, -160090348387206336L, this);
            }
            throw th;
        }
    }

    @ey(method = 537832610601679125L)
    private void lp(SyntaxTree syntaxTree, int i) throws Throwable {
        try {
            if (SI) {
                try {
                    iy.EQ(56696103731542803L, this, syntaxTree, new Integer(i));
                } catch (Throwable th) {
                    th = th;
                    if (KD) {
                        iy.Mr(th, 56696103731542803L, this, syntaxTree, new Integer(i));
                    }
                    throw th;
                }
            }
            int childCount = syntaxTree.getChildCount(syntaxTree.getRootNode());
            for (int i2 = 0; i2 < childCount; i2++) {
                int childNode = syntaxTree.getChildNode(syntaxTree.getRootNode(), i2);
                if ((syntaxTree.getSyntaxTag(childNode) == 120 || syntaxTree.getSyntaxTag(childNode) == 220 || syntaxTree.getSyntaxTag(childNode) == 121) && syntaxTree.getIdentifier(syntaxTree.getChildNode(childNode, 2)) == i) {
                    return;
                }
            }
            syntaxTree.U2(syntaxTree.declareNode(223, false, new int[]{syntaxTree.declareNode(120, true, new int[]{syntaxTree.declareNode(199, true, new int[]{syntaxTree.rN(84, true, 1, 1, 1)}, 0, 1, 1, 1), syntaxTree.rN(72, true, 1, 1, 1), syntaxTree.declareNode(1, true, i, 1, 1, 1, 1), syntaxTree.declareNode(207, true, new int[0], 0, 0, 1, 1), syntaxTree.declareNode(192, true, new int[0], 0, 0, 1, 1), syntaxTree.declareNode(ProxyTextView.INPUTTYPE_textPhonetic, true, new int[0], 0, 0, 1, 1), syntaxTree.declareNode(122, true, new int[]{syntaxTree.rN(8, true, 1, 1, 1), syntaxTree.rN(9, true, 1, 1, 1)}, 0, 2, 1, 1)}, 0, 7, 1, 1, 0)}, 0, 1, 1, 1));
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @ey(method = -2664873758136883489L)
    private void mb() {
        try {
            if (SI) {
                iy.gn(3672653960586983125L, this);
            }
            while (true) {
                int i = this.u7;
                if (i == 22 || i == 28) {
                    we();
                    QX(171, 2);
                } else {
                    if (i != 103) {
                        return;
                    }
                    we();
                    zh();
                    vy();
                    QX(173, 4);
                }
            }
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, 3672653960586983125L, this);
            }
            throw th;
        }
    }

    @ey(method = -842436351800431377L)
    private void nw() {
        try {
            if (SI) {
                iy.gn(689258421147734093L, this);
            }
            J0(8);
            SI(2);
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, 689258421147734093L, this);
            }
            throw th;
        }
    }

    @ey(method = -3211657746964273300L)
    private int oY() {
        try {
            if (SI) {
                iy.gn(1619297884492742376L, this);
            }
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = this.u7;
                if (i3 != 75 && i3 != 86 && i3 != 104) {
                    if (i3 == 115) {
                        we();
                        i++;
                        if (this.u7 != 1) {
                            Mr(199, false, i);
                            return 536870912 | i2;
                        }
                        yS();
                    } else if (i3 != 83 && i3 != 84) {
                        if (i3 == 94) {
                            i2 |= 4;
                            we();
                            i++;
                        } else if (i3 != 95 && i3 != 97 && i3 != 98 && i3 != 100 && i3 != 101) {
                            Mr(199, false, i);
                            return i2;
                        }
                    }
                }
                we();
                i++;
            }
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, 1619297884492742376L, this);
            }
            throw th;
        }
    }

    @ey(method = 1009046440462897672L)
    private void q7(boolean z) {
        try {
            if (SI) {
                iy.Ws(-819851005236197060L, this, z);
            }
            int i = 5;
            if (this.u7 != 1) {
                throw new Parser.a();
            }
            we();
            vy();
            if (this.u7 == 17) {
                we();
                if (this.u7 == 8) {
                    BT();
                    QX(200, 4);
                } else {
                    int i2 = this.j3;
                    try {
                        Qq();
                    } catch (Parser.a unused) {
                        this.j3 = i2;
                        gn(66);
                    }
                    QX(200, 4);
                }
            } else {
                QX(200, 2);
            }
            while (this.u7 == 15) {
                we();
                if (this.u7 != 1) {
                    throw new Parser.a();
                }
                we();
                vy();
                if (this.u7 == 17) {
                    we();
                    if (this.u7 == 8) {
                        BT();
                        QX(200, 4);
                    } else {
                        Qq();
                        QX(200, 4);
                    }
                } else {
                    QX(200, 2);
                }
                i += 2;
            }
            if (z) {
                J0(14);
            } else if (this.u7 == 14) {
                we();
            } else {
                gn(14);
            }
            QX(151, i);
        } catch (Throwable th) {
            if (KD) {
                iy.j3(th, -819851005236197060L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -1914975304113612675L)
    private void qp() {
        try {
            if (SI) {
                iy.gn(5609801747074353471L, this);
            }
            if (this.u7 != 88) {
                QX(195, 0);
                return;
            }
            we();
            if (this.u7 != 1) {
                throw new Parser.a();
            }
            cn();
            int i = 2;
            while (this.u7 == 15) {
                we();
                if (this.u7 != 1) {
                    throw new Parser.a();
                }
                cn();
                i += 2;
            }
            QX(195, i);
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, 5609801747074353471L, this);
            }
            throw th;
        }
    }

    @ey(method = -2217594436050512388L)
    private void rN() {
        try {
            if (SI) {
                iy.gn(-2629089432126656584L, this);
            }
            while (true) {
                int i = this.u7;
                if (i == 10) {
                    int i2 = 4;
                    we();
                    Qq();
                    while (this.u7 == 15) {
                        we();
                        Qq();
                        i2 += 2;
                    }
                    J0(11);
                    QX(165, i2);
                } else {
                    if (i != 16) {
                        return;
                    }
                    we();
                    int i3 = this.u7;
                    if (i3 == 1) {
                        if (U2(1) == 12) {
                            QX(206, 0);
                        }
                        we();
                        if (this.u7 == 12) {
                            gW();
                            QX(155, 5);
                        } else {
                            QX(159, 3);
                        }
                    } else if (i3 == 44) {
                        k2();
                        int i4 = this.u7;
                        if (i4 == 1) {
                            we();
                            if (this.u7 != 12) {
                                throw new Parser.a();
                            }
                            gW();
                            QX(155, 5);
                        } else {
                            if (i4 != 78) {
                                throw new Parser.a();
                            }
                            we();
                            if (this.u7 != 12) {
                                throw new Parser.a();
                            }
                            gW();
                            br();
                            QX(164, 6);
                        }
                    } else if (i3 == 58) {
                        ro();
                    } else {
                        if (i3 != 78) {
                            throw new Parser.a();
                        }
                        QX(206, 0);
                        we();
                        if (this.u7 != 12) {
                            throw new Parser.a();
                        }
                        gW();
                        br();
                        QX(164, 6);
                    }
                }
            }
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, -2629089432126656584L, this);
            }
            throw th;
        }
    }

    @ey(method = -191883305458800057L)
    private void ro() {
        try {
            if (SI) {
                iy.gn(2160206283260826497L, this);
            }
            we();
            k2();
            if (this.u7 != 1) {
                throw new Parser.a();
            }
            cn();
            if (this.u7 != 12) {
                throw new Parser.a();
            }
            gW();
            if (this.u7 != 8) {
                QX(176, 6);
            } else {
                KD(false, true, false, false, false, 0);
                Ev(ProxyTextView.INPUTTYPE_textFilter, false, 7, false);
            }
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, 2160206283260826497L, this);
            }
            throw th;
        }
    }

    @ey(method = 275770341466472004L)
    private void sG(boolean z) {
        try {
            if (SI) {
                iy.Ws(-277232526494186952L, this, z);
            }
            we();
            zh();
            vy();
            if (this.u7 != 1) {
                throw new Parser.a();
            }
            we();
            WB();
            J0(14);
            if (z) {
                QX(246, 7);
            } else {
                QX(245, 7);
            }
        } catch (Throwable th) {
            if (KD) {
                iy.j3(th, -277232526494186952L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 501045627232383635L)
    private void sh(boolean z, boolean z2, boolean z3) {
        try {
            if (SI) {
                iy.we(75450974417503685L, this, new Boolean(z), new Boolean(z2), new Boolean(z3));
            }
            boolean z4 = this.u7 == 72;
            boolean z5 = this.u7 == 1 && Zo() == this.nw;
            we();
            if (this.u7 != 1) {
                throw new Parser.a();
            }
            int iZo = Zo();
            we();
            w9();
            int i = 2;
            if (z3) {
                gn(91);
                XX(this.lg.get("java"));
                EQ(206, 0);
                gn(16);
                XX(this.lg.get("lang"));
                EQ(206, 0);
                gn(16);
                XX(this.lg.get("annotation"));
                EQ(206, 0);
                gn(16);
                XX(this.lg.get("Annotation"));
                EQ(206, 0);
                EQ(180, 11);
                EQ(192, 2);
                EQ(ProxyTextView.INPUTTYPE_textPhonetic, 0);
            } else {
                if (z5) {
                    gn(91);
                    XX(this.lg.get("Enum"));
                    gn(44);
                    EQ(230, 0);
                    XX(iZo);
                    EQ(206, 0);
                    EQ(180, 2);
                    EQ(198, 0);
                    gn(48);
                    EQ(206, 5);
                    EQ(180, 2);
                    EQ(192, 2);
                } else if (this.u7 == 91) {
                    we();
                    if (this.u7 != 1) {
                        throw new Parser.a();
                    }
                    cn();
                    int i2 = 2;
                    while (this.u7 == 15) {
                        we();
                        if (this.u7 != 1) {
                            throw new Parser.a();
                        }
                        cn();
                        i2 += 2;
                    }
                    QX(192, i2);
                } else {
                    QX(192, 0);
                }
                if (this.u7 == 102) {
                    we();
                    if (this.u7 != 1) {
                        throw new Parser.a();
                    }
                    cn();
                    while (this.u7 == 15) {
                        we();
                        if (this.u7 != 1) {
                            throw new Parser.a();
                        }
                        cn();
                        i += 2;
                    }
                    QX(ProxyTextView.INPUTTYPE_textPhonetic, i);
                } else {
                    QX(ProxyTextView.INPUTTYPE_textPhonetic, 0);
                }
            }
            if (this.u7 != 8) {
                throw new Parser.a();
            }
            KD((z2 || z) ? false : true, false, z, (z4 || z5) ? false : true, z5, iZo);
            if (z) {
                if (z4) {
                    Ev(128, false, 7, false);
                    return;
                } else if (z5) {
                    Ev(222, false, 7, false);
                    return;
                } else {
                    Ev(ProxyTextView.INPUTTYPE_textPassword, false, 7, false);
                    return;
                }
            }
            if (z2) {
                if (z4) {
                    Ev(227, false, 7, false);
                    return;
                } else if (z5) {
                    Ev(221, false, 7, false);
                    return;
                } else {
                    Ev(228, false, 7, false);
                    return;
                }
            }
            if (z4) {
                ye(120, false, 7, false, iZo);
            } else if (z5) {
                ye(220, false, 7, false, iZo);
            } else {
                ye(121, false, 7, false, iZo);
            }
        } catch (Throwable th) {
            if (KD) {
                iy.U2(th, 75450974417503685L, this, new Boolean(z), new Boolean(z2), new Boolean(z3));
            }
            throw th;
        }
    }

    @ey(method = -7353034283211785569L)
    private void sy(boolean z) {
        try {
            if (SI) {
                iy.Ws(5632664968242916045L, this, z);
            }
            we();
            vy();
            if (this.u7 == 17) {
                we();
                if (this.u7 == 8) {
                    BT();
                    Ev(194, false, 4, z);
                } else {
                    Qq();
                    Ev(194, false, 4, z);
                }
            } else {
                Ev(194, false, 2, z);
            }
            int i = 5;
            while (this.u7 == 15) {
                we();
                if (this.u7 != 1) {
                    throw new Parser.a();
                }
                we();
                vy();
                if (this.u7 == 17) {
                    we();
                    if (this.u7 == 8) {
                        BT();
                        Ev(194, false, 4, z);
                    } else {
                        Qq();
                        Ev(194, false, 4, z);
                    }
                } else {
                    Ev(194, false, 2, z);
                }
                i += 2;
            }
            J0(14);
            QX(126, i);
        } catch (Throwable th) {
            if (KD) {
                iy.j3(th, 5632664968242916045L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 5874990413285213429L)
    private void vJ() {
        try {
            if (SI) {
                iy.gn(-1024099789968831837L, this);
            }
            we();
            Mr(199, true, 0);
            XX(this.lg.get("String"));
            QX(206, 0);
            QX(180, 2);
            QX(198, 0);
            XX(this.lg.get("$name"));
            QX(198, 0);
            QX(191, 5);
            gn(15);
            QX(199, 0);
            gn(57);
            QX(180, 1);
            QX(198, 0);
            XX(this.lg.get("$ordinal"));
            QX(198, 0);
            QX(191, 5);
            if (this.u7 == 13) {
                we();
                QX(190, 5);
                return;
            }
            gn(15);
            int i = 6;
            while (true) {
                jw();
                zh();
                vy();
                if (this.u7 != 1) {
                    throw new Parser.a();
                }
                we();
                vy();
                QX(191, 5);
                int i2 = i + 1;
                int i3 = this.u7;
                if (i3 == 13) {
                    we();
                    QX(190, i2);
                    return;
                } else if (i3 != 15) {
                    J0(13);
                    QX(190, i2);
                    return;
                } else {
                    we();
                    i = i2 + 1;
                }
            }
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, -1024099789968831837L, this);
            }
            throw th;
        }
    }

    @ey(method = 579814442094081876L)
    private void vy() {
        int i;
        try {
            if (SI) {
                iy.gn(2858866362488695360L, this);
            }
            int i2 = 0;
            while (true) {
                i = this.u7;
                if (i != 10) {
                    break;
                }
                we();
                P8();
                J0(11);
                i2 += 3;
            }
            if (i == 11) {
                throw new Parser.a();
            }
            if (i != 108) {
                QX(198, i2);
            } else {
                we();
                QX(198, i2 + 1);
            }
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, 2858866362488695360L, this);
            }
            throw th;
        }
    }

    @ey(method = 6374921173672434163L)
    private void w9() {
        try {
            if (SI) {
                iy.gn(-3972286301470548171L, this);
            }
            if (this.u7 != 44) {
                QX(207, 0);
                return;
            }
            int i = 3;
            we();
            AL();
            while (this.u7 == 15) {
                we();
                AL();
                i += 2;
            }
            int i2 = this.u7;
            if (i2 == 48) {
                we();
            } else if (i2 == 50) {
                gn(48);
                this.u7 = 48;
            } else {
                if (i2 != 51) {
                    throw new Parser.a();
                }
                gn(48);
                this.u7 = 50;
            }
            QX(207, i);
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, -3972286301470548171L, this);
            }
            throw th;
        }
    }

    @ey(method = 3149657608214992896L)
    private boolean wc() {
        try {
            if (SI) {
                iy.gn(1385134858377244800L, this);
            }
            int i = 0;
            while (true) {
                int iU2 = U2(i);
                if (iU2 != 0 && iU2 != 72 && iU2 != 75 && iU2 != 86 && iU2 != 104 && iU2 != 107 && iU2 != 118 && iU2 != 119) {
                    switch (iU2) {
                        case 82:
                        case 83:
                        case 84:
                            break;
                        default:
                            switch (iU2) {
                                case 93:
                                    return true;
                                case 94:
                                case 95:
                                    break;
                                default:
                                    switch (iU2) {
                                        case ProxyTextView.INPUTTYPE_textPersonName /* 97 */:
                                        case 98:
                                        case 99:
                                        case 100:
                                        case 101:
                                            break;
                                        default:
                                            i++;
                                    }
                            }
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, 1385134858377244800L, this);
            }
            throw th;
        }
    }

    @ey(method = -3594172741828402185L)
    private void x9() {
        try {
            if (SI) {
                iy.gn(1102531559705196749L, this);
            }
            DW("Unexpected end of statement");
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, 1102531559705196749L, this);
            }
            throw th;
        }
    }

    @ey(method = 1525638044050005968L)
    private boolean yO() {
        try {
            if (SI) {
                iy.gn(-643321743145500200L, this);
            }
            this.ei = 0;
            if (this.u7 == 44 && !hz()) {
                return false;
            }
            if (U2(this.ei) == 78 && U2(this.ei + 1) == 12) {
                return true;
            }
            if (U2(this.ei) == 67 && U2(this.ei + 1) == 12) {
                return true;
            }
            while (U2(this.ei) != 14 && U2(this.ei) != 9 && U2(this.ei) != 0) {
                if (U2(this.ei) == 16) {
                    if (U2(this.ei + 1) == 78 && U2(this.ei + 2) == 12) {
                        return true;
                    }
                    if (U2(this.ei + 1) == 67 && U2(this.ei + 2) == 12) {
                        return true;
                    }
                }
                this.ei++;
            }
            return false;
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, -643321743145500200L, this);
            }
            throw th;
        }
    }

    @ey(method = -1970729350548810147L)
    private void yS() {
        try {
            if (SI) {
                iy.gn(2555762636454779443L, this);
            }
            zh();
            if (this.u7 != 12) {
                gn(12);
                gn(13);
                QX(231, 4);
                return;
            }
            we();
            if (this.u7 == 13) {
                we();
                QX(231, 4);
                return;
            }
            int i = 3;
            while (true) {
                if (this.u7 == 1 && U2(1) == 17) {
                    we();
                    we();
                } else {
                    XX(this.lg.get(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                    gn(17);
                }
                i += 4;
                if (this.u7 == 8) {
                    er();
                } else if (this.u7 == 115) {
                    we();
                    yS();
                } else {
                    Qq();
                }
                if (this.u7 != 15) {
                    J0(13);
                    QX(231, i);
                    return;
                }
                we();
            }
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, 2555762636454779443L, this);
            }
            throw th;
        }
    }

    @ey(method = -45427375707756977L)
    private void ye(int i, boolean z, int i2, boolean z2, int i3) {
        try {
            if (SI) {
                iy.J8(-4815198250746460443L, this, new Integer(i), new Boolean(z), new Integer(i2), new Boolean(z2), new Integer(i3));
            }
            if (!this.rN || i3 != this.gn.getFile().getNameIdentifier()) {
                int i4 = this.gW;
                this.gW = i4 + 1;
                j3(i, z, i2, i4);
            } else {
                if (i == 120 || i == 121 || i == 220) {
                    j3(i, z, i2, 0);
                    return;
                }
                int i5 = this.gW;
                this.gW = i5 + 1;
                j3(i, z, i2, i5);
            }
        } catch (Throwable th) {
            if (KD) {
                iy.lg(th, -4815198250746460443L, this, new Integer(i), new Boolean(z), new Integer(i2), new Boolean(z2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 2557174303006041897L)
    private void zh() {
        try {
            if (SI) {
                iy.gn(1468198110348239595L, this);
            }
            int i = this.u7;
            if (i == 1) {
                we();
                k2();
                int i2 = 2;
                while (this.u7 == 16) {
                    we();
                    if (this.u7 != 1) {
                        throw new Parser.a();
                    }
                    we();
                    k2();
                    i2 += 3;
                }
                QX(180, i2);
                return;
            }
            if (i != 57 && i != 60 && i != 62 && i != 65 && i != 69 && i != 81 && i != 89 && i != 114 && i != 76 && i != 77) {
                throw new Parser.a();
            }
            we();
            QX(180, 1);
        } catch (Throwable th) {
            if (KD) {
                iy.aM(th, 1468198110348239595L, this);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01b7 A[Catch: all -> 0x01c8, TryCatch #4 {all -> 0x01c8, blocks: (B:3:0x0007, B:5:0x000b, B:6:0x000e, B:8:0x001c, B:9:0x001e, B:11:0x0027, B:13:0x002e, B:14:0x0032, B:16:0x0036, B:18:0x003d, B:19:0x0043, B:20:0x0048, B:21:0x0049, B:28:0x0068, B:29:0x0098, B:31:0x00a4, B:33:0x00aa, B:35:0x00b1, B:37:0x00b9, B:39:0x00bd, B:40:0x00c2, B:42:0x00c6, B:44:0x00cd, B:46:0x00d5, B:48:0x00e2, B:47:0x00dd, B:49:0x00e5, B:51:0x00e9, B:53:0x00f3, B:52:0x00f0, B:54:0x00f6, B:56:0x00fb, B:57:0x0101, B:58:0x0107, B:59:0x010c, B:60:0x010d, B:61:0x0112, B:76:0x0130, B:77:0x0133, B:78:0x0136, B:80:0x0144, B:82:0x0148, B:84:0x014c, B:85:0x0150, B:86:0x0154, B:94:0x016a, B:118:0x01b3, B:120:0x01b7, B:121:0x01ba, B:123:0x01be, B:95:0x0172, B:96:0x017a, B:97:0x017b, B:104:0x018a, B:117:0x01ae, B:106:0x018e, B:113:0x019d, B:114:0x01a3, B:115:0x01ac, B:124:0x01c2, B:22:0x0050, B:23:0x0055, B:24:0x0056, B:25:0x005b, B:26:0x005c, B:27:0x0065), top: B:141:0x0007, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01be A[Catch: all -> 0x01c8, LOOP:6: B:121:0x01ba->B:123:0x01be, LOOP_END, TryCatch #4 {all -> 0x01c8, blocks: (B:3:0x0007, B:5:0x000b, B:6:0x000e, B:8:0x001c, B:9:0x001e, B:11:0x0027, B:13:0x002e, B:14:0x0032, B:16:0x0036, B:18:0x003d, B:19:0x0043, B:20:0x0048, B:21:0x0049, B:28:0x0068, B:29:0x0098, B:31:0x00a4, B:33:0x00aa, B:35:0x00b1, B:37:0x00b9, B:39:0x00bd, B:40:0x00c2, B:42:0x00c6, B:44:0x00cd, B:46:0x00d5, B:48:0x00e2, B:47:0x00dd, B:49:0x00e5, B:51:0x00e9, B:53:0x00f3, B:52:0x00f0, B:54:0x00f6, B:56:0x00fb, B:57:0x0101, B:58:0x0107, B:59:0x010c, B:60:0x010d, B:61:0x0112, B:76:0x0130, B:77:0x0133, B:78:0x0136, B:80:0x0144, B:82:0x0148, B:84:0x014c, B:85:0x0150, B:86:0x0154, B:94:0x016a, B:118:0x01b3, B:120:0x01b7, B:121:0x01ba, B:123:0x01be, B:95:0x0172, B:96:0x017a, B:97:0x017b, B:104:0x018a, B:117:0x01ae, B:106:0x018e, B:113:0x019d, B:114:0x01a3, B:115:0x01ac, B:124:0x01c2, B:22:0x0050, B:23:0x0055, B:24:0x0056, B:25:0x005b, B:26:0x005c, B:27:0x0065), top: B:141:0x0007, inners: #1, #3 }] */
    @Override // com.aide.codemodel.api.Parser
    @abcd.ey(method = 633657869992378917L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j6() {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.java.JavaParser.j6():void");
    }

    @Override // com.aide.codemodel.api.Parser
    @ey(method = -1120193843272886961L)
    public void v5(SyntaxTreeStyles syntaxTreeStyles, FileEntry fileEntry, boolean z, SyntaxTree syntaxTree) {
        try {
            if (SI) {
                iy.J0(3787279301883971205L, this, syntaxTreeStyles, fileEntry, new Boolean(z), syntaxTree);
            }
            this.er = 1;
            this.yS = 1000000;
            this.gW = 1;
            this.BT = 100000000;
            super.v5(syntaxTreeStyles, fileEntry, z, syntaxTree);
            if (this.rN) {
                lp(syntaxTree, fileEntry.getNameIdentifier());
            }
        } catch (Throwable th) {
            if (KD) {
                iy.a8(th, 3787279301883971205L, this, syntaxTreeStyles, fileEntry, new Boolean(z), syntaxTree);
            }
            throw th;
        }
    }
}
