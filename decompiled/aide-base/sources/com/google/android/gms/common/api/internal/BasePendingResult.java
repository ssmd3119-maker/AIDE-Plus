package com.google.android.gms.common.api.internal;

import abcd.jv;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends com.google.android.gms.common.api.j> extends com.google.android.gms.common.api.h<R> {
    private boolean EQ;
    private R VH;
    private Status gn;

    @KeepName
    private b mResultGuardian;
    private boolean tp;
    private volatile boolean u7;
    private com.google.android.gms.common.api.k<? super R> v5;
    private final Object j6 = new Object();
    private final CountDownLatch FH = new CountDownLatch(1);
    private final ArrayList<h.a> Hw = new ArrayList<>();
    private final AtomicReference<b0> Zo = new AtomicReference<>();
    private final a<R> DW = new a<>(Looper.getMainLooper());

    public static class a<R extends com.google.android.gms.common.api.j> extends jv {
        public a(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    ((BasePendingResult) message.obj).gn(Status.k2);
                    return;
                }
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
                return;
            }
            Pair pair = (Pair) message.obj;
            com.google.android.gms.common.api.k kVar = (com.google.android.gms.common.api.k) pair.first;
            com.google.android.gms.common.api.j jVar = (com.google.android.gms.common.api.j) pair.second;
            try {
                kVar.j6(jVar);
            } catch (RuntimeException e) {
                BasePendingResult.VH(jVar);
                throw e;
            }
        }

        public final void j6(com.google.android.gms.common.api.k<? super R> kVar, R r) {
            sendMessage(obtainMessage(1, new Pair(kVar, r)));
        }
    }

    private final class b {
        private b() {
        }

        protected final void finalize() throws Throwable {
            BasePendingResult.VH(BasePendingResult.this.VH);
            super.finalize();
        }

        /* synthetic */ b(BasePendingResult basePendingResult, h0 h0Var) {
            this();
        }
    }

    static {
        new h0();
    }

    @Deprecated
    BasePendingResult() {
        new WeakReference(null);
    }

    private final R DW() {
        R r;
        synchronized (this.j6) {
            com.google.android.gms.common.internal.p.J0(!this.u7, "Result has already been consumed.");
            com.google.android.gms.common.internal.p.J0(FH(), "Result is not ready.");
            r = this.VH;
            this.VH = null;
            this.v5 = null;
            this.u7 = true;
        }
        b0 andSet = this.Zo.getAndSet(null);
        if (andSet != null) {
            andSet.j6(this);
        }
        return r;
    }

    public static void VH(com.google.android.gms.common.api.j jVar) {
        if (jVar instanceof com.google.android.gms.common.api.i) {
            try {
                ((com.google.android.gms.common.api.i) jVar).j6();
            } catch (RuntimeException e) {
                String strValueOf = String.valueOf(jVar);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(strValueOf);
                Log.w("BasePendingResult", sb.toString(), e);
            }
        }
    }

    private final void Zo(R r) {
        this.VH = r;
        this.FH.countDown();
        this.gn = this.VH.Hw();
        h0 h0Var = null;
        if (this.tp) {
            this.v5 = null;
        } else if (this.v5 != null) {
            this.DW.removeMessages(2);
            this.DW.j6(this.v5, DW());
        } else if (this.VH instanceof com.google.android.gms.common.api.i) {
            this.mResultGuardian = new b(this, h0Var);
        }
        ArrayList<h.a> arrayList = this.Hw;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            h.a aVar = arrayList.get(i);
            i++;
            aVar.j6(this.gn);
        }
        this.Hw.clear();
    }

    public final boolean FH() {
        return this.FH.getCount() == 0;
    }

    public final void Hw(R r) {
        synchronized (this.j6) {
            if (this.EQ || this.tp) {
                VH(r);
                return;
            }
            FH();
            boolean z = true;
            com.google.android.gms.common.internal.p.J0(!FH(), "Results have already been set");
            if (this.u7) {
                z = false;
            }
            com.google.android.gms.common.internal.p.J0(z, "Result has already been consumed");
            Zo(r);
        }
    }

    public final void gn(Status status) {
        synchronized (this.j6) {
            if (!FH()) {
                Hw(j6(status));
                this.EQ = true;
            }
        }
    }

    protected abstract R j6(Status status);
}
