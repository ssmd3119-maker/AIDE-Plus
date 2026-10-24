package android.support.v4.media;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.v4.media.d;

/* loaded from: classes.dex */
public class e {

    static class a extends d.b {
        a(Context context, b bVar) {
            super(context, bVar);
        }

        @Override // android.service.media.MediaBrowserService
        public void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
            ((b) this.WB).DW(str, new d.c<>(result));
        }
    }

    public interface b extends d.InterfaceC0023d {
        void DW(String str, d.c<Parcel> cVar);
    }

    public static Object j6(Context context, b bVar) {
        return new a(context, bVar);
    }
}
