package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzqi implements Parcelable {
    public static final Parcelable.Creator<zzqi> CREATOR = new mp0();
    public final int WB;
    public final byte[] fY;
    public final int jw;
    public final int mb;
    private int qp;

    public zzqi(int i, int i2, int i3, byte[] bArr) {
        this.WB = i;
        this.mb = i2;
        this.jw = i3;
        this.fY = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzqi.class == obj.getClass()) {
            zzqi zzqiVar = (zzqi) obj;
            if (this.WB == zzqiVar.WB && this.mb == zzqiVar.mb && this.jw == zzqiVar.jw && Arrays.equals(this.fY, zzqiVar.fY)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.qp == 0) {
            this.qp = ((((((this.WB + 527) * 31) + this.mb) * 31) + this.jw) * 31) + Arrays.hashCode(this.fY);
        }
        return this.qp;
    }

    public final String toString() {
        int i = this.WB;
        int i2 = this.mb;
        int i3 = this.jw;
        boolean z = this.fY != null;
        StringBuilder sb = new StringBuilder(55);
        sb.append("ColorInfo(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.WB);
        parcel.writeInt(this.mb);
        parcel.writeInt(this.jw);
        parcel.writeInt(this.fY != null ? 1 : 0);
        byte[] bArr = this.fY;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    zzqi(Parcel parcel) {
        this.WB = parcel.readInt();
        this.mb = parcel.readInt();
        this.jw = parcel.readInt();
        this.fY = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }
}
