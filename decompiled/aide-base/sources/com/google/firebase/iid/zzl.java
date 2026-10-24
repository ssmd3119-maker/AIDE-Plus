package com.google.firebase.iid;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
public class zzl implements Parcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new k0();
    private Messenger WB;
    private t0 mb;

    public static final class a extends ClassLoader {
        @Override // java.lang.ClassLoader
        protected final Class<?> loadClass(String str, boolean z) {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return super.loadClass(str, z);
            }
            if (!FirebaseInstanceId.rN()) {
                return zzl.class;
            }
            Log.d("FirebaseInstanceId", "Using renamed FirebaseIidMessengerCompat class");
            return zzl.class;
        }
    }

    public zzl(IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.WB = new Messenger(iBinder);
        } else {
            this.mb = new u0(iBinder);
        }
    }

    private final IBinder j6() {
        Messenger messenger = this.WB;
        return messenger != null ? messenger.getBinder() : this.mb.asBinder();
    }

    public final void DW(Message message) throws RemoteException {
        Messenger messenger = this.WB;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.mb.ee(message);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return j6().equals(((zzl) obj).j6());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return j6().hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.WB;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
        } else {
            parcel.writeStrongBinder(this.mb.asBinder());
        }
    }
}
