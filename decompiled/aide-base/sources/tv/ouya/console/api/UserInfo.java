package tv.ouya.console.api;

import android.os.Parcel;
import android.os.Parcelable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes.dex */
public class UserInfo implements Parcelable {
    public static final DateFormat AL;
    public static final Parcelable.Creator<UserInfo> CREATOR = new a();
    private String WB;
    private Calendar fY;
    private String jw;
    private boolean k2;
    private String mb;
    private int qp;
    private boolean zh;

    static class a implements Parcelable.Creator<UserInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public UserInfo[] newArray(int i) {
            return new UserInfo[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public UserInfo createFromParcel(Parcel parcel) {
            UserInfo userInfo = new UserInfo();
            userInfo.WB = parcel.readString();
            userInfo.mb = parcel.readString();
            userInfo.jw = parcel.readString();
            long j = parcel.readLong();
            if (j > 0) {
                userInfo.fY = new GregorianCalendar();
                userInfo.fY.setTimeInMillis(j);
            }
            userInfo.qp = parcel.readInt();
            userInfo.k2 = parcel.readByte() == 1;
            userInfo.zh = parcel.readByte() == 1;
            return userInfo;
        }
    }

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        AL = simpleDateFormat;
        simpleDateFormat.setLenient(false);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UserInfo.class != obj.getClass()) {
            return false;
        }
        UserInfo userInfo = (UserInfo) obj;
        String str = this.mb;
        if (str == null ? userInfo.mb != null : !str.equals(userInfo.mb)) {
            return false;
        }
        String str2 = this.jw;
        if (str2 == null ? userInfo.jw != null : !str2.equals(userInfo.jw)) {
            return false;
        }
        String str3 = this.WB;
        if (str3 == null ? userInfo.WB != null : !str3.equals(userInfo.WB)) {
            return false;
        }
        Calendar calendar = this.fY;
        if (calendar == null ? userInfo.fY == null : calendar.equals(userInfo.fY)) {
            return this.k2 == userInfo.k2 && this.zh == userInfo.zh;
        }
        return false;
    }

    public int hashCode() {
        String str = this.WB;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.mb;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.jw;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Calendar calendar = this.fY;
        return ((((((iHashCode3 + (calendar != null ? calendar.hashCode() : 0)) * 31) + new Integer(this.qp).hashCode()) * 31) + Boolean.valueOf(this.k2).hashCode()) * 31) + Boolean.valueOf(this.zh).hashCode();
    }

    public String toString() {
        return "UserInfo{username='" + this.WB + "', email='" + this.mb + "', password='" + this.jw + "', dateOfBirth='" + this.fY + "', gender='" + this.qp + "', founder='" + (this.k2 ? 1 : 0) + "', emailOptOut='" + (this.zh ? 1 : 0) + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.WB);
        parcel.writeString(this.mb);
        parcel.writeString(this.jw);
        Calendar calendar = this.fY;
        parcel.writeLong(calendar == null ? 0L : calendar.getTimeInMillis());
        parcel.writeInt(this.qp);
        parcel.writeByte(this.k2 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.zh ? (byte) 1 : (byte) 0);
    }
}
