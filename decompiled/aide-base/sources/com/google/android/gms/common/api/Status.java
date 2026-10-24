package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public final class Status extends AbstractSafeParcelable implements j, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR;
    public static final Status k2;
    public static final Status qp = new Status(0);
    public static final Status zh;
    private final int WB;
    private final PendingIntent fY;
    private final String jw;
    private final int mb;

    static {
        new Status(14);
        new Status(8);
        k2 = new Status(15);
        zh = new Status(16);
        new Status(17);
        new Status(18);
        CREATOR = new n();
    }

    Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.WB = i;
        this.mb = i2;
        this.jw = str;
        this.fY = pendingIntent;
    }

    public final String EQ() {
        return this.jw;
    }

    @Override // com.google.android.gms.common.api.j
    public final Status Hw() {
        return this;
    }

    public final boolean J8() {
        return this.mb <= 0;
    }

    public final String Ws() {
        String str = this.jw;
        return str != null ? str : d.j6(this.mb);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.WB == status.WB && this.mb == status.mb && o.j6(this.jw, status.jw) && o.j6(this.fY, status.fY);
    }

    public final int gn() {
        return this.mb;
    }

    public final int hashCode() {
        return o.DW(Integer.valueOf(this.WB), Integer.valueOf(this.mb), this.jw, this.fY);
    }

    public final String toString() {
        o.a aVarFH = o.FH(this);
        aVarFH.j6("statusCode", Ws());
        aVarFH.j6("resolution", this.fY);
        return aVarFH.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 1, gn());
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 2, EQ(), false);
        com.google.android.gms.common.internal.safeparcel.b.QX(parcel, 3, this.fY, i, false);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 1000, this.WB);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }

    public Status(int i) {
        this(i, null);
    }

    public Status(int i, String str) {
        this(1, i, str, null);
    }
}
