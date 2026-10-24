package abcd;

@cy(clazz = -2336931703340600933L, container = -2336931703340600933L, user = true)
/* loaded from: classes.dex */
public interface o8 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    @cy(clazz = -1032729843049214907L, container = -1032729843049214907L, user = true)
    public static final class a {

        @dy(field = -1145309667987801600L)
        public static final a ANDROID;

        @dy(field = 2568739309061526433L)
        public static final a JAVA;

        @dy(field = -2780719700435973340L)
        public static final a JAVASCRIPT;

        @dy(field = -779476132126366584L)
        public static final a WEBSITE;

        @fy
        private static /* synthetic */ boolean k2;

        @dy(field = -2054168613093377925L)
        private static final /* synthetic */ a[] qp;

        @gy
        private static /* synthetic */ boolean zh;

        static {
            try {
                iy.Zo(a.class);
                if (k2) {
                    iy.gn(1952775956320630320L, null);
                }
                ANDROID = new a("ANDROID", 0);
                JAVA = new a("JAVA", 1);
                WEBSITE = new a("WEBSITE", 2);
                a aVar = new a("JAVASCRIPT", 3);
                JAVASCRIPT = aVar;
                qp = new a[]{ANDROID, JAVA, WEBSITE, aVar};
            } catch (Throwable th) {
                if (zh) {
                    iy.aM(th, 1952775956320630320L, null);
                }
                throw th;
            }
        }

        @ey(method = -21109671708643977L)
        private a(String str, int i) {
            try {
                if (k2) {
                    iy.EQ(-1469245076757936909L, null, str, new Integer(i));
                }
            } catch (Throwable th) {
                if (zh) {
                    iy.Mr(th, -1469245076757936909L, null, str, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 781723683754981120L)
        public static a valueOf(String str) {
            try {
                if (k2) {
                    iy.tp(-125781036344767424L, null, str);
                }
                return (a) Enum.valueOf(a.class, str);
            } catch (Throwable th) {
                if (zh) {
                    iy.j3(th, -125781036344767424L, null, str);
                }
                throw th;
            }
        }

        @ey(method = 1726956281553606000L)
        public static a[] values() {
            try {
                if (k2) {
                    iy.gn(438565460104147908L, null);
                }
                return (a[]) qp.clone();
            } catch (Throwable th) {
                if (zh) {
                    iy.aM(th, 438565460104147908L, null);
                }
                throw th;
            }
        }
    }

    @ey(method = 3791098801844653681L)
    a VH();

    @ey(method = -908627458377411249L)
    int j6();
}
