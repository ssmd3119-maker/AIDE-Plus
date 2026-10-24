package abcd;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes.dex */
public class z00 {
    static DateFormat j6 = new SimpleDateFormat("MM-dd-yy HH:mm");

    public static void DW(h00 h00Var) {
        h00Var.Hw(" Length   Method    Size  Ratio   Date   Time   CRC-32    Name");
        h00Var.Hw("--------  ------  ------- -----   ----   ----   ------    ----");
    }

    public static void j6(h00 h00Var, v00 v00Var) {
        int iJ8 = v00Var.J8() > 0 ? ((v00Var.J8() - v00Var.FH()) * 100) / v00Var.J8() : 0;
        Object[] objArr = new Object[7];
        objArr[0] = Integer.valueOf(v00Var.J8());
        objArr[1] = v00Var.Hw() == 0 ? "Stored" : "Defl:N";
        objArr[2] = Integer.valueOf(v00Var.FH());
        objArr[3] = Integer.valueOf(iJ8);
        objArr[4] = j6.format(new Date(v00Var.Ws()));
        objArr[5] = Integer.valueOf(v00Var.Zo());
        objArr[6] = v00Var.we();
        h00Var.Hw(String.format("%8d  %6s %8d %4d%% %s  %08x  %s", objArr));
    }
}
