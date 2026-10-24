package abcd;

import abcd.os;
import java.io.IOException;

/* loaded from: classes.dex */
public class si extends li {
    public static final si j6 = new si();

    private ti EQ(oi oiVar, int i, int i2, cj cjVar) {
        if (i2 < 2) {
            a8();
            throw null;
        }
        os osVarHw = oiVar.Hw();
        int iJ8 = osVarHw.J8(i);
        if (cjVar != null) {
            cjVar.FH(osVarHw, i, 2, "local_variable_table_length: " + xs.VH(iJ8));
        }
        return new wg(J0(osVarHw.aM(i + 2, i + i2), oiVar.v5(), cjVar, iJ8, false));
    }

    private ti FH(oi oiVar, int i, int i2, cj cjVar) {
        if (i2 >= 2) {
            return new og(new ki(oiVar, i, i2, cjVar).tp(), i2);
        }
        a8();
        throw null;
    }

    private ti Hw(oi oiVar, int i, int i2, cj cjVar) {
        if (i2 < 12) {
            a8();
            throw null;
        }
        os osVarHw = oiVar.Hw();
        cq cqVarV5 = oiVar.v5();
        int iJ8 = osVarHw.J8(i);
        int i3 = i + 2;
        int iJ82 = osVarHw.J8(i3);
        int i4 = i + 4;
        int iU7 = osVarHw.u7(i4);
        if (cjVar != null) {
            cjVar.FH(osVarHw, i, 2, "max_stack: " + xs.VH(iJ8));
            cjVar.FH(osVarHw, i3, 2, "max_locals: " + xs.VH(iJ82));
            cjVar.FH(osVarHw, i4, 4, "code_length: " + xs.tp(iU7));
        }
        int i5 = i + 8;
        int i6 = i2 - 8;
        if (i6 < iU7 + 4) {
            lg();
            throw null;
        }
        int i7 = i5 + iU7;
        int i8 = i6 - iU7;
        rh rhVar = new rh(osVarHw.aM(i5, i7), cqVarV5);
        if (cjVar != null) {
            rhVar.DW(new ni(rhVar.FH(), cjVar));
        }
        int iJ83 = osVarHw.J8(i7);
        ph phVar = iJ83 == 0 ? ph.jw : new ph(iJ83);
        if (cjVar != null) {
            cjVar.FH(osVarHw, i7, 2, "exception_table_length: " + xs.VH(iJ83));
        }
        int i9 = i7 + 2;
        int i10 = i8 - 2;
        if (i10 < (iJ83 * 8) + 2) {
            lg();
            throw null;
        }
        for (int i11 = 0; i11 < iJ83; i11++) {
            if (cjVar != null) {
                cjVar.DW(1);
            }
            int iJ84 = osVarHw.J8(i9);
            int iJ85 = osVarHw.J8(i9 + 2);
            int iJ86 = osVarHw.J8(i9 + 4);
            zq zqVar = (zq) cqVarV5.QX(osVarHw.J8(i9 + 6));
            phVar.Sf(i11, iJ84, iJ85, iJ86, zqVar);
            if (cjVar != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(xs.VH(iJ84));
                sb.append("..");
                sb.append(xs.VH(iJ85));
                sb.append(" -> ");
                sb.append(xs.VH(iJ86));
                sb.append(" ");
                sb.append(zqVar == null ? "<any>" : zqVar.Zo());
                cjVar.FH(osVarHw, i9, 8, sb.toString());
            }
            i9 += 8;
            i10 -= 8;
            if (cjVar != null) {
                cjVar.DW(-1);
            }
        }
        phVar.Mr();
        mi miVar = new mi(oiVar, 3, i9, this);
        miVar.v5(cjVar);
        dj djVarDW = miVar.DW();
        djVarDW.Mr();
        int iJ6 = miVar.j6() - i9;
        if (iJ6 == i10) {
            return new pg(iJ8, iJ82, rhVar, phVar, djVarDW);
        }
        U2(iJ6 + (i9 - i));
        throw null;
    }

