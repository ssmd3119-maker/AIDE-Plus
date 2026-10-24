package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@jg
/* loaded from: classes.dex */
public final class zzbbi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbbi> CREATOR = new cq();
    public String WB;
    public boolean fY;
    public int jw;
    public int mb;
    public boolean qp;

    public zzbbi(int i, int i2, boolean z) {
        this(i, i2, z, false, false);
    }

    public static zzbbi gn() {
        return new zzbbi(12451009, 12451009, true);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 2, this.WB, false);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 3, this.mb);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 4, this.jw);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 5, this.fY);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 6, this.qp);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }

    public zzbbi(int i, int i2, boolean z, boolean z2) {
        this(14300000, i2, true, false, z2);
    }

    private zzbbi(int i, int i2, boolean z, boolean z2, boolean z3) {
        String str = z ? "0" : "1";
        StringBuilder sb = new StringBuilder(str.length() + 36);
        sb.append("afma-sdk-a-v");
        sb.append(i);
        sb.append(".");
        sb.append(i2);
        sb.append(".");
        sb.append(str);
        this(sb.toString(), i, i2, z, z3);
    }

    zzbbi(String str, int i, int i2, boolean z, boolean z2) {
        this.WB = str;
        this.mb = i;
        this.jw = i2;
        this.fY = z;
        this.qp = z2;
    }
}
