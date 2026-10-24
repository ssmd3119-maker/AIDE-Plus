package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzkm extends zzkp {
    public static final Parcelable.Creator<zzkm> CREATOR = new oj0();
    public final String fY;
    public final String jw;
    private final String mb;

    public zzkm(String str, String str2, String str3) {
        super("COMM");
        this.mb = str;
        this.jw = str2;
        this.fY = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzkm.class == obj.getClass()) {
            zzkm zzkmVar = (zzkm) obj;
            if (ip0.u7(this.jw, zzkmVar.jw) && ip0.u7(this.mb, zzkmVar.mb) && ip0.u7(this.fY, zzkmVar.fY)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.mb;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.jw;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.fY;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.WB);
        parcel.writeString(this.mb);
        parcel.writeString(this.fY);
    }

    zzkm(Parcel parcel) {
        super("COMM");
        this.mb = parcel.readString();
        this.jw = parcel.readString();
        this.fY = parcel.readString();
    }
}
