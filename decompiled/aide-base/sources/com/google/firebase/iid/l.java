package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
public final class l {
    private final zzl DW;
    private final Messenger j6;

    l(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.j6 = new Messenger(iBinder);
            this.DW = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.DW = new zzl(iBinder);
            this.j6 = null;
        } else {
            String strValueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", strValueOf.length() != 0 ? "Invalid interface descriptor: ".concat(strValueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }

    final void j6(Message message) throws RemoteException {
        Messenger messenger = this.j6;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        zzl zzlVar = this.DW;
        if (zzlVar == null) {
            throw new IllegalStateException("Both messengers are null");
        }
        zzlVar.DW(message);
    }
}
