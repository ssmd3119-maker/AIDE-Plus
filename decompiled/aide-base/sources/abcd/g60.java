package abcd;

/* loaded from: classes.dex */
public class g60 {
    private String j6;
    private boolean DW = false;
    private boolean FH = false;
    private boolean Hw = false;
    private z50 v5 = null;

    public g60(String str) {
        this.j6 = str;
        Hw();
    }

    private void Hw() {
        int i;
        int length = this.j6.length();
        if (this.j6.startsWith("!")) {
            this.DW = true;
            i = 1;
        } else {
            i = 0;
        }
        if (this.j6.endsWith("/")) {
            length--;
            this.Hw = true;
        }
        String strSubstring = this.j6.substring(i, length);
        this.j6 = strSubstring;
        if (!strSubstring.contains("/")) {
            this.FH = true;
        } else if (!this.j6.startsWith("/")) {
            this.j6 = "/" + this.j6;
        }
        if (this.j6.contains("*") || this.j6.contains("?") || this.j6.contains("[")) {
            try {
                this.v5 = new z50(this.j6, (Character) '/');
            } catch (m40 unused) {
            }
        }
    }

    private boolean j6(boolean z, int i, int i2) {
        return i < i2 - 1 || !this.Hw || z;
    }

    public boolean DW() {
        return !this.DW;
    }

    public boolean FH(String str, boolean z) {
        if (!str.startsWith("/")) {
            str = "/" + str;
        }
        z50 z50Var = this.v5;
        if (z50Var != null) {
            z50Var.j6(str);
            if (this.v5.VH()) {
                return true;
            }
            String[] strArrSplit = str.split("/");
            if (this.FH) {
                for (int i = 0; i < strArrSplit.length; i++) {
                    String str2 = strArrSplit[i];
                    this.v5.u7();
                    this.v5.j6(str2);
                    if (this.v5.VH() && j6(z, i, strArrSplit.length)) {
                        return true;
                    }
                }
            } else {
                this.v5.u7();
                for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                    String str3 = strArrSplit[i2];
                    if (str3.length() > 0) {
                        this.v5.j6("/" + str3);
                    }
                    if (this.v5.VH() && j6(z, i2, strArrSplit.length)) {
                        return true;
                    }
                }
            }
        } else {
            if (str.equals(this.j6)) {
                return !this.Hw || z;
            }
            if (str.startsWith(String.valueOf(this.j6) + "/")) {
                return true;
            }
            if (this.FH) {
                String[] strArrSplit2 = str.split("/");
                for (int i3 = 0; i3 < strArrSplit2.length; i3++) {
                    if (strArrSplit2[i3].equals(this.j6) && j6(z, i3, strArrSplit2.length)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
