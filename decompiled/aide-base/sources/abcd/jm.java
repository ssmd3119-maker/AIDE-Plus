package abcd;

import java.io.PrintWriter;

/* loaded from: classes.dex */
public class jm extends fn {
    private final vq AL;
    private byte[] k2;
    private final yj qp;
    private final boolean zh;

    public jm(yj yjVar, boolean z, vq vqVar) {
        super(1, -1);
        if (yjVar == null) {
            throw new NullPointerException("code == null");
        }
        this.qp = yjVar;
        this.zh = z;
        this.AL = vqVar;
    }

    private byte[] BT(km kmVar, String str, PrintWriter printWriter, ls lsVar, boolean z) {
        return vy(kmVar, str, printWriter, lsVar, z);
    }

    private byte[] vy(km kmVar, String str, PrintWriter printWriter, ls lsVar, boolean z) {
        nk nkVarGn = this.qp.gn();
        hk hkVarVH = this.qp.VH();
        ak akVarZo = this.qp.Zo();
        im imVar = new im(nkVarGn, hkVarVH, kmVar, akVarZo.sG(), akVarZo.vJ(), this.zh, this.AL);
        return (printWriter == null && lsVar == null) ? imVar.Hw() : imVar.Zo(str, printWriter, lsVar, z);
    }

    @Override // abcd.wm
    public xm DW() {
        return xm.TYPE_DEBUG_INFO_ITEM;
    }

    @Override // abcd.fn
    public void Mr(jn jnVar, int i) {
        try {
            byte[] bArrBT = BT(jnVar.v5(), null, null, null, false);
            this.k2 = bArrBT;
            U2(bArrBT.length);
        } catch (RuntimeException e) {
            throw us.DW(e, "...while placing debug info for " + this.AL.Zo());
        }
    }

    @Override // abcd.fn
    public String a8() {
        throw new RuntimeException("unsupported");
    }

    @Override // abcd.wm
    public void j6(km kmVar) {
    }

    @Override // abcd.fn
    public void rN(km kmVar, ls lsVar) {
        if (lsVar.EQ()) {
            lsVar.j6(XL() + " debug info");
            BT(kmVar, null, null, lsVar, true);
        }
        lsVar.write(this.k2);
    }

    public void yS(km kmVar, ls lsVar, String str) {
        BT(kmVar, str, null, lsVar, false);
    }
}
