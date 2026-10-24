package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public class ClientIdentity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new t();
    private final int WB;
    private final String mb;

    public ClientIdentity(int i, String str) {
        this.WB = i;
        this.mb = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ClientIdentity)) {
            ClientIdentity clientIdentity = (ClientIdentity) obj;
            if (clientIdentity.WB == this.WB && o.j6(clientIdentity.mb, this.mb)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.WB;
    }

    public String toString() {
        int i = this.WB;
        String str = this.mb;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(i);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 1, this.WB);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 2, this.mb, false);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }
}
