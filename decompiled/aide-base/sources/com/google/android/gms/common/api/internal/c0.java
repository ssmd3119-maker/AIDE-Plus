package com.google.android.gms.common.api.internal;

import abcd.hw;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.b;

/* loaded from: classes.dex */
public abstract class c0<T> extends v {
    protected final hw<T> j6;

    public c0(int i, hw<T> hwVar) {
        super(i);
        this.j6 = hwVar;
    }

    @Override // com.google.android.gms.common.api.internal.l
    public void DW(Status status) {
        this.j6.Hw(new com.google.android.gms.common.api.b(status));
    }

    @Override // com.google.android.gms.common.api.internal.l
    public final void FH(b.a<?> aVar) throws DeadObjectException {
        try {
            u7(aVar);
        } catch (DeadObjectException e) {
            DW(l.j6(e));
            throw e;
        } catch (RemoteException e2) {
            DW(l.j6(e2));
        } catch (RuntimeException e3) {
            v5(e3);
        }
    }

    protected abstract void u7(b.a<?> aVar);

    @Override // com.google.android.gms.common.api.internal.l
    public void v5(RuntimeException runtimeException) {
        this.j6.Hw(runtimeException);
    }
}
