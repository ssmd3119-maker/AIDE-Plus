package androidx.asynclayoutinflater.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.util.Pools$SynchronizedPool;
import java.util.concurrent.ArrayBlockingQueue;

/* loaded from: classes.dex */
public final class AsyncLayoutInflater {
    LayoutInflater j6;
    private Handler.Callback Hw = new a();
    Handler DW = new Handler(this.Hw);
    InflateThread FH = InflateThread.j6();

    private static class InflateThread extends Thread {
        private static final InflateThread jw;
        private ArrayBlockingQueue<c> WB = new ArrayBlockingQueue<>(10);
        private Pools$SynchronizedPool<c> mb = new Pools$SynchronizedPool<>(10);

        static {
            InflateThread inflateThread = new InflateThread();
            jw = inflateThread;
            inflateThread.start();
        }

        private InflateThread() {
        }

        public static InflateThread j6() {
            return jw;
        }

        public void DW(c cVar) {
            cVar.v5 = null;
            cVar.j6 = null;
            cVar.DW = null;
            cVar.FH = 0;
            cVar.Hw = null;
            this.mb.DW(cVar);
        }

        public void FH() throws InterruptedException {
            try {
                c cVarTake = this.WB.take();
                try {
                    cVarTake.Hw = cVarTake.j6.j6.inflate(cVarTake.FH, cVarTake.DW, false);
                } catch (RuntimeException e) {
                    Log.w("AsyncLayoutInflater", "Failed to inflate resource in the background! Retrying on the UI thread", e);
                }
                Message.obtain(cVarTake.j6.DW, 0, cVarTake).sendToTarget();
            } catch (InterruptedException e2) {
                Log.w("AsyncLayoutInflater", e2);
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws InterruptedException {
            while (true) {
                FH();
            }
        }
    }

    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            c cVar = (c) message.obj;
            if (cVar.Hw == null) {
                cVar.Hw = AsyncLayoutInflater.this.j6.inflate(cVar.FH, cVar.DW, false);
            }
            cVar.v5.j6(cVar.Hw, cVar.FH, cVar.DW);
            AsyncLayoutInflater.this.FH.DW(cVar);
            return true;
        }
    }

    private static class b extends LayoutInflater {
        private static final String[] j6 = {"android.widget.", "android.webkit.", "android.app."};

        b(Context context) {
            super(context);
        }

        @Override // android.view.LayoutInflater
        public LayoutInflater cloneInContext(Context context) {
            return new b(context);
        }

        @Override // android.view.LayoutInflater
        protected View onCreateView(String str, AttributeSet attributeSet) throws InflateException, ClassNotFoundException {
            View viewCreateView;
            for (String str2 : j6) {
                try {
                    viewCreateView = createView(str, str2, attributeSet);
                } catch (ClassNotFoundException unused) {
                }
                if (viewCreateView != null) {
                    return viewCreateView;
                }
            }
            return super.onCreateView(str, attributeSet);
        }
    }

    private static class c {
        ViewGroup DW;
        int FH;
        View Hw;
        AsyncLayoutInflater j6;
        e v5;

        c() {
        }
    }

    public interface e {
        void j6(View view, int i, ViewGroup viewGroup);
    }

    public AsyncLayoutInflater(Context context) {
        this.j6 = new b(context);
    }
}
