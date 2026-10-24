package com.android.billingclient.api;

import abcd.iy;
import abcd.ng;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;

/* loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {
    private ResultReceiver WB;

    private static /* synthetic */ void j6(Object obj, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        ((ProxyBillingActivity) obj).startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
        iy.ei(obj, intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        iy.v5(this, i, i2, intent);
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            int iHw = ng.Hw(intent, "ProxyBillingActivity");
            if (i2 != -1 || iHw != 0) {
                ng.Zo("ProxyBillingActivity", "Activity finished with resultCode " + i2 + " and billing's responseCode: " + iHw);
            }
            this.WB.send(iHw, intent == null ? null : intent.getExtras());
        } else {
            ng.Zo("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i + "; skipping...");
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            ng.v5("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.WB = (ResultReceiver) bundle.getParcelable("result_receiver");
            return;
        }
        ng.v5("ProxyBillingActivity", "Launching Play Store billing flow");
        this.WB = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
        try {
            j6(this, (getIntent().hasExtra("BUY_INTENT") ? (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT") : getIntent().hasExtra("SUBS_MANAGEMENT_INTENT") ? (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT") : null).getIntentSender(), 100, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e) {
            ng.Zo("ProxyBillingActivity", "Got exception while trying to start a purchase flow: " + e);
            this.WB.send(6, null);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.WB);
    }
}
