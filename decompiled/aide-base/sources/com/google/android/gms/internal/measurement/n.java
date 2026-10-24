package com.google.android.gms.internal.measurement;

import abcd.xu;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.measurement.m;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class n extends m.b {
    private final /* synthetic */ Bundle AL;
    private final /* synthetic */ String k2;
    private final /* synthetic */ Context qp;
    private final /* synthetic */ m w9;
    private final /* synthetic */ String zh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(m mVar, Context context, String str, String str2, Bundle bundle) {
        super(mVar);
        this.w9 = mVar;
        this.qp = context;
        this.k2 = str;
        this.zh = str2;
        this.AL = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.m.b
    public final void j6() {
        String str;
        String str2;
        String str3;
        try {
            this.w9.v5 = new HashMap();
            this.w9.u7 = this.w9.cb(this.qp);
            if (this.w9.u7 == null) {
                Log.w(this.w9.j6, "Failed to connect to measurement client.");
                return;
            }
            m mVar = this.w9;
            if (m.cn(this.k2, this.zh)) {
                String str4 = this.zh;
                str2 = this.k2;
                str3 = str4;
                str = this.w9.j6;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            int iVJ = m.vJ(this.qp);
            this.w9.u7.PZ(xu.sy(this.qp), new zzdy(13001L, Math.max(iVJ, r3), m.Sf(this.qp) < iVJ, str, str2, str3, this.AL), this.WB);
        } catch (RemoteException e) {
            this.w9.yS(e, true, false);
        }
    }
}
