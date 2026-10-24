package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.d;
import com.google.android.gms.ads.formats.e;
import com.google.android.gms.ads.formats.f;
import com.google.android.gms.ads.formats.g;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.internal.ads.cw0;
import com.google.android.gms.internal.ads.fy0;
import com.google.android.gms.internal.ads.h4;
import com.google.android.gms.internal.ads.i4;
import com.google.android.gms.internal.ads.j4;
import com.google.android.gms.internal.ads.ja;
import com.google.android.gms.internal.ads.k4;
import com.google.android.gms.internal.ads.kv0;
import com.google.android.gms.internal.ads.l4;
import com.google.android.gms.internal.ads.mw0;
import com.google.android.gms.internal.ads.pw0;
import com.google.android.gms.internal.ads.rv0;
import com.google.android.gms.internal.ads.xp;
import com.google.android.gms.internal.ads.zzacp;

/* loaded from: classes.dex */
public class b {
    private final mw0 DW;
    private final Context j6;

    b(Context context, mw0 mw0Var) {
        this(context, mw0Var, rv0.j6);
    }

    private final void DW(fy0 fy0Var) {
        try {
            this.DW.p4(rv0.j6(this.j6, fy0Var));
        } catch (RemoteException e) {
            xp.Hw("Failed to load ad.", e);
        }
    }

    public void j6(c cVar) {
        DW(cVar.j6());
    }

    private b(Context context, mw0 mw0Var, rv0 rv0Var) {
        this.j6 = context;
        this.DW = mw0Var;
    }

    public static class a {
        private final pw0 DW;
        private final Context j6;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Context context, String str) {
            this(context, cw0.DW().Zo(context, str, new ja()));
            p.tp(context, "context cannot be null");
        }

        @Deprecated
        public a DW(d.a aVar) {
            try {
                this.DW.yr(new h4(aVar));
            } catch (RemoteException e) {
                xp.v5("Failed to add app install ad listener", e);
            }
            return this;
        }

        @Deprecated
        public a FH(e.a aVar) {
            try {
                this.DW.uM(new i4(aVar));
            } catch (RemoteException e) {
                xp.v5("Failed to add content ad listener", e);
            }
            return this;
        }

        public a Hw(String str, f.b bVar, f.a aVar) {
            try {
                this.DW.wC(str, new k4(bVar), aVar == null ? null : new j4(aVar));
            } catch (RemoteException e) {
                xp.v5("Failed to add custom template ad listener", e);
            }
            return this;
        }

        public a VH(com.google.android.gms.ads.formats.b bVar) {
            try {
                this.DW.D5(new zzacp(bVar));
            } catch (RemoteException e) {
                xp.v5("Failed to specify native ad options", e);
            }
            return this;
        }

        public a Zo(com.google.android.gms.ads.a aVar) {
            try {
                this.DW.eJ(new kv0(aVar));
            } catch (RemoteException e) {
                xp.v5("Failed to set AdListener.", e);
            }
            return this;
        }

        public b j6() {
            try {
                return new b(this.j6, this.DW.tj());
            } catch (RemoteException e) {
                xp.Hw("Failed to build AdLoader.", e);
                return null;
            }
        }

        public a v5(g.a aVar) {
            try {
                this.DW.fP(new l4(aVar));
            } catch (RemoteException e) {
                xp.v5("Failed to add google native ad listener", e);
            }
            return this;
        }

        private a(Context context, pw0 pw0Var) {
            this.j6 = context;
            this.DW = pw0Var;
        }
    }
}
