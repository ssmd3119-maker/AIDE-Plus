package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.ConditionVariable;
import java.util.concurrent.Callable;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class m implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context k2;
    private final Object WB = new Object();
    private final ConditionVariable mb = new ConditionVariable();
    private volatile boolean jw = false;
    private volatile boolean fY = false;
    private SharedPreferences qp = null;
    private JSONObject zh = new JSONObject();

    private final void Hw() {
        if (this.qp == null) {
            return;
        }
        try {
            this.zh = new JSONObject((String) dp.j6(this.k2, new Callable(this) { // from class: com.google.android.gms.internal.ads.n
                private final m j6;

                {
                    this.j6 = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.j6.v5();
                }
            }));
        } catch (JSONException unused) {
        }
    }

    public final <T> T FH(e<T> eVar) {
        if (!this.mb.block(5000L)) {
            synchronized (this.WB) {
                if (!this.fY) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.jw || this.qp == null) {
            synchronized (this.WB) {
                if (this.jw && this.qp != null) {
                }
                return eVar.J0();
            }
        }
        return (eVar.DW() == 1 && this.zh.has(eVar.j6())) ? eVar.EQ(this.zh) : (T) dp.j6(this.k2, new o(this, eVar));
    }

    public final void j6(Context context) {
        if (this.jw) {
            return;
        }
        synchronized (this.WB) {
            if (this.jw) {
                return;
            }
            if (!this.fY) {
                this.fY = true;
            }
            this.k2 = context.getApplicationContext() == null ? context : context.getApplicationContext();
            try {
                Context contextFH = com.google.android.gms.common.g.FH(context);
                if (contextFH == null && context != null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    contextFH = context;
                }
                if (contextFH == null) {
                    return;
                }
                cw0.FH();
                SharedPreferences sharedPreferences = contextFH.getSharedPreferences("google_ads_flags", 0);
                this.qp = sharedPreferences;
                if (sharedPreferences != null) {
                    sharedPreferences.registerOnSharedPreferenceChangeListener(this);
                }
                Hw();
                this.jw = true;
            } finally {
                this.fY = false;
                this.mb.open();
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            Hw();
        }
    }

    final /* synthetic */ String v5() {
        return this.qp.getString("flag_configuration", "{}");
    }
}
