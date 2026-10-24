package com.aide.codemodel.language.js;

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
import com.aide.uidesigner.ProxyTextView;
import com.probelytics.api.UserTouchAction;

@cy(clazz = -560053395789920331L, container = -560053395789920331L, user = true)
/* loaded from: classes.dex */
public class JavaScriptParser extends Parser {

    @gy
    private static /* synthetic */ boolean BT;

    @fy
    private static /* synthetic */ boolean gW;

    @dy(field = -2480977363090951817L)
    private final JavaScriptSyntax a8;

    @dy(field = 2186861539525305533L)
    private int er;

    @dy(field = -337637070837045849L)
    private int[] lg;

    @dy(field = 4057709509978666344L)
    private int rN;

    @dy(field = 315867439609905735L)
    private int yS;

    @cy(clazz = 1018680395917475832L, container = 1018680395917475832L, user = true)
    private static class b extends Parser.a {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        static {
            iy.Zo(b.class);
        }

        @ey(method = -457099987224437952L)
        private b() {
            try {
                if (jw) {
                    iy.gn(3921893410869760808L, null);
                }
            } catch (Throwable th) {
                if (fY) {
                    iy.aM(th, 3921893410869760808L, null);
                }
                throw th;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = 7132299254575987024L)
        public /* synthetic */ b(a aVar) {
            this();
            try {
                if (jw) {
                    iy.tp(773359522475163744L, null, aVar);
                }
            } catch (Throwable th) {
                if (fY) {
                    iy.j3(th, 773359522475163744L, null, aVar);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(JavaScriptParser.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -1466014056417957041L)
    public JavaScriptParser(IdentifierSpace identifierSpace, ErrorTable errorTable, EntitySpace entitySpace, JavaScriptSyntax javaScriptSyntax) {
        super(identifierSpace, errorTable, entitySpace, javaScriptSyntax, 223, 0);
        try {
            if (gW) {
                iy.J0(8062090950365162269L, null, identifierSpace, errorTable, entitySpace, javaScriptSyntax);
            }
            this.lg = new int[1000];
            this.rN = 0;
            this.a8 = javaScriptSyntax;
        } catch (Throwable th) {
            if (BT) {
                iy.a8(th, 8062090950365162269L, null, identifierSpace, errorTable, entitySpace, javaScriptSyntax);
            }
            throw th;
        }
    }

    @ey(method = 1102554681265615424L)
    private void BT() {
        try {
            if (gW) {
                iy.gn(-1973403558503155272L, this);
            }
            we();
            int iVJ = vJ(false);
            J0(9);
            QX(133, iVJ + 2);
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -1973403558503155272L, this);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c A[Catch: a -> 0x0112, all -> 0x0116, FALL_THROUGH, TryCatch #2 {a -> 0x0112, blocks: (B:8:0x0010, B:12:0x0021, B:13:0x0024, B:14:0x0027, B:15:0x002a, B:17:0x002f, B:19:0x003c, B:21:0x0043, B:22:0x0056, B:24:0x006a, B:32:0x00aa, B:36:0x00b5, B:37:0x00b8, B:38:0x00bb, B:39:0x00be, B:42:0x00c5, B:44:0x00dd, B:45:0x00df, B:46:0x00e2, B:47:0x00ee, B:49:0x0106, B:25:0x007e, B:27:0x0084, B:30:0x008d, B:31:0x00a4), top: B:64:0x0010, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043 A[Catch: a -> 0x0112, all -> 0x0116, TryCatch #2 {a -> 0x0112, blocks: (B:8:0x0010, B:12:0x0021, B:13:0x0024, B:14:0x0027, B:15:0x002a, B:17:0x002f, B:19:0x003c, B:21:0x0043, B:22:0x0056, B:24:0x006a, B:32:0x00aa, B:36:0x00b5, B:37:0x00b8, B:38:0x00bb, B:39:0x00be, B:42:0x00c5, B:44:0x00dd, B:45:0x00df, B:46:0x00e2, B:47:0x00ee, B:49:0x0106, B:25:0x007e, B:27:0x0084, B:30:0x008d, B:31:0x00a4), top: B:64:0x0010, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007e A[Catch: a -> 0x0112, all -> 0x0116, TryCatch #2 {a -> 0x0112, blocks: (B:8:0x0010, B:12:0x0021, B:13:0x0024, B:14:0x0027, B:15:0x002a, B:17:0x002f, B:19:0x003c, B:21:0x0043, B:22:0x0056, B:24:0x006a, B:32:0x00aa, B:36:0x00b5, B:37:0x00b8, B:38:0x00bb, B:39:0x00be, B:42:0x00c5, B:44:0x00dd, B:45:0x00df, B:46:0x00e2, B:47:0x00ee, B:49:0x0106, B:25:0x007e, B:27:0x0084, B:30:0x008d, B:31:0x00a4), top: B:64:0x0010, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c5 A[Catch: a -> 0x0112, all -> 0x0116, TryCatch #2 {a -> 0x0112, blocks: (B:8:0x0010, B:12:0x0021, B:13:0x0024, B:14:0x0027, B:15:0x002a, B:17:0x002f, B:19:0x003c, B:21:0x0043, B:22:0x0056, B:24:0x006a, B:32:0x00aa, B:36:0x00b5, B:37:0x00b8, B:38:0x00bb, B:39:0x00be, B:42:0x00c5, B:44:0x00dd, B:45:0x00df, B:46:0x00e2, B:47:0x00ee, B:49:0x0106, B:25:0x007e, B:27:0x0084, B:30:0x008d, B:31:0x00a4), top: B:64:0x0010, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x006a A[SYNTHETIC] */
    @abcd.ey(method = 299785771832634189L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void KD() {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.js.JavaScriptParser.KD():void");
    }

    @ey(method = 7049986995708393792L)
    private void Mz(boolean z) {
        try {
            if (gW) {
                iy.Ws(-2771858147401183680L, this, z);
            }
            J0(98);
            if (this.u7 != 1) {
                throw new Parser.a();
            }
            we();
            if (this.u7 == 17) {
                we();
                int i = this.j3;
                try {
                    nw();
                } catch (Parser.a unused) {
                    this.j3 = i;
                    gn(66);
                }
                if (z) {
                    int i2 = this.er;
                    this.er = i2 + 1;
                    j3(207, false, 3, i2);
                } else {
                    QX(200, 3);
                }
            } else if (z) {
                int i3 = this.er;
                this.er = i3 + 1;
                j3(207, false, 1, i3);
            } else {
                QX(200, 1);
            }
            int i4 = 3;
            while (this.u7 == 15) {
                we();
                if (this.u7 != 1) {
                    throw new Parser.a();
                }
                we();
                if (this.u7 == 17) {
                    we();
                    nw();
                    if (z) {
                        int i5 = this.er;
                        this.er = i5 + 1;
                        j3(207, false, 3, i5);
                    } else {
                        QX(200, 3);
                    }
                } else if (z) {
                    int i6 = this.er;
                    this.er = i6 + 1;
                    j3(207, false, 1, i6);
                } else {
                    QX(200, 1);
                }
                i4 += 2;
            }
            sG();
            if (z) {
                QX(152, i4);
            } else {
                QX(151, i4);
            }
        } catch (Throwable th) {
            if (BT) {
                iy.j3(th, -2771858147401183680L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 2417095490109906312L)
    private void P8() {
        try {
            if (gW) {
                iy.gn(-2998904588715574080L, this);
            }
            DW("Unexpected end of statement");
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -2998904588715574080L, this);
            }
            throw th;
        }
    }

    @ey(method = 2658915360574871711L)
    private void SI() {
        try {
            if (gW) {
                iy.gn(-685029495872330231L, this);
            }
            we();
            if (this.u7 != 1) {
                cb();
                BT();
                QX(124, 3);
            } else {
                we();
                cb();
                BT();
                QX(124, 4);
            }
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -685029495872330231L, this);
            }
            throw th;
        }
    }

    @ey(method = 490658260639514103L)
    private void Sf(boolean z) {
        try {
            if (gW) {
                iy.Ws(-468393707572183835L, this, z);
            }
            int i = this.u7;
            if (i != 21 && i != 22 && i != 58) {
                int i2 = 1;
                if (i == 59) {
                    we();
                    if (this.u7 != 8) {
                        throw new Parser.a();
                    }
                    BT();
                    int i3 = 2;
                    while (this.u7 == 71) {
                        we();
                        J0(12);
                        if (this.u7 != 1) {
                            throw new Parser.a();
                        }
                        we();
                        J0(13);
                        if (this.u7 != 8) {
                            throw new Parser.a();
                        }
                        BT();
                        QX(204, 5);
                        i3++;
                    }
                    if (this.u7 == 92) {
                        we();
                        if (this.u7 != 8) {
                            throw new Parser.a();
                        }
                        BT();
                        QX(205, 2);
                        i3++;
                    }
                    QX(150, i3);
                    return;
                }
                if (i == 79) {
                    we();
                    ei();
                    sG();
                    QX(142, 3);
                    return;
                }
                if (i == 80) {
                    we();
                    J0(12);
                    ei();
                    J0(13);
                    Sf(false);
                    QX(137, 5);
                    return;
                }
                if (i != 105) {
                    if (i == 106) {
                        we();
                        J0(12);
                        ei();
                        J0(13);
                        Sf(false);
                        QX(212, 5);
                        return;
                    }
                    switch (i) {
                        case 1:
                            if (U2(1) != 26) {
                                ei();
                                sG();
                                QX(146, 2);
                                return;
                            } else {
                                we();
                                we();
                                Sf(false);
                                QX(148, 3);
                                return;
                            }
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                        case UserTouchAction.CLICK_KIND /* 7 */:
                            break;
                        case 8:
                            BT();
                            return;
                        default:
                            switch (i) {
                                case 10:
                                case 12:
                                case 24:
                                case 34:
                                case 74:
                                case 118:
                                    break;
                                case 14:
                                    we();
                                    QX(134, 1);
                                    return;
                                case 61:
                                    we();
                                    ei();
                                    J0(26);
                                    QX(143, 3);
                                    return;
                                case 85:
                                    we();
                                    if (this.u7 != 14 && this.u7 != 9 && !ro()) {
                                        ei();
                                        sG();
                                        QX(141, 3);
                                        return;
                                    }
                                    sG();
                                    QX(141, 2);
                                    return;
                                case 87:
                                    we();
                                    J0(12);
                                    ei();
                                    J0(13);
                                    if (this.u7 != 8) {
                                        throw new Parser.a();
                                    }
                                    BT();
                                    QX(147, 5);
                                    return;
                                case 90:
                                    we();
                                    J0(26);
                                    QX(144, 2);
                                    return;
                                default:
                                    a aVar = null;
                                    switch (i) {
                                        case 26:
                                            if (!z || U2(1) != 2) {
                                                throw new b(aVar);
                                            }
                                            we();
                                            we();
                                            QX(213, 2);
                                            return;
                                        case 27:
                                        case 28:
                                            break;
                                        default:
                                            switch (i) {
                                                case 54:
                                                    we();
                                                    Sf(false);
                                                    if (this.u7 != 80) {
                                                        throw new Parser.a();
                                                    }
                                                    we();
                                                    J0(12);
                                                    ei();
                                                    J0(13);
                                                    sG();
                                                    QX(ProxyTextView.INPUTTYPE_textVisiblePassword, 7);
                                                    return;
                                                case 55:
                                                    we();
                                                    J0(12);
                                                    ei();
                                                    J0(13);
                                                    Sf(false);
                                                    if (this.u7 != 63) {
                                                        QX(135, 5);
                                                        return;
                                                    }
                                                    we();
                                                    Sf(false);
                                                    QX(136, 7);
                                                    return;
                                                case 56:
                                                    we();
                                                    J0(12);
                                                    if (this.u7 == 14) {
                                                        we();
                                                        QX(201, 1);
                                                    } else {
                                                        if (this.u7 == 98 && U2(1) == 1 && U2(2) == 114) {
                                                            we();
                                                            if (this.u7 != 1) {
                                                                throw new Parser.a();
                                                            }
                                                            we();
                                                            QX(200, 1);
                                                            QX(151, 2);
                                                            J0(114);
                                                            ei();
                                                            J0(13);
                                                            Sf(false);
                                                            QX(211, 7);
                                                            return;
                                                        }
                                                        if (this.u7 == 1 && U2(1) == 114) {
                                                            g3();
                                                            J0(114);
                                                            ei();
                                                            J0(13);
                                                            Sf(false);
                                                            QX(211, 7);
                                                            return;
                                                        }
                                                        if (this.u7 == 98) {
                                                            Mz(false);
                                                            QX(201, 1);
                                                        } else {
                                                            nw();
                                                            int i4 = 2;
                                                            while (this.u7 == 15) {
                                                                we();
                                                                nw();
                                                                i4 += 2;
                                                            }
                                                            sG();
                                                            QX(201, i4);
                                                        }
                                                    }
                                                    if (this.u7 == 14) {
                                                        we();
                                                        QX(203, 1);
                                                    } else {
                                                        ei();
                                                        sG();
                                                        QX(203, 2);
                                                    }
                                                    if (this.u7 == 13) {
                                                        QX(202, 0);
                                                    } else {
                                                        nw();
                                                        while (this.u7 == 15) {
                                                            we();
                                                            nw();
                                                            i2 += 2;
                                                        }
                                                        QX(202, i2);
                                                    }
                                                    J0(13);
                                                    Sf(false);
                                                    QX(149, 7);
                                                    return;
                                                default:
                                                    switch (i) {
                                                        case 66:
                                                        case 67:
                                                        case 68:
                                                        case 69:
                                                            break;
                                                        case 70:
                                                            we();
                                                            if (this.u7 != 1 || ro()) {
                                                                sG();
                                                                QX(138, 2);
                                                                return;
                                                            } else {
                                                                we();
                                                                sG();
                                                                QX(138, 3);
                                                                return;
                                                            }
                                                        default:
                                                            switch (i) {
                                                                case 96:
                                                                    we();
                                                                    if (this.u7 != 1 || ro()) {
                                                                        sG();
                                                                        QX(139, 2);
                                                                        return;
                                                                    } else {
                                                                        we();
                                                                        sG();
                                                                        QX(139, 3);
                                                                        return;
                                                                    }
                                                                case ProxyTextView.INPUTTYPE_textPersonName /* 97 */:
                                                                    if (z) {
                                                                        we();
                                                                        if (this.u7 != 1) {
                                                                            throw new Parser.a();
                                                                        }
                                                                        we();
                                                                        cb();
                                                                        BT();
                                                                        int i5 = this.er;
                                                                        this.er = i5 + 1;
                                                                        j3(125, false, 4, i5);
                                                                    } else {
                                                                        ei();
                                                                    }
                                                                    ef(false);
                                                                    QX(146, 2);
                                                                    return;
                                                                case 98:
                                                                    Mz(z);
                                                                    return;
                                                                default:
                                                                    throw new b(aVar);
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
                }
            }
            ei();
            sG();
            QX(146, 2);
        } catch (Throwable th) {
            if (BT) {
                iy.j3(th, -468393707572183835L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 1794970020560298131L)
    private void cb() {
        try {
            if (gW) {
                iy.gn(493818644006086945L, this);
            }
            we();
            int i = 2;
            if (this.u7 == 13) {
                we();
                QX(190, 2);
                return;
            }
            while (this.u7 == 1) {
                we();
                QX(191, 1);
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
            throw new Parser.a();
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 493818644006086945L, this);
            }
            throw th;
        }
    }

    @ey(method = 7672547529960985441L)
    private void cn() {
        try {
            if (gW) {
                iy.gn(-7626934055731183381L, this);
            }
            int i = this.j3 + 1;
            this.j3 = i;
            if (i >= this.aM.length) {
                int[] iArr = new int[(this.aM.length * 2) + 1];
                System.arraycopy(this.aM, 0, iArr, 0, this.aM.length);
                this.aM = iArr;
            }
            int[] iArr2 = this.aM;
            int i2 = this.j3;
            SyntaxTree syntaxTree = this.gn;
            int i3 = this.u7;
            int i4 = this.J0[this.tp];
            int i5 = this.J8[this.tp];
            int i6 = this.QX[this.tp];
            int i7 = this.Ws[this.tp];
            int i8 = this.XL[this.tp];
            int i9 = this.yS;
            this.yS = i9 + 1;
            iArr2[i2] = syntaxTree.gW(i3, false, i4, i5, i6, i7, i8, i9);
            if (this.tp < this.EQ) {
                int i10 = this.tp + 1;
                this.tp = i10;
                this.u7 = this.we[i10];
            }
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -7626934055731183381L, this);
            }
            throw th;
        }
    }

    @ey(method = 4074532736402944784L)
    private void dx() {
        try {
            if (gW) {
                iy.gn(7534545935375686480L, this);
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
                    nw();
                    QX(ProxyTextView.INPUTTYPE_textFilter, 3);
                }
            }
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 7534545935375686480L, this);
            }
            throw th;
        }
    }

    @ey(method = -846860444850224259L)
    private void ef(boolean z) {
        try {
            if (gW) {
                iy.Ws(-1353542241383681909L, this, z);
            }
            if (this.u7 == 14) {
                we();
                return;
            }
            if (z) {
                lg(14);
            }
            gn(14);
        } catch (Throwable th) {
            if (BT) {
                iy.j3(th, -1353542241383681909L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -641789298382609935L)
    private void ei() {
        try {
            if (gW) {
                iy.gn(-1712393505246089809L, this);
            }
            nw();
            int i = 1;
            while (this.u7 == 15) {
                we();
                nw();
                i += 2;
            }
            if (i > 1) {
                QX(178, i);
            }
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -1712393505246089809L, this);
            }
            throw th;
        }
    }

    @ey(method = -691751059474571411L)
    private void er() {
        try {
            if (gW) {
                iy.gn(2014709798797824275L, this);
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
                nw();
            } catch (Parser.a unused) {
                this.j3 = i2;
                gn(66);
                vy();
            }
            while (this.u7 == 15) {
                we();
                int i3 = this.j3;
                try {
                    nw();
                } catch (Parser.a unused2) {
                    this.j3 = i3;
                    gn(66);
                    vy();
                }
                i += 2;
            }
            J0(13);
            QX(197, i);
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 2014709798797824275L, this);
            }
            throw th;
        }
    }

    @ey(method = 2780200118036388520L)
    private void g3() {
        try {
            if (gW) {
                iy.gn(4190658156859015392L, this);
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
            if (this.u7 == 12) {
                we();
                ei();
                J0(13);
                QX(168, 3);
            } else {
                gW();
            }
            rN();
            for (int i3 = 0; i3 < i; i3++) {
                QX(170, 2);
            }
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 4190658156859015392L, this);
            }
            throw th;
        }
    }

    @ey(method = -3186790039037851487L)
    private void gW() {
        try {
            if (gW) {
                iy.gn(-1317330291135662449L, this);
            }
            int i = this.u7;
            if (i == 10) {
                yS();
                return;
            }
            if (i == 58) {
                we();
                g3();
                QX(176, 2);
                return;
            }
            if (i != 74) {
                if (i == 97) {
                    SI();
                    return;
                }
                if (i == 105) {
                    we();
                    nw();
                    QX(173, 2);
                    return;
                }
                if (i == 118) {
                    we();
                    nw();
                    QX(163, 2);
                    return;
                }
                switch (i) {
                    case 1:
                        we();
                        QX(ProxyTextView.INPUTTYPE_textWebEditText, 1);
                        return;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                    case UserTouchAction.CLICK_KIND /* 7 */:
                        break;
                    case 8:
                        sh();
                        return;
                    default:
                        switch (i) {
                            case 66:
                            case 68:
                                break;
                            case 67:
                                if (U2(1) == 12) {
                                    Mr(199, false, 0);
                                }
                                we();
                                QX(166, 1);
                                return;
                            case 69:
                                we();
                                nw();
                                QX(164, 2);
                                return;
                            default:
                                throw new Parser.a();
                        }
                }
            }
            we();
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -1317330291135662449L, this);
            }
            throw th;
        }
    }

    @ey(method = -159423876478428720L)
    private void nw() {
        try {
            if (gW) {
                iy.gn(-923673959786017692L, this);
            }
            g3();
            dx();
            KD();
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -923673959786017692L, this);
            }
            throw th;
        }
    }

    @ey(method = -910649815541507875L)
    private void rN() {
        try {
            if (gW) {
                iy.gn(3044427610429468599L, this);
            }
            while (true) {
                int i = this.u7;
                if (i == 10) {
                    int i2 = 4;
                    we();
                    nw();
                    while (this.u7 == 15) {
                        we();
                        nw();
                        i2 += 2;
                    }
                    J0(11);
                    QX(165, i2);
                } else if (i == 12) {
                    er();
                    QX(175, 2);
                } else {
                    if (i != 16) {
                        return;
                    }
                    we();
                    if (this.u7 != 1) {
                        throw new Parser.a();
                    }
                    cn();
                    QX(159, 3);
                }
            }
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 3044427610429468599L, this);
            }
            throw th;
        }
    }

    @ey(method = -5847427185910239475L)
    private boolean ro() {
        try {
            if (gW) {
                iy.gn(-1634404971317449337L, this);
            }
            if (this.tp > 0) {
                if (this.Ws[this.tp - 1] != this.J8[this.tp]) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -1634404971317449337L, this);
            }
            throw th;
        }
    }

