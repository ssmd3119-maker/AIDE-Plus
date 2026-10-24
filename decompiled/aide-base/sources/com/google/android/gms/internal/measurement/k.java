package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class k extends n1 implements j {
    public k() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.n1
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            onEvent(parcel.readString(), parcel.readString(), (Bundle) u1.DW(parcel, Bundle.CREATOR), parcel.readLong());
            parcel2.writeNoException();
        } else {
            if (i != 2) {
                return false;
            }
            int iPh = ph();
            parcel2.writeNoException();
            parcel2.writeInt(iPh);
        }
        return true;
    }
}
