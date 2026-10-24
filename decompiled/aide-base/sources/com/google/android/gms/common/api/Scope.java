package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new m();
    private final int WB;
    private final String mb;

    Scope(int i, String str) {
        p.Zo(str, "scopeUri must not be null or empty");
        this.WB = i;
        this.mb = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.mb.equals(((Scope) obj).mb);
        }
        return false;
    }

    public final String gn() {
        return this.mb;
    }

    public final int hashCode() {
        return this.mb.hashCode();
    }

    public final String toString() {
        return this.mb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 1, this.WB);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 2, gn(), false);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }

    public Scope(String str) {
        this(1, str);
    }
}
