package com.google.android.gms.ads.identifier;

import abcd.cv;
import abcd.dv;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;
import com.google.android.gms.common.internal.p;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class AdvertisingIdClient {

    @GuardedBy("this")
    private cv DW;

    @GuardedBy("this")
    private boolean FH;
    private final Object Hw;
    private final boolean VH;

    @GuardedBy("this")
    private final Context Zo;
    private final long gn;

    @GuardedBy("this")
    private com.google.android.gms.common.a j6;

    @GuardedBy("mAutoDisconnectTaskLock")
    private b v5;

    public static final class a {
        private final boolean DW;
        private final String j6;

        public a(String str, boolean z) {
            this.j6 = str;
            this.DW = z;
        }

        public final boolean DW() {
            return this.DW;
        }

        public final String j6() {
            return this.j6;
        }

        public final String toString() {
            String str = this.j6;
            boolean z = this.DW;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    static class b extends Thread {
        private WeakReference<AdvertisingIdClient> WB;
        private long mb;
        CountDownLatch jw = new CountDownLatch(1);
        boolean fY = false;

        public b(AdvertisingIdClient advertisingIdClient, long j) {
            this.WB = new WeakReference<>(advertisingIdClient);
            this.mb = j;
            start();
        }

        private final void j6() {
            AdvertisingIdClient advertisingIdClient = this.WB.get();
            if (advertisingIdClient != null) {
                advertisingIdClient.j6();
                this.fY = true;
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                if (this.jw.await(this.mb, TimeUnit.MILLISECONDS)) {
                    return;
                }
                j6();
            } catch (InterruptedException unused) {
                j6();
            }
        }
    }

    public AdvertisingIdClient(Context context) {
        this(context, 30000L, false, false);
    }

    private AdvertisingIdClient(Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        this.Hw = new Object();
        p.u7(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.Zo = context;
        this.FH = false;
        this.gn = j;
        this.VH = z2;
    }

    public static a DW(Context context) {
        zzb zzbVar = new zzb(context);
        boolean zJ6 = zzbVar.j6("gads:ad_id_app_context:enabled", false);
        float fDW = zzbVar.DW("gads:ad_id_app_context:ping_ratio", 0.0f);
        String strFH = zzbVar.FH("gads:ad_id_use_shared_preference:experiment_id", "");
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, zJ6, zzbVar.j6("gads:ad_id_use_persistent_service:enabled", false));
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.tp(false);
            a aVarFH = advertisingIdClient.FH();
            advertisingIdClient.EQ(aVarFH, zJ6, fDW, SystemClock.elapsedRealtime() - jElapsedRealtime, strFH, null);
            return aVarFH;
        } finally {
        }
    }

    private final boolean EQ(a aVar, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() > f) {
            return false;
        }
        HashMap map = new HashMap();
        map.put("app_context", z ? "1" : "0");
        if (aVar != null) {
            map.put("limit_ad_tracking", aVar.DW() ? "1" : "0");
        }
        if (aVar != null && aVar.j6() != null) {
            map.put("ad_id_size", Integer.toString(aVar.j6().length()));
        }
        if (th != null) {
            map.put("error", th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            map.put("experiment_id", str);
        }
        map.put("tag", "AdvertisingIdClient");
        map.put("time_spent", Long.toString(j));
        new com.google.android.gms.ads.identifier.a(this, map).start();
        return true;
    }

    public static boolean Hw(Context context) {
        zzb zzbVar = new zzb(context);
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, zzbVar.j6("gads:ad_id_app_context:enabled", false), zzbVar.j6("com.google.android.gms.ads.identifier.service.PERSISTENT_START", false));
        try {
            advertisingIdClient.tp(false);
            return advertisingIdClient.we();
        } finally {
            advertisingIdClient.j6();
        }
    }

    private static com.google.android.gms.common.a VH(Context context, boolean z) throws PackageManager.NameNotFoundException, IOException, d {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            int iU7 = c.VH().u7(context, 12451000);
            if (iU7 != 0 && iU7 != 2) {
                throw new IOException("Google Play services not available");
            }
            String str = z ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
            com.google.android.gms.common.a aVar = new com.google.android.gms.common.a();
            Intent intent = new Intent(str);
            intent.setPackage("com.google.android.gms");
            try {
                if (com.google.android.gms.common.stats.a.DW().j6(context, intent, aVar, 1)) {
                    return aVar;
                }
                throw new IOException("Connection failure");
            } catch (Throwable th) {
                throw new IOException(th);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            throw new d(9);
        }
    }

    private static cv gn(Context context, com.google.android.gms.common.a aVar) throws IOException {
        try {
            return dv.sh(aVar.j6(10000L, TimeUnit.MILLISECONDS));
        } catch (InterruptedException unused) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    private final void tp(boolean z) {
        p.gn("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.FH) {
                j6();
            }
            com.google.android.gms.common.a aVarVH = VH(this.Zo, this.VH);
            this.j6 = aVarVH;
            this.DW = gn(this.Zo, aVarVH);
            this.FH = true;
            if (z) {
                u7();
            }
        }
    }

    private final void u7() {
        synchronized (this.Hw) {
            if (this.v5 != null) {
                this.v5.jw.countDown();
                try {
                    this.v5.join();
                } catch (InterruptedException unused) {
                }
            }
            if (this.gn > 0) {
                this.v5 = new b(this, this.gn);
            }
        }
    }

    public static void v5(boolean z) {
    }

    private final boolean we() {
        boolean zJ8;
        p.gn("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.FH) {
                p.u7(this.j6);
                p.u7(this.DW);
                zJ8 = this.DW.J8();
            } else {
                synchronized (this.Hw) {
                    if (this.v5 == null || !this.v5.fY) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    tp(false);
                    if (!this.FH) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                    p.u7(this.j6);
                    p.u7(this.DW);
                    try {
                        zJ8 = this.DW.J8();
                    } catch (RemoteException e) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                        throw new IOException("Remote exception");
                    }
                } catch (Exception e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
        }
        u7();
        return zJ8;
    }

    public a FH() {
        a aVar;
        p.gn("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.FH) {
                p.u7(this.j6);
                p.u7(this.DW);
                aVar = new a(this.DW.X7(), this.DW.un(true));
            } else {
                synchronized (this.Hw) {
                    if (this.v5 == null || !this.v5.fY) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    tp(false);
                    if (!this.FH) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                    p.u7(this.j6);
                    p.u7(this.DW);
                    try {
                        aVar = new a(this.DW.X7(), this.DW.un(true));
                    } catch (RemoteException e) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                        throw new IOException("Remote exception");
                    }
                } catch (Exception e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
        }
        u7();
        return aVar;
    }

    public void Zo() {
        tp(true);
    }

    protected void finalize() throws Throwable {
        j6();
        super.finalize();
    }

    public final void j6() {
        p.gn("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.Zo == null || this.j6 == null) {
                return;
            }
            try {
                if (this.FH) {
                    com.google.android.gms.common.stats.a.DW().FH(this.Zo, this.j6);
                }
            } catch (Throwable th) {
                Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
            }
            this.FH = false;
            this.DW = null;
            this.j6 = null;
        }
    }
}
