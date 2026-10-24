package org.codehaus.groovy.util;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class ReferenceManager {
    private ReferenceQueue j6;

    private static class ThreadedReferenceManager extends ReferenceManager {
        private final Thread DW;
        private volatile boolean FH;

        /* renamed from: org.codehaus.groovy.util.ReferenceManager$ThreadedReferenceManager$1, reason: invalid class name */
        public class AnonymousClass1 extends Thread {
            final /* synthetic */ ThreadedReferenceManager WB;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() throws InterruptedException, IllegalArgumentException {
                Finalizable handler;
                ReferenceQueue referenceQueueV5 = this.WB.v5();
                while (this.WB.FH) {
                    try {
                        java.lang.ref.Reference referenceRemove = referenceQueueV5.remove(1000L);
                        if (referenceRemove != 0) {
                            if ((referenceRemove instanceof Reference) && (handler = ((Reference) referenceRemove).getHandler()) != null) {
                                handler.DW();
                            }
                            referenceRemove.clear();
                        }
                    } catch (InterruptedException unused) {
                        return;
                    }
                }
            }
        }

        @Override // org.codehaus.groovy.util.ReferenceManager
        public String toString() {
            return "ReferenceManager(threaded, thread=" + this.DW + ")";
        }
    }

    static {
        ReferenceQueue referenceQueue = new ReferenceQueue();
        Hw(referenceQueue, DW(referenceQueue), 500);
        ReferenceType referenceType = ReferenceType.SOFT;
        ReferenceType referenceType2 = ReferenceType.WEAK;
    }

    public ReferenceManager(ReferenceQueue referenceQueue) {
        this.j6 = referenceQueue;
    }

    public static ReferenceManager DW(ReferenceQueue referenceQueue) {
        return new ReferenceManager(referenceQueue) { // from class: org.codehaus.groovy.util.ReferenceManager.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // org.codehaus.groovy.util.ReferenceManager
            public void Zo() {
                Finalizable handler;
                ReferenceQueue referenceQueueV5 = v5();
                while (true) {
                    java.lang.ref.Reference referencePoll = referenceQueueV5.poll();
                    if (referencePoll == 0) {
                        return;
                    }
                    if ((referencePoll instanceof Reference) && (handler = ((Reference) referencePoll).getHandler()) != null) {
                        handler.DW();
                    }
                    referencePoll.clear();
                }
            }

            @Override // org.codehaus.groovy.util.ReferenceManager
            public void j6(Reference reference) {
                Zo();
            }

            @Override // org.codehaus.groovy.util.ReferenceManager
            public String toString() {
                return "ReferenceManager(callback)";
            }
        };
    }

    public static ReferenceManager FH(ReferenceQueue referenceQueue) {
        return new ReferenceManager(referenceQueue);
    }

    public static ReferenceManager Hw(final ReferenceQueue referenceQueue, final ReferenceManager referenceManager, final int i) {
        if (i >= 0) {
            return new ReferenceManager(referenceQueue) { // from class: org.codehaus.groovy.util.ReferenceManager.2
                private AtomicInteger DW = new AtomicInteger();
                private volatile ReferenceManager FH;

                {
                    this.FH = ReferenceManager.FH(referenceQueue);
                }

                @Override // org.codehaus.groovy.util.ReferenceManager
                public void j6(Reference reference) {
                    ReferenceManager referenceManager2 = this.FH;
                    ReferenceManager referenceManager3 = referenceManager;
                    if (referenceManager2 == referenceManager3) {
                        referenceManager3.j6(reference);
                        return;
                    }
                    int iIncrementAndGet = this.DW.incrementAndGet();
                    if (iIncrementAndGet > i || iIncrementAndGet < 0) {
                        this.FH = referenceManager;
                    }
                }

                @Override // org.codehaus.groovy.util.ReferenceManager
                public String toString() {
                    return "ReferenceManager(thresholded, current manager=" + this.FH + ", threshold=" + this.DW.get() + "/" + i + ")";
                }
            };
        }
        throw new IllegalArgumentException("threshold must not be below 0.");
    }

    public void Zo() {
    }

    public void j6(Reference reference) {
    }

    public String toString() {
        return "ReferenceManager(idling)";
    }

    protected ReferenceQueue v5() {
        return this.j6;
    }
}
