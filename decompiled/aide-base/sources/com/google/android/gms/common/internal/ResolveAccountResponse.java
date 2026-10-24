package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.j;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public class ResolveAccountResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ResolveAccountResponse> CREATOR = new z();
    private final int WB;
    private boolean fY;
    private ConnectionResult jw;
    private IBinder mb;
    private boolean qp;

    ResolveAccountResponse(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.WB = i;
        this.mb = iBinder;
        this.jw = connectionResult;
        this.fY = z;
        this.qp = z2;
    }

    public ConnectionResult EQ() {
        return this.jw;
    }

    public boolean J8() {
        return this.fY;
    }

    public boolean Ws() {
        return this.qp;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolveAccountResponse)) {
            return false;
        }
        ResolveAccountResponse resolveAccountResponse = (ResolveAccountResponse) obj;
        return this.jw.equals(resolveAccountResponse.jw) && gn().equals(resolveAccountResponse.gn());
    }

    public j gn() {
        return j.a.dx(this.mb);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 1, this.WB);
        com.google.android.gms.common.internal.safeparcel.b.u7(parcel, 2, this.mb, false);
        com.google.android.gms.common.internal.safeparcel.b.QX(parcel, 3, EQ(), i, false);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 4, J8());
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 5, Ws());
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }
}
