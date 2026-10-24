package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@jg
/* loaded from: classes.dex */
public final class zzzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzzs> CREATOR = new sy0();
    public final String WB;

    public zzzs(com.google.android.gms.ads.search.a aVar) {
        aVar.j6();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 15, this.WB, false);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }

    zzzs(String str) {
        this.WB = str;
    }
}
