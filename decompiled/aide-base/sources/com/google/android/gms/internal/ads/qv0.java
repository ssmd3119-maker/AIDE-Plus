package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.aide.uidesigner.ProxyTextView;
import com.probelytics.api.UserTouchAction;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class qv0 implements Parcelable.Creator<zzwb> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzwb createFromParcel(Parcel parcel) {
        int iCn = com.google.android.gms.common.internal.safeparcel.a.cn(parcel);
        Bundle bundleZo = null;
        ArrayList<String> arrayListAM = null;
        String strQX = null;
        zzzs zzzsVar = null;
        Location location = null;
        String strQX2 = null;
        Bundle bundleZo2 = null;
        Bundle bundleZo3 = null;
        ArrayList<String> arrayListAM2 = null;
        String strQX3 = null;
        String strQX4 = null;
        zzvv zzvvVar = null;
        String strQX5 = null;
        long jNw = 0;
        int iP8 = 0;
        int iP82 = 0;
        boolean zLg = false;
        int iP83 = 0;
        boolean zLg2 = false;
        boolean zLg3 = false;
        int iP84 = 0;
        while (parcel.dataPosition() < iCn) {
            int iBT = com.google.android.gms.common.internal.safeparcel.a.BT(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a8(iBT)) {
                case 1:
                    iP8 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
                    break;
                case 2:
                    jNw = com.google.android.gms.common.internal.safeparcel.a.nw(parcel, iBT);
                    break;
                case 3:
                    bundleZo = com.google.android.gms.common.internal.safeparcel.a.Zo(parcel, iBT);
                    break;
                case 4:
                    iP82 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
                    break;
                case 5:
                    arrayListAM = com.google.android.gms.common.internal.safeparcel.a.aM(parcel, iBT);
                    break;
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                    zLg = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case UserTouchAction.CLICK_KIND /* 7 */:
                    iP83 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
                    break;
                case 8:
                    zLg2 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case 9:
                    strQX = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 10:
                    zzzsVar = (zzzs) com.google.android.gms.common.internal.safeparcel.a.Ws(parcel, iBT, zzzs.CREATOR);
                    break;
                case 11:
                    location = (Location) com.google.android.gms.common.internal.safeparcel.a.Ws(parcel, iBT, Location.CREATOR);
                    break;
                case 12:
                    strQX2 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 13:
                    bundleZo2 = com.google.android.gms.common.internal.safeparcel.a.Zo(parcel, iBT);
                    break;
                case 14:
                    bundleZo3 = com.google.android.gms.common.internal.safeparcel.a.Zo(parcel, iBT);
                    break;
                case 15:
                    arrayListAM2 = com.google.android.gms.common.internal.safeparcel.a.aM(parcel, iBT);
                    break;
                case 16:
                    strQX3 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                    strQX4 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
                    zLg3 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case 19:
                    zzvvVar = (zzvv) com.google.android.gms.common.internal.safeparcel.a.Ws(parcel, iBT, zzvv.CREATOR);
                    break;
                case ProxyTextView.INPUTTYPE_date /* 20 */:
                    iP84 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
                    break;
                case 21:
                    strQX5 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.ro(parcel, iBT);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.U2(parcel, iCn);
        return new zzwb(iP8, jNw, bundleZo, iP82, arrayListAM, zLg, iP83, zLg2, strQX, zzzsVar, location, strQX2, bundleZo2, bundleZo3, arrayListAM2, strQX3, strQX4, zLg3, zzvvVar, iP84, strQX5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzwb[] newArray(int i) {
        return new zzwb[i];
    }
}
