package abcd;

import abcd.h70;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

/* loaded from: classes.dex */
public class oa0 extends f70 {
    private final long DW;
    private final long FH;
    private final int Hw;
    private final ja0 Zo;
    private final int j6;
    private final wa0 v5;

    public oa0(int i, long j, long j2, int i2, wa0 wa0Var, ja0 ja0Var) {
        this.j6 = i;
        this.DW = j;
        this.FH = j2;
        this.Hw = i2;
        this.v5 = wa0Var;
        this.Zo = ja0Var;
    }

    private a70 tp() {
        return this.v5.lg(this.FH);
    }

    @Override // abcd.f70
    public byte[] Hw() {
        try {
            throw new n40(tp());
        } catch (IOException e) {
            n40 n40Var = new n40();
            n40Var.initCause(e);
            throw n40Var;
        }
    }

    @Override // abcd.f70
    public int VH() {
        return this.j6;
    }

    @Override // abcd.f70
    public long Zo() {
        return this.DW;
    }

    @Override // abcd.f70
    public boolean gn() {
        return true;
    }

    @Override // abcd.f70
    public h70 u7() {
        ob0 ob0Var = new ob0(this.Zo);
        try {
            return new h70.a(this.j6, this.DW, new BufferedInputStream(new InflaterInputStream(new db0(this.v5, this.FH + this.Hw, ob0Var), ob0Var.gW(), 8192), 8192));
        } catch (IOException unused) {
            return ob0Var.QX(tp(), this.j6).u7();
        }
    }
}
