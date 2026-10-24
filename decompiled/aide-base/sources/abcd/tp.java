package abcd;

import com.aide.uidesigner.ProxyTextView;

/* loaded from: classes.dex */
public final class tp {
    private final fr DW;
    private final hr FH;
    private final hr Hw;
    private final String VH;
    private final boolean Zo;
    private final int j6;
    private final int v5;

    public tp(int i, fr frVar, hr hrVar, hr hrVar2, int i2, boolean z, String str) {
        if (frVar == null) {
            throw new NullPointerException("result == null");
        }
        if (hrVar == null) {
            throw new NullPointerException("sources == null");
        }
        if (hrVar2 == null) {
            throw new NullPointerException("exceptions == null");
        }
        if (i2 < 1 || i2 > 6) {
            throw new IllegalArgumentException("bogus branchingness");
        }
        if (hrVar2.size() != 0 && i2 != 6) {
            throw new IllegalArgumentException("exceptions / branchingness mismatch");
        }
        this.j6 = i;
        this.DW = frVar;
        this.FH = hrVar;
        this.Hw = hrVar2;
        this.v5 = i2;
        this.Zo = z;
        this.VH = str;
    }

    public int DW() {
        return this.v5;
    }

    public String FH() {
        String str = this.VH;
        return str != null ? str : toString();
    }

    public int Hw() {
        return this.j6;
    }

    public boolean VH() {
        return this.Zo;
    }

    public hr Zo() {
        return this.FH;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp)) {
            return false;
        }
        tp tpVar = (tp) obj;
        return this.j6 == tpVar.j6 && this.v5 == tpVar.v5 && this.DW == tpVar.DW && this.FH.equals(tpVar.FH) && this.Hw.equals(tpVar.Hw);
    }

    public boolean gn() {
        int i = this.j6;
        if (i == 14 || i == 16) {
            return true;
        }
        switch (i) {
            case ProxyTextView.INPUTTYPE_date /* 20 */:
            case 21:
            case 22:
                return true;
            default:
                return false;
        }
    }

    public int hashCode() {
        return (((((((this.j6 * 31) + this.v5) * 31) + this.DW.hashCode()) * 31) + this.FH.hashCode()) * 31) + this.Hw.hashCode();
    }

    public final boolean j6() {
        return this.Hw.size() != 0;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(40);
        stringBuffer.append("Rop{");
        stringBuffer.append(pp.DW(this.j6));
        if (this.DW != fr.Jl) {
            stringBuffer.append(" ");
            stringBuffer.append(this.DW);
        } else {
            stringBuffer.append(" .");
        }
        stringBuffer.append(" <-");
        int size = this.FH.size();
        if (size == 0) {
            stringBuffer.append(" .");
        } else {
            for (int i = 0; i < size; i++) {
                stringBuffer.append(' ');
                stringBuffer.append(this.FH.v5(i));
            }
        }
        if (this.Zo) {
            stringBuffer.append(" call");
        }
        int size2 = this.Hw.size();
        if (size2 != 0) {
            stringBuffer.append(" throws");
            for (int i2 = 0; i2 < size2; i2++) {
                stringBuffer.append(' ');
                if (this.Hw.v5(i2) == fr.Gj) {
                    stringBuffer.append("<any>");
                } else {
                    stringBuffer.append(this.Hw.v5(i2));
                }
            }
        } else {
            int i3 = this.v5;
            if (i3 == 1) {
                stringBuffer.append(" flows");
            } else if (i3 == 2) {
                stringBuffer.append(" returns");
            } else if (i3 == 3) {
                stringBuffer.append(" gotos");
            } else if (i3 == 4) {
                stringBuffer.append(" ifs");
            } else if (i3 != 5) {
                stringBuffer.append(" " + xs.Zo(this.v5));
            } else {
                stringBuffer.append(" switches");
            }
        }
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public fr v5() {
        return this.DW;
    }

    public tp(int i, fr frVar, hr hrVar, int i2, String str) {
        this(i, frVar, hrVar, er.jw, i2, false, str);
    }

    public tp(int i, fr frVar, hr hrVar, String str) {
        this(i, frVar, hrVar, er.jw, 1, false, str);
    }

    public tp(int i, fr frVar, hr hrVar, hr hrVar2, String str) {
        this(i, frVar, hrVar, hrVar2, 6, false, str);
    }

    public tp(int i, hr hrVar, hr hrVar2) {
        this(i, fr.Jl, hrVar, hrVar2, 6, true, null);
    }
}
