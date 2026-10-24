package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.e;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();
    final long AL;
    final int WB;
    final Bundle cT;
    final float fY;
    final long hK;
    final long jw;
    final int k2;
    final long mb;
    private Object q7;
    final long qp;
    List<CustomAction> w9;
    final CharSequence zh;

    static class a implements Parcelable.Creator<PlaybackStateCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.WB = i;
        this.mb = j;
        this.jw = j2;
        this.fY = f;
        this.qp = j3;
        this.k2 = i2;
        this.zh = charSequence;
        this.AL = j4;
        this.w9 = new ArrayList(list);
        this.hK = j5;
        this.cT = bundle;
    }

    public static PlaybackStateCompat j6(Object obj) {
        ArrayList arrayList;
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        List<Object> listHw = e.Hw(obj);
        if (listHw != null) {
            ArrayList arrayList2 = new ArrayList(listHw.size());
            Iterator<Object> it = listHw.iterator();
            while (it.hasNext()) {
                arrayList2.add(CustomAction.j6(it.next()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(e.u7(obj), e.gn(obj), e.FH(obj), e.VH(obj), e.j6(obj), 0, e.v5(obj), e.Zo(obj), arrayList, e.DW(obj), Build.VERSION.SDK_INT >= 22 ? f.j6(obj) : null);
        playbackStateCompat.q7 = obj;
        return playbackStateCompat;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.WB + ", position=" + this.mb + ", buffered position=" + this.jw + ", speed=" + this.fY + ", updated=" + this.AL + ", actions=" + this.qp + ", error code=" + this.k2 + ", error message=" + this.zh + ", custom actions=" + this.w9 + ", active item id=" + this.hK + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.WB);
        parcel.writeLong(this.mb);
        parcel.writeFloat(this.fY);
        parcel.writeLong(this.AL);
        parcel.writeLong(this.jw);
        parcel.writeLong(this.qp);
        TextUtils.writeToParcel(this.zh, parcel, i);
        parcel.writeTypedList(this.w9);
        parcel.writeLong(this.hK);
        parcel.writeBundle(this.cT);
        parcel.writeInt(this.k2);
    }

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();
        private final String WB;
        private final Bundle fY;
        private final int jw;
        private final CharSequence mb;
        private Object qp;

        static class a implements Parcelable.Creator<CustomAction> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: DW, reason: merged with bridge method [inline-methods] */
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: j6, reason: merged with bridge method [inline-methods] */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.WB = str;
            this.mb = charSequence;
            this.jw = i;
            this.fY = bundle;
        }

        public static CustomAction j6(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            CustomAction customAction = new CustomAction(e.a.j6(obj), e.a.Hw(obj), e.a.FH(obj), e.a.DW(obj));
            customAction.qp = obj;
            return customAction;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.mb) + ", mIcon=" + this.jw + ", mExtras=" + this.fY;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.WB);
            TextUtils.writeToParcel(this.mb, parcel, i);
            parcel.writeInt(this.jw);
            parcel.writeBundle(this.fY);
        }

        CustomAction(Parcel parcel) {
            this.WB = parcel.readString();
            this.mb = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.jw = parcel.readInt();
            this.fY = parcel.readBundle();
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.WB = parcel.readInt();
        this.mb = parcel.readLong();
        this.fY = parcel.readFloat();
        this.AL = parcel.readLong();
        this.jw = parcel.readLong();
        this.qp = parcel.readLong();
        this.zh = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.w9 = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.hK = parcel.readLong();
        this.cT = parcel.readBundle();
        this.k2 = parcel.readInt();
    }
}
