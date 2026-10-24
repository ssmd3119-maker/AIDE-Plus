package org.codehaus.groovy.antlr.treewalker;

import com.aide.uidesigner.ProxyTextView;
import com.probelytics.api.UserTouchAction;
import groovyjarjarantlr.collections.AST;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.groovy.antlr.AntlrASTProcessor;
import org.codehaus.groovy.antlr.GroovySourceAST;

/* loaded from: classes.dex */
public abstract class TraversalHelper implements AntlrASTProcessor {
    private final Visitor DW;
    protected List<GroovySourceAST> j6 = new ArrayList();

    public TraversalHelper(Visitor visitor) {
        this.DW = visitor;
    }

    protected void BT(GroovySourceAST groovySourceAST) {
        this.DW.WB();
    }

    protected abstract void DW(GroovySourceAST groovySourceAST);

    protected void EQ(GroovySourceAST groovySourceAST) {
        GroovySourceAST groovySourceAST2 = (GroovySourceAST) groovySourceAST.getFirstChild();
        if (groovySourceAST2 != null) {
            DW(groovySourceAST2);
            GroovySourceAST groovySourceAST3 = (GroovySourceAST) groovySourceAST2.getNextSibling();
            if (groovySourceAST3 != null) {
                DW(groovySourceAST3);
                GroovySourceAST groovySourceAST4 = (GroovySourceAST) groovySourceAST3.getNextSibling();
                if (groovySourceAST4 != null) {
                    DW(groovySourceAST4);
                    rN(groovySourceAST);
                    GroovySourceAST groovySourceAST5 = (GroovySourceAST) groovySourceAST4.getNextSibling();
                    if (groovySourceAST5 != null) {
                        P8(groovySourceAST);
                        DW(groovySourceAST5);
                    }
                }
            }
        }
    }

    protected void FH(GroovySourceAST groovySourceAST) {
        GroovySourceAST groovySourceAST2;
        if (groovySourceAST == null || (groovySourceAST2 = (GroovySourceAST) groovySourceAST.getFirstChild()) == null) {
            return;
        }
        DW(groovySourceAST2);
        Hw(groovySourceAST2);
    }

    protected void Hw(GroovySourceAST groovySourceAST) {
        if (groovySourceAST != null) {
            for (GroovySourceAST groovySourceAST2 = (GroovySourceAST) groovySourceAST.getNextSibling(); groovySourceAST2 != null; groovySourceAST2 = (GroovySourceAST) groovySourceAST2.getNextSibling()) {
                DW(groovySourceAST2);
            }
        }
    }

    protected void J0(GroovySourceAST groovySourceAST) {
        rN(groovySourceAST);
        FH(groovySourceAST);
        lg(groovySourceAST);
    }

    protected void J8(GroovySourceAST groovySourceAST) {
        rN(groovySourceAST);
        GroovySourceAST groovySourceAST2 = (GroovySourceAST) groovySourceAST.getFirstChild();
        if (groovySourceAST2 != null) {
            DW(groovySourceAST2);
            GroovySourceAST groovySourceAST3 = (GroovySourceAST) groovySourceAST2.getNextSibling();
            if (groovySourceAST3 != null) {
                gW(groovySourceAST);
                DW(groovySourceAST3);
                for (GroovySourceAST groovySourceAST4 = (GroovySourceAST) groovySourceAST3.getNextSibling(); groovySourceAST4 != null; groovySourceAST4 = (GroovySourceAST) groovySourceAST4.getNextSibling()) {
                    P8(groovySourceAST);
                    DW(groovySourceAST4);
                }
            }
        }
        lg(groovySourceAST);
    }

    protected void Mr(GroovySourceAST groovySourceAST) {
        rN(groovySourceAST);
        GroovySourceAST groovySourceASTYS = groovySourceAST.yS(0);
        vy(groovySourceASTYS);
        DW(groovySourceASTYS.yS(0));
        lg(groovySourceAST);
        GroovySourceAST groovySourceAST2 = (GroovySourceAST) groovySourceASTYS.getNextSibling();
        boolean z = true;
        while (groovySourceAST2 != null) {
            if (!z) {
                P8(groovySourceAST);
            }
            DW(groovySourceAST2);
            groovySourceAST2 = (GroovySourceAST) groovySourceAST2.getNextSibling();
            z = false;
        }
    }

