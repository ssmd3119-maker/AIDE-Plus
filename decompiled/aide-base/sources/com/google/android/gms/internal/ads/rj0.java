package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;

/* loaded from: classes.dex */
public final class rj0 {
    private final qj0 DW;
    private final long FH;
    private final Handler j6;

    public rj0(Handler handler, qj0 qj0Var) {
        this(handler, qj0Var, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long J0(long j) {
        long jJ6 = ie0.j6(j);
        if (jJ6 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.FH + jJ6;
    }

    public final void EQ(bo0 bo0Var, int i, int i2, zzfs zzfsVar, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
        if (this.DW != null) {
            this.j6.post(new uj0(this, bo0Var, i, i2, zzfsVar, i3, obj, j, j2, j3, j4, j5));
        }
    }

    public final void FH(bo0 bo0Var, int i, long j) {
        VH(bo0Var, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j);
    }

    public final void Hw(bo0 bo0Var, int i, long j, long j2, long j3) {
        tp(bo0Var, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, j3);
    }

    public final void VH(bo0 bo0Var, int i, int i2, zzfs zzfsVar, int i3, Object obj, long j, long j2, long j3) {
        if (this.DW != null) {
            this.j6.post(new sj0(this, bo0Var, i, i2, zzfsVar, i3, obj, j, j2, j3));
        }
    }

    public final void Zo(int i, zzfs zzfsVar, int i2, Object obj, long j) {
        if (this.DW != null) {
            this.j6.post(new wj0(this, i, zzfsVar, i2, obj, j));
        }
    }

    public final void gn(bo0 bo0Var, int i, int i2, zzfs zzfsVar, int i3, Object obj, long j, long j2, long j3, long j4, long j5, IOException iOException, boolean z) {
        if (this.DW != null) {
            this.j6.post(new vj0(this, bo0Var, i, i2, zzfsVar, i3, obj, j, j2, j3, j4, j5, iOException, z));
        }
    }

    public final void tp(bo0 bo0Var, int i, int i2, zzfs zzfsVar, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
        if (this.DW != null) {
            this.j6.post(new tj0(this, bo0Var, i, i2, zzfsVar, i3, obj, j, j2, j3, j4, j5));
        }
    }

    public final void u7(bo0 bo0Var, int i, long j, long j2, long j3) {
        EQ(bo0Var, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, j3);
    }

    public final void v5(bo0 bo0Var, int i, long j, long j2, long j3, IOException iOException, boolean z) {
        gn(bo0Var, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, j3, iOException, z);
    }

    public final rj0 we(long j) {
        return new rj0(this.j6, this.DW, j);
    }

    private rj0(Handler handler, qj0 qj0Var, long j) {
        Handler handler2;
        if (qj0Var != null) {
            ro0.FH(handler);
            handler2 = handler;
        } else {
            handler2 = null;
        }
        this.j6 = handler2;
        this.DW = qj0Var;
        this.FH = j;
    }
}
