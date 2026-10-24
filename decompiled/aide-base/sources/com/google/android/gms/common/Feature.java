package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes.dex */
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new m();
    private final String WB;
    private final long jw;

    @Deprecated
    private final int mb;

    public Feature(String str, int i, long j) {
        this.WB = str;
        this.mb = i;
        this.jw = j;
    }

    public long EQ() {
        long j = this.jw;
        return j == -1 ? this.mb : j;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (((gn() != null && gn().equals(feature.gn())) || (gn() == null && feature.gn() == null)) && EQ() == feature.EQ()) {
                return true;
            }
        }
        return false;
    }

    public String gn() {
        return this.WB;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.o.DW(gn(), Long.valueOf(EQ()));
    }

    public String toString() {
        o.a aVarFH = com.google.android.gms.common.internal.o.FH(this);
        aVarFH.j6(AppMeasurementSdk.ConditionalUserProperty.NAME, gn());
        aVarFH.j6("version", Long.valueOf(EQ()));
        return aVarFH.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 1, gn(), false);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 2, this.mb);
        com.google.android.gms.common.internal.safeparcel.b.J0(parcel, 3, EQ());
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }
}
