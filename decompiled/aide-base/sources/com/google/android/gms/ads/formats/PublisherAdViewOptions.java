package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.ads.cx0;
import com.google.android.gms.internal.ads.dx0;
import com.google.android.gms.internal.ads.jg;

@jg
/* loaded from: classes.dex */
public final class PublisherAdViewOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublisherAdViewOptions> CREATOR = new i();
    private final boolean WB;
    private final cx0 mb;

    PublisherAdViewOptions(boolean z, IBinder iBinder) {
        this.WB = z;
        this.mb = iBinder != null ? dx0.Mt(iBinder) : null;
    }

    public final cx0 EQ() {
        return this.mb;
    }

    public final boolean gn() {
        return this.WB;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 1, gn());
        cx0 cx0Var = this.mb;
        com.google.android.gms.common.internal.safeparcel.b.u7(parcel, 2, cx0Var == null ? null : cx0Var.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }
}
