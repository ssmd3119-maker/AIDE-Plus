package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;

/* loaded from: classes.dex */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new zzp();
    public boolean active;
    public long creationTimestamp;
    public String origin;
    public String packageName;
    public long timeToLive;
    public String triggerEventName;
    public long triggerTimeout;
    public zzfv zzags;
    public zzag zzagt;
    public zzag zzagu;
    public zzag zzagv;

    zzo(zzo zzoVar) {
        p.u7(zzoVar);
        this.packageName = zzoVar.packageName;
        this.origin = zzoVar.origin;
        this.zzags = zzoVar.zzags;
        this.creationTimestamp = zzoVar.creationTimestamp;
        this.active = zzoVar.active;
        this.triggerEventName = zzoVar.triggerEventName;
        this.zzagt = zzoVar.zzagt;
        this.triggerTimeout = zzoVar.triggerTimeout;
        this.zzagu = zzoVar.zzagu;
        this.timeToLive = zzoVar.timeToLive;
        this.zzagv = zzoVar.zzagv;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ6 = b.j6(parcel);
        b.XL(parcel, 2, this.packageName, false);
        b.XL(parcel, 3, this.origin, false);
        b.QX(parcel, 4, this.zzags, i, false);
        b.J0(parcel, 5, this.creationTimestamp);
        b.FH(parcel, 6, this.active);
        b.XL(parcel, 7, this.triggerEventName, false);
        b.QX(parcel, 8, this.zzagt, i, false);
        b.J0(parcel, 9, this.triggerTimeout);
        b.QX(parcel, 10, this.zzagu, i, false);
        b.J0(parcel, 11, this.timeToLive);
        b.QX(parcel, 12, this.zzagv, i, false);
        b.DW(parcel, iJ6);
    }

    zzo(String str, String str2, zzfv zzfvVar, long j, boolean z, String str3, zzag zzagVar, long j2, zzag zzagVar2, long j3, zzag zzagVar3) {
        this.packageName = str;
        this.origin = str2;
        this.zzags = zzfvVar;
        this.creationTimestamp = j;
        this.active = z;
        this.triggerEventName = str3;
        this.zzagt = zzagVar;
        this.triggerTimeout = j2;
        this.zzagu = zzagVar2;
        this.timeToLive = j3;
        this.zzagv = zzagVar3;
    }
}
