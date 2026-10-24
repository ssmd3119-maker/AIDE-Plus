package abcd;

/* loaded from: classes.dex */
public class hz {
    public Long DW;
    public Double FH;
    public Boolean Hw;
    public String j6;

    public static hz DW(double d) {
        hz hzVar = new hz();
        hzVar.FH = Double.valueOf(d);
        return hzVar;
    }

    public static hz FH(long j) {
        hz hzVar = new hz();
        hzVar.DW = Long.valueOf(j);
        return hzVar;
    }

    public static hz Hw(String str) {
        hz hzVar = new hz();
        if (str.length() > 5000) {
            str = str.substring(0, 5000);
        }
        hzVar.j6 = str;
        return hzVar;
    }

    public static hz j6(boolean z) {
        hz hzVar = new hz();
        hzVar.Hw = Boolean.valueOf(z);
        return hzVar;
    }
}
