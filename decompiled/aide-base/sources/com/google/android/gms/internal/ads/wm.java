package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@jg
/* loaded from: classes.dex */
public final class wm implements vm {
    private boolean DW;

    @GuardedBy("mLock")
    @Nullable
    private String EQ;
    private vq<?> Hw;

    @GuardedBy("mLock")
    @Nullable
    private SharedPreferences.Editor VH;

    @GuardedBy("mLock")
    @Nullable
    private SharedPreferences Zo;

    @GuardedBy("mLock")
    @Nullable
    private String tp;
    private final Object j6 = new Object();
    private final List<Runnable> FH = new ArrayList();

    @GuardedBy("mLock")
    @Nullable
    private as0 v5 = null;

    @GuardedBy("mLock")
    private boolean gn = false;

    @GuardedBy("mLock")
    private boolean u7 = true;

    @GuardedBy("mLock")
    private boolean we = false;

    @GuardedBy("mLock")
    private String J0 = "";

    @GuardedBy("mLock")
    private long J8 = 0;

    @GuardedBy("mLock")
    private long Ws = 0;

    @GuardedBy("mLock")
    private long QX = 0;

    @GuardedBy("mLock")
    private int XL = -1;

    @GuardedBy("mLock")
    private int aM = 0;

    @GuardedBy("mLock")
    private Set<String> j3 = Collections.emptySet();

    @GuardedBy("mLock")
    private JSONObject Mr = new JSONObject();

    @GuardedBy("mLock")
    private boolean U2 = true;

    @GuardedBy("mLock")
    private boolean a8 = true;

