package abcd;

/* loaded from: classes.dex */
public final class sh implements zi {
    private final yq DW;
    private final boolean FH;
    private final pg Hw;
    private final wh Zo;
    private final zi j6;
    private final vh v5;

    public sh(zi ziVar, vi viVar, boolean z, boolean z2) {
        this(ziVar, viVar.j6(), viVar.DW(), z, z2);
    }

    @Override // abcd.zi
    public dr DW() {
        return this.j6.DW();
    }

    public wh EQ() {
        return this.Zo;
    }

    @Override // abcd.yi
    public zq FH() {
        return this.j6.FH();
    }

    @Override // abcd.yi
    public ui Hw() {
        return this.j6.Hw();
    }

    public int J0() {
        return this.Hw.Zo();
    }

    public wp J8(int i) {
        return new wp(this.DW, i, this.v5.Sf(i));
    }

    @Override // abcd.yi
    public yq VH() {
        return this.j6.VH();
    }

    @Override // abcd.yi
    public yq getName() {
        return this.j6.getName();
    }

    public boolean gn() {
        return this.FH;
    }

    @Override // abcd.yi
    public int j6() {
        return this.j6.j6();
    }

    public rh tp() {
        return this.Hw.Hw();
    }

    public ph u7() {
        return this.Hw.FH();
    }

    @Override // abcd.yi
    public wq v5() {
        return this.j6.v5();
    }

    public int we() {
        return this.Hw.v5();
    }

    public sh(zi ziVar, int i, yq yqVar, boolean z, boolean z2) {
        this.j6 = ziVar;
        this.FH = (i & 32) != 0;
        this.DW = yqVar;
        pg pgVar = (pg) ziVar.Hw().J0("Code");
        this.Hw = pgVar;
        ui uiVarJ6 = pgVar.j6();
        vh vhVarSG = vh.jw;
        if (z) {
            for (vg vgVar = (vg) uiVarJ6.J0("LineNumberTable"); vgVar != null; vgVar = (vg) uiVarJ6.we(vgVar)) {
                vhVarSG = vh.sG(vhVarSG, vgVar.j6());
            }
        }
        this.v5 = vhVarSG;
        wh whVarVJ = wh.jw;
        if (z2) {
            for (wg wgVar = (wg) uiVarJ6.J0("LocalVariableTable"); wgVar != null; wgVar = (wg) uiVarJ6.we(wgVar)) {
                whVarVJ = wh.sG(whVarVJ, wgVar.j6());
            }
            wh whVarSG = wh.jw;
            for (xg xgVar = (xg) uiVarJ6.J0("LocalVariableTypeTable"); xgVar != null; xgVar = (xg) uiVarJ6.we(xgVar)) {
                whVarSG = wh.sG(whVarSG, xgVar.j6());
            }
            if (whVarSG.size() != 0) {
                whVarVJ = wh.vJ(whVarVJ, whVarSG);
            }
        }
        this.Zo = whVarVJ;
    }
}
