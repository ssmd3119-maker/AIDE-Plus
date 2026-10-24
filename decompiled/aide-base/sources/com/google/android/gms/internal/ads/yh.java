package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.probelytics.api.UserTouchAction;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class yh implements Parcelable.Creator<zzatb> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzatb createFromParcel(Parcel parcel) {
        int iCn = com.google.android.gms.common.internal.safeparcel.a.cn(parcel);
        Bundle bundleZo = null;
        zzbbi zzbbiVar = null;
        ApplicationInfo applicationInfo = null;
        String strQX = null;
        ArrayList<String> arrayListAM = null;
        PackageInfo packageInfo = null;
        String strQX2 = null;
        String strQX3 = null;
        boolean zLg = false;
        while (parcel.dataPosition() < iCn) {
            int iBT = com.google.android.gms.common.internal.safeparcel.a.BT(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a8(iBT)) {
                case 1:
                    bundleZo = com.google.android.gms.common.internal.safeparcel.a.Zo(parcel, iBT);
                    break;
                case 2:
                    zzbbiVar = (zzbbi) com.google.android.gms.common.internal.safeparcel.a.Ws(parcel, iBT, zzbbi.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) com.google.android.gms.common.internal.safeparcel.a.Ws(parcel, iBT, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    strQX = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 5:
                    arrayListAM = com.google.android.gms.common.internal.safeparcel.a.aM(parcel, iBT);
                    break;
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                    packageInfo = (PackageInfo) com.google.android.gms.common.internal.safeparcel.a.Ws(parcel, iBT, PackageInfo.CREATOR);
                    break;
                case UserTouchAction.CLICK_KIND /* 7 */:
                    strQX2 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 8:
                    zLg = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case 9:
                    strQX3 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.ro(parcel, iBT);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.U2(parcel, iCn);
        return new zzatb(bundleZo, zzbbiVar, applicationInfo, strQX, arrayListAM, packageInfo, strQX2, zLg, strQX3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzatb[] newArray(int i) {
        return new zzatb[i];
    }
}
