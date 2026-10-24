package groovyjarjarantlr;

/* loaded from: classes.dex */
public class ANTLRHashString {
    private char[] DW;
    private int FH;
    private CharScanner Hw;
    private String j6;

    public ANTLRHashString(CharScanner charScanner) {
        this.Hw = charScanner;
    }

    private final int DW() {
        String str = this.j6;
        return str != null ? str.length() : this.FH;
    }

    private final char j6(int i) {
        String str = this.j6;
        return str != null ? str.charAt(i) : this.DW[i];
    }

    public void FH(char[] cArr, int i) {
        this.DW = cArr;
        this.FH = i;
        this.j6 = null;
    }

    public void Hw(String str) {
        this.j6 = str;
        this.DW = null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ANTLRHashString) && !(obj instanceof String)) {
            return false;
        }
        ANTLRHashString aNTLRHashString = obj instanceof String ? new ANTLRHashString((String) obj, this.Hw) : (ANTLRHashString) obj;
        int iDW = DW();
        if (aNTLRHashString.DW() != iDW) {
            return false;
        }
        if (this.Hw.v5()) {
            for (int i = 0; i < iDW; i++) {
                if (j6(i) != aNTLRHashString.j6(i)) {
                    return false;
                }
            }
            return true;
        }
        for (int i2 = 0; i2 < iDW; i2++) {
            if (this.Hw.vy(j6(i2)) != this.Hw.vy(aNTLRHashString.j6(i2))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int iVy;
        int iDW = DW();
        int i = 0;
        if (this.Hw.v5()) {
            iVy = 0;
            while (i < iDW) {
                iVy = (iVy * 151) + j6(i);
                i++;
            }
        } else {
            iVy = 0;
            while (i < iDW) {
                iVy = (iVy * 151) + this.Hw.vy(j6(i));
                i++;
            }
        }
        return iVy;
    }

    public ANTLRHashString(String str, CharScanner charScanner) {
        this.Hw = charScanner;
        Hw(str);
    }
}
