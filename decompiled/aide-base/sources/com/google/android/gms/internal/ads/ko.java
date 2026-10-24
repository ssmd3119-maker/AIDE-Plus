package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.o;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes.dex */
public final class ko {
    private final double DW;
    private final double FH;
    public final double Hw;
    public final String j6;
    public final int v5;

    public ko(String str, double d, double d2, double d3, int i) {
        this.j6 = str;
        this.FH = d;
        this.DW = d2;
        this.Hw = d3;
        this.v5 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ko)) {
            return false;
        }
        ko koVar = (ko) obj;
        return com.google.android.gms.common.internal.o.j6(this.j6, koVar.j6) && this.DW == koVar.DW && this.FH == koVar.FH && this.v5 == koVar.v5 && Double.compare(this.Hw, koVar.Hw) == 0;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.o.DW(this.j6, Double.valueOf(this.DW), Double.valueOf(this.FH), Double.valueOf(this.Hw), Integer.valueOf(this.v5));
    }

    public final String toString() {
        o.a aVarFH = com.google.android.gms.common.internal.o.FH(this);
        aVarFH.j6(AppMeasurementSdk.ConditionalUserProperty.NAME, this.j6);
        aVarFH.j6("minBound", Double.valueOf(this.FH));
        aVarFH.j6("maxBound", Double.valueOf(this.DW));
        aVarFH.j6("percent", Double.valueOf(this.Hw));
        aVarFH.j6("count", Integer.valueOf(this.v5));
        return aVarFH.toString();
    }
}
