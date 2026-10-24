package com.google.android.gms.common;

import abcd.wu;
import abcd.xu;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.j0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new v();
    private final String WB;
    private final boolean jw;

    @Nullable
    private final p mb;

    zzk(String str, @Nullable IBinder iBinder, boolean z) {
        this.WB = str;
        this.mb = gn(iBinder);
        this.jw = z;
    }

    @Nullable
    private static p gn(@Nullable IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        try {
            wu wuVarOb = j0.dx(iBinder).Ob();
            byte[] bArr = wuVarOb == null ? null : (byte[]) xu.g3(wuVarOb);
            if (bArr != null) {
                return new q(bArr);
            }
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
            return null;
        } catch (RemoteException e) {
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 1, this.WB, false);
        p pVar = this.mb;
        if (pVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            pVar = null;
        } else {
            pVar.asBinder();
        }
        com.google.android.gms.common.internal.safeparcel.b.u7(parcel, 2, pVar, false);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 3, this.jw);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }

    zzk(String str, @Nullable p pVar, boolean z) {
        this.WB = str;
        this.mb = pVar;
        this.jw = z;
    }
}
