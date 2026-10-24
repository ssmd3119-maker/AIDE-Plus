package com.google.android.gms.internal.ads;

import java.util.Stack;

/* loaded from: classes.dex */
public final class oh0 implements rh0 {
    private sh0 Hw;
    private long VH;
    private int Zo;
    private int v5;
    private final byte[] j6 = new byte[8];
    private final Stack<qh0> DW = new Stack<>();
    private final yh0 FH = new yh0();

    oh0() {
    }

    private final long Hw(fh0 fh0Var, int i) {
        fh0Var.readFully(this.j6, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.j6[i2] & 255);
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.rh0
    public final void DW() {
        this.v5 = 0;
        this.DW.clear();
        this.FH.j6();
    }

    @Override // com.google.android.gms.internal.ads.rh0
    public final void FH(sh0 sh0Var) {
        this.Hw = sh0Var;
    }

    @Override // com.google.android.gms.internal.ads.rh0
    public final boolean j6(fh0 fh0Var) throws af0 {
        String str;
        int iHw;
        int iFH;
        ro0.Hw(this.Hw != null);
        while (true) {
            if (!this.DW.isEmpty() && fh0Var.u7() >= this.DW.peek().DW) {
                this.Hw.J8(this.DW.pop().j6);
                return true;
            }
            if (this.v5 == 0) {
                long jDW = this.FH.DW(fh0Var, true, false, 4);
                if (jDW == -2) {
                    fh0Var.Hw();
                    while (true) {
                        fh0Var.v5(this.j6, 0, 4);
                        iHw = yh0.Hw(this.j6[0]);
                        if (iHw != -1 && iHw <= 4) {
                            iFH = (int) yh0.FH(this.j6, iHw, false);
                            if (this.Hw.XL(iFH)) {
                                break;
                            }
                        }
                        fh0Var.FH(1);
                    }
                    fh0Var.FH(iHw);
                    jDW = iFH;
                }
                if (jDW == -1) {
                    return false;
                }
                this.Zo = (int) jDW;
                this.v5 = 1;
            }
            if (this.v5 == 1) {
                this.VH = this.FH.DW(fh0Var, false, true, 8);
                this.v5 = 2;
            }
            int iWs = this.Hw.Ws(this.Zo);
            if (iWs != 0) {
                if (iWs == 1) {
                    long jU7 = fh0Var.u7();
                    this.DW.add(new qh0(this.Zo, this.VH + jU7));
                    this.Hw.J0(this.Zo, jU7, this.VH);
                    this.v5 = 0;
                    return true;
                }
                if (iWs == 2) {
                    long j = this.VH;
                    if (j <= 8) {
                        this.Hw.v5(this.Zo, Hw(fh0Var, (int) j));
                        this.v5 = 0;
                        return true;
                    }
                    long j2 = this.VH;
                    StringBuilder sb = new StringBuilder(42);
                    sb.append("Invalid integer size: ");
                    sb.append(j2);
                    throw new af0(sb.toString());
                }
                if (iWs == 3) {
                    long j3 = this.VH;
                    if (j3 > 2147483647L) {
                        long j4 = this.VH;
                        StringBuilder sb2 = new StringBuilder(41);
                        sb2.append("String element size: ");
                        sb2.append(j4);
                        throw new af0(sb2.toString());
                    }
                    sh0 sh0Var = this.Hw;
                    int i = this.Zo;
                    int i2 = (int) j3;
                    if (i2 == 0) {
                        str = "";
                    } else {
                        byte[] bArr = new byte[i2];
                        fh0Var.readFully(bArr, 0, i2);
                        str = new String(bArr);
                    }
                    sh0Var.QX(i, str);
                    this.v5 = 0;
                    return true;
                }
                if (iWs == 4) {
                    this.Hw.aM(this.Zo, (int) this.VH, fh0Var);
                    this.v5 = 0;
                    return true;
                }
                if (iWs != 5) {
                    StringBuilder sb3 = new StringBuilder(32);
                    sb3.append("Invalid element type ");
                    sb3.append(iWs);
                    throw new af0(sb3.toString());
                }
                long j5 = this.VH;
                if (j5 != 4 && j5 != 8) {
                    long j6 = this.VH;
                    StringBuilder sb4 = new StringBuilder(40);
                    sb4.append("Invalid float size: ");
                    sb4.append(j6);
                    throw new af0(sb4.toString());
                }
                sh0 sh0Var2 = this.Hw;
                int i3 = this.Zo;
                int i4 = (int) this.VH;
                sh0Var2.we(i3, i4 == 4 ? Float.intBitsToFloat((int) r7) : Double.longBitsToDouble(Hw(fh0Var, i4)));
                this.v5 = 0;
                return true;
            }
            fh0Var.FH((int) this.VH);
            this.v5 = 0;
        }
    }
}
