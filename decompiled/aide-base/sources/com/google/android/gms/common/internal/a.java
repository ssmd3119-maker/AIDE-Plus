package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.j;

/* loaded from: classes.dex */
public class a extends j.a {
    public static Account g3(j jVar) {
        if (jVar != null) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return jVar.n5();
            } catch (RemoteException unused) {
                Log.w("AccountAccessor", "Remote account accessor probably died");
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
        return null;
    }
}
