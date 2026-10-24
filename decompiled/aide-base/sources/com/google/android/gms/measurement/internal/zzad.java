package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zzad extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzad> CREATOR = new zzaf();
    private final Bundle zzaid;

    zzad(Bundle bundle) {
        this.zzaid = bundle;
    }

    final Object get(String str) {
        return this.zzaid.get(str);
    }

    final Long getLong(String str) {
        return Long.valueOf(this.zzaid.getLong(str));
    }

    final String getString(String str) {
        return this.zzaid.getString(str);
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new zzae(this);
    }

    public final int size() {
        return this.zzaid.size();
    }

    public final String toString() {
        return this.zzaid.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ6 = b.j6(parcel);
        b.Hw(parcel, 2, zziy(), false);
        b.DW(parcel, iJ6);
    }

    final Double zzbr(String str) {
        return Double.valueOf(this.zzaid.getDouble(str));
    }

    public final Bundle zziy() {
        return new Bundle(this.zzaid);
    }
}
