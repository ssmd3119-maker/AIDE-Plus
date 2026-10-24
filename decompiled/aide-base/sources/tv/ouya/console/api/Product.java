package tv.ouya.console.api;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class Product implements Parcelable {
    public static final Parcelable.Creator<Product> CREATOR = new a();
    private String AL;
    private String WB;
    private double fY;
    private int hK = 5;
    private int jw;
    private double k2;
    private String mb;
    private String qp;
    private String w9;
    private double zh;

    static class a implements Parcelable.Creator<Product> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public Product[] newArray(int i) {
            return new Product[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public Product createFromParcel(Parcel parcel) {
            return new Product(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readDouble(), parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readString(), parcel.readString());
        }
    }

    public Product() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Product)) {
            return false;
        }
        Product product = (Product) obj;
        if (this.jw != product.jw || !this.mb.equals(product.mb) || !this.WB.equals(product.WB) || this.fY != product.fY) {
            return false;
        }
        String str = this.qp;
        return (str == null || str.equals(product.qp)) && this.k2 == product.k2 && this.zh == product.zh && this.AL.equals(product.AL) && this.w9.equals(product.w9);
    }

    public int hashCode() {
        int iHashCode = (((((this.WB.hashCode() * 31) + this.mb.hashCode()) * 31) + this.jw) * 31) + Double.valueOf(this.fY).hashCode();
        String str = this.qp;
        return str != null ? (iHashCode * 31) + str.hashCode() : iHashCode;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.WB);
        parcel.writeString(this.mb);
        parcel.writeInt(this.jw);
        if (this.hK >= 2) {
            parcel.writeDouble(this.fY);
            parcel.writeString(this.qp);
        }
        if (this.hK >= 3) {
            parcel.writeDouble(this.k2);
            parcel.writeDouble(this.zh);
        }
        if (this.hK >= 4) {
            parcel.writeString(this.AL);
        }
        if (this.hK >= 5) {
            parcel.writeString(this.w9);
        }
    }

    public Product(String str, String str2, int i, double d, String str3, double d2, double d3, String str4, String str5) {
        this.WB = str;
        this.mb = str2;
        this.jw = i;
        this.fY = d;
        this.qp = str3;
        this.k2 = d2;
        this.zh = d3;
        this.AL = str4;
        this.w9 = str5;
    }
}
