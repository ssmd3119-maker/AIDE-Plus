package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.a;

/* loaded from: classes.dex */
public class i {
    private com.google.android.gms.common.c DW;
    private final SparseIntArray j6 = new SparseIntArray();

    public i(com.google.android.gms.common.c cVar) {
        p.u7(cVar);
        this.DW = cVar;
    }

    public int DW(Context context, a.f fVar) {
        p.u7(context);
        p.u7(fVar);
        int iU7 = 0;
        if (!fVar.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = fVar.getMinApkVersion();
        int i = this.j6.get(minApkVersion, -1);
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= this.j6.size()) {
                iU7 = i;
                break;
            }
            int iKeyAt = this.j6.keyAt(i2);
            if (iKeyAt > minApkVersion && this.j6.get(iKeyAt) == 0) {
                break;
            }
            i2++;
        }
        if (iU7 == -1) {
            iU7 = this.DW.u7(context, minApkVersion);
        }
        this.j6.put(minApkVersion, iU7);
        return iU7;
    }

    public void j6() {
        this.j6.clear();
    }
}
