package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public final class zaa extends AbstractSafeParcelable implements j {
    public static final Parcelable.Creator<zaa> CREATOR = new b();
    private final int WB;
    private Intent jw;
    private int mb;

    zaa(int i, int i2, Intent intent) {
        this.WB = i;
        this.mb = i2;
        this.jw = intent;
    }

    @Override // com.google.android.gms.common.api.j
    public final Status Hw() {
        return this.mb == 0 ? Status.qp : Status.zh;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 1, this.WB);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 2, this.mb);
        com.google.android.gms.common.internal.safeparcel.b.QX(parcel, 3, this.jw, i, false);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }

    public zaa() {
        this(0, null);
    }

    private zaa(int i, Intent intent) {
        this(2, 0, null);
    }
}
