package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.p;

/* loaded from: classes.dex */
public final class zzbi {
    private String value;
    private boolean zzans;
    private final /* synthetic */ zzbd zzant;
    private final String zzany;
    private final String zzoj;

    public zzbi(zzbd zzbdVar, String str, String str2) {
        this.zzant = zzbdVar;
        p.v5(str);
        this.zzoj = str;
        this.zzany = null;
    }

    public final void zzcd(String str) {
        if (zzfy.zzv(str, this.value)) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.zzant.zzju().edit();
        editorEdit.putString(this.zzoj, str);
        editorEdit.apply();
        this.value = str;
    }

    public final String zzkd() {
        if (!this.zzans) {
            this.zzans = true;
            this.value = this.zzant.zzju().getString(this.zzoj, null);
        }
        return this.value;
    }
}
