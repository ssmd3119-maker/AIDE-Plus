package abcd;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public class i70 implements Serializable {
    private final String WB;
    private final int fY;
    private final long jw;
    private final String mb;

    public i70(p70 p70Var) {
        x70 x70Var = (x70) p70Var.gn().tp(x70.v5);
        this.WB = x70Var.DW();
        this.mb = x70Var.j6();
        this.jw = og0.FH().j6();
        this.fY = og0.FH().Zo(this.jw);
    }

    private void j6(StringBuilder sb) {
        char c;
        int i = this.fY;
        if (i < 0) {
            c = '-';
            i = -i;
        } else {
            c = '+';
        }
        int i2 = i / 60;
        int i3 = i % 60;
        sb.append(c);
        if (i2 < 10) {
            sb.append('0');
        }
        sb.append(i2);
        if (i3 < 10) {
            sb.append('0');
        }
        sb.append(i3);
    }

    public String DW() {
        return this.mb;
    }

    public String FH() {
        return this.WB;
    }

    public TimeZone Hw() {
        StringBuilder sb = new StringBuilder(8);
        sb.append("GMT");
        j6(sb);
        return TimeZone.getTimeZone(sb.toString());
    }

    public boolean equals(Object obj) {
        if (obj instanceof i70) {
            i70 i70Var = (i70) obj;
            if (FH().equals(i70Var.FH()) && DW().equals(i70Var.DW()) && this.jw / 1000 == i70Var.jw / 1000) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (DW().hashCode() * 31) + ((int) (this.jw / 1000));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE MMM d HH:mm:ss yyyy Z", Locale.US);
        simpleDateFormat.setTimeZone(Hw());
        sb.append("PersonIdent[");
        sb.append(FH());
        sb.append(", ");
        sb.append(DW());
        sb.append(", ");
        sb.append(simpleDateFormat.format(Long.valueOf(this.jw)));
        sb.append("]");
        return sb.toString();
    }

    public String v5() {
        StringBuilder sb = new StringBuilder();
        sb.append(FH());
        sb.append(" <");
        sb.append(DW());
        sb.append("> ");
        sb.append(this.jw / 1000);
        sb.append(' ');
        j6(sb);
        return sb.toString();
    }

    public i70(i70 i70Var) {
        this(i70Var.FH(), i70Var.DW());
    }

    public i70(String str, String str2) {
        this.WB = str;
        this.mb = str2;
        this.jw = og0.FH().j6();
        this.fY = og0.FH().Zo(this.jw);
    }

    public i70(String str, String str2, long j, int i) {
        this.WB = str;
        this.mb = str2;
        this.jw = j;
        this.fY = i;
    }
}
