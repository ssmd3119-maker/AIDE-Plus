package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@jg
/* loaded from: classes.dex */
public final class zzavh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzavh> CREATOR = new ck();
    public final zzwb WB;
    public final String mb;

    public zzavh(zzwb zzwbVar, String str) {
        this.WB = zzwbVar;
        this.mb = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.QX(parcel, 2, this.WB, i, false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 3, this.mb, false);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }
}
