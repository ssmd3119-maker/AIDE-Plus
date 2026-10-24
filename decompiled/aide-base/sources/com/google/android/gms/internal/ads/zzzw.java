package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@jg
/* loaded from: classes.dex */
public final class zzzw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzzw> CREATOR = new uy0();
    public final boolean WB;
    public final boolean jw;
    public final boolean mb;

    public zzzw(com.google.android.gms.ads.h hVar) {
        this(hVar.FH(), hVar.DW(), hVar.j6());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 2, this.WB);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 3, this.mb);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 4, this.jw);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }

    public zzzw(boolean z, boolean z2, boolean z3) {
        this.WB = z;
        this.mb = z2;
        this.jw = z3;
    }
}
