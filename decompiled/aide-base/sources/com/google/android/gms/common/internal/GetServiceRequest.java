package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.j;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new d0();
    Account AL;
    private final int WB;
    private boolean cT;
    String fY;
    Feature[] hK;
    private int jw;
    Scope[] k2;
    private final int mb;
    IBinder qp;
    Feature[] w9;
    Bundle zh;

    public GetServiceRequest(int i) {
        this.WB = 4;
        this.jw = com.google.android.gms.common.c.j6;
        this.mb = i;
        this.cT = true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 1, this.WB);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 2, this.mb);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 3, this.jw);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 4, this.fY, false);
        com.google.android.gms.common.internal.safeparcel.b.u7(parcel, 5, this.qp, false);
        com.google.android.gms.common.internal.safeparcel.b.Mr(parcel, 6, this.k2, i, false);
        com.google.android.gms.common.internal.safeparcel.b.Hw(parcel, 7, this.zh, false);
        com.google.android.gms.common.internal.safeparcel.b.QX(parcel, 8, this.AL, i, false);
        com.google.android.gms.common.internal.safeparcel.b.Mr(parcel, 10, this.w9, i, false);
        com.google.android.gms.common.internal.safeparcel.b.Mr(parcel, 11, this.hK, i, false);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 12, this.cT);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }

    GetServiceRequest(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z) {
        this.WB = i;
        this.mb = i2;
        this.jw = i3;
        if ("com.google.android.gms".equals(str)) {
            this.fY = "com.google.android.gms";
        } else {
            this.fY = str;
        }
        if (i < 2) {
            this.AL = iBinder != null ? a.g3(j.a.dx(iBinder)) : null;
        } else {
            this.qp = iBinder;
            this.AL = account;
        }
        this.k2 = scopeArr;
        this.zh = bundle;
        this.w9 = featureArr;
        this.hK = featureArr2;
        this.cT = z;
    }
}