    @ey(method = 3813705449697334456L)
    private void sG() {
        try {
            if (gW) {
                iy.gn(-1462718844586587580L, this);
            }
            ef(true);
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -1462718844586587580L, this);
            }
            throw th;
        }
    }

    @ey(method = 1406854867984795320L)
    private void sh() {
        try {
            if (gW) {
                iy.gn(1276743246748913664L, this);
            }
            J0(8);
            int i = 2;
            if (this.u7 == 9) {
                we();
                QX(140, 2);
                return;
            }
            do {
                switch (this.u7) {
                    case 1:
                        cn();
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                    case UserTouchAction.CLICK_KIND /* 7 */:
                        we();
                        break;
                    default:
                        throw new Parser.a();
                }
                if (this.u7 == 17) {
                    we();
                } else {
                    J0(26);
                }
                nw();
                i += 3;
                if (this.u7 == 15) {
                    we();
                    i++;
                }
                J0(9);
                QX(140, i);
            } while (this.u7 != 9);
            J0(9);
            QX(140, i);
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 1276743246748913664L, this);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00ef A[Catch: all -> 0x0148, FALL_THROUGH, TryCatch #1 {all -> 0x0148, blocks: (B:3:0x0009, B:5:0x000d, B:7:0x0012, B:11:0x001a, B:13:0x0021, B:60:0x0139, B:62:0x013d, B:17:0x002a, B:19:0x002f, B:21:0x0036, B:23:0x003b, B:33:0x005e, B:34:0x0061, B:35:0x0064, B:58:0x011d, B:37:0x0069, B:39:0x0075, B:41:0x0081, B:43:0x008f, B:45:0x00a3, B:47:0x00ad, B:48:0x00bf, B:57:0x011b, B:49:0x00c6, B:51:0x00d0, B:52:0x00e2, B:53:0x00ef, B:55:0x00f9, B:56:0x010b, B:59:0x0126, B:20:0x0033), top: B:74:0x0009, inners: #0 }] */
    @abcd.ey(method = -2064006232655188464L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int vJ(boolean r17) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.js.JavaScriptParser.vJ(boolean):int");
    }

    @ey(method = -1203633148467692029L)
    private void vy() {
        try {
            if (gW) {
                iy.gn(511642300735123593L, this);
            }
            DW("Unexpected end of expression");
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 511642300735123593L, this);
            }
            throw th;
        }
    }

    @ey(method = 1071706129588402448L)
    private void yS() {
        try {
            if (gW) {
                iy.gn(-2006130334670693616L, this);
            }
            J0(10);
            int i = 2;
            if (this.u7 == 11) {
                we();
                QX(196, 2);
                return;
            }
            do {
                nw();
                i++;
                if (this.u7 != 15) {
                    break;
                }
                we();
                i++;
            } while (this.u7 != 11);
            J0(11);
            QX(196, i);
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -2006130334670693616L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Parser
    @ey(method = -2955364340325122904L)
    public void j6() {
        try {
            if (gW) {
                iy.gn(-1103387147823781152L, this);
            }
            j3(223, false, vJ(true), 0);
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -1103387147823781152L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Parser
    @ey(method = 889980085345626704L)
    public void v5(SyntaxTreeStyles syntaxTreeStyles, FileEntry fileEntry, boolean z, SyntaxTree syntaxTree) {
        try {
            if (gW) {
                iy.J0(-178410662473771152L, this, syntaxTreeStyles, fileEntry, new Boolean(z), syntaxTree);
            }
            this.er = 2;
            this.yS = 100000;
            super.v5(syntaxTreeStyles, fileEntry, z, syntaxTree);
        } catch (Throwable th) {
            if (BT) {
                iy.a8(th, -178410662473771152L, this, syntaxTreeStyles, fileEntry, new Boolean(z), syntaxTree);
            }
            throw th;
        }
    }
}
