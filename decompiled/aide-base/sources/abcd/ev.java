package abcd;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class ev extends zu implements cv {
    public ev(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // abcd.cv
    public final boolean J8() {
        Parcel parcelDx = dx(6, sh());
        boolean zDW = bv.DW(parcelDx);
        parcelDx.recycle();
        return zDW;
    }

    @Override // abcd.cv
    public final String X7() {
        Parcel parcelDx = dx(1, sh());
        String string = parcelDx.readString();
        parcelDx.recycle();
        return string;
    }

    @Override // abcd.cv
    public final boolean un(boolean z) {
        Parcel parcelSh = sh();
        bv.j6(parcelSh, true);
        Parcel parcelDx = dx(2, parcelSh);
        boolean zDW = bv.DW(parcelDx);
        parcelDx.recycle();
        return zDW;
    }
}
