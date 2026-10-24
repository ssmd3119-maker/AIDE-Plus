package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public final class zzdy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdy> CREATOR = new l();
    public final long WB;
    public final String fY;
    public final boolean jw;
    public final String k2;
    public final long mb;
    public final String qp;
    public final Bundle zh;

    zzdy(long j, long j2, boolean z, String str, String str2, String str3, Bundle bundle) {
        this.WB = j;
        this.mb = j2;
        this.jw = z;
        this.fY = str;
        this.qp = str2;
        this.k2 = str3;
        this.zh = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.J0(parcel, 1, this.WB);
        com.google.android.gms.common.internal.safeparcel.b.J0(parcel, 2, this.mb);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 3, this.jw);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 4, this.fY, false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 5, this.qp, false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 6, this.k2, false);
        com.google.android.gms.common.internal.safeparcel.b.Hw(parcel, 7, this.zh, false);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }
}
