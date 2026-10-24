package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;

/* loaded from: classes.dex */
public final class zzag extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzag> CREATOR = new zzah();
    public final String name;
    public final String origin;
    public final zzad zzahu;
    public final long zzaig;

    public zzag(String str, zzad zzadVar, String str2, long j) {
        this.name = str;
        this.zzahu = zzadVar;
        this.origin = str2;
        this.zzaig = j;
    }

    public final String toString() {
        String str = this.origin;
        String str2 = this.name;
        String strValueOf = String.valueOf(this.zzahu);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + String.valueOf(strValueOf).length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(strValueOf);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ6 = b.j6(parcel);
        b.XL(parcel, 2, this.name, false);
        b.QX(parcel, 3, this.zzahu, i, false);
        b.XL(parcel, 4, this.origin, false);
        b.J0(parcel, 5, this.zzaig);
        b.DW(parcel, iJ6);
    }

    zzag(zzag zzagVar, long j) {
        p.u7(zzagVar);
        this.name = zzagVar.name;
        this.zzahu = zzagVar.zzahu;
        this.origin = zzagVar.origin;
        this.zzaig = j;
    }
}
