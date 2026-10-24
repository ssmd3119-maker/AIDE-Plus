package abcd;

/* loaded from: classes.dex */
public abstract class gj implements yi {
    private final int DW;
    private final wq FH;
    private final ui Hw;
    private final zq j6;

    public gj(zq zqVar, int i, wq wqVar, ui uiVar) {
        if (zqVar == null) {
            throw new NullPointerException("definingClass == null");
        }
        if (wqVar == null) {
            throw new NullPointerException("nat == null");
        }
        if (uiVar == null) {
            throw new NullPointerException("attributes == null");
        }
        this.j6 = zqVar;
        this.DW = i;
        this.FH = wqVar;
        this.Hw = uiVar;
    }

    @Override // abcd.yi
    public final zq FH() {
        return this.j6;
    }

    @Override // abcd.yi
    public final ui Hw() {
        return this.Hw;
    }

    @Override // abcd.yi
    public final yq VH() {
        return this.FH.we();
    }

    @Override // abcd.yi
    public final yq getName() {
        return this.FH.QX();
    }

    @Override // abcd.yi
    public final int j6() {
        return this.DW;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(100);
        stringBuffer.append(getClass().getName());
        stringBuffer.append('{');
        stringBuffer.append(this.FH.Zo());
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    @Override // abcd.yi
    public final wq v5() {
        return this.FH;
    }
}
