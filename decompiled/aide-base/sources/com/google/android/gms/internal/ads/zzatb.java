package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzatb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzatb> CREATOR = new yh();
    private final boolean AL;
    private final Bundle WB;
    private final String fY;
    private final ApplicationInfo jw;

    @Nullable
    private final PackageInfo k2;
    private final zzbbi mb;
    private final List<String> qp;
    private final String w9;
    private final String zh;

    public zzatb(Bundle bundle, zzbbi zzbbiVar, ApplicationInfo applicationInfo, String str, List<String> list, @Nullable PackageInfo packageInfo, String str2, boolean z, String str3) {
        this.WB = bundle;
        this.mb = zzbbiVar;
        this.fY = str;
        this.jw = applicationInfo;
        this.qp = list;
        this.k2 = packageInfo;
        this.zh = str2;
        this.AL = z;
        this.w9 = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.Hw(parcel, 1, this.WB, false);
        com.google.android.gms.common.internal.safeparcel.b.QX(parcel, 2, this.mb, i, false);
        com.google.android.gms.common.internal.safeparcel.b.QX(parcel, 3, this.jw, i, false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 4, this.fY, false);
        com.google.android.gms.common.internal.safeparcel.b.j3(parcel, 5, this.qp, false);
        com.google.android.gms.common.internal.safeparcel.b.QX(parcel, 6, this.k2, i, false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 7, this.zh, false);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 8, this.AL);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 9, this.w9, false);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }
}
