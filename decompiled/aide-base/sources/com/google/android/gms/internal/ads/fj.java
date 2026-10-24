package com.google.android.gms.internal.ads;

@jg
/* loaded from: classes.dex */
public final class fj extends mj {
    private final String WB;
    private final int mb;

    public fj(String str, int i) {
        this.WB = str;
        this.mb = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof fj)) {
            fj fjVar = (fj) obj;
            if (com.google.android.gms.common.internal.o.j6(this.WB, fjVar.WB) && com.google.android.gms.common.internal.o.j6(Integer.valueOf(this.mb), Integer.valueOf(fjVar.mb))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.lj
    public final String j6() {
        return this.WB;
    }

    @Override // com.google.android.gms.internal.ads.lj
    public final int zh() {
        return this.mb;
    }
}
