package tv.ouya.console.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface IStringListener extends IInterface {

    public static abstract class Sub extends Binder implements IStringListener {
        public Sub() {
            attachInterface(this, "tv.ouya.console.internal.IStringListener");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("tv.ouya.console.internal.IStringListener");
                w3(parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface("tv.ouya.console.internal.IStringListener");
                gG(parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i != 3) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("tv.ouya.console.internal.IStringListener");
                return true;
            }
            parcel.enforceInterface("tv.ouya.console.internal.IStringListener");
            nw();
            parcel2.writeNoException();
            return true;
        }
    }

    void gG(int i, String str, Bundle bundle);

    void nw();

    void w3(String str);
}
