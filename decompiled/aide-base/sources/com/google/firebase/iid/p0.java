package com.google.firebase.iid;

import abcd.cx;
import abcd.gw;
import abcd.hw;
import abcd.jw;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class p0 implements b {
    private final zzan DW;
    private final u FH;
    private final Executor Hw;
    private final cx j6;

    p0(cx cxVar, zzan zzanVar, Executor executor) {
        this(cxVar, zzanVar, executor, new u(cxVar.DW(), zzanVar));
    }

    private final <T> gw<Void> EQ(gw<T> gwVar) {
        return gwVar.v5(h0.FH(), new r0(this));
    }

    private final gw<Bundle> VH(String str, String str2, String str3, final Bundle bundle) {
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.j6.v5().DW());
        bundle.putString("gmsv", Integer.toString(this.DW.Zo()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.DW.Hw());
        bundle.putString("app_ver_name", this.DW.v5());
        bundle.putString("cliv", "fiid-12451000");
        final hw hwVar = new hw();
        this.Hw.execute(new Runnable(this, bundle, hwVar) { // from class: com.google.firebase.iid.q0
            private final p0 WB;
            private final hw jw;
            private final Bundle mb;

            {
                this.WB = this;
                this.mb = bundle;
                this.jw = hwVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.WB.tp(this.mb, this.jw);
            }
        });
        return hwVar.j6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String gn(Bundle bundle) throws IOException {
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        String strValueOf = String.valueOf(bundle);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 21);
        sb.append("Unexpected response: ");
        sb.append(strValueOf);
        Log.w("FirebaseInstanceId", sb.toString(), new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    private final gw<String> we(gw<Bundle> gwVar) {
        return gwVar.v5(this.Hw, new s0(this));
    }

    @Override // com.google.firebase.iid.b
    public final gw<Void> DW(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String strValueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", strValueOf.length() != 0 ? "/topics/".concat(strValueOf) : new String("/topics/"));
        String strValueOf2 = String.valueOf(str3);
        return EQ(we(VH(str, str2, strValueOf2.length() != 0 ? "/topics/".concat(strValueOf2) : new String("/topics/"), bundle)));
    }

    @Override // com.google.firebase.iid.b
    public final boolean FH() {
        return true;
    }

    @Override // com.google.firebase.iid.b
    public final gw<String> Hw(String str, String str2, String str3, String str4) {
        return we(VH(str, str3, str4, new Bundle()));
    }

    @Override // com.google.firebase.iid.b
    public final boolean Zo() {
        return this.DW.FH() != 0;
    }

    @Override // com.google.firebase.iid.b
    public final gw<Void> j6(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String strValueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", strValueOf.length() != 0 ? "/topics/".concat(strValueOf) : new String("/topics/"));
        bundle.putString("delete", "1");
        String strValueOf2 = String.valueOf(str3);
        return EQ(we(VH(str, str2, strValueOf2.length() != 0 ? "/topics/".concat(strValueOf2) : new String("/topics/"), bundle)));
    }

    final /* synthetic */ void tp(Bundle bundle, hw hwVar) {
        try {
            hwVar.FH(this.FH.Zo(bundle));
        } catch (IOException e) {
            hwVar.DW(e);
        }
    }

    @Override // com.google.firebase.iid.b
    public final gw<Void> v5(String str, String str2) {
        return jw.FH(null);
    }

    private p0(cx cxVar, zzan zzanVar, Executor executor, u uVar) {
        this.j6 = cxVar;
        this.DW = zzanVar;
        this.FH = uVar;
        this.Hw = executor;
    }
}
