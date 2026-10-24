package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new c();
    private final int WB;
    private Bundle jw;
    private int mb;

    GoogleSignInOptionsExtensionParcelable(int i, int i2, Bundle bundle) {
        this.WB = i;
        this.mb = i2;
        this.jw = bundle;
    }

    public int gn() {
        return this.mb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 1, this.WB);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 2, gn());
        com.google.android.gms.common.internal.safeparcel.b.Hw(parcel, 3, this.jw, false);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }
}
