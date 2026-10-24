package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.aide.uidesigner.ProxyTextView;
import com.probelytics.api.UserTouchAction;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class jh implements Parcelable.Creator<zzasi> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzasi createFromParcel(Parcel parcel) {
        int iCn = com.google.android.gms.common.internal.safeparcel.a.cn(parcel);
        long jNw = 0;
        long jNw2 = 0;
        Bundle bundleZo = null;
        zzwb zzwbVar = null;
        zzwf zzwfVar = null;
        String strQX = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String strQX2 = null;
        String strQX3 = null;
        String strQX4 = null;
        zzbbi zzbbiVar = null;
        Bundle bundleZo2 = null;
        ArrayList<String> arrayListAM = null;
        Bundle bundleZo3 = null;
        String strQX5 = null;
        String strQX6 = null;
        ArrayList<String> arrayListAM2 = null;
        String strQX7 = null;
        zzacp zzacpVar = null;
        ArrayList<String> arrayListAM3 = null;
        String strQX8 = null;
        String strQX9 = null;
        String strQX10 = null;
        Bundle bundleZo4 = null;
        String strQX11 = null;
        zzyv zzyvVar = null;
        Bundle bundleZo5 = null;
        String strQX12 = null;
        String strQX13 = null;
        String strQX14 = null;
        ArrayList<Integer> arrayListEQ = null;
        String strQX15 = null;
        ArrayList<String> arrayListAM4 = null;
        ArrayList<String> arrayListAM5 = null;
        String strQX16 = null;
        zzafz zzafzVar = null;
        String strQX17 = null;
        Bundle bundleZo6 = null;
        int iP8 = 0;
        int iP82 = 0;
        boolean zLg = false;
        int iP83 = 0;
        int iP84 = 0;
        float fYS = 0.0f;
        float fYS2 = 0.0f;
        boolean zLg2 = false;
        int iP85 = 0;
        int iP86 = 0;
        boolean zLg3 = false;
        boolean zLg4 = false;
        boolean zLg5 = false;
        int iP87 = 0;
        boolean zLg6 = false;
        boolean zLg7 = false;
        int iP88 = 0;
        boolean zLg8 = false;
        boolean zLg9 = false;
        boolean zLg10 = false;
        while (parcel.dataPosition() < iCn) {
            int iBT = com.google.android.gms.common.internal.safeparcel.a.BT(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a8(iBT)) {
                case 1:
                    iP8 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
                    break;
                case 2:
                    bundleZo = com.google.android.gms.common.internal.safeparcel.a.Zo(parcel, iBT);
                    break;
                case 3:
                    zzwbVar = (zzwb) com.google.android.gms.common.internal.safeparcel.a.Ws(parcel, iBT, zzwb.CREATOR);
                    break;
                case 4:
                    zzwfVar = (zzwf) com.google.android.gms.common.internal.safeparcel.a.Ws(parcel, iBT, zzwf.CREATOR);
                    break;
                case 5:
                    strQX = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                    applicationInfo = (ApplicationInfo) com.google.android.gms.common.internal.safeparcel.a.Ws(parcel, iBT, ApplicationInfo.CREATOR);
                    break;
                case UserTouchAction.CLICK_KIND /* 7 */:
                    packageInfo = (PackageInfo) com.google.android.gms.common.internal.safeparcel.a.Ws(parcel, iBT, PackageInfo.CREATOR);
                    break;
                case 8:
                    strQX2 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 9:
                    strQX3 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 10:
                    strQX4 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 11:
                    zzbbiVar = (zzbbi) com.google.android.gms.common.internal.safeparcel.a.Ws(parcel, iBT, zzbbi.CREATOR);
                    break;
                case 12:
                    bundleZo2 = com.google.android.gms.common.internal.safeparcel.a.Zo(parcel, iBT);
                    break;
                case 13:
                    iP82 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
                    break;
                case 14:
                    arrayListAM = com.google.android.gms.common.internal.safeparcel.a.aM(parcel, iBT);
                    break;
                case 15:
                    bundleZo3 = com.google.android.gms.common.internal.safeparcel.a.Zo(parcel, iBT);
                    break;
                case 16:
                    zLg = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                case 22:
                case 23:
                case 24:
                case 32:
                case 62:
                default:
                    com.google.android.gms.common.internal.safeparcel.a.ro(parcel, iBT);
                    break;
                case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
                    iP83 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
                    break;
                case 19:
                    iP84 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
                    break;
                case ProxyTextView.INPUTTYPE_date /* 20 */:
                    fYS = com.google.android.gms.common.internal.safeparcel.a.yS(parcel, iBT);
                    break;
                case 21:
                    strQX5 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 25:
                    jNw = com.google.android.gms.common.internal.safeparcel.a.nw(parcel, iBT);
                    break;
                case 26:
                    strQX6 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 27:
                    arrayListAM2 = com.google.android.gms.common.internal.safeparcel.a.aM(parcel, iBT);
                    break;
                case 28:
                    strQX7 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 29:
                    zzacpVar = (zzacp) com.google.android.gms.common.internal.safeparcel.a.Ws(parcel, iBT, zzacp.CREATOR);
                    break;
                case 30:
                    arrayListAM3 = com.google.android.gms.common.internal.safeparcel.a.aM(parcel, iBT);
                    break;
                case 31:
                    jNw2 = com.google.android.gms.common.internal.safeparcel.a.nw(parcel, iBT);
                    break;
                case ProxyTextView.INPUTTYPE_textEmailAddress /* 33 */:
                    strQX8 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 34:
                    fYS2 = com.google.android.gms.common.internal.safeparcel.a.yS(parcel, iBT);
                    break;
                case 35:
                    iP85 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
                    break;
                case ProxyTextView.INPUTTYPE_time /* 36 */:
                    iP86 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
                    break;
                case 37:
                    zLg3 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case 38:
                    zLg4 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case 39:
                    strQX9 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 40:
                    zLg2 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case 41:
                    strQX10 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 42:
                    zLg5 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case 43:
                    iP87 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
                    break;
                case 44:
                    bundleZo4 = com.google.android.gms.common.internal.safeparcel.a.Zo(parcel, iBT);
                    break;
                case 45:
                    strQX11 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 46:
                    zzyvVar = (zzyv) com.google.android.gms.common.internal.safeparcel.a.Ws(parcel, iBT, zzyv.CREATOR);
                    break;
                case 47:
                    zLg6 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case 48:
                    bundleZo5 = com.google.android.gms.common.internal.safeparcel.a.Zo(parcel, iBT);
                    break;
                case ProxyTextView.INPUTTYPE_textEmailSubject /* 49 */:
                    strQX12 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 50:
                    strQX13 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 51:
                    strQX14 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 52:
                    zLg7 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case 53:
                    arrayListEQ = com.google.android.gms.common.internal.safeparcel.a.EQ(parcel, iBT);
                    break;
                case 54:
                    strQX15 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 55:
                    arrayListAM4 = com.google.android.gms.common.internal.safeparcel.a.aM(parcel, iBT);
                    break;
                case 56:
                    iP88 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
                    break;
                case 57:
                    zLg8 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case 58:
                    zLg9 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case 59:
                    zLg10 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case 60:
                    arrayListAM5 = com.google.android.gms.common.internal.safeparcel.a.aM(parcel, iBT);
                    break;
                case 61:
                    strQX16 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 63:
                    zzafzVar = (zzafz) com.google.android.gms.common.internal.safeparcel.a.Ws(parcel, iBT, zzafz.CREATOR);
                    break;
                case 64:
                    strQX17 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case ProxyTextView.INPUTTYPE_textShortMessage /* 65 */:
                    bundleZo6 = com.google.android.gms.common.internal.safeparcel.a.Zo(parcel, iBT);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.U2(parcel, iCn);
        return new zzasi(iP8, bundleZo, zzwbVar, zzwfVar, strQX, applicationInfo, packageInfo, strQX2, strQX3, strQX4, zzbbiVar, bundleZo2, iP82, arrayListAM, bundleZo3, zLg, iP83, iP84, fYS, strQX5, jNw, strQX6, arrayListAM2, strQX7, zzacpVar, arrayListAM3, jNw2, strQX8, fYS2, zLg2, iP85, iP86, zLg3, zLg4, strQX9, strQX10, zLg5, iP87, bundleZo4, strQX11, zzyvVar, zLg6, bundleZo5, strQX12, strQX13, strQX14, zLg7, arrayListEQ, strQX15, arrayListAM4, iP88, zLg8, zLg9, zLg10, arrayListAM5, strQX16, zzafzVar, strQX17, bundleZo6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzasi[] newArray(int i) {
        return new zzasi[i];
    }
}