    protected void P8(GroovySourceAST groovySourceAST) {
        nw(groovySourceAST, 3);
    }

    protected void QX(GroovySourceAST groovySourceAST) {
        rN(groovySourceAST);
        DW(groovySourceAST.yS(0));
        lg(groovySourceAST);
    }

    protected void U2(GroovySourceAST groovySourceAST) {
        rN(groovySourceAST);
        GroovySourceAST groovySourceASTYS = groovySourceAST.yS(0);
        vy(groovySourceASTYS);
        DW(groovySourceASTYS.yS(0));
        lg(groovySourceAST);
        Hw(groovySourceASTYS);
    }

    protected void VH(GroovySourceAST groovySourceAST) {
        DW(groovySourceAST.yS(0));
        rN(groovySourceAST);
        if (groovySourceAST.yS(0) != null) {
            int i = 1;
            for (GroovySourceAST groovySourceAST2 = (GroovySourceAST) groovySourceAST.yS(0).getNextSibling(); groovySourceAST2 != null; groovySourceAST2 = (GroovySourceAST) groovySourceAST2.getNextSibling()) {
                if (i == groovySourceAST.DW() - 1) {
                    lg(groovySourceAST);
                }
                DW(groovySourceAST2);
                i++;
            }
        }
    }

    protected void Ws(GroovySourceAST groovySourceAST) {
        rN(groovySourceAST);
        DW(groovySourceAST.yS(0));
        DW(groovySourceAST.yS(1));
        P8(groovySourceAST);
        DW(groovySourceAST.yS(2));
        lg(groovySourceAST);
    }

    protected void XL(GroovySourceAST groovySourceAST) {
        QX(groovySourceAST);
        Hw(groovySourceAST.yS(0));
    }

    protected void Zo(GroovySourceAST groovySourceAST) {
        DW(groovySourceAST.yS(0));
        rN(groovySourceAST);
        Hw(groovySourceAST.yS(0));
        lg(groovySourceAST);
    }

    protected void a8(GroovySourceAST groovySourceAST) {
        rN(groovySourceAST);
        Hw(groovySourceAST);
        lg(groovySourceAST);
    }

    protected void aM(GroovySourceAST groovySourceAST) {
        rN(groovySourceAST);
        DW(groovySourceAST.yS(0));
        P8(groovySourceAST);
        Hw(groovySourceAST.yS(0));
        lg(groovySourceAST);
    }

    protected void ei(GroovySourceAST groovySourceAST) {
        this.DW.oa();
    }

    protected GroovySourceAST er() {
        return this.DW.fP();
    }

    protected void gW(GroovySourceAST groovySourceAST) {
        nw(groovySourceAST, 2);
    }

    protected void gn(GroovySourceAST groovySourceAST) {
        DW(groovySourceAST.yS(0));
        P8(groovySourceAST);
        DW(groovySourceAST.yS(1));
    }

    protected void j3(GroovySourceAST groovySourceAST) {
        rN(groovySourceAST);
        GroovySourceAST groovySourceAST2 = (GroovySourceAST) groovySourceAST.getFirstChild();
        if (groovySourceAST2 != null) {
            DW(groovySourceAST2);
            for (GroovySourceAST groovySourceAST3 = (GroovySourceAST) groovySourceAST2.getNextSibling(); groovySourceAST3 != null; groovySourceAST3 = (GroovySourceAST) groovySourceAST3.getNextSibling()) {
                P8(groovySourceAST);
                DW(groovySourceAST3);
            }
        }
        lg(groovySourceAST);
    }

