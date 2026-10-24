package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class zb0 extends o70<Integer, Long> {
    public long DW;
    public long FH;

    public zb0() {
        this.DW = -1L;
        this.FH = -1L;
    }

    @Override // com.google.android.gms.internal.ads.o70
    protected final HashMap<Integer, Long> DW() {
        HashMap<Integer, Long> map = new HashMap<>();
        map.put(0, Long.valueOf(this.DW));
        map.put(1, Long.valueOf(this.FH));
        return map;
    }

    protected final void FH(String str) {
        HashMap mapJ6 = o70.j6(str);
        if (mapJ6 != null) {
            this.DW = ((Long) mapJ6.get(0)).longValue();
            this.FH = ((Long) mapJ6.get(1)).longValue();
        }
    }

    public zb0(String str) {
        this();
        FH(str);
    }
}
