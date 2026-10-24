package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.internal.p;

/* loaded from: classes.dex */
public final class zzbm {
    private final zzbp zzaod;

    public zzbm(zzbp zzbpVar) {
        p.u7(zzbpVar);
        this.zzaod = zzbpVar;
    }

    public static boolean zza(Context context) {
        ActivityInfo receiverInfo;
        p.u7(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public final void onReceive(Context context, Intent intent) {
        zzbw zzbwVarZza = zzbw.zza(context, (zzan) null);
        zzas zzasVarZzgt = zzbwVarZza.zzgt();
        if (intent == null) {
            zzasVarZzgt.zzjj().zzby("Receiver called with null intent");
            return;
        }
        zzbwVarZza.zzgw();
        String action = intent.getAction();
        zzasVarZzgt.zzjo().zzg("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            zzasVarZzgt.zzjo().zzby("Starting wakeful intent.");
            this.zzaod.doStartService(context, className);
            return;
        }
        if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            try {
                zzbwVarZza.zzgs().zzc(new zzbn(this, zzbwVarZza, zzasVarZzgt));
            } catch (Exception e) {
                zzasVarZzgt.zzjj().zzg("Install Referrer Reporter encountered a problem", e);
            }
            BroadcastReceiver.PendingResult pendingResultDoGoAsync = this.zzaod.doGoAsync();
            String stringExtra = intent.getStringExtra("referrer");
            if (stringExtra == null) {
                zzasVarZzgt.zzjo().zzby("Install referrer extras are null");
                if (pendingResultDoGoAsync != null) {
                    pendingResultDoGoAsync.finish();
                    return;
                }
                return;
            }
            zzasVarZzgt.zzjm().zzg("Install referrer extras are", stringExtra);
            if (!stringExtra.contains("?")) {
                String strValueOf = String.valueOf(stringExtra);
                stringExtra = strValueOf.length() != 0 ? "?".concat(strValueOf) : new String("?");
            }
            Bundle bundleZza = zzbwVarZza.zzgr().zza(Uri.parse(stringExtra));
            if (bundleZza == null) {
                zzasVarZzgt.zzjo().zzby("No campaign defined in install referrer broadcast");
                if (pendingResultDoGoAsync != null) {
                    pendingResultDoGoAsync.finish();
                    return;
                }
                return;
            }
            long longExtra = intent.getLongExtra("referrer_timestamp_seconds", 0L) * 1000;
            if (longExtra == 0) {
                zzasVarZzgt.zzjj().zzby("Install referrer is missing timestamp");
            }
            zzbwVarZza.zzgs().zzc(new zzbo(this, zzbwVarZza, longExtra, bundleZza, context, zzasVarZzgt, pendingResultDoGoAsync));
        }
    }
}
