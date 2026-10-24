package abcd;

import abcd.jh;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class mj {
    private static yo DW(ui uiVar) {
        ah ahVar = (ah) uiVar.J0("RuntimeVisibleAnnotations");
        yg ygVar = (yg) uiVar.J0("RuntimeInvisibleAnnotations");
        return ahVar == null ? ygVar == null ? yo.jw : ygVar.j6() : ygVar == null ? ahVar.j6() : yo.ro(ahVar.j6(), ygVar.j6());
    }

    public static yo FH(oi oiVar, nj njVar) {
        wo woVarGn;
        zq zqVarJ8 = oiVar.J8();
        ui uiVarFH = oiVar.FH();
        yo yoVarJ6 = j6(uiVarFH);
        wo woVarU7 = u7(uiVarFH);
        try {
            yo yoVarTp = tp(zqVarJ8, uiVarFH, woVarU7 == null);
            if (yoVarTp != null) {
                yoVarJ6 = yo.ro(yoVarJ6, yoVarTp);
            }
        } catch (nt e) {
            njVar.gn.println("warning: " + e.getMessage());
        }
        if (woVarU7 != null) {
            yoVarJ6 = yo.KD(yoVarJ6, woVarU7);
        }
        return (!bp.Zo(oiVar.j6()) || (woVarGn = gn(oiVar)) == null) ? yoVarJ6 : yo.KD(yoVarJ6, woVarGn);
    }

    public static hr Hw(zi ziVar) {
        tg tgVar = (tg) ziVar.Hw().J0("Exceptions");
        return tgVar == null ? er.jw : tgVar.j6();
    }

    private static wo VH(ui uiVar) {
        ch chVar = (ch) uiVar.J0("Signature");
        if (chVar == null) {
            return null;
        }
        return bm.VH(chVar.j6());
    }

    public static zo Zo(zi ziVar) {
        ui uiVarHw = ziVar.Hw();
        bh bhVar = (bh) uiVarHw.J0("RuntimeVisibleParameterAnnotations");
        zg zgVar = (zg) uiVarHw.J0("RuntimeInvisibleParameterAnnotations");
        return bhVar == null ? zgVar == null ? zo.jw : zgVar.j6() : zgVar == null ? bhVar.j6() : zo.sG(bhVar.j6(), zgVar.j6());
    }

    private static wo gn(oi oiVar) {
        zq zqVarJ8 = oiVar.J8();
        aj ajVarEQ = oiVar.EQ();
        int size = ajVarEQ.size();
        wo woVar = new wo(zqVarJ8, xo.EMBEDDED);
        boolean z = false;
        for (int i = 0; i < size; i++) {
            zi ziVar = ajVarEQ.get(i);
            og ogVar = (og) ziVar.Hw().J0("AnnotationDefault");
            if (ogVar != null) {
                woVar.BT(new ap(ziVar.v5().QX(), ogVar.j6()));
                z = true;
            }
        }
        if (!z) {
            return null;
        }
        woVar.Mr();
        return bm.j6(woVar);
    }

    public static yo j6(ui uiVar) {
        yo yoVarDW = DW(uiVar);
        wo woVarVH = VH(uiVar);
        return woVarVH != null ? yo.KD(yoVarDW, woVarVH) : yoVarDW;
    }

    private static yo tp(zq zqVar, ui uiVar, boolean z) {
        ug ugVar = (ug) uiVar.J0("InnerClasses");
        if (ugVar == null) {
            return null;
        }
        jh jhVarJ6 = ugVar.j6();
        int size = jhVarJ6.size();
        ArrayList arrayList = new ArrayList();
        jh.a aVar = null;
        for (int i = 0; i < size; i++) {
            jh.a aVarSG = jhVarJ6.sG(i);
            zq zqVarDW = aVarSG.DW();
            if (zqVarDW.equals(zqVar)) {
                aVar = aVarSG;
            } else if (zqVar.equals(aVarSG.Hw())) {
                arrayList.add(zqVarDW.J0());
            }
        }
        int size2 = arrayList.size();
        if (aVar == null && size2 == 0) {
            return null;
        }
        yo yoVar = new yo();
        if (aVar != null) {
            yoVar.BT(bm.v5(aVar.FH(), aVar.j6()));
            if (z) {
                if (aVar.Hw() == null) {
                    throw new nt("Ignoring InnerClasses attribute for an anonymous inner class\n(" + zqVar.Zo() + ") that doesn't come with an\nassociated EnclosingMethod attribute. This class was probably produced by a\ncompiler that did not target the modern .class file format. The recommended\nsolution is to recompile the class from source, using an up-to-date compiler\nand without specifying any \"-target\" type options. The consequence of ignoring\nthis warning is that reflective operations on this class will incorrectly\nindicate that it is *not* an inner class.");
                }
                yoVar.BT(bm.FH(aVar.Hw()));
            }
        }
        if (size2 != 0) {
            er erVar = new er(size2);
            for (int i2 = 0; i2 < size2; i2++) {
                erVar.Qq(i2, (fr) arrayList.get(i2));
            }
            erVar.Mr();
            yoVar.BT(bm.Zo(erVar));
        }
        yoVar.Mr();
        return yoVar;
    }

    private static wo u7(ui uiVar) {
        sg sgVar = (sg) uiVar.J0("EnclosingMethod");
        if (sgVar == null) {
            return null;
        }
        zq zqVarJ6 = sgVar.j6();
        wq wqVarFH = sgVar.FH();
        return wqVarFH == null ? bm.FH(zqVarJ6) : bm.Hw(new vq(zqVarJ6, wqVarFH));
    }

    public static yo v5(zi ziVar) {
        yo yoVarJ6 = j6(ziVar.Hw());
        hr hrVarHw = Hw(ziVar);
        return hrVarHw.size() != 0 ? yo.KD(yoVarJ6, bm.gn(hrVarHw)) : yoVarJ6;
    }
}
