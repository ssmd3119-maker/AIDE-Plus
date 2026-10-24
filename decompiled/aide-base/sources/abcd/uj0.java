package abcd;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

/* loaded from: classes.dex */
public class uj0 extends ai0 {
    private byte[] WB;

    public uj0(String str) {
        this.WB = iq0.Hw(str);
        try {
            QX();
        } catch (ParseException e) {
            throw new IllegalArgumentException("invalid date string: " + e.getMessage());
        }
    }

    @Override // abcd.ai0
    public boolean EQ() {
        return false;
    }

    public Date J8() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssz");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        return simpleDateFormat.parse(Ws());
    }

    public Date QX() {
        return new SimpleDateFormat("yyMMddHHmmssz").parse(XL());
    }

    @Override // abcd.ai0
    public boolean VH(ai0 ai0Var) {
        if (ai0Var instanceof uj0) {
            return dq0.j6(this.WB, ((uj0) ai0Var).WB);
        }
        return false;
    }

    public String Ws() {
        String strXL = XL();
        if (strXL.charAt(0) < '5') {
            return "20" + strXL;
        }
        return "19" + strXL;
    }

    public String XL() {
        String strDW = iq0.DW(this.WB);
        if (strDW.indexOf(45) < 0 && strDW.indexOf(43) < 0) {
            if (strDW.length() == 11) {
                return String.valueOf(strDW.substring(0, 10)) + "00GMT+00:00";
            }
            return String.valueOf(strDW.substring(0, 12)) + "GMT+00:00";
        }
        int iIndexOf = strDW.indexOf(45);
        if (iIndexOf < 0) {
            iIndexOf = strDW.indexOf(43);
        }
        if (iIndexOf == strDW.length() - 3) {
            strDW = String.valueOf(strDW) + "00";
        }
        if (iIndexOf == 10) {
            return String.valueOf(strDW.substring(0, 10)) + "00GMT" + strDW.substring(10, 13) + ":" + strDW.substring(13, 15);
        }
        return String.valueOf(strDW.substring(0, 12)) + "GMT" + strDW.substring(12, 15) + ":" + strDW.substring(15, 17);
    }

    @Override // abcd.ai0
    public void gn(yh0 yh0Var) {
        yh0Var.FH(23);
        int length = this.WB.length;
        yh0Var.u7(length);
        for (int i = 0; i != length; i++) {
            yh0Var.FH(this.WB[i]);
        }
    }

    @Override // abcd.uh0
    public int hashCode() {
        return dq0.Hw(this.WB);
    }

    public String toString() {
        return iq0.DW(this.WB);
    }

    @Override // abcd.ai0
    public int u7() {
        int length = this.WB.length;
        return jk0.j6(length) + 1 + length;
    }

    public uj0(byte[] bArr) {
        this.WB = bArr;
    }
}
