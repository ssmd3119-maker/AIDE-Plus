package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* loaded from: classes.dex */
public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaa> CREATOR = new a();
    private final int WB;
    private final StringToIntConverter mb;

    zaa(int i, StringToIntConverter stringToIntConverter) {
        this.WB = i;
        this.mb = stringToIntConverter;
    }

    public static zaa gn(FastJsonResponse.a<?, ?> aVar) {
        if (aVar instanceof StringToIntConverter) {
            return new zaa((StringToIntConverter) aVar);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    public final FastJsonResponse.a<?, ?> EQ() {
        StringToIntConverter stringToIntConverter = this.mb;
        if (stringToIntConverter != null) {
            return stringToIntConverter;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 1, this.WB);
        com.google.android.gms.common.internal.safeparcel.b.QX(parcel, 2, this.mb, i, false);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }

    private zaa(StringToIntConverter stringToIntConverter) {
        this.WB = 1;
        this.mb = stringToIntConverter;
    }
}
