package androidx.core.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface INotificationSideChannel extends IInterface {

    public static abstract class Sub extends Binder implements INotificationSideChannel {

        private static class Proxy implements INotificationSideChannel {
            private IBinder WB;

            Proxy(IBinder iBinder) {
                this.WB = iBinder;
            }

            @Override // androidx.core.app.INotificationSideChannel
            public void T7(String str, int i, String str2, Notification notification) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.core.app.INotificationSideChannel");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str2);
                    if (notification != null) {
                        parcelObtain.writeInt(1);
                        notification.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.WB.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.WB;
            }

            @Override // androidx.core.app.INotificationSideChannel
            public void iF(String str, int i, String str2) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.core.app.INotificationSideChannel");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str2);
                    this.WB.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.core.app.INotificationSideChannel
            public void n8(String str) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.core.app.INotificationSideChannel");
                    parcelObtain.writeString(str);
                    this.WB.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Sub() {
            attachInterface(this, "androidx.core.app.INotificationSideChannel");
        }

        public static INotificationSideChannel asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.core.app.INotificationSideChannel");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof INotificationSideChannel)) ? new Proxy(iBinder) : (INotificationSideChannel) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("androidx.core.app.INotificationSideChannel");
                T7(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? (Notification) Notification.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface("androidx.core.app.INotificationSideChannel");
                iF(parcel.readString(), parcel.readInt(), parcel.readString());
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface("androidx.core.app.INotificationSideChannel");
                n8(parcel.readString());
                return true;
            }
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("androidx.core.app.INotificationSideChannel");
            return true;
        }
    }

    void T7(String str, int i, String str2, Notification notification);

    void iF(String str, int i, String str2);

    void n8(String str);
}
