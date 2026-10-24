package com.google.android.gms.common.api;

import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.e0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c extends Exception {
    private final ArrayMap<e0<?>, ConnectionResult> WB;

    public c(ArrayMap<e0<?>, ConnectionResult> arrayMap) {
        this.WB = arrayMap;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (e0<?> e0Var : this.WB.keySet()) {
            ConnectionResult connectionResult = this.WB.get(e0Var);
            if (connectionResult.QX()) {
                z = false;
            }
            String strJ6 = e0Var.j6();
            String strValueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(strJ6).length() + 2 + String.valueOf(strValueOf).length());
            sb.append(strJ6);
            sb.append(": ");
            sb.append(strValueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
