package androidx.media.session;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.util.Log;
import android.view.KeyEvent;
import java.util.List;

/* loaded from: classes.dex */
public class MediaButtonReceiver extends BroadcastReceiver {

    private static class a extends MediaBrowserCompat.b {
        private final Context FH;
        private final Intent Hw;
        private MediaBrowserCompat Zo;
        private final BroadcastReceiver.PendingResult v5;

        a(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.FH = context;
            this.Hw = intent;
            this.v5 = pendingResult;
        }

        private void v5() {
            this.Zo.DW();
            this.v5.finish();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b
        public void DW() {
            v5();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b
        public void FH() {
            v5();
        }

        void Zo(MediaBrowserCompat mediaBrowserCompat) {
            this.Zo = mediaBrowserCompat;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b
        public void j6() {
            try {
                new MediaControllerCompat(this.FH, this.Zo.FH()).j6((KeyEvent) this.Hw.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            } catch (RemoteException e) {
                Log.e("MediaButtonReceiver", "Failed to create a media controller", e);
            }
            v5();
        }
    }

    private static void DW(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    private static ComponentName j6(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (listQueryIntentServices.isEmpty()) {
            return null;
        }
        throw new IllegalStateException("Expected 1 service that handles " + str + ", found " + listQueryIntentServices.size());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Log.d("MediaButtonReceiver", "Ignore unsupported intent: " + intent);
            return;
        }
        ComponentName componentNameJ6 = j6(context, "android.intent.action.MEDIA_BUTTON");
        if (componentNameJ6 != null) {
            intent.setComponent(componentNameJ6);
            DW(context, intent);
            return;
        }
        ComponentName componentNameJ62 = j6(context, "android.media.browse.MediaBrowserService");
        if (componentNameJ62 == null) {
            throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
        }
        BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        Context applicationContext = context.getApplicationContext();
        a aVar = new a(applicationContext, intent, pendingResultGoAsync);
        MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, componentNameJ62, aVar, null);
        aVar.Zo(mediaBrowserCompat);
        mediaBrowserCompat.j6();
    }
}
