package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class zzki implements Parcelable {
    public static final Parcelable.Creator<zzki> CREATOR = new mj0();
    private final zza[] WB;

    public interface zza extends Parcelable {
    }

    public zzki(List<? extends zza> list) {
        zza[] zzaVarArr = new zza[list.size()];
        this.WB = zzaVarArr;
        list.toArray(zzaVarArr);
    }

    public final zza DW(int i) {
        return this.WB[i];
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzki.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.WB, ((zzki) obj).WB);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.WB);
    }

    public final int j6() {
        return this.WB.length;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.WB.length);
        for (zza zzaVar : this.WB) {
            parcel.writeParcelable(zzaVar, 0);
        }
    }

    zzki(Parcel parcel) {
        this.WB = new zza[parcel.readInt()];
        int i = 0;
        while (true) {
            zza[] zzaVarArr = this.WB;
            if (i >= zzaVarArr.length) {
                return;
            }
            zzaVarArr[i] = (zza) parcel.readParcelable(zza.class.getClassLoader());
            i++;
        }
    }
}
