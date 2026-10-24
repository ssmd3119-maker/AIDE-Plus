package com.google.android.gms.ads.internal.gmsg;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.w0;
import com.google.android.gms.internal.ads.cv;
import com.google.android.gms.internal.ads.jg;
import com.google.android.gms.internal.ads.xp;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;

@jg
/* loaded from: classes.dex */
public final class l implements b0<cv> {
    @Override // com.google.android.gms.ads.internal.gmsg.b0
    public final /* synthetic */ void zza(cv cvVar, Map map) throws NumberFormatException {
        cv cvVar2 = cvVar;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get(AppMeasurement.Param.TIMESTAMP);
            if (TextUtils.isEmpty(str2)) {
                xp.u7("No label given for CSI tick.");
                return;
            }
            if (TextUtils.isEmpty(str4)) {
                xp.u7("No timestamp given for CSI tick.");
                return;
            }
            try {
                long jDW = w0.we().DW() + (Long.parseLong(str4) - w0.we().j6());
                if (TextUtils.isEmpty(str3)) {
                    str3 = "native:view_load";
                }
                cvVar2.pN().DW(str2, str3, jDW);
                return;
            } catch (NumberFormatException e) {
                xp.v5("Malformed timestamp for CSI tick.", e);
                return;
            }
        }
        if ("experiment".equals(str)) {
            String str5 = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            if (TextUtils.isEmpty(str5)) {
                xp.u7("No value given for CSI experiment.");
                return;
            }
            com.google.android.gms.internal.ads.d0 d0VarFH = cvVar2.pN().FH();
            if (d0VarFH == null) {
                xp.u7("No ticker for WebView, dropping experiment ID.");
                return;
            } else {
                d0VarFH.Zo("e", str5);
                return;
            }
        }
        if ("extra".equals(str)) {
            String str6 = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
            String str7 = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            if (TextUtils.isEmpty(str7)) {
                xp.u7("No value given for CSI extra.");
                return;
            }
            if (TextUtils.isEmpty(str6)) {
                xp.u7("No name given for CSI extra.");
                return;
            }
            com.google.android.gms.internal.ads.d0 d0VarFH2 = cvVar2.pN().FH();
            if (d0VarFH2 == null) {
                xp.u7("No ticker for WebView, dropping extra parameter.");
            } else {
                d0VarFH2.Zo(str6, str7);
            }
        }
    }
}
