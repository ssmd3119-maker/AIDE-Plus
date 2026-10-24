package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class dm {
    private hq0 DW;
    private vq<ArrayList<String>> J0;
    private zzbbi VH;
    private Context Zo;
    private final Object j6 = new Object();
    private final wm FH = new wm();
    private final mm Hw = new mm(cw0.Zo(), this.FH);
    private boolean v5 = false;

    @Nullable
    private s gn = null;

    @Nullable
    private Boolean u7 = null;
    private final AtomicInteger tp = new AtomicInteger(0);
    private final gm EQ = new gm(null);
    private final Object we = new Object();

    @TargetApi(16)
    private static ArrayList<String> Zo(Context context) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            PackageInfo packageInfoV5 = com.google.android.gms.common.wrappers.b.j6(context).v5(context.getApplicationInfo().packageName, 4096);
            if (packageInfoV5.requestedPermissions != null && packageInfoV5.requestedPermissionsFlags != null) {
                int i = 0;
                while (true) {
                    String[] strArr = packageInfoV5.requestedPermissions;
                    if (i >= strArr.length) {
                        break;
                    }
                    if ((packageInfoV5.requestedPermissionsFlags[i] & 2) != 0) {
                        arrayList.add(strArr[i]);
                    }
                    i++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    @Nullable
    public final Resources DW() {
        if (this.VH.fY) {
            return this.Zo.getResources();
        }
        try {
            yp.DW(this.Zo).getResources();
            return null;
        } catch (aq e) {
            xp.v5("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    public final void Hw(Boolean bool) {
        synchronized (this.j6) {
            this.u7 = bool;
        }
    }

    @Nullable
    public final s J0() {
        s sVar;
        synchronized (this.j6) {
            sVar = this.gn;
        }
        return sVar;
    }

    public final Boolean J8() {
        Boolean bool;
        synchronized (this.j6) {
            bool = this.u7;
        }
        return bool;
    }

    public final void Mr() {
        this.tp.decrementAndGet();
    }

    public final boolean QX() {
        return this.EQ.Hw();
    }

    public final int U2() {
        return this.tp.get();
    }

    public final void VH(boolean z) {
        this.EQ.j6(z);
    }

    public final boolean Ws() {
        return this.EQ.FH();
    }

    public final void XL() {
        this.EQ.v5();
    }

    @Deprecated
    public final vm a8() {
        wm wmVar;
        synchronized (this.j6) {
            wmVar = this.FH;
        }
        return wmVar;
    }

    public final hq0 aM() {
        return this.DW;
    }

    final /* synthetic */ ArrayList er() {
        return Zo(gj.FH(this.Zo));
    }

    public final void j3() {
        this.tp.incrementAndGet();
    }

    @Nullable
    public final Context j6() {
        return this.Zo;
    }

    public final vq<ArrayList<String>> lg() {
        if (com.google.android.gms.common.util.o.FH() && this.Zo != null) {
            if (!((Boolean) cw0.v5().FH(p.Za)).booleanValue()) {
                synchronized (this.we) {
                    if (this.J0 != null) {
                        return this.J0;
                    }
                    vq<ArrayList<String>> vqVarJ6 = zm.j6(new Callable(this) { // from class: com.google.android.gms.internal.ads.em
                        private final dm j6;

                        {
                            this.j6 = this;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.j6.er();
                        }
                    });
                    this.J0 = vqVarJ6;
                    return vqVarJ6;
                }
            }
        }
        return jq.J0(new ArrayList());
    }

    public final mm rN() {
        return this.Hw;
    }

    public final void u7(Throwable th, String str) {
        dg.v5(this.Zo, this.VH).DW(th, str, ((Float) cw0.v5().FH(p.VH)).floatValue());
    }

    public final void v5(Throwable th, String str) {
        dg.v5(this.Zo, this.VH).j6(th, str);
    }

    @TargetApi(23)
    public final void we(Context context, zzbbi zzbbiVar) {
        synchronized (this.j6) {
            if (!this.v5) {
                this.Zo = context.getApplicationContext();
                this.VH = zzbbiVar;
                com.google.android.gms.ads.internal.w0.gn().Hw(this.Hw);
                s sVar = null;
                this.FH.P8(this.Zo, null, true);
                dg.v5(this.Zo, this.VH);
                com.google.android.gms.ads.internal.w0.v5().Eq(context, zzbbiVar.WB);
                this.DW = new hq0(context.getApplicationContext(), this.VH);
                com.google.android.gms.ads.internal.w0.J8();
                if (((Boolean) cw0.v5().FH(p.sh)).booleanValue()) {
                    sVar = new s();
                } else {
                    sm.we("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                }
                this.gn = sVar;
                if (sVar != null) {
                    hq.j6((vq) new fm(this).VH(), "AppState.registerCsiReporter");
                }
                this.v5 = true;
                lg();
            }
        }
    }
}
