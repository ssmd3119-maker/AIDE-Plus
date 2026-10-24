package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@jg
/* loaded from: classes.dex */
public final class zzafn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzafn> CREATOR = new o4();
    public final long AL;
    public final boolean WB;
    public final byte[] fY;
    public final int jw;
    public final String[] k2;
    public final String mb;
    public final String[] qp;
    public final boolean zh;

    zzafn(boolean z, String str, int i, byte[] bArr, String[] strArr, String[] strArr2, boolean z2, long j) {
        this.WB = z;
        this.mb = str;
        this.jw = i;
        this.fY = bArr;
        this.qp = strArr;
        this.k2 = strArr2;
        this.zh = z2;
        this.AL = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 1, this.WB);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 2, this.mb, false);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 3, this.jw);
        com.google.android.gms.common.internal.safeparcel.b.v5(parcel, 4, this.fY, false);
        com.google.android.gms.common.internal.safeparcel.b.aM(parcel, 5, this.qp, false);
        com.google.android.gms.common.internal.safeparcel.b.aM(parcel, 6, this.k2, false);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 7, this.zh);
        com.google.android.gms.common.internal.safeparcel.b.J0(parcel, 8, this.AL);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }
}
