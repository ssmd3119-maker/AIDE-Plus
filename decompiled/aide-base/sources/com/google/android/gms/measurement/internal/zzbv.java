package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.google.android.gms.common.internal.p;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
public final class zzbv extends Thread {
    private final /* synthetic */ zzbr zzapb;
    private final Object zzape;
    private final BlockingQueue<zzbu<?>> zzapf;

    public zzbv(zzbr zzbrVar, String str, BlockingQueue<zzbu<?>> blockingQueue) {
        this.zzapb = zzbrVar;
        p.u7(str);
        p.u7(blockingQueue);
        this.zzape = new Object();
        this.zzapf = blockingQueue;
        setName(str);
    }

    private final void zza(InterruptedException interruptedException) {
        this.zzapb.zzgt().zzjj().zzg(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws InterruptedException {
        boolean z = false;
        while (!z) {
            try {
                this.zzapb.zzaox.acquire();
                z = true;
            } catch (InterruptedException e) {
                zza(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                zzbu<?> zzbuVarPoll = this.zzapf.poll();
                if (zzbuVarPoll == null) {
                    synchronized (this.zzape) {
                        if (this.zzapf.peek() == null && !this.zzapb.zzaoy) {
                            try {
                                this.zzape.wait(30000L);
                            } catch (InterruptedException e2) {
                                zza(e2);
                            }
                        }
                    }
                    synchronized (this.zzapb.zzaow) {
                        if (this.zzapf.peek() == null) {
                            break;
                        }
                    }
                } else {
                    Process.setThreadPriority(zzbuVarPoll.zzapd ? threadPriority : 10);
                    zzbuVarPoll.run();
                }
            }
            synchronized (this.zzapb.zzaow) {
                this.zzapb.zzaox.release();
                this.zzapb.zzaow.notifyAll();
                if (this == this.zzapb.zzaoq) {
                    zzbr.zza(this.zzapb, null);
                } else if (this == this.zzapb.zzaor) {
                    zzbr.zzb(this.zzapb, null);
                } else {
                    this.zzapb.zzgt().zzjg().zzby("Current scheduler thread is neither worker nor network");
                }
            }
        } catch (Throwable th) {
            synchronized (this.zzapb.zzaow) {
                this.zzapb.zzaox.release();
                this.zzapb.zzaow.notifyAll();
                if (this == this.zzapb.zzaoq) {
                    zzbr.zza(this.zzapb, null);
                } else if (this == this.zzapb.zzaor) {
                    zzbr.zzb(this.zzapb, null);
                } else {
                    this.zzapb.zzgt().zzjg().zzby("Current scheduler thread is neither worker nor network");
                }
                throw th;
            }
        }
    }

    public final void zzki() {
        synchronized (this.zzape) {
            this.zzape.notifyAll();
        }
    }
}
