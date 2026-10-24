package abcd;

/* loaded from: classes.dex */
public class ik0 {
    private int DW = 0;
    private String j6;

    public ik0(String str) {
        this.j6 = str;
    }

    public String DW() {
        int i = this.DW;
        if (i == -1) {
            return null;
        }
        int iIndexOf = this.j6.indexOf(46, i);
        if (iIndexOf == -1) {
            String strSubstring = this.j6.substring(this.DW);
            this.DW = -1;
            return strSubstring;
        }
        String strSubstring2 = this.j6.substring(this.DW, iIndexOf);
        this.DW = iIndexOf + 1;
        return strSubstring2;
    }

    public boolean j6() {
        return this.DW != -1;
    }
}
