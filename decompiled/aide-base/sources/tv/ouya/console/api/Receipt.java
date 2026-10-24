package tv.ouya.console.api;

import android.os.Parcel;
import android.os.Parcelable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* loaded from: classes.dex */
public class Receipt implements Parcelable {
    public static final Parcelable.Creator<Receipt> CREATOR;
    private static final SimpleDateFormat w9;
    private Date AL;
    private String WB;
    private String fY;
    private Date jw;
    private double k2;
    private int mb;
    private String qp;
    private String zh;

    static class a implements Parcelable.Creator<Receipt> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public Receipt[] newArray(int i) {
            return new Receipt[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public Receipt createFromParcel(Parcel parcel) {
            return new Receipt(parcel.readString(), parcel.readInt(), new Date(parcel.readLong()), new Date(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString());
        }
    }

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy-MM-dd'T'HH:mm:ss'Z'");
        w9 = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        CREATOR = new a();
    }

    public Receipt() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Receipt)) {
            return false;
        }
        Receipt receipt = (Receipt) obj;
        if (!this.WB.equals(receipt.WB) || this.mb != receipt.mb || !this.jw.equals(receipt.jw) || !this.fY.equals(receipt.fY) || !this.qp.equals(receipt.qp) || this.k2 != receipt.k2) {
            return false;
        }
        String str = this.zh;
        return str == null || str.equals(receipt.zh);
    }

    public int hashCode() {
        int iHashCode = (((((((((this.WB.hashCode() * 31) + this.mb) * 31) + this.jw.hashCode()) * 31) + this.fY.hashCode()) * 31) + this.qp.hashCode()) * 31) + Double.valueOf(this.k2).hashCode();
        String str = this.zh;
        return str != null ? (iHashCode * 31) + str.hashCode() : iHashCode;
    }

    public String j6() {
        return this.WB;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.WB);
        parcel.writeInt(this.mb);
        parcel.writeLong(this.jw.getTime());
        parcel.writeLong(this.AL.getTime());
        parcel.writeString(this.fY);
        parcel.writeString(this.qp);
        parcel.writeDouble(this.k2);
        parcel.writeString(this.zh);
    }

    public Receipt(String str, int i, Date date, Date date2, String str2, String str3, double d, String str4) {
        this.WB = str;
        this.mb = i;
        this.jw = date;
        this.AL = date2;
        this.fY = str2;
        this.qp = str3;
        this.k2 = d;
        this.zh = str4;
    }
}
