package tv.ouya.console.api.store;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import tv.ouya.console.api.Product;

/* loaded from: classes.dex */
public class AppDescription implements Parcelable {
    public static final Parcelable.Creator<AppDescription> CREATOR = new a();
    private boolean AL;
    private String WB;
    private String fY;
    private String hK;
    private HashMap<String, b> jw;
    private int k2;
    private String mb;
    private double qp;
    public Product w9;
    private boolean zh;

    static class a implements Parcelable.Creator<AppDescription> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public AppDescription[] newArray(int i) {
            return new AppDescription[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public AppDescription createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            HashMap map = null;
            Product productCreateFromParcel = parcel.readInt() == 1 ? Product.CREATOR.createFromParcel(parcel) : null;
            int i = parcel.readInt();
            if (i > -1) {
                map = new HashMap();
                for (int i2 = 0; i2 < i; i2++) {
                    String string4 = parcel.readString();
                    b bVar = new b();
                    bVar.gn(parcel.readString());
                    bVar.VH(parcel.readString());
                    bVar.Zo(parcel.readString());
                    bVar.v5(parcel.readString());
                    map.put(string4, bVar);
                }
            }
            return new AppDescription(string, string2, string3, productCreateFromParcel, map, parcel.readDouble(), parcel.readInt(), parcel.readByte() == 1, parcel.readByte() == 1, parcel.readString());
        }
    }

    public static class b {
        private String DW;
        private String FH;
        private String Hw;
        private String j6;

        public String DW() {
            return this.FH;
        }

        public String FH() {
            return this.DW;
        }

        public String Hw() {
            return this.j6;
        }

        public void VH(String str) {
            this.DW = str;
        }

        public void Zo(String str) {
            this.FH = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            String str = this.DW;
            if (str == null ? bVar.DW != null : !str.equals(bVar.DW)) {
                return false;
            }
            String str2 = this.j6;
            if (str2 == null ? bVar.j6 != null : !str2.equals(bVar.j6)) {
                return false;
            }
            String str3 = this.FH;
            if (str3 == null ? bVar.FH != null : !str3.equals(bVar.FH)) {
                return false;
            }
            String str4 = this.Hw;
            String str5 = bVar.Hw;
            return str4 == null ? str5 == null : str4.equals(str5);
        }

        public void gn(String str) {
            this.j6 = str;
        }

        public int hashCode() {
            String str = this.j6;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.DW;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.FH;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.Hw;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public String j6() {
            return this.Hw;
        }

        public String toString() {
            return "AppVersion{uuid='" + this.j6 + "', uploadedAt=" + this.DW + ", mainImageFullUrl='" + this.FH + "', contentRating='" + this.Hw + "'}";
        }

        public void v5(String str) {
            this.Hw = str;
        }
    }

    public AppDescription() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppDescription)) {
            return false;
        }
        AppDescription appDescription = (AppDescription) obj;
        String str = this.mb;
        if (str == null ? appDescription.mb != null : !str.equals(appDescription.mb)) {
            return false;
        }
        String str2 = this.WB;
        if (str2 == null ? appDescription.WB != null : !str2.equals(appDescription.WB)) {
            return false;
        }
        String str3 = this.fY;
        if (str3 == null ? appDescription.fY != null : !str3.equals(appDescription.fY)) {
            return false;
        }
        Product product = this.w9;
        if (product == null) {
            if (appDescription.w9 != null) {
                return false;
            }
        } else if (!product.equals(appDescription.w9)) {
            return false;
        }
        HashMap<String, b> map = this.jw;
        if (map == null ? appDescription.jw != null : !map.equals(appDescription.jw)) {
            return false;
        }
        if (this.qp != appDescription.qp || this.k2 != appDescription.k2 || this.zh != appDescription.zh || this.AL != appDescription.AL) {
            return false;
        }
        String str4 = this.hK;
        return str4 == null || str4.equals(appDescription.hK);
    }

    public int hashCode() {
        String str = this.WB;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.mb;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        HashMap<String, b> map = this.jw;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "AppDescription{title='" + this.mb + "', uuid='" + this.WB + "', versions=" + this.jw + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.WB);
        parcel.writeString(this.mb);
        parcel.writeString(this.fY);
        parcel.writeInt(this.w9 != null ? 1 : 0);
        Product product = this.w9;
        if (product != null) {
            product.writeToParcel(parcel, i);
        }
        HashMap<String, b> map = this.jw;
        if (map == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(map.size());
            for (String str : this.jw.keySet()) {
                parcel.writeString(str);
                parcel.writeString(this.jw.get(str).Hw());
                parcel.writeString(this.jw.get(str).FH());
                parcel.writeString(this.jw.get(str).DW());
                parcel.writeString(this.jw.get(str).j6());
            }
        }
        parcel.writeDouble(this.qp);
        parcel.writeInt(this.k2);
        parcel.writeByte(this.zh ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.AL ? (byte) 1 : (byte) 0);
        parcel.writeString(this.hK);
    }

    public AppDescription(String str, String str2, String str3, Product product, HashMap<String, b> map, double d, int i, boolean z, boolean z2, String str4) {
        this.WB = str;
        this.mb = str2;
        this.fY = str3;
        this.jw = map;
        this.w9 = product;
        this.qp = d;
        this.k2 = i;
        this.zh = z;
        this.AL = z2;
        this.hK = str4;
    }
}
