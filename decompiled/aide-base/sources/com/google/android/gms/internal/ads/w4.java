package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.c;

/* loaded from: classes.dex */
public final class w4 implements c.a {
    private final /* synthetic */ fr WB;
    private final /* synthetic */ zzaft mb;

    w4(zzaft zzaftVar, fr frVar) {
        this.mb = zzaftVar;
        this.WB = frVar;
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void onConnected(Bundle bundle) {
        try {
            this.WB.FH(this.mb.j6.Hw());
        } catch (DeadObjectException e) {
            this.WB.Hw(e);
        }
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void onConnectionSuspended(int i) {
        fr frVar = this.WB;
        StringBuilder sb = new StringBuilder(34);
        sb.append("onConnectionSuspended: ");
        sb.append(i);
        frVar.Hw(new RuntimeException(sb.toString()));
    }
}
