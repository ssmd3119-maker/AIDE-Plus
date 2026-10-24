package com.google.android.gms.ads.internal.gmsg;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.w0;
import com.google.android.gms.internal.ads.bn;
import com.google.android.gms.internal.ads.cv;
import com.google.android.gms.internal.ads.xp;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class a0 implements b0<cv> {
    a0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.ads.internal.gmsg.b0
    public final /* synthetic */ void zza(cv cvVar, Map map) {
        cv cvVar2 = cvVar;
        WindowManager windowManager = (WindowManager) cvVar2.getContext().getSystemService("window");
        w0.v5();
        DisplayMetrics displayMetricsFH = bn.FH(windowManager);
        int i = displayMetricsFH.widthPixels;
        int i2 = displayMetricsFH.heightPixels;
        int[] iArr = new int[2];
        HashMap map2 = new HashMap();
        ((View) cvVar2).getLocationInWindow(iArr);
        map2.put("xInPixels", Integer.valueOf(iArr[0]));
        map2.put("yInPixels", Integer.valueOf(iArr[1]));
        map2.put("windowWidthInPixels", Integer.valueOf(i));
        map2.put("windowHeightInPixels", Integer.valueOf(i2));
        cvVar2.v5("locationReady", map2);
        xp.u7("GET LOCATION COMPILED");
    }
}
