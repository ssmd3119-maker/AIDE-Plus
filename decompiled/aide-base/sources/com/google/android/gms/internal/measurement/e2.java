package com.google.android.gms.internal.measurement;

import android.util.Log;

/* loaded from: classes.dex */
public final class e2 extends d2<Long> {
    e2(j2 j2Var, String str, Long l) {
        super(j2Var, str, l, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.d2
    /* renamed from: Mr, reason: merged with bridge method [inline-methods] */
    public final Long Ws(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String strXL = super.XL();
        String strValueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(strXL).length() + 25 + String.valueOf(strValueOf).length());
        sb.append("Invalid long value for ");
        sb.append(strXL);
        sb.append(": ");
        sb.append(strValueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
