package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class qv implements com.google.android.gms.ads.internal.gmsg.b0<cv> {
    private final /* synthetic */ pv j6;

    qv(pv pvVar) {
        this.j6 = pvVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.b0
    public final /* synthetic */ void zza(cv cvVar, Map map) throws NumberFormatException {
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int i = Integer.parseInt(str);
                synchronized (this.j6) {
                    if (this.j6.aX != i) {
                        this.j6.aX = i;
                        this.j6.requestLayout();
                    }
                }
            } catch (Exception e) {
                xp.v5("Exception occurred while getting webview content height", e);
            }
        }
    }
}
