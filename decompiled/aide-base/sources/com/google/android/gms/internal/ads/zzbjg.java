package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public final class zzbjg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbjg> CREATOR = new zx();
    private final int WB;
    private final String jw;
    private final String mb;

    zzbjg(int i, String str, String str2) {
        this.WB = i;
        this.mb = str;
        this.jw = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 1, this.WB);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 2, this.mb, false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 3, this.jw, false);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }

    public zzbjg(String str, String str2) {
        this(1, str, str2);
    }
}