    @Override // org.codehaus.groovy.antlr.AntlrASTProcessor
    public AST j6(AST ast) {
        GroovySourceAST groovySourceAST = (GroovySourceAST) ast;
        BT(groovySourceAST);
        DW(groovySourceAST);
        Hw(groovySourceAST);
        ei(groovySourceAST);
        return null;
    }

    protected void lg(GroovySourceAST groovySourceAST) {
        nw(groovySourceAST, 4);
    }

    protected void nw(GroovySourceAST groovySourceAST, int i) {
        if (groovySourceAST == null) {
            this.DW.uC(null, i);
        }
        switch (groovySourceAST.getType()) {
            case 1:
                this.DW.sh(groovySourceAST, i);
                break;
            case 2:
            case 95:
            case 174:
            case 182:
            case 183:
            case 216:
            case 217:
            case 226:
            case 227:
            default:
                this.DW.uC(groovySourceAST, i);
                break;
            case 3:
                this.DW.BN(groovySourceAST, i);
                break;
            case 4:
                this.DW.n5(groovySourceAST, i);
                break;
            case 5:
                this.DW.eN(groovySourceAST, i);
                break;
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                this.DW.ye(groovySourceAST, i);
                break;
            case UserTouchAction.CLICK_KIND /* 7 */:
                this.DW.fd(groovySourceAST, i);
                break;
            case 8:
                this.DW.Vq(groovySourceAST, i);
                break;
            case 9:
                this.DW.we(groovySourceAST, i);
                break;
            case 10:
                this.DW.oC(groovySourceAST, i);
                break;
            case 11:
                this.DW.Nh(groovySourceAST, i);
                break;
            case 12:
                this.DW.DY(groovySourceAST, i);
                break;
            case 13:
                this.DW.gW(groovySourceAST, i);
                break;
            case 14:
                this.DW.An(groovySourceAST, i);
                break;
            case 15:
                this.DW.lg(groovySourceAST, i);
                break;
            case 16:
                this.DW.EQ(groovySourceAST, i);
                break;
            case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                this.DW.S4(groovySourceAST, i);
                break;
            case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
                this.DW.sv(groovySourceAST, i);
                break;
            case 19:
                this.DW.XX(groovySourceAST, i);
                break;
            case ProxyTextView.INPUTTYPE_date /* 20 */:
                this.DW.hK(groovySourceAST, i);
                break;
            case 21:
                this.DW.x9(groovySourceAST, i);
                break;
            case 22:
                this.DW.Gj(groovySourceAST, i);
                break;
            case 23:
                this.DW.br(groovySourceAST, i);
                break;
            case 24:
                this.DW.j3(groovySourceAST, i);
                break;
            case 25:
                this.DW.wC(groovySourceAST, i);
                break;
            case 26:
                this.DW.j6(groovySourceAST, i);
                break;
            case 27:
                this.DW.Ak(groovySourceAST, i);
                break;
            case 28:
                this.DW.mb(groovySourceAST, i);
                break;
            case 29:
                this.DW.hG(groovySourceAST, i);
                break;
            case 30:
                this.DW.k1(groovySourceAST, i);
                break;
            case 31:
                this.DW.CU(groovySourceAST, i);
                break;
            case 32:
                this.DW.Fd(groovySourceAST, i);
                break;
            case ProxyTextView.INPUTTYPE_textEmailAddress /* 33 */:
                this.DW.jD(groovySourceAST, i);
                break;
            case 34:
                this.DW.tp(groovySourceAST, i);
                break;
            case 35:
                this.DW.Lz(groovySourceAST, i);
                break;
            case ProxyTextView.INPUTTYPE_time /* 36 */:
                this.DW.Eq(groovySourceAST, i);
                break;
            case 37:
                this.DW.vy(groovySourceAST, i);
                break;
            case 38:
                this.DW.cn(groovySourceAST, i);
                break;
            case 39:
                this.DW.N0(groovySourceAST, i);
                break;
            case 40:
                this.DW.yO(groovySourceAST, i);
                break;
            case 41:
                this.DW.aM(groovySourceAST, i);
                break;
            case 42:
                this.DW.a5(groovySourceAST, i);
                break;
            case 43:
                this.DW.Ev(groovySourceAST, i);
                break;
            case 44:
                this.DW.yS(groovySourceAST, i);
                break;
            case 45:
                this.DW.Cz(groovySourceAST, i);
                break;
            case 46:
                this.DW.oy(groovySourceAST, i);
                break;
            case 47:
                this.DW.qP(groovySourceAST, i);
                break;
            case 48:
                this.DW.sE(groovySourceAST, i);
                break;
            case ProxyTextView.INPUTTYPE_textEmailSubject /* 49 */:
                this.DW.cX(groovySourceAST, i);
                break;
            case 50:
                this.DW.x6(groovySourceAST, i);
                break;
            case 51:
                this.DW.DW(groovySourceAST, i);
                break;
            case 52:
                this.DW.pO(groovySourceAST, i);
                break;
            case 53:
                this.DW.ir(groovySourceAST, i);
                break;
            case 54:
                this.DW.re(groovySourceAST, i);
                break;
            case 55:
                this.DW.dW(groovySourceAST, i);
                break;
            case 56:
                this.DW.KD(groovySourceAST, i);
                break;
            case 57:
                this.DW.Sf(groovySourceAST, i);
                break;
            case 58:
                this.DW.FH(groovySourceAST, i);
                break;
            case 59:
                this.DW.XL(groovySourceAST, i);
                break;
            case 60:
                this.DW.GT(groovySourceAST, i);
                break;
            case 61:
                this.DW.sM(groovySourceAST, i);
                break;
            case 62:
                this.DW.zg(groovySourceAST, i);
                break;
            case 63:
                this.DW.pl(groovySourceAST, i);
                break;
            case 64:
                this.DW.HE(groovySourceAST, i);
                break;
            case ProxyTextView.INPUTTYPE_textShortMessage /* 65 */:
                this.DW.Dm(groovySourceAST, i);
                break;
            case 66:
                this.DW.qp(groovySourceAST, i);
                break;
            case 67:
                this.DW.QO(groovySourceAST, i);
                break;
            case 68:
                this.DW.ef(groovySourceAST, i);
                break;
            case 69:
                this.DW.qU(groovySourceAST, i);
                break;
            case 70:
                this.DW.QX(groovySourceAST, i);
                break;
            case 71:
                this.DW.ro(groovySourceAST, i);
                break;
            case 72:
                this.DW.rB(groovySourceAST, i);
                break;
            case 73:
                this.DW.oT(groovySourceAST, i);
                break;
            case 74:
                this.DW.jn(groovySourceAST, i);
                break;
            case 75:
                this.DW.u9(groovySourceAST, i);
                break;
            case 76:
                this.DW.wc(groovySourceAST, i);
                break;
            case 77:
                this.DW.BJ(groovySourceAST, i);
                break;
            case 78:
                this.DW.NZ(groovySourceAST, i);
                break;
            case 79:
                this.DW.q7(groovySourceAST, i);
                break;
            case 80:
                this.DW.e3(groovySourceAST, i);
                break;
            case ProxyTextView.INPUTTYPE_textLongMessage /* 81 */:
                this.DW.a8(groovySourceAST, i);
                break;
            case 82:
                this.DW.Xa(groovySourceAST, i);
                break;
            case 83:
                this.DW.Yi(groovySourceAST, i);
                break;
            case 84:
                this.DW.AR(groovySourceAST, i);
                break;
            case 85:
                this.DW.RW(groovySourceAST, i);
                break;
            case 86:
                this.DW.dH(groovySourceAST, i);
                break;
            case 87:
                this.DW.PT(groovySourceAST, i);
                break;
            case 88:
                this.DW.ee(groovySourceAST, i);
                break;
            case 89:
                this.DW.u7(groovySourceAST, i);
                break;
            case 90:
                this.DW.jg(groovySourceAST, i);
                break;
            case 91:
                this.DW.e9(groovySourceAST, i);
                break;
            case 92:
                this.DW.sG(groovySourceAST, i);
                break;
            case 93:
                this.DW.J8(groovySourceAST, i);
                break;
            case 94:
                this.DW.gn(groovySourceAST, i);
                break;
            case 96:
                this.DW.Zo(groovySourceAST, i);
                break;
            case ProxyTextView.INPUTTYPE_textPersonName /* 97 */:
                this.DW.eU(groovySourceAST, i);
                break;
            case 98:
                this.DW.Q6(groovySourceAST, i);
                break;
            case 99:
                this.DW.nl(groovySourceAST, i);
                break;
            case 100:
                this.DW.OW(groovySourceAST, i);
                break;
            case 101:
                this.DW.aq(groovySourceAST, i);
                break;
            case 102:
                this.DW.F3(groovySourceAST, i);
                break;
            case 103:
                this.DW.U2(groovySourceAST, i);
                break;
            case 104:
                this.DW.qI(groovySourceAST, i);
                break;
            case 105:
                this.DW.k2(groovySourceAST, i);
                break;
            case 106:
                this.DW.T6(groovySourceAST, i);
                break;
            case 107:
                this.DW.J0(groovySourceAST, i);
                break;
            case 108:
                this.DW.ji(groovySourceAST, i);
                break;
            case 109:
                this.DW.Jm(groovySourceAST, i);
                break;
            case 110:
                this.DW.wE(groovySourceAST, i);
                break;
            case 111:
                this.DW.sg(groovySourceAST, i);
                break;
            case 112:
                this.DW.Ej(groovySourceAST, i);
                break;
            case ProxyTextView.INPUTTYPE_textPostalAddress /* 113 */:
                this.DW.AL(groovySourceAST, i);
                break;
            case 114:
                this.DW.aX(groovySourceAST, i);
                break;
            case 115:
                this.DW.sy(groovySourceAST, i);
                break;
            case 116:
                this.DW.Hw(groovySourceAST, i);
                break;
            case 117:
                this.DW.jJ(groovySourceAST, i);
                break;
            case 118:
                this.DW.Bx(groovySourceAST, i);
                break;
            case 119:
                this.DW.I(groovySourceAST, i);
                break;
            case 120:
                this.DW.Mz(groovySourceAST, i);
                break;
            case 121:
                this.DW.AE(groovySourceAST, i);
                break;
            case 122:
                this.DW.SI(groovySourceAST, i);
                break;
            case 123:
                this.DW.ba(groovySourceAST, i);
                break;
            case 124:
                this.DW.ei(groovySourceAST, i);
                break;
            case 125:
                this.DW.OM(groovySourceAST, i);
                break;
            case 126:
                this.DW.N2(groovySourceAST, i);
                break;
            case 127:
                this.DW.s0(groovySourceAST, i);
                break;
            case 128:
                this.DW.PH(groovySourceAST, i);
                break;
            case ProxyTextView.INPUTTYPE_textPassword /* 129 */:
                this.DW.ct(groovySourceAST, i);
                break;
            case 130:
                this.DW.Of(groovySourceAST, i);
                break;
            case 131:
                this.DW.g0(groovySourceAST, i);
                break;
            case 132:
                this.DW.xg(groovySourceAST, i);
                break;
            case 133:
                this.DW.tv(groovySourceAST, i);
                break;
            case 134:
                this.DW.Od(groovySourceAST, i);
                break;
            case 135:
                this.DW.aj(groovySourceAST, i);
                break;
            case 136:
                this.DW.w9(groovySourceAST, i);
                break;
            case 137:
                this.DW.df(groovySourceAST, i);
                break;
            case 138:
                this.DW.fN(groovySourceAST, i);
                break;
            case 139:
                this.DW.Mr(groovySourceAST, i);
                break;
            case 140:
                this.DW.TI(groovySourceAST, i);
                break;
            case 141:
                this.DW.FN(groovySourceAST, i);
                break;
            case 142:
                this.DW.IM(groovySourceAST, i);
                break;
            case 143:
                this.DW.hx(groovySourceAST, i);
                break;
            case 144:
                this.DW.XG(groovySourceAST, i);
                break;
            case ProxyTextView.INPUTTYPE_textVisiblePassword /* 145 */:
                this.DW.b(groovySourceAST, i);
                break;
            case 146:
                this.DW.VH(groovySourceAST, i);
                break;
            case 147:
                this.DW.Ws(groovySourceAST, i);
                break;
            case 148:
                this.DW.gy(groovySourceAST, i);
                break;
            case 149:
                this.DW.kf(groovySourceAST, i);
                break;
            case 150:
                this.DW.nw(groovySourceAST, i);
                break;
            case 151:
                this.DW.Za(groovySourceAST, i);
                break;
            case 152:
                this.DW.TE(groovySourceAST, i);
                break;
            case 153:
                this.DW.iK(groovySourceAST, i);
                break;
            case 154:
                this.DW.K3(groovySourceAST, i);
                break;
            case 155:
                this.DW.P8(groovySourceAST, i);
                break;
            case 156:
                this.DW.hp(groovySourceAST, i);
                break;
            case 157:
                this.DW.ya(groovySourceAST, i);
                break;
            case 158:
                this.DW.BR(groovySourceAST, i);
                break;
            case 159:
                this.DW.oY(groovySourceAST, i);
                break;
            case 160:
                this.DW.k4(groovySourceAST, i);
                break;
            case ProxyTextView.INPUTTYPE_textWebEditText /* 161 */:
                this.DW.hz(groovySourceAST, i);
                break;
            case 162:
                this.DW.dx(groovySourceAST, i);
                break;
            case 163:
                this.DW.HO(groovySourceAST, i);
                break;
            case 164:
                this.DW.kQ(groovySourceAST, i);
                break;
            case 165:
                this.DW.GK(groovySourceAST, i);
                break;
            case 166:
                this.DW.ko(groovySourceAST, i);
                break;
            case 167:
                this.DW.gM(groovySourceAST, i);
                break;
            case 168:
                this.DW.C(groovySourceAST, i);
                break;
            case 169:
                this.DW.pN(groovySourceAST, i);
                break;
            case 170:
                this.DW.Jl(groovySourceAST, i);
                break;
            case 171:
                this.DW.Qq(groovySourceAST, i);
                break;
            case 172:
                this.DW.d8(groovySourceAST, i);
                break;
            case 173:
                this.DW.ca(groovySourceAST, i);
                break;
            case 175:
                this.DW.ti(groovySourceAST, i);
                break;
            case 176:
                this.DW.fh(groovySourceAST, i);
                break;
            case ProxyTextView.INPUTTYPE_textFilter /* 177 */:
                this.DW.ep(groovySourceAST, i);
                break;
            case 178:
                this.DW.v5(groovySourceAST, i);
                break;
            case 179:
                this.DW.ys(groovySourceAST, i);
                break;
            case 180:
                this.DW.CN(groovySourceAST, i);
                break;
            case 181:
                this.DW.IS(groovySourceAST, i);
                break;
            case 184:
                this.DW.MP(groovySourceAST, i);
                break;
            case 185:
                this.DW.tR(groovySourceAST, i);
                break;
            case 186:
                this.DW.UF(groovySourceAST, i);
                break;
            case 187:
                this.DW.E4(groovySourceAST, i);
                break;
            case 188:
                this.DW.jw(groovySourceAST, i);
                break;
            case 189:
                this.DW.BT(groovySourceAST, i);
                break;
            case 190:
                this.DW.rN(groovySourceAST, i);
                break;
            case 191:
                this.DW.b1(groovySourceAST, i);
                break;
            case 192:
                this.DW.h2(groovySourceAST, i);
                break;
            case ProxyTextView.INPUTTYPE_textPhonetic /* 193 */:
                this.DW.jO(groovySourceAST, i);
                break;
            case 194:
                this.DW.Sc(groovySourceAST, i);
                break;
            case 195:
                this.DW.oh(groovySourceAST, i);
                break;
            case 196:
                this.DW.Hl(groovySourceAST, i);
                break;
            case 197:
                this.DW.gG(groovySourceAST, i);
                break;
            case 198:
                this.DW.Pa(groovySourceAST, i);
                break;
            case 199:
                this.DW.iW(groovySourceAST, i);
                break;
            case 200:
                this.DW.Qs(groovySourceAST, i);
                break;
            case 201:
                this.DW.cb(groovySourceAST, i);
                break;
            case 202:
                this.DW.ME(groovySourceAST, i);
                break;
            case 203:
                this.DW.J1(groovySourceAST, i);
                break;
            case 204:
                this.DW.uD(groovySourceAST, i);
                break;
            case 205:
                this.DW.cT(groovySourceAST, i);
                break;
            case 206:
                this.DW.cc(groovySourceAST, i);
                break;
            case 207:
                this.DW.vJ(groovySourceAST, i);
                break;
            case 208:
                this.DW.HT(groovySourceAST, i);
                break;
            case ProxyTextView.INPUTTYPE_textWebEmailAddress /* 209 */:
                this.DW.eQ(groovySourceAST, i);
                break;
            case 210:
                this.DW.Z1(groovySourceAST, i);
                break;
            case 211:
                this.DW.DP(groovySourceAST, i);
                break;
            case 212:
                this.DW.er(groovySourceAST, i);
                break;
            case 213:
                this.DW.er(groovySourceAST, i);
                break;
            case 214:
                this.DW.lp(groovySourceAST, i);
                break;
            case 215:
                this.DW.lp(groovySourceAST, i);
                break;
            case 218:
                this.DW.zf(groovySourceAST, i);
                break;
            case 219:
                this.DW.zf(groovySourceAST, i);
                break;
            case 220:
                this.DW.zh(groovySourceAST, i);
                break;
            case 221:
                this.DW.fY(groovySourceAST, i);
                break;
            case 222:
                this.DW.sT(groovySourceAST, i);
                break;
            case 223:
                this.DW.Lx(groovySourceAST, i);
                break;
            case 224:
                this.DW.et(groovySourceAST, i);
                break;
            case ProxyTextView.INPUTTYPE_textWebPassword /* 225 */:
                this.DW.om(groovySourceAST, i);
                break;
            case 228:
                this.DW.tj(groovySourceAST, i);
                break;
            case 229:
                this.DW.pn(groovySourceAST, i);
                break;
            case 230:
                this.DW.g3(groovySourceAST, i);
                break;
        }
    }

