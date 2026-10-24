package abcd;

import com.aide.uidesigner.ProxyTextView;
import com.probelytics.api.UserTouchAction;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class rh {
    public static final c FH = new a();
    private final cq DW;
    private final os j6;

    public static class a implements c {
        private int j6 = -1;

        @Override // abcd.rh.c
        public void DW(int i, int i2, int i3, bq bqVar, int i4) {
        }

        @Override // abcd.rh.c
        public int FH() {
            return this.j6;
        }

        @Override // abcd.rh.c
        public void Hw(int i, int i2, int i3, int i4) {
        }

        @Override // abcd.rh.c
        public void VH(int i, int i2, zq zqVar, ArrayList<bq> arrayList) {
        }

        @Override // abcd.rh.c
        public void Zo(int i, int i2, int i3, hi hiVar, int i4) {
        }

        @Override // abcd.rh.c
        public void gn(int i, int i2, int i3) {
        }

        @Override // abcd.rh.c
        public void j6(int i, int i2, int i3, fr frVar) {
        }

        @Override // abcd.rh.c
        public void u7(int i, int i2, int i3, int i4, fr frVar, int i5) {
        }

        @Override // abcd.rh.c
        public void v5(int i) {
            this.j6 = i;
        }
    }

    class b extends a {
        bq DW;
        int FH;
        int Hw;

        public b(rh rhVar) {
        }

        private void tp() {
            this.FH = 0;
        }

        @Override // abcd.rh.a, abcd.rh.c
        public void DW(int i, int i2, int i3, bq bqVar, int i4) {
            this.DW = bqVar;
            this.FH = i3;
            this.Hw = i4;
        }

        @Override // abcd.rh.a, abcd.rh.c
        public int FH() {
            return -1;
        }

        @Override // abcd.rh.a, abcd.rh.c
        public void Hw(int i, int i2, int i3, int i4) {
            tp();
        }

        @Override // abcd.rh.a, abcd.rh.c
        public void VH(int i, int i2, zq zqVar, ArrayList<bq> arrayList) {
            tp();
        }

        @Override // abcd.rh.a, abcd.rh.c
        public void Zo(int i, int i2, int i3, hi hiVar, int i4) {
            tp();
        }

        @Override // abcd.rh.a, abcd.rh.c
        public void gn(int i, int i2, int i3) {
            tp();
        }

        @Override // abcd.rh.a, abcd.rh.c
        public void j6(int i, int i2, int i3, fr frVar) {
            tp();
        }

        @Override // abcd.rh.a, abcd.rh.c
        public void u7(int i, int i2, int i3, int i4, fr frVar, int i5) {
            tp();
        }

        @Override // abcd.rh.a, abcd.rh.c
        public void v5(int i) {
        }
    }

    public interface c {
        void DW(int i, int i2, int i3, bq bqVar, int i4);

        int FH();

        void Hw(int i, int i2, int i3, int i4);

        void VH(int i, int i2, zq zqVar, ArrayList<bq> arrayList);

        void Zo(int i, int i2, int i3, hi hiVar, int i4);

        void gn(int i, int i2, int i3);

        void j6(int i, int i2, int i3, fr frVar);

        void u7(int i, int i2, int i3, int i4, fr frVar, int i5);

        void v5(int i);
    }

    public rh(os osVar, cq cqVar) {
        if (osVar == null) {
            throw new NullPointerException("bytes == null");
        }
        if (cqVar == null) {
            throw new NullPointerException("pool == null");
        }
        this.j6 = osVar;
        this.DW = cqVar;
    }

    private int VH(int i, c cVar) {
        int i2 = (i + 4) & (-4);
        int iWe = 0;
        for (int i3 = i + 1; i3 < i2; i3++) {
            iWe = (iWe << 8) | this.j6.we(i3);
        }
        int iU7 = this.j6.u7(i2) + i;
        int iU72 = this.j6.u7(i2 + 4);
        int iU73 = this.j6.u7(i2 + 8);
        int i4 = (iU73 - iU72) + 1;
        int i5 = i2 + 12;
        if (iU72 > iU73) {
            throw new fi("low / high inversion");
        }
        hi hiVar = new hi(i4);
        for (int i6 = 0; i6 < i4; i6++) {
            int iU74 = this.j6.u7(i5) + i;
            i5 += 4;
            hiVar.BT(iU72 + i6, iU74);
        }
        hiVar.dx(iU7);
        hiVar.cb();
        hiVar.Mr();
        int i7 = i5 - i;
        cVar.Zo(171, i, i7, hiVar, iWe);
        return i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int Zo(int r13, abcd.rh.c r14) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.rh.Zo(int, abcd.rh$c):int");
    }

    private int gn(int i, c cVar) {
        int iWe = this.j6.we(i + 1);
        int iJ8 = this.j6.J8(i + 2);
        if (iWe == 132) {
            cVar.u7(iWe, i, 6, iJ8, fr.n5, this.j6.EQ(i + 4));
            return 6;
        }
        if (iWe == 169) {
            cVar.u7(iWe, i, 4, iJ8, fr.eU, 0);
            return 4;
        }
        switch (iWe) {
            case 21:
                cVar.u7(21, i, 4, iJ8, fr.n5, 0);
                return 4;
            case 22:
                cVar.u7(21, i, 4, iJ8, fr.Q6, 0);
                return 4;
            case 23:
                cVar.u7(21, i, 4, iJ8, fr.Z1, 0);
                return 4;
            case 24:
                cVar.u7(21, i, 4, iJ8, fr.q7, 0);
                return 4;
            case 25:
                cVar.u7(21, i, 4, iJ8, fr.sg, 0);
                return 4;
            default:
                switch (iWe) {
                    case 54:
                        cVar.u7(54, i, 4, iJ8, fr.n5, 0);
                        return 4;
                    case 55:
                        cVar.u7(54, i, 4, iJ8, fr.Q6, 0);
                        return 4;
                    case 56:
                        cVar.u7(54, i, 4, iJ8, fr.Z1, 0);
                        return 4;
                    case 57:
                        cVar.u7(54, i, 4, iJ8, fr.q7, 0);
                        return 4;
                    case 58:
                        cVar.u7(54, i, 4, iJ8, fr.sg, 0);
                        return 4;
                    default:
                        cVar.gn(196, i, 1);
                        return 1;
                }
        }
    }

    private int v5(int i, c cVar) {
        int i2 = (i + 4) & (-4);
        int iWe = 0;
        for (int i3 = i + 1; i3 < i2; i3++) {
            iWe = (iWe << 8) | this.j6.we(i3);
        }
        int iU7 = this.j6.u7(i2) + i;
        int iU72 = this.j6.u7(i2 + 4);
        int i4 = i2 + 8;
        hi hiVar = new hi(iU72);
        for (int i5 = 0; i5 < iU72; i5++) {
            int iU73 = this.j6.u7(i4);
            int iU74 = this.j6.u7(i4 + 4) + i;
            i4 += 8;
            hiVar.BT(iU73, iU74);
        }
        hiVar.dx(iU7);
        hiVar.cb();
        hiVar.Mr();
        int i6 = i4 - i;
        cVar.Zo(171, i, i6, hiVar, iWe);
        return i6;
    }

    public void DW(c cVar) {
        int iXL = this.j6.XL();
        int iHw = 0;
        while (iHw < iXL) {
            iHw += Hw(iHw, cVar);
        }
    }

    public os FH() {
        return this.j6;
    }

    public int Hw(int i, c cVar) {
        if (cVar == null) {
            cVar = FH;
        }
        c cVar2 = cVar;
        try {
            int iWe = this.j6.we(i);
            qh.j6(iWe);
            switch (iWe) {
                case 0:
                    cVar2.j6(iWe, i, 1, fr.Jl);
                    return 1;
                case 1:
                    cVar2.DW(18, i, 1, pq.WB, 0);
                    return 1;
                case 2:
                    cVar2.DW(18, i, 1, nq.jw, -1);
                    return 1;
                case 3:
                    cVar2.DW(18, i, 1, nq.fY, 0);
                    return 1;
                case 4:
                    cVar2.DW(18, i, 1, nq.qp, 1);
                    return 1;
                case 5:
                    cVar2.DW(18, i, 1, nq.k2, 2);
                    return 1;
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                    cVar2.DW(18, i, 1, nq.zh, 3);
                    return 1;
                case UserTouchAction.CLICK_KIND /* 7 */:
                    cVar2.DW(18, i, 1, nq.AL, 4);
                    return 1;
                case 8:
                    cVar2.DW(18, i, 1, nq.w9, 5);
                    return 1;
                case 9:
                    cVar2.DW(18, i, 1, tq.mb, 0);
                    return 1;
                case 10:
                    cVar2.DW(18, i, 1, tq.jw, 0);
                    return 1;
                case 11:
                    cVar2.DW(18, i, 1, mq.mb, 0);
                    return 1;
                case 12:
                    cVar2.DW(18, i, 1, mq.jw, 0);
                    return 1;
                case 13:
                    cVar2.DW(18, i, 1, mq.fY, 0);
                    return 1;
                case 14:
                    cVar2.DW(18, i, 1, jq.mb, 0);
                    return 1;
                case 15:
                    cVar2.DW(18, i, 1, jq.jw, 0);
                    return 1;
                case 16:
                    int iZo = this.j6.Zo(i + 1);
                    cVar2.DW(18, i, 2, nq.yS(iZo), iZo);
                    return 2;
                case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                    int iEQ = this.j6.EQ(i + 1);
                    cVar2.DW(18, i, 3, nq.yS(iEQ), iEQ);
                    return 3;
                case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
                    bq bqVar = this.DW.get(this.j6.we(i + 1));
                    cVar2.DW(18, i, 2, bqVar, bqVar instanceof nq ? ((nq) bqVar).a8() : 0);
                    return 2;
                case 19:
                    bq bqVar2 = this.DW.get(this.j6.J8(i + 1));
                    cVar2.DW(18, i, 3, bqVar2, bqVar2 instanceof nq ? ((nq) bqVar2).a8() : 0);
                    return 3;
                case ProxyTextView.INPUTTYPE_date /* 20 */:
                    cVar2.DW(20, i, 3, this.DW.get(this.j6.J8(i + 1)), 0);
                    return 3;
                case 21:
                    cVar2.u7(21, i, 2, this.j6.we(i + 1), fr.n5, 0);
                    return 2;
                case 22:
                    cVar2.u7(21, i, 2, this.j6.we(i + 1), fr.Q6, 0);
                    return 2;
                case 23:
                    cVar2.u7(21, i, 2, this.j6.we(i + 1), fr.Z1, 0);
                    return 2;
                case 24:
                    cVar2.u7(21, i, 2, this.j6.we(i + 1), fr.q7, 0);
                    return 2;
                case 25:
                    cVar2.u7(21, i, 2, this.j6.we(i + 1), fr.sg, 0);
                    return 2;
                case 26:
                case 27:
                case 28:
                case 29:
                    cVar2.u7(21, i, 1, iWe - 26, fr.n5, 0);
                    return 1;
                case 30:
                case 31:
                case 32:
                case ProxyTextView.INPUTTYPE_textEmailAddress /* 33 */:
                    cVar2.u7(21, i, 1, iWe - 30, fr.Q6, 0);
                    return 1;
                case 34:
                case 35:
                case ProxyTextView.INPUTTYPE_time /* 36 */:
                case 37:
                    cVar2.u7(21, i, 1, iWe - 34, fr.Z1, 0);
                    return 1;
                case 38:
                case 39:
                case 40:
                case 41:
                    cVar2.u7(21, i, 1, iWe - 38, fr.q7, 0);
                    return 1;
                case 42:
                case 43:
                case 44:
                case 45:
                    cVar2.u7(21, i, 1, iWe - 42, fr.sg, 0);
                    return 1;
                case 46:
                    cVar2.j6(46, i, 1, fr.n5);
                    return 1;
                case 47:
                    cVar2.j6(46, i, 1, fr.Q6);
                    return 1;
                case 48:
                    cVar2.j6(46, i, 1, fr.Z1);
                    return 1;
                case ProxyTextView.INPUTTYPE_textEmailSubject /* 49 */:
                    cVar2.j6(46, i, 1, fr.q7);
                    return 1;
                case 50:
                    cVar2.j6(46, i, 1, fr.sg);
                    return 1;
                case 51:
                    cVar2.j6(46, i, 1, fr.hK);
                    return 1;
                case 52:
                    cVar2.j6(46, i, 1, fr.cT);
                    return 1;
                case 53:
                    cVar2.j6(46, i, 1, fr.kf);
                    return 1;
                case 54:
                    cVar2.u7(54, i, 2, this.j6.we(i + 1), fr.n5, 0);
                    return 2;
                case 55:
                    cVar2.u7(54, i, 2, this.j6.we(i + 1), fr.Q6, 0);
                    return 2;
                case 56:
                    cVar2.u7(54, i, 2, this.j6.we(i + 1), fr.Z1, 0);
                    return 2;
                case 57:
                    cVar2.u7(54, i, 2, this.j6.we(i + 1), fr.q7, 0);
                    return 2;
                case 58:
                    cVar2.u7(54, i, 2, this.j6.we(i + 1), fr.sg, 0);
                    return 2;
                case 59:
                case 60:
                case 61:
                case 62:
                    cVar2.u7(54, i, 1, iWe - 59, fr.n5, 0);
                    return 1;
                case 63:
                case 64:
                case ProxyTextView.INPUTTYPE_textShortMessage /* 65 */:
                case 66:
                    cVar2.u7(54, i, 1, iWe - 63, fr.Q6, 0);
                    return 1;
                case 67:
                case 68:
                case 69:
                case 70:
                    cVar2.u7(54, i, 1, iWe - 67, fr.Z1, 0);
                    return 1;
                case 71:
                case 72:
                case 73:
                case 74:
                    cVar2.u7(54, i, 1, iWe - 71, fr.q7, 0);
                    return 1;
                case 75:
                case 76:
                case 77:
                case 78:
                    cVar2.u7(54, i, 1, iWe - 75, fr.sg, 0);
                    return 1;
                case 79:
                    cVar2.j6(79, i, 1, fr.n5);
                    return 1;
                case 80:
                    cVar2.j6(79, i, 1, fr.Q6);
                    return 1;
                case ProxyTextView.INPUTTYPE_textLongMessage /* 81 */:
                    cVar2.j6(79, i, 1, fr.Z1);
                    return 1;
                case 82:
                    cVar2.j6(79, i, 1, fr.q7);
                    return 1;
                case 83:
                    cVar2.j6(79, i, 1, fr.sg);
                    return 1;
                case 84:
                    cVar2.j6(79, i, 1, fr.hK);
                    return 1;
                case 85:
                    cVar2.j6(79, i, 1, fr.cT);
                    return 1;
                case 86:
                    cVar2.j6(79, i, 1, fr.kf);
                    return 1;
                case 87:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                case 93:
                case 94:
                case 95:
                    cVar2.j6(iWe, i, 1, fr.Jl);
                    return 1;
                case 96:
                case 100:
                case 104:
                case 108:
                case 112:
                case 116:
                case 120:
                case 122:
                case 124:
                case 126:
                case 128:
                case 130:
                    cVar2.j6(iWe, i, 1, fr.n5);
                    return 1;
                case ProxyTextView.INPUTTYPE_textPersonName /* 97 */:
                case 101:
                case 105:
                case 109:
                case ProxyTextView.INPUTTYPE_textPostalAddress /* 113 */:
                case 117:
                case 121:
                case 123:
                case 125:
                case 127:
                case ProxyTextView.INPUTTYPE_textPassword /* 129 */:
                case 131:
                    cVar2.j6(iWe - 1, i, 1, fr.Q6);
                    return 1;
                case 98:
                case 102:
                case 106:
                case 110:
                case 114:
                case 118:
                    cVar2.j6(iWe - 2, i, 1, fr.Z1);
                    return 1;
                case 99:
                case 103:
                case 107:
                case 111:
                case 115:
                case 119:
                    cVar2.j6(iWe - 3, i, 1, fr.q7);
                    return 1;
                case 132:
                    cVar2.u7(iWe, i, 3, this.j6.we(i + 1), fr.n5, this.j6.Zo(i + 2));
                    return 3;
                case 133:
                case 140:
                case 143:
                    cVar2.j6(iWe, i, 1, fr.Q6);
                    return 1;
                case 134:
                case 137:
                case 144:
                    cVar2.j6(iWe, i, 1, fr.Z1);
                    return 1;
                case 135:
                case 138:
                case 141:
                    cVar2.j6(iWe, i, 1, fr.q7);
                    return 1;
                case 136:
                case 139:
                case 142:
                case ProxyTextView.INPUTTYPE_textVisiblePassword /* 145 */:
                case 146:
                case 147:
                case 148:
                case 149:
                case 150:
                case 151:
                case 152:
                case 190:
                    cVar2.j6(iWe, i, 1, fr.n5);
                    return 1;
                case 153:
                case 154:
                case 155:
                case 156:
                case 157:
                case 158:
                case 159:
                case 160:
                case ProxyTextView.INPUTTYPE_textWebEditText /* 161 */:
                case 162:
                case 163:
                case 164:
                case 165:
                case 166:
                case 167:
                case 168:
                case 198:
                case 199:
                    cVar2.Hw(iWe, i, 3, this.j6.EQ(i + 1) + i);
                    return 3;
                case 169:
                    cVar2.u7(iWe, i, 2, this.j6.we(i + 1), fr.eU, 0);
                    return 2;
                case 170:
                    return VH(i, cVar2);
                case 171:
                    return v5(i, cVar2);
                case 172:
                    cVar2.j6(172, i, 1, fr.n5);
                    return 1;
                case 173:
                    cVar2.j6(172, i, 1, fr.Q6);
                    return 1;
                case 174:
                    cVar2.j6(172, i, 1, fr.Z1);
                    return 1;
                case 175:
                    cVar2.j6(172, i, 1, fr.q7);
                    return 1;
                case 176:
                    cVar2.j6(172, i, 1, fr.sg);
                    return 1;
                case ProxyTextView.INPUTTYPE_textFilter /* 177 */:
                case 191:
                case 194:
                case 195:
                    cVar2.j6(iWe, i, 1, fr.Jl);
                    return 1;
                case 178:
                case 179:
                case 180:
                case 181:
                case 182:
                case 183:
                case 184:
                case 187:
                case 189:
                case 192:
                case ProxyTextView.INPUTTYPE_textPhonetic /* 193 */:
                    cVar2.DW(iWe, i, 3, this.DW.get(this.j6.J8(i + 1)), 0);
                    return 3;
                case 185:
                    cVar2.DW(iWe, i, 5, this.DW.get(this.j6.J8(i + 1)), this.j6.we(i + 3) | (this.j6.we(i + 4) << 8));
                    return 5;
                case 186:
                default:
                    cVar2.gn(iWe, i, 1);
                    return 1;
                case 188:
                    return Zo(i, cVar2);
                case 196:
                    return gn(i, cVar2);
                case 197:
                    cVar2.DW(iWe, i, 4, this.DW.get(this.j6.J8(i + 1)), this.j6.we(i + 3));
                    return 4;
                case 200:
                case 201:
                    cVar2.Hw(iWe == 200 ? 167 : 168, i, 5, this.j6.u7(i + 1) + i);
                    return 5;
            }
        } catch (fi e) {
            e.j6("...at bytecode offset " + xs.tp(i));
            throw e;
        } catch (RuntimeException e2) {
            fi fiVar = new fi(e2);
            fiVar.j6("...at bytecode offset " + xs.tp(i));
            throw fiVar;
        }
    }

    public int j6() {
        return this.j6.XL() + 4;
    }

    public int tp() {
        return this.j6.XL();
    }

    public void u7(int[] iArr, c cVar) {
        if (cVar == null) {
            throw new NullPointerException("visitor == null");
        }
        while (true) {
            int iV5 = ns.v5(iArr, 0);
            if (iV5 < 0) {
                return;
            }
            ns.FH(iArr, iV5);
            Hw(iV5, cVar);
            cVar.v5(iV5);
        }
    }
}
