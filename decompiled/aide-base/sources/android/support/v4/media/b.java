package android.support.v4.media;

import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.support.v4.media.a;
import java.util.List;

/* loaded from: classes.dex */
public class b {

    interface a extends a.d {
        void DW(String str, Bundle bundle);

        void FH(String str, List<?> list, Bundle bundle);
    }

    /* renamed from: android.support.v4.media.b$b, reason: collision with other inner class name */
    static class C0022b<T extends a> extends a.e<T> {
        public C0022b(T t) {
            super(t);
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list, Bundle bundle) {
            ((a) this.j6).FH(str, list, bundle);
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public void onError(String str, Bundle bundle) {
            ((a) this.j6).DW(str, bundle);
        }
    }

    public static Object j6(a aVar) {
        return new C0022b(aVar);
    }
}
