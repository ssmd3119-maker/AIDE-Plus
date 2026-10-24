package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public class m1 implements IInterface {
    private final IBinder zzqt;
    private final String zzqu;

    protected m1(IBinder iBinder, String str) {
        this.zzqt = iBinder;
        this.zzqu = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.zzqt;
    }

    protected final Parcel obtainAndWriteInterfaceToken() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.zzqu);
        return parcelObtain;
    }

    protected final Parcel transactAndReadException(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.zzqt.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    protected final void zza(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.zzqt.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    protected final void zzb(int i, Parcel parcel) {
        try {
            this.zzqt.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
