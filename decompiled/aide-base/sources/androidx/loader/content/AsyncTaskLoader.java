package androidx.loader.content;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.core.content.c;
import androidx.core.util.TimeUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class AsyncTaskLoader<D> extends Loader<D> {
    volatile AsyncTaskLoader<D>.a EQ;
    long J0;
    long J8;
    Handler Ws;
    private final Executor tp;
    volatile AsyncTaskLoader<D>.a we;

    final class a extends c<Void, Void, D> implements Runnable {
        boolean cT;
        private final CountDownLatch hK = new CountDownLatch(1);

        a() {
        }

        @Override // androidx.core.content.c
        protected void J0(D d) {
            try {
                AsyncTaskLoader.this.vy(this, d);
            } finally {
                this.hK.countDown();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.core.content.c
        /* renamed from: aM, reason: merged with bridge method [inline-methods] */
        public D Hw(Void... voidArr) {
            try {
                return (D) AsyncTaskLoader.this.KD();
            } catch (androidx.core.os.c e) {
                if (tp()) {
                    return null;
                }
                throw e;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.cT = false;
            AsyncTaskLoader.this.P8();
        }

        @Override // androidx.core.content.c
        protected void we(D d) {
            try {
                AsyncTaskLoader.this.BT(this, d);
            } finally {
                this.hK.countDown();
            }
        }
    }

    public AsyncTaskLoader(Context context) {
        this(context, c.AL);
    }

    void BT(AsyncTaskLoader<D>.a aVar, D d) {
        SI(d);
        if (this.we == aVar) {
            U2();
            this.J8 = SystemClock.uptimeMillis();
            this.we = null;
            Hw();
            P8();
        }
    }

    @Override // androidx.loader.content.Loader
    protected void J8() {
        super.J8();
        j6();
        this.EQ = new a();
        P8();
    }

    protected D KD() {
        return nw();
    }

    void P8() {
        if (this.we != null || this.EQ == null) {
            return;
        }
        if (this.EQ.cT) {
            this.EQ.cT = false;
            this.Ws.removeCallbacks(this.EQ);
        }
        if (this.J0 <= 0 || SystemClock.uptimeMillis() >= this.J8 + this.J0) {
            this.EQ.VH(this.tp, null);
        } else {
            this.EQ.cT = true;
            this.Ws.postAtTime(this.EQ, this.J8 + this.J0);
        }
    }

    public void SI(D d) {
    }

    @Override // androidx.loader.content.Loader
    public void Zo(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.Zo(str, fileDescriptor, printWriter, strArr);
        if (this.EQ != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.EQ);
            printWriter.print(" waiting=");
            printWriter.println(this.EQ.cT);
        }
        if (this.we != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.we);
            printWriter.print(" waiting=");
            printWriter.println(this.we.cT);
        }
        if (this.J0 != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            TimeUtils.FH(this.J0, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            TimeUtils.DW(this.J8, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    public boolean ei() {
        return this.we != null;
    }

    public void gW() {
    }

    public abstract D nw();

    void vy(AsyncTaskLoader<D>.a aVar, D d) {
        if (this.EQ != aVar) {
            BT(aVar, d);
            return;
        }
        if (u7()) {
            SI(d);
            return;
        }
        DW();
        this.J8 = SystemClock.uptimeMillis();
        this.EQ = null;
        v5(d);
    }

    @Override // androidx.loader.content.Loader
    protected boolean we() {
        if (this.EQ == null) {
            return false;
        }
        if (!this.v5) {
            this.gn = true;
        }
        if (this.we != null) {
            if (this.EQ.cT) {
                this.EQ.cT = false;
                this.Ws.removeCallbacks(this.EQ);
            }
            this.EQ = null;
            return false;
        }
        if (this.EQ.cT) {
            this.EQ.cT = false;
            this.Ws.removeCallbacks(this.EQ);
            this.EQ = null;
            return false;
        }
        boolean zFH = this.EQ.FH(false);
        if (zFH) {
            this.we = this.EQ;
            gW();
        }
        this.EQ = null;
        return zFH;
    }

    private AsyncTaskLoader(Context context, Executor executor) {
        super(context);
        this.J8 = -10000L;
        this.tp = executor;
    }
}
