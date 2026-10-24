package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class lo {
    private final List<String> j6 = new ArrayList();
    private final List<Double> DW = new ArrayList();
    private final List<Double> FH = new ArrayList();

    public final io FH() {
        return new io(this);
    }

    public final lo j6(String str, double d, double d2) {
        int i = 0;
        while (i < this.j6.size()) {
            double dDoubleValue = this.FH.get(i).doubleValue();
            double dDoubleValue2 = this.DW.get(i).doubleValue();
            if (d < dDoubleValue || (dDoubleValue == d && d2 < dDoubleValue2)) {
                break;
            }
            i++;
        }
        this.j6.add(i, str);
        this.FH.add(i, Double.valueOf(d));
        this.DW.add(i, Double.valueOf(d2));
        return this;
    }
}
