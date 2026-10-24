package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class ho0 {
    private Map<String, String> DW;
    private final Map<String, String> j6 = new HashMap();

    public final synchronized Map<String, String> j6() {
        if (this.DW == null) {
            this.DW = Collections.unmodifiableMap(new HashMap(this.j6));
        }
        return this.DW;
    }
}
