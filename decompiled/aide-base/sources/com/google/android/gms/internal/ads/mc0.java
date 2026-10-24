package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class mc0 extends o70<Integer, Long> {
    public Long DW;
    public Long FH;

    public mc0(String str) {
        FH(str);
    }

    @Override // com.google.android.gms.internal.ads.o70
    protected final HashMap<Integer, Long> DW() {
        HashMap<Integer, Long> map = new HashMap<>();
        map.put(0, this.DW);
        map.put(1, this.FH);
        return map;
    }

    protected final void FH(String str) {
        HashMap mapJ6 = o70.j6(str);
        if (mapJ6 != null) {
            this.DW = (Long) mapJ6.get(0);
            this.FH = (Long) mapJ6.get(1);
        }
    }
}
