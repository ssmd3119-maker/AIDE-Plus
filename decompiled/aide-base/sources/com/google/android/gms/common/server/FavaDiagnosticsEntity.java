package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;

/* loaded from: classes.dex */
public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<FavaDiagnosticsEntity> CREATOR = new a();
    private final int WB;
    private final int jw;
    private final String mb;

    public FavaDiagnosticsEntity(int i, String str, int i2) {
        this.WB = i;
        this.mb = str;
        this.jw = i2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iJ6 = b.j6(parcel);
        b.tp(parcel, 1, this.WB);
        b.XL(parcel, 2, this.mb, false);
        b.tp(parcel, 3, this.jw);
        b.DW(parcel, iJ6);
    }
}
