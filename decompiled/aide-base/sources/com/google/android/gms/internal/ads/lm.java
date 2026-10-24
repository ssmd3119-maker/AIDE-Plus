package com.google.android.gms.internal.ads;

import android.os.Bundle;
import javax.annotation.concurrent.GuardedBy;

@jg
/* loaded from: classes.dex */
public final class lm {

    @GuardedBy("mLock")
    private int DW;

    @GuardedBy("mLock")
    private int FH;
    private final mm Hw;
    private final Object j6;
    private final String v5;

    public lm(String str) {
        this(com.google.android.gms.ads.internal.w0.u7().rN(), str);
    }

    public final void DW(int i, int i2) {
        synchronized (this.j6) {
            this.DW = i;
            this.FH = i2;
            this.Hw.Hw(this);
        }
    }

    public final String FH() {
        return this.v5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lm.class == obj.getClass()) {
            String str = this.v5;
            String str2 = ((lm) obj).v5;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.v5;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final Bundle j6() {
        Bundle bundle;
        synchronized (this.j6) {
            bundle = new Bundle();
            bundle.putInt("pmnli", this.DW);
            bundle.putInt("pmnll", this.FH);
        }
        return bundle;
    }

    private lm(mm mmVar, String str) {
        this.j6 = new Object();
        this.Hw = mmVar;
        this.v5 = str;
    }
}
