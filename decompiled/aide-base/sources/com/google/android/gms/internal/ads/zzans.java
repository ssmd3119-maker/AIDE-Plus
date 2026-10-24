package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzans extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzans> CREATOR = new pc();
    private final int WB;
    private final int jw;
    private final int mb;

    zzans(int i, int i2, int i3) {
        this.WB = i;
        this.mb = i2;
        this.jw = i3;
    }

    public static zzans gn(rx rxVar) {
        throw new NoSuchMethodError();
    }

    public final String toString() {
        int i = this.WB;
        int i2 = this.mb;
        int i3 = this.jw;
        StringBuilder sb = new StringBuilder(35);
        sb.append(i);
        sb.append(".");
        sb.append(i2);
        sb.append(".");
        sb.append(i3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 1, this.WB);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 2, this.mb);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 3, this.jw);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }
}
