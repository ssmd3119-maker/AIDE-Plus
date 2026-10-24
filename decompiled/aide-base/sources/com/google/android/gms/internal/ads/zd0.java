package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public class zd0 implements IInterface {
    private final IBinder WB;
    private final String mb;

    protected zd0(IBinder iBinder, String str) {
        this.WB = iBinder;
        this.mb = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.WB;
    }

    protected final Parcel dx(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.WB.transact(i, parcel, parcelObtain, 0);
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

    protected final void g3(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.WB.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    protected final Parcel sh() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.mb);
        return parcelObtain;
    }

    protected final void sy(int i, Parcel parcel) {
        try {
            this.WB.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
