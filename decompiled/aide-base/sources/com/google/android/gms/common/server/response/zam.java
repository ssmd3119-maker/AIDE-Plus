package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* loaded from: classes.dex */
public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new b();
    private final int WB;
    final FastJsonResponse.Field<?, ?> jw;
    final String mb;

    zam(int i, String str, FastJsonResponse.Field<?, ?> field) {
        this.WB = i;
        this.mb = str;
        this.jw = field;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 1, this.WB);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 2, this.mb, false);
        com.google.android.gms.common.internal.safeparcel.b.QX(parcel, 3, this.jw, i, false);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }

    zam(String str, FastJsonResponse.Field<?, ?> field) {
        this.WB = 1;
        this.mb = str;
        this.jw = field;
    }
}
