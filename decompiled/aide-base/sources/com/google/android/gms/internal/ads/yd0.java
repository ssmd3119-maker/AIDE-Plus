package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class yd0<T> {
    private final Map<String, AtomicReference<T>> j6 = new HashMap();

    public final AtomicReference<T> j6(String str) {
        synchronized (this) {
            if (!this.j6.containsKey(str)) {
                this.j6.put(str, new AtomicReference<>());
            }
        }
        return this.j6.get(str);
    }
}