    private wh J0(os osVar, cq cqVar, cj cjVar, int i, boolean z) throws IOException {
        yq yqVar;
        yq yqVar2;
        int i2 = i * 10;
        if (osVar.XL() != i2) {
            U2(i2 + 2);
            throw null;
        }
        os.a aVarWs = osVar.Ws();
        wh whVar = new wh(i);
        for (int i3 = 0; i3 < i; i3++) {
            try {
                int unsignedShort = aVarWs.readUnsignedShort();
                int unsignedShort2 = aVarWs.readUnsignedShort();
                int unsignedShort3 = aVarWs.readUnsignedShort();
                int unsignedShort4 = aVarWs.readUnsignedShort();
                int unsignedShort5 = aVarWs.readUnsignedShort();
                yq yqVar3 = (yq) cqVar.get(unsignedShort3);
                yq yqVar4 = (yq) cqVar.get(unsignedShort4);
                if (z) {
                    yqVar2 = null;
                    yqVar = yqVar4;
                } else {
                    yqVar = null;
                    yqVar2 = yqVar4;
                }
                whVar.Mz(i3, unsignedShort, unsignedShort2, yqVar3, yqVar2, yqVar, unsignedShort5);
                if (cjVar != null) {
                    cjVar.FH(osVar, i3 * 10, 10, xs.VH(unsignedShort) + ".." + xs.VH(unsignedShort + unsignedShort2) + " " + xs.VH(unsignedShort5) + " " + yqVar3.Zo() + " " + yqVar4.Zo());
                }
            } catch (IOException e) {
                throw new RuntimeException("shouldn't happen", e);
            }
        }
        whVar.Mr();
        return whVar;
    }

    private ti J8(oi oiVar, int i, int i2, cj cjVar) {
        if (i2 >= 2) {
            return new yg(new ki(oiVar, i, i2, cjVar).FH(xo.BUILD), i2);
        }
        a8();
        throw null;
    }

    private ti Mr(oi oiVar, int i, int i2, cj cjVar) {
        if (i2 == 0) {
            return new eh();
        }
        U2(0);
        throw null;
    }

    private ti QX(oi oiVar, int i, int i2, cj cjVar) {
        if (i2 >= 2) {
            return new ah(new ki(oiVar, i, i2, cjVar).FH(xo.RUNTIME), i2);
        }
        a8();
        throw null;
    }

    private static ti U2(int i) {
        throw new bj("bad attribute length; expected length " + xs.tp(i));
    }

    private ti VH(oi oiVar, int i, int i2, cj cjVar) {
        if (i2 != 4) {
            U2(4);
            throw null;
        }
        os osVarHw = oiVar.Hw();
        cq cqVarV5 = oiVar.v5();
        zq zqVar = (zq) cqVarV5.get(osVarHw.J8(i));
        int i3 = i + 2;
        wq wqVar = (wq) cqVarV5.QX(osVarHw.J8(i3));
        sg sgVar = new sg(zqVar, wqVar);
        if (cjVar != null) {
            cjVar.FH(osVarHw, i, 2, "class: " + zqVar);
            cjVar.FH(osVarHw, i3, 2, "method: " + oi.a8(wqVar));
        }
        return sgVar;
    }

    private ti Ws(oi oiVar, int i, int i2, cj cjVar) {
        if (i2 >= 2) {
            return new zg(new ki(oiVar, i, i2, cjVar).gn(xo.BUILD), i2);
        }
        a8();
        throw null;
    }

    private ti XL(oi oiVar, int i, int i2, cj cjVar) {
        if (i2 >= 2) {
            return new bh(new ki(oiVar, i, i2, cjVar).gn(xo.RUNTIME), i2);
        }
        a8();
        throw null;
    }

    private ti Zo(oi oiVar, int i, int i2, cj cjVar) {
        if (i2 == 0) {
            return new rg();
        }
        U2(0);
        throw null;
    }

    private static ti a8() {
        throw new bj("severely truncated attribute");
    }

    private ti aM(oi oiVar, int i, int i2, cj cjVar) {
        if (i2 != 2) {
            U2(2);
            throw null;
        }
        os osVarHw = oiVar.Hw();
        yq yqVar = (yq) oiVar.v5().get(osVarHw.J8(i));
        ch chVar = new ch(yqVar);
        if (cjVar != null) {
            cjVar.FH(osVarHw, i, 2, "signature: " + yqVar);
        }
        return chVar;
    }

