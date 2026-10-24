package android.support.v4.media;

import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class d {

    /* JADX INFO: Access modifiers changed from: package-private */
    public static class a {
        final Bundle DW;
        final String j6;
    }

    static class b extends MediaBrowserService {
        final InterfaceC0023d WB;

        b(Context context, InterfaceC0023d interfaceC0023d) {
            attachBaseContext(context);
            this.WB = interfaceC0023d;
        }

        @Override // android.service.media.MediaBrowserService
        public MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
            a aVarZo = this.WB.Zo(str, i, bundle == null ? null : new Bundle(bundle));
            if (aVarZo == null) {
                return null;
            }
            return new MediaBrowserService.BrowserRoot(aVarZo.j6, aVarZo.DW);
        }

        @Override // android.service.media.MediaBrowserService
        public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
            this.WB.v5(str, new c<>(result));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static class c<T> {
        MediaBrowserService.Result j6;

        c(MediaBrowserService.Result result) {
            this.j6 = result;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void DW(T t) {
            if (t instanceof List) {
                this.j6.sendResult(j6((List) t));
                return;
            }
            if (!(t instanceof Parcel)) {
                this.j6.sendResult(null);
                return;
            }
            Parcel parcel = (Parcel) t;
            parcel.setDataPosition(0);
            this.j6.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
            parcel.recycle();
        }

        List<MediaBrowser.MediaItem> j6(List<Parcel> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcel parcel : list) {
                parcel.setDataPosition(0);
                arrayList.add(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            }
            return arrayList;
        }
    }

    /* renamed from: android.support.v4.media.d$d, reason: collision with other inner class name */
    public interface InterfaceC0023d {
        a Zo(String str, int i, Bundle bundle);

        void v5(String str, c<List<Parcel>> cVar);
    }

    public static IBinder DW(Object obj, Intent intent) {
        return ((MediaBrowserService) obj).onBind(intent);
    }

    public static void FH(Object obj) {
        ((MediaBrowserService) obj).onCreate();
    }

    public static Object j6(Context context, InterfaceC0023d interfaceC0023d) {
        return new b(context, interfaceC0023d);
    }
}
