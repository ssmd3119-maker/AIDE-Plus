package com.google.android.finsky.externalreferrer;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface IGetInstallReferrerService extends IInterface {

    public static abstract class Sub extends Binder implements IGetInstallReferrerService {

        private static class Proxy implements IGetInstallReferrerService {
            private IBinder WB;

            public Proxy(IBinder iBinder) {
                this.WB = iBinder;
            }

            @Override // com.google.android.finsky.externalreferrer.IGetInstallReferrerService
            public Bundle KM(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.WB.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.WB;
            }
        }

        public static IGetInstallReferrerService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IGetInstallReferrerService)) ? new Proxy(iBinder) : (IGetInstallReferrerService) iInterfaceQueryLocalInterface;
        }
    }

    Bundle KM(Bundle bundle);
}
