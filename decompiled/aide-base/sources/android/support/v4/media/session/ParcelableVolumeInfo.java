package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();
    public int WB;
    public int fY;
    public int jw;
    public int mb;
    public int qp;

    static class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.WB = parcel.readInt();
        this.jw = parcel.readInt();
        this.fY = parcel.readInt();
        this.qp = parcel.readInt();
        this.mb = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.WB);
        parcel.writeInt(this.jw);
        parcel.writeInt(this.fY);
        parcel.writeInt(this.qp);
        parcel.writeInt(this.mb);
    }
}
