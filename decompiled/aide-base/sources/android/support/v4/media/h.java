package android.support.v4.media;

import android.media.MediaDescription;
import android.net.Uri;
import android.support.v4.media.g;

/* loaded from: classes.dex */
public class h extends g {

    static class a extends g.a {
        public static void tp(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setMediaUri(uri);
        }
    }

    public static Uri tp(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }
}
