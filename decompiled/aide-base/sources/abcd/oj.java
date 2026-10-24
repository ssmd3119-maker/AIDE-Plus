package abcd;

import abcd.yj;

/* loaded from: classes.dex */
public class oj {

    static class a implements yj.a {
        @Override // abcd.yj.a
        public int j6(bq bqVar) {
            return 0;
        }
    }

    private static void DW(oi oiVar, fm fmVar) {
        zq zqVarJ8 = oiVar.J8();
        xi xiVarZo = oiVar.Zo();
        int size = xiVarZo.size();
        for (int i = 0; i < size; i++) {
            wi wiVar = xiVarZo.get(i);
            try {
                lq lqVar = new lq(zqVarJ8, wiVar.v5());
                int iJ6 = wiVar.j6();
                if (bp.u7(iJ6)) {
                    br brVarZo = wiVar.Zo();
                    mm mmVar = new mm(lqVar, iJ6);
                    if (brVarZo != null) {
                        brVarZo = j6(brVarZo, lqVar.j6());
                    }
                    fmVar.a8(mmVar, brVarZo);
                } else {
                    fmVar.aM(new mm(lqVar, iJ6));
                }
                yo yoVarJ6 = mj.j6(wiVar.Hw());
                if (yoVarJ6.size() != 0) {
                    fmVar.XL(lqVar, yoVarJ6);
                }
            } catch (RuntimeException e) {
                throw us.DW(e, "...while processing " + wiVar.getName().Zo() + " " + wiVar.VH().Zo());
            }
        }
    }

    private static void FH(oi oiVar, nj njVar, kj kjVar, fm fmVar) {
        boolean z;
        zq zqVar;
        yj yjVar;
        up upVar;
        zq zqVarJ8 = oiVar.J8();
        aj ajVarEQ = oiVar.EQ();
        int size = ajVarEQ.size();
        int i = 0;
        while (i < size) {
            zi ziVar = ajVarEQ.get(i);
            try {
                vq vqVar = new vq(zqVarJ8, ziVar.v5());
                int iJ6 = ziVar.j6();
                boolean zU7 = bp.u7(iJ6);
                boolean zGn = bp.gn(iJ6);
                boolean zVH = bp.VH(iJ6);
                boolean zV5 = bp.v5(iJ6);
                boolean z2 = true;
                boolean z3 = vqVar.yS() || vqVar.a8();
                if (zVH || zV5) {
                    z = zU7;
                    zqVar = zqVarJ8;
                    yjVar = null;
                } else {
                    if (njVar.j6 == 1) {
                        z2 = false;
                    }
                    sh shVar = new sh(ziVar, oiVar, z2, njVar.DW);
                    fp fpVar = fp.DW;
                    up upVarXL = di.XL(shVar, fpVar);
                    int iQX = vqVar.QX(zU7);
                    String str = zqVarJ8.J0().QX() + "." + ziVar.getName().J0();
                    if (njVar.Hw && qj.FH(str)) {
                        up upVarFH = ur.FH(upVarXL, iQX, zU7, njVar.DW, fpVar);
                        if (njVar.VH) {
                            pj.FH(upVarXL, upVarFH);
                        }
                        upVar = upVarFH;
                    } else {
                        upVar = upVarXL;
                        upVarXL = null;
                    }
                    mp mpVarDW = njVar.DW ? lp.DW(upVar) : null;
                    zqVar = zqVarJ8;
                    yj yjVarJ8 = pk.J8(upVar, njVar.j6, mpVarDW, iQX, kjVar);
                    if (!njVar.VH || upVarXL == null) {
                        z = zU7;
                    } else {
                        mp mpVar = mpVarDW;
                        z = zU7;
                        Zo(njVar, kjVar, upVar, upVarXL, mpVar, iQX, shVar.tp().tp());
                    }
                    yjVar = yjVarJ8;
                }
                if (bp.tp(iJ6)) {
                    iJ6 |= 131072;
                    if (!zVH) {
                        iJ6 &= -33;
                    }
                }
                if (z3) {
                    iJ6 |= 65536;
                }
                om omVar = new om(vqVar, iJ6, yjVar, mj.Hw(ziVar));
                if (vqVar.yS() || vqVar.a8() || z || zGn) {
                    fmVar.QX(omVar);
                } else {
                    fmVar.rN(omVar);
                }
                yo yoVarV5 = mj.v5(ziVar);
                if (yoVarV5.size() != 0) {
                    fmVar.Mr(vqVar, yoVarV5);
                }
                zo zoVarZo = mj.Zo(ziVar);
                if (zoVarZo.size() != 0) {
                    fmVar.U2(vqVar, zoVarZo);
                }
                i++;
                zqVarJ8 = zqVar;
            } catch (RuntimeException e) {
                throw us.DW(e, "...while processing " + ziVar.getName().Zo() + " " + ziVar.VH().Zo());
            }
        }
    }

    public static fm Hw(String str, byte[] bArr, nj njVar, kj kjVar) {
        try {
            return v5(str, bArr, njVar, kjVar);
        } catch (RuntimeException e) {
            throw us.DW(e, "...while processing " + str);
        }
    }

    private static void Zo(nj njVar, kj kjVar, up upVar, up upVar2, mp mpVar, int i, int i2) {
        yj yjVarJ8 = pk.J8(upVar, njVar.j6, mpVar, i, kjVar);
        yj yjVarJ82 = pk.J8(upVar2, njVar.j6, mpVar, i, kjVar);
        a aVar = new a();
        yjVarJ8.j6(aVar);
        yjVarJ82.j6(aVar);
        pj.j6(yjVarJ82, yjVarJ8);
        pj.DW(i2);
    }

    private static br j6(br brVar, fr frVar) {
        if (brVar.j6().equals(frVar)) {
            return brVar;
        }
        int iU7 = frVar.u7();
        if (iU7 == 1) {
            return gq.yS(((nq) brVar).a8());
        }
        if (iU7 == 2) {
            return hq.yS(((nq) brVar).a8());
        }
        if (iU7 == 3) {
            return iq.yS(((nq) brVar).a8());
        }
        if (iU7 == 8) {
            return xq.a8(((nq) brVar).a8());
        }
        throw new UnsupportedOperationException("can't coerce " + brVar + " to " + frVar);
    }

    private static fm v5(String str, byte[] bArr, nj njVar, kj kjVar) {
        oi oiVar = new oi(bArr, str, njVar.FH);
        oiVar.U2(si.j6);
        oiVar.gn();
        qj.j6(njVar.v5, njVar.Zo);
        fm fmVar = new fm(oiVar.J8(), oiVar.j6() & (-33), oiVar.J0(), oiVar.VH(), njVar.j6 == 1 ? null : oiVar.DW());
        yo yoVarFH = mj.FH(oiVar, njVar);
        if (yoVarFH.size() != 0) {
            fmVar.KD(yoVarFH);
        }
        DW(oiVar, fmVar);
        FH(oiVar, njVar, kjVar, fmVar);
        return fmVar;
    }
}
