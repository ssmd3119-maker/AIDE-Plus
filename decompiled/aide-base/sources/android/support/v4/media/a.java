package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import java.util.List;

/* loaded from: classes.dex */
public class a {

    /* renamed from: android.support.v4.media.a$a, reason: collision with other inner class name */
    interface InterfaceC0021a {
        void FH();

        void Hw();

        void j6();
    }

    static class b<T extends InterfaceC0021a> extends MediaBrowser.ConnectionCallback {
        protected final T j6;

        public b(T t) {
            this.j6 = t;
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public void onConnected() {
            this.j6.FH();
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public void onConnectionFailed() {
            this.j6.Hw();
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public void onConnectionSuspended() {
            this.j6.j6();
        }
    }

    static class c {
        public static int DW(Object obj) {
            return ((MediaBrowser.MediaItem) obj).getFlags();
        }

        public static Object j6(Object obj) {
            return ((MediaBrowser.MediaItem) obj).getDescription();
        }
    }

    interface d {
        void Hw(String str, List<?> list);

        void j6(String str);
    }

    static class e<T extends d> extends MediaBrowser.SubscriptionCallback {
        protected final T j6;

        public e(T t) {
            this.j6 = t;
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list) {
            this.j6.Hw(str, list);
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public void onError(String str) {
            this.j6.j6(str);
        }
    }

    public static Object DW(Context context, ComponentName componentName, Object obj, Bundle bundle) {
        return new MediaBrowser(context, componentName, (MediaBrowser.ConnectionCallback) obj, bundle);
    }

    public static Object FH(InterfaceC0021a interfaceC0021a) {
        return new b(interfaceC0021a);
    }

    public static Object Hw(d dVar) {
        return new e(dVar);
    }

    public static Object VH(Object obj) {
        return ((MediaBrowser) obj).getSessionToken();
    }

    public static Bundle Zo(Object obj) {
        return ((MediaBrowser) obj).getExtras();
    }

    public static void j6(Object obj) {
        ((MediaBrowser) obj).connect();
    }

    public static void v5(Object obj) {
        ((MediaBrowser) obj).disconnect();
    }
}
