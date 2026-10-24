package tv.ouya.console.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface IIapServiceDefinition extends IInterface {

    public static abstract class Sub extends Binder implements IIapServiceDefinition {

        private static class Proxy implements IIapServiceDefinition {
            private IBinder WB;

            public Proxy(IBinder iBinder) {
                this.WB = iBinder;
            }

            @Override // tv.ouya.console.internal.IIapServiceDefinition
            public void aR(String str, IStringListener iStringListener) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("tv.ouya.console.internal.IIapServiceDefinition");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iStringListener != null ? iStringListener.asBinder() : null);
                    this.WB.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
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

        public static IIapServiceDefinition asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("tv.ouya.console.internal.IIapServiceDefinition");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IIapServiceDefinition)) ? new Proxy(iBinder) : (IIapServiceDefinition) iInterfaceQueryLocalInterface;
        }
    }

    void aR(String str, IStringListener iStringListener);
}
