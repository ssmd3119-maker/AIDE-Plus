package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class tc0 extends o70<Integer, Long> {
    public Long DW;
    public Long EQ;
    public Long FH;
    public Long Hw;
    public Long VH;
    public Long Zo;
    public Long gn;
    public Long tp;
    public Long u7;
    public Long v5;
    public Long we;

    public tc0(String str) {
        FH(str);
    }

    @Override // com.google.android.gms.internal.ads.o70
    protected final HashMap<Integer, Long> DW() {
        HashMap<Integer, Long> map = new HashMap<>();
        map.put(0, this.DW);
        map.put(1, this.FH);
        map.put(2, this.Hw);
        map.put(3, this.v5);
        map.put(4, this.Zo);
        map.put(5, this.VH);
        map.put(6, this.gn);
        map.put(7, this.u7);
        map.put(8, this.tp);
        map.put(9, this.EQ);
        map.put(10, this.we);
        return map;
    }

    protected final void FH(String str) {
        HashMap mapJ6 = o70.j6(str);
        if (mapJ6 != null) {
            this.DW = (Long) mapJ6.get(0);
            this.FH = (Long) mapJ6.get(1);
            this.Hw = (Long) mapJ6.get(2);
            this.v5 = (Long) mapJ6.get(3);
            this.Zo = (Long) mapJ6.get(4);
            this.VH = (Long) mapJ6.get(5);
            this.gn = (Long) mapJ6.get(6);
            this.u7 = (Long) mapJ6.get(7);
            this.tp = (Long) mapJ6.get(8);
            this.EQ = (Long) mapJ6.get(9);
            this.we = (Long) mapJ6.get(10);
        }
    }
}
