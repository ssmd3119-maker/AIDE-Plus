package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {
    public abstract long EQ();

    public abstract long J8();

    public abstract String Ws();

    public abstract int gn();

    public String toString() {
        long jEQ = EQ();
        int iGn = gn();
        long jJ8 = J8();
        String strWs = Ws();
        StringBuilder sb = new StringBuilder(String.valueOf(strWs).length() + 53);
        sb.append(jEQ);
        sb.append("\t");
        sb.append(iGn);
        sb.append("\t");
        sb.append(jJ8);
        sb.append(strWs);
        return sb.toString();
    }
}
