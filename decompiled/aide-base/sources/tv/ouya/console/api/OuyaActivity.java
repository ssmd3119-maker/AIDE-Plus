package tv.ouya.console.api;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.json.JSONException;

/* loaded from: classes.dex */
public class OuyaActivity extends Activity {
    private int WB = 0;
    private long jw;
    private long mb;

    public static void DW(Activity activity) {
        activity.getWindow().getDecorView().setSystemUiVisibility(6);
    }

    public static void FH(Activity activity, int i) {
        if ((i & 1) == 0) {
            activity.takeKeyEvents(true);
        }
        if ((i & 2) == 0) {
            DW(activity);
        }
    }

    private void j6(boolean z) {
        long jNanoTime = System.nanoTime() / 1000000;
        if (jNanoTime - (z ? this.mb : this.jw) < 30000) {
            return;
        }
        if (z) {
            this.mb = jNanoTime;
        } else {
            this.jw = jNanoTime;
        }
        Intent intent = new Intent("tv.ouya.metrics.action.USER_INPUT");
        intent.putExtra("analog", z);
        sendBroadcast(intent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((this.WB & 8) != 0 || !f.we(motionEvent)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        j6(true);
        return f.Hw(this, motionEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if ((this.WB & 8) != 0 || !f.we(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        j6(false);
        return f.v5(this, keyEvent);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) throws JSONException {
        f.gn(this);
        f.EQ((this.WB & 4) == 0);
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        f.J0(this);
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        super.setContentView(i);
        FH(this, this.WB);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        FH(this, this.WB);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        FH(this, this.WB);
    }
}
