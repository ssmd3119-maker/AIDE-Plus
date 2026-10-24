package tv.ouya.console.api.store;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class Tag implements Parcelable {
    public static final Parcelable.Creator<Tag> CREATOR = new a();
    private String WB;
    private String jw;
    public Boolean mb;

    static class a implements Parcelable.Creator<Tag> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public Tag[] newArray(int i) {
            return new Tag[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public Tag createFromParcel(Parcel parcel) {
            return new Tag(parcel.readString(), Boolean.valueOf(parcel.readInt() == 1), parcel.readString());
        }
    }

    public Tag() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        Boolean bool;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tag)) {
            return false;
        }
        Tag tag = (Tag) obj;
        return this.WB.equals(tag.WB) && (bool = this.mb) == bool && this.jw.equals(tag.jw);
    }

    public int hashCode() {
        return (((this.WB.hashCode() * 31) + this.mb.hashCode()) * 31) + this.jw.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.WB);
        parcel.writeInt(this.mb.booleanValue() ? 1 : 0);
        parcel.writeString(this.jw);
    }

    public Tag(String str, Boolean bool, String str2) {
        this.WB = str;
        this.mb = bool;
        this.jw = str2;
    }
}
