package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
/* loaded from: classes.dex */
public final class BinderWrapper implements Parcelable {
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new b0();
    private IBinder WB;

    public BinderWrapper() {
        this.WB = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.WB);
    }

    private BinderWrapper(Parcel parcel) {
        this.WB = null;
        this.WB = parcel.readStrongBinder();
    }

    /* synthetic */ BinderWrapper(Parcel parcel, b0 b0Var) {
        this(parcel);
    }
}