    private final Bundle KD() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("listener_registration_bundle", true);
        synchronized (this.j6) {
            bundle.putBoolean("use_https", this.u7);
            bundle.putBoolean("content_url_opted_out", this.U2);
            bundle.putBoolean("content_vertical_opted_out", this.a8);
            bundle.putBoolean("auto_collect_location", this.we);
            bundle.putInt("version_code", this.aM);
            bundle.putStringArray("never_pool_slots", (String[]) this.j3.toArray(new String[this.j3.size()]));
            bundle.putString("app_settings_json", this.J0);
            bundle.putLong("app_settings_last_update_ms", this.J8);
            bundle.putLong("app_last_background_time_ms", this.Ws);
            bundle.putInt("request_in_session_count", this.XL);
            bundle.putLong("first_ad_req_time_ms", this.QX);
            bundle.putString("native_advanced_settings", this.Mr.toString());
            if (this.tp != null) {
                bundle.putString("content_url_hashes", this.tp);
            }
            if (this.EQ != null) {
                bundle.putString("content_vertical_hashes", this.EQ);
            }
        }
        return bundle;
    }

    private final void SI() throws ExecutionException, InterruptedException, TimeoutException {
        vq<?> vqVar = this.Hw;
        if (vqVar == null || vqVar.isDone()) {
            return;
        }
        try {
            this.Hw.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            xp.v5("Interrupted while waiting for preferences loaded.", e);
        } catch (CancellationException e2) {
            e = e2;
            xp.Hw("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e3) {
            e = e3;
            xp.Hw("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e4) {
            e = e4;
            xp.Hw("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    private final void ei(Bundle bundle) {
        zm.j6.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.ym
            private final wm WB;

            {
                this.WB = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.WB.we();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.vm
    public final void BT(boolean z) throws ExecutionException, InterruptedException, TimeoutException {
        SI();
        synchronized (this.j6) {
            if (this.a8 == z) {
                return;
            }
            this.a8 = z;
            if (this.VH != null) {
                this.VH.putBoolean("content_vertical_opted_out", z);
                this.VH.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("content_url_opted_out", this.U2);
            bundle.putBoolean("content_vertical_opted_out", this.a8);
            ei(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.vm
    public final void DW(long j) throws ExecutionException, InterruptedException, TimeoutException {
        SI();
        synchronized (this.j6) {
            if (this.Ws == j) {
                return;
            }
            this.Ws = j;
            if (this.VH != null) {
                this.VH.putLong("app_last_background_time_ms", j);
                this.VH.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putLong("app_last_background_time_ms", j);
            ei(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.vm
    public final boolean EQ(String str) throws ExecutionException, InterruptedException, TimeoutException {
        boolean zContains;
        SI();
        synchronized (this.j6) {
            zContains = this.j3.contains(str);
        }
        return zContains;
    }

    @Override // com.google.android.gms.internal.ads.vm
    public final void FH(String str) throws ExecutionException, InterruptedException, TimeoutException {
        SI();
        synchronized (this.j6) {
            long jJ6 = com.google.android.gms.ads.internal.w0.we().j6();
            this.J8 = jJ6;
            if (str != null && !str.equals(this.J0)) {
                this.J0 = str;
                if (this.VH != null) {
                    this.VH.putString("app_settings_json", str);
                    this.VH.putLong("app_settings_last_update_ms", jJ6);
                    this.VH.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putString("app_settings_json", str);
                bundle.putLong("app_settings_last_update_ms", jJ6);
                ei(bundle);
                Iterator<Runnable> it = this.FH.iterator();
                while (it.hasNext()) {
                    it.next().run();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.vm
    public final int Hw() throws ExecutionException, InterruptedException, TimeoutException {
        int i;
        SI();
        synchronized (this.j6) {
            i = this.aM;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.vm
    public final JSONObject J0() throws ExecutionException, InterruptedException, TimeoutException {
        JSONObject jSONObject;
        SI();
        synchronized (this.j6) {
            jSONObject = this.Mr;
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.vm
    public final void J8(@Nullable String str) throws ExecutionException, InterruptedException, TimeoutException {
        SI();
        synchronized (this.j6) {
            if (str != null) {
                if (!str.equals(this.tp)) {
                    this.tp = str;
                    if (this.VH != null) {
                        this.VH.putString("content_url_hashes", str);
                        this.VH.apply();
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("content_url_hashes", str);
                    ei(bundle);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.vm
    @Nullable
    public final String Mr() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        SI();
        synchronized (this.j6) {
            str = this.tp;
        }
        return str;
    }

    public final void P8(final Context context, String str, boolean z) {
        final String str2 = "admob";
        this.Hw = zm.DW(new Runnable(this, context, str2) { // from class: com.google.android.gms.internal.ads.xm
            private final wm WB;
            private final String jw;
            private final Context mb;

            {
                this.WB = this;
                this.mb = context;
                this.jw = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.WB.nw(this.mb, this.jw);
            }
        });
        this.DW = true;
    }

    @Override // com.google.android.gms.internal.ads.vm
    public final boolean QX() throws ExecutionException, InterruptedException, TimeoutException {
        boolean z;
        SI();
        synchronized (this.j6) {
            z = this.a8;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.vm
    public final void U2(String str) throws ExecutionException, InterruptedException, TimeoutException {
        SI();
        synchronized (this.j6) {
            if (this.j3.contains(str)) {
                return;
            }
            this.j3.add(str);
            if (this.VH != null) {
                this.VH.putStringSet("never_pool_slots", this.j3);
                this.VH.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putStringArray("never_pool_slots", (String[]) this.j3.toArray(new String[this.j3.size()]));
            ei(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.vm
    public final boolean VH() throws ExecutionException, InterruptedException, TimeoutException {
        boolean z;
        SI();
        synchronized (this.j6) {
            z = this.we;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.vm
    public final void Ws(int i) throws ExecutionException, InterruptedException, TimeoutException {
        SI();
        synchronized (this.j6) {
            if (this.XL == i) {
                return;
            }
            this.XL = i;
            if (this.VH != null) {
                this.VH.putInt("request_in_session_count", i);
                this.VH.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putInt("request_in_session_count", i);
            ei(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.vm
    public final void XL(boolean z) throws ExecutionException, InterruptedException, TimeoutException {
        SI();
        synchronized (this.j6) {
            if (this.we == z) {
                return;
            }
            this.we = z;
            if (this.VH != null) {
                this.VH.putBoolean("auto_collect_location", z);
                this.VH.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("auto_collect_location", z);
            ei(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.vm
    public final void Zo(long j) throws ExecutionException, InterruptedException, TimeoutException {
        SI();
        synchronized (this.j6) {
            if (this.QX == j) {
                return;
            }
            this.QX = j;
            if (this.VH != null) {
                this.VH.putLong("first_ad_req_time_ms", j);
                this.VH.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putLong("first_ad_req_time_ms", j);
            ei(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.vm
    public final int a8() throws ExecutionException, InterruptedException, TimeoutException {
        int i;
        SI();
        synchronized (this.j6) {
            i = this.XL;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.vm
    public final long aM() throws ExecutionException, InterruptedException, TimeoutException {
        long j;
        SI();
        synchronized (this.j6) {
            j = this.QX;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.vm
    public final boolean er() throws ExecutionException, InterruptedException, TimeoutException {
        boolean z;
        SI();
        synchronized (this.j6) {
            z = this.U2;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.vm
    public final void gW(int i) throws ExecutionException, InterruptedException, TimeoutException {
        SI();
        synchronized (this.j6) {
            if (this.aM == i) {
                return;
            }
            this.aM = i;
            if (this.VH != null) {
                this.VH.putInt("version_code", i);
                this.VH.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putInt("version_code", i);
            ei(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.vm
    public final void gn(String str) throws ExecutionException, InterruptedException, TimeoutException {
        SI();
        synchronized (this.j6) {
            if (this.j3.contains(str)) {
                this.j3.remove(str);
                if (this.VH != null) {
                    this.VH.putStringSet("never_pool_slots", this.j3);
                    this.VH.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putStringArray("never_pool_slots", (String[]) this.j3.toArray(new String[this.j3.size()]));
                ei(bundle);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.vm
    public final void j3(@Nullable String str) throws ExecutionException, InterruptedException, TimeoutException {
        SI();
        synchronized (this.j6) {
            if (str != null) {
                if (!str.equals(this.EQ)) {
                    this.EQ = str;
                    if (this.VH != null) {
                        this.VH.putString("content_vertical_hashes", str);
                        this.VH.apply();
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("content_vertical_hashes", str);
                    ei(bundle);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.vm
    public final cm j6() throws ExecutionException, InterruptedException, TimeoutException {
        cm cmVar;
        SI();
        synchronized (this.j6) {
            cmVar = new cm(this.J0, this.J8);
        }
        return cmVar;
    }

    @Override // com.google.android.gms.internal.ads.vm
    public final void lg(String str, String str2, boolean z) throws ExecutionException, InterruptedException, TimeoutException {
        SI();
        synchronized (this.j6) {
            JSONArray jSONArrayOptJSONArray = this.Mr.optJSONArray(str);
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
            }
            int length = jSONArrayOptJSONArray.length();
            int i = 0;
            while (true) {
                if (i < jSONArrayOptJSONArray.length()) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject == null) {
                        return;
                    }
                    if (!str2.equals(jSONObjectOptJSONObject.optString("template_id"))) {
                        i++;
                    } else if (z && jSONObjectOptJSONObject.optBoolean("uses_media_view", false) == z) {
                        return;
                    } else {
                        length = i;
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z);
                jSONObject.put("timestamp_ms", com.google.android.gms.ads.internal.w0.we().j6());
                jSONArrayOptJSONArray.put(length, jSONObject);
                this.Mr.put(str, jSONArrayOptJSONArray);
            } catch (JSONException e) {
                xp.v5("Could not update native advanced settings", e);
            }
            if (this.VH != null) {
                this.VH.putString("native_advanced_settings", this.Mr.toString());
                this.VH.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("native_advanced_settings", this.Mr.toString());
            ei(bundle);
        }
    }

    final /* synthetic */ void nw(Context context, String str) {
        boolean z = false;
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        synchronized (this.j6) {
            this.Zo = sharedPreferences;
            this.VH = editorEdit;
            if (com.google.android.gms.common.util.o.u7() && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) {
                z = true;
            }
            this.gn = z;
            this.u7 = this.Zo.getBoolean("use_https", this.u7);
            this.U2 = this.Zo.getBoolean("content_url_opted_out", this.U2);
            this.tp = this.Zo.getString("content_url_hashes", this.tp);
            this.we = this.Zo.getBoolean("auto_collect_location", this.we);
            this.a8 = this.Zo.getBoolean("content_vertical_opted_out", this.a8);
            this.EQ = this.Zo.getString("content_vertical_hashes", this.EQ);
            this.aM = this.Zo.getInt("version_code", this.aM);
            this.J0 = this.Zo.getString("app_settings_json", this.J0);
            this.J8 = this.Zo.getLong("app_settings_last_update_ms", this.J8);
            this.Ws = this.Zo.getLong("app_last_background_time_ms", this.Ws);
            this.XL = this.Zo.getInt("request_in_session_count", this.XL);
            this.QX = this.Zo.getLong("first_ad_req_time_ms", this.QX);
            this.j3 = this.Zo.getStringSet("never_pool_slots", this.j3);
            try {
                this.Mr = new JSONObject(this.Zo.getString("native_advanced_settings", "{}"));
            } catch (JSONException e) {
                xp.v5("Could not convert native advanced settings to json object", e);
            }
            ei(KD());
        }
    }

    @Override // com.google.android.gms.internal.ads.vm
    public final void rN(boolean z) throws ExecutionException, InterruptedException, TimeoutException {
        SI();
        synchronized (this.j6) {
            if (this.U2 == z) {
                return;
            }
            this.U2 = z;
            if (this.VH != null) {
                this.VH.putBoolean("content_url_opted_out", z);
                this.VH.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("content_url_opted_out", this.U2);
            bundle.putBoolean("content_vertical_opted_out", this.a8);
            ei(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.vm
    @Nullable
    public final String tp() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        SI();
        synchronized (this.j6) {
            str = this.EQ;
        }
        return str;
    }

    @Override // com.google.android.gms.internal.ads.vm
    public final void u7() throws ExecutionException, InterruptedException, TimeoutException {
        SI();
        synchronized (this.j6) {
            this.Mr = new JSONObject();
            if (this.VH != null) {
                this.VH.remove("native_advanced_settings");
                this.VH.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("native_advanced_settings", "{}");
            ei(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.vm
    public final void v5(boolean z) throws ExecutionException, InterruptedException, TimeoutException {
        SI();
        synchronized (this.j6) {
            if (this.u7 == z) {
                return;
            }
            this.u7 = z;
            if (this.VH != null) {
                this.VH.putBoolean("use_https", z);
                this.VH.apply();
            }
            if (!this.gn) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("use_https", z);
                ei(bundle);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.vm
    public final boolean vy() throws ExecutionException, InterruptedException, TimeoutException {
        boolean z;
        SI();
        synchronized (this.j6) {
            z = this.u7 || this.gn;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.vm
    @Nullable
    public final as0 we() {
        if (!this.DW || !com.google.android.gms.common.util.o.j6()) {
            return null;
        }
        if (er() && QX()) {
            return null;
        }
        if (!((Boolean) cw0.v5().FH(p.sG)).booleanValue()) {
            return null;
        }
        synchronized (this.j6) {
            if (Looper.getMainLooper() == null) {
                return null;
            }
            if (this.v5 == null) {
                this.v5 = new as0();
            }
            this.v5.VH();
            xp.gn("start fetching content...");
            return this.v5;
        }
    }

    @Override // com.google.android.gms.internal.ads.vm
    public final long yS() throws ExecutionException, InterruptedException, TimeoutException {
        long j;
        SI();
        synchronized (this.j6) {
            j = this.Ws;
        }
        return j;
    }
}
