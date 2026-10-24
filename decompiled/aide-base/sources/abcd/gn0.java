package abcd;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class gn0 {
    private final sm0 DW;
    private final sm0 FH;
    private final op0 Hw;
    private final wm0 VH;
    private final rp0 Zo;
    private byte[] gn;
    private final sk0 j6;
    private final sp0 v5;

    public gn0(sk0 sk0Var, op0 op0Var, tp0 tp0Var, wm0 wm0Var) {
        this(sk0Var, op0Var, tp0Var, wm0Var, false);
    }

    private di0 DW(mk0 mk0Var) {
        if (mk0Var != null) {
            return new qj0(mk0Var.DW());
        }
        return null;
    }

    private Map FH(jj0 jj0Var, sl0 sl0Var, byte[] bArr) {
        HashMap map = new HashMap();
        if (jj0Var != null) {
            map.put("contentType", jj0Var);
        }
        map.put("digestAlgID", sl0Var);
        map.put("digest", bArr.clone());
        return map;
    }

    public byte[] Hw() {
        byte[] bArr = this.gn;
        if (bArr != null) {
            return (byte[]) bArr.clone();
        }
        return null;
    }

    public void Zo(om0 om0Var) {
    }

    public tk0 j6(vh0 vh0Var) throws tm0, IOException {
        sl0 sl0VarJ6;
        sl0 sl0Var;
        di0 di0Var;
        try {
            di0 di0VarDW = null;
            if (this.DW != null) {
                sl0 sl0VarFH = this.v5.FH();
                this.gn = this.v5.DW();
                di0 di0VarDW2 = DW(this.DW.j6(Collections.unmodifiableMap(FH(vh0Var, this.v5.FH(), this.gn))));
                OutputStream outputStreamJ6 = this.Hw.j6();
                outputStreamJ6.write(di0VarDW2.Zo("DER"));
                outputStreamJ6.close();
                sl0Var = sl0VarFH;
                di0Var = di0VarDW2;
            } else {
                if (this.v5 != null) {
                    sl0VarJ6 = this.v5.FH();
                    this.gn = this.v5.DW();
                } else {
                    sl0VarJ6 = this.Zo.j6(this.Hw.FH());
                    this.gn = null;
                }
                sl0Var = sl0VarJ6;
                di0Var = null;
            }
            byte[] bArrHw = this.Hw.Hw();
            if (this.FH != null) {
                Map mapFH = FH(vh0Var, sl0Var, this.gn);
                mapFH.put("encryptedDigest", bArrHw.clone());
                di0VarDW = DW(this.FH.j6(Collections.unmodifiableMap(mapFH)));
            }
            return new tk0(this.j6, sl0Var, di0Var, this.VH.j6(this.Hw.FH()), new kj0(bArrHw), di0VarDW);
        } catch (IOException e) {
            throw new tm0("encoding error.", e);
        }
    }

    public OutputStream v5() {
        sp0 sp0Var = this.v5;
        return sp0Var != null ? this.DW == null ? new nq0(this.v5.j6(), this.Hw.j6()) : sp0Var.j6() : this.Hw.j6();
    }

    public gn0(sk0 sk0Var, op0 op0Var, tp0 tp0Var, wm0 wm0Var, boolean z) {
        pp0 pp0Var = new pp0();
        this.Zo = pp0Var;
        this.gn = null;
        this.j6 = sk0Var;
        this.Hw = op0Var;
        if (tp0Var != null) {
            this.v5 = tp0Var.j6(pp0Var.j6(op0Var.FH()));
        } else {
            this.v5 = null;
        }
        if (z) {
            this.DW = null;
            this.FH = null;
        } else {
            this.DW = new en0();
            this.FH = null;
        }
        this.VH = wm0Var;
    }

    public gn0(gn0 gn0Var, sm0 sm0Var, sm0 sm0Var2) {
        this.Zo = new pp0();
        this.gn = null;
        this.j6 = gn0Var.j6;
        this.Hw = gn0Var.Hw;
        this.v5 = gn0Var.v5;
        this.VH = gn0Var.VH;
        this.DW = sm0Var;
        this.FH = sm0Var2;
    }

    public gn0(sk0 sk0Var, op0 op0Var, tp0 tp0Var, wm0 wm0Var, sm0 sm0Var, sm0 sm0Var2) {
        pp0 pp0Var = new pp0();
        this.Zo = pp0Var;
        this.gn = null;
        this.j6 = sk0Var;
        this.Hw = op0Var;
        if (tp0Var != null) {
            this.v5 = tp0Var.j6(pp0Var.j6(op0Var.FH()));
        } else {
            this.v5 = null;
        }
        this.DW = sm0Var;
        this.FH = sm0Var2;
        this.VH = wm0Var;
    }
}
