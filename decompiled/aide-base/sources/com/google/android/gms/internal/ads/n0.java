package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class n0 implements wa0 {
    private CustomTabsClient DW;
    private CustomTabsServiceConnection FH;
    private o0 Hw;
    private CustomTabsSession j6;

    public static boolean VH(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
            for (int i = 0; i < listQueryIntentActivities.size(); i++) {
                if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i).activityInfo.name)) {
                    return resolveInfoResolveActivity.activityInfo.packageName.equals(ua0.j6(context));
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.wa0
    public final void DW(CustomTabsClient customTabsClient) {
        this.DW = customTabsClient;
        customTabsClient.warmup(0L);
        o0 o0Var = this.Hw;
        if (o0Var != null) {
            o0Var.DW();
        }
    }

    public final boolean FH(Uri uri, Bundle bundle, List<Bundle> list) {
        CustomTabsClient customTabsClient = this.DW;
        if (customTabsClient == null) {
            return false;
        }
        if (customTabsClient == null) {
            this.j6 = null;
        } else if (this.j6 == null) {
            this.j6 = customTabsClient.newSession(null);
        }
        CustomTabsSession customTabsSession = this.j6;
        if (customTabsSession == null) {
            return false;
        }
        return customTabsSession.mayLaunchUrl(uri, null, null);
    }

    public final void Hw(o0 o0Var) {
        this.Hw = o0Var;
    }

    public final void Zo(Activity activity) {
        String strJ6;
        if (this.DW == null && (strJ6 = ua0.j6(activity)) != null) {
            va0 va0Var = new va0(this);
            this.FH = va0Var;
            CustomTabsClient.bindCustomTabsService(activity, strJ6, va0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.wa0
    public final void j6() {
        this.DW = null;
        this.j6 = null;
        o0 o0Var = this.Hw;
        if (o0Var != null) {
            o0Var.j6();
        }
    }

    public final void v5(Activity activity) {
        CustomTabsServiceConnection customTabsServiceConnection = this.FH;
        if (customTabsServiceConnection == null) {
            return;
        }
        activity.unbindService(customTabsServiceConnection);
        this.DW = null;
        this.j6 = null;
        this.FH = null;
    }
}
