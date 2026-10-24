package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public final class zzbji extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbji> CREATOR = new ay();
    private final int WB;
    private byte[] jw;
    private sz mb = null;

    zzbji(int i, byte[] bArr) {
        this.WB = i;
        this.jw = bArr;
        EQ();
    }

    private final void EQ() {
        if (this.mb != null || this.jw == null) {
            if (this.mb == null || this.jw != null) {
                if (this.mb != null && this.jw != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (this.mb != null || this.jw != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    public final sz gn() {
        if (!(this.mb != null)) {
            try {
                byte[] bArr = this.jw;
                sz szVar = new sz();
                p90.DW(szVar, bArr);
                this.mb = szVar;
                this.jw = null;
            } catch (o90 e) {
                throw new IllegalStateException(e);
            }
        }
        EQ();
        return this.mb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 1, this.WB);
        byte[] bArrVH = this.jw;
        if (bArrVH == null) {
            bArrVH = p90.VH(this.mb);
        }
        com.google.android.gms.common.internal.safeparcel.b.v5(parcel, 2, bArrVH, false);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }
}
