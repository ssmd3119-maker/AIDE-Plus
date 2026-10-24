package android.support.v4.media;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.ArrayMap;

/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;
    static final ArrayMap<String, Integer> jw;
    final Bundle WB;
    private Object mb;

    static class a implements Parcelable.Creator<MediaMetadataCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }
    }

    static {
        ArrayMap<String, Integer> arrayMap = new ArrayMap<>();
        jw = arrayMap;
        arrayMap.put("android.media.metadata.TITLE", 1);
        jw.put("android.media.metadata.ARTIST", 1);
        jw.put("android.media.metadata.DURATION", 0);
        jw.put("android.media.metadata.ALBUM", 1);
        jw.put("android.media.metadata.AUTHOR", 1);
        jw.put("android.media.metadata.WRITER", 1);
        jw.put("android.media.metadata.COMPOSER", 1);
        jw.put("android.media.metadata.COMPILATION", 1);
        jw.put("android.media.metadata.DATE", 1);
        jw.put("android.media.metadata.YEAR", 0);
        jw.put("android.media.metadata.GENRE", 1);
        jw.put("android.media.metadata.TRACK_NUMBER", 0);
        jw.put("android.media.metadata.NUM_TRACKS", 0);
        jw.put("android.media.metadata.DISC_NUMBER", 0);
        jw.put("android.media.metadata.ALBUM_ARTIST", 1);
        jw.put("android.media.metadata.ART", 2);
        jw.put("android.media.metadata.ART_URI", 1);
        jw.put("android.media.metadata.ALBUM_ART", 2);
        jw.put("android.media.metadata.ALBUM_ART_URI", 1);
        jw.put("android.media.metadata.USER_RATING", 3);
        jw.put("android.media.metadata.RATING", 3);
        jw.put("android.media.metadata.DISPLAY_TITLE", 1);
        jw.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        jw.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        jw.put("android.media.metadata.DISPLAY_ICON", 2);
        jw.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        jw.put("android.media.metadata.MEDIA_ID", 1);
        jw.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        jw.put("android.media.metadata.MEDIA_URI", 1);
        jw.put("android.media.metadata.ADVERTISEMENT", 0);
        jw.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        CREATOR = new a();
    }

    MediaMetadataCompat(Parcel parcel) {
        this.WB = parcel.readBundle();
    }

    public static MediaMetadataCompat j6(Object obj) {
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        i.j6(obj, parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        MediaMetadataCompat mediaMetadataCompatCreateFromParcel = CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        mediaMetadataCompatCreateFromParcel.mb = obj;
        return mediaMetadataCompatCreateFromParcel;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.WB);
    }
}
