package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.ads.jg;

@jg
/* loaded from: classes.dex */
public final class zzaq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaq> CREATOR = new r();
    public final boolean AL;
    public final boolean WB;
    public final boolean fY;
    private final String jw;
    public final int k2;
    public final boolean mb;
    public final float qp;
    public final boolean w9;
    public final boolean zh;

    public zzaq(boolean z, boolean z2, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this(z, z2, null, z3, f, i, z4, z5, z6);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 2, this.WB);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 3, this.mb);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 4, this.jw, false);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 5, this.fY);
        com.google.android.gms.common.internal.safeparcel.b.VH(parcel, 6, this.qp);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 7, this.k2);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 8, this.zh);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 9, this.AL);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 10, this.w9);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }

    zzaq(boolean z, boolean z2, String str, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this.WB = z;
        this.mb = z2;
        this.jw = str;
        this.fY = z3;
        this.qp = f;
        this.k2 = i;
        this.zh = z4;
        this.AL = z5;
        this.w9 = z6;
    }
}