    private ti gn(oi oiVar, int i, int i2, cj cjVar) {
        if (i2 < 2) {
            a8();
            throw null;
        }
        os osVarHw = oiVar.Hw();
        int iJ8 = osVarHw.J8(i);
        if (cjVar != null) {
            cjVar.FH(osVarHw, i, 2, "number_of_exceptions: " + xs.VH(iJ8));
        }
        int i3 = i + 2;
        int i4 = iJ8 * 2;
        if (i2 - 2 == i4) {
            return new tg(oiVar.QX(i3, iJ8));
        }
        U2(i4 + 2);
        throw null;
    }

    private ti j3(oi oiVar, int i, int i2, cj cjVar) {
        if (i2 != 2) {
            U2(2);
            throw null;
        }
        os osVarHw = oiVar.Hw();
        yq yqVar = (yq) oiVar.v5().get(osVarHw.J8(i));
        dh dhVar = new dh(yqVar);
        if (cjVar != null) {
            cjVar.FH(osVarHw, i, 2, "source: " + yqVar);
        }
        return dhVar;
    }

    private static ti lg() {
        throw new bj("truncated attribute");
    }

    private ti tp(oi oiVar, int i, int i2, cj cjVar) {
        if (i2 < 2) {
            a8();
            throw null;
        }
        os osVarHw = oiVar.Hw();
        int iJ8 = osVarHw.J8(i);
        if (cjVar != null) {
            cjVar.FH(osVarHw, i, 2, "line_number_table_length: " + xs.VH(iJ8));
        }
        int i3 = i + 2;
        int i4 = iJ8 * 4;
        if (i2 - 2 != i4) {
            U2(i4 + 2);
            throw null;
        }
        vh vhVar = new vh(iJ8);
        for (int i5 = 0; i5 < iJ8; i5++) {
            int iJ82 = osVarHw.J8(i3);
            int iJ83 = osVarHw.J8(i3 + 2);
            vhVar.vJ(i5, iJ82, iJ83);
            if (cjVar != null) {
                cjVar.FH(osVarHw, i3, 4, xs.VH(iJ82) + " " + iJ83);
            }
            i3 += 4;
        }
        vhVar.Mr();
        return new vg(vhVar);
    }

    private ti u7(oi oiVar, int i, int i2, cj cjVar) {
        if (i2 < 2) {
            a8();
            throw null;
        }
        os osVarHw = oiVar.Hw();
        cq cqVarV5 = oiVar.v5();
        int iJ8 = osVarHw.J8(i);
        if (cjVar != null) {
            cjVar.FH(osVarHw, i, 2, "number_of_classes: " + xs.VH(iJ8));
        }
        int i3 = i + 2;
        int i4 = iJ8 * 8;
        if (i2 - 2 != i4) {
            U2(i4 + 2);
            throw null;
        }
        jh jhVar = new jh(iJ8);
        for (int i5 = 0; i5 < iJ8; i5++) {
            int iJ82 = osVarHw.J8(i3);
            int i6 = i3 + 2;
            int iJ83 = osVarHw.J8(i6);
            int i7 = i3 + 4;
            int iJ84 = osVarHw.J8(i7);
            int i8 = i3 + 6;
            int iJ85 = osVarHw.J8(i8);
            zq zqVar = (zq) cqVarV5.get(iJ82);
            zq zqVar2 = (zq) cqVarV5.QX(iJ83);
            yq yqVar = (yq) cqVarV5.QX(iJ84);
            jhVar.ef(i5, zqVar, zqVar2, yqVar, iJ85);
            if (cjVar != null) {
                cjVar.FH(osVarHw, i3, 2, "inner_class: " + oi.a8(zqVar));
                cjVar.FH(osVarHw, i6, 2, "  outer_class: " + oi.a8(zqVar2));
                cjVar.FH(osVarHw, i7, 2, "  name: " + oi.a8(yqVar));
                cjVar.FH(osVarHw, i8, 2, "  access_flags: " + bp.Hw(iJ85));
            }
            i3 += 8;
        }
        jhVar.Mr();
        return new ug(jhVar);
    }

