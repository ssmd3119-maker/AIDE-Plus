package abcd;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public class zu implements IInterface {
    private final IBinder WB;
    private final String mb;

    public zu(IBinder iBinder, String str) {
        this.WB = iBinder;
        this.mb = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.WB;
    }

    public final Parcel dx(int i, Parcel parcel) {
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

    public final Parcel sh() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.mb);
        return parcelObtain;
    }
}
