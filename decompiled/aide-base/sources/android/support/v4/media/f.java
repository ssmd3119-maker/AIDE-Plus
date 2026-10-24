package android.support.v4.media;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.v4.media.e;
import android.util.Log;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class f {
    private static Field j6;

    static class a extends e.a {
        a(Context context, c cVar) {
            super(context, cVar);
        }

        @Override // android.service.media.MediaBrowserService
        public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
            ((c) this.WB).Hw(str, new b(result), bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static class b {
        MediaBrowserService.Result j6;

        b(MediaBrowserService.Result result) {
            this.j6 = result;
        }

        public void DW(List<Parcel> list, int i) throws IllegalAccessException, IllegalArgumentException {
            try {
                f.j6.setInt(this.j6, i);
            } catch (IllegalAccessException e) {
                Log.w("MBSCompatApi24", e);
            }
            this.j6.sendResult(j6(list));
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

    public interface c extends e.b {
        void Hw(String str, b bVar, Bundle bundle);
    }

    static {
        try {
            Field declaredField = MediaBrowserService.Result.class.getDeclaredField("mFlags");
            j6 = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            Log.w("MBSCompatApi24", e);
        }
    }

    public static Object DW(Context context, c cVar) {
        return new a(context, cVar);
    }
}
