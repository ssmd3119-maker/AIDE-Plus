package tv.ouya.console.api;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class h<T> implements Runnable {
    protected g<T> WB;
    private String mb;

    public h(g<T> gVar, String str) {
        this.WB = gVar;
        this.mb = str;
    }

    abstract void j6();

    @Override // java.lang.Runnable
    public void run() {
        try {
            j6();
        } catch (RemoteException e) {
            Log.e("OUYASDK", "Remote exception while " + this.mb, e);
            this.WB.gG(3003, "", new Bundle());
        }
    }
}
