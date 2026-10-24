package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.WindowManager;

@TargetApi(16)
/* loaded from: classes.dex */
public final class zzqs {
    private final boolean DW;
    private long EQ;
    private final long FH;
    private final long Hw;
    private long VH;
    private long Zo;
    private boolean gn;
    private final up0 j6;
    private long tp;
    private long u7;
    private long v5;

    public zzqs() {
        this(-1.0d);
    }

    private final boolean Hw(long j, long j2) {
        return Math.abs((j2 - this.u7) - (j - this.tp)) > 20000000;
    }

    public final void DW() {
        this.gn = false;
        if (this.DW) {
            this.j6.DW();
        }
    }

    public final long FH(long j, long j2) {
        long j3;
        long j4;
        long j5;
        long j6 = 1000 * j;
        if (this.gn) {
            if (j != this.v5) {
                this.EQ++;
                this.Zo = this.VH;
            }
            long j7 = this.EQ;
            if (j7 >= 6) {
                j4 = this.Zo + ((j6 - this.tp) / j7);
                if (Hw(j4, j2)) {
                    this.gn = false;
                } else {
                    j3 = (this.u7 + j4) - this.tp;
                }
            } else if (Hw(j6, j2)) {
                this.gn = false;
            }
            j3 = j2;
            j4 = j6;
        } else {
            j3 = j2;
            j4 = j6;
        }
        if (!this.gn) {
            this.tp = j6;
            this.u7 = j2;
            this.EQ = 0L;
            this.gn = true;
        }
        this.v5 = j;
        this.VH = j4;
        up0 up0Var = this.j6;
        if (up0Var == null || up0Var.WB == 0) {
            return j3;
        }
        long j8 = this.j6.WB;
        long j9 = this.FH;
        long j10 = j8 + (((j3 - j8) / j9) * j9);
        if (j3 <= j10) {
            j5 = j10 - j9;
        } else {
            j10 = j9 + j10;
            j5 = j10;
        }
        if (j10 - j3 >= j3 - j5) {
            j10 = j5;
        }
        return j10 - this.Hw;
    }

    public final void j6() {
        if (this.DW) {
            this.j6.FH();
        }
    }

    public zzqs(Context context) {
        this(((WindowManager) context.getSystemService("window")).getDefaultDisplay() != null ? r3.getDefaultDisplay().getRefreshRate() : -1.0d);
    }

    private zzqs(double d) {
        boolean z = d != -1.0d;
        this.DW = z;
        if (z) {
            this.j6 = up0.j6();
            long j = (long) (1.0E9d / d);
            this.FH = j;
            this.Hw = (j * 80) / 100;
            return;
        }
        this.j6 = null;
        this.FH = -1L;
        this.Hw = -1L;
    }
}
