package abcd;

import java.io.File;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.TimeZone;

/* loaded from: classes.dex */
public abstract class og0 {
    static final /* synthetic */ boolean DW = false;
    private static og0 j6 = new a();

    class a extends og0 {
        private volatile String FH;

        /* renamed from: abcd.og0$a$a, reason: collision with other inner class name */
        class C0008a extends ia0 {
            public C0008a(a aVar, File file, wf0 wf0Var) {
                super(file, wf0Var);
            }

            @Override // abcd.ia0
            public void Mz() {
            }

            @Override // abcd.ia0
            public boolean g3() {
                return false;
            }
        }

        @Override // abcd.og0
        public String DW() {
            if (this.FH == null) {
                try {
                    this.FH = InetAddress.getLocalHost().getCanonicalHostName();
                } catch (UnknownHostException unused) {
                    this.FH = "localhost";
                }
                if (!og0.DW && this.FH == null) {
                    throw new AssertionError();
                }
            }
            return this.FH;
        }

        @Override // abcd.og0
        public String Hw(String str) {
            return System.getProperty(str);
        }

        @Override // abcd.og0
        public String VH(String str) {
            return System.getenv(str);
        }

        @Override // abcd.og0
        public int Zo(long j) {
            return v5().getOffset(j) / 60000;
        }

        @Override // abcd.og0
        public ia0 gn(q60 q60Var, wf0 wf0Var) {
            File fileV5 = wf0Var.v5();
            return fileV5 == null ? new C0008a(this, null, wf0Var) : new ia0(q60Var, wf0Var.VH(wf0Var.VH(fileV5, "etc"), "gitconfig"), wf0Var);
        }

        @Override // abcd.og0
        public long j6() {
            return System.currentTimeMillis();
        }

        @Override // abcd.og0
        public ia0 u7(q60 q60Var, wf0 wf0Var) {
            return new ia0(q60Var, new File(wf0Var.J8(), ".gitconfig"), wf0Var);
        }
    }

    public static og0 FH() {
        return j6;
    }

    public static void tp(og0 og0Var) {
        j6 = og0Var;
    }

    public abstract String DW();

    public abstract String Hw(String str);

    public abstract String VH(String str);

    public abstract int Zo(long j);

    public abstract ia0 gn(q60 q60Var, wf0 wf0Var);

    public abstract long j6();

    public abstract ia0 u7(q60 q60Var, wf0 wf0Var);

    public TimeZone v5() {
        return TimeZone.getDefault();
    }
}
