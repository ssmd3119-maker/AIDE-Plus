package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.google.android.gms.common.stats.a;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.b;
import com.google.android.gms.internal.measurement.p3;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbj {
    final zzbw zzada;

    zzbj(zzbw zzbwVar) {
        this.zzada = zzbwVar;
    }

    private final boolean zzke() {
        try {
            PackageManagerWrapper packageManagerWrapperJ6 = b.j6(this.zzada.getContext());
            if (packageManagerWrapperJ6 != null) {
                return packageManagerWrapperJ6.v5("com.android.vending", 128).versionCode >= 80837300;
            }
            this.zzada.zzgt().zzjm().zzby("Failed to retrieve Package Manager to check Play Store compatibility");
            return false;
        } catch (Exception e) {
            this.zzada.zzgt().zzjm().zzg("Failed to retrieve Play Store version", e);
            return false;
        }
    }

    final Bundle zza(String str, p3 p3Var) {
        this.zzada.zzgs().zzaf();
        if (p3Var == null) {
            this.zzada.zzgt().zzjj().zzby("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle bundlePt = p3Var.Pt(bundle);
            if (bundlePt != null) {
                return bundlePt;
            }
            this.zzada.zzgt().zzjg().zzby("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e) {
            this.zzada.zzgt().zzjg().zzg("Exception occurred while retrieving the Install Referrer", e.getMessage());
            return null;
        }
    }

    protected final void zzce(String str) {
        if (str == null || str.isEmpty()) {
            this.zzada.zzgt().zzjm().zzby("Install Referrer Reporter was called with invalid app package name");
            return;
        }
        this.zzada.zzgs().zzaf();
        if (!zzke()) {
            this.zzada.zzgt().zzjm().zzby("Install Referrer Reporter is not available");
            return;
        }
        this.zzada.zzgt().zzjm().zzby("Install Referrer Reporter is initializing");
        zzbk zzbkVar = new zzbk(this, str);
        this.zzada.zzgs().zzaf();
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        PackageManager packageManager = this.zzada.getContext().getPackageManager();
        if (packageManager == null) {
            this.zzada.zzgt().zzjj().zzby("Failed to obtain Package Manager to verify binding conditions");
            return;
        }
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            this.zzada.zzgt().zzjm().zzby("Play Service for fetching Install Referrer is unavailable on device");
            return;
        }
        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
        if (serviceInfo != null) {
            String str2 = serviceInfo.packageName;
            if (serviceInfo.name == null || !"com.android.vending".equals(str2) || !zzke()) {
                this.zzada.zzgt().zzjm().zzby("Play Store missing or incompatible. Version 8.3.73 or later required");
                return;
            }
            try {
                this.zzada.zzgt().zzjm().zzg("Install Referrer Service is", a.DW().j6(this.zzada.getContext(), new Intent(intent), zzbkVar, 1) ? "available" : "not available");
            } catch (Exception e) {
                this.zzada.zzgt().zzjg().zzg("Exception occurred while binding to Install Referrer Service", e.getMessage());
            }
        }
    }
}
