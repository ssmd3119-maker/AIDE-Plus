package com.google.android.gms.internal.measurement;

import android.util.Log;

/* loaded from: classes.dex */
public final class f2 extends d2<Integer> {
    f2(j2 j2Var, String str, Integer num) {
        super(j2Var, str, num, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.d2
    /* renamed from: Mr, reason: merged with bridge method [inline-methods] */
    public final Integer Ws(Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Long) {
            return Integer.valueOf(((Long) obj).intValue());
        }
        if (obj instanceof String) {
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String strXL = super.XL();
        String strValueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(strXL).length() + 24 + String.valueOf(strValueOf).length());
        sb.append("Invalid int value for ");
        sb.append(strXL);
        sb.append(": ");
        sb.append(strValueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
