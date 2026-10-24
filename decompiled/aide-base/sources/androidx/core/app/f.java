package androidx.core.app;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class f extends e {
    boolean jw;

    /* JADX INFO: Access modifiers changed from: package-private */
    protected f() {
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (!this.jw && i != -1) {
            e.v5(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (!this.mb && i != -1) {
            e.v5(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
