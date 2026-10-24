package abcd;

import com.aide.uidesigner.ProxyTextView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ei extends ii {
    private static final zq P8;
    private static final vq ei;
    private tp BT;
    private hr Mr;
    private final sh QX;
    private boolean U2;
    private final di Ws;
    private final aq XL;
    private boolean a8;
    private final int aM;
    private boolean er;
    private ci gW;
    private final ArrayList<ip> j3;
    private int lg;
    private int rN;
    private wp vy;
    private boolean yS;

    static {
        zq zqVar = new zq(fr.yS("java/lang/reflect/Array"));
        P8 = zqVar;
        ei = new vq(zqVar, new wq(new yq("newInstance"), new yq("(Ljava/lang/Class;[I)Ljava/lang/Object;")));
    }

    public ei(di diVar, sh shVar, aq aqVar) {
        super(shVar.DW());
        if (diVar == null) {
            throw new NullPointerException("ropper == null");
        }
        if (aqVar == null) {
            throw new NullPointerException("advice == null");
        }
        this.Ws = diVar;
        this.QX = shVar;
        this.XL = aqVar;
        this.aM = shVar.we();
        this.j3 = new ArrayList<>(25);
        this.Mr = null;
        this.U2 = false;
        this.a8 = false;
        this.lg = -1;
        this.rN = 0;
        this.yS = false;
        this.BT = null;
        this.vy = null;
    }

    private int Mz(int i, bq bqVar) {
        if (i == 0) {
            return 1;
        }
        if (i == 20) {
            return 5;
        }
        if (i == 21) {
            return 2;
        }
        if (i == 171) {
            return 13;
        }
        if (i == 172) {
            return 33;
        }
        if (i == 198) {
            return 7;
        }
        if (i == 199) {
            return 8;
        }
        switch (i) {
            case 0:
                return 1;
            case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
                return 5;
            case 46:
                return 38;
            case 54:
                return 2;
            case 79:
                return 39;
            case 96:
                return 14;
            case 100:
                return 15;
            case 104:
                return 16;
            case 108:
                return 17;
            case 112:
                return 18;
            case 116:
                return 19;
            case 120:
                return 23;
            case 122:
                return 24;
            case 124:
                return 25;
            case 126:
                return 20;
            case 128:
                return 21;
            case 130:
                return 22;
            default:
                switch (i) {
                    case 132:
                        return 14;
                    case 133:
                    case 134:
                    case 135:
                    case 136:
                    case 137:
                    case 138:
                    case 139:
                    case 140:
                    case 141:
                    case 142:
                    case 143:
                    case 144:
                        return 29;
                    case ProxyTextView.INPUTTYPE_textVisiblePassword /* 145 */:
                        return 30;
                    case 146:
                        return 31;
                    case 147:
                        return 32;
                    case 148:
                    case 149:
                    case 151:
                        return 27;
                    case 150:
                    case 152:
                        return 28;
                    case 153:
                    case 159:
                    case 165:
                        return 7;
                    case 154:
                    case 160:
                    case 166:
                        return 8;
                    case 155:
                    case ProxyTextView.INPUTTYPE_textWebEditText /* 161 */:
                        return 9;
                    case 156:
                    case 162:
                        return 10;
                    case 157:
                    case 163:
                        return 12;
                    case 158:
                    case 164:
                        return 11;
                    case 167:
                        return 6;
                    default:
                        switch (i) {
                            case ProxyTextView.INPUTTYPE_textFilter /* 177 */:
                                return 33;
                            case 178:
                                return 46;
                            case 179:
                                return 48;
                            case 180:
                                return 45;
                            case 181:
                                return 47;
                            case 182:
                                return 50;
                            case 183:
                                vq vqVar = (vq) bqVar;
                                return (vqVar.yS() || vqVar.we() == this.QX.FH() || !this.QX.gn()) ? 52 : 51;
                            case 184:
                                return 49;
                            case 185:
                                return 53;
                            default:
                                switch (i) {
                                    case 187:
                                        return 40;
                                    case 188:
                                    case 189:
                                        return 41;
                                    case 190:
                                        return 34;
                                    case 191:
                                        return 35;
                                    case 192:
                                        return 43;
                                    case ProxyTextView.INPUTTYPE_textPhonetic /* 193 */:
                                        return 44;
                                    case 194:
                                        return 36;
                                    case 195:
                                        return 37;
                                    default:
                                        throw new RuntimeException("shouldn't happen");
                                }
                        }
                }
        }
    }

    private rp Sf(int i, int i2) {
        rp rpVar;
        int iMr = Mr();
        if (iMr == 0) {
            return rp.jw;
        }
        int iBT = BT();
        if (iBT >= 0) {
            rpVar = new rp(1);
            rpVar.Mz(0, qp.ro(iBT, j3(0)));
        } else {
            rp rpVar2 = new rp(iMr);
            for (int i3 = 0; i3 < iMr; i3++) {
                qp qpVarRo = qp.ro(i2, j3(i3));
                rpVar2.Mz(i3, qpVarRo);
                i2 += qpVarRo.J0();
            }
            if (i == 79) {
                if (iMr != 3) {
                    throw new RuntimeException("shouldn't happen");
                }
                qp qpVarSG = rpVar2.sG(0);
                qp qpVarSG2 = rpVar2.sG(1);
                rpVar2.Mz(0, rpVar2.sG(2));
                rpVar2.Mz(1, qpVarSG);
                rpVar2.Mz(2, qpVarSG2);
            } else if (i == 181) {
                if (iMr != 2) {
                    throw new RuntimeException("shouldn't happen");
                }
                qp qpVarSG3 = rpVar2.sG(0);
                rpVar2.Mz(0, rpVar2.sG(1));
                rpVar2.Mz(1, qpVarSG3);
            }
            rpVar = rpVar2;
        }
        rpVar.Mr();
        return rpVar;
    }

    private void x9(tp tpVar, wp wpVar) {
        if (tpVar == null) {
            throw new NullPointerException("op == null");
        }
        if (wpVar == null) {
            throw new NullPointerException("pos == null");
        }
        tp tpVar2 = this.BT;
        if (tpVar2 == null) {
            this.BT = tpVar;
            this.vy = wpVar;
        } else if (tpVar2 == tpVar) {
            if (wpVar.j6() > this.vy.j6()) {
                this.vy = wpVar;
            }
        } else {
            throw new fi("return op mismatch: " + tpVar + ", " + this.BT);
        }
    }

    public boolean I() {
        return this.a8;
    }

    public boolean Qq() {
        return this.U2;
    }

    public void ca(hr hrVar) {
        this.Mr = hrVar;
        this.j3.clear();
        this.U2 = false;
        this.a8 = false;
        this.lg = 0;
        this.rN = 0;
        this.yS = false;
        this.er = false;
        this.gW = null;
    }

    public int cb() {
        return this.lg;
    }

    public int cn() {
        return this.rN;
    }

    public ci dx() {
        return this.gW;
    }

    public wp ef() {
        return this.vy;
    }

    public boolean g3() {
        return this.gW != null;
    }

    public boolean ro() {
        return this.yS;
    }

    public tp sG() {
        return this.BT;
    }

    public ArrayList<ip> sh() {
        return this.j3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0285  */
    /* JADX WARN: Type inference failed for: r12v8, types: [abcd.gr] */
    /* JADX WARN: Type inference failed for: r14v6, types: [abcd.gr] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [abcd.ip, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v20, types: [abcd.hr, abcd.rp] */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // abcd.ii, abcd.zh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v5(abcd.uh r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 919
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.ei.v5(abcd.uh, int, int):void");
    }

    public boolean vJ() {
        return this.er;
    }
}
