package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@jg
/* loaded from: classes.dex */
public final class jq {
    public static <A, B> vq<B> DW(final vq<A> vqVar, final eq<? super A, ? extends B> eqVar, Executor executor) {
        final fr frVar = new fr();
        vqVar.DW(new Runnable(frVar, eqVar, vqVar) { // from class: com.google.android.gms.internal.ads.mq
            private final fr WB;
            private final vq jw;
            private final eq mb;

            {
                this.WB = frVar;
                this.mb = eqVar;
                this.jw = vqVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                jq.tp(this.WB, this.mb, this.jw);
            }
        }, executor);
        u7(frVar, vqVar);
        return frVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static final /* synthetic */ void EQ(com.google.android.gms.internal.ads.fr r1, com.google.android.gms.internal.ads.vq r2, java.lang.Class r3, com.google.android.gms.internal.ads.eq r4, java.util.concurrent.Executor r5) {
        /*
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Exception -> L8 java.lang.InterruptedException -> La java.util.concurrent.ExecutionException -> L13
            r1.FH(r2)     // Catch: java.lang.Exception -> L8 java.lang.InterruptedException -> La java.util.concurrent.ExecutionException -> L13
            return
        L8:
            r2 = move-exception
            goto L18
        La:
            r2 = move-exception
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L18
        L13:
            r2 = move-exception
            java.lang.Throwable r2 = r2.getCause()
        L18:
            boolean r3 = r3.isInstance(r2)
            if (r3 == 0) goto L2a
            com.google.android.gms.internal.ads.uq r2 = J0(r2)
            com.google.android.gms.internal.ads.vq r2 = DW(r2, r4, r5)
            gn(r2, r1)
            return
        L2a:
            r1.Hw(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.jq.EQ(com.google.android.gms.internal.ads.fr, com.google.android.gms.internal.ads.vq, java.lang.Class, com.google.android.gms.internal.ads.eq, java.util.concurrent.Executor):void");
    }

    public static <A, B> vq<B> FH(final vq<A> vqVar, final fq<A, B> fqVar, Executor executor) {
        final fr frVar = new fr();
        vqVar.DW(new Runnable(frVar, fqVar, vqVar) { // from class: com.google.android.gms.internal.ads.lq
            private final fr WB;
            private final vq jw;
            private final fq mb;

            {
                this.WB = frVar;
                this.mb = fqVar;
                this.jw = vqVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                fr frVar2 = this.WB;
                try {
                    frVar2.FH(this.mb.j6(this.jw.get()));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    frVar2.Hw(e);
                } catch (CancellationException unused) {
                    frVar2.cancel(true);
                } catch (ExecutionException e2) {
                    e = e2;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    frVar2.Hw(e);
                } catch (Exception e3) {
                    frVar2.Hw(e3);
                }
            }
        }, executor);
        u7(frVar, vqVar);
        return frVar;
    }

    public static <V, X extends Throwable> vq<V> Hw(final vq<? extends V> vqVar, final Class<X> cls, final eq<? super X, ? extends V> eqVar, final Executor executor) {
        final fr frVar = new fr();
        u7(frVar, vqVar);
        vqVar.DW(new Runnable(frVar, vqVar, cls, eqVar, executor) { // from class: com.google.android.gms.internal.ads.pq
            private final fr WB;
            private final eq fY;
            private final Class jw;
            private final vq mb;
            private final Executor qp;

            {
                this.WB = frVar;
                this.mb = vqVar;
                this.jw = cls;
                this.fY = eqVar;
                this.qp = executor;
            }

            @Override // java.lang.Runnable
            public final void run() {
                jq.EQ(this.WB, this.mb, this.jw, this.fY, this.qp);
            }
        }, ar.DW);
        return frVar;
    }

    public static <T> uq<T> J0(T t) {
        return new uq<>(t);
    }

    public static <V> void VH(final vq<V> vqVar, final gq<V> gqVar, Executor executor) {
        vqVar.DW(new Runnable(gqVar, vqVar) { // from class: com.google.android.gms.internal.ads.kq
            private final gq WB;
            private final vq mb;

            {
                this.WB = gqVar;
                this.mb = vqVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                gq gqVar2 = this.WB;
                try {
                    gqVar2.DW(this.mb.get());
                } catch (InterruptedException e) {
                    e = e;
                    Thread.currentThread().interrupt();
                    gqVar2.j6(e);
                } catch (ExecutionException e2) {
                    e = e2.getCause();
                    gqVar2.j6(e);
                } catch (Exception e3) {
                    e = e3;
                    gqVar2.j6(e);
                }
            }
        }, executor);
    }

    public static <T> T Zo(Future<T> future, T t, long j, TimeUnit timeUnit) {
        try {
            return future.get(j, timeUnit);
        } catch (InterruptedException e) {
            future.cancel(true);
            xp.v5("InterruptedException caught while resolving future.", e);
            Thread.currentThread().interrupt();
            com.google.android.gms.ads.internal.w0.u7().u7(e, "Futures.resolveFuture");
            return t;
        } catch (Exception e2) {
            future.cancel(true);
            xp.Hw("Error waiting for future.", e2);
            com.google.android.gms.ads.internal.w0.u7().u7(e2, "Futures.resolveFuture");
            return t;
        }
    }

    private static <V> void gn(final vq<? extends V> vqVar, final fr<V> frVar) {
        u7(frVar, vqVar);
        vqVar.DW(new Runnable(frVar, vqVar) { // from class: com.google.android.gms.internal.ads.qq
            private final fr WB;
            private final vq mb;

            {
                this.WB = frVar;
                this.mb = vqVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                fr frVar2 = this.WB;
                try {
                    frVar2.FH(this.mb.get());
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    frVar2.Hw(e);
                } catch (ExecutionException e2) {
                    frVar2.Hw(e2.getCause());
                } catch (Exception e3) {
                    frVar2.Hw(e3);
                }
            }
        }, ar.DW);
    }

    public static <V> vq<V> j6(vq<V> vqVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        final fr frVar = new fr();
        u7(frVar, vqVar);
        final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable(frVar) { // from class: com.google.android.gms.internal.ads.nq
            private final fr WB;

            {
                this.WB = frVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.WB.Hw(new TimeoutException());
            }
        }, j, timeUnit);
        gn(vqVar, frVar);
        frVar.DW(new Runnable(scheduledFutureSchedule) { // from class: com.google.android.gms.internal.ads.oq
            private final Future WB;

            {
                this.WB = scheduledFutureSchedule;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Future future = this.WB;
                if (future.isDone()) {
                    return;
                }
                future.cancel(true);
            }
        }, ar.DW);
        return frVar;
    }

    static final /* synthetic */ void tp(fr frVar, eq eqVar, vq vqVar) {
        if (frVar.isCancelled()) {
            return;
        }
        try {
            gn(eqVar.j6(vqVar.get()), frVar);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            frVar.Hw(e);
        } catch (CancellationException unused) {
            frVar.cancel(true);
        } catch (ExecutionException e2) {
            frVar.Hw(e2.getCause());
        } catch (Exception e3) {
            frVar.Hw(e3);
        }
    }

    private static <A, B> void u7(final vq<A> vqVar, final Future<B> future) {
        vqVar.DW(new Runnable(vqVar, future) { // from class: com.google.android.gms.internal.ads.rq
            private final vq WB;
            private final Future mb;

            {
                this.WB = vqVar;
                this.mb = future;
            }

            @Override // java.lang.Runnable
            public final void run() {
                vq vqVar2 = this.WB;
                Future future2 = this.mb;
                if (vqVar2.isCancelled()) {
                    future2.cancel(true);
                }
            }
        }, ar.DW);
    }

    public static <T> T v5(Future<T> future, T t) {
        try {
            return future.get(((Long) cw0.v5().FH(p.sM)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            future.cancel(true);
            xp.v5("InterruptedException caught while resolving future.", e);
            Thread.currentThread().interrupt();
            com.google.android.gms.ads.internal.w0.u7().u7(e, "Futures.resolveFuture");
            return t;
        } catch (Exception e2) {
            future.cancel(true);
            xp.Hw("Error waiting for future.", e2);
            com.google.android.gms.ads.internal.w0.u7().u7(e2, "Futures.resolveFuture");
            return t;
        }
    }

    public static <T> sq<T> we(Throwable th) {
        return new sq<>(th);
    }
}
