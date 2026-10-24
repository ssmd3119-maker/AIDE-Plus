package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public class ResolveAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ResolveAccountRequest> CREATOR = new y();
    private final int WB;
    private final GoogleSignInAccount fY;
    private final int jw;
    private final Account mb;

    ResolveAccountRequest(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.WB = i;
        this.mb = account;
        this.jw = i2;
        this.fY = googleSignInAccount;
    }

    public GoogleSignInAccount EQ() {
        return this.fY;
    }

    public int gn() {
        return this.jw;
    }

    public Account n5() {
        return this.mb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 1, this.WB);
        com.google.android.gms.common.internal.safeparcel.b.QX(parcel, 2, n5(), i, false);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 3, gn());
        com.google.android.gms.common.internal.safeparcel.b.QX(parcel, 4, EQ(), i, false);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }

    public ResolveAccountRequest(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }
}
