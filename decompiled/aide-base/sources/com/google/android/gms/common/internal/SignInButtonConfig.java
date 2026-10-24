package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public class SignInButtonConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInButtonConfig> CREATOR = new a0();
    private final int WB;

    @Deprecated
    private final Scope[] fY;
    private final int jw;
    private final int mb;

    SignInButtonConfig(int i, int i2, int i3, Scope[] scopeArr) {
        this.WB = i;
        this.mb = i2;
        this.jw = i3;
        this.fY = scopeArr;
    }

    public int EQ() {
        return this.jw;
    }

    @Deprecated
    public Scope[] J8() {
        return this.fY;
    }

    public int gn() {
        return this.mb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 1, this.WB);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 2, gn());
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 3, EQ());
        com.google.android.gms.common.internal.safeparcel.b.Mr(parcel, 4, J8(), i, false);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }

    public SignInButtonConfig(int i, int i2, Scope[] scopeArr) {
        this(1, i, i2, null);
    }
}
