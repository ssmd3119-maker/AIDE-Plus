package androidx.browser.customtabs;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import java.util.List;

/* loaded from: classes.dex */
public final class CustomTabsSession {
    private final ICustomTabsCallback DW;
    private final ComponentName FH;
    private final ICustomTabsService j6;

    CustomTabsSession(ICustomTabsService iCustomTabsService, ICustomTabsCallback iCustomTabsCallback, ComponentName componentName) {
        this.j6 = iCustomTabsService;
        this.DW = iCustomTabsCallback;
        this.FH = componentName;
    }

    ComponentName DW() {
        return this.FH;
    }

    IBinder j6() {
        return this.DW.asBinder();
    }

    public boolean mayLaunchUrl(Uri uri, Bundle bundle, List<Bundle> list) {
        try {
            return this.j6.pn(this.DW, uri, bundle, list);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
