package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.g;
import android.support.v4.media.h;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();
    private final Uri AL;
    private final String WB;
    private final CharSequence fY;
    private final CharSequence jw;
    private final Uri k2;
    private final CharSequence mb;
    private final Bitmap qp;
    private Object w9;
    private final Bundle zh;

    static class a implements Parcelable.Creator<MediaDescriptionCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return Build.VERSION.SDK_INT < 21 ? new MediaDescriptionCompat(parcel) : MediaDescriptionCompat.j6(g.j6(parcel));
        }
    }

    public static final class b {
        private CharSequence DW;
        private CharSequence FH;
        private CharSequence Hw;
        private Bundle VH;
        private Uri Zo;
        private Uri gn;
        private String j6;
        private Bitmap v5;

        public b DW(CharSequence charSequence) {
            this.Hw = charSequence;
            return this;
        }

        public b FH(Bundle bundle) {
            this.VH = bundle;
            return this;
        }

        public b Hw(Bitmap bitmap) {
            this.v5 = bitmap;
            return this;
        }

        public b VH(Uri uri) {
            this.gn = uri;
            return this;
        }

        public b Zo(String str) {
            this.j6 = str;
            return this;
        }

        public b gn(CharSequence charSequence) {
            this.FH = charSequence;
            return this;
        }

        public MediaDescriptionCompat j6() {
            return new MediaDescriptionCompat(this.j6, this.DW, this.FH, this.Hw, this.v5, this.Zo, this.VH, this.gn);
        }

        public b u7(CharSequence charSequence) {
            this.DW = charSequence;
            return this;
        }

        public b v5(Uri uri) {
            this.Zo = uri;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.WB = str;
        this.mb = charSequence;
        this.jw = charSequence2;
        this.fY = charSequence3;
        this.qp = bitmap;
        this.k2 = uri;
        this.zh = bundle;
        this.AL = uri2;
    }

    public static MediaDescriptionCompat j6(Object obj) {
        Bundle bundle = null;
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        b bVar = new b();
        bVar.Zo(g.Zo(obj));
        bVar.u7(g.gn(obj));
        bVar.gn(g.VH(obj));
        bVar.DW(g.DW(obj));
        bVar.Hw(g.Hw(obj));
        bVar.v5(g.v5(obj));
        Bundle bundleFH = g.FH(obj);
        Uri uri = bundleFH == null ? null : (Uri) bundleFH.getParcelable("android.support.v4.media.description.MEDIA_URI");
        if (uri == null) {
            bundle = bundleFH;
        } else if (!bundleFH.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || bundleFH.size() != 2) {
            bundleFH.remove("android.support.v4.media.description.MEDIA_URI");
            bundleFH.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            bundle = bundleFH;
        }
        bVar.FH(bundle);
        if (uri != null) {
            bVar.VH(uri);
        } else if (Build.VERSION.SDK_INT >= 23) {
            bVar.VH(h.tp(obj));
        }
        MediaDescriptionCompat mediaDescriptionCompatJ6 = bVar.j6();
        mediaDescriptionCompatJ6.w9 = obj;
        return mediaDescriptionCompatJ6;
    }

    public Object DW() {
        if (this.w9 != null || Build.VERSION.SDK_INT < 21) {
            return this.w9;
        }
        Object objDW = g.a.DW();
        g.a.VH(objDW, this.WB);
        g.a.u7(objDW, this.mb);
        g.a.gn(objDW, this.jw);
        g.a.FH(objDW, this.fY);
        g.a.v5(objDW, this.qp);
        g.a.Zo(objDW, this.k2);
        Bundle bundle = this.zh;
        if (Build.VERSION.SDK_INT < 23 && this.AL != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.AL);
        }
        g.a.Hw(objDW, bundle);
        if (Build.VERSION.SDK_INT >= 23) {
            h.a.tp(objDW, this.AL);
        }
        Object objJ6 = g.a.j6(objDW);
        this.w9 = objJ6;
        return objJ6;
    }

    public String FH() {
        return this.WB;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.mb) + ", " + ((Object) this.jw) + ", " + ((Object) this.fY);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            g.u7(DW(), parcel, i);
            return;
        }
        parcel.writeString(this.WB);
        TextUtils.writeToParcel(this.mb, parcel, i);
        TextUtils.writeToParcel(this.jw, parcel, i);
        TextUtils.writeToParcel(this.fY, parcel, i);
        parcel.writeParcelable(this.qp, i);
        parcel.writeParcelable(this.k2, i);
        parcel.writeBundle(this.zh);
        parcel.writeParcelable(this.AL, i);
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.WB = parcel.readString();
        this.mb = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.jw = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.fY = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.qp = (Bitmap) parcel.readParcelable(null);
        this.k2 = (Uri) parcel.readParcelable(null);
        this.zh = parcel.readBundle();
        this.AL = (Uri) parcel.readParcelable(null);
    }
}