    private ti v5(oi oiVar, int i, int i2, cj cjVar) {
        if (i2 != 2) {
            U2(2);
            throw null;
        }
        os osVarHw = oiVar.Hw();
        br brVar = (br) oiVar.v5().get(osVarHw.J8(i));
        qg qgVar = new qg(brVar);
        if (cjVar != null) {
            cjVar.FH(osVarHw, i, 2, "value: " + brVar);
        }
        return qgVar;
    }

    private ti we(oi oiVar, int i, int i2, cj cjVar) {
        if (i2 < 2) {
            a8();
            throw null;
        }
        os osVarHw = oiVar.Hw();
        int iJ8 = osVarHw.J8(i);
        if (cjVar != null) {
            cjVar.FH(osVarHw, i, 2, "local_variable_type_table_length: " + xs.VH(iJ8));
        }
        return new xg(J0(osVarHw.aM(i + 2, i + i2), oiVar.v5(), cjVar, iJ8, true));
    }

    @Override // abcd.li
    public ti DW(oi oiVar, int i, String str, int i2, int i3, cj cjVar) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (str == "LineNumberTable") {
                            return tp(oiVar, i2, i3, cjVar);
                        }
                        if (str == "LocalVariableTable") {
                            return EQ(oiVar, i2, i3, cjVar);
                        }
                        if (str == "LocalVariableTypeTable") {
                            return we(oiVar, i2, i3, cjVar);
                        }
                    }
                } else {
                    if (str == "AnnotationDefault") {
                        return FH(oiVar, i2, i3, cjVar);
                    }
                    if (str == "Code") {
                        return Hw(oiVar, i2, i3, cjVar);
                    }
                    if (str == "Deprecated") {
                        return Zo(oiVar, i2, i3, cjVar);
                    }
                    if (str == "Exceptions") {
                        return gn(oiVar, i2, i3, cjVar);
                    }
                    if (str == "RuntimeInvisibleAnnotations") {
                        return J8(oiVar, i2, i3, cjVar);
                    }
                    if (str == "RuntimeVisibleAnnotations") {
                        return QX(oiVar, i2, i3, cjVar);
                    }
                    if (str == "RuntimeInvisibleParameterAnnotations") {
                        return Ws(oiVar, i2, i3, cjVar);
                    }
                    if (str == "RuntimeVisibleParameterAnnotations") {
                        return XL(oiVar, i2, i3, cjVar);
                    }
                    if (str == "Signature") {
                        return aM(oiVar, i2, i3, cjVar);
                    }
                    if (str == "Synthetic") {
                        return Mr(oiVar, i2, i3, cjVar);
                    }
                }
            } else {
                if (str == "ConstantValue") {
                    return v5(oiVar, i2, i3, cjVar);
                }
                if (str == "Deprecated") {
                    return Zo(oiVar, i2, i3, cjVar);
                }
                if (str == "RuntimeInvisibleAnnotations") {
                    return J8(oiVar, i2, i3, cjVar);
                }
                if (str == "RuntimeVisibleAnnotations") {
                    return QX(oiVar, i2, i3, cjVar);
                }
                if (str == "Signature") {
                    return aM(oiVar, i2, i3, cjVar);
                }
                if (str == "Synthetic") {
                    return Mr(oiVar, i2, i3, cjVar);
                }
            }
        } else {
            if (str == "Deprecated") {
                return Zo(oiVar, i2, i3, cjVar);
            }
            if (str == "EnclosingMethod") {
                return VH(oiVar, i2, i3, cjVar);
            }
            if (str == "InnerClasses") {
                return u7(oiVar, i2, i3, cjVar);
            }
            if (str == "RuntimeInvisibleAnnotations") {
                return J8(oiVar, i2, i3, cjVar);
            }
            if (str == "RuntimeVisibleAnnotations") {
                return QX(oiVar, i2, i3, cjVar);
            }
            if (str == "Synthetic") {
                return Mr(oiVar, i2, i3, cjVar);
            }
            if (str == "Signature") {
                return aM(oiVar, i2, i3, cjVar);
            }
            if (str == "SourceFile") {
                return j3(oiVar, i2, i3, cjVar);
            }
        }
        return super.DW(oiVar, i, str, i2, i3, cjVar);
    }
}
