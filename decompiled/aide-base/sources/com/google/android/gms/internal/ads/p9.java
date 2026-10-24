package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

@jg
/* loaded from: classes.dex */
public final class p9 extends hx {

    @GuardedBy("lock")
    private static p9 jw;
    private static final Object mb = new Object();
    private final AppMeasurementSdk WB;

    private p9(AppMeasurementSdk appMeasurementSdk) {
        this.WB = appMeasurementSdk;
    }

    static final /* synthetic */ void Mt(Context context, p9 p9Var) {
        try {
            ((ix) yp.j6(context, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", r9.j6)).jc(p9Var);
        } catch (RemoteException | aq | NullPointerException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    public static void k6(final Context context, String str, Bundle bundle) {
        synchronized (mb) {
            if (jw != null) {
                return;
            }
            final p9 p9Var = new p9(AppMeasurementSdk.getInstance(context, "Ads", "am", str, bundle));
            jw = p9Var;
            new Thread(new Runnable(context, p9Var) { // from class: com.google.android.gms.internal.ads.q9
                private final Context WB;
                private final p9 mb;

                {
                    this.WB = context;
                    this.mb = p9Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    p9.Mt(this.WB, this.mb);
                }
            }).start();
        }
    }

    @Override // com.google.android.gms.internal.ads.gx
    public final void IJ(String str, String str2, abcd.wu wuVar) {
        this.WB.setUserProperty(str, str2, wuVar != null ? abcd.xu.g3(wuVar) : null);
    }

    @Override // com.google.android.gms.internal.ads.gx
    public final void LB(Bundle bundle) {
        this.WB.setConditionalUserProperty(bundle);
    }

    @Override // com.google.android.gms.internal.ads.gx
    public final Bundle Na(Bundle bundle) {
        return this.WB.performActionWithResponse(bundle);
    }

    @Override // com.google.android.gms.internal.ads.gx
    public final void Ph(String str) {
        this.WB.endAdUnitExposure(str);
    }

    @Override // com.google.android.gms.internal.ads.gx
    public final String Py() {
        return this.WB.getCurrentScreenClass();
    }

    @Override // com.google.android.gms.internal.ads.gx
    public final String Sx() {
        return this.WB.getAppInstanceId();
    }

    @Override // com.google.android.gms.internal.ads.gx
    public final long XF() {
        return this.WB.generateEventId();
    }

    @Override // com.google.android.gms.internal.ads.gx
    public final Map eX(String str, String str2, boolean z) {
        return this.WB.getUserProperties(str, str2, z);
    }

    @Override // com.google.android.gms.internal.ads.gx
    public final void hg(abcd.wu wuVar, String str, String str2) {
        this.WB.setCurrentScreen(wuVar != null ? (Activity) abcd.xu.g3(wuVar) : null, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.gx
    public final void iK(Bundle bundle) {
        this.WB.performAction(bundle);
    }

    @Override // com.google.android.gms.internal.ads.gx
    public final String jY() {
        return this.WB.getGmpAppId();
    }

    @Override // com.google.android.gms.internal.ads.gx
    public final String ja() {
        return this.WB.getAppIdOrigin();
    }

    @Override // com.google.android.gms.internal.ads.gx
    public final int jj(String str) {
        return this.WB.getMaxUserProperties(str);
    }

    @Override // com.google.android.gms.internal.ads.gx
    public final void lG(String str, String str2, Bundle bundle) {
        this.WB.logEvent(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.gx
    public final void nK(String str) {
        this.WB.beginAdUnitExposure(str);
    }

    @Override // com.google.android.gms.internal.ads.gx
    public final String sR() {
        return this.WB.getCurrentScreenName();
    }

    @Override // com.google.android.gms.internal.ads.gx
    public final void sg(String str, String str2, Bundle bundle) {
        this.WB.clearConditionalUserProperty(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.gx
    public final List th(String str, String str2) {
        return this.WB.getConditionalUserProperties(str, str2);
    }
}
