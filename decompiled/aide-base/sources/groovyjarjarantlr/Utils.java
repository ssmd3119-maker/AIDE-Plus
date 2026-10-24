package groovyjarjarantlr;

/* loaded from: classes.dex */
public class Utils {
    private static boolean DW = false;
    private static boolean j6 = true;

    static {
        if ("true".equalsIgnoreCase(System.getProperty("ANTLR_DO_NOT_EXIT", "false"))) {
            j6 = false;
        }
        if ("true".equalsIgnoreCase(System.getProperty("ANTLR_USE_DIRECT_CLASS_LOADING", "false"))) {
            DW = true;
        }
    }

    public static Class DW(String str) {
        try {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            return (DW || contextClassLoader == null) ? Class.forName(str) : contextClassLoader.loadClass(str);
        } catch (Exception unused) {
            return Class.forName(str);
        }
    }

    public static void j6(String str) {
        if (j6) {
            System.exit(1);
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ANTLR Panic: ");
        stringBuffer.append(str);
        throw new RuntimeException(stringBuffer.toString());
    }
}
