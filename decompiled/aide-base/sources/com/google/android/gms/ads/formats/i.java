package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class i implements Parcelable.Creator<PublisherAdViewOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PublisherAdViewOptions createFromParcel(Parcel parcel) {
        int iCn = com.google.android.gms.common.internal.safeparcel.a.cn(parcel);
        boolean zLg = false;
        IBinder iBinderVy = null;
        while (parcel.dataPosition() < iCn) {
            int iBT = com.google.android.gms.common.internal.safeparcel.a.BT(parcel);
            int iA8 = com.google.android.gms.common.internal.safeparcel.a.a8(iBT);
            if (iA8 == 1) {
                zLg = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
            } else if (iA8 != 2) {
                com.google.android.gms.common.internal.safeparcel.a.ro(parcel, iBT);
            } else {
                iBinderVy = com.google.android.gms.common.internal.safeparcel.a.vy(parcel, iBT);
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.U2(parcel, iCn);
        return new PublisherAdViewOptions(zLg, iBinderVy);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PublisherAdViewOptions[] newArray(int i) {
        return new PublisherAdViewOptions[i];
    }
}
