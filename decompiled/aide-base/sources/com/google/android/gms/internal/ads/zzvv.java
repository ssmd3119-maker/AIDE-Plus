package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@jg
/* loaded from: classes.dex */
public final class zzvv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvv> CREATOR = new jv0();
    private final String WB;
    private final String mb;

    public zzvv(String str, String str2) {
        this.WB = str;
        this.mb = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 1, this.WB, false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 2, this.mb, false);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }
}