    protected void rN(GroovySourceAST groovySourceAST) {
        this.j6.remove(groovySourceAST);
        nw(groovySourceAST, 1);
    }

    protected void tp(GroovySourceAST groovySourceAST) {
        DW(groovySourceAST.yS(0));
        rN(groovySourceAST);
        GroovySourceAST groovySourceASTYS = groovySourceAST.yS(1);
        if (groovySourceASTYS != null) {
            FH(groovySourceASTYS);
        }
        lg(groovySourceAST);
    }

    protected void u7(GroovySourceAST groovySourceAST) {
        DW(groovySourceAST.yS(0));
        rN(groovySourceAST);
        DW(groovySourceAST.yS(1));
        P8(groovySourceAST);
        DW(groovySourceAST.yS(2));
        lg(groovySourceAST);
    }

    protected void v5(GroovySourceAST groovySourceAST) {
        DW(groovySourceAST.yS(0));
        rN(groovySourceAST);
        lg(groovySourceAST);
        Hw(groovySourceAST.yS(0));
    }

    protected void vy(GroovySourceAST groovySourceAST) {
        this.j6.remove(groovySourceAST);
    }

    protected void we(GroovySourceAST groovySourceAST) {
        DW(groovySourceAST.yS(1));
        rN(groovySourceAST);
        DW(groovySourceAST.yS(2));
        lg(groovySourceAST);
    }

    protected void yS(GroovySourceAST groovySourceAST) {
        this.DW.ce(groovySourceAST);
    }
}
