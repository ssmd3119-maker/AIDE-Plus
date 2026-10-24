package abcd;

import abcd.dz;
import abcd.sz;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public class kz {
    private static xz j6 = new xz();
    private static xz DW = new xz();
    private static Map<String, lz> FH = new HashMap();
    private static lz Hw = new lz(60000, 1000);

    public static boolean DW(long j) {
        return ez.DW(j);
    }

    private static String FH() {
        String string = by.j6().J8().toString();
        if ("".equals(string)) {
            return null;
        }
        return string;
    }

    public static void Hw(mz mzVar, long j, jy jyVar) {
        if (!FH.containsKey(mzVar.FH())) {
            FH.put(mzVar.FH(), new lz(60000L, 100L));
        }
        if (FH.get(mzVar.FH()).j6() && Hw.j6()) {
            b00.j6("Output", "(" + j + ") Event: " + mzVar.FH() + " " + jyVar.toString());
            sz.a aVarV5 = sz.v5(j, jyVar.FH);
            if (aVarV5.DW) {
                b00.j6("Properties", "Add properties for new session");
                List<dz.b> listDW = dz.DW();
                if (listDW.size() > 1000) {
                    listDW = listDW.subList(listDW.size() - 1000, listDW.size());
                }
                for (dz.b bVar : listDW) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Property ");
                    sb.append(bVar.DW);
                    sb.append(" ");
                    sb.append(oz.J8(bVar.DW));
                    sb.append(" ");
                    sb.append(bVar.Hw < aVarV5.Hw);
                    b00.j6("Properties", sb.toString());
                    if (oz.J8(bVar.DW) && bVar.Hw < aVarV5.Hw) {
                        ez.j6(new gz(e00.j6(UUID.randomUUID()), bVar.DW, bVar.FH, j6(j), mzVar.Hw(), by.j6().Mr(), by.j6().VH(), by.j6().a8(), sz.FH(), aVarV5.j6, FH(), bVar.j6, bVar.Hw, -1L));
                    }
                }
            }
            String strJ6 = e00.j6(UUID.randomUUID());
            ez.j6(new gz(strJ6, mzVar.FH(), jyVar, j6(j), mzVar.Hw(), by.j6().Mr(), by.j6().VH(), by.j6().a8(), sz.FH(), aVarV5.j6, FH(), null, -1L, -1L));
            dz.b bVarZo = dz.Zo(strJ6, mzVar.FH(), jyVar, j);
            if (bVarZo != null) {
                sz.a aVarDW = sz.DW();
                if (bVarZo == null || aVarDW == null || bVarZo.Hw >= aVarDW.Hw) {
                    return;
                }
                ez.j6(new gz(e00.j6(UUID.randomUUID()), bVarZo.DW, bVarZo.FH, (aVarDW.FH * 1000) - 10000, mzVar.Hw(), by.j6().Mr(), by.j6().VH(), by.j6().a8(), sz.FH(), aVarDW.j6, FH(), bVarZo.j6, bVarZo.Hw, -1L));
            }
        }
    }

    public static void Zo(mz mzVar, long j, Throwable th) {
        b00.DW("Output", "(" + j + ") Event error: " + mzVar.FH(), th);
    }

    private static long j6(long j) {
        return !j6.DW(j) ? j6.j6(j) : DW.j6(j);
    }

    public static void v5(mz mzVar, long j, long j2) {
        b00.j6("Output", "(" + j2 + ") Event recording start: " + mzVar.FH());
        ez.j6(new gz(e00.j6(UUID.randomUUID()), mzVar.FH(), new jy(), 1000 * j, mzVar.Hw(), by.j6().Mr(), by.j6().VH(), by.j6().a8(), sz.FH(), e00.j6(UUID.randomUUID()), FH(), null, -1L, j2));
    }
}
