package com.google.android.gms.common.api;

import abcd.iy;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    private int WB = 0;

    private static /* synthetic */ void DW(Object obj, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        ((GoogleApiActivity) obj).startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
        iy.ei(obj, intentSender, i, intent, i2, i3, i4);
    }

    public static PendingIntent FH(Context context, PendingIntent pendingIntent, int i) {
        return iy.j6(context, 0, Hw(context, pendingIntent, i, true), 134217728);
    }

    public static Intent Hw(Context context, PendingIntent pendingIntent, int i, boolean z) {
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", z);
        return intent;
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        iy.v5(this, i, i2, intent);
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.WB = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                com.google.android.gms.common.api.internal.b bVarHw = com.google.android.gms.common.api.internal.b.Hw(this);
                if (i2 == -1) {
                    bVarHw.XL();
                } else if (i2 == 0) {
                    bVarHw.DW(new ConnectionResult(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.WB = 0;
            setResult(i2, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        this.WB = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.WB = bundle.getInt("resolution");
        }
        if (this.WB != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                Log.e("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                Log.e("GoogleApiActivity", "Activity started without resolution");
                finish();
            } else {
                if (pendingIntent == null) {
                    com.google.android.gms.common.b.Ws().QX(this, num.intValue(), 2, this);
                    this.WB = 1;
                    return;
                }
                try {
                    DW(this, pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                    this.WB = 1;
                } catch (IntentSender.SendIntentException e) {
                    Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                    finish();
                }
            }
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.WB);
        super.onSaveInstanceState(bundle);
    }
}
