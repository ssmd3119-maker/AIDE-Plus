package tv.ouya.console.api.store;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class StoreSection implements Parcelable {
    public static final Parcelable.Creator<StoreSection> CREATOR = new a();
    private String WB;
    private List<StoreSection> jw;
    private b mb;

    static class a implements Parcelable.Creator<StoreSection> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public StoreSection[] newArray(int i) {
            return new StoreSection[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public StoreSection createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(createFromParcel(parcel));
            }
            return new StoreSection(string, string2, arrayList);
        }
    }

    public enum b {
        TAG,
        LIST
    }

    public StoreSection() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreSection)) {
            return false;
        }
        StoreSection storeSection = (StoreSection) obj;
        return this.WB.equals(storeSection.WB) && this.mb.equals(storeSection.mb) && this.jw.equals(storeSection.jw);
    }

    public int hashCode() {
        return (((this.WB.hashCode() * 31) + this.mb.hashCode()) * 31) + this.jw.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.WB);
        parcel.writeString(this.mb.name().toUpperCase());
        parcel.writeInt(this.jw.size());
        for (int i2 = 0; i2 < this.jw.size(); i2++) {
            this.jw.get(i2).writeToParcel(parcel, i);
        }
    }

    public StoreSection(String str, String str2, List<StoreSection> list) {
        this.WB = str;
        this.mb = b.valueOf(str2.toUpperCase());
        this.jw = list;
    }
}
