package abcd;

/* loaded from: classes.dex */
public final class wp {
    public static final wp Hw = new wp(null, -1, -1);
    private final int DW;
    private final int FH;
    private final yq j6;

    public wp(yq yqVar, int i, int i2) {
        if (i < -1) {
            throw new IllegalArgumentException("address < -1");
        }
        if (i2 < -1) {
            throw new IllegalArgumentException("line < -1");
        }
        this.j6 = yqVar;
        this.DW = i;
        this.FH = i2;
    }

    public boolean DW(wp wpVar) {
        return this.FH == wpVar.FH;
    }

    public boolean FH(wp wpVar) {
        yq yqVar;
        yq yqVar2;
        return this.FH == wpVar.FH && ((yqVar = this.j6) == (yqVar2 = wpVar.j6) || (yqVar != null && yqVar.equals(yqVar2)));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof wp)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        wp wpVar = (wp) obj;
        return this.DW == wpVar.DW && FH(wpVar);
    }

    public int hashCode() {
        return this.j6.hashCode() + this.DW + this.FH;
    }

    public int j6() {
        return this.FH;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(50);
        yq yqVar = this.j6;
        if (yqVar != null) {
            stringBuffer.append(yqVar.Zo());
            stringBuffer.append(":");
        }
        int i = this.FH;
        if (i >= 0) {
            stringBuffer.append(i);
        }
        stringBuffer.append('@');
        int i2 = this.DW;
        if (i2 < 0) {
            stringBuffer.append("????");
        } else {
            stringBuffer.append(xs.VH(i2));
        }
        return stringBuffer.toString();
    }
}
