package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.aide.uidesigner.ProxyTextView;
import com.google.android.gms.internal.measurement.n1;
import com.google.android.gms.internal.measurement.u1;
import com.probelytics.api.UserTouchAction;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zzak extends n1 implements zzaj {
    public zzak() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.n1
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                zza((zzag) u1.DW(parcel, zzag.CREATOR), (zzk) u1.DW(parcel, zzk.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                zza((zzfv) u1.DW(parcel, zzfv.CREATOR), (zzk) u1.DW(parcel, zzk.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                zza((zzk) u1.DW(parcel, zzk.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                zza((zzag) u1.DW(parcel, zzag.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                zzb((zzk) u1.DW(parcel, zzk.CREATOR));
                parcel2.writeNoException();
                return true;
            case UserTouchAction.CLICK_KIND /* 7 */:
                List<zzfv> listZza = zza((zzk) u1.DW(parcel, zzk.CREATOR), u1.v5(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(listZza);
                return true;
            case 9:
                byte[] bArrZza = zza((zzag) u1.DW(parcel, zzag.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrZza);
                return true;
            case 10:
                zza(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                String strZzc = zzc((zzk) u1.DW(parcel, zzk.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(strZzc);
                return true;
            case 12:
                zza((zzo) u1.DW(parcel, zzo.CREATOR), (zzk) u1.DW(parcel, zzk.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                zzb((zzo) u1.DW(parcel, zzo.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                List<zzfv> listZza2 = zza(parcel.readString(), parcel.readString(), u1.v5(parcel), (zzk) u1.DW(parcel, zzk.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(listZza2);
                return true;
            case 15:
                List<zzfv> listZza3 = zza(parcel.readString(), parcel.readString(), parcel.readString(), u1.v5(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(listZza3);
                return true;
            case 16:
                List<zzo> listZza4 = zza(parcel.readString(), parcel.readString(), (zzk) u1.DW(parcel, zzk.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(listZza4);
                return true;
            case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                List<zzo> listZze = zze(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(listZze);
                return true;
            case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
                zzd((zzk) u1.DW(parcel, zzk.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
