package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class q90 extends o70<Integer, Object> {
    public String DW;
    public long FH;
    public String Hw;
    public String Zo;
    public String v5;

    public q90(String str) {
        this();
        FH(str);
    }

    @Override // com.google.android.gms.internal.ads.o70
    protected final HashMap<Integer, Object> DW() {
        HashMap<Integer, Object> map = new HashMap<>();
        map.put(0, this.DW);
        map.put(4, this.Zo);
        map.put(3, this.v5);
        map.put(2, this.Hw);
        map.put(1, Long.valueOf(this.FH));
        return map;
    }

    protected final void FH(String str) {
        HashMap mapJ6 = o70.j6(str);
        if (mapJ6 != null) {
            this.DW = mapJ6.get(0) == null ? "E" : (String) mapJ6.get(0);
            this.FH = mapJ6.get(1) == null ? -1L : ((Long) mapJ6.get(1)).longValue();
            this.Hw = mapJ6.get(2) == null ? "E" : (String) mapJ6.get(2);
            this.v5 = mapJ6.get(3) == null ? "E" : (String) mapJ6.get(3);
            this.Zo = mapJ6.get(4) != null ? (String) mapJ6.get(4) : "E";
        }
    }

    public q90() {
        this.DW = "E";
        this.FH = -1L;
        this.Hw = "E";
        this.v5 = "E";
        this.Zo = "E";
    }
}
