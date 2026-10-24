package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zi0 implements dh0 {
    private static final int u7 = ip0.Ws("RCC\u0001");
    private mh0 FH;
    private int VH;
    private long Zo;
    private int gn;
    private final zzfs j6;
    private int v5;
    private final ap0 DW = new ap0(9);
    private int Hw = 0;

    public zi0(zzfs zzfsVar) {
        this.j6 = zzfsVar;
    }

    @Override // com.google.android.gms.internal.ads.dh0
    public final int DW(fh0 fh0Var, jh0 jh0Var) throws IOException {
        while (true) {
            int i = this.Hw;
            boolean z = false;
            boolean z2 = true;
            if (i == 0) {
                this.DW.u7();
                if (fh0Var.VH(this.DW.j6, 0, 8, true)) {
                    if (this.DW.Hw() != u7) {
                        throw new IOException("Input not RawCC");
                    }
                    this.v5 = this.DW.VH();
                    z = true;
                }
                if (!z) {
                    return -1;
                }
                this.Hw = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException();
                    }
                    while (this.VH > 0) {
                        this.DW.u7();
                        fh0Var.readFully(this.DW.j6, 0, 3);
                        this.FH.Hw(this.DW, 3);
                        this.gn += 3;
                        this.VH--;
                    }
                    int i2 = this.gn;
                    if (i2 > 0) {
                        this.FH.FH(this.Zo, 1, i2, 0, null);
                    }
                    this.Hw = 1;
                    return 0;
                }
                this.DW.u7();
                int i3 = this.v5;
                if (i3 == 0) {
                    if (fh0Var.VH(this.DW.j6, 0, 5, true)) {
                        this.Zo = (this.DW.j3() * 1000) / 45;
                        this.VH = this.DW.VH();
                        this.gn = 0;
                    }
                    z2 = false;
                } else {
                    if (i3 != 1) {
                        int i4 = this.v5;
                        StringBuilder sb = new StringBuilder(39);
                        sb.append("Unsupported version number: ");
                        sb.append(i4);
                        throw new af0(sb.toString());
                    }
                    if (fh0Var.VH(this.DW.j6, 0, 9, true)) {
                        this.Zo = this.DW.v5();
                        this.VH = this.DW.VH();
                        this.gn = 0;
                    }
                    z2 = false;
                }
                if (!z2) {
                    this.Hw = 0;
                    return -1;
                }
                this.Hw = 2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.dh0
    public final void FH(gh0 gh0Var) {
        gh0Var.u7(new lh0(-9223372036854775807L));
        this.FH = gh0Var.j6(0, 3);
        gh0Var.Hw();
        this.FH.j6(this.j6);
    }

    @Override // com.google.android.gms.internal.ads.dh0
    public final boolean VH(fh0 fh0Var) {
        this.DW.u7();
        fh0Var.v5(this.DW.j6, 0, 8);
        return this.DW.Hw() == u7;
    }

    @Override // com.google.android.gms.internal.ads.dh0
    public final void Zo(long j, long j2) {
        this.Hw = 0;
    }

    @Override // com.google.android.gms.internal.ads.dh0
    public final void j6() {
    }
}
