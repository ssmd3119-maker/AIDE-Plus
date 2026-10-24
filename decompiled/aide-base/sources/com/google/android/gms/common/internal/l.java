package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class l implements m {
    private final IBinder WB;

    l(IBinder iBinder) {
        this.WB = iBinder;
    }

    @Override // com.google.android.gms.common.internal.m
    public final void UF(k kVar, GetServiceRequest getServiceRequest) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(kVar != null ? kVar.asBinder() : null);
            if (getServiceRequest != null) {
                parcelObtain.writeInt(1);
                getServiceRequest.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.WB.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.WB;
    }
}
