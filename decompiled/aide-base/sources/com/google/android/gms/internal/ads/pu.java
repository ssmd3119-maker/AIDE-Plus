package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@jg
/* loaded from: classes.dex */
public final class pu {
    private long DW;
    private final ArrayList<eo0> j6 = new ArrayList<>();

    pu() {
    }

    final long DW() throws NumberFormatException {
        Iterator<eo0> it = this.j6.iterator();
        while (it.hasNext()) {
            Map<String, List<String>> mapFH = it.next().FH();
            if (mapFH != null) {
                for (Map.Entry<String, List<String>> entry : mapFH.entrySet()) {
                    try {
                        if ("content-length".equalsIgnoreCase(entry.getKey())) {
                            this.DW = Math.max(this.DW, Long.parseLong(entry.getValue().get(0)));
                        }
                    } catch (RuntimeException unused) {
                    }
                }
                it.remove();
            }
        }
        return this.DW;
    }

    final void j6(eo0 eo0Var) {
        this.j6.add(eo0Var);
    }
}
