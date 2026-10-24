package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.p;

/* loaded from: classes.dex */
public final class zzbh {
    private final long zzabv;
    private final /* synthetic */ zzbd zzant;
    private final String zzanv;
    private final String zzanw;
    private final String zzanx;

    private zzbh(zzbd zzbdVar, String str, long j) {
        this.zzant = zzbdVar;
        p.v5(str);
        p.j6(j > 0);
        this.zzanv = String.valueOf(str).concat(":start");
        this.zzanw = String.valueOf(str).concat(":count");
        this.zzanx = String.valueOf(str).concat(":value");
        this.zzabv = j;
    }

    private final void zzfl() {
        this.zzant.zzaf();
        long jJ6 = this.zzant.zzbx().j6();
        SharedPreferences.Editor editorEdit = this.zzant.zzju().edit();
        editorEdit.remove(this.zzanw);
        editorEdit.remove(this.zzanx);
        editorEdit.putLong(this.zzanv, jJ6);
        editorEdit.apply();
    }

    private final long zzfn() {
        return this.zzant.zzju().getLong(this.zzanv, 0L);
    }

    public final void zzc(String str, long j) {
        this.zzant.zzaf();
        if (zzfn() == 0) {
            zzfl();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.zzant.zzju().getLong(this.zzanw, 0L);
        if (j2 <= 0) {
            SharedPreferences.Editor editorEdit = this.zzant.zzju().edit();
            editorEdit.putString(this.zzanx, str);
            editorEdit.putLong(this.zzanw, 1L);
            editorEdit.apply();
            return;
        }
        long j3 = j2 + 1;
        boolean z = (this.zzant.zzgr().zzmk().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j3;
        SharedPreferences.Editor editorEdit2 = this.zzant.zzju().edit();
        if (z) {
            editorEdit2.putString(this.zzanx, str);
        }
        editorEdit2.putLong(this.zzanw, j3);
        editorEdit2.apply();
    }

    public final Pair<String, Long> zzfm() {
        long jAbs;
        this.zzant.zzaf();
        this.zzant.zzaf();
        long jZzfn = zzfn();
        if (jZzfn == 0) {
            zzfl();
            jAbs = 0;
        } else {
            jAbs = Math.abs(jZzfn - this.zzant.zzbx().j6());
        }
        long j = this.zzabv;
        if (jAbs < j) {
            return null;
        }
        if (jAbs > (j << 1)) {
            zzfl();
            return null;
        }
        String string = this.zzant.zzju().getString(this.zzanx, null);
        long j2 = this.zzant.zzju().getLong(this.zzanw, 0L);
        zzfl();
        return (string == null || j2 <= 0) ? zzbd.zzamy : new Pair<>(string, Long.valueOf(j2));
    }
}
