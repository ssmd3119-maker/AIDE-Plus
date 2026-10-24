package com.google.firebase.iid;

import abcd.hw;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class m<T> {
    final hw<T> DW = new hw<>();
    final int FH;
    final Bundle Hw;
    final int j6;

    m(int i, int i2, Bundle bundle) {
        this.j6 = i;
        this.FH = i2;
        this.Hw = bundle;
    }

    final void DW(n nVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(nVar);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 14 + String.valueOf(strValueOf2).length());
            sb.append("Failing ");
            sb.append(strValueOf);
            sb.append(" with ");
            sb.append(strValueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.DW.DW(nVar);
    }

    abstract boolean FH();

    abstract void Hw(Bundle bundle);

    final void j6(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(t);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 16 + String.valueOf(strValueOf2).length());
            sb.append("Finishing ");
            sb.append(strValueOf);
            sb.append(" with ");
            sb.append(strValueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.DW.FH(t);
    }

    public String toString() {
        int i = this.FH;
        int i2 = this.j6;
        boolean zFH = FH();
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(zFH);
        sb.append("}");
        return sb.toString();
    }
}
