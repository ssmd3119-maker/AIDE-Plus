package abcd;

import abcd.yz;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class iz implements fz {
    private static final gz EQ = new gz();
    private final ReentrantLock Hw;
    private final Condition Zo;
    private wz tp;
    private final Condition v5;
    private AtomicBoolean VH = new AtomicBoolean(false);
    private AtomicLong gn = new AtomicLong(-1);
    private Object u7 = new Object();
    private final BlockingQueue<gz> j6 = new LinkedBlockingQueue();
    private final Object DW = new Object();
    private final Object FH = new Object();

    class a implements FilenameFilter {
        public a(iz izVar) {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.endsWith(".json");
        }
    }

    class b implements Runnable {
        public b() {
        }

        /* JADX WARN: Removed duplicated region for block: B:111:0x0124 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:115:? A[LOOP:1: B:17:0x007c->B:115:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00f6 A[Catch: all -> 0x0197, TryCatch #3 {all -> 0x0197, blocks: (B:16:0x0075, B:17:0x007c, B:19:0x0082, B:21:0x008b, B:40:0x012b, B:24:0x00ad, B:25:0x00c9, B:27:0x00db, B:28:0x00e3, B:29:0x00e6, B:30:0x00f0, B:32:0x00f6, B:34:0x0103, B:36:0x011b, B:37:0x011e, B:39:0x0124), top: B:85:0x0075, outer: #1 }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() throws java.lang.InterruptedException {
            /*
                Method dump skipped, instructions count: 463
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: abcd.iz.b.run():void");
        }
    }

    class c implements Runnable {
        final /* synthetic */ String jw;
        private int WB = 4000;
        private Random mb = new Random();

        public c(String str) {
            this.jw = str;
        }

        private void j6() {
            b00.j6("Networking", "Sleeping for " + (this.WB / 1000) + " seconds.");
            try {
                synchronized (iz.this.FH) {
                    iz.this.FH.wait(this.WB + this.mb.nextInt(1000));
                }
            } catch (InterruptedException e) {
                b00.DW("Networking", "Unexpected InterruptedException", e);
            }
            int i = this.WB;
            if (i < 128000) {
                this.WB = i * 2;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:63:0x01a4, code lost:
        
            abcd.b00.j6("Networking", "HTTP GONE encountered: exiting thread.");
            r14.fY.VH.set(true);
            r1 = abcd.d00.DW(abcd.iy.DW(), r14.jw);
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x01be, code lost:
        
            if (r1 == null) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x01c0, code lost:
        
            new java.io.FileOutputStream(r1).close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x01c9, code lost:
        
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x01ca, code lost:
        
            abcd.b00.VH("Could not write gone file", r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x01d0, code lost:
        
            abcd.b00.VH("Could not calculate gone file path", new java.lang.Exception());
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 722
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: abcd.iz.c.run():void");
        }
    }

    class d implements yz.b {
        public d() {
        }

        @Override // abcd.yz.b
        public void j6(boolean z) {
            if (z) {
                b00.j6("Networking", "Network became available - notifying networking thread...");
                synchronized (iz.this.FH) {
                    iz.this.FH.notify();
                }
            }
        }
    }

    public iz() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.Hw = reentrantLock;
        this.v5 = reentrantLock.newCondition();
        this.Zo = this.Hw.newCondition();
        this.tp = new wz(a8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File Mr() {
        return new File(U2(), "networking.lock");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File U2() {
        return d00.v5(iy.DW(), "logfiles-outgoing");
    }

    private File a8() {
        return new File(U2(), "throttle");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File aM() {
        return new File(d00.v5(iy.DW(), "logfiles-tmp"), UUID.randomUUID().toString() + ".json");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File[] j3() {
        File[] fileArrListFiles = U2().listFiles(new a(this));
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return new File[0];
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(fileArrListFiles[0]);
        long length = fileArrListFiles[0].length();
        for (int i = 1; i < fileArrListFiles.length; i++) {
            File file = fileArrListFiles[i];
            length += file.length();
            if (length > 8000000) {
                break;
            }
            arrayList.add(file);
        }
        File[] fileArr = new File[arrayList.size()];
        arrayList.toArray(fileArr);
        return fileArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean lg() {
        if (this.gn.get() == -1) {
            synchronized (this.u7) {
                if (this.gn.get() == -1) {
                    String strDW = this.tp.DW();
                    if (strDW == null || strDW.length() == 0) {
                        this.gn.set(0L);
                    } else {
                        try {
                            this.gn.set(Long.parseLong(strDW));
                        } catch (NumberFormatException unused) {
                            this.gn.set(0L);
                        }
                    }
                }
            }
        }
        return System.currentTimeMillis() < this.gn.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rN(long j) {
        long jCurrentTimeMillis = System.currentTimeMillis() + (j * 1000);
        this.gn.set(jCurrentTimeMillis);
        this.tp.v5(Long.toString(jCurrentTimeMillis));
    }

    @Override // abcd.fz
    public void DW(gz gzVar) {
        if (this.VH.get() || lg()) {
            return;
        }
        this.j6.add(gzVar);
    }

    @Override // abcd.fz
    public boolean FH(long j) {
        try {
            try {
                this.Hw.lock();
                this.j6.add(EQ);
                if (j > 0) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    b00.j6("Flush", "Waiting for all events written to disk.");
                    if (this.v5.await(j, TimeUnit.MILLISECONDS)) {
                        long jCurrentTimeMillis2 = j - (System.currentTimeMillis() - jCurrentTimeMillis);
                        if (jCurrentTimeMillis2 > 0) {
                            b00.j6("Flush", "Waiting for all files reported.");
                            return this.Zo.await(jCurrentTimeMillis2, TimeUnit.MILLISECONDS);
                        }
                    }
                }
            } catch (InterruptedException e) {
                b00.DW("Flush", "Unexpected InterruptedException", e);
            }
            return false;
        } finally {
            this.Hw.unlock();
        }
    }

    @Override // abcd.fz
    public void j6(String str) {
        new Thread(new b(), "probelytics disk writer").start();
        new Thread(new c(str), "probelytics networking").start();
        yz.j6(new d());
    }
}
