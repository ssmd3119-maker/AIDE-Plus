package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import java.lang.ref.WeakReference;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class q0 implements View.OnClickListener {
    private final nf WB;
    String fY;
    private com.google.android.gms.ads.internal.gmsg.b0 jw;
    WeakReference<View> k2;
    private y3 mb;
    Long qp;

    public q0(nf nfVar) {
        this.WB = nfVar;
    }

    private final void v5() {
        this.fY = null;
        this.qp = null;
        WeakReference<View> weakReference = this.k2;
        if (weakReference == null) {
            return;
        }
        View view = weakReference.get();
        this.k2 = null;
        if (view == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
    }

    public final void FH(y3 y3Var) {
        this.mb = y3Var;
        com.google.android.gms.ads.internal.gmsg.b0 b0Var = this.jw;
        if (b0Var != null) {
            this.WB.g3("/unconfirmedClick", b0Var);
        }
        r0 r0Var = new r0(this);
        this.jw = r0Var;
        this.WB.sh("/unconfirmedClick", r0Var);
    }

    public final y3 Hw() {
        return this.mb;
    }

    public final void j6() {
        if (this.mb == null || this.qp == null) {
            return;
        }
        v5();
        try {
            this.mb.I1();
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws JSONException {
        WeakReference<View> weakReference = this.k2;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.fY != null && this.qp != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("id", this.fY);
                jSONObject.put("time_interval", com.google.android.gms.ads.internal.w0.we().j6() - this.qp.longValue());
                jSONObject.put("messageType", "onePointFiveClick");
                this.WB.j6("sendMessageToNativeJs", jSONObject);
            } catch (JSONException e) {
                xp.Hw("Unable to dispatch sendMessageToNativeJs event", e);
            }
        }
        v5();
    }
}
