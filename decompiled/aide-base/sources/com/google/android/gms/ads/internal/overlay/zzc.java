package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.ads.jg;

@jg
/* loaded from: classes.dex */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new b();
    public final Intent AL;
    private final String WB;
    public final String fY;
    public final String jw;
    public final String k2;
    public final String mb;
    public final String qp;
    private final String zh;

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(str, str2, str3, str4, str5, str6, str7, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 2, this.WB, false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 3, this.mb, false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 4, this.jw, false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 5, this.fY, false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 6, this.qp, false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 7, this.k2, false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 8, this.zh, false);
        com.google.android.gms.common.internal.safeparcel.b.QX(parcel, 9, this.AL, i, false);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }

    public zzc(Intent intent) {
        this(null, null, null, null, null, null, null, intent);
    }

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent) {
        this.WB = str;
        this.mb = str2;
        this.jw = str3;
        this.fY = str4;
        this.qp = str5;
        this.k2 = str6;
        this.zh = str7;
        this.AL = intent;
    }
}
