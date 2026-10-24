package abcd;

import abcd.rh;
import com.aide.uidesigner.ProxyTextView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class gi {
    private final rh DW;
    private final wh FH;
    private final a Hw;
    private final zh j6;

    private class a implements rh.c {
        private uh DW = null;
        private int FH;
        private final zh j6;

        public a() {
            this.j6 = gi.this.j6;
        }

        private void tp(fr frVar) {
            fr frVarZo = this.j6.Hw().Zo();
            if (ai.j6(frVarZo, frVar)) {
                return;
            }
            throw new fi("return type mismatch: prototype indicates " + frVarZo.Zo() + ", but encountered type " + frVar.Zo());
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
        @Override // abcd.rh.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void DW(int r4, int r5, int r6, abcd.bq r7, int r8) {
            /*
                r3 = this;
                r6 = 189(0xbd, float:2.65E-43)
                if (r4 == r6) goto L78
                r6 = 197(0xc5, float:2.76E-43)
                if (r4 == r6) goto L6a
                r6 = 192(0xc0, float:2.69E-43)
                if (r4 == r6) goto L60
                r6 = 193(0xc1, float:2.7E-43)
                if (r4 == r6) goto L60
                switch(r4) {
                    case 179: goto L51;
                    case 180: goto L60;
                    case 181: goto L40;
                    case 182: goto L30;
                    case 183: goto L30;
                    case 184: goto L20;
                    case 185: goto L19;
                    default: goto L13;
                }
            L13:
                abcd.zh r6 = r3.j6
                r6.FH()
                goto L81
            L19:
                abcd.oq r7 = (abcd.oq) r7
                abcd.vq r7 = r7.BT()
                goto L30
            L20:
                r6 = r7
                abcd.vq r6 = (abcd.vq) r6
                r0 = 1
                abcd.dr r6 = r6.Mr(r0)
                abcd.zh r0 = r3.j6
                abcd.uh r1 = r3.DW
                r0.J0(r1, r6)
                goto L81
            L30:
                r6 = r7
                abcd.vq r6 = (abcd.vq) r6
                r0 = 0
                abcd.dr r6 = r6.Mr(r0)
                abcd.zh r0 = r3.j6
                abcd.uh r1 = r3.DW
                r0.J0(r1, r6)
                goto L81
            L40:
                r6 = r7
                abcd.lq r6 = (abcd.lq) r6
                abcd.fr r6 = r6.j6()
                abcd.zh r0 = r3.j6
                abcd.uh r1 = r3.DW
                abcd.fr r2 = abcd.fr.sg
                r0.u7(r1, r2, r6)
                goto L81
            L51:
                r6 = r7
                abcd.lq r6 = (abcd.lq) r6
                abcd.fr r6 = r6.j6()
                abcd.zh r0 = r3.j6
                abcd.uh r1 = r3.DW
                r0.j6(r1, r6)
                goto L81
            L60:
                abcd.zh r6 = r3.j6
                abcd.uh r0 = r3.DW
                abcd.fr r1 = abcd.fr.sg
                r6.j6(r0, r1)
                goto L81
            L6a:
                abcd.fr r6 = abcd.fr.Jl
                abcd.dr r6 = abcd.dr.we(r6, r8)
                abcd.zh r0 = r3.j6
                abcd.uh r1 = r3.DW
                r0.J0(r1, r6)
                goto L81
            L78:
                abcd.zh r6 = r3.j6
                abcd.uh r0 = r3.DW
                abcd.fr r1 = abcd.fr.n5
                r6.j6(r0, r1)
            L81:
                abcd.zh r6 = r3.j6
                r6.QX(r8)
                abcd.zh r6 = r3.j6
                r6.we(r7)
                abcd.zh r6 = r3.j6
                abcd.uh r7 = r3.DW
                r6.v5(r7, r5, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: abcd.gi.a.DW(int, int, int, abcd.bq, int):void");
        }

        public void EQ(uh uhVar) {
            if (uhVar == null) {
                throw new NullPointerException("frame == null");
            }
            this.DW = uhVar;
        }

        @Override // abcd.rh.c
        public int FH() {
            return this.FH;
        }

        @Override // abcd.rh.c
        public void Hw(int i, int i2, int i3, int i4) {
            switch (i) {
                case 153:
                case 154:
                case 155:
                case 156:
                case 157:
                case 158:
                    this.j6.j6(this.DW, fr.n5);
                    this.j6.Zo(i4);
                    this.j6.v5(this.DW, i2, i);
                    return;
                case 159:
                case 160:
                case ProxyTextView.INPUTTYPE_textWebEditText /* 161 */:
                case 162:
                case 163:
                case 164:
                    zh zhVar = this.j6;
                    uh uhVar = this.DW;
                    fr frVar = fr.n5;
                    zhVar.u7(uhVar, frVar, frVar);
                    this.j6.Zo(i4);
                    this.j6.v5(this.DW, i2, i);
                    return;
                case 165:
                case 166:
                    zh zhVar2 = this.j6;
                    uh uhVar2 = this.DW;
                    fr frVar2 = fr.sg;
                    zhVar2.u7(uhVar2, frVar2, frVar2);
                    this.j6.Zo(i4);
                    this.j6.v5(this.DW, i2, i);
                    return;
                default:
                    switch (i) {
                        case 198:
                        case 199:
                            this.j6.j6(this.DW, fr.sg);
                            break;
                        case 200:
                        case 201:
                            break;
                        default:
                            gn(i, i2, i3);
                            throw null;
                    }
                    this.j6.Zo(i4);
                    this.j6.v5(this.DW, i2, i);
                    return;
                case 167:
                case 168:
                    this.j6.FH();
                    this.j6.Zo(i4);
                    this.j6.v5(this.DW, i2, i);
                    return;
            }
        }

        @Override // abcd.rh.c
        public void VH(int i, int i2, zq zqVar, ArrayList<bq> arrayList) {
            this.j6.j6(this.DW, fr.n5);
            this.j6.tp(arrayList);
            this.j6.we(zqVar);
            this.j6.v5(this.DW, i, 188);
        }

        @Override // abcd.rh.c
        public void Zo(int i, int i2, int i3, hi hiVar, int i4) {
            this.j6.j6(this.DW, fr.n5);
            this.j6.QX(i4);
            this.j6.J8(hiVar);
            this.j6.v5(this.DW, i2, i);
        }

        @Override // abcd.rh.c
        public void gn(int i, int i2, int i3) {
            throw new fi("invalid opcode " + xs.Zo(i));
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:116:0x02b9  */
        /* JADX WARN: Removed duplicated region for block: B:131:0x0346  */
        @Override // abcd.rh.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void j6(int r9, int r10, int r11, abcd.fr r12) {
            /*
                Method dump skipped, instructions count: 990
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: abcd.gi.a.j6(int, int, int, abcd.fr):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
        @Override // abcd.rh.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void u7(int r7, int r8, int r9, int r10, abcd.fr r11, int r12) {
            /*
                r6 = this;
                r0 = 54
                if (r7 != r0) goto L7
                int r1 = r8 + r9
                goto L8
            L7:
                r1 = r8
            L8:
                abcd.gi r2 = abcd.gi.this
                abcd.wh r2 = abcd.gi.Hw(r2)
                abcd.wh$a r1 = r2.g3(r1, r10)
                r2 = 0
                if (r1 == 0) goto L28
                abcd.fr r3 = r1.Hw()
                int r4 = r3.U2()
                int r5 = r11.U2()
                if (r4 != r5) goto L24
                goto L29
            L24:
                abcd.lh.KD(r11, r3)
                throw r2
            L28:
                r3 = r11
            L29:
                r4 = 21
                if (r7 == r4) goto L7c
                if (r7 == r0) goto L63
                r0 = 132(0x84, float:1.85E-43)
                if (r7 == r0) goto L3c
                r12 = 169(0xa9, float:2.37E-43)
                if (r7 != r12) goto L38
                goto L7c
            L38:
                r6.gn(r7, r8, r9)
                throw r2
            L3c:
                if (r1 != 0) goto L3f
                goto L43
            L3f:
                abcd.kp r2 = r1.DW()
            L43:
                abcd.zh r9 = r6.j6
                abcd.uh r0 = r6.DW
                r9.Ws(r0, r10)
                abcd.zh r9 = r6.j6
                r9.XL(r10, r3, r2)
                abcd.zh r9 = r6.j6
                r9.DW(r11)
                abcd.zh r9 = r6.j6
                r9.QX(r12)
                abcd.zh r9 = r6.j6
                abcd.nq r10 = abcd.nq.yS(r12)
                r9.we(r10)
                goto L92
            L63:
                if (r1 != 0) goto L66
                goto L6a
            L66:
                abcd.kp r2 = r1.DW()
            L6a:
                abcd.zh r9 = r6.j6
                abcd.uh r12 = r6.DW
                r9.j6(r12, r11)
                abcd.zh r9 = r6.j6
                r9.DW(r11)
                abcd.zh r9 = r6.j6
                r9.XL(r10, r3, r2)
                goto L92
            L7c:
                abcd.zh r9 = r6.j6
                abcd.uh r12 = r6.DW
                r9.Ws(r12, r10)
                abcd.zh r9 = r6.j6
                if (r1 == 0) goto L89
                r10 = 1
                goto L8a
            L89:
                r10 = 0
            L8a:
                r9.EQ(r10)
                abcd.zh r9 = r6.j6
                r9.DW(r11)
            L92:
                abcd.zh r9 = r6.j6
                abcd.uh r10 = r6.DW
                r9.v5(r10, r8, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: abcd.gi.a.u7(int, int, int, int, abcd.fr, int):void");
        }

        @Override // abcd.rh.c
        public void v5(int i) {
            this.FH = i;
        }
    }

    public gi(zh zhVar, sh shVar) {
        if (zhVar == null) {
            throw new NullPointerException("machine == null");
        }
        if (shVar == null) {
            throw new NullPointerException("method == null");
        }
        this.j6 = zhVar;
        this.DW = shVar.tp();
        this.FH = shVar.EQ();
        this.Hw = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static fr Zo(fr frVar, fr frVar2) {
        fr frVar3;
        return frVar2 == fr.iW ? frVar.v5() : (frVar == fr.sg && frVar2.vy() && frVar2.J0().dx()) ? frVar2 : (frVar == fr.hK && frVar2 == (frVar3 = fr.IS)) ? frVar3 : frVar.v5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static fi v5() {
        return new fi("stack mismatch: illegal top-of-stack for opcode");
    }

    public void VH(nh nhVar, uh uhVar) {
        int iFH = nhVar.FH();
        this.Hw.EQ(uhVar);
        try {
            int iHw = nhVar.Hw();
            while (iHw < iFH) {
                int iHw2 = this.DW.Hw(iHw, this.Hw);
                this.Hw.v5(iHw);
                iHw += iHw2;
            }
        } catch (fi e) {
            uhVar.DW(e);
            throw e;
        }
    }
}
