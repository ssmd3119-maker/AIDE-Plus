package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzkk extends zzkp {
    public static final Parcelable.Creator<zzkk> CREATOR = new nj0();
    private final int fY;
    private final String jw;
    private final String mb;
    private final byte[] qp;

    public zzkk(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.mb = str;
        this.jw = null;
        this.fY = 3;
        this.qp = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzkk.class == obj.getClass()) {
            zzkk zzkkVar = (zzkk) obj;
            if (this.fY == zzkkVar.fY && ip0.u7(this.mb, zzkkVar.mb) && ip0.u7(this.jw, zzkkVar.jw) && Arrays.equals(this.qp, zzkkVar.qp)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.fY + 527) * 31;
        String str = this.mb;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.jw;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.qp);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mb);
        parcel.writeString(this.jw);
        parcel.writeInt(this.fY);
        parcel.writeByteArray(this.qp);
    }

    zzkk(Parcel parcel) {
        super("APIC");
        this.mb = parcel.readString();
        this.jw = parcel.readString();
        this.fY = parcel.readInt();
        this.qp = parcel.createByteArray();
    }
}
