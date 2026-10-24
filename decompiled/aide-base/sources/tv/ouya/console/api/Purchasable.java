package tv.ouya.console.api;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class Purchasable implements Parcelable {
    public static final Parcelable.Creator<Purchasable> CREATOR = new a();
    private String WB;
    private String fY;
    private String jw;
    private String mb;

    static class a implements Parcelable.Creator<Purchasable> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public Purchasable[] newArray(int i) {
            return new Purchasable[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public Purchasable createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            byte b = parcel.readByte();
            if (b == 1) {
                return new Purchasable(string);
            }
            if (b == 2) {
                return new Purchasable(string, parcel.readString(), parcel.readString(), parcel.readString());
            }
            throw new IllegalArgumentException("Unable to rebuild purchasable. Encryption data state unknown");
        }
    }

    public Purchasable(String str) {
        this.WB = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Purchasable.class != obj.getClass()) {
            return false;
        }
        return this.WB.equals(((Purchasable) obj).WB);
    }

    public int hashCode() {
        return this.WB.hashCode();
    }

    public boolean j6() {
        return (this.mb == null || this.jw == null || this.fY == null) ? false : true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.WB);
        if (!j6()) {
            parcel.writeByte((byte) 1);
            return;
        }
        parcel.writeByte((byte) 2);
        parcel.writeString(this.mb);
        parcel.writeString(this.jw);
        parcel.writeString(this.fY);
    }

    public Purchasable(String str, String str2, String str3, String str4) {
        this.WB = str;
        this.mb = str2;
        this.jw = str3;
        this.fY = str4;
    }
}
