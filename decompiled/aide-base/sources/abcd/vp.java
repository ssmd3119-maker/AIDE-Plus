package abcd;

import com.aide.uidesigner.ProxyTextView;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class vp {
    public static final tp Ak;
    public static final tp BN;
    public static final tp C;
    public static final tp DP;
    public static final tp DY;
    public static final tp Ej;
    public static final tp F3;
    public static final tp GK;
    public static final tp GT;
    public static final tp HE;
    public static final tp HO;
    public static final tp HT;
    public static final tp Hl;
    public static final tp J1;
    public static final tp K3;
    public static final tp Lx;
    public static final tp ME;
    public static final tp N0;
    public static final tp OM;
    public static final tp Od;
    public static final tp Qs;
    public static final tp RW;
    public static final tp S4;
    public static final tp T6;
    public static final tp Vq;
    public static final tp Yi;
    public static final tp b;
    public static final tp ba;
    public static final tp cX;
    public static final tp cc;
    public static final tp d8;
    public static final tp dH;
    public static final tp dW;
    public static final tp eN;
    public static final tp ee;
    public static final tp ep;
    public static final tp fP;
    public static final tp fd;
    public static final tp fh;
    public static final tp g0;
    public static final tp gM;
    public static final tp gy;
    public static final tp h2;
    public static final tp hG;
    public static final tp hx;
    public static final tp iK;
    public static final tp ir;
    public static final tp ji;
    public static final tp jn;
    public static final tp k1;
    public static final tp k4;
    public static final tp nl;
    public static final tp oT;
    public static final tp oh;
    public static final tp om;
    public static final tp pl;
    public static final tp pn;
    public static final tp qI;
    public static final tp qU;
    public static final tp s0;
    public static final tp sv;
    public static final tp tR;
    public static final tp ti;
    public static final tp tj;

    /* renamed from: tv, reason: collision with root package name */
    public static final tp f5tv;
    public static final tp u9;
    public static final tp uC;
    public static final tp uD;
    public static final tp wC;
    public static final tp wE;
    public static final tp x6;
    public static final tp ya;
    public static final tp zf;
    public static final tp zg;
    public static final tp j6 = new tp(1, fr.Jl, er.jw, "nop");
    public static final tp DW = new tp(2, fr.n5, er.fY, "move-int");
    public static final tp FH = new tp(2, fr.Q6, er.qp, "move-long");
    public static final tp Hw = new tp(2, fr.Z1, er.k2, "move-float");
    public static final tp v5 = new tp(2, fr.q7, er.zh, "move-double");
    public static final tp Zo = new tp(2, fr.sg, er.AL, "move-object");
    public static final tp VH = new tp(2, fr.eU, er.w9, "move-return-address");
    public static final tp gn = new tp(3, fr.n5, er.jw, "move-param-int");
    public static final tp u7 = new tp(3, fr.Q6, er.jw, "move-param-long");
    public static final tp tp = new tp(3, fr.Z1, er.jw, "move-param-float");
    public static final tp EQ = new tp(3, fr.q7, er.jw, "move-param-double");
    public static final tp we = new tp(3, fr.sg, er.jw, "move-param-object");
    public static final tp J0 = new tp(5, fr.n5, er.jw, "const-int");
    public static final tp J8 = new tp(5, fr.Q6, er.jw, "const-long");
    public static final tp Ws = new tp(5, fr.Z1, er.jw, "const-float");
    public static final tp QX = new tp(5, fr.q7, er.jw, "const-double");
    public static final tp XL = new tp(5, fr.sg, er.jw, gp.u7, "const-object");
    public static final tp aM = new tp(5, fr.sg, er.jw, "const-object-nothrow");
    public static final tp j3 = new tp(6, fr.Jl, er.jw, 3, "goto");
    public static final tp Mr = new tp(7, fr.Jl, er.fY, 4, "if-eqz-int");
    public static final tp U2 = new tp(8, fr.Jl, er.fY, 4, "if-nez-int");
    public static final tp a8 = new tp(9, fr.Jl, er.fY, 4, "if-ltz-int");
    public static final tp lg = new tp(10, fr.Jl, er.fY, 4, "if-gez-int");
    public static final tp rN = new tp(11, fr.Jl, er.fY, 4, "if-lez-int");
    public static final tp er = new tp(12, fr.Jl, er.fY, 4, "if-gtz-int");
    public static final tp yS = new tp(7, fr.Jl, er.AL, 4, "if-eqz-object");
    public static final tp gW = new tp(8, fr.Jl, er.AL, 4, "if-nez-object");
    public static final tp BT = new tp(7, fr.Jl, er.cT, 4, "if-eq-int");
    public static final tp vy = new tp(8, fr.Jl, er.cT, 4, "if-ne-int");
    public static final tp P8 = new tp(9, fr.Jl, er.cT, 4, "if-lt-int");
    public static final tp ei = new tp(10, fr.Jl, er.cT, 4, "if-ge-int");
    public static final tp nw = new tp(11, fr.Jl, er.cT, 4, "if-le-int");
    public static final tp SI = new tp(12, fr.Jl, er.cT, 4, "if-gt-int");
    public static final tp KD = new tp(7, fr.Jl, er.Q6, 4, "if-eq-object");
    public static final tp ro = new tp(8, fr.Jl, er.Q6, 4, "if-ne-object");
    public static final tp cn = new tp(13, fr.Jl, er.fY, 5, "switch");
    public static final tp sh = new tp(14, fr.n5, er.cT, "add-int");
    public static final tp cb = new tp(14, fr.Q6, er.q7, "add-long");
    public static final tp dx = new tp(14, fr.Z1, er.Z1, "add-float");
    public static final tp sG = new tp(14, fr.q7, er.n5, 1, "add-double");
    public static final tp ef = new tp(15, fr.n5, er.cT, "sub-int");
    public static final tp Sf = new tp(15, fr.Q6, er.q7, "sub-long");
    public static final tp vJ = new tp(15, fr.Z1, er.Z1, "sub-float");
    public static final tp g3 = new tp(15, fr.q7, er.n5, 1, "sub-double");
    public static final tp Mz = new tp(16, fr.n5, er.cT, "mul-int");
    public static final tp I = new tp(16, fr.Q6, er.q7, "mul-long");
    public static final tp ca = new tp(16, fr.Z1, er.Z1, "mul-float");
    public static final tp x9 = new tp(16, fr.q7, er.n5, 1, "mul-double");
    public static final tp Qq = new tp(17, fr.n5, er.cT, gp.tp, "div-int");
    public static final tp sy = new tp(17, fr.Q6, er.q7, gp.tp, "div-long");
    public static final tp aj = new tp(17, fr.Z1, er.Z1, "div-float");
    public static final tp lp = new tp(17, fr.q7, er.n5, "div-double");
    public static final tp OW = new tp(18, fr.n5, er.cT, gp.tp, "rem-int");
    public static final tp br = new tp(18, fr.Q6, er.q7, gp.tp, "rem-long");
    public static final tp XX = new tp(18, fr.Z1, er.Z1, "rem-float");
    public static final tp kQ = new tp(18, fr.q7, er.n5, "rem-double");
    public static final tp yO = new tp(19, fr.n5, er.fY, "neg-int");
    public static final tp XG = new tp(19, fr.Q6, er.qp, "neg-long");
    public static final tp jJ = new tp(19, fr.Z1, er.k2, "neg-float");
    public static final tp wc = new tp(19, fr.q7, er.zh, "neg-double");
    public static final tp et = new tp(20, fr.n5, er.cT, "and-int");
    public static final tp CU = new tp(20, fr.Q6, er.q7, "and-long");
    public static final tp Xa = new tp(21, fr.n5, er.cT, "or-int");
    public static final tp Eq = new tp(21, fr.Q6, er.q7, "or-long");
    public static final tp hz = new tp(22, fr.n5, er.cT, "xor-int");
    public static final tp aq = new tp(22, fr.Q6, er.q7, "xor-long");
    public static final tp FN = new tp(23, fr.n5, er.cT, "shl-int");
    public static final tp jO = new tp(23, fr.Q6, er.e3, "shl-long");
    public static final tp oY = new tp(24, fr.n5, er.cT, "shr-int");
    public static final tp ko = new tp(24, fr.Q6, er.e3, "shr-long");
    public static final tp Ev = new tp(25, fr.n5, er.cT, "ushr-int");
    public static final tp ye = new tp(25, fr.Q6, er.e3, "ushr-long");
    public static final tp WB = new tp(26, fr.n5, er.fY, "not-int");
    public static final tp mb = new tp(26, fr.Q6, er.qp, "not-long");
    public static final tp jw = new tp(14, fr.n5, er.fY, "add-const-int");
    public static final tp fY = new tp(14, fr.Q6, er.qp, "add-const-long");
    public static final tp qp = new tp(14, fr.Z1, er.k2, "add-const-float");
    public static final tp k2 = new tp(14, fr.q7, er.zh, "add-const-double");
    public static final tp zh = new tp(15, fr.n5, er.fY, "sub-const-int");
    public static final tp AL = new tp(15, fr.Q6, er.qp, "sub-const-long");
    public static final tp w9 = new tp(15, fr.Z1, er.k2, "sub-const-float");
    public static final tp hK = new tp(15, fr.q7, er.zh, "sub-const-double");
    public static final tp cT = new tp(16, fr.n5, er.fY, "mul-const-int");
    public static final tp q7 = new tp(16, fr.Q6, er.qp, "mul-const-long");
    public static final tp Z1 = new tp(16, fr.Z1, er.k2, "mul-const-float");
    public static final tp n5 = new tp(16, fr.q7, er.zh, "mul-const-double");
    public static final tp Q6 = new tp(17, fr.n5, er.fY, gp.tp, "div-const-int");
    public static final tp kf = new tp(17, fr.Q6, er.qp, gp.tp, "div-const-long");
    public static final tp Jl = new tp(17, fr.Z1, er.k2, "div-const-float");
    public static final tp iW = new tp(17, fr.q7, er.zh, "div-const-double");
    public static final tp eU = new tp(18, fr.n5, er.fY, gp.tp, "rem-const-int");
    public static final tp e3 = new tp(18, fr.Q6, er.qp, gp.tp, "rem-const-long");
    public static final tp sE = new tp(18, fr.Z1, er.k2, "rem-const-float");
    public static final tp sg = new tp(18, fr.q7, er.zh, "rem-const-double");
    public static final tp pO = new tp(20, fr.n5, er.fY, "and-const-int");
    public static final tp fN = new tp(20, fr.Q6, er.qp, "and-const-long");
    public static final tp Gj = new tp(21, fr.n5, er.fY, "or-const-int");
    public static final tp Cz = new tp(21, fr.Q6, er.qp, "or-const-long");
    public static final tp pN = new tp(22, fr.n5, er.fY, "xor-const-int");
    public static final tp oy = new tp(22, fr.Q6, er.qp, "xor-const-long");
    public static final tp aX = new tp(23, fr.n5, er.fY, "shl-const-int");
    public static final tp e9 = new tp(23, fr.Q6, er.fY, "shl-const-long");
    public static final tp QO = new tp(24, fr.n5, er.fY, "shr-const-int");
    public static final tp sM = new tp(24, fr.Q6, er.fY, "shr-const-long");
    public static final tp a5 = new tp(25, fr.n5, er.fY, "ushr-const-int");
    public static final tp ys = new tp(25, fr.Q6, er.fY, "ushr-const-long");
    public static final tp IS = new tp(27, fr.n5, er.q7, "cmpl-long");
    public static final tp gG = new tp(27, fr.n5, er.Z1, "cmpl-float");
    public static final tp Nh = new tp(27, fr.n5, er.n5, "cmpl-double");
    public static final tp BR = new tp(28, fr.n5, er.Z1, "cmpg-float");
    public static final tp AE = new tp(28, fr.n5, er.n5, "cmpg-double");
    public static final tp Za = new tp(29, fr.n5, er.qp, "conv-l2i");
    public static final tp An = new tp(29, fr.n5, er.k2, "conv-f2i");
    public static final tp Pa = new tp(29, fr.n5, er.zh, "conv-d2i");
    public static final tp ce = new tp(29, fr.Q6, er.fY, "conv-i2l");
    public static final tp Jm = new tp(29, fr.Q6, er.k2, "conv-f2l");
    public static final tp Bx = new tp(29, fr.Q6, er.zh, "conv-d2l");
    public static final tp oa = new tp(29, fr.Z1, er.fY, "conv-i2f");
    public static final tp qP = new tp(29, fr.Z1, er.qp, "conv-l2f");
    public static final tp MP = new tp(29, fr.Z1, er.zh, "conv-d2f");
    public static final tp Of = new tp(29, fr.q7, er.fY, "conv-i2d");
    public static final tp PT = new tp(29, fr.q7, er.qp, "conv-l2d");
    public static final tp b1 = new tp(29, fr.q7, er.k2, "conv-f2d");
    public static final tp AR = new tp(30, fr.n5, er.fY, "to-byte");
    public static final tp TI = new tp(31, fr.n5, er.fY, "to-char");
    public static final tp ct = new tp(32, fr.n5, er.fY, "to-short");
    public static final tp Fd = new tp(33, fr.Jl, er.jw, 2, "return-void");
    public static final tp Lz = new tp(33, fr.Jl, er.fY, 2, "return-int");
    public static final tp sT = new tp(33, fr.Jl, er.qp, 2, "return-long");
    public static final tp E4 = new tp(33, fr.Jl, er.k2, 2, "return-float");
    public static final tp xg = new tp(33, fr.Jl, er.zh, 2, "return-double");
    public static final tp hp = new tp(33, fr.Jl, er.AL, 2, "return-object");
    public static final tp PH = new tp(34, fr.n5, er.AL, gp.J0, "array-length");

    static {
        fr frVar = fr.Jl;
        er erVar = er.hK;
        GK = new tp(35, frVar, erVar, erVar, "throw");
        dW = new tp(36, fr.Jl, er.AL, gp.J0, "monitor-enter");
        Yi = new tp(37, fr.Jl, er.AL, gp.QX, "monitor-exit");
        GT = new tp(38, fr.n5, er.sE, gp.J8, "aget-int");
        Hl = new tp(38, fr.Q6, er.sg, gp.J8, "aget-long");
        pl = new tp(38, fr.Z1, er.pO, gp.J8, "aget-float");
        oh = new tp(38, fr.q7, er.fN, gp.J8, "aget-double");
        Ej = new tp(38, fr.sg, er.Gj, gp.J8, "aget-object");
        T6 = new tp(38, fr.n5, er.Cz, gp.J8, "aget-boolean");
        cc = new tp(38, fr.n5, er.pN, gp.J8, "aget-byte");
        Od = new tp(38, fr.n5, er.oy, gp.J8, "aget-char");
        om = new tp(38, fr.n5, er.aX, gp.J8, "aget-short");
        wE = new tp(39, fr.Jl, er.e9, gp.J8, "aput-int");
        d8 = new tp(39, fr.Jl, er.QO, gp.J8, "aput-long");
        N0 = new tp(39, fr.Jl, er.sM, gp.J8, "aput-float");
        eN = new tp(39, fr.Jl, er.a5, gp.J8, "aput-double");
        zf = new tp(39, fr.Jl, er.ys, gp.Ws, "aput-object");
        fP = new tp(39, fr.Jl, er.IS, gp.Ws, "aput-boolean");
        b = new tp(39, fr.Jl, er.gG, gp.Ws, "aput-byte");
        ba = new tp(39, fr.Jl, er.Nh, gp.Ws, "aput-char");
        u9 = new tp(39, fr.Jl, er.BR, gp.Ws, "aput-short");
        Ak = new tp(40, fr.sg, er.jw, gp.u7, "new-instance");
        nl = new tp(41, fr.Za, er.fY, gp.we, "new-array-int");
        ti = new tp(41, fr.An, er.fY, gp.we, "new-array-long");
        k1 = new tp(41, fr.AE, er.fY, gp.we, "new-array-float");
        iK = new tp(41, fr.BR, er.fY, gp.we, "new-array-double");
        fh = new tp(41, fr.IS, er.fY, gp.we, "new-array-boolean");
        sv = new tp(41, fr.gG, er.fY, gp.we, "new-array-byte");
        HT = new tp(41, fr.Nh, er.fY, gp.we, "new-array-char");
        oT = new tp(41, fr.ce, er.fY, gp.we, "new-array-short");
        hx = new tp(43, fr.Jl, er.AL, gp.EQ, "check-cast");
        qU = new tp(44, fr.n5, er.AL, gp.u7, "instance-of");
        uC = new tp(45, fr.n5, er.AL, gp.J0, "get-field-int");
        ep = new tp(45, fr.Q6, er.AL, gp.J0, "get-field-long");
        HO = new tp(45, fr.Z1, er.AL, gp.J0, "get-field-float");
        qI = new tp(45, fr.q7, er.AL, gp.J0, "get-field-double");
        DY = new tp(45, fr.sg, er.AL, gp.J0, "get-field-object");
        tj = new tp(45, fr.n5, er.AL, gp.J0, "get-field-boolean");
        pn = new tp(45, fr.n5, er.AL, gp.J0, "get-field-byte");
        x6 = new tp(45, fr.n5, er.AL, gp.J0, "get-field-char");
        k4 = new tp(45, fr.n5, er.AL, gp.J0, "get-field-short");
        RW = new tp(46, fr.n5, er.jw, gp.u7, "get-static-int");
        Vq = new tp(46, fr.Q6, er.jw, gp.u7, "get-static-long");
        cX = new tp(46, fr.Z1, er.jw, gp.u7, "get-static-float");
        ya = new tp(46, fr.q7, er.jw, gp.u7, "get-static-double");
        ir = new tp(46, fr.sg, er.jw, gp.u7, "get-static-object");
        uD = new tp(46, fr.n5, er.jw, gp.u7, "get-field-boolean");
        HE = new tp(46, fr.n5, er.jw, gp.u7, "get-field-byte");
        h2 = new tp(46, fr.n5, er.jw, gp.u7, "get-field-char");
        gy = new tp(46, fr.n5, er.jw, gp.u7, "get-field-short");
        F3 = new tp(47, fr.Jl, er.kf, gp.J0, "put-field-int");
        S4 = new tp(47, fr.Jl, er.Jl, gp.J0, "put-field-long");
        f5tv = new tp(47, fr.Jl, er.iW, gp.J0, "put-field-float");
        gM = new tp(47, fr.Jl, er.eU, gp.J0, "put-field-double");
        tR = new tp(47, fr.Jl, er.Q6, gp.J0, "put-field-object");
        ji = new tp(47, fr.Jl, er.kf, gp.J0, "put-field-boolean");
        ME = new tp(47, fr.Jl, er.kf, gp.J0, "put-field-byte");
        C = new tp(47, fr.Jl, er.kf, gp.J0, "put-field-char");
        dH = new tp(47, fr.Jl, er.kf, gp.J0, "put-field-short");
        BN = new tp(48, fr.Jl, er.fY, gp.u7, "put-static-int");
        jn = new tp(48, fr.Jl, er.qp, gp.u7, "put-static-long");
        DP = new tp(48, fr.Jl, er.k2, gp.u7, "put-static-float");
        ee = new tp(48, fr.Jl, er.zh, gp.u7, "put-static-double");
        K3 = new tp(48, fr.Jl, er.AL, gp.u7, "put-static-object");
        OM = new tp(48, fr.Jl, er.fY, gp.u7, "put-static-boolean");
        Qs = new tp(48, fr.Jl, er.fY, gp.u7, "put-static-byte");
        g0 = new tp(48, fr.Jl, er.fY, gp.u7, "put-static-char");
        fd = new tp(48, fr.Jl, er.fY, gp.u7, "put-static-short");
        Lx = new tp(54, fr.Jl, er.fY, "mark-local-int");
        wC = new tp(54, fr.Jl, er.qp, "mark-local-long");
        hG = new tp(54, fr.Jl, er.k2, "mark-local-float");
        s0 = new tp(54, fr.Jl, er.zh, "mark-local-double");
        zg = new tp(54, fr.Jl, er.AL, "mark-local-object");
        J1 = new tp(57, fr.Jl, er.jw, "fill-array-data");
    }

    public static tp BT(gr grVar) {
        return new tp(55, grVar.j6(), er.jw, null);
    }

    public static tp DW(gr grVar) {
        switch (grVar.u7()) {
            case 1:
                return T6;
            case 2:
                return cc;
            case 3:
                return Od;
            case 4:
                return oh;
            case 5:
                return pl;
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                return GT;
            case UserTouchAction.CLICK_KIND /* 7 */:
                return Hl;
            case 8:
                return om;
            case 9:
                return Ej;
            default:
                ca(grVar);
                throw null;
        }
    }

    public static tp EQ(gr grVar) {
        switch (grVar.u7()) {
            case 1:
                return tj;
            case 2:
                return pn;
            case 3:
                return x6;
            case 4:
                return qI;
            case 5:
                return HO;
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                return uC;
            case UserTouchAction.CLICK_KIND /* 7 */:
                return ep;
            case 8:
                return k4;
            case 9:
                return DY;
            default:
                ca(grVar);
                throw null;
        }
    }

    public static tp FH(hr hrVar) {
        return g3(hrVar, pO, fN, null, null, et, CU, null, null);
    }

    public static tp Hw(gr grVar) {
        switch (grVar.u7()) {
            case 1:
                return fP;
            case 2:
                return b;
            case 3:
                return ba;
            case 4:
                return eN;
            case 5:
                return N0;
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                return wE;
            case UserTouchAction.CLICK_KIND /* 7 */:
                return d8;
            case 8:
                return u9;
            case 9:
                return zf;
            default:
                ca(grVar);
                throw null;
        }
    }

    public static tp I(int i, gr grVar, hr hrVar, bq bqVar) {
        switch (i) {
            case 1:
                return j6;
            case 2:
                return er(grVar);
            case 3:
                return gW(grVar);
            case 4:
                return yS(grVar);
            case 5:
                return VH(grVar);
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                return j3;
            case UserTouchAction.CLICK_KIND /* 7 */:
                return J0(hrVar);
            case 8:
                return aM(hrVar);
            case 9:
                return XL(hrVar);
            case 10:
                return J8(hrVar);
            case 11:
                return QX(hrVar);
            case 12:
                return Ws(hrVar);
            case 13:
                return cn;
            case 14:
                return j6(hrVar);
            case 15:
                return ef(hrVar);
            case 16:
                return P8(hrVar);
            case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                return u7(hrVar);
            case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
                return sh(hrVar);
            case 19:
                return ei(grVar);
            case ProxyTextView.INPUTTYPE_date /* 20 */:
                return FH(hrVar);
            case 21:
                return KD(hrVar);
            case 22:
                return vJ(hrVar);
            case 23:
                return dx(hrVar);
            case 24:
                return sG(hrVar);
            case 25:
                return Sf(hrVar);
            case 26:
                return SI(grVar);
            case 27:
                return Zo(hrVar.v5(0));
            case 28:
                return v5(hrVar.v5(0));
            case 29:
                return gn(grVar, hrVar.v5(0));
            case 30:
                return AR;
            case 31:
                return TI;
            case 32:
                return ct;
            case ProxyTextView.INPUTTYPE_textEmailAddress /* 33 */:
                return hrVar.size() == 0 ? Fd : cb(hrVar.v5(0));
            case 34:
                return PH;
            case 35:
                return GK;
            case ProxyTextView.INPUTTYPE_time /* 36 */:
                return dW;
            case 37:
                return Yi;
            case 38:
                fr frVarV5 = hrVar.v5(0);
                return DW(frVarV5 == fr.iW ? grVar.j6() : frVarV5.J0());
            case 39:
                fr frVarV52 = hrVar.v5(1);
                return Hw(frVarV52 == fr.iW ? hrVar.v5(0) : frVarV52.J0());
            case 40:
                return Ak;
            case 41:
                return nw(grVar.j6());
            case 42:
            default:
                throw new RuntimeException("unknown opcode " + pp.DW(i));
            case 43:
                return hx;
            case 44:
                return qU;
            case 45:
                return EQ(grVar);
            case 46:
                return we(grVar);
            case 47:
                return ro(hrVar.v5(0));
            case 48:
                return cn(hrVar.v5(0));
            case ProxyTextView.INPUTTYPE_textEmailSubject /* 49 */:
                return U2(((vq) bqVar).aM());
            case 50:
                vq vqVar = (vq) bqVar;
                return lg(vqVar.aM().XL(vqVar.we().J0()));
            case 51:
                vq vqVar2 = (vq) bqVar;
                return a8(vqVar2.aM().XL(vqVar2.we().J0()));
            case 52:
                vq vqVar3 = (vq) bqVar;
                return j3(vqVar3.aM().XL(vqVar3.we().J0()));
            case 53:
                vq vqVar4 = (vq) bqVar;
                return Mr(vqVar4.aM().XL(vqVar4.we().J0()));
        }
    }

    public static tp J0(hr hrVar) {
        return Mz(hrVar, Mr, yS, BT, KD);
    }

    public static tp J8(hr hrVar) {
        return Mz(hrVar, lg, null, ei, null);
    }

    public static tp KD(hr hrVar) {
        return g3(hrVar, Gj, Cz, null, null, Xa, Eq, null, null);
    }

    public static tp Mr(dr drVar) {
        return new tp(53, drVar.FH(), er.hK);
    }

    private static tp Mz(hr hrVar, tp tpVar, tp tpVar2, tp tpVar3, tp tpVar4) {
        int iU2;
        int size = hrVar.size();
        if (size == 1) {
            int iU22 = hrVar.v5(0).U2();
            if (iU22 == 6) {
                return tpVar;
            }
            if (iU22 == 9 && tpVar2 != null) {
                return tpVar2;
            }
        } else if (size == 2 && (iU2 = hrVar.v5(0).U2()) == hrVar.v5(1).U2()) {
            if (iU2 == 6) {
                return tpVar3;
            }
            if (iU2 == 9 && tpVar4 != null) {
                return tpVar4;
            }
        }
        x9(hrVar);
        throw null;
    }

    public static tp P8(hr hrVar) {
        return g3(hrVar, cT, q7, Z1, n5, Mz, I, ca, x9);
    }

    public static tp QX(hr hrVar) {
        return Mz(hrVar, rN, null, nw, null);
    }

    public static tp SI(gr grVar) {
        int iU2 = grVar.U2();
        if (iU2 == 6) {
            return WB;
        }
        if (iU2 == 7) {
            return mb;
        }
        ca(grVar);
        throw null;
    }

    public static tp Sf(hr hrVar) {
        return g3(hrVar, a5, ys, null, null, Ev, ye, null, null);
    }

    public static tp U2(dr drVar) {
        return new tp(49, drVar.FH(), er.hK);
    }

    public static tp VH(gr grVar) {
        if (grVar.j6() == fr.iW) {
            return aM;
        }
        int iU2 = grVar.U2();
        if (iU2 == 4) {
            return QX;
        }
        if (iU2 == 5) {
            return Ws;
        }
        if (iU2 == 6) {
            return J0;
        }
        if (iU2 == 7) {
            return J8;
        }
        if (iU2 == 9) {
            return XL;
        }
        ca(grVar);
        throw null;
    }

    public static tp Ws(hr hrVar) {
        return Mz(hrVar, er, null, SI, null);
    }

    public static tp XL(hr hrVar) {
        return Mz(hrVar, a8, null, P8, null);
    }

    public static tp Zo(gr grVar) {
        int iU7 = grVar.u7();
        if (iU7 == 4) {
            return Nh;
        }
        if (iU7 == 5) {
            return gG;
        }
        if (iU7 == 7) {
            return IS;
        }
        ca(grVar);
        throw null;
    }

    public static tp a8(dr drVar) {
        return new tp(51, drVar.FH(), er.hK);
    }

    public static tp aM(hr hrVar) {
        return Mz(hrVar, U2, gW, vy, ro);
    }

    private static tp ca(gr grVar) {
        throw new IllegalArgumentException("bad type: " + grVar);
    }

    public static tp cb(gr grVar) {
        int iU2 = grVar.U2();
        if (iU2 == 0) {
            return Fd;
        }
        if (iU2 == 9) {
            return hp;
        }
        if (iU2 == 4) {
            return xg;
        }
        if (iU2 == 5) {
            return E4;
        }
        if (iU2 == 6) {
            return Lz;
        }
        if (iU2 == 7) {
            return sT;
        }
        ca(grVar);
        throw null;
    }

    public static tp cn(gr grVar) {
        switch (grVar.u7()) {
            case 1:
                return OM;
            case 2:
                return Qs;
            case 3:
                return g0;
            case 4:
                return ee;
            case 5:
                return DP;
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                return BN;
            case UserTouchAction.CLICK_KIND /* 7 */:
                return jn;
            case 8:
                return fd;
            case 9:
                return K3;
            default:
                ca(grVar);
                throw null;
        }
    }

    public static tp dx(hr hrVar) {
        return g3(hrVar, aX, e9, null, null, FN, jO, null, null);
    }

    public static tp ef(hr hrVar) {
        return g3(hrVar, zh, AL, w9, hK, ef, Sf, vJ, g3);
    }

    public static tp ei(gr grVar) {
        int iU2 = grVar.U2();
        if (iU2 == 4) {
            return wc;
        }
        if (iU2 == 5) {
            return jJ;
        }
        if (iU2 == 6) {
            return yO;
        }
        if (iU2 == 7) {
            return XG;
        }
        ca(grVar);
        throw null;
    }

    public static tp er(gr grVar) {
        switch (grVar.U2()) {
            case 4:
                return v5;
            case 5:
                return Hw;
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                return DW;
            case UserTouchAction.CLICK_KIND /* 7 */:
                return FH;
            case 8:
            default:
                ca(grVar);
                throw null;
            case 9:
                return Zo;
            case 10:
                return VH;
        }
    }

    private static tp g3(hr hrVar, tp tpVar, tp tpVar2, tp tpVar3, tp tpVar4, tp tpVar5, tp tpVar6, tp tpVar7, tp tpVar8) {
        tp tpVar9;
        int iU2 = hrVar.v5(0).U2();
        int size = hrVar.size();
        if (size != 1) {
            if (size != 2) {
                tpVar9 = null;
            } else if (iU2 == 4) {
                tpVar9 = tpVar8;
            } else if (iU2 == 5) {
                tpVar9 = tpVar7;
            } else {
                if (iU2 == 6) {
                    return tpVar5;
                }
                if (iU2 == 7) {
                    return tpVar6;
                }
                tpVar9 = null;
            }
        } else if (iU2 == 4) {
            tpVar9 = tpVar4;
        } else if (iU2 == 5) {
            tpVar9 = tpVar3;
        } else {
            if (iU2 == 6) {
                return tpVar;
            }
            if (iU2 == 7) {
                return tpVar2;
            }
            tpVar9 = null;
        }
        if (tpVar9 != null) {
            return tpVar9;
        }
        x9(hrVar);
        throw null;
    }

    public static tp gW(gr grVar) {
        int iU2 = grVar.U2();
        if (iU2 == 4) {
            return EQ;
        }
        if (iU2 == 5) {
            return tp;
        }
        if (iU2 == 6) {
            return gn;
        }
        if (iU2 == 7) {
            return u7;
        }
        if (iU2 == 9) {
            return we;
        }
        ca(grVar);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1 == 7) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static abcd.tp gn(abcd.gr r6, abcd.gr r7) {
        /*
            int r0 = r6.U2()
            int r1 = r7.U2()
            r2 = 7
            r3 = 6
            r4 = 5
            r5 = 4
            if (r1 == r5) goto L44
            if (r1 == r4) goto L34
            if (r1 == r3) goto L15
            if (r1 != r2) goto L4d
            goto L1b
        L15:
            if (r0 == r5) goto L31
            if (r0 == r4) goto L2e
            if (r0 == r2) goto L2b
        L1b:
            if (r0 == r5) goto L28
            if (r0 == r4) goto L25
            if (r0 == r3) goto L22
            goto L34
        L22:
            abcd.tp r6 = abcd.vp.Za
            return r6
        L25:
            abcd.tp r6 = abcd.vp.qP
            return r6
        L28:
            abcd.tp r6 = abcd.vp.PT
            return r6
        L2b:
            abcd.tp r6 = abcd.vp.ce
            return r6
        L2e:
            abcd.tp r6 = abcd.vp.oa
            return r6
        L31:
            abcd.tp r6 = abcd.vp.Of
            return r6
        L34:
            if (r0 == r5) goto L41
            if (r0 == r3) goto L3e
            if (r0 == r2) goto L3b
            goto L44
        L3b:
            abcd.tp r6 = abcd.vp.Jm
            return r6
        L3e:
            abcd.tp r6 = abcd.vp.An
            return r6
        L41:
            abcd.tp r6 = abcd.vp.b1
            return r6
        L44:
            if (r0 == r4) goto L61
            if (r0 == r3) goto L5e
            if (r0 != r2) goto L4d
            abcd.tp r6 = abcd.vp.Bx
            return r6
        L4d:
            abcd.fr r6 = r6.j6()
            abcd.fr r7 = r7.j6()
            abcd.er r6 = abcd.er.I(r6, r7)
            x9(r6)
            r6 = 0
            throw r6
        L5e:
            abcd.tp r6 = abcd.vp.Pa
            return r6
        L61:
            abcd.tp r6 = abcd.vp.MP
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.vp.gn(abcd.gr, abcd.gr):abcd.tp");
    }

    public static tp j3(dr drVar) {
        return new tp(52, drVar.FH(), er.hK);
    }

    public static tp j6(hr hrVar) {
        return g3(hrVar, jw, fY, qp, k2, sh, cb, dx, sG);
    }

    public static tp lg(dr drVar) {
        return new tp(50, drVar.FH(), er.hK);
    }

    public static tp nw(gr grVar) {
        fr frVarJ6 = grVar.j6();
        switch (frVarJ6.J0().u7()) {
            case 1:
                return fh;
            case 2:
                return sv;
            case 3:
                return HT;
            case 4:
                return iK;
            case 5:
                return k1;
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                return nl;
            case UserTouchAction.CLICK_KIND /* 7 */:
                return ti;
            case 8:
                return oT;
            case 9:
                return new tp(41, frVarJ6, er.fY, gp.we, "new-array-object");
            default:
                ca(frVarJ6);
                throw null;
        }
    }

    public static tp rN(gr grVar) {
        int iU2 = grVar.U2();
        if (iU2 == 4) {
            return s0;
        }
        if (iU2 == 5) {
            return hG;
        }
        if (iU2 == 6) {
            return Lx;
        }
        if (iU2 == 7) {
            return wC;
        }
        if (iU2 == 9) {
            return zg;
        }
        ca(grVar);
        throw null;
    }

    public static tp ro(gr grVar) {
        switch (grVar.u7()) {
            case 1:
                return ji;
            case 2:
                return ME;
            case 3:
                return C;
            case 4:
                return gM;
            case 5:
                return f5tv;
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                return F3;
            case UserTouchAction.CLICK_KIND /* 7 */:
                return S4;
            case 8:
                return dH;
            case 9:
                return tR;
            default:
                ca(grVar);
                throw null;
        }
    }

    public static tp sG(hr hrVar) {
        return g3(hrVar, QO, sM, null, null, oY, ko, null, null);
    }

    public static tp sh(hr hrVar) {
        return g3(hrVar, eU, e3, sE, sg, OW, br, XX, kQ);
    }

    public static tp tp(gr grVar, int i) {
        fr frVarJ0 = grVar.j6().J0();
        if (frVarJ0.cn()) {
            ca(grVar);
            throw null;
        }
        if (i < 0) {
            throw new IllegalArgumentException("count < 0");
        }
        er erVar = new er(i);
        for (int i2 = 0; i2 < i; i2++) {
            erVar.Qq(i2, frVarJ0);
        }
        return new tp(42, erVar, gp.u7);
    }

    public static tp u7(hr hrVar) {
        return g3(hrVar, Q6, kf, Jl, iW, Qq, sy, aj, lp);
    }

    public static tp v5(gr grVar) {
        int iU7 = grVar.u7();
        if (iU7 == 4) {
            return AE;
        }
        if (iU7 == 5) {
            return BR;
        }
        ca(grVar);
        throw null;
    }

    public static tp vJ(hr hrVar) {
        return g3(hrVar, pN, oy, null, null, hz, aq, null, null);
    }

    public static tp vy(gr grVar) {
        return new tp(56, grVar.j6(), er.jw, null);
    }

    public static tp we(gr grVar) {
        switch (grVar.u7()) {
            case 1:
                return uD;
            case 2:
                return HE;
            case 3:
                return h2;
            case 4:
                return ya;
            case 5:
                return cX;
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                return RW;
            case UserTouchAction.CLICK_KIND /* 7 */:
                return Vq;
            case 8:
                return gy;
            case 9:
                return ir;
            default:
                ca(grVar);
                throw null;
        }
    }

    private static tp x9(hr hrVar) {
        throw new IllegalArgumentException("bad types: " + hrVar);
    }

    public static tp yS(gr grVar) {
        return new tp(4, grVar.j6(), er.jw, null);
    }
}
