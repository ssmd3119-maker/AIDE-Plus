package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class go0 extends fo0 {
    public final int WB;

    public go0(int i, Map<String, List<String>> map, bo0 bo0Var) {
        StringBuilder sb = new StringBuilder(26);
        sb.append("Response code: ");
        sb.append(i);
        super(sb.toString(), bo0Var, 1);
        this.WB = i;
    }
}
