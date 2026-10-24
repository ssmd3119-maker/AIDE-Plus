package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;

/* loaded from: classes.dex */
public final class zzaf implements Parcelable.Creator<zzad> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzad createFromParcel(Parcel parcel) {
        int iCn = a.cn(parcel);
        Bundle bundleZo = null;
        while (parcel.dataPosition() < iCn) {
            int iBT = a.BT(parcel);
            if (a.a8(iBT) != 2) {
                a.ro(parcel, iBT);
            } else {
                bundleZo = a.Zo(parcel, iBT);
            }
        }
        a.U2(parcel, iCn);
        return new zzad(bundleZo);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzad[] newArray(int i) {
        return new zzad[i];
    }
}
