package com.google.android.gms.common.api.internal;

import abcd.hw;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class i {
    private final Map<BasePendingResult<?>, Boolean> j6 = Collections.synchronizedMap(new WeakHashMap());
    private final Map<hw<?>, Boolean> DW = Collections.synchronizedMap(new WeakHashMap());

    private final void j6(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (this.j6) {
            map = new HashMap(this.j6);
        }
        synchronized (this.DW) {
            map2 = new HashMap(this.DW);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).gn(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((hw) entry2.getKey()).Hw(new com.google.android.gms.common.api.b(status));
            }
        }
    }

    final boolean DW() {
        return (this.j6.isEmpty() && this.DW.isEmpty()) ? false : true;
    }

    public final void FH() {
        j6(false, b.Z1);
    }

    public final void Hw() {
        j6(true, a0.j6);
    }
}
