package abcd;

import abcd.p30;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public final class j30<S extends p30> {
    private final g30<S> DW;
    private int[] EQ;
    private final f30<S> FH;
    private final f30<S> Hw;
    private d30 J0;
    private int J8;
    private final int VH;
    private boolean Ws;
    private final int[] Zo;
    private long[] gn;
    private final int j6;
    private int[] tp;
    private int u7;
    private final d30 v5;
    private int we;

    public j30(int i, g30<S> g30Var, f30<S> f30Var, f30<S> f30Var2, d30 d30Var) {
        this.j6 = i;
        this.DW = g30Var;
        this.FH = f30Var;
        this.Hw = f30Var2;
        this.v5 = d30Var;
        if (d30Var.DW >= 268435455) {
            throw new IllegalArgumentException(JGitText.DW().sequenceTooLargeForDiffAlgorithm);
        }
        int iU7 = d30Var.u7();
        int iGn = gn(iU7);
        this.Zo = new int[1 << iGn];
        this.VH = 32 - iGn;
        this.we = d30Var.j6;
        this.gn = new long[Math.max(4, iU7 >>> 3)];
        this.tp = new int[iU7];
        this.EQ = new int[iU7];
    }

    private int DW(f30<S> f30Var, int i) {
        return (this.DW.DW(f30Var, i) * (-1640562687)) >>> this.VH;
    }

    private static int FH(long j) {
        return ((int) j) & 255;
    }

    private static long Hw(int i, int i2, int i3) {
        return (i2 << 8) | (i << 36) | i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0099, code lost:
    
        r0 = r0 - 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean VH() {
        /*
            r12 = this;
            abcd.d30 r0 = r12.v5
            int r0 = r0.DW
            r1 = 1
            int r0 = r0 - r1
        L6:
            abcd.d30 r2 = r12.v5
            int r2 = r2.j6
            if (r2 <= r0) goto Ld
            return r1
        Ld:
            abcd.f30<S extends abcd.p30> r2 = r12.FH
            int r2 = r12.DW(r2, r0)
            int[] r3 = r12.Zo
            r3 = r3[r2]
            r4 = 0
            r5 = 0
        L19:
            if (r3 != 0) goto L5a
            int r3 = r12.j6
            if (r5 != r3) goto L20
            return r4
        L20:
            int r3 = r12.u7
            int r3 = r3 + r1
            r12.u7 = r3
            long[] r5 = r12.gn
            int r6 = r5.length
            if (r3 != r6) goto L41
            int r5 = r5.length
            int r5 = r5 << r1
            abcd.d30 r6 = r12.v5
            int r6 = r6.u7()
            int r6 = r6 + r1
            int r5 = java.lang.Math.min(r5, r6)
            long[] r5 = new long[r5]
            long[] r6 = r12.gn
            int r7 = r6.length
            java.lang.System.arraycopy(r6, r4, r5, r4, r7)
            r12.gn = r5
        L41:
            long[] r4 = r12.gn
            int[] r5 = r12.Zo
            r5 = r5[r2]
            long r5 = Hw(r5, r0, r1)
            r4[r3] = r5
            int[] r4 = r12.EQ
            int r5 = r12.we
            int r5 = r0 - r5
            r4[r5] = r3
            int[] r4 = r12.Zo
            r4[r2] = r3
            goto L99
        L5a:
            long[] r6 = r12.gn
            r7 = r6[r3]
            abcd.g30<S extends abcd.p30> r6 = r12.DW
            abcd.f30<S extends abcd.p30> r9 = r12.FH
            int r10 = Zo(r7)
            abcd.f30<S extends abcd.p30> r11 = r12.FH
            boolean r6 = r6.j6(r9, r10, r11, r0)
            if (r6 == 0) goto L9d
            int r2 = FH(r7)
            int r2 = r2 + r1
            r4 = 255(0xff, float:3.57E-43)
            if (r4 >= r2) goto L79
            r2 = 255(0xff, float:3.57E-43)
        L79:
            long[] r4 = r12.gn
            int r5 = v5(r7)
            long r5 = Hw(r5, r0, r2)
            r4[r3] = r5
            int[] r2 = r12.tp
            int r4 = r12.we
            int r4 = r0 - r4
            int r5 = Zo(r7)
            r2[r4] = r5
            int[] r2 = r12.EQ
            int r4 = r12.we
            int r4 = r0 - r4
            r2[r4] = r3
        L99:
            int r0 = r0 + (-1)
            goto L6
        L9d:
            int r3 = v5(r7)
            int r5 = r5 + 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.j30.VH():boolean");
    }

    private static int Zo(long j) {
        return 268435455 & ((int) (j >>> 8));
    }

    private static int gn(int i) {
        int iNumberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(i);
        if (iNumberOfLeadingZeros == 0) {
            iNumberOfLeadingZeros = 1;
        }
        return (1 << iNumberOfLeadingZeros) < i ? iNumberOfLeadingZeros + 1 : iNumberOfLeadingZeros;
    }

    private int u7(int i) {
        int i2 = i + 1;
        int iV5 = this.Zo[DW(this.Hw, i)];
        int i3 = i2;
        while (iV5 != 0) {
            long j = this.gn[iV5];
            if (FH(j) <= this.J8) {
                int iZo = Zo(j);
                if (this.DW.j6(this.FH, iZo, this.Hw, i)) {
                    this.Ws = true;
                    while (true) {
                        int i4 = this.tp[iZo - this.we];
                        int i5 = iZo + 1;
                        int iFH = FH(j);
                        int i6 = i;
                        while (true) {
                            d30 d30Var = this.v5;
                            if (d30Var.j6 >= iZo || d30Var.FH >= i6 || !this.DW.j6(this.FH, iZo - 1, this.Hw, i6 - 1)) {
                                break;
                            }
                            iZo--;
                            i6--;
                            if (1 < iFH) {
                                iFH = Math.min(iFH, FH(this.gn[this.EQ[iZo - this.we]]));
                            }
                        }
                        int i7 = i2;
                        while (true) {
                            d30 d30Var2 = this.v5;
                            if (i5 >= d30Var2.DW || i7 >= d30Var2.Hw || !this.DW.j6(this.FH, i5, this.Hw, i7)) {
                                break;
                            }
                            if (1 < iFH) {
                                iFH = Math.min(iFH, FH(this.gn[this.EQ[i5 - this.we]]));
                            }
                            i5++;
                            i7++;
                        }
                        if (i3 < i7) {
                            i3 = i7;
                        }
                        if (this.J0.u7() < i5 - iZo || iFH < this.J8) {
                            d30 d30Var3 = this.J0;
                            d30Var3.j6 = iZo;
                            d30Var3.FH = i6;
                            d30Var3.DW = i5;
                            d30Var3.Hw = i7;
                            this.J8 = iFH;
                        }
                        if (i4 == 0) {
                            break;
                        }
                        iZo = i4;
                        while (iZo < i5) {
                            iZo = this.tp[iZo - this.we];
                            if (iZo == 0) {
                                break;
                            }
                        }
                    }
                }
            } else if (!this.Ws) {
                this.Ws = this.DW.j6(this.FH, Zo(j), this.Hw, i);
            }
            iV5 = v5(j);
        }
        return i3;
    }

    private static int v5(long j) {
        return (int) (j >>> 36);
    }

    public d30 j6() {
        if (!VH()) {
            return null;
        }
        this.J0 = new d30(0, 0);
        this.J8 = this.j6 + 1;
        int iU7 = this.v5.FH;
        while (iU7 < this.v5.Hw) {
            iU7 = u7(iU7);
        }
        if (!this.Ws || this.j6 >= this.J8) {
            return this.J0;
        }
        return null;
    }
}
