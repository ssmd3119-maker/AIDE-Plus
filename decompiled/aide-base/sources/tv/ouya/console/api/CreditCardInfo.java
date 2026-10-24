package tv.ouya.console.api;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class CreditCardInfo implements Parcelable {
    public static final Parcelable.Creator<CreditCardInfo> CREATOR = new a();
    private double WB;
    private String fY;
    private String jw;
    private boolean k2;
    private String mb;
    private String qp;

    static class a implements Parcelable.Creator<CreditCardInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public CreditCardInfo[] newArray(int i) {
            return new CreditCardInfo[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public CreditCardInfo createFromParcel(Parcel parcel) {
            return new CreditCardInfo(parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 1);
        }
    }

    public CreditCardInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditCardInfo)) {
            return false;
        }
        CreditCardInfo creditCardInfo = (CreditCardInfo) obj;
        return this.WB == creditCardInfo.WB && this.mb.equals(creditCardInfo.mb) && this.jw.equals(creditCardInfo.jw) && this.fY.equals(creditCardInfo.fY) && this.qp.equals(creditCardInfo.qp) && this.k2 == creditCardInfo.k2;
    }

    public int hashCode() {
        int iHashCode = Double.valueOf(this.WB).hashCode();
        String str = this.mb;
        if (str != null) {
            iHashCode = (iHashCode * 31) + str.hashCode();
        }
        String str2 = this.jw;
        if (str2 != null) {
            iHashCode = (iHashCode * 31) + str2.hashCode();
        }
        String str3 = this.fY;
        if (str3 != null) {
            iHashCode = (iHashCode * 31) + str3.hashCode();
        }
        String str4 = this.qp;
        return str4 != null ? (iHashCode * 31) + str4.hashCode() : iHashCode;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.WB);
        parcel.writeString(this.mb);
        parcel.writeString(this.jw);
        parcel.writeString(this.fY);
        parcel.writeString(this.qp);
        parcel.writeInt(this.k2 ? 1 : 0);
    }

    public CreditCardInfo(double d, String str, String str2, String str3, String str4, boolean z) {
        this.WB = d;
        this.mb = str;
        this.jw = str2;
        this.fY = str3;
        this.qp = str4;
        this.k2 = z;
    }
}
