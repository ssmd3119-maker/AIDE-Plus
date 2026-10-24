package abcd;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@cy(clazz = -5925735092384612688L, container = -5925735092384612688L, user = true)
/* loaded from: classes.dex */
public class vf {

    @fy
    private static /* synthetic */ boolean QX;

    @gy
    private static /* synthetic */ boolean XL;

    @dy(field = 2102366761741371545L)
    private Map<String, String> DW;

    @dy(field = 3813042126725828867L)
    private InputStream EQ;

    @dy(field = 2107521290881278608L)
    private OutputStream FH;

    @dy(field = 2102827008898223361L)
    private OutputStream Hw;

    @dy(field = 3099757286347884348L)
    private d.a J0;

    @dy(field = 3659560740905938544L)
    private File J8;

    @dy(field = 4381688251359547947L)
    private int VH;

    @dy(field = 222346186673031072L)
    private boolean Ws;

    @dy(field = 386087446644809556L)
    private boolean Zo;

    @dy(field = 3284655062178565621L)
    private boolean gn;

    @dy(field = -3398941837127793152L)
    private String[] j6;

    @dy(field = -313308225846080335L)
    private Process tp;

    @dy(field = 2693602259610103341L)
    private int u7;

    @dy(field = -2544882255373434327L)
    private Object v5;

    @dy(field = 3807907387294438264L)
    private InputStream we;

