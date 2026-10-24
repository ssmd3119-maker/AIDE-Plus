package tv.ouya.console.api;

import abcd.uq0;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import tv.ouya.console.internal.IIapServiceDefinition;

/* loaded from: classes.dex */
public class e implements ServiceConnection {
    private static e zh = new e();
    private Context WB;
    private boolean fY;
    private List<Runnable> jw = new ArrayList();
    private c k2;
    private IIapServiceDefinition mb;
    private String qp;

    public enum b {
        OUYA,
        MOJO,
        UNKNOWN
    }

    public static class c {
        private boolean j6;

        c(boolean z, String str, b bVar) {
            this.j6 = z;
        }

        public boolean j6() {
            return this.j6;
        }
    }

    private class d extends h {
        @Override // tv.ouya.console.api.h
        void j6() {
            e.this.mb.aR(e.this.qp, new uq0(this.WB));
        }

        private d(g<String> gVar) {
            super(gVar, "fetching receipts");
        }
    }

    e() {
        Log.v("OUYAF", "ODK version number: 62");
    }

    private void tp(Runnable runnable) {
        FH();
        if (this.mb != null) {
            runnable.run();
        } else {
            this.jw.add(runnable);
        }
    }

    public static e v5() {
        return zh;
    }

    public void EQ() {
        Context context = this.WB;
        if (context != null) {
            if (this.mb != null) {
                context.unbindService(this);
                this.mb = null;
                this.fY = false;
            }
            Intent intent = new Intent("tv.ouya.ODK_SHUTDOWN");
            intent.putExtra("package_name", this.WB.getPackageName());
            this.WB.sendBroadcast(intent);
            this.WB = null;
        }
    }

    void FH() {
        if (this.WB == null) {
            Log.e("OUYAF", "Dropping request because connect has been shut down");
            return;
        }
        if (this.fY) {
            return;
        }
        Log.d("inAppPurchase", "Binding to IapService");
        Intent intent = new Intent();
        intent.setClassName("tv.ouya", "tv.ouya.console.service.iap.IapService");
        this.WB.bindService(intent, this, 1);
        this.fY = true;
    }

    public c Hw() {
        if (this.k2 == null) {
            if (!VH()) {
                throw new RuntimeException("Must call OuyaFacade.init first");
            }
            Intent intentRegisterReceiver = this.WB.registerReceiver(null, new IntentFilter("tv.ouya.DEVICE_INFO_ACTION"));
            if (intentRegisterReceiver == null) {
                return new c(false, "unknown", b.UNKNOWN);
            }
            boolean booleanExtra = intentRegisterReceiver.getBooleanExtra("SUPPORTED_DEVICE", false);
            String stringExtra = intentRegisterReceiver.getStringExtra("DEVICE_NAME");
            String stringExtra2 = intentRegisterReceiver.getStringExtra("DEVICE_ENUM");
            b bVarValueOf = b.UNKNOWN;
            try {
                bVarValueOf = b.valueOf(stringExtra2);
            } catch (Exception unused) {
                Log.w("OUYAF", "Error looking up deviceEnum for: " + stringExtra2);
            }
            this.k2 = new c(booleanExtra, stringExtra, bVarValueOf);
        }
        return this.k2;
    }

    public boolean VH() {
        return this.WB != null;
    }

    public void Zo(Context context, String str) {
        if (VH()) {
            return;
        }
        this.WB = context.getApplicationContext();
        this.qp = str;
        Intent intent = new Intent("tv.ouya.ODK_INITIALIZED");
        intent.putExtra("package_name", context.getPackageName());
        this.WB.sendBroadcast(intent);
    }

    public boolean gn() {
        return Hw().j6();
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Log.d("inAppPurchase", "Successfully bound to IapService");
        this.mb = IIapServiceDefinition.Sub.asInterface(iBinder);
        while (this.jw.size() > 0) {
            this.jw.remove(0).run();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.mb = null;
        this.fY = false;
    }

    public void u7(g<String> gVar) {
        tp(new d(gVar));
    }
}
