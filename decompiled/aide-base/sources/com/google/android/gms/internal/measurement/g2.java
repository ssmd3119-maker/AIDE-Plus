package com.google.android.gms.internal.measurement;

import android.util.Log;

/* loaded from: classes.dex */
public final class g2 extends d2<Boolean> {
    g2(j2 j2Var, String str, Boolean bool) {
        super(j2Var, str, bool, null);
    }

    @Override // com.google.android.gms.internal.measurement.d2
    final /* synthetic */ Boolean Ws(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (o1.FH.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (o1.Hw.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        String strXL = super.XL();
        String strValueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(strXL).length() + 28 + String.valueOf(strValueOf).length());
        sb.append("Invalid boolean value for ");
        sb.append(strXL);
        sb.append(": ");
        sb.append(strValueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
