package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zj0 implements vk0 {
    private final vk0[] WB;

    public zj0(vk0[] vk0VarArr) {
        this.WB = vk0VarArr;
    }

    @Override // com.google.android.gms.internal.ads.vk0
    public final long DW() {
        long jMin = Long.MAX_VALUE;
        for (vk0 vk0Var : this.WB) {
            long jDW = vk0Var.DW();
            if (jDW != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jDW);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.vk0
    public final boolean FH(long j) {
        boolean zFH;
        boolean z = false;
        do {
            long jDW = DW();
            if (jDW == Long.MIN_VALUE) {
                break;
            }
            zFH = false;
            for (vk0 vk0Var : this.WB) {
                if (vk0Var.DW() == jDW) {
                    zFH |= vk0Var.FH(j);
                }
            }
            z |= zFH;
        } while (zFH);
        return z;
    }
}
