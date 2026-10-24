package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.util.Log;
import androidx.core.content.PermissionChecker;

/* loaded from: classes.dex */
public final class z1 implements w1 {
    static z1 DW;
    private final Context j6;

    private z1(Context context) {
        this.j6 = context;
        context.getContentResolver().registerContentObserver(o1.j6, true, new b2(this, null));
    }

    static z1 DW(Context context) {
        z1 z1Var;
        synchronized (z1.class) {
            if (DW == null) {
                DW = PermissionChecker.checkSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new z1(context) : new z1();
            }
            z1Var = DW;
        }
        return z1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.w1
    /* renamed from: FH, reason: merged with bridge method [inline-methods] */
    public final String j6(final String str) {
        if (this.j6 == null) {
            return null;
        }
        try {
            return (String) x1.j6(new y1(this, str) { // from class: com.google.android.gms.internal.measurement.a2
                private final String DW;
                private final z1 j6;

                {
                    this.j6 = this;
                    this.DW = str;
                }

                @Override // com.google.android.gms.internal.measurement.y1
                public final Object j6() {
                    return this.j6.Hw(this.DW);
                }
            });
        } catch (SecurityException e) {
            String strValueOf = String.valueOf(str);
            Log.e("GservicesLoader", strValueOf.length() != 0 ? "Unable to read GServices for: ".concat(strValueOf) : new String("Unable to read GServices for: "), e);
            return null;
        }
    }

    final /* synthetic */ String Hw(String str) {
        return o1.j6(this.j6.getContentResolver(), str, null);
    }

    private z1() {
        this.j6 = null;
    }
}