    @cy(clazz = -3471693816017974185L, container = -5925735092384612688L, user = true)
    class a extends Thread {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 98090605874541280L)
        public a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        @ey(method = 1232421720753091416L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(-4719406164269163991L, this);
                }
                try {
                    try {
                        vf.this.tp.waitFor();
                        vf.this.u7 = vf.this.tp.exitValue();
                    } catch (InterruptedException unused) {
                    }
                    synchronized (vf.this) {
                        vf.v5(vf.this);
                        if (vf.this.VH <= 0) {
                            vf.this.notifyAll();
                            try {
                                vf.this.J0.j6();
                            } catch (IOException unused2) {
                            }
                        }
                    }
                } catch (Throwable unused3) {
                }
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, -4719406164269163991L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -3471751321666830100L, container = -5925735092384612688L, user = true)
    class b extends Thread {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(b.class);
        }

        @ey(method = -38583187799905756L)
        public b(String str) {
            super(str);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        
            if (r4.WB.FH == null) goto L81;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
        
            r4.WB.FH.write(r0);
         */
        @Override // java.lang.Thread, java.lang.Runnable
        @abcd.ey(method = -683558885977978496L)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r4 = this;
                r0 = -4717426943430638892(0xbe8855305ef5c2d4, double:-1.8129325905391806E-7)
                boolean r2 = abcd.vf.b.mb     // Catch: java.lang.Throwable -> La6
                if (r2 == 0) goto Lc
                abcd.iy.gn(r0, r4)     // Catch: java.lang.Throwable -> La6
            Lc:
                abcd.vf r0 = abcd.vf.this     // Catch: java.lang.Throwable -> La5
                java.io.InputStream r0 = abcd.vf.VH(r0)     // Catch: java.lang.Throwable -> La5
                if (r0 == 0) goto L82
                abcd.vf r0 = abcd.vf.this     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L77
                java.io.InputStream r0 = abcd.vf.VH(r0)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L77
                int r0 = r0.read()     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L77
            L1e:
                r1 = -1
                if (r0 == r1) goto L52
                abcd.vf r1 = abcd.vf.this     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L77
                java.lang.Object r1 = abcd.vf.gn(r1)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L77
                monitor-enter(r1)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L77
                abcd.vf r2 = abcd.vf.this     // Catch: java.lang.Throwable -> L4f
                boolean r2 = abcd.vf.u7(r2)     // Catch: java.lang.Throwable -> L4f
                if (r2 == 0) goto L32
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L4f
                goto L52
            L32:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L4f
                abcd.vf r1 = abcd.vf.this     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L77
                java.io.OutputStream r1 = abcd.vf.tp(r1)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L77
                if (r1 == 0) goto L44
                abcd.vf r1 = abcd.vf.this     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L77
                java.io.OutputStream r1 = abcd.vf.tp(r1)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L77
                r1.write(r0)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L77
            L44:
                abcd.vf r0 = abcd.vf.this     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L77
                java.io.InputStream r0 = abcd.vf.VH(r0)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L77
                int r0 = r0.read()     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L77
                goto L1e
            L4f:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L4f
                throw r0     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L77
            L52:
                abcd.vf r0 = abcd.vf.this     // Catch: java.io.IOException -> L82 java.lang.Throwable -> La5
                java.io.OutputStream r0 = abcd.vf.tp(r0)     // Catch: java.io.IOException -> L82 java.lang.Throwable -> La5
                if (r0 == 0) goto L82
                abcd.vf r0 = abcd.vf.this     // Catch: java.io.IOException -> L82 java.lang.Throwable -> La5
            L5c:
                java.io.OutputStream r0 = abcd.vf.tp(r0)     // Catch: java.io.IOException -> L82 java.lang.Throwable -> La5
                r0.close()     // Catch: java.io.IOException -> L82 java.lang.Throwable -> La5
                goto L82
            L64:
                r0 = move-exception
                abcd.vf r1 = abcd.vf.this     // Catch: java.io.IOException -> L76 java.lang.Throwable -> La5
                java.io.OutputStream r1 = abcd.vf.tp(r1)     // Catch: java.io.IOException -> L76 java.lang.Throwable -> La5
                if (r1 == 0) goto L76
                abcd.vf r1 = abcd.vf.this     // Catch: java.io.IOException -> L76 java.lang.Throwable -> La5
                java.io.OutputStream r1 = abcd.vf.tp(r1)     // Catch: java.io.IOException -> L76 java.lang.Throwable -> La5
                r1.close()     // Catch: java.io.IOException -> L76 java.lang.Throwable -> La5
            L76:
                throw r0     // Catch: java.lang.Throwable -> La5
            L77:
                abcd.vf r0 = abcd.vf.this     // Catch: java.io.IOException -> L82 java.lang.Throwable -> La5
                java.io.OutputStream r0 = abcd.vf.tp(r0)     // Catch: java.io.IOException -> L82 java.lang.Throwable -> La5
                if (r0 == 0) goto L82
                abcd.vf r0 = abcd.vf.this     // Catch: java.io.IOException -> L82 java.lang.Throwable -> La5
                goto L5c
            L82:
                abcd.vf r0 = abcd.vf.this     // Catch: java.lang.Throwable -> La5
                monitor-enter(r0)     // Catch: java.lang.Throwable -> La5
                abcd.vf r1 = abcd.vf.this     // Catch: java.lang.Throwable -> La2
                abcd.vf.v5(r1)     // Catch: java.lang.Throwable -> La2
                abcd.vf r1 = abcd.vf.this     // Catch: java.lang.Throwable -> La2
                int r1 = abcd.vf.Hw(r1)     // Catch: java.lang.Throwable -> La2
                if (r1 > 0) goto La0
                abcd.vf r1 = abcd.vf.this     // Catch: java.lang.Throwable -> La2
                r1.notifyAll()     // Catch: java.lang.Throwable -> La2
                abcd.vf r1 = abcd.vf.this     // Catch: java.io.IOException -> La0 java.lang.Throwable -> La2
                abcd.vf$d$a r1 = abcd.vf.Zo(r1)     // Catch: java.io.IOException -> La0 java.lang.Throwable -> La2
                r1.j6()     // Catch: java.io.IOException -> La0 java.lang.Throwable -> La2
            La0:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> La2
                goto La5
            La2:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> La2
                throw r1     // Catch: java.lang.Throwable -> La5
            La5:
                return
            La6:
                r2 = move-exception
                boolean r3 = abcd.vf.b.jw
                if (r3 == 0) goto Lae
                abcd.iy.aM(r2, r0, r4)
            Lae:
                goto Lb0
            Laf:
                throw r2
            Lb0:
                goto Laf
            */
            throw new UnsupportedOperationException("Method not decompiled: abcd.vf.b.run():void");
        }
    }

    @cy(clazz = -3471808827311622721L, container = -5925735092384612688L, user = true)
    class c extends Thread {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(c.class);
        }

        @ey(method = 57798806913550760L)
        public c(String str) {
            super(str);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        
            if (r4.WB.Hw == null) goto L81;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
        
            r4.WB.Hw.write(r0);
         */
        @Override // java.lang.Thread, java.lang.Runnable
        @abcd.ey(method = 2207326315806221720L)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r4 = this;
                r0 = -4715447238399288703(0xbe8f5db85e1d1a81, double:-2.33695614910128E-7)
                boolean r2 = abcd.vf.c.mb     // Catch: java.lang.Throwable -> La6
                if (r2 == 0) goto Lc
                abcd.iy.gn(r0, r4)     // Catch: java.lang.Throwable -> La6
            Lc:
                abcd.vf r0 = abcd.vf.this     // Catch: java.lang.Throwable -> La5
                java.io.InputStream r0 = abcd.vf.EQ(r0)     // Catch: java.lang.Throwable -> La5
                if (r0 == 0) goto L82
                abcd.vf r0 = abcd.vf.this     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L77
                java.io.InputStream r0 = abcd.vf.EQ(r0)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L77
                int r0 = r0.read()     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L77
            L1e:
                r1 = -1
                if (r0 == r1) goto L52
                abcd.vf r1 = abcd.vf.this     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L77
                java.lang.Object r1 = abcd.vf.gn(r1)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L77
                monitor-enter(r1)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L77
                abcd.vf r2 = abcd.vf.this     // Catch: java.lang.Throwable -> L4f
                boolean r2 = abcd.vf.u7(r2)     // Catch: java.lang.Throwable -> L4f
                if (r2 == 0) goto L32
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L4f
                goto L52
            L32:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L4f
                abcd.vf r1 = abcd.vf.this     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L77
                java.io.OutputStream r1 = abcd.vf.we(r1)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L77
                if (r1 == 0) goto L44
                abcd.vf r1 = abcd.vf.this     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L77
                java.io.OutputStream r1 = abcd.vf.we(r1)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L77
                r1.write(r0)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L77
            L44:
                abcd.vf r0 = abcd.vf.this     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L77
                java.io.InputStream r0 = abcd.vf.EQ(r0)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L77
                int r0 = r0.read()     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L77
                goto L1e
            L4f:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L4f
                throw r0     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L77
            L52:
                abcd.vf r0 = abcd.vf.this     // Catch: java.io.IOException -> L82 java.lang.Throwable -> La5
                java.io.OutputStream r0 = abcd.vf.we(r0)     // Catch: java.io.IOException -> L82 java.lang.Throwable -> La5
                if (r0 == 0) goto L82
                abcd.vf r0 = abcd.vf.this     // Catch: java.io.IOException -> L82 java.lang.Throwable -> La5
            L5c:
                java.io.OutputStream r0 = abcd.vf.we(r0)     // Catch: java.io.IOException -> L82 java.lang.Throwable -> La5
                r0.close()     // Catch: java.io.IOException -> L82 java.lang.Throwable -> La5
                goto L82
            L64:
                r0 = move-exception
                abcd.vf r1 = abcd.vf.this     // Catch: java.io.IOException -> L76 java.lang.Throwable -> La5
                java.io.OutputStream r1 = abcd.vf.we(r1)     // Catch: java.io.IOException -> L76 java.lang.Throwable -> La5
                if (r1 == 0) goto L76
                abcd.vf r1 = abcd.vf.this     // Catch: java.io.IOException -> L76 java.lang.Throwable -> La5
                java.io.OutputStream r1 = abcd.vf.we(r1)     // Catch: java.io.IOException -> L76 java.lang.Throwable -> La5
                r1.close()     // Catch: java.io.IOException -> L76 java.lang.Throwable -> La5
            L76:
                throw r0     // Catch: java.lang.Throwable -> La5
            L77:
                abcd.vf r0 = abcd.vf.this     // Catch: java.io.IOException -> L82 java.lang.Throwable -> La5
                java.io.OutputStream r0 = abcd.vf.we(r0)     // Catch: java.io.IOException -> L82 java.lang.Throwable -> La5
                if (r0 == 0) goto L82
                abcd.vf r0 = abcd.vf.this     // Catch: java.io.IOException -> L82 java.lang.Throwable -> La5
                goto L5c
            L82:
                abcd.vf r0 = abcd.vf.this     // Catch: java.lang.Throwable -> La5
                monitor-enter(r0)     // Catch: java.lang.Throwable -> La5
                abcd.vf r1 = abcd.vf.this     // Catch: java.lang.Throwable -> La2
                abcd.vf.v5(r1)     // Catch: java.lang.Throwable -> La2
                abcd.vf r1 = abcd.vf.this     // Catch: java.lang.Throwable -> La2
                int r1 = abcd.vf.Hw(r1)     // Catch: java.lang.Throwable -> La2
                if (r1 > 0) goto La0
                abcd.vf r1 = abcd.vf.this     // Catch: java.lang.Throwable -> La2
                r1.notifyAll()     // Catch: java.lang.Throwable -> La2
                abcd.vf r1 = abcd.vf.this     // Catch: java.io.IOException -> La0 java.lang.Throwable -> La2
                abcd.vf$d$a r1 = abcd.vf.Zo(r1)     // Catch: java.io.IOException -> La0 java.lang.Throwable -> La2
                r1.j6()     // Catch: java.io.IOException -> La0 java.lang.Throwable -> La2
            La0:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> La2
                goto La5
            La2:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> La2
                throw r1     // Catch: java.lang.Throwable -> La5
            La5:
                return
            La6:
                r2 = move-exception
                boolean r3 = abcd.vf.c.jw
                if (r3 == 0) goto Lae
                abcd.iy.aM(r2, r0, r4)
            Lae:
                goto Lb0
            Laf:
                throw r2
            Lb0:
                goto Laf
            */
            throw new UnsupportedOperationException("Method not decompiled: abcd.vf.c.run():void");
        }
    }

    @cy(clazz = -1858495198310079361L, container = -1858495198310079361L, user = true)
    private class d extends Thread {

        @gy
        private static /* synthetic */ boolean cT;

        @fy
        private static /* synthetic */ boolean hK;

        @dy(field = 827342162842641501L)
        private boolean AL;

        @dy(field = -1859497432553362016L)
        private a WB;

        @dy(field = 1350026703805630699L)
        private int fY;

        @dy(field = 505511047423624608L)
        private int jw;

        @dy(field = 1903633384320164112L)
        private OutputStream k2;

        @dy(field = 606513933204623205L)
        private byte[] mb;

        @dy(field = 574186784794800008L)
        private Object qp;

        @dy(field = -1786975574206493583L)
        @hy
        final /* synthetic */ vf w9;

        @dy(field = 5159130034577110185L)
        private boolean zh;

        @cy(clazz = -120385612213338735L, container = -120385612213338735L, user = true)
        private class a extends OutputStream {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            @dy(field = 239549784901856480L)
            final /* synthetic */ d WB;

            static {
                iy.Zo(a.class);
            }

            @ey(method = -539965008360063L)
            private a(d dVar) {
                try {
                    if (mb) {
                        iy.tp(-2249792973933113115L, null, dVar);
                    }
                    this.WB = dVar;
                } catch (Throwable th) {
                    if (jw) {
                        iy.j3(th, -2249792973933113115L, null, dVar);
                    }
                    throw th;
                }
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            @ey(method = 1785609361768822400L)
            public void close() {
                try {
                    if (mb) {
                        iy.gn(-1017336750159200128L, this);
                    }
                    synchronized (this.WB.qp) {
                        this.WB.AL = true;
                        this.WB.qp.notify();
                    }
                } catch (Throwable th) {
                    if (jw) {
                        iy.aM(th, -1017336750159200128L, this);
                    }
                    throw th;
                }
            }

            @ey(method = -1379161298007902956L)
            public void j6() {
                try {
                    if (mb) {
                        iy.gn(1382046774319839320L, this);
                    }
                    this.WB.interrupt();
                    if (this.WB.k2 != null) {
                        this.WB.k2.close();
                    }
                } catch (Throwable th) {
                    if (jw) {
                        iy.aM(th, 1382046774319839320L, this);
                    }
                    throw th;
                }
            }

            @Override // java.io.OutputStream
            @ey(method = 412015246771918532L)
            public void write(int i) {
                try {
                    if (mb) {
                        iy.u7(97712062145361960L, this, i);
                    }
                    synchronized (this.WB.qp) {
                        if (this.WB.zh) {
                            throw new InterruptedIOException();
                        }
                        this.WB.mb[this.WB.jw] = (byte) i;
                        this.WB.jw = (this.WB.jw + 1) % this.WB.mb.length;
                        if (this.WB.jw == this.WB.fY) {
                            byte[] bArr = new byte[this.WB.mb.length * 2];
                            System.arraycopy(this.WB.mb, this.WB.fY, bArr, this.WB.fY, this.WB.mb.length - this.WB.fY);
                            System.arraycopy(this.WB.mb, 0, bArr, this.WB.mb.length, this.WB.fY);
                            this.WB.jw = this.WB.mb.length + this.WB.fY;
                            this.WB.mb = bArr;
                        }
                        this.WB.qp.notify();
                    }
                } catch (Throwable th) {
                    if (jw) {
                        iy.j3(th, 97712062145361960L, this, new Integer(i));
                    }
                    throw th;
                }
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            @ey(method = 26290869262916480L)
            public /* synthetic */ a(d dVar, a aVar) {
                this(dVar);
                try {
                    if (mb) {
                        iy.EQ(439596837509699520L, null, dVar, aVar);
                    }
                } catch (Throwable th) {
                    if (jw) {
                        iy.Mr(th, 439596837509699520L, null, dVar, aVar);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(d.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = 7536405745359386856L)
        public d(vf vfVar, OutputStream outputStream) {
            super("Process In [" + vfVar.j6[0] + "]");
            try {
                a aVar = null;
                if (hK) {
                    iy.EQ(2580602789179259600L, null, vfVar, outputStream);
                }
                this.w9 = vfVar;
                this.WB = new a(this, aVar);
                this.mb = new byte[256];
                this.qp = new Object();
                this.k2 = outputStream;
            } catch (Throwable th) {
                if (cT) {
                    iy.Mr(th, 2580602789179259600L, null, vfVar, outputStream);
                }
                throw th;
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        @ey(method = -2382024219810695635L)
        public void run() throws IOException {
            byte b;
            boolean z;
            try {
                if (hK) {
                    iy.gn(-369431592813650448L, this);
                }
                while (true) {
                    try {
                        if (isInterrupted()) {
                            break;
                        }
                        synchronized (this.qp) {
                            if (this.jw == this.fY && !this.AL) {
                                this.qp.wait();
                            }
                            boolean z2 = false;
                            if (this.jw != this.fY) {
                                b = this.mb[this.fY];
                                int length = (this.fY + 1) % this.mb.length;
                                this.fY = length;
                                z = this.jw == length;
                            } else if (this.AL) {
                                b = 0;
                                z = false;
                                z2 = true;
                            }
                            if (this.k2 == null) {
                                continue;
                            } else if (z2) {
                                this.k2.close();
                                break;
                            } else {
                                this.k2.write(b);
                                if (z) {
                                    this.k2.flush();
                                }
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                synchronized (this.qp) {
                    this.zh = true;
                }
            } catch (Throwable th) {
                if (cT) {
                    iy.aM(th, -369431592813650448L, this);
                }
                throw th;
            }
        }

        @ey(method = -1358089233514371984L)
        public a we() {
            try {
                if (hK) {
                    iy.gn(2143137353993166375L, this);
                }
                return this.WB;
            } catch (Throwable th) {
                if (cT) {
                    iy.aM(th, 2143137353993166375L, this);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(vf.class);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @ey(method = 3784883813515869561L)
    public vf(String[] strArr, Map<String, String> map, String str, boolean z) {
        this(strArr);
        try {
            if (QX) {
                iy.J0(-406121450509460400L, null, strArr, map, str, new Boolean(z));
            }
            synchronized (this) {
                this.DW = map;
                this.Ws = z;
                if (str != null) {
                    File file = new File(str);
                    this.J8 = file;
                    if (!file.exists() || !this.J8.isDirectory()) {
                        this.J8 = null;
                    }
                }
            }
        } catch (Throwable th) {
            if (XL) {
                iy.a8(th, -406121450509460400L, null, strArr, map, str, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 317696244627746295L)
    public static /* synthetic */ int v5(vf vfVar) {
        int i = vfVar.VH;
        vfVar.VH = i - 1;
        return i;
    }

    @ey(method = -5063870417832296700L)
    public synchronized int J0() {
        try {
            if (QX) {
                iy.gn(-3933390470037522477L, this);
            }
        } catch (Throwable th) {
            if (XL) {
                iy.aM(th, -3933390470037522477L, this);
            }
            throw th;
        }
        return this.u7;
    }

    @ey(method = 935527663413672567L)
    public synchronized void J8() {
        try {
            if (QX) {
                iy.gn(-1763195182538995088L, this);
            }
            if (this.gn) {
                if (this.VH <= 0) {
                    return;
                }
                if (this.tp != null) {
                    this.tp.destroy();
                }
                this.VH = 0;
                try {
                    this.J0.j6();
                } catch (IOException unused) {
                }
                synchronized (this.v5) {
                    this.Zo = true;
                }
                notifyAll();
            }
        } finally {
        }
    }

    @ey(method = 5470974355919196621L)
    public synchronized void QX(OutputStream outputStream) {
        try {
            if (QX) {
                iy.tp(-5121600589192519520L, this, outputStream);
            }
            this.FH = outputStream;
        } catch (Throwable th) {
            if (XL) {
                iy.j3(th, -5121600589192519520L, this, outputStream);
            }
            throw th;
        }
    }

    @ey(method = -960724744534759520L)
    public synchronized void Ws(OutputStream outputStream) {
        try {
            if (QX) {
                iy.tp(-4025626262061997149L, this, outputStream);
            }
            this.Hw = outputStream;
        } catch (Throwable th) {
            if (XL) {
                iy.j3(th, -4025626262061997149L, this, outputStream);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ey(method = 892518659142599161L)
    public synchronized OutputStream XL() {
        try {
            if (QX) {
                iy.gn(-1121287333998411996L, this);
            }
            if (this.gn) {
                throw new IOException("Process has already been started.");
            }
            this.gn = true;
            try {
                ProcessBuilder processBuilder = new ProcessBuilder(this.j6);
                processBuilder.redirectErrorStream(this.Ws);
                processBuilder.directory(this.J8);
                if (this.DW != null) {
                    Map<String, String> mapEnvironment = processBuilder.environment();
                    HashMap map = new HashMap();
                    for (String str : mapEnvironment.keySet()) {
                        map.put(str.toUpperCase(Locale.US), str);
                    }
                    for (Map.Entry<String, String> entry : this.DW.entrySet()) {
                        try {
                            String upperCase = entry.getKey().toUpperCase(Locale.US);
                            if (map.containsKey(upperCase)) {
                                mapEnvironment.put(map.get(upperCase), entry.getValue());
                            } else {
                                mapEnvironment.put(entry.getKey(), entry.getValue());
                            }
                        } catch (IllegalArgumentException | UnsupportedOperationException unused) {
                        }
                    }
                }
                Process processStart = processBuilder.start();
                this.tp = processStart;
                this.EQ = processStart.getInputStream();
                this.we = this.tp.getErrorStream();
                this.VH = 3;
                a aVar = new a("Process Exit Value [" + this.j6[0] + "]");
                b bVar = new b("Process Out [" + this.j6[0] + "]");
                c cVar = new c("Process Err [" + this.j6[0] + "]");
                d dVar = new d(this, this.tp.getOutputStream());
                this.J0 = dVar.we();
                aVar.setDaemon(true);
                aVar.setPriority(5);
                aVar.start();
                bVar.setDaemon(true);
                bVar.setPriority(5);
                bVar.start();
                cVar.setDaemon(true);
                cVar.setPriority(5);
                cVar.start();
                dVar.setDaemon(true);
                dVar.setPriority(5);
                dVar.start();
            } catch (IOException unused2) {
                throw new IOException("Process could not be started.");
            }
        } catch (Throwable th) {
            if (XL) {
                iy.aM(th, -1121287333998411996L, this);
            }
            throw th;
        }
        return this.J0;
    }

    @ey(method = -1214348425647619127L)
    public synchronized void aM() {
        try {
            if (QX) {
                iy.gn(-316004360303675888L, this);
            }
            if (!this.gn || this.VH != 0) {
                wait();
            }
        } catch (Throwable th) {
            if (XL) {
                iy.aM(th, -316004360303675888L, this);
            }
            throw th;
        }
    }

    @ey(method = 974205147223711229L)
    public void finalize() {
        try {
            if (QX) {
                iy.gn(-862565052456196680L, this);
            }
            if (this.gn && this.VH > 0 && this.tp != null) {
                this.tp.destroy();
            }
        } catch (Throwable th) {
            if (XL) {
                iy.aM(th, -862565052456196680L, this);
            }
            throw th;
        }
    }

    @ey(method = -8000716539566216081L)
    public vf(String[] strArr) {
        try {
            if (QX) {
                iy.tp(1727226469120942320L, null, strArr);
            }
            this.Zo = false;
            synchronized (this) {
                this.j6 = strArr;
                this.u7 = -1;
                this.gn = false;
                this.VH = 0;
                this.FH = null;
                this.Hw = null;
                this.tp = null;
                this.DW = null;
                this.v5 = new Object();
            }
        } catch (Throwable th) {
            if (XL) {
                iy.j3(th, 1727226469120942320L, null, strArr);
            }
            throw th;
        }
    }
}
