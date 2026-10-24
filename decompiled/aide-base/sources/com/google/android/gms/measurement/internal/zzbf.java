package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.p;

/* loaded from: classes.dex */
public final class zzbf {
    private boolean value;
    private final boolean zzanr;
    private boolean zzans;
    private final /* synthetic */ zzbd zzant;
    private final String zzoj;

    public zzbf(zzbd zzbdVar, String str, boolean z) {
        this.zzant = zzbdVar;
        p.v5(str);
        this.zzoj = str;
        this.zzanr = true;
    }

    public final boolean get() {
        if (!this.zzans) {
            this.zzans = true;
            this.value = this.zzant.zzju().getBoolean(this.zzoj, this.zzanr);
        }
        return this.value;
    }

    public final void set(boolean z) {
        SharedPreferences.Editor editorEdit = this.zzant.zzju().edit();
        editorEdit.putBoolean(this.zzoj, z);
        editorEdit.apply();
        this.value = z;
    }
}
