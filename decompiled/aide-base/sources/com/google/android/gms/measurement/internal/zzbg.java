package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.p;

/* loaded from: classes.dex */
public final class zzbg {
    private long value;
    private boolean zzans;
    private final /* synthetic */ zzbd zzant;
    private final long zzanu;
    private final String zzoj;

    public zzbg(zzbd zzbdVar, String str, long j) {
        this.zzant = zzbdVar;
        p.v5(str);
        this.zzoj = str;
        this.zzanu = j;
    }

    public final long get() {
        if (!this.zzans) {
            this.zzans = true;
            this.value = this.zzant.zzju().getLong(this.zzoj, this.zzanu);
        }
        return this.value;
    }

    public final void set(long j) {
        SharedPreferences.Editor editorEdit = this.zzant.zzju().edit();
        editorEdit.putLong(this.zzoj, j);
        editorEdit.apply();
        this.value = j;
    }
}
