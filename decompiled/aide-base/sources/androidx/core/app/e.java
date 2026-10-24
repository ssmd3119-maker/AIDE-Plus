package androidx.core.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
public abstract class e extends ComponentActivity {
    boolean mb;

    e() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    protected static void v5(int i) {
        if ((i & (-65536)) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    abstract View Zo(View view, String str, Context context, AttributeSet attributeSet);

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewZo = Zo(view, str, context, attributeSet);
        return viewZo == null ? super.onCreateView(view, str, context, attributeSet) : viewZo;
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        if (!this.mb && i != -1) {
            v5(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewZo = Zo(null, str, context, attributeSet);
        return viewZo == null ? super.onCreateView(str, context, attributeSet) : viewZo;
    }
}
