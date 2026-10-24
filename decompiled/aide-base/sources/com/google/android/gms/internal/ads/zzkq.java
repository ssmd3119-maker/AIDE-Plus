package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzkq extends zzkp {
    public static final Parcelable.Creator<zzkq> CREATOR = new pj0();
    private final String jw;
    private final String mb;

    public zzkq(String str, String str2, String str3) {
        super(str);
        this.mb = null;
        this.jw = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzkq.class == obj.getClass()) {
            zzkq zzkqVar = (zzkq) obj;
            if (this.WB.equals(zzkqVar.WB) && ip0.u7(this.mb, zzkqVar.mb) && ip0.u7(this.jw, zzkqVar.jw)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.WB.hashCode() + 527) * 31;
        String str = this.mb;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.jw;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.WB);
        parcel.writeString(this.mb);
        parcel.writeString(this.jw);
    }

    zzkq(Parcel parcel) {
        super(parcel.readString());
        this.mb = parcel.readString();
        this.jw = parcel.readString();
    }
}
