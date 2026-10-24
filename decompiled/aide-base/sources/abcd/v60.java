package abcd;

import java.util.zip.Inflater;

/* loaded from: classes.dex */
public class v60 {
    private static int DW;
    private static final Inflater[] j6 = new Inflater[4];

    private static synchronized Inflater DW() {
        if (DW <= 0) {
            return null;
        }
        Inflater[] inflaterArr = j6;
        int i = DW - 1;
        DW = i;
        Inflater inflater = inflaterArr[i];
        j6[i] = null;
        return inflater;
    }

    public static void FH(Inflater inflater) {
        if (inflater != null) {
            inflater.reset();
            if (Hw(inflater)) {
                ((i60) inflater).j6();
            }
        }
    }

    private static synchronized boolean Hw(Inflater inflater) {
        if (DW >= 4) {
            return true;
        }
        Inflater[] inflaterArr = j6;
        int i = DW;
        DW = i + 1;
        inflaterArr[i] = inflater;
        return false;
    }

    public static Inflater j6() {
        Inflater inflaterDW = DW();
        return inflaterDW != null ? inflaterDW : new i60();
    }
}
