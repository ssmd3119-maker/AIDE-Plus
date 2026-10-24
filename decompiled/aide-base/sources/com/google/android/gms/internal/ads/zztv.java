package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.InputStream;
import javax.annotation.concurrent.GuardedBy;

@jg
/* loaded from: classes.dex */
public final class zztv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zztv> CREATOR = new zs0();

    @GuardedBy("this")
    private ParcelFileDescriptor WB;

    public zztv() {
        this(null);
    }

    private final synchronized ParcelFileDescriptor J8() {
        return this.WB;
    }

    public final synchronized InputStream EQ() {
        if (this.WB == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.WB);
        this.WB = null;
        return autoCloseInputStream;
    }

    public final synchronized boolean gn() {
        return this.WB != null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.QX(parcel, 2, J8(), i, false);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }

    public zztv(ParcelFileDescriptor parcelFileDescriptor) {
        this.WB = parcelFileDescriptor;
    }
}
