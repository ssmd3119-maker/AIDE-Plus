package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;

/* loaded from: classes.dex */
public final class c0 implements Parcelable.Creator<zzb> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzb createFromParcel(Parcel parcel) {
        int iCn = com.google.android.gms.common.internal.safeparcel.a.cn(parcel);
        Bundle bundleZo = null;
        Feature[] featureArr = null;
        while (parcel.dataPosition() < iCn) {
            int iBT = com.google.android.gms.common.internal.safeparcel.a.BT(parcel);
            int iA8 = com.google.android.gms.common.internal.safeparcel.a.a8(iBT);
            if (iA8 == 1) {
                bundleZo = com.google.android.gms.common.internal.safeparcel.a.Zo(parcel, iBT);
            } else if (iA8 != 2) {
                com.google.android.gms.common.internal.safeparcel.a.ro(parcel, iBT);
            } else {
                featureArr = (Feature[]) com.google.android.gms.common.internal.safeparcel.a.j3(parcel, iBT, Feature.CREATOR);
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.U2(parcel, iCn);
        return new zzb(bundleZo, featureArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzb[] newArray(int i) {
        return new zzb[i];
    }
}
