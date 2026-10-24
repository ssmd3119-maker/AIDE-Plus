package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import javax.annotation.concurrent.GuardedBy;

@jg
/* loaded from: classes.dex */
public final class im {
    private final String VH;
    private final vm gn;
    private long j6 = -1;
    private long DW = -1;

    @GuardedBy("mLock")
    private int FH = -1;
    int Hw = -1;
    private long v5 = 0;
    private final Object Zo = new Object();

    @GuardedBy("mLock")
    private int u7 = 0;

    @GuardedBy("mLock")
    private int tp = 0;

    public im(String str, vm vmVar) {
        this.VH = str;
        this.gn = vmVar;
    }

    private static boolean j6(Context context) {
        int identifier = context.getResources().getIdentifier("Theme.Translucent", "style", "android");
        if (identifier == 0) {
            xp.gn("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        try {
            if (identifier == context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                return true;
            }
            xp.gn("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            xp.u7("Fail to fetch AdActivity theme");
            xp.gn("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
    }

    public final void DW(zzwb zzwbVar, long j) {
        synchronized (this.Zo) {
            long jYS = this.gn.yS();
            long jJ6 = com.google.android.gms.ads.internal.w0.we().j6();
            if (this.DW == -1) {
                if (jJ6 - jYS > ((Long) cw0.v5().FH(p.ye)).longValue()) {
                    this.Hw = -1;
                } else {
                    this.Hw = this.gn.a8();
                }
                this.DW = j;
                this.j6 = j;
            } else {
                this.j6 = j;
            }
            if (zzwbVar == null || zzwbVar.jw == null || zzwbVar.jw.getInt("gw", 2) != 1) {
                this.FH++;
                int i = this.Hw + 1;
                this.Hw = i;
                if (i == 0) {
                    this.v5 = 0L;
                    this.gn.Zo(jJ6);
                } else {
                    this.v5 = jJ6 - this.gn.aM();
                }
            }
        }
    }

    public final Bundle FH(Context context, String str) {
        Bundle bundle;
        synchronized (this.Zo) {
            bundle = new Bundle();
            bundle.putString("session_id", this.VH);
            bundle.putLong("basets", this.DW);
            bundle.putLong("currts", this.j6);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.FH);
            bundle.putInt("preqs_in_session", this.Hw);
            bundle.putLong("time_in_session", this.v5);
            bundle.putInt("pclick", this.u7);
            bundle.putInt("pimp", this.tp);
            bundle.putBoolean("support_transparent_background", j6(context));
        }
        return bundle;
    }

    public final void Hw() {
        synchronized (this.Zo) {
            this.tp++;
        }
    }

    public final void v5() {
        synchronized (this.Zo) {
            this.u7++;
        }
    }
}
