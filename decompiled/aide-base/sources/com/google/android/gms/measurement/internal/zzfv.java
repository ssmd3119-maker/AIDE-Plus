package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;

/* loaded from: classes.dex */
public final class zzfv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfv> CREATOR = new zzfw();
    public final String name;
    public final String origin;
    private final int versionCode;
    public final String zzaml;
    public final long zzauk;
    public final Long zzaul;
    private final Float zzaum;
    public final Double zzaun;

    zzfv(zzfx zzfxVar) {
        this(zzfxVar.name, zzfxVar.zzauk, zzfxVar.value, zzfxVar.origin);
    }

    public final Object getValue() {
        Long l = this.zzaul;
        if (l != null) {
            return l;
        }
        Double d = this.zzaun;
        if (d != null) {
            return d;
        }
        String str = this.zzaml;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ6 = b.j6(parcel);
        b.tp(parcel, 1, this.versionCode);
        b.XL(parcel, 2, this.name, false);
        b.J0(parcel, 3, this.zzauk);
        b.J8(parcel, 4, this.zzaul, false);
        b.gn(parcel, 5, null, false);
        b.XL(parcel, 6, this.zzaml, false);
        b.XL(parcel, 7, this.origin, false);
        b.Zo(parcel, 8, this.zzaun, false);
        b.DW(parcel, iJ6);
    }

    zzfv(String str, long j, Object obj, String str2) {
        p.v5(str);
        this.versionCode = 2;
        this.name = str;
        this.zzauk = j;
        this.origin = str2;
        if (obj == null) {
            this.zzaul = null;
            this.zzaum = null;
            this.zzaun = null;
            this.zzaml = null;
            return;
        }
        if (obj instanceof Long) {
            this.zzaul = (Long) obj;
            this.zzaum = null;
            this.zzaun = null;
            this.zzaml = null;
            return;
        }
        if (obj instanceof String) {
            this.zzaul = null;
            this.zzaum = null;
            this.zzaun = null;
            this.zzaml = (String) obj;
            return;
        }
        if (!(obj instanceof Double)) {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
        this.zzaul = null;
        this.zzaum = null;
        this.zzaun = (Double) obj;
        this.zzaml = null;
    }

    zzfv(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.versionCode = i;
        this.name = str;
        this.zzauk = j;
        this.zzaul = l;
        this.zzaum = null;
        if (i == 1) {
            this.zzaun = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.zzaun = d;
        }
        this.zzaml = str2;
        this.origin = str3;
    }
}
