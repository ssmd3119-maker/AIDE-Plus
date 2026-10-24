package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class bd0 extends xd0 {
    private static yd0<String> u7 = new yd0<>();
    private final Context gn;

    public bd0(nc0 nc0Var, String str, String str2, sz szVar, int i, int i2, Context context) {
        super(nc0Var, str, str2, szVar, i, 29);
        this.gn = context;
    }

    @Override // com.google.android.gms.internal.ads.xd0
    protected final void j6() {
        this.Hw.yS = "E";
        AtomicReference<String> atomicReferenceJ6 = u7.j6(this.gn.getPackageName());
        if (atomicReferenceJ6.get() == null) {
            synchronized (atomicReferenceJ6) {
                if (atomicReferenceJ6.get() == null) {
                    atomicReferenceJ6.set((String) this.v5.invoke(null, this.gn));
                }
            }
        }
        String str = atomicReferenceJ6.get();
        synchronized (this.Hw) {
            this.Hw.yS = p80.j6(str.getBytes(), true);
        }
    }
}
