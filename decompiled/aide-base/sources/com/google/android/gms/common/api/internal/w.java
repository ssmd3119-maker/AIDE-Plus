package com.google.android.gms.common.api.internal;

import abcd.vv;
import abcd.wv;
import abcd.zv;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.zaj;
import java.util.Set;

/* loaded from: classes.dex */
public final class w extends com.google.android.gms.signin.internal.c implements com.google.android.gms.common.api.f, com.google.android.gms.common.api.g {
    private static a.AbstractC0107a<? extends zv, vv> AL = wv.FH;
    private final Context WB;
    private Set<Scope> fY;
    private final a.AbstractC0107a<? extends zv, vv> jw;
    private zv k2;
    private final Handler mb;
    private com.google.android.gms.common.internal.d qp;
    private z zh;

    public w(Context context, Handler handler, com.google.android.gms.common.internal.d dVar) {
        this(context, handler, dVar, AL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void aq(zaj zajVar) {
        ConnectionResult connectionResultGn = zajVar.gn();
        if (connectionResultGn.QX()) {
            ResolveAccountResponse resolveAccountResponseEQ = zajVar.EQ();
            ConnectionResult connectionResultEQ = resolveAccountResponseEQ.EQ();
            if (!connectionResultEQ.QX()) {
                String strValueOf = String.valueOf(connectionResultEQ);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(strValueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
                this.zh.FH(connectionResultEQ);
                this.k2.disconnect();
                return;
            }
            this.zh.DW(resolveAccountResponseEQ.gn(), this.fY);
        } else {
            this.zh.FH(connectionResultGn);
        }
        this.k2.disconnect();
    }

    public final void CU() {
        zv zvVar = this.k2;
        if (zvVar != null) {
            zvVar.disconnect();
        }
    }

    @Override // com.google.android.gms.signin.internal.d
    public final void F3(zaj zajVar) {
        this.mb.post(new y(this, zajVar));
    }

    @Override // com.google.android.gms.common.api.f
    public final void onConnected(Bundle bundle) {
        this.k2.FH(this);
    }

    @Override // com.google.android.gms.common.api.g
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.zh.FH(connectionResult);
    }

    @Override // com.google.android.gms.common.api.f
    public final void onConnectionSuspended(int i) {
        this.k2.disconnect();
    }

    public final void sy(z zVar) {
        zv zvVar = this.k2;
        if (zvVar != null) {
            zvVar.disconnect();
        }
        this.qp.u7(Integer.valueOf(System.identityHashCode(this)));
        a.AbstractC0107a<? extends zv, vv> abstractC0107a = this.jw;
        Context context = this.WB;
        Looper looper = this.mb.getLooper();
        com.google.android.gms.common.internal.d dVar = this.qp;
        this.k2 = (zv) abstractC0107a.j6(context, looper, dVar, dVar.gn(), this, this);
        this.zh = zVar;
        Set<Scope> set = this.fY;
        if (set == null || set.isEmpty()) {
            this.mb.post(new x(this));
        } else {
            this.k2.DW();
        }
    }

    public w(Context context, Handler handler, com.google.android.gms.common.internal.d dVar, a.AbstractC0107a<? extends zv, vv> abstractC0107a) {
        this.WB = context;
        this.mb = handler;
        com.google.android.gms.common.internal.p.tp(dVar, "ClientSettings must not be null");
        this.qp = dVar;
        this.fY = dVar.VH();
        this.jw = abstractC0107a;
    }
}
