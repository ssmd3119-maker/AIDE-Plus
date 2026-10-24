package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class va0 extends CustomTabsServiceConnection {
    private WeakReference<wa0> WB;

    public va0(wa0 wa0Var) {
        this.WB = new WeakReference<>(wa0Var);
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void j6(ComponentName componentName, CustomTabsClient customTabsClient) {
        wa0 wa0Var = this.WB.get();
        if (wa0Var != null) {
            wa0Var.DW(customTabsClient);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        wa0 wa0Var = this.WB.get();
        if (wa0Var != null) {
            wa0Var.j6();
        }
    }
}
