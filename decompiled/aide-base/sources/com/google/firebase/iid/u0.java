package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class u0 implements t0 {
    private final IBinder WB;

    u0(IBinder iBinder) {
        this.WB = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.WB;
    }

    @Override // com.google.firebase.iid.t0
    public final void ee(Message message) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
        parcelObtain.writeInt(1);
        message.writeToParcel(parcelObtain, 0);
        try {
            this.WB.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
