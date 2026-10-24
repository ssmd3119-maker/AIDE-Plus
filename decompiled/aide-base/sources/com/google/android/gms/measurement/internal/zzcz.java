package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.p;

/* loaded from: classes.dex */
public final class zzcz {
    boolean zzadg;
    String zzadi;
    String zzaph;
    String zzapi;
    Boolean zzaqb;
    zzan zzaqw;
    final Context zzri;

    public zzcz(Context context, zzan zzanVar) {
        this.zzadg = true;
        p.u7(context);
        Context applicationContext = context.getApplicationContext();
        p.u7(applicationContext);
        this.zzri = applicationContext;
        if (zzanVar != null) {
            this.zzaqw = zzanVar;
            this.zzadi = zzanVar.zzadi;
            this.zzaph = zzanVar.origin;
            this.zzapi = zzanVar.zzadh;
            this.zzadg = zzanVar.zzadg;
            Bundle bundle = zzanVar.zzadj;
            if (bundle != null) {
                this.zzaqb = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
