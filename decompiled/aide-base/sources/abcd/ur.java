package abcd;

import java.util.EnumSet;

/* loaded from: classes.dex */
public class ur {
    private static aq DW = null;
    private static boolean j6 = true;

    public enum a {
        MOVE_PARAM_COMBINER,
        SCCP,
        LITERAL_UPGRADE,
        CONST_COLLECTOR,
        ESCAPE_ANALYSIS
    }

    public static boolean DW() {
        return j6;
    }

    public static up FH(up upVar, int i, boolean z, boolean z2, aq aqVar) {
        return Hw(upVar, i, z, z2, aqVar, EnumSet.allOf(a.class));
    }

    public static up Hw(up upVar, int i, boolean z, boolean z2, aq aqVar, EnumSet<a> enumSet) {
        j6 = z2;
        DW = aqVar;
        ds dsVarJ6 = bs.j6(upVar, i, z);
        Zo(dsVarJ6, enumSet);
        up upVarV5 = ks.v5(dsVarJ6, false);
        return upVarV5.DW().aj() > DW.j6() ? v5(upVar, i, z, enumSet) : upVarV5;
    }

    private static void Zo(ds dsVar, EnumSet<a> enumSet) {
        boolean z;
        if (enumSet.contains(a.MOVE_PARAM_COMBINER)) {
            sr.Hw(dsVar);
        }
        boolean z2 = false;
        if (enumSet.contains(a.SCCP)) {
            yr.FH(dsVar);
            kr.Hw(dsVar);
            z = false;
        } else {
            z = true;
        }
        if (enumSet.contains(a.LITERAL_UPGRADE)) {
            pr.v5(dsVar);
            kr.Hw(dsVar);
            z = false;
        }
        enumSet.remove(a.ESCAPE_ANALYSIS);
        if (enumSet.contains(a.ESCAPE_ANALYSIS)) {
            nr.EQ(dsVar);
            kr.Hw(dsVar);
            z = false;
        }
        if (enumSet.contains(a.CONST_COLLECTOR)) {
            jr.Hw(dsVar);
            kr.Hw(dsVar);
        } else {
            z2 = z;
        }
        if (z2) {
            kr.Hw(dsVar);
        }
        wr.DW(dsVar);
    }

    public static aq j6() {
        return DW;
    }

    private static up v5(up upVar, int i, boolean z, EnumSet<a> enumSet) {
        ds dsVarJ6 = bs.j6(upVar, i, z);
        EnumSet<E> enumSetClone = enumSet.clone();
        enumSetClone.remove(a.CONST_COLLECTOR);
        Zo(dsVarJ6, enumSetClone);
        return ks.v5(dsVarJ6, true);
    }
}
