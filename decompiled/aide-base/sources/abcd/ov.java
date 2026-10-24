package abcd;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
public class ov extends Handler {
    public ov(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        super.dispatchMessage(message);
    }

    public ov(Looper looper, Handler.Callback callback) {
        super(looper, callback);
    }
}
