package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.b;

/* loaded from: classes.dex */
public abstract class l {
    public l(int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Status j6(RemoteException remoteException) {
        StringBuilder sb = new StringBuilder();
        if (com.google.android.gms.common.util.o.DW() && (remoteException instanceof TransactionTooLargeException)) {
            sb.append("TransactionTooLargeException: ");
        }
        sb.append(remoteException.getLocalizedMessage());
        return new Status(8, sb.toString());
    }

    public abstract void DW(Status status);

    public abstract void FH(b.a<?> aVar);

    public abstract void Hw(i iVar, boolean z);

    public abstract void v5(RuntimeException runtimeException);
}
