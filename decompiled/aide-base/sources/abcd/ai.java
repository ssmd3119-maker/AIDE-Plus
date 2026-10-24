package abcd;

/* loaded from: classes.dex */
public final class ai {
    public static bi DW(bi biVar, bi biVar2) {
        if (biVar == biVar2) {
            return biVar;
        }
        int iSf = biVar.Sf();
        bi biVarVy = null;
        if (biVar2.Sf() != iSf) {
            throw new fi("mismatched maxLocals values");
        }
        for (int i = 0; i < iSf; i++) {
            gr grVarVJ = biVar.vJ(i);
            gr grVarHw = Hw(grVarVJ, biVar2.vJ(i));
            if (grVarHw != grVarVJ) {
                if (biVarVy == null) {
                    biVarVy = biVar.vy();
                }
                if (grVarHw == null) {
                    biVarVy.g3(i);
                } else {
                    biVarVy.dx(i, grVarHw);
                }
            }
        }
        if (biVarVy == null) {
            return biVar;
        }
        biVarVy.Mr();
        return biVarVy;
    }

    public static th FH(th thVar, th thVar2) {
        if (thVar == thVar2) {
            return thVar;
        }
        int size = thVar.size();
        th thVarRo = null;
        if (thVar2.size() != size) {
            throw new fi("mismatched stack depths");
        }
        for (int i = 0; i < size; i++) {
            gr grVarCb = thVar.cb(i);
            gr grVarCb2 = thVar2.cb(i);
            gr grVarHw = Hw(grVarCb, grVarCb2);
            if (grVarHw != grVarCb) {
                if (thVarRo == null) {
                    thVarRo = thVar.ro();
                }
                if (grVarHw == null) {
                    throw new fi("incompatible: " + grVarCb + ", " + grVarCb2);
                }
                try {
                    thVarRo.vy(i, grVarHw);
                } catch (fi e) {
                    e.j6("...while merging stack[" + xs.VH(i) + "]");
                    throw e;
                }
                e.j6("...while merging stack[" + xs.VH(i) + "]");
                throw e;
            }
        }
        if (thVarRo == null) {
            return thVar;
        }
        thVarRo.Mr();
        return thVarRo;
    }

    public static gr Hw(gr grVar, gr grVar2) {
        if (grVar == null || grVar.equals(grVar2)) {
            return grVar;
        }
        if (grVar2 == null) {
            return null;
        }
        fr frVarJ6 = grVar.j6();
        fr frVarJ62 = grVar2.j6();
        if (frVarJ6 == frVarJ62) {
            return frVarJ6;
        }
        if (!frVarJ6.dx() || !frVarJ62.dx()) {
            if (frVarJ6.sh() && frVarJ62.sh()) {
                return fr.n5;
            }
            return null;
        }
        fr frVar = fr.iW;
        if (frVarJ6 == frVar) {
            return frVarJ62;
        }
        if (frVarJ62 == frVar) {
            return frVarJ6;
        }
        if (!frVarJ6.vy() || !frVarJ62.vy()) {
            return fr.sg;
        }
        gr grVarHw = Hw(frVarJ6.J0(), frVarJ62.J0());
        return grVarHw == null ? fr.sg : ((fr) grVarHw).v5();
    }

    public static boolean j6(gr grVar, gr grVar2) {
        fr frVarJ6 = grVar.j6();
        fr frVarJ62 = grVar2.j6();
        if (frVarJ6.equals(frVarJ62)) {
            return true;
        }
        int iU7 = frVarJ6.u7();
        int iU72 = frVarJ62.u7();
        if (iU7 == 10) {
            frVarJ6 = fr.sg;
            iU7 = 9;
        }
        if (iU72 == 10) {
            frVarJ62 = fr.sg;
            iU72 = 9;
        }
        if (iU7 != 9 || iU72 != 9) {
            return frVarJ6.sh() && frVarJ62.sh();
        }
        fr frVar = fr.iW;
        if (frVarJ6 == frVar) {
            return false;
        }
        if (frVarJ62 == frVar || frVarJ6 == fr.sg) {
            return true;
        }
        if (!frVarJ6.vy()) {
            return !frVarJ62.vy() || frVarJ6 == fr.pO || frVarJ6 == fr.sE;
        }
        if (!frVarJ62.vy()) {
            return false;
        }
        do {
            frVarJ6 = frVarJ6.J0();
            frVarJ62 = frVarJ62.J0();
            if (!frVarJ6.vy()) {
                break;
            }
        } while (frVarJ62.vy());
        return j6(frVarJ6, frVarJ62);
    }
}
