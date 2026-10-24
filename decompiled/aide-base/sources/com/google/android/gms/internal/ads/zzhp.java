package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class zzhp implements Parcelable, Comparator<zza> {
    public static final Parcelable.Creator<zzhp> CREATOR = new ug0();
    private final zza[] WB;
    public final int jw;
    private int mb;

    public static final class zza implements Parcelable {
        public static final Parcelable.Creator<zza> CREATOR = new vg0();
        private int WB;
        private final byte[] fY;
        private final String jw;
        private final UUID mb;
        public final boolean qp;

        public zza(UUID uuid, String str, byte[] bArr) {
            this(uuid, str, bArr, false);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof zza)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            zza zzaVar = (zza) obj;
            return this.jw.equals(zzaVar.jw) && ip0.u7(this.mb, zzaVar.mb) && Arrays.equals(this.fY, zzaVar.fY);
        }

        public final int hashCode() {
            if (this.WB == 0) {
                this.WB = (((this.mb.hashCode() * 31) + this.jw.hashCode()) * 31) + Arrays.hashCode(this.fY);
            }
            return this.WB;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.mb.getMostSignificantBits());
            parcel.writeLong(this.mb.getLeastSignificantBits());
            parcel.writeString(this.jw);
            parcel.writeByteArray(this.fY);
            parcel.writeByte(this.qp ? (byte) 1 : (byte) 0);
        }

        public zza(UUID uuid, String str, byte[] bArr, boolean z) {
            ro0.FH(uuid);
            this.mb = uuid;
            ro0.FH(str);
            this.jw = str;
            ro0.FH(bArr);
            this.fY = bArr;
            this.qp = z;
        }

        zza(Parcel parcel) {
            this.mb = new UUID(parcel.readLong(), parcel.readLong());
            this.jw = parcel.readString();
            this.fY = parcel.createByteArray();
            this.qp = parcel.readByte() != 0;
        }
    }

    public zzhp(List<zza> list) {
        this(false, (zza[]) list.toArray(new zza[list.size()]));
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zza zzaVar, zza zzaVar2) {
        zza zzaVar3 = zzaVar;
        zza zzaVar4 = zzaVar2;
        return ie0.DW.equals(zzaVar3.mb) ? ie0.DW.equals(zzaVar4.mb) ? 0 : 1 : zzaVar3.mb.compareTo(zzaVar4.mb);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzhp.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.WB, ((zzhp) obj).WB);
    }

    public final int hashCode() {
        if (this.mb == 0) {
            this.mb = Arrays.hashCode(this.WB);
        }
        return this.mb;
    }

    public final zza j6(int i) {
        return this.WB[i];
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.WB, 0);
    }

    public zzhp(zza... zzaVarArr) {
        this(true, zzaVarArr);
    }

    private zzhp(boolean z, zza... zzaVarArr) {
        zzaVarArr = z ? (zza[]) zzaVarArr.clone() : zzaVarArr;
        Arrays.sort(zzaVarArr, this);
        for (int i = 1; i < zzaVarArr.length; i++) {
            if (zzaVarArr[i - 1].mb.equals(zzaVarArr[i].mb)) {
                String strValueOf = String.valueOf(zzaVarArr[i].mb);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 25);
                sb.append("Duplicate data for uuid: ");
                sb.append(strValueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        this.WB = zzaVarArr;
        this.jw = zzaVarArr.length;
    }

    zzhp(Parcel parcel) {
        zza[] zzaVarArr = (zza[]) parcel.createTypedArray(zza.CREATOR);
        this.WB = zzaVarArr;
        this.jw = zzaVarArr.length;
    }
}
