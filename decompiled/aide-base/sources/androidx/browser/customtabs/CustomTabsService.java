package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import android.support.customtabs.f;
import androidx.collection.ArrayMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class CustomTabsService extends Service {
    private final Map<IBinder, IBinder.DeathRecipient> WB = new ArrayMap();
    private ICustomTabsService.Sub mb = new a();

    class a extends ICustomTabsService.Sub {

        /* renamed from: androidx.browser.customtabs.CustomTabsService$a$a, reason: collision with other inner class name */
        class C0027a implements IBinder.DeathRecipient {
            final /* synthetic */ f j6;

            C0027a(f fVar) {
                this.j6 = fVar;
            }

            @Override // android.os.IBinder.DeathRecipient
            public void binderDied() {
                CustomTabsService.this.DW(this.j6);
            }
        }

        a() {
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean PI(long j) {
            return CustomTabsService.this.u7(j);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean g9(ICustomTabsCallback iCustomTabsCallback, Uri uri) {
            return CustomTabsService.this.VH(new f(iCustomTabsCallback), uri);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public int mp(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) {
            return CustomTabsService.this.Zo(new f(iCustomTabsCallback), str, bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean pn(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, List<Bundle> list) {
            return CustomTabsService.this.Hw(new f(iCustomTabsCallback), uri, bundle, list);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean qV(ICustomTabsCallback iCustomTabsCallback) {
            f fVar = new f(iCustomTabsCallback);
            try {
                C0027a c0027a = new C0027a(fVar);
                synchronized (CustomTabsService.this.WB) {
                    iCustomTabsCallback.asBinder().linkToDeath(c0027a, 0);
                    CustomTabsService.this.WB.put(iCustomTabsCallback.asBinder(), c0027a);
                }
                return CustomTabsService.this.v5(fVar);
            } catch (RemoteException unused) {
                return false;
            }
        }

        @Override // android.support.customtabs.ICustomTabsService
        public Bundle tE(String str, Bundle bundle) {
            return CustomTabsService.this.FH(str, bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean z6(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            return CustomTabsService.this.gn(new f(iCustomTabsCallback), bundle);
        }
    }

    protected boolean DW(f fVar) {
        try {
            synchronized (this.WB) {
                IBinder iBinderJ6 = fVar.j6();
                iBinderJ6.unlinkToDeath(this.WB.get(iBinderJ6), 0);
                this.WB.remove(iBinderJ6);
            }
            return true;
        } catch (NoSuchElementException unused) {
            return false;
        }
    }

    protected abstract Bundle FH(String str, Bundle bundle);

    protected abstract boolean Hw(f fVar, Uri uri, Bundle bundle, List<Bundle> list);

    protected abstract boolean VH(f fVar, Uri uri);

    protected abstract int Zo(f fVar, String str, Bundle bundle);

    protected abstract boolean gn(f fVar, Bundle bundle);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.mb;
    }

    protected abstract boolean u7(long j);

    protected abstract boolean v5(f fVar);
}
