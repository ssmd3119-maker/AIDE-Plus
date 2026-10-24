package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class k2 implements w1 {
    static final Map<String, k2> Zo = new HashMap();
    private volatile Map<String, ?> Hw;
    private final SharedPreferences j6;
    private final SharedPreferences.OnSharedPreferenceChangeListener DW = new SharedPreferences.OnSharedPreferenceChangeListener(this) { // from class: com.google.android.gms.internal.measurement.l2
        private final k2 WB;

        {
            this.WB = this;
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            this.WB.DW(sharedPreferences, str);
        }
    };
    private final Object FH = new Object();
    private final List<v1> v5 = new ArrayList();

    private k2(SharedPreferences sharedPreferences) {
        this.j6 = sharedPreferences;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this.DW);
    }

    static k2 FH(Context context, String str) {
        k2 k2Var;
        SharedPreferences sharedPreferences;
        if (!((!q1.Hw() || str.startsWith("direct_boot:")) ? true : q1.j6(context))) {
            return null;
        }
        synchronized (k2.class) {
            k2Var = Zo.get(str);
            if (k2Var == null) {
                if (str.startsWith("direct_boot:")) {
                    if (q1.Hw()) {
                        context = context.createDeviceProtectedStorageContext();
                    }
                    sharedPreferences = context.getSharedPreferences(str.substring(12), 0);
                } else {
                    sharedPreferences = context.getSharedPreferences(str, 0);
                }
                k2Var = new k2(sharedPreferences);
                Zo.put(str, k2Var);
            }
        }
        return k2Var;
    }

    final /* synthetic */ void DW(SharedPreferences sharedPreferences, String str) {
        synchronized (this.FH) {
            this.Hw = null;
            d2.QX();
        }
        synchronized (this) {
            Iterator<v1> it = this.v5.iterator();
            while (it.hasNext()) {
                it.next().j6();
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.w1
    public final Object j6(String str) {
        Map<String, ?> all = this.Hw;
        if (all == null) {
            synchronized (this.FH) {
                all = this.Hw;
                if (all == null) {
                    all = this.j6.getAll();
                    this.Hw = all;
                }
            }
        }
        if (all != null) {
            return all.get(str);
        }
        return null;
    }
}
