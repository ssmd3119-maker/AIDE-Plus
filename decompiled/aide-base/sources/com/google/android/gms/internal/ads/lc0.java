package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class lc0 extends o70<Integer, Object> {
    public Long DW;
    public Boolean FH;
    public Boolean Hw;

    public lc0(String str) {
        FH(str);
    }

    @Override // com.google.android.gms.internal.ads.o70
    protected final HashMap<Integer, Object> DW() {
        HashMap<Integer, Object> map = new HashMap<>();
        map.put(0, this.DW);
        map.put(1, this.FH);
        map.put(2, this.Hw);
        return map;
    }

    protected final void FH(String str) {
        HashMap mapJ6 = o70.j6(str);
        if (mapJ6 != null) {
            this.DW = (Long) mapJ6.get(0);
            this.FH = (Boolean) mapJ6.get(1);
            this.Hw = (Boolean) mapJ6.get(2);
        }
    }
}
