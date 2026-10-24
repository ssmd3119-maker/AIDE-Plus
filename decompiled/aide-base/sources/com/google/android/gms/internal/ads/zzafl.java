package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Map;

@jg
/* loaded from: classes.dex */
public final class zzafl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzafl> CREATOR = new n4();
    private final String WB;
    private final String[] jw;
    private final String[] mb;

    zzafl(String str, String[] strArr, String[] strArr2) {
        this.WB = str;
        this.mb = strArr;
        this.jw = strArr2;
    }

    public static zzafl gn(bq0 bq0Var) {
        Map<String, String> mapJ6 = bq0Var.j6();
        int size = mapJ6.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        for (Map.Entry<String, String> entry : mapJ6.entrySet()) {
            strArr[i] = entry.getKey();
            strArr2[i] = entry.getValue();
            i++;
        }
        return new zzafl(bq0Var.FH(), strArr, strArr2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 1, this.WB, false);
        com.google.android.gms.common.internal.safeparcel.b.aM(parcel, 2, this.mb, false);
        com.google.android.gms.common.internal.safeparcel.b.aM(parcel, 3, this.jw, false);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }
}
