package tv.ouya.console.api.store;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import tv.ouya.console.api.Product;

/* loaded from: classes.dex */
public final class AppDetails implements Parcelable {
    public static final Parcelable.Creator<AppDetails> CREATOR = new a();
    public List<String> AL;
    public String Jl;
    public boolean Q6;
    public String WB;
    public boolean Z1;
    public String cT;
    public int e3;
    public double eU;
    public String fY;
    public String hK;
    public Product iW;
    public String jw;
    public String k2;
    public boolean kf;
    public String mb;
    public String n5;
    public String q7;
    public Long qp;
    public Long w9;
    public String zh;

    static class a implements Parcelable.Creator<AppDetails> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public AppDetails[] newArray(int i) {
            return new AppDetails[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public AppDetails createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Long lValueOf = Long.valueOf(parcel.readLong());
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            return new AppDetails(string, string2, string3, string4, lValueOf, string5, string6, arrayList, Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), Boolean.valueOf(parcel.readByte() == 1), parcel.readString(), Boolean.valueOf(parcel.readByte() == 1), Boolean.valueOf(parcel.readByte() == 1), parcel.readString(), parcel.readInt() == 1 ? Product.CREATOR.createFromParcel(parcel) : null, parcel.readDouble(), parcel.readInt());
        }
    }

    public AppDetails() {
        this.AL = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppDetails)) {
            return false;
        }
        AppDetails appDetails = (AppDetails) obj;
        if (!this.mb.equals(appDetails.mb) || !this.jw.equals(appDetails.jw) || !this.WB.equals(appDetails.WB) || !this.fY.equals(appDetails.fY) || !this.qp.equals(appDetails.qp) || !this.k2.equals(appDetails.k2) || !this.zh.equals(appDetails.zh) || !this.w9.equals(appDetails.w9) || !this.hK.equals(appDetails.hK) || !this.cT.equals(appDetails.cT) || !this.q7.equals(appDetails.q7) || this.Z1 != appDetails.Z1 || !this.n5.equals(appDetails.n5) || this.Q6 != appDetails.Q6 || this.kf != appDetails.kf) {
            return false;
        }
        String str = this.Jl;
        if (str == null) {
            if (appDetails.Jl != null) {
                return false;
            }
        } else if (!str.equals(appDetails.Jl)) {
            return false;
        }
        Product product = this.iW;
        if (product == null) {
            if (appDetails.iW != null) {
                return false;
            }
        } else if (!product.equals(appDetails.iW)) {
            return false;
        }
        return this.eU == appDetails.eU && this.e3 == appDetails.e3;
    }

    public int hashCode() {
        return (((((this.WB.hashCode() * 31) + this.mb.hashCode()) * 31) + this.jw.hashCode()) * 31) + this.fY.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.WB);
        parcel.writeString(this.mb);
        parcel.writeString(this.jw);
        parcel.writeString(this.fY);
        parcel.writeLong(this.qp.longValue());
        parcel.writeString(this.k2);
        parcel.writeString(this.zh);
        parcel.writeStringList(this.AL);
        parcel.writeLong(this.w9.longValue());
        parcel.writeString(this.hK);
        parcel.writeString(this.cT);
        parcel.writeString(this.q7);
        parcel.writeByte(this.Z1 ? (byte) 1 : (byte) 0);
        parcel.writeString(this.n5);
        parcel.writeByte(this.Q6 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.kf ? (byte) 1 : (byte) 0);
        parcel.writeString(this.Jl);
        parcel.writeInt(this.iW != null ? 1 : 0);
        Product product = this.iW;
        if (product != null) {
            product.writeToParcel(parcel, i);
        }
        parcel.writeDouble(this.eU);
        parcel.writeInt(this.e3);
    }

    public AppDetails(String str, String str2, String str3, String str4, Long l, String str5, String str6, List<String> list, Long l2, String str7, String str8, String str9, Boolean bool, String str10, Boolean bool2, Boolean bool3, String str11, Product product, double d, int i) {
        this.WB = str;
        this.mb = str2;
        this.jw = str3;
        this.fY = str4;
        this.qp = l;
        this.k2 = str5;
        this.zh = str6;
        this.AL = list;
        this.w9 = l2;
        this.hK = str7;
        this.cT = str8;
        this.q7 = str9;
        this.Z1 = bool.booleanValue();
        this.n5 = str10;
        this.Q6 = bool2.booleanValue();
        this.kf = bool3.booleanValue();
        this.Jl = str11;
        this.iW = product;
        this.eU = d;
        this.e3 = i;
    }
}
