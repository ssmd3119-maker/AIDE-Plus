package abcd;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

/* loaded from: classes.dex */
public class ej0 extends ai0 {
    private byte[] WB;

    public ej0(String str) {
        this.WB = iq0.Hw(str);
        try {
            QX();
        } catch (ParseException e) {
            throw new IllegalArgumentException("invalid date string: " + e.getMessage());
        }
    }

    private String J8() {
        String str;
        TimeZone timeZone = TimeZone.getDefault();
        int rawOffset = timeZone.getRawOffset();
        if (rawOffset < 0) {
            rawOffset = -rawOffset;
            str = "-";
        } else {
            str = "+";
        }
        int i = rawOffset / 3600000;
        int i2 = (rawOffset - (((i * 60) * 60) * 1000)) / 60000;
        try {
            if (timeZone.useDaylightTime() && timeZone.inDaylightTime(QX())) {
                i += str.equals("+") ? 1 : -1;
            }
        } catch (ParseException unused) {
        }
        return "GMT" + str + Ws(i) + ":" + Ws(i2);
    }

    private String Ws(int i) {
        if (i >= 10) {
            return Integer.toString(i);
        }
        return "0" + i;
    }

    private boolean aM() {
        int i = 0;
        while (true) {
            byte[] bArr = this.WB;
            if (i == bArr.length) {
                return false;
            }
            if (bArr[i] == 46 && i == 14) {
                return true;
            }
            i++;
        }
    }

    @Override // abcd.ai0
    public boolean EQ() {
        return false;
    }

    public Date QX() {
        SimpleDateFormat simpleDateFormat;
        char cCharAt;
        String strDW = iq0.DW(this.WB);
        if (strDW.endsWith("Z")) {
            simpleDateFormat = aM() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS'Z'") : new SimpleDateFormat("yyyyMMddHHmmss'Z'");
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        } else if (strDW.indexOf(45) > 0 || strDW.indexOf(43) > 0) {
            strDW = XL();
            simpleDateFormat = aM() ? new SimpleDateFormat("yyyyMMddHHmmss.SSSz") : new SimpleDateFormat("yyyyMMddHHmmssz");
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        } else {
            simpleDateFormat = aM() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS") : new SimpleDateFormat("yyyyMMddHHmmss");
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, TimeZone.getDefault().getID()));
        }
        if (aM()) {
            String strSubstring = strDW.substring(14);
            int i = 1;
            while (i < strSubstring.length() && '0' <= (cCharAt = strSubstring.charAt(i)) && cCharAt <= '9') {
                i++;
            }
            int i2 = i - 1;
            if (i2 > 3) {
                strDW = String.valueOf(strDW.substring(0, 14)) + (String.valueOf(strSubstring.substring(0, 4)) + strSubstring.substring(i));
            } else if (i2 == 1) {
                strDW = String.valueOf(strDW.substring(0, 14)) + (String.valueOf(strSubstring.substring(0, i)) + "00" + strSubstring.substring(i));
            } else if (i2 == 2) {
                strDW = String.valueOf(strDW.substring(0, 14)) + (String.valueOf(strSubstring.substring(0, i)) + "0" + strSubstring.substring(i));
            }
        }
        return simpleDateFormat.parse(strDW);
    }

    @Override // abcd.ai0
    public boolean VH(ai0 ai0Var) {
        if (ai0Var instanceof ej0) {
            return dq0.j6(this.WB, ((ej0) ai0Var).WB);
        }
        return false;
    }

    public String XL() {
        String strDW = iq0.DW(this.WB);
        if (strDW.charAt(strDW.length() - 1) == 'Z') {
            return String.valueOf(strDW.substring(0, strDW.length() - 1)) + "GMT+00:00";
        }
        int length = strDW.length() - 5;
        char cCharAt = strDW.charAt(length);
        if (cCharAt == '-' || cCharAt == '+') {
            StringBuilder sb = new StringBuilder(String.valueOf(strDW.substring(0, length)));
            sb.append("GMT");
            int i = length + 3;
            sb.append(strDW.substring(length, i));
            sb.append(":");
            sb.append(strDW.substring(i));
            return sb.toString();
        }
        int length2 = strDW.length() - 3;
        char cCharAt2 = strDW.charAt(length2);
        if (cCharAt2 != '-' && cCharAt2 != '+') {
            return String.valueOf(strDW) + J8();
        }
        return String.valueOf(strDW.substring(0, length2)) + "GMT" + strDW.substring(length2) + ":00";
    }

    @Override // abcd.ai0
    public void gn(yh0 yh0Var) {
        yh0Var.VH(24, this.WB);
    }

    @Override // abcd.uh0
    public int hashCode() {
        return dq0.Hw(this.WB);
    }

    @Override // abcd.ai0
    public int u7() {
        int length = this.WB.length;
        return jk0.j6(length) + 1 + length;
    }

    public ej0(byte[] bArr) {
        this.WB = bArr;
    }
}
