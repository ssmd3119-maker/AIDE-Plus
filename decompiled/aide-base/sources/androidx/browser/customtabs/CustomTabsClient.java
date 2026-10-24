package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class CustomTabsClient {
    private final ComponentName DW;
    private final ICustomTabsService j6;

    class a extends ICustomTabsCallback.Sub {
        private Handler WB = new Handler(Looper.getMainLooper());
        final /* synthetic */ CustomTabsCallback mb;

        /* renamed from: androidx.browser.customtabs.CustomTabsClient$a$a, reason: collision with other inner class name */
        class RunnableC0026a implements Runnable {
            final /* synthetic */ int WB;
            final /* synthetic */ Bundle mb;

            RunnableC0026a(int i, Bundle bundle) {
                this.WB = i;
                this.mb = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.mb.FH(this.WB, this.mb);
            }
        }

        class b implements Runnable {
            final /* synthetic */ String WB;
            final /* synthetic */ Bundle mb;

            b(String str, Bundle bundle) {
                this.WB = str;
                this.mb = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.mb.j6(this.WB, this.mb);
            }
        }

        class c implements Runnable {
            final /* synthetic */ Bundle WB;

            c(Bundle bundle) {
                this.WB = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.mb.DW(this.WB);
            }
        }

        class d implements Runnable {
            final /* synthetic */ String WB;
            final /* synthetic */ Bundle mb;

            d(String str, Bundle bundle) {
                this.WB = str;
                this.mb = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.mb.Hw(this.WB, this.mb);
            }
        }

        a(CustomTabsClient customTabsClient, CustomTabsCallback customTabsCallback) {
            this.mb = customTabsCallback;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void bM(int i, Bundle bundle) {
            if (this.mb == null) {
                return;
            }
            this.WB.post(new RunnableC0026a(i, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void eo(Bundle bundle) {
            if (this.mb == null) {
                return;
            }
            this.WB.post(new c(bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void in(String str, Bundle bundle) {
            if (this.mb == null) {
                return;
            }
            this.WB.post(new b(str, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void vv(String str, Bundle bundle) {
            if (this.mb == null) {
                return;
            }
            this.WB.post(new d(str, bundle));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    protected CustomTabsClient(ICustomTabsService iCustomTabsService, ComponentName componentName) {
        this.j6 = iCustomTabsService;
        this.DW = componentName;
    }

    public static boolean bindCustomTabsService(Context context, String str, CustomTabsServiceConnection customTabsServiceConnection) {
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, customTabsServiceConnection, 33);
    }

    public CustomTabsSession newSession(CustomTabsCallback customTabsCallback) {
        a aVar = new a(this, customTabsCallback);
        try {
            if (this.j6.qV(aVar)) {
                return new CustomTabsSession(this.j6, aVar, this.DW);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public boolean warmup(long j) {
        try {
            return this.j6.PI(j);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
