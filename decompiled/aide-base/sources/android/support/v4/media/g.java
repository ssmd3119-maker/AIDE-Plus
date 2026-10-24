package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes.dex */
public class g {

    static class a {
        public static Object DW() {
            return new MediaDescription.Builder();
        }

        public static void FH(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setDescription(charSequence);
        }

        public static void Hw(Object obj, Bundle bundle) {
            ((MediaDescription.Builder) obj).setExtras(bundle);
        }

        public static void VH(Object obj, String str) {
            ((MediaDescription.Builder) obj).setMediaId(str);
        }

        public static void Zo(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setIconUri(uri);
        }

        public static void gn(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setSubtitle(charSequence);
        }

        public static Object j6(Object obj) {
            return ((MediaDescription.Builder) obj).build();
        }

        public static void u7(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setTitle(charSequence);
        }

        public static void v5(Object obj, Bitmap bitmap) {
            ((MediaDescription.Builder) obj).setIconBitmap(bitmap);
        }
    }

    public static CharSequence DW(Object obj) {
        return ((MediaDescription) obj).getDescription();
    }

    public static Bundle FH(Object obj) {
        return ((MediaDescription) obj).getExtras();
    }

    public static Bitmap Hw(Object obj) {
        return ((MediaDescription) obj).getIconBitmap();
    }

    public static CharSequence VH(Object obj) {
        return ((MediaDescription) obj).getSubtitle();
    }

    public static String Zo(Object obj) {
        return ((MediaDescription) obj).getMediaId();
    }

    public static CharSequence gn(Object obj) {
        return ((MediaDescription) obj).getTitle();
    }

    public static Object j6(Parcel parcel) {
        return MediaDescription.CREATOR.createFromParcel(parcel);
    }

    public static void u7(Object obj, Parcel parcel, int i) {
        ((MediaDescription) obj).writeToParcel(parcel, i);
    }

    public static Uri v5(Object obj) {
        return ((MediaDescription) obj).getIconUri();
    }
}
