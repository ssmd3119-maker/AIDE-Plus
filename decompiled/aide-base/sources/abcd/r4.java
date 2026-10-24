package abcd;

@cy(clazz = -431451251040535232L, container = -431451251040535232L, user = true)
/* loaded from: classes.dex */
public class r4 {

    @dy(field = 1851604470520814949L)
    private static Object DW;

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = 1863575866833605661L)
    private static long j6;

    @cy(clazz = -570162030021418635L, container = -431451251040535232L, user = true)
    static class a extends Thread {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -87326439402461484L)
        public a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        @ey(method = -505839303755303875L)
        public void run() {
            try {
                if (WB) {
                    iy.gn(-618672674677122000L, this);
                }
                while (!isInterrupted()) {
                    try {
                        synchronized (r4.DW) {
                            long unused = r4.j6 = System.currentTimeMillis();
                        }
                        Thread.sleep(100L);
                    } catch (InterruptedException unused2) {
                        return;
                    }
                }
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, -618672674677122000L, this);
                }
                throw th;
            }
        }
    }

    static {
        try {
            iy.Zo(r4.class);
            if (FH) {
                iy.gn(1505740036645125567L, null);
            }
            DW = new Object();
            a aVar = new a("Time getter");
            aVar.setPriority(1);
            aVar.start();
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 1505740036645125567L, null);
            }
            throw th;
        }
    }

    @ey(method = 1292283281711313225L)
    public r4() {
        try {
            if (FH) {
                iy.gn(-3510476266293760201L, null);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -3510476266293760201L, null);
            }
            throw th;
        }
    }

    @ey(method = -4338226126514399295L)
    public static long FH() {
        long j;
        try {
            if (FH) {
                iy.gn(-668219584164888381L, null);
            }
            synchronized (DW) {
                j = j6;
            }
            return j;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -668219584164888381L, null);
            }
            throw th;
        }
    }
}
