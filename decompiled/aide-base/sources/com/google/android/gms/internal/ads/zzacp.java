package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@jg
/* loaded from: classes.dex */
public final class zzacp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzacp> CREATOR = new t1();
    public final int WB;
    public final boolean fY;
    public final int jw;
    public final zzzw k2;
    public final boolean mb;
    public final int qp;
    private final boolean zh;

    public zzacp(com.google.android.gms.ads.formats.b bVar) {
        this(3, bVar.v5(), bVar.DW(), bVar.Hw(), bVar.j6(), bVar.FH() != null ? new zzzw(bVar.FH()) : null, bVar.Zo());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 1, this.WB);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 2, this.mb);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 3, this.jw);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 4, this.fY);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 5, this.qp);
        com.google.android.gms.common.internal.safeparcel.b.QX(parcel, 6, this.k2, i, false);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 7, this.zh);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }

    public zzacp(int i, boolean z, int i2, boolean z2, int i3, zzzw zzzwVar, boolean z3) {
        this.WB = i;
        this.mb = z;
        this.jw = i2;
        this.fY = z2;
        this.qp = i3;
        this.k2 = zzzwVar;
        this.zh = z3;
    }
}
