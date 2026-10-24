package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.customtabs.ICustomTabsService;

/* loaded from: classes.dex */
public abstract class CustomTabsServiceConnection implements ServiceConnection {
    public abstract void j6(ComponentName componentName, CustomTabsClient customTabsClient);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(final ComponentName componentName, IBinder iBinder) {
        final ICustomTabsService iCustomTabsServiceAsInterface = ICustomTabsService.Sub.asInterface(iBinder);
        j6(componentName, new CustomTabsClient(this, iCustomTabsServiceAsInterface, componentName) { // from class: android.support.customtabs.d$a
        });
    }
}
