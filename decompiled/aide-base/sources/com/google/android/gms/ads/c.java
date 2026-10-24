package com.google.android.gms.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.fy0;
import com.google.android.gms.internal.ads.gy0;
import java.util.Date;

/* loaded from: classes.dex */
public final class c {
    private final fy0 j6;

    public static final class a {
        private final gy0 j6;

        public a() {
            gy0 gy0Var = new gy0();
            this.j6 = gy0Var;
            gy0Var.VH("B3EEABB8EE11C2BE770B684D95219ECB");
        }

        public final a DW(Class<? extends com.google.android.gms.ads.mediation.b> cls, Bundle bundle) {
            this.j6.DW(cls, bundle);
            if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
                this.j6.gn("B3EEABB8EE11C2BE770B684D95219ECB");
            }
            return this;
        }

        public final a FH(String str) {
            this.j6.VH(str);
            return this;
        }

        public final c Hw() {
            return new c(this);
        }

        @Deprecated
        public final a VH(boolean z) {
            this.j6.yS(z);
            return this;
        }

        @Deprecated
        public final a Zo(int i) {
            this.j6.tp(i);
            return this;
        }

        public final a gn(Location location) {
            this.j6.v5(location);
            return this;
        }

        public final a j6(String str) {
            this.j6.Zo(str);
            return this;
        }

        public final a u7(boolean z) {
            this.j6.er(z);
            return this;
        }

        @Deprecated
        public final a v5(Date date) {
            this.j6.FH(date);
            return this;
        }
    }

    private c(a aVar) {
        this.j6 = new fy0(aVar.j6);
    }

    public final fy0 j6() {
        return this.j6;
    }
}
