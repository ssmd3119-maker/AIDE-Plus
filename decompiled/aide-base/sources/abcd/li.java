package abcd;

/* loaded from: classes.dex */
public class li {
    public ti DW(oi oiVar, int i, String str, int i2, int i3, cj cjVar) {
        os osVarHw = oiVar.Hw();
        kh khVar = new kh(str, osVarHw, i2, i3, oiVar.v5());
        if (cjVar != null) {
            cjVar.FH(osVarHw, i2, i3, "attribute data");
        }
        return khVar;
    }

    public final ti j6(oi oiVar, int i, int i2, cj cjVar) {
        String str;
        if (oiVar == null) {
            throw new NullPointerException("cf == null");
        }
        if (i < 0 || i >= 4) {
            throw new IllegalArgumentException("bad context");
        }
        yq yqVar = null;
        try {
            os osVarHw = oiVar.Hw();
            cq cqVarV5 = oiVar.v5();
            int iJ8 = osVarHw.J8(i2);
            int i3 = i2 + 2;
            int iU7 = osVarHw.u7(i3);
            yq yqVar2 = (yq) cqVarV5.get(iJ8);
            if (cjVar != null) {
                try {
                    cjVar.FH(osVarHw, i2, 2, "name: " + yqVar2.Zo());
                    cjVar.FH(osVarHw, i3, 4, "length: " + xs.tp(iU7));
                } catch (bj e) {
                    e = e;
                    yqVar = yqVar2;
                    StringBuilder sb = new StringBuilder();
                    sb.append("...while parsing ");
                    if (yqVar != null) {
                        str = yqVar.Zo() + " ";
                    } else {
                        str = "";
                    }
                    sb.append(str);
                    sb.append("attribute at offset ");
                    sb.append(xs.tp(i2));
                    e.j6(sb.toString());
                    throw e;
                }
            }
            return DW(oiVar, i, yqVar2.J0(), i2 + 6, iU7, cjVar);
        } catch (bj e2) {
            e = e2;
        }
    }
}
