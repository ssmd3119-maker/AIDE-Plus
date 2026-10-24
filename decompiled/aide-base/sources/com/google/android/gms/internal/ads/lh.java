package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.aide.uidesigner.ProxyTextView;
import com.probelytics.api.UserTouchAction;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class lh implements Parcelable.Creator<zzasm> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzasm createFromParcel(Parcel parcel) {
        int iCn = com.google.android.gms.common.internal.safeparcel.a.cn(parcel);
        long jNw = 0;
        long jNw2 = 0;
        long jNw3 = 0;
        long jNw4 = 0;
        String strQX = null;
        String strQX2 = null;
        ArrayList<String> arrayListAM = null;
        ArrayList<String> arrayListAM2 = null;
        ArrayList<String> arrayListAM3 = null;
        String strQX3 = null;
        String strQX4 = null;
        String strQX5 = null;
        String strQX6 = null;
        zzasy zzasyVar = null;
        String strQX7 = null;
        String strQX8 = null;
        zzawd zzawdVar = null;
        ArrayList<String> arrayListAM4 = null;
        ArrayList<String> arrayListAM5 = null;
        zzaso zzasoVar = null;
        String strQX9 = null;
        ArrayList<String> arrayListAM6 = null;
        String strQX10 = null;
        zzawo zzawoVar = null;
        String strQX11 = null;
        Bundle bundleZo = null;
        ArrayList<String> arrayListAM7 = null;
        String strQX12 = null;
        String strQX13 = null;
        int iP8 = 0;
        int iP82 = 0;
        boolean zLg = false;
        int iP83 = 0;
        boolean zLg2 = false;
        boolean zLg3 = false;
        boolean zLg4 = false;
        boolean zLg5 = false;
        boolean zLg6 = false;
        boolean zLg7 = false;
        boolean zLg8 = false;
        boolean zLg9 = false;
        boolean zLg10 = false;
        boolean zLg11 = false;
        boolean zLg12 = false;
        boolean zLg13 = false;
        boolean zLg14 = false;
        boolean zLg15 = false;
        int iP84 = 0;
        boolean zLg16 = false;
        boolean zLg17 = false;
        boolean zLg18 = false;
        while (parcel.dataPosition() < iCn) {
            int iBT = com.google.android.gms.common.internal.safeparcel.a.BT(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a8(iBT)) {
                case 1:
                    iP8 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
                    break;
                case 2:
                    strQX = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 3:
                    strQX2 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 4:
                    arrayListAM = com.google.android.gms.common.internal.safeparcel.a.aM(parcel, iBT);
                    break;
                case 5:
                    iP82 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
                    break;
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                    arrayListAM2 = com.google.android.gms.common.internal.safeparcel.a.aM(parcel, iBT);
                    break;
                case UserTouchAction.CLICK_KIND /* 7 */:
                    jNw = com.google.android.gms.common.internal.safeparcel.a.nw(parcel, iBT);
                    break;
                case 8:
                    zLg = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case 9:
                    jNw2 = com.google.android.gms.common.internal.safeparcel.a.nw(parcel, iBT);
                    break;
                case 10:
                    arrayListAM3 = com.google.android.gms.common.internal.safeparcel.a.aM(parcel, iBT);
                    break;
                case 11:
                    jNw3 = com.google.android.gms.common.internal.safeparcel.a.nw(parcel, iBT);
                    break;
                case 12:
                    iP83 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
                    break;
                case 13:
                    strQX3 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 14:
                    jNw4 = com.google.android.gms.common.internal.safeparcel.a.nw(parcel, iBT);
                    break;
                case 15:
                    strQX4 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 16:
                case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                case ProxyTextView.INPUTTYPE_date /* 20 */:
                case 27:
                case 41:
                default:
                    com.google.android.gms.common.internal.safeparcel.a.ro(parcel, iBT);
                    break;
                case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
                    zLg2 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case 19:
                    strQX5 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 21:
                    strQX6 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 22:
                    zLg3 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case 23:
                    zLg4 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case 24:
                    zLg5 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case 25:
                    zLg6 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case 26:
                    zLg7 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case 28:
                    zzasyVar = (zzasy) com.google.android.gms.common.internal.safeparcel.a.Ws(parcel, iBT, zzasy.CREATOR);
                    break;
                case 29:
                    strQX7 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 30:
                    strQX8 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 31:
                    zLg8 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case 32:
                    zLg9 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case ProxyTextView.INPUTTYPE_textEmailAddress /* 33 */:
                    zzawdVar = (zzawd) com.google.android.gms.common.internal.safeparcel.a.Ws(parcel, iBT, zzawd.CREATOR);
                    break;
                case 34:
                    arrayListAM4 = com.google.android.gms.common.internal.safeparcel.a.aM(parcel, iBT);
                    break;
                case 35:
                    arrayListAM5 = com.google.android.gms.common.internal.safeparcel.a.aM(parcel, iBT);
                    break;
                case ProxyTextView.INPUTTYPE_time /* 36 */:
                    zLg10 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case 37:
                    zzasoVar = (zzaso) com.google.android.gms.common.internal.safeparcel.a.Ws(parcel, iBT, zzaso.CREATOR);
                    break;
                case 38:
                    zLg11 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case 39:
                    strQX9 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 40:
                    arrayListAM6 = com.google.android.gms.common.internal.safeparcel.a.aM(parcel, iBT);
                    break;
                case 42:
                    zLg12 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case 43:
                    strQX10 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 44:
                    zzawoVar = (zzawo) com.google.android.gms.common.internal.safeparcel.a.Ws(parcel, iBT, zzawo.CREATOR);
                    break;
                case 45:
                    strQX11 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 46:
                    zLg13 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case 47:
                    zLg14 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case 48:
                    bundleZo = com.google.android.gms.common.internal.safeparcel.a.Zo(parcel, iBT);
                    break;
                case ProxyTextView.INPUTTYPE_textEmailSubject /* 49 */:
                    zLg15 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case 50:
                    iP84 = com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT);
                    break;
                case 51:
                    zLg16 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case 52:
                    arrayListAM7 = com.google.android.gms.common.internal.safeparcel.a.aM(parcel, iBT);
                    break;
                case 53:
                    zLg17 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
                case 54:
                    strQX12 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 55:
                    strQX13 = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                    break;
                case 56:
                    zLg18 = com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.U2(parcel, iCn);
        return new zzasm(iP8, strQX, strQX2, arrayListAM, iP82, arrayListAM2, jNw, zLg, jNw2, arrayListAM3, jNw3, iP83, strQX3, jNw4, strQX4, zLg2, strQX5, strQX6, zLg3, zLg4, zLg5, zLg6, zLg7, zzasyVar, strQX7, strQX8, zLg8, zLg9, zzawdVar, arrayListAM4, arrayListAM5, zLg10, zzasoVar, zLg11, strQX9, arrayListAM6, zLg12, strQX10, zzawoVar, strQX11, zLg13, zLg14, bundleZo, zLg15, iP84, zLg16, arrayListAM7, zLg17, strQX12, strQX13, zLg18);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzasm[] newArray(int i) {
        return new zzasm[i];
    }
}
