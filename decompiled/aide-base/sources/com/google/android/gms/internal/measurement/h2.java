package com.google.android.gms.internal.measurement;

import android.util.Log;

/* loaded from: classes.dex */
public final class h2 extends d2<Double> {
    h2(j2 j2Var, String str, Double d) {
        super(j2Var, str, d, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.d2
    /* renamed from: Mr, reason: merged with bridge method [inline-methods] */
    public final Double Ws(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String strXL = super.XL();
        String strValueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(strXL).length() + 27 + String.valueOf(strValueOf).length());
        sb.append("Invalid double value for ");
        sb.append(strXL);
        sb.append(": ");
        sb.append(strValueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
