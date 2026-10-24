package com.android.billingclient.api;

import abcd.ng;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.android.billingclient.api.c;

/* loaded from: classes.dex */
public class BillingClientImpl extends b {
    private final a j6;

    /* renamed from: com.android.billingclient.api.BillingClientImpl$1, reason: invalid class name */
    class AnonymousClass1 extends ResultReceiver {
        final /* synthetic */ BillingClientImpl WB;

        @Override // android.os.ResultReceiver
        public void onReceiveResult(int i, Bundle bundle) {
            this.WB.j6.j6();
            throw null;
        }
    }

    /* renamed from: com.android.billingclient.api.BillingClientImpl$3, reason: invalid class name */
    public class AnonymousClass3 extends ResultReceiver {
        final /* synthetic */ d WB;

        @Override // android.os.ResultReceiver
        public void onReceiveResult(int i, Bundle bundle) {
            c.b bVarHw = c.Hw();
            bVarHw.FH(i);
            bVarHw.DW(ng.DW(bundle, "BillingClient"));
            this.WB.j6(bVarHw.j6());
        }
    }
}
