package com.google.android.gms.common.internal;

import abcd.lv;
import abcd.mv;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface k extends IInterface {

    public static abstract class a extends lv implements k {
        public a() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // abcd.lv
        public final boolean sh(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                TL(parcel.readInt(), parcel.readStrongBinder(), (Bundle) mv.DW(parcel, Bundle.CREATOR));
            } else if (i == 2) {
                e6(parcel.readInt(), (Bundle) mv.DW(parcel, Bundle.CREATOR));
            } else {
                if (i != 3) {
                    return false;
                }
                YZ(parcel.readInt(), parcel.readStrongBinder(), (zzb) mv.DW(parcel, zzb.CREATOR));
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void TL(int i, IBinder iBinder, Bundle bundle);

    void YZ(int i, IBinder iBinder, zzb zzbVar);

    void e6(int i, Bundle bundle);
}
