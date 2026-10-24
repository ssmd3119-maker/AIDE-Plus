package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.internal.o0;
import javax.annotation.concurrent.GuardedBy;

@Deprecated
/* loaded from: classes.dex */
public final class c {
    private static final Object Hw = new Object();

    @GuardedBy("sLock")
    private static c v5;
    private final Status DW;
    private final boolean FH;
    private final String j6;

    c(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(com.google.android.gms.common.i.common_google_play_services_unknown_issue));
        if (identifier != 0) {
            this.FH = !(resources.getInteger(identifier) != 0);
        } else {
            this.FH = false;
        }
        String strJ6 = o0.j6(context);
        strJ6 = strJ6 == null ? new StringResourceValueReader(context).j6("google_app_id") : strJ6;
        if (TextUtils.isEmpty(strJ6)) {
            this.DW = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.j6 = null;
        } else {
            this.j6 = strJ6;
            this.DW = Status.qp;
        }
    }

    public static String DW() {
        return j6("getGoogleAppId").j6;
    }

    public static Status FH(Context context) {
        Status status;
        com.google.android.gms.common.internal.p.tp(context, "Context must not be null.");
        synchronized (Hw) {
            if (v5 == null) {
                v5 = new c(context);
            }
            status = v5.DW;
        }
        return status;
    }

    public static boolean Hw() {
        return j6("isMeasurementExplicitlyDisabled").FH;
    }

    private static c j6(String str) {
        c cVar;
        synchronized (Hw) {
            if (v5 == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
                sb.append("Initialize must be called before ");
                sb.append(str);
                sb.append(".");
                throw new IllegalStateException(sb.toString());
            }
            cVar = v5;
        }
        return cVar;
    }
}
