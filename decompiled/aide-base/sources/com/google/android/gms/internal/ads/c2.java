package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class c2 extends zd0 implements a2 {
    c2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // com.google.android.gms.internal.ads.a2
    public final List<f2> MH() {
        Parcel parcelDx = dx(3, sh());
        ArrayList arrayListZo = be0.Zo(parcelDx);
        parcelDx.recycle();
        return arrayListZo;
    }

    @Override // com.google.android.gms.internal.ads.a2
    public final String OW() {
        Parcel parcelDx = dx(2, sh());
        String string = parcelDx.readString();
        parcelDx.recycle();
        return string;
    }
}
