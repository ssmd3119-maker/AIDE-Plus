package abcd;

import java.security.MessageDigest;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public abstract class fa0 {
    protected final long DW;
    protected final long FH;
    protected final wa0 j6;

    public fa0(wa0 wa0Var, long j, int i) {
        this.j6 = wa0Var;
        this.DW = j;
        this.FH = j + i;
    }

    public abstract int DW(int i, byte[] bArr, int i2, int i3);

    public final int FH(long j, byte[] bArr, int i, int i2) {
        return DW((int) (j - this.DW), bArr, i, i2);
    }

    public abstract int Hw(int i, Inflater inflater);

    public abstract void VH(fc0 fc0Var, long j, int i, MessageDigest messageDigest);

    public final int Zo() {
        return (int) (this.FH - this.DW);
    }

    public final boolean j6(wa0 wa0Var, long j) {
        return this.j6 == wa0Var && this.DW <= j && j < this.FH;
    }

    public final int v5(long j, Inflater inflater) {
        return Hw((int) (j - this.DW), inflater);
    }
}
