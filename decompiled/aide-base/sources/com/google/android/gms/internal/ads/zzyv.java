package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@jg
/* loaded from: classes.dex */
public final class zzyv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzyv> CREATOR = new ey0();
    public final int WB;

    public zzyv(int i) {
        this.WB = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 2, this.WB);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }
}
