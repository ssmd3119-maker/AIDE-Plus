package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public class AuthAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthAccountRequest> CREATOR = new s();
    private final int WB;
    private Integer fY;
    private final Scope[] jw;
    private Account k2;

    @Deprecated
    private final IBinder mb;
    private Integer qp;

    AuthAccountRequest(int i, IBinder iBinder, Scope[] scopeArr, Integer num, Integer num2, Account account) {
        this.WB = i;
        this.mb = iBinder;
        this.jw = scopeArr;
        this.fY = num;
        this.qp = num2;
        this.k2 = account;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 1, this.WB);
        com.google.android.gms.common.internal.safeparcel.b.u7(parcel, 2, this.mb, false);
        com.google.android.gms.common.internal.safeparcel.b.Mr(parcel, 3, this.jw, i, false);
        com.google.android.gms.common.internal.safeparcel.b.we(parcel, 4, this.fY, false);
        com.google.android.gms.common.internal.safeparcel.b.we(parcel, 5, this.qp, false);
        com.google.android.gms.common.internal.safeparcel.b.QX(parcel, 6, this.k2, i, false);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }
}
